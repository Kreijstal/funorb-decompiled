/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static String field_b;
    static m field_d;
    static java.awt.Font field_a;
    static m field_c;

    final static sl a(int param0, boolean param1) {
        sl var2 = new sl(true);
        var2.field_d = param1 ? true : false;
        int var3 = -105 / ((-35 - param0) / 37);
        return var2;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_2_0 = 0;
        var1_ref = (Object) (Object) je.field_j;
        synchronized (var1_ref) {
          L0: {
            if (param0 > 41) {
              if (vd.field_n == pc.field_p) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                ki.field_d = kj.field_O[vd.field_n];
                te.field_a = ai.field_n[vd.field_n];
                vd.field_n = 1 + vd.field_n & 127;
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_9_0 != 0;
    }

    public static void a() {
        field_a = null;
        field_b = null;
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Close";
    }
}
