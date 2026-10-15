/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InvitationDialogHelpers {
    static GameScreen pendingScreen;
    static UiComponent field_c;
    static QuickChatMenu quickChatMenu;
    static String field_b;

    final static RgbSprite a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (param2 != -6) {
          InvitationDialogHelpers.a(121, -95, (byte) -105);
        }
        RgbSprite var6 = new RgbSprite(param1, param1);
        RgbSprite var3 = var6;
        for (var4 = 0; var4 < var3.pixels.length; var4++) {
          var6.pixels[var4] = param0;
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
          InvitationDialogHelpers.a(true);
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

    public static void a(int param0) {
        if (param0 != 12) {
          return;
        }
        quickChatMenu = null;
        field_c = null;
        field_b = null;
        pendingScreen = null;
    }

    final static void a(boolean param0) {
        ga.field_i = 12;
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
