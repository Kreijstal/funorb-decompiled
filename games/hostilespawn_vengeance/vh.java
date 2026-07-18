/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    private bd[] field_b;
    static java.awt.Font field_d;
    static byte[][] field_a;
    static String field_c;

    final static void a(oj param0, int param1, oj param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        double var3_double = 0.0;
        int var4 = 0;
        int var5 = 0;
        double var5_double = 0.0;
        double var7 = 0.0;
        oc var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2.field_n) {
                break L1;
              } else {
                if (!kc.a((byte) -124, param2.field_j)) {
                  nl.field_b = 180;
                  param2.field_I = 1000;
                  return;
                } else {
                  pm.field_a = true;
                  param2.field_w = 1;
                  param2.field_n = true;
                  tk.a(1, jc.field_c, 31, true);
                  break L1;
                }
              }
            }
            L2: {
              nl.field_b = 256;
              if (param2.field_e > 0) {
                param2.field_e = param2.field_e - 1;
                break L2;
              } else {
                var3_int = (int)(((double)param0.field_j.field_e + param0.field_l.field_f - (double)param2.field_j.field_e - param2.field_l.field_f) * 24.0);
                var4 = (int)(24.0 * (-param2.field_l.field_a + (param0.field_l.field_a + (double)param0.field_j.field_g - (double)param2.field_j.field_g)));
                if (512 < Math.abs(var3_int)) {
                  break L2;
                } else {
                  if (Math.abs(var4) <= 512) {
                    param2.field_e = param2.field_e - 1;
                    if (param2.field_e >= 0) {
                      break L2;
                    } else {
                      mm.field_m[el.field_j] = new oj(param2.field_j, 3, rl.field_c);
                      mm.field_m[el.field_j].field_M = 0;
                      el.field_j = el.field_j + 1;
                      param2.field_e = 100;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
            }
            L3: {
              param2.field_p = param2.field_p + 1;
              if (param2.field_w != 4) {
                if (param2.field_p < param2.field_C) {
                  break L3;
                } else {
                  param2.field_p = 0;
                  param2.field_z = param2.field_z + 1;
                  break L3;
                }
              } else {
                L4: {
                  if (-5 >= param2.field_p) {
                    param2.field_p = 0;
                    param2.field_z = param2.field_z + 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (-7 != param2.field_z) {
                    break L5;
                  } else {
                    if (0 != param2.field_p) {
                      break L5;
                    } else {
                      L6: {
                        var3_double = param2.field_c * 3.141592653589793 / 128.0;
                        var5_double = param2.field_l.field_f + ((double)param2.field_j.field_e - 0.5) - Math.sin(var3_double);
                        var7 = param2.field_l.field_a + ((double)param2.field_j.field_g - 0.5) - Math.cos(var3_double);
                        var9 = new oc((int)var5_double, (int)var7);
                        var10 = var9.b(-4);
                        wh.a(true, var10);
                        wh.a(true, var10 + -ln.field_a.field_d);
                        wh.a(true, -1 + var10);
                        wh.a(true, 1 + var10);
                        wh.a(true, var10 + ln.field_a.field_d);
                        wh.a(true, -ln.field_a.field_d + var10 + -1);
                        wh.a(true, var10 + -1 - -ln.field_a.field_d);
                        wh.a(true, -ln.field_a.field_d + (var10 - -1));
                        wh.a(true, ln.field_a.field_d + var10 + 1);
                        var10 = param2.field_j.b(-4);
                        if (128.0 > param2.field_c) {
                          stackOut_22_0 = -1;
                          stackIn_23_0 = stackOut_22_0;
                          break L6;
                        } else {
                          stackOut_21_0 = 1;
                          stackIn_23_0 = stackOut_21_0;
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          var11 = stackIn_23_0;
                          if (64.0 > param2.field_c) {
                            break L8;
                          } else {
                            if (param2.field_c <= 192.0) {
                              stackOut_27_0 = ln.field_a.field_d;
                              stackIn_28_0 = stackOut_27_0;
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        stackOut_26_0 = -ln.field_a.field_d;
                        stackIn_28_0 = stackOut_26_0;
                        break L7;
                      }
                      var12 = stackIn_28_0;
                      wh.a(true, var10);
                      wh.a(true, var11 + var10);
                      wh.a(true, var12 + var10);
                      wh.a(true, var12 + (var10 + var11));
                      break L5;
                    }
                  }
                }
                if (re.field_D[4].length > param2.field_z) {
                  break L3;
                } else {
                  param2.field_z = 0;
                  param2.field_w = 1;
                  break L3;
                }
              }
            }
            L9: {
              if (1 == param2.field_w) {
                L10: {
                  var3_double = nh.a(-12149, (p) (Object) param2, (p) (Object) param0);
                  param2.a(225, var3_double, 3);
                  li.field_r = param2.a(ln.field_a, 128, param2.field_o);
                  var5 = param2.field_j.b(-4);
                  wh.a(true, var5);
                  wh.a(true, var5 - 1);
                  wh.a(true, var5 + -ln.field_a.field_d);
                  wh.a(true, -1 + var5 - ln.field_a.field_d);
                  if (li.field_r[0]) {
                    break L10;
                  } else {
                    if (!li.field_r[1]) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                param2.field_p = 0;
                param2.field_z = 0;
                param2.field_w = 4;
                if (1 == uj.field_l) {
                  tk.a(5, jc.field_c, 35, true);
                  break L9;
                } else {
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L11: {
              if (0 < param2.field_I) {
                break L11;
              } else {
                if (param2.field_w != 5) {
                  param2.field_w = 5;
                  param2.e((byte) -49);
                  param2.field_p = 0;
                  param2.field_z = 0;
                  break L11;
                } else {
                  break L11;
                }
              }
            }
            L12: {
              if (5 != param2.field_w) {
                break L12;
              } else {
                if (param2.field_z == re.field_D[5].length) {
                  param2.c((byte) -86);
                  var3_int = 0;
                  L13: while (true) {
                    if (10 <= var3_int) {
                      L14: {
                        if (bm.field_c != 0) {
                          break L14;
                        } else {
                          kd.a(0, 1);
                          break L14;
                        }
                      }
                      bn.a(3, param2);
                      break L12;
                    } else {
                      mm.field_m[el.field_j] = new oj(param2.field_j, 3, rl.field_c);
                      el.field_j = el.field_j + 1;
                      var3_int++;
                      continue L13;
                    }
                  }
                } else {
                  break L12;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var3;
            stackOut_55_1 = new StringBuilder().append("vh.A(");
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param0 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L15;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L15;
            }
          }
          L16: {
            stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
            stackOut_58_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',').append(5).append(',');
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param2 == null) {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L16;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L16;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_61_0, stackIn_61_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        hm.a(param0, ((vh) this).field_b, false, param2, param1, param3);
        if (param4 != 5) {
            field_d = null;
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                param0 = v.a(-18214, '_', "", param0);
                var3 = ia.a(param2, 10);
                if (-1 != param0.indexOf(param2)) {
                  break L2;
                } else {
                  if (-1 == param0.indexOf(var3)) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("vh.D(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(29360).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        am var3 = null;
        int var4 = 0;
        hm var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var5 = (hm) (Object) ih.field_x.g(-77);
            L1: while (true) {
              if (var5 == null) {
                var2_int = 36;
                var3 = ei.field_h.g(-79);
                L2: while (true) {
                  if (var3 == null) {
                    break L0;
                  } else {
                    wg.d(-9420, 4);
                    var3 = ei.field_h.a(12684);
                    continue L2;
                  }
                }
              } else {
                ci.a(4, 2, var5);
                var5 = (hm) (Object) ih.field_x.a(12684);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "vh.C(" + 113 + ',' + 4 + ')');
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
        field_a = null;
    }

    vh(bd[] param0) {
        try {
            ((vh) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "vh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
