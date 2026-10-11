/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp extends we {
    static String field_v;
    static boolean field_s;
    private int[][] field_u;
    private String[][] field_t;
    private int field_x;
    private int field_w;
    static qla field_r;

    final static boolean a(int param0, byte param1, int param2) {
        int var3 = -13 / ((24 - param1) / 57);
        return (param0 & 16) != 0 ? true : false;
    }

    final int g(int param0, int param1) {
        if (param1 != 30) {
          field_v = (String) null;
          return koa.b(0) - 30;
        }
        return koa.b(0) - 30;
    }

    final String b(int param0, byte param1) {
        if (param1 <= 111) {
          return (String) null;
        }
        if (param0 == 0) {
          return fga.field_a;
        }
        return super.b(param0, (byte) 112);
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7, String param8) {
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        String var11 = null;
        da var12 = null;
        String var13 = null;
        String var13Lifetime1;
        String var13Lifetime2;
        try {
          var10_int = param5 + param2 + param3;
          if (var10_int != 0) {
            param2 = (200 * param2 + var10_int) / (var10_int * 2);
            param5 = (var10_int + 200 * param5) / (var10_int * 2);
          }
          if (param1 != 127) {
            return;
          }
          if (500 <= var10_int) {
            stackIn_7_0 = kha.field_a;
          } else {
            stackIn_7_0 = Integer.toString(var10_int);
          }
          var11 = stackIn_7_0;
          var13 = var11;
          var13Lifetime1 = var11;
          var12 = kn.field_p;
          if (param0 < 10) {
            stackIn_10_0 = "0" + (char)(48 + param0);
          } else {
            stackIn_10_0 = Integer.toString(param0);
          }
          var13Lifetime2 = stackIn_10_0;
          if (param0 == -1) {
            var13Lifetime2 = "";
          }
          var12.a(-1, -1, es.field_h[0], param7, param4, var13Lifetime2);
          var12.a(param4, false, param8, es.field_h[1], param7, -1);
          var12.a(param4, false, Integer.toString(param6), es.field_h[2], param7, -1);
          var12.a(param4, false, var11, es.field_h[3], param7, -1);
          var12.a(param4, false, param2 + "%", es.field_h[4], param7, -1);
          var12.a(param4, false, param5 + "%", es.field_h[5], param7, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_16_0 = var10;
          stackIn_16_1 = new StringBuilder().append("qp.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static int c(int param0, int param1, int param2) {
        if (param2 <= 116) {
          return -119;
        }
        param1 = (127 & param0) * param1 >> 7;
        if (2 > param1) {
          param1 = 2;
          return (65408 & param0) + param1;
        }
        if (param1 > 126) {
          param1 = 126;
          return (65408 & param0) + param1;
        }
        return (65408 & param0) + param1;
    }

    final int a(byte param0, int param1) {
        if (param0 > 111) {
          return -80 + (aaa.a(false) >> 1) - ((this.field_m[0].e(-163) >> 1) * this.field_m.length - param1 * this.field_m[0].e(-163));
        }
        return 100;
    }

    final void h(int param0, int param1) {
        this.field_x = param1;
        if (param0 != 18608) {
          this.g(-85, -41);
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != -48) {
          return 88;
        }
        return this.a((byte) 116, param0) + this.field_m[param0].e(-163);
    }

    qp(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_x = 0;
        this.field_w = 0;
        try {
          this.field_o = false;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "qp.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(byte param0, int param1, int param2) {
        String[] var4;
        int[] var5;
        upa var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        String var12;
        int var14;
        String[] var15;
        int stackIn_3_0 = 0;
        Object stackIn_18_0;
        int stackIn_18_1;
        int stackIn_18_2;
        int stackIn_18_3;
        int stackIn_18_4;
        int stackIn_18_5;
        int stackIn_18_6;
        int stackIn_18_7;
        Object stackIn_19_0;
        int stackIn_19_8;
        int var13;
        var14 = TombRacer.field_G ? 1 : 0;
        var15 = this.field_t[param1];
        var4 = var15;
        var5 = this.field_u[param1];
        var6 = sb.field_a;
        var7 = 0;
        stackIn_3_0 = (var6 != null) ? 0 : 1;
        var8 = stackIn_3_0;
        if (param0 <= 39) {
          return true;
        }
        var9 = 140 + param2;
        var10 = 0;
        var11 = 140 + param2;
        while (var10 < 10) {
          var12 = var15[var10];
          if (var12 != null &&
            0 != var12.length()) {
            var13 = 0;
            if (var8 == 0 &&
              ue.a(var12, 0)) {
              var8 = 1;
              var13 = 1;
            }
            stackIn_18_0 = this;
            stackIn_18_1 = var10 + 1;
            stackIn_18_2 = 127;
            stackIn_18_3 = var5[1 + 4 * var10];
            stackIn_18_4 = var5[4 * var10 + 2];
            stackIn_18_5 = var11;
            stackIn_18_6 = var5[3 + var10 * 4];
            stackIn_18_7 = var5[4 * var10];
            if (var13 != 0) {
              stackIn_19_0 = this;
              stackIn_19_8 = 10309393;
            } else {
              stackIn_19_0 = this;
              stackIn_19_8 = 2431750;
            }
            this.a(stackIn_18_1, (byte) stackIn_18_2, stackIn_18_3, stackIn_18_4, stackIn_18_5, stackIn_18_6, stackIn_18_7, stackIn_19_8 | -16777216, var12);
            var7 = 1;
            var9 = var11;
          }
          var10++;
          var11 += 20;
        }
        if (var8 == 0) {
          var7 = 1;
          this.a(-1, (byte) 127, var6.field_f, var6.field_g, var9 + 20, var6.field_j, var6.field_l, -5818367, fna.field_k);
        }
        return var7 != 0;
    }

    public static void d(int param0) {
        field_r = null;
        field_v = null;
        if (param0 <= 63) {
          field_v = (String) null;
        }
    }

    final void a(boolean param0, int param1, byte param2) {
        boolean discarded$3 = false;
        boolean discarded$5 = false;
        boolean discarded$4 = false;
        int var4;
        Object var5;
        int var6;
        String var7;
        String var8;
        es.field_h = new int[]{85, 130, 260, 365, 470, 540};
        if (param2 > -9) {
          this.a(false, -74, (byte) 102);
        }
        qr.field_v.a(param1 + 63, false, b.field_v.toUpperCase() + " - " + wg.field_m[this.field_x].toUpperCase(), 65, -14279929, -1);
        var4 = 120 + param1;
        eda.field_f.a(-1, -1, es.field_h[0], -14671840, var4, hl.field_a);
        eda.field_f.a(var4, false, pta.field_g.toUpperCase(), es.field_h[1], -14671840, -1);
        eda.field_f.a(var4, false, nj.field_o.toUpperCase(), es.field_h[2], -14671840, -1);
        eda.field_f.a(var4, false, rb.field_q.toUpperCase(), es.field_h[3], -14671840, -1);
        eda.field_f.a(var4, false, ufa.field_u.toUpperCase(), es.field_h[4], -14671840, -1);
        eda.field_f.a(var4, false, ida.field_a.toUpperCase(), es.field_h[5], -14671840, -1);
        var5 = null;
        var6 = this.field_w;
        if (0 == var6) {
          var7 = dt.field_n;
          if (var7 != null) {
            oka.a(var7.toUpperCase(), 65793, eda.field_f, -1, param1 + 240, aaa.a(false) >> 1, -1);
            return;
          }
          discarded$3 = this.a((byte) 106, this.field_x, param1);
          return;
        }
        if (var6 != 1) {
          if (var5 != null) {
            oka.a(((String) (var5)).toUpperCase(), 65793, eda.field_f, -1, param1 + 240, aaa.a(false) >> 1, -1);
            return;
          }
          discarded$5 = this.a((byte) 106, this.field_x, param1);
          return;
        }
        var8 = kt.field_H;
        if (var8 != null) {
          oka.a(var8.toUpperCase(), 65793, eda.field_f, -1, param1 + 240, aaa.a(false) >> 1, -1);
          return;
        }
        discarded$4 = this.a((byte) 106, this.field_x, param1);
        return;
    }

    final boolean c(int param0, int param1) {
        if (param1 != 0) {
          this.a(-73, (byte) -31);
          return super.c(param0, 0);
        }
        return super.c(param0, 0);
    }

    final void a(boolean param0, boolean param1, int param2) {
        int var5;
        String var6;
        upa var7;
        upa var8;
        upa var9;
        var5 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1, param2 + 0);
        if (param2 == 15283) {
          if (!param0) {
            return;
          }
          if (vpa.a(111)) {
            this.field_w = 1;
            return;
          }
          var9 = sb.field_a;
          if (var9 == null) {
            sb.field_a = pt.a(22578, 7, 10, 0);
            this.field_w = 0;
          } else {
            if (!var9.field_i) {
              this.field_w = 0;
            } else {
              if (null == var9.field_h) {
                this.field_w = 1;
              } else {
                this.field_w = 2;
                this.field_u = var9.field_m;
                this.field_t = var9.field_h;
              }
            }
          }
          return;
        }
        var6 = (String) null;
        this.a(38, (byte) 100, -54, 60, 55, -54, -22, -27, (String) null);
        if (!param0) {
          return;
        }
        if (vpa.a(111)) {
          this.field_w = 1;
          return;
        }
        var8 = sb.field_a;
        var7 = var8;
        if (var8 == null) {
          sb.field_a = pt.a(22578, 7, 10, 0);
          this.field_w = 0;
        } else {
          if (!var8.field_i) {
            this.field_w = 0;
          } else {
            if (null == var8.field_h) {
              this.field_w = 1;
            } else {
              this.field_w = 2;
              this.field_u = var8.field_m;
              this.field_t = var8.field_h;
            }
          }
        }
        return;
    }

    final boolean a(int param0, int param1) {
        if (param0 == -13) {
          return this.field_x == -1 + param1 ? true : false;
        }
        boolean discarded$3 = this.a((byte) 118, -37, -116);
        return this.field_x == -1 + param1 ? true : false;
    }

    static {
        field_v = "Unfortunately you are not eligible to create an account.";
    }
}
