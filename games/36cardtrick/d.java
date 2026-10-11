/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    ke field_h;
    int[] field_q;
    static boolean field_s;
    byte[][] field_l;
    int[] field_n;
    int[][] field_o;
    static vi field_a;
    private int[][] field_r;
    int field_k;
    int[] field_f;
    ke[] field_p;
    static String field_e;
    int field_b;
    int[] field_i;
    static String field_j;
    static int field_c;
    int field_g;
    private int field_t;
    static kc[] field_u;
    int[] field_d;
    private byte[] field_v;
    private int[] field_m;

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
        int stackIn_17_0 = 0;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
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
        pb var17 = null;
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
        var16 = Main.field_T;
        try {
          var17 = new pb(ac.a(-115, param0));
          var4 = var17.f(-125);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (6 > var4) {
              this.field_k = 0;
            } else {
              this.field_k = var17.e((byte) 125);
            }
            var5 = var17.f(param1 + 4328);
            stackIn_11_0 = (0 == (var5 & 1)) ? 0 : 1;
            var6 = stackIn_11_0;
            if (var4 >= 7) {
              this.field_t = var17.b(false);
            } else {
              this.field_t = var17.d((byte) 72);
            }
            stackIn_17_0 = ((var5 & 2) == 0) ? 0 : 1;
            var7 = stackIn_17_0;
            var8 = 0;
            var9 = -1;
            this.field_d = new int[this.field_t];
            if (7 <= var4) {
              for (var10 = 0; var10 < this.field_t; var10++) {
                dupTemp$0 = var8 + var17.b(false);
                var8 = dupTemp$0;
                this.field_d[var10] = dupTemp$0;
                if (var9 < this.field_d[var10]) {
                  var9 = this.field_d[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.field_t; var10++) {
                dupTemp$1 = var8 + var17.d((byte) 72);
                var8 = dupTemp$1;
                this.field_d[var10] = dupTemp$1;
                if (var9 < this.field_d[var10]) {
                  var9 = this.field_d[var10];
                }
              }
            }
            this.field_b = 1 + var9;
            this.field_f = new int[this.field_b];
            if (var7 != 0) {
              this.field_l = new byte[this.field_b][];
            }
            this.field_o = new int[this.field_b][];
            this.field_i = new int[this.field_b];
            this.field_n = new int[this.field_b];
            this.field_q = new int[this.field_b];
            if (var6 != 0) {
              this.field_m = new int[this.field_b];
              for (var10Lifetime1 = 0; this.field_b > var10Lifetime1; var10Lifetime1++) {
                this.field_m[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_t; var10Lifetime1Lifetime1++) {
                this.field_m[this.field_d[var10Lifetime1Lifetime1]] = var17.e((byte) 125);
              }
              this.field_h = new ke(this.field_m);
            }
            for (var10Lifetime2 = 0; var10Lifetime2 < this.field_t; var10Lifetime2++) {
              this.field_i[this.field_d[var10Lifetime2]] = var17.e((byte) 127);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_t; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(126, var21, 0, 64);
                this.field_l[this.field_d[var10Lifetime3]] = var21;
              }
            }
            if (param1 != -4451) {
              d.a(false);
            }
            for (var10Lifetime4 = 0; var10Lifetime4 < this.field_t; var10Lifetime4++) {
              this.field_n[this.field_d[var10Lifetime4]] = var17.e((byte) 125);
            }
            if (7 > var4) {
              for (var10Lifetime5 = 0; this.field_t > var10Lifetime5; var10Lifetime5++) {
                this.field_q[this.field_d[var10Lifetime5]] = var17.d((byte) 72);
              }
              for (var10Lifetime5 = 0; this.field_t > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_d[var10Lifetime5];
                var12 = this.field_q[var11];
                var8Lifetime1 = 0;
                var13 = -1;
                array$2 = new int[var12];
                this.field_o[var11] = array$2;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.d((byte) 72);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_o[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_f[var11] = var13 + 1;
                if (var13 + 1 == var12) {
                  this.field_o[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_t; var10Lifetime5++) {
                this.field_q[this.field_d[var10Lifetime5]] = var17.b(false);
              }
              for (var10Lifetime5 = 0; this.field_t > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_d[var10Lifetime5];
                var12 = this.field_q[var11];
                var8Lifetime1 = 0;
                var13 = -1;
                array$5 = new int[var12];
                this.field_o[var11] = array$5;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.b(false);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_o[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_f[var11] = 1 + var13;
                if (var13 + 1 == var12) {
                  this.field_o[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_p = new ke[var9 + 1];
              this.field_r = new int[var9 + 1][];
              for (var10Lifetime6 = 0; this.field_t > var10Lifetime6; var10Lifetime6++) {
                var11Lifetime1 = this.field_d[var10Lifetime6];
                var12Lifetime1 = this.field_q[var11Lifetime1];
                array$8 = new int[this.field_f[var11Lifetime1]];
                this.field_r[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_f[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_r[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var12Lifetime1 > var13Lifetime1Lifetime1; var13Lifetime1Lifetime1++) {
                  if (this.field_o[var11Lifetime1] != null) {
                    var14Lifetime1 = this.field_o[var11Lifetime1][var13Lifetime1Lifetime1];
                  } else {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  }
                  this.field_r[var11Lifetime1][var14Lifetime1] = var17.e((byte) 126);
                }
                this.field_p[var11Lifetime1] = new ke(this.field_r[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_104_0 = var3;
          stackIn_104_1 = new StringBuilder().append("d.A(");
          if (param0 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_j = null;
        field_e = null;
        field_a = null;
        if (!param0) {
          d.a(false);
        }
        field_u = null;
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
          param0.removeMouseListener(wc.field_B);
          param0.removeMouseMotionListener(wc.field_B);
          param0.removeFocusListener(wc.field_B);
          ge.field_a = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "d.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    d(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_g = uh.a((byte) 124, param0.length, param0);
          if (this.field_g != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (64 != param2.length) {
              throw new RuntimeException();
            }
            this.field_v = ti.a(0, param0, param0.length, 0);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_v[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(param0, -4451);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "d.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = false;
        field_e = "You are not currently logged in to the<nbsp>game.";
        field_u = new kc[11];
        field_j = "Please enter your age in years";
    }
}
