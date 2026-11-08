/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DrawOfferMenuHelpers {
    static boolean field_e;
    static int field_a;
    static String[] field_c;
    static String field_b;
    static String[] field_d;

    public static void releaseStatics(int param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0 != 0) {
          field_a = -13;
        }
    }

    final static void updateDrawOfferMenuLabel(boolean param0) {
        int var2 = Virogrid.field_F ? 1 : 0;
        if ((DropTargetWidget.field_I.board.field_D & 1 << DropTargetWidget.field_I.localPlayer) != 0) {
          LoginDialog.field_pb[10] = WidgetLayerStack.field_E;
          if (param0) {
            field_c = (String[]) null;
            return;
          }
          return;
        }
        if (DropTargetWidget.field_I.board.field_D != 0) {
          LoginDialog.field_pb[10] = LobbyControlHelpers.field_c;
          if (param0) {
            field_c = (String[]) null;
            return;
          }
          return;
        }
        LoginDialog.field_pb[10] = CommonUiHelpers.field_a;
        if (!param0) {
          return;
        }
        field_c = (String[]) null;
    }

    static {
        field_b = "Play free version";
        field_a = 480;
        field_d = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
