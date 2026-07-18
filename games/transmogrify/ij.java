/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij implements ui {
    private int field_e;
    private int field_b;
    private int field_c;
    private int field_g;
    static wk field_d;
    static int field_a;
    private int field_j;
    static ti field_h;
    private kg field_i;
    private int field_f;

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        fk var13 = null;
        qg stackIn_4_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        qg stackOut_2_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var12 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!(param4 instanceof fk)) {
                stackOut_3_0 = null;
                stackIn_4_0 = (qg) (Object) stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = (qg) param4;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var13 = (fk) (Object) stackIn_4_0;
              sb.a(param4.field_p + param0, param1 - -param4.field_n, param4.field_l, param4.field_h, ((ij) this).field_c);
              if (var13 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            var7 = param4.field_l + -(2 * var13.field_B);
            var8 = var13.field_B + param4.field_p + param0;
            var9 = var13.field_G + (param4.field_n + param1);
            sb.e(var8, var9, var7 + var8, var9, ((ij) this).field_j);
            var10 = -1 + var13.h(-1);
            L3: while (true) {
              if (0 > var10) {
                L4: {
                  var11 = -49 % ((51 - param3) / 47);
                  if (((ij) this).field_i == null) {
                    break L4;
                  } else {
                    ((ij) this).field_i.c(var13.field_k, var8 + var7 / 2, var9 - (-((ij) this).field_i.field_C - var13.field_G), ((ij) this).field_g, ((ij) this).field_b);
                    break L4;
                  }
                }
                break L0;
              } else {
                sb.c(var7 * var13.b((byte) 117, var10) / var13.i(-24733) + var8, var9, ((ij) this).field_e, ((ij) this).field_f);
                var10--;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("ij.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final static String a(String param0, String[] param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_16_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_29_0 = null;
        Object stackOut_15_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              if (0 <= var6_int) {
                var5 = 2 + var6_int;
                L2: while (true) {
                  L3: {
                    if (var3_int <= var5) {
                      break L3;
                    } else {
                      if (!dj.a(param0.charAt(var5), true)) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var7_ref_String = param0.substring(var6_int - -2, var5);
                  if (qj.a((CharSequence) (Object) var7_ref_String, 38)) {
                    if (var3_int <= var5) {
                      continue L1;
                    } else {
                      if (param0.charAt(var5) == 62) {
                        var5++;
                        var8 = aa.a(55, (CharSequence) (Object) var7_ref_String);
                        var4 = var4 + (-var5 - -var6_int + param1[var8].length());
                        continue L1;
                      } else {
                        continue L1;
                      }
                    }
                  } else {
                    continue L1;
                  }
                }
              } else {
                if (param2 < -25) {
                  var6 = new StringBuilder(var4);
                  var5 = 0;
                  var7 = 0;
                  L4: while (true) {
                    var8 = param0.indexOf("<%", var5);
                    if (var8 >= 0) {
                      var5 = 2 + var8;
                      L5: while (true) {
                        L6: {
                          if (var5 >= var3_int) {
                            break L6;
                          } else {
                            if (!dj.a(param0.charAt(var5), true)) {
                              break L6;
                            } else {
                              var5++;
                              continue L5;
                            }
                          }
                        }
                        var9 = param0.substring(2 + var8, var5);
                        if (qj.a((CharSequence) (Object) var9, 49)) {
                          if (var5 >= var3_int) {
                            continue L4;
                          } else {
                            if (param0.charAt(var5) != 62) {
                              continue L4;
                            } else {
                              var5++;
                              var10 = aa.a(66, (CharSequence) (Object) var9);
                              StringBuilder discarded$3 = var6.append(param0.substring(var7, var8));
                              StringBuilder discarded$4 = var6.append(param1[var10]);
                              var7 = var5;
                              continue L4;
                            }
                          }
                        } else {
                          continue L4;
                        }
                      }
                    } else {
                      StringBuilder discarded$5 = var6.append(param0.substring(var7));
                      stackOut_29_0 = var6.toString();
                      stackIn_30_0 = stackOut_29_0;
                      break L0;
                    }
                  }
                } else {
                  stackOut_15_0 = null;
                  stackIn_16_0 = stackOut_15_0;
                  return (String) (Object) stackIn_16_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var3;
            stackOut_31_1 = new StringBuilder().append("ij.A(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L7;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L7;
            }
          }
          L8: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L8;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L8;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + param2 + ')');
        }
        return stackIn_30_0;
    }

    ij(kg param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((ij) this).field_c = param4;
            ((ij) this).field_i = param0;
            ((ij) this).field_b = param2;
            ((ij) this).field_f = param6;
            ((ij) this).field_e = param5;
            ((ij) this).field_g = param1;
            ((ij) this).field_j = param3;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "ij.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new wk();
    }
}
