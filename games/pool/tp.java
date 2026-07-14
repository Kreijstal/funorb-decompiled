/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tp {
    static int field_b;
    static vh field_i;
    static int[] field_h;
    static String field_g;
    static kh field_e;
    static String field_c;
    static String field_a;
    static String field_f;
    static String field_d;

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        if (param0 != 0) {
          field_g = null;
          field_h = null;
          field_a = null;
          field_i = null;
          field_c = null;
          field_e = null;
          field_f = null;
          return;
        } else {
          field_h = null;
          field_a = null;
          field_i = null;
          field_c = null;
          field_e = null;
          field_f = null;
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        int var3 = 0;
        bj var4 = null;
        var3 = Pool.field_O;
        var4 = (bj) (Object) tm.field_i.c((byte) 73);
        L0: while (true) {
          if (var4 == null) {
            if (!param0) {
              field_f = null;
              return;
            } else {
              return;
            }
          } else {
            un.a(param1, var4, (byte) -51);
            var4 = (bj) (Object) tm.field_i.f((byte) -5);
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_h = new int[12];
        field_a = "<col=bbbbcc>Versus</col>";
        field_f = "Remove name";
        field_c = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_d = "The following settings need to be changed:  ";
    }
}
