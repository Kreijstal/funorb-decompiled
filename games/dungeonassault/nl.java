/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nl {
    static cn field_g;
    static pp field_a;
    static String[] field_f;
    static String[] field_b;
    static md field_e;
    static String field_c;
    static int field_d;

    public static void a(byte param0) {
        field_g = null;
        field_f = null;
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 >= -93) {
          nl.a((byte) -115);
          field_e = null;
          return;
        } else {
          field_e = null;
          return;
        }
    }

    abstract void a(byte param0, java.awt.Component param1);

    final static boolean a(int param0, byte param1) {
        int var2 = nk.field_Fb[param0];
        if (!(var2 != 18)) {
            return 0 < mo.field_e ? true : false;
        }
        if (var2 == 19) {
            return ~mo.field_e > ~(-1 + en.field_a.length) ? true : false;
        }
        if (var2 == 26) {
            return mo.field_e == 6 ? true : false;
        }
        if (25 == var2) {
            return mo.field_e == 6 ? true : false;
        }
        if (!(var2 != 24)) {
            return mo.field_e == 6 ? true : false;
        }
        if (27 != var2) {
            return true;
        }
        if (6 != mo.field_e) {
            return false;
        }
        if (kn.field_e) {
            return true;
        }
        return false;
    }

    abstract void a(boolean param0, java.awt.Component param1);

    abstract int a(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{null, "Also, there are different strategies that can be employed in combat. All <%raiders> can either <%advance>, <%charge>, or attempt to <%flee>.<br><br><%advance> orders your raider to enter a room normally.<br><br><%col_charge>Charging</col> is a more aggressive attack: one point of the raider's <%defence> is transferred to <%attack>."};
        field_b = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_c = "Please Wait";
    }
}
