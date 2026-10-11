/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    er[] field_m;
    private int field_k;
    static int[] field_b;
    static String field_l;
    private int field_i;
    static String field_e;
    private int field_d;
    static String field_j;
    er field_h;
    private boolean field_g;
    static byte[] field_c;
    private int field_f;
    private int field_a;

    final e a(int param0, int param1) {
        if (param0 < 79) {
          this.field_a = -43;
        }
        this.field_d = param1;
        return this;
    }

    final void a(e param0, int param1) {
        param0.field_i = this.field_i;
        if (param1 != 16777215) {
          return;
        }
        try {
          param0.field_d = this.field_d;
          param0.field_f = this.field_f;
          param0.field_g = this.field_g;
          param0.field_m = this.field_m;
          param0.field_a = this.field_a;
          param0.field_k = this.field_k;
          param0.field_h = this.field_h;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "e.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final e a(boolean param0, int param1) {
        if (param1 > -80) {
          field_c = (byte[]) null;
        }
        this.field_g = param0 ? true : false;
        return this;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != 31) {
          field_l = (String) null;
        }
        if (ua.field_e <= param3 &&
          cj.field_D >= param3) {
          param4 = pk.a((byte) -14, ib.field_a, param4, ap.field_e);
          param1 = pk.a((byte) -14, ib.field_a, param1, ap.field_e);
          oq.a(param1, param4, (byte) -86, param3, param2);
        }
    }

    final e c(int param0, int param1) {
        if (param0 != -32352) {
          this.a(-127, 92);
        }
        this.field_i = param1;
        return this;
    }

    final e b(int param0, int param1) {
        this.field_f = param0;
        if (param1 > -94) {
          this.c(-91, 59);
        }
        return this;
    }

    final static void a(int param0, cr param1, cr param2, cr param3, cr param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        cr var7 = null;
        String var8 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          if (null != ha.field_a) {
            return;
          }
          il.field_a = false;
          if (pe.field_r) {
            var5 = ah.field_k;
          } else {
            if (hj.field_b) {
              var5 = qn.field_v;
            } else {
              var5 = kl.field_Nb;
            }
          }
          var8 = (String) null;
          ir.a((String) null, lj.field_p, var5, 0, 0);
          ha.field_a = dj.field_d;
          gj.field_z = ui.field_b;
          dj.field_d.field_B = ((np.field_Ib.field_B & 16711422) >> 1) + lj.field_p - (8355711 & lj.field_p >> 1);
          dj.field_d.field_H = -((16711423 & lj.field_p) >> 1) + lj.field_p + ((16711422 & np.field_Ib.field_H) >> 1);
          dj.field_d.field_K = lj.field_p - (((16711422 & lj.field_p) >> 1) - (np.field_Ib.field_K >> 1 & 8355711));
          gk.field_c = new cr(0L, param1);
          hb.field_j = new cr(0L, param2);
          lm.field_F = new cr(0L, (cr) null);
          if (param0 != 12899) {
            var7 = (cr) null;
            e.a(-89, (cr) null, (cr) null, (cr) null, (cr) null);
          }
          gg.field_o = new cr(0L, param4);
          dj.field_d = new cr(0L, param3);
          dj.field_d.field_z = cg.field_f;
          gg.field_o.b(dj.field_d, 125);
          ui.field_b = new cr(0L, gj.field_z);
          gg.field_o.b(ui.field_b, 125);
          kk.field_a = new cr(0L, np.field_Ib, oe.field_rb);
          oa.field_s = new cr(0L, np.field_Ib);
          gk.field_c.b(hb.field_j, 127);
          gk.field_c.b(lm.field_F, 123);
          lm.field_F.b(gg.field_o, param0 ^ 12824);
          lm.field_F.b(kk.field_a, param0 - 12774);
          lm.field_F.b(oa.field_s, 127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_14_0 = var5_ref;
          stackIn_14_1 = new StringBuilder().append("e.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void a(iq param0, int param1, int param2, int param3, mq param4) {
        cc stackIn_18_0;
        String stackIn_18_1;
        int stackIn_18_2;
        int stackIn_18_3;
        int stackIn_19_4 = 0;
        int stackIn_21_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_24_6;
        int stackIn_24_7;
        int stackIn_25_8;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          bc.a(param0.field_s, param0.field_t + param3, (byte) 127, this.field_m, param0.field_n, param1 + param0.field_o);
          if (param2 != 1) {
            this.a(-54, -91);
          }
          if (null != this.field_h) {
            var6_int = param1 + param0.field_o + this.field_i;
            if (param4.field_m == 1) {
              var6_int = var6_int + (-this.field_h.field_x + param0.field_n) / 2;
            }
            var7 = param0.field_t + param3 + this.field_d;
            if (param4.field_m == 2) {
              var6_int = var6_int + (param0.field_n - this.field_h.field_x);
            }
            if (param4.field_d == 1) {
              var7 = var7 + (-this.field_h.field_B + param0.field_s) / 2;
            }
            if (param4.field_d == 2) {
              var7 = var7 + (-this.field_h.field_B + param0.field_s);
            }
            this.field_h.e(var6_int, var7);
          }
          var6 = param4.a((byte) -90, param0);
          if (var6 != null &&
            null != param4.field_l) {
            if (this.field_k < 0) {
              return;
            }
            stackIn_18_0 = param4.field_l;
            stackIn_18_1 = var6;
            stackIn_18_2 = param0.field_o + param1;
            stackIn_18_3 = -param4.field_i;
            if (-2147483648 != this.field_i) {
              stackIn_19_4 = this.field_i;
            } else {
              stackIn_19_4 = 0;
            }
            stackIn_21_2 = stackIn_18_2 - (stackIn_18_3 - stackIn_19_4);
            if (this.field_d != -2147483648) {
              stackIn_22_3 = this.field_d;
            } else {
              stackIn_22_3 = 0;
            }
            stackIn_24_3 = stackIn_22_3 + (param4.field_k + param3 + param0.field_t);
            stackIn_24_4 = -param4.field_j - param4.field_i + param0.field_n;
            stackIn_24_5 = -param4.field_c + (-param4.field_k + param0.field_s);
            stackIn_24_6 = this.field_k;
            stackIn_24_7 = this.field_f;
            if (this.field_a != -2147483648) {
              stackIn_25_8 = this.field_a;
            } else {
              stackIn_25_8 = 256;
            }
            ((cc) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_21_2, stackIn_24_3, stackIn_24_4, stackIn_24_5, stackIn_24_6, stackIn_24_7, stackIn_25_8, param4.field_m, param4.field_d, param4.field_n);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_29_0 = var6_ref;
          stackIn_29_1 = new StringBuilder().append("e.N(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_b = null;
        field_j = null;
        field_l = null;
        field_c = null;
        if (param0 >= -100) {
          field_e = (String) null;
        }
    }

    final e a(byte param0, int param1) {
        this.field_k = param1;
        if (param0 >= -14) {
          return (e) null;
        }
        return this;
    }

    final static gg a(ae param0, boolean param1) {
        RuntimeException var2 = null;
        gg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            e.a(true, (byte) 4);
          }
          stackIn_3_0 = sp.a(ra.a(param0, 100, 96), -93);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("e.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, byte param1) {
        gk.field_c.b(param0, 0);
        if (param1 > -124) {
          Object var3 = (Object) null;
          e.a((jj) null, (Object) null, -43);
        }
    }

    final static void a(jj param0, Object param1, int param2) {
        int var3_int = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          if (null == param0.field_j) {
            return;
          }
          for (var3_int = 0; var3_int < 50; var3_int++) {
            if (null != param0.field_j.peekEvent()) {
              um.a(true, 1L);
              continue;
            }
            break;
          }
          if (param2 != -29785) {
            field_l = (String) null;
          }
          try {
            if (param1 != null) {
              param0.field_j.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("e.M(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(mq param0, int param1, iq param2, int param3, int param4, e param5) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_g) {
            param5.a(param2, param1, 1, param4, param0);
            param5.a(-21151);
          }
          if (param3 >= -54) {
            this.field_k = 96;
          }
          if (this.field_k >= -1) {
            param5.field_k = this.field_k;
          }
          if (null != this.field_m) {
            param5.field_m = this.field_m;
          }
          if (this.field_f >= -1) {
            param5.field_f = this.field_f;
          }
          if (this.field_i != -2147483648) {
            param5.field_i = this.field_i;
          }
          if (this.field_d != -2147483648) {
            param5.field_d = this.field_d;
          }
          if (null != this.field_h) {
            param5.field_h = this.field_h;
          }
          if (this.field_a != -2147483648) {
            param5.field_a = this.field_a;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("e.P(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final void a(int param0) {
        this.field_f = -1;
        this.field_h = null;
        if (param0 != -21151) {
          this.field_a = 40;
        }
        this.field_m = null;
        this.field_k = 0;
        this.field_a = 256;
        this.field_d = 0;
        this.field_i = 0;
    }

    final e a(int param0, er[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -110) {
            this.field_m = (er[]) null;
          }
          this.field_m = param1;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("e.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    e() {
        this.field_m = null;
        this.field_k = -2;
        this.field_i = -2147483648;
        this.field_h = null;
        this.field_d = -2147483648;
        this.field_g = false;
        this.field_f = -2;
        this.field_a = -2147483648;
    }

    static {
        field_l = "(1 player wants to join)";
        field_b = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_j = "Visit the Account Management section on the main site to view.";
        field_e = "This is <%0>'s RuneScape clan if they have one.";
    }
}
