/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    static String field_b;
    private am field_a;
    static boolean field_d;
    static double field_e;
    private am field_c;

    final am a(int param0) {
        am var2 = this.field_a.field_f;
        if (var2 == this.field_a) {
          this.field_c = null;
          return null;
        }
        if (param0 >= -111) {
          return (am) null;
        }
        this.field_c = var2.field_f;
        return var2;
    }

    final int c(int param0) {
        int var4 = Kickabout.field_G;
        int var2 = 0;
        am var3 = this.field_a.field_f;
        if (param0 != -1976587888) {
          field_e = 0.5554742673995899;
        }
        while (this.field_a != var3) {
          var2++;
          var3 = var3.field_f;
        }
        return var2;
    }

    final void a(int param0, am param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1.field_e != null) {
            param1.f(79);
          }
          param1.field_e = this.field_a.field_e;
          param1.field_f = this.field_a;
          param1.field_e.field_f = param1;
          param1.field_f.field_e = param1;
          if (param0 != 127) {
            o.d(-50);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("o.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static eg a(int param0, vn param1) {
        int var5 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4_int = 0;
        eg var4 = null;
        int var6 = 0;
        vn var7 = null;
        int var8 = 0;
        vn var9 = null;
        eg stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_intLifetime1;
        var6 = Kickabout.field_G;
        try {
          var7 = new vn(param1, false, false, true, true);
          var9 = var7;
          var3 = 91 / ((param0 - 2) / 60);
          for (var4_int = 0; var9.field_p.length > var4_int; var4_int++) {
            var7.field_p[var4_int] = (short)6;
          }
          var8 = 0;
          var4_intLifetime1 = var8;
          while (var9.field_l.length > var8) {
            var9.field_l[var8] = (var9.field_l[var8] << 1) / 3;
            var8++;
          }
          var4 = (eg) (var9.a(127, 131072, 10, 10, 10));
          for (var5 = 0; var5 < var4.field_n.length; var5++) {
            var4.field_n[var5] = -1;
          }
          stackIn_11_0 = var4;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("o.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final am b(byte param0) {
        int var3 = 118 % ((54 - param0) / 51);
        am var2 = this.field_a.field_f;
        if (var2 == this.field_a) {
          return null;
        }
        var2.f(114);
        return var2;
    }

    public static void d(int param0) {
        field_b = null;
        if (param0 != 1603) {
          field_d = false;
        }
    }

    final am b(int param0) {
        am var2 = this.field_c;
        if (var2 == this.field_a) {
          this.field_c = null;
          return null;
        }
        if (param0 != 0) {
          this.c(14);
        }
        this.field_c = var2.field_f;
        return var2;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        nl var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = Kickabout.field_G;
        try {
          df.d(true);
          var1_int = 0;
          if (param0 != -127) {
            return;
          }
          while (var1_int < 3) {
            var2 = et.field_d.field_P[1][var1_int + 1];
            if (tc.a(0, (byte) 86, var2.field_M, var2, nt.field_zb[var1_int] << 16)) {
              nt.field_zb[var1_int] = 700 + (-var2.a(true) + 700);
              if (nt.field_zb[var1_int] <= 700) {
                nt.field_zb[var1_int] = Math.max(520, nt.field_zb[var1_int] - 20);
              } else {
                nt.field_zb[var1_int] = Math.min(880, nt.field_zb[var1_int] + 20);
              }
              tc.a(0, (byte) 122, var2.field_M, var2, nt.field_zb[var1_int] << 16);
            }
            var1_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "o.E(" + param0 + ')');
        }
    }

    public o() {
        this.field_a = new am();
        this.field_a.field_f = this.field_a;
        this.field_a.field_e = this.field_a;
    }

    static {
        field_b = "Achievements";
    }
}
