/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static o field_d;
    static ok field_c;
    static java.awt.Image field_b;
    static int field_a;

    final static String a(CharSequence param0, byte param1, boolean param2) {
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_30_0 = null;
        String stackIn_35_0 = null;
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
        var8 = wizardrun.field_H;
        try {
          if (param0 == null) {
            stackIn_4_0 = kc.field_J;
            return stackIn_4_0;
          }
          var3_int = param0.length();
          if (1 <= var3_int &&
            var3_int <= 12) {
            var4 = ta.a(-76, param0);
            if (param1 > -33) {
              hg.a(123, (byte) 15);
            }
            if (var4 != null &&
              var4.length() >= 1) {
              if (!d.a(true, var4.charAt(0)) &&
                !d.a(true, var4.charAt(var4.length() - 1))) {
                var5 = 0;
                for (var6 = 0; var6 < param0.length(); var6++) {
                  var7 = param0.charAt(var6);
                  if (d.a(true, (char) var7)) {
                    var5++;
                  } else {
                    var5 = 0;
                  }
                  if (var5 >= 2 &&
                    !param2) {
                    stackIn_30_0 = ll.field_g;
                    return stackIn_30_0;
                  }
                }
                if (var5 <= 0) {
                  return null;
                }
                stackIn_35_0 = lg.field_c;
                return stackIn_35_0;
              }
              stackIn_21_0 = lg.field_c;
              return stackIn_21_0;
            }
            stackIn_16_0 = kc.field_J;
            return stackIn_16_0;
          }
          stackIn_9_0 = kc.field_J;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("hg.C(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          hg.a(0, (byte) -66);
        }
        field_c = null;
        field_b = null;
        field_d = null;
    }

    final static int b(int param0, byte param1) {
        if (param1 != -89) {
          field_a = 68;
        }
        return cj.field_e[2047 & param0];
    }

    final static void a(int param0, byte param1) {
        mg var2 = n.field_b;
        var2.c((byte) -70, param0);
        var2.b((byte) 11, 1);
        if (param1 != 106) {
          hg.a(-86, (byte) 34);
        }
        var2.b((byte) 11, 2);
    }

    static {
        field_c = new ok();
    }
}
