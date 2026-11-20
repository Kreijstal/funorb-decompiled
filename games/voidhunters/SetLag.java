/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetLag extends ConsoleCommand {
    static int field_o;

    final static void setMenuCarouselTickRate(int param0, int param1) {
        SetMachineGunEnergyUsed.field_s = param1 * 400 / 150;
        SetMachineGunEnergyUsed.field_p = param1 * 100 / 150;
        int var2 = 98 / ((1 - param0) / 62);
        SetMachineGunEnergyUsed.field_r = (param1 << 16) / 150;
    }

    final static void configureCarouselProtocol(boolean param0, int param1, int param2, int param3, GameStateFactory param4, int param5, GameStateFactory param6, int param7, int param8, int param9, int param10, int param11, GameStateFactory param12, int param13, byte param14) {
        try {
          GetAngleset.field_o = param11;
          LruNodeCache.field_g = param8;
          if (param14 != 91) {
            field_o = 34;
          }
          GetSniperCannonFiringLeeway.field_o = param10;
          SecondaryNodeHashTable.field_d = param13;
          OpenGlPostProcessor.field_v = param9;
          GetMissionTimeLimit.field_o = param1;
          IntrusiveDequeIterator.field_a = param6;
          GetLoadingMissions.field_q = param4;
          PrintSettings.field_o = param3;
          SetPointDefenceLaserProjectileDamage.field_o = param0 ? true : false;
          ConsoleEvaluationException.field_a = param12;
          PanelWidthQuery.field_e = param5;
          GetSniperCannonAimarc.field_o = param2;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ogb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + (param12 != null ? "{...}" : "null") + ',' + param13 + ',' + param14 + ')');
        }
    }

    SetLag(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void handleIntegerRecordReply(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        IntegerArrayReadRequest var4 = null;
        int var4_int = 0;
        int var5 = 0;
        IntegerRecordWriteRequest var5_ref_ik = null;
        int[] var6 = null;
        int var8 = 0;
        IsaacPacketBuffer var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = VoidHunters.field_G;
        try {
          boolean decompiledFrameRemainder0 = true;
          var9 = AccountNameAvailabilityReplies.field_b;
          var2 = var9.readUnsignedByte((byte) -117);
          var3 = var9.readUnsignedByte((byte) -94);
          if (0 == var2) {
            var4 = (IntegerArrayReadRequest) (SetDebugLineLife.pendingIntegerArrayReads.first(param0 ^ -8999));
            if (var4 == null) {
              FighterBayWeaponDefinition.closeGameConnection(-128);
              return;
            }
            var5 = -var9.position + PartitioningManagerFactory.field_a;
            var11 = var4.values;
            var10 = var11;
            var6 = var10;
            if (var5 > var11.length << 2) {
              var5 = var11.length << 2;
            }
            for (var7 = 0; var5 > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.readUnsignedByte((byte) -92) << (MenuBackgroundBattle.andBits(3, var7) << 8));
            }
            var4.unlink(-3846);
          } else {
            if (var2 == 1) {
              var4_int = var9.readSignedSmart(0);
              var5_ref_ik = (IntegerRecordWriteRequest) (SetSalvoHoldable.pendingIntegerRecordWrites.first(0));
              while (var5_ref_ik != null) {
                if (var5_ref_ik.recordType != var3 ||
                  var4_int != var5_ref_ik.recordId) {
                  var5_ref_ik = (IntegerRecordWriteRequest) (SetSalvoHoldable.pendingIntegerRecordWrites.next((byte) 11));
                  continue;
                }
                break;
              }
              if (var5_ref_ik == null) {
                FighterBayWeaponDefinition.closeGameConnection(-121);
                return;
              }
              var5_ref_ik.unlink(param0 ^ 11299);
              decompiledFrameRemainder0 = false;
            }
            else {
              FractalNoiseVolumeGenerator.reportClientError((Throwable) null, "LR1: " + SetCountermeasuresPulsetime.formatIncomingPacketDebug(-13514), 0);
              FighterBayWeaponDefinition.closeGameConnection(-116);
            }
          }
          if (param0 == -8999) {
            return;
          }
          field_o = 127;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) var1), "ogb.D(" + param0 + ')');
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
          SettingsInstance.configureSimulatedLag(arguments[3].intValue(55), false, arguments[2].intValue(84), arguments[1].intValue(115), arguments[0].intValue(88));
          if (obfuscationGuard < -119) {
            stackIn_4_0 = new ConsoleValue("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ogb.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_o = 0;
    }
}
