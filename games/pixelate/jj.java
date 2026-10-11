/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jj {
    private String field_l;
    int field_d;
    static String field_j;
    static String field_e;
    tf[] field_k;
    tf[] field_f;
    tf[] field_a;
    static int[] field_h;
    int[][] field_g;
    private tf field_i;
    static String field_c;
    static int field_b;

    final void a(byte param0) {
        int var7 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var8;
        fa var9;
        var8 = Pixelate.field_H ? 1 : 0;
        if (0 < this.field_d) {
          var2 = -(kb.field_L.c(this.field_l) / 2) + 320 - 20;
          var3 = 20 + kb.field_L.c(this.field_l) / 2 + 320;
          var4 = -1;
          var5 = 25;
          t.a(nh.field_a);
          if (this.field_d <= dm.field_Cb - var5) {
            if (var5 > this.field_d) {
              var4 = 640 - this.field_d * 640 / var5;
              t.f(var4, 0, var3, 480);
            }
          } else {
            var4 = 640 * (-this.field_d + dm.field_Cb) / var5;
            t.f(var2, 0, var4, 480);
          }
          fi.a(this.field_i, 0, -kb.field_L.field_w + (140 - pd.field_Jb * 2));
          kb.field_L.b(this.field_l, 320, 140, 0, 0);
          t.b(nh.field_a);
          if (var4 > 0) {
            var6 = -((kb.field_L.field_w + kb.field_L.field_z) / 2) + 141;
            for (var7 = 0; 10 > var7; var7++) {
              t.a(-40 + var4 + 4 * var7 << 4, var6 << 4, var7 << 3, 15, bo.field_c);
            }
          }
        }
        if (param0 > -87) {
          var9 = (fa) null;
          jj.$cfr$intArgs$a$2d0b7bdf67eb(106, (fa) null, (fa) null);
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        gk.field_fb = param4;
        hq.field_r = param0;
        if (param1) {
          return;
        }
        ii.field_i = param3;
        ul.field_q = param2;
    }

    final static bo[] a(cb param0, int param1) {
        int var5 = 0;
        bo[] stackIn_3_0 = null;
        bo[] stackIn_7_0 = null;
        bo[] stackIn_13_0 = null;
        bo[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        bo[] var4 = null;
        bo var6 = null;
        int var7 = 0;
        ei var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          if (param1 != -855969982) {
            stackIn_3_0 = (bo[]) null;
            return stackIn_3_0;
          }
          if (!param0.a((byte) 115)) {
            stackIn_7_0 = new bo[]{};
            return stackIn_7_0;
          }
          var8 = param0.a(true);
          while (0 == var8.field_b) {
            vg.a(10L, (byte) 23);
          }
          if (var8.field_b == 2) {
            stackIn_13_0 = new bo[]{};
            return stackIn_13_0;
          }
          var10 = (int[]) (var8.field_e);
          var9 = var10;
          var3 = var9;
          var4 = new bo[var10.length >> 2];
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new bo();
            var4[var5] = var6;
            var6.field_l = var3[var5 << 2];
            var6.field_i = var3[1 + (var5 << 2)];
            var6.field_j = var3[2 + (var5 << 2)];
            var6.field_g = var3[3 + (var5 << 2)];
          }
          stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("jj.N(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    void c(int param0) {
        if (param0 > ~this.field_d) {
          this.field_d = this.field_d - 1;
        }
        jd.field_r = jd.field_r + 1;
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != -4136) {
          return;
        }
        field_j = null;
        field_c = null;
        field_h = null;
    }

    final static void a(byte param0, fa param1, fa param2) {
        try {
          if (param2.field_h != null) {
            param2.c(2779);
          }
          param2.field_a = param1;
          int var3_int = 28 / ((58 - param0) / 36);
          param2.field_h = param1.field_h;
          param2.field_h.field_a = param2;
          param2.field_a.field_h = param2;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "jj.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        r.b(-93);
        eh.a(3, v.field_c, fq.field_q, r.field_c, h.field_V[param0].field_A, hk.field_b);
    }

    void a(boolean param0) {
        if (param0) {
          this.field_d = -82;
        }
    }

    jj(String param0, tf[] param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        tf var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5Lifetime1;
        int var7Lifetime1;
        int var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var9Lifetime1Lifetime1;
        this.field_d = 0;
        try {
          this.field_f = param1;
          this.field_l = "\"" + param0 + "\"";
          this.field_k = new tf[this.field_f.length];
          this.field_a = new tf[this.field_f.length];
          var3_int = this.field_f[0].field_F >> 1;
          var4 = this.field_f[0].field_F >> 2;
          for (var5 = 0; var5 < this.field_f.length; var5++) {
            this.field_k[var5] = new tf(var3_int, var3_int);
            this.field_a[var5] = new tf(var4, var4);
            this.field_k[var5].c();
            this.field_f[var5].d(0, 0);
            this.field_a[var5].c();
            this.field_f[var5].e(0, 0);
            this.field_f[var5].c();
            t.a(0, 0, 128, 128, 0, 48);
          }
          this.field_i = new tf(640, 4 * pd.field_Jb + (kb.field_L.field_w + kb.field_L.field_z));
          this.field_i.c();
          var5Lifetime1 = 320;
          var6 = this.field_i.field_E - pd.field_Jb * 2 - kb.field_L.field_z;
          kb.field_L.b(this.field_l, -1 + var5Lifetime1, var6 - 1, 0, -1);
          kb.field_L.b(this.field_l, var5Lifetime1 + 1, var6 - 1, 0, -1);
          kb.field_L.b(this.field_l, var5Lifetime1 - 1, var6 + 1, 0, -1);
          kb.field_L.b(this.field_l, 1 + var5Lifetime1, var6 + 1, 0, -1);
          t.c(pd.field_Jb, pd.field_Jb, 0, 0, this.field_i.field_F, this.field_i.field_E);
          kb.field_L.b(this.field_l, var5Lifetime1, var6, 0, -1);
          qa.field_f.a(19692);
          this.field_g = new int[2][];
          for (var7 = 0; this.field_k.length > var7; var7++) {
            var8_int = 0;
            var9 = 0;
            var10 = 0;
            for (var11 = 0; this.field_k[var7].field_G.length > var11; var11++) {
              var12 = this.field_k[var7].field_G[var11];
              var9 = var9 + ((var12 & 65280) >> 8);
              var10 = var10 + (255 & var12);
              var8_int = var8_int + (255 & var12 >> 16);
            }
            var11Lifetime1 = 48;
            var9 = var11Lifetime1 + (255 & var9 / this.field_k[var7].field_G.length);
            var8_int = var11Lifetime1 + (var8_int / this.field_k[var7].field_G.length & 255);
            var10 = (var10 / this.field_k[var7].field_G.length & 255) + var11Lifetime1;
            if (var9 > 255) {
              var9 = 255;
            }
            if (var8_int > 255) {
              var8_int = 255;
            }
            if (255 < var10) {
              var10 = 255;
            }
            this.field_g[var7] = new int[32];
            var17 = 0;
            var12Lifetime1 = var17;
            while (var17 < this.field_g[var7].length) {
              var13 = 255 & var17 * var8_int / 32;
              var14 = var9 * var17 / 32 & 255;
              var15 = 255 & var10 * var17 / 32;
              this.field_g[var7][var17] = bq.a(bq.a(var13 << 16, var14 << 8), var15);
              var17++;
            }
          }
          for (var7Lifetime1 = 0; var7Lifetime1 < 2; var7Lifetime1++) {
            var8 = this.field_f[var7Lifetime1];
            for (var9Lifetime1 = 0; var9Lifetime1 < var8.field_G.length; var9Lifetime1++) {
              if (var8.field_G[var9Lifetime1] == 0) {
                var8.field_G[var9Lifetime1] = 65793;
              }
            }
            var8.field_G[127] = 0;
            var8.field_G[63] = 0;
            var8.field_G[64] = 0;
            var8.field_G[0] = 0;
            var8.field_G[1] = 0;
            var8.field_G[62] = 0;
            var9Lifetime1Lifetime1 = (-1 + var8.field_B) * var8.field_A;
            var8.field_G[var9Lifetime1Lifetime1] = 0;
            var8.field_G[var9Lifetime1Lifetime1 + 1] = 0;
            var8.field_G[var9Lifetime1Lifetime1 - 64] = 0;
            var8.field_G[var9Lifetime1Lifetime1 + 63] = 0;
            var8.field_G[var9Lifetime1Lifetime1 + 62] = 0;
            var8.field_G[var9Lifetime1Lifetime1 - 1] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("jj.<init>(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    static {
        field_j = "Enter name of friend to add to list";
        field_e = "<%0> would need a rating of <%1> to play with the current options.";
        field_c = "Reload game";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$2d0b7bdf67eb(int param0, fa param1, fa param2) {
        try {
          if (param2.field_h != null) {
            param2.c(2779);
          }
          param2.field_a = param1;
          int var3_int = 28 / ((58 - param0) / 36);
          param2.field_h = param1.field_h;
          param2.field_h.field_a = param2;
          param2.field_a.field_h = param2;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "jj.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }
}
