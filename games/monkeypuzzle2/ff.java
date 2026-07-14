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
        gj.a(param12, wg.field_h, lc.field_e, param2, qj.field_D, rb.field_cb, param10, ki.field_s, param7, param15, param4, param13, param0, param14, hh.field_u, param2 ^ -386, param3, param11, param6, new gg(param1), new gg(param5));
        jk.a(-97, param9, param8);
    }

    public static void a(byte param0) {
        if (param0 != -7) {
            return;
        }
        field_e = null;
        field_a = null;
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        int var9 = 0;
        Object var10 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var9 = MonkeyPuzzle2.field_F ? 1 : 0;
          kb.field_c = kb.field_c + 1;
          if (fg.field_a >= (480 - param0) / 10) {
            break L0;
          } else {
            if (20 <= fg.field_a) {
              break L0;
            } else {
              ul.field_O[fg.field_a] = pf.a((byte) -110, 3);
              hh.field_r[fg.field_a] = 0;
              n.field_d[fg.field_a][0] = (float)(pf.a((byte) 60, 3) + -1);
              n.field_d[fg.field_a][1] = -0.5f;
              pl.field_f[fg.field_a][0] = (float)(pf.a((byte) -88, 480) + 80);
              pl.field_f[fg.field_a][1] = 490.0f;
              fg.field_a = fg.field_a + 1;
              break L0;
            }
          }
        }
        L1: {
          if ((kb.field_c & 7) != 0) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var2 = stackIn_6_0;
          if (param1 == -6961) {
            break L2;
          } else {
            var10 = null;
            ff.a((ta) null, (le[]) null, 32, 126, -22, (le[]) null, 21, -43, -22, true, -125, -11, 113, 78, 111, (ta) null);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          if (var3 >= fg.field_a) {
            return;
          } else {
            L4: {
              if (var2 != 0) {
                hh.field_r[var3] = hh.field_r[var3] + 1;
                if ((hh.field_r[var3] ^ -1) != -5) {
                  break L4;
                } else {
                  hh.field_r[var3] = 0;
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L5: {
              pl.field_f[var3][0] = pl.field_f[var3][0] + n.field_d[var3][0];
              pl.field_f[var3][1] = pl.field_f[var3][1] + n.field_d[var3][1];
              if (pl.field_f[var3][1] >= (float)(5 + param0)) {
                break L5;
              } else {
                pl.field_f[var3][1] = (float)(5 + param0);
                break L5;
              }
            }
            uj.field_k[var3] = uj.field_k[var3] + 1;
            if (uj.field_k[var3] >= 40) {
              L6: {
                if (Math.random() <= 0.8) {
                  break L6;
                } else {
                  n.field_d[var3][0] = (float)((double)n.field_d[var3][0] + (Math.random() - 0.5) * 0.5);
                  break L6;
                }
              }
              L7: {
                var4 = var3 - -1;
                if (var4 >= fg.field_a) {
                  break L7;
                } else {
                  var5 = pl.field_f[var3][0] - pl.field_f[var4][0];
                  var6 = -pl.field_f[var4][1] + pl.field_f[var3][1];
                  var7 = var5 * var5 + var6 * var6;
                  if (var7 >= 400.0f) {
                    if (var7 <= 3600.0f) {
                      n.field_d[var3][0] = (n.field_d[var3][0] + 0.5f * n.field_d[var4][0]) * 0.75f;
                      n.field_d[var3][1] = (n.field_d[var4][1] * 0.5f + n.field_d[var3][1]) * 0.75f;
                      break L7;
                    } else {
                      var8 = 1.0f / (float)Math.sqrt((double)(var6 * var6 + var5 * var5));
                      n.field_d[var3][0] = n.field_d[var3][0] + var5 * var8;
                      n.field_d[var3][1] = n.field_d[var3][1] + var8 * var6;
                      var8 = 1.0f / (float)Math.sqrt((double)(n.field_d[var3][0] * n.field_d[var3][0] + n.field_d[var3][1] * n.field_d[var3][1]));
                      n.field_d[var3][0] = n.field_d[var3][0] * var8;
                      n.field_d[var3][1] = n.field_d[var3][1] * var8;
                      break L7;
                    }
                  } else {
                    var8 = 1.0f / (-(float)Math.sqrt((double)(var5 * var5 + var6 * var6)) + 20.0f);
                    n.field_d[var3][0] = n.field_d[var3][0] + var8 * var5;
                    n.field_d[var3][1] = n.field_d[var3][1] + var6 * var8;
                    var8 = 1.0f / (float)Math.sqrt((double)(n.field_d[var3][0] * n.field_d[var3][0] + n.field_d[var3][1] * n.field_d[var3][1]));
                    n.field_d[var3][0] = n.field_d[var3][0] * var8;
                    n.field_d[var3][1] = n.field_d[var3][1] * var8;
                    break L7;
                  }
                }
              }
              L8: {
                L9: {
                  L10: {
                    if (90.0f <= pl.field_f[var3][0]) {
                      break L10;
                    } else {
                      if (0.0f > n.field_d[var3][0]) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (pl.field_f[var3][0] <= 550.0f) {
                    break L8;
                  } else {
                    if (n.field_d[var3][0] <= 0.0f) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                n.field_d[var3][0] = (float)((double)n.field_d[var3][0] * (Math.random() + -1.0));
                n.field_d[var3][1] = (float)((double)n.field_d[var3][1] + (-0.5 + Math.random()));
                uj.field_k[var3] = 0;
                break L8;
              }
              L11: {
                if ((float)(param0 + 20) <= pl.field_f[var3][1]) {
                  break L11;
                } else {
                  if (0.0f <= n.field_d[var3][1]) {
                    break L11;
                  } else {
                    n.field_d[var3][1] = (float)((double)n.field_d[var3][1] * (-1.0 + Math.random()));
                    n.field_d[var3][0] = (float)((double)n.field_d[var3][0] + (Math.random() - 0.5));
                    uj.field_k[var3] = 0;
                    var3++;
                    continue L3;
                  }
                }
              }
              if (490.0f < pl.field_f[var3][1]) {
                if (n.field_d[var3][1] > 0.0f) {
                  n.field_d[var3][1] = (float)((double)n.field_d[var3][1] * (Math.random() + -1.0));
                  n.field_d[var3][0] = (float)((double)n.field_d[var3][0] + (Math.random() - 0.5));
                  uj.field_k[var3] = 0;
                  var3++;
                  continue L3;
                } else {
                  var3++;
                  continue L3;
                }
              } else {
                var3++;
                continue L3;
              }
            } else {
              var3++;
              continue L3;
            }
          }
        }
    }

    final static int a(boolean param0, int param1, bi param2) {
        if (param1 != -32323) {
            field_a = null;
        }
        return param2.a(param0, 4);
    }

    final static void a(boolean param0, ta param1, ta param2, int param3) {
        if (param0) {
            return;
        }
        sl.field_o = param2;
        fe.field_a = param1;
        rk.field_h = param3;
        tf.a((byte) 56, ge.field_g / 2, ge.field_h / 2);
        wf.a(param2.field_D + param2.field_j, param1.field_j, param2.field_j, 8192, param1.field_j + param1.field_D);
    }

    final static void a(boolean param0, int param1, String param2, String param3) {
        bh.field_b = param3;
        wk.field_d = param2;
        vi.a(k.field_k, 12345, param0);
        if (param1 > -69) {
            field_a = null;
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
        field_e = new char[]{(char)91, (char)93, (char)35};
    }
}
