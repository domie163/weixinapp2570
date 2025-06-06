import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import zhongyaori from '@/views/modules/zhongyaori/list'
    import richeng from '@/views/modules/richeng/list'
    import yonghu from '@/views/modules/yonghu/list'
    import gongzuorichengzhuanfa from '@/views/modules/gongzuorichengzhuanfa/list'
    import gongzuoricheng from '@/views/modules/gongzuoricheng/list'
    import yongcan from '@/views/modules/yongcan/list'
    import richengzhuanfa from '@/views/modules/richengzhuanfa/list'
    import huimian from '@/views/modules/huimian/list'
    import zhongyaorizhuanfa from '@/views/modules/zhongyaorizhuanfa/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/zhongyaori',
        name: '重要日',
        component: zhongyaori
      }
      ,{
	path: '/richeng',
        name: '日程',
        component: richeng
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/gongzuorichengzhuanfa',
        name: '工作日程转发',
        component: gongzuorichengzhuanfa
      }
      ,{
	path: '/gongzuoricheng',
        name: '工作日程',
        component: gongzuoricheng
      }
      ,{
	path: '/yongcan',
        name: '用餐',
        component: yongcan
      }
      ,{
	path: '/richengzhuanfa',
        name: '日程转发',
        component: richengzhuanfa
      }
      ,{
	path: '/huimian',
        name: '会面',
        component: huimian
      }
      ,{
	path: '/zhongyaorizhuanfa',
        name: '重要日转发',
        component: zhongyaorizhuanfa
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
