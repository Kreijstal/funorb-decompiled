/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bi {
    static ResourceArchive field_f;
    static String field_d;
    java.awt.Image field_h;
    static String field_c;
    int[] field_b;
    int field_a;
    static String field_e;
    int field_g;

    abstract void a(int param0, java.awt.Graphics param1, int param2, int param3);

    abstract void a(int param0, int param1, java.awt.Component param2, int param3);

    final static ConsoleExpression readBareConsoleToken(byte obfuscationGuard, TextCursor cursor) {
        int rewoundPosition = 0;
        StringBuilder characterAppendResult = null;
        int sourceOffset = 0;
        StringBuilder tokenBuilder = null;
        int character = 0;
        String text = null;
        int obfuscationControl = 0;
        ConsoleExpression tokenResult = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String cursorDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        int kind;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          rewoundPosition = cursor.position - 1;
          cursor.position = cursor.position - 1;
          sourceOffset = rewoundPosition;
          tokenBuilder = new StringBuilder();
          while (!cursor.isAtEnd((byte) 16)) {
            character = cursor.readCharacter(-1);
            if (!Character.isWhitespace((char) character) &&
              character != 44 &&
              character != 40 &&
              character != 41) {
              characterAppendResult = tokenBuilder.append((char) character);
              continue;
            }
            cursor.position = cursor.position - 1;
            break;
          }
          if (obfuscationGuard >= -106) {
            field_c = (String) null;
          }
          text = tokenBuilder.toString();
          if (!text.equals("true") &&
            !text.equals("false")) {
            if (text.charAt(0) != 45 &&
              !Character.isDigit(text.charAt(0))) {
              kind = rn.consoleCallKind;
            } else {
              kind = PrintVictoryConditionsConsoleCommand.consoleNumberKind;
            }
          } else {
            kind = EquipmentBattleTutorial.consoleBooleanKind;
          }
          tokenResult = new ConsoleExpression(kind, sourceOffset, text);
          return tokenResult;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("bi.J(").append(obfuscationGuard).append(',');
          if (cursor == null) {
            cursorDescription = "null";
          } else {
            cursorDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(cursorDescription).append(')').toString());
        }
    }

    final void a(int param0) {
        if (param0 == 5605) {
          SoftwareRaster.setTarget(this.field_b, this.field_a, this.field_g);
          return;
        }
        field_f = (ResourceArchive) null;
        SoftwareRaster.setTarget(this.field_b, this.field_a, this.field_g);
    }

    public static void b(int param0) {
        field_e = null;
        field_d = null;
        field_c = null;
        field_f = null;
        if (param0 != 0) {
          field_c = (String) null;
        }
    }

    final static boolean a(char param0, int param1) {
        boolean stackIn_28_0 = false;
        boolean stackIn_50_0 = false;
        boolean stackIn_64_0 = false;
        if (param1 != -31000) {
          field_e = (String) null;
          if (param0 < 48) {
            if (param0 >= 65 &&
              param0 <= 90) {
              return true;
            }
            if (param0 < 97) {
              return false;
            }
            if (param0 > 122) {
              return false;
            }
            return true;
          }
          if (param0 <= 57) {
            return true;
          }
          if (param0 < 65) {
            if (param0 < 97) {
              return false;
            }
            if (param0 <= 122) {
              return true;
            }
            return false;
          }
          if (param0 <= 90) {
            return true;
          }
          stackIn_28_0 = (param0 >= 97) && (param0 <= 122);
          return stackIn_28_0;
        }
        if (param0 < 48) {
          if (param0 < 65) {
            if (param0 < 97) {
              return false;
            }
            if (param0 > 122) {
              return false;
            }
            return true;
          }
          if (param0 <= 90) {
            return true;
          }
          stackIn_64_0 = (param0 >= 97) && (param0 <= 122);
          return stackIn_64_0;
        }
        if (param0 <= 57) {
          return true;
        }
        if (param0 < 65) {
          if (param0 < 97) {
            return false;
          }
          if (param0 > 122) {
            return false;
          }
          return true;
        }
        if (param0 <= 90) {
          return true;
        }
        stackIn_50_0 = (param0 >= 97) && (param0 <= 122);
        return stackIn_50_0;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0) {
          return;
        }
        if (0 > param4) {
          return;
        }
        if (0 > param5) {
          return;
        }
        if (ResourceRequest.field_y <= param4) {
          return;
        }
        if (!(ConsoleParseException.field_c > param5)) {
          return;
        }
        int var6 = param4 + param5 * ResourceRequest.field_y;
        int var7 = RegionAnchor.a(16711680, param5, var6, param4);
        int var8 = 255 - (var7 >>> 24 & 220487423);
        var7 = var7 & 16777215;
        QuickChatMenu.a(param2, var7, var6, param4, param1, var8, -116, param5);
        ValidationStatusWidget.a(param1, param5, param4, var6, var7, -29403, var8, param2);
        if (param3 > 71) {
          if (Unit.field_L) {
            ChannelBaseVolumeConsoleCommand.field_I.g(param2, param1);
          }
          return;
        }
    }

    static {
        field_d = "Playing";
        field_c = "Armies of Gielinor Members' Expansion";
        field_e = "To play through the single-player campaigns, please log in or create a free account.";
    }
}
