/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetSelfDestructTimer extends ConsoleCommand {
    static String field_o;

    public static void clearSharedReferences(int param0) {
        field_o = null;
        if (param0 != 225) {
          int[] var2 = (int[]) null;
          GetSelfDestructTimer.readServerPacket(52, (int[]) null);
        }
    }

    GetSelfDestructTimer(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean readServerPacket(int param0, int[] param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        DelayedPacket var4_ref_c = null;
        int var4 = 0;
        DelayedPacket var5 = null;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        try {
          if (TextureCombineMappings.field_c != GetOndamageParticleSpeed.field_o) {
            return false;
          }
          var2_long = MonotonicMillisClock.currentTimeMillis(false);
          if (param0 != PanelHeightQuery.incomingLagMillis &&
            SetAutoDetail.field_p < 0) {
            var4_ref_c = (DelayedPacket) (GetSpinningBladeAimarc.delayedIncomingPackets.first(param0 + 0));
            if (var4_ref_c != null &&
              var4_ref_c.releaseTimeMillis < var2_long) {
              var4_ref_c.unlink(-3846);
              PartitioningManagerFactory.field_a = var4_ref_c.payload.length;
              qga.field_b.position = 0;
              for (var5_int = 0; var5_int < PartitioningManagerFactory.field_a; var5_int++) {
                qga.field_b.payload[var5_int] = var4_ref_c.payload[var5_int];
              }
              iq.field_a = SetMissionResnetResourceTickTime.field_o;
              SetMissionResnetResourceTickTime.field_o = SetSalvoRepairTimeMultiplier.field_r;
              SetSalvoRepairTimeMultiplier.field_r = NetworkMessageState.incomingOpcode;
              NetworkMessageState.incomingOpcode = var4_ref_c.opcodeOrLength;
              return true;
            }
          }
          while (true) {
            if (0 > SetAutoDetail.field_p) {
              qga.field_b.position = 0;
              if (!ShipBlueprint.a(1, 30000)) {
                return false;
              }
              SetAutoDetail.field_p = qga.field_b.readIsaacByte(255);
              qga.field_b.position = 0;
              PartitioningManagerFactory.field_a = param1[SetAutoDetail.field_p];
            }
            if (!PlayerJoinFactory.b((byte) 51)) {
              return false;
            }
            if (PanelHeightQuery.incomingLagMillis == 0) {
              iq.field_a = SetMissionResnetResourceTickTime.field_o;
              SetMissionResnetResourceTickTime.field_o = SetSalvoRepairTimeMultiplier.field_r;
              SetSalvoRepairTimeMultiplier.field_r = NetworkMessageState.incomingOpcode;
              NetworkMessageState.incomingOpcode = SetAutoDetail.field_p;
              SetAutoDetail.field_p = -1;
              return true;
            }
            var4 = PanelHeightQuery.incomingLagMillis;
            if (AsteroidField.incomingLagStdDevMillis != 0.0) {
              var4 = (int)((double)var4 + CountermeasureLauncherWeaponDefinition.field_b.nextGaussian() * AsteroidField.incomingLagStdDevMillis);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new DelayedPacket((long)var4 + var2_long, SetAutoDetail.field_p, new byte[PartitioningManagerFactory.field_a]);
            for (var6 = 0; var6 < PartitioningManagerFactory.field_a; var6++) {
              var5.payload[var6] = qga.field_b.payload[var6];
            }
            GetSpinningBladeAimarc.delayedIncomingPackets.addLast(param0 ^ -10258, var5);
            SetAutoDetail.field_p = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_36_0 = var2;
          stackIn_36_1 = new StringBuilder().append("rhb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

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
            stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(225, 79));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("rhb.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_o = "Real-life threats";
    }
}
