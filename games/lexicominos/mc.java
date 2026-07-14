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
            field_m = null;
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
          return null;
        } else {
          L0: {
            var2 = new mb(true);
            stackOut_1_0 = (mb) var2;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = (mb) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L0;
            } else {
              stackOut_2_0 = (mb) (Object) stackIn_2_0;
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
            Object var2 = null;
            mc.a(-53, (java.applet.Applet) null);
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        CharSequence var3 = null;
        CharSequence var4 = null;
        var2 = param1.getParameter("username");
        if (param0 < -115) {
          if (var2 != null) {
            var4 = (CharSequence) (Object) var2;
            if (fd.a((byte) -58, var4) == 0L) {
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          mc.a(false, 109);
          if (var2 != null) {
            var3 = (CharSequence) (Object) var2;
            if (fd.a((byte) -58, var3) == 0L) {
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    private mc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "You have <%0> unread messages!";
        field_l = 0;
    }
}
