/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe {
    static String field_a;
    static int[] field_b;

    final static void a(ri param0, int param1, boolean param2, int param3) {
        Object var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        Object var4_ref2 = null;
        try {
          if (null != bn.field_c) {
            qh.a(param2, (byte) -56, 1048576, param0, param1);
          }
          if (ic.field_b != null) {
            var4_ref2 = ch.field_q;
            synchronized (var4_ref2) {
              ic.field_b.b(param1, -1, 94);
              if (param0 == oa.field_B) {
                return;
              }
              ic.field_b.d(19);
              ch.field_q.c();
              oa.field_B = param0;
              if (null != oa.field_B) {
                ic.field_b.a(param2, oa.field_B, (byte) 23);
              }
            }
          }
          if (param3 > 20) {
            return;
          }
          field_b = (int[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("fe.A(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1) {
          field_a = (String) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_a = "Accept <%0> into this game";
    }
}
