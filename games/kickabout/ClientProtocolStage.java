/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientProtocolStage {
    static String field_e;
    static String[] field_a;
    static DebugConsole field_d;
    static String[] field_b;
    static UiLayoutNode field_c;

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param1 == param0) {
          var2 = ServerTextTemplate.field_a;
        }
        if (param1 == 1) {
          var2 = ConsoleTokenCursor.field_b;
        }
        if (2 == param1) {
          var2 = LoginResponseUiSupport.field_a;
        }
        return var2;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void disconnectAndLeaveFullscreen(boolean param0) {
        UiWidget.h(0);
        if (null != RegistrationRequestState.field_d) {
          SumIntegersCommand.a(-120, RegistrationRequestState.field_d);
        }
        SelectionMarkerSupport.clearPlayerPreviewResource(98);
        MatchTextInputOverlay.clearSharedMouseHandler(-107);
        if (!param0) {
          field_b = (String[]) null;
        }
        TrinketCountSortCriterion.b((byte) 44);
        if (LinkTextPainter.b(0)) {
          FootballerAiOverlaySupport.field_d.b(1, (byte) -106);
          ClientPacketFlushSupport.flushPackets(0, false);
        }
        FormationView.b((byte) -116);
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_d = null;
        field_a = null;
        field_c = null;
        if (param0 < -17) {
          field_e = null;
          return;
        }
        ClientProtocolStage.a(-21, -111);
        field_e = null;
    }

    final boolean a(byte param0) {
        if (param0 >= -26) {
          this.a((byte) -81);
          if (this == ClubState.field_c) {
            return true;
          }
          if (this != AuctionListingDialog.field_H) {
            return RegistrationRequestDialog.field_rb == this ? true : false;
          }
          return true;
        }
        if (this == ClubState.field_c) {
          return true;
        }
        if (this == AuctionListingDialog.field_H) {
          return true;
        }
        if (RegistrationRequestDialog.field_rb != this) {
          return false;
        }
        return true;
    }

    static {
        field_a = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_e = "<%0> has resigned and left the game.";
        field_b = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
