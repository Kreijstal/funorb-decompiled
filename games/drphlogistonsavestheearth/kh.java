/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    int[] field_l;
    byte[][] field_q;
    private int[] field_u;
    int field_m;
    static int field_c;
    qf field_s;
    static int[] field_i;
    int[] field_k;
    qf[] field_b;
    int[] field_r;
    private byte[] field_g;
    int[] field_d;
    int field_t;
    static String field_o;
    static he field_e;
    private int field_n;
    private int[][] field_a;
    int[] field_j;
    int field_p;
    int[][] field_f;
    static cd field_h;

    private final void a(boolean param0, byte[] param1) {
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
        od var17 = null;
        byte[] var21 = null;
        int var8Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var13Lifetime1;
        int var14Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var10Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var17 = new od(ce.a(1, param1));
          var4 = var17.l(31760);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (var4 >= 6) {
              this.field_t = var17.h(101);
            } else {
              this.field_t = 0;
            }
            var5 = var17.l(31760);
            stackIn_11_0 = ((var5 & 1) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            stackIn_14_0 = ((var5 & 2) == 0) ? 0 : 1;
            var7 = stackIn_14_0;
            if (var4 >= 7) {
              this.field_n = var17.a(true);
            } else {
              this.field_n = var17.j(-788751192);
            }
            var8 = 0;
            this.field_r = new int[this.field_n];
            var9 = -1;
            if (var4 >= 7) {
              for (var10 = 0; this.field_n > var10; var10++) {
                dupTemp$0 = var8 + var17.a(true);
                var8 = dupTemp$0;
                this.field_r[var10] = dupTemp$0;
                if (this.field_r[var10] > var9) {
                  var9 = this.field_r[var10];
                }
              }
            } else {
              for (var10 = 0; this.field_n > var10; var10++) {
                dupTemp$1 = var8 + var17.j(-788751192);
                var8 = dupTemp$1;
                this.field_r[var10] = dupTemp$1;
                if (this.field_r[var10] > var9) {
                  var9 = this.field_r[var10];
                }
              }
            }
            this.field_m = 1 + var9;
            if (var7 != 0) {
              this.field_q = new byte[this.field_m][];
            }
            this.field_k = new int[this.field_m];
            this.field_l = new int[this.field_m];
            this.field_j = new int[this.field_m];
            this.field_f = new int[this.field_m][];
            this.field_d = new int[this.field_m];
            if (var6 != 0) {
              this.field_u = new int[this.field_m];
              for (var10Lifetime1 = 0; this.field_m > var10Lifetime1; var10Lifetime1++) {
                this.field_u[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_n; var10Lifetime1Lifetime1++) {
                this.field_u[this.field_r[var10Lifetime1Lifetime1]] = var17.h(124);
              }
              this.field_s = new qf(this.field_u);
            }
            for (var10Lifetime2 = 0; var10Lifetime2 < this.field_n; var10Lifetime2++) {
              this.field_j[this.field_r[var10Lifetime2]] = var17.h(123);
            }
            if (var7 == 0) {
              var10Lifetime3 = 0;
              if (!param0) {
                this.field_g = (byte[]) null;
              }
              while (var10Lifetime3 < this.field_n) {
                this.field_l[this.field_r[var10Lifetime3]] = var17.h(109);
                var10Lifetime3++;
              }
            } else {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_n; var10Lifetime3++) {
                var21 = new byte[64];
                var17.b(0, 64, 128, var21);
                this.field_q[this.field_r[var10Lifetime3]] = var21;
              }
              var10Lifetime3 = 0;
              if (!param0) {
                this.field_g = (byte[]) null;
              }
              while (var10Lifetime3 < this.field_n) {
                this.field_l[this.field_r[var10Lifetime3]] = var17.h(109);
                var10Lifetime3++;
              }
            }
            if (var4 < 7) {
              for (var10Lifetime4 = 0; var10Lifetime4 < this.field_n; var10Lifetime4++) {
                this.field_k[this.field_r[var10Lifetime4]] = var17.j(-788751192);
              }
              for (var10Lifetime4 = 0; this.field_n > var10Lifetime4; var10Lifetime4++) {
                var11 = this.field_r[var10Lifetime4];
                var8Lifetime1 = 0;
                var12 = this.field_k[var11];
                var13 = -1;
                array$2 = new int[var12];
                this.field_f[var11] = array$2;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.j(-788751192);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_f[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_d[var11] = 1 + var13;
                if (var12 == 1 + var13) {
                  this.field_f[var11] = null;
                }
              }
            } else {
              for (var10Lifetime4 = 0; var10Lifetime4 < this.field_n; var10Lifetime4++) {
                this.field_k[this.field_r[var10Lifetime4]] = var17.a(true);
              }
              for (var10Lifetime4 = 0; this.field_n > var10Lifetime4; var10Lifetime4++) {
                var11 = this.field_r[var10Lifetime4];
                var12 = this.field_k[var11];
                var8Lifetime1 = 0;
                var13 = -1;
                array$5 = new int[var12];
                this.field_f[var11] = array$5;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.a(true);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_f[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_d[var11] = var13 + 1;
                if (var13 + 1 == var12) {
                  this.field_f[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_a = new int[1 + var9][];
              this.field_b = new qf[1 + var9];
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_n; var10Lifetime5++) {
                var11Lifetime1 = this.field_r[var10Lifetime5];
                var12Lifetime1 = this.field_k[var11Lifetime1];
                array$8 = new int[this.field_d[var11Lifetime1]];
                this.field_a[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; var13Lifetime1 < this.field_d[var11Lifetime1]; var13Lifetime1++) {
                  this.field_a[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (this.field_f[var11Lifetime1] != null) {
                    var14Lifetime1 = this.field_f[var11Lifetime1][var13Lifetime1Lifetime1];
                  } else {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  }
                  this.field_a[var11Lifetime1][var14Lifetime1] = var17.h(-118);
                }
                this.field_b[var11Lifetime1] = new qf(this.field_a[var11Lifetime1]);
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
          stackIn_102_1 = new StringBuilder().append("kh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_103_2 = "null";
          } else {
            stackIn_103_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_102_0), ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0) {
        boolean stackIn_8_0 = false;
        boolean stackIn_11_0 = false;
        if (param0) {
          kh.a((byte) -124);
        }
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameRemainder0 = true;
        if (hj.field_f >= 20 &&
          bj.a(13)) {
          if (rh.field_a > 0) {
            stackIn_8_0 = !param0;
            decompiledFrameRemainder0 = !(!hc.a(stackIn_8_0));
          }
          if (decompiledFrameRemainder0) {
            stackIn_11_0 = false;
            decompiledFrameRemainder1 = false;
          }
        }
        if (decompiledFrameRemainder1) {
          stackIn_11_0 = true;
        }
        return stackIn_11_0;
    }

    public static void a(byte param0) {
        if (param0 >= -41) {
          kh.a((byte) 93);
        }
        field_e = null;
        field_h = null;
        field_i = null;
        field_o = null;
    }

    kh(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_p = th.a(param0, (byte) 127, param0.length);
          if (this.field_p != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (64 != param2.length) {
              throw new RuntimeException();
            }
            this.field_g = b.a(0, 44, param0, param0.length);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (param2[var4_int] != this.field_g[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(true, param0);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "kh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = 1;
        field_o = "Building survival bonus (";
        field_h = new cd();
    }
}
