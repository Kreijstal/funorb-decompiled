/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    static String field_d;
    static int field_a;
    static boolean field_b;
    static int[] field_e;
    static String[][] field_c;
    static volatile long field_f;

    public static void a(int param0) {
        field_e = null;
        if (param0 != 0) {
            return;
        }
        field_c = (String[][]) null;
        field_d = null;
    }

    final static java.net.URL a(java.net.URL param0, int param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_2_0 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = null;
            if (param1 == -1) {
              L1: {
                if (null == rb.field_l) {
                  break L1;
                } else {
                  if (rb.field_l.equals(param2.getParameter("settings"))) {
                    break L1;
                  } else {
                    var3 = rb.field_l;
                    var4 = var3;
                    var4 = var3;
                    break L1;
                  }
                }
              }
              L2: {
                var4 = null;
                if (u.field_a == null) {
                  break L2;
                } else {
                  if (!u.field_a.equals(param2.getParameter("session"))) {
                    var4 = u.field_a;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_11_0 = pl.a((String) (var4), (String) (var3), false, param0, -1);
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
            stackIn_14_0 = var3;

            stackIn_14_1 = new StringBuilder().append("gn.B(");

            if (param0 == null) {
              stackIn_15_0 = stackIn_14_0;
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = stackIn_14_0;
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');

            if (param2 == null) {

              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {

              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_11_0;
        }
    }

    final static void b(int param0) {
        if (param0 != -29550) {
            return;
        }
        ef.f((byte) 53);
        uf.k(-4840);
    }

    static {
        field_d = "Stamina Mode";
        field_f = 0L;
    }
}
