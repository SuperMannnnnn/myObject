package com.dabao.pictruestore.view;

import java.util.List;

import com.dabao.pictruestore.entity.Gallery;

/**
 *Created by dabao 2016��7��4��
 */
public interface IGalleryView {
	/**
	 * ͼ����ʾͼƬ���ؼ���
	 * @param pictures
	 */
	void showGalleryList(List<Gallery> gallerys);
}