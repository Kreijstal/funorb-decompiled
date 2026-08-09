/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static int field_e;
    static int field_a;
    static cr field_c;
    static String field_b;
    static String field_f;
    static String field_d;
    static String field_g;

    public static void a(byte param0) {
        if (param0 <= 33) {
            return;
        }
        field_d = null;
        field_f = null;
        field_c = null;
        field_b = null;
        field_g = null;
    }

    final static void a(int param0, er[] param1, int param2, int param3, int param4, int param5, int param6, er[] param7, int param8, cc param9, int param10, int param11, int param12, int param13, int param14, int param15, er[] param16, int param17, int param18, byte param19, cc param20) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var21_int = 0;
        RuntimeException var21 = null;
        try {
          L0: {
            mq.a(param17, new mp(param1), param10, param9, param8, param18, param13, param14, param2, new mp(param7), (byte) 88, param4, param6, param3, param11, param20, param12, param0, param15, new mp(param16), param5);
            var21_int = 93 % ((33 - param19) / 55);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var21);

            stackIn_4_1 = new StringBuilder().append("ua.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');

            if (param16 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',');

            if (param20 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_5_0), stackIn_17_2 + ')');
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = Vertigo2.field_L ? 1 : 0;
        if (param0 != -5141) {
            return;
        }
        try {
            for (var1_int = 0; var1_int < no.field_d; var1_int++) {
                eo.field_l[var1_int] = null;
            }
            no.field_d = 0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "ua.C(" + param0 + ')');
        }
    }

    static {
        field_e = 0;
        field_d = "You lost!";
        field_g = "Loading textures";
        field_f = "Public";
        field_b = "You have been removed from <%0>'s game.";
    }
}
