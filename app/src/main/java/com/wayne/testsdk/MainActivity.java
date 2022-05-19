package com.wayne.testsdk;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.LogUtils;
import com.bumptech.glide.Glide;
import com.hjq.permissions.Permission;
import com.innovation.animal.breedfunctionsdk.SDK;
import com.innovation.animal.breedfunctionsdk.bean.CasesCallbackBean;
import com.innovation.animal.breedfunctionsdk.bean.CreatInsuredEntranceBean;
import com.innovation.animal.breedfunctionsdk.bean.LengthWeightResultBean;
import com.innovation.animal.breedfunctionsdk.bean.PointsResultBean;
import com.innovation.animal.breedfunctionsdk.callback.BusinessListener;
import com.innovation.animal.breedfunctionsdk.callback.LoadingListener;
import com.innovation.animal.breedfunctionsdk.utils.DialogUtil;
import com.innovation.animal.breedfunctionsdk.utils.ToastUtils;
import com.innovation.animal.breedfunctionsdk.widget.LoadingView;

import java.util.ArrayList;
import java.util.List;

import timber.log.Timber;


public class MainActivity extends AppCompatActivity {

    @SuppressLint("CheckResult")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SDK.init(getApplication());
        EditText edt = findViewById(R.id.tv_title);
        edt.setText("1484363556864942082");
        Button btn = findViewById(R.id.btn_test);
        Button claim = findViewById(R.id.btn_claim);
        Button length = findViewById(R.id.btn_length);
        List<String> strings = new ArrayList<>();
        strings.add(Permission.ACCESS_FINE_LOCATION);
        strings.add(Permission.ACCESS_COARSE_LOCATION);
        if (getApplicationInfo().targetSdkVersion >= 30) {
            strings.add(Permission.MANAGE_EXTERNAL_STORAGE);
        } else {
            strings.add(Permission.READ_EXTERNAL_STORAGE);
            strings.add(Permission.WRITE_EXTERNAL_STORAGE);
        }

        findViewById(R.id.btn_test_deadpig).setOnClickListener(v -> {
        });
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
            @Override
            public void sendInsureResult(String insureId, String enId) {
                super.sendInsureResult(insureId, enId);
            }

            @Override
            public void insuredEntranceResult(String animalId, String earLabNo) {
                super.insuredEntranceResult(animalId, earLabNo);
            }

            @Override
            public void deleteAnimalResult(String mes) {
                super.deleteAnimalResult(mes);
            }

            @Override
            public void errorResult(String error) {
                super.errorResult(error);
            }

            @Override
            public void scanFaceResult(String animalId) {
                Timber.d("scanFaceResult: bean==" + animalId);
            }

            @Override
            public void lengthWeightResult(LengthWeightResultBean bean) {
                Timber.d("lengthWeightResult: bean==" + bean.toString());
                ToastUtils.success(bean.toString());
            }

            @Override
            public void checkPositioningBarResult(String pointsVideoUrl, int pointNumber) {
                Timber.d("checkPositioningBarResult: " + "点数视频路径==" + pointsVideoUrl + "      猪头数==" + pointNumber);
                ToastUtils.success("点数视频路径==" + pointsVideoUrl + "      猪头数==" + pointNumber);
            }

            @Override
            public void checkNumberResult(ArrayList<PointsResultBean> mNumList) {
                Timber.d("checkNumberResult: ===" + mNumList.toString());
                ToastUtils.success("点数数据有" + mNumList.size() + "个");
            }

            @Override
            public void insuredEntrance(String msg) {
                ToastUtils.success(msg);
            }

            @Override
            public void gyicBiometricsResult(boolean isRepeat, String earLabNo, String similarity, String repeatPolicyNo, String repeatCaseNo, String repeatEarLabNo) {
                LogUtils.e("gyicBiometricsResult: " + earLabNo, isRepeat);
            }
        });
        length.setOnClickListener(v -> {
            SDK.claimLengthWeightEntrance(MainActivity.this, GsonUtils.fromJson(
                    edt.getText().toString()
//                    "{\"caseNo\":\"T2022130012170073\"," +
//                            "\"policyNo\": \"PIYA20201310N000000030\"," +
//                            "\"enId\": \"132827197101242540\"," +
//                            "\"enName\": \"薛永红\"," +
//                            "\"dieNum\": 1," +
//                            "\"accdntTime\": \"1645686735\"," +
//                            "\"accdntReasonName\": \"出险\"," +
//                            "\"longitude\": \"114.497536\"," +
//                            "\"latitude\": \"38.04095\"," +
//                            "\"address\": \"中国河北省石家庄市桥东区胜利南路64号附5号\"," +
//                            "\"province\": \"河北省\"," +
//                            "\"city\": \"石家庄市\"," +
//                            "\"county\": \"测试\"," +
//                            "\"town\": \"测试\"," +
//                            "\"village\": \"测试\"," +
//                            "\"deptCode\": \"00000000/13000000/13010000\"," +
//                            "\"deptName\": \"总公司/河北省分公司/石家庄市分公司\"," +
//                            "\"createUserId\":  \"lishaoru\"," +
//                            "\"caseUserName\":  \"李绍儒\"," +
//                            "\"createUserName\":  \"李绍儒\"}"
                    , CasesCallbackBean.class));
        });
        claim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                理赔
                SDK.casesCallback(MainActivity.this, GsonUtils.fromJson(

                        "{" +
                                "\"deptCode\": \"00000000/13000000/13010000\",\n" +
                                "\"deptName\": \"总公司/河北省分公司/石家庄市分公司\",\n" +
                                "\"caseNo\":\"T2022130012391967\"," +
                                "\"policyNo\": \"PIYA201413120000000005\"," +
                                "\"enId\": \"130230196808082738\"," +
                                "\"enName\": \"张献书\"," +
                                "\"caseUserName\":  \"李绍儒\"," +
                                "\"createUserName\":  \"李绍儒\"," +
                                "\"createUserId\":\"lishaoru\"," +
                                "\"longitude\": \"114.497536\"," +
                                "\"latitude\": \"38.04095\"," +
                                "\"address\": \"中国河北省石家庄市桥东区胜利南路64号附5号\"," +
                                "\"province\": \"河北省\"," +
                                "\"city\": \"石家庄市\"," +
                                "\"county\": \"测试\"," +
                                "\"town\": \"测试\"," +
                                "\"village\": \"测试\"," +
                                "\"dieNum\": \"1\"," +
                                "\"accdntTime\": \"1650356662\"" +
                                "}"

                        , CasesCallbackBean.class));

            }
        });
        btn.setOnClickListener(v -> {
            SDK.insuredEntrance(GsonUtils.fromJson(
                    "{\"address\":\".\"," +
                            "\"animalType\":1," +
                            "\"breedMethod\":\"1\"," +
                            "\"cameraCountType\":2," +
                            "\"clauseCode\":\"63\"," +
                            "\"clauseName\":\"育肥母猪2020条款\"," +
                            "\"city\":\"长春市\"," +
                            "\"county\":\"双阳区\"," +
                            "\"createUserId\":\"1483369549313626113\"," +
                            "\"createUserName\":\"温海洋\"," +
                            "\"deptCode\":\"3210707AHBX/22010000\"," +
                            "\"deptName\":\"安华保险/安华农业保险股份有限公司长春中心支公司养殖业保险部\"," +
                            "\"enId\":\"1476095381895401474\",\"enName\":\"温海洋测试企业1\"," +
                            "\"enterprisesId\":\"1476095381895401474\"," +
                            "\"enterprisesNames\":\"温海洋测试企业1\"," +
                            "\"insuranceId\":" + edt.getText().toString() + "," +
//                            "\"insuranceId\":\"1484363556864942083\"," +
                            "\"insuranceMethod\":\"1\"," +
                            "\"insuranceName\":\"温海洋测试企业1\"," +
                            "\"insureValidate\":1," +
                            "\"latitude\":40.039872," +
                            "\"linkName\":\"李梦奇\"," +
                            "\"linkPhone\":\"13466571072\"," +
                            "\"livestockBreeds\":203," +
                            "\"longitude\":116.414758," +
                            "\"province\":\"吉林省\"," +
                            "\"riskCode\":\"IJR\"," +
                            "\"riskName\":\"吉林省地方财政肉牛养殖保险（中央奖补适用）\"," +
                            "\"statementCode\":\"0001\"," +
                            "\"statementName\":\"肉牛\"," +
                            "\"town\":\"山河街道\"," +
                            "\"village\":\"村\"}", CreatInsuredEntranceBean.class), this);
        });
    }

}