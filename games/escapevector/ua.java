/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static int field_a;
    static String field_b;
    static kg field_c;

    final static int[] a(int param0, boolean param1, int param2, ij param3) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            var8 = param3.field_o[param2];
            var4 = var8;
            var5 = new int[var8.length];
            var6 = 0;
            L1: while (true) {
              if (var8.length <= var6) {
                stackOut_4_0 = (int[]) var5;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var5[var6] = bj.a(-19, param0, var8[var6]);
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4_ref;
            stackOut_6_1 = new StringBuilder().append("ua.A(").append(param0).append(',').append(true).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    public static void a() {
        field_c = null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2) {
        if (!(!aj.b(-127))) {
            return;
        }
        c var4 = om.field_c;
        var4.a(16, true);
        var4.field_m = var4.field_m + 1;
        int var5 = var4.field_m;
        var4.f(0, -123);
        var4.h(46, param0);
        var4.f(param2, -123);
        var4.h(10, param1);
        var4.e(-96, var4.field_m + -var5);
    }

    final static String a(int param0, int param1, CharSequence[] param2) {
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_10_0 = null;
        String stackOut_8_0 = null;
        String stackOut_31_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            if (param1 == 0) {
              stackOut_3_0 = "";
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (1 == param1) {
                var10 = param2[0];
                var4 = var10;
                if (var4 != null) {
                  stackOut_10_0 = ((Object) (Object) var10).toString();
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  stackOut_8_0 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                var4_int = param1;
                var5 = 0;
                var6_int = 0;
                L1: while (true) {
                  if (var4_int <= var6_int) {
                    L2: {
                      var6 = new StringBuilder(var5);
                      var7 = 0;
                      if (var4_int <= var7) {
                        break L2;
                      } else {
                        L3: {
                          var8 = param2[var7];
                          if (var8 == null) {
                            StringBuilder discarded$2 = var6.append("null");
                            var7++;
                            break L3;
                          } else {
                            StringBuilder discarded$3 = var6.append(var8);
                            var7++;
                            break L3;
                          }
                        }
                        var7++;
                        var7++;
                        break L2;
                      }
                    }
                    stackOut_31_0 = var6.toString();
                    stackIn_32_0 = stackOut_31_0;
                    break L0;
                  } else {
                    L4: {
                      var7_ref_CharSequence = param2[var6_int];
                      if (var7_ref_CharSequence == null) {
                        var5 += 4;
                        var6_int++;
                        break L4;
                      } else {
                        var5 = var5 + var7_ref_CharSequence.length();
                        var6_int++;
                        var6_int++;
                        break L4;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var4_ref;
            stackOut_33_1 = new StringBuilder().append("ua.B(").append(0).append(',').append(param1).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param2 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L5;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + 4 + ')');
        }
        return stackIn_32_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Current Objective";
    }
}
