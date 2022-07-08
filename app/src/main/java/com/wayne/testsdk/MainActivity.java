package com.wayne.testsdk;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hjq.permissions.Permission;
import com.innovation.animal.breedfunctionsdk.SDK;
import com.innovation.animal.breedfunctionsdk.bean.LengthWeightResultBean;
import com.innovation.animal.breedfunctionsdk.bean.PointsResultBean;
import com.innovation.animal.breedfunctionsdk.callback.BusinessListener;
import com.innovation.animal.breedfunctionsdk.callback.LoadingListener;
import com.innovation.animal.breedfunctionsdk.utils.DialogUtil;
import com.innovation.animal.breedfunctionsdk.utils.ToastUtils;
import com.innovation.animal.breedfunctionsdk.widget.LoadingView;
import com.wayne.testsdk.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binder;

    @SuppressLint("CheckResult")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binder = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binder.getRoot());
        SDK.init(getApplication());
        List<String> strings = new ArrayList<>();
        strings.add(Permission.ACCESS_FINE_LOCATION);
        strings.add(Permission.ACCESS_COARSE_LOCATION);
        if (getApplicationInfo().targetSdkVersion >= 30) {
            strings.add(Permission.MANAGE_EXTERNAL_STORAGE);
        } else {
            strings.add(Permission.READ_EXTERNAL_STORAGE);
            strings.add(Permission.WRITE_EXTERNAL_STORAGE);
        }

        SDK.setLoadingListener(new LoadingListener() {
            @Override
            public void showLoading() {
                DialogUtil.getInstance().show(MainActivity.this, new LoadingView(MainActivity.this));
            }

            @Override
            public void hideLoading() {
                DialogUtil.getInstance().dismiss();
            }
        });
        SDK.setBusinessListener(new BusinessListener() {
//            @Override
//            public void sendInsureResult(String insureId, String enId) {
//                super.sendInsureResult(insureId, enId);
//            }

//            @Override
//            public void insuredEntranceResult(String animalId, String earLabNo) {
//                super.insuredEntranceResult(animalId, earLabNo);
//            }

//            @Override
//            public void deleteAnimalResult(String mes) {
//                super.deleteAnimalResult(mes);
//            }

//            @Override
//            public void errorResult(String error) {
//                super.errorResult(error);
//            }

//            @Override
//            public void scanFaceResult(String animalId) {
////                Timber.d("scanFaceResult: bean==" + animalId);
//            }
//
//            @Override
//            public void lengthWeightResult(LengthWeightResultBean bean) {
////                Timber.d("lengthWeightResult: bean==" + bean.toString());
//                ToastUtils.success(bean.toString());
//            }
//
//            @Override
//            public void checkPositioningBarResult(String pointsVideoUrl, int pointNumber) {
////                Timber.d("checkPositioningBarResult: " + "点数视频路径==" + pointsVideoUrl + "      猪头数==" + pointNumber);
//                ToastUtils.success("点数视频路径==" + pointsVideoUrl + "      猪头数==" + pointNumber);
//            }
//
//            @Override
//            public void checkNumberResult(ArrayList<PointsResultBean> mNumList) {
////                Timber.d("checkNumberResult: ===" + mNumList.toString());
//                ToastUtils.success("点数数据有" + mNumList.size() + "个");
//            }
//
//            @Override
//            public void insuredEntrance(String msg) {
//                ToastUtils.success(msg);
//            }


            @Override
            public void onCheckNumberResult(ArrayList<PointsResultBean> mNumList) {
                super.onCheckNumberResult(mNumList);
            }

            @Override
            public void onSendInsureResult(String insureId, String enId) {
                super.onSendInsureResult(insureId, enId);
            }

            @Override
            public void onSendCasesResult(String caseId) {
                super.onSendCasesResult(caseId);
            }

            @Override
            public void onCheckPositioningBarResult(String pointsVideoUrl, int pointNumber) {
                super.onCheckPositioningBarResult(pointsVideoUrl, pointNumber);
            }

            @Override
            public void onLengthWeightResult(LengthWeightResultBean bean) {
                super.onLengthWeightResult(bean);
            }

            @Override
            public void onInsuredEntrance(String msg) {
                super.onInsuredEntrance(msg);
            }

            @Override
            public void onInsuredEntranceResult(String animalId, String earLabNo) {
                super.onInsuredEntranceResult(animalId, earLabNo);
            }

            @Override
            public void onScanFaceResult(String animalId) {
                super.onScanFaceResult(animalId);
            }

            @Override
            public void onDeleteAnimalResult(String mes) {
                super.onDeleteAnimalResult(mes);
            }

            @Override
            public void onErrorResult(String error) {
                super.onErrorResult(error);
            }
        });

        binder.btnInsure.setOnClickListener(v -> {
            Intent intent = new Intent(this, InsureActivity.class);
            startActivity(intent);
        });
        binder.btnClaim.setOnClickListener(v -> {
            Intent intent = new Intent(this, ClaimActivity.class);
            startActivity(intent);
        });
    }

}