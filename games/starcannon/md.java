/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md {
    static int field_c;
    static String field_b;
    static int field_a;

    final static String a(boolean param0, CharSequence param1, byte param2) {
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_15_0 = null;
        String stackIn_20_0 = null;
        String stackIn_29_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        var8 = StarCannon.field_A;
        try {
          if (param1 == null) {
            stackIn_3_0 = vj.field_W;
            return stackIn_3_0;
          }
          var3_int = param1.length();
          if (var3_int >= 1 &&
            12 >= var3_int) {
            if (param2 != -81) {
              var9 = (String) null;
              md.a(-31, (String) null);
            }
            var4 = ni.a(116, param1);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!dk.a((byte) -123, var4.charAt(0)) &&
                !dk.a((byte) -124, var4.charAt(var4.length() - 1))) {
                var5 = 0;
                for (var6 = 0; param1.length() > var6; var6++) {
                  var7 = param1.charAt(var6);
                  if (dk.a((byte) -128, (char) var7)) {
                    var5++;
                  } else {
                    var5 = 0;
                  }
                  if (var5 >= 2 &&
                    !param0) {
                    stackIn_29_0 = te.field_c;
                    return stackIn_29_0;
                  }
                }
                if (var5 <= 0) {
                  return null;
                }
                stackIn_34_0 = v.field_c;
                return stackIn_34_0;
              }
              stackIn_20_0 = v.field_c;
              return stackIn_20_0;
            }
            stackIn_15_0 = vj.field_W;
            return stackIn_15_0;
          }
          stackIn_8_0 = vj.field_W;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("md.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -27240) {
          return;
        }
        field_b = null;
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            field_b = (String) null;
          }
          if (param1 != null &&
            param1.length() >= rj.field_j &&
            param1.length() <= wc.field_a) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("md.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_c = 4;
        field_a = -1;
    }
}
