/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    static java.math.BigInteger field_b;
    static boolean field_a;

    final static void a(int param0, String param1, String[] param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_13_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Torquing.field_u;
        try {
          if (param0 != -5006) {
            field_a = true;
          }
          bh.field_a = ag.field_c;
          if (255 != param3) {
            if (param3 < 100) {
              ua.field_b = pg.a(param3, param1, -1);
              return;
            }
            if (param3 <= 105) {
              ua.field_b = di.a(0, param2);
              return;
            }
            ua.field_b = pg.a(param3, param1, -1);
            return;
          }
          stackIn_12_0 = 90;
          stackIn_13_1 = !(13 <= oh.field_d);
          ua.field_b = pa.b(stackIn_12_0, stackIn_13_1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("gk.B(").append(param0).append(',');
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
          throw rb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = -55 / ((53 - param0) / 58);
    }

    final static t[] a(int param0, int param1, la param2, int param3) {
        RuntimeException var4 = null;
        la var5 = null;
        t[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!nd.a(param1, param2, -1, param3)) {
            return null;
          }
          if (param0 != 105) {
            var5 = (la) null;
            gk.a(-107, 81, (la) null, 37);
          }
          stackIn_6_0 = tb.a(true);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("gk.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_b = new java.math.BigInteger("65537");
    }
}
