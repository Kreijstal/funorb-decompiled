/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends qe {
    static mg[] field_p;
    private boolean field_s;
    static String field_r;
    private ci field_o;
    static float field_t;
    static String field_n;
    private String field_q;

    public static void c(byte param0) {
        field_r = null;
        if (param0 >= -84) {
            mg[] discarded$0 = kd.c(false);
        }
        field_p = null;
        field_n = null;
    }

    final String a(int param0, String param1) {
        if (!(((kd) this).field_o.a(param1, true) != ee.field_c)) {
            return ((kd) this).field_o.a(param0 + 0, param1);
        }
        if (((kd) this).a(param1, true) == ee.field_c) {
            return sg.field_g;
        }
        if (param0 != -26358) {
            kd.c((byte) -2);
        }
        return bk.field_c;
    }

    final static void a(byte param0, String param1) {
        int var2 = 32 / ((-65 - param0) / 43);
    }

    final static void a(mg[] param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = Virogrid.field_F ? 1 : 0;
        if (param0 != null) {
            if (!(0 < param3)) {
                return;
            }
            var6 = param0[0].field_u;
            var7 = param0[2].field_u;
            var8 = param0[1].field_u;
            param0[0].c(param4, param1, param5);
            param0[2].c(param3 + param4 - var7, param1, param5);
            df.b(od.field_m);
            df.h(param4 - -var6, param1, -var7 + (param4 + param3), param1 - -param0[1].field_z);
            var9 = param4 - -var6;
            var10 = param4 + (param3 + -var7);
            param4 = var9;
            while (var10 > param4) {
                param0[1].c(param4, param1, param5);
                param4 = param4 + var8;
            }
            df.a(od.field_m);
            if (param2) {
                Object var12 = null;
                kd.a((mg[]) null, 31, true, 51, -96, 109);
            }
            return;
        }
    }

    final static mg[] c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Virogrid.field_F ? 1 : 0;
        mg[] var1 = new mg[rj.field_h];
        if (!param0) {
            return null;
        }
        for (var2 = 0; rj.field_h > var2; var2++) {
            var3 = db.field_k[var2] * gb.field_F[var2];
            var4 = lj.field_j[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = k.field_c[rb.a((int) var4[var6], 255)];
            }
            var1[var2] = new mg(oj.field_Kb, se.field_d, el.field_w[var2], mb.field_bb[var2], db.field_k[var2], gb.field_F[var2], var5);
        }
        pe.b((byte) -28);
        return var1;
    }

    kd(wa param0, wa param1) {
        super(param0);
        ((kd) this).field_s = false;
        ((kd) this).field_q = "";
        ((kd) this).field_o = new ci(param0, param1);
    }

    final static boolean a(int param0, int[] param1) {
        long var2 = 0L;
        bj var4_ref_bj = null;
        int var4 = 0;
        int var5_int = 0;
        bj var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = Virogrid.field_F ? 1 : 0;
          if (param0 <= -117) {
            break L0;
          } else {
            var8 = null;
            kd.a((mg[]) null, -48, false, 30, 95, 36);
            break L0;
          }
        }
        if (ug.field_a == kh.field_c) {
          L1: {
            var2 = hc.a(-9986);
            if (kg.field_e == 0) {
              break L1;
            } else {
              if (0 > s.field_g) {
                var4_ref_bj = (bj) (Object) ac.field_d.a((byte) -120);
                if (var4_ref_bj == null) {
                  break L1;
                } else {
                  if ((var2 ^ -1L) < (var4_ref_bj.field_p ^ -1L)) {
                    var4_ref_bj.a(false);
                    ba.field_a = var4_ref_bj.field_l.length;
                    sh.field_qb.field_l = 0;
                    var5_int = 0;
                    L2: while (true) {
                      if (ba.field_a <= var5_int) {
                        ah.field_e = pl.field_c;
                        pl.field_c = md.field_b;
                        md.field_b = ci.field_q;
                        ci.field_q = var4_ref_bj.field_i;
                        return true;
                      } else {
                        sh.field_qb.field_g[var5_int] = var4_ref_bj.field_l[var5_int];
                        var5_int++;
                        continue L2;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
          }
          L3: while (true) {
            L4: {
              if (s.field_g >= 0) {
                break L4;
              } else {
                sh.field_qb.field_l = 0;
                if (wg.a(1, 0)) {
                  s.field_g = sh.field_qb.e(false);
                  sh.field_qb.field_l = 0;
                  ba.field_a = param1[s.field_g];
                  break L4;
                } else {
                  return false;
                }
              }
            }
            if (ic.c((byte) 48)) {
              if (-1 == (kg.field_e ^ -1)) {
                ah.field_e = pl.field_c;
                pl.field_c = md.field_b;
                md.field_b = ci.field_q;
                ci.field_q = s.field_g;
                s.field_g = -1;
                return true;
              } else {
                L5: {
                  var4 = kg.field_e;
                  if (0.0 == qa.field_b) {
                    break L5;
                  } else {
                    var4 = (int)((double)var4 + mc.field_c.nextGaussian() * qa.field_b);
                    if ((var4 ^ -1) > -1) {
                      var4 = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                var5 = new bj((long)var4 + var2, s.field_g, new byte[ba.field_a]);
                var6 = 0;
                L6: while (true) {
                  if (ba.field_a <= var6) {
                    ac.field_d.a((l) (Object) var5, (byte) -68);
                    s.field_g = -1;
                    continue L3;
                  } else {
                    var5.field_l[var6] = sh.field_qb.field_g[var6];
                    var6++;
                    continue L6;
                  }
                }
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final wl a(String param0, boolean param1) {
        kg var3 = null;
        if (((kd) this).field_o.a(param0, param1) == ee.field_c) {
            return ee.field_c;
        }
        if (!param0.equals((Object) (Object) ((kd) this).field_q)) {
            var3 = ub.a(99, param0);
            if (!(var3.b(-114))) {
                return te.field_d;
            }
            ((kd) this).field_q = param0;
            ((kd) this).field_s = var3.a((byte) -47);
        }
        return !((kd) this).field_s ? ee.field_c : bm.field_i;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Reject";
        field_n = "Macroing or use of bots";
    }
}
