/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek extends java.awt.Canvas implements java.awt.event.FocusListener {
    static String[] field_j;
    static int field_c;
    java.awt.Frame field_e;
    volatile boolean field_g;
    static String field_i;
    static tc field_b;
    static String field_a;
    static uk field_f;
    static String[] field_h;
    static String field_d;

    final static double a(int param0, byte param1, int param2, int param3) {
        double var4 = -((double)param3 / (double)param2) + 0.75;
        int var6 = 81 / ((param1 - -86) / 40);
        if (!(0.0 <= var4)) {
            var4 = 0.0;
        }
        var4 = var4 + (double)(25 * param0) / 100.0;
        return var4;
    }

    public static void a(byte param0) {
        field_j = null;
        field_h = null;
        field_d = null;
        int var1 = -20 / ((-56 - param0) / 50);
        field_f = null;
        field_b = null;
        field_a = null;
        field_i = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((ek) this).field_g = true;
    }

    ek() {
    }

    final static cn[] a(byte param0, int param1) {
        int var2 = 36 % ((param0 - 13) / 57);
        cn[] var3 = new cn[9];
        var3[4] = bl.a(false, param1, 64);
        return var3;
    }

    final void a(qg param0, int param1) {
        ng.a(param0, 99, ((ek) this).field_e);
        if (param1 != 0) {
            Object var4 = null;
            ((ek) this).focusGained((java.awt.event.FocusEvent) null);
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -1;
        field_j = new String[]{"Defeat", "<%highlight>Your raider has failed!</col> When a raider is defeated in a dungeon, it will be <%highlight>teleported back to your stable to recover</col>. They will be unavailable during the rest of the raid. You can attempt this room with another raider, or try to find a different route to the <%highlight>hoard room.</col><br><br><%command>Try again with another raider, or find another route to the hoard room</col>"};
        field_a = "Only triggers once per raid.";
        field_d = "Orb of Preservation";
        field_h = new String[]{"<%0> the Warrior", "<%0> the Veteran", "<%0> the Elder", "<%0> the Venerated", "<%0> the Ancient", "<%0> the Immortal"};
        field_f = new uk();
    }
}
