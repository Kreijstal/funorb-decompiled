/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf extends lb implements wk {
    static String field_U;
    static int[] field_Y;
    static String field_T;
    private eh field_V;
    static int[] field_X;
    private int field_S;
    static String field_W;

    lf(String param0, tg param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, int param1, byte param2, al param3) {
        super.a(param0, param1, param2, param3);
        ((lf) this).field_S = -param1 + -((lf) this).field_p + kf.field_b;
    }

    final void a(int param0, eh param1) {
        if (param0 != 1) {
            return;
        }
        ((lf) this).field_V = param1;
    }

    public final eh a(byte param0) {
        if (param0 >= -56) {
            eh discarded$0 = ((lf) this).a((byte) 21);
            return ((lf) this).field_V;
        }
        return ((lf) this).field_V;
    }

    final static int a(int param0, int param1, byte param2, boolean param3) {
        if (param2 != 95) {
            return 57;
        }
        return ia.b(false);
    }

    final void b(boolean param0) {
        super.b(param0);
        if (!(((lf) this).field_V == null)) {
            ((lf) this).field_V.a(-97);
        }
    }

    public static void f(byte param0) {
        field_X = null;
        field_W = null;
        field_U = null;
        field_T = null;
        if (param0 > -33) {
          int discarded$2 = lf.a(68, 38, (byte) -50, true);
          field_Y = null;
          return;
        } else {
          field_Y = null;
          return;
        }
    }

    final static boolean a(byte param0, la param1) {
        if (param0 != -68) {
            return true;
        }
        return param1.d(0, 1) == 1 ? true : false;
    }

    final String e(int param0) {
        if (((lf) this).field_q) {
          if (null != ((lf) this).field_n) {
            if (param0 != 0) {
              int discarded$2 = lf.a(34, 125, (byte) -88, true);
              cj.a(true, ((lf) this).field_x + -((lf) this).field_S + kf.field_b, fg.field_a);
              return ((lf) this).field_n;
            } else {
              cj.a(true, ((lf) this).field_x + -((lf) this).field_S + kf.field_b, fg.field_a);
              return ((lf) this).field_n;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = "Accept";
        field_X = new int[8192];
        field_W = "Waiting for levels";
    }
}
