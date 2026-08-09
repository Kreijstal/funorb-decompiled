/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nba {
    static int field_b;
    static int[] field_a;

    final static void a(ff param0, la param1, byte param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (vpa.a(76)) {
                break L1;
              } else {
                if (param0.k(-25319)) {
                  break L1;
                } else {
                  if (param1.q((byte) -82) >= 0) {
                    ql.field_k.k(98, -2988);
                    ql.field_k.f(-1477662136, param1.q((byte) -82));
                    var3_int = 8 % ((param2 - 51) / 36);
                    ql.field_k.f(-1477662136, param1.a((byte) 107));
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("nba.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(fia param0, sq param1, int param2, int param3, int param4, java.awt.Component param5, int param6, boolean param7) {
        try {
            kta.a(param3, param7, 10);
            ipa.field_P = kta.a(param0, param5, 0, param4);
            int var8_int = 22 % ((50 - param6) / 54);
            gg.field_b = kta.a(param0, param5, 1, param2);
            kva.field_n = new en();
            ov.field_p = param2;
            gg.field_b.b(kva.field_n);
            tva.field_d = param1;
            tva.field_d.a((byte) 100, ff.field_w);
            ipa.field_P.b(tva.field_d);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "nba.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            nba.a(true);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
    }
}
