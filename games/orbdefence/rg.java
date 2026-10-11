/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class rg {
    int field_b;
    String field_a;

    abstract java.net.Socket b(int param0) throws IOException;

    final java.net.Socket a(int param0) throws IOException {
        if (param0 != -5942) {
          return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_a, this.field_b);
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_28_0 = null;
        String stackIn_33_0 = null;
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
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param1 == null) {
            stackIn_4_0 = ei.field_a;
            return stackIn_4_0;
          }
          var3_int = param1.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = ua.a(param2 ^ -47, param1);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!sk.a(var4.charAt(0), -46) &&
                !sk.a(var4.charAt(-1 + var4.length()), -46)) {
                var5 = param2;
                for (var6 = 0; var6 < param1.length(); var6++) {
                  var7 = param1.charAt(var6);
                  if (sk.a((char) var7, -46)) {
                    var5++;
                  } else {
                    var5 = 0;
                  }
                  if (var5 >= 2 &&
                    !param0) {
                    stackIn_28_0 = im.field_b;
                    return stackIn_28_0;
                  }
                }
                if (var5 <= 0) {
                  return null;
                }
                stackIn_33_0 = rl.field_c;
                return stackIn_33_0;
              }
              stackIn_19_0 = rl.field_c;
              return stackIn_19_0;
            }
            stackIn_14_0 = ei.field_a;
            return stackIn_14_0;
          }
          stackIn_9_0 = ei.field_a;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("rg.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
