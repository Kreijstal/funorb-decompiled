/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends ck {
    static ja field_t;
    static String field_x;
    static String field_w;
    static int field_o;
    static m field_r;
    static boolean field_u;
    int[] field_p;
    static String field_s;
    static volatile int field_q;
    static ek field_z;
    static boolean field_y;
    static boolean field_v;

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -38) {
                break L1;
              } else {
                ob.d(118);
                break L1;
              }
            }
            if (!jn.field_g) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if ((ib.field_b ^ -1) != -3) {
                  break L2;
                } else {
                  if (bk.field_U == null) {
                    break L2;
                  } else {
                    var3 = (CharSequence) ((Object) param1);
                    if (!bk.field_U.equals(ui.a(1, var3))) {
                      break L2;
                    } else {
                      return true;
                    }
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("ob.B(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    public static void d(int param0) {
        if (param0 != 18601) {
          ob.d(118);
          field_w = null;
          field_z = null;
          field_t = null;
          field_r = null;
          field_s = null;
          field_x = null;
          return;
        } else {
          field_w = null;
          field_z = null;
          field_t = null;
          field_r = null;
          field_s = null;
          field_x = null;
          return;
        }
    }

    private ob() throws Throwable {
        throw new Error();
    }

    static {
        field_t = new ja();
        field_u = false;
        field_w = "E";
        field_q = 0;
        field_s = "<%1> was destroyed";
        field_o = 0;
        field_x = "BOSS ";
        field_v = false;
    }
}
