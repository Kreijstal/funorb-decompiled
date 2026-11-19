/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlatformActor extends GridActor {
    int animationFrame;
    static long field_C;
    int field_x;
    static String field_t;
    Sprite field_q;
    private int field_m;
    int field_o;
    int field_w;
    int field_z;
    static int field_v;
    int field_p;
    int field_A;
    static ResourceArchive field_u;
    int field_r;
    int field_s;
    int actorType;
    int field_y;

    private final void drawOutlinedLabel(int param0, int param1, boolean param2, String param3, int param4) {
        GameGraphicsResources.wizardFont2.drawStringCentered(param3, -1 + param1, param4, 0, -1);
        GameGraphicsResources.wizardFont2.drawStringCentered(param3, param1 + 1, param4, 0, -1);
        GameGraphicsResources.wizardFont2.drawStringCentered(param3, param1, -1 + param4, 0, -1);
        GameGraphicsResources.wizardFont2.drawStringCentered(param3, param1, 1 + param4, 0, -1);
        if (!param2) {
          return;
        }
        try {
          GameGraphicsResources.wizardFont2.drawStringCentered(param3, param1, param4, param0, -1);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "eg.CA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final void a(boolean param0, int param1, LevelData param2) {
        int var6 = 0;
        Object stackIn_88_0 = null;
        int stackIn_89_1 = 0;
        int stackIn_94_0 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object var7 = null;
        int var8 = 0;
        int var4_intLifetime1;
        int var4_intLifetime2;
        var8 = wizardrun.field_H;
        try {
          this.field_h = this.field_m;
          if (param1 != 120) {
            return;
          }
          this.moveWithGravity(20, tl.field_a, pk.field_s, BufferedRandomAccessFile.soundEffects, (byte) -15, param2);
          this.field_o = 6;
          this.field_w = this.field_w + 1;
          if (param0) {
            if (this.animationFrame < 31) {
              this.animationFrame = 31;
            }
            if (this.animationFrame > 34) {
              this.animationFrame = 31;
            }
            this.field_z = this.field_z + 1;
            if (5 < this.field_z) {
              this.field_z = 0;
              if (this.animationFrame < 34) {
                this.animationFrame = this.animationFrame + 1;
              }
            }
          } else {
            this.animationFrame = 31;
            if (0 > this.verticalVelocity) {
              this.animationFrame = 32;
            }
          }
          if (!(this.tilePosition.row >= -2) ||
            !(0 <= this.tilePosition.column) ||
            !(20 >= this.tilePosition.column) ||
            !(this.verticalVelocity > -30) ||
            this.field_k == 1) {
            if (1 == this.field_k) {
              this.tilePosition.column = (int)(Math.random() * 18.0) + 1;
              this.tilePosition.row = 17;
              this.field_k = 0;
            } else {
              if (this.tilePosition.row < -2) {
                this.tilePosition.row = 17;
              }
            }
            this.field_o = 0;
            if (param0) {
              for (var4_int = 0; 1000 > var4_int; var4_int++) {
                if (null != ii.field_e[var4_int] &&
                  ii.field_e[var4_int].actorType > 2 &&
                  21 != ii.field_e[var4_int].actorType &&
                  ii.field_e[var4_int].actorType != 20) {
                  ii.field_e[var4_int].field_p = 0;
                }
              }
              for (var4_intLifetime1 = 0; var4_intLifetime1 < 300; var4_intLifetime1++) {
                if (param2.field_d[var4_intLifetime1]) {
                  param2.field_d[var4_intLifetime1] = false;
                }
              }
              var4_intLifetime2 = 0;
              var5 = 6;
              if (this.actorType == 12) {
                var5 = 10;
                var4_intLifetime2 = 1;
              }
              if (17 == this.actorType) {
                var5 = 10;
                var4_intLifetime2 = 2;
              }
              if (26 == this.actorType) {
                var5 = 10;
                var4_intLifetime2 = 3;
              }
              if (this.actorType == 33) {
                var5 = 10;
                var4_intLifetime2 = 4;
              }
              if (this.actorType == 40) {
                var4_intLifetime2 = 5;
                var5 = 20;
                if (!GameApplet.field_g) {
                  ql.a(1, 245, 10);
                }
              }
              for (var6 = 0; var6 < var5; var6++) {
                var7 = this;
                if (var6 != 0) {
                  ii.field_e[WidgetTheme.field_k].initialize(param1 + 9027, 21, new GridPoint(this.tilePosition));
                  var7 = ii.field_e[WidgetTheme.field_k];
                  WidgetTheme.field_k = WidgetTheme.field_k + 1;
                }
                ((PlatformActor) (var7)).initialize(9147, 21, this.tilePosition);
                ((PlatformActor) (var7)).tileOffset.set(param1 - 246, this.tileOffset);
                ((PlatformActor) (var7)).tileOffset.column = ((PlatformActor) (var7)).tileOffset.column + (int)(Math.sin(6.28 * (double)var6 / (double)var5) * 64.0);
                ((PlatformActor) (var7)).tileOffset.row = ((PlatformActor) (var7)).tileOffset.row + (int)(64.0 * Math.cos((double)var6 * 6.28 / (double)var5));
                ((PlatformActor) (var7)).verticalVelocity = 0;
                ((PlatformActor) (var7)).field_o = var4_intLifetime2;
                stackIn_88_0 = var7;
                if (var5 / 2 <= var6) {
                  stackIn_89_1 = 1;
                } else {
                  stackIn_89_1 = -1;
                }
                ((PlatformActor) (stackIn_88_0)).field_h = stackIn_89_1;
              }
              ra.a(2);
            } else if (this.actorType != 8 &&
              this.actorType != 36) {
              this.field_o = 0;
              if (this.field_d == 32) {
                this.field_o = 0;
              }
              if (this.field_d == 48) {
                this.field_o = 1;
              }
              if (64 == this.field_d) {
                this.field_o = 2;
              }
              if (80 == this.field_d) {
                this.field_o = 3;
              }
              if (this.field_d == 96) {
                this.field_o = 5;
              }
              if (1 < GridActor.field_l &&
                this.field_o < 5) {
                this.field_o = this.field_o + 1;
              }
              this.actorType = 21;
              if (3 < GridActor.field_l &&
                5 > this.field_o) {
                this.field_o = this.field_o + 1;
              }
              this.field_d = 32;
            } else {
              this.field_k = 1;
            }
            stackIn_94_0 = (pk.field_s) ? 0 : 1;
            if (stackIn_94_0 == 1) {
              return;
            }
            tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[6], 100, 256 * ee.field_p / 100);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_100_0 = var4;
          stackIn_100_1 = new StringBuilder().append("eg.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(')').toString());
        }
    }

    private final void d(int param0) {
        boolean discarded$0 = false;
        nj.field_r = nj.field_r - 1;
        if (param0 != -1569) {
          LevelData var3 = (LevelData) null;
          discarded$0 = this.a(false, (LevelData) null, 6);
        }
        if (!(155 < nj.field_r)) {
          ql.a(param0 ^ -1570, 244, 11);
        }
    }

    public static void releaseStatics(int param0) {
        field_t = null;
        int var1 = -76 / ((param0 - 4) / 50);
        field_u = null;
    }

    private final void b(int param0) {
        boolean stackIn_34_0 = false;
        GridPoint var3;
        GridPoint var4;
        GridPoint var5;
        var4 = new GridPoint();
        var5 = var4;
        var3 = new GridPoint();
        var5.row = this.field_A;
        var4.column = this.field_y;
        var3.column = ii.field_e[0].field_y;
        var3.row = ii.field_e[0].field_A;
        if (param0 != 5) {
          this.d(69);
        }
        if (ii.field_e[0].field_s == 0 &&
          this.field_q != null &&
          null != ii.field_e[0].field_q &&
          SpriteCollision.overlapsOpaquePixels(this.field_q, var5.column, var4.row, ii.field_e[0].field_q, var3.column, var3.row)) {
          if (this.actorType == 21) {
            if (this.field_o == 0) {
              BufferedSocket.field_c = BufferedSocket.field_c + 640;
              DiskCacheStore.field_f = DiskCacheStore.field_f + 10;
              if (GridActor.field_l == 5 &&
                ve.a((byte) 110, 0)) {
                this.d(-1569);
              }
            }
            if (this.field_o == 1) {
              DiskCacheStore.field_f = DiskCacheStore.field_f + 25;
              wg.field_b = wg.field_b + 1600;
            }
            if (this.field_o == 2) {
              me.field_f = me.field_f - 3200;
              DiskCacheStore.field_f = DiskCacheStore.field_f + 50;
              if (5 == GridActor.field_l &&
                ve.a((byte) 89, 0)) {
                this.d(param0 ^ -1574);
              }
            }
            if (this.field_o == 3) {
              DiskCacheStore.field_f = DiskCacheStore.field_f + 75;
              ic.field_a = ic.field_a - 4800;
            }
            if (this.field_o == 4) {
              DiskCacheStore.field_f = DiskCacheStore.field_f + 100;
              BufferedSocket.field_c = BufferedSocket.field_c + 6400;
            }
            if (this.field_o == 5) {
              wg.field_b = wg.field_b + 9600;
              DiskCacheStore.field_f = DiskCacheStore.field_f + 150;
            }
            if (6 == this.field_o) {
              me.field_f = me.field_f - 16000;
              DiskCacheStore.field_f = DiskCacheStore.field_f + 250;
            }
            if (this.field_o == 7) {
              ic.field_a = ic.field_a - 32000;
              DiskCacheStore.field_f = DiskCacheStore.field_f + 500;
            }
            stackIn_34_0 = !(pk.field_s);
            if (!stackIn_34_0) {
              tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[7], 100, ee.field_p * 256 / 100);
            }
            this.field_w = 0;
            this.actorType = 44;
          } else {
            this.verticalVelocity = 40;
            this.field_r = 0;
            this.actorType = 21;
            this.field_o = 0;
            if (this.field_d == 32) {
              this.field_o = 0;
            }
            if (this.field_d == 48) {
              this.field_o = 1;
            }
            if (64 == this.field_d) {
              this.field_o = 2;
            }
            if (GridActor.field_l > 1 &&
              this.field_o < 5) {
              this.field_o = this.field_o + 1;
            }
            if (3 < GridActor.field_l &&
              this.field_o < 5) {
              this.field_o = this.field_o + 1;
            }
            this.field_d = 32;
            this.field_o = this.field_o + 1;
            this.field_p = 0;
            if (pk.field_s) {
              tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[6], 100, 256 * ee.field_p / 100);
            }
          }
        }
    }

    final void drawActor(boolean param0) {
        int var13 = 0;
        int stackIn_87_1 = 0;
        int stackIn_90_1 = 0;
        int stackIn_103_1 = 0;
        int stackIn_115_1 = 0;
        int stackIn_125_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        double var6;
        int var8;
        int var9;
        int var10;
        int var11;
        double var11_double;
        int var12;
        int var14;
        int var15;
        var15 = wizardrun.field_H;
        this.field_q = null;
        var2 = 32 * this.tileOffset.column / 240 + 32 * this.tilePosition.column;
        var3 = 32 * (-1 + (15 - this.tilePosition.row)) - 32 * this.tileOffset.row / 240;
        var3 = var3 - (this.field_d - 32);
        if (!param0) {
          this.drawWizard(-46, -3, (byte) 15);
        }
        regionExit1: {
          var11 = this.actorType;
          if (var11 != 0) {
            if (var11 == 1) {
              var5 = this.tileOffset.column + (240 * this.tilePosition.column + this.field_w);
              if (0 <= this.field_w &&
                this.field_w <= 10) {
                GridPoint.field_c.a(12 + var2, var3 + 12, -87, 128, var5);
              }
              if (10 < this.field_w &&
                this.field_w <= 15) {
                GridPoint.field_c.a(12 + var2, var3 + 12, -119, 112, var5);
              }
              if (this.field_w > 15 &&
                20 >= this.field_w) {
                GridPoint.field_c.a(var2 + 12, var3 + 12, -96, 96, var5);
              }
              if (this.field_w > 20) {
                if (this.field_w <= 25) {
                  GridPoint.field_c.a(12 + var2, var3 + 12, -106, 80, var5);
                }
                if (this.field_w > 25 &&
                  30 >= this.field_w) {
                  GridPoint.field_c.a(12 + var2, 12 + var3, -121, 64, var5);
                }
              } else {
                if (this.field_w > 25 &&
                  30 >= this.field_w) {
                  GridPoint.field_c.a(12 + var2, 12 + var3, -121, 64, var5);
                }
              }
              this.field_q = GridPoint.field_c;
              this.field_A = var3;
              this.field_y = var2;
            } else {
              if (var11 == 2) {
                for (var11 = 0; 10 > var11; var11++) {
                  var6 = 6.28 * (double)var11 / 10.0 + (double)this.field_w;
                  GridPoint.field_c.drawScaledAlpha(-6 + (var2 + (int)(32.0 * Math.cos(var6) + 32.0)), -6 + (var3 + (int)(32.0 + 32.0 * Math.sin(var6))), 12, 12, 255 - 10 * var11);
                }
                this.field_A = var3;
                this.field_y = var2;
                this.field_q = ec.field_b;
              } else {
                switch (var11) {
                  case 3:
                    this.drawWizard(32, 0, (byte) 62);
                    break;
                  case 4:
                    this.drawWizard(32, 1, (byte) 62);
                    break;
                  case 5:
                    this.drawWizard(40, 2, (byte) 62);
                    break;
                  default:
                    switch (var11) {
                      case 6:
                        this.drawWizard(40, 4, (byte) 62);
                        break;
                      case 7:
                        this.drawWizard(40, 0, (byte) 62);
                        break;
                      case 8:
                        this.drawWizard(32, 1, (byte) 62);
                        break;
                      case 9:
                        this.drawWizard(32, 2, (byte) 62);
                        break;
                      case 10:
                        this.drawWizard(40, 3, (byte) 62);
                        break;
                      case 11:
                        if (this.field_h != -1) {
                          oc.field_b[3][29].drawMirrored(var2, var3);
                          this.field_q = oc.field_b[3][29].flipHorizontal();
                          this.field_A = var3;
                          this.field_y = var2;
                          break;
                        }
                        oc.field_b[3][29].drawTransparent(var2, var3);
                        this.field_y = var2;
                        this.field_A = var3;
                        this.field_q = oc.field_b[3][29];
                        break;
                      case 12:
                        this.field_h = -this.field_h;
                        this.drawWizard(40, 4, (byte) 62);
                        this.field_h = -this.field_h;
                        break;
                      case 13:
                        this.drawWizard(32, 0, (byte) 62);
                        break;
                      case 14:
                        this.field_h = -this.field_h;
                        this.drawWizard(40, 1, (byte) 62);
                        this.field_h = -this.field_h;
                        break;
                      case 15:
                        this.drawWizard(40, 2, (byte) 62);
                        break;
                      case 16:
                        this.drawWizard(40, 3, (byte) 62);
                        break;
                      case 17:
                        this.drawWizard(80, 4, (byte) 62);
                        break;
                      case 18:
                        if (this.animationFrame < 34) {
                          this.animationFrame = 34;
                        }
                        if (this.field_h == 1) {
                          oc.field_b[2][this.animationFrame].drawTransparent(var2, var3);
                          this.field_q = oc.field_b[2][this.animationFrame];
                          this.field_y = var2;
                          this.field_A = var3;
                          break;
                        }
                        oc.field_b[2][this.animationFrame].drawMirrored(var2 - 24, var3);
                        this.field_q = oc.field_b[2][this.animationFrame].flipHorizontal();
                        this.field_y = -24 + var2;
                        this.field_A = var3;
                        break;
                      case 19:
                        if (37 > this.animationFrame) {
                          this.animationFrame = 37;
                        }
                        if (this.field_h != 1) {
                          oc.field_b[3][this.animationFrame].drawMirrored(var2, var3);
                          this.field_q = oc.field_b[3][this.animationFrame].flipHorizontal();
                          this.field_y = var2;
                          this.field_A = var3;
                          break;
                        }
                        oc.field_b[3][this.animationFrame].drawTransparent(var2, var3);
                        this.field_q = oc.field_b[3][this.animationFrame];
                        this.field_A = var3;
                        this.field_y = var2;
                        break;
                      case 25:
                        if (this.animationFrame < 36) {
                          this.animationFrame = 36;
                        }
                        if (this.field_h != -1) {
                          oc.field_b[4][this.animationFrame].drawMirrored(var2, var3);
                          this.field_q = oc.field_b[4][this.animationFrame].flipHorizontal();
                          this.field_A = var3;
                          this.field_y = var2;
                          break;
                        }
                        oc.field_b[4][this.animationFrame].drawTransparent(var2, var3);
                        this.field_q = oc.field_b[4][this.animationFrame];
                        this.field_y = var2;
                        this.field_A = var3;
                        break;
                      default:
                        switch (var11) {
                          case 21:
                            if (0 > this.field_o) {
                              this.field_o = 0;
                            }
                            if (this.field_o > 7) {
                              this.field_o = 7;
                            }
                            if ((this.field_o == 0 ||
                              this.field_o == 2) &&
                              (GridActor.field_l == 5 &&
                              ve.a((byte) 123, 0))) {
                              GameGraphicsResources.gemSprites[8].drawTransparent(var2, var3);
                            } else {
                              GameGraphicsResources.gemSprites[this.field_o].drawTransparent(var2, var3);
                            }
                            this.field_q = GameGraphicsResources.gemSprites[this.field_o];
                            this.field_y = var2;
                            this.field_A = var3;
                            break regionExit1;
                          case 22:
                            this.drawWizard(40, 0, (byte) 62);
                            break regionExit1;
                          case 23:
                            this.drawWizard(80, 1, (byte) 62);
                            break regionExit1;
                          case 24:
                            this.drawWizard(40, 2, (byte) 62);
                            break regionExit1;
                          case 26:
                            this.drawWizard(96, 4, (byte) 62);
                            break regionExit1;
                          case 27:
                            oc.field_b[4][37].drawTransparent(var2, var3);
                            this.field_A = var3;
                            this.field_y = var2;
                            this.field_q = oc.field_b[4][37];
                            break regionExit1;
                          case 28:
                            oc.field_b[4][36].drawTransparent(var2, var3);
                            this.field_y = var2;
                            this.field_q = oc.field_b[4][36];
                            this.field_A = var3;
                            break regionExit1;
                          case 29:
                            this.drawWizard(40, 0, (byte) 62);
                            break regionExit1;
                          case 30:
                            this.drawWizard(40, 1, (byte) 62);
                            break regionExit1;
                          case 31:
                            this.drawWizard(56, 2, (byte) 62);
                            break regionExit1;
                          case 32:
                            this.drawWizard(56, 3, (byte) 62);
                            break regionExit1;
                          case 33:
                            this.field_h = -this.field_h;
                            this.drawWizard(56, 4, (byte) 62);
                            this.field_h = -this.field_h;
                            break regionExit1;
                          case 34:
                            if (-1 != this.field_h) {
                              oc.field_b[0][37].drawMirrored(var2, var3);
                              this.field_q = oc.field_b[0][37].flipHorizontal();
                              this.field_y = var2;
                              this.field_A = var3;
                              break regionExit1;
                            }
                            oc.field_b[0][37].drawTransparent(var2, var3);
                            this.field_q = oc.field_b[0][37];
                            this.field_y = var2;
                            this.field_A = var3;
                            break regionExit1;
                          case 43:
                          case 36:
                          case 37:
                          case 38:
                          case 39:
                          case 40:
                          case 41:
                          case 44:
                          case 45:
                          default:
                            if (35 != var11 &&
                              var11 != 42) {
                              switch (var11) {
                                case 43:
                                  var9 = 37;
                                  if (this.field_w > 2) {
                                    var9 = 36;
                                  }
                                  if (20 < this.field_w) {
                                    var9 = 35;
                                  }
                                  if (this.field_h == 1) {
                                    oc.field_b[4][var9].drawTransparent(var2, var3);
                                    this.field_q = oc.field_b[4][var9];
                                    this.field_y = var2;
                                    this.field_A = var3;
                                    break regionExit1;
                                  }
                                  oc.field_b[4][var9].drawMirrored(var2, var3);
                                  this.field_q = oc.field_b[4][var9].flipHorizontal();
                                  this.field_y = var2;
                                  this.field_A = var3;
                                  break regionExit1;
                                case 36:
                                  this.drawWizard(24, 0, (byte) 62);
                                  break regionExit1;
                                case 37:
                                  this.drawWizard(56, 1, (byte) 62);
                                  break regionExit1;
                                case 38:
                                  this.drawWizard(40, 2, (byte) 62);
                                  break regionExit1;
                                case 39:
                                  this.drawWizard(40, 3, (byte) 62);
                                  break regionExit1;
                                case 40:
                                  this.drawWizard(40, 4, (byte) 62);
                                  break regionExit1;
                                case 41:
                                  if (this.field_h == -1) {
                                    MusicPatch.field_j[this.animationFrame].drawTransparent(var2, var3);
                                    this.field_q = MusicPatch.field_j[this.animationFrame];
                                    this.field_A = var3;
                                    this.field_y = var2;
                                    break regionExit1;
                                  }
                                  MusicPatch.field_j[this.animationFrame].drawMirrored(var2, var3);
                                  this.field_q = MusicPatch.field_j[this.animationFrame].flipHorizontal();
                                  this.field_A = var3;
                                  this.field_y = var2;
                                  break regionExit1;
                                default:
                                  break regionExit1;
                                case 45:
                                  this.drawWizard(40, 4, (byte) 62);
                                  break regionExit1;
                                case 44:
                                  var10 = 0;
                                  if (this.field_o == 0) {
                                    var10 = 10;
                                  }
                                  if (this.field_o == 1) {
                                    var10 = 25;
                                  }
                                  if (this.field_o == 2) {
                                    var10 = 50;
                                  }
                                  if (this.field_o == 3) {
                                    var10 = 75;
                                  }
                                  if (4 == this.field_o) {
                                    var10 = 100;
                                  }
                                  if (5 == this.field_o) {
                                    var10 = 150;
                                  }
                                  if (this.field_o == 6) {
                                    var10 = 250;
                                  }
                                  if (this.field_o == 7) {
                                    var10 = 500;
                                  }
                                  FlatTriangleRasterizer.font12.drawStringCentered(Integer.toString(var10), 16 + var2, var3 - 1, 0, -1);
                                  FlatTriangleRasterizer.font12.drawStringCentered(Integer.toString(var10), 16 + var2, var3 + 1, 0, -1);
                                  FlatTriangleRasterizer.font12.drawStringCentered(Integer.toString(var10), var2 + 16 - 1, var3, 0, -1);
                                  FlatTriangleRasterizer.font12.drawStringCentered(Integer.toString(var10), 17 + var2, var3, 0, -1);
                                  FlatTriangleRasterizer.font12.drawStringCentered(Integer.toString(var10), var2 + 16, var3, 16777215, -1);
                                  break regionExit1;
                              }
                            }
                            var9 = 37;
                            if (this.field_w > 2) {
                              var9 = 36;
                            }
                            if (this.field_w > 20) {
                              var9 = 35;
                            }
                            if (-1 == this.field_h) {
                              oc.field_b[1][var9].drawTransparent(var2, var3);
                              this.field_q = oc.field_b[1][var9];
                              this.field_A = var3;
                              this.field_y = var2;
                              break regionExit1;
                            }
                            oc.field_b[1][var9].drawMirrored(var2, var3);
                            this.field_q = oc.field_b[1][var9].flipHorizontal();
                            this.field_A = var3;
                            this.field_y = var2;
                            break regionExit1;
                        }
                      case 20:
                        this.field_w = this.field_w + 2;
                        var8 = this.field_w;
                        var4 = -this.field_w + 128;
                        if (var4 > 0) {
                          DualLinkNode.field_m.drawScaledAlpha(var2 - var8, var3 - var8, 2 * var8, var8 * 2, var4);
                        }
                        if (this.field_w > 120) {
                          this.field_k = 1;
                        }
                        break;
                    }
                    break;
                }
              }
            }
          } else {
            if (0 <= GridActor.field_g &&
              !pg.field_q) {
              if (this.field_h == -1) {
                ve.wizardSprites[this.animationFrame].drawTransparent(var2, var3);
                this.field_q = ra.wizardNoHatSprites[this.animationFrame];
                this.field_y = var2;
                this.field_A = var3;
              } else {
                ve.wizardSprites[this.animationFrame].drawMirrored(var2, var3);
                this.field_q = ra.wizardNoHatSprites[this.animationFrame].flipHorizontal();
                this.field_A = var3;
                this.field_y = var2;
              }
              if (0 <= AccountCreationForm.field_T &&
                300 > AccountCreationForm.field_T &&
                250 < sj.field_l) {
                if (AccountCreationForm.field_T >= 0 &&
                  AccountCreationForm.field_T < 50) {
                  if (uc.field_g < 20) {
                    stackIn_87_1 = 16711680;
                  } else {
                    stackIn_87_1 = 16776960;
                  }
                  this.drawOutlinedLabel(stackIn_87_1, var2, true, "(", 32 + var3);
                  if (uc.field_g < 20) {
                    stackIn_90_1 = 16711680;
                  } else {
                    stackIn_90_1 = 16776960;
                  }
                  this.drawOutlinedLabel(stackIn_90_1, ve.wizardSprites[this.animationFrame].fullWidth + var2, true, ")", 32 + var3);
                }
                if (AccountCreationForm.field_T >= 50 &&
                  AccountCreationForm.field_T < 100) {
                  var11 = GameGraphicsResources.wizardFont2.stringWidth(WeightedLruCache.a(new String[]{IntrusiveNode.field_h[hh.field_S], IntrusiveNode.field_h[nf.field_d]}, (byte) 126, ka.field_g));
                  var12 = var2 + ve.wizardSprites[this.animationFrame].fullWidth / 2;
                  if (var12 < var11 / 2) {
                    var12 = var11 / 2;
                  }
                  if (var12 > 640 - var11 / 2) {
                    var12 = -(var11 / 2) + 640;
                  }
                  if (uc.field_g < 20) {
                    stackIn_103_1 = 16711680;
                  } else {
                    stackIn_103_1 = 16776960;
                  }
                  this.drawOutlinedLabel(stackIn_103_1, var12, true, WeightedLruCache.a(new String[]{IntrusiveNode.field_h[hh.field_S], IntrusiveNode.field_h[nf.field_d]}, (byte) 107, ka.field_g), -4 + var3);
                }
                if (AccountCreationForm.field_T >= 100 &&
                  AccountCreationForm.field_T < 150) {
                  var11 = GameGraphicsResources.wizardFont2.stringWidth(WeightedLruCache.a(new String[]{IntrusiveNode.field_h[hh.field_S], IntrusiveNode.field_h[nf.field_d]}, (byte) 59, wb.field_a));
                  var12 = var2 + ve.wizardSprites[this.animationFrame].fullWidth / 2;
                  if (var11 / 2 > var12) {
                    var12 = var11 / 2;
                  }
                  if (var12 > -(var11 / 2) + 640) {
                    var12 = -(var11 / 2) + 640;
                  }
                  if (uc.field_g >= 20) {
                    stackIn_115_1 = 16776960;
                  } else {
                    stackIn_115_1 = 16711680;
                  }
                  this.drawOutlinedLabel(stackIn_115_1, var12, true, WeightedLruCache.a(new String[]{IntrusiveNode.field_h[hh.field_S], IntrusiveNode.field_h[nf.field_d]}, (byte) 61, wb.field_a), var3 - 4);
                }
                if (AccountCreationForm.field_T >= 150 &&
                  AccountCreationForm.field_T < 200) {
                  var11 = GameGraphicsResources.wizardFont2.stringWidth(WeightedLruCache.a(new String[]{IntrusiveNode.field_h[hh.field_S], IntrusiveNode.field_h[nf.field_d]}, (byte) 66, RasterSnapshot.field_m));
                  var12 = var2 + ve.wizardSprites[this.animationFrame].fullWidth / 2;
                  if (var11 / 2 > var12) {
                    var12 = var11 / 2;
                  }
                  if (-(var11 / 2) + 640 < var12) {
                    var12 = -(var11 / 2) + 640;
                  }
                  if (20 > uc.field_g) {
                    stackIn_125_1 = 16711680;
                  } else {
                    stackIn_125_1 = 16776960;
                  }
                  this.drawOutlinedLabel(stackIn_125_1, var12, true, WeightedLruCache.a(new String[]{IntrusiveNode.field_h[hh.field_S], IntrusiveNode.field_h[nf.field_d]}, (byte) 46, RasterSnapshot.field_m), -4 + var3);
                }
              }
              if (DiskCacheWorker.field_e > 0 &&
                7 > DiskCacheWorker.field_e % 10 &&
                1 < DiskCacheWorker.field_e % 10) {
                if (this.field_h != -1) {
                  ve.wizardSprites[this.animationFrame].flipHorizontal().drawSilhouette(var2, var3, 16777215);
                } else {
                  ve.wizardSprites[this.animationFrame].drawSilhouette(var2, var3, 16777215);
                }
              }
              if (120 > fi.field_x) {
                var4 = 256 * fi.field_x / 120;
                var11_double = 0.0;
                for (var13 = 0; var13 < 5; var13++) {
                  var11_double = (double)fi.field_x + 6.28 * (double)var13 / 5.0;
                  var14 = 32;
                  if (100 < fi.field_x) {
                    var14 = var14 + (10 - Math.abs(-110 + fi.field_x));
                  }
                  GridPoint.field_c.drawScaledAlpha(-6 + var2 + (int)(Math.cos(var11_double) * (double)var14 + 32.0), -6 + ((int)(32.0 + Math.sin(var11_double) * (double)var14) + var3), 12, 12, var4);
                }
              }
            }
          }
        }
    }

    private final void c(int param0) {
        tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[10], 100, ee.field_p * 256 / 100);
        if (param0 != 1) {
          LevelData var3 = (LevelData) null;
          this.a(-123, (byte) -40, (LevelData) null, true);
        }
    }

    private final boolean a(boolean param0, LevelData param1, int param2) {
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.field_z = this.field_z + 1;
          this.animationFrame = param2;
          if (this.field_s > 0 &&
            !param0) {
            this.field_s = this.field_s - 1;
            this.field_p = this.field_p - 1;
            if (this.field_p > 0) {
              if (pk.field_s &&
                !param0) {
                this.c(param2 ^ 24);
              }
            } else {
              if (pk.field_s &&
                !param0) {
                this.c(false);
              }
            }
            if (0 >= this.field_p) {
              this.verticalVelocity = 60;
            }
          }
          if (!param0) {
            if (this.field_z > 35) {
              this.animationFrame = 26;
            }
            if (this.field_z > 50) {
              this.field_x = 0;
              this.field_z = 0;
            }
            if (this.field_z != 35) {
              return false;
            }
            return true;
          }
          if (this.field_z > 15) {
            this.animationFrame = 26;
          }
          if (this.field_z > 30) {
            this.animationFrame = 27;
          }
          if (this.field_z > 40) {
            this.animationFrame = 28;
          }
          if (this.field_z > 50) {
            this.field_z = 0;
            this.field_x = 0;
          }
          if (this.field_z != 40) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_40_0 = var4;
          stackIn_40_1 = new StringBuilder().append("eg.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, byte param1, LevelData param2, boolean param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        GridPoint var7 = null;
        GridPoint var8 = null;
        var6 = wizardrun.field_H;
        try {
          if (0 <= this.verticalVelocity) {
            this.verticalVelocity = this.verticalVelocity + 3;
            var7 = new GridPoint(this.tilePosition);
            var8 = var7;
            var8.row = var8.row + 1;
            if (param2.field_f[var7.toTileIndex((byte) -68)] == 1 ||
              !(var8.row < 14)) {
              this.verticalVelocity = -Math.abs(this.verticalVelocity);
            }
            if (this.verticalVelocity > 20) {
              this.verticalVelocity = 5;
            }
          } else {
            if (this.verticalVelocity < -20) {
              this.verticalVelocity = -5;
            }
          }
          var5_int = 64 % ((param1 - 58) / 56);
          fieldTemp$0 = this.field_z;
          this.field_z = this.field_z - 1;
          if (0 >= fieldTemp$0) {
            this.field_o = this.field_o + 1;
            this.field_z = 5;
            if (1 < this.field_o) {
              this.field_o = 0;
            }
            this.animationFrame = this.animationFrame + 1;
            if (param3) {
              this.field_z = 5;
              if (9 < this.animationFrame) {
                this.animationFrame = 2;
              }
            } else {
              if (5 < this.animationFrame) {
                this.animationFrame = 2;
              }
            }
            if (this.animationFrame < 2) {
              this.animationFrame = 2;
            }
          }
          if (this.verticalVelocity == 0) {
            this.verticalVelocity = 20;
          }
          this.a(1, BufferedRandomAccessFile.soundEffects, param2, 1, param0, 1, tl.field_a, pk.field_s, (byte) 127);
          if (this.field_s > 0 &&
            !param3) {
            this.field_s = this.field_s - 1;
            this.field_p = this.field_p - 1;
            if (0 >= this.field_p) {
              if (pk.field_s &&
                !param3) {
                this.c(false);
              }
            } else {
              if (pk.field_s) {
                this.c(1);
              }
            }
            if (this.field_p <= 0) {
              this.verticalVelocity = 60;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_42_0 = var5;
          stackIn_42_1 = new StringBuilder().append("eg.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, LevelData param1) {
        this.verticalVelocity = this.verticalVelocity + 1;
        this.field_w = this.field_w + 1;
        if (this.field_w > 1000) {
          this.field_w = 0;
          this.field_r = 0;
          if (pk.field_s) {
            tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[6], 100, ee.field_p * 256 / 100);
          }
        }
        this.a(1, BufferedRandomAccessFile.soundEffects, param1, 1, 5, 1, tl.field_a, pk.field_s, (byte) -57);
        if (1 == this.b(param1, -4) &&
          this.tileOffset.row == 0) {
          this.verticalVelocity = 20;
          if (pk.field_s) {
            tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[2], 100, ee.field_p * 64 / 100);
          }
        }
        this.animationFrame = 31;
        this.field_o = 7;
        if (param0 <= 13) {
          return;
        }
        try {
          this.b(5);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "eg.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void e(boolean param0) {
        GridPoint var2;
        GridPoint var3;
        GridPoint var4;
        if (param0) {
          return;
        }
        if (0 == ii.field_e[0].field_s &&
          this.field_q != null &&
          ii.field_e[0].field_q != null) {
          var4 = new GridPoint();
          var2 = var4;
          var3 = new GridPoint();
          var2.column = this.field_y;
          var4.row = this.field_A;
          var3.column = ii.field_e[0].field_y;
          var3.row = ii.field_e[0].field_A;
          if (SpriteCollision.overlapsOpaquePixels(this.field_q, var2.column, var4.row, ii.field_e[0].field_q, var3.column, var3.row)) {
            ii.field_e[0].field_s = 1;
          }
        }
    }

    private final void c(boolean param0) {
        String var3;
        ol.field_e = true;
        if (3 == this.actorType) {
          tl.field_a.addSample(SpriteState.secondarySoundEffects[3], 100, ee.field_p * 256 / 100);
        } else {
          if (this.actorType == 4) {
            tl.field_a.addSample(SpriteState.secondarySoundEffects[4], 100, ee.field_p * 256 / 100);
          } else {
            if (5 == this.actorType) {
              tl.field_a.addSample(SpriteState.secondarySoundEffects[5], 100, ee.field_p * 256 / 100);
            } else {
              if (this.actorType == 6) {
                tl.field_a.addSample(SpriteState.secondarySoundEffects[7], 100, ee.field_p * 256 / 100);
              } else {
                if (this.actorType == 8) {
                  tl.field_a.addSample(SpriteState.secondarySoundEffects[8], 100, 256 * ee.field_p / 100);
                } else {
                  if (this.actorType == 7) {
                    tl.field_a.addSample(SpriteState.secondarySoundEffects[9], 100, 256 * ee.field_p / 100);
                  } else {
                    if (this.actorType == 9) {
                      tl.field_a.addSample(SpriteState.secondarySoundEffects[10], 100, 256 * ee.field_p / 100);
                    } else {
                      if (this.actorType == 10) {
                        tl.field_a.addSample(SpriteState.secondarySoundEffects[11], 100, 256 * ee.field_p / 100);
                      } else {
                        if (this.actorType == 12) {
                          tl.field_a.addSample(SpriteState.secondarySoundEffects[13], 100, ee.field_p * 256 / 100);
                        } else {
                          if (this.actorType == 14) {
                            tl.field_a.addSample(SpriteState.secondarySoundEffects[14], 100, ee.field_p * 256 / 100);
                          } else {
                            if (this.actorType == 13) {
                              tl.field_a.addSample(SpriteState.secondarySoundEffects[15], 100, 256 * ee.field_p / 100);
                            } else {
                              if (this.actorType == 15) {
                                tl.field_a.addSample(SpriteState.secondarySoundEffects[16], 100, 256 * ee.field_p / 100);
                              } else {
                                if (this.actorType == 16) {
                                  tl.field_a.addSample(SpriteState.secondarySoundEffects[19], 100, ee.field_p * 256 / 100);
                                } else {
                                  if (this.actorType == 17) {
                                    tl.field_a.addSample(SpriteState.secondarySoundEffects[21], 100, 256 * ee.field_p / 100);
                                  } else {
                                    if (22 == this.actorType) {
                                      tl.field_a.addSample(SpriteState.secondarySoundEffects[22], 100, ee.field_p * 256 / 100);
                                    } else {
                                      if (this.actorType == 24) {
                                        tl.field_a.addSample(SpriteState.secondarySoundEffects[23], 100, 256 * ee.field_p / 100);
                                      } else {
                                        if (this.actorType == 23) {
                                          tl.field_a.addSample(SpriteState.secondarySoundEffects[24], 100, ee.field_p * 256 / 100);
                                        } else {
                                          if (26 == this.actorType) {
                                            tl.field_a.addSample(SpriteState.secondarySoundEffects[26], 100, ee.field_p * 256 / 100);
                                          } else {
                                            if (this.actorType == 29) {
                                              tl.field_a.addSample(SpriteState.secondarySoundEffects[27], 100, 256 * ee.field_p / 100);
                                            } else {
                                              if (31 == this.actorType) {
                                                tl.field_a.addSample(SpriteState.secondarySoundEffects[28], 100, ee.field_p * 256 / 100);
                                              } else {
                                                if (30 == this.actorType) {
                                                  tl.field_a.addSample(SpriteState.secondarySoundEffects[29], 100, 256 * ee.field_p / 100);
                                                } else {
                                                  if (this.actorType == 32) {
                                                    tl.field_a.addSample(SpriteState.secondarySoundEffects[30], 100, 256 * ee.field_p / 100);
                                                  } else {
                                                    if (this.actorType == 33) {
                                                      tl.field_a.addSample(SpriteState.secondarySoundEffects[31], 100, 256 * ee.field_p / 100);
                                                    } else {
                                                      if (this.actorType == 36) {
                                                        tl.field_a.addSample(SpriteState.secondarySoundEffects[32], 100, 256 * ee.field_p / 100);
                                                      } else {
                                                        if (param0) {
                                                          var3 = (String) null;
                                                          this.drawOutlinedLabel(-17, 111, false, (String) null, 55);
                                                        }
                                                        if (this.actorType == 38) {
                                                          tl.field_a.addSample(SpriteState.secondarySoundEffects[33], 100, ee.field_p * 256 / 100);
                                                        } else {
                                                          if (this.actorType == 37) {
                                                            tl.field_a.addSample(SpriteState.secondarySoundEffects[34], 100, ee.field_p * 256 / 100);
                                                          } else {
                                                            if (39 == this.actorType) {
                                                              tl.field_a.addSample(SpriteState.secondarySoundEffects[35], 100, ee.field_p * 256 / 100);
                                                            } else {
                                                              if (this.actorType == 40) {
                                                                tl.field_a.addSample(SpriteState.secondarySoundEffects[37], 100, 256 * ee.field_p / 100);
                                                              } else {
                                                                tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[9], 100, ee.field_p * 256 / 100);
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void updateActor(byte param0, LevelData param1) {
        int fieldTemp$0 = 0;
        GridPoint dupTemp$1 = null;
        GridPoint dupTemp$2 = null;
        GridPoint dupTemp$3 = null;
        GridPoint dupTemp$4 = null;
        GridPoint dupTemp$5 = null;
        GridPoint dupTemp$6 = null;
        GridPoint dupTemp$7 = null;
        GridPoint dupTemp$8 = null;
        GridPoint dupTemp$9 = null;
        GridPoint dupTemp$10 = null;
        GridPoint dupTemp$11 = null;
        GridPoint dupTemp$12 = null;
        GridPoint dupTemp$13 = null;
        PlatformActor dupTemp$14 = null;
        PlatformActor dupTemp$15 = null;
        int fieldTemp$75 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$69 = 0;
        int fieldTemp$70 = 0;
        GridPoint dupTemp$71 = null;
        GridPoint dupTemp$72 = null;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$67 = 0;
        int fieldTemp$68 = 0;
        int fieldTemp$19 = 0;
        GridPoint dupTemp$20 = null;
        GridPoint dupTemp$21 = null;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        GridPoint dupTemp$24 = null;
        GridPoint dupTemp$25 = null;
        int fieldTemp$26 = 0;
        int fieldTemp$27 = 0;
        int fieldTemp$28 = 0;
        int fieldTemp$29 = 0;
        int fieldTemp$66 = 0;
        int fieldTemp$60 = 0;
        int fieldTemp$61 = 0;
        GridPoint dupTemp$62 = null;
        GridPoint dupTemp$63 = null;
        int fieldTemp$56 = 0;
        int fieldTemp$57 = 0;
        GridPoint dupTemp$58 = null;
        GridPoint dupTemp$59 = null;
        int fieldTemp$30 = 0;
        int fieldTemp$31 = 0;
        GridPoint dupTemp$32 = null;
        GridPoint dupTemp$33 = null;
        int fieldTemp$34 = 0;
        int fieldTemp$35 = 0;
        GridPoint dupTemp$36 = null;
        GridPoint dupTemp$37 = null;
        int fieldTemp$55 = 0;
        GridPoint dupTemp$53 = null;
        GridPoint dupTemp$54 = null;
        int fieldTemp$38 = 0;
        int fieldTemp$39 = 0;
        int fieldTemp$51 = 0;
        int fieldTemp$52 = 0;
        int fieldTemp$49 = 0;
        int fieldTemp$50 = 0;
        int fieldTemp$40 = 0;
        GridPoint dupTemp$41 = null;
        GridPoint dupTemp$42 = null;
        int fieldTemp$43 = 0;
        int fieldTemp$44 = 0;
        int fieldTemp$45 = 0;
        GridPoint dupTemp$46 = null;
        GridPoint dupTemp$47 = null;
        int fieldTemp$48 = 0;
        int fieldTemp$64 = 0;
        int fieldTemp$65 = 0;
        int fieldTemp$73 = 0;
        int fieldTemp$74 = 0;
        int fieldTemp$76 = 0;
        int fieldTemp$77 = 0;
        int stackIn_83_0 = 0;
        int stackIn_84_1 = 0;
        boolean stackIn_183_0 = false;
        int stackIn_195_0 = 0;
        int stackIn_248_0 = 0;
        int stackIn_249_1 = 0;
        boolean stackIn_276_1 = false;
        int stackIn_277_2 = 0;
        int stackIn_401_0 = 0;
        int stackIn_440_0 = 0;
        int stackIn_457_0 = 0;
        int stackIn_507_1 = 0;
        int stackIn_535_0 = 0;
        int stackIn_551_1 = 0;
        int stackIn_555_1 = 0;
        boolean stackIn_574_0 = false;
        int stackIn_590_1 = 0;
        int stackIn_658_1 = 0;
        int stackIn_716_1 = 0;
        int stackIn_773_0 = 0;
        int stackIn_774_1 = 0;
        int stackIn_784_0 = 0;
        int stackIn_808_0 = 0;
        int stackIn_817_0 = 0;
        int stackIn_833_1 = 0;
        int stackIn_871_1 = 0;
        int stackIn_875_1 = 0;
        int stackIn_896_0 = 0;
        int stackIn_897_1 = 0;
        int stackIn_972_1 = 0;
        int stackIn_1000_0 = 0;
        int stackIn_1001_1 = 0;
        int stackIn_1043_1 = 0;
        int stackIn_1071_1 = 0;
        int stackIn_1157_1 = 0;
        int stackIn_1184_0 = 0;
        int stackIn_1185_1 = 0;
        int stackIn_1225_1 = 0;
        int stackIn_1227_0 = 0;
        int stackIn_1228_1 = 0;
        int stackIn_1239_0 = 0;
        int stackIn_1240_1 = 0;
        RuntimeException stackIn_1269_0 = null;
        StringBuilder stackIn_1269_1 = null;
        String stackIn_1270_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        PlatformActor var4_ref_eg = null;
        int var7 = 0;
        GridPoint var8 = null;
        GridPoint var9 = null;
        GridPoint var10 = null;
        GridPoint var11 = null;
        var7 = wizardrun.field_H;
        try {
          if (17 < this.tilePosition.row) {
            this.tilePosition.row = -2;
          }
          if (this.tilePosition.row < -2) {
            this.tilePosition.row = 17;
          }
          regionExit1: {
            var3_int = 15;
            var4 = this.actorType;
            if (var4 == 0) {
              if (DiskCacheWorker.field_e > 0) {
                DiskCacheWorker.field_e = DiskCacheWorker.field_e - 1;
                this.field_s = 0;
              }
              if (0 == this.field_s) {
                var3_int = 0;
                if (sc.field_m.field_b == 1) {
                  var3_int = 30;
                  this.field_h = 1;
                }
                if (sc.field_m.field_b == -1) {
                  var3_int = 30;
                  this.field_h = -1;
                }
                if (sc.field_m.field_f &&
                  0 == this.tileOffset.row &&
                  this.b(param1, param0 + 119) == 1) {
                  this.verticalVelocity = 70;
                  if (pk.field_s) {
                    tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[3], 100, ee.field_p * 256 / 100);
                  }
                }
                this.tileOffset.column = this.tileOffset.column + 120;
                this.field_d = this.field_d / 2;
                this.wrapHorizontalPosition((byte) 114);
                if (0 != var3_int) {
                  this.field_w = this.field_w - 1;
                  fieldTemp$0 = this.field_z;
                  this.field_z = this.field_z - 1;
                  if (0 > fieldTemp$0) {
                    this.field_z = 5;
                    this.animationFrame = this.animationFrame + 1;
                    if (this.animationFrame > 3) {
                      this.animationFrame = 0;
                    }
                  }
                  if (0 > this.field_w) {
                    this.field_o = this.field_o + 1;
                    this.field_w = 10;
                  }
                  if (this.field_o < 3 ||
                    this.field_o > 6) {
                    this.field_o = 3;
                  }
                } else {
                  this.field_o = 0;
                  this.field_z = 0;
                  this.animationFrame = 1;
                }
                if (!(0 >= this.tileOffset.row) ||
                  this.b(param1, param0 ^ 121) == 0) {
                  if (this.verticalVelocity > 0) {
                    this.animationFrame = 9;
                  }
                  if (this.verticalVelocity > 30) {
                    this.animationFrame = 8;
                  }
                  if (this.verticalVelocity > 50) {
                    this.animationFrame = 7;
                  }
                  if (0 >= this.verticalVelocity) {
                    this.animationFrame = 10;
                  }
                }
                if (0 < ValidatedTextField.field_V) {
                  this.animationFrame = 4;
                  ValidatedTextField.field_V = ValidatedTextField.field_V - 1;
                  if (ValidatedTextField.field_V < 15) {
                    this.animationFrame = 5;
                  }
                }
                if (!sc.field_m.field_f &&
                  10 < this.verticalVelocity) {
                  this.verticalVelocity = this.verticalVelocity - 4;
                }
                this.a(1, BufferedRandomAccessFile.soundEffects, param1, 1, var3_int, 1, tl.field_a, pk.field_s, (byte) -104);
                if (!sc.field_m.field_d) {
                  if (ValidatedTextField.field_V < 10) {
                    if (fi.field_x > 0 &&
                      10 > fi.field_x) {
                      ValidatedTextField.field_V = 25;
                      fi.field_x = 0;
                      ii.field_e[WidgetTheme.field_k].initialize(9147, 1, this.tilePosition);
                      ii.field_e[WidgetTheme.field_k].tileOffset.set(param0 ^ 42, this.tileOffset);
                      dupTemp$1 = ii.field_e[WidgetTheme.field_k].tileOffset;
                      dupTemp$1.row = dupTemp$1.row + 140;
                      ii.field_e[WidgetTheme.field_k].field_h = this.field_h;
                      dupTemp$2 = ii.field_e[WidgetTheme.field_k].tileOffset;
                      dupTemp$2.column = dupTemp$2.column + 40;
                      WidgetTheme.field_k = WidgetTheme.field_k + 1;
                      if (pk.field_s) {
                        tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[0], 100, ee.field_p * 256 / 100);
                      }
                    }
                    if (fi.field_x >= 10 &&
                      fi.field_x < 40) {
                      ValidatedTextField.field_V = 5;
                      fi.field_x = fi.field_x - 20;
                      if (fi.field_x < 0) {
                        fi.field_x = 0;
                      }
                      ii.field_e[WidgetTheme.field_k].initialize(9147, 1, this.tilePosition);
                      ii.field_e[WidgetTheme.field_k].tileOffset.set(param0 ^ 21, this.tileOffset);
                      dupTemp$3 = ii.field_e[WidgetTheme.field_k].tileOffset;
                      dupTemp$3.row = dupTemp$3.row + 140;
                      ii.field_e[WidgetTheme.field_k].field_h = this.field_h;
                      dupTemp$4 = ii.field_e[WidgetTheme.field_k].tileOffset;
                      dupTemp$4.column = dupTemp$4.column + 40;
                      ii.field_e[WidgetTheme.field_k].verticalVelocity = -10;
                      WidgetTheme.field_k = WidgetTheme.field_k + 1;
                      ii.field_e[WidgetTheme.field_k].initialize(param0 + 9270, 1, this.tilePosition);
                      ii.field_e[WidgetTheme.field_k].tileOffset.set(-112, this.tileOffset);
                      dupTemp$5 = ii.field_e[WidgetTheme.field_k].tileOffset;
                      dupTemp$5.row = dupTemp$5.row + 140;
                      ii.field_e[WidgetTheme.field_k].field_h = this.field_h;
                      dupTemp$6 = ii.field_e[WidgetTheme.field_k].tileOffset;
                      dupTemp$6.column = dupTemp$6.column + 40;
                      ii.field_e[WidgetTheme.field_k].verticalVelocity = 10;
                      WidgetTheme.field_k = WidgetTheme.field_k + 1;
                      if (pk.field_s) {
                        tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[23], 100, ee.field_p * 256 / 100);
                      }
                    }
                    if (fi.field_x >= 40 &&
                      fi.field_x < 100) {
                      ValidatedTextField.field_V = 5;
                      fi.field_x = fi.field_x - 30;
                      if (fi.field_x < 0) {
                        fi.field_x = 0;
                      }
                      ii.field_e[WidgetTheme.field_k].initialize(9147, 1, this.tilePosition);
                      ii.field_e[WidgetTheme.field_k].tileOffset.set(-87, this.tileOffset);
                      dupTemp$7 = ii.field_e[WidgetTheme.field_k].tileOffset;
                      dupTemp$7.row = dupTemp$7.row + 140;
                      ii.field_e[WidgetTheme.field_k].field_h = this.field_h;
                      dupTemp$8 = ii.field_e[WidgetTheme.field_k].tileOffset;
                      dupTemp$8.column = dupTemp$8.column + 40;
                      ii.field_e[WidgetTheme.field_k].verticalVelocity = 30;
                      WidgetTheme.field_k = WidgetTheme.field_k + 1;
                      ii.field_e[WidgetTheme.field_k].initialize(9147, 1, this.tilePosition);
                      ii.field_e[WidgetTheme.field_k].tileOffset.set(-82, this.tileOffset);
                      dupTemp$9 = ii.field_e[WidgetTheme.field_k].tileOffset;
                      dupTemp$9.row = dupTemp$9.row + 140;
                      ii.field_e[WidgetTheme.field_k].field_h = this.field_h;
                      dupTemp$10 = ii.field_e[WidgetTheme.field_k].tileOffset;
                      dupTemp$10.column = dupTemp$10.column + 40;
                      ii.field_e[WidgetTheme.field_k].verticalVelocity = 0;
                      WidgetTheme.field_k = WidgetTheme.field_k + 1;
                      ii.field_e[WidgetTheme.field_k].initialize(9147, 1, this.tilePosition);
                      ii.field_e[WidgetTheme.field_k].tileOffset.set(-97, this.tileOffset);
                      dupTemp$11 = ii.field_e[WidgetTheme.field_k].tileOffset;
                      dupTemp$11.row = dupTemp$11.row + 140;
                      ii.field_e[WidgetTheme.field_k].field_h = this.field_h;
                      dupTemp$12 = ii.field_e[WidgetTheme.field_k].tileOffset;
                      dupTemp$12.column = dupTemp$12.column + 40;
                      ii.field_e[WidgetTheme.field_k].verticalVelocity = -30;
                      WidgetTheme.field_k = WidgetTheme.field_k + 1;
                      if (pk.field_s) {
                        tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[24], 100, ee.field_p * 256 / 100);
                      }
                    }
                    if (fi.field_x < 100) {
                      this.field_d = this.field_d * 2;
                      this.tileOffset.column = this.tileOffset.column - 120;
                      this.wrapHorizontalPosition((byte) 83);
                      break regionExit1;
                    }
                    fi.field_x = 0;
                    ValidatedTextField.field_V = 25;
                    if (this.verticalVelocity >= 0) {
                      this.verticalVelocity = this.verticalVelocity - 10;
                    }
                    ii.field_e[WidgetTheme.field_k].initialize(9147, 2, this.tilePosition);
                    ii.field_e[WidgetTheme.field_k].tileOffset.set(-83, this.tileOffset);
                    ii.field_e[WidgetTheme.field_k].field_h = this.field_h;
                    dupTemp$13 = ii.field_e[WidgetTheme.field_k].tileOffset;
                    dupTemp$13.column = dupTemp$13.column + 60 * this.field_h;
                    ii.field_e[WidgetTheme.field_k].verticalVelocity = 5 * (fi.field_x / 10);
                    WidgetTheme.field_k = WidgetTheme.field_k + 1;
                    stackIn_183_0 = !(pk.field_s);
                    if (!stackIn_183_0) {
                      tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[2], 100, 256 * ee.field_p / 100);
                    }
                  }
                } else {
                  if (fi.field_x < 120) {
                    fi.field_x = fi.field_x + 1;
                  }
                  if (120 <= fi.field_x) {
                    fi.field_x = fi.field_x - 20;
                  }
                  if (fi.field_x % 10 == 5 &&
                    pk.field_s) {
                    tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[16], 100, 256 * ee.field_p / 100);
                  }
                }
                this.field_d = this.field_d * 2;
                this.tileOffset.column = this.tileOffset.column - 120;
                this.wrapHorizontalPosition((byte) 83);
              } else {
                this.animationFrame = Math.abs(this.verticalVelocity) / 10 % 2 + 12;
                fi.field_x = 0;
                if (this.field_s == 1) {
                  this.verticalVelocity = -40;
                  this.field_s = 2;
                  stackIn_83_0 = 0;
                  if (pk.field_s) {
                    stackIn_84_1 = 0;
                  } else {
                    stackIn_84_1 = 1;
                  }
                  if (stackIn_83_0 == stackIn_84_1) {
                    tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[8], 100, ee.field_p * 256 / 100);
                  }
                }
                this.verticalVelocity = this.verticalVelocity + 1;
                this.field_o = 1;
                this.tileOffset.row = this.tileOffset.row - this.verticalVelocity;
                if (this.verticalVelocity > 0) {
                  this.field_o = 2;
                }
                if (this.tileOffset.row < 0) {
                  this.tileOffset.row = this.tileOffset.row + 240;
                  this.tilePosition.row = this.tilePosition.row - 1;
                }
                if (this.tilePosition.row < -2) {
                  this.tilePosition.row = 2;
                  this.tilePosition.column = 2;
                  if (4 == GridActor.field_l &&
                    ql.field_c == 5) {
                    this.tilePosition.column = this.tilePosition.column + 1;
                  }
                  DelegatingCanvas.field_b = true;
                  DiskCacheWorker.field_e = 100;
                  this.tileOffset.row = 0;
                  this.field_s = 0;
                  GameApplet.field_g = true;
                  GridActor.field_g = GridActor.field_g - 1;
                  BufferedSocket.field_c = BufferedSocket.field_c + 1;
                  this.field_h = 1;
                  this.verticalVelocity = 0;
                  this.tileOffset.column = 0;
                  if (GridActor.field_g < 0) {
                    bb.field_j = me.field_b;
                    BufferedSocket.field_a = 580;
                  }
                }
              }
            } else {
              if (var4 == 1) {
                if (this.verticalVelocity <= 0 &&
                  1 == this.b(param1, param0 + 119) &&
                  0 == this.tileOffset.row) {
                  this.verticalVelocity = 30;
                  if (this.tilePosition.column >= 0 &&
                    this.tilePosition.column < 20) {
                    stackIn_195_0 = (pk.field_s) ? 0 : 1;
                    if (stackIn_195_0 != 1) {
                      tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[1], 100, ee.field_p * 128 / 100);
                    }
                  }
                }
                this.field_w = this.field_w + 1;
                if (this.field_w <= 2) {
                  this.a(1, BufferedRandomAccessFile.soundEffects, param1, 1, 60, 0, tl.field_a, pk.field_s, (byte) -73);
                  if (!pg.field_q) {
                    for (var4 = 0; WidgetTheme.field_k > var4; var4++) {
                      if (ii.field_e[var4].field_p > 0 &&
                        ii.field_e[var4].field_r == 0 &&
                        null != ii.field_e[var4].field_q &&
                        this.field_q != null) {
                        var8 = new GridPoint();
                        var9 = new GridPoint();
                        var8.column = this.field_y;
                        var8.row = this.field_A;
                        var9.column = ii.field_e[var4].field_y;
                        var9.row = ii.field_e[var4].field_A;
                        if (SpriteCollision.overlapsOpaquePixels(this.field_q, var8.column, var8.row, ii.field_e[var4].field_q, var9.column, var9.row)) {
                          dupTemp$14 = ii.field_e[var4];
                          dupTemp$14.field_s = dupTemp$14.field_s + 1;
                          if (pk.field_s) {
                            tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[10], 100, 256 * ee.field_p / 100);
                          }
                          ii.field_e[var4].field_m = this.field_h;
                          this.actorType = 20;
                          this.field_w = 4;
                        }
                      }
                    }
                  }
                }
                if (this.field_w == 2) {
                  this.field_w = 0;
                }
                if (30 <= this.field_w) {
                  this.field_k = 1;
                }
              } else {
                if (var4 == 2) {
                  this.field_w = this.field_w + 1;
                  this.verticalVelocity = 2;
                  if (this.field_w < 10) {
                    this.tilePosition.row = this.tilePosition.row - 1;
                    if (param1.field_d[this.tilePosition.toTileIndex((byte) -68)]) {
                      param1.field_d[this.tilePosition.toTileIndex((byte) -68)] = false;
                      ii.field_e[WidgetTheme.field_k].initialize(9147, 21, new GridPoint(this.tilePosition));
                      var4_ref_eg = ii.field_e[WidgetTheme.field_k];
                      WidgetTheme.field_k = WidgetTheme.field_k + 1;
                      var4_ref_eg.tileOffset.set(-117, this.tileOffset);
                      var4_ref_eg.field_o = 0;
                      var4_ref_eg.verticalVelocity = 4;
                      var4_ref_eg.tilePosition.row = var4_ref_eg.tilePosition.row + 2;
                      var4_ref_eg.field_h = this.field_h;
                    }
                    this.tilePosition.row = this.tilePosition.row + 1;
                    this.a(1, BufferedRandomAccessFile.soundEffects, param1, 1, 30, 0, tl.field_a, pk.field_s, (byte) 29);
                    for (var4 = 0; var4 < WidgetTheme.field_k; var4++) {
                      if (ii.field_e[var4].field_p > 0 &&
                        this.field_q != null &&
                        null != ii.field_e[var4].field_q) {
                        var10 = new GridPoint();
                        var11 = new GridPoint();
                        var10.row = this.field_A;
                        var10.column = this.field_y;
                        var11.column = ii.field_e[var4].field_y;
                        var11.row = ii.field_e[var4].field_A;
                        if (SpriteCollision.overlapsOpaquePixels(this.field_q, var10.column, var10.row, ii.field_e[var4].field_q, var11.column, var11.row)) {
                          if (ii.field_e[var4].field_d <= 64 &&
                            ii.field_e[var4].field_p <= 10) {
                            ii.field_e[var4].field_m = this.field_h;
                            ii.field_e[var4].field_h = this.field_h;
                            stackIn_248_0 = 1;
                            if (pk.field_s) {
                              stackIn_249_1 = 0;
                            } else {
                              stackIn_249_1 = 1;
                            }
                            if (stackIn_248_0 != stackIn_249_1 &&
                              ii.field_e[var4].field_r <= 0) {
                              tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[2], 100, 256 * ee.field_p / 100);
                            }
                            ii.field_e[var4].field_r = 1;
                            ii.field_e[var4].field_w = 0;
                          } else {
                            dupTemp$15 = ii.field_e[var4];
                            dupTemp$15.field_s = dupTemp$15.field_s + 10;
                            if (pk.field_s) {
                              tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[2], 100, 256 * ee.field_p / 100);
                            }
                            ii.field_e[var4].field_m = this.field_h;
                            if (!(ii.field_e[var4].field_p < 10) ||
                              !(ii.field_e[var4].field_d <= 64)) {
                              this.field_w = 4;
                              this.actorType = 20;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (this.field_w == 3) {
                    this.field_w = 0;
                  }
                  if (60 <= this.field_w) {
                    this.field_k = 1;
                  }
                } else {
                  if (var4 != 3) {
                    if (var4 != 4 &&
                      var4 != 9 &&
                      var4 != 13 &&
                      24 != var4) {
                      if (var4 == 5) {
                        if (this.field_p <= 0) {
                          this.a(false, param0 + 243, param1);
                        } else {
                          if (this.field_r != 0) {
                            this.a(77, param1);
                          } else {
                            if (this.field_x == 0) {
                              this.animationFrame = 19;
                              if (15 < this.field_w) {
                                this.animationFrame = 22;
                              }
                              fieldTemp$75 = this.field_w;
                              this.field_w = this.field_w + 1;
                              if (fieldTemp$75 > 25) {
                                this.field_x = 2;
                                this.verticalVelocity = 85;
                                this.field_w = 0;
                                if (this.tilePosition.row >= ii.field_e[0].tilePosition.row) {
                                  this.verticalVelocity = 60;
                                }
                              }
                            }
                            if (this.field_x == 2) {
                              this.a(false, param0 ^ -109, 25, param1);
                            }
                            if (this.field_x == 3) {
                              this.a(15, -74, false, param1);
                            }
                            this.e(false);
                          }
                        }
                        break regionExit1;
                      }
                      if (6 == var4) {
                        if (this.field_p <= 0) {
                          this.a(true, param0 + 243, param1);
                        } else {
                          if (this.field_o == 7) {
                            this.field_z = this.field_z - 1;
                            if (this.field_z <= 0) {
                              this.field_z = 5;
                              this.animationFrame = this.animationFrame + 1;
                            }
                            if (this.animationFrame > 1) {
                              this.animationFrame = 0;
                            }
                            if (this.animationFrame < 0) {
                              this.animationFrame = 0;
                            }
                            if (this.field_s > 0) {
                              this.field_s = this.field_s - 1;
                              this.field_o = 0;
                              if (pk.field_s) {
                                tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[30], 100, 256 * ee.field_p / 100);
                              }
                            }
                            w.field_b = w.field_b + 1;
                            if (250 >= w.field_b) {
                              this.e(false);
                              break regionExit1;
                            }
                            this.field_o = 0;
                          } else {
                            if (0 == this.field_x) {
                              this.animationFrame = 19;
                              if (this.field_w > 25) {
                                this.animationFrame = 20;
                              }
                              if (this.field_w > 40) {
                                this.animationFrame = 21;
                              }
                              this.field_z = 0;
                              fieldTemp$16 = this.field_w;
                              this.field_w = this.field_w + 1;
                              if (fieldTemp$16 > 50) {
                                this.field_w = 0;
                                this.verticalVelocity = 100;
                                this.field_x = 2;
                                if (ii.field_e[0].tilePosition.row == this.tilePosition.row) {
                                  this.verticalVelocity = 70;
                                }
                                if (this.tilePosition.row > ii.field_e[0].tilePosition.row) {
                                  this.verticalVelocity = -10;
                                  this.tilePosition.row = this.tilePosition.row - 1;
                                  this.field_x = 3;
                                  this.tileOffset.row = this.tileOffset.row + 230;
                                }
                              }
                            }
                            if (this.field_x == 2) {
                              this.a(true, 22, 20, param1);
                            }
                            if (this.field_x == 3) {
                              this.a(20, -94, true, param1);
                            }
                            if (this.field_s > 0) {
                              this.field_p = this.field_p - 1;
                              this.field_s = this.field_s - 1;
                              if (pk.field_s) {
                                tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[25], 100, ee.field_p * 256 / 100);
                              }
                              if (this.field_p > 0) {
                                this.e(false);
                                break regionExit1;
                              }
                              this.c(false);
                              this.verticalVelocity = 80;
                            }
                          }
                          this.e(false);
                        }
                        break regionExit1;
                      }
                      if (var4 != 7 &&
                        var4 != 8) {
                        if (var4 == 10) {
                          if (this.field_p <= 0) {
                            this.a(false, 120, param1);
                          } else {
                            if (this.field_r != 0) {
                              this.a(114, param1);
                            } else {
                              if (0 == this.field_x) {
                                if (this.tilePosition.row < ii.field_e[0].tilePosition.row) {
                                  this.field_w = this.field_w + 1;
                                }
                                this.a(false, 2, 20, (byte) -76, param1);
                                fieldTemp$69 = this.field_w;
                                this.field_w = this.field_w + 1;
                                if (200 < fieldTemp$69) {
                                  this.field_x = 1;
                                  this.field_z = 0;
                                  this.field_w = 0;
                                  if (Math.random() * 100.0 < 50.0) {
                                    this.field_x = 4;
                                  }
                                }
                              }
                              if (this.field_x == 1) {
                                fieldTemp$70 = this.field_w;
                                this.field_w = this.field_w + 1;
                                if (fieldTemp$70 > 25) {
                                  this.field_w = 0;
                                  this.verticalVelocity = 70;
                                  this.field_x = 2;
                                }
                                this.animationFrame = 19;
                              }
                              if (2 == this.field_x) {
                                this.a(false, 22, 15, param1);
                                if (this.field_x == 0) {
                                  this.field_z = 0;
                                  this.field_w = (int)(100.0 * Math.random());
                                }
                              }
                              if (this.field_x == 3) {
                                this.a(15, -117, false, param1);
                                if (this.field_x == 0) {
                                  this.field_z = 0;
                                  this.field_w = (int)(100.0 * Math.random());
                                }
                              }
                              if (this.field_x != 4) {
                                this.e(false);
                              } else {
                                if (!this.a(false, param1, param0 + 148)) {
                                  this.e(false);
                                } else {
                                  ii.field_e[WidgetTheme.field_k].initialize(param0 ^ -9154, 11, this.tilePosition);
                                  ii.field_e[WidgetTheme.field_k].tileOffset.set(-82, this.tileOffset);
                                  dupTemp$71 = ii.field_e[WidgetTheme.field_k].tileOffset;
                                  dupTemp$71.column = dupTemp$71.column + (this.field_h * 120 + 40);
                                  dupTemp$72 = ii.field_e[WidgetTheme.field_k].tileOffset;
                                  dupTemp$72.row = dupTemp$72.row + 40;
                                  ii.field_e[WidgetTheme.field_k].field_h = this.field_h;
                                  ii.field_e[WidgetTheme.field_k].field_w = 10;
                                  WidgetTheme.field_k = WidgetTheme.field_k + 1;
                                  stackIn_440_0 = (pk.field_s) ? 0 : 1;
                                  if (stackIn_440_0 == 1) {
                                    this.e(false);
                                  } else {
                                    tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[13], 100, 256 * ee.field_p / 100);
                                    this.e(false);
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (var4 == 11) {
                            this.verticalVelocity = 2;
                            this.a(1, BufferedRandomAccessFile.soundEffects, param1, 1, 30, 0, tl.field_a, pk.field_s, (byte) 127);
                            this.e(false);
                          } else {
                            if (var4 == 12) {
                              if (0 >= this.field_p) {
                                this.a(true, 120, param1);
                              } else {
                                if (w.field_b >= 250) {
                                  boolean decompiledFrameRemainder0 = true;
                                  if (this.field_x == 0) {
                                    this.a(true, 3, 30, (byte) -61, param1);
                                    if (this.tilePosition.column > 1 &&
                                      17 > this.tilePosition.column) {
                                      if (((this.field_z == 1)) &&
                                        ((this.animationFrame == 3))) {
                                        tl.field_a.addSample(SpriteState.secondarySoundEffects[12], 100, 256 * ee.field_p / 100);
                                      }
                                      decompiledFrameRemainder0 = false;
                                    }
                                    else {
                                      if (this.tilePosition.column >= ii.field_e[0].tilePosition.column) {
                                        this.field_h = -1;
                                      } else {
                                        this.field_h = 1;
                                      }
                                      if (this.tilePosition.row < ii.field_e[0].tilePosition.row &&
                                        this.tilePosition.row < 10) {
                                        this.field_x = 1;
                                        this.field_w = 0;
                                      }
                                      if (ii.field_e[0].tilePosition.row < this.tilePosition.row &&
                                        this.tilePosition.row > 2) {
                                        this.field_x = 3;
                                        this.tilePosition.row = this.tilePosition.row - 1;
                                        this.verticalVelocity = -20;
                                        this.tileOffset.row = this.tileOffset.row + 230;
                                      }
                                    }
                                  }
                                  if (this.field_x == 1) {
                                    this.animationFrame = 19;
                                    fieldTemp$17 = this.field_w;
                                    this.field_w = this.field_w + 1;
                                    if (fieldTemp$17 > 5) {
                                      this.verticalVelocity = 70;
                                      this.field_x = 2;
                                      this.field_w = 0;
                                    }
                                  }
                                  if (this.field_x == 2) {
                                    this.a(true, 22, 0, param1);
                                  }
                                  if (this.field_x == 3) {
                                    this.a(0, param0 + 31, true, param1);
                                  }
                                  if (0 >= this.field_s) {
                                    this.e(false);
                                    break regionExit1;
                                  }
                                  this.field_p = this.field_p - 1;
                                  this.field_s = this.field_s - 1;
                                  if (25 == this.field_p) {
                                    ii.field_e[WidgetTheme.field_k].initialize(9147, 10, this.tilePosition);
                                    ii.field_e[WidgetTheme.field_k].tileOffset.set(-108, this.tileOffset);
                                    ii.field_e[WidgetTheme.field_k].tilePosition.column = 0;
                                    ii.field_e[WidgetTheme.field_k].tilePosition.row = 16;
                                    ii.field_e[WidgetTheme.field_k].tileOffset.column = 0;
                                    ii.field_e[WidgetTheme.field_k].tileOffset.row = 0;
                                    ii.field_e[WidgetTheme.field_k].field_h = 1;
                                    ii.field_e[WidgetTheme.field_k].field_w = 10;
                                    WidgetTheme.field_k = WidgetTheme.field_k + 1;
                                    ii.field_e[WidgetTheme.field_k].initialize(9147, 10, this.tilePosition);
                                    ii.field_e[WidgetTheme.field_k].tileOffset.set(param0 + 19, this.tileOffset);
                                    ii.field_e[WidgetTheme.field_k].tilePosition.column = 19;
                                    ii.field_e[WidgetTheme.field_k].tilePosition.row = 16;
                                    ii.field_e[WidgetTheme.field_k].tileOffset.column = 0;
                                    ii.field_e[WidgetTheme.field_k].tileOffset.row = 0;
                                    ii.field_e[WidgetTheme.field_k].field_h = -1;
                                    ii.field_e[WidgetTheme.field_k].field_w = 10;
                                    WidgetTheme.field_k = WidgetTheme.field_k + 1;
                                  }
                                  if (pk.field_s) {
                                    tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[25], 100, 256 * ee.field_p / 100);
                                  }
                                  if (this.field_p <= 0) {
                                    this.c(false);
                                    this.verticalVelocity = 70;
                                  }
                                } else {
                                  this.field_o = 7;
                                  fieldTemp$18 = this.field_z;
                                  this.field_z = this.field_z - 1;
                                  if (fieldTemp$18 <= 0) {
                                    this.animationFrame = this.animationFrame + 1;
                                    this.field_z = 5;
                                    if (this.animationFrame > 1) {
                                      this.animationFrame = 0;
                                    }
                                  }
                                  if (this.field_s > 0) {
                                    this.field_s = this.field_s - 1;
                                    w.field_b = 250;
                                    this.field_x = 0;
                                    stackIn_457_0 = (pk.field_s) ? 0 : 1;
                                    if (stackIn_457_0 != 1) {
                                      tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[17], 100, 256 * ee.field_p / 100);
                                    }
                                  }
                                  w.field_b = w.field_b + 1;
                                }
                                this.e(false);
                              }
                            } else {
                              if (14 == var4) {
                                if (this.field_p <= 0) {
                                  this.a(false, 120, param1);
                                } else {
                                  if (this.field_r != 0) {
                                    this.a(54, param1);
                                  } else {
                                    if (this.field_x == 0) {
                                      if (this.tilePosition.row < ii.field_e[0].tilePosition.row) {
                                        this.field_w = this.field_w + 1;
                                      }
                                      this.a(false, 1, 20, (byte) -66, param1);
                                      fieldTemp$67 = this.field_w;
                                      this.field_w = this.field_w + 1;
                                      if (fieldTemp$67 > 200) {
                                        this.field_w = 0;
                                        this.field_x = 1;
                                        if (ii.field_e[0].tilePosition.column >= this.tilePosition.column) {
                                          stackIn_507_1 = 1;
                                        } else {
                                          stackIn_507_1 = -1;
                                        }
                                        this.field_h = stackIn_507_1;
                                      }
                                    }
                                    if (this.field_x == 1) {
                                      fieldTemp$68 = this.field_w;
                                      this.field_w = this.field_w + 1;
                                      if (fieldTemp$68 > 25) {
                                        this.field_w = 0;
                                        this.verticalVelocity = 70;
                                        this.field_x = 2;
                                      }
                                      this.animationFrame = 19;
                                    }
                                    if (2 == this.field_x) {
                                      this.a(false, 22, 16, param1);
                                      if (this.field_x == 0) {
                                        this.field_w = (int)(Math.random() * 100.0);
                                      }
                                    }
                                    if (this.field_x == 3) {
                                      this.a(16, -91, false, param1);
                                      if (0 != this.field_x) {
                                        this.e(false);
                                        break regionExit1;
                                      }
                                      this.field_w = (int)(Math.random() * 100.0);
                                    }
                                    this.e(false);
                                  }
                                }
                              } else {
                                if (var4 == 15) {
                                  if (this.field_p <= 0) {
                                    this.a(false, param0 + 243, param1);
                                  } else {
                                    if (0 != this.field_r) {
                                      this.a(46, param1);
                                    } else {
                                      if (0 == this.field_x) {
                                        this.a(15, (byte) -9, param1, false);
                                        fieldTemp$19 = this.field_w;
                                        this.field_w = this.field_w + 1;
                                        if (fieldTemp$19 > 100) {
                                          this.field_x = 1;
                                          this.field_z = 0;
                                          this.field_w = 0;
                                        }
                                      }
                                      if (this.field_x == 1) {
                                        if (!this.a(false, param1, 25)) {
                                          this.e(false);
                                          break regionExit1;
                                        }
                                        this.field_w = 0;
                                        ii.field_e[WidgetTheme.field_k].initialize(9147, 18, this.tilePosition);
                                        ii.field_e[WidgetTheme.field_k].tileOffset.set(-84, this.tileOffset);
                                        dupTemp$20 = ii.field_e[WidgetTheme.field_k].tileOffset;
                                        dupTemp$20.column = dupTemp$20.column + (this.field_h * 200 + 120);
                                        dupTemp$21 = ii.field_e[WidgetTheme.field_k].tileOffset;
                                        dupTemp$21.row = dupTemp$21.row - 40;
                                        ii.field_e[WidgetTheme.field_k].field_h = this.field_h;
                                        ii.field_e[WidgetTheme.field_k].field_w = 0;
                                        ii.field_e[WidgetTheme.field_k].field_o = 8;
                                        WidgetTheme.field_k = WidgetTheme.field_k + 1;
                                        stackIn_535_0 = (pk.field_s) ? 0 : 1;
                                        if (stackIn_535_0 != 1) {
                                          tl.field_a.addSample(SpriteState.secondarySoundEffects[17], 100, ee.field_p * 256 / 100);
                                        }
                                      }
                                      this.e(false);
                                    }
                                  }
                                } else {
                                  if (16 == var4) {
                                    if (this.field_p <= 0) {
                                      this.a(false, 120, param1);
                                    } else {
                                      if (0 != this.field_r) {
                                        this.a(param0 + 163, param1);
                                      } else {
                                        if (this.field_x == 0) {
                                          if (ii.field_e[0].tilePosition.row > this.tilePosition.row) {
                                            this.field_w = this.field_w + 1;
                                          }
                                          this.a(false, 2, 10, (byte) -105, param1);
                                          fieldTemp$22 = this.field_w;
                                          this.field_w = this.field_w + 1;
                                          if (fieldTemp$22 > 200) {
                                            this.field_x = 1;
                                            this.field_w = 0;
                                            if (this.tilePosition.column > ii.field_e[0].tilePosition.column) {
                                              stackIn_551_1 = 1;
                                            } else {
                                              stackIn_551_1 = -1;
                                            }
                                            this.field_h = stackIn_551_1;
                                            if (50.0 > 100.0 * Math.random()) {
                                              if (ii.field_e[0].tilePosition.column < this.tilePosition.column) {
                                                stackIn_555_1 = -1;
                                              } else {
                                                stackIn_555_1 = 1;
                                              }
                                              this.field_h = stackIn_555_1;
                                              this.field_x = 4;
                                            }
                                          }
                                        }
                                        if (this.field_x == 1) {
                                          this.animationFrame = 19;
                                          fieldTemp$23 = this.field_w;
                                          this.field_w = this.field_w + 1;
                                          if (fieldTemp$23 > 25) {
                                            this.verticalVelocity = 70;
                                            this.field_x = 2;
                                            this.field_w = 0;
                                          }
                                        }
                                        if (this.field_x == 2) {
                                          this.a(false, 22, 15, param1);
                                          if (this.field_x == 0) {
                                            this.field_w = (int)(Math.random() * 100.0);
                                          }
                                        }
                                        if (this.field_x == 3) {
                                          this.a(15, -102, false, param1);
                                          if (this.field_x == 0) {
                                            this.field_w = (int)(100.0 * Math.random());
                                          }
                                        }
                                        if (4 == this.field_x &&
                                          this.a(false, param1, param0 + 148)) {
                                          ii.field_e[WidgetTheme.field_k].initialize(9147, 19, this.tilePosition);
                                          ii.field_e[WidgetTheme.field_k].tileOffset.set(param0 ^ 13, this.tileOffset);
                                          dupTemp$24 = ii.field_e[WidgetTheme.field_k].tileOffset;
                                          dupTemp$24.column = dupTemp$24.column + (40 + 360 * this.field_h);
                                          dupTemp$25 = ii.field_e[WidgetTheme.field_k].tileOffset;
                                          dupTemp$25.row = dupTemp$25.row + 160;
                                          ii.field_e[WidgetTheme.field_k].field_h = this.field_h;
                                          ii.field_e[WidgetTheme.field_k].field_w = 0;
                                          ii.field_e[WidgetTheme.field_k].verticalVelocity = 25;
                                          ii.field_e[WidgetTheme.field_k].animationFrame = 37;
                                          WidgetTheme.field_k = WidgetTheme.field_k + 1;
                                          stackIn_574_0 = !(pk.field_s);
                                          if (!stackIn_574_0) {
                                            tl.field_a.addSample(SpriteState.secondarySoundEffects[18], 100, ee.field_p * 256 / 100);
                                          }
                                        }
                                        this.e(false);
                                      }
                                    }
                                  } else {
                                    if (17 == var4) {
                                      if (0 >= this.field_p) {
                                        this.a(true, 120, param1);
                                      } else {
                                        if (w.field_b < 250) {
                                          this.field_x = 0;
                                          fieldTemp$26 = this.field_z;
                                          this.field_z = this.field_z - 1;
                                          if (fieldTemp$26 <= 0) {
                                            this.animationFrame = this.animationFrame + 1;
                                            this.field_z = 5;
                                            if (this.animationFrame > 1) {
                                              this.animationFrame = 0;
                                            }
                                          }
                                          this.field_o = 7;
                                          if (this.field_s > 0) {
                                            w.field_b = 250;
                                            this.field_s = this.field_s - 1;
                                            if (pk.field_s) {
                                              tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[29], 100, ee.field_p * 256 / 100);
                                            }
                                          }
                                          w.field_b = w.field_b + 1;
                                        } else {
                                          if (this.field_x == 0) {
                                            if (this.tilePosition.row < ii.field_e[0].tilePosition.row) {
                                              this.field_w = this.field_w + 1;
                                            }
                                            this.a(true, 1, 25, (byte) -94, param1);
                                            fieldTemp$27 = this.field_w;
                                            this.field_w = this.field_w + 1;
                                            if (fieldTemp$27 > 200) {
                                              this.field_w = 0;
                                              if (this.tilePosition.column <= ii.field_e[0].tilePosition.column) {
                                                stackIn_590_1 = 1;
                                              } else {
                                                stackIn_590_1 = -1;
                                              }
                                              this.field_h = stackIn_590_1;
                                              this.field_x = 1;
                                            }
                                          }
                                          if (this.field_x == 1) {
                                            this.animationFrame = 19;
                                            fieldTemp$28 = this.field_w;
                                            this.field_w = this.field_w + 1;
                                            if (25 < fieldTemp$28) {
                                              this.verticalVelocity = 70;
                                              this.field_x = 2;
                                              this.field_w = 0;
                                            }
                                          }
                                          if (this.field_x == 2) {
                                            this.a(true, 22, 16, param1);
                                            if (this.field_x == 0) {
                                              this.field_w = (int)(Math.random() * 100.0);
                                            }
                                          }
                                          if (this.field_x == 3) {
                                            this.a(16, -99, true, param1);
                                            if (0 == this.field_x) {
                                              this.field_w = (int)(100.0 * Math.random());
                                            }
                                          }
                                          if (0 < this.field_s) {
                                            this.field_p = this.field_p - 1;
                                            this.field_s = this.field_s - 1;
                                            if (0 == this.field_p % 10) {
                                              ii.field_e[WidgetTheme.field_k].initialize(9147, 14, this.tilePosition);
                                              ii.field_e[WidgetTheme.field_k].tileOffset.set(-102, this.tileOffset);
                                              ii.field_e[WidgetTheme.field_k].field_h = 1;
                                              ii.field_e[WidgetTheme.field_k].field_w = 10;
                                              WidgetTheme.field_k = WidgetTheme.field_k + 1;
                                            }
                                            this.field_o = 1;
                                            if (pk.field_s) {
                                              tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[29], 100, 256 * ee.field_p / 100);
                                            }
                                            if (this.field_p <= 0) {
                                              this.c(false);
                                              this.verticalVelocity = 60;
                                            }
                                          }
                                          this.e(false);
                                        }
                                      }
                                    } else {
                                      if (var4 == 18) {
                                        this.e(false);
                                        if (this.b(param1, -4) == 1 &&
                                          this.tileOffset.row == 0) {
                                          this.field_w = this.field_w + 1;
                                          if (35 < this.animationFrame) {
                                            this.field_z = 0;
                                          }
                                          this.animationFrame = 35;
                                          fieldTemp$29 = this.field_z;
                                          this.field_z = this.field_z + 1;
                                          if (fieldTemp$29 > 10) {
                                            this.animationFrame = 34;
                                          }
                                        } else {
                                          this.a(1, BufferedRandomAccessFile.soundEffects, param1, 1, 5, 1, tl.field_a, pk.field_s, (byte) 127);
                                          if (36 > this.animationFrame) {
                                            this.animationFrame = 36;
                                          }
                                          this.field_z = this.field_z - 1;
                                          if (this.field_z <= 5) {
                                            this.animationFrame = 37;
                                          }
                                          if (this.field_z <= 0) {
                                            this.field_z = 10;
                                          }
                                        }
                                        if (this.tileOffset.row < 0) {
                                          this.tileOffset.row = this.tileOffset.row + 240;
                                          this.tilePosition.row = this.tilePosition.row - 1;
                                        }
                                        if (this.tilePosition.row < 0) {
                                          this.field_w = 21;
                                        }
                                        this.e(false);
                                        if (!(20 >= this.field_w)) {
                                          this.field_k = 1;
                                        }
                                      } else {
                                        if (var4 == 19) {
                                          this.a(1, BufferedRandomAccessFile.soundEffects, param1, 1, 25, 0, tl.field_a, pk.field_s, (byte) -120);
                                          this.e(false);
                                          this.animationFrame = 37;
                                          if (((this.b(param1, -4) == 1)) &&
                                            ((this.tileOffset.row == 0))) {
                                            this.verticalVelocity = 20;
                                            this.animationFrame = 37;
                                          }
                                        } else {
                                          if (25 == var4) {
                                            this.wrapHorizontalPosition((byte) 78);
                                            if (this.tileOffset.row < 0) {
                                              this.tileOffset.row = this.tileOffset.row + 240;
                                              this.tilePosition.row = this.tilePosition.row - 1;
                                            }
                                            this.field_z = this.field_z + 1;
                                            if (this.tileOffset.row >= 240) {
                                              this.tileOffset.row = this.tileOffset.row - 240;
                                              this.tilePosition.row = this.tilePosition.row + 1;
                                            }
                                            if (this.field_z % 10 < 6) {
                                              stackIn_658_1 = 36;
                                            } else {
                                              stackIn_658_1 = 37;
                                            }
                                            this.animationFrame = stackIn_658_1;
                                            if (this.field_z < 20) {
                                              if (this.tilePosition.column < ii.field_e[0].tilePosition.column) {
                                                this.tileOffset.column = this.tileOffset.column + 15;
                                                this.field_h = 1;
                                              }
                                              if (ii.field_e[0].tilePosition.row > this.tilePosition.row) {
                                                this.tileOffset.row = this.tileOffset.row + 15;
                                              }
                                              if (ii.field_e[0].tilePosition.column < this.tilePosition.column) {
                                                this.field_h = -1;
                                                this.tileOffset.column = this.tileOffset.column - 15;
                                              }
                                              if (this.tilePosition.row > ii.field_e[0].tilePosition.row) {
                                                this.tileOffset.row = this.tileOffset.row - 15;
                                              }
                                            } else {
                                              this.tileOffset.column = this.tileOffset.column + this.field_h * 15;
                                              if (this.tilePosition.row < ii.field_e[0].tilePosition.row) {
                                                this.tileOffset.row = this.tileOffset.row + 18;
                                              }
                                              if (this.tilePosition.row > ii.field_e[0].tilePosition.row) {
                                                this.tileOffset.row = this.tileOffset.row - 18;
                                              }
                                            }
                                            this.e(false);
                                            if (!(this.field_z <= 300)) {
                                              this.field_k = 1;
                                            }
                                            break regionExit1;
                                          }
                                          if ((var4 != 20)) {
                                            if (var4 == 21) {
                                              if (this.tilePosition.column < 0) {
                                                this.field_h = 1;
                                                this.tilePosition.column = 0;
                                                this.tileOffset.column = 0;
                                              }
                                              if (this.tilePosition.column >= 20) {
                                                this.tilePosition.column = 20;
                                                this.field_h = -1;
                                                this.tileOffset.column = 0;
                                              }
                                              if (this.b(param1, -4) == 1 &&
                                                this.tileOffset.row == 0 &&
                                                this.verticalVelocity <= 0) {
                                                this.b(5);
                                              } else {
                                                this.a(1, BufferedRandomAccessFile.soundEffects, param1, 1, 30, 1, tl.field_a, pk.field_s, (byte) 126);
                                              }
                                            } else {
                                              if (var4 == 22) {
                                                if (this.field_p <= 0) {
                                                  this.a(false, 120, param1);
                                                } else {
                                                  if (0 != this.field_r) {
                                                    this.a(113, param1);
                                                  } else {
                                                    if (this.field_x == 0) {
                                                      this.animationFrame = 19;
                                                      if (15 < this.field_w) {
                                                        this.animationFrame = 22;
                                                      }
                                                      fieldTemp$66 = this.field_w;
                                                      this.field_w = this.field_w + 1;
                                                      if (25 < fieldTemp$66) {
                                                        this.field_x = 2;
                                                        this.verticalVelocity = 70;
                                                        this.field_w = 0;
                                                        if (ii.field_e[0].tilePosition.row <= this.tilePosition.row) {
                                                          this.verticalVelocity = 50;
                                                        }
                                                      }
                                                    }
                                                    if (this.field_x == 2) {
                                                      this.a(false, param0 ^ -109, 25, param1);
                                                    }
                                                    if (this.field_x == 3) {
                                                      this.a(25, -92, false, param1);
                                                    }
                                                    this.e(false);
                                                  }
                                                }
                                              } else {
                                                if (var4 != 23 &&
                                                  31 != var4) {
                                                  if (var4 == 26) {
                                                    if (0 >= this.field_p) {
                                                      this.a(true, 120, param1);
                                                    } else {
                                                      if (w.field_b < 250) {
                                                        this.field_o = 7;
                                                        fieldTemp$60 = this.field_z;
                                                        this.field_z = this.field_z - 1;
                                                        if (fieldTemp$60 <= 0) {
                                                          this.animationFrame = this.animationFrame + 1;
                                                          if (this.animationFrame > 1) {
                                                            this.animationFrame = 0;
                                                          }
                                                          this.field_z = 5;
                                                        }
                                                        if (this.field_s > 0) {
                                                          w.field_b = 250;
                                                          this.field_s = this.field_s - 1;
                                                          this.field_x = 0;
                                                          if (pk.field_s) {
                                                            tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[26], 100, 256 * ee.field_p / 100);
                                                          }
                                                        }
                                                        w.field_b = w.field_b + 1;
                                                      } else {
                                                        w.field_b = w.field_b + 1;
                                                        if (0 == this.field_x) {
                                                          if (!(this.tilePosition.column > 0) ||
                                                            !(16 > this.tilePosition.column)) {
                                                            if (ii.field_e[0].tilePosition.row > this.tilePosition.row) {
                                                              this.field_x = 1;
                                                              this.field_w = 0;
                                                            }
                                                            if (ii.field_e[0].tilePosition.column > this.tilePosition.column) {
                                                              this.field_h = 1;
                                                            } else {
                                                              this.field_h = -1;
                                                            }
                                                            if (this.tilePosition.row > ii.field_e[0].tilePosition.row &&
                                                              this.tilePosition.row > 2) {
                                                              this.tilePosition.row = this.tilePosition.row - 1;
                                                              this.field_x = 3;
                                                              this.verticalVelocity = -20;
                                                              this.tileOffset.row = this.tileOffset.row + 230;
                                                            }
                                                          }
                                                          if (350 < w.field_b) {
                                                            w.field_b = 250;
                                                            this.field_x = 4;
                                                          }
                                                          if (this.field_x == 0) {
                                                            this.a(true, 0, 35, (byte) -120, param1);
                                                          }
                                                          if (3 == this.field_x) {
                                                            this.field_x = 5;
                                                          }
                                                        }
                                                        if (1 == this.field_x) {
                                                          fieldTemp$61 = this.field_w;
                                                          this.field_w = this.field_w + 1;
                                                          if (fieldTemp$61 > 5) {
                                                            this.verticalVelocity = 70;
                                                            this.field_x = 2;
                                                            this.field_w = 0;
                                                          }
                                                          this.animationFrame = 19;
                                                        }
                                                        if (this.field_x == 2) {
                                                          this.a(true, 22, 0, param1);
                                                        }
                                                        if (this.field_x == 3) {
                                                          this.a(0, -82, true, param1);
                                                        }
                                                        if (this.field_x == 5) {
                                                          this.a(25, param0 ^ 41, true, param1);
                                                          if (this.field_x == 3) {
                                                            this.field_x = 5;
                                                          }
                                                        }
                                                        if (this.field_x == 4 &&
                                                          this.a(true, param1, 25)) {
                                                          ii.field_e[WidgetTheme.field_k].initialize(9147, 27, this.tilePosition);
                                                          ii.field_e[WidgetTheme.field_k].tileOffset.set(-81, this.tileOffset);
                                                          dupTemp$62 = ii.field_e[WidgetTheme.field_k].tileOffset;
                                                          dupTemp$62.column = dupTemp$62.column + (40 + this.field_h * 240);
                                                          dupTemp$63 = ii.field_e[WidgetTheme.field_k].tileOffset;
                                                          dupTemp$63.row = dupTemp$63.row + 80;
                                                          ii.field_e[WidgetTheme.field_k].field_h = this.field_h;
                                                          ii.field_e[WidgetTheme.field_k].field_w = 0;
                                                          ii.field_e[WidgetTheme.field_k].verticalVelocity = 40;
                                                          ii.field_e[WidgetTheme.field_k].field_o = 5;
                                                          WidgetTheme.field_k = WidgetTheme.field_k + 1;
                                                          stackIn_773_0 = 0;
                                                          if (pk.field_s) {
                                                            stackIn_774_1 = 0;
                                                          } else {
                                                            stackIn_774_1 = 1;
                                                          }
                                                          if (stackIn_773_0 == stackIn_774_1) {
                                                            tl.field_a.addSample(SpriteState.secondarySoundEffects[25], 100, ee.field_p * 256 / 100);
                                                          }
                                                        }
                                                        if (this.field_s > 0) {
                                                          this.field_p = this.field_p - 1;
                                                          this.field_s = this.field_s - 1;
                                                          if (this.field_p == 10 ||
                                                            this.field_p == 30) {
                                                            ii.field_e[WidgetTheme.field_k].initialize(param0 + 9270, 23, this.tilePosition);
                                                            ii.field_e[WidgetTheme.field_k].tileOffset.set(-94, this.tileOffset);
                                                            ii.field_e[WidgetTheme.field_k].tilePosition.column = 0;
                                                            ii.field_e[WidgetTheme.field_k].tilePosition.row = 16;
                                                            ii.field_e[WidgetTheme.field_k].tileOffset.column = 0;
                                                            ii.field_e[WidgetTheme.field_k].tileOffset.row = 0;
                                                            ii.field_e[WidgetTheme.field_k].field_h = 1;
                                                            ii.field_e[WidgetTheme.field_k].field_w = 10;
                                                            WidgetTheme.field_k = WidgetTheme.field_k + 1;
                                                            ii.field_e[WidgetTheme.field_k].initialize(9147, 23, this.tilePosition);
                                                            ii.field_e[WidgetTheme.field_k].tileOffset.set(-117, this.tileOffset);
                                                            ii.field_e[WidgetTheme.field_k].tilePosition.column = 19;
                                                            ii.field_e[WidgetTheme.field_k].tilePosition.row = 16;
                                                            ii.field_e[WidgetTheme.field_k].tileOffset.column = 0;
                                                            ii.field_e[WidgetTheme.field_k].tileOffset.row = 0;
                                                            ii.field_e[WidgetTheme.field_k].field_h = -1;
                                                            ii.field_e[WidgetTheme.field_k].field_w = 10;
                                                            WidgetTheme.field_k = WidgetTheme.field_k + 1;
                                                          }
                                                          stackIn_784_0 = (pk.field_s) ? 0 : 1;
                                                          if (stackIn_784_0 != 1) {
                                                            tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[26], 100, ee.field_p * 256 / 100);
                                                          }
                                                          if (this.field_p <= 0) {
                                                            this.c(false);
                                                            this.verticalVelocity = 70;
                                                          }
                                                        }
                                                      }
                                                      this.e(false);
                                                    }
                                                  } else {
                                                    if (var4 == 27) {
                                                      this.a(1, BufferedRandomAccessFile.soundEffects, param1, 1, 40, 0, tl.field_a, pk.field_s, (byte) 126);
                                                      this.e(false);
                                                      if (((this.b(param1, -4) == 1)) &&
                                                        ((this.tileOffset.row == 0))) {
                                                        this.field_d = 24;
                                                        this.tileOffset.column = this.tileOffset.column + 40;
                                                        this.verticalVelocity = 50;
                                                        this.actorType = 28;
                                                        this.tileOffset.row = this.tileOffset.row + 40;
                                                        ii.field_e[WidgetTheme.field_k].initialize(9147, 28, this.tilePosition);
                                                        ii.field_e[WidgetTheme.field_k].tileOffset.set(-116, this.tileOffset);
                                                        ii.field_e[WidgetTheme.field_k].field_h = -this.field_h;
                                                        ii.field_e[WidgetTheme.field_k].field_w = 0;
                                                        ii.field_e[WidgetTheme.field_k].verticalVelocity = 50;
                                                        ii.field_e[WidgetTheme.field_k].field_o = 5;
                                                        WidgetTheme.field_k = WidgetTheme.field_k + 1;
                                                        stackIn_808_0 = (pk.field_s) ? 0 : 1;
                                                        if ((stackIn_808_0 != 1)) {
                                                          tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[5], 100, ee.field_p * 256 / 100);
                                                        }
                                                      }
                                                    } else {
                                                      if (var4 == 28) {
                                                        this.a(1, BufferedRandomAccessFile.soundEffects, param1, 1, 20, 0, tl.field_a, pk.field_s, (byte) -50);
                                                        this.e(false);
                                                        if (((this.b(param1, -4) == 1)) &&
                                                          ((this.tileOffset.row == 0))) {
                                                          this.field_k = 1;
                                                          stackIn_817_0 = (pk.field_s) ? 0 : 1;
                                                          if ((stackIn_817_0 != 1)) {
                                                            tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[5], 100, ee.field_p * 256 / 100);
                                                          }
                                                        }
                                                      } else {
                                                        if (29 == var4) {
                                                          if (0 >= this.field_p) {
                                                            this.a(false, 120, param1);
                                                          } else {
                                                            if (this.field_r != 0) {
                                                              this.a(120, param1);
                                                            } else {
                                                              if (0 == this.field_x) {
                                                                if (ii.field_e[0].tilePosition.row > this.tilePosition.row) {
                                                                  this.field_w = this.field_w + 1;
                                                                }
                                                                this.a(false, 2, 20, (byte) -88, param1);
                                                                fieldTemp$56 = this.field_w;
                                                                this.field_w = this.field_w + 1;
                                                                if (fieldTemp$56 > 200) {
                                                                  if (this.tilePosition.column > ii.field_e[0].tilePosition.column) {
                                                                    stackIn_833_1 = -1;
                                                                  } else {
                                                                    stackIn_833_1 = 1;
                                                                  }
                                                                  this.field_h = stackIn_833_1;
                                                                  this.field_w = 0;
                                                                  this.field_x = 1;
                                                                  this.field_z = 0;
                                                                  if (100.0 * Math.random() < 50.0) {
                                                                    this.field_x = 4;
                                                                  }
                                                                }
                                                              }
                                                              if (this.field_x == 1) {
                                                                fieldTemp$57 = this.field_w;
                                                                this.field_w = this.field_w + 1;
                                                                if (fieldTemp$57 > 25) {
                                                                  this.field_x = 2;
                                                                  this.field_w = 0;
                                                                  this.verticalVelocity = 70;
                                                                }
                                                                this.animationFrame = 19;
                                                              }
                                                              if (2 == this.field_x) {
                                                                this.a(false, 22, 15, param1);
                                                                if (this.field_x == 0) {
                                                                  this.field_z = 0;
                                                                  this.field_w = (int)(Math.random() * 100.0);
                                                                }
                                                              }
                                                              if (this.field_x == 3) {
                                                                this.a(15, param0 + 23, false, param1);
                                                                if (this.field_x == 0) {
                                                                  this.field_z = 0;
                                                                  this.field_w = (int)(100.0 * Math.random());
                                                                }
                                                              }
                                                              if (4 == this.field_x) {
                                                                if (this.a(false, param1, 25)) {
                                                                  ii.field_e[WidgetTheme.field_k].initialize(9147, 34, this.tilePosition);
                                                                  ii.field_e[WidgetTheme.field_k].tileOffset.set(-108, this.tileOffset);
                                                                  dupTemp$58 = ii.field_e[WidgetTheme.field_k].tileOffset;
                                                                  dupTemp$58.column = dupTemp$58.column + (this.field_h * 120 + 40);
                                                                  dupTemp$59 = ii.field_e[WidgetTheme.field_k].tileOffset;
                                                                  dupTemp$59.row = dupTemp$59.row + 40;
                                                                  ii.field_e[WidgetTheme.field_k].field_h = this.field_h;
                                                                  ii.field_e[WidgetTheme.field_k].field_w = 10;
                                                                  WidgetTheme.field_k = WidgetTheme.field_k + 1;
                                                                  if (pk.field_s) {
                                                                    tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[13], 100, 256 * ee.field_p / 100);
                                                                  }
                                                                }
                                                                if (this.field_x == 0) {
                                                                  this.field_x = 1;
                                                                }
                                                              }
                                                              this.e(false);
                                                            }
                                                          }
                                                        } else {
                                                          if (var4 == 30) {
                                                            if (this.field_p <= 0) {
                                                              this.a(false, 120, param1);
                                                            } else {
                                                              if (this.field_r != 0) {
                                                                this.a(100, param1);
                                                              } else {
                                                                if (this.field_x == 0) {
                                                                  if (this.tilePosition.row < ii.field_e[0].tilePosition.row) {
                                                                    this.field_w = this.field_w + 1;
                                                                  }
                                                                  this.a(false, 2, 20, (byte) -78, param1);
                                                                  fieldTemp$30 = this.field_w;
                                                                  this.field_w = this.field_w + 1;
                                                                  if (200 < fieldTemp$30) {
                                                                    this.field_x = 1;
                                                                    if (this.tilePosition.column <= ii.field_e[0].tilePosition.column) {
                                                                      stackIn_871_1 = -1;
                                                                    } else {
                                                                      stackIn_871_1 = 1;
                                                                    }
                                                                    this.field_h = stackIn_871_1;
                                                                    this.field_z = 0;
                                                                    this.field_w = 0;
                                                                    if (80.0 > 100.0 * Math.random()) {
                                                                      this.field_x = 4;
                                                                      if (ii.field_e[0].tilePosition.column >= this.tilePosition.column) {
                                                                        stackIn_875_1 = 1;
                                                                      } else {
                                                                        stackIn_875_1 = -1;
                                                                      }
                                                                      this.field_h = stackIn_875_1;
                                                                    }
                                                                  }
                                                                }
                                                                if (this.field_x == 1) {
                                                                  fieldTemp$31 = this.field_w;
                                                                  this.field_w = this.field_w + 1;
                                                                  if (fieldTemp$31 > 25) {
                                                                    this.verticalVelocity = 70;
                                                                    this.field_w = 0;
                                                                    this.field_x = 2;
                                                                  }
                                                                  this.animationFrame = 19;
                                                                }
                                                                if (2 == this.field_x) {
                                                                  this.a(false, 22, 25, param1);
                                                                  if (this.field_x == 0) {
                                                                    this.field_z = 0;
                                                                    this.field_w = (int)(100.0 * Math.random());
                                                                  }
                                                                }
                                                                if (this.field_x == 3) {
                                                                  this.a(25, -128, false, param1);
                                                                  if (this.field_x == 0) {
                                                                    this.field_z = 0;
                                                                    this.field_w = (int)(Math.random() * 100.0);
                                                                  }
                                                                }
                                                                if (this.field_x == 4 &&
                                                                  this.a(false, param1, param0 ^ -100)) {
                                                                  ii.field_e[WidgetTheme.field_k].initialize(9147, 35, this.tilePosition);
                                                                  ii.field_e[WidgetTheme.field_k].tileOffset.set(-103, this.tileOffset);
                                                                  dupTemp$32 = ii.field_e[WidgetTheme.field_k].tileOffset;
                                                                  dupTemp$32.column = dupTemp$32.column + (40 + 120 * this.field_h);
                                                                  dupTemp$33 = ii.field_e[WidgetTheme.field_k].tileOffset;
                                                                  dupTemp$33.row = dupTemp$33.row + 520;
                                                                  ii.field_e[WidgetTheme.field_k].field_h = this.field_h;
                                                                  ii.field_e[WidgetTheme.field_k].field_w = 0;
                                                                  WidgetTheme.field_k = WidgetTheme.field_k + 1;
                                                                  stackIn_896_0 = 0;
                                                                  if (pk.field_s) {
                                                                    stackIn_897_1 = 0;
                                                                  } else {
                                                                    stackIn_897_1 = 1;
                                                                  }
                                                                  if (stackIn_896_0 == stackIn_897_1) {
                                                                    tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[13], 100, ee.field_p * 256 / 100);
                                                                  }
                                                                }
                                                                this.e(false);
                                                              }
                                                            }
                                                          } else {
                                                            if (32 == var4) {
                                                              if (this.field_p <= 0) {
                                                                this.a(false, param0 ^ -3, param1);
                                                              } else {
                                                                if (this.field_r != 0) {
                                                                  this.a(param0 + 150, param1);
                                                                } else {
                                                                  if (this.field_x == 0) {
                                                                    if (ii.field_e[0].tilePosition.row > this.tilePosition.row) {
                                                                      this.field_w = this.field_w + 1;
                                                                    }
                                                                    this.a(false, 2, 20, (byte) -92, param1);
                                                                    fieldTemp$34 = this.field_w;
                                                                    this.field_w = this.field_w + 1;
                                                                    if (200 < fieldTemp$34) {
                                                                      this.field_w = 0;
                                                                      this.field_z = 0;
                                                                      this.field_x = 3;
                                                                    }
                                                                  }
                                                                  if (3 == this.field_x) {
                                                                    this.animationFrame = this.animationFrame - 4;
                                                                    this.a(20, (byte) 116, param1, false);
                                                                    this.animationFrame = this.animationFrame + 4;
                                                                    fieldTemp$35 = this.field_w;
                                                                    this.field_w = this.field_w + 1;
                                                                    if (fieldTemp$35 > 300 &&
                                                                      1 == this.b(param1, param0 ^ 121) &&
                                                                      this.tileOffset.row == 0) {
                                                                      this.field_x = 0;
                                                                      this.field_w = 0;
                                                                    }
                                                                    if (this.field_w % 100 == 25) {
                                                                      ii.field_e[WidgetTheme.field_k].initialize(9147, 42, this.tilePosition);
                                                                      ii.field_e[WidgetTheme.field_k].tileOffset.set(param0 ^ 26, this.tileOffset);
                                                                      dupTemp$36 = ii.field_e[WidgetTheme.field_k].tileOffset;
                                                                      dupTemp$36.column = dupTemp$36.column + (this.field_h * 120 + 40);
                                                                      dupTemp$37 = ii.field_e[WidgetTheme.field_k].tileOffset;
                                                                      dupTemp$37.row = dupTemp$37.row + 40;
                                                                      ii.field_e[WidgetTheme.field_k].field_h = this.field_h;
                                                                      ii.field_e[WidgetTheme.field_k].field_w = 0;
                                                                      WidgetTheme.field_k = WidgetTheme.field_k + 1;
                                                                      if (pk.field_s) {
                                                                        tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[13], 100, ee.field_p * 256 / 100);
                                                                      }
                                                                    }
                                                                    if (this.field_w % 100 > 20 &&
                                                                      this.field_w % 100 < 30) {
                                                                      this.animationFrame = 26;
                                                                    } else {
                                                                      if (10 < this.animationFrame) {
                                                                        this.animationFrame = 6;
                                                                      }
                                                                    }
                                                                  }
                                                                  this.e(false);
                                                                }
                                                              }
                                                            } else {
                                                              if (var4 == 33) {
                                                                if (250 > w.field_b) {
                                                                  this.field_o = 7;
                                                                  fieldTemp$55 = this.field_z;
                                                                  this.field_z = this.field_z - 1;
                                                                  if (fieldTemp$55 <= 0) {
                                                                    this.animationFrame = this.animationFrame + 1;
                                                                    if (1 < this.animationFrame) {
                                                                      this.animationFrame = 0;
                                                                    }
                                                                    this.field_z = 5;
                                                                  }
                                                                  if (this.field_s > 0) {
                                                                    w.field_b = 250;
                                                                    this.field_s = this.field_s - 1;
                                                                    this.field_x = 0;
                                                                    if (pk.field_s) {
                                                                      tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[27], 100, ee.field_p * 256 / 100);
                                                                    }
                                                                  }
                                                                  w.field_b = w.field_b + 1;
                                                                } else {
                                                                  if (this.field_p <= 0) {
                                                                    this.a(true, 120, param1);
                                                                  } else {
                                                                    var4 = 10;
                                                                    if (50 > this.field_p) {
                                                                      var4 = 15;
                                                                    }
                                                                    if (15 > this.field_p) {
                                                                      var4 = 20;
                                                                    }
                                                                    this.a(var4, (byte) -113, param1, true);
                                                                    this.field_w = this.field_w + 1;
                                                                    if (25 == this.field_w % 50 &&
                                                                      this.field_w < 250) {
                                                                      ii.field_e[WidgetTheme.field_k].initialize(9147, 43, this.tilePosition);
                                                                      ii.field_e[WidgetTheme.field_k].tileOffset.set(-112, this.tileOffset);
                                                                      dupTemp$53 = ii.field_e[WidgetTheme.field_k].tileOffset;
                                                                      dupTemp$53.column = dupTemp$53.column + (this.field_h * 120 + 40);
                                                                      dupTemp$54 = ii.field_e[WidgetTheme.field_k].tileOffset;
                                                                      dupTemp$54.row = dupTemp$54.row + 40;
                                                                      ii.field_e[WidgetTheme.field_k].field_h = this.field_h;
                                                                      ii.field_e[WidgetTheme.field_k].field_w = 0;
                                                                      WidgetTheme.field_k = WidgetTheme.field_k + 1;
                                                                      if (pk.field_s) {
                                                                        tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[13], 100, 256 * ee.field_p / 100);
                                                                      }
                                                                    }
                                                                    if (this.field_w < 250) {
                                                                      if (this.field_w % 50 > 5 &&
                                                                        this.field_w % 50 < 10) {
                                                                        this.animationFrame = 25;
                                                                      }
                                                                      if (this.field_w % 50 > 15 &&
                                                                        this.field_w % 50 < 20) {
                                                                        this.animationFrame = 26;
                                                                      }
                                                                      if (this.field_w % 50 > 20 &&
                                                                        this.field_w % 50 < 25) {
                                                                        this.animationFrame = 27;
                                                                      }
                                                                      if (this.field_w % 50 > 25 &&
                                                                        30 > this.field_w % 50) {
                                                                        if (ii.field_e[0].tilePosition.column < this.tilePosition.column) {
                                                                          stackIn_972_1 = -1;
                                                                        } else {
                                                                          stackIn_972_1 = 1;
                                                                        }
                                                                        this.field_h = stackIn_972_1;
                                                                        this.animationFrame = 28;
                                                                      }
                                                                    }
                                                                    if (this.field_w > 300 &&
                                                                      this.field_p < 15) {
                                                                      this.field_w = this.field_w - 300;
                                                                    }
                                                                    if (400 < this.field_w) {
                                                                      this.field_w = this.field_w - 400;
                                                                    }
                                                                    this.e(false);
                                                                    if (!(this.field_s <= 0)) {
                                                                      this.field_s = this.field_s - 1;
                                                                      this.field_p = this.field_p - 1;
                                                                      if (this.field_p == 50 ||
                                                                        this.field_p == 30) {
                                                                        ii.field_e[WidgetTheme.field_k].initialize(9147, 32, this.tilePosition);
                                                                        ii.field_e[WidgetTheme.field_k].tileOffset.set(param0 ^ 2, this.tileOffset);
                                                                        ii.field_e[WidgetTheme.field_k].tilePosition.column = 10;
                                                                        ii.field_e[WidgetTheme.field_k].tilePosition.row = 16;
                                                                        ii.field_e[WidgetTheme.field_k].tileOffset.column = 0;
                                                                        ii.field_e[WidgetTheme.field_k].tileOffset.row = 0;
                                                                        ii.field_e[WidgetTheme.field_k].field_h = 1;
                                                                        ii.field_e[WidgetTheme.field_k].field_w = 10;
                                                                        WidgetTheme.field_k = WidgetTheme.field_k + 1;
                                                                      }
                                                                      if (pk.field_s) {
                                                                        tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[27], 100, 256 * ee.field_p / 100);
                                                                      }
                                                                      if (!(this.field_p > 0)) {
                                                                        this.c(false);
                                                                        this.verticalVelocity = 70;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (var4 == 34) {
                                                                  this.verticalVelocity = 2;
                                                                  this.a(1, BufferedRandomAccessFile.soundEffects, param1, 1, 60, 0, tl.field_a, pk.field_s, (byte) 126);
                                                                  this.e(false);
                                                                } else {
                                                                  if (35 != var4 &&
                                                                    var4 != 43) {
                                                                    if (var4 == 36) {
                                                                      if (this.field_p <= 0) {
                                                                        this.a(false, param0 ^ -3, param1);
                                                                      } else {
                                                                        if (this.field_r != 0) {
                                                                          this.field_r = 0;
                                                                          this.field_p = 0;
                                                                        } else {
                                                                          if (this.field_x == 0) {
                                                                            if (ii.field_e[0].tilePosition.row > this.tilePosition.row) {
                                                                              this.field_w = 0;
                                                                              if (ii.field_e[0].tilePosition.column <= this.tilePosition.column - 5) {
                                                                                this.field_h = -1;
                                                                              }
                                                                              this.verticalVelocity = 30;
                                                                              this.field_x = 2;
                                                                              if (this.tilePosition.column + 5 <= ii.field_e[0].tilePosition.column) {
                                                                                this.field_h = 1;
                                                                              }
                                                                            } else {
                                                                              this.a(false, 1, 15, (byte) -102, param1);
                                                                            }
                                                                          }
                                                                          if (2 == this.field_x) {
                                                                            this.a(false, 22, 10, param1);
                                                                          }
                                                                          if (3 == this.field_x) {
                                                                            this.a(10, param0 ^ 26, false, param1);
                                                                          }
                                                                          if (500 < this.field_w) {
                                                                            this.field_p = 0;
                                                                          }
                                                                          this.e(false);
                                                                        }
                                                                      }
                                                                    } else {
                                                                      if (37 == var4) {
                                                                        if (this.field_p <= 0) {
                                                                          this.a(false, 120, param1);
                                                                        } else {
                                                                          if (0 != this.field_r) {
                                                                            this.a(116, param1);
                                                                          } else {
                                                                            if (this.field_x == 0) {
                                                                              this.a(false, 1, 15, (byte) -64, param1);
                                                                              if (ii.field_e[0].tilePosition.row > this.tilePosition.row) {
                                                                                this.field_w = this.field_w + 5;
                                                                              }
                                                                              fieldTemp$38 = this.field_w;
                                                                              this.field_w = this.field_w + 1;
                                                                              if (fieldTemp$38 > 200) {
                                                                                this.field_w = 0;
                                                                                if (ii.field_e[0].tilePosition.column < this.tilePosition.column) {
                                                                                  stackIn_1043_1 = -1;
                                                                                } else {
                                                                                  stackIn_1043_1 = 1;
                                                                                }
                                                                                this.field_h = stackIn_1043_1;
                                                                                this.field_x = 1;
                                                                              }
                                                                            }
                                                                            if (this.field_x == 1) {
                                                                              this.animationFrame = 19;
                                                                              fieldTemp$39 = this.field_w;
                                                                              this.field_w = this.field_w + 1;
                                                                              if (80 < fieldTemp$39) {
                                                                                this.verticalVelocity = 85;
                                                                                this.field_x = 2;
                                                                                this.field_w = 0;
                                                                                if (this.tilePosition.row >= ii.field_e[0].tilePosition.row) {
                                                                                  this.verticalVelocity = 35;
                                                                                }
                                                                              }
                                                                            }
                                                                            if (this.field_x == 2) {
                                                                              this.a(false, 22, 30, param1);
                                                                              if (this.field_x == 0) {
                                                                                this.field_w = (int)(Math.random() * 100.0);
                                                                              }
                                                                            }
                                                                            if (3 == this.field_x) {
                                                                              this.a(15, -80, false, param1);
                                                                              if (this.field_x == 0) {
                                                                                this.field_w = (int)(Math.random() * 100.0);
                                                                              }
                                                                            }
                                                                            this.e(false);
                                                                          }
                                                                        }
                                                                      } else {
                                                                        if (var4 == 38) {
                                                                          if (this.field_p <= 0) {
                                                                            this.a(false, 120, param1);
                                                                          } else {
                                                                            if (this.field_r != 0) {
                                                                              this.a(60, param1);
                                                                            } else {
                                                                              if (0 == this.field_x) {
                                                                                if (this.tilePosition.row < ii.field_e[0].tilePosition.row) {
                                                                                  this.field_w = this.field_w + 5;
                                                                                }
                                                                                this.a(false, 1, 25, (byte) -90, param1);
                                                                                fieldTemp$51 = this.field_w;
                                                                                this.field_w = this.field_w + 1;
                                                                                if (200 < fieldTemp$51) {
                                                                                  if (this.tilePosition.column <= ii.field_e[0].tilePosition.column) {
                                                                                    stackIn_1071_1 = 1;
                                                                                  } else {
                                                                                    stackIn_1071_1 = -1;
                                                                                  }
                                                                                  this.field_h = stackIn_1071_1;
                                                                                  this.field_x = 1;
                                                                                  this.field_w = 0;
                                                                                }
                                                                              }
                                                                              if (this.field_x == 1) {
                                                                                this.animationFrame = 19;
                                                                                fieldTemp$52 = this.field_w;
                                                                                this.field_w = this.field_w + 1;
                                                                                if (fieldTemp$52 > 20) {
                                                                                  this.field_w = 0;
                                                                                  this.verticalVelocity = 70;
                                                                                  this.field_x = 2;
                                                                                  if (this.tilePosition.row >= ii.field_e[0].tilePosition.row) {
                                                                                    this.verticalVelocity = 40;
                                                                                  }
                                                                                }
                                                                              }
                                                                              if (2 == this.field_x) {
                                                                                this.a(false, param0 ^ -109, 25, param1);
                                                                                if (0 == this.field_x) {
                                                                                  this.field_w = (int)(100.0 * Math.random());
                                                                                }
                                                                              }
                                                                              if (this.field_x == 3) {
                                                                                this.a(25, -81, false, param1);
                                                                                if (this.field_x == 0) {
                                                                                  this.field_w = (int)(100.0 * Math.random());
                                                                                }
                                                                              }
                                                                              this.e(false);
                                                                            }
                                                                          }
                                                                        } else {
                                                                          if (var4 == 39) {
                                                                            if (this.field_p <= 0) {
                                                                              this.a(false, param0 ^ -3, param1);
                                                                            } else {
                                                                              if (this.field_r != 0) {
                                                                                this.a(35, param1);
                                                                              } else {
                                                                                if (this.field_x == 0) {
                                                                                  if (ii.field_e[0].tilePosition.row > this.tilePosition.row) {
                                                                                    this.field_w = this.field_w + 1;
                                                                                  }
                                                                                  this.a(false, 2, 20, (byte) -122, param1);
                                                                                  fieldTemp$49 = this.field_w;
                                                                                  this.field_w = this.field_w + 1;
                                                                                  if (200 < fieldTemp$49) {
                                                                                    this.field_x = 3;
                                                                                    this.field_z = 0;
                                                                                    this.field_w = 0;
                                                                                  }
                                                                                }
                                                                                if (this.field_x == 3) {
                                                                                  this.animationFrame = this.animationFrame - 4;
                                                                                  this.a(10, (byte) -13, param1, false);
                                                                                  this.a(10, (byte) 118, param1, false);
                                                                                  this.animationFrame = this.animationFrame + 4;
                                                                                  fieldTemp$50 = this.field_w;
                                                                                  this.field_w = this.field_w + 1;
                                                                                  if (fieldTemp$50 > 300 &&
                                                                                    this.b(param1, -4) == 1 &&
                                                                                    this.tileOffset.row == 0) {
                                                                                    this.field_w = 0;
                                                                                    this.field_x = 0;
                                                                                  }
                                                                                  if (this.animationFrame > 10) {
                                                                                    this.animationFrame = 6;
                                                                                  }
                                                                                }
                                                                                this.e(false);
                                                                              }
                                                                            }
                                                                          } else {
                                                                            if (40 != var4) {
                                                                              switch (var4) {
                                                                                case 41:
                                                                                  this.verticalVelocity = 2;
                                                                                  this.a(1, BufferedRandomAccessFile.soundEffects, param1, 1, 100, 0, tl.field_a, pk.field_s, (byte) -126);
                                                                                  this.e(false);
                                                                                  this.field_w = this.field_w + 1;
                                                                                  if (this.field_w % 10 >= 5) {
                                                                                    this.animationFrame = 37;
                                                                                  } else {
                                                                                    this.animationFrame = 18;
                                                                                  }
                                                                                  if (50 > this.field_w % 100) {
                                                                                    this.tileOffset.row = this.tileOffset.row + (-(this.field_w % 50) + 50 - 25) / 4;
                                                                                  } else {
                                                                                    this.tileOffset.row = this.tileOffset.row + (-25 + this.field_w % 50) / 4;
                                                                                  }
                                                                                  this.e(false);
                                                                                  break regionExit1;
                                                                                case 42:
                                                                                  this.verticalVelocity = 2;
                                                                                  this.a(1, BufferedRandomAccessFile.soundEffects, param1, 1, 50, 0, tl.field_a, pk.field_s, (byte) 126);
                                                                                  this.e(false);
                                                                                  break regionExit1;
                                                                                case 44:
                                                                                  this.field_w = this.field_w + 1;
                                                                                  if (this.field_w > 150) {
                                                                                    this.field_k = 1;
                                                                                  }
                                                                                  this.tileOffset.row = this.tileOffset.row + 4;
                                                                                  break regionExit1;
                                                                                default:
                                                                                  break regionExit1;
                                                                                case 45:
                                                                                  this.animationFrame = 36;
                                                                                  if (this.field_w % 10 > 5) {
                                                                                    this.animationFrame = 37;
                                                                                  }
                                                                                  fieldTemp$40 = this.field_w;
                                                                                  this.field_w = this.field_w + 1;
                                                                                  if (fieldTemp$40 > 50) {
                                                                                    this.field_k = 1;
                                                                                  }
                                                                                  this.e(false);
                                                                                  break regionExit1;
                                                                              }
                                                                            }
                                                                            if (this.field_p <= 0) {
                                                                              this.a(true, 120, param1);
                                                                            } else {
                                                                              if (ql.field_c < 5) {
                                                                                me.field_f = me.field_f - 5;
                                                                                BufferedSocket.field_c = BufferedSocket.field_c - ql.field_c;
                                                                                ql.field_c = 5;
                                                                              }
                                                                              if (this.field_s > 0) {
                                                                                if (ql.field_c == 6) {
                                                                                  ii.field_e[WidgetTheme.field_k].initialize(param0 ^ -9154, 36, this.tilePosition);
                                                                                  ii.field_e[WidgetTheme.field_k].tileOffset.set(-110, this.tileOffset);
                                                                                  dupTemp$41 = ii.field_e[WidgetTheme.field_k].tileOffset;
                                                                                  dupTemp$41.column = dupTemp$41.column + (40 + this.field_h * 120);
                                                                                  dupTemp$42 = ii.field_e[WidgetTheme.field_k].tileOffset;
                                                                                  dupTemp$42.row = dupTemp$42.row + 40;
                                                                                  ii.field_e[WidgetTheme.field_k].field_h = this.field_h;
                                                                                  ii.field_e[WidgetTheme.field_k].field_w = 0;
                                                                                  WidgetTheme.field_k = WidgetTheme.field_k + 1;
                                                                                }
                                                                                this.field_p = this.field_p - 1;
                                                                                this.field_s = this.field_s - 1;
                                                                                if (this.field_p <= 0) {
                                                                                  this.c(false);
                                                                                }
                                                                                if (pk.field_s) {
                                                                                  tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[28], 100, 256 * ee.field_p / 100);
                                                                                }
                                                                              }
                                                                              if (5 == ql.field_c) {
                                                                                this.field_w = this.field_w + 1;
                                                                                this.field_d = 80;
                                                                                fieldTemp$43 = this.field_z;
                                                                                this.field_z = this.field_z - 1;
                                                                                if (0 > fieldTemp$43) {
                                                                                  this.field_z = 10;
                                                                                  this.animationFrame = this.animationFrame + 1;
                                                                                  if (this.animationFrame > 3) {
                                                                                    this.animationFrame = 0;
                                                                                  }
                                                                                }
                                                                                if (this.field_w == 500 ||
                                                                                  this.field_w == 2500) {
                                                                                  ii.field_e[WidgetTheme.field_k].initialize(param0 + 9270, 39, this.tilePosition);
                                                                                  ii.field_e[WidgetTheme.field_k].tilePosition.column = 0;
                                                                                  ii.field_e[WidgetTheme.field_k].tilePosition.row = 15;
                                                                                  ii.field_e[WidgetTheme.field_k].field_h = 1;
                                                                                  ii.field_e[WidgetTheme.field_k].field_w = 0;
                                                                                  WidgetTheme.field_k = WidgetTheme.field_k + 1;
                                                                                }
                                                                                if (this.field_w == 1500) {
                                                                                  ii.field_e[WidgetTheme.field_k].initialize(param0 ^ -9154, 39, this.tilePosition);
                                                                                  ii.field_e[WidgetTheme.field_k].tilePosition.column = 19;
                                                                                  ii.field_e[WidgetTheme.field_k].tilePosition.row = 15;
                                                                                  ii.field_e[WidgetTheme.field_k].field_h = 1;
                                                                                  ii.field_e[WidgetTheme.field_k].field_w = 0;
                                                                                  WidgetTheme.field_k = WidgetTheme.field_k + 1;
                                                                                }
                                                                                if (3000 < this.field_w ||
                                                                                  this.field_p < 150) {
                                                                                  this.field_d = 96;
                                                                                  wg.field_b = wg.field_b - ql.field_c;
                                                                                  ic.field_a = ic.field_a - 6;
                                                                                  this.animationFrame = 0;
                                                                                  this.field_w = 0;
                                                                                  this.tileOffset.column = this.tileOffset.column - 40;
                                                                                  ql.field_c = 6;
                                                                                  this.field_x = 0;
                                                                                  if (pk.field_s) {
                                                                                    tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[22], 100, ee.field_p * 256 / 100);
                                                                                  }
                                                                                }
                                                                              }
                                                                              if (ql.field_c == 6) {
                                                                                if (0 == this.field_x ||
                                                                                  this.field_x == 1) {
                                                                                  this.animationFrame = 0;
                                                                                  if (this.field_w < 0) {
                                                                                    this.animationFrame = 3;
                                                                                  }
                                                                                  fieldTemp$44 = this.field_w;
                                                                                  this.field_w = this.field_w + 1;
                                                                                  if (10 < fieldTemp$44) {
                                                                                    this.field_w = 0;
                                                                                    this.verticalVelocity = 100;
                                                                                    this.field_x = 2;
                                                                                    if (ii.field_e[0].tilePosition.row <= this.tilePosition.row) {
                                                                                      this.verticalVelocity = 70;
                                                                                    }
                                                                                    if (this.tilePosition.column > ii.field_e[0].tilePosition.column) {
                                                                                      stackIn_1157_1 = -1;
                                                                                    } else {
                                                                                      stackIn_1157_1 = 1;
                                                                                    }
                                                                                    this.field_h = stackIn_1157_1;
                                                                                  }
                                                                                }
                                                                                if (2 == this.field_x) {
                                                                                  this.a(true, 22, 15, param1);
                                                                                  this.animationFrame = 1;
                                                                                  if (this.verticalVelocity < 60) {
                                                                                    this.animationFrame = 2;
                                                                                  }
                                                                                }
                                                                                if (3 == this.field_x) {
                                                                                  this.a(15, param0 + 7, true, param1);
                                                                                  this.animationFrame = 2;
                                                                                  if (this.field_x == 0) {
                                                                                    this.field_w = -10;
                                                                                    if (this.tilePosition.row > ii.field_e[0].tilePosition.row &&
                                                                                      this.tilePosition.row > 2) {
                                                                                      this.tilePosition.row = this.tilePosition.row - 1;
                                                                                      this.tileOffset.row = this.tileOffset.row + 230;
                                                                                      this.field_x = 3;
                                                                                    } else {
                                                                                      this.animationFrame = 3;
                                                                                      ii.field_e[WidgetTheme.field_k].initialize(9147, 45, this.tilePosition);
                                                                                      ii.field_e[WidgetTheme.field_k].tileOffset.set(-88, this.tileOffset);
                                                                                      ii.field_e[WidgetTheme.field_k].field_w = 0;
                                                                                      WidgetTheme.field_k = WidgetTheme.field_k + 1;
                                                                                      if (pk.field_s) {
                                                                                        tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[5], 100, ee.field_p * 256 / 100);
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if (75 > this.field_p &&
                                                                                  this.field_x != 4) {
                                                                                  this.verticalVelocity = 60;
                                                                                  this.field_x = 4;
                                                                                }
                                                                                if (this.field_x == 4) {
                                                                                  this.a(10, param0 ^ 20, true, param1);
                                                                                  if (3 == this.field_x) {
                                                                                    this.field_x = 4;
                                                                                  }
                                                                                  this.animationFrame = 31;
                                                                                  if (this.field_x == 0) {
                                                                                    if (2 >= this.tilePosition.row) {
                                                                                      this.tilePosition.row = 2;
                                                                                      this.animationFrame = 2;
                                                                                      this.tileOffset.row = 0;
                                                                                      me.field_f = me.field_f + ql.field_c;
                                                                                      w.field_b = 0;
                                                                                      BufferedSocket.field_c = BufferedSocket.field_c + 7;
                                                                                      this.field_x = 0;
                                                                                      this.field_d = 128;
                                                                                      this.field_w = 0;
                                                                                      ql.field_c = 7;
                                                                                      this.tileOffset.column = this.tileOffset.column - 40;
                                                                                      this.animationFrame = 0;
                                                                                      stackIn_1184_0 = 0;
                                                                                      if (pk.field_s) {
                                                                                        stackIn_1185_1 = 0;
                                                                                      } else {
                                                                                        stackIn_1185_1 = 1;
                                                                                      }
                                                                                      if (stackIn_1184_0 == stackIn_1185_1) {
                                                                                        tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[5], 100, 256 * ee.field_p / 100);
                                                                                      }
                                                                                    } else {
                                                                                      this.tilePosition.row = this.tilePosition.row - 1;
                                                                                      this.field_x = 4;
                                                                                      this.tileOffset.row = this.tileOffset.row + 230;
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                              if (ql.field_c == 7) {
                                                                                if (w.field_b < 250) {
                                                                                  fieldTemp$45 = this.field_z;
                                                                                  this.field_z = this.field_z - 1;
                                                                                  if (0 >= fieldTemp$45) {
                                                                                    this.animationFrame = this.animationFrame + 1;
                                                                                    if (this.animationFrame > 1) {
                                                                                      this.animationFrame = 0;
                                                                                    }
                                                                                    this.field_z = 5;
                                                                                  }
                                                                                  this.field_o = 7;
                                                                                  this.field_p = 75;
                                                                                  w.field_b = w.field_b + 1;
                                                                                  if (200 < w.field_b) {
                                                                                    this.animationFrame = 23;
                                                                                    stackIn_1239_0 = 0;
                                                                                    if (pk.field_s) {
                                                                                      stackIn_1240_1 = 0;
                                                                                    } else {
                                                                                      stackIn_1240_1 = 1;
                                                                                    }
                                                                                    if (stackIn_1239_0 == stackIn_1240_1) {
                                                                                      tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[22], 100, 256 * ee.field_p / 100);
                                                                                    }
                                                                                  }
                                                                                  if (250 <= w.field_b) {
                                                                                    this.field_z = 0;
                                                                                    this.field_x = 0;
                                                                                    this.field_w = 0;
                                                                                    this.animationFrame = 25;
                                                                                  }
                                                                                } else {
                                                                                  if (this.field_x == 0) {
                                                                                    this.field_z = this.field_z + 1;
                                                                                    if (10 < this.field_z) {
                                                                                      this.animationFrame = this.animationFrame + 1;
                                                                                      if (this.animationFrame == 27) {
                                                                                        ii.field_e[WidgetTheme.field_k].initialize(9147, 41, this.tilePosition);
                                                                                        ii.field_e[WidgetTheme.field_k].tileOffset.set(-85, this.tileOffset);
                                                                                        dupTemp$46 = ii.field_e[WidgetTheme.field_k].tileOffset;
                                                                                        dupTemp$46.column = dupTemp$46.column + (40 + this.field_h * 120);
                                                                                        dupTemp$47 = ii.field_e[WidgetTheme.field_k].tileOffset;
                                                                                        dupTemp$47.row = dupTemp$47.row + 40;
                                                                                        ii.field_e[WidgetTheme.field_k].field_h = this.field_h;
                                                                                        ii.field_e[WidgetTheme.field_k].field_w = (int)(Math.random() * 100.0);
                                                                                        WidgetTheme.field_k = WidgetTheme.field_k + 1;
                                                                                        if (pk.field_s) {
                                                                                          tl.field_a.addSample(SpriteState.secondarySoundEffects[36], 100, 192 * ee.field_p / 100);
                                                                                        }
                                                                                      }
                                                                                      if (25 > this.animationFrame) {
                                                                                        this.animationFrame = 25;
                                                                                      }
                                                                                      if (this.animationFrame > 27) {
                                                                                        this.animationFrame = 19;
                                                                                        this.field_w = this.field_w + 1;
                                                                                      }
                                                                                    }
                                                                                    if (this.field_w > 8) {
                                                                                      this.field_w = 0;
                                                                                      this.field_x = 2;
                                                                                      this.field_z = 0;
                                                                                      this.verticalVelocity = 5;
                                                                                      if (ii.field_e[0].tilePosition.row > 2 + this.tilePosition.row) {
                                                                                        this.verticalVelocity = 80;
                                                                                      }
                                                                                      if (ii.field_e[0].tilePosition.row < this.tilePosition.row) {
                                                                                        this.tilePosition.row = this.tilePosition.row - 1;
                                                                                        this.tileOffset.row = this.tileOffset.row + 230;
                                                                                        this.verticalVelocity = -5;
                                                                                        this.field_x = 3;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  if (this.field_x == 2) {
                                                                                    this.a(false, 22, 25, param1);
                                                                                    if (this.verticalVelocity <= 0) {
                                                                                      this.field_x = 3;
                                                                                    }
                                                                                    this.animationFrame = 21;
                                                                                  }
                                                                                  if (this.field_x == 3) {
                                                                                    var4 = 40;
                                                                                    if (ii.field_e[0].tilePosition.row < -2 + this.tilePosition.row) {
                                                                                      var4 = 20;
                                                                                    }
                                                                                    this.a(var4, (byte) -82, param1, true);
                                                                                    fieldTemp$48 = this.field_w;
                                                                                    this.field_w = this.field_w + 1;
                                                                                    if (fieldTemp$48 > 25 &&
                                                                                      this.b(param1, -4) == 1 &&
                                                                                      this.tileOffset.row == 0) {
                                                                                      this.animationFrame = 25;
                                                                                      this.field_w = 0;
                                                                                      this.field_z = 0;
                                                                                      if (ii.field_e[0].tilePosition.column >= this.tilePosition.column) {
                                                                                        stackIn_1225_1 = 1;
                                                                                      } else {
                                                                                        stackIn_1225_1 = -1;
                                                                                      }
                                                                                      this.field_h = stackIn_1225_1;
                                                                                      this.field_x = 0;
                                                                                      stackIn_1227_0 = 0;
                                                                                      if (pk.field_s) {
                                                                                        stackIn_1228_1 = 0;
                                                                                      } else {
                                                                                        stackIn_1228_1 = 1;
                                                                                      }
                                                                                      if (stackIn_1227_0 == stackIn_1228_1) {
                                                                                        tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[5], 100, 256 * ee.field_p / 100);
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                              this.e(false);
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (this.field_w <= 2) {
                                                                      this.a(1, BufferedRandomAccessFile.soundEffects, param1, 1, 40, 0, tl.field_a, pk.field_s, (byte) -123);
                                                                    }
                                                                    this.e(false);
                                                                    if (1 == this.b(param1, -4) &&
                                                                      0 == this.tileOffset.row &&
                                                                      this.field_w <= 2) {
                                                                      this.verticalVelocity = 5;
                                                                      stackIn_1000_0 = 0;
                                                                      if (pk.field_s) {
                                                                        stackIn_1001_1 = 0;
                                                                      } else {
                                                                        stackIn_1001_1 = 1;
                                                                      }
                                                                      if (stackIn_1000_0 == stackIn_1001_1) {
                                                                        tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[14], 100, ee.field_p * 256 / 100);
                                                                      }
                                                                      ii.field_e[WidgetTheme.field_k].initialize(9147, this.actorType, this.tilePosition);
                                                                      ii.field_e[WidgetTheme.field_k].tileOffset.set(-112, this.tileOffset);
                                                                      ii.field_e[WidgetTheme.field_k].field_h = this.field_h;
                                                                      ii.field_e[WidgetTheme.field_k].field_w = 11;
                                                                      WidgetTheme.field_k = WidgetTheme.field_k + 1;
                                                                    }
                                                                    this.field_w = this.field_w + 1;
                                                                    if (this.field_w == 2) {
                                                                      this.field_w = 0;
                                                                    }
                                                                    if (!(this.field_w < 30)) {
                                                                      this.field_k = 1;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  if (this.field_p <= 0) {
                                                    this.a(false, 120, param1);
                                                  } else {
                                                    if (this.field_r != 0) {
                                                      this.a(param0 ^ -72, param1);
                                                    } else {
                                                      if (this.field_x == 0) {
                                                        if (ii.field_e[0].tilePosition.row > this.tilePosition.row) {
                                                          this.field_w = this.field_w + 1;
                                                        }
                                                        this.a(false, 1, 20, (byte) -67, param1);
                                                        fieldTemp$64 = this.field_w;
                                                        this.field_w = this.field_w + 1;
                                                        if (200 < fieldTemp$64) {
                                                          this.field_w = 0;
                                                          if (ii.field_e[0].tilePosition.column < this.tilePosition.column) {
                                                            stackIn_716_1 = -1;
                                                          } else {
                                                            stackIn_716_1 = 1;
                                                          }
                                                          this.field_h = stackIn_716_1;
                                                          this.field_x = 1;
                                                        }
                                                      }
                                                      if (1 == this.field_x) {
                                                        this.animationFrame = 19;
                                                        fieldTemp$65 = this.field_w;
                                                        this.field_w = this.field_w + 1;
                                                        if (fieldTemp$65 > 40) {
                                                          this.field_w = 0;
                                                          this.field_x = 2;
                                                          this.verticalVelocity = 80;
                                                          if (this.tilePosition.row >= ii.field_e[0].tilePosition.row) {
                                                            this.verticalVelocity = 40;
                                                          }
                                                        }
                                                      }
                                                      if (this.field_x == 2) {
                                                        this.a(false, 22, 15, param1);
                                                        if (this.field_x == 0) {
                                                          this.field_w = (int)(Math.random() * 100.0);
                                                        }
                                                      }
                                                      if (this.field_x == 3) {
                                                        this.a(15, -92, false, param1);
                                                        if (this.field_x == 0) {
                                                          this.field_w = (int)(Math.random() * 100.0);
                                                        }
                                                      }
                                                      this.e(false);
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        break regionExit1;
                      }
                      if (0 >= this.field_p) {
                        this.a(false, 120, param1);
                      } else {
                        if (0 != this.field_r) {
                          if (this.actorType != 8) {
                            this.a(98, param1);
                          } else {
                            this.field_p = 0;
                            this.field_r = 0;
                          }
                        } else {
                          var4 = 15;
                          if (this.actorType == 7) {
                            var4 = 10;
                          }
                          if (this.field_x == 0) {
                            if (this.tilePosition.row < ii.field_e[0].tilePosition.row) {
                              this.field_w = this.field_w + 1;
                            }
                            this.a(false, 0, var4, (byte) -68, param1);
                            fieldTemp$73 = this.field_w;
                            this.field_w = this.field_w + 1;
                            if (fieldTemp$73 > 100) {
                              this.field_x = 1;
                              this.field_w = 0;
                              this.field_z = 0;
                              if (100.0 * Math.random() < 10.0 &&
                                7 == this.actorType) {
                                this.field_x = 4;
                              }
                            }
                          }
                          if (1 == this.field_x) {
                            fieldTemp$74 = this.field_w;
                            this.field_w = this.field_w + 1;
                            if (fieldTemp$74 > 25) {
                              this.field_x = 2;
                              this.field_w = 0;
                              this.verticalVelocity = 70;
                            }
                            this.animationFrame = 19;
                          }
                          if (this.field_x == 2) {
                            this.a(false, 22, var4, param1);
                            if (this.field_x == 0) {
                              this.field_w = (int)(Math.random() * 100.0);
                            }
                          }
                          if (this.field_x == 3) {
                            this.a(var4, -82, false, param1);
                            if (this.field_x == 0) {
                              this.field_w = (int)(Math.random() * 100.0);
                            }
                          }
                          if (this.field_x == 4) {
                            if (!this.a(false, param1, 25)) {
                              this.e(false);
                              break regionExit1;
                            }
                            if (WidgetTheme.field_k >= 100) {
                              this.e(false);
                              break regionExit1;
                            }
                            stackIn_401_0 = (pk.field_s) ? 0 : 1;
                            if (stackIn_401_0 != 1) {
                              tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[12], 100, 256 * ee.field_p / 100);
                            }
                            this.field_x = 0;
                            this.field_w = 0;
                            ii.field_e[WidgetTheme.field_k].initialize(param0 ^ -9154, 8, this.tilePosition);
                            ii.field_e[WidgetTheme.field_k].tileOffset.set(-88, this.tileOffset);
                            ii.field_e[WidgetTheme.field_k].field_h = this.field_h;
                            ii.field_e[WidgetTheme.field_k].field_w = 10;
                            WidgetTheme.field_k = WidgetTheme.field_k + 1;
                          }
                          this.e(false);
                        }
                      }
                      break regionExit1;
                    }
                    if (this.field_p > 0) {
                      if (0 == this.field_r) {
                        this.a(15, (byte) 127, param1, false);
                        this.e(false);
                      } else {
                        this.a(param0 + 238, param1);
                      }
                    } else {
                      this.a(false, 120, param1);
                    }
                  } else {
                    if (this.field_p > 0) {
                      if (this.field_r == 0) {
                        if (this.field_x == 0) {
                          if (this.tilePosition.row < ii.field_e[0].tilePosition.row) {
                            this.field_w = this.field_w + 1;
                          }
                          stackIn_276_1 = false;
                          if (!pg.field_q &&
                            ql.field_c != 0) {
                            stackIn_277_2 = 0;
                          } else {
                            stackIn_277_2 = 2;
                          }
                          this.a(stackIn_276_1, stackIn_277_2, 15, (byte) -63, param1);
                          if (!pg.field_q) {
                            fieldTemp$76 = this.field_w;
                            this.field_w = this.field_w + 1;
                            if (fieldTemp$76 > 250 &&
                              ql.field_c != 0) {
                              this.field_x = 1;
                              this.field_w = 0;
                            }
                          }
                        }
                        if (this.field_x == 1) {
                          this.animationFrame = 19;
                          fieldTemp$77 = this.field_w;
                          this.field_w = this.field_w + 1;
                          if (25 < fieldTemp$77) {
                            this.field_x = 2;
                            this.field_w = 0;
                            this.verticalVelocity = 80;
                          }
                        }
                        if (2 == this.field_x) {
                          this.a(false, 22, 5, param1);
                          if (this.field_x == 0) {
                            this.field_w = (int)(100.0 * Math.random());
                          }
                        }
                        if (this.field_x == 3) {
                          this.a(5, param0 + 16, false, param1);
                          if (this.field_x == 0) {
                            this.field_w = (int)(100.0 * Math.random());
                            this.e(false);
                          } else {
                            this.e(false);
                          }
                        } else {
                          this.e(false);
                        }
                      } else {
                        this.a(14, param1);
                      }
                    } else {
                      this.a(false, param0 + 243, param1);
                    }
                  }
                }
              }
            }
          }
          if (param0 != -123) {
            this.c(-4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_1269_0 = var3;
          stackIn_1269_1 = new StringBuilder().append("eg.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_1270_2 = "null";
          } else {
            stackIn_1270_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_1269_0), ((StringBuilder) (Object) stackIn_1269_1).append(stackIn_1270_2).append(')').toString());
        }
    }

    final static void loadCommonWidgetSprites(ResourceArchive param0, int param1, ResourceArchive param2, ResourceArchive param3) {
        Sprite var16 = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[][] var6 = null;
        int[][] var17 = null;
        int[][] var15 = null;
        int[][] var7 = null;
        IndexedSprite[] var10_ref_db__ = null;
        int var11_int = 0;
        Sprite var11 = null;
        Sprite var12 = null;
        Sprite var13 = null;
        int var8 = 0;
        int var9 = 0;
        int var14 = wizardrun.field_H;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          ValidationState.field_a = WidgetContainer.loadSpriteStrip("commonui", param3, "frame_top", 127);
          NanoTickClock.field_i = WidgetContainer.loadSpriteStrip("commonui", param3, "frame_bottom", 88);
          hg.field_d = vg.loadSprite(15, "jagex_logo_grey", param3, "commonui");
          vf.field_j = WidgetContainer.loadSpriteStrip("commonui", param3, "button", 121);
          te.field_k = Js5Index.a((byte) 125, "commonui", param3, "validation");
          e.field_b = (BitmapFont) ((Object) oc.a(param3, "commonui", "arezzo12", 67, param0));
          Crc32Helpers.field_b = (BitmapFont) ((Object) oc.a(param3, "commonui", "arezzo14", 93, param0));
          PacketBuffer.field_i = (BitmapFont) ((Object) oc.a(param3, "commonui", "arezzo14bold", 118, param0));
          var16 = new Sprite(param2.a(122, "", "button.gif"), (java.awt.Component) ((Object) wizardrun.field_G));
          TextFieldValidator.a("commonui", "dropdown", param3, (byte) -108);
          var5 = re.a(param3, "commonui", "screen_options", 112);
          IterableNodeHashTable.field_f = new IndexedSprite[4];
          CharSequenceJoiner.field_c = new IndexedSprite[4];
          nj.field_k = new IndexedSprite[4];
          var6 = new IndexedSprite[][]{IterableNodeHashTable.field_f, CharSequenceJoiner.field_c, nj.field_k};
          var17 = new int[4][];
          var15 = var17;
          var7 = var15;
          var7[0] = var5[0].field_k;
          for (var8 = 1; var8 < var17.length; var8++) {
            var7[var8] = (int[]) ((Object) var17[0].clone());
          }
          var8Lifetime1 = var5[0].field_l[0];
          var17[2][var8Lifetime1] = 16777215;
          var17[1][var8Lifetime1] = 2394342;
          var17[3][var8Lifetime1] = 4767999;
          for (var9 = 0; var9 < 3; var9++) {
            var10_ref_db__ = var6[var9];
            for (var11_int = 0; var11_int < var10_ref_db__.length; var11_int++) {
              var10_ref_db__[var11_int] = ClientException.a(var5[var9], (byte) -105, var17[var11_int]);
            }
          }
          var9Lifetime1 = var16.height;
          GameMenu.d(-31782);
          int var10 = -88 / ((15 - param1) / 44);
          var16.bindAsRasterTarget();
          SoftwareRasterizer.desaturateRect(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
          var11 = new Sprite(var9Lifetime1, var9Lifetime1);
          var11.bindAsRasterTarget();
          var16.drawWithOffsets(0, 0);
          var12 = new Sprite(var9Lifetime1, var9Lifetime1);
          var12.bindAsRasterTarget();
          var16.drawWithOffsets(-var16.width + var9Lifetime1, 0);
          var13 = new Sprite(var16.width - var9Lifetime1 * 2, var9Lifetime1);
          var13.bindAsRasterTarget();
          var16.drawWithOffsets(-var9Lifetime1, 0);
          bb.b(4);
          vf.field_j = new Sprite[]{var11, var13, var12};
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "eg.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void drawWizard(int param0, int param1, byte param2) {
        int var11 = 0;
        int stackIn_21_1 = 0;
        int var4;
        int var5;
        Sprite[] var6;
        int var7;
        int var8;
        double var9;
        int var12;
        var12 = wizardrun.field_H;
        if (param2 != 62) {
          this.field_q = (Sprite) null;
        }
        var4 = this.tileOffset.column * 32 / 240 + 32 * this.tilePosition.column;
        var5 = 32 * (15 - this.tilePosition.row) - (32 + this.tileOffset.row * 32 / 240);
        var5 = var5 - (this.field_d - 32);
        var6 = oc.field_b[param1];
        if (param1 == 4 &&
          ql.field_c == 6) {
          var6 = hh.field_eb;
        }
        if (param1 == 4 &&
          7 == ql.field_c) {
          var6 = MusicPatch.field_j;
        }
        if (this.field_p <= 0) {
          var7 = 240 * this.tilePosition.column + this.tileOffset.column;
          var7 = 0;
          var6[this.animationFrame].a(var4 + this.field_d / 2, var5 + this.field_d / 2, -105, 128, var7);
        } else {
          if (this.field_r != 0) {
            var7 = this.tilePosition.column * 240 + this.tileOffset.column;
            var8 = this.field_d / 2;
            var6[this.animationFrame].a(var8 + var4, var8 + var5, -112, 128, var7);
            this.field_q = var6[this.animationFrame].flipHorizontal();
            this.field_A = var5;
            this.field_y = var4;
            for (var11 = 0; -(var8 * this.field_w / 1000) + var8 > var11; var11 += 2) {
              var9 = (0.5 * (double)(this.tileOffset.column + this.tilePosition.column * 240) + 6.28 * (double)var11) / (double)var8;
              GridPoint.field_c.drawScaledAlpha((int)((double)var8 * Math.cos((double)this.field_h * var9) + (double)var8) + (var4 - 6), var5 + ((int)((double)var8 + Math.sin(var9 * (double)this.field_h) * (double)var8) - 6), 12, 12, 255 - var11 % 10 * 25);
              GridPoint.field_c.drawScaledAlpha(var4 - (int)((double)var8 * Math.cos((double)this.field_h * var9) - (double)var8) - 6, -(int)((double)(-var8) + (double)var8 * Math.sin(var9 * (double)this.field_h)) + (var5 - 6), 12, 12, 255 - 25 * (var11 % 10));
            }
          } else {
            if (-1 == this.field_h) {
              var6[this.animationFrame].drawTransparent(var4, var5);
              this.field_q = var6[this.animationFrame];
              this.field_A = var5;
              this.field_y = var4;
            } else {
              var6[this.animationFrame].drawMirrored(var4, var5);
              this.field_q = var6[this.animationFrame].flipHorizontal();
              this.field_y = var4;
              this.field_A = var5;
            }
            if (!(AccountCreationForm.field_T < 250) && (GridActor.field_l == 0 &&
              ql.field_c == 0 &&
              AccountCreationForm.field_T < 400)) {
              if (uc.field_g >= 20) {
                stackIn_21_1 = 16776960;
              } else {
                stackIn_21_1 = 16711680;
              }
              this.drawOutlinedLabel(stackIn_21_1, var6[this.animationFrame].fullWidth / 2 + var4, true, "*", -4 + var5);
            }
          }
        }
    }

    private final void a(int param0, int param1, boolean param2, LevelData param3) {
        int stackIn_13_0 = 0;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = wizardrun.field_H;
        try {
          this.a(1, BufferedRandomAccessFile.soundEffects, param3, 1, param0, 1, tl.field_a, pk.field_s, (byte) 126);
          if (param1 > -73) {
            return;
          }
          if (this.b(param3, -4) == 1 &&
            0 == this.verticalVelocity) {
            this.field_z = 0;
            this.field_x = 0;
            if (this.actorType != 5 &&
              this.actorType != 22 &&
              38 != this.actorType &&
              64 >= this.field_d) {
              stackIn_13_0 = 0;
              if (pk.field_s) {
                stackIn_14_1 = 0;
              } else {
                stackIn_14_1 = 1;
              }
              if (stackIn_13_0 != stackIn_14_1) {
                if (pk.field_s) {
                  if (6 == this.actorType) {
                    tl.field_a.addSample(SpriteState.secondarySoundEffects[6], 100, 256 * ee.field_p / 100);
                  } else {
                    tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[5], 100, ee.field_p * 256 / 100);
                  }
                }
              } else {
                tl.field_a.addSample(BufferedRandomAccessFile.soundEffects[4], 100, ee.field_p * 256 / 100);
              }
            }
          }
          if (param2) {
            this.field_z = this.field_z + 1;
            this.animationFrame = 21;
            if (25 < this.field_z) {
              this.animationFrame = 22;
            }
            if (this.actorType == 6) {
              this.animationFrame = 22;
              if (this.field_z > 15) {
                this.animationFrame = 23;
              }
              if (this.field_z > 25) {
                this.animationFrame = 24;
              }
            }
          } else {
            this.animationFrame = 21;
          }
          if (this.field_s > 0) {
            if (param2) {
              return;
            }
            this.field_s = this.field_s - 1;
            this.field_p = this.field_p - 1;
            if (this.field_p > 0) {
              if (pk.field_s &&
                !param2) {
                this.c(1);
              }
            } else {
              if (pk.field_s &&
                !param2) {
                this.c(false);
              }
            }
            if (this.field_p > 0) {
              return;
            }
            this.verticalVelocity = 60;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_46_0 = var5;
          stackIn_46_1 = new StringBuilder().append("eg.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, int param2, LevelData param3) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        GridPoint var6 = null;
        try {
          if (param1 != 22) {
            var6 = (GridPoint) null;
            this.initialize(81, 113, (GridPoint) null);
          }
          this.a(1, BufferedRandomAccessFile.soundEffects, param3, 1, param2, 1, tl.field_a, pk.field_s, (byte) -37);
          if (this.verticalVelocity <= 0) {
            this.field_x = 3;
            this.field_z = 0;
          }
          this.animationFrame = 20;
          if (6 == this.actorType) {
            this.animationFrame = 22;
          }
          if (this.field_s > 0) {
            if (param0) {
              return;
            }
            this.field_s = this.field_s - 1;
            this.field_p = this.field_p - 1;
            if (this.field_p > 0) {
              if (pk.field_s &&
                !param0) {
                this.c(1);
              }
            } else {
              if (pk.field_s &&
                !param0) {
                this.c(false);
              }
            }
            if (this.field_p > 0) {
              return;
            }
            this.verticalVelocity = 60;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("eg.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, int param2, byte param3, LevelData param4) {
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        var7 = wizardrun.field_H;
        try {
          if (this.b(param4, -4) == 0 &&
            3 != param1) {
            this.field_x = 3;
          }
          if (param1 == 3) {
            this.a(2, BufferedRandomAccessFile.soundEffects, param4, 0, param2, 1, tl.field_a, pk.field_s, (byte) 126);
          }
          if (param1 == 0) {
            this.a(1, BufferedRandomAccessFile.soundEffects, param4, 0, param2, 1, tl.field_a, pk.field_s, (byte) 126);
          }
          if (param1 == 2) {
            this.a(0, BufferedRandomAccessFile.soundEffects, param4, 0, param2, 1, tl.field_a, pk.field_s, (byte) -117);
          }
          if (param1 == 1) {
            if (this.tilePosition.row <= ii.field_e[0].tilePosition.row &&
              this.verticalVelocity == 0) {
              this.a(0, BufferedRandomAccessFile.soundEffects, param4, 0, param2, 1, tl.field_a, pk.field_s, (byte) 127);
            } else {
              this.a(1, BufferedRandomAccessFile.soundEffects, param4, 1, param2, 1, tl.field_a, pk.field_s, (byte) -65);
            }
          }
          this.field_z = this.field_z - 1;
          if (0 >= this.field_z) {
            this.field_z = 5;
            this.animationFrame = this.animationFrame + 1;
            if (param0) {
              this.field_z = 2;
            }
          }
          if (this.animationFrame < 2) {
            this.animationFrame = 2;
          }
          if (!param0) {
            if (5 < this.animationFrame) {
              this.animationFrame = 2;
            }
          } else {
            if (this.animationFrame > 9) {
              this.animationFrame = 2;
            }
          }
          if (param3 >= -58) {
            this.drawWizard(-80, -12, (byte) -64);
          }
          if (this.field_s > 0) {
            if (param0) {
              return;
            }
            this.field_s = this.field_s - 1;
            this.field_p = this.field_p - 1;
            if (this.field_p > 0) {
              if (pk.field_s &&
                !param0) {
                this.c(1);
              }
            } else {
              if (pk.field_s &&
                !param0) {
                this.c(false);
              }
            }
            if (this.field_p > 0) {
              return;
            }
            if (this.field_p <= 0) {
              if (pk.field_s &&
                !param0) {
                this.c(false);
              }
            } else {
              if (pk.field_s &&
                !param0) {
                this.c(1);
              }
            }
            this.verticalVelocity = 60;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_59_0 = var6;
          stackIn_59_1 = new StringBuilder().append("eg.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(')').toString());
        }
    }

    final void initialize(int param0, int param1, GridPoint param2) {
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        String stackIn_120_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.animationFrame = 0;
          this.field_w = 0;
          this.field_q = null;
          this.field_z = 0;
          this.actorType = param1;
          this.field_x = 0;
          this.tilePosition.set(-109, param2);
          this.tileOffset.clear(17939);
          this.field_m = 0;
          this.verticalVelocity = 0;
          this.field_z = 0;
          this.field_r = 0;
          this.field_o = 0;
          this.field_d = 32;
          this.field_h = 1;
          this.field_p = 0;
          this.field_k = 0;
          this.field_s = 0;
          if (param1 == 0) {
            this.field_d = 64;
          }
          if (21 == param1) {
            this.field_d = 32;
          }
          if (param1 == 1) {
            this.field_d = 24;
          }
          if (param1 == 2) {
            this.field_d = 64;
          }
          if (3 == param1) {
            this.field_p = 1;
            this.field_d = 32;
          }
          if (4 == param1) {
            this.field_p = 4;
            this.field_d = 48;
          }
          if (param1 == 5) {
            this.field_p = 1;
            this.field_d = 32;
          }
          if (param1 == 6) {
            this.field_d = 65;
            this.tileOffset.column = this.tileOffset.column - 80;
            this.field_p = 50;
            this.field_o = 7;
          }
          if (param1 == 7) {
            this.field_p = 5;
            this.field_d = 48;
          }
          if (param1 == 8) {
            this.field_d = 32;
            this.field_p = 1;
          }
          if (9 == param1) {
            this.field_d = 48;
            this.field_p = 4;
          }
          if (param1 == 10) {
            this.field_p = 8;
            this.field_d = 64;
          }
          if (param1 == 11) {
            this.field_d = 64;
          }
          if (param1 == 12) {
            this.field_d = 65;
            this.field_p = 50;
          }
          if (13 == param1) {
            this.field_d = 48;
            this.field_p = 3;
          }
          if (param1 == 14) {
            this.field_p = 5;
            this.field_d = 48;
          }
          if (15 == param1) {
            this.field_d = 48;
            this.field_p = 6;
          }
          if (param1 == 16) {
            this.field_d = 64;
            this.field_p = 10;
          }
          if (17 == param1) {
            this.field_d = 80;
            this.field_p = 75;
          }
          if (18 == param1) {
            this.field_d = 24;
          }
          if (19 == param1) {
            this.field_d = 20;
          }
          if (param1 == 25) {
            this.field_d = 80;
          }
          if (param1 == 22) {
            this.field_p = 3;
            this.field_d = 32;
          }
          if (param1 == 23) {
            this.field_p = 12;
            this.field_d = 80;
          }
          if (param1 == 24) {
            this.field_p = 6;
            this.field_d = 48;
          }
          if (26 == param1) {
            this.field_d = 96;
            this.field_p = 75;
          }
          if (param1 == 27) {
            this.field_d = 40;
          }
          if (param1 == 28) {
            this.field_d = 24;
          }
          if (param1 == 29) {
            this.field_d = 64;
            this.field_p = 6;
          }
          if (param1 == 30) {
            this.field_d = 64;
            this.field_p = 4;
          }
          if (param1 == 31) {
            this.field_d = 64;
            this.field_p = 15;
          }
          if (param1 == 32) {
            this.field_d = 80;
            this.field_p = 12;
          }
          if (33 == param1) {
            this.field_p = 75;
            this.field_d = 96;
          }
          if (param1 == 34) {
            this.field_d = 64;
          }
          if (param1 == 35) {
            this.field_d = 64;
          }
          if (42 == param1) {
            this.field_d = 64;
          }
          if (43 == param1) {
            this.field_d = 96;
          }
          if (36 == param1) {
            this.field_p = 1;
            this.field_d = 32;
          }
          if (37 == param1) {
            this.field_d = 80;
            this.field_p = 20;
          }
          if (param1 == 38) {
            this.field_d = 48;
            this.field_p = 6;
          }
          if (39 == param1) {
            this.field_d = 64;
            this.field_p = 10;
          }
          if (40 == param1) {
            this.field_d = 80;
            this.field_p = 200;
          }
          if (param0 != 9147) {
            return;
          }
          if (param1 == 41) {
            this.field_d = 128;
          }
          if (param1 == 45) {
            this.field_d = 96;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_119_0 = var4;
          stackIn_119_1 = new StringBuilder().append("eg.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_120_2 = "null";
          } else {
            stackIn_120_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_119_0), ((StringBuilder) (Object) stackIn_119_1).append(stackIn_120_2).append(')').toString());
        }
    }

    PlatformActor() {
        this.field_k = 0;
        this.field_w = 0;
        this.field_x = 0;
        this.actorType = 0;
        this.tilePosition.clear(17939);
        this.tileOffset.clear(17939);
        this.field_m = 0;
        this.field_p = 0;
        this.field_r = 0;
        this.verticalVelocity = 0;
        this.field_h = 1;
        this.field_o = 0;
        this.field_q = null;
        this.field_d = 32;
        this.field_s = 0;
    }

    static {
        field_t = "More suggestions";
    }
}
