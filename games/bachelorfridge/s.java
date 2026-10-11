/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends td {
    s(int param0, aga param1) {
        super(param0, param1);
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        vk var4 = null;
        ii stackIn_2_0 = null;
        vk stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_h.a(63, param0);
          var4 = new vk(this.field_g, new nq(var3));
          if (param1 != 3) {
            stackIn_2_0 = (ii) null;
            return stackIn_2_0;
          }
          var4.field_o.a(new iv(new nq(var3), false, 1, 0, 31), true);
          stackIn_4_0 = var4;
          return (ii) ((Object) stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("s.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
