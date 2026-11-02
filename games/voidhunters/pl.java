/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl extends bia {
    static String field_e;

    final static khb[] c(byte param0) {
        if (param0 > 73) {
          return new khb[]{SetFighterBayAimspeed.field_o, SetShowTutorial.field_p, SetMassDriverFireForce.field_p};
        }
        field_e = (String) null;
        return new khb[]{SetFighterBayAimspeed.field_o, SetShowTutorial.field_p, SetMassDriverFireForce.field_p};
    }

    public static void b(byte param0) {
        int var1 = -3 % ((27 - param0) / 58);
        field_e = null;
    }

    static {
        field_e = "Add resource node";
    }
}
