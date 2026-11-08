/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatFilterHelpers {
    static String field_c;
    static String field_g;
    static String field_d;
    static int field_e;
    static ContextMenu field_f;
    static SpriteWidget field_a;
    static String text2d;

    public static void releaseStatics(byte param0) {
        text2d = null;
        field_f = null;
        if (param0 != 113) {
          return;
        }
        field_d = null;
        field_a = null;
        field_g = null;
        field_c = null;
    }

    final static void sendGameOptions(int param0, int param1) {
        CipherPacketBuffer var2 = IterableNodeHashTable.field_g;
        var2.writeCipheredOpcode(param1, 8);
        var2.position = var2.position + 1;
        int var3 = var2.position;
        var2.writeByte(5, 122);
        var2.writeByte(AudioSetupHelpers.field_d.field_vc, 101);
        int var4 = (AudioSetupHelpers.field_d.field_lc << 6) + AudioSetupHelpers.field_d.field_fc;
        var2.writeByte(var4, param0 ^ -74);
        var2.writeBytes(AudioSetupHelpers.field_d.field_Pb, AudioSetupHelpers.field_d.field_Pb.length, param0, (byte) -126);
        var2.backpatchByteLength(-var3 + var2.position, -1);
    }

    final static boolean isReconnectLogin(int param0) {
        if (param0 != -11532) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          ChatFilterHelpers.logoutAndReload(119, (java.applet.Applet) null);
          return ChatPanelSetupHelpers.field_c;
        }
        return ChatPanelSetupHelpers.field_c;
    }

    final static void updateChatFilter(int param0, int param1, int param2, byte param3) {
        int var4;
        var4 = -72 / ((param3 + 13) / 32);
        if (0 == param2 &&
          param0 != LoginPanel.field_D) {
          QuickChatPhraseRegistry.field_l = true;
          LoginPanel.field_D = param0;
          ProgressMessageDialog.sendChatFilterSettings((byte) -112, param1);
        }
        if (param2 == 1 &&
          TextFieldValidator.field_m != param0) {
          TextFieldValidator.field_m = param0;
          QuickChatPhraseRegistry.field_l = true;
          ProgressMessageDialog.sendChatFilterSettings((byte) -112, param1);
        }
        if (param2 != 2) {
          return;
        }
        if (param0 == BufferedSocket.field_t) {
          return;
        }
        BufferedSocket.field_t = param0;
        QuickChatPhraseRegistry.field_l = true;
        ProgressMessageDialog.sendChatFilterSettings((byte) -112, param1);
    }

    final static void logoutAndReload(int param0, java.applet.Applet param1) {
        try {
          DualLinkDeque.setSessionCookie("", param1, -1);
          if (param0 != 5) {
            java.applet.Applet var3 = (java.applet.Applet) null;
            ChatFilterHelpers.logoutAndReload(99, (java.applet.Applet) null);
          }
          ResizableDialog.reloadPage(-11670, param1);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "sd.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_e = 0;
        field_d = "Music: ";
        field_g = "Quick Chat game";
        text2d = "2D";
    }
}
