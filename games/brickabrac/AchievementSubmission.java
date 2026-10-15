/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementSubmission extends IntrusiveNode {
    int resultWordOne;
    static RgbSprite[] field_l;
    static String friendsTabLabel;
    int achievementId;
    int resultWordFour;
    int resultWordTwo;
    int resultWordThree;
    int submissionByte;
    static RgbSprite[] field_q;

    final static QuickChatMenu buildQuickChatCategoryMenu(UiComponent labelStyle, UiComponent itemStyle, QuickChatCategoryDefinition category, int obfuscationGuard, UiComponent styleTemplate) {
        int phraseIndex = 0;
        Object missingMenu = null;
        int childCountValue = 0;
        int phraseCountValue = 0;
        QuickChatMenu menu = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String labelStyleSummary = null;
        StringBuilder itemContextBuilder = null;
        String itemStyleSummary = null;
        StringBuilder categoryContextBuilder = null;
        String categorySummary = null;
        StringBuilder styleContextBuilder = null;
        String styleTemplateSummary = null;
        RuntimeException caughtFailure = null;
        int childCount = 0;
        RuntimeException failure = null;
        int phraseCount = 0;
        int itemCount = 0;
        String[] labels = null;
        char[] shortcuts = null;
        int[] messageIds = null;
        QuickChatMenu[] submenus = null;
        int childIndex = 0;
        QuickChatCategoryDefinition childCategory = null;
        int defaultShortcut = 0;
        int phraseId = 0;
        QuickChatPhraseDefinition phrase = null;
        int unusedGameFlag = 0;
        ResourceArchive unusedArchive = null;
        int[] messageIdsAlias = null;
        char[] shortcutsAlias = null;
        int[] newMessageIds = null;
        char[] newShortcuts = null;
        int phraseOffset;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (category == null) {
            missingMenu = null;
            return (QuickChatMenu) (missingMenu);
          }
          if (category.subcategoryIds != null) {
            childCountValue = category.subcategoryIds.length;
          } else {
            childCountValue = 0;
          }
          childCount = childCountValue;
          if (category.phraseIds != null) {
            phraseCountValue = category.phraseIds.length;
          } else {
            phraseCountValue = 0;
          }
          phraseCount = phraseCountValue;
          itemCount = childCount + phraseCount;
          labels = new String[itemCount];
          if (obfuscationGuard != 4) {
            unusedArchive = (ResourceArchive) null;
            AchievementSubmission.a((ResourceArchive) null, 30);
          }
          newShortcuts = new char[itemCount];
          shortcutsAlias = newShortcuts;
          shortcuts = shortcutsAlias;
          newMessageIds = new int[itemCount];
          messageIdsAlias = newMessageIds;
          messageIds = messageIdsAlias;
          submenus = new QuickChatMenu[itemCount];
          if (category.subcategoryIds != null) {
            for (childIndex = 0; category.subcategoryIds.length > childIndex; childIndex++) {
              childCategory = DebouncedValidationSource.quickChatCategories.getDefinition(category.subcategoryIds[childIndex], (byte) 124);
              labels[childIndex] = childCategory.title;
              shortcuts[childIndex] = category.subcategoryShortcuts[childIndex];
              submenus[childIndex] = AchievementSubmission.buildQuickChatCategoryMenu(labelStyle, itemStyle, childCategory, 4, styleTemplate);
            }
          }
          if (category.phraseIds != null) {
            phraseOffset = childCount;
            defaultShortcut = 49;
            for (phraseIndex = 0; category.phraseIds.length > phraseIndex; phraseIndex++) {
              phraseId = category.phraseIds[phraseIndex];
              if (phraseId == -1) {
                labels[phraseIndex + phraseOffset] = ScreenNavigationHelpers.quickChatHelpTitle;
                shortcuts[phraseIndex + phraseOffset] = category.phraseShortcuts[phraseIndex];
                messageIds[phraseOffset + phraseIndex] = category.phraseIds[phraseIndex];
              } else {
                phrase = LobbyUiHelpers.quickChatPhrases.getDefinition(phraseId, true);
                labels[phraseIndex + phraseOffset] = phrase.getPreview(-3);
                shortcuts[phraseIndex + phraseOffset] = category.phraseShortcuts[phraseIndex];
                if (shortcuts[phraseOffset + phraseIndex] <= 0) {
                  defaultShortcut = (char)(defaultShortcut + 1);
                  shortcuts[phraseIndex + phraseOffset] = (char)defaultShortcut;
                }
                messageIds[phraseOffset + phraseIndex] = category.phraseIds[phraseIndex];
              }
            }
          }
          menu = new QuickChatMenu(0L, styleTemplate, itemStyle, labelStyle, submenus, newMessageIds, labels, newShortcuts);
          return menu;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("e.A(");
          if (labelStyle == null) {
            labelStyleSummary = "null";
          } else {
            labelStyleSummary = "{...}";
          }
          itemContextBuilder = ((StringBuilder) (Object) contextBuilder).append(labelStyleSummary).append(',');
          if (itemStyle == null) {
            itemStyleSummary = "null";
          } else {
            itemStyleSummary = "{...}";
          }
          categoryContextBuilder = ((StringBuilder) (Object) itemContextBuilder).append(itemStyleSummary).append(',');
          if (category == null) {
            categorySummary = "null";
          } else {
            categorySummary = "{...}";
          }
          styleContextBuilder = ((StringBuilder) (Object) categoryContextBuilder).append(categorySummary).append(',').append(obfuscationGuard).append(',');
          if (styleTemplate == null) {
            styleTemplateSummary = "null";
          } else {
            styleTemplateSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) styleContextBuilder).append(styleTemplateSummary).append(')').toString());
        }
    }

    final static int[] createPitchYawPose(int pitch, int obfuscationGuard, int yaw) {
        int cosPitchSinYaw = 0;
        int cosPitchCosYaw = 0;
        int sinPitch = InteractiveGameClient.sine8192(pitch, -4097);
        int cosPitch = BrickABrac.cosine8192(2048, pitch);
        int sinYaw = InteractiveGameClient.sine8192(yaw, obfuscationGuard - 4097);
        int cosYaw = BrickABrac.cosine8192(2048, yaw);
        int sinPitchSinYaw = (int)((long)sinPitch * (long)sinYaw >> 16);
        int sinPitchCosYaw = (int)((long)cosYaw * (long)sinPitch >> 16);
        if (obfuscationGuard == 0) {
          cosPitchSinYaw = (int)((long)sinYaw * (long)cosPitch >> 16);
          cosPitchCosYaw = (int)((long)cosPitch * (long)cosYaw >> 16);
          return new int[]{0, 0, 0, cosYaw, 0, sinYaw, sinPitchSinYaw, cosPitch, -sinPitchCosYaw, -cosPitchSinYaw, sinPitch, cosPitchCosYaw};
        }
        AchievementSubmission.createPitchYawPose(118, 72, 44);
        cosPitchSinYaw = (int)((long)sinYaw * (long)cosPitch >> 16);
        cosPitchCosYaw = (int)((long)cosPitch * (long)cosYaw >> 16);
        return new int[]{0, 0, 0, cosYaw, 0, sinYaw, sinPitchSinYaw, cosPitch, -sinPitchCosYaw, -cosPitchSinYaw, sinPitch, cosPitchCosYaw};
    }

    public static void a(int param0) {
        field_l = null;
        friendsTabLabel = null;
        int var1 = -115 % ((5 - param0) / 58);
        field_q = null;
    }

    final static void a(ResourceArchive param0, int param1) {
        RgbSprite var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var2 = new RgbSprite(param0.takeFileByName(104, "final_frame.jpg", ""), (java.awt.Component) ((Object) CacheIoRequest.field_D));
          var3 = var2.width;
          int var5 = -121 % ((-17 - param1) / 52);
          var4 = var2.height;
          HighscorePackSelector.pushRaster(-99);
          LevelCompleteScreen.field_I = new RgbSprite(var3, var4 * 3 / 4);
          LevelCompleteScreen.field_I.bindRasterTarget();
          var2.drawAt(0, 0);
          BitPacketBuffer.field_t = new RgbSprite(var3, -LevelCompleteScreen.field_I.height + var4);
          BitPacketBuffer.field_t.bindRasterTarget();
          var2.drawAt(0, -LevelCompleteScreen.field_I.height);
          BitPacketBuffer.field_t.offsetY = LevelCompleteScreen.field_I.height;
          sc.popRaster(-104);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "e.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    AchievementSubmission(int achievementId, int submissionByte, int resultWordOne, int resultWordTwo, int resultWordThree, int resultWordFour) {
        this.resultWordThree = resultWordThree;
        this.achievementId = achievementId;
        this.resultWordOne = resultWordOne;
        this.resultWordFour = resultWordFour;
        this.submissionByte = submissionByte;
        this.resultWordTwo = resultWordTwo;
    }

    static {
        friendsTabLabel = "Friends";
    }
}
