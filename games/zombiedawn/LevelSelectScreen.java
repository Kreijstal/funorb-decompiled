/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelSelectScreen extends MenuScreen {
    static int field_r;
    int[] field_o;
    static GlassShard[] field_t;
    private MenuSelection field_s;
    private MenuSelection field_q;
    static int field_m;
    private int[] field_n;
    static Sprite field_p;

    final static void resizeDialogLayer(int param0, int param1, byte param2) {
        if (param2 != 50) {
          return;
        }
        try {
          DropdownItemList.field_N = param0;
          PendingIntArrayRequest.field_l = param1;
          if (MessageDialogContent.field_S != null) {
            MessageDialogContent.field_S.recentreDialogs(param1, false, param0);
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "pl.P(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int findItemAt(boolean param0, int param1, int param2) {
        int stackIn_7_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_59_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        try {
          if (!param0) {
            field_r = 67;
          }
          param1 = param1 - SpriteFadeHelpers.field_b;
          param2 = param2 - LevelObstacle.field_M;
          if (VisualPropertyNode.field_p != 0) {
            stackIn_7_0 = -1;
            return stackIn_7_0;
          }
          if (ScrollViewport.field_F == -1) {
            param2 -= 80;
            var4_int = -1;
            for (var5 = 0; var5 < 4; var5++) {
              if (this.isLevelUnlocked(2 + var5, -1, 16777215) &&
                param1 > BufferedFile.field_d[var5] &&
                AccountResultHelpers.field_c[var5] + BufferedFile.field_d[var5] > param1 &&
                param2 > WidgetStyleLayer.field_n[var5] &&
                param2 < WidgetStyleLayer.field_n[var5] + ArchiveRequest.field_u[var5]) {
                var4_int = var5;
              }
            }
            if (var4_int >= 0) {
              stackIn_32_0 = 2 + var4_int;
              return stackIn_32_0;
            }
            param2 += 80;
          } else {
            var4_int = 178;
            var5 = (-var4_int + param2) / 29;
            if (param2 < var4_int ||
              var5 < 0 ||
              var5 > 6 ||
              param1 < 200 ||
              param1 > 440) {
              var5 = -1;
            }
            if (-1 != var5 &&
              this.isLevelUnlocked(var5 + 3, ScrollViewport.field_F, 16777215)) {
              stackIn_44_0 = 3 + var5;
              return stackIn_44_0;
            }
            if (ContentTransitionPhase.field_b - 11 < param1 &&
              29 + ContentTransitionPhase.field_b > param1 &&
              param2 > 120 &&
              param2 < 160) {
              stackIn_50_0 = 2;
              return stackIn_50_0;
            }
          }
          if (param2 > this.field_k &&
            param2 < this.field_k + 29 + 5 &&
            param1 > this.field_g &&
            param1 < this.field_g + this.field_i) {
            return 0;
          }
          stackIn_59_0 = -1;
          return stackIn_59_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var4), "pl.BB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void renderMapSnapshot(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          FullscreenErrorDialog.field_T = new Sprite(640, 341);
          FullscreenErrorDialog.field_T.setAsRenderTarget();
          if (param1 != -257) {
            return;
          }
          Rasterizer.clear();
          this.drawChapterMap(0, 0, param1 ^ 260);
          if (param0 >= 0) {
            Rasterizer.blurRectangle(3, 3, 0, 0, 640, 341);
            this.drawChapterPanel(0, 0, 0, param0);
            DisplayState.field_f.makeRasterTarget(125);
          } else {
            DisplayState.field_f.makeRasterTarget(125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var3), "pl.A(" + param0 + ',' + param1 + ')');
        }
    }

    private final void drawChapterIcon(int param0, int param1, int param2, int param3, boolean param4) {
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        try {
          if (PendingIntArrayRequest.field_q == param2) {
            WhirlpoolHasher.field_i[CutsceneStateHelpers.field_e][param2].drawTransparentWithOpacity(param3 + BufferedFile.field_d[param2], param1 + WidgetStyleLayer.field_n[param2], 248, 16776960);
            RandomAccessCacheFile.field_g.drawAdditive(-10 + (BufferedFile.field_d[param2] + param3), param1 + (-10 + WidgetStyleLayer.field_n[param2]), LoginMethod.field_f[LoginPacketHelpers.field_a]);
          } else {
            if (param4) {
              PatrollingGuard.field_Tb[CutsceneStateHelpers.field_e][param2].drawWithOpacity(param3 + BufferedFile.field_d[param2], WidgetStyleLayer.field_n[param2] + param1, 100);
            } else {
              WhirlpoolHasher.field_i[CutsceneStateHelpers.field_e][param2].drawTransparent(BufferedFile.field_d[param2] + param3, WidgetStyleLayer.field_n[param2] + param1);
            }
          }
          if (!param4 &&
            ReflectionCheckRequest.field_k[param2] != 0) {
            stackIn_14_0 = (PendingIntArrayRequest.field_q == param2) ? 2 : 0;
            var6_int = stackIn_14_0;
            ProgressMessageDialog.field_jb.drawCenteredAlpha(IntrusiveDequeCursor.field_a[CutsceneStateHelpers.field_e][param2], Alien.field_T[param2] + param3, SecondaryNodeDequeIterator.field_b[param2] + param1, var6_int, -1, ReflectionCheckRequest.field_k[param2]);
          }
          if (PendingIntArrayRequest.field_q == param2 &&
            !this.field_b.field_j) {
            if (ContentTransitionDialog.field_X[param2] != -1) {
              ClientProtocolStage.field_d.drawMirrored(ContentTransitionDialog.field_X[param2], RopeLadder.field_G[param2] + param1);
            }
            if (IntrusiveDequeCursor.field_c[param2] != -1 &&
              this.isLevelUnlocked(param2 + 3, -1, 16777215)) {
              ClientProtocolStage.field_d.drawTransparent(IntrusiveDequeCursor.field_c[param2], param1 + RopeLadder.field_G[param2]);
            }
          }
          if (param0 <= 68) {
            this.handleMapClick((byte) -30, 7, 28);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var6), "pl.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    LevelSelectScreen(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6, int[] param7) {
        super(param0, param1, param2, param3, param4, param5, param6);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_q = this.field_b;
          this.field_n = this.field_h;
          this.field_o = param7;
          this.field_s = new MenuSelection(param7.length);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("pl.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_0 = stackIn_6_0;
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param7 == null) {
            stackIn_11_0 = stackIn_10_0;
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = stackIn_6_0;
            stackIn_11_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void handleNavigationKeys(int param0) {
        MenuSelection stackIn_40_0 = null;
        MenuSelection stackIn_42_0 = null;
        MenuSelection stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_58_0 = 0;
        MenuSelection stackIn_70_0 = null;
        int stackIn_71_1 = 0;
        MenuSelection stackIn_81_0 = null;
        MenuSelection stackIn_83_0 = null;
        MenuSelection stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        try {
          var2_int = this.field_b.field_d;
          if (param0 != -31645) {
            field_m = -125;
          }
          if (48 == PasswordValidator.field_i &&
            AchievementSubmission.field_p[82] &&
            2 <= SavedDataRequest.field_j) {
            IntroSpeedHelpers.field_b[CutsceneStateHelpers.field_e] = 27;
          }
          if (-1 != ScrollViewport.field_F) {
            var3 = LevelObstacle.field_N;
            if ((PasswordValidator.field_i == 99 ||
              PasswordValidator.field_i == 98) && (var2_int == 0 ||
              var2_int == 1)) {
              LevelObstacle.field_N = var2_int;
            }
            boolean decompiledFrameCompleted0 = true;
            if (PasswordValidator.field_i == 98) {
              if (0 <= var2_int) {
                stackIn_58_0 = 0;
                while (true) {
                  if (stackIn_58_0 != this.field_b.field_d &&
                    this.field_b.field_d != 1) {
                    if (this.field_b.field_d != 2) {
                      this.field_b.setSelectedIndex(-1 + this.field_b.field_d, 69);
                    } else {
                      stackIn_70_0 = this.field_b;
                      if (var3 != 0 &&
                        var3 != 1) {
                        stackIn_71_1 = 0;
                      } else {
                        stackIn_71_1 = var3;
                      }
                      ((MenuSelection) (Object) stackIn_70_0).setSelectedIndex(stackIn_71_1, -111);
                    }
                  } else {
                    this.field_b.setSelectedIndex(-1 + this.field_b.field_h, -102);
                  }
                  if (this.isLevelUnlocked(this.field_b.field_d, ScrollViewport.field_F, 16777215)) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  stackIn_58_0 = 0;
                }
              }
              if (decompiledFrameCompleted0) {
                this.field_b.setSelectedIndex(0, 63);
              }
            }
            boolean decompiledFrameRemainder2 = true;
            if (PasswordValidator.field_i == 99) {
              if (var2_int >= 0) {
                do {
                  if (-1 + this.field_b.field_h != this.field_b.field_d) {
                    if (this.field_b.field_d != 0 &&
                      this.field_b.field_d != 1) {
                      this.field_b.setSelectedIndex(this.field_b.field_d + 1, -76);
                    } else {
                      this.field_b.setSelectedIndex(2, param0 + 31557);
                    }
                  } else {
                    boolean decompiledFrameRemainder1 = true;
                    stackIn_81_0 = this.field_b;
                    if (var3 != 0) {
                      stackIn_83_0 = stackIn_81_0;
                      if (var3 != 1) {
                        stackIn_84_0 = stackIn_83_0;
                        stackIn_84_1 = 0;
                        decompiledFrameRemainder1 = false;
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      stackIn_84_0 = stackIn_81_0;
                      stackIn_84_1 = var3;
                    }
                    ((MenuSelection) (Object) stackIn_84_0).setSelectedIndex(stackIn_84_1, param0 ^ 31699);
                  }
                } while (!this.isLevelUnlocked(this.field_b.field_d, ScrollViewport.field_F, 16777215));
                decompiledFrameRemainder2 = false;
              }
              else {
                this.field_b.setSelectedIndex(0, -75);
              }
            }
            if (PasswordValidator.field_i == 97 ||
              96 == PasswordValidator.field_i) {
              if (var2_int == 0) {
                this.field_b.setSelectedIndex(1, 126);
              } else {
                if (var2_int != 1 &&
                  var2_int >= 0) {
                  this.field_b.pollKeyboardCode(102);
                  return;
                }
                this.field_b.setSelectedIndex(0, 97);
              }
            }
          } else {
            if (PasswordValidator.field_i == 96) {
              if (var2_int < 2) {
                this.field_b.setSelectedIndex(0, -125);
              } else {
                if (2 < var2_int) {
                  this.field_b.setSelectedIndex(this.field_b.field_d - 1, 107);
                }
              }
            }
            if (PasswordValidator.field_i == 97) {
              if (var2_int >= 2) {
                if (var2_int < 5 &&
                  this.isLevelUnlocked(var2_int + 1, -1, 16777215)) {
                  this.field_b.setSelectedIndex(1 + var2_int, -81);
                }
              } else {
                this.field_b.setSelectedIndex(0, -99);
              }
            }
            if (PasswordValidator.field_i == 99) {
              if (var2_int >= 2) {
                LevelObstacle.field_N = var2_int;
              }
              this.field_b.setSelectedIndex(0, param0 ^ -31697);
            }
            if (PasswordValidator.field_i == 98) {
              if (-1 != var2_int) {
                if (var2_int < 2) {
                  boolean decompiledFrameRemainder0 = true;
                  stackIn_40_0 = this.field_b;
                  if (LevelObstacle.field_N > 1) {
                    stackIn_42_0 = stackIn_40_0;
                    if (6 > LevelObstacle.field_N) {
                      stackIn_43_0 = stackIn_42_0;
                      stackIn_43_1 = LevelObstacle.field_N;
                      decompiledFrameRemainder0 = false;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    stackIn_43_0 = stackIn_40_0;
                    stackIn_43_1 = 2;
                  }
                  ((MenuSelection) (Object) stackIn_43_0).setSelectedIndex(stackIn_43_1, 120);
                }
              } else {
                this.field_b.setSelectedIndex(0, param0 + 31733);
              }
            }
          }
          this.field_b.pollKeyboardCode(102);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "pl.F(" + param0 + ')');
        }
    }

    final void activateItem(boolean param0, int param1, int param2) {
        GameWorld stackIn_44_0 = null;
        GameWorld stackIn_44_1 = null;
        int stackIn_44_2 = 0;
        GameWorld stackIn_45_0 = null;
        GameWorld stackIn_45_1 = null;
        int stackIn_45_3 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        try {
          if (this.field_h.length <= param1) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          var4_int = this.field_h[param1];
          var5 = var4_int;
          if (var5 == 26) {
            if (this.field_b.isActivated(-120)) {
              this.setOpenChapter(50, -1);
            }
          } else {
            if (var5 != 22 &&
              var5 != 23 &&
              var5 != 24 &&
              25 != var5) {
              if (27 != var5 &&
                28 != var5 &&
                var5 != 29 &&
                30 != var5 &&
                var5 != 31 &&
                var5 != 32 &&
                33 != var5) {
                super.activateItem(param0, param1, -8512);
              } else {
                if (!(!this.field_b.isActivated(-121))) {
                  var5 = ScrollViewport.field_F + 4 * CutsceneStateHelpers.field_e;
                  var6 = var4_int - 27;
                  stackIn_44_0 = null;
                  stackIn_44_1 = null;
                  stackIn_44_2 = var5;
                  if (var6 != 6) {
                    stackIn_45_0 = null;
                    stackIn_45_1 = null;
                    stackIn_45_3 = var6;
                  } else {
                    stackIn_45_0 = null;
                    stackIn_45_1 = null;
                    stackIn_45_3 = -1;
                  }
                  CheckboxPainter.field_b = new GameWorld(stackIn_44_2, stackIn_45_3);
                  if (var6 == 0 &&
                    var5 == 0) {
                    ((IntroCutsceneScreen) (SweepingSpotlight.getScreen(12, 81))).startIntro(-124);
                    UiResourceHelpers.switchScreenMusic(true, true, 12);
                  } else {
                    UiResourceHelpers.switchScreenMusic(true, true, 0);
                  }
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (this.field_b.isActivated(-122)) {
                this.setOpenChapter(param2 + 8562, var4_int - 22);
              }
            }
          }
          if (param2 != -8512) {
            field_t = (GlassShard[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var4), "pl.MA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void resetChapterHighlights(byte param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ZombieDawn.field_J;
        try {
          HotspotTextWidget.field_J = -1;
          PendingIntArrayRequest.field_q = -1;
          if (param0 < 83) {
            this.drawChapterPanel(114, -11, -24, -34);
          }
          if (param1) {
            ScrollViewport.field_F = -1;
            this.field_b = this.field_q;
            this.field_h = this.field_n;
          }
          for (var3_int = 0; 4 > var3_int; var3_int++) {
            ReflectionCheckRequest.field_k[var3_int] = 128;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var3), "pl.L(" + param0 + ',' + param1 + ')');
        }
    }

    final static void setSessionCookie(String param0, byte param1, java.applet.Applet param2) {
        try {
          String var6 = null;
          String var5 = null;
          String var4 = null;
          String var7 = null;
          int var3_int = 0;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          Mover.field_H = param0;
          try {
            var6 = param2.getParameter("cookieprefix");
            var5 = var6;
            var5Lifetime1 = var6;
            var4 = param2.getParameter("cookiehost");
            var5Lifetime2 = var4;
            var5Lifetime3 = var4;
            var7 = var6 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
            var5Lifetime4 = var7;
            var5Lifetime5 = var7;
            var5Lifetime6 = var7;
            if (param0.length() == 0) {
              var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            }
            JavaScriptBridge.evalJavaScript("document.cookie=\"" + var5Lifetime6 + "\"", param2, (byte) 116);
          } catch (Throwable throwable) {
          }
          var3_int = 60 % ((6 - param1) / 62);
          NodeHashTableIterator.updatePageLinks(param2, 1);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void drawScreen(byte param0) {
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          super.drawScreen((byte) -68);
          if (ScrollViewport.field_F != -1) {
            this.drawChapterPanel(0, SpriteFadeHelpers.field_b, 80 + LevelObstacle.field_M, ScrollViewport.field_F);
          } else {
            this.drawChapterMap(80 + LevelObstacle.field_M, SpriteFadeHelpers.field_b, -5);
          }
          if (param0 > -35) {
            field_r = 53;
          }
          if (0 != VisualPropertyNode.field_p) {
            var2_int = VisualPropertyNode.field_p << 4;
            var3 = var2_int * 2;
            if (var3 > 256) {
              var3 = 256;
            }
            if (var2_int >= 128) {
              stackIn_15_0 = var2_int * 2 - 256;
            } else {
              stackIn_15_0 = 0;
            }
            var4 = stackIn_15_0;
            FullscreenErrorDialog.field_T.drawWithVerticalAlphaGradient(SpriteFadeHelpers.field_b, LevelObstacle.field_M + 80, var3, var4);
          }
          TrafficVehicle.field_H.drawTransparent(SpriteFadeHelpers.field_b + 0, 80 + LevelObstacle.field_M);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "pl.B(" + param0 + ')');
        }
    }

    final void handleMapClick(byte param0, int param1, int param2) {
        try {
          int var4_int = -99 % ((-61 - param0) / 34);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "pl.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void drawChapterMap(int param0, int param1, int param2) {
        Object stackIn_3_0;
        int stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        int stackIn_3_4;
        boolean stackIn_4_5 = false;
        Object stackIn_7_0;
        int stackIn_7_1;
        int stackIn_7_2;
        int stackIn_7_3;
        int stackIn_7_4;
        boolean stackIn_8_5 = false;
        Object stackIn_11_0;
        int stackIn_11_1;
        int stackIn_11_2;
        int stackIn_11_3;
        int stackIn_11_4;
        boolean stackIn_12_5 = false;
        Object stackIn_15_0;
        int stackIn_15_1;
        int stackIn_15_2;
        int stackIn_15_3;
        int stackIn_15_4;
        Object stackIn_16_0;
        boolean stackIn_16_5;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          SoundEffectPlayer.field_a[CutsceneStateHelpers.field_e].drawTransparent(param1 - param2, 5 + param0);
          stackIn_3_0 = this;
          stackIn_3_1 = 70;
          stackIn_3_2 = param0;
          stackIn_3_3 = 0;
          stackIn_3_4 = param1;
          stackIn_4_5 = !(this.isLevelUnlocked(2, -1, param2 + 16777220));
          this.drawChapterIcon(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4, stackIn_4_5);
          stackIn_7_0 = this;
          stackIn_7_1 = 82;
          stackIn_7_2 = param0;
          stackIn_7_3 = 1;
          stackIn_7_4 = param1;
          stackIn_8_5 = !(this.isLevelUnlocked(3, -1, 16777215));
          this.drawChapterIcon(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_8_5);
          stackIn_11_0 = this;
          stackIn_11_1 = 69;
          stackIn_11_2 = param0;
          stackIn_11_3 = 3;
          stackIn_11_4 = param1;
          stackIn_12_5 = !(this.isLevelUnlocked(5, -1, 16777215));
          this.drawChapterIcon(stackIn_11_1, stackIn_11_2, stackIn_11_3, stackIn_11_4, stackIn_12_5);
          stackIn_15_0 = this;
          stackIn_15_1 = 115;
          stackIn_15_2 = param0;
          stackIn_15_3 = 2;
          stackIn_15_4 = param1;
          if (this.isLevelUnlocked(4, -1, 16777215)) {
            stackIn_16_0 = this;
            stackIn_16_5 = false;
          } else {
            stackIn_16_0 = this;
            stackIn_16_5 = true;
          }
          this.drawChapterIcon(stackIn_15_1, stackIn_15_2, stackIn_15_3, stackIn_15_4, stackIn_16_5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var4), "pl.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void handleEscape(int param0) {
        boolean stackIn_12_0 = false;
        boolean stackIn_12_1 = false;
        int stackIn_13_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -26931) {
            this.resetChapterHighlights((byte) -31, true);
          }
          if (VisualPropertyNode.field_p != 0) {
            return;
          }
          if (ScrollViewport.field_F == -1) {
            stackIn_12_0 = false;
            stackIn_12_1 = true;
            if (OctaveNoiseMap.field_j <= 0) {
              stackIn_13_2 = 1;
            } else {
              stackIn_13_2 = 13;
            }
            UiResourceHelpers.switchScreenMusic(stackIn_12_0, stackIn_12_1, stackIn_13_2);
          } else {
            this.setOpenChapter(50, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "pl.M(" + param0 + ')');
        }
    }

    private final void drawChapterPanel(int param0, int param1, int param2, int param3) {
        int var12 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        PaletteBitmapFont stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_22_3;
        PaletteBitmapFont stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        String stackIn_44_0 = null;
        int stackIn_56_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        Object var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var16Lifetime1;
        var17 = ZombieDawn.field_J;
        try {
          stackIn_5_0 = (HotspotTextWidget.field_J != -2) ? 8912896 : 16711680;
          var5_int = stackIn_5_0;
          stackIn_9_0 = (HotspotTextWidget.field_J != -2) ? 15658734 : 16777215;
          var6 = stackIn_9_0;
          var7 = 13421721;
          var8 = 10079351;
          var9 = 16777215;
          FullscreenErrorDialog.field_T.drawWithOffsets(param1, param2);
          var10 = 1;
          Rasterizer.fillRectangleBlended(param1 + StatefulWidgetRenderer.field_s, 35 + param2, HuffmanCodec.field_c, 280, 0, 128);
          if (ScreechEffect.field_k.field_r >= HuffmanCodec.field_c) {
            ScreechEffect.field_k.drawTransparent(param1 + 195, 30 + param2);
          } else {
            Rasterizer.setClip(0, 0, 320 + param1, DropdownList.field_P);
            ScreechEffect.field_k.drawTransparent(StatefulWidgetRenderer.field_s + param1, 30 + param2);
            Rasterizer.setClip(320 + param1, 0, WhirlpoolHasher.field_e, DropdownList.field_P);
            ScreechEffect.field_k.drawTransparent(param1 - (-ArchiveLoadStep.field_d + ScreechEffect.field_k.field_r), 30 + param2);
            Rasterizer.resetClip();
          }
          Rasterizer.fillRoundedRectangle(param1 + ContentTransitionPhase.field_b, param2 + 47, 23, 23, 3, var5_int);
          if (HotspotTextWidget.field_J == -2) {
            Rasterizer.drawRoundedRectangle(ContentTransitionPhase.field_b + param1, 47 + param2, 23, 23, 3, 16764108);
          }
          CacheEntry.field_q.drawStringCentered("X", 11 + (param1 + ContentTransitionPhase.field_b), param2 + 64, var6, 65793);
          if (9 == param3) {
            stackIn_21_0 = ProgressMessageDialog.field_jb;
            stackIn_21_1 = FullscreenMembershipDialog.field_Y;
            stackIn_21_2 = param1 + 310;
            if (3 == param3) {
              stackIn_22_3 = 5;
            } else {
              stackIn_22_3 = 0;
            }
            ((PaletteBitmapFont) (Object) stackIn_21_0).drawStringCentered(stackIn_21_1, stackIn_21_2 - stackIn_22_3, 85 + param2, 2, 65793);
            CacheEntry.field_q.drawParagraph(ArchivePreloader.field_h, param1 + 210, 118 + param2, -30 + ScreechEffect.field_k.field_r, 120, 16777215, 65793, 1, 1, 20);
            return;
          }
          stackIn_27_0 = ProgressMessageDialog.field_jb;
          stackIn_27_1 = WorldNames.field_c[CutsceneStateHelpers.field_e][param3];
          if (param3 != 3) {
            stackIn_28_2 = 0;
          } else {
            stackIn_28_2 = 5;
          }
          ((PaletteBitmapFont) (Object) stackIn_27_0).drawStringCentered(stackIn_27_1, -stackIn_28_2 + (310 + param1), param2 + 85, 2, 65793);
          var11 = param3 + CutsceneStateHelpers.field_e * 4;
          for (var12 = param0; var12 < 7; var12++) {
            stackIn_34_0 = (HotspotTextWidget.field_J == var12) ? 1 : 0;
            var13 = stackIn_34_0;
            stackIn_38_0 = (this.isLevelUnlocked(3 + var12, param3, 16777215)) ? 0 : 1;
            var14 = stackIn_38_0;
            var15 = null;
            if (var14 != 0) {
              var15 = MembershipPromotionScreen.field_n;
            } else {
              if (var12 != 6) {
                if (var12 < 6) {
                  var15 = WidgetStyleLayer.field_w[var11][var12];
                }
              } else {
                if (param3 != 3) {
                  stackIn_44_0 = Alien.field_S;
                } else {
                  stackIn_44_0 = HotspotTextWidget.field_M;
                }
                var15 = stackIn_44_0;
              }
            }
            var15 = BlastAffectedObject.substituteTemplateArguments(param0 + 1938762664, ScriptedMinigunner.field_Zb, new String[]{Integer.toString(1 + var12), (String) (var15)});
            var16 = 0;
            if (var13 == 0) {
              if (var14 == 0) {
                stackIn_56_0 = (var10 == 0) ? var8 : var7;
                var16Lifetime1 = stackIn_56_0;
              } else {
                var16Lifetime1 = 7829367;
              }
            } else {
              var16Lifetime1 = var9;
            }
            if (var13 != 0) {
              Rasterizer.fillVerticalGradientAdditive(5 + StatefulWidgetRenderer.field_s + param1, param2 + 118 - 25 + var12 * 29, HuffmanCodec.field_c - 10, 20, 0, 26112);
              Rasterizer.fillVerticalGradientAdditive(5 + StatefulWidgetRenderer.field_s + param1, 29 * var12 + (param2 + 113), -10 + HuffmanCodec.field_c, 20, 26112, 0);
            }
            stackIn_65_0 = (var10 != 0) ? 0 : 1;
            var10 = stackIn_65_0;
            CacheEntry.field_q.drawString((String) (var15), 220 + param1, param2 + (118 + var12 * 29), var16Lifetime1, 65793);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var5), "pl.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void handleInput(byte param0, boolean param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        var5 = ZombieDawn.field_J;
        try {
          super.handleInput((byte) -113, param1);
          if (VisualPropertyNode.field_p != 0) {
            if (!CheckboxWidget.field_F) {
              VisualPropertyNode.field_p = VisualPropertyNode.field_p - 1;
              return;
            }
            VisualPropertyNode.field_p = VisualPropertyNode.field_p + 1;
            if (VisualPropertyNode.field_p != 16) {
              return;
            }
            ScrollViewport.field_F = IterableNodeHashTable.field_b;
            this.renderMapSnapshot(-1, -257);
            FullscreenErrorDialog.field_T.setAsRenderTarget();
            Rasterizer.blurRectangle(3, 3, 0, 0, 640, 341);
            DisplayState.field_f.makeRasterTarget(-128);
            VisualPropertyNode.field_p = 0;
          }
          if (ScrollViewport.field_F != -1) {
            var3_int = this.field_b.field_d;
            HotspotTextWidget.field_J = -1;
            if (var3_int != 2) {
              if (var3_int > 2) {
                HotspotTextWidget.field_J = var3_int - 3;
              }
            } else {
              HotspotTextWidget.field_J = -2;
            }
            return;
          }
          if (OctaveNoiseMap.field_j <= 0) {
            fieldTemp$0 = Alien.field_db + 1;
            Alien.field_db = Alien.field_db + 1;
            if (50 == fieldTemp$0) {
              Alien.field_db = 0;
            }
          }
          for (var3_intLifetime1 = 0; var3_intLifetime1 < 4; var3_intLifetime1++) {
            if (var3_intLifetime1 != PendingIntArrayRequest.field_q) {
              ReflectionCheckRequest.field_k[var3_intLifetime1] = ReflectionCheckRequest.field_k[var3_intLifetime1] - 30;
            } else {
              ReflectionCheckRequest.field_k[var3_intLifetime1] = ReflectionCheckRequest.field_k[var3_intLifetime1] + 30;
            }
            if (ReflectionCheckRequest.field_k[var3_intLifetime1] < 128) {
              ReflectionCheckRequest.field_k[var3_intLifetime1] = 128;
            }
            if (ReflectionCheckRequest.field_k[var3_intLifetime1] > 256) {
              ReflectionCheckRequest.field_k[var3_intLifetime1] = 256;
            }
          }
          var4 = 87 % ((param0 + 39) / 61);
          fieldTemp$1 = LoginPacketHelpers.field_a + 1;
          LoginPacketHelpers.field_a = LoginPacketHelpers.field_a + 1;
          if (fieldTemp$1 >= 50) {
            LoginPacketHelpers.field_a = 0;
          }
          var3_intLifetime2 = this.field_b.field_d;
          if (var3_intLifetime2 < 2) {
            PendingIntArrayRequest.field_q = -1;
          } else {
            if (var3_intLifetime2 - 2 != PendingIntArrayRequest.field_q) {
              LevelHud.renderLevelIconGlow(-2 + var3_intLifetime2, (byte) -31);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var3), "pl.S(" + param0 + ',' + param1 + ')');
        }
    }

    private final void setOpenChapter(int param0, int param1) {
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          this.resetChapterHighlights((byte) 107, false);
          if (param0 != 50) {
            this.field_o = (int[]) null;
          }
          if (param1 == -1) {
            var3_int = ScrollViewport.field_F + 2;
            this.renderMapSnapshot(ScrollViewport.field_F, -257);
            this.field_h = this.field_n;
            this.field_b = this.field_q;
            CheckboxWidget.field_F = false;
            VisualPropertyNode.field_p = 15;
            this.field_b.initializeSelection(this.field_s.field_j, (byte) -125, this.findItemAt(true, KeyStateHelpers.field_b, FadingModalPanel.field_K), var3_int);
            ScrollViewport.field_F = -1;
          } else {
            IterableNodeHashTable.field_b = param1;
            CheckboxWidget.field_F = true;
            this.field_h = this.field_o;
            this.field_b = this.field_s;
            VisualPropertyNode.field_p = 1;
            this.field_b.initializeSelection(this.field_q.field_j, (byte) -114, this.findItemAt(true, KeyStateHelpers.field_b, FadingModalPanel.field_K), 3);
            if (param1 != 9) {
              stackIn_7_0 = ProgressMessageDialog.field_jb.textWidth(WorldNames.field_c[CutsceneStateHelpers.field_e][param1]) + 80;
            } else {
              stackIn_7_0 = 0;
            }
            HuffmanCodec.field_c = stackIn_7_0;
            if (ScreechEffect.field_k.field_r > HuffmanCodec.field_c) {
              HuffmanCodec.field_c = ScreechEffect.field_k.field_r;
            }
            ArchiveLoadStep.field_d = 320 + (HuffmanCodec.field_c >> 1);
            StatefulWidgetRenderer.field_s = 320 - (HuffmanCodec.field_c >> 1);
            ContentTransitionPhase.field_b = ArchiveLoadStep.field_d - 34;
            this.renderMapSnapshot(param1, param0 ^ -307);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var3), "pl.C(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean isLevelUnlocked(int param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5Lifetime1;
        try {
          if (param2 != 16777215) {
            this.field_o = (int[]) null;
          }
          var4_int = IntroSpeedHelpers.field_b[CutsceneStateHelpers.field_e];
          if (param1 != -1) {
            if (param0 <= 3) {
              return true;
            }
            param0 -= 3;
            var5 = param0 + 7 * param1;
            return !(var5 > var4_int);
          }
          if (param0 != 0 &&
            param0 != 1 &&
            param0 != 2) {
            param0 = -2 + param0;
            var5Lifetime1 = var4_int / 7;
            if (var5Lifetime1 >= 8) {
              var5Lifetime1 = 7;
            }
            if (OctaveNoiseMap.field_j <= 0 &&
              param0 > 3) {
              return false;
            }
            return !(var5Lifetime1 < param0);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var4), "pl.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        try {
          field_t = null;
          field_p = null;
          if (param0 > -78) {
            field_m = -95;
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "pl.N(" + param0 + ')');
        }
    }

    static {
        field_r = 6080;
        field_m = 0;
    }
}
