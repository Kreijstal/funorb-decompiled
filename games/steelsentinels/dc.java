/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static String field_d;
    static int field_g;
    static wk[][] field_b;
    String[] field_e;
    static int field_h;
    static String field_f;
    static int field_c;
    static String field_a;

    final static String a(int param0, int param1) {
        int var4 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int[] var2;
        StringBuilder var3;
        int var5;
        int[] var6;
        var5 = SteelSentinels.field_G;
        var6 = new int[]{16, param1, 64, 128, 256, 512};
        var2 = var6;
        var3 = new StringBuilder();
        for (var4 = 0; var4 < var6.length; var4++) {
          if ((var6[var4] & param0) != 0) {
            if (var3.length() > 0) {
              discarded$0 = var3.append('/');
            }
            discarded$1 = var3.append(kk.field_h[var4]);
          }
        }
        return var3.toString();
    }

    public static void a(int param0) {
        field_b = (wk[][]) null;
        field_d = null;
        field_f = null;
        int var1 = -60 % ((42 - param0) / 59);
        field_a = null;
    }

    private dc() throws Throwable {
        throw new Error();
    }

    static {
        field_g = -1;
        field_d = "F1";
        field_f = "Mission <%0>";
        field_a = "BA'AL LORD OF ILOLIA";
    }
}
