/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class PopupPresentation implements EventPresentation {
    private int field_i;
    static Calendar field_c;
    private int[] field_q;
    private boolean field_a;
    private EventPresenter presenter;
    private BattleCamera camera;
    private int[][] field_t;
    private MapTile[] field_g;
    private int field_s;
    static String field_e;
    private int field_m;
    static String field_p;
    private int field_n;
    static ResourceArchive field_j;
    private int elapsedFrames;
    static String field_l;
    private int field_r;
    private Battlefield battlefield;
    private Unit unit;
    private int field_f;

    private final void f(int param0) {
        this.a(param0 - 131, this.field_r, this.field_f);
        if (param0 != 3) {
          field_l = (String) null;
        }
    }

    public final void requestFinish(int obfuscationGuard) {
        if (obfuscationGuard <= 94) {
          this.battlefield = (Battlefield) null;
        }
    }

    public final void drawOverlayLayer(byte obfuscationGuard) {
        int var2;
        int var3;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = this.field_n;
        if (0 == var2) {
          this.c(obfuscationGuard + 55);
        } else {
          if (var2 == 3) {
            this.c(3);
          } else {
            if (4 == var2) {
              this.c(obfuscationGuard ^ -49);
            }
          }
        }
        if (obfuscationGuard != -52) {
          this.field_g = (MapTile[]) null;
        }
    }

    public final void advanceFrame(GameEvent event, byte obfuscationGuard) {
        int var4 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_14_3;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.camera.gridPosition[0] = this.presenter.tileIndex % this.field_s;
          this.camera.gridPosition[1] = this.presenter.tileIndex / this.field_s;
          this.camera.projectGridToTarget(-48);
          this.camera.projectTargetToScreen(0);
          this.field_q[1] = this.camera.screenPosition[1];
          this.field_q[0] = this.camera.screenPosition[0];
          this.presenter.screenX = this.field_q[0];
          var3_int = -44 / ((obfuscationGuard + 26) / 48);
          this.elapsedFrames = this.elapsedFrames + 1;
          this.presenter.screenY = this.field_q[1];
          if (this.elapsedFrames == 20) {
            if (this.field_n != 7 &&
              this.field_n != 8 &&
              this.field_n != 10 &&
              this.field_n != 11 &&
              12 != this.field_n) {
              return;
            }
            this.field_t = new int[10][2];
            for (var4 = 0; var4 < 10; var4++) {
              stackIn_13_0 = this.field_t[var4];
              stackIn_13_1 = 0;
              stackIn_13_2 = AttackEvent.a(false, 20, li.field_n) + 20;
              if (10 >= AttackEvent.a(false, 20, li.field_n)) {
                stackIn_14_3 = -1;
              } else {
                stackIn_14_3 = 1;
              }
              stackIn_13_0[stackIn_13_1] = stackIn_13_2 * stackIn_14_3;
              this.field_t[var4][1] = -60 + -1 * AttackEvent.a(false, 40, li.field_n);
            }
            event.applyToBattlefield(this.battlefield, -26661);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("ql.Q(");
          if (event == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        int var6;
        int var7;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.elapsedFrames < 40 &&
          this.elapsedFrames < 20) {
          TrianglePulse.field_d.d(-40 + param2, param1 - 40, 80, 80, 255 * this.elapsedFrames / 20);
          TrianglePulse.field_d.d(param2 - 40, param1 - 40, 80, 80, this.elapsedFrames * 255 / 20);
        }
        if (param0 > -124) {
          this.unit = (Unit) null;
        }
        if (null != this.field_t) {
          for (var4 = 0; this.field_t.length > var4; var4++) {
            var5 = (this.elapsedFrames - 20) * this.field_t[var4][0] / 20 + param2;
            var6 = this.field_t[var4][1] * (this.elapsedFrames - 20) / 20 + param1;
            TrianglePulse.field_d.d(var5 - 10, var6 + (this.elapsedFrames - 20) * (-20 + this.elapsedFrames) / 10 - 10, 20, 20, 255 * (-this.elapsedFrames + 60) / 40);
          }
        }
    }

    final boolean a(int param0, int param1, int param2, GameEvent param3) {
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        UnitSpell var7 = null;
        UnitSpell var8 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.elapsedFrames = 0;
          this.presenter.tileIndex = param2 + this.field_s * param1;
          if (param3.eventKind == 12) {
            this.field_n = 1;
            this.unit = this.battlefield.getUnitAt(param1, true, param2);
            if (null != this.unit &&
              this.unit.ownerPlayer == ((StateChangeEvent) (param3)).playerId &&
              this.unit.strength < this.unit.maximumStrength) {
              this.field_i = 16711935;
              this.field_m = 1;
            } else {
              this.elapsedFrames = 50;
              this.field_n = -1;
              return false;
            }
          }
          if (param3.eventKind == 14) {
            this.field_n = 2;
            this.unit = this.battlefield.getUnitAt(param1, true, param2);
            this.field_f = AttackEvent.a(false, 21, li.field_n) - 10;
            this.field_r = AttackEvent.a(false, 21, li.field_n) - 10;
            if (this.unit != null &&
              this.unit.ownerPlayer == ((StateChangeEvent) (param3)).playerId &&
              this.unit.bonusStrength != 5) {
              this.field_i = 16711935;
              this.field_m = -this.unit.bonusStrength + 5;
            } else {
              this.field_n = -1;
              this.elapsedFrames = 50;
              return false;
            }
          }
          if (16 == param3.eventKind) {
            this.field_n = 1;
            this.unit = this.battlefield.getUnitAt(param1, true, param2);
            this.field_f = AttackEvent.a(false, 21, li.field_n) - 10;
            this.field_r = -10 + AttackEvent.a(false, 21, li.field_n);
            if ((!this.field_g[param2 + this.field_s * param1].hasCorpse(92) ||
              null != this.unit) && (this.unit == null ||
              !this.unit.a(23072) ||
              this.unit.ownerPlayer != ((StateChangeEvent) (param3)).playerId ||
              this.unit.maximumStrength == this.unit.strength)) {
              this.elapsedFrames = 50;
              this.field_n = -1;
              return false;
            }
            if (null == this.unit) {
              this.field_m = 5;
            } else {
              this.field_m = -this.unit.strength + this.unit.maximumStrength;
            }
            if (this.field_m > 5) {
              this.field_m = 5;
            }
          }
          if (param0 > -68) {
            this.field_g = (MapTile[]) null;
          }
          if (param3.eventKind == 25) {
            this.field_n = 7;
            hs.b(-55, 46);
          } else {
            if (param3.eventKind == 26) {
              this.field_n = 7;
            }
          }
          if (param3.eventKind != 24) {
            this.advanceFrame(param3, (byte) 102);
            this.presenter.tileIndex = param2 + param1 * this.field_s;
            return true;
          }
          this.field_n = 7;
          var7 = (UnitSpell) (((SpellCastEvent) (param3)).spell);
          var8 = var7;
          if (6 == uc.spellDefinitions[var7.spellId][4]) {
            this.field_n = 10;
          }
          if (uc.spellDefinitions[var7.spellId][4] == 4 &&
            uc.spellDefinitions[var7.spellId][5] != 64 &&
            uc.spellDefinitions[var7.spellId][5] != 0) {
            if (uc.spellDefinitions[var7.spellId][6] >= 0) {
              if (uc.spellDefinitions[var8.spellId][7] <= 0) {
                this.field_n = 12;
              } else {
                this.field_n = 11;
              }
            } else {
              if (uc.spellDefinitions[var7.spellId][7] > 0) {
                this.field_n = 14;
              } else {
                this.field_n = 13;
              }
            }
          }
          this.advanceFrame(param3, (byte) 102);
          this.presenter.tileIndex = param2 + param1 * this.field_s;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_61_0 = var5;
          stackIn_61_1 = new StringBuilder().append("ql.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(')').toString());
        }
    }

    private final void i(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (40 > this.elapsedFrames) {
          var2 = 0;
          var3 = 0;
          for (var4 = 0; var4 < 30; var4++) {
            if (var4 >= this.elapsedFrames) {
              break;
            }
            stackIn_6_0 = var2;
            if (AttackEvent.a(false, 100, li.field_n) > 50) {
              stackIn_7_1 = 0;
            } else {
              stackIn_7_1 = AttackEvent.a(false, 100, li.field_n) - 50 >> 4;
            }
            var2 = stackIn_6_0 + stackIn_7_1;
            stackIn_9_0 = var3;
            if (AttackEvent.a(false, 100, li.field_n) <= 50) {
              stackIn_10_1 = -50 + AttackEvent.a(false, 100, li.field_n) >> 4;
            } else {
              stackIn_10_1 = 0;
            }
            var3 = stackIn_9_0 + stackIn_10_1;
            TrianglePulse.field_d.d(this.presenter.screenX + 35 + var2, var3 + (this.presenter.screenY + var4 * 4) - 120, 10, 10, var4 * 8);
          }
        }
        if (param0 != 10) {
          this.e((byte) -128);
        }
        if (null != this.field_t) {
          for (var2Lifetime1 = 0; this.field_t.length > var2Lifetime1; var2Lifetime1++) {
            var3Lifetime1 = this.presenter.screenX + (this.field_t[var2Lifetime1][0] * (this.elapsedFrames - 20) / 20 + 30);
            var4Lifetime1 = -20 + this.field_t[var2Lifetime1][1] * (this.elapsedFrames - 20) / 20 + this.presenter.screenY;
            TrianglePulse.field_d.d(var3Lifetime1, var4Lifetime1 + (this.elapsedFrames - 20) * (this.elapsedFrames - 20) / 10, 20, 20, 255 * (-this.elapsedFrames + 60) / 40);
          }
        }
    }

    private final void e(byte param0) {
        int var2 = 0;
        RgbSprite stackIn_4_0;
        int stackIn_4_1;
        int stackIn_4_2;
        int stackIn_4_3;
        int stackIn_4_4;
        int stackIn_5_5;
        int var3;
        int var4;
        int var5;
        GameEvent var6;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.elapsedFrames < 20) {
          stackIn_4_0 = hs.field_F[AttackEvent.a(false, hs.field_F.length, li.field_n)];
          stackIn_4_1 = this.presenter.screenX + 30;
          stackIn_4_2 = -90 + (this.presenter.screenY + this.elapsedFrames * 4);
          stackIn_4_3 = 20;
          stackIn_4_4 = 20;
          if (this.elapsedFrames <= 10) {
            stackIn_5_5 = this.elapsedFrames * 255 / 10;
          } else {
            stackIn_5_5 = 255;
          }
          ((RgbSprite) (Object) stackIn_4_0).d(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4, stackIn_5_5);
        }
        if (null != this.field_t) {
          for (var2 = 0; var2 < this.field_t.length; var2++) {
            var3 = this.presenter.screenX + (this.field_t[var2][0] * (this.elapsedFrames - 20) / 20 + 35);
            var4 = -10 + this.presenter.screenY + (-20 + this.elapsedFrames) * this.field_t[var2][1] / 20;
            hs.field_F[AttackEvent.a(false, hs.field_F.length, li.field_n)].d(-((-20 + this.elapsedFrames) / 4) + var3, -((-40 + this.elapsedFrames) / 4) + (this.elapsedFrames - 20) * (this.elapsedFrames - 20) / 10 + var4, (-20 + this.elapsedFrames) / 2 + 10, (-20 + this.elapsedFrames) / 2 + 10, (-this.elapsedFrames + 60) * 255 / 40);
          }
        }
        if (param0 != -117) {
          var6 = (GameEvent) null;
          this.initialize((GameEvent) null, (byte) -72);
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.elapsedFrames < 40 &&
          this.elapsedFrames < 20) {
          TrianglePulse.field_d.d(this.presenter.screenX - 10, this.presenter.screenY - 30, 100, 50, this.elapsedFrames * 255 / 20);
          TrianglePulse.field_d.d(-10 + this.presenter.screenX, this.presenter.screenY - 30, 100, 50, 255 * this.elapsedFrames / 20);
        }
        if (this.field_t != null) {
          for (var2 = 0; this.field_t.length > var2; var2++) {
            var3 = this.presenter.screenX + (-20 + this.elapsedFrames) * this.field_t[var2][0] / 20 + 30;
            var4 = -20 + (this.presenter.screenY + (this.elapsedFrames - 20) * this.field_t[var2][1] / 20);
            TrianglePulse.field_d.d(var3, (this.elapsedFrames - 20) * (this.elapsedFrames - 20) / 10 + var4, 20, 20, (15300 - this.elapsedFrames * 255) / 40);
          }
        }
        if (param0 >= -108) {
          this.field_a = false;
        }
    }

    public final void drawBaseLayer(byte obfuscationGuard) {
        int stackIn_25_1 = 0;
        int var2;
        int var3;
        GameEvent var4;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard >= -119) {
          var4 = (GameEvent) null;
          this.a(116, -87, 41, (GameEvent) null);
        }
        var2 = this.field_n;
        if (var2 == 1) {
          this.a(0, (byte) 117);
        } else {
          if (var2 != 5) {
            if (var2 != 9) {
              if (2 != var2) {
                if (var2 != 6) {
                  if (var2 == 7) {
                    this.d(20);
                  } else {
                    if (var2 == 14) {
                      this.a(false);
                    } else {
                      if (var2 == 13) {
                        this.g(10);
                      } else {
                        if (var2 == 12) {
                          this.i(10);
                        } else {
                          if (11 == var2) {
                            this.e((byte) -117);
                          } else {
                            if (var2 == 10) {
                              this.e(-111);
                            } else {
                              if (8 == var2) {
                                this.f(3);
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  this.a(7, (byte) 122);
                }
              } else {
                if (this.field_m >= 0) {
                  stackIn_25_1 = 4;
                } else {
                  stackIn_25_1 = 5;
                }
                this.a(stackIn_25_1, (byte) 88);
              }
            } else {
              this.a(3, (byte) 101);
            }
          } else {
            this.a(2, (byte) 121);
          }
        }
    }

    public static void d(byte param0) {
        field_p = null;
        if (param0 <= 45) {
          PopupPresentation.d((byte) 124);
        }
        field_j = null;
        field_c = null;
        field_e = null;
        field_l = null;
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 != 20) {
          return;
        }
        if (40 > this.elapsedFrames &&
          20 > this.elapsedFrames) {
          TrianglePulse.field_d.d(this.presenter.screenX, -70 + this.presenter.screenY, 80, 100, this.elapsedFrames * 255 / 20);
          TrianglePulse.field_d.d(this.presenter.screenX, -70 + this.presenter.screenY, 80, 100, 255 * this.elapsedFrames / 20);
        }
        if (null != this.field_t) {
          for (var2 = 0; this.field_t.length > var2; var2++) {
            var3 = 30 + (this.elapsedFrames - 20) * this.field_t[var2][0] / 20 + this.presenter.screenX;
            var4 = this.presenter.screenY + (-20 + this.elapsedFrames) * this.field_t[var2][1] / 20;
            TrianglePulse.field_d.d(var3, (-20 + this.elapsedFrames) * (-20 + this.elapsedFrames) / 10 + var4, 20, 20, (15300 - this.elapsedFrames * 255) / 40);
          }
        }
    }

    public final boolean isFinished(int obfuscationGuard) {
        if (obfuscationGuard != 8865) {
          return false;
        }
        if (null != this.field_t) {
          return 60 <= this.elapsedFrames ? true : false;
        }
        return this.elapsedFrames >= 40 ? true : false;
    }

    public final boolean isCombatViewReady(byte obfuscationGuard) {
        if (obfuscationGuard >= -25) {
          return true;
        }
        return false;
    }

    private final void a(boolean param0) {
        if (param0) {
          this.presenter = (EventPresenter) null;
        }
        if (40 > this.elapsedFrames) {
          if (this.elapsedFrames >= 20) {
            TrianglePulse.field_d.d(-this.elapsedFrames + this.presenter.screenX + 20, -this.elapsedFrames - 70 + this.presenter.screenY, (-20 + this.elapsedFrames) * 2 + 80, 100, (10200 - 255 * this.elapsedFrames) / 20);
          } else {
            TrianglePulse.field_d.d(this.presenter.screenX, -this.elapsedFrames + (this.presenter.screenY - 70), 80, 100, 255 * this.elapsedFrames / 20);
          }
        }
    }

    private final void a(int param0, byte param1) {
        if (param1 < 83) {
          return;
        }
        int var3 = this.field_m > 0 ? this.field_m : -this.field_m;
        if (var3 != 1) {
          od.field_d[param0].c(this.field_f + (40 + (this.presenter.screenX - var3 * 5)), this.field_r + (this.presenter.screenY + (-20 - var3 * 5) - this.elapsedFrames), this.field_m * 10, var3 * 10, 40 - this.elapsedFrames << 2);
        } else {
          od.field_d[param0].e(this.field_f + 35 + this.presenter.screenX, -this.elapsedFrames + (this.presenter.screenY - 25) + this.field_r, -this.elapsedFrames + 40 << 2);
        }
    }

    private final void c(int param0) {
        SoftwareRaster.a(this.presenter.screenX + 40, -20 + this.presenter.screenY, 10, this.field_i);
        mv.field_a[this.field_a ? 1 : 0].g(20 + this.presenter.screenX, this.presenter.screenY - 35);
        if (param0 != 3) {
          this.drawBaseLayer((byte) -24);
        }
        en.field_E.c(Integer.toString(this.field_m), this.presenter.screenX + 40, this.presenter.screenY - 15, 16777215, 0);
    }

    private final void g(int param0) {
        RgbSprite stackIn_6_0;
        int stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        int stackIn_6_4;
        int stackIn_7_5 = 0;
        RgbSprite stackIn_9_0;
        int stackIn_9_1;
        int stackIn_9_2;
        int stackIn_9_3;
        int stackIn_9_4;
        int stackIn_10_5;
        int var3;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 != 10) {
          return;
        }
        if (this.elapsedFrames < 40) {
          if (this.elapsedFrames >= 20) {
            if (this.elapsedFrames >= 30) {
              TrianglePulse.field_d.d(this.presenter.screenX - 10, -30 + this.presenter.screenY, 100, 50, (-(255 * this.elapsedFrames) + 10200) / 10);
              TrianglePulse.field_d.d(-10 + this.presenter.screenX, -30 + this.presenter.screenY, 100, 50, (-this.elapsedFrames + 40) * 255 / 10);
            } else {
              TrianglePulse.field_d.d(15 + (this.presenter.screenX - (5 * this.elapsedFrames - 100) / 2), this.presenter.screenY - 120 + 3 * this.elapsedFrames, -50 + this.elapsedFrames * 5, 50, 255);
              TrianglePulse.field_d.d(this.presenter.screenX + 15 - (this.elapsedFrames - 20) * 5 / 2, this.presenter.screenY - (120 - this.elapsedFrames * 3), this.elapsedFrames * 5 - 100 + 50, 50, 255);
            }
          } else {
            stackIn_6_0 = TrianglePulse.field_d;
            stackIn_6_1 = 15 + this.presenter.screenX;
            stackIn_6_2 = -120 + this.presenter.screenY + this.elapsedFrames * 3;
            stackIn_6_3 = 50;
            stackIn_6_4 = 50;
            if (this.elapsedFrames > 10) {
              stackIn_7_5 = 255;
            } else {
              stackIn_7_5 = 255 * this.elapsedFrames / 10;
            }
            ((RgbSprite) (Object) stackIn_6_0).d(stackIn_6_1, stackIn_6_2, stackIn_6_3, stackIn_6_4, stackIn_7_5);
            stackIn_9_0 = TrianglePulse.field_d;
            stackIn_9_1 = this.presenter.screenX + 15;
            stackIn_9_2 = this.presenter.screenY - 120 + this.elapsedFrames * 3;
            stackIn_9_3 = 50;
            stackIn_9_4 = 50;
            if (this.elapsedFrames > 10) {
              stackIn_10_5 = 255;
            } else {
              stackIn_10_5 = 255 * this.elapsedFrames / 10;
            }
            ((RgbSprite) (Object) stackIn_9_0).d(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_10_5);
          }
        }
    }

    final static boolean h(int param0) {
        boolean stackIn_9_0 = false;
        if (param0 != 31337) {
          PopupPresentation.h(-19);
        }
        boolean decompiledFrameRemainder0 = true;
        if (f.field_E >= 20 &&
          wd.a((byte) 28) && (!(vt.field_n > 0) ||
          du.c(10))) {
          stackIn_9_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    public final boolean initialize(GameEvent event, byte obfuscationGuard) {
        int stackIn_8_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        SummonEvent var6 = null;
        TeleportEvent var7 = null;
        SpellCastEvent var8 = null;
        OwnerChangeEvent var9 = null;
        UpkeepEvent var10 = null;
        TurnEffectEvent var11 = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.elapsedFrames = 0;
          if (event.eventKind != 15) {
            if (19 == event.eventKind) {
              this.field_m = 1;
              var11 = (TurnEffectEvent) (event);
              var4 = var11.effectType;
              if (var4 != 5) {
                if (var4 == 1) {
                  this.field_n = 1;
                } else {
                  if (var4 == 3) {
                    this.field_n = 3;
                  } else {
                    if (var4 == 4) {
                      this.field_n = 5;
                    } else {
                      if (6 == var4) {
                        this.field_n = 9;
                      } else {
                        if (2 == var4) {
                          this.field_a = true;
                          this.field_n = 4;
                        }
                      }
                    }
                  }
                }
              } else {
                this.field_n = 2;
                this.field_m = -1;
              }
              this.field_f = AttackEvent.a(false, 21, li.field_n) - 10;
              this.field_r = AttackEvent.a(false, 21, li.field_n) - 10;
              if (event.unit == null) {
                return false;
              }
              if (event.unit.removedFromActivePlay) {
                return false;
              }
              this.presenter.tileIndex = this.field_s * event.unit.tileY + event.unit.tileX;
            } else {
              if (20 == event.eventKind) {
                this.field_m = 3;
                this.field_n = 6;
                var10 = (UpkeepEvent) (event);
                this.field_f = AttackEvent.a(false, 21, li.field_n) - 10;
                this.field_r = AttackEvent.a(false, 21, li.field_n) - 10;
                this.presenter.tileIndex = var10.field_y * this.field_s + var10.field_D;
              } else {
                if (event.eventKind != 2) {
                  if (event.eventKind == 23) {
                    this.field_n = 7;
                    var9 = (OwnerChangeEvent) (event);
                    this.presenter.tileIndex = var9.unit.tileX + var9.unit.tileY * this.field_s;
                  } else {
                    if (event.eventKind == 24) {
                      var8 = (SpellCastEvent) (event);
                      this.field_n = 8;
                      if (var8.selectionMode >= 0) {
                        this.field_f = (int)(64.0 * Math.sin((double)var8.selectionMode * 3.141592653589793 / 4.0)) + 130;
                        this.field_r = -95 + (int)(Math.cos(3.141592653589793 * (double)var8.selectionMode / 4.0) * -64.0) + CombatEvent.field_I.field_D;
                      } else {
                        this.field_f = 130;
                        this.field_r = -95 + CombatEvent.field_I.field_D;
                      }
                    } else {
                      if (event.eventKind == 26) {
                        var7 = (TeleportEvent) (event);
                        var7.unit = this.battlefield.getUnitAt(var7.sourceY, true, var7.sourceX);
                        if (var7.unit.packedFlag256) {
                          var7.unit = var7.unit.copyDetached(false);
                        }
                        this.field_n = 7;
                        this.presenter.tileIndex = this.field_s * var7.unit.tileY + var7.unit.tileX;
                      }
                    }
                  }
                } else {
                  var6 = (SummonEvent) (event);
                  this.field_n = 7;
                  this.presenter.tileIndex = var6.tileX + this.field_s * var6.tileY;
                }
              }
            }
          } else {
            this.field_a = ((DamageEvent) (event)).poison;
            this.field_n = 0;
            if (null == event.unit) {
              return false;
            }
            this.presenter.tileIndex = this.field_s * event.unit.tileY + event.unit.tileX;
            this.field_m = ((DamageEvent) (event)).damageAmount;
            if (!((DamageEvent) (event)).poison) {
              stackIn_8_1 = 16711680;
            } else {
              stackIn_8_1 = 65280;
            }
            this.field_i = stackIn_8_1;
            if (1 > this.field_m) {
              this.elapsedFrames = 40;
              this.field_n = -1;
              return false;
            }
          }
          this.advanceFrame(event, (byte) -106);
          if (obfuscationGuard != 57) {
            this.field_t = (int[][]) null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_52_0 = var3;
          stackIn_52_1 = new StringBuilder().append("ql.E(");
          if (event == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    PopupPresentation(Battlefield battlefield, BattleCamera camera, EventPresenter presenter) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.battlefield = battlefield;
          this.field_s = battlefield.mapWidth;
          this.camera = camera;
          this.presenter = presenter;
          this.field_q = new int[2];
          this.field_g = battlefield.tiles;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("ql.<init>(");
          if (battlefield == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (camera == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (presenter == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_p = "Please remove <%0> from your friend list first.";
        field_l = "Unable to delete friend - system busy";
    }
}
