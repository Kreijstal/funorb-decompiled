/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj {
    int[] field_E;
    int[] field_h;
    int[] field_J;
    int[] field_A;
    int[][] field_g;
    int field_x;
    private int field_a;
    int field_b;
    int field_m;
    int field_o;
    int[] field_j;
    int[] field_z;
    int[] field_i;
    int field_v;
    int[] field_c;
    ib[] field_D;
    int[] field_u;
    static String field_w;
    byte[][] field_s;
    static int field_p;
    int[] field_I;
    private da field_l;
    int[] field_q;
    int[][] field_B;
    int[] field_f;
    int[] field_F;
    private int[] field_t;
    int[][] field_n;
    int[] field_L;
    private int field_d;
    int[] field_C;
    int[] field_r;
    int[] field_e;
    int[][] field_H;
    private int[] field_G;
    int[] field_k;
    int[][] field_y;
    int[] field_K;

    private final void a(int param0) {
        int var3 = 0;
        int var2;
        int var5;
        ib var4;
        var5 = Main.field_T;
        if (null == this.field_l) {
          return;
        }
        var2 = 1;
        if (param0 != 15) {
          this.field_b = -24;
        }
        for (var3 = 0; this.field_D.length > var3; var3++) {
          if (null == this.field_D[var3]) {
            if (this.field_z[var3] >> 4 != 0) {
              var4 = this.field_l.b(this.field_t[var3], this.field_G[var3], -14888);
            } else {
              var4 = this.field_l.a(this.field_G[var3], -1703274388, this.field_t[var3]);
            }
            if (var4 != null) {
              this.field_z[var3] = bc.a(this.field_z[var3], 15);
              this.field_D[var3] = var4;
            } else {
              var2 = 0;
            }
          }
        }
        if (var2 != 0) {
          this.field_G = null;
          this.field_t = null;
          this.field_l = null;
        }
    }

    rj(pb param0, da param1) {
        int var3_int = 0;
        int var4 = 0;
        int dupTemp$0 = 0;
        byte[] var16 = null;
        int var7 = 0;
        int dupTemp$1 = 0;
        int var9 = 0;
        int[] array$2 = null;
        int var10 = 0;
        int dupTemp$3 = 0;
        int localTemp$4 = 0;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] array$7 = null;
        int dupTemp$8 = 0;
        int localTemp$9 = 0;
        int[] array$10 = null;
        int dupTemp$11 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var11 = 0;
        int var4Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var6Lifetime1;
        int var8Lifetime1;
        int var4Lifetime1Lifetime1;
        int var4Lifetime1Lifetime2;
        int var4Lifetime1Lifetime3;
        int var4Lifetime1Lifetime4;
        try {
          this.field_l = param1;
          this.field_o = 1 + param0.f(86);
          param0.f(-125);
          this.field_m = 1 + param0.f(116);
          this.field_d = param0.f(90) + 1;
          this.field_a = param0.f(-96) + 1;
          var3_int = param0.f(-118);
          this.field_v = 1 & var3_int;
          this.field_b = param0.f(-114);
          this.field_x = param0.f(-106);
          this.field_i = new int[this.field_o];
          var4 = 0;
          for (var5 = 0; this.field_o > var5; var5++) {
            dupTemp$0 = var4 + param0.f(18);
            var4 = dupTemp$0;
            this.field_i[var5] = bc.a(255, dupTemp$0);
          }
          this.field_c = new int[256];
          this.field_s = new byte[256][];
          og.a(this.field_c, 0, 256, 64);
          for (var5Lifetime1 = 0; var5Lifetime1 < 256; var5Lifetime1++) {
            this.field_s[var5Lifetime1] = sh.field_j;
          }
          for (var5Lifetime2 = 0; var5Lifetime2 < this.field_d; var5Lifetime2++) {
            this.field_c[var5Lifetime2] = param0.f(-101) + 1;
            var6 = param0.d((byte) 72);
            var16 = new byte[var6];
            if (var6 > 0) {
              param0.a(66, var16, 0, var6);
              this.field_s[var5Lifetime2] = var16;
            }
          }
          this.field_J = new int[this.field_a];
          this.field_K = new int[this.field_a];
          this.field_B = new int[this.field_a][];
          this.field_j = new int[this.field_a];
          this.field_F = new int[this.field_a];
          this.field_e = new int[this.field_a];
          this.field_y = new int[this.field_a][];
          this.field_h = new int[this.field_a];
          this.field_n = new int[this.field_a][96];
          this.field_r = new int[this.field_a];
          this.field_H = new int[this.field_a][];
          this.field_g = new int[this.field_a][];
          this.field_k = new int[this.field_a];
          this.field_C = new int[this.field_a];
          var5Lifetime3 = param0.d((byte) 72);
          this.field_D = new ib[var5Lifetime3];
          this.field_I = new int[var5Lifetime3];
          this.field_L = new int[var5Lifetime3];
          this.field_t = new int[var5Lifetime3];
          this.field_E = new int[var5Lifetime3];
          this.field_G = new int[var5Lifetime3];
          this.field_q = new int[var5Lifetime3];
          this.field_u = new int[var5Lifetime3];
          this.field_z = new int[var5Lifetime3];
          this.field_A = new int[var5Lifetime3];
          this.field_f = new int[var5Lifetime3];
          var5Lifetime4 = 0;
          for (var6Lifetime1 = 0; var6Lifetime1 < this.field_a; var6Lifetime1++) {
            var7 = param0.f(-101);
            if (var7 > 0) {
              var4Lifetime1 = 0;
              for (var8 = 0; var8 < 96; var8++) {
                dupTemp$1 = var4Lifetime1 + param0.f(98);
                var4Lifetime1 = dupTemp$1;
                this.field_n[var6Lifetime1][var8] = bc.a(255, dupTemp$1) + var5Lifetime4;
              }
              this.field_k[var6Lifetime1] = param0.f(-97);
              var8Lifetime1 = param0.f(-128);
              this.field_h[var6Lifetime1] = param0.f(73);
              this.field_K[var6Lifetime1] = param0.f(80);
              this.field_e[var6Lifetime1] = this.field_K[var6Lifetime1] + param0.f(42);
              this.field_j[var6Lifetime1] = param0.f(-120);
              var9 = param0.f(-122);
              this.field_r[var6Lifetime1] = param0.f(-126);
              this.field_F[var6Lifetime1] = param0.f(79);
              this.field_C[var6Lifetime1] = this.field_F[var6Lifetime1] + param0.f(-105);
              array$2 = new int[var8Lifetime1];
              this.field_y[var6Lifetime1] = array$2;
              var4Lifetime1Lifetime1 = 0;
              var10 = 0;
              for (var11 = 0; var8Lifetime1 > var11; var11++) {
                dupTemp$3 = var10 + param0.b((byte) 59);
                var10 = dupTemp$3;
                localTemp$4 = var4Lifetime1Lifetime1 + dupTemp$3;
                var4Lifetime1Lifetime1 = localTemp$4;
                this.field_y[var6Lifetime1][var11] = localTemp$4;
              }
              array$5 = new int[var8Lifetime1];
              this.field_B[var6Lifetime1] = array$5;
              var4Lifetime1Lifetime2 = 0;
              for (var11Lifetime1 = 0; var11Lifetime1 < var8Lifetime1; var11Lifetime1++) {
                dupTemp$6 = var4Lifetime1Lifetime2 + param0.f(99);
                var4Lifetime1Lifetime2 = dupTemp$6;
                this.field_B[var6Lifetime1][var11Lifetime1] = bc.a(dupTemp$6, 255);
              }
              var10Lifetime1 = 0;
              var4Lifetime1Lifetime3 = 0;
              array$7 = new int[var9];
              this.field_H[var6Lifetime1] = array$7;
              for (var11Lifetime2 = 0; var9 > var11Lifetime2; var11Lifetime2++) {
                dupTemp$8 = var10Lifetime1 + param0.b((byte) 59);
                var10Lifetime1 = dupTemp$8;
                localTemp$9 = var4Lifetime1Lifetime3 + dupTemp$8;
                var4Lifetime1Lifetime3 = localTemp$9;
                this.field_H[var6Lifetime1][var11Lifetime2] = localTemp$9;
              }
              var4Lifetime1Lifetime4 = 0;
              array$10 = new int[var9];
              this.field_g[var6Lifetime1] = array$10;
              for (var11Lifetime3 = 0; var11Lifetime3 < var9; var11Lifetime3++) {
                dupTemp$11 = var4Lifetime1Lifetime4 + param0.f(51);
                var4Lifetime1Lifetime4 = dupTemp$11;
                this.field_g[var6Lifetime1][var11Lifetime3] = bc.a(255, dupTemp$11);
              }
              this.field_J[var6Lifetime1] = param0.d((byte) 72);
              for (var11Lifetime4 = 0; var11Lifetime4 < var7; var11Lifetime4++) {
                this.field_q[var5Lifetime4] = param0.e(true);
                this.field_A[var5Lifetime4] = param0.e(true);
                this.field_u[var5Lifetime4] = this.field_A[var5Lifetime4] + param0.e(true);
                this.field_E[var5Lifetime4] = param0.f(29);
                this.field_I[var5Lifetime4] = param0.a(true);
                this.field_z[var5Lifetime4] = param0.f(28);
                this.field_L[var5Lifetime4] = param0.f(-95);
                this.field_f[var5Lifetime4] = param0.a(true) - 1;
                this.field_t[var5Lifetime4] = param0.d((byte) 72);
                this.field_G[var5Lifetime4] = param0.d((byte) 72);
                var5Lifetime4++;
              }
            }
          }
          this.a(15);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "rj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_w = null;
        if (param0 <= 57) {
          field_p = -35;
        }
    }

    static {
        field_w = "Loading extra data";
        field_p = 2014707693;
    }
}
