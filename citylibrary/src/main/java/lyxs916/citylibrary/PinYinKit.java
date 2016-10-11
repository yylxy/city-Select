package lyxs916.citylibrary;


import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

/**
 * �����ĺ���ת����ƴ��
 * @author Administrator
 *
 */
public class PinYinKit {
	public static String getPingYin(String chineseStr)
			throws BadHanyuPinyinOutputFormatCombination {
		String zhongWenPinYin = "";
		char[] chars = chineseStr.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			String[] pinYin = PinyinHelper.toHanyuPinyinStringArray(chars[i],
					getDefaultOutputFormat());
			if (pinYin != null)
				zhongWenPinYin += pinYin[0];
			else
				zhongWenPinYin += chars[i];
		}
		return zhongWenPinYin;
	}

	/**
	 * ƴ����ʽ
	 * @return
	 */
	private static HanyuPinyinOutputFormat getDefaultOutputFormat() {
		HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();
		format.setCaseType(HanyuPinyinCaseType.UPPERCASE);//��Сд
		
		format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);//������
		format.setVCharType(HanyuPinyinVCharType.WITH_U_AND_COLON);//����char ����
		return format;
	}
}
