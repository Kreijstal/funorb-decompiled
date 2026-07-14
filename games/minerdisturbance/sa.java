/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends pi {
    static String field_r;
    pi field_p;
    int field_q;
    static ln[][] field_t;
    static volatile int field_o;
    rc field_n;
    static boolean field_u;
    static int field_s;

    final static int a(int param0, int param1) {
        if (param1 != 2) {
          return 49;
        } else {
          param0 = (-715827883 & param0 >>> 422520545) + (param0 & 1431655765);
          param0 = (858993459 & param0) + ((-858993460 & param0) >>> -65190590);
          param0 = param0 - -(param0 >>> 11786052) & 252645135;
          param0 = param0 + (param0 >>> 1609586632);
          param0 = param0 + (param0 >>> -1859175504);
          return 255 & param0;
        }
    }

    public static void a(int param0) {
        if (param0 < 33) {
            return;
        }
        field_t = null;
        field_r = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = MinerDisturbance.field_ab;
        if (param2 != 0) {
          L0: {
            field_r = null;
            if (param0 <= param1) {
              break L0;
            } else {
              var3 = param1;
              param1 = param0;
              param0 = var3;
              break L0;
            }
          }
          L1: while (true) {
            if (0 == param0) {
              return param1;
            } else {
              var3 = param1 % param0;
              param1 = param0;
              param0 = var3;
              continue L1;
            }
          }
        } else {
          L2: {
            if (param0 <= param1) {
              break L2;
            } else {
              var3 = param1;
              param1 = param0;
              param0 = var3;
              break L2;
            }
          }
          L3: while (true) {
            if (0 == param0) {
              return param1;
            } else {
              var3 = param1 % param0;
              param1 = param0;
              param0 = var3;
              continue L3;
            }
          }
        }
    }

    sa(rc param0, pi param1) {
        ((sa) this).field_n = param0;
        ((sa) this).field_q = param0.i();
        ((sa) this).field_p = param1;
        ((sa) this).field_n.f(128 + ((sa) this).field_q * oc.field_f >> -994431608);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Dangerous new foe";
        field_o = -1;
        field_t = new ln[2][10];
        field_s = 200;
    }
}
