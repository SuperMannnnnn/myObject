package com.dabao.pictruestore.modell;


/**
 *Created by dabao 2016��7��4��
 */
public interface IShowPictureModel extends IModel{
	/**
	 * ����ͼƬ�б�չ���Ļص�
	 * @param back
	 */
	void loadGallerys(AsynCallback back,int id);
}