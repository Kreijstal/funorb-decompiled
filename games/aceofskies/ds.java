/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ds extends wf {
    byte[] field_f;
    int field_g;
    static eo field_e;

    public static void a(int param0) {
        field_e = null;
        if (param0 != -93) {
          field_e = (eo) null;
        }
    }

    private ds() throws Throwable {
        throw new Error();
    }

    final static w a(boolean param0, String param1) {
        w stackIn_4_0 = null;
        w stackIn_8_0 = null;
        w stackIn_12_0 = null;
        int stackIn_21_0 = 0;
        w stackIn_25_0 = null;
        w stackIn_38_0 = null;
        w stackIn_43_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
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
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_4_0 = nh.field_f;
            return stackIn_4_0;
          }
          if (64 < var2_int) {
            stackIn_8_0 = ei.field_d;
            return stackIn_8_0;
          }
          if (param1.charAt(0) == 34) {
            if (34 != param1.charAt(var2_int - 1)) {
              stackIn_12_0 = td.field_d;
              return stackIn_12_0;
            }
            var3 = 0;
            for (var4 = 1; var4 < var2_int - 1; var4++) {
              var5 = param1.charAt(var4);
              if (var5 == 92) {
                stackIn_21_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_21_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_25_0 = td.field_d;
                  return stackIn_25_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = param0 ? 1 : 0;
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
                stackIn_38_0 = td.field_d;
                return stackIn_38_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (-1 == ph.field_f.indexOf(var5Lifetime1)) {
                stackIn_43_0 = td.field_d;
                return stackIn_43_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_49_0 = var2;
          stackIn_49_1 = new StringBuilder().append("ds.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(')').toString());
        }
    }

    static {
        field_e = new eo(2);
    }
}
