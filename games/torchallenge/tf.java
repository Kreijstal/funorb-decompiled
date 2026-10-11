/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    int[] field_e;
    int[] field_y;
    static ka[] field_a;
    int[][] field_A;
    static double field_i;
    static cd field_h;
    private int[] field_c;
    int field_k;
    int[] field_g;
    int field_b;
    int field_r;
    static int[] field_l;
    private int field_m;
    int[] field_d;
    private int[][] field_v;
    static ka[] field_j;
    static int field_o;
    wi field_p;
    wi[] field_s;
    static h field_f;
    static rj field_w;
    int[] field_t;
    static String[] field_z;
    static int[] field_u;
    byte[][] field_n;
    private byte[] field_q;
    static eg field_x;

    public static void a(byte param0) {
        field_u = null;
        field_j = null;
        field_w = null;
        field_a = null;
        field_f = null;
        field_z = null;
        field_h = null;
        field_l = null;
        field_x = null;
        if (param0 < 46) {
          field_x = (eg) null;
        }
    }

    private final void a(byte param0, byte[] param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        uf var18 = null;
        byte[] var22 = null;
        int var8Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var14Lifetime1;
        int var15Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var11Lifetime5;
        int var14Lifetime1Lifetime1;
        var17 = TorChallenge.field_F ? 1 : 0;
        try {
          var18 = new uf(pg.a(-1048576, param1));
          var4 = var18.j(-101);
          if (5 <= var4 &&
            7 >= var4) {
            if (var4 < 6) {
              this.field_b = 0;
            } else {
              this.field_b = var18.i(40);
            }
            var5 = var18.j(-128);
            stackIn_11_0 = ((1 & var5) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            stackIn_14_0 = ((2 & var5) == 0) ? 0 : 1;
            var7 = stackIn_14_0;
            if (var4 < 7) {
              this.field_m = var18.c(false);
            } else {
              this.field_m = var18.h(78);
            }
            var8 = 0;
            this.field_y = new int[this.field_m];
            var9 = -1;
            if (var4 >= 7) {
              for (var10 = 0; var10 < this.field_m; var10++) {
                dupTemp$0 = var8 + var18.h(96);
                var8 = dupTemp$0;
                this.field_y[var10] = dupTemp$0;
                if (this.field_y[var10] > var9) {
                  var9 = this.field_y[var10];
                }
              }
            } else {
              for (var10 = 0; this.field_m > var10; var10++) {
                dupTemp$1 = var8 + var18.c(false);
                var8 = dupTemp$1;
                this.field_y[var10] = dupTemp$1;
                if (this.field_y[var10] > var9) {
                  var9 = this.field_y[var10];
                }
              }
            }
            var10Lifetime1 = 36 % ((param0 + 33) / 36);
            this.field_r = var9 + 1;
            this.field_A = new int[this.field_r][];
            if (var7 != 0) {
              this.field_n = new byte[this.field_r][];
            }
            this.field_d = new int[this.field_r];
            this.field_g = new int[this.field_r];
            this.field_e = new int[this.field_r];
            this.field_t = new int[this.field_r];
            if (var6 != 0) {
              this.field_c = new int[this.field_r];
              for (var11 = 0; var11 < this.field_r; var11++) {
                this.field_c[var11] = -1;
              }
              for (var11Lifetime5 = 0; var11Lifetime5 < this.field_m; var11Lifetime5++) {
                this.field_c[this.field_y[var11Lifetime5]] = var18.i(124);
              }
              this.field_p = new wi(this.field_c);
            }
            for (var11Lifetime1 = 0; this.field_m > var11Lifetime1; var11Lifetime1++) {
              this.field_t[this.field_y[var11Lifetime1]] = var18.i(50);
            }
            if (var7 == 0) {
              for (var11Lifetime2 = 0; this.field_m > var11Lifetime2; var11Lifetime2++) {
                this.field_d[this.field_y[var11Lifetime2]] = var18.i(116);
              }
            } else {
              for (var11Lifetime2 = 0; var11Lifetime2 < this.field_m; var11Lifetime2++) {
                var22 = new byte[64];
                var18.a(93, var22, 64, 0);
                this.field_n[this.field_y[var11Lifetime2]] = var22;
              }
              for (var11Lifetime2 = 0; this.field_m > var11Lifetime2; var11Lifetime2++) {
                this.field_d[this.field_y[var11Lifetime2]] = var18.i(116);
              }
            }
            if (var4 >= 7) {
              for (var11Lifetime3 = 0; var11Lifetime3 < this.field_m; var11Lifetime3++) {
                this.field_e[this.field_y[var11Lifetime3]] = var18.h(-76);
              }
              for (var11Lifetime3 = 0; this.field_m > var11Lifetime3; var11Lifetime3++) {
                var12 = this.field_y[var11Lifetime3];
                var8Lifetime1 = 0;
                var13 = this.field_e[var12];
                array$2 = new int[var13];
                this.field_A[var12] = array$2;
                var14 = -1;
                for (var15 = 0; var15 < var13; var15++) {
                  dupTemp$3 = var8Lifetime1 + var18.h(-116);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_A[var12];
                  dupTemp$4[var15] = dupTemp$3;
                  var16 = dupTemp$3;
                  if (var16 > var14) {
                    var14 = var16;
                  }
                }
                this.field_g[var12] = 1 + var14;
                if (1 + var14 == var13) {
                  this.field_A[var12] = null;
                }
              }
            } else {
              for (var11Lifetime3 = 0; var11Lifetime3 < this.field_m; var11Lifetime3++) {
                this.field_e[this.field_y[var11Lifetime3]] = var18.c(false);
              }
              for (var11Lifetime3 = 0; this.field_m > var11Lifetime3; var11Lifetime3++) {
                var12 = this.field_y[var11Lifetime3];
                var13 = this.field_e[var12];
                var8Lifetime1 = 0;
                array$5 = new int[var13];
                this.field_A[var12] = array$5;
                var14 = -1;
                for (var15 = 0; var15 < var13; var15++) {
                  dupTemp$6 = var8Lifetime1 + var18.c(false);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_A[var12];
                  dupTemp$7[var15] = dupTemp$6;
                  var16 = dupTemp$6;
                  if (var16 > var14) {
                    var14 = var16;
                  }
                }
                this.field_g[var12] = var14 + 1;
                if (var13 == 1 + var14) {
                  this.field_A[var12] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_s = new wi[var9 + 1];
              this.field_v = new int[var9 + 1][];
              for (var11Lifetime4 = 0; var11Lifetime4 < this.field_m; var11Lifetime4++) {
                var12Lifetime1 = this.field_y[var11Lifetime4];
                var13Lifetime1 = this.field_e[var12Lifetime1];
                array$8 = new int[this.field_g[var12Lifetime1]];
                this.field_v[var12Lifetime1] = array$8;
                for (var14Lifetime1 = 0; var14Lifetime1 < this.field_g[var12Lifetime1]; var14Lifetime1++) {
                  this.field_v[var12Lifetime1][var14Lifetime1] = -1;
                }
                for (var14Lifetime1Lifetime1 = 0; var13Lifetime1 > var14Lifetime1Lifetime1; var14Lifetime1Lifetime1++) {
                  if (null == this.field_A[var12Lifetime1]) {
                    var15Lifetime1 = var14Lifetime1Lifetime1;
                  } else {
                    var15Lifetime1 = this.field_A[var12Lifetime1][var14Lifetime1Lifetime1];
                  }
                  this.field_v[var12Lifetime1][var15Lifetime1] = var18.i(50);
                }
                this.field_s[var12Lifetime1] = new wi(this.field_v[var12Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_103_0 = var3;
          stackIn_103_1 = new StringBuilder().append("tf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(')').toString());
        }
    }

    tf(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_k = k.a(param0, param0.length, 0);
          if (this.field_k != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_q = qc.a(param0, param0.length, (byte) -126, 0);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (param2[var4_int] != this.field_q[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a((byte) -123, param0);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "tf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = 0.0;
        field_l = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_h = null;
        field_o = 0;
        field_z = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_u = new int[8192];
        field_w = new rj();
    }
}
