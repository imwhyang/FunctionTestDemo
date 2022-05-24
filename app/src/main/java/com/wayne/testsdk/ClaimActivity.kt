package com.wayne.testsdk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.innovation.animal.breedfunctionsdk.SDK
import com.innovation.animal.breedfunctionsdk.bean.CasesCallbackBean
import com.wayne.testsdk.databinding.ActivityClaimBinding

/**
 *@Author : wenhaiyang
 *@Date : 2022/5/24
 *@Name : InsureActivity
 *@Desc:
 */
class ClaimActivity : AppCompatActivity() {
    private lateinit var binder: ActivityClaimBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = ActivityClaimBinding.inflate(layoutInflater)
        setContentView(binder.root)

        binder.apply {
//            SDK.casesCallback(this, GsonUtils.fromJson(
//                "{" +
//                        "\"animalType\":1," +
//                        "\"deptCode\": \"3210606CIC/20220517ZBNXB\",\n" +
//                        "\"deptName\": \"中华联合保险/总部农险部\",\n" +
//                        "\"caseNo\":\"T20220519001\"," +
//                        "\"policyNo\": \"2022051903469568\"," +
//                        "\"enId\": \"1476095381895401474\"," +
//                        "\"enName\": \"温海洋测试兴企业1\"," +
//                        "\"createUserId\":  \"1483369549313626113\"," +
//                        "\"createUserName\":  \"温海洋\"," +
//                        "\"caseUserName\":  \"温海洋报案\"," +
//                        "\"longitude\": \"116.414777\"," +
//                        "\"latitude\": \"40.03988\"," +
//                        "\"address\": \"中国北京朝阳立水桥office\"," +
//                        "\"province\": \"北京市\"," +
//                        "\"city\": \"北京市\"," +
//                        "\"county\": \"朝阳区\"," +
//                        "\"town\": \"北苑路\"," +
//                        "\"village\": \"立水桥\"" +
//                        "}"


            btnInsure.setOnClickListener {

                val bean = CasesCallbackBean()
                bean.deptCode = "3210606CIC/20220517ZBNXB"
                bean.deptName = "中华联合保险/总部农险部"
//                bean.insuranceId = "1484363556864941021"
                bean.policyNo = edtInsuranceId.text.toString()
                bean.caseNo = edtCaseNo.text.toString()
//                bean.riskCode = edtRiskCode.text.toString()
//                bean.riskName = edtRiskName.text.toString()
//                bean.clauseCode = edtClauseCode.text.toString()
//                bean.clauseName = edtClauseName.text.toString()
                bean.animalType = edtAnimalType.text.toString().toInt()
//                bean.livestockBreeds = edtLivestockBreeds.text.toString().toInt()
//                bean.insuranceMethod = 1
                bean.enId = edtEnId.text.toString()
                bean.enName = edtEnName.text.toString()
                bean.createUserId = edtCreateUserId.text.toString()
                bean.createUserName = edtCreateUserName.text.toString()
                bean.longitude = 116.414777
                bean.latitude = 40.03988
                bean.address = "中国北京朝阳立水桥office"
                bean.province = "北京市"
                bean.city = "北京市"
                bean.county = "朝阳区"
                bean.town = "北苑路"
                bean.village = "立水桥"

                SDK.casesCallback(
                    this@ClaimActivity, bean
                )
            }
        }

    }
}