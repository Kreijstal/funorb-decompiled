/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uh {
    static String field_b;
    static int[] field_e;
    static String field_f;
    static int[] field_d;
    static int field_c;
    static int field_a;

    final static boolean a(int param0, int param1, boolean param2, byte param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        if (!param2) {
          if (td.field_c[param1] < td.field_c[param0]) {
            return true;
          }
          if (td.field_c[param1] > td.field_c[param0]) {
            return false;
          }
          if (ug.field_I[param0] > ug.field_I[param1]) {
            return true;
          }
          if (ug.field_I[param0] < ug.field_I[param1]) {
            return false;
          }
          var4 = sk.field_B[param1] + tf.field_c[param1] + mk.field_c[param1];
          if (param3 == -54) {
            var5 = tf.field_c[param0] + (sk.field_B[param0] + mk.field_c[param0]);
            if (var5 > var4) {
              return true;
            }
            if (var4 > var5) {
              return false;
            }
            return !(param0 <= param1);
          }
          uh.a(-121);
          var5Lifetime3 = tf.field_c[param0] + (sk.field_B[param0] + mk.field_c[param0]);
          if (var5Lifetime3 > var4) {
            return true;
          }
          if (var4 > var5Lifetime3) {
            return false;
          }
          return !(param0 <= param1);
        }
        if (ug.field_I[param1] < ug.field_I[param0]) {
          return true;
        }
        if (ug.field_I[param0] < ug.field_I[param1]) {
          return false;
        }
        if (td.field_c[param0] > td.field_c[param1]) {
          return true;
        }
        if (td.field_c[param0] < td.field_c[param1]) {
          return false;
        }
        var4Lifetime1 = sk.field_B[param1] + tf.field_c[param1] + mk.field_c[param1];
        if (param3 != -54) {
          uh.a(-121);
          var5Lifetime1 = tf.field_c[param0] + (sk.field_B[param0] + mk.field_c[param0]);
          if (var5Lifetime1 > var4Lifetime1) {
            return true;
          }
          if (var4Lifetime1 > var5Lifetime1) {
            return false;
          }
          return !(param0 <= param1);
        }
        var5Lifetime2 = tf.field_c[param0] + (sk.field_B[param0] + mk.field_c[param0]);
        if (var5Lifetime2 > var4Lifetime1) {
          return true;
        }
        if (var4Lifetime1 > var5Lifetime2) {
          return false;
        }
        if (param0 <= param1) {
          return false;
        }
        return true;
    }

    abstract sd a(boolean param0);

    final static void a(byte param0) {
        u.field_A.d(false);
        if (ea.field_e == null) {
          ea.field_e = new hk(u.field_A, bh.field_a);
        }
        u.field_A.b((ub) (ea.field_e), (byte) 73);
        int var1 = -118 % ((76 - param0) / 49);
    }

    abstract void a(int param0, va param1);

    public static void a(int param0) {
        field_d = null;
        if (param0 == 8192) {
          field_e = null;
          field_b = null;
          field_f = null;
          return;
        }
        uh.a(-86);
        field_e = null;
        field_b = null;
        field_f = null;
    }

    static {
        field_e = new int[8192];
        field_d = new int[4];
        field_b = "WORLD SELECT";
        field_f = "Connection lost - attempting to reconnect";
        field_a = 0;
    }
}
