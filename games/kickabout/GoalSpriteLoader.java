/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GoalSpriteLoader {
    static int field_a;
    static String field_c;
    static String field_e;
    static Sprite field_d;
    static int[] field_f;
    static String field_b;

    final static boolean ensureGoalSprites(byte param0) {
        if (null != IntrusiveNodeHashTable.field_g[1]) {
          return true;
        }
        if (param0 != -43) {
          GoalSpriteLoader.ensureGoalSprites((byte) 61);
          if (!QuickChatKeysHelpPanel.field_Cb.ensureFileAvailableByName("scenery", "goal_top", (byte) -10)) {
            return false;
          }
          if (QuickChatKeysHelpPanel.field_Cb.ensureFileAvailableByName("scenery", "goal_bottom", (byte) -10)) {
            IntrusiveNodeHashTable.field_g[1] = QuickChatPhraseDefinition.loadSpriteByName("scenery", QuickChatKeysHelpPanel.field_Cb, (byte) 93, "goal_top");
            IntrusiveNodeHashTable.field_g[0] = QuickChatPhraseDefinition.loadSpriteByName("scenery", QuickChatKeysHelpPanel.field_Cb, (byte) 127, "goal_bottom");
            return true;
          }
          return false;
        }
        if (!QuickChatKeysHelpPanel.field_Cb.ensureFileAvailableByName("scenery", "goal_top", (byte) -10)) {
          return false;
        }
        if (QuickChatKeysHelpPanel.field_Cb.ensureFileAvailableByName("scenery", "goal_bottom", (byte) -10)) {
          IntrusiveNodeHashTable.field_g[1] = QuickChatPhraseDefinition.loadSpriteByName("scenery", QuickChatKeysHelpPanel.field_Cb, (byte) 93, "goal_top");
          IntrusiveNodeHashTable.field_g[0] = QuickChatPhraseDefinition.loadSpriteByName("scenery", QuickChatKeysHelpPanel.field_Cb, (byte) 127, "goal_bottom");
          return true;
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        field_c = null;
        if (param0 == 1) {
          field_f = null;
          field_e = null;
          field_b = null;
          return;
        }
        GoalSpriteLoader.ensureGoalSprites((byte) -66);
        field_f = null;
        field_e = null;
        field_b = null;
    }

    static {
        field_c = "The Semi Finals start in <%0> seconds...";
        field_e = "Won";
        field_b = "Rating";
        field_f = new int[7];
    }
}
