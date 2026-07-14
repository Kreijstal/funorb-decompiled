/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class i {
    static String field_b;
    static ho field_i;
    static ll[] field_g;
    static vn field_e;
    static int field_f;
    static String field_h;
    static ll[] field_a;
    tn field_c;
    static int field_d;

    final static qb a(boolean param0) {
        int var1 = 0;
        od var3 = null;
        int[] var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var11 = null;
        int[] var13 = null;
        int[] var15 = null;
        int[] var17 = null;
        byte[] var18 = null;
        int[] var19 = null;
        byte[] var20 = null;
        int[] var21 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (!param0) {
          L0: {
            var1 = jg.field_p[0] * ho.field_i[0];
            var18 = ln.field_I[0];
            if (dn.field_Ib[0]) {
              var20 = vi.field_O[0];
              var21 = new int[var1];
              var17 = var21;
              var13 = var17;
              var11 = var13;
              var5 = var11;
              var6 = 0;
              L1: while (true) {
                if (var6 >= var1) {
                  var3 = new od(pb.field_g, gn.field_a, hl.field_l[0], be.field_d[0], jg.field_p[0], ho.field_i[0], var21);
                  break L0;
                } else {
                  var5[var6] = fj.b(dg.a(255, (int) var20[var6]) << -244698216, ph.field_c[dg.a((int) var18[var6], 255)]);
                  var6++;
                  continue L1;
                }
              }
            } else {
              var19 = new int[var1];
              var15 = var19;
              var8 = var15;
              var5_int = 0;
              L2: while (true) {
                if (var5_int >= var1) {
                  var3 = (od) (Object) new qb(pb.field_g, gn.field_a, hl.field_l[0], be.field_d[0], jg.field_p[0], ho.field_i[0], var19);
                  break L0;
                } else {
                  var8[var5_int] = ph.field_c[dg.a((int) var18[var5_int], 255)];
                  var5_int++;
                  continue L2;
                }
              }
            }
          }
          dk.a(-18229);
          return (qb) (Object) var3;
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 24;
        int var7 = param4;
        ((i) this).field_c.a(param0, param2, var7, var6, 0, param3, param1);
        lj.field_j.a(ec.field_d.field_x, 0, 0, ga.field_r, (byte) -120);
        p.field_d.a(-80 + (-2 + ec.field_d.field_x) - (nn.field_p + 2), 0, 2 + ga.field_r, 18, (byte) -120);
        nk.field_n.a(nn.field_p + 82, ec.field_d.field_x - (nn.field_p - -2) - 80, ga.field_r + 2, 18, (byte) -120);
        nl.field_Gb.a(20, 2, ec.field_d.field_I - ga.field_r + -2 + -20, ec.field_d.field_x, 2 + ga.field_r - -20, 0, -16624, nn.field_p);
        dd.field_c.a(2, 20, nn.field_p, false);
    }

    public static void a(byte param0) {
        field_h = null;
        field_i = null;
        field_e = null;
        if (param0 != 6) {
            return;
        }
        field_b = null;
        field_a = null;
        field_g = null;
    }

    final static void a(ll param0, int param1, int param2, byte param3, nf param4, qb param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        if (param0 != null) {
          L0: {
            param2 = param2 + param5.field_x;
            param1 = param1 + param5.field_o;
            var7 = param2 - -(param4.field_y * param1);
            var8 = 0;
            var9 = param5.field_y;
            var10 = param5.field_q;
            var11 = -var10 + param4.field_y;
            var12 = param6;
            if (-1 < (param1 ^ -1)) {
              var13 = -param1 + 0;
              var9 = var9 - var13;
              param1 = 0;
              var7 = var7 + param4.field_y * var13;
              var8 = var8 + var13 * var10;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if ((param2 ^ -1) <= -1) {
              break L1;
            } else {
              var13 = -param2 + 0;
              param2 = 0;
              var11 = var11 + var13;
              var10 = var10 - var13;
              var8 = var8 + var13;
              var12 = var12 + var13;
              var7 = var7 + var13;
              break L1;
            }
          }
          L2: {
            if ((param4.field_H + -1 ^ -1) <= (var9 + param1 ^ -1)) {
              break L2;
            } else {
              var9 = var9 - (var9 + (param1 + (-param4.field_H - -1)));
              break L2;
            }
          }
          L3: {
            if ((param4.field_y - 1 ^ -1) > (param2 - -var10 ^ -1)) {
              var13 = param2 - -var10 - (-1 + param4.field_y);
              var10 = var10 - var13;
              var11 = var11 + var13;
              var12 = var12 + var13;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if ((var10 ^ -1) >= -1) {
              break L4;
            } else {
              if (0 < var9) {
                fc.a(var7, param5.field_A, var11, 6725, var8, var12, param3, param0.field_m, var10, var9);
                return;
              } else {
                break L4;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(int param0) {
        int var2 = ArcanistsMulti.field_G ? 1 : 0;
        if (!bj.g(false)) {
            if (ka.field_m != null) {
                if (ka.field_m.field_e) {
                    u.b(param0 ^ 6);
                    pm.field_e.b((qm) (Object) new qn(pm.field_e, vi.field_C), 15637);
                }
            }
            return;
        }
        if (param0 != 0) {
            i.a((byte) -47);
        }
        boolean discarded$8 = pm.field_e.a(df.field_y, vi.field_L, true, (byte) -88);
        pm.field_e.i(4);
        while (ib.b(false)) {
            boolean discarded$9 = pm.field_e.a(ed.field_Bb, (byte) 33, vn.field_d);
        }
    }

    final static void a(wk param0, int param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = ArcanistsMulti.field_G ? 1 : 0;
                        var6 = new byte[param1];
                        var2 = var6;
                        if (pg.field_f != null) {
                            statePc = 2;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            pg.field_f.a(0L, -97);
                            pg.field_f.a(-13848, var6);
                            var3_int = 0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (var3_int >= 24) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if ((var2[var3_int] ^ -1) == -1) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var3_int++;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if ((var3_int ^ -1) <= -25) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            param0.a(var2, 0, (byte) -86, 24);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var3 = (Exception) (Object) caughtException;
                        var4 = 0;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (var4 >= 24) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var2[var4] = (byte)-1;
                        var4++;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 14: {
                        param0.a(var2, 0, (byte) -86, 24);
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0) {
        lo.field_q = 200;
        int var1 = 63 % ((-66 - param0) / 47);
        vh.field_n = false;
    }

    i(String param0, kc param1) {
        String[] var3 = new String[]{param0, u.field_d, lm.field_g};
        kc[] var4 = new kc[]{param1, ec.field_d, (kc) (Object) dd.field_c};
        ((i) this).field_c = new tn(0L, ub.field_c, var3, mn.field_t, var4, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You have been removed from <%0>'s game.";
        field_h = "Wands:";
        field_e = new vn();
    }
}
