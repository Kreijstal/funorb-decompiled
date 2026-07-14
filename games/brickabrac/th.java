/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static jp field_j;
    int field_g;
    static String field_f;
    static String[] field_a;
    static boolean field_d;
    static jp field_i;
    static boolean field_h;
    static jp field_c;
    int field_e;
    static boolean field_b;

    public static void a(int param0) {
        int var1 = -115 % ((83 - param0) / 41);
        field_f = null;
        field_a = null;
        field_i = null;
        field_c = null;
        field_j = null;
    }

    final static boolean a(int[] param0, long param1, int param2, boolean param3, String param4) {
        og var6 = null;
        CharSequence var7 = null;
        if (!kb.a(param1, -3, param4, param0, param2)) {
          return false;
        } else {
          L0: {
            if (param2 != 1) {
              break L0;
            } else {
              param2 = 0;
              break L0;
            }
          }
          tk.field_p = param4;
          ng.field_b = param2;
          var7 = (CharSequence) (Object) param4;
          kb.field_Qb = gb.a(var7, 64);
          qn.field_n = param1;
          var6 = hq.a(param0, cp.field_K, ko.field_j, nb.field_e, (byte) -78);
          if (param3) {
            field_f = null;
            fk.a(105, var6);
            return true;
          } else {
            fk.a(105, var6);
            return true;
          }
        }
    }

    final static void a(byte param0) {
        Object var2 = null;
        if (param0 != -63) {
          var2 = null;
          boolean discarded$2 = th.a((int[]) null, 43L, -67, true, (String) null);
          ri.c(true);
          return;
        } else {
          ri.c(true);
          return;
        }
    }

    final static String a(CharSequence param0, int param1) {
        if (param1 >= -81) {
            th.a((byte) -77);
            return bl.a(0, false, param0);
        }
        return bl.a(0, false, param0);
    }

    final static void b(int param0) {
        if (param0 != 1) {
            th.a((byte) 83);
            if (!nq.field_p) {
                return;
            }
            rd.a(-1);
            return;
        }
        if (nq.field_p) {
            rd.a(-1);
            return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    th(int param0, int param1, int param2, int param3) {
        ((th) this).field_g = param3;
        ((th) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = false;
        field_f = "Players: ";
    }
}
