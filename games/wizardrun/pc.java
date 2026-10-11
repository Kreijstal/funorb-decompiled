/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    private int field_e;
    int[] field_q;
    oe field_h;
    int[] field_t;
    private byte[] field_b;
    static sd field_v;
    int[] field_n;
    private int[][] field_g;
    int[] field_p;
    static String field_r;
    oe[] field_x;
    int[] field_c;
    static String field_o;
    byte[][] field_j;
    private int[] field_u;
    int field_i;
    int field_s;
    int field_f;
    int[][] field_w;
    static bh field_a;
    static long[] field_k;
    static sd field_m;
    static oi field_l;
    static c field_d;

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
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_98_2 = null;
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
        va var17 = null;
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
        var16 = wizardrun.field_H;
        try {
          var17 = new va(dg.a(param0, 31027));
          var4 = var17.f(param1 + 255);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (var4 >= 6) {
              this.field_f = var17.i(255);
            } else {
              this.field_f = 0;
            }
            var5 = var17.f(param1 ^ 255);
            stackIn_11_0 = ((1 & var5) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            stackIn_14_0 = ((2 & var5) == param1) ? 0 : 1;
            var7 = stackIn_14_0;
            if (var4 >= 7) {
              this.field_e = var17.a((byte) -88);
            } else {
              this.field_e = var17.j(param1 - 14477);
            }
            var8 = 0;
            this.field_c = new int[this.field_e];
            var9 = -1;
            if (var4 >= 7) {
              for (var10 = 0; var10 < this.field_e; var10++) {
                dupTemp$0 = var8 + var17.a((byte) -88);
                var8 = dupTemp$0;
                this.field_c[var10] = dupTemp$0;
                if (var9 < this.field_c[var10]) {
                  var9 = this.field_c[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.field_e; var10++) {
                dupTemp$1 = var8 + var17.j(-14477);
                var8 = dupTemp$1;
                this.field_c[var10] = dupTemp$1;
                if (var9 < this.field_c[var10]) {
                  var9 = this.field_c[var10];
                }
              }
            }
            this.field_s = var9 + 1;
            this.field_p = new int[this.field_s];
            if (var7 != 0) {
              this.field_j = new byte[this.field_s][];
            }
            this.field_n = new int[this.field_s];
            this.field_t = new int[this.field_s];
            this.field_q = new int[this.field_s];
            this.field_w = new int[this.field_s][];
            if (var6 != 0) {
              this.field_u = new int[this.field_s];
              for (var10Lifetime1 = 0; this.field_s > var10Lifetime1; var10Lifetime1++) {
                this.field_u[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; this.field_e > var10Lifetime1Lifetime1; var10Lifetime1Lifetime1++) {
                this.field_u[this.field_c[var10Lifetime1Lifetime1]] = var17.i(param1 + 255);
              }
              this.field_h = new oe(this.field_u);
            }
            for (var10Lifetime2 = 0; this.field_e > var10Lifetime2; var10Lifetime2++) {
              this.field_q[this.field_c[var10Lifetime2]] = var17.i(255);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_e; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(true, 64, var21, 0);
                this.field_j[this.field_c[var10Lifetime3]] = var21;
              }
            }
            for (var10Lifetime4 = 0; var10Lifetime4 < this.field_e; var10Lifetime4++) {
              this.field_n[this.field_c[var10Lifetime4]] = var17.i(255);
            }
            if (7 <= var4) {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_e; var10Lifetime5++) {
                this.field_p[this.field_c[var10Lifetime5]] = var17.a((byte) -88);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_e; var10Lifetime5++) {
                var11 = this.field_c[var10Lifetime5];
                var12 = this.field_p[var11];
                var8Lifetime1 = 0;
                var13 = -1;
                array$2 = new int[var12];
                this.field_w[var11] = array$2;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.a((byte) -88);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_w[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_t[var11] = 1 + var13;
                if (var12 == var13 + 1) {
                  this.field_w[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_e; var10Lifetime5++) {
                this.field_p[this.field_c[var10Lifetime5]] = var17.j(-14477);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_e; var10Lifetime5++) {
                var11 = this.field_c[var10Lifetime5];
                var12 = this.field_p[var11];
                var8Lifetime1 = 0;
                array$5 = new int[var12];
                this.field_w[var11] = array$5;
                var13 = -1;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.j(-14477);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_w[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_t[var11] = 1 + var13;
                if (var12 == var13 + 1) {
                  this.field_w[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_g = new int[1 + var9][];
              this.field_x = new oe[var9 + 1];
              for (var10Lifetime6 = 0; var10Lifetime6 < this.field_e; var10Lifetime6++) {
                var11Lifetime1 = this.field_c[var10Lifetime6];
                var12Lifetime1 = this.field_p[var11Lifetime1];
                array$8 = new int[this.field_t[var11Lifetime1]];
                this.field_g[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_t[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_g[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var12Lifetime1 > var13Lifetime1Lifetime1; var13Lifetime1Lifetime1++) {
                  if (null == this.field_w[var11Lifetime1]) {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  } else {
                    var14Lifetime1 = this.field_w[var11Lifetime1][var13Lifetime1Lifetime1];
                  }
                  this.field_g[var11Lifetime1][var14Lifetime1] = var17.i(255);
                }
                this.field_x[var11Lifetime1] = new oe(this.field_g[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_97_0 = var3;
          stackIn_97_1 = new StringBuilder().append("pc.C(");
          if (param0 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_97_0), ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 1) {
          String var2 = (String) null;
          pc.a((byte) -119, (String) null, (kl) null, (String) null);
        }
        field_k = null;
        field_v = null;
        field_r = null;
        field_a = null;
        field_o = null;
        field_l = null;
        field_m = null;
        field_d = null;
    }

    final static void a(int param0) {
        if (param0 != -1) {
          field_d = (c) null;
        }
        String var2 = (String) null;
        rj.a((String) null, "", true);
    }

    pc(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_i = bi.a(param0, 10510, param0.length);
          if (this.field_i != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_b = id.a(param0, 0, param0.length, 0);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_b[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(param0, 0);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "pc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static o[] a(byte param0, String param1, kl param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        o[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.b(-1, param1);
          if (param0 < 99) {
            pc.b(61);
          }
          var5 = param2.a(var4_int, param3, -11986);
          stackIn_3_0 = r.a(var5, param2, 13469, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("pc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_o = "Updates will sent to the email address you've given";
        field_v = new sd(3);
        field_a = new bh(9, 0, 4, 1);
        field_k = new long[32];
        field_m = new sd(0);
        field_l = new oi();
    }
}
