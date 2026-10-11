/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    private int[] field_i;
    private int field_h;
    int field_l;
    qg[] field_j;
    int[] field_o;
    int[][] field_a;
    int[] field_f;
    static String field_p;
    private byte[] field_c;
    int field_d;
    int[] field_b;
    qg field_e;
    byte[][] field_q;
    static int field_g;
    int field_m;
    int[] field_s;
    int[] field_r;
    static String field_n;
    private int[][] field_k;

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
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
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
        gb var17 = null;
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
        var16 = SolKnight.field_L ? 1 : 0;
        try {
          var17 = new gb(jh.a(param1, 6));
          var4 = var17.j(255);
          if (5 <= var4 &&
            var4 <= 7) {
            if (var4 < 6) {
              this.field_m = 0;
            } else {
              this.field_m = var17.e(true);
            }
            var5 = var17.j(255);
            stackIn_11_0 = ((1 & var5) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            stackIn_14_0 = ((2 & var5) == 0) ? 0 : 1;
            var7 = stackIn_14_0;
            if (var4 < 7) {
              this.field_h = var17.i(-107);
            } else {
              this.field_h = var17.e(6715);
            }
            var8 = 0;
            this.field_f = new int[this.field_h];
            var9 = -1;
            if (var4 >= 7) {
              for (var10 = 0; var10 < this.field_h; var10++) {
                dupTemp$0 = var8 + var17.e(6715);
                var8 = dupTemp$0;
                this.field_f[var10] = dupTemp$0;
                if (var9 < this.field_f[var10]) {
                  var9 = this.field_f[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.field_h; var10++) {
                dupTemp$1 = var8 + var17.i(-126);
                var8 = dupTemp$1;
                this.field_f[var10] = dupTemp$1;
                if (var9 < this.field_f[var10]) {
                  var9 = this.field_f[var10];
                }
              }
            }
            this.field_l = var9 + 1;
            this.field_a = new int[this.field_l][];
            this.field_b = new int[this.field_l];
            if (param0 >= -73) {
              return;
            }
            this.field_s = new int[this.field_l];
            this.field_r = new int[this.field_l];
            this.field_o = new int[this.field_l];
            if (var7 != 0) {
              this.field_q = new byte[this.field_l][];
            }
            if (var6 != 0) {
              this.field_i = new int[this.field_l];
              for (var10Lifetime1 = 0; this.field_l > var10Lifetime1; var10Lifetime1++) {
                this.field_i[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_h; var10Lifetime1Lifetime1++) {
                this.field_i[this.field_f[var10Lifetime1Lifetime1]] = var17.e(true);
              }
              this.field_e = new qg(this.field_i);
            }
            for (var10Lifetime2 = 0; var10Lifetime2 < this.field_h; var10Lifetime2++) {
              this.field_b[this.field_f[var10Lifetime2]] = var17.e(true);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; this.field_h > var10Lifetime3; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(64, 0, -111, var21);
                this.field_q[this.field_f[var10Lifetime3]] = var21;
              }
            }
            for (var10Lifetime4 = 0; this.field_h > var10Lifetime4; var10Lifetime4++) {
              this.field_s[this.field_f[var10Lifetime4]] = var17.e(true);
            }
            if (7 > var4) {
              for (var10Lifetime5 = 0; this.field_h > var10Lifetime5; var10Lifetime5++) {
                this.field_r[this.field_f[var10Lifetime5]] = var17.i(46);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_h; var10Lifetime5++) {
                var11 = this.field_f[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_r[var11];
                var13 = -1;
                array$2 = new int[var12];
                this.field_a[var11] = array$2;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.i(-118);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_a[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_o[var11] = var13 + 1;
                if (var13 + 1 == var12) {
                  this.field_a[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; this.field_h > var10Lifetime5; var10Lifetime5++) {
                this.field_r[this.field_f[var10Lifetime5]] = var17.e(6715);
              }
              for (var10Lifetime5 = 0; this.field_h > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_f[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_r[var11];
                var13 = -1;
                array$5 = new int[var12];
                this.field_a[var11] = array$5;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.e(6715);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_a[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_o[var11] = var13 + 1;
                if (1 + var13 == var12) {
                  this.field_a[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_j = new qg[var9 + 1];
              this.field_k = new int[var9 + 1][];
              for (var10Lifetime6 = 0; var10Lifetime6 < this.field_h; var10Lifetime6++) {
                var11Lifetime1 = this.field_f[var10Lifetime6];
                var12Lifetime1 = this.field_r[var11Lifetime1];
                array$8 = new int[this.field_o[var11Lifetime1]];
                this.field_k[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; var13Lifetime1 < this.field_o[var11Lifetime1]; var13Lifetime1++) {
                  this.field_k[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var12Lifetime1 > var13Lifetime1Lifetime1; var13Lifetime1Lifetime1++) {
                  if (null == this.field_a[var11Lifetime1]) {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  } else {
                    var14Lifetime1 = this.field_a[var11Lifetime1][var13Lifetime1Lifetime1];
                  }
                  this.field_k[var11Lifetime1][var14Lifetime1] = var17.e(true);
                }
                this.field_j[var11Lifetime1] = new qg(this.field_k[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_100_0 = var3;
          stackIn_100_1 = new StringBuilder().append("ha.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(')').toString());
        }
    }

    final static void a(gg param0, byte param1, gg param2) {
        if (param0.field_a != null) {
          param0.c(10);
        }
        param0.field_d = param2;
        param0.field_a = param2.field_a;
        param0.field_a.field_d = param0;
        if (param1 <= 15) {
          return;
        }
        try {
          param0.field_d.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "ha.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_p = null;
        if (param0 != 0) {
          field_n = (String) null;
        }
    }

    final static o[] a(int param0, int param1) {
        int var3 = 115 / ((param1 - 7) / 63);
        o[] var4 = new o[9];
        o[] var2 = var4;
        var4[4] = ib.a(64, true, param0);
        return var2;
    }

    ha(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_d = gl.a(param0.length, param0, 119);
          if (this.field_d != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (64 != param2.length) {
              throw new RuntimeException();
            }
            this.field_c = q.a(param0.length, 0, 89, param0);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_c[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a((byte) -88, param0);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "ha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = "Score: <%0>";
        field_n = "to keep fullscreen or";
    }
}
