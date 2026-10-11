/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends ph {
    int field_Q;
    int field_J;
    int field_I;
    static bd[] field_G;
    static String field_N;
    static String field_O;
    int field_H;
    static String field_R;
    static jf field_M;
    static String field_K;
    int field_L;
    int field_P;

    public static void j(int param0) {
        if (param0 >= -119) {
          return;
        }
        field_G = null;
        field_M = null;
        field_R = null;
        field_N = null;
        field_O = null;
        field_K = null;
    }

    final static void a(m param0, int param1, int param2) {
        try {
          wk.field_g.a(param0, 124);
          fj.a(param1, param0, true);
          if (param2 != -7347) {
            g.j(101);
          }
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "g.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        dn.field_a = param1;
        int var2 = -94 / ((-70 - param0) / 46);
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -this.field_v - param1 + (-this.field_P + param0);
          var9 = -this.field_Q - (param2 - (-this.field_m + param3));
          if (this.field_J * this.field_J <= var9 * var9 + var8_int * var8_int) {
            return true;
          }
          var10 = Math.atan2((double)var9, (double)var8_int) - he.field_r;
          if (0.0 > var10) {
            var10 = var10 - 3.141592653589793 / (double)this.field_I;
          } else {
            if (0.0 < var10) {
              var10 = var10 + 3.141592653589793 / (double)this.field_I;
            }
          }
          this.field_H = (int)((double)this.field_I * var10 / 6.283185307179586);
          while (this.field_I <= this.field_H) {
            this.field_H = this.field_H - this.field_I;
          }
          while (this.field_H < 0) {
            this.field_H = this.field_H + this.field_I;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_18_0 = var8;
          stackIn_18_1 = new StringBuilder().append("g.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param6).append(')').toString());
        }
    }

    final static java.awt.Frame a(int param0, int param1, byte param2, fd param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_35_0 = null;
        java.awt.Frame stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        ak[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        ak[] var10 = null;
        kk var11 = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (!param3.a(true)) {
            return null;
          }
          if (0 == param4) {
            var10 = je.a(param3, 2);
            var6 = var10;
            if (var6 == null) {
              stackIn_8_0 = null;
              return (java.awt.Frame) (stackIn_8_0);
            }
            var7_int = 0;
            for (var8 = 0; var10.length > var8; var8++) {
              if (param5 == var10[var8].field_d &&
                param0 == var10[var8].field_k && ((0 == param1 ||
                var10[var8].field_j == param1) &&
                (var7_int == 0 ||
                !(var10[var8].field_e <= param4)))) {
                var7_int = 1;
                param4 = var10[var8].field_e;
              }
            }
            if (var7_int == 0) {
              stackIn_24_0 = null;
              return (java.awt.Frame) (stackIn_24_0);
            }
          }
          var11 = param3.a(false, param5, param1, param0, param4);
          while (var11.field_f == 0) {
            vj.a(10L, (byte) -49);
          }
          var7 = (java.awt.Frame) (var11.field_c);
          if (var7 == null) {
            stackIn_30_0 = null;
            return (java.awt.Frame) (stackIn_30_0);
          }
          if (param2 < 11) {
            field_N = (String) null;
          }
          if (2 != var11.field_f) {
            stackIn_37_0 = var7;
            return stackIn_37_0;
          }
          sd.a(param3, -125, var7);
          stackIn_35_0 = null;
          return (java.awt.Frame) (stackIn_35_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_40_0 = var6_ref;
          stackIn_40_1 = new StringBuilder().append("g.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private g() throws Throwable {
        throw new Error();
    }

    static {
        field_N = "Achieved";
        field_R = "Passwords can only contain letters and numbers";
        field_O = "Find more ammo for the rocket launcher to destroy the turrets blocking the lift. Otherwise, find an alternative way out.";
        field_K = "Doors open when you get close to them.";
        field_M = new jf();
    }
}
