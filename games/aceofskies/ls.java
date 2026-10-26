/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ls extends IOException {
    ls(String param0) {
        super(param0);
    }

    final static void a(boolean param0, byte param1) {
        ul.a(param0, true, param1 - 7358);
        if (param1 != -37) {
          ls.a(false, (byte) -113);
        }
    }

    final static String a(CharSequence param0, boolean param1, byte param2) {
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_28_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param0 == null) {
            stackIn_4_0 = rn.field_c;
            return stackIn_4_0;
          }
          var3_int = param0.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = vu.a(param2 + 104, param0);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!za.a((byte) 117, var4.charAt(0)) &&
                !za.a((byte) 117, var4.charAt(-1 + var4.length()))) {
                var5 = 0;
                for (var6 = 0; param0.length() > var6; var6++) {
                  var7 = param0.charAt(var6);
                  if (!za.a((byte) 117, (char) var7)) {
                    var5 = 0;
                  } else {
                    var5++;
                  }
                  if (var5 >= 2 &&
                    !param1) {
                    stackIn_28_0 = jn.field_u;
                    return stackIn_28_0;
                  }
                }
                if (param2 != 21) {
                  var9 = (CharSequence) null;
                  ls.a((CharSequence) null, true, (byte) -120);
                }
                if (var5 <= 0) {
                  return null;
                }
                stackIn_35_0 = hd.field_a;
                return stackIn_35_0;
              }
              stackIn_19_0 = hd.field_a;
              return stackIn_19_0;
            }
            stackIn_14_0 = rn.field_c;
            return stackIn_14_0;
          }
          stackIn_9_0 = rn.field_c;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("ls.A(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
