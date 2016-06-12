package com.mypro.model;

import com.mypro.base.graphics.Bitmap;
/**
 * ∏ﬂ∑÷œ‘ æ
 * @author Xiloerfan
 *
 */
public class HundredPoint extends DrawableAdapter{
	private Bitmap[] imgs;
	public Bitmap[] getImgs() {
		return imgs;
	}
	public void setImgs(Bitmap[] imgs) {
		this.imgs = imgs;
	}

	private int currentPicId;
	public HundredPoint(Bitmap[] imgs){
		this.imgs = imgs;
	}
	public int getActPicLength(){
		System.out.println(imgs);
		return imgs.length;
	}
	public void setCurrentPicId(int currentPicId){
		this.currentPicId = currentPicId;
	}
	@Override
	public Bitmap getCurrentPic() {
		System.out.println(currentPicId);
		return imgs[currentPicId];
	}

	@Override
	public int getPicWidth() {
		return getCurrentPic().getWidth();
	}

	@Override
	public int getPicHeight() {
		return getCurrentPic().getHeight();
	}

}
