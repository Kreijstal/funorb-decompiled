/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends jb {
    int field_k;
    int field_f;
    static int field_h;
    static String field_l;
    int field_i;
    int field_g;
    int field_m;
    int field_j;

    public static void a(int param0) {
        if (param0 != -22523) {
            field_h = 88;
            field_l = null;
            return;
        }
        field_l = null;
    }

    final static dl[] a(String param0, String param1, db param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
        if (param3) {
          L0: {
            var6 = null;
            dl[] discarded$1 = we.a((String) null, (String) null, (db) null, true);
            var4 = param2.a(param1, -1);
            var5 = param2.a(-2862, param0, var4);
            if (param3) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L0;
            }
          }
          return jo.a(stackIn_7_0 != 0, var4, param2, var5);
        } else {
          var4 = param2.a(param1, -1);
          var5 = param2.a(-2862, param0, var4);
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return jo.a(stackIn_3_0 != 0, var4, param2, var5);
        }
    }

    final static byte[] a(String param0, int param1) {
        if (param1 != 1) {
            field_h = 17;
            return ge.field_b.a(7693, param0, "");
        }
        return ge.field_b.a(7693, param0, "");
    }

    final static db a(boolean param0, byte param1, boolean param2, boolean param3, int param4) {
        if (param1 > -38) {
            return null;
        }
        return qk.a(param4, 112, param0, param3, false, !param2 ? 0 : 1);
    }

    we(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((we) this).field_k = param5;
        ((we) this).field_i = param3;
        ((we) this).field_m = param2;
        ((we) this).field_j = param0;
        ((we) this).field_f = param4;
        ((we) this).field_g = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
