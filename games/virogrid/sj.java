/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    int[] field_i;
    static eh field_l;
    int[] field_n;
    int[] field_m;
    int[][] field_r;
    static mg field_j;
    int[] field_c;
    private int[] field_t;
    private byte[] field_s;
    int field_q;
    static String field_e;
    byte[][] field_p;
    int[] field_f;
    private int[][] field_g;
    md field_h;
    md[] field_u;
    int field_a;
    static String field_k;
    static String field_d;
    static float field_o;
    private int field_b;
    int field_v;

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
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_99_2 = null;
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
        jc var18 = null;
        byte[] var22 = null;
        int var8Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var11Lifetime5;
        int var11Lifetime6;
        int var14Lifetime1;
        int var15Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var11Lifetime1Lifetime1;
        int var14Lifetime1Lifetime1;
        var17 = Virogrid.field_F ? 1 : 0;
        try {
          var18 = new jc(mc.a(param0, 118));
          var4 = var18.g(11132);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (var4 < 6) {
              this.field_a = 0;
            } else {
              this.field_a = var18.d((byte) 109);
            }
            var5 = var18.g(11132);
            stackIn_11_0 = ((var5 & 1) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            if (7 <= var4) {
              this.field_b = var18.d(true);
            } else {
              this.field_b = var18.c((byte) 106);
            }
            stackIn_17_0 = ((var5 & 2) == 0) ? 0 : 1;
            var7 = stackIn_17_0;
            var8 = 0;
            var10 = -92 % ((-9 - param1) / 56);
            var9 = -1;
            this.field_c = new int[this.field_b];
            if (var4 < 7) {
              for (var11 = 0; this.field_b > var11; var11++) {
                dupTemp$0 = var8 + var18.c((byte) 66);
                var8 = dupTemp$0;
                this.field_c[var11] = dupTemp$0;
                if (this.field_c[var11] > var9) {
                  var9 = this.field_c[var11];
                }
              }
            } else {
              for (var11 = 0; var11 < this.field_b; var11++) {
                dupTemp$1 = var8 + var18.d(true);
                var8 = dupTemp$1;
                this.field_c[var11] = dupTemp$1;
                if (this.field_c[var11] > var9) {
                  var9 = this.field_c[var11];
                }
              }
            }
            this.field_v = 1 + var9;
            this.field_r = new int[this.field_v][];
            this.field_i = new int[this.field_v];
            if (var7 != 0) {
              this.field_p = new byte[this.field_v][];
            }
            this.field_m = new int[this.field_v];
            this.field_n = new int[this.field_v];
            this.field_f = new int[this.field_v];
            if (var6 != 0) {
              this.field_t = new int[this.field_v];
              for (var11Lifetime1 = 0; this.field_v > var11Lifetime1; var11Lifetime1++) {
                this.field_t[var11Lifetime1] = -1;
              }
              for (var11Lifetime1Lifetime1 = 0; var11Lifetime1Lifetime1 < this.field_b; var11Lifetime1Lifetime1++) {
                this.field_t[this.field_c[var11Lifetime1Lifetime1]] = var18.d((byte) 119);
              }
              this.field_h = new md(this.field_t);
            }
            for (var11Lifetime2 = 0; this.field_b > var11Lifetime2; var11Lifetime2++) {
              this.field_m[this.field_c[var11Lifetime2]] = var18.d((byte) 95);
            }
            if (var7 != 0) {
              for (var11Lifetime3 = 0; var11Lifetime3 < this.field_b; var11Lifetime3++) {
                var22 = new byte[64];
                var18.a(0, 64, true, var22);
                this.field_p[this.field_c[var11Lifetime3]] = var22;
              }
            }
            for (var11Lifetime4 = 0; var11Lifetime4 < this.field_b; var11Lifetime4++) {
              this.field_f[this.field_c[var11Lifetime4]] = var18.d((byte) 104);
            }
            if (var4 >= 7) {
              for (var11Lifetime5 = 0; this.field_b > var11Lifetime5; var11Lifetime5++) {
                this.field_n[this.field_c[var11Lifetime5]] = var18.d(true);
              }
              for (var11Lifetime5 = 0; var11Lifetime5 < this.field_b; var11Lifetime5++) {
                var12 = this.field_c[var11Lifetime5];
                var13 = this.field_n[var12];
                var8Lifetime1 = 0;
                var14 = -1;
                array$2 = new int[var13];
                this.field_r[var12] = array$2;
                for (var15 = 0; var13 > var15; var15++) {
                  dupTemp$3 = var8Lifetime1 + var18.d(true);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_r[var12];
                  dupTemp$4[var15] = dupTemp$3;
                  var16 = dupTemp$3;
                  if (var14 < var16) {
                    var14 = var16;
                  }
                }
                this.field_i[var12] = 1 + var14;
                if (1 + var14 == var13) {
                  this.field_r[var12] = null;
                }
              }
            } else {
              for (var11Lifetime5 = 0; var11Lifetime5 < this.field_b; var11Lifetime5++) {
                this.field_n[this.field_c[var11Lifetime5]] = var18.c((byte) 42);
              }
              for (var11Lifetime5 = 0; var11Lifetime5 < this.field_b; var11Lifetime5++) {
                var12 = this.field_c[var11Lifetime5];
                var13 = this.field_n[var12];
                var8Lifetime1 = 0;
                array$5 = new int[var13];
                this.field_r[var12] = array$5;
                var14 = -1;
                for (var15 = 0; var13 > var15; var15++) {
                  dupTemp$6 = var8Lifetime1 + var18.c((byte) -84);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_r[var12];
                  dupTemp$7[var15] = dupTemp$6;
                  var16 = dupTemp$6;
                  if (var16 > var14) {
                    var14 = var16;
                  }
                }
                this.field_i[var12] = 1 + var14;
                if (1 + var14 == var13) {
                  this.field_r[var12] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_g = new int[1 + var9][];
              this.field_u = new md[var9 + 1];
              for (var11Lifetime6 = 0; var11Lifetime6 < this.field_b; var11Lifetime6++) {
                var12Lifetime1 = this.field_c[var11Lifetime6];
                var13Lifetime1 = this.field_n[var12Lifetime1];
                array$8 = new int[this.field_i[var12Lifetime1]];
                this.field_g[var12Lifetime1] = array$8;
                for (var14Lifetime1 = 0; var14Lifetime1 < this.field_i[var12Lifetime1]; var14Lifetime1++) {
                  this.field_g[var12Lifetime1][var14Lifetime1] = -1;
                }
                for (var14Lifetime1Lifetime1 = 0; var14Lifetime1Lifetime1 < var13Lifetime1; var14Lifetime1Lifetime1++) {
                  if (this.field_r[var12Lifetime1] == null) {
                    var15Lifetime1 = var14Lifetime1Lifetime1;
                  } else {
                    var15Lifetime1 = this.field_r[var12Lifetime1][var14Lifetime1Lifetime1];
                  }
                  this.field_g[var12Lifetime1][var15Lifetime1] = var18.d((byte) 119);
                }
                this.field_u[var12Lifetime1] = new md(this.field_g[var12Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_98_0 = var3;
          stackIn_98_1 = new StringBuilder().append("sj.B(");
          if (param0 == null) {
            stackIn_99_2 = "null";
          } else {
            stackIn_99_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_98_0), ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
          af.field_i = true;
          var2 = "tuhstatbut";
          if (param1 != 20298) {
            int[] var6 = (int[]) null;
            sj.a((il) null, true, (int[]) null, (int[]) null);
          }
          var3 = "rvnadlm";
          var4 = -1L;
          sb.a(var2, var3, param0, var4, (byte) -2);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "sj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(il param0, boolean param1, int[] param2, int[] param3) {
        try {
          param0.a(param2, param3);
          if (param1) {
            field_l = (eh) null;
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "sj.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 <= 118) {
          return;
        }
        field_j = null;
        field_d = null;
        field_k = null;
        field_l = null;
        field_e = null;
    }

    sj(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_q = na.a(false, param0.length, param0);
          if (this.field_q != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (64 != param2.length) {
              throw new RuntimeException();
            }
            this.field_s = ug.a(param0, param0.length, 0, false);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (param2[var4_int] != this.field_s[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(param0, 117);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "sj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_d = "Leave game";
        field_e = "Show chat (<%0> unread messages)";
    }
}
