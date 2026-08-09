/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rr {
    static boolean field_f;
    static String field_e;
    static String[] field_g;
    static String field_a;
    static String field_d;
    static String field_h;
    static String field_c;
    static ji field_b;

    final static io[] a(int[] param0, io[] param1, int param2) {
        io[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        io[] var6 = null;
        io[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            if (param0 != null) {
              var6 = new io[param0.length];
              var3 = var6;
              var4 = param2;
              L1: while (true) {
                if (var4 >= param0.length) {
                  stackIn_8_0 = (io[]) (var3);
                  break L0;
                } else {
                  var6[var4] = param1[param0[var4]];
                  var4++;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("rr.C(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    final static boolean a(int param0, char param1) {
        if (param1 >= 32) {
            if (!(param1 > 126)) {
                return true;
            }
        }
        if (param1 >= 160 && param1 <= 255) {
            return true;
        }
        int var2 = -23 / ((-53 - param0) / 55);
        if (param1 != 8364 && param1 != 338 && param1 != 8212 && param1 != 339 && param1 != 376) {
            return false;
        }
        return true;
    }

    final static int a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 10) {
              stackIn_4_0 = kt.a(param1, true, (byte) -103, 10);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -120;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("rr.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_g = null;
        field_e = null;
        field_d = null;
        field_b = null;
        field_c = null;
        int var1 = -50 / ((-58 - param0) / 50);
        field_a = null;
    }

    final static void a(String param0, byte param1, long param2) {
        CharSequence var5 = null;
        try {
            at.field_Kb = param0;
            if (param1 != -70) {
                rr.a(36, '+');
            }
            ov.field_b = 2;
            var5 = (CharSequence) ((Object) param0);
            qi.field_o = mo.a(param1 ^ -70, var5);
            ik.field_A = param2;
            la.a(true);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "rr.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_e = "<%0> must play <%1> more rated games before playing with the current options.";
        field_g = new String[]{"Tutorial", "Sprinting", "Sprinting", "Sprinting", "Dribbling", "Passing", "Passing", "Charging Up", "Tackling", "Tackling", "Tackling", "The Gauntlet", "Lobbing", "Lobbing", "Switching Player", "The Hotshot", "Scoring a Goal", "Scoring a Goal", "Choosing A Formation", "Choosing A Lineup", "Sandbox Mode"};
        field_d = "Too High";
        field_h = "TAB - hide chat temporarily";
        field_f = false;
        field_a = "<%0> scores a goal, extending their lead over <%1> with a score of <%2> to <%3>.";
        field_c = "Invalid date";
    }
}
