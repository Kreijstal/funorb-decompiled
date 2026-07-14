/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rr {
    static String field_b;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 > -28) {
            ru discarded$0 = rr.b(-91);
        }
    }

    final static ru b(int param0) {
        ru var1 = new ru(lg.field_d, wr.field_J, j.field_e[0], iq.field_g[0], qm.field_K[0], c.field_e[param0], vj.field_j[0], qv.field_j);
        rj.d((byte) 99);
        return var1;
    }

    final static boolean a(byte param0, vh param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var2 = param1.k(0);
          if (1 != var2) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        if (param0 != -76) {
          field_a = null;
          return var3 != 0;
        } else {
          return var3 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You have already reached maximum favour with <%0>.";
        field_a = "Back to <%0>";
    }
}
