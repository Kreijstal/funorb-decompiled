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
        if ((var5 ^ -1) == -7) {
          this.field_T = 0;
          return;
        } else {
          if (-8 != (var5 ^ -1)) {
            this.field_T = -1;
            return;
          } else {
            this.field_T = 1;
            return;
          }
        }
    }

    final void d(int param0) {
        super.d(-104);
        if (-1 != this.field_T) {
          if (-1 == ((this.field_r - 100) % 250 ^ -1)) {
            oc.a(uj.a(this.field_T, this.field_C - this.field_E, 0, (byte) 84, this.field_z + -this.field_A), false);
            if (param0 >= -55) {
              dr.c(true);
              return;
            } else {
              return;
            }
          } else {
            if (param0 >= -55) {
              dr.c(true);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 >= -55) {
            dr.c(true);
            return;
          } else {
            return;
          }
        }
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
