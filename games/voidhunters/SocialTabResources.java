/*
 * Decompiled by CFR-JS 0.4.0.
 */
class SocialTabResources extends SocialPanelState {
    static Widget tabTemplate;
    static NineSliceSprite field_d;
    private static String field_z;

    SocialTabResources() {
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 21053) {
          SocialTabResources.clearSharedReferences(-96);
          field_d = null;
          tabTemplate = null;
          return;
        }
        field_d = null;
        tabTemplate = null;
    }

    static {
        field_z = "vhb.A(";
    }
}
