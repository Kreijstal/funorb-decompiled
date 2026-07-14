/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uw extends uj {
    static String field_d;

    final int b(int param0) {
        if (param0 != -25131) {
            field_d = null;
            return oq.field_p;
        }
        return oq.field_p;
    }

    uw() {
    }

    final int b(byte param0) {
        if (param0 <= 79) {
            uw.d(-2);
            return 106;
        }
        return 106;
    }

    final static void a(byte param0, faa param1, tv param2) {
        param1.p(-23497);
        if (param0 >= -31) {
            return;
        }
        param2.a(param1, false);
        param1.f((byte) -59);
    }

    final int a(int param0) {
        if (param0 != -1) {
            return 2;
        }
        return pk.field_p;
    }

    final int d(byte param0) {
        if (param0 != 64) {
            return -9;
        }
        return oq.field_g;
    }

    final boolean a(boolean param0) {
        if (param0) {
            int discarded$0 = ((uw) this).b(-80);
            return false;
        }
        return false;
    }

    final static im a(qfa param0, int param1, int param2, int param3, int[] param4, int param5, boolean param6, byte param7) {
        if (param7 == 60) {
          if (!param0.field_n) {
            if (!bd.a(param5, (byte) -95)) {
              if (param0.field_g) {
                return new im(param0, 34037, param5, param3, param6, param4, param2, param1);
              } else {
                return new im(param0, param5, param3, hj.a(param5, (byte) -110), hj.a(param3, (byte) -109), param4);
              }
            } else {
              if (!bd.a(param3, (byte) -95)) {
                if (param0.field_g) {
                  return new im(param0, 34037, param5, param3, param6, param4, param2, param1);
                } else {
                  return new im(param0, param5, param3, hj.a(param5, (byte) -110), hj.a(param3, (byte) -109), param4);
                }
              } else {
                return new im(param0, 3553, param5, param3, param6, param4, param2, param1);
              }
            }
          } else {
            return new im(param0, 3553, param5, param3, param6, param4, param2, param1);
          }
        } else {
          return null;
        }
    }

    public static void d(int param0) {
        if (param0 != 34037) {
            return;
        }
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "WHL";
    }
}
