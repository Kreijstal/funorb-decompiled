/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static dk field_f;
    static pj field_a;
    static boolean field_e;
    static boolean field_d;
    static int[] field_c;
    static int field_b;

    final static boolean a(boolean param0) {
        if (param0) {
          ok.a(-101);
          return ha.field_db;
        }
        return ha.field_db;
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_f = null;
        int var1 = -60 / ((76 - param0) / 41);
    }

    final static boolean a(int param0, char param1) {
        if (param0 >= -38) {
          ok.b(90);
          if (param1 == 160) {
            return true;
          }
          if (param1 == 32) {
            return true;
          }
          if (param1 == 95) {
            return true;
          }
          if (45 != param1) {
            return false;
          }
          return true;
        }
        if (param1 == 160) {
          return true;
        }
        if (param1 == 32) {
          return true;
        }
        if (param1 == 95) {
          return true;
        }
        if (45 != param1) {
          return false;
        }
        return true;
    }

    final static void b(int param0) {
        ma.field_a = new String[20];
        ma.field_a[10] = f.field_e;
        ma.field_a[12] = dl.field_f;
        ma.field_a[2] = lk.field_b;
        ma.field_a[0] = di.field_b;
        ma.field_a[4] = vh.field_F;
        ma.field_a[13] = hh.field_t;
        ma.field_a[11] = rk.field_a;
        ma.field_a[5] = vj.field_c;
        ma.field_a[14] = gg.field_b;
        ma.field_a[6] = me.field_n;
        ma.field_a[15] = lh.field_a;
        if (param0 == -29387) {
          ma.field_a[3] = qj.field_E;
          ma.field_a[1] = nc.field_a;
          ma.field_a[8] = bg.field_B[1];
          ma.field_a[17] = wa.field_c;
          ma.field_a[19] = ph.field_a;
          ma.field_a[7] = bg.field_B[0];
          ma.field_a[18] = ej.field_a;
          ma.field_a[16] = pe.field_c;
          ma.field_a[9] = bg.field_B[2];
          return;
        }
        field_e = true;
        ma.field_a[3] = qj.field_E;
        ma.field_a[1] = nc.field_a;
        ma.field_a[8] = bg.field_B[1];
        ma.field_a[17] = wa.field_c;
        ma.field_a[19] = ph.field_a;
        ma.field_a[7] = bg.field_B[0];
        ma.field_a[18] = ej.field_a;
        ma.field_a[16] = pe.field_c;
        ma.field_a[9] = bg.field_B[2];
    }

    final static void a(int param0) {
        if (param0 != 15376) {
          ok.a(-54, '>');
          qh.a(4, true);
          return;
        }
        qh.a(4, true);
    }

    static {
        field_e = false;
        field_d = false;
        field_c = new int[256];
        field_a = new pj();
    }
}
