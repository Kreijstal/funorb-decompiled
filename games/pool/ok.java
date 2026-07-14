/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ok extends tj {
    private int field_kb;
    static String[][] field_pb;
    static int field_rb;
    private int field_nb;
    private int field_hb;
    private int field_qb;
    private sh field_ib;
    static am field_mb;
    private int field_jb;
    private cd field_gb;
    static vh field_ob;
    private ei field_lb;

    final static void a(int param0, boolean param1) {
        di.a(param1, (byte) 108, true);
        int var2 = 40 / ((-28 - param0) / 51);
    }

    void d(ei param0, int param1) {
        if (param1 != 30) {
            ((ok) this).field_ib = null;
        }
        ((ok) this).field_lb = param0;
        if (db.field_Ub != ((ok) this).field_gb) {
            // if_acmpeq L99
            ((ok) this).field_gb = dj.field_c;
            ((ok) this).field_hb = 0;
        } else {
            ((ok) this).a((byte) -77, ((ok) this).field_lb.field_y + (12 - -((ok) this).field_jb), 12 - -((ok) this).field_lb.field_l, ((ok) this).field_nb);
            ((ok) this).field_hb = 0;
        }
    }

    final static void a(int param0, pq param1, pq param2, byte param3) {
        if (0 > param0) {
            param0 = 0;
        }
        param1.a(param0, 127);
        param2.a(param0, 122);
        long var4 = param1.e(-14770) - -param2.e(-14770);
        int var6 = param2.field_g + -param1.field_g;
        int var7 = param2.field_k + -param1.field_k;
        long var8 = rj.a((long)var6, (byte) -48, (long)var6) + rj.a((long)var7, (byte) -48, (long)var7);
        if (!(-1L >= (var8 ^ -1L))) {
            throw new IllegalStateException("dnorm2_32 overflow " + var8);
        }
        long var10 = bm.a(-128, var8 >> -487518000);
        if ((var10 ^ -1L) <= 2147483647L) {
            // iflt L185
        } else {
            throw new IllegalStateException("dnorm_16 overflow");
        }
        var6 = lh.a((int)var10, (byte) -83, (long)var6);
        var7 = lh.a((int)var10, (byte) -112, (long)var7);
        long var12 = rj.a((long)param1.field_I, (byte) -48, (long)var6) - -rj.a((long)param1.field_t, (byte) -48, (long)var7) >> -1518204592;
        long var14 = rj.a((long)param2.field_I, (byte) -48, (long)var6) + rj.a((long)param2.field_t, (byte) -48, (long)var7) >> 1030857168;
        param1.field_I = (int)((long)param1.field_I - od.a((long)var6, var12, false));
        param1.field_t = (int)((long)param1.field_t - od.a((long)var7, var12, false));
        param2.field_I = (int)((long)param2.field_I - od.a((long)var6, var14, false));
        param2.field_t = (int)((long)param2.field_t - od.a((long)var7, var14, false));
        param1.field_I = (int)((long)param1.field_I + (od.a((long)(tl.field_K * var6), var14, false) >> -922408120));
        param1.field_t = (int)((long)param1.field_t + (od.a((long)(tl.field_K * var7), var14, false) >> -912857656));
        param2.field_I = (int)((long)param2.field_I + (od.a((long)(tl.field_K * var6), var12, false) >> -733421624));
        param2.field_t = (int)((long)param2.field_t + (od.a((long)(tl.field_K * var7), var12, false) >> 862675464));
        param1.field_b = ca.field_l * param1.field_b >> 1969602184;
        param1.field_K = ca.field_l * param1.field_K >> 1996056360;
        param1.field_n = ca.field_l * param1.field_n >> -645723960;
        param2.field_b = param2.field_b * ca.field_l >> -1338128088;
        param2.field_K = param2.field_K * ca.field_l >> -1168436184;
        param2.field_n = param2.field_n * ca.field_l >> 94132808;
        param1.field_v = 1;
        param2.field_v = 1;
        int var18 = -53 / ((param3 - 62) / 39);
        long var16 = param1.e(-14770) + param2.e(-14770);
        if (!(wm.field_ac.length <= or.field_l)) {
            wm.field_ac[or.field_l][0] = param1.field_g + param2.field_g >> 134135105;
            wm.field_ac[or.field_l][1] = param2.field_k + param1.field_k >> -111052767;
            wm.field_ac[or.field_l][2] = -524288;
        }
        if (or.field_l < wd.field_Qb.length) {
            or.field_l = or.field_l + 1;
            wd.field_Qb[or.field_l] = (int)(-var16 + var4);
        }
    }

    private final void c(ei param0, int param1) {
        if (null != ((ok) this).field_ib) {
            ((ok) this).field_ib.a((byte) -117);
        }
        if (param1 != -111052767) {
            return;
        }
        if (param0 != null) {
            param0.a(param0.field_l, 6, param0.field_y, false, 6 - -((ok) this).field_jb);
            ((ok) this).field_ib = new sh(param0);
        } else {
            ((ok) this).field_ib = new sh();
        }
        ((ok) this).a(true, (ei) (Object) ((ok) this).field_ib);
        ((ok) this).field_lb = null;
    }

    final static int k(byte param0) {
        if (param0 != 59) {
            dd[] discarded$0 = ok.l((byte) -91);
        }
        return er.field_R;
    }

    final void b(boolean param0) {
        if (!(null == ((ok) this).field_gb)) {
            if (!(((ok) this).field_gb == tm.field_h)) {
                ((ok) this).b(12 - -((ok) this).field_jb - -((ok) this).field_lb.field_y, 31936, 12 - -((ok) this).field_lb.field_l);
                this.c(((ok) this).field_lb, -111052767);
            }
            ((ok) this).field_ib.field_T = 256;
            ((ok) this).field_gb = null;
        }
        super.b(param0);
    }

    boolean g(byte param0) {
        int var3 = 0;
        L0: {
          var3 = Pool.field_O;
          if (((ok) this).field_gb == null) {
            break L0;
          } else {
            if (((ok) this).field_gb == dj.field_c) {
              ((ok) this).field_hb = ((ok) this).field_hb + 1;
              if (((ok) this).field_kb != ((ok) this).field_hb + 1) {
                ((ok) this).field_ib.field_T = 256 + -((((ok) this).field_hb << 1928657704) / ((ok) this).field_kb);
                break L0;
              } else {
                ((ok) this).field_gb = db.field_Ub;
                ((ok) this).a((byte) 88, ((ok) this).field_lb.field_y + (12 + ((ok) this).field_jb), 12 + ((ok) this).field_lb.field_l, ((ok) this).field_nb);
                ((ok) this).field_ib.field_T = 0;
                ((ok) this).field_hb = 0;
                break L0;
              }
            } else {
              if (((ok) this).field_gb != tm.field_h) {
                break L0;
              } else {
                ((ok) this).field_hb = ((ok) this).field_hb + 1;
                if (((ok) this).field_qb == ((ok) this).field_hb + 1) {
                  ((ok) this).field_ib.field_T = 256;
                  ((ok) this).field_gb = null;
                  break L0;
                } else {
                  ((ok) this).field_ib.field_T = (((ok) this).field_hb << -760487064) / ((ok) this).field_qb;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (param0 == -20) {
            break L1;
          } else {
            ((ok) this).field_kb = 54;
            break L1;
          }
        }
        return super.g((byte) -20);
    }

    final void j(int param0) {
        if (((ok) this).field_gb == dj.field_c) {
            return;
        }
        ((ok) this).field_gb = tm.field_h;
        ((ok) this).field_hb = 0;
        this.c(((ok) this).field_lb, -111052767);
        ((ok) this).field_ib.field_T = 0;
        ((ok) this).field_lb = null;
        if (param0 != 50) {
            field_rb = -17;
        }
    }

    final boolean a(boolean param0) {
        ((ok) this).b(param0);
        return super.a(false);
    }

    final static dd j(byte param0) {
        int var1 = 0;
        lp var3 = null;
        int[] var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int[] var9 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        byte[] var19 = null;
        int[] var20 = null;
        byte[] var21 = null;
        int[] var22 = null;
        L0: {
          var7 = Pool.field_O;
          if (param0 < -63) {
            break L0;
          } else {
            var8 = null;
            ok.a(101, (pq) null, (pq) null, (byte) 35);
            break L0;
          }
        }
        L1: {
          var1 = pd.field_a[0] * rc.field_f[0];
          var19 = v.field_b[0];
          if (gg.field_d[0]) {
            var21 = wg.field_Sb[0];
            var22 = new int[var1];
            var18 = var22;
            var14 = var18;
            var12 = var14;
            var5 = var12;
            var6 = 0;
            L2: while (true) {
              if (var6 >= var1) {
                var3 = new lp(vd.field_c, tq.field_r, el.field_I[0], ih.field_d[0], pd.field_a[0], rc.field_f[0], var22);
                break L1;
              } else {
                var5[var6] = md.a(rb.b(-16777216, var21[var6] << 1832039992), ma.field_h[rb.b(255, (int) var19[var6])]);
                var6++;
                continue L2;
              }
            }
          } else {
            var20 = new int[var1];
            var16 = var20;
            var9 = var16;
            var5_int = 0;
            L3: while (true) {
              if (var1 <= var5_int) {
                var3 = (lp) (Object) new dd(vd.field_c, tq.field_r, el.field_I[0], ih.field_d[0], pd.field_a[0], rc.field_f[0], var20);
                break L1;
              } else {
                var9[var5_int] = ma.field_h[rb.b((int) var19[var5_int], 255)];
                var5_int++;
                continue L3;
              }
            }
          }
        }
        sh.h(-1);
        return (dd) (Object) var3;
    }

    ok(lq param0, ei param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_l, param1.field_y + (12 - -param2));
        ((ok) this).field_qb = param3;
        ((ok) this).field_kb = param3;
        ((ok) this).field_jb = param2;
        ((ok) this).field_nb = param4;
        this.c(param1, -111052767);
    }

    public static void i(byte param0) {
        field_mb = null;
        field_pb = null;
        field_ob = null;
        if (param0 != -45) {
            dd discarded$0 = ok.j((byte) 96);
        }
    }

    boolean a(char param0, int param1, boolean param2, ei param3) {
        if (super.a(param0, param1, param2, param3)) {
            return true;
        }
        if (((ok) this).field_ib != null) {
            if (!(param1 != 98)) {
                boolean discarded$0 = ((ok) this).field_ib.a(param3, (byte) -96);
            }
            if (-100 == (param1 ^ -1)) {
                boolean discarded$1 = ((ok) this).field_ib.a(param3, (byte) -97);
                return false;
            }
        }
        return false;
    }

    final static dd[] l(byte param0) {
        dd[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
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
        L0: {
          var1 = new dd[wf.field_d];
          if (param0 == 65) {
            break L0;
          } else {
            int discarded$1 = ok.k((byte) -62);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (wf.field_d <= var2) {
            sh.h(-1);
            return var1;
          } else {
            var3 = pd.field_a[var2] * rc.field_f[var2];
            var18 = v.field_b[var2];
            if (gg.field_d[var2]) {
              var20 = wg.field_Sb[var2];
              var21 = new int[var3];
              var17 = var21;
              var13 = var17;
              var11 = var13;
              var6 = var11;
              var7 = 0;
              L2: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (dd) (Object) new lp(vd.field_c, tq.field_r, el.field_I[var2], ih.field_d[var2], pd.field_a[var2], rc.field_f[var2], var21);
                  var2++;
                  continue L1;
                } else {
                  var6[var7] = md.a(rb.b((int) var20[var7], 255) << -82927912, ma.field_h[rb.b(255, (int) var18[var7])]);
                  var7++;
                  continue L2;
                }
              }
            } else {
              var19 = new int[var3];
              var15 = var19;
              var8 = var15;
              var6_int = 0;
              L3: while (true) {
                if (var3 <= var6_int) {
                  var1[var2] = new dd(vd.field_c, tq.field_r, el.field_I[var2], ih.field_d[var2], pd.field_a[var2], rc.field_f[var2], var19);
                  var2++;
                  continue L1;
                } else {
                  var8[var6_int] = ma.field_h[rb.b((int) var18[var6_int], 255)];
                  var6_int++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_pb = new String[][]{new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2]};
    }
}
