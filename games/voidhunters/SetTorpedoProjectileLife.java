/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetTorpedoProjectileLife extends ConsoleCommand {
    static String field_p;
    static BitmapFont field_o;

    final static void a(int param0) {
        MissionList var1 = null;
        IsaacPacketBuffer var2 = null;
        MissionList var1Lifetime1;
        IsaacPacketBuffer var2Lifetime1;
        if (param0 > -20) {
          SetTorpedoProjectileLife.clearSharedReferences((byte) 50);
          if (!SetMissionTerrainAsteroidProbability.field_o) {
            return;
          }
          var1 = SetDebrisPartitioned.b(false);
          var2 = new IsaacPacketBuffer(1048576);
          var2.beginBitWrite(-122);
          var1.writeState(var2, -110);
          var2.endBitWrite(32712);
          ResourceArchive.writeDevelopmentLevelFile(var2.position, "missions.dat", var2.payload, -107, "");
          GetDebrisThrowable.a(false, "Saved out mission list");
          return;
        }
        if (!SetMissionTerrainAsteroidProbability.field_o) {
          return;
        }
        var1Lifetime1 = SetDebrisPartitioned.b(false);
        var2Lifetime1 = new IsaacPacketBuffer(1048576);
        var2Lifetime1.beginBitWrite(-122);
        var1Lifetime1.writeState(var2Lifetime1, -110);
        var2Lifetime1.endBitWrite(32712);
        ResourceArchive.writeDevelopmentLevelFile(var2Lifetime1.position, "missions.dat", var2Lifetime1.payload, -107, "");
        GetDebrisThrowable.a(false, "Saved out mission list");
    }

    SetTorpedoProjectileLife(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 < 100) {
          return;
        }
        field_p = null;
        field_o = null;
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
            SetTorpedoProjectileLife.clearSharedReferences((byte) 42);
          }
          SetMachineGunEnergyUsed.a(91, 62, arguments[0].intValue(107));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("web.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_p = "Try changing the '<%0>' setting.";
    }
}
