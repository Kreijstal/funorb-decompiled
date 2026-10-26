/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualLinkNode extends IntrusiveNode {
    static ia field_m;
    DualLinkNode previousSecondaryNode;
    long secondaryKey;
    static String[] field_g;
    DualLinkNode nextSecondaryNode;
    static PacketBuffer field_l;
    static jt field_e;
    static String[] field_k;
    static Sprite[] field_h;

    public static void a(int param0) {
        field_e = null;
        field_g = null;
        field_h = null;
        field_l = null;
        field_m = null;
        field_k = null;
        if (param0 != 14349) {
          DualLinkNode.a(55);
        }
    }

    final void unlinkSecondaryNode(int obfuscationGuard) {
        if (null == this.previousSecondaryNode) {
          return;
        }
        if (obfuscationGuard <= -113) {
          this.previousSecondaryNode.nextSecondaryNode = this.nextSecondaryNode;
          this.nextSecondaryNode.previousSecondaryNode = this.previousSecondaryNode;
          this.previousSecondaryNode = null;
          this.nextSecondaryNode = null;
          return;
        }
    }

    protected DualLinkNode() {
    }

    static {
        field_g = new String[]{"lightning1_1", "lightning2_2", "thunder_short1"};
        field_m = new ia();
        field_k = new String[]{"speed_upgrade", "gun_upgrade", "turn_upgrade", "armour_upgrade1", "extralife_upgrade", "wingman_upgrade", "multiplier_upgrade"};
    }
}
