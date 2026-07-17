/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static String field_b;
    static boolean field_a;

    final static void a(int param0, String[] param1, int param2, int param3, int param4, java.applet.Applet param5) {
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              df.field_L = param5.getParameter("overxgames");
              if (null == df.field_L) {
                df.field_L = "0";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              fi.field_o = param5.getParameter("overxachievements");
              if (fi.field_o != null) {
                break L2;
              } else {
                fi.field_o = "0";
                break L2;
              }
            }
            L3: {
              var6 = param5.getParameter("currency");
              if (var6 == null) {
                ej.field_S = 2;
                break L3;
              } else {
                int discarded$23 = 1;
                if (te.a((CharSequence) (Object) var6)) {
                  ej.field_S = ta.a((CharSequence) (Object) var6, -121);
                  break L3;
                } else {
                  ej.field_S = 2;
                  break L3;
                }
              }
            }
            me.field_k = 16777215;
            da.field_b = 0;
            dh.field_h = -1;
            wg.field_l = new ci[param1.length];
            var7 = 0;
            L4: while (true) {
              if (param1.length <= var7) {
                vi.field_j = param1;
                break L0;
              } else {
                wg.field_l[var7] = new ci(317, 34);
                var7++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var6_ref;
            stackOut_17_1 = new StringBuilder().append("li.A(").append(22957).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(0).append(44).append(-1).append(44).append(16777215).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param5 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = param1.length;
            var3 = new byte[var2_int];
            ka.a(param1, 0, var3, 0, var2_int);
            stackOut_0_0 = (byte[]) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("li.C(").append(0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    final static boolean a(boolean param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            if (param1 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var3_int = param1.length();
              if (var3_int < 1) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                if (12 >= var3_int) {
                  L1: {
                    if (param2 == 18116) {
                      break L1;
                    } else {
                      var9 = null;
                      boolean discarded$1 = li.a(true, (CharSequence) null, 20);
                      break L1;
                    }
                  }
                  L2: {
                    var4 = hm.a((byte) 6, param1);
                    if (var4 == null) {
                      break L2;
                    } else {
                      if (var4.length() < 1) {
                        break L2;
                      } else {
                        L3: {
                          if (ad.a((byte) 120, var4.charAt(0))) {
                            break L3;
                          } else {
                            if (!ad.a((byte) 117, var4.charAt(var4.length() - 1))) {
                              var5 = 0;
                              var6 = 0;
                              L4: while (true) {
                                if (param1.length() <= var6) {
                                  if (var5 <= 0) {
                                    stackOut_35_0 = 1;
                                    stackIn_36_0 = stackOut_35_0;
                                    break L0;
                                  } else {
                                    stackOut_33_0 = 0;
                                    stackIn_34_0 = stackOut_33_0;
                                    return stackIn_34_0 != 0;
                                  }
                                } else {
                                  L5: {
                                    var7 = param1.charAt(var6);
                                    if (ad.a((byte) 88, (char) var7)) {
                                      var5++;
                                      break L5;
                                    } else {
                                      var5 = 0;
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if (var5 < 2) {
                                      break L6;
                                    } else {
                                      if (param0) {
                                        break L6;
                                      } else {
                                        stackOut_29_0 = 0;
                                        stackIn_30_0 = stackOut_29_0;
                                        return stackIn_30_0 != 0;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L4;
                                }
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0 != 0;
                      }
                    }
                  }
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0 != 0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var3;
            stackOut_37_1 = new StringBuilder().append("li.E(").append(param0).append(44);
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L7;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L7;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 44 + param2 + 41);
        }
        return stackIn_36_0 != 0;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param0 >> 16;
        int var4 = param0 & 65535;
        int var5 = param2 >> 16;
        int var6 = 65535 & param2;
        return var5 * var4 + var3 * param2 + (var6 * var4 >> 16);
    }

    public static void a() {
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Loading extra data";
        field_a = false;
    }
}
