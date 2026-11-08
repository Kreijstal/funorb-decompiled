/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginMethod {
    static boolean field_d;
    private String field_c;
    static int field_j;
    static int field_h;
    static IntrusiveDeque field_a;
    static long[] field_b;
    static long[][] field_e;
    static IntrusiveDeque field_f;
    static int field_i;
    static MenuInputState field_k;
    static int field_l;
    static String field_g;

    final static void updateGameOptionControls(int param0, boolean param1, int param2, LobbyGame param3) {
        IconTextComponent dupTemp$0 = null;
        int var17_int = 0;
        int var24 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        IconTextComponent stackIn_22_0 = null;
        boolean stackIn_23_1 = false;
        IconTextComponent stackIn_28_0 = null;
        boolean stackIn_29_1 = false;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_57_0 = 0;
        IconTextComponent stackIn_71_0 = null;
        boolean stackIn_72_1 = false;
        IconTextComponent stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        boolean stackIn_79_1 = false;
        IconTextComponent stackIn_84_0 = null;
        boolean stackIn_84_1 = false;
        boolean stackIn_85_2 = false;
        IconTextComponent stackIn_89_0 = null;
        boolean stackIn_90_1 = false;
        int stackIn_94_0 = 0;
        IconTextComponent stackIn_107_0 = null;
        boolean stackIn_108_1 = false;
        IconTextComponent stackIn_112_0 = null;
        boolean stackIn_113_1 = false;
        IconTextComponent stackIn_116_0 = null;
        boolean stackIn_117_1 = false;
        IconTextComponent stackIn_120_0 = null;
        boolean stackIn_121_1 = false;
        String stackIn_137_0 = null;
        IconTextComponent stackIn_142_0 = null;
        boolean stackIn_143_1 = false;
        IconTextComponent stackIn_145_0 = null;
        boolean stackIn_146_1 = false;
        int stackIn_152_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_208_0 = 0;
        IconTextComponent stackIn_310_0 = null;
        boolean stackIn_310_1 = false;
        boolean stackIn_311_2 = false;
        IconTextComponent stackIn_313_0 = null;
        int stackIn_313_1 = 0;
        byte stackIn_313_2 = 0;
        int stackIn_313_3 = 0;
        boolean stackIn_316_1 = false;
        IconTextComponent stackIn_320_0 = null;
        boolean stackIn_321_1 = false;
        IconTextComponent stackIn_325_0 = null;
        boolean stackIn_326_1 = false;
        RuntimeException stackIn_336_0 = null;
        StringBuilder stackIn_336_1 = null;
        String stackIn_337_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        IconTextComponent[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        IconTextComponent var17 = null;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        int var22_int = 0;
        int var23 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        IconTextComponent var28 = null;
        IconTextComponent var29 = null;
        IconTextComponent[] var30 = null;
        Object var31 = null;
        String var31_ref = null;
        String var32 = null;
        Object var25Lifetime1;
        Object var31Lifetime1;
        Object var25Lifetime2;
        Object var25Lifetime3;
        Object var25Lifetime1Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var8_intLifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var16Lifetime2;
        var26 = Virogrid.field_F ? 1 : 0;
        try {
          if (!param1) {
            if (GameEntryHelpers.isCurrentGameEntry(1000)) {
              stackIn_12_0 = (!param3.field_kc) ? 1 : 0;
            } else {
              stackIn_12_0 = 0;
            }
            var4_int = stackIn_12_0;
          } else {
            stackIn_5_0 = (GameKeyHandler.field_c) ? 0 : 1;
            var4_int = stackIn_5_0;
          }
          var5 = 0;
          if (!param1) {
            for (var6 = 0; var6 < 5; var6++) {
              if (var4_int != 0 &&
                0 != SessionSeedHelpers.field_b[0][var6 + 1].field_nb &&
                param3.field_fc != var6) {
                param3.field_fc = var6;
                var5 = 1;
              }
              stackIn_22_0 = SessionSeedHelpers.field_b[0][var6 + 1];
              stackIn_23_1 = (var4_int != 0);
              stackIn_22_0.field_Y = stackIn_23_1;
              if (!DialWidgetPainter.field_d &&
                var6 == 3) {
                SessionSeedHelpers.field_b[0][1 + var6].field_Y = false;
              }
              stackIn_28_0 = SessionSeedHelpers.field_b[0][var6 + 1];
              stackIn_29_1 = (param3.field_fc == var6);
              stackIn_28_0.field_xb = stackIn_29_1;
            }
            if (SessionSeedHelpers.field_b[0][2].field_G) {
              if (!GameEntryHelpers.isCurrentGameEntry(param2 + 2137401888)) {
                QuickChatCategoryCache.field_g = MenuScreen.formatIndexedText(new String[]{AudioSetupHelpers.field_d.field_Qb}, TriangleSortHelpers.field_d, 2);
              } else {
                QuickChatCategoryCache.field_g = SocketJs5Transport.field_y;
              }
            }
          }
          if (UiLayerInputHelpers.field_b.length >= 2) {
            if (param1) {
              stackIn_41_0 = (SectorCacheStore.field_f != -1) ? 1 : 0;
            } else {
              stackIn_41_0 = 0;
            }
            var6Lifetime1 = stackIn_41_0;
            if (var6Lifetime1 != 0) {
              var7 = SectorCacheStore.field_f;
              for (var8_int = 0; FadeLayer.field_E.length > var8_int; var8_int++) {
                FadeLayer.field_E[var8_int] = (byte) 0;
              }
              FadeLayer.field_E[var7 / 8] = (byte)BitwiseHelpers.bitOr((int) FadeLayer.field_E[var7 / 8], 1 << var7 % 8);
            }
            stackIn_49_0 = (param1) ? -1 : 0;
            for (var7 = stackIn_49_0; var7 < UiLayerInputHelpers.field_b.length; var7++) {
              if (var6Lifetime1 != 0) {
                stackIn_57_0 = (SectorCacheStore.field_f != var7) ? 1 : 0;
              } else {
                stackIn_57_0 = 0;
              }
              var8_intLifetime1 = stackIn_57_0;
              if (var4_int != 0 &&
                SessionSeedHelpers.field_b[1][var7 + 1].field_nb != 0) {
                if (param1) {
                  if (var6Lifetime1 == 0) {
                    if (var7 == -1) {
                      for (var9 = 0; var9 < FadeLayer.field_E.length; var9++) {
                        FadeLayer.field_E[var9] = (byte) 0;
                      }
                    } else {
                      FadeLayer.field_E[var7 / 8] = (byte)GzipDecompressor.bitXor((int) FadeLayer.field_E[var7 / 8], 1 << WidgetFactoryHelpers.bitAnd(7, var7));
                    }
                  }
                } else {
                  var9 = UiLayerInputHelpers.field_b[var7];
                  if (param3.field_vc != var9) {
                    param3.field_vc = var9;
                    var5 = 1;
                  }
                }
              }
              if (param1) {
                if (var7 == -1) {
                  SessionSeedHelpers.field_b[1][1 + var7].field_xb = true;
                  for (var9 = 0; var9 < UiLayerInputHelpers.field_b.length; var9++) {
                    dupTemp$0 = SessionSeedHelpers.field_b[1][var7 + 1];
                    stackIn_84_0 = dupTemp$0;
                    stackIn_84_1 = dupTemp$0.field_xb;
                    stackIn_85_2 = (0 == (FadeLayer.field_E[var9 / 8] & 1 << (7 & var9)));
                    stackIn_84_0.field_xb = stackIn_84_1 & stackIn_85_2;
                  }
                } else {
                  stackIn_76_0 = SessionSeedHelpers.field_b[1][var7 + 1];
                  stackIn_76_1 = -1;
                  stackIn_76_2 = ~(FadeLayer.field_E[var7 / 8] & 1 << (var7 & 7));
                  stackIn_79_1 = (stackIn_76_1 != stackIn_76_2);
                  stackIn_76_0.field_xb = stackIn_79_1;
                }
              } else {
                var9 = UiLayerInputHelpers.field_b[var7];
                stackIn_71_0 = SessionSeedHelpers.field_b[1][1 + var7];
                stackIn_72_1 = (var9 == param3.field_vc);
                stackIn_71_0.field_xb = stackIn_72_1;
              }
              stackIn_89_0 = SessionSeedHelpers.field_b[1][var7 + 1];
              stackIn_90_1 = (var4_int != 0) && (var8_intLifetime1 == 0);
              stackIn_89_0.field_Y = stackIn_90_1;
            }
          }
          stackIn_94_0 = (param1) ? 0 : 1;
          for (var6Lifetime2 = stackIn_94_0; var6Lifetime2 < 3; var6Lifetime2++) {
            var28 = SessionSeedHelpers.field_b[2][var6Lifetime2];
            if (var4_int != 0 &&
              var28.field_nb != 0) {
              if (!param1) {
                if (param3.field_lc != var6Lifetime2) {
                  param3.field_lc = var6Lifetime2;
                  var5 = 1;
                }
              } else {
                if (0 != var6Lifetime2) {
                  ArchiveLoadSequence.field_c = ArchiveLoadSequence.field_c ^ var6Lifetime2;
                } else {
                  ArchiveLoadSequence.field_c = 0;
                }
              }
            }
            stackIn_107_0 = var28;
            stackIn_108_1 = (var4_int != 0);
            stackIn_107_0.field_Y = stackIn_108_1;
            if (!param1) {
              stackIn_120_0 = var28;
              stackIn_121_1 = ((var6Lifetime2 & param3.field_lc) != 0);
              stackIn_120_0.field_xb = stackIn_121_1;
            } else {
              if (var6Lifetime2 != 0) {
                stackIn_116_0 = var28;
                stackIn_117_1 = ((ArchiveLoadSequence.field_c & var6Lifetime2) != 0);
                stackIn_116_0.field_xb = stackIn_117_1;
              } else {
                stackIn_112_0 = var28;
                stackIn_113_1 = (ArchiveLoadSequence.field_c == 0);
                stackIn_112_0.field_xb = stackIn_113_1;
              }
            }
          }
          if (param1 &&
            PopupMenuDrawHelpers.field_f > 1) {
            for (var6Lifetime3 = 0; 1 + PopupMenuDrawHelpers.field_f > var6Lifetime3; var6Lifetime3++) {
              var29 = SessionSeedHelpers.field_b[3][var6Lifetime3];
              if (var4_int != 0 &&
                var29.field_nb != 0) {
                QuickChatHelpHelpers.field_e = var6Lifetime3;
              }
              if (var29.field_G &&
                var6Lifetime3 > 0) {
                if (null == DisplayModeInfo.field_j) {
                  stackIn_137_0 = null;
                } else {
                  stackIn_137_0 = DisplayModeInfo.field_j[var6Lifetime3 - 1];
                }
                var8 = stackIn_137_0;
                if (var8 != null) {
                  QuickChatCategoryCache.field_g = var8;
                }
              }
              stackIn_142_0 = var29;
              stackIn_143_1 = (QuickChatHelpHelpers.field_e == var6Lifetime3);
              stackIn_142_0.field_xb = stackIn_143_1;
              stackIn_145_0 = var29;
              stackIn_146_1 = (var4_int != 0);
              stackIn_145_0.field_Y = stackIn_146_1;
            }
          }
          var6Lifetime4 = 0;
          for (var7 = 0; var7 < TextMetricsGlobals.field_h; var7++) {
            var30 = SessionSeedHelpers.field_b[var7 + 4];
            var8_array = var30;
            stackIn_152_0 = (param1) ? -1 : 0;
            for (var9 = stackIn_152_0; var9 < -1 + var30.length; var9++) {
              var10 = 0;
              var11 = 0;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              if (var4_int != 0 &&
                var9 >= 0) {
                if (null != ContentTransitionDialog.field_db &&
                  ContentTransitionDialog.field_db[var7] != null &&
                  (ContentTransitionDialog.field_db[var7][var9] & ~StatefulWidgetPainter.field_x) > 0) {
                  var14 = 1;
                  var15 = TextFieldValidator.highestOneBit(-728240159, ContentTransitionDialog.field_db[var7][var9] & ~StatefulWidgetPainter.field_x);
                }
                if (TriangleSortHelpers.field_i != null &&
                  TriangleSortHelpers.field_i[var7] != null &&
                  0 >= NameCharacterHelpers.field_d &&
                  TriangleSortHelpers.field_i[var7][var9]) {
                  var10 = 1;
                }
                if (null != FadingModalPanel.field_E &&
                  null != FadingModalPanel.field_E[var7]) {
                  var16 = FadingModalPanel.field_E[var7][var9];
                  if (var16 > 0 &&
                    var16 > DiskCacheWorker.field_i) {
                    var12 = 1;
                  }
                  if (var16 != 0 &&
                    !ArchiveBytesHelpers.field_a &&
                    NameCharacterHelpers.field_d <= 0) {
                    var10 = 1;
                  }
                }
                if (TriangleMesh.field_B != null &&
                  null != TriangleMesh.field_B[var7]) {
                  var16Lifetime2 = TriangleMesh.field_B[var7][var9];
                  if (var16Lifetime2 != 0 &&
                    !ArchiveBytesHelpers.field_a &&
                    NameCharacterHelpers.field_d <= 0) {
                    var10 = 1;
                  }
                  if (0 < var16Lifetime2 &&
                    var16Lifetime2 > BufferedFile.field_c) {
                    var11 = 1;
                  }
                }
                if (param1) {
                  if (WidgetNode.field_t != null) {
                    if (WidgetNode.field_t[var7] != null) {
                      stackIn_195_0 = (!WidgetNode.field_t[var7][var9]) ? 0 : 1;
                    } else {
                      stackIn_195_0 = 0;
                    }
                  } else {
                    stackIn_195_0 = 0;
                  }
                } else {
                  stackIn_195_0 = 0;
                }
                var13 = stackIn_195_0;
              }
              if (2 <= ReflectionCheckHelpers.field_d &&
                ResizableDialog.field_Y[12]) {
                var11 = 0;
                var10 = 0;
                var13 = 0;
                var12 = 0;
                var14 = 0;
              }
              if (var10 == 0 &&
                var11 == 0 &&
                var12 == 0 &&
                var13 == 0) {
                if (var14 == 0) {
                  stackIn_208_0 = 0;
                } else {
                  stackIn_208_0 = 1;
                }
              } else {
                stackIn_208_0 = 1;
              }
              var16Lifetime1 = stackIn_208_0;
              ViewModeNoticeGlobals.field_b = true;
              if (var16Lifetime1 == 0 &&
                0 <= var9 &&
                null != ArchiveRequest.field_q && (!param1 ||
                !GameKeyHandler.field_c)) {
                PasswordLoginCredentials.field_l = false;
                ViewModeNoticeGlobals.field_b = false;
                if (NetworkArchiveRequest.field_D == null) {
                  NetworkArchiveRequest.field_D = new byte[TextMetricsGlobals.field_h];
                  IconTextComponent.field_Lb = new boolean[TextMetricsGlobals.field_h];
                }
                for (var17_int = 0; var7 > var17_int; var17_int++) {
                  IconTextComponent.field_Lb[var17_int] = false;
                }
                FadeLayer.findValidSettingCombination(param1, var9, -1, var7, 0, 8, -1, param3);
                if (ReflectionCheckHelpers.field_d >= 2 &&
                  ResizableDialog.field_Y[12]) {
                  ViewModeNoticeGlobals.field_b = true;
                }
                if (!ViewModeNoticeGlobals.field_b) {
                  var16Lifetime1 = 1;
                }
              }
              var17 = var8_array[1 + var9];
              if (var4_int != 0 &&
                var17.field_nb != 0) {
                if (param1) {
                  if (var9 == -1) {
                    for (var18 = var6Lifetime4; -1 + (var30.length + var6Lifetime4) > var18; var18++) {
                      MouseTrailPoint.field_p[var18 / 8] = (byte)WidgetFactoryHelpers.bitAnd((int) MouseTrailPoint.field_p[var18 / 8], ~(1 << WidgetFactoryHelpers.bitAnd(var18, 7)));
                    }
                  } else {
                    MouseTrailPoint.field_p[(var9 + var6Lifetime4) / 8] = (byte)GzipDecompressor.bitXor((int) MouseTrailPoint.field_p[(var9 + var6Lifetime4) / 8], 1 << WidgetFactoryHelpers.bitAnd(var9 + var6Lifetime4, 7));
                  }
                } else {
                  if (var16Lifetime1 == 0 &&
                    (byte)var9 != param3.field_Pb[var7]) {
                    var5 = 1;
                    param3.field_Pb[var7] = (byte)var9;
                  }
                }
              }
              if (param1 &&
                var16Lifetime1 != 0) {
                MouseTrailPoint.field_p[(var6Lifetime4 + var9) / 8] = (byte)WidgetFactoryHelpers.bitAnd((int) MouseTrailPoint.field_p[(var6Lifetime4 + var9) / 8], ~(1 << WidgetFactoryHelpers.bitAnd(7, var6Lifetime4 + var9)));
              }
              if (0 <= var9 &&
                var17.field_G) {
                if (null == GameBoard.field_d) {
                  var18_ref = null;
                } else {
                  if (GameBoard.field_d[var7] != null) {
                    var18_ref = GameBoard.field_d[var7][var9];
                  } else {
                    var18_ref = null;
                  }
                }
                if (QuickChatPhraseDefinition.field_p == null) {
                  var19 = null;
                } else {
                  if (QuickChatPhraseDefinition.field_p[var7] != null) {
                    var19 = QuickChatPhraseDefinition.field_p[var7][var9];
                  } else {
                    var19 = null;
                  }
                }
                var20 = null;
                if (var19 != null &&
                  !((String) (var19)).equals(var18_ref)) {
                  var20 = var19;
                }
                var21 = null;
                if (var13 == 0) {
                  if (var10 != 0) {
                    var21 = LoginPanel.field_L;
                    var22 = var21;
                    var25 = var22;
                    var22 = var25;
                    var21 = var22;
                    var25Lifetime2 = var21;
                    var22 = var25Lifetime2;
                    var25Lifetime3 = var22;
                    var22 = var25Lifetime3;
                    var21 = var22;
                    var22 = var25Lifetime3;
                  } else {
                    if (var11 != 0) {
                      var22_int = -BufferedFile.field_c + TriangleMesh.field_B[var7][var9];
                      if (var22_int != 1) {
                        var21 = MenuScreen.formatIndexedText(new String[]{Integer.toString(var22_int)}, SocketConnector.field_a, param2 ^ -2137400886);
                        var31 = var21;
                        var21 = var31;
                        var31Lifetime1 = var21;
                        var21 = var31Lifetime1;
                      } else {
                        var21 = ChecksumHelpers.field_f;
                      }
                    }
                    if (var12 != 0) {
                      var31_ref = MenuScreen.formatIndexedText(new String[]{Integer.toString(DiskCacheWorker.field_i), Integer.toString(FadingModalPanel.field_E[var7][var9])}, MenuInputState.field_j, param2 + 2137400890);
                      var21 = var31_ref;
                      var21 = var31_ref;
                      if (var21 != null) {
                        var21 = (String) (var21) + "<br>" + var31_ref;
                      } else {
                        var21 = var31_ref;
                      }
                    }
                    if (var14 != 0) {
                      var22 = BufferedSocket.field_a;
                      if (var15 > 0 &&
                        null != MouseInputHandler.field_a &&
                        var15 <= MouseInputHandler.field_a.length &&
                        null != MouseInputHandler.field_a[var15 - 1]) {
                        var22 = MouseInputHandler.field_a[var15 - 1][0];
                      }
                      if (var21 == null) {
                        var21 = var22;
                      } else {
                        var21 = (String) (var21) + "<br>" + (String) (var22);
                      }
                    }
                  }
                } else {
                  var21 = ChatAndIgnoreHelpers.field_d;
                }
                if (var4_int != 0 &&
                  !ViewModeNoticeGlobals.field_b) {
                  var22 = null;
                  var23 = 0;
                  if (PasswordLoginCredentials.field_l) {
                    var22 = "</col>" + FrameSkin.field_d + "<col=A00000>";
                    var25Lifetime1 = var22;
                    var22 = var25Lifetime1;
                    var25Lifetime1Lifetime1 = var22;
                    var22 = var25Lifetime1Lifetime1;
                    var21 = var22;
                  }
                  for (var24 = 0; var7 > var24; var24++) {
                    if (IconTextComponent.field_Lb[var24]) {
                      var25_ref = "</col>" + LoginMethodHelpers.field_a[var24] + "<col=A00000>";
                      var22 = var25_ref;
                      var21 = var22;
                      var22 = var25_ref;
                      if (var22 != null) {
                        var23 = 1;
                        var22 = (String) (var22) + ", " + var25_ref;
                        var21 = var22;
                        var21 = var22;
                      } else {
                        var22 = var25_ref;
                      }
                    }
                  }
                  if (var23 == 0) {
                    var21 = MenuScreen.formatIndexedText(new String[]{(String) (var22)}, BitwiseHelpers.field_b, 2);
                  } else {
                    var21 = BirthDateEntryPanel.field_I + (String) (var22);
                  }
                }
                if (var21 != null) {
                  var21 = "<col=A00000>" + (String) (var21);
                  var32 = MusicPatchEnvelope.replaceAllOccurrences((String) (var21), (byte) -71, "<br><col=A00000>", "<br>");
                  if (var20 == null) {
                    var20 = var32;
                  } else {
                    var20 = (String) (var20) + "<br>" + var32;
                  }
                }
                if (var20 != null) {
                  QuickChatCategoryCache.field_g = (String) (var20);
                }
              }
              if (!param1) {
                stackIn_320_0 = var17;
                stackIn_321_1 = (ViewModeNoticeGlobals.field_b) && ((byte)var9 == param3.field_Pb[var7]);
                stackIn_320_0.field_xb = stackIn_321_1;
              } else {
                if (var9 == -1) {
                  var17.field_xb = true;
                  var27 = var6Lifetime4;
                  var18Lifetime1 = var27;
                  while (var6Lifetime4 + var30.length - 1 > var27) {
                    stackIn_310_0 = var17;
                    stackIn_310_1 = var17.field_xb;
                    stackIn_311_2 = ((MouseTrailPoint.field_p[var27 / 8] & 1 << (var27 & 7)) == 0);
                    stackIn_310_0.field_xb = stackIn_310_1 & stackIn_311_2;
                    var27++;
                  }
                } else {
                  stackIn_313_0 = var17;
                  stackIn_313_1 = 0;
                  stackIn_313_2 = MouseTrailPoint.field_p[(var6Lifetime4 + var9) / 8];
                  stackIn_313_3 = 1 << (var6Lifetime4 + var9 & 7);
                  stackIn_316_1 = (stackIn_313_1 != (stackIn_313_2 & stackIn_313_3));
                  stackIn_313_0.field_xb = stackIn_316_1;
                }
              }
              stackIn_325_0 = var17;
              stackIn_326_1 = (var4_int != 0) && (var16Lifetime1 == 0);
              stackIn_325_0.field_Y = stackIn_326_1;
            }
            var6Lifetime4 = var6Lifetime4 + (255 & LobbyPlayerEntry.field_Pb[var7]);
          }
          if (param2 != -2137400888) {
            field_k = (MenuInputState) null;
          }
          if (var5 != 0 &&
            !param1) {
            ChatFilterHelpers.sendGameOptions(param2 + 2137400888, param0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_336_0 = var4;
          stackIn_336_1 = new StringBuilder().append("co.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_337_2 = "null";
          } else {
            stackIn_337_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_336_0), ((StringBuilder) (Object) stackIn_336_1).append(stackIn_337_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_f = null;
        field_a = null;
        field_b = null;
        field_k = null;
        field_g = null;
        field_e = (long[][]) null;
        int var1 = -27 / ((38 - param0) / 38);
    }

    final boolean matchesCookieValue(byte param0, String param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 115) {
            field_l = 46;
          }
          stackIn_3_0 = this.field_c.equals(param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("co.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void saveAsLastLoginMethod(java.applet.Applet param0, byte param1) {
        try {
          DiskCacheWorker.setCookie("jagex-last-login-method", this.field_c, param0, 31536000L, (byte) -2);
          if (param1 <= 72) {
            field_i = -115;
          }
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "co.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    LoginMethod(String param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "co.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static String validateDisplayName(boolean param0, CharSequence param1, byte param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          var3 = HuffmanCodec.validatePlayerNameFormat((byte) 105, param0, param1);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          if (param2 > -69) {
            LoginMethod.tickLobbyTransitions(-91);
          }
          var4 = 0;
          while (true) {
            if (var4 >= param1.length()) {
              return null;
            }
            if (QuickChatPhraseRegistry.isValidNameCharacter(param1.charAt(var4), 15232)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_12_0 = DialogMessagePane.field_K;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("co.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void tickLobbyTransitions(int param0) {
        int var2;
        var2 = Virogrid.field_F ? 1 : 0;
        if (ClientServiceHelpers.field_d <= 0) {
          if (PendingHighscoreRequest.field_h > 0) {
            PendingHighscoreRequest.field_h = PendingHighscoreRequest.field_h - 1;
          } else {
            if (0 < QuickChatPhraseDefinition.field_z) {
              QuickChatPhraseDefinition.field_z = QuickChatPhraseDefinition.field_z - 1;
            }
          }
        } else {
          ClientServiceHelpers.field_d = ClientServiceHelpers.field_d - 1;
        }
        if (0 < ClientServiceHelpers.field_d) {
          WidgetLayerStack.layoutLobbySlidePanels(param0 - 17491);
        }
        if (param0 < PendingHighscoreRequest.field_h) {
          TriangleSortHelpers.positionSlidingPanels(PendingHighscoreRequest.field_h, -4);
        }
        if (QuickChatPhraseDefinition.field_z > 0) {
          TriangleSortHelpers.positionSlidingPanels(QuickChatPhraseDefinition.field_z, -4);
        }
    }

    static {
        int var14 = 0;
        long stackIn_5_0 = 0L;
        int var0;
        int var1;
        long var2;
        long var4;
        long var6;
        long var8;
        long var10;
        long var12;
        int var15;
        field_h = 256;
        field_a = new IntrusiveDeque();
        field_e = new long[8][256];
        field_b = new long[11];
        var0 = 0;
        scanLoop1: while (var0 < 256) {
          var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
          if ((var0 & 1) == 0) {
            stackIn_5_0 = (long)(var1 >>> 8);
          } else {
            stackIn_5_0 = (long)(var1 & 255);
          }
          var2 = stackIn_5_0;
          var4 = var2 << 1;
          if (256L <= var4) {
            var4 = var4 ^ 285L;
          }
          var6 = var4 << 1;
          if (var6 >= 256L) {
            var6 = var6 ^ 285L;
          }
          var8 = var2 ^ var6;
          var10 = var6 << 1;
          if (256L <= var10) {
            var10 = var10 ^ 285L;
          }
          var12 = var10 ^ var2;
          field_e[0][var0] = NanoTickClock.bitOr(var12, NanoTickClock.bitOr(NanoTickClock.bitOr(var8 << 16, NanoTickClock.bitOr(var10 << 24, NanoTickClock.bitOr(var2 << 32, NanoTickClock.bitOr(NanoTickClock.bitOr(var2 << 48, var2 << 56), var6 << 40)))), var4 << 8));
          for (var14 = 1; var14 < 8; var14++) {
            field_e[var14][var0] = NanoTickClock.bitOr(field_e[var14 - 1][var0] >>> 8, field_e[-1 + var14][var0] << 56);
          }
          var0++;
        }
        field_b[0] = 0L;
        var15 = 1;
        var0 = var15;
        scanLoop2: while (var15 <= 10) {
          var1 = -8 + var15 * 8;
          field_b[var15] = ConditionalTextValue.bitXor(ConditionalTextValue.bitXor(ConditionalTextValue.bitXor(ConditionalTextValue.bitXor(ConditionalTextValue.bitXor(ConditionalTextValue.bitXor(AudioPumpThread.bitAnd(field_e[2][2 + var1], 280375465082880L), ConditionalTextValue.bitXor(AudioPumpThread.bitAnd(-72057594037927936L, field_e[0][var1]), AudioPumpThread.bitAnd(field_e[1][var1 + 1], 71776119061217280L))), AudioPumpThread.bitAnd(1095216660480L, field_e[3][var1 + 3])), AudioPumpThread.bitAnd(4278190080L, field_e[4][4 + var1])), AudioPumpThread.bitAnd(16711680L, field_e[5][var1 + 5])), AudioPumpThread.bitAnd(field_e[6][6 + var1], 65280L)), AudioPumpThread.bitAnd(field_e[7][7 + var1], 255L));
          var15++;
        }
        field_k = new MenuInputState(1);
    }
}
