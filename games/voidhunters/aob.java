/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aob extends rqa {
    static volatile boolean field_o;

    final static int a(int param0, int param1) {
        if (param0 != 29554) {
          return -94;
        }
        if (!btb.field_a) {
          return 16742263 + 2243266 * param1;
        }
        return hab.field_g[param1].a(14951);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, 111);
          }
          stackIn_3_0 = new nc(gcb.field_p);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("aob.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    aob(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = true;
    }
}
