/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    short[] field_O;
    int[] field_c;
    short field_k;
    short[] field_p;
    short[] field_f;
    short[] field_C;
    int[] field_h;
    static eh field_M;
    int field_e;
    int[] field_A;
    short[] field_P;
    byte field_w;
    short[] field_Q;
    short[] field_F;
    int[] field_z;
    private boolean field_t;
    short[] field_l;
    short field_L;
    int[] field_E;
    int[] field_r;
    short[] field_I;
    short[] field_b;
    short[] field_g;
    int field_n;
    static lg field_a;
    int[] field_o;
    int field_N;
    short[] field_s;
    short[] field_B;
    static String field_m;
    static int field_K;
    int[] field_G;
    int field_R;
    int field_D;
    short[] field_i;
    short[] field_x;
    int[] field_j;
    short[] field_u;
    short field_d;
    short[] field_J;
    byte[] field_v;
    short[] field_y;
    int field_H;
    static int field_q;

    final void a(boolean param0) {
        int var8 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var11;
        int var12;
        boolean stackIn_6_1 = false;
        var12 = Bounce.field_N;
        if (this.field_t) {
          return;
        }
        stackIn_6_1 = (param0);
        this.field_t = stackIn_6_1;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        for (var8 = 0; var8 < this.field_k; var8++) {
          var9 = this.field_g[var8];
          var10 = this.field_C[var8];
          if (var10 < var3) {
            var3 = var10;
          }
          var11 = this.field_J[var8];
          if (var10 > var6) {
            var6 = var10;
          }
          if (var9 > var5) {
            var5 = var9;
          }
          if (var9 < var2) {
            var2 = var9;
          }
          if (var4 > var11) {
            var4 = var11;
          }
          if (var11 > var7) {
            var7 = var11;
          }
        }
        this.field_H = var3;
        this.field_e = var2;
        this.field_n = var5;
        this.field_D = var4;
        this.field_R = var7;
        this.field_N = var6;
    }

    private final void b(int param0) {
        this.field_t = false;
        if (param0 >= -106) {
          this.field_e = 73;
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = Bounce.field_N;
        if (param0 != -26) {
          jk.a((byte) 19);
        }
        for (var6 = 0; this.field_k > var6; var6++) {
          this.field_g[var6] = (short)(param3 * this.field_g[var6] / param4);
          this.field_C[var6] = (short)(param2 * this.field_C[var6] / param4);
          this.field_J[var6] = (short)(this.field_J[var6] * param1 / param4);
        }
        this.b(-120);
    }

    public static void a(int param0) {
        field_M = null;
        field_a = null;
        if (param0 != -19800) {
          jk.a((byte) -29);
        }
        field_m = null;
    }

    final static int a(byte param0) {
        if (sa.field_k < 2) {
          return 0;
        }
        if (0 == ud.field_a) {
          if (!pa.field_i.c(-102)) {
            return 20;
          }
          if (!pa.field_i.b("commonui", false)) {
            return 40;
          }
          if (!kg.field_b.c(108)) {
            return 50;
          }
          if (!kg.field_b.b("commonui", false)) {
            return 60;
          }
          if (!ea.field_e.c(38)) {
            return 70;
          }
          if (!ea.field_e.a((byte) -40)) {
            return 80;
          }
        } else {
          if (jb.field_a != null) {
            if (!jb.field_a.c(-125)) {
              return 14;
            }
            if (!jb.field_a.a("", (byte) -16)) {
              return 29;
            }
            if (!jb.field_a.b("", false)) {
              return 29;
            }
          }
          if (!pa.field_i.c(-101)) {
            return 43;
          }
          if (!pa.field_i.b("commonui", false)) {
            return 57;
          }
          if (!kg.field_b.c(98)) {
            return 71;
          }
          if (!kg.field_b.b("commonui", false)) {
            return 80;
          }
          if (!ea.field_e.c(-104)) {
            return 82;
          }
          if (!ea.field_e.a((byte) -114)) {
            return 86;
          }
        }
        if (param0 < -36) {
          return 100;
        }
        return 88;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var6 = Bounce.field_N;
        int var5 = 0;
        if (param1 <= 123) {
          return;
        }
        while (var5 < this.field_k) {
          this.field_g[var5] = (short)(this.field_g[var5] + param3);
          this.field_C[var5] = (short)(this.field_C[var5] + param0);
          this.field_J[var5] = (short)(this.field_J[var5] + param2);
          var5++;
        }
        this.b(-115);
    }

    final static tg[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        tg[] var10;
        tg[] var11_ref_tg__;
        int var11;
        int var12;
        tg var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        tg[] var10Lifetime1;
        var15 = Bounce.field_N;
        var9 = param1 + (param5 + param8);
        var10 = new tg[]{new tg(var9, var9), new tg(param6, var9), new tg(var9, var9), new tg(var9, param6), new tg(64, 64), new tg(var9, param6), new tg(var9, var9), new tg(param6, var9), new tg(var9, var9)};
        var11_ref_tg__ = var10;
        for (var12 = 0; var12 < var11_ref_tg__.length; var12++) {
          var13 = var11_ref_tg__[var12];
          for (var14 = 0; var13.field_v.length > var14; var14++) {
            var13.field_v[var14] = param7;
          }
        }
        var10Lifetime1 = var11_ref_tg__;
        for (var11 = 0; var11 < param5; var11++) {
          for (var12Lifetime1 = 0; var9 > var12Lifetime1; var12Lifetime1++) {
            var10Lifetime1[6].field_v[(-1 + (-var11 + var9)) * var9 + var12Lifetime1] = param0;
            var10Lifetime1[8].field_v[var9 * (-var11 + (var9 - 1)) + var12Lifetime1] = param0;
            var10Lifetime1[2].field_v[var12Lifetime1 * var9 - var11 - (-var9 + 1)] = param0;
            var10Lifetime1[8].field_v[-var11 + (-1 + (var9 + var9 * var12Lifetime1))] = param0;
          }
        }
        if (param3 != -7139) {
          jk.a((byte) -26);
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param5; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var12Lifetime2 < var9; var12Lifetime2++) {
            var10Lifetime1[0].field_v[var9 * var11Lifetime1 + var12Lifetime2] = param2;
            var10Lifetime1[0].field_v[var11Lifetime1 + var12Lifetime2 * var9] = param2;
            if (-var11Lifetime1 + var9 > var12Lifetime2) {
              var10Lifetime1[2].field_v[var11Lifetime1 * var9 + var12Lifetime2] = param2;
              var10Lifetime1[6].field_v[var11Lifetime1 + var12Lifetime2 * var9] = param2;
            }
          }
        }
        for (var11Lifetime2 = 0; var11Lifetime2 < param6; var11Lifetime2++) {
          for (var12Lifetime3 = 0; var12Lifetime3 < param5; var12Lifetime3++) {
            var10Lifetime1[7].field_v[param6 * (-1 - var12Lifetime3 + var9) + var11Lifetime2] = param0;
            var10Lifetime1[5].field_v[var9 * var11Lifetime2 + (-1 + (var9 - var12Lifetime3))] = param0;
            var10Lifetime1[1].field_v[var11Lifetime2 + var12Lifetime3 * param6] = param2;
            var10Lifetime1[3].field_v[var12Lifetime3 + var9 * var11Lifetime2] = param2;
          }
        }
        for (var11Lifetime3 = 0; param6 >> 1 > var11Lifetime3; var11Lifetime3++) {
          for (var12Lifetime4 = 0; param8 > var12Lifetime4; var12Lifetime4++) {
            var10Lifetime1[1].field_v[(-1 + var9 - var12Lifetime4) * param6 + var11Lifetime3] = param4;
            var10Lifetime1[3].field_v[var11Lifetime3 * var9 - 1 + var9 - var12Lifetime4] = param4;
            var10Lifetime1[7].field_v[var11Lifetime3 + param6 * var12Lifetime4] = param4;
            var10Lifetime1[5].field_v[var9 * var11Lifetime3 + var12Lifetime4] = param4;
          }
        }
        return var10Lifetime1;
    }

    jk() {
        this.field_t = false;
        this.field_w = (byte) 0;
    }

    static {
        field_M = new eh(7, 0, 1, 1);
        field_m = "High score service unavailable";
        field_K = 10;
        field_q = -1;
        field_a = new lg();
    }
}
