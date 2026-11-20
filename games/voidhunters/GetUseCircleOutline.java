/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetUseCircleOutline extends ConsoleCommand {
    static GameStateFactory field_o;
    static int field_p;
    static volatile int keyboardIdleTicks;

    final static void initializeAccountUi(boolean param0, ResourceArchive param1, ResourceArchive param2, ResourceArchive param3, boolean param4) {
        try {
          GetBombletSprayPushMultiplier.emailAvailabilityCheck = EmailAvailabilityCheckFactory.create("", (byte) 110);
          GetBombletSprayPushMultiplier.emailAvailabilityCheck.complete(7861, param4);
          SetOndamageParticleFadestart.a(param3, param2, param1, 0);
          SetMutatorVotes.initializeLoginUi(121);
          SetCountermeasureLauncherAimspeed.field_r = ToolkitRasterStateStack.idleAccountRequest;
          SetShipTeamAction.field_b = ToolkitRasterStateStack.idleAccountRequest;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "baa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    GetUseCircleOutline(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue[] var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            var4 = (ConsoleValue[]) null;
            this.execute((ConsoleValue[]) null, 42);
          }
          stackIn_3_0 = new ConsoleValue(GetReadyRoomMutatorTime.field_p);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("baa.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_o = null;
        if (param0 != -47) {
          ResourceArchive var2 = (ResourceArchive) null;
          GetUseCircleOutline.initializeAccountUi(true, (ResourceArchive) null, (ResourceArchive) null, (ResourceArchive) null, false);
        }
    }

    static {
        field_o = (GameStateFactory) ((Object) new TeamNodeConditionFactory());
        field_p = 27;
        keyboardIdleTicks = 0;
    }
}
