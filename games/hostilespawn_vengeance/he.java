/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends ch {
    static String field_w;
    int field_u;
    static double field_r;
    static String field_z;
    static gb field_t;
    static int field_x;
    int field_v;
    static java.awt.Image field_y;
    static int[] field_s;

    public static void b(boolean param0) {
        if (!param0) {
            he.b(false);
        }
        field_z = null;
        field_t = null;
        field_w = null;
        field_y = null;
        field_s = null;
    }

    final static pg[] c(int param0) {
        int var2 = 0;
        int var3 = HostileSpawn.field_I ? 1 : 0;
        if (param0 > -120) {
            return null;
        }
        pg[] var1 = new pg[sc.field_c];
        for (var2 = 0; sc.field_c > var2; var2++) {
            var1[var2] = new pg(ra.field_a, vc.field_e, th.field_Jb[var2], nh.field_O[var2], sf.field_X[var2], hd.field_r[var2], ja.field_e[var2], bf.field_d);
        }
        uj.d(113);
        return var1;
    }

    final void a(int param0) {
        super.a(param0);
        ((he) this).field_u = 0;
        ((he) this).field_v = 0;
    }

    final static void a(double param0, oc param1, int param2, double param3, oj param4, int param5, int param6) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        L0: {
          if (-1 == (r.field_a ^ -1)) {
            break L0;
          } else {
            L1: {
              if (bm.field_c != 0) {
                break L1;
              } else {
                if (3 == rl.field_c) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (bm.field_c != 1) {
                break L2;
              } else {
                if (rl.field_c == 2) {
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            return;
          }
        }
        L3: {
          var13 = -122 / ((20 - param5) / 48);
          var11 = -param2 + param1.field_e;
          var12 = -param6 + param1.field_g;
          if (var11 <= -24) {
            break L3;
          } else {
            if (var11 <= -25) {
              break L3;
            } else {
              if (-24 >= var12) {
                break L3;
              } else {
                if (-25 > var12) {
                  param4.field_F = param4.field_F - 1;
                  jn.field_F[ib.field_c].field_c = 256.0 * Math.random();
                  jn.field_F[ib.field_c].field_j.a((byte) 46, param1);
                  jn.field_F[ib.field_c].field_l.a(param4.field_l, -28860);
                  jn.field_F[ib.field_c].field_e = 1;
                  jn.field_F[ib.field_c].field_h = 0;
                  jn.field_F[ib.field_c].field_i = 1;
                  jn.field_F[ib.field_c].field_l.field_f = jn.field_F[ib.field_c].field_l.field_f + 0.5;
                  jn.field_F[ib.field_c].field_l.field_a = jn.field_F[ib.field_c].field_l.field_a + 0.5;
                  jn.field_F[ib.field_c].field_l.a((int)(Math.random() * 10.0), (byte) 94, jn.field_F[ib.field_c].field_c);
                  ib.field_c = ib.field_c + 1;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
          }
        }
        L4: {
          if ((7 & em.field_c) != -1) {
            break L4;
          } else {
            if (-2 != uj.field_l) {
              break L4;
            } else {
              var9 = (int)(24.0 * (-param4.field_l.field_f + ((double)(-param1.field_e) + ((double)param2 + param3))));
              var10 = (int)(((double)(-param1.field_g) + (param0 + (double)param6) - param4.field_l.field_a) * 24.0);
              var14 = (int)Math.sqrt((double)(var10 * var10 + var9 * var9));
              if (400 >= var14) {
                var15 = -var14 + 400;
                if (jh.field_db < var15) {
                  jh.field_db = var15;
                  break L4;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
          }
        }
    }

    final static void a(p param0, oj param1, byte param2, double param3, double param4) {
        if (param2 < 104) {
            return;
        }
        int var7 = (int)((param4 - (double)param0.field_j.field_e - param0.field_l.field_f) * 24.0);
        int var8 = (int)((-param0.field_l.field_a + ((double)(-param0.field_j.field_g) + param3)) * 24.0);
        if ((var7 ^ -1) <= 23) {
            if (var7 >= -25) {
                if (23 <= var8) {
                    if (24 > var8) {
                        param1.field_z = 4;
                        param1.field_F = 255;
                        ci.a(1, 76);
                        nh.a(param1, -29966);
                    }
                }
            }
        }
        param0.field_e = param0.field_e + 2;
        if (!((param0.field_e ^ -1) >= -33)) {
            param0.field_i = -1;
        }
    }

    final static int c(int param0, byte param1) {
        int var3 = 122 % ((-73 - param1) / 45);
        int var2 = (16707538 & param0) >> -69762448;
        int var4 = 254 & param0 >> -334564376;
        int var5 = param0 & 254;
        return var5 >> 1427742433 | (var2 << 1870429839 | var4 << 1510528295);
    }

    final void b(int param0) {
        super.b(param0 ^ 0);
        if (param0 != -24) {
            he.b(false);
        }
    }

    he(kh param0) {
        super(param0, new mn[5]);
        int var2 = 0;
        int var3 = 0;
        ((he) this).field_u = 0;
        ((he) this).field_v = 0;
        for (var2 = 0; var2 < ((he) this).field_g.length; var2++) {
            ((he) this).field_g[var2] = new mn();
            for (var3 = 0; (var3 ^ -1) > -5; var3++) {
                ((he) this).field_g[var2].field_d[var3] = var2 <= var3 ? 0 : 256;
            }
        }
        ((he) this).field_n = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Passwords must be between 5 and 20 letters and numbers";
        field_z = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_r = Math.atan2(1.0, 0.0);
        field_s = new int[4];
    }
}
