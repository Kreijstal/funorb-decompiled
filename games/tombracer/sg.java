/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg extends nv {
    private boolean field_r;
    private boolean field_v;
    private boolean field_t;
    private boolean field_p;
    static String field_n;
    static int[] field_u;
    static String field_q;
    private boolean field_o;
    static String field_s;

    final int a(int param0, int param1) {
        if (param1 >= -48) {
            field_q = null;
            return param0;
        }
        return param0;
    }

    public static void b(int param0) {
        field_n = null;
        field_q = null;
        if (param0 != -2) {
            return;
        }
        field_s = null;
        field_u = null;
    }

    sg(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((sg) this).field_r = false;
        ((sg) this).field_p = 1 != param1.b((byte) 44, 1) ? false : true;
        ((sg) this).field_t = -2 != (param1.b((byte) 44, 1) ^ -1) ? false : true;
        ((sg) this).field_v = (param1.b((byte) 44, 1) ^ -1) != -2 ? false : true;
        ((sg) this).field_o = param1.b((byte) 44, 1) == 1 ? true : false;
    }

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        if (!(!param0.equals((Object) (Object) "B"))) {
            return Byte.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "I"))) {
            return Integer.TYPE;
        }
        if (param0.equals((Object) (Object) "S")) {
            return Short.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "J"))) {
            return Long.TYPE;
        }
        if (param0.equals((Object) (Object) "Z")) {
            return Boolean.TYPE;
        }
        if (param0.equals((Object) (Object) "F")) {
            return Float.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "D"))) {
            return Double.TYPE;
        }
        if (param1 != 1) {
            sg.b(-10);
            if (!(!param0.equals((Object) (Object) "C"))) {
                return Character.TYPE;
            }
            return Class.forName(param0);
        }
        if (!(!param0.equals((Object) (Object) "C"))) {
            return Character.TYPE;
        }
        return Class.forName(param0);
    }

    final void k(int param0) {
        hca var2 = null;
        if (param0 == 5418) {
          if (!((sg) this).d(8031)) {
            if (((sg) this).field_r) {
              if (!((sg) this).field_p) {
                return;
              } else {
                ((sg) this).c(false);
                return;
              }
            } else {
              return;
            }
          } else {
            L0: {
              ((sg) this).field_r = true;
              var2 = ((sg) this).m((byte) 19);
              if (((sg) this).field_t) {
                var2.i(true);
                break L0;
              } else {
                break L0;
              }
            }
            if (!((sg) this).field_o) {
              if (!((sg) this).field_v) {
                return;
              } else {
                var2.n(21120);
                return;
              }
            } else {
              var2.l((byte) 28);
              if (!((sg) this).field_v) {
                return;
              } else {
                var2.n(21120);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final int a(boolean param0) {
        if (param0) {
            ((sg) this).field_v = true;
            return 10;
        }
        return 10;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        param1.a((byte) -125, ((sg) this).field_p ? 1 : 0, 1);
        param1.a((byte) -25, !((sg) this).field_t ? 0 : 1, 1);
        param1.a((byte) 12, !((sg) this).field_v ? 0 : 1, 1);
        param1.a((byte) -125, ((sg) this).field_o ? 1 : 0, 1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "You ran out of time";
        field_q = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_s = "Quick Chat game";
    }
}
