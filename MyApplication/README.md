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


# Layout

##�������Ƴ��ؼ�
1.����Բ����ж�̬��Ӱ�ť
2.�Ƴ���ť

# ListView

##���б�
1.ʹ��ArrayAdapter���ListView
2.�Զ���ArrayAdapter�е�����
3.ListView��Ա�ĵ������
4.Toast��ʹ��

##ͼ���б�
1.����һ����չ��BaseAdapter���࣬�������ListView
2.����һ�������ListView��Ԫ��ͼ������
3.��BaseAdapter�����ͼ�����ݣ���дgetView()��������ͼ�����õ���Ԫ������
4.ʹ��LayoutInflater�������ֵķ���


# ���ÿؼ�
##RadioGroup
1.ͨ��isChecked()������ȡRadioButton��״̬
2.��Ϣ����AlertDialog.Builder��ʹ��

##CheckBox
1.ͨ��isChecked()������ȡCheckBox��״̬

##DatePicker
1.����DatePickerDialog����ѡ������
2.���ó�ʼ���ڣ���ȡ��������

##TimePicker
1.����TimePickerDialog����ѡ��ʱ��
2.���ó�ʼʱ�䣬��ȡ����ʱ��

##Spinner
1.����ArrayAdapter����䵽Spinner
2.����setOnItemSelectedListener���ü�������ȡѡ����

##ProgressBar
1.Բ�ν���������ʾ
2.����ˮƽ�������Ľ���
3.���ö�ʱ��������̬���½������Ľ���

##ProgressBar
1.Բ�ν���������ʾ
2.����ˮƽ�������Ľ���
3.���ö�ʱ��������̬���½������Ľ���

##AutoCompleteTextView
1.����ArrayAdapter����䵽AutoCompleteTextView
2.����ArrayAdapter����䵽MutiAutoCompleteTextView
3.����setTokenizer()����MutiAutoCompleteTextView�ķָ���

##SeekBar
1.����setOnSeekBarChangeListener()����SeekBar�ļ�����
2.�ڽ��ȷ����仯��ʱ������onProgressChanged()

##GridView
1.�½�1��Adapter��Ȼ�����setAdapter()����Adapter�������Adapter�����������
2.���Ե���setNumColumns()���������������

##ProgressDialog
1.����ProgressDialog.show()����������ʾ
2.ͨ��1���߳������ƹر�ProgressDialog

##Notification
1.����getSystemService()��ȡϵͳ��֪ͨ������
2.����Notification�е�Builder,���ò���
3.����֪ͨ��������notify()����ʾ֪ͨ��ע�������builder.build()

