/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static jta field_a;
    static fp field_c;
    static String field_b;
    static uca[] field_d;

    public static void a(int param0) {
        if (param0 == -1) {
          field_d = null;
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        }
        CharSequence var2 = (CharSequence) null;
        ej.a(false, false, (CharSequence) null);
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static boolean a(boolean param0, boolean param1, CharSequence param2) {
        int var6 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 == null) {
            return false;
          }
          var3_int = param2.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            if (param0) {
              ej.a(-107);
            }
            var4 = jd.a(1, param2);
            if (var4 == null) {
              return false;
            }
            if (var4.length() < 1) {
              return false;
            }
            if (!hf.a(-62, var4.charAt(0)) &&
              !hf.a(114, var4.charAt(-1 + var4.length()))) {
              var5 = 0;
              for (var6 = 0; param2.length() > var6; var6++) {
                var7 = param2.charAt(var6);
                if (!hf.a(-73, (char) var7)) {
                  var5 = 0;
                } else {
                  var5++;
                }
                if (var5 >= 2 &&
                  !param1) {
                  return false;
                }
              }
              if (var5 <= 0) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("ej.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    static {
        field_b = "Close";
        field_c = new fp();
    }
}
