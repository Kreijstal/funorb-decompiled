/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BattleTerrain {
    int[] field_h;
    int[] groundHeightProfile;
    int[] field_j;
    int profileLength;
    static String field_g;
    static RgbSprite field_k;
    static int field_i;
    int field_c;
    private int field_l;
    int[] spawnPositions;
    private int terrainType;
    static SceneWidget field_q;
    static int field_a;
    int[] secondaryHeightProfile;
    private int field_p;
    static String field_d;
    int[] surfaceProfile;

    final static boolean b(int param0, int param1, int param2) {
        int stackIn_7_0 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          if (param0 != -3) {
            BattleTerrain.c(-107);
          }
          stackIn_7_0 = (null == ni.field_a) ? 0 : 1;
          var3_int = stackIn_7_0;
          if (ei.field_q == 9 &&
            vk.a(se.field_b, pa.field_h, f.field_x, dh.field_B, -21)) {
            if (dh.field_B != 2 &&
              var3_int != 0) {
              return false;
            }
            stackIn_20_0 = dl.a(se.field_b, pa.field_h, param0 - 119, dh.field_B, f.field_x);
            return stackIn_20_0;
          }
          if (ei.field_q == 10) {
            if (var3_int != 0) {
              return false;
            }
            pd.j(13171);
            return true;
          }
          if (ei.field_q == 11 &&
            ob.field_v) {
            if (hk.field_ic == 2 &&
              !qm.a((byte) -31, CachedArchiveProvider.field_t, kh.field_q)) {
              return false;
            }
            if (hk.field_ic != 2 &&
              var3_int != 0) {
              return false;
            }
            if (NodeDeque.e((byte) 17)) {
              oe.a(param2, CachedArchiveProvider.field_t, -6988, hk.field_ic, wn.field_f, (String) null);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "hd.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int getTerrainType(int obfuscationGuard) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > 44) {
            stackIn_4_0 = this.terrainType;
            return stackIn_4_0;
          }
          stackIn_2_0 = 59;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "hd.I(" + obfuscationGuard + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int stackIn_104_3 = 0;
        int[] stackIn_107_0;
        int stackIn_107_1;
        int stackIn_107_2;
        int stackIn_107_3;
        int stackIn_108_4 = 0;
        int[] stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        int stackIn_110_2 = 0;
        int stackIn_112_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        int stackIn_184_0 = 0;
        int stackIn_184_1 = 0;
        int stackIn_203_0 = 0;
        int stackIn_203_1 = 0;
        int stackIn_225_0 = 0;
        int stackIn_225_1 = 0;
        int stackIn_242_0 = 0;
        int stackIn_242_1 = 0;
        int stackIn_245_0 = 0;
        int stackIn_272_0 = 0;
        int stackIn_272_1 = 0;
        int stackIn_283_0 = 0;
        int stackIn_304_0 = 0;
        int stackIn_304_1 = 0;
        int stackIn_316_0 = 0;
        int stackIn_318_0 = 0;
        int stackIn_322_0 = 0;
        int stackIn_322_1 = 0;
        int stackIn_347_0 = 0;
        int stackIn_347_1 = 0;
        int stackIn_353_0 = 0;
        int stackIn_355_0 = 0;
        int stackIn_355_1 = 0;
        int stackIn_378_0 = 0;
        int stackIn_397_0 = 0;
        int stackIn_397_1 = 0;
        int stackIn_419_0 = 0;
        int stackIn_419_1 = 0;
        int stackIn_421_0 = 0;
        int stackIn_421_1 = 0;
        int stackIn_463_0 = 0;
        int stackIn_463_1 = 0;
        int stackIn_465_0 = 0;
        int stackIn_465_1 = 0;
        int stackIn_476_0 = 0;
        int stackIn_502_0 = 0;
        int stackIn_515_0 = 0;
        int stackIn_515_1 = 0;
        int stackIn_528_0 = 0;
        int stackIn_539_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        IsaacRandom var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8_ref_int__ = null;
        int var8 = 0;
        int[] var9_ref_int__ = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var11_ref_int__ = null;
        int var12 = 0;
        int var13 = 0;
        int[] var13_ref_int__ = null;
        int var14 = 0;
        RgbSprite var14_ref_wk = null;
        int var15_int = 0;
        int[] var15 = null;
        RgbSprite var15_ref = null;
        int var16 = 0;
        RgbSprite var16_ref_wk = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int[] stackIn_110_0Lifetime1;
        RgbSprite var16_ref_wkLifetime1;
        RgbSprite var16_ref_wkLifetime2;
        int stackIn_110_1Lifetime1;
        int stackIn_110_2Lifetime1;
        int stackIn_203_0Lifetime1;
        int stackIn_203_1Lifetime1;
        int stackIn_225_0Lifetime1;
        int stackIn_225_1Lifetime1;
        int stackIn_272_0Lifetime1;
        int stackIn_272_1Lifetime1;
        int stackIn_283_0Lifetime1;
        int stackIn_304_0Lifetime1;
        int stackIn_304_1Lifetime1;
        int stackIn_347_0Lifetime1;
        int stackIn_347_1Lifetime1;
        int stackIn_355_0Lifetime1;
        int stackIn_355_1Lifetime1;
        int stackIn_378_0Lifetime1;
        int stackIn_419_0Lifetime1;
        int stackIn_419_1Lifetime1;
        int stackIn_463_0Lifetime1;
        int stackIn_463_1Lifetime1;
        int stackIn_476_0Lifetime1;
        int stackIn_502_0Lifetime1;
        int stackIn_515_0Lifetime1;
        int stackIn_515_1Lifetime1;
        int stackIn_528_0Lifetime1;
        int stackIn_539_0Lifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19Lifetime1;
        int var20Lifetime1;
        int var17Lifetime3;
        int var18Lifetime3;
        int var19Lifetime2;
        int var17Lifetime2Lifetime1;
        int var17Lifetime2Lifetime2;
        int var18Lifetime2Lifetime1;
        int var19Lifetime1Lifetime1;
        var22 = SteelSentinels.obfuscationControl;
        try {
          this.field_p = 100;
          this.field_c = 0;
          this.spawnPositions = new int[this.field_p];
          this.field_l = param2;
          this.field_l = this.field_l & -9;
          this.terrainType = this.field_l % 8;
          if (this.terrainType == 5) {
            this.terrainType = 0;
          }
          if (-1 == this.field_l) {
            this.terrainType = 0;
          }
          var4_int = 20000;
          var4_int = 8000;
          if (param1 > 2) {
            var4_int = 16000;
          }
          if (param0 != 1200) {
            this.getProfileLength(4);
          }
          if (param1 >= 6) {
            var4_int = 24000;
          }
          if (12 <= param1) {
            var4_int = 32000;
          }
          var4_int = (32000 + var4_int) / 2;
          if (this.terrainType == 0) {
            var4_int += 4000;
          }
          if (this.terrainType == 4) {
            var4_int = 32000;
          }
          if (param2 == -1) {
            var4_int = 6528;
          }
          if (10 == di.field_g) {
            var4_int = ua.field_t[ol.field_Ub + ge.field_j * 10][2];
          }
          this.profileLength = 15;
          this.groundHeightProfile = new int[this.profileLength];
          this.secondaryHeightProfile = new int[this.profileLength];
          var5 = new IsaacRandom(new int[]{this.field_l, -2});
          var6 = 0;
          do {
            if (var6 >= 15) {
              if (this.field_l == 16) {
                var4_int = ua.field_t[ol.field_Ub + ge.field_j * 10][2];
              }
              SentinelCommand.field_o = 0;
              ge.field_l = 0;
              fk.field_c = false;
              he.field_k = 0;
              hb.field_f = false;
              break;
            }
            this.secondaryHeightProfile[var6] = 128 + var5.nextIntBounded(38, 60 * var4_int / 640);
            this.groundHeightProfile[var6] = var5.nextIntBounded(47, var4_int * 60 / 640) + 128;
            var6++;
          } while (var22 == 0);
          boolean decompiledFrameRemainder1 = true;
          if (this.field_l == 16) {
            if (di.field_g == 1 &&
              qh.field_Yb >= 10) {
              this.groundHeightProfile[0] = 3000;
              this.groundHeightProfile[1] = 1000;
              this.secondaryHeightProfile[0] = 4300;
              this.groundHeightProfile[7] = 2000;
              this.groundHeightProfile[6] = 1200;
              this.groundHeightProfile[3] = 900;
              this.secondaryHeightProfile[1] = 4000;
              this.groundHeightProfile[8] = 2400;
              this.groundHeightProfile[5] = 900;
              this.groundHeightProfile[2] = 1200;
              this.groundHeightProfile[9] = 1600;
              this.groundHeightProfile[4] = 1100;
              this.groundHeightProfile[10] = 1200;
              this.secondaryHeightProfile[9] = 5000;
              this.groundHeightProfile[12] = 900;
              this.groundHeightProfile[11] = 1000;
              this.secondaryHeightProfile[10] = 2500;
              this.groundHeightProfile[13] = 800;
              this.secondaryHeightProfile[12] = 3000;
              this.secondaryHeightProfile[13] = 2800;
              this.groundHeightProfile[14] = 900;
            }
            if (di.field_g == 0 ||
              1 == di.field_g ||
              di.field_g == 7) {
              this.groundHeightProfile[0] = 4000;
              this.groundHeightProfile[1] = 1000;
              this.groundHeightProfile[4] = 3000;
              this.groundHeightProfile[2] = 1100;
              this.groundHeightProfile[7] = 1000;
              this.groundHeightProfile[5] = 3400;
              this.groundHeightProfile[6] = 3000;
              this.groundHeightProfile[3] = 3200;
              this.secondaryHeightProfile[7] = 3000;
              this.groundHeightProfile[8] = 1200;
              this.groundHeightProfile[10] = 860;
              this.secondaryHeightProfile[8] = 2900;
              this.groundHeightProfile[9] = 900;
              this.groundHeightProfile[11] = 800;
              this.secondaryHeightProfile[10] = 3200;
              this.secondaryHeightProfile[11] = 3600;
              this.groundHeightProfile[12] = 860;
              this.secondaryHeightProfile[12] = 700;
              this.groundHeightProfile[13] = 800;
              this.secondaryHeightProfile[13] = 4500;
              this.secondaryHeightProfile[14] = 4600;
              decompiledFrameRemainder1 = (di.field_g == 1 ||
                di.field_g == 7);
              if (decompiledFrameRemainder1) {
                this.secondaryHeightProfile[10] = 700;
                this.secondaryHeightProfile[12] = 4000;
                he.field_k = 180000;
                this.secondaryHeightProfile[11] = 3200;
                decompiledFrameRemainder1 = (var22 != 0);
              }
            }
            if (decompiledFrameRemainder1) {
              this.groundHeightProfile[13] = 1200;
              this.groundHeightProfile[9] = 4000;
              this.groundHeightProfile[10] = 3000;
              this.groundHeightProfile[4] = 800;
              this.groundHeightProfile[7] = 2000;
              this.groundHeightProfile[12] = 3200;
              this.groundHeightProfile[11] = 3400;
              this.groundHeightProfile[5] = 800;
              this.groundHeightProfile[8] = 3000;
              this.secondaryHeightProfile[2] = 3000;
            }
          }
          boolean decompiledFrameCompleted2 = true;
          if (9 == di.field_g) {
            this.groundHeightProfile[13] = 3000;
            this.groundHeightProfile[1] = 3000;
            this.groundHeightProfile[14] = 4000;
            this.groundHeightProfile[0] = 4000;
            var6 = 1;
            while (13 >= var6) {
              this.groundHeightProfile[var6] = (int)(600.0 * Math.random()) + 700;
              var6++;
              if (var22 != 0) {
                decompiledFrameCompleted2 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted2) {
            if (di.field_g == 5) {
              he.field_k = 180000;
            }
            var6 = 6;
          }
          var7 = 6;
          if (8000 >= var4_int) {
            var6--;
            var7--;
          }
          if (this.terrainType == 2) {
            var7 = 0;
            this.secondaryHeightProfile[0] = 0;
            var6 = 0;
            this.secondaryHeightProfile[14] = 0;
          }
          scanLoop1: while (true) {
            if (this.profileLength < var4_int) {
              var8_ref_int__ = this.groundHeightProfile;
              var9_ref_int__ = this.secondaryHeightProfile;
              var10 = this.profileLength;
              this.profileLength = 2 * this.profileLength - 1;
              stackIn_112_0 = ~var6;
              if (var22 != 0) {
                break scanLoop1;
              }
              if (stackIn_112_0 < -1) {
                var6--;
              }
              if (var7 > 0) {
                var7--;
              }
              this.secondaryHeightProfile = new int[this.profileLength];
              this.groundHeightProfile = new int[this.profileLength];
              var11 = 0;
              while ((var10 - 1) > var11) {
                this.groundHeightProfile[var11 * 2] = var8_ref_int__[var11];
                this.secondaryHeightProfile[var11 * 2] = var9_ref_int__[var11];
                var6 = var6 + Math.abs(-var8_ref_int__[1 + var11] + var8_ref_int__[var11]) / 24;
                var7 = var7 + Math.abs(-var9_ref_int__[1 + var11] + var9_ref_int__[var11]) / 24;
                stackIn_110_0 = this.groundHeightProfile;
                stackIn_110_1 = 1 + 2 * var11;
                stackIn_110_2 = (var8_ref_int__[var11] + var8_ref_int__[1 + var11]) / 2;
                if (var6 > 0) {
                  stackIn_104_3 = -var6 + var5.nextIntBounded(-114, 1 + 2 * var6);
                } else {
                  stackIn_104_3 = 0;
                }
                stackIn_110_0[stackIn_110_1] = stackIn_110_2 + stackIn_104_3 * 4;
                stackIn_107_0 = this.secondaryHeightProfile;
                stackIn_107_1 = 1 + 2 * var11;
                stackIn_107_2 = (var9_ref_int__[var11 + 1] + var9_ref_int__[var11]) / 2;
                stackIn_107_3 = 4;
                if (var7 <= 0) {
                  stackIn_108_4 = 0;
                } else {
                  stackIn_108_4 = -var7 + var5.nextIntBounded(96, 2 * var7 + 1);
                }
                stackIn_107_0[stackIn_107_1] = stackIn_107_2 + stackIn_107_3 * stackIn_108_4;
                var6 = var6 - Math.abs(-var8_ref_int__[var11 + 1] + var8_ref_int__[var11]) / 24;
                var7 = var7 - Math.abs(-var9_ref_int__[1 + var11] + var9_ref_int__[var11]) / 24;
                var11++;
              }
              this.groundHeightProfile[-1 + this.profileLength] = var8_ref_int__[var10 - 1];
              stackIn_110_0Lifetime1 = this.secondaryHeightProfile;
              stackIn_110_1Lifetime1 = this.profileLength - 1;
              stackIn_110_2Lifetime1 = var9_ref_int__[-1 + var10];
              stackIn_110_0Lifetime1[stackIn_110_1Lifetime1] = stackIn_110_2Lifetime1;
              continue;
            }
            stackIn_112_0 = 0;
            break;
          }
          var8 = stackIn_112_0;
          var9 = 10000;
          var10 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var10 >= this.profileLength))) {
            stackIn_130_0 = ~this.groundHeightProfile[var10];
            stackIn_130_1 = ~var8;
            if (var22 == 0) {
              if (stackIn_130_0 < stackIn_130_1) {
                var8 = this.groundHeightProfile[var10];
              }
              if (var9 > this.groundHeightProfile[var10]) {
                var9 = this.groundHeightProfile[var10];
              }
              if (this.secondaryHeightProfile[var10] > var8) {
                var8 = this.secondaryHeightProfile[var10];
              }
              if (this.secondaryHeightProfile[var10] < var9) {
                var9 = this.secondaryHeightProfile[var10];
              }
              var10++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_130_0 = 0;
            stackIn_130_1 = ~param2;
          }
          boolean decompiledFrameCompleted1 = true;
          if (stackIn_130_0 == stackIn_130_1) {
            var10 = 0;
            while (this.profileLength > var10) {
              var11_ref_int__ = this.groundHeightProfile;
              var12 = var10;
              this.secondaryHeightProfile[var10] = 0;
              var11_ref_int__[var12] = 0;
              var10++;
              if (var22 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted1) {
            this.surfaceProfile = new int[this.profileLength];
          }
          regionExit2: {
            boolean decompiledFrameCompleted0 = true;
            if (-1 != param2) {
              var10 = 2048;
              if (this.terrainType == 3) {
                var12 = this.profileLength / 2;
                var13 = 5000;
                if (var13 > (this.profileLength / 4)) {
                  var13 = 4;
                }
                var14 = -var13 + var12;
                do {
                  if (var13 + var12 < var14) {
                    var14 = 0;
                    break;
                  }
                  this.groundHeightProfile[var14] = this.groundHeightProfile[var14] / 2;
                  this.secondaryHeightProfile[var14] = this.groundHeightProfile[var14];
                  var14++;
                } while (var22 == 0);
                while (var14 < 1000) {
                  var15_int = -var13 + (var12 - var14);
                  this.groundHeightProfile[var15_int] = (var14 * this.groundHeightProfile[var15_int] + (1000 - var14) * this.groundHeightProfile[var15_int] / 2) / 1000;
                  this.secondaryHeightProfile[var15_int] = (this.secondaryHeightProfile[var15_int] * var14 + this.groundHeightProfile[var15_int] * (-var14 + 1000)) / 1000;
                  var15_int = var14 + var12 + var13;
                  this.groundHeightProfile[var15_int] = (this.groundHeightProfile[var15_int] * var14 + this.groundHeightProfile[var15_int] * (1000 - var14) / 2) / 1000;
                  this.secondaryHeightProfile[var15_int] = (this.groundHeightProfile[var15_int] * (-var14 + 1000) + this.secondaryHeightProfile[var15_int] * var14) / 1000;
                  var14++;
                  if (var22 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
              }
              if (decompiledFrameCompleted0) {
                var11 = 2400;
                var12 = 0;
                scanLoop3: while (true) {
                  if (var12 < this.profileLength) {
                    this.groundHeightProfile[var12] = (-64 - var9 + this.groundHeightProfile[var12]) * var10 / (-var9 + var8);
                    this.secondaryHeightProfile[var12] = (this.secondaryHeightProfile[var12] - (var9 + 64)) * var11 / (var8 - var9);
                    stackIn_184_0 = 2;
                    stackIn_184_1 = this.terrainType;
                    if (var22 == 0) {
                      if (stackIn_184_0 != stackIn_184_1) {
                        if (this.groundHeightProfile[var12] < 512) {
                          this.groundHeightProfile[var12] = this.groundHeightProfile[var12] * this.groundHeightProfile[var12] / 512;
                        }
                        if (this.groundHeightProfile[var12] > this.secondaryHeightProfile[var12]) {
                          this.secondaryHeightProfile[var12] = this.groundHeightProfile[var12];
                        }
                        if (this.secondaryHeightProfile[var12] < (this.groundHeightProfile[var12] + 1024)) {
                          this.secondaryHeightProfile[var12] = this.groundHeightProfile[var12];
                        }
                        if (this.groundHeightProfile[var12] >= this.secondaryHeightProfile[var12]) {
                          this.surfaceProfile[var12] = this.groundHeightProfile[var12];
                        } else {
                          var13 = this.secondaryHeightProfile[var12] - this.groundHeightProfile[var12];
                          this.surfaceProfile[var12] = this.secondaryHeightProfile[var12] - (-1024 + var13) / 2 - 80;
                        }
                      }
                      if (this.terrainType == 4) {
                        var13_ref_int__ = this.groundHeightProfile;
                        var14 = var12;
                        var15 = this.surfaceProfile;
                        var16 = var12;
                        this.secondaryHeightProfile[var12] = 0;
                        var15[var16] = 0;
                        var13_ref_int__[var14] = 0;
                      }
                      var12++;
                      continue;
                    }
                  } else {
                    stackIn_184_0 = 2;
                    stackIn_184_1 = this.terrainType;
                  }
                  if (stackIn_184_0 == stackIn_184_1) {
                    var12 = 1;
                    while (var12 < (this.profileLength - 1)) {
                      stackIn_242_0 = this.secondaryHeightProfile[var12];
                      stackIn_242_1 = this.groundHeightProfile[var12];
                      if (var22 != 0) {
                        break regionExit2;
                      }
                      if (stackIn_242_0 < stackIn_242_1) {
                        this.groundHeightProfile[var12] = this.secondaryHeightProfile[var12];
                      }
                      if (this.groundHeightProfile[var12] < 1000) {
                        this.groundHeightProfile[var12] = 1000 + this.groundHeightProfile[var12] - 1000;
                      }
                      if (this.groundHeightProfile[var12] > 1000) {
                        this.groundHeightProfile[var12] = (-1000 + this.groundHeightProfile[var12]) / 5 + 1000;
                      }
                      dupTemp$0 = this.groundHeightProfile[var12];
                      this.secondaryHeightProfile[var12] = dupTemp$0;
                      this.surfaceProfile[var12] = dupTemp$0;
                      var12++;
                    }
                    if (var22 == 0) {
                      break;
                    }
                  }
                  var12 = 1;
                  while (true) {
                    stackIn_203_0 = ~var12;
                    stackIn_203_1 = ~(-1 + this.profileLength);
                    if (stackIn_203_0 <= stackIn_203_1) {
                      break scanLoop3;
                    }
                    stackIn_242_0 = ~this.surfaceProfile[var12];
                    stackIn_242_1 = ~this.secondaryHeightProfile[var12];
                    if (var22 != 0) {
                      break regionExit2;
                    }
                    if (stackIn_242_0 > stackIn_242_1) {
                      var13 = -this.groundHeightProfile[var12] + this.secondaryHeightProfile[var12];
                      if (this.secondaryHeightProfile[-1 + var12] == this.surfaceProfile[var12 - 1]) {
                        var14 = 1;
                        while (var14 < var13) {
                          stackIn_225_0 = 0;
                          stackIn_225_1 = -var14 + var12;
                          if (stackIn_225_0 > stackIn_225_1) {
                            break;
                          }
                          var15_int = -((-var14 + var13) * 2 / var13) + (this.groundHeightProfile[-var14 + var12] + (-var14 + var13) * (-var14 + var13) / var13);
                          if (this.surfaceProfile[var12 - var14] < var15_int) {
                            this.surfaceProfile[var12 - var14] = var15_int;
                          }
                          if (this.secondaryHeightProfile[var12 - var14] < var15_int) {
                            this.secondaryHeightProfile[-var14 + var12] = var15_int;
                          }
                          var14++;
                        }
                      }
                      stackIn_225_0Lifetime1 = this.secondaryHeightProfile[var12 + 1];
                      stackIn_225_1Lifetime1 = this.surfaceProfile[var12 + 1];
                      if (stackIn_225_0Lifetime1 == stackIn_225_1Lifetime1) {
                        var14 = 1;
                        while (var13 > var14) {
                          stackIn_203_0Lifetime1 = var12 + var14;
                          stackIn_203_1Lifetime1 = this.profileLength;
                          if (stackIn_203_0Lifetime1 >= stackIn_203_1Lifetime1) {
                            break;
                          }
                          var15_int = this.groundHeightProfile[var12 + var14] + ((-var14 + var13) * (var13 - var14) / var13 - (var13 - var14) * 2 / var13);
                          if (this.surfaceProfile[var12 + var14] < var15_int) {
                            this.surfaceProfile[var12 + var14] = var15_int;
                          }
                          if (var15_int > this.secondaryHeightProfile[var14 + var12]) {
                            this.secondaryHeightProfile[var12 + var14] = var15_int;
                          }
                          var14++;
                        }
                      }
                    }
                    var12++;
                  }
                }
              }
            }
            if (decompiledFrameCompleted0) {
              this.field_h = new int[this.field_p];
              this.field_j = new int[this.field_p];
            }
            stackIn_242_0 = 4;
            stackIn_242_1 = this.terrainType;
          }
          regionExit4: {
            if (stackIn_242_0 == stackIn_242_1) {
              var10 = 0;
              scanLoop5: while (true) {
                stackIn_245_0 = -3;
                boolean decompiledFrameRemainder0 = true;
                if (stackIn_245_0 < ~var10) {
                  var11 = 6000;
                  var12 = 1200;
                  var13 = this.profileLength / 6;
                  stackIn_316_0 = var10;
                  decompiledFrameRemainder0 = (var22 == 0);
                  if (decompiledFrameRemainder0) {
                    if (stackIn_316_0 == 0) {
                      var13 = -var13 + this.profileLength;
                    }
                    var14 = kc.field_x[4][0].field_z;
                    this.spawnPositions[this.field_c] = var13;
                    this.field_j[this.field_c] = -1;
                    var12 = 16 * var14;
                    var13 = var13 - var12 / 2;
                    this.field_h[this.field_c] = var11;
                    var15_int = var13;
                    var16_ref_wk = kc.field_x[4][0];
                    if (var10 != 0) {
                      var13 = var13 + (-var16_ref_wk.field_A + var16_ref_wk.field_z - var16_ref_wk.field_D << 4);
                    } else {
                      var13 = var13 + (var16_ref_wk.field_D << 4);
                    }
                    var12 = var16_ref_wk.field_A << 4;
                    if (var10 == 1) {
                      var13 = var13 + var12;
                    }
                    var17 = 0;
                    while (var17 < var12) {
                      var18 = var17 >> 4;
                      stackIn_283_0 = 0;
                      var19 = stackIn_283_0;
                      while (var16_ref_wk.field_F > var19) {
                        stackIn_272_0 = var18 + (var12 >> 4) * var19;
                        stackIn_272_1 = var16_ref_wk.field_E.length;
                        if (stackIn_272_0 < stackIn_272_1 &&
                          0 == var16_ref_wk.field_E[var18 + (var12 >> 4) * var19]) {
                          var19++;
                          continue;
                        }
                        break;
                      }
                      stackIn_272_0Lifetime1 = var16_ref_wk.field_F;
                      stackIn_272_1Lifetime1 = var19;
                      if (stackIn_272_0Lifetime1 > stackIn_272_1Lifetime1) {
                        this.groundHeightProfile[var13] = var11 + -(var19 + var16_ref_wk.field_H) * 16;
                        dupTemp$1 = this.groundHeightProfile[var13];
                        this.secondaryHeightProfile[var13] = dupTemp$1;
                        this.surfaceProfile[var13] = dupTemp$1;
                      }
                      if (var10 != 0) {
                        var13--;
                      } else {
                        var13++;
                      }
                      var17++;
                    }
                    var13 = var15_int;
                    var16_ref_wkLifetime2 = kc.field_x[4][1];
                    var12 = var16_ref_wkLifetime2.field_A << 4;
                    stackIn_283_0Lifetime1 = 0;
                    if (stackIn_283_0Lifetime1 != var10) {
                      var13 = var13 + (var16_ref_wkLifetime2.field_z - (var16_ref_wkLifetime2.field_A + var16_ref_wkLifetime2.field_D) << 4);
                    } else {
                      var13 = var13 + (var16_ref_wkLifetime2.field_D << 4);
                    }
                    if (var10 == 1) {
                      var13 = var13 + var12;
                    }
                    var17 = 0;
                    while (var17 < var12) {
                      var18 = var17 >> 4;
                      stackIn_245_0 = 0;
                      var19 = stackIn_245_0;
                      while (var16_ref_wkLifetime2.field_F > var19) {
                        stackIn_304_0 = var18 + (var12 >> 4) * var19;
                        stackIn_304_1 = var16_ref_wkLifetime2.field_E.length;
                        if (stackIn_304_0 < stackIn_304_1 &&
                          0 == var16_ref_wkLifetime2.field_E[var18 + (var12 >> 4) * var19]) {
                          var19++;
                          continue;
                        }
                        break;
                      }
                      stackIn_304_0Lifetime1 = var16_ref_wkLifetime2.field_F;
                      stackIn_304_1Lifetime1 = var19;
                      if (stackIn_304_0Lifetime1 > stackIn_304_1Lifetime1) {
                        this.secondaryHeightProfile[var13] = var11 + -(var16_ref_wkLifetime2.field_H + var19) * 16;
                        this.surfaceProfile[var13] = -1 + this.secondaryHeightProfile[var13];
                      }
                      if (var10 != 0) {
                        var13--;
                      } else {
                        var13++;
                      }
                      var17++;
                    }
                    this.field_c = this.field_c + 1;
                    var10++;
                    continue;
                  }
                }
                if (decompiledFrameRemainder0) {
                  stackIn_316_0 = 0;
                }
                var10 = stackIn_316_0;
                while (true) {
                  stackIn_318_0 = 11;
                  boolean decompiledFrameRemainder2 = true;
                  if (stackIn_318_0 > var10) {
                    var11 = -var5.nextIntBounded(75, 6000) + 8000;
                    var12 = 1200;
                    var13 = (var10 - 5) * 2150 + this.profileLength / 2;
                    var14 = var5.nextIntBounded(22, 5) + 1;
                    var15_int = kc.field_x[1][var14].field_z;
                    this.spawnPositions[this.field_c] = var13;
                    this.field_j[this.field_c] = var14;
                    var12 = var15_int * 16;
                    var13 = var13 - var12 / 8;
                    this.field_h[this.field_c] = var11;
                    var16_ref_wkLifetime1 = kc.field_x[1][var14];
                    var17Lifetime3 = 2;
                    var12 = var16_ref_wkLifetime1.field_A << var17Lifetime3;
                    var13 = var13 + (var16_ref_wkLifetime1.field_D << var17Lifetime3);
                    stackIn_353_0 = 0;
                    decompiledFrameRemainder2 = (var22 == 0);
                    if (decompiledFrameRemainder2) {
                      var18Lifetime3 = stackIn_353_0;
                      while (true) {
                        stackIn_322_0 = var18Lifetime3;
                        stackIn_322_1 = var12;
                        if (stackIn_322_0 < stackIn_322_1) {
                          var19Lifetime2 = var18Lifetime3 >> var17Lifetime3;
                          stackIn_318_0 = 0;
                          var20 = stackIn_318_0;
                          while (var20 < var16_ref_wkLifetime1.field_F) {
                            stackIn_322_0 = var16_ref_wkLifetime1.field_E.length;
                            stackIn_322_1 = var20 * (var12 >> var17Lifetime3) + var19Lifetime2;
                            if (stackIn_322_0 > stackIn_322_1 &&
                              (-16777216 & var16_ref_wkLifetime1.field_E[var19Lifetime2 + var20 * (var12 >> var17Lifetime3)]) == 0) {
                              var20++;
                              continue;
                            }
                            break;
                          }
                          var21 = var20;
                          while (var16_ref_wkLifetime1.field_F > var21) {
                            stackIn_347_0 = ~(var21 * (var12 >> var17Lifetime3) + var19Lifetime2);
                            stackIn_347_1 = ~var16_ref_wkLifetime1.field_E.length;
                            if (stackIn_347_0 > stackIn_347_1 &&
                              (var16_ref_wkLifetime1.field_E[(var12 >> var17Lifetime3) * var21 + var19Lifetime2] & -16777216) != 0) {
                              var21++;
                              continue;
                            }
                            break;
                          }
                          stackIn_347_0Lifetime1 = ~var16_ref_wkLifetime1.field_F;
                          stackIn_347_1Lifetime1 = ~var20;
                          if (stackIn_347_0Lifetime1 < stackIn_347_1Lifetime1) {
                            this.secondaryHeightProfile[var13] = var11 + (-(var20 + var16_ref_wkLifetime1.field_H) << var17Lifetime3);
                            this.surfaceProfile[var13] = (-(var16_ref_wkLifetime1.field_H + var21) << var17Lifetime3) + var11;
                          }
                          var13++;
                          var18Lifetime3++;
                          continue;
                        }
                        break;
                      }
                      this.field_c = this.field_c + 1;
                      var10++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder2) {
                    stackIn_353_0 = 1;
                  }
                  var10 = stackIn_353_0;
                  while (true) {
                    stackIn_355_0 = ~(this.profileLength - 1);
                    stackIn_355_1 = ~var10;
                    if (stackIn_355_0 >= stackIn_355_1) {
                      break scanLoop5;
                    }
                    stackIn_397_0 = this.surfaceProfile[var10];
                    stackIn_397_1 = this.secondaryHeightProfile[var10];
                    if (var22 != 0) {
                      break regionExit4;
                    }
                    if (stackIn_397_0 < stackIn_397_1) {
                      var11 = 200;
                      var12 = this.secondaryHeightProfile[var10];
                      if (this.secondaryHeightProfile[-1 + var10] == this.surfaceProfile[-1 + var10]) {
                        var13 = 1;
                        while (var11 > var13) {
                          stackIn_378_0 = -var13 + var10;
                          if (stackIn_378_0 < 0) {
                            break;
                          }
                          if (this.surfaceProfile[var10 - var13] < var12) {
                            this.surfaceProfile[var10 - var13] = var12;
                          }
                          if (var12 > this.secondaryHeightProfile[var10 - var13]) {
                            this.secondaryHeightProfile[-var13 + var10] = var12;
                          }
                          var13++;
                        }
                      }
                      stackIn_378_0Lifetime1 = ~this.surfaceProfile[1 + var10];
                      if (stackIn_378_0Lifetime1 == ~this.secondaryHeightProfile[var10 + 1]) {
                        var13 = 1;
                        while (var13 < var11) {
                          stackIn_355_0Lifetime1 = var10 + var13;
                          stackIn_355_1Lifetime1 = this.profileLength;
                          if (stackIn_355_0Lifetime1 >= stackIn_355_1Lifetime1) {
                            break;
                          }
                          if (var12 > this.surfaceProfile[var10 + var13]) {
                            this.surfaceProfile[var13 + var10] = var12;
                          }
                          if (this.secondaryHeightProfile[var13 + var10] < var12) {
                            this.secondaryHeightProfile[var10 + var13] = var12;
                          }
                          var13++;
                        }
                      }
                    }
                    var10++;
                  }
                }
              }
            }
            stackIn_397_0 = -1;
            stackIn_397_1 = ~this.terrainType;
          }
          if (stackIn_397_0 == stackIn_397_1) {
            var10 = kc.field_x[this.terrainType].length;
            var11 = this.profileLength / 8;
            while ((-(this.profileLength / 8) + this.profileLength) > var11) {
              var12 = this.secondaryHeightProfile[var11];
              if (var22 != 0) {
                return;
              }
              if ((this.profileLength - this.profileLength / 16) > var11 &&
                this.field_p > this.field_c) {
                this.spawnPositions[this.field_c] = var11;
                var13 = var5.nextIntBounded(-115, var10);
                this.field_j[this.field_c] = var13;
                var14_ref_wk = kc.field_x[this.terrainType][var13];
                var11 = var11 - var14_ref_wk.field_z * 2;
                var15_int = var14_ref_wk.field_A * 4;
                var11 = var11 + var14_ref_wk.field_D * 4;
                var16 = 0;
                while (var15_int > var16) {
                  stackIn_419_0 = ~var12;
                  stackIn_419_1 = ~this.secondaryHeightProfile[var16 + var11];
                  if (stackIn_419_0 < stackIn_419_1) {
                    var12 = this.secondaryHeightProfile[var11 + var16];
                  }
                  var16++;
                }
                this.field_h[this.field_c] = var12 + (4 * var14_ref_wk.field_F + 4 * var14_ref_wk.field_H);
                stackIn_419_0Lifetime1 = var12;
                stackIn_419_1Lifetime1 = (var14_ref_wk.field_B + var14_ref_wk.field_F) * 4;
                var12 = stackIn_419_0Lifetime1 + stackIn_419_1Lifetime1;
                var16 = 0;
                while (true) {
                  stackIn_421_0 = ~var16;
                  stackIn_421_1 = ~var15_int;
                  if (stackIn_421_0 > stackIn_421_1) {
                    var17Lifetime1 = var16 / 4;
                    var18Lifetime1 = 0;
                    var11++;
                    while (var14_ref_wk.field_F > var18Lifetime1) {
                      stackIn_421_0 = 0;
                      stackIn_421_1 = kc.field_x[this.terrainType][var13].field_E[var17Lifetime1 + var18Lifetime1 * var14_ref_wk.field_A];
                      if (stackIn_421_0 == stackIn_421_1) {
                        var18Lifetime1++;
                        continue;
                      }
                      break;
                    }
                    var16++;
                    continue;
                  }
                  break;
                }
                var11 = var11 + (var5.nextIntBounded(-117, 2048) + var15_int / 2);
                this.field_c = this.field_c + 1;
              }
              var11++;
            }
            if (var22 == 0) {
              return;
            }
          }
          if (this.terrainType == 2) {
            var10 = kc.field_x[this.terrainType].length;
            var11 = 0;
            var12 = this.profileLength / 8;
            while (var12 < (-(this.profileLength / 8) + this.profileLength)) {
              var13 = this.secondaryHeightProfile[var12];
              if (var22 != 0) {
                return;
              }
              if (var12 < (this.profileLength - this.profileLength / 16) &&
                this.field_p > this.field_c) {
                this.spawnPositions[this.field_c] = var12;
                var14 = var5.nextIntBounded(-96, var10);
                var11--;
                if (var14 <= 2 &&
                  0 < var11) {
                  var14 = var5.nextIntBounded(52, -2 + var10) + 2;
                }
                this.field_j[this.field_c] = var14;
                var15_ref = kc.field_x[this.terrainType][var14];
                var12 = var12 - 2 * var15_ref.field_z;
                var16 = var15_ref.field_A * 4;
                var12 = var12 + 4 * var15_ref.field_D;
                var17Lifetime2 = 0;
                while (var17Lifetime2 < var16) {
                  stackIn_463_0 = this.secondaryHeightProfile[var12 + var17Lifetime2];
                  stackIn_463_1 = var13;
                  if (stackIn_463_0 < stackIn_463_1) {
                    var13 = this.secondaryHeightProfile[var12 + var17Lifetime2];
                  }
                  var17Lifetime2++;
                }
                this.field_h[this.field_c] = var13 + var15_ref.field_H * 8 + 8 * var15_ref.field_F;
                stackIn_463_0Lifetime1 = var13;
                stackIn_463_1Lifetime1 = (var15_ref.field_B + var15_ref.field_F) * 8;
                var13 = stackIn_463_0Lifetime1 + stackIn_463_1Lifetime1;
                var17Lifetime2Lifetime1 = 0;
                while (true) {
                  stackIn_465_0 = ~var16;
                  stackIn_465_1 = ~var17Lifetime2Lifetime1;
                  if (stackIn_465_0 < stackIn_465_1) {
                    var18Lifetime2 = var17Lifetime2Lifetime1 / 4;
                    stackIn_476_0 = 0;
                    var19Lifetime1 = stackIn_476_0;
                    while (var15_ref.field_F > var19Lifetime1) {
                      stackIn_465_0 = 0;
                      stackIn_465_1 = kc.field_x[this.terrainType][var14].field_E[var18Lifetime2 + var19Lifetime1 * var15_ref.field_A];
                      if (stackIn_465_0 == stackIn_465_1) {
                        var19Lifetime1++;
                        continue;
                      }
                      break;
                    }
                    var12++;
                    var17Lifetime2Lifetime1++;
                    continue;
                  }
                  break;
                }
                stackIn_476_0Lifetime1 = var14;
                if (stackIn_476_0Lifetime1 <= 1) {
                  var17Lifetime2Lifetime2 = 0;
                  while (var17Lifetime2Lifetime2 < 1000) {
                    var18Lifetime2Lifetime1 = -var17Lifetime2Lifetime2 + this.spawnPositions[this.field_c] - 1000;
                    stackIn_502_0 = var18Lifetime2Lifetime1;
                    if (stackIn_502_0 >= 0 &&
                      var18Lifetime2Lifetime1 < this.profileLength) {
                      this.secondaryHeightProfile[var18Lifetime2Lifetime1] = ((-var17Lifetime2Lifetime2 + 1000) * 1124 + this.secondaryHeightProfile[var18Lifetime2Lifetime1] * var17Lifetime2Lifetime2) / 1000;
                      this.groundHeightProfile[var18Lifetime2Lifetime1] = (-(0 * var17Lifetime2Lifetime2) - (0 - this.groundHeightProfile[var18Lifetime2Lifetime1] * var17Lifetime2Lifetime2)) / 1000;
                      this.surfaceProfile[var18Lifetime2Lifetime1] = -100 + this.secondaryHeightProfile[var18Lifetime2Lifetime1];
                      if (this.surfaceProfile[var18Lifetime2Lifetime1] < (this.groundHeightProfile[var18Lifetime2Lifetime1] + 1024)) {
                        this.surfaceProfile[var18Lifetime2Lifetime1] = this.secondaryHeightProfile[var18Lifetime2Lifetime1];
                      }
                    }
                    var18Lifetime2Lifetime1 = var17Lifetime2Lifetime2 + (1000 + this.spawnPositions[this.field_c]);
                    if (var18Lifetime2Lifetime1 >= 0 &&
                      var18Lifetime2Lifetime1 < this.profileLength) {
                      this.secondaryHeightProfile[var18Lifetime2Lifetime1] = (1124000 + (-(var17Lifetime2Lifetime2 * 1124) + var17Lifetime2Lifetime2 * this.secondaryHeightProfile[var18Lifetime2Lifetime1])) / 1000;
                      this.groundHeightProfile[var18Lifetime2Lifetime1] = (this.groundHeightProfile[var18Lifetime2Lifetime1] * var17Lifetime2Lifetime2 + 0 - var17Lifetime2Lifetime2 * 0) / 1000;
                      this.surfaceProfile[var18Lifetime2Lifetime1] = 1024;
                      if (this.surfaceProfile[var18Lifetime2Lifetime1] < this.groundHeightProfile[var18Lifetime2Lifetime1] + 1024) {
                        this.surfaceProfile[var18Lifetime2Lifetime1] = this.secondaryHeightProfile[var18Lifetime2Lifetime1];
                      }
                    }
                    var17Lifetime2Lifetime2++;
                  }
                  stackIn_502_0Lifetime1 = 0;
                  var17Lifetime2Lifetime2 = stackIn_502_0Lifetime1;
                  while (var17Lifetime2Lifetime2 < 2000) {
                    var18Lifetime2Lifetime1 = var17Lifetime2Lifetime2 - (-this.spawnPositions[this.field_c] + 1000);
                    stackIn_515_0 = ~var18Lifetime2Lifetime1;
                    stackIn_515_1 = -1;
                    if (stackIn_515_0 <= stackIn_515_1 &&
                      this.profileLength > var18Lifetime2Lifetime1) {
                      this.secondaryHeightProfile[var18Lifetime2Lifetime1] = 1124;
                      this.surfaceProfile[var18Lifetime2Lifetime1] = 1024;
                      this.groundHeightProfile[var18Lifetime2Lifetime1] = 0;
                    }
                    var17Lifetime2Lifetime2++;
                  }
                  stackIn_515_0Lifetime1 = -var16;
                  stackIn_515_1Lifetime1 = this.spawnPositions[this.field_c];
                  var17Lifetime2Lifetime2 = stackIn_515_0Lifetime1 + stackIn_515_1Lifetime1;
                  var11 = 2;
                  var18Lifetime2Lifetime1 = 0;
                  while (var18Lifetime2Lifetime1 < var16 << 1) {
                    var19Lifetime1Lifetime1 = var18Lifetime2Lifetime1 / 8;
                    stackIn_539_0 = 0;
                    var20Lifetime1 = stackIn_539_0;
                    while (var20Lifetime1 < var15_ref.field_F) {
                      stackIn_528_0 = kc.field_x[this.terrainType][var14].field_E[var19Lifetime1Lifetime1 + var20Lifetime1 * var15_ref.field_A];
                      if (stackIn_528_0 == 0) {
                        var20Lifetime1++;
                        continue;
                      }
                      break;
                    }
                    stackIn_528_0Lifetime1 = ~var17Lifetime2Lifetime2;
                    if (stackIn_528_0Lifetime1 <= -1 &&
                      var17Lifetime2Lifetime2 <= this.profileLength) {
                      this.secondaryHeightProfile[var17Lifetime2Lifetime2] = this.field_h[this.field_c] - (var20Lifetime1 << 3);
                      if (this.secondaryHeightProfile[var17Lifetime2Lifetime2] < 1124) {
                        this.secondaryHeightProfile[var17Lifetime2Lifetime2] = 1124;
                      }
                    }
                    var17Lifetime2Lifetime2++;
                    var18Lifetime2Lifetime1++;
                  }
                }
                stackIn_539_0Lifetime1 = this.terrainType;
                if (stackIn_539_0Lifetime1 == 2) {
                  var12 = var12 + (var5.nextIntBounded(53, 128) + var16);
                }
                this.field_c = this.field_c + 1;
              }
              var12++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "hd.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int getSurfaceProfileAt(byte obfuscationGuard, int profileIndex) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 > profileIndex) {
            stackIn_4_0 = this.surfaceProfile[0];
            return stackIn_4_0;
          }
          if (obfuscationGuard < 117) {
            BattleTerrain.b(-45, 66, -70);
          }
          if (profileIndex < this.profileLength) {
            stackIn_12_0 = this.surfaceProfile[profileIndex];
            return stackIn_12_0;
          }
          stackIn_10_0 = this.surfaceProfile[-1 + this.profileLength];
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "hd.G(" + obfuscationGuard + ',' + profileIndex + ')');
        }
    }

    final static boolean c(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          vi.i(126);
          var1_int = -85 / ((37 - param0) / 58);
          stackIn_4_0 = (jd.field_rb != null);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "hd.B(" + param0 + ')');
        }
    }

    final int getProfileLength(int obfuscationGuard) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = 97 % ((-63 - obfuscationGuard) / 52);
          stackIn_1_0 = this.profileLength;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "hd.F(" + obfuscationGuard + ')');
        }
    }

    final int getSecondaryHeightAt(boolean obfuscationGuard, int profileIndex) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard) {
            this.field_l = -68;
          }
          if (profileIndex < 0) {
            stackIn_5_0 = this.secondaryHeightProfile[0];
            return stackIn_5_0;
          }
          if (profileIndex >= this.profileLength) {
            stackIn_10_0 = this.secondaryHeightProfile[-1 + this.profileLength];
            return stackIn_10_0;
          }
          stackIn_12_0 = this.secondaryHeightProfile[profileIndex];
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "hd.C(" + obfuscationGuard + ',' + profileIndex + ')');
        }
    }

    final static void a(boolean param0) {
        class $CfrPartitionedState {
            ArticulatedPart var1;
            Object var1_ref;
            int[] var2;
            int var3;
            int var4;
            ArticulatedPart stackIn_82_0;
            ArticulatedPart stackIn_82_1;
            IndexedSprite stackIn_82_2;
            int stackIn_82_3;
            int stackIn_82_4;
            int stackIn_82_5;
            int stackIn_82_6;
            int stackIn_82_7;
            PartInstruction[] stackIn_82_8;
            PartInstruction[] stackIn_82_9;
            int stackIn_82_10;
            PartInstruction stackIn_82_11;
            PartInstruction stackIn_82_12;
            int stackIn_82_13;
            int stackIn_82_14;
            ArticulatedPart stackIn_84_0;
            ArticulatedPart stackIn_84_1;
            IndexedSprite stackIn_84_2;
            int stackIn_84_3;
            int stackIn_84_4;
            int stackIn_84_5;
            int stackIn_84_6;
            int stackIn_84_7;
            PartInstruction[] stackIn_84_8;
            PartInstruction[] stackIn_84_9;
            int stackIn_84_10;
            PartInstruction stackIn_84_11;
            PartInstruction stackIn_84_12;
            int stackIn_84_13;
            int stackIn_84_14;
            ArticulatedPart stackIn_85_0;
            ArticulatedPart stackIn_85_1;
            IndexedSprite stackIn_85_2;
            int stackIn_85_3;
            int stackIn_85_4;
            int stackIn_85_5;
            int stackIn_85_6;
            int stackIn_85_7;
            PartInstruction[] stackIn_85_8;
            PartInstruction[] stackIn_85_9;
            int stackIn_85_10;
            PartInstruction stackIn_85_11;
            PartInstruction stackIn_85_12;
            int stackIn_85_13;
            int stackIn_85_14;
            ArticulatedPart stackIn_86_0;
            ArticulatedPart stackIn_86_1;
            IndexedSprite stackIn_86_2;
            int stackIn_86_3;
            int stackIn_86_4;
            int stackIn_86_5;
            int stackIn_86_6;
            int stackIn_86_7;
            PartInstruction[] stackIn_86_8;
            PartInstruction[] stackIn_86_9;
            int stackIn_86_10;
            PartInstruction stackIn_86_11;
            PartInstruction stackIn_86_12;
            int stackIn_86_13;
            int stackIn_86_14;
            ArticulatedPart stackIn_87_0;
            ArticulatedPart stackIn_87_1;
            IndexedSprite stackIn_87_2;
            int stackIn_87_3;
            int stackIn_87_4;
            int stackIn_87_5;
            int stackIn_87_6;
            int stackIn_87_7;
            PartInstruction[] stackIn_87_8;
            PartInstruction[] stackIn_87_9;
            int stackIn_87_10;
            PartInstruction stackIn_87_11;
            PartInstruction stackIn_87_12;
            int stackIn_87_13;
            int stackIn_87_14;
            ArticulatedPart stackIn_88_0;
            ArticulatedPart stackIn_88_1;
            IndexedSprite stackIn_88_2;
            int stackIn_88_3;
            int stackIn_88_4;
            int stackIn_88_5;
            int stackIn_88_6;
            int stackIn_88_7;
            PartInstruction[] stackIn_88_8;
            PartInstruction[] stackIn_88_9;
            int stackIn_88_10;
            PartInstruction stackIn_88_11;
            PartInstruction stackIn_88_12;
            int stackIn_88_13;
            int stackIn_88_14;
            int stackIn_88_15;
            RuntimeException decompiledCaughtException;
            RuntimeException var1_ref2;
            int var2_int;
            int statePc;
            Throwable caughtException;
            boolean param0;
            boolean finished;
            $CfrPartitionedState(boolean initialParam0) {
                this.param0 = initialParam0;
                this.var1 = null;
                this.var1_ref = null;
                this.var2 = null;
                this.var3 = 0;
                this.var4 = 0;
                this.stackIn_85_0 = null;
                this.stackIn_85_1 = null;
                this.stackIn_85_2 = null;
                this.stackIn_85_3 = 0;
                this.stackIn_85_4 = 0;
                this.stackIn_85_5 = 0;
                this.stackIn_85_6 = 0;
                this.stackIn_85_7 = 0;
                this.stackIn_85_8 = null;
                this.stackIn_85_9 = null;
                this.stackIn_85_10 = 0;
                this.stackIn_85_11 = null;
                this.stackIn_85_12 = null;
                this.stackIn_85_13 = 0;
                this.stackIn_85_14 = 0;
                this.stackIn_88_0 = null;
                this.stackIn_88_1 = null;
                this.stackIn_88_2 = null;
                this.stackIn_88_3 = 0;
                this.stackIn_88_4 = 0;
                this.stackIn_88_5 = 0;
                this.stackIn_88_6 = 0;
                this.stackIn_88_7 = 0;
                this.stackIn_88_8 = null;
                this.stackIn_88_9 = null;
                this.stackIn_88_10 = 0;
                this.stackIn_88_11 = null;
                this.stackIn_88_12 = null;
                this.stackIn_88_13 = 0;
                this.stackIn_88_14 = 0;
                this.stackIn_88_15 = 0;
                this.decompiledCaughtException = null;
                this.var1_ref2 = null;
                this.var2_int = 0;
                this.statePc = 0;
                this.caughtException = null;
            }
            void runPartition0() {
                scanLoop1: while (true) {
                    switch (statePc) {
                        case 0: {
                            var4 = SteelSentinels.obfuscationControl;
                            statePc = 1;
                            continue scanLoop1;
                        }
                        case 1: {
                            try {
                                ao.field_H = new NodeDeque();
                                if (li.field_z != null) {
                                    statePc = 4;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 2. */
                                    {
                                        li.field_z = new IndexedSprite[10];
                                        statePc = 4;
                                        continue scanLoop1;
                                    }
                                }
                            } catch (Throwable stateCaught_1) {
                                statePc = (stateCaught_1 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                                }
                                caughtException = stateCaught_1;
                                continue scanLoop1;
                            }
                        }
                        case 4: {
                            try {
                                if (null != si.field_l) {
                                    statePc = 7;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 5. */
                                    {
                                        si.field_l = new IndexedSprite[256];
                                        statePc = 7;
                                        continue scanLoop1;
                                    }
                                }
                            } catch (Throwable stateCaught_4) {
                                statePc = (stateCaught_4 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_4);
                                }
                                caughtException = stateCaught_4;
                                continue scanLoop1;
                            }
                        }
                        case 7: {
                            try {
                                if (null != ng.field_c) {
                                    statePc = 10;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 8. */
                                    {
                                        ng.field_c = new IndexedSprite[20];
                                        statePc = 10;
                                        continue scanLoop1;
                                    }
                                }
                            } catch (Throwable stateCaught_7) {
                                statePc = (stateCaught_7 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_7);
                                }
                                caughtException = stateCaught_7;
                                continue scanLoop1;
                            }
                        }
                        case 10: {
                            try {
                                if (wi.field_C == null) {
                                    /* Inlined CFG state: 13. */
                                    {
                                        wi.field_C = new IndexedSprite[21];
                                        statePc = 14;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 11. */
                                    {
                                        statePc = 14;
                                        continue scanLoop1;
                                    }
                                }
                            } catch (Throwable stateCaught_10) {
                                statePc = (stateCaught_10 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_10);
                                }
                                caughtException = stateCaught_10;
                                continue scanLoop1;
                            }
                        }
                        case 14: {
                            try {
                                if (ui.field_V != null) {
                                    statePc = 17;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 15. */
                                    {
                                        ui.field_V = new IndexedSprite[12];
                                        statePc = 17;
                                        continue scanLoop1;
                                    }
                                }
                            } catch (Throwable stateCaught_14) {
                                statePc = (stateCaught_14 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_14);
                                }
                                caughtException = stateCaught_14;
                                continue scanLoop1;
                            }
                        }
                        case 17: {
                            try {
                                if (lb.field_Zb == null) {
                                    /* Inlined CFG state: 20. */
                                    {
                                        lb.field_Zb = new IndexedSprite[4];
                                        statePc = 21;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 18. */
                                    {
                                        statePc = 21;
                                        continue scanLoop1;
                                    }
                                }
                            } catch (Throwable stateCaught_17) {
                                statePc = (stateCaught_17 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_17);
                                }
                                caughtException = stateCaught_17;
                                continue scanLoop1;
                            }
                        }
                        case 21: {
                            try {
                                if (null != jd.field_qb) {
                                    statePc = 24;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 22. */
                                    {
                                        jd.field_qb = new IndexedSprite[12];
                                        statePc = 24;
                                        continue scanLoop1;
                                    }
                                }
                            } catch (Throwable stateCaught_21) {
                                statePc = (stateCaught_21 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_21);
                                }
                                caughtException = stateCaught_21;
                                continue scanLoop1;
                            }
                        }
                        case 24: {
                            try {
                                if (null != Sentinel.field_nc) {
                                    statePc = 27;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 25. */
                                    {
                                        Sentinel.field_nc = new IndexedSprite[15];
                                        statePc = 27;
                                        continue scanLoop1;
                                    }
                                }
                            } catch (Throwable stateCaught_24) {
                                statePc = (stateCaught_24 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_24);
                                }
                                caughtException = stateCaught_24;
                                continue scanLoop1;
                            }
                        }
                        case 27: {
                            try {
                                if (null != vc.field_b) {
                                    statePc = 30;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 28. */
                                    {
                                        vc.field_b = new IndexedSprite[20];
                                        statePc = 30;
                                        continue scanLoop1;
                                    }
                                }
                            } catch (Throwable stateCaught_27) {
                                statePc = (stateCaught_27 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_27);
                                }
                                caughtException = stateCaught_27;
                                continue scanLoop1;
                            }
                        }
                        case 30: {
                            try {
                                if (ArchiveProvider.field_a == null) {
                                    /* Inlined CFG state: 33. */
                                    {
                                        ArchiveProvider.field_a = new IndexedSprite[12];
                                        statePc = 34;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 31. */
                                    {
                                        statePc = 34;
                                        continue scanLoop1;
                                    }
                                }
                            } catch (Throwable stateCaught_30) {
                                statePc = (stateCaught_30 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_30);
                                }
                                caughtException = stateCaught_30;
                                continue scanLoop1;
                            }
                        }
                        case 34: {
                            try {
                                if (null != hk.field_Ec) {
                                    statePc = 37;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 35. */
                                    {
                                        hk.field_Ec = new IndexedSprite[15];
                                        statePc = 37;
                                        continue scanLoop1;
                                    }
                                }
                            } catch (Throwable stateCaught_34) {
                                statePc = (stateCaught_34 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_34);
                                }
                                caughtException = stateCaught_34;
                                continue scanLoop1;
                            }
                        }
                        case 37: {
                            try {
                                if (ne.field_R == null) {
                                    /* Inlined CFG state: 40. */
                                    {
                                        ne.field_R = new IndexedSprite[21];
                                        statePc = 41;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 38. */
                                    {
                                        statePc = 41;
                                        continue scanLoop1;
                                    }
                                }
                            } catch (Throwable stateCaught_37) {
                                statePc = (stateCaught_37 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_37);
                                }
                                caughtException = stateCaught_37;
                                continue scanLoop1;
                            }
                        }
                        case 41: {
                            try {
                                if (null == ParticleEffect.field_L) {
                                    /* Inlined CFG state: 44. */
                                    {
                                        ParticleEffect.field_L = new IndexedSprite[18];
                                        var2_int = 0;
                                        statePc = 45;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 42. */
                                    {
                                        statePc = 50;
                                        continue scanLoop1;
                                    }
                                }
                            } catch (Throwable stateCaught_41) {
                                statePc = (stateCaught_41 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_41);
                                }
                                caughtException = stateCaught_41;
                                continue scanLoop1;
                            }
                        }
                        case 45: {
                            try {
                                if (var2_int >= 18) {
                                    statePc = 50;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 46. */
                                    {
                                        ParticleEffect.field_L[var2_int] = na.field_a;
                                        var2_int++;
                                        if (var4 != 0) {
                                            statePc = 53;
                                            continue scanLoop1;
                                        } else {
                                            /* Inlined CFG state: 47. */
                                            {
                                                if (var4 == 0) {
                                                    statePc = 45;
                                                    continue scanLoop1;
                                                } else {
                                                    /* Inlined CFG state: 48. */
                                                    {
                                                        statePc = 50;
                                                        continue scanLoop1;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable stateCaught_45) {
                                statePc = (stateCaught_45 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_45);
                                }
                                caughtException = stateCaught_45;
                                continue scanLoop1;
                            }
                        }
                        case 50: {
                            try {
                                if (Sprite.field_b != null) {
                                    statePc = 53;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 51. */
                                    {
                                        Sprite.field_b = new IndexedSprite[10];
                                        statePc = 53;
                                        continue scanLoop1;
                                    }
                                }
                            } catch (Throwable stateCaught_50) {
                                statePc = (stateCaught_50 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_50);
                                }
                                caughtException = stateCaught_50;
                                continue scanLoop1;
                            }
                        }
                        case 53: {
                            try {
                                if (cf.field_u == null) {
                                    /* Inlined CFG state: 56. */
                                    {
                                        cf.field_u = new IndexedSprite[15];
                                        statePc = 57;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 54. */
                                    {
                                        statePc = 57;
                                        continue scanLoop1;
                                    }
                                }
                            } catch (Throwable stateCaught_53) {
                                statePc = (stateCaught_53 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_53);
                                }
                                caughtException = stateCaught_53;
                                continue scanLoop1;
                            }
                        }
                        default: return;
                    }
                }
            }
            void runPartition1() {
                scanLoop1: while (true) {
                    switch (statePc) {
                        case 57: {
                            try {
                                var1 = new ArticulatedPart(ArchiveProvider.field_a[0], 1, 32, 53, 0, 0, new PartInstruction[]{new PartInstruction("Land Drone Body - THIS SHOULD NEVER EVER EVER BE SEEN"), new PartInstruction(1, 1, 100), new PartInstruction(64), new PartInstruction(58, -20, 16384, 16384, 144), new PartInstruction(58, -20, 16384, 16384, 144)});
                                var1.componentId = 109;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(lb.field_Zb[0], 1, 64, 98, 0, 0, new PartInstruction[]{new PartInstruction("Land Drone Body - THIS SHOULD NEVER EVER EVER BE SEEN"), new PartInstruction(100, 4, 200), new PartInstruction(64), new PartInstruction(64, 35, -8192, 16384, new ArticulatedPart(jd.field_qb[6], 50, 63, new PartInstruction[]{new PartInstruction(74, 62, 16384, 0, 288)}), true), new PartInstruction(64, 70, 0, 0, new ArticulatedPart(lb.field_Zb[1], 64, 70, new PartInstruction[]{}))});
                                var1.componentId = 107;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(lb.field_Zb[2], 1, 64, 140, 0, 0, new PartInstruction[]{new PartInstruction("Hover Drone Body - THIS SHOULD NEVER EVER EVER BE SEEN"), new PartInstruction(100, 4, 300), new PartInstruction(200, 200), new PartInstruction(64), new PartInstruction(64, 34, 16384, 0, 10, true), new PartInstruction(64, 94, 8192, 16384, new ArticulatedPart(jd.field_qb[6], 50, 63, new PartInstruction[]{new PartInstruction(74, 62, 16384, 0, 288)}), true)});
                                var1.componentId = 108;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(jd.field_qb[2], 2, 58, 63, -16384, 4096, new PartInstruction[]{new PartInstruction("Golem Head"), new PartInstruction(100, 1, 325), new PartInstruction(80, 68, 16384, 4096, 16, true)});
                                var1.componentId = 1;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(jd.field_qb[4], 4, 64, 55, -12288, 4096, new PartInstruction[]{new PartInstruction("Golem Arm"), new PartInstruction(50, 0, 325), new PartInstruction(64, 77, 0, 4096, new ArticulatedPart(jd.field_qb[6], 50, 63, new PartInstruction[]{new PartInstruction(74, 62, 16384, 0, 288)}))});
                                var1.componentId = 2;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(jd.field_qb[3], 8, 67, 78, -21845, 8192, new PartInstruction[]{new PartInstruction("Golem Wing"), new PartInstruction(50, 0, 100), new PartInstruction(81, 40, 16384, 1024, 128, true), new PartInstruction(82, 47, 16384, 1024, 128, true), new PartInstruction(83, 54, 16384, 1024, 128, true)});
                                var1.componentId = 3;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(jd.field_qb[1], 1, 64, 138, 0, 0, new PartInstruction[]{new PartInstruction("Golem Chassis"), new PartInstruction(300, 3, 1150), new PartInstruction(64), new PartInstruction(150, 175), new PartInstruction(66, 94, 0, 0, new ArticulatedPart(jd.field_qb[8], 64, 45, new PartInstruction[]{new PartInstruction("A")}), false), new PartInstruction(68, 60, 0, 0, new ArticulatedPart(jd.field_qb[7], 66, 70, new PartInstruction[]{new PartInstruction("B"), new PartInstruction(46, 26, 4681, 4096, 768, true), new PartInstruction(64, 41, 16384, 0, 1024, true), new PartInstruction(66, 19, 16384, 0, 2), new PartInstruction(54, 31, 16384, 0, 8), new PartInstruction(54, 41, 16384, 0, 4)}), false)});
                                var1.componentId = 0;
                                var1 = wh.a(0, var1);
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(jd.field_qb[4], 1024, 64, 55, -16384, 4096, new PartInstruction[]{new PartInstruction("Golem Rear Arm"), new PartInstruction(64, 77, 0, 4096, new ArticulatedPart(jd.field_qb[6], 50, 63, new PartInstruction[]{new PartInstruction(74, 63, 16384, 0, 288)}))});
                                var1.componentId = 96;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(li.field_z[0], 2, 52, 68, -16384, 1024, new PartInstruction[]{new PartInstruction("Slave Head"), new PartInstruction(250, 0, 275), new PartInstruction(56, 62, 16384, 5461, 400)});
                                var1.componentId = 53;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(li.field_z[8], 8, 65, 68, -16384, 4096, new PartInstruction[]{new PartInstruction("Slave Shoulder"), new PartInstruction(100, 0, 550), new PartInstruction(80, 63, 16384, 1024, 288, true)});
                                var1.componentId = 54;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(li.field_z[6], 4, 76, 42, -16384, 2048, new PartInstruction[]{new PartInstruction("Slave Arm"), new PartInstruction(250, 0, 425), new PartInstruction(55, 88, 0, 2048, new ArticulatedPart(li.field_z[7], 39, 56, new PartInstruction[]{new PartInstruction(80, 58, 16384, 0, 288, true), new PartInstruction(80, 79, 16384, 0, 288, true)}), false)});
                                var1.componentId = 56;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(li.field_z[6], 1024, 76, 42, -16384, 2048, new PartInstruction[]{new PartInstruction("Slave Rear Arm")});
                                var1.componentId = 97;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(li.field_z[2], 1, 64, 188, 0, 0, new PartInstruction[]{new PartInstruction("Slave Chassis"), new PartInstruction(400, 1, 925), new PartInstruction(16), new PartInstruction(0, 400), new PartInstruction(80, 68, 0, 2048, new ArticulatedPart(li.field_z[5], 87, 33, new PartInstruction[]{new PartInstruction("Back0Leg"), new PartInstruction(39, 80, 0, 2048, new ArticulatedPart(li.field_z[3], 45, 44, new PartInstruction[]{new PartInstruction("Back1Leg"), new PartInstruction(86, 87, 0, 2048, new ArticulatedPart(li.field_z[1], 65, 96, new PartInstruction[]{new PartInstruction("Back2Leg"), new PartInstruction(58, 118, 0, 2048, new ArticulatedPart(li.field_z[4], 58, 118, new PartInstruction[]{new PartInstruction("Back3Leg")}), true), new PartInstruction(73, 118, 0, 2048, new ArticulatedPart(li.field_z[9], 73, 118, new PartInstruction[]{new PartInstruction("Back4Leg")}))}))}))}), true), new PartInstruction(80, 68, 0, 2048, new ArticulatedPart(li.field_z[5], 87, 33, new PartInstruction[]{new PartInstruction("Front0Leg"), new PartInstruction(39, 80, 0, 2048, new ArticulatedPart(li.field_z[3], 45, 44, new PartInstruction[]{new PartInstruction("Front1Leg"), new PartInstruction(86, 87, 0, 2048, new ArticulatedPart(li.field_z[1], 65, 96, new PartInstruction[]{new PartInstruction("Front2Leg"), new PartInstruction(58, 118, 0, 2048, new ArticulatedPart(li.field_z[4], 58, 118, new PartInstruction[]{new PartInstruction("Front3Leg")}), true), new PartInstruction(73, 118, 0, 2048, new ArticulatedPart(li.field_z[9], 73, 118, new PartInstruction[]{new PartInstruction("Front4Leg")}))}))}))})), new PartInstruction(110, 98, 16384, 0, 2), new PartInstruction(46, 25, 15384, 2730, 144, true), new PartInstruction(83, 33, 15384, 2730, 144, true), new PartInstruction(83, 40, 15384, 2730, 144, true), new PartInstruction(34, 28, 16384, 0, 8), new PartInstruction(34, 38, 16384, 0, 2052), new PartInstruction(34, 38, 16384, 0, 1024, true)});
                                var1.componentId = 55;
                                var1 = wh.a(0, var1);
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(Sentinel.field_nc[4], 2, 60, 62, -16384, 4096, new PartInstruction[]{new PartInstruction("Aghilla Head"), new PartInstruction(50, 2, 575), new PartInstruction(50, 0)});
                                var1.componentId = 60;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(Sentinel.field_nc[5], 8, 63, 50, -16384, 4096, new PartInstruction[]{new PartInstruction("Aghilla Shoulder"), new PartInstruction(50, 0, 235), new PartInstruction(100, 60)});
                                var1.componentId = 59;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(Sentinel.field_nc[7], 4, 64, 45, -13107, 8192, new PartInstruction[]{new PartInstruction("Aghilla Arm"), new PartInstruction(50, 0, 175), new PartInstruction(50, 0), new PartInstruction(64, 74, 8192, 8192, new ArticulatedPart(Sentinel.field_nc[8], 49, 57, new PartInstruction[]{new PartInstruction(83, 59, 16384, 0, 16, true), new PartInstruction(79, 63, 16384, 0, 128), new PartInstruction(79, 71, 16384, 0, 128)}))});
                                var1.componentId = 58;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(Sentinel.field_nc[7], 1024, 64, 45, -21845, 8192, new PartInstruction[]{new PartInstruction("Aghilla Rear Arm"), new PartInstruction(64, 74, 8192, 8192, new ArticulatedPart(Sentinel.field_nc[8], 49, 57, new PartInstruction[]{new PartInstruction(83, 59, 16384, 0, 16, true), new PartInstruction(79, 63, 16384, 0, 128), new PartInstruction(79, 71, 16384, 0, 128)}))});
                                var1.componentId = 98;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(Sentinel.field_nc[0], 1, 58, 176, 0, 0, new PartInstruction[]{new PartInstruction("Aghilla Chassis"), new PartInstruction(250, 2, 725), new PartInstruction(68), new PartInstruction(440, 225), new PartInstruction(62, 62, 0, 0, new ArticulatedPart(Sentinel.field_nc[3], 62, 62, new PartInstruction[]{new PartInstruction("Torso"), new PartInstruction(60, 95, 2000, 2048, new ArticulatedPart(Sentinel.field_nc[1], 61, 48, new PartInstruction[]{new PartInstruction("Back0Leg"), new PartInstruction(63, 83, 1000, 2048, new ArticulatedPart(Sentinel.field_nc[2], 62, 45, new PartInstruction[]{new PartInstruction("Back1Leg")}))}), true), new PartInstruction(60, 95, -5000, 2048, new ArticulatedPart(Sentinel.field_nc[1], 61, 48, new PartInstruction[]{new PartInstruction("Front0Leg"), new PartInstruction(63, 83, 5000, 2048, new ArticulatedPart(Sentinel.field_nc[2], 62, 44, new PartInstruction[]{new PartInstruction("Front1Leg")}))}))}), true), new PartInstruction(65, 43, 16384, 0, 1024, true), new PartInstruction(65, 28, 16384, 0, 2), new PartInstruction(57, 43, 16384, 0, 4), new PartInstruction(57, 33, 16384, 0, 8)});
                                var1.componentId = 57;
                                var1 = wh.a(0, var1);
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(Sprite.field_b[7], 2, 99, 80, -16384, 4096, new PartInstruction[]{new PartInstruction("Turtle Head"), new PartInstruction(150, 1, 350), new PartInstruction(108, 76, 16384, 0, 16)});
                                var1.componentId = 61;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(Sprite.field_b[1], 1, 63, 120, 0, 0, new PartInstruction[]{new PartInstruction("Turtle Chassis"), new PartInstruction(600, 4, 1250), new PartInstruction(128), new PartInstruction(0, 225), new PartInstruction(43, 58, 0, 0, new ArticulatedPart(Sprite.field_b[0], 43, 58, new PartInstruction[]{new PartInstruction("B0"), new PartInstruction(21, 70, 0, 0, new ArticulatedPart(Sprite.field_b[3], 78, 67, new PartInstruction[]{new PartInstruction("B1"), new PartInstruction(55, 92, 0, 0, new ArticulatedPart(Sprite.field_b[4], 55, 92, new PartInstruction[]{new PartInstruction("B2"), new PartInstruction(76, 113, 0, 0, new ArticulatedPart(Sprite.field_b[5], 76, 113, new PartInstruction[]{new PartInstruction("B3")}), true), new PartInstruction(76, 113, 0, 0, new ArticulatedPart(Sprite.field_b[6], 76, 113, new PartInstruction[]{new PartInstruction("B4")}), true)}))})), new PartInstruction(21, 70, 0, 0, new ArticulatedPart(Sprite.field_b[3], 78, 67, new PartInstruction[]{new PartInstruction("2B1"), new PartInstruction(55, 92, 0, 0, new ArticulatedPart(Sprite.field_b[4], 55, 92, new PartInstruction[]{new PartInstruction("2B2"), new PartInstruction(76, 113, 0, 0, new ArticulatedPart(Sprite.field_b[5], 76, 113, new PartInstruction[]{new PartInstruction("2B3")}), true), new PartInstruction(76, 113, 0, 0, new ArticulatedPart(Sprite.field_b[6], 76, 113, new PartInstruction[]{new PartInstruction("2B4")}), true)}))}), true)})), new PartInstruction(80, 61, 0, 0, new ArticulatedPart(Sprite.field_b[2], 80, 61, new PartInstruction[]{new PartInstruction("F0"), new PartInstruction(105, 78, 16384, 0, 2, true), new PartInstruction(78, 67, 16384, 0, 8), new PartInstruction(78, 67, 0, 0, new ArticulatedPart(Sprite.field_b[3], 78, 67, new PartInstruction[]{new PartInstruction("F1"), new PartInstruction(55, 92, 0, 0, new ArticulatedPart(Sprite.field_b[4], 55, 92, new PartInstruction[]{new PartInstruction("F2"), new PartInstruction(76, 113, 0, 0, new ArticulatedPart(Sprite.field_b[5], 76, 113, new PartInstruction[]{new PartInstruction("F3")}), true), new PartInstruction(76, 113, 0, 0, new ArticulatedPart(Sprite.field_b[6], 76, 113, new PartInstruction[]{new PartInstruction("F4")}), true)}))})), new PartInstruction(78, 67, 0, 0, new ArticulatedPart(Sprite.field_b[3], 78, 67, new PartInstruction[]{new PartInstruction("2F1"), new PartInstruction(55, 92, 0, 0, new ArticulatedPart(Sprite.field_b[4], 55, 92, new PartInstruction[]{new PartInstruction("2F2"), new PartInstruction(76, 113, 0, 0, new ArticulatedPart(Sprite.field_b[5], 76, 113, new PartInstruction[]{new PartInstruction("2F3")}), true), new PartInstruction(76, 113, 0, 0, new ArticulatedPart(Sprite.field_b[6], 76, 113, new PartInstruction[]{new PartInstruction("2F4")}), true)}))}), true), new PartInstruction(98, 31, 16384, 4096, 144, true)})), new PartInstruction(41, 50, 0, 8192, new ArticulatedPart(Sprite.field_b[9], 63, 60, new PartInstruction[]{new PartInstruction(60, 43, 16384, 0, 384, true), new PartInstruction(60, 57, 16384, 0, 384, true)})), new PartInstruction(58, 28, 8192, 8192, 96, true)});
                                var1.componentId = 62;
                                var1 = wh.a(0, var1);
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(cf.field_u[9], 2, 66, 23, -16384, 4096, new PartInstruction[]{new PartInstruction("Commando Head"), new PartInstruction(50, 3, 775)});
                                var1.componentId = 64;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(cf.field_u[10], 8, 65, 35, -24576, 13107, new PartInstruction[]{new PartInstruction("Commando Shoulder"), new PartInstruction(50, 0, 75), new PartInstruction(82, 12, 16384, 0, 144, true), new PartInstruction(82, 16, 16384, 0, 144, true)});
                                var1.componentId = 67;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(cf.field_u[7], 4, 65, 32, -29672, 8192, new PartInstruction[]{new PartInstruction("Commando Arm"), new PartInstruction(100, 0, 200), new PartInstruction(65, 75, 12288, 4096, new ArticulatedPart(jd.field_qb[6], 50, 63, new PartInstruction[]{new PartInstruction(74, 62, 16384, 0, 32)}), true)});
                                var1.componentId = 66;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(cf.field_u[5], 1024, 64, 38, -18384, 10922, new PartInstruction[]{new PartInstruction("Commando Rear Arm"), new PartInstruction(65, 75, 1000, 4096, new ArticulatedPart(cf.field_u[6], 38, 75, new PartInstruction[]{new PartInstruction(70, 70, 16384, 0, 16), new PartInstruction(70, 84, 16384, 0, 16)}), true)});
                                var1.componentId = 99;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(cf.field_u[0], 1, 58, 195, 0, 0, new PartInstruction[]{new PartInstruction("Commando Chassis"), new PartInstruction(400, 2, 1050), new PartInstruction(256), new PartInstruction(350, 250), new PartInstruction(75, 38, 16384, 0, 1024, true), new PartInstruction(49, 32, 0, 0, new ArticulatedPart(cf.field_u[11], 46, 37, new PartInstruction[]{new PartInstruction(57, 97, 0, 0, new ArticulatedPart(cf.field_u[1], 47, 42, new PartInstruction[]{new PartInstruction("Back0Leg"), new PartInstruction(56, 88, 9000, 0, new ArticulatedPart(cf.field_u[2], 64, 17, new PartInstruction[]{new PartInstruction("Back1Leg"), new PartInstruction(61, 54, 0, 0, new ArticulatedPart(cf.field_u[13], 61, 75, new PartInstruction[]{new PartInstruction("BackFoot")}), true)}))}), true), new PartInstruction(57, 97, -5000, 0, new ArticulatedPart(cf.field_u[3], 47, 38, new PartInstruction[]{new PartInstruction("Front0Leg"), new PartInstruction(56, 88, 5000, 0, new ArticulatedPart(cf.field_u[4], 64, 17, new PartInstruction[]{new PartInstruction("Front1Leg"), new PartInstruction(61, 54, 0, 0, new ArticulatedPart(cf.field_u[12], 61, 75, new PartInstruction[]{new PartInstruction("FrontFoot")}), true)}))}))}), true), new PartInstruction(68, 19, 16384, 0, 2), new PartInstruction(62, 28, 16384, 0, 8), new PartInstruction(62, 38, 16384, 0, 4)});
                                var1.componentId = 65;
                                var1 = wh.a(0, var1);
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ParticleEffect.field_L[1], 2, 60, 61, -16384, 0, new PartInstruction[]{new PartInstruction("Hurricane Head"), new PartInstruction(50, 2, 550), new PartInstruction(71, 70, -5461, 9362, new ArticulatedPart(ParticleEffect.field_L[8], 71, 70, new PartInstruction[]{new PartInstruction(78, 77, 16384, 0, 16)}), true)});
                                var1.componentId = 68;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ParticleEffect.field_L[0], 8, 42, 50, -21845, 10922, new PartInstruction[]{new PartInstruction("Hurricane Shoulder"), new PartInstruction(50, 0, 175), new PartInstruction(65, 60, 16384, 0, 288, true)});
                                var1.componentId = 71;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ParticleEffect.field_L[9], 4, 62, 55, -8192, 8192, new PartInstruction[]{new PartInstruction("Hurricane Arm"), new PartInstruction(50, 0, 225), new PartInstruction(80, 74, 0, 4096, new ArticulatedPart(ParticleEffect.field_L[10], 52, 60, new PartInstruction[]{new PartInstruction(85, 53, 16384, 0, 128, true), new PartInstruction(85, 60, 16384, 0, 128, true), new PartInstruction(85, 67, 16384, 0, 128, true), new PartInstruction(74, 68, 16384, 0, 144)}))});
                                var1.componentId = 70;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ParticleEffect.field_L[9], 1024, 62, 55, -16384, 8192, new PartInstruction[]{new PartInstruction("Hurricane Rear Arm"), new PartInstruction(80, 74, 0, 4096, new ArticulatedPart(ParticleEffect.field_L[10], 52, 60, new PartInstruction[]{new PartInstruction(85, 53, 16384, 0, 128, true), new PartInstruction(85, 60, 16384, 0, 128, true), new PartInstruction(85, 67, 16384, 0, 128, true), new PartInstruction(74, 68, 16384, 0, 144)}))});
                                var1.componentId = 100;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ParticleEffect.field_L[5], 1, 58, 169, 0, 0, new PartInstruction[]{new PartInstruction("Hurricane Chassis"), new PartInstruction(300, 3, 1325), new PartInstruction(256), new PartInstruction(275, 150), new PartInstruction(64, 57, 0, 0, new ArticulatedPart(ParticleEffect.field_L[7], 63, 79, new PartInstruction[]{new PartInstruction("TopChassis"), new PartInstruction(110, 67, 16384, 0, 2), new PartInstruction(94, 73, 16384, 0, 4), new PartInstruction(39, 40, 16384, 0, 8), new PartInstruction(94, 73, 16384, 0, 1024, true)})), new PartInstruction(43, 80, 0, 0, new ArticulatedPart(ParticleEffect.field_L[2].b(), 77, 51, new PartInstruction[]{new PartInstruction("B0"), new PartInstruction(50, 77, 0, 0, new ArticulatedPart(ParticleEffect.field_L[3].b(), 76, 77, new PartInstruction[]{new PartInstruction("B1"), new PartInstruction(54, 58, 0, 0, new ArticulatedPart(ParticleEffect.field_L[4].b(), 76, 31, new PartInstruction[]{new PartInstruction("B2")}))}))}), true), new PartInstruction(62, 83, 0, 0, new ArticulatedPart(ParticleEffect.field_L[14], 69, 64, new PartInstruction[]{new PartInstruction("MB0"), new PartInstruction(68, 40, 0, 0, new ArticulatedPart(ParticleEffect.field_L[13].b(), 64, 38, new PartInstruction[]{new PartInstruction("MB1"), new PartInstruction(64, 67, 0, 0, new ArticulatedPart(ParticleEffect.field_L[12].b(), 64, 17, new PartInstruction[]{new PartInstruction("MB2")}))}))}), true), new PartInstruction(58, 83, 0, 0, new ArticulatedPart(ParticleEffect.field_L[16], 62, 40, new PartInstruction[]{new PartInstruction("MF0"), new PartInstruction(62, 68, 0, 0, new ArticulatedPart(ParticleEffect.field_L[15].b(), 68, 64, new PartInstruction[]{new PartInstruction("MF1"), new PartInstruction(68, 42, 0, 0, new ArticulatedPart(ParticleEffect.field_L[17].b(), 63, 25, new PartInstruction[]{new PartInstruction("MF2")}))}))})), new PartInstruction(80, 80, 0, 0, new ArticulatedPart(ParticleEffect.field_L[2], 51, 51, new PartInstruction[]{new PartInstruction("F0"), new PartInstruction(78, 77, 0, 0, new ArticulatedPart(ParticleEffect.field_L[3], 52, 77, new PartInstruction[]{new PartInstruction("F1"), new PartInstruction(74, 58, 0, 0, new ArticulatedPart(ParticleEffect.field_L[4], 52, 31, new PartInstruction[]{new PartInstruction("F2")}))}))}), true)});
                                var1.componentId = 69;
                                var1 = wh.a(0, var1);
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ng.field_c[15], 2, 84, 115, -16384, 4096, new PartInstruction[]{new PartInstruction("Scorpion Head"), new PartInstruction(150, 2, 575)});
                                var1.componentId = 74;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ui.field_V[10], 8, 113, 118, -16384, 2048, new PartInstruction[]{new PartInstruction("Scorpion Tail"), new PartInstruction(100, 0, 200), new PartInstruction(142, 54, 16384, 0, 128, true), new PartInstruction(142, 61, 16384, 0, 128, true), new PartInstruction(142, 68, 16384, 0, 128, true), new PartInstruction(142, 75, 16384, 0, 128, true), new PartInstruction(142, 82, 16384, 0, 128, true), new PartInstruction(142, 88, 16384, 0, 128, true)});
                                var1.componentId = 73;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ng.field_c[17], 1, 120, 170, 0, 0, new PartInstruction[]{new PartInstruction("Scorpion Chassis"), new PartInstruction(300, 5, 2150), new PartInstruction(250, 0), new PartInstruction(256), new PartInstruction(91, 108, 0, 0, new ArticulatedPart(ng.field_c[16], 91, 108, new PartInstruction[]{new PartInstruction("SA"), new PartInstruction(27, 61, -3276, 6553, new ArticulatedPart(ng.field_c[11], 27, 61, new PartInstruction[]{new PartInstruction(76, 40, 11384, 0, 32, false)}), param0), new PartInstruction(80, 113, 0, 0, new ArticulatedPart(ng.field_c[1], 99, 29, new PartInstruction[]{new PartInstruction("LA"), new PartInstruction(53, 68, 0, 0, new ArticulatedPart(ng.field_c[0], 53, 68, new PartInstruction[]{new PartInstruction("BA")}), false)}), false)}), false), new PartInstruction(143, 71, 14336, 4096, 64, true), new PartInstruction(126, 103, 0, 0, new ArticulatedPart(ng.field_c[18], 11, 103, new PartInstruction[]{new PartInstruction("SC"), new PartInstruction(35, 105, 0, 0, new ArticulatedPart(ng.field_c[10], 55, 67, new PartInstruction[]{new PartInstruction("PC"), new PartInstruction(55, 42, 0, 0, new ArticulatedPart(ng.field_c[9], 55, 43, new PartInstruction[]{new PartInstruction("LC"), new PartInstruction(62, 96, 0, 0, new ArticulatedPart(ng.field_c[8], 62, 96, new PartInstruction[]{new PartInstruction("BC")}), false)}), false)}), false), new PartInstruction(8, 76, 16384, 0, 8, true), new PartInstruction(56, 105, 0, 0, new ArticulatedPart(ng.field_c[19], 56, 105, new PartInstruction[]{new PartInstruction("SD"), new PartInstruction(98, 114, 16384, 1024, 2, true), new PartInstruction(70, 110, 0, 8192, new ArticulatedPart(ng.field_c[12], 70, 110, new PartInstruction[]{new PartInstruction(86, 93, 16384, 0, 144, true)}), false), new PartInstruction(70, 110, 0, 0, new ArticulatedPart(ng.field_c[5], 20, 29, new PartInstruction[]{new PartInstruction("LD"), new PartInstruction(82, 82, 0, 0, new ArticulatedPart(ng.field_c[4], 82, 82, new PartInstruction[]{new PartInstruction("BD")}), false)}), false)}), false)}), false)});
                                var1.componentId = 72;
                                var1 = wh.a(0, var1);
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(vc.field_b[7], 2, 83, 85, -16384, 4096, new PartInstruction[]{new PartInstruction("Crusher Head"), new PartInstruction(400, 0, 225), new PartInstruction(110, 58, 16384, 0, 144, true)});
                                var1.componentId = 78;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(vc.field_b[0], 32, 76, 171, -16384, 0, new PartInstruction[]{new PartInstruction("Crusher Mounting"), new PartInstruction(0, 0, 50), new PartInstruction(91, 166, 16384, 0, 144, true), new PartInstruction(91, 177, 16384, 0, 144, true)});
                                var1.componentId = 83;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(vc.field_b[2], 4, 64, 103, -16384, 4096, new PartInstruction[]{new PartInstruction("Crusher Arm"), new PartInstruction(200, 0, 400), new PartInstruction(64, 147, 0, 0, new ArticulatedPart(vc.field_b[1], 64, 147, new PartInstruction[]{new PartInstruction(87, 147, 16384, 0, 32), new PartInstruction(76, 171, 16384, 0, 32)}))});
                                var1.componentId = 76;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(vc.field_b[2], 1024, 64, 103, -16384, 4096, new PartInstruction[]{new PartInstruction("Crusher Rear Arm"), new PartInstruction(64, 147, 0, 0, new ArticulatedPart(vc.field_b[14], 86, 147, new PartInstruction[]{}))});
                                var1.componentId = 102;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(vc.field_b[3], 8, 64, 93, -16384, 2048, new PartInstruction[]{new PartInstruction("Crusher Wing"), new PartInstruction(400, 100), new PartInstruction(100, 0, 475), new PartInstruction(73, 91, 16384, 0, 144, true)});
                                var1.componentId = 77;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(vc.field_b[10], 1, 66, 263, 0, 0, new PartInstruction[]{new PartInstruction("Crusher Chassis"), new PartInstruction(500, 5, 2500), new PartInstruction(0, 200), new PartInstruction(64), new PartInstruction(66, 152, 0, 0, new ArticulatedPart(vc.field_b[9], 66, 152, new PartInstruction[]{new PartInstruction("C1"), new PartInstruction(65, 172, 0, 0, new ArticulatedPart(vc.field_b[6], 65, 172, new PartInstruction[]{new PartInstruction("C2"), new PartInstruction(85, 200, 0, 0, new ArticulatedPart(vc.field_b[5], 85, 200, new PartInstruction[]{new PartInstruction("C3"), new PartInstruction(44, 234, 0, 0, new ArticulatedPart(vc.field_b[4], 42, 219, new PartInstruction[]{new PartInstruction("C4"), new PartInstruction(57, 241, 0, 0, new ArticulatedPart(vc.field_b[16], 57, 241, new PartInstruction[]{new PartInstruction("C5")}))}))}))})), new PartInstruction(70, 172, 0, 0, new ArticulatedPart(vc.field_b[11], 70, 172, new PartInstruction[]{new PartInstruction("C6"), new PartInstruction(95, 200, 0, 0, new ArticulatedPart(vc.field_b[12], 95, 200, new PartInstruction[]{new PartInstruction("C7"), new PartInstruction(53, 231, 0, 0, new ArticulatedPart(vc.field_b[13], 51, 219, new PartInstruction[]{new PartInstruction("C8"), new PartInstruction(67, 243, 0, 0, new ArticulatedPart(vc.field_b[17], 71, 245, new PartInstruction[]{new PartInstruction("C9")}))}))}))}), true)})), new PartInstruction(69, 138, 0, 0, new ArticulatedPart(vc.field_b[8], 69, 138, new PartInstruction[]{new PartInstruction("C10"), new PartInstruction(83, 85, 16384, 0, 2), new PartInstruction(64, 93, 16384, 0, 8), new PartInstruction(64, 103, 16384, 0, 2052), new PartInstruction(47, 101, 6553, 4096, 64, true)})), new PartInstruction(86, 103, 16384, 0, 1024, true)});
                                var1.componentId = 75;
                                var1 = wh.a(0, var1);
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ui.field_V[7], 2, 150, 112, -16384, 4096, new PartInstruction[]{new PartInstruction("Bertha Head"), new PartInstruction(300, 1, 400), new PartInstruction(-300, -300)});
                                var1.componentId = 82;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ui.field_V[6], 2048, 100, 122, -16384, 4096, new PartInstruction[]{new PartInstruction("Bertha Arm"), new PartInstruction(300, 0, 350), new PartInstruction(143, 111, 16384, 0, 128, true), new PartInstruction(151, 121, 16384, 0, 128, true), new PartInstruction(156, 131, 16384, 0, 128, true), new PartInstruction(156, 141, 16384, 0, 128, true), new PartInstruction(156, 151, 16384, 0, 128, true), new PartInstruction(156, 161, 16384, 0, 128, true), new PartInstruction(156, 171, 16384, 0, 128, true)});
                                var1.componentId = 80;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ui.field_V[11], 1024, 108, 153, -16384, 4096, new PartInstruction[]{new PartInstruction("Bertha Rear Arm"), new PartInstruction(108, 153, 0, 4096, new ArticulatedPart(ui.field_V[8], 113, 162, new PartInstruction[]{new PartInstruction(144, 180, 16384, 0, 32)}), true), new PartInstruction(145, 115, 13384, 0, 256, true)});
                                var1.componentId = 103;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ui.field_V[10], 8, 113, 113, -16384, 8192, new PartInstruction[]{new PartInstruction("Bertha Wing"), new PartInstruction(200, 0, 550), new PartInstruction(142, 58, 16384, 0, 256, true), new PartInstruction(142, 71, 16384, 0, 256, true), new PartInstruction(142, 84, 16384, 0, 256, true)});
                                var1.componentId = 81;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ui.field_V[5], 1, 128, 258, 0, 0, new PartInstruction[]{new PartInstruction("Bertha Chassis"), new PartInstruction(800, 3, 1650), new PartInstruction(64), new PartInstruction(-500, 50), new PartInstruction(128, 221, 0, 0, new ArticulatedPart(ui.field_V[0], 128, 221, new PartInstruction[]{new PartInstruction("A")})), new PartInstruction(113, 113, 16384, 0, 8), new PartInstruction(100, 122, 16384, 0, 2052), new PartInstruction(100, 90, 16384, 0, 1024, true), new PartInstruction(150, 112, 16384, 0, 2, true), new PartInstruction(167, 191, 13384, 4096, 64, true)});
                                var1.componentId = 79;
                                var1 = wh.a(0, var1);
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(hk.field_Ec[8], 2, 154, 97, -16384, 8192, new PartInstruction[]{new PartInstruction("Orbital Head"), new PartInstruction(150, 3, 825)});
                                var1.componentId = 87;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(hk.field_Ec[11], 4, 125, 100, -16384, 4096, new PartInstruction[]{new PartInstruction("Orbital Arm"), new PartInstruction(150, 0, 575), new PartInstruction(116, 140, 24576, 4096, 64)});
                                var1.componentId = 85;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(hk.field_Ec[1], 1024, 150, 100, -16384, 4096, new PartInstruction[]{new PartInstruction("Orbital Back arm"), new PartInstruction(116, 140, -4096, 2048, new ArticulatedPart(hk.field_Ec[0], 116, 140, new PartInstruction[]{new PartInstruction(171, 160, 20480, 0, 32, true)}), true)});
                                var1.componentId = 104;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(hk.field_Ec[10], 8, 125, 91, -16384, 8192, new PartInstruction[]{new PartInstruction("Orbital Wing"), new PartInstruction(50, 0, 625), new PartInstruction(600, 0)});
                                var1.componentId = 86;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(hk.field_Ec[9], 1, 146, 257, 0, 4096, new PartInstruction[]{new PartInstruction("Orbital Chassis"), new PartInstruction(300, 4, 2150), new PartInstruction(16), new PartInstruction(250, 0), new PartInstruction(150, 100, 16384, 0, 1024, true), new PartInstruction(156, 94, 0, 0, new ArticulatedPart(hk.field_Ec[7], 156, 94, new PartInstruction[]{new PartInstruction(154, 97, 16384, 0, 2)}), true), new PartInstruction(186, 121, 16384, 4096, 32, true), new PartInstruction(170, 105, 16384, 0, 128), new PartInstruction(168, 112, 16384, 0, 128), new PartInstruction(166, 119, 16384, 0, 128), new PartInstruction(128, 128, 0, 0, new ArticulatedPart(hk.field_Ec[13], 128, 128, new PartInstruction[]{})), new PartInstruction(125, 90, 16384, 0, 8), new PartInstruction(125, 100, 16384, 0, 4), new PartInstruction(105, 106, 6553, 0, new ArticulatedPart(hk.field_Ec[3], 115, 116, new PartInstruction[]{new PartInstruction("A"), new PartInstruction(113, 155, -4096, 0, new ArticulatedPart(hk.field_Ec[4], 113, 155, new PartInstruction[]{new PartInstruction("B"), new PartInstruction(131, 200, -4096, 0, new ArticulatedPart(hk.field_Ec[5], 131, 203, new PartInstruction[]{new PartInstruction("C")}))}), true)}), true), new PartInstruction(120, 116, 4096, 0, new ArticulatedPart(hk.field_Ec[3], 115, 116, new PartInstruction[]{new PartInstruction("D"), new PartInstruction(113, 155, -4096, 0, new ArticulatedPart(hk.field_Ec[4], 113, 155, new PartInstruction[]{new PartInstruction("E"), new PartInstruction(131, 200, -4096, 0, new ArticulatedPart(hk.field_Ec[5], 131, 203, new PartInstruction[]{new PartInstruction("F")}))}), true)}), true), new PartInstruction(135, 126, 3276, 2048, new ArticulatedPart(hk.field_Ec[3], 115, 116, new PartInstruction[]{new PartInstruction(113, 155, -5461, 2048, new ArticulatedPart(hk.field_Ec[4], 113, 155, new PartInstruction[]{new PartInstruction(131, 200, 10923, 2048, new ArticulatedPart(hk.field_Ec[6], 131, 203, new PartInstruction[]{new PartInstruction(138, 202, 16384, 0, 16)}))}), true)}), true)});
                                var1.componentId = 84;
                                var1 = wh.a(0, var1);
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ne.field_R[20], 2, 153, 58, -16384, 8192, new PartInstruction[]{new PartInstruction("Valhalla Head"), new PartInstruction(250, 2, 625)});
                                var1.componentId = 91;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ne.field_R[3], 2048, 120, 73, -16384, 4096, new PartInstruction[]{new PartInstruction("Valhalla Arm"), new PartInstruction(300, 0, 650), new PartInstruction(121, 31, 13884, 0, 256, true), new PartInstruction(123, 39, 13884, 0, 256, true), new PartInstruction(87, 98, 0, 10922, new ArticulatedPart(ne.field_R[4], 87, 98, new PartInstruction[]{new PartInstruction("Energy Blade"), new PartInstruction(65, 126, 29384, 0, 128, true), new PartInstruction(75, 120, 29384, 0, 128), new PartInstruction(70, 123, 29384, 0, 128, true)}))});
                                var1.componentId = 89;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ne.field_R[0], 1024, 120, 73, -26384, 4096, new PartInstruction[]{new PartInstruction("Valhalla Back arm"), new PartInstruction(81, 97, 0, 4096, new ArticulatedPart(ne.field_R[1], 81, 97, new PartInstruction[]{new PartInstruction(98, 117, 26384, 0, 32, true)}), true)});
                                var1.componentId = 105;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ne.field_R[13], 8, 128, 52, -16384, 4096, new PartInstruction[]{new PartInstruction("Valhalla Wing"), new PartInstruction(200, 0, 500), new PartInstruction(130, 51, 16384, 0, 64, true)});
                                var1.componentId = 90;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ne.field_R[12], 1, 146, 293, 0, 0, new PartInstruction[]{new PartInstruction("Valhalla Chassis"), new PartInstruction(700, 4, 2350), new PartInstruction(16), new PartInstruction(0, 400), new PartInstruction(103, 142, 0, 0, new ArticulatedPart(ne.field_R[14], 103, 142, new PartInstruction[]{new PartInstruction("Front0Leg"), new PartInstruction(135, 203, 0, 0, new ArticulatedPart(ne.field_R[15], 135, 140, new PartInstruction[]{new PartInstruction("Front1Leg"), new PartInstruction(130, 153, 0, 0, new ArticulatedPart(ne.field_R[16], 128, 221, new PartInstruction[]{new PartInstruction("Front2Leg")})), new PartInstruction(108, 206, 0, 0, new ArticulatedPart(ne.field_R[17], 108, 206, new PartInstruction[]{new PartInstruction("Front3Leg"), new PartInstruction(138, 231, 0, 0, new ArticulatedPart(ne.field_R[18], 132, 213, new PartInstruction[]{new PartInstruction("Front4Leg")}), true)}))}))})), new PartInstruction(107, 142, 0, 0, new ArticulatedPart(ne.field_R[7], 103, 142, new PartInstruction[]{new PartInstruction("Back0Leg"), new PartInstruction(135, 203, 0, 0, new ArticulatedPart(ne.field_R[8], 135, 140, new PartInstruction[]{new PartInstruction("Back1Leg"), new PartInstruction(130, 153, 0, 0, new ArticulatedPart(ne.field_R[9], 128, 221, new PartInstruction[]{new PartInstruction("Back2Leg")})), new PartInstruction(108, 206, 0, 0, new ArticulatedPart(ne.field_R[10], 108, 206, new PartInstruction[]{new PartInstruction("Back3Leg"), new PartInstruction(138, 231, 0, 0, new ArticulatedPart(ne.field_R[11], 132, 213, new PartInstruction[]{new PartInstruction("Back4Leg")}), true)}))}))}), true), new PartInstruction(133, 63, 16384, 0, 1024, true), new PartInstruction(107, 104, 0, 0, new ArticulatedPart(ne.field_R[19], 107, 104, new PartInstruction[]{new PartInstruction("TopChassis"), new PartInstruction(153, 58, 16384, 0, 2), new PartInstruction(120, 62, 16384, 0, 8), new PartInstruction(120, 73, 16384, 0, 2052)}))});
                                var1.componentId = 88;
                                var1 = wh.a(0, var1);
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(wi.field_C[9], 2, 100, 148, -16384, 4096, new PartInstruction[]{new PartInstruction("Babel Head"), new PartInstruction(500, 1, 500)});
                                var1.componentId = 95;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(wi.field_C[2], 2048, 125, 91, -16384, 8192, new PartInstruction[]{new PartInstruction("Babel Arm"), new PartInstruction(700, 0, 850), new PartInstruction(125, 159, 0, 4096, new ArticulatedPart(wi.field_C[1], 97, 93, new PartInstruction[]{new PartInstruction(146, 168, 27384, 0, 256), new PartInstruction(111, 181, 27384, 0, 256), new PartInstruction(172, 151, 27384, 0, 256)}))});
                                var1.componentId = 93;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(wi.field_C[12], 1024, 128, 99, -16384, 4096, new PartInstruction[]{new PartInstruction("Babel Back arm"), new PartInstruction(126, 179, 0, 4096, new ArticulatedPart(wi.field_C[14], 101, 143, new PartInstruction[]{new PartInstruction(121, 162, 16384, 0, 64, true)}), true)});
                                var1.componentId = 106;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(wi.field_C[10], 1, 146, 405, 0, 0, new PartInstruction[]{new PartInstruction("Babel Chassis"), new PartInstruction(1800, 5, 2750), new PartInstruction(16), new PartInstruction(-600, 600), new PartInstruction(136, 145, 16384, 0, 1024, true), new PartInstruction(216, 101, 16384, 4096, 128, true), new PartInstruction(216, 111, 16384, 4096, 128, true), new PartInstruction(216, 121, 16384, 4096, 128, true), new PartInstruction(210, 182, 16384, 4096, 2, true), new PartInstruction(208, 82, 16384, 4096, 128, true), new PartInstruction(187, 201, 16384, 4096, 128, true), new PartInstruction(187, 211, 16384, 4096, 128, true), new PartInstruction(187, 221, 16384, 4096, 128, true), new PartInstruction(136, 145, 16384, 0, 2052), new PartInstruction(129, 220, 0, 0, new ArticulatedPart(wi.field_C[11], 136, 134, new PartInstruction[]{new PartInstruction("B1"), new PartInstruction(131, 154, 0, 0, new ArticulatedPart(wi.field_C[8], 131, 96, new PartInstruction[]{new PartInstruction("B2"), new PartInstruction(129, 140, 0, 0, new ArticulatedPart(wi.field_C[5], 129, 103, new PartInstruction[]{new PartInstruction("B3"), new PartInstruction(155, 157, 0, 0, new ArticulatedPart(wi.field_C[4], 153, 100, new PartInstruction[]{new PartInstruction("B4"), new PartInstruction(163, 105, 0, 0, new ArticulatedPart(wi.field_C[3], 124, 120, new PartInstruction[]{new PartInstruction("B5")})), new PartInstruction(128, 128, 0, 0, new ArticulatedPart(wi.field_C[6], 128, 128, new PartInstruction[]{new PartInstruction("B6"), new PartInstruction(168, 161, 0, 0, new ArticulatedPart(wi.field_C[7], 138, 222, new PartInstruction[]{new PartInstruction("B7")}), true)}), true)}))})), new PartInstruction(129, 140, 0, 0, new ArticulatedPart(wi.field_C[19], 129, 103, new PartInstruction[]{new PartInstruction("B8"), new PartInstruction(155, 157, 0, 0, new ArticulatedPart(wi.field_C[17], 153, 100, new PartInstruction[]{new PartInstruction("B9"), new PartInstruction(163, 105, 0, 0, new ArticulatedPart(wi.field_C[3], 124, 120, new PartInstruction[]{new PartInstruction("B10")})), new PartInstruction(128, 128, 0, 0, new ArticulatedPart(wi.field_C[13], 128, 128, new PartInstruction[]{new PartInstruction("B11"), new PartInstruction(168, 161, 0, 0, new ArticulatedPart(wi.field_C[7], 138, 222, new PartInstruction[]{new PartInstruction("B12")}), true)}), true)}))}), true)}))}), true), new PartInstruction(156, 70, 17384, 6553, 64, true)});
                                var1.componentId = 92;
                                var1 = wh.a(0, var1);
                                ao.field_H.addLast(3, var1);
                                var2 = new int[]{17, 18, 19, 20, 21, 22, 27};
                                var3 = 0;
                                statePc = 58;
                                continue scanLoop1;
                            } catch (Throwable stateCaught_57) {
                                statePc = (stateCaught_57 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_57);
                                }
                                caughtException = stateCaught_57;
                                continue scanLoop1;
                            }
                        }
                        default: return;
                    }
                }
            }
            void runPartition2() {
                scanLoop1: while (true) {
                    switch (statePc) {
                        case 58: {
                            try {
                                if (var2.length <= var3) {
                                    statePc = 63;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 59. */
                                    {
                                        var1 = new ArticulatedPart(si.field_l[var2[var3] + 11], 16, 32, 39, 0, 1024, new PartInstruction[]{new PartInstruction(NodeHashTable.field_i[-17 + var2[var3]]), new PartInstruction(0, 0, 10)});
                                        var1.componentId = var2[var3];
                                        ao.field_H.addLast(3, var1);
                                        var3++;
                                        if (var4 != 0) {
                                            statePc = 64;
                                            continue scanLoop1;
                                        } else {
                                            /* Inlined CFG state: 60. */
                                            {
                                                if (var4 == 0) {
                                                    statePc = 58;
                                                    continue scanLoop1;
                                                } else {
                                                    /* Inlined CFG state: 61. */
                                                    {
                                                        statePc = 63;
                                                        continue scanLoop1;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable stateCaught_58) {
                                statePc = (stateCaught_58 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_58);
                                }
                                caughtException = stateCaught_58;
                                continue scanLoop1;
                            }
                        }
                        case 63: {
                            try {
                                var2 = new int[]{28, 29, 30};
                                statePc = 64;
                                continue scanLoop1;
                            } catch (Throwable stateCaught_63) {
                                statePc = (stateCaught_63 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_63);
                                }
                                caughtException = stateCaught_63;
                                continue scanLoop1;
                            }
                        }
                        case 64: {
                            try {
                                var3 = 0;
                                statePc = 65;
                                continue scanLoop1;
                            } catch (Throwable stateCaught_64) {
                                statePc = (stateCaught_64 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_64);
                                }
                                caughtException = stateCaught_64;
                                continue scanLoop1;
                            }
                        }
                        case 65: {
                            try {
                                if (var2.length <= var3) {
                                    statePc = 70;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 66. */
                                    {
                                        var1 = new ArticulatedPart(si.field_l[11 + var2[var3]], 32, 32, 32, 0, 1024, new PartInstruction[]{new PartInstruction(NodeHashTable.field_i[var2[var3] - 17]), new PartInstruction(0, 0, 35)});
                                        var1.componentId = var2[var3];
                                        ao.field_H.addLast(3, var1);
                                        var3++;
                                        if (var4 != 0) {
                                            statePc = 71;
                                            continue scanLoop1;
                                        } else {
                                            /* Inlined CFG state: 67. */
                                            {
                                                if (var4 == 0) {
                                                    statePc = 65;
                                                    continue scanLoop1;
                                                } else {
                                                    /* Inlined CFG state: 68. */
                                                    {
                                                        statePc = 70;
                                                        continue scanLoop1;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable stateCaught_65) {
                                statePc = (stateCaught_65 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_65);
                                }
                                caughtException = stateCaught_65;
                                continue scanLoop1;
                            }
                        }
                        case 70: {
                            try {
                                var2 = new int[]{23, 24, 25, 26};
                                statePc = 71;
                                continue scanLoop1;
                            } catch (Throwable stateCaught_70) {
                                statePc = (stateCaught_70 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_70);
                                }
                                caughtException = stateCaught_70;
                                continue scanLoop1;
                            }
                        }
                        case 71: {
                            try {
                                var3 = 0;
                                statePc = 72;
                                continue scanLoop1;
                            } catch (Throwable stateCaught_71) {
                                statePc = (stateCaught_71 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_71);
                                }
                                caughtException = stateCaught_71;
                                continue scanLoop1;
                            }
                        }
                        case 72: {
                            try {
                                if (~var3 <= ~var2.length) {
                                    statePc = 77;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 73. */
                                    {
                                        var1 = new ArticulatedPart(si.field_l[-17 + var2[var3] + 28], 128, 32, 27, 0, 1024, new PartInstruction[]{new PartInstruction(NodeHashTable.field_i[-17 + var2[var3]]), new PartInstruction(0, 0, 10)});
                                        var1.componentId = var2[var3];
                                        ao.field_H.addLast(3, var1);
                                        var3++;
                                        if (var4 != 0) {
                                            statePc = 78;
                                            continue scanLoop1;
                                        } else {
                                            /* Inlined CFG state: 74. */
                                            {
                                                if (var4 == 0) {
                                                    statePc = 72;
                                                    continue scanLoop1;
                                                } else {
                                                    /* Inlined CFG state: 75. */
                                                    {
                                                        statePc = 77;
                                                        continue scanLoop1;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable stateCaught_72) {
                                statePc = (stateCaught_72 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_72);
                                }
                                caughtException = stateCaught_72;
                                continue scanLoop1;
                            }
                        }
                        case 77: {
                            try {
                                var2 = new int[]{36, 37, 51, 50};
                                statePc = 78;
                                continue scanLoop1;
                            } catch (Throwable stateCaught_77) {
                                statePc = (stateCaught_77 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_77);
                                }
                                caughtException = stateCaught_77;
                                continue scanLoop1;
                            }
                        }
                        case 78: {
                            try {
                                var3 = 0;
                                statePc = 79;
                                continue scanLoop1;
                            } catch (Throwable stateCaught_78) {
                                statePc = (stateCaught_78 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_78);
                                }
                                caughtException = stateCaught_78;
                                continue scanLoop1;
                            }
                        }
                        case 79: {
                            try {
                                if (var2.length <= var3) {
                                    statePc = 89;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 80. */
                                    {
                                        if (var4 != 0) {
                                            statePc = 90;
                                            continue scanLoop1;
                                        } else {
                                            /* Inlined CFG state: 81. */
                                            {
                                                PartInstruction[] array$2 = new PartInstruction[2];
                                                stackIn_85_0 = null;
                                                stackIn_82_0 = stackIn_85_0;
                                                stackIn_85_1 = null;
                                                stackIn_82_1 = stackIn_85_1;
                                                stackIn_85_2 = si.field_l[var2[var3] + 28 - 17];
                                                stackIn_82_2 = stackIn_85_2;
                                                stackIn_85_3 = 256;
                                                stackIn_82_3 = stackIn_85_3;
                                                stackIn_85_4 = 32;
                                                stackIn_82_4 = stackIn_85_4;
                                                stackIn_85_5 = 22;
                                                stackIn_82_5 = stackIn_85_5;
                                                stackIn_85_6 = 0;
                                                stackIn_82_6 = stackIn_85_6;
                                                stackIn_85_7 = 1024;
                                                stackIn_82_7 = stackIn_85_7;
                                                stackIn_85_8 = (PartInstruction[]) (array$2);
                                                stackIn_82_8 = stackIn_85_8;
                                                stackIn_85_9 = (PartInstruction[]) (array$2);
                                                stackIn_82_9 = stackIn_85_9;
                                                stackIn_85_10 = 1;
                                                stackIn_82_10 = stackIn_85_10;
                                                stackIn_85_11 = null;
                                                stackIn_82_11 = stackIn_85_11;
                                                stackIn_85_12 = null;
                                                stackIn_82_12 = stackIn_85_12;
                                                stackIn_85_13 = 0;
                                                stackIn_82_13 = stackIn_85_13;
                                                stackIn_85_14 = 0;
                                                stackIn_82_14 = stackIn_85_14;
                                                if (var2[var3] != 50) {
                                                    statePc = 85;
                                                } else {
                                                    statePc = 82;
                                                }
                                                continue scanLoop1;
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable stateCaught_79) {
                                statePc = (stateCaught_79 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_79);
                                }
                                caughtException = stateCaught_79;
                                continue scanLoop1;
                            }
                        }
                        case 82: {
                            try {
                                /* Sequential CFG blocks: 82, 84. */
                                {
                                    stackIn_84_0 = null;
                                    stackIn_84_1 = null;
                                    stackIn_84_2 = stackIn_82_2;
                                    stackIn_84_3 = stackIn_82_3;
                                    stackIn_84_4 = stackIn_82_4;
                                    stackIn_84_5 = stackIn_82_5;
                                    stackIn_84_6 = stackIn_82_6;
                                    stackIn_84_7 = stackIn_82_7;
                                    stackIn_84_8 = stackIn_82_8;
                                    stackIn_84_9 = stackIn_82_9;
                                    stackIn_84_10 = stackIn_82_10;
                                    stackIn_84_11 = null;
                                    stackIn_84_12 = null;
                                    stackIn_84_13 = stackIn_82_13;
                                    stackIn_84_14 = stackIn_82_14;
                                }
                                {
                                    stackIn_88_0 = null;
                                    stackIn_88_1 = null;
                                    stackIn_88_2 = stackIn_84_2;
                                    stackIn_88_3 = stackIn_84_3;
                                    stackIn_88_4 = stackIn_84_4;
                                    stackIn_88_5 = stackIn_84_5;
                                    stackIn_88_6 = stackIn_84_6;
                                    stackIn_88_7 = stackIn_84_7;
                                    stackIn_88_8 = stackIn_84_8;
                                    stackIn_88_9 = stackIn_84_9;
                                    stackIn_88_10 = stackIn_84_10;
                                    stackIn_88_11 = null;
                                    stackIn_88_12 = null;
                                    stackIn_88_13 = stackIn_84_13;
                                    stackIn_88_14 = stackIn_84_14;
                                    stackIn_88_15 = 500;
                                    statePc = 88;
                                    continue scanLoop1;
                                }
                            } catch (Throwable stateCaught_82) {
                                statePc = (stateCaught_82 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_82);
                                }
                                caughtException = stateCaught_82;
                                continue scanLoop1;
                            }
                        }
                        case 85: {
                            try {
                                stackIn_87_0 = null;
                                stackIn_86_0 = stackIn_87_0;
                                stackIn_87_1 = null;
                                stackIn_86_1 = stackIn_87_1;
                                stackIn_87_2 = stackIn_85_2;
                                stackIn_86_2 = stackIn_87_2;
                                stackIn_87_3 = stackIn_85_3;
                                stackIn_86_3 = stackIn_87_3;
                                stackIn_87_4 = stackIn_85_4;
                                stackIn_86_4 = stackIn_87_4;
                                stackIn_87_5 = stackIn_85_5;
                                stackIn_86_5 = stackIn_87_5;
                                stackIn_87_6 = stackIn_85_6;
                                stackIn_86_6 = stackIn_87_6;
                                stackIn_87_7 = stackIn_85_7;
                                stackIn_86_7 = stackIn_87_7;
                                stackIn_87_8 = stackIn_85_8;
                                stackIn_86_8 = stackIn_87_8;
                                stackIn_87_9 = stackIn_85_9;
                                stackIn_86_9 = stackIn_87_9;
                                stackIn_87_10 = stackIn_85_10;
                                stackIn_86_10 = stackIn_87_10;
                                stackIn_87_11 = null;
                                stackIn_86_11 = stackIn_87_11;
                                stackIn_87_12 = null;
                                stackIn_86_12 = stackIn_87_12;
                                stackIn_87_13 = stackIn_85_13;
                                stackIn_86_13 = stackIn_87_13;
                                stackIn_87_14 = stackIn_85_14;
                                stackIn_86_14 = stackIn_87_14;
                                if (var2[var3] != 37) {
                                    /* Inlined CFG state: 87. */
                                    {
                                        stackIn_88_0 = null;
                                        stackIn_88_1 = null;
                                        stackIn_88_2 = stackIn_87_2;
                                        stackIn_88_3 = stackIn_87_3;
                                        stackIn_88_4 = stackIn_87_4;
                                        stackIn_88_5 = stackIn_87_5;
                                        stackIn_88_6 = stackIn_87_6;
                                        stackIn_88_7 = stackIn_87_7;
                                        stackIn_88_8 = stackIn_87_8;
                                        stackIn_88_9 = stackIn_87_9;
                                        stackIn_88_10 = stackIn_87_10;
                                        stackIn_88_11 = null;
                                        stackIn_88_12 = null;
                                        stackIn_88_13 = stackIn_87_13;
                                        stackIn_88_14 = stackIn_87_14;
                                        stackIn_88_15 = 100;
                                        statePc = 88;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 86. */
                                    {
                                        stackIn_88_0 = null;
                                        stackIn_88_1 = null;
                                        stackIn_88_2 = stackIn_86_2;
                                        stackIn_88_3 = stackIn_86_3;
                                        stackIn_88_4 = stackIn_86_4;
                                        stackIn_88_5 = stackIn_86_5;
                                        stackIn_88_6 = stackIn_86_6;
                                        stackIn_88_7 = stackIn_86_7;
                                        stackIn_88_8 = stackIn_86_8;
                                        stackIn_88_9 = stackIn_86_9;
                                        stackIn_88_10 = stackIn_86_10;
                                        stackIn_88_11 = null;
                                        stackIn_88_12 = null;
                                        stackIn_88_13 = stackIn_86_13;
                                        stackIn_88_14 = stackIn_86_14;
                                        stackIn_88_15 = 50;
                                        statePc = 88;
                                        continue scanLoop1;
                                    }
                                }
                            } catch (Throwable stateCaught_85) {
                                statePc = (stateCaught_85 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_85);
                                }
                                caughtException = stateCaught_85;
                                continue scanLoop1;
                            }
                        }
                        case 88: {
                            try {
                                stackIn_88_9[stackIn_88_10] = new PartInstruction(stackIn_88_13, stackIn_88_14, stackIn_88_15);
                                var1 = new ArticulatedPart(stackIn_88_2, stackIn_88_3, stackIn_88_4, stackIn_88_5, stackIn_88_6, stackIn_88_7, stackIn_88_8);
                                var1.componentId = var2[var3];
                                ao.field_H.addLast(3, var1);
                                var3++;
                                if (var4 == 0) {
                                    statePc = 79;
                                } else {
                                    statePc = 89;
                                }
                                continue scanLoop1;
                            } catch (Throwable stateCaught_88) {
                                statePc = (stateCaught_88 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_88);
                                }
                                caughtException = stateCaught_88;
                                continue scanLoop1;
                            }
                        }
                        case 89: {
                            try {
                                var1 = new ArticulatedPart(jd.field_qb[5], 512, 64, 64, 0, 1024, new PartInstruction[]{new PartInstruction(NodeHashTable.field_i[32]), new PartInstruction(0, 0, 1000)});
                                var1.componentId = 49;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(Sprite.field_b[8], 32, 64, 96, 0, 1024, new PartInstruction[]{new PartInstruction(NodeHashTable.field_i[14]), new PartInstruction(0, 0, 100)});
                                var1.componentId = 31;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ne.field_R[2], 32, 98, 144, 0, 1024, new PartInstruction[]{new PartInstruction(NodeHashTable.field_i[18]), new PartInstruction(0, 0, 100)});
                                var1.componentId = 35;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(cf.field_u[8], 32, 80, 69, 0, 1024, new PartInstruction[]{new PartInstruction(NodeHashTable.field_i[15]), new PartInstruction(0, 0, 100)});
                                var1.componentId = 32;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ParticleEffect.field_L[11], 32, 59, 65, 0, 1024, new PartInstruction[]{new PartInstruction(NodeHashTable.field_i[16]), new PartInstruction(0, 0, 100)});
                                var1.componentId = 33;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ng.field_c[14], 32, 49, 52, 0, 1024, new PartInstruction[]{new PartInstruction(NodeHashTable.field_i[17]), new PartInstruction(0, 0, 100)});
                                var1.componentId = 34;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ui.field_V[9], 32, 132, 124, 0, 1024, new PartInstruction[]{new PartInstruction(NodeHashTable.field_i[21]), new PartInstruction(0, 0, 100)});
                                var1.componentId = 38;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ng.field_c[13], 64, 65, 96, 0, 1024, new PartInstruction[]{new PartInstruction(NodeHashTable.field_i[26]), new PartInstruction(0, 0, 500)});
                                var1.componentId = 43;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(wi.field_C[15], 64, 115, 157, 0, 1024, new PartInstruction[]{new PartInstruction(NodeHashTable.field_i[31]), new PartInstruction(0, 0, 500)});
                                var1.componentId = 48;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(wi.field_C[0], 64, 143, 152, 0, 1024, new PartInstruction[]{new PartInstruction(NodeHashTable.field_i[35]), new PartInstruction(0, 0, 500)});
                                var1.componentId = 52;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ne.field_R[6], 64, 39, 127, 0, 1024, new PartInstruction[]{new PartInstruction(NodeHashTable.field_i[29]), new PartInstruction(0, 0, 500)});
                                var1.componentId = 46;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(vc.field_b[15], 64, 147, 168, 0, 1024, new PartInstruction[]{new PartInstruction(NodeHashTable.field_i[28]), new PartInstruction(0, 0, 500)});
                                var1.componentId = 45;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(ui.field_V[4], 64, 114, 145, 0, 1024, new PartInstruction[]{new PartInstruction(NodeHashTable.field_i[27]), new PartInstruction(0, 0, 500)});
                                var1.componentId = 44;
                                ao.field_H.addLast(3, var1);
                                var1 = new ArticulatedPart(hk.field_Ec[12], 64, 117, 140, 0, 1024, new PartInstruction[]{new PartInstruction(NodeHashTable.field_i[30]), new PartInstruction(0, 0, 500)});
                                var1.componentId = 47;
                                ao.field_H.addLast(3, var1);
                                hc.field_bb = new ArticulatedPart[110];
                                statePc = 90;
                                continue scanLoop1;
                            } catch (Throwable stateCaught_89) {
                                statePc = (stateCaught_89 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_89);
                                }
                                caughtException = stateCaught_89;
                                continue scanLoop1;
                            }
                        }
                        case 90: {
                            try {
                                var3 = 0;
                                statePc = 91;
                                continue scanLoop1;
                            } catch (Throwable stateCaught_90) {
                                statePc = (stateCaught_90 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_90);
                                }
                                caughtException = stateCaught_90;
                                continue scanLoop1;
                            }
                        }
                        case 91: {
                            try {
                                if (var3 >= 110) {
                                    statePc = 98;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 92. */
                                    {
                                        hc.field_bb[var3] = NodeDeque.a(var3, (byte) 67);
                                        var3++;
                                        if (var4 != 0) {
                                            statePc = 98;
                                            continue scanLoop1;
                                        } else {
                                            /* Inlined CFG state: 93. */
                                            {
                                                if (var4 == 0) {
                                                    statePc = 91;
                                                    continue scanLoop1;
                                                } else {
                                                    /* Inlined CFG state: 94. */
                                                    {
                                                        statePc = 98;
                                                        continue scanLoop1;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable stateCaught_91) {
                                statePc = (stateCaught_91 instanceof RuntimeException ? 97 : -1);
                                if (statePc == -1) {
                                    throw BattleTerrain.<RuntimeException>$cfr$sneakyThrow(stateCaught_91);
                                }
                                caughtException = stateCaught_91;
                                continue scanLoop1;
                            }
                        }
                        case 97: {
                            var1_ref2 = (RuntimeException) ((Object) caughtException);
                            throw ci.a((Throwable) ((Object) var1_ref2), "hd.A(" + param0 + ')');
                        }
                        case 98: {
                            if (!GameApplet.field_i) {
                                statePc = 101;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 99. */
                                {
                                    var4++;
                                    SteelSentinels.obfuscationControl = var4;
                                    statePc = 101;
                                    continue scanLoop1;
                                }
                            }
                        }
                        case 101: {
                            finished = true; return;
                        }
                        default: return;
                    }
                }
            }
            void run() {
                while (!finished) {
                    if (statePc <= 53) {
                        runPartition0();
                    }
                    else if (statePc <= 57) {
                        runPartition1();
                    }
                    else if (statePc <= 101) {
                        runPartition2();
                    }
                    else {
                        throw new IllegalStateException("invalid CFG state " + statePc);
                    }
                }
            }
        }
        $CfrPartitionedState decompiledState = new $CfrPartitionedState(param0);
        decompiledState.run();
    }

    final int getGroundHeightAt(byte obfuscationGuard, int profileIndex) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (profileIndex < 0) {
            stackIn_2_0 = this.groundHeightProfile[0];
            return stackIn_2_0;
          }
          if (obfuscationGuard > -94) {
            stackIn_5_0 = 52;
            return stackIn_5_0;
          }
          if (this.profileLength > profileIndex) {
            stackIn_10_0 = this.groundHeightProfile[profileIndex];
            return stackIn_10_0;
          }
          stackIn_8_0 = this.groundHeightProfile[this.profileLength - 1];
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "hd.H(" + obfuscationGuard + ',' + profileIndex + ')');
        }
    }

    public static void b(boolean param0) {
        if (param0) {
          return;
        }
        try {
          field_g = null;
          field_d = null;
          field_q = null;
          field_k = null;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "hd.D(" + param0 + ')');
        }
    }

    BattleTerrain(int param0, int param1) {
        try {
          this.a(1200, param1, param0);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "hd.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_g = "You haven't enough solarite cubes to engineer the <%0> at this time.<br><br>Earn more solarite cubes by playing Rated games.";
        field_a = 0;
        field_d = "You need to play <%0> more rated games to unlock this option.";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
