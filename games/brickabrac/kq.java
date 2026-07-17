/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kq extends nm {
    int field_p;
    static th field_i;
    static String field_n;
    static String field_k;
    static jp field_o;
    static String field_m;
    static String field_l;
    static vl field_j;

    public static void a() {
        field_n = null;
        field_k = null;
        field_m = null;
        field_o = null;
        int var1 = -39;
        field_l = null;
        field_j = null;
        field_i = null;
    }

    public kq() {
    }

    final static void a(int param0, tg param1, Object param2) {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param1.field_p != null) {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  if (var3_int >= 50) {
                    break L2;
                  } else {
                    if (null == param1.field_p.peekEvent()) {
                      break L2;
                    } else {
                      wj.a(-125, 1L);
                      var3_int++;
                      continue L1;
                    }
                  }
                }
                try {
                  L3: {
                    L4: {
                      if (param2 == null) {
                        break L4;
                      } else {
                        param1.field_p.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
                        break L4;
                      }
                    }
                    break L3;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L5;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("kq.B(").append(-4317).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    final static String a(gb param0) {
        Object var2 = null;
        int var3 = 0;
        Object var4 = null;
        String var4_ref = null;
        int var5 = 0;
        String var6 = null;
        String stackIn_36_0 = null;
        Object stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        Object stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        Object stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_35_0 = null;
        Object stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        Object stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        Object stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = null;
              var3 = 1;
              if (param0.field_q != null) {
                L2: {
                  var6 = param0.field_q;
                  var2 = (Object) (Object) var6;
                  var4 = var2;
                  var2 = (Object) (Object) var6;
                  if (1 == param0.field_a) {
                    var2 = (Object) (Object) ("<img=0>" + var6);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (param0.field_a != 2) {
                  break L1;
                } else {
                  var2 = (Object) (Object) ("<img=1>" + var2);
                  var4 = var2;
                  var4 = var2;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              var4_ref = "";
              if (-3 == param0.field_c) {
                if (!param0.field_e) {
                  L4: {
                    if (-1 != param0.field_f) {
                      break L4;
                    } else {
                      if (-1 == param0.field_d) {
                        var4_ref = rd.a(hq.field_x, new String[1], (byte) 103);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var4_ref = rd.a(ek.field_fb, new String[1], (byte) 103);
                  break L3;
                } else {
                  break L3;
                }
              } else {
                L5: {
                  if (-1 != param0.field_c) {
                    break L5;
                  } else {
                    if (th.field_d) {
                      var4_ref = "[" + fi.field_u + "] ";
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (param0.field_c != 1) {
                    break L6;
                  } else {
                    var4_ref = "[" + rd.a(fm.field_a, new String[1], (byte) 103) + "] ";
                    break L6;
                  }
                }
                L7: {
                  if (param0.field_c != 4) {
                    break L7;
                  } else {
                    if (jd.field_b == null) {
                      break L7;
                    } else {
                      var4_ref = "[" + jd.field_b + "] ";
                      break L7;
                    }
                  }
                }
                L8: {
                  if (param0.field_c != 3) {
                    break L8;
                  } else {
                    var4_ref = "[#" + param0.field_p + "] ";
                    break L8;
                  }
                }
                if (!param0.field_e) {
                  var4_ref = var4_ref + var2 + ": ";
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            stackOut_35_0 = (String) var4_ref;
            stackIn_36_0 = stackOut_35_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_37_0 = var2;
            stackOut_37_1 = new StringBuilder().append("kq.A(");
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_40_0 = stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L9;
            } else {
              stackOut_38_0 = stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L9;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 44 + 91 + 41);
        }
        return stackIn_36_0;
    }

    final static void a(vn param0, byte param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 >= param0.field_v) {
                if (param0.field_J <= 0) {
                  gr.field_c.c(param3 + (param0.field_j >> 8) / param2, (param0.field_m >> 8) / param2 + param4);
                  break L1;
                } else {
                  gr.field_c.b(param3 - -((param0.field_j >> 8) / param2), param4 - -((param0.field_m >> 8) / param2), 128);
                  break L1;
                }
              } else {
                jc.field_J.c((param0.field_j >> 8) / param2 + param3, param4 - -((param0.field_m >> 8) / param2));
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("kq.D(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + -119 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    kq(int param0) {
        ((kq) this).field_p = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Well done! <%0>";
        field_i = new th(14, 0, 4, 1);
        field_k = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_m = "<%0> has not yet unlocked this option for use.";
        field_l = "Email (Login):";
        field_j = new vl();
    }
}
