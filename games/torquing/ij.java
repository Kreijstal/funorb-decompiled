/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ij extends gf {
    static long field_l;
    private tk field_m;
    static int[] field_o;
    private tk field_n;

    public static void f(int param0) {
        field_o = null;
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_23_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_11_0 = null;
        String stackOut_32_0 = null;
        String stackOut_22_0 = null;
        String stackOut_30_0 = null;
        String stackOut_28_0 = null;
        String stackOut_25_0 = null;
        String stackOut_17_0 = null;
        String stackOut_14_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        try {
          L0: {
            var6 = ((ij) this).field_m.field_m.toLowerCase();
            var4 = param1.toLowerCase();
            if (0 != var4.length()) {
              L1: {
                if (param0 == -121) {
                  break L1;
                } else {
                  ((ij) this).field_n = null;
                  break L1;
                }
              }
              var5 = var4;
              if (va.b(var5, 25326)) {
                stackOut_7_0 = dj.field_b;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                if (hk.a(true, var5)) {
                  stackOut_11_0 = nh.field_q;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  if (!fm.a((byte) -98, var5)) {
                    if (!this.b((byte) -6, param1)) {
                      if (var6.length() <= 0) {
                        stackOut_32_0 = ci.field_b;
                        stackIn_33_0 = stackOut_32_0;
                        break L0;
                      } else {
                        if (tm.a(true, var5, var6)) {
                          stackOut_22_0 = jn.field_a;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        } else {
                          if (!rh.a(true, var6, var5)) {
                            if (!vk.a(var6, 4096, var5)) {
                              stackOut_30_0 = dj.field_b;
                              stackIn_31_0 = stackOut_30_0;
                              return stackIn_31_0;
                            } else {
                              stackOut_28_0 = jn.field_a;
                              stackIn_29_0 = stackOut_28_0;
                              return stackIn_29_0;
                            }
                          } else {
                            stackOut_25_0 = nh.field_o;
                            stackIn_26_0 = stackOut_25_0;
                            return stackIn_26_0;
                          }
                        }
                      }
                    } else {
                      stackOut_17_0 = fi.field_f;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    }
                  } else {
                    stackOut_14_0 = jg.field_u;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  }
                }
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var3;
            stackOut_34_1 = new StringBuilder().append("ij.H(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ')');
        }
        return stackIn_33_0;
    }

    private final boolean b(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              var4 = 15 % ((79 - param0) / 43);
              var3 = ((ij) this).field_n.field_m.toLowerCase();
              var5 = param1.toLowerCase();
              if (var3.length() <= 0) {
                break L1;
              } else {
                if (var5.length() > 0) {
                  var6 = var3.lastIndexOf("@");
                  if (0 > var6) {
                    break L1;
                  } else {
                    if (-1 + var3.length() <= var6) {
                      break L1;
                    } else {
                      var7 = var3.substring(0, var6);
                      var8 = var3.substring(var6 + 1);
                      if (var5.indexOf(var7) >= 0) {
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0 != 0;
                      } else {
                        if (var5.indexOf(var8) < 0) {
                          break L1;
                        } else {
                          stackOut_10_0 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          return stackIn_11_0 != 0;
                        }
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("ij.D(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final cd a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        Object stackIn_2_0 = null;
        cd stackIn_6_0 = null;
        cd stackIn_9_0 = null;
        cd stackIn_12_0 = null;
        cd stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        cd stackOut_5_0 = null;
        cd stackOut_13_0 = null;
        cd stackOut_11_0 = null;
        cd stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            var3 = ((ij) this).field_m.field_m.toLowerCase();
            if (param0 > 62) {
              var4 = param1.toLowerCase();
              if (var4.length() == 0) {
                stackOut_5_0 = so.field_u;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (cd.a(var4, 18, var3)) {
                  if (!this.b((byte) -56, param1)) {
                    stackOut_13_0 = so.field_s;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    stackOut_11_0 = so.field_u;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                } else {
                  stackOut_8_0 = so.field_u;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (cd) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("ij.F(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L1;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_14_0;
    }

    final static void e(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ni var4_ref_ni = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        qa var9 = null;
        df var10 = null;
        byte[] var14 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var10 = kj.field_d;
              var2 = var10.i((byte) -101);
              if (var2 == 0) {
                var9 = (qa) (Object) qf.field_a.b(0);
                if (var9 == null) {
                  ih.b(true);
                  return;
                } else {
                  L2: {
                    var4 = var10.i((byte) -101);
                    if (var4 != 0) {
                      var14 = new byte[var4];
                      var10.a(48, var4, var14, 0);
                      break L2;
                    } else {
                      var5 = null;
                      break L2;
                    }
                  }
                  var10.field_n = var10.field_n + 4;
                  if (var10.h(-31017)) {
                    var9.f(0);
                    break L1;
                  } else {
                    ih.b(true);
                    return;
                  }
                }
              } else {
                if (1 == var2) {
                  var3 = var10.c((byte) -59);
                  var4_ref_ni = (ni) (Object) vb.field_f.b(0);
                  L3: while (true) {
                    L4: {
                      if (var4_ref_ni == null) {
                        break L4;
                      } else {
                        if (var3 == var4_ref_ni.field_k) {
                          break L4;
                        } else {
                          var4_ref_ni = (ni) (Object) vb.field_f.f(-24059);
                          continue L3;
                        }
                      }
                    }
                    if (var4_ref_ni == null) {
                      ih.b(true);
                      return;
                    } else {
                      var4_ref_ni.f(0);
                      break L1;
                    }
                  }
                } else {
                  nn.a("A1: " + me.a(-1), (Throwable) null, -9958);
                  ih.b(true);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "ij.O(" + 10078 + ')');
        }
    }

    ij(tk param0, tk param1, tk param2) {
        super(param0);
        try {
            ((ij) this).field_m = param1;
            ((ij) this).field_n = param2;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "ij.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var11 = Torquing.field_u;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param2.length();
            var8 = 0;
            L1: while (true) {
              if (var8 >= var7) {
                stackOut_30_0 = var5;
                stackIn_31_0 = stackOut_30_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    var9 = param2.charAt(var8);
                    if (0 != var8) {
                      break L3;
                    } else {
                      if (45 != var9) {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        var4_int = 1;
                        break L2;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (48 > var9) {
                        break L5;
                      } else {
                        if (var9 > 57) {
                          break L5;
                        } else {
                          var9 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (var9 > 90) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    if (var9 < 97) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0 != 0;
                    } else {
                      if (var9 <= 122) {
                        var9 -= 87;
                        break L4;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (var9 < 10) {
                    L7: {
                      if (var4_int == 0) {
                        break L7;
                      } else {
                        var9 = -var9;
                        break L7;
                      }
                    }
                    var10 = var6 * 10 + var9;
                    if (var10 / 10 != var6) {
                      stackOut_26_0 = 0;
                      stackIn_27_0 = stackOut_26_0;
                      return stackIn_27_0 != 0;
                    } else {
                      var6 = var10;
                      var5 = 1;
                      break L2;
                    }
                  } else {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    return stackIn_21_0 != 0;
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var4;
            stackOut_32_1 = new StringBuilder().append("ij.K(").append(true).append(',').append(10).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L8;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L8;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + -98 + ')');
        }
        return stackIn_31_0 != 0;
    }

    static {
    }
}
