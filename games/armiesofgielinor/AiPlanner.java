/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class AiPlanner extends IntrusiveNode implements UnitObserver {
    private Unit field_r;
    float[] weights;
    MovementPlanner evaluationMovement;
    private NodeDeque unitPlanners;
    private int field_o;
    private int field_L;
    private CampaignUnitOverride[] campaignOverrides;
    MovementPlanner actionMovement;
    private float[] field_T;
    private int field_B;
    float[][] field_A;
    private int field_q;
    float[][] field_K;
    private int field_t;
    Battlefield battlefield;
    float[] field_V;
    static String field_R;
    AiInfluenceMap influenceMap;
    float[][][] field_n;
    private int field_k;
    private AiPlanningStrategy bestScoreStrategy;
    private AiPlanningStrategy weightedScoreStrategy;
    private AiUnitPlanner field_S;
    private NodeDeque field_H;
    private float[] field_v;
    static BitmapFont field_G;
    private int field_y;
    float[] tileEvaluationCache;
    private float[] field_C;
    private boolean field_w;
    private AiUnitPlanner field_M;
    AiUnitPlanner currentUnitPlanner;
    float[][][] objectiveInfluence;
    private NodeDeque field_O;
    private int field_E;
    private int field_x;
    int playerId;
    private int field_s;

    public static void a(int param0) {
        if (param0 != -27464) {
          AiPlanner.b(-7, -126, -85, -67);
        }
        field_R = null;
        field_G = null;
    }

    private final float scoreSpellAtTile(int tileX, int spellId, int tileY, byte obfuscationGuard) {
        float stackIn_64_0 = 0.0f;
        float stackIn_66_0 = 0.0f;
        float stackIn_67_1 = 0.0f;
        float var5;
        int var6;
        MapTile var7;
        int var8_int;
        float var8;
        int var9;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (tileX >= 0 &&
          tileY >= 0 &&
          tileX < this.battlefield.mapWidth &&
          tileY < this.battlefield.mapHeight) {
          if (obfuscationGuard != -90) {
            this.i(104);
          }
          var5 = 0.0f;
          var6 = tileY * this.battlefield.mapWidth + tileX;
          var7 = this.battlefield.tiles[var6];
          var8_int = spellId;
          if (var8_int != 29 &&
            var8_int != 30 &&
            var8_int != 31 &&
            var8_int != 32 &&
            var8_int != 33) {
            if (var8_int != 23 &&
              24 != var8_int) {
              if ((var8_int == 47 ||
                48 == var8_int ||
                var8_int == 49 ||
                var8_int == 50 ||
                var8_int == 51 ||
                52 == var8_int ||
                53 == var8_int) && var7.occupant != null) {
                if (uc.spellDefinitions[spellId][6] > var7.occupant.strength) {
                  stackIn_64_0 = (float)var7.occupant.strength;
                } else {
                  stackIn_64_0 = (float)uc.spellDefinitions[spellId][6];
                }
                var8 = stackIn_64_0;
                stackIn_66_0 = var5;
                if (this.playerId == var7.occupant.ownerPlayer) {
                  stackIn_67_1 = -var8;
                } else {
                  stackIn_67_1 = var8;
                }
                var5 = stackIn_66_0 + stackIn_67_1;
              }
            } else if (var7.hasCorpse(62) &&
              var7.occupant == null) {
              var8 = this.scoreSummoningAtTile(20, obfuscationGuard ^ -89, var6);
              if (1.0f > var8) {
                var8 = 1.0f;
              }
              var5 = var5 + var8;
            }
          } else {
            if (null != var7.occupant &&
              this.playerId == var7.occupant.ownerPlayer) {
              var8_int = 0;
              if (0 < tileX &&
                this.battlefield.tiles[-1 + var6].occupant == null) {
                var8_int = 1;
              } else if (tileY > 0 &&
                this.battlefield.tiles[-this.battlefield.mapWidth + var6].occupant == null) {
                var8_int = 1;
              } else if (tileY < this.battlefield.mapHeight - 1 &&
                null == this.battlefield.tiles[var6 + this.battlefield.mapWidth].occupant) {
                var8_int = 1;
              } else {
                if (-1 + this.battlefield.mapWidth > tileX &&
                  this.battlefield.tiles[1 + var6].occupant == null) {
                  var8_int = 1;
                }
              }
              if (var7.occupant.packedFlag256) {
                var5 = 0.0f;
              } else {
                if (var8_int != 0) {
                  var5 = this.scoreSummoningAtTile(var7.occupant.unitType, 1, var6);
                  if (var5 < 1.0f) {
                    var5 = 1.0f;
                  }
                } else {
                  var5 = 0.0f;
                }
              }
            }
          }
          return var5;
        }
        return -3.4028234663852886e+38f;
    }

    final boolean executeActionRequest(ActionRequest request, int obfuscationGuard) {
        PreparedAction var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (request != null) {
            var3 = request.prepareAction(58, this.battlefield);
            if (var3 != null) {
              var3.applyToBattlefield(64, this.battlefield);
              return true;
            }
          }
          if (obfuscationGuard <= -123) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ej.F(");
          if (request == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int var8 = 0;
        float stackIn_7_0 = 0.0f;
        float var4;
        int var5;
        int var6;
        MapTile var7;
        int var9;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var4 = 0.0f;
        var5 = param0 % this.battlefield.mapWidth;
        var6 = param0 / this.battlefield.mapWidth;
        var7 = this.battlefield.tiles[param0];
        if (!var7.isStructure(param1)) {
          return;
        }
        if (var7.isPortal(-60)) {
          stackIn_7_0 = (var7.ownerPlayer != this.playerId) ? 101.0f : 0.0f;
          var4 = stackIn_7_0;
        }
        if (this.playerId != var7.ownerPlayer) {
          if (var7.terrainType != 9 &&
            var7.terrainType != 14) {
            if (8 == var7.terrainType) {
              var4 = 21.0f;
            }
          } else {
            var4 = 81.0f;
          }
          if (var7.ownerPlayer > -1 &&
            this.playerId != var7.ownerPlayer) {
            var4 = var4 * this.weights[9];
          }
          if (null != var7.occupant &&
            var7.occupant.ownerPlayer == this.playerId &&
            var7.occupant.canCaptureStructures(-21428)) {
            var4 = 0.0f;
          }
        }
        if (0.0f < var4) {
          for (var8 = 0; var8 < 7; var8++) {
            this.influenceMap.a(-101, var6, (float)param2 * var4, var8, 9, this.field_n, var5);
          }
        }
        this.field_v[param0] = (float)param2 * var4;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var11_int = 0;
        int var13 = 0;
        int var6;
        float[] var7;
        int var8;
        int var9;
        int var10;
        float var11;
        int var12;
        int var14;
        int var12Lifetime1;
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var6 = 0;
        if (param1 != -14092) {
          this.field_E = 123;
        }
        while (var6 < 8) {
          if (this.objectiveInfluence[var6].length < param3) {
            return;
          }
          var7 = this.objectiveInfluence[var6][param3 - 1];
          if (var7 != null) {
            var8 = param2 % this.battlefield.mapWidth;
            var9 = param2 / this.battlefield.mapWidth;
            if (param0 != 0) {
              var10 = 0;
              for (var11_int = -param0; param0 > var11_int; var11_int++) {
                for (var12 = -param0; param0 > var12; var12++) {
                  if (param0 == Math.abs(var11_int) + Math.abs(var12) &&
                    var8 + var11_int >= 0 &&
                    var9 + var12 >= 0 &&
                    this.battlefield.mapWidth > var11_int + var8 &&
                    this.battlefield.mapHeight > var12 + var9) {
                    var10++;
                  }
                }
              }
              var11 = (float)param4 * this.weights[55] / (float)var10;
              for (var12Lifetime1 = -param0; param0 > var12Lifetime1; var12Lifetime1++) {
                for (var13 = -param0; var13 < param0; var13++) {
                  if (~param0 == ~(Math.abs(var12Lifetime1) + Math.abs(var13)) &&
                    0 <= var12Lifetime1 + var8 &&
                    var13 + var9 >= 0 &&
                    this.battlefield.mapWidth > var12Lifetime1 + var8 &&
                    var9 + var13 < this.battlefield.mapHeight) {
                    this.influenceMap.a(var7, false, var11, var6, (byte) -4, 0, var9 + var13, var8 + var12Lifetime1);
                  }
                }
              }
            } else {
              this.influenceMap.a(var7, false, this.weights[55] * (float)param4, var6, (byte) -4, 0, var9, var8);
            }
          }
          var6++;
        }
    }

    final boolean h(int param0) {
        int var2;
        MapTile[] var3_ref_ne__;
        int var3;
        int var4;
        MapTile var5;
        int var6;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.field_t = this.field_t + 1;
        if (this.battlefield.pendingEvents.b(false) > 0) {
          return false;
        }
        if (this.field_w) {
          if (0 != this.field_t % 2) {
            return false;
          }
          vi.b(-128);
          this.c((byte) -117);
          vi.b(111);
          return false;
        }
        var2 = this.field_k;
        if (var2 == 0) {
          if (this.field_t >= 30) {
            this.b(1, 4);
          }
          return false;
        }
        boolean decompiledFrameCompleted0 = true;
        if (1 == var2) {
          if (this.field_t == 0) {
            if (0 == this.battlefield.unitsByPlayer[this.playerId].b(false) &&
              null != this.battlefield.campaignMission) {
              var2 = 0;
              var3_ref_ne__ = this.battlefield.tiles;
              var4 = 0;
              while (true) {
                if (var3_ref_ne__.length > var4) {
                  var5 = var3_ref_ne__[var4];
                  if (var5.isAlliedToPlayer(this.playerId, (byte) 91) &&
                    var5.isPortal(param0 + 5026) &&
                    null == var5.occupant) {
                    var2 = 1;
                  } else {
                    var4++;
                    continue;
                  }
                }
                if (var2 != 0) {
                  break;
                }
                var3 = 0;
                for (var4 = 0; this.battlefield.playerCount > var4; var4++) {
                  if (var3 == 0) {
                    if (var4 != this.playerId &&
                      0 != (1 & this.battlefield.getSurvivingPlayerMask((byte) 78) >> var4) &&
                      !this.battlefield.arePlayersAllied(var4, -16985, this.battlefield.campaignMission.playerSlot)) {
                      var3 = 1;
                    }
                    continue;
                  }
                  break;
                }
                if (var3 == 0) {
                  this.battlefield.setInactivePlayerMask(0, this.battlefield.inactivePlayerMask | 1 << this.playerId);
                }
                this.b(7, param0 ^ -5090);
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.field_S = null;
              this.field_o = 0;
              this.field_w = true;
              this.field_M = (AiUnitPlanner) (this.unitPlanners.first((byte) 122));
              this.field_L = 0;
              this.b(2, 4);
            }
          } else {
            this.field_L = 0;
            this.b(2, 4);
          }
        } else {
          switch (var2) {
            case 2:
              this.a(-113, false);
              break;
            case 3:
              if (this.field_t == 0) {
                this.sortUnitPlanners(this.unitPlanners, 0);
                this.field_S = null;
                this.field_M = (AiUnitPlanner) (this.unitPlanners.first((byte) 127));
                this.f(0);
              } else {
                this.f(0);
              }
              break;
            case 4:
              this.a(param0 + 4972, true);
              break;
            case 7:
              if (this.field_t < 50) {
                return false;
              }
              return true;
            case 6:
              this.e(-24236);
              break;
            case 5:
              this.i(0);
              break;
            case 8:
              this.g(-25523);
              break;
            default:
              break;
          }
        }
        if (param0 == -5094) {
        }
        return false;
    }

    private final void a(int param0, boolean param1) {
        if (null == this.battlefield.campaignMission) {
          this.b(param1 ? 5 : 8, 4);
          return;
        }
        this.a(param1, this.field_L, 23);
        if (param0 > -89) {
          this.field_H = (NodeDeque) null;
        }
        this.field_L = this.field_L + 1;
        if (5 <= this.field_L) {
          this.field_L = 0;
          this.b(!param1 ? 8 : 5, 4);
        }
    }

    final AiPlanningStrategy getSelectionStrategy(AiUnitPlanner unitPlanner, byte obfuscationGuard) {
        int var3_int = 0;
        RuntimeException var3 = null;
        AiPlanningStrategy stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 29 % ((obfuscationGuard + 27) / 60);
          stackIn_1_0 = this.bestScoreStrategy;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ej.C(");
          if (unitPlanner == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void c(byte param0) {
        int stackIn_53_0 = 0;
        float[][] stackIn_56_0 = null;
        int var2;
        float[] var2_ref_float__;
        Object var3_ref;
        int var3;
        int var4_int;
        float[] var4;
        float[][] var5_ref_float____;
        int var5;
        IntrusiveNode var6;
        int var7;
        float[] var8;
        float[] var9;
        MapTile var10;
        MapTile var11;
        Unit var12;
        float[][] var13;
        float[] var14;
        float[][] var15;
        int var2Lifetime1;
        int var2Lifetime2;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.field_o == 0) {
          this.a((byte) 108, this.field_A);
          this.a((byte) 111, this.field_K);
          for (var2 = 0; this.field_n.length > var2; var2++) {
            this.a((byte) 73, this.field_n[var2]);
          }
          this.field_o = this.field_o + 1;
          this.field_x = 0;
          this.field_s = 9;
          this.field_r = null;
          return;
        }
        if (this.field_o == 1) {
          if (this.battlefield.playerCount <= this.field_x) {
            this.field_o = this.field_o + 1;
          } else {
            var2Lifetime1 = this.field_x;
            var12 = this.field_r;
            var3_ref = var12;
            stackIn_53_0 = (this.battlefield.getPlayerTeamIndex(var2Lifetime1, -1) != this.battlefield.getPlayerTeamIndex(this.playerId, -1)) ? 0 : 1;
            var4_int = stackIn_53_0;
            if (var4_int == 0) {
              stackIn_56_0 = this.field_K;
            } else {
              stackIn_56_0 = this.field_A;
            }
            var15 = stackIn_56_0;
            var13 = var15;
            var5_ref_float____ = var13;
            if (this.field_s > 8) {
              if (var12 == null) {
                var6 = this.battlefield.unitsByPlayer[var2Lifetime1].sentinel.next;
              } else {
                var6 = var12.next;
              }
              if (!(var6 instanceof Unit)) {
                var3_ref = null;
              } else {
                var3_ref = (Unit) (var6);
              }
              this.field_r = (Unit) (var3_ref);
              this.field_s = 0;
            }
            if (var3_ref == null) {
              this.field_x = this.field_x + 1;
              this.field_s = 9;
            } else {
              if (!((Unit) (var3_ref)).removedFromActivePlay) {
                if (0 != this.field_s) {
                  if (var4_int != 0) {
                    this.field_s = 8;
                  } else {
                    this.a(1, -1 + this.field_s, 19551, (Unit) (var3_ref));
                  }
                } else {
                  this.influenceMap.a(var15, 1, -19545, (Unit) (var3_ref));
                }
              }
              this.field_s = this.field_s + 1;
              ((Unit) (var3_ref)).field_X = false;
            }
          }
        } else {
          if (this.field_o == 2) {
            for (var2Lifetime1 = 0; this.field_V.length > var2Lifetime1; var2Lifetime1++) {
              this.field_V[var2Lifetime1] = 0.0f;
            }
            var14 = this.field_n[0][9];
            var9 = var14;
            var8 = var9;
            var2_ref_float__ = var8;
            for (var3 = 0; var3 < var14.length; var3++) {
              var8[var3] = 0.0f;
            }
            for (var3 = 0; var3 < this.battlefield.tiles.length; var3++) {
              var4 = this.field_C;
              var5 = var3;
              this.field_T[var3] = 0.0f;
              var4[var5] = 0.0f;
              var10 = this.battlefield.tiles[var3];
              var11 = var10;
              var11 = var10;
              this.a(var3, false, 1);
              if (!var10.isPortal(-16)) {
              }
            }
            this.field_o = this.field_o + 1;
          } else {
            if (this.field_o == 3) {
              for (var2Lifetime1 = 0; this.objectiveInfluence.length > var2Lifetime1; var2Lifetime1++) {
                for (var3 = 0; var3 < this.objectiveInfluence[var2Lifetime1].length; var3++) {
                  if (null != this.objectiveInfluence[var2Lifetime1][var3]) {
                    for (var4_int = 0; this.objectiveInfluence[var2Lifetime1][var3].length > var4_int; var4_int++) {
                      this.objectiveInfluence[var2Lifetime1][var3][var4_int] = 0.0f;
                    }
                  }
                }
              }
              for (var2Lifetime1 = 0; var2Lifetime1 < this.battlefield.tiles.length; var2Lifetime1++) {
                var11 = this.battlefield.tiles[var2Lifetime1];
                var4_int = var11.getTag((byte) -107);
                if (var4_int != 0) {
                  this.a(var4_int, 1, var2Lifetime1, 29);
                }
                if (null != var11.occupant) {
                  var4_int = var11.occupant.tag;
                  if (var4_int != 0) {
                    this.a(3, -14092, var2Lifetime1, var4_int, 1);
                  }
                }
              }
              this.field_o = this.field_o + 1;
            } else {
              this.field_w = false;
              this.field_o = 0;
            }
          }
        }
        var2Lifetime2 = 9 % ((param0 + 68) / 49);
    }

    private final void g(int param0) {
        AiUnitPlanner var3 = null;
        if (null == this.field_M) {
          this.b(3, param0 ^ -25527);
          return;
        }
        if (this.field_M.unit.removedFromActivePlay ||
          this.field_M.unit.ownerPlayer != this.playerId) {
          var3 = (AiUnitPlanner) (this.unitPlanners.next((byte) 123));
          AiUnitPlanner var2 = var3;
          this.field_M.unlink(-115);
          this.field_M = var3;
          return;
        }
        if (param0 != -25523) {
          this.influenceMap = (AiInfluenceMap) null;
        }
        this.field_M.refreshDecisionPriority(-119);
        this.field_S = this.field_M;
        this.field_M = (AiUnitPlanner) (this.unitPlanners.next((byte) 123));
    }

    private final void a(int param0, Unit param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 <= 56) {
            return;
          }
          for (var4_int = 0; var4_int < 8; var4_int++) {
            this.a(param2, var4_int, 19551, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ej.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void onUnitRegistered(Unit unit, byte obfuscationGuard) {
        try {
          if (obfuscationGuard != -2) {
            field_G = (BitmapFont) null;
          }
          this.a(80, unit);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ej.A(" + (unit != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final void a(int param0, int param1, byte param2, boolean param3) {
        int var9 = 0;
        Object var5;
        int var6;
        float[][] var6_ref_float____;
        int var7_int;
        Unit var7;
        AiUnitPlanner var8;
        float[][][] var8_array;
        float[][] var10;
        int var11;
        float[][][] var12;
        int var13;
        float[][] var14;
        float[][][] var15;
        float[][] var16;
        float[][] var17;
        float[][][] var18;
        float[][] var19;
        int var6Lifetime1;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param3) {
          this.field_o = 0;
          this.field_w = true;
          while (this.field_w) {
            this.c((byte) 29);
          }
        }
        var5 = null;
        if (param2 != 18) {
          this.f(22);
        }
        for (var6 = 0; var6 < fs.field_b.length; var6++) {
          fs.field_b[var6] = 0.0f;
        }
        var7_int = param0;
        if (var7_int != 0) {
          if (var7_int != 1) {
            if (var7_int == 2) {
              var5 = this.field_K[param1];
            } else {
              if (var7_int != 3) {
                if (var7_int == 4) {
                  var5 = null;
                  if (rd.field_j != null) {
                    var7 = rd.field_j.selectedUnit;
                    if (var7 != null) {
                      var8 = (AiUnitPlanner) (this.unitPlanners.first((byte) 114));
                      while (var8 != null) {
                        if (var7 != var8.unit) {
                          var8 = (AiUnitPlanner) (this.unitPlanners.next((byte) 123));
                          continue;
                        }
                        var8.evaluateActions(false, (byte) -127);
                        break;
                      }
                    }
                  }
                }
              } else {
                var17 = this.objectiveInfluence[1];
                var14 = var17;
                var6_ref_float____ = var14;
                if (var6_ref_float____ != null &&
                  0 < var17.length) {
                  var7_int = param1 % var17.length;
                  var18 = this.objectiveInfluence;
                  var15 = var18;
                  var12 = var15;
                  var8_array = var12;
                  for (var9 = 0; var9 < var18.length; var9++) {
                    var19 = var18[var9];
                    var16 = var19;
                    var10 = var16;
                    if (var10 != null &&
                      var7_int < var19.length &&
                      var19[var7_int] != null) {
                      var5 = var19[var7_int];
                      break;
                    }
                  }
                }
              }
            }
          } else {
            var5 = this.field_n[param1 % this.field_n[4].length][9];
          }
        }
        if (var5 != null) {
          var13 = 0;
          var6Lifetime1 = var13;
          while (java.lang.reflect.Array.getLength(var5) > var13) {
            fs.field_b[var13] = ((float[]) (var5))[var13];
            var13++;
          }
        }
    }

    private final float scoreSummoningAtTile(int unitType, int baseCost, int tileIndex) {
        int var11 = 0;
        float var4;
        int var5;
        int var6;
        float var7;
        float var8;
        float var9;
        float var10;
        int var12;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var4 = 0.0f;
        var5 = 0;
        var6 = bw.unitDefinitions[unitType][0];
        var4 = var4 + this.weights[43] * (this.field_K[8][tileIndex] * (float)fk.matchupDamagePercent[var6][0]);
        if (var5 != 0) {
          System.out.println("Analyzing " + dn.unitDisplayNames[unitType] + " base score " + var4);
        }
        var7 = 0.0f;
        var8 = 0.0f;
        var9 = (float)baseCost;
        var10 = 1.0f;
        for (var11 = 0; 8 > var11; var11++) {
          var9 = var9 + this.field_n[var6][var11][tileIndex];
          var10 = var10 + this.field_K[var11][tileIndex];
          if (var11 != 4 ||
            c.a(unitType, (byte) -69)) {
            var7 = var7 + this.field_n[var6][var11][tileIndex] * (float)fk.matchupDamagePercent[var6][var11] * this.weights[28];
          }
          if (var6 != 4 ||
            4 == var11 ||
            2 == var11 ||
            var11 == 3) {
            var8 = var8 + this.field_K[var11][tileIndex] * (float)fk.matchupDamagePercent[var11][var6] * this.weights[29];
          }
        }
        if (var5 != 0) {
          System.out.println("summoning enemy vuln: " + var7 + ", total " + var9);
        }
        var4 = var4 + var7 / var9;
        if (var5 != 0) {
          System.out.println("summoning enemy power: " + var8 + ", total " + var10);
        }
        var4 = var4 - var8 / var10;
        if (var5 != 0) {
          System.out.println("Damage-wise: " + dn.unitDisplayNames[unitType] + " score " + var4);
        }
        return var4;
    }

    private final void e(int param0) {
        Unit var2;
        int[] var3;
        if (param0 != -24236) {
          var3 = (int[]) null;
          this.a((int[]) null, -30, (byte) -27);
        }
        var2 = this.battlefield.getUnitAt(this.field_y, true, this.field_E);
        if (var2 != null) {
          this.a(80, var2);
          this.b(3, param0 + 24240);
        } else {
          if (this.field_t > this.field_B + 100) {
            this.b(7, 4);
          }
        }
    }

    private final void a(int[] param0, int param1, byte param2) {
        int var4_int = 0;
        int var6 = 0;
        AiUnitPlanner discarded$1 = null;
        int var5 = 0;
        int var7 = 0;
        Unit var8 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          for (var4_int = 0; param0.length > var4_int; var4_int++) {
            var5 = 0;
            if (-1 != param0[var4_int]) {
              for (var6 = 0; var6 < var4_int; var6++) {
                if (param0[var4_int] != param0[var6]) {
                  continue;
                }
                var5 = 1;
                break;
              }
              if (var5 == 0) {
                this.a(param0[var4_int], false, param1);
              }
            }
          }
          if (param2 < 79) {
            var8 = (Unit) null;
            discarded$1 = this.registerUnitPlanner((Unit) null, (byte) -90);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("ej.J(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(byte param0, float[][] param1) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3_int = 0;
          var4 = -13 % ((30 - param0) / 40);
          while (param1.length > var3_int) {
            for (var5 = 0; param1[var3_int].length > var5; var5++) {
              param1[var3_int][var5] = 0.0f;
            }
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ej.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static int readCompactInt(CipherPacketBuffer packet, boolean obfuscationGuard) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!obfuscationGuard) {
            field_G = (BitmapFont) null;
          }
          var2_int = de.readTieredSignedInt(-108, packet, 4, 14, 30, 20);
          stackIn_3_0 = var2_int;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ej.H(");
          if (packet == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void c(Unit param0, byte param1) {
        AiUnitPlanner var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4 = 123 % ((param1 - 53) / 41);
          var3 = (AiUnitPlanner) (this.unitPlanners.first((byte) 95));
          while (var3 != null) {
            if (var3.unit == param0) {
              var3.evaluateActions(false, (byte) -124);
              return;
            }
            var3 = (AiUnitPlanner) (this.unitPlanners.next((byte) 123));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("ej.EA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        int statePc = 0;
        int var4 = 0;
        AiPlanningStrategy var5 = null;
        int var6 = 0;
        AiActionCandidate var7 = null;
        int var8_int = 0;
        UnitSpell var8 = null;
        int var9_int = 0;
        SpellCastRequest var9 = null;
        float var10 = 0.0f;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        scanLoop1: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
                    if (this.battlefield == null) {
                        statePc = 70;
                    } else {
                        statePc = 1;
                    }
                    continue scanLoop1;
                }
                case 1: {
                    if (this.battlefield.field_B[this.playerId] == null) {
                        /* Inlined CFG state: 3. */
                        {
                            return;
                        }
                    } else {
                        /* Inlined CFG state: 4. */
                        {
                            if (param2 == 23) {
                                /* Inlined CFG state: 6. */
                                {
                                    var4 = this.battlefield.field_B[this.playerId][param1];
                                    if (var4 != -1) {
                                        statePc = 8;
                                    } else {
                                        statePc = 7;
                                    }
                                    continue scanLoop1;
                                }
                            } else {
                                /* Inlined CFG state: 5. */
                                {
                                    return;
                                }
                            }
                        }
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    var5 = this.weightedScoreStrategy;
                    var5.reset((byte) -120);
                    if (!param0) {
                        statePc = 10;
                    } else {
                        statePc = 69;
                    }
                    continue scanLoop1;
                }
                case 10: {
                    var8_int = var4;
                    if (var8_int != 29) {
                        statePc = 18;
                    } else {
                        statePc = 11;
                    }
                    continue scanLoop1;
                }
                case 11: {
                    var6 = uc.spellDefinitions[var4][7];
                    var8_int = var6;
                    if (-var6 + this.battlefield.mapHeight <= var8_int) {
                        statePc = 67;
                    } else {
                        statePc = 12;
                    }
                    continue scanLoop1;
                }
                case 12: {
                    var9_int = var6;
                    if (this.battlefield.mapWidth - var6 > var9_int) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue scanLoop1;
                }
                case 13: {
                    var8_int++;
                    statePc = 50;
                    continue scanLoop1;
                }
                case 14: {
                    var10 = 0.0f;
                    var11 = -var6 + var8_int;
                    if (var8_int + var6 < var11) {
                        statePc = 61;
                    } else {
                        statePc = 15;
                    }
                    continue scanLoop1;
                }
                case 15: {
                    var12 = -var6 + var9_int;
                    if (var9_int + var6 >= var12) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue scanLoop1;
                }
                case 16: {
                    var11++;
                    statePc = 55;
                    continue scanLoop1;
                }
                case 17: {
                    var10 = var10 + this.scoreSpellAtTile(var12, var4, var11, (byte) -90);
                    var12++;
                    statePc = 42;
                    continue scanLoop1;
                }
                case 18: {
                    if (var8_int == 30) {
                        statePc = 49;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 19. */
                        {
                            if (31 == var8_int) {
                                statePc = 49;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 20. */
                                {
                                    if (var8_int == 32) {
                                        statePc = 49;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 21. */
                                        {
                                            if (33 == var8_int) {
                                                statePc = 49;
                                                continue scanLoop1;
                                            } else {
                                                /* Inlined CFG state: 22. */
                                                {
                                                    if (var8_int == 23) {
                                                        statePc = 49;
                                                    } else {
                                                        statePc = 23;
                                                    }
                                                    continue scanLoop1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 23: {
                    if (var8_int != 24) {
                        /* Inlined CFG state: 25. */
                        {
                            if (var8_int != 47) {
                                /* Inlined CFG state: 27. */
                                {
                                    if (48 == var8_int) {
                                        statePc = 49;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 28. */
                                        {
                                            if (49 != var8_int) {
                                                /* Inlined CFG state: 36. */
                                                {
                                                    if (50 != var8_int) {
                                                        statePc = 45;
                                                    } else {
                                                        statePc = 37;
                                                    }
                                                    continue scanLoop1;
                                                }
                                            } else {
                                                /* Inlined CFG state: 29. */
                                                {
                                                    var6 = uc.spellDefinitions[var4][7];
                                                    var8_int = var6;
                                                    if (-var6 + this.battlefield.mapHeight <= var8_int) {
                                                        statePc = 67;
                                                    } else {
                                                        statePc = 30;
                                                    }
                                                    continue scanLoop1;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                statePc = 49;
                                continue scanLoop1;
                            }
                        }
                    } else {
                        statePc = 49;
                        continue scanLoop1;
                    }
                }
                case 30: {
                    var9_int = var6;
                    if (this.battlefield.mapWidth - var6 > var9_int) {
                        /* Inlined CFG state: 32. */
                        {
                            var10 = 0.0f;
                            var11 = -var6 + var8_int;
                            if (var8_int + var6 < var11) {
                                statePc = 61;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 33. */
                                {
                                    var12 = -var6 + var9_int;
                                    if (var9_int + var6 >= var12) {
                                        /* Inlined CFG state: 35. */
                                        {
                                            var10 = var10 + this.scoreSpellAtTile(var12, var4, var11, (byte) -90);
                                            var12++;
                                            statePc = 42;
                                            continue scanLoop1;
                                        }
                                    } else {
                                        /* Inlined CFG state: 34. */
                                        {
                                            var11++;
                                            statePc = 55;
                                            continue scanLoop1;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        /* Inlined CFG state: 31. */
                        {
                            var8_int++;
                            statePc = 50;
                            continue scanLoop1;
                        }
                    }
                }
                case 37: {
                    var6 = uc.spellDefinitions[var4][7];
                    var8_int = var6;
                    if (-var6 + this.battlefield.mapHeight <= var8_int) {
                        statePc = 67;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 38. */
                        {
                            var9_int = var6;
                            if (this.battlefield.mapWidth - var6 > var9_int) {
                                /* Inlined CFG state: 40. */
                                {
                                    var10 = 0.0f;
                                    var11 = -var6 + var8_int;
                                    if (var8_int + var6 < var11) {
                                        statePc = 61;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 41. */
                                        {
                                            var12 = -var6 + var9_int;
                                            statePc = 42;
                                            continue scanLoop1;
                                        }
                                    }
                                }
                            } else {
                                /* Inlined CFG state: 39. */
                                {
                                    var8_int++;
                                    statePc = 50;
                                    continue scanLoop1;
                                }
                            }
                        }
                    }
                }
                case 42: {
                    if (var9_int + var6 >= var12) {
                        /* Inlined CFG state: 44. */
                        {
                            var10 = var10 + this.scoreSpellAtTile(var12, var4, var11, (byte) -90);
                            var12++;
                            statePc = 42;
                            continue scanLoop1;
                        }
                    } else {
                        /* Inlined CFG state: 43. */
                        {
                            var11++;
                            statePc = 55;
                            continue scanLoop1;
                        }
                    }
                }
                case 45: {
                    if (var8_int == 51) {
                        statePc = 49;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 46. */
                        {
                            if (52 == var8_int) {
                                statePc = 49;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 47. */
                                {
                                    if (var8_int == 53) {
                                        statePc = 49;
                                    } else {
                                        statePc = 69;
                                    }
                                    continue scanLoop1;
                                }
                            }
                        }
                    }
                }
                case 49: {
                    var6 = uc.spellDefinitions[var4][7];
                    var8_int = var6;
                    statePc = 50;
                    continue scanLoop1;
                }
                case 50: {
                    if (-var6 + this.battlefield.mapHeight <= var8_int) {
                        statePc = 67;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 51. */
                        {
                            var9_int = var6;
                            statePc = 52;
                            continue scanLoop1;
                        }
                    }
                }
                case 52: {
                    if (this.battlefield.mapWidth - var6 > var9_int) {
                        /* Inlined CFG state: 54. */
                        {
                            var10 = 0.0f;
                            var11 = -var6 + var8_int;
                            statePc = 55;
                            continue scanLoop1;
                        }
                    } else {
                        /* Inlined CFG state: 53. */
                        {
                            var8_int++;
                            statePc = 50;
                            continue scanLoop1;
                        }
                    }
                }
                case 55: {
                    if (var8_int + var6 < var11) {
                        statePc = 61;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 56. */
                        {
                            var12 = -var6 + var9_int;
                            statePc = 57;
                            continue scanLoop1;
                        }
                    }
                }
                case 57: {
                    if (var9_int + var6 >= var12) {
                        /* Inlined CFG state: 59. */
                        {
                            var10 = var10 + this.scoreSpellAtTile(var12, var4, var11, (byte) -90);
                            var12++;
                            statePc = 57;
                            continue scanLoop1;
                        }
                    } else {
                        /* Inlined CFG state: 58. */
                        {
                            var11++;
                            statePc = 55;
                            continue scanLoop1;
                        }
                    }
                }
                case 61: {
                    if (var10 != 0.0f) {
                        /* Inlined CFG state: 64. */
                        {
                            var5.a(param1, var9_int, var8_int, var10, (byte) 71, this.playerId);
                            statePc = 65;
                            continue scanLoop1;
                        }
                    } else {
                        statePc = 65;
                        continue scanLoop1;
                    }
                }
                case 65: {
                    var9_int++;
                    statePc = 52;
                    continue scanLoop1;
                }
                case 67: {
                    var7 = var5.selectCandidate((byte) -102);
                    if (var7 == null) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue scanLoop1;
                }
                case 68: {
                    this.battlefield.field_J = true;
                    var8 = new UnitSpell(var4, var7.destinationX, var7.destinationY);
                    var9 = new SpellCastRequest(var8, -1, this.playerId);
                    this.executeActionRequest(var9, -126);
                    statePc = 69;
                    continue scanLoop1;
                }
                case 69: {
                    return;
                }
                case 70: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, Unit param1) {
        AiUnitPlanner var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param1 == null) {
            return;
          }
          if (this.playerId != param1.ownerPlayer) {
            return;
          }
          if (param1.aiPlanner != null &&
            this == param1.aiPlanner.planner) {
            return;
          }
          var3 = this.registerUnitPlanner(param1, (byte) -98);
          var3.refreshDecisionPriority(param0 ^ 14);
          if (param0 != 80) {
            AiPlanner.a(-94);
          }
          this.influenceMap.a(this.field_A, 1, param0 ^ -19465, var3.unit);
          if (6 == this.field_k) {
            this.b(3, 4);
            this.field_M = (AiUnitPlanner) (this.unitPlanners.a(true, var3));
            this.field_t = 2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("ej.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void f(int param0) {
        int var2_int;
        float var2;
        int var3;
        int var4;
        int var5;
        Unit var6;
        Unit var7;
        Unit var8;
        if (null != this.field_S) {
          if (this.field_S.unit.field_X) {
            if (!this.field_S.unit.removedFromActivePlay) {
              this.influenceMap.a(this.field_A, 1, -19545, this.field_S.unit);
              if (this.field_S.unit.tag != 0) {
                this.a(3, -14092, this.battlefield.mapWidth * this.field_S.unit.tileY + this.field_S.unit.tileX, this.field_S.unit.tag, 1);
              }
            }
            this.field_S.unit.field_X = false;
            var2_int = this.field_S.previousSourceTile;
            var3 = this.field_S.previousTargetTile;
            var4 = this.field_S.previousDestinationTile;
            this.a(new int[]{var2_int, var3, var4}, -1, (byte) 113);
            this.field_S.previousTargetTile = -1;
            this.field_S.previousSourceTile = -1;
            this.field_S.previousDestinationTile = -1;
          }
          var7 = this.field_S.selectedTarget;
          var8 = var7;
          if (var8 != null &&
            var8.field_X) {
            this.influenceMap.a(this.field_K, 1, -19545, var8);
            if (var8.tag != 0) {
              this.a(3, -14092, var8.tileY * this.battlefield.mapWidth + var8.tileX, var8.tag, 1);
            }
            this.a(66, var8, 1);
            this.influenceMap.a(this.field_n[var7.getUnitCategory(0)], 1, param0 - 19545, var8);
            var8.field_X = false;
          }
        }
        this.field_S = this.field_M;
        if (param0 != 0) {
          return;
        }
        if (null == this.field_M) {
          this.b(4, param0 + 4);
          return;
        }
        this.currentUnitPlanner = this.field_M;
        var2 = this.field_M.evaluateActions(true, (byte) -124);
        if (-3.4028234663852886e+38f != var2) {
          this.influenceMap.a(this.field_A, -1, param0 ^ -19545, this.field_M.unit);
          var3 = this.field_M.unit.tileY * this.battlefield.mapWidth + this.field_M.unit.tileX;
          if (this.field_M.unit.tag != 0) {
            this.a(3, -14092, var3, this.field_M.unit.tag, -1);
          }
          var4 = -1;
          var5 = -1;
          var6 = this.field_M.selectedTarget;
          if (var6 != null) {
            this.influenceMap.a(this.field_K, -1, -19545, var6);
            this.a(77, var6, -1);
            var4 = this.battlefield.mapWidth * var6.tileY + var6.tileX;
            if (var6.tag != 0) {
              this.a(3, -14092, var4, var6.tag, -1);
            }
          }
          if (this.field_M.selectedAction.hasDestination(0)) {
            var5 = this.field_M.selectedAction.destinationX + this.battlefield.mapWidth * this.field_M.selectedAction.destinationY;
          }
          this.a(new int[]{var3, var4, var5}, -1, (byte) 98);
          this.field_M.previousTargetTile = var4;
          this.field_M.previousDestinationTile = var5;
          this.field_M.previousSourceTile = var3;
          this.field_M.executeSelectedAction(4);
          this.field_M.unit.field_X = true;
          if (var6 != null) {
            var6.field_X = true;
          }
        }
        if (-3.4028234663852886e+38f != var2 &&
          this.field_M.selectedAction.executionResult != -2 &&
          this.field_M.unit.attacksRemaining > 0) {
          return;
        }
        this.field_M = (AiUnitPlanner) (this.unitPlanners.next((byte) 123));
        return;
    }

    final void a(byte param0) {
        int var2_int = 0;
        Unit var2;
        Unit var3;
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.b(0, param0 + 127);
        this.field_q = 0;
        this.field_H.b(param0 ^ -28);
        this.field_O.b(param0 ^ -42);
        for (var2_int = 0; var2_int < this.battlefield.unitsByPlayer.length; var2_int++) {
          var3 = (Unit) (this.battlefield.unitsByPlayer[var2_int].first((byte) 112));
          while (var3 != null) {
            var3.field_X = true;
            var3 = (Unit) (this.battlefield.unitsByPlayer[var2_int].next((byte) 123));
          }
        }
        if (param0 != -123) {
          this.battlefield = (Battlefield) null;
        }
        var2 = (Unit) (this.battlefield.unitsByPlayer[this.playerId].first((byte) 99));
        while (var2 != null) {
          if (var2.aiPlanner != null &&
            this != var2.aiPlanner.planner) {
            var2.aiPlanner.unlink(param0 ^ -11);
            var2.aiPlanner = null;
          }
          if (var2.aiPlanner == null) {
            var2.aiPlanner = new AiUnitPlanner(this, var2);
            this.unitPlanners.addFirst(param0 + 873, var2.aiPlanner);
          }
          var2 = (Unit) (this.battlefield.unitsByPlayer[this.playerId].next((byte) 123));
        }
        this.field_M = (AiUnitPlanner) (this.unitPlanners.first((byte) 108));
        this.field_S = null;
    }

    private final void sortUnitPlanners(NodeDeque planners, int obfuscationGuard) {
        int var3_int = 0;
        Object var4 = null;
        AiUnitPlanner var4_ref = null;
        Object var5 = null;
        AiUnitPlanner var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3_int = 1;
          while (var3_int != 0) {
            var3_int = 0;
            var4 = null;
            var5_ref = (AiUnitPlanner) (this.unitPlanners.first((byte) 113));
            while (var5_ref != null) {
              var4_ref = (AiUnitPlanner) (this.unitPlanners.next((byte) 123));
              if (var4_ref == null) {
                break;
              }
              if (var5_ref.shouldFollow((byte) -87, var4_ref)) {
                var5_ref.unlink(-122);
                var3_int = 1;
                ro.a(var4_ref, var5_ref, true);
              }
              var5_ref = var4_ref;
            }
          }
          if (obfuscationGuard != 0) {
            this.field_t = 6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ej.AA(");
          if (planners == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param3 != 29) {
          AiUnitPlanner var6 = (AiUnitPlanner) null;
          this.getSelectionStrategy((AiUnitPlanner) null, (byte) -87);
        }
        this.a(0, param3 ^ -14103, param2, param0, param1);
    }

    private final void i(int param0) {
        int var18 = 0;
        int stackIn_75_0 = 0;
        float var3;
        double var4;
        double var6;
        double var8;
        double var10;
        int var12;
        int var13_int;
        AiActionCandidate var13;
        int var14;
        int[] var15;
        int var16;
        int var17;
        int var19;
        int var20;
        int var21;
        float var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        Unit var29;
        AiUnitPlanner var30;
        float var31;
        int var32;
        Object var33;
        AiPlanningStrategy var34;
        MapTile var35;
        MapTile var36;
        Unit var37;
        int var13_intLifetime1;
        float var22Lifetime1;
        int var28Lifetime1;
        int var28Lifetime2;
        MapTile var36Lifetime1;
        MapTile var36Lifetime2;
        var33 = null;
        var32 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 != 0) {
          this.field_T = (float[]) null;
        }
        var34 = this.weightedScoreStrategy;
        if (this.battlefield.playerMana[this.playerId] - this.field_q >= 50) {
          var3 = 1.401298464324817e-45f;
          var4 = 0.3;
          var6 = 0.0;
          var8 = 0.0;
          var10 = 0.0;
          var34.reset((byte) -122);
          var37 = (Unit) (this.battlefield.unitsByPlayer[this.playerId].first((byte) 89));
          while (var37 != null) {
            if (var37.canCaptureStructures(-21428)) {
              var4 = var4 - (double)(this.weights[22] * 2.0f / (float)this.battlefield.playerCount);
            } else {
              if (!var37.f((byte) -125)) {
                if (var37.s(param0 + 127)) {
                  var10 = var10 - (double)this.weights[18];
                }
              } else {
                var6 = var6 - (double)this.weights[14];
              }
            }
            if (!var37.p((byte) -113) &&
              !var37.d((byte) 105)) {
              var8 = var8 + (double)this.weights[27];
            } else {
              var8 = var8 - (double)this.weights[16];
            }
            var37 = (Unit) (this.battlefield.unitsByPlayer[this.playerId].next((byte) 123));
          }
          for (var13_int = 0; this.battlefield.tiles.length > var13_int; var13_int++) {
            var35 = this.battlefield.tiles[var13_int];
            var36 = var35;
            var36Lifetime2 = var35;
            if (this.playerId != var35.ownerPlayer &&
              var35.isStructure(false)) {
              var4 = var4 + (double)(this.weights[21] * 2.0f / (float)this.battlefield.playerCount);
            }
            if (var35.hasCorpse(83)) {
              var10 = var10 + (double)this.weights[17];
              var6 = var6 + (double)this.weights[13];
            }
          }
          var12 = 0;
          for (var13_intLifetime1 = 0; this.battlefield.tiles.length > var13_intLifetime1; var13_intLifetime1++) {
            var36Lifetime1 = this.battlefield.tiles[var13_intLifetime1];
            if (null == var36Lifetime1.occupant &&
              var36Lifetime1.isPortal(-37) &&
              this.playerId == var36Lifetime1.ownerPlayer) {
              var15 = this.battlefield.godFavourLevels[this.playerId];
              var16 = var13_intLifetime1 % this.battlefield.mapWidth;
              var17 = var13_intLifetime1 / this.battlefield.mapWidth;
              for (var18 = 0; var18 < 75; var18++) {
                if (var18 != 72 &&
                  var18 != 39 &&
                  var18 != 7 &&
                  var18 != 34 &&
                  var18 != 51 &&
                  var18 != 27) {
                  var19 = bw.unitDefinitions[var18][1];
                  if ((var36Lifetime1.terrainType != 11 ||
                    var36Lifetime1.godId == var19) &&
                    (-1 != var19 ||
                    (this.battlefield.field_a[this.playerId][var19 + 1] & 1 << b.getUnitUnlockOrdinal(false, var18)) != 0)) {
                    var20 = this.battlefield.canSummonUnitAt(var17, -26813, var18, var16, this.playerId) ? 1 : 0;
                    var21 = var20;
                    if (var20 == 0) {
                      this.battlefield.playerMana[this.playerId] = this.battlefield.playerMana[this.playerId] + this.battlefield.getStructureIncome(-116, this.playerId);
                      stackIn_75_0 = (!this.battlefield.canSummonUnitAt(var17, param0 ^ -26813, var18, var16, this.playerId)) ? 0 : 1;
                      var21 = stackIn_75_0;
                      this.battlefield.playerMana[this.playerId] = this.battlefield.playerMana[this.playerId] - this.battlefield.getStructureIncome(-101, this.playerId);
                    }
                    if (var21 != 0) {
                      var22 = 0.0f;
                      var23 = bw.unitDefinitions[var18][4];
                      var22 = var22 + (float)var23 * this.weights[26];
                      var22Lifetime1 = this.scoreSummoningAtTile(var18, 1, var13_intLifetime1);
                      var25 = bw.unitDefinitions[var18][1];
                      if (var25 != -1) {
                        var24 = var15[var25];
                        if (var24 == bw.unitDefinitions[var18][2]) {
                          var22Lifetime1 = var22Lifetime1 + (float)var24 * this.weights[23];
                        }
                      }
                      var22Lifetime1 = var22Lifetime1 - this.weights[25] * (float)bw.unitDefinitions[var18][8] * 0.029999999329447746f;
                      var26 = bw.unitDefinitions[var18][10];
                      var27 = bw.unitDefinitions[var18][12];
                      if (18 == var27) {
                        var22Lifetime1 = var22Lifetime1 - this.weights[45];
                      }
                      if ((var26 & 2) != 0 ||
                        (16 & var26) != 0) {
                        var22Lifetime1 = (float)((double)var22Lifetime1 + var8);
                        for (var28 = 0; var28 < 8; var28++) {
                          var22Lifetime1 = var22Lifetime1 + this.weights[15] * this.field_A[var28][var13_intLifetime1];
                        }
                      }
                      if ((32 & var26) != 0) {
                        var22Lifetime1 = (float)((double)var22Lifetime1 + var10);
                      }
                      if (21 == var18) {
                        var22Lifetime1 = (float)((double)var22Lifetime1 + var6);
                      }
                      if (var18 == 0 ||
                        3 == var18) {
                        var22Lifetime1 = (float)((double)var22Lifetime1 + var4);
                        for (var28Lifetime1 = 0; var28Lifetime1 < 8; var28Lifetime1++) {
                          var22Lifetime1 = var22Lifetime1 + this.weights[44] * this.field_A[var28Lifetime1][var13_intLifetime1];
                          var22Lifetime1 = var22Lifetime1 - this.field_K[var28Lifetime1][var13_intLifetime1] * this.weights[44];
                        }
                      }
                      var28Lifetime2 = 1;
                      if (var18 == 74) {
                        var28Lifetime2 = 2;
                      }
                      var29 = new Unit(var16, var17, var18, this.playerId, var23, var23, var28Lifetime2, 0, 0, this.battlefield, 0, 0, -1, true, 0);
                      var30 = new AiUnitPlanner(this, var29);
                      var30.refreshDecisionPriority(-86);
                      var31 = var30.evaluateActions(false, (byte) -127);
                      var22Lifetime1 = var22Lifetime1 + var31;
                      if (var20 != 0) {
                        var34.submitSummonCandidate(var17, var18, var22Lifetime1, this.playerId, var16, true);
                        var12 = 1;
                        if (var3 < var22Lifetime1) {
                          var3 = var22Lifetime1;
                        }
                      } else {
                        if (var21 != 0) {
                          var22Lifetime1 = var22Lifetime1 - this.weights[42];
                          var34.submitResultCandidate((byte) -68, var18, var22Lifetime1);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          if (var12 != 0) {
            var13 = var34.selectCandidate((byte) -84);
            if (var13 != null) {
              this.b(6, 4);
              this.field_B = this.field_t;
              var14 = var13.executionResult;
              var13.execute((byte) 5, this);
              if (var14 != -1) {
                if (0 > var14) {
                  return;
                }
                this.field_q = this.field_q + bw.unitDefinitions[var14][8];
              }
            }
          }
          this.b(7, param0 ^ 4);
        } else {
          this.b(7, param0 ^ 4);
        }
    }

    final static boolean b(int param0, int param1, int param2, int param3) {
        int var4;
        int stackIn_22_0 = 0;
        if (param2 != -14) {
          field_G = (BitmapFont) null;
        }
        if (null != Spell.field_d &&
          rs.field_q == 13) {
          Spell.field_d = null;
          return true;
        }
        if (!hf.field_c) {
          if (!iu.field_h &&
            rs.field_q != 9 &&
            rs.field_q != 10 &&
            rs.field_q != 11) {
            if (80 != rs.field_q) {
              return false;
            }
            if (!os.e(-1)) {
              return false;
            }
            hf.field_c = true;
            return true;
          }
          return cd.a(param0, param1, false);
        }
        if (!os.e(-1)) {
          return false;
        }
        stackIn_22_0 = (!ro.b(param3, (byte) -59, param0)) ? 0 : 1;
        var4 = stackIn_22_0;
        if (80 == rs.field_q ||
          84 == rs.field_q) {
          hf.field_c = false;
          var4 = 1;
        }
        if (rs.field_q == 13) {
          rd.b(8445);
          hf.field_c = false;
          var4 = 1;
        }
        return var4 != 0;
    }

    private final void b(int param0, int param1) {
        this.field_k = param0;
        if (param1 != 4) {
          return;
        }
        this.field_t = -1;
    }

    private final void a(int param0, int param1, int param2, Unit param3) {
        float var5_float = 0.0f;
        if (param2 != 19551) {
          return;
        }
        try {
          var5_float = (float)param3.getEffectiveStrength((byte) 122);
          if (param3.hasMovementFlag1(false)) {
            var5_float = var5_float * this.weights[59];
          }
          this.influenceMap.a(param2 ^ -19507, param3.tileY, (float)param0 * var5_float, param1, param3.getUnitCategory(0), this.field_n, param3.tileX);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ej.G(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final AiUnitPlanner registerUnitPlanner(Unit unit, byte obfuscationGuard) {
        int var4 = 0;
        float[] array$0 = null;
        AiUnitPlanner stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        AiUnitPlanner var3 = null;
        RuntimeException var3_ref = null;
        CampaignUnitOverride var5 = null;
        int var6 = 0;
        ActionRequest var7 = null;
        CampaignUnitOverride[] var8 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.campaignOverrides != null) {
            var8 = this.campaignOverrides;
            for (var4 = 0; var4 < var8.length; var4++) {
              var5 = var8[var4];
              if (var5 != null &&
                unit.unitType == var5.unitType) {
                unit.displayName = var5.displayName;
                if (0 >= var5.strength) {
                  break;
                }
                unit.maximumStrength = var5.strength;
                unit.strength = var5.strength;
                break;
              }
            }
          }
          var3 = new AiUnitPlanner(this, unit);
          this.unitPlanners.addLast((byte) -119, (IntrusiveNode) (var3));
          if (obfuscationGuard > -66) {
            var7 = (ActionRequest) null;
            this.executeActionRequest((ActionRequest) null, 49);
          }
          if (unit.objectiveId != 0 &&
            null == this.objectiveInfluence[unit.getUnitCategory(0)][-1 + unit.objectiveId]) {
            array$0 = new float[this.battlefield.tiles.length];
            this.objectiveInfluence[unit.getUnitCategory(0)][unit.objectiveId - 1] = array$0;
          }
          stackIn_16_0 = var3;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("ej.FA(");
          if (unit == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    AiPlanner(Battlefield battlefield, int playerId, boolean configurationFlag, CampaignUnitOverride[] campaignOverrides) {
        int var5_int = 0;
        Unit var6 = null;
        AiUnitPlanner discarded$0 = null;
        Unit var6Lifetime1;
        try {
          this.field_H = new NodeDeque();
          this.field_O = new NodeDeque();
          this.unitPlanners = new NodeDeque();
          this.battlefield = battlefield;
          this.playerId = playerId;
          this.weights = new float[62];
          AttackEvent.a(false, 3, li.field_n);
          this.battlefield.unitObservers.addLast((byte) -119, (IntrusiveNode) (this));
          aj.a(this.weights, 117);
          this.campaignOverrides = campaignOverrides;
          var5_int = 0;
          var6 = (Unit) (this.battlefield.unitsByPlayer[this.playerId].first((byte) 104));
          while (var6 != null) {
            if (var5_int < var6.objectiveId) {
              var5_int = var6.objectiveId;
            }
            var6 = (Unit) (this.battlefield.unitsByPlayer[this.playerId].next((byte) 123));
          }
          this.objectiveInfluence = new float[8][var5_int][];
          this.actionMovement = new MovementPlanner(this.battlefield);
          this.evaluationMovement = new MovementPlanner(this.battlefield);
          this.field_A = new float[10][this.battlefield.tiles.length];
          this.field_K = new float[10][this.battlefield.tiles.length];
          this.field_n = new float[8][10][this.battlefield.tiles.length];
          this.field_V = new float[this.battlefield.tiles.length];
          this.tileEvaluationCache = new float[this.battlefield.tiles.length];
          this.currentUnitPlanner = null;
          this.influenceMap = new AiInfluenceMap(this.battlefield.tiles, this.battlefield.mapWidth, this.battlefield.mapHeight);
          this.field_v = new float[this.battlefield.tiles.length];
          this.field_T = new float[this.battlefield.tiles.length];
          this.field_C = new float[this.battlefield.tiles.length];
          var6Lifetime1 = (Unit) (this.battlefield.unitsByPlayer[this.playerId].first((byte) 126));
          while (var6Lifetime1 != null) {
            discarded$0 = this.registerUnitPlanner(var6Lifetime1, (byte) -68);
            var6Lifetime1 = (Unit) (this.battlefield.unitsByPlayer[this.playerId].next((byte) 123));
          }
          this.bestScoreStrategy = (AiPlanningStrategy) ((Object) new BestScoreStrategy(this));
          this.weightedScoreStrategy = (AiPlanningStrategy) ((Object) new WeightedScoreStrategy(this));
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ej.<init>(" + (battlefield != null ? "{...}" : "null") + ',' + playerId + ',' + configurationFlag + ',' + (campaignOverrides != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_R = "Unpacking models";
    }
}
