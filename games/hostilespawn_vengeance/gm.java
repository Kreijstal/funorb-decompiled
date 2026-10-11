/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm {
    static int field_f;
    static vl field_d;
    private boolean field_b;
    bd[] field_c;
    private int field_i;
    static String[] field_k;
    bd field_a;
    private int field_h;
    static bd field_j;
    static int field_m;
    private int field_l;
    private int field_e;
    private int field_g;

    final static void a(int param0, String param1, String[] param2, int param3) {
        int var5 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        String[] var6 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          od.field_I = ee.field_b;
          if (255 != param3) {
            if (param3 < 100) {
              wj.field_H = an.a(param3, -10, param1);
            } else {
              if (param3 <= 105) {
                wj.field_H = vf.a(param2, true);
              } else {
                wj.field_H = an.a(param3, -10, param1);
              }
            }
          } else {
            stackIn_5_0 = !(ia.field_h >= 13);
            wj.field_H = qi.a(stackIn_5_0, false);
          }
          if (param0 == 26991) {
            return;
          }
          var6 = (String[]) null;
          gm.a(58, (String) null, (String[]) null, -3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("gm.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(CharSequence param0, char param1, byte param2) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          var3_int = 0;
          var4 = param0.length();
          if (param2 != 125) {
            var7 = (CharSequence) null;
            gm.a((CharSequence) null, '7', (byte) 37);
          }
          for (var5 = 0; var4 > var5; var5++) {
            if (param1 == param0.charAt(var5)) {
              var3_int++;
            }
          }
          stackIn_11_0 = var3_int;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("gm.J(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void b(int param0) {
        this.field_g = 0;
        this.field_l = -1;
        this.field_c = null;
        this.field_e = 256;
        this.field_i = 0;
        this.field_a = null;
        if (param0 >= 121) {
          this.field_h = 0;
          return;
        }
        this.field_e = 19;
        this.field_h = 0;
    }

    final gm a(boolean param0, bd[] param1) {
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            var4 = (CharSequence) null;
            gm.a((CharSequence) null, 89, true);
          }
          this.field_c = param1;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gm.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final gm a(int param0, boolean param1) {
        this.field_i = param0;
        if (!param1) {
          return (gm) null;
        }
        return this;
    }

    final void a(ha param0, int param1, int param2, ag param3, int param4) {
        vm stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_24_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        int stackIn_27_7;
        int stackIn_28_8;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          hm.a(param3.field_s, this.field_c, false, param3.field_x, param3.field_m + param4, param2 + param3.field_v);
          if (null != this.field_a) {
            var6_int = this.field_h + (param2 + param3.field_v);
            if (param0.field_k == 1) {
              var6_int = var6_int + (-this.field_a.field_u + param3.field_s) / 2;
            }
            var7 = this.field_g + param4 + param3.field_m;
            if (param0.field_k == 2) {
              var6_int = var6_int + (-this.field_a.field_u + param3.field_s);
            }
            if (param0.field_b == 1) {
              var7 = var7 + (param3.field_x - this.field_a.field_r) / 2;
            }
            if (param0.field_b == 2) {
              var7 = var7 + (param3.field_x - this.field_a.field_r);
            }
            this.field_a.e(var6_int, var7);
          }
          if (param1 < 118) {
            return;
          }
          var6 = param0.c(param3, 3);
          if (var6 != null &&
            null != param0.field_g) {
            if (this.field_i < 0) {
              return;
            }
            stackIn_21_0 = param0.field_g;
            stackIn_21_1 = var6;
            stackIn_21_2 = param2 + (param3.field_v + param0.field_q);
            if (this.field_h == -2147483648) {
              stackIn_22_3 = 0;
            } else {
              stackIn_22_3 = this.field_h;
            }
            stackIn_24_2 = stackIn_21_2 + stackIn_22_3;
            if (this.field_g != -2147483648) {
              stackIn_25_3 = this.field_g;
            } else {
              stackIn_25_3 = 0;
            }
            stackIn_27_3 = stackIn_25_3 + (param0.field_n + param4) + param3.field_m;
            stackIn_27_4 = -param0.field_p + param3.field_s - param0.field_q;
            stackIn_27_5 = param3.field_x - (param0.field_n + param0.field_i);
            stackIn_27_6 = this.field_i;
            stackIn_27_7 = this.field_l;
            if (this.field_e != -2147483648) {
              stackIn_28_8 = this.field_e;
            } else {
              stackIn_28_8 = 256;
            }
            ((vm) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_24_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_28_8, param0.field_k, param0.field_b, param0.field_a);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_32_0 = var6_ref;
          stackIn_32_1 = new StringBuilder().append("gm.G(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(ag param0, gm param1, byte param2, ha param3, int param4, int param5) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_b) {
            param1.a(param3, 126, param5, param0, param4);
            param1.b(125);
          }
          if (-2147483648 != this.field_e) {
            param1.field_e = this.field_e;
          }
          if (param2 <= 40) {
            this.field_g = 72;
          }
          if (this.field_h != -2147483648) {
            param1.field_h = this.field_h;
          }
          if (null != this.field_a) {
            param1.field_a = this.field_a;
          }
          if (this.field_c != null) {
            param1.field_c = this.field_c;
          }
          if (-1 <= this.field_l) {
            param1.field_l = this.field_l;
          }
          if (this.field_g != -2147483648) {
            param1.field_g = this.field_g;
          }
          if (-1 > this.field_i) {
            return;
          }
          param1.field_i = this.field_i;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("gm.F(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(gm param0, byte param1) {
        try {
          param0.field_g = this.field_g;
          param0.field_b = this.field_b;
          param0.field_i = this.field_i;
          param0.field_l = this.field_l;
          param0.field_e = this.field_e;
          param0.field_h = this.field_h;
          param0.field_a = this.field_a;
          if (param1 != 33) {
            field_m = 89;
          }
          param0.field_c = this.field_c;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "gm.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final gm a(int param0, int param1) {
        if (param0 != -2147483648) {
          field_f = -11;
          this.field_l = param1;
          return this;
        }
        this.field_l = param1;
        return this;
    }

    public static void a(int param0) {
        field_j = null;
        field_d = null;
        field_k = null;
        if (param0 == 0) {
          return;
        }
        CharSequence var2 = (CharSequence) null;
        gm.a((CharSequence) null, 54, false);
    }

    final static String a(CharSequence param0, int param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          var3 = tb.a(param0, -24224, param2);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          var4 = 0;
          if (param1 >= -115) {
            gm.a(-73);
          }
          while (true) {
            if (param0.length() <= var4) {
              return null;
            }
            if (aa.a(param0.charAt(var4), (byte) 108)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_10_0 = wk.field_e;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("gm.I(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final gm a(byte param0, int param1) {
        this.field_g = param1;
        if (param0 < 23) {
          this.a((byte) 13, false);
          return this;
        }
        return this;
    }

    final gm b(int param0, int param1) {
        this.field_h = param0;
        if (param1 != 16802) {
          this.a(107, -107);
          return this;
        }
        return this;
    }

    final gm a(byte param0, boolean param1) {
        this.field_b = param1 ? true : false;
        if (param0 <= -26) {
          return this;
        }
        CharSequence var4 = (CharSequence) null;
        gm.a((CharSequence) null, '\'', (byte) -41);
        return this;
    }

    gm() {
        this.field_b = false;
        this.field_i = -2;
        this.field_c = null;
        this.field_h = -2147483648;
        this.field_a = null;
        this.field_l = -2;
        this.field_e = -2147483648;
        this.field_g = -2147483648;
    }

    static {
        field_f = 0;
        field_k = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
