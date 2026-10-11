/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    int[] field_q;
    cm[] field_i;
    static boolean field_o;
    int[] field_n;
    private byte[] field_u;
    int[][] field_k;
    int[] field_m;
    static bi field_p;
    int field_c;
    static String field_d;
    private int[][] field_t;
    static String field_g;
    static bi field_r;
    private int[] field_s;
    cm field_b;
    byte[][] field_j;
    private int field_l;
    int[] field_v;
    static int[][] field_h;
    int[] field_f;
    int field_a;
    int field_e;

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
          return;
        }
        field_g = null;
        field_h = (int[][]) null;
        field_r = null;
        field_p = null;
    }

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
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_107_2 = null;
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
        ob var17 = null;
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
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var17 = new ob(pa.a(param0, 200));
          var4 = var17.j(-89);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (var4 < 6) {
              this.field_e = 0;
            } else {
              this.field_e = var17.a(16711680);
            }
            var5 = var17.j(-57);
            stackIn_11_0 = (0 == (1 & var5)) ? 0 : 1;
            var6 = stackIn_11_0;
            if (var4 < 7) {
              this.field_l = var17.f(-20976);
            } else {
              this.field_l = var17.d(true);
            }
            stackIn_17_0 = ((2 & var5) == 0) ? 0 : 1;
            var7 = stackIn_17_0;
            var8 = 0;
            this.field_q = new int[this.field_l];
            var9 = -1;
            if (var4 < 7) {
              for (var10 = 0; this.field_l > var10; var10++) {
                dupTemp$0 = var8 + var17.f(-20976);
                var8 = dupTemp$0;
                this.field_q[var10] = dupTemp$0;
                if (this.field_q[var10] > var9) {
                  var9 = this.field_q[var10];
                }
              }
            } else {
              for (var10 = 0; this.field_l > var10; var10++) {
                dupTemp$1 = var8 + var17.d(true);
                var8 = dupTemp$1;
                this.field_q[var10] = dupTemp$1;
                if (this.field_q[var10] > var9) {
                  var9 = this.field_q[var10];
                }
              }
            }
            this.field_a = 1 + var9;
            this.field_k = new int[this.field_a][];
            this.field_n = new int[this.field_a];
            this.field_m = new int[this.field_a];
            this.field_f = new int[this.field_a];
            if (var7 != 0) {
              this.field_j = new byte[this.field_a][];
            }
            this.field_v = new int[this.field_a];
            if (var6 != 0) {
              this.field_s = new int[this.field_a];
              for (var10Lifetime1 = 0; this.field_a > var10Lifetime1; var10Lifetime1++) {
                this.field_s[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_l; var10Lifetime1Lifetime1++) {
                this.field_s[this.field_q[var10Lifetime1Lifetime1]] = var17.a(16711680);
              }
              this.field_b = new cm(this.field_s);
            }
            for (var10Lifetime2 = 0; this.field_l > var10Lifetime2; var10Lifetime2++) {
              this.field_f[this.field_q[var10Lifetime2]] = var17.a(16711680);
            }
            if (var7 == 0) {
              if (param1 <= 77) {
                return;
              }
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_l; var10Lifetime3++) {
                this.field_v[this.field_q[var10Lifetime3]] = var17.a(16711680);
              }
            } else {
              for (var10Lifetime3 = 0; this.field_l > var10Lifetime3; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(64, 0, 17469032, var21);
                this.field_j[this.field_q[var10Lifetime3]] = var21;
              }
              if (param1 <= 77) {
                return;
              }
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_l; var10Lifetime3++) {
                this.field_v[this.field_q[var10Lifetime3]] = var17.a(16711680);
              }
            }
            if (var4 < 7) {
              for (var10Lifetime4 = 0; var10Lifetime4 < this.field_l; var10Lifetime4++) {
                this.field_n[this.field_q[var10Lifetime4]] = var17.f(-20976);
              }
              for (var10Lifetime4 = 0; var10Lifetime4 < this.field_l; var10Lifetime4++) {
                var11 = this.field_q[var10Lifetime4];
                var8Lifetime1 = 0;
                var12 = this.field_n[var11];
                var13 = -1;
                array$2 = new int[var12];
                this.field_k[var11] = array$2;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.f(-20976);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_k[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_m[var11] = 1 + var13;
                if (var13 + 1 == var12) {
                  this.field_k[var11] = null;
                }
              }
            } else {
              for (var10Lifetime4 = 0; this.field_l > var10Lifetime4; var10Lifetime4++) {
                this.field_n[this.field_q[var10Lifetime4]] = var17.d(true);
              }
              for (var10Lifetime4 = 0; var10Lifetime4 < this.field_l; var10Lifetime4++) {
                var11 = this.field_q[var10Lifetime4];
                var12 = this.field_n[var11];
                var8Lifetime1 = 0;
                array$5 = new int[var12];
                this.field_k[var11] = array$5;
                var13 = -1;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.d(true);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_k[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_m[var11] = var13 + 1;
                if (var12 == 1 + var13) {
                  this.field_k[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_t = new int[1 + var9][];
              this.field_i = new cm[var9 + 1];
              for (var10Lifetime5 = 0; this.field_l > var10Lifetime5; var10Lifetime5++) {
                var11Lifetime1 = this.field_q[var10Lifetime5];
                var12Lifetime1 = this.field_n[var11Lifetime1];
                array$8 = new int[this.field_m[var11Lifetime1]];
                this.field_t[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_m[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_t[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (this.field_k[var11Lifetime1] == null) {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  } else {
                    var14Lifetime1 = this.field_k[var11Lifetime1][var13Lifetime1Lifetime1];
                  }
                  this.field_t[var11Lifetime1][var14Lifetime1] = var17.a(16711680);
                }
                this.field_i[var11Lifetime1] = new cm(this.field_t[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_106_0 = var3;
          stackIn_106_1 = new StringBuilder().append("ci.B(");
          if (param0 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param1).append(')').toString());
        }
    }

    ci(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_c = me.a(62, param0, param0.length);
          if (this.field_c != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_u = dp.a(param0, param0.length, -26131, 0);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_u[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(param0, (byte) 86);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ci.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Solicitation";
    }
}
