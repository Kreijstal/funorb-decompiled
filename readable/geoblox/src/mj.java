/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static byte[][] decodedSpriteIndices;
    static int field_b;
    static String fullscreenAcceptCountdownSingularText;

    final static String a(int param0, int param1, CharSequence[] param2, byte param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = Geoblox.field_C;
        try {
          if (param1 == 0) {
            stackIn_4_0 = "";
            return stackIn_4_0;
          }
          if (param1 == 1) {
            var10 = param2[param0];
            var4 = var10;
            if (var4 != null) {
              stackIn_11_0 = var10.toString();
              return stackIn_11_0;
            }
            stackIn_9_0 = "null";
            return stackIn_9_0;
          }
          var4_int = param0 + param1;
          var5 = 0;
          if (param3 != 96) {
            field_b = 111;
          }
          for (var6_int = param0; var4_int > var6_int; var6_int++) {
            var7_ref_CharSequence = param2[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param0; var4_int > var7; var7++) {
            var8 = param2[var7];
            if (var8 != null) {
              discarded$0 = var6.append(var8);
            } else {
              discarded$1 = var6.append("null");
            }
          }
          stackIn_27_0 = var6.toString();
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = (RuntimeException) (var4_ref);
          stackIn_30_1 = new StringBuilder().append("mj.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(')').toString());
        }
    }

    final static nd a(String param0, byte param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        nd stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Geoblox.field_C;
        try {
          var2_int = param0.length();
          if (param1 > -34) {
            fullscreenAcceptCountdownSingularText = (String) null;
          }
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param0.charAt(var3);
            if (48 > var4) {
              return null;
            }
            if (var4 > 57) {
              return null;
            }
          }
          stackIn_12_0 = ii.field_h;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = (RuntimeException) (var2);
          stackIn_15_1 = new StringBuilder().append("mj.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        fullscreenAcceptCountdownSingularText = null;
        decodedSpriteIndices = (byte[][]) null;
        if (param0 < 66) {
            field_b = 91;
        }
    }

    static {
        fullscreenAcceptCountdownSingularText = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
