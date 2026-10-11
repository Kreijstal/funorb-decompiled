/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    static volatile boolean field_d;
    static int[] field_a;
    static String field_b;
    static String field_c;
    static int[] field_e;

    final static boolean a(int param0, int param1, boolean param2, int param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        if (param2) {
          if (p.field_n[param1] < p.field_n[param3]) {
            return true;
          }
          if (p.field_n[param1] > p.field_n[param3]) {
            return false;
          }
          if (db.field_l[param1] < db.field_l[param3]) {
            return true;
          }
          if (db.field_l[param1] > db.field_l[param3]) {
            return false;
          }
          if (param0 != -29680) {
            field_a = (int[]) null;
          }
          var4 = ij.field_c[param1] + (q.field_h[param1] + mj.field_b[param1]);
          var5 = ij.field_c[param3] + mj.field_b[param3] + q.field_h[param3];
          if (var4 < var5) {
            return true;
          }
          if (var5 < var4) {
            return false;
          }
          return !(param3 <= param1);
        }
        if (db.field_l[param1] < db.field_l[param3]) {
          return true;
        }
        if (db.field_l[param1] > db.field_l[param3]) {
          return false;
        }
        if (p.field_n[param3] > p.field_n[param1]) {
          return true;
        }
        if (p.field_n[param3] < p.field_n[param1]) {
          return false;
        }
        if (param0 == -29680) {
          var4Lifetime1 = ij.field_c[param1] + (q.field_h[param1] + mj.field_b[param1]);
          var5Lifetime1 = ij.field_c[param3] + mj.field_b[param3] + q.field_h[param3];
          if (var4Lifetime1 < var5Lifetime1) {
            return true;
          }
          if (var5Lifetime1 < var4Lifetime1) {
            return false;
          }
          return !(param3 <= param1);
        }
        field_a = (int[]) null;
        var4Lifetime2 = ij.field_c[param1] + (q.field_h[param1] + mj.field_b[param1]);
        var5Lifetime2 = ij.field_c[param3] + mj.field_b[param3] + q.field_h[param3];
        if (var4Lifetime2 < var5Lifetime2) {
          return true;
        }
        if (var5Lifetime2 < var4Lifetime2) {
          return false;
        }
        if (param3 <= param1) {
          return false;
        }
        return true;
    }

    final static void a(java.awt.Component param0, int param1, byte param2, le param3, boolean param4) {
        gd.a(param1, param4, 10);
        wd.field_e = gd.a(param3, param0, 0, 22050);
        cb.field_g = gd.a(param3, param0, 1, 1024);
        bg.field_tb = new qj();
        if (param2 <= 66) {
          return;
        }
        try {
          cb.field_g.b(bg.field_tb);
          sh.field_e = new qj();
          wd.field_e.b(sh.field_e);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "oa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 != 109) {
          return;
        }
        field_e = null;
    }

    static {
        field_a = new int[8192];
        field_b = "Just play";
        field_e = new int[8192];
        field_c = "Click";
        field_d = false;
    }
}
