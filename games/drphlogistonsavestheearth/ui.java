/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    static vj field_a;

    final static void a(int param0, int param1) {
        wi.b(-1);
        if (param1 != 1) {
          vj var3 = (vj) null;
          ui.a((ec) null, (byte) 78, 8, (vj) null);
        }
    }

    public static void a(int param0) {
        if (param0 != -19662) {
          return;
        }
        field_a = null;
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_10_0 = null;
        String stackIn_15_0 = null;
        String stackIn_20_0 = null;
        String stackIn_30_0 = null;
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
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param1 == null) {
            stackIn_3_0 = p.field_b;
            return stackIn_3_0;
          }
          if (param2 != -3) {
            ui.a(116, 53);
          }
          var3_int = param1.length();
          if (1 <= var3_int &&
            var3_int <= 12) {
            var4 = rh.a(param2 - 111, param1);
            if (var4 != null &&
              1 <= var4.length()) {
              if (!je.a(var4.charAt(0), param2 + 116) &&
                !je.a(var4.charAt(-1 + var4.length()), param2 + 103)) {
                var5 = 0;
                for (var6 = 0; param1.length() > var6; var6++) {
                  var7 = param1.charAt(var6);
                  if (!je.a((char) var7, param2 ^ -126)) {
                    var5 = 0;
                  } else {
                    var5++;
                  }
                  if (var5 >= 2 &&
                    !param0) {
                    stackIn_30_0 = pi.field_R;
                    return stackIn_30_0;
                  }
                }
                if (var5 <= 0) {
                  return null;
                }
                stackIn_35_0 = vd.field_a;
                return stackIn_35_0;
              }
              stackIn_20_0 = vd.field_a;
              return stackIn_20_0;
            }
            stackIn_15_0 = p.field_b;
            return stackIn_15_0;
          }
          stackIn_10_0 = p.field_b;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("ui.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(ec param0, byte param1, int param2, vj param3) {
        try {
          wk.field_i = pk.d((byte) 9) * param2 / 1000;
          c.a(false, param3);
          int var4_int = 17 / ((28 - param1) / 32);
          vg.a(param3, false);
          ea.a(0, param3);
          cf.a(false);
          s.b((byte) 104);
          vb.field_n = -wk.field_i + 0;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "ui.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
