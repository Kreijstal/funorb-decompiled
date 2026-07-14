/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends li {
    byte[] field_n;
    static cr[] field_q;
    static String field_o;
    int field_r;
    long field_p;

    public static void a(byte param0) {
        field_o = null;
        field_q = null;
        if (param0 != -118) {
            field_q = null;
        }
    }

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        param1 = cn.a((byte) -126, "", '_', param1);
        var4 = 127 / ((-8 - param0) / 36);
        var3 = mq.a(param2, false);
        if (-1 == param1.indexOf(param2)) {
          if (0 != (param1.indexOf(var3) ^ -1)) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    hl(long param0, int param1, byte[] param2) {
        ((hl) this).field_n = param2;
        ((hl) this).field_r = param1;
        ((hl) this).field_p = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Security";
    }
}
