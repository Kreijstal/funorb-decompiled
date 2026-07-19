/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hsb implements dja {
    static cbb[] field_a;

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != 65536) {
          L0: {
            field_a = (cbb[]) null;
            if (-1 == (65536 & param2 ^ -1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-1 == (65536 & param2 ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public final tv[] a(int param0, int param1) {
        tv discarded$0 = null;
        if (param0 != 11995) {
            discarded$0 = this.a((byte) -6);
            return (tv[]) ((Object) new nwa[param1]);
        }
        return (tv[]) ((Object) new nwa[param1]);
    }

    public static void b(byte param0) {
        field_a = null;
        if (param0 != 27) {
            hsb.b((byte) 66);
        }
    }

    public final tv a(byte param0) {
        int var2 = -99 / ((param0 - -64) / 50);
        return (tv) ((Object) new nwa());
    }

    static {
    }
}
