package utils;

import java.util.LinkedHashMap;

/**
 *
 * @author yn97
 */
public class perisantext {

    public static String p(String str) {

        persianGlypgh p = new persianGlypgh();
        StringBuilder b = new StringBuilder();

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            System.out.println("char at (" + i + ") is => " + new String(new char[]{ch[i]}));
            switch (ch[i]) {

                case ' ':
                    b.append(p.g.get(69)[0]);
                    break;

                case 'آ':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(0)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(0)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(0)[0]);
                    }
                    break;

                case 'ا':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(1)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(1)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(1)[0]);
                    }

                    break;

                case 'ب':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(2)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(2)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(2)[2]);
                    }
                    break;

                case 'پ':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(3)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(3)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(3)[2]);
                    }
                    break;

                case 'ت':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(4)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(4)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(4)[2]);
                    }

                    break;

                case 'ث':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(5)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(5)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(5)[2]);
                    }

                    break;

                case 'ج':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(6)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(6)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(6)[2]);
                    }

                    break;

                case 'چ':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(7)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(7)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(7)[2]);
                    }

                    break;

                case 'ح':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(8)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(8)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(8)[2]);
                    }

                    break;

                case 'خ':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(9)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(9)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(9)[2]);
                    }

                    break;

                case 'د':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(10)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(10)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(10)[2]);
                    }

                    break;

                case 'ذ':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(11)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(11)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(11)[2]);
                    }

                    break;

                case 'ر':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(12)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(12)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(12)[2]);
                    }

                    break;

                case 'ز':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(13)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(13)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(13)[2]);
                    }

                    break;

                case 'ژ':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(14)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(14)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(14)[2]);
                    }

                    break;

                case 'س':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(15)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(15)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(15)[2]);
                    }

                    break;

                case 'ش':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(16)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(16)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(16)[2]);
                    }

                    break;

                case 'ص':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(17)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(17)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(17)[2]);
                    }

                    break;

                case 'ض':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(18)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(18)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(18)[2]);
                    }

                    break;
                case 'ط':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(19)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(19)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(19)[2]);
                    }

                    break;
                case 'ظ':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(20)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(20)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(20)[2]);
                    }

                    break;

                case 'ع':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(21)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(21)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(21)[2]);
                    }

                    break;

                case 'غ':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(22)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(22)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(22)[2]);
                    }

                    break;
                case 'ف':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(23)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(23)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(23)[2]);
                    }

                    break;

                case 'ق':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(24)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(24)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(24)[2]);
                    }

                    break;

                case 'ک':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(25)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(25)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(25)[2]);
                    }

                    break;

                case 'گ':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(26)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(26)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(26)[2]);
                    }

                    break;

                case 'ل':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(27)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(27)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(27)[2]);
                    }

                    break;

                case 'م':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(28)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(28)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(28)[2]);
                    }

                    break;

                case 'ن':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(29)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(29)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(29)[2]);
                    }

                    break;

                case 'و':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(30)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(30)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(30)[2]);
                    }

                    break;

                case 'ه':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(31)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(31)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(31)[2]);
                    }

                    break;

                case 'ی':
                    if (i == (ch.length - 1)) {
                        int x = wich_one(ch[i - 1], ch[i - 1]) - 2;
                        b.append(p.g.get(32)[x]);
                    } else if (!(i == 0)) {
                        b.append(p.g.get(32)[wich_one(ch[i - 1], ch[i + 1])]);
                    } else {
                        b.append(p.g.get(32)[2]);
                    }

                    break;

                case '0':
                    b.append(p.g.get(33)[0]);

                    break;

                case '1':
                    b.append(p.g.get(34)[0]);
                    break;

                case '2':
                    b.append(p.g.get(35)[0]);
                    break;

                case '3':
                    b.append(p.g.get(36)[0]);
                    break;

                case '4':
                    b.append(p.g.get(37)[0]);
                    break;

                case '5':
                    b.append(p.g.get(38)[0]);
                    break;
                case '6':
                    b.append(p.g.get(39)[0]);
                    break;
                case '7':
                    b.append(p.g.get(40)[0]);
                    break;
                case '8':
                    b.append(p.g.get(41)[0]);
                    break;
                case '9':
                    b.append(p.g.get(42)[0]);
                    break;

                case 'ء':
                    b.append(p.g.get(43)[0]);
                    break;
                case '%':
                    b.append(p.g.get(44)[0]);
                    break;
                case '!':
                    b.append(p.g.get(45)[0]);
                    break;
                case '(':
                    b.append(p.g.get(46)[0]);
                    break;
                case ')':
                    b.append(p.g.get(47)[0]);
                    break;
                case '+':
                    b.append(p.g.get(48)[0]);
                    break;
                case '-':
                    b.append(p.g.get(49)[0]);
                    break;
                case '*':
                    b.append(p.g.get(50)[0]);
                    break;
                case '/':
                    b.append(p.g.get(51)[0]);
                    break;
                case ':':
                    b.append(p.g.get(52)[0]);
                    break;
                case '=':
                    b.append(p.g.get(53)[0]);
                    break;
                case '[':
                    b.append(p.g.get(54)[0]);
                    break;
                case ']':
                    b.append(p.g.get(55)[0]);
                    break;
                case '{':
                    b.append(p.g.get(56)[0]);
                    break;
                case '}':
                    b.append(p.g.get(57)[0]);
                    break;
                case '«': // <<
                    b.append(p.g.get(58)[0]);
                    break;
                case '»': // >>
                    b.append(p.g.get(59)[0]);
                    break;
                case '\'':
                    b.append(p.g.get(60)[0]);
                    break;

                case '"':
                    b.append(p.g.get(62)[0]);
                    break;

                case ',':
                    b.append(p.g.get(64)[0]);
                    break;
                case ';':
                    b.append(p.g.get(65)[0]);
                    break;
                case '؟':
                    b.append(p.g.get(66)[0]);
                    break;
                case 'ـ':
                    b.append(p.g.get(67)[0]);
                    break;
                case '.':
                    b.append(p.g.get(70)[0]);
                    break;
                default:
                    b.append(p.g.get(68)[0]);

            }

        }

        return b.reverse().toString();
    }

    private static int wich_one(char c_b, char c_n) {
        int code = 0; // 'ب' 'ـب' 'بـ' 'ـبـ'
        String pattern_b_not_chasban = "[رآادذزوژء\\s\\d\\%\\!\\(\\)\\+\\-\\*\\/\\:\\=\\[\\]\\{\\}\\<\\>\\'\\\"\\,\\;؟\\-\\#ء\\.]";
        String pattern_n_not_chasban = "\\s";
        String strB = new String(new char[]{c_b}); // before charachter c-1
        String strN = new String(new char[]{c_n}); //next chararcter  c+1

        boolean b = strB.matches(pattern_b_not_chasban);
        boolean n = strN.matches(pattern_n_not_chasban);

        if (b && n) {
            code = 0;
        }
        if (!b && n) {
            code = 1;
        }
        if (b && !n) {
            code = 2;
        }
        if (!b && !n) {
            code = 3;
        }

        return code;
    }

}

/**
 * contains the persian persianGlypgh .....
 */
class persianGlypgh {

    /**
     * persian alphebet and number and symboles will stor in it ...
     */
    public LinkedHashMap<Integer, char[]> g = new LinkedHashMap<>();

    public persianGlypgh() {

        g.put(0, new char[]{(char) 170, (char) 171, (char) 170, (char) 171}); // 'آ'  'ـآ' الف
        g.put(1, new char[]{(char) 182, (char) 183, (char) 182, (char) 183}); // 'ا' 'ـا'  الف
        g.put(2, new char[]{(char) 184, (char) 185, (char) 186, (char) 187}); // 'ب' 'ـب' 'بـ' 'ـبـ' ب
        g.put(3, new char[]{(char) 188, (char) 189, (char) 190, (char) 191}); // 'پ' 'ـپ' 'پـ' 'ـپـ' پ
        g.put(4, new char[]{(char) 192, (char) 193, (char) 194, (char) 195}); // 'ت' 'ـت' 'تـ' 'ـتـ' ت
        g.put(5, new char[]{(char) 196, (char) 197, (char) 198, (char) 199}); // 'ث' 'ـث' 'ثـ' 'ـثـ' ث
        g.put(6, new char[]{(char) 200, (char) 201, (char) 202, (char) 203}); // 'ج' 'ـج' 'جـ' 'ـجـ' ج
        g.put(7, new char[]{(char) 204, (char) 205, (char) 206, (char) 207}); // 'چ' 'ـچ' 'چـ' 'ـچـ' چ
        g.put(8, new char[]{(char) 208, (char) 209, (char) 210, (char) 211}); // 'ح' 'ـح' 'حـ' 'ـحـ' ح
        g.put(9, new char[]{(char) 212, (char) 213, (char) 214, (char) 215}); // 'خ' 'ـخ' 'خـ' 'ـخـ' خ
        g.put(10, new char[]{(char) 216, (char) 217, (char) 216, (char) 217}); // 'د' 'ـد' د
        g.put(11, new char[]{(char) 218, (char) 219, (char) 218, (char) 219}); // 'ذ' 'ـذ' ذ
        g.put(12, new char[]{(char) 220, (char) 221, (char) 220, (char) 221}); // 'ر' 'ـر' ر
        g.put(13, new char[]{(char) 222, (char) 223, (char) 222, (char) 223}); // 'ز' 'ـز' ز
        g.put(14, new char[]{(char) 224, (char) 225, (char) 224, (char) 225}); // 'ژ' 'ـژ' ژ
        g.put(15, new char[]{(char) 226, (char) 227, (char) 228, (char) 229}); // 'س' 'ـس' 'سـ' 'ـسـ' س
        g.put(16, new char[]{(char) 230, (char) 231, (char) 232, (char) 233}); // 'ش' 'ـش' 'شـ' 'ـشـ'ش
        g.put(17, new char[]{(char) 234, (char) 235, (char) 236, (char) 237}); // 'ص' 'ـص' 'صـ' 'ـصـ'ص
        g.put(18, new char[]{(char) 238, (char) 239, (char) 240, (char) 241}); // 'ض' 'ـض' 'ضـ' 'ـضـ' ض
        g.put(19, new char[]{(char) 242, (char) 243, (char) 244, (char) 245}); // 'ط' 'ـط' 'طـ' 'ـطـ'ط
        g.put(20, new char[]{(char) 246, (char) 247, (char) 248, (char) 249}); // 'ظ' 'ـظ' 'ظـ' 'ـظـ'ظ
        g.put(21, new char[]{(char) 250, (char) 251, (char) 252, (char) 253}); // 'ع' 'ـع' 'عـ' 'ـعـ' ع
        g.put(22, new char[]{(char) 254, (char) 255, (char) 256, (char) 257}); // 'غ' 'ـغ' 'غـ' 'ـغـ'غ
        g.put(23, new char[]{(char) 258, (char) 259, (char) 260, (char) 261}); // 'ف' 'ـف' 'فـ' 'ـفـ'ف
        g.put(24, new char[]{(char) 262, (char) 263, (char) 264, (char) 265}); // 'ق' 'ـق' 'قـ' 'ـقـ'ق
        g.put(25, new char[]{(char) 266, (char) 267, (char) 268, (char) 269}); // 'ک' 'ـک' 'کـ' 'ـکـ' ک
        g.put(26, new char[]{(char) 270, (char) 271, (char) 272, (char) 273}); // 'گ' 'ـگ' 'گـ' 'ـگـ'  گ
        g.put(27, new char[]{(char) 274, (char) 275, (char) 276, (char) 277}); // 'ل' 'ـل' 'لـ' 'ـلـ' ل
        g.put(28, new char[]{(char) 278, (char) 279, (char) 280, (char) 281}); // 'م' 'ـم' 'مـ' 'ـمـ' م
        g.put(29, new char[]{(char) 282, (char) 283, (char) 284, (char) 285}); // 'ن' 'ـن' 'نـ' 'ـنـ'  ن
        g.put(30, new char[]{(char) 286, (char) 287, (char) 286, (char) 287}); // 'و' 'ـو' واو
        g.put(31, new char[]{(char) 288, (char) 289, (char) 290, (char) 291}); // 'ه' 'ـه' 'هـ' 'ـهـ' ه
        g.put(32, new char[]{(char) 294, (char) 295, (char) 296, (char) 297}); // 'ی' 'ـی' 'یـ' 'ـیـ'  یا

        g.put(33, new char[]{(char) 107}); // 0
        g.put(34, new char[]{(char) 108}); // 1
        g.put(35, new char[]{(char) 109}); // 2
        g.put(36, new char[]{(char) 110}); // 3
        g.put(37, new char[]{(char) 111}); // 4
        g.put(38, new char[]{(char) 112}); // 5
        g.put(39, new char[]{(char) 113}); // 6
        g.put(40, new char[]{(char) 114}); // 7
        g.put(41, new char[]{(char) 115}); // 8
        g.put(42, new char[]{(char) 116}); // 9

        g.put(43, new char[]{(char) 169}); // 'ء' همزه
        g.put(44, new char[]{(char) 98}); // %
        g.put(45, new char[]{(char) 97}); // !
        g.put(46, new char[]{(char) 99}); // (
        g.put(47, new char[]{(char) 100}); // )
        g.put(48, new char[]{(char) 102}); // +
        g.put(49, new char[]{(char) 104}); // -
        g.put(50, new char[]{(char) 101}); // *
        g.put(51, new char[]{(char) 106}); // /
        g.put(52, new char[]{(char) 117}); // :
        g.put(53, new char[]{(char) 118}); // =
        g.put(54, new char[]{(char) 119}); // [
        g.put(55, new char[]{(char) 120}); // ]
        g.put(56, new char[]{(char) 121}); // {
        g.put(57, new char[]{(char) 122}); // }
        g.put(58, new char[]{(char) 123}); // <<
        g.put(59, new char[]{(char) 124}); // >>
        g.put(60, new char[]{(char) 131}); // '
//        g.put(61, new char[]{(char) 132}); // '
        g.put(62, new char[]{(char) 133}); // "
//        g.put(63, new char[]{(char) 134}); // "
        g.put(64, new char[]{(char) 137}); // ,
        g.put(65, new char[]{(char) 138}); // ;
        g.put(66, new char[]{(char) 139}); // ؟
        g.put(67, new char[]{(char) 140}); // -
        g.put(68, new char[]{(char) 312}); // #
        g.put(69, new char[]{(char) 94}); // space
        g.put(70, new char[]{(char) 105}); // dot

    }

}
