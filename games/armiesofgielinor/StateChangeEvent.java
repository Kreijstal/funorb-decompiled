/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StateChangeEvent extends GameEvent {
    int tileY;
    private boolean applied;
    private int effectType;
    int tileX;
    static String field_D;
    static String field_z;
    static String field_y;
    static String field_A;
    static String field_H;
    int playerId;

    final static void e(byte param0) {
        if (param0 >= -73) {
          field_y = (String) null;
        }
        if (ib.field_j != -InteractiveWidget.field_C + 0 &&
          250 - InteractiveWidget.field_C == ib.field_j) {
        }
        ib.field_j = ib.field_j + 1;
    }

    final boolean a(NodeDeque param0, byte param1, GameplayController param2) {
        int stackIn_104_0 = 0;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_108_2 = null;
        StringBuilder stackIn_110_1 = null;
        String stackIn_111_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int var8 = 0;
        Unit var9 = null;
        Unit var10 = null;
        Unit var11 = null;
        Unit var12 = null;
        Unit var13 = null;
        Unit var14 = null;
        Unit var15 = null;
        Unit var16 = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4_int = 0;
          var6 = this.effectType;
          if (2 != var6 &&
            var6 != 3) {
            if (var6 != 1) {
              if (var6 != 4) {
                if (var6 != 0) {
                  this.acknowledgePresentation((byte) -95);
                } else if (this.a((byte) -39, param2, param0, true)) {
                  var4_int = 1;
                }
              } else if (!param2.battlefield.tiles[param2.battlefield.mapWidth * this.tileY + this.tileX].hasCorpse(111)) {
                this.acknowledgePresentation((byte) -74);
              } else if (this.a((byte) -39, param2, param0, true)) {
                var4_int = 1;
              }
            } else {
              if (this.tileX > 0) {
                var13 = param2.battlefield.getUnitAt(this.tileY, true, this.tileX - 1);
                if (param2.battlefield.tiles[this.tileX - (1 - param2.battlefield.mapWidth * this.tileY)].hasCorpse(-65) &&
                  null == this.unit ||
                  var13 != null &&
                  param2.battlefield.arePlayersAllied(var13.ownerPlayer, -16985, this.playerId) &&
                  var13.a(23072)) {
                  this.pendingPresentations = this.pendingPresentations + 1;
                  if (this.a(this.tileY, 15, param2, param0, this.tileX - 1)) {
                    var4_int = 1;
                  }
                }
              }
              if (this.tileX < param2.battlefield.mapWidth - 1) {
                var14 = param2.battlefield.getUnitAt(this.tileY, true, this.tileX + 1);
                if (param2.battlefield.tiles[this.tileX + 1 + param2.battlefield.mapWidth * this.tileY].hasCorpse(-26) &&
                  this.unit == null ||
                  var14 != null &&
                  param2.battlefield.arePlayersAllied(var14.ownerPlayer, -16985, this.playerId) &&
                  var14.a(23072)) {
                  this.pendingPresentations = this.pendingPresentations + 1;
                  if (this.a(this.tileY, 15, param2, param0, 1 + this.tileX)) {
                    var4_int = 1;
                  }
                }
              }
              if (0 < this.tileY) {
                var15 = param2.battlefield.getUnitAt(-1 + this.tileY, true, this.tileX);
                if (param2.battlefield.tiles[(this.tileY - 1) * param2.battlefield.mapWidth + this.tileX].hasCorpse(-45) &&
                  this.unit == null ||
                  var15 != null &&
                  param2.battlefield.arePlayersAllied(var15.ownerPlayer, -16985, this.playerId) &&
                  var15.a(23072)) {
                  this.pendingPresentations = this.pendingPresentations + 1;
                  if (this.a(-1 + this.tileY, 15, param2, param0, this.tileX)) {
                    var4_int = 1;
                  }
                }
              }
              if (-1 + param2.battlefield.mapHeight > this.tileY) {
                var16 = param2.battlefield.getUnitAt(this.tileY + 1, true, this.tileX);
                if (param2.battlefield.tiles[this.tileX + (1 + this.tileY) * param2.battlefield.mapWidth].hasCorpse(-44) &&
                  null == this.unit ||
                  var16 != null &&
                  param2.battlefield.arePlayersAllied(var16.ownerPlayer, -16985, this.playerId) &&
                  var16.a(23072)) {
                  this.pendingPresentations = this.pendingPresentations + 1;
                  if (this.a(this.tileY + 1, 15, param2, param0, this.tileX)) {
                    var4_int = 1;
                  }
                }
              }
              if (this.pendingPresentations <= 1) {
                this.acknowledgePresentation((byte) -127);
              } else if (this.a((byte) -39, param2, param0, true)) {
                var4_int = 1;
              }
            }
          } else {
            if (this.tileX > 0) {
              var9 = param2.battlefield.getUnitAt(this.tileY, true, this.tileX - 1);
              if (var9 != null &&
                param2.battlefield.arePlayersAllied(var9.ownerPlayer, -16985, this.playerId)) {
                this.pendingPresentations = this.pendingPresentations + 1;
                if (this.a(this.tileY, 15, param2, param0, this.tileX - 1)) {
                  var4_int = 1;
                }
              }
            }
            if (param2.battlefield.mapWidth - 1 > this.tileX) {
              var10 = param2.battlefield.getUnitAt(this.tileY, true, this.tileX + 1);
              if (var10 != null &&
                param2.battlefield.arePlayersAllied(var10.ownerPlayer, -16985, this.playerId)) {
                this.pendingPresentations = this.pendingPresentations + 1;
                if (this.a(this.tileY, 15, param2, param0, this.tileX + 1)) {
                  var4_int = 1;
                }
              }
            }
            if (this.tileY > 0) {
              var11 = param2.battlefield.getUnitAt(this.tileY - 1, true, this.tileX);
              if (var11 != null &&
                param2.battlefield.arePlayersAllied(var11.ownerPlayer, -16985, this.playerId)) {
                this.pendingPresentations = this.pendingPresentations + 1;
                if (this.a(-1 + this.tileY, 15, param2, param0, this.tileX)) {
                  var4_int = 1;
                }
              }
            }
            if (this.tileY < param2.battlefield.mapHeight - 1) {
              var12 = param2.battlefield.getUnitAt(1 + this.tileY, true, this.tileX);
              if (var12 != null &&
                param2.battlefield.arePlayersAllied(var12.ownerPlayer, -16985, this.playerId)) {
                this.pendingPresentations = this.pendingPresentations + 1;
                if (this.a(1 + this.tileY, 15, param2, param0, this.tileX)) {
                  var4_int = 1;
                }
              }
            }
            if (1 < this.pendingPresentations) {
              if (this.a((byte) -39, param2, param0, true)) {
                var4_int = 1;
              }
            } else {
              this.acknowledgePresentation((byte) -114);
            }
          }
          if (param1 >= -84) {
            StateChangeEvent.sendProgressRecord((byte) -37, 26, -64, -50);
          }
          this.applyToBattlefield(param2.battlefield, -26661);
          stackIn_104_0 = var4_int;
          return stackIn_104_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_107_0 = var4;
          stackIn_107_1 = new StringBuilder().append("qq.A(");
          if (param0 == null) {
            stackIn_108_2 = "null";
          } else {
            stackIn_108_2 = "{...}";
          }
          stackIn_110_1 = ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_111_2 = "null";
          } else {
            stackIn_111_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_107_0), ((StringBuilder) (Object) stackIn_110_1).append(stackIn_111_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          param0 = param0 << 8 | param0;
          var4_int = param0 ^ param0 >> 1;
          if (param1 != -12933) {
            return;
          }
          for (var7 = 0; 4 > var7; var7++) {
            var5 = -54 + (CachedArchiveProvider.field_y[var7][0] + param3) + (var4_int & 15);
            var6 = param2 + (CachedArchiveProvider.field_y[var7][1] + (param0 & 7) - 64);
            fe.a(SetCoatConsoleCommand.kalphiteSprites[3], 60 + var5, var6 + 50, SetCoatConsoleCommand.kalphiteSprites[3].canvasWidth >> 1, SetCoatConsoleCommand.kalphiteSprites[3].canvasHeight >> 1);
            var4_int = var4_int >> 1;
            param0 = param0 >> 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var4), "qq.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void g(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          wd.field_b = rs.field_n.textWidth(DisplacedUnitMarker.field_t[17]) + 20;
          var1_int = rs.field_n.textWidth(DisplacedUnitMarker.field_t[18]);
          if (wd.field_b < var1_int) {
            wd.field_b = var1_int;
          }
          if (MoveEvent.instructionsPanel == null) {
            MoveEvent.instructionsPanel = new InstructionsPanel();
          }
          MoveEvent.instructionsPanel.f((byte) 79);
          if (MoveEvent.matchSetupPanel == null) {
            MoveEvent.matchSetupPanel = new MatchSetupPanel();
          }
          MoveEvent.matchSetupPanel.initializePanel(param0 + 0);
          MoveEvent.matchSetupPanel.loadItemLabels((byte) 97);
          TextLineLayout.currentSpellMenu = CachedArchiveProvider.spellMenuRoot;
          if (param0 != 1) {
            field_A = (String) null;
          }
          for (var2 = 0; var2 < ChannelBaseVolumeConsoleCommand.field_G.length; var2++) {
            ChannelBaseVolumeConsoleCommand.field_G[var2] = true;
          }
          ChannelBaseVolumeConsoleCommand.field_G[37] = false;
          ChannelBaseVolumeConsoleCommand.field_G[32] = HelloConsoleCommand.a(0, (byte) -98);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "qq.D(" + param0 + ')');
        }
    }

    public static void d(byte param0) {
        if (param0 != 35) {
          return;
        }
        field_A = null;
        field_y = null;
        field_D = null;
        field_H = null;
        field_z = null;
    }

    final void applyToBattlefield(Battlefield battlefield, int obfuscationGuard) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        GameplayController var5 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.applied) {
            return;
          }
          this.applied = true;
          var3_int = this.effectType;
          if (var3_int != 0) {
            if (var3_int == 1) {
              battlefield.healOrRaiseSkeletonAt((byte) 34, this.playerId, this.tileY, this.tileX + 1);
              battlefield.healOrRaiseSkeletonAt((byte) 30, this.playerId, this.tileY, -1 + this.tileX);
              battlefield.healOrRaiseSkeletonAt((byte) 61, this.playerId, this.tileY + 1, this.tileX);
              battlefield.healOrRaiseSkeletonAt((byte) 35, this.playerId, this.tileY - 1, this.tileX);
            } else {
              if (var3_int != 2) {
                if (3 == var3_int) {
                  battlefield.f(this.tileX + 1, this.playerId, 126, this.tileY);
                  battlefield.f(-1 + this.tileX, this.playerId, obfuscationGuard + 26785, this.tileY);
                  battlefield.f(this.tileX, this.playerId, 121, this.tileY + 1);
                  battlefield.f(this.tileX, this.playerId, 119, -1 + this.tileY);
                } else {
                  if (4 == var3_int) {
                    battlefield.a(-100, battlefield.tiles[battlefield.mapWidth * this.tileY + this.tileX]);
                  }
                }
              } else {
                battlefield.a(-122, false, this.tileX + 1, this.tileY, this.playerId, 3);
                battlefield.a(-125, false, -1 + this.tileX, this.tileY, this.playerId, 3);
                battlefield.a(-119, false, this.tileX, 1 + this.tileY, this.playerId, 3);
                battlefield.a(-128, false, this.tileX, -1 + this.tileY, this.playerId, 3);
              }
            }
          } else {
            battlefield.c(this.tileY, this.tileX, this.playerId, (byte) -115);
          }
          if (obfuscationGuard != -26661) {
            var5 = (GameplayController) null;
            this.a((NodeDeque) null, (byte) -124, (GameplayController) null);
          }
          if (2 == this.effectType ||
            3 == this.effectType) {
            battlefield.e(14, this.tileX + 1, this.playerId, this.tileY);
            battlefield.e(14, -1 + this.tileX, this.playerId, this.tileY);
            battlefield.e(14, this.tileX, this.playerId, 1 + this.tileY);
            battlefield.e(obfuscationGuard + 26675, this.tileX, this.playerId, -1 + this.tileY);
          }
          fl.recomputeClientStateChecksum(battlefield, -111);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("qq.G(");
          if (battlefield == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void sendProgressRecord(byte obfuscationGuard, int recordId, int flag, int counter) {
        if (DamageEvent.g(98)) {
          return;
        }
        CipherPacketBuffer var4 = vl.outgoingPacket;
        var4.writeCipheredOpcode(32161, 16);
        var4.position = var4.position + 1;
        int var5 = var4.position;
        var4.writeByte(obfuscationGuard ^ 7, 0);
        var4.writeShort(true, recordId);
        var4.writeByte(1, flag);
        var4.writeShort(true, counter);
        if (obfuscationGuard != 6) {
          StateChangeEvent.a(-60, -103, 22, 28, -21);
        }
        var4.writeByteLengthPrefix(-var5 + var4.position, 5930);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          SoftwareRaster.e(param1, param4, 1 + param0, 10000536);
          SoftwareRaster.e(param1, param4 + param2, param0 + 1, 12105912);
          var5_int = 1;
          if (SoftwareRaster.clipTop > var5_int + param4) {
            var5_int = -param4 + SoftwareRaster.clipTop;
          }
          var6 = param2;
          if (SoftwareRaster.clipBottom < var6 + param4) {
            var6 = SoftwareRaster.clipBottom - param4;
          }
          var7 = var5_int;
          var8 = 125 / ((param3 - 27) / 51);
          while (var7 < var6) {
            var9 = 152 + var7 * 48 / param2;
            var10 = var9 << 16 | var9 << 8 | var9;
            SoftwareRaster.pixels[(var7 + param4) * SoftwareRaster.width + param1] = var10;
            SoftwareRaster.pixels[SoftwareRaster.width * (param4 + var7) + (param1 + param0)] = var10;
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var5), "qq.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final String describeEvent(byte obfuscationGuard, boolean verbose) {
        int var3;
        int var4_int;
        String var4;
        int var5;
        String var4Lifetime1;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var3 = -2 / ((53 - obfuscationGuard) / 51);
        if (verbose) {
          System.out.println("State change event debug");
          System.out.println("At " + this.tileX + "," + this.tileY);
          System.out.println("Player" + this.playerId);
          var4_int = this.effectType;
          if (var4_int != 0) {
            if (var4_int == 1) {
              System.out.println("Raise");
            } else {
              if (var4_int == 2) {
                System.out.println("Heal");
              } else {
                if (var4_int != 3) {
                  if (var4_int != 4) {
                    var4 = "EventStateChange: pos: (" + this.tileX + "," + this.tileY + "), type: " + this.effectType + ", player: " + this.playerId;
                    return var4;
                  }
                  System.out.println("Bury");
                } else {
                  System.out.println("Pump");
                }
              }
            }
          } else {
            System.out.println("Capture");
          }
        }
        var4Lifetime1 = "EventStateChange: pos: (" + this.tileX + "," + this.tileY + "), type: " + this.effectType + ", player: " + this.playerId;
        return var4Lifetime1;
    }

    StateChangeEvent(int effectType, int tileX, int tileY, int playerId) {
        int var5;
        this.playerId = playerId;
        this.effectType = effectType;
        this.tileX = tileX;
        this.tileY = tileY;
        this.eventKind = -1;
        var5 = this.effectType;
        if (var5 == 0) {
          this.eventKind = 3;
        } else {
          if (1 == var5) {
            this.eventKind = 16;
          } else {
            if (var5 == 2) {
              this.eventKind = 12;
            } else {
              if (var5 == 3) {
                this.eventKind = 14;
              } else {
                if (var5 == 4) {
                  this.eventKind = 17;
                }
              }
            }
          }
        }
    }

    final static void a(ResourceArchive param0, ResourceArchive param1, ResourceArchive param2, int param3, boolean param4) {
        se.field_g = cr.a("", 4210752);
        se.field_g.a(false, true);
        if (param3 != 0) {
          return;
        }
        try {
          MoveEvent.a(param2, false, param1, param0);
          da.b(-2);
          ChannelBaseVolumeConsoleCommand.field_L = nb.field_i;
          mh.field_b = nb.field_i;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "qq.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_z = "Invalid date";
        field_y = "Skip";
        field_A = "Empty";
        field_H = "Most honourable";
        field_D = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
