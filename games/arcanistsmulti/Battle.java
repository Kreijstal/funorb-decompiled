/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class Battle {
    int field_mb;
    private int field_w;
    private DualLinkDeque removedProjectiles;
    IndexedSprite terrainSprite;
    private int[] field_ib;
    int field_t;
    int field_hb;
    NameTable field_Ib;
    int playerCount;
    int[] field_pb;
    private boolean field_Gb;
    static String[] field_qb;
    private int[] field_a;
    private boolean field_Mb;
    boolean field_M;
    private int[] field_E;
    private boolean waitingForInput;
    int[] field_Eb;
    int randomSeed;
    private IntrusiveNodeHashTable unitsById;
    int field_Hb;
    int field_tb;
    int[] field_Ab;
    boolean[] field_u;
    int arenaWidth;
    int field_G;
    int[] field_Ob;
    private int[] field_ob;
    static Calendar field_Bb;
    int[] field_c;
    int[] field_U;
    static int[] field_z;
    int[] field_X;
    IntrusiveDeque spawnedProjectiles;
    int[] field_R;
    int weakestPlayer;
    private int unitIdCounter;
    int healthiestPlayer;
    private int field_m;
    PcmSample[] unitSamples;
    IntrusiveDeque projectiles;
    private int previousPlayer;
    int[] field_cb;
    IntrusiveDeque units;
    int[] field_o;
    int[] field_ab;
    private int round;
    int[] field_s;
    private int field_xb;
    int[] field_wb;
    static SceneWidget field_j;
    int[] field_b;
    private IntrusiveDeque actionQueue;
    private int[][] spellRecharge;
    boolean animating;
    String[] playerNames;
    boolean field_f;
    int[] field_db;
    int[] playerSpellbook;
    int[] field_n;
    int[] field_p;
    int[] field_K;
    private IndexedSprite terrainMask;
    int[] field_Nb;
    DualLinkDeque field_h;
    int arenaHeight;
    int[] field_S;
    int field_Y;
    boolean teamMode;
    private boolean field_l;
    private int[] field_fb;
    private boolean field_eb;
    private int[][] spellSlots;
    boolean field_Z;
    PcmSample[] projectileSamples;
    int[] field_T;
    int field_F;
    IntrusiveDeque field_r;
    private int[][] spellCharges;
    int[][] field_N;
    private int currentPlayer;
    static int field_W;
    private boolean[][] field_L;
    private boolean turnActive;
    int[] field_Fb;
    static JaggrabDownloader field_P;
    int[] field_gb;
    int[] field_g;
    private int arenaTheme;
    static String field_yb;
    static String field_e;
    static SceneWidget field_A;
    static int[] field_Lb;

    private final int drawDebugOverlay(int obfuscationGuard, boolean printToConsole) {
        boolean stackIn_10_0 = false;
        int stackIn_14_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_31_0 = 0;
        boolean stackOut_9_0;
        boolean stackOut_16_0;
        int var3;
        IntrusiveDequeCursor var4;
        BattleUnit var5_ref_ml;
        SpellProjectile var5_ref_mi;
        int var5;
        int var6;
        int var7;
        SpellProjectile var5_ref_miLifetime1;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        var3 = 0;
        var4 = new IntrusiveDequeCursor(this.units);
        var5_ref_ml = (BattleUnit) (var4.first(-99));
        while (true) {
          if (var5_ref_ml == null) {
            var4.setDeque((byte) 82, this.projectiles);
            break;
          }
          var3 = var3 + ((var5_ref_ml.subpixelY + 11) * (var5_ref_ml.subpixelX + 5) + (var5_ref_ml.field_q * 13 + (7 * var5_ref_ml.health + var5_ref_ml.unitType)) * (1 + var5_ref_ml.unitId));
          if (var7 == 0) {
            if (printToConsole) {
              System.out.println("UNIT:" + var5_ref_ml.unitId);
              System.out.println("X:" + var5_ref_ml.x + " Y:" + var5_ref_ml.y);
              System.out.println("Health:" + var5_ref_ml.health + " TYPE:" + var5_ref_ml.unitType);
              System.out.println("TOWER HEALTH:" + var5_ref_ml.field_q);
            }
            var5_ref_ml = (BattleUnit) (var4.next(-18502));
            continue;
          }
          break;
        }
        var5_ref_mi = (SpellProjectile) (var4.first(-60));
        while (true) {
          if (var5_ref_mi == null) {
            var4.setDeque((byte) 31, this.field_r);
            stackIn_14_0 = -104 / ((-60 - obfuscationGuard) / 40);
            break;
          }
          stackOut_9_0 = var5_ref_mi.isPersistentType(-36);
          stackIn_14_0 = stackOut_9_0 ? 1 : 0;
          stackIn_10_0 = stackOut_9_0;
          if (var7 == 0) {
            if (!stackIn_10_0) {
              var3 = var3 + ((var5_ref_mi.ageTicks + var5_ref_mi.field_H * 29) * (23 + var5_ref_mi.spellType) + (var5_ref_mi.subpixelX + 17) * 19 * var5_ref_mi.subpixelY);
            }
            var5_ref_mi = (SpellProjectile) (var4.next(-18502));
            continue;
          }
          break;
        }
        var6 = stackIn_14_0;
        var5_ref_miLifetime1 = (SpellProjectile) (var4.first(-104));
        while (true) {
          if (var5_ref_miLifetime1 == null) {
            var3 = var3 + this.field_mb;
            stackIn_22_0 = 999;
            break;
          }
          stackOut_16_0 = var5_ref_miLifetime1.isPersistentType(-83);
          stackIn_22_0 = stackOut_16_0 ? 1 : 0;
          stackIn_17_0 = stackOut_16_0;
          if (var7 == 0) {
            if (!stackIn_17_0) {
              var3 = var3 + (19 * (var5_ref_miLifetime1.subpixelY * (var5_ref_miLifetime1.subpixelX + 17)) + (23 + var5_ref_miLifetime1.spellType) * (var5_ref_miLifetime1.field_H * 29 + var5_ref_miLifetime1.ageTicks));
            }
            var5_ref_miLifetime1 = (SpellProjectile) (var4.next(-18502));
            continue;
          }
          break;
        }
        if (stackIn_22_0 != ~this.field_mb) {
          var3 = var3 + this.field_t * 1001;
        }
        var5 = this.terrainMask.field_m.length - 1;
        while (0 <= var5) {
          stackIn_31_0 = ~this.terrainMask.field_m[var5];
          if (var7 != 0) {
            return stackIn_31_0;
          }
          if (stackIn_31_0 != -1) {
            var3 = var3 + (37 + (var5 & 7) * 37);
          }
          var5--;
        }
        return var3;
    }

    final BattleUnit getUnitByOwner(int unitId, boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          this.field_u = (boolean[]) null;
        }
        return (BattleUnit) (this.unitsById.get((long)unitId, (byte) -87));
    }

    final boolean spriteOverlapsTerrain(int y, int obfuscationGuard, int x, Sprite sprite) {
        RuntimeException var5 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 2) {
            Battle.releaseStatics(-29);
          }
          stackIn_3_0 = SoundEffectVoice.spriteHitsMask(this, y, this.terrainMask, x, (byte) -1, sprite);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("nf.JC(").append(y).append(',').append(obfuscationGuard).append(',').append(x).append(',');
          if (sprite == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final void drawThemeBackground(byte param0) {
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        byte stackIn_43_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        byte stackOut_42_1;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_37_0Lifetime1;
        int stackIn_37_1Lifetime1;
        int stackIn_51_0Lifetime1;
        int stackIn_51_1Lifetime1;
        int var2Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var5Lifetime2;
        int var7Lifetime2;
        int var8Lifetime2;
        int var6Lifetime1Lifetime1;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        if (null != DropdownList.field_I) {
          var2 = DropdownList.field_I[this.arenaTheme].field_m.length - 1;
          while (true) {
            if (var2 >= 0) {
              var2--;
              if (var10 == 0) {
                continue;
              }
            } else {
              MatchingFieldValidator.field_y.field_l[253] = 11184810;
              MatchingFieldValidator.field_y.field_l[251] = 16777215;
              MatchingFieldValidator.field_y.field_l[252] = 16777215;
            }
            break;
          }
          MatchingFieldValidator.field_y.field_l[254] = 7829367;
        }
        var2Lifetime1 = 16384;
        var3 = 18048;
        if (var3 > DropdownList.field_I[this.arenaTheme].field_m.length) {
          var3 = DropdownList.field_I[this.arenaTheme].field_m.length;
        }
        var4 = 2;
        if (0 == this.arenaTheme) {
          var4 = 4;
        }
        if (this.arenaTheme == 5) {
          var4 = 4;
        }
        regionExit1: {
          var5 = 0;
          if (this.arenaTheme != 6) {
            var6 = 0;
            scanLoop2: while (true) {
              stackIn_19_0 = ~this.arenaHeight;
              stackIn_19_1 = ~var6;
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_19_0 < stackIn_19_1) {
                stackIn_49_0 = 0;
                decompiledFrameRemainder0 = (var10 == 0);
                if (decompiledFrameRemainder0) {
                  var7 = stackIn_49_0;
                  while (true) {
                    stackIn_23_0 = ~this.arenaWidth;
                    stackIn_23_1 = ~var7;
                    if (stackIn_23_0 < stackIn_23_1) {
                      stackIn_19_0 = this.arenaWidth;
                      stackIn_19_1 = var5;
                      if (stackIn_19_0 <= stackIn_19_1 &&
                        MatchingFieldValidator.field_y.field_m[var5] == -5 &&
                        -5 != MatchingFieldValidator.field_y.field_m[var5 - this.arenaWidth]) {
                        var8 = var6 - 5;
                        var9 = (127 & var7) + var2Lifetime1;
                        while (var9 < var3) {
                          stackIn_37_0 = -1;
                          stackIn_37_1 = ~DropdownList.field_I[this.arenaTheme].field_m[var9];
                          if (stackIn_37_0 != stackIn_37_1) {
                            DisplayNameForm.carveMask(var7, this.terrainSprite, 0, 125, this, false, var8 - var4, DropdownList.field_I[this.arenaTheme].field_m[var9]);
                          }
                          var8++;
                          var9 += 128;
                        }
                      }
                      stackIn_37_0Lifetime1 = ~(-this.arenaWidth + MatchingFieldValidator.field_y.field_m.length);
                      stackIn_37_1Lifetime1 = ~var5;
                      if (stackIn_37_0Lifetime1 < stackIn_37_1Lifetime1 &&
                        MatchingFieldValidator.field_y.field_m[var5] == -5 &&
                        MatchingFieldValidator.field_y.field_m[this.arenaWidth + var5] != -5) {
                        var8 = var6 - 1;
                        var9Lifetime1 = (var7 & 127) + var3;
                        while (!(var9Lifetime1 >= DropdownList.field_I[this.arenaTheme].field_m.length)) {
                          stackIn_23_0 = 0;
                          stackOut_42_1 = DropdownList.field_I[this.arenaTheme].field_m[var9Lifetime1];
                          stackIn_23_1 = stackOut_42_1;
                          stackIn_43_1 = stackOut_42_1;
                          if (stackIn_23_0 != stackIn_43_1) {
                            DisplayNameForm.carveMask(var7, this.terrainSprite, 0, 125, this, false, var8, DropdownList.field_I[this.arenaTheme].field_m[var9Lifetime1]);
                          }
                          var8++;
                          var9Lifetime1 += 128;
                        }
                      }
                      var5++;
                      var7++;
                      continue;
                    }
                    break;
                  }
                  var6++;
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                var5 = 0;
                stackIn_49_0 = 0;
              }
              var6 = stackIn_49_0;
              while (true) {
                stackIn_51_0 = this.arenaHeight;
                stackIn_51_1 = var6;
                if (stackIn_51_0 <= stackIn_51_1) {
                  break scanLoop2;
                }
                stackIn_72_0 = 0;
                if (var10 != 0) {
                  break regionExit1;
                }
                var7Lifetime2 = stackIn_72_0;
                while (this.arenaWidth > var7Lifetime2) {
                  stackIn_51_0Lifetime1 = -1;
                  stackIn_51_1Lifetime1 = ~var5;
                  if (stackIn_51_0Lifetime1 > stackIn_51_1Lifetime1 &&
                    MatchingFieldValidator.field_y.field_m[var5] == -5 &&
                    MatchingFieldValidator.field_y.field_m[-1 + var5] != -5 &&
                    0 == MatchingFieldValidator.field_y.field_m[-1 + var5] ||
                    !(var5 >= (-1 + MatchingFieldValidator.field_y.field_m.length)) &&
                    MatchingFieldValidator.field_y.field_m[var5] == -5 &&
                    -5 != MatchingFieldValidator.field_y.field_m[1 + var5] &&
                    MatchingFieldValidator.field_y.field_m[var5 + 1] == 0) {
                    var8Lifetime2 = (var7Lifetime2 & 127) + var3 - 128;
                    if (DropdownList.field_I[this.arenaTheme].field_m[var8Lifetime2] != 0) {
                      DisplayNameForm.carveMask(var7Lifetime2, this.terrainSprite, 0, 12, this, false, var6, DropdownList.field_I[this.arenaTheme].field_m[var8Lifetime2]);
                    }
                  }
                  var5++;
                  var7Lifetime2++;
                }
                var6++;
              }
            }
          }
          var5Lifetime2 = 0;
          stackIn_72_0 = param0;
        }
        if (stackIn_72_0 != 5) {
          this.field_K = (int[]) null;
        }
        if (null != DropdownList.field_I) {
          var6Lifetime1 = 0;
          var7Lifetime1 = 0;
          while (true) {
            stackIn_77_0 = ~var7Lifetime1;
            stackIn_77_1 = ~this.arenaHeight;
            if (stackIn_77_0 > stackIn_77_1) {
              var6Lifetime1Lifetime1 = (127 & var7Lifetime1) << 7;
              var5Lifetime1 = var7Lifetime1 * this.arenaWidth;
              if (var10 != 0) {
                break;
              }
              var8Lifetime1 = 0;
              while (var8Lifetime1 < this.arenaWidth) {
                stackIn_77_0 = 4;
                stackIn_77_1 = ~this.terrainSprite.field_m[var5Lifetime1];
                if (stackIn_77_0 == stackIn_77_1) {
                  this.terrainSprite.field_m[var5Lifetime1] = DropdownList.field_I[this.arenaTheme].field_m[var6Lifetime1Lifetime1];
                }
                var5Lifetime1++;
                var6Lifetime1Lifetime1 = 1 + var6Lifetime1Lifetime1 & 16383;
                var8Lifetime1++;
              }
              var7Lifetime1++;
              continue;
            }
            break;
          }
        }
    }

    private final void placeTerrainDecorations(int[] param0, IsaacRandom random, byte obfuscationGuard) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        byte stackIn_9_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_1 = 0;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        String stackIn_114_2 = null;
        StringBuilder stackIn_116_1 = null;
        String stackIn_117_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_8_1;
        int var4_int = 0;
        RuntimeException var4 = null;
        IndexedSprite var5 = null;
        int var6 = 0;
        Sprite var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        IndexedSprite var20 = null;
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var4_int = ScreenDisplayMode.randomBelow(random, 8, (byte) -61) + 8 * this.arenaTheme;
          var6 = -115 % ((obfuscationGuard + 59) / 54);
          var5 = SocketConnector.field_j[var4_int];
          var7 = new Sprite(512, 512);
          var8 = 128;
          scanLoop1: while (var8 < -128 + this.arenaWidth) {
            var9 = 0;
            if (var19 != 0) {
              return;
            }
            var10 = 0;
            scanLoop2: while (true) {
              var10++;
              var11 = 0;
              var12 = 0;
              var13 = -(var5.field_h / 4) + var8;
              while (true) {
                stackIn_7_0 = ~var11;
                stackIn_7_1 = ~(-8 + this.arenaHeight);
                if (stackIn_7_0 > stackIn_7_1) {
                  stackIn_12_0 = 0;
                  stackOut_8_1 = MatchingFieldValidator.field_y.field_m[var13];
                  stackIn_12_1 = stackOut_8_1;
                  stackIn_9_1 = stackOut_8_1;
                  if (stackIn_12_0 == stackIn_9_1) {
                    var13 = var13 + this.arenaWidth;
                    var11++;
                    continue;
                  }
                }
                stackIn_12_0 = var5.field_h / 2;
                stackIn_12_1 = var8;
                var13 = stackIn_12_0 + stackIn_12_1;
                while (var12 < -8 + this.arenaHeight) {
                  stackIn_18_0 = -1;
                  stackIn_18_1 = ~MatchingFieldValidator.field_y.field_m[var13];
                  if (stackIn_18_0 == stackIn_18_1) {
                    var12++;
                    var13 = var13 + this.arenaWidth;
                    continue;
                  }
                  break;
                }
                stackIn_18_0 = var8;
                stackIn_18_1 = var5.field_h / 4;
                regionExit3: {
                  boolean decompiledFrameRemainder1 = true;
                  boolean decompiledFrameRemainder0 = true;
                  var13 = stackIn_18_0 - stackIn_18_1;
                  if (PasswordFieldPainter.field_D[var4_int]) {
                    stackIn_21_0 = Math.abs(var11 - var12);
                    if (WeightedLruCache.field_a[var4_int]) {
                      stackIn_22_1 = var5.field_h / 2;
                    } else {
                      stackIn_22_1 = var5.field_h;
                    }
                    decompiledFrameRemainder0 = !(stackIn_21_0 >= stackIn_22_1);
                  }
                  if (decompiledFrameRemainder0) {
                    decompiledFrameRemainder1 = !((2 * var5.field_c) < (var12 + var11));
                  }
                  if (decompiledFrameRemainder1) {
                    var4_int = ScreenDisplayMode.randomBelow(random, 8, (byte) -26) + 8 * this.arenaTheme;
                    var5 = SocketConnector.field_j[var4_int];
                    break regionExit3;
                  }
                  var9 = 1;
                  var14 = (var12 + var11) / 2;
                  var15 = 0;
                  var15 = -LoginMessageTable.computeAngle(var5.field_h / 2, (-var11 + var12) / 4, (byte) 98);
                  var15 = var15 & 8191;
                  if (4096 <= var15) {
                    var14 = var12;
                    var8 = var8 + var5.field_h / 4;
                  } else {
                    var8 = var8 - var5.field_h / 4;
                    var14 = var11;
                  }
                  if (!WeightedLruCache.field_a[var4_int]) {
                    var15 = 0;
                  }
                  regionExit4: {
                    if (var4_int != 25 &&
                      26 != var4_int &&
                      var4_int != 27 &&
                      6 != var4_int) {
                      switch (var4_int) {
                        default:
                          break regionExit4;
                        case 7:
                        case 33:
                        case 34:
                        case 35:
                        case 39:
                        case 40:
                        case 42:
                        case 43:
                        case 46:
                        case 47:
                        case 58:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                          break;
                      }
                    }
                    DisplayNameForm.carveMask(var8, MatchingFieldValidator.field_y, var5.field_c / 2, 124, this, false, -(var5.field_c / 4) + var14, (byte) 0);
                    DisplayNameForm.carveMask(var8, this.terrainSprite, var5.field_c / 2, 122, this, false, -(var5.field_c / 4) + var14, (byte) 0);
                    var16 = -var5.field_h / 3;
                    while (!(var16 >= (var5.field_h / 3))) {
                      var17 = (var16 * BevelBoxPainter.cosine(var15, -111) >> 16) + var8;
                      var18 = var14 + var5.field_c * 4 / 10 - (GradientBarPainter.sine(127, var15) * var16 >> 16);
                      DisplayNameForm.carveMask(var17, MatchingFieldValidator.field_y, 2 * var5.field_c / 10, -58, this, false, var18, (byte) -5);
                      DisplayNameForm.carveMask(var17, this.terrainSprite, 2 * var5.field_c / 10, 124, this, false, var18, (byte) -5);
                      var16++;
                    }
                  }
                  var7.makeRasterTarget();
                  SoftwareRasterizer.fillRectangle(0, 0, 512, 512, 0);
                  var16 = var5.field_f + 8 * var5.field_c / 10;
                  var17 = 1;
                  if (var4_int == 25) {
                    var16 -= 16;
                  }
                  if (var4_int == 26) {
                    var16 -= 4;
                  }
                  if (var4_int == 27) {
                    var16 -= 8;
                  }
                  if (var4_int == 28) {
                    var17 = 0;
                    var16 += 8;
                  }
                  if (var4_int == 29) {
                    var17 = 0;
                    var16 += 8;
                  }
                  if (var4_int == 30) {
                    var16 += 16;
                    var17 = 0;
                  }
                  if (var4_int == 31) {
                    var17 = 0;
                  }
                  if (56 == var4_int) {
                    var17 = 0;
                    var16 += 0;
                  }
                  if (57 == var4_int) {
                    var17 = 0;
                    var16 += 16;
                  }
                  if (59 == var4_int) {
                    var16 += 8;
                    var17 = 0;
                  }
                  if (var4_int >= 0 &&
                    8 > var4_int &&
                    0 != var4_int &&
                    var4_int != 2) {
                    var17 = 0;
                  }
                  if (8 <= var4_int &&
                    var4_int < 16) {
                    var17 = 0;
                  }
                  if (40 <= var4_int &&
                    48 > var4_int) {
                    var17 = 0;
                  }
                  if (var4_int >= 32 &&
                    var4_int < 40 &&
                    var4_int != 39) {
                    var17 = 0;
                  }
                  var5.toRgbSprite().drawRotatedAboutPivot(var5.field_h / 2 + var5.field_j << 4, var16 << 4, 4096, 4096, var15 << 3, 4096);
                  this.stampSpriteMask(false, -256 + var8, this.terrainSprite, var17 != 0, -256 + var14, var7);
                  if (26 == var4_int) {
                    var8 += 24;
                  }
                }
                if (var9 == 0 &&
                  var10 < 50) {
                  continue scanLoop2;
                }
                var4_int = ScreenDisplayMode.randomBelow(random, 8, (byte) -83) + this.arenaTheme * 8;
                var20 = SocketConnector.field_j[var4_int];
                var8 = var8 + var20.field_h / 2;
                stackIn_7_0 = 26;
                stackIn_7_1 = var4_int;
                if (stackIn_7_0 == stackIn_7_1) {
                  var8 += 24;
                }
                var8 = var8 + (32 + ScreenDisplayMode.randomBelow(random, 128, (byte) -62));
                continue scanLoop1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_113_0 = var4;
          stackIn_113_1 = new StringBuilder().append("nf.I(");
          if (param0 == null) {
            stackIn_114_2 = "null";
          } else {
            stackIn_114_2 = "{...}";
          }
          stackIn_116_1 = ((StringBuilder) (Object) stackIn_113_1).append(stackIn_114_2).append(',');
          if (random == null) {
            stackIn_117_2 = "null";
          } else {
            stackIn_117_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_113_0), ((StringBuilder) (Object) stackIn_116_1).append(stackIn_117_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void resetTurnState(int obfuscationGuard) {
        int[] dupTemp$0 = null;
        int var2;
        int var3;
        int var4;
        int var5;
        BattleUnit var6;
        int var7;
        int var3Lifetime1;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        this.field_Y = -1;
        this.weakestPlayer = -1;
        this.field_tb = 0;
        this.healthiestPlayer = -1;
        this.animating = false;
        this.field_Gb = false;
        var2 = -13 % ((obfuscationGuard + 59) / 42);
        if (2 < this.playerCount) {
          var3 = 0;
          var4 = 250;
          var5 = 0;
          while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (this.playerCount > var5) {
              var6 = this.getUnitByOwner(var5, true);
              if (var7 == 0) {
                if (var6 != null &&
                  var6.health > 0) {
                  if (this.healthiestPlayer > -1 &&
                    var3 == var6.health) {
                    this.healthiestPlayer = -2;
                  }
                  if (this.weakestPlayer > -1 &&
                    var4 == var6.health) {
                    this.weakestPlayer = -2;
                  }
                  if (-1 == this.healthiestPlayer ||
                    !(var3 >= var6.health)) {
                    this.healthiestPlayer = var5;
                    var3 = var6.health;
                  }
                  if (this.weakestPlayer == -1 ||
                    !(var4 <= var6.health)) {
                    var4 = var6.health;
                    this.weakestPlayer = var5;
                  }
                }
                var5++;
                continue;
              }
            } else {
              decompiledFrameRemainder0 = (-2 == this.healthiestPlayer);
            }
            if (decompiledFrameRemainder0) {
              this.healthiestPlayer = -1;
            }
            if (this.weakestPlayer != -2) {
              break;
            }
            this.weakestPlayer = -1;
            break;
          }
        }
        if (this.round >= this.getTurnTimeLimit(4)) {
          this.generateArenaFeatures(-17837);
        }
        var3Lifetime1 = 0;
        while (var3Lifetime1 < 16) {
          if (var7 == 0) {
            if (this.spellRecharge[this.currentPlayer][var3Lifetime1] > 0) {
              dupTemp$0 = this.spellRecharge[this.currentPlayer];
              dupTemp$0[var3Lifetime1] = dupTemp$0[var3Lifetime1] - 1;
              if (this.spellRecharge[this.currentPlayer][var3Lifetime1] <= 0 &&
                87 != this.spellSlots[this.currentPlayer][var3Lifetime1] &&
                this.spellSlots[this.currentPlayer][var3Lifetime1] != 116) {
                this.spellCharges[this.currentPlayer][var3Lifetime1] = 1;
              }
            }
            var3Lifetime1++;
            continue;
          }
          break;
        }
        this.updateCurrentTurn((byte) 69);
        return;
    }

    final int getCurrentPlayer(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          return -114;
        }
        return this.currentPlayer;
    }

    final boolean hasStats(int obfuscationGuard) {
        if (obfuscationGuard != 1) {
          this.isUnitInRange(false, (BattleUnit) null, 79, -2, -47);
        }
        return this.field_fb != null ? true : false;
    }

    private final int[] generateSixPointProfile(IsaacRandom random, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int[] var19 = null;
        int[] var20 = null;
        IndexedSprite var21 = null;
        IndexedSprite var22 = null;
        IndexedSprite var23 = null;
        IndexedSprite var24 = null;
        IndexedSprite var25 = null;
        IndexedSprite var26 = null;
        IndexedSprite var27 = null;
        IndexedSprite var28 = null;
        IndexedSprite var29 = null;
        IndexedSprite var30 = null;
        IndexedSprite var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var40 = null;
        int[] var41 = null;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        Object stackIn_62_0 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        var18 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3_int = -128 + (this.arenaHeight - 256);
          var4 = 170;
          var34 = new int[6];
          var19 = var34;
          var5 = var19;
          var5[0] = var4 * 3 / 2 + ScreenDisplayMode.randomBelow(random, -(3 * var4) + (this.arenaWidth >> 1), (byte) -90);
          var5[1] = var34[0] - (ScreenDisplayMode.randomBelow(random, var4 / 2, (byte) -39) + var4 / 2);
          var5[2] = var4 / 2 + var34[0] + ScreenDisplayMode.randomBelow(random, var4 / 2, (byte) -97);
          var5[3] = 3 * var4 / 2 + (ScreenDisplayMode.randomBelow(random, -(var4 * 3) + (this.arenaWidth >> 1), (byte) -32) + (this.arenaWidth >> 1));
          var5[4] = -(var4 / 2) + (var34[3] - ScreenDisplayMode.randomBelow(random, var4 / 2, (byte) -44));
          var5[5] = var4 / 2 + var34[3] + ScreenDisplayMode.randomBelow(random, var4 / 2, (byte) -83);
          var7 = var3_int;
          if (var7 < 257) {
            var7 = 257;
          }
          var35 = new int[6];
          var20 = var35;
          var8 = var20;
          var35[3] = var7;
          var35[0] = var7;
          var8[1] = 128 + ScreenDisplayMode.randomBelow(random, var7 - 256, (byte) -113);
          var8[4] = ScreenDisplayMode.randomBelow(random, -256 + var7, (byte) -125) + 128;
          var8[2] = var35[0] - var35[1];
          var8[5] = var35[3] - var35[4];
          var9 = 0;
          while (true) {
            stackIn_6_0 = 6;
            boolean decompiledFrameRemainder0 = true;
            if ((stackIn_6_0 > var9) &&
              (decompiledFrameRemainder0 = (var18 == 0))) {
              if (var34[var9] < (var4 >> 1)) {
                var5[var9] = var4 >> 1;
              }
              if (var34[var9] >= this.arenaWidth - (var4 >> 1)) {
                var5[var9] = -(var4 >> 1) + (this.arenaWidth - 1);
              }
              var10 = 0;
              scanLoop1: while (true) {
                stackIn_16_0 = ~var4;
                stackIn_16_1 = ~var10;
                if (stackIn_16_0 < stackIn_16_1) {
                  stackIn_6_0 = -var35[var9] + this.arenaHeight;
                  var11 = stackIn_6_0;
                  while (var11 < this.arenaHeight) {
                    var6 = -(var4 >> 1) + var10 + var34[var9] + var11 * this.arenaWidth;
                    MatchingFieldValidator.field_y.field_m[var6] = (byte)-5;
                    stackIn_16_0 = -1;
                    stackIn_16_1 = ~var10;
                    if (stackIn_16_0 == stackIn_16_1) {
                      MatchingFieldValidator.field_y.field_m[var6] = (byte) 1;
                    }
                    if (var10 == 1) {
                      MatchingFieldValidator.field_y.field_m[var6] = (byte)2;
                    }
                    if (var4 - 2 == var10) {
                      MatchingFieldValidator.field_y.field_m[var6] = (byte)3;
                    }
                    if (var10 == -1 + var4) {
                      MatchingFieldValidator.field_y.field_m[var6] = (byte)4;
                    }
                    var11++;
                  }
                  var10++;
                  continue scanLoop1;
                }
                break;
              }
              var9++;
              continue;
            }
            if (decompiledFrameRemainder0) {
              System.gc();
              this.terrainSprite = new IndexedSprite(this.arenaWidth, this.arenaHeight, DecodedSpriteHelpers.field_c);
            }
            if (null != DropdownList.field_I) {
              this.terrainSprite.field_l = DropdownList.field_I[this.arenaTheme].field_l;
            }
            this.stampShapeWithMask(0, 120, MatchingFieldValidator.field_y, 0, this.terrainSprite);
            var21 = SocketConnector.field_j[0 + this.arenaTheme * 8];
            this.stampSpriteMask(false, -32 + (var34[0] - 128), this.terrainSprite, true, -var35[0] + (this.arenaHeight - 256) - 120, var21.toRgbSprite());
            var22 = SocketConnector.field_j[this.arenaTheme * 8 + 1];
            this.stampSpriteMask(false, -96 + var34[3], this.terrainSprite, true, -376 + (this.arenaHeight - var35[3]), var22.toRgbSprite());
            var23 = SocketConnector.field_j[3 + this.arenaTheme * 8];
            this.stampSpriteMask(false, var34[4] - 128, this.terrainSprite, true, -32 + (-256 + this.arenaHeight) - var35[4], var23.toRgbSprite());
            var24 = var23.copyFlippedHorizontal();
            this.stampSpriteMask(false, -128 + var34[2], this.terrainSprite, true, -256 + this.arenaHeight + (-var35[2] - param1), var24.toRgbSprite());
            var10 = 0;
            do {
              if (var10 >= 3) {
                var10 = 3;
                break;
              }
              var25 = SocketConnector.field_j[8 * this.arenaTheme + 2];
              this.stampSpriteMask(false, 3 + (var34[var10] - 128), this.terrainSprite, true, -256 + this.arenaHeight - var35[var10], var25.toRgbSprite());
              var26 = SocketConnector.field_j[ScreenDisplayMode.randomBelow(random, 4, (byte) -39) - (-4 - this.arenaTheme * 8)];
              this.stampSpriteMask(false, -192 + var34[var10] + 3, this.terrainSprite, true, -160 + this.arenaHeight, var26.toRgbSprite());
              var27 = SocketConnector.field_j[4 + (ScreenDisplayMode.randomBelow(random, 4, (byte) -100) + this.arenaTheme * 8)];
              this.stampSpriteMask(false, 3 + (-64 + var34[var10]), this.terrainSprite, true, this.arenaHeight - 160, var27.toRgbSprite());
              var10++;
            } while (var18 == 0);
            while (var10 < 6) {
              var28 = SocketConnector.field_j[this.arenaTheme * 8 + 2];
              this.stampSpriteMask(false, 3 + var34[var10] - 128, this.terrainSprite, true, -256 + (this.arenaHeight - var35[var10]), var28.toRgbSprite());
              var29 = SocketConnector.field_j[4 + (ScreenDisplayMode.randomBelow(random, 4, (byte) -56) + this.arenaTheme * 8)];
              this.stampSpriteMask(false, 3 + (var34[var10] - 192), this.terrainSprite, true, -160 + this.arenaHeight, var29.toRgbSprite());
              var30 = SocketConnector.field_j[4 + (ScreenDisplayMode.randomBelow(random, 4, (byte) -127) + 8 * this.arenaTheme)];
              this.stampSpriteMask(false, 3 + (var34[var10] - 64), this.terrainSprite, true, this.arenaHeight - 160, var30.toRgbSprite());
              var10++;
              if (var18 == 0) {
                continue;
              }
              break;
            }
            var40 = new int[1000];
            var41 = new int[1000];
            var12 = 0;
            var13 = 0;
            scanLoop2: while (true) {
              stackIn_48_0 = 1000;
              stackIn_48_1 = var13;
              if (stackIn_48_0 > stackIn_48_1) {
                var33 = SocketConnector.field_j[4 + (ScreenDisplayMode.randomBelow(random, 4, (byte) -60) + this.arenaTheme * 8)];
                var14 = ScreenDisplayMode.randomBelow(random, -256 + this.arenaWidth, (byte) -115);
                var15 = ScreenDisplayMode.randomBelow(random, -256 + this.arenaHeight, (byte) -68);
                var16 = 1;
                if (var18 != 0) {
                  return null;
                }
                var17 = 0;
                while (var17 < var12) {
                  stackIn_48_0 = Math.abs(var40[var17] - var14);
                  stackIn_48_1 = 192;
                  if (stackIn_48_0 < stackIn_48_1 &&
                    Math.abs(var41[var17] - var15) < 192) {
                    var16 = 0;
                  }
                  var17++;
                }
                if (var16 != 0) {
                  var40[var12] = var14;
                  var41[var12] = var15;
                  var12++;
                  this.stampSpriteMask(false, var14, this.terrainSprite, false, var15, var33.toRgbSprite());
                }
                var13++;
                continue scanLoop2;
              }
              break;
            }
            this.stampShapeWithMask(0, 121, this.terrainSprite, 0, MatchingFieldValidator.field_y);
            this.drawThemeBackground((byte) 5);
            stackIn_62_0 = null;
            return (int[]) (stackIn_62_0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_65_0 = var3;
          stackIn_65_1 = new StringBuilder().append("nf.NA(");
          if (random == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void rasterizeTerrainProfile(int[] profile, byte param1) {
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_106_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
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
        int stackIn_63_0Lifetime1;
        int stackIn_63_1Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int stackIn_63_0Lifetime2;
        int stackIn_63_1Lifetime2;
        var21 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var4 = 32;
          if (this.field_w == -320) {
            var4 = 0;
          }
          var5 = 0;
          scanLoop1: while (true) {
            stackIn_5_0 = -1 + profile.length;
            while (true) {
              stackIn_6_0 = stackIn_5_0;
              stackIn_6_1 = var5;
              while (true) {
                if (stackIn_6_0 > stackIn_6_1) {
                  var6 = var5 * (this.arenaWidth - 2 * var4) / (profile.length - 1) + var4;
                  var7 = var4 + (var5 + 1) * (this.arenaWidth - var4 * 2) / (profile.length - 1);
                  var8 = 32 + profile[var5];
                  var9 = profile[var5 + 1] + 32;
                  var10 = (var9 - var8) / (-var6 + var7);
                  var11 = 0;
                  stackIn_100_0 = 1;
                  stackIn_100_1 = Math.abs(var10);
                  if (var21 == 0) {
                    boolean decompiledFrameCompleted0 = true;
                    if (stackIn_100_0 < stackIn_100_1) {
                      scanLoop2: do {
                        boolean decompiledFrameRemainder1 = true;
                        var11 = 0;
                        if (var5 < -2 + profile.length) {
                          var5++;
                          var11 = 1;
                          var12 = (this.arenaWidth - 2 * var4) * var5 / (-1 + profile.length) + var4;
                          var13 = (1 + var5) * (this.arenaWidth - 2 * var4) / (-1 + profile.length) + var4;
                          var14 = 32 + profile[var5];
                          var15 = profile[1 + var5] + 32;
                          var16 = (-var14 + var15) / (var13 - var12);
                          if (Math.abs(var16) > 1) {
                            stackIn_15_0 = (0 < var16) ? 1 : -1;
                            if (var10 > 0) {
                              stackIn_18_1 = 1;
                            } else {
                              stackIn_18_1 = -1;
                            }
                            if (stackIn_15_0 == stackIn_18_1) {
                              var9 = var15;
                              var7 = var13;
                              decompiledFrameRemainder1 = false;
                            }
                          }
                          if (decompiledFrameRemainder1) {
                            var5--;
                            var11 = 0;
                          }
                        }
                        stackIn_22_0 = var11;
                      } while (stackIn_22_0 != 0);
                      stackIn_22_0 = var9;
                      boolean decompiledFrameRemainder0 = true;
                      if (stackIn_22_0 <= var8) {
                        var3_int = var9;
                        while (var3_int < var8) {
                          var12 = var3_int;
                          var13 = var6;
                          var14 = -var6 + var7;
                          var15 = -var8 + var9;
                          var16 = 8192 * (var3_int - var9) / var15;
                          var17 = GradientBarPainter.sine(-122, var16);
                          var18 = var14 / 2 * (var17 + (var3_int - var8) * 131072 / var15) >> 16;
                          var13 = var13 + var18;
                          var18 = -var18 + (var7 - var6);
                          stackIn_63_0 = 0;
                          stackIn_63_1 = var12;
                          if (stackIn_63_0 <= stackIn_63_1 &&
                            this.arenaHeight > var12) {
                            if (var13 < 0) {
                              var18 = var18 - (0 - var13);
                              var13 = 0;
                            }
                            if ((var18 + var13) > this.arenaWidth) {
                              var18 = -var13 + this.arenaWidth;
                            }
                            var19 = var13 + var12 * this.arenaWidth;
                            var20 = 0;
                            while (var20 < var18) {
                              MatchingFieldValidator.field_y.field_m[var19 + var20] = (byte)-5;
                              var20++;
                            }
                          }
                          var3_int++;
                        }
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        var3_int = var8;
                        while (var9 > var3_int) {
                          var12 = var3_int;
                          var13 = var6;
                          var14 = -var6 + var7;
                          var15 = var9 - var8;
                          var16 = (var3_int - var9) * 8192 / var15;
                          var17 = GradientBarPainter.sine(-107, var16);
                          var18Lifetime1 = ((-var8 + var3_int) * 131072 / var15 + var17) * (var14 / 2) >> 16;
                          stackIn_63_0Lifetime2 = -1;
                          stackIn_63_1Lifetime2 = ~var12;
                          if (stackIn_63_0Lifetime2 >= stackIn_63_1Lifetime2 &&
                            this.arenaHeight > var12) {
                            if (var13 < 0) {
                              var18Lifetime1 = var18Lifetime1 + var13;
                              var13 = 0;
                            }
                            if (this.arenaWidth < var13 + var18Lifetime1) {
                              var18Lifetime1 = this.arenaWidth - var13;
                            }
                            var19Lifetime1 = var12 * this.arenaWidth + var13;
                            var20Lifetime1 = 0;
                            while (var18Lifetime1 > var20Lifetime1) {
                              MatchingFieldValidator.field_y.field_m[var20Lifetime1 + var19Lifetime1] = (byte)-5;
                              var20Lifetime1++;
                            }
                          }
                          var3_int++;
                        }
                      }
                      var3_int = var6;
                      while (true) {
                        stackIn_63_0Lifetime1 = ~var3_int;
                        stackIn_63_1Lifetime1 = ~var7;
                        if (stackIn_63_0Lifetime1 <= stackIn_63_1Lifetime1) {
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                        var12 = var8;
                        stackIn_6_0 = var8;
                        stackIn_6_1 = var9;
                        if (stackIn_6_0 < stackIn_6_1) {
                          var12 = var9;
                        }
                        var13 = this.arenaHeight - var12;
                        if (var3_int >= 0 &&
                          var3_int < this.arenaWidth) {
                          if (var12 < 0) {
                            var13 = var13 - (0 - var12);
                            var12 = 0;
                          }
                          if (this.arenaHeight < var12 + var13) {
                            var13 = this.arenaHeight - var12;
                          }
                          var14 = var3_int + this.arenaWidth * var12;
                          var15 = 0;
                          while (var15 < var13) {
                            MatchingFieldValidator.field_y.field_m[var14 + var15 * this.arenaWidth] = (byte)-5;
                            var15++;
                          }
                        }
                        var3_int++;
                      }
                    }
                    if (decompiledFrameCompleted0) {
                      var3_int = var6;
                      while (var3_int < var7) {
                        var12 = (var3_int - var6) * 4096 / (var7 - var6);
                        var13 = BevelBoxPainter.cosine(var12, -115);
                        var14 = (var8 << 16) + (var9 - var8) * ((-var13 + 65536) / 2) >> 16;
                        var15 = this.arenaHeight - var14;
                        stackIn_5_0 = var3_int;
                        if (stackIn_5_0 >= 0 &&
                          this.arenaWidth > var3_int) {
                          if (0 > var14) {
                            var15 = var15 - (-var14 + 0);
                            var14 = 0;
                          }
                          if (this.arenaHeight < (var14 + var15)) {
                            var15 = this.arenaHeight - var14;
                          }
                          var16 = var3_int + var14 * this.arenaWidth;
                          var17 = 0;
                          while (var17 < var15) {
                            MatchingFieldValidator.field_y.field_m[this.arenaWidth * var17 + var16] = (byte)-5;
                            var17++;
                          }
                        }
                        var3_int++;
                      }
                    }
                    var5++;
                    continue scanLoop1;
                  }
                } else {
                  stackIn_100_0 = param1;
                  stackIn_100_1 = -103;
                }
                if (stackIn_100_0 >= stackIn_100_1) {
                  field_qb = (String[]) null;
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_105_0 = var3;
          stackIn_105_1 = new StringBuilder().append("nf.KB(");
          if (profile == null) {
            stackIn_106_2 = "null";
          } else {
            stackIn_106_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_105_0), ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(',').append(param1).append(')').toString());
        }
    }

    final void copyFrom(byte obfuscationGuard, Battle source) {
        BattleUnit stackIn_54_0 = null;
        Object stackIn_59_0 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        BattleUnit stackOut_53_0;
        int var3_int = 0;
        BattleUnit var3 = null;
        SpellProjectile var3_ref = null;
        RuntimeException var3_ref2 = null;
        SpellProjectile var4 = null;
        int var5 = 0;
        BattleUnit var6 = null;
        BattleUnit var7 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (source.terrainMask == null) {
            return;
          }
          this.previousPlayer = source.previousPlayer;
          this.turnActive = source.turnActive;
          this.round = source.round;
          this.currentPlayer = source.currentPlayer;
          this.field_f = source.field_f;
          ArraySupport.copyBytes(source.terrainSprite.field_m, 0, this.terrainSprite.field_m, 0, this.terrainSprite.field_m.length);
          ArraySupport.copyBytes(source.terrainMask.field_m, 0, this.terrainMask.field_m, 0, this.terrainMask.field_m.length);
          var3_int = 0;
          do {
            if (var3_int >= this.spellSlots.length) {
              var3_int = 0;
              break;
            }
            ArraySupport.copyInts(source.spellSlots[var3_int], 0, this.spellSlots[var3_int], 0, 16);
            var3_int++;
          } while (var5 == 0);
          do {
            if (var3_int >= this.spellRecharge.length) {
              var3_int = 0;
              break;
            }
            ArraySupport.copyInts(source.spellRecharge[var3_int], 0, this.spellRecharge[var3_int], 0, 16);
            var3_int++;
          } while (var5 == 0);
          do {
            if (var3_int >= this.spellCharges.length) {
              var3_int = 0;
              break;
            }
            ArraySupport.copyInts(source.spellCharges[var3_int], 0, this.spellCharges[var3_int], 0, 16);
            var3_int++;
          } while (var5 == 0);
          scanLoop1: while (true) {
            if (this.field_L.length > var3_int) {
              ArraySupport.copyBooleans(source.field_L[var3_int], 0, this.field_L[var3_int], 0, 16);
              var3_int++;
              if (var5 == 0) {
                continue;
              }
            } else {
              var3 = (BattleUnit) (this.units.first(12623));
              while (true) {
                if (var3 != null) {
                  var3.unlink(true);
                  var3.unlinkSecondary((byte) 88);
                  var3 = (BattleUnit) (this.units.next(0));
                  if (var5 == 0) {
                    continue;
                  }
                } else {
                  var3_ref = (SpellProjectile) (this.projectiles.first(12623));
                  do {
                    if (var3_ref == null) {
                      var3_ref = (SpellProjectile) (this.field_r.first(12623));
                      break;
                    }
                    var3_ref.remove(0);
                    var3_ref = (SpellProjectile) (this.projectiles.next(0));
                  } while (var5 == 0);
                  do {
                    if (var3_ref == null) {
                      this.projectiles.clear(-3);
                      this.field_r.clear(3);
                      break;
                    }
                    var3_ref.remove(0);
                    var3_ref = (SpellProjectile) (this.field_r.next(0));
                  } while (var5 == 0);
                  var3 = (BattleUnit) (source.units.first(12623));
                }
                break;
              }
              do {
                if (var3 == null) {
                  var3 = (BattleUnit) (this.units.first(12623));
                  break;
                }
                var6 = var3.copyForBattle(this, (byte) 59);
                this.units.addLast(var6, -1);
                this.unitsById.put(var6, (long)var6.unitId, (byte) 121);
                var3 = (BattleUnit) (source.units.next(0));
              } while (var5 == 0);
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (var3 == null))) {
                stackOut_53_0 = source.getUnitByOwner(var3.unitId, true);
                stackIn_59_0 = stackOut_53_0;
                stackIn_54_0 = stackOut_53_0;
                if (var5 == 0) {
                  var7 = stackIn_54_0;
                  if (null != var7.linkedUnit) {
                    var3.linkedUnit = this.getUnitByOwner(var7.linkedUnit.unitId, true);
                  }
                  var3 = (BattleUnit) (this.units.next(0));
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                stackIn_59_0 = source.projectiles.first(12623);
              }
              var3_ref = (SpellProjectile) (stackIn_59_0);
              do {
                if (var3_ref == null) {
                  var3_ref = (SpellProjectile) (source.field_r.first(12623));
                  break;
                }
                var4 = var3_ref.copyForBattle(21310, this);
                this.projectiles.addLast(var4, -1);
                var3_ref = (SpellProjectile) (source.projectiles.next(0));
              } while (var5 == 0);
              do {
                if (var3_ref == null) {
                  if (source.removedProjectiles.first(116) == null &&
                    source.spawnedProjectiles.isEmpty(true) &&
                    source.field_h.isEmpty(122)) {
                    this.removedProjectiles.clear(17);
                    this.spawnedProjectiles.clear(74);
                    this.field_h.clear(17);
                    var3_int = 0;
                    break scanLoop1;
                  }
                  break;
                }
                var4 = var3_ref.copyForBattle(21310, this);
                this.field_r.addLast(var4, -1);
                var3_ref = (SpellProjectile) (source.field_r.next(0));
              } while (var5 == 0);
              throw new RuntimeException();
            }
            break;
          }
          do {
            if (this.field_N.length <= var3_int) {
              var3_int = 0;
              break;
            }
            ArraySupport.copyInts(source.field_N[var3_int], 0, this.field_N[var3_int], 0, 18);
            var3_int++;
          } while (var5 == 0);
          do {
            if (var3_int >= this.spellSlots.length) {
              ArraySupport.copyInts(source.playerSpellbook, 0, this.playerSpellbook, 0, this.playerSpellbook.length);
              ArraySupport.copyInts(source.field_X, 0, this.field_X, 0, this.field_X.length);
              ArraySupport.copyInts(source.field_Ab, 0, this.field_Ab, 0, this.field_Ab.length);
              ArraySupport.copyInts(source.field_o, 0, this.field_o, 0, this.field_o.length);
              ArraySupport.copyInts(source.field_K, 0, this.field_K, 0, this.field_K.length);
              ArraySupport.copyInts(source.field_g, 0, this.field_g, 0, this.field_g.length);
              ArraySupport.copyInts(source.field_db, 0, this.field_db, 0, this.field_db.length);
              ArraySupport.copyInts(source.field_s, 0, this.field_s, 0, this.field_s.length);
              ArraySupport.copyInts(source.field_ib, 0, this.field_ib, 0, this.field_ib.length);
              ArraySupport.copyInts(source.field_ob, 0, this.field_ob, 0, this.field_ob.length);
              ArraySupport.copyInts(source.field_U, 0, this.field_U, 0, this.field_U.length);
              ArraySupport.copyInts(source.field_ab, 0, this.field_ab, 0, this.field_ab.length);
              ArraySupport.copyInts(source.field_Eb, 0, this.field_Eb, 0, this.field_Eb.length);
              ArraySupport.copyInts(source.field_wb, 0, this.field_wb, 0, this.field_wb.length);
              ArraySupport.copyInts(source.field_Nb, 0, this.field_Nb, 0, this.field_Nb.length);
              break;
            }
            ArraySupport.copyInts(source.spellSlots[var3_int], 0, this.spellSlots[var3_int], 0, 16);
            var3_int++;
          } while (var5 == 0);
          if (obfuscationGuard <= 71) {
            return;
          }
          ArraySupport.copyInts(source.field_T, 0, this.field_T, 0, this.field_T.length);
          ArraySupport.copyInts(source.field_n, 0, this.field_n, 0, this.field_n.length);
          ArraySupport.copyInts(source.field_gb, 0, this.field_gb, 0, this.field_gb.length);
          ArraySupport.copyInts(source.field_Fb, 0, this.field_Fb, 0, this.field_Fb.length);
          ArraySupport.copyInts(source.field_Ob, 0, this.field_Ob, 0, this.field_Ob.length);
          ArraySupport.copyInts(source.field_c, 0, this.field_c, 0, this.field_c.length);
          ArraySupport.copyInts(source.field_b, 0, this.field_b, 0, this.field_b.length);
          ArraySupport.copyBooleans(source.field_u, 0, this.field_u, 0, this.field_u.length);
          ArraySupport.copyInts(source.field_R, 0, this.field_R, 0, this.field_R.length);
          ArraySupport.copyInts(source.field_cb, 0, this.field_cb, 0, this.field_cb.length);
          ArraySupport.copyInts(source.field_a, 0, this.field_a, 0, this.field_a.length);
          ArraySupport.copyInts(source.field_p, 0, this.field_p, 0, this.field_p.length);
          this.field_t = source.field_t;
          this.field_mb = source.field_mb;
          this.unitIdCounter = source.unitIdCounter;
          if (source.field_Gb) {
            throw new IllegalStateException();
          }
          this.field_Gb = false;
          if (source.waitingForInput) {
            throw new IllegalStateException();
          }
          this.waitingForInput = false;
          if (source.field_Mb) {
            throw new IllegalStateException();
          }
          this.field_Mb = false;
          if (!source.actionQueue.isEmpty(true)) {
            throw new IllegalStateException();
          }
          this.actionQueue.clear(29);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref2 = decompiledCaughtException;
          stackIn_104_0 = var3_ref2;
          stackIn_104_1 = new StringBuilder().append("nf.J(").append(obfuscationGuard).append(',');
          if (source == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(')').toString());
        }
    }

    final void clearFirstPlayerSlots(byte obfuscationGuard) {
        int var2 = 0;
        int var3 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (obfuscationGuard != 19) {
          this.stampUnitMask(103, (BattleUnit) null);
        }
        var2 = 0;
        while (var2 < 16) {
          this.spellCharges[0][var2] = 0;
          this.spellRecharge[0][var2] = 0;
          this.spellSlots[0][var2] = -1;
          var2++;
          if (var3 == 0) {
            continue;
          }
          break;
        }
    }

    final int nextUnitId(int obfuscationGuard) {
        if (obfuscationGuard >= -69) {
          this.stampUnitMask(118, (BattleUnit) null);
        }
        int fieldTemp$0 = this.unitIdCounter;
        this.unitIdCounter = this.unitIdCounter + 1;
        return fieldTemp$0;
    }

    final int getThemeParameter(int obfuscationGuard) {
        if (obfuscationGuard != 12955) {
          this.field_N = (int[][]) null;
        }
        return ScreenSwitchHelpers.field_a[this.field_F];
    }

    private final int[] generateTenPointProfile(int param0, IsaacRandom random) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_21_3 = 0;
        int[] stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var11 = new int[10];
          var10 = var11;
          var9 = var10;
          var5 = var9;
          var6_int = 0;
          do {
            if ((var11.length - 1) <= var6_int) {
              var9[1 + ScreenDisplayMode.randomBelow(random, -2 + var11.length, (byte) -71)] = this.arenaHeight * 3 / 8 - ScreenDisplayMode.randomBelow(random, 2 * this.arenaHeight / 8, (byte) -104);
              var9[ScreenDisplayMode.randomBelow(random, -2 + var11.length, (byte) -103) + 1] = this.arenaHeight * 3 / 8 - ScreenDisplayMode.randomBelow(random, 2 * this.arenaHeight / 8, (byte) -127);
              var9[1 + ScreenDisplayMode.randomBelow(random, -2 + var11.length, (byte) -119)] = this.arenaHeight * 3 / 8 - ScreenDisplayMode.randomBelow(random, 2 * this.arenaHeight / 8, (byte) -91);
              var9[ScreenDisplayMode.randomBelow(random, var11.length - 2, (byte) -34) + 1] = this.arenaHeight * 3 / param0 - ScreenDisplayMode.randomBelow(random, this.arenaHeight * 2 / 8, (byte) -59);
              var9[0] = 64 + this.arenaHeight;
              break;
            }
            var9[var6_int] = 7 * this.arenaHeight / 8 - ScreenDisplayMode.randomBelow(random, this.arenaHeight * 2 / 8, (byte) -113);
            var6_int++;
          } while (var8 == 0);
          var9[-1 + var11.length] = var11[0];
          while (true) {
            stackIn_9_0 = var5.length;
            stackIn_9_1 = this.arenaWidth / 2;
            if (stackIn_9_0 < stackIn_9_1) {
              var3_int = 100;
              if (var8 == 0) {
                if (this.arenaWidth / 8 < var5.length) {
                  var3_int = 5;
                }
                var6 = new int[var5.length * 2 - 2 + 1];
                var6[0] = var5[0];
                var7 = 1;
                while (var5.length > var7) {
                  var4 = (Math.abs(-var5[var7] + var5[var7 - 1]) + 5) * var3_int / 100;
                  stackIn_9_0 = this.arenaHeight / 2;
                  stackIn_9_1 = var5[var7];
                  if (stackIn_9_0 < stackIn_9_1) {
                    var4 = 2 * this.arenaHeight / var5.length;
                  }
                  stackIn_20_0 = var6;
                  stackIn_20_1 = 2 * var7 - 1;
                  stackIn_20_2 = var5[var7] + (var5[-1 + var7] - var4) >> 1;
                  if (var4 == 0) {
                    stackIn_21_3 = 0;
                  } else {
                    stackIn_21_3 = ScreenDisplayMode.randomBelow(random, var4, (byte) -57);
                  }
                  stackIn_20_0[stackIn_20_1] = stackIn_20_2 + stackIn_21_3;
                  var6[2 * var7] = var5[var7];
                  var7++;
                }
                var5 = var6;
                continue;
              }
            }
            this.rasterizeTerrainProfile(var5, (byte) -121);
            stackIn_25_0 = var5;
            return stackIn_25_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("nf.FA(").append(param0).append(',');
          if (random == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final void startTurn(int round, boolean param1, int currentPlayer) {
        int[] discarded$1 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_4_0Lifetime1;
        int stackIn_4_1Lifetime1;
        boolean decompiledFrameCompleted0 = true;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        this.previousPlayer = this.currentPlayer;
        this.round = round;
        this.currentPlayer = currentPlayer;
        this.field_f = false;
        if (this.round < this.playerCount &&
          StatefulTextPainter.field_p == 7) {
          var4 = 0;
          while (true) {
            stackIn_4_0 = this.playerCount;
            stackIn_4_1 = var4;
            if (stackIn_4_0 <= stackIn_4_1) {
              break;
            }
            stackIn_15_0 = 0;
            if (var6 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            var5 = stackIn_15_0;
            while (var5 < this.spellSlots[var4].length) {
              stackIn_4_0Lifetime1 = 11;
              stackIn_4_1Lifetime1 = this.spellSlots[var4][var5];
              if (stackIn_4_0Lifetime1 == stackIn_4_1Lifetime1) {
                this.field_f = true;
              }
              var5++;
            }
            var4++;
          }
        }
        if (decompiledFrameCompleted0) {
          stackIn_15_0 = param1 ? 1 : 0;
        }
        if (stackIn_15_0 != 1) {
          discarded$1 = this.generateTwentyPointLowProfile(67, (IsaacRandom) null);
        }
    }

    final void refreshUnits(byte obfuscationGuard) {
        BattleUnit var2;
        int var3;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        ValidationStatusIcon.field_J.setDeque((byte) 72, this.units);
        if (obfuscationGuard != -20) {
          return;
        }
        var2 = (BattleUnit) (ValidationStatusIcon.field_J.first(-64));
        while (var2 != null) {
          if (var3 == 0) {
            if (~var2.ownerPlayer == ~this.currentPlayer) {
              var2.field_D = false;
            }
            var2 = (BattleUnit) (ValidationStatusIcon.field_J.next(obfuscationGuard - 18482));
            continue;
          }
          break;
        }
    }

    final boolean isFinished(int obfuscationGuard) {
        if (obfuscationGuard < 115) {
          this.runUntilIdle((byte) 27);
        }
        return this.field_Mb;
    }

    final void setSpellSlot(int player, int slot, int charges, int obfuscationGuard, int spellType) {
        this.spellSlots[player][slot] = spellType;
        if (obfuscationGuard < 12) {
          this.field_X = (int[]) null;
        }
        this.spellCharges[player][slot] = charges;
        this.spellRecharge[player][slot] = 0;
    }

    final void eraseUnitMask(BattleUnit unit, int obfuscationGuard) {
        try {
          ContextActionMenu.stampHalfResolution(-(unit.size >> 1) + unit.x, this, (byte) 0, unit.y - unit.size, 21374, unit.maskSprite, this.terrainMask);
          if (obfuscationGuard != 0) {
            this.rasterizeTerrainProfile((int[]) null, (byte) 67);
          }
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "nf.N(" + (unit != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final void advanceToNextPlayer(int obfuscationGuard) {
        int var2;
        int var3;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (this.previousPlayer == this.currentPlayer) {
          this.previousPlayer = this.previousPlayer - 1;
        }
        if (obfuscationGuard != -1) {
          field_e = (String) null;
        }
        regionExit1: {
          boolean decompiledFrameRemainder0 = true;
          var2 = this.currentPlayer;
          if (!this.teamMode) {
            scanLoop2: while (true) {
              this.round = this.round + 1;
              this.currentPlayer = (this.currentPlayer + 1) % this.playerCount;
              do {
                if (this.getUnitByOwner(this.currentPlayer, true) == null) {
                  continue scanLoop2;
                }
              } while (var3 != 0);
              break;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.currentPlayer = this.previousPlayer;
            scanLoop3: while (true) {
              this.currentPlayer = (this.currentPlayer + 2) % this.playerCount;
              this.round = this.round + 1;
              do {
                if (this.getUnitByOwner(this.currentPlayer, true) == null) {
                  continue scanLoop3;
                }
              } while (var3 != 0);
              break;
            }
            break regionExit1;
          }
          scanLoop4: while (true) {
            this.round = this.round + 1;
            this.currentPlayer = (this.currentPlayer + 1) % this.playerCount;
            do {
              if (this.getUnitByOwner(this.currentPlayer, true) == null) {
                continue scanLoop4;
              }
            } while (var3 != 0);
            break;
          }
        }
        this.previousPlayer = var2;
    }

    final boolean canPlaceUnitAt(int x, int y, byte obfuscationGuard, BattleUnit unit) {
        boolean discarded$3 = false;
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = unit.getSize(-8323);
          if (var5_int <= x &&
            x <= (-var5_int + this.arenaWidth) &&
            y >= var5_int &&
            -16 + this.arenaHeight >= y) {
            discarded$3 = this.circleHitsTerrain(x, var5_int >> 1, this.arenaHeight - 16, -59);
            if (obfuscationGuard != -75) {
              this.units = (IntrusiveDeque) null;
            }
            stackIn_12_0 = !(BitHelpers.field_b);
            return stackIn_12_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("nf.E(").append(x).append(',').append(y).append(',').append(obfuscationGuard).append(',');
          if (unit == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final IntrusiveDeque getUnits(byte obfuscationGuard) {
        if (obfuscationGuard <= 33) {
          this.regenerateTerrain(-3);
        }
        return this.units;
    }

    final boolean isTurnFinished(byte obfuscationGuard) {
        if (obfuscationGuard != 89) {
          this.canStandAt(-39, (BattleUnit) null, 42, -60);
        }
        return this.field_Gb;
    }

    final int getPlayerStat(byte obfuscationGuard, int param1) {
        if (obfuscationGuard < 97) {
          this.setSpellSlot(55, -107, -93, -42, -41);
        }
        return this.field_fb[param1];
    }

    final int getTurnTimeLimit(int obfuscationGuard) {
        if (7 == this.arenaTheme &&
          Js5Transport.isFeatureEnabled(0, (byte) -52)) {
          return 0;
        }
        if (obfuscationGuard != 4) {
          return -60;
        }
        return 10 * this.playerCount;
    }

    private final int[] generateSevenPointLowProfile(IsaacRandom random, int param1) {
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_43_3 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_65_0 = 0;
        int[] stackIn_68_0 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[][] var7_array = null;
        int var8 = 0;
        int[] var9_ref_int__ = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[][] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[][] var18 = null;
        int[] var19 = null;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var3_intLifetime2;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var17 = new int[7];
          var14 = var17;
          var5 = var14;
          this.field_w = -320;
          var6 = 0;
          scanLoop1: while (true) {
            if (var17.length > var6) {
              var5[var6] = this.arenaHeight - (ScreenDisplayMode.randomBelow(random, this.arenaHeight / 3, (byte) -126) + Math.abs((this.arenaWidth / 2 - this.arenaWidth * var6 / var17.length) * this.arenaHeight / this.arenaWidth));
              var6++;
              if (var13 == 0) {
                continue;
              }
            } else {
              scanLoop2: while (true) {
                if (var5.length < (this.arenaWidth / 64)) {
                  var3_int = 100;
                  stackIn_21_0 = var5.length;
                  stackIn_21_1 = this.arenaWidth / 8;
                  if (var13 != 0) {
                    break scanLoop1;
                  }
                  if (stackIn_21_0 > stackIn_21_1) {
                    var3_intLifetime2 = 5;
                  }
                  var7 = new int[1 + 2 * (-1 + var5.length)];
                  stackIn_11_0 = var7;
                  stackIn_11_1 = 0;
                  stackIn_11_2 = var5[0];
                  while (true) {
                    stackIn_11_0[stackIn_11_1] = stackIn_11_2;
                    var6 = 1;
                    while (var6 < var5.length) {
                      var4 = this.arenaHeight / var5.length;
                      stackIn_11_0 = var7;
                      stackIn_11_1 = -1 + 2 * var6;
                      stackIn_11_2 = (var5[var6] + var5[-1 + var6]) / 2;
                      if (var4 > 0) {
                        stackIn_17_3 = ScreenDisplayMode.randomBelow(random, var4, (byte) -33);
                      } else {
                        stackIn_17_3 = 0;
                      }
                      stackIn_11_0[stackIn_11_1] = stackIn_11_2 + (stackIn_17_3 - var4 / 2);
                      var7[var6 * 2] = var5[var6];
                      var6++;
                    }
                    var5 = var7;
                    continue scanLoop2;
                  }
                }
                break;
              }
              this.rasterizeTerrainProfile(var5, (byte) -107);
            }
            stackIn_21_0 = 2;
            stackIn_21_1 = 7;
            break;
          }
          var18 = new int[stackIn_21_0][stackIn_21_1];
          var15 = var18;
          var7_array = var15;
          var6 = 1;
          do {
            if (var6 >= -1 + var18[0].length) {
              var18[0][0] = 448;
              var18[1][0] = 576;
              var18[0][var18[0].length - 1] = var18[0][0];
              var18[1][-1 + var18[0].length] = var18[1][0];
              break;
            }
            var18[0][var6] = (-(2 * ScreenDisplayMode.randomBelow(random, 450, (byte) -74)) + 1400) / 3;
            var18[1][var6] = 2 * (700 - ScreenDisplayMode.randomBelow(random, 450, (byte) -27)) / 3;
            var6++;
          } while (var13 == 0);
          var8 = 0;
          while (true) {
            stackIn_29_0 = -3;
            stackIn_29_1 = ~var8;
            regionExit3: {
              if (stackIn_29_0 < stackIn_29_1) {
                scanLoop4: while (true) {
                  stackIn_47_0 = ~this.arenaWidth;
                  if (var13 != 0) {
                    break regionExit3;
                  }
                  if (stackIn_47_0 < ~var18[var8].length) {
                    var3_intLifetime1 = 100;
                    stackIn_29_0 = this.arenaWidth / 8;
                    stackIn_29_1 = var18[var8].length;
                    if (stackIn_29_0 < stackIn_29_1) {
                      var3_intLifetime1 = 5;
                    }
                    var19 = new int[-1 + 2 * var18[var8].length];
                    var16 = var19;
                    var9_ref_int__ = var16;
                    stackIn_37_0 = var9_ref_int__;
                    stackIn_37_1 = 0;
                    stackIn_37_2 = var18[var8][0];
                    while (true) {
                      stackIn_37_0[stackIn_37_1] = stackIn_37_2;
                      var6 = 1;
                      while (var18[var8].length > var6) {
                        var4Lifetime1 = (5 + Math.abs(var18[var8][var6 - 1] - var18[var8][var6])) * var3_intLifetime1 / 100;
                        stackIn_37_0 = var9_ref_int__;
                        stackIn_37_1 = -1 + 2 * var6;
                        stackIn_37_2 = (var18[var8][var6 - 1] + var18[var8][var6]) / 2;
                        if (0 >= var4Lifetime1) {
                          stackIn_43_3 = 0;
                        } else {
                          stackIn_43_3 = ScreenDisplayMode.randomBelow(random, var4Lifetime1, (byte) -37);
                        }
                        stackIn_37_0[stackIn_37_1] = stackIn_37_2 + (stackIn_43_3 - var4Lifetime1 / 2);
                        var9_ref_int__[var6 * 2] = var18[var8][var6];
                        var6++;
                      }
                      var7_array[var8] = var19;
                      continue scanLoop4;
                    }
                  }
                  break;
                }
                var8++;
                continue;
              }
              var8 = 0;
              stackIn_47_0 = 0;
            }
            var9 = stackIn_47_0;
            while (true) {
              stackIn_49_0 = ~var9;
              stackIn_49_1 = ~this.arenaWidth;
              if (stackIn_49_0 > stackIn_49_1) {
                var8 = var9;
                var10 = var18[0].length * var9 / this.arenaWidth;
                stackIn_65_0 = 0;
                if (var13 == 0) {
                  var11 = stackIn_65_0;
                  while (var11 < this.arenaHeight) {
                    var12 = 0;
                    stackIn_49_0 = var18[0][var10];
                    stackIn_49_1 = var18[1][var10];
                    if (stackIn_49_0 > stackIn_49_1) {
                      if (var18[0][var10] < var11) {
                        var12++;
                      }
                      if (var18[1][var10] < var11) {
                        var12++;
                      }
                    }
                    if (var12 % 2 == 1) {
                      MatchingFieldValidator.field_y.field_m[var8] = (byte)-5;
                    }
                    var8 = var8 + this.arenaWidth;
                    var11++;
                  }
                  var9++;
                  continue;
                }
              } else {
                stackIn_65_0 = param1;
              }
              if (stackIn_65_0 != -30390) {
                this.arenaHeight = -55;
              }
              stackIn_68_0 = var5;
              return stackIn_68_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_71_0 = var3;
          stackIn_71_1 = new StringBuilder().append("nf.JD(");
          if (random == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param1).append(')').toString());
        }
    }

    final int getPlayerCount(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          this.nextUnitId(114);
        }
        return this.playerCount;
    }

    final boolean canTargetPoint(int x, BattleUnit param1, int obfuscationGuard, int y) {
        RuntimeException var5 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          y = y - ByteStorage.field_e.field_w;
          if (obfuscationGuard != 30882) {
            this.projectiles = (IntrusiveDeque) null;
          }
          x = x - ByteStorage.field_e.field_n / 2;
          if (0 <= x &&
            x <= this.arenaWidth - ByteStorage.field_e.field_n &&
            y >= 0) {
            if ((this.arenaHeight - ByteStorage.field_e.field_w) < y) {
              return false;
            }
            stackIn_12_0 = !(this.spriteOverlapsTerrain(y, 2, x, ByteStorage.field_e));
            return stackIn_12_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("nf.TA(").append(x).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(obfuscationGuard).append(',').append(y).append(')').toString());
        }
    }

    final IntrusiveDeque getCameraTargets(int obfuscationGuard) {
        int var2 = -15 / ((-54 - obfuscationGuard) / 34);
        return this.projectiles;
    }

    final boolean canSummonAt(int spellType, int y, BattleUnit unit, byte obfuscationGuard, int x) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Sprite var6 = null;
        RuntimeException var6_ref = null;
        try {
          var6 = ScreenDisplayMode.field_i[0];
          if (spellType == 55) {
            var6 = ScreenDisplayMode.field_i[1];
          }
          if (31 == spellType) {
            var6 = ScreenDisplayMode.field_i[2];
          }
          if (spellType == 60) {
            var6 = ScreenDisplayMode.field_i[3];
          }
          if (spellType == 81) {
            var6 = ScreenDisplayMode.field_i[4];
          }
          if (spellType == 91) {
            var6 = ScreenDisplayMode.field_i[5];
          }
          if (spellType == 114) {
            var6 = ScreenDisplayMode.field_i[6];
          }
          if (y < var6.field_w + 2) {
            return false;
          }
          discarded$0 = this.unitSpriteHitsTerrain(unit, var6, 0, y - var6.field_w, -(var6.field_n / 2) + x);
          if (BitHelpers.field_b) {
            return false;
          }
          discarded$1 = this.unitSpriteHitsTerrain(unit, var6, 0, 2 + (y - var6.field_w), x - var6.field_n / 2);
          if (BitHelpers.field_b) {
            return false;
          }
          if (obfuscationGuard > 27) {
            return true;
          }
          this.field_w = -39;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_31_0 = var6_ref;
          stackIn_31_1 = new StringBuilder().append("nf.PA(").append(spellType).append(',').append(y).append(',');
          if (unit == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(obfuscationGuard).append(',').append(x).append(')').toString());
        }
    }

    private final boolean circleHitsTerrain(int x, int radius, int y, int obfuscationGuard) {
        int var5 = -106 / ((9 - obfuscationGuard) / 60);
        return ListEntryMenuHelpers.circleHitsMask(this, y, x, radius, this.terrainMask, 16777215);
    }

    private final boolean hasFreeSpellSlot(int player, int spellType, int param2) {
        int var4;
        int var5;
        int stackIn_12_0 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (0 > spellType) {
          return false;
        }
        if (player < 0) {
          return false;
        }
        var4 = param2;
        while (var4 < 16) {
          stackIn_12_0 = ~spellType;
          if (var5 != 0) {
            return stackIn_12_0 != 0;
          }
          if (stackIn_12_0 == ~this.spellSlots[player][var4]) {
            return true;
          }
          var4++;
        }
        return false;
    }

    final void stampShape(int obfuscationGuard, int x, IndexedSprite shape, int y) {
        try {
          int var5_int = 37 % ((-78 - obfuscationGuard) / 34);
          this.copyMaskRegion(y, this.terrainMask, shape, x, -126);
          this.stampShapeWithMask(y, 117, shape, x, this.terrainSprite);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "nf.JB(" + obfuscationGuard + ',' + x + ',' + (shape != null ? "{...}" : "null") + ',' + y + ')');
        }
    }

    final void stampUnitMask(int obfuscationGuard, BattleUnit unit) {
        try {
          ContextActionMenu.stampHalfResolution(unit.x - (unit.size >> 1), this, (byte) -1, -unit.size + unit.y, 21374, unit.maskSprite, this.terrainMask);
          if (obfuscationGuard > -36) {
            field_z = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "nf.F(" + obfuscationGuard + ',' + (unit != null ? "{...}" : "null") + ')');
        }
    }

    private final void updateCurrentTurn(byte obfuscationGuard) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_87_0 = 0;
        BattleUnit stackIn_106_0 = null;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        Object stackIn_111_0 = null;
        int stackIn_131_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_150_1 = 0;
        int stackIn_250_0 = 0;
        int stackIn_250_1 = 0;
        BattleUnit stackIn_254_0 = null;
        BattleUnit stackOut_253_0;
        BattleUnit stackOut_105_0;
        int var3_int = 0;
        BattleUnit var3 = null;
        SpellProjectile var3_ref = null;
        int var4_int = 0;
        Object var4 = null;
        double var4_double = 0.0;
        SpellProjectile var5_ref_mi = null;
        double var5_double = 0.0;
        IsaacRandom var5_ref_jd = null;
        int var5 = 0;
        double var6_double = 0.0;
        int var6_int = 0;
        SpellProjectile var6 = null;
        double var7_double = 0.0;
        int var7 = 0;
        double var8_double = 0.0;
        int var8 = 0;
        double var9 = 0.0;
        double var10 = 0.0;
        double var11 = 0.0;
        double var12 = 0.0;
        double var13 = 0.0;
        double var14 = 0.0;
        double var15 = 0.0;
        double var16 = 0.0;
        double var17 = 0.0;
        double var18 = 0.0;
        double var19 = 0.0;
        double var20 = 0.0;
        double var21 = 0.0;
        double var22 = 0.0;
        double var23 = 0.0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        SpellProjectile var29_ref_mi = null;
        int var29 = 0;
        SpellProjectile var30 = null;
        int var31 = 0;
        SpellProjectile var32 = null;
        BattleUnit var33 = null;
        SpellProjectile var34 = null;
        BattleUnit var35 = null;
        SpellProjectile var36 = null;
        SpellProjectile var37 = null;
        BattleUnit var38 = null;
        SpellProjectile var39 = null;
        SpellProjectile var40 = null;
        SpellProjectile var41 = null;
        Object var4Lifetime1;
        int stackIn_7_0Lifetime1;
        int stackIn_7_1Lifetime1;
        int stackIn_131_0Lifetime1;
        int stackIn_150_0Lifetime1;
        int stackIn_150_1Lifetime1;
        int var4_intLifetime1;
        int var6_intLifetime1;
        int var8Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var4_intLifetime1Lifetime1;
        var31 = ArcanistsMulti.field_G ? 1 : 0;
        if (obfuscationGuard != 69) {
          this.addProjectile(38, (SpellProjectile) null);
        }
        boolean decompiledFrameCompleted2 = true;
        var35 = this.getUnitByOwner(this.currentPlayer, true);
        this.field_f = false;
        if (this.playerCount > this.round &&
          StatefulTextPainter.field_p == -1) {
          var3_int = 0;
          while (true) {
            stackIn_7_0 = this.playerCount;
            stackIn_7_1 = var3_int;
            if (stackIn_7_0 <= stackIn_7_1) {
              break;
            }
            if (var31 != 0) {
              decompiledFrameCompleted2 = false;
              break;
            }
            var4_int = 0;
            while (var4_int < this.spellSlots[var3_int].length) {
              stackIn_7_0Lifetime1 = this.spellSlots[var3_int][var4_int];
              stackIn_7_1Lifetime1 = 11;
              if (stackIn_7_0Lifetime1 == stackIn_7_1Lifetime1) {
                this.field_f = true;
              }
              var4_int++;
            }
            var3_int++;
          }
        }
        if (decompiledFrameCompleted2) {
          BattleAction.field_p.setDeque((byte) 31, this.units);
        }
        var3 = (BattleUnit) (BattleAction.field_p.first(-98));
        scanLoop1: while (true) {
          boolean decompiledFrameCompleted1 = true;
          if (var3 != null) {
            stackIn_250_0 = ~var3.ownerPlayer;
            stackIn_250_1 = ~this.currentPlayer;
            if (var31 != 0) {
              while (true) {
                if (stackIn_250_0 == stackIn_250_1) {
                  var3.updateAuras(false, true);
                }
                var3.largestDamage = 0;
                var3.largestDamageSourceId = -1;
                var3 = (BattleUnit) (BattleAction.field_p.next(-18502));
                decompiledFrameCompleted1 = false;
                break;
              }
            }
            if (decompiledFrameCompleted1) {
              if (stackIn_250_0 == stackIn_250_1 &&
                var3.health > 0) {
                boolean decompiledFrameCompleted0 = true;
                if (5 == this.playerSpellbook[this.currentPlayer] &&
                  0 < this.field_X[this.currentPlayer] &&
                  var3.unitType != 12 &&
                  !var3.field_U) {
                  var4 = null;
                  var5_ref_mi = (SpellProjectile) (this.projectiles.first(12623));
                  while (var5_ref_mi != null) {
                    stackIn_41_0 = -107;
                    stackIn_41_1 = ~var5_ref_mi.spellType;
                    if (var31 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (stackIn_41_0 == stackIn_41_1 &&
                      var5_ref_mi.owner == var3) {
                      var4 = var5_ref_mi;
                    }
                    var5_ref_mi = (SpellProjectile) (this.projectiles.next(0));
                  }
                  if (decompiledFrameCompleted0) {
                    if (var4 != null) {
                      ((SpellProjectile) (var4)).ageTicks = ((SpellProjectile) (var4)).ageTicks - this.field_X[this.currentPlayer] / 20;
                      if (!(((SpellProjectile) (var4)).ageTicks >= 0)) {
                        ((SpellProjectile) (var4)).ageTicks = 0;
                        if (var31 != 0) {
                          var32 = BevelBoxPainter.createProjectile(var3, var3.y, (byte) 35, this, 145, var3.x, 106);
                          var34 = var32;
                          var32.ageTicks = 50 - this.field_X[this.currentPlayer] / 20;
                          this.onProjectileFinished(52, var34);
                        }
                      }
                    } else {
                      var32 = BevelBoxPainter.createProjectile(var3, var3.y, (byte) 35, this, 145, var3.x, 106);
                      var34 = var32;
                      var32.ageTicks = 50 - this.field_X[this.currentPlayer] / 20;
                      this.onProjectileFinished(52, var34);
                    }
                  }
                }
                if (decompiledFrameCompleted0) {
                  stackIn_41_0 = 16;
                  stackIn_41_1 = var3.unitType;
                }
                if (stackIn_41_0 == stackIn_41_1 ||
                  23 == var3.unitType) {
                  stackIn_47_0 = (var3.unitType == 16) ? 71 : 60;
                  var4_intLifetime1 = stackIn_47_0;
                  var36 = BevelBoxPainter.createProjectile(var35, var3.y, (byte) 49, this, var4_intLifetime1, var3.x, 111);
                  var36.field_H = 4;
                  this.onProjectileFinished(52, var36);
                }
                if (var3.unitType == 6 ||
                  var3.unitType == 26 ||
                  var3.field_U &&
                  var3.unitType == 17) {
                  stackIn_56_0 = (var3.unitType != 6) ? 76 : 64;
                  var4_intLifetime1Lifetime1 = stackIn_56_0;
                  var37 = BevelBoxPainter.createProjectile(var3, var3.y, (byte) 11, this, var4_intLifetime1Lifetime1, var3.x, 55);
                  var37.field_H = 4;
                  this.onProjectileFinished(52, var37);
                }
                if (var3.field_U &&
                  16 != var3.unitType) {
                  var3.health = var3.health - 5;
                  if (var3.health < 1) {
                    var3.health = 1;
                  }
                }
                if (var3.unitType == 23) {
                  var3.field_q = var3.field_q + 30;
                  if (var3.field_q > 75) {
                    var3.field_q = 75;
                  }
                }
                if (12 == var3.unitType) {
                  var3.pendingDamage = var3.pendingDamage + 15;
                }
                if (var3.unitType == 39) {
                  var3.health = var3.health + 25;
                  if (var3.health > 100) {
                    var3.health = 100;
                  }
                }
                if (var3.unitType == 24 ||
                  var3.unitType == 18) {
                  var3.heal(10, -28922);
                }
                if (var3.unitType == 36) {
                  var4_double = (double)(var3.getLinkedUnit(24501).x - var3.x << 4);
                  var6_double = (double)(256 + (var3.getLinkedUnit(obfuscationGuard + 24432).y - var3.y << 4));
                  var8_double = 64.0;
                  var10 = var4_double * 4.0 * var4_double / (2.0 * var8_double * var8_double);
                  var12 = var4_double;
                  var14 = -var6_double + var4_double * (4.0 * var4_double) / (var8_double * 2.0 * var8_double);
                  while (true) {
                    boolean decompiledFrameRemainder0 = true;
                    if (var10 != 0.0) {
                      stackIn_87_0 = compareDoublesNanGreater(var12 * var12 - var14 * (var10 * 4.0), 0.0);
                      decompiledFrameRemainder0 = (var31 == 0);
                      if ((decompiledFrameRemainder0) && (stackIn_87_0 < 0 &&
                        768.0 > var8_double)) {
                        var8_double = var8_double + 8.0;
                        var14 = var4_double * (4.0 * var4_double) / (var8_double * (2.0 * var8_double)) - var6_double;
                        var12 = var4_double;
                        var10 = var4_double * (var4_double * 4.0) / (2.0 * var8_double * var8_double);
                        continue;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      stackIn_87_0 = compareDoublesNanLess(var10, 0.0);
                    }
                    if (stackIn_87_0 == 0) {
                      break;
                    }
                    if (!(0.0 <= -(var14 * (var10 * 4.0)) + var12 * var12)) {
                      break;
                    }
                    var16 = (-var12 + Math.sqrt(-(var14 * (4.0 * var10)) + var12 * var12)) / (2.0 * var10);
                    var18 = (-var12 - Math.sqrt(-(var10 * 4.0 * var14) + var12 * var12)) / (2.0 * var10);
                    if (Math.abs(var16) > Math.abs(var18)) {
                      var16 = var18;
                    }
                    var20 = var8_double * var8_double / (var16 * var16 + 1.0);
                    var22 = var8_double * var8_double / (1.0 / (var16 * var16) + 1.0);
                    var24 = (int)Math.sqrt(var20);
                    var25 = (int)Math.sqrt(var22);
                    if (!(0.0 < var16)) {
                      if (var4_double > 0.0) {
                        var25 = -var25;
                        if (var31 != 0 &&
                          0.0 > var4_double) {
                          var25 = -var25;
                        }
                      }
                    } else {
                      if (0.0 > var4_double) {
                        var25 = -var25;
                      }
                    }
                    if (var24 > 0 &&
                      0.0 > var4_double) {
                      var24 = -var24;
                    }
                    var26 = 8;
                    var27 = (int)((double)(var24 * (4 + (var3.size / 2 + var26))) / var8_double + (double)var3.x);
                    var28 = (int)((double)(-(var3.size / 2)) + ((double)var3.y + (double)(var25 * (var26 + (var3.size / 2 + 4))) / var8_double));
                    var29_ref_mi = BevelBoxPainter.createProjectile(this.getUnitByOwner(var3.ownerPlayer, true), var28, (byte) 18, this, -1, var27, 153);
                    this.onProjectileFinished(52, var29_ref_mi);
                    var29_ref_mi.ageTicks = 20;
                    var29_ref_mi.velocityX = var24;
                    var29_ref_mi.velocityY = var25;
                    var29_ref_mi.field_w = true;
                    break;
                  }
                }
              }
              var3 = (BattleUnit) (BattleAction.field_p.next(-18502));
              if (var31 == 0) {
                continue;
              }
            }
          }
          if (decompiledFrameCompleted1) {
            var3 = (BattleUnit) (BattleAction.field_p.first(-102));
            while (var3 != null) {
              stackOut_105_0 = var3;
              stackIn_111_0 = stackOut_105_0;
              stackIn_106_0 = stackOut_105_0;
              if (var31 != 0) {
                break scanLoop1;
              }
              stackIn_107_0 = ~stackIn_106_0.unitType;
              stackIn_107_1 = -36;
              if (stackIn_107_0 == stackIn_107_1) {
                var3.updateAuras(false, true);
              }
              var3.largestDamage = 0;
              var3.largestDamageSourceId = -1;
              var3 = (BattleUnit) (BattleAction.field_p.next(-18502));
            }
          }
          stackIn_111_0 = this.projectiles.first(12623);
          break;
        }
        var3_ref = (SpellProjectile) (stackIn_111_0);
        while (var3_ref != null) {
          if (var31 != 0) {
            return;
          }
          if (var3_ref.spellType == 69) {
            var3_ref.ageTicks = 0;
            this.field_Gb = true;
          }
          if (var3_ref.spellType == 123) {
            IntKeyLookup.field_d.setDeque((byte) 41, this.units);
            var4Lifetime1 = (BattleUnit) (IntKeyLookup.field_d.first(-96));
            while (var4Lifetime1 != null) {
              stackIn_150_0 = ~((BattleUnit) (var4Lifetime1)).unitType;
              stackIn_150_1 = -34;
              if (stackIn_150_0 == stackIn_150_1 &&
                ~this.currentPlayer == ~((BattleUnit) (var4Lifetime1)).ownerPlayer) {
                var5_double = (double)(-((BattleUnit) (var4Lifetime1)).x + var3_ref.x << 4);
                var7_double = (double)((var3_ref.y - ((BattleUnit) (var4Lifetime1)).y << 4) + 256);
                var9 = 64.0;
                var11 = var5_double * (4.0 * var5_double) / (var9 * 2.0 * var9);
                var13 = var5_double;
                var15 = var5_double * (var5_double * 4.0) / (var9 * (2.0 * var9)) - var7_double;
                while (true) {
                  if (var11 != 0.0) {
                    stackIn_131_0 = compareDoublesNanGreater(-(4.0 * var11 * var15) + var13 * var13, 0.0);
                    if (stackIn_131_0 < 0 &&
                      768.0 > var9) {
                      var9 = var9 + 8.0;
                      var11 = var5_double * (var5_double * 4.0) / (var9 * (2.0 * var9));
                      var13 = var5_double;
                      var15 = var5_double * (4.0 * var5_double) / (var9 * (var9 * 2.0)) - var7_double;
                      continue;
                    }
                  }
                  stackIn_131_0Lifetime1 = compareDoublesNanLess(var11, 0.0);
                  if (stackIn_131_0Lifetime1 == 0) {
                    break;
                  }
                  if (!(0.0 <= -(var15 * (4.0 * var11)) + var13 * var13)) {
                    break;
                  }
                  var17 = (-var13 + Math.sqrt(var13 * var13 - var15 * (4.0 * var11))) / (var11 * 2.0);
                  var19 = (-Math.sqrt(-(4.0 * var11 * var15) + var13 * var13) + -var13) / (2.0 * var11);
                  if (Math.abs(var17) > Math.abs(var19)) {
                    var17 = var19;
                  }
                  var21 = var9 * var9 / (var17 * var17 + 1.0);
                  var23 = var9 * var9 / (1.0 + 1.0 / (var17 * var17));
                  var25Lifetime1 = (int)Math.sqrt(var21);
                  var26Lifetime1 = (int)Math.sqrt(var23);
                  if (!(0.0 < var17)) {
                    if (var5_double > 0.0) {
                      var26Lifetime1 = -var26Lifetime1;
                    }
                  } else {
                    if (var5_double < 0.0) {
                      var26Lifetime1 = -var26Lifetime1;
                    }
                  }
                  if (var25Lifetime1 > 0 &&
                    0.0 > var5_double) {
                    var25Lifetime1 = -var25Lifetime1;
                  }
                  var27Lifetime1 = 8;
                  var28Lifetime1 = (int)((double)((BattleUnit) (var4Lifetime1)).x + (double)(var25Lifetime1 * (4 + ((BattleUnit) (var4Lifetime1)).size / 2 + var27Lifetime1)) / var9);
                  var29 = (int)((double)((BattleUnit) (var4Lifetime1)).y + (double)((var27Lifetime1 - (-(((BattleUnit) (var4Lifetime1)).size / 2) - 4)) * var26Lifetime1) / var9 - (double)(((BattleUnit) (var4Lifetime1)).size / 2));
                  var30 = BevelBoxPainter.createProjectile(this.getUnitByOwner(((BattleUnit) (var4Lifetime1)).ownerPlayer, true), var29, (byte) -122, this, 148, var28Lifetime1, 125);
                  this.onProjectileFinished(52, var30);
                  var30.ageTicks = 20;
                  if (this.playerSpellbook[((BattleUnit) (var4Lifetime1)).ownerPlayer] == 6) {
                    var30.ageTicks = var30.ageTicks - this.field_X[((BattleUnit) (var4Lifetime1)).ownerPlayer] / 4;
                  }
                  var30.velocityX = var25Lifetime1;
                  var30.velocityY = var26Lifetime1;
                  break;
                }
              }
              var4Lifetime1 = (BattleUnit) (IntKeyLookup.field_d.next(-18502));
            }
          }
          stackIn_150_0Lifetime1 = 149;
          stackIn_150_1Lifetime1 = var3_ref.spellType;
          if (stackIn_150_0Lifetime1 == stackIn_150_1Lifetime1 &&
            var3_ref.ageTicks == 256) {
            var3_ref.ageTicks = 0;
          }
          boolean decompiledFrameRemainder1 = true;
          if (var3_ref.owner != null &&
            var3_ref.owner.ownerPlayer == this.currentPlayer) {
            if (127 == var3_ref.spellType) {
              var33 = var3_ref.owner;
              var38 = var33;
              if (var38 != null) {
                var5_ref_jd = new IsaacRandom(new int[]{this.randomSeed, this.round, var33.x, var33.y});
                var6_int = 0;
                while (var6_int < 5) {
                  var39 = BevelBoxPainter.createProjectile((BattleUnit) null, var38.y - var38.size / 2, (byte) 51, this, 95, var38.x, 116);
                  var8 = HuffmanCodec.randomBelow(var5_ref_jd, obfuscationGuard + 2147483579, 8192);
                  var39.velocityX = GradientBarPainter.sine(-56, var8) >> 9;
                  var39.velocityY = (BevelBoxPainter.cosine(var8, -109) * 3 >> 11) - 64;
                  this.onProjectileFinished(52, var39);
                  var6_int++;
                }
                var6_intLifetime1 = 0;
                while (5 > var6_intLifetime1) {
                  var40 = BevelBoxPainter.createProjectile((BattleUnit) null, -(var38.size / 2) + var38.y, (byte) -97, this, 95, var38.x, 122);
                  var8Lifetime1 = HuffmanCodec.randomBelow(var5_ref_jd, -2147483648, 8192);
                  var40.velocityX = GradientBarPainter.sine(-8, var8Lifetime1) >> 9;
                  var40.velocityY = -64 + (3 * BevelBoxPainter.cosine(var8Lifetime1, -113) >> 11);
                  this.onProjectileFinished(obfuscationGuard ^ 113, var40);
                  var6_intLifetime1++;
                }
                this.eraseUnitMask(var38, 0);
                var38.health = 0;
                var38.updateTurnLogic(this.currentPlayer, obfuscationGuard + 51);
              }
            }
            if (var3_ref.spellType == 148) {
              var3_ref.ageTicks = var3_ref.ageTicks + 5;
              this.field_Gb = true;
            }
            if (var3_ref.spellType == 29 &&
              var3_ref.ageTicks > 0) {
              var3_ref.field_H = var3_ref.field_H + 1;
              this.field_Gb = true;
            }
            if (var3_ref.spellType == 19 ||
              var3_ref.spellType == 62) {
              this.field_Gb = true;
              var3_ref.ageTicks = var3_ref.ageTicks + 1;
            }
            if (var3_ref.spellType != 47 &&
              var3_ref.spellType != 71) {
              if (var3_ref.spellType != 142) {
                if (var3_ref.spellType == 36) {
                  var3_ref.ageTicks = var3_ref.ageTicks + 1;
                  this.field_Gb = true;
                } else {
                  if (134 != var3_ref.spellType) {
                    if (var3_ref.spellType != 68) {
                      if (var3_ref.spellType == 138) {
                        var3_ref.ageTicks = 0;
                        this.field_Gb = true;
                      } else {
                        if (var3_ref.spellType == 15) {
                          var3_ref.field_H = var3_ref.field_H + 1;
                          var3_ref.ageTicks = 0;
                          this.field_Gb = true;
                          if (!(var3_ref.field_H < 5)) {
                            var3_ref.remove(obfuscationGuard - 69);
                          }
                        } else {
                          if (var3_ref.spellType != 69 &&
                            var3_ref.spellType != 107) {
                            if (var3_ref.spellType == 148 ||
                              70 == var3_ref.spellType ||
                              var3_ref.spellType == 55 ||
                              111 == var3_ref.spellType) {
                              var3_ref.field_H = var3_ref.field_H + 1;
                              var3_ref.ageTicks = 0;
                              this.field_Gb = true;
                              if (!(var3_ref.field_H < 5)) {
                                var3_ref.remove(obfuscationGuard - 69);
                              }
                            } else {
                              if ((var3_ref.spellType == 157 ||
                                var3_ref.spellType == 168)) {
                                this.field_Gb = true;
                                var3_ref.field_H = var3_ref.field_H + 1;
                                if (!(3 > var3_ref.field_H)) {
                                  var3_ref.ageTicks = -1;
                                  var3_ref.updateMotion(this.round, (byte) -67, this.field_t, this.field_mb);
                                  var3_ref.remove(obfuscationGuard ^ 69);
                                }
                              }
                            }
                          } else {
                            var3_ref.field_H = var3_ref.field_H + 1;
                            this.field_Gb = true;
                            var3_ref.ageTicks = 0;
                            if (!(var3_ref.field_H < 3)) {
                              var3_ref.remove(0);
                            }
                          }
                        }
                      }
                    } else {
                      this.field_Gb = true;
                      var3_ref.field_H = var3_ref.field_H + 1;
                      var3_ref.ageTicks = 0;
                      if (!(var3_ref.field_H < 5)) {
                        var3_ref.remove(0);
                      }
                    }
                  } else {
                    var3_ref.ageTicks = var3_ref.ageTicks + 1;
                    this.field_Gb = true;
                  }
                }
              } else {
                this.field_Gb = true;
                var3_ref.ageTicks = var3_ref.ageTicks + 1;
              }
              decompiledFrameRemainder1 = false;
            }
            else {
              var3_ref.ageTicks = var3_ref.ageTicks + 1;
              this.field_Gb = true;
              if (var3_ref.owner != null &&
                var3_ref.owner.unitType == 5) {
                var3_ref.ageTicks = 301;
              }
            }
          }
          if (var3_ref.spellType == 16) {
            var3_ref.field_H = var3_ref.field_H + 1;
            this.field_Gb = true;
            if (var3_ref.field_H > this.playerCount * 5) {
              var3_ref.remove(0);
            }
          }
          if (117 == var3_ref.spellType) {
            this.field_Gb = true;
            var3_ref.field_H = var3_ref.field_H + 1;
            if (var3_ref.field_H > this.playerCount * 20) {
              var3_ref.applyAreaEffect(0, 16, 32, 8);
              var3_ref.remove(obfuscationGuard ^ 69);
            }
          }
          if (var3_ref.spellType == 127) {
            var3_ref.owner.field_D = true;
          }
          if (var3_ref.spellType == 165) {
            this.field_Gb = true;
            var3_ref.field_H = var3_ref.field_H - 1;
            if (var3_ref.field_H <= 0) {
              var41 = GameOptionType.spawnProjectile((BattleUnit) null, var3_ref.y, false, 163, this, var3_ref.x);
              this.onProjectileFinished(52, var41);
              var3_ref.applyAreaEffect(50, 100, 100, obfuscationGuard ^ 77);
              var3_ref.remove(0);
              var5 = 0;
              while (var5 < 5) {
                var6 = BevelBoxPainter.createProjectile(var3_ref.owner, var3_ref.y, (byte) -109, this, 117, var3_ref.x, 159);
                var7 = var5 * 8192 / 5;
                var6.velocityX = GradientBarPainter.sine(-93, var7) >> 10;
                var6.velocityY = (BevelBoxPainter.cosine(var7, -112) >> 11) - 64;
                this.onProjectileFinished(obfuscationGuard ^ 113, var6);
                var5++;
              }
            }
          }
          var3_ref = (SpellProjectile) (this.projectiles.next(0));
        }
        this.clearProjectiles((byte) 123);
        return;
    }

    private final void generateArenaFeatures(int obfuscationGuard) {
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int var3 = 0;
        BattleUnit var5 = null;
        int var6 = 0;
        BattleUnit var6_ref_ml = null;
        BattleUnit var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        IsaacRandom var12 = null;
        SpellProjectile var13 = null;
        SpellProjectile var14 = null;
        SpellProjectile var15 = null;
        SpellProjectile var16 = null;
        SpellProjectile var17 = null;
        SpellProjectile var18 = null;
        SpellProjectile var19 = null;
        int stackIn_68_0Lifetime1;
        int stackIn_68_1Lifetime1;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var8Lifetime2;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        this.field_mb = -1000;
        if (obfuscationGuard != -17837) {
          return;
        }
        var12 = new IsaacRandom(new int[]{this.randomSeed, this.round});
        var3 = ScreenDisplayMode.randomBelow(var12, 2, (byte) -68);
        if (var3 != 0) {
          var3 = -128 + this.arenaWidth - ScreenDisplayMode.randomBelow(var12, (this.round - this.getTurnTimeLimit(4)) / this.playerCount * 128 + 1, (byte) -57);
          if (!(var3 >= 128)) {
            var3 = 128 + ScreenDisplayMode.randomBelow(var12, -256 + this.arenaWidth, (byte) -32);
            if (var11 != 0) {
              var3 = 128 + ScreenDisplayMode.randomBelow(var12, 128 * ((this.round - this.getTurnTimeLimit(4)) / this.playerCount) + 1, (byte) -66);
              if ((-128 + this.arenaWidth) < var3) {
                var3 = ScreenDisplayMode.randomBelow(var12, -256 + this.arenaWidth, (byte) -31) + 128;
              }
            }
          }
        } else {
          var3 = 128 + ScreenDisplayMode.randomBelow(var12, 128 * ((this.round - this.getTurnTimeLimit(4)) / this.playerCount) + 1, (byte) -66);
          if ((-128 + this.arenaWidth) < var3) {
            var3 = ScreenDisplayMode.randomBelow(var12, -256 + this.arenaWidth, (byte) -31) + 128;
          }
        }
        boolean decompiledFrameRemainder6 = true;
        var5 = this.getUnitByOwner(this.currentPlayer, true);
        var6 = this.arenaTheme;
        if (var6 != 3 ||
          var11 != 0) {
          boolean decompiledFrameRemainder7 = true;
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          if ((0 != var6 ||
            var11 != 0) &&
            (decompiledFrameRemainder0 = (2 != var6 ||
            var11 != 0)) &&
            (decompiledFrameRemainder1 = (5 != var6 ||
            var11 != 0)) &&
            (decompiledFrameRemainder2 = (var6 != 1 ||
            var11 != 0)) &&
            (decompiledFrameRemainder3 = (4 != var6)) &&
            (decompiledFrameRemainder4 = (var6 != 6)) &&
            (decompiledFrameRemainder5 = (7 != var6 ||
            var11 != 0))) {
            decompiledFrameRemainder7 = (var6 == 8);
            if ((decompiledFrameRemainder7) &&
              (var11 == 0)) {
              var19 = BevelBoxPainter.createProjectile(var5, this.arenaHeight, (byte) 19, this, 0, var3, 74);
              var19.ageTicks = 0 - this.round;
              var19.velocityY = -512;
              var19.velocityX = 0;
              if (var19.ageTicks < -100) {
                var19.ageTicks = -100;
              }
              this.onProjectileFinished(52, var19);
              this.field_mb = -1;
              var6 = 0;
              var7 = (BattleUnit) (this.units.first(obfuscationGuard ^ -29924));
              while (var7 != null) {
                stackIn_68_0 = ~var7.unitType;
                stackIn_68_1 = -12;
                if (stackIn_68_0 == stackIn_68_1) {
                  var8 = var7.subpixelX >> 4;
                  var9 = var7.subpixelY >> 4;
                  var10 = Math.abs(-var3 + var8) + Math.abs(-this.arenaHeight + var8);
                  if (this.field_mb == -1 ||
                    var10 < var6) {
                    var6 = var10;
                    this.field_mb = var8;
                    this.field_t = var9;
                  }
                }
                if (var7.hasNoLinkedUnit(94) &&
                  var7.unitType != 20 &&
                  this.round > (20 * this.playerCount) &&
                  var7 == var5) {
                  this.field_t = var7.subpixelY >> 4;
                  this.field_mb = var7.subpixelX >> 4;
                }
                var7 = (BattleUnit) (this.units.next(0));
              }
              stackIn_68_0Lifetime1 = -1;
              stackIn_68_1Lifetime1 = this.field_mb;
              decompiledFrameRemainder6 = (stackIn_68_0Lifetime1 == stackIn_68_1Lifetime1);
              if (decompiledFrameRemainder6) {
                this.field_mb = 128 + ScreenDisplayMode.randomBelow(var12, this.arenaWidth - 256, (byte) -121);
                this.field_t = 128 + ScreenDisplayMode.randomBelow(var12, this.arenaHeight - 128, (byte) -32);
                decompiledFrameRemainder7 = false;
              }
            }
          }
          if (((decompiledFrameRemainder7) && (decompiledFrameRemainder6) && (decompiledFrameRemainder5) && (decompiledFrameRemainder4) && (decompiledFrameRemainder3) && (decompiledFrameRemainder2) && (decompiledFrameRemainder1) && (decompiledFrameRemainder0)) &&
            (decompiledFrameRemainder6 = (this.round % 5 == 0))) {
            var13 = BevelBoxPainter.createProjectile(var5, this.arenaHeight, (byte) 82, this, 22, var3, 19);
            var13.field_w = true;
            this.onProjectileFinished(52, var13);
            decompiledFrameRemainder7 = (var11 != 0);
          }
          if (((decompiledFrameRemainder7) && (decompiledFrameRemainder6) && (decompiledFrameRemainder5) && (decompiledFrameRemainder4) && (decompiledFrameRemainder3) && (decompiledFrameRemainder2) && (decompiledFrameRemainder1)) &&
            (decompiledFrameRemainder7 = (0 == this.round % 2))) {
            var14 = BevelBoxPainter.createProjectile(var5, this.arenaHeight, (byte) -97, this, 35, var3, 29);
            var14.field_w = true;
            this.onProjectileFinished(52, var14);
            decompiledFrameRemainder7 = (var11 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            var6 = this.arenaHeight / 2;
            var7_int = DisplayNameChangedDialog.log2Floor((480 + var6) * 32 / 4, -266740663);
            var8Lifetime2 = -96 + 192 * (1 & var3);
            var9Lifetime1 = 1;
            var10Lifetime1 = 0;
            while (true) {
              if (var10Lifetime1 < 7) {
                var9Lifetime1 = -var9Lifetime1;
                var15 = BevelBoxPainter.createProjectile(var5, -544, (byte) 99, this, 61, -(var8Lifetime2 * var9Lifetime1 * var7_int / 16) + (-3 + var10Lifetime1) * 48 + var3, 50);
                var15.velocityY = 0;
                var15.velocityX = var9Lifetime1 * var8Lifetime2;
                var15.field_w = true;
                this.onProjectileFinished(52, var15);
                var10Lifetime1++;
                if (var11 == 0) {
                  continue;
                }
              } else {
                this.field_t = var6;
                this.field_mb = var3;
              }
              break;
            }
            decompiledFrameRemainder7 = (var11 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            var6 = this.arenaHeight / 2;
            var7_intLifetime1 = DisplayNameChangedDialog.log2Floor((15360 + 32 * var6) / 4, obfuscationGuard ^ 266757658);
            var8Lifetime1 = (var3 & 1) * 192 - 96;
            var16 = BevelBoxPainter.createProjectile(var5, -544, (byte) -117, this, 58, var3 - var7_intLifetime1 * var8Lifetime1 / 16, 49);
            var16.field_w = true;
            var16.velocityY = 0;
            var16.velocityX = var8Lifetime1;
            this.onProjectileFinished(52, var16);
            decompiledFrameRemainder7 = (var11 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4)) {
            var17 = BevelBoxPainter.createProjectile(var5, -480, (byte) -93, this, 46, var3, 36);
            var17.field_w = true;
            var17.velocityY = 0;
            var17.velocityX = 0;
            this.onProjectileFinished(52, var17);
            decompiledFrameRemainder7 = (var11 != 0);
          }
          if (((decompiledFrameRemainder7) && (decompiledFrameRemainder6) && (decompiledFrameRemainder5)) &&
            (decompiledFrameRemainder7 = (this.round % 2 == 0))) {
            var18 = BevelBoxPainter.createProjectile(var5, -480, (byte) -125, this, 73, var3, 60);
            var18.field_w = true;
            this.onProjectileFinished(obfuscationGuard ^ -17817, var18);
            decompiledFrameRemainder7 = (var11 != 0);
          }
          if ((decompiledFrameRemainder7) && ((decompiledFrameRemainder6) &&
            (decompiledFrameRemainder6 = !(this.countTeamUnits((byte) -119, this.currentPlayer) >= 4)))) {
            var6_ref_ml = new BattleUnit(36, var3, -480, this.nextUnitId(obfuscationGuard ^ 17881), this, var5);
            this.addUnit((byte) -117, var6_ref_ml);
            this.field_ob[this.currentPlayer] = this.field_ob[this.currentPlayer] + 1;
          }
        }

    }

    final void updateTurnTimer(byte param0, int param1) {
        int var4;
        BattleUnit var5;
        int var6;
        BattleUnit var7;
        int stackIn_20_0 = 0;
        int var4Lifetime1;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (this.currentPlayer >= 0 &&
          this.field_ib[this.currentPlayer] < this.field_tb) {
          this.field_ib[this.currentPlayer] = this.field_tb;
        }
        var7 = this.getUnitByOwner(this.currentPlayer, true);
        if (var7 != null &&
          128 + this.arenaHeight <= var7.y) {
          var4 = var7.health / 2;
          if (var4 < 25) {
            var4 = 25;
          }
          var7.pendingDamage = var7.pendingDamage + var4;
          var7.moving = true;
        }
        var4Lifetime1 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (this.playerCount <= var4Lifetime1))) {
          stackIn_20_0 = 1 << var4Lifetime1 & param1;
          if (var6 == 0) {
            if (stackIn_20_0 != 0) {
              var5 = this.getUnitByOwner(var4Lifetime1, true);
              if (var5 != null) {
                var5.health = 0;
                var5.pendingDamage = 1;
              }
            }
            var4Lifetime1++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_20_0 = param0;
        }
        if (stackIn_20_0 != 88) {
          this.updateTurnTimer((byte) -37, -9);
        }
        return;
    }

    final boolean canLandAt(BattleUnit param0, int y, int x, int obfuscationGuard) {
        boolean discarded$1 = false;
        IndexedSprite var6 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var6 = SocketConnector.field_j[29];
          y = y - var6.field_k;
          if (obfuscationGuard != -5) {
            discarded$1 = this.hasFreeSpellSlot(-47, -85, 123);
          }
          x = x - var6.field_g / 2;
          if (var6.field_j + x >= 0 &&
            var6.field_j + (x + var6.field_h) <= this.arenaWidth &&
            y + var6.field_f >= 0) {
            if (y + var6.field_k >= -5 + this.arenaHeight) {
              return false;
            }
            stackIn_14_0 = !(this.spriteOverlapsTerrain(y, obfuscationGuard + 7, x, var6.toRgbSprite())) || !(BitHelpers.field_b);
            return stackIn_14_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("nf.OB(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(y).append(',').append(x).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void stampShapeWithMask(int y, int obfuscationGuard, IndexedSprite shape, int x, IndexedSprite target) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var12Lifetime1;
        int var12Lifetime2;
        try {
          if (target == null) {
            return;
          }
          y = y + shape.field_f;
          x = x + shape.field_j;
          var6_int = y * this.arenaWidth + x;
          var7 = 0;
          if (obfuscationGuard < 103) {
            this.isGameOver(-7, -107);
          }
          var8 = shape.field_c;
          var9 = shape.field_h;
          var10 = this.arenaWidth - var9;
          var11 = 0;
          if (y < 0) {
            var12 = 0 - y;
            var6_int = var6_int + this.arenaWidth * var12;
            var7 = var7 + var12 * var9;
            var8 = var8 - var12;
            y = 0;
          }
          if (0 > x) {
            var12Lifetime1 = 0 - x;
            var6_int = var6_int + var12Lifetime1;
            x = 0;
            var10 = var10 + var12Lifetime1;
            var7 = var7 + var12Lifetime1;
            var9 = var9 - var12Lifetime1;
            var11 = var11 + var12Lifetime1;
          }
          if ((y + var8) > (-1 + this.arenaHeight)) {
            var8 = var8 - (1 - this.arenaHeight + (var8 + y));
          }
          if (-1 + this.arenaWidth < var9 + x) {
            var12Lifetime2 = var9 + x + (-this.arenaWidth + 1);
            var10 = var10 + var12Lifetime2;
            var9 = var9 - var12Lifetime2;
            var11 = var11 + var12Lifetime2;
          }
          if (var9 > 0 &&
            var8 > 0) {
            IntrusiveDeque.blitMaskedBytes(shape.field_m, var9, var7, 111, var6_int, var11, var8, target.field_m, var10, true);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("nf.HC(").append(y).append(',').append(obfuscationGuard).append(',');
          if (shape == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(x).append(',');
          if (target == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final int getPlayerValue(int obfuscationGuard, int param1) {
        int var3 = -119 % ((obfuscationGuard + 17) / 56);
        return this.field_E[param1];
    }

    final void beginTurn(int currentPlayer, byte obfuscationGuard, int param2) {
        boolean discarded$0 = false;
        if (obfuscationGuard < 18) {
          discarded$0 = this.hasLivingPlayers((byte) 46);
        }
        this.currentPlayer = currentPlayer;
        this.turnActive = true;
        this.finishTurn(9, param2);
    }

    final boolean isGameOver(int param0, int obfuscationGuard) {
        int var3;
        int var4;
        int var5;
        BattleUnit var6;
        int var7;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var5Lifetime1;
        BattleUnit var6Lifetime1;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (this.turnActive) {
          throw new IllegalStateException();
        }
        boolean decompiledFrameCompleted0 = true;
        if (this.teamMode) {
          var3 = 0;
          var4 = -1;
          var5 = 0;
          while (true) {
            if (var5 < this.playerCount) {
              var6 = this.getUnitByOwner(var5, true);
              if (var7 == 0) {
                if (var6 != null) {
                  var3 = var3 | (var5 & 1) + 1;
                  var4 = var5;
                }
                var5++;
                continue;
              }
            } else {
              if (1 < IntensityTableHelpers.bitCount(var3, (byte) -68)) {
                if (var7 == 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                break;
              }
              this.beginTurn(var4, (byte) 98, param0);
            }
            return true;
          }
        }
        if (decompiledFrameCompleted0) {
          var3Lifetime2 = -1;
          var4Lifetime1 = 0;
          var5Lifetime1 = 0;
          while (true) {
            if (var5Lifetime1 < this.playerCount) {
              var6Lifetime1 = this.getUnitByOwner(var5Lifetime1, true);
              if (var7 == 0) {
                if (var6Lifetime1 != null) {
                  var4Lifetime1++;
                  var3Lifetime2 = var5Lifetime1;
                }
                var5Lifetime1++;
                continue;
              }
            } else {
              if (1 < var4Lifetime1) {
                break;
              }
              this.beginTurn(var3Lifetime2, (byte) 46, param0);
            }
            return true;
          }
        }
        var3Lifetime1 = 119 / ((-1 - obfuscationGuard) / 56);
        return false;
    }

    final void queueAction(int param0, int param1, byte obfuscationGuard, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.actionQueue.addLast(new BattleAction(param0, param7, param4, param5, param8, param6, param1, param3), -1);
        int var10 = -97 % ((obfuscationGuard + 41) / 40);
    }

    final boolean isBusy(byte obfuscationGuard) {
        int[] discarded$1 = null;
        boolean stackIn_7_0 = false;
        if (obfuscationGuard != -128) {
          discarded$1 = this.generateTenPointProfile(-37, (IsaacRandom) null);
        }
        stackIn_7_0 = (this.isGameEnded((byte) -94)) || !(this.actionQueue.isEmpty(true));
        return stackIn_7_0;
    }

    final int getTerrainOffset(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          this.startTurn(20, true, -2);
        }
        return this.field_w;
    }

    final int runUntilIdle(byte obfuscationGuard) {
        int var2;
        int var3;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = 0;
        scanLoop1: while (true) {
          this.update(false, (CameraFollowTarget) null, 106);
          if (!this.isBusy((byte) -128) &&
            !this.waitingForInput &&
            var3 == 0) {
            if (obfuscationGuard != 72) {
              this.field_b = (int[]) null;
            }
            return var2;
          }
          var2++;
          do {
            if (4096 >= var2) {
              continue scanLoop1;
            }
          } while (var3 != 0);
          break;
        }
        throw new ClientRuntimeException();
    }

    final void onProjectileFinished(int obfuscationGuard, SpellProjectile projectile) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (!projectile.isPersistentType(obfuscationGuard - 149)) {
            this.field_Gb = true;
            decompiledFrameRemainder0 = !(!ArcanistsMulti.field_G);
          }
          if ((decompiledFrameRemainder0) &&
            (this.field_l)) {
            return;
          }
          this.spawnedProjectiles.addLast(projectile, -1);
          if (obfuscationGuard != 52) {
            this.field_Z = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("nf.AD(").append(obfuscationGuard).append(',');
          if (projectile == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final boolean isImmuneToSpell(int spellType, BattleUnit unit, int obfuscationGuard) {
        int stackIn_96_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_105_0 = 0;
        boolean stackIn_114_0 = false;
        boolean stackIn_117_0 = false;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        String stackIn_123_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (120 == spellType &&
            unit.unitType == 11) {
            return true;
          }
          if (spellType == 121 &&
            4 == unit.unitType) {
            return true;
          }
          if (spellType == 122 &&
            unit.unitType == 5) {
            return true;
          }
          if (spellType == 123 &&
            unit.unitType == 5) {
            return true;
          }
          if (124 == spellType &&
            unit.unitType == 1) {
            return true;
          }
          if (125 == spellType &&
            unit.unitType == 1) {
            return true;
          }
          if (spellType == 137 &&
            2 == unit.unitType) {
            return true;
          }
          if (spellType == 126 &&
            3 == unit.unitType) {
            return true;
          }
          if (127 == spellType &&
            unit.unitType == 13) {
            return true;
          }
          if (spellType == 128 &&
            unit.unitType == 15) {
            return true;
          }
          if (spellType == 129 &&
            14 == unit.unitType) {
            return true;
          }
          if (spellType == 136 &&
            unit.unitType == 26) {
            return true;
          }
          if (spellType == 130 &&
            7 == unit.unitType) {
            return true;
          }
          if (spellType == 131 &&
            8 == unit.unitType) {
            return true;
          }
          if (138 == spellType &&
            unit.unitType == 9) {
            return true;
          }
          if (spellType == 132 &&
            10 == unit.unitType) {
            return true;
          }
          if (spellType == 154 &&
            unit.unitType == 37) {
            return true;
          }
          if (spellType == 155 &&
            unit.unitType == 39) {
            return true;
          }
          if (spellType == 149 &&
            unit.unitType == 31) {
            return true;
          }
          if (spellType == 148 &&
            33 == unit.unitType) {
            return true;
          }
          if (133 == spellType &&
            unit.unitType == 25) {
            return true;
          }
          if (62 == spellType &&
            10 == unit.unitType) {
            stackIn_96_0 = 1;
            if (unit.field_U) {
              stackIn_97_1 = 0;
            } else {
              stackIn_97_1 = 1;
            }
            if (stackIn_96_0 != stackIn_97_1) {
              return true;
            }
          }
          if (spellType == 62 &&
            unit.unitType == 17) {
            stackIn_105_0 = (unit.field_U) ? 0 : 1;
            if (stackIn_105_0 != 1) {
              return true;
            }
          }
          if (obfuscationGuard != 1) {
            this.generateTerrain(40, true);
          }
          if (135 == spellType) {
            stackIn_114_0 = this.hasFreeSpellSlot(unit.ownerPlayer, 72, 0);
            return stackIn_114_0;
          }
          if (spellType != 134) {
            return false;
          }
          stackIn_117_0 = this.hasFreeSpellSlot(unit.ownerPlayer, 41, 0);
          return stackIn_117_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_122_0 = var4;
          stackIn_122_1 = new StringBuilder().append("nf.KA(").append(spellType).append(',');
          if (unit == null) {
            stackIn_123_2 = "null";
          } else {
            stackIn_123_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_122_0), ((StringBuilder) (Object) stackIn_122_1).append(stackIn_123_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final IntrusiveDeque getEffectList(byte obfuscationGuard) {
        if (obfuscationGuard != 48) {
          this.field_t = -21;
        }
        return this.field_r;
    }

    final int countTeamUnits(byte obfuscationGuard, int ownerPlayer) {
        int[] discarded$1 = null;
        int var3;
        BattleUnit var4;
        int var5;
        int stackIn_11_0 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        MidiPcmStream.field_D.setDeque((byte) 102, this.units);
        var3 = 0;
        if (obfuscationGuard >= -101) {
          discarded$1 = this.generateSixPointProfile((IsaacRandom) null, -100);
        }
        var4 = (BattleUnit) (MidiPcmStream.field_D.first(-107));
        while (var4 != null) {
          stackIn_11_0 = 12;
          if (var5 != 0) {
            return stackIn_11_0;
          }
          if (stackIn_11_0 != var4.unitType &&
            var4.linkedUnit != null &&
            ownerPlayer == var4.ownerPlayer) {
            var3++;
          }
          var4 = (BattleUnit) (MidiPcmStream.field_D.next(-18502));
        }
        return var3;
    }

    final void renderTerrainSprite(boolean obfuscationGuard) {
        int[] discarded$0 = null;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int[] array$5 = null;
        int[] array$6 = null;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        int stackIn_131_0 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        Sprite var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        IsaacRandom var24 = null;
        BattleUnit var25 = null;
        BattleUnit var26 = null;
        BattleUnit var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int stackIn_16_0Lifetime1;
        int stackIn_16_1Lifetime1;
        int stackIn_27_0Lifetime1;
        int stackIn_27_1Lifetime1;
        int stackIn_39_0Lifetime1;
        int stackIn_49_0Lifetime1;
        int stackIn_49_1Lifetime1;
        int stackIn_61_0Lifetime1;
        int stackIn_61_1Lifetime1;
        int stackIn_67_0Lifetime1;
        int stackIn_67_1Lifetime1;
        int stackIn_98_0Lifetime1;
        int stackIn_98_1Lifetime1;
        int stackIn_109_0Lifetime1;
        int stackIn_109_1Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var13Lifetime2;
        int var14Lifetime2;
        var16 = ArcanistsMulti.field_G ? 1 : 0;
        var24 = new IsaacRandom(new int[]{this.randomSeed, -2});
        if (!obfuscationGuard) {
          discarded$0 = this.generateTwentyPointLowProfile(-68, (IsaacRandom) null);
        }
        boolean decompiledFrameRemainder3 = true;
        var3 = 0;
        var4 = this.playerCount;
        var7 = new Sprite(36, 36);
        var7.makeRasterTarget();
        SoftwareRasterizer.fillCircle(18, 18, 16, 16777215);
        if (this.teamMode) {
          var8 = 0;
          var9 = this.playerCount;
          scanLoop1: while (true) {
            var29 = new int[var4];
            var21 = var29;
            var6 = var21;
            var3 = 0;
            var28 = new int[var4];
            var20 = var28;
            var5 = var20;
            var12 = 0;
            scanLoop2: while (true) {
              stackIn_6_0 = ~var4;
              scanLoop3: while (true) {
                if (stackIn_6_0 < ~var12) {
                  var13 = this.arenaWidth / 2 * (1 + var12) / (1 + var4);
                  stackIn_33_0 = var12 & 1;
                  if (var16 == 0) {
                    boolean decompiledFrameRemainder1 = true;
                    if (stackIn_33_0 == 0) {
                      var14 = this.arenaHeight - 64;
                      while (SpriteOverlapHelpers.spriteOverlapsMask(var7, var13 - 18, var14 - 34, this.terrainSprite, 0, 0)) {
                        stackIn_16_0 = var14;
                        stackIn_16_1 = 64;
                        if (stackIn_16_0 >= stackIn_16_1) {
                          var14--;
                          continue;
                        }
                        break;
                      }
                      stackIn_16_0Lifetime1 = ~(this.arenaHeight - 64);
                      stackIn_16_1Lifetime1 = ~var14;
                      if (stackIn_16_0Lifetime1 != stackIn_16_1Lifetime1 &&
                        var14 > 64) {
                        var28[var3] = var13;
                        var29[var3] = var14;
                        var3++;
                      }
                      decompiledFrameRemainder1 = false;
                    }
                    else {
                      var14 = 64;
                      while (true) {
                        if (!SpriteOverlapHelpers.spriteOverlapsMask(var7, var13 - 18, var14 - 33, this.terrainSprite, 0, 0)) {
                          stackIn_27_0 = ~(this.arenaHeight - 64);
                          stackIn_27_1 = ~var14;
                          if (stackIn_27_0 <= stackIn_27_1) {
                            var14++;
                            continue;
                          }
                        }
                        stackIn_27_0Lifetime1 = ~(-64 + this.arenaHeight);
                        stackIn_27_1Lifetime1 = ~var14;
                        if (stackIn_27_0Lifetime1 >= stackIn_27_1Lifetime1) {
                          break;
                        }
                        if (var14 == 64) {
                          break;
                        }
                        var28[var3] = var13;
                        var29[var3] = var14;
                        var3++;
                        break;
                      }
                    }
                    var12++;
                    continue scanLoop2;
                  }
                } else {
                  stackIn_33_0 = ~this.playerCount;
                }
                if (stackIn_33_0 < ~var3) {
                  var4 += 4;
                  if (var4 < 100) {
                    continue scanLoop1;
                  }
                }
                while (true) {
                  var30 = new int[var9];
                  var22 = var30;
                  var10_ref_int__ = var22;
                  var8 = 0;
                  var31 = new int[var9];
                  var23 = var31;
                  var17 = var23;
                  var11 = var17;
                  stackIn_6_0 = 0;
                  if (var16 != 0) {
                    continue scanLoop3;
                  }
                  var12 = stackIn_6_0;
                  while (true) {
                    stackIn_39_0 = var12;
                    if (stackIn_39_0 < var9) {
                      var13Lifetime2 = this.arenaWidth / 2 + (var12 + 1) * (this.arenaWidth / 2) / (1 + var9);
                      stackIn_67_0 = ~(var12 & 1);
                      stackIn_67_1 = -1;
                      boolean decompiledFrameRemainder2 = true;
                      if (stackIn_67_0 == stackIn_67_1) {
                        var14Lifetime2 = -64 + this.arenaHeight;
                        while (SpriteOverlapHelpers.spriteOverlapsMask(var7, var13Lifetime2 - 18, var14Lifetime2 - 34, this.terrainSprite, 0, 0)) {
                          stackIn_49_0 = -65;
                          stackIn_49_1 = ~var14Lifetime2;
                          if (stackIn_49_0 >= stackIn_49_1) {
                            var14Lifetime2--;
                            continue;
                          }
                          break;
                        }
                        stackIn_49_0Lifetime1 = ~(-64 + this.arenaHeight);
                        stackIn_49_1Lifetime1 = ~var14Lifetime2;
                        if (stackIn_49_0Lifetime1 != stackIn_49_1Lifetime1 &&
                          64 < var14Lifetime2) {
                          var30[var8] = var13Lifetime2;
                          var31[var8] = var14Lifetime2;
                          var8++;
                        }
                        decompiledFrameRemainder2 = false;
                      }
                      else {
                        var14Lifetime2 = 64;
                        while (true) {
                          if (!SpriteOverlapHelpers.spriteOverlapsMask(var7, var13Lifetime2 - 18, var14Lifetime2 - 33, this.terrainSprite, 0, 0)) {
                            stackIn_61_0 = ~(this.arenaHeight - 64);
                            stackIn_61_1 = ~var14Lifetime2;
                            if (stackIn_61_0 <= stackIn_61_1) {
                              var14Lifetime2++;
                              continue;
                            }
                          }
                          stackIn_61_0Lifetime1 = this.arenaHeight - 64;
                          stackIn_61_1Lifetime1 = var14Lifetime2;
                          if (stackIn_61_0Lifetime1 <= stackIn_61_1Lifetime1) {
                            break;
                          }
                          if (var14Lifetime2 == 64) {
                            break;
                          }
                          var30[var8] = var13Lifetime2;
                          var31[var8] = var14Lifetime2;
                          var8++;
                          break;
                        }
                      }
                      var12++;
                      continue;
                    }
                    break;
                  }
                  stackIn_67_0Lifetime1 = ~var8;
                  stackIn_67_1Lifetime1 = ~this.playerCount;
                  if (stackIn_67_0Lifetime1 > stackIn_67_1Lifetime1 ||
                    var16 != 0) {
                    var9 += 4;
                    if (100 > var9) {
                      continue;
                    }
                  }
                  break;
                }
                break;
              }
              break;
            }
            break;
          }
          this.unitIdCounter = 0;
          stackIn_39_0Lifetime1 = 0;
          var12Lifetime1 = stackIn_39_0Lifetime1;
          while (this.playerCount > var12Lifetime1) {
            var13Lifetime1 = 0;
            stackIn_131_0 = -1;
            if (stackIn_131_0 == ~(1 & var12Lifetime1)) {
              if (0 != var3) {
                var14Lifetime1 = ScreenDisplayMode.randomBelow(var24, var3, (byte) -110);
                fieldTemp$1 = this.unitIdCounter;
                this.unitIdCounter = this.unitIdCounter + 1;
                this.addUnit((byte) -123, new BattleUnit(var13Lifetime1, var28[var14Lifetime1], var29[var14Lifetime1], fieldTemp$1, this, var12Lifetime1));
                var3--;
                var5[var14Lifetime1] = var28[var3];
                var6[var14Lifetime1] = var29[var3];
              } else {
                var14Lifetime1 = ScreenDisplayMode.randomBelow(var24, var12Lifetime1, (byte) -123);
                var25 = this.getUnitByOwner(var14Lifetime1, true);
                fieldTemp$2 = this.unitIdCounter;
                this.unitIdCounter = this.unitIdCounter + 1;
                this.addUnit((byte) -124, new BattleUnit(var13Lifetime1, var25.x, -32 + var25.y, fieldTemp$2, this, var12Lifetime1));
              }
            } else if (var8 == 0) {
              var14Lifetime1 = ScreenDisplayMode.randomBelow(var24, var12Lifetime1, (byte) -81);
              var26 = this.getUnitByOwner(var14Lifetime1, true);
              fieldTemp$3 = this.unitIdCounter;
              this.unitIdCounter = this.unitIdCounter + 1;
              this.addUnit((byte) -122, new BattleUnit(var13Lifetime1, var26.x, var26.y - 32, fieldTemp$3, this, var12Lifetime1));
            } else {
              var14Lifetime1 = ScreenDisplayMode.randomBelow(var24, var8, (byte) -53);
              var8--;
              fieldTemp$4 = this.unitIdCounter;
              this.unitIdCounter = this.unitIdCounter + 1;
              this.addUnit((byte) -116, new BattleUnit(var13Lifetime1, var30[var14Lifetime1], var31[var14Lifetime1], fieldTemp$4, this, var12Lifetime1));
              var10_ref_int__[var14Lifetime1] = var30[var8];
              var17[var14Lifetime1] = var31[var8];
            }
            var12Lifetime1++;
          }
          decompiledFrameRemainder3 = false;
        }
        else {
          scanLoop4: while (true) {
            array$5 = new int[var4];
            var19 = array$5;
            var6 = array$5;
            array$6 = new int[var4];
            var18 = array$6;
            var5 = array$6;
            var3 = 0;
            var8 = 0;
            scanLoop5: while (true) {
              stackIn_88_0 = ~var4;
              do {
                if (stackIn_88_0 < ~var8) {
                  var9 = this.arenaWidth * (var8 + 1) / (1 + var4);
                  stackIn_115_0 = 0;
                  stackIn_115_1 = var8 & 1;
                  if (var16 == 0) {
                    boolean decompiledFrameRemainder0 = true;
                    if (stackIn_115_0 == stackIn_115_1) {
                      var10 = this.arenaHeight - 64;
                      while (SpriteOverlapHelpers.spriteOverlapsMask(var7, -18 + var9, var10 - 34, this.terrainSprite, 0, 0)) {
                        stackIn_98_0 = 64;
                        stackIn_98_1 = var10;
                        if (stackIn_98_0 <= stackIn_98_1) {
                          var10--;
                          continue;
                        }
                        break;
                      }
                      stackIn_98_0Lifetime1 = var10;
                      stackIn_98_1Lifetime1 = -64 + this.arenaHeight;
                      if (stackIn_98_0Lifetime1 != stackIn_98_1Lifetime1 &&
                        64 < var10) {
                        var18[var3] = var9;
                        var19[var3] = var10;
                        var3++;
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      var10 = 64;
                      while (true) {
                        if (!SpriteOverlapHelpers.spriteOverlapsMask(var7, -18 + var9, 1 + var10 - 34, this.terrainSprite, 0, 0)) {
                          stackIn_109_0 = ~var10;
                          stackIn_109_1 = ~(-64 + this.arenaHeight);
                          if (stackIn_109_0 >= stackIn_109_1) {
                            var10++;
                            continue;
                          }
                        }
                        stackIn_109_0Lifetime1 = this.arenaHeight - 64;
                        stackIn_109_1Lifetime1 = var10;
                        if (stackIn_109_0Lifetime1 <= stackIn_109_1Lifetime1) {
                          break;
                        }
                        if (var10 == 64) {
                          break;
                        }
                        var18[var3] = var9;
                        var19[var3] = var10;
                        var3++;
                        break;
                      }
                    }
                    var8++;
                    continue scanLoop5;
                  }
                } else {
                  stackIn_115_0 = ~var3;
                  stackIn_115_1 = ~this.playerCount;
                }
                if (stackIn_115_0 > stackIn_115_1 ||
                  var16 != 0) {
                  var4 += 4;
                  if (var4 < 100) {
                    continue scanLoop4;
                  }
                }
                this.unitIdCounter = 0;
                stackIn_88_0 = 0;
              } while (var16 != 0);
              break;
            }
            break;
          }
          var8 = stackIn_88_0;
          while (this.playerCount > var8) {
            var9 = 0;
            stackIn_131_0 = -10;
            if (stackIn_131_0 == ~this.playerSpellbook[var8]) {
              var9 = 27;
            }
            if (var3 != 0) {
              var10 = ScreenDisplayMode.randomBelow(var24, var3, (byte) -79);
              fieldTemp$7 = this.unitIdCounter;
              this.unitIdCounter = this.unitIdCounter + 1;
              this.addUnit((byte) -127, new BattleUnit(var9, var18[var10], var19[var10], fieldTemp$7, this, var8));
              var3--;
              var18[var10] = var18[var3];
              var19[var10] = var19[var3];
            } else {
              var10 = ScreenDisplayMode.randomBelow(var24, var8, (byte) -124);
              var27 = this.getUnitByOwner(var10, true);
              fieldTemp$8 = this.unitIdCounter;
              this.unitIdCounter = this.unitIdCounter + 1;
              this.addUnit((byte) -118, new BattleUnit(var9, var27.x, -32 + var27.y, fieldTemp$8, this, var8));
            }
            var8++;
          }
        }
        stackIn_131_0 = this.runUntilIdle((byte) 72);
    }

    final int[] getPlayerSpellSlots(int obfuscationGuard, int player) {
        if (obfuscationGuard != 3) {
          field_P = (JaggrabDownloader) null;
        }
        return this.spellSlots[player];
    }

    final void update(boolean param0, CameraFollowTarget cameraTarget, int param2) {
        int[] discarded$0 = null;
        int stackIn_4_0 = 0;
        SpellProjectile stackIn_10_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        SpellProjectile stackOut_9_0;
        int var4_int = 0;
        RuntimeException var4 = null;
        SpellProjectile var5 = null;
        BattleUnit var5_ref = null;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          stackIn_4_0 = (this.isGameEnded((byte) -104)) ? 0 : 1;
          var4_int = stackIn_4_0;
          this.waitingForInput = false;
          this.field_Gb = false;
          this.field_Mb = false;
          if (var4_int != 0) {
            this.executeNextAction(-109, cameraTarget);
          }
          var5 = (SpellProjectile) (this.projectiles.first(12623));
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var5 == null))) {
            var5.updateMotion(this.round, (byte) -47, this.field_t, this.field_mb);
            stackOut_9_0 = var5;
            stackIn_14_0 = stackOut_9_0;
            stackIn_10_0 = stackOut_9_0;
            if (var6 == 0) {
              if (((SpellProjectile) (Object) stackIn_10_0).isLinked((byte) -32)) {
                this.field_Gb = this.field_Gb | var5.isAlive(-139);
              }
              var5 = (SpellProjectile) (this.projectiles.next(0));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            HuffmanCodec.field_f.setDeque((byte) 120, this.units);
            stackIn_14_0 = HuffmanCodec.field_f.first(-67);
          }
          var5_ref = (BattleUnit) (stackIn_14_0);
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var5_ref == null))) {
            stackIn_30_0 = var5_ref.field_M;
            if (var6 == 0) {
              if (stackIn_30_0 != 0) {
                this.waitingForInput = true;
              }
              if (var5_ref.moving &&
                var5_ref.pendingDamage == 0) {
                this.waitingForInput = true;
              }
              var5_ref.processTurnStart(-55);
              if (var5_ref.isLinked((byte) -32)) {
                this.field_Gb = this.field_Gb | var5_ref.isMarkedForRemoval(true);
                this.field_Mb = this.field_Mb | var5_ref.isRemoving(120);
              } else {
                this.field_Gb = true;
              }
              var5_ref = (BattleUnit) (HuffmanCodec.field_f.next(-18502));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_30_0 = param2;
          }
          if (stackIn_30_0 < 103) {
            discarded$0 = this.generateThirtyPointProfile(126, (IsaacRandom) null);
          }
          this.clearProjectiles((byte) 78);
          if (this.field_Gb) {
            this.waitingForInput = false;
          }
          if (this.waitingForInput) {
            this.field_Gb = true;
          }
          if (!param0 &&
            this.hasLivingPlayers((byte) -127)) {
            this.animating = true;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_43_0 = var4;
          stackIn_43_1 = new StringBuilder().append("nf.G(").append(param0).append(',');
          if (cameraTarget == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param2).append(')').toString());
        }
    }

    private final int[] generateSevenPointWrappedProfile(int param0, IsaacRandom random) {
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int[] stackIn_105_0 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_109_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int[][] var6_array = null;
        int var7 = 0;
        int[] var8_ref_int__ = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[][] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[][] var17 = null;
        int[] var18 = null;
        int var3_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          this.field_w = -320;
          var16 = new int[7];
          var13 = var16;
          var4 = var13;
          var5 = 0;
          do {
            if (var5 >= (-1 + var16.length)) {
              var4[-1 + var16.length] = var16[0];
              var5 = ScreenDisplayMode.randomBelow(random, var16.length - 4, (byte) -103) + 2;
              var4[var5] = this.arenaHeight + (-100 - ScreenDisplayMode.randomBelow(random, 250, (byte) -34));
              var4[var5 - 1] = (var4[var5 - 1] + var16[var5]) / 2;
              break;
            }
            var4[var5] = this.arenaHeight / 2 - ScreenDisplayMode.randomBelow(random, this.arenaHeight / 2, (byte) -26);
            var5++;
          } while (var12 == 0);
          var4[1 + var5] = (var4[param0 + var5] + var16[var5]) / 2;
          scanLoop1: while (true) {
            if (var4.length < this.arenaWidth) {
              var6 = new int[var4.length * 2 - 1];
              stackIn_10_0 = var6;
              stackIn_10_1 = 0;
              stackIn_10_2 = var4[0];
              while (true) {
                stackIn_10_0[stackIn_10_1] = stackIn_10_2;
                stackIn_20_0 = 1;
                if (var12 != 0) {
                  break scanLoop1;
                }
                var5 = stackIn_20_0;
                while (var5 < var4.length) {
                  var3_int = this.arenaHeight / var4.length;
                  stackIn_10_0 = var6;
                  stackIn_10_1 = -1 + var5 * 2;
                  stackIn_10_2 = (var4[var5 - 1] + var4[var5]) / 2;
                  if (var3_int != 0) {
                    stackIn_17_3 = ScreenDisplayMode.randomBelow(random, var3_int, (byte) -30);
                  } else {
                    stackIn_17_3 = 0;
                  }
                  stackIn_10_0[stackIn_10_1] = stackIn_10_2 + stackIn_17_3 - var3_int / 2;
                  var6[2 * var5] = var4[var5];
                  var5++;
                }
                var4 = var6;
                continue scanLoop1;
              }
            }
            stackIn_20_0 = 6;
            break;
          }
          var17 = new int[stackIn_20_0][7];
          var14 = var17;
          var6_array = var14;
          var5 = 0;
          while (var17[0].length > var5) {
            var17[0][var5] = this.arenaHeight - ScreenDisplayMode.randomBelow(random, this.arenaHeight - 250, (byte) -103);
            var17[1][var5] = this.arenaHeight - ScreenDisplayMode.randomBelow(random, -200 + this.arenaHeight, (byte) -100);
            var17[2][var5] = this.arenaHeight - ScreenDisplayMode.randomBelow(random, -150 + this.arenaHeight, (byte) -107);
            var17[3][var5] = this.arenaHeight - ScreenDisplayMode.randomBelow(random, this.arenaHeight - 100, (byte) -121);
            var17[4][var5] = this.arenaHeight - ScreenDisplayMode.randomBelow(random, -50 + this.arenaHeight, (byte) -60);
            var17[5][var5] = this.arenaHeight - ScreenDisplayMode.randomBelow(random, this.arenaHeight, (byte) -60);
            var5++;
            if (var12 == 0) {
              continue;
            }
            break;
          }
          var7 = 0;
          while (true) {
            stackIn_25_0 = ~var7;
            regionExit2: {
              if (stackIn_25_0 > -7) {
                scanLoop3: while (true) {
                  stackIn_40_0 = ~var17[var7].length;
                  if (var12 != 0) {
                    break regionExit2;
                  }
                  if (stackIn_40_0 > ~this.arenaWidth) {
                    var18 = new int[1 + 2 * (var17[var7].length - 1)];
                    var15 = var18;
                    var8_ref_int__ = var15;
                    stackIn_29_0 = var8_ref_int__;
                    stackIn_29_1 = 0;
                    stackIn_29_2 = var17[var7][0];
                    while (true) {
                      stackIn_29_0[stackIn_29_1] = stackIn_29_2;
                      stackIn_25_0 = 1;
                      var5 = stackIn_25_0;
                      while (var17[var7].length > var5) {
                        var3_intLifetime1 = 4 * (this.arenaHeight / var17[var7].length);
                        stackIn_29_0 = var8_ref_int__;
                        stackIn_29_1 = -1 + 2 * var5;
                        stackIn_29_2 = -(var3_intLifetime1 / 2) + (var17[var7][var5 - 1] + var17[var7][var5]) / 2;
                        if (var3_intLifetime1 == 0) {
                          stackIn_36_3 = 0;
                        } else {
                          stackIn_36_3 = ScreenDisplayMode.randomBelow(random, var3_intLifetime1, (byte) -78);
                        }
                        stackIn_29_0[stackIn_29_1] = stackIn_29_2 + stackIn_36_3;
                        var8_ref_int__[2 * var5] = var17[var7][var5];
                        var5++;
                      }
                      var6_array[var7] = var18;
                      continue scanLoop3;
                    }
                  }
                  break;
                }
                var7++;
                continue;
              }
              var7 = 0;
              stackIn_40_0 = 0;
            }
            var8 = stackIn_40_0;
            while (true) {
              stackIn_42_0 = ~this.arenaWidth;
              stackIn_42_1 = ~var8;
              if (stackIn_42_0 < stackIn_42_1) {
                var7 = var8;
                var9 = var17[0].length * var8 / this.arenaWidth;
                stackIn_70_0 = 0;
                if (var12 == 0) {
                  var10 = stackIn_70_0;
                  while (this.arenaHeight > var10) {
                    var11 = 0;
                    stackIn_42_0 = ~var10;
                    stackIn_42_1 = ~var4[var9 / 32];
                    if (stackIn_42_0 < stackIn_42_1) {
                      var11++;
                    }
                    if (var17[1][var9] < var17[1][var9]) {
                      if (var17[1][var9] < var10) {
                        var11++;
                      }
                      if (var10 > var17[2][var9]) {
                        var11++;
                      }
                    }
                    if (var17[4][var9] < var17[3][var9]) {
                      if (var10 > var17[3][var9]) {
                        var11++;
                      }
                      if (var10 > var17[4][var9]) {
                        var11++;
                      }
                    }
                    if (var17[5][var9] < var10) {
                      var11++;
                    }
                    if (var11 % 2 == 0 &&
                      var4[var9] < var10) {
                      MatchingFieldValidator.field_y.field_m[var7] = (byte)-5;
                    }
                    var7 = var7 + this.arenaWidth;
                    var10++;
                  }
                  var8++;
                  continue;
                }
              } else {
                var7 = 0;
                stackIn_70_0 = 0;
              }
              var8 = stackIn_70_0;
              while (true) {
                stackIn_72_0 = ~var8;
                stackIn_72_1 = ~this.arenaWidth;
                if (stackIn_72_0 > stackIn_72_1) {
                  var7 = var8;
                  stackIn_105_0 = var17[0];
                  if (var12 == 0) {
                    var9Lifetime1 = stackIn_105_0.length * var8 / this.arenaWidth;
                    var10Lifetime1 = 0;
                    while (var10Lifetime1 < this.arenaHeight) {
                      var11Lifetime1 = 0;
                      stackIn_72_0 = var17[0][var9Lifetime1];
                      stackIn_72_1 = var17[1][var9Lifetime1];
                      if (stackIn_72_0 > stackIn_72_1) {
                        if (var10Lifetime1 > var17[0][var9Lifetime1]) {
                          var11Lifetime1++;
                        }
                        if (var17[1][var9Lifetime1] < var10Lifetime1) {
                          var11Lifetime1++;
                        }
                      }
                      if (var17[3][var9Lifetime1] < var17[2][var9Lifetime1]) {
                        if (var10Lifetime1 > var17[2][var9Lifetime1]) {
                          var11Lifetime1++;
                        }
                        if (var10Lifetime1 > var17[3][var9Lifetime1]) {
                          var11Lifetime1++;
                        }
                      }
                      if (var17[5][var9Lifetime1] < var17[4][var9Lifetime1]) {
                        if (var17[4][var9Lifetime1] < var10Lifetime1) {
                          var11Lifetime1++;
                        }
                        if (var17[5][var9Lifetime1] < var10Lifetime1) {
                          var11Lifetime1++;
                        }
                      }
                      if (1 == var11Lifetime1 % 2 && (var11Lifetime1 > 0 ||
                        var10Lifetime1 > var4[var9Lifetime1])) {
                        MatchingFieldValidator.field_y.field_m[var7] = (byte) 0;
                      }
                      var7 = var7 + this.arenaWidth;
                      var10Lifetime1++;
                    }
                    var8++;
                    continue;
                  }
                } else {
                  stackIn_105_0 = var4;
                }
                return stackIn_105_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_108_0 = var3;
          stackIn_108_1 = new StringBuilder().append("nf.S(").append(param0).append(',');
          if (random == null) {
            stackIn_109_2 = "null";
          } else {
            stackIn_109_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_108_0), ((StringBuilder) (Object) stackIn_108_1).append(stackIn_109_2).append(')').toString());
        }
    }

    final boolean isUnitInRange(boolean obfuscationGuard, BattleUnit unit, int spellType, int y, int x) {
        boolean stackIn_56_0 = false;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        try {
          if (16384 < (-x + unit.x) * (-x + unit.x) + (-y + unit.y) * (-y + unit.y)) {
            return false;
          }
          var6_int = 32;
          if (spellType == 57) {
            var6_int = 64;
          }
          if (spellType == 33) {
            var6_int = 64;
          }
          if (obfuscationGuard) {
            return false;
          }
          if (spellType == 42) {
            var6_int = 64;
          }
          if (spellType == 23) {
            var6_int = 100;
          }
          if (spellType == 59) {
            var6_int = 100;
          }
          if (spellType == 47) {
            var6_int = 100;
          }
          if (65 == spellType) {
            var6_int = 48;
          }
          if (67 == spellType) {
            var6_int = 48;
          }
          if (76 == spellType) {
            var6_int = 80;
          }
          if (77 == spellType) {
            var6_int = 48;
          }
          if (spellType == 6) {
            var6_int = 96;
          }
          if (spellType == 79) {
            var6_int = 96;
          }
          if (spellType == 98) {
            var6_int = 96;
          }
          if (92 == spellType) {
            var6_int = 96;
          }
          if (spellType == 90) {
            var6_int = 64;
          }
          if (107 == spellType) {
            var6_int = 128;
          }
          if (spellType == 118) {
            var6_int = 100;
          }
          if ((var6_int / 2) <= x &&
            x <= (this.arenaWidth - var6_int / 2) &&
            var6_int <= y) {
            if (y > (this.arenaHeight - var6_int / 2)) {
              return false;
            }
            stackIn_56_0 = !(this.circleHitsTerrain(x, var6_int >> 1, y, 124));
            return stackIn_56_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_59_0 = var6;
          stackIn_59_1 = new StringBuilder().append("nf.UB(").append(obfuscationGuard).append(',');
          if (unit == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(spellType).append(',').append(y).append(',').append(x).append(')').toString());
        }
    }

    final boolean isTurnActive(int obfuscationGuard) {
        if (obfuscationGuard != 4) {
          field_Bb = (Calendar) null;
        }
        return this.turnActive;
    }

    final boolean isRecording(int obfuscationGuard) {
        boolean discarded$0 = false;
        if (obfuscationGuard != -28046) {
          discarded$0 = this.unitSpriteHitsTerrain((BattleUnit) null, (Sprite) null, 91, 30, -97);
        }
        return this.field_l;
    }

    final boolean isArenaSpell(byte obfuscationGuard, int spellType) {
        if (spellType == 158) {
          return true;
        }
        if (spellType == 157) {
          return true;
        }
        if (spellType == 159) {
          return true;
        }
        if (obfuscationGuard != 66) {
          this.canLandAt((BattleUnit) null, 31, 63, -105);
        }
        if (3 == spellType) {
          return true;
        }
        if (spellType == 4) {
          return true;
        }
        if (spellType == 5) {
          return true;
        }
        if (spellType == 2) {
          return true;
        }
        if (spellType == 55) {
          return true;
        }
        if (spellType == 54) {
          return true;
        }
        if (spellType == 31) {
          return true;
        }
        if (spellType == 81) {
          return true;
        }
        if (spellType == 60) {
          return true;
        }
        if (spellType == 91) {
          return true;
        }
        if (72 == spellType) {
          return true;
        }
        if (38 == spellType) {
          return true;
        }
        if (spellType == 16) {
          return true;
        }
        if (spellType == 45) {
          return true;
        }
        if (spellType == 152) {
          return true;
        }
        if (spellType == 87) {
          return true;
        }
        if (spellType == 78) {
          return true;
        }
        if (spellType == 30) {
          return true;
        }
        if (FixedViewResizeListener.field_e[spellType] == 4) {
          return true;
        }
        if (spellType == 114) {
          return true;
        }
        if (spellType == 108) {
          return true;
        }
        if (109 == spellType) {
          return true;
        }
        if (88 == spellType) {
          return true;
        }
        if (spellType == 112) {
          return true;
        }
        return false;
    }

    final boolean spriteHitsTerrain(int obfuscationGuard, Sprite sprite, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= 22) {
            this.field_ob = (int[]) null;
          }
          stackIn_3_0 = DropdownList.spriteHitsTerrain(param2, param4, false, sprite, this.terrainMask, this, param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("nf.DA(").append(obfuscationGuard).append(',');
          if (sprite == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void setCurrentPlayer(int obfuscationGuard, int player) {
        this.previousPlayer = -1 + player;
        this.currentPlayer = player;
        if (this.previousPlayer < 0) {
          this.previousPlayer = this.previousPlayer + this.playerCount;
        }
        if (obfuscationGuard != -4207) {
          this.field_hb = -48;
        }
    }

    final void carveTerrainAndSprite(int y, int obfuscationGuard, int x, Sprite sprite) {
        try {
          if (obfuscationGuard > -3) {
            this.isTurnFinished((byte) 69);
          }
          this.carveTerrainWithSprite(x, (byte) -79, y, this.terrainMask, sprite);
          this.stampSpriteMask(false, x, this.terrainSprite, true, y, sprite);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "nf.LC(" + y + ',' + obfuscationGuard + ',' + x + ',' + (sprite != null ? "{...}" : "null") + ')');
        }
    }

    final void clearUnits(byte obfuscationGuard) {
        BattleUnit var2 = null;
        int var3 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        this.unitIdCounter = 0;
        var2 = (BattleUnit) (this.units.first(obfuscationGuard ^ -12561));
        while (var2 != null) {
          var2.unlink(true);
          var2.unlinkSecondary((byte) 88);
          var2 = (BattleUnit) (this.units.next(0));
          if (var3 != 0) {
            return;
          }
        }
        if (obfuscationGuard != -96) {
          return;
        }
        this.projectiles.clear(obfuscationGuard + 91);
        this.field_r.clear(-126);
        return;
    }

    final void generateTerrain(int obfuscationGuard, boolean param1) {
        int stackIn_78_0 = 0;
        int var4_int = 0;
        Object var4 = null;
        int[] var4_array = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        IsaacRandom var16 = null;
        int var4_intLifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        if (obfuscationGuard != 649860712) {
          this.terrainMask = (IndexedSprite) null;
        }
        var16 = new IsaacRandom(new int[]{this.randomSeed, -1});
        this.arenaTheme = this.field_xb;
        if (this.arenaTheme == 9) {
          this.arenaTheme = SceneTextInput.floorMod(this.randomSeed, true, 8);
        }
        if (MainMenuDialog.field_Cb != -1) {
          this.arenaTheme = MainMenuDialog.field_Cb;
        }
        boolean decompiledFrameRemainder2 = true;
        boolean decompiledFrameCompleted1 = true;
        boolean decompiledFrameCompleted0 = true;
        boolean decompiledFrameRemainder1 = true;
        if (param1) {
          this.field_Hb = this.arenaHeight / 2;
          this.field_hb = this.arenaWidth / 2;
          if (null == MatchingFieldValidator.field_y ||
            this.arenaWidth != MatchingFieldValidator.field_y.field_g ||
            MatchingFieldValidator.field_y.field_k != this.arenaHeight) {
            MatchingFieldValidator.field_y = new IndexedSprite(this.arenaWidth, this.arenaHeight, DecodedSpriteHelpers.field_c);
            decompiledFrameRemainder2 = (null != SocketConnector.field_j);
            if (decompiledFrameRemainder2) {
              MatchingFieldValidator.field_y.field_l = SocketConnector.field_j[8 * this.arenaTheme].field_l;
              decompiledFrameRemainder2 = (var15 != 0);
            }
          }
          if (decompiledFrameRemainder2) {
            var4_int = 0;
            while (!(MatchingFieldValidator.field_y.field_m.length <= var4_int)) {
              MatchingFieldValidator.field_y.field_m[var4_int] = (byte) 0;
              var4_int++;
              if (var15 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
            }
            decompiledFrameRemainder1 = !(decompiledFrameCompleted1);
          }
        }
        if ((decompiledFrameRemainder2) &&
          (decompiledFrameRemainder1) &&
          (decompiledFrameCompleted1)) {
          if (this.arenaTheme == 8) {
            this.arenaWidth = 3840;
            this.arenaHeight = 480;
            if (var15 != 0) {
              this.arenaWidth = 1920;
              this.arenaHeight = 960;
            }
          } else {
            this.arenaWidth = 1920;
            this.arenaHeight = 960;
          }
          this.field_Hb = this.arenaHeight / 2;
          this.field_hb = this.arenaWidth / 2;
          if (null == MatchingFieldValidator.field_y ||
            this.arenaWidth != MatchingFieldValidator.field_y.field_g ||
            MatchingFieldValidator.field_y.field_k != this.arenaHeight) {
            MatchingFieldValidator.field_y = new IndexedSprite(this.arenaWidth, this.arenaHeight, DecodedSpriteHelpers.field_c);
            decompiledFrameRemainder2 = (null != SocketConnector.field_j);
            if (decompiledFrameRemainder2) {
              MatchingFieldValidator.field_y.field_l = SocketConnector.field_j[8 * this.arenaTheme].field_l;
              decompiledFrameRemainder2 = (var15 != 0);
            }
          }
          if (decompiledFrameRemainder2) {
            var4_intLifetime1 = 0;
            while (!(MatchingFieldValidator.field_y.field_m.length <= var4_intLifetime1)) {
              MatchingFieldValidator.field_y.field_m[var4_intLifetime1] = (byte) 0;
              var4_intLifetime1++;
              if (var15 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
        }
        if ((decompiledFrameRemainder2) &&
          (decompiledFrameCompleted1) &&
          (decompiledFrameCompleted0)) {
          decompiledFrameRemainder2 = (SocketConnector.field_j != null);
        }
        if (decompiledFrameRemainder2) {
          MatchingFieldValidator.field_y.field_l = SocketConnector.field_j[this.arenaTheme * 8].field_l;
        }
        boolean decompiledFrameRemainder3 = true;
        boolean decompiledFrameRemainder0 = true;
        var4 = null;
        this.field_w = 320;
        var5 = this.arenaTheme;
        if (var5 != 0) {
          if (var5 != 1 ||
            var15 != 0) {
            if (var5 == 2) {
              var4_array = this.generateSevenPointProfile((byte) 34, var16);
              decompiledFrameRemainder3 = false;
            }
            else {
              if (var5 == 3) {
                var4_array = this.generateTenPointCentredProfile(var16, -12260);
                decompiledFrameRemainder3 = false;
              }
              else {
                if (var5 == 4 &&
                  var15 == 0) {
                  var4_array = this.generateSevenPointWrappedProfile(obfuscationGuard ^ 649860713, var16);
                  decompiledFrameRemainder3 = false;
                }
                else {
                  if (var5 == 5) {
                    var4_array = this.generateSevenPointLowProfile(var16, -30390);
                    decompiledFrameRemainder3 = false;
                  }
                  else {
                    if (var5 == 6 &&
                      var15 == 0) {
                      var4_array = this.generateSixPointProfile(var16, 32);
                      decompiledFrameRemainder3 = false;
                    }
                    else {
                      if (var5 == 7) {
                        var4_array = this.generateTwentyPointLowProfile(-22070, var16);
                        decompiledFrameRemainder3 = false;
                      }
                      else {
                        if ((var5 == 8) &&
                          (decompiledFrameRemainder0 = (var15 == 0))) {
                          var4_array = this.generateThirtyPointProfile(0, var16);
                          decompiledFrameRemainder3 = false;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          if ((decompiledFrameRemainder3) &&
            (decompiledFrameRemainder0)) {
            var4_array = this.generateTwentyPointProfile((byte) -70, var16);
            decompiledFrameRemainder3 = false;
          }
        }
        if (decompiledFrameRemainder3) {
          var4_array = this.generateTenPointProfile(obfuscationGuard ^ 649860704, var16);
        }
        if (var4_array != null) {
          System.gc();
          this.terrainSprite = new IndexedSprite(this.arenaWidth, this.arenaHeight, DecodedSpriteHelpers.field_c);
          if (DropdownList.field_I != null) {
            this.terrainSprite.field_l = DropdownList.field_I[this.arenaTheme].field_l;
          }
          this.stampShapeWithMask(0, 117, MatchingFieldValidator.field_y, 0, this.terrainSprite);
          this.placeTerrainDecorations(var4_array, var16, (byte) -121);
          this.stampShapeWithMask(0, 113, this.terrainSprite, 0, MatchingFieldValidator.field_y);
          this.drawThemeBackground((byte) 5);
        }
        this.terrainMask = new IndexedSprite(this.field_hb, this.field_Hb, DecodedSpriteHelpers.field_c);
        this.terrainMask.field_l = this.terrainSprite.field_l;
        this.copyMaskRegion(0, this.terrainMask, this.terrainSprite, 0, -126);
        var5Lifetime1 = 0;
        var6 = 0;
        while (true) {
          if (this.playerCount <= var6) {
            stackIn_78_0 = var5Lifetime1;
            break;
          }
          stackIn_78_0 = ~this.playerSpellbook[var6];
          if (var15 == 0) {
            if (stackIn_78_0 == -10) {
              var5Lifetime1 = 1;
            }
            var6++;
            continue;
          }
          break;
        }
        if (stackIn_78_0 == 0) {
          this.field_pb = null;
        }
        if (stackIn_78_0 != 0 ||
          var15 != 0) {
          var6Lifetime1 = this.terrainSprite.field_l.length;
          this.field_pb = new int[var6Lifetime1];
          var7 = 0;
          while (var6Lifetime1 > var7) {
            var8 = this.terrainSprite.field_l[var7];
            var9 = var8 >> 16 & 255;
            var10 = (65280 & var8) >> 8;
            var11 = var8 & 255;
            var12 = (var10 + var9) / 2;
            var13 = (var11 + var9) / 2;
            var14 = (var10 + var11) / 2;
            this.field_pb[var7] = (var12 << 16) + (var13 << 8) + var14;
            var7++;
            if (var15 != 0) {
              return;
            }
          }
        }
        System.gc();
        return;
    }

    final void setDisplayFlags(boolean param0, int obfuscationGuard, boolean param2) {
        if (obfuscationGuard != -1) {
          this.updateCurrentTurn((byte) -114);
        }
        this.field_M = param0 ? true : false;
        this.field_eb = param2 ? true : false;
    }

    private final int[] generateSevenPointProfile(byte obfuscationGuard, IsaacRandom random) {
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_20_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_41_0 = 0;
        int[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int stackIn_51_3;
        int stackIn_52_4 = 0;
        int stackIn_56_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int[] stackIn_116_0 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        String stackIn_120_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int[][] var6_array = null;
        int var7 = 0;
        int[] var8_ref_int__ = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[][] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[][] var18 = null;
        int[] var19 = null;
        int var3_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var7Lifetime1;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var17 = new int[7];
          var14 = var17;
          var4 = var14;
          this.field_w = -320;
          var5 = 0;
          do {
            if (var5 >= var17.length - 1) {
              var4[-1 + var17.length] = var17[0];
              var5 = ScreenDisplayMode.randomBelow(random, -4 + var17.length, (byte) -80) + 2;
              var4[var5] = -100 + this.arenaHeight - ScreenDisplayMode.randomBelow(random, 250, (byte) -82);
              var4[var5 - 1] = (var17[var5] + var4[-1 + var5]) / 2;
              break;
            }
            var4[var5] = this.arenaHeight / 2 + 150 - ScreenDisplayMode.randomBelow(random, -100 + this.arenaHeight / 2, (byte) -24);
            var5++;
          } while (var12 == 0);
          var4[var5 + 1] = (var17[var5] + var4[1 + var5]) / 2;
          scanLoop1: while (true) {
            if (var4.length < this.arenaWidth) {
              var13 = new int[2 * (var4.length - 1) + 1];
              var6 = var13;
              stackIn_10_0 = var13;
              stackIn_10_1 = 0;
              stackIn_10_2 = var4[0];
              while (true) {
                stackIn_10_0[stackIn_10_1] = stackIn_10_2;
                stackIn_20_0 = 1;
                if (var12 != 0) {
                  break scanLoop1;
                }
                var5 = stackIn_20_0;
                while (var4.length > var5) {
                  var3_int = this.arenaHeight / var4.length;
                  stackIn_10_0 = var6;
                  stackIn_10_1 = -1 + 2 * var5;
                  stackIn_10_2 = (var4[-1 + var5] + var4[var5]) / 2;
                  if (0 == var3_int) {
                    stackIn_17_3 = 0;
                  } else {
                    stackIn_17_3 = ScreenDisplayMode.randomBelow(random, var3_int, (byte) -81);
                  }
                  stackIn_10_0[stackIn_10_1] = stackIn_10_2 - (-stackIn_17_3 + var3_int / 2);
                  var13[2 * var5] = var4[var5];
                  var5++;
                }
                var4 = var6;
                continue scanLoop1;
              }
            }
            stackIn_20_0 = 0;
            break;
          }
          var5 = stackIn_20_0;
          scanLoop2: while (true) {
            if (var4.length > var5) {
              var6_int = this.arenaWidth * var5 / var4.length + this.arenaWidth * var4[var5];
              stackIn_31_0 = 0;
              if (var12 != 0) {
                break scanLoop2;
              }
              var7 = stackIn_31_0;
              while (var7 < this.arenaHeight - var4[var5]) {
                MatchingFieldValidator.field_y.field_m[var6_int] = (byte)-5;
                var6_int = var6_int + this.arenaWidth;
                var7++;
              }
              var5++;
              continue scanLoop2;
            }
            stackIn_31_0 = 6;
            break;
          }
          var18 = new int[stackIn_31_0][7];
          var15 = var18;
          var6_array = var15;
          if (obfuscationGuard < 18) {
            this.carveTerrainWithSprite(-85, (byte) 104, 4, (IndexedSprite) null, (Sprite) null);
          }
          var5 = 0;
          do {
            if ((-1 + var18[0].length) <= var5) {
              var18[0][-1 + var18[0].length] = var18[0][0];
              var18[1][-1 + var18[0].length] = var18[1][0];
              var18[2][var18[0].length - 1] = var18[2][0];
              var18[3][var18[0].length - 1] = var18[3][0];
              var18[4][var18[0].length - 1] = var18[4][0];
              var18[5][var18[0].length - 1] = var18[5][0];
              break;
            }
            var18[0][var5] = this.arenaHeight - 250 - ScreenDisplayMode.randomBelow(random, this.arenaHeight - 300, (byte) -73);
            var18[1][var5] = -200 + (this.arenaHeight - ScreenDisplayMode.randomBelow(random, this.arenaHeight - 250, (byte) -30));
            var18[2][var5] = -150 + (this.arenaHeight - ScreenDisplayMode.randomBelow(random, -200 + this.arenaHeight, (byte) -39));
            var18[3][var5] = this.arenaHeight - 100 - ScreenDisplayMode.randomBelow(random, -150 + this.arenaHeight, (byte) -122);
            var18[4][var5] = this.arenaHeight - 50 - ScreenDisplayMode.randomBelow(random, -100 + this.arenaHeight, (byte) -54);
            var18[5][var5] = this.arenaHeight - ScreenDisplayMode.randomBelow(random, -50 + this.arenaHeight, (byte) -117);
            var5++;
          } while (var12 == 0);
          var7Lifetime1 = 0;
          while (true) {
            stackIn_41_0 = -7;
            regionExit3: {
              if (stackIn_41_0 < ~var7Lifetime1) {
                scanLoop4: while (true) {
                  stackIn_56_0 = ~var18[var7Lifetime1].length;
                  if (var12 != 0) {
                    break regionExit3;
                  }
                  if (stackIn_56_0 > ~this.arenaWidth) {
                    var19 = new int[-2 + (var18[var7Lifetime1].length * 2 + 1)];
                    var16 = var19;
                    var8_ref_int__ = var16;
                    stackIn_45_0 = var8_ref_int__;
                    stackIn_45_1 = 0;
                    stackIn_45_2 = var18[var7Lifetime1][0];
                    while (true) {
                      stackIn_45_0[stackIn_45_1] = stackIn_45_2;
                      stackIn_41_0 = 1;
                      var5 = stackIn_41_0;
                      while (var5 < var18[var7Lifetime1].length) {
                        var3_intLifetime1 = this.arenaHeight / var18[var7Lifetime1].length;
                        stackIn_45_0 = var8_ref_int__;
                        stackIn_45_1 = var5 * 2 - 1;
                        stackIn_45_2 = -(var3_intLifetime1 / 2);
                        stackIn_51_3 = (var18[var7Lifetime1][-1 + var5] + var18[var7Lifetime1][var5]) / 2;
                        if (var3_intLifetime1 != 0) {
                          stackIn_52_4 = ScreenDisplayMode.randomBelow(random, var3_intLifetime1, (byte) -83);
                        } else {
                          stackIn_52_4 = 0;
                        }
                        stackIn_45_0[stackIn_45_1] = stackIn_45_2 + (stackIn_51_3 + stackIn_52_4);
                        var8_ref_int__[2 * var5] = var18[var7Lifetime1][var5];
                        var5++;
                      }
                      var6_array[var7Lifetime1] = var19;
                      continue scanLoop4;
                    }
                  }
                  break;
                }
                var7Lifetime1++;
                continue;
              }
              var7Lifetime1 = 0;
              stackIn_56_0 = 0;
            }
            var8 = stackIn_56_0;
            while (true) {
              stackIn_58_0 = var8;
              stackIn_58_1 = this.arenaWidth;
              if (stackIn_58_0 < stackIn_58_1) {
                var9 = var8 * var18[0].length / this.arenaWidth;
                var7Lifetime1 = var8;
                stackIn_84_0 = 0;
                if (var12 == 0) {
                  var10 = stackIn_84_0;
                  while (var10 < this.arenaHeight) {
                    var11 = 0;
                    stackIn_58_0 = ~var10;
                    stackIn_58_1 = ~var18[0][var9];
                    if (stackIn_58_0 < stackIn_58_1) {
                      var11++;
                    }
                    if (var10 > var18[1][var9]) {
                      var11++;
                    }
                    if (var18[2][var9] < var10) {
                      var11++;
                    }
                    if (var10 > var18[3][var9]) {
                      var11++;
                    }
                    if (var18[4][var9] < var10) {
                      var11++;
                    }
                    if (var10 > var18[5][var9]) {
                      var11++;
                    }
                    if (0 == var11 % 2 &&
                      var11 > 0) {
                      MatchingFieldValidator.field_y.field_m[var7Lifetime1] = (byte)-5;
                    }
                    var7Lifetime1 = var7Lifetime1 + this.arenaWidth;
                    var10++;
                  }
                  var8++;
                  continue;
                }
              } else {
                var7Lifetime1 = 0;
                stackIn_84_0 = 0;
              }
              var8 = stackIn_84_0;
              while (true) {
                stackIn_86_0 = this.arenaWidth;
                stackIn_86_1 = var8;
                if (stackIn_86_0 > stackIn_86_1) {
                  var7Lifetime1 = var8;
                  stackIn_116_0 = var18[0];
                  if (var12 == 0) {
                    var9Lifetime1 = stackIn_116_0.length * var8 / this.arenaWidth;
                    var10Lifetime1 = 0;
                    while (var10Lifetime1 < this.arenaHeight) {
                      var11Lifetime1 = 0;
                      stackIn_86_0 = var18[0][var9Lifetime1];
                      stackIn_86_1 = var18[1][var9Lifetime1];
                      if (stackIn_86_0 > stackIn_86_1) {
                        if (var10Lifetime1 > var18[0][var9Lifetime1]) {
                          var11Lifetime1++;
                        }
                        if (var10Lifetime1 > var18[1][var9Lifetime1]) {
                          var11Lifetime1++;
                        }
                      }
                      if (var18[3][var9Lifetime1] < var18[2][var9Lifetime1]) {
                        if (var10Lifetime1 > var18[2][var9Lifetime1]) {
                          var11Lifetime1++;
                        }
                        if (var18[3][var9Lifetime1] < var10Lifetime1) {
                          var11Lifetime1++;
                        }
                      }
                      if (var18[5][var9Lifetime1] < var18[4][var9Lifetime1]) {
                        if (var10Lifetime1 > var18[4][var9Lifetime1]) {
                          var11Lifetime1++;
                        }
                        if (var18[5][var9Lifetime1] < var10Lifetime1) {
                          var11Lifetime1++;
                        }
                      }
                      if (var11Lifetime1 % 2 == 1) {
                        MatchingFieldValidator.field_y.field_m[var7Lifetime1] = (byte) 0;
                      }
                      var7Lifetime1 = var7Lifetime1 + this.arenaWidth;
                      var10Lifetime1++;
                    }
                    var8++;
                    continue;
                  }
                } else {
                  stackIn_116_0 = var4;
                }
                return stackIn_116_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_119_0 = var3;
          stackIn_119_1 = new StringBuilder().append("nf.MB(").append(obfuscationGuard).append(',');
          if (random == null) {
            stackIn_120_2 = "null";
          } else {
            stackIn_120_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_119_0), ((StringBuilder) (Object) stackIn_119_1).append(stackIn_120_2).append(')').toString());
        }
    }

    final boolean isWaitingForInput(int obfuscationGuard) {
        if (obfuscationGuard != 39) {
          return true;
        }
        return this.waitingForInput;
    }

    final int getArenaTheme(int obfuscationGuard) {
        if (obfuscationGuard != -31497) {
          return -27;
        }
        return this.arenaTheme;
    }

    final void setPlayerCount(int playerCount, byte obfuscationGuard) {
        int var3 = 12 % ((-31 - obfuscationGuard) / 48);
        this.playerCount = playerCount;
    }

    final boolean isAnimating(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          this.field_T = (int[]) null;
        }
        return this.animating;
    }

    final void clearTurnActive(int obfuscationGuard) {
        this.turnActive = false;
        if (obfuscationGuard != -256) {
          this.field_o = (int[]) null;
        }
    }

    final void addUnit(byte obfuscationGuard, BattleUnit unit) {
        try {
          this.units.addLast(unit, -1);
          if (obfuscationGuard > -114) {
            this.field_f = false;
          }
          this.unitsById.put(unit, (long)unit.unitId, (byte) 110);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "nf.KD(" + obfuscationGuard + ',' + (unit != null ? "{...}" : "null") + ')');
        }
    }

    private final void carveTerrainWithSprite(int x, byte obfuscationGuard, int y, IndexedSprite mask, Sprite sprite) {
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        byte[] var27 = null;
        byte[] var28 = null;
        int[] var29 = null;
        byte[] var30 = null;
        int[] var31 = null;
        var26 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var30 = new byte[sprite.field_A.length];
          var28 = var30;
          var27 = var28;
          var6 = var27;
          y = y >> 1;
          var7 = 0;
          do {
            if (!(var7 < sprite.field_A.length)) {
              x = x >> 1;
              var7 = sprite.field_q >> 1;
              break;
            }
            var27[var7] = (byte)MusicPatchPcmStream.field_p[this.arenaTheme].lookupColour(sprite.field_A[var7], 510);
            var7++;
          } while (var26 == 0);
          var8 = sprite.field_y >> 1;
          if (obfuscationGuard > -55) {
            this.isValidTarget((BattleUnit) null, 126, -2, -112, 24);
          }
          y = y + sprite.field_o / 2;
          x = x + sprite.field_x / 2;
          var9 = 0;
          var10 = 0;
          var11 = this.field_hb;
          var12 = this.field_Hb;
          if (x < var9) {
            stackIn_12_0 = var9 - x << 1;
          } else {
            stackIn_12_0 = 0;
          }
          var13 = stackIn_12_0;
          if (var11 >= (x + var7)) {
            stackIn_15_0 = -2 + sprite.field_q;
          } else {
            stackIn_15_0 = -2 + (var11 - x << 1);
          }
          var14 = stackIn_15_0;
          if (y < var10) {
            stackIn_18_0 = var10 - y << 1;
          } else {
            stackIn_18_0 = 0;
          }
          var15 = stackIn_18_0;
          if (var12 >= y + var8) {
            stackIn_21_0 = sprite.field_y - 2;
          } else {
            stackIn_21_0 = (-y + var12 << 1) - 2;
          }
          var16 = stackIn_21_0;
          var31 = new int[4];
          var29 = var31;
          var17 = var29;
          var18 = var15;
          scanLoop1: while (true) {
            stackIn_23_0 = var18;
            if (stackIn_23_0 <= var16) {
              if (var26 != 0) {
                return;
              }
              var19 = var13;
              scanLoop2: while (true) {
                stackIn_27_0 = var19;
                stackIn_27_1 = var14;
                if (stackIn_27_0 <= stackIn_27_1) {
                  var20 = var19 + sprite.field_q * var18;
                  var21 = (var19 >> 1) + x + (y + (var18 >> 1)) * this.field_hb;
                  var17[0] = mask.field_l[NameValidator.bitAnd(255, (int) var30[var20])];
                  var17[1] = mask.field_l[NameValidator.bitAnd((int) var27[1 + var20], 255)];
                  var17[2] = mask.field_l[NameValidator.bitAnd((int) var27[var20 + sprite.field_q], 255)];
                  var17[3] = mask.field_l[NameValidator.bitAnd(255, (int) var27[1 + var20])];
                  var22 = 0;
                  var23 = 0;
                  var24 = 0;
                  stackIn_23_0 = 0;
                  var25 = stackIn_23_0;
                  while (var25 < 4) {
                    stackIn_27_0 = ~var31[var25];
                    stackIn_27_1 = -1;
                    if (stackIn_27_0 == stackIn_27_1) {
                      var17[var25] = mask.field_l[NameValidator.bitAnd(255, (int) mask.field_m[var21])];
                    }
                    var22 = var22 + (var31[var25] >> 16);
                    var24 = var24 + (255 & var31[var25]);
                    var23 = var23 + (var31[var25] >> 8 & 255);
                    var25++;
                  }
                  mask.field_m[var21] = (byte)MusicPatchPcmStream.field_p[this.arenaTheme].lookupColour(BitAndSpriteHelpers.bitOr(BitAndSpriteHelpers.bitOr(var23 >> 2 << 8, var22 >> 2 << 16), var24 >> 2), 510);
                  var19 += 2;
                  continue scanLoop2;
                }
                break;
              }
              var18 += 2;
              continue scanLoop1;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_40_0 = var6_ref;
          stackIn_40_1 = new StringBuilder().append("nf.LA(").append(x).append(',').append(obfuscationGuard).append(',').append(y).append(',');
          if (mask == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',');
          if (sprite == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    final boolean canOwnerCast(int spellType, boolean obfuscationGuard, int player) {
        BattleUnit var4 = this.getUnitByOwner(player, obfuscationGuard);
        if (var4 == null) {
          return false;
        }
        return this.canCastSpell(spellType, var4, obfuscationGuard);
    }

    final int getRound(byte obfuscationGuard) {
        if (obfuscationGuard != -75) {
          this.hasStats(-46);
        }
        return this.round;
    }

    final void setAnimating(boolean animating) {
        this.animating = animating ? true : false;
    }

    final int getSpellCharges(int spellType, int player, int obfuscationGuard) {
        int var4;
        int var5;
        int stackIn_16_0 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (spellType == 153) {
          return this.getSpellCharges(39, player, -770226943);
        }
        if (spellType < 0) {
          return 0;
        }
        if (player < 0) {
          return 0;
        }
        var4 = 0;
        if (obfuscationGuard != -770226943) {
          return -40;
        }
        while (var4 < 16) {
          stackIn_16_0 = spellType;
          if (var5 != 0) {
            return stackIn_16_0;
          }
          if (stackIn_16_0 == this.spellSlots[player][var4]) {
            return this.spellCharges[player][var4];
          }
          var4++;
        }
        return 0;
    }

    private final int[] generateThirtyPointProfile(int param0, IsaacRandom random) {
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_16_3;
        int stackIn_17_4 = 0;
        int stackIn_20_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int[] stackIn_62_0 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int[] var6_ref_int__ = null;
        int var6 = 0;
        int var7_int = 0;
        IndexedSprite var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var20 = null;
        int[] var25 = null;
        int[] var26 = null;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          this.field_w = -320;
          var20 = new int[30];
          var17 = var20;
          var16 = var17;
          var4 = var16;
          var5 = 0;
          do {
            if ((-1 + var20.length) <= var5) {
              var20[0] = 0;
              break;
            }
            var16[var5] = 10 * this.arenaHeight / 8 - ScreenDisplayMode.randomBelow(random, this.arenaHeight, (byte) -65);
            var5++;
          } while (var15 == 0);
          var16[var20.length - 1] = var20[0];
          scanLoop1: while (true) {
            if (var4.length < (this.arenaWidth / 32)) {
              var6_ref_int__ = new int[1 + (2 * var4.length - 2)];
              stackIn_10_0 = var6_ref_int__;
              stackIn_10_1 = 0;
              stackIn_10_2 = var4[0];
              while (true) {
                stackIn_10_0[stackIn_10_1] = stackIn_10_2;
                stackIn_20_0 = 1;
                if (var15 != 0) {
                  break scanLoop1;
                }
                var5 = stackIn_20_0;
                while (var4.length > var5) {
                  var3_int = this.arenaHeight / var4.length;
                  stackIn_10_0 = var6_ref_int__;
                  stackIn_10_1 = 2 * var5 - 1;
                  stackIn_10_2 = -(var3_int / 2);
                  stackIn_16_3 = (var4[-1 + var5] + var4[var5]) / 2;
                  if (var3_int != 0) {
                    stackIn_17_4 = random.nextIntBelow(var3_int, (byte) -116);
                  } else {
                    stackIn_17_4 = 0;
                  }
                  stackIn_10_0[stackIn_10_1] = stackIn_10_2 + (stackIn_16_3 + stackIn_17_4);
                  var6_ref_int__[var5 * 2] = var4[var5];
                  var5++;
                }
                var4 = var6_ref_int__;
                continue scanLoop1;
              }
            }
            this.rasterizeTerrainProfile(var4, (byte) -113);
            var5 = 0;
            stackIn_20_0 = 0;
            break;
          }
          var6 = stackIn_20_0;
          scanLoop2: while (true) {
            var5++;
            var7_int = ScreenDisplayMode.randomBelow(random, this.arenaWidth / 2, (byte) -94) + this.arenaWidth / 4;
            var8 = 2;
            scanLoop3: while (true) {
              var9 = this.arenaWidth * var8 + var7_int;
              while (this.arenaHeight > var8) {
                if (MatchingFieldValidator.field_y.field_m[var9] == 0) {
                  var7_int = var7_int + (-1 + var5 % 3);
                  var8++;
                  var9 = var9 + this.arenaWidth;
                  var9 = var9 + (var5 % 3 - 1);
                  if (0 > var7_int) {
                    var9 = var9 + this.arenaWidth;
                    var7_int = var7_int + this.arenaWidth;
                  }
                  if (var7_int < this.arenaWidth) {
                    continue;
                  }
                  var7_int = var7_int - this.arenaWidth;
                  var9 = var9 - this.arenaWidth;
                  if (var15 != 0) {
                    continue scanLoop3;
                  }
                  continue;
                }
                break;
              }
              break;
            }
            var10 = (this.arenaHeight - var8) * 64 / this.arenaHeight + ScreenDisplayMode.randomBelow(random, 16, (byte) -37);
            do {
              if (this.arenaHeight > var8 &&
                (32 + var10) < var8 &&
                var10 < var7_int &&
                var7_int < this.arenaWidth - var10) {
                MusicPatchNode.carveTerrain(MatchingFieldValidator.field_y, (byte) -47, var10, (byte) -5, var8, var7_int, this);
                var6 = var8;
              }
              if (var8 < 32 + var10) {
                var6 = 0;
              }
              if (var6 > 128) {
                continue scanLoop2;
              }
              System.gc();
              this.terrainSprite = new IndexedSprite(this.arenaWidth, this.arenaHeight, DecodedSpriteHelpers.field_c);
            } while (var15 != 0);
            break;
          }
          if (DropdownList.field_I != null) {
            this.terrainSprite.field_l = DropdownList.field_I[this.arenaTheme].field_l;
          }
          this.stampShapeWithMask(0, 120, MatchingFieldValidator.field_y, 0, this.terrainSprite);
          var25 = new int[1000];
          var26 = new int[1000];
          var10 = param0;
          var5 = 0;
          scanLoop4: while (true) {
            stackIn_47_0 = -11;
            stackIn_47_1 = ~var5;
            if (stackIn_47_0 < stackIn_47_1) {
              var7 = SocketConnector.field_j[4 + (ScreenDisplayMode.randomBelow(random, 4, (byte) -124) + this.arenaTheme * 8)];
              var11 = ScreenDisplayMode.randomBelow(random, this.arenaWidth - 256, (byte) -69);
              var12 = ScreenDisplayMode.randomBelow(random, -256 + this.arenaHeight, (byte) -86);
              var13 = 1;
              var14 = 0;
              while (var14 < var10) {
                stackIn_47_0 = -193;
                stackIn_47_1 = ~Math.abs(var25[var14] - var11);
                if (stackIn_47_0 < stackIn_47_1 &&
                  192 > Math.abs(var26[var14] - var12)) {
                  var13 = 0;
                }
                var14++;
              }
              if (var13 != 0) {
                var25[var10] = var11;
                var26[var10] = var12;
                var10++;
                this.stampSpriteMask(false, var11, this.terrainSprite, false, var12, var7.toRgbSprite());
              }
              var5++;
              continue scanLoop4;
            }
            break;
          }
          this.stampShapeWithMask(0, 114, this.terrainSprite, 0, MatchingFieldValidator.field_y);
          stackIn_62_0 = var4;
          return stackIn_62_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_65_0 = var3;
          stackIn_65_1 = new StringBuilder().append("nf.T(").append(param0).append(',');
          if (random == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(')').toString());
        }
    }

    final void regenerateTerrain(int obfuscationGuard) {
        if (obfuscationGuard <= 40) {
          this.refreshTerrainArea(-94, 10, (byte) 54, 18);
        }
        this.generateTerrain(649860712, false);
    }

    private final void copyMaskRegion(int y, IndexedSprite mask, IndexedSprite shape, int x, int obfuscationGuard) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int[] var26 = null;
        int[] var27 = null;
        var25 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          y = y >> 1;
          x = x >> 1;
          var6_int = shape.field_h >> 1;
          x = x + shape.field_j / 2;
          var7 = shape.field_c >> 1;
          y = y + shape.field_f / 2;
          var8 = 0;
          var9 = 0;
          var10 = this.field_hb;
          var11 = this.field_Hb;
          if (obfuscationGuard > -123) {
            return;
          }
          if (x < var8) {
            stackIn_6_0 = -x + var8 << 1;
          } else {
            stackIn_6_0 = 0;
          }
          var12 = stackIn_6_0;
          if (var10 < (x + var6_int)) {
            stackIn_9_0 = -2 + (var10 - x << 1);
          } else {
            stackIn_9_0 = -2 + shape.field_h;
          }
          var13 = stackIn_9_0;
          if (var9 <= y) {
            stackIn_12_0 = 0;
          } else {
            stackIn_12_0 = -y + var9 << 1;
          }
          var14 = stackIn_12_0;
          if ((var7 + y) > var11) {
            stackIn_15_0 = (-y + var11 << 1) - 2;
          } else {
            stackIn_15_0 = shape.field_c - 2;
          }
          var15 = stackIn_15_0;
          var27 = new int[4];
          var26 = var27;
          var16 = var26;
          var17 = var14;
          scanLoop1: while (true) {
            stackIn_17_0 = var15;
            if (stackIn_17_0 >= var17) {
              if (var25 != 0) {
                return;
              }
              var18 = var12;
              scanLoop2: while (true) {
                stackIn_21_0 = ~var13;
                stackIn_21_1 = ~var18;
                if (stackIn_21_0 <= stackIn_21_1) {
                  var19 = var18 + shape.field_h * var17;
                  var16[0] = shape.field_l[NameValidator.bitAnd((int) shape.field_m[var19], 255)];
                  var20 = this.field_hb * ((var17 >> 1) + y) - (-(var18 >> 1) - x);
                  var16[1] = shape.field_l[NameValidator.bitAnd(255, (int) shape.field_m[1 + var19])];
                  var16[2] = shape.field_l[NameValidator.bitAnd(255, (int) shape.field_m[shape.field_h + var19])];
                  var16[3] = shape.field_l[NameValidator.bitAnd(255, (int) shape.field_m[1 + var19])];
                  var21 = 0;
                  var22 = 0;
                  var23 = 0;
                  stackIn_17_0 = 0;
                  var24 = stackIn_17_0;
                  while (var24 < 4) {
                    stackIn_21_0 = -1;
                    stackIn_21_1 = ~var27[var24];
                    if (stackIn_21_0 == stackIn_21_1) {
                      var16[var24] = mask.field_l[NameValidator.bitAnd((int) mask.field_m[var20], 255)];
                    }
                    var23 = var23 + (var27[var24] & 255);
                    var22 = var22 + ((var27[var24] & 65305) >> 8);
                    var21 = var21 + (var27[var24] >> 16);
                    var24++;
                  }
                  mask.field_m[var20] = (byte)MusicPatchPcmStream.field_p[this.arenaTheme].lookupColour(BitAndSpriteHelpers.bitOr(var23 >> 2, BitAndSpriteHelpers.bitOr(var21 >> 2 << 16, var22 >> 2 << 8)), 510);
                  var18 += 2;
                  continue scanLoop2;
                }
                break;
              }
              var17 += 2;
              continue scanLoop1;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_34_0 = var6;
          stackIn_34_1 = new StringBuilder().append("nf.GA(").append(y).append(',');
          if (mask == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (shape == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(x).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void onPlayerDefeated(int player, boolean obfuscationGuard) {
        BattleUnit dupTemp$0 = null;
        BattleUnit dupTemp$1 = null;
        int stackIn_35_1 = 0;
        boolean stackIn_36_2 = false;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        BattleUnit var7 = null;
        BattleUnit var8 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (player < 0) {
          return;
        }
        if (player >= this.playerCount) {
          return;
        }
        var7 = this.getUnitByOwner(player, true);
        var8 = var7;
        if (var8 == null) {
          return;
        }
        if (var8.health <= 20) {
          return;
        }
        if (obfuscationGuard) {
          this.randomSeed = 81;
        }
        var4 = 100;
        if (this.playerSpellbook[player] == 4) {
          var4 = 5 * (this.field_X[player] / 5) + 5;
          if (0 < this.field_X[player] &&
            5 + this.field_X[player] == var4) {
            var4 = this.field_X[player];
          }
        }
        if (this.field_X[player] >= var4) {
          return;
        }
        if (9 != this.playerSpellbook[player]) {
          dupTemp$0 = this.getUnitByOwner(player, true);
          dupTemp$0.health = dupTemp$0.health - 20;
          if (this.playerSpellbook[player] == 4) {
            this.field_X[player] = this.field_X[player] + 1;
            if (var6 != 0) {
              this.field_X[player] = this.field_X[player] + 20;
            }
          } else {
            this.field_X[player] = this.field_X[player] + 20;
          }
          if (this.playerSpellbook[player] == 4 ||
            this.field_X[player] == 20) {
            this.field_Ab[player] = var7.x;
            this.field_o[player] = var7.y;
          }
          if (this.projectileSamples == null) {
            return;
          }
          if (this.projectileSamples[AccountFlowHelpers.field_f[0 + this.playerSpellbook[player]]] == null) {
            return;
          }
          DropdownList.playSampleAtVolume((byte) -30, SceneWidgetNode.field_r[AccountFlowHelpers.field_f[0 + this.playerSpellbook[player] + 0]], this.projectileSamples[AccountFlowHelpers.field_f[this.playerSpellbook[player] + 0]]);
          if (var6 == 0) {
            return;
          }
        }
        stackIn_35_1 = player;
        stackIn_36_2 = !(obfuscationGuard);
        dupTemp$1 = this.getUnitByOwner(stackIn_35_1, stackIn_36_2);
        dupTemp$1.health = dupTemp$1.health - 100;
        var5 = 0;
        while (this.playerCount > var5) {
          this.field_X[var5] = 0;
          var5++;
          if (var6 != 0) {
            return;
          }
        }
        return;
    }

    final void resetSpellSlots(int spellType, int player, boolean obfuscationGuard) {
        int[] dupTemp$1 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (0 > spellType) {
          return;
        }
        if (0 > player) {
          return;
        }
        var4 = 0;
        if (!obfuscationGuard) {
          this.isUnitInRange(true, (BattleUnit) null, 10, -31, 10);
        }
        while (var4 < 16 &&
          var5 == 0) {
          if (~spellType == ~this.spellSlots[player][var4]) {
            if (-1 == StatefulTextPainter.field_p) {
              dupTemp$1 = this.spellCharges[player];
              dupTemp$1[var4] = dupTemp$1[var4] + 1;
            }
            this.spellRecharge[player][var4] = 0;
            return;
          }
          var4++;
        }
        return;
    }

    final boolean isValidTarget(BattleUnit unit, int y, int x, int obfuscationGuard, int spellType) {
        boolean stackIn_3_0 = false;
        boolean stackIn_21_0 = false;
        boolean stackIn_25_0 = false;
        boolean stackIn_31_0 = false;
        boolean stackIn_34_0 = false;
        boolean stackIn_38_0 = false;
        boolean stackIn_65_0 = false;
        boolean stackIn_69_0 = false;
        boolean stackIn_75_0 = false;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (spellType == 153) {
            stackIn_3_0 = this.isValidTarget(unit, y, x, obfuscationGuard ^ 0, 39);
            return stackIn_3_0;
          }
          if (spellType == 151) {
            return false;
          }
          if (this.field_f &&
            !this.isArenaSpell((byte) 66, spellType)) {
            return false;
          }
          if (2 != spellType &&
            spellType != 81 &&
            91 != spellType &&
            spellType != 31 &&
            spellType != 60 &&
            spellType != 55 &&
            spellType != 114) {
            if (30 == spellType) {
              stackIn_25_0 = this.canTargetPoint(x, unit, obfuscationGuard + 31011, y);
              return stackIn_25_0;
            }
            if (obfuscationGuard != -129) {
              return false;
            }
            if (spellType == 78) {
              stackIn_31_0 = this.canLandAt(unit, y, x, -5);
              return stackIn_31_0;
            }
            if (spellType == 4) {
              stackIn_34_0 = this.canStandAt(x, unit, -16, y);
              return stackIn_34_0;
            }
            if (spellType == 150) {
              stackIn_38_0 = this.canPlaceUnitAt(x, y, (byte) -75, unit);
              return stackIn_38_0;
            }
            if (spellType != 56 &&
              57 != spellType &&
              spellType != 32 &&
              spellType != 33 &&
              spellType != 42 &&
              spellType != 17 &&
              spellType != 23 &&
              spellType != 59 &&
              spellType != 47 &&
              spellType != 65 &&
              spellType != 67 &&
              64 != spellType &&
              44 != spellType &&
              77 != spellType &&
              spellType != 76 &&
              spellType != 6 &&
              spellType != 79 &&
              spellType != 98 &&
              spellType != 90 &&
              107 != spellType &&
              spellType != 104 &&
              spellType != 92 &&
              spellType != 112 &&
              118 != spellType) {
              if (9 == spellType) {
                stackIn_69_0 = this.isInsideMargin(false, x, y);
                return stackIn_69_0;
              }
              if (5 != DropdownList.field_N) {
                if (spellType != 11) {
                  return true;
                }
                return false;
              }
              stackIn_75_0 = (this.isInsideMargin(false, x, y)) && (this.isInsideMargin(false, unit.x, -32 + (unit.y - unit.size)));
              return stackIn_75_0;
            }
            stackIn_65_0 = this.isUnitInRange(false, unit, spellType, y, x);
            return stackIn_65_0;
          }
          stackIn_21_0 = this.canSummonAt(spellType, y, unit, (byte) 74, x);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_83_0 = var6;
          stackIn_83_1 = new StringBuilder().append("nf.HD(");
          if (unit == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_83_0), ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',').append(y).append(',').append(x).append(',').append(obfuscationGuard).append(',').append(spellType).append(')').toString());
        }
    }

    final boolean hasPendingActions(int obfuscationGuard) {
        int var2 = 16 % ((obfuscationGuard - 46) / 48);
        return !this.actionQueue.isEmpty(true) ? true : false;
    }

    final void setSeed(int seed, boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          this.clearUnits((byte) -37);
        }
        this.randomSeed = seed;
    }

    private final boolean unitSpriteHitsTerrain(BattleUnit unit, Sprite sprite, int obfuscationGuard, int y, int x) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.eraseUnitMask(unit, obfuscationGuard + obfuscationGuard);
          var6_int = this.spriteOverlapsTerrain(y, 2, x, sprite) ? 1 : 0;
          this.stampUnitMask(-62, unit);
          stackIn_1_0 = var6_int;
          return stackIn_1_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("nf.A(");
          if (unit == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (sprite == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(',').append(y).append(',').append(x).append(')').toString());
        }
    }

    private final void finishTurn(int obfuscationGuard, int param1) {
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_138_0 = 0;
        int stackIn_138_1 = 0;
        int stackIn_200_0 = 0;
        int stackIn_200_1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        BattleUnit var6_ref_ml = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        BattleUnit var10 = null;
        int var4Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var4Lifetime1Lifetime1;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        if (!this.turnActive) {
          throw new IllegalStateException();
        }
        if (this.currentPlayer >= 0) {
          var10 = this.getUnitByOwner(this.currentPlayer, true);
          if (var10 != null) {
            if (var10.health != 1) {
            }
            var4 = 0;
            var5 = 0;
            var6_ref_ml = (BattleUnit) (this.units.first(12623));
            while (true) {
              if (var6_ref_ml != null) {
                stackIn_18_0 = var6_ref_ml.unitType;
                stackIn_18_1 = 26;
                if (var9 == 0) {
                  if (stackIn_18_0 == stackIn_18_1) {
                    var5++;
                  }
                  if (var6_ref_ml.unitType == 30) {
                    var4++;
                  }
                  var6_ref_ml = (BattleUnit) (this.units.next(0));
                  continue;
                }
              } else {
                stackIn_18_0 = 16;
                stackIn_18_1 = var10.unitType;
              }
              break;
            }
            if (stackIn_18_0 == stackIn_18_1 &&
              var5 <= 0) {
            }
          }
        }
        boolean decompiledFrameCompleted0 = true;
        boolean decompiledFrameRemainder0 = true;
        this.field_E = new int[this.playerCount];
        this.field_fb = new int[17];
        var3 = 0;
        if (this.currentPlayer >= 0) {
          if (!this.teamMode) {
            var3++;
            this.field_E[this.currentPlayer] = this.field_E[this.currentPlayer] + 1;
            decompiledFrameRemainder0 = (var9 != 0);
          }
          if (decompiledFrameRemainder0) {
            var4Lifetime1 = this.currentPlayer & 1;
            while (var4Lifetime1 < this.playerCount) {
              var3++;
              this.field_E[var4Lifetime1] = this.field_E[var4Lifetime1] + 1;
              var4Lifetime1 += 2;
              if (var9 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
        }
        if (decompiledFrameCompleted0) {
          var4Lifetime1Lifetime1 = 44 % ((obfuscationGuard - 74) / 52);
        }
        var5 = 0;
        do {
          if (var5 >= 17) {
            var5 = 0;
            break;
          }
          this.field_fb[var5] = -1;
          var5++;
        } while (var9 == 0);
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (this.playerCount <= var5))) {
          var6 = 0;
          stackIn_138_0 = -1;
          stackIn_138_1 = this.field_fb[var6];
          if (var9 == 0) {
            if ((stackIn_138_0 == stackIn_138_1 ||
              this.field_K[var5] > this.field_K[this.field_fb[var6]]) &&
              this.field_K[var5] >= 1000) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((this.field_fb[var6] == -1 ||
              this.field_ib[this.field_fb[var6]] < this.field_ib[var5]) && this.field_ib[var5] >= 100) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((this.field_fb[var6] == -1 ||
              this.field_g[var5] > this.field_g[this.field_fb[var6]]) && this.field_g[var5] >= 100) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((-1 == this.field_fb[var6] ||
              this.field_ob[var5] > this.field_ob[this.field_fb[var6]]) && 3 < this.field_ob[var5]) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((this.field_fb[var6] == -1 ||
              this.field_U[var5] > this.field_U[this.field_fb[var6]]) && this.field_U[var5] > 1) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((this.field_fb[var6] == -1 ||
              this.field_ab[var5] > this.field_ab[this.field_fb[var6]]) && this.field_ab[var5] >= 5) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((-1 == this.field_fb[var6] ||
              this.field_Eb[this.field_fb[var6]] < this.field_Eb[var5]) && this.field_Eb[var5] > 1) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((this.field_fb[var6] == -1 ||
              this.field_K[var5] < this.field_K[this.field_fb[var6]]) && this.field_K[var5] <= 250) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((this.field_fb[var6] == -1 ||
              this.field_wb[this.field_fb[var6]] < this.field_wb[var5]) && 200 <= this.field_wb[var5]) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((this.field_fb[var6] == -1 ||
              this.field_Nb[this.field_fb[var6]] < this.field_Nb[var5]) && this.field_Nb[var5] >= 100) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((this.field_fb[var6] == -1 ||
              this.field_T[var5] > this.field_T[this.field_fb[var6]]) && 250 <= this.field_T[var5]) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((this.field_fb[var6] == -1 ||
              this.field_n[var5] > this.field_n[this.field_fb[var6]]) && this.field_n[var5] >= 5) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((-1 == this.field_fb[var6] ||
              this.field_gb[this.field_fb[var6]] < this.field_gb[var5]) && this.field_gb[var5] > 1) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((-1 == this.field_fb[var6] ||
              this.field_Fb[this.field_fb[var6]] < this.field_Fb[var5]) && this.field_Fb[var5] > 1) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((this.field_fb[var6] == -1 ||
              this.field_Ob[var5] > this.field_Ob[this.field_fb[var6]]) && this.field_Ob[var5] >= 3000) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if ((this.field_fb[var6] == -1 ||
              this.field_c[var5] > this.field_c[this.field_fb[var6]]) && 50 <= this.field_c[var5]) {
              this.field_fb[var6] = var5;
            }
            var6++;
            if (Js5Transport.isFeatureEnabled(0, (byte) -63) && (-1 == this.field_fb[var6] ||
              this.field_b[this.field_fb[var6]] < this.field_b[var5]) && this.field_b[var5] >= 1) {
              this.field_fb[var6] = var5;
            }
            var5++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_138_0 = -1;
          stackIn_138_1 = this.field_fb[11];
        }
        if (stackIn_138_0 != stackIn_138_1 &&
          this.field_fb[0] == -1 &&
          this.field_fb[1] == -1) {
          this.field_fb[11] = -1;
        }
        if (this.field_fb[7] != -1 &&
          this.field_fb[0] == -1 &&
          this.field_fb[1] == -1) {
          this.field_fb[7] = -1;
        }
        if (this.field_fb[13] == this.field_fb[12]) {
          this.field_fb[12] = -1;
          this.field_fb[13] = -1;
        }
        if (this.field_fb[7] == this.field_fb[1]) {
          this.field_fb[1] = -1;
        }
        if (this.field_fb[7] == this.field_fb[0]) {
          this.field_fb[0] = -1;
        }
        var5 = -1 + this.playerCount * 2;
        if (var5 > (-2 + this.round / this.playerCount)) {
          var5 = -2 + this.round / this.playerCount;
        }
        if (var5 < 0) {
          var5 = 0;
        }
        var6Lifetime1 = 0;
        while (this.field_fb.length > var6Lifetime1) {
          var7 = this.field_fb[var6Lifetime1];
          stackIn_200_0 = 0;
          stackIn_200_1 = ~var7;
          if (var9 != 0) {
            return;
          }
          if (stackIn_200_0 != stackIn_200_1) {
            if ((param1 & 1 << var7) == 0) {
              this.field_E[var7] = this.field_E[var7] + 1;
            }
            var3++;
          }
          var6Lifetime1++;
        }
        var6Lifetime2 = 0;
        while (true) {
          if (var6Lifetime2 >= this.playerCount) {
            return;
          }
          if (var9 != 0) {
            return;
          }
          if (0 < this.field_E[var6Lifetime2]) {
            this.field_E[var6Lifetime2] = this.field_E[var6Lifetime2] * var5 / var3;
            if (this.field_E[var6Lifetime2] == 0) {
              this.field_E[var6Lifetime2] = 1;
            }
            var7Lifetime1 = 250 * this.field_S[var6Lifetime2];
            if (var7Lifetime1 > this.field_m) {
              var8 = 1 + (var7Lifetime1 - this.field_m) / 250;
              if (this.field_E[var6Lifetime2] < var8) {
                var8 = this.field_E[var6Lifetime2];
              }
              this.field_E[var6Lifetime2] = this.field_E[var6Lifetime2] - var8;
            }
          }
          var6Lifetime2++;
        }
    }

    final boolean isInsideMargin(boolean obfuscationGuard, int x, int y) {
        int var4;
        boolean stackIn_11_0 = false;
        if (obfuscationGuard) {
          this.field_fb = (int[]) null;
        }
        var4 = 32;
        if (x >= var4 &&
          x <= (this.arenaWidth - var4) &&
          var4 <= y &&
          (this.arenaHeight - var4) >= y) {
          stackIn_11_0 = !(this.circleHitsTerrain(x, var4 >> 1, y, -66));
          return stackIn_11_0;
        }
        return false;
    }

    private final boolean hasLivingPlayers(byte obfuscationGuard) {
        int var2;
        int var3;
        int var4;
        BattleUnit var5;
        int var6;
        boolean stackIn_10_0 = false;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = 0;
        var3 = -5 / ((obfuscationGuard + 57) / 54);
        var4 = 0;
        scanLoop1: while (true) {
          if (var4 < this.playerCount) {
            var5 = this.getUnitByOwner(var4, true);
            if (var6 == 0) {
              if (var5 != null) {
                var2++;
              }
              var4++;
              continue;
            }
          } else {
            if (var2 <= 1) {
              stackIn_10_0 = true;
              break scanLoop1;
            }
          }
          stackIn_10_0 = false;
          break;
        }
        return stackIn_10_0;
    }

    private final int[] generateTwentyPointLowProfile(int obfuscationGuard, IsaacRandom random) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12_ref_int__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        Sprite var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_26_3;
        int stackIn_27_4 = 0;
        int stackIn_30_0 = 0;
        Object stackIn_67_0 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        var24 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var27 = new int[20];
          var26 = var27;
          var25 = var26;
          var4 = var25;
          var5 = 0;
          do {
            if (var5 >= var27.length) {
              var25[0] = this.arenaHeight + 64;
              var25[19] = 64 + this.arenaHeight;
              break;
            }
            var25[var5] = 64 + (this.arenaHeight - ScreenDisplayMode.randomBelow(random, 256, (byte) -123));
            var5++;
          } while (var24 == 0);
          var6 = ScreenDisplayMode.randomBelow(random, 5, (byte) -110) + 1;
          var7 = -2 + (ScreenDisplayMode.randomBelow(random, 5, (byte) -90) + 10);
          var8 = -6 + ScreenDisplayMode.randomBelow(random, 5, (byte) -80) + 20;
          if (var6 <= 1) {
            var25[3 + var6] = this.arenaHeight * 6 / 8 - ScreenDisplayMode.randomBelow(random, this.arenaHeight * 3 / 8, (byte) -69);
          }
          if (var6 > 1 ||
            var24 != 0) {
            var25[-1 + var6] = this.arenaHeight * 6 / 8 - ScreenDisplayMode.randomBelow(random, 5 * this.arenaHeight / 8, (byte) -28);
          }
          var25[var6] = 6 * this.arenaHeight / 8 - ScreenDisplayMode.randomBelow(random, this.arenaHeight * 5 / 8, (byte) -30);
          var25[var6 + 1] = this.arenaHeight * 6 / 8 - ScreenDisplayMode.randomBelow(random, this.arenaHeight * 5 / 8, (byte) -23);
          var25[var6 + 2] = 6 * this.arenaHeight / 8 - ScreenDisplayMode.randomBelow(random, 4 * this.arenaHeight / 8, (byte) -27);
          var9 = var27[var6];
          var25[var8 - 1] = 6 * this.arenaHeight / 8 - ScreenDisplayMode.randomBelow(random, this.arenaHeight * 5 / 8, (byte) -54);
          var25[var8 - 2] = this.arenaHeight * 6 / 8 - ScreenDisplayMode.randomBelow(random, 4 * this.arenaHeight / 8, (byte) -93);
          var25[var8] = 6 * this.arenaHeight / 8 - ScreenDisplayMode.randomBelow(random, 5 * this.arenaHeight / 8, (byte) -97);
          if (var8 >= 17) {
            var25[var8 - 3] = 6 * this.arenaHeight / 8 - ScreenDisplayMode.randomBelow(random, 3 * this.arenaHeight / 8, (byte) -115);
          }
          if (var8 < 17 ||
            var24 != 0) {
            var25[1 + var8] = 6 * this.arenaHeight / 8 - ScreenDisplayMode.randomBelow(random, this.arenaHeight * 5 / 8, (byte) -57);
          }
          var10 = var27[var8];
          var25[-2 + var7] = 6 * this.arenaHeight / 8 - ScreenDisplayMode.randomBelow(random, this.arenaHeight * 3 / 8, (byte) -100);
          var25[-1 + var7] = 6 * this.arenaHeight / 8 - ScreenDisplayMode.randomBelow(random, this.arenaHeight * 4 / 8, (byte) -95);
          var25[var7] = 6 * this.arenaHeight / 8 - ScreenDisplayMode.randomBelow(random, 5 * this.arenaHeight / 8, (byte) -74);
          if (obfuscationGuard != -22070) {
            this.arenaWidth = 13;
          }
          var25[1 + var7] = 6 * this.arenaHeight / 8 - ScreenDisplayMode.randomBelow(random, this.arenaHeight * 4 / 8, (byte) -114);
          var25[var7 + 2] = 6 * this.arenaHeight / 8 - ScreenDisplayMode.randomBelow(random, this.arenaHeight * 3 / 8, (byte) -30);
          var11 = var27[var7];
          var25[(var7 + var6) / 2] = 64 + this.arenaHeight;
          var25[(var7 + var8) / 2] = this.arenaHeight + 64;
          scanLoop1: while (true) {
            if (this.arenaWidth / 32 > var4.length) {
              var12_ref_int__ = new int[(-1 + var4.length) * 2 + 1];
              stackIn_20_0 = var12_ref_int__;
              stackIn_20_1 = 0;
              stackIn_20_2 = var4[0];
              while (true) {
                stackIn_20_0[stackIn_20_1] = stackIn_20_2;
                stackIn_30_0 = 1;
                if (var24 != 0) {
                  break scanLoop1;
                }
                var5 = stackIn_30_0;
                while (var4.length > var5) {
                  var3_int = this.arenaHeight / var4.length;
                  stackIn_20_0 = var12_ref_int__;
                  stackIn_20_1 = -1 + 2 * var5;
                  stackIn_20_2 = -(var3_int / 2);
                  stackIn_26_3 = (var4[var5] + var4[var5 - 1]) / 2;
                  if (0 == var3_int) {
                    stackIn_27_4 = 0;
                  } else {
                    stackIn_27_4 = random.nextIntBelow(var3_int, (byte) -116);
                  }
                  stackIn_20_0[stackIn_20_1] = stackIn_20_2 + (stackIn_26_3 + stackIn_27_4);
                  var12_ref_int__[var5 * 2] = var4[var5];
                  var5++;
                }
                var4 = var12_ref_int__;
                continue scanLoop1;
              }
            }
            var6 = (var6 + 1) * var4.length / 20;
            stackIn_30_0 = var4.length * (var8 - 1) / 20;
            break;
          }
          var12 = stackIn_30_0;
          var8 = var4.length * (var7 + 2) / 20;
          var9 = var4[var6] + 24;
          var7 = (var7 - 2) * var4.length / 20;
          var10 = var4[var8] + 24;
          var11 = 24 + var4[var7];
          var13 = 24 + var4[var12];
          var14 = -1;
          do {
            if (1 <= var14) {
              var14 = -1;
              break;
            }
            var4[var14 + var6] = var4[var6];
            var4[var14 + var7] = var4[var7];
            var4[var14 + var8] = var4[var8];
            var4[var14 + var12] = var4[var12];
            var14++;
          } while (var24 == 0);
          do {
            if (var14 >= 1) {
              this.rasterizeTerrainProfile(var4, (byte) -106);
              System.gc();
              this.terrainSprite = new IndexedSprite(this.arenaWidth, this.arenaHeight, DecodedSpriteHelpers.field_c);
              break;
            }
            var4[var14 + var6] = var4[var14 + var6] - 64;
            var4[var7 + var14] = var4[var7 + var14] - 64;
            var4[var8 + var14] = var4[var8 + var14] - 64;
            var4[var12 + var14] = var4[var12 + var14] - 64;
            var14++;
          } while (var24 == 0);
          if (DropdownList.field_I != null) {
            this.terrainSprite.field_l = DropdownList.field_I[this.arenaTheme].field_l;
          }
          this.stampShapeWithMask(0, 127, MatchingFieldValidator.field_y, 0, this.terrainSprite);
          var14 = this.arenaWidth * var6 / var4.length;
          var15 = this.arenaWidth * var7 / var4.length;
          var16 = var8 * this.arenaWidth / var4.length;
          var17 = var12 * this.arenaWidth / var4.length;
          var18 = new Sprite(20, 20);
          var18.makeRasterTarget();
          ScreenSwitchHelpers.field_f[5].draw(2, 2);
          var19 = 0;
          do {
            if (!(var19 < var18.field_A.length)) {
              var18.drawTintedGrayscale(0, 0, 9584406);
              var18.addOutline(1);
              var18.addOutline(1);
              var19 = -var14 + var15;
              break;
            }
            var18.field_A[var19] = 65793 * NameValidator.bitAnd(var18.field_A[var19], 255);
            var19++;
          } while (var24 == 0);
          boolean decompiledFrameCompleted0 = true;
          var20 = -var9 + var11;
          if (Math.abs(var20) < var19) {
            var21 = var14;
            while (var15 > var21) {
              var22 = Math.abs(var19 / 2 - var21 + var14);
              var23 = (-(var22 * var22) + var19 * var19 / 4) / (var19 * 4);
              this.stampSpriteMask(false, var21 - 10, this.terrainSprite, false, var23 + (var9 + var20 * (var21 - var14) / var19) - 10, var18);
              var21 += 14;
              if (var24 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            var20 = -var10 + var13;
            var19 = -var16 + var17;
          }
          if (Math.abs(var20) < var19) {
            var21Lifetime1 = var16;
            while (var21Lifetime1 < var17) {
              var22Lifetime1 = Math.abs(-var21Lifetime1 + var16 + var19 / 2);
              var23Lifetime1 = (-(var22Lifetime1 * var22Lifetime1) + var19 * var19 / 4) / (var19 * 4);
              this.stampSpriteMask(false, var21Lifetime1 - 10, this.terrainSprite, false, var23Lifetime1 + (-10 + (-var16 + var21Lifetime1) * var20 / var19 + var10), var18);
              var21Lifetime1 += 14;
              if (var24 != 0) {
                return null;
              }
            }
          }
          this.placeTerrainDecorations(var4, random, (byte) 75);
          this.stampShapeWithMask(0, 121, this.terrainSprite, 0, MatchingFieldValidator.field_y);
          this.drawThemeBackground((byte) 5);
          stackIn_67_0 = null;
          return (int[]) (stackIn_67_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_70_0 = var3;
          stackIn_70_1 = new StringBuilder().append("nf.UA(").append(obfuscationGuard).append(',');
          if (random == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(')').toString());
        }
    }

    final IndexedSprite getTerrainMask(byte obfuscationGuard) {
        if (obfuscationGuard != 69) {
          return (IndexedSprite) null;
        }
        return this.terrainMask;
    }

    final int countUnitsWithDebugOverlay(int obfuscationGuard) {
        boolean discarded$0 = false;
        if (obfuscationGuard != 4) {
          discarded$0 = this.hasFreeSpellSlot(-95, 63, -13);
        }
        return this.drawDebugOverlay(106, false);
    }

    public static void releaseStatics(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          return;
        }
        field_P = null;
        field_Bb = null;
        field_yb = null;
        field_e = null;
        field_j = null;
        field_qb = null;
        field_A = null;
        field_Lb = null;
        field_z = null;
    }

    private final void updateAllUnits(byte obfuscationGuard) {
        IntrusiveDequeCursor var2 = null;
        BattleUnit var3 = null;
        int var4 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = new IntrusiveDequeCursor(this.units);
        if (obfuscationGuard != 86) {
          this.projectiles = (IntrusiveDeque) null;
        }
        var3 = (BattleUnit) (var2.first(-42));
        while (var3 != null) {
          this.stampUnitMask(-100, var3);
          var3 = (BattleUnit) (var2.next(-18502));
          if (var4 == 0) {
            continue;
          }
          break;
        }
    }

    private final int[] generateTenPointCentredProfile(IsaacRandom random, int obfuscationGuard) {
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_18_3 = 0;
        int[] stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var9 = new int[10];
          var8 = var9;
          var4 = var8;
          var5 = 0;
          if (obfuscationGuard != -12260) {
            this.field_n = (int[]) null;
          }
          do {
            if ((-1 + var9.length) <= var5) {
              var4[0] = this.arenaHeight + 64;
              var4[1] = var9[1] / 2;
              var4[var9.length - 2] = var4[-2 + var9.length] / 2;
              break;
            }
            var4[var5] = this.arenaHeight * 6 / 8 - ScreenDisplayMode.randomBelow(random, this.arenaHeight * 5 / 8, (byte) -125);
            var5++;
          } while (var7 == 0);
          var4[var9.length - 1] = var9[0];
          scanLoop1: while (true) {
            if ((this.arenaWidth / 32) > var4.length) {
              var6 = new int[1 + 2 * (-1 + var4.length)];
              stackIn_11_0 = var6;
              stackIn_11_1 = 0;
              stackIn_11_2 = var4[0];
              while (true) {
                stackIn_11_0[stackIn_11_1] = stackIn_11_2;
                if (var7 != 0) {
                  break scanLoop1;
                }
                var5 = 1;
                while (var4.length > var5) {
                  var3_int = this.arenaHeight / var4.length;
                  stackIn_11_0 = var6;
                  stackIn_11_1 = 2 * var5 - 1;
                  stackIn_11_2 = (var4[var5 - 1] + var4[var5]) / 2;
                  if (var3_int == 0) {
                    stackIn_18_3 = 0;
                  } else {
                    stackIn_18_3 = random.nextIntBelow(var3_int, (byte) -116);
                  }
                  stackIn_11_0[stackIn_11_1] = stackIn_11_2 + stackIn_18_3 - var3_int / 2;
                  var6[2 * var5] = var4[var5];
                  var5++;
                }
                var4 = var6;
                continue scanLoop1;
              }
            }
            this.rasterizeTerrainProfile(var4, (byte) -115);
            break;
          }
          stackIn_22_0 = var4;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("nf.GD(");
          if (random == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final int getCurrentSide(byte obfuscationGuard) {
        if (obfuscationGuard >= -109) {
          field_z = (int[]) null;
        }
        if (!this.teamMode) {
          return this.currentPlayer;
        }
        return 1 & this.currentPlayer;
    }

    final boolean isSolidAt(int y, int x, byte obfuscationGuard) {
        if (obfuscationGuard != -83) {
          this.carveTerrainWithSprite(1, (byte) 42, 71, (IndexedSprite) null, (Sprite) null);
        }
        return DebouncedValidator.isMaskSetAt(this.terrainMask, y, x, 96);
    }

    private final void clearProjectiles(byte obfuscationGuard) {
        SpellProjectile var2 = null;
        int var3 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = (SpellProjectile) (this.removedProjectiles.first(117));
        do {
          if (var2 == null) {
            var2 = (SpellProjectile) (this.field_h.first(117));
            break;
          }
          var2.unlink(true);
          var2 = (SpellProjectile) (this.removedProjectiles.next(-124));
        } while (var3 == 0);
        do {
          if (var2 == null) {
            this.spawnedProjectiles.appendAllFrom(this.projectiles, false);
            this.removedProjectiles.clear(17);
            break;
          }
          this.field_r.addLast(var2, -1);
          var2 = (SpellProjectile) (this.field_h.next(123));
        } while (var3 == 0);
        if (obfuscationGuard <= 71) {
          this.carveTerrainWithSprite(-89, (byte) 119, 52, (IndexedSprite) null, (Sprite) null);
        }
        this.field_h.clear(17);
        this.spawnedProjectiles.clear(-128);
        return;
    }

    private final void stampSpriteMask(boolean obfuscationGuard, int x, IndexedSprite target, boolean param3, int y, Sprite sprite) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        byte[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        byte[] var16 = null;
        byte[] var17 = null;
        int var13_intLifetime1;
        int var13_intLifetime2;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (target == null) {
            return;
          }
          x = x + sprite.field_x;
          y = y + sprite.field_o;
          var7_int = x + y * this.arenaWidth;
          var8 = 0;
          var9 = sprite.field_y;
          var10 = sprite.field_q;
          var11 = this.arenaWidth - var10;
          if (y < 0) {
            var13_int = 0 - y;
            var7_int = var7_int + var13_int * this.arenaWidth;
            var8 = var8 + var10 * var13_int;
            y = 0;
            var9 = var9 - var13_int;
          }
          if (obfuscationGuard) {
            return;
          }
          var12 = 0;
          if (var9 + y > this.arenaHeight - 1) {
            var9 = var9 - (1 - this.arenaHeight + y + var9);
          }
          if (x < 0) {
            var13_intLifetime1 = -x + 0;
            var8 = var8 + var13_intLifetime1;
            x = 0;
            var11 = var11 + var13_intLifetime1;
            var7_int = var7_int + var13_intLifetime1;
            var12 = var12 + var13_intLifetime1;
            var10 = var10 - var13_intLifetime1;
          }
          if ((this.arenaWidth - 1) < (x + var10)) {
            var13_intLifetime2 = -this.arenaWidth + 1 + var10 + x;
            var10 = var10 - var13_intLifetime2;
            var11 = var11 + var13_intLifetime2;
            var12 = var12 + var13_intLifetime2;
          }
          if (var10 > 0 &&
            0 < var9) {
            var17 = new byte[sprite.field_A.length];
            var16 = var17;
            var13 = var16;
            var14 = 0;
            while (var14 < sprite.field_A.length) {
              var13[var14] = (byte)MusicPatchPcmStream.field_p[this.arenaTheme].lookupColour(sprite.field_A[var14], 510);
              var14++;
              if (var15 != 0) {
                return;
              }
            }
            IntrusiveDeque.blitMaskedBytes(var17, var10, var8, 115, var7_int, var12, var9, target.field_m, var11, param3);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_29_0 = var7;
          stackIn_29_1 = new StringBuilder().append("nf.R(").append(obfuscationGuard).append(',').append(x).append(',');
          if (target == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(',').append(y).append(',');
          if (sprite == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    private final boolean isGameEnded(byte obfuscationGuard) {
        boolean stackIn_9_0 = false;
        if (obfuscationGuard > -62) {
          this.field_Ab = (int[]) null;
        }
        stackIn_9_0 = ((this.field_Gb &&
          !(this.waitingForInput)) ||
          this.field_Mb);
        return stackIn_9_0;
    }

    private final void executeNextAction(int obfuscationGuard, CameraFollowTarget cameraTarget) {
        int stackIn_312_0 = 0;
        int stackIn_312_1 = 0;
        int stackIn_320_0 = 0;
        int stackIn_339_0 = 0;
        int stackIn_456_0 = 0;
        int stackIn_456_1 = 0;
        int stackIn_470_0 = 0;
        int stackIn_470_1 = 0;
        int stackIn_480_0 = 0;
        int stackIn_480_1 = 0;
        int stackIn_501_0 = 0;
        int stackIn_522_0 = 0;
        int stackIn_522_1 = 0;
        int stackIn_524_0 = 0;
        int stackIn_524_1 = 0;
        BattleUnit stackIn_541_0 = null;
        int stackIn_631_0 = 0;
        int stackIn_631_1 = 0;
        BattleUnit stackIn_689_0 = null;
        BattleUnit stackIn_689_1 = null;
        RuntimeException stackIn_717_0 = null;
        StringBuilder stackIn_717_1 = null;
        String stackIn_718_2 = null;
        RuntimeException decompiledCaughtException = null;
        BattleAction var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        BattleUnit var12 = null;
        SpellProjectile var13_ref_mi = null;
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
        Object var24_ref = null;
        SpellProjectile var24_ref_mi = null;
        int var24 = 0;
        BattleUnit var24_ref_ml = null;
        int[] var24_ref_int__ = null;
        int var25_int = 0;
        SpellProjectile var25 = null;
        BattleUnit var25_ref = null;
        int[] var25_array = null;
        int var26 = 0;
        double var26_double = 0.0;
        int[] var26_ref_int__ = null;
        SpellProjectile var26_ref_mi = null;
        int var27 = 0;
        int[] var27_ref_int__ = null;
        SpellProjectile var27_ref_mi = null;
        SpellProjectile var28 = null;
        double var28_double = 0.0;
        int var28_int = 0;
        BattleUnit var28_ref = null;
        Sprite var29 = null;
        double var30 = 0.0;
        double var32 = 0.0;
        double var34 = 0.0;
        double var36 = 0.0;
        double var38 = 0.0;
        double var40 = 0.0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        SpellProjectile var46 = null;
        int var47 = 0;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        SpellProjectile var24_ref_miLifetime1;
        SpellProjectile var24_ref_miLifetime2;
        SpellProjectile var24_ref_miLifetime3;
        SpellProjectile var24_ref_miLifetime4;
        SpellProjectile var24_ref_miLifetime5;
        SpellProjectile var24_ref_miLifetime6;
        SpellProjectile var24_ref_miLifetime7;
        SpellProjectile var24_ref_miLifetime8;
        SpellProjectile var24_ref_miLifetime9;
        SpellProjectile var24_ref_miLifetime10;
        SpellProjectile var24_ref_miLifetime11;
        SpellProjectile var24_ref_miLifetime12;
        SpellProjectile var24_ref_miLifetime13;
        SpellProjectile var24_ref_miLifetime14;
        SpellProjectile var24_ref_miLifetime15;
        SpellProjectile var24_ref_miLifetime16;
        SpellProjectile var24_ref_miLifetime17;
        SpellProjectile var24_ref_miLifetime18;
        SpellProjectile var24_ref_miLifetime19;
        SpellProjectile var24_ref_miLifetime20;
        SpellProjectile var24_ref_miLifetime21;
        BattleUnit var24_ref_mlLifetime1;
        BattleUnit var24_ref_mlLifetime2;
        BattleUnit var24_ref_mlLifetime3;
        BattleUnit var24_ref_mlLifetime4;
        BattleUnit var24_ref_mlLifetime5;
        BattleUnit var24_ref_mlLifetime6;
        BattleUnit var24_ref_mlLifetime7;
        BattleUnit var24_ref_mlLifetime8;
        BattleUnit var24_ref_mlLifetime9;
        BattleUnit var24_ref_mlLifetime10;
        BattleUnit var24_ref_mlLifetime11;
        BattleUnit var24_ref_mlLifetime12;
        BattleUnit var24_ref_mlLifetime13;
        BattleUnit var24_ref_mlLifetime14;
        BattleUnit var24_ref_mlLifetime15;
        BattleUnit var24_ref_mlLifetime16;
        BattleUnit var24_ref_mlLifetime17;
        BattleUnit var24_ref_mlLifetime18;
        BattleUnit var24_ref_mlLifetime19;
        BattleUnit var24_ref_mlLifetime20;
        BattleUnit var24_ref_mlLifetime21;
        BattleUnit var24_ref_mlLifetime22;
        BattleUnit var24_ref_mlLifetime23;
        SpellProjectile var25Lifetime1;
        SpellProjectile var25Lifetime2;
        SpellProjectile var25Lifetime3;
        SpellProjectile var25Lifetime4;
        SpellProjectile var25Lifetime5;
        SpellProjectile var25Lifetime6;
        SpellProjectile var25Lifetime7;
        SpellProjectile var25Lifetime8;
        SpellProjectile var25Lifetime9;
        SpellProjectile var25Lifetime10;
        SpellProjectile var25Lifetime11;
        SpellProjectile var25Lifetime12;
        SpellProjectile var25Lifetime13;
        SpellProjectile var25Lifetime14;
        SpellProjectile var25Lifetime15;
        SpellProjectile var25Lifetime16;
        SpellProjectile var25Lifetime17;
        SpellProjectile var25Lifetime18;
        SpellProjectile var25Lifetime19;
        SpellProjectile var26_ref_miLifetime1;
        SpellProjectile var28Lifetime1;
        SpellProjectile var28Lifetime2;
        SpellProjectile var25Lifetime20;
        SpellProjectile var24_ref_miLifetime9Lifetime1;
        SpellProjectile var24_ref_miLifetime13Lifetime1;
        SpellProjectile var24_ref_miLifetime13Lifetime2;
        SpellProjectile var24_ref_miLifetime15Lifetime1;
        SpellProjectile var24_ref_miLifetime16Lifetime1;
        SpellProjectile var24_ref_miLifetime17Lifetime1;
        SpellProjectile var24_ref_miLifetime17Lifetime2;
        BattleUnit var24_ref_mlLifetime5Lifetime1;
        BattleUnit var24_ref_mlLifetime6Lifetime1;
        SpellProjectile var25Lifetime3Lifetime1;
        SpellProjectile var25Lifetime5Lifetime1;
        SpellProjectile var25Lifetime11Lifetime1;
        SpellProjectile var25Lifetime11Lifetime2;
        SpellProjectile var25Lifetime11Lifetime3;
        SpellProjectile var25Lifetime12Lifetime1;
        SpellProjectile var25Lifetime13Lifetime1;
        SpellProjectile var25Lifetime15Lifetime1;
        int stackIn_501_0Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var11Lifetime5;
        int var11Lifetime6;
        int var11Lifetime7;
        int var11Lifetime8;
        int var11Lifetime9;
        int var11Lifetime10;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var15Lifetime1;
        int var24Lifetime1;
        int var24Lifetime2;
        int var24Lifetime3;
        int var24Lifetime4;
        int var24Lifetime5;
        int var24Lifetime6;
        int var24Lifetime7;
        int var24Lifetime8;
        int var25_intLifetime1;
        int var25_intLifetime2;
        int var25_intLifetime3;
        int var25_intLifetime4;
        int var25_intLifetime5;
        int var25_intLifetime6;
        int var25_intLifetime7;
        int var26Lifetime1;
        int var26Lifetime2;
        int var26Lifetime3;
        int var26Lifetime4;
        int var26Lifetime5;
        int var27Lifetime1;
        int var27Lifetime2;
        int var27Lifetime3;
        var24_ref = null;
        var47 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.isGameEnded((byte) -82)) {
            throw new IllegalStateException();
          }
          var3 = (BattleAction) (this.actionQueue.removeFirst(true));
          if (var3 == null) {
            return;
          }
          this.field_Z = false;
          this.field_tb = 0;
          var4 = var3.field_t;
          var5 = var3.field_o;
          var6 = var3.field_j;
          var7 = var3.field_q;
          var8 = var3.field_s;
          var9 = var3.field_k;
          var10 = var3.field_m;
          var11 = var3.field_h;
          if (var4 < 0) {
            throw new IllegalArgumentException();
          }
          if (this.turnActive) {
            throw new IllegalStateException();
          }
          var12 = this.getUnitByOwner(var5, true);
          if (var12 == null) {
            return;
          }
          if (var10 == 157) {
            if (cameraTarget != null) {
              cameraTarget.followUnit(-85, var12);
              if (this.projectileSamples != null &&
                this.projectileSamples[225] != null) {
                DropdownList.playSampleAtVolume((byte) -30, SceneWidgetNode.field_r[225], this.projectileSamples[225]);
              }
            }
            return;
          }
          if (var10 == 158) {
            if (var8 == 0) {
              var12.field_M = -1;
            }
            if (var8 == 1) {
              var12.field_M = 1;
            }
            if (var8 == 2) {
              var12.facing = -1;
              var12.field_M = 2;
            }
            if (var8 == 3) {
              var12.facing = -1;
              var12.field_M = 3;
            }
            if (4 == var8) {
              var12.field_M = 2;
              var12.facing = 1;
            }
            var11--;
            if (5 == var8) {
              var12.field_M = 3;
              var12.facing = 1;
            }
            if (var11 > 0) {
              var3.field_h = var11;
              this.actionQueue.addFirst((IntrusiveNode) (var3), (byte) -58);
            }
            return;
          }
          if (var10 == 159) {
            this.onPlayerDefeated(var4, false);
            return;
          }
          boolean decompiledFrameCompleted14 = true;
          if (null == var12.linkedUnit) {
            var13_ref_mi = (SpellProjectile) (this.projectiles.first(12623));
            while (var13_ref_mi != null) {
              if (var47 != 0) {
                decompiledFrameCompleted14 = false;
                break;
              }
              if (var12 == var13_ref_mi.owner &&
                var13_ref_mi.spellType == 107) {
                var13_ref_mi.remove(0);
              }
              var13_ref_mi = (SpellProjectile) (this.projectiles.next(0));
            }
          }
          if ((decompiledFrameCompleted14) &&
            (var6 < -640)) {
            var6 = -640;
          }
          if (this.projectileSamples != null &&
            null != this.projectileSamples[64 + var10]) {
            DropdownList.playSampleAtVolume((byte) -30, SceneWidgetNode.field_r[64 + var10], this.projectileSamples[64 + var10]);
          }
          if (var7 < -480) {
            var7 = -480;
          }
          if (var6 > this.arenaWidth + 640) {
            var6 = 640 + this.arenaWidth;
          }
          if ((480 + this.arenaHeight) < var7) {
            var7 = this.arenaHeight + 480;
          }
          var13 = var6 - var12.x;
          var14 = (var12.size >> 1) + var7 - var12.y;
          var15 = var13 * var13 + var14 * var14;
          if (var15 <= 0) {
            return;
          }
          var15Lifetime1 = ConnectionState.greatestCommonDivisor(var14, var13, false);
          this.field_mb = var8;
          if (var13 <= 0) {
            var12.facing = -1;
          }
          if (var13 > 0 ||
            var47 != 0) {
            var12.facing = 1;
          }
          this.field_t = var9;
          if (!this.field_Gb) {
            if (1 == FixedViewResizeListener.field_e[var10] &&
              var8 == -1000 &&
              var15Lifetime1 > 32) {
              var11 = 0;
            }
            if (2 == FixedViewResizeListener.field_e[var10] ||
              FixedViewResizeListener.field_e[var10] == 4) {
              var9 = var7;
              var8 = var6;
            }
            if (var10 == 4 &&
              this.spriteOverlapsTerrain(-var12.size + var9, 2, var8 - (var12.size >> 1), var12.maskSprite) &&
              32 < var15Lifetime1) {
              var11 = 0;
            }
          }
          if (FixedViewResizeListener.field_e[var10] == 0 &&
            var12.hasNoLinkedUnit(44)) {
            this.field_Z = true;
          }
          this.field_Y = var10;
          var16 = 0;
          var17 = 8;
          var18 = -1;
          var19 = 1;
          if (62 == var10) {
            var18 = 52;
          }
          if (131 == var10) {
            var18 = 52;
          }
          if (var10 == 63) {
            var18 = 53;
            var19 = 1;
            var16 = 1;
          }
          if (66 == var10) {
            var18 = 54;
          }
          if (var10 == 69) {
            var18 = 56;
          }
          if (0 == var10) {
            var18 = 74;
          }
          if (10 == var10) {
            var18 = 2;
            var19 = 0;
          }
          if (var10 == 12) {
            var18 = 10;
          }
          if (var10 == 13) {
            var18 = 11;
          }
          if (14 == var10) {
            var19 = 1;
            var16 = 1;
            var18 = 12;
          }
          if (var10 == 15) {
            var18 = 13;
            var19 = 1;
            var16 = 1;
          }
          if (var10 == 16) {
            var18 = 68;
          }
          if (72 == var10) {
            var18 = 106;
          }
          if (var10 == 135) {
            var18 = 106;
          }
          if (var10 == 82) {
            var18 = 107;
          }
          if (var10 == 84) {
            var18 = 115;
          }
          if (var10 == 85) {
            var19 = 1;
            var18 = 116;
            var16 = 1;
          }
          if (86 == var10) {
            var18 = 118;
            var11 = 48;
          }
          if (var10 == 149) {
            var11 = 48;
            var18 = 118;
          }
          if (var10 == 87) {
            var18 = 119;
            var11 = 48;
          }
          if (99 == var10) {
            var18 = 140;
          }
          if (96 == var10) {
            var18 = 133;
          }
          if (var10 == 18) {
            var18 = 73;
            var11 = 48;
            var19 = 0;
          }
          if (var10 == 19) {
            var19 = 1;
            var18 = 67;
            var16 = 1;
          }
          if (var10 == 52) {
            var18 = 45;
          }
          if (var10 == 74) {
            var18 = 61;
          }
          if (50 == var10) {
            var11 = 48;
            var18 = 75;
          }
          if (var10 == 51) {
            var18 = 44;
          }
          if (var10 == 48) {
            var18 = 40;
          }
          if (var10 == 49) {
            var19 = 1;
            var18 = 41;
            var16 = 1;
          }
          if (var10 == 80) {
            var18 = 66;
          }
          if (var10 == 121) {
            var18 = 97;
            var11 = 48;
          }
          if (122 == var10) {
            var18 = 40;
          }
          if (var10 == 123) {
            var18 = 78;
            var19 = 0;
          }
          if (var10 == 137) {
            var19 = 0;
            var18 = 78;
          }
          if (var10 == 138) {
            var18 = 78;
            var19 = 0;
          }
          if (var10 == 155) {
            var19 = 0;
            var12.bobPhase = -3.0;
            var18 = 78;
          }
          if (24 == var10) {
            var11 = 48;
            var18 = 81;
          }
          if (var10 == 26) {
            var18 = 22;
          }
          if (var10 == 28) {
            var17 = 16;
            var18 = 24;
          }
          if (var10 == 25) {
            var18 = 21;
          }
          if (var10 == 27) {
            var17 = 16;
            var18 = 23;
          }
          if (29 == var10) {
            var17 = 16;
            var18 = 25;
            var19 = 1;
          }
          if (var10 == 124) {
            var18 = 79;
          }
          if (var10 == 125) {
            var18 = 80;
            var19 = 0;
          }
          if (36 == var10) {
            var18 = 84;
            var11 = 48;
          }
          if (var10 == 126) {
            var18 = 84;
            var11 = 48;
          }
          if (var10 == 88) {
            var18 = 120;
          }
          if (var10 == 89) {
            var16 = 1;
            var18 = 122;
            var19 = 1;
          }
          if (var10 == 1) {
            var19 = 1;
            var18 = 147;
            var16 = 1;
          }
          if (var10 == 3) {
            var18 = 148;
          }
          if (var10 == 102) {
            var18 = 144;
            var19 = 0;
            var11 = 48;
          }
          if (var10 == 103) {
            var16 = 1;
            var18 = 146;
            var19 = 1;
          }
          if (var10 == 108) {
            var19 = 0;
            var18 = 156;
          }
          if (var10 == 109) {
            var18 = 157;
            var19 = 0;
          }
          if (var10 == 110) {
            var18 = 158;
            var19 = 0;
          }
          if (var10 == 113) {
            var19 = 0;
            var18 = 161;
          }
          if (var10 == 115) {
            var18 = 162;
          }
          if (116 == var10) {
            if (this.getSpellRecharge(116, -102, var12.ownerPlayer) > 0) {
              return;
            }
            var19 = 1;
            var11 = 48;
            var18 = 164;
          }
          if (var10 == 117) {
            var16 = 1;
            var19 = 1;
            var18 = 165;
          }
          if ((130 == var10 ||
            var10 == 127 ||
            128 == var10 ||
            var10 == 129 ||
            var10 == 136 ||
            var10 == 155) &&
            Math.abs(var13) < Math.abs(var14)) {
            var14 = (var14 >= 0) && (var47 == 0) ? (64) : (-64);
            var13 = 64 * var12.facing;
            var15Lifetime1 = ConnectionState.greatestCommonDivisor(var14, var13, false);
          }
          if (var10 == 127) {
            var11 = 48;
            var18 = 91;
            var12.bobPhase = -3.0;
          }
          if (128 == var10) {
            var18 = 92;
            var11 = 48;
            var12.bobPhase = -3.0;
          }
          if (var10 == 129) {
            var12.bobPhase = -3.0;
            var11 = 48;
            var18 = 93;
          }
          if (var10 == 136) {
            var12.bobPhase = -3.0;
            var18 = 113;
            var11 = 48;
          }
          if (var10 == 38 ||
            var10 == 133) {
            var18 = 69;
          }
          if (var10 == 40) {
            var19 = 1;
            var16 = 1;
            var18 = 33;
          }
          if (var10 == 37) {
            var18 = 31;
            var19 = 1;
            var11 = 48;
          }
          if (var10 == 41 ||
            var10 == 134) {
            var18 = 70;
          }
          if (var10 == 43) {
            var18 = 34;
            var19 = 1;
            var17 = 16;
          }
          var17 += 2;
          if (var10 == 130) {
            var18 = 98;
          }
          if (var16 != 0 &&
            !var12.isWithinArena(-1) &&
            !var12.isTower((byte) 113)) {
          }
          var20 = (var12.size / 2 + (var17 + 4)) * var13 / var15Lifetime1;
          var21 = (var12.size / 2 + var17 + 4) * var14 / var15Lifetime1 - var12.size / 2;
          var22 = var11 * var13 / var15Lifetime1;
          var23 = var14 * var11 / var15Lifetime1;
          if (var19 != 0) {
            var21 = var17 * var14 / var15Lifetime1 - var12.size / 2;
            if (var11 < 10) {
              var11 = 10;
            }
            var20 = var13 * var17 / var15Lifetime1;
            var23 = var11 * var14 / var15Lifetime1;
            var22 = var11 * var13 / var15Lifetime1;
          }
          if (var18 >= 0) {
            if (var22 > 0) {
              var12.facing = 1;
            }
            if (var22 <= 0 ||
              var47 != 0) {
              var12.facing = -1;
            }
            boolean decompiledFrameCompleted13 = true;
            boolean decompiledFrameCompleted12 = true;
            if (var18 == 69 ||
              var18 == 70 ||
              var18 == 68 ||
              var18 == 157) {
              var24_ref_mi = (SpellProjectile) (this.projectiles.first(12623));
              while (var24_ref_mi != null) {
                stackIn_312_0 = var18;
                stackIn_312_1 = var24_ref_mi.spellType;
                if (var47 != 0) {
                  decompiledFrameCompleted13 = false;
                  break;
                }
                if (stackIn_312_0 == stackIn_312_1 &&
                  var24_ref_mi.owner == var12) {
                  var24_ref_mi.remove(0);
                }
                var24_ref_mi = (SpellProjectile) (this.projectiles.next(0));
              }
            }
            if (decompiledFrameCompleted13) {
              var24_ref_mi = (SpellProjectile) (this.projectiles.first(12623));
              while (var24_ref_mi != null) {
                stackIn_312_0 = 69;
                stackIn_312_1 = var24_ref_mi.spellType;
                if (var47 != 0) {
                  decompiledFrameCompleted12 = false;
                  break;
                }
                if (stackIn_312_0 == stackIn_312_1) {
                  var24_ref_mi.ageTicks = 0;
                }
                var24_ref_mi = (SpellProjectile) (this.projectiles.next(0));
              }
              if (decompiledFrameCompleted12) {
                this.consumeSpellCharge((byte) 80, var10, var4);
                var24_ref_mi = BevelBoxPainter.createProjectile(var12, var12.y + var21, (byte) 36, this, var10, var12.x + var20, var18);
                var24_ref_mi.velocityY = 8 * var23;
                var24_ref_mi.velocityX = var22 * 8;
                this.onProjectileFinished(52, var24_ref_mi);
                stackIn_312_0 = var18;
                stackIn_312_1 = 119;
              }
            }
            if (stackIn_312_0 != stackIn_312_1 &&
              var18 != 164) {
              this.animating = true;
            }
            var11Lifetime1 = 0;
            if (cameraTarget != null) {
              cameraTarget.followProjectile(var24_ref_mi, -126);
            }
          }
          boolean decompiledFrameCompleted11 = true;
          if (var10 == 119) {
            var24 = 0;
            while (true) {
              stackIn_320_0 = ~this.playerCount;
              if (stackIn_320_0 < ~var24) {
                stackIn_339_0 = 0;
                if (var47 != 0) {
                  decompiledFrameCompleted11 = false;
                  break;
                }
                var25_int = stackIn_339_0;
                while (16 > var25_int) {
                  this.spellRecharge[var24][var25_int] = 0;
                  stackIn_320_0 = ~this.spellSlots[var24][var25_int];
                  if (stackIn_320_0 != 0 &&
                    this.spellSlots[var24][var25_int] < 156 &&
                    this.spellSlots[var24][var25_int] != 119) {
                    this.spellCharges[var24][var25_int] = MouseWheelHandler.field_b[this.spellSlots[var24][var25_int]];
                    if (-1 == this.spellCharges[var24][var25_int]) {
                      this.spellCharges[var24][var25_int] = 1;
                    } else if (0 == this.spellCharges[var24][var25_int]) {
                      this.spellCharges[var24][var25_int] = -1;
                    }
                  } else {
                    this.spellSlots[var24][var25_int] = -1;
                  }
                  var25_int++;
                }
                var24++;
                continue;
              }
              break;
            }
            if (decompiledFrameCompleted11) {
              this.animating = true;
            }
          }
          if (decompiledFrameCompleted11) {
            stackIn_339_0 = 78;
          }
          if (stackIn_339_0 == var10) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_ml = new BattleUnit(12, var8, var9, this.nextUnitId(-111), this, var12);
            this.addUnit((byte) -120, var24_ref_ml);
            var8 = -1000;
            this.animating = true;
          }
          if (var10 == 23) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_mlLifetime1 = new BattleUnit(13, var8, var9, this.nextUnitId(-92), this, var12);
            this.addUnit((byte) -124, var24_ref_mlLifetime1);
            var8 = -1000;
            this.animating = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (118 == var10) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_mlLifetime2 = new BattleUnit(39, var8, var9, this.nextUnitId(-98), this, var12);
            var8 = -1000;
            this.addUnit((byte) -116, var24_ref_mlLifetime2);
            this.animating = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 59) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_mlLifetime3 = new BattleUnit(15, var8, var9, this.nextUnitId(-107), this, var12);
            var8 = -1000;
            this.addUnit((byte) -123, var24_ref_mlLifetime3);
            this.animating = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 47) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_mlLifetime4 = new BattleUnit(14, var8, var9, this.nextUnitId(-119), this, var12);
            var8 = -1000;
            this.addUnit((byte) -120, var24_ref_mlLifetime4);
            this.animating = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 98) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_mlLifetime5 = new BattleUnit(28, -32 + var8, var9, this.nextUnitId(-81), this, var12);
            this.addUnit((byte) -124, var24_ref_mlLifetime5);
            var25 = GameOptionType.spawnProjectile(var24_ref_mlLifetime5, var24_ref_mlLifetime5.y, false, 138, this, var24_ref_mlLifetime5.x);
            this.onProjectileFinished(52, var25);
            var24_ref_mlLifetime5Lifetime1 = new BattleUnit(28, 32 + var8, var9, this.nextUnitId(-98), this, var12);
            this.addUnit((byte) -124, var24_ref_mlLifetime5Lifetime1);
            var25Lifetime20 = GameOptionType.spawnProjectile(var24_ref_mlLifetime5Lifetime1, var24_ref_mlLifetime5Lifetime1.y, false, 138, this, var24_ref_mlLifetime5Lifetime1.x);
            this.onProjectileFinished(52, var25Lifetime20);
            var8 = -1000;
            this.animating = true;
            this.field_ob[var4] = this.field_ob[var4] + 2;
          }
          if (92 == var10) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_mlLifetime6 = new BattleUnit(33, var8 - 32, var9, this.nextUnitId(-113), this, var12);
            this.addUnit((byte) -119, var24_ref_mlLifetime6);
            var24_ref_mlLifetime6Lifetime1 = new BattleUnit(33, var8 + 32, var9, this.nextUnitId(-118), this, var12);
            var8 = -1000;
            this.addUnit((byte) -128, var24_ref_mlLifetime6Lifetime1);
            this.animating = true;
            this.field_ob[var4] = this.field_ob[var4] + 2;
          }
          if (90 == var10) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_mlLifetime7 = new BattleUnit(31, var8, var9, this.nextUnitId(-80), this, var12);
            this.addUnit((byte) -119, var24_ref_mlLifetime7);
            var8 = -1000;
            this.animating = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (107 == var10) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_mlLifetime8 = new BattleUnit(32, var8, var9, this.nextUnitId(-124), this, var12);
            this.addUnit((byte) -128, var24_ref_mlLifetime8);
            var8 = -1000;
            this.animating = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 56) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_mlLifetime9 = new BattleUnit(4, var8, var9, this.nextUnitId(-120), this, var12);
            this.addUnit((byte) -116, var24_ref_mlLifetime9);
            var8 = -1000;
            this.animating = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 112) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_mlLifetime10 = new BattleUnit(37, var8, var9, this.nextUnitId(-93), this, var12);
            var8 = -1000;
            this.addUnit((byte) -118, var24_ref_mlLifetime10);
            this.animating = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (104 == var10) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_mlLifetime11 = new BattleUnit(34, var8, var9, this.nextUnitId(-107), this, var12);
            this.addUnit((byte) -121, var24_ref_mlLifetime11);
            var8 = -1000;
            this.animating = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 64) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_mlLifetime12 = new BattleUnit(6, var8, var9, this.nextUnitId(-122), this, var12);
            this.addUnit((byte) -127, var24_ref_mlLifetime12);
            var8 = -1000;
            this.animating = true;
            var25Lifetime1 = BevelBoxPainter.createProjectile(var24_ref_mlLifetime12, var24_ref_mlLifetime12.y, (byte) 17, this, var10, var24_ref_mlLifetime12.x, 55);
            var25Lifetime1.field_H = 4;
            this.onProjectileFinished(52, var25Lifetime1);
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 44) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_mlLifetime13 = new BattleUnit(25, var8, var9, this.nextUnitId(-122), this, var12);
            var8 = -1000;
            this.addUnit((byte) -119, var24_ref_mlLifetime13);
            this.animating = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 57) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_mlLifetime14 = new BattleUnit(5, var8, var9, this.nextUnitId(-98), this, var12);
            this.addUnit((byte) -120, var24_ref_mlLifetime14);
            var8 = -1000;
            var25Lifetime2 = BevelBoxPainter.createProjectile(var24_ref_mlLifetime14, -480, (byte) -103, this, var10, var8, 71);
            var25Lifetime2.velocityX = 0;
            var25Lifetime2.velocityY = 0;
            this.onProjectileFinished(52, var25Lifetime2);
            this.field_ob[var4] = this.field_ob[var4] + 1;
            this.animating = true;
          }
          if (var10 == 42) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_mlLifetime15 = new BattleUnit(3, var8, var9, this.nextUnitId(-91), this, var12);
            this.addUnit((byte) -115, var24_ref_mlLifetime15);
            var8 = -1000;
            this.animating = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (65 == var10) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_mlLifetime16 = new BattleUnit(7, var8, var9, this.nextUnitId(-82), this, var12);
            this.addUnit((byte) -121, var24_ref_mlLifetime16);
            var8 = -1000;
            this.animating = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 67) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_mlLifetime17 = new BattleUnit(8, var8, var9, this.nextUnitId(-99), this, var12);
            var8 = -1000;
            this.addUnit((byte) -127, var24_ref_mlLifetime17);
            this.animating = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 6) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            this.addUnit((byte) -115, new BattleUnit(11, -32 + var8, var9, this.nextUnitId(-93), this, var12));
            this.addUnit((byte) -120, new BattleUnit(11, var8, var9 - 16, this.nextUnitId(-84), this, var12));
            this.addUnit((byte) -121, new BattleUnit(11, var8 + 32, var9, this.nextUnitId(-120), this, var12));
            var8 = -1000;
            this.animating = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 32) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_mlLifetime18 = new BattleUnit(1, var8, var9, this.nextUnitId(-77), this, var12);
            var8 = -1000;
            this.addUnit((byte) -115, var24_ref_mlLifetime18);
            this.animating = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 33) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_mlLifetime19 = new BattleUnit(2, var8, var9, this.nextUnitId(-78), this, var12);
            var8 = -1000;
            this.addUnit((byte) -120, var24_ref_mlLifetime19);
            this.animating = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 79) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            this.addUnit((byte) -116, new BattleUnit(10, var8 - 32, var9, this.nextUnitId(-76), this, var12));
            this.addUnit((byte) -124, new BattleUnit(10, var8, -16 + var9, this.nextUnitId(-87), this, var12));
            this.addUnit((byte) -127, new BattleUnit(10, var8 + 32, var9, this.nextUnitId(-108), this, var12));
            var8 = -1000;
            this.animating = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 77) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_mlLifetime20 = new BattleUnit(9, var8, var9, this.nextUnitId(-83), this, var12);
            var8 = -1000;
            this.addUnit((byte) -124, var24_ref_mlLifetime20);
            this.animating = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (76 == var10) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_mlLifetime21 = new BattleUnit(17, var8, var9, this.nextUnitId(-112), this, var12);
            var8 = -1000;
            this.addUnit((byte) -118, var24_ref_mlLifetime21);
            this.animating = true;
            this.field_ob[var4] = this.field_ob[var4] + 1;
          }
          if (var10 == 54) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_miLifetime1 = BevelBoxPainter.createProjectile(var12, var12.y, (byte) -106, this, var10, var12.x, 72);
            this.onProjectileFinished(52, var24_ref_miLifetime1);
          }
          if (var10 == 39 ||
            var10 == 153) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_miLifetime2 = BevelBoxPainter.createProjectile(var12, var12.y, (byte) 37, this, var10, var12.x, 32);
            this.onProjectileFinished(52, var24_ref_miLifetime2);
            if (153 == var10) {
              var12.moving = true;
              var12.health = 0;
            }
            this.animating = true;
          }
          if (var10 == 106) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_miLifetime3 = BevelBoxPainter.createProjectile(var12, var12.y, (byte) -110, this, var10, var12.x, 136);
            this.onProjectileFinished(52, var24_ref_miLifetime3);
            this.animating = true;
          }
          if (var10 == 8) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_miLifetime4 = BevelBoxPainter.createProjectile(var12, var12.y, (byte) -97, this, var10, var12.x, 83);
            this.onProjectileFinished(52, var24_ref_miLifetime4);
            this.animating = true;
          }
          if (var10 == 26) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_miLifetime5 = BevelBoxPainter.createProjectile(var12, var12.y, (byte) -113, this, var10, var12.x, 22);
            this.onProjectileFinished(52, var24_ref_miLifetime5);
            this.animating = true;
          }
          if (var10 == 35) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_miLifetime6 = BevelBoxPainter.createProjectile(var12, this.arenaHeight, (byte) -96, this, var10, var8, 29);
            this.onProjectileFinished(52, var24_ref_miLifetime6);
            this.animating = true;
          }
          if (var10 == 73) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_miLifetime7 = BevelBoxPainter.createProjectile(var12, -480, (byte) -96, this, var10, var8, 60);
            this.onProjectileFinished(52, var24_ref_miLifetime7);
            this.animating = true;
          }
          if (120 == var10) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_miLifetime8 = BevelBoxPainter.createProjectile(var12, var12.y, (byte) -101, this, var10, var12.x, 77);
            this.onProjectileFinished(52, var24_ref_miLifetime8);
            this.animating = true;
          }
          if (60 == var10) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var12.unitType = 23;
            var12.initializeAppearance((byte) 6);
            this.refreshTerrainArea(var12.x, 10 + (var12.size >> 1), (byte) 51, -(var12.size >> 1) + (var12.y - 10));
            ChatPanel.stampSpriteMaskColour(this.terrainSprite, -var12.size + var12.y, -(var12.size >> 1) + var12.x, (byte) 0, this, var12.maskSprite, 0);
            this.updateAllUnits((byte) 86);
            var11Lifetime2 = 0;
            this.animating = true;
            var24_ref_miLifetime9 = GameOptionType.spawnProjectile(var12, var12.y - var12.size / 2, false, 103, this, var12.x);
            this.onProjectileFinished(52, var24_ref_miLifetime9);
            var24_ref_miLifetime9Lifetime1 = BevelBoxPainter.createProjectile(var12, -(var12.size / 2) + var12.y, (byte) -107, this, var10, var12.x, 111);
            var24_ref_miLifetime9Lifetime1.field_H = 4;
            this.onProjectileFinished(52, var24_ref_miLifetime9Lifetime1);
          }
          if (var10 == 81) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var12.unitType = 24;
            var12.initializeAppearance((byte) 6);
            this.refreshTerrainArea(var12.x, 10 + (var12.size >> 1), (byte) 51, -10 + (var12.y - (var12.size >> 1)));
            ChatPanel.stampSpriteMaskColour(this.terrainSprite, var12.y - var12.size, var12.x - (var12.size >> 1), (byte) 0, this, var12.maskSprite, 0);
            this.updateAllUnits((byte) 86);
            this.animating = true;
            var11Lifetime3 = 0;
            var24_ref_miLifetime10 = GameOptionType.spawnProjectile(var12, -(var12.size / 2) + var12.y, false, 108, this, var12.x);
            this.onProjectileFinished(52, var24_ref_miLifetime10);
          }
          if (91 == var10) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var12.unitType = 35;
            var12.initializeAppearance((byte) 6);
            this.refreshTerrainArea(var12.x, (var12.size >> 1) + 10, (byte) 51, -10 + (-(var12.size >> 1) + var12.y));
            ChatPanel.stampSpriteMaskColour(this.terrainSprite, -var12.size + var12.y, var12.x - (var12.size >> 1), (byte) 0, this, var12.maskSprite, 0);
            this.updateAllUnits((byte) 86);
            this.animating = true;
            var11Lifetime4 = 0;
            var24_ref_miLifetime11 = GameOptionType.spawnProjectile(var12, var12.y - var12.size / 2, false, 154, this, var12.x);
            this.onProjectileFinished(52, var24_ref_miLifetime11);
          }
          boolean decompiledFrameCompleted10 = true;
          if (var10 == 61) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24Lifetime1 = DisplayNameChangedDialog.log2Floor((var9 + 480) * 32 / 4, -266740663);
            var25_intLifetime1 = -96 + 192 * (1 & var8);
            var26 = 1;
            var27 = 0;
            while (var27 < 7) {
              var26 = -var26;
              var28 = BevelBoxPainter.createProjectile(var12, -544, (byte) 55, this, var10, -(var24Lifetime1 * (var25_intLifetime1 * var26) / 16) + (48 * var27 - 144 + var8), 50);
              var28.velocityX = var26 * var25_intLifetime1;
              var28.velocityY = 0;
              this.onProjectileFinished(52, var28);
              var27++;
              if (var47 != 0) {
                decompiledFrameCompleted10 = false;
                break;
              }
            }
            if (decompiledFrameCompleted10) {
              this.animating = true;
            }
          }
          if (var10 == 68) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_miLifetime12 = BevelBoxPainter.createProjectile(var12, var9, (byte) -104, this, var10, var8, 55);
            this.onProjectileFinished(52, var24_ref_miLifetime12);
            this.animating = true;
          }
          if (var10 == 9) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_miLifetime13 = BevelBoxPainter.createProjectile(var12, -24 + var9, (byte) 121, this, var10, var8, 3);
            this.onProjectileFinished(52, var24_ref_miLifetime13);
            var24_ref_miLifetime13Lifetime1 = BevelBoxPainter.createProjectile(var12, -11 + var9, (byte) -122, this, var10, -8 + var8, 3);
            this.onProjectileFinished(52, var24_ref_miLifetime13Lifetime1);
            var24_ref_miLifetime13Lifetime2 = BevelBoxPainter.createProjectile(var12, var9 - 12, (byte) -114, this, var10, 8 + var8, 3);
            this.onProjectileFinished(52, var24_ref_miLifetime13Lifetime2);
            this.animating = true;
          }
          boolean decompiledFrameCompleted9 = true;
          if (var10 == 7) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            IntKeyLookup.field_d.setDeque((byte) 96, this.units);
            var24_ref_mlLifetime22 = (BattleUnit) (IntKeyLookup.field_d.first(-74));
            while (var24_ref_mlLifetime22 != null) {
              stackIn_456_0 = -12;
              stackIn_456_1 = ~var24_ref_mlLifetime22.unitType;
              if (var47 != 0) {
                decompiledFrameCompleted9 = false;
                break;
              }
              if (stackIn_456_0 == stackIn_456_1) {
                var25Lifetime3 = GameOptionType.spawnProjectile(this.getUnitByOwner(var24_ref_mlLifetime22.ownerPlayer, true), var24_ref_mlLifetime22.y, false, 101, this, var24_ref_mlLifetime22.x);
                this.onProjectileFinished(52, var25Lifetime3);
                var25Lifetime3Lifetime1 = BevelBoxPainter.createProjectile(var12, var24_ref_mlLifetime22.y, (byte) 38, this, var10, var24_ref_mlLifetime22.x, 74);
                var25Lifetime3Lifetime1.ageTicks = -(var24_ref_mlLifetime22.health / 2) + 20;
                var25Lifetime3Lifetime1.velocityX = 0;
                var25Lifetime3Lifetime1.velocityY = -var24_ref_mlLifetime22.health;
                this.onProjectileFinished(52, var25Lifetime3Lifetime1);
                var24_ref_mlLifetime22.health = 0;
                var24_ref_mlLifetime22.updateTurnLogic(var4, 116);
              }
              var24_ref_mlLifetime22 = (BattleUnit) (IntKeyLookup.field_d.next(-18502));
            }
            if (decompiledFrameCompleted9) {
              this.animating = true;
            }
          }
          if (decompiledFrameCompleted9) {
            stackIn_456_0 = -96;
            stackIn_456_1 = ~var10;
          }
          if (stackIn_456_0 == stackIn_456_1) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_miLifetime14 = BevelBoxPainter.createProjectile(var12, var12.y, (byte) 95, this, var10, var12.x, 127);
            this.onProjectileFinished(52, var24_ref_miLifetime14);
            this.animating = true;
          }
          boolean decompiledFrameCompleted8 = true;
          if (var10 == 94) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            IntKeyLookup.field_d.setDeque((byte) 83, this.projectiles);
            var24_ref_miLifetime15 = (SpellProjectile) (IntKeyLookup.field_d.first(-105));
            while (var24_ref_miLifetime15 != null) {
              stackIn_470_0 = ~var24_ref_miLifetime15.spellType;
              stackIn_470_1 = -127;
              if (var47 != 0) {
                decompiledFrameCompleted8 = false;
                break;
              }
              if (stackIn_470_0 == stackIn_470_1) {
                var24_ref_miLifetime15.remove(0);
              }
              if (var24_ref_miLifetime15.spellType == 117) {
                var24_ref_miLifetime15.applyAreaEffect(0, 0, 16, 8);
              }
              var24_ref_miLifetime15 = (SpellProjectile) (IntKeyLookup.field_d.next(-18502));
            }
            if (decompiledFrameCompleted8) {
              var24_ref_miLifetime15Lifetime1 = BevelBoxPainter.createProjectile(var12, 0, (byte) -125, this, var10, var8, 126);
              this.onProjectileFinished(52, var24_ref_miLifetime15Lifetime1);
              this.animating = true;
            }
          }
          if (decompiledFrameCompleted8) {
            stackIn_470_0 = ~var10;
            stackIn_470_1 = -149;
          }
          boolean decompiledFrameCompleted7 = true;
          if (stackIn_470_0 == stackIn_470_1) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            IntKeyLookup.field_d.setDeque((byte) 67, this.projectiles);
            var24_ref_miLifetime16 = (SpellProjectile) (IntKeyLookup.field_d.first(-57));
            while (var24_ref_miLifetime16 != null) {
              stackIn_480_0 = -124;
              stackIn_480_1 = ~var24_ref_miLifetime16.spellType;
              if (var47 != 0) {
                decompiledFrameCompleted7 = false;
                break;
              }
              if (stackIn_480_0 == stackIn_480_1) {
                var24_ref_miLifetime16.remove(0);
              }
              var24_ref_miLifetime16 = (SpellProjectile) (IntKeyLookup.field_d.next(-18502));
            }
            if (decompiledFrameCompleted7) {
              var24_ref_miLifetime16Lifetime1 = BevelBoxPainter.createProjectile(var12, var9, (byte) -105, this, var10, var8, 123);
              this.onProjectileFinished(52, var24_ref_miLifetime16Lifetime1);
              this.animating = true;
            }
          }
          if (decompiledFrameCompleted7) {
            stackIn_480_0 = -94;
            stackIn_480_1 = ~var10;
          }
          boolean decompiledFrameCompleted6 = true;
          if (stackIn_480_0 == stackIn_480_1) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            IntKeyLookup.field_d.setDeque((byte) 40, this.projectiles);
            var24Lifetime2 = 0;
            var25Lifetime4 = (SpellProjectile) (IntKeyLookup.field_d.first(-83));
            while (var25Lifetime4 != null) {
              stackIn_524_0 = var25Lifetime4.spellType;
              stackIn_524_1 = 123;
              if (var47 != 0) {
                decompiledFrameCompleted6 = false;
                break;
              }
              if (stackIn_524_0 == stackIn_524_1) {
                var25Lifetime4.remove(0);
              }
              var25Lifetime4 = (SpellProjectile) (IntKeyLookup.field_d.next(-18502));
            }
            if (decompiledFrameCompleted6) {
              IntKeyLookup.field_d.setDeque((byte) 69, this.units);
              var25_ref = (BattleUnit) (IntKeyLookup.field_d.first(-50));
              while (true) {
                if (var25_ref != null) {
                  stackIn_522_0 = -34;
                  stackIn_522_1 = ~var25_ref.unitType;
                  if (var47 == 0) {
                    if (stackIn_522_0 == stackIn_522_1) {
                      var14Lifetime1 = (var9 - var25_ref.y << 4) + 256;
                      var13Lifetime1 = -var25_ref.x + var8 << 4;
                      var26_double = 64.0;
                      var28_double = (double)(var13Lifetime1 * (4 * var13Lifetime1)) / (var26_double * (var26_double * 2.0));
                      var30 = (double)var13Lifetime1;
                      var32 = (double)(var13Lifetime1 * var13Lifetime1 * 4) / (var26_double * (2.0 * var26_double)) - (double)var14Lifetime1;
                      while (true) {
                        if (0.0 != var28_double) {
                          stackIn_501_0 = compareDoublesNanLess(0.0, var30 * var30 - var32 * (var28_double * 4.0));
                          if (stackIn_501_0 > 0 &&
                            768.0 > var26_double) {
                            var26_double = var26_double + 8.0;
                            var28_double = (double)(var13Lifetime1 * var13Lifetime1 * 4) / (2.0 * var26_double * var26_double);
                            var30 = (double)var13Lifetime1;
                            var32 = (double)(-var14Lifetime1) + (double)(var13Lifetime1 * (4 * var13Lifetime1)) / (var26_double * (2.0 * var26_double));
                            continue;
                          }
                        }
                        stackIn_501_0Lifetime1 = compareDoublesNanLess(var28_double, 0.0);
                        if (stackIn_501_0Lifetime1 == 0) {
                          break;
                        }
                        if (!(0.0 <= var30 * var30 - var28_double * 4.0 * var32)) {
                          break;
                        }
                        var34 = (Math.sqrt(-(var32 * (var28_double * 4.0)) + var30 * var30) + -var30) / (var28_double * 2.0);
                        var36 = (-var30 - Math.sqrt(-(var28_double * 4.0 * var32) + var30 * var30)) / (var28_double * 2.0);
                        if (Math.abs(var34) > Math.abs(var36)) {
                          var34 = var36;
                        }
                        var38 = var26_double * var26_double / (1.0 + var34 * var34);
                        var40 = var26_double * var26_double / (1.0 / (var34 * var34) + 1.0);
                        var42 = (int)Math.sqrt(var38);
                        var43 = (int)Math.sqrt(var40);
                        if (var42 > 0 &&
                          var13Lifetime1 < 0) {
                          var42 = -var42;
                        }
                        if (!(0.0 < var34)) {
                          if (var13Lifetime1 > 0) {
                            var43 = -var43;
                          }
                        } else {
                          if (0 > var13Lifetime1) {
                            var43 = -var43;
                          }
                        }
                        var44 = (int)((double)((4 + (var25_ref.size / 2 + var17)) * var42) / var26_double + (double)var25_ref.x);
                        var45 = (int)((double)(-(var12.size / 2)) + ((double)(var43 * (var17 + (var25_ref.size / 2 + 4))) / var26_double + (double)var25_ref.y));
                        var46 = BevelBoxPainter.createProjectile(this.getUnitByOwner(var25_ref.ownerPlayer, true), var45, (byte) -95, this, var10, var44, 125);
                        this.onProjectileFinished(52, var46);
                        var46.ageTicks = 10;
                        if (this.playerSpellbook[var25_ref.ownerPlayer] == 6) {
                          var46.ageTicks = var46.ageTicks - this.field_X[var25_ref.ownerPlayer] / 2;
                          if (this.field_X[var25_ref.ownerPlayer] == 100) {
                            var24Lifetime2++;
                          }
                        }
                        var46.velocityX = var42;
                        var46.velocityY = var43;
                        break;
                      }
                    }
                    var25_ref = (BattleUnit) (IntKeyLookup.field_d.next(-18502));
                    continue;
                  }
                } else {
                  this.animating = true;
                  stackIn_522_0 = var24Lifetime2;
                  stackIn_522_1 = 4;
                }
                break;
              }
            }
          }
          if (decompiledFrameCompleted6) {
            stackIn_524_0 = -71;
            stackIn_524_1 = ~var10;
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameCompleted5 = true;
          if (stackIn_524_0 == stackIn_524_1) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            IntKeyLookup.field_d.setDeque((byte) 99, this.units);
            var24_ref_mlLifetime23 = (BattleUnit) (IntKeyLookup.field_d.first(-113));
            while (var24_ref_mlLifetime23 != null) {
              stackIn_541_0 = var24_ref_mlLifetime23.linkedUnit;
              if (var47 != 0) {
                decompiledFrameCompleted5 = false;
                break;
              }
              if (stackIn_541_0 != null &&
                !var24_ref_mlLifetime23.field_U &&
                var24_ref_mlLifetime23.unitType != 12) {
                var25Lifetime5 = GameOptionType.spawnProjectile(this.getUnitByOwner(var24_ref_mlLifetime23.ownerPlayer, true), var24_ref_mlLifetime23.y, false, 103, this, var24_ref_mlLifetime23.x);
                this.onProjectileFinished(52, var25Lifetime5);
                var25Lifetime5Lifetime1 = BevelBoxPainter.createProjectile(var12, var24_ref_mlLifetime23.y, (byte) 40, this, var10, var24_ref_mlLifetime23.x, 55);
                this.onProjectileFinished(52, var25Lifetime5Lifetime1);
                var24_ref_mlLifetime23.health = 0;
                var24_ref_mlLifetime23.updateTurnLogic(var4, 24);
              }
              var24_ref_mlLifetime23 = (BattleUnit) (IntKeyLookup.field_d.next(-18502));
            }
            if (decompiledFrameCompleted5) {
              this.animating = true;
            }
          }
          if (decompiledFrameCompleted5) {
            if (83 == var10) {
              this.consumeSpellCharge((byte) 80, var10, var4);
              var12.velocityY = -50;
              var12.unitType = 18;
              var12.moving = true;
              var24_ref_miLifetime17 = GameOptionType.spawnProjectile(var12, var12.y - (var12.size >> 1), false, 108, this, var12.x);
              this.onProjectileFinished(52, var24_ref_miLifetime17);
              this.animating = true;
            }
            decompiledFrameRemainder1 = (var10 == 71);
            if (decompiledFrameRemainder1) {
              this.consumeSpellCharge((byte) 80, var10, var4);
              var12.field_U = true;
              var12.unitType = 16;
              stackIn_541_0 = var12;
            }
          }
          if (decompiledFrameRemainder1) {
            if (stackIn_541_0.field_I != null) {
              var12.field_I.makeRasterTarget();
              SoftwareRasterizer.fillRectangle(0, 0, var12.field_I.field_n, var12.field_I.field_w, 0);
              if (null != QuickChatPhrase.field_x) {
                var48 = new int[]{255, 0, 0};
                var24_ref_int__ = var48;
                var49 = new int[]{0, 255, 0};
                var25_array = var49;
                var50 = new int[]{0, 0, 255};
                var26_ref_int__ = var50;
                var51 = new int[]{255, 255, 255};
                var27_ref_int__ = var51;
                var28_int = var12.ownerPlayer;
                if (0 == var28_int ||
                  var28_int == 3 ||
                  var28_int == 4) {
                  var48[1] = 255;
                  var48[2] = 255;
                }
                if (var28_int == 1 ||
                  var28_int == 3 ||
                  var28_int == 5) {
                  var49[2] = 255;
                  var49[0] = 255;
                }
                if (var28_int == 2 ||
                  4 == var28_int ||
                  var28_int == 5) {
                  var50[0] = 255;
                  var50[2] = 255;
                }
                if (this.field_N != null) {
                  var24_ref_int__[0] = this.field_N[var28_int][0];
                  var24_ref_int__[1] = this.field_N[var28_int][1];
                  var24_ref_int__[2] = this.field_N[var28_int][2];
                  var25_array[0] = this.field_N[var28_int][3];
                  var25_array[1] = this.field_N[var28_int][4];
                  var25_array[2] = this.field_N[var28_int][5];
                  var26_ref_int__[0] = this.field_N[var28_int][6];
                  var26_ref_int__[1] = this.field_N[var28_int][7];
                  var26_ref_int__[2] = this.field_N[var28_int][8];
                  var27_ref_int__[0] = this.field_N[var28_int][9];
                  var27_ref_int__[1] = this.field_N[var28_int][10];
                  var27_ref_int__[2] = this.field_N[var28_int][11];
                }
                var29 = new Sprite(64, 96);
                var29.makeRasterTarget();
                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var50, 16, var51, var48, 80, var49, QuickChatPhrase.field_x[2], 0);
                var12.field_I.normalizeCanvas();
                var12.field_I.makeRasterTarget();
                SoftwareRasterizer.fillRectangle(0, 0, 32, 48, 0);
                var29.drawCenteredRotatedScaledBilinear(16, 24, 0, 2048);
                var12.field_I.trimTransparentBorders();
              }
            }
            var24_ref_miLifetime17Lifetime1 = BevelBoxPainter.createProjectile(var12, var12.y, (byte) 32, this, var10, var12.x, 111);
            var24_ref_miLifetime17Lifetime1.field_H = 4;
            this.onProjectileFinished(52, var24_ref_miLifetime17Lifetime1);
            var24_ref_miLifetime17Lifetime2 = GameOptionType.spawnProjectile((BattleUnit) null, var12.y - var12.size / 2, false, 103, this, var12.x);
            this.onProjectileFinished(52, var24_ref_miLifetime17Lifetime2);
            this.animating = true;
          }
          if (45 == var10) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var12.moving = true;
            var12.velocityY = -50;
            var12.unitType = 19;
          }
          if (var10 == 58) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24Lifetime3 = DisplayNameChangedDialog.log2Floor((480 + var9) * 32 / 4, -266740663);
            var25_intLifetime2 = -96 + (var8 & 1) * 192;
            var26_ref_mi = BevelBoxPainter.createProjectile(var12, -544, (byte) -128, this, var10, var8 - var24Lifetime3 * var25_intLifetime2 / 16, 49);
            var26_ref_mi.velocityX = var25_intLifetime2;
            var26_ref_mi.velocityY = 0;
            this.onProjectileFinished(52, var26_ref_mi);
            this.animating = true;
          }
          if (var10 == 17) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_miLifetime18 = BevelBoxPainter.createProjectile(var12, var9, (byte) 103, this, var10, var8, 15);
            this.onProjectileFinished(52, var24_ref_miLifetime18);
            this.animating = true;
          }
          if (var10 == 34) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24Lifetime4 = DisplayNameChangedDialog.log2Floor((var9 + 480) * 32 / 4, -266740663);
            var25_intLifetime3 = (1 & var8) * 192 - 96;
            var26_ref_miLifetime1 = BevelBoxPainter.createProjectile(var12, -544, (byte) -119, this, var10, var8 - var24Lifetime4 * var25_intLifetime3 / 16, 28);
            var26_ref_miLifetime1.velocityX = var25_intLifetime3;
            var26_ref_miLifetime1.velocityY = 0;
            this.onProjectileFinished(52, var26_ref_miLifetime1);
            this.animating = true;
          }
          boolean decompiledFrameCompleted4 = true;
          if (var10 == 20) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24Lifetime5 = DisplayNameChangedDialog.log2Floor((var9 + 480) * 32 / 4, -266740663);
            var25_intLifetime4 = (1 & var8) * 192 - 96;
            var26Lifetime1 = 5;
            if (0 == this.playerSpellbook[var4]) {
              var26Lifetime1 = var26Lifetime1 + this.field_X[var4] / 40;
            }
            var27Lifetime1 = 0;
            while (var26Lifetime1 > var27Lifetime1) {
              var28Lifetime1 = BevelBoxPainter.createProjectile(var12, -544, (byte) -94, this, var10, -(var24Lifetime5 * var25_intLifetime4 / 16) + (64 * var27Lifetime1 - 128 + var8), 17);
              var28Lifetime1.velocityX = var25_intLifetime4;
              var28Lifetime1.velocityY = 0;
              this.onProjectileFinished(52, var28Lifetime1);
              var27Lifetime1++;
              if (var47 != 0) {
                decompiledFrameCompleted4 = false;
                break;
              }
            }
            if (decompiledFrameCompleted4) {
              this.animating = true;
            }
          }
          boolean decompiledFrameCompleted3 = true;
          if (var10 == 105) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24Lifetime6 = DisplayNameChangedDialog.log2Floor((15360 + var9 * 32) / 4, -266740663);
            var25_intLifetime5 = -96 + 192 * (var8 & 1);
            var26Lifetime2 = 0;
            while (var26Lifetime2 < 5) {
              var27_ref_mi = BevelBoxPainter.createProjectile(var12, -544, (byte) 17, this, var10, var8 - (192 - 96 * var26Lifetime2) - var24Lifetime6 * var25_intLifetime5 / 16, 143);
              var27_ref_mi.velocityX = var25_intLifetime5;
              var27_ref_mi.velocityY = 0;
              this.onProjectileFinished(52, var27_ref_mi);
              var26Lifetime2++;
              if (var47 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
            }
            if (decompiledFrameCompleted3) {
              this.animating = true;
            }
          }
          boolean decompiledFrameCompleted2 = true;
          if (var10 == 21) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24Lifetime7 = DisplayNameChangedDialog.log2Floor(32 * (var9 + 480) / 4, -266740663);
            var25_intLifetime6 = -96 + 192 * (1 & var8);
            var26Lifetime3 = 5;
            if (this.playerSpellbook[var4] == 0) {
              var26Lifetime3 = var26Lifetime3 + this.field_X[var4] / 40;
            }
            var27Lifetime2 = 0;
            while (var26Lifetime3 > var27Lifetime2) {
              var28Lifetime2 = BevelBoxPainter.createProjectile(var12, -544, (byte) -128, this, var10, var8 - (-(64 * (-2 + var27Lifetime2)) + var25_intLifetime6 * var24Lifetime7 / 16), 18);
              this.onProjectileFinished(52, var28Lifetime2);
              var27Lifetime2++;
              if (var47 != 0) {
                decompiledFrameCompleted2 = false;
                break;
              }
            }
            if (decompiledFrameCompleted2) {
              this.animating = true;
            }
          }
          if (var10 == 22) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_miLifetime19 = BevelBoxPainter.createProjectile(var12, this.arenaHeight, (byte) -109, this, var10, var8, 19);
            var24_ref_miLifetime19.velocityY = 0;
            var24_ref_miLifetime19.velocityX = 0;
            this.onProjectileFinished(52, var24_ref_miLifetime19);
            this.animating = true;
          }
          if (var10 == 75) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_miLifetime20 = BevelBoxPainter.createProjectile(var12, -480, (byte) -98, this, var10, var8, 62);
            var24_ref_miLifetime20.velocityX = 0;
            var24_ref_miLifetime20.velocityY = 0;
            this.onProjectileFinished(52, var24_ref_miLifetime20);
            this.animating = true;
          }
          if (var10 == 53) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var24_ref_miLifetime21 = BevelBoxPainter.createProjectile(var12, -480, (byte) 30, this, var10, var8, 47);
            var24_ref_miLifetime21.velocityX = 0;
            var24_ref_miLifetime21.velocityY = 0;
            this.onProjectileFinished(52, var24_ref_miLifetime21);
            this.animating = true;
          }
          var24Lifetime8 = -115 % ((obfuscationGuard + 53) / 37);
          if (var10 == 100) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var25Lifetime6 = BevelBoxPainter.createProjectile(var12, -480, (byte) -120, this, var10, var8, 141);
            var25Lifetime6.velocityX = 0;
            var25Lifetime6.velocityY = 0;
            this.onProjectileFinished(52, var25Lifetime6);
            this.animating = true;
          }
          if (111 == var10) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var25Lifetime7 = BevelBoxPainter.createProjectile(var12, -480, (byte) 124, this, var10, var8, 160);
            var25Lifetime7.velocityY = 0;
            var25Lifetime7.velocityX = 0;
            this.onProjectileFinished(52, var25Lifetime7);
            this.animating = true;
          }
          if (var10 == 101) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var25Lifetime8 = BevelBoxPainter.createProjectile(var12, -480, (byte) 118, this, var10, var8, 142);
            var25Lifetime8.velocityX = 0;
            var25Lifetime8.velocityY = 0;
            this.onProjectileFinished(52, var25Lifetime8);
            this.animating = true;
          }
          if (var10 == 97) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var25Lifetime9 = BevelBoxPainter.createProjectile(var12, this.arenaHeight, (byte) -93, this, var10, var8, 134);
            var25Lifetime9.velocityX = 0;
            var25Lifetime9.velocityY = 0;
            this.onProjectileFinished(52, var25Lifetime9);
            this.animating = true;
          }
          if (46 == var10) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var25Lifetime10 = BevelBoxPainter.createProjectile(var12, -480, (byte) 29, this, var10, var8, 36);
            var25Lifetime10.velocityY = 0;
            var25Lifetime10.velocityX = 0;
            this.onProjectileFinished(52, var25Lifetime10);
            this.animating = true;
          }
          boolean decompiledFrameCompleted1 = true;
          if (var10 == 5) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var25Lifetime11 = GameOptionType.spawnProjectile(var12, var9, false, 101, this, var8);
            this.onProjectileFinished(52, var25Lifetime11);
            var25Lifetime11Lifetime1 = GameOptionType.spawnProjectile(var12, -32 - var12.size + var12.y, false, 101, this, var12.x);
            this.onProjectileFinished(52, var25Lifetime11Lifetime1);
            var25Lifetime11Lifetime2 = (SpellProjectile) (this.projectiles.first(12623));
            while (var25Lifetime11Lifetime2 != null) {
              stackIn_631_0 = var25Lifetime11Lifetime2.spellType;
              stackIn_631_1 = 149;
              if (var47 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_631_0 == stackIn_631_1 &&
                var12 == var25Lifetime11Lifetime2.owner) {
                var25Lifetime11Lifetime2.remove(0);
              }
              var25Lifetime11Lifetime2 = (SpellProjectile) (this.projectiles.next(0));
            }
            if (decompiledFrameCompleted1) {
              var25Lifetime11Lifetime3 = BevelBoxPainter.createProjectile(var12, -32 + (var12.y - var12.size), (byte) 29, this, var10, var12.x, 149);
              var25Lifetime11Lifetime3.velocityY = -var12.y - (-var12.size - 32) + var9;
              var25Lifetime11Lifetime3.velocityX = var8 - var12.x;
              this.onProjectileFinished(52, var25Lifetime11Lifetime3);
              this.animating = true;
            }
          }
          if (decompiledFrameCompleted1) {
            stackIn_631_0 = var10;
            stackIn_631_1 = 4;
          }
          if (stackIn_631_0 == stackIn_631_1) {
            if (var12.y >= this.arenaHeight) {
              var25_intLifetime7 = this.getSpellCharges(4, var4, -770226943);
              if (0 >= var25_intLifetime7) {
                var26Lifetime4 = var12.health / 3;
                if (5 > var26Lifetime4) {
                  var26Lifetime4 = 5;
                }
                var12.health = var12.health - var26Lifetime4;
                if (var12.health < 1) {
                  var12.health = 1;
                }
              }
            }
            var25Lifetime12 = GameOptionType.spawnProjectile(var12, var9, false, 101, this, var8);
            this.onProjectileFinished(52, var25Lifetime12);
            var25Lifetime12Lifetime1 = GameOptionType.spawnProjectile(var12, var12.y, false, 101, this, var12.x);
            this.onProjectileFinished(52, var25Lifetime12Lifetime1);
            this.consumeSpellCharge((byte) 80, var10, var4);
            this.eraseUnitMask(var12, 0);
            if (var12.unitType != 20) {
              var12.field_q = 0;
              if (var12.isTower((byte) 111)) {
                var12.y = var12.y - var12.size / 2;
                var12.field_q = 0;
                var12.size = 32;
                var12.subpixelY = var12.y << 4;
                var12.unitType = 0;
                var12.maskSprite = new Sprite(var12.size, var12.size);
                var12.maskSprite.makeRasterTarget();
                SoftwareRasterizer.fillCircle(var12.size >> 1, var12.size >> 1, var12.size >> 1, 16777215);
              }
              if (var12.unitType == 19) {
                var12.unitType = 0;
              }
            }
            var12.y = var9;
            var12.x = var8;
            var11Lifetime5 = 0;
            var12.moving = true;
            this.animating = true;
            var12.subpixelY = var12.y << 4;
            var12.velocityY = 0;
            var12.subpixelX = var12.x << 4;
            var12.velocityX = 0;
          }
          if (var10 == 150) {
            var25Lifetime13 = GameOptionType.spawnProjectile(var12, var12.y, false, 137, this, var8);
            this.onProjectileFinished(52, var25Lifetime13);
            var25Lifetime13Lifetime1 = GameOptionType.spawnProjectile(var12, var12.y, false, 137, this, var12.x);
            this.onProjectileFinished(52, var25Lifetime13Lifetime1);
            this.consumeSpellCharge((byte) 80, var10, var4);
            this.eraseUnitMask(var12, 0);
            if (var12.isAirborneOrHovering(32) &&
              var12.linkedUnit.field_q <= 0) {
              this.eraseUnitMask(var12.linkedUnit, 0);
              var13Lifetime2 = -var12.x + var12.linkedUnit.x;
              var14Lifetime2 = -(var12.linkedUnit.size / 2) + (var12.linkedUnit.y - var12.y + var12.size / 2);
              if (var13Lifetime2 * var13Lifetime2 + var14Lifetime2 * var14Lifetime2 < (var12.size + var12.linkedUnit.size) * (var12.size + var12.linkedUnit.size) >> 2) {
                var12.linkedUnit.subpixelY = var12.subpixelY - (var12.size << 3);
                var12.linkedUnit.subpixelX = (var8 << 4) - var12.facing * (var12.size << 1);
                if (32 < var12.linkedUnit.size) {
                  var12.linkedUnit.subpixelY = var12.linkedUnit.subpixelY + 192;
                  var12.linkedUnit.subpixelX = var12.linkedUnit.subpixelX + 0 * var12.facing;
                }
                var12.y = var12.subpixelY >> 4;
                var12.x = var12.subpixelX >> 4;
                var12.linkedUnit.facing = var12.facing;
                var12.linkedUnit.y = var12.linkedUnit.subpixelY >> 4;
                var12.linkedUnit.x = var12.linkedUnit.subpixelX >> 4;
              }
            }
            var12.x = var8;
            var12.y = this.arenaHeight;
            var12.moving = true;
            var12.velocityY = 0;
            this.animating = true;
            var12.velocityX = 0;
            var12.subpixelY = var12.y << 4;
            var12.subpixelX = var12.x << 4;
            var11Lifetime6 = 0;
          }
          if (var10 == 139) {
            var12.health = 0;
            var12.pendingDamage = 1;
            var25Lifetime14 = GameOptionType.spawnProjectile(var12, var12.y, false, 101, this, var12.x);
            this.onProjectileFinished(52, var25Lifetime14);
            var25Lifetime14.applyAreaEffect(0, 0, 32, 8);
          }
          if (var10 == 152) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var12.moving = true;
            var12.unitType = 0;
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          if (var10 == 132) {
            var25Lifetime15 = GameOptionType.spawnProjectile(var12, var12.y, false, 108, this, var12.x);
            this.onProjectileFinished(52, var25Lifetime15);
            var26Lifetime5 = var12.x;
            var27Lifetime3 = var12.y;
            if (var26Lifetime5 < 96) {
              var26Lifetime5 = 96;
            }
            if (var27Lifetime3 < 128) {
              var27Lifetime3 = 128;
            }
            if ((this.arenaWidth - 96) < var26Lifetime5) {
              var26Lifetime5 = this.arenaWidth - 96;
            }
            var25Lifetime15.x = var26Lifetime5;
            var25Lifetime15.y = var27Lifetime3;
            var25Lifetime15.applyAreaEffect(0, 0, 64, 8);
            var25Lifetime15.x = var12.x;
            var25Lifetime15.y = var12.y;
            IntKeyLookup.field_d.setDeque((byte) 83, this.units);
            var28_ref = (BattleUnit) (IntKeyLookup.field_d.first(-44));
            while (var28_ref != null) {
              stackIn_689_0 = var28_ref;
              stackIn_689_1 = var12;
              if (var47 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_689_0 != stackIn_689_1 &&
                var28_ref.ownerPlayer == var4 &&
                12 != var28_ref.unitType) {
                var14Lifetime3 = var28_ref.y - var9;
                var13Lifetime3 = var28_ref.x - var8;
                if (Math.abs(var13Lifetime3) < 64 &&
                  Math.abs(var14Lifetime3) < 64) {
                  if (var28_ref.unitType != 20) {
                    var28_ref.field_q = 0;
                  }
                  this.eraseUnitMask(var28_ref, 0);
                  var28_ref.x = var13Lifetime3 + var26Lifetime5;
                  var28_ref.y = var14Lifetime3 + var27Lifetime3;
                  var28_ref.moving = true;
                  var28_ref.subpixelX = var28_ref.x << 4;
                  var28_ref.subpixelY = var28_ref.y << 4;
                }
              }
              var28_ref = (BattleUnit) (IntKeyLookup.field_d.next(-18502));
            }
            if (decompiledFrameCompleted0) {
              this.animating = true;
              var12.health = 0;
              var12.pendingDamage = 1;
            }
          }
          if ((decompiledFrameCompleted0) &&
            (decompiledFrameRemainder0 = (var10 == 154))) {
            stackIn_689_0 = var12;
            stackIn_689_1 = var12;
          }
          if (decompiledFrameRemainder0) {
            var25Lifetime15Lifetime1 = GameOptionType.spawnProjectile(stackIn_689_0, stackIn_689_1.y, false, 86, this, var12.x);
            this.onProjectileFinished(52, var25Lifetime15Lifetime1);
            this.eraseUnitMask(var12.linkedUnit, 0);
            if (var12.linkedUnit.getY((byte) -3) > this.arenaHeight) {
              this.animating = true;
            }
            var12.linkedUnit.subpixelY = var12.subpixelY;
            var12.linkedUnit.x = var12.x;
            var12.moving = true;
            var12.linkedUnit.y = var12.y;
            var12.linkedUnit.subpixelX = var12.subpixelX;
            var12.linkedUnit.moving = true;
            var12.pendingDamage = 1;
            var12.health = 0;
          }
          if (var10 == 2) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var12.unitType = 20;
            var12.initializeAppearance((byte) 6);
            this.refreshTerrainArea(var12.x, 10 + (var12.size >> 1), (byte) 51, var12.y + (-(var12.size >> 1) - 10));
            ChatPanel.stampSpriteMaskColour(this.terrainSprite, var12.y - var12.size, -(var12.size >> 1) + var12.x, (byte) 0, this, var12.maskSprite, 0);
            this.updateAllUnits((byte) 86);
            var11Lifetime7 = 0;
            this.animating = true;
            var25Lifetime16 = GameOptionType.spawnProjectile(var12, -(var12.size / 2) + var12.y, false, 101, this, var12.x);
            this.onProjectileFinished(52, var25Lifetime16);
          }
          if (var10 == 114) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var12.unitType = 38;
            var12.initializeAppearance((byte) 6);
            this.refreshTerrainArea(var12.x, (var12.size >> 1) + 10, (byte) 51, -10 + (-(var12.size >> 1) + var12.y));
            ChatPanel.stampSpriteMaskColour(this.terrainSprite, var12.y - var12.size, -(var12.size >> 1) + var12.x, (byte) 0, this, var12.maskSprite, 0);
            this.updateAllUnits((byte) 86);
            var11Lifetime8 = 0;
            this.animating = true;
            var25Lifetime17 = GameOptionType.spawnProjectile(var12, -(var12.size / 2) + var12.y, false, 86, this, var12.x);
            this.onProjectileFinished(52, var25Lifetime17);
          }
          if (55 == var10) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var12.unitType = 22;
            var12.initializeAppearance((byte) 6);
            this.refreshTerrainArea(var12.x, 10 + (var12.size >> 1), (byte) 51, var12.y + (-(var12.size >> 1) - 10));
            ChatPanel.stampSpriteMaskColour(this.terrainSprite, -var12.size + var12.y, -(var12.size >> 1) + var12.x, (byte) 0, this, var12.maskSprite, 0);
            this.updateAllUnits((byte) 86);
            var11Lifetime9 = 0;
            this.animating = true;
            var25Lifetime18 = GameOptionType.spawnProjectile(var12, var12.y - var12.size / 2, false, 94, this, var12.x);
            this.onProjectileFinished(52, var25Lifetime18);
          }
          if (var10 == 31) {
            this.consumeSpellCharge((byte) 80, var10, var4);
            var12.unitType = 21;
            var12.initializeAppearance((byte) 6);
            this.refreshTerrainArea(var12.x, 10 + (var12.size >> 1), (byte) 51, -(var12.size >> 1) + var12.y - 10);
            ChatPanel.stampSpriteMaskColour(this.terrainSprite, var12.y - var12.size, -(var12.size >> 1) + var12.x, (byte) 0, this, var12.maskSprite, 0);
            this.updateAllUnits((byte) 86);
            this.animating = true;
            var11Lifetime10 = 0;
            var25Lifetime19 = GameOptionType.spawnProjectile(var12, var12.y - var12.size / 2, false, 89, this, var12.x);
            this.onProjectileFinished(52, var25Lifetime19);
          }
          if (30 == var10) {
            this.stampSpriteMask(false, var8 - (ByteStorage.field_e.field_n >> 1), this.terrainSprite, true, var9 - ByteStorage.field_e.field_w, ByteStorage.field_e);
            this.carveTerrainWithSprite(-(ByteStorage.field_e.field_n >> 1) + var8, (byte) -91, -ByteStorage.field_e.field_w + var9, this.terrainMask, ByteStorage.field_e);
            this.animating = true;
          }
          this.field_mb = var8;
          this.field_t = var9;
          if (var10 != 116 &&
            var10 != 87 &&
            var10 != 45 &&
            54 != var10 &&
            var10 != 154 &&
            var10 != 139 &&
            var10 != 152 &&
            !this.animating) {
            throw new IllegalStateException();
          }
          this.clearProjectiles((byte) 99);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_717_0 = var3_ref;
          stackIn_717_1 = new StringBuilder().append("nf.BB(").append(obfuscationGuard).append(',');
          if (cameraTarget == null) {
            stackIn_718_2 = "null";
          } else {
            stackIn_718_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_717_0), ((StringBuilder) (Object) stackIn_717_1).append(stackIn_718_2).append(')').toString());
        }
    }

    private final int[] generateTwentyPointProfile(byte obfuscationGuard, IsaacRandom random) {
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_24_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int[] stackIn_48_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var15 = new int[20];
          var14 = var15;
          var13 = var14;
          var5 = var13;
          var6 = -87 / ((obfuscationGuard - 75) / 49);
          var7 = 0;
          do {
            if (var7 >= -1 + var15.length) {
              var13[1 + ScreenDisplayMode.randomBelow(random, var15.length - 2, (byte) -26)] = 32 + this.arenaHeight;
              var13[ScreenDisplayMode.randomBelow(random, var15.length - 2, (byte) -111) + 1] = this.arenaHeight + 32;
              var13[ScreenDisplayMode.randomBelow(random, -2 + var15.length, (byte) -111) + 1] = this.arenaHeight + 32;
              var13[1 + ScreenDisplayMode.randomBelow(random, var15.length - 2, (byte) -81)] = 32 + this.arenaHeight;
              var13[0] = this.arenaHeight + 64;
              break;
            }
            var13[var7] = 7 * this.arenaHeight / 8 - ScreenDisplayMode.randomBelow(random, this.arenaHeight * 2 / 8, (byte) -25);
            var7++;
          } while (var12 == 0);
          var13[-1 + var15.length] = var15[0];
          while (true) {
            stackIn_9_0 = this.arenaWidth / 64;
            stackIn_9_1 = var5.length;
            if (stackIn_9_0 > stackIn_9_1) {
              var3_int = 100;
              stackIn_24_0 = ~var5.length;
              if (var12 == 0) {
                if (stackIn_24_0 < ~(this.arenaWidth / 8)) {
                  var3_int = 5;
                }
                var6_ref_int__ = new int[1 + (var5.length - 1) * 2];
                var6_ref_int__[0] = var5[0];
                var7 = 1;
                while (var7 < var5.length) {
                  var4 = (5 + Math.abs(-var5[var7] + var5[-1 + var7])) * var3_int / 100;
                  stackIn_9_0 = this.arenaHeight / 2;
                  stackIn_9_1 = var5[var7];
                  if (stackIn_9_0 < stackIn_9_1) {
                    var4 = 2 * this.arenaHeight / var5.length;
                  }
                  stackIn_20_0 = var6_ref_int__;
                  stackIn_20_1 = var7 * 2 - 1;
                  stackIn_20_2 = -var4 + (var5[-1 + var7] + var5[var7]) >> 1;
                  if (var4 == 0) {
                    stackIn_21_3 = 0;
                  } else {
                    stackIn_21_3 = ScreenDisplayMode.randomBelow(random, var4, (byte) -62);
                  }
                  stackIn_20_0[stackIn_20_1] = stackIn_20_2 + stackIn_21_3;
                  var6_ref_int__[2 * var7] = var5[var7];
                  var7++;
                }
                var5 = var6_ref_int__;
                continue;
              }
            } else {
              this.rasterizeTerrainProfile(var5, (byte) -109);
              stackIn_24_0 = 0;
            }
            var6 = stackIn_24_0;
            var7 = 0;
            scanLoop1: while (true) {
              var7++;
              var8 = ScreenDisplayMode.randomBelow(random, this.arenaWidth, (byte) -36);
              var9 = 2;
              var10 = var8 + this.arenaWidth * var9;
              scanLoop2: while (true) {
                if (this.arenaHeight > var9) {
                  stackIn_36_0 = ~MatchingFieldValidator.field_y.field_m[var10];
                  stackIn_36_1 = -1;
                  if (var12 != 0) {
                    break scanLoop2;
                  }
                  if (stackIn_36_0 == stackIn_36_1) {
                    var10 = var10 + this.arenaWidth;
                    var9++;
                    var8 = var8 + (-1 + var7 % 3);
                    var10 = var10 + (-1 + var7 % 3);
                    if (var8 < 0) {
                      var8 = var8 + this.arenaWidth;
                      var10 = var10 + this.arenaWidth;
                    }
                    if (this.arenaWidth > var8) {
                      continue;
                    }
                    var8 = var8 - this.arenaWidth;
                    var10 = var10 - this.arenaWidth;
                    continue;
                  }
                }
                stackIn_36_0 = 64 * (-var9 + this.arenaHeight) / this.arenaHeight;
                stackIn_36_1 = ScreenDisplayMode.randomBelow(random, 16, (byte) -34);
                break;
              }
              var11 = stackIn_36_0 + stackIn_36_1;
              do {
                if (var9 < this.arenaHeight &&
                  var9 > (var11 + 32) &&
                  var11 < var8 &&
                  -var11 + this.arenaWidth > var8) {
                  MusicPatchNode.carveTerrain(MatchingFieldValidator.field_y, (byte) -47, var11, (byte) -5, var9, var8, this);
                  var6 = var9;
                }
                if (var9 < 32 + var11) {
                  var6 = 0;
                }
                if (var6 > 128) {
                  continue scanLoop1;
                }
              } while (var12 != 0);
              break;
            }
            stackIn_48_0 = var5;
            return stackIn_48_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_51_0 = var3;
          stackIn_51_1 = new StringBuilder().append("nf.VB(").append(obfuscationGuard).append(',');
          if (random == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(')').toString());
        }
    }

    private final boolean canCastSpell(int spellType, BattleUnit unit, boolean obfuscationGuard) {
        boolean stackIn_4_0 = false;
        int stackIn_87_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_233_0 = 0;
        RuntimeException stackIn_236_0 = null;
        StringBuilder stackIn_236_1 = null;
        String stackIn_237_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4_intLifetime1;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (spellType == 153) {
            stackIn_4_0 = this.canCastSpell(39, unit, true);
            return stackIn_4_0;
          }
          if (spellType == 11) {
            return false;
          }
          if (spellType == 159) {
            var4_int = 100;
            if (this.playerSpellbook[unit.ownerPlayer] == 4) {
              var4_int = this.field_X[unit.ownerPlayer] / 5 * 5 + 5;
              if (this.field_X[unit.ownerPlayer] > 0 &&
                ~var4_int == ~(this.field_X[unit.ownerPlayer] + 5)) {
                var4_int = this.field_X[unit.ownerPlayer];
              }
            }
            if (20 < unit.health &&
              unit.hasNoLinkedUnit(29) &&
              this.playerSpellbook[unit.ownerPlayer] != 10) {
              if (var4_int <= this.field_X[unit.ownerPlayer]) {
                return false;
              }
              if (9 == this.playerSpellbook[unit.ownerPlayer] && (!(unit.health > 100) ||
                unit.unitType != 27)) {
                return false;
              }
              return true;
            }
            return false;
          }
          if (this.field_f &&
            !this.isArenaSpell((byte) 66, spellType)) {
            return false;
          }
          if (spellType == 87 &&
            0 < this.getSpellRecharge(spellType, -102, unit.ownerPlayer)) {
            return false;
          }
          if (spellType == 116 &&
            0 < this.getSpellRecharge(spellType, -102, unit.ownerPlayer)) {
            return false;
          }
          if ((spellType == 124 ||
            spellType == 130) &&
            unit.field_D) {
            return false;
          }
          CredentialParseHelpers.field_f = false;
          if (spellType == 139 &&
            null != unit.linkedUnit) {
            return true;
          }
          if (spellType == 152 &&
            unit.unitType == 19) {
            return true;
          }
          if (152 == spellType &&
            unit.unitType != 19) {
            return false;
          }
          if (spellType == 87 &&
            unit.unitType == 19) {
            return false;
          }
          if (150 == spellType &&
            -16 + this.arenaHeight <= unit.y) {
            return true;
          }
          if (spellType == 158) {
            return true;
          }
          boolean decompiledFrameCompleted1 = true;
          if (null != unit.linkedUnit) {
            if (this.isImmuneToSpell(spellType, unit, 1)) {
              return true;
            }
            var4 = ScreenSwitchHelpers.field_c[unit.unitType];
            if (unit.unitType == 17 &&
              unit.field_U) {
              var4 = NanoFrameClock.field_u;
            }
            if (unit.unitType == 10) {
              stackIn_87_0 = 1;
              if (unit.field_U) {
                stackIn_88_1 = 0;
              } else {
                stackIn_88_1 = 1;
              }
              if (stackIn_87_0 != stackIn_88_1) {
                var4 = FadingModalPanel.field_N;
              }
            }
            var5 = 0;
            var6 = 0;
            while (var6 < var4.length) {
              stackIn_100_0 = var4[var6];
              stackIn_100_1 = spellType;
              if (var7 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_100_0 == stackIn_100_1) {
                var5 = 1;
              }
              var6++;
            }
            if ((decompiledFrameCompleted1) &&
              (var5 == 0)) {
              return false;
            }
          }
          if (decompiledFrameCompleted1) {
            stackIn_100_0 = spellType;
            stackIn_100_1 = 6;
          }
          boolean decompiledFrameRemainder0 = true;
          if (stackIn_100_0 != stackIn_100_1 &&
            spellType != 79) {
            if ((98 != spellType &&
              spellType != 92) &&
              (decompiledFrameRemainder0 = !(spellType >= 156)) &&
              (decompiledFrameRemainder0 = !(spellType <= -1)) &&
              (decompiledFrameRemainder0 = (FixedViewResizeListener.field_e[spellType] == 4))) {
              if (4 < 1 + this.countTeamUnits((byte) -116, unit.ownerPlayer)) {
                CredentialParseHelpers.field_f = true;
                return false;
              }
              decompiledFrameRemainder0 = !(this.countUnits(12) + 1 <= 4 * this.playerCount);
              if (decompiledFrameRemainder0) {
                CredentialParseHelpers.field_f = true;
                return false;
              }
            }
            if (decompiledFrameRemainder0) {
              if (4 < 2 + this.countTeamUnits((byte) -113, unit.ownerPlayer)) {
                CredentialParseHelpers.field_f = true;
                return false;
              }
              decompiledFrameRemainder0 = !(2 + this.countUnits(12) <= this.playerCount * 4);
              if (decompiledFrameRemainder0) {
                CredentialParseHelpers.field_f = true;
                return false;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            if (3 + this.countTeamUnits((byte) -128, unit.ownerPlayer) > 4) {
              CredentialParseHelpers.field_f = true;
              return false;
            }
            if (3 + this.countUnits(12) > 4 * this.playerCount) {
              CredentialParseHelpers.field_f = true;
              return false;
            }
          }
          if (spellType == 93 &&
            unit.hasNoLinkedUnit(57)) {
            return false;
          }
          if (spellType == 95 &&
            unit.hasNoLinkedUnit(27)) {
            return false;
          }
          if (2 == spellType &&
            unit.unitType != 0) {
            return false;
          }
          if (spellType == 55 &&
            unit.unitType != 0) {
            return false;
          }
          if (31 == spellType &&
            unit.unitType != 0) {
            return false;
          }
          if (spellType == 60 &&
            0 != unit.unitType) {
            return false;
          }
          if (spellType == 81 &&
            unit.unitType != 0) {
            return false;
          }
          if (spellType == 91 &&
            unit.unitType != 0) {
            return false;
          }
          if (spellType == 114 &&
            0 != unit.unitType) {
            return false;
          }
          if (!obfuscationGuard) {
            this.field_ib = (int[]) null;
          }
          if (spellType == 71 &&
            unit.unitType != 0 &&
            unit.unitType != 19) {
            return false;
          }
          if (spellType == 83 &&
            unit.unitType != 0 &&
            unit.unitType != 19) {
            return false;
          }
          if (spellType == 45 &&
            unit.isTower((byte) 90)) {
            return false;
          }
          if (spellType == 45 &&
            27 == unit.unitType) {
            return false;
          }
          if (unit.unitType == 16) {
            if ((60 > spellType ||
              71 < spellType) && spellType >= 12) {
              return false;
            }
          } else {
            if (unit.unitType == 18 && (spellType < 72 ||
              spellType > 83) && spellType >= 12) {
              return false;
            }
          }
          if (spellType < 0) {
            return true;
          }
          if (unit.y > this.arenaHeight) {
            return (spellType == 4);
          }
          if (spellType == 4 &&
            unit.attachedProjectile != null &&
            unit.attachedProjectile.spellType == 121) {
            return false;
          }
          boolean decompiledFrameCompleted0 = true;
          if (this.currentPlayer >= 0) {
            var4_intLifetime1 = 0;
            while (16 > var4_intLifetime1) {
              stackIn_233_0 = spellType;
              if (var7 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_233_0 != this.spellSlots[this.currentPlayer][var4_intLifetime1]) {
                var4_intLifetime1++;
                continue;
              }
              if (0 == this.spellCharges[this.currentPlayer][var4_intLifetime1]) {
                return false;
              }
              if ((this.round / this.playerCount) >= BattleScreen.field_d[spellType]) {
                return true;
              }
              return false;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_233_0 = 0;
          }
          return stackIn_233_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_236_0 = var4_ref;
          stackIn_236_1 = new StringBuilder().append("nf.CC(").append(spellType).append(',');
          if (unit == null) {
            stackIn_237_2 = "null";
          } else {
            stackIn_237_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_236_0), ((StringBuilder) (Object) stackIn_236_1).append(stackIn_237_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void addProjectile(int obfuscationGuard, SpellProjectile projectile) {
        try {
          if (obfuscationGuard != -1) {
            this.field_fb = (int[]) null;
          }
          this.removedProjectiles.addLast(projectile, 15893);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "nf.W(" + obfuscationGuard + ',' + (projectile != null ? "{...}" : "null") + ')');
        }
    }

    private final void consumeSpellCharge(byte param0, int spellType, int player) {
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        int[] dupTemp$2 = null;
        int[] discarded$3 = null;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int var4;
        int var5;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (spellType < 0) {
          return;
        }
        if (player < 0) {
          return;
        }
        if (spellType == 153) {
          this.consumeSpellCharge((byte) 80, 39, player);
          return;
        }
        if (152 == spellType) {
          var4 = 0;
          do {
            if (var4 >= 16) {
              return;
            }
            if (152 == this.spellSlots[player][var4]) {
              if (this.spellCharges[player][var4] <= 0) {
                return;
              }
              this.spellCharges[player][var4] = 0;
              this.spellRecharge[player][var4] = 1;
              if (var5 == 0) {
                return;
              }
            }
            var4++;
          } while (var5 == 0);
          return;
        }
        var4 = 0;
        scanLoop1: while (true) {
          boolean decompiledFrameRemainder0 = true;
          if (var4 < 16) {
            stackIn_45_0 = spellType;
            stackIn_45_1 = this.spellSlots[player][var4];
            if (var5 != 0) {
              break scanLoop1;
            }
            if (stackIn_45_0 == stackIn_45_1) {
              this.field_L[player][var4] = true;
              if (MouseWheelHandler.field_b[spellType] != -1) {
                if (this.spellCharges[player][var4] > 0 && (-1 == StatefulTextPainter.field_p ||
                  spellType == 5)) {
                  dupTemp$0 = this.spellCharges[player];
                  dupTemp$0[var4] = dupTemp$0[var4] - 1;
                }
              } else {
                this.spellRecharge[player][var4] = 5;
                if (spellType == 46 &&
                  2 == this.playerSpellbook[player]) {
                  dupTemp$1 = this.spellRecharge[player];
                  dupTemp$1[var4] = dupTemp$1[var4] - this.field_X[player] / 20;
                }
                if (0 < this.spellCharges[player][var4]) {
                  dupTemp$2 = this.spellCharges[player];
                  dupTemp$2[var4] = dupTemp$2[var4] - 1;
                }
                if (this.spellRecharge[player][var4] <= 0) {
                  this.spellCharges[player][var4] = 1;
                  this.spellRecharge[player][var4] = 0;
                }
              }
              if (spellType == 87) {
                this.spellRecharge[player][var4] = 1;
              }
              if ((116 == spellType)) {
                this.spellRecharge[player][var4] = 1;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              var4++;
              continue;
            }
          }
          stackIn_45_0 = param0;
          stackIn_45_1 = 80;
          break;
        }
        if (stackIn_45_0 != stackIn_45_1) {
          discarded$3 = this.generateSevenPointWrappedProfile(18, (IsaacRandom) null);
        }
        return;
    }

    final int getSpellRecharge(int spellType, int obfuscationGuard, int player) {
        int var4;
        int var5;
        int stackIn_16_0 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (0 > spellType) {
          return 0;
        }
        if (0 > player) {
          return 0;
        }
        if (obfuscationGuard != -102) {
          return 57;
        }
        if (spellType == 153) {
          return this.getSpellRecharge(39, -102, player);
        }
        var4 = 0;
        while (var4 < 16) {
          stackIn_16_0 = spellType;
          if (var5 != 0) {
            return stackIn_16_0;
          }
          if (stackIn_16_0 == this.spellSlots[player][var4]) {
            return this.spellRecharge[player][var4];
          }
          var4++;
        }
        return -1;
    }

    final void refreshTerrainArea(int x, int radius, byte obfuscationGuard, int y) {
        if (!this.field_eb) {
          return;
        }
        NameTable.drawMaskShape(this, this.terrainSprite, -1, 4 + radius, x, y);
        if (obfuscationGuard != 51) {
          this.animating = false;
        }
        MusicPatchNode.carveTerrain(this.terrainSprite, (byte) -47, radius, (byte) 0, y, x, this);
        ClientIOException.carveHalfResolutionMask(this.terrainMask, radius, y, this, (byte) 0, x, obfuscationGuard ^ -95);
    }

    final boolean canStandAt(int x, BattleUnit unit, int obfuscationGuard, int y) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = unit.getSize(-8323);
          if (obfuscationGuard != -16) {
            this.spellRecharge = (int[][]) null;
          }
          if (var5_int <= x &&
            x <= (this.arenaWidth - var5_int) &&
            y >= var5_int &&
            -16 + this.arenaHeight >= y) {
            if (null != unit.attachedProjectile &&
              121 == unit.attachedProjectile.spellType) {
              return false;
            }
            stackIn_17_0 = !(this.circleHitsTerrain(x, var5_int >> 1, y, obfuscationGuard ^ -70));
            return stackIn_17_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("nf.CB(").append(x).append(',');
          if (unit == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(obfuscationGuard).append(',').append(y).append(')').toString());
        }
    }

    Battle(boolean param0, boolean param1, int param2, int param3, boolean param4, String[] playerNames, int randomSeed, int currentPlayer, int[][] param8, int[][] spellSlots, int[] param10, int param11, boolean[] param12) {
        boolean stackIn_4_1 = false;
        boolean stackIn_10_1 = false;
        int stackIn_29_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_107_2 = null;
        StringBuilder stackIn_109_1 = null;
        String stackIn_110_2 = null;
        StringBuilder stackIn_112_1 = null;
        String stackIn_113_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var14_int = 0;
        RuntimeException var14 = null;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int stackIn_61_0Lifetime1;
        int stackIn_61_1Lifetime1;
        int stackIn_89_0Lifetime1;
        int stackIn_89_1Lifetime1;
        int var16Lifetime1;
        int var16Lifetime1Lifetime1;
        int var16Lifetime1Lifetime2;
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        this.field_M = true;
        this.field_E = null;
        this.healthiestPlayer = -1;
        this.arenaWidth = 1920;
        this.field_tb = 0;
        this.arenaHeight = 960;
        this.field_Hb = this.arenaHeight / 2;
        this.field_eb = true;
        this.field_hb = this.arenaWidth / 2;
        this.field_Z = false;
        this.weakestPlayer = -1;
        this.field_fb = null;
        this.unitIdCounter = 0;
        this.field_Y = -1;
        try {
          MidiPcmStream.field_D = new IntrusiveDequeCursor();
          IntKeyLookup.field_d = new IntrusiveDequeCursor();
          HuffmanCodec.field_f = new IntrusiveDequeCursor();
          ValidationStatusIcon.field_J = new IntrusiveDequeCursor();
          BattleAction.field_p = new IntrusiveDequeCursor();
          this.field_m = param11;
          stackIn_4_1 = (param0);
          this.field_l = stackIn_4_1;
          var14_int = playerNames.length;
          this.previousPlayer = currentPlayer - 1;
          if (var14_int != 4 &&
            var14_int != 6) {
            this.teamMode = false;
          }
          if (var14_int == 4 ||
            var14_int == 6 || var19 != 0) {
            stackIn_10_1 = (param4);
            this.teamMode = stackIn_10_1;
          }
          this.currentPlayer = currentPlayer;
          this.field_xb = param3;
          this.randomSeed = randomSeed;
          if (!this.teamMode) {
            NameCheckHelpers.field_n = NameCheckHelpers.field_a;
            if (var19 != 0) {
              NameCheckHelpers.field_n = LabeledField.field_M;
            }
          } else {
            NameCheckHelpers.field_n = LabeledField.field_M;
          }
          this.playerNames = playerNames;
          if (0 > this.previousPlayer) {
            this.previousPlayer = this.previousPlayer + var14_int;
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted1 = true;
          if (param8 != null) {
            this.field_N = new int[var14_int][18];
            var15 = 0;
            while (var14_int > var15) {
              stackIn_29_0 = 0;
              if (var19 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              var16 = stackIn_29_0;
              while (var16 < 18) {
                this.field_N[var15][var16] = param8[var15][var16];
                var16++;
              }
              var15++;
            }
          }
          if (decompiledFrameCompleted1) {
            if (param10 == null) {
              this.field_S = new int[var14_int];
              decompiledFrameRemainder0 = (var19 != 0);
            }
            if (decompiledFrameRemainder0) {
              this.field_S = new int[var14_int];
              stackIn_29_0 = 0;
            }
          }
          if (decompiledFrameRemainder0) {
            var15 = stackIn_29_0;
            while (var14_int > var15) {
              this.field_S[var15] = param10[var15];
              var15++;
              if (var19 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_g = new int[var14_int];
            this.field_R = new int[var14_int];
            this.field_Ob = new int[var14_int];
            this.field_T = new int[var14_int];
            this.field_U = new int[var14_int];
            this.field_c = new int[var14_int];
            this.field_db = new int[var14_int];
            this.field_K = new int[var14_int];
            this.field_wb = new int[var14_int];
            this.field_b = new int[var14_int];
            this.field_s = new int[var14_int];
            this.field_ob = new int[var14_int];
            this.field_gb = new int[var14_int];
            this.field_F = param2;
            this.field_ab = new int[var14_int];
            this.field_Nb = new int[var14_int];
            this.field_u = new boolean[var14_int];
            this.field_Fb = new int[var14_int];
            this.field_ib = new int[var14_int];
            this.field_a = new int[var14_int];
            this.field_Eb = new int[var14_int];
            this.field_cb = new int[var14_int];
            this.field_p = new int[var14_int];
            this.field_n = new int[var14_int];
            this.playerCount = playerNames.length;
          }
          var15 = 0;
          do {
            if (var15 >= this.playerCount) {
              this.units = new IntrusiveDeque();
              this.unitsById = new IntrusiveNodeHashTable(32);
              this.projectiles = new IntrusiveDeque();
              this.removedProjectiles = new DualLinkDeque();
              this.spawnedProjectiles = new IntrusiveDeque();
              this.actionQueue = new IntrusiveDeque();
              this.field_r = new IntrusiveDeque();
              this.field_h = new DualLinkDeque();
              this.spellSlots = new int[this.playerCount][16];
              this.playerSpellbook = new int[this.playerCount];
              this.spellRecharge = new int[this.playerCount][];
              this.field_f = false;
              this.field_L = new boolean[this.playerCount][16];
              this.spellCharges = new int[this.playerCount][];
              this.field_o = new int[this.playerCount];
              this.field_X = new int[this.playerCount];
              this.field_Ab = new int[this.playerCount];
              break;
            }
            var15++;
          } while (var19 == 0);
          var15 = 0;
          while (true) {
            stackIn_41_0 = ~this.playerCount;
            stackIn_41_1 = ~var15;
            if (stackIn_41_0 < stackIn_41_1) {
              this.playerSpellbook[var15] = 10;
              this.field_X[var15] = 0;
              this.field_Ab[var15] = 0;
              this.field_o[var15] = 0;
              if (var19 != 0) {
                return;
              }
              if (spellSlots != null) {
                var16Lifetime1 = 0;
                while (var16Lifetime1 < 16) {
                  this.spellSlots[var15][var16Lifetime1] = spellSlots[var15][var16Lifetime1];
                  stackIn_61_0 = ~this.spellSlots[var15][var16Lifetime1];
                  stackIn_61_1 = -12;
                  if (stackIn_61_0 == stackIn_61_1) {
                    this.field_f = true;
                  }
                  var16Lifetime1++;
                }
              } else {
                var16Lifetime1 = 1;
                if (2 == var16Lifetime1) {
                  this.spellSlots[var15][0] = 0;
                  this.spellSlots[var15][1] = 4;
                  this.spellSlots[var15][2] = 6;
                  this.spellSlots[var15][3] = 45;
                  this.spellSlots[var15][4] = 8;
                  this.spellSlots[var15][5] = 36;
                  this.spellSlots[var15][6] = 37;
                  this.spellSlots[var15][7] = 38;
                  this.spellSlots[var15][8] = 39;
                  this.spellSlots[var15][9] = 40;
                  this.spellSlots[var15][10] = 41;
                  this.spellSlots[var15][11] = 42;
                  this.spellSlots[var15][12] = 43;
                  this.spellSlots[var15][13] = 44;
                  this.spellSlots[var15][14] = 46;
                  this.spellSlots[var15][15] = 47;
                }
                if (3 == var16Lifetime1) {
                  this.spellSlots[var15][0] = 0;
                  this.spellSlots[var15][1] = 4;
                  this.spellSlots[var15][2] = 6;
                  this.spellSlots[var15][3] = 17;
                  this.spellSlots[var15][4] = 8;
                  this.spellSlots[var15][5] = 12;
                  this.spellSlots[var15][6] = 13;
                  this.spellSlots[var15][7] = 14;
                  this.spellSlots[var15][8] = 15;
                  this.spellSlots[var15][9] = 16;
                  this.spellSlots[var15][10] = 18;
                  this.spellSlots[var15][11] = 19;
                  this.spellSlots[var15][12] = 20;
                  this.spellSlots[var15][13] = 21;
                  this.spellSlots[var15][14] = 22;
                  this.spellSlots[var15][15] = 10;
                }
                if (4 == var16Lifetime1) {
                  this.spellSlots[var15][0] = 0;
                  this.spellSlots[var15][1] = 4;
                  this.spellSlots[var15][2] = 6;
                  this.spellSlots[var15][3] = 10;
                  this.spellSlots[var15][4] = 8;
                  this.spellSlots[var15][5] = 48;
                  this.spellSlots[var15][6] = 50;
                  this.spellSlots[var15][7] = 52;
                  this.spellSlots[var15][8] = 56;
                  this.spellSlots[var15][9] = 49;
                  this.spellSlots[var15][10] = 51;
                  this.spellSlots[var15][11] = 53;
                  this.spellSlots[var15][12] = 57;
                  this.spellSlots[var15][13] = 58;
                  this.spellSlots[var15][14] = 54;
                  this.spellSlots[var15][15] = 55;
                }
                if (var16Lifetime1 == 1) {
                  this.spellSlots[var15][0] = 0;
                  this.spellSlots[var15][1] = 4;
                  this.spellSlots[var15][2] = 6;
                  this.spellSlots[var15][3] = 10;
                  this.spellSlots[var15][4] = 35;
                  this.spellSlots[var15][5] = 24;
                  this.spellSlots[var15][6] = 28;
                  this.spellSlots[var15][7] = 30;
                  this.spellSlots[var15][8] = 32;
                  this.spellSlots[var15][9] = 25;
                  this.spellSlots[var15][10] = 27;
                  this.spellSlots[var15][11] = 29;
                  this.spellSlots[var15][12] = 33;
                  this.spellSlots[var15][13] = 34;
                  this.spellSlots[var15][14] = 26;
                  this.spellSlots[var15][15] = 31;
                }
              }
              this.spellRecharge[var15] = new int[16];
              this.spellCharges[var15] = new int[16];
              var16Lifetime1Lifetime1 = 0;
              while (true) {
                stackIn_61_0Lifetime1 = ~var16Lifetime1Lifetime1;
                stackIn_61_1Lifetime1 = -17;
                if (stackIn_61_0Lifetime1 <= stackIn_61_1Lifetime1) {
                  break;
                }
                stackIn_89_0 = -1;
                stackIn_89_1 = this.spellSlots[var15][var16Lifetime1Lifetime1];
                if (stackIn_89_0 == stackIn_89_1 ||
                  this.spellSlots[var15][var16Lifetime1Lifetime1] >= 156) {
                  this.spellSlots[var15][var16Lifetime1Lifetime1] = -1;
                } else {
                  this.spellCharges[var15][var16Lifetime1Lifetime1] = MouseWheelHandler.field_b[this.spellSlots[var15][var16Lifetime1Lifetime1]];
                  if (-1 == this.spellCharges[var15][var16Lifetime1Lifetime1]) {
                    this.spellCharges[var15][var16Lifetime1Lifetime1] = 1;
                  } else {
                    if (this.spellCharges[var15][var16Lifetime1Lifetime1] == 0) {
                      this.spellCharges[var15][var16Lifetime1Lifetime1] = -1;
                    }
                  }
                }
                var16Lifetime1Lifetime1++;
              }
              if (param12[var15]) {
                var16Lifetime1Lifetime2 = 0;
                while (var16Lifetime1Lifetime2 <= 4) {
                  stackIn_41_0 = ~this.spellSlots[var15][var16Lifetime1Lifetime2];
                  stackIn_41_1 = -1;
                  if (stackIn_41_0 <= stackIn_41_1 &&
                    this.spellSlots[var15][var16Lifetime1Lifetime2] % 12 == 0 &&
                    this.spellSlots[var15][11 + var16Lifetime1Lifetime2] == 11 + this.spellSlots[var15][var16Lifetime1Lifetime2]) {
                    this.playerSpellbook[var15] = this.spellSlots[var15][var16Lifetime1Lifetime2] / 12 - 1;
                    if (this.playerSpellbook[var15] == -1) {
                      this.playerSpellbook[var15] = 9;
                      var17 = new int[NameCheckHelpers.field_n.length];
                      var18 = 0;
                      while (true) {
                        if (NameCheckHelpers.field_n.length > var18) {
                          var17[var18] = NameCheckHelpers.field_n[var18];
                          var18++;
                          continue;
                        }
                        break;
                      }
                      NameCheckHelpers.field_n = var17;
                      NameCheckHelpers.field_n[var15] = 13413102;
                    }
                  }
                  var16Lifetime1Lifetime2++;
                }
              } else {
                var16Lifetime1Lifetime2 = 0;
                while (true) {
                  stackIn_89_0Lifetime1 = -5;
                  stackIn_89_1Lifetime1 = ~var16Lifetime1Lifetime2;
                  if (stackIn_89_0Lifetime1 > stackIn_89_1Lifetime1) {
                    break;
                  }
                  stackIn_41_0 = ~this.spellSlots[var15][var16Lifetime1Lifetime2];
                  stackIn_41_1 = -13;
                  if (stackIn_41_0 <= stackIn_41_1 &&
                    this.spellSlots[var15][var16Lifetime1Lifetime2] % 12 == 0 &&
                    this.spellSlots[var15][var16Lifetime1Lifetime2 + 11] == 11 + this.spellSlots[var15][var16Lifetime1Lifetime2]) {
                    this.playerSpellbook[var15] = -1 + this.spellSlots[var15][var16Lifetime1Lifetime2] / 12;
                  }
                  var16Lifetime1Lifetime2++;
                }
              }
              var15++;
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var14 = decompiledCaughtException;
          stackIn_100_0 = var14;
          stackIn_100_1 = new StringBuilder().append("nf.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (playerNames == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          stackIn_103_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',').append(randomSeed).append(',').append(currentPlayer).append(',');
          if (param8 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          stackIn_106_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',');
          if (spellSlots == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          stackIn_109_1 = ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',');
          if (param10 == null) {
            stackIn_110_2 = "null";
          } else {
            stackIn_110_2 = "{...}";
          }
          stackIn_112_1 = ((StringBuilder) (Object) stackIn_109_1).append(stackIn_110_2).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_113_2 = "null";
          } else {
            stackIn_113_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_112_1).append(stackIn_113_2).append(')').toString());
        }
    }

    final int countUnits(int obfuscationGuard) {
        int var2;
        BattleUnit var3;
        int var4;
        int stackIn_11_0 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = 0;
        if (obfuscationGuard != 12) {
          this.getThemeParameter(-25);
        }
        MidiPcmStream.field_D.setDeque((byte) 78, this.units);
        var3 = (BattleUnit) (MidiPcmStream.field_D.first(-43));
        while (var3 != null) {
          stackIn_11_0 = 12;
          if (var4 != 0) {
            return stackIn_11_0;
          }
          if (stackIn_11_0 != var3.unitType &&
            null != var3.linkedUnit) {
            var2++;
          }
          var3 = (BattleUnit) (MidiPcmStream.field_D.next(obfuscationGuard ^ -18506));
        }
        return var2;
    }

    static {
        field_qb = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_W = -1;
        field_Bb = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_yb = "Become a member to earn wands and unlock this spellbook.";
        field_e = "Book of Nature";
        field_Lb = new int[8192];
    }

    private static int compareDoublesNanLess(double left, double right) {
        return left > right ? 1 : (left == right ? 0 : -1);
    }

    private static int compareDoublesNanGreater(double left, double right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
