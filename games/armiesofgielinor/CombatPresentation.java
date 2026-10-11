/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class CombatPresentation implements EventPresentation {
    private BattleCharacter[] attackers;
    static String field_N;
    private BattleCamera camera;
    static jp field_G;
    static kl field_M;
    RgbSprite framebuffer;
    private boolean field_d;
    private EventPresenter presenter;
    private Battlefield battlefield;
    private boolean field_o;
    private int field_a;
    private BattleCharacter[] defenders;
    RgbSprite field_A;
    private int field_I;
    private int field_e;
    private int[] field_l;
    private int field_g;
    private int phase;
    private int field_J;
    private int field_O;
    private km[] field_D;
    private int field_u;
    private int field_v;
    private boolean field_m;
    private int field_p;
    private boolean field_h;
    static int[][] field_j;
    private boolean field_q;
    private int[] field_b;
    private int field_y;
    private int field_c;
    private int field_C;
    private int phaseFrame;
    private boolean field_P;
    private int field_t;
    private int field_L;
    private int field_w;
    private boolean field_E;
    private int mapWidth;
    private int field_z;
    private boolean field_f;

    private final void m(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.defenders[0].field_d) {
            return;
          }
          var2_int = 0;
          if (param0 != -13146) {
            this.field_I = 30;
          }
          while ((-this.field_J + 3) > var2_int) {
            if (var3 != 0) {
              return;
            }
            if (this.attackers[var2_int] != null &&
              this.attackers[var2_int].isIdle((byte) 44)) {
              this.attackers[var2_int].animationDelay = AttackEvent.a(false, 20, vv.field_b);
              this.attackers[var2_int].animationFrame = 1;
            }
            var2_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "sk.OA(" + param0 + ')');
        }
    }

    private final void a(BattleCharacter[] param0, int param1, int param2, BattleCharacter[] param3, boolean param4) {
        RuntimeException stackIn_148_0 = null;
        StringBuilder stackIn_148_1 = null;
        String stackIn_149_2 = null;
        StringBuilder stackIn_152_1 = null;
        String stackIn_153_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var6 = new int[-param1 + 3];
          var7 = 0;
          if (param1 != 2) {
            boolean decompiledFrameRemainder1 = true;
            if ((param1 != 1) &&
              (decompiledFrameRemainder1 = (param1 == 0))) {
              if (null != param0[0] &&
                param0[0].isAtDestination(2166) &&
                param3[0] == null && (1 != param2 ||
                param3[1] == null)) {
                var6[var7] = 0;
                var7++;
              }
              if (param0[1] != null &&
                param0[1].isAtDestination(2166) && ((0 == param2 ||
                null == param3[0]) &&
                (param2 != 0 ||
                null == param3[1]))) {
                var6[var7] = 1;
                var7++;
              }
              decompiledFrameRemainder1 = (null != param0[2]);
              if ((decompiledFrameRemainder1) &&
                (decompiledFrameRemainder1 = !(!param0[2].isAtDestination(2166))) &&
                (decompiledFrameRemainder1 = (param2 != 2 ||
                param3[0] == null)) &&
                (decompiledFrameRemainder1 = (1 != param2 ||
                param3[1] == null)) &&
                (decompiledFrameRemainder1 = (param2 != 0 ||
                param3[2] == null))) {
                var6[var7] = 2;
                var7++;
              }
            }
            if ((decompiledFrameRemainder1) &&
              (param1 == 1 ||
              var10 != 0)) {
              if (null != param0[0] &&
                param0[0].isAtDestination(2166) &&
                param3[0] == null && (param2 != 0 ||
                param3[1] == null)) {
                var6[var7] = 0;
                var7++;
              }
              if (null != param0[1] &&
                param0[1].isAtDestination(2166) &&
                null == param3[0] && (0 != param2 ||
                null == param3[2])) {
                var6[var7] = 1;
                var7++;
                if (var10 != 0) {
                  return;
                }
              }
            }
            if (var7 == 0) {
              return;
            }
            var8 = -1;
            if (!param4) {
              this.field_C = -127;
            }
            boolean decompiledFrameRemainder0 = true;
            var9 = var6[AttackEvent.a(false, var7, vv.field_b)];
            if (1 != param1 ||
              param0[2] != null) {
              if (param1 == 0) {
                if (var9 != 2) {
                  if (param0[3] == null) {
                    var8 = 3;
                    decompiledFrameRemainder0 = (var10 != 0);
                  }
                  if ((decompiledFrameRemainder0) &&
                    (decompiledFrameRemainder0 = (param1 == 0)) &&
                    (decompiledFrameRemainder0 = (param0[4] == null))) {
                    var8 = 4;
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (var9 == 2 ||
                  var10 != 0)) {
                  if (null == param0[4]) {
                    var8 = 4;
                    if ((var10 != 0) &&
                      (0 == param1 &&
                      param0[3] == null)) {
                      var8 = 3;
                      var8 = 2;
                    }
                  } else {
                    if (0 == param1 &&
                      param0[3] == null) {
                      var8 = 3;
                      if (var10 != 0) {
                        var8 = 2;
                      }
                    }
                  }
                }
              }
            } else {
              var8 = 2;
            }
            if (var8 > -1) {
              param0[var8] = param0[var9];
              param0[var9] = null;
              param0[var8].currentX = tn.field_W[param1][var8];
              param0[var8].currentY = kw.field_P[param1][var8];
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_148_0 = var6_ref;
          stackIn_148_1 = new StringBuilder().append("sk.B(");
          if (param0 == null) {
            stackIn_149_2 = "null";
          } else {
            stackIn_149_2 = "{...}";
          }
          stackIn_152_1 = ((StringBuilder) (Object) stackIn_148_1).append(stackIn_149_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_153_2 = "null";
          } else {
            stackIn_153_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_148_0), ((StringBuilder) (Object) stackIn_152_1).append(stackIn_153_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(BattleCharacter[] param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 != -4925) {
            CombatPresentation.c(-81);
          }
          var3_int = 0;
          while (var3_int < param0.length) {
            if (var4 != 0) {
              return;
            }
            if (null != param0[var3_int] &&
              param0[var3_int].isIdle((byte) 121)) {
              param0[var3_int].animationFrame = 5;
              param0[var3_int].animationDelay = AttackEvent.a(false, 20, vv.field_b);
            }
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("sk.GA(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, BattleCharacter[] param1, byte param2) {
        Object stackIn_55_0 = null;
        BattleCharacter stackIn_55_1 = null;
        BattleCharacter stackIn_58_0 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var8Lifetime1;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param2 != 83) {
            return;
          }
          param0 = 0;
          var4_int = 0;
          do {
            if (var4_int >= param1.length) {
              var4_int = 0;
              break;
            }
            param0++;
            var4_int++;
          } while (var9 == 0);
          var5 = new int[param0];
          var6 = 0;
          scanLoop1: while (true) {
            if (var6 < param1.length) {
              stackIn_58_0 = param1[var6];
              if (var9 == 0) {
                if (stackIn_58_0 != null) {
                  var5[var4_int++] = var6;
                }
                var6++;
                continue;
              }
            } else {
              param0 = var4_int;
              var6 = 0;
              while (param0 > var6) {
                var7 = var6;
                stackIn_55_0 = null;
                stackIn_55_1 = param1[var5[var7]];
                if (var9 == 0) {
                  if (stackIn_55_0 != stackIn_55_1) {
                    var8 = var6 + 1;
                    while (var8 < param0) {
                      stackIn_55_0 = null;
                      stackIn_55_1 = param1[var5[var8]];
                      if (stackIn_55_0 != stackIn_55_1 &&
                        param1[var5[var8]].destinationY > param1[var5[var7]].destinationY) {
                        var7 = var8;
                      }
                      var8++;
                    }
                    if (var7 != var6) {
                      var8Lifetime1 = var5[var7];
                      var5[var7] = var5[var6];
                      var5[var6] = var8Lifetime1;
                    }
                  }
                  var6++;
                  continue;
                }
                while (true) {
                  if (stackIn_55_0 != stackIn_55_1) {
                    stackIn_58_0 = param1[var5[var6]];
                    ((BattleCharacter) (Object) stackIn_58_0).a(this.field_C, param2 ^ -56, false);
                  }
                  var6++;
                  if (var9 != 0) {
                    return;
                  }
                  if (param0 <= var6) {
                    return;
                  }
                  stackIn_55_0 = null;
                  stackIn_55_1 = param1[var5[var6]];
                }
              }
              if (cu.field_a) {
                var6 = 0;
                while (var6 < param0) {
                  stackIn_58_0 = param1[var5[var6]];
                  if (var9 != 0) {
                    break scanLoop1;
                  }
                  if (stackIn_58_0 != null) {
                    param1[var5[var6]].a(this.field_C, -84, true);
                  }
                  var6++;
                }
                this.a((byte) 104, 0, 0, 128);
              }
              var6 = 0;
              while (true) {
                if (param0 <= var6) {
                  return;
                }
                if (var9 != 0) {
                  return;
                }
                stackIn_55_0 = null;
                stackIn_55_1 = param1[var5[var6]];
                if (stackIn_55_0 != stackIn_55_1) {
                  stackIn_58_0 = param1[var5[var6]];
                  ((BattleCharacter) (Object) stackIn_58_0).a(this.field_C, param2 ^ -56, false);
                }
                var6++;
              }
            }
            break;
          }
          while (true) {
            ((BattleCharacter) (Object) stackIn_58_0).a(this.field_C, param2 ^ -56, false);
            do {
              var6++;
              if (var9 != 0) {
                return;
              }
              if (param0 <= var6) {
                return;
              }
              stackIn_55_0 = null;
              stackIn_55_1 = param1[var5[var6]];
            } while (stackIn_55_0 == stackIn_55_1);
            stackIn_58_0 = param1[var5[var6]];
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_64_0 = var4;
          stackIn_64_1 = new StringBuilder().append("sk.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param2).append(')').toString());
        }
    }

    public final boolean isCombatViewReady(byte obfuscationGuard) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == u.field_p) {
            return true;
          }
          if (obfuscationGuard < -25) {
            stackIn_7_0 = u.field_p.isExpanded((byte) -106);
            return stackIn_7_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.I(" + obfuscationGuard + ')');
        }
    }

    public final boolean initialize(GameEvent event, byte obfuscationGuard) {
        boolean stackIn_8_1 = false;
        int stackIn_37_1 = 0;
        int stackIn_40_1 = 0;
        int stackIn_41_2 = 0;
        boolean stackIn_57_1 = false;
        int stackIn_67_1 = 0;
        int stackIn_71_1 = 0;
        boolean stackIn_87_1 = false;
        int stackIn_192_1 = 0;
        BattleCharacter stackIn_204_2;
        BattleCharacter stackIn_204_3;
        int stackIn_204_4;
        boolean stackIn_204_5;
        int stackIn_204_6;
        int stackIn_204_7;
        boolean stackIn_204_8;
        BattleCharacter stackIn_205_2 = null;
        BattleCharacter stackIn_205_3 = null;
        int stackIn_205_9 = 0;
        BattleCharacter stackIn_214_2;
        BattleCharacter stackIn_214_3;
        int stackIn_214_4;
        boolean stackIn_214_5;
        int stackIn_214_6;
        int stackIn_214_7;
        boolean stackIn_214_8;
        BattleCharacter stackIn_215_2 = null;
        BattleCharacter stackIn_215_3 = null;
        int stackIn_215_9 = 0;
        BattleCharacter[] stackIn_227_0 = null;
        int stackIn_227_1 = 0;
        int stackIn_235_1 = 0;
        RuntimeException stackIn_271_0 = null;
        StringBuilder stackIn_271_1 = null;
        String stackIn_272_2 = null;
        RuntimeException decompiledCaughtException = null;
        CombatEvent var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        Unit var6 = null;
        String var6_ref = null;
        Unit var7 = null;
        int var8 = 0;
        String var8_ref_String = null;
        int var9 = 0;
        int var10 = 0;
        BattleCharacter[] stackIn_227_0Lifetime1;
        int stackIn_227_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameRemainder3 = true;
          if (1 == event.eventKind) {
            var3 = (CombatEvent) (event);
            var4 = this.battlefield.mapWidth * var3.attackerY + var3.attackerX;
            var5 = var3.targetDeltaX + (var4 + var3.targetDeltaY * this.battlefield.mapWidth);
            stackIn_8_1 = !(var3.targetDeltaY * var3.targetDeltaY + var3.targetDeltaX * var3.targetDeltaX <= 1);
            this.field_d = stackIn_8_1;
            if (var4 >= 0 &&
              var4 < this.battlefield.tiles.length &&
              var5 >= 0 &&
              var5 < this.battlefield.tiles.length) {
              var6 = this.battlefield.tiles[var4].occupant;
              var7 = this.battlefield.tiles[var5].occupant;
              if (var6 != null &&
                var7 != null) {
                this.presenter.tileIndex = var4;
                this.b((byte) 54, this.battlefield.mapTheme);
                this.field_g = -1;
                this.field_e = -1;
                var8 = var6.bonusStrength + var6.strength;
                var9 = var6.maximumStrength + var6.bonusStrength;
                this.field_e = var6.ownerPlayer;
                this.field_J = bw.unitDefinitions[var6.unitType][9];
                if (0 < vu.field_N[this.field_J] * var8 % var9) {
                  stackIn_37_1 = 1;
                } else {
                  stackIn_37_1 = 0;
                }
                this.field_y = stackIn_37_1 + var8 * vu.field_N[this.field_J] / var9;
                stackIn_40_1 = this.field_y - vu.field_N[this.field_J] * (var8 - var3.defenderDamage) / var9;
                if ((-var3.defenderDamage + var8) * vu.field_N[this.field_J] % var9 > 0) {
                  stackIn_41_2 = 1;
                } else {
                  stackIn_41_2 = 0;
                }
                this.field_v = stackIn_40_1 - stackIn_41_2;
                if (var6.statusEffectType == 7 ||
                  var6.statusEffectType == 8) {
                  this.field_v = 0;
                }
                this.field_c = var6.unitType;
                if (this.field_v > this.field_y) {
                  this.field_v = this.field_y;
                }
                stackIn_57_1 = (var6.getUnitCategory(0) == 3) || (var7.unitType == 7);
                this.field_E = stackIn_57_1;
                var8Lifetime1 = var7.strength + var7.bonusStrength;
                var9Lifetime1 = var7.bonusStrength + var7.maximumStrength;
                if (var7.unitType == 34 &&
                  var7.packedFlag8) {
                  this.field_q = true;
                }
                this.field_g = var7.ownerPlayer;
                this.field_u = bw.unitDefinitions[var7.unitType][9];
                if (vu.field_N[this.field_u] * var8Lifetime1 % var9Lifetime1 <= 0) {
                  stackIn_67_1 = 0;
                } else {
                  stackIn_67_1 = 1;
                }
                this.field_w = stackIn_67_1 + var8Lifetime1 * vu.field_N[this.field_u] / var9Lifetime1;
                if (0 >= (var8Lifetime1 - var3.attackerDamage) * vu.field_N[this.field_u] % var9Lifetime1) {
                  stackIn_71_1 = 0;
                } else {
                  stackIn_71_1 = 1;
                }
                this.field_O = -stackIn_71_1 - ((var8Lifetime1 - var3.attackerDamage) * vu.field_N[this.field_u] / var9Lifetime1 - this.field_w);
                if (var7.statusEffectType == 7 ||
                  var7.statusEffectType == 8) {
                  this.field_O = 0;
                }
                if (this.field_w < this.field_O) {
                  this.field_O = this.field_w;
                }
                this.field_a = var7.unitType;
                stackIn_87_1 = (var7.getUnitCategory(0) == 3) || (7 == var7.unitType);
                boolean decompiledFrameRemainder2 = true;
                this.field_P = stackIn_87_1;
                if (!this.field_d) {
                  if (var3.defenderDies) {
                    this.field_L = 2;
                    if (var10 != 0) {
                      if (var3.attackerDies) {
                        this.field_L = 3;
                        this.field_L = 4;
                      } else {
                        this.field_L = 4;
                      }
                    }
                  } else {
                    if (var3.attackerDies) {
                      this.field_L = 3;
                      if (var10 != 0) {
                        this.field_L = 4;
                      }
                    } else {
                      this.field_L = 4;
                    }
                  }
                  this.phase = 0;
                  decompiledFrameRemainder2 = (var10 != 0);
                }
                if (decompiledFrameRemainder2) {
                  boolean decompiledFrameRemainder1 = true;
                  if (this.field_c == 34) {
                    this.field_z = 2;
                    decompiledFrameRemainder1 = (var10 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    if (var6.getUnitCategory(obfuscationGuard ^ 57) == 3) {
                      this.field_z = 8 + bw.unitDefinitions[var6.unitType][1];
                      decompiledFrameRemainder1 = (var10 != 0);
                    }
                    if (decompiledFrameRemainder1) {
                      if (this.field_c != 81 &&
                        this.field_c != 4 &&
                        this.field_c != 74) {
                        if (this.field_c == 67) {
                          this.field_z = 3;
                          decompiledFrameRemainder1 = (var10 != 0);
                        }
                        if (decompiledFrameRemainder1) {
                          if (this.field_c == 18) {
                            this.field_z = 0;
                            decompiledFrameRemainder1 = (var10 != 0);
                          }
                          if (decompiledFrameRemainder1) {
                            if (this.field_c == 28) {
                              this.field_z = 5;
                              if (var10 != 0 &&
                                this.field_c == 3) {
                                this.field_z = 6;
                                this.field_z = 7;
                              }
                            } else {
                              if (this.field_c == 3) {
                                this.field_z = 6;
                                if (var10 != 0) {
                                  this.field_z = 7;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        this.field_z = 7;
                      }
                    }
                  }
                  this.field_p = this.field_O - (-AttackEvent.a(false, this.field_y, vv.field_b) - this.field_y);
                  this.field_D = new km[this.field_p];
                  this.field_b = this.a(this.field_w, (byte) -128);
                  this.phase = 5;
                  if (!var3.defenderDies) {
                    this.field_L = 8;
                    if (var10 != 0) {
                      this.field_L = 7;
                    }
                  } else {
                    this.field_L = 7;
                  }
                }
                boolean decompiledFrameCompleted7 = true;
                fn.a(this.field_d, this.field_c, obfuscationGuard - 32653);
                fn.a(this.field_d, this.field_a, obfuscationGuard ^ -32619);
                if (this.field_c == 34 &&
                  var3.attackerDeployed) {
                  this.attackers = new BattleCharacter[6];
                  var8Lifetime1 = 0;
                  while (this.field_y > var8Lifetime1) {
                    this.attackers[1 + var8Lifetime1] = new BattleCharacter(this.field_c, true, CampaignUnitOverride.field_d[var8Lifetime1], MoveEvent.field_F[var8Lifetime1], false, 0);
                    var8Lifetime1++;
                    if (var10 != 0) {
                      decompiledFrameCompleted7 = false;
                      break;
                    }
                  }
                  if ((decompiledFrameCompleted7) &&
                    (var10 != 0)) {
                    this.attackers = new BattleCharacter[vu.field_N[this.field_J]];
                  }
                } else {
                  this.attackers = new BattleCharacter[vu.field_N[this.field_J]];
                }
                boolean decompiledFrameCompleted6 = true;
                if (this.field_q) {
                  this.defenders = new BattleCharacter[6];
                  var8Lifetime1 = 0;
                  while (this.field_w > var8Lifetime1) {
                    this.defenders[1 + var8Lifetime1] = new BattleCharacter(this.field_a, false, CampaignUnitOverride.field_d[var8Lifetime1], MoveEvent.field_F[var8Lifetime1], false, 0);
                    var8Lifetime1++;
                    if (var10 != 0) {
                      decompiledFrameCompleted6 = false;
                      break;
                    }
                  }
                  if ((decompiledFrameCompleted6) &&
                    (var10 != 0)) {
                    this.defenders = new BattleCharacter[vu.field_N[this.field_u]];
                  }
                } else {
                  this.defenders = new BattleCharacter[vu.field_N[this.field_u]];
                }
                if (this.field_c == 34 &&
                  var3.attackerDeployed) {
                  this.field_h = true;
                  this.field_y = 1;
                  this.field_c = 75;
                  this.field_J = 2;
                }
                if (this.field_q) {
                  this.field_a = 75;
                  this.field_w = 1;
                  if (var7.bonusStrength + var7.strength > var3.attackerDamage) {
                    stackIn_192_1 = 0;
                  } else {
                    stackIn_192_1 = 1;
                  }
                  this.field_O = stackIn_192_1;
                  this.field_u = 2;
                  if (this.field_O == 1) {
                    this.field_L = 2;
                  }
                }
                boolean decompiledFrameCompleted3 = true;
                boolean decompiledFrameCompleted0 = true;
                boolean decompiledFrameRemainder0 = true;
                boolean decompiledFrameCompleted2 = true;
                boolean decompiledFrameCompleted1 = true;
                boolean decompiledFrameRemainder4 = true;
                boolean decompiledFrameCompleted4 = true;
                boolean decompiledFrameCompleted5 = true;
                if (this.field_f) {
                  var8Lifetime1 = 0;
                  while (this.field_y > var8Lifetime1) {
                    stackIn_227_0 = this.attackers;
                    stackIn_227_1 = var8Lifetime1;
                    if (var10 != 0) {
                      decompiledFrameCompleted5 = false;
                      break;
                    }
                    stackIn_204_2 = null;
                    stackIn_204_3 = null;
                    stackIn_204_4 = this.field_c;
                    stackIn_204_5 = true;
                    stackIn_204_6 = tn.field_W[this.field_J][var8Lifetime1];
                    stackIn_204_7 = kw.field_P[this.field_J][var8Lifetime1];
                    stackIn_204_8 = this.field_d;
                    if (this.field_d) {
                      stackIn_205_2 = null;
                      stackIn_205_3 = null;
                      stackIn_205_9 = 0;
                    } else {
                      stackIn_205_2 = null;
                      stackIn_205_3 = null;
                      stackIn_205_9 = 1300 + AttackEvent.a(false, 700, vv.field_b);
                    }
                    stackIn_227_0[stackIn_227_1] = new BattleCharacter(stackIn_204_4, stackIn_204_5, stackIn_204_6, stackIn_204_7, stackIn_204_8, stackIn_205_9);
                    var8Lifetime1++;
                  }
                  if (decompiledFrameCompleted5) {
                    decompiledFrameRemainder4 = (var10 != 0);
                  }
                }
                if ((decompiledFrameRemainder4) &&
                  (decompiledFrameCompleted5)) {
                  var8Lifetime1 = 0;
                  boolean decompiledNaturalLoopExit0 = false;
                  while (!(decompiledNaturalLoopExit0 = (this.field_y <= var8Lifetime1))) {
                    stackIn_227_0 = this.attackers;
                    stackIn_227_1 = var8Lifetime1;
                    if (var10 != 0) {
                      break;
                    }
                    stackIn_214_2 = null;
                    stackIn_214_3 = null;
                    stackIn_214_4 = this.field_c;
                    stackIn_214_5 = true;
                    stackIn_214_6 = tn.field_W[this.field_J][var8Lifetime1];
                    stackIn_214_7 = kw.field_P[this.field_J][var8Lifetime1];
                    stackIn_214_8 = this.field_d;
                    if (!this.field_d) {
                      stackIn_215_2 = null;
                      stackIn_215_3 = null;
                      stackIn_215_9 = 1300 + AttackEvent.a(false, 700, vv.field_b);
                    } else {
                      stackIn_215_2 = null;
                      stackIn_215_3 = null;
                      stackIn_215_9 = 0;
                    }
                    stackIn_227_0[stackIn_227_1] = new BattleCharacter(stackIn_214_4, stackIn_214_5, stackIn_214_6, stackIn_214_7, stackIn_214_8, stackIn_215_9);
                    var8Lifetime1++;
                  }
                  if (decompiledNaturalLoopExit0) {
                    decompiledFrameCompleted4 = false;
                  }
                }
                if ((decompiledFrameRemainder4) &&
                  (decompiledFrameCompleted4)) {
                  while (true) {
                    stackIn_227_0[stackIn_227_1] = new BattleCharacter(this.field_a, false, tn.field_W[this.field_u][var8Lifetime1], kw.field_P[this.field_u][var8Lifetime1], this.field_d, 0);
                    var8Lifetime1++;
                    if (var10 != 0) {
                      decompiledFrameCompleted3 = false;
                      break;
                    }
                    if (var8Lifetime1 >= this.field_w) {
                      decompiledFrameCompleted2 = false;
                      break;
                    }
                    stackIn_227_0 = this.defenders;
                    stackIn_227_1 = var8Lifetime1;
                  }
                }
                if ((decompiledFrameCompleted3) &&
                  (decompiledFrameCompleted2)) {
                  if (!this.field_o) {
                    var8Lifetime1 = 0;
                    while (var8Lifetime1 < this.field_w) {
                      this.defenders[var8Lifetime1] = new BattleCharacter(this.field_a, false, tn.field_W[this.field_u][var8Lifetime1], kw.field_P[this.field_u][var8Lifetime1], this.field_d, 0);
                      var8Lifetime1++;
                      if (var10 != 0) {
                        decompiledFrameCompleted1 = false;
                        break;
                      }
                    }
                    if (decompiledFrameCompleted1) {
                      decompiledFrameRemainder0 = (var10 != 0);
                    }
                  }
                  if ((decompiledFrameRemainder0) &&
                    (decompiledFrameCompleted1)) {
                    var8Lifetime1 = 0;
                    while (var8Lifetime1 < this.field_w) {
                      stackIn_227_0Lifetime1 = this.defenders;
                      stackIn_227_1Lifetime1 = var8Lifetime1;
                      stackIn_227_0Lifetime1[stackIn_227_1Lifetime1] = new BattleCharacter(this.field_a, false, tn.field_W[this.field_u][var8Lifetime1], kw.field_P[this.field_u][var8Lifetime1], this.field_d, 0);
                      var8Lifetime1++;
                      if (var10 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                    }
                  }
                }
                if ((decompiledFrameCompleted3) &&
                  (decompiledFrameCompleted0)) {
                  if (this.field_J > this.field_u) {
                    stackIn_235_1 = this.field_J;
                  } else {
                    stackIn_235_1 = this.field_u;
                  }
                  this.field_C = stackIn_235_1;
                }
                if (0 == this.field_v &&
                  0 == this.field_O &&
                  !this.field_d) {
                  this.field_m = true;
                }
                if (this.field_d &&
                  this.field_f) {
                  this.phase = 6;
                  this.h(obfuscationGuard ^ 56);
                }
                boolean decompiledSharedTail0 = (this.field_d &&
                  this.field_L == 8);
                if (!decompiledSharedTail0) {
                  this.field_t = this.battlefield.mapWidth * var3.attackerY + var3.attackerX;
                  decompiledSharedTail0 = (var10 != 0);
                }
                if (decompiledSharedTail0) {
                  this.field_t = var3.targetDeltaX + var3.attackerX + this.battlefield.mapWidth * (var3.targetDeltaY + var3.attackerY);
                }
                u.field_p.b(var3.attackerY * this.battlefield.mapWidth + var3.attackerX, obfuscationGuard ^ 65);
                decompiledFrameRemainder3 = false;
              }
              else {
                if (null == var6 ||
                  var7 == null) {
                  var8_ref_String = db.field_d + ": Can see attacker or defender";
                  this.battlefield.a(0, var8_ref_String, var3);
                }
                this.phase = 8;
                return false;
              }
            }
            if (decompiledFrameRemainder3) {
              var6_ref = db.field_d + ": Attacker or defender off map";
              this.battlefield.a(0, var6_ref, var3);
              this.phase = 8;
              return false;
            }
          }
          if (obfuscationGuard != 57) {
            this.initialize((GameEvent) null, (byte) -19);
          }
          this.advanceFrame(event, (byte) 32);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_271_0 = var3_ref;
          stackIn_271_1 = new StringBuilder().append("sk.E(");
          if (event == null) {
            stackIn_272_2 = "null";
          } else {
            stackIn_272_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_271_0), ((StringBuilder) (Object) stackIn_271_1).append(stackIn_272_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void requestFinish(int obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.phase != 8) {
            this.phaseFrame = 0;
          }
          this.phase = 8;
          if (obfuscationGuard < 94) {
            this.m(96);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.D(" + obfuscationGuard + ')');
        }
    }

    public final void advanceFrame(GameEvent event, byte obfuscationGuard) {
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.e(2);
          if (u.field_p != null) {
            u.field_p.c(1959107777);
          }
          boolean decompiledFrameRemainder0 = true;
          this.phaseFrame = this.phaseFrame + 1;
          if (this.phase == 0) {
            this.o(-124);
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (8 == this.phase) {
              this.d((byte) 126);
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (this.phase != 1) {
                if (this.phase != 2 &&
                  this.phase != 3 &&
                  this.phase != 4) {
                  if (this.phase != 5) {
                    if (6 == this.phase) {
                      if (this.a(true)) {
                        return;
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (7 == this.phase) {
                        this.d(29823);
                        if (var4 != 0) {
                          this.c(false);
                          this.j(-8089);
                        }
                      }
                    }
                  } else {
                    this.c(false);
                    if (var4 != 0) {
                      this.j(-8089);
                    }
                  }
                } else {
                  this.j(-8089);
                }
              } else {
                if (this.g(-9)) {
                  return;
                }
              }
            }
          }
          var3_int = -77 % ((obfuscationGuard + 26) / 48);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_56_0 = var3;
          stackIn_56_1 = new StringBuilder().append("sk.Q(");
          if (event == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void h(int param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != 1) {
            this.isFinished(-67);
          }
          var2_int = 0;
          while (var2_int < this.field_D.length) {
            if (var3 != 0) {
              return;
            }
            if (var2_int < this.field_O) {
              this.field_D[var2_int] = new km(this.defenders[this.field_b[var2_int]].destinationX, 600 - pk.field_T[this.field_a][0], this.defenders[this.field_b[var2_int]].destinationY, 200 + AttackEvent.a(false, 600, vv.field_b), this.field_z);
            } else {
              this.field_D[var2_int] = new km(100 + AttackEvent.a(false, 600, vv.field_b), 600, AttackEvent.a(false, 850, vv.field_b) + 900, AttackEvent.a(false, 600, vv.field_b) + 200, this.field_z);
            }
            var2_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.JA(" + param0 + ')');
        }
    }

    public final void drawOverlayLayer(byte obfuscationGuard) {
        try {
          if (obfuscationGuard != -52) {
            this.a(61, (Unit) null, 33, true, (Unit) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "sk.O(" + obfuscationGuard + ')');
        }
    }

    private final void j(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.phase == 2) {
            this.a(this.attackers, -4925);
          }
          if (this.phase == 3 ||
            4 == this.phase) {
            this.a(this.defenders, -4925);
          }
          this.b(this.attackers, 12579);
          this.b(this.defenders, 12579);
          if (this.phaseFrame > 240) {
            this.phaseFrame = 0;
            this.phase = 8;
          }
          if (param0 != -8089) {
            this.d(111);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.BA(" + param0 + ')');
        }
    }

    private final boolean g(int param0) {
        BattleCharacter stackIn_80_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.b(true);
          var2_int = 1;
          var3 = 0;
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var3 < this.attackers.length) {
              stackIn_80_0 = this.attackers[var3];
              if (var4 == 0) {
                if (stackIn_80_0 != null) {
                  this.attackers[var3].d((byte) 113);
                  if (this.field_E &&
                    this.attackers[var3].field_e) {
                    this.attackers[var3].a(0, 30, 0, -10, u.field_o[this.field_c][1], pk.field_T[this.field_c][1], (byte) 122);
                    this.attackers[var3].field_e = false;
                  }
                  if (this.attackers[var3].field_d) {
                    if (!this.attackers[var3].field_H) {
                      var2_int = 0;
                    } else {
                      this.attackers[var3] = null;
                    }
                  }
                }
                var3++;
                continue;
              }
            } else {
              var3 = 0;
              while (true) {
                if (this.defenders.length > var3) {
                  if (var4 == 0) {
                    if (null != this.defenders[var3]) {
                      this.defenders[var3].d((byte) 113);
                      if (this.field_P &&
                        this.defenders[var3].field_e) {
                        this.defenders[var3].a(0, 30, 0, 10, u.field_o[this.field_a][1], pk.field_T[this.field_a][1], (byte) 122);
                        this.defenders[var3].field_e = false;
                      }
                      if (this.defenders[var3].field_d) {
                        if (!this.defenders[var3].field_H) {
                          var2_int = 0;
                        } else {
                          this.defenders[var3] = null;
                        }
                      }
                    }
                    var3++;
                    continue;
                  }
                } else {
                  if (var2_int != 0 &&
                    this.field_v == 0 &&
                    this.field_O == 0 && (!this.field_m ||
                    500 < this.phaseFrame)) {
                    this.phaseFrame = 0;
                    this.phase = this.field_L;
                    return true;
                  }
                }
                break;
              }
              decompiledFrameRemainder0 = (this.field_q);
              if (decompiledFrameRemainder0) {
                this.m(-13146);
                this.e((byte) 105);
                if (0 != this.field_v) {
                  break scanLoop1;
                }
                if (this.field_O <= 0) {
                  break scanLoop1;
                }
                if (var2_int == 0) {
                  break scanLoop1;
                }
                if (this.phaseFrame <= 400) {
                  break scanLoop1;
                }
                this.field_O = this.field_O - 1;
                this.defenders[0].field_d = true;
                stackIn_80_0 = this.defenders[0];
              }
            }
            if (decompiledFrameRemainder0) {
              ((BattleCharacter) (Object) stackIn_80_0).setAnimationState(2, (byte) -101);
              if (var4 == 0) {
                break scanLoop1;
              }
            }
            if (this.phaseFrame % 50 == 0) {
              this.l(param0 + 58);
            }
            this.k(13047);
            break;
          }
          if (param0 != -9) {
            this.initialize((GameEvent) null, (byte) 69);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.DA(" + param0 + ')');
        }
    }

    private final void f(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        BattleCharacter stackIn_25_0 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.field_p == 0) {
            return;
          }
          var2_int = 0;
          var3 = new int[this.field_y];
          if (param0 != -24577) {
            this.defenders = (BattleCharacter[]) null;
          }
          var4 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 >= this.field_y))) {
            stackIn_25_0 = this.attackers[var4];
            if (var5 == 0) {
              if (stackIn_25_0 != null &&
                this.attackers[var4].isIdle((byte) 115)) {
                var3[var2_int] = var4;
                var2_int++;
              }
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            if (1 > var2_int) {
              return;
            }
            this.field_p = this.field_p - 1;
            var4 = var3[AttackEvent.a(false, var2_int, vv.field_b)];
            stackIn_25_0 = this.attackers[var4];
          }
          ((BattleCharacter) (Object) stackIn_25_0).c((byte) 102);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "sk.P(" + param0 + ')');
        }
    }

    private final void d(boolean param0) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        Object stackIn_124_0 = null;
        BattleCharacter stackIn_124_1 = null;
        int stackIn_140_0 = 0;
        int stackIn_140_1 = 0;
        BattleCharacter stackIn_171_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_124_0Lifetime1;
        BattleCharacter stackIn_124_1Lifetime1;
        BattleCharacter stackIn_171_0Lifetime1;
        int stackIn_32_0Lifetime1;
        int stackIn_32_1Lifetime1;
        int stackIn_50_0Lifetime1;
        int stackIn_50_1Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2 = new int[this.attackers.length];
          var3 = new int[this.defenders.length];
          var4 = 0;
          var5 = 0;
          scanLoop1: while (true) {
            regionExit2: {
              boolean decompiledFrameCompleted0 = true;
              if (this.attackers.length > var5) {
                stackIn_124_0 = null;
                stackIn_124_1 = this.attackers[var5];
                if (var7 != 0) {
                  while (true) {
                    if (stackIn_124_0 != stackIn_124_1) {
                      this.defenders[var3[var5]].a(this.field_C, -92, false);
                    }
                    var5++;
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  if (stackIn_124_0 != stackIn_124_1) {
                    var2[var4++] = var5;
                  }
                  var5++;
                  if (var7 == 0) {
                    continue;
                  }
                }
              }
              if (decompiledFrameCompleted0) {
                this.field_y = var4;
                var4 = 0;
                var5 = 0;
                scanLoop3: while (true) {
                  if (this.defenders.length > var5) {
                    stackIn_171_0 = this.defenders[var5];
                    if (var7 == 0) {
                      if (stackIn_171_0 != null) {
                        var3[var4++] = var5;
                      }
                      var5++;
                      continue;
                    }
                  } else {
                    this.field_w = var4;
                    var5 = 0;
                    scanLoop4: while (true) {
                      if (this.field_y > var5) {
                        var4 = var5;
                        stackIn_36_0 = 1 + var5;
                        if (var7 != 0) {
                          break scanLoop4;
                        }
                        var6 = stackIn_36_0;
                        while (var6 < this.field_y) {
                          stackIn_32_0 = this.attackers[var2[var6]].destinationY;
                          stackIn_32_1 = this.attackers[var2[var4]].destinationY;
                          if (stackIn_32_0 > stackIn_32_1) {
                            var4 = var6;
                          }
                          var6++;
                        }
                        stackIn_32_0Lifetime1 = var4;
                        stackIn_32_1Lifetime1 = var5;
                        if (stackIn_32_0Lifetime1 != stackIn_32_1Lifetime1) {
                          var6 = var2[var4];
                          var2[var4] = var2[var5];
                          var2[var5] = var6;
                        }
                        var5++;
                        continue scanLoop4;
                      }
                      var5 = 0;
                      stackIn_36_0 = param0 ? 1 : 0;
                      break;
                    }
                    if (stackIn_36_0 != 1) {
                      return;
                    }
                    scanLoop5: while (true) {
                      if (this.field_w > var5) {
                        var4 = var5;
                        stackIn_55_0 = var5 + 1;
                        if (var7 != 0) {
                          break scanLoop5;
                        }
                        var6Lifetime2 = stackIn_55_0;
                        while (this.field_w > var6Lifetime2) {
                          stackIn_50_0 = ~this.defenders[var3[var4]].destinationY;
                          stackIn_50_1 = ~this.defenders[var3[var6Lifetime2]].destinationY;
                          if (stackIn_50_0 > stackIn_50_1) {
                            var4 = var6Lifetime2;
                          }
                          var6Lifetime2++;
                        }
                        stackIn_50_0Lifetime1 = var5;
                        stackIn_50_1Lifetime1 = var4;
                        if (stackIn_50_0Lifetime1 != stackIn_50_1Lifetime1) {
                          var6Lifetime2 = var3[var4];
                          var3[var4] = var3[var5];
                          var3[var5] = var6Lifetime2;
                        }
                        var5++;
                        continue scanLoop5;
                      }
                      stackIn_55_0 = cu.field_a ? 1 : 0;
                      break;
                    }
                    if (stackIn_55_0 != 0) {
                      boolean decompiledFrameRemainder0 = true;
                      if (!this.field_f) {
                        if (!this.field_o) {
                          var5 = 0;
                          var6Lifetime3 = 0;
                          scanLoop6: while (true) {
                            boolean decompiledFrameRemainder2 = true;
                            if (this.field_y <= var5) {
                              stackIn_70_0 = var6Lifetime3;
                              stackIn_70_1 = this.field_w;
                              decompiledFrameRemainder2 = (var7 == 0);
                              if ((decompiledFrameRemainder2) &&
                                (stackIn_70_0 >= stackIn_70_1)) {
                                break scanLoop6;
                              }
                            }
                            if (decompiledFrameRemainder2) {
                              stackIn_70_0 = ~var6Lifetime3;
                              stackIn_70_1 = ~this.field_w;
                            }
                            if (stackIn_70_0 > stackIn_70_1 &&
                              this.defenders[var3[var6Lifetime3]] == null) {
                              var6Lifetime3++;
                            }
                            if (var5 < this.field_y &&
                              null == this.attackers[var2[var5]]) {
                              var5++;
                            }
                            if (this.field_w <= var6Lifetime3) {
                              incrementValue$2 = var5;
                              var5++;
                              this.attackers[var2[incrementValue$2]].a(this.field_C, -91, true);
                              if (var7 == 0) {
                                continue;
                              }
                            }
                            if (this.field_y > var5) {
                              if (this.attackers[var2[var5]].destinationY <= this.defenders[var3[var6Lifetime3]].destinationY) {
                                incrementValue$3 = var6Lifetime3;
                                var6Lifetime3++;
                                this.defenders[var3[incrementValue$3]].a(this.field_C, -38, true);
                                if (var7 == 0) {
                                  continue;
                                }
                              }
                              incrementValue$4 = var5;
                              var5++;
                              this.attackers[var2[incrementValue$4]].a(this.field_C, -106, true);
                              if (var7 == 0) {
                                continue;
                              }
                            }
                            incrementValue$5 = var6Lifetime3;
                            var6Lifetime3++;
                            this.defenders[var3[incrementValue$5]].a(this.field_C, -64, true);
                            if (var7 == 0) {
                              continue;
                            }
                            break;
                          }
                          decompiledFrameRemainder0 = (var7 != 0);
                        }
                        if (decompiledFrameRemainder0) {
                          var5 = 0;
                          while (this.field_y > var5) {
                            stackIn_171_0 = this.attackers[var2[var5]];
                            if (var7 != 0) {
                              break scanLoop3;
                            }
                            if (stackIn_171_0 != null) {
                              this.attackers[var2[var5]].a(this.field_C, -86, true);
                            }
                            var5++;
                          }
                          decompiledFrameRemainder0 = (var7 != 0);
                        }
                      }
                      if (decompiledFrameRemainder0) {
                        var5 = 0;
                        while (var5 < this.field_w) {
                          stackIn_171_0 = this.defenders[var3[var5]];
                          if (var7 != 0) {
                            break scanLoop3;
                          }
                          if (stackIn_171_0 != null) {
                            this.defenders[var3[var5]].a(this.field_C, -46, true);
                          }
                          var5++;
                        }
                      }
                      this.a((byte) 114, 0, 0, 128);
                    }
                    if (!this.field_f) {
                      break scanLoop1;
                    }
                    var5 = 0;
                    while (this.field_w > var5) {
                      if (var7 != 0) {
                        return;
                      }
                      stackIn_124_0Lifetime1 = null;
                      stackIn_124_1Lifetime1 = this.defenders[var3[var5]];
                      if (stackIn_124_0Lifetime1 != stackIn_124_1Lifetime1) {
                        this.defenders[var3[var5]].a(this.field_C, -92, false);
                      }
                      var5++;
                    }
                    break regionExit2;
                  }
                  break;
                }
                while (true) {
                  if (stackIn_171_0 != null) {
                    this.attackers[var2[var5]].a(this.field_C, -65, false);
                  }
                  var5++;
                  if (var7 != 0) {
                    return;
                  }
                  if (var5 >= this.field_y) {
                    return;
                  }
                  stackIn_171_0 = this.attackers[var2[var5]];
                }
              }
            }
            if (var7 == 0) {
              return;
            }
            break;
          }
          if (!this.field_o) {
            var5Lifetime1 = 0;
            var6Lifetime1 = 0;
            scanLoop7: while (true) {
              boolean decompiledFrameRemainder1 = true;
              if (var5Lifetime1 >= this.field_y) {
                stackIn_140_0 = var6Lifetime1;
                stackIn_140_1 = this.field_w;
                decompiledFrameRemainder1 = (var7 == 0);
                if ((decompiledFrameRemainder1) &&
                  (stackIn_140_0 >= stackIn_140_1)) {
                  break scanLoop7;
                }
              }
              if (decompiledFrameRemainder1) {
                stackIn_140_0 = ~var5Lifetime1;
                stackIn_140_1 = ~this.field_y;
              }
              if (stackIn_140_0 > stackIn_140_1 &&
                this.attackers[var2[var5Lifetime1]] == null) {
                var5Lifetime1++;
              }
              if (this.field_w > var6Lifetime1 &&
                this.defenders[var3[var6Lifetime1]] == null) {
                var6Lifetime1++;
              }
              if (this.field_w > var6Lifetime1) {
                if (var5Lifetime1 >= this.field_y) {
                  incrementValue$6 = var6Lifetime1;
                  var6Lifetime1++;
                  this.defenders[var3[incrementValue$6]].a(this.field_C, -74, false);
                  if (var7 == 0) {
                    continue;
                  }
                }
                if (this.attackers[var2[var5Lifetime1]].destinationY <= this.defenders[var3[var6Lifetime1]].destinationY) {
                  incrementValue$7 = var6Lifetime1;
                  var6Lifetime1++;
                  this.defenders[var3[incrementValue$7]].a(this.field_C, -120, false);
                  if (var7 == 0) {
                    continue;
                  }
                }
                incrementValue$8 = var5Lifetime1;
                var5Lifetime1++;
                this.attackers[var2[incrementValue$8]].a(this.field_C, -65, false);
                if (var7 == 0) {
                  continue;
                }
              }
              incrementValue$9 = var5Lifetime1;
              var5Lifetime1++;
              this.attackers[var2[incrementValue$9]].a(this.field_C, -52, false);
              if (var7 == 0) {
                continue;
              }
              break;
            }
            if (var7 == 0) {
              return;
            }
          }
          var5Lifetime2 = 0;
          while (var5Lifetime2 < this.field_y) {
            if (var7 != 0) {
              return;
            }
            stackIn_171_0Lifetime1 = this.attackers[var2[var5Lifetime2]];
            if (stackIn_171_0Lifetime1 != null) {
              this.attackers[var2[var5Lifetime2]].a(this.field_C, -65, false);
            }
            var5Lifetime2++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "sk.S(" + param0 + ')');
        }
    }

    private final boolean a(boolean param0) {
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = param0 ? 1 : 0;
          var3 = 0;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var3 >= this.defenders.length))) {
            if (var4 == 0) {
              if (null != this.defenders[var3]) {
                this.defenders[var3].d((byte) 113);
                if (this.defenders[var3].field_d) {
                  if (this.defenders[var3].field_H) {
                    this.defenders[var3] = null;
                  } else {
                    var2_int = 0;
                  }
                }
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            var3 = 0;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.field_D.length <= var3))) {
            stackIn_36_0 = ~this.field_D[var3].field_f;
            if (var4 == 0) {
              if (stackIn_36_0 < 0) {
                var2_int = 0;
              }
              if (this.field_D[var3].b(-103) &&
                this.field_O > var3) {
                this.defenders[this.field_b[var3]].field_d = true;
                this.defenders[this.field_b[var3]].setAnimationState(2, (byte) -103);
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_36_0 = var2_int;
          }
          if (stackIn_36_0 == 0) {
            return false;
          }
          this.phaseFrame = 0;
          this.phase = this.field_L;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.L(" + param0 + ')');
        }
    }

    private final void f(byte param0) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$2 = 0;
        BattleCharacter[] stackIn_19_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackIn_134_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_178_0 = 0;
        int stackIn_178_1 = 0;
        int stackIn_201_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_209_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        BattleCharacter[] stackIn_19_0Lifetime1;
        int incrementValue$2Lifetime1;
        int stackIn_51_0Lifetime1;
        int stackIn_51_1Lifetime1;
        int stackIn_68_0Lifetime1;
        int stackIn_68_1Lifetime1;
        int stackIn_84_0Lifetime1;
        int stackIn_84_1Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.field_D != null &&
            0 != this.field_D.length) {
            var2 = new int[this.attackers.length];
            var3 = new int[this.defenders.length];
            var4 = new int[this.field_D.length];
            var5 = 0;
            var6 = 0;
            scanLoop1: while (true) {
              boolean decompiledFrameCompleted1 = true;
              boolean decompiledFrameCompleted0 = true;
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameCompleted2 = true;
              boolean decompiledFrameRemainder2 = true;
              if (this.attackers.length > var6) {
                stackIn_19_0 = this.attackers;
                if (var12 != 0) {
                  if (stackIn_19_0.length > var6) {
                    stackIn_35_0 = null;
                    decompiledFrameRemainder2 = false;
                  }
                  decompiledFrameRemainder3 = !(decompiledFrameRemainder2);
                }
                if ((decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2)) {
                  if (stackIn_19_0[var6] != null) {
                    var2[var5++] = var6;
                  }
                  var6++;
                  continue;
                }
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2)) {
                var5 = 0;
                var6 = 0;
                while (true) {
                  stackIn_19_0Lifetime1 = this.defenders;
                  if (stackIn_19_0Lifetime1.length <= var6) {
                    decompiledFrameCompleted2 = false;
                    break;
                  }
                  stackIn_35_0 = null;
                  if (var12 != 0) {
                    break;
                  }
                  if (stackIn_35_0 != this.defenders[var6]) {
                    var3[var5++] = var6;
                  }
                  var6++;
                }
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameCompleted2)) {
                while (true) {
                  if (stackIn_35_0 != this.field_D[var6]) {
                    incrementValue$2 = var5;
                    var5++;
                    var4[incrementValue$2] = var6;
                  }
                  var6++;
                  if (var12 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (var6 >= this.field_D.length) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  stackIn_35_0 = null;
                }
              }
              if ((decompiledFrameCompleted1) &&
                (decompiledFrameCompleted0)) {
                var5 = 0;
                var6 = 0;
                while (var6 < this.field_D.length) {
                  if (var12 != 0) {
                    break scanLoop1;
                  }
                  stackIn_35_0 = null;
                  if (stackIn_35_0 != this.field_D[var6]) {
                    incrementValue$2Lifetime1 = var5;
                    var5++;
                    var4[incrementValue$2Lifetime1] = var6;
                  }
                  var6++;
                }
              }
              var6 = 0;
              break;
            }
            scanLoop2: while (true) {
              if (this.field_y > var6) {
                var5Lifetime1 = var6;
                stackIn_55_0 = 1 + var6;
                if (var12 != 0) {
                  break scanLoop2;
                }
                var7 = stackIn_55_0;
                while (var7 < this.field_y) {
                  stackIn_51_0 = ~this.attackers[var2[var7]].destinationY;
                  stackIn_51_1 = ~this.attackers[var2[var5Lifetime1]].destinationY;
                  if (stackIn_51_0 < stackIn_51_1) {
                    var5Lifetime1 = var7;
                  }
                  var7++;
                }
                stackIn_51_0Lifetime1 = ~var6;
                stackIn_51_1Lifetime1 = ~var5Lifetime1;
                if (stackIn_51_0Lifetime1 != stackIn_51_1Lifetime1) {
                  var7 = var2[var5Lifetime1];
                  var2[var5Lifetime1] = var2[var6];
                  var2[var6] = var7;
                }
                var6++;
                continue scanLoop2;
              }
              stackIn_55_0 = 0;
              break;
            }
            var6 = stackIn_55_0;
            scanLoop3: while (true) {
              if (this.field_w > var6) {
                var5Lifetime2 = var6;
                stackIn_72_0 = 1 + var6;
                if (var12 != 0) {
                  break scanLoop3;
                }
                var7 = stackIn_72_0;
                while (var7 < this.field_w) {
                  stackIn_68_0 = ~this.defenders[var3[var7]].destinationY;
                  stackIn_68_1 = ~this.defenders[var3[var5Lifetime2]].destinationY;
                  if (stackIn_68_0 < stackIn_68_1) {
                    var5Lifetime2 = var7;
                  }
                  var7++;
                }
                stackIn_68_0Lifetime1 = ~var6;
                stackIn_68_1Lifetime1 = ~var5Lifetime2;
                if (stackIn_68_0Lifetime1 != stackIn_68_1Lifetime1) {
                  var7 = var3[var5Lifetime2];
                  var3[var5Lifetime2] = var3[var6];
                  var3[var6] = var7;
                }
                var6++;
                continue scanLoop3;
              }
              stackIn_72_0 = 0;
              break;
            }
            var6 = stackIn_72_0;
            scanLoop4: while (true) {
              if (this.field_p > var6) {
                var5Lifetime3 = var6;
                stackIn_89_0 = 1 + var6;
                if (var12 != 0) {
                  break scanLoop4;
                }
                var7 = stackIn_89_0;
                while (var7 < this.field_p) {
                  stackIn_84_0 = this.field_D[var4[var5Lifetime3]].field_d;
                  stackIn_84_1 = this.field_D[var4[var7]].field_d;
                  if (stackIn_84_0 < stackIn_84_1) {
                    var5Lifetime3 = var7;
                  }
                  var7++;
                }
                stackIn_84_0Lifetime1 = ~var5Lifetime3;
                stackIn_84_1Lifetime1 = ~var6;
                if (stackIn_84_0Lifetime1 != stackIn_84_1Lifetime1) {
                  var7 = var4[var5Lifetime3];
                  var4[var5Lifetime3] = var4[var6];
                  var4[var6] = var7;
                }
                var6++;
                continue scanLoop4;
              }
              var6 = 0;
              stackIn_89_0 = 0;
              break;
            }
            var7 = stackIn_89_0;
            var8 = 0;
            if (cu.field_a) {
              if (this.field_o) {
                var7 = this.field_w;
              }
              if (this.field_f) {
                var6 = this.field_y;
              }
              scanLoop5: while (true) {
                boolean decompiledFrameRemainder1 = true;
                if (this.field_y <= var6) {
                  stackIn_110_0 = ~this.field_w;
                  stackIn_110_1 = ~var7;
                  decompiledFrameRemainder1 = (var12 == 0);
                  if ((decompiledFrameRemainder1) && (stackIn_110_0 >= stackIn_110_1 &&
                    var8 >= this.field_p)) {
                    break scanLoop5;
                  }
                }
                if (decompiledFrameRemainder1) {
                  stackIn_110_0 = ~var8;
                  stackIn_110_1 = ~this.field_p;
                }
                if (stackIn_110_0 > stackIn_110_1 &&
                  null == this.field_D[var4[var8]]) {
                  var8++;
                }
                if (var6 < this.field_y &&
                  null == this.attackers[var2[var6]]) {
                  var6++;
                }
                if (var7 < this.field_w &&
                  this.defenders[var3[var7]] == null) {
                  var7++;
                }
                if (var8 < this.field_p) {
                  stackIn_134_0 = this.field_D[var4[var8]].field_d;
                } else {
                  stackIn_134_0 = 100000;
                }
                var9 = stackIn_134_0;
                if (this.field_y > var6) {
                  stackIn_138_0 = this.attackers[var2[var6]].destinationY;
                } else {
                  stackIn_138_0 = 100000;
                }
                var10 = stackIn_138_0;
                if (this.field_w <= var7) {
                  stackIn_142_0 = 100000;
                } else {
                  stackIn_142_0 = this.defenders[var3[var7]].destinationY;
                }
                var11 = stackIn_142_0;
                if (var11 > var9 &&
                  var9 < var10) {
                  incrementValue$3 = var8;
                  var8++;
                  this.field_D[var4[incrementValue$3]].a(true, -8, true, this.field_C);
                }
                if (!(var11 > var9) ||
                  !(var9 < var10) || var12 != 0) {
                  boolean decompiledSharedTail0 = !(var11 > var10);
                  if (!decompiledSharedTail0) {
                    incrementValue$4 = var6;
                    var6++;
                    this.attackers[var2[incrementValue$4]].a(this.field_C, param0 ^ 58, true);
                    decompiledSharedTail0 = (var12 != 0);
                  }
                  if (decompiledSharedTail0) {
                    incrementValue$5 = var7;
                    var7++;
                    this.defenders[var3[incrementValue$5]].a(this.field_C, param0 - 97, true);
                  }
                }
                if (var12 == 0) {
                  continue;
                }
                break;
              }
              this.a((byte) 94, 0, 0, 128);
              var6 = 0;
              var8 = 0;
              var7 = 0;
            }
            if (this.field_f) {
              var6 = this.field_y;
            }
            if (param0 != -15) {
              this.b((byte) -125, 8);
            }
            if (this.field_o) {
              var7 = this.field_w;
            }
            do {
              boolean decompiledFrameRemainder0 = true;
              if (var6 >= this.field_y) {
                stackIn_178_0 = ~this.field_w;
                stackIn_178_1 = ~var7;
                decompiledFrameRemainder0 = (var12 == 0);
                if ((decompiledFrameRemainder0) && (stackIn_178_0 >= stackIn_178_1 &&
                  var8 >= this.field_p)) {
                  return;
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_178_0 = ~this.field_p;
                stackIn_178_1 = ~var8;
              }
              if (stackIn_178_0 < stackIn_178_1 &&
                null == this.field_D[var4[var8]]) {
                var8++;
              }
              if (var6 < this.field_y &&
                null == this.attackers[var2[var6]]) {
                var6++;
              }
              if (this.field_w > var7 &&
                this.defenders[var3[var7]] == null) {
                var7++;
              }
              if (this.field_p <= var8) {
                stackIn_201_0 = 100000;
              } else {
                stackIn_201_0 = this.field_D[var4[var8]].field_d;
              }
              var9 = stackIn_201_0;
              if (var6 >= this.field_y) {
                stackIn_205_0 = 100000;
              } else {
                stackIn_205_0 = this.attackers[var2[var6]].destinationY;
              }
              var10 = stackIn_205_0;
              if (var7 >= this.field_w) {
                stackIn_209_0 = 100000;
              } else {
                stackIn_209_0 = this.defenders[var3[var7]].destinationY;
              }
              var11 = stackIn_209_0;
              if (var9 >= var11 ||
                var10 <= var9) {
                if (var10 < var11) {
                  incrementValue$6 = var6;
                  var6++;
                  this.attackers[var2[incrementValue$6]].a(this.field_C, param0 - 93, false);
                  if (var12 != 0) {
                    incrementValue$7 = var7;
                    var7++;
                    this.defenders[var3[incrementValue$7]].a(this.field_C, param0 - 51, false);
                    incrementValue$8 = var8;
                    var8++;
                    this.field_D[var4[incrementValue$8]].a(true, -8, false, this.field_C);
                  }
                } else {
                  incrementValue$7 = var7;
                  var7++;
                  this.defenders[var3[incrementValue$7]].a(this.field_C, param0 - 51, false);
                  if (var12 != 0) {
                    incrementValue$8 = var8;
                    var8++;
                    this.field_D[var4[incrementValue$8]].a(true, -8, false, this.field_C);
                  }
                }
              } else {
                incrementValue$8 = var8;
                var8++;
                this.field_D[var4[incrementValue$8]].a(true, -8, false, this.field_C);
              }
            } while (var12 == 0);
            return;
          }
          this.d(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "sk.AA(" + param0 + ')');
        }
    }

    private final void b(boolean param0) {
        try {
          this.a(this.defenders, 0, this.field_J, this.field_u, this.attackers);
          this.a(this.attackers, 0, this.field_u, this.field_J, this.defenders);
          this.a(this.attackers, this.field_J, this.field_u, this.defenders, param0);
          this.a(this.defenders, this.field_u, this.field_J, this.attackers, param0);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "sk.N(" + param0 + ')');
        }
    }

    private final void k(int param0) {
        Object stackIn_91_0 = null;
        BattleCharacter stackIn_91_1 = null;
        Object stackIn_136_0 = null;
        BattleCharacter stackIn_136_1 = null;
        BattleCharacter stackIn_139_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_91_0Lifetime1;
        BattleCharacter stackIn_91_1Lifetime1;
        BattleCharacter stackIn_139_0Lifetime1;
        BattleCharacter stackIn_139_0Lifetime1Lifetime1;
        int var2_intLifetime1;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != 13047) {
            this.a((byte) 42, -38, -15, 53);
          }
          if (~this.field_u == ~this.field_J) {
            var2_int = 0;
            while (var2_int < 3 - this.field_J) {
              if (var4 != 0) {
                return;
              }
              if (null != this.attackers[var2_int] &&
                null != this.defenders[var2_int] &&
                this.attackers[var2_int].isIdle((byte) -74) &&
                this.defenders[var2_int].isIdle((byte) -110)) {
                if (AttackEvent.a(false, 1000, vv.field_b) >= 500) {
                  this.attackers[var2_int].setAnimationState(2, (byte) -113);
                  this.attackers[var2_int].animationDelay = je.field_K[this.field_a][0];
                  this.defenders[var2_int].setAnimationState(1, (byte) -119);
                } else {
                  this.attackers[var2_int].setAnimationState(1, (byte) -116);
                  this.defenders[var2_int].animationFrame = 2;
                  this.defenders[var2_int].animationDelay = je.field_K[this.field_c][0];
                }
              }
              var2_int++;
            }
            if (var4 == 0) {
              return;
            }
          }
          if (2 == this.field_J ||
            this.field_u == 2) {
            var2_intLifetime1 = 1;
            var3 = 0;
            scanLoop1: while (true) {
              if ((-this.field_J + 3) > var3) {
                stackIn_139_0 = this.attackers[var3];
                if (var4 != 0) {
                  while (true) {
                    stackIn_139_0.animationDelay = AttackEvent.a(false, 5, vv.field_b);
                    while (true) {
                      var3++;
                      break scanLoop1;
                    }
                  }
                }
                if (stackIn_139_0 != null &&
                  !this.attackers[var3].isIdle((byte) -74)) {
                  var2_intLifetime1 = 0;
                }
                var3++;
                if (var4 == 0) {
                  continue;
                }
              }
              var3 = 0;
              while (true) {
                boolean decompiledFrameCompleted0 = true;
                if (var3 < (-this.field_u + 3)) {
                  stackIn_136_0 = null;
                  stackIn_136_1 = this.defenders[var3];
                  if (var4 == 0) {
                    if (stackIn_136_0 != stackIn_136_1 &&
                      !this.defenders[var3].isIdle((byte) 30)) {
                      var2_intLifetime1 = 0;
                    }
                    var3++;
                    continue;
                  }
                } else {
                  if (var2_intLifetime1 == 0) {
                    break;
                  }
                  if (AttackEvent.a(false, 1000, vv.field_b) < 500) {
                    boolean decompiledFrameRemainder5 = true;
                    regionExit2: {
                      boolean decompiledSharedTail2 = (this.field_J == 2);
                      if (!decompiledSharedTail2) {
                        var3 = 0;
                        while (var3 < 3 - this.field_J) {
                          stackIn_91_0 = null;
                          stackIn_91_1 = this.attackers[var3];
                          if (var4 != 0) {
                            while (true) {
                              if (stackIn_91_0 != stackIn_91_1) {
                                this.defenders[var3].animationFrame = 2;
                                this.defenders[var3].animationDelay = je.field_K[this.field_c][0] - AttackEvent.a(false, 5, vv.field_b);
                              }
                              var3++;
                              break regionExit2;
                            }
                          }
                          if (stackIn_91_0 != stackIn_91_1) {
                            this.attackers[var3].animationFrame = 1;
                          }
                          if (null != this.attackers[var3]) {
                            this.attackers[var3].animationDelay = AttackEvent.a(false, 5, vv.field_b);
                          }
                          var3++;
                          if (var4 == 0) {
                            continue;
                          }
                          break;
                        }
                        decompiledSharedTail2 = (var4 != 0);
                      }
                      if ((decompiledSharedTail2) &&
                        (null != this.attackers[0])) {
                        this.attackers[0].setAnimationState(1, (byte) -86);
                      }
                      decompiledFrameRemainder5 = (2 != this.field_u);
                      if (decompiledFrameRemainder5) {
                        var3 = 0;
                        while (3 - this.field_u > var3) {
                          if (var4 != 0) {
                            break scanLoop1;
                          }
                          stackIn_91_0Lifetime1 = null;
                          stackIn_91_1Lifetime1 = this.defenders[var3];
                          if (stackIn_91_0Lifetime1 != stackIn_91_1Lifetime1) {
                            this.defenders[var3].animationFrame = 2;
                            this.defenders[var3].animationDelay = je.field_K[this.field_c][0] - AttackEvent.a(false, 5, vv.field_b);
                          }
                          var3++;
                        }
                      }
                    }
                    if ((decompiledFrameRemainder5) &&
                      (var4 == 0)) {
                      break;
                    }
                    if (this.defenders[0] == null) {
                      break;
                    }
                    this.defenders[0].animationFrame = 2;
                    this.defenders[0].animationDelay = je.field_K[this.field_c][0];
                    if (var4 == 0) {
                      break;
                    }
                  }
                  boolean decompiledFrameRemainder4 = true;
                  if ((this.field_J == 2) &&
                    (decompiledFrameRemainder4 = (null != this.attackers[0]))) {
                    this.attackers[0].animationFrame = 2;
                    this.attackers[0].animationDelay = je.field_K[this.field_a][0];
                    decompiledFrameRemainder4 = (var4 != 0);
                  }
                  if (decompiledFrameRemainder4) {
                    var3 = 0;
                    while (var3 < (-this.field_J + 3)) {
                      stackIn_136_0 = null;
                      stackIn_136_1 = this.attackers[var3];
                      if (var4 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_136_0 != stackIn_136_1) {
                        this.attackers[var3].animationFrame = 2;
                      }
                      if (this.attackers[var3] != null) {
                        this.attackers[var3].animationDelay = je.field_K[this.field_a][0] - AttackEvent.a(false, 5, vv.field_b);
                      }
                      var3++;
                    }
                  }
                  if (decompiledFrameCompleted0) {
                    if (this.field_u == 2) {
                      if (this.defenders[0] == null) {
                        break;
                      }
                      this.defenders[0].setAnimationState(1, (byte) -122);
                      if (var4 == 0) {
                        break;
                      }
                    }
                    var3 = 0;
                    while (var3 < (3 - this.field_u)) {
                      if (var4 != 0) {
                        return;
                      }
                      stackIn_136_0 = null;
                      stackIn_136_1 = this.defenders[var3];
                      if (stackIn_136_0 != stackIn_136_1) {
                        this.defenders[var3].animationFrame = 1;
                        stackIn_139_0Lifetime1 = this.defenders[var3];
                        stackIn_139_0Lifetime1.animationDelay = AttackEvent.a(false, 5, vv.field_b);
                      }
                      var3++;
                    }
                    break scanLoop1;
                  }
                }
                while (true) {
                  if (stackIn_136_0 != stackIn_136_1) {
                    this.defenders[var3].animationFrame = 1;
                    stackIn_139_0Lifetime1Lifetime1 = this.defenders[var3];
                    stackIn_139_0Lifetime1Lifetime1.animationDelay = AttackEvent.a(false, 5, vv.field_b);
                  }
                  var3++;
                  if (var4 != 0) {
                    break scanLoop1;
                  }
                  if (var3 >= (3 - this.field_u)) {
                    break scanLoop1;
                  }
                  stackIn_136_0 = null;
                  stackIn_136_1 = this.defenders[var3];
                }
              }
              break;
            }
            if (var4 == 0) {
              return;
            }
          }
          if (this.field_J != 0) {
            boolean decompiledFrameRemainder3 = true;
            if (null != this.attackers[0] &&
              this.attackers[0].isIdle((byte) -61)) {
              if ((null == this.defenders[0] ||
                !this.defenders[0].isIdle((byte) 104) ||
                null != this.defenders[1]) &&
                (decompiledFrameRemainder3 = (this.defenders[1] != null))) {
                decompiledFrameRemainder3 = !(!this.defenders[1].isIdle((byte) 33));
              }
              if (decompiledFrameRemainder3) {
                if (500 > AttackEvent.a(false, 1000, vv.field_b)) {
                  if (null != this.attackers[0]) {
                    this.attackers[0].animationDelay = je.field_K[this.field_a][0] - AttackEvent.a(false, 5, vv.field_b);
                    this.attackers[0].animationFrame = 2;
                  }
                  if (this.defenders[1] != null &&
                    this.defenders[1].isIdle((byte) -80)) {
                    this.defenders[1].animationDelay = je.field_K[this.field_c][0] - AttackEvent.a(false, 5, vv.field_b);
                    this.defenders[1].animationFrame = 1;
                    decompiledFrameRemainder3 = (var4 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (decompiledFrameRemainder3 = (this.defenders[0] != null))) {
                    this.defenders[0].animationDelay = je.field_K[this.field_c][0] - AttackEvent.a(false, 5, vv.field_b);
                    this.defenders[0].animationFrame = 1;
                    decompiledFrameRemainder3 = (var4 != 0);
                  }
                }
                if (decompiledFrameRemainder3) {
                  if (this.attackers[0] != null) {
                    this.attackers[0].animationDelay = AttackEvent.a(false, 5, vv.field_b);
                    this.attackers[0].animationFrame = 1;
                  }
                  if (this.defenders[1] == null ||
                    !this.defenders[1].isIdle((byte) -56)) {
                    if (null != this.defenders[0]) {
                      this.defenders[0].animationDelay = je.field_K[this.field_c][0] - AttackEvent.a(false, 5, vv.field_b);
                      this.defenders[0].animationFrame = 2;
                      if (var4 != 0) {
                        this.defenders[1].animationDelay = je.field_K[this.field_c][0] - AttackEvent.a(false, 5, vv.field_b);
                        this.defenders[1].animationFrame = 2;
                      }
                    }
                  } else {
                    this.defenders[1].animationDelay = je.field_K[this.field_c][0] - AttackEvent.a(false, 5, vv.field_b);
                    this.defenders[1].animationFrame = 2;
                  }
                }
              }
            }
            boolean decompiledFrameRemainder2 = true;
            if (this.attackers[1] != null &&
              this.attackers[1].isIdle((byte) -45)) {
              if ((null == this.defenders[0] ||
                !this.defenders[0].isIdle((byte) -90) ||
                this.defenders[1] != null) &&
                (decompiledFrameRemainder2 = (null != this.defenders[2]))) {
                decompiledFrameRemainder2 = !(!this.defenders[2].isIdle((byte) 29));
              }
              if (decompiledFrameRemainder2) {
                if (AttackEvent.a(false, 1000, vv.field_b) >= 500) {
                  if (this.attackers[1] != null) {
                    this.attackers[1].animationDelay = AttackEvent.a(false, 5, vv.field_b);
                    this.attackers[1].animationFrame = 1;
                  }
                  if ((this.defenders[2] == null ||
                    !this.defenders[2].isIdle((byte) -114)) &&
                    (decompiledFrameRemainder2 = (null != this.defenders[0]))) {
                    this.defenders[0].animationDelay = je.field_K[this.field_c][0] - AttackEvent.a(false, 30, vv.field_b);
                    this.defenders[0].animationFrame = 2;
                    decompiledFrameRemainder2 = (var4 != 0);
                  }
                  if (decompiledFrameRemainder2) {
                    this.defenders[2].animationDelay = je.field_K[this.field_c][0] - AttackEvent.a(false, 5, vv.field_b);
                    this.defenders[2].animationFrame = 2;
                    decompiledFrameRemainder2 = (var4 != 0);
                  }
                }
                if (decompiledFrameRemainder2) {
                  if (null != this.attackers[1]) {
                    this.attackers[1].animationDelay = je.field_K[this.field_a][0] - AttackEvent.a(false, 5, vv.field_b);
                    this.attackers[1].animationFrame = 2;
                  }
                  boolean decompiledSharedTail1 = (null == this.defenders[2] ||
                    !(this.defenders[2].isIdle((byte) -112)));
                  if (!decompiledSharedTail1) {
                    this.defenders[2].animationDelay = AttackEvent.a(false, 5, vv.field_b);
                    this.defenders[2].animationFrame = 1;
                    decompiledSharedTail1 = (var4 != 0);
                  }
                  if ((decompiledSharedTail1) &&
                    (this.defenders[0] != null)) {
                    this.defenders[0].animationDelay = AttackEvent.a(false, 5, vv.field_b);
                    this.defenders[0].animationFrame = 1;
                  }
                }
              }
            }
            if (this.defenders[0] == null) {
              return;
            }
            if (!this.defenders[0].isIdle((byte) -70)) {
              return;
            }
            if (this.defenders[1] == null ||
              -1 == this.defenders[1].animationFrame ||
              null == this.defenders[2] ||
              -1 == this.defenders[2].animationFrame) {
              if (this.defenders[1] == null ||
                -1 == this.defenders[1].animationFrame) {
                if (this.defenders[2] == null) {
                  return;
                }
                if (-1 == this.defenders[2].animationFrame) {
                  return;
                }
                if (null == this.defenders[0]) {
                  return;
                }
                this.defenders[0].animationDelay = this.defenders[2].animationDelay + AttackEvent.a(false, 5, vv.field_b);
                this.defenders[0].animationFrame = this.defenders[2].animationFrame;
                if (var4 == 0) {
                  return;
                }
              }
              if (null == this.defenders[0]) {
                return;
              }
              this.defenders[0].animationDelay = this.defenders[1].animationDelay + AttackEvent.a(false, 5, vv.field_b);
              this.defenders[0].animationFrame = this.defenders[1].animationFrame;
              if (var4 == 0) {
                return;
              }
            }
            if (AttackEvent.a(false, 1000, vv.field_b) >= 500) {
              if (this.defenders[0] == null) {
                return;
              }
              this.defenders[0].animationDelay = this.defenders[1].animationDelay + AttackEvent.a(false, 5, vv.field_b);
              this.defenders[0].animationFrame = this.defenders[1].animationFrame;
              if (var4 == 0) {
                return;
              }
            }
            if (null == this.defenders[0]) {
              return;
            }
            this.defenders[0].animationDelay = this.defenders[2].animationDelay + AttackEvent.a(false, 5, vv.field_b);
            this.defenders[0].animationFrame = this.defenders[2].animationFrame;
            if (var4 == 0) {
              return;
            }
          }
          boolean decompiledFrameRemainder1 = true;
          if (this.defenders[0] != null &&
            this.defenders[0].isIdle((byte) -126)) {
            if ((null == this.attackers[0] ||
              !this.attackers[0].isIdle((byte) 118) ||
              this.attackers[1] != null) &&
              (decompiledFrameRemainder1 = (this.attackers[1] != null))) {
              decompiledFrameRemainder1 = !(!this.attackers[1].isIdle((byte) 117));
            }
            if (decompiledFrameRemainder1) {
              if (AttackEvent.a(false, 1000, vv.field_b) >= 500) {
                if (this.defenders[0] != null) {
                  this.defenders[0].animationDelay = AttackEvent.a(false, 5, vv.field_b);
                  this.defenders[0].animationFrame = 1;
                }
                if ((null == this.attackers[1] ||
                  !this.attackers[1].isIdle((byte) 126)) &&
                  (decompiledFrameRemainder1 = (null != this.attackers[0]))) {
                  this.attackers[0].animationDelay = je.field_K[this.field_a][0] - AttackEvent.a(false, 5, vv.field_b);
                  this.attackers[0].animationFrame = 2;
                  decompiledFrameRemainder1 = (var4 != 0);
                }
                if (decompiledFrameRemainder1) {
                  this.attackers[1].animationDelay = je.field_K[this.field_a][0] - AttackEvent.a(false, 5, vv.field_b);
                  this.attackers[1].animationFrame = 2;
                  decompiledFrameRemainder1 = (var4 != 0);
                }
              }
              if (decompiledFrameRemainder1) {
                this.defenders[0].animationDelay = je.field_K[this.field_c][0] - AttackEvent.a(false, 5, vv.field_b);
                this.defenders[0].animationFrame = 2;
                if (null == this.attackers[1] ||
                  !this.attackers[1].isIdle((byte) 112)) {
                  if (this.attackers[0] != null) {
                    this.attackers[0].animationDelay = AttackEvent.a(false, 5, vv.field_b);
                    this.attackers[0].animationFrame = 1;
                    if (var4 != 0) {
                      this.attackers[1].animationDelay = AttackEvent.a(false, 5, vv.field_b);
                      this.attackers[1].animationFrame = 1;
                    }
                  }
                } else {
                  this.attackers[1].animationDelay = AttackEvent.a(false, 5, vv.field_b);
                  this.attackers[1].animationFrame = 1;
                }
              }
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.defenders[1] != null &&
            this.defenders[1].isIdle((byte) -109)) {
            if ((null == this.attackers[0] ||
              !this.attackers[0].isIdle((byte) 72) ||
              null != this.attackers[1]) &&
              (decompiledFrameRemainder0 = (null != this.attackers[2]))) {
              decompiledFrameRemainder0 = !(!this.attackers[2].isIdle((byte) 99));
            }
            if (decompiledFrameRemainder0) {
              if (AttackEvent.a(false, 1000, vv.field_b) < 500) {
                if (null != this.defenders[1]) {
                  this.defenders[1].animationDelay = je.field_K[this.field_c][0] - AttackEvent.a(false, 5, vv.field_b);
                  this.defenders[1].animationFrame = 2;
                }
                if (null != this.attackers[2] &&
                  this.attackers[2].isIdle((byte) -50)) {
                  this.attackers[2].animationDelay = AttackEvent.a(false, 5, vv.field_b);
                  this.attackers[2].animationFrame = 1;
                  decompiledFrameRemainder0 = (var4 != 0);
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = (this.attackers[0] != null))) {
                  this.attackers[0].animationDelay = AttackEvent.a(false, 5, vv.field_b);
                  this.attackers[0].animationFrame = 1;
                  decompiledFrameRemainder0 = (var4 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (null != this.defenders[1]) {
                  this.defenders[1].animationDelay = AttackEvent.a(false, 5, vv.field_b);
                  this.defenders[1].animationFrame = 1;
                }
                boolean decompiledSharedTail0 = (this.attackers[2] == null ||
                  !(this.attackers[2].isIdle((byte) -122)));
                if (!decompiledSharedTail0) {
                  this.attackers[2].animationDelay = je.field_K[this.field_a][0] - AttackEvent.a(false, 5, vv.field_b);
                  this.attackers[2].animationFrame = 2;
                  decompiledSharedTail0 = (var4 != 0);
                }
                if ((decompiledSharedTail0) &&
                  (null != this.attackers[0])) {
                  this.attackers[0].animationDelay = je.field_K[this.field_a][0] - AttackEvent.a(false, 5, vv.field_b);
                  this.attackers[0].animationFrame = 2;
                }
              }
            }
          }
          if (null != this.attackers[0] &&
            this.attackers[0].isIdle((byte) 120)) {
            if (null == this.attackers[1] ||
              -1 == this.attackers[1].animationFrame ||
              null == this.attackers[2] ||
              this.attackers[2].animationFrame == -1) {
              if (this.attackers[1] == null ||
                this.attackers[1].animationFrame == -1) {
                if (null == this.attackers[2]) {
                  return;
                }
                if (this.attackers[2].animationFrame == -1) {
                  return;
                }
                if (null == this.attackers[0]) {
                  return;
                }
                this.attackers[0].animationDelay = this.attackers[2].animationDelay + AttackEvent.a(false, 5, vv.field_b);
                this.attackers[0].animationFrame = this.attackers[2].animationFrame;
                if (var4 == 0) {
                  return;
                }
              }
              if (null == this.attackers[0]) {
                return;
              }
              this.attackers[0].animationDelay = this.attackers[1].animationDelay + AttackEvent.a(false, 5, vv.field_b);
              this.attackers[0].animationFrame = this.attackers[1].animationFrame;
              if (var4 == 0) {
                return;
              }
            }
            if (AttackEvent.a(false, 1000, vv.field_b) >= 500) {
              if (null == this.attackers[0]) {
                return;
              }
              this.attackers[0].animationDelay = this.attackers[1].animationDelay + AttackEvent.a(false, 5, vv.field_b);
              this.attackers[0].animationFrame = this.attackers[1].animationFrame;
              if (var4 == 0) {
                return;
              }
            }
            if (this.attackers[0] != null) {
              this.attackers[0].animationDelay = this.attackers[1].animationDelay + AttackEvent.a(false, 5, vv.field_b);
              this.attackers[0].animationFrame = this.attackers[2].animationFrame;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.CA(" + param0 + ')');
        }
    }

    private final void e(int param0) {
        if (this.field_l == null) {
          return;
        }
        this.camera.field_c[0] = this.presenter.tileIndex % this.mapWidth;
        this.camera.field_c[1] = this.presenter.tileIndex / this.mapWidth;
        if (param0 != 2) {
          return;
        }
        try {
          this.camera.f(-106);
          this.camera.i(0);
          this.field_l[1] = this.camera.field_e[1];
          this.field_l[0] = this.camera.field_e[0];
          this.presenter.screenX = this.field_l[0];
          this.presenter.screenY = this.field_l[1];
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "sk.W(" + param0 + ')');
        }
    }

    private final void o(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.b(this.defenders, 12579);
          if (this.phaseFrame == 30) {
            this.phase = 1;
          }
          if (param0 > -116) {
            this.drawOverlayLayer((byte) -35);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.A(" + param0 + ')');
        }
    }

    final static String i(int param0) {
        RuntimeException var1 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -4938) {
            field_N = (String) null;
          }
          if (du.field_d == oh.field_L) {
            stackIn_5_0 = ue.field_a;
            return stackIn_5_0;
          }
          if (du.field_d == mh.field_b) {
            stackIn_8_0 = jh.field_j;
            return stackIn_8_0;
          }
          if (se.field_g.a((byte) -47)) {
            stackIn_13_0 = ga.field_d;
            return stackIn_13_0;
          }
          stackIn_11_0 = jh.field_j;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "sk.G(" + param0 + ')');
        }
    }

    public final void drawBaseLayer(byte obfuscationGuard) {
        int[] stackIn_50_0 = null;
        int stackIn_63_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var6Lifetime1Lifetime1;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          this.framebuffer.b();
          this.a((byte) 99, 0, 0, -1);
          tm.a();
          tm.c();
          if (this.field_d) {
            if (this.phase != 5) {
              if (this.phase != 6 && (this.phase != 8 ||
                this.field_L != 8)) {
                if ((this.phase != 7) &&
                  (decompiledFrameRemainder0 = (8 == this.phase))) {
                  decompiledFrameRemainder0 = (this.field_L == 7);
                }
                if (decompiledFrameRemainder0) {
                  this.a(this.field_y, this.attackers, (byte) 83);
                  decompiledFrameRemainder0 = (var9 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                this.a(false, this.defenders, (byte) 109, this.field_w, this.field_D);
                decompiledFrameRemainder0 = (var9 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              this.a(true, this.attackers, (byte) 109, this.field_y, this.field_D);
              decompiledFrameRemainder0 = (var9 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            this.f((byte) -15);
            if (this.field_o) {
              SoftwareRaster.f(320, 0, 640, 480, 0);
              if ((var9 != 0) &&
                (this.field_f)) {
                SoftwareRaster.f(0, 0, 320, 480, 0);
              }
            } else {
              if (this.field_f) {
                SoftwareRaster.f(0, 0, 320, 480, 0);
              }
            }
          }
          var2_int = 21;
          var3 = 35;
          var4 = 93;
          var5 = 35;
          var6 = rs.field_k - var2_int - var4;
          var7 = var3 + 0;
          if (iu.field_n &&
            this.isCombatViewReady((byte) -96)) {
            stackIn_50_0 = TutorialController.field_e;
          } else {
            stackIn_50_0 = nd.field_b;
          }
          var8 = stackIn_50_0;
          fe.a(var6, var7, var4, var5, DisplacedUnitMarker.field_s, var8, 0, 0, true);
          if (obfuscationGuard >= -119) {
            this.field_C = 65;
          }
          var2_intLifetime1 = var4 >> 1;
          var3Lifetime1 = mp.k(-104) + (var5 >> 1);
          fe.c(em.field_c, var2_intLifetime1 + var6, var7 + var3Lifetime1, 2236962, true);
          if (this.battlefield != null &&
            this.battlefield.field_T != null) {
            var3Lifetime2 = 19;
            if (ku.field_J != null) {
              stackIn_63_0 = ku.field_J.field_x >> 1;
            } else {
              stackIn_63_0 = 0;
            }
            var5Lifetime1 = stackIn_63_0;
            if (ku.field_J == null) {
              stackIn_67_0 = 0;
            } else {
              stackIn_67_0 = ku.field_J.field_A >> 1;
            }
            var4Lifetime1 = stackIn_67_0;
            var2_intLifetime2 = 17;
            var6Lifetime1 = 0 + var2_intLifetime2;
            var7Lifetime1 = -var5Lifetime1 + (CombatEvent.field_I.field_D - var3Lifetime2);
            if (this.field_e > -1) {
              this.battlefield.field_T[this.field_e].a(var6Lifetime1, this.battlefield.playerNames[this.field_e], false, false, var7Lifetime1, false, false, 122);
            }
            var6Lifetime1Lifetime1 = -var2_intLifetime2 + (so.field_b.field_a - var4Lifetime1);
            if (this.field_g > -1) {
              this.battlefield.field_T[this.field_g].a(var6Lifetime1Lifetime1, this.battlefield.playerNames[this.field_g], false, false, var7Lifetime1, false, false, 28);
            }
          }
          fe.b(0, 0, rs.field_k, se.field_a, dq.field_i, nd.field_b, 0, 0);
          so.field_b.a(5605);
          if (null != u.field_p) {
            u.field_p.a(-66, this.framebuffer);
            if (var9 == 0) {
              return;
            }
          }
          this.framebuffer.f(0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.H(" + obfuscationGuard + ')');
        }
    }

    private final void a(BattleCharacter[] param0, int param1, int param2, int param3, BattleCharacter[] param4) {
        RuntimeException stackIn_178_0 = null;
        StringBuilder stackIn_178_1 = null;
        String stackIn_179_2 = null;
        StringBuilder stackIn_182_1 = null;
        String stackIn_183_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var6 = new int[3 - param2];
          var7 = param1;
          if (param2 != 2) {
            boolean decompiledFrameRemainder1 = true;
            if ((1 != param2) &&
              (decompiledFrameRemainder1 = (param2 == 0))) {
              if (param4[0] == null && (param0[0] != null &&
                !param0[0].field_d ||
                param3 == 1 &&
                param0[1] != null &&
                !param0[1].field_d)) {
                var6[var7] = 0;
                var7++;
              }
              if (null == param4[1] && (0 != param3 &&
                null != param0[0] &&
                !param0[0].field_d ||
                param3 == 0 &&
                param0[1] != null &&
                !param0[1].field_d)) {
                var6[var7] = 1;
                var7++;
              }
              decompiledFrameRemainder1 = (param4[2] == null);
              if (decompiledFrameRemainder1) {
                if (((param3 != 2 ||
                  null == param0[0] ||
                  param0[0].field_d) &&
                  (param3 != 1 ||
                  null == param0[1] ||
                  param0[1].field_d)) &&
                  (decompiledFrameRemainder1 = (param3 == 0)) &&
                  (decompiledFrameRemainder1 = (null != param0[2]))) {
                  decompiledFrameRemainder1 = !(param0[2].field_d);
                }
                if (decompiledFrameRemainder1) {
                  var6[var7] = 2;
                  var7++;
                }
              }
            }
            if ((decompiledFrameRemainder1) &&
              (1 == param2 ||
              var10 != 0)) {
              if (param4[0] == null && (null != param0[0] &&
                !param0[0].field_d ||
                param3 == 0 &&
                null != param0[1] &&
                !param0[1].field_d)) {
                var6[var7] = 0;
                var7++;
              }
              if (null == param4[1]) {
                if ((null == param0[0] ||
                  param0[0].field_d) &&
                  (decompiledFrameRemainder1 = (param3 == 0)) &&
                  (decompiledFrameRemainder1 = (null != param0[2]))) {
                  decompiledFrameRemainder1 = !(param0[2].field_d);
                }
                if (decompiledFrameRemainder1) {
                  var6[var7] = 1;
                  var7++;
                  if (var10 != 0) {
                    return;
                  }
                }
              }
            }
            if (var7 == 0) {
              return;
            }
            boolean decompiledFrameRemainder0 = true;
            var8 = -1;
            var9 = var6[AttackEvent.a(false, var7, vv.field_b)];
            if (1 == param2 &&
              param4[2] != null) {
              var8 = 2;
              decompiledFrameRemainder0 = (var10 != 0);
            }
            if ((decompiledFrameRemainder0) &&
              (param2 == 0)) {
              if (var9 == 2) {
                if (null != param4[4] &&
                  param4[4].isAtDestination(2166)) {
                  var8 = 4;
                  decompiledFrameRemainder0 = (var10 != 0);
                }
                if ((decompiledFrameRemainder0) &&
                  (0 == param2) &&
                  (null != param4[3]) &&
                  (param4[3].isAtDestination(2166))) {
                  var8 = 3;
                  if (var10 != 0) {
                    if (null != param4[3] &&
                      param4[3].isAtDestination(2166)) {
                      var8 = 3;
                      if (var10 != 0 && (param2 == 0 &&
                        param4[4] != null &&
                        param4[4].isAtDestination(2166))) {
                        var8 = 4;
                      }
                    } else {
                      if (param2 == 0 &&
                        param4[4] != null &&
                        param4[4].isAtDestination(2166)) {
                        var8 = 4;
                      }
                    }
                  }
                }
              } else {
                if (null != param4[3] &&
                  param4[3].isAtDestination(2166)) {
                  var8 = 3;
                  if (var10 != 0 && (param2 == 0 &&
                    param4[4] != null &&
                    param4[4].isAtDestination(2166))) {
                    var8 = 4;
                  }
                } else {
                  if (param2 == 0 &&
                    param4[4] != null &&
                    param4[4].isAtDestination(2166)) {
                    var8 = 4;
                  }
                }
              }
            }
            if (var8 > -1) {
              param4[var9] = param4[var8];
              param4[var8] = null;
              param4[var9].currentX = tn.field_W[param2][var9];
              param4[var9].currentY = kw.field_P[param2][var9];
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_178_0 = var6_ref;
          stackIn_178_1 = new StringBuilder().append("sk.HA(");
          if (param0 == null) {
            stackIn_179_2 = "null";
          } else {
            stackIn_179_2 = "{...}";
          }
          stackIn_182_1 = ((StringBuilder) (Object) stackIn_178_1).append(stackIn_179_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_183_2 = "null";
          } else {
            stackIn_183_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_178_0), ((StringBuilder) (Object) stackIn_182_1).append(stackIn_183_2).append(')').toString());
        }
    }

    private final void c(boolean param0) {
        Object stackIn_19_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Object stackIn_19_0Lifetime1;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = 0;
          scanLoop1: while (true) {
            if (var2_int < this.attackers.length) {
              stackIn_19_0 = null;
              if (var3 != 0) {
                if (stackIn_19_0 != this.field_D[var2_int]) {
                  this.field_D[var2_int].d(59);
                  var2_int++;
                  break scanLoop1;
                }
                break scanLoop1;
              }
              if (stackIn_19_0 != this.attackers[var2_int]) {
                this.attackers[var2_int].d((byte) 113);
                if (this.attackers[var2_int].field_l) {
                  this.attackers[var2_int].field_l = false;
                  this.a((byte) -84, var2_int);
                  if (this.field_h) {
                    this.attackers[var2_int].a(0, 30, 1, -10, u.field_o[this.field_c][1], pk.field_T[this.field_c][1], (byte) 122);
                  }
                }
              }
              var2_int++;
              continue;
            }
            var2_int = 0;
            while (this.field_D.length > var2_int) {
              stackIn_19_0Lifetime1 = null;
              if (stackIn_19_0Lifetime1 == this.field_D[var2_int]) {
                break;
              }
              this.field_D[var2_int].d(59);
              var2_int++;
              if (var3 == 0) {
                continue;
              }
              break;
            }
            break;
          }
          if (param0) {
            return;
          }
          if (0 == (this.phaseFrame & 15)) {
            this.f(-24577);
          }
          if (this.field_D[-1 + this.field_D.length] != null &&
            this.field_D[-1 + this.field_D.length].field_f > 200) {
            this.phase = 6;
            this.h(1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.KA(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 < 86) {
            field_j = (int[][]) null;
          }
          if (jv.field_a ||
            null == this.field_A) {
            SoftwareRaster.b();
            if (var6 == 0) {
              return;
            }
          }
          if (param3 < 0) {
            this.field_A.f(param1, param2);
            if (var6 == 0) {
              return;
            }
          }
          this.field_A.e(param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var5), "sk.LA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int[] a(int param0, byte param1) {
        int[] stackIn_3_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int[] stackIn_23_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var8Lifetime1;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 > -126) {
            stackIn_3_0 = (int[]) null;
            return stackIn_3_0;
          }
          var3 = new int[param0];
          var4 = new int[param0];
          var5 = 0;
          do {
            if (var5 >= param0) {
              var5 = 0;
              break;
            }
            var3[var5] = var5;
            var4[var5] = AttackEvent.a(false, 2147483647, vv.field_b);
            var5++;
          } while (var9 == 0);
          while (true) {
            stackIn_12_0 = ~var5;
            stackIn_12_1 = ~(param0 - 1);
            if (stackIn_12_0 > stackIn_12_1) {
              var6 = var5;
              stackIn_23_0 = var4;
              if (var9 == 0) {
                var7 = stackIn_23_0[var5];
                var8 = var5 + 1;
                while (param0 > var8) {
                  stackIn_12_0 = ~var4[var8];
                  stackIn_12_1 = ~var7;
                  if (stackIn_12_0 < stackIn_12_1) {
                    var7 = var4[var8];
                    var6 = var8;
                  }
                  var8++;
                }
                var8Lifetime1 = var3[var6];
                var4[var6] = var4[var5];
                var3[var6] = var3[var5];
                var4[var5] = var7;
                var3[var5] = var8Lifetime1;
                var5++;
                continue;
              }
            } else {
              stackIn_23_0 = var3;
            }
            return stackIn_23_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3_ref), "sk.J(" + param0 + ',' + param1 + ')');
        }
    }

    private final void e(byte param0) {
        BattleCharacter stackIn_43_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.field_v == 0) {
            return;
          }
          if (param0 <= 47) {
            this.field_u = -53;
          }
          if (0 != this.field_I) {
            this.field_I = this.field_I - 1;
            if (var4 == 0) {
              return;
            }
          }
          var2_int = 0;
          var3 = 0;
          var3Lifetime1 = 0;
          while (true) {
            if (var3Lifetime1 < this.attackers.length) {
              stackIn_43_0 = this.attackers[var3Lifetime1];
              if (var4 == 0) {
                if (stackIn_43_0 != null &&
                  this.attackers[var3Lifetime1].animationState == 0) {
                  var2_int++;
                }
                var3Lifetime1++;
                continue;
              }
            } else {
              if (var2_int == 0) {
                return;
              }
              var2_int = AttackEvent.a(false, var2_int, vv.field_b) + 1;
              var3Lifetime1 = 0;
              var3Lifetime1 = 0;
              while (var3Lifetime1 < this.attackers.length) {
                if (0 < var2_int) {
                  if (null != this.attackers[var3Lifetime1] && (this.attackers[var3Lifetime1].animationState == 0 ||
                    var4 != 0)) {
                    var2_int--;
                  }
                  var3Lifetime1++;
                  if (var4 == 0) {
                    continue;
                  }
                }
                break;
              }
              this.attackers[var3Lifetime1 - 1].setAnimationState(2, (byte) -108);
              this.attackers[var3Lifetime1 - 1].a(0, 30, 1, 0, u.field_o[this.field_c][0], pk.field_T[this.field_c][0], (byte) 122);
              this.attackers[var3Lifetime1 - 1].field_d = true;
              this.defenders[0].setAnimationState(1, (byte) -109);
              stackIn_43_0 = this.defenders[0];
            }
            break;
          }
          ((BattleCharacter) (Object) stackIn_43_0).a(0, 30, 1, 20, u.field_o[this.field_a][1], pk.field_T[this.field_a][1], (byte) 122);
          this.field_v = this.field_v - 1;
          this.field_I = 20 + AttackEvent.a(false, 20, vv.field_b);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.IA(" + param0 + ')');
        }
    }

    final static void n(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 >= -30) {
            field_G = (jp) null;
          }
          jm.field_g = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "sk.M(" + param0 + ')');
        }
    }

    private final boolean a(byte param0, int param1, BattleCharacter[] param2, int param3, BattleCharacter[] param4) {
        RuntimeException stackIn_190_0 = null;
        StringBuilder stackIn_190_1 = null;
        String stackIn_191_2 = null;
        StringBuilder stackIn_194_1 = null;
        String stackIn_195_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        try {
          var6 = new int[3 - param1];
          var7 = 0;
          if (param1 == 2) {
            param4[0].field_d = true;
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if ((param1 != 1) &&
            (decompiledFrameRemainder0 = (0 == param1))) {
            if (null != param4[0] &&
              !param4[0].field_d &&
              param4[0].isAtDestination(2166) && (param2[0] != null &&
              !param2[0].field_d &&
              param2[0].isAtDestination(2166) ||
              1 == param3 &&
              null != param2[1] &&
              !param2[1].field_d &&
              param2[1].isAtDestination(2166))) {
              var6[var7] = 0;
              var7++;
            }
            if (param4[1] != null &&
              !param4[1].field_d &&
              param4[1].isAtDestination(2166) && (param3 != 0 &&
              param2[0] != null &&
              !param2[0].field_d &&
              param2[0].isAtDestination(2166) ||
              param3 == 0 &&
              null != param2[1] &&
              !param2[1].field_d &&
              param2[1].isAtDestination(2166))) {
              var6[var7] = 1;
              var7++;
            }
            decompiledFrameRemainder0 = (null != param4[2]);
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameRemainder0 = !(param4[2].field_d)) &&
              (decompiledFrameRemainder0 = !(!param4[2].isAtDestination(2166)))) {
              if (((param3 != 2 ||
                param2[0] == null ||
                param2[0].field_d ||
                !param2[0].isAtDestination(2166)) &&
                (param3 != 1 ||
                param2[1] == null ||
                param2[1].field_d ||
                !param2[1].isAtDestination(2166))) &&
                (decompiledFrameRemainder0 = (param3 == 0)) &&
                (decompiledFrameRemainder0 = (null != param2[2])) &&
                (decompiledFrameRemainder0 = !(param2[2].field_d))) {
                decompiledFrameRemainder0 = !(!param2[2].isAtDestination(2166));
              }
              if (decompiledFrameRemainder0) {
                var6[var7] = 2;
                var7++;
              }
            }
          }
          if ((decompiledFrameRemainder0) &&
            (param1 == 1 ||
            ArmiesOfGielinor.obfuscationControl)) {
            if (null != param4[0] &&
              !param4[0].field_d &&
              param4[0].isAtDestination(2166) && (param2[0] != null &&
              !param2[0].field_d ||
              param3 == 0 &&
              null != param2[1] &&
              !param2[1].field_d &&
              param2[1].isAtDestination(2166))) {
              var6[var7] = 0;
              var7++;
            }
            if (null != param4[1] &&
              !param4[1].field_d &&
              param4[1].isAtDestination(2166)) {
              if (param2[0] == null ||
                param2[0].field_d ||
                !param2[0].isAtDestination(param0 + 2259)) {
                if ((param3 == 0) &&
                  (null != param2[2]) &&
                  (!param2[2].field_d) &&
                  (param2[2].isAtDestination(2166))) {
                  var6[var7] = 1;
                  var7++;
                }
              } else {
                var6[var7] = 1;
                var7++;
              }
            }
          }
          if (var7 == 0) {
            return false;
          }
          var8 = var6[AttackEvent.a(false, var7, vv.field_b)];
          if (param0 != -93) {
            return true;
          }
          param4[var8].field_d = true;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_190_0 = var6_ref;
          stackIn_190_1 = new StringBuilder().append("sk.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_191_2 = "null";
          } else {
            stackIn_191_2 = "{...}";
          }
          stackIn_194_1 = ((StringBuilder) (Object) stackIn_190_1).append(stackIn_191_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_195_2 = "null";
          } else {
            stackIn_195_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_190_0), ((StringBuilder) (Object) stackIn_194_1).append(stackIn_195_2).append(')').toString());
        }
    }

    private final void a(boolean param0, BattleCharacter[] param1, byte param2, int param3, km[] param4) {
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        Object stackIn_37_0 = null;
        BattleCharacter stackIn_37_1 = null;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        String stackIn_133_2 = null;
        StringBuilder stackIn_136_1 = null;
        String stackIn_137_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_63_0Lifetime1;
        int stackIn_63_1Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime1Lifetime1;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          param3 = 0;
          var6_int = 0;
          do {
            if (param1.length <= var6_int) {
              var6_int = 0;
              break;
            }
            param3++;
            var6_int++;
          } while (var12 == 0);
          var7 = new int[param3];
          while (var6_int < param4.length) {
            if (param4[var6_int] != null) {
              var6_int++;
              if (var12 == 0) {
                continue;
              }
            }
            break;
          }
          var8 = new int[var6_int];
          var9 = 0;
          do {
            if (var9 >= var6_int) {
              var6_int = 0;
              break;
            }
            var8[var9] = var9;
            var9++;
          } while (var12 == 0);
          var9 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (param3 <= var9))) {
            if (var12 == 0) {
              if (null != param1[var9]) {
                var7[var6_int++] = var9;
              }
              var9++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            param3 = var6_int;
          }
          var9 = 0;
          scanLoop1: while (true) {
            if (param3 > var9) {
              var10 = var9;
              if (var12 != 0) {
                break scanLoop1;
              }
              stackIn_37_0 = null;
              stackIn_37_1 = param1[var7[var10]];
              while (true) {
                if (stackIn_37_0 != stackIn_37_1) {
                  var11 = 1 + var9;
                  while (var11 < param3) {
                    stackIn_37_0 = null;
                    stackIn_37_1 = param1[var7[var11]];
                    if (stackIn_37_0 != stackIn_37_1 &&
                      param1[var7[var11]].destinationY > param1[var7[var10]].destinationY) {
                      var10 = var11;
                    }
                    var11++;
                  }
                  if (var10 != var9) {
                    var11Lifetime2 = var7[var10];
                    var7[var10] = var7[var9];
                    var7[var9] = var11Lifetime2;
                  }
                }
                var9++;
                continue scanLoop1;
              }
            }
            var9 = 0;
            break;
          }
          scanLoop2: while (true) {
            if (var8.length > var9) {
              var10Lifetime1 = var9;
              stackIn_67_0 = var9 + 1;
              if (var12 != 0) {
                break scanLoop2;
              }
              var11Lifetime1 = stackIn_67_0;
              while (var11Lifetime1 < var8.length) {
                stackIn_63_0 = ~param4[var8[var10Lifetime1]].field_d;
                stackIn_63_1 = ~param4[var8[var11Lifetime1]].field_d;
                if (stackIn_63_0 > stackIn_63_1) {
                  var10Lifetime1 = var11Lifetime1;
                }
                var11Lifetime1++;
              }
              stackIn_63_0Lifetime1 = var9;
              stackIn_63_1Lifetime1 = var10Lifetime1;
              if (stackIn_63_0Lifetime1 != stackIn_63_1Lifetime1) {
                var11Lifetime1Lifetime1 = var8[var10Lifetime1];
                var8[var10Lifetime1] = var8[var9];
                var8[var9] = var11Lifetime1Lifetime1;
              }
              var9++;
              continue scanLoop2;
            }
            var9 = 0;
            stackIn_67_0 = param2;
            break;
          }
          if (stackIn_67_0 != 109) {
            return;
          }
          if (cu.field_a) {
            scanLoop3: while (true) {
              boolean decompiledFrameRemainder1 = true;
              if (var8.length <= var6_int) {
                stackIn_79_0 = var9;
                stackIn_79_1 = param3;
                decompiledFrameRemainder1 = (var12 == 0);
                if ((decompiledFrameRemainder1) &&
                  (stackIn_79_0 >= stackIn_79_1)) {
                  break scanLoop3;
                }
              }
              if (decompiledFrameRemainder1) {
                stackIn_79_0 = var9;
                stackIn_79_1 = param3;
              }
              if (stackIn_79_0 < stackIn_79_1 &&
                param1[var7[var9]] == null) {
                var9++;
                if (var12 == 0) {
                  continue;
                }
              }
              if (var9 < param3) {
                if (var8.length > var6_int) {
                  if (param1[var7[var9]].destinationY < param4[var8[var6_int]].field_d) {
                    incrementValue$1 = var6_int;
                    var6_int++;
                    param4[var8[incrementValue$1]].a(param0, param2 ^ -107, true, this.field_C);
                    if (var12 == 0) {
                      continue;
                    }
                  }
                  incrementValue$2 = var9;
                  var9++;
                  param1[var7[incrementValue$2]].a(this.field_C, -91, true);
                  if (var12 == 0) {
                    continue;
                  }
                }
                incrementValue$3 = var9;
                var9++;
                param1[var7[incrementValue$3]].a(this.field_C, param2 ^ -55, true);
                if (var12 == 0) {
                  continue;
                }
              }
              incrementValue$4 = var6_int;
              var6_int++;
              param4[var8[incrementValue$4]].a(param0, -8, true, this.field_C);
              if (var12 == 0) {
                continue;
              }
              break;
            }
            this.a((byte) 98, 0, 0, 128);
          }
          var9 = 0;
          var6_int = 0;
          while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var6_int >= var8.length) {
              stackIn_108_0 = ~param3;
              stackIn_108_1 = ~var9;
              decompiledFrameRemainder0 = (var12 == 0);
              if ((decompiledFrameRemainder0) &&
                (stackIn_108_0 >= stackIn_108_1)) {
                return;
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_108_0 = param3;
              stackIn_108_1 = var9;
            }
            if (stackIn_108_0 > stackIn_108_1 &&
              param1[var7[var9]] == null) {
              var9++;
              if (var12 == 0) {
                continue;
              }
            }
            if (var9 < param3) {
              if (var6_int >= var8.length) {
                incrementValue$5 = var9;
                var9++;
                param1[var7[incrementValue$5]].a(this.field_C, -65, false);
                if (var12 == 0) {
                  continue;
                }
              }
              if (param1[var7[var9]].destinationY < param4[var8[var6_int]].field_d) {
                incrementValue$6 = var6_int;
                var6_int++;
                param4[var8[incrementValue$6]].a(param0, -8, false, this.field_C);
                if (var12 == 0) {
                  continue;
                }
              }
              incrementValue$7 = var9;
              var9++;
              param1[var7[incrementValue$7]].a(this.field_C, -70, false);
              if (var12 == 0) {
                continue;
              }
            }
            incrementValue$8 = var6_int;
            var6_int++;
            param4[var8[incrementValue$8]].a(param0, -8, false, this.field_C);
            if (var12 == 0) {
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_132_0 = var6;
          stackIn_132_1 = new StringBuilder().append("sk.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_133_2 = "null";
          } else {
            stackIn_133_2 = "{...}";
          }
          stackIn_136_1 = ((StringBuilder) (Object) stackIn_132_1).append(stackIn_133_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_137_2 = "null";
          } else {
            stackIn_137_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_132_0), ((StringBuilder) (Object) stackIn_136_1).append(stackIn_137_2).append(')').toString());
        }
    }

    private final void d(int param0) {
        this.a(this.attackers, -4925);
        if (param0 != 29823) {
          return;
        }
        try {
          this.b(this.attackers, 12579);
          if (this.phaseFrame > 200) {
            this.phaseFrame = 0;
            this.phase = 8;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "sk.R(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        field_G = null;
        field_M = null;
        field_N = null;
        if (param0 > -126) {
          return;
        }
        try {
          field_j = (int[][]) null;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "sk.V(" + param0 + ')');
        }
    }

    public final boolean isFinished(int obfuscationGuard) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (this.phase == 8 && (null == u.field_p ||
            u.field_p.transitionFactor == 0)) {
            stackIn_10_0 = 1;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_10_0 = 0;
          }
          var2_int = stackIn_10_0;
          if (obfuscationGuard != 8865) {
            return false;
          }
          if (var2_int != 0) {
            eb.a(this.field_d, this.field_c, true);
            eb.a(this.field_d, this.field_a, true);
          }
          stackIn_18_0 = var2_int;
          return stackIn_18_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.K(" + obfuscationGuard + ')');
        }
    }

    private final void a(byte param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4 = 34 / ((-38 - param0) / 44);
          var3_int = 0;
          while (this.field_D.length > var3_int) {
            if (null != this.field_D[var3_int]) {
              var3_int++;
              if (var5 == 0) {
                continue;
              }
            }
            break;
          }
          if (var3_int >= this.field_D.length) {
            return;
          }
          this.field_D[var3_int] = new km(-u.field_o[this.field_c][1] + this.attackers[param1].destinationX, 600 - pk.field_T[this.field_c][1], this.attackers[param1].destinationY, 2, this.field_z);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "sk.MA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(BattleCharacter[] param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3_int = 0;
          while (param0.length > var3_int) {
            if (var4 != 0) {
              return;
            }
            if (param0[var3_int] != null) {
              param0[var3_int].d((byte) 113);
            }
            var3_int++;
          }
          if (param1 != 12579) {
            this.field_c = 97;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_17_0 = runtimeException;
          stackIn_17_1 = new StringBuilder().append("sk.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void l(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 < 26) {
            this.field_w = -32;
          }
          var2_int = this.field_y - this.field_v;
          var3 = this.field_w - this.field_O;
          if (0 >= this.field_O ||
            this.field_v <= 0) {
            if (0 >= this.field_v) {
              if (this.field_O <= 0) {
                return;
              }
              if (!this.a((byte) -93, this.field_u, this.attackers, this.field_J, this.defenders)) {
                return;
              }
              this.field_O = this.field_O - 1;
              if (var4 == 0) {
                return;
              }
            }
            if (!this.a((byte) -93, this.field_J, this.defenders, this.field_u, this.attackers)) {
              return;
            }
            this.field_v = this.field_v - 1;
            if (var4 == 0) {
              return;
            }
          }
          if (var2_int > 0 &&
            0 < var3) {
            if (AttackEvent.a(false, this.field_O + this.field_v, vv.field_b) <= this.field_v) {
              if (!this.a((byte) -93, this.field_J, this.defenders, this.field_u, this.attackers)) {
                return;
              }
              this.field_v = this.field_v - 1;
              if (var4 == 0) {
                return;
              }
            }
            if (!this.a((byte) -93, this.field_u, this.attackers, this.field_J, this.defenders)) {
              return;
            }
            this.field_O = this.field_O - 1;
            if (var4 == 0) {
              return;
            }
          }
          if (var2_int <= 0) {
            if (var3 <= 0) {
              return;
            }
            if (!this.a((byte) -93, this.field_u, this.attackers, this.field_J, this.defenders)) {
              return;
            }
            this.field_O = this.field_O - 1;
            if (var4 == 0) {
              return;
            }
          }
          if (this.a((byte) -93, this.field_J, this.defenders, this.field_u, this.attackers)) {
            this.field_v = this.field_v - 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.PA(" + param0 + ')');
        }
    }

    private final void b(byte param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 54) {
            return;
          }
          this.field_A = qc.a(param1, 8806);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "sk.EA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.b(this.attackers, param0 + 12453);
          this.b(this.defenders, param0 + 12453);
          if (param0 != 126) {
            this.a((byte) -79, 88);
          }
          if (this.phaseFrame == 1) {
            if (null != u.field_p) {
              u.field_p.a(param0 ^ -24, this.field_t);
            }
            oo.e(-387);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.NA(" + param0 + ')');
        }
    }

    final void a(int param0, Unit param1, int param2, boolean param3, Unit param4) {
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        boolean stackIn_21_1 = false;
        int stackIn_38_1 = 0;
        int stackIn_41_1 = 0;
        int stackIn_42_2 = 0;
        boolean stackIn_52_1 = false;
        int stackIn_62_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_66_1 = 0;
        int stackIn_67_2 = 0;
        boolean stackIn_77_1 = false;
        int stackIn_188_1 = 0;
        BattleCharacter stackIn_207_2 = null;
        BattleCharacter stackIn_207_3 = null;
        int stackIn_207_4 = 0;
        boolean stackIn_207_5 = false;
        int stackIn_207_6 = 0;
        int stackIn_207_7 = 0;
        boolean stackIn_207_8 = false;
        int stackIn_209_9;
        boolean stackIn_210_10;
        BattleCharacter stackIn_211_2 = null;
        BattleCharacter stackIn_211_3 = null;
        int stackIn_211_9 = 0;
        BattleCharacter stackIn_220_2 = null;
        BattleCharacter stackIn_220_3 = null;
        int stackIn_220_4 = 0;
        boolean stackIn_220_5 = false;
        int stackIn_220_6 = 0;
        int stackIn_220_7 = 0;
        boolean stackIn_220_8 = false;
        int stackIn_222_9;
        boolean stackIn_223_10;
        BattleCharacter stackIn_224_2 = null;
        BattleCharacter stackIn_224_3 = null;
        int stackIn_224_9 = 0;
        BattleCharacter[] stackIn_236_0 = null;
        int stackIn_236_1 = 0;
        int stackIn_244_1 = 0;
        RuntimeException stackIn_266_0 = null;
        StringBuilder stackIn_266_1 = null;
        String stackIn_267_2 = null;
        StringBuilder stackIn_270_1 = null;
        String stackIn_271_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        BattleCharacter stackIn_207_2Lifetime1;
        BattleCharacter stackIn_207_3Lifetime1;
        BattleCharacter stackIn_220_2Lifetime1;
        BattleCharacter stackIn_220_3Lifetime1;
        BattleCharacter[] stackIn_236_0Lifetime1;
        int stackIn_236_1Lifetime1;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (null == this.battlefield) {
            this.b((byte) 54, 0);
            if (var9 != 0) {
              this.b((byte) 54, this.battlefield.mapTheme);
            }
          } else {
            this.b((byte) 54, this.battlefield.mapTheme);
          }
          stackIn_11_0 = (param1.strength > param0) ? 0 : 1;
          var6_int = stackIn_11_0;
          if (var6_int != 0) {
            param2 = 0;
          }
          stackIn_17_0 = (param4.strength > param2) ? 0 : 1;
          var7 = stackIn_17_0;
          stackIn_21_1 = !(1 >= bw.unitDefinitions[param4.unitType][7]);
          this.field_d = stackIn_21_1;
          if (param4.unitType == 34 &&
            param4.packedFlag8) {
            this.field_d = true;
          }
          if (!param3) {
            this.field_v = 72;
          }
          if (this.field_d) {
            param2 = 0;
          }
          this.field_J = bw.unitDefinitions[param4.unitType][9];
          if (vu.field_N[this.field_J] * param4.strength % param4.maximumStrength <= 0) {
            stackIn_38_1 = 0;
          } else {
            stackIn_38_1 = 1;
          }
          this.field_y = stackIn_38_1 + param4.strength * vu.field_N[this.field_J] / param4.maximumStrength;
          stackIn_41_1 = -((-param2 + param4.strength) * vu.field_N[this.field_J] / param4.maximumStrength);
          if (vu.field_N[this.field_J] * (param4.strength - param2) % param4.maximumStrength > 0) {
            stackIn_42_2 = 1;
          } else {
            stackIn_42_2 = 0;
          }
          this.field_v = stackIn_41_1 + (-stackIn_42_2 + this.field_y);
          this.field_c = param4.unitType;
          if (this.field_v > this.field_y) {
            this.field_v = this.field_y;
          }
          stackIn_52_1 = (3 == param4.getUnitCategory(0)) || (7 == param1.unitType);
          this.field_E = stackIn_52_1;
          if (param1.unitType == 34 &&
            param1.packedFlag8) {
            this.field_q = true;
          }
          this.field_u = bw.unitDefinitions[param1.unitType][9];
          stackIn_62_1 = param1.strength * vu.field_N[this.field_u] / param1.maximumStrength;
          if (vu.field_N[this.field_u] * param1.strength % param1.maximumStrength <= 0) {
            stackIn_63_2 = 0;
          } else {
            stackIn_63_2 = 1;
          }
          this.field_w = stackIn_62_1 + stackIn_63_2;
          stackIn_66_1 = this.field_w;
          if ((-param0 + param1.strength) * vu.field_N[this.field_u] % param1.maximumStrength <= 0) {
            stackIn_67_2 = 0;
          } else {
            stackIn_67_2 = 1;
          }
          this.field_O = stackIn_66_1 - stackIn_67_2 - vu.field_N[this.field_u] * (param1.strength - param0) / param1.maximumStrength;
          this.field_a = param1.unitType;
          if (this.field_w < this.field_O) {
            this.field_O = this.field_w;
          }
          stackIn_77_1 = (param1.getUnitCategory(0) == 3) || (param1.unitType == 7);
          boolean decompiledFrameRemainder4 = true;
          this.field_P = stackIn_77_1;
          if (!this.field_d) {
            this.phase = 1;
            if (var6_int != 0) {
              this.field_L = 2;
              decompiledFrameRemainder4 = (var9 != 0);
            }
            if (decompiledFrameRemainder4) {
              if (var7 == 0) {
                this.field_L = 4;
                decompiledFrameRemainder4 = (var9 != 0);
              }
              if (decompiledFrameRemainder4) {
                this.field_L = 3;
                decompiledFrameRemainder4 = (var9 != 0);
              }
            }
          }
          if (decompiledFrameRemainder4) {
            boolean decompiledFrameRemainder3 = true;
            if (34 == this.field_c) {
              this.field_z = 2;
              decompiledFrameRemainder3 = (var9 != 0);
            }
            if (decompiledFrameRemainder3) {
              if (param4.getUnitCategory(0) == 3) {
                this.field_z = bw.unitDefinitions[param4.unitType][1] + 8;
                decompiledFrameRemainder3 = (var9 != 0);
              }
              if (decompiledFrameRemainder3) {
                if (this.field_c != 81 &&
                  4 != this.field_c &&
                  this.field_c != 74) {
                  if (this.field_c != 67) {
                    if (this.field_c != 18) {
                      if (this.field_c == 28) {
                        this.field_z = 5;
                        decompiledFrameRemainder3 = (var9 != 0);
                      }
                      if ((decompiledFrameRemainder3) &&
                        (this.field_c == 3)) {
                        this.field_z = 6;
                        if (var9 != 0) {
                          this.field_z = 0;
                          this.field_z = 3;
                          this.field_z = 7;
                        }
                      }
                    } else {
                      this.field_z = 0;
                      if (var9 != 0) {
                        this.field_z = 3;
                        this.field_z = 7;
                      }
                    }
                  } else {
                    this.field_z = 3;
                    if (var9 != 0) {
                      this.field_z = 7;
                    }
                  }
                } else {
                  this.field_z = 7;
                }
              }
            }
            this.field_p = this.field_O - (-AttackEvent.a(false, this.field_y, vv.field_b) - this.field_y);
            this.field_D = new km[this.field_p];
            this.field_b = this.a(this.field_w, (byte) -127);
            this.phase = 5;
            if (var6_int == 0) {
              this.field_L = 8;
              if (var9 != 0) {
                this.field_L = 7;
              }
            } else {
              this.field_L = 7;
            }
          }
          boolean decompiledFrameCompleted7 = true;
          fn.a(this.field_d, this.field_c, -32596);
          fn.a(this.field_d, this.field_a, -32596);
          if ((param4.unitType == 7 ||
            param4.unitType == 34) && param4.packedFlag8) {
            this.attackers = new BattleCharacter[6];
            var8 = 0;
            while (var8 < this.field_y) {
              this.attackers[1 + var8] = new BattleCharacter(this.field_c, true, CampaignUnitOverride.field_d[var8], MoveEvent.field_F[var8], false, 0);
              var8++;
              if (var9 != 0) {
                decompiledFrameCompleted7 = false;
                break;
              }
            }
            if ((decompiledFrameCompleted7) &&
              (var9 != 0)) {
              this.attackers = new BattleCharacter[vu.field_N[this.field_J]];
            }
          } else {
            this.attackers = new BattleCharacter[vu.field_N[this.field_J]];
          }
          boolean decompiledFrameCompleted6 = true;
          boolean decompiledFrameRemainder2 = true;
          if (param1.unitType != 7 &&
            param1.unitType != 34 ||
            !param1.packedFlag8) {
            this.defenders = new BattleCharacter[vu.field_N[this.field_u]];
            decompiledFrameRemainder2 = (var9 != 0);
          }
          if (decompiledFrameRemainder2) {
            this.defenders = new BattleCharacter[6];
            var8 = 0;
            while (var8 < this.field_w) {
              this.defenders[var8 + 1] = new BattleCharacter(this.field_a, false, CampaignUnitOverride.field_d[var8], MoveEvent.field_F[var8], false, 0);
              var8++;
              if (var9 != 0) {
                decompiledFrameCompleted6 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted6) && (param1.unitType == 34 &&
            param1.packedFlag8)) {
            this.field_w = 1;
            if ((param1.strength + param1.bonusStrength) > param0) {
              stackIn_188_1 = 0;
            } else {
              stackIn_188_1 = 1;
            }
            this.field_O = stackIn_188_1;
            this.field_u = 2;
            this.field_a = 75;
            if (this.field_O == 1) {
              this.field_L = 2;
            }
            this.field_q = true;
          }
          if (34 == param4.unitType &&
            param4.packedFlag8) {
            this.field_y = 1;
            this.field_J = 2;
            this.field_c = 75;
            this.field_h = true;
          }
          boolean decompiledFrameCompleted3 = true;
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted4 = true;
          boolean decompiledFrameCompleted5 = true;
          if (!this.field_f) {
            var8 = 0;
            while (this.field_y > var8) {
              stackIn_236_0 = this.attackers;
              stackIn_236_1 = var8;
              if (var9 != 0) {
                decompiledFrameCompleted5 = false;
                break;
              }
              stackIn_207_2 = null;
              stackIn_207_3 = null;
              stackIn_207_4 = this.field_c;
              stackIn_207_5 = true;
              stackIn_207_6 = tn.field_W[this.field_J][var8];
              stackIn_207_7 = kw.field_P[this.field_J][var8];
              stackIn_207_8 = this.field_d;
              if (!this.field_d) {
                stackIn_209_9 = 1300;
                if (param3) {
                  stackIn_207_2Lifetime1 = null;
                  stackIn_207_3Lifetime1 = null;
                  stackIn_210_10 = false;
                } else {
                  stackIn_207_2Lifetime1 = null;
                  stackIn_207_3Lifetime1 = null;
                  stackIn_210_10 = true;
                }
                stackIn_211_2 = null;
                stackIn_211_3 = null;
                stackIn_211_9 = stackIn_209_9 + AttackEvent.a(stackIn_210_10, 700, vv.field_b);
              } else {
                stackIn_211_2 = null;
                stackIn_211_3 = null;
                stackIn_211_9 = 0;
              }
              stackIn_236_0[stackIn_236_1] = new BattleCharacter(stackIn_207_4, stackIn_207_5, stackIn_207_6, stackIn_207_7, stackIn_207_8, stackIn_211_9);
              var8++;
            }
            if (decompiledFrameCompleted5) {
              decompiledFrameRemainder0 = (var9 != 0);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted5)) {
            var8 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var8 >= this.field_y))) {
              stackIn_236_0 = this.attackers;
              stackIn_236_1 = var8;
              if (var9 != 0) {
                break;
              }
              stackIn_220_2 = null;
              stackIn_220_3 = null;
              stackIn_220_4 = this.field_c;
              stackIn_220_5 = true;
              stackIn_220_6 = tn.field_W[this.field_J][var8];
              stackIn_220_7 = kw.field_P[this.field_J][var8];
              stackIn_220_8 = this.field_d;
              if (!this.field_d) {
                stackIn_222_9 = 1300;
                if (param3) {
                  stackIn_220_2Lifetime1 = null;
                  stackIn_220_3Lifetime1 = null;
                  stackIn_223_10 = false;
                } else {
                  stackIn_220_2Lifetime1 = null;
                  stackIn_220_3Lifetime1 = null;
                  stackIn_223_10 = true;
                }
                stackIn_224_2 = null;
                stackIn_224_3 = null;
                stackIn_224_9 = stackIn_222_9 + AttackEvent.a(stackIn_223_10, 700, vv.field_b);
              } else {
                stackIn_224_2 = null;
                stackIn_224_3 = null;
                stackIn_224_9 = 0;
              }
              stackIn_236_0[stackIn_236_1] = new BattleCharacter(stackIn_220_4, stackIn_220_5, stackIn_220_6, stackIn_220_7, stackIn_220_8, stackIn_224_9);
              var8++;
            }
            if (decompiledNaturalLoopExit0) {
              decompiledFrameCompleted4 = false;
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted4)) {
            while (true) {
              stackIn_236_0[stackIn_236_1] = new BattleCharacter(this.field_a, false, tn.field_W[this.field_u][var8], kw.field_P[this.field_u][var8], this.field_d, 0);
              var8++;
              if (var9 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
              if (this.field_w <= var8) {
                decompiledFrameCompleted2 = false;
                break;
              }
              stackIn_236_0 = this.defenders;
              stackIn_236_1 = var8;
            }
          }
          if ((decompiledFrameCompleted3) &&
            (decompiledFrameCompleted2)) {
            if (!this.field_o) {
              var8 = 0;
              while (var8 < this.field_w) {
                this.defenders[var8] = new BattleCharacter(this.field_a, false, tn.field_W[this.field_u][var8], kw.field_P[this.field_u][var8], this.field_d, 0);
                var8++;
                if (var9 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted1) {
                decompiledFrameRemainder1 = (var9 != 0);
              }
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameCompleted1)) {
              var8 = 0;
              while (this.field_w > var8) {
                stackIn_236_0Lifetime1 = this.defenders;
                stackIn_236_1Lifetime1 = var8;
                stackIn_236_0Lifetime1[stackIn_236_1Lifetime1] = new BattleCharacter(this.field_a, false, tn.field_W[this.field_u][var8], kw.field_P[this.field_u][var8], this.field_d, 0);
                var8++;
                if (var9 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
          }
          if ((decompiledFrameCompleted3) &&
            (decompiledFrameCompleted0)) {
            if (this.field_u < this.field_J) {
              stackIn_244_1 = this.field_J;
            } else {
              stackIn_244_1 = this.field_u;
            }
            this.field_C = stackIn_244_1;
          }
          if (this.field_v == 0 &&
            this.field_O == 0 &&
            !this.field_d) {
            this.field_m = true;
          }
          if (this.field_d &&
            this.field_f) {
            this.phase = 6;
            this.h(1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_266_0 = var6;
          stackIn_266_1 = new StringBuilder().append("sk.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_267_2 = "null";
          } else {
            stackIn_267_2 = "{...}";
          }
          stackIn_270_1 = ((StringBuilder) (Object) stackIn_266_1).append(stackIn_267_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_271_2 = "null";
          } else {
            stackIn_271_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_266_0), ((StringBuilder) (Object) stackIn_270_1).append(stackIn_271_2).append(')').toString());
        }
    }

    CombatPresentation(Battlefield battlefield, BattleCamera camera, EventPresenter presenter) {
        RuntimeException runtimeException = null;
        um var4 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_I = 60;
        this.phaseFrame = 0;
        this.field_z = 1;
        try {
          this.presenter = presenter;
          this.battlefield = battlefield;
          if (this.battlefield != null) {
            this.mapWidth = battlefield.mapWidth;
            this.field_l = new int[2];
            this.battlefield = battlefield;
          }
          if (camera != null) {
            this.camera = camera;
            if (null != u.field_p) {
              u.field_p.camera = this.camera;
              if (ArmiesOfGielinor.obfuscationControl) {
                u.field_p = new CombatViewTransition(rs.field_k, se.field_a, camera);
              }
            } else {
              u.field_p = new CombatViewTransition(rs.field_k, se.field_a, camera);
            }
          }
          this.framebuffer = new RgbSprite(640, 480);
          var4 = cb.field_a[AttackEvent.a(false, cb.field_a.length, vv.field_b)];
          hh.a(-16147, 50, var4, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_17_0 = runtimeException;
          stackIn_17_1 = new StringBuilder().append("sk.<init>(");
          if (battlefield == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (camera == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (presenter == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
        field_N = "Yes";
    }
}
