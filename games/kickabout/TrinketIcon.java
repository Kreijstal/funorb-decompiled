/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrinketIcon extends UiLayoutNode {
    static String field_Db;
    int field_Bb;
    static int field_yb;
    static UiLayoutNode field_zb;
    static UiLayoutNode field_Cb;
    static String field_Ab;
    static String[] field_Eb;

    final static void validateLoadingGuard(int param0) {
        int var1 = -1 / ((-68 - param0) / 53);
    }

    TrinketIcon(int param0) {
        this.field_Bb = param0;
        Sprite var3 = new Sprite(ArchivePreloader.field_i[PacketBuffer.field_e[this.field_Bb]].field_q >> 2, ArchivePreloader.field_i[PacketBuffer.field_e[this.field_Bb]].field_w >> 2);
        Sprite var2 = var3;
        PacketBuffer.pushSpriteRaster(-59, var3);
        ArchivePreloader.field_i[PacketBuffer.field_e[this.field_Bb]].drawQuarterSize(0, 0);
        TeamManagementScreen.popRasterState(121);
        this.field_N = var2;
        this.field_mb = 5 + var2.field_v + 5;
        this.field_B = 5;
        this.field_D = 5;
        this.field_q = 5 + (var2.field_o + 5);
    }

    final static String capitalizeFirstCharacter(String param0, boolean param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Kickabout.field_G;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            var5 = param0.charAt(var4);
            if (var4 == 0) {
              var5 = ValidationHelpWidget.titleCaseCharacter(19805, (char) var5);
            } else {
              var5 = Character.toLowerCase((char) var5);
            }
            var3[var4] = (char)var5;
          }
          if (param1) {
            field_Ab = (String) null;
          }
          stackIn_10_0 = new String(var3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("dn.E(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void setCameraVerticalOffset(int param0, int param1) {
        if (param0 != -5) {
          field_Ab = (String) null;
        }
        MyPitchScreen.field_G = (double)param1;
    }

    final static void updateTextPrompt(boolean param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        if (!param2) {
          TrinketIcon.releaseStatics(false);
        }
        if (TextPromptState.field_b != null) {
          var3 = TextPromptState.field_b.updateAndGetResult(param0, 0);
          if (var3 != -2) {
            if (-1 != var3) {
              var4 = TextPromptState.field_b.isMuteSelected(26) ? 1 : 0;
              CommonGame.sendTextPromptResponse(119, TextPromptState.field_b.field_Eb, var3, param1, var4 != 0, TextPromptState.field_b.getText(-15596));
            }
            TextPromptState.field_b = null;
            MusicPatchNode.closePlayerContextMenu(108);
          }
        }
    }

    public static void releaseStatics(boolean param0) {
        field_zb = null;
        field_Db = null;
        field_Ab = null;
        if (!param0) {
          return;
        }
        field_Eb = null;
        field_Cb = null;
    }

    static {
        field_Db = "Next";
        field_Ab = "slide";
    }
}
