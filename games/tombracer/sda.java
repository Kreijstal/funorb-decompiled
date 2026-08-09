/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sda extends vg {
    static boolean[] field_f;
    int field_l;
    byte[] field_j;
    static String field_i;
    static String field_h;
    static String field_k;
    static ssa field_g;

    public static void a(int param0) {
        field_i = null;
        field_h = null;
        if (param0 != -1) {
          field_f = (boolean[]) null;
          field_f = null;
          field_k = null;
          field_g = null;
          return;
        } else {
          field_f = null;
          field_k = null;
          field_g = null;
          return;
        }
    }

    private sda() throws Throwable {
        throw new Error();
    }

    final static java.net.URL a(java.applet.Applet param0, int param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_2_0 = null;
        java.net.URL stackIn_12_0 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -1) {
              L1: {
                var3 = null;
                var4 = null;
                if (null == ts.field_g) {
                  break L1;
                } else {
                  if (!ts.field_g.equals(param0.getParameter("settings"))) {
                    var3 = ts.field_g;
                    var4 = var3;
                    var4 = var3;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (aia.field_j == null) {
                  break L2;
                } else {
                  if (!aia.field_j.equals(param0.getParameter("session"))) {
                    var4 = aia.field_j;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_12_0 = us.a((byte) 66, param2, (String) (var4), -1, (String) (var3));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (java.net.URL) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = var3;

            stackIn_15_1 = new StringBuilder().append("sda.A(");

            if (param0 == null) {
              stackIn_16_0 = stackIn_15_0;
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = stackIn_15_0;
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {

              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {

              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_12_0;
        }
    }

    static {
        field_k = "Jamille";
        field_i = "Unrated game";
        field_h = "Loot Bags x2";
        field_g = null;
    }
}
