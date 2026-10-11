/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl {
    static String[] field_a;
    static String field_d;
    static String field_b;
    static String field_e;
    static int field_c;

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = HoldTheLine.field_D;
        if (param2 == 102) {
          if (param0 < param7) {
            if (param7 < param5) {
              qe.a(param6, param0, param5, param4, tc.field_b, false, param3, param7, param1);
              return;
            }
            if (param0 >= param5) {
              qe.a(param3, param5, param7, param6, tc.field_b, false, param4, param0, param1);
              return;
            }
            qe.a(param4, param0, param7, param6, tc.field_b, false, param3, param5, param1);
            return;
          }
          if (param5 > param0) {
            qe.a(param3, param7, param5, param4, tc.field_b, false, param6, param0, param1);
            return;
          }
          if (param7 < param5) {
            qe.a(param4, param7, param0, param3, tc.field_b, false, param6, param5, param1);
            return;
          }
          qe.a(param6, param5, param0, param3, tc.field_b, false, param4, param7, param1);
          return;
        }
        field_a = (String[]) null;
        if (param0 < param7) {
          if (param7 < param5) {
            qe.a(param6, param0, param5, param4, tc.field_b, false, param3, param7, param1);
            return;
          }
          if (param0 >= param5) {
            qe.a(param3, param5, param7, param6, tc.field_b, false, param4, param0, param1);
            return;
          }
          qe.a(param4, param0, param7, param6, tc.field_b, false, param3, param5, param1);
          return;
        }
        if (param5 > param0) {
          qe.a(param3, param7, param5, param4, tc.field_b, false, param6, param0, param1);
          return;
        }
        if (param7 < param5) {
          qe.a(param4, param7, param0, param3, tc.field_b, false, param6, param5, param1);
          return;
        }
        qe.a(param6, param5, param0, param3, tc.field_b, false, param4, param7, param1);
    }

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_5_0 = null;
        Class stackIn_8_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_25_0 = null;
        Class stackIn_28_0 = null;
        Class stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.equals("B")) {
            stackIn_2_0 = Byte.TYPE;
            return stackIn_2_0;
          }
          if (param0.equals("I")) {
            stackIn_5_0 = Integer.TYPE;
            return stackIn_5_0;
          }
          if (param0.equals("S")) {
            stackIn_8_0 = Short.TYPE;
            return stackIn_8_0;
          }
          if (param0.equals("J")) {
            stackIn_11_0 = Long.TYPE;
            return stackIn_11_0;
          }
          if (param0.equals("Z")) {
            stackIn_15_0 = Boolean.TYPE;
            return stackIn_15_0;
          }
          if (param0.equals("F")) {
            stackIn_18_0 = Float.TYPE;
            return stackIn_18_0;
          }
          if (param0.equals("D")) {
            stackIn_21_0 = Double.TYPE;
            return stackIn_21_0;
          }
          if (param0.equals("C")) {
            stackIn_25_0 = Character.TYPE;
            return stackIn_25_0;
          }
          if (param1 >= 8) {
            stackIn_30_0 = Class.forName(param0);
            return stackIn_30_0;
          }
          stackIn_28_0 = (Class) null;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("wl.C(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_b = null;
        field_a = null;
        int var1 = 15 / ((param0 + 86) / 39);
    }

    static {
        field_a = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_d = "to return to the normal view.";
        field_e = "Shield";
        field_b = "Loading fonts";
        field_c = 0;
    }
}
