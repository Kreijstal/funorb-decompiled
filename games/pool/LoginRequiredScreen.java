/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginRequiredScreen extends MenuScreen {
    static String errorJs5crc;
    static boolean field_H;
    static String quickchatGame;
    static UiComponent field_M;
    static UiComponent field_J;
    static int field_I;

    LoginRequiredScreen(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super((Sprite) null, param0, param1, param2, param3, param4, param5);
    }

    final void handleMenuAction(int param0, boolean param1, int param2) {
        int var4 = this.itemIds[param2];
        if (23 != var4) {
          super.handleMenuAction(param0, param1, param2);
          return;
        }
        if (!this.selection.isPressActivated((byte) 61)) {
          super.handleMenuAction(param0, param1, param2);
          return;
        }
        TranslatedUiText.a((String) null, FadingDialog.a(false, SupportPageLauncher.field_c) ? 18 : 16, (byte) 121);
    }

    final static void showAccountCreationForm(int obfuscationGuard) {
        ArchiveProvider.field_c = new AccountCreationForm();
        RasterSnapshot.field_n.replaceContent(ArchiveProvider.field_c, 30);
        if (obfuscationGuard != 35) {
          field_J = (UiComponent) null;
        }
    }

    final void navigateBack(byte param0) {
        if (param0 >= -11) {
          field_J = (UiComponent) null;
        }
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          quickchatGame = null;
          field_J = null;
          field_M = null;
          errorJs5crc = null;
          return;
        }
        field_J = (UiComponent) null;
        quickchatGame = null;
        field_J = null;
        field_M = null;
        errorJs5crc = null;
    }

    final void drawScreen(int param0) {
        String var4 = null;
        super.drawScreen(91);
        int var2 = FadingDialog.a(false, SupportPageLauncher.field_c) ? 1 : 0;
        int var3 = DebugSliderInputSupport.field_d != null ? 1 : 0;
        if (param0 > 36) {
          var4 = FadingDialog.mustloginNotloggedin;
          var4 = var4 + " " + UiComponentNode.replaceChar('#', "<br><br>", AccountWelcomePanel.substituteTemplateArguments(new String[]{DebugTuningSupport.discard}, -1, LabeledChildWidget.a(var2 != 0, var3 != 0, false, (byte) 39)), 1);
          this.renderParagraphSprite(CollisionContact.field_h, new int[]{CollisionContact.field_h.baselineHeight}, 140, -16097, var4, 280, 15658734);
          this.drawParagraphSprite(140, false);
          return;
        }
    }

    static {
        errorJs5crc = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        quickchatGame = "Quick Chat game";
    }
}
