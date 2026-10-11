/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    int field_c;
    int field_a;
    static String field_b;

    final static ee a(int param0, int param1, int param2, vr param3) {
        RuntimeException var4 = null;
        ee stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!g.a(param1, param0, -30744, param3)) {
            return null;
          }
          if (param2 != 0) {
            aj.a((byte) -31, -21);
          }
          stackIn_6_0 = dr.b(param2 - 32124);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("aj.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_a = param2;
        this.field_c = param1;
        if (param0 != -1) {
          field_b = (String) null;
        }
    }

    public static void a(int param0) {
        if (param0 < 41) {
          field_b = (String) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static int a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        vr var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          if (param0 != -20) {
            var4 = (vr) null;
            aj.a(-51, -127, 29, (vr) null);
          }
          var2_int = 0;
          while (true) {
            if (var2_int >= 29) {
              stackIn_10_0 = -1;
              return stackIn_10_0;
            }
            if (qe.field_q[var2_int] != param1) {
              var2_int++;
              continue;
            }
            break;
          }
          stackIn_7_0 = var2_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "aj.A(" + param0 + ',' + param1 + ')');
        }
    }

    aj(int param0, int param1) {
        this.a(-1, param0, param1);
    }

    aj(aj param0) {
        try {
          this.a(-1, param0.field_c, param0.field_a);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "aj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0) {
        int var1 = 74 / ((11 - param0) / 63);
        return !ut.field_m.a(false) ? true : false;
    }

    static {
        field_b = "Played";
    }
}
