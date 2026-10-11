/*
 * Decompiled by CFR-JS 0.4.0.
 */
class oh {
    static qr field_c;
    static qr field_a;
    oh field_f;
    static String field_g;
    long field_b;
    static bi[] field_d;
    oh field_e;

    final static int b(int param0, int param1) {
        int var2 = 94 % ((-61 - param1) / 58);
        param0 = param0 & 8191;
        if (param0 < 4096) {
          return param0 >= 2048 ? -br.field_o[param0 - 2048] : br.field_o[2048 - param0];
        }
        return 6144 <= param0 ? br.field_o[-6144 + param0] : -br.field_o[-param0 + 6144];
    }

    final static void b(int param0) {
        if (param0 == ~gm.field_i) {
          qk.g(-125);
          gm.field_i = 11;
          oi.field_f = true;
          return;
        }
        if (!dh.a(-12165)) {
          qk.g(-125);
          gm.field_i = 11;
          oi.field_f = true;
          return;
        }
        oi.field_f = true;
    }

    final static bg[] c(byte param0) {
        if (param0 == -90) {
          return new bg[]{og.field_b, dm.field_f, mj.field_Rb};
        }
        oh.a(false);
        return new bg[]{og.field_b, dm.field_f, mj.field_Rb};
    }

    final void b(byte param0) {
        if (this.field_e == null) {
          return;
        }
        this.field_e.field_f = this.field_f;
        if (param0 < -57) {
          this.field_f.field_e = this.field_e;
          this.field_e = null;
          this.field_f = null;
          return;
        }
        this.c(32);
        this.field_f.field_e = this.field_e;
        this.field_e = null;
        this.field_f = null;
    }

    public static void a(boolean param0) {
        if (param0) {
          field_g = null;
          field_d = null;
          field_c = null;
          field_a = null;
          return;
        }
        oh.b(true);
        field_g = null;
        field_d = null;
        field_c = null;
        field_a = null;
    }

    final static boolean b(boolean param0) {
        if (!param0) {
          field_d = (bi[]) null;
          if (wg.field_f == null) {
            return false;
          }
          if (cs.field_j.a(64)) {
            return true;
          }
          return false;
        }
        if (wg.field_f == null) {
          return false;
        }
        if (cs.field_j.a(64)) {
          return true;
        }
        return false;
    }

    final boolean c(int param0) {
        if (this.field_e == null) {
          return false;
        }
        if (param0 != 2048) {
          oh.b(12);
          return true;
        }
        return true;
    }

    static {
        field_g = "All remaining colonies have agreed to a diplomatic settlement.";
    }
}
