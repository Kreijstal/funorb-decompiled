/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wf extends ll {
    static String field_v;
    static String field_y;
    static int field_x;
    static int field_C;
    int field_A;
    static String field_D;
    static String[] field_z;
    static String field_B;
    static pp field_w;

    abstract boolean c(byte param0);

    abstract Object d(int param0);

    public static void d(byte param0) {
        field_w = null;
        if (param0 != -28) {
          wf.d((byte) -46);
          field_v = null;
          field_B = null;
          field_z = null;
          field_D = null;
          field_y = null;
          return;
        } else {
          field_v = null;
          field_B = null;
          field_z = null;
          field_D = null;
          field_y = null;
          return;
        }
    }

    wf(int param0) {
        ((wf) this).field_A = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "You must have charged <%0> Orbs of Mastery in total to earn the title of <%1>.";
        field_z = new String[]{"Dark Arts", "Readjust <%attack>/<%defence> balance. (Single use)"};
        field_B = "Player Name: ";
        field_v = "Stone Golem";
        field_D = "Select a raider to sacrifice";
    }
}
