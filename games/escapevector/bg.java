/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg {
    static di[] field_a;
    static int field_f;
    static String field_d;
    static int[] field_c;
    static rg[] field_e;
    static String field_b;
    static String[] field_g;

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        field_a = null;
        field_b = null;
        field_d = null;
        field_g = null;
        if (param0 != 13) {
          bg.a(76);
        }
    }

    final static byte[][][] a(mf param0, byte[][][] param1, mf param2, int param3) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (param3 != 0) {
            bg.a(-94);
          }
          byte[][][] stackIn_3_0 = sl.a(param2, param0, (int[]) null, param1, 1, param3 + 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4;
          StringBuilder stackIn_6_1 = new StringBuilder().append("bg.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_a = new di[255];
        for (int var0 = 0; var0 < field_a.length; var0++) {
          field_a[var0] = new di();
        }
        field_d = "Achieved";
        field_f = -1;
        field_b = "This password contains your email address, and would be easy to guess";
        field_g = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_c = new int[]{0, 12, 13};
    }
}
