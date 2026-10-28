/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModeProgress {
    static PcmSample field_e;
    boolean loaded;
    private int completionWriteGroup;
    private ProgressQuery progressQuery;
    static int[] spriteOffsetXs;
    private GameProgressTracker tracker;
    int gameMode;
    static String field_b;
    int nextLevelIndex;
    private IntrusiveDeque pendingUpdates;
    int progressKind;
    private boolean membersOnly;
    private int completionReadGroup;
    static String field_l;

    final void flushPendingUpdates(int guard) {
        Object var2 = null;
        int var3 = EscapeVector.obfuscationControl;
        if (guard == 7108) {
          if (AccountSessionSupport.isGuestSession(-128)) {
            return;
          }
          if (this.progressKind != 0) {
            if (this.progressKind != 1) {
              return;
            }
            while (true) {
              IntValueNode var2_ref2 = (IntValueNode) (this.pendingUpdates.removeFirst(guard - 27353));
              if (var2_ref2 == null) {
                return;
              }
              this.tracker.recordCompletionFlag(this.completionWriteGroup, var2_ref2.value, guard ^ -19601);
            }
          }
          while (true) {
            ProgressRecord var2_ref = (ProgressRecord) (this.pendingUpdates.removeFirst(-20245));
            if (var2_ref != null) {
              PointCloudEffect.enqueueProgressRecord(5, (byte) -107, var2_ref);
              continue;
            }
            break;
          }
          if (this.progressKind != 1) {
            return;
          }
          while (true) {
            IntValueNode var2_ref2Lifetime3 = (IntValueNode) (this.pendingUpdates.removeFirst(guard - 27353));
            if (var2_ref2Lifetime3 == null) {
              return;
            }
            this.tracker.recordCompletionFlag(this.completionWriteGroup, var2_ref2Lifetime3.value, guard ^ -19601);
          }
        }
        this.gameMode = 78;
        if (AccountSessionSupport.isGuestSession(-128)) {
          return;
        }
        if (this.progressKind != 0) {
          if (this.progressKind != 1) {
            return;
          }
          while (true) {
            IntValueNode var2_ref2Lifetime1 = (IntValueNode) (this.pendingUpdates.removeFirst(guard - 27353));
            if (var2_ref2Lifetime1 == null) {
              return;
            }
            this.tracker.recordCompletionFlag(this.completionWriteGroup, var2_ref2Lifetime1.value, guard ^ -19601);
          }
        }
        while (true) {
          ProgressRecord var4 = (ProgressRecord) (this.pendingUpdates.removeFirst(-20245));
          if (var4 != null) {
            PointCloudEffect.enqueueProgressRecord(5, (byte) -107, var4);
            continue;
          }
          break;
        }
        if (this.progressKind != 1) {
          return;
        }
        while (true) {
          IntValueNode var2_ref2Lifetime2 = (IntValueNode) (this.pendingUpdates.removeFirst(guard - 27353));
          if (var2_ref2Lifetime2 == null) {
            return;
          }
          this.tracker.recordCompletionFlag(this.completionWriteGroup, var2_ref2Lifetime2.value, guard ^ -19601);
        }
    }

    private final void progressReadHook(byte guard) {
        int var2 = -18 / ((73 - guard) / 34);
    }

    public static void releaseStatics(boolean guard) {
        field_e = null;
        field_l = null;
        if (guard) {
          return;
        }
        spriteOffsetXs = null;
        field_b = null;
    }

    private final void progressWriteHook(int guard) {
        if (guard <= 25) {
          this.completionReadGroup = 98;
          return;
        }
    }

    final static void configureButtonPalette(LegacyButton[] buttons, boolean enabled, byte guard) {
        String stackIn_18_2 = null;
        int[] var4 = null;
        int[] var5 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (buttons == null) {
            return;
          }
          int[] var11 = new int[]{3170352, 8421504, 8421504};
          if (!enabled) {
            var5 = new int[]{6340704, 16777215, 16777215};
            var4 = new int[]{6340704, 16777215, 16777215};
          } else {
            var5 = new int[]{5275728, 16777215, 10551200};
            var4 = new int[]{5275728, 16777215, 6340704};
          }
          if (guard != 41) {
            CharSequence var10 = (CharSequence) null;
            ModeProgress.parseDecimal(126, (CharSequence) null);
          }
          LegacyButton[] var6 = buttons;
          for (int var7 = 0; var6.length > var7; var7++) {
            LegacyButton var8 = var6[var7];
            if (var8 != null) {
              var8.setColors(var4, var11, (byte) -123, var5);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var3;
          StringBuilder stackIn_17_1 = new StringBuilder().append("gn.N(");
          if (buttons == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(enabled).append(',').append(guard).append(')').toString());
        }
    }

    final boolean canRecordCompletion(int sequentialKind, int levelIndex) {
        if (levelIndex < 0) {
          return false;
        }
        int var3 = SpriteFactorySupport.levelCount(false, this.gameMode);
        if (var3 <= levelIndex) {
          return false;
        }
        if (sequentialKind == this.progressKind) {
          return this.isNextSequentialLevel(true, levelIndex);
        }
        if (this.progressKind != 1) {
          return false;
        }
        return true;
    }

    final int levelStatus(int levelIndex, int guard) {
        if (!this.loaded) {
          return -1;
        }
        if (levelIndex < 0) {
          return -1;
        }
        int var3 = SpriteFactorySupport.levelCount(false, this.gameMode);
        if (levelIndex >= var3) {
          return -1;
        }
        if (0 != this.progressKind) {
          int var4 = -109 / ((37 - guard) / 36);
          if (this.progressKind != 1) {
            return -1;
          }
          if (this.hasPendingCompletion(levelIndex, (byte) 67)) {
            return 0;
          }
          if (this.tracker.hasCompletionFlag(levelIndex, true, this.completionReadGroup)) {
            return 0;
          }
          return -1;
        }
        if (levelIndex < this.nextLevelIndex) {
          return 0;
        }
        if (this.nextLevelIndex == levelIndex) {
          return 1;
        }
        int var4Lifetime1 = -109 / ((37 - guard) / 36);
        if (this.progressKind != 1) {
          return -1;
        }
        if (this.hasPendingCompletion(levelIndex, (byte) 67)) {
          return 0;
        }
        if (this.tracker.hasCompletionFlag(levelIndex, true, this.completionReadGroup)) {
          return 0;
        }
        return -1;
    }

    final static int parseDecimal(int guard, CharSequence text) {
        String stackIn_7_2 = null;
        try {
          if (guard != 16777215) {
            ModeProgress.releaseStatics(true);
          }
          int stackIn_3_0 = wk.a(true, 10, text, 97);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("gn.L(").append(guard).append(',');
          if (text == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void recordCompletion(byte guard, int levelIndex, int[] progressWords) {
        String stackIn_28_2 = null;
        try {
          if (progressWords != null &&
            4 == progressWords.length) {
            if (levelIndex < 0) {
              return;
            }
            int var4_int = SpriteFactorySupport.levelCount(false, this.gameMode);
            if (var4_int <= levelIndex) {
              return;
            }
            if (this.progressKind == 0 &&
              !this.isNextSequentialLevel(true, levelIndex)) {
              return;
            }
            if (null == this.pendingUpdates) {
              this.pendingUpdates = new IntrusiveDeque();
            }
            if (0 == this.progressKind) {
              this.nextLevelIndex = 1 + levelIndex;
              if (this.nextLevelIndex >= var4_int) {
                this.nextLevelIndex = var4_int - 1;
              }
              ProgressRecord var5 = new ProgressRecord(this.gameMode, levelIndex, progressWords[0], progressWords[1], progressWords[2], progressWords[3]);
              this.pendingUpdates.addLast(-12328, var5);
              this.progressWriteHook(87);
            }
            if (1 == this.progressKind) {
              IntValueNode var5_ref = new IntValueNode(levelIndex);
              this.pendingUpdates.addLast(guard - 12313, var5_ref);
            }
            if (guard != -15) {
              this.canRecordCompletion(-9, -123);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_27_0 = var4;
          StringBuilder stackIn_27_1 = new StringBuilder().append("gn.I(").append(guard).append(',').append(levelIndex).append(',');
          if (progressWords == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final boolean hasPendingUpdates(boolean guard) {
        if (guard) {
          this.hasPendingUpdates(false);
          if (this.pendingUpdates != null) {
            return !this.pendingUpdates.isEmpty(-100) ? true : false;
          }
          return false;
        }
        if (this.pendingUpdates != null) {
          return !this.pendingUpdates.isEmpty(-100) ? true : false;
        }
        return false;
    }

    ModeProgress(int gameMode, int progressKind, int completionWriteGroup, int completionReadGroup, boolean membersOnly, GameProgressTracker tracker) {
        this(gameMode, progressKind, tracker);
        try {
          this.membersOnly = membersOnly ? true : false;
          this.completionReadGroup = completionReadGroup;
          this.completionWriteGroup = completionWriteGroup;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "gn.<init>(" + gameMode + ',' + progressKind + ',' + completionWriteGroup + ',' + completionReadGroup + ',' + membersOnly + ',' + (tracker != null ? "{...}" : "null") + ')');
        }
    }

    final static void refreshAccountUi(int guard) {
        if (guard > -107) {
          LegacyButton[] var2 = (LegacyButton[]) null;
          ModeProgress.configureButtonPalette((LegacyButton[]) null, false, (byte) -37);
          ShipHullGeometry.refreshAccountUi(0);
          return;
        }
        ShipHullGeometry.refreshAccountUi(0);
    }

    private final boolean isNextSequentialLevel(boolean guard, int levelIndex) {
        if (levelIndex == this.nextLevelIndex) {
          return true;
        }
        if (this.membersOnly &&
          !UiContainer.hasMembership((byte) 104)) {
          return false;
        }
        if (AccountSessionSupport.isGuestSession(-117) &&
          -1 == this.nextLevelIndex &&
          0 == levelIndex) {
          return true;
        }
        if (guard) {
          return false;
        }
        this.levelStatus(-96, 125);
        return false;
    }

    private final boolean hasPendingCompletion(int levelIndex, byte guard) {
        int var5 = EscapeVector.obfuscationControl;
        if (this.progressKind != 1) {
          return false;
        }
        if (this.pendingUpdates == null) {
          return false;
        }
        if (this.pendingUpdates.isEmpty(-110)) {
          return false;
        }
        if (guard > 36) {
          IntrusiveNode var3 = this.pendingUpdates.first(false);
          while (var3 != null) {
            IntValueNode var6 = (IntValueNode) (var3);
            if (levelIndex == var6.value) {
              return true;
            }
            var3 = this.pendingUpdates.next((byte) 70);
          }
          return false;
        }
        boolean discarded$5 = this.isNextSequentialLevel(true, 29);
        IntrusiveNode var3Lifetime1 = this.pendingUpdates.first(false);
        while (var3Lifetime1 != null) {
          IntValueNode var7 = (IntValueNode) (var3Lifetime1);
          if (levelIndex == var7.value) {
            return true;
          }
          var3Lifetime1 = this.pendingUpdates.next((byte) 70);
        }
        return false;
    }

    final void pollLoad(int guard) {
        int var2;
        if (guard != 5) {
          this.hasPendingUpdates(true);
          if (this.loaded) {
            return;
          }
          if (!this.membersOnly) {
            if (this.progressKind == 0) {
              if (this.progressQuery == null) {
                this.progressQuery = MenuInputState.requestProgress(this.gameMode, 5, 1, (byte) -51);
              }
              this.loaded = this.progressQuery.complete;
              if (this.loaded) {
                var2 = this.progressQuery.progressWords[0];
                if (this.membersOnly) {
                  this.nextLevelIndex = var2;
                } else if (var2 > this.nextLevelIndex) {
                  this.nextLevelIndex = var2;
                }
                this.progressQuery = null;
                this.progressReadHook((byte) -7);
              }
            } else if (1 == this.progressKind) {
              this.loaded = this.tracker.completionFlagsLoaded(0);
            } else {
              this.loaded = false;
            }
            return;
          }
          if (!UiContainer.hasMembership((byte) 101)) {
            this.loaded = true;
            return;
          }
          if (this.progressKind != 0) {
            if (1 == this.progressKind) {
              this.loaded = this.tracker.completionFlagsLoaded(0);
            } else {
              this.loaded = false;
            }
            return;
          }
          if (this.progressQuery == null) {
            this.progressQuery = MenuInputState.requestProgress(this.gameMode, 5, 1, (byte) -51);
          }
          this.loaded = this.progressQuery.complete;
          if (!this.loaded) {
            return;
          }
        } else {
          if (this.loaded) {
            return;
          }
          if (!this.membersOnly) {
            if (this.progressKind != 0) {
              if (1 == this.progressKind) {
                this.loaded = this.tracker.completionFlagsLoaded(0);
              } else {
                this.loaded = false;
              }
              return;
            }
            if (this.progressQuery == null) {
              this.progressQuery = MenuInputState.requestProgress(this.gameMode, 5, 1, (byte) -51);
            }
            this.loaded = this.progressQuery.complete;
            if (!this.loaded) {
              return;
            }
            var2 = this.progressQuery.progressWords[0];
            if (this.membersOnly) {
              this.nextLevelIndex = var2;
            } else if (var2 > this.nextLevelIndex) {
              this.nextLevelIndex = var2;
            }
            this.progressQuery = null;
            this.progressReadHook((byte) -7);
            return;
          }
          if (!UiContainer.hasMembership((byte) 101)) {
            this.loaded = true;
            return;
          }
          if (this.progressKind != 0) {
            if (1 == this.progressKind) {
              this.loaded = this.tracker.completionFlagsLoaded(0);
            } else {
              this.loaded = false;
            }
            return;
          }
          if (this.progressQuery == null) {
            this.progressQuery = MenuInputState.requestProgress(this.gameMode, 5, 1, (byte) -51);
          }
          this.loaded = this.progressQuery.complete;
          if (!this.loaded) {
            return;
          }
        }
        int var2Lifetime1 = this.progressQuery.progressWords[0];
        if (this.membersOnly) {
          this.nextLevelIndex = var2Lifetime1;
        } else if (var2Lifetime1 > this.nextLevelIndex) {
          this.nextLevelIndex = var2Lifetime1;
        }
        this.progressQuery = null;
        this.progressReadHook((byte) -7);
    }

    private ModeProgress(int gameMode, int progressKind, GameProgressTracker tracker) {
        this.completionWriteGroup = -1;
        this.completionReadGroup = -1;
        try {
          this.progressKind = progressKind;
          this.gameMode = gameMode;
          this.nextLevelIndex = -1;
          this.tracker = tracker;
          this.loaded = false;
          if (1 == this.progressKind) {
            this.loaded = this.tracker.completionFlagsLoaded(0);
          }
          this.pendingUpdates = new IntrusiveDeque();
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "gn.<init>(" + gameMode + ',' + progressKind + ',' + (tracker != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Passwords can only contain letters and numbers";
        field_l = "Rock buster";
    }
}
