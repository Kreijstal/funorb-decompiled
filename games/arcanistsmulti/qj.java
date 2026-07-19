/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static ll[] field_j;
    static String field_b;
    static java.awt.Color field_h;
    static String field_e;
    static String field_i;
    static ll[] field_d;
    static int field_c;
    static int field_a;
    static String field_f;
    static int field_g;

    final static StringBuilder a(int param0, StringBuilder param1, char param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_3_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        StringBuilder stackOut_2_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = param1.length();
            param1.setLength(param0);
            var5 = var4_int;
            if (!param3) {
              L1: while (true) {
                if (var5 >= param0) {
                  stackOut_6_0 = (StringBuilder) (param1);
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  param1.setCharAt(var5, param2);
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = (StringBuilder) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("qj.D(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static hh a(byte param0) {
        try {
            int var1_int = 0;
            Throwable var1 = null;
            hh stackIn_1_0 = null;
            Throwable decompiledCaughtException = null;
            hh stackOut_0_0 = null;
            try {
              L0: {
                var1_int = -52 % ((param0 - 15) / 60);
                stackOut_0_0 = (hh) (Class.forName("po").newInstance());
                stackIn_1_0 = stackOut_0_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_1_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized static long b(int param0) {
        if (param0 != -26572) {
            return -111L;
        }
        long var1 = System.currentTimeMillis();
        if (!(sk.field_h <= var1)) {
            wl.field_O = wl.field_O + (-var1 + sk.field_h);
        }
        sk.field_h = var1;
        return var1 - -wl.field_O;
    }

    final static String a(int param0) {
        if (param0 != 10040319) {
        }
        return df.field_z.l(-1);
    }

    public static void c(int param0) {
        field_h = null;
        field_e = null;
        field_i = null;
        field_j = null;
        field_f = null;
        if (param0 != -13019) {
            return;
        }
        field_d = null;
        field_b = null;
    }

    static {
        field_b = "Personal and Arena spells:";
        field_e = "Report abuse";
        field_h = new java.awt.Color(10040319);
        field_f = "The angels of the sky have opened their heavenly gates to allow Arcanists to engage in battle between their flying castles in the clouds. Choose your tower and allies carefully to achieve victory in this<nbsp>realm.";
    }
}
