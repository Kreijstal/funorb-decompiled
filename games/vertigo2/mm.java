/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    static String field_b;
    static volatile int field_a;

    final static void a(int param0, s param1, byte param2) {
        mi var3 = uh.field_Wb;
        if (param2 != 108) {
          return;
        }
        try {
          var3.j(param0, 118);
          var3.f(5, 105);
          var3.f(0, -82);
          var3.d(param1.field_p, -1783);
          var3.f(param1.field_q, param2 - 202);
          var3.f(param1.field_o, -69);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "mm.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 < 104) {
          tn var2 = (tn) null;
          mm.a((tn) null, -99);
        }
    }

    final static int a(tn param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          var2_int = lj.field_p;
          if (param0.field_s == 2) {
            if (param0.field_n) {
              var2_intLifetime1 = lj.field_p;
            } else {
              if (param0.field_o == 0 &&
                0 == param0.field_m) {
                var2_intLifetime1 = gg.field_n[param0.field_s];
              } else {
                var2_intLifetime1 = wc.field_q[param0.field_s];
              }
            }
          } else {
            if (param0.field_s != 4) {
              if (~param0.field_b != ~ao.field_N) {
                var2_intLifetime1 = wc.field_q[param0.field_s];
              } else {
                var2_intLifetime1 = gg.field_n[param0.field_s];
              }
            } else {
              var2_intLifetime1 = wc.field_q[param0.field_s];
            }
          }
          if (param1 == 0) {
            stackIn_17_0 = var2_intLifetime1;
            return stackIn_17_0;
          }
          stackIn_15_0 = -83;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("mm.E(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int[] a(int param0) {
        if (param0 != 8) {
          return (int[]) null;
        }
        return new int[8];
    }

    final static boolean b(int param0) {
        if (param0 != -12942) {
          mm.b(-83);
          if (!ag.b(49)) {
            return q.field_y <= 0 ? true : false;
          }
          return true;
        }
        if (ag.b(49)) {
          return true;
        }
        if (q.field_y > 0) {
          return false;
        }
        return true;
    }

    static {
        field_a = 0;
        field_b = "Solicitation";
    }
}
