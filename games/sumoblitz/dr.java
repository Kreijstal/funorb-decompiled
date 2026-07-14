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
        int var5 = ((dr) this).field_Q;
        if (var5 != -7) {
            // if_icmpne L44
        } else {
            ((dr) this).field_T = 0;
        }
        ((dr) this).field_T = 1;
        ((dr) this).field_T = -1;
    }

    final void d(int param0) {
        super.d(-104);
        if (-1 != ((dr) this).field_T) {
          if (-1 == ((((dr) this).field_r - 100) % 250 ^ -1)) {
            oc.a(uj.a(((dr) this).field_T, ((dr) this).field_C - ((dr) this).field_E, 0, (byte) 84, ((dr) this).field_z + -((dr) this).field_A), false);
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
