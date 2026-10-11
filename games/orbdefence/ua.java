/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static String field_b;
    static String field_d;
    static int field_c;
    static int field_a;

    final static String a(int param0, CharSequence param1) {
        int var7 = 0;
        StringBuilder discarded$0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        StringBuilder var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param1 == null) {
            return null;
          }
          var2_int = 0;
          var3 = param1.length();
          while (var2_int < var3) {
            if (sk.a(param1.charAt(var2_int), -46)) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var3 > var2_int) {
            if (sk.a(param1.charAt(var3 - 1), -46)) {
              var3--;
              continue;
            }
            break;
          }
          var4 = -var2_int + var3;
          if (var4 < 1) {
            return null;
          }
          if (var4 > 12) {
            return null;
          }
          var5 = 64 % ((param0 - 32) / 47);
          var6 = new StringBuilder(var4);
          for (var7 = var2_int; var3 > var7; var7++) {
            var8 = param1.charAt(var7);
            if (tc.a((byte) -20, (char) var8)) {
              var9 = p.a((char) var8, 33);
              if (0 != var9) {
                discarded$0 = var6.append((char) var9);
              }
            }
          }
          if (0 != var6.length()) {
            return var6.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_30_0 = var2;
          stackIn_30_1 = new StringBuilder().append("ua.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        param0--;
        if (param1 != 0) {
          CharSequence var3 = (CharSequence) null;
          ua.a(23, (CharSequence) null);
        }
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        param0 = param0 | param0 >>> 16;
        return param0 + 1;
    }

    final static hj[] a(ki param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        hj[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        hj[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 32) {
            stackIn_2_0 = (hj[]) null;
            return stackIn_2_0;
          }
          if (pk.a(-52, param1, param0, param3)) {
            stackIn_7_0 = sl.d((byte) -85);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (hj[]) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ua.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -415277564) {
          field_b = (String) null;
        }
        field_d = null;
        field_b = null;
    }

    static {
        field_b = "BLIZZARD WAVE";
        field_d = "STORM BOLT";
        field_a = 0;
    }
}
