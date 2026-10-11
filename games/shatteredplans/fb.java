/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends qr {
    qr field_Hb;
    boolean field_mc;
    static String field_kc;
    static String field_gc;
    qr field_Wb;
    qr field_Ib;
    qr field_Db;
    int field_Zb;
    qr field_Ub;
    boolean field_Qb;
    static long[] field_Cb;
    static int[] field_zb;
    String[] field_jc;
    qr field_Kb;
    qr field_Mb;
    static char[] field_yb;
    static String field_bc;
    long field_Gb;
    int field_hc;
    qr[] field_xb;
    qr field_Rb;
    boolean field_cc;
    int field_Fb;
    qr field_oc;
    int field_lc;
    boolean field_Ab;
    qr field_Pb;
    long field_fc;
    int field_nc;
    qr field_Sb;
    int field_Eb;
    qr field_ic;
    qr field_Tb;
    boolean field_ec;
    byte[] field_dc;
    boolean field_Yb;
    qr field_Bb;
    int field_Nb;
    String field_Xb;
    boolean field_Jb;
    int field_Lb;
    qr field_Ob;
    qr field_ac;
    static bi field_Vb;

    fb(int param0) {
        super(0L, (qr) null);
        this.field_dc = new byte[param0];
    }

    public static void h(int param0) {
        field_Vb = null;
        field_kc = null;
        field_bc = null;
        field_Cb = null;
        field_yb = null;
        field_zb = null;
        if (param0 != 32) {
          field_Vb = (bi) null;
        }
        field_gc = null;
    }

    final static lp a(int param0, int param1, int param2, int param3, fs param4, int param5, fs[] param6, dc param7) {
        int var12_int = 0;
        int stackIn_9_0 = 0;
        lp stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        fs[] var11_ref_fs__ = null;
        int var11 = 0;
        b var12 = null;
        fs var13 = null;
        ff var13_ref = null;
        qk var13_ref2 = null;
        String var14 = null;
        vd var15 = null;
        int var16 = 0;
        lp var17 = null;
        ff var13_refLifetime1;
        qk var13_ref2Lifetime1;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var9 = -18 % ((param2 + 43) / 35);
          var17 = new lp(0, 0, 182, cc.field_n);
          var10 = 0;
          var11_ref_fs__ = param6;
          for (var12_int = 0; var11_ref_fs__.length > var12_int; var12_int++) {
            var13 = var11_ref_fs__[var12_int];
            if (param4 != var13) {
              continue;
            }
            var10 = 1;
            break;
          }
          stackIn_9_0 = (var10 != 0) ? 8421504 : 2105376;
          var11 = stackIn_9_0;
          var12 = new b(pf.field_a[param4.field_x].field_z / 2, -(rs.field_Cb.field_J / 2) + (var17.field_i / 2 - 4), -(pf.field_a[param4.field_x].field_z / 2) + var17.field_m, rs.field_Cb.field_J + 8, 2, var11);
          var17.a(var12, 8);
          if ((param7.field_w & 1 << param4.field_x) == 0) {
            var13_ref = new ff(pf.field_a[param4.field_x].field_z / 2, -1 + (var17.field_i / 2 - rs.field_Cb.field_J / 2), er.a(param5, (byte) -127, param1, param4, param3));
            var17.a(var13_ref, 8);
          } else {
            var13_ref2 = new qk(pf.field_a[param4.field_x].field_z, -(rs.field_Cb.field_J / 2) + var17.field_i / 2, var17.field_m - pf.field_a[param4.field_x].field_z, rs.field_Cb.field_J, of.field_d.toUpperCase());
            var17.a(var13_ref2, 8);
          }
          if (var10 != 0 &&
            param0 <= 3 &&
            0 < param0) {
            var13_ref2Lifetime1 = new qk(pf.field_a[param4.field_x].field_z, -(rs.field_Cb.field_J / 2) + var17.field_i / 2, -pf.field_a[param4.field_x].field_z + var17.field_m, rs.field_Cb.field_J, re.a(ka.field_m, 4371, new String[]{Integer.toString(param0)}));
            var17.a(var13_ref2Lifetime1, 8);
          }
          var13_refLifetime1 = new ff(0, (-pf.field_a[param4.field_x].field_w + var17.field_i) / 2, pf.field_a[param4.field_x]);
          var17.a(var13_refLifetime1, 8);
          if ((param7.field_w & 1 << param4.field_x) == 0) {
            if (1 != param3) {
              if (param5 == 1) {
                var14 = re.a(fa.field_S, 4371, new String[]{Integer.toString(param3)});
              } else {
                var14 = re.a(jm.field_q, 4371, new String[]{Integer.toString(param3), Integer.toString(param5)});
              }
            } else {
              if (param5 != 1) {
                var14 = re.a(ms.field_b, 4371, new String[]{Integer.toString(param5)});
              } else {
                var14 = bc.field_a;
              }
            }
            if (var10 != 0 &&
              !param7.field_z) {
              var14 = var14 + " " + ui.field_q;
            }
            var17.field_o = var14;
            var15 = (vd) (var17.field_l.d(0));
            while (var15 != null) {
              var15.field_o = var14;
              var15 = (vd) (var17.field_l.a((byte) -71));
            }
          }
          stackIn_32_0 = var17;
          return stackIn_32_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_35_0 = var8;
          stackIn_35_1 = new StringBuilder().append("fb.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
          if (param7 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    final boolean f(byte param0) {
        if (param0 != -78) {
          return false;
        }
        return !this.a((byte) 98) ? true : false;
    }

    final static void a(boolean param0, boolean param1, int param2, int param3, int param4, boolean param5, int param6, boolean param7, boolean param8, int param9) {
        int var11;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!param5 && (kh.field_Mb != gf.field_b ||
          el.field_c != gf.field_k) && (so.field_q.field_d == gf.field_k &&
          gf.field_b == so.field_q.field_g)) {
          if (null == np.field_a) {
            if (null == he.field_p) {
              tc.j(param9 ^ 97);
            } else {
              en.a(param9 + 15471, true);
            }
          } else {
            en.a(15471, false);
          }
        }
        if (!param5) {
          tm.field_h = (kh.field_Mb - 640) / 2;
        } else {
          tm.field_h = gn.field_t;
        }
        mf.a(true, param5);
        if (qa.field_t > param9) {
          hi.a(param0, param9 ^ -26671, param5, param2);
        }
        dn.field_f.field_y = 1;
        dn.field_f.field_kb = fg.field_b.field_kb;
        if (bc.field_b > 0) {
          bb.a(param5, param0, (byte) -2, param2);
        }
        if (ee.field_k > 0) {
          uo.a((byte) 23, param0, param2, param7, param5);
        }
        if (ti.field_e &&
          np.field_a.field_Eb <= np.field_a.field_Lb) {
          ls.field_a.field_zb.field_z = gm.field_j;
          lp.field_v.field_s = false;
          fj.a(false, ls.field_a.field_xb);
        } else {
          lp.field_v.field_s = true;
          ls.field_a.field_zb.field_z = null;
          dm.a(param4, 0, ls.field_a, param1, param2);
        }
        ga.a(param1, (byte) 116, param3, param6, param2, param4, param8);
        dm.a(param4, 0, ro.field_a, param1, param2);
        ln.field_w = ln.field_w + 1;
    }

    final int g(int param0) {
        if (param0 >= -74) {
          this.g(-46);
        }
        return (int)this.d((byte) 118);
    }

    final boolean a(fb param0, int param1) {
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        boolean stackIn_27_0 = false;
        boolean stackIn_33_0 = false;
        int stackIn_37_0 = 0;
        boolean stackIn_42_0 = false;
        boolean stackIn_47_0 = false;
        int stackIn_54_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_68_0 = 0;
        boolean stackIn_72_0 = false;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        fb var7 = null;
        try {
          if (param1 != -1) {
            var7 = (fb) null;
            this.a((fb) null, -74);
          }
          if (!this.field_Jb) {
            stackIn_8_0 = (this.field_hc == 6) ? 1 : 0;
          } else {
            stackIn_8_0 = 1;
          }
          var3_int = stackIn_8_0;
          if (!param0.field_Jb) {
            stackIn_14_0 = (param0.field_hc == 6) ? 1 : 0;
          } else {
            stackIn_14_0 = 1;
          }
          var4 = stackIn_14_0;
          stackIn_16_0 = var4;
          if (var3_int != 0) {
            stackIn_17_1 = 0;
          } else {
            stackIn_17_1 = 1;
          }
          if (stackIn_16_0 == stackIn_17_1) {
            stackIn_19_0 = var3_int;
            return stackIn_19_0 != 0;
          }
          if (var3_int == 0) {
            stackIn_24_0 = (this.field_cc) ? 0 : 1;
            if (stackIn_24_0 == (param0.field_cc ? 1 : 0)) {
              stackIn_27_0 = this.field_cc;
              return stackIn_27_0;
            }
            if (this.field_cc &&
              param0.field_nc != this.field_nc) {
              stackIn_33_0 = !(param0.field_nc <= this.field_nc);
              return stackIn_33_0;
            }
          }
          stackIn_37_0 = (this.field_Ab) ? 0 : 1;
          if (stackIn_37_0 == (param0.field_Ab ? 1 : 0)) {
            stackIn_42_0 = !(this.field_Ab);
            return stackIn_42_0;
          }
          if (!this.field_Ab) {
            stackIn_47_0 = !(this.field_Gb >= param0.field_Gb);
            return stackIn_47_0;
          }
          if (this.field_mc) {
            stackIn_54_0 = 1;
          } else {
            stackIn_54_0 = (2 == this.field_Fb) ? 1 : 0;
          }
          var5 = stackIn_54_0;
          if (!param0.field_mc) {
            stackIn_60_0 = (param0.field_Fb == 2) ? 1 : 0;
          } else {
            stackIn_60_0 = 1;
          }
          var6 = stackIn_60_0;
          stackIn_63_0 = (var6 != 0) ? 0 : 1;
          if (var5 != 0) {
            stackIn_66_1 = 0;
          } else {
            stackIn_66_1 = 1;
          }
          if (stackIn_63_0 == stackIn_66_1) {
            stackIn_72_0 = !(this.field_Gb <= param0.field_Gb);
            return stackIn_72_0;
          }
          stackIn_68_0 = var5;
          return stackIn_68_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_75_0 = var3;
          stackIn_75_1 = new StringBuilder().append("fb.A(");
          if (param0 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_gc = "Awaiting response";
        field_kc = "<%0> is not a member, and cannot play with the current options.";
        field_Cb = new long[32];
        field_yb = new char[128];
        field_bc = "Cancel";
    }
}
