/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri implements j {
    static int field_f;
    private int field_b;
    static String field_d;
    static String field_a;
    private int field_c;
    private mg field_e;

    final static boolean a(int param0, int param1) {
        if (param0 != -6873) {
          field_f = -71;
        }
        return (-param1 & param1) == param1 ? true : false;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        if (param0) {
          field_f = 91;
        }
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        int stackIn_6_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          if (!param4.field_v &&
            !param4.b(true)) {
            stackIn_6_0 = 2188450;
          } else {
            stackIn_6_0 = 3249872;
          }
          var6_int = stackIn_6_0;
          this.field_e.a("<u=" + Integer.toString(var6_int, 16) + ">" + param4.field_i + "</u>", param3 + param4.field_m, param1 + param4.field_j, param4.field_t, param4.field_x, var6_int, -1, this.field_b, this.field_c, this.field_e.field_s + this.field_e.field_F);
          if (param0 < 113) {
            return;
          }
          if (param4.b(true)) {
            var7 = this.field_e.b(param4.field_i);
            var8 = this.field_e.field_s + this.field_e.field_F;
            var9 = param3 + param4.field_m;
            if (this.field_b != 2) {
              if (this.field_b == 1) {
                var9 = var9 + (-var7 + param4.field_t >> 1);
              }
            } else {
              var9 = var9 + (param4.field_t - var7);
            }
            var10 = param4.field_j + param1;
            if (this.field_c != 2) {
              if (this.field_c == 1) {
                var10 = var10 + (param4.field_x - var8 >> 1);
              }
            } else {
              var10 = var10 + (-var8 + param4.field_x);
            }
            ci.a(var7 + 4, 2 + var10, var8, var9 - 2, (byte) 125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("ri.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, byte param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = SolKnight.field_L ? 1 : 0;
        try {
          if (param1 <= param6) {
            return;
          }
          if (param6 + 1 >= param3) {
            return;
          }
          if (param6 + 5 < param3 &&
            param0 != param5) {
            var7_int = (1 & (param5 & param0)) + ((param0 >> 1) + (param5 >> 1));
            var8 = param6;
            var9 = param0;
            var10 = param5;
            for (var11 = param6; var11 < param3; var11++) {
              var12 = pd.field_e[var11];
              if (!param2) {
                stackIn_24_0 = l.field_a[var12];
              } else {
                stackIn_24_0 = qg.field_c[var12];
              }
              var13 = stackIn_24_0;
              if (var13 > var7_int) {
                pd.field_e[var11] = pd.field_e[var8];
                if (var13 < var9) {
                  var9 = var13;
                }
                incrementValue$0 = var8;
                var8++;
                pd.field_e[incrementValue$0] = var12;
              } else {
                if (var10 < var13) {
                  var10 = var13;
                }
              }
            }
            ri.a(param0, param1, param2, var8, (byte) -81, var9, param6);
            ri.a(var10, param1, param2, param3, param4, param5, var8);
            return;
          }
          for (var7_intLifetime1 = -1 + param3; param6 < var7_intLifetime1; var7_intLifetime1--) {
            for (var8Lifetime1 = param6; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = pd.field_e[var8Lifetime1];
              var10Lifetime1 = pd.field_e[1 + var8Lifetime1];
              if (ec.a(var9Lifetime1, -66, param2, var10Lifetime1)) {
                pd.field_e[var8Lifetime1] = var10Lifetime1;
                pd.field_e[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var7), "ri.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public ri() {
        this.field_e = ua.field_G;
        this.field_b = 1;
        this.field_c = 1;
    }

    ri(mg param0, int param1, int param2) {
        try {
          this.field_e = param0;
          this.field_b = param1;
          this.field_c = param2;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "ri.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = "Waiting for fonts";
    }
}
