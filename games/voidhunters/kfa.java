/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kfa implements dja {
    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            tv discarded$0 = ((kfa) this).a((byte) -41);
            return (tv[]) (Object) new cq[param1];
        }
        return (tv[]) (Object) new cq[param1];
    }

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == -26243) {
          L0: {
            if (null != wga.field_a) {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L0;
            } else {
              if (!uga.field_d) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    public final tv a(byte param0) {
        int var2 = 5 % ((param0 - -64) / 50);
        return (tv) (Object) new cq();
    }

    static {
    }
}
