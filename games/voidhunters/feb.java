/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class feb {
    static aba field_a;
    static int[] field_b;

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 122) {
            return;
        }
        field_b = null;
    }

    final static kla a(ha param0, boolean param1) {
        qgb var2 = null;
        RuntimeException var2_ref = null;
        kla var3 = null;
        kla stackIn_3_0 = null;
        kla stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        kla stackOut_2_0 = null;
        kla stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (nsa.field_p == param0) {
              stackOut_2_0 = eia.field_q;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var2 = (qgb) ((Object) fgb.field_k.a((long)param0.field_b, 124));
                if (param1) {
                  break L1;
                } else {
                  field_b = (int[]) null;
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    if (var2.field_e == param0) {
                      var3 = var2.field_d;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var2 != null) {
                    var2.b(-3846);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var3 = new kla(param0);
                fgb.field_k.a((long)param0.field_b, new qgb(param0, var3), (byte) -127);
                break L2;
              }
              nsa.field_p = param0;
              eia.field_q = var3;
              stackOut_14_0 = (kla) (var3);
              stackIn_15_0 = stackOut_14_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2_ref);
            stackOut_16_1 = new StringBuilder().append("feb.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_15_0;
        }
    }

    static {
        field_a = new aba();
    }
}
