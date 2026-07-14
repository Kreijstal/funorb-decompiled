/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends nm {
    static int[] field_j;
    static String field_l;
    byte[] field_i;
    static jp field_k;

    final static jp[] a(int param0, byte param1, int param2) {
        Object var4 = null;
        if (param1 != -18) {
          var4 = null;
          boolean discarded$2 = se.a(21, (CharSequence) null);
          return hn.a(param2, param0, 1, param1 ^ 24);
        } else {
          return hn.a(param2, param0, 1, param1 ^ 24);
        }
    }

    public static void a(int param0) {
        field_j = null;
        int var1 = 10 / ((param0 - -33) / 35);
        field_k = null;
        field_l = null;
    }

    final static boolean a(int param0, CharSequence param1) {
        if (param0 != 17165) {
            jp[] discarded$0 = se.a(-74, (byte) 25, 127);
            return jd.a((byte) 122, false, param1);
        }
        return jd.a((byte) 122, false, param1);
    }

    se(byte[] param0) {
        ((se) this).field_i = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[]{17, 18, 8};
        field_l = "Go Back";
    }
}
