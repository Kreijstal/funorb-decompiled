/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ko extends ll {
    static int[] field_v;
    static String field_w;

    final static void a(boolean param0, int param1) {
        int var3 = 0;
        mm var4 = null;
        Object var5 = null;
        kj var7 = null;
        var5 = null;
        var3 = DungeonAssault.field_K;
        if (param0) {
          var4 = (mm) (Object) m.field_a.e(-24172);
          L0: while (true) {
            if (var4 == null) {
              var7 = (kj) (Object) cc.field_i.e(-24172);
              L1: while (true) {
                if (var7 == null) {
                  return;
                } else {
                  ta.a((byte) 11, param1, var7);
                  var7 = (kj) (Object) cc.field_i.a(4);
                  continue L1;
                }
              }
            } else {
              oj.a(param1, var4, true);
              var4 = (mm) (Object) m.field_a.a(4);
              continue L0;
            }
          }
        } else {
          ko.a(true, -24);
          var4 = (mm) (Object) m.field_a.e(-24172);
          L2: while (true) {
            if (var4 == null) {
              var7 = (kj) (Object) cc.field_i.e(-24172);
              L3: while (true) {
                if (var7 == null) {
                  return;
                } else {
                  ta.a((byte) 11, param1, var7);
                  var7 = (kj) (Object) cc.field_i.a(4);
                  continue L3;
                }
              }
            } else {
              oj.a(param1, var4, true);
              var4 = (mm) (Object) m.field_a.a(4);
              continue L2;
            }
          }
        }
    }

    public static void d(int param0) {
        if (param0 >= -65) {
            return;
        }
        field_v = null;
        field_w = null;
    }

    ko() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new int[8192];
        field_w = "Requires two hits.";
    }
}
