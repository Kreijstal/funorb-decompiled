/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static ff field_a;
    static dl field_c;
    static boolean field_b;

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          if (!qk.a(param1, param0, -2)) {
            return false;
          }
          if (param2 > -30) {
            field_a = (ff) null;
          }
          for (var3_int = 0; param1.length() > var3_int; var3_int++) {
            if (!wg.a(param1.charAt(var3_int), (byte) -128)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("wh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 25817) {
          field_c = (dl) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_a = new ff(12, 0, 1, 0);
    }
}
