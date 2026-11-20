/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MassDriverWeaponDefinition extends WeaponDefinition {
    static String field_b;
    static String field_c;
    static byte[][] field_d;

    final int getProjectileType(int param0) {
        if (param0 != 0) {
          this.getReloadTime((byte) -51);
          return 0;
        }
        return 0;
    }

    final int getEnergyCost(int param0) {
        if (param0 != 0) {
          this.getProjectileCount(true);
        }
        return GetPointDefenceLaserAimspeed.field_p;
    }

    final static void appendChatMessage(ChatMessage param0, int param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = VoidHunters.field_G;
        try {
          for (var2_int = param1; var2_int < 3; var2_int++) {
            GetPlayerRepairAmount.field_q[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; var2_intLifetime1 < SetRepairModePower.chatMessageCount; var2_intLifetime1++) {
            if (param0.channelType == NullUiRenderer.chatMessages[var2_intLifetime1].channelType) {
              dupTemp$3 = NullUiRenderer.chatMessages[var2_intLifetime1].getVisibilityPriority(param1 ^ 1);
              GetPlayerRepairAmount.field_q[dupTemp$3] = GetPlayerRepairAmount.field_q[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param0.getVisibilityPriority(1);
          GetPlayerRepairAmount.field_q[dupTemp$0] = GetPlayerRepairAmount.field_q[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; SetRepairModePower.chatMessageCount > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (NullUiRenderer.chatMessages[var3].channelType == param0.channelType) {
              var4 = NullUiRenderer.chatMessages[var3].getVisibilityPriority(1);
              if (GetPlayerRepairAmount.field_q[var4] > EnvironmentReflectionGpuMaterialEffect.field_k) {
                GetPlayerRepairAmount.field_q[var4] = GetPlayerRepairAmount.field_q[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              NullUiRenderer.chatMessages[incrementValue$2] = NullUiRenderer.chatMessages[var3];
            }
          }
          SetRepairModePower.chatMessageCount = var2_intLifetime2;
          fieldTemp$1 = SetRepairModePower.chatMessageCount;
          SetRepairModePower.chatMessageCount = SetRepairModePower.chatMessageCount + 1;
          NullUiRenderer.chatMessages[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("fpb.P(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_c = null;
        field_b = null;
        field_d = (byte[][]) null;
        if (param0 <= 21) {
          field_d = (byte[][]) null;
        }
    }

    final int getAimArc(int param0) {
        int var2 = -52 / ((param0 - 7) / 47);
        return ImageProducerAppletRasterBuffer.field_i;
    }

    final static String d(boolean param0) {
        if (!param0) {
          field_d = (byte[][]) null;
        }
        if (ActiveIconBorderRenderer.pendingAccountRequest == SetCountermeasureLauncherAimspeed.field_r) {
          return GrapplingHook.field_x;
        }
        return MusicPatchPcmStream.field_h;
    }

    final int getFiringSoundId(boolean param0) {
        if (param0) {
          this.getProjectileType(-51);
        }
        return 35;
    }

    final int getProjectileVelocityRandomness(byte param0) {
        if (param0 > -12) {
          return 70;
        }
        return Cp1252CharacterEncoder.field_a;
    }

    final int getProjectileSpeed(byte param0) {
        if (param0 >= -52) {
          field_d = (byte[][]) null;
        }
        return MassDriverFireForceSetting.fireForce;
    }

    final int getProjectileCount(boolean param0) {
        if (param0) {
          field_d = (byte[][]) null;
        }
        return SetSalvoRepairTimeMultiplier.field_p;
    }

    MassDriverWeaponDefinition() {
    }

    final int getReloadTime(byte param0) {
        if (param0 < 0) {
          this.getProjectileSpeed((byte) -39);
        }
        return ArchiveLoadRequest.field_h;
    }

    final int getAimSpeed(int param0) {
        if (param0 != 0) {
          return 14;
        }
        return SelectableIconLabelWidget.field_wb;
    }

    final int getProjectileDamage(int param0) {
        if (param0 != 2769) {
          field_c = (String) null;
        }
        return GetMissionTerrainNebulaProbability.field_p;
    }

    final int getProjectileLifetime(byte param0) {
        int var2 = 43 / ((param0 + 48) / 43);
        return Particle.field_x;
    }

    static {
        field_b = "<%0> cannot join; the game is full.";
        field_c = "Hold the component to deplete the enemy's score";
        field_d = new byte[1000][];
    }
}
