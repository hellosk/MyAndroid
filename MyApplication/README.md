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


# Intent

##启动activity
1.通过显式intent，启动具体某一个activity
2.通过隐式intent，由操作系统过滤出一类activity供用户选择启动

##调用系统的activity举例


# Layout

##创建和移除控件
1.在相对布局中动态添加按钮
2.移除按钮

# ListView

##简单列表
1.使用ArrayAdapter填充ListView
2.自定义ArrayAdapter中的内容
3.ListView成员的点击监听
4.Toast的使用

##图文列表
1.创建一个扩展至BaseAdapter的类，用来填充ListView
2.创建一个类管理ListView单元的图文数据
3.在BaseAdapter中添加图文数据，重写getView()方法，将图文设置到单元布局中
4.使用LayoutInflater创建布局的方法


# 常用控件
##RadioGroup
1.通过isChecked()方法获取RadioButton的状态
2.消息弹框AlertDialog.Builder的使用

##CheckBox
1.通过isChecked()方法获取CheckBox的状态

##DatePicker
1.创建DatePickerDialog对象选择日期
2.设置初始日期，获取设置日期

##TimePicker
1.创建TimePickerDialog对象选择时间
2.设置初始时间，获取设置时间

##Spinner
1.创建ArrayAdapter并填充到Spinner
2.调用setOnItemSelectedListener设置监听，获取选中项

##ProgressBar
1.圆形进度条的显示
2.设置水平进度条的进度
3.利用定时器和任务动态更新进度条的进度

##ProgressBar
1.圆形进度条的显示
2.设置水平进度条的进度
3.利用定时器和任务动态更新进度条的进度

##AutoCompleteTextView
1.创建ArrayAdapter并填充到AutoCompleteTextView
2.创建ArrayAdapter并填充到MutiAutoCompleteTextView
3.调用setTokenizer()设置MutiAutoCompleteTextView的分隔符

##SeekBar
1.调用setOnSeekBarChangeListener()设置SeekBar的监听器
2.在进度发生变化的时候会调用onProgressChanged()

##GridView
1.新建1个Adapter，然后调用setAdapter()关联Adapter，最后往Adapter里面添加数据
2.可以调用setNumColumns()来设置网格的列数

##ProgressDialog
1.调用ProgressDialog.show()来创建并显示
2.通过1个线程来控制关闭ProgressDialog

##Notification
1.调用getSystemService()获取系统的通知管理器
2.创建Notification中的Builder,设置参数
3.调用通知管理器的notify()来显示通知，注意参数是builder.build()

