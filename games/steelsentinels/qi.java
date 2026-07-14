/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static String field_h;
    static String field_e;
    static wk[] field_a;
    static kf field_d;
    static String field_b;
    static int[] field_f;
    static String field_g;
    static boolean field_l;
    static ud field_j;
    static boolean field_k;
    static gh field_c;
    static wk field_i;

    final static me a(boolean param0, long param1, String param2, int param3, String param4) {
        if (-1L == (param1 ^ -1L)) {
          if (param4 == null) {
            if (param0) {
              return (me) (Object) new pg(param1, param2);
            } else {
              if (param3 != 0) {
                field_h = null;
                return (me) (Object) new fb(param1, param2);
              } else {
                return (me) (Object) new fb(param1, param2);
              }
            }
          } else {
            return (me) (Object) new on(param4, param2);
          }
        } else {
          if (param0) {
            return (me) (Object) new pg(param1, param2);
          } else {
            if (param3 != 0) {
              field_h = null;
              return (me) (Object) new fb(param1, param2);
            } else {
              return (me) (Object) new fb(param1, param2);
            }
          }
        }
    }

    final static void a(java.math.BigInteger param0, gi param1, gi param2, java.math.BigInteger param3, int param4) {
        if (param4 != 5) {
            return;
        }
        nf.a(false, param2, param3, 0, param1.field_p, param0, param1.field_t);
    }

    public static void a(int param0) {
        field_j = null;
        field_b = null;
        field_f = null;
        field_i = null;
        int var1 = 119 % ((-9 - param0) / 50);
        field_e = null;
        field_c = null;
        field_d = null;
        field_g = null;
        field_h = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "The <%0> has already been engineered.";
        field_d = null;
        field_h = "Suggested names: ";
        field_j = null;
        field_l = false;
        field_g = "Message game";
        field_b = "Month";
        field_f = new int[]{2, 20, 21, 6, 37, 45, 5, 11, 13};
    }
}
