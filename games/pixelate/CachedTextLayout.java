/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CachedTextLayout extends TextLayout {
    private int field_f;
    static String field_n;
    static Sprite[] field_p;
    static String field_g;
    private int cachedHorizontalAlignment;
    static String field_j;
    static int field_h;
    private int field_e;
    private int field_q;
    private int field_k;
    private String cachedText;
    private boolean singleLineMode;
    private BitmapFont cachedFont;

    final static void findValidSettingCombination(int param0, int param1, byte param2, boolean param3, int param4, int param5, LobbyGame param6, int param7) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_36_0 = 0;
        IconTextComponent[][] stackIn_41_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_116_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        IconTextComponent[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        IconTextComponent var13 = null;
        int var14 = 0;
        int var15 = 0;
        IconTextComponent[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int stackIn_25_0Lifetime1;
        int stackIn_25_1Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var13_intLifetime1;
        int var10Lifetime2;
        var15 = Pixelate.field_H ? 1 : 0;
        try {
          regionExit1: {
            boolean decompiledFrameCompleted0 = true;
            regionExit2: {
              boolean decompiledFrameCompleted1 = true;
              if (param0 <= param7) {
                var8_int = 1;
                var9 = 0;
                while (true) {
                  stackIn_4_0 = var9;
                  stackIn_4_1 = Checkbox.field_Z.length;
                  boolean decompiledFrameRemainder0 = true;
                  if (stackIn_4_0 < stackIn_4_1) {
                    var18 = Checkbox.field_Z[var9];
                    var17 = var18;
                    var10_ref_int__ = var17;
                    var11 = 0;
                    stackIn_36_0 = 0;
                    decompiledFrameRemainder0 = (var15 == 0);
                    if (decompiledFrameRemainder0) {
                      var12 = stackIn_36_0;
                      scanLoop3: while (true) {
                        if (var18.length > var12) {
                          var13_int = var18[var12];
                          var14 = var10_ref_int__[1 + var12];
                          stackIn_25_0 = var13_int;
                          stackIn_25_1 = -1;
                          if (stackIn_25_0 != stackIn_25_1) {
                            if (param7 == var13_int &&
                              var14 == param5) {
                              var11 = 1;
                            } else {
                              if (var13_int >= param7) {
                                break scanLoop3;
                              }
                              if ((TimerBarDemo.field_o[var13_int] & 255) != var14) {
                                break scanLoop3;
                              }
                            }
                          } else {
                            if (~var14 != ~LinkButtonPainter.field_a[param4]) {
                              break scanLoop3;
                            }
                          }
                          var12 += 2;
                          continue;
                        }
                        if (var11 == 0 &&
                          MouseInputGlobals.field_b != param7) {
                          break scanLoop3;
                        }
                        var8_int = 0;
                        var12 = 0;
                        while (true) {
                          stackIn_25_0Lifetime1 = var18.length;
                          stackIn_25_1Lifetime1 = var12;
                          if (stackIn_25_0Lifetime1 <= stackIn_25_1Lifetime1) {
                            break;
                          }
                          var13_intLifetime1 = var18[var12];
                          stackIn_4_0 = -1;
                          stackIn_4_1 = var13_intLifetime1;
                          if (stackIn_4_0 == stackIn_4_1) {
                            GridSize.field_b = true;
                          } else {
                            if (param7 > var13_intLifetime1) {
                              RankingQuery.field_t[var13_intLifetime1] = true;
                            }
                          }
                          var12 += 2;
                        }
                        break;
                      }
                      var9++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    stackIn_36_0 = var8_int;
                  }
                  if (stackIn_36_0 != 0) {
                    PictureStrip.field_f = true;
                  }
                  if (var15 == 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  break;
                }
              }
              if (decompiledFrameCompleted1) {
                stackIn_41_0 = AccountTermsPanel.field_L;
                if (param7 != -1) {
                  stackIn_42_1 = param7 + 4;
                } else {
                  stackIn_42_1 = 1;
                }
                var16 = stackIn_41_0[stackIn_42_1];
                var8 = var16;
                var9Lifetime1 = 1;
                if (param3) {
                  if (param7 != -1) {
                    var10 = 0;
                    scanLoop4: while (true) {
                      if (var10 < var16.length - 1) {
                        stackIn_52_0 = NanoTickClock.field_k[(var10 + param1) / 8] & 1 << (7 & var10 + param1);
                        if (var15 != 0) {
                          break scanLoop4;
                        }
                        if (stackIn_52_0 != 0) {
                          var9Lifetime1 = 0;
                        } else {
                          var10++;
                          continue;
                        }
                      }
                      stackIn_52_0 = param1 + (ReportAbuseDialog.field_Rb[param7] & 255);
                      break;
                    }
                    param1 = stackIn_52_0;
                  }
                  if (param7 == -1 ||
                    var15 != 0) {
                    var10Lifetime2 = 0;
                    while (!(var10Lifetime2 >= LinkButtonPainter.field_a.length)) {
                      stackIn_110_0 = 0;
                      stackIn_110_1 = TextButton.field_J[var10Lifetime2 / 8] & 1 << (7 & var10Lifetime2);
                      if (var15 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_110_0 != stackIn_110_1) {
                        var9Lifetime1 = 0;
                        break;
                      }
                      var10Lifetime2++;
                    }
                  }}
                if (decompiledFrameCompleted0) {
                  var10Lifetime1 = 0;
                  var11Lifetime1 = 0;
                  while (true) {
                    boolean decompiledFrameRemainder2 = true;
                    if (param7 != -1) {
                      stackIn_65_0 = -1;
                    } else {
                      stackIn_65_0 = LinkButtonPainter.field_a.length;
                      if (var15 == 0) {
                        stackIn_66_0 = stackIn_65_0;
                        decompiledFrameRemainder2 = false;
                      }
                    }
                    if (decompiledFrameRemainder2) {
                      stackIn_66_0 = stackIn_65_0 + var16.length;
                    }
                    if (stackIn_66_0 > var11Lifetime1) {
                      if (-1 == param7) {
                        param4 = var11Lifetime1;
                      }
                      if (-1 != param7 ||
                        var15 != 0) {
                        TimerBarDemo.field_o[param7] = (byte)var11Lifetime1;
                      }
                      if (param7 != -1 ||
                        LinkButtonPainter.field_a.length != 1) {
                        var13 = var16[var11Lifetime1 + 1];
                        if (!param3) {
                          if (-1 == param7) {
                            stackIn_81_0 = (~LinkButtonPainter.field_a[var11Lifetime1] != ~LoginMethod.field_c.field_ec) ? 0 : 1;
                          } else {
                            stackIn_81_0 = (var11Lifetime1 != (LoginMethod.field_c.field_Eb[param7] & 255)) ? 0 : 1;
                          }
                          var12 = stackIn_81_0;
                        }
                        if (param3 ||
                          var15 != 0) {
                          boolean decompiledFrameRemainder1 = true;
                          if (!var13.field_U && (var9Lifetime1 == 0 ||
                            !var13.field_rb)) {
                            stackIn_88_0 = 0;
                            decompiledFrameRemainder1 = false;
                          }
                          else {
                            stackIn_88_0 = 1;
                          }
                          var12 = stackIn_88_0;
                        }
                        if (var15 != 0) {
                          var12 = 1;
                        }
                      } else {
                        var12 = 1;
                      }
                      if (var12 != 0) {
                        var10Lifetime1 = 1;
                        CachedTextLayout.findValidSettingCombination(param0, param1, (byte) 124, param3, param4, param5, param6, 1 + param7);
                      }
                      if (PictureStrip.field_f) {
                        return;
                      }
                      var11Lifetime1++;
                      if (var15 == 0) {
                        continue;
                      }
                    }
                    if (var10Lifetime1 != 0) {
                      break;
                    }
                    var11Lifetime1 = 0;
                    while ((var16.length - 1) > var11Lifetime1) {
                      stackIn_110_0 = 0;
                      stackIn_110_1 = ~param7;
                      if (var15 != 0) {
                        break regionExit1;
                      }
                      if (stackIn_110_0 != stackIn_110_1) {
                        TimerBarDemo.field_o[param7] = (byte)var11Lifetime1;
                      } else {
                        param4 = var11Lifetime1;
                      }
                      CachedTextLayout.findValidSettingCombination(param0, param1, (byte) 83, param3, param4, param5, param6, param7 + 1);
                      if (PictureStrip.field_f) {
                        return;
                      }
                      var11Lifetime1++;
                    }
                    break;
                  }
                }
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_110_0 = param2;
              stackIn_110_1 = 67;
            }
          }
          if (stackIn_110_0 <= stackIn_110_1) {
            field_g = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_115_0 = var8_ref;
          stackIn_115_1 = new StringBuilder().append("no.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_116_2 = "null";
          } else {
            stackIn_116_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_115_0), ((StringBuilder) (Object) stackIn_115_1).append(stackIn_116_2).append(',').append(param7).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        field_n = null;
        field_j = null;
        field_p = null;
        if (param0 != 0) {
          field_n = (String) null;
        }
    }

    final static void drawLobbyRoot(boolean param0, byte param1) {
        Cp1252DecodeHelpers.field_i.drawFullScreen(param0, 0);
        if (param1 != 34) {
          field_n = (String) null;
        }
        BirthDateEntryPanel var2 = PuzzleModePictureHelpers.field_b;
        if (var2 != null) {
          var2.drawLayers(Cp1252DecodeHelpers.field_i.screenY, Cp1252DecodeHelpers.field_i.field_tb, 104);
        }
    }

    final void layoutParagraph(int param0, int param1, String param2, BitmapFont param3, int param4, int param5, int param6, int param7) {
        TextLayoutLine stackIn_34_0;
        TextLayoutLine stackIn_34_1;
        int stackIn_34_2;
        int stackIn_34_3;
        TextLayoutLine stackIn_35_0 = null;
        TextLayoutLine stackIn_35_1 = null;
        int stackIn_35_4 = 0;
        BitmapFont stackIn_39_0 = null;
        int stackIn_40_1 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        TextLayoutLine var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = Pixelate.field_H ? 1 : 0;
        try {
          if (param1 == ~param7) {
            param7 = param3.lineAdvance;
          }
          if (param2 == null) {
            this.lines = null;
            return;
          }
          if (param3 == this.cachedFont &&
            !this.singleLineMode &&
            param5 == this.cachedHorizontalAlignment &&
            ~param6 == ~this.field_f &&
            this.field_e == param7 &&
            this.field_q == param4 &&
            ~this.field_k == ~param0 &&
            null != this.cachedText &&
            this.cachedText.equals(param2)) {
            return;
          }
          this.field_q = param4;
          this.field_f = param6;
          this.cachedFont = param3;
          this.cachedHorizontalAlignment = param5;
          this.field_e = param7;
          this.field_k = param0;
          this.singleLineMode = false;
          this.cachedText = param2;
          var16 = new String[1 + param3.wrappedLineCount(param2, param0)];
          var17 = var16;
          var10 = Math.max(1, param3.wrapText(param2, new int[]{param0}, var17));
          if (this.field_f == 3 &&
            var10 == 1) {
            this.field_f = 1;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_f != 0) {
            if (1 == this.field_f) {
              var11 = (this.field_q - var10 * this.field_e >> 1) + param3.maxAscent;
              decompiledFrameRemainder0 = (var15 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (this.field_f != 2) {
                var12 = (this.field_q - var10 * this.field_e) / (1 + var10);
                if (0 > var12) {
                  var12 = 0;
                }
                var11 = param3.maxAscent + var12;
                this.field_e = this.field_e + var12;
                if (var15 != 0) {
                  var11 = -(this.field_e * var10) + this.field_q - param3.maxDescent;
                  var11 = param3.maxAscent;
                }
              } else {
                var11 = -(this.field_e * var10) + this.field_q - param3.maxDescent;
                if (var15 != 0) {
                  var11 = param3.maxAscent;
                }
              }
            }
          } else {
            var11 = param3.maxAscent;
          }
          this.lines = new TextLayoutLine[var10];
          var12Lifetime1 = 0;
          while (var10 > var12Lifetime1) {
            var13 = var16[var12Lifetime1];
            if (var15 != 0) {
              return;
            }
            stackIn_34_0 = null;
            stackIn_34_1 = null;
            stackIn_34_2 = var11 - param3.maxAscent;
            stackIn_34_3 = var11 + param3.maxDescent;
            if (var13 != null) {
              stackIn_35_0 = null;
              stackIn_35_1 = null;
              stackIn_35_4 = var13.length();
            } else {
              stackIn_35_0 = null;
              stackIn_35_1 = null;
              stackIn_35_4 = 0;
            }
            var14 = new TextLayoutLine(stackIn_34_2, stackIn_34_3, stackIn_35_4);
            var14.field_g[0] = 0;
            if (var13 != null) {
              var14.field_g[var13.length()] = param3.textWidth(var13);
              stackIn_39_0 = (BitmapFont) (param3);
              if (param5 != 3) {
                stackIn_40_1 = 0;
              } else {
                stackIn_40_1 = this.justificationStep(var13, param0, param3.textWidth(var13), 60);
              }
              CaretLayoutHelpers.populateCaretPositions(stackIn_39_0, stackIn_40_1, (byte) -92, var14, var13);
            }
            var11 = var11 + param7;
            this.lines[var12Lifetime1] = var14;
            var12Lifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_45_0 = var9;
          stackIn_45_1 = new StringBuilder().append("no.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param3 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void layoutCenteredLine(String param0, boolean param1, int param2, BitmapFont param3, int param4) {
        TextLayoutLine var8 = null;
        int var7 = 0;
        if (param0 == null) {
          this.lines = null;
          return;
        }
        if (param1) {
          field_g = (String) null;
        }
        if (this.cachedFont == param3 && this.singleLineMode && 1 == this.cachedHorizontalAlignment && null != this.cachedText &&
          this.cachedText.equals(param0)) {
          return;
        }
        try {
          this.cachedHorizontalAlignment = 1;
          this.singleLineMode = true;
          this.cachedFont = param3;
          var8 = this.createSingleLine(param0, 0, param3, param2);
          var7 = param3.textWidth(param0);
          var8.field_g[0] = param4 - (var7 >> 1);
          var8.field_g[param0.length()] = param4 + (var7 >> 1);
          CaretLayoutHelpers.populateCaretPositions(param3, 0, (byte) -92, var8, param0);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "no.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void updateGameRoomPanel(boolean param0, int param1, int param2, boolean param3, boolean param4) {
        SceneWidget stackIn_21_0 = null;
        boolean stackIn_22_1 = false;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_66_0 = 0;
        boolean stackIn_110_0 = false;
        int stackIn_129_0 = 0;
        boolean stackIn_139_0 = false;
        boolean stackIn_155_0 = false;
        int stackIn_162_0 = 0;
        SceneWidget stackIn_181_0 = null;
        int stackIn_181_1 = 0;
        boolean stackIn_182_2 = false;
        SceneWidget stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        boolean stackIn_187_2 = false;
        SceneWidget stackIn_191_0 = null;
        int stackIn_191_1 = 0;
        boolean stackIn_192_2 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_109_0;
        boolean stackOut_138_0;
        boolean stackOut_154_0;
        RuntimeException var5 = null;
        SceneWidget var6 = null;
        SceneWidget var7 = null;
        SceneWidget var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        String var10_ref_String = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int var13_int = 0;
        String var13_ref = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        IntrusiveDeque var17 = null;
        Object var18 = null;
        int var18_int = 0;
        LobbyPlayer var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        SceneWidget var22 = null;
        int[] var23 = null;
        String var24 = null;
        String var25 = null;
        int[] var26 = null;
        SceneWidget var27 = null;
        int stackIn_51_0Lifetime1;
        int stackIn_60_0Lifetime1;
        int var13_intLifetime1;
        int var18_intLifetime1;
        int var13_intLifetime2;
        var18 = null;
        var19 = Pixelate.field_H ? 1 : 0;
        try {
          VolumeControlledVoice.layoutSidePanels(Checkbox.field_W, 4740);
          if (param1 != 1) {
            return;
          }
          if (LoginMethod.field_c != null) {
            boolean decompiledFrameRemainder3 = true;
            ValidatedTextWidget.field_kb.field_rb = true;
            ReportReason.field_d.height = 0;
            var22 = ReportReason.field_d;
            var27 = var22;
            var27.field_K = 0;
            var6 = PolygonClipHelpers.field_a;
            PolygonClipHelpers.field_a.height = 0;
            var6.field_K = 0;
            var7 = ChatPanelHelpers.field_e;
            ChatPanelHelpers.field_e.height = 0;
            var7.field_K = 0;
            if (!AccountRegistrationPanel.isLocalPlayerGameHost(param1 + 98)) {
              var9_ref_String = LoginMethod.field_c.field_pc;
              VerticalScrollbar.field_Qb.field_cb = AlphaContainer.formatTemplate(HowToPlayScreen.field_q, param1 ^ 62, new String[]{var9_ref_String}).toUpperCase();
              ChatPanelHelpers.field_e.setBounds(Bzip2State.field_A.height - 40, 40, 0, param1 + 255, Bzip2State.field_A.field_K);
              ChatPanelHelpers.field_e.field_cb = AlphaContainer.formatTemplate(MusicPlaybackHelpers.field_a, param1 + 23, new String[]{var9_ref_String});
              var8 = ChatPanelHelpers.field_e;
              decompiledFrameRemainder3 = (var19 != 0);
            }
            if (decompiledFrameRemainder3) {
              VerticalScrollbar.field_Qb.field_cb = DelegatingCanvas.field_g.toUpperCase();
              var9 = (Bzip2State.field_A.field_K + 2) / 2;
              ReportReason.field_d.setBounds(Bzip2State.field_A.height - 40, 40, 0, 256, var9 - 2);
              if (LoginMethod.field_c.field_ec <= LoginMethod.field_c.field_mc) {
                ReportReason.field_d.field_cb = Kite.field_m.toUpperCase();
                ReportReason.field_d.field_rb = false;
                if (var19 != 0) {
                  ReportReason.field_d.field_cb = WhirlpoolHasher.field_k.toUpperCase();
                  ReportReason.field_d.field_rb = true;
                }
              } else {
                ReportReason.field_d.field_cb = WhirlpoolHasher.field_k.toUpperCase();
                ReportReason.field_d.field_rb = true;
              }
              ReportReason.field_d.field_zb = PicturePreview.field_k.field_zb;
              if (ResizableModalPanel.field_X > 0) {
                boolean decompiledSharedTail1 = (ResizableModalPanel.field_X != 1);
                if (!decompiledSharedTail1) {
                  var10_ref_String = QueuedLobbyRequest.field_k;
                  decompiledSharedTail1 = (var19 != 0);
                }
                if (decompiledSharedTail1) {
                  var10_ref_String = AlphaContainer.formatTemplate(LobbyStartupHelpers.field_a, 99, new String[]{Integer.toString(ResizableModalPanel.field_X)});
                }
                ReportReason.field_d.field_cb = ReportReason.field_d.field_cb + "<br>" + var10_ref_String;
                if (0 == (16 & AchievementsScreen.field_o) &&
                  !EmergentBehaviourBackground.field_o) {
                  ReportReason.field_d.field_zb = PicturePreview.field_k.field_ab;
                }
              }
              PolygonClipHelpers.field_a.setBounds(-40 + Bzip2State.field_A.height, 40, var9, 256, -var9 + Bzip2State.field_A.field_K);
              PolygonClipHelpers.field_a.field_cb = DateInputWidget.field_J.toUpperCase();
              var8 = PolygonClipHelpers.field_a;
              stackIn_21_0 = PolygonClipHelpers.field_a;
              stackIn_22_1 = (param0) && (ScreenDisplayMode.field_e == 0L);
              stackIn_21_0.field_rb = stackIn_22_1;
              var10 = 2;
              if (Checkbox.field_Z != null) {
                if (TimerBarDemo.field_o == null) {
                  TimerBarDemo.field_o = new byte[MouseInputGlobals.field_b];
                  RankingQuery.field_t = new boolean[MouseInputGlobals.field_b];
                }
                var11_int = 0;
                do {
                  if (!(MouseInputGlobals.field_b > var11_int)) {
                    var10 = 0;
                    break;
                  }
                  RankingQuery.field_t[var11_int] = false;
                  var11_int++;
                } while (var19 == 0);
                scanLoop1: while (true) {
                  if (var10 < 2) {
                    var11_int = 0;
                    stackIn_66_0 = 0;
                    if (var19 != 0) {
                      break scanLoop1;
                    }
                    var12 = stackIn_66_0;
                    while (true) {
                      stackIn_36_0 = ~var12;
                      stackIn_36_1 = ~Checkbox.field_Z.length;
                      if (stackIn_36_0 > stackIn_36_1) {
                        var26 = Checkbox.field_Z[var12];
                        var23 = var26;
                        var20 = var23;
                        var13 = var20;
                        stackIn_60_0 = 0;
                        var14_int = stackIn_60_0;
                        scanLoop2: while (true) {
                          if (var14_int < var26.length) {
                            var15 = var26[var14_int];
                            var16 = var20[var14_int + 1];
                            stackIn_51_0 = ~var15;
                            if (stackIn_51_0 == 0) {
                              if (var10 == 0) {
                                stackIn_47_0 = LoginMethod.field_c.field_ec;
                              } else {
                                stackIn_47_0 = LoginMethod.field_c.field_mc;
                              }
                              var17_int = stackIn_47_0;
                              if (~var17_int != ~var16) {
                                break scanLoop2;
                              }
                            } else {
                              if (~var16 != ~(255 & LoginMethod.field_c.field_Eb[var15])) {
                                break scanLoop2;
                              }
                            }
                            var14_int += 2;
                            continue;
                          }
                          var11_int = 1;
                          var14_int = -1;
                          stackIn_51_0Lifetime1 = 0;
                          var15 = stackIn_51_0Lifetime1;
                          while (var26.length > var15) {
                            var16 = var26[var15];
                            stackIn_36_0 = var16;
                            stackIn_36_1 = var14_int;
                            if (stackIn_36_0 > stackIn_36_1) {
                              var14_int = var16;
                            }
                            var15 += 2;
                          }
                          RankingQuery.field_t[var14_int] = true;
                          break;
                        }
                        var12++;
                        continue;
                      }
                      break;
                    }
                    stackIn_60_0Lifetime1 = var11_int;
                    if (stackIn_60_0Lifetime1 == 0 ||
                      var19 != 0) {
                      var10++;
                      continue;
                    }
                  }
                  stackIn_66_0 = ~SocialPanel.field_h;
                  break;
                }
                if (stackIn_66_0 <= -3 &&
                  EmailValidator.field_m[12]) {
                  var10 = 2;
                }
              }
              boolean decompiledFrameRemainder1 = true;
              boolean decompiledFrameCompleted0 = true;
              boolean decompiledFrameRemainder2 = true;
              if ((2 <= var10) &&
                (decompiledFrameRemainder3 = (null != Cloud.field_r ||
                StatefulTextPainter.field_z != null ||
                null != RequestResultFactory.field_a ||
                AchievementIconGlobals.field_e != null))) {
                var11_int = 0;
                var12 = 0;
                var13_int = 0;
                var14_int = 0;
                var15 = 0;
                var16 = 0;
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (!(var16 < MouseInputGlobals.field_b)))) {
                  var17_int = LoginMethod.field_c.field_Eb[var16] & 255;
                  if (var19 == 0) {
                    if (Cloud.field_r != null &&
                      Cloud.field_r[var16] != null &&
                      Cloud.field_r[var16][var17_int]) {
                      var11_int = 1;
                    }
                    if (StatefulTextPainter.field_z != null &&
                      null != StatefulTextPainter.field_z[var16]) {
                      var18_int = StatefulTextPainter.field_z[var16][var17_int];
                      if (var18_int > var13_int) {
                        var13_int = var18_int;
                      }
                      if (var18_int != 0 &&
                        !PendingFlagGlobals.field_a) {
                        var11_int = 1;
                      }
                    }
                    if (null != RequestResultFactory.field_a &&
                      null != RequestResultFactory.field_a[var16]) {
                      var18_intLifetime1 = RequestResultFactory.field_a[var16][var17_int];
                      if (var14_int < var18_intLifetime1) {
                        var14_int = var18_intLifetime1;
                      }
                      if (var18_intLifetime1 != 0 &&
                        !PendingFlagGlobals.field_a) {
                        var11_int = 1;
                      }
                    }
                    if (AchievementIconGlobals.field_e != null &&
                      null != AchievementIconGlobals.field_e[var16]) {
                      var15 = var15 | AchievementIconGlobals.field_e[var16][var17_int];
                    }
                    var16++;
                    continue;
                  }
                  break;
                }
                if (decompiledNaturalLoopExit0) {
                  var16 = 0;
                }
                var17 = Vector3.field_c.content.children;
                var18_ref = (LobbyPlayer) (var17.first(1504642273));
                scanLoop3: while (true) {
                  boolean decompiledFrameRemainder0 = true;
                  if (var18_ref != null) {
                    stackOut_109_0 = var18_ref.isUnlisted((byte) -98);
                    stackIn_129_0 = stackOut_109_0 ? 1 : 0;
                    stackIn_110_0 = stackOut_109_0;
                    if (var19 != 0) {
                      break scanLoop3;
                    }
                    if (!stackIn_110_0) {
                      if (var11_int != 0 &&
                        !var18_ref.field_Xb) {
                        var16 = 1;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var18_ref.field_Rb < var13_int) {
                          var16 = 1;
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          if (var18_ref.field_Yb < var14_int) {
                            var16 = 1;
                            decompiledFrameRemainder0 = false;
                          }
                          else {
                            if ((~var18_ref.field_Ib & var15) > 0) {
                              var16 = 1;
                              decompiledFrameRemainder0 = false;
                            }
                            else {
                              if (var12 != 0) {
                                var16 = 1;
                                decompiledFrameRemainder0 = false;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      var18_ref = (LobbyPlayer) (var17.next(1504642273));
                      continue;
                    }
                  }
                  stackIn_129_0 = -3;
                  break;
                }
                if (stackIn_129_0 >= ~SocialPanel.field_h &&
                  EmailValidator.field_m[12]) {
                  var16 = 0;
                }
                if ((var16 == 0) &&
                  (decompiledFrameRemainder3 = (var19 != 0))) {
                  PolygonClipHelpers.field_a.field_rb = false;
                  decompiledFrameRemainder3 = !(!PolygonClipHelpers.field_a.field_R);
                  if (decompiledFrameRemainder3) {
                    var11 = null;
                    var12 = 0;
                    var13_intLifetime2 = 0;
                    decompiledFrameRemainder2 = !(var13_intLifetime2 >= MouseInputGlobals.field_b);
                    if (decompiledFrameRemainder2) {
                      stackOut_138_0 = RankingQuery.field_t[var13_intLifetime2];
                      stackIn_162_0 = stackOut_138_0 ? 1 : 0;
                      stackIn_139_0 = stackOut_138_0;
                      decompiledFrameRemainder1 = false;
                    }
                  }
                }
                if ((decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder1)) {
                  PolygonClipHelpers.field_a.field_rb = false;
                  if (PolygonClipHelpers.field_a.field_R) {
                    boolean decompiledSharedTail0 = (0 != HowToPlayDemoHelpers.field_b.field_g.selectedTab);
                    if (!decompiledSharedTail0) {
                      PuzzleThumbnail.field_o = CipherPacketBuffer.field_u;
                      decompiledSharedTail0 = (var19 != 0);
                    }
                    if (decompiledSharedTail0) {
                      PuzzleThumbnail.field_o = AlphaContainer.formatTemplate(FireworkDisplay.field_b, 107, new String[]{PairedTextColumns.field_Gb});
                    }
                  }
                  decompiledFrameRemainder3 = (var19 != 0);
                }
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1)) {
                PolygonClipHelpers.field_a.field_rb = false;
                decompiledFrameRemainder3 = !(!PolygonClipHelpers.field_a.field_R);
                if (decompiledFrameRemainder3) {
                  var11 = null;
                  var12 = 0;
                  var13_intLifetime1 = 0;
                  while (!(var13_intLifetime1 >= MouseInputGlobals.field_b)) {
                    stackOut_154_0 = RankingQuery.field_t[var13_intLifetime1];
                    stackIn_162_0 = stackOut_154_0 ? 1 : 0;
                    stackIn_155_0 = stackOut_154_0;
                    if (var19 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (stackIn_155_0) {
                      var25 = "<col=A00000>" + MeshColourEntry.field_e[var13_intLifetime1] + "</col>";
                      if (var11 != null) {
                        var11 = (String) (var11) + ", " + var25;
                        var12 = 1;
                      } else {
                        var11 = var25;
                      }
                    }
                    var13_intLifetime1++;
                  }
                }
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder1) &&
                (decompiledFrameCompleted0)) {
                stackIn_162_0 = 0;
              }
              if (decompiledFrameRemainder3) {
                if (stackIn_162_0 == var10) {
                  var13_ref = FriendCaptionGlobals.field_a;
                  if (var12 == 0) {
                    var14 = AlphaContainer.formatTemplate(QueuedLobbyRequest.field_n, 80, new String[]{(String) (var11)});
                    if (var19 != 0) {
                      var14 = SpriteState.field_x + (String) (var11);
                    }
                  } else {
                    var14 = SpriteState.field_x + (String) (var11);
                  }
                } else {
                  var13_ref = SkinSelectionHelpers.field_c;
                  if (var12 == 0) {
                    var14 = AlphaContainer.formatTemplate(SpriteLoadHelpers.field_b, 31, new String[]{(String) (var11)});
                    if (var19 != 0) {
                      var14 = RematchCaptionGlobals.field_b + (String) (var11);
                    }
                  } else {
                    var14 = RematchCaptionGlobals.field_b + (String) (var11);
                  }
                }
                PuzzleThumbnail.field_o = "<col=A00000>" + var13_ref + "<br>" + var14;
              }
            }
            if (0L != ScreenDisplayMode.field_e) {
              var9 = (int)(-ClockHelpers.monotonicMillis(64) + ScreenDisplayMode.field_e);
              var9 = (var9 + 999) / 1000;
              if (var9 < 1) {
                var9 = 1;
              }
              var8.field_cb = AlphaContainer.formatTemplate(AudioService.field_i, 100, new String[]{Integer.toString(var9)});
            }
            MatchingTextValidator.field_q.field_cb = AlphaContainer.formatTemplate(ReportAbuseDialog.field_Gb, param1 + 68, new String[]{Integer.toString(LoginMethod.field_c.field_mc), Integer.toString(LoginMethod.field_c.field_ec)});
          }
          stackIn_181_0 = SpriteLoadHelpers.field_h;
          stackIn_181_1 = -28476;
          stackIn_182_2 = (param4) && (!param3) && (!EmergentBehaviourBackground.field_o);
          ((SceneWidget) (Object) stackIn_181_0).updateInputFullScreen(stackIn_181_1, stackIn_182_2);
          stackIn_186_0 = Bzip2State.field_A;
          stackIn_186_1 = -28476;
          stackIn_187_2 = (param4) && (!param3) && (!EmergentBehaviourBackground.field_o);
          ((SceneWidget) (Object) stackIn_186_0).updateInputFullScreen(stackIn_186_1, stackIn_187_2);
          stackIn_191_0 = NineSliceSpriteFactory.field_e;
          stackIn_191_1 = -28476;
          stackIn_192_2 = (param4) && (!param3) && (EmergentBehaviourBackground.field_o);
          ((SceneWidget) (Object) stackIn_191_0).updateInputFullScreen(stackIn_191_1, stackIn_192_2);
          HowToPlayDemoHelpers.field_b.field_g.processTabPresses((byte) -122);
          if (null != LoginMethod.field_c) {
            if (0 != ValidatedTextWidget.field_kb.field_P) {
              GameRequestHelpers.sendDeclineGameRequest(LoginMethod.field_c.getGameId((byte) 8), param2, false);
            }
            if (0 != ReportReason.field_d.field_P) {
              EmergentBehaviourBackground.field_o = true;
            }
            if (PolygonClipHelpers.field_a.field_P != 0) {
              TextDecodeHelpers.field_c = true;
            }
            if (0 != ContentTransitionDialog.field_eb.field_P) {
              EmergentBehaviourBackground.field_o = false;
            }
            LoginForm.updateGameOptionsPanel(false, LoginMethod.field_c, param2, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var5), "no.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void drawScreenshotSlideshow(int param0) {
        Object stackIn_33_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        Sprite var5 = null;
        Sprite var6 = null;
        Sprite var7 = null;
        int var3Lifetime1;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          SoftwareRasterizer.drawRectangle(243, 197, 369, 143, 16777215);
          SoftwareRasterizer.fillRectangle(244, 198, 367, 141, 0);
          if (Matrix3.field_g == null) {
            if (null != QuickChatCategory.field_A) {
              QuickChatCategory.field_A.drawParagraph(FullscreenFocusCanvas.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
            return;
          }
          if (param0 != -19308) {
            field_p = (Sprite[]) null;
          }
          var5 = Matrix3.field_g[Vector3.field_b];
          boolean decompiledSharedTail1 = (var5 == null);
          if (!decompiledSharedTail1) {
            var5.drawTransparent(245, 199);
            decompiledSharedTail1 = (var4 != 0);
          }
          if ((decompiledSharedTail1) &&
            (QuickChatCategory.field_A != null)) {
            QuickChatCategory.field_A.drawParagraph(FullscreenFocusCanvas.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
          }
          if (Cp1252DecodeHelpers.field_k > TwistedLogicCube.field_q) {
            var6 = Matrix3.field_g[SpriteCheckboxPainter.field_b];
            if (var6 != null) {
              var2_int = TwistedLogicCube.field_q * (var6.field_A + 60) / Cp1252DecodeHelpers.field_k;
              var3 = var2_int - 30;
              boolean decompiledSharedTail0 = !(Match.field_e);
              if (!decompiledSharedTail0) {
                ArchiveIndex.drawHorizontalFadeSprite(var3 * -256 / 30, var6, 245, -123, 199, (var6.field_A - var3) * 256 / 30);
                decompiledSharedTail0 = (var4 != 0);
              }
              if (decompiledSharedTail0) {
                ArchiveIndex.drawHorizontalFadeSprite(256 * (-var3 + var6.field_A) / 30, var6, 245, 89, 199, -256 * var3 / 30);
              }
            }
          }
          if (null != QuickChatCategory.field_A) {
            var2 = null;
            var3Lifetime1 = 0;
            while (true) {
              if (var3Lifetime1 < Matrix3.field_g.length) {
                var7 = Matrix3.field_g[var3Lifetime1];
                stackIn_33_0 = null;
                if (var4 == 0) {
                  if (stackIn_33_0 != var7 && (var7.field_A != 365 ||
                    var7.field_B != 139)) {
                    if (var2 != null) {
                      var2 = (String) (var2) + ", " + var3Lifetime1;
                    } else {
                      var2 = Integer.toString(var3Lifetime1);
                    }
                  }
                  var3Lifetime1++;
                  continue;
                }
              } else {
                stackIn_33_0 = null;
              }
              break;
            }
            if (stackIn_33_0 == var2) {
              return;
            }
            QuickChatCategory.field_A.drawParagraph("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var1), "no.P(" + param0 + ')');
        }
    }

    final static long millisSinceLastPacket(int param0) {
        if (param0 != 8) {
          field_j = (String) null;
        }
        return -SpriteCheckboxPainter.field_c + ClockHelpers.monotonicMillis(64);
    }

    final void layoutLeftAlignedLine(BitmapFont param0, int param1, int param2, boolean param3, String param4) {
        TextLayoutLine var8 = null;
        TextLayoutLine var9 = null;
        if (param4 == null) {
          this.lines = null;
          return;
        }
        if (this.cachedFont == param0 &&
          this.singleLineMode &&
          this.cachedHorizontalAlignment == 2 &&
          this.cachedText != null &&
          this.cachedText.equals(param4)) {
          return;
        }
        this.cachedText = param4;
        this.cachedHorizontalAlignment = 2;
        this.singleLineMode = true;
        this.cachedFont = param0;
        if (param3) {
          return;
        }
        try {
          var8 = this.createSingleLine(param4, 0, param0, param1);
          var9 = var8;
          var9.field_g[0] = -param0.textWidth(param4) + param2;
          var9.field_g[param4.length()] = param2;
          CaretLayoutHelpers.populateCaretPositions(param0, 0, (byte) -92, var9, param4);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "no.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final TextLayoutLine createSingleLine(String param0, int param1, BitmapFont param2, int param3) {
        TextLayoutLine var5 = null;
        RuntimeException var5_ref = null;
        TextLayoutLine var6 = null;
        TextLayoutLine stackIn_2_0 = null;
        TextLayoutLine stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new TextLayoutLine(-param2.maxAscent + param3, param3 + param2.maxDescent, param0.length());
          var5 = var6;
          if (param1 != 0) {
            stackIn_2_0 = (TextLayoutLine) null;
            return stackIn_2_0;
          }
          this.lines = new TextLayoutLine[]{var6};
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("no.T(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final void layoutLeftAligned(String param0, int param1, BitmapFont param2, int param3, int param4) {
        TextLayoutLine var7 = null;
        int var6_int = -72 % ((param4 + 70) / 49);
        if (param0 == null) {
          this.lines = null;
          return;
        }
        if (this.cachedFont == param2 &&
          this.singleLineMode &&
          0 == this.cachedHorizontalAlignment &&
          this.cachedText != null &&
          this.cachedText.equals(param0)) {
          return;
        }
        try {
          this.singleLineMode = true;
          this.cachedFont = param2;
          this.cachedHorizontalAlignment = 0;
          this.cachedText = param0;
          var7 = this.createSingleLine(param0, 0, param2, param1);
          var7.field_g[0] = param3;
          var7.field_g[param0.length()] = param2.textWidth(param0) + param3;
          CaretLayoutHelpers.populateCaretPositions(param2, 0, (byte) -92, var7, param0);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "no.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public CachedTextLayout() {
    }

    static {
        field_n = "Asking for or providing contact information";
        field_g = "Unpacking graphics";
        field_h = 0;
        field_j = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
