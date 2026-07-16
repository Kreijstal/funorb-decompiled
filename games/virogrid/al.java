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
        int var3 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        int var2 = param0.charAt(0);
        for (var3 = 1; var3 < param0.length(); var3++) {
            if (param0.charAt(var3) != var2) {
                return false;
            }
        }
        if (param1 < 123) {
            Object var5 = null;
            al.a((String) null, -75, (String[]) null, -81);
        }
        return true;
    }

    final static void a(String param0, int param1, String[] param2, int param3) {
        String[] var4 = null;
        int var5 = 0;
        Object var6 = null;
        Object var7 = null;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        L0: {
          var5 = Virogrid.field_F ? 1 : 0;
          cb.field_c = rg.field_d;
          if (param3 == 100) {
            break L0;
          } else {
            var6 = null;
            al.a((String) null, -66, 0.017817853018641472f);
            break L0;
          }
        }
        L1: {
          if (-256 != (param1 ^ -1)) {
            L2: {
              if (param1 < 100) {
                break L2;
              } else {
                if (105 < param1) {
                  break L2;
                } else {
                  var4 = param2;
                  nl.a(-22063, var4);
                  de.field_ob = md.a(param2, 7655);
                  break L1;
                }
              }
            }
            de.field_ob = lc.a(param1, param0, param3 ^ 29521);
            break L1;
          } else {
            L3: {
              stackOut_3_0 = -32;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (13 <= nf.field_d) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L3;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L3;
              }
            }
            de.field_ob = Virogrid.b((byte) stackIn_6_0, stackIn_6_1 != 0);
            var7 = null;
            nl.a(-22063, (String[]) null);
            break L1;
          }
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
            var5 = hn.c(false);
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

    final static void a(byte[] param0, int[] param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var7 = 0;
        int var8 = Virogrid.field_F ? 1 : 0;
        int var6 = 22 % ((54 - param4) / 42);
        for (var5 = 0; var5 < da.field_g.length; var5++) {
            param2 = da.field_g[var5];
            var7 = var5 << -70172348;
            while (true) {
                int incrementValue$0 = param2;
                param2--;
                if (incrementValue$0 == 0) {
                    break;
                }
                int incrementValue$1 = var7;
                var7++;
                param3 = bf.field_m[incrementValue$1];
                param1[param0[param3]] = param1[param0[param3]] + 1;
                bf.field_m[param1[param0[param3]]] = param3;
            }
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
                    field_i = null;
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
        if (param0) {
            ((al) this).field_h = null;
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
              var5 = hn.c(false);
              if ((var4 ^ -1) > -1891) {
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
        ne.field_g = param0;
        j.field_i = param2;
        if (param1 != 13) {
            al.g(-11);
        }
    }

    public final void a(wa param0, int param1) {
        ((al) this).b(false);
        if (param1 != 13) {
            ((al) this).field_h = null;
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
