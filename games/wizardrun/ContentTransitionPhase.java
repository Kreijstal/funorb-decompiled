/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ContentTransitionPhase {
    static String field_b;
    static NameAvailabilityRequest field_a;
    static boolean field_c;

    final static int updateMembershipSlides(int param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = wizardrun.field_H;
        try {
          Base37Codec.field_d = Base37Codec.field_d + 65536;
          if (param0 != 586) {
            stackIn_3_0 = -4;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var2), "kd.A(" + param0 + ',' + param1 + ')');
        }
        stackIn_6_0 = Base37Codec.field_d;
        try {
          while (LoginMethodPreference.multiplyFixed16(stackIn_6_0, MidiPcmStream.field_V, 65535) >= 65536) {
            Base37Codec.field_d = Base37Codec.field_d - MidiPcmStream.field_V;
            IndexedSpriteArrayFactory.field_c = IndexedSpriteArrayFactory.field_c + 1;
            stackIn_6_0 = Base37Codec.field_d;
          }
          var2_int = -1;
          if (null != HighscorePlayerState.field_d) {
            var2_int = HighscorePlayerState.field_d.length;
          } else {
            if (ProgressSubmission.field_s != null) {
              var2_int = ProgressSubmission.field_s.length;
            }
          }
          if (-1 != var2_int) {
            boolean decompiledFrameRemainder0 = true;
            if (MidiPcmStream.field_u > WidgetTheme.field_j) {
              WidgetTheme.field_j = WidgetTheme.field_j + 1;
              if (MidiPcmStream.field_M < WidgetTheme.field_j && (null == HighscorePlayerState.field_d ||
                null == HighscorePlayerState.field_d[ByteArrayPool.field_c])) {
                WidgetTheme.field_j = WidgetTheme.field_j - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (WidgetTheme.field_j >= MidiPcmStream.field_u &&
                  null == HighscorePlayerState.field_d[(1 + ByteArrayPool.field_c) % var2_int]) {
                  WidgetTheme.field_j = WidgetTheme.field_j - 1;
                }
              }
            }
            if (MidiPcmStream.field_u <= WidgetTheme.field_j) {
              AchievementUnlock.field_o = ByteArrayPool.field_c;
              if (RasterSnapshot.field_j) {
                ByteArrayPool.field_c = ByteArrayPool.field_c + 1;
                if (ByteArrayPool.field_c >= var2_int) {
                  ByteArrayPool.field_c = ByteArrayPool.field_c - var2_int;
                }
              } else {
                ByteArrayPool.field_c = ByteArrayPool.field_c - 1;
                if (ByteArrayPool.field_c < 0) {
                  ByteArrayPool.field_c = ByteArrayPool.field_c + var2_int;
                }
              }
              WidgetTheme.field_j = WidgetTheme.field_j - MidiPcmStream.field_u;
            }
            if (MidiPcmStream.field_M < WidgetTheme.field_j) {
              RasterSnapshot.field_j = true;
            }
          }
          if (null != AchievementUnlock.field_p) {
            var3 = 357 - AchievementUnlock.field_p.fullHeight / 2;
            var4 = 0;
            if (UiThemeSetupHelpers.field_c != 0 &&
              EmailDomainHelpers.field_b > var3 &&
              var3 + AchievementUnlock.field_p.height > EmailDomainHelpers.field_b) {
              if (MouseInputHandler.field_e > -AchievementUnlock.field_p.width + 269 &&
                MouseInputHandler.field_e < 269) {
                WidgetTheme.field_j = MidiPcmStream.field_u;
                var4 = 1;
                RasterSnapshot.field_j = false;
              }
              if (MouseInputHandler.field_e > 586 &&
                586 + AchievementUnlock.field_p.width > MouseInputHandler.field_e) {
                RasterSnapshot.field_j = true;
                var4 = 1;
                WidgetTheme.field_j = MidiPcmStream.field_u;
              }
            }
            if (var4 == 0 &&
              MidiPcmStream.field_M < WidgetTheme.field_j &&
              NetworkArchiveRequest.field_B > var3 &&
              AchievementUnlock.field_p.height + var3 > NetworkArchiveRequest.field_B) {
              if (AchievementSubmission.field_n > -AchievementUnlock.field_p.width + 269 &&
                AchievementSubmission.field_n < 269) {
                WidgetTheme.field_j = MidiPcmStream.field_M;
              }
              if (586 < AchievementSubmission.field_n &&
                AchievementUnlock.field_p.width + 586 > AchievementSubmission.field_n) {
                WidgetTheme.field_j = MidiPcmStream.field_M;
              }
            }
          }
          if (param1) {
            GameGraphicsResources.field_d.updatePointer(ChatMessage.hitTestMembershipButton(29292, NetworkArchiveRequest.field_B, AchievementSubmission.field_n), param0 - 668, ChatMessage.hitTestMembershipButton(29292, EmailDomainHelpers.field_b, MouseInputHandler.field_e));
            if (GameGraphicsResources.field_d.wasActivated(param0 ^ -587)) {
              if (GameGraphicsResources.field_d.field_g == 0) {
                stackIn_66_0 = 3;
                return stackIn_66_0;
              }
              if (GameGraphicsResources.field_d.field_g == 1) {
                stackIn_69_0 = 2;
                return stackIn_69_0;
              }
            }
            while (EmailValidationError.pollKeyboardEvent(103)) {
              GameGraphicsResources.field_d.handleHorizontalKey((byte) 11, 0);
              if (GameGraphicsResources.field_d.wasActivated(-1)) {
                if (GameGraphicsResources.field_d.field_g == 0) {
                  stackIn_76_0 = 3;
                  return stackIn_76_0;
                }
                if (1 == GameGraphicsResources.field_d.field_g) {
                  stackIn_80_0 = 1;
                  return stackIn_80_0;
                }
              }
              if (13 != MidiNote.field_r) {
                continue;
              }
              stackIn_84_0 = 1;
              return stackIn_84_0;
            }
          }
          stackIn_86_0 = 0;
          return stackIn_86_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var2), "kd.A(" + param0 + ',' + param1 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void releaseStatics(int param0) {
        if (param0 != 24188) {
          ContentTransitionPhase.updateMembershipSlides(58, false);
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "Please check if address is correct";
    }
}
