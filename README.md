### Hibernate envers
Hibernate envers - ������ ��� ������������� �������� ������ ���������
(Envers - Entity Versioning. ����: ����� ������).

� ���������� ���� ��������� �������. 
�� ����, ���� ���������� ������������ ����� ���� �������.
��������� ������� �������� ����������� � ����� ����� �������, 
�� ������ ����������� ��������� ������� � ���� �������, 
������� (���������) ������������� ���� ������ � ���� �������.

### ��������� ������
* ����������� - ��� ��������� � ������� ����������� ����� ������ 
* ����� ������������� - ��� ��������� � ������� ����������� � ����� � ������ ������

### ���������
* @Audited - ����� ����� ������ ��� ���������� �����
* @NoAudited - ��������� �� ������ ����

### ������������
prefix: spring.jpa.properties.org.hibernate.envers
* audit_strategy
* audit_table_prefix
* audit_table_suffix
* store_data_at_delete
* default_schema
* default_catalog

### REV_TYPE
* 0 - ��������
* 1 - ��������������
* 2 - ��������