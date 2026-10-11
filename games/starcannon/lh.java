/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lh {
    static int field_I;
    int[] field_q;
    int[] field_v;
    int[][] field_f;
    int[] field_b;
    int[] field_a;
    ud[] field_L;
    int[] field_e;
    int field_w;
    static hl field_N;
    static String field_D;
    int field_p;
    int[] field_A;
    int[][] field_H;
    byte[][] field_l;
    int[] field_K;
    int[] field_J;
    int[][] field_k;
    int[] field_F;
    int[] field_i;
    static java.util.zip.CRC32 field_g;
    private int field_h;
    int[] field_B;
    int[] field_z;
    int[] field_O;
    int[] field_d;
    static int field_s;
    private int field_G;
    int field_M;
    int[] field_C;
    int[][] field_j;
    int field_u;
    private int[] field_x;
    int[] field_o;
    int[][] field_r;
    private int[] field_t;
    int[] field_E;
    int[] field_c;
    int[] field_P;
    private ja field_y;
    static String field_n;
    int field_m;

    public static void a(byte param0) {
        field_g = null;
        field_N = null;
        field_n = null;
        field_D = null;
        if (param0 >= -80) {
          CharSequence var2 = (CharSequence) null;
          lh.a(-54, (CharSequence) null, '\t');
        }
    }

    final static void a(int param0, byte param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = StarCannon.field_A;
        if (qb.field_h < 0) {
          return;
        }
        var3 = -135 + param2;
        var4 = -35 + param0;
        var5 = 256;
        if (75 > qb.field_h) {
          var5 = (qb.field_h << 8) / 75;
        }
        if (qb.field_h > 200) {
          var5 = (250 - qb.field_h << 8) / 50;
        }
        bc.a(wj.field_g, 26095);
        gl.b();
        ki.b();
        nc.a(-1196777214);
        if (var5 < 256) {
          ki.b(0, 0, ki.field_j, ki.field_f, 0, 256 - var5);
        }
        wf.a(-123);
        if (qb.field_h >= 150) {
          m.field_a.e(var3 + 15, 10 + var4, var5);
        } else {
          wj.field_g.a(var3, var4);
        }
        var6 = -125 + qb.field_h;
        if (var6 > 0 &&
          var6 < 50) {
          if (var6 < 20) {
            var7 = var6 * 256 / 20;
            ak.field_f.f(var3, var4, var7);
          } else {
            if (var6 >= 30) {
              var7 = 256 * (-var6 + 50) / 20;
              ak.field_f.f(var3, var4, var7);
            } else {
              ak.field_f.f(var3, var4, 256);
            }
          }
        }
        var6Lifetime1 = -140 + qb.field_h;
        if (var6Lifetime1 > 0) {
          var7Lifetime1 = 256;
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = var6Lifetime1 * 256 / 20;
          }
          ai.field_g.e(var3 + 15, 10 + var4, var5 * var7Lifetime1 >> 8);
        }
        if (param1 > -43) {
          lh.a((byte) 88);
        }
        return;
    }

    private final void b(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var6;
        ud var5;
        var6 = StarCannon.field_A;
        if (this.field_y == null) {
          return;
        }
        var2 = 1;
        var4 = -26 % ((75 - param0) / 33);
        for (var3 = 0; var3 < this.field_L.length; var3++) {
          if (null == this.field_L[var3]) {
            if (this.field_B[var3] >> 4 == 0) {
              var5 = this.field_y.b(this.field_t[var3], this.field_x[var3], 91);
            } else {
              var5 = this.field_y.a(this.field_x[var3], this.field_t[var3], (byte) 41);
            }
            if (var5 != null) {
              this.field_B[var3] = w.a(this.field_B[var3], 15);
              this.field_L[var3] = var5;
            } else {
              var2 = 0;
            }
          }
        }
        if (var2 != 0) {
          this.field_x = null;
          this.field_t = null;
          this.field_y = null;
        }
    }

    final static int a(int param0, CharSequence param1, char param2) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -15790) {
            field_I = 98;
          }
          var3_int = 0;
          var4 = param1.length();
          for (var5 = 0; var4 > var5; var5++) {
            if (param2 == param1.charAt(var5)) {
              var3_int++;
            }
          }
          stackIn_8_0 = var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("lh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    lh(rb param0, ja param1) {
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
          this.field_y = param1;
          this.field_M = param0.j(7909) + 1;
          param0.j(7909);
          this.field_p = 1 + param0.j(7909);
          this.field_h = 1 + param0.j(7909);
          this.field_G = param0.j(7909) + 1;
          var3_int = param0.j(7909);
          this.field_m = var3_int & 1;
          this.field_w = param0.j(7909);
          this.field_u = param0.j(7909);
          this.field_F = new int[this.field_M];
          var4 = 0;
          for (var5 = 0; var5 < this.field_M; var5++) {
            dupTemp$0 = var4 + param0.j(7909);
            var4 = dupTemp$0;
            this.field_F[var5] = w.a(dupTemp$0, 255);
          }
          this.field_c = new int[256];
          this.field_l = new byte[256][];
          ug.a(this.field_c, 0, 256, 64);
          for (var5Lifetime1 = 0; var5Lifetime1 < 256; var5Lifetime1++) {
            this.field_l[var5Lifetime1] = mc.field_g;
          }
          for (var5Lifetime2 = 0; var5Lifetime2 < this.field_h; var5Lifetime2++) {
            this.field_c[var5Lifetime2] = param0.j(7909) + 1;
            var6 = param0.i(-1174051992);
            var16 = new byte[var6];
            if (var6 > 0) {
              param0.a(var6, (byte) 88, var16, 0);
              this.field_l[var5Lifetime2] = var16;
            }
          }
          this.field_K = new int[this.field_G];
          this.field_v = new int[this.field_G];
          this.field_r = new int[this.field_G][];
          this.field_k = new int[this.field_G][];
          this.field_f = new int[this.field_G][];
          this.field_a = new int[this.field_G];
          this.field_H = new int[this.field_G][];
          this.field_P = new int[this.field_G];
          this.field_b = new int[this.field_G];
          this.field_j = new int[this.field_G][96];
          this.field_z = new int[this.field_G];
          this.field_C = new int[this.field_G];
          this.field_O = new int[this.field_G];
          this.field_i = new int[this.field_G];
          var5Lifetime3 = param0.i(-1174051992);
          this.field_J = new int[var5Lifetime3];
          this.field_A = new int[var5Lifetime3];
          this.field_E = new int[var5Lifetime3];
          this.field_e = new int[var5Lifetime3];
          this.field_d = new int[var5Lifetime3];
          this.field_q = new int[var5Lifetime3];
          this.field_t = new int[var5Lifetime3];
          this.field_L = new ud[var5Lifetime3];
          this.field_B = new int[var5Lifetime3];
          this.field_o = new int[var5Lifetime3];
          this.field_x = new int[var5Lifetime3];
          var5Lifetime4 = 0;
          for (var6Lifetime1 = 0; this.field_G > var6Lifetime1; var6Lifetime1++) {
            var7 = param0.j(7909);
            if (0 < var7) {
              var4Lifetime1 = 0;
              for (var8 = 0; 96 > var8; var8++) {
                dupTemp$1 = var4Lifetime1 + param0.j(7909);
                var4Lifetime1 = dupTemp$1;
                this.field_j[var6Lifetime1][var8] = var5Lifetime4 + w.a(dupTemp$1, 255);
              }
              this.field_a[var6Lifetime1] = param0.j(7909);
              var8Lifetime1 = param0.j(7909);
              this.field_P[var6Lifetime1] = param0.j(7909);
              this.field_K[var6Lifetime1] = param0.j(7909);
              this.field_v[var6Lifetime1] = this.field_K[var6Lifetime1] + param0.j(7909);
              this.field_b[var6Lifetime1] = param0.j(7909);
              var9 = param0.j(7909);
              this.field_C[var6Lifetime1] = param0.j(7909);
              this.field_z[var6Lifetime1] = param0.j(7909);
              this.field_O[var6Lifetime1] = this.field_z[var6Lifetime1] + param0.j(7909);
              var4Lifetime1Lifetime1 = 0;
              array$2 = new int[var8Lifetime1];
              this.field_k[var6Lifetime1] = array$2;
              var10 = 0;
              for (var11 = 0; var8Lifetime1 > var11; var11++) {
                dupTemp$3 = var10 + param0.d((byte) 26);
                var10 = dupTemp$3;
                localTemp$4 = var4Lifetime1Lifetime1 + dupTemp$3;
                var4Lifetime1Lifetime1 = localTemp$4;
                this.field_k[var6Lifetime1][var11] = localTemp$4;
              }
              var4Lifetime1Lifetime2 = 0;
              array$5 = new int[var8Lifetime1];
              this.field_f[var6Lifetime1] = array$5;
              for (var11Lifetime1 = 0; var11Lifetime1 < var8Lifetime1; var11Lifetime1++) {
                dupTemp$6 = var4Lifetime1Lifetime2 + param0.j(7909);
                var4Lifetime1Lifetime2 = dupTemp$6;
                this.field_f[var6Lifetime1][var11Lifetime1] = w.a(dupTemp$6, 255);
              }
              var10Lifetime1 = 0;
              array$7 = new int[var9];
              this.field_r[var6Lifetime1] = array$7;
              var4Lifetime1Lifetime3 = 0;
              for (var11Lifetime2 = 0; var9 > var11Lifetime2; var11Lifetime2++) {
                dupTemp$8 = var10Lifetime1 + param0.d((byte) 86);
                var10Lifetime1 = dupTemp$8;
                localTemp$9 = var4Lifetime1Lifetime3 + dupTemp$8;
                var4Lifetime1Lifetime3 = localTemp$9;
                this.field_r[var6Lifetime1][var11Lifetime2] = localTemp$9;
              }
              var4Lifetime1Lifetime4 = 0;
              array$10 = new int[var9];
              this.field_H[var6Lifetime1] = array$10;
              for (var11Lifetime3 = 0; var11Lifetime3 < var9; var11Lifetime3++) {
                dupTemp$11 = var4Lifetime1Lifetime4 + param0.j(7909);
                var4Lifetime1Lifetime4 = dupTemp$11;
                this.field_H[var6Lifetime1][var11Lifetime3] = w.a(255, dupTemp$11);
              }
              this.field_i[var6Lifetime1] = param0.i(-1174051992);
              for (var11Lifetime4 = 0; var11Lifetime4 < var7; var11Lifetime4++) {
                this.field_d[var5Lifetime4] = param0.g(-89);
                this.field_e[var5Lifetime4] = param0.g(62);
                this.field_A[var5Lifetime4] = this.field_e[var5Lifetime4] + param0.g(123);
                this.field_E[var5Lifetime4] = param0.j(7909);
                this.field_o[var5Lifetime4] = param0.a(false);
                this.field_B[var5Lifetime4] = param0.j(7909);
                this.field_q[var5Lifetime4] = param0.j(7909);
                this.field_J[var5Lifetime4] = param0.a(false) - 1;
                this.field_x[var5Lifetime4] = param0.i(-1174051992);
                this.field_t[var5Lifetime4] = param0.i(-1174051992);
                var5Lifetime4++;
              }
            }
          }
          this.b((byte) 123);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "lh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "Type your password again to make sure it's correct";
        field_g = new java.util.zip.CRC32();
    }
}
