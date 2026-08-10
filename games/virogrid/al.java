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
        return this.field_h.h(54);
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        String[] var5 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                    var5 = (String[]) null;
                    al.a((String) null, -75, (String[]) null, -81);
                    break L2;
                  }
                }
                stackIn_11_0 = 1;
                break L0;
              } else {
                if ((param0.charAt(var3) ^ -1) == (var2_int ^ -1)) {
                  var3++;
                  continue L1;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("al.I(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final static void a(String param0, int param1, String[] param2, int param3) {
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        String[] var7 = null;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              cb.field_c = rg.field_d;
              if (param3 == 100) {
                break L1;
              } else {
                var6 = (String) null;
                al.a((String) null, -66, 0.017817853018641472f);
                break L1;
              }
            }
            L2: {
              if (-256 != (param1 ^ -1)) {
                L3: {
                  if (param1 < 100) {
                    break L3;
                  } else {
                    if (105 < param1) {
                      break L3;
                    } else {
                      var4 = param2;
                      nl.a(-22063, var4);
                      de.field_ob = md.a(param2, 7655);
                      break L2;
                    }
                  }
                }
                de.field_ob = lc.a(param1, param0, param3 ^ 29521);
                break L2;
              } else {
                L4: {
                  stackIn_6_0 = -32;

                  if (13 <= nf.field_d) {
                    stackIn_7_0 = stackIn_6_0;
                    stackIn_7_1 = 0;
                    break L4;
                  } else {
                    stackIn_7_0 = stackIn_6_0;
                    stackIn_7_1 = 1;
                    break L4;
                  }
                }
                de.field_ob = Virogrid.b((byte) stackIn_7_0, stackIn_7_1 != 0);
                var7 = (String[]) null;
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
            stackIn_15_0 = (RuntimeException) (var4_ref);

            stackIn_15_1 = new StringBuilder().append("al.K(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param3 + ')');
        }
    }

    final wl f(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        wl stackIn_2_0 = null;
        wl stackIn_5_0 = null;
        wl stackIn_9_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        NumberFormatException var2 = null;
        try {
          L0: {
            var2_int = this.field_h.f(-2);
            var3 = this.field_h.g(param0 ^ 843083348);
            var4 = this.field_h.g(true);
            var5 = hn.c(false);
            if (var4 >= 1890) {
              if (-3 + var5 >= var4) {
                if (!th.a((byte) 127, var4, var2_int, var3)) {
                  stackIn_9_0 = ee.field_c;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L1: {
                    if (param0 == -843083384) {
                      break L1;
                    } else {
                      field_i = (String) null;
                      break L1;
                    }
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_5_0 = ee.field_c;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = ee.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return ee.field_c;
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return bm.field_i;
            }
          }
        }
    }

    final static void a(byte[] param0, int[] param1, int param2, int param3, int param4) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var6 = 22 % ((54 - param4) / 42);
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= da.field_g.length) {
                break L0;
              } else {
                param2 = da.field_g[var5_int];
                var7 = var5_int << -70172348;
                L2: while (true) {
                  incrementValue$5 = param2;
                  param2--;
                  if (incrementValue$5 == 0) {
                    var5_int++;
                    continue L1;
                  } else {
                    incrementValue$6 = var7;
                    var7++;
                    param3 = bf.field_m[incrementValue$6];
                    dupTemp$7 = param0[param3];
                    dupTemp$8 = param1[dupTemp$7];
                    param1[dupTemp$7] = dupTemp$8 + 1;
                    bf.field_m[dupTemp$8] = param3;
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
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("al.J(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void b(int param0, int param1) {
        try {
            IOException iOException = null;
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
                    if ((ud.field_a + 10000L ^ -1L) > (hc.a(-9986) ^ -1L)) {
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
                    field_i = (String) null;
                    break L3;
                  }
                }
                L4: {
                  if (0 < gk.field_g.field_l) {
                    try {
                      L5: {
                        oj.field_Ub.a(gk.field_g.field_g, param0 + 1, 0, gk.field_g.field_l);
                        ud.field_a = hc.a(-9986);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        tn.a(false);
                        break L6;
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
        if (-1 == (sd.field_e ^ -1)) {
            return true;
        }
        return false;
    }

    public final void a(boolean param0, wa param1) {
        try {
            if (param0) {
                this.field_h = (rd) null;
            }
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "al.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String c(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = this.field_h.f(-2);
              var3 = this.field_h.g(-39);
              var4 = this.field_h.g(true);
              var5 = hn.c(false);
              if ((var4 ^ -1) > -1891) {
                break L1;
              } else {
                if (var4 <= -3 + var5) {
                  if (!th.a((byte) -41, var4, var2_int, var3)) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackIn_4_0 = oi.a(new String[]{"1890", Integer.toString(var5 + -3)}, re.field_p, 2);
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            decompiledRegionSelector0 = 1;
            break L2;
          }
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          L3: {
            if (param0 < -86) {
              break L3;
            } else {
              field_g = (String) null;
              break L3;
            }
          }
          return gf.field_C;
        }
    }

    final static void a(String param0, int param1, float param2) {
        try {
            ne.field_g = param0;
            j.field_i = param2;
            if (param1 != 13) {
                al.g(-11);
            }
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "al.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(wa param0, int param1) {
        try {
            this.b(false);
            if (param1 != 13) {
                this.field_h = (rd) null;
            }
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "al.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public al() {
    }

    static {
        field_j = new oi[12];
        field_i = "Private";
        field_g = "Open in popup window";
    }
}
