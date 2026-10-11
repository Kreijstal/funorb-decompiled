/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static dd field_d;
    static String field_c;
    static int[] field_a;
    static String field_b;

    public static void a(int param0) {
        if (param0 < 48) {
          return;
        }
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static Class a(byte param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_22_0 = null;
        Class stackIn_25_0 = null;
        Class stackIn_28_0 = null;
        Class stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (param1.equals("I")) {
            stackIn_7_0 = Integer.TYPE;
            return stackIn_7_0;
          }
          if (param1.equals("S")) {
            stackIn_10_0 = Short.TYPE;
            return stackIn_10_0;
          }
          if (param1.equals("J")) {
            stackIn_14_0 = Long.TYPE;
            return stackIn_14_0;
          }
          if (param1.equals("Z")) {
            stackIn_18_0 = Boolean.TYPE;
            return stackIn_18_0;
          }
          if (param1.equals("F")) {
            stackIn_22_0 = Float.TYPE;
            return stackIn_22_0;
          }
          if (param1.equals("D")) {
            stackIn_25_0 = Double.TYPE;
            return stackIn_25_0;
          }
          if (param1.equals("C")) {
            stackIn_28_0 = Character.TYPE;
            return stackIn_28_0;
          }
          if (param0 >= -88) {
            field_a = (int[]) null;
          }
          stackIn_32_0 = Class.forName(param1);
          return stackIn_32_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("nc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var1 = -126 / ((-26 - param0) / 54);
        if (th.field_D <= 32) {
          lg.a(-103, 0);
        } else {
          var2 = th.field_D % 32;
          if (0 == var2) {
            var2 = 32;
          }
          lg.a(-116, th.field_D - var2);
        }
    }

    static {
        field_c = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_b = "End of free game!";
    }
}
