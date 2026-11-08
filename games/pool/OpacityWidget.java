/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpacityWidget extends SingleChildWidget {
    static String youCanSpectate;
    static boolean[] field_Q;
    static int[] field_O;
    int opacity;
    static RasterBuffer field_P;
    static String benefitsPrice;
    static String statusWantsToDraw;

    final static void releaseSpriteDecoderArrays(int obfuscationGuard) {
        IntrusiveNode.field_h = null;
        if (obfuscationGuard != -1) {
          benefitsPrice = (String) null;
        }
        LimitedRandomAccessFile.field_b = (byte[][]) null;
        AccountTextSupport.field_f = null;
        LoginRequestSupport.field_d = null;
        LinkButtonPainter.field_a = null;
        AchievementsScreen.field_I = null;
    }

    final static void searchAllowedGameOptions(int param0, int param1, int param2, boolean param3, LobbyGame param4, int param5, int param6, boolean param7) {
        AlignedIconLabel[][] stackIn_4_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_107_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        AlignedIconLabel[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        AlignedIconLabel var13_ref_uo = null;
        int var14 = 0;
        int var15 = 0;
        AlignedIconLabel[] var16 = null;
        AlignedIconLabel[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int var10_intLifetime1;
        int var13Lifetime1;
        int var10_intLifetime2;
        var15 = Pool.field_O;
        try {
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted1 = true;
          if (param5 >= param1) {
            var8_int = 1;
            var9 = 0;
            while (true) {
              if (var9 >= ArchiveLoadStep.field_m.length) {
                if (var8_int == 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
                PoolUiText.field_b = true;
                decompiledFrameCompleted1 = false;
                break;
              }
              var19 = ArchiveLoadStep.field_m[var9];
              var18 = var19;
              var10 = var18;
              var11 = 0;
              var12 = 0;
              scanLoop1: while (true) {
                if (var19.length <= var12) {
                  if (var11 == 0 &&
                    LogoFinalFrameLoader.field_c != param5) {
                    break scanLoop1;
                  }
                  for (var12 = 0; var19.length > var12; var12 += 2) {
                    var13 = var19[var12];
                    if (-1 != var13) {
                      if (var13 < param5) {
                        UsernameSuggestionSupport.field_b[var13] = true;
                      }
                    } else {
                      ModelOriginSupport.field_p = true;
                    }
                  }
                  var8_int = 0;
                  break scanLoop1;
                }
                var13Lifetime1 = var19[var12];
                var14 = var10[var12 + 1];
                if (-1 != var13Lifetime1) {
                  if (var13Lifetime1 == param5 &&
                    var14 == param2) {
                    var11 = 1;
                  } else {
                    if (param5 <= var13Lifetime1) {
                      break scanLoop1;
                    }
                    if ((255 & GlowParticle.field_j[var13Lifetime1]) != var14) {
                      break scanLoop1;
                    }
                  }
                } else {
                  if (DiskArchiveRequest.field_T[param6] != var14) {
                    break scanLoop1;
                  }
                }
                var12 += 2;
                continue;

              }
              var9++;
            }
          }
          if ((decompiledFrameCompleted2) &&
            (decompiledFrameCompleted1)) {
            stackIn_4_0 = FreePlayRules.field_f;
            if (param5 == -1) {
              stackIn_5_1 = 1;
            } else {
              stackIn_5_1 = 4 + param5;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            var16 = stackIn_4_0[stackIn_5_1];
            var17 = var16;
            var8 = var17;
            var9 = 1;
            if (param7) {
              if (param5 == -1) {
                for (var10_int = 0; var10_int < DiskArchiveRequest.field_T.length; var10_int++) {
                  if ((RenderingInitializationSupport.field_c[var10_int / 8] & 1 << (7 & var10_int)) != 0) {
                    var9 = 0;
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted0)) {
                for (var10_intLifetime2 = 0; -1 + var16.length > var10_intLifetime2; var10_intLifetime2++) {
                  if ((AgeValidator.field_s[(param0 + var10_intLifetime2) / 8] & 1 << (var10_intLifetime2 + param0 & 7)) == 0) {
                    continue;
                  }
                  var9 = 0;
                  break;
                }
                param0 = param0 + (255 & SpaceObject.field_j[param5]);
              }
            }
            var10_intLifetime1 = 0;
            var11 = 0;
            while (true) {
              if (param5 == -1) {
                stackIn_25_0 = DiskArchiveRequest.field_T.length;
              } else {
                stackIn_25_0 = -1 + var17.length;
              }
              if (stackIn_25_0 <= var11) {
                if (var10_intLifetime1 != 0) {
                  break;
                }
                for (var11 = 0; var11 < var17.length - 1; var11++) {
                  if (param5 != -1) {
                    GlowParticle.field_j[param5] = (byte)var11;
                  } else {
                    param6 = var11;
                  }
                  OpacityWidget.searchAllowedGameOptions(param0, param1, param2, false, param4, 1 + param5, param6, param7);
                  if (PoolUiText.field_b) {
                    return;
                  }
                }
                break;
              }
              if (param5 == -1) {
                param6 = var11;
              } else {
                GlowParticle.field_j[param5] = (byte)var11;
              }
              if (param5 == -1 &&
                DiskArchiveRequest.field_T.length == 1) {
                var12 = 1;
              } else {
                var13_ref_uo = var8[var11 + 1];
                if (param7) {
                  if (!var13_ref_uo.selected) {
                    if (var9 != 0) {
                      stackIn_49_0 = (var13_ref_uo.enabled) ? 1 : 0;
                    } else {
                      stackIn_49_0 = 0;
                    }
                  } else {
                    stackIn_49_0 = 1;
                  }
                  var12 = stackIn_49_0;
                } else {
                  if (param5 == -1) {
                    stackIn_40_0 = (HighscoresScreen.field_L.field_Nb != DiskArchiveRequest.field_T[var11]) ? 0 : 1;
                  } else {
                    stackIn_40_0 = ((HighscoresScreen.field_L.settings[param5] & 255) != var11) ? 0 : 1;
                  }
                  var12 = stackIn_40_0;
                }
              }
              if (var12 != 0) {
                var10_intLifetime1 = 1;
                OpacityWidget.searchAllowedGameOptions(param0, param1, param2, false, param4, param5 + 1, param6, param7);
              }
              if (PoolUiText.field_b) {
                return;
              }
              var11++;
            }
          }
          if (param3) {
            field_Q = (boolean[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_106_0 = var8_ref;
          stackIn_106_1 = new StringBuilder().append("sh.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static boolean isNamePopupOpen(byte obfuscationGuard) {
        int var1 = 26 % ((-52 - obfuscationGuard) / 32);
        return PasswordInputPainter.field_C != null ? true : false;
    }

    public static void releaseStatics(byte param0) {
        statusWantsToDraw = null;
        field_P = null;
        field_O = null;
        youCanSpectate = null;
        if (param0 != 118) {
          byte[] var2 = (byte[]) null;
          OpacityWidget.extendByteArrayWithZeros((byte) 52, (byte[]) null, -94);
        }
        benefitsPrice = null;
        field_Q = null;
    }

    final void renderWidget(int param0, byte param1, int param2, int param3) {
        if (param0 != 0) {
          return;
        }
        if (this.child == null) {
          return;
        }
        int var5 = 53 % ((-42 - param1) / 53);
        if (this.opacity == 0) {
          return;
        }
        if (this.opacity == 256) {
          this.child.renderWidget(param0, (byte) -128, param2 + this.widgetX, this.widgetY + param3);
          return;
        }
        Sprite var6 = new Sprite(this.child.widgetWidth, this.child.widgetHeight);
        CueAim.pushSpriteRenderTarget(110, var6);
        this.child.renderWidget(param0, (byte) -126, 0, 0);
        TriangleMesh.popRasterSnapshot(118);
        var6.drawShadedGrayscale(param2 + this.widgetX, this.widgetY + param3, this.opacity);
    }

    public OpacityWidget() {
        super(0, 0, 0, 0, (WidgetPainter) null, (WidgetListener) null);
        this.opacity = 256;
    }

    final static int placePopupVertically(int param0, int param1, int param2, int param3) {
        if (param3 + (param1 + param0) <= SoftwareRasterizer.height) {
          return param3 + param1;
        }
        if (~(-param0 + param1) <= param2) {
          return -param0 + param1;
        }
        return SoftwareRasterizer.height - param0;
    }

    OpacityWidget(UiWidget param0) {
        super(param0.widgetX, param0.widgetY, param0.widgetWidth, param0.widgetHeight, (WidgetPainter) null, (WidgetListener) null);
        try {
          param0.setWidgetBounds(this.widgetWidth, 0, this.widgetHeight, false, 0);
          this.opacity = 256;
          this.child = param0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "sh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void setMembershipBenefitsArchives(ResourceArchive spriteArchive, byte obfuscationGuard, ResourceArchive fontArchive) {
        try {
          MonotonicClock.field_c = fontArchive;
          IterableNodeHashTable.field_k = spriteArchive;
          if (obfuscationGuard != -32) {
            youCanSpectate = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "sh.G(" + (spriteArchive != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + (fontArchive != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] extendByteArrayWithZeros(byte obfuscationGuard, byte[] bytes, int additionalLength) {
        RuntimeException var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard < 25) {
            OpacityWidget.placePopupVertically(-81, 49, -78, -118);
          }
          stackIn_3_0 = ThemeSelectScreen.extendByteArray(-116, additionalLength, bytes, (byte) 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("sh.D(").append(obfuscationGuard).append(',');
          if (bytes == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(additionalLength).append(')').toString());
        }
    }

    final static void updateLobbyFrame(boolean param0, int param1, boolean param2, int param3, int param4, byte param5, int param6, int param7, boolean param8, int param9, boolean param10, boolean param11) {
        if (param5 != -12) {
          LobbyGame var13 = (LobbyGame) null;
          OpacityWidget.searchAllowedGameOptions(-82, 16, -99, true, (LobbyGame) null, -40, 16, false);
        }
        DiskCacheWorker.updateLobbyFrame(param1, param6, param11, param3, param10, param8, param2, param0, 16777215, param9, param4, param7, -124, 16777215);
    }

    static {
        youCanSpectate = "You can spectate this game";
        field_O = new int[]{2, 20, 21, 49, 6, 5, 3, 9};
        benefitsPrice = "From only <%0>/month";
        statusWantsToDraw = "Wants to draw.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void updateLobbyFrameIntArgs(boolean param0, int param1, boolean param2, int param3, int param4, int param5, int param6, int param7, boolean param8, int param9, boolean param10, boolean param11) {
        if (param5 != -12) {
          LobbyGame var13 = (LobbyGame) null;
          OpacityWidget.searchAllowedGameOptions(-82, 16, -99, true, (LobbyGame) null, -40, 16, false);
        }
        DiskCacheWorker.updateLobbyFrame(param1, param6, param11, param3, param10, param8, param2, param0, 16777215, param9, param4, param7, -124, 16777215);
    }
}
