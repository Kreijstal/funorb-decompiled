/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kd {
    static String field_a;
    static String[] field_c;
    static String field_d;
    mn[] field_b;

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        mn var6 = null;
        int var7 = 0;
        int var8 = Pixelate.field_H ? 1 : 0;
        if (null == this.field_b ||
          0 == this.field_b.length ||
          this.field_b[0].field_b > param0) {
          return -1;
        }
        if (!(this.field_b[this.field_b.length - 1].field_d >= param0)) {
          return -1;
        }
        if (this.field_b.length == 1) {
          return this.field_b[0].a(param2, 27760);
        }
        int var4 = 0;
        if (param1 <= 116) {
          return 63;
        }
        for (var5 = 0; this.field_b.length > var5; var5++) {
          var6 = this.field_b[var5];
          if (param0 >= var6.field_b &&
            param0 <= var6.field_d) {
            var7 = var6.a(param2, 27760);
            if (var7 == -1) {
              return -1;
            }
            return var4 + var7;
          }
          var4 = var4 + (var6.field_g.length - 1);
        }
        return -1;
    }

    final static void c(boolean param0, int param1) {
        if (null != ri.field_f) {
          t.a(t.field_e, t.field_f, -t.field_e + t.field_h, t.field_a - t.field_f);
          ri.field_f.a(param0, 0);
        }
        if (param1 != -24721) {
          field_c = (String[]) null;
        }
    }

    final int b(boolean param0, int param1) {
        int var4 = 0;
        mn var5 = null;
        int var6 = Pixelate.field_H ? 1 : 0;
        mn[] var7 = this.field_b;
        mn[] var3 = var7;
        if (!param0) {
          this.field_b = (mn[]) null;
        }
        for (var4 = 0; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (!(param1 >= var5.field_g.length)) {
            return var5.field_g[param1];
          }
          param1 = param1 - (-1 + var5.field_g.length);
        }
        return 0;
    }

    final static void a(boolean param0, eq param1, byte param2, we param3) {
        int var8 = 0;
        eq stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        eq stackIn_12_0 = null;
        boolean stackIn_13_1 = false;
        eq stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        eq stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        eq stackIn_21_0 = null;
        boolean stackIn_22_1 = false;
        eq stackIn_24_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0) {
            param1.field_mc = param3.f(param2 ^ 135);
          }
          param1.field_ec = param3.f(255);
          if (param2 != 120) {
            field_d = (String) null;
          }
          param1.field_Ib = param3.f(param2 + 135);
          var4_int = param3.f(param2 + 135);
          stackIn_8_0 = (eq) (param1);
          stackIn_9_1 = (0 != (128 & var4_int));
          stackIn_8_0.field_Pb = stackIn_9_1;
          stackIn_12_0 = (eq) (param1);
          stackIn_13_1 = (param1.field_Pb) && (param1.field_ec > param1.field_mc);
          stackIn_12_0.field_hc = stackIn_13_1;
          stackIn_15_0 = (eq) (param1);
          stackIn_16_1 = (0 != (var4_int & 64));
          stackIn_15_0.field_dc = stackIn_16_1;
          stackIn_18_0 = (eq) (param1);
          stackIn_19_1 = ((var4_int & 32) != 0);
          stackIn_18_0.field_oc = stackIn_19_1;
          stackIn_21_0 = (eq) (param1);
          stackIn_22_1 = (0 != (8 & var4_int));
          stackIn_21_0.field_Mb = stackIn_22_1;
          stackIn_24_0 = (eq) (param1);
          if ((16 & var4_int) != 0) {
            stackIn_25_1 = 2;
          } else {
            stackIn_25_1 = 1;
          }
          stackIn_24_0.field_Tb = stackIn_25_1;
          stackIn_28_0 = (0 == (4 & var4_int)) ? 0 : 1;
          var5 = stackIn_28_0;
          stackIn_31_0 = ((2 & var4_int) == 0) ? 0 : 1;
          var6 = stackIn_31_0;
          param3.a(param1.field_Eb, 0, -77, param1.field_Eb.length);
          param1.field_bc = param3.a((byte) -11);
          param1.field_Lb = hm.a(64) - (long)param3.k(param2 - 120);
          if (var5 == 0) {
            param1.field_nc = -1;
          } else {
            param1.field_nc = param3.k(param2 - 120);
          }
          param1.field_kc = param3.a(false);
          var7 = param3.field_m;
          param1.field_pc = param3.h(5);
          if (var6 != 0) {
            param1.field_Ub = new String[param1.field_mc];
            param3.field_m = var7;
            for (var8 = 0; var8 < param1.field_mc; var8++) {
              param1.field_Ub[var8] = param3.h(param2 - 115);
            }
            return;
          }
          param1.field_Ub = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_42_0 = var4;
          stackIn_42_1 = new StringBuilder().append("kd.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    final int b(int param0) {
        int stackIn_7_0 = 0;
        if (param0 != 1) {
          field_d = (String) null;
        }
        if (null != this.field_b &&
          this.field_b.length > 0) {
          stackIn_7_0 = -this.field_b[0].field_b + this.field_b[this.field_b.length - 1].field_d;
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
    }

    final int a(int param0) {
        int var4 = 0;
        int var2;
        mn[] var3;
        mn var5;
        int var7;
        int var6;
        var7 = Pixelate.field_H ? 1 : 0;
        if (param0 != 0) {
          this.a(-37);
        }
        var2 = -1;
        if (this.field_b != null) {
          var3 = this.field_b;
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.a((byte) 86);
              if (var6 > var2) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        mn var4 = null;
        int var5 = Pixelate.field_H ? 1 : 0;
        for (var3 = 0; this.field_b.length > var3; var3++) {
          var4 = this.field_b[var3];
          if (!(var4.field_g.length <= param1)) {
            return var3;
          }
          param1 = param1 - (-1 + var4.field_g.length);
        }
        if (param0) {
          field_a = (String) null;
        }
        return this.field_b.length;
    }

    final int a(String param0, int param1, int param2, int param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = param0.length();
          for (var8 = 0; var8 < var7; var8++) {
            var9 = param0.charAt(var8);
            if (var9 != 60) {
              if (var9 != 62) {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              } else {
                var6 = 0;
              }
            } else {
              var6 = 1;
            }
          }
          if (param3 != 60) {
            field_a = (String) null;
          }
          if (0 >= var5_int) {
            stackIn_22_0 = 0;
            return stackIn_22_0;
          }
          stackIn_20_0 = (param1 - param2 << 8) / var5_int;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("kd.C(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void c(int param0) {
        if (param0 >= -115) {
          field_c = (String[]) null;
        }
        field_d = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_c = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_d = "Please enter a year between <%0> and <%1>";
    }
}
