/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SessionCounterState {
    private int achievementBits;
    private int field_r;
    private int field_h;
    private int field_g;
    private int field_l;
    private int field_i;
    private int field_f;
    private int field_a;
    private int field_j;
    static LoginStage field_d;
    private int field_p;
    static int[] field_m;
    static String field_n;
    static int field_c;
    private int field_k;
    static Sprite[] field_b;
    private int field_o;
    static PcmSample[] objectExplosionSamples;

    final static String normalizeAccountName(int guard, CharSequence text) {
        String stackIn_34_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (text == null) {
            Object stackIn_3_0 = null;
            return (String) (stackIn_3_0);
          }
          int var2_int = 0;
          int var3 = text.length();
          while (var2_int < var3) {
            if (NineSliceFrame.isNameSeparator(true, text.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var3 > var2_int) {
            if (NineSliceFrame.isNameSeparator(true, text.charAt(var3 - 1))) {
              var3--;
              continue;
            }
            break;
          }
          int var4 = -var2_int + var3;
          if (var4 < 1) {
            return null;
          }
          if (12 < var4) {
            return null;
          }
          StringBuilder var5 = new StringBuilder(var4);
          if (guard > -65) {
            SessionCounterState.releaseStatics(true);
          }
          for (int var6 = var2_int; var6 < var3; var6++) {
            int var7 = text.charAt(var6);
            if (EmailAvailabilityRequest.a((char) var7, -11217)) {
              int var8 = TickClock.normalizeAccountCharacter(227, (char) var7);
              if (0 != var8) {
                StringBuilder discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            String stackIn_30_0 = var5.toString();
            return stackIn_30_0;
          }
          Object stackIn_28_0 = null;
          return (String) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_33_0 = var2;
          StringBuilder stackIn_33_1 = new StringBuilder().append("sf.B(").append(guard).append(',');
          if (text == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final void addOffset(int guard, int offset) {
        this.field_a = this.field_a + offset;
        this.field_j = this.field_j + offset;
        this.field_l = this.field_l + offset;
        this.field_h = this.field_h + offset;
        this.field_f = this.field_f + offset;
        this.field_r = this.field_r + offset;
        if (guard != -1) {
          field_d = (LoginStage) null;
        }
        this.field_o = this.field_o + offset;
        this.field_j = this.field_j + offset;
    }

    private final void scoreReadHook(int guard, int score) {
        if (guard != 136) {
          this.addSubmittedScore(42, -12);
          return;
        }
    }

    final void setAchievementBit(int achievementId, int guard) {
        if (guard != 3748) {
          return;
        }
        this.achievementBits = this.achievementBits | 1 << achievementId;
    }

    final int[] achievementWords(int guard) {
        if (guard != 0) {
          this.advanceCounters((byte) -83);
        }
        this.scoreReadHook(136, this.currentSubmissionScore(~guard));
        return new int[]{this.field_j, this.field_l, this.achievementBits, this.field_o};
    }

    final void addSubmittedScore(int amount, int guard) {
        if (guard != 136) {
          this.advanceCounters((byte) 23);
        }
        this.field_r = this.field_r + amount;
    }

    final int[] progressWords(int guard) {
        if (guard != 31304) {
          this.achievementWords(97);
        }
        this.scoreReadHook(guard - 31168, this.currentSubmissionScore(-1));
        return new int[]{this.field_j, this.field_l, 0, this.field_o};
    }

    private final int currentSubmissionScore(int guard) {
        GameplaySession var2 = BoundedRandomAccessFile.activeSession;
        if (var2 == null) {
          return 0;
        }
        int var3 = var2.score;
        int var4 = var2.gameMode;
        var3 = DialogueScreen.scoreForSubmission(var4, (byte) 126, var3);
        if (guard != -1) {
          this.addOffset(90, -103);
        }
        return var3;
    }

    final void advanceCounters(byte guard) {
        int var2 = -78 / ((guard + 73) / 35);
        this.field_f = this.field_f + this.field_p;
        this.field_h = this.field_h + this.field_i;
        this.field_j = this.field_j + this.field_g;
        this.field_r = this.field_r + this.field_p;
        this.field_l = this.field_l + this.field_g;
        this.field_a = this.field_a + this.field_i;
        this.field_j = this.field_j + this.field_k;
        this.field_o = this.field_o + this.field_k;
    }

    final static EmailValidationError validateEmailLocalPart(String text, byte guard) {
        String stackIn_56_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          int var2_int = text.length();
          if (var2_int == 0) {
            EmailValidationError stackIn_4_0 = ResourceArchive.field_d;
            return stackIn_4_0;
          }
          if (var2_int > 64) {
            EmailValidationError stackIn_8_0 = EmailAvailabilityRequest.field_c;
            return stackIn_8_0;
          }
          if (34 == text.charAt(0)) {
            if (text.charAt(var2_int - 1) != 34) {
              EmailValidationError stackIn_13_0 = CachedTextLayout.field_p;
              return stackIn_13_0;
            }
            boolean var3 = false;
            for (int var4 = 1; var4 < var2_int - 1; var4++) {
              int var5 = text.charAt(var4);
              if (var5 == 92) {
                boolean stackIn_22_0 = !((var3));
                var3 = stackIn_22_0;
              } else {
                if (34 == var5 &&
                  !var3) {
                  EmailValidationError stackIn_27_0 = CachedTextLayout.field_p;
                  return stackIn_27_0;
                }
                var3 = false;
              }
            }
            return null;
          }
          if (guard != 119) {
            EmailValidationError stackIn_33_0 = (EmailValidationError) null;
            return stackIn_33_0;
          }
          boolean var3Lifetime1 = false;
          for (int var4Lifetime1 = 0; var4Lifetime1 < var2_int; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            int var5Lifetime1 = text.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (var4Lifetime1 != 0 &&
                var2_int - 1 != var4Lifetime1 &&
                !var3Lifetime1) {
                var3Lifetime1 = true;
                decompiledFrameRemainder0 = false;
              }
              else {
                EmailValidationError stackIn_44_0 = CachedTextLayout.field_p;
                return stackIn_44_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (AchievementTracker.field_g.indexOf(var5Lifetime1) == -1) {
                EmailValidationError stackIn_49_0 = CachedTextLayout.field_p;
                return stackIn_49_0;
              }
              var3Lifetime1 = false;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_55_0 = var2;
          StringBuilder stackIn_55_1 = new StringBuilder().append("sf.C(");
          if (text == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(guard).append(')').toString());
        }
    }

    final int[] scoreSubmissionWords(int guard) {
        this.scoreReadHook(136, this.currentSubmissionScore(-1));
        int var2 = 0 / ((1 - guard) / 35);
        return new int[]{this.field_r, this.field_h, this.field_f, this.field_a};
    }

    public static void releaseStatics(boolean guard) {
        objectExplosionSamples = null;
        field_b = null;
        field_d = null;
        if (guard) {
          CharSequence var2 = (CharSequence) null;
          SessionCounterState.normalizeAccountName(27, (CharSequence) null);
        }
        field_n = null;
        field_m = null;
    }

    SessionCounterState(int seedOffset) {
        this.field_h = 136;
        this.field_g = 203;
        this.field_a = 10;
        this.field_f = 30589;
        this.field_l = 247;
        this.field_j = 201;
        this.field_i = 50;
        this.achievementBits = 0;
        this.field_p = 65;
        this.field_o = 10325;
        this.field_k = 7;
        this.field_r = 138;
        this.addOffset(-1, seedOffset);
        this.advanceCounters((byte) -19);
        this.scoreReadHook(136, this.currentSubmissionScore(-1));
    }

    static {
        field_d = new LoginStage();
        field_n = "Legend";
        field_c = 0;
        field_m = new int[4];
        objectExplosionSamples = new PcmSample[17];
    }
}
