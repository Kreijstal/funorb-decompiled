/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mc {
    static int field_l;
    static boolean field_k;
    static String field_d;
    long field_c;
    static int field_b;
    static int field_f;
    mc field_j;
    static int[] field_m;
    static oh[] field_i;
    mc field_e;
    static String field_a;
    static String field_g;
    static String field_h;

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final void b(boolean param0) {
        if (((mc) this).field_e != null) {
          ((mc) this).field_e.field_j = ((mc) this).field_j;
          ((mc) this).field_j.field_e = ((mc) this).field_e;
          ((mc) this).field_j = null;
          if (param0) {
            ((mc) this).b(false);
            ((mc) this).field_e = null;
            return;
          } else {
            ((mc) this).field_e = null;
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(byte param0) {
        if (param0 != 95) {
            return true;
        }
        if (null == ((mc) this).field_e) {
            return false;
        }
        return true;
    }

    public static void b(int param0) {
        field_i = null;
        field_g = null;
        field_d = null;
        if (param0 != 20043) {
          mc.b(-4);
          field_h = null;
          field_a = null;
          field_m = null;
          return;
        } else {
          field_h = null;
          field_a = null;
          field_m = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 2;
        field_d = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_g = "You have won!";
        field_h = "From <%0>: ";
        field_a = "Hide private chat and appear offline to friends";
    }
}
