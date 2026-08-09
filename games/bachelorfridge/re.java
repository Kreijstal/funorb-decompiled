/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends hfa {
    static ck field_C;
    static String field_D;
    static int[][] field_F;
    static int field_E;

    final static void a(int param0, hn param1, vr param2, boolean param3) {
        try {
            fa.field_l = param0 * fda.a(0) / 1000;
            id.a(param2, 64);
            kg.a(param2, 112);
            sha.a(param2, param3);
            pr.c(-95);
            uw.e(65536);
            ur.field_d = 0 + -fa.field_l;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "re.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void h(int param0) {
        if (param0 >= -121) {
            field_C = (ck) null;
            field_D = null;
            field_F = (int[][]) null;
            return;
        }
        field_D = null;
        field_F = (int[][]) null;
    }

    final void a(int param0, int param1, byte param2, wj param3, int param4, int param5) {
        raa var7 = null;
        RuntimeException var7_ref = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3, param4, param5);
              var7 = cea.field_b;
              if (var7 == null) {
                break L1;
              } else {
                if (this.a(param4, param1, 0, param0, param5)) {
                  if (!(this.field_k instanceof mo)) {
                    if (!(var7.field_k instanceof mo)) {
                      break L1;
                    } else {
                      ((mo) ((Object) var7.field_k)).a((re) (this), var7, (byte) -34);
                      cea.field_b = null;
                      return;
                    }
                  } else {
                    ((mo) ((Object) this.field_k)).a((re) (this), var7, (byte) -128);
                    cea.field_b = null;
                    return;
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7_ref);

            stackIn_10_1 = new StringBuilder().append("re.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private re(int param0, int param1, int param2, int param3, qda param4, pl param5, wj param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_A = param6;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "re.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, nea param1, nea param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var3_int = -param1.field_wb + param2.field_wb;
              if (sja.field_gb != param2.field_vb) {
                if (null == param2.field_vb) {
                  var3_int += 200;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var3_int -= 200;
                break L1;
              }
            }
            L2: {
              if (sja.field_gb == param1.field_vb) {
                var3_int += 200;
                break L2;
              } else {
                if (param1.field_vb == null) {
                  var3_int -= 200;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param0 == 29706) {
                break L3;
              } else {
                field_D = (String) null;
                break L3;
              }
            }
            L4: {
              if (-1 <= (var3_int ^ -1)) {
                stackIn_16_0 = 0;
                break L4;
              } else {
                stackIn_16_0 = 1;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("re.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    static {
        field_C = null;
        field_D = null;
    }
}
