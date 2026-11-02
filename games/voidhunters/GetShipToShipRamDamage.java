/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetShipToShipRamDamage extends ConsoleCommand {
    static llb field_q;
    static int field_o;
    static String field_p;

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param0 != 11) {
          return;
        }
        if (param5 == param1) {
          fl.a(param6, param7, param2, param5, param0 + 1512, param4, param3);
          return;
        }
        if (ob.field_j > -param5 + param6) {
          SetOndamageParticleSpeed.a(2051507073, param4, param7, param3, param2, param5, param6, param1);
          return;
        }
        if (param6 + param5 > GetCountermeasureLauncherProjectiles.field_o) {
          SetOndamageParticleSpeed.a(2051507073, param4, param7, param3, param2, param5, param6, param1);
          return;
        }
        if (-param1 + param7 < NebulaField.field_c) {
          SetOndamageParticleSpeed.a(2051507073, param4, param7, param3, param2, param5, param6, param1);
          return;
        }
        if (hab.field_i >= param1 + param7) {
          GetBots.a(param2, param1, param5, param7, param6, param3, param4, 21601);
          return;
        }
        SetOndamageParticleSpeed.a(2051507073, param4, param7, param3, param2, param5, param6, param1);
    }

    GetShipToShipRamDamage(String param0, Class[] param1, String param2) {
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
          if (obfuscationGuard >= -119) {
            field_q = (llb) null;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(3, 77));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("nt.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_q = null;
        if (param0 != 2) {
          field_p = (String) null;
          field_p = null;
          return;
        }
        field_p = null;
    }

    static {
        field_o = 2;
        field_p = "Try again";
    }
}
