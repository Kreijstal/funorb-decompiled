/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    private byte[] field_o;
    private int[] field_k;
    int field_b;
    static int field_s;
    int field_f;
    lm field_n;
    static int field_e;
    int[] field_g;
    int[] field_l;
    static mh field_j;
    int[] field_r;
    lm[] field_i;
    int[] field_p;
    int[] field_m;
    private int[][] field_t;
    int field_a;
    private int field_d;
    int[][] field_h;
    byte[][] field_c;
    static String field_q;

    private final void a(byte[] param0, boolean param1) {
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
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_103_2 = null;
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
        wq var17 = null;
        byte[] var21 = null;
        int var8Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var13Lifetime1;
        int var14Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var10Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        var16 = BrickABrac.field_J ? 1 : 0;
        try {
          var17 = new wq(i.a(true, param0));
          var4 = var17.l(255);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (var4 < 6) {
              this.field_a = 0;
            } else {
              this.field_a = var17.e(255);
            }
            var5 = var17.l(255);
            stackIn_11_0 = (0 == (var5 & 1)) ? 0 : 1;
            var6 = stackIn_11_0;
            stackIn_14_0 = (0 == (var5 & 2)) ? 0 : 1;
            var7 = stackIn_14_0;
            if (var4 >= 7) {
              this.field_d = var17.c(false);
            } else {
              this.field_d = var17.i(65280);
            }
            var8 = 0;
            this.field_g = new int[this.field_d];
            if (param1) {
              ko.a((byte) 19);
            }
            var9 = -1;
            if (var4 >= 7) {
              for (var10 = 0; var10 < this.field_d; var10++) {
                dupTemp$0 = var8 + var17.c(false);
                var8 = dupTemp$0;
                this.field_g[var10] = dupTemp$0;
                if (var9 < this.field_g[var10]) {
                  var9 = this.field_g[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.field_d; var10++) {
                dupTemp$1 = var8 + var17.i(65280);
                var8 = dupTemp$1;
                this.field_g[var10] = dupTemp$1;
                if (var9 < this.field_g[var10]) {
                  var9 = this.field_g[var10];
                }
              }
            }
            this.field_f = 1 + var9;
            this.field_r = new int[this.field_f];
            if (var7 != 0) {
              this.field_c = new byte[this.field_f][];
            }
            this.field_l = new int[this.field_f];
            this.field_p = new int[this.field_f];
            this.field_m = new int[this.field_f];
            this.field_h = new int[this.field_f][];
            if (var6 != 0) {
              this.field_k = new int[this.field_f];
              for (var10Lifetime1 = 0; this.field_f > var10Lifetime1; var10Lifetime1++) {
                this.field_k[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_d; var10Lifetime1Lifetime1++) {
                this.field_k[this.field_g[var10Lifetime1Lifetime1]] = var17.e(255);
              }
              this.field_n = new lm(this.field_k);
            }
            for (var10Lifetime2 = 0; this.field_d > var10Lifetime2; var10Lifetime2++) {
              this.field_p[this.field_g[var10Lifetime2]] = var17.e(255);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_d; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(0, var21, 110, 64);
                this.field_c[this.field_g[var10Lifetime3]] = var21;
              }
            }
            for (var10Lifetime4 = 0; this.field_d > var10Lifetime4; var10Lifetime4++) {
              this.field_r[this.field_g[var10Lifetime4]] = var17.e(255);
            }
            if (var4 < 7) {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_d; var10Lifetime5++) {
                this.field_m[this.field_g[var10Lifetime5]] = var17.i(65280);
              }
              for (var10Lifetime5 = 0; this.field_d > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_g[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_m[var11];
                var13 = -1;
                array$2 = new int[var12];
                this.field_h[var11] = array$2;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.i(65280);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_h[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_l[var11] = 1 + var13;
                if (var13 + 1 == var12) {
                  this.field_h[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_d; var10Lifetime5++) {
                this.field_m[this.field_g[var10Lifetime5]] = var17.c(false);
              }
              for (var10Lifetime5 = 0; this.field_d > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_g[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_m[var11];
                array$5 = new int[var12];
                this.field_h[var11] = array$5;
                var13 = -1;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.c(false);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_h[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_l[var11] = var13 + 1;
                if (1 + var13 == var12) {
                  this.field_h[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_i = new lm[var9 + 1];
              this.field_t = new int[1 + var9][];
              for (var10Lifetime6 = 0; this.field_d > var10Lifetime6; var10Lifetime6++) {
                var11Lifetime1 = this.field_g[var10Lifetime6];
                var12Lifetime1 = this.field_m[var11Lifetime1];
                array$8 = new int[this.field_l[var11Lifetime1]];
                this.field_t[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_l[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_t[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (null == this.field_h[var11Lifetime1]) {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  } else {
                    var14Lifetime1 = this.field_h[var11Lifetime1][var13Lifetime1Lifetime1];
                  }
                  this.field_t[var11Lifetime1][var14Lifetime1] = var17.e(255);
                }
                this.field_i[var11Lifetime1] = new lm(this.field_t[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_102_0 = var3;
          stackIn_102_1 = new StringBuilder().append("ko.A(");
          if (param0 == null) {
            stackIn_103_2 = "null";
          } else {
            stackIn_103_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_102_0), ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var2 = BrickABrac.field_J ? 1 : 0;
        if (ml.field_b > 0) {
          ml.field_b = ml.field_b - 1;
        } else {
          if (pe.field_j > 0) {
            pe.field_j = pe.field_j - 1;
          } else {
            if (eg.field_m > 0) {
              eg.field_m = eg.field_m - 1;
            }
          }
        }
        if (param0 != -32120) {
          return;
        }
        if (!(ml.field_b <= 0)) {
          on.e(param0 ^ 32040);
        }
        if (!(pe.field_j <= 0)) {
          co.a(pe.field_j, false);
        }
        if (eg.field_m > 0) {
          co.a(eg.field_m, false);
        }
    }

    final static void a(int param0, int param1, jp param2, int param3, jp param4, int param5, int param6, int param7, int param8, int param9, jp param10) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var11 = null;
        try {
          param4.d(param8 - (-((-param4.field_x + param6) / 2) - (5 * param3 >> 16)), param9);
          if (param0 > -20) {
            field_s = 123;
          }
          param10.c(-(30 / param7) + (param8 + ((-param10.field_x + param6) / 2 + (param3 * 10 >> 16))), 37 / param7 + (-param10.field_z + 480 + param9) + param1);
          param2.c(param8 - (-((param6 - param2.field_x) / 2) - (20 * param3 >> 16)) - 5 / param7, -param2.field_z + 480 + (param9 + param1));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_6_0 = var11;
          stackIn_6_1 = new StringBuilder().append("ko.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 <= 108) {
          return;
        }
        field_q = null;
        field_j = null;
    }

    ko(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_b = cg.a(param0.length, param0, (byte) -86);
          if (param1 != this.field_b) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_o = jd.a(param0, 0, -14970, param0.length);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_o[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(param0, false);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "ko.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = "PER MONTH";
    }
}
