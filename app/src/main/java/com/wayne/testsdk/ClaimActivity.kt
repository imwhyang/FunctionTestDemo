package com.wayne.testsdk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.blankj.utilcode.util.GsonUtils
import com.innovation.animal.breedfunctionsdk.SDK
import com.innovation.animal.breedfunctionsdk.bean.CasesCallbackBean
import com.innovation.animal.breedfunctionsdk.bean.GyicInsuredEntranceBean
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
//                兴农保
                bean.deptCode = "3210606CIC/20220517ZBNXB"
                bean.deptName = "中华联合保险/总部农险部"


//                安华
//                bean.deptCode = "3210707AHBX/22010000"
//                bean.deptName = "安华保险/安华农业保险股份有限公司长春中心支公司"

//                bean.policyNo = edtInsuranceId.text.toString()
//                bean.caseNo = edtCaseNo.text.toString()
//                bean.animalType = edtAnimalType.text.toString().toInt()
//                bean.enId = edtEnId.text.toString()
//                bean.enName = edtEnName.text.toString()
//                bean.createUserId = edtCreateUserId.text.toString()
//                bean.createUserName = edtCreateUserName.text.toString()


//                "{\"accdntReasonName\":\"自然灾害\"," +
//                        "\"accdntTime\":1645600080000," +
//                        "\"address\":\"吉林省长春市九台区其塔木镇北山村\"," +
//                        "\"animalId\":\"1503895507594416129\"," +
//                        "\"caseNo\":\"RIJR202222010000000008\"," +
//                        "\"caseUserName\":\"李傲冬\"," +
//                        "\"createUserId\":\"0000012227\"," +
//                        "\"createUserName\":\"薛雁鸣\"," +
//                        "\"deptCode\":\"3210707AHBX/22010000\"," +
//                        "\"deptName\":\"安华保险/安华农业保险股份有限公司长春中心支公司\"," +
//                        "\"dieNum\":1," +
//                        "\"enId\":\"1\"," +
//                        "\"enName\":\"李傲冬\"," +
//                        "\"latitude\":40.039841," +
//                        "\"longitude\":116.414749," +
//                        "\"policyNo\":\"PIJR202222010000000002\"}"

//                bean.policyNo = "PIJR202222010000000002"
//                bean.caseNo = "RIJR202222010000000008"
//                bean.animalType = 2
//                bean.enId = "1"
//                bean.enName = "李傲冬"
//                bean.createUserId = "0000012227"
//                bean.createUserName = "李傲冬"



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