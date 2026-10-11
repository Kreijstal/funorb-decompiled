/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    int[] field_o;
    int[] field_v;
    static String field_s;
    int[] field_t;
    static String field_k;
    int[][] field_b;
    static int field_m;
    int[] field_i;
    int field_n;
    private int[][] field_q;
    byte[][] field_w;
    int[] field_p;
    int field_c;
    static bd field_e;
    int field_d;
    static boolean field_g;
    rg field_l;
    static bd[][] field_f;
    rg[] field_h;
    private byte[] field_a;
    private int field_j;
    private int[] field_r;
    static boolean field_u;

    final static void a(int param0, int param1, int param2) {
        wk.field_c = param0;
        if (param2 != -1) {
          wc.a(41);
        }
        qg.field_l = param1;
    }

    final static void a(java.applet.Applet param0, String param1, byte param2, boolean param3) {
        try {
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          try {
            if (fd.field_c.startsWith("win") &&
              lm.a(26, param1)) {
              return;
            }
            try {
              if (false) throw (java.net.MalformedURLException) null;
              if (param2 != -97) {
                return;
              }
              param0.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              ic.a((byte) -116, "MGR1: " + param1, (Throwable) null);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var4_ref;
            stackIn_12_1 = new StringBuilder().append("wc.C(");
            if (param0 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw wg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
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
        int stackIn_14_0 = 0;
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
        vi var17 = null;
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
        var16 = HostileSpawn.field_I ? 1 : 0;
        try {
          var17 = new vi(ml.a(param1, (byte) -76));
          var4 = var17.l(32270);
          if (5 <= var4 &&
            var4 <= 7) {
            if (6 <= var4) {
              this.field_n = var17.d(8195);
            } else {
              this.field_n = 0;
            }
            var5 = var17.l(32270);
            stackIn_11_0 = ((1 & var5) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            stackIn_14_0 = ((2 & var5) == 0) ? 0 : 1;
            var7 = stackIn_14_0;
            if (var4 >= 7) {
              this.field_j = var17.a(true);
            } else {
              this.field_j = var17.e(8);
            }
            var8 = 0;
            var9 = -1;
            if (param0 != 0) {
              wc.a(-105);
            }
            this.field_t = new int[this.field_j];
            if (var4 < 7) {
              for (var10 = 0; this.field_j > var10; var10++) {
                dupTemp$0 = var8 + var17.e(8);
                var8 = dupTemp$0;
                this.field_t[var10] = dupTemp$0;
                if (var9 < this.field_t[var10]) {
                  var9 = this.field_t[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.field_j; var10++) {
                dupTemp$1 = var8 + var17.a(true);
                var8 = dupTemp$1;
                this.field_t[var10] = dupTemp$1;
                if (this.field_t[var10] > var9) {
                  var9 = this.field_t[var10];
                }
              }
            }
            this.field_c = 1 + var9;
            this.field_v = new int[this.field_c];
            this.field_o = new int[this.field_c];
            this.field_p = new int[this.field_c];
            this.field_b = new int[this.field_c][];
            this.field_i = new int[this.field_c];
            if (var7 != 0) {
              this.field_w = new byte[this.field_c][];
            }
            if (var6 != 0) {
              this.field_r = new int[this.field_c];
              for (var10Lifetime1 = 0; var10Lifetime1 < this.field_c; var10Lifetime1++) {
                this.field_r[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; this.field_j > var10Lifetime1Lifetime1; var10Lifetime1Lifetime1++) {
                this.field_r[this.field_t[var10Lifetime1Lifetime1]] = var17.d(8195);
              }
              this.field_l = new rg(this.field_r);
            }
            for (var10Lifetime2 = 0; this.field_j > var10Lifetime2; var10Lifetime2++) {
              this.field_v[this.field_t[var10Lifetime2]] = var17.d(8195);
            }
            if (var7 == 0) {
              for (var10Lifetime3 = 0; this.field_j > var10Lifetime3; var10Lifetime3++) {
                this.field_i[this.field_t[var10Lifetime3]] = var17.d(8195);
              }
            } else {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_j; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(64, 0, var21, -18181);
                this.field_w[this.field_t[var10Lifetime3]] = var21;
              }
              for (var10Lifetime3 = 0; this.field_j > var10Lifetime3; var10Lifetime3++) {
                this.field_i[this.field_t[var10Lifetime3]] = var17.d(8195);
              }
            }
            if (var4 >= 7) {
              for (var10Lifetime4 = 0; var10Lifetime4 < this.field_j; var10Lifetime4++) {
                this.field_o[this.field_t[var10Lifetime4]] = var17.a(true);
              }
              for (var10Lifetime4 = 0; var10Lifetime4 < this.field_j; var10Lifetime4++) {
                var11 = this.field_t[var10Lifetime4];
                var12 = this.field_o[var11];
                var8Lifetime1 = 0;
                var13 = -1;
                array$2 = new int[var12];
                this.field_b[var11] = array$2;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.a(true);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_b[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_p[var11] = var13 + 1;
                if (var12 == 1 + var13) {
                  this.field_b[var11] = null;
                }
              }
            } else {
              for (var10Lifetime4 = 0; this.field_j > var10Lifetime4; var10Lifetime4++) {
                this.field_o[this.field_t[var10Lifetime4]] = var17.e(bm.a(param0, 8));
              }
              for (var10Lifetime4 = 0; var10Lifetime4 < this.field_j; var10Lifetime4++) {
                var11 = this.field_t[var10Lifetime4];
                var8Lifetime1 = 0;
                var12 = this.field_o[var11];
                var13 = -1;
                array$5 = new int[var12];
                this.field_b[var11] = array$5;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.e(8);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_b[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_p[var11] = var13 + 1;
                if (1 + var13 == var12) {
                  this.field_b[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_q = new int[1 + var9][];
              this.field_h = new rg[var9 + 1];
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_j; var10Lifetime5++) {
                var11Lifetime1 = this.field_t[var10Lifetime5];
                var12Lifetime1 = this.field_o[var11Lifetime1];
                array$8 = new int[this.field_p[var11Lifetime1]];
                this.field_q[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_p[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_q[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var12Lifetime1 > var13Lifetime1Lifetime1; var13Lifetime1Lifetime1++) {
                  if (this.field_b[var11Lifetime1] != null) {
                    var14Lifetime1 = this.field_b[var11Lifetime1][var13Lifetime1Lifetime1];
                  } else {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  }
                  this.field_q[var11Lifetime1][var14Lifetime1] = var17.d(8195);
                }
                this.field_h[var11Lifetime1] = new rg(this.field_q[var11Lifetime1]);
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
          stackIn_104_1 = new StringBuilder().append("wc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(')').toString());
        }
    }

    final static fn a(String param0, gb param1, int param2, gb param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        fn stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 23) {
            wc.a(-98);
          }
          var5_int = param3.a((byte) -2, param0);
          var6 = param3.a(var5_int, param4, -1);
          stackIn_3_0 = qj.a(param1, param3, -1, var6, var5_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("wc.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    wc(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_d = pi.a(param0.length, 31465, param0);
          if (this.field_d != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_a = ld.a(param0, 0, 109, param0.length);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_a[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(0, param0);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "wc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_f = (bd[][]) null;
        field_s = null;
        if (param0 != -17514) {
          return;
        }
        field_k = null;
        field_e = null;
    }

    static {
        field_k = "To Customer Support";
        field_s = "Music: ";
    }
}
