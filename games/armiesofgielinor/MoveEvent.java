/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MoveEvent extends GameEvent {
    static int[] field_F;
    static MatchSetupPanel matchSetupPanel;
    static RgbSprite field_z;
    static int[][] tutorialStageItems;
    int[] pathDirections;
    static CampaignMenu campaignMenu;
    static InstructionsPanel instructionsPanel;
    static TutorialLayout tutorialLayout;
    int startY;
    private boolean applied;
    static boolean field_J;
    int startX;

    final String describeEvent(byte obfuscationGuard, boolean verbose) {
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        String stackIn_49_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var4Lifetime1;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameCompleted1 = true;
          if (verbose) {
            System.out.println("Move event debug");
            System.out.println("Unit at " + this.startX + "," + this.startY);
            var3_int = 0;
            while (var3_int < this.pathDirections.length) {
              var4 = this.pathDirections[var3_int];
              stackIn_38_0 = -2;
              stackIn_38_1 = ~var4;
              if (var6 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameRemainder1 = true;
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_38_0 == stackIn_38_1 &&
                var6 == 0) {
                System.out.println("North");
                decompiledFrameRemainder2 = false;
              } else {
                if ((var4 != 2) &&
                  (decompiledFrameRemainder0 = (0 != var4 ||
                  var6 != 0))) {
                  decompiledFrameRemainder1 = (3 != var4);
                  decompiledFrameRemainder2 = !(decompiledFrameRemainder1);
                }
              }
              if ((decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1) &&
                (decompiledFrameRemainder0)) {
                System.out.println("South");
                decompiledFrameRemainder2 = false;
              }
              if ((decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1)) {
                System.out.println("East");
                decompiledFrameRemainder2 = false;
              }
              if (decompiledFrameRemainder2) {
                System.out.println("West");
              }
              var3_int++;
            }
          }
          if (decompiledFrameCompleted1) {
            stackIn_38_0 = -3;
            stackIn_38_1 = (obfuscationGuard - 53) / 51;
          }
          boolean decompiledFrameCompleted0 = true;
          var4Lifetime1 = stackIn_38_0 / stackIn_38_1;
          var3 = "EventMove: start: (" + this.startX + ", " + this.startY + ")" + "\n";
          if (null != this.pathDirections) {
            var3 = var3 + "footsteps[" + this.pathDirections.length + "]: (";
            var5 = 0;
            while (var5 < this.pathDirections.length) {
              var3 = var3 + this.pathDirections[var5];
              var5++;
              if (var6 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              var3 = var3 + ")";
            }
          }
          stackIn_49_0 = var3;
          return stackIn_49_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3_ref), "kr.C(" + obfuscationGuard + ',' + verbose + ')');
        }
    }

    final boolean a(NodeDeque param0, byte param1, GameplayController param2) {
        RuntimeException var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -84) {
            stackIn_4_0 = this.a((byte) -39, param2, param0, true);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("kr.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(ResourceArchive param0, boolean param1, ResourceArchive param2, ResourceArchive param3) {
        int stackIn_23_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RgbSprite var4 = null;
        RuntimeException var4_ref = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        IndexedSprite[] var10 = null;
        RgbSprite var10_ref = null;
        int var11_int = 0;
        RgbSprite var11 = null;
        RgbSprite var12 = null;
        int var13 = 0;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          t.field_d = fk.a("frame_top", (byte) -124, param2, "commonui");
          ip.field_c = fk.a("frame_bottom", (byte) -125, param2, "commonui");
          gt.field_e = GameplayController.a("jagex_logo_grey", (byte) 51, "commonui", param2);
          NodeIterator.field_b = fk.a("button", (byte) -124, param2, "commonui");
          db.field_a = ac.a(param2, "validation", (byte) -4, "commonui");
          gl.field_e = (BitmapFont) ((Object) it.a("arezzo12", param2, param3, (byte) -87, "commonui"));
          ArmiesOfGielinor.field_J = (BitmapFont) ((Object) it.a("arezzo14", param2, param3, (byte) -87, "commonui"));
          CipherPacketBuffer.field_t = (BitmapFont) ((Object) it.a("arezzo14bold", param2, param3, (byte) -87, "commonui"));
          var4 = new RgbSprite(param0.getFileByName("", 45, "button.gif"), (java.awt.Component) ((Object) IndexedSpriteBase.field_b));
          if (param1) {
            MoveEvent.g(90);
          }
          pv.a("commonui", "dropdown", param2, 24914);
          var5 = MapLayout.a("screen_options", -28106, "commonui", param2);
          oa.field_H = new IndexedSprite[4];
          dq.field_e = new IndexedSprite[4];
          tg.field_b = new IndexedSprite[4];
          var6 = new IndexedSprite[][]{oa.field_H, dq.field_e, tg.field_b};
          var7 = new int[4][];
          var7[0] = var5[0].palette;
          var8 = 1;
          do {
            if (var8 >= var7.length) {
              var8 = var5[0].pixelIndices[0];
              var7[2][var8] = 16777215;
              var7[1][var8] = 2394342;
              var7[3][var8] = 4767999;
              break;
            }
            var7[var8] = (int[]) ((Object) var7[0].clone());
            var8++;
          } while (var13 == 0);
          var9 = 0;
          scanLoop1: while (true) {
            if (var9 < 3) {
              var10 = var6[var9];
              stackIn_23_0 = 0;
              if (var13 != 0) {
                break scanLoop1;
              }
              var11_int = stackIn_23_0;
              while (var10.length > var11_int) {
                var10[var11_int] = vf.a(var7[var11_int], -13546, var5[var9]);
                var11_int++;
              }
              var9++;
              continue scanLoop1;
            }
            var9 = var4.pixelHeight;
            rq.a((byte) -56);
            var4.b();
            stackIn_23_0 = 0;
            break;
          }
          SoftwareRaster.c(stackIn_23_0, 0, SoftwareRaster.width, SoftwareRaster.height);
          var10_ref = new RgbSprite(var9, var9);
          var10_ref.b();
          var4.f(0, 0);
          var11 = new RgbSprite(var9, var9);
          var11.b();
          var4.f(-var4.pixelWidth + var9, 0);
          var12 = new RgbSprite(-(var9 * 2) + var4.pixelWidth, var9);
          var12.b();
          var4.f(-var9, 0);
          rf.b(-18862);
          NodeIterator.field_b = new RgbSprite[]{var10_ref, var12, var11};
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_28_0 = var4_ref;
          stackIn_28_1 = new StringBuilder().append("kr.D(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param3 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final void applyToBattlefield(Battlefield battlefield, int obfuscationGuard) {
        int stackIn_19_0 = 0;
        RuntimeException stackIn_145_0 = null;
        StringBuilder stackIn_145_1 = null;
        String stackIn_146_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        MapTile var5 = null;
        Unit var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        MapTile var9 = null;
        int var10_int = 0;
        MapTile var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.applied) {
            return;
          }
          this.applied = true;
          var3_int = this.startX;
          var4 = this.startY;
          if (obfuscationGuard != -26661) {
            field_J = false;
          }
          var5 = battlefield.tiles[this.startX + this.startY * battlefield.mapWidth];
          var6 = var5.occupant;
          if (null == var6) {
            return;
          }
          var7 = 0;
          if (battlefield.tiles[this.startX + battlefield.mapWidth * this.startY].terrainType != 6 &&
            battlefield.tiles[this.startX + battlefield.mapWidth * this.startY].terrainType != 4 &&
            battlefield.tiles[this.startY * battlefield.mapWidth + this.startX].terrainType != 10) {
            stackIn_19_0 = 0;
          } else {
            stackIn_19_0 = 1;
          }
          var8 = stackIn_19_0;
          var9_int = 0;
          while (this.pathDirections.length > var9_int) {
            var10_int = this.pathDirections[var9_int];
            switch ((var12 == 0
              || var10_int == 1
              || var10_int == 3
              ) ? var10_int : -1) {
              case 1:
                var4--;
                if (var12 == 0) {
                  break;
                }
              case 2:
                var4++;
                if (var12 == 0) {
                  break;
                }
              case 0:
                var3_int++;
                if (var12 == 0) {
                  break;
                }
              case 3:
                var3_int--;
              default:
                break;
            }
            boolean decompiledFrameRemainder0 = true;
            var10 = battlefield.tiles[var4 * battlefield.mapWidth + var3_int];
            var11 = var10.terrainType;
            if (62 != var6.unitType ||
              var11 != 2 ||
              this.pathDirections.length != 1) {
              if (29 == var6.unitType) {
                if (var11 == 3) {
                  battlefield.setTerrainType((byte) 10, 0, var3_int, var4);
                  var7 = 1;
                  decompiledFrameRemainder0 = (var12 != 0);
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = (battlefield.campaignMission != null)) &&
                  (decompiledFrameRemainder0 = (var11 == 7 ||
                  var11 == 11)) &&
                  (decompiledFrameRemainder0 = !(!var6.hasMovementFlag1(false))) &&
                  (decompiledFrameRemainder0 = !(var10.isAlliedToPlayer(var6.ownerPlayer, (byte) 91))) &&
                  (decompiledFrameRemainder0 = (var10.ownerPlayer != -1))) {
                  var7 = 1;
                  battlefield.setTerrainType((byte) 127, 1, var3_int, var4);
                  decompiledFrameRemainder0 = (var12 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (var6.unitType == 40 &&
                  0 == var11) {
                  var7 = 1;
                  battlefield.setTerrainType((byte) 6, 3, var3_int, var4);
                  decompiledFrameRemainder0 = (var12 != 0);
                }
                if ((decompiledFrameRemainder0) &&
                  (this.unit.unitType == 73) &&
                  (var8 != 0)) {
                  if (var11 == 0) {
                    battlefield.setTerrainType((byte) -59, 4, var3_int, var4);
                    var7 = 1;
                  }
                  if (var11 == 1) {
                    battlefield.setTerrainType((byte) -100, 10, var3_int, var4);
                    var7 = 1;
                    if (var12 != 0) {
                      battlefield.setTerrainType((byte) 113, 0, var3_int, var4);
                      var7 = 1;
                    }
                  }
                }
              }
            } else {
              battlefield.setTerrainType((byte) 113, 0, var3_int, var4);
              var7 = 1;
            }
            var9_int++;
            if (var12 == 0) {
              continue;
            }
            break;
          }
          var9 = battlefield.tiles[battlefield.mapWidth * var4 + var3_int];
          if (var6.unitType != 39) {
            if (var6.tileX != var3_int ||
              var6.tileY != var4) {
              boolean decompiledSharedTail0 = !(!var6.packedFlag256);
              if (!decompiledSharedTail0) {
                var5.occupant = null;
                var5.captureStrength = var5.getDefaultCaptureStrength(10);
                decompiledSharedTail0 = (var12 != 0);
              }
              if (decompiledSharedTail0) {
                var6.packedFlag256 = false;
                this.unit.packedFlag256 = false;
                battlefield.registerUnit(8288, this.unit);
              }
              this.unit.tileY = var4;
              this.unit.tileX = var3_int;
              this.unit.refreshTileEffects((byte) 106);
              var10 = var9;
              if (var6.p(-75)) {
                var7 = 3;
              }
              if (!var10.hasModifierFlag4((byte) -118) ||
                ~var10.ownerPlayer != ~this.unit.ownerPlayer) {
                var10.occupant = this.unit;
                if (!(0 >= var7)) {
                  battlefield.a(var4, var3_int, 0, var7);
                  if (var12 != 0) {
                    this.unit.escortComplete = true;
                    this.unit.removedFromActivePlay = true;
                    this.unit.unlink(-109);
                    battlefield.checkPlayerVictory(0, this.unit.ownerPlayer);
                  }
                }
              } else {
                this.unit.escortComplete = true;
                this.unit.removedFromActivePlay = true;
                this.unit.unlink(-109);
                battlefield.checkPlayerVictory(0, this.unit.ownerPlayer);
              }
              if (var7 > 0) {
                battlefield.a(this.startY, this.startX, obfuscationGuard + 26661, var7);
                nk.a((byte) 101);
              }
              if (var12 != 0) {
                var6.movementSpent = true;
                var9.occupant = var6.copyDetached(false);
                var9.occupant.tileX = var3_int;
                var9.occupant.tileY = var4;
                var9.occupant.refreshTileEffects((byte) -35);
                var9.occupant.movementSpent = true;
                battlefield.registerUnit(obfuscationGuard ^ -18501, var9.occupant);
              }
            }
          } else {
            var6.movementSpent = true;
            var9.occupant = var6.copyDetached(false);
            var9.occupant.tileX = var3_int;
            var9.occupant.tileY = var4;
            var9.occupant.refreshTileEffects((byte) -35);
            var9.occupant.movementSpent = true;
            battlefield.registerUnit(obfuscationGuard ^ -18501, var9.occupant);
          }
          this.unit.movementSpent = true;
          fl.a(battlefield, obfuscationGuard ^ 26718);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_145_0 = var3;
          stackIn_145_1 = new StringBuilder().append("kr.G(");
          if (battlefield == null) {
            stackIn_146_2 = "null";
          } else {
            stackIn_146_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_145_0), ((StringBuilder) (Object) stackIn_145_1).append(stackIn_146_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void g(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_F = null;
          field_z = null;
          matchSetupPanel = null;
          instructionsPanel = null;
          if (param0 != 29333) {
            MoveEvent.g(-45);
          }
          campaignMenu = null;
          tutorialLayout = null;
          tutorialStageItems = (int[][]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "kr.B(" + param0 + ')');
        }
    }

    MoveEvent(int startX, int startY, int[] pathDirections) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.applied = false;
        try {
          this.startX = startX;
          this.eventKind = 0;
          this.pathDirections = pathDirections;
          this.startY = startY;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("kr.<init>(").append(startX).append(',').append(startY).append(',');
          if (pathDirections == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        tutorialStageItems = new int[29][];
        field_F = new int[]{1000, 1150, 850, 1300, 700};
        field_J = true;
        tutorialLayout = new TutorialLayout();
        EquipmentBattleTutorial.configureTutorialStage(24, 0, 180, 460, 160, 465, new int[]{32, 31, 47, 1, 25, 30, 40, 35, 5, 48, 19, 16}, -59);
        EquipmentBattleTutorial.configureTutorialStage(30, 23, 180, 460, 160, 320, new int[]{3, 53, 54, 4, 7}, -52);
        bt.a(26);
        EquipmentBattleTutorial.configureTutorialStage(30, 1, 180, 460, 100, 400, new int[]{2, 17, 18, 36, 37, 38, 5, 9}, -90);
        EquipmentBattleTutorial.configureTutorialStage(30, 24, 180, 460, 100, 400, new int[]{2, 17, 18, 36, 37, 38, 5, 50, 9}, -43);
        EquipmentBattleTutorial.configureTutorialStage(30, 2, 180, 460, 100, 400, new int[]{2, 43, 5, 10, 11, 13}, -75);
        EquipmentBattleTutorial.configureTutorialStage(30, 19, 180, 460, 100, 170, new int[]{45, 42}, -115);
        EquipmentBattleTutorial.configureTutorialStage(30, 25, 180, 460, 100, 170, new int[]{52, 51}, -54);
        EquipmentBattleTutorial.configureTutorialStage(30, 3, 180, 460, 100, 400, new int[]{2, 17, 18, 36, 37, 38, 5, 12, 13}, -41);
        EquipmentBattleTutorial.configureTutorialStage(30, 4, 180, 460, 100, 400, new int[]{2, 17, 18, 36, 37, 38, 5, 13}, -86);
        EquipmentBattleTutorial.configureTutorialStage(30, 6, 180, 460, 400, 460, new int[]{20, 8}, -115);
        EquipmentBattleTutorial.configureTutorialStage(30, 26, 180, 460, 400, 460, new int[]{20, 8}, -51);
        EquipmentBattleTutorial.configureTutorialStage(30, 27, 180, 460, 400, 460, new int[]{20, 8}, -111);
        EquipmentBattleTutorial.configureTutorialStage(30, 28, 180, 460, 400, 460, new int[]{20, 8}, -117);
        EquipmentBattleTutorial.configureTutorialStage(30, 12, 60, 580, 440, 470, new int[]{41, 24, 44, 7}, -114);
        EquipmentBattleTutorial.configureTutorialStage(30, 13, 60, 580, 440, 470, new int[]{7}, -78);
        EquipmentBattleTutorial.configureTutorialStage(30, 20, 60, 580, 440, 470, new int[]{41, 24, 44, 7}, -95);
        vt.a(-120);
        EquipmentBattleTutorial.configureTutorialStage(30, 8, 280, 360, 438, 440, new int[]{20, 8}, -119);
        EquipmentBattleTutorial.configureTutorialStage(30, 9, 280, 360, 438, 440, new int[]{7}, -27);
        EquipmentBattleTutorial.configureTutorialStage(30, 10, 180, 460, 400, 460, new int[]{20, 21}, -70);
        EquipmentBattleTutorial.configureTutorialStage(30, 11, 100, 540, 100, 400, new int[]{7}, -52);
        EquipmentBattleTutorial.configureTutorialStage(30, 15, 180, 460, 100, 400, new int[]{}, -102);
        EquipmentBattleTutorial.configureTutorialStage(30, 14, 180, 460, 120, 350, new int[]{17, 18, 36, 37, 38, 6, 7}, -96);
        EquipmentBattleTutorial.configureTutorialStage(30, 16, 532, 633, 390, 420, new int[]{39}, -36);
        EquipmentBattleTutorial.configureTutorialStage(30, 17, 180, 460, 100, 400, new int[]{2, 17, 18, 36, 37, 38, 43}, -63);
        EquipmentBattleTutorial.configureTutorialStage(30, 18, 60, 580, 440, 470, new int[]{41, 24, 44, 7}, -87);
        df.a(-20);
    }
}
