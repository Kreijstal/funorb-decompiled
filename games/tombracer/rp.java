/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp extends vg {
    bua field_j;
    static ft field_g;
    static int field_h;
    static int field_i;
    static jpa field_f;

    public static void a(boolean param0) {
        field_g = null;
        field_f = null;
        if (!param0) {
          rp.a(-58);
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param1 == -16226) {
          return param2 <= param3 ? param3 <= param0 ? param3 : param0 : param2;
        }
        rp.a(false);
        return param2 <= param3 ? param3 <= param0 ? param3 : param0 : param2;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (param3 != 73) {
          return;
        }
        hp.a(param1, 0, 0, this.field_j.b((byte) 74), -1918106173, param2, param0);
    }

    rp(int param0) {
        this.field_j = new bua(0, param0, 1);
        this.field_j.a(param0, false, 0, 0, true);
    }

    final static void a(int param0) {
        pra.b(-1);
        if (param0 != 8824) {
          return;
        }
        pqa.i(0);
    }

    final void b(int param0) {
        if (param0 > -30) {
          field_h = 127;
          this.field_j.a(0);
          return;
        }
        this.field_j.a(0);
    }

    static {
        field_g = new ft(1);
    }
}
