/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BestScoreStrategy extends AiPlanningStrategy {
    static RgbSprite field_m;
    static String decodedChatChannelLabel;
    static boolean field_l;
    static int[][][] unitAnimationVariants;
    static String field_h;
    static BirthDateChatEnableForm field_i;

    final static boolean a(boolean param0) {
        long var1;
        long var3;
        int var5;
        int var6;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (!param0) {
          return false;
        }
        var1 = vi.monotonicMillis(-45);
        var3 = var1 - EditableTextField.field_Lb;
        if (var3 > 30000L) {
          EditableTextField.field_Lb = var1;
          mu.field_d = 0;
          return true;
        }
        var5 = 3000;
        if (7 <= mu.field_d) {
          var5 = 12000;
        } else {
          if (mu.field_d >= 5) {
            var5 = 9000;
          } else {
            if (3 <= mu.field_d) {
              var5 = 6000;
            }
          }
        }
        if (var3 <= (long)var5) {
          return false;
        }
        EditableTextField.field_Lb = var1;
        mu.field_d = mu.field_d + 1;
        return true;
    }

    final void submitCandidate(int obfuscationGuard, AiActionCandidate candidate) {
        RuntimeException runtimeException = null;
        AiActionCandidate var3 = null;
        AiActionCandidate var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (AiActionCandidate) (this.candidates.popFirst(0));
          if (obfuscationGuard != 16777062) {
            var4 = (AiActionCandidate) null;
            this.submitCandidate(64, (AiActionCandidate) null);
          }
          if (var3 == null ||
            candidate.score > var3.score) {
            var3 = candidate;
          }
          this.candidates.addFirst(750, var3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("aw.F(").append(obfuscationGuard).append(',');
          if (candidate == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final AiActionCandidate selectCandidate(byte obfuscationGuard) {
        AiActionCandidate var2 = null;
        AiActionCandidate var2Lifetime1;
        if (obfuscationGuard <= -28) {
          var2 = (AiActionCandidate) (this.candidates.popFirst(0));
          return var2;
        }
        this.selectCandidate((byte) -5);
        var2Lifetime1 = (AiActionCandidate) (this.candidates.popFirst(0));
        return var2Lifetime1;
    }

    final static ConsoleExpression readQuotedConsoleToken(byte obfuscationGuard, TextCursor cursor) {
        int rewoundPosition = 0;
        StringBuilder openingAppendResult = null;
        StringBuilder escapedAppendResult = null;
        StringBuilder characterAppendResult = null;
        int sourceOffset = 0;
        RuntimeException failure = null;
        StringBuilder tokenBuilder = null;
        int openingQuote = 0;
        int escapeNext = 0;
        int character = 0;
        int obfuscationControl = 0;
        int selectedKind = 0;
        ConsoleExpression tokenResult = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String cursorDescription = null;
        RuntimeException caughtFailure = null;
        int kind;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          rewoundPosition = cursor.position - 1;
          cursor.position = cursor.position - 1;
          sourceOffset = rewoundPosition;
          tokenBuilder = new StringBuilder();
          openingQuote = cursor.readCharacter(-1);
          if (obfuscationGuard <= 95) {
            field_h = (String) null;
          }
          openingAppendResult = tokenBuilder.append((char) openingQuote);
          escapeNext = 0;
          while (!cursor.isAtEnd((byte) 16)) {
            character = cursor.readCharacter(-1);
            if (escapeNext != 0) {
              escapeNext = 0;
              escapedAppendResult = tokenBuilder.append((char) character);
              continue;
            }
            if (character != 92) {
              characterAppendResult = tokenBuilder.append((char) character);
            } else {
              escapeNext = 1;
            }
            if (openingQuote != character) {
              continue;
            }
            break;
          }
          if (openingQuote != 34) {
            selectedKind = hf.consoleCharacterKind;
          } else {
            selectedKind = BattleTutorial.consoleStringKind;
          }
          kind = selectedKind;
          tokenResult = new ConsoleExpression(kind, sourceOffset, tokenBuilder.toString());
          return tokenResult;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("aw.B(").append(obfuscationGuard).append(',');
          if (cursor == null) {
            cursorDescription = "null";
          } else {
            cursorDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(cursorDescription).append(')').toString());
        }
    }

    final static void registerTheme(BattlefieldTheme theme, BattlefieldTheme[] themes, int obfuscationGuard) {
        try {
          if (obfuscationGuard != -5841) {
            field_h = (String) null;
          }
          themes[theme.themeId] = theme;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "aw.A(" + (theme != null ? "{...}" : "null") + ',' + (themes != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        nt var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4 = (nt) (s.field_a.first((byte) 104));
          while (var4 != null) {
            tf.a(param0, var4, (byte) -64);
            var4 = (nt) (s.field_a.next((byte) 123));
          }
          if (param1 == 1742) {
            return;
          }
          BestScoreStrategy.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "aw.R(" + param0 + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        int var1 = 13 % ((-54 - param0) / 57);
        field_h = null;
        decodedChatChannelLabel = null;
        field_m = null;
        unitAnimationVariants = (int[][][]) null;
        field_i = null;
    }

    BestScoreStrategy(AiPlanner planner) {
        super(planner);
    }

    static {
        field_h = null;
    }
}
