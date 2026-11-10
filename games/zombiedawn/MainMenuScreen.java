/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MainMenuScreen extends MenuScreen {
    static Sprite field_t;
    static String field_n;
    private int field_s;
    static int field_p;
    private int field_q;
    static int field_o;
    static String field_r;
    private int field_m;

    final int getItemLeft(int param0, int param1) {
        if (param1 != 6) {
          return -32;
        }
        return SpriteFadeHelpers.field_b + this.field_s;
    }

    final void drawScreen(byte param0) {
        int var2;
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = ZombieDawn.field_J;
        NetworkArchiveRequest.tickSharedAnimations(0);
        if (param0 > -35) {
          this.field_m = -72;
        }
        Rasterizer.setClip(5, 5, -5 + WhirlpoolHasher.field_e, -5 + DropdownList.field_P);
        FullscreenFocusCanvas.updateBackdropActors(30);
        ArmedHuman.drawDimmedBlurredRect(6, -(2 * this.field_q) + 640, -11 + DropdownList.field_P, 3 + (this.field_q + SpriteFadeHelpers.field_b), false);
        FullscreenFocusCanvas.field_d.draw((byte) -55);
        if (DropdownList.field_P != 480) {
          var2 = -5 + DropdownList.field_P;
          for (var3 = 6; var3 < var2; var3 += 130) {
            SavedDataRequest.field_i.drawTransparent(SpriteFadeHelpers.field_b + this.field_q, var3);
          }
          for (var3Lifetime1 = 6; var3Lifetime1 < var2; var3Lifetime1 += 128) {
            IntKeyLookup.field_a.drawTransparent(640 + SpriteFadeHelpers.field_b - this.field_q, var3Lifetime1);
          }
        } else {
          SavedDataRequest.field_i.drawTransparent(this.field_q + SpriteFadeHelpers.field_b, 136);
          SavedDataRequest.field_i.drawTransparent(this.field_q + SpriteFadeHelpers.field_b, 6);
          IntKeyLookup.field_a.drawTransparent(640 + (SpriteFadeHelpers.field_b - this.field_q), 6);
          IntKeyLookup.field_a.drawTransparent(-this.field_q + SpriteFadeHelpers.field_b + 640, 134);
        }
        Rasterizer.resetClip();
        NameAvailabilityValidator.field_g.drawTransparent(SpriteFadeHelpers.field_b, LevelObstacle.field_M / 2);
        super.drawScreen((byte) -112);
    }

    final void fitWidthToLabels(byte param0) {
        int var5 = 0;
        int[] stackIn_5_0 = null;
        int var2;
        int var3;
        int[] var4;
        String var6;
        int var7;
        int var8;
        int var9;
        String var10;
        int[] var11;
        int[] var12;
        var9 = ZombieDawn.field_J;
        this.field_m = 0;
        var2 = 0;
        var3 = -77 / ((14 - param0) / 54);
        while (var2 < 2) {
          if (var2 == 0) {
            stackIn_5_0 = SweepingSpotlight.getScreen(1, 122).field_h;
          } else {
            stackIn_5_0 = SweepingSpotlight.getScreen(14, 73).field_h;
          }
          var12 = stackIn_5_0;
          var11 = var12;
          var4 = var11;
          for (var5 = 0; var12.length > var5; var5++) {
            var10 = InputValidationResult.field_b[var12[var5]];
            var7 = ProgressMessageDialog.field_jb.textWidth(var10);
            if (var12[var5] == 37) {
              var8 = ProgressMessageDialog.field_jb.textWidth(ContentTransitionPhase.field_a[1]);
              if (var7 < var8) {
                var6 = ContentTransitionPhase.field_a[1];
                var7 = var8;
              }
            }
            if (var12[var5] == 12 ||
              var12[var5] == 13) {
              var7 += 140;
            }
            if (var7 > this.field_m) {
              this.field_m = var7;
            }
          }
          var2++;
        }
        this.field_s = 320 - (this.field_m >> 1);
        this.field_q = this.field_s - 20;
        if (null == FullscreenFocusCanvas.field_d) {
          FullscreenFocusCanvas.field_d = new PowerupBar(true);
        }
    }

    MainMenuScreen(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    final void handleInput(byte param0, boolean param1) {
        super.handleInput((byte) 95, param1);
        FullscreenFocusCanvas.field_d.updateHover(FadingModalPanel.field_K, KeyStateHelpers.field_b, true);
        int var3 = 87 % ((-39 - param0) / 61);
    }

    final static void setCookie(boolean param0, java.applet.Applet param1, long param2, String param3, String param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              if (!param0) {
                MainMenuScreen.releaseStatics(68);
              }
              var8 = param1.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param3 + "=" + param4 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (0L > param2) {
                var7Lifetime4 = var9 + "; Discard;";
              } else {
                var7Lifetime4 = var9 + "; Expires=" + SpriteCheckboxPainter.formatCookieDate(2147483647, MonotonicClock.monotonicTimeMillis(-22826) + param2 * 1000L) + "; Max-Age=" + param2;
              }
              JavaScriptBridge.evalJavaScript("document.cookie=\"" + var7Lifetime4 + "\"", param1, (byte) 125);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("pg.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param4 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void attachInputListeners(java.awt.Component param0, byte param1) {
        try {
          param0.addMouseListener(LoginConnectionHelpers.field_b);
          param0.addMouseMotionListener(LoginConnectionHelpers.field_b);
          param0.addFocusListener(LoginConnectionHelpers.field_b);
          if (param1 != 66) {
            field_n = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "pg.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != -5) {
          String var2 = (String) null;
          MainMenuScreen.setCookie(true, (java.applet.Applet) null, 14L, (String) null, (String) null);
        }
        field_r = null;
        field_t = null;
        field_n = null;
    }

    final int getItemRight(boolean param0, int param1) {
        if (!param0) {
          this.field_m = -123;
        }
        return this.field_m + (this.field_s + SpriteFadeHelpers.field_b);
    }

    final static void shutdownDisplayAndInput(int param0) {
        FullscreenExitHelpers.exitFullscreen((byte) -71);
        if (null != IntrusiveDequeCursor.field_d) {
          SpatialObject.detachCanvasInput((byte) -46, IntrusiveDequeCursor.field_d);
        }
        StationaryRifleman.releaseKeyHandler((byte) -101);
        PatrollingGuard.releaseMouseHandler(-2);
        ConnectionCleanupHelpers.closeArchiveConnections(param0 ^ 1);
        if (DisplaySettingsDialog.isConnectionReady(-83)) {
          LinkTextPainter.field_e.writeCipheredByte(11, 1);
          CheckboxPainter.flushOutgoingPackets((byte) -46, 0);
        }
        SessionSocketHelpers.closeSessionSocket(param0);
    }

    static {
        field_n = "Retry (<%0> Left)";
        field_r = "Names should contain a maximum of 12 characters";
    }
}
