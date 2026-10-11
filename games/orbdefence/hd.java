/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd {
    private int field_n;
    int field_s;
    private int[] field_m;
    private int[][] field_a;
    int[] field_d;
    int[] field_i;
    int[] field_r;
    static ba field_q;
    int[] field_l;
    int[][] field_f;
    int field_p;
    private byte[] field_h;
    int[] field_c;
    int field_b;
    af field_o;
    byte[][] field_k;
    static hj field_e;
    static int field_t;
    af[] field_g;
    static String field_j;

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
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
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
        mg var17 = null;
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
        var16 = OrbDefence.field_D ? 1 : 0;
        try {
          var17 = new mg(nf.a(param1, -2));
          var4 = var17.b((byte) 90);
          if (var4 >= 5 &&
            7 >= var4) {
            if (6 <= var4) {
              this.field_b = var17.l(0);
            } else {
              this.field_b = 0;
            }
            var5 = var17.b((byte) 90);
            if (param0 < 63) {
              field_q = (ba) null;
            }
            stackIn_13_0 = ((1 & var5) == 0) ? 0 : 1;
            var6 = stackIn_13_0;
            stackIn_16_0 = ((2 & var5) == 0) ? 0 : 1;
            var7 = stackIn_16_0;
            if (var4 >= 7) {
              this.field_n = var17.d(true);
            } else {
              this.field_n = var17.j(98203176);
            }
            var8 = 0;
            this.field_c = new int[this.field_n];
            var9 = -1;
            if (var4 >= 7) {
              for (var10 = 0; var10 < this.field_n; var10++) {
                dupTemp$0 = var8 + var17.d(true);
                var8 = dupTemp$0;
                this.field_c[var10] = dupTemp$0;
                if (this.field_c[var10] > var9) {
                  var9 = this.field_c[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.field_n; var10++) {
                dupTemp$1 = var8 + var17.j(98203176);
                var8 = dupTemp$1;
                this.field_c[var10] = dupTemp$1;
                if (var9 < this.field_c[var10]) {
                  var9 = this.field_c[var10];
                }
              }
            }
            this.field_s = var9 + 1;
            this.field_l = new int[this.field_s];
            this.field_i = new int[this.field_s];
            this.field_r = new int[this.field_s];
            if (var7 != 0) {
              this.field_k = new byte[this.field_s][];
            }
            this.field_d = new int[this.field_s];
            this.field_f = new int[this.field_s][];
            if (var6 != 0) {
              this.field_m = new int[this.field_s];
              for (var10Lifetime1 = 0; var10Lifetime1 < this.field_s; var10Lifetime1++) {
                this.field_m[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; this.field_n > var10Lifetime1Lifetime1; var10Lifetime1Lifetime1++) {
                this.field_m[this.field_c[var10Lifetime1Lifetime1]] = var17.l(0);
              }
              this.field_o = new af(this.field_m);
            }
            for (var10Lifetime2 = 0; var10Lifetime2 < this.field_n; var10Lifetime2++) {
              this.field_r[this.field_c[var10Lifetime2]] = var17.l(0);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_n; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a((byte) 115, var21, 0, 64);
                this.field_k[this.field_c[var10Lifetime3]] = var21;
              }
            }
            for (var10Lifetime4 = 0; var10Lifetime4 < this.field_n; var10Lifetime4++) {
              this.field_i[this.field_c[var10Lifetime4]] = var17.l(0);
            }
            if (var4 >= 7) {
              for (var10Lifetime5 = 0; this.field_n > var10Lifetime5; var10Lifetime5++) {
                this.field_d[this.field_c[var10Lifetime5]] = var17.d(true);
              }
              for (var10Lifetime5 = 0; this.field_n > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_c[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_d[var11];
                array$2 = new int[var12];
                this.field_f[var11] = array$2;
                var13 = -1;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.d(true);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_f[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_l[var11] = var13 + 1;
                if (var12 == var13 + 1) {
                  this.field_f[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; this.field_n > var10Lifetime5; var10Lifetime5++) {
                this.field_d[this.field_c[var10Lifetime5]] = var17.j(98203176);
              }
              for (var10Lifetime5 = 0; this.field_n > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_c[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_d[var11];
                array$5 = new int[var12];
                this.field_f[var11] = array$5;
                var13 = -1;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.j(98203176);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_f[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_l[var11] = 1 + var13;
                if (var13 + 1 == var12) {
                  this.field_f[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_g = new af[1 + var9];
              this.field_a = new int[var9 + 1][];
              for (var10Lifetime6 = 0; this.field_n > var10Lifetime6; var10Lifetime6++) {
                var11Lifetime1 = this.field_c[var10Lifetime6];
                var12Lifetime1 = this.field_d[var11Lifetime1];
                array$8 = new int[this.field_l[var11Lifetime1]];
                this.field_a[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_l[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_a[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (null != this.field_f[var11Lifetime1]) {
                    var14Lifetime1 = this.field_f[var11Lifetime1][var13Lifetime1Lifetime1];
                  } else {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  }
                  this.field_a[var11Lifetime1][var14Lifetime1] = var17.l(0);
                }
                this.field_g[var11Lifetime1] = new af(this.field_a[var11Lifetime1]);
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
          stackIn_102_1 = new StringBuilder().append("hd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_103_2 = "null";
          } else {
            stackIn_103_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_102_0), ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_q = null;
        field_j = null;
        if (param0 != 100) {
          hd.a(33);
        }
        field_e = null;
    }

    hd(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_p = eg.a(param0, 0, param0.length);
          if (param1 != this.field_p) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_h = ee.a(-1, param0.length, 0, param0);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_h[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(68, param0);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "hd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = 100;
        field_q = new ba(8, 0, 4, 1);
    }
}
