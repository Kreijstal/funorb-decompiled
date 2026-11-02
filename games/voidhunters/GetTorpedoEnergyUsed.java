/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetTorpedoEnergyUsed extends ConsoleCommand {
    GetTorpedoEnergyUsed(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = VoidHunters.field_G;
        if (param4 != -2) {
          return;
        }
        if (ob.field_j > param1) {
          if (param6 != 1) {
            is.a(param5, param2, param1, param6, 20408, param3, param0);
            return;
          }
          lob.a(param5, param2, param1, 256, param3, param0);
          return;
        }
        if (GetCountermeasureLauncherProjectiles.field_o < param5) {
          if (param6 != 1) {
            is.a(param5, param2, param1, param6, 20408, param3, param0);
            return;
          }
          lob.a(param5, param2, param1, 256, param3, param0);
          return;
        }
        if (param3 < NebulaField.field_c) {
          if (param6 != 1) {
            is.a(param5, param2, param1, param6, 20408, param3, param0);
            return;
          }
          lob.a(param5, param2, param1, 256, param3, param0);
          return;
        }
        if (param0 > hab.field_i) {
          if (param6 != 1) {
            is.a(param5, param2, param1, param6, 20408, param3, param0);
            return;
          }
          lob.a(param5, param2, param1, 256, param3, param0);
          return;
        }
        if (param6 != 1) {
          rg.a(param5, param0, param1, param2, param3, param6, 120);
          return;
        }
        nv.a(param2, 102, param3, param0, param1, param5);
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
            GetTorpedoEnergyUsed.a(-5, -124, 5, -27, -5, 31, 53);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(160, 80));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pda.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
    }
}
