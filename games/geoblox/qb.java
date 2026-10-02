/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends hk {
    static hh field_N;
    static rf field_M;
    static String field_F;
    int field_E;
    int field_H;
    int field_O;
    static String field_L;
    static int field_G;
    int field_J;
    int field_I;
    int field_K;

    final static mg b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = Geoblox.field_C;
        mg var5 = (mg) ((Object) rh.field_d.g(param2 ^ param2));
        while (var5 != null) {
            if (~var5.field_i == ~param0) {
                return var5;
            }
            var5 = (mg) ((Object) rh.field_d.d(1));
        }
        var5 = new mg();
        var5.field_f = param3;
        var5.field_l = param1;
        var5.field_i = param0;
        rh.field_d.a(-71, var5);
        ib.a(param4, param2 + 5, var5);
        return var5;
    }

    public static void f(int param0) {
        field_F = null;
        field_M = null;
        if (param0 != 0) {
            field_M = (rf) null;
        }
        field_N = null;
        field_L = null;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, el param6) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Geoblox.field_C;
        try {
          if (!super.a(param0, -52, param2, param3, param4, param5, param6)) {
            var8_int = 35 % ((-3 - param1) / 38);
            return false;
          }
          L0: {
            var8_int = -this.field_E - (this.field_v + (param2 - param4));
            var9 = param5 - (this.field_m + param0 + this.field_O);
            if (var8_int * var8_int + var9 * var9 < this.field_K * this.field_K) {
              var10 = Math.atan2((double)var9, (double)var8_int) - q.field_f;
              if (!(var10 < 0.0)) {
                if (0.0 < var10) {
                  var10 = var10 + 3.141592653589793 / (double)this.field_H;
                }
              } else {
                var10 = var10 - 3.141592653589793 / (double)this.field_H;
              }
              this.field_I = (int)(var10 * (double)this.field_H / 6.283185307179586);
              L2: while (this.field_I >= this.field_H) {
                this.field_I = this.field_I - this.field_H;
              }
              L3: while (this.field_I < 0) {
                this.field_I = this.field_I + this.field_H;
              }
              break L0;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_19_0 = (RuntimeException) (var8);
          stackIn_19_1 = new StringBuilder().append("qb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(int param0, lk param1, String param2, int param3, m param4) {
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        m var10 = null;
        var9 = Geoblox.field_C;
        try {
          var5_int = 0;
          if (param3 != 60) {
            var10 = (m) null;
            qb.a(-58, (lk) null, (String) null, -15, (m) null);
          }
          var6 = -1;
          L1: for (var7 = 1; var7 < param2.length(); var7++) {
            var8 = param2.charAt(var7);
            if (60 == var8) {
              var6 = param1.field_c[0] + (var5_int >> 8) + param4.a(param2.substring(0, var7));
            }
            if (var6 == -1) {
              if (var8 == 32) {
                var5_int = var5_int + param0;
              }
              param1.field_c[var7] = param1.field_c[0] + (var5_int >> 8) + param4.a(param2.substring(0, 1 + var7)) - param4.a((char) var8);
            } else {
              param1.field_c[var7] = var6;
            }
            if (var8 != 62) {
              continue L1;
            }
            var6 = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = (RuntimeException) (var5);
          stackIn_19_1 = new StringBuilder().append("qb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    private qb() throws Throwable {
        throw new Error();
    }

    static {
        field_N = new hh();
        field_F = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_L = "Members";
    }
}
