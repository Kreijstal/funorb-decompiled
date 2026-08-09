/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends ck {
    static String[] field_t;
    static int field_q;
    static String field_p;
    int field_z;
    static String field_v;
    int field_C;
    int field_E;
    static int field_D;
    static int field_o;
    static int field_x;
    static String field_s;
    int field_r;
    int field_B;
    int field_y;
    static gk[] field_u;
    static gh field_w;
    static String field_A;

    final static wk[] a(String param0, String param1, byte param2, cm param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        wk[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param3.a(param1, 79);
              if (param2 < -11) {
                break L1;
              } else {
                cf.c((byte) 29);
                break L1;
              }
            }
            var5 = param3.a(var4_int, -32759, param0);
            stackIn_3_0 = il.a(var5, 20178, var4_int, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("cf.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean c(byte param0) {
        int stackIn_4_0 = 0;
        am.field_b = true;
        if (param0 < 85) {
          return true;
        } else {
          L0: {
            r.field_l = mm.a(-101) + 15000L;
            if ((uj.field_d ^ -1) != -12) {
              stackIn_4_0 = 0;
              break L0;
            } else {
              stackIn_4_0 = 1;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(byte param0) {
        field_v = null;
        field_s = null;
        field_A = null;
        field_p = null;
        field_u = null;
        int var1 = 44 % ((param0 - -35) / 34);
        field_t = null;
        field_w = null;
    }

    private cf() throws Throwable {
        throw new Error();
    }

    static {
        field_t = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_q = -1;
        field_v = "Log in / Create account";
        field_s = "Player names can be up to 12 letters, numbers and underscores";
        field_p = "Status";
        ua.a(-10931, 50);
        field_A = "Ignore";
    }
}
