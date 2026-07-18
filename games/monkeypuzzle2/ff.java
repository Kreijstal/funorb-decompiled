/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff implements Runnable {
    static int field_g;
    static String field_a;
    static char[] field_e;
    md field_b;
    volatile va[] field_c;
    volatile boolean field_d;
    volatile boolean field_f;

    final static void a(ta param0, le[] param1, int param2, int param3, int param4, le[] param5, int param6, int param7, int param8, boolean param9, int param10, int param11, int param12, int param13, int param14, ta param15) {
        try {
            gj.a(param12, wg.field_h, lc.field_e, param2, qj.field_D, rb.field_cb, param10, ki.field_s, param7, param15, param4, param13, param0, param14, hh.field_u, param2 ^ -386, param3, param11, param6, new gg(param1), new gg(param5));
            jk.a(-97, param9, param8);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "ff.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + (param15 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var9 = 0;
        Object var10 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              kb.field_c = kb.field_c + 1;
              if (fg.field_a >= (480 - param0) / 10) {
                break L1;
              } else {
                if (20 <= fg.field_a) {
                  break L1;
                } else {
                  ul.field_O[fg.field_a] = pf.a((byte) -110, 3);
                  hh.field_r[fg.field_a] = 0;
                  n.field_d[fg.field_a][0] = (float)(pf.a((byte) 60, 3) + -1);
                  n.field_d[fg.field_a][1] = -0.5f;
                  pl.field_f[fg.field_a][0] = (float)(pf.a((byte) -88, 480) + 80);
                  pl.field_f[fg.field_a][1] = 490.0f;
                  fg.field_a = fg.field_a + 1;
                  break L1;
                }
              }
            }
            L2: {
              if ((kb.field_c & 7) != 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var2_int = stackIn_7_0;
              if (param1 == -6961) {
                break L3;
              } else {
                var10 = null;
                ff.a((ta) null, (le[]) null, 32, 126, -22, (le[]) null, 21, -43, -22, true, -125, -11, 113, 78, 111, (ta) null);
                break L3;
              }
            }
            var3 = 0;
            L4: while (true) {
              if (var3 >= fg.field_a) {
                break L0;
              } else {
                L5: {
                  if (var2_int != 0) {
                    hh.field_r[var3] = hh.field_r[var3] + 1;
                    if (hh.field_r[var3] != 4) {
                      break L5;
                    } else {
                      hh.field_r[var3] = 0;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  pl.field_f[var3][0] = pl.field_f[var3][0] + n.field_d[var3][0];
                  pl.field_f[var3][1] = pl.field_f[var3][1] + n.field_d[var3][1];
                  if (pl.field_f[var3][1] >= (float)(5 + param0)) {
                    break L6;
                  } else {
                    pl.field_f[var3][1] = (float)(5 + param0);
                    break L6;
                  }
                }
                L7: {
                  uj.field_k[var3] = uj.field_k[var3] + 1;
                  if (uj.field_k[var3] < 40) {
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var3++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "ff.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(boolean param0, int param1, bi param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -32323) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            stackOut_2_0 = param2.a(param0, 4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ff.G(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, ta param1, ta param2, int param3) {
        try {
            sl.field_o = param2;
            fe.field_a = param1;
            rk.field_h = param3;
            tf.a((byte) 56, ge.field_g / 2, ge.field_h / 2);
            wf.a(param2.field_D + param2.field_j, param1.field_j, param2.field_j, 8192, param1.field_j + param1.field_D);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "ff.C(" + false + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, int param1, String param2, String param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              bh.field_b = param3;
              wk.field_d = param2;
              vi.a(k.field_k, 12345, param0);
              if (param1 <= -69) {
                break L1;
              } else {
                field_a = null;
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
            stackOut_3_1 = new StringBuilder().append("ff.D(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
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
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
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
          throw la.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    public final void run() {
        int var1_int = 0;
        va var2 = null;
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        ((ff) this).field_d = true;
        try {
            while (!((ff) this).field_f) {
                for (var1_int = 0; 2 > var1_int; var1_int++) {
                    var2 = ((ff) this).field_c[var1_int];
                    if (var2 == null) {
                    } else {
                        var2.c();
                    }
                }
                em.a(10L, false);
                em.a((Object) null, (byte) -101, ((ff) this).field_b);
            }
        } catch (Exception exception) {
            Object var5 = null;
            kk.a((String) null, (byte) 66, (Throwable) (Object) exception);
        } finally {
            ((ff) this).field_d = false;
        }
    }

    final static void a(int param0) {
        lg.field_n.field_b = 0;
        if (param0 < 33) {
            ff.a(-116, 109);
        }
        lg.field_n.field_a = 0;
    }

    ff() {
        ((ff) this).field_c = new va[2];
        ((ff) this).field_f = false;
        ((ff) this).field_d = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Speed Bonus: <%0> pts";
        field_g = 0;
        field_e = new char[]{'[', ']', '#'};
    }
}
