/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no {
    static ri field_e;
    static boolean field_b;
    static String field_a;
    static int[] field_c;
    static boolean[] field_f;
    static String field_d;

    final static void a(int param0, int param1) {
        try {
            int var2 = 0;
            l var3 = null;
            jn var4 = null;
            int var5_int = 0;
            fs var5 = null;
            int var6 = 0;
            int var8_int = 0;
            ln var8 = null;
            ln[] var9_ref_ln__ = null;
            int var9 = 0;
            int var10_int = 0;
            ln var10 = null;
            int var12 = 0;
            ln var13 = null;
            ln var13_ref = null;
            int var14 = 0;
            ln[] var15 = null;
            ln var16 = null;
            ln[] var17 = null;
            Object var18 = null;
            ln var18_ref = null;
            ln var19 = null;
            ln[] var20 = null;
            ln[] var21 = null;
            ln var22 = null;
            ln var22_ref = null;
            fs var23 = null;
            sd var24 = null;
            fs var25 = null;
            ln var26 = null;
            ln var26_ref = null;
            sd var27 = null;
            fs var28 = null;
            ln var29 = null;
            ln var29_ref = null;
            ln var30 = null;
            ln var31 = null;
            sd var32 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18_ref = null;
                        var14 = ShatteredPlansClient.field_F ? 1 : 0;
                        var2 = -105 / ((-38 - param0) / 46);
                        if (kb.field_x < param1) {
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
                        try {
                            kb.field_x = param1;
                            var3 = wl.field_a.a(117, kb.field_x, true);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        var4 = (jn) (Object) caughtException;
                        throw new RuntimeException("Failed to advance Tutorial to stage " + kb.field_x + ". ");
                    }
                    case 5: {
                        var15 = oq.field_a.field_P.field_g.field_e;
                        var5_int = 0;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (var5_int >= var15.length) {
                            statePc = 38;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        var16 = var15[var5_int];
                        var13 = var16;
                        var22 = var13;
                        var13 = var16;
                        var18_ref = var3.field_e[var5_int];
                        var18_ref.field_u = var16.field_u;
                        var18_ref.field_G = var16.field_G;
                        var18_ref.field_x = var16.field_x;
                        var18_ref.field_J = var16.field_J;
                        var18_ref.field_L = var16.field_L;
                        var8_int = 0;
                        var17 = var16.field_D;
                        var10_int = 0;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (var10_int >= var17.length) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        var19 = var17[var10_int];
                        var13 = var19;
                        var22 = var13;
                        var13 = var19;
                        if (!var18_ref.b(var19, (byte) 10)) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        var10_int++;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 11: {
                        var8_int++;
                        var10_int++;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 12: {
                        if ((var8_int ^ -1) >= -1) {
                            statePc = 22;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var9_ref_ln__ = new ln[var18_ref.field_D.length - -var8_int];
                        var8_int = 0;
                        var10_int = 0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (var18_ref.field_D.length <= var10_int) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        var9_ref_ln__[var10_int] = var18_ref.field_D[var10_int];
                        var10_int++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 16: {
                        var20 = var16.field_D;
                        var12 = 0;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (var20.length <= var12) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        var13_ref = var20[var12];
                        var22 = var13_ref;
                        var26 = var22;
                        var22 = var13_ref;
                        if (!var18_ref.b(var13_ref, (byte) 10)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        var12++;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 20: {
                        var9_ref_ln__[var8_int + var10_int] = var3.field_e[var13_ref.field_p];
                        var8_int++;
                        var12++;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 21: {
                        var18_ref.field_D = var9_ref_ln__;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        var18_ref.field_t = var16.field_t;
                        var18_ref.field_y = var16.field_y;
                        var18_ref.field_R = var16.field_R;
                        if (var16.field_y != null) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        var5_int++;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 24: {
                        var9 = 0;
                        if (var16.field_R == null) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (var16 == var16.field_R.field_q) {
                            statePc = 27;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        var9 = 1;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 28: {
                        var10_int = 0;
                        if (var16.field_y == null) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        if (var16.field_y.field_m.field_q == var16) {
                            statePc = 31;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        var10_int = 1;
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
                        var18_ref.field_R.a(-21771, var18_ref);
                        if (var9 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        var18_ref.field_R.field_q = var18_ref;
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 34: {
                        var18_ref.field_y.field_m.a(-21771, var18_ref);
                        if (var10_int != 0) {
                            statePc = 36;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        var18_ref.field_y.field_m.field_q = var18_ref;
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 37: {
                        var16.b((byte) -71);
                        var16.a(16);
                        var5_int++;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 38: {
                        oq.field_a.a(var3, 6);
                        if (id.field_d != null) {
                            statePc = 40;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    }
                    case 40: {
                        id.field_d = var3.field_e[id.field_d.field_p];
                        statePc = 41;
                        continue stateLoop;
                    }
                    case 41: {
                        if (null == d.field_d) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        d.field_d = var3.field_e[d.field_d.field_p];
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 43: {
                        var21 = var3.field_e;
                        var6 = 0;
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 44: {
                        if (var6 >= var21.length) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        var22_ref = var21[var6];
                        var26 = var22_ref;
                        var29 = var26;
                        var26 = var22_ref;
                        uq.field_m.a(pa.a(var22_ref, -31), 27275, "star" + var22_ref.field_p);
                        var6++;
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 46: {
                        var5 = null;
                        if ((kb.field_x ^ -1) == -6) {
                            statePc = 48;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        var23 = new fs(1, hn.field_f[1], or.field_b[1], df.field_k[1], ho.field_e[1]);
                        var3.field_e[6].field_t = var23;
                        var3.field_e[6].field_y = var23;
                        var3.field_e[7].field_t = var23;
                        var3.field_e[7].field_y = var23;
                        var23.field_m = new lo(var23, var3.field_e[7]);
                        var23.field_m.a(-21771, var3.field_e[7]);
                        var23.field_m.a(-21771, var3.field_e[6]);
                        var24 = new sd(var23, var3.field_e[7]);
                        var24.a(-21771, var3.field_e[7]);
                        var24.a(-21771, var3.field_e[6]);
                        var3.field_e[6].field_R = var24;
                        var3.field_e[7].field_R = var24;
                        var23.field_i.a((byte) -113, (oh) (Object) var24);
                        var23.field_q = new um(var3.field_e[7].field_x + var3.field_e[6].field_x);
                        statePc = 49;
                        continue stateLoop;
                    }
                    case 49: {
                        if (6 == kb.field_x) {
                            statePc = 51;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 51: {
                        var25 = new fs(2, hn.field_f[2], or.field_b[2], df.field_k[2], ho.field_e[2]);
                        var26_ref = var3.field_e[17];
                        var29 = var26_ref;
                        var29 = var26_ref;
                        var26_ref.field_y = var25;
                        var26_ref.field_t = var25;
                        var25.field_m = new lo(var25, var26_ref);
                        var25.field_m.a(-21771, var26_ref);
                        var27 = new sd(var25, var26_ref);
                        var27.a(-21771, var26_ref);
                        var26_ref.field_R = var27;
                        var25.field_i.a((byte) -113, (oh) (Object) var27);
                        var25.field_q = new um(var26_ref.field_x);
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 52: {
                        if (kb.field_x == 7) {
                            statePc = 54;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        var28 = new fs(3, hn.field_f[3], or.field_b[3], df.field_k[3], ho.field_e[3]);
                        var5 = var28;
                        var29_ref = var3.field_e[37];
                        var30 = var3.field_e[36];
                        var8 = var3.field_e[35];
                        var31 = var3.field_e[34];
                        var29_ref.field_t = var28;
                        var29_ref.field_y = var28;
                        var10 = var3.field_e[33];
                        var30.field_t = var28;
                        var30.field_y = var28;
                        var8.field_t = var28;
                        var8.field_y = var28;
                        var31.field_y = var28;
                        var31.field_t = var28;
                        var10.field_t = var28;
                        var10.field_y = var28;
                        var28.field_m = new lo(var28, var29_ref);
                        var28.field_m.a(-21771, var29_ref);
                        var28.field_m.a(-21771, var30);
                        var28.field_m.a(-21771, var8);
                        var28.field_m.a(-21771, var31);
                        var28.field_m.a(-21771, var10);
                        var32 = new sd(var28, var29_ref);
                        var32.a(-21771, var29_ref);
                        var32.a(-21771, var30);
                        var32.a(-21771, var8);
                        var32.a(-21771, var31);
                        var32.a(-21771, var10);
                        var29_ref.field_R = var32;
                        var30.field_R = var32;
                        var8.field_R = var32;
                        var31.field_R = var32;
                        var10.field_R = var32;
                        var28.field_i.a((byte) -113, (oh) (Object) var32);
                        var28.field_q = new um(var31.field_x + var8.field_x + (var30.field_x + var29_ref.field_x) + var10.field_x);
                        statePc = 55;
                        continue stateLoop;
                    }
                    case 55: {
                        if (var5 != null) {
                            statePc = 57;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    }
                    case 57: {
                        oq.field_a.a(2, var5);
                        oq.field_a.field_z.a(-128, oq.field_a.field_P.field_v);
                        oq.field_a.field_Y.a(oq.field_a.field_P.field_v, 1);
                        uq.field_m.a(re.a("<col=<%0>>" + var5.field_t + "</col>", 4371, new String[1]), 27275, "player" + var5.field_x);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 58: {
                        qj.a(ol.field_g, -1);
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

    final static void a(boolean param0, int param1, java.awt.Canvas param2) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param1 > ma.field_p) {
            L1: {
              var3 = 0;
              if (oq.field_e) {
                oq.field_e = false;
                var3 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            ge.a(vj.g((byte) 120), ei.a(82), var3 != 0, 0, po.field_h);
            break L0;
          } else {
            if (!or.a(250)) {
              gf.b();
              sn.a(240, 28318, 320);
              mc.a(param1 ^ 37, 0, param2, 0);
              break L0;
            } else {
              if (-1 == (gm.field_i ^ -1)) {
                gr.a(false, param0, param1 ^ 10);
                mc.a(64, 0, param2, 0);
                break L0;
              } else {
                pa.a(param1 ^ 9232, param2);
                break L0;
              }
            }
          }
        }
    }

    final static void a(nf param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 0;
        var3 = -1 + da.field_g;
        L0: while (true) {
          L1: {
            if ((var3 ^ -1) > -1) {
              break L1;
            } else {
              if (param0 == wm.field_d[var3]) {
                var2 = 1 + var3;
                break L1;
              } else {
                var3--;
                continue L0;
              }
            }
          }
          L2: {
            if (param1 == 1) {
              break L2;
            } else {
              field_e = null;
              break L2;
            }
          }
          var5 = var2;
          var3 = var5;
          L3: while (true) {
            if (var5 >= da.field_g) {
              return;
            } else {
              if (null != wm.field_d[var5].field_j) {
                tm discarded$1 = ks.a(param1 ^ -115, false, wm.field_d[var5].field_j.field_z);
                var5++;
                continue L3;
              } else {
                var5++;
                continue L3;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_a = null;
        int var1 = -122 / ((param0 - 55) / 56);
        field_c = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Disruptive behaviour";
        field_c = new int[8192];
        field_d = "This password contains repeated characters, and would be easy to guess";
    }
}
