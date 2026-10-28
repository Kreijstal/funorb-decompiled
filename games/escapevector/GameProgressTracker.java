/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameProgressTracker {
    private SavedCompletionFlags savedCompletionFlags;
    static String field_a;
    private ModeProgress[] modes;
    private ModeProgress infrastructureProgress;
    static String field_b;

    final boolean pollLoad(int guard) {
        int var5 = EscapeVector.obfuscationControl;
        if (guard != -9949) {
          this.savedCompletionFlags = (SavedCompletionFlags) null;
        }
        if (this.isLoaded(-19836)) {
          return true;
        }
        this.savedCompletionFlags.pollLoad(104);
        ModeProgress[] var6 = this.modes;
        ModeProgress[] var2 = var6;
        for (int var3 = 0; var3 < var6.length; var3++) {
          ModeProgress var4 = var6[var3];
          if (var4 != null) {
            var4.pollLoad(5);
          }
        }
        if (this.infrastructureProgress != null) {
          this.infrastructureProgress.pollLoad(5);
        }
        return this.isLoaded(guard - 9887);
    }

    public static void releaseStatics(int guard) {
        field_a = null;
        int var1 = 91 % ((guard + 58) / 38);
        field_b = null;
    }

    final int levelStatus(boolean guard, int gameMode, int levelIndex) {
        int var7 = EscapeVector.obfuscationControl;
        if (null == this.modes) {
          return -1;
        }
        ModeProgress[] var8 = this.modes;
        ModeProgress[] var4 = var8;
        if (!guard) {
          return 3;
        }
        for (int var5 = 0; var5 < var8.length; var5++) {
          ModeProgress var6 = var8[var5];
          if (var6 != null &&
            var6.gameMode == gameMode) {
            return var6.levelStatus(levelIndex, 80);
          }
        }
        return -1;
    }

    final boolean allInfrastructureLevelsAccessible(int guard) {
        int var7 = EscapeVector.obfuscationControl;
        if (null == this.infrastructureProgress) {
          return false;
        }
        if (guard < 110) {
          return false;
        }
        int var2 = this.infrastructureProgress.gameMode;
        int var3 = SpriteFactorySupport.levelCount(false, var2);
        if (var3 <= 0) {
          return false;
        }
        for (int var4 = 0; var3 > var4; var4++) {
          int var5 = this.infrastructureProgress.levelStatus(var4, 74);
          boolean var6 = (LevelAvailabilitySupport.isAccessible((byte) 111, var5));
          if (!var6) {
            return false;
          }
        }
        return true;
    }

    final void recordCompletionFlag(int writeGroup, int levelIndex, int guard) {
        if (guard != -22357) {
          this.unlockedLevelIndex(-119, 57);
        }
        this.savedCompletionFlags.recordCompletion(writeGroup, levelIndex, true);
    }

    final boolean allLevelsAccessible(int gameMode, boolean guard) {
        int var7 = EscapeVector.obfuscationControl;
        int var3 = SpriteFactorySupport.levelCount(guard, gameMode);
        if (0 >= var3) {
          return false;
        }
        for (int var4 = 0; var4 < var3; var4++) {
          int var5 = this.levelStatus(true, gameMode, var4);
          boolean var6 = (LevelAvailabilitySupport.isAccessible((byte) 98, var5));
          if (!var6) {
            return false;
          }
        }
        return true;
    }

    final boolean completionFlagsLoaded(int guard) {
        if (guard != 0) {
          this.completionFlagsLoaded(45);
        }
        return this.savedCompletionFlags.isLoaded((byte) -83);
    }

    final int progressKind(int gameMode, int startIndex) {
        int var6 = EscapeVector.obfuscationControl;
        if (null == this.modes) {
          return -1;
        }
        ModeProgress[] var3 = this.modes;
        for (int var4 = startIndex; var4 < var3.length; var4++) {
          ModeProgress var5 = var3[var4];
          if (var5 != null &&
            gameMode == var5.gameMode) {
            return var5.progressKind;
          }
        }
        return -1;
    }

    final int unlockedLevelIndex(int guard, int gameMode) {
        int var7 = EscapeVector.obfuscationControl;
        if (this.modes == null) {
          return 0;
        }
        if (guard != 29386) {
          this.infrastructureProgress = (ModeProgress) null;
        }
        ModeProgress[] var8 = this.modes;
        for (int var4 = 0; var8.length > var4; var4++) {
          ModeProgress var5 = var8[var4];
          if (var5 != null &&
            gameMode == var5.gameMode) {
            if (0 == var5.progressKind) {
              if (var5.nextLevelIndex <= 0) {
                return 0;
              }
              return var5.nextLevelIndex;
            }
            if (var5.progressKind == 1) {
              int var6 = SpriteFactorySupport.levelCount(false, gameMode);
              if (0 >= var6) {
                return 0;
              }
              return var6;
            }
          }
        }
        return 0;
    }

    final static boolean isPulsingInfrastructureType(byte guard, int objectType) {
        int var2 = -43 / ((guard + 62) / 32);
        int var3 = 14;
        int var4 = var3 + 3;
        boolean stackIn_4_0 = (objectType >= var3) && (var4 > objectType);
        return stackIn_4_0;
    }

    final void recordInfrastructureCompletion(byte guard, int gameMode, int[] progressWords, int levelIndex) {
        String stackIn_15_2 = null;
        try {
          if (progressWords != null &&
            progressWords.length == 4) {
            if (null == this.infrastructureProgress) {
              return;
            }
            if (this.infrastructureProgress.gameMode != gameMode) {
              return;
            }
            this.infrastructureProgress.recordCompletion((byte) -15, levelIndex, progressWords);
            if (guard != -64) {
              this.modes = (ModeProgress[]) null;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_14_0 = runtimeException;
          StringBuilder stackIn_14_1 = new StringBuilder().append("kg.K(").append(guard).append(',').append(gameMode).append(',');
          if (progressWords == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(levelIndex).append(')').toString());
        }
    }

    final void recordLevelCompletion(int guard, int gameMode, int levelIndex, int[] progressWords) {
        String stackIn_20_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (progressWords != null &&
            progressWords.length == 4) {
            if (this.modes == null) {
              return;
            }
            if (guard != -15748) {
              return;
            }
            ModeProgress[] var5 = this.modes;
            for (int var6 = 0; var5.length > var6; var6++) {
              ModeProgress var7 = var5[var6];
              if (var7 != null &&
                gameMode == var7.gameMode) {
                var7.recordCompletion((byte) -15, levelIndex, progressWords);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_19_0 = var5_ref;
          StringBuilder stackIn_19_1 = new StringBuilder().append("kg.C(").append(guard).append(',').append(gameMode).append(',').append(levelIndex).append(',');
          if (progressWords == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void flushPendingUpdates(int guard) {
        int var6 = EscapeVector.obfuscationControl;
        if (this.modes == null) {
          return;
        }
        int var2 = 127 % ((67 - guard) / 42);
        ModeProgress[] var3 = this.modes;
        for (int var4 = 0; var3.length > var4; var4++) {
          ModeProgress var5 = var3[var4];
          if (var5 != null) {
            var5.flushPendingUpdates(7108);
          }
        }
        if (null != this.infrastructureProgress) {
          this.infrastructureProgress.flushPendingUpdates(7108);
        }
    }

    final boolean hasPendingProgress(int guard) {
        int var5 = EscapeVector.obfuscationControl;
        if (null == this.modes) {
          return false;
        }
        ModeProgress[] var6 = this.modes;
        ModeProgress[] var2 = var6;
        for (int var3 = 0; var3 < var6.length; var3++) {
          ModeProgress var4 = var6[var3];
          if (var4 != null &&
            var4.hasPendingUpdates(false)) {
            return true;
          }
        }
        if (guard == 17523) {
          return false;
        }
        this.modes = (ModeProgress[]) null;
        return false;
    }

    GameProgressTracker() {
        this.savedCompletionFlags = new SavedCompletionFlags();
        int var1 = 4;
        this.modes = new ModeProgress[var1];
        for (int var2 = 0; var1 > var2; var2++) {
          int var3 = ModeProgressSupport.field_f[var2];
          int var4 = -1;
          if (var3 == 1) {
            var4 = 1;
          }
          int var5 = DualLinkNode.field_m[var2];
          boolean var6 = (PasswordValidator.modeSessionOption(1, var2) == 2);
          this.modes[var2] = new ModeProgress(var2, var3, var4, var5, (var6), this);
        }
        int var2Lifetime1 = 2;
        int var3Lifetime1 = 1;
        int var4Lifetime1 = 0;
        int var5Lifetime1 = 1;
        boolean var6Lifetime1 = true;
        this.infrastructureProgress = new ModeProgress(var2Lifetime1, var3Lifetime1, var4Lifetime1, var5Lifetime1, (var6Lifetime1), this);
    }

    final boolean hasCompletionFlag(int levelIndex, boolean guard, int readGroup) {
        if (!guard) {
          return false;
        }
        if (readGroup == -1) {
          return false;
        }
        if (0 == readGroup) {
          return this.savedCompletionFlags.isSimulatorCompleted(1, levelIndex);
        }
        if (1 != readGroup) {
          return false;
        }
        return this.savedCompletionFlags.isRetributionCompleted(levelIndex, (byte) -113);
    }

    final boolean isLoaded(int guard) {
        int var5 = EscapeVector.obfuscationControl;
        if (!this.savedCompletionFlags.isLoaded((byte) -83)) {
          return false;
        }
        ModeProgress[] var6 = this.modes;
        ModeProgress[] var2 = var6;
        for (int var3 = 0; var3 < var6.length; var3++) {
          ModeProgress var4 = var6[var3];
          if (var4.progressKind != 1 &&
            !var4.loaded) {
            return false;
          }
        }
        if (guard == -19836) {
          return true;
        }
        this.pollLoad(80);
        return true;
    }

    final boolean canRecordLevelCompletion(int guard, int gameMode, int levelIndex) {
        int var7 = EscapeVector.obfuscationControl;
        if (this.modes == null) {
          return false;
        }
        ModeProgress[] var4 = this.modes;
        int var5 = 0;
        if (guard != 15954) {
          this.infrastructureProgress = (ModeProgress) null;
        }
        while (var5 < var4.length) {
          ModeProgress var6 = var4[var5];
          if (var6 != null &&
            gameMode == var6.gameMode) {
            return var6.canRecordCompletion(0, levelIndex);
          }
          var5++;
        }
        return false;
    }

    static {
        field_a = "Orb points: ";
        field_b = "Email: ";
    }
}
