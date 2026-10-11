/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km {
    static pg[] field_q;
    int field_j;
    bc[] field_f;
    static String[] field_c;
    int[] field_o;
    int field_i;
    static String field_m;
    int[] field_b;
    private int field_s;
    private byte[] field_a;
    int[] field_h;
    private int[][] field_n;
    int field_t;
    byte[][] field_p;
    int[] field_k;
    int[] field_d;
    int[][] field_r;
    private int[] field_l;
    static int field_e;
    bc field_g;

    public static void a(byte param0) {
        field_q = null;
        field_c = null;
        if (param0 != 13) {
          field_e = 1;
        }
        field_m = null;
    }

    final static bg a(int param0) {
        if (param0 < 111) {
          km.a((byte) 11);
        }
        bg var1 = new bg(ah.field_A, sb.field_j, ha.field_s[0], hj.field_K[0], sb.field_m[0], rf.field_p[0], qc.field_b[0], wb.field_a);
        mj.a((byte) 79);
        return var1;
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
        byte[] var17 = null;
        dh var18 = null;
        byte[] var22 = null;
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
        var16 = Terraphoenix.field_V;
        try {
          var18 = new dh(qg.a(-1, param1));
          var4 = var18.a(-16384);
          if (5 <= var4 &&
            var4 <= 7) {
            if (6 <= var4) {
              this.field_t = var18.f((byte) -107);
            } else {
              this.field_t = 0;
            }
            var5 = var18.a(-16384);
            stackIn_11_0 = (0 == (var5 & 1)) ? 0 : 1;
            var6 = stackIn_11_0;
            if (var4 < 7) {
              this.field_s = var18.i(-25578);
            } else {
              this.field_s = var18.d(-10355);
            }
            stackIn_17_0 = (0 == (var5 & 2)) ? 0 : 1;
            var7 = stackIn_17_0;
            var8 = 0;
            this.field_b = new int[this.field_s];
            var9 = -1;
            if (7 <= var4) {
              for (var10 = 0; var10 < this.field_s; var10++) {
                dupTemp$0 = var8 + var18.d(-10355);
                var8 = dupTemp$0;
                this.field_b[var10] = dupTemp$0;
                if (var9 < this.field_b[var10]) {
                  var9 = this.field_b[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.field_s; var10++) {
                dupTemp$1 = var8 + var18.i(-25578);
                var8 = dupTemp$1;
                this.field_b[var10] = dupTemp$1;
                if (this.field_b[var10] > var9) {
                  var9 = this.field_b[var10];
                }
              }
            }
            this.field_j = 1 + var9;
            this.field_h = new int[this.field_j];
            if (var7 != 0) {
              this.field_p = new byte[this.field_j][];
            }
            this.field_r = new int[this.field_j][];
            this.field_d = new int[this.field_j];
            this.field_o = new int[this.field_j];
            this.field_k = new int[this.field_j];
            if (var6 != 0) {
              this.field_l = new int[this.field_j];
              for (var10Lifetime1 = 0; this.field_j > var10Lifetime1; var10Lifetime1++) {
                this.field_l[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; this.field_s > var10Lifetime1Lifetime1; var10Lifetime1Lifetime1++) {
                this.field_l[this.field_b[var10Lifetime1Lifetime1]] = var18.f((byte) -107);
              }
              this.field_g = new bc(this.field_l);
            }
            for (var10Lifetime2 = 0; this.field_s > var10Lifetime2; var10Lifetime2++) {
              this.field_h[this.field_b[var10Lifetime2]] = var18.f((byte) -107);
            }
            if (param0 < 37) {
              var17 = (byte[]) null;
              this.a(107, (byte[]) null);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; this.field_s > var10Lifetime3; var10Lifetime3++) {
                var22 = new byte[64];
                var18.a(64, 0, 103, var22);
                this.field_p[this.field_b[var10Lifetime3]] = var22;
              }
            }
            for (var10Lifetime4 = 0; var10Lifetime4 < this.field_s; var10Lifetime4++) {
              this.field_o[this.field_b[var10Lifetime4]] = var18.f((byte) -107);
            }
            if (var4 >= 7) {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_s; var10Lifetime5++) {
                this.field_d[this.field_b[var10Lifetime5]] = var18.d(-10355);
              }
              for (var10Lifetime5 = 0; this.field_s > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_b[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_d[var11];
                array$2 = new int[var12];
                this.field_r[var11] = array$2;
                var13 = -1;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$3 = var8Lifetime1 + var18.d(-10355);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_r[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_k[var11] = 1 + var13;
                if (var12 == 1 + var13) {
                  this.field_r[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; this.field_s > var10Lifetime5; var10Lifetime5++) {
                this.field_d[this.field_b[var10Lifetime5]] = var18.i(-25578);
              }
              for (var10Lifetime5 = 0; this.field_s > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_b[var10Lifetime5];
                var12 = this.field_d[var11];
                var8Lifetime1 = 0;
                var13 = -1;
                array$5 = new int[var12];
                this.field_r[var11] = array$5;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$6 = var8Lifetime1 + var18.i(-25578);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_r[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_k[var11] = 1 + var13;
                if (1 + var13 == var12) {
                  this.field_r[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_n = new int[1 + var9][];
              this.field_f = new bc[1 + var9];
              for (var10Lifetime6 = 0; this.field_s > var10Lifetime6; var10Lifetime6++) {
                var11Lifetime1 = this.field_b[var10Lifetime6];
                var12Lifetime1 = this.field_d[var11Lifetime1];
                array$8 = new int[this.field_k[var11Lifetime1]];
                this.field_n[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; var13Lifetime1 < this.field_k[var11Lifetime1]; var13Lifetime1++) {
                  this.field_n[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (this.field_r[var11Lifetime1] == null) {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  } else {
                    var14Lifetime1 = this.field_r[var11Lifetime1][var13Lifetime1Lifetime1];
                  }
                  this.field_n[var11Lifetime1][var14Lifetime1] = var18.f((byte) -107);
                }
                this.field_f[var11Lifetime1] = new bc(this.field_n[var11Lifetime1]);
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
          stackIn_99_1 = new StringBuilder().append("km.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_100_2 = "null";
          } else {
            stackIn_100_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_99_0), ((StringBuilder) (Object) stackIn_99_1).append(stackIn_100_2).append(')').toString());
        }
    }

    km(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_i = j.a(0, param0.length, param0);
          if (this.field_i != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_a = tg.a(param0, param0.length, 0, 8);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (param2[var4_int] != this.field_a[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(94, param0);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "km.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Names should contain a maximum of 12 characters";
        field_q = new pg[10];
        field_e = 1600;
    }
}
