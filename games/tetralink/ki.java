/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    static int field_b;
    static java.math.BigInteger field_c;
    static String field_a;

    public static void a(byte param0) {
        if (param0 != -49) {
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static void a(int param0, String param1, String[] param2, int param3) {
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var5 = TetraLink.field_J;
        if (param3 == -106) {
          ma.field_d = ik.field_d;
          if (param0 != 255) {
            if (param0 >= 100) {
              if ((param0 ^ -1) < -106) {
                va.field_n = hj.a(param1, param0, false);
                return;
              } else {
                va.field_n = ng.a((byte) -67, param2);
                return;
              }
            } else {
              va.field_n = hj.a(param1, param0, false);
              return;
            }
          } else {
            L0: {
              if (wh.field_k >= 13) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            va.field_n = al.a(stackIn_6_0 != 0, 1);
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_a = "Game options changed (<%0>)";
        field_c = new java.math.BigInteger("65537");
    }
}
