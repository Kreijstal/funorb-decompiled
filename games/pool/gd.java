/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static int[] field_d;
    static PacketBuffer field_f;
    static int field_g;
    static boolean field_b;
    static Sprite field_e;
    static int[] field_a;
    static DualLinkNodeHashTable field_c;

    public static void releaseStatics(int param0) {
        if (param0 == -2182) {
          field_f = null;
          field_e = null;
          field_a = null;
          field_d = null;
          field_c = null;
          return;
        }
        field_f = (PacketBuffer) null;
        field_f = null;
        field_e = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static String a(boolean param0) {
        if (TabbedPane.field_Lb == ra.field_e) {
          return LoginPayload.field_d;
        }
        if (!TextInputValidator.field_j.a(98)) {
          return TextInputValidator.field_j.b(2);
        }
        if (TimeTrialSelectScreen.field_I == ra.field_e) {
          return TextInputValidator.field_j.b(2);
        }
        if (param0) {
          return SpriteState.field_x;
        }
        gd.releaseStatics(-107);
        return SpriteState.field_x;
    }

    static {
        field_b = true;
        field_a = new int[]{0, 2304};
    }
}
