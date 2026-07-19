/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qea extends rqa {
    static int[] field_r;
    static int field_p;
    static int field_q;
    static int field_o;

    qea(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
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
              if (param1 < -119) {
                break L1;
              } else {
                qea.a((byte) -45, -12);
                break L1;
              }
            }
            si.a(74, 62, param0[0].a(118));
            stackOut_2_0 = new nc("void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("qea.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void b(boolean param0) {
        field_r = null;
        if (!param0) {
            qea.a(-19, -41, true, 117, -123, 114, 51);
        }
    }

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 == -29) {
                break L1;
              } else {
                field_r = (int[]) null;
                break L1;
              }
            }
            hqb.a(0, pn.field_b, bea.field_e, true, param1, (byte) 24, rha.field_d);
            var2_int = 0;
            L2: while (true) {
              if (bea.field_e <= var2_int) {
                hqb.a(param1, qbb.field_a, bea.field_e + param1, false, param1 + param1, (byte) 24, npa.field_d);
                if (bea.field_e > param1) {
                  bea.field_e = param1;
                  break L0;
                } else {
                  return;
                }
              } else {
                sv.field_f[var2_int - -param1] = var2_int;
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2), "qea.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        String var7 = null;
        int var8 = 105 / ((27 - param1) / 52);
        if ((ow.field_b ^ -1) == -3) {
            var7 = iqa.field_o;
        } else {
            var7 = kia.field_b;
        }
        VoidHunters.a(param4, param3, param6, param0, var7, param5, true, param2);
    }

    static {
        field_r = new int[16];
        field_q = 100;
        field_o = 0;
    }
}
