/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static int field_a;
    static String field_b;

    final static boolean a(char param0, byte param1) {
        boolean stackIn_9_0 = false;
        if (param1 > -55) {
          return true;
        }
        stackIn_9_0 = (param0 == 160) || (32 == param0) || (param0 == 95) || (param0 == 45);
        return stackIn_9_0;
    }

    final static q a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_7_0 = null;
        q stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = 0;
          while (true) {
            if (var3 >= var2_int) {
              if (param0) {
                field_a = -121;
              }
              stackIn_12_0 = vc.field_N;
              return stackIn_12_0;
            }
            var4 = param1.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 <= 57) {
              var3++;
              continue;
            }
            break;
          }
          stackIn_7_0 = null;
          return (q) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("uf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 < 43) {
          field_a = 114;
        }
    }

    final static boolean a(byte param0) {
        if (param0 != -76) {
          uf.a(60);
        }
        return !dl.field_l.b(-26753) ? true : false;
    }

    static {
        field_a = 20;
        field_b = "Create your own free Jagex account";
    }
}
