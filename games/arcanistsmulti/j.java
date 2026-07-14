/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j implements pf {
    static String field_c;
    static String field_e;
    static qb field_a;
    static kc field_f;
    static String field_b;
    private ti field_d;
    static volatile int field_g;

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_f = null;
        field_b = null;
        field_e = null;
        if (param0 != -122) {
            Object var2 = null;
            mi discarded$0 = j.a((ml) null, -73, (byte) -49, (nf) null, -70, 53, 100);
        }
    }

    final static int a(int param0, int param1) {
        if (param1 >= -100) {
            int discarded$0 = j.a(42, -19, 22);
        }
        param0 = param0 & 8191;
        if (-4097 < (param0 ^ -1)) {
            return (param0 ^ -1) <= -2049 ? -ge.field_l[param0 + -2048] : ge.field_l[2048 + -param0];
        }
        return -6145 < (param0 ^ -1) ? -ge.field_l[6144 + -param0] : ge.field_l[-6144 + param0];
    }

    final static int a(int param0, int param1, int param2) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        int var3 = 1;
        while (param0 < -2) {
            if (-1 != (param0 & 1)) {
                var3 = var3 * param2;
            }
            param0 = param0 >> 1;
            param2 = param2 * param2;
        }
        if (param1 >= -29) {
            int discarded$0 = j.a(-40, -118);
        }
        if (!(param0 != 1)) {
            return param2 * var3;
        }
        return var3;
    }

    final static mi a(ml param0, int param1, byte param2, nf param3, int param4, int param5, int param6) {
        int var8 = 117 % ((param2 - -43) / 50);
        mi var7 = (mi) (Object) uh.field_n.c(true);
        if (var7 == null) {
            return new mi(param6, param4, param5, param1, param0, param3);
        }
        var7.a(-104, param6, param1, param5, param4, param3, param0);
        return var7;
    }

    final static void b(int param0) {
        try {
            if (null != pg.field_f) {
                try {
                    pg.field_f.a(0L, -101);
                    pg.field_f.a((byte) -53, df.field_z.field_g, df.field_z.field_j, 24);
                } catch (Exception exception) {
                }
            }
            int var1 = 125 / ((param0 - 27) / 38);
            df.field_z.field_g = df.field_z.field_g + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0) {
        nj.field_c = 0;
        if (param0) {
            int discarded$0 = j.a(121, 53, 31);
        }
        ef.field_r = true;
    }

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ArcanistsMulti.field_G ? 1 : 0;
                    var1 = (Object) (Object) ch.field_a;
                    // monitorenter ch.field_a
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        hg.field_b = hg.field_b + 1;
                        vk.field_u = gn.field_b;
                        if (0 <= ub.field_b) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var2 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((var2 ^ -1) <= -113) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ri.field_b[var2] = false;
                        var2++;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ub.field_b = go.field_g;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (ub.field_b == go.field_g) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2 = dk.field_d[go.field_g];
                        go.field_g = 1 + go.field_g & 127;
                        if (var2 >= 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ri.field_b[var2 ^ -1] = false;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ri.field_b[var2] = true;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        gn.field_b = pi.field_a;
                        if (param0 == 24) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        field_e = null;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        // monitorexit var1
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) var3;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        String var9 = null;
        int var10 = 0;
        Object var11 = null;
        L0: {
          var6 = param0.field_n + param2;
          var7 = param0.field_j + param3;
          kh.a(param0.field_v, var6, var7, param0.field_k, 83);
          if (!param0.d(-2116)) {
            break L0;
          } else {
            oj.a(-32171, var7 + 2, var6 - -2, -4 + param0.field_k, param0.field_v - 4);
            break L0;
          }
        }
        L1: {
          de.h(var6, var7, -2 + (var6 - -param0.field_v), param0.field_k + var7);
          var8 = ((j) this).field_d.field_P.g(126);
          if (var8 != null) {
            var9 = var8.toString();
            ((j) this).field_d.field_Q.a(var9, var6 - -2, -1 + (((j) this).field_d.field_Q.field_C + param0.field_k >> 918147425) + var7, 10000536, -1);
            if (!((j) this).field_d.d(-2116)) {
              break L1;
            } else {
              if (!var9.startsWith(((j) this).field_d.field_D)) {
                break L1;
              } else {
                var10 = ((j) this).field_d.field_Q.b(((j) this).field_d.field_D);
                de.e(var6 - -2, 2 + var7, var10, -4 + param0.field_k, 2188450, 100);
                break L1;
              }
            }
          } else {
            break L1;
          }
        }
        L2: {
          de.a();
          if (param1 == 5592405) {
            break L2;
          } else {
            var11 = null;
            j.a(false, (String) null, true, false);
            break L2;
          }
        }
    }

    j(ti param0) {
        ((j) this).field_d = param0;
    }

    final static void a(boolean param0, String param1, boolean param2, boolean param3) {
        hk.d(-24225);
        p.field_b.f(-117);
        if (param3) {
            int discarded$0 = j.a(-101, 37, 87);
        }
        wh.field_f = new e(ge.field_g, (String) null, hk.field_s, param0, param2);
        g.field_e = new no(p.field_b, (qm) (Object) wh.field_f);
        p.field_b.b((qm) (Object) g.field_e, 15637);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Book of Cogs";
        field_e = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_g = -1;
        field_b = "Flame spells focus on explosions and fire-based mayhem.";
    }
}
