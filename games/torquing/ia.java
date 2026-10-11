/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends af {
    static t field_f;
    private int field_h;
    int field_c;
    static double field_d;
    private int field_e;
    private int field_g;
    static int field_i;

    final static void d(int param0) {
        if (param0 >= 37) {
          if (of.field_m < 140) {
            ea.b(-36, of.field_m + 20);
          } else {
            ea.b(-108, 160);
          }
          return;
        }
    }

    public static void c(int param0) {
        field_f = null;
        if (param0 <= 16) {
          ia.c(23);
        }
    }

    final static boolean a(int param0, int param1) {
        if (param1 != -1) {
          if (param0 != -22426) {
            ia.c(-53);
          }
          return 0 != (1 << param1 & oh.field_c) ? true : false;
        }
        return true;
    }

    final void b(int param0) {
        if (param0 != 6) {
          this.field_e = -123;
        }
        this.a((byte) 75, 0, 0);
    }

    final void a(byte param0, int param1, int param2) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        var22 = Torquing.field_u;
        var4 = param1 + this.field_h;
        var6 = 120 / ((25 - param0) / 44);
        var5 = this.field_c + param2;
        if (wp.field_v[3] != null) {
          stackIn_3_0 = wp.field_v[3].field_w;
        } else {
          stackIn_3_0 = 0;
        }
        var7 = stackIn_3_0;
        if (null == wp.field_v[5]) {
          stackIn_6_0 = 0;
        } else {
          stackIn_6_0 = wp.field_v[5].field_w;
        }
        var8 = stackIn_6_0;
        if (null != wp.field_v[1]) {
          stackIn_9_0 = wp.field_v[1].field_u;
        } else {
          stackIn_9_0 = 0;
        }
        var9 = stackIn_9_0;
        if (wp.field_v[7] == null) {
          stackIn_12_0 = 0;
        } else {
          stackIn_12_0 = wp.field_v[7].field_u;
        }
        var10 = stackIn_12_0;
        var11 = this.field_g + var4;
        var12 = this.field_e + var5;
        var13 = var4 + var7;
        var14 = var11 - var8;
        var15 = var9 + var5;
        var16 = var12 - var10;
        var17 = var13;
        var18 = var14;
        if (var17 > var18) {
          var18 = var4 + this.field_g * var7 / (var7 + var8);
          var17 = var4 + this.field_g * var7 / (var7 + var8);
        }
        var19 = var15;
        var20 = var16;
        if (var19 > var20) {
          var20 = this.field_e * var9 / (var10 + var9) + var5;
          var19 = this.field_e * var9 / (var10 + var9) + var5;
        }
        rh.a(var4, this.field_e, (byte) 71, var5, this.field_g, ao.field_a);
        ph.d(var17, var19, var18 - var17, var20 - var19, bo.field_d);
        ph.b(tj.field_m);
        if (null != wp.field_v[0]) {
          ph.f(var4, var5, var17, var19);
          hm.a((byte) 101, var5, var4, wp.field_v[0]);
          ph.a(tj.field_m);
        }
        if (wp.field_v[2] != null) {
          ph.f(var18, var5, var11, var19);
          hm.a((byte) 60, var5, var14, wp.field_v[2]);
          ph.a(tj.field_m);
        }
        if (null != wp.field_v[6]) {
          ph.f(var4, var20, var17, var12);
          hm.a((byte) 95, var16, var4, wp.field_v[6]);
          ph.a(tj.field_m);
        }
        if (null != wp.field_v[8]) {
          ph.f(var18, var20, var11, var12);
          hm.a((byte) 58, var16, var14, wp.field_v[8]);
          ph.a(tj.field_m);
        }
        if (wp.field_v[1] != null &&
          0 != wp.field_v[1].field_w) {
          ph.f(var17, var5, var18, var19);
          for (var21 = var13; var21 < var14; var21 = var21 + wp.field_v[1].field_w) {
            hm.a((byte) 66, var5, var21, wp.field_v[1]);
          }
          ph.a(tj.field_m);
        }
        if (null != wp.field_v[7] &&
          wp.field_v[7].field_w != 0) {
          ph.f(var17, var20, var18, var12);
          for (var21Lifetime1 = var13; var21Lifetime1 < var14; var21Lifetime1 = var21Lifetime1 + wp.field_v[7].field_w) {
            hm.a((byte) 70, var16, var21Lifetime1, wp.field_v[7]);
          }
          ph.a(tj.field_m);
        }
        if (wp.field_v[3] != null &&
          wp.field_v[3].field_u != 0) {
          ph.f(var4, var19, var17, var20);
          for (var21Lifetime2 = var15; var21Lifetime2 < var16; var21Lifetime2 = var21Lifetime2 + wp.field_v[3].field_u) {
            hm.a((byte) 63, var21Lifetime2, var4, wp.field_v[3]);
          }
          ph.a(tj.field_m);
        }
        if (wp.field_v[5] != null &&
          wp.field_v[5].field_u != 0) {
          ph.f(var18, var19, var11, var20);
          for (var21Lifetime3 = var15; var21Lifetime3 < var16; var21Lifetime3 = var21Lifetime3 + wp.field_v[5].field_u) {
            hm.a((byte) 88, var21Lifetime3, var14, wp.field_v[5]);
          }
          ph.a(tj.field_m);
        }
    }

    ia(int param0, int param1, int param2, int param3) {
        this.field_e = param3;
        this.field_c = param1;
        this.field_h = param0;
        this.field_g = param2;
    }

    static {
        field_i = 0;
    }
}
