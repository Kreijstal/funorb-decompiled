/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nqa {
    static boolean field_c;
    static boolean[][] field_b;
    static volatile boolean field_a;

    final static Object a(ij param0, int param1) {
        ksa var2 = null;
        int var3 = 0;
        Object stackIn_6_0 = null;
        ksa stackIn_14_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = VoidHunters.field_G;
        try {
          if (!ls.field_q) {
            return null;
          }
          if (param1 != 12642) {
            stackIn_6_0 = (Object) null;
            return stackIn_6_0;
          }
          if (param0 == null) {
            return null;
          }
          var2 = param0.d(0);
          while (true) {
            if (var2 == null) {
              return null;
            }
            if (!VoidHunters.a(true, var2)) {
              var2 = param0.a((byte) 98);
              continue;
            }
            break;
          }
          stackIn_14_0 = var2;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_19_0 = var2_ref;
          stackIn_19_1 = new StringBuilder().append("nqa.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != -30) {
          return;
        }
        field_b = (boolean[][]) null;
    }

    static {
        field_c = false;
        field_a = true;
    }
}
