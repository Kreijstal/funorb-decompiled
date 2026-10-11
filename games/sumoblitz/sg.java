/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    int field_p;
    int[] field_b;
    static String field_i;
    private int[][] field_o;
    private byte[] field_g;
    static long field_j;
    byte[][] field_a;
    int field_l;
    bf field_e;
    int field_d;
    int[] field_c;
    bf[] field_q;
    private int field_h;
    int[] field_m;
    private int[] field_n;
    int[][] field_s;
    int[] field_r;
    static String field_k;
    int[] field_f;

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
        int stackIn_19_0 = 0;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_106_2 = null;
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
        fs var17 = null;
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
        var16 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param1 != -56) {
            return;
          }
          var17 = new fs(nd.a(-1, param0));
          var4 = var17.e(param1 ^ 31346);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (var4 < 6) {
              this.field_l = 0;
            } else {
              this.field_l = var17.c(true);
            }
            var5 = var17.e(-31302);
            stackIn_13_0 = ((1 & var5) == 0) ? 0 : 1;
            var6 = stackIn_13_0;
            if (var4 < 7) {
              this.field_h = var17.a(255);
            } else {
              this.field_h = var17.f(0);
            }
            stackIn_19_0 = ((var5 & 2) == 0) ? 0 : 1;
            var7 = stackIn_19_0;
            var8 = 0;
            var9 = -1;
            this.field_f = new int[this.field_h];
            if (var4 >= 7) {
              for (var10 = 0; this.field_h > var10; var10++) {
                dupTemp$0 = var8 + var17.f(0);
                var8 = dupTemp$0;
                this.field_f[var10] = dupTemp$0;
                if (var9 < this.field_f[var10]) {
                  var9 = this.field_f[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.field_h; var10++) {
                dupTemp$1 = var8 + var17.a(jg.a((int) param1, -201));
                var8 = dupTemp$1;
                this.field_f[var10] = dupTemp$1;
                if (this.field_f[var10] > var9) {
                  var9 = this.field_f[var10];
                }
              }
            }
            this.field_d = var9 + 1;
            this.field_b = new int[this.field_d];
            this.field_c = new int[this.field_d];
            if (var7 != 0) {
              this.field_a = new byte[this.field_d][];
            }
            this.field_s = new int[this.field_d][];
            this.field_r = new int[this.field_d];
            this.field_m = new int[this.field_d];
            if (var6 != 0) {
              this.field_n = new int[this.field_d];
              for (var10Lifetime1 = 0; this.field_d > var10Lifetime1; var10Lifetime1++) {
                this.field_n[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; this.field_h > var10Lifetime1Lifetime1; var10Lifetime1Lifetime1++) {
                this.field_n[this.field_f[var10Lifetime1Lifetime1]] = var17.c(true);
              }
              this.field_e = new bf(this.field_n);
            }
            for (var10Lifetime2 = 0; var10Lifetime2 < this.field_h; var10Lifetime2++) {
              this.field_b[this.field_f[var10Lifetime2]] = var17.c(true);
            }
            if (var7 == 0) {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_h; var10Lifetime3++) {
                this.field_c[this.field_f[var10Lifetime3]] = var17.c(true);
              }
            } else {
              for (var10Lifetime3 = 0; this.field_h > var10Lifetime3; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(var21, 64, 0, (byte) -109);
                this.field_a[this.field_f[var10Lifetime3]] = var21;
              }
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_h; var10Lifetime3++) {
                this.field_c[this.field_f[var10Lifetime3]] = var17.c(true);
              }
            }
            if (var4 >= 7) {
              for (var10Lifetime4 = 0; this.field_h > var10Lifetime4; var10Lifetime4++) {
                this.field_m[this.field_f[var10Lifetime4]] = var17.f(0);
              }
              for (var10Lifetime4 = 0; var10Lifetime4 < this.field_h; var10Lifetime4++) {
                var11 = this.field_f[var10Lifetime4];
                var8Lifetime1 = 0;
                var12 = this.field_m[var11];
                var13 = -1;
                array$2 = new int[var12];
                this.field_s[var11] = array$2;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.f(0);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_s[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_r[var11] = 1 + var13;
                if (1 + var13 == var12) {
                  this.field_s[var11] = null;
                }
              }
            } else {
              for (var10Lifetime4 = 0; var10Lifetime4 < this.field_h; var10Lifetime4++) {
                this.field_m[this.field_f[var10Lifetime4]] = var17.a(255);
              }
              for (var10Lifetime4 = 0; this.field_h > var10Lifetime4; var10Lifetime4++) {
                var11 = this.field_f[var10Lifetime4];
                var12 = this.field_m[var11];
                var8Lifetime1 = 0;
                array$5 = new int[var12];
                this.field_s[var11] = array$5;
                var13 = -1;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.a(255);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_s[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_r[var11] = 1 + var13;
                if (var12 == 1 + var13) {
                  this.field_s[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_o = new int[var9 + 1][];
              this.field_q = new bf[1 + var9];
              for (var10Lifetime5 = 0; this.field_h > var10Lifetime5; var10Lifetime5++) {
                var11Lifetime1 = this.field_f[var10Lifetime5];
                var12Lifetime1 = this.field_m[var11Lifetime1];
                array$8 = new int[this.field_r[var11Lifetime1]];
                this.field_o[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; var13Lifetime1 < this.field_r[var11Lifetime1]; var13Lifetime1++) {
                  this.field_o[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (this.field_s[var11Lifetime1] == null) {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  } else {
                    var14Lifetime1 = this.field_s[var11Lifetime1][var13Lifetime1Lifetime1];
                  }
                  this.field_o[var11Lifetime1][var14Lifetime1] = var17.c(true);
                }
                this.field_q[var11Lifetime1] = new bf(this.field_o[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_105_0 = var3;
          stackIn_105_1 = new StringBuilder().append("sg.C(");
          if (param0 == null) {
            stackIn_106_2 = "null";
          } else {
            stackIn_106_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_105_0), ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 > -67) {
          return;
        }
        field_k = null;
        field_i = null;
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param2 < 12) {
          return false;
        }
        return (param1 & 2048) != 0 ? true : false;
    }

    sg(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_p = am.a(param0.length, param0, (byte) 18);
          if (this.field_p != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (64 != param2.length) {
              throw new RuntimeException();
            }
            this.field_g = gn.a(param0, (byte) -110, 0, param0.length);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (param2[var4_int] != this.field_g[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(param0, (byte) -56);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "sg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Loading instruments";
        field_k = "Passwords must be between 5 and 20 characters long";
    }
}
