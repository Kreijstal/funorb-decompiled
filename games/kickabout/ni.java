/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends gn {
    static rf field_l;
    static String field_h;
    int field_j;
    static String field_e;
    static String field_q;
    static String field_p;
    static em field_m;
    int field_g;
    static String[] field_k;
    static sj field_i;
    int field_o;
    static String field_n;
    static ut[][] field_f;

    final static byte[] a(byte param0, String param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -49) {
                break L1;
              } else {
                var3 = null;
                byte[] discarded$2 = ni.a((byte) 34, (String) null);
                break L1;
              }
            }
            stackOut_2_0 = jg.field_J.a(param1, "", 4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ni.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a() {
        field_k = null;
        field_l = null;
        field_m = null;
        field_n = null;
        field_e = null;
        field_f = null;
        field_h = null;
        field_q = null;
        field_i = null;
        field_p = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (iw.field_l) {
          return la.field_a.a(il.field_c, (byte) 127, cc.field_e);
        } else {
          if (!kd.field_s) {
            int discarded$36 = 15;
            int discarded$37 = 13;
            int discarded$38 = 104;
            if (sq.b()) {
              return true;
            } else {
              if (kb.field_C) {
                return false;
              } else {
                return hd.a(false, 12, 13);
              }
            }
          } else {
            return ov.a(15, -14, 13);
          }
        }
    }

    private ni() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "earned: <%0>";
        field_p = "<%0> wants to join";
        field_e = "My Results";
        field_k = new String[]{"4 Hours", "6 Hours", "12 Hours", "1 Day", "2 Days"};
        field_q = "Drag your players from the grid to fill each slot on the pitch.<br>Click ready when done.";
        field_n = "<%0> has no opponent and passes straight through <%1>";
    }
}
