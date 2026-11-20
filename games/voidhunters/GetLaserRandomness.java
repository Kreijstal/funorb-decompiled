/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetLaserRandomness extends ConsoleCommand {
    static String field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard < -119) {
            stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(74, 79));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("bo.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_o = null;
        if (param0 != -26081) {
          GetLaserRandomness.clearSharedReferences(-127);
        }
    }

    final static void a(byte param0, SerializableGameState param1) {
        try {
          UiViewport.serializedStateBuffer.position = 0;
          UiViewport.serializedStateBuffer.beginBitWrite(-77);
          param1.writeState(UiViewport.serializedStateBuffer, -117);
          UiViewport.serializedStateBuffer.endBitWrite(32712);
          int var2_int = 1 % ((param0 - 38) / 57);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "bo.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    GetLaserRandomness(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = "Status";
    }
}
