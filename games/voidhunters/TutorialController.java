/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TutorialController {
    private int completionFadeTime;
    static int[] field_a;
    static Widget field_b;
    static boolean field_d;
    static int field_e;

    private final void advanceHintTimer(byte param0, int param1, int param2) {
        try {
          this.advanceHintTimer(param1, 127, param2, false);
          if (param0 != 113) {
            field_d = true;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bv.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int[] findOrderButtonBounds(int param0, IntrusiveDeque param1, int param2, int param3, Camera2D param4, int param5, int param6, int param7) {
        SpecialOrderButtonState var9 = null;
        int var10 = 0;
        int var13 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9_ref = null;
        int var11 = 0;
        int var12 = 0;
        var13 = VoidHunters.field_G;
        try {
          var9 = (SpecialOrderButtonState) (param1.first(0));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var9 == null))) {
            var10 = var9.specialOrderId;
            stackIn_12_0 = param0;
            stackIn_12_1 = var10;
            if (var13 == 0) {
              if (stackIn_12_0 == stackIn_12_1) {
                var11 = var9.x;
                var12 = var9.y;
                stackIn_9_0 = new int[]{var11, var11 + chb.field_a, var12, CarouselSlotStateDump.field_g + var12};
                return stackIn_9_0;
              }
              var9 = (SpecialOrderButtonState) (param1.next((byte) 39));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_12_0 = param2;
            stackIn_12_1 = 30;
          }
          if (stackIn_12_0 != stackIn_12_1) {
            this.updatePracticeScenario(-87, (GameSnapshot) null, 37, 98, (Ship) null, 100, (Camera2D) null);
          }
          stackIn_16_0 = null;
          return (int[]) (stackIn_16_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_20_0 = var9_ref;
          stackIn_20_1 = new StringBuilder().append("bv.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final void advanceHintTimer(int param0, int param1) {
        try {
          this.advanceHintTimer((byte) 113, 100, param1);
          if (param0 != -26476) {
            this.drawWorldHint((GameSnapshot) null, (Camera2D) null, 111, -69, (int[]) null, (String) null, -41);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bv.J(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean isHintVisible(int param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -4) {
            stackIn_7_0 = !(HardpointMatch.hintTimers[param0] < 50);
            return stackIn_7_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var3), "bv.D(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean isHintCompleteAndHidden(byte param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 11) {
            return false;
          }
          stackIn_10_0 = (TutorialProgressState.completedHints[param1]) && (HardpointMatch.hintTimers[param1] < 50);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var3), "bv.K(" + param0 + ',' + param1 + ')');
        }
    }

    private final String formatShortcutLabel(int param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -6448) {
            this.drawWorldHint((GameSnapshot) null, (Camera2D) null, 32, -33, (int[]) null, (String) null, -106);
          }
          if (!param2) {
            stackIn_7_0 = SetTorpedoProjectileDamage.field_q[param1];
            return stackIn_7_0;
          }
          stackIn_5_0 = "<col=ffaa00>" + SetTorpedoProjectileDamage.field_q[param1] + "</col>";
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var4), "bv.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean isHintComplete(int param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            this.completionFadeTime = -29;
          }
          stackIn_4_0 = TutorialProgressState.completedHints[param0];
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var3), "bv.H(" + param0 + ',' + param1 + ')');
        }
    }

    final void saveHintProgress(byte param0) {
        try {
          int var2_int = -50 / ((55 - param0) / 38);
          GetShieldsDirectionalRadius.saveCompletedHints(-98);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bv.B(" + param0 + ')');
        }
    }

    final void completeHint(byte param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 <= 66) {
            this.completeHint((byte) -23, 1);
          }
          TutorialProgressState.completedHints[param1] = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var3), "bv.E(" + param0 + ',' + param1 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 39) {
            TutorialController.clearSharedReferences(105);
          }
          field_a = null;
          field_b = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var1), "bv.N(" + param0 + ')');
        }
    }

    private final void drawHintCallout(int[] param0, Camera2D param1, boolean param2, int param3, GameSnapshot param4, boolean param5, String param6, int param7, byte param8) {
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_85_2 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        var30 = VoidHunters.field_G;
        try {
          var10_int = -16384;
          var11 = -2048;
          var12 = tea.a(param7, param6, 13879);
          var13 = PartitionZoneFactory.field_a;
          var14 = MissionVariableFactory.field_a;
          var15 = param0[0];
          var16 = param0[1];
          if (param5) {
            boolean decompiledSharedTail0 = !(param2);
            if (!decompiledSharedTail0) {
              var16 = param0[2] + param0[3] >> 1;
              var15 = param0[0] + param0[1] >> 1;
              decompiledSharedTail0 = (var30 != 0);
            }
            if (decompiledSharedTail0) {
              var15 = param1.worldToScreenX((param0[1] + param0[0] >> 1) + var10_int, (byte) 124);
              var16 = param1.worldToScreenY(true, var11 + (param0[2] + param0[3] >> 1));
            }
          }
          var17 = GetPointDefenceLaserProjectiles.a(false, param7);
          if (!param5) {
            var16 = var16 - var17 / 2;
            var15 = var15 - var12 / 2;
          }
          if (param5 ||
            var30 != 0) {
            var16 = var16 - var17;
            var15 = var15 - var12;
          }
          var18 = -105 / ((10 - param8) / 45);
          if ((16 + var16) <= var14) {
            if (0 > var16 + (-var17 - 16)) {
              var16 = 16 + var17;
              if (var30 != 0) {
                var16 = -16 + var14;
              }
            }
          } else {
            var16 = -16 + var14;
          }
          if (16 + var15 + var12 > var13) {
            var15 = -var12 + var13 - 16;
            if (var30 != 0 &&
              var15 - 16 < 0) {
              var15 = 16;
            }
          } else {
            if (var15 - 16 < 0) {
              var15 = 16;
            }
          }
          var19 = 4;
          var20 = -var19 + var15;
          var21 = -var17 + var16;
          var22 = var12 + 2 * var19;
          var23 = 18;
          if (param5) {
            var24 = 0;
            var25 = 0;
            if (!param2) {
              var24 = param1.worldToScreenX(param0[0] + param0[1] >> 1, (byte) 120);
              var25 = param1.worldToScreenY(true, param0[2] + param0[3] >> 1);
            }
            if (param2 ||
              var30 != 0) {
              var24 = param0[1] + param0[0] >> 1;
              var25 = param0[3] + param0[2] >> 1;
            }
            if (var24 < (var22 + var15) &&
              var25 < (var16 + var23 / 2)) {
              var26 = param1.worldToScreenY(true, param0[3] - var11);
              var27 = var23 + var26;
              var28 = var23 + var27 - var17;
              if ((var28 + 16) < var14) {
                var16 = var27;
                var20 = -var19 + var15;
                var21 = var16 - var17;
              }
            }
            var26Lifetime1 = var24;
            var27Lifetime1 = 7;
            var28Lifetime1 = var27Lifetime1 - (1 - var23) + var21;
            if ((var27Lifetime1 + var24) > (var22 + var20)) {
              var20 = -var22 + var24 + var27Lifetime1;
            }
            if (var20 > (-var27Lifetime1 + var24)) {
              var20 = -var27Lifetime1 + var24;
            }
            if (6 > -var20 + 1 + (-var27Lifetime1 + var26Lifetime1)) {
              var26Lifetime1 = var20 + (-1 + var27Lifetime1);
            }
            var15 = var20 + var19;
            if (var27Lifetime1 + (var26Lifetime1 - var20) + var22 < 6) {
              var26Lifetime1 = -var27Lifetime1 + (var20 + var22);
            }
            var29 = param3 << 24;
            GetMissilesHitSourceTeam.a(var20 - 1, -1 + var21, (byte) -128, var23 + 2, param3, 1, 2 + var22);
            GetDebrisCarryOver.fillGradientTriangle(8, -var27Lifetime1 + var28Lifetime1, 1, 1 | var29, var26Lifetime1, -1 + (var26Lifetime1 - var27Lifetime1) + 1, var28Lifetime1 - var27Lifetime1, var28Lifetime1 + 1, var29 | 1, 1 + (var27Lifetime1 + var26Lifetime1), 1 | var29);
            GetDebrisCarryOver.fillGradientTriangle(8, -var27Lifetime1 + var28Lifetime1, 1, var29 | 236981, var26Lifetime1, var26Lifetime1 + (1 - var27Lifetime1), -var27Lifetime1 + var28Lifetime1, var28Lifetime1, var29 | 56035, var26Lifetime1 + var27Lifetime1, 236981 | var29);
          }
          if (!param5 ||
            var30 != 0) {
            GetMissilesHitSourceTeam.a(-1 + var20, var21 - 1, (byte) -128, 2 + var23, param3, 1, 2 + var22);
          }
          CachedArchiveProvider.a(param3, false, var20, var21, var23, var22, 236981);
          var24Lifetime1 = param1.screenToWorldY(0, 4 + var16 + var19);
          if (param5) {
            if (param0[3] < var24Lifetime1) {
              if (var24Lifetime1 >= param0[2]) {
                var24Lifetime1 = param1.screenToWorldY(0, -var17 + var16);
                if (var30 != 0) {
                  var24Lifetime1 = param1.screenToWorldY(0, var16 - var17);
                }
              } else {
                var24Lifetime1 = param1.screenToWorldY(0, var16 - var17);
              }
            }
            var25Lifetime1 = param1.worldToScreenY(true, param0[2] + param0[3] >> 1);
            if (var25Lifetime1 > var21 &&
              (var23 + var21) > var25Lifetime1) {
              var24Lifetime1 = param1.screenToWorldY(0, var16);
            }
          }
          OpenGlShaderProgram.a(1, param3, -1, param6, (byte) -117, param7, -5 + var16, var15);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_76_0 = var10;
          stackIn_76_1 = new StringBuilder().append("bv.L(");
          if (param0 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',');
          if (param1 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          stackIn_84_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_85_2 = "null";
          } else {
            stackIn_85_2 = "{...}";
          }
          stackIn_88_1 = ((StringBuilder) (Object) stackIn_84_1).append(stackIn_85_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_89_2 = "null";
          } else {
            stackIn_89_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    private final void drawWorldHint(GameSnapshot param0, Camera2D param1, int param2, int param3, int[] param4, String param5, int param6) {
        String discarded$1 = null;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.drawHintCallout(param4, param1, false, param2, param0, true, param5, param3, (byte) -76);
          if (param6 != 1619) {
            discarded$1 = this.formatShortcutLabel(-4, -53, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("bv.M(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param5 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param6).append(')').toString());
        }
    }

    TutorialController() {
        this.completionFadeTime = -1;
    }

    private final void advanceHintTimer(int param0, int param1, int param2, boolean param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (!TutorialProgressState.completedHints[param2] &&
            HardpointMatch.hintTimers[param2] < param0 && (param3 ||
            -1 == GetMassDriverFireForce.activeHintIndex ||
            param2 == GetMassDriverFireForce.activeHintIndex)) {
            HardpointMatch.hintTimers[param2] = HardpointMatch.hintTimers[param2] + 2;
          }
          if (param1 <= 85) {
            field_a = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var5), "bv.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void updatePracticeScenario(int param0, GameSnapshot param1, int param2, int param3, Ship param4, int param5, Camera2D param6) {
        int stackIn_28_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        IntrusiveDeque var9 = null;
        Projectile var10 = null;
        Debris[] var10_array = null;
        Debris[] var11_ref_nbb__ = null;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        Ship var14 = null;
        SpawnLocation var15 = null;
        MissionEvent var16 = null;
        int var17 = 0;
        Object var13Lifetime1;
        int var12Lifetime1;
        var17 = VoidHunters.field_G;
        try {
          var8_int = -18 % ((94 - param2) / 32);
          var9 = param1.world.getProjectiles(true);
          var10 = (Projectile) (var9.first(0));
          while (var10 != null) {
            if (var10.getFiredTeam(512) != 0) {
              var10.setDamage(0, 71);
            }
            var10 = (Projectile) (var9.next((byte) 109));
            if (var17 == 0) {
              continue;
            }
            break;
          }
          var10_array = param1.world.getDebris((byte) -33);
          var11_ref_nbb__ = var10_array;
          var12 = 0;
          while (var11_ref_nbb__.length > var12) {
            var13 = var11_ref_nbb__[var12];
            if (var17 != 0) {
              return;
            }
            if (null != var13 &&
              ((Debris) (var13)).chassis.countType(27, 0) > 0) {
              ((Debris) (var13)).chassis.resetWeaponReloads(122, 27);
            }
            var12++;
          }
          if (this.isHintCompleteAndHidden((byte) 11, 1) &&
            param1.world.countShips(0) <= 1) {
            var11 = param1.missionState.getCustomVariableValue(7061, 0);
            stackIn_28_0 = (0 != param1.world.countDebris(true)) ? 0 : 1;
            var12Lifetime1 = stackIn_28_0;
            var13Lifetime1 = null;
            if (var11 != 0) {
              if (var11 == 1 &&
                var12Lifetime1 != 0) {
                var13Lifetime1 = new int[]{8, 0, 39, 0, 13, 1, 45, 2, 27, 3, 30, 0, 25, -1, -1, 10, 38, 2, 30, 1, 25, 3, 27, 4, 45, 5, 13};
              }
            } else {
              var13Lifetime1 = new int[]{9, 1, 38, 2, 30, -1, -1, 3, 13, 12, 15, 14, 15, 23, 13, 25, 39, 3, 30, -1, -1};
            }
            if (var13Lifetime1 != null) {
              var14 = MenuInputState.createShipFromComponentWords((int[]) (var13Lifetime1), (byte) 56);
              var14.setTeam(17704, 1);
              var14.setAi(new ShipAI(), 4);
              var15 = param1.world.findSpawnLocation(0, param1.world.getHeight(1) / 2, 0, 0, var14.getTeam((byte) 108), param1.world.getWidth((byte) -122) / 2);
              var14.setPosition(var15.x, var15.y, (byte) 80);
              param1.world.addShip(var14, (byte) 72);
              var14.endSpawnProtection(-2);
              var16 = new MissionEvent();
              var16.addCondition((byte) -106, (MissionCondition) (new BodyDestroyedCondition(var14.getId(false))));
              var16.addAction(new IncrementVariableAction(0, 1), true);
              var16.addAction(new RemoveEventAction(), true);
              param1.world.addMissionEvent(var16, -38);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_45_0 = var8;
          stackIn_45_1 = new StringBuilder().append("bv.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_49_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          stackIn_53_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
        }
    }

    final void updateAndDrawHints(GameSnapshot param0, int param1, boolean param2, Camera2D param3, int param4, int param5, int param6, int param7, byte param8, IntrusiveDeque param9, int param10, int param11, Ship param12) {
        int stackIn_23_0 = 0;
        int stackIn_41_0 = 0;
        boolean stackIn_82_0 = false;
        int stackIn_92_0 = 0;
        boolean stackIn_101_0 = false;
        int stackIn_117_0 = 0;
        int stackIn_236_0 = 0;
        RuntimeException stackIn_353_0 = null;
        StringBuilder stackIn_353_1 = null;
        String stackIn_354_2 = null;
        StringBuilder stackIn_357_1 = null;
        String stackIn_358_2 = null;
        StringBuilder stackIn_361_1 = null;
        String stackIn_362_2 = null;
        StringBuilder stackIn_365_1 = null;
        String stackIn_366_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_81_0;
        boolean stackOut_100_0;
        int var14_int = 0;
        RuntimeException var14 = null;
        Player var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19_int = 0;
        int[] var19 = null;
        String var20 = null;
        int var20_int = 0;
        Debris var20_ref = null;
        IntrusiveDeque var20_ref2 = null;
        int var21 = 0;
        int[] var21_ref_int__ = null;
        int var22 = 0;
        int[] var22_ref_int__ = null;
        String var22_ref_String = null;
        ShipComponent var23 = null;
        int var23_int = 0;
        int[] var23_array = null;
        int var24_int = 0;
        ShipComponent var24 = null;
        int[] var24_array = null;
        int var25 = 0;
        int var26_int = 0;
        ToolkitSprite var26 = null;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int[] var21_ref_int__Lifetime1;
        int[] var23_arrayLifetime1;
        int[] var24_arrayLifetime1;
        int[] var21_ref_int__Lifetime1Lifetime1;
        int[] var21_ref_int__Lifetime1Lifetime2;
        int[] var21_ref_int__Lifetime1Lifetime3;
        int[] var21_ref_int__Lifetime1Lifetime4;
        int var24_intLifetime1;
        int var25Lifetime1;
        int var24_intLifetime2;
        var43 = VoidHunters.field_G;
        try {
          if (0 <= param11 &&
            param0.players.length > param11) {
            var14_int = param0.missionState.getMissionPhase(8);
            if (1 != var14_int &&
              var14_int != 2) {
              var15 = param0.getPlayer(param11, (byte) 59);
              var17 = 0;
              boolean decompiledNaturalLoopExit1 = false;
              while (!(decompiledNaturalLoopExit1 = (!(HardpointMatch.hintTimers.length > var17)))) {
                stackIn_23_0 = HardpointMatch.hintTimers[var17];
                if (var43 == 0) {
                  if (stackIn_23_0 > 0) {
                    HardpointMatch.hintTimers[var17] = HardpointMatch.hintTimers[var17] - 1;
                  }
                  var17++;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit1) {
                stackIn_23_0 = -68 / ((param8 - 60) / 61);
              }
              var18 = stackIn_23_0;
              var16 = 4;
              var17 = param3.screenToWorldX(true, GetUseDetailLines.field_o);
              var18 = param3.screenToWorldY(0, GetTorpedoReload.field_q);
              GetMassDriverFireForce.activeHintIndex = -1;
              var19_int = 0;
              scanLoop1: while (true) {
                if (11 > var19_int) {
                  stackIn_41_0 = var19_int;
                  if (var43 != 0) {
                    break scanLoop1;
                  }
                  if (stackIn_41_0 != 4 &&
                    HardpointMatch.hintTimers[var19_int] > 0) {
                    GetMassDriverFireForce.activeHintIndex = var19_int;
                  } else {
                    var19_int++;
                    continue;
                  }
                }
                if (param12 == null) {
                  return;
                }
                stackIn_41_0 = param12.isSpecialOrderActive(9, 49) ? 1 : 0;
                break;
              }
              if (stackIn_41_0 == 0) {
                var19 = param12.getBoundingbox((byte) -66);
                this.advanceHintTimer(-26476, 0);
                if (SetUseTrails.field_o &&
                  ComponentBehaviour.field_b &&
                  OpenGlVertexDeclaration.field_d &&
                  WeaponDefinition.field_a) {
                  this.completeHint((byte) 86, 0);
                }
                if ((2 & var15.triggers) != 0) {
                  ComponentBehaviour.field_b = true;
                }
                if ((var15.triggers & 8) != 0) {
                  WeaponDefinition.field_a = true;
                }
                if (0 != (var15.triggers & 1)) {
                  SetUseTrails.field_o = true;
                }
                if ((var15.triggers & 4) != 0) {
                  OpenGlVertexDeclaration.field_d = true;
                }
                if (this.isHintVisible(0, -116)) {
                  var20 = SetReverbGain.a(EmailAvailabilityCheck.field_b, new String[]{this.formatShortcutLabel(-6448, SetFixedaim.field_q, SetUseTrails.field_o), this.formatShortcutLabel(-6448, SetSalvoaim.field_p, OpenGlVertexDeclaration.field_d), this.formatShortcutLabel(-6448, UnsupportedGpuMaterialEffect.field_f, WeaponDefinition.field_a), this.formatShortcutLabel(-6448, SetCountermeasureLauncherAimspeed.field_q, ComponentBehaviour.field_b)}, 90);
                  this.drawWorldHint(param0, param3, GetMutatorVotes.computeHintAlpha(HardpointMatch.hintTimers[0], 255), var16, var19, var20, 1619);
                }
                if (this.isHintCompleteAndHidden((byte) 11, 0) &&
                  !param12.getRepairModeOn(32)) {
                  var20_int = param12.chassis.collectWeapons(126, 0);
                  var21 = 0;
                  var22 = 0;
                  while (true) {
                    if (var22 < var20_int) {
                      var23 = GetPointDefenceLaserProjectileInterceptDamage.field_q[var22];
                      stackOut_81_0 = var23.isDestroyed((byte) 122);
                      stackIn_92_0 = stackOut_81_0 ? 1 : 0;
                      stackIn_82_0 = stackOut_81_0;
                      if (var43 == 0) {
                        if (!stackIn_82_0 &&
                          var23.weaponbehaviour.isReadyToFire((byte) 119)) {
                          var24_int = var23.getAimArc(-14);
                          if (var24_int != 0) {
                            var21 = 1;
                          }
                        }
                        var22++;
                        continue;
                      }
                    } else {
                      stackIn_92_0 = var21;
                    }
                    if (stackIn_92_0 != 0) {
                      this.advanceHintTimer(-26476, 1);
                    }
                    if (!this.isHintVisible(1, -60)) {
                      break;
                    }
                    var22 = 0;
                    var23_int = 0;
                    boolean decompiledNaturalLoopExit0 = false;
                    while (!(decompiledNaturalLoopExit0 = (var23_int >= var20_int))) {
                      var24 = GetPointDefenceLaserProjectileInterceptDamage.field_q[var23_int];
                      stackOut_100_0 = var24.isDestroyed((byte) 73);
                      stackIn_117_0 = stackOut_100_0 ? 1 : 0;
                      stackIn_101_0 = stackOut_100_0;
                      if (var43 == 0) {
                        if (!stackIn_101_0) {
                          var25 = var24.getAimArc(118);
                          if (var25 != 0) {
                            var26_int = GameKeyHandler.a(22433, var24.getUnrotatedWorldAngle((byte) -127) - var24.getAimArc(-61));
                            var27 = GameKeyHandler.a(22433, var24.getUnrotatedWorldAngle((byte) -127) + var24.getAimArc(-118));
                            var28 = var24.getWorldConnectionX(var24.getDefinition((byte) -112), (byte) -69);
                            var29 = var24.getWorldConnectionY(125, var24.getDefinition((byte) -112));
                            var30 = 8;
                            var31 = var28 + (GetNumStars.cosAngle(var26_int, (byte) -96) * var30 >> 1);
                            var32 = (TextureLineShape.sinAngle(var26_int, 44) * var30 >> 1) + var29;
                            var33 = (var30 * GetNumStars.cosAngle(var27, (byte) 109) >> 1) + var28;
                            var34 = (var30 * TextureLineShape.sinAngle(var27, 87) >> 1) + var29;
                            var35 = param3.worldToScreenX(var31, (byte) 118);
                            var36 = param3.worldToScreenY(true, var32);
                            var37 = param3.worldToScreenX(var33, (byte) 115);
                            var38 = param3.worldToScreenY(true, var34);
                            var39 = param3.worldToScreenX(var28, (byte) 115);
                            var40 = param3.worldToScreenY(true, var29);
                            var41 = 11142145;
                            var42 = GetMutatorVotes.computeHintAlpha(HardpointMatch.hintTimers[1], 255) >>> 2;
                            if (!var24.weaponbehaviour.canAimAtTarget(-26772, var18, var17, var24.getDefinition((byte) -112), var24)) {
                              if (PacketBuffer.field_g != 0) {
                                var41 = 16712705;
                              }
                            } else {
                              var41 = 16712705;
                              SetShowTutorial.a(var39, (byte) 66, var35, var40, 11142145, var36, var42);
                              var22 = 1;
                              SetShowTutorial.a(var39, (byte) 66, var37, var40, 11142145, var38, var42);
                            }
                            GetDebrisCarryOver.fillGradientTriangle(8, var36, 1, 131586, var39, var35, var38, var40, var41 | var42 << 24, var37, 131586);
                          }
                        }
                        var23_int++;
                        continue;
                      }
                      break;
                    }
                    if (decompiledNaturalLoopExit0) {
                      stackIn_117_0 = ~GetUseDetailLines.field_o;
                    }
                    if (stackIn_117_0 == 0 ||
                      -1 == GetTorpedoReload.field_q) {
                      var17 = param12.x;
                      var18 = param12.getBoundingbox((byte) -112)[2];
                      if ((var43 != 0) &&
                        (var22 != 0)) {
                        var24_intLifetime2 = PlayerGameData.field_b;
                        var25Lifetime1 = OpenGlFaceAttachment.field_b;
                        var26 = OpenGlVertexNormal.field_d[0];
                        var26.draw(-(var26.getWidth() / 2) + var24_intLifetime2, -(var26.getHeight() / 2) + var25Lifetime1, 0, 16777215 | GetMutatorVotes.computeHintAlpha(HardpointMatch.hintTimers[1], 255) << 24, 1);
                      }
                    } else {
                      if (var22 != 0) {
                        var24_intLifetime2 = PlayerGameData.field_b;
                        var25Lifetime1 = OpenGlFaceAttachment.field_b;
                        var26 = OpenGlVertexNormal.field_d[0];
                        var26.draw(-(var26.getWidth() / 2) + var24_intLifetime2, -(var26.getHeight() / 2) + var25Lifetime1, 0, 16777215 | GetMutatorVotes.computeHintAlpha(HardpointMatch.hintTimers[1], 255) << 24, 1);
                      }
                    }
                    var23_int = 1024;
                    var24_array = new int[]{-var23_int + var17, var23_int + var17, -var23_int + var18, var23_int + var18};
                    this.drawWorldHint(param0, param3, GetMutatorVotes.computeHintAlpha(HardpointMatch.hintTimers[1], 255), var16, var24_array, CarouselSlotStateDump.field_e, 1619);
                    break;
                  }
                }
                if (this.isHintCompleteAndHidden((byte) 11, 0) &&
                  this.isHintCompleteAndHidden((byte) 11, 1) &&
                  !param12.isSpecialOrderActive(4, 50)) {
                  if (GetUseDetailLines.field_o == -1 ||
                    -1 == GetTorpedoReload.field_q) {
                    var17 = param12.x;
                    var18 = param12.y;
                  }
                  var20_ref = param0.world.findNearestDraggableDebris(1, 2147483647, param12.getX(false), var17, var18, param12.getY((byte) 124));
                  if (var20_ref != null ||
                    param12.getDragging(-96) != -1) {
                    this.advanceHintTimer(-26476, 3);
                    if (param2 && (!(param0.world.countDebris(true) > 0) ||
                      !(param0.world.countDebris(true) > 1) &&
                      param12.getDragging(46) != -1)) {
                      this.completeHint((byte) 99, 3);
                      HardpointMatch.hintTimers[3] = 0;
                    }
                    if (param12.getDragging(-119) != -1) {
                      if (!param2) {
                        this.completeHint((byte) 123, 3);
                      }
                      HardpointMatch.hintTimers[3] = 0;
                    }
                    if (this.isHintVisible(3, -123)) {
                      var21_ref_int__ = var20_ref.getBoundingbox((byte) -82);
                      this.drawWorldHint(param0, param3, GetMutatorVotes.computeHintAlpha(HardpointMatch.hintTimers[3], 255), var16, var21_ref_int__, GetMissionVotes.field_o, 1619);
                      if ((var43 != 0) && (!TutorialProgressState.completedHints[3] &&
                        HardpointMatch.hintTimers[3] > 0)) {
                        HardpointMatch.hintTimers[3] = HardpointMatch.hintTimers[3] - 1;
                      }
                    }
                  } else {
                    if (!TutorialProgressState.completedHints[3] &&
                      HardpointMatch.hintTimers[3] > 0) {
                      HardpointMatch.hintTimers[3] = HardpointMatch.hintTimers[3] - 1;
                    }
                  }
                }
                if (this.isHintCompleteAndHidden((byte) 11, 0) &&
                  this.isHintCompleteAndHidden((byte) 11, 1)) {
                  this.advanceHintTimer(-26476, 2);
                  if (!(GetPointDefenceLaserPulsetime.field_o >= 0) ||
                    SetMachineGunEnergyUsed.field_o[GetUseCircleOutline.field_p] ||
                    SetMachineGunEnergyUsed.field_o[GetPointDefenceLaserRandomness.field_r]) {
                    GetPointDefenceLaserReload.field_p = true;
                  }
                  if (!(GetPointDefenceLaserPulsetime.field_o <= 0) ||
                    SetMachineGunEnergyUsed.field_o[GetTorpedoProjectileLife.field_o] ||
                    SetMachineGunEnergyUsed.field_o[PlayerAction.field_n]) {
                    nqa.field_c = true;
                  }
                  if (GetPointDefenceLaserReload.field_p &&
                    nqa.field_c) {
                    this.completeHint((byte) 83, 2);
                  }
                  if (this.isHintVisible(2, -104)) {
                    var20_int = param10 / 2;
                    var21 = param5 / 4;
                    var22_ref_int__ = new int[]{var20_int, var21};
                    this.drawHintCallout(var22_ref_int__, param3, false, GetMutatorVotes.computeHintAlpha(HardpointMatch.hintTimers[2], 255), param0, false, UiAngleDialRenderer.field_f, var16, (byte) 116);
                  }
                }
                if (this.isHintCompleteAndHidden((byte) 11, 0) &&
                  this.isHintCompleteAndHidden((byte) 11, 1) &&
                  var14_int == 5) {
                  var20_int = GetUseNiceTrails.fogOfWarSensorRange;
                  var21_ref_int__Lifetime1 = new int[]{param12.getX(false) - var20_int, -var20_int + param12.getX(false), param12.getY((byte) 127), param12.getY((byte) 124)};
                  if (param3.worldBounds[0] >= var21_ref_int__Lifetime1[0] &&
                    param3.worldBounds[1] <= var21_ref_int__Lifetime1[1] &&
                    var21_ref_int__Lifetime1[2] <= param3.worldBounds[2] &&
                    var21_ref_int__Lifetime1[3] >= param3.worldBounds[3]) {
                    stackIn_236_0 = 0;
                  } else {
                    stackIn_236_0 = 1;
                  }
                  var22 = stackIn_236_0;
                  if (var22 != 0) {
                    var23_int = Particle.field_l * 5 + 100;
                    var24_intLifetime1 = GetMassDriverFireForce.activeHintIndex;
                    GetMassDriverFireForce.activeHintIndex = -1;
                    this.advanceHintTimer((byte) 113, var23_int, 4);
                    if (~HardpointMatch.hintTimers[4] == ~var23_int) {
                      this.completeHint((byte) 113, 4);
                    }
                    if (this.isHintVisible(4, -124)) {
                      this.drawWorldHint(param0, param3, GetMutatorVotes.computeHintAlpha(HardpointMatch.hintTimers[4], 255), var16, var21_ref_int__Lifetime1, OpenGlFaceAttachment.field_a, 1619);
                    }
                    GetMassDriverFireForce.activeHintIndex = var24_intLifetime1;
                  }
                  var20_ref2 = new IntrusiveDeque();
                  param12.collectSpecialOrderStatuses(var20_ref2, 9, param2, param0.world.isBodyIdReserved(param12.getId(false), (byte) 21));
                  if (var20_ref2.size(3) > 1) {
                    this.advanceHintTimer(-26476, 9);
                    if (SetMachineGunEnergyUsed.field_o[81]) {
                      this.completeHint((byte) 127, 9);
                    }
                    if (this.isHintVisible(9, -56)) {
                      var21 = 172;
                      var22 = param5 - 58;
                      var23_array = new int[]{var21, var22};
                      this.drawHintCallout(var23_array, param3, false, GetMutatorVotes.computeHintAlpha(HardpointMatch.hintTimers[9], 255), param0, false, TextureCombineSource.field_b, var16, (byte) -47);
                    }
                  }
                  if (this.isHintCompleteAndHidden((byte) 11, 9)) {
                    this.advanceHintTimer(-26476, 10);
                    if (null != es.field_b &&
                      es.field_b.blueprint != null) {
                      this.completeHint((byte) 123, 10);
                    }
                    if (this.isHintVisible(10, -61)) {
                      var21_ref_int__Lifetime1Lifetime1 = this.findOrderButtonBounds(11, param9, 30, param4, param3, param6, param5, param1);
                      if (null != var21_ref_int__Lifetime1Lifetime1) {
                        var22_ref_String = SetReverbGain.a(SetCountermeasureLauncherAimarc.field_o, new String[]{SetTorpedoProjectileDamage.field_q[SetDetachmentMode.field_p]}, 110);
                        this.drawHintCallout(var21_ref_int__Lifetime1Lifetime1, param3, true, GetMutatorVotes.computeHintAlpha(HardpointMatch.hintTimers[10], 255), param0, true, var22_ref_String, var16, (byte) -50);
                      }
                    }
                  }
                  if (DeveloperAccess.hasDeveloperAccess(2) &&
                    SetMachineGunEnergyUsed.field_o[101]) {
                    this.completeHint((byte) 118, 10);
                  }
                  var21_ref_int__Lifetime1Lifetime2 = new int[2];
                  param12.chassis.accumulateHealth(var21_ref_int__Lifetime1Lifetime2, (byte) -17, true);
                  var22 = var21_ref_int__Lifetime1Lifetime2[0] * 256 / var21_ref_int__Lifetime1Lifetime2[1];
                  var21_ref_int__Lifetime1Lifetime2[0] = 0;
                  var21_ref_int__Lifetime1Lifetime2[1] = 0;
                  param12.chassis.accumulateHealth(var21_ref_int__Lifetime1Lifetime2, (byte) -17, false);
                  var23_int = 256 * var21_ref_int__Lifetime1Lifetime2[0] / var21_ref_int__Lifetime1Lifetime2[1];
                  if (var22 < var23_int) {
                    this.advanceHintTimer(-26476, 5);
                  }
                  if ((var22 >= var23_int ||
                    var43 != 0) &&
                    0 < HardpointMatch.hintTimers[5]) {
                    HardpointMatch.hintTimers[5] = HardpointMatch.hintTimers[5] - 1;
                  }
                  if (param12.isSpecialOrderActive(4, 75)) {
                    this.completeHint((byte) 118, 5);
                  }
                  if (this.isHintVisible(5, -12)) {
                    var24_arrayLifetime1 = this.findOrderButtonBounds(4, param9, 30, param4, param3, param6, param5, param1);
                    if (var24_arrayLifetime1 != null) {
                      this.drawHintCallout(var24_arrayLifetime1, param3, true, GetMutatorVotes.computeHintAlpha(HardpointMatch.hintTimers[5], 255), param0, true, SetMissionVotes.field_o, var16, (byte) 98);
                    }
                  }
                  if (param12.isSpecialOrderActive(4, 72)) {
                    if (param12.isRepairModeFullyCharged(-50)) {
                      this.advanceHintTimer(-26476, 6);
                    }
                    if (!param12.getRepairModeOn(32)) {
                      this.completeHint((byte) 106, 6);
                    }
                  }
                  if (this.isHintVisible(6, -88)) {
                    var21_ref_int__Lifetime1Lifetime3 = this.findOrderButtonBounds(4, param9, 30, param4, param3, param6, param5, param1);
                    if (var21_ref_int__Lifetime1Lifetime3 != null) {
                      this.drawHintCallout(var21_ref_int__Lifetime1Lifetime3, param3, true, GetMutatorVotes.computeHintAlpha(HardpointMatch.hintTimers[6], 255), param0, true, GetMissionTerrainVotingChancestep.field_p, var16, (byte) 102);
                    }
                  }
                  var21_ref_int__Lifetime1Lifetime4 = this.findOrderButtonBounds(0, param9, 30, param4, param3, param6, param5, param1);
                  if (null != var21_ref_int__Lifetime1Lifetime4) {
                    this.advanceHintTimer(-26476, 7);
                    if (param7 == 0) {
                      this.completeHint((byte) 82, 7);
                      if (this.isHintCompleteAndHidden((byte) 11, 7) &&
                        GetUseDetailLines.field_o != -1 &&
                        GetTorpedoReload.field_q != -1) {
                        this.advanceHintTimer(-26476, 8);
                        if (this.isHintVisible(8, -43)) {
                          var22 = 1024;
                          var23_arrayLifetime1 = new int[]{var17 - var22, var17 + var22, -var22 + var18, var18 + var22};
                          this.drawHintCallout(var23_arrayLifetime1, param3, false, GetMutatorVotes.computeHintAlpha(HardpointMatch.hintTimers[8], 255), param0, true, SpriteTextureOperation.field_i, var16, (byte) -115);
                        }
                      }
                    }
                    if (this.isHintVisible(7, -106)) {
                      this.drawHintCallout(var21_ref_int__Lifetime1Lifetime4, param3, true, GetMutatorVotes.computeHintAlpha(HardpointMatch.hintTimers[7], 255), param0, true, OpenGlArbProgram.field_b, var16, (byte) 60);
                    }
                  }
                  if (this.isHintCompleteAndHidden((byte) 11, 10) &&
                    param2) {
                    this.completionFadeTime = this.completionFadeTime + 1;
                    var21 = -100 + this.completionFadeTime;
                    if (var21 > 0) {
                      if (var21 > 200) {
                        var21 = 200;
                      }
                      SetBombletSprayEnergyUsed.drawCenteredMessagePanel(165, (byte) -127, 2, SetMassDriverProjectileDamage.field_p, var21);
                    }
                  }
                }
              }
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var14 = decompiledCaughtException;
          stackIn_353_0 = var14;
          stackIn_353_1 = new StringBuilder().append("bv.A(");
          if (param0 == null) {
            stackIn_354_2 = "null";
          } else {
            stackIn_354_2 = "{...}";
          }
          stackIn_357_1 = ((StringBuilder) (Object) stackIn_353_1).append(stackIn_354_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_358_2 = "null";
          } else {
            stackIn_358_2 = "{...}";
          }
          stackIn_361_1 = ((StringBuilder) (Object) stackIn_357_1).append(stackIn_358_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_362_2 = "null";
          } else {
            stackIn_362_2 = "{...}";
          }
          stackIn_365_1 = ((StringBuilder) (Object) stackIn_361_1).append(stackIn_362_2).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_366_2 = "null";
          } else {
            stackIn_366_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_353_0), ((StringBuilder) (Object) stackIn_365_1).append(stackIn_366_2).append(')').toString());
        }
    }

    static {
        field_a = SetSniperCannonEnergyUsed.f((byte) -49);
        field_e = 2;
    }
}
