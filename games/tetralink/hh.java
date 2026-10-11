/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static db field_b;
    static hl field_c;
    static String field_a;
    static String[] field_d;

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        int var2_int = 0;
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -29 % ((param1 + 14) / 52);
          if (param0.equals("B")) {
            stackIn_2_0 = Byte.TYPE;
            return stackIn_2_0;
          }
          if (param0.equals("I")) {
            stackIn_6_0 = Integer.TYPE;
            return stackIn_6_0;
          }
          if (param0.equals("S")) {
            stackIn_10_0 = Short.TYPE;
            return stackIn_10_0;
          }
          if (param0.equals("J")) {
            stackIn_13_0 = Long.TYPE;
            return stackIn_13_0;
          }
          if (param0.equals("Z")) {
            stackIn_16_0 = Boolean.TYPE;
            return stackIn_16_0;
          }
          if (param0.equals("F")) {
            stackIn_20_0 = Float.TYPE;
            return stackIn_20_0;
          }
          if (param0.equals("D")) {
            stackIn_24_0 = Double.TYPE;
            return stackIn_24_0;
          }
          if (!param0.equals("C")) {
            stackIn_29_0 = Class.forName(param0);
            return stackIn_29_0;
          }
          stackIn_27_0 = Character.TYPE;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("hh.A(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 > 119) {
          field_d = null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
        hh.a(-5, 126, -83, 41, -91);
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        nj.field_d = param2;
        i.field_n = param1;
        if (param4 < -87) {
          h.field_a = param3;
          hl.field_wb = param0;
          return;
        }
        hh.a((byte) 61);
        h.field_a = param3;
        hl.field_wb = param0;
    }

    static {
        field_a = "Loading fonts";
        field_b = new db(12, 0, 1, 0);
        field_d = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
