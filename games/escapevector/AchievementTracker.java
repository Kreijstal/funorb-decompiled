/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementTracker {
    private int[] sessionAchievementWords;
    static String field_a;
    static String field_g;
    boolean queryFailed;
    private AchievementQuery pendingQuery;
    private IntrusiveDeque pendingAwardRecords;
    private int[] achievementWords;
    boolean accountAchievementsLoaded;
    static int field_k;
    static IntrusiveDeque field_i;
    static long field_l;
    static PcmSample field_d;
    static String field_e;

    final int[] earnedAchievementIds(int setKind, byte guard) {
        int var12 = EscapeVector.obfuscationControl;
        boolean stackIn_3_0 = !(AccountSessionSupport.isGuestSession(-101));
        boolean var3 = stackIn_3_0;
        if (var3 &&
          !this.accountAchievementsLoaded &&
          this.queryFailed) {
          this.requestAccountAchievements((byte) -128);
        }
        if (!this.isSupportedSet(127, setKind)) {
          return null;
        }
        int[] var16 = this.wordsForSet(setKind, (byte) -122);
        int[] var14 = var16;
        int[] var4 = var14;
        if (var4 == null) {
          return null;
        }
        int var5 = this.earnedCount(10999, setKind);
        int[] var15 = new int[var5];
        int[] var13 = var15;
        int[] var6 = var13;
        for (int var7 = 0; var15.length > var7; var7++) {
          var15[var7] = -1;
        }
        int var7Lifetime1 = 0;
        int var8 = 0;
        while (var16.length > var7Lifetime1) {
          for (int var9 = 0; var9 < 32; var9++) {
            boolean var10 = (this.testWordBits(1, var7Lifetime1, var16, var9));
            if (var10) {
              int var11 = 32 * var7Lifetime1 + var9;
              var15[var8] = var11;
              var8++;
              if (var8 == var5) {
                return var6;
              }
            }
          }
          var7Lifetime1++;
        }
        if (guard > -2) {
          field_e = (String) null;
        }
        return var6;
    }

    private final boolean isAllowedInMode(int mode, int achievementId, int guard) {
        AchievementDefinition var4 = this.definition(achievementId, false);
        if (var4 == null) {
          return false;
        }
        if (guard != 0) {
          field_d = (PcmSample) null;
        }
        return var4.isAllowedInMode(mode, (byte) -100);
    }

    public static void releaseStatics(int guard) {
        field_d = null;
        field_e = null;
        field_a = null;
        if (guard != 1) {
          return;
        }
        field_i = null;
        field_g = null;
    }

    final int visibleCount(int setKind, int guard) {
        int var3 = this.totalCount(setKind, true);
        if (setKind == 0) {
          return var3;
        }
        int var4 = this.unearnedHiddenCount(setKind, guard);
        var3 = var3 - var4;
        return var3;
    }

    private final int unionWordAt(boolean guard, int wordIndex, int[] left, int[] right) {
        String stackIn_17_2 = null;
        String stackIn_20_2 = null;
        try {
          if (wordIndex >= right.length &&
            wordIndex >= left.length) {
            int stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (guard) {
            this.achievementWords = (int[]) null;
          }
          if (wordIndex >= right.length) {
            int stackIn_8_0 = left[wordIndex];
            return stackIn_8_0;
          }
          if (wordIndex < left.length) {
            int stackIn_13_0 = this.bitwiseUnion((byte) -101, right[wordIndex], left[wordIndex]);
            return stackIn_13_0;
          }
          int stackIn_11_0 = right[wordIndex];
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var5;
          StringBuilder stackIn_16_1 = new StringBuilder().append("en.LA(").append(guard).append(',').append(wordIndex).append(',');
          if (left == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          StringBuilder stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (right == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    private final int differenceWordAt(int[] left, int guard, int wordIndex, int[] right) {
        String stackIn_16_2 = null;
        String stackIn_19_2 = null;
        try {
          if (wordIndex >= left.length &&
            wordIndex >= right.length) {
            int stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (left.length <= wordIndex) {
            int stackIn_7_0 = right[wordIndex];
            return stackIn_7_0;
          }
          int var5_int = 53 % ((70 - guard) / 39);
          if (right.length > wordIndex) {
            int stackIn_12_0 = this.bitwiseDifference((byte) -116, left[wordIndex], right[wordIndex]);
            return stackIn_12_0;
          }
          int stackIn_10_0 = left[wordIndex];
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var5;
          StringBuilder stackIn_15_1 = new StringBuilder().append("en.E(");
          if (left == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          StringBuilder stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(guard).append(',').append(wordIndex).append(',');
          if (right == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void requestAccountAchievements(byte guard) {
        if (AccountSessionSupport.isGuestSession(-97)) {
          return;
        }
        if (this.accountAchievementsLoaded) {
          return;
        }
        int var2 = 95 / ((-79 - guard) / 45);
        if (null == this.pendingQuery) {
          this.pendingQuery = ContactEntry.requestAchievements(4, 126);
          this.queryFailed = false;
          this.accountAchievementsLoaded = false;
        }
    }

    private final void mergeAccountAchievements(byte guard, int[] accountWords) {
        String stackIn_23_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (guard != -82) {
            return;
          }
          if (accountWords == null) {
            return;
          }
          if (this.achievementWords == null) {
            this.achievementWords = accountWords;
            return;
          }
          int[] var7 = this.achievementWords;
          int[] var3 = var7;
          int var4 = 0;
          if (var7 != null) {
            var4 = var7.length;
          }
          if (accountWords != null &&
            accountWords.length > var4) {
            var4 = accountWords.length;
          }
          this.achievementWords = new int[var4];
          for (int var5 = 0; var5 < var4; var5++) {
            this.achievementWords[var5] = this.unionWordAt(false, var5, accountWords, var7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var3_ref;
          StringBuilder stackIn_22_1 = new StringBuilder().append("en.NA(").append(guard).append(',');
          if (accountWords == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final int bitwiseDifference(byte guard, int left, int right) {
        int var4 = -35 / ((guard - 28) / 45);
        return ~right & left;
    }

    private final boolean isSupportedSet(int guard, int setKind) {
        if (guard <= 120) {
          return true;
        }
        if (setKind == 0) {
          return true;
        }
        if (1 != setKind) {
          return false;
        }
        return true;
    }

    final static Class classForReflectionType(String typeName, byte guard) throws ClassNotFoundException {
        String stackIn_34_2 = null;
        try {
          if (guard != 38) {
            field_a = (String) null;
          }
          if (typeName.equals("B")) {
            Class stackIn_5_0 = Byte.TYPE;
            return stackIn_5_0;
          }
          if (typeName.equals("I")) {
            Class stackIn_8_0 = Integer.TYPE;
            return stackIn_8_0;
          }
          if (typeName.equals("S")) {
            Class stackIn_12_0 = Short.TYPE;
            return stackIn_12_0;
          }
          if (typeName.equals("J")) {
            Class stackIn_15_0 = Long.TYPE;
            return stackIn_15_0;
          }
          if (typeName.equals("Z")) {
            Class stackIn_18_0 = Boolean.TYPE;
            return stackIn_18_0;
          }
          if (typeName.equals("F")) {
            Class stackIn_22_0 = Float.TYPE;
            return stackIn_22_0;
          }
          if (typeName.equals("D")) {
            Class stackIn_26_0 = Double.TYPE;
            return stackIn_26_0;
          }
          if (!typeName.equals("C")) {
            return Class.forName(typeName);
          }
          Class stackIn_30_0 = Character.TYPE;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_33_0 = var2;
          StringBuilder stackIn_33_1 = new StringBuilder().append("en.HA(");
          if (typeName == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(guard).append(')').toString());
        }
    }

    private final AchievementDefinition definition(int achievementId, boolean guard) {
        if (achievementId < 0) {
          return null;
        }
        if (ProxySocketConnector.achievementDefinitions.length <= achievementId) {
          return null;
        }
        if (guard) {
          field_k = -102;
        }
        return ProxySocketConnector.achievementDefinitions[achievementId];
    }

    final Sprite achievementIcon(int achievementId, int guard) {
        if (guard < 98) {
          field_a = (String) null;
        }
        AchievementDefinition var3 = this.definition(achievementId, false);
        if (var3 == null ||
          null == var3.icon) {
          return SpriteLoadTask.field_l;
        }
        return var3.icon;
    }

    private final void grantIfSourceEarned(byte guard, int mode, int sourceId, int targetId) {
        if (this.isEarned(targetId, (byte) -127, 1)) {
          return;
        }
        if (!this.isEarned(sourceId, (byte) -127, 1)) {
          return;
        }
        if (guard > -127) {
          return;
        }
        int var7 = targetId;
        int var8 = targetId ^ 255;
        GameplaySession var9 = BoundedRandomAccessFile.activeSession;
        if (var9 == null) {
          return;
        }
        var9.awardAchievement(mode, false, var7, var8);
    }

    private final void removeAccountAchievementsFromSession(int[] accountWords, int guard) {
        String stackIn_22_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (accountWords == null) {
            return;
          }
          if (this.sessionAchievementWords == null) {
            this.sessionAchievementWords = new int[accountWords.length];
            return;
          }
          if (guard != -20915) {
            this.achievementWords = (int[]) null;
          }
          int[] var7 = this.sessionAchievementWords;
          int[] var3 = var7;
          int var4 = 0;
          if (var7 != null) {
            var4 = var7.length;
          }
          if (accountWords != null &&
            accountWords.length > var4) {
            var4 = accountWords.length;
          }
          this.sessionAchievementWords = new int[var4];
          for (int var5 = 0; var4 > var5; var5++) {
            this.sessionAchievementWords[var5] = this.differenceWordAt(var7, 118, var5, accountWords);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_21_0 = var3_ref;
          StringBuilder stackIn_21_1 = new StringBuilder().append("en.H(");
          if (accountWords == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(guard).append(')').toString());
        }
    }

    final static int integerPower(int exponent, int base, int guard) {
        int var4 = EscapeVector.obfuscationControl;
        try {
          int var3_int = 1;
          while (exponent > 1) {
            if ((1 & exponent) != 0) {
              var3_int = var3_int * base;
            }
            base = base * base;
            exponent = exponent >> 1;
          }
          if (guard != -1) {
            int stackIn_10_0 = -53;
            return stackIn_10_0;
          }
          if (exponent != 1) {
            int stackIn_15_0 = var3_int;
            return stackIn_15_0;
          }
          int stackIn_13_0 = base * var3_int;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var3), "en.Q(" + exponent + ',' + base + ',' + guard + ')');
        }
    }

    final boolean awardAchievement(byte guard, int checksum, int achievementId, int gameMode) {
        boolean stackIn_3_0 = !(AccountSessionSupport.isGuestSession(-116));
        boolean var5 = stackIn_3_0;
        if (var5 &&
          !this.accountAchievementsLoaded &&
          this.queryFailed) {
          this.requestAccountAchievements((byte) 118);
        }
        if (this.isEarned(achievementId, (byte) -128, 1)) {
          return false;
        }
        if (!this.isAllowedInMode(gameMode, achievementId, guard - 54)) {
          return false;
        }
        this.markAchievement((byte) -47, 1, achievementId);
        this.markAchievement((byte) -47, 0, achievementId);
        PasswordValidator.setSessionAchievementBit(achievementId, -128);
        if (guard != 54) {
          return true;
        }
        int[] var8 = AlternateUsernameCredentials.achievementWords(126);
        int[] var7 = var8;
        int[] var6 = var7;
        if (var6 != null &&
          4 == var8.length) {
          this.pendingAwardRecords.addLast(-12328, new AchievementRecord(achievementId, checksum, var8[0], var8[1], var8[2], var8[3]));
          return true;
        }
        return false;
    }

    final void applyThresholdRules(byte guard, int mode, int value) {
        int var7 = EscapeVector.obfuscationControl;
        if (null == ProxySocketConnector.achievementThresholdRules) {
          return;
        }
        if (guard > -63) {
          this.queryFailed = false;
        }
        AchievementThresholdRule[] var8 = ProxySocketConnector.achievementThresholdRules;
        AchievementThresholdRule[] var4 = var8;
        for (int var5 = 0; var8.length > var5; var5++) {
          AchievementThresholdRule var6 = var8[var5];
          if (var6 == null) {
            return;
          }
          var6.grantIfThresholdReached(11827, mode, value);
        }
    }

    final void pollAccountQuery(int guard) {
        if (AccountSessionSupport.isGuestSession(-123)) {
          return;
        }
        if (this.accountAchievementsLoaded) {
          return;
        }
        if (this.pendingQuery == null) {
          return;
        }
        if (guard != -19636) {
          return;
        }
        if (!this.pendingQuery.complete) {
          return;
        }
        if (!this.pendingQuery.unavailable) {
          this.mergeAccountAchievements((byte) -82, this.pendingQuery.achievementWords);
          this.removeAccountAchievementsFromSession(this.pendingQuery.achievementWords, -20915);
          this.queryFailed = false;
          this.pendingQuery = null;
          this.accountAchievementsLoaded = true;
        } else {
          this.accountAchievementsLoaded = false;
          this.pendingQuery = null;
          this.queryFailed = true;
        }
    }

    final static void loadTutorialSprites(ResourceArchive archive, int themeIndex) {
        int var2_int = themeIndex;
        if (!archive.tryLoadNamedGroup(0, SessionMenuSupport.field_d[var2_int])) {
          return;
        }
        try {
          ChatMessageDecoder.field_b[var2_int][0] = MembershipPromotionScreen.loadNamedSprite("tutorial", archive, "layer0", true);
          SharedSpriteAssets.field_a = ChatMessageDecoder.field_b[var2_int][0];
          ChatMessageDecoder.field_b[var2_int][2] = MembershipPromotionScreen.loadNamedSprite("tutorial", archive, "layer2", true);
          UiTheme.field_e = MembershipPromotionScreen.loadNamedSprite("tutorial", archive, "edge_exit_left", true);
          TrackerGainSupport.field_b = MembershipPromotionScreen.loadNamedSprite("tutorial", archive, "edge_exit_right", true);
          EmailAvailabilityValidator.field_r = MembershipPromotionScreen.loadNamedSprite("tutorial", archive, "edge_inner_bottom", true);
          BitCountSupport.field_e = MembershipPromotionScreen.loadNamedSprite("tutorial", archive, "edge_inner_bottom_left", true);
          MarkerSlider.field_G = MembershipPromotionScreen.loadNamedSprite("tutorial", archive, "edge_inner_bottom_right", true);
          PacketBuffer.field_l = MembershipPromotionScreen.loadNamedSprite("tutorial", archive, "edge_inner_left", true);
          IntroFinalFrameSupport.field_a = MembershipPromotionScreen.loadNamedSprite("tutorial", archive, "edge_inner_right", true);
          LoginHandshakeSupport.field_f = MembershipPromotionScreen.loadNamedSprite("tutorial", archive, "edge_inner_top", true);
          AccountRegistrationPanel.field_T = MembershipPromotionScreen.loadNamedSprite("tutorial", archive, "edge_inner_top_left", true);
          GrowableIntList.field_h = MembershipPromotionScreen.loadNamedSprite("tutorial", archive, "edge_inner_top_right", true);
          TrackerGainSupport.field_e = MembershipPromotionScreen.loadNamedSprite("tutorial", archive, "edge_outer", true);
          NanoTickClock.field_d = MembershipPromotionScreen.loadNamedSprite("tutorial", archive, "exitbg", true);
          CipherPacketBuffer.field_n = MembershipPromotionScreen.loadNamedSprite("tutorial", archive, "panel", true);
          ArchiveSpriteLoader.field_a = MembershipPromotionScreen.loadNamedSprite("tutorial", archive, "platform", true);
          EmailValidationError.field_a[var2_int] = MembershipPromotionScreen.loadNamedSprite("tutorial", archive, "texture", true);
          WeightedLruCache.field_c[var2_int] = true;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "en.PA(" + (archive != null ? "{...}" : "null") + ',' + themeIndex + ')');
        }
    }

    final boolean isMembersOnly(int achievementId, int guard) {
        if (guard != 1) {
          this.grantIfSourceEarned((byte) 92, -90, -126, -118);
        }
        AchievementDefinition var3 = this.definition(achievementId, false);
        if (var3 == null) {
          return true;
        }
        return var3.membersOnly;
    }

    final static void sleepMillis(byte guard, long millis) {
        int var3 = -51 / ((guard - 41) / 34);
        if (0L >= millis) {
          return;
        }
        if (millis % 10L == 0L) {
          SpriteCheckboxPainter.sleepMillis(-1L + millis, (byte) 118);
          SpriteCheckboxPainter.sleepMillis(1L, (byte) 118);
        } else {
          SpriteCheckboxPainter.sleepMillis(millis, (byte) 118);
        }
    }

    final void grantNormalRetrievalAwards(byte guard) {
        this.grantIfSourceEarned((byte) -128, 1, 0, 18);
        this.grantIfSourceEarned((byte) -128, 1, 1, 19);
        this.grantIfSourceEarned((byte) -128, 1, 2, 20);
        this.grantIfSourceEarned((byte) -128, 1, 3, 21);
        int var2 = 9 / ((-27 - guard) / 41);
    }

    final void clearSessionAchievements(boolean guard) {
        int var3 = EscapeVector.obfuscationControl;
        if (this.sessionAchievementWords == null) {
          return;
        }
        if (!guard) {
          this.totalCount(42, false);
        }
        for (int var2 = 0; this.sessionAchievementWords.length > var2; var2++) {
          this.sessionAchievementWords[var2] = 0;
        }
    }

    final int totalCount(int setKind, boolean guard) {
        if (0 == setKind) {
          return this.countSetBits((byte) 119, this.sessionAchievementWords);
        }
        if (!guard) {
          this.pendingAwardRecords = (IntrusiveDeque) null;
        }
        if (setKind != 1) {
          return 0;
        }
        return 32;
    }

    private final int bitwiseUnion(byte guard, int left, int right) {
        if (guard > -95) {
          this.pendingQuery = (AchievementQuery) null;
        }
        return left | right;
    }

    final void applyGrantRules(int start, int achievement, int mode) {
        int var7 = EscapeVector.obfuscationControl;
        if (ProxySocketConnector.achievementRules == null) {
          return;
        }
        AchievementGrantRule[] var8 = ProxySocketConnector.achievementRules;
        AchievementGrantRule[] var4 = var8;
        for (int var5 = start; var8.length > var5; var5++) {
          AchievementGrantRule var6 = var8[var5];
          if (var6 != null) {
            var6.grantIfAllowed((byte) 106, mode, achievement);
          }
        }
    }

    private final int[] wordsForSet(int setKind, byte guard) {
        if (setKind == 0) {
          return this.sessionAchievementWords;
        }
        if (setKind == 1) {
          return this.achievementWords;
        }
        int var3 = 7 % ((guard + 78) / 38);
        return null;
    }

    private final boolean hasPendingQuery(byte guard) {
        if (guard >= -115) {
          field_i = (IntrusiveDeque) null;
        }
        return null != this.pendingQuery ? true : false;
    }

    private final int earnedCount(int guard, int setKind) {
        if (setKind == 0) {
          return this.countSetBits((byte) 118, this.sessionAchievementWords);
        }
        if (guard != 10999) {
          return 106;
        }
        if (setKind != 1) {
          return 0;
        }
        return this.countSetBits((byte) 114, this.achievementWords);
    }

    private final int unearnedHiddenCount(int setKind, int guard) {
        int var8 = EscapeVector.obfuscationControl;
        int var3 = 0;
        if (guard != 1) {
          this.pendingQuery = (AchievementQuery) null;
        }
        int[] var4 = ProxySocketConnector.hiddenAchievementIds;
        for (int var5 = 0; var4.length > var5; var5++) {
          int var6 = var4[var5];
          boolean var7 = (this.isEarned(var6, (byte) -128, setKind));
          if (!var7) {
            var3++;
          }
        }
        return var3;
    }

    private final boolean testWordBits(int bits, int wordIndex, int[] words, int shift) {
        String stackIn_7_2 = null;
        try {
          int var5_int = words[wordIndex];
          int var6 = bits << shift;
          boolean stackIn_3_0 = ((var6 & var5_int) != 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var5;
          StringBuilder stackIn_6_1 = new StringBuilder().append("en.V(").append(bits).append(',').append(wordIndex).append(',');
          if (words == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(shift).append(')').toString());
        }
    }

    private final void setWordBit(int bit, boolean guard, int[] words, int wordIndex) {
        try {
          int var5_int = words[wordIndex];
          int var6 = 1 << bit;
          var5_int = var5_int | var6;
          if (guard) {
            this.applyThresholdRules((byte) 123, 114, -50);
          }
          words[wordIndex] = var5_int;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "en.I(" + bit + ',' + guard + ',' + (words != null ? "{...}" : "null") + ',' + wordIndex + ')');
        }
    }

    final boolean hasSessionAchievements(int guard) {
        int var2 = 25 / ((9 - guard) / 54);
        return this.earnedCount(10999, 0) > 0 ? true : false;
    }

    private final void markAchievement(byte guard, int setKind, int achievementId) {
        if (!this.isSupportedSet(122, setKind)) {
          return;
        }
        int[] var7 = this.wordsForSet(setKind, (byte) -16);
        int[] var4 = var7;
        if (var7 == null) {
          return;
        }
        if (guard != -47) {
          this.pendingQuery = (AchievementQuery) null;
        }
        int var5 = achievementId / 32;
        if (var5 >= 0) {
          if (var5 >= var7.length) {
            return;
          }
          int var6 = achievementId % 32;
          if (0 > var6) {
            return;
          }
          this.setWordBit(var6, false, var7, var5);
          return;
        }
    }

    final boolean isHidden(int achievementId, byte guard) {
        if (guard <= 21) {
          field_k = -22;
        }
        AchievementDefinition var3 = this.definition(achievementId, false);
        if (var3 == null) {
          return true;
        }
        return var3.hidden;
    }

    final static void drawLegacyMenu(int defaultCountdown) {
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_33_0 = null;
        NineSliceFrame stackIn_44_0 = null;
        int var5 = 0;
        int var10 = EscapeVector.obfuscationControl;
        try {
          int var1_int = EmailSyntaxValidator.field_o;
          int var2 = defaultCountdown;
          if (2 == ArchiveIndex.field_j) {
            long var3_long = -SavedDataWrite.field_k + MonotonicClockSupport.monotonicMillis(128);
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if (0 > var2) {
              var2 = 0;
            }
          }
          for (int var3 = 0; Js5NetworkRequest.field_I.length > var3; var3++) {
            int var4 = LoginPromptSupport.field_a[var3];
            if (!(var4 >= 0)) {
              var5 = MenuTitleSupport.field_e;
            } else if (var4 != LegacyMenuState.input.selectedIndex) {
              var5 = ValidatedTextWidget.field_X;
            } else {
              var5 = ModeProgressSupport.field_d;
            }
            String var6 = Js5NetworkRequest.field_I[var3];
            if (2 == ArchiveIndex.field_j &&
              1 == var2) {
              if (ContactEntry.field_nb.length >= IterableNodeHashTable.field_f.length) {
                stackIn_19_0 = ContactEntry.field_nb.length;
              } else {
                stackIn_19_0 = IterableNodeHashTable.field_f.length;
              }
              int var7 = stackIn_19_0;
              if (ModalStack.field_G.length > SecondaryNodeHashTable.field_i.length) {
                stackIn_22_0 = ModalStack.field_G.length;
              } else {
                stackIn_22_0 = SecondaryNodeHashTable.field_i.length;
              }
              int var8 = stackIn_22_0;
              if (6 <= var3 &&
                var3 < var7 + 6) {
                if (-var7 + var3 + (-6 + ContactEntry.field_nb.length) < 0) {
                  stackIn_27_0 = "";
                } else {
                  stackIn_27_0 = ContactEntry.field_nb[-var7 + (ContactEntry.field_nb.length + var3) - 6];
                }
                var6 = stackIn_27_0;
              }
              if (var7 + 7 <= var3 &&
                var3 < var7 + 7 + var8) {
                if (-var7 + (-7 + var3) < SecondaryNodeHashTable.field_i.length) {
                  stackIn_33_0 = SecondaryNodeHashTable.field_i[-var7 + (var3 - 7)];
                } else {
                  stackIn_33_0 = "";
                }
                var6 = stackIn_33_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            int stackIn_38_0 = defaultCountdown ^ 94;
            String stackIn_38_1 = var6;
            boolean stackIn_39_2 = !(var4 < 0);
            int var7Lifetime1 = LoginMethod.legacyMenuTextWidth(stackIn_38_0, stackIn_38_1, stackIn_39_2);
            int var8Lifetime1 = ClientException.field_e - (var7Lifetime1 >> 1);
            if (var4 >= 0) {
              var1_int = var1_int + CheckboxPainter.field_s;
              if (var4 != LegacyMenuState.input.selectedIndex) {
                stackIn_44_0 = SpriteDecodeSupport.field_g;
              } else {
                stackIn_44_0 = AnimatedPanelFrame.field_e;
              }
              NineSliceFrame var9 = stackIn_44_0;
              if (var9 != null) {
                var9.draw(-MembershipPromotionScreen.field_k + var8Lifetime1, var1_int, -96, var7Lifetime1 + (MembershipPromotionScreen.field_k << 1), (field_k << 1) + IntroFrameRenderer.field_a);
              }
              var1_int = var1_int + field_k;
            }
            if (0 <= var4) {
              MenuTitleRenderSupport.field_e.drawLeft(var6, var8Lifetime1, var1_int + StatefulTextPainter.field_x, var5, -1);
              var1_int = var1_int + (IntroFrameRenderer.field_a + (CheckboxPainter.field_s + field_k));
            } else {
              MembershipAssetSupport.field_a.drawLeft(var6, var8Lifetime1, var1_int + StrongCacheEntry.field_t, var5, -1);
              var1_int = var1_int + SpriteFactorySupport.field_b;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var1), "en.D(" + defaultCountdown + ')');
        }
    }

    AchievementTracker() {
        this.pendingAwardRecords = new IntrusiveDeque();
        int var1 = 1;
        this.achievementWords = new int[var1];
        this.sessionAchievementWords = new int[var1];
        this.pendingAwardRecords = new IntrusiveDeque();
        this.accountAchievementsLoaded = false;
        this.queryFailed = false;
    }

    final boolean isEarned(int achievementId, byte guard, int setKind) {
        if (!this.isSupportedSet(127, setKind)) {
          return false;
        }
        int[] var7 = this.wordsForSet(setKind, (byte) -14);
        int[] var4 = var7;
        if (var7 == null) {
          return false;
        }
        int var5 = achievementId / 32;
        if (guard > -124) {
          field_d = (PcmSample) null;
        }
        int[] var7Lifetime1 = var4;
        if (0 <= var5 &&
          var7Lifetime1.length > var5) {
          int var6 = achievementId % 32;
          if (var6 >= 0) {
            return this.testWordBits(1, var5, var7Lifetime1, var6);
          }
          return false;
        }
        return false;
    }

    final void serviceAccountAchievements(int guard) {
        int var3 = EscapeVector.obfuscationControl;
        if (this.hasPendingQuery((byte) -123)) {
          this.pollAccountQuery(-19636);
        }
        if (!this.accountAchievementsLoaded) {
          return;
        }
        while (true) {
          AchievementRecord var2 = (AchievementRecord) (this.pendingAwardRecords.removeFirst(-20245));
          if (var2 != null) {
            DialWidgetPainter.enqueueAchievementRecord(var2, 4, 1);
            continue;
          }
          break;
        }
        if (guard != -32464) {
          AchievementDefinition discarded$0 = this.definition(22, true);
        }
        return;
    }

    private final int countSetBits(byte guard, int[] words) {
        String stackIn_14_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (words == null) {
            int stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          int var3_int = 0;
          int[] var4 = words;
          if (guard <= 106) {
            this.queryFailed = false;
          }
          for (int var5 = 0; var5 < var4.length; var5++) {
            int var6 = var4[var5];
            var3_int = var3_int + BitCountSupport.countSetBits(858993459, var6);
          }
          int stackIn_10_0 = var3_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3;
          StringBuilder stackIn_13_1 = new StringBuilder().append("en.CA(").append(guard).append(',');
          if (words == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_g = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_a = "Your email address is used to identify this account";
        field_i = new IntrusiveDeque();
        field_e = "Level score: ";
    }
}
