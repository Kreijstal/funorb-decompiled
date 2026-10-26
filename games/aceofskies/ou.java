/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ou extends wt {
    static char[] field_n;

    ou() {
    }

    final static boolean a(int param0, CharSequence param1, boolean param2) {
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
        var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param1 == null) {
            return false;
          }
          var3_int = param1.length();
          if (var3_int < 1) {
            return false;
          }
          if (var3_int > 12) {
            return false;
          }
          var4 = vu.normalizePlayerName(127, param1);
          if (var4 != null &&
            1 <= var4.length()) {
            if (!za.a((byte) 117, var4.charAt(0)) &&
              !za.a((byte) 117, var4.charAt(-1 + var4.length()))) {
              if (param0 != 19069) {
                return true;
              }
              var5 = 0;
              for (var6 = 0; var6 < param1.length(); var6++) {
                var7 = param1.charAt(var6);
                if (za.a((byte) 117, (char) var7)) {
                  var5++;
                } else {
                  var5 = 0;
                }
                if (var5 >= 2 &&
                  !param2) {
                  return false;
                }
              }
              if (0 >= var5) {
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
          stackIn_39_1 = new StringBuilder().append("ou.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_n = null;
        if (param0 != 108) {
          field_n = (char[]) null;
        }
    }

    static {
        field_n = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
