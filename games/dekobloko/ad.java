/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    private int field_w;
    byte[][] field_l;
    static int field_a;
    int[][] field_v;
    oc field_e;
    oc[] field_o;
    static ck field_d;
    int[] field_k;
    int field_m;
    int[] field_y;
    int field_n;
    int field_s;
    int[] field_f;
    static String field_b;
    private int[][] field_r;
    private int[] field_p;
    private byte[] field_h;
    static String field_A;
    int[] field_c;
    static w field_q;
    static ck[][] field_j;
    int[] field_B;
    static ck field_g;
    static String field_t;
    static int field_u;
    static int[] field_i;
    static String field_x;
    static String field_z;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_j = (ck[][]) null;
        field_i = null;
        field_A = null;
        field_z = null;
        field_x = null;
        field_q = null;
        field_g = null;
        field_t = null;
        if (param0 != -67) {
          field_g = (ck) null;
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != -1) {
          field_q = (w) null;
        }
        uf var2 = we.field_b;
        var2.f(param1, -4);
        var2.a(true, 1);
        var2.a(true, 0);
    }

    final static String a(ji param0, String param1, boolean param2, String param3) {
        RuntimeException var4 = null;
        byte[] var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0.a((byte) 121)) {
            stackIn_2_0 = (String) (param1);
            return stackIn_2_0;
          }
          if (!param2) {
            var5 = (byte[]) null;
            ad.a((byte[]) null, -41, true, 8, -58, true);
          }
          stackIn_6_0 = param3 + " - " + param0.b((byte) -89) + "%";
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ad.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(byte[] param0, int param1, boolean param2, int param3, int param4, boolean param5) {
        uf var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          var6 = we.field_b;
          var6.f(param1, -4);
          var6.field_n = var6.field_n + 1;
          var7 = var6.field_n;
          var6.a(param2, 4);
          var6.a(param2, param3);
          var8 = param4;
          if (param5) {
            var8 += 128;
          }
          var6.a(param2, var8);
          var6.a(false, param0.length, param0, 0);
          var6.b(-var7 + var6.field_n, param2);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "ad.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
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
        wl var17 = null;
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
        var16 = client.field_A ? 1 : 0;
        try {
          var17 = new wl(i.a(param0, -89));
          var4 = var17.d((byte) -114);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (var4 >= 6) {
              this.field_m = var17.i(param1 ^ 7553);
            } else {
              this.field_m = 0;
            }
            var5 = var17.d((byte) -46);
            stackIn_11_0 = ((var5 & 1) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            stackIn_14_0 = ((var5 & 2) == 0) ? 0 : 1;
            var7 = stackIn_14_0;
            if (7 <= var4) {
              this.field_w = var17.f(21663);
            } else {
              this.field_w = var17.e(param1 + 3);
            }
            var8 = 0;
            var9 = -1;
            this.field_f = new int[this.field_w];
            if (var4 < 7) {
              for (var10 = 0; this.field_w > var10; var10++) {
                dupTemp$0 = var8 + var17.e(qm.b(param1, 3));
                var8 = dupTemp$0;
                this.field_f[var10] = dupTemp$0;
                if (this.field_f[var10] > var9) {
                  var9 = this.field_f[var10];
                }
              }
            } else {
              for (var10 = 0; this.field_w > var10; var10++) {
                dupTemp$1 = var8 + var17.f(21663);
                var8 = dupTemp$1;
                this.field_f[var10] = dupTemp$1;
                if (this.field_f[var10] > var9) {
                  var9 = this.field_f[var10];
                }
              }
            }
            this.field_n = var9 + 1;
            this.field_y = new int[this.field_n];
            if (var7 != 0) {
              this.field_l = new byte[this.field_n][];
            }
            this.field_c = new int[this.field_n];
            this.field_v = new int[this.field_n][];
            this.field_B = new int[this.field_n];
            this.field_k = new int[this.field_n];
            if (var6 != 0) {
              this.field_p = new int[this.field_n];
              for (var10Lifetime1 = 0; this.field_n > var10Lifetime1; var10Lifetime1++) {
                this.field_p[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; this.field_w > var10Lifetime1Lifetime1; var10Lifetime1Lifetime1++) {
                this.field_p[this.field_f[var10Lifetime1Lifetime1]] = var17.i(param1 + 7553);
              }
              this.field_e = new oc(this.field_p);
            }
            for (var10Lifetime2 = param1; this.field_w > var10Lifetime2; var10Lifetime2++) {
              this.field_c[this.field_f[var10Lifetime2]] = var17.i(7553);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_w; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(var21, 0, (byte) 125, 64);
                this.field_l[this.field_f[var10Lifetime3]] = var21;
              }
            }
            for (var10Lifetime4 = 0; this.field_w > var10Lifetime4; var10Lifetime4++) {
              this.field_y[this.field_f[var10Lifetime4]] = var17.i(7553);
            }
            if (var4 >= 7) {
              for (var10Lifetime5 = 0; this.field_w > var10Lifetime5; var10Lifetime5++) {
                this.field_B[this.field_f[var10Lifetime5]] = var17.f(21663);
              }
              for (var10Lifetime5 = 0; this.field_w > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_f[var10Lifetime5];
                var12 = this.field_B[var11];
                var8Lifetime1 = 0;
                array$2 = new int[var12];
                this.field_v[var11] = array$2;
                var13 = -1;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.f(21663);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_v[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_k[var11] = 1 + var13;
                if (var13 + 1 == var12) {
                  this.field_v[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_w; var10Lifetime5++) {
                this.field_B[this.field_f[var10Lifetime5]] = var17.e(3);
              }
              for (var10Lifetime5 = 0; this.field_w > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_f[var10Lifetime5];
                var12 = this.field_B[var11];
                var8Lifetime1 = 0;
                var13 = -1;
                array$5 = new int[var12];
                this.field_v[var11] = array$5;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.e(3);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_v[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_k[var11] = 1 + var13;
                if (1 + var13 == var12) {
                  this.field_v[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_o = new oc[var9 + 1];
              this.field_r = new int[var9 + 1][];
              for (var10Lifetime6 = 0; this.field_w > var10Lifetime6; var10Lifetime6++) {
                var11Lifetime1 = this.field_f[var10Lifetime6];
                var12Lifetime1 = this.field_B[var11Lifetime1];
                array$8 = new int[this.field_k[var11Lifetime1]];
                this.field_r[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_k[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_r[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (null != this.field_v[var11Lifetime1]) {
                    var14Lifetime1 = this.field_v[var11Lifetime1][var13Lifetime1Lifetime1];
                  } else {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  }
                  this.field_r[var11Lifetime1][var14Lifetime1] = var17.i(qm.b(param1, 7553));
                }
                this.field_o[var11Lifetime1] = new oc(this.field_r[var11Lifetime1]);
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
          stackIn_101_1 = new StringBuilder().append("ad.D(");
          if (param0 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_101_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',').append(param1).append(')').toString());
        }
    }

    ad(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_s = tj.a(param0.length, 0, param0);
          if (this.field_s != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_h = um.a(0, param0, 0, param0.length);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (param2[var4_int] != this.field_h[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(param0, 0);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "ad.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Please enter a year between <%0> and <%1>";
        field_d = new ck(18, 18);
        field_j = new ck[8][];
        field_A = "<%0> wants to join";
        field_t = "Your email address is used to identify this account";
        field_u = 0;
        field_z = "Achievements This Session";
    }
}
