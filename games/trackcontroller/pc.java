/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    int[] field_b;
    private int[] field_o;
    int[] field_l;
    byte[][] field_g;
    int field_p;
    static String field_t;
    oe[] field_e;
    int[][] field_r;
    int[] field_a;
    static int field_i;
    private int[][] field_c;
    private byte[] field_j;
    private int field_s;
    static int field_m;
    int[] field_f;
    oe field_q;
    int field_k;
    int field_n;
    int[] field_d;
    static boolean field_h;

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
        int stackIn_17_0 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
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
        be var17 = null;
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
        var16 = TrackController.field_F ? 1 : 0;
        try {
          var17 = new be(al.a(-128, param1));
          var4 = var17.h(16383);
          if (5 <= var4 &&
            var4 <= 7) {
            if (6 <= var4) {
              this.field_k = var17.e((byte) 113);
            } else {
              this.field_k = 0;
            }
            var5 = var17.h(16383);
            stackIn_11_0 = ((1 & var5) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            if (7 <= var4) {
              this.field_s = var17.c(false);
            } else {
              this.field_s = var17.d((byte) -78);
            }
            stackIn_17_0 = ((2 & var5) == 0) ? 0 : 1;
            var7 = stackIn_17_0;
            var8 = 0;
            if (param0 != -2) {
              return;
            }
            var9 = -1;
            this.field_f = new int[this.field_s];
            if (var4 < 7) {
              for (var10 = 0; this.field_s > var10; var10++) {
                dupTemp$0 = var8 + var17.d((byte) -62);
                var8 = dupTemp$0;
                this.field_f[var10] = dupTemp$0;
                if (this.field_f[var10] > var9) {
                  var9 = this.field_f[var10];
                }
              }
            } else {
              for (var10 = 0; this.field_s > var10; var10++) {
                dupTemp$1 = var8 + var17.c(false);
                var8 = dupTemp$1;
                this.field_f[var10] = dupTemp$1;
                if (var9 < this.field_f[var10]) {
                  var9 = this.field_f[var10];
                }
              }
            }
            this.field_n = var9 + 1;
            this.field_r = new int[this.field_n][];
            if (var7 != 0) {
              this.field_g = new byte[this.field_n][];
            }
            this.field_a = new int[this.field_n];
            this.field_b = new int[this.field_n];
            this.field_d = new int[this.field_n];
            this.field_l = new int[this.field_n];
            if (var6 != 0) {
              this.field_o = new int[this.field_n];
              for (var10Lifetime1 = 0; var10Lifetime1 < this.field_n; var10Lifetime1++) {
                this.field_o[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_s; var10Lifetime1Lifetime1++) {
                this.field_o[this.field_f[var10Lifetime1Lifetime1]] = var17.e((byte) 113);
              }
              this.field_q = new oe(this.field_o);
            }
            for (var10Lifetime2 = 0; var10Lifetime2 < this.field_s; var10Lifetime2++) {
              this.field_b[this.field_f[var10Lifetime2]] = var17.e((byte) 113);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; this.field_s > var10Lifetime3; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(89, var21, 0, 64);
                this.field_g[this.field_f[var10Lifetime3]] = var21;
              }
            }
            for (var10Lifetime4 = 0; var10Lifetime4 < this.field_s; var10Lifetime4++) {
              this.field_d[this.field_f[var10Lifetime4]] = var17.e((byte) 113);
            }
            if (var4 >= 7) {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_s; var10Lifetime5++) {
                this.field_l[this.field_f[var10Lifetime5]] = var17.c(false);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_s; var10Lifetime5++) {
                var11 = this.field_f[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_l[var11];
                array$2 = new int[var12];
                this.field_r[var11] = array$2;
                var13 = -1;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.c(false);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_r[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_a[var11] = var13 + 1;
                if (var13 + 1 == var12) {
                  this.field_r[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_s; var10Lifetime5++) {
                this.field_l[this.field_f[var10Lifetime5]] = var17.d((byte) -42);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_s; var10Lifetime5++) {
                var11 = this.field_f[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_l[var11];
                array$5 = new int[var12];
                this.field_r[var11] = array$5;
                var13 = -1;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.d((byte) -109);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_r[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_a[var11] = var13 + 1;
                if (var12 == 1 + var13) {
                  this.field_r[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_e = new oe[1 + var9];
              this.field_c = new int[1 + var9][];
              for (var10Lifetime6 = 0; this.field_s > var10Lifetime6; var10Lifetime6++) {
                var11Lifetime1 = this.field_f[var10Lifetime6];
                var12Lifetime1 = this.field_l[var11Lifetime1];
                array$8 = new int[this.field_a[var11Lifetime1]];
                this.field_c[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; var13Lifetime1 < this.field_a[var11Lifetime1]; var13Lifetime1++) {
                  this.field_c[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var12Lifetime1 > var13Lifetime1Lifetime1; var13Lifetime1Lifetime1++) {
                  if (null == this.field_r[var11Lifetime1]) {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  } else {
                    var14Lifetime1 = this.field_r[var11Lifetime1][var13Lifetime1Lifetime1];
                  }
                  this.field_c[var11Lifetime1][var14Lifetime1] = var17.e((byte) 113);
                }
                this.field_e[var11Lifetime1] = new oe(this.field_c[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_101_0 = var3;
          stackIn_101_1 = new StringBuilder().append("pc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_101_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_t = null;
    }

    pc(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_p = ql.a(0, param0, param0.length);
          if (this.field_p != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (64 != param2.length) {
              throw new RuntimeException();
            }
            this.field_j = cf.a(0, param0, param0.length, -6196);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_j[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a((byte) -2, param0);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "pc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = 0;
        field_h = false;
    }
}
