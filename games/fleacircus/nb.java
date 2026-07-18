/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static f field_a;
    static fa field_c;
    static sf field_f;
    static int field_g;
    static int[] field_d;
    static int field_i;
    static int field_b;
    static String field_e;
    static int field_h;

    final static void a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                nb.a((byte) -101);
                break L1;
              }
            }
            L2: {
              if (!qh.c((byte) 65)) {
                L3: {
                  if (vc.field_b) {
                    break L3;
                  } else {
                    L4: {
                      if (fg.field_x != null) {
                        break L4;
                      } else {
                        fg.field_x = ed.a(16777215, 4);
                        break L4;
                      }
                    }
                    if (!fg.field_x.field_n) {
                      break L3;
                    } else {
                      fleas.field_L = fleas.field_L & ~fg.field_x.field_k;
                      kh.field_b = kh.field_b | fg.field_x.field_k;
                      vc.field_b = true;
                      fg.field_x = null;
                      break L3;
                    }
                  }
                }
                if (mf.field_a != null) {
                  var1_int = 0;
                  var2 = 0;
                  L5: while (true) {
                    if (var2 >= 2) {
                      if (var1_int != 2) {
                        break L2;
                      } else {
                        mf.field_a = null;
                        break L2;
                      }
                    } else {
                      L6: {
                        if (mf.field_a[var2] != null) {
                          break L6;
                        } else {
                          mf.field_a[var2] = pi.a(var2, 1, 5, 124);
                          break L6;
                        }
                      }
                      L7: {
                        if (mf.field_a[var2] == null) {
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var2++;
                      continue L5;
                    }
                  }
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "nb.A(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 <= 33) {
            return;
        }
        field_d = null;
        field_f = null;
        field_e = null;
        field_a = null;
    }

    final static double a(double param0, int param1) {
        int var3 = 70 / ((-56 - param1) / 63);
        return tg.field_c[65535 & (int)(32768.0 * param0 / 3.141592653589793)];
    }

    final static int a(String param0, int param1, fa param2, String[] param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var13 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param2.b(param0);
              if (var5_int > param1) {
                break L1;
              } else {
                if (param0.indexOf("<br>") != -1) {
                  break L1;
                } else {
                  param3[0] = param0;
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0;
                }
              }
            }
            var6 = (var5_int + (param1 - 1)) / param1;
            param1 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            var8 = param0.length();
            var9 = 0;
            L2: while (true) {
              if (var9 >= var8) {
                L3: {
                  if (var8 <= var7) {
                    break L3;
                  } else {
                    int incrementValue$2 = var6;
                    var6++;
                    param3[incrementValue$2] = param0.substring(var7, var8).trim();
                    break L3;
                  }
                }
                stackOut_18_0 = var6;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                L4: {
                  L5: {
                    var10 = param0.charAt(var9);
                    if (var10 == 32) {
                      break L5;
                    } else {
                      if (45 != var10) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var11 = param0.substring(var7, 1 + var9).trim();
                  var12 = param2.b(var11);
                  if (param1 <= var12) {
                    int incrementValue$3 = var6;
                    var6++;
                    param3[incrementValue$3] = var11;
                    var7 = var9 - -1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if (var10 != 62) {
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("nb.B(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          L9: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + 1 + ')');
        }
        return stackIn_19_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
        field_b = 40;
        field_e = "Members only";
    }
}
