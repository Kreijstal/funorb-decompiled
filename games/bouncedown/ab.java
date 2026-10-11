/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab extends ai {
    static String field_g;
    int field_h;

    public static void b(byte param0) {
        if (param0 >= -40) {
          return;
        }
        field_g = null;
    }

    ab(int param0) {
        this.field_h = param0;
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Bounce.field_N;
        try {
          if (param1 != -12) {
            return true;
          }
          var2_int = param0.charAt(0);
          var3 = 1;
          while (true) {
            if (var3 >= param0.length()) {
              return true;
            }
            if (param0.charAt(var3) == var2_int) {
              var3++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ab.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_g = "Cancel";
    }
}
