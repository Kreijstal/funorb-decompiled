/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g implements j {
    private int field_h;
    private int field_b;
    private int field_e;
    private int field_d;
    private int field_f;
    private int field_g;
    private eg field_a;
    static ka[][][] field_i;
    private int field_c;

    final static String a(String param0, byte param1, java.applet.Applet param2) {
        try {
          int var6 = 0;
          int var3_int = 0;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String stackIn_7_0 = null;
          Object stackIn_12_0 = null;
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var3 = null;
          Throwable var4_ref = null;
          var8 = TorChallenge.field_F ? 1 : 0;
          try {
            var3_int = -68 % ((param1 + 48) / 58);
            try {
              var4 = (String) (ff.a("getcookies", param2, 20511));
              var5 = dl.a(var4, ';', -75);
              for (var6 = 0; var5.length > var6; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(param0)) {
                  stackIn_7_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_7_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
            }
            stackIn_12_0 = null;
            return (String) (stackIn_12_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var3;
            stackIn_15_1 = new StringBuilder().append("g.C(");
            if (param0 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw oj.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_i = (ka[][][]) null;
        if (param0 != 28215) {
          field_i = (ka[][][]) null;
        }
    }

    final static boolean a(int param0, int param1) {
        if (param0 <= 76) {
          return true;
        }
        if (-1 != param1) {
          return 0 != (1 << param1 & lb.field_s) ? true : false;
        }
        return true;
    }

    public final void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        uc var14 = null;
        int var7 = 0;
        int var8 = 0;
        int var13 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        double var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          var14 = !(param0 instanceof uc) ? null : (uc) (param0);
          qg.f(param0.field_m + param2, param1 + param0.field_i, param0.field_p, param0.field_l, this.field_c);
          if (var14 == null) {
          }
          var7 = var14.field_S + param0.field_m + param2;
          var8 = param1 + (param0.field_i + var14.field_W);
          qg.e(var7, var8, var14.field_V, this.field_d);
          if (var14.field_O != -1) {
            var9 = 3.141592653589793 * (double)var14.field_O * 2.0 / (double)var14.field_Q;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_V);
            var12 = (int)(Math.cos(var9) * (double)var14.field_V);
            qg.e(var11 + var7, var8 + var12, 1, this.field_h);
          }
          qg.e(var7, var8, 2, 1);
          var9Lifetime1 = 2.0 * ((double)var14.field_P * 3.141592653589793) / (double)var14.field_Q;
          if (param3 != 97) {
            this.field_d = 76;
          }
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var14.field_V);
          var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var14.field_V);
          qg.d(var7, var8, var7 + var11Lifetime1, var12Lifetime1 + var8, 1);
          if (this.field_a != null) {
            var13 = var14.field_V + var14.field_S + this.field_g;
            this.field_a.a(param0.field_v, var13 + (param0.field_m + param2), this.field_f + (param1 + param0.field_i), -this.field_g + (-var13 + param0.field_p), -(this.field_g << 1) + param0.field_l, this.field_e, this.field_b, 1, 1, 0);
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "g.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    g(eg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_g = param1;
          this.field_f = param2;
          this.field_a = param0;
          this.field_b = param4;
          this.field_c = param7;
          this.field_h = param6;
          this.field_d = param5;
          this.field_e = param3;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "g.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_i = new ka[16][3][];
    }
}
