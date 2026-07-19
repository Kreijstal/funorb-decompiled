/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    static String field_c;
    static int field_b;
    static String field_a;
    static boolean field_e;
    static int field_d;

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -88) {
            return;
        }
        field_c = null;
    }

    final static void b(byte param0) {
        L0: {
          if (rq.field_D != null) {
            pi.field_b.b(rq.field_D);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -25) {
          field_e = false;
          qd.field_c = null;
          vg.field_Bb = null;
          rq.field_D = null;
          return;
        } else {
          qd.field_c = null;
          vg.field_Bb = null;
          rq.field_D = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 == 653278209) {
          var3 = hw.field_i * iw.field_g.field_o >> -1233444280;
          var4 = iw.field_g.field_o * hw.field_i >> 314556488;
          var5 = hw.field_i * sa.field_e >> 221643528;
          var6 = lr.field_m * hw.field_i >> -1718113176;
          if (rg.field_f) {
            iw.field_g.e(param1 - var5 + -(var3 >> 1562129825), -var6 + (param2 + -(var4 >> 39237793)), var3, var4, 256);
            return;
          } else {
            eo.a(iw.field_g, -(var3 >> 653278209) + (-var5 + param1), -var6 + param2 + -(var4 >> -1916685887), var3, var4);
            return;
          }
        } else {
          return;
        }
    }

    final static void a(ks param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              os.field_I = param0;
              if (!param1) {
                break L1;
              } else {
                ee.b((byte) 1);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ee.B(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    static {
        field_c = "Send private Quick Chat to <%0>";
        field_d = 2;
    }
}
