/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    private bd[] field_b;
    static java.awt.Font field_d;
    static byte[][] field_a;
    static String field_c;

    final static void a(oj param0, int param1, oj param2) {
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        double var3_double = 0.0;
        RuntimeException var3 = null;
        int var4 = 0;
        double var5_double = 0.0;
        int var5 = 0;
        double var7 = 0.0;
        oc var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
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
                  decompiledRegionSelector0 = 0;
                  break L0;
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
              if (-1 > (param2.field_e ^ -1)) {
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
                    if ((param2.field_e ^ -1) <= -1) {
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
                  if (-5 >= (param2.field_p ^ -1)) {
                    param2.field_p = 0;
                    param2.field_z = param2.field_z + 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (-7 != (param2.field_z ^ -1)) {
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
                          stackIn_23_0 = -1;
                          break L6;
                        } else {
                          stackIn_23_0 = 1;
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
                              stackIn_28_0 = ln.field_a.field_d;
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        stackIn_28_0 = -ln.field_a.field_d;
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
                  var3_double = nh.a(-12149, param2, param0);
                  param2.a(param1 ^ 228, var3_double, 3);
                  li.field_r = param2.a(ln.field_a, 128, param2.field_o);
                  var5 = param2.field_j.b(param1 + -9);
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
                if ((param2.field_w ^ -1) != -6) {
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
              L13: {
                if (param1 != param2.field_w) {
                  break L13;
                } else {
                  if (param2.field_z == re.field_D[5].length) {
                    param2.c((byte) -86);
                    var3_int = 0;
                    L14: while (true) {
                      if (10 <= var3_int) {
                        L15: {
                          if (-1 != (bm.field_c ^ -1)) {
                            break L15;
                          } else {
                            kd.a(0, 1);
                            break L15;
                          }
                        }
                        bn.a(3, param2);
                        break L13;
                      } else {
                        mm.field_m[el.field_j] = new oj(param2.field_j, 3, rl.field_c);
                        el.field_j = el.field_j + 1;
                        var3_int++;
                        continue L14;
                      }
                    }
                  } else {
                    break L12;
                  }
                }
              }
              break L12;
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackIn_57_0 = (RuntimeException) (var3);

            stackIn_57_1 = new StringBuilder().append("vh.A(");

            if (param0 == null) {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "null";
              break L16;
            } else {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_60_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "null";
              break L17;
            } else {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "{...}";
              break L17;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_58_0), stackIn_61_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        hm.a(param0, this.field_b, false, param2, param1, param3);
        if (param4 != 5) {
            field_d = (java.awt.Font) null;
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param0 = v.a(-18214, '_', "", param0);
              if (param1 == 29360) {
                break L1;
              } else {
                field_a = (byte[][]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = ia.a(param2, 10);
                if (-1 != param0.indexOf(param2)) {
                  break L3;
                } else {
                  if (-1 == param0.indexOf(var3)) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("vh.D(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        am var3 = null;
        int var4 = 0;
        hm var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var5 = (hm) ((Object) ih.field_x.g(-77));
            L1: while (true) {
              if (var5 == null) {
                var2_int = 109 / ((param0 - -73) / 52);
                var3 = ei.field_h.g(-79);
                L2: while (true) {
                  if (var3 == null) {
                    break L0;
                  } else {
                    wg.d(-9420, param1);
                    var3 = ei.field_h.a(12684);
                    continue L2;
                  }
                }
              } else {
                ci.a(param1, 2, var5);
                var5 = (hm) ((Object) ih.field_x.a(12684));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "vh.C(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            field_c = (String) null;
        }
        field_d = null;
        field_a = (byte[][]) null;
    }

    vh(bd[] param0) {
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "vh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
