/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuFrameHelpers {
    static int field_e;
    static int field_f;
    static String[] field_g;
    static long field_b;
    static Sprite field_h;
    static String[] field_d;
    static String field_a;
    static TriangleMesh[] field_c;

    public static void releaseStatics(int param0) {
        field_a = null;
        field_g = null;
        field_h = null;
        field_c = null;
        if (param0 < 60) {
          return;
        }
        field_d = null;
    }

    final static void refreshOpenMenu(int param0) {
        if (!PendingDataRequest.isMessageBoxOpen((byte) -74)) {
          return;
        }
        PopupMenuBuilder.buildPopupMenu(false, false, 4);
        if (param0 != -29507) {
          MenuFrameHelpers.releaseStatics(75);
        }
    }

    final static Sprite[] createBeveledFrameSprites(int param0, int param1, int param2, int param3) {
        if (param0 > 29) {
          return MatchingTextValidator.createSolidPanelSprites(param3, 1, -102, param2, param1);
        }
        field_f = -44;
        return MatchingTextValidator.createSolidPanelSprites(param3, 1, -102, param2, param1);
    }

    static {
        field_g = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_h = new Sprite(80, 80);
        field_a = "Asking for or providing contact information";
        field_d = new String[]{"Control scheme: Classic", "Control scheme: Modern"};
    }
}
