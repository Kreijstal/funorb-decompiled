/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    int[] field_v;
    private int field_z;
    int[] field_J;
    int[] field_D;
    int field_s;
    int[] field_B;
    int[] field_q;
    int field_w;
    private int[] field_G;
    int[] field_m;
    int[] field_E;
    int[] field_n;
    private int field_K;
    int[] field_l;
    int[] field_b;
    int[][] field_C;
    int[][] field_g;
    int field_r;
    int[][] field_I;
    static di field_k;
    int field_d;
    int[] field_H;
    int[] field_A;
    int[] field_f;
    static long field_p;
    byte[][] field_y;
    int[][] field_x;
    int[] field_o;
    private gk field_u;
    int[] field_t;
    int[] field_e;
    int[][] field_L;
    int[] field_c;
    int field_a;
    int[] field_F;
    int[] field_h;
    ud[] field_j;
    private int[] field_i;

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = stellarshard.field_B;
        try {
          var4_int = -1;
          if (param3 > -48) {
            jj.a((byte) 14, -35L);
          }
          for (var5 = param0; var5 < param2; var5++) {
            var4_int = nb.field_F[255 & (var4_int ^ param1[var5])] ^ var4_int >>> 8;
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("jj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 18917) {
          byte[] var2 = (byte[]) null;
          jj.a(-53, (byte[]) null, 76, -35);
        }
        field_k = null;
    }

    private final void a(boolean param0) {
        int var3 = 0;
        int var2;
        int var5;
        ud var4;
        var5 = stellarshard.field_B;
        if (this.field_u == null) {
          return;
        }
        var2 = param0 ? 1 : 0;
        for (var3 = 0; this.field_j.length > var3; var3++) {
          if (null == this.field_j[var3]) {
            if (this.field_c[var3] >> 4 == 0) {
              var4 = this.field_u.a(this.field_i[var3], this.field_G[var3], false);
            } else {
              var4 = this.field_u.a((byte) -65, this.field_G[var3], this.field_i[var3]);
            }
            if (var4 != null) {
              this.field_c[var3] = sa.a(this.field_c[var3], 15);
              this.field_j[var3] = var4;
            } else {
              var2 = 0;
            }
          }
        }
        if (var2 != 0) {
          this.field_G = null;
          this.field_u = null;
          this.field_i = null;
        }
    }

    final static void a(byte param0, long param1) {
        if (param1 <= 0L) {
          return;
        }
        if (param0 >= -112) {
          field_p = 50L;
        }
        if (param1 % 10L != 0L) {
          ef.a(11, param1);
        } else {
          ef.a(11, -1L + param1);
          ef.a(11, 1L);
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, pb[] param7, pb[] param8, int param9, int param10, int param11, bd param12, bd param13) {
        try {
          pk.a(4);
          if (!param0) {
            byte[] var15 = (byte[]) null;
            jj.a(-44, (byte[]) null, -58, 66);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "jj.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + (param8 != null ? "{...}" : "null") + ',' + param9 + ',' + param10 + ',' + param11 + ',' + (param12 != null ? "{...}" : "null") + ',' + (param13 != null ? "{...}" : "null") + ')');
        }
    }

    final static bh[] b(int param0) {
        if (param0 != -1) {
          return (bh[]) null;
        }
        return new bh[]{kk.field_k, ak.field_d, ma.field_m};
    }

    jj(ka param0, gk param1) {
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
          this.field_u = param1;
          this.field_d = 1 + param0.f(4);
          param0.f(4);
          this.field_r = 1 + param0.f(4);
          this.field_z = param0.f(4) + 1;
          this.field_K = param0.f(4) + 1;
          var3_int = param0.f(4);
          this.field_s = 1 & var3_int;
          this.field_a = param0.f(4);
          this.field_w = param0.f(4);
          this.field_f = new int[this.field_d];
          var4 = 0;
          for (var5 = 0; var5 < this.field_d; var5++) {
            dupTemp$0 = var4 + param0.f(4);
            var4 = dupTemp$0;
            this.field_f[var5] = sa.a(dupTemp$0, 255);
          }
          this.field_l = new int[256];
          this.field_y = new byte[256][];
          ri.a(this.field_l, 0, 256, 64);
          for (var5Lifetime1 = 0; 256 > var5Lifetime1; var5Lifetime1++) {
            this.field_y[var5Lifetime1] = sb.field_i;
          }
          for (var5Lifetime2 = 0; this.field_z > var5Lifetime2; var5Lifetime2++) {
            this.field_l[var5Lifetime2] = param0.f(4) + 1;
            var6 = param0.c((byte) 73);
            var16 = new byte[var6];
            if (var6 > 0) {
              param0.a(0, (byte) -104, var6, var16);
              this.field_y[var5Lifetime2] = var16;
            }
          }
          this.field_D = new int[this.field_K];
          this.field_B = new int[this.field_K];
          this.field_E = new int[this.field_K];
          this.field_g = new int[this.field_K][];
          this.field_L = new int[this.field_K][];
          this.field_C = new int[this.field_K][96];
          this.field_e = new int[this.field_K];
          this.field_I = new int[this.field_K][];
          this.field_H = new int[this.field_K];
          this.field_q = new int[this.field_K];
          this.field_b = new int[this.field_K];
          this.field_x = new int[this.field_K][];
          this.field_F = new int[this.field_K];
          this.field_A = new int[this.field_K];
          var5Lifetime3 = param0.c((byte) 124);
          this.field_h = new int[var5Lifetime3];
          this.field_n = new int[var5Lifetime3];
          this.field_J = new int[var5Lifetime3];
          this.field_t = new int[var5Lifetime3];
          this.field_v = new int[var5Lifetime3];
          this.field_c = new int[var5Lifetime3];
          this.field_G = new int[var5Lifetime3];
          this.field_o = new int[var5Lifetime3];
          this.field_i = new int[var5Lifetime3];
          this.field_j = new ud[var5Lifetime3];
          this.field_m = new int[var5Lifetime3];
          var5Lifetime4 = 0;
          for (var6Lifetime1 = 0; var6Lifetime1 < this.field_K; var6Lifetime1++) {
            var7 = param0.f(4);
            if (0 < var7) {
              var4Lifetime1 = 0;
              for (var8 = 0; var8 < 96; var8++) {
                dupTemp$1 = var4Lifetime1 + param0.f(4);
                var4Lifetime1 = dupTemp$1;
                this.field_C[var6Lifetime1][var8] = var5Lifetime4 + sa.a(255, dupTemp$1);
              }
              this.field_A[var6Lifetime1] = param0.f(4);
              var8Lifetime1 = param0.f(4);
              this.field_D[var6Lifetime1] = param0.f(4);
              this.field_e[var6Lifetime1] = param0.f(4);
              this.field_q[var6Lifetime1] = this.field_e[var6Lifetime1] + param0.f(4);
              this.field_F[var6Lifetime1] = param0.f(4);
              var9 = param0.f(4);
              this.field_B[var6Lifetime1] = param0.f(4);
              this.field_E[var6Lifetime1] = param0.f(4);
              this.field_H[var6Lifetime1] = this.field_E[var6Lifetime1] + param0.f(4);
              array$2 = new int[var8Lifetime1];
              this.field_L[var6Lifetime1] = array$2;
              var4Lifetime1Lifetime1 = 0;
              var10 = 0;
              for (var11 = 0; var8Lifetime1 > var11; var11++) {
                dupTemp$3 = var10 + param0.e(-64);
                var10 = dupTemp$3;
                localTemp$4 = var4Lifetime1Lifetime1 + dupTemp$3;
                var4Lifetime1Lifetime1 = localTemp$4;
                this.field_L[var6Lifetime1][var11] = localTemp$4;
              }
              var4Lifetime1Lifetime2 = 0;
              array$5 = new int[var8Lifetime1];
              this.field_I[var6Lifetime1] = array$5;
              for (var11Lifetime1 = 0; var8Lifetime1 > var11Lifetime1; var11Lifetime1++) {
                dupTemp$6 = var4Lifetime1Lifetime2 + param0.f(4);
                var4Lifetime1Lifetime2 = dupTemp$6;
                this.field_I[var6Lifetime1][var11Lifetime1] = sa.a(255, dupTemp$6);
              }
              array$7 = new int[var9];
              this.field_x[var6Lifetime1] = array$7;
              var4Lifetime1Lifetime3 = 0;
              var10Lifetime1 = 0;
              for (var11Lifetime2 = 0; var11Lifetime2 < var9; var11Lifetime2++) {
                dupTemp$8 = var10Lifetime1 + param0.e(-64);
                var10Lifetime1 = dupTemp$8;
                localTemp$9 = var4Lifetime1Lifetime3 + dupTemp$8;
                var4Lifetime1Lifetime3 = localTemp$9;
                this.field_x[var6Lifetime1][var11Lifetime2] = localTemp$9;
              }
              array$10 = new int[var9];
              this.field_g[var6Lifetime1] = array$10;
              var4Lifetime1Lifetime4 = 0;
              for (var11Lifetime3 = 0; var11Lifetime3 < var9; var11Lifetime3++) {
                dupTemp$11 = var4Lifetime1Lifetime4 + param0.f(4);
                var4Lifetime1Lifetime4 = dupTemp$11;
                this.field_g[var6Lifetime1][var11Lifetime3] = sa.a(dupTemp$11, 255);
              }
              this.field_b[var6Lifetime1] = param0.c((byte) 85);
              for (var11Lifetime4 = 0; var11Lifetime4 < var7; var11Lifetime4++) {
                this.field_m[var5Lifetime4] = param0.c(true);
                this.field_t[var5Lifetime4] = param0.c(true);
                this.field_v[var5Lifetime4] = this.field_t[var5Lifetime4] + param0.c(true);
                this.field_J[var5Lifetime4] = param0.f(4);
                this.field_n[var5Lifetime4] = param0.g(110);
                this.field_c[var5Lifetime4] = param0.f(4);
                this.field_h[var5Lifetime4] = param0.f(4);
                this.field_o[var5Lifetime4] = param0.g(112) - 1;
                this.field_i[var5Lifetime4] = param0.c((byte) 71);
                this.field_G[var5Lifetime4] = param0.c((byte) 60);
                var5Lifetime4++;
              }
            }
          }
          this.a(true);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "jj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = new di();
    }
}
