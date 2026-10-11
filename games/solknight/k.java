/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static boolean field_b;
    static rf field_d;
    static String field_a;
    static int field_c;

    final static void a(byte param0) {
        if (param0 == -35) {
          ce.field_b = false;
          field_b = false;
          h.a(-1, true);
          gb.field_i = el.field_p;
          ma.field_o = el.field_p;
          return;
        }
        field_b = false;
        ce.field_b = false;
        field_b = false;
        h.a(-1, true);
        gb.field_i = el.field_p;
        ma.field_o = el.field_p;
    }

    final static StringBuilder a(StringBuilder param0, int param1, char param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_3_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          var4_int = param0.length();
          param0.setLength(param3);
          var5 = var4_int;
          if (param1 != 0) {
            stackIn_3_0 = (StringBuilder) null;
            return stackIn_3_0;
          }
          while (param3 > var5) {
            param0.setCharAt(var5, param2);
            var5++;
          }
          stackIn_7_0 = (StringBuilder) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("k.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == -23354) {
          field_a = null;
          field_d = null;
          return;
        }
        StringBuilder var2 = (StringBuilder) null;
        k.a((StringBuilder) null, 112, '￫', -41);
        field_a = null;
        field_d = null;
    }

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_30_0 = null;
        Class stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.equals("B")) {
            stackIn_2_0 = Byte.TYPE;
            return stackIn_2_0;
          }
          if (param0.equals("I")) {
            stackIn_6_0 = Integer.TYPE;
            return stackIn_6_0;
          }
          if (param0.equals("S")) {
            stackIn_9_0 = Short.TYPE;
            return stackIn_9_0;
          }
          if (param0.equals("J")) {
            stackIn_13_0 = Long.TYPE;
            return stackIn_13_0;
          }
          if (param0.equals("Z")) {
            stackIn_17_0 = Boolean.TYPE;
            return stackIn_17_0;
          }
          if (param0.equals("F")) {
            stackIn_21_0 = Float.TYPE;
            return stackIn_21_0;
          }
          if (param0.equals("D")) {
            stackIn_24_0 = Double.TYPE;
            return stackIn_24_0;
          }
          if (param1 >= -95) {
            stackIn_27_0 = (Class) null;
            return stackIn_27_0;
          }
          if (!param0.equals("C")) {
            stackIn_32_0 = Class.forName(param0);
            return stackIn_32_0;
          }
          stackIn_30_0 = Character.TYPE;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("k.D(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = "Achievements";
        field_c = 0;
    }
}
