package lyxs916.citylibrary;

import java.util.Comparator;

public class PinyinComparator implements Comparator<ItemCityData> {

	public int compare(ItemCityData o1, ItemCityData o2) {
		if (o1.getSortLetters().equals("@") || o2.getSortLetters().equals("#"))
			return -1;
		else if (o1.getSortLetters().equals("#")|| o2.getSortLetters().equals("@"))
			return 1;
		else
			return o1.getSortLetters().compareTo(o2.getSortLetters());
	}

}

