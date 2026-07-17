/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends ne {
    static vn field_n;
    static byte[][] field_q;
    static String field_k;
    static od field_s;
    static String field_m;
    static int field_p;
    static tf field_i;
    static String field_r;
    static String field_o;
    static cn field_j;
    static String field_l;

    public static void a() {
        field_q = null;
        field_o = null;
        field_r = null;
        field_m = null;
        field_s = null;
        field_i = null;
        int var1 = 35;
        field_k = null;
        field_n = null;
        field_l = null;
        field_j = null;
    }

    final static int a(byte param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (param1 != 0) {
            if (param1 == 1) {
              stackOut_6_0 = 3;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              if (param1 != 2) {
                stackOut_5_0 = 9;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 6;
                stackIn_7_0 = stackOut_4_0;
                break L0;
              }
            }
          } else {
            stackOut_1_0 = 0;
            stackIn_7_0 = stackOut_1_0;
            break L0;
          }
        }
        return stackIn_7_0;
    }

    private ub() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Play Tutorial";
        field_m = "<col=FF0000>Defence -2</col>";
        field_s = new od();
        field_o = null;
        field_r = "To get the maximum benefit from the Dungeon Assault tutorial, we recommend that you <col=FFC080>log in or register</col> before starting.<br><br>You can continue without logging in, but you will need to repeat sections of the tutorial later before playing Dungeon Assault.";
        field_p = 0;
        field_l = "Goblin Cleaver";
    }
}
