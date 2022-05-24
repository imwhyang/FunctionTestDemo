package com.wayne.testsdk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.blankj.utilcode.util.GsonUtils
import com.google.gson.Gson
import com.innovation.animal.breedfunctionsdk.SDK
import com.innovation.animal.breedfunctionsdk.bean.CreatInsuredEntranceBean
import com.wayne.testsdk.databinding.ActivityInsureBinding

/**
 *@Author : wenhaiyang
 *@Date : 2022/5/24
 *@Name : InsureActivity
 *@Desc:
 */
class InsureActivity : AppCompatActivity() {
    private lateinit var binder: ActivityInsureBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = ActivityInsureBinding.inflate(layoutInflater)
        setContentView(binder.root)

        binder.apply {

//            SDK.insuredEntrance(
//                GsonUtils.fromJson(
//                    """
//        {"deptCode": "3210606CIC/20220517ZBNXB",
//        "deptName": "中华联合保险/总部农险部",
//        "insuranceId":"1484363556864941021",
//        "riskCode":"170203"
//        ,"riskName":"中华育肥猪险",
//        "clauseCode":"256314",
//        "clauseName":"中华育肥猪测试默认条款",
//        "animalType":1,
//        "livestockBreeds":204,
//        "insuranceMethod":"1",
//        ,"enId":"1476095381895411011",
//        ,"enName":"温海洋测试兴企业1",
//        ,"breedMethod":"1"
//        ,"createUserId":"1483369549313626113",
//        ,"createUserName":"温海洋"
//        ,"longitude": "116.414777",
//        "latitude": "40.03988"
//        ,"address": "中国北京朝阳立水桥office",
//        ,"province": "北京市"
//        ,"city": "北京市"
//        ,"county": "朝阳区",
//        ,"town": "北苑路"
//        ,"village": "立水桥"
//        }
//        """.trimIndent(), CreatInsuredEntranceBean::class.java
//                ), this@InsureActivity
//            )
            btnInsure.setOnClickListener {

                val bean = CreatInsuredEntranceBean()
                bean.deptCode = "3210606CIC/20220517ZBNXB"
                bean.deptName = "中华联合保险/总部农险部"
//                bean.insuranceId = "1484363556864941021"
                bean.insuranceId = edtInsuranceId.text.toString()
//                bean.riskCode = "170203"
//                bean.riskName = "中华育肥猪险"
//                bean.clauseCode = "256314"
//                bean.clauseName = "中华育肥猪测试默认条款"
//                bean.animalType = 1
//                bean.livestockBreeds = 204
                bean.riskCode = edtRiskCode.text.toString()
                bean.riskName = edtRiskName.text.toString()
                bean.clauseCode = edtClauseCode.text.toString()
                bean.clauseName = edtClauseName.text.toString()
                bean.animalType = edtAnimalType.text.toString().toInt()
                bean.livestockBreeds = edtLivestockBreeds.text.toString().toInt()
                bean.insuranceMethod = 1

//                bean.enId = "1476095381895411011"
//                bean.enName = "温海洋测试兴企业1"
                bean.enId = edtEnId.text.toString()
                bean.enName = edtEnName.text.toString()
                bean.breedMethod = "1"
                bean.createUserId = edtCreateUserId.text.toString()
                bean.createUserName = edtCreateUserName.text.toString()
//                bean.createUserId = "1483369549313626113"
//                bean.createUserName = "温海洋"
                bean.longitude = 116.414777
                bean.latitude = 40.03988
                bean.address = "中国北京朝阳立水桥office"
                bean.province = "北京市"
                bean.city = "北京市"
                bean.county = "朝阳区"
                bean.town = "北苑路"
                bean.village = "立水桥"

                SDK.insuredEntrance(
                    bean, this@InsureActivity
                )
            }
        }

    }
}