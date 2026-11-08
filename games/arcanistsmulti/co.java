/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class co {
    static SceneWidget field_f;
    static am field_h;
    static String field_b;
    static String field_d;
    static boolean[][] field_a;
    static int field_c;
    static String field_i;
    static java.util.zip.CRC32 field_g;
    static int[] field_e;

    public static void releaseStatics(int param0) {
        field_a = (boolean[][]) null;
        field_i = null;
        field_h = null;
        field_f = null;
        if (param0 > -42) {
          co.resetBattleState(8);
        }
        field_d = null;
        field_g = null;
        field_e = null;
        field_b = null;
    }

    final static int countUnitsOfType40(int param0) {
        IntrusiveDeque var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        BattleUnit var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var1 = rk.field_O.getUnits((byte) 56);
          var2 = 0;
          var3 = (BattleUnit) (var1.first(param0 + 33298));
          if (param0 != -20675) {
            field_h = (am) null;
          }
          while (var3 != null) {
            if (40 == var3.field_jb) {
              var2++;
            }
            var3 = (BattleUnit) (var1.next(0));
          }
          stackIn_8_0 = var2;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var1_ref), "co.C(" + param0 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void resetBattleState(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        BattleUnit var6 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          WhirlpoolHasher.field_k = 0;
          rk.field_O.field_X[0] = 0;
          qn.field_ob.field_t = false;
          rk.field_O.field_D = false;
          rk.field_O.startTurn(0, true, 0);
          qn.field_ob.field_bb = 0;
          rk.field_O.setCurrentPlayer(-4207, 0);
          rk.field_O.setSeed(3, true);
          rk.field_O.field_y = 1920;
          rk.field_O.field_H = 960;
          if (StatefulTextPainter.field_p == 0) {
            rk.field_O.field_y = 1280;
            rk.field_O.field_H = 480;
            rk.field_O.setSeed(9, true);
          }
          if (StatefulTextPainter.field_p == 1) {
            rk.field_O.field_y = 960;
            rk.field_O.field_H = 960;
            rk.field_O.setSeed(33, true);
          }
          if (StatefulTextPainter.field_p == 2) {
            rk.field_O.setSeed(3, true);
          }
          if (3 == StatefulTextPainter.field_p) {
            rk.field_O.setSeed(9, true);
          }
          if (StatefulTextPainter.field_p == 4) {
            rk.field_O.setSeed(15, true);
          }
          if (StatefulTextPainter.field_p == 5) {
            rk.field_O.setSeed(33, true);
          }
          if (StatefulTextPainter.field_p == 6) {
            rk.field_O.setSeed(39, true);
          }
          if (StatefulTextPainter.field_p == 7) {
            rk.field_O.setSeed(45, true);
          }
          rk.field_O.field_Hb = rk.field_O.field_H >> 1;
          rk.field_O.field_hb = rk.field_O.field_y >> 1;
          rk.field_O.generateTerrain(649860712, true);
          if (DelegatingCanvas.field_c[rk.field_O.getArenaTheme(-31497) + 1] != null) {
            SpellProjectile.playMusic(DelegatingCanvas.field_c[rk.field_O.getArenaTheme(-31497) + 1], 3);
          }
          qn.field_ob.renderBackgroundImage(413355681);
          rk.field_O.clearUnits((byte) -96);
          var2 = StatefulTextPainter.field_p;
          if (var2 == 0) {
            rk.field_O.setDisplayFlags(false, -1, false);
            qn.field_ob.field_y = false;
            qn.field_ob.field_G = false;
            rk.field_O.clearFirstPlayerSlots((byte) 19);
            rk.field_O.setSpellSlot(0, 0, -1, 68, 12);
            rk.field_O.addUnit((byte) -124, new BattleUnit(0, 167, 134, rk.field_O.nextUnitId(-107), rk.field_O, 0));
            rk.field_O.addUnit((byte) -122, new BattleUnit(40, 437, 93, rk.field_O.nextUnitId(-71), rk.field_O, 1));
            rk.field_O.addUnit((byte) -124, new BattleUnit(40, 707, 90, rk.field_O.nextUnitId(-88), rk.field_O, 2));
            rk.field_O.addUnit((byte) -127, new BattleUnit(40, 996, 164, rk.field_O.nextUnitId(-105), rk.field_O, 3));
            rk.field_O.setPlayerCount(1, (byte) -121);
          } else {
            if (var2 != 1) {
              if (var2 == 2) {
                rk.field_O.setDisplayFlags(false, -1, false);
                qn.field_ob.field_G = false;
                qn.field_ob.field_y = false;
                rk.field_O.clearFirstPlayerSlots((byte) 19);
                rk.field_O.setSpellSlot(0, 0, -1, 21, 0);
                rk.field_O.addUnit((byte) -117, new BattleUnit(0, 1058, 238, rk.field_O.nextUnitId(-85), rk.field_O, 0));
                rk.field_O.addUnit((byte) -126, new BattleUnit(40, 505, 334, rk.field_O.nextUnitId(-100), rk.field_O, 1));
                rk.field_O.addUnit((byte) -126, new BattleUnit(40, 1297, 566, rk.field_O.nextUnitId(-84), rk.field_O, 2));
                rk.field_O.addUnit((byte) -115, new BattleUnit(40, 1515, 153, rk.field_O.nextUnitId(-87), rk.field_O, 3));
                rk.field_O.setPlayerCount(1, (byte) 38);
              } else {
                if (var2 != 3) {
                  if (var2 == 4) {
                    rk.field_O.setDisplayFlags(true, -1, false);
                    qn.field_ob.field_G = true;
                    qn.field_ob.field_y = false;
                    rk.field_O.clearFirstPlayerSlots((byte) 19);
                    rk.field_O.setSpellSlot(0, 0, -1, 78, 10);
                    rk.field_O.addUnit((byte) -125, new BattleUnit(0, 803, 366, rk.field_O.nextUnitId(-97), rk.field_O, 0));
                    rk.field_O.addUnit((byte) -124, new BattleUnit(40, 300, 110, rk.field_O.nextUnitId(-75), rk.field_O, 1));
                    rk.field_O.addUnit((byte) -120, new BattleUnit(40, 1440, 465, rk.field_O.nextUnitId(-80), rk.field_O, 2));
                    rk.field_O.addUnit((byte) -121, new BattleUnit(40, 740, 327, rk.field_O.nextUnitId(-115), rk.field_O, 3));
                    rk.field_O.setPlayerCount(1, (byte) 115);
                  } else {
                    if (var2 != 5) {
                      if (6 != var2) {
                        if (var2 == 7) {
                        }
                        rk.field_O.setDisplayFlags(true, -1, true);
                        qn.field_ob.field_y = false;
                        qn.field_ob.field_G = true;
                        if (9 != rk.field_O.field_x[0]) {
                          rk.field_O.addUnit((byte) -127, new BattleUnit(0, 910, 181, rk.field_O.nextUnitId(-93), rk.field_O, 0));
                        } else {
                          rk.field_O.addUnit((byte) -115, new BattleUnit(27, 910, 181, rk.field_O.nextUnitId(-115), rk.field_O, 0));
                        }
                        rk.field_O.setPlayerCount(1, (byte) 29);
                        rk.field_O.clearFirstPlayerSlots((byte) 19);
                        for (var2 = 0; var2 < 16; var2++) {
                          var3 = b.field_f[var2];
                          if (var3 != -1) {
                            var4 = MouseWheelHandler.field_b[var3];
                            if (MouseWheelHandler.field_b[var3] == -1) {
                              var4 = 1;
                            }
                            if (MouseWheelHandler.field_b[var3] == 0) {
                              var4 = -1;
                            }
                            rk.field_O.setSpellSlot(0, var2, var4, 27, var3);
                            rk.field_O.setSpellSlot(1, var2, var4, 67, var3);
                            rk.field_O.setSpellSlot(2, var2, var4, 75, var3);
                            rk.field_O.setSpellSlot(3, var2, var4, 36, var3);
                          }
                        }
                        var1_int = 10;
                        for (var2 = 0; var2 <= 4; var2++) {
                          if (0 <= b.field_f[var2] &&
                            0 == b.field_f[var2] % 12 &&
                            b.field_f[11 + var2] == 11 + b.field_f[var2]) {
                            var1_int = b.field_f[var2] / 12 - 1;
                            if (var1_int == -1) {
                              var1_int = 10;
                              if (qf.field_d >= 2) {
                                var1_int = 9;
                              }
                            }
                          }
                        }
                        rk.field_O.field_x[0] = var1_int;
                        rk.field_O.field_X[0] = 0;
                        rk.field_O.field_Ab[0] = 0;
                        rk.field_O.field_o[0] = 0;
                        rk.field_O.startTurn(0, true, 0);
                      } else {
                        rk.field_O.setDisplayFlags(true, -1, true);
                        qn.field_ob.field_G = true;
                        qn.field_ob.field_y = true;
                        rk.field_O.startTurn(0, true, 0);
                        rk.field_O.clearFirstPlayerSlots((byte) 19);
                        rk.field_O.setSpellSlot(0, 0, -1, 59, 0);
                        rk.field_O.setSpellSlot(0, 1, -1, 67, 12);
                        rk.field_O.setSpellSlot(0, 2, -1, 28, 14);
                        rk.field_O.addUnit((byte) -116, new BattleUnit(0, 707, 365, rk.field_O.nextUnitId(-92), rk.field_O, 0));
                        rk.field_O.addUnit((byte) -119, new BattleUnit(3, 341, -rk.field_O.field_H, rk.field_O.nextUnitId(-119), rk.field_O, 1));
                        rk.field_O.addUnit((byte) -117, new BattleUnit(3, 1152, -rk.field_O.field_H, rk.field_O.nextUnitId(-116), rk.field_O, 2));
                        rk.field_O.addUnit((byte) -118, new BattleUnit(3, 1546, -rk.field_O.field_H, rk.field_O.nextUnitId(-111), rk.field_O, 3));
                        rk.field_O.setPlayerCount(4, (byte) -105);
                      }
                    } else {
                      rk.field_O.setDisplayFlags(true, -1, false);
                      qn.field_ob.field_y = false;
                      qn.field_ob.field_G = true;
                      rk.field_O.clearFirstPlayerSlots((byte) 19);
                      rk.field_O.setSpellSlot(0, 0, -1, 68, 6);
                      rk.field_O.addUnit((byte) -120, new BattleUnit(0, 768, 399, rk.field_O.nextUnitId(-115), rk.field_O, 0));
                      rk.field_O.addUnit((byte) -116, new BattleUnit(40, 403, 543, rk.field_O.nextUnitId(-119), rk.field_O, 1));
                      rk.field_O.addUnit((byte) -127, new BattleUnit(40, 1033, 510, rk.field_O.nextUnitId(-83), rk.field_O, 2));
                      rk.field_O.addUnit((byte) -125, new BattleUnit(40, 1549, 98, rk.field_O.nextUnitId(-112), rk.field_O, 3));
                      rk.field_O.setPlayerCount(1, (byte) -87);
                    }
                  }
                } else {
                  rk.field_O.setDisplayFlags(false, -1, false);
                  qn.field_ob.field_G = false;
                  qn.field_ob.field_y = false;
                  rk.field_O.clearFirstPlayerSlots((byte) 19);
                  rk.field_O.setSpellSlot(0, 0, -1, 54, 20);
                  rk.field_O.startTurn(12, true, 0);
                  rk.field_O.addUnit((byte) -126, new BattleUnit(0, 1143, 572, rk.field_O.nextUnitId(-72), rk.field_O, 0));
                  rk.field_O.addUnit((byte) -119, new BattleUnit(40, 373, 532, rk.field_O.nextUnitId(-75), rk.field_O, 1));
                  rk.field_O.addUnit((byte) -124, new BattleUnit(40, 781, 248, rk.field_O.nextUnitId(-72), rk.field_O, 2));
                  rk.field_O.addUnit((byte) -126, new BattleUnit(40, 1349, 244, rk.field_O.nextUnitId(-124), rk.field_O, 3));
                  rk.field_O.setPlayerCount(1, (byte) 48);
                }
              }
            } else {
              rk.field_O.setDisplayFlags(false, -1, false);
              qn.field_ob.field_G = false;
              qn.field_ob.field_y = false;
              rk.field_O.clearFirstPlayerSlots((byte) 19);
              rk.field_O.setSpellSlot(0, 0, -1, 86, 14);
              rk.field_O.addUnit((byte) -123, new BattleUnit(0, 608, 307, rk.field_O.nextUnitId(-71), rk.field_O, 0));
              rk.field_O.addUnit((byte) -121, new BattleUnit(40, 228, 687, rk.field_O.nextUnitId(-128), rk.field_O, 1));
              rk.field_O.addUnit((byte) -124, new BattleUnit(40, 423, 667, rk.field_O.nextUnitId(-85), rk.field_O, 2));
              rk.field_O.addUnit((byte) -119, new BattleUnit(40, 766, 301, rk.field_O.nextUnitId(-84), rk.field_O, 3));
              rk.field_O.setPlayerCount(1, (byte) -95);
            }
          }
          ce.field_m.makeRasterTarget(true);
          qn.field_ob.field_z = gj.field_a[rk.field_O.field_F];
          if (param0 <= 103) {
            co.resetBattleState(-94);
          }
          var6 = rk.field_O.getUnitByOwner(0, true);
          if (var6 != null) {
            qn.field_ob.field_m.followUnit(-88, var6);
            qn.field_ob.field_bb = var6.field_T;
          } else {
            qn.field_ob.field_bb = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var1), "co.A(" + param0 + ')');
        }
    }

    static {
        field_b = "MOST RESILIENT - ";
        field_h = new am();
        field_d = "Your account has had its rating reset as we suspect that you have been involved in ratings transfer.<br>If you feel that this is not the case, please post a query by submitting a bug report on the FunOrb main site.<br><br>We will not respond to any other forms of communication on this matter.";
        field_i = "Time left:";
        field_a = new boolean[][]{null, new boolean[]{false, false, false, false, false, false, false, false, true, false}, null};
        field_g = new java.util.zip.CRC32();
    }
}
