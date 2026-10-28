/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementDefinition {
    boolean membersOnly;
    Sprite icon;
    static int field_g;
    boolean hidden;
    int achievementId;
    private int allowedGameModes;
    static QuickChatDynamicCommand field_d;
    static PcmSample field_a;

    public static void releaseStatics(int guard) {
        field_d = null;
        field_a = null;
        if (guard != 4) {
          AchievementDefinition.requestArchiveKey(-111, 38, 24, -46);
        }
    }

    final static PointCloudEffect createSpriteDebris(byte guard, PcmSample sound, int y, Sprite sprite, boolean indexedRendering, int x) {
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          PointCloudEffect var6 = new PointCloudEffect(sprite, x, y, sound);
          if (guard != -43) {
            AchievementDefinition.releaseStatics(68);
          }
          PointCloudEffect stackIn_4_0 = var6;
          boolean stackIn_5_1 = (indexedRendering);
          stackIn_4_0.indexedRendering = stackIn_5_1;
          PointCloudEffect stackIn_6_0 = var6;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6_ref = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var6_ref;
          StringBuilder stackIn_9_1 = new StringBuilder().append("ci.B(").append(guard).append(',');
          if (sound == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(y).append(',');
          if (sprite == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(indexedRendering).append(',').append(x).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (!TrackerMusicDefinition.field_f.hasSessionAchievements(param0 + 117)) {
          if (null == IntValueNode.field_i) {
            if (param0 != 0) {
              field_d = (QuickChatDynamicCommand) null;
              return;
            }
            return;
          }
          SpriteArchiveSupport.showHighscoresScreen(MenuTitleSupport.isPointerDriven((byte) 116), param0 - 1230, true);
          if (param0 != 0) {
            field_d = (QuickChatDynamicCommand) null;
            return;
          }
          return;
        }
        SpriteState.a(-106, true);
        if (param0 == 0) {
          return;
        }
        field_d = (QuickChatDynamicCommand) null;
    }

    final static ArchiveKeyRequest requestArchiveKey(int archiveId, int groupId, int guard, int opcode) {
        ArchiveKeyRequest var4 = new ArchiveKeyRequest();
        var4.groupId = groupId;
        var4.archiveId = archiveId;
        LegacyTextBlock.field_n.addLast(-12328, var4);
        if (guard == -1) {
          BoundedRandomAccessFile.writeArchiveKeyRequest(-100, opcode, var4);
          return var4;
        }
        field_g = 109;
        BoundedRandomAccessFile.writeArchiveKeyRequest(-100, opcode, var4);
        return var4;
    }

    final boolean isAllowedInMode(int mode, byte guard) {
        if (guard > -56) {
          return false;
        }
        if (UiContainer.hasMembership((byte) -52)) {
          int var3 = 1 << mode;
          boolean var4 = (0 != (this.allowedGameModes & var3));
          return (var4);
        }
        if (this.membersOnly) {
          return false;
        }
        int var3Lifetime1 = 1 << mode;
        boolean var4Lifetime1 = (0 != (this.allowedGameModes & var3Lifetime1));
        return (var4Lifetime1);
    }

    AchievementDefinition(int achievementId, boolean membersOnly, boolean hidden, int allowedGameModes, int orbCoins, int orbPoints) {
        this.icon = ProxySocketConnector.field_w;
        this.membersOnly = membersOnly ? true : false;
        this.achievementId = achievementId;
        this.hidden = hidden ? true : false;
        this.allowedGameModes = allowedGameModes;
    }

    static {
        field_g = -1;
        field_d = new QuickChatDynamicCommand(6, 0, 4, 2);
    }
}
