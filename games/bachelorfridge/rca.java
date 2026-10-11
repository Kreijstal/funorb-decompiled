/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rca extends bw {
    int field_g;
    int field_f;

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        CharSequence[] var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            var3 = (CharSequence[]) null;
            rca.a(80, (CharSequence[]) null);
          }
          stackIn_3_0 = oq.a(param1, 0, param1.length, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("rca.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    rca(int param0, int param1) {
        this.field_f = param1;
        this.field_g = param0;
    }

    static {
    }
}
