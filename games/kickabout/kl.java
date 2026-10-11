/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    int field_g;
    int[] field_i;
    lf field_q;
    static boolean field_t;
    byte[][] field_k;
    private byte[] field_o;
    private int[] field_l;
    int field_d;
    int field_p;
    static wn field_a;
    int[] field_e;
    static ot field_m;
    static kh field_h;
    int[] field_b;
    int[] field_c;
    int[][] field_r;
    int[] field_f;
    private int field_n;
    private int[][] field_j;
    lf[] field_s;

    final static boolean b(int param0) {
        boolean stackIn_9_0 = false;
        if (param0 != 640) {
          return false;
        }
        stackIn_9_0 = !(wt.field_x >= 0) || !(640 > wt.field_x) || !(us.field_j >= 0) || !(g.field_a.field_T >= us.field_j);
        return stackIn_9_0;
    }

    public static void a(int param0) {
        field_h = null;
        field_a = null;
        if (param0 != 0) {
          return;
        }
        field_m = null;
    }

    final static void c(int param0) {
        int fieldTemp$0 = va.field_J + 1;
        va.field_J = va.field_J + 1;
        if (32 <= fieldTemp$0) {
          va.field_J = 0;
        }
        int var1 = -125 / ((param0 - 27) / 54);
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
        int var17 = 0;
        iw var18 = null;
        byte[] var22 = null;
        int var8Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var14Lifetime1;
        int var15Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var11Lifetime5;
        int var14Lifetime1Lifetime1;
        var17 = Kickabout.field_G;
        try {
          var18 = new iw(hh.a(param1, (byte) -3));
          var4 = var18.h((byte) -107);
          if (5 <= var4 &&
            var4 <= 7) {
            if (var4 < 6) {
              this.field_p = 0;
            } else {
              this.field_p = var18.k(4);
            }
            var5 = var18.h((byte) -116);
            stackIn_11_0 = ((1 & var5) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            if (var4 >= 7) {
              this.field_n = var18.f((byte) 117);
            } else {
              this.field_n = var18.a((byte) 81);
            }
            stackIn_17_0 = ((2 & var5) == 0) ? 0 : 1;
            var7 = stackIn_17_0;
            var8 = 0;
            var9 = -1;
            this.field_b = new int[this.field_n];
            if (var4 < 7) {
              for (var10 = 0; this.field_n > var10; var10++) {
                dupTemp$0 = var8 + var18.a((byte) 81);
                var8 = dupTemp$0;
                this.field_b[var10] = dupTemp$0;
                if (this.field_b[var10] > var9) {
                  var9 = this.field_b[var10];
                }
              }
            } else {
              for (var10 = 0; this.field_n > var10; var10++) {
                dupTemp$1 = var8 + var18.f((byte) -27);
                var8 = dupTemp$1;
                this.field_b[var10] = dupTemp$1;
                if (this.field_b[var10] > var9) {
                  var9 = this.field_b[var10];
                }
              }
            }
            this.field_d = var9 + 1;
            if (var7 != 0) {
              this.field_k = new byte[this.field_d][];
            }
            this.field_r = new int[this.field_d][];
            this.field_i = new int[this.field_d];
            this.field_c = new int[this.field_d];
            this.field_e = new int[this.field_d];
            var10Lifetime1 = 48 / ((param0 + 40) / 37);
            this.field_f = new int[this.field_d];
            if (var6 != 0) {
              this.field_l = new int[this.field_d];
              for (var11 = 0; this.field_d > var11; var11++) {
                this.field_l[var11] = -1;
              }
              for (var11Lifetime5 = 0; var11Lifetime5 < this.field_n; var11Lifetime5++) {
                this.field_l[this.field_b[var11Lifetime5]] = var18.k(4);
              }
              this.field_q = new lf(this.field_l);
            }
            for (var11Lifetime1 = 0; var11Lifetime1 < this.field_n; var11Lifetime1++) {
              this.field_c[this.field_b[var11Lifetime1]] = var18.k(4);
            }
            if (var7 == 0) {
              for (var11Lifetime2 = 0; var11Lifetime2 < this.field_n; var11Lifetime2++) {
                this.field_f[this.field_b[var11Lifetime2]] = var18.k(4);
              }
            } else {
              for (var11Lifetime2 = 0; var11Lifetime2 < this.field_n; var11Lifetime2++) {
                var22 = new byte[64];
                var18.a(var22, 0, (byte) -6, 64);
                this.field_k[this.field_b[var11Lifetime2]] = var22;
              }
              for (var11Lifetime2 = 0; var11Lifetime2 < this.field_n; var11Lifetime2++) {
                this.field_f[this.field_b[var11Lifetime2]] = var18.k(4);
              }
            }
            if (var4 >= 7) {
              for (var11Lifetime3 = 0; this.field_n > var11Lifetime3; var11Lifetime3++) {
                this.field_i[this.field_b[var11Lifetime3]] = var18.f((byte) -104);
              }
              for (var11Lifetime3 = 0; var11Lifetime3 < this.field_n; var11Lifetime3++) {
                var12 = this.field_b[var11Lifetime3];
                var8Lifetime1 = 0;
                var13 = this.field_i[var12];
                array$2 = new int[var13];
                this.field_r[var12] = array$2;
                var14 = -1;
                for (var15 = 0; var15 < var13; var15++) {
                  dupTemp$3 = var8Lifetime1 + var18.f((byte) -96);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_r[var12];
                  dupTemp$4[var15] = dupTemp$3;
                  var16 = dupTemp$3;
                  if (var14 < var16) {
                    var14 = var16;
                  }
                }
                this.field_e[var12] = var14 + 1;
                if (var14 + 1 == var13) {
                  this.field_r[var12] = null;
                }
              }
            } else {
              for (var11Lifetime3 = 0; this.field_n > var11Lifetime3; var11Lifetime3++) {
                this.field_i[this.field_b[var11Lifetime3]] = var18.a((byte) 81);
              }
              for (var11Lifetime3 = 0; this.field_n > var11Lifetime3; var11Lifetime3++) {
                var12 = this.field_b[var11Lifetime3];
                var8Lifetime1 = 0;
                var13 = this.field_i[var12];
                array$5 = new int[var13];
                this.field_r[var12] = array$5;
                var14 = -1;
                for (var15 = 0; var15 < var13; var15++) {
                  dupTemp$6 = var8Lifetime1 + var18.a((byte) 81);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_r[var12];
                  dupTemp$7[var15] = dupTemp$6;
                  var16 = dupTemp$6;
                  if (var16 > var14) {
                    var14 = var16;
                  }
                }
                this.field_e[var12] = var14 + 1;
                if (var14 + 1 == var13) {
                  this.field_r[var12] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_s = new lf[var9 + 1];
              this.field_j = new int[1 + var9][];
              for (var11Lifetime4 = 0; this.field_n > var11Lifetime4; var11Lifetime4++) {
                var12Lifetime1 = this.field_b[var11Lifetime4];
                var13Lifetime1 = this.field_i[var12Lifetime1];
                array$8 = new int[this.field_e[var12Lifetime1]];
                this.field_j[var12Lifetime1] = array$8;
                for (var14Lifetime1 = 0; var14Lifetime1 < this.field_e[var12Lifetime1]; var14Lifetime1++) {
                  this.field_j[var12Lifetime1][var14Lifetime1] = -1;
                }
                for (var14Lifetime1Lifetime1 = 0; var13Lifetime1 > var14Lifetime1Lifetime1; var14Lifetime1Lifetime1++) {
                  if (this.field_r[var12Lifetime1] != null) {
                    var15Lifetime1 = this.field_r[var12Lifetime1][var14Lifetime1Lifetime1];
                  } else {
                    var15Lifetime1 = var14Lifetime1Lifetime1;
                  }
                  this.field_j[var12Lifetime1][var15Lifetime1] = var18.k(4);
                }
                this.field_s[var12Lifetime1] = new lf(this.field_j[var12Lifetime1]);
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
          stackIn_102_1 = new StringBuilder().append("kl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_103_2 = "null";
          } else {
            stackIn_103_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_102_0), ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(')').toString());
        }
    }

    kl(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_g = er.a(false, param0.length, param0);
          if (this.field_g != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_o = jj.a(param0.length, param0, (byte) 91, 0);
            for (var4_int = 0; 64 > var4_int; var4_int++) {
              if (param2[var4_int] != this.field_o[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(26, param0);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "kl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = null;
        field_t = true;
    }
}
