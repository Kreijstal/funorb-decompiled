/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends IntrusiveNode {
    Unit field_l;
    static String field_w;
    int field_u;
    jb field_k;
    static boolean[] field_q;
    private float field_p;
    private int field_y;
    static String[] field_z;
    Unit field_o;
    static int field_s;
    private float field_x;
    int field_n;
    static boolean field_t;
    AiPlanner field_r;
    private float field_v;
    int field_m;

    private final Unit e(int param0) {
        if (this.field_k == null) {
          return null;
        }
        if (param0 != -8786) {
          return (Unit) null;
        }
        Object var2 = null;
        if (this.field_k.g(81)) {
          var2 = this.field_r.battlefield.getUnitAt(this.field_k.field_o, true, this.field_k.field_k);
        }
        return (Unit) (var2);
    }

    private final float a(int param0, int param1, boolean param2, MovementPlanner param3) {
        float stackIn_10_0 = 0.0f;
        int stackIn_17_0 = 0;
        float stackIn_26_0 = 0.0f;
        float stackIn_32_0 = 0.0f;
        float stackIn_41_0 = 0.0f;
        int stackIn_46_0 = 0;
        float stackIn_88_0 = 0.0f;
        float stackIn_96_0 = 0.0f;
        int stackIn_97_1 = 0;
        int stackIn_146_0 = 0;
        float stackIn_218_0 = 0.0f;
        float stackIn_231_0 = 0.0f;
        RuntimeException stackIn_234_0 = null;
        StringBuilder stackIn_234_1 = null;
        String stackIn_235_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        float var6 = 0.0f;
        Battlefield var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        MapTile var12 = null;
        Object var13 = null;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        int var17_int = 0;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19_int = 0;
        float var19 = 0.0f;
        int var20_int = 0;
        float var20 = 0.0f;
        int var21_int = 0;
        float var21 = 0.0f;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        float var25 = 0.0f;
        int var25_int = 0;
        int var26_int = 0;
        float var26 = 0.0f;
        float var27 = 0.0f;
        int var27_int = 0;
        float var28 = 0.0f;
        int var29 = 0;
        int var30 = 0;
        float var6Lifetime1;
        float var14Lifetime1;
        float var15Lifetime1;
        float var18Lifetime1;
        float var19Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var24Lifetime2;
        float var27Lifetime1;
        int var27_intLifetime1;
        var29 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5_int = 1000000;
          if (param1 != -5) {
            this.g(-12);
          }
          var6 = -3.4028234663852886e+38f;
          var7 = this.field_r.battlefield;
          var8 = param0 % var7.mapWidth;
          var9 = param0 / var7.mapWidth;
          if (this == this.field_r.field_J &&
            this.field_r.field_N[param0] != -3.4028234663852886e+38f) {
            var6Lifetime1 = this.field_r.field_N[param0];
          } else {
            var10 = this.field_o.tileX + var7.mapWidth * this.field_o.tileY;
            if (this.field_o.packedFlag256 &&
              param0 == var10) {
              stackIn_10_0 = -3.4028234663852886e+38f;
              return stackIn_10_0;
            }
            if (param3.movementCosts[param0] > param3.getMovementBudget(param1 + 27737)) {
              stackIn_17_0 = (var10 != param0) ? 1 : 0;
            } else {
              stackIn_17_0 = 0;
            }
            var11 = stackIn_17_0;
            var12 = var7.tiles[param0];
            if (var11 == 0 &&
              this.field_o.hasMovementFlag1(false) &&
              var10 != param0 &&
              this.field_o.objectiveId == 0 &&
              this.field_o.strength >= this.field_o.maximumStrength) {
              var11 = 1;
            }
            param3.selectTarget(var9, false, var8, (byte) 93);
            if ((4 & param3.field_e[param0]) == 0 &&
              var11 != 0) {
              stackIn_26_0 = -3.4028234663852886e+38f;
              return stackIn_26_0;
            }
            if (!param3.actionAllowed && (var8 != this.field_o.tileX ||
              var9 != this.field_o.tileY)) {
              stackIn_32_0 = -3.4028234663852886e+38f;
              return stackIn_32_0;
            }
            var13 = var12.occupant;
            if (var13 == this.field_o) {
              var13 = null;
            }
            var14 = 0.0f;
            var15 = 0.0f;
            var6Lifetime1 = 0.0f;
            var16 = 0.0f;
            if (var13 != null) {
              if ((param3.field_e[param0] & 4) == 0) {
                stackIn_41_0 = -3.4028234663852886e+38f;
                return stackIn_41_0;
              }
              if (0.0f != this.field_x) {
                var17_int = 1000000;
                var18 = -3.4028234663852886e+38f;
                stackIn_46_0 = (bw.unitDefinitions[this.field_o.unitType][0] != 4) ? 0 : 1;
                var19_int = stackIn_46_0;
                var20_int = this.field_o.getMaximumAttackRange(3257);
                var21_int = this.field_o.getMinimumAttackRange((byte) -79);
                for (var22 = -var20_int; var22 <= var20_int; var22++) {
                  for (var23 = -var20_int; var20_int >= var23; var23++) {
                    var24 = Math.abs(var22) + Math.abs(var23);
                    if (var24 >= var21_int &&
                      var20_int >= var24 &&
                      this.field_r.field_m.a(var8, -42, var19_int != 0, var23, var22, var9)) {
                      var26_int = var23 + var8 + var7.mapWidth * (var22 + var9);
                      if (var7.tiles[var26_int].occupant == null ||
                        var7.tiles[var26_int].occupant == this.field_o) {
                        var27 = this.a(param0, var8 + var23, var9 + var22, param1 ^ -2);
                        if (var27 != -3.4028234663852886e+38f) {
                          if ((var12.terrainType == 11 ||
                            var12.terrainType == 7) &&
                            var12.isAlliedToPlayer(this.field_r.field_z, (byte) 91)) {
                            if (var27 < 1.0f) {
                              var27 = 1.0f;
                            }
                            var27 = var27 * this.field_r.field_P[39];
                          }
                          if (this.field_v != 0.0f &&
                            var12.a(false)) {
                            var27 = var27 * this.field_v;
                          } else {
                            var27 = var27 * this.field_x;
                          }
                          var28 = this.a(var26_int, -5, false, param3);
                          if (var28 != -3.4028234663852886e+38f) {
                            var27 = var28 + var27;
                            if (var18 < var27) {
                              var17_int = var26_int;
                              var18 = var27;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if (1000000 == var17_int) {
                  stackIn_88_0 = -3.4028234663852886e+38f;
                  return stackIn_88_0;
                }
                var5_int = var17_int;
                var16 = var18;
                var6Lifetime1 = var6Lifetime1 + var16;
              }
            }
            if (var13 == null &&
              var12.isAlliedToPlayer(this.field_r.field_z, (byte) 91) &&
              11 != var12.terrainType) {
              stackIn_96_0 = var6Lifetime1;
              if (var12.terrainType != 7) {
                stackIn_97_1 = 1;
              } else {
                stackIn_97_1 = 2;
              }
              var6Lifetime1 = stackIn_96_0 + (float)stackIn_97_1 * ((float)(-this.field_o.strength + this.field_o.maximumStrength) * this.field_r.field_P[12]);
            }
            if (var10 == param0 &&
              !this.field_o.a(23072)) {
              var6Lifetime1 = var6Lifetime1 + (float)(-this.field_o.strength + this.field_o.maximumStrength) * this.field_r.field_P[12];
            }
            if ((var12.terrainType == 11 ||
              var12.terrainType == 7) &&
              (var12.isAlliedToPlayer(this.field_r.field_z, (byte) 91) &&
              this.field_r.field_P[53] < (float)var7.playerMana[this.field_r.field_z])) {
              var6Lifetime1 = var6Lifetime1 - this.field_r.field_P[52] * (float)var7.playerMana[this.field_r.field_z];
            }
            var17 = 0.0f;
            var18Lifetime1 = 0.0f;
            var19 = 0.0f;
            var20 = 0.0f;
            var21 = 0.0f;
            var22Lifetime1 = this.field_o.getUnitCategory(param1 ^ -5);
            var23Lifetime1 = this.field_o.getUnitCategory(param1 + 5);
            for (var24Lifetime1 = 0; var24Lifetime1 < 8; var24Lifetime1++) {
              if (1 != var24Lifetime1 &&
                0 != var24Lifetime1 ||
                var22Lifetime1 != 4) {
                var17 = var17 + (float)fk.field_d[var24Lifetime1][var22Lifetime1] * this.field_r.field_K[var24Lifetime1][param0] / 100.0f;
              }
              if (var24Lifetime1 != 4 ||
                this.field_o.j((byte) 92)) {
                var18Lifetime1 = var18Lifetime1 + (float)fk.field_d[var22Lifetime1][var24Lifetime1] * this.field_r.field_n[var23Lifetime1][var24Lifetime1][param0] / 100.0f;
              }
              var30 = 0;
              var25_int = var30;
              while (8 > var30) {
                var20 = var20 + this.field_r.field_A[var30][param0] * this.field_r.field_K[var24Lifetime1][param0] * (float)fk.field_d[var30][var24Lifetime1] / 100.0f;
                var30++;
              }
              var21 = var21 + this.field_r.field_K[var24Lifetime1][param0];
            }
            var19Lifetime1 = this.field_r.field_A[8][param0];
            var20 = var20 / (1.0f + var21);
            if (0.0f == var16 &&
              this.field_v != 0.0f) {
              var15Lifetime1 = this.field_r.field_P[6] * this.field_r.field_n[var23Lifetime1][9][param0];
              if (this.field_o.ownerPlayer != var12.ownerPlayer &&
                var12.a(false)) {
                var15Lifetime1 = var15Lifetime1 * this.field_r.field_P[41];
              }
              var15Lifetime1 = var15Lifetime1 + this.field_r.field_P[46] * var20;
              var15Lifetime1 = var15Lifetime1 - this.field_r.field_P[7] * var17;
              var15Lifetime1 = var15Lifetime1 - var19Lifetime1 * this.field_r.field_P[8];
              if (var12.a(false) &&
                this.field_o.tileX == var8 &&
                var9 == this.field_o.tileY &&
                var12.field_m < this.field_o.getEffectiveStrength((byte) 122) * 4 &&
                var12.ownerPlayer != this.field_o.ownerPlayer) {
                var15Lifetime1 = var15Lifetime1 + 999999.0f;
              }
              var6Lifetime1 = var6Lifetime1 + var15Lifetime1 * this.field_v;
            }
            if (this.field_o.u(8)) {
              stackIn_146_0 = (this.field_o.objectiveId == 0) ? 1 : 0;
            } else {
              stackIn_146_0 = 0;
            }
            var24Lifetime2 = stackIn_146_0;
            if (var16 == 0.0f && (var24Lifetime2 == 0 ||
              !param2)) {
              var25 = this.field_r.field_n[var23Lifetime1][9][param0];
              if (0.0f == this.field_v &&
                !this.field_o.hasMovementFlag1(false)) {
                var25 = var25 - this.field_r.field_V[param0];
              }
              if (this.field_o.objectiveId != 0) {
                var25 = var25 * this.field_r.field_P[60];
              }
              var14Lifetime1 = this.field_r.field_P[4] * var25;
              var14Lifetime1 = var14Lifetime1 + var18Lifetime1 * this.field_r.field_P[5];
              var26 = 1.0f;
              if (this.field_o.i(-21428)) {
                var26 = var26 * this.field_r.field_P[58];
              }
              if (this.field_o.hasMovementFlag1(false)) {
                var26 = var26 * this.field_r.field_P[49];
              }
              var14Lifetime1 = var14Lifetime1 - var26 * (var17 * this.field_r.field_P[40]);
              if (this.field_o.hasMovementFlag1(false)) {
                var14Lifetime1 = var14Lifetime1 + var20 * this.field_r.field_P[57];
              }
              if (!this.field_o.i(-21428) &&
                var12.a(false) &&
                this.field_r.field_z != var12.ownerPlayer) {
                var14Lifetime1 = var14Lifetime1 - this.field_r.field_P[38] * var19Lifetime1;
              }
              if (this.field_o.f((byte) -109)) {
                var27_int = 0;
                if (0 < var8 &&
                  var7.tiles[-1 + param0].hasCorpse(-58)) {
                  var27_int++;
                }
                if (var7.mapWidth - 1 > var8 &&
                  var7.tiles[param0 + 1].hasCorpse(117)) {
                  var27_int++;
                }
                if (var9 > 0 &&
                  var7.tiles[param0 - var7.mapWidth].hasCorpse(param1 ^ 79)) {
                  var27_int++;
                }
                if (var9 < -1 + var7.mapHeight &&
                  var7.tiles[var7.mapWidth + param0].hasCorpse(-117)) {
                  var27_int++;
                }
                var14Lifetime1 = var14Lifetime1 + this.field_r.field_P[10] * (float)var27_int;
              }
              if (this.field_o.p((byte) -107) ||
                this.field_o.d((byte) 105)) {
                var27_intLifetime1 = 0;
                if (var10 != param0 - 1 &&
                  var8 > 0 &&
                  null != var7.tiles[param0 - 1].occupant &&
                  this.field_o.ownerPlayer == var7.tiles[-1 + param0].occupant.ownerPlayer) {
                  var27_intLifetime1++;
                }
                if (var10 != 1 + param0 &&
                  var8 < var7.mapWidth - 1 &&
                  null != var7.tiles[1 + param0].occupant &&
                  this.field_o.ownerPlayer == var7.tiles[param0 + 1].occupant.ownerPlayer) {
                  var27_intLifetime1++;
                }
                if (-var7.mapWidth + param0 != var10 &&
                  var9 > 0 &&
                  null != var7.tiles[-var7.mapWidth + param0].occupant &&
                  var7.tiles[-var7.mapWidth + param0].occupant.ownerPlayer == this.field_o.ownerPlayer) {
                  var27_intLifetime1++;
                }
                if (var10 != param0 + var7.mapWidth &&
                  var9 < -1 + var7.mapHeight &&
                  null != var7.tiles[var7.mapWidth + param0].occupant &&
                  var7.tiles[var7.mapWidth + param0].occupant.ownerPlayer == this.field_o.ownerPlayer) {
                  var27_intLifetime1++;
                }
                var14Lifetime1 = var14Lifetime1 + (float)var27_intLifetime1 * this.field_r.field_P[11];
              }
              if (this.field_o.s(124) &&
                var7.tiles[param0].hasCorpse(81)) {
                var14Lifetime1 = var14Lifetime1 + this.field_r.field_P[51];
              }
              if (0 != this.field_o.objectiveId) {
                if (!this.field_o.hasMovementFlag1(false)) {
                  stackIn_218_0 = 1.0f;
                } else {
                  stackIn_218_0 = this.field_r.field_P[48];
                }
                var27Lifetime1 = stackIn_218_0;
                var14Lifetime1 = var14Lifetime1 + this.field_r.field_I[this.field_o.getUnitCategory(0)][this.field_o.objectiveId - 1][param0] * var27Lifetime1;
              }
              var6Lifetime1 = var6Lifetime1 + var14Lifetime1 * this.field_p;
            }
            if (param0 == var10) {
              var6Lifetime1 = var6Lifetime1 + 0.0010000000474974513f;
            }
            if (this == this.field_r.field_J) {
              this.field_r.field_N[param0] = var6Lifetime1;
            }
          }
          if (param2) {
            if (var5_int == 1000000) {
              if (var6Lifetime1 != 0.0f) {
                this.field_r.a(this, (byte) 85).a(var9, var8, param1 ^ 104, var6Lifetime1);
              }
            } else {
              this.field_r.a(this, (byte) -88).a(var5_int / var7.mapWidth, var8, var5_int % var7.mapWidth, -120, var6Lifetime1, var9);
            }
          }
          stackIn_231_0 = var6Lifetime1;
          return stackIn_231_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_234_0 = var5;
          stackIn_234_1 = new StringBuilder().append("cl.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_235_2 = "null";
          } else {
            stackIn_235_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_234_0), ((StringBuilder) (Object) stackIn_234_1).append(stackIn_235_2).append(')').toString());
        }
    }

    final float a(boolean param0, byte param1) {
        Unit discarded$0 = null;
        MovementPlanner stackIn_7_0 = null;
        float[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        float stackIn_28_2 = 0.0f;
        MovementPlanner var3;
        sm var4;
        float var5;
        int var6;
        float var7;
        int var8;
        MovementPlanner var9;
        int var6Lifetime1;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 &&
          this.field_o.movementSpent &&
          this.field_o.attacksRemaining <= 0) {
          return -3.4028234663852886e+38f;
        }
        if (param0) {
          stackIn_7_0 = this.field_r.field_U;
        } else {
          stackIn_7_0 = this.field_r.field_l;
        }
        var9 = stackIn_7_0;
        var3 = var9;
        if (param1 >= -122) {
          discarded$0 = this.e(-4);
        }
        var4 = this.field_r.a(this, (byte) 86);
        if (param0) {
          var4.b((byte) 72);
        }
        var9.prepareForUnit(false, 20, this.field_o.ownerPlayer, this.field_o, -1, -1);
        if (this.field_r.field_J == this) {
          for (var6 = 0; this.field_r.field_N.length > var6; var6++) {
            this.field_r.field_N[var6] = -3.4028234663852886e+38f;
          }
        }
        var5 = -3.4028234663852886e+38f;
        for (var6Lifetime1 = 0; var9.movementCosts.length > var6Lifetime1; var6Lifetime1++) {
          if (!param0) {
            fs.field_b[var6Lifetime1] = 0.0f;
          }
          var7 = this.a(var6Lifetime1, -5, param0, var9);
          if (var5 < var7) {
            var5 = var7;
          }
          if (!param0) {
            stackIn_27_0 = fs.field_b;
            stackIn_27_1 = var6Lifetime1;
            if (-3.4028234663852886e+38f != var7) {
              stackIn_28_2 = var7;
            } else {
              stackIn_28_2 = -1.0f;
            }
            stackIn_27_0[stackIn_27_1] = stackIn_28_2;
          }
        }
        if (!param0) {
          var9.clearSelection(-57);
        } else {
          this.field_k = var4.a((byte) -90);
          this.field_l = this.e(-8786);
          if (null == this.field_k ||
            this.field_k.field_r == -2) {
            var5 = -3.4028234663852886e+38f;
          }
        }
        return var5;
    }

    private final int a(byte param0, boolean param1) {
        int var5 = 0;
        int[] var4;
        int var7;
        MovementPlanner var8;
        int[] var9;
        int[] var10;
        int[] stackIn_3_0 = null;
        MapTile var6;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var8 = this.field_r.field_U;
        if (param1) {
          stackIn_3_0 = var8.movementCosts;
        } else {
          stackIn_3_0 = var8.field_k;
        }
        var10 = stackIn_3_0;
        var9 = var10;
        var4 = var9;
        if (param0 <= 14) {
          this.field_x = 1.991025686264038f;
        }
        for (var5 = 0; var5 < var8.movementCosts.length; var5++) {
          if (0 < var10[var5] &&
            var10[var5] <= var8.getMovementBudget(27732)) {
            var6 = this.field_r.battlefield.tiles[var5];
            if (var6.a(false) &&
              !var6.isAlliedToPlayer(this.field_r.field_z, (byte) 91) && (null == var6.occupant ||
              !param1 &&
              this.field_r.field_z == var6.occupant.ownerPlayer)) {
              return var5;
            }
          }
        }
        return 1000000;
    }

    final static void b(int param0, int param1) {
        CipherPacketBuffer var2 = vl.field_n;
        var2.h(param0 ^ 32164, param1);
        var2.position = var2.position + 1;
        int var3 = var2.position;
        var2.b(1, param0);
        var2.b(1, vu.field_M.field_nc);
        int var4 = (vu.field_M.field_ac << 6) + vu.field_M.field_Tb;
        var2.b(1, var4);
        var2.a(vu.field_M.field_pc, 0, vu.field_M.field_pc.length, -38);
        var2.e(var2.position - var3, param0 ^ 5935);
    }

    public static void a(int param0) {
        field_q = null;
        field_z = null;
        field_w = null;
        if (param0 != -31116) {
          field_w = (String) null;
        }
    }

    final boolean a(byte param0, cl param1) {
        RuntimeException var3 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return false;
          }
          if (param1.field_y > this.field_y) {
            return true;
          }
          if (this.field_y == param1.field_y) {
            stackIn_10_0 = !(param1.field_o.tileX + param1.field_o.tileY >= this.field_o.tileX + this.field_o.tileY);
            return stackIn_10_0;
          }
          if (param0 < -78) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("cl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void a(byte param0) {
        MovementPlanner var2 = this.field_r.field_U;
        var2.prepareForUnit(false, 81, this.field_r.field_z, this.field_o, -1, -1);
        if (param0 <= 23) {
          this.field_y = -31;
        }
    }

    private final void c(int param0, int param1) {
        int var4 = 0 / ((param1 - 80) / 41);
        int var3 = param0 % this.field_r.battlefield.mapWidth;
        int var5 = param0 / this.field_r.battlefield.mapWidth;
        float var6 = this.field_r.field_P[54] * this.field_r.field_n[0][9][param0];
        this.field_r.field_m.a(this.field_r.field_V, true, var6, 0, (byte) -4, 9, var5, var3);
        this.field_r.field_m.a(this.field_r.field_V, true, var6, 0, (byte) -4, 9, this.field_o.tileY, this.field_o.tileX);
    }

    final void g(int param0) {
        if (null != this.field_k &&
          this.field_k.field_r != -2) {
          this.field_k.a((byte) 5, this.field_r);
        }
        if (param0 != 4) {
          return;
        }
        this.field_r.field_U.clearSelection(param0 - 34);
    }

    final void f(int param0) {
        int var2;
        int var3;
        MapTile var4;
        int var2Lifetime1;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.field_o.movementSpent) {
          return;
        }
        if (this.field_o.i(-21428)) {
          this.field_v = this.field_r.field_P[33];
          this.field_x = this.field_r.field_P[34];
          this.field_p = this.field_r.field_P[35];
        } else {
          this.field_v = 0.0f;
          this.field_x = this.field_r.field_P[36];
          this.field_p = this.field_r.field_P[37];
        }
        this.field_y = 100;
        if (!this.field_o.i(-21428)) {
          if (this.field_o.getUnitCategory(0) == 5) {
            this.field_y = 10;
          }
          if (2 == this.field_o.getUnitCategory(0) ||
            3 == this.field_o.getUnitCategory(0)) {
            this.field_y = 200;
          }
        } else {
          this.field_y = 50;
          this.a((byte) 67);
          if (this.a((byte) 124, true) != 1000000) {
            this.field_y = 300;
          } else {
            var2 = this.a((byte) 125, false);
            if (var2 != 1000000) {
              this.c(var2, 122);
              this.field_y = 1;
            }
          }
        }
        if (this.field_o.hasMovementFlag1(false)) {
          this.field_y = this.field_y - 300;
        }
        if (this.field_o.objectiveId != 0) {
          var4 = this.field_r.battlefield.tiles[this.field_r.battlefield.mapWidth * this.field_o.tileY + this.field_o.tileX];
          if (var4.getTag((byte) -107) == this.field_o.objectiveId) {
            this.field_o.objectiveId = 0;
          }
        }
        var2Lifetime1 = -97 % ((param0 + 13) / 63);
        if (this.field_o.objectiveId != 0) {
          this.field_y = this.field_y + 300;
        }
        if (this.field_o.packedFlag256) {
          this.field_y = this.field_y + 500;
        }
        this.field_y = this.field_y + this.field_o.getEffectiveStrength((byte) 122);
    }

    private final float a(int param0, int param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        float stackIn_30_0 = 0.0f;
        float stackIn_33_0 = 0.0f;
        float stackIn_36_0 = 0.0f;
        float var5;
        Battlefield var6;
        int var7;
        int var8;
        MapTile var9;
        Unit var10;
        int var11;
        int var12;
        int var13;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        float var21;
        int[] var25;
        float var21Lifetime1;
        float var21Lifetime2;
        float var21Lifetime3;
        float var21Lifetime4;
        var5 = 0.0f;
        var6 = this.field_r.battlefield;
        var7 = param0 % var6.mapWidth;
        var8 = param0 / var6.mapWidth;
        var9 = var6.tiles[param0];
        var10 = var9.occupant;
        var11 = -param1 + var7;
        var12 = var8 - param2;
        stackIn_3_0 = (Math.abs(var11) + Math.abs(var12) != 1) ? 0 : 1;
        var13 = stackIn_3_0;
        var25 = var6.a(var10, param2, (byte) -123, var12, this.field_o, var11, param1);
        var15 = var25[0];
        var16 = var25[1];
        var17 = 0;
        if (var10.getEffectiveStrength((byte) 122) < var15) {
          var15 = var10.getEffectiveStrength((byte) 122);
        }
        var18 = 0;
        if (this.field_o.meleeLifeSteal &&
          var13 != 0) {
          var17 = var15;
          if (var17 > -this.field_o.strength + this.field_o.maximumStrength) {
            var17 = -this.field_o.strength + this.field_o.maximumStrength;
          }
        }
        if (this.field_o.getEffectiveStrength((byte) 122) + var17 < var16) {
          var16 = var17 + this.field_o.getEffectiveStrength((byte) 122);
        }
        if ((2 & var25[2]) == 0) {
          if (var10.meleeLifeSteal &&
            var13 != 0) {
            var18 = var16;
            if (-var10.strength + var10.maximumStrength < var18) {
              var18 = -var10.strength + var10.maximumStrength;
            }
          }
          if (0 != (var25[2] & 1)) {
            var18++;
          }
        } else {
          var16 = 0;
          var17++;
        }
        if (this.field_o.a(var10, (byte) 115) &&
          !var10.x(-99)) {
          var17 = 0;
          var18 = 0;
          var15 = var10.getEffectiveStrength((byte) 122);
          var16 = 0;
        }
        var19 = var15 - var18;
        var20 = var16 - var17;
        if (!var10.hasMovementFlag1(false)) {
          stackIn_30_0 = 1.0f;
        } else {
          stackIn_30_0 = this.field_r.field_P[61];
        }
        var21 = stackIn_30_0;
        var5 = var5 + (float)var19 * this.field_r.field_P[0] * var21;
        if (!this.field_o.hasMovementFlag1(false)) {
          stackIn_33_0 = 1.0f;
        } else {
          var21Lifetime1 = this.field_r.field_P[48];
          stackIn_33_0 = var21Lifetime1;
        }
        var21Lifetime2 = stackIn_33_0;
        var5 = var5 - (float)var20 * this.field_r.field_P[1] * var21Lifetime2;
        if (var9.hasModifierFlag1(12)) {
          var21Lifetime3 = this.field_r.field_P[50];
          stackIn_36_0 = var21Lifetime3;
        } else {
          stackIn_36_0 = 1.0f;
        }
        var21Lifetime4 = stackIn_36_0;
        var5 = var5 + this.field_r.field_P[2] * var21Lifetime4 * this.field_r.field_n[0][9][param0];
        if (0 != (var25[2] & 1) &&
          !var10.hasMovementFlag1(false)) {
          var5 = var5 - this.field_r.field_P[32];
        }
        if (var10.a(23072)) {
          var5 = var5 * this.field_r.field_P[47];
        }
        if (var10.getUnitCategory(0) == param3) {
          var5 = var5 * this.field_r.field_P[31];
        }
        if (var10.i(-21428)) {
          var5 = var5 * this.field_r.field_P[30];
          if (var6.tiles[param0].a(false) &&
            var6.tiles[param0].ownerPlayer != var10.ownerPlayer) {
            var5 = var5 * this.field_r.field_P[30];
          }
        }
        if ((var25[2] & 1) != 0 &&
          1 >= var25[0]) {
          return -3.4028234663852886e+38f;
        }
        return var5;
    }

    cl(AiPlanner param0, Unit param1) {
        try {
          this.field_r = param0;
          this.field_o = param1;
          this.field_o.field_p = this;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "cl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_z = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_w = "Leaders cannot carry a ring of life.";
    }
}
