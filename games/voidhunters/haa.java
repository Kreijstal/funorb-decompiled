/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class haa extends rqa {
    static String field_o;
    static String field_p;

    final static boolean a(char param0, boolean param1) {
        if (!param1) {
            return true;
        }
        if (param0 < 48) {
            return false;
        }
        if (param0 > 57) {
            return false;
        }
        return true;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          boolean discarded$2 = haa.a('ﾛ', true);
          return new nc((Object) (Object) frb.a(214, 111));
        } else {
          return new nc((Object) (Object) frb.a(214, 111));
        }
    }

    public static void e(byte param0) {
        field_o = null;
        field_p = null;
        if (param0 != 91) {
            boolean discarded$0 = haa.a('3', true);
        }
    }

    haa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Please try changing the following settings:  ";
        field_o = "Your friend list is full. Max of 100 for free users, and 200 for members.";
    }
}
