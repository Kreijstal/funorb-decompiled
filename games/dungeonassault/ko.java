/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ko extends ll {
    static int[] field_v;
    static String field_w;

    final static void a(boolean param0, int param1) {
        int var3 = 0;
        mm var4 = null;
        kj var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = DungeonAssault.field_K;
        try {
          if (!param0) {
            ko.a(true, -24);
          }
          var4 = (mm) (m.field_a.e(-24172));
          while (var4 != null) {
            oj.a(param1, var4, true);
            var4 = (mm) (m.field_a.a(4));
          }
          var5 = (kj) (cc.field_i.e(-24172));
          while (var5 != null) {
            ta.a((byte) 11, param1, var5);
            var5 = (kj) (cc.field_i.a(4));
          }
          return;
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
