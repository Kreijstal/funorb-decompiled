/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static boolean clearGameplayDuringTransition;
    static Sprite transitionCurtain;
    static ck field_a;

    public static void a(byte param0) {
        transitionCurtain = null;
        field_a = null;
        if (param0 != -23) {
            qj.b((byte) 28);
        }
    }

    final static int b(byte param0) {
        if (param0 != 81) {
            qj.b((byte) -12);
            return rd.field_u;
        }
        return rd.field_u;
    }

    final static String a(String param0, String param1, char param2, byte param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = Geoblox.field_C;
        try {
          var4_int = param0.length();
          var5 = param1.length();
          if (param3 < 79) {
            clearGameplayDuringTransition = false;
          }
          L1: {
            var6 = var4_int;
            var7 = var5 - 1;
            if (0 != var7) {
              var8_int = 0;
              while (true) {
                var8_int = param0.indexOf((int) param2, var8_int);
                if (var8_int < 0) {
                  break L1;
                }
                var6 = var6 + var7;
                var8_int++;
                continue;
              }
            }
          }
          var8 = new StringBuilder(var6);
          var9 = 0;
          while (true) {
            var10 = param0.indexOf((int) param2, var9);
            if (var10 < 0) {
              discarded$2 = var8.append(param0.substring(var9));
              stackIn_13_0 = var8.toString();
              return stackIn_13_0;
            }
            discarded$0 = var8.append(param0.substring(var9, var10));
            var9 = 1 + var10;
            discarded$1 = var8.append(param1);
            continue;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = (RuntimeException) (var4);
          stackIn_16_1 = new StringBuilder().append("qj.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_a = new ck(10, 2, 2, 0);
    }
}
