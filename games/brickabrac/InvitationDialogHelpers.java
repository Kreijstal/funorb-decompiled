/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InvitationDialogHelpers {
    static GameScreen pendingScreen;
    static UiComponent field_c;
    static QuickChatMenu quickChatMenu;
    static String field_b;

    final static RgbSprite createSolidSprite(int color, int size, byte obfuscationGuard) {
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard != -6) {
          InvitationDialogHelpers.createSolidSprite(121, -95, (byte) -105);
        }
        RgbSprite var6 = new RgbSprite(size, size);
        RgbSprite var3 = var6;
        for (var4 = 0; var4 < var3.pixels.length; var4++) {
          var6.pixels[var4] = color;
        }
        return var3;
    }

    final static void requestInviteOrAcceptPlayer(long playerId, int obfuscationGuard, int opcode) {
        BitPacketBuffer packet = TextFieldValidator.outgoingPackets;
        packet.writeCipheredOpcode(-13413, opcode);
        packet.position = packet.position + 1;
        int payloadStart = packet.position;
        packet.writeByte(-115, 6);
        if (obfuscationGuard <= 35) {
          InvitationDialogHelpers.resetTutorialState(true);
        }
        packet.writeLong(-23054, playerId);
        packet.backfillByteLength((byte) 121, -payloadStart + packet.position);
    }

    final static void configureFullscreenDialogFrame(int obfuscationGuard, NineSliceFrame frame, int paddingX, int paddingY) {
        try {
          IntKeyIndex.fullscreenDialogFrame = frame;
          int guardCalculation = -108 % ((46 - obfuscationGuard) / 37);
          GameTransportHelpers.fullscreenDialogPaddingX = paddingX;
          AccountContentTransitionLayer.fullscreenDialogPaddingY = paddingY;
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "hd.C(" + obfuscationGuard + ',' + (frame != null ? "{...}" : "null") + ',' + paddingX + ',' + paddingY + ')');
        }
    }

    public static void clearSharedReferences(int obfuscationGuard) {
        if (obfuscationGuard != 12) {
          return;
        }
        quickChatMenu = null;
        field_c = null;
        field_b = null;
        pendingScreen = null;
    }

    final static void resetTutorialState(boolean param0) {
        LobbyOverlayHelpers.field_i = 12;
        AlternateNumericLoginCredentials.field_s = param0 ? true : false;
        LoadingProgressDialog.field_eb = null;
        GameConnectionHelpers.field_f = true;
        TextValidationHelpers.field_a = 12;
        QuickChatHelpDialog.field_Sb = true;
        ValidationIconWidget.field_N = true;
        HalfRgbBlendHelpers.field_b = true;
        GrowableIntList.field_i = CalendarRankingHelpers.field_e;
    }

    static {
        field_b = "Unable to delete name - system busy";
    }
}
