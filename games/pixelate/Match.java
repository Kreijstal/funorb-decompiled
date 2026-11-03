/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class Match {
    int[] scores;
    int field_f;
    private int field_c;
    int field_r;
    String[] playerNames;
    static String field_s;
    PlayerBoard[] boards;
    static boolean field_u;
    private int field_q;
    static Sprite[] field_l;
    int field_g;
    Puzzle puzzle;
    int field_o;
    int field_p;
    boolean field_t;
    static boolean field_e;
    boolean field_b;
    int field_j;
    int field_k;
    private int field_m;
    private int field_n;
    static Js5Transport field_h;

    public static void releaseStatics(int param0) {
        field_l = null;
        if (param0 != 0) {
          return;
        }
        field_s = null;
        field_h = null;
    }

    final static void a(int param0) {
        int var3 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_33_0 = null;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        boolean stackIn_39_2 = false;
        sb stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        sb var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          var1_int = MenuScreen.field_h;
          var2 = 0;
          if (2 == CanvasRasterBuffer.field_h) {
            var3_long = -pk.field_g + hm.a(64);
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          if (param0 >= -7) {
            return;
          }
          for (var3 = 0; vm.field_e.length > var3; var3++) {
            var4 = fo.field_a[var3];
            if (var4 >= 0) {
              if (var4 == mj.field_c.selectedIndex) {
                var5 = IndexedSpriteState.field_l;
              } else {
                var5 = ce.field_b;
              }
            } else {
              var5 = MatchingTextValidator.field_s;
            }
            var6 = vm.field_e[var3];
            if (CanvasRasterBuffer.field_h == 2 &&
              1 == var2) {
              if (jk.field_d.length <= df.field_r.length) {
                stackIn_19_0 = df.field_r.length;
              } else {
                stackIn_19_0 = jk.field_d.length;
              }
              var7 = stackIn_19_0;
              if (ContentTransitionDialog.field_jb.length <= GameModeSelectScreen.field_r.length) {
                stackIn_22_0 = GameModeSelectScreen.field_r.length;
              } else {
                stackIn_22_0 = ContentTransitionDialog.field_jb.length;
              }
              var8 = stackIn_22_0;
              if (var3 >= 6 &&
                var3 < 6 + var7) {
                if (0 <= var3 - (6 - df.field_r.length + var7)) {
                  stackIn_27_0 = df.field_r[df.field_r.length + (-6 + (var3 - var7))];
                } else {
                  stackIn_27_0 = "";
                }
                var6 = stackIn_27_0;
              }
              if (var3 >= 7 + var7 &&
                var3 < var8 + var7 + 7) {
                if (-var7 + (-7 + var3) < GameModeSelectScreen.field_r.length) {
                  stackIn_33_0 = GameModeSelectScreen.field_r[-var7 - 7 + var3];
                } else {
                  stackIn_33_0 = "";
                }
                var6 = stackIn_33_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            stackIn_38_0 = 3;
            stackIn_38_1 = var6;
            stackIn_39_2 = !(var4 < 0);
            var7Lifetime1 = sb.a(stackIn_38_0, stackIn_38_1, stackIn_39_2);
            var8Lifetime1 = QuickChatCategory.field_u - (var7Lifetime1 >> 1);
            if (var4 >= 0) {
              if (var4 == mj.field_c.selectedIndex) {
                stackIn_44_0 = MarkerSlider.field_N;
              } else {
                stackIn_44_0 = AudioService.field_e;
              }
              var9 = stackIn_44_0;
              var1_int = var1_int + LoadingProgressDialog.field_fb;
              if (var9 != null) {
                var9.a(var1_int, ValidatedTextWidget.field_fb + (bd.field_c << 1), -1, var7Lifetime1 + (AccountTermsPanel.field_J << 1), -AccountTermsPanel.field_J + var8Lifetime1);
              }
              var1_int = var1_int + bd.field_c;
            }
            if (var4 < 0) {
              StatusBar.field_j.drawText(var6, var8Lifetime1, var1_int + MatchController.field_i, var5, -1);
              var1_int = var1_int + GameResultsScreen.field_r;
            } else {
              ScoreMarkerBar.field_y.drawText(var6, var8Lifetime1, var1_int + TimerBar.field_q, var5, -1);
              var1_int = var1_int + (ValidatedTextWidget.field_fb + (bd.field_c + LoadingProgressDialog.field_fb));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) ((Object) var1), "pm.F(" + param0 + ')');
        }
    }

    final boolean startNextPicture(int param0) {
        int var2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        for (var2 = param0; this.boards.length > var2; var2++) {
          this.boards[var2].clear(-98);
        }
        return this.puzzle.advancePicture((byte) -117);
    }

    final void readState(PacketBuffer param0, byte param1) {
        try {
          this.field_q = param0.readInt(0);
          this.scores[0] = param0.readUnsignedShort((byte) -118);
          this.scores[1] = param0.readUnsignedShort((byte) -111);
          this.puzzle.pictureIndex = param0.readUnsignedByte(255);
          this.boards[0].seedPieces(-25, this.field_q);
          this.boards[1].seedPieces(-47, this.field_q);
          this.boards[0].readState(-2, param0);
          this.boards[1].readState(-2, param0);
          if (param1 <= 78) {
            this.field_j = -84;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "pm.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void advanceRound(int param0) {
        int var3 = 0;
        PlayerBoard var4 = null;
        int var5 = Pixelate.field_H ? 1 : 0;
        this.field_q = this.field_q + 1;
        PlayerBoard[] var6 = this.boards;
        PlayerBoard[] var2 = var6;
        for (var3 = param0; var6.length > var3; var3++) {
          var4 = var6[var3];
          var4.seedPieces(param0 - 124, this.field_q);
          var4.spawnPiece(-113);
        }
    }

    final boolean applyAction(int param0, int param1, int param2, int param3) {
        PlayerBoard stackIn_50_0 = null;
        int stackIn_51_1 = 0;
        int var6;
        IndexedSprite var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        PlayerBoard var15;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var14 = Pixelate.field_H ? 1 : 0;
        if (!this.field_t && (param1 >= 0 ||
          param1 < this.field_m)) {
          var15 = this.boards[param1];
          var6 = var15.applyAction(param0, (byte) -91) ? 1 : 0;
          if (param2 <= 25) {
            Match.a((byte) -67, (String) null, -41L);
          }
          if (var6 != 0) {
            var15.field_b = param3;
          }
          if (5 == param0) {
            var7 = this.puzzle.pictures[this.puzzle.pictureIndex];
            this.field_b = true;
            this.field_o = 0;
            this.field_f = this.field_f + 1;
            for (var8 = 0; var8 < this.puzzle.rows; var8++) {
              for (var9 = 0; var9 < this.puzzle.columns; var9++) {
                var10 = var8 * this.puzzle.columns + var9;
                var11 = var9 + 1 + (2 + this.puzzle.columns) * (var8 + 1);
                var12 = this.puzzle.columns - var9 - 1 + var8 * this.puzzle.columns;
                var13 = var15.cells[var11] & 3;
                if (~var13 == ~(255 & var7.indices[var10])) {
                  var15.cells[var11] = (byte)bq.a((int) var15.cells[var11], 4);
                } else {
                  var15.cells[var11] = (byte)cm.a((int) var15.cells[var11], -5);
                  if (0 != var13) {
                    this.field_o = this.field_o + 1;
                  }
                }
                if ((255 & var7.indices[var12]) != var13) {
                  this.field_b = false;
                }
              }
            }
            var8Lifetime1 = 0;
            for (var9Lifetime1 = var15.pieceColumn; 2 + var15.pieceColumn > var9Lifetime1; var9Lifetime1++) {
              for (var10Lifetime1 = var15.pieceRow; var10Lifetime1 < var15.pieceRow + 2; var10Lifetime1++) {
                if (0 != var9Lifetime1 &&
                  var10Lifetime1 != 0 &&
                  var15.paddedWidth - 1 != var9Lifetime1 &&
                  var10Lifetime1 != var15.paddedHeight - 1) {
                  var11Lifetime1 = var9Lifetime1 + var15.paddedWidth * var10Lifetime1;
                  if ((4 & var15.cells[var11Lifetime1]) > 0) {
                    var8Lifetime1++;
                  } else {
                    var15.field_k = true;
                  }
                }
              }
            }
            stackIn_50_0 = var15;
            if (var8Lifetime1 < 4) {
              stackIn_51_1 = var8Lifetime1 * 10;
            } else {
              stackIn_51_1 = 50;
            }
            stackIn_50_0.field_f = stackIn_51_1;
            if (2 == DateOfBirthValidator.field_j ||
              0 == DateOfBirthValidator.field_j &&
              0 < this.field_r) {
              this.scores[param1] = this.scores[param1] + var15.field_f;
            }
          }
          return var6 != 0;
        }
        return false;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        var5 = Pixelate.field_H ? 1 : 0;
        if (param2 != 0) {
          throw new IllegalStateException();
        }
        this.field_r = param1;
        this.puzzle = bj.a(this.field_r, -89);
        for (var4 = param0; var4 < this.boards.length; var4++) {
          if (null != this.boards[var4]) {
            this.boards[var4] = new PlayerBoard(this.puzzle);
          }
        }
        this.puzzle.pictureIndex = 0;
    }

    final static void a(int param0, int param1, IndexedSprite[] param2) {
        try {
          if (param0 != 13728) {
            field_l = (Sprite[]) null;
          }
          up.field_d[param1] = new Puzzle(param2[0].field_g, param2[0].field_d, up.field_c[param1], up.field_k[param1], up.field_f[param1], up.field_p[param1], up.field_e[param1], up.field_i[param1], param2);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "pm.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1) {
        this.field_j = param1;
        this.field_t = true;
        if (param0) {
          this.field_q = -37;
        }
    }

    final static void a(byte param0, String param1, long param2) {
        CharSequence var5 = null;
        try {
          CheckboxPainter.field_k = param1;
          ce.field_d = 2;
          var5 = (CharSequence) ((Object) param1);
          fp.field_d = dh.a(var5, (byte) 38);
          if (param0 < 32) {
            field_s = (String) null;
          }
          oo.field_d = true;
          fp.field_e = param2;
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "pm.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    Match(String[] param0, int param1, int param2, int param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        Random var9 = null;
        try {
          this.playerNames = param0;
          this.field_r = param1;
          this.field_m = param0.length;
          this.field_c = param3;
          this.field_n = param4;
          this.scores = new int[this.field_m];
          this.boards = new PlayerBoard[this.field_m];
          this.field_g = param5;
          this.field_q = this.field_c + 1;
          if (param2 == 0) {
            this.puzzle = bj.a(this.field_r, -121);
          }
          if (1 == param2) {
            this.puzzle = un.field_j.b(-3060);
          }
          if (param2 == 2) {
            var9 = new Random((long)this.field_c);
            this.puzzle = wo.a(this.field_r, cl.field_e[this.field_n], var9, (byte) 116);
            this.puzzle.field_e = 1000;
            JavaRandomHelpers.a(var9, -98, 2147483647);
          }
          for (var7_int = 0; this.field_m > var7_int; var7_int++) {
            this.boards[var7_int] = new PlayerBoard(this.puzzle);
          }
          this.puzzle.pictureIndex = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_14_0 = var7;
          stackIn_14_1 = new StringBuilder().append("pm.<init>(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_u = false;
        field_e = true;
    }
}
