# Activity

##Activity����������
onCreate()
onStart()
onResume()
onPause()
onStop()
onRestart()
onDestroy()

##�����µ�Activity
Intent��ʹ��
startActivity();
startActivityForResult();

##Activity֮������ݴ���
A->B: ��intentЯ������
B->A: setResult()��������


# Service

##Service����������
onCreate()
onDestroy()
onBind()

##Service��������ֹͣ
startService()
stopService()

##Service�İ󶨺ͽ����
bindService()
unbindService()

##��ʱ���������ʹ��
Timer   schedule()  cancel()
TimerTask    run()   cancel()

##��Activity��Service����
	��Activity�л�ȡService��ʵ��
	��Activity�з���Service�е�����


# Brodcast Receiver

## ���ó���
����Ч�ʵͣ��ʺ�ͨ�Ŵ�������С��Ƶ�ʵ�


## ��̬ע�������
registerReceiver()
unregisterReceiver()


# Content Provider

## ����
�û�����֮�乲������

##����
��ȡ��ϵ������ getContentResolver


# Intent

##����activity
1.ͨ����ʽintent����������ĳһ��activity
2.ͨ����ʽintent���ɲ���ϵͳ���˳�һ��activity���û�ѡ������

##����ϵͳ��activity����
