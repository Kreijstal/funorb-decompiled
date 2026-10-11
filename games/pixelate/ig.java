/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static tc field_d;
    static io field_e;
    static String field_c;
    static tf[][] field_a;
    static fm field_b;

    final static String a(int param0, char param1) {
        if (param0 < 123) {
          return (String) null;
        }
        return String.valueOf(param1);
    }

    final static id a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        id stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 200) {
            field_b = (fm) null;
          }
          if (qo.field_n == rj.field_F) {
            stackIn_4_0 = null;
            return (id) (stackIn_4_0);
          }
          if (qo.field_n == h.field_N &&
            param1.equals(uh.field_m)) {
            qo.field_n = wm.field_a;
            stackIn_8_0 = jc.field_f;
            return stackIn_8_0;
          }
          qo.field_n = rj.field_F;
          uh.field_m = param1;
          jc.field_f = null;
          stackIn_10_0 = null;
          return (id) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ig.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = (tf[][]) null;
        field_c = null;
        field_b = null;
        int var1 = 113 % ((-66 - param0) / 54);
        field_e = null;
        field_d = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        cm var2 = null;
        int var3 = 0;
        boolean stackIn_18_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        cm var2Lifetime1;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          to.field_t.b();
          ib.field_h.b();
          var1_int = -121 % ((param0 - 54) / 39);
          e.field_a = e.field_a - 1;
          if (e.field_a == 0) {
            e.field_a = 200;
            var2 = (cm) (bo.field_d.c(1504642273));
            while (var2 != null) {
              if (!var2.field_k.b(0)) {
                var2.c(2779);
              }
              var2 = (cm) (bo.field_d.f(1504642273));
            }
            if (rg.field_b != null) {
              var2Lifetime1 = (cm) (rg.field_b.c(1504642273));
              while (var2Lifetime1 != null) {
                if (!var2Lifetime1.field_k.b(0)) {
                  var2Lifetime1.c(2779);
                }
                var2Lifetime1 = (cm) (rg.field_b.f(1504642273));
              }
            }
          }
          if ((null != to.field_q) &&
            (stackIn_18_0 = to.field_q.a((byte) -123))) {
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "ig.B(" + param0 + ')');
        }
    }

    static {
        field_c = "OK";
        field_e = new io("email");
    }
}
