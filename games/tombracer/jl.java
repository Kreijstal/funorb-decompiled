/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static String field_a;
    private static String[] field_b;

    final static int[] a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var3 = cr.a(true, param1);
        var4 = pla.b(61, param1);
        var5 = cr.a(true, param0);
        var6 = pla.b(52, param0);
        var7 = (int)((long)var3 * (long)var5 >> 1088536016);
        var8 = (int)((long)var3 * (long)var6 >> -1971811376);
        if (param2 != 0) {
          field_a = null;
          var9 = (int)((long)var4 * (long)var5 >> 2098628816);
          var10 = (int)((long)var4 * (long)var6 >> 1658422608);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        } else {
          var9 = (int)((long)var4 * (long)var5 >> 2098628816);
          var10 = (int)((long)var4 * (long)var6 >> 1658422608);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 1088536016) {
            return;
        }
        field_b = null;
    }

    final static void a(byte param0, boolean param1) {
        if (param0 <= -46) {
          if (bl.field_a != null) {
            bl.field_a.b(40, param1);
            return;
          } else {
            return;
          }
        } else {
          int[] discarded$7 = jl.a(-79, 78, -90);
          if (bl.field_a == null) {
            return;
          } else {
            bl.field_a.b(40, param1);
            return;
          }
        }
    }

    final static roa a(la param0, boolean param1, kh param2) {
        int var3 = 0;
        Object var4 = null;
        if (!param1) {
          var4 = null;
          roa discarded$2 = jl.a((la) null, false, (kh) null);
          var3 = param2.b((byte) 44, 5);
          return ci.a(var3, -1);
        } else {
          var3 = param2.b((byte) 44, 5);
          return ci.a(var3, -1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Only show game chat from my friends";
        field_b = new String[4];
        field_b[3] = "On Tremor";
        field_b[1] = "On Move";
        field_b[0] = "On Finish";
        field_b[2] = "On Darkness";
    }
}
