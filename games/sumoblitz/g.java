/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class g {
    int field_d;
    static int field_c;
    static ta field_a;
    String field_b;

    public static void a(int param0) {
        int var1 = 58 % ((param0 - 20) / 45);
        field_a = null;
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var6 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param2 == null) {
            return false;
          }
          var3_int = param2.length();
          if (var3_int < 1) {
            return false;
          }
          if (var3_int > 12) {
            return false;
          }
          var4 = uk.a(-1, param2);
          if (var4 != null &&
            1 <= var4.length()) {
            if (!wv.a((byte) -124, var4.charAt(0)) &&
              !wv.a((byte) -84, var4.charAt(var4.length() - 1))) {
              var5 = 0;
              for (var6 = param1; param2.length() > var6; var6++) {
                var7 = param2.charAt(var6);
                if (wv.a((byte) -85, (char) var7)) {
                  var5++;
                } else {
                  var5 = 0;
                }
                if (var5 >= 2 &&
                  !param0) {
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
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("g.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final static dk a(byte param0, String param1) {
        dk stackIn_3_0 = null;
        dk stackIn_7_0 = null;
        dk stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        dk stackIn_24_0 = null;
        dk stackIn_38_0 = null;
        dk stackIn_43_0 = null;
        Object stackIn_49_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_3_0 = qo.field_a;
            return stackIn_3_0;
          }
          if (var2_int > 64) {
            stackIn_7_0 = cn.field_ib;
            return stackIn_7_0;
          }
          if (34 == param1.charAt(0)) {
            if (34 != param1.charAt(-1 + var2_int)) {
              stackIn_11_0 = gs.field_a;
              return stackIn_11_0;
            }
            var3 = 0;
            for (var4 = 1; var4 < -1 + var2_int; var4++) {
              var5 = param1.charAt(var4);
              if (var5 == 92) {
                stackIn_20_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_20_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_24_0 = gs.field_a;
                  return stackIn_24_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < var2_int; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param1.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (var4Lifetime1 != 0 &&
                var4Lifetime1 != var2_int - 1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_38_0 = gs.field_a;
                return stackIn_38_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (se.field_b.indexOf(var5Lifetime1) == -1) {
                stackIn_43_0 = gs.field_a;
                return stackIn_43_0;
              }
              var3Lifetime1 = 0;
            }
          }
          if (param0 <= -118) {
            return null;
          }
          field_c = -60;
          stackIn_49_0 = null;
          return (dk) (stackIn_49_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_52_0 = var2;
          stackIn_52_1 = new StringBuilder().append("g.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    abstract java.net.Socket b(byte param0) throws IOException;

    final java.net.Socket a(byte param0) throws IOException {
        if (param0 <= 94) {
          return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_b, this.field_d);
    }

    static {
    }
}
