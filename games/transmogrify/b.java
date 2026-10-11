/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends wf {
    byte[] field_h;
    long field_g;
    static vl field_i;
    static int field_k;
    int field_j;

    public static void d(int param0) {
        field_i = null;
        if (param0 != -22826) {
          field_i = (vl) null;
        }
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 24) {
            stackIn_6_0 = (null != mk.a(param1 ^ 108, param0));
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("b.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    b(long param0, int param1, byte[] param2) {
        try {
          this.field_g = param0;
          this.field_j = param1;
          this.field_h = param2;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "b.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = 0;
    }
}
