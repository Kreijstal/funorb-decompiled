/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends af {
    static boolean field_i;
    private boolean field_g;
    private int field_p;
    static bh field_n;
    private int field_h;
    private vd field_j;
    private String field_q;
    private int field_l;
    private int field_o;
    private int field_k;
    static lg field_f;
    static String field_m;

    private final fg a(String param0, int param1, int param2, vd param3) {
        fg var5 = null;
        RuntimeException var5_ref = null;
        fg var6 = null;
        fg stackIn_2_0 = null;
        fg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 11) {
            stackIn_2_0 = (fg) null;
            return stackIn_2_0;
          }
          var6 = new fg(-param3.field_M + param2, param3.field_B + param2, param0.length());
          var5 = var6;
          this.field_d = new fg[]{var6};
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("cf.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, vd param2, int param3, String param4) {
        fg var8 = null;
        fg var9 = null;
        if (param4 == null) {
          this.field_d = null;
          return;
        }
        if (this.field_j == param2 &&
          this.field_g &&
          this.field_k == 2 &&
          this.field_q != null &&
          this.field_q.equals(param4)) {
          return;
        }
        try {
          this.field_g = true;
          this.field_q = param4;
          if (param1 > -58) {
            field_n = (bh) null;
          }
          this.field_k = 2;
          this.field_j = param2;
          var8 = this.a(param4, 108, param3, param2);
          var9 = var8;
          var9.field_e[0] = param0 - param2.b(param4);
          var9.field_e[param4.length()] = param0;
          lk.a(-58, param2, 0, var9, param4);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "cf.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(int param0) {
        field_n = null;
        field_m = null;
        if (param0 != 10881) {
          kl var2 = (kl) null;
          cf.a(53, -122, (kl) null, -97);
        }
        field_f = null;
    }

    final static void a(byte param0) {
        if (param0 != 79) {
          field_n = (bh) null;
        }
        da.h(0);
    }

    final void a(vd param0, String param1, int param2, boolean param3, int param4) {
        fg var8 = null;
        int var7 = 0;
        if (param1 == null) {
          this.field_d = null;
          return;
        }
        if (this.field_j == param0 && this.field_g && this.field_k == 1 && this.field_q != null &&
          this.field_q.equals(param1)) {
          return;
        }
        try {
          this.field_g = param3 ? true : false;
          this.field_k = 1;
          this.field_j = param0;
          var8 = this.a(param1, 46, param4, param0);
          var7 = param0.b(param1);
          var8.field_e[0] = -(var7 >> 1) + param2;
          var8.field_e[param1.length()] = param2 + (var7 >> 1);
          lk.a(90, param0, 0, var8, param1);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "cf.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static wc a(int param0, boolean param1) {
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        mg var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        mg var8 = null;
        ac var9 = null;
        var7 = wizardrun.field_H;
        if (param0 != -2) {
          field_f = (lg) null;
        }
        var8 = nk.field_N;
        var2 = var8;
        var3 = var8.f(255);
        dj.field_e = 127 & var3;
        stackIn_5_0 = ((var3 & 128) != 0);
        rb.field_a = stackIn_5_0;
        il.field_a = var8.f(255);
        ug.field_N = var8.e((byte) 0);
        if (dj.field_e == 2) {
          wh.field_g = var8.j(-14477);
          ac.field_r = var8.d((byte) 80);
        } else {
          ac.field_r = 0;
          wh.field_g = 0;
        }
        stackIn_11_0 = (var8.f(param0 + 257) != 1) ? 0 : 1;
        var4 = stackIn_11_0;
        th.field_e = var8.d(0);
        if (var4 == 0) {
          tg.field_b = th.field_e;
        } else {
          tg.field_b = var8.d(0);
        }
        if (dj.field_e == 1 ||
          dj.field_e == 4) {
          var8.j(-14477);
          var8.d(param0 + 2);
        }
        if (param1) {
          var5 = var8.j(-14477);
          try {
            var9 = il.field_b.b((byte) 47, var5);
            vl.field_f = var9.d(10592);
            if (!tg.field_b.equals(d.field_a)) {
              stackIn_24_0 = var9.field_p;
            } else {
              stackIn_24_0 = null;
            }
            rh.field_m = stackIn_24_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            rg.a((Throwable) ((Object) var6), "CC1", -562);
            vl.field_f = null;
            rh.field_m = null;
          }
        } else {
          vl.field_f = ol.a(80, var8, (byte) 45);
          rh.field_m = null;
        }
        return new wc(param1);
    }

    final void a(String param0, int param1, int param2, int param3, byte param4, vd param5, int param6, int param7) {
        fg stackIn_37_0;
        fg stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        fg stackIn_38_0 = null;
        fg stackIn_38_1 = null;
        int stackIn_38_4 = 0;
        int stackIn_41_0 = 0;
        vd stackIn_41_1 = null;
        int stackIn_42_2 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        fg var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = wizardrun.field_H;
        try {
          if (0 == param1) {
            param1 = param5.field_E;
          }
          if (param0 == null) {
            this.field_d = null;
            return;
          }
          if (param5 == this.field_j &&
            !this.field_g &&
            this.field_k == param2 &&
            this.field_p == param6 &&
            this.field_l == param1 &&
            this.field_o == param7 &&
            this.field_h == param3 &&
            null != this.field_q &&
            this.field_q.equals(param0)) {
            return;
          }
          this.field_p = param6;
          this.field_h = param3;
          this.field_l = param1;
          this.field_j = param5;
          this.field_q = param0;
          this.field_k = param2;
          this.field_g = false;
          this.field_o = param7;
          var16 = new String[param5.b(param0, param3) + 1];
          var17 = var16;
          var10 = Math.max(1, param5.a(param0, new int[]{param3}, var17));
          if (this.field_p == 3 &&
            var10 == 1) {
            this.field_p = 1;
          }
          this.field_d = new fg[var10];
          if (this.field_p == 0) {
            var11 = param5.field_M;
          } else {
            if (1 != this.field_p) {
              if (2 != this.field_p) {
                var12 = (this.field_o - var10 * this.field_l) / (var10 + 1);
                if (0 > var12) {
                  var12 = 0;
                }
                this.field_l = this.field_l + var12;
                var11 = var12 + param5.field_M;
              } else {
                var11 = this.field_o - (param5.field_B + var10 * this.field_l);
              }
            } else {
              var11 = param5.field_M + (this.field_o - var10 * this.field_l >> 1);
            }
          }
          if (param4 > -120) {
            this.field_p = 34;
          }
          for (var12Lifetime1 = 0; var12Lifetime1 < var10; var12Lifetime1++) {
            var13 = var16[var12Lifetime1];
            stackIn_37_0 = null;
            stackIn_37_1 = null;
            stackIn_37_2 = var11 - param5.field_M;
            stackIn_37_3 = var11 + param5.field_B;
            if (var13 != null) {
              stackIn_38_0 = null;
              stackIn_38_1 = null;
              stackIn_38_4 = var13.length();
            } else {
              stackIn_38_0 = null;
              stackIn_38_1 = null;
              stackIn_38_4 = 0;
            }
            var14 = new fg(stackIn_37_2, stackIn_37_3, stackIn_38_4);
            var14.field_e[0] = 0;
            if (var13 != null) {
              var14.field_e[var13.length()] = param5.b(var13);
              stackIn_41_0 = -76;
              stackIn_41_1 = (vd) (param5);
              if (param2 != 3) {
                stackIn_42_2 = 0;
              } else {
                stackIn_42_2 = this.a(param5.b(var13), var13, 6454, param3);
              }
              lk.a(stackIn_41_0, stackIn_41_1, stackIn_42_2, var14, var13);
            }
            var11 = var11 + param1;
            this.field_d[var12Lifetime1] = var14;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_47_0 = var9;
          stackIn_47_1 = new StringBuilder().append("cf.I(");
          if (param0 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, String param3, vd param4) {
        fg var7 = null;
        fg var8 = null;
        if (param1 > -71) {
          this.field_p = 2;
        }
        if (param3 == null) {
          this.field_d = null;
          return;
        }
        if (this.field_j == param4 &&
          this.field_g &&
          this.field_k == 0 &&
          this.field_q != null &&
          this.field_q.equals(param3)) {
          return;
        }
        try {
          this.field_k = 0;
          this.field_j = param4;
          this.field_g = true;
          this.field_q = param3;
          var7 = this.a(param3, 70, param0, param4);
          var8 = var7;
          var7.field_e[0] = param2;
          var8.field_e[param3.length()] = param4.b(param3) + param2;
          lk.a(113, param4, 0, var8, param3);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "cf.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public cf() {
    }

    final static o[] a(int param0, int param1, kl param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        o[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!h.a(param0, param3, param2, -126)) {
            stackIn_2_0 = null;
            return (o[]) (stackIn_2_0);
          }
          if (param1 != 30736) {
            field_m = (String) null;
          }
          stackIn_6_0 = pi.b(0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("cf.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_i = false;
        field_n = new bh(2, 4, 4, 0);
        field_f = new lg();
        field_m = "Highscores";
    }
}
