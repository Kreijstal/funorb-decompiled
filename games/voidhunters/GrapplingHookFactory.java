/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GrapplingHookFactory implements GameStateFactory {
    static BitmapFont field_a;

    final static ConsoleExpressionToken parseConsoleExpression(byte param0, ConsoleTokenStream param1) throws ConsoleSyntaxException {
        ConsoleExpressionToken stackIn_9_0 = null;
        ConsoleExpressionToken stackIn_25_0 = null;
        ConsoleExpressionToken stackIn_31_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4 = 0;
        ConsoleExpressionToken var5 = null;
        ConsoleExpressionToken var6 = null;
        ConsoleExpressionToken var7 = null;
        var4 = VoidHunters.field_G;
        try {
          var5 = param1.readToken((byte) -1);
          if (param0 <= 13) {
            field_a = (BitmapFont) null;
          }
          if (dla.stringTokenType != var5.type &&
            SetMissionTerrainSpaceProbability.charTokenType != var5.type &&
            var5.type != ArchiveIndexLoader.numberTokenType &&
            io.booleanTokenType != var5.type) {
            if (SetMissionVariablesHudX.methodTokenType != var5.type) {
              throw new ConsoleSyntaxException(var5.sourceOffset);
            }
            if (param1.isAtEnd(81)) {
              throw new ConsoleSyntaxException(var5.sourceOffset);
            }
            var6 = param1.readToken((byte) -67);
            if (var6.type != ScrollableActionPanel.argumentStartTokenType) {
              throw new ConsoleSyntaxException(var6.sourceOffset);
            }
            var5.arguments = new IntrusiveDeque();
            while (true) {
              if (param1.isAtEnd(67)) {
                throw new ConsoleSyntaxException(var5.sourceOffset);
              }
              if (param1.readToken((byte) -27).type == SetMissionTerrainVotingChancestep.argumentEndTokenType) {
                stackIn_25_0 = var5;
                return stackIn_25_0;
              }
              param1.position = param1.position - 1;
              var5.arguments.addLast(-10258, GrapplingHookFactory.parseConsoleExpression((byte) 33, param1));
              if (param1.isAtEnd(35)) {
                throw new ConsoleSyntaxException(var5.sourceOffset);
              }
              var7 = param1.readToken((byte) -28);
              if (var7.type == SetMissionTerrainVotingChancestep.argumentEndTokenType) {
                stackIn_31_0 = var5;
                return stackIn_31_0;
              }
              if (var7.type != ConstantColorTextureOperation.argumentSeparatorTokenType) {
                throw new ConsoleSyntaxException(var7.sourceOffset);
              }
            }
          }
          stackIn_9_0 = var5;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_38_0 = var2;
          stackIn_38_1 = new StringBuilder().append("lhb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final static void a(byte param0, ShipComponent param1) {
        ShipComponent var4 = null;
        ShipComponent var5 = null;
        try {
          param1.attachToHardpoint(1, 7, new ShipComponent(35));
          int var2_int = -57 / ((param0 - 24) / 51);
          param1.attachToHardpoint(1, 15, new ShipComponent(35));
          param1.attachToHardpoint(1, 3, new ShipComponent(13));
          param1.attachToHardpoint(1, 11, new ShipComponent(13));
          param1.attachToHardpoint(1, 16, new ShipComponent(13));
          param1.attachToHardpoint(1, 17, new ShipComponent(13));
          param1.attachToHardpoint(1, 5, new ShipComponent(15));
          param1.attachToHardpoint(1, 9, new ShipComponent(15));
          param1.attachToHardpoint(1, 4, new ShipComponent(15));
          param1.attachToHardpoint(1, 10, new ShipComponent(15));
          var4 = new ShipComponent(33);
          var4.attachToHardpoint(1, 0, new ShipComponent(13));
          param1.attachToHardpoint(1, 1, var4);
          var5 = new ShipComponent(33);
          var5.attachToHardpoint(1, 2, new ShipComponent(13));
          param1.attachToHardpoint(1, 13, var5);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "lhb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          this.create((byte) -4);
          return (SerializableGameState[]) ((Object) new GrapplingHook[param1]);
        }
        return (SerializableGameState[]) ((Object) new GrapplingHook[param1]);
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -113 / ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new GrapplingHook());
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 > -62) {
          return;
        }
        field_a = null;
    }

    static {
    }
}
