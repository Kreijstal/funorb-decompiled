/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vv {
    static Random field_b;
    static String field_c;
    static String field_a;

    public static void b(byte param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 <= 79) {
          vv.a(110, 51, false, 108, -96, 59);
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        if (224 <= SoundPlaybackHandle.musicGain) {
          NetworkResourceRequest.b(256, param0 ^ -30690);
        } else {
          var1 = SoundPlaybackHandle.musicGain % 32;
          NetworkResourceRequest.b(32 + (SoundPlaybackHandle.musicGain - var1), 84);
        }
        if (param0 == -30647) {
          return;
        }
        vv.consoleGreeting((byte) 85);
    }

    final static ConsoleExpression[] cachedConsoleTokenArray(String source, int obfuscationGuard) {
        int tokenSlot = 0;
        NodeDeque tokenDeque = null;
        RuntimeException failure = null;
        ConsoleExpression[] tokens = null;
        int tokenIndex = 0;
        ConsoleExpression token = null;
        int obfuscationControl = 0;
        ConsoleExpression[] cachedResult = null;
        ConsoleExpression[] guardResult = null;
        ConsoleExpression[] newResult = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String sourceDescription = null;
        RuntimeException caughtFailure = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (source.equals(NumericDateInputWidget.cachedConsoleSource)) {
            cachedResult = MaskedTextEntryPainter.cachedConsoleTokens;
            return cachedResult;
          }
          tokenDeque = ValidationState.tokenizeConsole(false, source);
          tokens = new ConsoleExpression[tokenDeque.size(false)];
          tokenIndex = 0;
          if (obfuscationGuard <= 109) {
            guardResult = (ConsoleExpression[]) null;
            return guardResult;
          }
          token = (ConsoleExpression) (tokenDeque.first((byte) 100));
          while (token != null) {
            tokenSlot = tokenIndex;
            tokenIndex++;
            tokens[tokenSlot] = token;
            token = (ConsoleExpression) (tokenDeque.next((byte) 123));
          }
          NumericDateInputWidget.cachedConsoleSource = source;
          MaskedTextEntryPainter.cachedConsoleTokens = tokens;
          newResult = tokens;
          return newResult;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("vv.F(");
          if (source == null) {
            sourceDescription = "null";
          } else {
            sourceDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(sourceDescription).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        int stackIn_5_0 = 0;
        int stackIn_41_0;
        int stackIn_41_1;
        int stackIn_41_2;
        int stackIn_41_3;
        int[][] stackIn_41_4;
        int stackIn_42_5;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_51_3;
        int[][] stackIn_51_4;
        int stackIn_52_5;
        int stackIn_82_0;
        int stackIn_82_1;
        int stackIn_82_2;
        int stackIn_82_3;
        int[][] stackIn_82_4;
        int stackIn_83_5;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_90_2 = 0;
        int stackIn_92_3;
        int[][] stackIn_92_4;
        int stackIn_93_5;
        int stackIn_123_0;
        int stackIn_123_1;
        int stackIn_123_2;
        int stackIn_123_3;
        int[][] stackIn_123_4;
        int stackIn_124_5;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        int stackIn_131_2 = 0;
        int stackIn_133_3;
        int[][] stackIn_133_4;
        int stackIn_134_5;
        int stackIn_159_0;
        int stackIn_159_1;
        int stackIn_159_2;
        int stackIn_159_3;
        int[][] stackIn_159_4;
        int stackIn_160_5;
        int stackIn_166_0 = 0;
        int stackIn_166_1 = 0;
        int stackIn_167_2 = 0;
        int stackIn_169_3;
        int[][] stackIn_169_4;
        int stackIn_170_5;
        int stackIn_191_0;
        int stackIn_191_1;
        int stackIn_191_2;
        int stackIn_191_3;
        int[][] stackIn_191_4;
        int stackIn_192_5;
        int stackIn_198_0 = 0;
        int stackIn_198_1 = 0;
        int stackIn_199_2 = 0;
        int stackIn_201_3;
        int[][] stackIn_201_4;
        int stackIn_202_5 = 0;
        int stackIn_227_0;
        int stackIn_227_1;
        int stackIn_227_2;
        int stackIn_227_3;
        int[][] stackIn_227_4;
        int stackIn_228_5;
        int stackIn_234_0 = 0;
        int stackIn_234_1 = 0;
        int stackIn_235_2 = 0;
        int stackIn_237_3;
        int[][] stackIn_237_4;
        int stackIn_238_5 = 0;
        int stackIn_266_0;
        int stackIn_266_1;
        int stackIn_266_2;
        int stackIn_266_3;
        int[][] stackIn_266_4;
        int stackIn_267_5;
        int stackIn_273_0 = 0;
        int stackIn_273_1 = 0;
        int stackIn_274_2 = 0;
        int stackIn_276_3;
        int[][] stackIn_276_4;
        int stackIn_277_5 = 0;
        int var7;
        int var8;
        MapTile var9;
        int var10;
        int var11;
        Unit var12;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param1 >= -72) {
          return;
        }
        var12 = vs.field_e[param3].occupant;
        stackIn_5_0 = (var12 == null) ? 0 : 1;
        var7 = stackIn_5_0;
        if (param2) {
          return;
        }
        if (var7 == 0) {
          return;
        }
        var8 = NetworkResourceRequest.field_C.controlledPlayerId;
        if (0 > var8) {
          var8 = CipherPacketBuffer.currentBattlefield.currentPlayer;
        }
        var9 = vs.field_e[param3];
        if (var12.presentationOwnsModel) {
          return;
        }
        if (var12.movementSpent) {
          if (var12.h(-13494)) {
            if (var12.accessoryType == 1) {
              ReportAbuseDialog.a(false, param5, param0);
            }
            if (var12.hasMovementFlag1(false)) {
              UnitCycler.a(111, param5, param0, var12);
            }
            if (var12.u(8)) {
              nb.a(param0, param5, (byte) -97, var12);
            }
            if (var12.modelPreview != null) {
              if (var12.ownerPlayer == MapTile.field_i &&
                !var12.movementSpent &&
                NetworkResourceRequest.field_C.field_L > 0) {
                TeamRoster.playerRingSprite.drawAdditive(10 + param0, param5 + 5, (int)(256.0 * Math.sin((double)NetworkResourceRequest.field_C.field_L * 3.141592653589793 / 200.0)));
                TeamRoster.playerRingSprite.drawAdditive(10 + param0, 5 + param5, (int)(256.0 * Math.sin((double)NetworkResourceRequest.field_C.field_L * 3.141592653589793 / 200.0)));
              }
              if (var9.isStructure(false) &&
                !CipherPacketBuffer.currentBattlefield.arePlayersAllied(var9.ownerPlayer, -16985, var12.ownerPlayer) &&
                var12.canCaptureStructures(-21428)) {
                SoftwareRaster.b(param0 + 18, param5 + 30, 42, 6, 11184810);
                if (var9.ownerPlayer > -1) {
                  stackIn_41_0 = param0 + 19;
                  stackIn_41_1 = param5 + 31;
                  stackIn_41_2 = 40;
                  stackIn_41_3 = 4;
                  stackIn_41_4 = op.field_c;
                  stackIn_42_5 = (CipherPacketBuffer.currentBattlefield.teamGame) ? 1 : 0;
                  SoftwareRaster.f(stackIn_41_0, stackIn_41_1, stackIn_41_2, stackIn_41_3, stackIn_41_4[stackIn_42_5][var9.ownerPlayer]);
                } else {
                  SoftwareRaster.f(param0 + 19, param5 + 31, 40, 4, 0);
                }
                var10 = var9.getDefaultCaptureStrength(10) - var9.captureStrength;
                if (10 != var9.getDefaultCaptureStrength(10)) {
                  var10 = (var10 << 3) / 3;
                } else {
                  var10 = var10 << 2;
                }
                stackIn_48_0 = param0 + 19;
                stackIn_48_1 = 31 + param5;
                if (var10 > 40) {
                  stackIn_49_2 = 40;
                } else {
                  stackIn_49_2 = var10;
                }
                stackIn_51_3 = 4;
                stackIn_51_4 = op.field_c;
                stackIn_52_5 = (!CipherPacketBuffer.currentBattlefield.teamGame) ? 0 : 1;
                SoftwareRaster.f(stackIn_48_0, stackIn_48_1, stackIn_49_2, stackIn_51_3, stackIn_51_4[stackIn_52_5][CipherPacketBuffer.currentBattlefield.getPlayerTeamIndex(var12.ownerPlayer, -1)]);
              }
              if (param4 > 0) {
                bk.attackTargetSprites[1].b(30 + param0, -50 + param5, param4, 0);
              }
            }
          } else {
            if (var12.attacksRemaining == 0) {
              LobbyPlayer.cannotMoveSprites[2].draw(param0 + 8, param5 + 12);
              if (var12.accessoryType == 1) {
                ReportAbuseDialog.a(false, param5, param0);
              }
              if (var12.hasMovementFlag1(false)) {
                UnitCycler.a(111, param5, param0, var12);
              }
              if (var12.u(8)) {
                nb.a(param0, param5, (byte) -97, var12);
              }
              if (var12.modelPreview != null) {
                if (var12.ownerPlayer == MapTile.field_i &&
                  !var12.movementSpent &&
                  NetworkResourceRequest.field_C.field_L > 0) {
                  TeamRoster.playerRingSprite.drawAdditive(10 + param0, param5 + 5, (int)(256.0 * Math.sin((double)NetworkResourceRequest.field_C.field_L * 3.141592653589793 / 200.0)));
                  TeamRoster.playerRingSprite.drawAdditive(10 + param0, 5 + param5, (int)(256.0 * Math.sin((double)NetworkResourceRequest.field_C.field_L * 3.141592653589793 / 200.0)));
                }
                if (var9.isStructure(false) &&
                  !CipherPacketBuffer.currentBattlefield.arePlayersAllied(var9.ownerPlayer, -16985, var12.ownerPlayer) &&
                  var12.canCaptureStructures(-21428)) {
                  SoftwareRaster.b(param0 + 18, param5 + 30, 42, 6, 11184810);
                  if (var9.ownerPlayer > -1) {
                    stackIn_123_0 = param0 + 19;
                    stackIn_123_1 = param5 + 31;
                    stackIn_123_2 = 40;
                    stackIn_123_3 = 4;
                    stackIn_123_4 = op.field_c;
                    stackIn_124_5 = (CipherPacketBuffer.currentBattlefield.teamGame) ? 1 : 0;
                    SoftwareRaster.f(stackIn_123_0, stackIn_123_1, stackIn_123_2, stackIn_123_3, stackIn_123_4[stackIn_124_5][var9.ownerPlayer]);
                  } else {
                    SoftwareRaster.f(param0 + 19, param5 + 31, 40, 4, 0);
                  }
                  var10 = var9.getDefaultCaptureStrength(10) - var9.captureStrength;
                  if (10 != var9.getDefaultCaptureStrength(10)) {
                    var10 = (var10 << 3) / 3;
                  } else {
                    var10 = var10 << 2;
                  }
                  stackIn_130_0 = param0 + 19;
                  stackIn_130_1 = 31 + param5;
                  if (var10 > 40) {
                    stackIn_131_2 = 40;
                  } else {
                    stackIn_131_2 = var10;
                  }
                  stackIn_133_3 = 4;
                  stackIn_133_4 = op.field_c;
                  stackIn_134_5 = (!CipherPacketBuffer.currentBattlefield.teamGame) ? 0 : 1;
                  SoftwareRaster.f(stackIn_130_0, stackIn_130_1, stackIn_131_2, stackIn_133_3, stackIn_133_4[stackIn_134_5][CipherPacketBuffer.currentBattlefield.getPlayerTeamIndex(var12.ownerPlayer, -1)]);
                }
                if (param4 > 0) {
                  bk.attackTargetSprites[1].b(30 + param0, -50 + param5, param4, 0);
                }
              }
            } else {
              LobbyPlayer.cannotMoveSprites[1].draw(param0 + 8, param5 + 12);
              if (var12.accessoryType == 1) {
                ReportAbuseDialog.a(false, param5, param0);
              }
              if (var12.hasMovementFlag1(false)) {
                UnitCycler.a(111, param5, param0, var12);
              }
              if (var12.u(8)) {
                nb.a(param0, param5, (byte) -97, var12);
              }
              if (var12.modelPreview != null) {
                if (var12.ownerPlayer == MapTile.field_i &&
                  !var12.movementSpent &&
                  NetworkResourceRequest.field_C.field_L > 0) {
                  TeamRoster.playerRingSprite.drawAdditive(10 + param0, param5 + 5, (int)(256.0 * Math.sin((double)NetworkResourceRequest.field_C.field_L * 3.141592653589793 / 200.0)));
                  TeamRoster.playerRingSprite.drawAdditive(10 + param0, 5 + param5, (int)(256.0 * Math.sin((double)NetworkResourceRequest.field_C.field_L * 3.141592653589793 / 200.0)));
                }
                if (var9.isStructure(false) &&
                  !CipherPacketBuffer.currentBattlefield.arePlayersAllied(var9.ownerPlayer, -16985, var12.ownerPlayer) &&
                  var12.canCaptureStructures(-21428)) {
                  SoftwareRaster.b(param0 + 18, param5 + 30, 42, 6, 11184810);
                  if (var9.ownerPlayer > -1) {
                    stackIn_82_0 = param0 + 19;
                    stackIn_82_1 = param5 + 31;
                    stackIn_82_2 = 40;
                    stackIn_82_3 = 4;
                    stackIn_82_4 = op.field_c;
                    stackIn_83_5 = (CipherPacketBuffer.currentBattlefield.teamGame) ? 1 : 0;
                    SoftwareRaster.f(stackIn_82_0, stackIn_82_1, stackIn_82_2, stackIn_82_3, stackIn_82_4[stackIn_83_5][var9.ownerPlayer]);
                  } else {
                    SoftwareRaster.f(param0 + 19, param5 + 31, 40, 4, 0);
                  }
                  var10 = var9.getDefaultCaptureStrength(10) - var9.captureStrength;
                  if (10 != var9.getDefaultCaptureStrength(10)) {
                    var10 = (var10 << 3) / 3;
                  } else {
                    var10 = var10 << 2;
                  }
                  stackIn_89_0 = param0 + 19;
                  stackIn_89_1 = 31 + param5;
                  if (var10 > 40) {
                    stackIn_90_2 = 40;
                  } else {
                    stackIn_90_2 = var10;
                  }
                  stackIn_92_3 = 4;
                  stackIn_92_4 = op.field_c;
                  stackIn_93_5 = (!CipherPacketBuffer.currentBattlefield.teamGame) ? 0 : 1;
                  SoftwareRaster.f(stackIn_89_0, stackIn_89_1, stackIn_90_2, stackIn_92_3, stackIn_92_4[stackIn_93_5][CipherPacketBuffer.currentBattlefield.getPlayerTeamIndex(var12.ownerPlayer, -1)]);
                }
                if (param4 > 0) {
                  bk.attackTargetSprites[1].b(30 + param0, -50 + param5, param4, 0);
                }
              }
            }
          }
          return;
        }
        if (var12.accessoryType == 1) {
          ReportAbuseDialog.a(false, param5, param0);
        }
        if (var12.hasMovementFlag1(false)) {
          UnitCycler.a(111, param5, param0, var12);
        }
        if (var12.u(8)) {
          nb.a(param0, param5, (byte) -97, var12);
        }
        if (var12.modelPreview == null) {
          return;
        }
        if (var12.ownerPlayer != MapTile.field_i) {
          if (var9.isStructure(false) &&
            !CipherPacketBuffer.currentBattlefield.arePlayersAllied(var9.ownerPlayer, -16985, var12.ownerPlayer) &&
            var12.canCaptureStructures(-21428)) {
            SoftwareRaster.b(param0 + 18, param5 + 30, 42, 6, 11184810);
            if (var9.ownerPlayer > -1) {
              stackIn_159_0 = param0 + 19;
              stackIn_159_1 = param5 + 31;
              stackIn_159_2 = 40;
              stackIn_159_3 = 4;
              stackIn_159_4 = op.field_c;
              stackIn_160_5 = (CipherPacketBuffer.currentBattlefield.teamGame) ? 1 : 0;
              SoftwareRaster.f(stackIn_159_0, stackIn_159_1, stackIn_159_2, stackIn_159_3, stackIn_159_4[stackIn_160_5][var9.ownerPlayer]);
            } else {
              SoftwareRaster.f(param0 + 19, param5 + 31, 40, 4, 0);
            }
            var10Lifetime1 = var9.getDefaultCaptureStrength(10) - var9.captureStrength;
            if (10 != var9.getDefaultCaptureStrength(10)) {
              var10Lifetime1 = (var10Lifetime1 << 3) / 3;
            } else {
              var10Lifetime1 = var10Lifetime1 << 2;
            }
            stackIn_166_0 = param0 + 19;
            stackIn_166_1 = 31 + param5;
            if (var10Lifetime1 > 40) {
              stackIn_167_2 = 40;
            } else {
              stackIn_167_2 = var10Lifetime1;
            }
            stackIn_169_3 = 4;
            stackIn_169_4 = op.field_c;
            stackIn_170_5 = (!CipherPacketBuffer.currentBattlefield.teamGame) ? 0 : 1;
            SoftwareRaster.f(stackIn_166_0, stackIn_166_1, stackIn_167_2, stackIn_169_3, stackIn_169_4[stackIn_170_5][CipherPacketBuffer.currentBattlefield.getPlayerTeamIndex(var12.ownerPlayer, -1)]);
          }
          if (param4 > 0) {
            bk.attackTargetSprites[1].b(30 + param0, -50 + param5, param4, 0);
          }
          return;
        }
        if (var12.movementSpent) {
          if (var9.isStructure(false) &&
            !CipherPacketBuffer.currentBattlefield.arePlayersAllied(var9.ownerPlayer, -16985, var12.ownerPlayer) &&
            var12.canCaptureStructures(-21428)) {
            SoftwareRaster.b(param0 + 18, param5 + 30, 42, 6, 11184810);
            if (var9.ownerPlayer > -1) {
              stackIn_191_0 = param0 + 19;
              stackIn_191_1 = param5 + 31;
              stackIn_191_2 = 40;
              stackIn_191_3 = 4;
              stackIn_191_4 = op.field_c;
              stackIn_192_5 = (CipherPacketBuffer.currentBattlefield.teamGame) ? 1 : 0;
              SoftwareRaster.f(stackIn_191_0, stackIn_191_1, stackIn_191_2, stackIn_191_3, stackIn_191_4[stackIn_192_5][var9.ownerPlayer]);
            } else {
              SoftwareRaster.f(param0 + 19, param5 + 31, 40, 4, 0);
            }
            var10Lifetime2 = var9.getDefaultCaptureStrength(10) - var9.captureStrength;
            if (10 != var9.getDefaultCaptureStrength(10)) {
              var10Lifetime2 = (var10Lifetime2 << 3) / 3;
            } else {
              var10Lifetime2 = var10Lifetime2 << 2;
            }
            stackIn_198_0 = param0 + 19;
            stackIn_198_1 = 31 + param5;
            if (var10Lifetime2 > 40) {
              stackIn_199_2 = 40;
            } else {
              stackIn_199_2 = var10Lifetime2;
            }
            stackIn_201_3 = 4;
            stackIn_201_4 = op.field_c;
            stackIn_202_5 = (!CipherPacketBuffer.currentBattlefield.teamGame) ? 0 : 1;
            SoftwareRaster.f(stackIn_198_0, stackIn_198_1, stackIn_199_2, stackIn_201_3, stackIn_201_4[stackIn_202_5][CipherPacketBuffer.currentBattlefield.getPlayerTeamIndex(var12.ownerPlayer, -1)]);
          }
          if (param4 > 0) {
            bk.attackTargetSprites[1].b(30 + param0, -50 + param5, param4, 0);
          }
          return;
        }
        if (NetworkResourceRequest.field_C.field_L <= 0) {
          if (var9.isStructure(false) &&
            !CipherPacketBuffer.currentBattlefield.arePlayersAllied(var9.ownerPlayer, -16985, var12.ownerPlayer) &&
            var12.canCaptureStructures(-21428)) {
            SoftwareRaster.b(param0 + 18, param5 + 30, 42, 6, 11184810);
            if (var9.ownerPlayer > -1) {
              stackIn_227_0 = param0 + 19;
              stackIn_227_1 = param5 + 31;
              stackIn_227_2 = 40;
              stackIn_227_3 = 4;
              stackIn_227_4 = op.field_c;
              stackIn_228_5 = (CipherPacketBuffer.currentBattlefield.teamGame) ? 1 : 0;
              SoftwareRaster.f(stackIn_227_0, stackIn_227_1, stackIn_227_2, stackIn_227_3, stackIn_227_4[stackIn_228_5][var9.ownerPlayer]);
            } else {
              SoftwareRaster.f(param0 + 19, param5 + 31, 40, 4, 0);
            }
            var10Lifetime3 = var9.getDefaultCaptureStrength(10) - var9.captureStrength;
            if (10 != var9.getDefaultCaptureStrength(10)) {
              var10Lifetime3 = (var10Lifetime3 << 3) / 3;
            } else {
              var10Lifetime3 = var10Lifetime3 << 2;
            }
            stackIn_234_0 = param0 + 19;
            stackIn_234_1 = 31 + param5;
            if (var10Lifetime3 > 40) {
              stackIn_235_2 = 40;
            } else {
              stackIn_235_2 = var10Lifetime3;
            }
            stackIn_237_3 = 4;
            stackIn_237_4 = op.field_c;
            stackIn_238_5 = (!CipherPacketBuffer.currentBattlefield.teamGame) ? 0 : 1;
            SoftwareRaster.f(stackIn_234_0, stackIn_234_1, stackIn_235_2, stackIn_237_3, stackIn_237_4[stackIn_238_5][CipherPacketBuffer.currentBattlefield.getPlayerTeamIndex(var12.ownerPlayer, -1)]);
          }
          if (param4 > 0) {
            bk.attackTargetSprites[1].b(30 + param0, -50 + param5, param4, 0);
          }
          return;
        }
        TeamRoster.playerRingSprite.drawAdditive(10 + param0, param5 + 5, (int)(256.0 * Math.sin((double)NetworkResourceRequest.field_C.field_L * 3.141592653589793 / 200.0)));
        TeamRoster.playerRingSprite.drawAdditive(10 + param0, 5 + param5, (int)(256.0 * Math.sin((double)NetworkResourceRequest.field_C.field_L * 3.141592653589793 / 200.0)));
        if (!var9.isStructure(false)) {
          if (param4 <= 0) {
            return;
          }
          bk.attackTargetSprites[1].b(30 + param0, -50 + param5, param4, 0);
          return;
        }
        if (CipherPacketBuffer.currentBattlefield.arePlayersAllied(var9.ownerPlayer, -16985, var12.ownerPlayer)) {
          if (param4 <= 0) {
            return;
          }
          bk.attackTargetSprites[1].b(30 + param0, -50 + param5, param4, 0);
          return;
        }
        if (!var12.canCaptureStructures(-21428)) {
          if (param4 > 0) {
            bk.attackTargetSprites[1].b(30 + param0, -50 + param5, param4, 0);
          }
          return;
        }
        SoftwareRaster.b(param0 + 18, param5 + 30, 42, 6, 11184810);
        if (var9.ownerPlayer > -1) {
          stackIn_266_0 = param0 + 19;
          stackIn_266_1 = param5 + 31;
          stackIn_266_2 = 40;
          stackIn_266_3 = 4;
          stackIn_266_4 = op.field_c;
          stackIn_267_5 = (CipherPacketBuffer.currentBattlefield.teamGame) ? 1 : 0;
          SoftwareRaster.f(stackIn_266_0, stackIn_266_1, stackIn_266_2, stackIn_266_3, stackIn_266_4[stackIn_267_5][var9.ownerPlayer]);
        } else {
          SoftwareRaster.f(param0 + 19, param5 + 31, 40, 4, 0);
        }
        var10Lifetime4 = var9.getDefaultCaptureStrength(10) - var9.captureStrength;
        if (10 != var9.getDefaultCaptureStrength(10)) {
          var10Lifetime4 = (var10Lifetime4 << 3) / 3;
        } else {
          var10Lifetime4 = var10Lifetime4 << 2;
        }
        stackIn_273_0 = param0 + 19;
        stackIn_273_1 = 31 + param5;
        if (var10Lifetime4 > 40) {
          stackIn_274_2 = 40;
        } else {
          stackIn_274_2 = var10Lifetime4;
        }
        stackIn_276_3 = 4;
        stackIn_276_4 = op.field_c;
        stackIn_277_5 = (!CipherPacketBuffer.currentBattlefield.teamGame) ? 0 : 1;
        SoftwareRaster.f(stackIn_273_0, stackIn_273_1, stackIn_274_2, stackIn_276_3, stackIn_276_4[stackIn_277_5][CipherPacketBuffer.currentBattlefield.getPlayerTeamIndex(var12.ownerPlayer, -1)]);
        if (param4 <= 0) {
          return;
        }
        bk.attackTargetSprites[1].b(30 + param0, -50 + param5, param4, 0);
        return;
    }

    final static boolean a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 125 % ((17 - param0) / 52);
          stackIn_1_0 = er.a(true, -108, param1, 10);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("vv.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static String consoleGreeting(byte obfuscationGuard) {
        if (obfuscationGuard != -62) {
          field_a = (String) null;
          return "Hi!";
        }
        return "Hi!";
    }

    static {
        field_b = new Random(6L);
        field_c = "Fire";
        field_a = "Single";
    }
}
