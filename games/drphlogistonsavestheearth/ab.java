/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static long field_a;
    static String field_c;
    static int field_b;

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_c = null;
    }

    final static int a(int param0, String param1, String[] param2, rf param3, int param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var5_int = param3.b(param1);
          if (var5_int <= param0 &&
            param1.indexOf("<br>") == -1) {
            param2[0] = param1;
            stackIn_5_0 = 1;
            return stackIn_5_0;
          }
          var6 = (-1 + (var5_int + param0)) / param0;
          param0 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param1.length();
          if (param4 != 14074) {
            field_b = -21;
          }
          for (var9 = 0; var9 < var8; var9++) {
            var10 = param1.charAt(var9);
            if (var10 == 32 ||
              var10 == 45) {
              var11 = param1.substring(var7, var9 + 1).trim();
              var12 = param3.b(var11);
              if (param0 <= var12) {
                var7 = var9 + 1;
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param2[incrementValue$1] = var11;
              }
            }
            if (var10 == 62 &&
              param1.regionMatches(-3 + var9, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              param2[incrementValue$2] = param1.substring(var7, -3 + var9).trim();
              var7 = var9 + 1;
            }
          }
          if (var8 > var7) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            param2[incrementValue$0] = param1.substring(var7, var8).trim();
          }
          stackIn_30_0 = var6Lifetime1;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("ab.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param3 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(int param0) {
        int var1 = -73 % ((param0 + 67) / 51);
        return 1;
    }

    static {
        field_b = -1;
        field_c = "You are not currently logged in to the<nbsp>game.";
    }
}
