/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    static int[] field_a;

    final static void a(int param0, int param1) {
        if (param1 != 23820) {
          return;
        }
        if (2 >= param0) {
          kd.field_C = 0;
          return;
        }
        if (a.field_a) {
          kd.field_C = 0;
          return;
        }
        if (!wk.a(80)) {
          kd.field_C = param0;
          m.field_f = ra.a(1, na.field_d, jl.field_d, (ia.field_k << 2) + nf.field_l, new int[]{param0}, param1 - 23899, fc.field_e, 65534, 3);
          return;
        }
        kd.field_C = 0;
    }

    final static boolean a(byte param0, char param1) {
        if (Character.isISOControl(param1)) {
          return false;
        }
        if (u.a(9476, param1)) {
          return true;
        }
        if (param0 != -121) {
          field_a = (int[]) null;
          if (param1 == 45) {
            return true;
          }
          if (param1 == 160) {
            return true;
          }
          if (32 == param1) {
            return true;
          }
          if (95 != param1) {
            return false;
          }
          return true;
        }
        if (param1 == 45) {
          return true;
        }
        if (param1 == 160) {
          return true;
        }
        if (32 == param1) {
          return true;
        }
        if (95 != param1) {
          return false;
        }
        return true;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 30334) {
          field_a = (int[]) null;
        }
    }

    static {
        field_a = new int[]{0, 39, 75, 103, 121, 128, 121, 103, 75, 39, 0, -39, -75, -103, -121, -128, -121, -103, -75, -39};
    }
}
