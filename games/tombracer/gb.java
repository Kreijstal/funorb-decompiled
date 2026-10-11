/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static int field_a;

    final static void a(int param0) {
        bd var1 = null;
        bd var1Lifetime1;
        if (param0 == -29711) {
          var1 = (bd) (vt.field_a.c((byte) 22));
          if (var1 == null) {
            var1 = new bd();
          }
          var1.a(bea.field_g, bea.field_l, 116, bea.field_d, bea.field_h, bea.field_b, bea.field_a, bea.field_k);
          gg.field_e.b((byte) -111, var1);
          return;
        }
        ha var2 = (ha) null;
        gb.a((oc) null, -85, (ha) null);
        var1Lifetime1 = (bd) (vt.field_a.c((byte) 22));
        if (var1Lifetime1 == null) {
          var1Lifetime1 = new bd();
        }
        var1Lifetime1.a(bea.field_g, bea.field_l, 116, bea.field_d, bea.field_h, bea.field_b, bea.field_a, bea.field_k);
        gg.field_e.b((byte) -111, var1Lifetime1);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static ka a(oc param0, int param1, ha param2) {
        RuntimeException var3 = null;
        ka stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (param1 != 128) {
            field_a = 94;
          }
          stackIn_6_0 = param2.a(param0, 654255, 23, 128, 128);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("gb.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
    }
}
