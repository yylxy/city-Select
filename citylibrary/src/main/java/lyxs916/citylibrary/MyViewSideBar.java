package lyxs916.citylibrary;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MyViewSideBar extends View {
	// touching event
		private OnTouchingLetterChangedListener onTouchingLetterChangedListener;
		// 26 letters
		public static String[] b = { "A", "B", "C", "D", "E", "F", "G", "H", "I",
				"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
				"W", "X", "Y", "Z"};//, "#" 
		// if choosed
		/** 选择 */
		private int choose = -1;
		/** 绘制 */
		private Paint paint = new Paint();
		/** 要显示的内容 */
		private TextView mTextDialog;

		public void setmTextDialog(TextView mTextDialog) {
			this.mTextDialog = mTextDialog;
		}

		public MyViewSideBar(Context context, AttributeSet attrs, int defStyleAttr) {
			super(context, attrs, defStyleAttr);
		}

		public MyViewSideBar(Context context, AttributeSet attrs) {
			super(context, attrs);
		}

		public MyViewSideBar(Context context) {
			super(context);
		}

		/** 绘制方法 */
		protected void onDraw(Canvas canvas) {
			super.onDraw(canvas);
			/** 父类控件的高度 */
			int height = getHeight();
			/** 父类控件的宽度 */
			int width = getWidth();
			/** 每个控件的高度 */
			int singleHeight = height / b.length;

			for (int i = 0; i < b.length; i++) {
				paint.setColor(Color.rgb(100, 100, 100));// 颜色
				paint.setTypeface(Typeface.DEFAULT_BOLD);// 类型默认
				paint.setAntiAlias(true);// 边缘平滑
				paint.setTextSize(20);// 大小

				// if choosed
				if (i == choose) {
					/** 也就是等于-1 时的绘制颜色 。显示为触摸时 */
					paint.setColor(Color.parseColor("#ff0000ff"));
					paint.setFakeBoldText(true);// 设定标记
				}

				// 绘制文本，的位置
				float x = width / 2 - paint.measureText(b[i]) / 2;
				float y = singleHeight * i + singleHeight;

				canvas.drawText(b[i], x, y, paint);// 设置画布，绘制内容

				paint.reset();// 恢复漆的默认设置
			}

		}

		/** 触摸事件的处理 */
		@SuppressWarnings("deprecation")
		@Override
		public boolean dispatchTouchEvent(MotionEvent event) {
			/** 获取动作 */
			final int action = event.getAction();
			/** 得到点击的位置 */
			final float y = event.getY();

			final int oldChoose = choose;
			/** 触摸字母的监听 */
			final OnTouchingLetterChangedListener changedListener = onTouchingLetterChangedListener;
			/** 字母的位置 */
			final int letterPos = (int) (y / getHeight() * b.length);

			switch (action) {
			case MotionEvent.ACTION_UP:
				// 背景色为透明
				setBackgroundDrawable(new ColorDrawable(0x000000));
				choose = -1;
				// 使整个视图无效
				invalidate();

				if (mTextDialog != null)
					mTextDialog.setVisibility(View.INVISIBLE);
				break;

			default:
				/** 设置点击后的背景 */
//				setBackgroundResource(R.drawable.bg_sidebar);
				setBackgroundColor(0xffeeeeee);

				if (oldChoose != letterPos) {

					/** 添加监听 */
					if (letterPos >= 0 && letterPos < b.length) {
						if (changedListener != null)
							changedListener.onTouchingLetterChanged(b[letterPos]);
						// 显示提示内容
						if (mTextDialog != null) {
							mTextDialog.setText(b[letterPos]);
							mTextDialog.setVisibility(View.VISIBLE);
						}

						choose = letterPos;
						invalidate();
					}
				}
				break;
			}
			return true;
		}

		public void setOnTouchingLetterChangedListener(
				OnTouchingLetterChangedListener changedListener) {
			this.onTouchingLetterChangedListener = changedListener;
		}

		public interface OnTouchingLetterChangedListener {
			public void onTouchingLetterChanged(String str);
		}
	}