/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class la extends he {
    static int[] field_m;
    boolean field_o;
    static kc field_k;
    volatile boolean field_n;
    boolean field_l;

    abstract byte[] b(boolean param0);

    abstract int a(boolean param0);

    public static void b(byte param0) {
        field_m = null;
        if (param0 < 12) {
            return;
        }
        field_k = null;
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        param0 = wk.a('_', 63, param0, "");
        if (param1 == -115) {
          var3 = gi.a(98, param2);
          if (-1 == param0.indexOf(param2)) {
            if (-1 != param0.indexOf(var3)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return true;
        }
    }

    la() {
        ((la) this).field_n = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[8192];
    }
}
