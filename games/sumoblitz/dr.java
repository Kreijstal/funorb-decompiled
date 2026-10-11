/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dr extends ah {
    private int field_T;
    static vl[] field_S;

    final static void o(int param0) {
        fq.field_f.a(-115);
        if (param0 != 250) {
          dr.o(-9);
        }
    }

    dr(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
        int var5;
        var5 = this.field_Q;
        if (var5 == 6) {
          this.field_T = 0;
        } else {
          if (var5 != 7) {
            this.field_T = -1;
          } else {
            this.field_T = 1;
          }
        }
    }

    final void d(int param0) {
        super.d(-104);
        if (-1 == this.field_T) {
          if (param0 < -55) {
            return;
          }
          dr.c(true);
          return;
        }
        if ((this.field_r - 100) % 250 != 0) {
          if (param0 < -55) {
            return;
          }
          dr.c(true);
          return;
        }
        oc.a(uj.a(this.field_T, this.field_C - this.field_E, 0, (byte) 84, this.field_z - this.field_A), false);
        if (param0 < -55) {
          return;
        }
        dr.c(true);
    }

    public static void c(boolean param0) {
        if (param0) {
          return;
        }
        field_S = null;
    }

    static {
    }
}
