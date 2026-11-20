/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fia {
    static String field_a;

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var3 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3_ref_byte__;
        byte[] var4;
        byte[] var2_ref_byte__Lifetime1;
        if (100 == param1 &&
          GetSpecialOrderBarYOffset.field_p > 0) {
          fieldTemp$3 = GetSpecialOrderBarYOffset.field_p - 1;
          GetSpecialOrderBarYOffset.field_p = GetSpecialOrderBarYOffset.field_p - 1;
          var2_ref_byte__ = MassDriverWeaponDefinition.field_d[fieldTemp$3];
          MassDriverWeaponDefinition.field_d[GetSpecialOrderBarYOffset.field_p] = null;
          return var2_ref_byte__;
        }
        if (param1 == 5000 &&
          0 < SetExplosionProjectileDamage.field_o) {
          fieldTemp$4 = SetExplosionProjectileDamage.field_o - 1;
          SetExplosionProjectileDamage.field_o = SetExplosionProjectileDamage.field_o - 1;
          var2_ref_byte__Lifetime1 = UiScrollBar.field_E[fieldTemp$4];
          UiScrollBar.field_E[SetExplosionProjectileDamage.field_o] = null;
          return var2_ref_byte__Lifetime1;
        }
        var2 = -5 % ((51 - param0) / 54);
        if (param1 == 30000 &&
          PlayerReadyFactory.field_a > 0) {
          fieldTemp$5 = PlayerReadyFactory.field_a - 1;
          PlayerReadyFactory.field_a = PlayerReadyFactory.field_a - 1;
          var3_ref_byte__ = ServerTickFactory.field_b[fieldTemp$5];
          ServerTickFactory.field_b[PlayerReadyFactory.field_a] = null;
          return var3_ref_byte__;
        }
        if (ShipComponent.field_l != null) {
          for (var3 = 0; var3 < SetCountermeasuresCooldown.field_o.length; var3++) {
            if (SetCountermeasuresCooldown.field_o[var3] == param1 &&
              0 < LegacyOpenGlMaterialEffectManager.field_f[var3]) {
              dupTemp$6 = LegacyOpenGlMaterialEffectManager.field_f[var3] - 1;
              arrayValue$7 = ShipComponent.field_l[var3];
              LegacyOpenGlMaterialEffectManager.field_f[var3] = dupTemp$6;
              var4 = arrayValue$7[dupTemp$6];
              ShipComponent.field_l[var3][LegacyOpenGlMaterialEffectManager.field_f[var3]] = null;
              return var4;
            }
          }
        }
        return new byte[param1];
    }

    final static boolean a(int[] param0, int param1, byte param2, long param3, String param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        QuickChatMenuWidget var7 = null;
        CharSequence var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!CountermeasureLauncherWeaponDefinition.a(param1, param0, param3, param4, (byte) -82)) {
            return false;
          }
          var6_int = -8 % ((param2 - 36) / 44);
          if (param1 == 1) {
            param1 = 0;
          }
          ChoosePlayerNameForm.field_x = param4;
          NetworkMessageState.chatChannel = param1;
          var8 = (CharSequence) ((Object) param4);
          GetDebrisThrowable.field_o = ConstantColorTextureOperation.normalizeName(false, var8);
          lsa.field_f = param3;
          var7 = MessageLog.createQuickChatPhraseMenu(ConstantColorTextureOperation.field_k, param0, 0, DebrisFactory.field_a, ScrollableActionPanel.field_Ab);
          AsteroidFieldFactory.a((byte) -28, var7);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("fia.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int[] var2 = null;
        int var3_int = 0;
        int[] var3 = null;
        int[][] var3_array = null;
        int var4 = 0;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        int[][] var6_ref_int____ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var17 = null;
        int[] var18 = null;
        ShipComponentDefinition var19 = null;
        int[] var20 = null;
        Camera2D var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var30 = null;
        int[] var31 = null;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var3_intLifetime2;
        int var7Lifetime2;
        int var8Lifetime2;
        var14 = VoidHunters.field_G;
        try {
          boolean decompiledFrameRemainder1 = true;
          if (SetMachineGunEnergyUsed.field_o[80]) {
            if (!khb.field_b) {
              BoundedRandomAccessFile.field_c = (1 + BoundedRandomAccessFile.field_c) % 3;
            }
            khb.field_b = true;
          } else {
            if (!SetMachineGunEnergyUsed.field_o[87] &&
              GetPointDefenceLaserPulsetime.field_o >= 0) {
              if (!SetMachineGunEnergyUsed.field_o[88] &&
                GetPointDefenceLaserPulsetime.field_o <= 0) {
                if (SetMachineGunEnergyUsed.field_o[9]) {
                  if (!khb.field_b) {
                    System.out.println("Reloading game types");
                    GetCountermeasureLauncherAimarc.e((byte) 113);
                  }
                  khb.field_b = true;
                } else {
                  if (SetMachineGunEnergyUsed.field_o[5]) {
                    if (!khb.field_b) {
                      GetDebrisThrowable.a(false, "Saving content data");
                      SetTorpedoProjectileLife.a(-118);
                    }
                    khb.field_b = true;
                  } else {
                    if (SetMachineGunEnergyUsed.field_o[97]) {
                      if (!khb.field_b) {
                        SetMissileLauncherProjectileLife.field_p = SetMissileLauncherProjectileLife.field_p + 1;
                        LegacyOpenGlEnvironmentReflectionEffect.field_g = new int[1][0];
                        hw.field_d = new int[1][0];
                        if (EnvironmentReflectionGpuMaterialEffect.field_g.length <= SetMissileLauncherProjectileLife.field_p) {
                          SetMissileLauncherProjectileLife.field_p = -1;
                        }
                      }
                      khb.field_b = true;
                    } else {
                      if (SetMachineGunEnergyUsed.field_o[96]) {
                        if (!khb.field_b) {
                          LegacyOpenGlEnvironmentReflectionEffect.field_g = new int[1][0];
                          SetMissileLauncherProjectileLife.field_p = SetMissileLauncherProjectileLife.field_p - 1;
                          hw.field_d = new int[1][0];
                          if (SetMissileLauncherProjectileLife.field_p < -1) {
                            SetMissileLauncherProjectileLife.field_p = EnvironmentReflectionGpuMaterialEffect.field_g.length - 1;
                          }
                        }
                        khb.field_b = true;
                      } else {
                        if (SetMachineGunEnergyUsed.field_o[85]) {
                          if (!khb.field_b &&
                            SetMissileLauncherProjectileLife.field_p >= 0 &&
                            BoundedRandomAccessFile.field_c == 2) {
                            var17 = LegacyOpenGlEnvironmentReflectionEffect.field_g[LegacyOpenGlEnvironmentReflectionEffect.field_g.length - 1];
                            if (1 < var17.length) {
                              var26 = new int[var17.length - 2];
                              var18 = var26;
                              var2 = var18;
                              for (var3_int = 0; var26.length > var3_int; var3_int++) {
                                var2[var3_int] = var17[var3_int];
                              }
                              LegacyOpenGlEnvironmentReflectionEffect.field_g[LegacyOpenGlEnvironmentReflectionEffect.field_g.length - 1] = var26;
                            }
                          }
                          khb.field_b = true;
                        } else {
                          if (!SetMachineGunEnergyUsed.field_o[41]) {
                            khb.field_b = false;
                          } else {
                            if (!khb.field_b &&
                              SetMissileLauncherProjectileLife.field_p >= 0) {
                              if (BoundedRandomAccessFile.field_c == 1) {
                                System.out.print("int[][] convex_outlines=new int[][]{");
                                for (var1_int = 0; var1_int < hw.field_d.length; var1_int++) {
                                  if (var1_int > 0) {
                                    System.out.print(",");
                                  }
                                  System.out.print("{");
                                  var30 = hw.field_d[var1_int];
                                  for (var3_intLifetime2 = 0; var3_intLifetime2 < var30.length; var3_intLifetime2++) {
                                    if (var3_intLifetime2 > 0) {
                                      System.out.print(",");
                                    }
                                    System.out.print("" + var30[var3_intLifetime2]);
                                  }
                                  System.out.print("}");
                                }
                                GetDebrisThrowable.a(false, "};");
                              } else {
                                if (BoundedRandomAccessFile.field_c == 2) {
                                  System.out.print("int[][] detail_lines=new int[][]{");
                                  for (var1_int = 0; LegacyOpenGlEnvironmentReflectionEffect.field_g.length > var1_int; var1_int++) {
                                    if (var1_int > 0) {
                                      System.out.print(",");
                                    }
                                    System.out.print("{");
                                    var31 = LegacyOpenGlEnvironmentReflectionEffect.field_g[var1_int];
                                    for (var3_intLifetime2 = 0; var3_intLifetime2 < var31.length; var3_intLifetime2++) {
                                      if (var3_intLifetime2 > 0) {
                                        System.out.print(",");
                                      }
                                      System.out.print("" + var31[var3_intLifetime2]);
                                    }
                                    System.out.print("}");
                                  }
                                  GetDebrisThrowable.a(false, "};");
                                }
                              }
                            }
                            khb.field_b = true;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                if (!khb.field_b) {
                  GetUseTrails.field_o = GetUseTrails.field_o / 2.0f;
                }
                khb.field_b = true;
              }
              decompiledFrameRemainder1 = false;
            }
            else {
              if (!khb.field_b) {
                GetUseTrails.field_o = GetUseTrails.field_o * 2.0f;
              }
              khb.field_b = true;
            }
          }
          if (SetMachineGunEnergyUsed.field_o[33]) {
            SetTorpedoEnergyUsed.field_o = SetTorpedoEnergyUsed.field_o - 8.0f / GetUseTrails.field_o;
          }
          if (SetMachineGunEnergyUsed.field_o[50]) {
            SetPhysicsCollisionGrapplingHookForceMultiplier.field_p = SetPhysicsCollisionGrapplingHookForceMultiplier.field_p + 8.0f / GetUseTrails.field_o;
          }
          if (param0) {
            field_a = (String) null;
          }
          if (SetMachineGunEnergyUsed.field_o[49]) {
            SetTorpedoEnergyUsed.field_o = SetTorpedoEnergyUsed.field_o + 8.0f / GetUseTrails.field_o;
          }
          if (SetMachineGunEnergyUsed.field_o[48]) {
            SetPhysicsCollisionGrapplingHookForceMultiplier.field_p = SetPhysicsCollisionGrapplingHookForceMultiplier.field_p - 8.0f / GetUseTrails.field_o;
          }
          if (SetMissileLauncherProjectileLife.field_p >= 0) {
            boolean decompiledFrameRemainder0 = true;
            var19 = EnvironmentReflectionGpuMaterialEffect.field_g[SetMissileLauncherProjectileLife.field_p];
            if (var19 != null) {
              var21 = new Camera2D();
              var21.worldCenterY = SetTorpedoEnergyUsed.field_o;
              var21.worldCenterX = SetPhysicsCollisionGrapplingHookForceMultiplier.field_p;
              var21.scale = GetUseTrails.field_o;
              if (BoundedRandomAccessFile.field_c != 1) {
                if (BoundedRandomAccessFile.field_c != 2) {
                  return;
                }
                var23 = LegacyOpenGlEnvironmentReflectionEffect.field_g[-1 + LegacyOpenGlEnvironmentReflectionEffect.field_g.length];
                var3 = var23;
                var4 = var21.screenToWorldX(true, GetUseDetailLines.field_o);
                var5 = var21.screenToWorldY(0, GetTorpedoReload.field_q);
                if (ArchiveLoadRequest.field_c == 1 &&
                  SetMachineGunEnergyUsed.field_o[81]) {
                  LegacyOpenGlEnvironmentReflectionEffect.field_g[-1 + LegacyOpenGlEnvironmentReflectionEffect.field_g.length] = SetAutozoomSpeedDivide.a(var4, false, var23, (byte) -14);
                  LegacyOpenGlEnvironmentReflectionEffect.field_g[-1 + LegacyOpenGlEnvironmentReflectionEffect.field_g.length] = SetAutozoomSpeedDivide.a(var5, false, LegacyOpenGlEnvironmentReflectionEffect.field_g[-1 + LegacyOpenGlEnvironmentReflectionEffect.field_g.length], (byte) -14);
                }
                if (ArchiveLoadRequest.field_c == 2) {
                  var6_ref_int____ = new int[LegacyOpenGlEnvironmentReflectionEffect.field_g.length + 1][];
                  for (var7 = 0; LegacyOpenGlEnvironmentReflectionEffect.field_g.length > var7; var7++) {
                    var6_ref_int____[var7] = LegacyOpenGlEnvironmentReflectionEffect.field_g[var7];
                  }
                  var6_ref_int____[LegacyOpenGlEnvironmentReflectionEffect.field_g.length] = new int[]{};
                  LegacyOpenGlEnvironmentReflectionEffect.field_g = var6_ref_int____;
                }
                if (GetBots.field_o != 1) {
                  return;
                }
                var6 = -1;
                var7Lifetime2 = 2147483647;
                for (var8 = 0; var23.length > var8; var8 += 2) {
                  var9 = var23[var8];
                  var10 = var3[1 + var8];
                  var11 = var9 - var4;
                  var12 = var10 - var5;
                  var13 = TextLayout.approximateVectorLength(var11, (byte) 106, var12);
                  if (var7Lifetime2 > var13) {
                    var6 = var8;
                    var7Lifetime2 = var13;
                  }
                }
                if ((var6 != -1)) {
                  if (SetMachineGunEnergyUsed.field_o[83]) {
                    var8Lifetime2 = ArchiveProvider.field_b / 2;
                    var5 = var8Lifetime2 * (var5 / var8Lifetime2);
                  }
                  var23[var6] = var4;
                  var3[1 + var6] = var5;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (1 == ArchiveLoadRequest.field_c) {
                  var3_intLifetime1 = -1;
                  var4Lifetime1 = 2147483647;
                  var27 = var19.outline;
                  var20 = var27;
                  var5_ref_int__ = var20;
                  for (var6Lifetime1 = 0; var27.length > var6Lifetime1; var6Lifetime1 += 2) {
                    var7Lifetime1 = var27[var6Lifetime1];
                    var8Lifetime1 = var5_ref_int__[var6Lifetime1 + 1];
                    var9Lifetime1 = var21.worldToScreenX(var7Lifetime1, (byte) 125);
                    var10Lifetime1 = var21.worldToScreenY(true, var8Lifetime1);
                    var11Lifetime1 = TextLayout.approximateVectorLength(-GetUseDetailLines.field_o + var9Lifetime1, (byte) 119, var10Lifetime1 - GetTorpedoReload.field_q);
                    if (var11Lifetime1 < var4Lifetime1) {
                      var4Lifetime1 = var11Lifetime1;
                      var3_intLifetime1 = var6Lifetime1 >> 1;
                    }
                  }
                  if (-1 != var3_intLifetime1) {
                    GetDebrisThrowable.a(false, "Adding point " + var3_intLifetime1);
                    var22 = hw.field_d[-1 + hw.field_d.length];
                    hw.field_d[-1 + hw.field_d.length] = SetAutozoomSpeedDivide.a(var3_intLifetime1, true, var22, (byte) -14);
                  }
                }
                if (ArchiveLoadRequest.field_c == 2) {
                  var3_array = new int[1 + hw.field_d.length][];
                  for (var4Lifetime2 = 0; var4Lifetime2 < hw.field_d.length; var4Lifetime2++) {
                    var3_array[var4Lifetime2] = hw.field_d[var4Lifetime2];
                  }
                  var3_array[hw.field_d.length] = new int[]{};
                  hw.field_d = var3_array;
                  return;
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var1), "fia.A(" + param0 + ')');
        }
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 >= -14) {
          field_a = (String) null;
        }
        field_a = null;
    }

    static {
        field_a = "One team wins by getting their turret to the escape zone";
    }
}
