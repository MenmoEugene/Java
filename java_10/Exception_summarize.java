�쳣:
	�Ƕ����������,��������ж���ķ�װ.

�쳣����ϵ:
	Throwable
		|--Error
		|--Exception 
			|--RuntimeException
 
�쳣��ϵ���ص�:
		�쳣��ϵ�е��������Լ������Ķ��󶼾߱�������.
		Ҳ����˵���Ա�throw��throws�ؼ���������.
		ֻ���쳣��ϵ�߱�����ص�.

throw �� throws ���÷�:

throw �����ں�����,�����׳��쳣����.
throws �����ں�����,�����׳��쳣��,�����׳����,�ö��Ÿ���.

���������� throw �׳��쳣����,��δ����try ����,
����Ҫ�ں���������,�������ʧ��.

ע��:RuntimeException ����,������������׳��� RuntimeException �쳣,
�����Ͽ��Բ�������.

��������������쳣,��������Ҫ���д���,������ʽ���׿�try.

�쳣������:
	����ʱ������쳣
		���쳣�ڱ���ʱ,���û�д���(û����Ҳû��try),����ʧ��.
	����ʱ�쳣(����ʱ�����)
		�ڱ���ʱ,����Ҫ����,�����������.
		���쳣�ķ������鲻����,�ó���ֹͣ,��Ҫ�û�����������������.

A: try
B: catch 
C: finally

�쳣���������������:

A+B;  A+B+C;  A+C;
ע��
1,finally �ж����ͨ���ǹر���Դ����,��Ϊ��Դ�����ͷ�.
2,finally ֻ��һ���������ִ��, ��ִ�е�System.exit(0);//ϵͳ�˳�, jvm����(������)

�Զ����쳣:
	������̳� Exception ���� RuntimeException
	1,Ϊ���ø��Զ�����߱�������.
	2,�ø���߱������쳣�Ĺ��Է���.

	���Զ����쳣����Ϣʱ,����ʹ�ø����Ѿ�����õĹ���.
	�쳣��Ϣ���ݸ�����Ĺ��캯��.

�Զ����쳣����java���������˼��,�������г��ֵ�����������з�װ.

�쳣�ĺô�:
	1,��������з�װ.
	2,���������̴�������⴦���������,�����Ķ�.

�쳣�Ĵ���ԭ��:
	1,������ʽ������:try ���� throw
	2,���õ��׳��쳣�Ĺ���ʱ,�׳������ʹ�������,һ��try��Ӧ���catch.
	3,���catch,�����catch�ŵ�������
	4,catch ��,��Ҫ��������ԵĴ�����ʽ,��Ҫ�򵥵Ķ���printStackTrace ������,Ҳ��Ҫ��д.
	�������쳣,�����ܴ�������ʱ,���Լ�����catch���׳�.


try
{
	throw new AException();
}
catch (AException e)
{
	throw e;
}
������쳣���ˣ����������ڸù��ܳ��ֵ��쳣��
���Խ��쳣ת�������׳��͸ù�����ص��쳣��
�����쳣���Դ�����Ҳ���Խ������쳣������ת���µ��쳣��

try
{
	throw new AException();
}
catch (AException e)
{
	throw new BException();
}

�쳣��ע�����
	���Ӹ��า��ʱ��
	1�������׳����쳣�����Ǹ�����쳣����������Ӽ���
	2�����������߽ӿ�û���쳣�׳�ʱ�����า�ǳ����쳣��ֻ��try�����ס�