/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SocialListResponseHelpers {
    static int field_b;
    static RgbSprite field_m;
    static RgbSprite[] halfPowerUpSprites;
    static RgbSprite field_l;
    static FullscreenFailureKind fullscreenFocusProblem;
    static RgbSprite jungleNearSprite;
    static BinaryMaskFont field_c;
    static int[] incomingPacketLengths;
    static String geniusText;
    static String createAccountConsentText;
    static RankingsRequest screenRankingsRequest;
    static String playersLabel;
    static String blindPowerUpDescription;

    final static void handleSocialListResponse(byte obfuscationGuard) {
        int ignoreInsertionIndex = 0;
        int friendInsertionIndex = 0;
        int alternateNameFlag = 0;
        RuntimeException decompiledCaughtException = null;
        BitPacketBuffer packet = null;
        RuntimeException var1_ref = null;
        int responseKind = 0;
        Object serverStateResult = null;
        int hasAlternateName = 0;
        int serverStateWord = 0;
        String ignoreName = null;
        String ignoreActionName = null;
        SocialListEntry ignoredEntry = null;
        SocialListEntry existingFriend = null;
        String previousIgnoreName = null;
        String ignoreNameKey = null;
        int unusedGameFlag = 0;
        Object friendServer;
        String friendName;
        String previousFriendName;
        SocialListEntry friendEntry;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          packet = LogoRenderHelpers.incomingPackets;
          responseKind = packet.readUnsignedByte(255);
          if (0 == responseKind) {
            if (null == FullscreenFailureKind.ignoreIndex) {
              FullscreenFailureKind.ignoreIndex = new SecondaryHashTable(128);
              IsaacGenerator.ignoreCount = 0;
            }
            alternateNameFlag = (1 != packet.readUnsignedByte(255)) ? 0 : 1;
            hasAlternateName = alternateNameFlag;
            ignoreName = packet.readCp1252String(-1);
            if (hasAlternateName != 0) {
              ignoreActionName = packet.readCp1252String(-1);
            }
            if (hasAlternateName == 0 ||
              unusedGameFlag != 0) {
              ignoreActionName = ignoreName;
            }
            ignoredEntry = HighscorePackSelector.findIgnoredPlayer(0, ignoreName);
            previousIgnoreName = packet.readCp1252String(-1);
            ignoreNameKey = ChatMessage.normalizePlayerName((CharSequence) ((Object) ignoreName), 69);
            if (null == ignoreNameKey) {
              ignoreNameKey = ignoreName;
            }
            if (null == ignoredEntry) {
              ignoredEntry = HighscorePackSelector.findIgnoredPlayer(0, previousIgnoreName);
              if (null != ignoredEntry) {
                FullscreenFailureKind.ignoreIndex.put((long)ignoreNameKey.hashCode(), ignoredEntry, 110);
              }
            }
            if (ignoredEntry == null) {
              ignoredEntry = new SocialListEntry();
              FullscreenFailureKind.ignoreIndex.put((long)ignoreNameKey.hashCode(), ignoredEntry, 120);
              ignoreInsertionIndex = IsaacGenerator.ignoreCount;
              IsaacGenerator.ignoreCount = IsaacGenerator.ignoreCount + 1;
              ignoredEntry.insertionIndex = ignoreInsertionIndex;
              CachedArchiveSource.ignoreEntries.addLast(ignoredEntry, (byte) 3);
            }
            ignoredEntry.actionName = ignoreActionName;
            ignoredEntry.previousName = previousIgnoreName;
            ignoredEntry.name = ignoreName;
            return;
          }
          if (responseKind != 1) {
            if (responseKind == 2) {
              if (LevelMetadata.field_m == 1) {
                LevelMetadata.field_m = 2;
              }
              return;
            }
            if (responseKind == 3) {
              if (LevelMetadata.field_m == 2) {
                LevelMetadata.field_m = 1;
              }
              return;
            }
            if (responseKind == 4) {
              LevelMetadata.field_m = 1;
              serverStateResult = packet.readCp1252String(-1);
              AlignedIconLabel.currentSocialServer = ((String) (serverStateResult)).intern();
              serverStateWord = packet.readUnsignedByte(255);
              FriendListUi.applyChatFilters(2, serverStateWord);
              return;
            }
            AlignedIconLabel.a("F1: " + WhirlpoolHasher.c((byte) -104), (Throwable) null, 58);
            GameTransportHelpers.closeGameTransport((byte) 98);
            if (obfuscationGuard < 52) {
              SocialListResponseHelpers.handleSocialListResponse((byte) -91);
            }
            return;
          }
          if (null == BlankScreen.friendIndex) {
            BlankScreen.friendIndex = new SecondaryHashTable(128);
            LevelPackSelectScreen.friendCount = 0;
          }
          friendServer = packet.readCp1252String(-1);
          if (((String) (friendServer)).equals("")) {
            friendServer = null;
          }
          friendName = packet.readCp1252String(-1);
          previousFriendName = packet.readCp1252String(-1);
          friendEntry = RadialSelectorRenderer.findFriend(false, friendName);
          if (friendEntry == null) {
            friendEntry = RadialSelectorRenderer.findFriend(false, previousFriendName);
            if (friendEntry != null) {
              BlankScreen.friendIndex.put((long)ChatMessage.normalizePlayerName((CharSequence) ((Object) friendName), 87).hashCode(), friendEntry, 104);
            }
          }
          if (friendEntry == null) {
            friendEntry = new SocialListEntry();
            BlankScreen.friendIndex.put((long)ChatMessage.normalizePlayerName((CharSequence) ((Object) friendName), 116).hashCode(), friendEntry, 101);
            friendInsertionIndex = LevelPackSelectScreen.friendCount;
            LevelPackSelectScreen.friendCount = LevelPackSelectScreen.friendCount + 1;
            friendEntry.insertionIndex = friendInsertionIndex;
            ToggleButtonWidget.friendEntries.addLast(friendEntry, (byte) 3);
          }
          if (friendServer != null) {
            friendServer = ((String) (friendServer)).intern();
          }
          friendEntry.name = friendName;
          friendEntry.serverName = (String) (friendServer);
          friendEntry.previousName = previousFriendName;
          friendEntry.unlink((byte) 111);
          existingFriend = (SocialListEntry) (ToggleButtonWidget.friendEntries.first(-65));
          while (null != existingFriend) {
            if (ArchiveNetworkClient.comesBeforeFriend(200, existingFriend, friendEntry)) {
              existingFriend = (SocialListEntry) (ToggleButtonWidget.friendEntries.next((byte) 116));
              if (unusedGameFlag == 0) {
                continue;
              }
            }
            break;
          }
          if (existingFriend != null) {
            BubbleDistortion.insertNodeBefore(friendEntry, -103, existingFriend);
            if (unusedGameFlag == 0) {
              return;
            }
          }
          ToggleButtonWidget.friendEntries.addLast(friendEntry, (byte) 3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1_ref), "ch.C(" + obfuscationGuard + ')');
        }
    }

    public static void clearSharedReferences(int obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          geniusText = null;
          blindPowerUpDescription = null;
          field_c = null;
          playersLabel = null;
          createAccountConsentText = null;
          fullscreenFocusProblem = null;
          halfPowerUpSprites = null;
          incomingPacketLengths = null;
          if (obfuscationGuard != 20623) {
            field_b = -11;
          }
          field_l = null;
          field_m = null;
          screenRankingsRequest = null;
          jungleNearSprite = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "ch.B(" + obfuscationGuard + ')');
        }
    }

    static long bitwiseAnd(long left, long right) {
        long result = 0L;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        try {
          result = left & right;
          return result;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "ch.A(" + left + ',' + right + ')');
        }
    }

    static {
        field_b = -1;
        fullscreenFocusProblem = new FullscreenFailureKind();
        incomingPacketLengths = new int[256];
        geniusText = "Genius!";
        createAccountConsentText = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        playersLabel = "Players";
        screenRankingsRequest = null;
        blindPowerUpDescription = "Blind: distorts your screen";
    }
}
