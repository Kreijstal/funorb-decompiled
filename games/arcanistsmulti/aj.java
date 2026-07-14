/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static String[] field_a;
    int field_e;
    static String field_b;
    static kc field_d;
    static String field_i;
    int field_c;
    static String field_f;
    static int field_g;
    static i field_h;

    final static mi a(nf param0, int param1) {
        mi var2 = (mi) (Object) uh.field_n.c(true);
        if (!(var2 != null)) {
            return new mi(param0);
        }
        int var3 = -18 / ((param1 - 64) / 43);
        var2.a(-117, param0);
        return var2;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 28139) {
          L0: {
            aj.a(120);
            if (-3 < param1) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-3 > param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_f = null;
        if (param0 != 20028) {
            return;
        }
        field_i = null;
        field_d = null;
        field_a = null;
        field_b = null;
    }

    final static mi a(ml param0, int param1, boolean param2, int param3, nf param4, int param5) {
        if (param2) {
            return null;
        }
        return j.a(param0, param1, (byte) -116, param4, -1, param5, param3);
    }

    aj(int param0, int param1, int param2, int param3) {
        ((aj) this).field_c = param0;
        ((aj) this).field_e = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Wands to buy:<nbsp>5";
        field_i = "Press TAB to chat or F10 to open Quick Chat.";
        field_a = new String[]{"Turn time (seconds)", "Map style", "Game mode"};
        field_f = "Fire 101";
        field_g = 22;
    }
}
