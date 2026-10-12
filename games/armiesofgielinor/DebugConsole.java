/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DebugConsole extends ConsolePanel {
    static String field_A;
    static CommunityTabGroup field_w;
    static String field_B;
    static String field_C;
    static int field_y;
    static String field_u;
    static String field_v;
    private ConsoleCommand[] commands;
    static int field_x;

    final boolean handleKey(int obfuscationGuard, char character, int keyCode) {
        boolean baseConsumed = false;
        boolean closedResult = false;
        int escapeFlag = 0;
        int previousStringFlag = 0;
        int stringQuoteToggle = 0;
        int previousCharacterFlag = 0;
        int characterQuoteToggle = 0;
        int previousCharacter = 0;
        int nextCharacter = 0;
        RuntimeException caughtFailure = null;
        String updatedText = null;
        RuntimeException failure = null;
        int caretIndex = 0;
        int inString = 0;
        int inCharacter = 0;
        int escapeNext = 0;
        int scanIndex = 0;
        int scanCharacter = 0;
        int obfuscationControl = 0;
        String text = null;
        int beforeCaret;
        int atCaret;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (!this.isOpen(-31501)) {
            closedResult = super.handleKey(-30847, character, keyCode);
            return closedResult;
          }
          text = this.input.getText(obfuscationGuard ^ obfuscationGuard);
          caretIndex = this.input.getCaretIndex(obfuscationGuard ^ 30781);
          inString = 0;
          inCharacter = 0;
          escapeNext = 0;
          for (scanIndex = 0; caretIndex > scanIndex; scanIndex++) {
            if (escapeNext == 0) {
              scanCharacter = text.charAt(scanIndex);
              if (inString == 0 &&
                inCharacter == 0) {
                escapeFlag = 0;
              } else {
                escapeFlag = (scanCharacter == 92) ? 1 : 0;
              }
              escapeNext = escapeFlag;
              previousStringFlag = inString;
              if (inCharacter == 0 &&
                scanCharacter == 34) {
                stringQuoteToggle = 1;
              } else {
                stringQuoteToggle = 0;
              }
              inString = previousStringFlag ^ stringQuoteToggle;
              previousCharacterFlag = inCharacter;
              if (inString == 0 &&
                scanCharacter == 39) {
                characterQuoteToggle = 1;
              } else {
                characterQuoteToggle = 0;
              }
              inCharacter = previousCharacterFlag ^ characterQuoteToggle;
            } else {
              escapeNext = 0;
            }
          }
          if (0 >= caretIndex) {
            previousCharacter = 65535;
          } else {
            previousCharacter = text.charAt(caretIndex - 1);
          }
          beforeCaret = previousCharacter;
          if (text.length() <= caretIndex) {
            nextCharacter = 65535;
          } else {
            nextCharacter = text.charAt(caretIndex);
          }
          boolean editNormally = true;
          atCaret = nextCharacter;
          if ((inString == 0 ||
            escapeNext != 0 ||
            character != 34 ||
            atCaret != 34) && (inCharacter == 0 ||
            escapeNext != 0 ||
            39 != character ||
            atCaret != 39) && (inString != 0 ||
            inCharacter != 0 ||
            character != 41 ||
            atCaret != 41)) {
            if (keyCode == 85 && (beforeCaret == 40 &&
              atCaret == 41 ||
              inString != 0 &&
              beforeCaret == 34 &&
              atCaret == 34 ||
              inCharacter != 0 &&
              39 == beforeCaret &&
              39 == atCaret)) {
              this.input.handleKey(101, -26126, '￿');
            }
            baseConsumed = super.handleKey(-30847, character, keyCode);
            updatedText = this.input.getText(obfuscationGuard ^ -30847);
            caretIndex = this.input.getCaretIndex(obfuscationGuard ^ -30779);
            if (inString == 0 &&
              inCharacter == 0 &&
              character == 40) {
              this.input.handleKey(-1, -26126, ')');
              this.input.setSelection(-98, caretIndex, caretIndex);
            }
            if (inString == 0 &&
              inCharacter == 0 &&
              character == 34) {
              this.input.handleKey(-1, -26126, '"');
              this.input.setSelection(obfuscationGuard + 30749, caretIndex, caretIndex);
            }
            if (((inString == 0)) &&
              ((inCharacter == 0)) &&
              ((character == 39))) {
              this.input.handleKey(-1, obfuscationGuard + 4721, '\'');
              this.input.setSelection(-98, caretIndex, caretIndex);
            }
            editNormally = false;
          }
          else {
            this.input.setCollapsedSelection(1 + caretIndex, false);
          }
          vs.highlightedConsoleInput = wf.highlightConsoleSyntax(this.input.getText(0), -101);
          return true;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "ij.S(" + obfuscationGuard + ',' + character + ',' + keyCode + ')');
        }
    }

    DebugConsole(NodeDeque commandDeque, BitmapFont font, PlatformTaskService platformService) {
        super(font, platformService);
        int commandSlot = 0;
        int commandIndex = 0;
        ConsoleCommand command = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String dequeDescription = null;
        RuntimeException failureWithDeque = null;
        StringBuilder errorContextWithDeque = null;
        RuntimeException failureWithFont = null;
        String fontDescription = null;
        RuntimeException failureWithPlatform = null;
        StringBuilder errorContextWithFont = null;
        RuntimeException finalFailureForContext = null;
        String platformDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        try {
          this.commands = new ConsoleCommand[commandDeque.size(false)];
          commandIndex = 0;
          command = (ConsoleCommand) (commandDeque.first((byte) 94));
          while (command != null) {
            commandSlot = commandIndex;
            commandIndex++;
            this.commands[commandSlot] = command;
            command = (ConsoleCommand) (commandDeque.next((byte) 123));
          }
          this.printText(-1, "# <col=ffaaff>FunOrbConsole (loaded " + this.commands.length + " methods at " + new Date() + ")</col>");
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ij.<init>(");
          if (commandDeque == null) {
            dequeDescription = "null";
          } else {
            dequeDescription = "{...}";
          }
          failureWithDeque = failureForContext;
          errorContextWithDeque = ((StringBuilder) (Object) errorContext).append(dequeDescription).append(',');
          if (font == null) {
            failureWithFont = failureWithDeque;
            fontDescription = "null";
          } else {
            failureWithFont = failureForContext;
            fontDescription = "{...}";
          }
          failureWithPlatform = failureWithFont;
          errorContextWithFont = ((StringBuilder) (Object) errorContextWithDeque).append(fontDescription).append(',');
          if (platformService == null) {
            finalFailureForContext = failureWithPlatform;
            platformDescription = "null";
          } else {
            finalFailureForContext = failureWithFont;
            platformDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) finalFailureForContext), ((StringBuilder) (Object) errorContextWithFont).append(platformDescription).append(')').toString());
        }
    }

    final void drawConsole(int obfuscationGuard) {
        String savedDisplayText = null;
        try {
          int guardQuotient = -78 / ((obfuscationGuard - 13) / 33);
          savedDisplayText = this.input.textComponent.text;
          this.input.textComponent.text = vs.highlightedConsoleInput;
          super.drawConsole(-100);
          this.input.textComponent.text = savedDisplayText;
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "ij.M(" + obfuscationGuard + ')');
        }
    }

    final String[] getSuggestions(boolean obfuscationGuard) {
        DualNodeDeque guardMatches = null;
        int suggestionSlot = 0;
        String[] result = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        int caretIndex = 0;
        ConsoleExpression[] tokens = null;
        int tokenIndex = 0;
        String sourceAlias = null;
        int prefixLength = 0;
        String[] signatures = null;
        int backwardTokenIndex = 0;
        int parenthesisDepth = 0;
        ConsoleCommand command = null;
        int obfuscationControl = 0;
        String unusedSource = null;
        String source = null;
        ConsoleExpression token = null;
        DualNodeDeque matches = null;
        String sourceSecondAlias;
        String prefix;
        int signatureIndex;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          source = this.input.getText(0);
          sourceAlias = source;
          sourceSecondAlias = source;
          caretIndex = this.input.getCaretIndex(95);
          tokens = vv.cachedConsoleTokenArray(source, 114);
          tokenIndex = DualLinkedNode.consoleTokenAtCaret(caretIndex, tokens, -122);
          this.suggestionBackdrop.x = 0;
          prefix = "";
          if (0 <= tokenIndex) {
            token = tokens[tokenIndex];
            prefixLength = -token.sourceOffset + caretIndex;
            if (rn.consoleCallKind == token.kind &&
              prefixLength > 0) {
              prefix = token.text.substring(0, Math.min(token.text.length(), prefixLength));
              this.suggestionBackdrop.x = this.font.a(source.substring(0, token.sourceOffset));
            } else {
              backwardTokenIndex = tokenIndex;
              parenthesisDepth = 0;
              while (backwardTokenIndex >= 0) {
                if (~LeaderEscortCondition.consoleArgumentEndKind == ~tokens[backwardTokenIndex].kind) {
                  parenthesisDepth++;
                }
                if (tokens[backwardTokenIndex].kind == ChatMessage.consoleArgumentStartKind) {
                  parenthesisDepth--;
                }
                if (parenthesisDepth >= 0) {
                  backwardTokenIndex--;
                  continue;
                }
                break;
              }
              if (0 < backwardTokenIndex &&
                tokens[backwardTokenIndex - 1].kind == rn.consoleCallKind) {
                prefix = tokens[-1 + backwardTokenIndex].text;
                this.suggestionBackdrop.x = this.font.a(source.substring(0, tokens[-1 + backwardTokenIndex].sourceOffset));
              }
            }
          }
          matches = this.matchingCommands((byte) -75, prefix);
          signatures = new String[matches.size(30578)];
          signatureIndex = 0;
          command = (ConsoleCommand) (matches.first((byte) 43));
          if (!obfuscationGuard) {
            unusedSource = (String) null;
            guardMatches = this.matchingCommands((byte) 83, (String) null);
          }
          while (command != null) {
            suggestionSlot = signatureIndex;
            signatureIndex++;
            signatures[suggestionSlot] = command.displaySignature;
            command = (ConsoleCommand) (matches.next(24));
          }
          result = signatures;
          return result;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "ij.K(" + obfuscationGuard + ')');
        }
    }

    final static LobbyRoom getLobbyRoom(byte obfuscationGuard, int roomId) {
        LobbyRoom stackIn_2_0 = null;
        DualLinkedNode stackIn_7_0 = null;
        LobbyRoom stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (obfuscationGuard != 74) {
            stackIn_2_0 = (LobbyRoom) null;
            return stackIn_2_0;
          }
          if (null != qm.lobbyRoomsById) {
            stackIn_7_0 = qm.lobbyRoomsById.get((byte) -27, (long)roomId);
          } else {
            stackIn_7_0 = null;
          }
          stackIn_8_0 = (LobbyRoom) (stackIn_7_0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ij.AA(" + obfuscationGuard + ',' + roomId + ')');
        }
    }

    final void completeInput(byte obfuscationGuard) {
        StringBuilder commonAppendResult = null;
        StringBuilder parenthesesAppendResult = null;
        int previousSharedFlag = 0;
        int matchingCharacterFlag = 0;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        int caretIndex = 0;
        ConsoleExpression[] tokens = null;
        int tokenIndex = 0;
        String sourceAlias = null;
        int prefixLength = 0;
        StringBuilder suffixBuilder = null;
        int characterIndex = 0;
        int sharedPrefix = 0;
        int shortestNameLength = 0;
        ConsoleCommand lengthCandidate = null;
        int candidateCharacter = 0;
        ConsoleCommand comparisonCandidate = null;
        int obfuscationControl = 0;
        String source = null;
        ConsoleExpression token = null;
        DualNodeDeque matches = null;
        String sourceSecondAlias;
        String prefix;
        int nextCaretIndex;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          source = this.input.getText(0);
          sourceAlias = source;
          sourceSecondAlias = source;
          caretIndex = this.input.getCaretIndex(-105);
          tokens = vv.cachedConsoleTokenArray(source, obfuscationGuard - 11);
          tokenIndex = DualLinkedNode.consoleTokenAtCaret(caretIndex, tokens, -126);
          prefix = "";
          if (0 <= tokenIndex) {
            token = tokens[tokenIndex];
            prefixLength = caretIndex - token.sourceOffset;
            if (rn.consoleCallKind == token.kind &&
              0 < prefixLength &&
              token.text.length() >= prefixLength) {
              prefix = token.text.substring(0, prefixLength);
            }
          }
          matches = this.matchingCommands((byte) -75, prefix);
          if (0 == matches.size(30578)) {
            return;
          }
          if (obfuscationGuard != 122) {
            this.drawConsole(77);
          }
          suffixBuilder = new StringBuilder();
          characterIndex = prefix.length();
          sharedPrefix = 1;
          shortestNameLength = 2147483647;
          lengthCandidate = (ConsoleCommand) (matches.first((byte) -110));
          while (lengthCandidate != null) {
            if (shortestNameLength > lengthCandidate.commandName.length()) {
              shortestNameLength = lengthCandidate.commandName.length();
            }
            lengthCandidate = (ConsoleCommand) (matches.next(24));
          }
          while (sharedPrefix != 0) {
            if (shortestNameLength > characterIndex) {
              candidateCharacter = ((ConsoleCommand) (matches.first((byte) -112))).commandName.charAt(characterIndex);
              comparisonCandidate = (ConsoleCommand) (matches.next(24));
              while (comparisonCandidate != null) {
                previousSharedFlag = sharedPrefix;
                if (~candidateCharacter != ~comparisonCandidate.commandName.charAt(characterIndex)) {
                  matchingCharacterFlag = 0;
                } else {
                  matchingCharacterFlag = 1;
                }
                sharedPrefix = previousSharedFlag & matchingCharacterFlag;
                comparisonCandidate = (ConsoleCommand) (matches.next(24));
              }
              characterIndex++;
              if (sharedPrefix == 0) {
                continue;
              }
              commonAppendResult = suffixBuilder.append((char) candidateCharacter);
              continue;
            }
            break;
          }
          nextCaretIndex = caretIndex + suffixBuilder.length();
          if (prefix.length() + suffixBuilder.length() == shortestNameLength) {
            nextCaretIndex++;
            parenthesesAppendResult = suffixBuilder.append("()");
            if (matches.size(30578) == 1 &&
              ((ConsoleCommand) (matches.first((byte) 44))).parameterTypes.length == 0) {
              nextCaretIndex++;
            }
            this.input.setText(source.substring(0, caretIndex) + suffixBuilder.toString() + source.substring(caretIndex), (byte) 45);
            this.input.setCollapsedSelection(nextCaretIndex, false);
          } else {
            this.input.setText(source.substring(0, caretIndex) + suffixBuilder.toString() + source.substring(caretIndex), (byte) 45);
            this.input.setCollapsedSelection(nextCaretIndex, false);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "ij.J(" + obfuscationGuard + ')');
        }
    }

    private final DualNodeDeque matchingCommands(byte obfuscationGuard, String prefix) {
        int commandIndex = 0;
        DualNodeDeque matchesAlias = null;
        int obfuscationControl = 0;
        DualNodeDeque matches = null;
        DualNodeDeque guardResult = null;
        DualNodeDeque result = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String prefixDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != -75) {
            guardResult = (DualNodeDeque) null;
            return guardResult;
          }
          matches = new DualNodeDeque();
          matchesAlias = matches;
          for (commandIndex = 0; commandIndex < this.commands.length; commandIndex++) {
            if (this.commands[commandIndex].commandName.startsWith(prefix)) {
              this.commands[commandIndex].unlinkSecondary((byte) -76);
              matches.addLast(this.commands[commandIndex], false);
            }
          }
          result = matchesAlias;
          return result;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ij.BA(").append(obfuscationGuard).append(',');
          if (prefix == null) {
            prefixDescription = "null";
          } else {
            prefixDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(prefixDescription).append(')').toString());
        }
    }

    final boolean evaluateInput(String source, boolean executeExpression) {
        try {
          ConsoleExpression expression = null;
          NodeDeque tokenDeque = null;
          ConsoleTokenCursor cursor = null;
          RuntimeException failureForContext = null;
          StringBuilder errorContext = null;
          String sourceDescription = null;
          Throwable caughtFailure = null;
          ConsoleParseException parseFailure = null;
          ConsoleEvaluationException evaluationFailure = null;
          RuntimeException failure = null;
          ClientUiComponent submittedLine = null;
          try {
            try {
              if (false) throw (ConsoleParseException) null;
              tokenDeque = gu.tokenizeConsole(false, source);
              if (!executeExpression) {
                return true;
              }
              cursor = new ConsoleTokenCursor(tokenDeque);
              expression = fk.parseConsoleExpression(cursor, -39);
              if (!cursor.isAtEnd(124)) {
                throw new ConsoleParseException(cursor.readToken((byte) 13).sourceOffset);
              }
              this.printValue(expression.evaluate(1, this.commands), -58);
              return true;
            } catch (ConsoleParseException caughtParseFailure) {
              caughtFailure = caughtParseFailure;
              parseFailure = (ConsoleParseException) (Object) caughtFailure;
              source = "<col=55ff55>" + source.substring(0, parseFailure.sourceOffset) + "</col>" + source.substring(parseFailure.sourceOffset);
              submittedLine = (ClientUiComponent) (this.outputScroll.content.children.last((byte) -98));
              submittedLine.text = this.prompt + source;
              return false;
            } catch (ConsoleEvaluationException caughtEvaluationFailure) {
              caughtFailure = caughtEvaluationFailure;
              evaluationFailure = (ConsoleEvaluationException) (Object) caughtFailure;
              this.printText(-1, evaluationFailure.diagnostic);
              return false;
            }
          } catch (java.lang.RuntimeException caughtParameter) {
            caughtFailure = caughtParameter;
            failure = (RuntimeException) (Object) caughtFailure;
            failureForContext = failure;
            errorContext = new StringBuilder().append("ij.D(");
            if (source == null) {
              sourceDescription = "null";
            } else {
              sourceDescription = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(sourceDescription).append(',').append(executeExpression).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
        }
    }

    public static void c(int param0) {
        try {
          int var1_int = 10 % ((55 - param0) / 54);
          field_A = null;
          field_v = null;
          field_B = null;
          field_u = null;
          field_w = null;
          field_C = null;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ij.W(" + param0 + ')');
        }
    }

    static {
        field_C = "Model Viewer";
        field_A = "Click a unit's base to select it";
        field_B = "The King Black Dragon is already available.";
        field_y = 0;
        field_v = "Group";
        field_u = "Report abuse";
        field_x = 480;
    }
}
