/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al extends ne {
    int field_l;
    static cn field_j;
    static wm field_o;
    int field_p;
    static String field_n;
    static String[] field_i;
    int field_k;
    static String field_m;

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_5_0 = null;
        Class stackIn_8_0 = null;
        Class stackIn_12_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_22_0 = null;
        Class stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
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
            stackIn_12_0 = Long.TYPE;
            return stackIn_12_0;
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
            stackIn_22_0 = Double.TYPE;
            return stackIn_22_0;
          }
          if (param1 > -110) {
            field_m = (String) null;
          }
          if (!param0.equals("C")) {
            return Class.forName(param0);
          }
          stackIn_28_0 = Character.TYPE;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("al.C(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2, ac param3, int param4) {
        try {
          wa.a(param3.field_A, -1, param4, gd.field_E, param0, param1);
          wa.a(param3.field_k, -1, param4, jj.field_b, 40 + param0, param1);
          wa.a(param3.field_y, -1, param4, tb.field_c, param0, 18 + param1);
          wa.a(param3.field_r, -1, param4, kd.field_f, param0 + 40, 18 + param1);
          if (param2) {
            al.a((byte) -85);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "al.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_n = null;
        field_j = null;
        field_o = null;
        field_i = null;
        field_m = null;
        if (param0 != 17) {
          field_m = (String) null;
        }
    }

    private al() throws Throwable {
        throw new Error();
    }

    static {
        field_o = new wm(49);
        field_n = "Your party has been defeated";
        field_i = new String[]{"Thievery", "Reduced chance of waking dragon"};
        field_m = "Raider dodges.";
    }
}
