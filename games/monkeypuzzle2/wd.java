/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    int[][] field_a;
    int[] field_m;
    int[] field_r;
    ie[] field_t;
    private byte[] field_c;
    int[] field_p;
    private int[] field_q;
    int field_e;
    static boolean field_g;
    int[] field_f;
    static pj field_h;
    int field_d;
    private int field_k;
    byte[][] field_n;
    int[] field_j;
    static ud field_i;
    int field_l;
    private int[][] field_o;
    ie field_b;
    static String field_s;

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
        gk var17 = null;
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
        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var17 = new gk(rc.a(param1, 115));
          var4 = var17.a((byte) 114);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (var4 >= 6) {
              this.field_l = var17.e(param0 ^ 16076);
            } else {
              this.field_l = 0;
            }
            var5 = var17.a((byte) 114);
            stackIn_11_0 = ((var5 & 1) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            if (7 > var4) {
              this.field_k = var17.j(17277);
            } else {
              this.field_k = var17.m(param0 - 41191);
            }
            stackIn_17_0 = ((var5 & 2) == 0) ? 0 : 1;
            var7 = stackIn_17_0;
            if (param0 != 16050) {
              this.field_j = (int[]) null;
            }
            var8 = 0;
            this.field_f = new int[this.field_k];
            var9 = -1;
            if (7 <= var4) {
              for (var10 = 0; var10 < this.field_k; var10++) {
                dupTemp$0 = var8 + var17.m(gi.a(param0, -23687));
                var8 = dupTemp$0;
                this.field_f[var10] = dupTemp$0;
                if (this.field_f[var10] > var9) {
                  var9 = this.field_f[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.field_k; var10++) {
                dupTemp$1 = var8 + var17.j(gi.a(param0, 32207));
                var8 = dupTemp$1;
                this.field_f[var10] = dupTemp$1;
                if (this.field_f[var10] > var9) {
                  var9 = this.field_f[var10];
                }
              }
            }
            this.field_e = 1 + var9;
            if (var7 != 0) {
              this.field_n = new byte[this.field_e][];
            }
            this.field_j = new int[this.field_e];
            this.field_r = new int[this.field_e];
            this.field_m = new int[this.field_e];
            this.field_p = new int[this.field_e];
            this.field_a = new int[this.field_e][];
            if (var6 != 0) {
              this.field_q = new int[this.field_e];
              for (var10Lifetime1 = 0; var10Lifetime1 < this.field_e; var10Lifetime1++) {
                this.field_q[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_k; var10Lifetime1Lifetime1++) {
                this.field_q[this.field_f[var10Lifetime1Lifetime1]] = var17.e(127);
              }
              this.field_b = new ie(this.field_q);
            }
            for (var10Lifetime2 = 0; var10Lifetime2 < this.field_k; var10Lifetime2++) {
              this.field_j[this.field_f[var10Lifetime2]] = var17.e(-36);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; this.field_k > var10Lifetime3; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(var21, 64, -91, 0);
                this.field_n[this.field_f[var10Lifetime3]] = var21;
              }
            }
            for (var10Lifetime4 = 0; var10Lifetime4 < this.field_k; var10Lifetime4++) {
              this.field_p[this.field_f[var10Lifetime4]] = var17.e(-31);
            }
            if (7 <= var4) {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_k; var10Lifetime5++) {
                this.field_m[this.field_f[var10Lifetime5]] = var17.m(-25141);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_k; var10Lifetime5++) {
                var11 = this.field_f[var10Lifetime5];
                var12 = this.field_m[var11];
                var8Lifetime1 = 0;
                var13 = -1;
                array$2 = new int[var12];
                this.field_a[var11] = array$2;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.m(-25141);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_a[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_r[var11] = var13 + 1;
                if (var13 + 1 == var12) {
                  this.field_a[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; this.field_k > var10Lifetime5; var10Lifetime5++) {
                this.field_m[this.field_f[var10Lifetime5]] = var17.j(param0 + 1227);
              }
              for (var10Lifetime5 = 0; this.field_k > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_f[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_m[var11];
                array$5 = new int[var12];
                this.field_a[var11] = array$5;
                var13 = -1;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.j(17277);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_a[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_r[var11] = 1 + var13;
                if (var13 + 1 == var12) {
                  this.field_a[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_o = new int[1 + var9][];
              this.field_t = new ie[var9 + 1];
              for (var10Lifetime6 = 0; var10Lifetime6 < this.field_k; var10Lifetime6++) {
                var11Lifetime1 = this.field_f[var10Lifetime6];
                var12Lifetime1 = this.field_m[var11Lifetime1];
                array$8 = new int[this.field_r[var11Lifetime1]];
                this.field_o[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_r[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_o[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (null != this.field_a[var11Lifetime1]) {
                    var14Lifetime1 = this.field_a[var11Lifetime1][var13Lifetime1Lifetime1];
                  } else {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  }
                  this.field_o[var11Lifetime1][var14Lifetime1] = var17.e(-99);
                }
                this.field_t[var11Lifetime1] = new ie(this.field_o[var11Lifetime1]);
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
          stackIn_100_1 = new StringBuilder().append("wd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        field_h = null;
        field_i = null;
        field_s = null;
    }

    final static void a(int param0, boolean param1) {
        ug var2 = null;
        int var3 = 0;
        mk var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var4 = (mk) (eb.field_C.a((byte) -117));
          while (var4 != null) {
            fc.a(var4, (byte) 108, param0);
            var4 = (mk) (eb.field_C.d((byte) 63));
          }
          if (!param1) {
            field_i = (ud) null;
          }
          var2 = t.field_v.a((byte) -117);
          while (var2 != null) {
            lf.a(25197, param0);
            var2 = t.field_v.d((byte) 63);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2_ref), "wd.C(" + param0 + ',' + param1 + ')');
        }
    }

    wd(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_d = w.a(param0.length, param0, -18694);
          if (param1 != this.field_d) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_c = ie.a(-106, param0, param0.length, 0);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (param2[var4_int] != this.field_c[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(16050, param0);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "wd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = false;
        field_h = new pj();
        field_s = "Create your own free Jagex account";
    }
}
