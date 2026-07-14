/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ke extends wb {
    static km field_u;
    static boolean[][] field_t;
    static String field_o;
    static jf field_p;
    static int[] field_r;
    static String field_s;
    static long[] field_q;

    ke() {
    }

    public static void d(int param0) {
        field_q = null;
        int var1 = -9 / ((8 - param0) / 47);
        field_o = null;
        field_u = null;
        field_p = null;
        field_s = null;
        field_r = null;
        field_t = null;
    }

    final static mg[] a(int param0, eh param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        if (param0 != 32) {
          var6 = null;
          mg[] discarded$2 = ke.a(-75, (eh) null, (String) null, (String) null);
          var4 = param1.a(-1, param2);
          var5 = param1.a(-94, var4, param3);
          return td.a(var5, 6887, var4, param1);
        } else {
          var4 = param1.a(-1, param2);
          var5 = param1.a(-94, var4, param3);
          return td.a(var5, 6887, var4, param1);
        }
    }

    final static rm[] a(String param0, String param1, eh param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        if (param3 != 32370) {
          var6 = null;
          rm[] discarded$2 = ke.a((String) null, (String) null, (eh) null, 62);
          var4 = param2.a(-1, param1);
          var5 = param2.a(-63, var4, param0);
          return ce.a(-1979, var5, param2, var4);
        } else {
          var4 = param2.a(-1, param1);
          var5 = param2.a(-63, var4, param0);
          return ce.a(-1979, var5, param2, var4);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "You have not yet unlocked this option for use.";
        field_s = "Location";
        field_q = new long[32];
    }
}
