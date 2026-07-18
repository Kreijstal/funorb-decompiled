/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao {
    static long field_b;
    static tl field_c;
    static int field_a;

    final static void a(fj param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        fj var3 = null;
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            if (null == param0.field_h) {
              return;
            } else {
              L1: {
                L2: {
                  if (param0.field_g != 0) {
                    break L2;
                  } else {
                    if (param0.field_s == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (var2_int >= pl.field_d) {
                    break L1;
                  } else {
                    L4: {
                      var3 = n.field_L[var2_int];
                      if (var3.field_i != 2) {
                        break L4;
                      } else {
                        if (var3.field_g != param0.field_g) {
                          break L4;
                        } else {
                          if (param0.field_s == var3.field_s) {
                            return;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                var2_int = -3;
                if (null == param0.field_a) {
                  break L5;
                } else {
                  ml.field_jb = param0.field_r;
                  vf.field_b = param0.field_i;
                  ba.field_N = param0.field_a;
                  vd.field_h = param0.field_n;
                  break L5;
                }
              }
              ei.a(-2792, param0);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("ao.A(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + -127 + ')');
        }
    }

    public static void a(boolean param0) {
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0L;
    }
}
