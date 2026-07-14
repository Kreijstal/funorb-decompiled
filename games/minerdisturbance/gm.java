/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm {
    static boolean field_a;
    static String field_b;
    static String field_c;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        int var1 = 77 % ((58 - param0) / 41);
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = MinerDisturbance.field_ab;
        if (param0 == 100) {
          var1 = 0;
          L0: while (true) {
            if (-4 < (var1 ^ -1)) {
              L1: {
                if (null == pa.field_a[var1]) {
                  break L1;
                } else {
                  if (!pa.field_a[var1].k()) {
                    var1++;
                    var1++;
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              pa.field_a[var1] = rc.a(re.field_a[ll.a((byte) -73, 5) + 25], 100, oc.field_f);
              sa discarded$2 = mg.a(1963987425, pa.field_a[var1]);
              return;
            } else {
              return;
            }
          }
        } else {
          gm.b(26);
          var1 = 0;
          L2: while (true) {
            if (-4 < var1) {
              L3: {
                if (null == pa.field_a[var1]) {
                  break L3;
                } else {
                  if (!pa.field_a[var1].k()) {
                    var1++;
                    var1++;
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              pa.field_a[var1] = rc.a(re.field_a[ll.a((byte) -73, 5) + 25], 100, oc.field_f);
              sa discarded$3 = mg.a(1963987425, pa.field_a[var1]);
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_c = "Loading music";
        field_b = "ON";
    }
}
