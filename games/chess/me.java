/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    static km field_d;
    static kd field_a;
    static jc field_e;
    static hg field_b;
    static rk[] field_c;

    final static void a(String param0, int param1, fj param2, lh param3, byte param4) {
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Chess.field_G;
        try {
          var5_int = 0;
          var6 = -1;
          if (param4 != 79) {
            return;
          }
          for (var7 = 1; var7 < param0.length(); var7++) {
            var8 = param0.charAt(var7);
            if (var8 == 60) {
              var6 = (var5_int >> 8) + param2.field_i[0] + param3.b(param0.substring(0, var7));
            }
            if (-1 == var6) {
              if (var8 == 32) {
                var5_int = var5_int + param1;
              }
              param2.field_i[var7] = param2.field_i[0] + (var5_int >> 8) + param3.b(param0.substring(0, 1 + var7)) - param3.a((char) var8);
            } else {
              param2.field_i[var7] = var6;
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("me.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
        field_e = null;
        if (param0 != 18854) {
          lh var2 = (lh) null;
          me.a((String) null, 27, (fj) null, (lh) null, (byte) 90);
        }
    }

    final static int a(int param0, int param1) {
        param0 = ((param0 & -1431655765) >>> 1) + (param0 & 1431655765);
        param0 = (858993459 & param0) + (1932735283 & param0 >>> 2);
        int var2 = 14 % ((-35 - param1) / 32);
        param0 = 252645135 & param0 + (param0 >>> 4);
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        return param0 & 255;
    }

    static {
        field_b = new hg(9, 0, 4, 1);
    }
}
