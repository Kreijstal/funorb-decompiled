/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    static boolean field_c;
    static boolean field_d;
    static String field_b;
    static boolean field_a;

    final static boolean a(bf param0, boolean param1, String param2, int param3, String param4, boolean param5, String param6) {
        RuntimeException var7 = null;
        qc var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (dn.field_q != vn.field_g) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var8 = new qc(bo.field_F, param0);
                bo.field_F.b(var8, 48);
                if (!ei.d(1000)) {
                  L2: {
                    gf.field_a = param3;
                    if (!param5) {
                      stackIn_9_0 = 0;
                      break L2;
                    } else {
                      stackIn_9_0 = 1;
                      break L2;
                    }
                  }
                  hf.field_a = stackIn_9_0 != 0;
                  nf.field_y = null;
                  mf.field_b = param4;
                  dn.field_q = dg.field_o;
                  tf.field_h = param6;
                  kl.field_o = param2;
                  break L1;
                } else {
                  var8.s(248);
                  break L1;
                }
              }
              if (!param1) {
                stackIn_14_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var7);

            stackIn_17_1 = new StringBuilder().append("e.A(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != 32153) {
            field_a = false;
        }
    }

    final static lm a(int param0) {
        if (param0 != -16055) {
            e.b(108);
            if (dn.field_q == vn.field_g) {
                throw new IllegalStateException();
            }
            if (!(ia.field_y != dn.field_q)) {
                dn.field_q = vn.field_g;
                return nf.field_y;
            }
            return null;
        }
        if (dn.field_q == vn.field_g) {
            throw new IllegalStateException();
        }
        if (!(ia.field_y != dn.field_q)) {
            dn.field_q = vn.field_g;
            return nf.field_y;
        }
        return null;
    }

    static {
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_d = true;
    }
}
