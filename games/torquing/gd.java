/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static sm[] field_a;
    static t field_b;
    static int field_c;

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= -12) {
          gd.a((byte) -23);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static vn a(la param0, int param1, la param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        vn stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -26 % ((param4 + 37) / 36);
          if (!nd.a(param1, param0, -1, param3)) {
            return null;
          }
          stackIn_4_0 = fi.a((byte) -9, param2.a(param1, 100, param3));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("gd.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static StringBuilder a(int param0, StringBuilder param1, CharSequence param2, int param3) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        StringBuilder stackIn_7_0 = null;
        StringBuilder stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Torquing.field_u;
        try {
          var4_int = param1.length();
          if (param3 >= 0 &&
            var4_int >= param3) {
            var5 = param2.length();
            if (var5 == 0) {
              stackIn_7_0 = (StringBuilder) (param1);
              return stackIn_7_0;
            }
            var6 = var5 + param3;
            if (var4_int < var6) {
              param1.setLength(var6);
            }
            for (var7 = 0; var5 > var7; var7++) {
              incrementValue$1 = param3;
              param3++;
              param1.setCharAt(incrementValue$1, param2.charAt(var7));
            }
            if (param0 != -20980) {
              field_a = (sm[]) null;
            }
            stackIn_16_0 = (StringBuilder) (param1);
            return stackIn_16_0;
          }
          throw new StringIndexOutOfBoundsException("length=" + var4_int + " startPos=" + param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("gd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = new t(640, 480);
        field_c = 0;
    }
}
