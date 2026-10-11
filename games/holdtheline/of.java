/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    final static boolean a(int param0) {
        if (param0 != -969) {
          return true;
        }
        if (pj.b((byte) 87)) {
          return false;
        }
        if (0 >= fc.field_a) {
          return false;
        }
        return true;
    }

    final static int a(int param0, CharSequence param1, char param2) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = HoldTheLine.field_D;
        try {
          var3_int = param0;
          var4 = param1.length();
          for (var5 = 0; var4 > var5; var5++) {
            if (param1.charAt(var5) == param2) {
              var3_int++;
            }
          }
          stackIn_8_0 = var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("of.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
