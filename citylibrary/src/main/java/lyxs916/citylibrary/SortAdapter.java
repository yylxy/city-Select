package lyxs916.citylibrary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class SortAdapter extends BaseAdapter {
	public List<ItemCityData> list = new ArrayList<ItemCityData>();
	private Context mContext;

	public SortAdapter(Context mContext, List<ItemCityData> list) {
		super();
		
			this.list = list;
	

		this.mContext = mContext;
	}

	// when the data changed , call updateListView() to update
	// 当数据发生了变化,叫updateListView()来更新
	public void updateListView(List<ItemCityData> list) {
		this.list = list;

		/**
		 * 通知观察者,底层数据已经改变了 和任何视图反映了数据集应该刷新自己。
		 */
		notifyDataSetChanged();
	}

	public int getCount() {
		return this.list.size();

	}

	public Object getItem(int pos) {
		return this.list.get(pos);
	}

	public long getItemId(int pos) {
		return pos;
	}

	public View getView(int pos, View view, ViewGroup group) {
		ViewHolder viewHolder = null;
		final ItemCityData mContent = list.get(pos);
		if (view == null) {
			viewHolder = new ViewHolder();
			view = LayoutInflater.from(mContext).inflate(R.layout.city_me_addressed_city, null);

			viewHolder.tvName = (TextView) view.findViewById(R.id.txt_user_name);
			viewHolder.tvLetter = (TextView) view.findViewById(R.id.txt_catalog);

			view.setTag(viewHolder);
		} else
			viewHolder = (ViewHolder) view.getTag();

		// get position and get the first letter
		if (list.get(pos).getSortLetters() != null) {

			
			
			int section = getSectionForPosition(pos);

			if (pos == getPositionForSection(section)) {
				viewHolder.tvLetter.setVisibility(View.VISIBLE);
				viewHolder.tvLetter.setText(mContent.getSortLetters());
			} else
				viewHolder.tvLetter.setVisibility(View.GONE);

			viewHolder.tvName.setText(this.list.get(pos).getCityName());
		}
		return view;
	}

	final static class ViewHolder {

		TextView tvLetter;
		TextView tvName;

	}

	/**
	 * 获取字母转换大写
	 */
	public int getPositionForSection(int section) {
		for (int i = 0; i < getCount(); i++) {
			// 得到排序字母
			String sortStr = list.get(i).getSortLetters();
			// 获取第一个补字母并转换成大写
			char firstChar = sortStr.toUpperCase().charAt(0);
			if (firstChar == section)
				return i;
		}

		return -1;
	}

	/**
	 * 获取截取第一个位置
	 * 
	 * @param arg0
	 * @return
	 */
	public int getSectionForPosition(int arg0) {

		return this.list.get(arg0).getSortLetters().charAt(0);

	}

}
