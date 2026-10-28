/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MeshMaterial {
    static LoginCredentialType field_a;
    static String field_d;
    int colorRgb;
    static AccountFormStage field_b;
    static volatile int keyboardIdleTicks;

    public static void releaseStatics(boolean guard) {
        field_a = null;
        if (!guard) {
          return;
        }
        field_d = null;
        field_b = null;
    }

    final static int pollAccountFormRequest(LoginText firstText, LoginText secondText, int guard) {
        String stackIn_5_2 = null;
        String stackIn_8_2 = null;
        try {
          int var3_int = -113 % ((guard + 13) / 50);
          String var4 = (String) null;
          int stackIn_1_0 = SelfDestructEffects.pollAccountFormExchange((byte) -32, false, (String) null, firstText, secondText, 0, 0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var3;
          StringBuilder stackIn_4_1 = new StringBuilder().append("ui.D(");
          if (firstText == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          StringBuilder stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (secondText == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(guard).append(')').toString());
        }
    }

    final static Sprite[] loadSpritesByName(String fileName, ResourceArchive archive, String groupName, byte guard) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (guard < 67) {
            field_b = (AccountFormStage) null;
          }
          int var4_int = archive.findGroupId(-1, groupName);
          int var5 = archive.findFileId(var4_int, fileName, true);
          Sprite[] stackIn_3_0 = ArchiveSpriteLoader.loadSprites(var4_int, var5, archive, 8192);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4;
          StringBuilder stackIn_6_1 = new StringBuilder().append("ui.B(");
          if (fileName == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (archive == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (groupName == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(')').toString());
        }
    }

    final static void showDisplayNameForm(int guard) {
        if (SavedDataRequestSupport.requestDialog == null) {
          int var1 = -22 / ((guard - 26) / 51);
          CanvasRenderSupport.field_b = new DisplayNameForm();
          SpaceCompactionSupport.loginDialog.transitionToContent(CanvasRenderSupport.field_b, 30);
          return;
        }
        SavedDataRequestSupport.requestDialog.closeDialog(-18861);
        int var1Lifetime1 = -22 / ((guard - 26) / 51);
        CanvasRenderSupport.field_b = new DisplayNameForm();
        SpaceCompactionSupport.loginDialog.transitionToContent(CanvasRenderSupport.field_b, 30);
    }

    final static void setLegacyMenuColors(int normal, int selected, int disabled, int guard) {
        ValidatedTextWidget.field_X = normal;
        ModeProgressSupport.field_d = selected;
        MenuTitleSupport.field_e = disabled;
        if (guard != -11997) {
          keyboardIdleTicks = 84;
        }
    }

    static {
        field_a = new LoginCredentialType(0);
        field_d = "Explosive is on hill - please land closer";
        keyboardIdleTicks = 0;
    }
}
