const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm0v893/",
            name: "ssm0v893",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm0v893/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "个人日程安排微信小程序"
        } 
    }
}
export default base
