/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AudioOutputSupport {
    static Sprite field_b;
    static UiLayoutNode field_f;
    static String field_c;
    static String field_d;
    static int field_a;
    static IndexedSprite[][] field_e;

    final static boolean isFreeChatAllowed(boolean param0) {
        if (!param0) {
          field_c = (String) null;
          return !WriteIntegersCommand.field_C ? true : false;
        }
        return !WriteIntegersCommand.field_C ? true : false;
    }

    final static void drawFullscreenPrompt(boolean param0) {
        int var1 = IntTripleCommand.getFullscreenPromptWidth((byte) -118);
        int var2 = EmailSyntaxValidator.getFullscreenPromptHeight((byte) 18);
        if (param0) {
          IntValueNode.field_g.drawPanel(GameSoundEffect.field_k - TextLineLayoutSupport.field_d, var2 + (DelayedServerPacket.field_e << 1), SumIntegersCommand.field_I - DelayedServerPacket.field_e, var1 + (TextLineLayoutSupport.field_d << 1), 3);
          VerticalScrollbar.drawFullscreenPromptRows(0);
          return;
        }
        field_c = (String) null;
        IntValueNode.field_g.drawPanel(GameSoundEffect.field_k - TextLineLayoutSupport.field_d, var2 + (DelayedServerPacket.field_e << 1), SumIntegersCommand.field_I - DelayedServerPacket.field_e, var1 + (TextLineLayoutSupport.field_d << 1), 3);
        VerticalScrollbar.drawFullscreenPromptRows(0);
    }

    final static void shutdownAudioOutputs(int param0) {
        if (null != PitchPurchaseSupport.field_d) {
          PitchPurchaseSupport.field_d.shutdown();
          if (null == SharedPanelFactory.field_d) {
            if (param0 == 4) {
              return;
            }
            field_a = -35;
            return;
          }
          SharedPanelFactory.field_d.shutdown();
          if (param0 != 4) {
            field_a = -35;
            return;
          }
          return;
        }
        if (null != SharedPanelFactory.field_d) {
          SharedPanelFactory.field_d.shutdown();
          if (param0 == 4) {
            return;
          }
          field_a = -35;
          return;
        }
        if (param0 == 4) {
          return;
        }
        field_a = -35;
    }

    public static void releaseStatics(int param0) {
        field_e = (IndexedSprite[][]) null;
        field_f = null;
        field_b = null;
        field_c = null;
        if (param0 == 1114366657) {
          field_d = null;
          return;
        }
        AudioOutputSupport.releaseStatics(-52);
        field_d = null;
    }

    final static void refreshFullscreenPrompt(byte param0) {
        if (!ServerTextTemplate.isFullscreenPromptOpen(-4)) {
          return;
        }
        TrinketCountSortCriterion.buildFullscreenPromptMenu(false, 6, 4);
        int var1 = -31 / ((param0 - 88) / 33);
    }

    static {
        field_c = "Create";
        field_d = "Playing";
        field_a = 0;
        field_b = new Sprite(50, 20);
    }
}
