/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class MatchController {
    private boolean field_u;
    private int field_w;
    private int field_n;
    static String field_v;
    static int field_t;
    static String field_b;
    private int field_x;
    static String field_B;
    private boolean field_h;
    static int field_i;
    private StatusBar field_j;
    private boolean field_f;
    private boolean field_m;
    static String field_c;
    static int field_q;
    static String[] field_y;
    private PictureStrip field_A;
    private boolean field_s;
    static String field_k;
    private boolean field_l;
    static IndexedSprite[] field_p;
    private boolean field_r;
    int field_z;
    int field_o;
    private boolean field_g;
    private MatchHud field_e;
    private PlayerController[] field_d;
    Match field_a;

    private final void resolveMultiplayerPicture(int param0, byte param1) {
        int var7 = 0;
        PlayerController var8 = null;
        int var9 = Pixelate.field_H ? 1 : 0;
        int var3 = 6 / ((-71 - param1) / 40);
        this.field_a.boards[param0].loadPicture(this.field_a.puzzle.pictures[this.field_a.puzzle.pictureIndex], -99);
        this.field_a.boards[-param0 + 1].loadCells(0, QueuedInput.field_l);
        this.field_a.boards[-param0 + 1].pieceColumn = bl.field_b;
        this.field_a.boards[1 - param0].pieceRow = ResizableModalPanel.field_V;
        int var4 = jk.field_c - this.field_a.scores[param0];
        int var5 = UiComponent.field_u - this.field_a.scores[-param0 + 1];
        if (0 < var4) {
          this.field_d[param0].a(-20791, var4, false);
        }
        if (var5 > 0) {
          this.field_d[-param0 + 1].a(-20791, var5, false);
        }
        this.field_a.scores[param0] = jk.field_c;
        this.field_a.scores[-param0 + 1] = UiComponent.field_u;
        PlayerController[] var6 = this.field_d;
        for (var7 = 0; var6.length > var7; var7++) {
          var8 = var6[var7];
          var8.d(93);
          var8.field_l = true;
        }
        if (this.field_a.startNextPicture(0)) {
          this.field_r = false;
        } else {
          this.field_r = true;
        }
        this.field_d[param0].field_c = false;
        gq.a(0, 200, 320, AlphaContainer.a(TextButton.field_G, 35, new String[]{this.field_a.playerNames[param0]}));
    }

    private final void advanceChallengePicture(int param0) {
        int var3 = 0;
        PlayerController[] var2;
        PlayerController var4;
        int var5;
        PlayerController[] var6;
        var5 = Pixelate.field_H ? 1 : 0;
        if (this.field_a.field_r > 0 &&
          !this.field_s &&
          !this.field_a.puzzle.field_i) {
          this.awardAchievement(16, (byte) 58, 239);
        }
        if (0 < this.field_w) {
          if (this.field_a.field_r == 5) {
            this.awardAchievement(11, (byte) 58, 244);
          }
          if (10 == this.field_a.field_r) {
            this.awardAchievement(17, (byte) 58, 238);
          }
        }
        this.field_s = false;
        if (9 == this.field_a.field_r &&
          BufferedRandomAccessFile.field_j <= 0) {
          this.showResults(true, 250, false);
          return;
        }
        this.field_a.puzzle.pictureIndex = this.field_a.puzzle.pictures.length;
        int fieldTemp$0 = this.field_a.field_r + 1;
        this.field_a.field_r = this.field_a.field_r + 1;
        this.field_a.a(0, fieldTemp$0, DateOfBirthValidator.field_j);
        this.field_f = true;
        var6 = this.field_d;
        var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          var4.beginPicture(2406);
        }
        if (param0 <= 12) {
          this.field_w = 103;
        }
        DialWidgetPainter.field_o = DialWidgetPainter.field_o + 1;
        if (this.field_a.field_r == 30) {
          this.awardAchievement(4, (byte) 58, 251);
        }
        if (40 == this.field_a.field_r) {
          this.awardAchievement(5, (byte) 58, 250);
        }
        if (50 == this.field_a.field_r) {
          this.awardAchievement(6, (byte) 58, 249);
        }
    }

    final void showResults(boolean param0, int param1, boolean param2) {
        GameResultsScreen stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        boolean stackIn_6_3 = false;
        boolean stackIn_8_4;
        boolean stackIn_8_5;
        boolean stackIn_9_6;
        GameResultsScreen stackIn_21_0 = null;
        boolean stackIn_22_1 = false;
        Object var5;
        int var5_int;
        int var6;
        GameResultsScreen var7;
        GameResultsScreen var8;
        var6 = Pixelate.field_H ? 1 : 0;
        if (this.field_g) {
          return;
        }
        this.field_g = true;
        var7 = (GameResultsScreen) (wo.getScreen(-119, 13));
        var8 = var7;
        if (0 != DateOfBirthValidator.field_j) {
          if (DateOfBirthValidator.field_j != 1) {
            if (2 == DateOfBirthValidator.field_j) {
              var5 = null;
              if (this.field_a.field_j >= 0) {
                var5 = this.field_a.playerNames[this.field_a.field_j];
              }
              var8.showMultiplayerResults((String) (var5), -10, this.field_a);
            }
          } else {
            var5_int = un.field_j.field_e;
            if (un.field_j.field_n) {
              var5_int++;
            }
            if (50 <= var5_int) {
              var5_int = -1;
            }
            if (0 >= BufferedRandomAccessFile.field_j &&
              var5_int >= 10) {
              var5_int = -1;
            }
            stackIn_21_0 = var8;
            stackIn_22_1 = (EmailCredentials.field_k == 0) ? false : true;
            ((GameResultsScreen) (Object) stackIn_21_0).a(stackIn_22_1, un.field_j.field_n, gb.field_f[1], gb.field_f[0], (byte) 34, var5_int, un.field_j.a((byte) -117));
          }
        } else {
          this.j(17945);
          stackIn_5_0 = var7;
          stackIn_5_1 = gb.field_f[0];
          stackIn_5_2 = gb.field_f[1];
          stackIn_6_3 = (HighscoresScreen.field_p == null) ? false : true;
          stackIn_8_4 = param0;
          stackIn_8_5 = ArrayWidgetContainer.a((byte) 85);
          stackIn_9_6 = (EmailCredentials.field_k == 0) ? false : true;
          ((GameResultsScreen) (Object) stackIn_5_0).showSinglePlayerResults(stackIn_5_1, stackIn_5_2, stackIn_6_3, stackIn_8_4, stackIn_8_5, stackIn_9_6, gb.field_f[3], 2, gb.field_f[2], this.field_a.scores[0]);
        }
        if (DateOfBirthValidator.field_j != 1) {
          dg.a(1, (byte) -97);
        }
        if (param1 != 250) {
          this.field_h = false;
        }
        la.changeScreen(MidiPcmStream.field_t, 13, false, -25528);
        return;
    }

    final void awardAchievement(int param0, byte param1, int param2) {
        boolean discarded$0 = false;
        int var4 = 1 << param0;
        if ((MenuScreen.field_n & var4) != 0) {
          return;
        }
        MenuScreen.field_n = MenuScreen.field_n | var4;
        EmailCredentials.field_k = EmailCredentials.field_k | var4;
        if (param1 != 58) {
          discarded$0 = this.a(-117, 64);
        }
        AccountRegistrationPanel.field_Y.addFirst(22125, new ph(param0));
        if (!this.field_l) {
          DualLinkDeque.field_h.addFirst(param1 ^ 22103, new hf(param0, param2, sb.field_a, DialWidgetPainter.field_o, IntKeyLookup.field_f, IconTextComponent.field_Mb));
        }
    }

    private final void tickMultiplayer(int param0) {
        int var4 = 0;
        PlayerController stackIn_3_0 = null;
        PlayerController var2;
        int var3;
        int var5;
        PlayerController var6;
        var5 = Pixelate.field_H ? 1 : 0;
        if (!this.a(param0 + 14099, this.field_z)) {
          stackIn_3_0 = this.field_d[0];
        } else {
          stackIn_3_0 = this.field_d[this.field_z];
        }
        var6 = stackIn_3_0;
        var2 = var6;
        ((ScoreMarkerBar) (this.field_j)).a(12804, false);
        if (0 == NameAvailabilityValidator.field_t &&
          this.field_n > 0) {
          this.field_n = this.field_n - 1;
          this.field_e.a((byte) -87, this.field_n);
        }
        if (this.field_r &&
          this.field_n == 0 &&
          !var6.i(param0 ^ 121)) {
          this.field_r = false;
          this.field_e.b(param0 ^ -431);
          aa.field_f.writeOpcode(64, 15514);
        }
        if (this.field_u &&
          this.field_x > 0) {
          this.field_x = this.field_x - 1;
        }
        var3 = param0;
        for (var4 = 0; this.field_d.length > var4; var4++) {
          this.field_d[var4].tick(param0 ^ 0);
          if (this.field_d[var4].field_c) {
            var3 = var4;
          }
          if (this.field_a.boards[var4].field_f > 0) {
            if (this.field_a.boards[var4].field_f == 50) {
              this.field_d[var4].a(-20791, 50, true);
            }
            this.field_a.boards[var4].field_f = 0;
          }
        }
        if (var3 != -1) {
          this.resolveMultiplayerPicture(var3, (byte) -119);
        }
    }

    final void queueRemoteInput(int param0, int param1, int param2, int param3) {
        if (2 != DateOfBirthValidator.field_j) {
          throw new IllegalStateException();
        }
        int var5 = -122 % ((param3 + 11) / 49);
        if (!this.a(14098, param0)) {
          return;
        }
        if (this.field_d[param0].field_o) {
          this.field_d[param0].enqueueInput(6364, param1, param2);
        }
    }

    private final void a(boolean param0) {
        this.field_a.a(false, nf.field_a);
        this.field_a.scores[1] = fo.field_g;
        this.field_a.scores[0] = IndexedSpriteState.field_k;
        this.showResults(false, 250, false);
        if (!param0) {
          this.render(true, -55);
        }
    }

    final void e(int param0) {
        if (param0 != 6) {
          this.tickChallenge((byte) 108);
        }
        if (!AgeValidator.field_p) {
          throw new IllegalStateException();
        }
        aa.field_f.writeOpcode(60, 15514);
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        boolean decompiledFrameRemainder0 = true;
        if (this.field_z != -2 && (this.field_z == param1 ||
          (1 << this.field_z & this.field_a.field_k) != 0)) {
          this.field_x = 1;
          decompiledFrameRemainder0 = false;
        }
        else {
          this.field_x = 50;
        }
        IndexedSpriteState.field_k = param0;
        this.field_u = true;
        if (param3) {
          this.a(true);
        }
        fo.field_g = param2;
        nf.field_a = param1;
    }

    final static boolean a(byte param0, char param1) {
        boolean stackIn_9_0 = false;
        if (param0 < 115) {
          field_q = 92;
        }
        stackIn_9_0 = (param1 == 160) || (param1 == 32) || (param1 == 95) || (param1 == 45);
        return stackIn_9_0;
    }

    final void g(int param0) {
        if (!AgeValidator.field_p) {
          throw new IllegalStateException();
        }
        aa.field_f.writeOpcode(61, 15514);
        if (param0 <= 2) {
          this.field_w = 3;
        }
    }

    final static fl execute(byte param0, String param1) {
        RuntimeException var2 = null;
        fl stackIn_2_0 = null;
        fl stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 118) {
            stackIn_4_0 = new fl(param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = (fl) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ii.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void drawThreeSliceBar(int param0, int param1, int param2, int param3, Sprite[] param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          if (param4 != null &&
            param0 > 0) {
            var5_int = param4[0].field_A;
            var6 = param4[2].field_A;
            var7 = param4[1].field_A;
            param4[0].drawTransparent(param3, param1);
            param4[2].drawTransparent(-var6 + param0 + param3, param1);
            SoftwareRasterizer.saveClip(Matrix3.field_c);
            SoftwareRasterizer.intersectClip(param3 + var5_int, param1, param0 + param3 - var6, param1 + param4[1].field_B);
            var8 = var5_int + param3;
            var9 = param3 + param0 - var6;
            param3 = var8;
            if (param2 != 19571) {
              field_i = 19;
            }
            while (var9 > param3) {
              param4[1].drawTransparent(param3, param1);
              param3 = param3 + var7;
            }
            SoftwareRasterizer.restoreClip(Matrix3.field_c);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ii.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void tick(int param0, boolean param1) {
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        if (param1 &&
          this.field_u &&
          this.field_x == 0 &&
          !this.field_d[0].i(-121)) {
          this.a(true);
          return;
        }
        gb.field_f[0] = gb.field_f[0] + 1;
        if (param1) {
          this.i(114);
        }
        this.updateFastDrop((byte) 34, param1);
        if (DateOfBirthValidator.field_j == 0) {
          this.tickChallenge((byte) 41);
        } else {
          if (DateOfBirthValidator.field_j != 1) {
            if (DateOfBirthValidator.field_j == 2) {
              this.tickMultiplayer(-1);
            }
          } else {
            this.tickPuzzleMode(param0 + 228);
          }
        }
        if (this.a(14098, this.field_z) &&
          this.field_h &&
          0 == this.field_d[this.field_z].field_p) {
          this.field_h = false;
          this.handleKey(82, (byte) 123);
        }
        LoginCredentials.field_e.c(param0 + 109);
        ih.a(false);
        if (param0 != -110) {
          this.field_A = (PictureStrip) null;
        }
        SocketJs5Transport.c(0);
        this.field_e.a(-82);
        this.field_A.updateScroll(param0 - 16778);
    }

    private final void j(int param0) {
        int var2 = this.field_a.scores[0];
        if (null == HighscoresScreen.field_p &&
          var2 > 0 &&
          !this.field_l) {
          HighscoresScreen.field_p = new rh(0, 65535, ln.field_n, mj.field_j, ra.field_a, PlayerController.field_r, new int[]{var2});
          if (!ArrayWidgetContainer.a((byte) 120)) {
            ValidationHelpWidget.a(HighscoresScreen.field_p, true, 3);
          }
        }
        if (param0 != 17945) {
          this.field_f = false;
        }
    }

    final void applyRemoteBoardState(int param0, int param1, int param2, int param3, byte param4, int param5, byte[] param6) {
        try {
          if (this.field_z != param2) {
            this.field_d[param2].enqueueInput(6364, 8, param3);
          } else {
            this.field_d[param2].applyInput(0, 8);
          }
          ResizableModalPanel.field_V = 15 & param0;
          UiComponent.field_u = param1;
          bl.field_b = param0 >> 4;
          if (param4 <= 23) {
            this.tickPuzzleMode(44);
          }
          QueuedInput.field_l = param6;
          jk.field_c = param5;
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "ii.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void render(boolean param0, int param1) {
        try {
          int var11 = 0;
          Exception exception = null;
          PlayerController[] var3_ref_uh__ = null;
          int var4 = 0;
          PlayerController var5_ref_uh = null;
          int var15 = 0;
          PlayerController[] var16 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          long var3 = 0L;
          long var5_long = 0L;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          Class var8 = null;
          java.lang.reflect.Field[] var9 = null;
          java.lang.reflect.Field[] var10 = null;
          java.lang.reflect.Field var12 = null;
          Thread var13 = null;
          String var14 = null;
          Exception var14_ref = null;
          BinaryBitmapFont var17 = null;
          var15 = Pixelate.field_H ? 1 : 0;
          try {
            LoginCredentials.field_e.a(false);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
            exception.printStackTrace();
          }
          if (fq.field_o != null &&
            SpriteCheckboxPainter.field_d) {
            pe.field_b.makeRasterTarget();
            SoftwareRasterizer.clear();
            fq.field_o.a(false);
            ClientException.field_f.bindRaster(19692);
            pe.field_b.drawAlpha(0, 0, DebouncedValidator.field_d);
          }
          if (Match.field_u) {
            return;
          }
          this.field_A.draw((byte) 104);
          var16 = this.field_d;
          var3_ref_uh__ = var16;
          for (var4 = param1; var4 < var16.length; var4++) {
            var5_ref_uh = var16[var4];
            var5_ref_uh.b(-1);
          }
          if (DateOfBirthValidator.field_j == 0) {
            MusicCrossfadeStream.f(91);
            this.field_j.c(param1 + 2);
            if (param0) {
              rm.a(0);
            }
            LoginCredentials.field_e.a((byte) -119);
            if (null != fq.field_o) {
              fq.field_o.a((byte) -108);
            }
          } else {
            if (DateOfBirthValidator.field_j != 1) {
              if (DateOfBirthValidator.field_j == 2) {
                MusicCrossfadeStream.f(68);
              }
            } else {
              un.field_j.f(param1 ^ 550);
            }
          }
          if (param0) {
            this.field_e.a((byte) 9);
          }
          if (DateOfBirthValidator.field_j == 2) {
            this.field_j.c(2);
          }
          if (MenuInputState.field_e &&
            cm.field_m) {
            rk.field_e.drawText(Integer.toString(BoardView.field_k), 30, 100, 1, -1);
          }
          if (ModalPanel.field_K) {
            var3 = Runtime.getRuntime().totalMemory();
            var5_long = Runtime.getRuntime().freeMemory();
            rk.field_e.drawRightAlignedText((var3 - var5_long) / 1024L + " kB / " + var3 / 1024L + " kB", 610, 100, 0, 0);
          }
          if (li.field_e) {
            var17 = qj.field_e;
            var4 = var17.maxDescent + var17.maxAscent;
            var5 = 30;
            var6 = var4 + 15;
            var7 = var5 + 110;
            var8 = this.field_a.getClass();
            var9 = var8.getFields();
            SoftwareRasterizer.fillRectangleAlpha(var5 - 5, -5 + var6 - var4, 70 + var7 - var5, var4 * var9.length, 0, 190);
            var10 = var9;
            for (var11 = 0; var11 < var10.length; var11++) {
              var12 = var10[var11];
              if (!var12.getType().isArray()) {
                var13 = Thread.currentThread();
                var13.setName(var12.getName());
                var17.drawRightAlignedText(var13.getName(), var7, var6, 16777215, 0);
                try {
                  var13.setName(var12.get(this.field_a).toString());
                  var14 = var13.getName();
                  if (var14 != null) {
                    var17.drawText(var14, var7 + 15, var6, 16777215, 0);
                    decompiledRegionSelector0 = 1;
                  } else {
                    var6 = var6 + var4;
                    decompiledRegionSelector0 = 0;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var14_ref = (Exception) (Object) decompiledCaughtException;
                  decompiledRegionSelector0 = 1;
                }
                if (decompiledRegionSelector0 != 0) {
                  var6 = var6 + var4;
                }
              }
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void updateFastDrop(byte param0, boolean param1) {
        int var3;
        int stackIn_11_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_14_1 = 0;
        if (param0 != 34) {
          this.field_x = 112;
        }
        if (this.a(14098, this.field_z)) {
          if (!this.field_d[this.field_z].field_l) {
            if (param1) {
              stackIn_11_0 = (EmailValidator.field_m[83]) ? 1 : 0;
            } else {
              stackIn_11_0 = 0;
            }
          } else {
            stackIn_11_0 = 0;
          }
          var3 = stackIn_11_0;
          stackIn_13_0 = this.field_a.boards[this.field_z].fastDrop;
          if (var3 != 0) {
            stackIn_14_1 = 0;
          } else {
            stackIn_14_1 = 1;
          }
          if ((stackIn_13_0 ? 1 : 0) == stackIn_14_1) {
            if (var3 != 0) {
              this.field_d[this.field_z].applyInput(param0 ^ 34, 6);
              if (AgeValidator.field_p) {
                Vector3.a(6, -18656, this.field_d[this.field_z].a(-119));
              }
            } else {
              this.field_d[this.field_z].applyInput(param0 - 34, 7);
              if (AgeValidator.field_p) {
                Vector3.a(7, -18656, this.field_d[this.field_z].a(-84));
              }
            }
          }
        }
    }

    final static boolean isSupportedChar(int param0, char param1) {
        if (param1 >= 32 &&
          param1 <= 126) {
          return true;
        }
        if (param1 >= 160 &&
          param1 <= 255) {
          return true;
        }
        if (8364 != param1 &&
          param1 != 338 &&
          param1 != 8212 &&
          339 != param1 &&
          376 != param1) {
          if (param0 == 1) {
            return false;
          }
          field_t = -29;
          return false;
        }
        return true;
    }

    final void handleKey(int param0, byte param1) {
        int stackIn_10_0 = 0;
        boolean stackIn_17_0 = false;
        boolean stackIn_21_0 = false;
        boolean stackIn_38_0 = false;
        boolean stackIn_53_0 = false;
        boolean stackIn_57_0 = false;
        int stackIn_96_0 = 0;
        int var3;
        PlayerController[] var4_ref_uh__;
        int var4;
        int var5;
        PlayerController var6;
        int var7;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        var7 = Pixelate.field_H ? 1 : 0;
        var3 = 100 / ((param1 - 25) / 58);
        if (param0 == 13) {
          var4 = 1;
          if (AgeValidator.field_p) {
            if (this.field_z >= 0) {
              if (this.field_a.field_t) {
                return;
              }
              var4 = 2;
            } else {
              var4 = 4;
            }
          }
          var5 = var4;
          stackIn_10_0 = (!gq.d(83)) ? 0 : 12;
          la.changeScreen(stackIn_10_0, var5, false, -25528);
          return;
        }
        if (MenuInputState.field_e) {
          if (param0 != 85) {
            if (1 != param0) {
              if (param0 != 2) {
                if (param0 == 3) {
                  HighscoresScreen.selectBackground(61, 2);
                } else {
                  if (param0 == 4) {
                    HighscoresScreen.selectBackground(-41, 3);
                  } else {
                    if (param0 == 5) {
                      HighscoresScreen.selectBackground(60, 4);
                    } else {
                      if (param0 == 6) {
                        HighscoresScreen.selectBackground(-111, 5);
                      } else {
                        if (param0 == 7) {
                          HighscoresScreen.selectBackground(123, 6);
                        } else {
                          if (param0 != 8) {
                            if (9 == param0) {
                              stackIn_57_0 = !(li.field_e);
                              li.field_e = stackIn_57_0;
                            } else {
                              if (11 != param0) {
                                if (12 == param0) {
                                  stackIn_53_0 = !(SpriteCheckboxPainter.field_d);
                                  SpriteCheckboxPainter.field_d = stackIn_53_0;
                                } else {
                                  if (param0 == 102) {
                                    if (EmailValidator.field_m[81] &&
                                      DateOfBirthValidator.field_j == 0) {
                                      this.advanceChallengePicture(125);
                                      this.startNextRound(-59);
                                    } else {
                                      if (!EmailValidator.field_m[81]) {
                                        var4_ref_uh__ = this.field_d;
                                        for (var5Lifetime1 = 0; var5Lifetime1 < var4_ref_uh__.length; var5Lifetime1++) {
                                          var6 = var4_ref_uh__[var5Lifetime1];
                                          var6.d(93);
                                        }
                                        this.field_a.puzzle.advancePicture((byte) -125);
                                        if (this.field_a.puzzle.pictures.length == this.field_a.puzzle.pictureIndex) {
                                          this.advanceChallengePicture(80);
                                          this.startNextRound(-105);
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                stackIn_38_0 = !(ByteStorage.field_b);
                                ByteStorage.field_b = stackIn_38_0;
                              }
                            }
                          } else {
                            HighscoresScreen.selectBackground(51, 7);
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                HighscoresScreen.selectBackground(104, 1);
              }
            } else {
              HighscoresScreen.selectBackground(-42, 0);
            }
          } else {
            if (EmailValidator.field_m[81]) {
              stackIn_21_0 = !(ModalPanel.field_K);
              ModalPanel.field_K = stackIn_21_0;
            } else {
              stackIn_17_0 = !(cm.field_m);
              cm.field_m = stackIn_17_0;
            }
          }
        }
        if (this.a(14098, this.field_z)) {
          var4Lifetime1 = -1;
          if (82 == param0 ||
            IntKeyLookup.field_e == param0) {
            var4Lifetime1 = 4;
          }
          if (param0 == 98 ||
            param0 == el.field_a) {
            var4Lifetime1 = 0;
          }
          if (param0 == 99 ||
            param0 == Vector3.field_d) {
            var4Lifetime1 = 1;
          }
          if (param0 == 96 ||
            DiskCacheRequest.field_F == param0) {
            var4Lifetime1 = 2;
          }
          if (97 == param0 ||
            MarkerSliderPainter.field_g == param0) {
            var4Lifetime1 = 3;
          }
          if (84 == param0) {
            if (this.field_a.field_r == 0 &&
              0 == DateOfBirthValidator.field_j) {
              this.advanceChallengePicture(65);
              this.startNextRound(-40);
              this.field_a.field_f = 0;
              this.field_a.field_b = false;
              this.field_a.field_o = 0;
            }
            jd.a(0);
          }
          if (var4Lifetime1 != -1 &&
            !this.field_d[this.field_z].field_l) {
            stackIn_96_0 = (!this.field_d[this.field_z].applyInput(0, var4Lifetime1)) ? 0 : 1;
            var5Lifetime2 = stackIn_96_0;
            if (AgeValidator.field_p &&
              var5Lifetime2 != 0) {
              Vector3.a(var4Lifetime1, -18656, this.field_d[this.field_z].a(-110));
            }
            if (var4Lifetime1 == 4 &&
              var5Lifetime2 == 0 &&
              this.field_d[this.field_z].field_p > 0) {
              this.field_h = true;
            }
          }
        }
    }

    private final boolean a(int param0, int param1) {
        boolean stackIn_7_0 = false;
        if (param0 != 14098) {
          return false;
        }
        stackIn_7_0 = (param1 == 0) || (1 == param1);
        return stackIn_7_0;
    }

    private final void tickPuzzleMode(int param0) {
        PlayerController var3 = this.field_d[this.field_z];
        var3.tick(-1);
        if (param0 <= 101) {
          this.field_o = -75;
        }
        un.field_j.d(27420);
        if (!un.field_j.field_f &&
          var3.field_l) {
          if (!this.field_l) {
            un.field_j.e(20604);
          }
          var3.d(93);
          this.field_a.boards[this.field_z].clear(-121);
          un.field_j.field_f = true;
          if ((33554431L & CheckboxPainter.field_h) == 33554431L) {
            this.awardAchievement(14, (byte) 58, 241);
          }
          if ((CheckboxPainter.field_h & 1125899906842623L) == 1125899906842623L) {
            this.awardAchievement(15, (byte) 58, 240);
          }
        }
        if ((un.field_j.field_f || un.field_j.field_h) &&
          !var3.i(-124)) {
          gb.field_f[1] = this.field_a.boards[0].piecesPlaced;
          this.showResults(false, 250, false);
        }
    }

    private final void i(int param0) {
        ra.field_a = ra.field_a + 7;
        IntKeyLookup.field_f = IntKeyLookup.field_f + sb.field_a;
        ln.field_n = ln.field_n + 7;
        IconTextComponent.field_Mb = IconTextComponent.field_Mb + 1;
        if (param0 <= 93) {
          this.tickPuzzleMode(-83);
        }
        if (this.field_j instanceof TimerBar) {
          if (MenuInputState.field_e &&
            EmailValidator.field_m[88]) {
            ((TimerBar) (this.field_j)).b(-123, true);
          }
          if (MenuInputState.field_e &&
            EmailValidator.field_m[87]) {
            ((TimerBar) (this.field_j)).b(-108, false);
          }
        }
    }

    final static void a(boolean param0, int param1, int param2, byte param3, String param4) {
        try {
          TimerBarDemo.field_q = param2;
          int var5_int = 55 / ((2 - param3) / 55);
          UiContainer.a(param0, param4, 5, param1, ab.field_c, 320, rk.field_e.maxAscent, 10, bi.field_g, true, rk.field_e, rk.field_e.maxDescent + rk.field_e.maxAscent, (byte) 27, 15, 240);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "ii.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static int c(int param0, byte param1) {
        if (param1 != -120) {
          field_b = (String) null;
        }
        return JavaRandomHelpers.a(SceneWidgetNode.field_v, -100, param0);
    }

    MatchController() {
        this((String[]) null, 0, false, JavaRandomHelpers.a(ea.field_b, -115, 2147483647), 0, 0, 0);
    }

    final void startNextRound(int param0) {
        PlayerController[] var2;
        int var3;
        PlayerController var4;
        int var5;
        PlayerController[] var6;
        int var7;
        int var3Lifetime1;
        PlayerController[] var2Lifetime1;
        PlayerController var4Lifetime1;
        var5 = Pixelate.field_H ? 1 : 0;
        if (AgeValidator.field_p) {
          var6 = this.field_d;
          var2 = var6;
          for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            if (!var4.field_l) {
              var4.drainInputQueue(false);
            }
          }
          this.tickMultiplayer(-1);
        }
        this.field_a.advanceRound(0);
        var2Lifetime1 = this.field_d;
        var7 = 0;
        var3Lifetime1 = var7;
        while (var2Lifetime1.length > var7) {
          var4Lifetime1 = var2Lifetime1[var7];
          var4Lifetime1.j(-125);
          var7++;
        }
        if (param0 > -1) {
          this.advanceChallengePicture(-56);
        }
    }

    public static void releaseStatics(byte param0) {
        field_k = null;
        field_y = null;
        field_c = null;
        field_p = null;
        field_b = null;
        field_v = null;
        if (param0 >= -93) {
          field_t = -60;
        }
        field_B = null;
    }

    private final void createControllers(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        PlayerController[] stackIn_15_0;
        int stackIn_15_1;
        PlayerController stackIn_15_2;
        PlayerController stackIn_15_3;
        Match stackIn_15_4;
        int stackIn_15_5;
        PlayerController stackIn_16_2 = null;
        PlayerController stackIn_16_3 = null;
        boolean stackIn_16_6 = false;
        PlayerController[] stackIn_18_0;
        int stackIn_18_1;
        PlayerController stackIn_18_2;
        PlayerController stackIn_18_3;
        Match stackIn_18_4;
        int stackIn_18_5;
        PlayerController stackIn_19_2 = null;
        PlayerController stackIn_19_3 = null;
        boolean stackIn_19_6 = false;
        Object stackIn_21_0;
        MatchHud stackIn_21_1;
        MatchHud stackIn_21_2;
        Match stackIn_21_3;
        int[] stackIn_21_4;
        int[] stackIn_21_5;
        Object stackIn_22_0;
        MatchHud stackIn_22_1;
        MatchHud stackIn_22_2;
        boolean stackIn_22_6;
        int var2;
        int var3;
        int var4;
        if (param0 <= 110) {
          field_t = 63;
        }
        if (AgeValidator.field_p) {
          this.field_d = new PlayerController[2];
          stackIn_7_0 = (this.field_z == 1) ? 500 : 140;
          var2 = stackIn_7_0;
          stackIn_10_0 = (this.field_z != 1) ? 500 : 140;
          var3 = stackIn_10_0;
          stackIn_13_0 = (DateOfBirthValidator.field_i) ? 100 : 0;
          var4 = stackIn_13_0;
          stackIn_15_0 = this.field_d;
          stackIn_15_1 = 0;
          stackIn_15_2 = null;
          stackIn_15_3 = null;
          stackIn_15_4 = this.field_a;
          stackIn_15_5 = 0;
          if (this.field_z == 0) {
            stackIn_16_2 = null;
            stackIn_16_3 = null;
            stackIn_16_6 = false;
          } else {
            stackIn_16_2 = null;
            stackIn_16_3 = null;
            stackIn_16_6 = true;
          }
          stackIn_15_0[stackIn_15_1] = new PlayerController(stackIn_15_4, stackIn_15_5, stackIn_16_6, this.field_a.puzzle, var2, -var4 + 235);
          stackIn_18_0 = this.field_d;
          stackIn_18_1 = 1;
          stackIn_18_2 = null;
          stackIn_18_3 = null;
          stackIn_18_4 = this.field_a;
          stackIn_18_5 = 1;
          if (1 == this.field_z) {
            stackIn_19_2 = null;
            stackIn_19_3 = null;
            stackIn_19_6 = false;
          } else {
            stackIn_19_2 = null;
            stackIn_19_3 = null;
            stackIn_19_6 = true;
          }
          stackIn_18_0[stackIn_18_1] = new PlayerController(stackIn_18_4, stackIn_18_5, stackIn_19_6, this.field_a.puzzle, var3, -var4 + 235);
          this.field_A = new PictureStrip(this.field_a.puzzle, 320, -(var4 >> 1) + 200);
          stackIn_21_0 = this;
          stackIn_21_1 = null;
          stackIn_21_2 = null;
          stackIn_21_3 = this.field_a;
          stackIn_21_4 = new int[]{var2, var3};
          stackIn_21_5 = new int[]{235, 235};
          if (this.field_z != 1) {
            stackIn_22_0 = this;
            stackIn_22_1 = null;
            stackIn_22_2 = null;
            stackIn_22_6 = false;
          } else {
            stackIn_22_0 = this;
            stackIn_22_1 = null;
            stackIn_22_2 = null;
            stackIn_22_6 = true;
          }
          this.field_e = new MatchHud(stackIn_21_3, stackIn_21_4, stackIn_21_5, stackIn_22_6);
        } else {
          this.field_d = new PlayerController[1];
          this.field_d[0] = new PlayerController(this.field_a, 0, false, this.field_a.puzzle, 384, 256);
          this.field_A = new PictureStrip(this.field_a.puzzle, 110, 240);
          this.field_e = new MatchHud(this.field_a, new int[]{384}, new int[]{256}, false);
        }
        if (this.field_j != null) {
          this.field_j.a(this.field_a.puzzle.field_j, -74);
        }
    }

    final void readState(byte param0, PacketBuffer param1) {
        try {
          if (param0 != 20) {
            this.field_d = (PlayerController[]) null;
          }
          this.field_a.readState(param1, (byte) 123);
          this.createControllers(param0 ^ 102);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "ii.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void f(int param0) {
        PlayerController var5 = null;
        int var6 = Pixelate.field_H ? 1 : 0;
        PlayerController[] var7 = this.field_d;
        PlayerController[] var2 = var7;
        int var3 = 0;
        int var4 = 73 % ((param0 + 2) / 36);
        while (var7.length > var3) {
          var5 = var7[var3];
          var5.j(-125);
          var5.h(9236);
          var3++;
        }
    }

    private final void tickChallenge(byte param0) {
        PlayerController var2;
        PlayerBoard var3;
        TimerBar var4;
        int var5;
        int var6;
        String var7;
        PlayerController var8;
        int var5Lifetime1;
        sb.field_a = sb.field_a - 1;
        DialWidgetPainter.field_o = DialWidgetPainter.field_o - IconTextComponent.field_Mb;
        mj.field_j = mj.field_j + 1;
        PlayerController.field_r = PlayerController.field_r + this.field_a.scores[0];
        var8 = this.field_d[this.field_z];
        var2 = var8;
        var3 = this.field_a.boards[this.field_z];
        var4 = (TimerBar) (this.field_j);
        var8.tick(param0 - 42);
        if (!(0 >= this.field_a.field_r) ||
          this.field_a.puzzle.pictureIndex == 4) {
          var4.a(param0 - 77, var8.i(-122));
        }
        MouseInputHandler.b(5);
        if (null != aa.field_p &&
          aa.field_p.field_n &&
          aa.field_p.field_r != null) {
          this.field_e.field_f = di.formatThousands(false, aa.field_p.field_l[1][0]);
          aa.field_p = null;
        }
        if (var4.a(false)) {
          gb.field_f[1] = gb.field_f[1] + this.field_a.boards[0].piecesPlaced;
          this.showResults(false, param0 + 209, false);
          return;
        }
        if (!var3.fastDrop &&
          this.field_w > 0 &&
          this.field_a.field_r > 0) {
          this.field_w = this.field_w - 1;
        }
        if (param0 != 41) {
          var7 = (String) null;
          MatchController.execute((byte) 95, (String) null);
        }
        if (this.field_a.field_r > 0) {
          if (this.field_a.field_o == this.field_a.puzzle.field_g) {
            this.awardAchievement(18, (byte) 58, 237);
          }
          if (this.field_a.field_b &&
            !var8.field_l) {
            this.awardAchievement(19, (byte) 58, 236);
          }
          if (100 <= this.field_a.field_f) {
            this.awardAchievement(21, (byte) 58, 234);
          }
        }
        if (var3.field_f > 0 &&
          this.field_a.field_r > 0) {
          if (50 == var3.field_f) {
            var8.a(-20791, var3.field_f, true);
            gb.field_f[2] = gb.field_f[2] + 1;
            IterableNodeHashTable.a((byte) -117);
          }
          var5 = var3.field_f;
          DialWidgetPainter.field_o = DialWidgetPainter.field_o + (var5 << 7);
          ln.field_n = ln.field_n + var5 * mj.field_j;
          if (this.field_a.scores[0] >= 10000) {
            this.awardAchievement(0, (byte) 58, 255);
          }
          if (this.field_a.scores[0] >= 50000) {
            this.awardAchievement(1, (byte) 58, 254);
          }
          if (this.field_a.scores[0] >= 100000) {
            this.awardAchievement(2, (byte) 58, 253);
          }
          if (this.field_a.scores[0] >= 250000) {
            this.awardAchievement(3, (byte) 58, 252);
          }
        }
        var3.field_f = 0;
        if (var8.field_l) {
          var5Lifetime1 = this.field_a.puzzle.field_e;
          if (0 < this.field_a.field_r) {
            var6 = var5Lifetime1;
            this.field_a.scores[0] = this.field_a.scores[0] + var6;
            ra.field_a = ra.field_a - mj.field_j * var6;
            IntKeyLookup.field_f = IntKeyLookup.field_f + (var6 << 7);
            if (this.field_a.scores[0] >= 10000) {
              this.awardAchievement(0, (byte) 58, 255);
            }
            if (this.field_a.scores[0] >= 50000) {
              this.awardAchievement(1, (byte) 58, 254);
            }
            if (this.field_a.scores[0] >= 100000) {
              this.awardAchievement(2, (byte) 58, 253);
            }
            if (250000 <= this.field_a.scores[0]) {
              this.awardAchievement(3, (byte) 58, 252);
            }
            var8.a(-20791, var5Lifetime1, false);
          }
          if (var4.a(this.field_a.puzzle.field_b, (byte) 73) &&
            this.field_a.field_r > 10) {
            this.awardAchievement(7, (byte) 58, 248);
          }
          gb.field_f[3] = gb.field_f[3] + 1;
          var8.d(93);
          var2.field_l = false;
          this.field_m = true;
          this.field_a.field_b = false;
          this.field_a.field_f = 0;
          this.field_a.field_o = 0;
          if (!var3.field_x &&
            this.field_a.field_r > 0) {
            this.awardAchievement(20, (byte) 58, 235);
          }
          if (this.field_a.field_r > 10) {
            if (!var3.field_m &&
              !this.field_a.puzzle.field_i) {
              this.awardAchievement(8, (byte) 58, 247);
            }
            if (!var3.field_k) {
              this.awardAchievement(9, (byte) 58, 246);
            }
            if (!var3.field_k &&
              !var3.field_m &&
              !this.field_a.puzzle.field_i) {
              this.awardAchievement(10, (byte) 58, 245);
            }
          }
          this.field_s = this.field_s | var3.field_m;
        }
        if (this.field_m &&
          var8.g(param0 ^ -42)) {
          if (this.field_a.startNextPicture(0)) {
            gb.field_f[1] = gb.field_f[1] + this.field_a.boards[0].piecesPlaced;
            this.advanceChallengePicture(125);
          }
          this.startNextRound(param0 - 56);
          this.field_m = false;
        } else {
          if (this.field_f &&
            this.field_A.isScrollFinished((byte) 85)) {
            this.field_f = false;
            this.field_A = new PictureStrip(this.field_a.puzzle, 110, 240);
          }
        }

    }

    MatchController(String[] param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        String[] array$0 = null;
        boolean stackIn_4_0 = false;
        String[] stackIn_7_0 = null;
        String[] stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        String stackIn_8_3;
        boolean stackIn_12_0 = false;
        Object stackIn_20_0;
        ScoreMarkerBar stackIn_20_1;
        ScoreMarkerBar stackIn_20_2;
        int[] stackIn_20_3;
        ScoreMarkerBar stackIn_21_1 = null;
        ScoreMarkerBar stackIn_21_2 = null;
        boolean stackIn_21_4 = false;
        Object stackIn_23_0;
        int stackIn_24_5 = 0;
        int stackIn_27_1 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        ScoreMarkerBar stackIn_21_1Lifetime1;
        ScoreMarkerBar stackIn_21_2Lifetime1;
        this.field_h = false;
        this.field_m = false;
        this.field_f = false;
        this.field_s = false;
        this.field_w = 50;
        this.field_u = false;
        this.field_l = false;
        this.field_g = false;
        this.field_r = true;
        try {
          IntKeyLookup.field_f = 770566011;
          sb.field_a = 22178;
          stackIn_4_0 = (DateOfBirthValidator.field_j == 2);
          AgeValidator.field_p = stackIn_4_0;
          EmailCredentials.field_k = 0;
          DialWidgetPainter.field_o = 2359467;
          ln.field_n = 1426010794;
          ra.field_a = 1947508858;
          this.field_z = param1;
          IconTextComponent.field_Mb = 34851;
          if (param0 == null) {
            array$0 = new String[1];
            stackIn_7_0 = array$0;
            stackIn_7_1 = array$0;
            stackIn_7_2 = 0;
            if (null == ModalStack.field_J) {
              stackIn_8_3 = UiComponent.field_t;
            } else {
              stackIn_8_3 = ModalStack.field_J;
            }
            stackIn_7_1[stackIn_7_2] = stackIn_8_3;
            param0 = stackIn_7_0;
          }
          stackIn_12_0 = !(wo.field_h < 2);
          MenuInputState.field_e = stackIn_12_0;
          mj.field_j = 13483;
          PlayerController.field_r = 16042;
          UiComponent.i(0);
          gb.field_f = new int[4];
          WeightedLruCache.a(true);
          if (DateOfBirthValidator.field_j != 0) {
            if (DateOfBirthValidator.field_j == 1) {
              this.field_a = new Match(param0, 0, DateOfBirthValidator.field_j, param3, 0, un.field_j.field_a);
              aq.a(this.field_a.field_g, false);
              this.createControllers(127);
              this.startNextRound(-100);
            } else {
              if (DateOfBirthValidator.field_j == 2) {
                this.field_a = new Match(param0, param4, DateOfBirthValidator.field_j, param3, param5, param6);
                aq.a(this.field_a.field_g, false);
                stackIn_20_0 = this;
                stackIn_20_1 = null;
                stackIn_20_2 = null;
                stackIn_20_3 = this.field_a.scores;
                if (this.field_z != 1) {
                  stackIn_21_1 = null;
                  stackIn_21_2 = null;
                  stackIn_21_4 = false;
                } else {
                  stackIn_21_1 = null;
                  stackIn_21_2 = null;
                  stackIn_21_4 = true;
                }
                stackIn_23_0 = this;
                if (!DateOfBirthValidator.field_i) {
                  stackIn_21_1Lifetime1 = null;
                  stackIn_21_2Lifetime1 = null;
                  stackIn_24_5 = 0;
                } else {
                  stackIn_21_1Lifetime1 = null;
                  stackIn_21_2Lifetime1 = null;
                  stackIn_24_5 = 120;
                }
                this.field_j = (StatusBar) ((Object) new ScoreMarkerBar(stackIn_20_3, stackIn_21_4, stackIn_24_5));
                this.createControllers(122);
                this.field_r = true;
                if (this.field_z != -2) {
                  stackIn_27_1 = 149;
                } else {
                  stackIn_27_1 = 0;
                }
                this.field_n = stackIn_27_1;
              }
            }
          } else {
            aq.a(true);
            this.field_j = (StatusBar) ((Object) new TimerBar(90));
            if (!ArrayWidgetContainer.a((byte) 95)) {
              aa.field_p = PasswordValidator.a(3, (byte) -97, 1, 10, 0);
            }
            this.field_a = new Match(param0, 0, DateOfBirthValidator.field_j, param3, 0, 0);
            BoardView.a(1, this.field_a);
            this.createControllers(119);
            this.startNextRound(-70);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_32_0 = var8;
          stackIn_32_1 = new StringBuilder().append("ii.<init>(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_v = "Go Back";
        field_q = -1;
        field_k = "Names cannot start or end with space or underscore";
        field_b = "Options";
        field_c = "Match by...";
    }
}
