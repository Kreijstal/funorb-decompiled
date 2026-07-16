/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gf extends rg {
    static String field_X;
    static int field_W;
    static String[] field_eb;
    private kd field_db;
    private int field_Z;
    private jc field_ab;
    private int field_fb;
    private int field_hb;
    private int field_U;
    private ub field_cb;
    private int field_gb;
    static rc field_ib;
    static String field_Y;
    static o field_bb;
    static ok field_V;

    boolean a(char param0, int param1, byte param2, ub param3) {
        if (param2 > -96) {
            boolean discarded$0 = ((gf) this).g(13);
        }
        if (!(!super.a(param0, param1, (byte) -120, param3))) {
            return true;
        }
        if (null == ((gf) this).field_ab) {
            return false;
        }
        if (!((param1 ^ -1) != -99)) {
            boolean discarded$1 = ((gf) this).field_ab.a(param3, 8);
        }
        if (!((param1 ^ -1) != -100)) {
            boolean discarded$2 = ((gf) this).field_ab.a(param3, 8);
        }
        return false;
    }

    public static void i(byte param0) {
        field_V = null;
        field_ib = null;
        field_bb = null;
        field_X = null;
        field_eb = null;
        field_Y = null;
        if (param0 != -68) {
            field_V = null;
        }
    }

    final boolean a(int param0) {
        ((gf) this).g((byte) -3);
        if (param0 != 16) {
            Object var3 = null;
            ((gf) this).c((ub) null, -46);
        }
        return super.a(16);
    }

    final void j(int param0) {
        if (((gf) this).field_db == sa.field_g) {
            return;
        }
        ((gf) this).field_fb = 0;
        ((gf) this).field_db = lj.field_c;
        this.a(((gf) this).field_cb, true);
        if (param0 != -8144) {
            Object var3 = null;
            boolean discarded$0 = ((gf) this).a('ﾭ', 97, (byte) -70, (ub) null);
        }
        ((gf) this).field_ab.field_G = 0;
        ((gf) this).field_cb = null;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final void g(byte param0) {
        if (!(null == ((gf) this).field_db)) {
            if (((gf) this).field_db != lj.field_c) {
                ((gf) this).a(6154, ((gf) this).field_cb.field_n + 12 + ((gf) this).field_hb, 12 + ((gf) this).field_cb.field_r);
                this.a(((gf) this).field_cb, true);
            }
            ((gf) this).field_ab.field_G = 256;
            ((gf) this).field_db = null;
        }
        super.g(param0);
    }

    private final void a(ub param0, boolean param1) {
        if (!(((gf) this).field_ab == null)) {
            ((gf) this).field_ab.a(false);
        }
        if (param0 != null) {
            param0.a(127, ((gf) this).field_hb + 6, param0.field_n, param0.field_r, 6);
            ((gf) this).field_ab = new jc(param0);
        } else {
            ((gf) this).field_ab = new jc();
        }
        ((gf) this).a((ub) (Object) ((gf) this).field_ab, (byte) 109);
        if (!param1) {
            gf.k(74);
        }
        ((gf) this).field_cb = null;
    }

    final static void h(byte param0) {
        if (!(qb.field_p)) {
            throw new IllegalStateException();
        }
        vc.field_M = true;
        ml.a(11579568, false);
        if (param0 < 53) {
            gf.k(90);
        }
        ml.field_t = 0;
    }

    gf(wi param0, ub param1, int param2, int param3, int param4) {
        super(param0, param1.field_r + 12, param1.field_n + 12 + param2);
        ((gf) this).field_U = param3;
        ((gf) this).field_gb = param3;
        ((gf) this).field_hb = param2;
        ((gf) this).field_Z = param4;
        this.a(param1, true);
    }

    final static void k(int param0) {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        le var4_ref_le = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        le var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        var19 = wizardrun.field_H;
        ci.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
        var1 = ia.field_f.length;
        var23 = new int[var1];
        var22 = var23;
        var21 = var22;
        var20 = var21;
        var2 = var20;
        var3 = 0;
        L0: while (true) {
          if (var1 <= var3) {
            L1: {
              var3 = ci.field_a[9] >> -1923399416;
              var4 = ci.field_a[10] >> -67892184;
              var5 = ci.field_a[11] >> -1494998296;
              var6 = jd.field_f << -1801561788;
              var7 = 0;
              var8 = qj.a(-2942, var6) >> -1582451256;
              var9 = wizardrun.a((byte) -39, var6) >> -151156792;
              if (-1 == pg.field_n) {
                break L1;
              } else {
                if ((fi.field_B ^ -1) == 0) {
                  break L1;
                } else {
                  var8 = 240 + -fi.field_B;
                  var9 = -128;
                  var7 = pg.field_n - 320;
                  break L1;
                }
              }
            }
            if (param0 < -113) {
              var10 = 256.0 / Math.sqrt((double)(var7 * var7 + (var8 * var8 - -(var9 * var9))));
              var7 = (int)((double)var7 * var10);
              var8 = (int)((double)var8 * var10);
              var9 = (int)((double)var9 * var10);
              var12 = var7 + -var3;
              var13 = var8 + -var4;
              var14 = -var5 + var9;
              var10 = 256.0 / Math.sqrt((double)(var14 * var14 + (var13 * var13 + var12 * var12)));
              var14 = (int)((double)var14 * var10);
              var13 = (int)((double)var13 * var10);
              var12 = (int)((double)var12 * var10);
              var15 = 0;
              L2: while (true) {
                if (var15 >= ia.field_f.length) {
                  return;
                } else {
                  var16 = 0;
                  var17_int = 1;
                  L3: while (true) {
                    if (var17_int >= ia.field_f.length) {
                      var2[var16] = -2147483648;
                      var17 = ia.field_f[var16];
                      gj.a((byte) 115, var16);
                      var18 = 0;
                      L4: while (true) {
                        if (-4 >= (var18 ^ -1)) {
                          ae.a(false, (byte) 106, var17, true, cg.field_m, false, ci.field_a);
                          pi.a(var14, var12, var8, false, var9, var17, var7, var13);
                          var15++;
                          continue L2;
                        } else {
                          cg.field_m[var18] = cg.field_m[var18] + cb.field_d[var15][var18];
                          var18++;
                          continue L4;
                        }
                      }
                    } else {
                      if (var23[var17_int] > var23[var16]) {
                        var16 = var17_int;
                        var17_int++;
                        continue L3;
                      } else {
                        var17_int++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            var4_ref_le = ia.field_f[var3];
            var4_ref_le.b(-119);
            gj.a((byte) 115, var3);
            var5 = var4_ref_le.field_r + var4_ref_le.field_g >> 1892493121;
            var6 = var4_ref_le.field_D + var4_ref_le.field_K >> 2055966657;
            var7 = var4_ref_le.field_E + var4_ref_le.field_M >> -1606423839;
            var8 = ci.field_a[9] >> 654062370;
            var9 = ci.field_a[10] >> -2010258782;
            var10_int = ci.field_a[11] >> -1332976030;
            var11 = var10_int * cg.field_m[5] + (var9 * cg.field_m[4] + var8 * cg.field_m[3]) >> -432330866;
            var12 = var9 * cg.field_m[7] + (var8 * cg.field_m[6] + var10_int * cg.field_m[8]) >> -276157554;
            var13 = var10_int * cg.field_m[11] + cg.field_m[9] * var8 + var9 * cg.field_m[10] >> 1888872302;
            var2[var3] = var7 * var13 + var11 * var5 + var12 * var6 >> 469200592;
            var3++;
            continue L0;
          }
        }
    }

    final static void b(int param0, String param1) {
        if (param0 != 9) {
            field_V = null;
        }
    }

    void c(ub param0, int param1) {
        ((gf) this).field_cb = param0;
        if (param1 > -109) {
            return;
        }
        if (vg.field_W == ((gf) this).field_db) {
            ((gf) this).b(((gf) this).field_cb.field_r + 12, 12 - -((gf) this).field_hb + ((gf) this).field_cb.field_n, 0, ((gf) this).field_Z);
            ((gf) this).field_fb = 0;
        } else {
            if (!(((gf) this).field_db == sa.field_g)) {
                ((gf) this).field_db = sa.field_g;
                ((gf) this).field_fb = 0;
            }
        }
    }

    boolean g(int param0) {
        int var3 = 0;
        L0: {
          var3 = wizardrun.field_H;
          if (null == ((gf) this).field_db) {
            break L0;
          } else {
            if (((gf) this).field_db == sa.field_g) {
              int fieldTemp$47 = ((gf) this).field_fb + 1;
              ((gf) this).field_fb = ((gf) this).field_fb + 1;
              if (fieldTemp$47 != ((gf) this).field_gb) {
                ((gf) this).field_ab.field_G = -((((gf) this).field_fb << -142616376) / ((gf) this).field_gb) + 256;
                break L0;
              } else {
                ((gf) this).field_db = vg.field_W;
                ((gf) this).b(12 + ((gf) this).field_cb.field_r, 12 - (-((gf) this).field_hb + -((gf) this).field_cb.field_n), 0, ((gf) this).field_Z);
                ((gf) this).field_ab.field_G = 0;
                ((gf) this).field_fb = 0;
                break L0;
              }
            } else {
              if (((gf) this).field_db != lj.field_c) {
                break L0;
              } else {
                int fieldTemp$48 = ((gf) this).field_fb + 1;
                ((gf) this).field_fb = ((gf) this).field_fb + 1;
                if (fieldTemp$48 != ((gf) this).field_U) {
                  ((gf) this).field_ab.field_G = (((gf) this).field_fb << 860043240) / ((gf) this).field_U;
                  break L0;
                } else {
                  ((gf) this).field_db = null;
                  ((gf) this).field_ab.field_G = 256;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (param0 == 1) {
            break L1;
          } else {
            field_bb = null;
            break L1;
          }
        }
        return super.g(param0 ^ 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_eb = new String[]{"Showing by rating", "Showing by win percentage"};
        field_X = "Discard";
        field_ib = new rc();
        field_V = new ok();
    }
}
