/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc extends kd {
    static long field_i;
    static String field_m;
    static int field_k;
    int[] field_h;
    static int field_l;
    int field_j;

    final static void a(boolean param0, int param1) {
        qa.field_c.a((byte) 121, param0);
        if (param1 != 0) {
            field_m = (String) null;
        }
    }

    final static mb b(boolean param0, int param1) {
        mb var2 = null;
        mb stackIn_2_0 = null;
        mb stackIn_3_0 = null;
        mb stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        mb stackOut_1_0 = null;
        mb stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        mb stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param1 <= 82) {
          return (mb) null;
        } else {
          L0: {
            var2 = new mb(true);
            stackOut_1_0 = (mb) (var2);
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = (mb) ((Object) stackIn_3_0);
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L0;
            } else {
              stackOut_2_0 = (mb) ((Object) stackIn_2_0);
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L0;
            }
          }
          stackIn_4_0.field_b = stackIn_4_1 != 0;
          return var2;
        }
    }

    public static void a(int param0) {
        field_m = null;
        if (param0 != 29407) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            mc.a(-53, (java.applet.Applet) null);
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var2 = param1.getParameter("username");
              if (param0 < -115) {
                break L1;
              } else {
                mc.a(false, 109);
                break L1;
              }
            }
            L2: {
              if (var2 == null) {
                break L2;
              } else {
                var3 = (CharSequence) ((Object) var2);
                if (fd.a((byte) -58, var3) == 0L) {
                  break L2;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2_ref);
            stackOut_6_1 = new StringBuilder().append("mc.D(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private mc() throws Throwable {
        throw new Error();
    }

    static {
        field_m = "You have <%0> unread messages!";
        field_l = 0;
    }
}
