/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ul {
    static boolean field_a;
    static boolean field_m;
    static int field_d;
    static String field_j;
    static String field_f;
    private boolean[] field_c;
    private int field_b;
    private Battlefield field_h;
    private MapTile[] field_k;
    private int field_l;
    private int field_e;
    private int field_n;
    static String field_o;
    private int field_i;
    static RgbSprite field_g;

    final static void a(int param0) {
        bm.field_D = new rg(170, or.field_j, ck.field_d, new rg[]{new rg(135, qc.field_i, ma.field_X, new rg[]{new rg(136, dn.field_Lb, qu.field_n, new rg[]{new rg(137, SummonRequest.field_x, wh.field_e, new int[]{70, 71, 72, 73}), new rg(138, TutorialController.field_b, ki.field_f, new int[]{74, 75, 76, 77}), new rg(139, r.field_w, nh.field_H, new int[]{78, 79, 80, 81}), new rg(141, ms.field_p, ai.field_J, new int[]{90, 91, 92, 93}), new rg(140, oh.field_F, AiActionCandidate.field_n, new int[]{82, 83, 84, 85}), new rg(142, tl.field_f, ll.field_Kb, new int[]{86, 87, 88, 89}), new rg(143, UnitInfoPopup.field_l, UnitLossCondition.field_c, new int[]{103, 104})}), new rg(144, sa.field_d, ed.field_a, new rg[]{new rg(147, on.field_k, nv.field_J, new int[]{94, 95, 96, 105}), new rg(146, hl.field_Lb, dq.field_j, new int[]{97, 98, 99, 106, 124}), new rg(145, hf.field_g, fm.field_b, new int[]{100, 101, 102, 107, 125}), new rg(148, nl.field_D, ActionRequest.field_q, new int[]{127, 128, 129, 130, 126}), new rg(149, ms.field_n, bl.field_a, new int[]{131, 132, 133, 134})}), new rg(150, jm.field_d, dq.field_d, new int[]{12, 110, 69, 28, 108})}), new rg(151, na.field_I, ea.field_b, new rg[]{new rg(152, mi.field_C, bh.field_L, new rg[]{new rg(153, vv.field_a, cn.field_q, new int[]{54, 55, 56, 57, 58, 59, 60, 46}), new rg(154, ij.field_v, cn.field_s, new int[]{61, 62, 63, 64, 65, 66, 67})}), new rg(155, nl.field_G, fj.field_u, new rg[]{new rg(156, qb.field_l, ja.field_o, new int[]{0, 1, 2, 3, 4, 5, 6}), new rg(157, vv.field_c, ng.field_s, new int[]{47, 48, 49, 50, 51, 52, 53}), new rg(158, iv.field_m, m.field_g, new int[]{121, 122, 123, 68})}), new rg(159, TeamRoster.field_h, TurnEffectEvent.field_A, new rg[]{new rg(160, kp.field_j, AiInfluenceMap.field_l, new int[]{37, 38, 39, 40, 41, 42, 45}), new rg(161, dv.field_i, BattleCharacter.field_v, new int[]{7, 8, 9, 10, 11})}), new rg(162, fq.field_a, rd.field_a, new int[]{23, 24, 25, 26, 43, 27}), new rg(163, BattleCamera.field_f, nf.field_Pb, new int[]{111, 112, 113, 114, 44}), new rg(164, dr.field_y, hg.field_c, new int[]{34, 35, 36, 109})}), new rg(165, fd.field_o, vq.field_e, new rg[]{new rg(166, c.field_b, ao.field_u, new int[]{13, 14, 15, 16, param0}), new rg(167, vf.field_h, gi.field_a, new int[]{18, 19, 20, 21, 22}), new rg(168, ov.field_c, p.field_c, new int[]{29, 30, 31, 32, 33}), new rg(169, rg.field_d, sl.field_a, new int[]{115, 116, 117, 118, 119, 120})})});
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8;
        int var9;
        var8 = el.field_d * 30;
        if ((param3 != 0 ||
          var8 != 0) && (param6 >= param2 &&
          param4 < param1 + param6 &&
          param4 >= param7 &&
          param4 < param7 + param5)) {
          if (param4 - param7 >= 44 &&
            var8 >= 0) {
            if (-4 + (-40 + param5) >= -param7 + param4 &&
              var8 <= 0) {
              CorpseConditionMarker.a(-28309, true);
              var9 = -56 % ((-5 - param0) / 50);
              return;
            }
            kb.field_n = kb.field_n + 1;
            if (var8 > 0) {
              kb.field_n = kb.field_n + var8;
            }
            if (15 < kb.field_n) {
              kb.field_n = 15;
            }
            CorpseConditionMarker.a(-28309, false);
            return;
          }
          kb.field_n = kb.field_n - 1;
          if (var8 < 0) {
            kb.field_n = kb.field_n + var8;
          }
          if (kb.field_n < -15) {
            kb.field_n = -15;
          }
          CorpseConditionMarker.a(-28309, false);
          return;
        }
        CorpseConditionMarker.a(-28309, true);
    }

    final static void a(byte param0, String param1, NodeDeque param2) {
        try {
          fq.a(param2, param1, 0, false);
          if (param0 != -80) {
            field_m = true;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ul.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        param0 = 15 + (-this.field_i + param0);
        param2 = param2 - this.field_b + 15;
        if (param1 != 112) {
          return false;
        }
        if (param0 >= 0 &&
          param2 >= 0 &&
          param0 <= 30) {
          if (param2 <= 30) {
            return this.field_c[param0 + 30 * param2];
          }
          return false;
        }
        return false;
    }

    public static void b(int param0) {
        field_o = null;
        field_g = null;
        if (param0 != 30) {
          return;
        }
        field_f = null;
        field_j = null;
    }

    final boolean a(int param0, int param1, int param2, boolean param3, int param4, int param5, byte param6) {
        int var10 = 0;
        int var11 = 0;
        int var8;
        int var9;
        int var12;
        int var13;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.a((byte) -104);
        this.field_n = param4;
        this.field_b = param0;
        this.field_i = param2;
        var9 = 77 / ((param6 + 50) / 62);
        for (var10 = this.field_n; var10 >= 0; var10--) {
          for (var11 = -var10; var10 > var11; var11++) {
            var12 = var10 + Math.abs(var11);
            if (param4 >= var12) {
              if (-1 < this.field_i + var11 &&
                this.field_e > this.field_i + var11 &&
                this.field_b + var10 > -1 &&
                var10 + this.field_b < this.field_l) {
                this.a(25, var10, this.field_b, var11, this.field_i, param3);
              }
              if (this.field_i - var11 > -1 &&
                -var11 + this.field_i < this.field_e &&
                -var10 + this.field_b > -1 &&
                this.field_b - var10 < this.field_l) {
                this.a(25, -var10, this.field_b, -var11, this.field_i, param3);
              }
              if (-var10 + this.field_i > -1 &&
                this.field_i - var10 < this.field_e &&
                this.field_b + var11 > -1 &&
                var11 + this.field_b < this.field_l) {
                this.a(25, var11, this.field_b, -var10, this.field_i, param3);
              }
              if (var10 + this.field_i > -1 &&
                this.field_e > this.field_i + var10 &&
                -1 < this.field_b - var11 &&
                this.field_l > -var11 + this.field_b) {
                this.a(25, -var11, this.field_b, var10, this.field_i, param3);
              }
            }
          }
        }
        var8 = this.a(param1, (byte) 112, param5) ? 1 : 0;
        return var8 != 0;
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, boolean param6, int[] param7, int param8, int param9, boolean param10, int[] param11, int param12, int param13) {
        int var15_int = 0;
        int var16 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        int var17 = 0;
        int var18 = 0;
        int var21 = 0;
        int var22 = 0;
        var22 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param2 != -1) {
            this.field_i = 124;
          }
          for (var15_int = param13; var15_int <= param4; var15_int++) {
            for (var16 = param3; param9 >= var16; var16++) {
              var17 = param7[this.field_e * var15_int + var16];
              if (var17 <= param12) {
                stackIn_12_0 = (var17 != 0) ? 6 : 7;
                var18 = stackIn_12_0;
                this.a((byte) -108);
                this.field_i = var16;
                this.field_n = param8;
                this.field_b = var15_int;
                for (var19 = this.field_n; var19 >= 0; var19--) {
                  for (var20 = -var19; var20 < var19; var20++) {
                    var21 = var19 + Math.abs(var20);
                    if (param0 <= var21 &&
                      var21 <= param8) {
                      if (this.field_i + var20 > -1 &&
                        this.field_e > this.field_i + var20 &&
                        this.field_b + var19 > -1 &&
                        this.field_l > var19 + this.field_b && (7 == var18 ||
                        param11[(var19 + this.field_b) * this.field_e + var20 + this.field_i] == 0)) {
                        this.a(25, var19, this.field_b, var20, this.field_i, param10);
                        param11[var20 + (this.field_i + (var19 + this.field_b) * this.field_e)] = oe.c(param11[var20 + (this.field_i + (var19 + this.field_b) * this.field_e)], rn.a(this.a((byte) 114, param5, this.field_b + var19, param6, var20 + this.field_i, var21, param10, param1), var18));
                      }
                      if (-var20 + this.field_i > -1 &&
                        this.field_e > -var20 + this.field_i &&
                        this.field_b - var19 > -1 &&
                        this.field_b - var19 < this.field_l && (7 == var18 ||
                        param11[(-var19 + this.field_b) * this.field_e + (-var20 + this.field_i)] == 0)) {
                        this.a(param2 + 26, -var19, this.field_b, -var20, this.field_i, param10);
                        param11[this.field_i - var20 + (-var19 + this.field_b) * this.field_e] = oe.c(param11[this.field_i - var20 + (-var19 + this.field_b) * this.field_e], rn.a(this.a((byte) 114, param5, -var19 + this.field_b, param6, -var20 + this.field_i, var21, param10, param1), var18));
                      }
                      if (-var19 + this.field_i > -1 &&
                        this.field_e > -var19 + this.field_i &&
                        this.field_b + var20 > -1 &&
                        this.field_b + var20 < this.field_l && (7 == var18 ||
                        param11[-var19 + this.field_i + (var20 + this.field_b) * this.field_e] == 0)) {
                        this.a(param2 + 26, var20, this.field_b, -var19, this.field_i, param10);
                        param11[this.field_i - var19 + this.field_e * (var20 + this.field_b)] = oe.c(param11[this.field_i - var19 + this.field_e * (var20 + this.field_b)], rn.a(var18, this.a((byte) 114, param5, this.field_b + var20, param6, this.field_i - var19, var21, param10, param1)));
                      }
                      if (this.field_i + var19 > -1 &&
                        this.field_e > this.field_i + var19 &&
                        this.field_b - var20 > -1 &&
                        -var20 + this.field_b < this.field_l && (var18 == 7 ||
                        param11[var19 + (this.field_i + (this.field_b - var20) * this.field_e)] == 0)) {
                        this.a(param2 + 26, -var20, this.field_b, var19, this.field_i, param10);
                        param11[(this.field_b - var20) * this.field_e + var19 + this.field_i] = oe.c(param11[(this.field_b - var20) * this.field_e + var19 + this.field_i], rn.a(var18, this.a((byte) 114, param5, -var20 + this.field_b, param6, this.field_i + var19, var21, param10, param1)));
                      }
                    }
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_60_0 = var15;
          stackIn_60_1 = new StringBuilder().append("ul.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          stackIn_63_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param12).append(',').append(param13).append(')').toString());
        }
    }

    private final int a(byte param0, int param1, int param2, boolean param3, int param4, int param5, boolean param6, boolean param7) {
        int var9 = 0;
        Unit var10 = null;
        if (param0 != 114) {
          field_j = (String) null;
        }
        if (this.a(param4, (byte) 112, param2)) {
          if (param5 > 1) {
            if (0 != (2 & this.field_h.getTileEffects(31, this.field_b, this.field_i, param1))) {
              return 0;
            }
            if ((2 & this.field_h.getTileEffects(param0 - 83, param2, param4, param1)) != 0) {
              return 0;
            }
          }
          var9 = 3;
          var10 = this.field_k[param4 + param2 * this.field_e].occupant;
          if (var10 != null &&
            (!this.field_h.arePlayersAllied(var10.ownerPlayer, -16985, param1) || param3) &&
            (var10.getUnitCategory(0) != 4 || param6 || param7)) {
            var9 = var9 | 4;
          }
          return var9;
        }
        return 0;
    }

    final static void a(Random param0, Battlefield param1, byte param2, int param3) {
        MapTile[] stackIn_152_0;
        int stackIn_152_1;
        MapTile stackIn_152_2;
        MapTile stackIn_152_3;
        MapTile stackIn_154_2 = null;
        MapTile stackIn_154_3 = null;
        int stackIn_154_4 = 0;
        RuntimeException stackIn_160_0 = null;
        StringBuilder stackIn_160_1 = null;
        String stackIn_161_2 = null;
        StringBuilder stackIn_163_1 = null;
        String stackIn_164_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ArmiesOfGielinor var10 = null;
        MapTile stackIn_152_2Lifetime1;
        MapTile stackIn_152_3Lifetime1;
        MapTile stackIn_154_2Lifetime1;
        MapTile stackIn_154_3Lifetime1;
        MapTile stackIn_152_2Lifetime1Lifetime1;
        MapTile stackIn_152_3Lifetime1Lifetime1;
        int var4_intLifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4_int = param3;
          if (0 == var4_int) {
            for (var4_int = 0; param1.mapWidth > var4_int; var4_int++) {
              for (var5 = 0; param1.mapHeight > var5; var5++) {
                var6 = Math.abs(-10 + (AttackEvent.a(false, 2, param0) + (var4_int + 10)) % 20);
                var7 = Math.abs((AttackEvent.a(false, 2, param0) + (var5 + 10)) % 20 - 10);
                if (var7 + 2 * var6 < 6) {
                  param1.tiles[param1.mapWidth * var5 + var4_int] = new MapTile(2, param1);
                }
                if (6 > var6 + var7 * 2) {
                  param1.tiles[param1.mapWidth * var5 + var4_int] = new MapTile(2, param1);
                }
              }
            }
          } else {
            if (var4_int == 1) {
              for (var4_int = 0; param1.mapWidth > var4_int; var4_int++) {
                for (var5 = 0; param1.mapHeight > var5; var5++) {
                  var6 = Math.abs(var4_int - (param1.mapWidth >> 1));
                  var7 = Math.abs(var5 - (param1.mapHeight >> 1));
                  var8 = AttackEvent.a(false, 2, param0);
                  if (var6 < var8 + 12 &&
                    var6 > var8 + 7 ||
                    var8 + 12 > var7 &&
                    var7 > var8 + 7) {
                    param1.tiles[var4_int + var5 * param1.mapWidth] = new MapTile(6, param1);
                  }
                }
              }
            } else {
              if (2 == var4_int) {
                for (var4_int = 0; param1.mapWidth > var4_int; var4_int++) {
                  for (var5 = 0; param1.mapHeight > var5; var5++) {
                    var6 = Math.abs(-(param1.mapWidth >> 1) + var4_int);
                    var7 = Math.abs(-(param1.mapHeight >> 1) + var5);
                    var8 = AttackEvent.a(false, 2, param0);
                    if ((var8 + 8) > var6 &&
                      var7 < var8 + 8 &&
                      (var7 + var6) * 2 / 3 < 8 + var8) {
                      param1.tiles[var5 * param1.mapWidth + var4_int] = new MapTile(0, param1);
                    } else if (var6 < var8 + 12 &&
                      var8 + 12 > var7 &&
                      2 * (var7 + var6) / 3 < 12 + var8) {
                      param1.tiles[param1.mapWidth * var5 + var4_int] = new MapTile(5, param1);
                    } else {
                      if ((var4_int + var8) % 20 >= (-9 + var7 + var8) / 5) {
                        if ((var8 + var5) % 20 >= (var6 + var8 - 9) / 5) {
                          if ((-9 + (var7 + var8)) / 5 > 20 - (var8 + var4_int) % 20) {
                            param1.tiles[var5 * param1.mapWidth + var4_int] = new MapTile(2, param1);
                          } else {
                            if ((var8 + (var6 - 9)) / 5 > 20 - (var5 + var8) % 20) {
                              param1.tiles[var4_int + var5 * param1.mapWidth] = new MapTile(2, param1);
                            }
                          }
                        } else {
                          param1.tiles[var5 * param1.mapWidth + var4_int] = new MapTile(2, param1);
                        }
                      } else {
                        param1.tiles[var4_int + param1.mapWidth * var5] = new MapTile(2, param1);
                      }
                    }
                  }
                }
              } else {
                if (var4_int != 3) {
                  if (4 == var4_int) {
                    for (var4_int = 0; param1.mapWidth > var4_int; var4_int++) {
                      for (var5 = 0; var5 < param1.mapHeight; var5++) {
                        var6 = Math.abs(var4_int - (param1.mapWidth >> 1));
                        var7 = Math.abs(-(param1.mapHeight >> 1) + var5);
                        var8 = AttackEvent.a(false, 2, param0);
                        if (8 + var8 > var6 &&
                          var8 + 8 > var7 &&
                          (var7 + var6) * 2 / 3 < var8 + 8) {
                          param1.tiles[var4_int + var5 * param1.mapWidth] = new MapTile(0, param1);
                        } else if (var6 < var8 + 12 &&
                          var8 + 12 > var7 &&
                          var8 + 12 > (var6 + var7) * 2 / 3) {
                          param1.tiles[var4_int + param1.mapWidth * var5] = new MapTile(3, param1);
                        } else {
                          if ((var4_int + var8) % 20 < (var7 + var8 - 9) / 5) {
                            param1.tiles[var4_int + param1.mapWidth * var5] = new MapTile(2, param1);
                          } else {
                            if ((var8 + var6 - 9) / 5 > (var5 + var8) % 20) {
                              param1.tiles[var5 * param1.mapWidth + var4_int] = new MapTile(2, param1);
                            } else {
                              if (20 - (var4_int + var8) % 20 < (var7 + var8 - 9) / 5) {
                                param1.tiles[var5 * param1.mapWidth + var4_int] = new MapTile(2, param1);
                              } else {
                                if ((var8 + (var6 - 9)) / 5 > -((var8 + var5) % 20) + 20) {
                                  param1.tiles[param1.mapWidth * var5 + var4_int] = new MapTile(2, param1);
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (5 == var4_int) {
                      for (var4_int = 0; var4_int < param1.mapWidth; var4_int++) {
                        for (var5 = 0; param1.mapHeight > var5; var5++) {
                          var6 = Math.abs(-(param1.mapWidth >> 1) + var4_int);
                          var7 = Math.abs(var5 - (param1.mapHeight >> 1));
                          var8 = AttackEvent.a(false, 2, param0);
                          if (var6 < (8 + var8) &&
                            var7 < 8 + var8 &&
                            (var6 + var7) * 2 / 3 < var8 + 8) {
                            param1.tiles[param1.mapWidth * var5 + var4_int] = new MapTile(0, param1);
                          } else if (var6 < 12 + var8 &&
                            var7 < 12 + var8 &&
                            2 * (var7 + var6) / 3 < var8 + 12) {
                            param1.tiles[var4_int + param1.mapWidth * var5] = new MapTile(3, param1);
                          } else {
                            if ((var8 + var7 - 15) / 5 > (var8 + var4_int) % 20) {
                              param1.tiles[param1.mapWidth * var5 + var4_int] = new MapTile(2, param1);
                            } else {
                              if ((var6 - (-var8 + 15)) / 5 <= (var8 + var5) % 20) {
                                if ((var8 + var4_int) % 20 < (var8 + var7 - 8) / 5) {
                                  param1.tiles[var4_int + var5 * param1.mapWidth] = new MapTile(3, param1);
                                } else {
                                  if ((var5 + var8) % 20 >= (var8 + (var6 - 8)) / 5) {
                                    if ((var8 + var7 - 8) / 5 <= 20 - (var4_int + var8) % 20) {
                                      if (-((var8 + var5) % 20) + 20 < (-8 + var8 + var6) / 5) {
                                        param1.tiles[param1.mapWidth * var5 + var4_int] = new MapTile(3, param1);
                                      }
                                    } else {
                                      param1.tiles[var4_int + var5 * param1.mapWidth] = new MapTile(3, param1);
                                    }
                                  } else {
                                    param1.tiles[param1.mapWidth * var5 + var4_int] = new MapTile(3, param1);
                                  }
                                }
                              } else {
                                param1.tiles[var4_int + var5 * param1.mapWidth] = new MapTile(2, param1);
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (var4_int == 6) {
                        for (var4_int = 0; var4_int < param1.mapWidth; var4_int++) {
                          for (var5 = 0; var5 < param1.mapHeight; var5++) {
                            var6 = Math.abs(var4_int - (param1.mapWidth >> 1));
                            var7 = Math.abs(-(param1.mapHeight >> 1) + var5);
                            var8 = AttackEvent.a(false, 2, param0);
                            if (var6 < (var8 + 8) &&
                              var7 < var8 + 8 &&
                              8 + var8 > (var7 + var6) * 2 / 3) {
                              param1.tiles[var4_int + var5 * param1.mapWidth] = new MapTile(0, param1);
                            } else if (var6 < 11 + var8 &&
                              11 + var8 > var7 &&
                              11 + var8 > (var7 + var6) * 2 / 3) {
                              param1.tiles[var4_int + var5 * param1.mapWidth] = new MapTile(4, param1);
                            } else {
                              if ((-15 + var7 + var8) / 5 <= (var8 + var4_int) % 20) {
                                if ((var8 + var6 - 15) / 5 <= (var5 + var8) % 20) {
                                  if ((-12 + var7 + var8) / 5 <= (var8 + var4_int) % 20) {
                                    if ((-12 + var8 + var6) / 5 > (var8 + var5) % 20) {
                                      param1.tiles[var5 * param1.mapWidth + var4_int] = new MapTile(3, param1);
                                    }
                                  } else {
                                    param1.tiles[param1.mapWidth * var5 + var4_int] = new MapTile(3, param1);
                                  }
                                } else {
                                  param1.tiles[var4_int + var5 * param1.mapWidth] = new MapTile(2, param1);
                                }
                              } else {
                                param1.tiles[param1.mapWidth * var5 + var4_int] = new MapTile(2, param1);
                              }
                            }
                          }
                        }
                        param1.tiles[24 + (AttackEvent.a(false, 3, param0) + (AttackEvent.a(false, 3, param0) + 24) * param1.mapWidth)] = new MapTile(7, param1);
                        param1.tiles[AttackEvent.a(false, 3, param0) + 24 + (AttackEvent.a(false, 3, param0) + 34) * param1.mapWidth] = new MapTile(7, param1);
                        param1.tiles[AttackEvent.a(false, 3, param0) + 34 + (24 + AttackEvent.a(false, 3, param0)) * param1.mapWidth] = new MapTile(7, param1);
                        param1.tiles[AttackEvent.a(false, 3, param0) + 34 + (34 + AttackEvent.a(false, 3, param0)) * param1.mapWidth] = new MapTile(7, param1);
                      }
                    }
                  }
                }
              }
            }
          }
          if (param3 == 3 ||
            1 == param3) {
            UnitInfoPopup.a(25, (byte) 101, 1, 25, 10, true, 10, param1, param0);
            UnitInfoPopup.a(35, (byte) 101, 1, 35, 50, true, 50, param1, param0);
            UnitInfoPopup.a(25, (byte) 101, 1, 35, 10, true, 50, param1, param0);
            UnitInfoPopup.a(35, (byte) 101, 1, 25, 50, true, 10, param1, param0);
            UnitInfoPopup.a(30, (byte) 101, 1, 25, 30, true, 10, param1, param0);
            UnitInfoPopup.a(30, (byte) 101, 1, 35, 30, true, 50, param1, param0);
            UnitInfoPopup.a(35, (byte) 101, 1, 30, 50, true, 30, param1, param0);
            UnitInfoPopup.a(25, (byte) 101, 1, 30, 10, true, 30, param1, param0);
          }
          var4_intLifetime1 = 30;
          var5Lifetime1 = 30;
          if (param2 != 85) {
            var10 = (ArmiesOfGielinor) null;
            ul.a((ru[]) null, (byte) -17, (ArmiesOfGielinor) null);
          }
          var6Lifetime1 = 15 + AttackEvent.a(false, 15, param0);
          for (var7Lifetime1 = 0; var6Lifetime1 > var7Lifetime1; var7Lifetime1++) {
            while (param1.tiles[var4_intLifetime1 + var5Lifetime1 * param1.mapWidth] != null) {
              if (param1.tiles[param1.mapWidth * var5Lifetime1 + var4_intLifetime1].terrainType != 0 &&
                param1.tiles[var5Lifetime1 * param1.mapWidth + var4_intLifetime1].terrainType != 1) {
                var4_intLifetime1 = AttackEvent.a(false, 14, param0) + 23;
                var5Lifetime1 = 23 + AttackEvent.a(false, 14, param0);
                continue;
              }
              break;
            }
            boolean decompiledFrameRemainder0 = true;
            stackIn_152_0 = param1.tiles;
            stackIn_152_1 = var4_intLifetime1 + var5Lifetime1 * param1.mapWidth;
            stackIn_152_2 = null;
            stackIn_152_3 = null;
            if (var4_intLifetime1 > 27) {
              stackIn_152_2Lifetime1 = null;
              stackIn_152_3Lifetime1 = null;
              if (var5Lifetime1 > 27) {
                stackIn_152_2Lifetime1Lifetime1 = null;
                stackIn_152_3Lifetime1Lifetime1 = null;
                if (var4_intLifetime1 < 33 &&
                  var5Lifetime1 < 33) {
                  stackIn_154_2 = null;
                  stackIn_154_3 = null;
                  stackIn_154_4 = 9;
                  decompiledFrameRemainder0 = false;
                }
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_154_2Lifetime1 = null;
              stackIn_154_3Lifetime1 = null;
              stackIn_154_4 = 8;
            }
            stackIn_152_0[stackIn_152_1] = new MapTile(stackIn_154_4, param1);
            if (param3 == 3) {
              qp.a(var5Lifetime1, 30, -1, 30, var4_intLifetime1, 0, param1, 1, param0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_160_0 = var4;
          stackIn_160_1 = new StringBuilder().append("ul.B(");
          if (param0 == null) {
            stackIn_161_2 = "null";
          } else {
            stackIn_161_2 = "{...}";
          }
          stackIn_163_1 = ((StringBuilder) (Object) stackIn_160_1).append(stackIn_161_2).append(',');
          if (param1 == null) {
            stackIn_164_2 = "null";
          } else {
            stackIn_164_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_160_0), ((StringBuilder) (Object) stackIn_163_1).append(stackIn_164_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 >= -9) {
          this.field_k = (MapTile[]) null;
        }
        for (var2 = 0; var2 < 900; var2++) {
          this.field_c[var2] = false;
        }
        this.field_c[465] = true;
    }

    final static void a(ru[] param0, byte param1, ArmiesOfGielinor param2) {
        try {
          br.field_a = new oo(param2, bi.field_c, param0, new String[]{hi.field_a, LeaderEscortCondition.field_b, ft.field_o, pp.field_S, bj.field_q});
          if (param1 <= 56) {
            field_g = (RgbSprite) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ul.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int stackIn_20_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_49_0 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (0 <= param3 + param4 &&
          this.field_e > param3 + param4 &&
          0 <= param1 + param2 &&
          param1 + param2 < this.field_l) {
          if (this.field_c[param3 + (15 + 30 * param1 + 450)]) {
            return;
          }
          if (param0 != 25) {
            return;
          }
          if (param3 == 0 &&
            param1 == 0) {
            this.field_c[30 * param1 + 450 + param3 + 15] = true;
            return;
          }
          if (param3 == 0) {
            stackIn_20_0 = (param1 <= 0) ? -1 : 1;
            var7 = stackIn_20_0;
            param1 = param1 * var7;
            var8 = 1;
            while (param1 >= var8) {
              var9 = (var8 * var7 + param2) * this.field_e + param4;
              this.field_c[param3 + 15 + 30 * (var8 * var7 + 15)] = true;
              if (!param5 &&
                this.field_k[var9].b(param0 + 903)) {
                return;
              }
              var8++;
            }
            return;
          }
          if (param1 == 0) {
            stackIn_34_0 = (param3 > 0) ? 1 : -1;
            var7Lifetime1 = stackIn_34_0;
            param3 = param3 * var7Lifetime1;
            var8Lifetime1 = 1;
            while (var8Lifetime1 <= param3) {
              var9Lifetime1 = var8Lifetime1 * var7Lifetime1 + param4 + this.field_e * param2;
              this.field_c[param1 * 30 + 450 + var7Lifetime1 * var8Lifetime1 + 15] = true;
              if (!param5 &&
                this.field_k[var9Lifetime1].b(928)) {
                return;
              }
              var8Lifetime1++;
            }
            return;
          }
          stackIn_46_0 = (param3 <= 0) ? -1 : 1;
          var7Lifetime2 = stackIn_46_0;
          stackIn_49_0 = (param1 <= 0) ? -1 : 1;
          var8Lifetime2 = stackIn_49_0;
          param3 = param3 * var7Lifetime2;
          param1 = param1 * var8Lifetime2;
          if (param1 >= param3) {
            for (var9Lifetime2 = 1; param1 >= var9Lifetime2; var9Lifetime2++) {
              var10 = param3 * var9Lifetime2 / param1;
              var11 = (param2 + var8Lifetime2 * var9Lifetime2) * this.field_e + (param4 + var7Lifetime2 * var10);
              this.field_c[var7Lifetime2 * var10 + (15 + (15 + var8Lifetime2 * var9Lifetime2) * 30)] = true;
              if (!param5 &&
                this.field_k[var11].b(928)) {
                return;
              }
            }
            return;
          }
          for (var9Lifetime3 = 1; param3 >= var9Lifetime3; var9Lifetime3++) {
            var10Lifetime1 = param1 * var9Lifetime3 / param3;
            var11Lifetime1 = var9Lifetime3 * var7Lifetime2 + (param4 + this.field_e * (param2 + var10Lifetime1 * var8Lifetime2));
            this.field_c[15 + var7Lifetime2 * var9Lifetime3 + (15 + var8Lifetime2 * var10Lifetime1) * 30] = true;
            if (!param5 &&
              this.field_k[var11Lifetime1].b(928)) {
              return;
            }
          }
          return;
        }
    }

    ul(Battlefield param0, MapTile[] param1, int param2, int param3) {
        this.field_c = new boolean[900];
        this.field_n = 0;
        this.field_b = 0;
        this.field_i = 0;
        try {
          this.field_h = param0;
          this.field_l = param3;
          this.field_e = param2;
          this.field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ul.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_f = "OK";
        field_j = "Start Mission";
        field_d = 0;
        field_o = "Names cannot contain consecutive spaces";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$5d483ac33914(int param0, String param1, NodeDeque param2) {
        try {
          fq.a(param2, param1, 0, false);
          if (param0 != -80) {
            field_m = true;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ul.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }
}
