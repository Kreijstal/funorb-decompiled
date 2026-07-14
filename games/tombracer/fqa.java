/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fqa extends kna {
    private f field_G;
    private jma field_H;
    private boolean field_I;
    static String[] field_F;

    final void w(int param0) {
        super.w(-126);
        ((fqa) this).field_G.a(((fqa) this).o((byte) -57), false);
        if (param0 >= -122) {
            ((fqa) this).field_G = null;
        }
    }

    abstract boolean r(byte param0);

    void a(boolean param0, kh param1) {
        super.a(param0, param1);
        ((fqa) this).field_G.a(param1, 115, ((fqa) this).o((byte) -39));
        if (((fqa) this).r((byte) 93)) {
            param1.a((byte) -19, !((fqa) this).field_I ? 0 : 1, 1);
        }
    }

    final void x(int param0) {
        super.x(param0);
        if (null == ((fqa) this).field_H) {
          return;
        } else {
          ((fqa) this).field_H.h(1).a(9, ((fqa) this).field_G.a((byte) -103));
          return;
        }
    }

    public static void A(int param0) {
        field_F = null;
        if (param0 != 1) {
            boolean discarded$0 = fqa.a(false, 'ￆ');
        }
    }

    abstract int B(int param0);

    final static int[] e(boolean param0) {
        if (!param0) {
            return null;
        }
        return new int[8];
    }

    final static boolean a(boolean param0, char param1) {
        if (!Character.isISOControl(param1)) {
          if (!q.a(param1, 11955)) {
            if (!param0) {
              if (param1 != 45) {
                if (param1 != 160) {
                  if (32 != param1) {
                    if (param1 == 95) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    fqa(la param0, int param1) {
        super(param0, param1);
        ((fqa) this).field_G = new f(((fqa) this).B(31609), 0);
    }

    fqa(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        ((fqa) this).field_G = new f(((fqa) this).B(31609), 0, param0.field_E, param2);
        if (((fqa) this).r((byte) 93)) {
            ((fqa) this).field_I = (param2.b((byte) 44, 1) ^ -1) == -2 ? true : false;
        }
    }

    final void a(ut param0, byte param1) {
        ((fqa) this).field_H = param0.k((byte) -77);
        if (param1 < -51) {
          if (((fqa) this).r((byte) 93)) {
            if (!((fqa) this).field_I) {
              ((fqa) this).field_H.a(-2, true);
              return;
            } else {
              ((fqa) this).field_H.b(1, 52);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new String[]{"<%0> was burnt", "<%0> was flamed", "<%0> was immolated", "<%0> was barbecued", "<%0> was carbonised", "<%0> was toasted", "<%0> was roasted", "<%0> was fired", "<%0> was slightly more than well-done", "<%0> felt the burn", "<%0> got a little hot under the collar", "<%0> couldn't take the heat", "<%0> should stay out of the kitchen", "<%0> smelled the napalm"};
    }
}
