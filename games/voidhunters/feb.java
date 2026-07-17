/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class feb {
    static aba field_a;
    static int[] field_b;

    public static void a() {
        field_a = null;
        field_b = null;
    }

    final static kla a(ha param0) {
        qgb var2 = null;
        RuntimeException var2_ref = null;
        kla var3 = null;
        kla stackIn_3_0 = null;
        kla stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        kla stackOut_2_0 = null;
        kla stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (nsa.field_p == param0) {
              stackOut_2_0 = eia.field_q;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                L2: {
                  var2 = (qgb) (Object) fgb.field_k.a((long)param0.field_b, 124);
                  if (var2 == null) {
                    break L2;
                  } else {
                    if (var2.field_e == param0) {
                      var3 = var2.field_d;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var2 != null) {
                    var2.b(-3846);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3 = new kla(param0);
                fgb.field_k.a((long)param0.field_b, (ksa) (Object) new qgb(param0, var3), (byte) -127);
                break L1;
              }
              nsa.field_p = param0;
              eia.field_q = var3;
              stackOut_12_0 = (kla) var3;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2_ref;
            stackOut_14_1 = new StringBuilder().append("feb.A(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + 1 + 41);
        }
        return stackIn_13_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new aba();
    }
}
