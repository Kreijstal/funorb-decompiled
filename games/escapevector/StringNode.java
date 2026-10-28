/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StringNode extends IntrusiveNode {
    static QuickChatDynamicCommand field_l;
    String text;
    static String field_j;
    static int field_h;
    static String field_k;
    static int field_i;

    final static void playFrameAppearSound(int pan, byte guard) {
        if (AchievementThresholdRule.field_a != null) {
          AchievementThresholdRule.field_a.fadeOut(2048);
        }
        AchievementThresholdRule.field_a = PcmSampleStream.createAtRatePercentQ6(UiTheme.field_g, 100, IterableNodeHashTable.field_c * 6144 / 64, pan);
        if (guard == 51) {
          ObjectSpriteSet.field_e.addSubstream(AchievementThresholdRule.field_a);
          return;
        }
        field_l = (QuickChatDynamicCommand) null;
        ObjectSpriteSet.field_e.addSubstream(AchievementThresholdRule.field_a);
    }

    public static void releaseStatics(byte guard) {
        field_j = null;
        field_k = null;
        field_l = null;
        if (guard != 123) {
          field_l = (QuickChatDynamicCommand) null;
        }
    }

    StringNode(String param0) {
        try {
          this.text = param0;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "sj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = new QuickChatDynamicCommand(8, 0, 4, 1);
        field_j = "Discard";
        field_k = "Target locations";
    }
}
