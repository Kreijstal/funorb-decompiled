/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uw {
    static String field_a;
    static int field_e;
    private ev field_d;
    private iq field_f;
    static String field_b;
    static wv[] field_g;
    private vf[] field_c;

    final iq c(int param0) {
        if (param0 != 0) {
          this.a(101);
        }
        return this.field_f;
    }

    final void d(int param0) {
        int var3 = 0;
        vf var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        this.field_f.a((byte) 119);
        vf[] var6 = this.field_c;
        vf[] var2 = var6;
        for (var3 = param0; var6.length > var3; var3++) {
          var4 = var6[var3];
          var4.a(1);
        }
    }

    final void a(int param0, iq param1) {
        try {
          this.field_f = param1;
          if (param0 != -24343) {
            this.field_f = (iq) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uw.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3;
        boolean stackIn_3_0 = false;
        boolean stackIn_8_0 = false;
        var3 = -60 / ((param2 - 36) / 54);
        stackIn_3_0 = ((param1 & 2048) != 0);
        stackIn_8_0 = !(!stackIn_3_0 | fua.a(110, param1, param0)) || (no.a(param0, param1, 36864));
        return stackIn_8_0;
    }

    final ev a(byte param0) {
        if (param0 != 59) {
          return (ev) null;
        }
        return this.field_d;
    }

    final void a(int param0, fo param1, byte param2) {
        if (param2 != -33) {
          return;
        }
        try {
          this.field_c[param0].a((byte) 64, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uw.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, ev param1) {
        try {
          this.field_d = param1;
          if (param0 != -28265) {
            this.field_c = (vf[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uw.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void f(int param0) {
        if (param0 != 0) {
          field_g = (wv[]) null;
        }
        field_g = null;
        field_b = null;
        field_a = null;
    }

    final void b(int param0) {
        this.field_f.a(false);
        if (param0 != 1909106792) {
          field_b = (String) null;
        }
    }

    final void a(byte param0, int param1, fo param2) {
        try {
          this.field_c[param1].a(param2, (byte) -61);
          int var4_int = -46 % ((param0 + 45) / 37);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uw.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0) {
        int var3 = 0;
        vf var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        if (this.field_d != null) {
          this.field_d.a(13113);
        }
        vf[] var6 = this.field_c;
        vf[] var2 = var6;
        if (param0 != 10) {
          field_e = 75;
        }
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          var4.b(331);
        }
    }

    final void e(int param0) {
        int var4 = 0;
        int var2;
        vf[] var3;
        vf var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        if (null != this.field_d) {
          this.field_d.a(this.field_f, -15530);
        }
        var2 = 0;
        if (param0 != 30057) {
          this.field_f = (iq) null;
        }
        var3 = this.field_c;
        for (var4 = 0; var3.length > var4; var4++) {
          var5 = var3[var4];
          if (null != this.field_d) {
            this.field_d.a(var2, var5, this.field_f, 11180543);
          }
          var5.a(this.field_f, 1);
          var5.a(false, this.field_f);
          if (null != this.field_d) {
            this.field_d.a(var5, var2, this.field_f, true);
          }
          var2++;
        }
        if (null != this.field_d) {
          this.field_d.a(-16188, this.field_f);
        }
    }

    final static void a(boolean param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        an var4_ref_an = null;
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
        int var16 = 0;
        an var17 = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          vs.field_P = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = cq.field_b.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var1_int > var3; var3++) {
            var4_ref_an = cq.field_b[var3];
            var4_ref_an.a((byte) -117);
            oka.b((byte) 17, var3);
            var5 = var4_ref_an.field_i + var4_ref_an.field_z >> 1;
            var6 = var4_ref_an.field_m + var4_ref_an.field_b >> 1;
            var7 = var4_ref_an.field_p + var4_ref_an.field_a >> 1;
            var8 = vs.field_P[9] >> 2;
            var9 = vs.field_P[10] >> 2;
            var10_int = vs.field_P[11] >> 2;
            var11 = nba.field_a[5] * var10_int + (nba.field_a[4] * var9 + var8 * nba.field_a[3]) >> 14;
            var12 = nba.field_a[8] * var10_int + (var8 * nba.field_a[6] + nba.field_a[7] * var9) >> 14;
            var13 = var10_int * nba.field_a[11] + var8 * nba.field_a[9] + var9 * nba.field_a[10] >> 14;
            var2[var3] = var5 * var11 - (-(var6 * var12) - var7 * var13) >> 16;
          }
          var3Lifetime1 = vs.field_P[9] >> 8;
          var4 = vs.field_P[10] >> 8;
          var5Lifetime1 = vs.field_P[11] >> 8;
          var6Lifetime1 = tl.field_r << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = cr.a(true, var6Lifetime1) >> 8;
          var9Lifetime1 = pla.b(119, var6Lifetime1) >> 8;
          if (jba.field_j != -1 &&
            sta.field_B != -1) {
            var7Lifetime1 = -320 + jba.field_j;
            var8Lifetime1 = 240 - sta.field_B;
            var9Lifetime1 = -128;
          }
          if (param0) {
            field_b = (String) null;
          }
          var10 = 256.0 / Math.sqrt((double)(var9Lifetime1 * var9Lifetime1 + var8Lifetime1 * var8Lifetime1 + var7Lifetime1 * var7Lifetime1));
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          var13Lifetime1 = -var4 + var8Lifetime1;
          var14 = -var5Lifetime1 + var9Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var13Lifetime1 * var13Lifetime1 + var12Lifetime1 * var12Lifetime1 + var14 * var14));
          var14 = (int)((double)var14 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          for (var15 = 0; cq.field_b.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < cq.field_b.length; var17_int++) {
              if (var21[var16] < var21[var17_int]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17 = cq.field_b[var16];
            oka.b((byte) 86, var16);
            for (var18 = 0; var18 < 3; var18++) {
              nba.field_a[var18] = nba.field_a[var18] + tfa.field_e[var15][var18];
            }
            ft.a(var17, 1251086882, nba.field_a, vs.field_P, true, false, false);
            dh.a(var9Lifetime1, var8Lifetime1, var13Lifetime1, var17, var7Lifetime1, var14, var12Lifetime1, (byte) -23);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "uw.B(" + param0 + ')');
        }
    }

    uw(int param0) {
        int var2 = 0;
        this.field_c = new vf[param0];
        for (var2 = 0; param0 > var2; var2++) {
          this.field_c[var2] = new vf(this);
        }
    }

    static {
        field_a = "Player";
        field_b = "Treasure adds to your score - and in multiplayer mode, the player with the most treasure wins. Escape the chamber to bank your treasure and earn points.";
    }
}
