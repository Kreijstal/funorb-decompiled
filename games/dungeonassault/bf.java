/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    private int[] field_n;
    static int field_k;
    private int[] field_j;
    private int[] field_a;
    static qe[] field_f;
    private int[] field_l;
    static ge field_h;
    private int field_g;
    static int field_b;
    static cn field_d;
    static String field_o;
    private int[] field_c;
    private int[] field_i;
    static tf field_m;
    static cn[] field_e;

    private final void a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        var7 = DungeonAssault.field_K;
        this.field_l = new int[200];
        if (param1 != 31) {
          return;
        }
        this.field_a = new int[200];
        this.field_g = 0;
        this.field_j = new int[200];
        this.field_c = new int[200];
        var3 = param0 & 16711935;
        var4 = param0 & 65280;
        this.field_i = new int[64];
        for (var5 = 0; 64 > var5; var5++) {
          var6 = (var5 << 2) * var3 & -16711936 | 16711680 & (var5 << 2) * var4;
          this.field_i[var5] = var6 >> 8;
        }
        var4Lifetime1 = param0 & 65280;
        var3Lifetime1 = param0 & 16711935;
        this.field_n = new int[32];
        for (var5Lifetime1 = 0; var5Lifetime1 < 16; var5Lifetime1++) {
          var6Lifetime1 = var5Lifetime1 * var4Lifetime1 & 1044480 | 267390960 & var3Lifetime1 * var5Lifetime1;
          this.field_n[var5Lifetime1] = var6Lifetime1 >> 4;
          this.field_n[31 - var5Lifetime1] = var6Lifetime1 >> 4;
        }
        return;
    }

    final static void a(String param0, tg param1, int param2, se param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = DungeonAssault.field_K;
        try {
          if (param4 != 15553) {
            bf.a((byte) -113);
          }
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; param0.length() > var7; var7++) {
            var8 = param0.charAt(var7);
            if (var8 == 60) {
              var6 = param1.field_k[0] + ((var5_int >> 8) + param3.b(param0.substring(0, var7)));
            }
            if (var6 != -1) {
              param1.field_k[var7] = var6;
            } else {
              if (var8 == 32) {
                var5_int = var5_int + param2;
              }
              param1.field_k[var7] = param1.field_k[0] + ((var5_int >> 8) + param3.b(param0.substring(0, 1 + var7))) - param3.a((char) var8);
            }
            if (62 == var8) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("bf.G(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        int var2_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var4 = DungeonAssault.field_K;
        try {
          gf.a(kd.field_g);
          gf.e(41, 48, 599, 416);
          if (!param0) {
            for (var2_int = 41; var2_int < 599; var2_int = var2_int + df.field_c.field_E) {
              df.field_c.c(var2_int, 48);
            }
          } else {
            var2_int = oi.b(0, 3);
            var3 = oi.b(0, 3);
            dm.field_d[var2_int].c(41, 48);
            qi.field_f[var3].c(-qi.field_f[0].field_y + 599, 48);
            df.field_c.c(41 + dm.field_d[var2_int].field_y, 48);
          }
          gf.b(kd.field_g);
          c.a(0, 640, 0, (byte) 80);
          c.a(0, 640, 40, (byte) 46);
          vf.a(432, true, 33, -75, 48);
          vf.a(432, true, 599, 113, 48);
          vf.a(32, true, 164, -113, 8);
          if (param1 > -127) {
            field_m = (tf) null;
          }
          vf.a(32, true, 468, 108, 8);
          un.a(41, (byte) 77, 558, 416, true);
          ad.field_e.h(41, 48);
          ad.field_e.j(-ad.field_e.field_d + 599, 48);
          ad.field_e.f(164 - ad.field_e.field_d, 40 - ad.field_e.field_b);
          ad.field_e.i(172, -ad.field_e.field_b + 40);
          ad.field_e.f(-ad.field_e.field_d + 468, -ad.field_e.field_b + 40);
          ad.field_e.i(476, -ad.field_e.field_b + 40);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "bf.H(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var7;
        int var9;
        int var10;
        int var5;
        int var6;
        int var8;
        var10 = DungeonAssault.field_K;
        gf.f(param1, param0, param3 >> 1, 0);
        gf.h(param1, param0, param3 >> 1, this.field_i[63]);
        var9 = 0;
        if (!param2) {
          return;
        }
        while (200 > var9) {
          var7 = ((this.field_l[var9] >> 4) * (this.field_l[var9] >> 4) + (this.field_a[var9] >> 4) * (this.field_a[var9] >> 4)) / 3;
          if (var7 > 0) {
            var8 = var7 >> 4;
            var5 = (int)((double)(this.field_l[var9] * param3) / Math.sqrt((double)(3 * var7)));
            if (var8 > 63) {
              var8 = 63;
            }
            var6 = (int)((double)(param3 * this.field_a[var9]) / Math.sqrt((double)(var7 * 3)));
            var7 = var7 * param3;
            gf.b((var5 >> 1) + (param1 << 4), (var6 >> 1) + (param0 << 4), var7 >> 10, var8, this.field_i);
          }
          var9++;
        }
        gf.g(param1, param0, param3 >> 1, 0, 50);
        gf.a(param1 << 4, param0 << 4, param3 + 2 << 4 >> 1, 192, this.field_n);
        gf.a(param1 << 4, param0 << 4, 2 + param3 << 3, 192, this.field_n);
        gf.a(param1 << 4, param0 << 4, param3 + 2 << 3, 192, this.field_n);
        gf.a(param1 << 4, param0 << 4, 2 + param3 << 3, 192, this.field_n);
    }

    public static void a(byte param0) {
        field_o = null;
        field_f = null;
        if (param0 != 85) {
          return;
        }
        field_m = null;
        field_d = null;
        field_e = null;
        field_h = null;
    }

    final static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        pm var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        wj var13 = null;
        int var14 = 0;
        wj var15 = null;
        int[][] var19 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = DungeonAssault.field_K;
        try {
          var13 = ra.field_c;
          var15 = var13;
          var2 = var15.c(true);
          if (param0 != 19664) {
            field_k = -97;
          }
          var3 = (pm) (li.field_a.e(param0 ^ -4796));
          while (var3 != null) {
            if (var3.field_j != var2) {
              var3 = (pm) (li.field_a.a(4));
              continue;
            }
            break;
          }
          if (var3 == null) {
            tl.a(param0 ^ -19664);
            return;
          }
          var4 = var15.c(true);
          if (var4 != 0) {
            ah.field_c[0] = tc.field_u;
            var5 = var3.field_i;
            for (var6_int = 1; var4 > var6_int; var6_int++) {
              ah.field_c[var6_int] = var13.d(-108);
            }
            hg.a(param0 + 12087, var5, var4);
            for (var6_intLifetime1 = 0; var4 > var6_intLifetime1; var6_intLifetime1++) {
              dj.a(var15, (byte) 123);
              if (var6_intLifetime1 != 0) {
                oc.a(var6_intLifetime1, (byte) -59, dh.field_g, cm.field_P, fm.field_g, ln.field_e);
              } else {
                oc.a(var6_intLifetime1, (byte) -66, dh.field_g, cm.field_P, fm.field_g, ln.field_e);
              }
            }
            kj.a(var5, 0);
            var6 = new String[2][var5];
            var19 = new int[2][var5 * 4];
            var8 = lc.field_d;
            var9 = 0;
            var10 = 0;
            while (var8 > var9) {
              var11 = ol.field_k[var9];
              var6[0][var10] = ah.field_c[var11];
              var19[0][var10 * 4] = i.field_t[var11];
              var19[0][1 + var10 * 4] = mf.field_d[var11];
              var19[0][2 + var10 * 4] = wa.field_m[var11];
              var19[0][4 * var10 + 3] = tc.field_w[var11];
              if (eh.a(true, ah.field_c[var11]) &&
                wa.field_m[var11] + mf.field_d[var11] + tc.field_w[var11] == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var10++;
              var9++;
            }
            var9Lifetime1 = 0;
            var14 = 0;
            var10Lifetime1 = var14;
            while (var9Lifetime1 < var8) {
              var11Lifetime1 = ol.field_k[var9Lifetime1 + var5];
              var6[1][var14] = ah.field_c[var11Lifetime1];
              var19[1][var14 * 4] = i.field_t[var11Lifetime1];
              var19[1][4 * var14 + 1] = mf.field_d[var11Lifetime1];
              var19[1][4 * var14 + 2] = wa.field_m[var11Lifetime1];
              var19[1][var14 * 4 + 3] = tc.field_w[var11Lifetime1];
              if (eh.a(true, ah.field_c[var11Lifetime1]) &&
                tc.field_w[var11Lifetime1] + wa.field_m[var11Lifetime1] + mf.field_d[var11Lifetime1] == 0) {
                var6[1][var14] = null;
                var14--;
              }
              var9Lifetime1++;
              var14++;
            }
            var3.a(false);
            return;
          }
          var3.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "bf.E(" + param0 + ')');
        }
    }

    final void a(int param0) {
        int var2;
        double var3;
        int var5;
        int var2Lifetime1;
        var5 = DungeonAssault.field_K;
        if (param0 > -84) {
          return;
        }
        for (var2 = 0; var2 < 200; var2++) {
          if (this.field_l[var2] < this.field_c[var2]) {
            this.field_l[var2] = this.field_l[var2] + 6;
          }
          if (this.field_c[var2] < this.field_l[var2]) {
            this.field_l[var2] = this.field_l[var2] - 3;
          }
          if (this.field_j[var2] > this.field_a[var2]) {
            this.field_a[var2] = this.field_a[var2] + 3;
          }
          if (this.field_a[var2] > this.field_j[var2]) {
            this.field_a[var2] = this.field_a[var2] - 6;
          }
        }
        var2Lifetime1 = 864 + oi.b(0, 160);
        var3 = 0.01 * (double)oi.b(0, 21400);
        this.field_c[this.field_g] = (int)((double)var2Lifetime1 * Math.sin(var3));
        this.field_j[this.field_g] = (int)((double)var2Lifetime1 * Math.cos(var3));
        this.field_g = this.field_g + 1;
        if (this.field_g >= 200) {
          this.field_g = 0;
        }
        return;
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          if (param2 >= -9) {
            stackIn_3_0 = -99;
            return stackIn_3_0;
          }
          var3_int = 1;
          while (param0 > 1) {
            if ((1 & param0) != 0) {
              var3_int = var3_int * param1;
            }
            param0 = param0 >> 1;
            param1 = param1 * param1;
          }
          if (param0 != 1) {
            stackIn_14_0 = var3_int;
            return stackIn_14_0;
          }
          stackIn_12_0 = var3_int * param1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3), "bf.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, String param4) {
        try {
          kn.a(param2, param4 + "_defeat", param1, param0, 125, 96, param4 + "_special", param4 + "_reveal");
          if (param3 != -18228) {
            bf.a((byte) -43);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "bf.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    bf(int param0) {
        int var2 = 0;
        this.a(param0, 31);
        for (var2 = 0; var2 < 100; var2++) {
          this.a(-105);
        }
    }

    static {
        field_f = new qe[14];
    }
}
