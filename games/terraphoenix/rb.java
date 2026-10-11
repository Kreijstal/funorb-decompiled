/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static int[] field_a;
    static String field_c;
    static String[] field_d;
    static String[] field_b;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        field_b = null;
        if (param0 > -60) {
          field_c = (String) null;
        }
    }

    final static boolean a(int param0, boolean param1, byte param2, int param3) {
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        if (param1) {
          if (a.field_c[param0] < a.field_c[param3]) {
            return true;
          }
          if (a.field_c[param0] > a.field_c[param3]) {
            return false;
          }
          if (al.field_bb[param3] > al.field_bb[param0]) {
            return true;
          }
          if (al.field_bb[param0] > al.field_bb[param3]) {
            return false;
          }
          var4 = oa.field_a[param0] - (-oa.field_c[param0] - dd.field_L[param0]);
          var5 = dd.field_L[param3] + (oa.field_a[param3] + oa.field_c[param3]);
          if (var4 < var5) {
            return true;
          }
          var6 = 40 / ((param2 - 73) / 45);
          if (var4 > var5) {
            return false;
          }
          return !(param3 <= param0);
        }
        if (al.field_bb[param0] < al.field_bb[param3]) {
          return true;
        }
        if (al.field_bb[param0] > al.field_bb[param3]) {
          return false;
        }
        if (a.field_c[param3] > a.field_c[param0]) {
          return true;
        }
        if (a.field_c[param0] > a.field_c[param3]) {
          return false;
        }
        var4Lifetime1 = oa.field_a[param0] - (-oa.field_c[param0] - dd.field_L[param0]);
        var5Lifetime1 = dd.field_L[param3] + (oa.field_a[param3] + oa.field_c[param3]);
        if (var4Lifetime1 < var5Lifetime1) {
          return true;
        }
        var6Lifetime1 = 40 / ((param2 - 73) / 45);
        if (var4Lifetime1 > var5Lifetime1) {
          return false;
        }
        if (param3 <= param0) {
          return false;
        }
        return true;
    }

    static {
        field_c = "Retry";
        field_a = new int[4];
        field_b = new String[]{"All scores", "My scores", "Best each"};
    }
}
