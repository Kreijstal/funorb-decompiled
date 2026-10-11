/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends ng {
    int field_S;
    int field_P;
    int field_V;
    static int field_X;
    static String field_T;
    static String field_R;
    static int field_Y;
    int field_O;
    int field_Q;
    int field_W;
    static int field_U;

    final static void a(ej param0, int param1, boolean param2, int param3) {
        Object var4 = null;
        ej var6 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          if (la.field_d != null) {
            ac.a(false, param3, param0, param2, 1048576);
          }
          if (la.field_a != null) {
            var4 = bh.field_o;
            synchronized (var4) {
              la.field_a.a(param1 + 298, param3, -1);
              if (tg.field_t == param0) {
                return;
              }
              la.field_a.b((byte) 31);
              bh.field_o.g();
              tg.field_t = param0;
              if (tg.field_t != null) {
                la.field_a.a(-8126, tg.field_t, param2);
              }
            }
          }
          if (param1 != -3560) {
            var6 = (ej) null;
            uc.a((ej) null, 88, true, 73);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_22_0 = var4_ref;
          stackIn_22_1 = new StringBuilder().append("uc.C(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_R = null;
        field_T = null;
        if (param0 != -15087) {
          field_R = (String) null;
        }
    }

    final static ja[] a(int param0, uj param1) {
        int var5 = 0;
        ja[] stackIn_3_0 = null;
        ja[] stackIn_12_0 = null;
        ja[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        ja[] var4 = null;
        ja var6 = null;
        int var7 = 0;
        mi var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          if (!param1.a((byte) -81)) {
            stackIn_3_0 = new ja[]{};
            return stackIn_3_0;
          }
          var8 = param1.a(5);
          while (var8.field_d == 0) {
            c.a(46, 10L);
          }
          if (param0 >= -75) {
            uc.a(-124);
          }
          if (2 == var8.field_d) {
            stackIn_12_0 = new ja[]{};
            return stackIn_12_0;
          }
          var10 = (int[]) (var8.field_g);
          var9 = var10;
          var3 = var9;
          var4 = new ja[var10.length >> 2];
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new ja();
            var4[var5] = var6;
            var6.field_h = var3[var5 << 2];
            var6.field_d = var3[1 + (var5 << 2)];
            var6.field_i = var3[(var5 << 2) + 2];
            var6.field_c = var3[(var5 << 2) + 3];
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("uc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ee param6) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -param4 - (this.field_m + this.field_S - param1);
          var9 = -this.field_W - param3 + (-this.field_i + param0);
          if (var8_int * var8_int + var9 * var9 < this.field_V * this.field_V) {
            var10 = Math.atan2((double)var9, (double)var8_int) - gb.field_a;
            if (0.0 > var10) {
              var10 = var10 - 3.141592653589793 / (double)this.field_Q;
            } else {
              if (var10 > 0.0) {
                var10 = var10 + 3.141592653589793 / (double)this.field_Q;
              }
            }
            this.field_P = (int)(var10 * (double)this.field_Q / 6.283185307179586);
            while (this.field_Q <= this.field_P) {
              this.field_P = this.field_P - this.field_Q;
            }
            while (this.field_P < 0) {
              this.field_P = this.field_P + this.field_Q;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_18_0 = var8;
          stackIn_18_1 = new StringBuilder().append("uc.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean param8, int param9) {
        fe var12 = null;
        int var10 = qk.a(param4, param1, param2, param5, 120, param3, param7, param6);
        if (!param8) {
          field_T = (String) null;
        }
        int var11 = bj.a(param6, !param8 ? true : false, param3, param2, param1);
        if (0 == var10 ||
          var11 < 0) {
          sd.a(127);
          return;
        }
        if (!hc.field_Q) {
          hc.field_Q = true;
          var12 = ia.field_i[param4][dg.field_T[4]][0];
          var12.field_l = var12.field_k.length;
          ki.field_d = nc.a(var12, 100, var10, var11);
          ki.field_d.e(-1);
          ki.field_d.e(0, var12.field_k.length);
          we.a(ki.field_d, 6222);
          nj.field_g = var10;
          lh.field_s = param0;
          ub.field_n = param9;
        }
    }

    private uc() throws Throwable {
        throw new Error();
    }

    static {
        field_X = -1;
        field_T = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_R = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
