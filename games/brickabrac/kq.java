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

    public static void a(byte param0) {
        try {
            field_n = null;
            field_k = null;
            field_m = null;
            field_o = null;
            int var1_int = 119 / ((param0 - 71) / 51);
            field_l = null;
            field_j = null;
            field_i = null;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "kq.C(" + param0 + ')');
        }
    }

    public kq() {
    }

    final static void a(int param0, tg param1, Object param2) {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        Object stackOut_13_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param1.field_p != null) {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (var3_int >= 50) {
                        break L4;
                      } else {
                        stackOut_5_0 = null;
                        stackIn_15_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          if (stackIn_6_0 == (Object) (Object) param1.field_p.peekEvent()) {
                            break L4;
                          } else {
                            wj.a(param0 + 4192, 1L);
                            var3_int++;
                            if (var4 == 0) {
                              continue L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    if (param0 == -4317) {
                      break L2;
                    } else {
                      stackOut_13_0 = null;
                      stackIn_15_0 = stackOut_13_0;
                      break L3;
                    }
                  }
                  field_o = (jp) (Object) stackIn_15_0;
                  break L2;
                }
                try {
                  L5: {
                    L6: {
                      if (param2 == null) {
                        break L6;
                      } else {
                        param1.field_p.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
                        break L6;
                      }
                    }
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L7;
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
          L8: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3_ref;
            stackOut_21_1 = new StringBuilder().append("kq.B(").append(param0).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L9;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
    }

    final static String a(gb param0, byte param1) {
        Object var2 = null;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        String stackIn_45_0 = null;
        Object stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        Object stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        Object stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_44_0 = null;
        Object stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        Object stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        Object stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = null;
              var3 = 13 % ((-28 - param1) / 42);
              if (param0.field_q != null) {
                L2: {
                  var2 = (Object) (Object) param0.field_q;
                  if (1 == param0.field_a) {
                    var2 = (Object) (Object) ("<img=0>" + (String) var2);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (param0.field_a != 2) {
                  break L1;
                } else {
                  var2 = (Object) (Object) ("<img=1>" + (String) var2);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              L4: {
                var4 = "";
                if (param0.field_c == 2) {
                  break L4;
                } else {
                  L5: {
                    if (param0.field_c != 0) {
                      break L5;
                    } else {
                      if (th.field_d) {
                        var4 = "[" + fi.field_u + "] ";
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
                      var4 = "[" + rd.a(fm.field_a, new String[1], (byte) 103) + "] ";
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
                        var4 = "[" + jd.field_b + "] ";
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (param0.field_c != 3) {
                      break L8;
                    } else {
                      var4 = "[#" + param0.field_p + "] ";
                      break L8;
                    }
                  }
                  if (!param0.field_e) {
                    var4 = var4 + (String) var2 + ": ";
                    if (var5 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              if (!param0.field_e) {
                L9: {
                  L10: {
                    if (param0.field_f != 0) {
                      break L10;
                    } else {
                      if (param0.field_d == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var4 = rd.a(ek.field_fb, new String[1], (byte) 103);
                  if (var5 == 0) {
                    break L3;
                  } else {
                    break L9;
                  }
                }
                var4 = rd.a(hq.field_x, new String[1], (byte) 103);
                break L3;
              } else {
                break L3;
              }
            }
            stackOut_44_0 = (String) var4;
            stackIn_45_0 = stackOut_44_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_46_0 = var2;
            stackOut_46_1 = new StringBuilder().append("kq.A(");
            stackIn_49_0 = stackOut_46_0;
            stackIn_49_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param0 == null) {
              stackOut_49_0 = stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L11;
            } else {
              stackOut_47_0 = stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_50_0 = stackOut_47_0;
              stackIn_50_1 = stackOut_47_1;
              stackIn_50_2 = stackOut_47_2;
              break L11;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + ',' + param1 + ')');
        }
        return stackIn_45_0;
    }

    final static void a(vn param0, byte param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (0 >= param0.field_v) {
                  break L2;
                } else {
                  jc.field_J.c((param0.field_j >> 2019366216) / param2 + param3, param4 - -((param0.field_m >> -1177875000) / param2));
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param0.field_J <= 0) {
                  break L3;
                } else {
                  gr.field_c.b(param3 - -((param0.field_j >> -1800639416) / param2), param4 - -((param0.field_m >> 1041382888) / param2), 128);
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              gr.field_c.c(param3 + (param0.field_j >> -377519256) / param2, (param0.field_m >> 1153335912) / param2 + param4);
              break L1;
            }
            L4: {
              if (param1 == -119) {
                break L4;
              } else {
                kq.a(-14, (tg) null, (Object) null);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("kq.D(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    kq(int param0) {
        try {
            ((kq) this).field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "kq.<init>(" + param0 + ')');
        }
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
