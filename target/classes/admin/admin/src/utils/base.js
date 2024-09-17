const base = {
    get() {
        return {
            url : "http://localhost:8080/wenlixueyuanyuyueguahao/",
            name: "wenlixueyuanyuyueguahao",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/wenlixueyuanyuyueguahao/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "文理医院预约挂号系"
        } 
    }
}
export default base
