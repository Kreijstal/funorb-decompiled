/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class hs extends kb implements gw {
    static String field_D;
    kb[] field_C;
    static String field_I;
    static fp field_H;
    static int[] field_G;
    static RgbSprite[] field_F;
    static String[] field_E;

    void a(int param0, int param1, int param2, kb param3) {
        int var6 = 0;
        kb var7 = null;
        int var8 = 0;
        kb var9 = null;
        kb[] var10 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          super.a(param0 ^ 0, param1, param2, param3);
          if (null == this.field_C) {
            return;
          }
          var10 = this.field_C;
          var6 = 0;
          if (param0 != 32722) {
            var9 = (kb) null;
            this.a(100, 40, 117, -12, 65, -112, (kb) null);
          }
          while (var6 < var10.length) {
            var7 = var10[var6];
            if (var7 != null) {
              var7.a(32722, param1 + this.field_B, this.field_p + param2, param3);
            }
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("hs.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static js a(String param0, int param1, String param2) {
        js var3 = null;
        RuntimeException var3_ref = null;
        js stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 235) {
            hs.a(124);
          }
          var3 = js.a(SummonEvent.field_B, param0, param2);
          if (var3 != null) {
            var3.field_B = null;
          }
          stackIn_6_0 = var3;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("hs.IA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1, Unit param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_35_0 = 0;
        int stackIn_44_0 = 0;
        RgbSprite[] stackIn_54_0 = null;
        int[] stackIn_54_1 = null;
        int stackIn_55_2 = 0;
        int stackIn_71_0 = 0;
        Unit stackIn_82_0 = null;
        boolean stackIn_83_1 = false;
        int stackIn_95_0 = 0;
        int stackIn_110_0 = 0;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        String stackIn_128_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18_int = 0;
        MapTile var18 = null;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        int var17Lifetime1;
        int var17Lifetime2;
        int var19Lifetime1;
        var20 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          cf.field_t.b(param4 + 2, param7 + param6 - 73);
          fe.b(param4 + 0, -76 + param6 + param7, 309, 71, io.field_m, nd.field_b, 0, 0);
          SoftwareRaster.b(param4 + 7, param7 - 70 + param6, 25, 25, 0, 128);
          SoftwareRaster.b(37 + param4, param7 - 70 + param6, 265, 25, 0, 128);
          var21 = param2.q((byte) 67);
          var8 = var21.toLowerCase();
          SoftwareRaster.f(param4 + 37, param7 - 70 + param6, 245 + param4, param6 + (param7 - 45));
          fe.a(var8, -param3 + (param4 + 42), param6 - 43 + param7, 16777215, true);
          SoftwareRaster.a();
          fe.c(param2.strength + param2.bonusStrength + "/" + param2.maximumStrength, param4 + 272, param6 - (42 - param7), 16777215, param1);
          ro.field_rb[param2.getUnitCategory(0)].a(param4 + 9, param7 - 66 + param6);
          var9 = param2.l(-27014);
          SoftwareRaster.b(59 + param4, param7 - 41 + param6, 30, 30, 0, 128);
          cp.field_e[eb.a((byte) -120, ~var9 & 3)].a(param4 + 62, param7 - (-param6 + 41));
          var10 = param2.unitType;
          if (var10 == 34 &&
            param2.packedFlag8) {
            var10 = 75;
          }
          var11 = bw.unitDefinitions[var10][6];
          var12 = bw.unitDefinitions[var10][7];
          if (param2.packedFlag8 &&
            34 == param2.unitType) {
            var12 = 7;
            var11 = 2;
            if (param2.getEquipmentCategory(20640) == 3) {
              var12 = var12 + param2.getEquipmentProperty(1, -105);
            }
          }
          if ((param2.unitType == 81 ||
            param2.unitType == 4 ||
            74 == param2.unitType) &&
            param2.getEquipmentCategory(20640) == 3) {
            var12 = var12 + param2.getEquipmentProperty(1, 96);
          } else if (param2.getUnitCategory(0) == 3 &&
            param2.getEquipmentCategory(20640) == 2) {
            var12 = var12 + param2.getEquipmentProperty(1, -102);
          } else {
            if (param2.getUnitCategory(0) == 2 &&
              param2.getEquipmentCategory(20640) == 1) {
              var12 = var12 + param2.getEquipmentProperty(1, -116);
            }
          }
          if (var11 != var12) {
            SoftwareRaster.b(param4 + 92, param7 - 41 + param6, 39, 30, 0, 128);
            fe.c(fo.a(4800, td.field_a, new String[]{Integer.toString(var11), Integer.toString(var12)}), param4 + 111, param7 - 41 + (param6 + 30), 16777215, true);
          } else {
            SoftwareRaster.b(96 + param4, -41 - (-param6 - param7), 30, 30, 0, 128);
            fe.c(Integer.toString(var11), param4 + 111, -41 - (-param6 - (param7 + 30)), 16777215, true);
          }
          var13 = 0;
          SoftwareRaster.a(307 + param4 - 20, param7 - 26 + param6, 17, 0, 128);
          var14 = bw.unitDefinitions[param2.unitType][12];
          if (var14 > -1) {
            if (var14 < lb.field_e.length) {
              lb.field_e[var14].a(-35 + (308 + param4), -42 + param6 + param7);
            } else {
              SoftwareRaster.a(-35 + (param4 + 308), param7 + param6 - 42, 25, (int)(Math.random() * 16777215.0), 128);
            }
          }
          var15 = eb.a((byte) -104, var9 >> 2);
          if ((var15 & 3) <= 0 &&
            var15 != 0) {
            stackIn_35_0 = 0;
          } else {
            stackIn_35_0 = 1;
          }
          var16 = stackIn_35_0 + (var15 >> 2);
          SoftwareRaster.b(param4 + 284 - 150, -41 + param6 + param7, 130, 30 * var16, 0, 128);
          for (var17 = 5; 1 < var17; var17--) {
            if ((var9 & 1 << var17) != 0) {
              cp.field_e[var17 + 1].a(-(30 * (3 & var13)) + 235 + param4, (var13 >> 2) * 30 + (param7 - 41 + param6));
              var13++;
            }
          }
          if (param2.statusEffectType != 0) {
            if (7 <= param2.statusEffectType) {
              stackIn_44_0 = 0;
            } else {
              stackIn_44_0 = -1 + param2.statusEffectValue;
            }
            var17Lifetime1 = stackIn_44_0;
            BattleCharacter.field_h[vr.field_a[param2.statusEffectType - 1] + var17Lifetime1].h(-(30 * (var13 & 3)) + (235 + param4), param7 + (-36 + param6) + (var13 >> 2) * 30);
            km.field_h[0].h(param4 + 233 - 30 * (3 & var13), 30 * (var13 >> 2) + param7 - 37 + param6);
            var13++;
          }
          if (param2.equipmentDescriptor > -1) {
            BattleCharacter.field_h[co.field_p[param2.getEquipmentCategory(20640)][param2.getEquipmentId((byte) 81)]].h(235 + param4 - (var13 & 3) * 30, (var13 >> 2) * 30 + param7 + (-36 + param6));
            km.field_h[0].h(-((var13 & 3) * 30) + (param4 + 233), (var13 >> 2) * 30 - 37 + param6 + param7);
            var13++;
          }
          if (param2.accessoryType > 0) {
            BattleCharacter.field_h[uj.field_o[param2.accessoryType - 1]].h(-((3 & var13) * 30) + (235 + param4), 30 * (var13 >> 2) - 36 - (-param6 - param7));
            km.field_h[0].h(param4 + 233 - 30 * (3 & var13), (var13 >> 2) * 30 + param7 + param6 - 37);
            var13++;
          }
          if (param2.immobilizedTurns > 0) {
            stackIn_54_0 = BattleCharacter.field_h;
            stackIn_54_1 = jq.field_H;
            if (3 >= param2.immobilizedTurns) {
              stackIn_55_2 = -1 + param2.immobilizedTurns;
            } else {
              stackIn_55_2 = 2;
            }
            ((RgbSprite) (Object) stackIn_54_0[stackIn_54_1[stackIn_55_2]]).h(235 + param4 - (var13 & 3) * 30, param7 + (-36 + param6) + 30 * (var13 >> 2));
            km.field_h[0].h(-((var13 & 3) * 30) + (233 + param4), (var13 >> 2) * 30 + param7 - (-param6 + 37));
            var13++;
          }
          if (param2.meleeLifeSteal) {
            BattleCharacter.field_h[133].h(-((3 & var13) * 30) + 235 + param4, param6 - (36 - param7 - 30 * (var13 >> 2)));
            km.field_h[0].h(param4 + 233 - 30 * (3 & var13), -37 + (param6 + param7) + (var13 >> 2) * 30);
            var13++;
          }
          if (param2.packedFlag256) {
            BattleCharacter.field_h[122 + bw.unitDefinitions[param2.unitType][2]].h(param4 + (235 - (var13 & 3) * 30), param7 - 36 - (-param6 - (var13 >> 2) * 30));
            km.field_h[0].h(param4 + 233 - 30 * (var13 & 3), param7 - 37 - (-param6 - (var13 >> 2) * 30));
            var13++;
          }
          if (param2.packedFlag32) {
            BattleCharacter.field_h[j.field_j[td.a(param2.unitType, (byte) -125)]].h(-((3 & var13) * 30) + 235 + param4, 30 * (var13 >> 2) + param7 + param6 - 36);
            km.field_h[0].h(-((var13 & 3) * 30) + (param4 + 233), param6 - 37 + (param7 + (var13 >> 2) * 30));
            var13++;
          }
          if (param5 == 80) {
            if (param0) {
              stackIn_71_0 = (ml.a(59 + param7, 26 + param4, 21, false)) ? 1 : 0;
            } else {
              stackIn_71_0 = 0;
            }
          } else {
            stackIn_71_0 = 0;
          }
          regionExit1: {
            var17Lifetime2 = stackIn_71_0;
            if (param2.unitType == 39) {
              if (!param2.movementSpent &&
                param2.attacksRemaining != 0) {
                lw.field_ob.g(11 + param4, param6 + (-36 + param7));
                ii.field_a[2].g(11 + param4, -36 + (param6 + param7));
                if ((var17Lifetime2 != 0)) {
                  lw.field_ob.f(11 + param4, param7 - (-param6 + 36), 128);
                }
                break regionExit1;
              }
              lw.field_ob.g(param4 + 11, param7 + param6 - 36, 128);
              ii.field_a[2].g(param4 + 11, param7 + param6 - 36, 128);
            } else {
              if (param2.unitType != 72) {
                if (param2.unitType == 17) {
                  stackIn_82_0 = (Unit) (param2);
                  stackIn_83_1 = !(param1);
                  if (!((Unit) (Object) stackIn_82_0).hasMovementFlag1(stackIn_83_1)) {
                    if (!param2.movementSpent &&
                      param2.attacksRemaining != 0) {
                      lw.field_ob.g(11 + param4, param7 - 36 + param6);
                      ii.field_a[1].g(param4 + 11, param7 + param6 - 36);
                      if ((var17Lifetime2 != 0)) {
                        lw.field_ob.f(11 + param4, -36 - (-param6 - param7), 128);
                      }
                    } else {
                      lw.field_ob.g(param4 + 11, param6 - 36 + param7, 128);
                      ii.field_a[1].g(11 + param4, param6 - 36 + param7, 128);
                    }
                    break regionExit1;
                  }
                }
                if (param2.unitType == 7 &&
                  !param2.packedFlag8) {
                  var18_int = param2.battlefield.tiles[param2.tileX + param2.tileY * param2.battlefield.mapWidth].terrainType;
                  stackIn_95_0 = (0 == var18_int) ? 0 : 1;
                  var19 = stackIn_95_0;
                  if (!param2.movementSpent &&
                    param2.attacksRemaining != 0 &&
                    var19 == 0) {
                    lw.field_ob.g(param4 + 11, param7 + (param6 - 36));
                    ii.field_a[4].g(param4 + 11, param7 + param6 - 36);
                    if ((var17Lifetime2 != 0)) {
                      lw.field_ob.f(11 + param4, param7 + (-36 + param6), 128);
                    }
                  } else {
                    lw.field_ob.g(11 + param4, param6 + (-36 + param7), 128);
                    ii.field_a[4].g(11 + param4, -36 + param6 + param7, 128);
                  }
                  break regionExit1;
                }
                if (param2.unitType == 34 &&
                  !param2.packedFlag8) {
                  var18 = param2.battlefield.tiles[param2.tileY * param2.battlefield.mapWidth + param2.tileX];
                  stackIn_110_0 = (var18.f(19725)) ? 0 : 1;
                  var19Lifetime1 = stackIn_110_0;
                  if (!param2.movementSpent &&
                    param2.attacksRemaining != 0 &&
                    var19Lifetime1 == 0) {
                    lw.field_ob.g(param4 + 11, -36 + (param6 + param7));
                    ii.field_a[0].g(11 + param4, -36 + param6 + param7);
                    if (var17Lifetime2 != 0) {
                      lw.field_ob.f(param4 + 11, -36 + param6 + param7, 128);
                      break regionExit1;
                    }
                    km.field_h[1].g(7 + param4, -40 + (param6 + param7));
                    return;
                  }
                  lw.field_ob.g(11 + param4, param6 - 36 + param7, 128);
                  ii.field_a[0].g(11 + param4, param7 - 36 + param6, 128);
                  break regionExit1;
                }
                lw.field_ob.g(11 + param4, -36 - (-param6 - param7), 128);
              } else {
                if (!param2.movementSpent &&
                  0 != param2.attacksRemaining) {
                  lw.field_ob.g(11 + param4, param7 - (-param6 + 36));
                  ii.field_a[3].g(param4 + 11, param6 - (36 - param7));
                  if ((var17Lifetime2 != 0)) {
                    lw.field_ob.f(param4 + 11, param6 + (-36 + param7), 128);
                  }
                  break regionExit1;
                }
                lw.field_ob.g(11 + param4, param6 + (-36 + param7), 128);
                ii.field_a[3].g(param4 + 11, param7 - (-param6 + 36), 128);
              }
            }
          }
          km.field_h[1].g(7 + param4, -40 + (param6 + param7));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_127_0 = var8_ref;
          stackIn_127_1 = new StringBuilder().append("hs.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_128_2 = "null";
          } else {
            stackIn_128_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_127_0), ((StringBuilder) (Object) stackIn_127_1).append(stackIn_128_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final int g(int param0) {
        int var4 = 0;
        int var2;
        kb[] var3;
        kb var5;
        int var7;
        kb var8;
        int var6;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = 0;
        if (param0 != -31989) {
          var8 = (kb) null;
          this.a(-72, 104, -12, -47, (kb) null, 52, 17);
        }
        var3 = this.field_C;
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var6 = var5.g(-31989);
            if (var2 < var6) {
              var2 = var6;
            }
          }
        }
        return var2;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, kb param6) {
        int var9 = 0;
        kb[] var8 = null;
        RuntimeException var8_ref = null;
        kb var10 = null;
        int var11 = 0;
        kb[] var12 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (null == this.field_C) {
            return false;
          }
          var12 = this.field_C;
          var8 = var12;
          if (param5 < 93) {
            this.g(-110);
          }
          for (var9 = 0; var9 < var12.length; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.a(false) &&
              var10.a(param0, param1, param2, param3, param4, 103, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_20_0 = var8_ref;
          stackIn_20_1 = new StringBuilder().append("hs.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        kb var6;
        int var7;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param3 == 0 &&
          null != this.field_k) {
          this.field_k.a((kb) (this), param0, -121, true, param1);
        }
        if (param2 >= -82) {
          this.f(-101);
        }
        if (null != this.field_C) {
          for (var5 = -1 + this.field_C.length; var5 >= 0; var5--) {
            var6 = this.field_C[var5];
            if (var6 != null) {
              var6.a(this.field_B + param0, param1 + this.field_p, (byte) -124, param3);
            }
          }
        }
    }

    final boolean a(kb param0, int param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        kb var5 = null;
        kb var6 = null;
        int var7 = 0;
        kb stackIn_7_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        kb var6Lifetime1;
        kb var6Lifetime2;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.field_C == null) {
            return false;
          }
          var4_int = 0;
          while (this.field_C.length > var4_int) {
            var5 = this.field_C[var4_int];
            var6 = var5;
            var6Lifetime1 = var5;
            stackIn_7_0 = var5;
            if (stackIn_7_0 != null &&
              var5.a(false)) {
              for (var4_int = var4_int + param1; this.field_C.length > var4_int; var4_int = var4_int + param1) {
                var6Lifetime2 = this.field_C[var4_int];
                if (var6Lifetime2 != null &&
                  var6Lifetime2.a(11, param0)) {
                  return true;
                }
              }
            }
            var4_int++;
          }
          if (param2) {
            return false;
          }
          field_G = (int[]) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("hs.EA(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, param0, (byte) 55, param1)) {
            this.a(param0, param3, true, param1);
            this.a(param3, -121, param1, param0);
          }
          if (param2 != 26477) {
            this.a((kb) null, -91, '￨', -125);
          }
          stackIn_6_0 = (StringBuilder) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("hs.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    hs(int param0, int param1, int param2, int param3, kh param4) {
        super(param0, param1, param2, param3, param4, (qo) null);
    }

    final boolean a(byte param0, kb param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        kb var5 = null;
        kb var6 = null;
        int var7 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        kb var6Lifetime1;
        kb var6Lifetime2;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (null == this.field_C) {
            return false;
          }
          if (param0 <= 79) {
            hs.b(45, -36);
          }
          var4_int = this.field_C.length - 1;
          while (0 <= var4_int) {
            var5 = this.field_C[var4_int];
            var6 = var5;
            var6Lifetime1 = var5;
            if (var5 != null &&
              var5.a(false)) {
              for (var4_int = var4_int - param2; var4_int >= 0; var4_int = var4_int - param2) {
                var6Lifetime2 = this.field_C[var4_int];
                if (var6Lifetime2 != null &&
                  var6Lifetime2.a(11, param1)) {
                  return true;
                }
              }
            }
            var4_int--;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("hs.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(')').toString());
        }
    }

    boolean a(kb param0, int param1, char param2, int param3) {
        int var6 = 0;
        kb[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        kb var7 = null;
        int var8 = 0;
        kb[] var9 = null;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.field_C == null) {
            return false;
          }
          var9 = this.field_C;
          var5 = var9;
          for (var6 = 0; var9.length > var6; var6++) {
            var7 = var9[var6];
            if (var7 != null &&
              var7.a(false) &&
              var7.a(param0, param1, param2, -12215)) {
              return true;
            }
          }
          var5_int = param1;
          if (var5_int != 80) {
            if (param3 == -12215) {
              return false;
            }
            field_E = (String[]) null;
            return false;
          }
          if (!br.field_f[81]) {
            stackIn_16_0 = this.b(-57, param0);
          } else {
            stackIn_16_0 = this.a((byte) 88, param0);
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_23_0 = var5_ref;
          stackIn_23_1 = new StringBuilder().append("hs.F(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    abstract void d(byte param0);

    private final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        int var6 = 0;
        StringBuilder discarded$6 = null;
        int var8 = 0;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$7 = null;
        kb var7 = null;
        int var9 = 0;
        kb[] var10 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.field_C == null) {
            return;
          }
          var10 = this.field_C;
          if (param1 >= -95) {
            return;
          }
          for (var6 = 0; var6 < var10.length; var6++) {
            var7 = var10[var6];
            discarded$6 = param2.append('\n');
            for (var8 = 0; param3 >= var8; var8++) {
              discarded$8 = param2.append(' ');
            }
            if (var7 != null) {
              var7.a(param3 + 1, param2, 26477, param0);
            } else {
              discarded$7 = param2.append("null");
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("hs.MA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        if (param1 < 0) {
          return;
        }
        int var2 = 0 % ((43 - param0) / 60);
        param1 = uc.spellDefinitions[param1][8];
        if (param1 < 0) {
          return;
        }
        sn var3 = MoveAttackRequest.field_v[param1];
        if (var3 != null &&
          0 != var3.field_o.length) {
          ub.$cfr$intArgs$a$6d836999ad61(127, var3);
        }
    }

    final String h(int param0) {
        int var3 = 0;
        kb[] var2;
        kb var4;
        int var6;
        String var5;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (null == this.field_C) {
          return null;
        }
        var2 = this.field_C;
        if (param0 != 21384) {
          return (String) null;
        }
        for (var3 = 0; var2.length > var3; var3++) {
          var4 = var2[var3];
          if (var4 != null) {
            var5 = var4.h(21384);
            if (var5 != null) {
              return var5;
            }
          }
        }
        return null;
    }

    final boolean a(boolean param0) {
        if (param0) {
          return true;
        }
        return null != this.a((byte) -86) ? true : false;
    }

    boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        int var9 = 0;
        kb[] var8 = null;
        RuntimeException var8_ref = null;
        kb var10 = null;
        int var11 = 0;
        kb[] var12 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.field_C == null) {
            return false;
          }
          if (param3 <= 103) {
            return true;
          }
          var12 = this.field_C;
          var8 = var12;
          for (var9 = 0; var12.length > var9; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.a(param0, this.field_B + param1, this.field_p + param2, 108, param4, param5, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_18_0 = var8_ref;
          stackIn_18_1 = new StringBuilder().append("hs.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void i(int param0) {
        if (param0 != 0) {
          return;
        }
        field_E = null;
        field_G = null;
        field_F = null;
        field_H = null;
        field_I = null;
        field_D = null;
    }

    final void f(int param0) {
        int var3 = 0;
        kb[] var2;
        kb var4;
        int var5;
        kb[] var6;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 != 1) {
          field_D = (String) null;
        }
        var6 = this.field_C;
        var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          if (var4 != null) {
            var4.f(1);
          }
        }
    }

    final boolean a(byte param0, kb param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 88) {
            field_H = (fp) null;
          }
          stackIn_3_0 = this.a((byte) 99, param1, 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hs.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.d((byte) 121);
    }

    private final kb a(byte param0) {
        int var3 = 0;
        kb[] var2;
        kb var4;
        int var5;
        kb[] var6;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.field_C == null) {
          return null;
        }
        var6 = this.field_C;
        var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null &&
            var4.a(false)) {
            return var4;
          }
        }
        if (param0 > -64) {
          return (kb) null;
        }
        return null;
    }

    final void a(int param0, kb param1, int param2, byte param3, int param4, int param5) {
        int var8 = 0;
        kb[] var7 = null;
        int var9 = 0;
        kb var10 = null;
        int var11 = 0;
        kb[] var12 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.field_C == null) {
            return;
          }
          var12 = this.field_C;
          var7 = var12;
          var9 = 100 / ((param3 + 58) / 53);
          for (var8 = 0; var12.length > var8; var8++) {
            var10 = var12[var8];
            if (var10 != null) {
              var10.a(this.field_p + param0, param1, param2, (byte) -126, param4, this.field_B + param5);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_12_0 = var7_ref;
          stackIn_12_1 = new StringBuilder().append("hs.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    boolean a(int param0, kb param1) {
        int var4 = 0;
        kb[] var3 = null;
        RuntimeException var3_ref = null;
        kb var5 = null;
        int var6 = 0;
        kb[] var7 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != 11) {
            return false;
          }
          var7 = this.field_C;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null &&
              var5.a(11, param1)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("hs.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean b(int param0, kb param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 41 / ((2 - param0) / 58);
          stackIn_1_0 = this.a(param1, 1, true);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("hs.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        if (bp.field_e >= 224) {
          mh.a(256, (byte) -60);
        } else {
          var1 = bp.field_e % 32;
          mh.a(bp.field_e + 32 - var1, (byte) -36);
        }
        if (param0 != 30) {
          field_H = (fp) null;
        }
    }

    static {
        field_I = "/";
        field_D = "Options";
        field_E = new String[]{"turntime_icons", "mapsize_icons", "gamelength_icons", "maptype_icons", "team_icons", "equipment_icons"};
        field_G = new int[]{20, 30, 40, 60, 10};
    }
}
