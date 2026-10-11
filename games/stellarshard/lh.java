/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    vj field_q;
    int field_e;
    int field_m;
    private byte[] field_s;
    int[] field_p;
    int[] field_l;
    int[] field_k;
    vj[] field_c;
    private int field_a;
    private int[][] field_o;
    int[] field_j;
    byte[][] field_h;
    int[][] field_b;
    int field_r;
    private int[] field_i;
    static th field_n;
    int[] field_g;
    static volatile boolean field_f;
    static int field_d;

    final static boolean a(ej param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -34 % ((-76 - param1) / 34);
          stackIn_1_0 = param0.a(-54);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("lh.B(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        int var1 = 52 % ((param0 - 56) / 59);
        field_n = null;
    }

    private final void a(int param0, byte[] param1) {
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
        int stackIn_17_0 = 0;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_100_2 = null;
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
        ka var17 = null;
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
        var16 = stellarshard.field_B;
        try {
          var17 = new ka(sl.a((byte) -64, param1));
          var4 = var17.f(4);
          if (var4 >= 5 &&
            7 >= var4) {
            if (6 <= var4) {
              this.field_r = var17.b(false);
            } else {
              this.field_r = 0;
            }
            var5 = var17.f(4);
            stackIn_11_0 = ((1 & var5) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            if (var4 < 7) {
              this.field_a = var17.c((byte) 35);
            } else {
              this.field_a = var17.h(26491);
            }
            stackIn_17_0 = ((var5 & 2) == 0) ? 0 : 1;
            var7 = stackIn_17_0;
            var8 = 0;
            this.field_k = new int[this.field_a];
            var9 = -1;
            if (var4 >= 7) {
              for (var10 = 0; this.field_a > var10; var10++) {
                dupTemp$0 = var8 + var17.h(26491);
                var8 = dupTemp$0;
                this.field_k[var10] = dupTemp$0;
                if (this.field_k[var10] > var9) {
                  var9 = this.field_k[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.field_a; var10++) {
                dupTemp$1 = var8 + var17.c((byte) 42);
                var8 = dupTemp$1;
                this.field_k[var10] = dupTemp$1;
                if (var9 < this.field_k[var10]) {
                  var9 = this.field_k[var10];
                }
              }
            }
            this.field_e = 1 + var9;
            this.field_p = new int[this.field_e];
            if (var7 != 0) {
              this.field_h = new byte[this.field_e][];
            }
            this.field_g = new int[this.field_e];
            this.field_l = new int[this.field_e];
            this.field_j = new int[this.field_e];
            this.field_b = new int[this.field_e][];
            if (var6 != 0) {
              this.field_i = new int[this.field_e];
              for (var10Lifetime1 = 0; this.field_e > var10Lifetime1; var10Lifetime1++) {
                this.field_i[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; this.field_a > var10Lifetime1Lifetime1; var10Lifetime1Lifetime1++) {
                this.field_i[this.field_k[var10Lifetime1Lifetime1]] = var17.b(false);
              }
              this.field_q = new vj(this.field_i);
            }
            for (var10Lifetime2 = param0; var10Lifetime2 < this.field_a; var10Lifetime2++) {
              this.field_l[this.field_k[var10Lifetime2]] = var17.b(false);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_a; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(0, (byte) -100, 64, var21);
                this.field_h[this.field_k[var10Lifetime3]] = var21;
              }
            }
            for (var10Lifetime4 = 0; this.field_a > var10Lifetime4; var10Lifetime4++) {
              this.field_j[this.field_k[var10Lifetime4]] = var17.b(false);
            }
            if (var4 < 7) {
              for (var10Lifetime5 = 0; this.field_a > var10Lifetime5; var10Lifetime5++) {
                this.field_p[this.field_k[var10Lifetime5]] = var17.c((byte) 92);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_a; var10Lifetime5++) {
                var11 = this.field_k[var10Lifetime5];
                var12 = this.field_p[var11];
                var8Lifetime1 = 0;
                array$2 = new int[var12];
                this.field_b[var11] = array$2;
                var13 = -1;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.c((byte) 102);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_b[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_g[var11] = 1 + var13;
                if (var13 + 1 == var12) {
                  this.field_b[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_a; var10Lifetime5++) {
                this.field_p[this.field_k[var10Lifetime5]] = var17.h(ih.a(param0, 26491));
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_a; var10Lifetime5++) {
                var11 = this.field_k[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_p[var11];
                var13 = -1;
                array$5 = new int[var12];
                this.field_b[var11] = array$5;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.h(26491);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_b[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_g[var11] = 1 + var13;
                if (1 + var13 == var12) {
                  this.field_b[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_o = new int[1 + var9][];
              this.field_c = new vj[var9 + 1];
              for (var10Lifetime6 = 0; var10Lifetime6 < this.field_a; var10Lifetime6++) {
                var11Lifetime1 = this.field_k[var10Lifetime6];
                var12Lifetime1 = this.field_p[var11Lifetime1];
                array$8 = new int[this.field_g[var11Lifetime1]];
                this.field_o[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_g[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_o[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var12Lifetime1 > var13Lifetime1Lifetime1; var13Lifetime1Lifetime1++) {
                  if (null == this.field_b[var11Lifetime1]) {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  } else {
                    var14Lifetime1 = this.field_b[var11Lifetime1][var13Lifetime1Lifetime1];
                  }
                  this.field_o[var11Lifetime1][var14Lifetime1] = var17.b(false);
                }
                this.field_c[var11Lifetime1] = new vj(this.field_o[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_99_0 = var3;
          stackIn_99_1 = new StringBuilder().append("lh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_100_2 = "null";
          } else {
            stackIn_100_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_99_0), ((StringBuilder) (Object) stackIn_99_1).append(stackIn_100_2).append(')').toString());
        }
    }

    lh(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_m = bg.a(param0.length, param0, 0);
          if (this.field_m != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (64 != param2.length) {
              throw new RuntimeException();
            }
            this.field_s = bc.a(0, 0, param0.length, param0);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_s[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(0, param0);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "lh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = new th();
        field_d = 1;
        field_f = true;
    }
}
