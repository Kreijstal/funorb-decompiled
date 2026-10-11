/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static int[][] field_a;

    final static int a(byte param0, char param1, CharSequence param2) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param0 != -72) {
            field_a = (int[][]) null;
          }
          var3_int = 0;
          var4 = param2.length();
          for (var5 = 0; var4 > var5; var5++) {
            if (param1 == param2.charAt(var5)) {
              var3_int++;
            }
          }
          stackIn_10_0 = var3_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("wd.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static String a(boolean param0, CharSequence param1, byte param2) {
        int var5 = 0;
        String var3 = null;
        int var4 = 0;
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          var4 = -81 / ((param2 + 41) / 45);
          var3 = fj.a(param1, 100, param0);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          for (var5 = 0; param1.length() > var5; var5++) {
            if (!ee.a(37, param1.charAt(var5))) {
              stackIn_11_0 = wh.field_c;
              return stackIn_11_0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("wd.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = (int[][]) null;
        if (param0 < 1) {
          CharSequence var2 = (CharSequence) null;
          wd.a((byte) -59, '\013', (CharSequence) null);
        }
    }

    static {
    }
}
