/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetTestActionLag extends ConsoleCommand {
    static int field_o;

    SetTestActionLag(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            field_o = 74;
          }
          TestActionLagSetting.actionLag = arguments[0].intValue(92);
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tmb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static int calculateGameStateChecksum(SerializableGameState param0, byte param1) {
        RuntimeException var2 = null;
        SerializableGameState var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          UiViewport.serializedStateBuffer.position = 0;
          if (param1 >= -5) {
            var3 = (SerializableGameState) null;
            SetTestActionLag.calculateGameStateChecksum((SerializableGameState) null, (byte) 16);
          }
          UiViewport.serializedStateBuffer.beginBitWrite(-81);
          if (!(param0 instanceof CompactGameState)) {
            param0.writeState(UiViewport.serializedStateBuffer, -111);
          } else {
            ((CompactGameState) ((Object) param0)).writeCompactState(UiViewport.serializedStateBuffer, (byte) -116);
          }
          UiViewport.serializedStateBuffer.endBitWrite(32712);
          stackIn_6_0 = EmailAvailabilityChecks.crc32(UiViewport.serializedStateBuffer.payload, UiViewport.serializedStateBuffer.position, 0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("tmb.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        ServerInfoFactory discarded$0 = new ServerInfoFactory();
        field_o = -1;
    }
}
