/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class UnitInfoPopup extends IntrusiveNode {
    private int scrollPauseFrames;
    static NodeDeque field_u;
    private boolean scrollForward;
    private int screenY;
    private int nameScrollOffset;
    private int screenX;
    static long field_s;
    Unit unit;
    private int maximumNameScroll;
    private int fadeOffset;
    static String field_l;

    final static QuickChatCommandDefinition getQuickChatCommand(int startIndex, int commandId) {
        int var3 = 0;
        QuickChatCommandDefinition[] var2;
        int var4;
        QuickChatCommandDefinition[] var5;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var5 = AccountNameAvailabilityValidator.getQuickChatCommands((byte) 105);
        var2 = var5;
        for (var3 = startIndex; var5.length > var3; var3++) {
          if (var5[var3].commandId == commandId) {
            return var5[var3];
          }
        }
        return null;
    }

    final void a(Unit param0, int param1, int param2, int param3, int param4, Battlefield param5) {
        String var7 = null;
        int var8 = 0;
        int var13 = 0;
        BinaryBitmapFont stackIn_3_0;
        String stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        int[][] stackIn_3_4;
        int stackIn_4_5 = 0;
        BinaryBitmapFont stackIn_8_0;
        String stackIn_8_1;
        int stackIn_8_2;
        int stackIn_8_3;
        int[][] stackIn_8_4;
        int stackIn_9_5 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var9Lifetime1;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          SpellConfirmationDialog.field_j.b();
          SoftwareRaster.b();
          fe.b(0, 0, 134, 61, MusicPatch.field_m, ConsoleValue.field_b, 0, 0);
          qt.field_e.drawOpaque(2, 2);
          SoftwareRaster.b(5, 5, 124, 18, 0, 192);
          SoftwareRaster.b(5, 25, 30, 30, 0, 192);
          var7 = this.unit.displayName;
          SoftwareRaster.setClip(5, param2, 95, 23);
          stackIn_3_0 = DateInputWidget.field_E;
          stackIn_3_1 = var7;
          stackIn_3_2 = 10 - (this.nameScrollOffset >> 1);
          stackIn_3_3 = 17;
          stackIn_3_4 = op.field_c;
          if (param5.teamGame) {
            stackIn_4_5 = 1;
          } else {
            stackIn_4_5 = 0;
          }
          ((BinaryBitmapFont) (Object) stackIn_3_0).drawText(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4[stackIn_4_5][this.unit.ownerPlayer], -1);
          SoftwareRaster.a();
          var8 = this.unit.getEffectiveStrength((byte) 122);
          if (var8 < 0) {
            var8 = 0;
          }
          stackIn_8_0 = DateInputWidget.field_E;
          stackIn_8_1 = var8 + "/" + this.unit.maximumStrength;
          stackIn_8_2 = 126;
          stackIn_8_3 = 18;
          stackIn_8_4 = op.field_c;
          if (!param5.teamGame) {
            stackIn_9_5 = 0;
          } else {
            stackIn_9_5 = 1;
          }
          ((BinaryBitmapFont) (Object) stackIn_8_0).drawRightAligned(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4[stackIn_9_5][this.unit.ownerPlayer], -1);
          if (param1 == this.unit.ownerPlayer) {
            SoftwareRaster.b(99, 25, 30, 30, 0, 128);
            SoftwareRaster.b(53, 25, 30, 30, 0, 128);
            var9 = this.unit.l(-27014);
            cp.field_e[eb.bitCount((byte) -97, ~var9 & 3)].draw(56, 25);
          } else {
            if (param0 == null) {
              SoftwareRaster.b(99, 25, 30, 30, 0, 128);
            } else {
              SoftwareRaster.b(37, 25, 92, 30, 0, 128);
              ProgressMessageDialog.field_rb[param0.getUnitCategory(0)].draw(43, 32);
              sg.field_b[this.a(param0.getUnitCategory(0), this.unit.getUnitCategory(param2 - 5), -46)].draw(75, 32);
            }
          }
          ProgressMessageDialog.field_rb[this.unit.getUnitCategory(0)].draw(106, 32);
          DateInputWidget.field_E.drawCentered(-param5.getDamageTakenPercent(param5.mapWidth * this.unit.tileY + this.unit.tileX, param2 - 9, this.unit) + 100 + "%", 20, 45, 16777215, -1);
          EventPresenter.field_t.drawShadedGrayscale(68, 60, ConsoleValue.field_b[-1 + ConsoleValue.field_b.length]);
          so.field_b.a(param2 + 5600);
          var9Lifetime1 = this.screenX - param3 - 75;
          var10 = this.screenY - (param4 + 80);
          SpellConfirmationDialog.field_j.drawWithOpacity(var9Lifetime1, var10, -this.fadeOffset + 32 << 3);
          var11 = bw.unitDefinitions[this.unit.unitType][12];
          if (var11 != -1) {
            PreparedAction.a(32 - this.fadeOffset << 3, true, var9Lifetime1 + 96, e.field_b, 40, 60 + var10);
            if (var11 < lb.field_e.length) {
              lb.field_e[var11].drawAlpha(var9Lifetime1 + 101, var10 + 58, -this.fadeOffset + 32 << 3);
            }
          }
          var12 = this.unit.f(param2 + 11);
          if (var12 != -1) {
            PreparedAction.a(-this.fadeOffset + 32 << 3, true, var9Lifetime1, e.field_b, 40, var10 + 60);
            ii.field_a[var12].drawScaledWithOpacity(var9Lifetime1 + 8, 60 + var10, 24, 24, -this.fadeOffset + 32 << 3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_23_0 = var7_ref;
          stackIn_23_1 = new StringBuilder().append("fi.C(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = fk.matchupDamagePercent[param1][param0];
        int var5 = fk.matchupDamagePercent[param0][param1];
        if (var5 < var4) {
          if (-var5 + var4 <= 45) {
            return 1;
          }
          return 0;
        }
        if (param2 != -46) {
          return 26;
        }
        if (var4 >= var5) {
          return 2;
        }
        if (45 < -var4 + var5) {
          return 4;
        }
        return 3;
    }

    public static void a(int param0) {
        field_l = null;
        field_u = null;
        if (param0 > -24) {
          field_s = 68L;
        }
    }

    final void advanceAnimation(byte obfuscationGuard, boolean show) {
        int var4;
        Battlefield var5;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (show) {
          if (this.fadeOffset > 0) {
            this.fadeOffset = this.fadeOffset - 4;
          } else {
            if (this.maximumNameScroll > 0) {
              if (this.scrollForward) {
                if (this.nameScrollOffset < this.maximumNameScroll) {
                  this.nameScrollOffset = this.nameScrollOffset + 1;
                }
                if (this.nameScrollOffset >= this.maximumNameScroll) {
                  this.scrollPauseFrames = this.scrollPauseFrames - 1;
                  if (this.scrollPauseFrames <= 0) {
                    this.scrollPauseFrames = 50;
                    this.scrollForward = false;
                  }
                }
              } else {
                if (this.nameScrollOffset > 0) {
                  this.nameScrollOffset = this.nameScrollOffset - 1;
                }
                if (this.nameScrollOffset <= 0) {
                  this.scrollPauseFrames = this.scrollPauseFrames - 1;
                  if (this.scrollPauseFrames <= 0) {
                    this.scrollPauseFrames = 50;
                    this.scrollForward = true;
                  }
                }
              }
            }
          }
        } else {
          if (this.fadeOffset < 32) {
            this.fadeOffset = this.fadeOffset + 4;
          }
          if (this.fadeOffset >= 32) {
            this.unlink(108);
          }
        }
        if (obfuscationGuard > -100) {
          var5 = (Battlefield) null;
          this.a((Unit) null, -88, 39, -11, 35, (Battlefield) null);
        }
    }

    UnitInfoPopup(Unit param0, int param1, int param2) {
        try {
          this.screenX = param1;
          this.fadeOffset = 32;
          this.scrollForward = false;
          this.nameScrollOffset = 0;
          this.unit = param0;
          this.screenY = param2;
          this.maximumNameScroll = -110 + rs.field_n.textWidth(this.unit.displayName);
          if (this.maximumNameScroll < 0) {
            this.maximumNameScroll = 0;
          }
          this.scrollPauseFrames = 100;
          this.maximumNameScroll = this.maximumNameScroll << 1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void paintRandomTerrainPath(int startX, byte obfuscationGuard, int terrainType, int startY, int endX, boolean allowLavaCrossings, int endY, Battlefield battlefield, Random random) {
        MapTile[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_26_0;
        MapTile[] stackIn_26_1;
        int stackIn_26_2;
        int stackIn_26_3;
        int stackIn_27_4 = 0;
        Object stackIn_31_0;
        MapTile[] stackIn_31_1;
        int stackIn_31_2;
        int stackIn_31_3;
        int stackIn_31_4;
        int stackIn_32_5 = 0;
        int stackIn_35_0;
        MapTile[] stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        int stackIn_36_4 = 0;
        int stackIn_41_0 = 0;
        boolean stackIn_43_1 = false;
        int stackIn_44_2 = 0;
        int stackIn_47_3 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_58_1 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Random var14 = null;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var9_int = -startX + endX;
          var10 = -startY + endY;
          if (obfuscationGuard != 101) {
            var14 = (Random) null;
            UnitInfoPopup.paintRandomTerrainPath(-20, (byte) 51, -30, 104, -20, false, -76, (Battlefield) null, (Random) null);
          }
          var11 = 0;
          var12 = 0;
          while (true) {
            if (var10 == var11 &&
              var9_int == var12) {
              return;
            }
            if (battlefield.tiles[var12 + startX + (var11 + startY) * battlefield.mapWidth] != null &&
              battlefield.tiles[var12 + (startX + (var11 + startY) * battlefield.mapWidth)].terrainType == terrainType) {
              return;
            }
            if (battlefield.tiles[startX + var12 + (var11 + startY) * battlefield.mapWidth] == null) {
              battlefield.tiles[battlefield.mapWidth * (var11 + startY) + (startX + var12)] = new MapTile(terrainType, battlefield);
            } else {
              if (battlefield.tiles[battlefield.mapWidth * (var11 + startY) + (var12 + startX)].terrainType == 4 ||
                6 == battlefield.tiles[(var11 + startY) * battlefield.mapWidth + (var12 + startX)].terrainType &&
                allowLavaCrossings) {
                if (terrainType == 1) {
                  battlefield.tiles[(startY + var11) * battlefield.mapWidth + var12 + startX] = new MapTile(10, battlefield);
                } else {
                  battlefield.tiles[(startY + var11) * battlefield.mapWidth + startX + var12] = new MapTile(terrainType, battlefield);
                }
              }
            }
            if (var9_int != var12) {
              stackIn_22_0 = battlefield.tiles;
              stackIn_22_1 = battlefield.mapWidth * (var11 + startY) + (startX + var12);
              if (var9_int > 0) {
                stackIn_23_2 = 1;
              } else {
                stackIn_23_2 = -1;
              }
              if (stackIn_22_0[stackIn_22_1 + stackIn_23_2] != null) {
                stackIn_26_0 = terrainType;
                stackIn_26_1 = battlefield.tiles;
                stackIn_26_2 = startX;
                stackIn_26_3 = var12;
                if (var9_int <= 0) {
                  stackIn_27_4 = -1;
                } else {
                  stackIn_27_4 = 1;
                }
                if (stackIn_26_0 == stackIn_26_1[stackIn_26_2 + (stackIn_26_3 + (stackIn_27_4 + battlefield.mapWidth * (var11 + startY)))].terrainType) {
                  return;
                }
              }
            }
            if (var10 != var11) {
              stackIn_31_0 = null;
              stackIn_31_1 = battlefield.tiles;
              stackIn_31_2 = battlefield.mapWidth;
              stackIn_31_3 = startY;
              stackIn_31_4 = var11;
              if (var10 > 0) {
                stackIn_32_5 = 1;
              } else {
                stackIn_32_5 = -1;
              }
              if (stackIn_31_0 != stackIn_31_1[stackIn_31_2 * (stackIn_31_3 + (stackIn_31_4 + stackIn_32_5)) + startX + var12]) {
                stackIn_35_0 = ~terrainType;
                stackIn_35_1 = battlefield.tiles;
                stackIn_35_2 = var12 + startX;
                stackIn_35_3 = battlefield.mapWidth;
                if (var10 > 0) {
                  stackIn_36_4 = 1;
                } else {
                  stackIn_36_4 = -1;
                }
                if (stackIn_35_0 == ~stackIn_35_1[stackIn_35_2 + stackIn_35_3 * (stackIn_36_4 + startY + var11)].terrainType) {
                  return;
                }
              }
            }
            if (-var12 + var9_int <= 0) {
              stackIn_41_0 = -(var9_int - var12);
            } else {
              stackIn_41_0 = -var12 + var9_int;
            }
            stackIn_43_1 = false;
            if (-var11 + var10 <= 0) {
              stackIn_44_2 = -(var10 - var11);
            } else {
              stackIn_44_2 = var10 - var11;
            }
            if (-var12 + var9_int > 0) {
              stackIn_47_3 = var9_int - var12;
            } else {
              stackIn_47_3 = -(var9_int - var12);
            }
            if (stackIn_41_0 > AttackEvent.nextBoundedInt(stackIn_43_1, stackIn_44_2 + stackIn_47_3, random) &&
              var12 != var9_int) {
              stackIn_51_0 = var12;
              if (0 >= var9_int) {
                stackIn_52_1 = -1;
              } else {
                stackIn_52_1 = 1;
              }
              var12 = stackIn_51_0 + stackIn_52_1;
              continue;
            }
            if (var11 == var10) {
              continue;
            }
            stackIn_57_0 = var11;
            if (var10 <= 0) {
              stackIn_58_1 = -1;
            } else {
              stackIn_58_1 = 1;
            }
            var11 = stackIn_57_0 + stackIn_58_1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_62_0 = var9;
          stackIn_62_1 = new StringBuilder().append("fi.D(").append(startX).append(',').append(obfuscationGuard).append(',').append(terrainType).append(',').append(startY).append(',').append(endX).append(',').append(allowLavaCrossings).append(',').append(endY).append(',');
          if (battlefield == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          stackIn_65_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',');
          if (random == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(')').toString());
        }
    }

    static {
        field_u = new NodeDeque();
        field_l = "Rock";
    }
}
