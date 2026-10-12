/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConsoleExpression extends IntrusiveNode {
    static int field_m;
    static String field_t;
    NodeDeque arguments;
    int kind;
    static int[] field_p;
    static String field_l;
    String text;
    static String field_n;
    static String field_r;
    static String field_u;
    int sourceOffset;

    ConsoleExpression(int kind, int sourceOffset) {
        this(kind, sourceOffset, (String) null);
    }

    final static void updateQuickChatHelp(int obfuscationGuard, boolean unusedFlag) {
        if (Spell.quickChatHelpDialog == null) {
          if (obfuscationGuard != 16756) {
            ConsoleExpression.updateQuickChatHelp(-87, true);
            return;
          }
          return;
        }
        if (!Spell.quickChatHelpDialog.pollClose((byte) 102, unusedFlag)) {
          if (obfuscationGuard != 16756) {
            ConsoleExpression.updateQuickChatHelp(-87, true);
            return;
          }
          return;
        }
        Spell.quickChatHelpDialog = null;
        if (obfuscationGuard == 16756) {
          return;
        }
        ConsoleExpression.updateQuickChatHelp(-87, true);
    }

    public final String toString() {
        if (this.kind == rn.consoleCallKind) {
          return "Method{" + this.text + "}";
        }
        if (PrintVictoryConditionsConsoleCommand.consoleNumberKind == this.kind) {
          return "Number{" + this.text + "}";
        }
        if (EquipmentBattleTutorial.consoleBooleanKind == this.kind) {
          return "Boolean{" + this.text + "}";
        }
        if (this.kind == hf.consoleCharacterKind) {
          return "Char{" + this.text + "}";
        }
        if (this.kind == BattleTutorial.consoleStringKind) {
          return "String{" + this.text + "}";
        }
        if (ChatMessage.consoleArgumentStartKind == this.kind) {
          return "ArgStart";
        }
        if (LeaderEscortCondition.consoleArgumentEndKind == this.kind) {
          return "ArgEnd";
        }
        if (this.kind == sb.consoleArgumentCommaKind) {
          return "ArgComma";
        }
        return "Unknown";
    }

    final static void openPrivateQuickChat(long accountId, int obfuscationGuard, String recipientName) {
        CharSequence var5 = null;
        try {
          qd.chatRecipientName = recipientName;
          rs.outgoingChatChannel = 2;
          var5 = (CharSequence) ((Object) recipientName);
          wm.chatRecipientNameKey = AccountNameNormalizer.normalize(var5, false);
          dj.chatRecipientAccountId = accountId;
          TrianglePulse.openDefaultQuickChatMenu((byte) 118);
          if (obfuscationGuard != 1) {
            field_r = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "og.D(" + accountId + ',' + obfuscationGuard + ',' + (recipientName != null ? "{...}" : "null") + ')');
        }
    }

    final ConsoleValue evaluate(int obfuscationGuard, ConsoleCommand[] commands) throws ConsoleEvaluationException, ConsoleParseException {
        int argumentSlot = 0;
        ConsoleValue callResult = null;
        ConsoleValue floatValue = null;
        ConsoleValue longValue = null;
        ConsoleValue doubleValue = null;
        ConsoleValue integerValue = null;
        ConsoleValue booleanValue = null;
        ConsoleValue characterValue = null;
        ConsoleValue stringValue = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String commandsDescription = null;
        Throwable caughtFailure = null;
        int numericSuffix = 0;
        NumberFormatException numberFailure = null;
        RuntimeException failure = null;
        int argumentIndex = 0;
        ConsoleExpression argument = null;
        int obfuscationControl = 0;
        ConsoleValue[] argumentValues = null;
        ConsoleValue[] argumentValuesAlias = null;
        String characterText = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          try {
            if (obfuscationGuard != 1) {
              ConsoleExpression.updateQuickChatHelp(64, true);
            }
            if (this.kind == rn.consoleCallKind) {
              argumentValues = new ConsoleValue[this.arguments.size(false)];
              argumentValuesAlias = argumentValues;
              argumentIndex = 0;
              argument = (ConsoleExpression) (this.arguments.first((byte) 106));
              while (argument != null) {
                argumentSlot = argumentIndex;
                argumentIndex++;
                argumentValues[argumentSlot] = argument.evaluate(1, commands);
                argument = (ConsoleExpression) (this.arguments.next((byte) 123));
              }
              callResult = na.invokeConsoleCommand(commands, (byte) 2, argumentValuesAlias, this.text);
              return callResult;
            }
            if (this.kind == PrintVictoryConditionsConsoleCommand.consoleNumberKind) {
              numericSuffix = Character.toLowerCase(this.text.charAt(-1 + this.text.length()));
              if (102 == numericSuffix) {
                floatValue = new ConsoleValue(Float.valueOf(this.text).floatValue());
                return floatValue;
              }
              if (numericSuffix == 108) {
                longValue = new ConsoleValue(Long.parseLong(this.text.substring(0, this.text.length() - 1)));
                return longValue;
              }
              if (this.text.indexOf('.') != -1) {
                doubleValue = new ConsoleValue(Double.valueOf(this.text).doubleValue());
                return doubleValue;
              }
              integerValue = new ConsoleValue(Integer.parseInt(this.text));
              return integerValue;
            }
            if (EquipmentBattleTutorial.consoleBooleanKind == this.kind) {
              booleanValue = new ConsoleValue(this.text.equals("true"));
              return booleanValue;
            }
            if (hf.consoleCharacterKind == this.kind) {
              characterText = this.text.substring(1, -1 + this.text.length());
              if (characterText.length() != 1) {
                throw new ConsoleEvaluationException("Invalid char value: " + characterText);
              }
              characterValue = new ConsoleValue(characterText.charAt(0));
              return characterValue;
            }
            if (BattleTutorial.consoleStringKind == this.kind) {
              stringValue = new ConsoleValue(this.text.substring(1, this.text.length() - 1));
              return stringValue;
            }
          } catch (java.lang.NumberFormatException caughtNumberFailure) {
            caughtFailure = caughtNumberFailure;
            numberFailure = (NumberFormatException) (Object) caughtFailure;
            throw new ConsoleEvaluationException("NumberFormatException on: " + this.text);
          }
          throw new IllegalArgumentException();
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = (RuntimeException) (Object) caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("og.B(").append(obfuscationGuard).append(',');
          if (commands == null) {
            commandsDescription = "null";
          } else {
            commandsDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(commandsDescription).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        field_p = null;
        field_l = null;
        field_r = null;
        if (!param0) {
          return;
        }
        field_t = null;
        field_u = null;
    }

    ConsoleExpression(int kind, int sourceOffset, String text) {
        try {
          this.kind = kind;
          this.text = text;
          this.sourceOffset = sourceOffset;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "og.<init>(" + kind + ',' + sourceOffset + ',' + (text != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = "Most Mana spent";
        field_n = "Tower";
        field_l = "Missions completed: <%0> of <%1>";
        field_r = "(Leader)";
        field_u = "Campaign Selection";
    }
}
