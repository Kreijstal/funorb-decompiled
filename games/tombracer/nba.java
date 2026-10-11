/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nba {
    static int field_b;
    static int[] field_a;

    final static void a(ff param0, la param1, byte param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!vpa.a(76) &&
            !param0.k(-25319)) {
            if (param1.q((byte) -82) < 0) {
              return;
            }
            ql.field_k.k(98, -2988);
            ql.field_k.f(-1477662136, param1.q((byte) -82));
            var3_int = 8 % ((param2 - 51) / 36);
            ql.field_k.f(-1477662136, param1.a((byte) 107));
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("nba.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(fia param0, sq param1, int param2, int param3, int param4, java.awt.Component param5, int param6, boolean param7) {
        try {
          kta.a(param3, param7, 10);
          ipa.field_P = kta.a(param0, param5, 0, param4);
          int var8_int = 22 % ((50 - param6) / 54);
          gg.field_b = kta.a(param0, param5, 1, param2);
          kva.field_n = new en();
          ov.field_p = param2;
          gg.field_b.b(kva.field_n);
          tva.field_d = param1;
          tva.field_d.a((byte) 100, ff.field_w);
          ipa.field_P.b(tva.field_d);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nba.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          nba.a(true);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
    }
}
