/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    int[][] field_m;
    ra field_a;
    int[] field_o;
    private int[][] field_d;
    int[] field_i;
    private int[] field_c;
    int[] field_k;
    private byte[] field_r;
    int[] field_q;
    int[] field_j;
    private int field_h;
    static wh field_b;
    int field_s;
    static int field_e;
    static cn field_p;
    ra[] field_n;
    int field_l;
    byte[][] field_g;
    int field_f;

    private final void a(byte[] param0, byte param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
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
        ec var17 = null;
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
        var16 = DungeonAssault.field_K;
        try {
          var17 = new ec(lc.a(param0, 50166));
          var4 = var17.c(true);
          if (5 <= var4 &&
            7 >= var4) {
            if (param1 <= 97) {
              return;
            }
            if (6 > var4) {
              this.field_s = 0;
            } else {
              this.field_s = var17.h(-42);
            }
            var5 = var17.c(true);
            stackIn_13_0 = ((1 & var5) == 0) ? 0 : 1;
            var6 = stackIn_13_0;
            stackIn_16_0 = (0 == (var5 & 2)) ? 0 : 1;
            var7 = stackIn_16_0;
            if (var4 >= 7) {
              this.field_h = var17.j(1);
            } else {
              this.field_h = var17.k(0);
            }
            var8 = 0;
            var9 = -1;
            this.field_j = new int[this.field_h];
            if (7 > var4) {
              for (var10 = 0; this.field_h > var10; var10++) {
                dupTemp$0 = var8 + var17.k(0);
                var8 = dupTemp$0;
                this.field_j[var10] = dupTemp$0;
                if (this.field_j[var10] > var9) {
                  var9 = this.field_j[var10];
                }
              }
            } else {
              for (var10 = 0; this.field_h > var10; var10++) {
                dupTemp$1 = var8 + var17.j(1);
                var8 = dupTemp$1;
                this.field_j[var10] = dupTemp$1;
                if (var9 < this.field_j[var10]) {
                  var9 = this.field_j[var10];
                }
              }
            }
            this.field_l = 1 + var9;
            this.field_m = new int[this.field_l][];
            if (var7 != 0) {
              this.field_g = new byte[this.field_l][];
            }
            this.field_o = new int[this.field_l];
            this.field_i = new int[this.field_l];
            this.field_q = new int[this.field_l];
            this.field_k = new int[this.field_l];
            if (var6 != 0) {
              this.field_c = new int[this.field_l];
              for (var10Lifetime1 = 0; var10Lifetime1 < this.field_l; var10Lifetime1++) {
                this.field_c[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; this.field_h > var10Lifetime1Lifetime1; var10Lifetime1Lifetime1++) {
                this.field_c[this.field_j[var10Lifetime1Lifetime1]] = var17.h(-50);
              }
              this.field_a = new ra(this.field_c);
            }
            for (var10Lifetime2 = 0; this.field_h > var10Lifetime2; var10Lifetime2++) {
              this.field_q[this.field_j[var10Lifetime2]] = var17.h(-77);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; this.field_h > var10Lifetime3; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a((byte) -124, 0, 64, var21);
                this.field_g[this.field_j[var10Lifetime3]] = var21;
              }
            }
            for (var10Lifetime4 = 0; var10Lifetime4 < this.field_h; var10Lifetime4++) {
              this.field_o[this.field_j[var10Lifetime4]] = var17.h(-100);
            }
            if (var4 >= 7) {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_h; var10Lifetime5++) {
                this.field_k[this.field_j[var10Lifetime5]] = var17.j(1);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_h; var10Lifetime5++) {
                var11 = this.field_j[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_k[var11];
                var13 = -1;
                array$2 = new int[var12];
                this.field_m[var11] = array$2;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.j(1);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_m[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_i[var11] = 1 + var13;
                if (var12 == 1 + var13) {
                  this.field_m[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_h; var10Lifetime5++) {
                this.field_k[this.field_j[var10Lifetime5]] = var17.k(0);
              }
              for (var10Lifetime5 = 0; this.field_h > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_j[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_k[var11];
                array$5 = new int[var12];
                this.field_m[var11] = array$5;
                var13 = -1;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.k(0);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_m[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_i[var11] = 1 + var13;
                if (var12 == 1 + var13) {
                  this.field_m[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_d = new int[1 + var9][];
              this.field_n = new ra[var9 + 1];
              for (var10Lifetime6 = 0; var10Lifetime6 < this.field_h; var10Lifetime6++) {
                var11Lifetime1 = this.field_j[var10Lifetime6];
                var12Lifetime1 = this.field_k[var11Lifetime1];
                array$8 = new int[this.field_i[var11Lifetime1]];
                this.field_d[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_i[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_d[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (this.field_m[var11Lifetime1] != null) {
                    var14Lifetime1 = this.field_m[var11Lifetime1][var13Lifetime1Lifetime1];
                  } else {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  }
                  this.field_d[var11Lifetime1][var14Lifetime1] = var17.h(-81);
                }
                this.field_n[var11Lifetime1] = new ra(this.field_d[var11Lifetime1]);
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
          stackIn_103_1 = new StringBuilder().append("tm.A(");
          if (param0 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_p = null;
        field_b = null;
        int var1 = 32 / ((param0 - 5) / 55);
    }

    tm(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_f = qh.a(16777215, param0, param0.length);
          if (param1 != this.field_f) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_r = rn.a(param0.length, 0, 8, param0);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (param2[var4_int] != this.field_r[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(param0, (byte) 118);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "tm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
