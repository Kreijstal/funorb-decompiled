/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static he[] field_c;
    static int field_a;
    static String field_d;
    static he[] field_b;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        if (param0 != 13302) {
            pc.a(-19);
        }
    }

    final static void a(int param0, String param1, String param2) {
        qg.a(false, param1, param2, (byte) -11);
        if (param0 > -39) {
            field_b = null;
        }
    }

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 < -114) {
          param1 = ph.a(param1, (byte) 123, '_', "");
          var3 = vj.a(param1, -113);
          if (param2.indexOf(param1) == -1) {
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
          field_b = null;
          param1 = ph.a(param1, (byte) 123, '_', "");
          var3 = vj.a(param1, -113);
          if (param2.indexOf(param1) != -1) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_b = new he[3];
        field_d = null;
    }
}
