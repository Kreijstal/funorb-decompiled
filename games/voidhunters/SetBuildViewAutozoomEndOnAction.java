/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetBuildViewAutozoomEndOnAction extends ConsoleCommand {
    static int field_o;

    SetBuildViewAutozoomEndOnAction(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void writeStatePacket(int param0, SerializableGameState param1, IsaacPacketBuffer param2, int param3) {
        int var4_int = 0;
        try {
          param2.writeIsaacByte(24335, param3);
          param2.position = param2.position + 1;
          if (param0 != 0) {
            field_o = -13;
          }
          var4_int = param2.position;
          param2.beginBitWrite(-127);
          param1.writeState(param2, -112);
          param2.endBitWrite(32712);
          param2.writeLengthByte(param2.position - var4_int, -129);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "rkb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetSniperCannonReload.field_o = arguments[0].intValue(123);
          if (obfuscationGuard >= -119) {
            field_o = 30;
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rkb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static int hitTestMenuItem(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          var3_int = 0;
          var4 = LoopingSound.field_m;
          if (param1 != 3841) {
            field_o = -93;
          }
          while (var3_int < GetWorldWidthUpshift.field_o.length) {
            var5 = GetSniperCannonProjectiles.field_o[var3_int];
            if (var5 < 0) {
              var4 = var4 + DebugMessage.field_a;
            } else {
              var6 = PendingRequest.getStringWidth(GetWorldWidthUpshift.field_o[var3_int], -118, true);
              var4 = var4 + SpawnEnemyShipOrderDefinition.field_g;
              var7 = -(var6 >> 1) + LobbyInviteSuggestionText.field_b;
              if (SetMachineGunAimarc.isPointInHalfOpenRectangle(var4, (ShipTeamCondition.field_e << 1) + var6, (SetPointDefenceLaserAimarc.field_q << 1) + SetExplosionPushMultiplier.field_o, param2, (byte) -65, -ShipTeamCondition.field_e + var7, param0)) {
                stackIn_8_0 = var5;
                return stackIn_8_0;
              }
              var4 = var4 + (SetExplosionPushMultiplier.field_o + SpawnEnemyShipOrderDefinition.field_g + (SetPointDefenceLaserAimarc.field_q << 1));
            }
            var3_int++;
          }
          stackIn_13_0 = -1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) var3), "rkb.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_o = 8;
    }
}
