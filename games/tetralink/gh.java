/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    static String field_b;
    static int[] field_a;

    final static Boolean a() {
        Boolean var1 = ui.field_b;
        ui.field_b = null;
        return var1;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, oh[] param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var10 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param0 <= 0) {
                  break L1;
                } else {
                  var5_int = param3[0].field_t;
                  var6 = param3[2].field_t;
                  var7 = param3[1].field_t;
                  param3[0].c(param1, param2);
                  param3[2].c(param1 + param0 + -var6, param2);
                  ra.a(lj.field_a);
                  ra.b(var5_int + param1, param2, -var6 + (param0 + param1), param2 - -param3[1].field_F);
                  var8 = var5_int + param1;
                  var9 = param1 - (-param0 - -var6);
                  param1 = var8;
                  L2: while (true) {
                    if (var9 <= param1) {
                      ra.b(lj.field_a);
                      break L0;
                    } else {
                      param3[1].c(param1, param2);
                      param1 = param1 + var7;
                      continue L2;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("gh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + -125 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        if (!(sj.field_g == null)) {
            if (sj.field_g.b(-20728, param1)) {
                sj.field_g = null;
            }
        }
    }

    final static String a(CharSequence[] param0, int param1, int param2) {
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
        String stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_10_0 = null;
        String stackOut_8_0 = null;
        String stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var9 = TetraLink.field_J;
        try {
          L0: {
            if (param2 == 0) {
              stackOut_3_0 = "";
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param2 == 1) {
                var10 = param0[0];
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
                var4_int = param2;
                var5 = 0;
                var6_int = 0;
                L1: while (true) {
                  if (~var4_int >= ~var6_int) {
                    var6 = new StringBuilder(var5);
                    var7 = 0;
                    L2: while (true) {
                      if (~var7 <= ~var4_int) {
                        stackOut_24_0 = var6.toString();
                        stackIn_25_0 = stackOut_24_0;
                        break L0;
                      } else {
                        L3: {
                          var8 = param0[var7];
                          if (var8 == null) {
                            StringBuilder discarded$5 = var6.append("null");
                            break L3;
                          } else {
                            StringBuilder discarded$6 = var6.append(var8);
                            break L3;
                          }
                        }
                        var7++;
                        continue L2;
                      }
                    }
                  } else {
                    L4: {
                      var7_ref_CharSequence = param0[var6_int];
                      if (var7_ref_CharSequence == null) {
                        var5 += 4;
                        break L4;
                      } else {
                        var5 = var5 + var7_ref_CharSequence.length();
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
            stackOut_26_0 = (RuntimeException) var4_ref;
            stackOut_26_1 = new StringBuilder().append("gh.C(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L5;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + 0 + ',' + param2 + ',' + -2 + ')');
        }
        return stackIn_25_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[4];
        field_b = "Advertising websites";
    }
}
