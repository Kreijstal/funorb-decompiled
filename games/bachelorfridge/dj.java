/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    static String field_a;
    static sna field_d;
    static gj field_c;
    static String field_b;

    public static void a(byte param0) {
        if (param0 != -75) {
            dj.a((byte) 111);
        }
        field_a = null;
        field_c = null;
        field_d = null;
        field_b = null;
    }

    final static void a(int param0, boolean param1) {
        pf.field_n = !param1 ? new lm(hfa.field_B, nu.field_f) : new lm(dea.field_l, sr.field_b);
        ela.field_i = new sna(0L, (sna) null);
        ela.field_i.a(-1, (sna) (Object) pf.field_n.field_a);
        ela.field_i.a(param0 + -1, jj.field_wb);
        qw.field_b = new sna(0L, qaa.field_d);
        rf.field_q = new sna((long)param0, (sna) null);
        qw.field_b.a(-1, saa.field_f);
        qw.field_b.a(param0 + -1, rf.field_q);
        rf.field_q.a(-1, tv.field_o);
        rf.field_q.a(-1, vca.field_h);
        pv.a(param1, true);
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            if (sl.a(param0, (byte) 125, param2)) {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= param2.length()) {
                  if (param1 == -15437) {
                    stackOut_13_0 = 1;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    field_c = null;
                    return true;
                  }
                } else {
                  if (!vu.a((byte) 117, param2.charAt(var3_int))) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  } else {
                    var3_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("dj.A(").append(param0).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_14_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Open Fridge";
        field_b = "Only available to members.";
    }
}
