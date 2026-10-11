/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vba extends we {
    private int[] field_w;
    private int[] field_r;
    private int field_t;
    static float field_v;
    static int[] field_x;
    static boolean[] field_u;
    private int field_s;

    vba(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        int var7_int = 0;
        this.field_w = new int[42];
        this.field_r = new int[42];
        try {
          for (var7_int = 0; var7_int < this.field_w.length; var7_int++) {
            this.field_w[var7_int] = uca.field_c.a(3, 0);
          }
          this.field_o = false;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vba.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != -48) {
          return 48;
        }
        return this.a((byte) 126, param0) + this.field_m[param0].e(param1 ^ 141);
    }

    final void a(boolean param0, boolean param1, int param2) {
        int dupTemp$2 = 0;
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1, param2);
        for (var4 = 0; 42 > var4; var4++) {
          dupTemp$2 = this.field_r[var4] - 1;
          this.field_r[var4] = dupTemp$2;
          if (0 > dupTemp$2) {
            this.field_r[var4] = 0;
          }
        }
        if (-1 != this.field_s) {
          dupTemp$0 = this.field_r[this.field_s] + 2;
          this.field_r[this.field_s] = dupTemp$0;
          if (dupTemp$0 > 4) {
            this.field_r[this.field_s] = 4;
          }
        }
        if (this.field_t != -1) {
          dupTemp$1 = this.field_r[this.field_t] + 3;
          this.field_r[this.field_t] = dupTemp$1;
          if (dupTemp$1 > 8) {
            this.field_r[this.field_t] = 8;
          }
        }
        if (!this.field_q.b(20)) {
          return;
        }
        this.field_s = this.b(sta.field_B, jba.field_j, true);
        if (hf.field_b == 1) {
          var4Lifetime1 = this.b(lba.field_p, jm.field_m, true);
          if (var4Lifetime1 != this.field_t) {
            if (var4Lifetime1 != -1) {
              this.field_t = var4Lifetime1;
            }
          } else {
            this.field_t = -1;
          }
        }
    }

    private final nh h(int param0, int param1) {
        if ((!eq.c(param1) ||
          !oj.field_tb[82]) &&
          !this.a(false, param0)) {
          return lva.field_m[42 + this.field_w[param0]];
        }
        return lva.field_m[param0];
    }

    private final int b(int param0, int param1, boolean param2) {
        int stackIn_38_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        var11 = TombRacer.field_G ? 1 : 0;
        var4 = this.d(-29787);
        var5 = -1;
        var6 = 0;
        var7 = -1;
        var8 = -1;
        var9 = 0;
        if (!param2) {
          this.field_s = -44;
        }
        while (var4 > 0) {
          if (-1 == var5 ||
            9 == var6) {
            var6 = 0;
            var5++;
            stackIn_38_0 = (var4 >= 9) ? 9 : var4;
            var10 = stackIn_38_0;
            var7 = (40 * (9 - var10) >> 1) + ((-360 + (-188 + (aaa.a(false) - 80)) >> 1) + 40);
            var8 = 44 * var5 + ((-540 + (-80 + aaa.a(false) - 8) >> 1) + 80);
          }
          if (this.i(var9, 38)) {
            if (param1 >= var7 &&
              param0 >= var8 &&
              var7 + 40 > param1 &&
              param0 < 44 + var8) {
              return var9;
            }
            var4--;
            var7 += 40;
            var6++;
          }
          var9++;
        }
        return -1;
    }

    private final void j(int param0, int param1) {
        int stackIn_10_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9_int;
        nh var9;
        int var10;
        int var11;
        var11 = TombRacer.field_G ? 1 : 0;
        var3 = this.d(-29787);
        var4 = -1;
        if (param0 > -102) {
          return;
        }
        var5 = 0;
        var6 = -1;
        var7 = -1;
        var8 = 0;
        while (var3 > 0) {
          if (var4 == -1 ||
            var5 == 9) {
            var5 = 0;
            var4++;
            stackIn_10_0 = (var3 < 9) ? var3 : 9;
            var9_int = stackIn_10_0;
            var6 = (40 * (-var9_int + 9) >> 1) + (-540 + (-80 + aaa.a(false) - 8) >> 1) + 40;
            var7 = (-8 + (aaa.a(false) - 80) - 540 >> 1) + param1 + 80 + 44 * var4;
          }
          if (this.i(var8, 94)) {
            var9 = this.h(var8, 0);
            var10 = this.field_r[var8];
            var9.a(-(var10 >> 1) + (var6 + 4), -(var10 >> 1) + (var7 + 4), var10 + 32, var10 + 32);
            var5++;
            var3--;
            var6 += 40;
          }
          var8++;
        }
        return;
    }

    private final boolean a(boolean param0, int param1) {
        int discarded$0 = 0;
        if (param0) {
          da var4 = (da) null;
          discarded$0 = this.a((String) null, (qla) null, -5, -61, -30, (da) null, 39, -50, -125);
        }
        return vaa.a(rb.field_o, param1, -101);
    }

    final static pha a(byte param0, long param1) {
        if (param0 != -40) {
          field_v = -0.5121414661407471f;
        }
        return (pha) (tc.field_d.a(param0 ^ 88, param1));
    }

    private final boolean i(int param0, int param1) {
        if (param1 <= 30) {
          this.a(false, 72, (byte) -87);
        }
        return lk.field_h[param0];
    }

    final int a(byte param0, int param1) {
        if (param0 <= 111) {
          return 68;
        }
        return aaa.a(false) / 2 - (-15 + this.field_m[param1].e(-163) / 2 * this.field_m.length) + this.field_m[param1].e(-163) * param1;
    }

    private final void c(int param0, byte param1) {
        int discarded$0 = 0;
        int stackIn_5_0 = 0;
        int var3;
        int var4;
        int var5;
        ha var6_ref_ha;
        int var6;
        int var7;
        int var8_int;
        String var8;
        int var10;
        nh[] var11;
        String var12;
        int var7Lifetime1;
        var3 = 26;
        var4 = -180 + aaa.a(false) - 40;
        var5 = 9 + (80 + param0);
        var6_ref_ha = tga.field_a;
        if (param1 != -22) {
          this.field_w = (int[]) null;
        }
        var7 = var4;
        var8_int = var5;
        var11 = dr.field_a;
        tra.a(1, var11, (byte) -89, var7, var6_ref_ha, 180, 1, 180, var8_int, 0);
        if (this.field_t != -1) {
          stackIn_5_0 = this.field_t;
        } else {
          stackIn_5_0 = this.field_s;
        }
        var6 = stackIn_5_0;
        if (-1 == var6) {
          return;
        }
        if (!this.i(var6, 65)) {
          return;
        }
        this.h(var6, 0).a(var4 + var3, var3 + var5);
        var7Lifetime1 = var5 + 20 + 180;
        var8 = lq.field_p[var6].toUpperCase();
        var12 = kv.field_c[var6];
        var10 = this.a(var8, ds.field_n, -6671872, 180, var4, eda.field_f, 128, var7Lifetime1, 15);
        var7Lifetime1 = var7Lifetime1 + (5 + 15 * var10);
        if (!this.a(false, var6)) {
          kn.field_p.a(var7Lifetime1, false, pg.field_x, var4, -6671872, -1);
        } else {
          kn.field_p.a(var7Lifetime1, false, dl.field_p, var4, -14671840, -1);
        }
        var7Lifetime1 += 20;
        discarded$0 = this.a(var12 + "<br><br>" + jn.field_r + sw.field_zb[var6] + "       " + vla.field_m + sw.field_zb[var6] / 100, kv.field_a, -14671840, 180, var4, kn.field_p, param1 ^ -150, var7Lifetime1, 15);
        return;
    }

    final int g(int param0, int param1) {
        if (param1 != 30) {
          this.field_r = (int[]) null;
        }
        return -30 + koa.b(param1 ^ 30);
    }

    private final int a(String param0, qla param1, int param2, int param3, int param4, da param5, int param6, int param7, int param8) {
        int var12 = 0;
        String[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var13 = 0;
        String[] var14 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          var14 = new String[10];
          var10 = var14;
          var11 = param1.a(param0, -99, var14, (nh[]) null, new int[]{param3});
          if (param6 != 128) {
            stackIn_3_0 = -59;
            return stackIn_3_0;
          }
          for (var12 = 0; var14.length > var12; var12++) {
            param5.a(var12 * param8 + param7, false, var14[var12], param4, param2, -1);
          }
          stackIn_8_0 = var11;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_11_0 = var10_ref;
          stackIn_11_1 = new StringBuilder().append("vba.IA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final String b(int param0, byte param1) {
        if (param1 <= 111) {
          field_u = (boolean[]) null;
        }
        if (0 == param0) {
          return fga.field_a;
        }
        return super.b(param0, (byte) 121);
    }

    final void a(boolean param0, int param1, byte param2) {
        qr.field_v.a(63 + param1, false, qja.field_i.toUpperCase(), 65, -14279929, -1);
        this.j(-119, param1);
        this.c(param1, (byte) -22);
        if (vpa.a(7)) {
          kn.field_p.a(-1, -1, aaa.a(false) / 2, -14345466, 405 + param1, ooa.field_h);
        }
        if (param2 >= -9) {
          this.field_r = (int[]) null;
        }
    }

    private final int d(int param0) {
        int discarded$1 = 0;
        int var3 = 0;
        int var2;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param0 != -29787) {
          discarded$1 = this.d(76);
        }
        var2 = 0;
        for (var3 = 0; 42 > var3; var3++) {
          if (this.i(var3, 37)) {
            var2++;
          }
        }
        return var2;
    }

    public static void d(byte param0) {
        field_x = null;
        field_u = null;
        if (param0 != -10) {
          field_x = (int[]) null;
        }
    }

    final boolean c(int param0, int param1) {
        if (param1 != 0) {
          return true;
        }
        return super.c(param0, 0);
    }

    static {
        field_x = new int[]{128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128};
        field_v = 0.25f;
    }
}
