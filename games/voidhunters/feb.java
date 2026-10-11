/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class feb {
    static aba field_a;
    static int[] field_b;

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 122) {
          return;
        }
        field_b = null;
    }

    final static kla a(ha param0, boolean param1) {
        qgb var2 = null;
        kla var3 = null;
        kla stackIn_3_0 = null;
        kla stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (nsa.field_p == param0) {
            stackIn_3_0 = eia.field_q;
            return stackIn_3_0;
          }
          var2 = (qgb) (fgb.field_k.a((long)param0.field_b, 124));
          if (!param1) {
            field_b = (int[]) null;
          }
          if (var2 != null &&
            var2.field_e == param0) {
            var3 = var2.field_d;
          } else {
            if (var2 != null) {
              var2.b(-3846);
            }
            var3 = new kla(param0);
            fgb.field_k.a((long)param0.field_b, new qgb(param0, var3), (byte) -127);
          }
          nsa.field_p = param0;
          eia.field_q = var3;
          stackIn_15_0 = var3;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_18_0 = var2_ref;
          stackIn_18_1 = new StringBuilder().append("feb.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = new aba();
    }
}
