/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na {
    static String field_a;

    public static void releaseStatics(byte param0) {
        field_a = null;
        int var1 = 80 / ((51 - param0) / 39);
    }

    final static int a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -33) {
            field_a = (String) null;
          }
          stackIn_3_0 = tj.parseInt(10, param0, true, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("na.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        if (NodeHashTableIterator.field_e != null) {
          NodeHashTableIterator.field_e.close(-1);
          NodeHashTableIterator.field_e = null;
        }
        if (!param0) {
          field_a = (String) null;
          return;
        }
    }

    static {
        field_a = "Player names can be up to 12 letters, numbers and underscores";
    }
}
