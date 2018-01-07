package com.gaoyy.mishop.api.bean;

import java.util.List;

/**
 * Created by gaoyy on 2018/1/6 0006.
 */

public class CateInfo
{


    /**
     * success : true
     * data : {"cate":["新品","手机","电视","电脑","家电","路由","智能","电源","耳机","音箱","礼品","生活","米粉卡","零售店"],"goods":[{"id":"1","name":"新品","data":[[{"id":"1","name":"手机","data":[{"id":"1","second_cate_id":"1","good_name":"红米5","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"2","second_cate_id":"1","good_name":"红米5 Plus","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"3","second_cate_id":"1","good_name":"小米MIX 2","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"4","second_cate_id":"1","good_name":"小米Note 3","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"5","second_cate_id":"1","good_name":"小米5","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"6","second_cate_id":"1","good_name":"小米5X","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"7","second_cate_id":"1","good_name":"小米5X","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}],[{"id":"2","name":"电视","data":[{"id":"8","second_cate_id":"2","good_name":"32英寸","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"9","second_cate_id":"2","good_name":"43英寸","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"10","second_cate_id":"2","good_name":"55英寸","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}],[{"id":"3","name":"电脑","data":[{"id":"11","second_cate_id":"3","good_name":"笔记本Pro 15.6","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"12","second_cate_id":"3","good_name":"笔记本13.3 i7","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}]]},{"id":"2","name":"手机","data":[[{"id":"4","name":"小米手机","data":[{"id":"13","second_cate_id":"4","good_name":"小米MIX 2","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"14","second_cate_id":"4","good_name":"小米Note 3","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"15","second_cate_id":"4","good_name":"小米6","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"16","second_cate_id":"4","good_name":"小米5X","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"17","second_cate_id":"4","good_name":"小米Max 2","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"18","second_cate_id":"4","good_name":"小米MIX","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}],[{"id":"5","name":"红米手机","data":[{"id":"19","second_cate_id":"5","good_name":"红米5","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"20","second_cate_id":"5","good_name":"红米5 Plus","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"21","second_cate_id":"5","good_name":"红米5A","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"22","second_cate_id":"5","good_name":"红米Note 5A","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"23","second_cate_id":"5","good_name":"红米Note 5X","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"24","second_cate_id":"5","good_name":"红米4X","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"25","second_cate_id":"5","good_name":"红米4A","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}],[{"id":"6","name":"移动4G+手机","data":[{"id":"26","second_cate_id":"6","good_name":"小米6","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"27","second_cate_id":"6","good_name":"红米Note 4X","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"28","second_cate_id":"6","good_name":"红米4X","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"29","second_cate_id":"6","good_name":"小米5X","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}],[{"id":"7","name":"手机配件","data":[{"id":"30","second_cate_id":"7","good_name":"以旧换新","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"31","second_cate_id":"7","good_name":"定位电话","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"32","second_cate_id":"7","good_name":"贴膜","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}]]},{"id":"3","name":"电视","data":[[{"id":"8","name":"电视","data":[{"id":"33","second_cate_id":"8","good_name":"32英寸","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"34","second_cate_id":"8","good_name":"43英寸","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"35","second_cate_id":"8","good_name":"49英寸","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"36","second_cate_id":"8","good_name":"55英寸","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"37","second_cate_id":"8","good_name":"65英寸","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}],[{"id":"9","name":"盒子","data":[{"id":"38","second_cate_id":"9","good_name":"盒子3s","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"39","second_cate_id":"9","good_name":"盒子3c","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"40","second_cate_id":"9","good_name":"盒子3增强版","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}],[{"id":"10","name":"音箱","data":[{"id":"41","second_cate_id":"10","good_name":"家庭音响","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"42","second_cate_id":"10","good_name":"蓝牙音箱","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}],[{"id":"11","name":"电视配件与会员","data":[{"id":"43","second_cate_id":"11","good_name":"会员卡","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"44","second_cate_id":"11","good_name":"遥控器","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"45","second_cate_id":"11","good_name":"线材转接器","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"46","second_cate_id":"11","good_name":"安装服务","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"47","second_cate_id":"11","good_name":"麦克风","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}]]},{"id":"4","name":"电脑","data":[[{"id":"12","name":"电脑","data":[{"id":"48","second_cate_id":"12","good_name":"笔记本12.5","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"49","second_cate_id":"12","good_name":"笔记本13.5","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"50","second_cate_id":"12","good_name":"笔记本15.6","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}],[{"id":"13","name":"电脑配件","data":[{"id":"51","second_cate_id":"13","good_name":"鼠标/鼠标垫","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"52","second_cate_id":"13","good_name":"机械键盘","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"53","second_cate_id":"13","good_name":"平板保护类","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"54","second_cate_id":"13","good_name":"转接器/电源","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"55","second_cate_id":"13","good_name":"随身WiFi","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}]]},{"id":"5","name":"家电","data":[[{"id":"14","name":"家电","data":[{"id":"56","second_cate_id":"14","good_name":"电饭煲","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"57","second_cate_id":"14","good_name":"净水器","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"58","second_cate_id":"14","good_name":"扫地机器人","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"59","second_cate_id":"14","good_name":"米家投影仪","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"60","second_cate_id":"14","good_name":"电水壶","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"61","second_cate_id":"14","good_name":"灯具","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"62","second_cate_id":"14","good_name":"空调","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"63","second_cate_id":"14","good_name":"电磁炉","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}]]},{"id":"6","name":"路由","data":[[{"id":"15","name":"路由","data":[{"id":"64","second_cate_id":"15","good_name":"路由器3A","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"65","second_cate_id":"15","good_name":"路由器3G","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"66","second_cate_id":"15","good_name":"路由器3","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"67","second_cate_id":"15","good_name":"路由器3c","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"68","second_cate_id":"15","good_name":"路由器HD","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"69","second_cate_id":"15","good_name":"路由器Pro","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"70","second_cate_id":"15","good_name":"WiFi放大器","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"71","second_cate_id":"15","good_name":"电力猫","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"72","second_cate_id":"15","good_name":"线材","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}]]},{"id":"7","name":"智能","data":[[{"id":"16","name":"智能","data":[{"id":"73","second_cate_id":"16","good_name":"剃须刀","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"74","second_cate_id":"16","good_name":"智能家庭","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"75","second_cate_id":"16","good_name":"VR眼镜","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"76","second_cate_id":"16","good_name":"摄像机","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"77","second_cate_id":"16","good_name":"儿童","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"78","second_cate_id":"16","good_name":"智能插座","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}]]},{"id":"8","name":"电源","data":[[{"id":"17","name":"电源","data":[{"id":"79","second_cate_id":"17","good_name":"插线板","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"80","second_cate_id":"17","good_name":"移动电源","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"81","second_cate_id":"17","good_name":"智能插座","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"82","second_cate_id":"17","good_name":"电池","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"83","second_cate_id":"17","good_name":"电源配件","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"84","second_cate_id":"17","good_name":"充电器","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"85","second_cate_id":"17","good_name":"品牌移动电源","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}]]},{"id":"9","name":"耳机","data":[[{"id":"18","name":"耳机","data":[{"id":"86","second_cate_id":"18","good_name":"线控耳机","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"87","second_cate_id":"18","good_name":"蓝牙耳机","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"88","second_cate_id":"18","good_name":"头戴式耳机","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"89","second_cate_id":"18","good_name":"品牌耳机","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}]]},{"id":"10","name":"音箱","data":[[{"id":"19","name":"音箱","data":[{"id":"90","second_cate_id":"19","good_name":"AI音箱","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"91","second_cate_id":"19","good_name":"蓝牙音箱","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"92","second_cate_id":"19","good_name":"电视音箱","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"93","second_cate_id":"19","good_name":"音乐闹钟","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"94","second_cate_id":"19","good_name":"网络音响","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"95","second_cate_id":"19","good_name":"配件","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}]]},{"id":"11","name":"礼品","data":[[{"id":"20","name":"礼品","data":[{"id":"96","second_cate_id":"20","good_name":"送长辈","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"97","second_cate_id":"20","good_name":"送孩子","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"98","second_cate_id":"20","good_name":"送男生","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"99","second_cate_id":"20","good_name":"送女生","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"100","second_cate_id":"20","good_name":"优惠套装","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"101","second_cate_id":"20","good_name":"新装","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}]]},{"id":"12","name":"生活","data":[[{"id":"21","name":"生活","data":[{"id":"102","second_cate_id":"21","good_name":"运动鞋","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"103","second_cate_id":"21","good_name":"服饰","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"104","second_cate_id":"21","good_name":"旅行箱","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"105","second_cate_id":"21","good_name":"背包/收纳","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"106","second_cate_id":"21","good_name":"眼镜","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"107","second_cate_id":"21","good_name":"口罩","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"108","second_cate_id":"21","good_name":"雨伞","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}]]},{"id":"13","name":"米粉卡","data":[[{"id":"22","name":"电话卡","data":[{"id":"109","second_cate_id":"22","good_name":"日租卡","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"110","second_cate_id":"22","good_name":"月租卡","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"111","second_cate_id":"22","good_name":"吃到爆","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"112","second_cate_id":"22","good_name":"任我行","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}]]},{"id":"14","name":"零售店","data":[[{"id":"23","name":"零售店","data":[{"id":"113","second_cate_id":"23","good_name":"小米之家","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"114","second_cate_id":"23","good_name":"服务网点","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"115","second_cate_id":"23","good_name":"零售网点","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}]]}]}
     */

    private boolean success;
    private DataBeanXX data;

    public boolean isSuccess()
    {
        return success;
    }

    public void setSuccess(boolean success)
    {
        this.success = success;
    }

    public DataBeanXX getData()
    {
        return data;
    }

    public void setData(DataBeanXX data)
    {
        this.data = data;
    }

    public static class DataBeanXX
    {
        private List<String> cate;
        private List<GoodsBean> goods;

        public List<String> getCate()
        {
            return cate;
        }

        public void setCate(List<String> cate)
        {
            this.cate = cate;
        }

        public List<GoodsBean> getGoods()
        {
            return goods;
        }

        public void setGoods(List<GoodsBean> goods)
        {
            this.goods = goods;
        }

        public static class GoodsBean
        {
            /**
             * id : 1
             * name : 新品
             * data : [[{"id":"1","name":"手机","data":[{"id":"1","second_cate_id":"1","good_name":"红米5","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"2","second_cate_id":"1","good_name":"红米5 Plus","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"3","second_cate_id":"1","good_name":"小米MIX 2","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"4","second_cate_id":"1","good_name":"小米Note 3","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"5","second_cate_id":"1","good_name":"小米5","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"6","second_cate_id":"1","good_name":"小米5X","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"7","second_cate_id":"1","good_name":"小米5X","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}],[{"id":"2","name":"电视","data":[{"id":"8","second_cate_id":"2","good_name":"32英寸","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"9","second_cate_id":"2","good_name":"43英寸","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"10","second_cate_id":"2","good_name":"55英寸","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}],[{"id":"3","name":"电脑","data":[{"id":"11","second_cate_id":"3","good_name":"笔记本Pro 15.6","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"12","second_cate_id":"3","good_name":"笔记本13.3 i7","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]}]]
             */

            private String id;
            private String name;
            private List<List<DataBeanX>> data;

            public String getId()
            {
                return id;
            }

            public void setId(String id)
            {
                this.id = id;
            }

            public String getName()
            {
                return name;
            }

            public void setName(String name)
            {
                this.name = name;
            }

            public List<List<DataBeanX>> getData()
            {
                return data;
            }

            public void setData(List<List<DataBeanX>> data)
            {
                this.data = data;
            }

            public static class DataBeanX
            {
                /**
                 * id : 1
                 * name : 手机
                 * data : [{"id":"1","second_cate_id":"1","good_name":"红米5","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"2","second_cate_id":"1","good_name":"红米5 Plus","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"3","second_cate_id":"1","good_name":"小米MIX 2","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"4","second_cate_id":"1","good_name":"小米Note 3","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"5","second_cate_id":"1","good_name":"小米5","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"6","second_cate_id":"1","good_name":"小米5X","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"},{"id":"7","second_cate_id":"1","good_name":"小米5X","good_pic":"https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png"}]
                 */

                private String id;
                private String name;
                private List<DataBean> data;

                public String getId()
                {
                    return id;
                }

                public void setId(String id)
                {
                    this.id = id;
                }

                public String getName()
                {
                    return name;
                }

                public void setName(String name)
                {
                    this.name = name;
                }

                public List<DataBean> getData()
                {
                    return data;
                }

                public void setData(List<DataBean> data)
                {
                    this.data = data;
                }

                public static class DataBean
                {
                    /**
                     * id : 1
                     * second_cate_id : 1
                     * good_name : 红米5
                     * good_pic : https://blueEwing24.github.io/api/img/goods/xmad_1496643954435_EcHtv.png
                     */

                    private String id;
                    private String second_cate_id;
                    private String good_name;
                    private String good_pic;

                    public String getId()
                    {
                        return id;
                    }

                    public void setId(String id)
                    {
                        this.id = id;
                    }

                    public String getSecond_cate_id()
                    {
                        return second_cate_id;
                    }

                    public void setSecond_cate_id(String second_cate_id)
                    {
                        this.second_cate_id = second_cate_id;
                    }

                    public String getGood_name()
                    {
                        return good_name;
                    }

                    public void setGood_name(String good_name)
                    {
                        this.good_name = good_name;
                    }

                    public String getGood_pic()
                    {
                        return good_pic;
                    }

                    public void setGood_pic(String good_pic)
                    {
                        this.good_pic = good_pic;
                    }
                }
            }
        }
    }
}
