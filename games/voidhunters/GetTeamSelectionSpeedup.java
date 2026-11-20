/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetTeamSelectionSpeedup extends ConsoleCommand {
    static int field_p;
    static Sprite field_o;

    public static void clearSharedReferences(int param0) {
        field_o = null;
        if (param0 != 3575) {
          GetTeamSelectionSpeedup.a(-8);
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
          if (obfuscationGuard > -119) {
            field_o = (Sprite) null;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.getSettingValueText(4, 94));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ie.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetTeamSelectionSpeedup(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        int stackIn_12_0 = 0;
        LobbyPlayerEntry stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        LobbyPlayerEntry stackIn_84_0 = null;
        boolean stackIn_85_1 = false;
        RuntimeException decompiledCaughtException = null;
        IsaacPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        LobbyPlayerEntry var3_ref_jk = null;
        int var4 = 0;
        LobbyGameEntry var4_ref_mm = null;
        int var5 = 0;
        LobbyGameEntry var6 = null;
        LobbyPlayerEntry var7 = null;
        int var8 = 0;
        LobbyPlayerEntry var8_ref_jk = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        LobbyPlayerEntry var12 = null;
        LobbyGameEntry var13 = null;
        LobbyGameEntry var14 = null;
        LobbyGameEntry var15 = null;
        Object var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        LobbyPlayerEntry var20 = null;
        Object var21 = null;
        LobbyPlayerEntry var22 = null;
        LobbyPlayerEntry var23 = null;
        LobbyPlayerEntry var24 = null;
        String var25 = null;
        String var26 = null;
        Object var27 = null;
        LobbyGameEntry var27_ref = null;
        LobbyGameEntry var28 = null;
        LobbyPlayerEntry var29 = null;
        LobbyGameEntry var30 = null;
        LobbyPlayerEntry var31 = null;
        LobbyPlayerEntry var3_ref_jkLifetime1;
        long var3_longLifetime1;
        long var3_longLifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime4;
        int var3Lifetime5;
        int var3Lifetime6;
        long var3_longLifetime2Lifetime1;
        int var5Lifetime1Lifetime1;
        var21 = null;
        var27 = null;
        var16 = null;
        var11 = VoidHunters.field_G;
        try {
          var1 = AccountNameAvailabilityReplies.field_b;
          if (param0 != 13) {
            return;
          }
          var2 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -114);
          if (var2 != 0 &&
            var2 != 1 &&
            var2 != 2 &&
            var2 != 3 &&
            4 != var2) {
            if (var2 == 5) {
              var3_long = ((PacketBuffer) ((Object) var1)).readLong(param0 + 242);
              var18 = ((PacketBuffer) ((Object) var1)).readString(-1);
              var17 = ((PacketBuffer) ((Object) var1)).readString(-1);
              var19 = ((PacketBuffer) ((Object) var1)).readString(-1);
              var20 = SetPhasedEnergyBeamAimarc.findLobbyPlayer((byte) 80, var3_long);
              var8_ref_jk = var20;
              stackIn_12_0 = (var17.equals("")) ? 0 : 1;
              var9 = stackIn_12_0;
              if (var20 != null) {
                if (var9 != 0) {
                  var20.updateNames(var19, var18, -424);
                }
              } else {
                var8_ref_jk = new LobbyPlayerEntry(var18, var19, var3_long);
                GetReverbWet.field_o.put(var8_ref_jk, (byte) -86, var3_long);
              }
              var8_ref_jk.field_Kb = MonotonicMillisClock.currentTimeMillis(false) - (long)((PacketBuffer) ((Object) var1)).readInt(77);
              var8_ref_jk.field_Gb = ((PacketBuffer) ((Object) var1)).readUnsignedShort(1869);
              var10 = ((PacketBuffer) ((Object) var1)).readVarInt(param0 ^ 11425);
              stackIn_18_0 = var8_ref_jk;
              stackIn_19_1 = (0 != (var10 & 1));
              stackIn_18_0.field_Lb = stackIn_19_1;
              var8_ref_jk.field_Bb = var10 >> 1;
              var8_ref_jk.field_vb = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -120);
              var8_ref_jk.field_Ab = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -113);
              OpenGlBufferObject.insertLobbyPlayerSorted(var8_ref_jk, true);
              return;
            }
            if (var2 == 6) {
              var3_longLifetime1 = ((PacketBuffer) ((Object) var1)).readLong(255);
              var5 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -120);
              var29 = SetPhasedEnergyBeamAimarc.findLobbyPlayer((byte) 80, var3_longLifetime1);
              if (var29 == null) {
                return;
              }
              if (var29.field_Fb) {
                SetLaserRandomness.field_p = SetLaserRandomness.field_p - 1;
                var29.field_Fb = false;
              }
              if (var5 == 0) {
                var29.unlink(param0 - 3859);
              } else {
                var29.field_Db = var5;
                var29.field_yb = GetMomentOfInertiaPredivideDownshift.field_p;
              }
              var29.unlinkSecondary((byte) -35);
              return;
            }
            if (var2 == 7) {
              var31 = (LobbyPlayerEntry) (SetMachineGunAimarc.field_q.first(param0 ^ 13));
              while (var31 != null) {
                var31.unlink(param0 - 3859);
                var31.unlinkSecondary((byte) -35);
                var31 = (LobbyPlayerEntry) (SetMachineGunAimarc.field_q.next((byte) 11));
              }
              SetLaserRandomness.field_p = 0;
              return;
            }
            if (var2 == 8) {
              var3 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(1869);
              var4_ref_mm = (LobbyGameEntry) (GetLaserReload.field_r.get(-1, (long)var3));
              if (var4_ref_mm == null) {
                var4_ref_mm = new LobbyGameEntry(PasswordValidator.field_l);
                GetLaserReload.field_r.put(var4_ref_mm, (byte) -115, (long)var3);
              }
              SetShipAimLines.readLobbyGameEntry(118, var4_ref_mm, true, var1);
              MovingObjectFactory.insertSortedLobbyGame((byte) 109, var4_ref_mm);
              return;
            }
            if (var2 == 9) {
              var3Lifetime4 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(1869);
              var4 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -127);
              var30 = (LobbyGameEntry) (GetLaserReload.field_r.get(-1, (long)var3Lifetime4));
              if (var30 != null) {
                if (var4 != 0) {
                  var30.field_Db = GetMomentOfInertiaPredivideDownshift.field_p;
                  var30.field_ec = var4;
                } else {
                  var30.unlink(param0 - 3859);
                }
                var30.unlinkSecondary((byte) -35);
              }
              return;
            }
            if (var2 == 10) {
              var15 = (LobbyGameEntry) (HotspotTextWidget.field_E.first(0));
              while (var15 != null) {
                var15.unlink(-3846);
                var15.unlinkSecondary((byte) -35);
                var15 = (LobbyGameEntry) (HotspotTextWidget.field_E.next((byte) 106));
              }
              return;
            }
            if (var2 != 11 &&
              var2 != 12) {
              if (13 == var2) {
                var3Lifetime5 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(1869);
                var4Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -97);
                var27_ref = (LobbyGameEntry) (GetLaserReload.field_r.get(-1, (long)var3Lifetime5));
                if (var27_ref != null) {
                  var13 = var27_ref;
                  var6 = var13;
                  var27_ref.field_Qb = false;
                  if (var4Lifetime1 != 0) {
                    var27_ref.field_ec = var4Lifetime1;
                    var27_ref.field_Db = GetMomentOfInertiaPredivideDownshift.field_p;
                  }
                  var13.field_ac = false;
                  MovingObjectFactory.insertSortedLobbyGame((byte) 109, var27_ref);
                }
                return;
              }
              if (14 != var2 &&
                var2 != 16) {
                if (var2 != 15 &&
                  var2 != 17) {
                  if (var2 == 18) {
                    var3_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong(255);
                    var25 = ((PacketBuffer) ((Object) var1)).readString(-1);
                    var26 = ((PacketBuffer) ((Object) var1)).readString(param0 ^ -14);
                    var7 = ScrollBarWidget.findGamePlayer(var3_longLifetime2, true);
                    if (var7 == null) {
                      var7 = new LobbyPlayerEntry(var25, var26, var3_longLifetime2);
                      SetUseDetailLines.field_p.put(var7, (byte) -76, var3_longLifetime2);
                      SetSpinningBladeSpindamageMultiplier.field_o.playerCount = SetSpinningBladeSpindamageMultiplier.field_o.playerCount + 1;
                    }
                    var7.field_Gb = ((PacketBuffer) ((Object) var1)).readUnsignedShort(1869);
                    var8 = ((PacketBuffer) ((Object) var1)).readVarInt(11436);
                    stackIn_84_0 = var7;
                    stackIn_85_1 = ((1 & var8) != 0);
                    stackIn_84_0.field_Lb = stackIn_85_1;
                    var7.field_Bb = var8 >> 1;
                    var7.field_vb = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -103);
                    var7.field_Ab = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -111);
                    OpenGlPostEffect.field_e.addLast(-10258, var7);
                    return;
                  }
                  if (var2 == 19) {
                    var3_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong(255);
                    var5Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -120);
                    var24 = ScrollBarWidget.findGamePlayer(var3_longLifetime2, true);
                    if (var24 != null) {
                      if (var5Lifetime1 != 0) {
                        var24.field_yb = GetMomentOfInertiaPredivideDownshift.field_p;
                        var24.field_Db = var5Lifetime1;
                      } else {
                        var24.unlink(-3846);
                      }
                      var24.unlinkSecondary((byte) -35);
                      SetSpinningBladeSpindamageMultiplier.field_o.playerCount = SetSpinningBladeSpindamageMultiplier.field_o.playerCount - 1;
                    }
                    return;
                  }
                  if (var2 == 20) {
                    SetShipAimLines.readLobbyGameEntry(-41, SetSpinningBladeSpindamageMultiplier.field_o, false, var1);
                    return;
                  }
                  if (21 == var2) {
                    var3Lifetime5 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(param0 ^ 1856);
                    if (var3Lifetime5 == 0) {
                      AccountNameAvailabilityReplies.field_a = 0L;
                      return;
                    }
                    AccountNameAvailabilityReplies.field_a = MonotonicMillisClock.currentTimeMillis(false) + (long)var3Lifetime5;
                    return;
                  }
                  if (var2 == 22) {
                    SetShieldsDirectionalArcParticleSpeedDownshift.field_q = ((PacketBuffer) ((Object) var1)).readUnsignedShort(param0 + 1856);
                    IncrementVariableActionFactory.field_b = ((PacketBuffer) ((Object) var1)).readVarInt(11436);
                    return;
                  }
                  if (var2 == 23) {
                    BodyInZoneConditionFactory.field_a = ((PacketBuffer) ((Object) var1)).readLong(param0 ^ 242);
                    return;
                  }
                  FractalNoiseVolumeGenerator.reportClientError((Throwable) null, "L1: " + SetCountermeasuresPulsetime.formatIncomingPacketDebug(-13514), 0);
                  FighterBayWeaponDefinition.closeGameConnection(-123);
                  return;
                }
                var3_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong(255);
                var5Lifetime1Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -89);
                var12 = SetPhasedEnergyBeamAimarc.findLobbyPlayer((byte) 80, var3_longLifetime2);
                var23 = var12;
                if (var12 == null) {
                  return;
                }
                if (15 != var2) {
                  if (var23.field_Fb) {
                    SetLaserRandomness.field_p = SetLaserRandomness.field_p - 1;
                    var23.field_Fb = false;
                  }
                } else {
                  var12.field_Eb = false;
                }
                if (var5Lifetime1Lifetime1 != 0) {
                  var23.field_yb = GetMomentOfInertiaPredivideDownshift.field_p;
                  var23.field_Db = var5Lifetime1Lifetime1;
                }
                OpenGlBufferObject.insertLobbyPlayerSorted(var23, true);
                return;
              }
              var3_longLifetime2Lifetime1 = ((PacketBuffer) ((Object) var1)).readLong(255);
              var22 = SetPhasedEnergyBeamAimarc.findLobbyPlayer((byte) 80, var3_longLifetime2Lifetime1);
              if (var22 != null) {
                if (var2 != 14) {
                  if (!var22.field_Fb) {
                    var22.field_Fb = true;
                    SetLaserRandomness.field_p = SetLaserRandomness.field_p + 1;
                  }
                } else {
                  var22.field_Eb = true;
                }
                OpenGlBufferObject.insertLobbyPlayerSorted(var22, true);
              }
              return;
            }
            var3Lifetime6 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(1869);
            var14 = (LobbyGameEntry) (GetLaserReload.field_r.get(-1, (long)var3Lifetime6));
            var28 = var14;
            if (var14 != null) {
              if (var2 != 11) {
                var28.field_Qb = true;
              } else {
                var14.field_ac = true;
              }
              MovingObjectFactory.insertSortedLobbyGame((byte) 102, var28);
            }
            return;
          }
          var3_ref_jk = (LobbyPlayerEntry) (OpenGlPostEffect.field_e.first(0));
          while (var3_ref_jk != null) {
            var3_ref_jk.unlink(-3846);
            var3_ref_jk.unlinkSecondary((byte) -35);
            var3_ref_jk = (LobbyPlayerEntry) (OpenGlPostEffect.field_e.next((byte) 80));
          }
          var3_ref_jkLifetime1 = (LobbyPlayerEntry) (GetReverbWet.field_o.first(-31));
          while (var3_ref_jkLifetime1 != null) {
            if (var3_ref_jkLifetime1.field_Eb ||
              var3_ref_jkLifetime1.field_Fb) {
              if (var3_ref_jkLifetime1.field_Fb) {
                SetLaserRandomness.field_p = SetLaserRandomness.field_p - 1;
                var3_ref_jkLifetime1.field_Fb = false;
              }
              var3_ref_jkLifetime1.field_Eb = false;
              OpenGlBufferObject.insertLobbyPlayerSorted(var3_ref_jkLifetime1, true);
            }
            var3_ref_jkLifetime1 = (LobbyPlayerEntry) (GetReverbWet.field_o.next(-1));
          }
          if (var2 == 1 &&
            null != SetSpinningBladeSpindamageMultiplier.field_o) {
            SetFighterRepairTime.field_p = SetSpinningBladeSpindamageMultiplier.field_o.field_Vb;
          }
          if (var2 != 4) {
            SetSpinningBladeSpindamageMultiplier.field_o = null;
          } else {
            var3Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(1869);
            SetSpinningBladeSpindamageMultiplier.field_o = new LobbyGameEntry(PasswordValidator.field_l);
            SetSpinningBladeSpindamageMultiplier.field_o.setSecondaryKey((long)var3Lifetime1, (byte) 83);
            SetShipAimLines.readLobbyGameEntry(-123, SetSpinningBladeSpindamageMultiplier.field_o, false, var1);
            AccountNameAvailabilityReplies.field_a = 0L;
          }
          if (var2 != 2 &&
            3 != var2) {
            SetThrusterParticleSpeedDownshift.field_o = null;
          } else {
            if (SetThrusterParticleSpeedDownshift.field_o == null) {
              SetThrusterParticleSpeedDownshift.field_o = new LobbyGameEntry(PasswordValidator.field_l);
            }
          }
          if (3 != var2) {
            ArchiveTextureProvider.field_h = false;
            return;
          }
          ArchiveTextureProvider.field_h = true;
          for (var3Lifetime2 = 0; GetPlayerRepairTime.field_o.length > var3Lifetime2; var3Lifetime2++) {
            GetPlayerRepairTime.field_o[var3Lifetime2] = ((PacketBuffer) ((Object) var1)).readByte((byte) -114);
          }
          Hardpoint.field_a = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -113);
          TutorialProgressState.field_d = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -95);
          for (var3Lifetime3 = 0; var3Lifetime3 < GetDebrisThrowable.field_p.length; var3Lifetime3++) {
            GetDebrisThrowable.field_p[var3Lifetime3] = ((PacketBuffer) ((Object) var1)).readByte((byte) -114);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) var1_ref), "ie.C(" + param0 + ')');
        }
    }

    static {
        field_p = 0;
    }
}
