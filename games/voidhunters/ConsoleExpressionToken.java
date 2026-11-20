/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConsoleExpressionToken extends IntrusiveNode {
    String lexeme;
    int type;
    static int field_h;
    int sourceOffset;
    IntrusiveDeque arguments;

    public final String toString() {
        if (this.type == SetMissionVariablesHudX.methodTokenType) {
          return "Method{" + this.lexeme + "}";
        }
        if (ArchiveIndexLoader.numberTokenType == this.type) {
          return "Number{" + this.lexeme + "}";
        }
        if (GradientBorderTextStyle.booleanTokenType == this.type) {
          return "Boolean{" + this.lexeme + "}";
        }
        if (this.type == SetMissionTerrainSpaceProbability.charTokenType) {
          return "Char{" + this.lexeme + "}";
        }
        if (MenuBackgroundBattle.stringTokenType == this.type) {
          return "String{" + this.lexeme + "}";
        }
        if (this.type == ScrollableActionPanel.argumentStartTokenType) {
          return "ArgStart";
        }
        if (SetMissionTerrainVotingChancestep.argumentEndTokenType == this.type) {
          return "ArgEnd";
        }
        if (ConstantColorTextureOperation.argumentSeparatorTokenType != this.type) {
          return "Unknown";
        }
        return "ArgComma";
    }

    final ConsoleValue evaluate(byte param0, ConsoleCommand[] param1) throws ConsoleEvaluationException, ConsoleSyntaxException {
        int incrementValue$0 = 0;
        ConsoleValue stackIn_3_0 = null;
        ConsoleValue stackIn_10_0 = null;
        ConsoleValue stackIn_16_0 = null;
        ConsoleValue stackIn_19_0 = null;
        ConsoleValue stackIn_23_0 = null;
        ConsoleValue stackIn_25_0 = null;
        ConsoleValue stackIn_29_0 = null;
        ConsoleValue stackIn_35_0 = null;
        ConsoleValue stackIn_39_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        NumberFormatException var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ConsoleExpressionToken var5 = null;
        int var6 = 0;
        ConsoleValue[] var7 = null;
        ConsoleValue[] var8 = null;
        String var9 = null;
        var6 = VoidHunters.field_G;
        try {
          if (param0 <= 60) {
            stackIn_3_0 = (ConsoleValue) null;
            return stackIn_3_0;
          }
          try {
            if (this.type == SetMissionVariablesHudX.methodTokenType) {
              var7 = new ConsoleValue[this.arguments.size(3)];
              var8 = var7;
              var4 = 0;
              var5 = (ConsoleExpressionToken) (this.arguments.first(0));
              while (var5 != null) {
                incrementValue$0 = var4;
                var4++;
                var7[incrementValue$0] = var5.evaluate((byte) 96, param1);
                var5 = (ConsoleExpressionToken) (this.arguments.next((byte) 69));
              }
              stackIn_10_0 = MessageFactory.executeConsoleCommand(this.lexeme, var8, param1, (byte) -124);
              return stackIn_10_0;
            }
            if (this.type == ArchiveIndexLoader.numberTokenType) {
              var3_int = Character.toLowerCase(this.lexeme.charAt(this.lexeme.length() - 1));
              if (var3_int == 102) {
                stackIn_16_0 = new ConsoleValue(Float.valueOf(this.lexeme).floatValue());
                return stackIn_16_0;
              }
              if (var3_int == 108) {
                stackIn_19_0 = new ConsoleValue(Long.parseLong(this.lexeme.substring(0, -1 + this.lexeme.length())));
                return stackIn_19_0;
              }
              if (-1 != this.lexeme.indexOf('.')) {
                stackIn_23_0 = new ConsoleValue(Double.valueOf(this.lexeme).doubleValue());
                return stackIn_23_0;
              }
              stackIn_25_0 = new ConsoleValue(Integer.parseInt(this.lexeme));
              return stackIn_25_0;
            }
            if (GradientBorderTextStyle.booleanTokenType == this.type) {
              stackIn_29_0 = new ConsoleValue(this.lexeme.equals("true"));
              return stackIn_29_0;
            }
            if (this.type == SetMissionTerrainSpaceProbability.charTokenType) {
              var9 = this.lexeme.substring(1, this.lexeme.length() - 1);
              if (var9.length() != 1) {
                throw new ConsoleEvaluationException("Invalid char value: " + var9);
              }
              stackIn_35_0 = new ConsoleValue(var9.charAt(0));
              return stackIn_35_0;
            }
            if (MenuBackgroundBattle.stringTokenType == this.type) {
              stackIn_39_0 = new ConsoleValue(this.lexeme.substring(1, this.lexeme.length() - 1));
              return stackIn_39_0;
            }
          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (NumberFormatException) (Object) decompiledCaughtException;
            throw new ConsoleEvaluationException("NumberFormatException on: " + this.lexeme);
          }
          throw new IllegalArgumentException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_45_0 = var3_ref;
          stackIn_45_1 = new StringBuilder().append("tsa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    ConsoleExpressionToken(int param0, int param1, String param2) {
        try {
          this.lexeme = param2;
          this.type = param0;
          this.sourceOffset = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "tsa.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ConsoleExpressionToken(int param0, int param1) {
        this(param0, param1, (String) null);
    }

    static {
        field_h = -1;
    }
}
