/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static int[] field_b;
    static String field_c;
    static ll[] field_a;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
          return;
        }
        field_b = null;
        field_c = null;
    }

    final static String a(boolean param0, char param1, String param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var4_int = param2.length();
          var5 = param3.length();
          var6 = var4_int;
          var7 = -1 + var5;
          if (var7 != 0) {
            var8_int = 0;
            while (true) {
              var8_int = param2.indexOf((int) param1, var8_int);
              if (var8_int < 0) {
                break;
              }
              var6 = var6 + var7;
              var8_int++;
            }
          }
          var8 = new StringBuilder(var6);
          var9 = 0;
          while (true) {
            var10 = param2.indexOf((int) param1, var9);
            if (var10 >= 0) {
              discarded$0 = var8.append(param2.substring(var9, var10));
              discarded$1 = var8.append(param3);
              var9 = 1 + var10;
              continue;
            }
            break;
          }
          discarded$2 = var8.append(param2.substring(var9));
          if (param0) {
            fb.a(false);
          }
          stackIn_14_0 = var8.toString();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("fb.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_b = new int[]{6, 7, 8};
        field_c = "Your game";
    }
}
