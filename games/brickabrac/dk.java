/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk extends WidgetGroup implements ha, WidgetActionListener, vf {
    static RgbSprite field_R;
    private ToggleButtonWidget field_N;
    private HotspotTextWidget field_I;
    private sf field_M;
    private FocusableWidget field_Q;
    private sf field_L;
    private sf field_O;
    private sf field_S;
    private sf field_J;
    private sf field_H;
    private FocusableWidget field_P;
    ri field_K;

    final static void a(String param0, boolean param1, int param2, boolean param3, int param4) {
        String stackIn_4_0 = null;
        int stackIn_25_0 = 0;
        String stackIn_25_1 = null;
        boolean stackIn_26_2 = false;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_41_1 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var7Lifetime1;
        int var9Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          va.field_a = true;
          LevelSelectScreen.field_v = param2;
          var11 = param0;
          if (!param1) {
            stackIn_4_0 = g.field_q;
          } else {
            stackIn_4_0 = UiComponent.field_mb;
          }
          var6 = stackIn_4_0;
          if (LevelSelectScreen.field_v == 0) {
            var7 = FarmBackground.a(RasterSnapshot.field_r, 480, param4 ^ -17, Widget.field_m, var11);
            var8 = var7 + 3;
            MenuSelection.field_q = new int[var8];
            kn.field_E = new String[var8];
            for (var9 = 0; var8 > var9; var9++) {
              MenuSelection.field_q[var9] = -1;
            }
            hi.field_A = new int[2];
            for (var9 = 0; var7 > var9; var9++) {
              kn.field_E[var9] = RasterSnapshot.field_r[var9];
            }
            kn.field_E[-3 + var8] = "";
            kn.field_E[var8 - 2] = var6;
            MenuSelection.field_q[-2 + var8] = 0;
            hi.field_A[0] = 1;
            kn.field_E[-1 + var8] = LevelSequence.field_a;
            MenuSelection.field_q[var8 - 1] = 1;
            hi.field_A[1] = 2;
          } else {
            if (LevelSelectScreen.field_v != 1) {
              throw new IllegalArgumentException();
            }
            var7 = FarmBackground.a(RasterSnapshot.field_r, 480, param4 - 109, Widget.field_m, var11);
            var8 = 2 + var7;
            MenuSelection.field_q = new int[var8];
            kn.field_E = new String[var8];
            for (var9 = 0; var8 > var9; var9++) {
              MenuSelection.field_q[var9] = -1;
            }
            hi.field_A = new int[1];
            for (var9 = 0; var7 > var9; var9++) {
              kn.field_E[var9] = RasterSnapshot.field_r[var9];
            }
            kn.field_E[var8 - 2] = "";
            kn.field_E[-1 + var8] = LevelSequence.field_a;
            MenuSelection.field_q[-1 + var8] = 0;
            hi.field_A[0] = 2;
          }
          ArcticBackground.field_r.itemCount = hi.field_A.length;
          var7Lifetime1 = 0;
          for (var8Lifetime1 = 0; var8Lifetime1 < kn.field_E.length; var8Lifetime1++) {
            stackIn_25_0 = 0;
            stackIn_25_1 = kn.field_E[var8Lifetime1];
            stackIn_26_2 = !(0 > MenuSelection.field_q[var8Lifetime1]);
            var9Lifetime1 = pl.a(stackIn_25_0, stackIn_25_1, stackIn_26_2);
            if (MenuSelection.field_q[var8Lifetime1] != -1) {
              var9Lifetime1 = var9Lifetime1 + ek.field_lb * 2;
            }
            if (var7Lifetime1 < var9Lifetime1) {
              var7Lifetime1 = var9Lifetime1;
            }
          }
          MusicVoiceMixer.field_p = var7Lifetime1 + (NewAchievementsScreen.field_J - (var7Lifetime1 >> 1));
          bg.field_r = ArcticBackground.field_r.itemCount * (GameCanvas.field_f + GameClock.field_g << 1);
          LevelPack.field_k = NewAchievementsScreen.field_J - (var7Lifetime1 >> 1);
          var8Lifetime2 = 0;
          while (kn.field_E.length > var8Lifetime2) {
            stackIn_38_0 = bg.field_r;
            stackIn_38_1 = MenuSelection.field_q[var8Lifetime2];
            if (stackIn_38_1 >= 0) {
              stackIn_41_1 = TooltipSprite.field_i;
            } else {
              stackIn_41_1 = BufferedSocket.field_m;
            }
            bg.field_r = stackIn_38_0 + stackIn_41_1;
            var8Lifetime2++;
          }
          mi.field_d = ea.field_e - (bg.field_r >> 1);
          ArcticBackground.field_r.initializeSelection(aj.a(param4 - 46, po.pointerY, MusicPatch.pointerX), 0, param3, (byte) -127);
          if (param4 != 46) {
            field_R = (RgbSprite) null;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_47_0 = var5;
          stackIn_47_1 = new StringBuilder().append("dk.N(");
          if (param0 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_R = null;
        if (param0 != -11310) {
          field_R = (RgbSprite) null;
        }
    }

    private final String j(int param0) {
        if (param0 != -987472479) {
          return (String) null;
        }
        return "</col></u>";
    }

    private final boolean i(int param0) {
        if (!this.h(param0 + 10000537)) {
          return false;
        }
        int var2 = param0;
        try {
          var2 = Integer.parseInt(this.field_S.text);
        } catch (NumberFormatException numberFormatException) {
        }
        return ArchiveSource.a(this.field_J.text, this.field_O.text, this.field_M.text, var2, (byte) -126, this, this.field_N.active);
    }

    private final String c(boolean param0) {
        if (!param0) {
          return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    final static RgbSprite loadRgbSprite(int obfuscationGuard, ResourceArchive archive, int groupId, int fileId) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -873) {
            field_R = (RgbSprite) null;
          }
          if (ln.decodeSpritesFromArchive(-123, fileId, archive, groupId)) {
            return n.buildRgbSprite((byte) 21);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("dk.H(").append(obfuscationGuard).append(',');
          if (archive == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(groupId).append(',').append(fileId).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, HotspotTextWidget param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param1 != -526) {
            this.field_O = (sf) null;
          }
          if (0 == param2) {
            ArchiveFetchClient.a("terms.ws", 12);
          } else {
            if (1 != param2) {
              if (param2 == 2) {
                ArchiveFetchClient.a("conduct.ws", 12);
              }
            } else {
              ArchiveFetchClient.a("privacy.ws", 12);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("dk.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public final void onAction(int pointerY, int button, byte obfuscationGuard, int pointerX, FocusableWidget widget) {
        boolean discarded$1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_P == widget) {
            ln.a(103);
          } else {
            if (widget == this.field_Q) {
              discarded$1 = this.i(-1);
            }
          }
          if (obfuscationGuard >= -22) {
            this.field_H = (sf) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("dk.Q(").append(pointerY).append(',').append(button).append(',').append(obfuscationGuard).append(',').append(pointerX).append(',');
          if (widget == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final int a(Widget param0, int param1, String param2, int param3, int param4, String param5, int param6) {
        RuntimeException var8 = null;
        nf var9 = null;
        LabeledWidget var10 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new LabeledWidget(20, param1, param4 + 120, 25, param0, false, 120, 3, ArchiveNetworkClient.field_u, 16777215, param5);
          this.addChild(var10, true);
          var9 = new nf(((je) ((Object) param0)).a(-11011), param2, 126, param1 + var10.height, param4 + 50, param3);
          var9.listener = (WidgetListener) (this);
          if (param6 != 170) {
            this.field_N = (ToggleButtonWidget) null;
          }
          this.addChild(var9, true);
          stackIn_3_0 = var10.height + var9.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("dk.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(')').toString());
        }
    }

    private final int a(String param0, Widget param1, int param2, int param3, int param4) {
        LabeledWidget var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new LabeledWidget(20, param2, 120 + param4, 25, param1, false, 120, 3, ArchiveNetworkClient.field_u, 16777215, param0);
          this.addChild(var6, true);
          var7 = -5 / ((-32 - param3) / 59);
          stackIn_1_0 = var6.height;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_4_0 = var6_ref;
          stackIn_4_1 = new StringBuilder().append("dk.B(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(Widget param0, String param1, int param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        wl var7 = null;
        LabeledWidget var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 97) {
            discarded$1 = this.i(-122);
          }
          var8 = new LabeledWidget(20, param4, param2 + 120, 25, param0, false, 120, 3, ArchiveNetworkClient.field_u, 16777215, param1);
          this.addChild(var8, true);
          var7 = new wl(((je) ((Object) param0)).a(-11011));
          this.addChild(var7, true);
          var7.setBounds(15, var8.x + var8.width + 3, (var8.height - 15 >> 1) + var8.y, (byte) -119, 15);
          stackIn_3_0 = var8.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("dk.L(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void h(byte param0) {
        int var1_int = 0;
        MenuScreen var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param0 > -59) {
            field_R = (RgbSprite) null;
          }
          for (var1_int = 0; var1_int < DelayedPacket.menuScreens.length; var1_int++) {
            var2 = DelayedPacket.menuScreens[var1_int];
            if (var2 != null) {
              var2.refreshMenu(-88);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "dk.U(" + param0 + ')');
        }
    }

    public final void a(String param0, byte param1) {
        String discarded$1 = null;
        sf var3 = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.field_J;
          var4 = param0;
          ((TextFieldWidget) ((Object) var3)).setText(var4, -12592, false);
          if (param1 != 56) {
            discarded$1 = this.c(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("dk.C(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, RasterCacheSurface param2, int param3, int param4, RgbSprite param5) {
        IndexedSpriteGeometry.pushSpriteRaster(-85, param2.sprite);
        Rasterizer2D.fillVerticalGradient(0, 0, param2.width, param2.height, pf.arcticBackgroundColors[param1], 16777215);
        if (param4 != 23275) {
          return;
        }
        try {
          param5.b((-param5.canvasWidth + param2.width) / 2, -(342 / param0) + (-param5.canvasHeight + param2.height), 55, 83);
          sc.popRaster(-84);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "dk.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean handleWidgetKey(int keyCode, byte obfuscationGuard, Widget focusRoot, char character) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleWidgetKey(keyCode, obfuscationGuard, focusRoot, character)) {
            return true;
          }
          if (keyCode == 98) {
            stackIn_6_0 = this.b(focusRoot, (byte) 119);
            return stackIn_6_0;
          }
          if (keyCode != 99) {
            return false;
          }
          stackIn_10_0 = this.a(focusRoot, (byte) -122);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("dk.T(").append(keyCode).append(',').append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(character).append(')').toString());
        }
    }

    private final boolean h(int param0) {
        if (param0 != 10000536) {
          this.field_H = (sf) null;
        }
        if (this.a(60, this.field_J) &&
          this.a(60, this.field_M) &&
          this.a(60, this.field_H) &&
          this.a(60, this.field_O) &&
          this.a(60, this.field_L) &&
          this.a(60, this.field_S)) {
          return true;
        }
        return false;
    }

    final void updatePointer(Widget focusRoot, byte obfuscationGuard, int parentX, int parentY) {
        try {
          super.updatePointer(focusRoot, obfuscationGuard, parentX, parentY);
          this.field_Q.enabled = this.h(10000536);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "dk.WA(" + (focusRoot != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + parentX + ',' + parentY + ')');
        }
    }

    private final int a(int param0, String param1, String param2, int param3, Widget param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -3) {
            this.field_N = (ToggleButtonWidget) null;
          }
          stackIn_3_0 = this.a(param4, param5, param1, 35, param0, param2, 170);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("dk.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    public final void a(byte param0) {
        if (param0 < 96) {
          return;
        }
        ((fl) (this.field_J.a(-11011))).e((byte) -22);
    }

    public dk() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.field_J = new sf("", (WidgetListener) null, 12);
        this.field_M = new sf("", (WidgetListener) null, 100);
        this.field_H = new sf("", (WidgetListener) null, 100);
        this.field_O = new sf("", (WidgetListener) null, 20);
        this.field_L = new sf("", (WidgetListener) null, 20);
        this.field_S = new sf("", (WidgetListener) null, 3);
        int var1 = 1;
        this.field_N = new ToggleButtonWidget("", (WidgetListener) null, var1 != 0);
        this.field_Q = new FocusableWidget(c.field_d, (WidgetListener) null);
        this.field_P = new FocusableWidget(ByteArrayNode.field_l, (WidgetListener) null);
        this.field_J.tooltip = hh.field_a;
        this.field_M.tooltip = rf.field_d;
        this.field_H.tooltip = ResourceArchive.field_e;
        this.field_O.tooltip = IntKeyIndex.field_a;
        this.field_L.tooltip = BoundedFile.field_b;
        this.field_S.tooltip = hc.field_d;
        this.field_N.tooltip = ok.field_e;
        this.field_J.a(new fl(this.field_J), (byte) -68);
        this.field_M.a(new sg(this.field_M), (byte) -68);
        this.field_H.a(new uc(this.field_H, this.field_M), (byte) -68);
        this.field_O.a(new g(this.field_O, this.field_J, this.field_M), (byte) -68);
        this.field_L.a(new cb(this.field_L, this.field_O), (byte) -68);
        this.field_S.a(new kf(this.field_S), (byte) -68);
        this.field_Q.enabled = false;
        this.field_Q.renderer = (WidgetRenderer) ((Object) new hi());
        this.field_P.renderer = (WidgetRenderer) ((Object) new bb());
        this.field_J.renderer = (WidgetRenderer) ((Object) new r(10000536));
        r dupTemp$0 = new r(10000536);
        this.field_H.renderer = (WidgetRenderer) ((Object) dupTemp$0);
        this.field_M.renderer = (WidgetRenderer) ((Object) dupTemp$0);
        this.field_S.renderer = (WidgetRenderer) ((Object) new r(10000536));
        this.field_N.renderer = (WidgetRenderer) ((Object) new bd());
        ob dupTemp$1 = new ob(10000536);
        this.field_L.renderer = (WidgetRenderer) ((Object) dupTemp$1);
        this.field_O.renderer = (WidgetRenderer) ((Object) dupTemp$1);
        String var2 = rd.a(ch.field_e, new String[]{this.c(true), this.j(-987472479)}, (byte) 103);
        int var3 = 20;
        var3 = var3 + this.a(IntNode.field_l, this.field_M, var3, 37, 170);
        var3 = var3 + (this.a(this.field_H, var3, "", 20, 170, DelayedPacket.field_o, 170) + 5);
        var3 = var3 + this.a(wc.field_c, this.field_O, var3, 84, 170);
        var3 = var3 + (this.a(170, InstructionsScreen.field_x, WidgetLayerStack.field_G, -3, this.field_L, var3) + 5);
        var3 = var3 + (this.a(170, GameClock.field_h, BlankScreen.field_j, -3, this.field_J, var3) + 5);
        var3 = var3 + this.a(this.field_S, HuffmanCodec.field_d, 170, 111, var3);
        LabeledWidget var4 = new LabeledWidget(46, var3, this.width - 90, 25, this.field_N, true, -120 + this.width, 5, QuickChatMenu.field_Yb, 11579568, LevelCompleteScreen.field_z);
        this.addChild(var4, true);
        var3 = var3 + var4.height;
        um var5 = new um(ArchiveNetworkClient.field_u, 0, 0, 0, 0, 16777215, -1, 0, 0, ArchiveNetworkClient.field_u.ascent, -1, 2147483647, true);
        this.field_I = new HotspotTextWidget(var2, var5);
        this.field_I.tooltip = "";
        this.field_I.a(GameConnectionShell.field_z, 0, (byte) -98);
        this.field_I.a(GameConnectionShell.field_z, 1, (byte) -98);
        this.field_I.listener = (WidgetListener) (this);
        this.field_I.a(46, (byte) 46, -90 + this.width, var3);
        var3 = var3 + (15 + this.field_I.height);
        this.addChild(this.field_I, true);
        int var6 = 4;
        int var7 = 200;
        this.field_Q.setBounds(40, -var7 + 496 >> 1, var3, (byte) -119, var7);
        this.field_P.setBounds(40, 3 + var6, var3 + 15, (byte) -119, 60);
        this.field_P.listener = (WidgetListener) (this);
        this.field_Q.listener = (WidgetListener) (this);
        this.addChild(this.field_Q, true);
        this.addChild(this.field_P, true);
        this.field_K = new ri((vf) (this));
        this.field_K.setBounds(150, this.field_J.x - (-this.field_J.width - 60), 20 + this.field_J.y, (byte) -119, this.width - this.field_J.x - (this.field_J.width + 60));
        this.addChild(this.field_K, true);
        this.setBounds(var6 + (var3 + 55), 0, 0, (byte) -119, 496);
    }

    private final boolean a(int param0, je param1) {
        ia var3 = null;
        RuntimeException var3_ref = null;
        qh var4 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a(param0 ^ -11071);
          if (var3 == null) {
            return true;
          }
          var4 = var3.b((byte) -31);
          if (lp.field_xb == var4) {
            return false;
          }
          if (param0 != 60) {
            this.field_N = (ToggleButtonWidget) null;
          }
          if (m.field_c == var4) {
            return false;
          }
          if (var4 != uo.field_f) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("dk.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
    }
}
