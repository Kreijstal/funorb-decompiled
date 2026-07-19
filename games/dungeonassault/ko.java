/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ko extends ll {
    static int[] field_v;
    static String field_w;

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        mm var4 = null;
        kj var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                ko.a(true, -24);
                break L1;
              }
            }
            var4 = (mm) ((Object) m.field_a.e(-24172));
            L2: while (true) {
              if (var4 == null) {
                var5 = (kj) ((Object) cc.field_i.e(-24172));
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    ta.a((byte) 11, param1, var5);
                    var5 = (kj) ((Object) cc.field_i.a(4));
                    continue L3;
                  }
                }
              } else {
                oj.a(param1, var4, true);
                var4 = (mm) ((Object) m.field_a.a(4));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "ko.M(" + param0 + ',' + param1 + ')');
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
        field_v = new int[8192];
        field_w = "Requires two hits.";
    }
}
