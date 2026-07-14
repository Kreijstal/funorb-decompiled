/*
 * Decompiled by CFR-JS 0.4.0.
 */
class sd extends df {
    int field_x;
    private pf field_s;
    static int field_p;
    fs field_o;
    int[] field_w;
    int field_r;
    ln field_q;
    int[] field_u;
    static boolean field_v;
    static String field_t;
    static String field_y;

    void a(int param0, ln param1) {
        if (param0 != -21771) {
            return;
        }
        ((sd) this).field_s.a((byte) -113, (oh) (Object) param1);
    }

    ln h(int param0) {
        if (param0 != -23410) {
          boolean discarded$2 = ((sd) this).e(126);
          return (ln) (Object) ((sd) this).field_s.a((byte) -71);
        } else {
          return (ln) (Object) ((sd) this).field_s.a((byte) -71);
        }
    }

    ln i(int param0) {
        if (param0 > -16) {
            return null;
        }
        return (ln) (Object) ((sd) this).field_s.h(43);
    }

    public static void f(int param0) {
        field_y = null;
        if (param0 != -28714) {
            return;
        }
        field_t = null;
    }

    boolean e(int param0) {
        if (param0 != 27650) {
            ((sd) this).field_u = null;
            return ((sd) this).field_s.g(27);
        }
        return ((sd) this).field_s.g(27);
    }

    void a(pf param0, int param1) {
        ((sd) this).field_s = param0;
        if (param1 != -9332) {
            ln discarded$0 = ((sd) this).i(-14);
        }
    }

    int g(int param0) {
        int var2 = -77 / ((param0 - 5) / 51);
        return ((sd) this).field_s.e(0);
    }

    ln j(int param0) {
        if (param0 != 18229) {
          int discarded$2 = ((sd) this).g(-119);
          return (ln) (Object) ((sd) this).field_s.d(0);
        } else {
          return (ln) (Object) ((sd) this).field_s.d(0);
        }
    }

    sd(fs param0, ln param1) {
        ((sd) this).field_q = param1;
        ((sd) this).field_o = param0;
        ((sd) this).field_s = new pf();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = false;
        field_y = "The following settings need to be changed:  ";
    }
}
