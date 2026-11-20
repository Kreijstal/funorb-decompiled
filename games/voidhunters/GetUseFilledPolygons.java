/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetUseFilledPolygons extends ConsoleCommand {
    static String field_o;

    GetUseFilledPolygons(String param0, Class[] param1, String param2) {
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
            field_o = (String) null;
          }
          stackIn_3_0 = new ConsoleValue(SetVariableActionFactory.field_c);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lba.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_o = null;
        if (param0 != 49) {
          field_o = (String) null;
        }
    }

    final static void a(int param0) {
        RemoveEventActionFactory.field_b = false;
        OpenGlSprite.reconnecting = false;
        GetSelfDestructPrepareToggleCooldown.setAccountUiResult(-86, param0);
        SetShipTeamAction.field_b = ToolkitRasterStateStack.idleAccountRequest;
        SetCountermeasureLauncherAimspeed.field_r = ToolkitRasterStateStack.idleAccountRequest;
    }

    static {
        field_o = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
