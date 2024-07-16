<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
    >  
     <el-row>
                    <el-col :span="12">
           <el-form-item v-if="flag=='huiyuan'"  label='会员姓名' prop="huiyuanName">
               <el-input v-model="ruleForm.huiyuanName"  placeholder='会员姓名' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='huiyuan'"  label='会员手机号' prop="huiyuanPhone">
               <el-input v-model="ruleForm.huiyuanPhone"  placeholder='会员手机号' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='huiyuan'"  label='会员身份证号' prop="huiyuanIdNumber">
               <el-input v-model="ruleForm.huiyuanIdNumber"  placeholder='会员身份证号' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
             <el-form-item v-if="flag=='huiyuan'" label='会员头像' prop="huiyuanPhoto">
                 <file-upload
                         tip="点击上传照片"
                         action="file/upload"
                         :limit="3"
                         :multiple="true"
                         :fileUrls="ruleForm.huiyuanPhoto?ruleForm.huiyuanPhoto:''"
                         @change="huiyuanPhotoUploadChange"
                 ></file-upload>
             </el-form-item>
         </el-col>
         <el-col :span="12">
           <el-form-item v-if="flag=='huiyuan'"  label='电子邮箱' prop="huiyuanEmail">
               <el-input v-model="ruleForm.huiyuanEmail"  placeholder='电子邮箱' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
             <el-form-item v-if="flag=='huiyuan'"  label='余额' prop="newMoney">
                 <el-input v-model="ruleForm.newMoney"  placeholder='余额' disabled ></el-input>
             </el-form-item>
         </el-col>
         <el-col :span="24">
             <el-form-item v-if="flag=='huiyuan'"  label="会员介绍" prop="huiyuanContent">
                 <editor
                         style="min-width: 200px; max-width: 600px;"
                         v-model="ruleForm.huiyuanContent"
                         class="editor"
                         action="file/upload">
                 </editor>
             </el-form-item>
         </el-col>
         <el-col :span="12">
           <el-form-item v-if="flag=='zhuanjia'"  label='专家姓名' prop="zhuanjiaName">
               <el-input v-model="ruleForm.zhuanjiaName"  placeholder='专家姓名' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='zhuanjia'"  label='专家手机号' prop="zhuanjiaPhone">
               <el-input v-model="ruleForm.zhuanjiaPhone"  placeholder='专家手机号' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='zhuanjia'"  label='专家身份证号' prop="zhuanjiaIdNumber">
               <el-input v-model="ruleForm.zhuanjiaIdNumber"  placeholder='专家身份证号' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
             <el-form-item v-if="flag=='zhuanjia'" label='专家头像' prop="zhuanjiaPhoto">
                 <file-upload
                         tip="点击上传照片"
                         action="file/upload"
                         :limit="3"
                         :multiple="true"
                         :fileUrls="ruleForm.zhuanjiaPhoto?ruleForm.zhuanjiaPhoto:''"
                         @change="zhuanjiaPhotoUploadChange"
                 ></file-upload>
             </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='zhuanjia'"  label='科室' prop="keshiTypes">
                 <el-select v-model="ruleForm.keshiTypes"  placeholder='请选择科室'>
                     <el-option
                             v-for="(item,index) in keshiTypesOptions"
                             v-bind:key="item.codeIndex"
                             :label="item.indexName"
                             :value="item.codeIndex">
                     </el-option>
                 </el-select>
             </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='zhuanjia'"  label='职位' prop="zhiweiTypes">
                 <el-select v-model="ruleForm.zhiweiTypes"  placeholder='请选择职位'>
                     <el-option
                             v-for="(item,index) in zhiweiTypesOptions"
                             v-bind:key="item.codeIndex"
                             :label="item.indexName"
                             :value="item.codeIndex">
                     </el-option>
                 </el-select>
             </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='zhuanjia'"  label='挂号费' prop="guahaoMoney">
                 <el-input v-model="ruleForm.guahaoMoney"  placeholder='挂号费' disabled ></el-input>
             </el-form-item>
         </el-col>
         <el-col :span="12">
           <el-form-item v-if="flag=='zhuanjia'"  label='电子邮箱' prop="zhuanjiaEmail">
               <el-input v-model="ruleForm.zhuanjiaEmail"  placeholder='电子邮箱' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="24">
             <el-form-item v-if="flag=='zhuanjia'"  label="专家介绍" prop="zhuanjiaContent">
                 <editor
                         style="min-width: 200px; max-width: 600px;"
                         v-model="ruleForm.zhuanjiaContent"
                         class="editor"
                         action="file/upload">
                 </editor>
             </el-form-item>
         </el-col>
         <el-form-item v-if="flag=='users'" label="用户名" prop="username">
             <el-input v-model="ruleForm.username"
                       placeholder="用户名"></el-input>
         </el-form-item>
         <el-col :span="12">
             <el-form-item v-if="flag!='users'"  label="性别" prop="sexTypes">
                 <el-select v-model="ruleForm.sexTypes" placeholder="请选择性别">
                     <el-option
                             v-for="(item,index) in sexTypesOptions"
                             v-bind:key="item.codeIndex"
                             :label="item.indexName"
                             :value="item.codeIndex">
                     </el-option>
                 </el-select>
             </el-form-item>
         </el-col>
         <el-col :span="24">
             <el-form-item>
                 <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
             </el-form-item>
         </el-col>
     </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
        ruleForm: {},
        flag: '',
        usersFlag: false,
        // sexTypesOptions : [],
// 注册表 会员
    // 注册的类型字段 会员
        // 性别
        sexTypesOptions : [],
// 注册表 专家
    // 注册的类型字段 专家
        // 性别
        sexTypesOptions : [],
        // 科室
        keshiTypesOptions : [],
        // 职位
        zhiweiTypesOptions : [],
    };
  },
  mounted() {
    //获取当前登录用户的信息
    var table = this.$storage.get("sessionTable");
    this.sessionTable = this.$storage.get("sessionTable");
    this.role = this.$storage.get("role");
    if (this.role != "管理员"){
    }

    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
// 注册表 会员
// 注册表 专家
      } else {
        this.$message.error(data.msg);
      }
    });

// 注册表 会员 的级联表
// 注册表 专家 的级联表

      this.$http({
          url: `dictionary/page?page=1&limit=100&sort=&order=&dicCode=sex_types`,
          method: "get"
      }).then(({ data }) => {
          if (data && data.code === 0) {
              this.sexTypesOptions = data.data.list;
          } else {
              this.$message.error(data.msg);
          }
      });
   this.$http({
       url: `dictionary/page?page=1&limit=100&sort=&order=&dicCode=keshi_types`,
       method: "get"
   }).then(({ data }) => {
       if (data && data.code === 0) {
          this.keshiTypesOptions = data.data.list;
      } else {
          this.$message.error(data.msg);
      }
    });
   this.$http({
       url: `dictionary/page?page=1&limit=100&sort=&order=&dicCode=zhiwei_types`,
       method: "get"
   }).then(({ data }) => {
       if (data && data.code === 0) {
          this.zhiweiTypesOptions = data.data.list;
      } else {
          this.$message.error(data.msg);
      }
    });
  },
  methods: {
    huiyuanPhotoUploadChange(fileUrls) {
        this.ruleForm.huiyuanPhoto = fileUrls;
    },
    zhuanjiaPhotoUploadChange(fileUrls) {
        this.ruleForm.zhuanjiaPhoto = fileUrls;
    },


    onUpdateHandler() {
                         if((!this.ruleForm.huiyuanName)&& 'huiyuan'==this.flag){
                             this.$message.error('会员姓名不能为空');
                             return
                         }

                             if( 'huiyuan' ==this.flag && this.ruleForm.huiyuanPhone&&(!isMobile(this.ruleForm.huiyuanPhone))){
                                 this.$message.error(`手机应输入手机格式`);
                                 return
                             }
                         if((!this.ruleForm.huiyuanIdNumber)&& 'huiyuan'==this.flag){
                             this.$message.error('会员身份证号不能为空');
                             return
                         }

                         if((!this.ruleForm.huiyuanPhoto)&& 'huiyuan'==this.flag){
                             this.$message.error('会员头像不能为空');
                             return
                         }

                             if( 'huiyuan' ==this.flag && this.ruleForm.huiyuanEmail&&(!isEmail(this.ruleForm.huiyuanEmail))){
                                 this.$message.error(`邮箱应输入邮箱格式`);
                                 return
                             }
                         if((!this.ruleForm.huiyuanContent)&& 'huiyuan'==this.flag){
                             this.$message.error('会员介绍不能为空');
                             return
                         }

                         if((!this.ruleForm.zhuanjiaName)&& 'zhuanjia'==this.flag){
                             this.$message.error('专家姓名不能为空');
                             return
                         }

                             if( 'zhuanjia' ==this.flag && this.ruleForm.zhuanjiaPhone&&(!isMobile(this.ruleForm.zhuanjiaPhone))){
                                 this.$message.error(`手机应输入手机格式`);
                                 return
                             }
                         if((!this.ruleForm.zhuanjiaIdNumber)&& 'zhuanjia'==this.flag){
                             this.$message.error('专家身份证号不能为空');
                             return
                         }

                         if((!this.ruleForm.zhuanjiaPhoto)&& 'zhuanjia'==this.flag){
                             this.$message.error('专家头像不能为空');
                             return
                         }

                         if((!this.ruleForm.keshiTypes)&& 'zhuanjia'==this.flag){
                             this.$message.error('科室不能为空');
                             return
                         }

                         if((!this.ruleForm.zhiweiTypes)&& 'zhuanjia'==this.flag){
                             this.$message.error('职位不能为空');
                             return
                         }

                         if((!this.ruleForm.guahaoMoney)&& 'zhuanjia'==this.flag){
                             this.$message.error('挂号费不能为空');
                             return
                         }

                             if( 'zhuanjia' ==this.flag && this.ruleForm.zhuanjiaEmail&&(!isEmail(this.ruleForm.zhuanjiaEmail))){
                                 this.$message.error(`邮箱应输入邮箱格式`);
                                 return
                             }
                         if((!this.ruleForm.zhuanjiaContent)&& 'zhuanjia'==this.flag){
                             this.$message.error('专家介绍不能为空');
                             return
                         }

        if((!this.ruleForm.sexTypes) && this.flag!='users'){
            this.$message.error('性别不能为空');
            return
        }
      if('users'==this.flag && this.ruleForm.username.trim().length<1) {
        this.$message.error(`用户名不能为空`);
        return	
      }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
