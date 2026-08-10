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
            throw la.a((Throwable) ((Object) runtimeException), "ff.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + (param15 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != -7) {
            return;
        }
        field_e = null;
        field_a = null;
    }

    final static void a(int param0, int param1) {
        float[] dupTemp$0 = null;
        float[] dupTemp$1 = null;
        int dupTemp$2 = 0;
        float[] dupTemp$3 = null;
        float[] dupTemp$4 = null;
        float[] dupTemp$5 = null;
        float[] dupTemp$6 = null;
        float[] dupTemp$7 = null;
        float[] dupTemp$8 = null;
        float[] dupTemp$9 = null;
        float[] dupTemp$10 = null;
        float[] dupTemp$11 = null;
        float[] dupTemp$12 = null;
        float[] dupTemp$13 = null;
        float[] dupTemp$14 = null;
        float[] dupTemp$15 = null;
        float[] dupTemp$16 = null;
        float[] dupTemp$17 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        int var9 = 0;
        ta var10 = null;
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
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 1;
                break L2;
              }
            }
            L3: {
              var2_int = stackIn_7_0;
              if (param1 == -6961) {
                break L3;
              } else {
                var10 = (ta) null;
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
                    if ((hh.field_r[var3] ^ -1) != -5) {
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
                  dupTemp$0 = pl.field_f[var3];
                  dupTemp$0[0] = dupTemp$0[0] + n.field_d[var3][0];
                  dupTemp$1 = pl.field_f[var3];
                  dupTemp$1[1] = dupTemp$1[1] + n.field_d[var3][1];
                  if (pl.field_f[var3][1] >= (float)(5 + param0)) {
                    break L6;
                  } else {
                    pl.field_f[var3][1] = (float)(5 + param0);
                    break L6;
                  }
                }
                dupTemp$2 = uj.field_k[var3];
                uj.field_k[var3] = dupTemp$2 + 1;
                if (dupTemp$2 >= 40) {
                  L7: {
                    if (Math.random() <= 0.8) {
                      break L7;
                    } else {
                      dupTemp$3 = n.field_d[var3];
                      dupTemp$3[0] = (float)((double)dupTemp$3[0] + (Math.random() - 0.5) * 0.5);
                      break L7;
                    }
                  }
                  L8: {
                    var4 = var3 - -1;
                    if (var4 >= fg.field_a) {
                      break L8;
                    } else {
                      var5 = pl.field_f[var3][0] - pl.field_f[var4][0];
                      var6 = -pl.field_f[var4][1] + pl.field_f[var3][1];
                      var7 = var5 * var5 + var6 * var6;
                      if (var7 >= 400.0f) {
                        if (var7 <= 3600.0f) {
                          n.field_d[var3][0] = (n.field_d[var3][0] + 0.5f * n.field_d[var4][0]) * 0.75f;
                          n.field_d[var3][1] = (n.field_d[var4][1] * 0.5f + n.field_d[var3][1]) * 0.75f;
                          break L8;
                        } else {
                          var8 = 1.0f / (float)Math.sqrt((double)(var6 * var6 + var5 * var5));
                          dupTemp$4 = n.field_d[var3];
                          dupTemp$4[0] = dupTemp$4[0] + var5 * var8;
                          dupTemp$5 = n.field_d[var3];
                          dupTemp$5[1] = dupTemp$5[1] + var8 * var6;
                          var8 = 1.0f / (float)Math.sqrt((double)(n.field_d[var3][0] * n.field_d[var3][0] + n.field_d[var3][1] * n.field_d[var3][1]));
                          dupTemp$6 = n.field_d[var3];
                          dupTemp$6[0] = dupTemp$6[0] * var8;
                          dupTemp$7 = n.field_d[var3];
                          dupTemp$7[1] = dupTemp$7[1] * var8;
                          break L8;
                        }
                      } else {
                        var8 = 1.0f / (-(float)Math.sqrt((double)(var5 * var5 + var6 * var6)) + 20.0f);
                        dupTemp$8 = n.field_d[var3];
                        dupTemp$8[0] = dupTemp$8[0] + var8 * var5;
                        dupTemp$9 = n.field_d[var3];
                        dupTemp$9[1] = dupTemp$9[1] + var6 * var8;
                        var8 = 1.0f / (float)Math.sqrt((double)(n.field_d[var3][0] * n.field_d[var3][0] + n.field_d[var3][1] * n.field_d[var3][1]));
                        dupTemp$10 = n.field_d[var3];
                        dupTemp$10[0] = dupTemp$10[0] * var8;
                        dupTemp$11 = n.field_d[var3];
                        dupTemp$11[1] = dupTemp$11[1] * var8;
                        break L8;
                      }
                    }
                  }
                  L9: {
                    L10: {
                      L11: {
                        if (90.0f <= pl.field_f[var3][0]) {
                          break L11;
                        } else {
                          if (0.0f > n.field_d[var3][0]) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      if (pl.field_f[var3][0] <= 550.0f) {
                        break L9;
                      } else {
                        if (n.field_d[var3][0] <= 0.0f) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    dupTemp$12 = n.field_d[var3];
                    dupTemp$12[0] = (float)((double)dupTemp$12[0] * (Math.random() + -1.0));
                    dupTemp$13 = n.field_d[var3];
                    dupTemp$13[1] = (float)((double)dupTemp$13[1] + (-0.5 + Math.random()));
                    uj.field_k[var3] = 0;
                    break L9;
                  }
                  L12: {
                    L13: {
                      if ((float)(param0 + 20) <= pl.field_f[var3][1]) {
                        break L13;
                      } else {
                        if (0.0f <= n.field_d[var3][1]) {
                          break L13;
                        } else {
                          dupTemp$14 = n.field_d[var3];
                          dupTemp$14[1] = (float)((double)dupTemp$14[1] * (-1.0 + Math.random()));
                          dupTemp$15 = n.field_d[var3];
                          dupTemp$15[0] = (float)((double)dupTemp$15[0] + (Math.random() - 0.5));
                          uj.field_k[var3] = 0;
                          break L12;
                        }
                      }
                    }
                    if (490.0f < pl.field_f[var3][1]) {
                      if (n.field_d[var3][1] > 0.0f) {
                        dupTemp$16 = n.field_d[var3];
                        dupTemp$16[1] = (float)((double)dupTemp$16[1] * (Math.random() + -1.0));
                        dupTemp$17 = n.field_d[var3];
                        dupTemp$17[0] = (float)((double)dupTemp$17[0] + (Math.random() - 0.5));
                        uj.field_k[var3] = 0;
                        break L12;
                      } else {
                        break L12;
                      }
                    } else {
                      var3++;
                      continue L4;
                    }
                  }
                  var3++;
                  continue L4;
                } else {
                  var3++;
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "ff.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(boolean param0, int param1, bi param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -32323) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = param2.a(param0, 4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ff.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, ta param1, ta param2, int param3) {
        if (param0) {
            return;
        }
        try {
            sl.field_o = param2;
            fe.field_a = param1;
            rk.field_h = param3;
            tf.a((byte) 56, ge.field_g / 2, ge.field_h / 2);
            wf.a(param2.field_D + param2.field_j, param1.field_j, param2.field_j, 8192, param1.field_j + param1.field_D);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ff.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, int param1, String param2, String param3) {
        try {
            bh.field_b = param3;
            wk.field_d = param2;
            vi.a(k.field_k, 12345, param0);
            if (param1 > -69) {
                field_a = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ff.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final void run() {
        int var1_int = 0;
        va var2 = null;
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        this.field_d = true;
        try {
            while (!this.field_f) {
                for (var1_int = 0; 2 > var1_int; var1_int++) {
                    var2 = this.field_c[var1_int];
                    if (var2 == null) {
                    } else {
                        var2.c();
                    }
                }
                em.a(10L, false);
                em.a((Object) null, (byte) -101, this.field_b);
            }
        } catch (Exception exception) {
            String var5 = (String) null;
            kk.a((String) null, (byte) 66, (Throwable) ((Object) exception));
        } finally {
            this.field_d = false;
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
        this.field_c = new va[2];
        this.field_f = false;
        this.field_d = false;
    }

    static {
        field_a = "Speed Bonus: <%0> pts";
        field_g = 0;
        field_e = new char[]{(char)91, (char)93, (char)35};
    }
}
