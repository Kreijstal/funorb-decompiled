/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class un {
    byte[] field_j;
    static int[] field_a;
    byte[] field_b;
    int field_g;
    static kv field_m;
    static int field_i;
    int field_d;
    int field_e;
    int field_l;
    int field_h;
    static String field_f;
    int field_c;
    int field_k;

    public static void a(int param0) {
        field_f = null;
        if (param0 == 2) {
          field_a = null;
          field_m = null;
          return;
        }
        un.a(false, -119, 88, 16);
        field_a = null;
        field_m = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 < 82) {
          return -51;
        }
        if (Math.abs(param2) < Math.abs(param1)) {
          return param1 >= 0 ? 3 : 1;
        }
        if (Math.abs(param2) > Math.abs(param1)) {
          return param2 >= 0 ? 4 : 2;
        }
        if (param2 < 0) {
          return param1 < 0 ? 1 : 2;
        }
        if (0 >= param2) {
          return 0;
        }
        return param1 >= 0 ? 3 : 4;
    }

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var5Lifetime1;
        if (param0) {
          if (gk.field_a[param1] > gk.field_a[param3]) {
            return true;
          }
          if (gk.field_a[param1] < gk.field_a[param3]) {
            return false;
          }
          if (uc.field_k[param3] < uc.field_k[param1]) {
            return true;
          }
          if (uc.field_k[param1] < uc.field_k[param3]) {
            return false;
          }
          if (param2 != -17596) {
            return false;
          }
          var4 = uda.field_X[param3] + sc.field_o[param3] + mba.field_a[param3];
          var5 = sc.field_o[param1] + mba.field_a[param1] + uda.field_X[param1];
          if (var4 < var5) {
            return true;
          }
          if (var4 > var5) {
            return false;
          }
          return !(param1 <= param3);
        }
        if (uc.field_k[param1] > uc.field_k[param3]) {
          return true;
        }
        if (uc.field_k[param1] < uc.field_k[param3]) {
          return false;
        }
        if (gk.field_a[param3] < gk.field_a[param1]) {
          return true;
        }
        if (gk.field_a[param1] < gk.field_a[param3]) {
          return false;
        }
        if (param2 != -17596) {
          return false;
        }
        var4Lifetime1 = uda.field_X[param3] + sc.field_o[param3] + mba.field_a[param3];
        var5Lifetime1 = sc.field_o[param1] + mba.field_a[param1] + uda.field_X[param1];
        if (var4Lifetime1 < var5Lifetime1) {
          return true;
        }
        if (var4Lifetime1 > var5Lifetime1) {
          return false;
        }
        if (param1 <= param3) {
          return false;
        }
        return true;
    }

    static {
        field_f = "We've filled your shopping bag with some free food! Click on the shopping bag to see what you have in stock.";
    }
}
