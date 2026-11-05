/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    private int[] field_g;
    int[] field_u;
    int[] field_r;
    static int field_l;
    int[] field_n;
    int field_i;
    byte[][] field_o;
    static int[] field_c;
    int field_t;
    static int[] field_e;
    static String field_q;
    private byte[] field_b;
    private int[][] field_m;
    int field_p;
    static int field_a;
    int[][] field_h;
    int[] field_v;
    private int field_s;
    fl[] field_k;
    static int field_d;
    fl field_j;
    int[] field_f;

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        if (param0 < 115) {
          field_c = (int[]) null;
        }
        field_q = null;
    }

    private final void a(byte[] param0, int param1) {
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
        ni var17 = null;
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
        var16 = fleas.field_A ? 1 : 0;
        try {
          var17 = new ni(qi.a(param0, -22518));
          var4 = var17.e(false);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (var4 >= 6) {
              this.field_t = var17.c((byte) 126);
            } else {
              this.field_t = 0;
            }
            var5 = var17.e(false);
            stackIn_11_0 = ((var5 & 1) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            stackIn_14_0 = ((var5 & 2) == 0) ? 0 : 1;
            var7 = stackIn_14_0;
            if (var4 >= 7) {
              this.field_s = var17.e((byte) 120);
            } else {
              this.field_s = var17.d((byte) -79);
            }
            var8 = 0;
            var9 = -1;
            this.field_r = new int[this.field_s];
            if (var4 < 7) {
              for (var10 = 0; this.field_s > var10; var10++) {
                dupTemp$0 = var8 + var17.d((byte) -62);
                var8 = dupTemp$0;
                this.field_r[var10] = dupTemp$0;
                if (this.field_r[var10] > var9) {
                  var9 = this.field_r[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.field_s; var10++) {
                dupTemp$1 = var8 + var17.e((byte) 63);
                var8 = dupTemp$1;
                this.field_r[var10] = dupTemp$1;
                if (var9 < this.field_r[var10]) {
                  var9 = this.field_r[var10];
                }
              }
            }
            this.field_i = 1 + var9;
            this.field_h = new int[this.field_i][];
            this.field_n = new int[this.field_i];
            this.field_u = new int[this.field_i];
            this.field_v = new int[this.field_i];
            this.field_f = new int[this.field_i];
            if (var7 != 0) {
              this.field_o = new byte[this.field_i][];
            }
            if (var6 != 0) {
              this.field_g = new int[this.field_i];
              for (var10Lifetime1 = 0; var10Lifetime1 < this.field_i; var10Lifetime1++) {
                this.field_g[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_s; var10Lifetime1Lifetime1++) {
                this.field_g[this.field_r[var10Lifetime1Lifetime1]] = var17.c((byte) -82);
              }
              this.field_j = new fl(this.field_g);
            }
            for (var10Lifetime2 = 0; var10Lifetime2 < this.field_s; var10Lifetime2++) {
              this.field_u[this.field_r[var10Lifetime2]] = var17.c((byte) 125);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_s; var10Lifetime3++) {
                var21 = new byte[64];
                var17.b(var21, 0, -58, 64);
                this.field_o[this.field_r[var10Lifetime3]] = var21;
              }
            }
            for (var10Lifetime4 = 0; this.field_s > var10Lifetime4; var10Lifetime4++) {
              this.field_n[this.field_r[var10Lifetime4]] = var17.c((byte) -1);
            }
            if (param1 != 19083) {
              rf.a((byte) -112);
            }
            if (var4 >= 7) {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_s; var10Lifetime5++) {
                this.field_f[this.field_r[var10Lifetime5]] = var17.e((byte) 86);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_s; var10Lifetime5++) {
                var11 = this.field_r[var10Lifetime5];
                var12 = this.field_f[var11];
                var8Lifetime1 = 0;
                var13 = -1;
                array$2 = new int[var12];
                this.field_h[var11] = array$2;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.e((byte) 111);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_h[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_v[var11] = 1 + var13;
                if (var12 == 1 + var13) {
                  this.field_h[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_s; var10Lifetime5++) {
                this.field_f[this.field_r[var10Lifetime5]] = var17.d((byte) 113);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_s; var10Lifetime5++) {
                var11 = this.field_r[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_f[var11];
                array$5 = new int[var12];
                this.field_h[var11] = array$5;
                var13 = -1;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.d((byte) 122);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_h[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_v[var11] = var13 + 1;
                if (var12 == var13 + 1) {
                  this.field_h[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_m = new int[var9 + 1][];
              this.field_k = new fl[1 + var9];
              for (var10Lifetime6 = 0; this.field_s > var10Lifetime6; var10Lifetime6++) {
                var11Lifetime1 = this.field_r[var10Lifetime6];
                var12Lifetime1 = this.field_f[var11Lifetime1];
                array$8 = new int[this.field_v[var11Lifetime1]];
                this.field_m[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_v[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_m[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var12Lifetime1 > var13Lifetime1Lifetime1; var13Lifetime1Lifetime1++) {
                  if (this.field_h[var11Lifetime1] != null) {
                    var14Lifetime1 = this.field_h[var11Lifetime1][var13Lifetime1Lifetime1];
                  } else {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  }
                  this.field_m[var11Lifetime1][var14Lifetime1] = var17.c((byte) 124);
                }
                this.field_k[var11Lifetime1] = new fl(this.field_m[var11Lifetime1]);
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
          stackIn_103_1 = new StringBuilder().append("rf.B(");
          if (param0 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',').append(param1).append(')').toString());
        }
    }

    rf(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_p = ia.a(true, param0, param0.length);
          if (this.field_p != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_b = kb.a(param0, param0.length, (byte) 111, 0);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_b[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(param0, 19083);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "rf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new int[40];
        field_q = "Unfortunately we are unable to create an account for you at this time.";
        field_a = -1;
        field_c = new int[]{1, 2, 3, 10, 2, 1, 1, 2, 3, 3, 2, 2, 2, 3, 5, 10};
        field_d = 5;
    }
}
