/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LinkTextPainter implements WidgetPainter {
    static LoginPayloadKind field_a;
    static String field_g;
    static Sprite[] field_b;
    private int field_d;
    static int field_h;
    private Font field_f;
    static BitPacketBuffer field_e;
    private int field_c;

    final static void resendQueuedRequests(int param0, int param1) {
        int var3 = 0;
        PendingRecordRequest var4 = null;
        HighscoreRequest var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ZombieDawn.field_J;
        try {
          var4 = (PendingRecordRequest) (TrafficVehicle.field_F.last((byte) 26));
          while (var4 != null) {
            DelegatingCanvas.writeHighscoreSubmission((byte) -109, param0, var4);
            var4 = (PendingRecordRequest) (TrafficVehicle.field_F.previous(false));
          }
          if (param1 != -4) {
            LinkTextPainter.drawIntroLogo(-47, 66, -71);
          }
          var5 = (HighscoreRequest) (TileMap.field_g.last((byte) 26));
          while (var5 != null) {
            TextFieldValidator.writeHighscoreQuery(param1 + 4, param0, var5);
            var5 = (HighscoreRequest) (TileMap.field_g.previous(false));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "dp.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static int getCommonUiLoadProgress(int param0) {
        int var1;
        var1 = 67 % ((4 - param0) / 37);
        if (AlternateLongAndNameCredentials.field_j < 2) {
          return 0;
        }
        if (MenuSelection.field_a == 0) {
          if (!IntrusiveDeque.field_d.isIndexLoaded((byte) 73)) {
            return 20;
          }
          if (!IntrusiveDeque.field_d.loadGroupByName(-1, "commonui")) {
            return 40;
          }
          if (!AchievementBanner.field_l.isIndexLoaded((byte) 73)) {
            return 50;
          }
          if (!AchievementBanner.field_l.loadGroupByName(-1, "commonui")) {
            return 60;
          }
          if (!MenuScreen.field_a.isIndexLoaded((byte) 73)) {
            return 70;
          }
          if (!MenuScreen.field_a.areAllGroupsLoaded(9001)) {
            return 80;
          }
          return 100;
        }
        if (GlowAreaSupport.field_i == null) {
          if (!IntrusiveDeque.field_d.isIndexLoaded((byte) 73)) {
            return 43;
          }
          if (!IntrusiveDeque.field_d.loadGroupByName(-1, "commonui")) {
            return 57;
          }
          if (!AchievementBanner.field_l.isIndexLoaded((byte) 73)) {
            return 71;
          }
          if (!AchievementBanner.field_l.loadGroupByName(-1, "commonui")) {
            return 80;
          }
          if (!MenuScreen.field_a.isIndexLoaded((byte) 73)) {
            return 82;
          }
          if (!MenuScreen.field_a.areAllGroupsLoaded(9001)) {
            return 86;
          }
          return 100;
        }
        if (!GlowAreaSupport.field_i.isIndexLoaded((byte) 73)) {
          return 14;
        }
        if (!GlowAreaSupport.field_i.hasGroupName("", 0)) {
          return 29;
        }
        if (!GlowAreaSupport.field_i.loadGroupByName(-1, "")) {
          return 29;
        }
        if (!IntrusiveDeque.field_d.isIndexLoaded((byte) 73)) {
          return 43;
        }
        if (!IntrusiveDeque.field_d.loadGroupByName(-1, "commonui")) {
          return 57;
        }
        if (!AchievementBanner.field_l.isIndexLoaded((byte) 73)) {
          return 71;
        }
        if (!AchievementBanner.field_l.loadGroupByName(-1, "commonui")) {
          return 80;
        }
        if (!MenuScreen.field_a.isIndexLoaded((byte) 73)) {
          return 82;
        }
        if (MenuScreen.field_a.areAllGroupsLoaded(9001)) {
          return 100;
        }
        return 86;
    }

    public final void drawWidget(int param0, boolean param1, int param2, UiWidget param3, int param4) {
        int stackIn_7_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ZombieDawn.field_J;
        try {
          if (param0 != 16777215) {
            this.field_d = -68;
          }
          if (!param3.field_l &&
            !param3.isFocused(-17741)) {
            stackIn_7_0 = 2188450;
          } else {
            stackIn_7_0 = 3249872;
          }
          var6_int = stackIn_7_0;
          this.field_f.drawParagraph("<u=" + Integer.toString(var6_int, 16) + ">" + param3.field_o + "</u>", param3.field_k + param4, param2 + param3.field_j, param3.field_i, param3.field_n, var6_int, -1, this.field_c, this.field_d, this.field_f.field_I + this.field_f.field_x);
          if (param3.isFocused(param0 ^ -16759476)) {
            var7 = this.field_f.textWidth(param3.field_o);
            var8 = this.field_f.field_x + this.field_f.field_I;
            var9 = param3.field_k + param4;
            if (this.field_c != 2) {
              if (this.field_c == 1) {
                var9 = var9 + (param3.field_i - var7 >> 1);
              }
            } else {
              var9 = var9 + (param3.field_i - var7);
            }
            var10 = param3.field_j + param2;
            if (2 != this.field_d) {
              if (this.field_d == 1) {
                var10 = var10 + (-var8 + param3.field_n >> 1);
              }
            } else {
              var10 = var10 + (param3.field_n - var8);
            }
            TileMap.drawDottedRectangle(var7 + 4, var8, var9 - 2, param0 - 16777135, 2 + var10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("dp.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_g = null;
        field_b = null;
        field_e = null;
        if (!param0) {
          field_g = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static void drawIntroLogo(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var6Lifetime3;
        int var7Lifetime3;
        int var7Lifetime4;
        var8 = ZombieDawn.field_J;
        if (LevelNavigation.field_x < 0) {
          return;
        }
        var3 = param0 - 135;
        var4 = -35 + param2;
        var5 = 256;
        if (LevelNavigation.field_x < 75) {
          var5 = (LevelNavigation.field_x << 8) / 75;
        }
        if (LevelNavigation.field_x > 200) {
          var5 = (-LevelNavigation.field_x + 250 << 8) / 50;
        }
        ContentTransitionDialog.setRasterTarget((byte) -102, PopupMenuBuilder.field_g);
        TriangleRasterizer.useRasterClip();
        Rasterizer.clear();
        BloodSplat.buildLogoModelFrame(30549);
        if (var5 < 256) {
          Rasterizer.fillRectangleBlended(0, 0, Rasterizer.width, Rasterizer.height, 0, 256 - var5);
          SingleChildWidget.popRasterState(param1 ^ 32173);
          if (param1 != -12138) {
            LinkTextPainter.resendQueuedRequests(118, -83);
          }
          if (150 <= LevelNavigation.field_x) {
            EmptyWidgetPainter.field_a.drawWithOpacity(var3 + 15, var4 + 10, var5);
          } else {
            PopupMenuBuilder.field_g.drawHalfSize(var3, var4);
          }
          var6 = -125 + LevelNavigation.field_x;
          if (0 < var6) {
            if (var6 >= 50) {
              var6 = -140 + LevelNavigation.field_x;
              if (var6 > 0) {
                var7 = 256;
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                }
                MidiNoteMask.field_j.drawWithOpacity(15 + var3, var4 + 10, var7 * var5 >> 8);
              }
              return;
            }
            if (var6 < 20) {
              var7Lifetime4 = var6 * 256 / 20;
              MinigunGunner.field_Pb.drawAdditive(var3, var4, var7Lifetime4);
            } else {
              if (var6 >= 30) {
                var7Lifetime4 = (-(256 * var6) + 12800) / 20;
                MinigunGunner.field_Pb.drawAdditive(var3, var4, var7Lifetime4);
              } else {
                MinigunGunner.field_Pb.drawAdditive(var3, var4, 256);
              }
            }
          }
          var6Lifetime3 = -140 + LevelNavigation.field_x;
          if (var6Lifetime3 > 0) {
            var7Lifetime3 = 256;
            if (var6Lifetime3 < 20) {
              var7Lifetime3 = var6Lifetime3 * 256 / 20;
            }
            MidiNoteMask.field_j.drawWithOpacity(15 + var3, var4 + 10, var7Lifetime3 * var5 >> 8);
          }
          return;
        }
        SingleChildWidget.popRasterState(param1 ^ 32173);
        if (param1 != -12138) {
          LinkTextPainter.resendQueuedRequests(118, -83);
          if (150 <= LevelNavigation.field_x) {
            EmptyWidgetPainter.field_a.drawWithOpacity(var3 + 15, var4 + 10, var5);
          } else {
            PopupMenuBuilder.field_g.drawHalfSize(var3, var4);
          }
          var6Lifetime1 = -125 + LevelNavigation.field_x;
          if (0 < var6Lifetime1 &&
            var6Lifetime1 < 50) {
            if (var6Lifetime1 < 20) {
              var7Lifetime1 = var6Lifetime1 * 256 / 20;
              MinigunGunner.field_Pb.drawAdditive(var3, var4, var7Lifetime1);
            } else {
              if (var6Lifetime1 >= 30) {
                var7Lifetime1 = (-(256 * var6Lifetime1) + 12800) / 20;
                MinigunGunner.field_Pb.drawAdditive(var3, var4, var7Lifetime1);
              } else {
                MinigunGunner.field_Pb.drawAdditive(var3, var4, 256);
              }
            }
          }
        } else {
          if (150 <= LevelNavigation.field_x) {
            EmptyWidgetPainter.field_a.drawWithOpacity(var3 + 15, var4 + 10, var5);
          } else {
            PopupMenuBuilder.field_g.drawHalfSize(var3, var4);
          }
          var6Lifetime1 = -125 + LevelNavigation.field_x;
          if (0 < var6Lifetime1 &&
            var6Lifetime1 < 50) {
            if (var6Lifetime1 < 20) {
              var7Lifetime1 = var6Lifetime1 * 256 / 20;
              MinigunGunner.field_Pb.drawAdditive(var3, var4, var7Lifetime1);
            } else {
              if (var6Lifetime1 < 30) {
                MinigunGunner.field_Pb.drawAdditive(var3, var4, 256);
              } else {
                var7Lifetime1 = (-(256 * var6Lifetime1) + 12800) / 20;
                MinigunGunner.field_Pb.drawAdditive(var3, var4, var7Lifetime1);
              }
            }
          }
        }
        var6Lifetime2 = -140 + LevelNavigation.field_x;
        if (var6Lifetime2 > 0) {
          var7Lifetime2 = 256;
          if (var6Lifetime2 < 20) {
            var7Lifetime2 = var6Lifetime2 * 256 / 20;
          }
          MidiNoteMask.field_j.drawWithOpacity(15 + var3, var4 + 10, var7Lifetime2 * var5 >> 8);
        }
    }

    public LinkTextPainter() {
        this.field_f = MenuFontGlobals.field_e;
        this.field_d = 1;
        this.field_c = 1;
    }

    LinkTextPainter(Font param0, int param1, int param2) {
        try {
          this.field_d = param2;
          this.field_f = param0;
          this.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "dp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = "Password is valid";
        field_h = 2147483647;
        field_a = new LoginPayloadKind(3);
    }
}
