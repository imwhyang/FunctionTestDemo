package com.wayne.testsdk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.blankj.utilcode.util.GsonUtils
import com.bumptech.glide.Glide
import com.innovation.animal.breedfunctionsdk.SDK
import com.innovation.animal.breedfunctionsdk.bean.CreatInsuredEntranceBean
import com.innovation.animal.breedfunctionsdk.enumtype.FaceTimesInsureEnum
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

                //猪
                bean.insuranceId = "1484363556864943204"
                bean.riskCode = "170203"
                bean.riskName = "中华育肥猪险"
                bean.clauseCode = "256314"
                bean.clauseName = "中华育肥猪测试默认条款"
                bean.animalType = 1
                bean.livestockBreeds = 204
                bean.enId = "1476095381895411011"
                bean.enName = "温海洋测试兴企业1"
                bean.createUserId = "1483369549313626113"
                bean.createUserName = "温海洋"
                bean.standardInspectionWay = FaceTimesInsureEnum.FACE_TIMES_CAN_MULTIPLY.code

                bean.insuranceMethod = 1
                bean.breedMethod = "1"
                bean.longitude = 116.414777
                bean.latitude = 40.03988
                bean.address = "中国北京朝阳立水桥office"
                bean.province = "北京市"
                bean.city = "北京市"
                bean.county = "朝阳区"
                bean.town = "北苑路"
                bean.village = "立水桥"

//                SDK.insuredEntrance(
//                    bean, this@InsureActivity
//                )
                SDK.insuredEntrance(
                    GsonUtils.fromJson(
                        "{\"address\":\"湖北省黄石市黄石港区黄石港街道办事处新街社区居委会\",\"animalType\":1,\"breedMethod\":\"1\",\"cameraCountType\":2,\"city\":\"黄石市\",\"clauseCode\":\"1937002\",\"clauseName\":\"中华财险山东省中央财政能繁母猪养殖保险\",\"county\":\"黄石港区\",\"createUserId\":\"guoyan009\",\"createUserName\":\"郭艳\",\"deptCode\":\"3210606CIC/37/3711/371103/37110303\",\"deptName\":\"中华联合保险/山东分公司/日照中支/东港支公司/东港农网业务\",\"enId\":\"2717\",\"enName\":\"测试用户\",\"insuranceId\":\"Y202206000000985\",\"insuranceMethod\":1,\"insuranceName\":\"测试用户\",\"insureValidate\":0,\"latitude\":39.864187,\"livestockBreeds\":204,\"longitude\":116.329173,\"province\":\"湖北省\",\"riskCode\":\"170202\",\"riskName\":\"能繁母猪保险\",\"standardInspectionWay\":13,\"town\":\"黄石港街道办事处\",\"village\":\"新街社区\"}",
                        CreatInsuredEntranceBean::class.java
                    ), this@InsureActivity
                )
            }
            btnInsureCow.setOnClickListener {
                val bean = CreatInsuredEntranceBean()
                bean.deptCode = "3210606CIC/20220517ZBNXB"
                bean.deptName = "中华联合保险/总部农险部"

                //                安华
//                bean.deptCode = "3210707AHBX/22010000"
//                bean.deptName = "安华保险/安华农业保险股份有限公司长春中心支公司"
//猪
//                bean.insuranceId = "1484363556864943204"
//                bean.riskCode = "170203"
//                bean.riskName = "中华育肥猪险"
//                bean.clauseCode = "256314"
//                bean.clauseName = "中华育肥猪测试默认条款"
//                bean.animalType = 1
//                bean.livestockBreeds = 204
//                bean.enId = "1476095381895411011"
//                bean.enName = "温海洋测试兴企业1"
//                bean.createUserId = "1483369549313626113"
//                bean.createUserName = "温海洋"
//                bean.standardInspectionWay =FaceTimesInsureEnum.FACE_TIMES_CAN_MULTIPLY.code
//                牛
                bean.insuranceId = "1484363556864952102"
                bean.riskCode = "170103"
                bean.riskName = "中华肉牛保险"
                bean.clauseCode = "1941002"
                bean.clauseName = "中华财险河南省商业性农产品目标价格保险"
                bean.animalType = 2
                bean.livestockBreeds = 204
                bean.enId = "1476095381895401474"
                bean.enName = "xiat测试企业1"
                bean.createUserId = "1483369549313626113"
                bean.createUserName = "xiat测试"
                bean.standardInspectionWay = FaceTimesInsureEnum.FACE_TIMES_LOSE_FACE.code

//                bean.insuranceId = edtInsuranceId.text.toString()
//                bean.riskCode = edtRiskCode.text.toString()
//                bean.riskName = edtRiskName.text.toString()
//                bean.clauseCode = edtClauseCode.text.toString()
//                bean.clauseName = edtClauseName.text.toString()
//                bean.animalType = edtAnimalType.text.toString().toInt()
//                bean.livestockBreeds = edtLivestockBreeds.text.toString().toInt()
//                bean.enId = edtEnId.text.toString()
//                bean.enName = edtEnName.text.toString()
//                bean.createUserId = edtCreateUserId.text.toString()
//                bean.createUserName = edtCreateUserName.text.toString()


                bean.insuranceMethod = 1
                bean.breedMethod = "1"
                bean.longitude = 116.414777
                bean.latitude = 40.03988
                bean.address = "中国北京朝阳立水桥office"
                bean.province = "北京市"
                bean.city = "北京市"
                bean.county = "朝阳区"
                bean.town = "北苑路"
                bean.village = "立水桥"

//                SDK.insuredEntrance(
//                    bean, this@InsureActivity
//                )

                SDK.insuredEntrance(
                    GsonUtils.fromJson(
                        "{\"address\":\"山东省滨州市博兴县博昌街道皂户村委会\",\"animalType\":2," +
                                "\"breedMethod\":\"1\",\"cameraCountType\":2,\"city\":\"滨州市\"," +
                                "\"clauseCode\":\"0837001\",\"clauseName\":\"山东省中央财政奶牛养殖保险\"," +
                                "\"county\":\"博兴县\",\"createUserId\":\"1530133256492060673\",\"createUserName\":\"姜向阳\"," +
                                "\"deptCode\":\"3210606CIC/37/3707/370709/37070900\"," +
                                "\"deptName\":\"中华联合保险/山东分公司/潍坊中支/临朐支公司/临朐支公司\"," +
                                "\"enId\":\"1076\",\"enName\":\"测试有限公司集团有限公司集团研发中心农场\"," +
                                "\"insuranceId\":\"Y202206000000103\"," +
                                "\"insuranceMethod\":1,\"insuranceName\":\"是猪\"," +
                                "\"insureValidate\":0,\"latitude\":39.864191," +
                                "\"livestockBreeds\":204,\"longitude\":116.329179," +
                                "\"province\":\"山东省\",\"riskCode\":\"170202\"," +
                                "\"riskName\":\"奶牛保险\",\"town\":\"博昌街道\"," +
                                "\"standardInspectionWay\":13," +
                                "\"village\":\"皂户村\"}"


//                        "{\"address\":\"山东省济南市槐荫区道德街街道南大槐树西街社区\",\"animalType\":2," +
//                                "\"baodanNo\":\"Y202206000000103\",\"breedMethod\":1," +
//                                "\"city\":\"济南市\",\"clauseCode\":\"0837001\"," +
//                                "\"clauseName\":\"山东省中央财政奶牛养殖保险\"," +
//                                "\"county\":\"槐荫区\",\"createUserId\":\"1530133256492060673\"," +
//                                "\"createUserName\":\"姜向阳\"," +
//                                "\"deptCode\":\"3210606CIC/37/3707/370709/37070900\"," +
//                                "\"deptName\":\"中华联合保险/山东分公司/潍坊中支/临朐支公司/临朐支公司\"," +
//                                "\"enterprisesId\":\"1076\"," +
//                                "\"enterprisesNames\":\"测试有限公司集团有限公司集团研发中心农场\"," +
//                                "\"insuranceMethod\":1,\"insuranceName\":\"测试有限公司集团有限公司集团研发中心农场\"," +
//                                "\"insureValidate\":0,\"province\":\"山东省\"," +
//                                "\"riskCode\":\"170102\",\"riskName\":\"奶牛保险\"," +
//                                "\"standardInspectionWay\":13,\"town\":\"道德街街道\",\"village\":\"南大槐树西街社区\"}"
                        ,
                        CreatInsuredEntranceBean::class.java
                    ), this@InsureActivity
                )
            }
        }

    }
}
