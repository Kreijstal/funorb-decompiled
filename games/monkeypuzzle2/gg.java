/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static String field_b;
    private le[] field_a;

    final static String a(String[] args, String param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = param1.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param1.indexOf("<%", var5);
              if (var6_int < 0) {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L2: while (true) {
                  var8 = param1.indexOf("<%", var5);
                  if (0 > var8) {
                    L3: {
                      StringBuilder discarded$3 = var6.append(param1.substring(var7));
                      if (param2) {
                        break L3;
                      } else {
                        var12 = null;
                        gg.a((int[]) null, 25, (byte[]) null, 86, -42);
                        break L3;
                      }
                    }
                    stackOut_24_0 = var6.toString();
                    stackIn_25_0 = stackOut_24_0;
                    break L0;
                  } else {
                    var5 = 2 + var8;
                    L4: while (true) {
                      L5: {
                        if (var3_int <= var5) {
                          break L5;
                        } else {
                          if (!re.a(-49, param1.charAt(var5))) {
                            break L5;
                          } else {
                            var5++;
                            continue L4;
                          }
                        }
                      }
                      var9 = param1.substring(var8 - -2, var5);
                      if (!ra.a((CharSequence) (Object) var9, (byte) -128)) {
                        continue L2;
                      } else {
                        if (var5 >= var3_int) {
                          continue L2;
                        } else {
                          if (param1.charAt(var5) != 62) {
                            continue L2;
                          } else {
                            var5++;
                            var10 = vi.a(43, (CharSequence) (Object) var9);
                            StringBuilder discarded$4 = var6.append(param1.substring(var7, var8));
                            StringBuilder discarded$5 = var6.append(args[var10]);
                            var7 = var5;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var5 = 2 + var6_int;
                L6: while (true) {
                  L7: {
                    if (var5 >= var3_int) {
                      break L7;
                    } else {
                      if (!re.a(-49, param1.charAt(var5))) {
                        break L7;
                      } else {
                        var5++;
                        continue L6;
                      }
                    }
                  }
                  var7_ref_String = param1.substring(var6_int - -2, var5);
                  if (!ra.a((CharSequence) (Object) var7_ref_String, (byte) 84)) {
                    continue L1;
                  } else {
                    if (var3_int <= var5) {
                      continue L1;
                    } else {
                      if (62 == param1.charAt(var5)) {
                        var5++;
                        var8 = vi.a(61, (CharSequence) (Object) var7_ref_String);
                        var4 = var4 + (args[var8].length() - -var6_int - var5);
                        continue L1;
                      } else {
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("gg.F(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (args == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          L9: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          throw la.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param2 + ')');
        }
        return stackIn_25_0;
    }

    final static void a(int[] param0, int param1, byte[] param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 > 71) {
                break L1;
              } else {
                var8 = null;
                String discarded$14 = gg.a((String[]) null, (String) null, false);
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (var5_int >= hb.field_l.length) {
                break L0;
              } else {
                param3 = hb.field_l[var5_int];
                var6 = var5_int << 4;
                L3: while (true) {
                  int incrementValue$15 = param3;
                  param3--;
                  if (incrementValue$15 == 0) {
                    var5_int++;
                    continue L2;
                  } else {
                    int incrementValue$16 = var6;
                    var6++;
                    param1 = dj.field_c[incrementValue$16];
                    param0[param2[param1]] = param0[param2[param1]] + 1;
                    dj.field_c[param0[param2[param1]]] = param1;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("gg.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw la.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        lb.a(param1, param0, (byte) -123, ((gg) this).field_a, param3, param4);
        if (param2) {
            ((gg) this).field_a = null;
        }
    }

    final static int c(int param0) {
        if (param0 != 0) {
            field_b = null;
        }
        return (int)(1000000000L / ed.field_d);
    }

    final static dk b(int param0) {
        if (null == ok.field_f) {
            ok.field_f = new dk();
            ok.field_f.a(t.field_z, false);
            ok.field_f.field_m = pf.field_c;
            ok.field_f.field_p = 6;
            ok.field_f.field_f = 4;
            ok.field_f.field_b = 14;
            ok.field_f.field_r = 7697781;
            ok.field_f.field_k = 0;
            ok.field_f.field_n = 5;
            ok.field_f.field_s = 2763306;
        }
        return ok.field_f;
    }

    gg(le[] param0) {
        try {
            ((gg) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "gg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Log in / Create account";
    }
}
