/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    int[] field_k;
    int[] field_F;
    byte[][] field_l;
    private int field_G;
    int[][] field_o;
    bi[] field_e;
    int[] field_u;
    int[] field_w;
    int field_i;
    int[] field_r;
    int[] field_p;
    int[][] field_a;
    int[] field_j;
    int[] field_H;
    int[] field_s;
    int[] field_d;
    int[] field_I;
    private m field_h;
    int field_q;
    private int[] field_v;
    int[][] field_A;
    int[][] field_b;
    int[] field_n;
    int[] field_g;
    private int[] field_m;
    int field_t;
    int[] field_c;
    int[] field_z;
    int[][] field_f;
    int field_D;
    int field_B;
    int[] field_J;
    int[] field_E;
    private int field_y;
    int[] field_C;
    static String field_x;
    int[] field_K;

    private final void a(boolean param0) {
        int var3 = 0;
        int var2;
        int var5;
        bi var4;
        var5 = Confined.field_J ? 1 : 0;
        if (null == this.field_h) {
          return;
        }
        var2 = 1;
        if (param0) {
          this.a(true);
        }
        for (var3 = 0; var3 < this.field_e.length; var3++) {
          if (null == this.field_e[var3]) {
            if (this.field_C[var3] >> 4 != 0) {
              var4 = this.field_h.a(this.field_v[var3], (byte) 76, this.field_m[var3]);
            } else {
              var4 = this.field_h.a(this.field_m[var3], this.field_v[var3], 256);
            }
            if (var4 != null) {
              this.field_C[var3] = va.a(this.field_C[var3], 15);
              this.field_e[var3] = var4;
            } else {
              var2 = 0;
            }
          }
        }
        if (var2 != 0) {
          this.field_h = null;
          this.field_v = null;
          this.field_m = null;
        }
    }

    public static void a(byte param0) {
        field_x = null;
        int var1 = -52 / ((-60 - param0) / 49);
    }

    final static String a(boolean param0, CharSequence param1, byte param2) {
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_11_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Confined.field_J ? 1 : 0;
        try {
          if (param1 == null) {
            stackIn_3_0 = ef.field_wb;
            return stackIn_3_0;
          }
          if (param2 != -2) {
            stackIn_6_0 = (String) null;
            return stackIn_6_0;
          }
          var3_int = param1.length();
          if (var3_int >= 1 &&
            12 >= var3_int) {
            var4 = hh.a(0, param1);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!bg.a(175, var4.charAt(0)) &&
                !bg.a(175, var4.charAt(var4.length() - 1))) {
                var5 = 0;
                for (var6 = 0; param1.length() > var6; var6++) {
                  var7 = param1.charAt(var6);
                  if (bg.a(param2 + 177, (char) var7)) {
                    var5++;
                  } else {
                    var5 = 0;
                  }
                  if (2 <= var5 &&
                    !param0) {
                    stackIn_31_0 = hk.field_b;
                    return stackIn_31_0;
                  }
                }
                if (0 >= var5) {
                  return null;
                }
                stackIn_36_0 = f.field_c;
                return stackIn_36_0;
              }
              stackIn_21_0 = f.field_c;
              return stackIn_21_0;
            }
            stackIn_16_0 = ef.field_wb;
            return stackIn_16_0;
          }
          stackIn_11_0 = ef.field_wb;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("vk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param2).append(')').toString());
        }
    }

    vk(kg param0, m param1) {
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
          this.field_h = param1;
          this.field_B = param0.c(32) + 1;
          param0.c(32);
          this.field_t = param0.c(32) + 1;
          this.field_y = 1 + param0.c(32);
          this.field_G = param0.c(32) + 1;
          var3_int = param0.c(32);
          this.field_q = var3_int & 1;
          this.field_D = param0.c(32);
          this.field_i = param0.c(32);
          this.field_E = new int[this.field_B];
          var4 = 0;
          for (var5 = 0; this.field_B > var5; var5++) {
            dupTemp$0 = var4 + param0.c(32);
            var4 = dupTemp$0;
            this.field_E[var5] = va.a(255, dupTemp$0);
          }
          this.field_l = new byte[256][];
          this.field_p = new int[256];
          lj.a(this.field_p, 0, 256, 64);
          for (var5Lifetime1 = 0; var5Lifetime1 < 256; var5Lifetime1++) {
            this.field_l[var5Lifetime1] = sa.field_V;
          }
          for (var5Lifetime2 = 0; this.field_y > var5Lifetime2; var5Lifetime2++) {
            this.field_p[var5Lifetime2] = 1 + param0.c(32);
            var6 = param0.a((byte) 25);
            var16 = new byte[var6];
            if (var6 > 0) {
              param0.a(0, (byte) 64, var6, var16);
              this.field_l[var5Lifetime2] = var16;
            }
          }
          this.field_g = new int[this.field_G];
          this.field_b = new int[this.field_G][];
          this.field_z = new int[this.field_G];
          this.field_n = new int[this.field_G];
          this.field_a = new int[this.field_G][];
          this.field_w = new int[this.field_G];
          this.field_r = new int[this.field_G];
          this.field_f = new int[this.field_G][];
          this.field_A = new int[this.field_G][96];
          this.field_o = new int[this.field_G][];
          this.field_H = new int[this.field_G];
          this.field_d = new int[this.field_G];
          this.field_J = new int[this.field_G];
          this.field_k = new int[this.field_G];
          var5Lifetime3 = param0.a((byte) 25);
          this.field_m = new int[var5Lifetime3];
          this.field_C = new int[var5Lifetime3];
          this.field_c = new int[var5Lifetime3];
          this.field_j = new int[var5Lifetime3];
          this.field_u = new int[var5Lifetime3];
          this.field_e = new bi[var5Lifetime3];
          this.field_F = new int[var5Lifetime3];
          this.field_s = new int[var5Lifetime3];
          this.field_v = new int[var5Lifetime3];
          this.field_I = new int[var5Lifetime3];
          this.field_K = new int[var5Lifetime3];
          var5Lifetime4 = 0;
          for (var6Lifetime1 = 0; var6Lifetime1 < this.field_G; var6Lifetime1++) {
            var7 = param0.c(32);
            if (var7 > 0) {
              var4Lifetime1 = 0;
              for (var8 = 0; var8 < 96; var8++) {
                dupTemp$1 = var4Lifetime1 + param0.c(32);
                var4Lifetime1 = dupTemp$1;
                this.field_A[var6Lifetime1][var8] = va.a(255, dupTemp$1) + var5Lifetime4;
              }
              this.field_H[var6Lifetime1] = param0.c(32);
              var8Lifetime1 = param0.c(32);
              this.field_g[var6Lifetime1] = param0.c(32);
              this.field_n[var6Lifetime1] = param0.c(32);
              this.field_z[var6Lifetime1] = this.field_n[var6Lifetime1] + param0.c(32);
              this.field_k[var6Lifetime1] = param0.c(32);
              var9 = param0.c(32);
              this.field_r[var6Lifetime1] = param0.c(32);
              this.field_J[var6Lifetime1] = param0.c(32);
              this.field_d[var6Lifetime1] = this.field_J[var6Lifetime1] + param0.c(32);
              array$2 = new int[var8Lifetime1];
              this.field_f[var6Lifetime1] = array$2;
              var4Lifetime1Lifetime1 = 0;
              var10 = 0;
              for (var11 = 0; var8Lifetime1 > var11; var11++) {
                dupTemp$3 = var10 + param0.b(1647);
                var10 = dupTemp$3;
                localTemp$4 = var4Lifetime1Lifetime1 + dupTemp$3;
                var4Lifetime1Lifetime1 = localTemp$4;
                this.field_f[var6Lifetime1][var11] = localTemp$4;
              }
              array$5 = new int[var8Lifetime1];
              this.field_b[var6Lifetime1] = array$5;
              var4Lifetime1Lifetime2 = 0;
              for (var11Lifetime1 = 0; var8Lifetime1 > var11Lifetime1; var11Lifetime1++) {
                dupTemp$6 = var4Lifetime1Lifetime2 + param0.c(32);
                var4Lifetime1Lifetime2 = dupTemp$6;
                this.field_b[var6Lifetime1][var11Lifetime1] = va.a(dupTemp$6, 255);
              }
              array$7 = new int[var9];
              this.field_o[var6Lifetime1] = array$7;
              var10Lifetime1 = 0;
              var4Lifetime1Lifetime3 = 0;
              for (var11Lifetime2 = 0; var9 > var11Lifetime2; var11Lifetime2++) {
                dupTemp$8 = var10Lifetime1 + param0.b(1647);
                var10Lifetime1 = dupTemp$8;
                localTemp$9 = var4Lifetime1Lifetime3 + dupTemp$8;
                var4Lifetime1Lifetime3 = localTemp$9;
                this.field_o[var6Lifetime1][var11Lifetime2] = localTemp$9;
              }
              var4Lifetime1Lifetime4 = 0;
              array$10 = new int[var9];
              this.field_a[var6Lifetime1] = array$10;
              for (var11Lifetime3 = 0; var11Lifetime3 < var9; var11Lifetime3++) {
                dupTemp$11 = var4Lifetime1Lifetime4 + param0.c(32);
                var4Lifetime1Lifetime4 = dupTemp$11;
                this.field_a[var6Lifetime1][var11Lifetime3] = va.a(dupTemp$11, 255);
              }
              this.field_w[var6Lifetime1] = param0.a((byte) 25);
              for (var11Lifetime4 = 0; var11Lifetime4 < var7; var11Lifetime4++) {
                this.field_s[var5Lifetime4] = param0.f(-109);
                this.field_j[var5Lifetime4] = param0.f(-95);
                this.field_u[var5Lifetime4] = this.field_j[var5Lifetime4] + param0.f(-54);
                this.field_I[var5Lifetime4] = param0.c(32);
                this.field_c[var5Lifetime4] = param0.b(true);
                this.field_C[var5Lifetime4] = param0.c(32);
                this.field_F[var5Lifetime4] = param0.c(32);
                this.field_K[var5Lifetime4] = -1 + param0.b(true);
                this.field_m[var5Lifetime4] = param0.a((byte) 25);
                this.field_v[var5Lifetime4] = param0.a((byte) 25);
                var5Lifetime4++;
              }
            }
          }
          this.a(false);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "vk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_x = "Loading textures";
    }
}
