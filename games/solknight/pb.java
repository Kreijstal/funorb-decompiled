/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb implements j {
    static int field_c;
    static int field_b;
    static int[] field_a;

    final static void a(da param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        uh var5 = null;
        int[] var6 = null;
        int var7 = 0;
        jd var8 = null;
        int var9 = 0;
        jd var10 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        var8 = new jd(param0.a(4, "logo.fo3d", ""));
        var10 = var8;
        var3 = var10.j(255);
        var10.d((byte) -83);
        vc.field_f = ml.a(22795, var10);
        wk.field_d = new uh[var3];
        bg.field_v = new int[var3][];
        var4 = 0;
        L0: while (true) {
          if (var3 <= var4) {
            var5_int = -69 % ((param1 - -46) / 41);
            var10.m(0);
            var9 = 0;
            var4 = var9;
            L1: while (true) {
              if (var3 <= var9) {
                return;
              } else {
                var5 = wk.field_d[var9];
                var5.a(8292, 1, 6, 6, 6);
                var5.b(32767);
                var6 = new int[]{var5.field_Q + var5.field_E >> -1993160895, var5.field_m + var5.field_t >> -1724730143, var5.field_G - -var5.field_N >> -211186751};
                bg.field_v[var9] = var6;
                var5.a(-var6[0], -32768, -var6[1], -var6[2]);
                var9++;
                continue L1;
              }
            }
          } else {
            wk.field_d[var4] = ab.a(var8, -14945);
            var4++;
            continue L0;
          }
        }
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        int var6 = param3 + param4.field_m;
        if (param0 <= 113) {
            pb.a(88);
        }
        int var7 = param4.field_j + param1;
        pl.a(true, param4.field_x, param4.field_t, var7, var6);
        o var8 = gb.field_k[1];
        if (param4 instanceof pj) {
            if (!(!((pj) (Object) param4).field_F)) {
                var8.a((-var8.field_q + param4.field_t >> -959043807) + 1 + var6, (param4.field_x - var8.field_r >> 871297313) + (1 + var7), 256);
            }
        }
        if (param4.b(true)) {
            ci.a(-4 + param4.field_t, 2 + var7, -4 + param4.field_x, 2 + var6, (byte) 122);
        }
    }

    final static int a(int param0, CharSequence param1, int param2) {
        if (param0 != 11675) {
            field_c = 69;
        }
        return v.a(param0 ^ -11747, param1, param2, true);
    }

    final static void a(dl param0, Object param1, byte param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = SolKnight.field_L ? 1 : 0;
                    if (null != param0.field_d) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var3_int = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if ((var3_int ^ -1) <= -51) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (null == param0.field_d.peekEvent()) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    i.a((byte) 100, 1L);
                    var3_int++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        var3_int = 13 % ((param2 - -37) / 43);
                        if (param1 == null) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        param0.field_d.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param1, 1001, "dummy"));
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var3 = (Exception) (Object) caughtException;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static aa a(boolean param0, String param1, long param2, int param3, String param4) {
        L0: {
          if ((long)param3 != param2) {
            break L0;
          } else {
            if (param4 != null) {
              return (aa) (Object) new jb(param4, param1);
            } else {
              break L0;
            }
          }
        }
        if (param0) {
          return (aa) (Object) new vb(param2, param1);
        } else {
          return (aa) (Object) new il(param2, param1);
        }
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = 33 % ((param0 - -53) / 41);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 1;
        field_a = new int[8192];
    }
}
