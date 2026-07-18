/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class al extends mi implements bo, wi {
    static String field_i;
    static oi[] field_j;
    static String field_g;
    rd field_h;

    public final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return ((al) this).field_h.h(54);
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.charAt(0);
            var3 = 1;
            L1: while (true) {
              if (var3 >= param0.length()) {
                L2: {
                  if (param1 >= 123) {
                    break L2;
                  } else {
                    var5 = null;
                    al.a((String) null, -75, (String[]) null, -81);
                    break L2;
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                if (param0.charAt(var3) == var2_int) {
                  var3++;
                  continue L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("al.I(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final static void a(String param0, int param1, String[] param2, int param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        Object var7 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              cb.field_c = rg.field_d;
              if (param3 == 100) {
                break L1;
              } else {
                var6 = null;
                al.a((String) null, -66, 0.017817853018641472f);
                break L1;
              }
            }
            L2: {
              if (param1 != 255) {
                L3: {
                  if (param1 < 100) {
                    break L3;
                  } else {
                    if (105 < param1) {
                      break L3;
                    } else {
                      var4 = param2;
                      nl.a(-22063, var4);
                      int discarded$2 = 7655;
                      de.field_ob = md.a(param2);
                      break L2;
                    }
                  }
                }
                de.field_ob = lc.a(param1, param0, param3 ^ 29521);
                break L2;
              } else {
                L4: {
                  stackOut_4_0 = -32;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (13 <= nf.field_d) {
                    stackOut_6_0 = stackIn_6_0;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L4;
                  } else {
                    stackOut_5_0 = stackIn_5_0;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L4;
                  }
                }
                de.field_ob = Virogrid.b((byte) stackIn_7_0, stackIn_7_1 != 0);
                var7 = null;
                nl.a(-22063, (String[]) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4_ref;
            stackOut_13_1 = new StringBuilder().append("al.K(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
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
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
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
          throw kg.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param3 + ')');
        }
    }

    final wl f(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        wl stackIn_2_0 = null;
        wl stackIn_5_0 = null;
        wl stackIn_9_0 = null;
        Throwable decompiledCaughtException = null;
        wl stackOut_8_0 = null;
        wl stackOut_4_0 = null;
        wl stackOut_1_0 = null;
        try {
          L0: {
            var2_int = ((al) this).field_h.f(-2);
            var3 = ((al) this).field_h.g(param0 ^ 843083348);
            var4 = ((al) this).field_h.g(true);
            int discarded$2 = 0;
            var5 = hn.c();
            if (var4 >= 1890) {
              if (-3 + var5 >= var4) {
                if (!th.a((byte) 127, var4, var2_int, var3)) {
                  stackOut_8_0 = ee.field_c;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  L1: {
                    if (param0 == -843083384) {
                      break L1;
                    } else {
                      field_i = null;
                      break L1;
                    }
                  }
                  break L0;
                }
              } else {
                stackOut_4_0 = ee.field_c;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = ee.field_c;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return ee.field_c;
        }
        return bm.field_i;
    }

    final static void a(byte[] param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var6 = 0;
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= da.field_g.length) {
                break L0;
              } else {
                param2 = da.field_g[var5_int];
                var7 = var5_int << 4;
                L2: while (true) {
                  int incrementValue$12 = param2;
                  param2--;
                  if (incrementValue$12 == 0) {
                    var5_int++;
                    continue L1;
                  } else {
                    int incrementValue$13 = var7;
                    var7++;
                    param3 = bf.field_m[incrementValue$13];
                    param1[param0[param3]] = param1[param0[param3]] + 1;
                    bf.field_m[param1[param0[param3]]] = param3;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("al.J(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + 125 + ')');
        }
    }

    final static void b(int param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == oj.field_Ub) {
                break L0;
              } else {
                L1: {
                  if (0 > param1) {
                    break L1;
                  } else {
                    if (kh.field_c == ug.field_a) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (gk.field_g.field_l != 0) {
                    break L2;
                  } else {
                    if (~(ud.field_a + 10000L) > ~hc.a(-9986)) {
                      gk.field_g.g(param1, 8);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (param0 == -1) {
                    break L3;
                  } else {
                    field_i = null;
                    break L3;
                  }
                }
                L4: {
                  if (0 < gk.field_g.field_l) {
                    {
                      L5: {
                        oj.field_Ub.a(gk.field_g.field_g, param0 + 1, 0, gk.field_g.field_l);
                        ud.field_a = hc.a(-9986);
                        break L5;
                      }
                    }
                    gk.field_g.field_l = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return;
              }
            }
            gk.field_g.field_l = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void i(int param0) {
        if (ae.field_g != null) {
            ae.field_g.d();
        }
        if (!(ac.field_c == null)) {
            ac.field_c.d();
        }
        if (param0 != 100) {
            al.b(89, -96);
        }
    }

    public static void g(int param0) {
        if (param0 != -1) {
            al.i(-50);
        }
        field_i = null;
        field_j = null;
        field_g = null;
    }

    final static boolean h(int param0) {
        if (param0 < 25) {
            al.g(78);
        }
        if (!(qc.field_h)) {
            return false;
        }
        if (sd.field_e == 0) {
            return true;
        }
        return false;
    }

    public final void a(boolean param0, wa param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((al) this).field_h = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("al.T(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final String c(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              var2_int = ((al) this).field_h.f(-2);
              var3 = ((al) this).field_h.g(-39);
              var4 = ((al) this).field_h.g(true);
              int discarded$2 = 0;
              var5 = hn.c();
              if (var4 < 1890) {
                break L1;
              } else {
                if (var4 <= -3 + var5) {
                  if (!th.a((byte) -41, var4, var2_int, var3)) {
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = oi.a(new String[2], re.field_p, 2);
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            break L2;
          }
        }
        L3: {
          if (param0 < -86) {
            break L3;
          } else {
            field_g = null;
            break L3;
          }
        }
        return gf.field_C;
    }

    final static void a(String param0, int param1, float param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ne.field_g = param0;
              j.field_i = param2;
              if (param1 == 13) {
                break L1;
              } else {
                al.g(-11);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("al.G(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(wa param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((al) this).b(false);
              if (param1 == 13) {
                break L1;
              } else {
                ((al) this).field_h = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("al.V(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public al() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new oi[12];
        field_i = "Private";
        field_g = "Open in popup window";
    }
}
