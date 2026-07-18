/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn extends wj implements vh {
    private wi field_H;
    static ot field_B;
    static String field_L;
    static ot field_K;
    static String[] field_G;
    private wi field_J;
    static boolean field_D;
    static String[] field_I;
    private wi field_E;
    static ut field_C;

    public final void a(int param0, wi param1, int param2, byte param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = Kickabout.field_G;
        try {
          if (param3 > 64) {
            if (param1 == ((nn) this).field_J) {
              int discarded$4 = -25085;
              nn.a();
              return;
            } else {
              if (param1 == ((nn) this).field_E) {
                fr.a((byte) -76);
                return;
              } else {
                if (((nn) this).field_H == param1) {
                  int discarded$5 = 1;
                  bh.a();
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("nn.C(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L0;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L0;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a() {
        Object var2 = null;
        ui.a("", (byte) 111, (String) null);
    }

    public static void k() {
        field_L = null;
        field_B = null;
        field_I = null;
        field_G = null;
        field_K = null;
        field_C = null;
    }

    public nn() {
        super(0, 0, 476, 225, (gj) null);
        ((nn) this).field_E = new wi(dw.field_f, (jv) null);
        ((nn) this).field_J = new wi(vb.field_e, (jv) null);
        ((nn) this).field_H = new wi(ba.field_o, (jv) null);
        op var1 = new op();
        ((nn) this).field_E.field_r = (gj) (Object) var1;
        ((nn) this).field_J.field_r = (gj) (Object) var1;
        ((nn) this).field_H.field_r = (gj) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        ((nn) this).field_J.a(30, 1, ((nn) this).field_n + -var3 >> 1, var4, -var2 + (((nn) this).field_i - 48));
        ((nn) this).field_H.a(30, 1, var4 + ((-var3 + ((nn) this).field_n >> 1) - -var2), var4, -48 + (((nn) this).field_i + -var2));
        ((nn) this).field_E.a(30, 1, ((nn) this).field_n + -var3 >> 1, var3, -(var2 * 2) + (((nn) this).field_i + -78));
        ((nn) this).field_J.field_k = (jv) this;
        ((nn) this).field_E.field_k = (jv) this;
        ((nn) this).field_H.field_k = (jv) this;
        ((nn) this).field_E.field_u = so.field_c;
        ((nn) this).field_H.field_u = pv.field_G;
        ((nn) this).a(-59, (fd) (Object) ((nn) this).field_J);
        ((nn) this).a(-121, (fd) (Object) ((nn) this).field_E);
        ((nn) this).a(-54, (fd) (Object) ((nn) this).field_H);
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_10_0 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_13_0 = false;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (super.a(param0, (byte) -101, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param3 == 98) {
                stackOut_6_0 = ((nn) this).a(param2, (byte) -100);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param1 < -60) {
                  if (param3 == 99) {
                    stackOut_13_0 = ((nn) this).b(param2, (byte) 126);
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("nn.E(").append(param0).append(',').append(param1).append(',');
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
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param3 + ')');
        }
        return stackIn_14_0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param2 + ((nn) this).field_t;
        int var6 = param3 + ((nn) this).field_g;
        int discarded$0 = gf.field_a.a(vb.field_i, 20 + var5, 20 + var6, ((nn) this).field_n + -40, ((nn) this).field_i + -50, 16777215, -1, 1, 0, gf.field_a.field_G);
        super.a(param0, (int) (char)param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new String[]{"POW:", "SPD:", "TCK:", "EXP:"};
        field_D = false;
        field_L = "<%0> has resigned.";
    }
}
