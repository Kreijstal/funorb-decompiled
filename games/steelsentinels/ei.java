/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ei extends ia {
    private String field_w;
    static String field_u;
    static int field_t;
    static gh field_n;
    static String field_x;
    static int field_q;
    static gh field_o;
    static gh field_p;
    private boolean field_s;
    static String field_v;
    static String field_r;

    ei(jf param0) {
        super(param0);
        ((ei) this).field_s = false;
    }

    public static void c(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_n = null;
              if (param0 == 1) {
                break L1;
              } else {
                int discarded$2 = ei.a(83, 71, true);
                break L1;
              }
            }
            field_x = null;
            field_v = null;
            field_r = null;
            field_p = null;
            field_u = null;
            field_o = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "ei.E(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            pb.h(param0, param1, param2, param3, 12105914);
            pb.e(1 + param0, param1 - -1, -2 + param2, param3 + -2, 16251129, 10461345);
            var6 = -126 / ((param4 - 69) / 50);
            var5_int = 64;
            var7 = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var7 > 6) {
                    break L3;
                  } else {
                    pb.h(var7 + param0, var7 + param1, -(var7 * 2) + param2, -(var7 * 2) + param3, 16251129, var5_int);
                    var5_int = var5_int >> 282071745;
                    var7++;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) (Object) runtimeException, "ei.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        e var4 = null;
        String stackIn_4_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        String stackIn_20_0 = null;
        String stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        Object stackOut_10_0 = null;
        String stackOut_19_0 = null;
        String stackOut_21_0 = null;
        Object stackOut_14_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            var3 = va.a((CharSequence) (Object) param1, -1);
            if (null != var3) {
              stackOut_3_0 = (String) var3;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param1.equals((Object) (Object) ((ei) this).field_w)) {
                  break L1;
                } else {
                  L2: {
                    var4 = b.a(false, param1);
                    if (null == var4) {
                      break L2;
                    } else {
                      if (var4.field_e == null) {
                        ((ei) this).field_s = var4.field_d;
                        ((ei) this).field_w = param1;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_10_0 = null;
                  stackIn_11_0 = stackOut_10_0;
                  return (String) (Object) stackIn_11_0;
                }
              }
              if (param0 == 100) {
                if (!((ei) this).field_s) {
                  stackOut_19_0 = fg.field_Qb;
                  stackIn_20_0 = stackOut_19_0;
                  return stackIn_20_0;
                } else {
                  stackOut_21_0 = hf.field_d;
                  stackIn_22_0 = stackOut_21_0;
                  break L0;
                }
              } else {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (String) (Object) stackIn_15_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3_ref;
            stackOut_23_1 = new StringBuilder().append("ei.D(").append(param0).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
        return stackIn_22_0;
    }

    final vd a(String param0, int param1) {
        RuntimeException var3 = null;
        e var3_ref = null;
        vd stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        vd stackIn_18_0 = null;
        vd stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        vd stackOut_3_0 = null;
        vd stackOut_17_0 = null;
        vd stackOut_23_0 = null;
        vd stackOut_21_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            if (!m.a((CharSequence) (Object) param0, (byte) 127)) {
              stackOut_3_0 = fa.field_d;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param1 == -1) {
                L1: {
                  if (!param0.equals((Object) (Object) ((ei) this).field_w)) {
                    L2: {
                      var3_ref = b.a(false, param0);
                      if (var3_ref == null) {
                        break L2;
                      } else {
                        if (null != var3_ref.field_e) {
                          break L2;
                        } else {
                          ((ei) this).field_w = param0;
                          ((ei) this).field_s = var3_ref.field_d;
                          break L1;
                        }
                      }
                    }
                    stackOut_17_0 = ma.field_Y;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0;
                  } else {
                    break L1;
                  }
                }
                L3: {
                  if (!((ei) this).field_s) {
                    stackOut_23_0 = fa.field_d;
                    stackIn_24_0 = stackOut_23_0;
                    break L3;
                  } else {
                    stackOut_21_0 = vf.field_b;
                    stackIn_24_0 = stackOut_21_0;
                    break L3;
                  }
                }
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (vd) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("ei.B(");
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L4;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param1 + ')');
        }
        return stackIn_24_0;
    }

    final static void a(int param0, java.applet.Applet param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              ic.a(-128, "", param1);
              if (param0 == 0) {
                break L1;
              } else {
                field_r = null;
                break L1;
              }
            }
            pf.a(param1, 63);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ei.L(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final void d(int param0) {
        if (param0 < 63) {
            return;
        }
        try {
            ((ei) this).field_w = null;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ei.F(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (param0 != 0) {
                break L1;
              } else {
                var2_int = sg.field_c;
                break L1;
              }
            }
            L2: {
              if (param0 == param1) {
                var2_int = pm.field_Z;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 == 2) {
                var2_int = fi.field_y;
                break L3;
              } else {
                break L3;
              }
            }
            stackOut_10_0 = var2_int;
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ei.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    final static wk[] a(int param0, wk[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        wk var3 = null;
        int var4 = 0;
        wk[] stackIn_4_0 = null;
        wk[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        wk[] stackOut_3_0 = null;
        wk[] stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            var2_int = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~param1.length >= ~var2_int) {
                    break L3;
                  } else {
                    var3 = param1[var2_int];
                    param1[var2_int].field_H = 0;
                    var3.field_D = 0;
                    param1[var2_int].field_z = param1[var2_int].field_A;
                    stackOut_3_0 = (wk[]) param1;
                    stackIn_8_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      stackIn_4_0[var2_int].field_B = param1[var2_int].field_F;
                      var2_int++;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_7_0 = (wk[]) param1;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("ei.J(").append(param0).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_8_0;
    }

    final static void a(int param0, byte param1, int param2) {
        RuntimeException runtimeException = null;
        kj var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = mm.field_g;
              var3.a(param2, (byte) -117);
              var3.a((byte) 127, 3);
              if (param1 == -23) {
                break L1;
              } else {
                field_v = null;
                break L1;
              }
            }
            var3.a((byte) 121, 10);
            var3.d(param0, 98);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) (Object) runtimeException, "ei.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            if (null == bc.field_ub) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param2) {
                L1: {
                  if (aj.field_s > param1) {
                    break L1;
                  } else {
                    if (aj.field_s + bc.field_ub.field_A <= param1) {
                      break L1;
                    } else {
                      if (~mc.field_a < ~param0) {
                        break L1;
                      } else {
                        if (mc.field_a - -bc.field_ub.field_F <= param0) {
                          break L1;
                        } else {
                          stackOut_18_0 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0;
                        }
                      }
                    }
                  }
                }
                L2: {
                  if (~rn.field_u < ~param1) {
                    break L2;
                  } else {
                    if (~param1 <= ~(rn.field_u + bc.field_ub.field_A)) {
                      break L2;
                    } else {
                      if (~od.field_m < ~param0) {
                        break L2;
                      } else {
                        if (bc.field_ub.field_F + od.field_m > param0) {
                          stackOut_32_0 = 1;
                          stackIn_33_0 = stackOut_32_0;
                          return stackIn_33_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                stackOut_34_0 = -1;
                stackIn_35_0 = stackOut_34_0;
                break L0;
              } else {
                stackOut_6_0 = 54;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "ei.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_35_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Quick Chat lobby";
        field_x = "Invite only";
        field_t = 2;
        field_v = "Please select options in the following rows:  ";
        field_r = "Remove <%0> from friend list";
    }
}
