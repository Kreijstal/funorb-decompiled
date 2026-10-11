/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qf extends ea {
    static ko field_w;
    boolean field_u;
    private boolean field_v;
    static String[] field_t;

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4;
        int var4Lifetime1;
        fl.field_a.a(param3, param0);
        if (param1 == -1) {
          if (!param2) {
            return;
          }
          var4 = hl.field_g % fl.field_a.field_l * 2;
          if (fl.field_a.field_l <= var4) {
            var4 = fl.field_a.field_l - var4 + fl.field_a.field_l;
          }
          if (var4 < 10) {
            var4 = 10;
          } else {
            if (var4 > -40 + fl.field_a.field_l) {
              var4 = fl.field_a.field_l - 40;
            }
          }
          wm.a(var4, param0, fl.field_a, param3, 480, 0, 30, 80, 0);
          return;
        }
        field_t = (String[]) null;
        if (!param2) {
          return;
        }
        var4Lifetime1 = hl.field_g % fl.field_a.field_l * 2;
        if (fl.field_a.field_l <= var4Lifetime1) {
          var4Lifetime1 = fl.field_a.field_l - var4Lifetime1 + fl.field_a.field_l;
        }
        if (var4Lifetime1 < 10) {
          var4Lifetime1 = 10;
        } else {
          if (var4Lifetime1 > -40 + fl.field_a.field_l) {
            var4Lifetime1 = fl.field_a.field_l - 40;
          }
        }
        wm.a(var4Lifetime1, param0, fl.field_a, param3, 480, 0, 30, 80, 0);
    }

    boolean c(f[][] param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("qf.KA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean g(int param0) {
        if (param0 != 0) {
          this.field_v = false;
          return false;
        }
        return false;
    }

    void f(int param0, int param1, f[][] param2, int param3) {
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var6Lifetime1;
        var8 = CrazyCrystals.field_B;
        try {
          this.field_u = false;
          var5_int = param2[param1 + 1][param3].a(true, false);
          if (param0 != 1) {
            return;
          }
          if ((var5_int & 2) != 0) {
            this.a(param2, param1, false, 1, param3, 0);
            return;
          }
          if (!this.field_v) {
            this.a((byte) 52, param2[1 + param1][param3]);
            this.field_l.a((byte) 89, param2[1 + param1][param3]);
          } else {
            this.field_v = false;
            stackIn_8_0 = (!this.c(param2, param1, (byte) -31, param3)) ? 0 : 1;
            var6 = stackIn_8_0;
            param2[1 + param1][param3] = param2[param1 + 1][param3].a(1 + param1, param3, param2, (f) (this), (byte) 12);
            this.a((byte) 122, param2[1 + param1][param3]);
            this.field_l.a((byte) 121, param2[1 + param1][param3]);
            je.field_j = je.field_j - 1;
            we.field_h = we.field_h - 2;
            fp.field_a = fp.field_a - 2;
            b.field_a = b.field_a - 1;
            mb.field_g = mb.field_g - ob.field_l;
            wd.field_j = wd.field_j - 1;
            if (var6 != 0) {
              return;
            }
          }
          stackIn_16_0 = ((4 & var5_int) == 0) ? 0 : 1;
          var6Lifetime1 = stackIn_16_0;
          stackIn_19_0 = ((var5_int & 8) == 0) ? 0 : 1;
          var7 = stackIn_19_0;
          if (var6Lifetime1 != 0) {
            stackIn_24_0 = (!this.a(param3 - 1, (byte) 94, param2, param1)) ? 0 : 1;
            var6Lifetime1 = stackIn_24_0;
          }
          if (var7 != 0) {
            stackIn_30_0 = (!this.a(param3 + 1, (byte) 94, param2, param1)) ? 0 : 1;
            var7 = stackIn_30_0;
          }
          if (var7 != 0) {
            this.a(param2, param1, false, 0, param3, 1);
            return;
          }
          if (var6Lifetime1 != 0) {
            this.a(param2, param1, false, 0, param3, -1);
            return;
          }
          this.field_u = this.a((byte) 68, param1, param3, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_40_0 = var5;
          stackIn_40_1 = new StringBuilder().append("qf.LA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(String param0, int param1) {
        System.out.println("Error: " + ca.a("\n", 0, param0, "%0a"));
        if (param1 != 1) {
          qf.h(77);
        }
    }

    final int a(boolean param0, int param1) {
        if (param1 != 0) {
          qf.h(24);
          if (this.field_s == 0) {
            return 12;
          }
          if (this.field_s > 0) {
            return 2;
          }
          return 0;
        }
        if (this.field_s == 0) {
          return 12;
        }
        if (this.field_s > 0) {
          return 2;
        }
        return 0;
    }

    private final boolean c(int param0, int param1, int param2, f[][] param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if ((1 & param3[param1][param2].a(true, true)) == 0) {
            return false;
          }
          if ((2 & param3[param1 + 1][param2].a(true, true)) != param0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("qf.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    qf(f param0) {
        super(param0);
        this.field_v = false;
        try {
          this.field_p = 4;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "qf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    boolean a(int param0, int param1, int param2, f[][] param3, int param4, fq param5, int param6) {
        RuntimeException var8 = null;
        String var9 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            return false;
          }
          if (param1 != -1) {
            var9 = (String) null;
            qf.a((String) null, 3);
          }
          stackIn_9_0 = ((1 & param3[param2][2 * param4 + param6].a(true, false)) != 0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_12_0 = var8;
          stackIn_12_1 = new StringBuilder().append("qf.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void h(int param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = CrazyCrystals.field_B;
        try {
          var1_int = ga.field_J[0];
          if (param0 != -30693) {
            qf.e((byte) 69);
          }
          for (var2 = 1; ga.field_J.length > var2; var2++) {
            var3 = ga.field_J[var2];
            eg.a(gh.field_E, var2 << 4, gh.field_E, var1_int, var3);
            var1_int = var1_int + var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "qf.BA(" + param0 + ')');
        }
    }

    private final boolean a(byte param0, int param1, int param2, f[][] param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        boolean stackIn_35_0 = false;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (0 != (this.field_o | this.field_s)) {
            return false;
          }
          if (this.field_j) {
            return false;
          }
          if (param0 != 68) {
            return true;
          }
          var5_int = param3[param1 + 1][param2].a(true, true);
          if (0 != (var5_int & 2)) {
            return true;
          }
          stackIn_16_0 = ((4 & var5_int) == 0) ? 0 : 1;
          var6 = stackIn_16_0;
          stackIn_19_0 = (0 == (var5_int & 8)) ? 0 : 1;
          var7 = stackIn_19_0;
          if (var6 != 0) {
            stackIn_24_0 = (!this.c(0, param1, -1 + param2, param3)) ? 0 : 1;
            var6 = stackIn_24_0;
          }
          if (var7 != 0) {
            stackIn_29_0 = (!this.c(0, param1, 1 + param2, param3)) ? 0 : 1;
            var7 = stackIn_29_0;
          }
          stackIn_35_0 = (var6 != 0) || (var7 != 0);
          return stackIn_35_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_38_0 = var5;
          stackIn_38_1 = new StringBuilder().append("qf.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_t = null;
        if (param0 != -72) {
          field_t = (String[]) null;
          field_w = null;
          return;
        }
        field_w = null;
    }

    sl a(f[][] param0, int param1, boolean param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        boolean stackIn_3_1 = false;
        sl stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          mb.field_g = mb.field_g + ob.field_l;
          wd.field_j = wd.field_j + 1;
          b.field_a = b.field_a - 2;
          je.field_j = je.field_j - 2;
          fp.field_a = fp.field_a - 4;
          we.field_h = we.field_h - 4;
          stackIn_3_1 = (param2);
          this.field_v = stackIn_3_1;
          this.field_u = false;
          stackIn_4_0 = super.a(param0, param1, false, param3, param4, param5);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("qf.R(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final f a(sl param0, f[][] param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        f stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 17512) {
            field_w = (ko) null;
          }
          if (1 == param5) {
            this.field_v = true;
          }
          stackIn_5_0 = super.a(param0, param1, param2, param3, 17512, param5, param6);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("qf.I(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final boolean a(int param0, byte param1, f[][] param2, int param3) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_23_1 = 0;
        boolean stackIn_23_2 = false;
        int stackIn_24_3 = 0;
        f stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        boolean stackIn_26_2 = false;
        int stackIn_27_3;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        try {
          if (param1 != 94) {
            return false;
          }
          stackIn_6_0 = (0 != (param2[param3][param0].a(true, false) & 1)) ? 0 : 1;
          var5_int = stackIn_6_0;
          stackIn_9_0 = ((2 & param2[param3 + 1][param0].a(true, false)) != 0) ? 0 : 1;
          var6 = stackIn_9_0;
          if (var5_int != 0 &&
            var6 != 0) {
            var7 = param2[param3][param0].a(false) & param2[1 + param3][param0].a(false);
            if (var7 != 0) {
              var8 = param2[param3][param0].b(-3445);
              var9 = param2[1 + param3][param0].b(-3445);
              stackIn_23_1 = var7;
              stackIn_23_2 = true;
              if (var8 > var9) {
                stackIn_24_3 = var8;
              } else {
                stackIn_24_3 = var9;
              }
              this.a(stackIn_23_1, stackIn_23_2, stackIn_24_3);
              stackIn_26_0 = this.field_l;
              stackIn_26_1 = var7;
              stackIn_26_2 = true;
              if (var8 <= var9) {
                stackIn_27_3 = var9;
              } else {
                stackIn_27_3 = var8;
              }
              ((f) (Object) stackIn_26_0).a(stackIn_26_1, stackIn_26_2, stackIn_27_3);
            }
            return false;
          }
          if (var5_int != 0) {
            this.a((byte) 97, param2[param3][param0]);
            this.field_l.a((byte) 90, param2[param3][param0]);
            return false;
          }
          if (var6 == 0) {
            return true;
          }
          this.a((byte) 112, param2[param3 + 1][param0]);
          this.field_l.a((byte) 71, param2[1 + param3][param0]);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("qf.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(')').toString());
        }
    }

    final f a(int param0, int param1, f[][] param2, int param3, int param4, int param5, ea param6) {
        RuntimeException var8 = null;
        am stackIn_6_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -31135) {
            qf.e((byte) 15);
          }
          if (0 == (this.field_o | this.field_s)) {
            fp.field_a = fp.field_a + 10;
            we.field_h = we.field_h + 10;
            b.field_a = b.field_a + 5;
            je.field_j = je.field_j + 5;
            mb.field_g = mb.field_g + 12;
            fn.field_j = fn.field_j + 12;
            if (!(this instanceof cj)) {
              stackIn_6_0 = td.field_e;
            } else {
              stackIn_6_0 = dn.field_d;
            }
            ((am) (Object) stackIn_6_0).a(128, 12 * param1, param4 * 12, 60, (byte) -111);
            this.a((byte) 111, param6);
            this.field_l.a((byte) 83, param6);
            this.a(param2, param4, false, param0, param1, param5);
          }
          return (f) (this);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("qf.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_t = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
