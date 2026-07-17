/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn {
    static int[] field_e;
    static hh field_f;
    static String field_d;
    int field_c;
    static String field_a;
    int field_b;

    final static boolean a(boolean param0) {
        L0: {
          if (di.field_d.field_e) {
            rk.field_e.a(oa.field_w, 100, 1536 * qm.field_c / 64, 8192);
            break L0;
          } else {
            break L0;
          }
        }
        if (di.field_d.b((byte) -18)) {
          if (di.field_d.field_h != 0) {
            if (di.field_d.field_h != 1) {
              return false;
            } else {
              de.field_i = null;
              ce.field_f = new en();
              ua.field_c = new kg();
              mj.field_d = 0;
              n.field_h = false;
              pl.field_q.b(-26480, param0);
              gi.a((byte) -66);
              return true;
            }
          } else {
            pa.a(true);
            mj.field_d = 0;
            p.field_h = 2;
            gi.a((byte) -74);
            return true;
          }
        } else {
          return false;
        }
    }

    public static void a() {
        field_a = null;
        field_d = null;
        field_f = null;
        field_e = null;
    }

    final static int b() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!pn.p(-108)) {
                L2: {
                  cb.field_c.a(hk.a((byte) 122, sf.field_c, ng.field_ob), (byte) 120, hk.a((byte) 122, dh.field_d, bj.field_y));
                  if (!cb.field_c.b((byte) -18)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (cb.field_c.field_h < 0) {
                        break L4;
                      } else {
                        var3 = wh.field_j[cb.field_c.field_h];
                        if (2 == var3) {
                          int discarded$3 = 0;
                          ah.e();
                          break L3;
                        } else {
                          if (var3 == 5) {
                            int discarded$4 = 0;
                            ah.e();
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (f.field_j == 2) {
                      break L3;
                    } else {
                      int discarded$5 = 0;
                      ah.e();
                      break L3;
                    }
                  }
                }
                L5: {
                  if (var3 != 0) {
                    break L5;
                  } else {
                    if (f.field_j == 2) {
                      var4 = -bd.field_k + td.b(128);
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (0 < var6) {
                        break L5;
                      } else {
                        sn.a(5, 0, true);
                        var3 = 2;
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                stackOut_25_0 = var3;
                stackIn_26_0 = stackOut_25_0;
                break L0;
              } else {
                L6: {
                  cb.field_c.c((byte) 6);
                  if (cb.field_c.b((byte) -18)) {
                    var1_int = 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (nk.field_n != 13) {
                  continue L1;
                } else {
                  var2 = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "fn.E(" + -14 + 41);
        }
        return stackIn_26_0;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static String a(n param0) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          try {
            L0: {
              var3_int = param0.b(true);
              if (var3_int <= 80) {
                break L0;
              } else {
                var3_int = 80;
                break L0;
              }
            }
            var4 = new byte[var3_int];
            param0.field_m = param0.field_m + mn.field_q.a(var4, true, 0, param0.field_m, var3_int, param0.field_g);
            var5 = qi.a(var3_int, 0, var4, (byte) -94);
            stackOut_2_0 = (String) var5;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackOut_4_0 = "Cabbage";
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L1: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("fn.G(");
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
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 10241 + 44 + 80 + 41);
        }
    }

    final static boolean a(char param0) {
        if (!Character.isISOControl(param0)) {
          if (k.a(true, param0)) {
            return true;
          } else {
            if (45 != param0) {
              if (param0 != 160) {
                if (param0 != 32) {
                  if (param0 == 95) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    fn(int param0, int param1) {
        ((fn) this).field_b = param1;
        ((fn) this).field_c = param0;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = EscapeVector.field_A;
        try {
            if (param0 <= 30) {
                fn.a((byte) 80);
            }
            ib.field_f.a(237);
            for (var1_int = 0; 32 > var1_int; var1_int++) {
                wi.field_d[var1_int] = 0L;
            }
            for (var1_int = 0; var1_int < 32; var1_int++) {
                c.field_t[var1_int] = 0L;
            }
            s.field_z = 0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "fn.F(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[]{21, 1, 22};
        field_d = "If you do nothing the game will revert to normal view in <%0> second.";
        field_a = "CTRL";
    }
}
