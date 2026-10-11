/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    private ln[] field_d;
    static int field_f;
    static String field_e;
    static String field_b;
    static String[] field_c;
    static String field_a;

    final void a(boolean param0, int param1) throws jn {
        int var4 = 0;
        int var10_int = 0;
        int var11 = 0;
        int var19 = 0;
        int stackIn_48_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_59_0 = 0;
        dm stackIn_62_0;
        boolean stackIn_62_1;
        jd stackIn_62_2;
        jd stackIn_62_3;
        ln stackIn_62_4;
        ln stackIn_62_5;
        jd stackIn_63_2;
        jd stackIn_63_3;
        ln stackIn_63_6;
        ln var5;
        pf var6;
        int var7;
        int var8;
        ln[] var9_ref_ln__;
        int var9;
        nc[] var10;
        Object var12;
        int var12_int;
        int var13_int;
        Object var13;
        int var14;
        int var15_int;
        dm var15;
        Object var16;
        nc var16_ref;
        int var16_int;
        int var17;
        nc var17_ref_nc;
        int var18;
        int var20;
        int var21;
        ln[] var22;
        ln var23;
        nc[] var24;
        pf var25;
        nc[] var26;
        int var7Lifetime1;
        int var8Lifetime1;
        int var15_intLifetime1;
        int var16_intLifetime1;
        int var17Lifetime1;
        nc[] var10Lifetime1;
        Object var12Lifetime1;
        int var9Lifetime1;
        int var13_intLifetime1;
        int var14Lifetime1;
        var16 = null;
        var20 = ShatteredPlansClient.field_F ? 1 : 0;
        var22 = this.field_d;
        if (param1 != 1) {
          t.a((byte) 25);
        }
        for (var4 = 0; var22.length > var4; var4++) {
          var5 = var22[var4];
          var6 = new pf();
          var9_ref_ln__ = this.field_d;
          for (var10_int = 0; var9_ref_ln__.length > var10_int; var10_int++) {
            var23 = var9_ref_ln__[var10_int];
            if (var5 != var23) {
              var6.a((byte) -113, new nc(var5, var23));
            }
          }
          var9 = var6.e(param1 ^ 1);
          var24 = new nc[var9];
          var10 = var24;
          var6.a((byte) -127, var10);
          for (var11 = 0; var9 > var11; var11++) {
            var12_int = var11 + 1;
            for (var13_int = var12_int; var13_int < var9; var13_int++) {
              eo.a(var24[var11], param0, -10000, var24[var13_int]);
            }
          }
          ad.a(var6, param1 ^ -24926);
          var9Lifetime1 = var6.e(0);
          var25 = new pf();
          var12 = (nc) (var6.d(0));
          while (null != var12) {
            if (((nc) (var12)).field_u != null) {
              var25.a((byte) -113, new fi(var5, ((nc) (var12)).field_u));
            }
            var12 = (nc) (var6.a((byte) -71));
          }
          if (!var25.g(-117)) {
            var13_intLifetime1 = var25.e(0);
            var5.field_v = new fi[var13_intLifetime1];
            var25.a((byte) -105, var5.field_v);
            ra.a(false, var13_intLifetime1, var5.field_v);
          }
          if (!param0) {
            var7 = var5.field_A + (int)(Math.cos(-0.2617993877991494) * 200.0);
            var8 = var5.field_S - (int)(200.0 * Math.sin(-0.2617993877991494));
            var12Lifetime1 = null;
            var13 = null;
            for (var14 = 0; var14 < 12; var14++) {
              var15_int = var5.field_A + (int)(200.0 * Math.cos(3.141592653589793 * (double)(2 * var14 + 1) / 12.0));
              var16_int = var5.field_S - (int)(Math.sin((double)(var14 * 2 + 1) * 3.141592653589793 / 12.0) * 200.0);
              var17_ref_nc = new nc(var5, (nc) (var12Lifetime1), (nc) null, var7, var8, var15_int, var16_int);
              if (null != var12Lifetime1) {
                ((nc) (var12Lifetime1)).field_k = var17_ref_nc;
              } else {
                var13 = var17_ref_nc;
              }
              var7 = var15_int;
              var12Lifetime1 = var17_ref_nc;
              var8 = var16_int;
              var6.a((byte) -113, var17_ref_nc);
            }
            ((nc) (var12Lifetime1)).field_k = (nc) (var13);
            ((nc) (var13)).field_r = (nc) (var12Lifetime1);
            var14Lifetime1 = var6.e(param1 - 1);
            var26 = new nc[var14Lifetime1];
            var10Lifetime1 = var26;
            var6.a((byte) 95, var10Lifetime1);
            for (var15_intLifetime1 = 0; var9Lifetime1 > var15_intLifetime1; var15_intLifetime1++) {
              var21 = var9Lifetime1;
              var16_intLifetime1 = var21;
              while (var21 < var14Lifetime1) {
                eo.a(var26[var15_intLifetime1], param0, -10000, var26[var21]);
                var21++;
              }
            }
            ad.a(var6, -24925);
            hl.a(var6, true);
            var15 = new dm();
            var16_ref = (nc) (var6.d(param1 ^ 1));
            while (var16_ref != null) {
              if (var16_ref.field_k != null &&
                var16_ref.field_k.field_q != null &&
                var16_ref.field_q != var16_ref.field_k.field_q) {
                if (null != var16_ref.field_u) {
                  stackIn_48_0 = (var16_ref.field_u.field_z + (var16_ref.field_q.field_z + var16_ref.field_k.field_q.field_z)) / 3;
                } else {
                  stackIn_48_0 = (var16_ref.field_q.field_z + var16_ref.field_k.field_q.field_z) / 2;
                }
                var17 = stackIn_48_0;
              } else if (var16_ref.field_k != null &&
                var16_ref.field_k.field_u != null &&
                var16_ref.field_k.field_u != var16_ref.field_q) {
                if (var16_ref.field_u != null) {
                  stackIn_55_0 = (var16_ref.field_q.field_z + var16_ref.field_u.field_z + var16_ref.field_k.field_u.field_z) / 3;
                } else {
                  stackIn_55_0 = (var16_ref.field_q.field_z + var16_ref.field_k.field_u.field_z) / 2;
                }
                var17 = stackIn_55_0;
              } else {
                if (var16_ref.field_u == null) {
                  stackIn_59_0 = var16_ref.field_q.field_z;
                } else {
                  stackIn_59_0 = (var16_ref.field_u.field_z + var16_ref.field_q.field_z) / 2;
                }
                var17 = stackIn_59_0;
              }
              stackIn_62_0 = var15;
              stackIn_62_1 = false;
              stackIn_62_2 = null;
              stackIn_62_3 = null;
              stackIn_62_4 = var5;
              stackIn_62_5 = var16_ref.field_u;
              if (null == var16_ref.field_k) {
                stackIn_63_2 = null;
                stackIn_63_3 = null;
                stackIn_63_6 = null;
              } else {
                stackIn_63_2 = null;
                stackIn_63_3 = null;
                stackIn_63_6 = var16_ref.field_k.field_u;
              }
              ((dm) (Object) stackIn_62_0).a(stackIn_62_1, new jd(stackIn_62_4, stackIn_62_5, stackIn_63_6, (int)(var16_ref.field_h + var16_ref.field_i * var16_ref.field_o), (int)(var16_ref.field_l + var16_ref.field_o * var16_ref.field_s), var17));
              var16_ref = (nc) (var6.a((byte) -71));
            }
            var9Lifetime1 = var15.field_g;
            var5.field_r = new jd[var9Lifetime1];
            var15.a(var5.field_r, 0);
            var17Lifetime1 = var5.field_r[var9Lifetime1 - 1].field_c;
            var18 = var5.field_r[var9Lifetime1 - 1].field_f;
            for (var19 = 0; var5.field_r.length > var19; var19++) {
              var8Lifetime1 = var5.field_r[var19].field_f;
              var7Lifetime1 = var5.field_r[var19].field_c;
              var5.field_r[var19].field_g = (int)(0.05 * Math.sqrt((double)((var8Lifetime1 - var18) * (var8Lifetime1 - var18) + (var7Lifetime1 - var17Lifetime1) * (var7Lifetime1 - var17Lifetime1))) + 0.5);
              var17Lifetime1 = var7Lifetime1;
              if (var5.field_r[var19].field_g < 2) {
                var5.field_r[var19].field_g = 2;
              }
              var18 = var8Lifetime1;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_e = null;
        field_a = null;
        if (param0 != -11) {
          t.a((byte) 61);
        }
    }

    t(ln[] param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "t.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Return to game";
        field_b = "Click to show the Production window.";
        field_e = "Suggest muting this player";
        field_f = 10;
    }
}
