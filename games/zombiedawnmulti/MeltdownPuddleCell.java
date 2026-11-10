/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MeltdownPuddleCell extends IntrusiveNode {
    private int field_m;
    static int[] field_i;
    static Sprite[] field_k;
    private int field_l;
    static String field_j;
    private int field_h;
    private int field_g;
    static int[] field_f;

    final static void loadLogoJingle(int param0, ResourceArchive param1) {
        RuntimeException runtimeException = null;
        VorbisSample var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          VorbisSample.decodeSetup(param1.getNamedFile("headers.packvorbis", "", false));
          if (param0 != 7478) {
            field_k = (Sprite[]) null;
          }
          var2 = VorbisSample.load(param1, "jagex logo2.packvorbis", "");
          var2.decodeAllToPcm();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("ui.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void tick(int param0) {
        int discarded$0 = 0;
        try {
          if (param0 != 9307) {
            discarded$0 = this.getCellOffset(105);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ui.H(" + param0 + ')');
        }
    }

    final static int darkenColour(int param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            MeltdownPuddleCell.drawChatToggleButton(true, false);
          }
          stackIn_3_0 = 16711935 & 15 * (16711935 & param0) >> 4 | (param0 & 65280) * 15 >> 4 & 65280;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "ui.C(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean isNearPoint(int param0, int param1, int param2) {
        int var4_int = 0;
        boolean stackIn_5_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = -3 % ((-42 - param0) / 33);
          stackIn_5_0 = (Math.abs(param1 - this.field_h) < 30) && (Math.abs(-this.field_m + param2) < 30);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var4), "ui.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void drawChatToggleButton(boolean param0, boolean param1) {
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_26_0 = 0;
        Sprite[] stackIn_30_0 = null;
        BinaryBitmapFont stackIn_33_0;
        String stackIn_33_1;
        int stackIn_33_2;
        int stackIn_33_3;
        int stackIn_34_4 = 0;
        int stackIn_40_0 = 0;
        boolean stackIn_46_0 = false;
        boolean stackIn_56_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        Sprite[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int[] var13 = null;
        try {
          if (param1) {
            field_k = (Sprite[]) null;
          }
          if (null != PortalEntryEvent.field_m &&
            1 < PortalEntryEvent.field_m.teamCount) {
            stackIn_8_0 = (ArrayWidgetGroup.field_I == 10) ? 1 : 0;
            var2_int = stackIn_8_0;
            if (!TutorialAndMenuHelpers.field_f) {
              stackIn_14_0 = 0;
            } else {
              stackIn_14_0 = (var2_int != 0) ? 1 : 0;
            }
            boolean decompiledFrameRemainder0 = true;
            var3 = stackIn_14_0;
            if ((!EffectVolumeHelpers.field_f ||
              !param0) && (!(0 < SceneObject.field_D) ||
              !(20 > PowerupEvent.field_m % 40)) && (var3 == 0 ||
              !(PowerupEvent.field_m % 40 < 20))) {
              stackIn_26_0 = 0;
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_26_0 = 1;
            }
            var4 = stackIn_26_0;
            if (var4 != 0) {
              stackIn_30_0 = GameSimulation.field_a;
            } else {
              stackIn_30_0 = RankingEntry.field_h;
            }
            var5 = stackIn_30_0;
            var6 = var5[0].width + EmailDomainValidation.field_d + var5[2].width;
            var7 = MatchingTextValidator.field_w.maxAscent + var5[6].height + var5[0].height;
            StatusAndMeshHelpers.drawNineSliceFrame(-var7 + ImageProducerRasterBuffer.field_k.field_qb - 5, 0, var5, -5 - var6 + 640, var7, var6);
            var13 = new int[4];
            SoftwareRasterizer.saveClip(var13);
            SoftwareRasterizer.intersectClip(-5 - EmailDomainValidation.field_d + 640 - var5[0].width, ImageProducerRasterBuffer.field_k.field_qb - var7 + var5[0].height - 5, 635 - var5[2].width, ImageProducerRasterBuffer.field_k.field_qb - var5[6].height);
            stackIn_33_0 = MatchingTextValidator.field_w;
            stackIn_33_1 = EffectAudioHelpers.field_i;
            stackIn_33_2 = -var5[2].width + 635;
            stackIn_33_3 = ImageProducerRasterBuffer.field_k.field_qb - (var5[6].height + 5);
            if (var4 == 0) {
              stackIn_34_4 = 16777215;
            } else {
              stackIn_34_4 = 1;
            }
            ((BinaryBitmapFont) (Object) stackIn_33_0).drawRightAligned(stackIn_33_1, stackIn_33_2, stackIn_33_3, stackIn_34_4, -1);
            SoftwareRasterizer.restoreClip(var13);
            if (MenuInputState.field_b &&
              HotspotTextWidget.field_N &&
              !FadingDialog.field_I) {
              stackIn_40_0 = 1;
            } else {
              stackIn_40_0 = 0;
            }
            var9 = stackIn_40_0;
            stackIn_46_0 = (param0) && (DialogLayer.isBlinkPhaseVisible((byte) -39)) && (var9 == 0);
            DefaultQuickChatContext.drawMenuUiAndPopups(stackIn_46_0, 0);
            if (ValidationState.field_b) {
              if (var9 == 0) {
                return;
              }
              stackIn_56_0 = (param0) && (DialogLayer.isBlinkPhaseVisible((byte) -39));
              ProgramNoteUsage.drawChatComposerOverlay(stackIn_56_0, (byte) 117);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "ui.E(" + param0 + ',' + param1 + ')');
        }
    }

    private final int getCellOffset(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -29394) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          stackIn_2_0 = -57;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "ui.D(" + param0 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        try {
          field_f = null;
          field_i = null;
          field_j = null;
          field_k = null;
          if (param0 > -41) {
            field_j = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ui.F(" + param0 + ')');
        }
    }

    final static void advanceLobbyTransitions(byte param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 ||
            JaggrabDownloader.field_c == null) {
            WeightedLruCache.field_b = false;
          }
          if (!param1) {
            if (null != JaggrabDownloader.field_c) {
              if (JaggrabDownloader.field_h > 0) {
                JaggrabDownloader.field_h = JaggrabDownloader.field_h - 1;
              } else {
                if (HotspotTextWidget.field_Q > 0) {
                  HotspotTextWidget.field_Q = HotspotTextWidget.field_Q - 1;
                } else {
                  if (InflaterDecompressor.field_a >= IdleTickHelpers.field_d) {
                    var2_int = -72 / ((-39 - param0) / 44);
                    return;
                  }
                  if (InflaterDecompressor.field_a == 0) {
                    PowerGaugeHelpers.buildChatPanel(false, (byte) -20);
                  }
                  InflaterDecompressor.field_a = InflaterDecompressor.field_a + 1;
                }
              }
            } else {
              if (BufferedSocket.field_n == null) {
                WeightedLruCache.field_b = false;
                if (HotspotTextWidget.field_Q > 0) {
                  HotspotTextWidget.field_Q = HotspotTextWidget.field_Q - 1;
                } else {
                  if (InflaterDecompressor.field_a <= 0) {
                    if (JaggrabDownloader.field_h < IdleTickHelpers.field_d) {
                      if (0 == JaggrabDownloader.field_h) {
                        PowerupEvent.buildLobbyRoot(6835);
                      }
                      JaggrabDownloader.field_h = JaggrabDownloader.field_h + 1;
                    }
                  } else {
                    InflaterDecompressor.field_a = InflaterDecompressor.field_a - 1;
                  }
                }
              } else {
                if (0 < JaggrabDownloader.field_h) {
                  JaggrabDownloader.field_h = JaggrabDownloader.field_h - 1;
                } else {
                  if (InflaterDecompressor.field_a <= 0) {
                    if (HotspotTextWidget.field_Q < IdleTickHelpers.field_d) {
                      if (0 == HotspotTextWidget.field_Q) {
                        PowerGaugeHelpers.buildChatPanel(true, (byte) 126);
                      }
                      HotspotTextWidget.field_Q = HotspotTextWidget.field_Q + 1;
                    }
                  } else {
                    InflaterDecompressor.field_a = InflaterDecompressor.field_a - 1;
                  }
                }
              }
            }
          } else {
            if (JaggrabDownloader.field_h > 0) {
              JaggrabDownloader.field_h = JaggrabDownloader.field_h - 1;
            } else {
              if (0 >= HotspotTextWidget.field_Q) {
                if (InflaterDecompressor.field_a > 0) {
                  InflaterDecompressor.field_a = InflaterDecompressor.field_a - 1;
                }
              } else {
                HotspotTextWidget.field_Q = HotspotTextWidget.field_Q - 1;
              }
            }
          }
          var2_intLifetime1 = -72 / ((-39 - param0) / 44);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "ui.G(" + param0 + ',' + param1 + ')');
        }
    }

    MeltdownPuddleCell(int param0, int param1, int param2) {
        try {
          this.field_l = param0;
          this.field_g = param1;
          this.field_h = 24 * this.field_l - (-12 - this.getCellOffset(-29394));
          this.field_m = 12 + (24 * this.field_g + this.getCellOffset(-29394));
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ui.<init>(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_f = new int[]{280, 180, 180, 180, 180, 180};
        field_i = new int[]{3, 3, 2, 3, 3, 4, 3, 3, 2, 2, 2, 4, 3, 3, 3, 3};
    }
}
