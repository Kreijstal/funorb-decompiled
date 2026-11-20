/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NebulaFieldFactory implements GameStateFactory {
    static int field_b;
    static String field_a;
    static Widget[] field_c;

    public final SerializableGameState create(byte param0) {
        NebulaField stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = 13 / ((-64 - param0) / 50);
          stackIn_1_0 = new NebulaField();
          return (SerializableGameState) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) var2), "lob.A(" + param0 + ')');
        }
    }

    final static void handleSocialListPacket(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_14_0 = 0;
        SocialListEntry stackIn_66_0 = null;
        RuntimeException decompiledCaughtException = null;
        IsaacPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        SocialListEntry var6 = null;
        String var7 = null;
        SocialListEntry var7_ref = null;
        String var8 = null;
        int var9 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        SocialListEntry var6Lifetime1;
        var9 = VoidHunters.field_G;
        try {
          var1 = AccountNameAvailabilityReplies.field_b;
          if (!param0) {
            field_b = -108;
          }
          var2 = var1.readUnsignedByte((byte) -91);
          if (var2 == 0) {
            if (TeamNodeCondition.field_c == null) {
              TeamNodeCondition.field_c = new SecondaryNodeHashTable(128);
              OpenGlIndexBuffer.field_k = 0;
            }
            stackIn_14_0 = (var1.readUnsignedByte((byte) -101) != 1) ? 0 : 1;
            var3_int = stackIn_14_0;
            var4_ref_String = var1.readString(-1);
            if (var3_int == 0) {
              var5 = var4_ref_String;
            }
            if (var3_int != 0 ||
              var9 != 0) {
              var5 = var1.readString(-1);
            }
            var6 = CarouselPlayerEventFactory.findIgnoreEntry(var4_ref_String, false);
            var7 = var1.readString(-1);
            var8 = ConstantColorTextureOperation.normalizeName(false, (CharSequence) ((Object) var4_ref_String));
            if (null == var8) {
              var8 = var4_ref_String;
            }
            if (null == var6) {
              var6 = CarouselPlayerEventFactory.findIgnoreEntry(var7, false);
              if (null != var6) {
                TeamNodeCondition.field_c.put(var6, (byte) -124, (long)var8.hashCode());
              }
            }
            if (var6 == null) {
              var6 = new SocialListEntry();
              TeamNodeCondition.field_c.put(var6, (byte) -106, (long)var8.hashCode());
              fieldTemp$0 = OpenGlIndexBuffer.field_k;
              OpenGlIndexBuffer.field_k = OpenGlIndexBuffer.field_k + 1;
              var6.insertionIndex = fieldTemp$0;
              SetPointDefenceLaserProjectileOndamageParticles.field_o.addLast(-10258, var6);
            }
            var6.field_vb = var7;
            var6.field_Fb = var4_ref_String;
            var6.field_Cb = var5;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (PendingRequestResender.field_b == 1) {
                PendingRequestResender.field_b = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (PendingRequestResender.field_b == 2) {
                PendingRequestResender.field_b = 1;
              }
              return;
            }
            if (var2 != 4) {
              FractalNoiseVolumeGenerator.reportClientError((Throwable) null, "F1: " + SetCountermeasuresPulsetime.e(-13514), 0);
              FighterBayWeaponDefinition.closeGameConnection(-125);
              return;
            }
            PendingRequestResender.field_b = 1;
            var3 = var1.readString(-1);
            HslAdjustTextureOperation.field_q = ((String) (var3)).intern();
            var4 = var1.readUnsignedByte((byte) -126);
            MachineGunWeaponDefinition.unpackChatFilters(var4, (byte) 71);
            return;
          }
          if (MenuInputState.field_f == null) {
            MenuInputState.field_f = new SecondaryNodeHashTable(128);
            GetBoostersCooldown.field_p = 0;
          }
          var3Lifetime1 = var1.readString(-1);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.readString(-1);
          var5Lifetime1 = var1.readString(-1);
          var6Lifetime1 = FlipTextureOperation.a(var4_ref_StringLifetime1, 0);
          if (var6Lifetime1 == null) {
            var6Lifetime1 = FlipTextureOperation.a(var5Lifetime1, 0);
            if (null != var6Lifetime1) {
              MenuInputState.field_f.put(var6Lifetime1, (byte) -31, (long)ConstantColorTextureOperation.normalizeName(false, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode());
            }
          }
          if (var6Lifetime1 == null) {
            var6Lifetime1 = new SocialListEntry();
            MenuInputState.field_f.put(var6Lifetime1, (byte) -112, (long)ConstantColorTextureOperation.normalizeName(false, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode());
            fieldTemp$1 = GetBoostersCooldown.field_p;
            GetBoostersCooldown.field_p = GetBoostersCooldown.field_p + 1;
            var6Lifetime1.insertionIndex = fieldTemp$1;
            DisplayModeErrorDialog.field_M.addLast(-10258, var6Lifetime1);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.field_Fb = var4_ref_StringLifetime1;
          var6Lifetime1.field_vb = var5Lifetime1;
          var6Lifetime1.field_Ab = (String) (var3Lifetime1);
          var6Lifetime1.unlink(-3846);
          var7_ref = (SocialListEntry) (DisplayModeErrorDialog.field_M.first(0));
          scanLoop1: while (true) {
            if (var7_ref != null) {
              stackIn_66_0 = var7_ref;
              if (var9 != 0) {
                break scanLoop1;
              }
              if (Nebula.comesBeforeSocialEntry(stackIn_66_0, 7569, var6Lifetime1)) {
                var7_ref = (SocialListEntry) (DisplayModeErrorDialog.field_M.next((byte) 78));
                continue;
              }
            }
            if (null == var7_ref) {
              DisplayModeErrorDialog.field_M.addLast(-10258, var6Lifetime1);
              if (var9 == 0) {
                return;
              }
            }
            stackIn_66_0 = var6Lifetime1;
            break;
          }
          SoftwareFramebuffer.insertBefore(stackIn_66_0, var7_ref, 2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) var1_ref), "lob.D(" + param0 + ')');
        }
    }

    final static void drawRectangleBorderClipped(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int var8Lifetime1;
        int var8Lifetime1Lifetime1;
        var10 = VoidHunters.field_G;
        try {
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          if (EnvironmentReflectionGpuMaterialEffect.field_i >= param4 &&
            param5 >= NebulaField.field_c) {
            if (OpenGlTexture3D.field_j > param2) {
              param2 = OpenGlTexture3D.field_j;
              var6_int = 0;
              if (var10 != 0) {
                if (param2 > GetCountermeasureLauncherProjectiles.field_o) {
                  var6_int = 0;
                  param2 = GetCountermeasureLauncherProjectiles.field_o;
                  var6_int = 1;
                } else {
                  var6_int = 1;
                }
              }
            } else {
              if (param2 > GetCountermeasureLauncherProjectiles.field_o) {
                var6_int = 0;
                param2 = GetCountermeasureLauncherProjectiles.field_o;
                if (var10 != 0) {
                  var6_int = 1;
                }
              } else {
                var6_int = 1;
              }
            }
            if (OpenGlTexture3D.field_j > param0) {
              param0 = OpenGlTexture3D.field_j;
              var7 = 0;
              if (var10 != 0) {
                if (GetCountermeasureLauncherProjectiles.field_o >= param0) {
                  var7 = 1;
                  param0 = GetCountermeasureLauncherProjectiles.field_o;
                  var7 = 0;
                } else {
                  param0 = GetCountermeasureLauncherProjectiles.field_o;
                  var7 = 0;
                }
              }
            } else {
              if (GetCountermeasureLauncherProjectiles.field_o >= param0) {
                var7 = 1;
                if (var10 != 0) {
                  param0 = GetCountermeasureLauncherProjectiles.field_o;
                  var7 = 0;
                }
              } else {
                param0 = GetCountermeasureLauncherProjectiles.field_o;
                var7 = 0;
              }
            }
            boolean decompiledSharedTail1 = !(param4 < NebulaField.field_c);
            if (!decompiledSharedTail1) {
              param4 = NebulaField.field_c;
              decompiledSharedTail1 = (var10 != 0);
            }
            if (decompiledSharedTail1) {
              incrementValue$0 = param4;
              param4++;
              GetSalvoRepairTimeMultiplier.fillArraySpan(param1, param0, ResourceNode.rasterTargetRows[incrementValue$0], (byte) 75, param2);
            }
            boolean decompiledSharedTail0 = !(param5 > EnvironmentReflectionGpuMaterialEffect.field_i);
            if (!decompiledSharedTail0) {
              param5 = EnvironmentReflectionGpuMaterialEffect.field_i;
              decompiledSharedTail0 = (var10 != 0);
            }
            if (decompiledSharedTail0) {
              incrementValue$1 = param5;
              param5--;
              GetSalvoRepairTimeMultiplier.fillArraySpan(param1, param0, ResourceNode.rasterTargetRows[incrementValue$1], (byte) 75, param2);
            }
            if (var6_int != 0 &&
              var7 != 0) {
              var8 = param4;
              while (param5 >= var8) {
                var9 = ResourceNode.rasterTargetRows[var8];
                var9[param0] = param1;
                var9[param2] = param1;
                var8++;
                if (var10 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
            }
            if ((decompiledFrameCompleted1) && (var6_int == 0 ||
              var7 == 0 || var10 != 0)) {
              if (var6_int != 0) {
                var8Lifetime1 = param4;
                while (param5 >= var8Lifetime1) {
                  ResourceNode.rasterTargetRows[var8Lifetime1][param2] = param1;
                  var8Lifetime1++;
                  if (var10 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
              }
              if ((decompiledFrameCompleted0) &&
                (var6_int == 0 ||
                var10 != 0) &&
                (var7 != 0)) {
                var8Lifetime1Lifetime1 = param4;
                while (var8Lifetime1Lifetime1 <= param5) {
                  ResourceNode.rasterTargetRows[var8Lifetime1Lifetime1][param0] = param1;
                  var8Lifetime1Lifetime1++;
                  if (var10 != 0) {
                    return;
                  }
                }
              }
            }
          }
          if (param3 != 256) {
            field_a = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) var6), "lob.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int parseDecimalInt(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -59 % ((param0 + 31) / 40);
          stackIn_1_0 = SetMissionTerrainVotingChancestep.parseInt(true, param1, true, 10);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_5_0 = var2;
          stackIn_5_1 = new StringBuilder().append("lob.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        RuntimeException var3 = null;
        SerializableGameState[] stackIn_2_0 = null;
        NebulaField[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 11995) {
            stackIn_4_0 = new NebulaField[param1];
            return (SerializableGameState[]) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (SerializableGameState[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) var3), "lob.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void clearSharedReferences(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_a = null;
          if (param0 <= 88) {
            NebulaFieldFactory.parseDecimalInt(-76, (CharSequence) null);
          }
          field_c = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) var1), "lob.E(" + param0 + ')');
        }
    }

    static {
        field_b = 256;
    }
}
