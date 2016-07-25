# Activity

##Activity的生命周期
onCreate()
onStart()
onResume()
onPause()
onStop()
onRestart()
onDestroy()

##创建新的Activity
Intent的使用
startActivity();
startActivityForResult();

##Activity之间的数据传递
A->B: 用intent携带数据
B->A: setResult()传递数据


# Service

##Service的生命周期
onCreate()
onDestroy()
onBind()

##Service的启动和停止
startService()
stopService()

##Service的绑定和解除绑定
bindService()
unbindService()

##定时器和任务的使用
Timer   schedule()  cancel()
TimerTask    run()   cancel()

##在Activity与Service交互
	从Activity中获取Service的实例
	从Activity中访问Service中的数据


# Brodcast Receiver

## 适用场景
运行效率低，适合通信传递数据小，频率低


## 动态注册和销毁
registerReceiver()
unregisterReceiver()


# Content Provider

## 功能
用户程序之间共享数据

##举例
读取联系人数据 getContentResolver
