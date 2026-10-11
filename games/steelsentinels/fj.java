/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    static String field_g;
    static String[][] field_b;
    static boolean field_e;
    static String field_c;
    static String field_i;
    static int field_f;
    static int[] field_a;
    static int[] field_h;
    static int field_d;

    public static void a(byte param0) {
        field_h = null;
        field_i = null;
        field_a = null;
        if (param0 <= -118) {
          field_b = (String[][]) null;
          field_g = null;
          field_c = null;
          return;
        }
        field_b = (String[][]) null;
        field_b = (String[][]) null;
        field_g = null;
        field_c = null;
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param0 = hk.a('_', "", true, param0);
          var3 = ri.a(param1 ^ 7035, param2);
          if (param1 != -7036) {
            return true;
          }
          stackIn_8_0 = (param0.indexOf(param2) != -1) || (param0.indexOf(var3) != -1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("fj.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static boolean a(char param0, CharSequence param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!qh.a((byte) -30, param0)) {
            return false;
          }
          if (param2 > -93) {
            fj.a((byte) 85);
          }
          if (param1 == null) {
            return false;
          }
          var3_int = param1.length();
          if (12 <= var3_int) {
            return false;
          }
          if (!jd.a(param0, -33)) {
            return true;
          }
          return (0 != var3_int);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("fj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_e = true;
        field_g = "Year";
        field_a = new int[]{65535, 15614976, 65280, 6711039, 16776960, 16711935, 2236962, 16777215, 16737894, 6750054, 16777062, 16738047};
        field_h = field_a;
        field_d = 3;
        field_i = "Camera left/right: Normal";
        field_c = "Only show private chat from my friends and opponents";
    }
}
