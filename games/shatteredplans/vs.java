/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vs {
    static String field_b;
    static int field_d;
    static String field_f;
    static String field_c;
    static String field_e;
    static String field_a;

    final static gb a() {
        gb var2 = new gb();
        vl.field_o.a((byte) -113, (oh) (Object) var2);
        int discarded$0 = 2;
        int discarded$1 = 4;
        bo.a();
        return var2;
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        field_f = null;
        field_b = null;
        int var1 = 30 / ((param0 - 61) / 33);
        field_a = null;
    }

    final static void a(int param0, byte param1) {
        oh var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        lq var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (lq) (Object) rs.field_Bb.d(0);
            L1: while (true) {
              if (var4 == null) {
                var2 = vl.field_o.d(0);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    int discarded$8 = 2;
                    int discarded$9 = 4;
                    bo.a();
                    var2 = vl.field_o.a((byte) -71);
                    continue L2;
                  }
                }
              } else {
                wj.a(320, 4, var4);
                var4 = (lq) (Object) rs.field_Bb.a((byte) -71);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2_ref, "vs.A(" + 4 + 44 + -103 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "The invitation has been withdrawn.";
        field_c = "Most fleets constructed in one turn.";
        field_b = "Resources used to construct vs total resources collected (average for game).";
        field_a = "1 point per turn";
        field_f = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
