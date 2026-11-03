/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HowToPlayScreen extends MenuScreen {
    static String field_q;
    private int field_r;
    static Sprite[] field_s;
    static int field_o;
    static String field_p;

    public static void releaseStatics(int param0) {
        int var1 = -41 / ((17 - param0) / 51);
        field_p = null;
        field_s = null;
        field_q = null;
    }

    HowToPlayScreen(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_r = 0;
    }

    final void a(int param0, int param1, boolean param2) {
        this.field_r = 0;
        super.a(param0, 1, param2);
    }

    final void b(int param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        stackIn_3_0 = (this.c(-123, 0)) ? 0 : 1;
        var2 = stackIn_3_0;
        stackIn_6_0 = (this.c(-119, 2)) ? 2 : 1;
        var3 = stackIn_6_0;
        if (param0 > -35) {
          return;
        }
        if (!this.field_g.c((byte) 35)) {
          if (ke.field_a == 96) {
            if (var2 >= this.field_g.field_j) {
              this.field_g.a(false, var3);
            } else {
              this.field_g.a(false, this.field_g.field_j - 1);
            }
          }
          if (ke.field_a == 97) {
            if (this.field_g.field_j >= 0 &&
              this.field_g.field_j < var3) {
              this.field_g.a(false, this.field_g.field_j + 1);
            } else {
              this.field_g.a(false, var2);
            }
          }
          if ((ke.field_a == 98 ||
            ke.field_a == 99) && this.field_g.field_j == -1) {
            this.field_g.a(false, 1);
          }
        }
        this.field_g.b((byte) -71);
    }

    final static id a(byte param0, String[] param1) {
        id var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        id stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new id(false);
          var2.field_f = param1;
          var3 = 72 % ((-2 - param0) / 58);
          stackIn_1_0 = var2;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_4_0 = var2_ref;
          stackIn_4_1 = new StringBuilder().append("fk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final void b(boolean param0, boolean param1) {
        int var3 = 0;
        this.field_r = this.field_r + 1;
        if (param0) {
          this.a(-73, (byte) -53);
        }
        if (!param1 &&
          ln.field_m.length - 1 == this.field_r) {
          var3 = ke.field_a;
          ke.field_a = 96;
          this.field_g.a(84, 1);
          ke.field_a = var3;
        }
    }

    final int b(int param0, int param1) {
        int var3 = 14 / ((param0 + 13) / 37);
        return this.field_d;
    }

    final void a(byte param0, boolean param1, int param2) {
        if (1 != param2) {
          super.a((byte) 35, StripedProgressBar.field_W, param1, param2);
        } else {
          this.a(param1, true);
        }
        if (param0 > -116) {
          this.b(-71);
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != 90) {
          return 61;
        }
        return param0 * 180 + this.field_m;
    }

    final void e(byte param0) {
        super.e((byte) -107);
        if (this.field_r == 3) {
          SpriteState.field_u.a((byte) 21);
        }
        if (this.field_r == 7) {
          jf.field_c.b(300);
        }
        if (param0 > -64) {
          field_s = (Sprite[]) null;
        }
    }

    final int a(int param0, boolean param1) {
        if (param1) {
          this.field_r = 79;
        }
        return this.a(param0, (byte) 90) + 140;
    }

    final boolean c(int param0, int param1) {
        boolean stackIn_10_0 = false;
        if (param0 >= -112) {
          return false;
        }
        stackIn_10_0 = ((param1 != 0 ||
          this.field_r != 0) &&
          (2 != param1 ||
          this.field_r != -1 + ln.field_m.length));
        return stackIn_10_0;
    }

    final void a(int param0) {
        BackgroundScene var2;
        int var3;
        PaletteBitmapFont var4;
        BinaryBitmapFont var5;
        int var6;
        int var7;
        int var8_int;
        int var9_int;
        int var10_int;
        int var11;
        int var12;
        int var13;
        int stackIn_29_0 = 0;
        BackgroundScene[] stackIn_31_0 = null;
        int stackIn_32_1 = 0;
        Puzzle var8;
        PlayerBoard var9;
        BoardView var10;
        var13 = Pixelate.field_H ? 1 : 0;
        if (param0 != 11) {
          return;
        }
        var2 = LoginCredentials.field_e;
        var3 = DebouncedValidator.field_d;
        LoginCredentials.field_e = Js5NetworkRequest.field_C[0];
        DebouncedValidator.field_d = 0;
        NumericDateInputWidget.field_W[1].b(0, 45);
        this.d((byte) 59);
        this.b((byte) -71);
        var4 = rk.field_e;
        var5 = qj.field_e;
        var6 = var5.maxAscent + (var5.maxDescent + 1);
        var7 = 200;
        if (this.field_r != 0) {
          if (1 == this.field_r) {
            var7 = var7 + var5.drawParagraph(ln.field_m[this.field_r][0], 50, var7, 540, 400, 16777215, 0, 0, 0, var6) * var6;
            var8 = new Puzzle(3, 3, 0, 0, 0, 262144, 0, 0, new IndexedSprite[]{});
            var9 = new PlayerBoard(var8);
            var10 = new BoardView(var9, 320, 350);
            var10.a(0, 0, 0, (byte) -68, 0);
            var9.cells[8] = (byte)2;
            var9.cells[3] = (byte)2;
            var9.cells[2] = (byte) 1;
            var9.cells[7] = (byte) 1;
            SoftwareRasterizer.setClip(0, 0, 640, 389);
            var10.draw(false);
            SoftwareRasterizer.resetClip();
          } else {
            if (this.field_r != 2) {
              if (this.field_r == 3) {
                var7 = var7 + var6 * var5.drawParagraph(ln.field_m[this.field_r][0], 50, var7, 270, 400, 16777215, 0, 0, 0, var6);
                var7 += 10;
                var7 = var7 + var6 * var5.drawParagraph(ln.field_m[this.field_r][1], 50, var7, 540, 400, 16777215, 0, 0, 0, var6);
                SpriteState.field_u.c(2);
                for (var8_int = 3; 0 <= var8_int; var8_int--) {
                  stackIn_29_0 = (var8_int % 2 != 0) ? 0 : 20;
                  var9_int = stackIn_29_0;
                  stackIn_31_0 = Js5NetworkRequest.field_C;
                  if (var8_int >= 2) {
                    stackIn_32_1 = 3;
                  } else {
                    stackIn_32_1 = 2;
                  }
                  ((Sprite) (Object) stackIn_31_0[stackIn_32_1].field_f[var8_int % 2]).b(340 + 55 * var8_int, var9_int + 170);
                }
              } else {
                if (4 == this.field_r) {
                  var7 = var7 + var6 * var5.drawParagraph(ln.field_m[this.field_r][0], 260, var7, 270, 400, 16777215, 0, 0, 0, var6);
                  var7 += 10;
                  var7 = var7 + var6 * var5.drawParagraph(ln.field_m[this.field_r][1], 260, var7, 270, 400, 16777215, 0, 0, 0, var6);
                  for (var8_int = 0; var8_int < 8; var8_int++) {
                    Js5NetworkRequest.field_C[var8_int].field_a[1].f(280 + 30 * var8_int, 350);
                    Js5NetworkRequest.field_C[var8_int].field_a[0].f(var8_int * 30 + 270, 340);
                  }
                  ug.field_q.c((byte) 50);
                } else {
                  if (this.field_r == 5) {
                    var7 = var7 + var6 * var5.drawParagraph(ln.field_m[this.field_r][0], 50, var7 - 10, 380, 150, 16777215, 0, 0, 1, var6);
                    MatchingTextValidator.field_v.b(470, 160);
                  } else {
                    if (6 != this.field_r) {
                      if (this.field_r == 7) {
                        var7 += 10;
                        var7 = var7 + var6 * var5.drawParagraph(ln.field_m[this.field_r][0], 50, var7, 540, 150, 16777215, 0, 0, 0, var6);
                        var8_int = 70;
                        jf.field_c.a((byte) -8);
                        var4.drawText(ln.field_m[this.field_r][1], var8_int, 314, 0, -1);
                        var9_int = 2;
                        if (640 - var8_int > ProxyAuthenticationException.field_d &&
                          -var8_int + 640 - 170 < ProxyAuthenticationException.field_d &&
                          314 > StatusBar.field_k &&
                          StatusBar.field_k > 290) {
                          var9_int++;
                        }
                        var4.drawRightAlignedText(ln.field_m[this.field_r][var9_int], -var8_int + 640, 314, 0, -1);
                      }
                    } else {
                      var7 = var7 + var6 * var5.drawParagraph(ln.field_m[this.field_r][0], 50, var7, 540, 150, 16777215, 0, 0, 0, var6);
                      SoftwareRasterizer.setClip(0, 0, 640, 389);
                      PasswordValidator.field_r.draw(false);
                      an.field_b.draw(false);
                      DiskCacheRequest.field_H.c((byte) 119);
                      BoundedRandomAccessFile.field_g.a(55, 0, 0);
                      DialWidgetPainter.field_a.a(60, 0, 0);
                      SoftwareRasterizer.resetClip();
                    }
                  }
                }
              }
            } else {
              var8_int = 290;
              var9_int = 41;
              var10_int = 30;
              var11 = 50;
              var7 += 30;
              var4.drawRightAlignedText(ln.field_m[this.field_r][0], var8_int, var7 - 3, 0, -1);
              var5.drawCentered(ln.field_m[this.field_r][4], (var11 >> 1) + var8_int - (-var10_int - pk.field_c[0].field_A), -4 + var7, 16777215, 0);
              pk.field_c[0].b(var8_int + var10_int, -pk.field_c[0].field_B + var7);
              pk.field_c[1].b(var11 + var10_int + (var8_int + pk.field_c[0].field_A), var7 - pk.field_c[1].field_B);
              var7 = var7 + var9_int;
              var4.drawRightAlignedText(ln.field_m[this.field_r][1], var8_int, 2 + var7, 0, -1);
              var5.drawCentered(ln.field_m[this.field_r][4], (var11 >> 1) + (pk.field_c[0].field_A + var8_int) + var10_int, -4 + var7, 16777215, 0);
              CachedTextLayout.field_p[0].b(var10_int + var8_int, var7 - CachedTextLayout.field_p[0].field_B);
              CachedTextLayout.field_p[1].b(var11 + (var10_int + var8_int) + pk.field_c[0].field_A, -CachedTextLayout.field_p[1].field_B + var7);
              var7 = var7 + var9_int;
              var4.drawRightAlignedText(ln.field_m[this.field_r][2], var8_int, var7 + 2, 0, -1);
              CachedTextLayout.field_p[2].b(var8_int + var10_int, -CachedTextLayout.field_p[0].field_B + var7);
              var7 = var7 + var9_int;
              var4.drawRightAlignedText(ln.field_m[this.field_r][3], var8_int, 4 + var7, 0, -1);
              CachedTextLayout.field_p[3].b(var8_int + var10_int, -CachedTextLayout.field_p[0].field_B + var7);
              var12 = 6;
              Js5NetworkRequest.field_C[var12].field_f[0].b(70, 160);
              Js5NetworkRequest.field_C[var12].field_f[1].b(470, 300);
            }
          }
        } else {
          var7 = var7 + var5.drawParagraph(ln.field_m[this.field_r][0], 50, var7, 270, 400, 16777215, 0, 0, 0, var6) * var6;
          var7 += 10;
          var7 = var7 + var6 * var5.drawParagraph(ln.field_m[this.field_r][1], 50, var7, 270, 400, 16777215, 0, 0, 0, var6);
          SpriteState.field_C.draw(false);
          QuickChatMenu.field_Qb.a(50, 0, 0);
        }
        var4.drawCentered(pk.field_d[this.field_r], 320, 180, 0, -1);
        var5.drawRightAlignedText(mj.a(4067, this.field_r), 590, 375, 16777215, 0);
        DebouncedValidator.field_d = var3;
        LoginCredentials.field_e = var2;
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        this.field_r = this.field_r - 1;
        if (!param0 &&
          this.field_r == 0) {
          var3 = ke.field_a;
          ke.field_a = 97;
          this.field_g.a(param1 - 14, 1);
          ke.field_a = var3;
        }
        if (param1 != 97) {
          field_s = (Sprite[]) null;
        }
    }

    final void c(byte param0) {
        if (param0 >= -13) {
          this.b(-19);
        }
        la.a(this.field_l, TickClock.field_a, false, -25528);
    }

    static {
        field_q = "<%0>'s game";
        field_p = "Sound: ";
    }
}
