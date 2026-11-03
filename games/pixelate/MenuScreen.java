/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MenuScreen {
    int field_d;
    int field_i;
    MenuInputState field_g;
    int field_a;
    static int field_j;
    int[] field_k;
    int field_l;
    static IntrusiveDeque field_b;
    static int field_n;
    static boolean field_f;
    int field_m;
    static int field_h;
    static aa[] field_e;
    static Sprite field_c;

    int getRowY(int param0, int param1) {
        if (this.field_l == 6 &&
          !ArrayWidgetContainer.a((byte) 88)) {
          if (param1 < 2) {
            return this.field_d;
          }
          return this.field_i + this.field_d;
        }
        int var3 = -24 % ((-13 - param0) / 37);
        return param1 * this.field_i + this.field_d;
    }

    final static void drawSpriteOutline(int param0, int param1, int param2, Sprite param3, int param4, int param5, int param6, int param7) {
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var18 = 0;
        int var19 = 0;
        Sprite var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        var19 = Pixelate.field_H ? 1 : 0;
        try {
          if (SoftwareRasterizer.field_e > param0) {
            param4 = param4 - (-param0 + SoftwareRasterizer.field_e);
            param0 = SoftwareRasterizer.field_e;
          }
          if (SoftwareRasterizer.field_h < param4 + param0) {
            param4 = SoftwareRasterizer.field_h - param0;
          }
          if (SoftwareRasterizer.field_f > param1) {
            param7 = param7 - (-param1 + SoftwareRasterizer.field_f);
            param1 = SoftwareRasterizer.field_f;
          }
          if (SoftwareRasterizer.field_a < param7 + param1) {
            param7 = -param1 + SoftwareRasterizer.field_a;
          }
          if (param5 != -1) {
            field_f = false;
          }
          if (param4 > 0 &&
            param7 > 0) {
            var21 = param3.copy();
            var30 = SoftwareRasterizer.field_k;
            var10 = SoftwareRasterizer.field_j;
            var11 = SoftwareRasterizer.field_d;
            var29 = new int[4];
            SoftwareRasterizer.saveClip(var29);
            param3.makeRasterTarget();
            SoftwareRasterizer.intersectClip(var29[0], var29[1], var29[2], var29[3]);
            var13 = param3.field_F * param1 + param0;
            var14 = param3.field_F - param4;
            var25 = var21.pixels;
            var22 = var25;
            var15 = var22;
            for (var16 = param1; var16 < param7 + param1; var16++) {
              for (var17 = param0; param4 + param0 > var17; var17++) {
                var18 = var25[var13];
                if (var18 != 0 && (0 < var17 &&
                  var15[var13 - 1] == 0 ||
                  var16 > 0 &&
                  var15[var13 - param3.field_F] == 0 ||
                  var17 < -1 + param3.field_F &&
                  var15[var13 + 1] == 0 ||
                  !(-1 + param3.field_E <= var16) &&
                  var15[var13 + param3.field_F] == 0)) {
                  SoftwareRasterizer.fillCircle(var17, var16, param6, param2);
                }
                var13++;
              }
              var13 = var13 + var14;
            }
            var21.drawTransparent(-param3.field_D, -param3.field_y);
            SoftwareRasterizer.setTarget(var30, var10, var11);
            SoftwareRasterizer.restoreClip(var29);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_42_0 = var8;
          stackIn_42_1 = new StringBuilder().append("de.UA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    abstract void draw(int param0);

    final void drawBackdrop(int param0, byte param1, int param2) {
        SpriteEffectHelpers.a(320, param0, param2 + 290, StripedProgressBar.field_S);
        if (param1 >= -82) {
          field_e = (aa[]) null;
        }
        SoftwareRasterizer.fillRectangleAlpha(30, param0 + 20, 580, param2 + 250, 0, 180);
        SoftwareRasterizer.drawRectangleAlpha(30, param0 + 20, 580, 250 + param2, 16777215, 192);
    }

    final void drawRows(byte param0) {
        int var2 = 0;
        int var3;
        int stackIn_7_1 = 0;
        boolean stackIn_8_2 = false;
        var3 = Pixelate.field_H ? 1 : 0;
        for (var2 = 0; this.field_g.field_h > var2; var2++) {
          if (this.isRowEnabled(param0 - 47, var2)) {
            stackIn_7_1 = -125;
            stackIn_8_2 = (var2 == this.field_g.selectedIndex);
            this.a((byte) stackIn_7_1, stackIn_8_2, var2);
          }
        }
        if (param0 != -71) {
          this.getRowRight(27, false);
        }
    }

    private final void handleNavigationKeys(byte param0) {
        int var2;
        int var3;
        var3 = Pixelate.field_H ? 1 : 0;
        if (ke.field_a == 96) {
          if (0 < this.field_g.selectedIndex) {
            if (this.field_g.selectedIndex != 2) {
              this.field_g.a(false, 0);
            }
          } else {
            this.field_g.a(false, 1);
          }
        }
        if (ke.field_a == 97) {
          if (this.field_g.selectedIndex != 1) {
            if (this.field_g.selectedIndex != 2) {
              this.field_g.a(false, 1);
            }
          } else {
            this.field_g.a(false, 0);
          }
        }
        if (ke.field_a == 99) {
          if (0 <= this.field_g.selectedIndex &&
            this.field_g.selectedIndex <= 1) {
            this.field_g.a(false, 2);
          } else {
            this.field_g.a(false, d.field_c);
          }
        }
        if (ke.field_a == 98) {
          if (2 == this.field_g.selectedIndex) {
            this.field_g.a(false, d.field_c);
          } else {
            this.field_g.a(false, 2);
          }
        }
        this.field_g.b((byte) -71);
        var2 = 44 / ((param0 + 21) / 50);
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        if (param0 != -1) {
          return;
        }
        field_b = null;
        field_e = null;
    }

    void a(byte param0, boolean param1, int param2) {
        if (param0 > -116) {
          this.drawRows((byte) 11);
        }
        this.a((byte) 35, StripedProgressBar.field_S, param1, param2);
    }

    void a(int param0, int param1, boolean param2) {
        this.field_g.initializeSelection(param2, this.rowAt(ProxyAuthenticationException.field_d, StatusBar.field_k, -119), 17068, param1);
        nk.field_i = pa.field_b;
        if (param0 != 2) {
          field_h = -13;
        }
    }

    int rowAt(int param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        int var6;
        var6 = Pixelate.field_H ? 1 : 0;
        if (param2 > -110) {
          field_c = (Sprite) null;
        }
        for (var4 = 0; var4 < this.field_k.length; var4++) {
          var5 = this.getRowY(-108, var4);
          if (this.isRowEnabled(-113, var4) &&
            this.getRowLeft(var4, (byte) 90) <= param0 &&
            param0 < this.getRowRight(var4, false) &&
            var5 <= param1 &&
            param1 < var5 + this.getRowHeight(-28071, var4)) {
            return var4;
          }
        }
        return -1;
    }

    int getRowHeight(int param0, int param1) {
        if (param0 != -28071) {
          MenuScreen.a((byte) -105, true);
        }
        return 30;
    }

    final void a(boolean param0) {
        if (!param0) {
          this.field_d = 59;
        }
        if (this.field_l == 5) {
          aa.field_p = null;
        }
        if (this.field_l == 6) {
          WhirlpoolHasher.field_f = null;
        }
    }

    final void a(boolean param0, boolean param1) {
        if (!param1) {
          this.field_m = -106;
        }
        this.a(PacketBuffer.field_o[7], StripedProgressBar.field_W, (byte) 109, param0);
    }

    final void a(String param0, Sprite param1, byte param2, boolean param3) {
        if (param2 < 98) {
          return;
        }
        try {
          this.drawFooterButton(param3, param0, param1, -6, 320);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "de.NA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    void c(int param0) {
        EmergentBehaviourBackground.field_u.drawOpaque(0, param0);
        rh.b((byte) -67);
    }

    int getRowRight(int param0, boolean param1) {
        if (this.field_l == 5 &&
          !ArrayWidgetContainer.a((byte) 78)) {
          return 3 <= param0 ? 380 : 200 + 200 * param0;
        }
        if (param1) {
          return 50;
        }
        if (this.field_l == 6 &&
          !ArrayWidgetContainer.a((byte) 77)) {
          return 2 <= param0 ? 380 : param0 * 240 + 300;
        }
        return this.field_a;
    }

    final static void a(byte param0, boolean param1) {
        if (param0 != 28) {
          field_h = -12;
        }
        if (null != he.field_f) {
          he.field_f.a(param1, 0);
        }
    }

    void handleNavigation(int param0) {
        if (param0 >= -35) {
          return;
        }
        if (this.field_l == 6 &&
          !ArrayWidgetContainer.a((byte) 84)) {
          this.handleNavigationKeys((byte) 81);
        } else {
          this.field_g.a((byte) -48);
        }
    }

    int getRowLeft(int param0, byte param1) {
        if (param1 != 90) {
          this.field_a = -74;
        }
        if (this.field_l == 5 &&
          !ArrayWidgetContainer.a((byte) 125)) {
          return param0 >= 3 ? 260 : 200 * param0 + 40;
        }
        if (6 == this.field_l &&
          !ArrayWidgetContainer.a((byte) 66)) {
          return 2 <= param0 ? 260 : 100 + 240 * param0;
        }
        return this.field_m;
    }

    MenuScreen(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        try {
          this.field_m = param1;
          this.field_l = param0;
          this.field_i = param4;
          this.field_d = param3;
          this.field_a = param2;
          this.setItems(param5, (byte) -24);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "de.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void onCancel(byte param0);

    final void a(byte param0, Sprite param1, boolean param2, int param3) {
        try {
          this.a(PacketBuffer.field_o[this.field_k[param3]], param2, param3, param1, (byte) 89);
          if (param0 != 35) {
            field_b = (IntrusiveDeque) null;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "de.VA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    void setItems(int[] param0, byte param1) {
        try {
          this.field_k = param0;
          this.field_g = new MenuInputState(this.field_k.length);
          if (param1 != -24) {
            this.field_d = 119;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "de.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    boolean isRowEnabled(int param0, int param1) {
        if (param0 >= -112) {
          this.field_i = 64;
          return true;
        }
        return true;
    }

    final void d(byte param0) {
        this.drawBackdrop(120, (byte) -102, 0);
        int var2 = -125 % ((param0 - 5) / 39);
    }

    final void a(String param0, boolean param1, int param2, Sprite param3, byte param4) {
        int stackIn_27_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Sprite[] var16 = null;
        int var17 = 0;
        var17 = Pixelate.field_H ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          var6_int = this.field_k[param2];
          if (var6_int == 8) {
            if (TickClock.field_a != 0 &&
              0 != MidiPcmStream.field_t &&
              TickClock.field_a != 12 &&
              MidiPcmStream.field_t != 12) {
              if (1 != TickClock.field_a &&
                MidiPcmStream.field_t != 1) {
                if ((TickClock.field_a == 2 ||
                  MidiPcmStream.field_t == 2 ||
                  TickClock.field_a == 4 ||
                  MidiPcmStream.field_t == 4)) {
                  param0 = TextFieldValidator.field_k;
                }
              } else {
                param0 = FullscreenFocusCanvas.field_b;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              param0 = PacketBuffer.field_o[7];
            }
          }
          var7 = ConditionalTextValue.field_h.textWidth(param0);
          var8 = this.getRowLeft(param2, (byte) 90);
          var9 = this.getRowRight(param2, false);
          var10 = this.getRowY(-98, param2);
          if (var6_int == 20 ||
            21 == var6_int) {
            var7 = 120 + Checkbox.field_T;
          }
          var11 = -128 % ((param4 - 21) / 46);
          var12 = -var7 + var9 + var8 >> 1;
          var13 = this.getRowHeight(-28071, param2);
          if (param1) {
            SpriteEffectHelpers.a(var9 + var8 >> 1, var10 - 2, 35, param3);
          }
          stackIn_27_0 = (!param1) ? 2 : 0;
          var14 = stackIn_27_0;
          if (5 == this.field_l && (var6_int == 14 &&
            0 == of.field_a ||
            var6_int == 15 &&
            1 == of.field_a ||
            16 == var6_int &&
            of.field_a == 2)) {
            var14 = 1;
          }
          ConditionalTextValue.field_h.drawText(param0, var12, var10 + ConditionalTextValue.field_h.maxAscent, var14, -1);
          if (var6_int != 20 &&
            var6_int != 21) {
            return;
          }
          var12 = var12 + Checkbox.field_T;
          SoftwareRasterizer.drawRectangle(var12, var10 + var13 / 2 - 1, 121, 2, var14);
          if (var6_int == 20) {
            stackIn_45_0 = 120 * LinkButtonPainter.field_h / 256;
          } else {
            stackIn_45_0 = SocketJs5Transport.field_u * 120 / 256;
          }
          var15 = stackIn_45_0;
          var16 = Js5NetworkRequest.field_C[0].field_a;
          var16[1].drawOpaque(-7 + (var12 + var15), 7 + var10);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_49_0 = var6;
          stackIn_49_1 = new StringBuilder().append("de.BB(");
          if (param0 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param4).append(')').toString());
        }
    }

    final void drawFooterButton(boolean param0, String param1, Sprite param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        try {
          var6_int = 6;
          var7 = var6_int + ConditionalTextValue.field_h.textWidth(param1) + MusicPatch.field_m.field_A;
          var8 = param4 - var7 / 2;
          var9 = 420;
          var10 = 2;
          if (param0) {
            SpriteEffectHelpers.a(param4, -7 + var9, 46, param2);
            var10 = 0;
          }
          if (param3 != -6) {
            field_n = -115;
          }
          MusicPatch.field_m.drawTransparent(var8, var9);
          ConditionalTextValue.field_h.drawText(param1, var6_int + var8 + MusicPatch.field_m.field_A, var9 + ConditionalTextValue.field_h.maxAscent, var10, -1);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "de.AB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    void a(int param0, boolean param1, boolean param2) {
        int var6 = 0;
        if (!param1) {
          int[] var7 = (int[]) null;
          this.setItems((int[]) null, (byte) 12);
        }
        int var4 = param0 * 2;
        int var5 = param0 < 128 ? 0 : -256 + 2 * param0;
        if (param2) {
          var6 = var4;
          var4 = var5;
          var5 = var6;
        }
        pe.field_b.makeRasterTarget();
        this.c(0);
        ClientException.field_f.bindRaster(19692);
        SpriteEffectHelpers.a(pe.field_b.pixels, var4, var5);
    }

    void handleInput(byte param0) {
        int var3;
        boolean stackIn_14_0 = false;
        var3 = Pixelate.field_H ? 1 : 0;
        if (!ValidationState.field_c &&
          !LinkButtonPainter.field_d) {
          while (DirectByteStorage.$cfr$intArgs$b$c4997cb15529(121)) {
            if (ke.field_a == 13) {
              this.onCancel((byte) -16);
              continue;
            }
            if (EmailValidator.field_m[82] &&
              ke.field_a == 11) {
              stackIn_14_0 = !(Match.field_u);
              Match.field_u = stackIn_14_0;
              continue;
            }
            this.handleNavigation(-36);
            if (-1 == this.field_g.selectedIndex) {
              continue;
            }
            this.activateRow(this.field_g.selectedIndex, (byte) -114, false);
          }
          this.field_g.updatePointer(this.rowAt(BufferedRandomAccessFile.field_a, ji.field_c, -125), this.rowAt(ProxyAuthenticationException.field_d, StatusBar.field_k, -115), -1);
          if (-1 != this.field_g.selectedIndex) {
            this.activateRow(this.field_g.selectedIndex, (byte) -128, true);
          }
        }
        if (param0 > -64) {
          this.field_l = -74;
        }
    }

    void activateRow(int param0, byte param1, boolean param2) {
        int stackIn_52_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_162_0 = 0;
        Object stackIn_190_0 = null;
        int stackIn_191_1 = 0;
        boolean stackIn_208_0 = false;
        int var4;
        int var5;
        int var6;
        int var7_int;
        BinaryBitmapFont var7;
        int var8;
        int var9;
        var9 = Pixelate.field_H ? 1 : 0;
        if (this.field_g.isActivated(51)) {
          mc.a(128, -120);
        }
        var4 = this.field_k[param0];
        if (param1 > -103) {
          return;
        }
        regionExit1: {
          var6 = var4;
          if (var6 != 0) {
            if (29 != var6) {
              if (var6 != 32) {
                if (var6 == 28) {
                  if (this.field_g.isActivated(74)) {
                    var6 = param2 ? 1 : 0;
                    la.changeScreen(MidiPcmStream.field_t, 16, var6 != 0, -25528);
                  }
                } else {
                  if (1 == var6) {
                    if (!(!this.field_g.isActivated(38))) {
                      if (ArrayWidgetContainer.a((byte) 66)) {
                        MatchController.a(param2, 0, -4, (byte) 91, QuickChatMenu.field_Ib);
                      } else {
                        var6 = param2 ? 1 : 0;
                        la.changeScreen(MidiPcmStream.field_t, -4, var6 != 0, -25528);
                      }
                    }
                    break regionExit1;
                  }
                  if (var6 == 2) {
                    if (!(!this.field_g.isActivated(86))) {
                      var6 = param2 ? 1 : 0;
                      stackIn_74_0 = (!gq.d(107)) ? 0 : 12;
                      la.changeScreen(stackIn_74_0, -1, var6 != 0, -25528);
                    }
                    break regionExit1;
                  }
                  if (var6 == 7) {
                    if (!(!this.field_g.isActivated(91))) {
                      var6 = param2 ? 1 : 0;
                      la.changeScreen(MidiPcmStream.field_t, 0, var6 != 0, -25528);
                    }
                    break regionExit1;
                  }
                  if (24 == var6) {
                    if (!(!this.field_g.isActivated(84))) {
                      var6 = param2 ? 1 : 0;
                      la.changeScreen(MidiPcmStream.field_t, 12, var6 != 0, -25528);
                      ce.field_a = true;
                    }
                    break regionExit1;
                  }
                  if (var6 == 25) {
                    if (this.field_g.isActivated(74) &&
                      this.isRowEnabled(-119, param0)) {
                      ((HowToPlayScreen) (StripedProgressBar.field_H[7])).a(param2, 97);
                    }
                  } else {
                    if (var6 == 26) {
                      if (this.field_g.isActivated(20) &&
                        this.isRowEnabled(-128, param0)) {
                        ((HowToPlayScreen) (StripedProgressBar.field_H[7])).b(false, param2);
                      }
                    } else {
                      if (var6 == 22) {
                        if (this.field_g.isActivated(23)) {
                          var6 = param2 ? 1 : 0;
                          la.changeScreen(MidiPcmStream.field_t, 8, var6 != 0, -25528);
                        }
                      } else {
                        if (var6 == 5) {
                          if (!(!this.field_g.isActivated(45))) {
                            ((HowToPlayScreen) (StripedProgressBar.field_H[7])).a(2, 1, param2);
                            var6 = param2 ? 1 : 0;
                            la.changeScreen(MidiPcmStream.field_t, 7, var6 != 0, -25528);
                          }
                          break regionExit1;
                        }
                        if (8 != var6) {
                          if (var6 == 4) {
                            if (!(!this.field_g.isActivated(26))) {
                              var6 = param2 ? 1 : 0;
                              la.changeScreen(MidiPcmStream.field_t, 6, var6 != 0, -25528);
                            }
                            break regionExit1;
                          }
                          if (3 == var6) {
                            if (!(!this.field_g.isActivated(62))) {
                              if (this.field_l != 9) {
                                var6 = param2 ? 1 : 0;
                                la.changeScreen(MidiPcmStream.field_t, 5, var6 != 0, -25528);
                              } else {
                                var6 = param2 ? 1 : 0;
                                stackIn_105_0 = (!gq.d(75)) ? 0 : 12;
                                la.changeScreen(stackIn_105_0, 5, var6 != 0, -25528);
                              }
                            }
                            break regionExit1;
                          }
                          if (20 == var6) {
                            var5 = 0;
                            if (this.field_g.d((byte) -111) &&
                              LinkButtonPainter.field_h > 0) {
                              var5 = 1;
                              nk.a((byte) 93, 0);
                            }
                            if (this.field_g.d(-111) &&
                              LinkButtonPainter.field_h < 256) {
                              var5 = 1;
                              nk.a((byte) 93, 256);
                            }
                            if (this.field_g.c((byte) 35)) {
                              var6 = this.getRowLeft(param0, (byte) 90) + this.getRowRight(param0, false) + (Checkbox.field_T - 120) >> 1;
                              var7_int = -var6 + ProxyAuthenticationException.field_d;
                              var8 = 256 * var7_int / 120;
                              var5 = 1;
                              if (var8 <= 0) {
                                nk.a((byte) 93, 0);
                              } else {
                                if (var8 < 256) {
                                  nk.a((byte) 93, var8);
                                } else {
                                  nk.a((byte) 93, 256);
                                }
                              }
                            }
                            if (this.field_g.e(-97) &&
                              LinkButtonPainter.field_h > 0) {
                              var5 = 1;
                              MusicPatch.e(99);
                            }
                            if (this.field_g.c(102) &&
                              LinkButtonPainter.field_h < 256) {
                              var5 = 1;
                              tj.i(32);
                            }
                            if (var5 != 0 && (!this.field_g.c((byte) 35) ||
                              !(pa.field_b <= nk.field_i))) {
                              mc.a(128, -124);
                              nk.field_i = pa.field_b + 20;
                            }
                          } else {
                            if (var6 == 21) {
                              if (this.field_g.d((byte) -94)) {
                                ArrayWidgetContainer.a(0, -114);
                              }
                              if (this.field_g.d(64)) {
                                ArrayWidgetContainer.a(256, -54);
                              }
                              if (this.field_g.c((byte) 35)) {
                                var6 = -120 + (this.getRowLeft(param0, (byte) 90) + (this.getRowRight(param0, false) + Checkbox.field_T)) >> 1;
                                var7_int = ProxyAuthenticationException.field_d - var6;
                                var8 = var7_int * 256 / 120;
                                if (var8 <= 0) {
                                  ArrayWidgetContainer.a(0, -50);
                                } else {
                                  if (256 <= var8) {
                                    ArrayWidgetContainer.a(256, -63);
                                  } else {
                                    ArrayWidgetContainer.a(var8, -109);
                                  }
                                }
                              }
                              if (this.field_g.e(-97)) {
                                fc.a((byte) -65);
                              }
                              if (!(!this.field_g.c(102))) {
                                ProxySocketConnector.e(-4767);
                              }
                              break regionExit1;
                            }
                            if (var6 == 6) {
                              if (this.field_g.isActivated(68)) {
                                if (ib.field_f != null) {
                                  ln.a(33);
                                } else {
                                  var6 = param2 ? 1 : 0;
                                  wl.field_b = false;
                                  var7 = qj.field_e;
                                  QuickChatPhraseCache.a(((BitmapFont) ((Object) var7)).maxAscent + ((BitmapFont) ((Object) var7)).maxDescent, -879, ((BitmapFont) ((Object) var7)).maxAscent, 2, 320, 8, ab.field_c, var7, 240, bi.field_g, 8, var6 != 0);
                                }
                              }
                            } else {
                              if (var6 != 9) {
                                if (var6 == 11) {
                                  if (!(!this.field_g.isActivated(95))) {
                                    ro.field_e.e(6);
                                    var6 = param2 ? 1 : 0;
                                    stackIn_162_0 = (!gq.d(71)) ? 0 : 12;
                                    la.changeScreen(stackIn_162_0, -1, var6 != 0, -25528);
                                  }
                                  break regionExit1;
                                }
                                if (var6 == 13) {
                                  if (!(!this.field_g.isActivated(117))) {
                                    if (ValidationHelpWidget.field_Y) {
                                      var6 = param2 ? 1 : 0;
                                      la.changeScreen(MidiPcmStream.field_t, -5, var6 != 0, -25528);
                                    }
                                    if (!(!DateOfBirthValidator.field_i)) {
                                      qj.a(false, 0, 11);
                                    }
                                  }
                                  break regionExit1;
                                }
                                switch (var6) {
                                  case 14:
                                    if (!this.field_g.isActivated(68)) {
                                      break;
                                    }
                                    of.field_a = 0;
                                    break;
                                  case 15:
                                    if (!this.field_g.isActivated(30)) {
                                      break;
                                    }
                                    of.field_a = 1;
                                    break;
                                  case 16:
                                    if (this.field_g.isActivated(32)) {
                                      of.field_a = 2;
                                    }
                                    break;
                                  case 17:
                                    if (!this.field_g.isActivated(109)) {
                                      break;
                                    }
                                    d.field_c = 0;
                                    break;
                                  case 18:
                                    if (!this.field_g.isActivated(32)) {
                                      break;
                                    }
                                    d.field_c = 1;
                                    break;
                                  case 23:
                                    if (!this.field_g.isActivated(106)) {
                                      break;
                                    }
                                    if (this.field_l != 10) {
                                      if (this.field_l != 8 &&
                                        this.field_l != 5 &&
                                        this.field_l != 6) {
                                        break;
                                      }
                                      gi.a(QuickChatMenu.field_Ib, this.field_l, (byte) -126);
                                      break;
                                    }
                                    stackIn_190_0 = null;
                                    if (EmailCredentials.field_k == 0) {
                                      stackIn_191_1 = 5;
                                    } else {
                                      stackIn_191_1 = 9;
                                    }
                                    gi.a((String) (stackIn_190_0), stackIn_191_1, (byte) 79);
                                    break;
                                  case 33:
                                    if (this.field_g.isActivated(40)) {
                                      ((GameResultsScreen) (this)).b((byte) 12, param2);
                                    }
                                    break;
                                  default:
                                    break;
                                  case 27:
                                    if (!this.field_g.isActivated(29)) {
                                      break;
                                    }
                                    stackIn_208_0 = !(SpriteCheckboxPainter.field_d);
                                    SpriteCheckboxPainter.field_d = stackIn_208_0;
                                    if (!SpriteCheckboxPainter.field_d) {
                                      PacketBuffer.field_o[27] = ef.field_c;
                                      break;
                                    }
                                    PacketBuffer.field_o[27] = IterableNodeHashTable.field_d;
                                    break;
                                  case 19:
                                    if (this.field_g.isActivated(77)) {
                                      d.openQuitPage(0, AudioService.a(13867));
                                    }
                                    break;
                                  case 34:
                                    if (this.field_g.isActivated(28)) {
                                      ((GameResultsScreen) (this)).a(param2, -116);
                                    }
                                    break;
                                }
                              } else {
                                if (this.field_g.isActivated(96)) {
                                  ro.field_e.showResults(false, 250, param2);
                                }
                              }
                            }
                          }
                        } else {
                          if (this.field_g.isActivated(59)) {
                            var6 = TickClock.field_a;
                            var7_int = param2 ? 1 : 0;
                            la.changeScreen(MidiPcmStream.field_t, var6, var7_int != 0, -25528);
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                if (this.field_g.isActivated(109)) {
                  ArchiveIndex.a(-3 + param0, (byte) 127);
                  var6 = param2 ? 1 : 0;
                  stackIn_61_0 = (!gq.d(90)) ? 0 : 12;
                  la.changeScreen(stackIn_61_0, -3, var6 != 0, -25528);
                }
              }
            } else {
              if (this.field_g.isActivated(6)) {
                ((OptionsScreen) (StripedProgressBar.field_H[17])).f(76);
                var6 = param2 ? 1 : 0;
                la.changeScreen(MidiPcmStream.field_t, 17, var6 != 0, -25528);
              }
            }
          } else {
            if (this.field_g.isActivated(44)) {
              em.a((byte) -101);
              var6 = param2 ? 1 : 0;
              stackIn_52_0 = (gq.d(117)) ? 12 : 0;
              la.changeScreen(stackIn_52_0, -3, var6 != 0, -25528);
            }
          }
        }
    }

    static {
        field_b = new IntrusiveDeque();
    }
}
