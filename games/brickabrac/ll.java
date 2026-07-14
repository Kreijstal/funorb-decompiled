/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static String field_a;
    static me field_d;
    static int field_b;
    static mh field_e;
    static jp field_c;

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0;
        int stackOut_4_0;
        int stackOut_3_0;
        param2 = wj.a(-1, param2, '_', "");
        var3 = w.a(73, param0);
        if (param1 > 117) {
          if (-1 == param2.indexOf(param0)) {
            if ((param2.indexOf(var3) ^ -1) != 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_e = null;
          if (-1 != param2.indexOf(param0)) {
            return true;
          } else {
            L0: {
              if ((param2.indexOf(var3) ^ -1) == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        field_e = null;
        if (param0) {
            Object var2 = null;
            boolean discarded$0 = ll.a((String) null, (byte) 37, (String) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Inviting <%0>";
        field_b = -1;
        field_d = new me("usename");
    }
}
