/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetUseCircleOutline extends ConsoleCommand {
    static dja field_o;
    static int field_p;
    static volatile int field_q;

    final static void a(boolean param0, asb param1, asb param2, asb param3, boolean param4) {
        try {
          GetBombletSprayPushMultiplier.field_p = gi.a("", (byte) 110);
          GetBombletSprayPushMultiplier.field_p.a(7861, param4);
          SetOndamageParticleFadestart.a(param3, param2, param1, 0);
          SetMutatorVotes.e(121);
          SetCountermeasureLauncherAimspeed.field_r = kla.field_d;
          SetShipTeamAction.field_b = kla.field_d;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "baa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 != -47) {
          asb var2 = (asb) null;
          GetUseCircleOutline.a(true, (asb) null, (asb) null, (asb) null, false);
        }
    }

    static {
        field_o = (dja) ((Object) new isb());
        field_p = 27;
        field_q = 0;
    }
}
