/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    static long field_e;
    static int field_g;
    static boolean field_d;
    static pf field_a;
    static String field_f;
    static int field_c;
    int field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(dj param0, int param1, dj param2, dj param3, boolean param4) {
        Object var6 = null;
        gl.field_E = co.a("", param1 + -118);
        gl.field_E.a(false, -54);
        ll.a(param2, param3, param0, -19041);
        if (param1 != -1) {
            var6 = null;
            nk.a((dj) null, 101, (dj) null, (dj) null, false);
        } else {
            mm.c((byte) -70);
            fk.field_F = ic.field_S;
            tk.field_a = ic.field_S;
            return;
        }
        mm.c((byte) -70);
        fk.field_F = ic.field_S;
        tk.field_a = ic.field_S;
    }

    public static void a(int param0) {
        if (param0 != -11486) {
            return;
        }
        field_f = null;
        field_a = null;
    }

    final static boolean b(int param0) {
        lf.field_n = true;
        qh.field_e = pd.a(-22826) + (long)param0;
        return 11 == fl.field_a ? true : false;
    }

    final static boolean a(int param0, int[] param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        var2 = 0;
        if (param0 == 8) {
          L0: while (true) {
            if (8 > var2) {
              if (param1[var2] == 0) {
                var2++;
                continue L0;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final static int a(byte param0) {
        if (param0 <= 50) {
            field_g = 56;
            return (int)(1000000000L / ea.field_a);
        }
        return (int)(1000000000L / ea.field_a);
    }

    nk(int param0) {
        ((nk) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Create your own free Jagex account";
        field_d = false;
        field_c = 1044;
    }
}
