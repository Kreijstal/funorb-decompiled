/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static String field_h;
    static int field_a;
    static String field_c;
    static int field_f;
    static int[][] field_b;
    static wk[] field_e;
    static sj field_g;
    static int field_i;
    static gk[] field_d;

    final static int a(int param0, boolean param1) {
        if (param1) {
          field_e = (wk[]) null;
          param0 -= 17;
          if (param0 < 0) {
            return -1;
          }
          if (!(param0 >= t.field_d.length)) {
            return t.field_d[param0];
          }
          return -1;
        }
        param0 -= 17;
        if (param0 < 0) {
          return -1;
        }
        if (param0 < t.field_d.length) {
          return t.field_d[param0];
        }
        return -1;
    }

    final static wk b(int param0, boolean param1) {
        int var2;
        int var3;
        var3 = SteelSentinels.field_G;
        var2 = param0;
        if (var2 == 104) {
          return hb.field_j[0];
        }
        if (var2 == 105) {
          return hb.field_j[1];
        }
        if (var2 == 106) {
          return hb.field_j[2];
        }
        if (var2 == 107) {
          return hb.field_j[3];
        }
        if (108 == var2) {
          return hb.field_j[4];
        }
        if (var2 == 109) {
          return hb.field_j[6];
        }
        if (var2 == 110) {
          return hb.field_j[7];
        }
        if (var2 == 111) {
          return hb.field_j[8];
        }
        if (var2 == 112) {
          return hb.field_j[9];
        }
        if (var2 == 113) {
          return hb.field_j[10];
        }
        if (114 == var2) {
          return hb.field_j[11];
        }
        if (var2 == 115) {
          return hb.field_j[12];
        }
        if (var2 == 116) {
          return hb.field_j[13];
        }
        if (var2 == 117) {
          return hb.field_j[14];
        }
        if (var2 == 118) {
          return hb.field_j[15];
        }
        if (var2 == 119) {
          return hb.field_j[16];
        }
        if (var2 == 120) {
          return hb.field_j[17];
        }
        if (var2 == 121) {
          return hb.field_j[18];
        }
        if (var2 == 122) {
          return hb.field_j[19];
        }
        if (var2 == 123) {
          return hb.field_j[5];
        }
        if (!param1) {
          ja.b(-72, true);
        }
        if (param0 >= 200) {
          return nc.a(param0 - 199, (byte) -114).a();
        }
        if (param0 < rh.field_v.length) {
          return rh.field_v[param0];
        }
        return null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(boolean param0) {
        field_c = null;
        field_g = null;
        if (!param0) {
          return;
        }
        field_h = null;
        field_d = null;
        field_e = null;
        field_b = (int[][]) null;
    }

    static {
        field_c = "OK";
        field_f = 3;
        field_i = 0;
    }
}
