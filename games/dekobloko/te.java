/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends wm {
    private rk field_s;
    private rk field_u;
    static String field_t;
    static int field_w;
    static volatile int field_r;
    static int field_p;
    static boolean[] field_v;
    static String field_q;

    final String a(String param0, byte param1) {
        String discarded$2 = null;
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        String stackIn_27_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_30_0 = null;
        String stackOut_28_0 = null;
        String stackOut_26_0 = null;
        String stackOut_23_0 = null;
        String stackOut_20_0 = null;
        String stackOut_14_0 = null;
        String stackOut_11_0 = null;
        String stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            var7 = this.field_s.field_E.toLowerCase();
            var4 = param0.toLowerCase();
            if (var4.length() != 0) {
              var5 = var4;
              if (!client.a(param1 + 111, var5)) {
                if (qf.a(var5, 0)) {
                  stackOut_8_0 = uk.field_y;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  if (!mc.a(var5, (byte) -121)) {
                    if (!this.c(param0, (byte) 14)) {
                      L1: {
                        if (param1 == -11) {
                          break L1;
                        } else {
                          var6 = (String) null;
                          discarded$2 = this.a((String) null, (byte) -103);
                          break L1;
                        }
                      }
                      if (var7.length() <= 0) {
                        stackOut_30_0 = e.field_c;
                        stackIn_31_0 = stackOut_30_0;
                        break L0;
                      } else {
                        if (!nn.a(false, var7, var5)) {
                          if (!ij.a(var5, var7, (byte) -126)) {
                            if (!he.a(var7, (byte) -11, var5)) {
                              stackOut_28_0 = pe.field_c;
                              stackIn_29_0 = stackOut_28_0;
                              return stackIn_29_0;
                            } else {
                              stackOut_26_0 = rb.field_g;
                              stackIn_27_0 = stackOut_26_0;
                              return stackIn_27_0;
                            }
                          } else {
                            stackOut_23_0 = ng.field_j;
                            stackIn_24_0 = stackOut_23_0;
                            return stackIn_24_0;
                          }
                        } else {
                          stackOut_20_0 = rb.field_g;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        }
                      }
                    } else {
                      stackOut_14_0 = bg.field_f;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    }
                  } else {
                    stackOut_11_0 = lf.field_b;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                }
              } else {
                stackOut_4_0 = pe.field_c;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) ((Object) stackIn_2_0);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var3);
            stackOut_32_1 = new StringBuilder().append("te.A(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L2;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ')');
        }
        return stackIn_31_0;
    }

    te(rk param0, rk param1, rk param2) {
        super(param0);
        try {
            this.field_u = param2;
            this.field_s = param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "te.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(int param0) {
        field_q = null;
        field_v = null;
        field_t = null;
    }

    private final boolean c(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var3 = this.field_u.field_E.toLowerCase();
              var4 = param0.toLowerCase();
              if (0 >= var3.length()) {
                break L1;
              } else {
                if (var4.length() <= 0) {
                  break L1;
                } else {
                  var5 = var3.lastIndexOf("@");
                  if (var5 < 0) {
                    break L1;
                  } else {
                    if (var5 >= -1 + var3.length()) {
                      break L1;
                    } else {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(var5 - -1);
                      if (var4.indexOf(var6) >= 0) {
                        stackOut_6_0 = 1;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0 != 0;
                      } else {
                        if (var4.indexOf(var7) < 0) {
                          break L1;
                        } else {
                          stackOut_9_0 = 1;
                          stackIn_10_0 = stackOut_9_0;
                          return stackIn_10_0 != 0;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3_ref);
            stackOut_13_1 = new StringBuilder().append("te.C(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + 14 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final static int a(String param0, int param1, int param2, String[] param3, mm param4) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
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
        int stackIn_5_0 = 0;
        int stackIn_22_0 = 0;
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
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_21_0 = 0;
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
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var13 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param4.a(param0);
              if (~var5_int < ~param2) {
                break L1;
              } else {
                if (param0.indexOf("<br>") == -1) {
                  param3[0] = param0;
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                } else {
                  break L1;
                }
              }
            }
            var6 = (param2 + var5_int + -1) / param2;
            param2 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            var8 = param0.length();
            var9 = 0;
            L2: while (true) {
              if (~var9 <= ~var8) {
                L3: {
                  if (~var7 <= ~var8) {
                    break L3;
                  } else {
                    incrementValue$2 = var6;
                    var6++;
                    param3[incrementValue$2] = param0.substring(var7, var8).trim();
                    break L3;
                  }
                }
                L4: {
                  if (param1 > 65) {
                    break L4;
                  } else {
                    field_t = (String) null;
                    break L4;
                  }
                }
                stackOut_21_0 = var6;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              } else {
                L5: {
                  L6: {
                    var10 = param0.charAt(var9);
                    if (32 == var10) {
                      break L6;
                    } else {
                      if (45 == var10) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var11 = param0.substring(var7, var9 + 1).trim();
                  var12 = param4.a(var11);
                  if (param2 <= var12) {
                    var7 = var9 + 1;
                    incrementValue$3 = var6;
                    var6++;
                    param3[incrementValue$3] = var11;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L7: {
                  if (62 != var10) {
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var5);
            stackOut_23_1 = new StringBuilder().append("te.E(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          L9: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          L10: {
            stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param4 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        return stackIn_22_0;
    }

    final tb b(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        tb stackIn_2_0 = null;
        tb stackIn_5_0 = null;
        tb stackIn_10_0 = null;
        tb stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        tb stackOut_11_0 = null;
        tb stackOut_9_0 = null;
        tb stackOut_4_0 = null;
        tb stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var3 = this.field_s.field_E.toLowerCase();
            var4 = param0.toLowerCase();
            if (0 != var4.length()) {
              if (gf.a(-118, var3, var4)) {
                L1: {
                  if (param1 == -40) {
                    break L1;
                  } else {
                    field_w = -71;
                    break L1;
                  }
                }
                if (!this.c(param0, (byte) 14)) {
                  stackOut_11_0 = dc.field_b;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = vm.field_u;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                stackOut_4_0 = vm.field_u;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = vm.field_u;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3_ref);
            stackOut_13_1 = new StringBuilder().append("te.B(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    static {
        field_t = null;
        field_r = -1;
        field_v = new boolean[64];
    }
}
