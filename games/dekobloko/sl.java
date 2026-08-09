/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    static String field_a;
    static String field_g;
    static int field_f;
    static boolean field_c;
    static String field_b;
    static String field_d;
    static String field_e;

    final static void a(String param0, int[] param1, byte param2, nm param3, w param4, String param5, long param6, int param7, int param8) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ki.field_w = param3;
              w.field_H = new pf(param4, param6, param0, param5, param8, param7, param1);
              if (param2 > 84) {
                break L1;
              } else {
                field_g = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("sl.A(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param5 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), stackIn_18_2 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        field_b = null;
        field_g = null;
        if (param0 != 110) {
            field_c = true;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var4 = mc.field_b[jm.field_p];
        int var5 = mc.field_b[(jm.field_p - -1) % mc.field_b.length];
        int var6 = fl.a(var5, jg.field_g, param3, var4, 110);
        int var7 = sb.field_o[jm.field_p];
        if (param1 >= -35) {
            sl.a((byte) 86);
        }
        int var8 = sb.field_o[(jm.field_p - -1) % mc.field_b.length];
        int var9 = fl.a(var8, jg.field_g, param3, var7, 114);
        hk.d(param2, param0, 640, 480, var6, var9);
    }

    final static long a(int param0) {
        if (param0 != -1) {
            sl.a((String) null, (int[]) null, (byte) 24, (nm) null, (w) null, (String) null, -106L, 12, -60);
        }
        return -p.field_a + ik.a(4);
    }

    static {
        field_a = "Username: ";
        field_b = "Score";
        field_d = "You have been removed from <%0>'s game.";
        field_e = "Passwords must be between 5 and 20 letters and numbers";
        field_f = 0;
    }
}
