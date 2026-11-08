/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameOptionControls {
    static int[] field_b;
    static int[] field_g;
    static int[][] field_f;
    static int[] field_h;
    static int[] field_j;
    static int field_k;
    static int field_a;
    static ClientProtocolStage field_d;
    static String field_i;
    static String field_e;
    static boolean field_c;

    public static void releaseStatics(int param0) {
        field_d = null;
        field_b = null;
        field_j = null;
        field_h = null;
        field_i = null;
        field_g = null;
        field_f = (int[][]) null;
        field_e = null;
        int var1 = 103 / ((48 - param0) / 57);
    }

    final static void updateGameOptionControls(int param0, LobbyGame param1, int param2, boolean param3) {
        IconLabelItem dupTemp$0 = null;
        IconLabelItem dupTemp$1 = null;
        int var17_int = 0;
        int var24 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        IconLabelItem stackIn_25_0 = null;
        boolean stackIn_26_1 = false;
        IconLabelItem stackIn_32_0 = null;
        boolean stackIn_33_1 = false;
        int stackIn_46_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        IconLabelItem stackIn_72_0 = null;
        boolean stackIn_73_1 = false;
        IconLabelItem stackIn_79_0 = null;
        boolean stackIn_79_1 = false;
        boolean stackIn_80_2 = false;
        IconLabelItem stackIn_89_0 = null;
        boolean stackIn_90_1 = false;
        IconLabelItem stackIn_96_0 = null;
        boolean stackIn_96_1 = false;
        boolean stackIn_97_2 = false;
        IconLabelItem stackIn_100_0 = null;
        byte stackIn_100_1 = 0;
        int stackIn_100_2 = 0;
        int stackIn_100_3 = 0;
        boolean stackIn_103_1 = false;
        IconLabelItem stackIn_107_0 = null;
        boolean stackIn_108_1 = false;
        int stackIn_112_0 = 0;
        IconLabelItem stackIn_126_0 = null;
        boolean stackIn_127_1 = false;
        IconLabelItem stackIn_131_0 = null;
        boolean stackIn_132_1 = false;
        IconLabelItem stackIn_135_0 = null;
        boolean stackIn_136_1 = false;
        IconLabelItem stackIn_139_0 = null;
        boolean stackIn_140_1 = false;
        String stackIn_155_0 = null;
        IconLabelItem stackIn_160_0 = null;
        boolean stackIn_161_1 = false;
        IconLabelItem stackIn_163_0 = null;
        boolean stackIn_164_1 = false;
        int stackIn_170_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_228_0 = 0;
        IconLabelItem stackIn_327_0 = null;
        boolean stackIn_327_1 = false;
        boolean stackIn_328_2 = false;
        IconLabelItem stackIn_330_0 = null;
        byte stackIn_330_1 = 0;
        int stackIn_330_2 = 0;
        int stackIn_330_3 = 0;
        boolean stackIn_333_1 = false;
        IconLabelItem stackIn_337_0 = null;
        boolean stackIn_338_1 = false;
        IconLabelItem stackIn_342_0 = null;
        boolean stackIn_343_1 = false;
        RuntimeException stackIn_352_0 = null;
        StringBuilder stackIn_352_1 = null;
        String stackIn_353_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        IconLabelItem[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        IconLabelItem var17 = null;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        int var22_int = 0;
        Object var22 = null;
        int var23 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        IconLabelItem var28 = null;
        IconLabelItem var29 = null;
        IconLabelItem[] var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        Object var25Lifetime1;
        String var25_refLifetime1;
        Object var25Lifetime2;
        Object var25Lifetime1Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var8_intLifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var16Lifetime2;
        var26 = TetraLink.field_J;
        try {
          if (param3) {
            stackIn_12_0 = (FullscreenFocusCanvas.field_a) ? 0 : 1;
            var4_int = stackIn_12_0;
          } else {
            if (MenuThemeHelpers.isCurrentGameOwner(63)) {
              stackIn_8_0 = (!param1.field_Kb) ? 1 : 0;
            } else {
              stackIn_8_0 = 0;
            }
            var4_int = stackIn_8_0;
          }
          var5 = 0;
          if (param2 != 30544) {
            field_h = (int[]) null;
          }
          if (!param3) {
            for (var6 = 0; var6 < 5; var6++) {
              if (var4_int != 0 &&
                ClientException.field_e[0][var6 + 1].field_F != 0 &&
                param1.field_ic != var6) {
                param1.field_ic = var6;
                var5 = 1;
              }
              stackIn_25_0 = ClientException.field_e[0][var6 + 1];
              stackIn_26_1 = (var4_int != 0);
              stackIn_25_0.field_S = stackIn_26_1;
              if (!IntroFinalFrameHelpers.field_b &&
                var6 == 3) {
                ClientException.field_e[0][var6 + 1].field_S = false;
              }
              stackIn_32_0 = ClientException.field_e[0][var6 + 1];
              stackIn_33_1 = (var6 == param1.field_ic);
              stackIn_32_0.field_zb = stackIn_33_1;
            }
            if (ClientException.field_e[0][2].field_rb) {
              if (MenuThemeHelpers.isCurrentGameOwner(63)) {
                CheckboxWidget.field_P = TextLayoutLine.field_f;
              } else {
                CheckboxWidget.field_P = SectorCacheStore.formatTemplate(new String[]{AccountWelcomePanel.field_N.field_ec}, MenuInputState.field_e, param2 ^ 30509);
              }
            }
          }
          if (MenuScreen.field_f.length >= 2) {
            if (param3) {
              stackIn_46_0 = (LoadingProgressDialog.field_eb != -1) ? 1 : 0;
            } else {
              stackIn_46_0 = 0;
            }
            var6Lifetime1 = stackIn_46_0;
            if (var6Lifetime1 != 0) {
              var7 = LoadingProgressDialog.field_eb;
              for (var8_int = 0; PendingSubmission.field_o.length > var8_int; var8_int++) {
                PendingSubmission.field_o[var8_int] = (byte) 0;
              }
              PendingSubmission.field_o[var7 / 8] = (byte)IntrusiveNode.bitOr((int) PendingSubmission.field_o[var7 / 8], 1 << var7 % 8);
            }
            stackIn_55_0 = (!param3) ? 0 : -1;
            for (var7 = stackIn_55_0; var7 < MenuScreen.field_f.length; var7++) {
              if (var6Lifetime1 != 0) {
                stackIn_63_0 = (var7 != LoadingProgressDialog.field_eb) ? 1 : 0;
              } else {
                stackIn_63_0 = 0;
              }
              regionExit1: {
                boolean decompiledFrameRemainder0 = true;
                var8_intLifetime1 = stackIn_63_0;
                if (var4_int != 0 &&
                  ClientException.field_e[1][var7 + 1].field_F != 0) {
                  if (param3) {
                    if (var6Lifetime1 != 0) {
                      if (!param3) {
                        var9 = MenuScreen.field_f[var7];
                        stackIn_72_0 = ClientException.field_e[1][var7 + 1];
                        stackIn_73_1 = (param1.field_rc == var9);
                        stackIn_72_0.field_zb = stackIn_73_1;
                        break regionExit1;
                      }
                      decompiledFrameRemainder0 = (var7 == -1);
                      if (decompiledFrameRemainder0) {
                        ClientException.field_e[1][var7 + 1].field_zb = true;
                        for (var9 = 0; MenuScreen.field_f.length > var9; var9++) {
                          dupTemp$0 = ClientException.field_e[1][var7 + 1];
                          stackIn_79_0 = dupTemp$0;
                          stackIn_79_1 = dupTemp$0.field_zb;
                          stackIn_80_2 = ((PendingSubmission.field_o[var9 / 8] & 1 << (7 & var9)) == 0);
                          stackIn_79_0.field_zb = stackIn_79_1 & stackIn_80_2;
                        }
                        break regionExit1;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      if (var7 == -1) {
                        for (var9 = 0; PendingSubmission.field_o.length > var9; var9++) {
                          PendingSubmission.field_o[var9] = (byte) 0;
                        }
                      } else {
                        PendingSubmission.field_o[var7 / 8] = (byte)IsaacCipher.bitXor((int) PendingSubmission.field_o[var7 / 8], 1 << StatusRequestHelpers.bitAnd(var7, 7));
                      }
                    }
                  } else {
                    var9 = MenuScreen.field_f[var7];
                    if (var9 != param1.field_rc) {
                      param1.field_rc = var9;
                      var5 = 1;
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (!param3) {
                    var9 = MenuScreen.field_f[var7];
                    stackIn_89_0 = ClientException.field_e[1][var7 + 1];
                    stackIn_90_1 = (param1.field_rc == var9);
                    stackIn_89_0.field_zb = stackIn_90_1;
                    break regionExit1;
                  }
                  if (var7 == -1) {
                    ClientException.field_e[1][var7 + 1].field_zb = true;
                    for (var9 = 0; MenuScreen.field_f.length > var9; var9++) {
                      dupTemp$1 = ClientException.field_e[1][var7 + 1];
                      stackIn_96_0 = dupTemp$1;
                      stackIn_96_1 = dupTemp$1.field_zb;
                      stackIn_97_2 = ((PendingSubmission.field_o[var9 / 8] & 1 << (7 & var9)) == 0);
                      stackIn_96_0.field_zb = stackIn_96_1 & stackIn_97_2;
                    }
                    break regionExit1;
                  }
                }
                stackIn_100_0 = ClientException.field_e[1][var7 + 1];
                stackIn_100_1 = PendingSubmission.field_o[var7 / 8];
                stackIn_100_2 = 1;
                stackIn_100_3 = 7 & var7;
                stackIn_103_1 = ((stackIn_100_1 & stackIn_100_2 << stackIn_100_3) != 0);
                stackIn_100_0.field_zb = stackIn_103_1;
              }
              stackIn_107_0 = ClientException.field_e[1][var7 + 1];
              stackIn_108_1 = (var4_int != 0) && (var8_intLifetime1 == 0);
              stackIn_107_0.field_S = stackIn_108_1;
            }
          }
          stackIn_112_0 = (!param3) ? 1 : 0;
          for (var6Lifetime2 = stackIn_112_0; var6Lifetime2 < 3; var6Lifetime2++) {
            var28 = ClientException.field_e[2][var6Lifetime2];
            if (var4_int != 0 &&
              0 != var28.field_F) {
              if (!param3) {
                if (var6Lifetime2 != param1.field_Zb) {
                  param1.field_Zb = var6Lifetime2;
                  var5 = 1;
                }
              } else {
                if (0 == var6Lifetime2) {
                  QuickChatCategory.field_A = 0;
                } else {
                  QuickChatCategory.field_A = QuickChatCategory.field_A ^ var6Lifetime2;
                }
              }
            }
            if (param3) {
              if (var6Lifetime2 == 0) {
                stackIn_135_0 = var28;
                stackIn_136_1 = (QuickChatCategory.field_A == 0);
                stackIn_135_0.field_zb = stackIn_136_1;
              } else {
                stackIn_131_0 = var28;
                stackIn_132_1 = (0 != (var6Lifetime2 & QuickChatCategory.field_A));
                stackIn_131_0.field_zb = stackIn_132_1;
              }
            } else {
              stackIn_126_0 = var28;
              stackIn_127_1 = ((param1.field_Zb & var6Lifetime2) != 0);
              stackIn_126_0.field_zb = stackIn_127_1;
            }
            stackIn_139_0 = var28;
            stackIn_140_1 = (var4_int != 0);
            stackIn_139_0.field_S = stackIn_140_1;
          }
          if (param3 &&
            1 < SocialTabsPanel.field_e) {
            for (var6Lifetime3 = 0; var6Lifetime3 < 1 + SocialTabsPanel.field_e; var6Lifetime3++) {
              var29 = ClientException.field_e[3][var6Lifetime3];
              if (var4_int != 0 &&
                0 != var29.field_F) {
                Js5ArchiveManager.field_c = var6Lifetime3;
              }
              if (var29.field_rb &&
                0 < var6Lifetime3) {
                if (LinkTextPainter.field_a != null) {
                  stackIn_155_0 = LinkTextPainter.field_a[-1 + var6Lifetime3];
                } else {
                  stackIn_155_0 = null;
                }
                var8 = stackIn_155_0;
                if (var8 != null) {
                  CheckboxWidget.field_P = var8;
                }
              }
              stackIn_160_0 = var29;
              stackIn_161_1 = (var6Lifetime3 == Js5ArchiveManager.field_c);
              stackIn_160_0.field_zb = stackIn_161_1;
              stackIn_163_0 = var29;
              stackIn_164_1 = (var4_int != 0);
              stackIn_163_0.field_S = stackIn_164_1;
            }
          }
          var6Lifetime4 = 0;
          for (var7 = 0; field_k > var7; var7++) {
            var30 = ClientException.field_e[var7 + 4];
            var8_array = var30;
            stackIn_170_0 = (param3) ? -1 : 0;
            for (var9 = stackIn_170_0; var30.length - 1 > var9; var9++) {
              var10 = 0;
              var11 = 0;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              if (var4_int != 0 &&
                var9 >= 0) {
                if (null != LobbyResourceHelpers.field_f &&
                  null != LobbyResourceHelpers.field_f[var7] &&
                  (~DiskArchiveRequest.field_H & LobbyResourceHelpers.field_f[var7][var9]) > 0) {
                  var15 = SoundEffectLibrary.highestOneBit(LobbyResourceHelpers.field_f[var7][var9] & ~DiskArchiveRequest.field_H, param2 - 54882);
                  var14 = 1;
                }
                if (MessageDialogContent.field_S != null &&
                  MessageDialogContent.field_S[var7] != null &&
                  0 >= CacheEntry.field_C &&
                  MessageDialogContent.field_S[var7][var9]) {
                  var10 = 1;
                }
                if (null != ClientProtocolStage.field_g &&
                  null != ClientProtocolStage.field_g[var7]) {
                  var16 = ClientProtocolStage.field_g[var7][var9];
                  if (0 < var16 &&
                    var16 > ContextMenu.field_Pb) {
                    var12 = 1;
                  }
                  if (0 != var16 &&
                    !HighscoreQuery.field_r &&
                    CacheEntry.field_C <= 0) {
                    var10 = 1;
                  }
                }
                if (param3) {
                  if (FaceNormal.field_i != null) {
                    if (null != FaceNormal.field_i[var7]) {
                      stackIn_206_0 = (!FaceNormal.field_i[var7][var9]) ? 0 : 1;
                    } else {
                      stackIn_206_0 = 0;
                    }
                  } else {
                    stackIn_206_0 = 0;
                  }
                } else {
                  stackIn_206_0 = 0;
                }
                var13 = stackIn_206_0;
                if (PendingMove.field_e != null &&
                  PendingMove.field_e[var7] != null) {
                  var16Lifetime2 = PendingMove.field_e[var7][var9];
                  if (var16Lifetime2 > 0 &&
                    IntrusiveNode.field_l < var16Lifetime2) {
                    var11 = 1;
                  }
                  if (var16Lifetime2 != 0 &&
                    !HighscoreQuery.field_r &&
                    CacheEntry.field_C <= 0) {
                    var10 = 1;
                  }
                }
              }
              if (SettingsCookieHelpers.field_c >= 2 &&
                ErrorPrintHelpers.field_a[12]) {
                var12 = 0;
                var13 = 0;
                var14 = 0;
                var11 = 0;
                var10 = 0;
              }
              if (var10 == 0 &&
                var11 == 0 &&
                var12 == 0 &&
                var13 == 0) {
                if (var14 == 0) {
                  stackIn_228_0 = 0;
                } else {
                  stackIn_228_0 = 1;
                }
              } else {
                stackIn_228_0 = 1;
              }
              var16Lifetime1 = stackIn_228_0;
              EditableTextWidget.field_R = true;
              if (var16Lifetime1 == 0 &&
                var9 >= 0 &&
                null != ThreeSliceButtonPainter.field_s && (!param3 ||
                !FullscreenFocusCanvas.field_a)) {
                EditableTextWidget.field_R = false;
                NameSuggestionsPanel.field_P = false;
                if (ArrayWidgetContainer.field_K == null) {
                  ArrayWidgetContainer.field_K = new byte[field_k];
                  NetworkArchiveRequest.field_G = new boolean[field_k];
                }
                for (var17_int = 0; var17_int < var7; var17_int++) {
                  NetworkArchiveRequest.field_G[var17_int] = false;
                }
                ProgressMessageDialog.findValidSettingCombination(param3, (byte) -121, -1, param1, 0, -1, var7, var9);
                if (SettingsCookieHelpers.field_c >= 2 &&
                  ErrorPrintHelpers.field_a[12]) {
                  EditableTextWidget.field_R = true;
                }
                if (!EditableTextWidget.field_R) {
                  var16Lifetime1 = 1;
                }
              }
              var17 = var8_array[1 + var9];
              if (var4_int != 0 &&
                var17.field_F != 0) {
                if (!param3) {
                  if (var16Lifetime1 == 0 &&
                    (byte)var9 != param1.field_sc[var7]) {
                    var5 = 1;
                    param1.field_sc[var7] = (byte)var9;
                  }
                } else {
                  if (var9 == -1) {
                    for (var18 = var6Lifetime4; var18 < var6Lifetime4 + (var30.length - 1); var18++) {
                      StringPadHelpers.field_a[var18 / 8] = (byte)StatusRequestHelpers.bitAnd((int) StringPadHelpers.field_a[var18 / 8], ~(1 << StatusRequestHelpers.bitAnd(7, var18)));
                    }
                  } else {
                    StringPadHelpers.field_a[(var9 + var6Lifetime4) / 8] = (byte)IsaacCipher.bitXor((int) StringPadHelpers.field_a[(var9 + var6Lifetime4) / 8], 1 << StatusRequestHelpers.bitAnd(var6Lifetime4 + var9, 7));
                  }
                }
              }
              if (param3 &&
                var16Lifetime1 != 0) {
                StringPadHelpers.field_a[(var9 + var6Lifetime4) / 8] = (byte)StatusRequestHelpers.bitAnd((int) StringPadHelpers.field_a[(var9 + var6Lifetime4) / 8], ~(1 << StatusRequestHelpers.bitAnd(var6Lifetime4 + var9, 7)));
              }
              if (var9 >= 0 &&
                var17.field_rb) {
                if (ChatPanelSlideHelpers.field_g != null) {
                  if (ChatPanelSlideHelpers.field_g[var7] != null) {
                    var18_ref = ChatPanelSlideHelpers.field_g[var7][var9];
                  } else {
                    var18_ref = null;
                  }
                } else {
                  var18_ref = null;
                }
                if (GameOptionTextTables.field_c != null) {
                  if (GameOptionTextTables.field_c[var7] != null) {
                    var19 = GameOptionTextTables.field_c[var7][var9];
                  } else {
                    var19 = null;
                  }
                } else {
                  var19 = null;
                }
                var20 = null;
                if (var19 != null &&
                  !((String) (var19)).equals(var18_ref)) {
                  var20 = var19;
                }
                var21 = null;
                if (var13 == 0) {
                  if (var10 == 0) {
                    if (var11 != 0) {
                      var22_int = -IntrusiveNode.field_l + PendingMove.field_e[var7][var9];
                      if (var22_int == 1) {
                        var21 = PacketDiagnosticsHelpers.field_r;
                      } else {
                        var21 = SectorCacheStore.formatTemplate(new String[]{Integer.toString(var22_int)}, ByteStorage.field_b, param2 - 30420);
                      }
                    }
                    if (var12 != 0) {
                      var31 = SectorCacheStore.formatTemplate(new String[]{Integer.toString(ContextMenu.field_Pb), Integer.toString(ClientProtocolStage.field_g[var7][var9])}, RsaKeyAndTextGlobals.field_b, 126);
                      var22 = var31;
                      var25 = var22;
                      var22 = var25;
                      var21 = var22;
                      var25_ref = var31;
                      var22 = var25_ref;
                      if (var21 == null) {
                        var21 = var31;
                      } else {
                        var21 = (String) (var21) + "<br>" + var31;
                      }
                    }
                    if (var14 != 0) {
                      var22 = GameKeyHandler.field_f;
                      if (var15 > 0 &&
                        SocketJs5Transport.field_t != null &&
                        SocketJs5Transport.field_t.length >= var15 &&
                        SocketJs5Transport.field_t[-1 + var15] != null) {
                        var22 = SocketJs5Transport.field_t[-1 + var15][0];
                      }
                      if (var21 != null) {
                        var21 = (String) (var21) + "<br>" + (String) (var22);
                        var22 = var21;
                        var25Lifetime2 = var22;
                        var22 = var25Lifetime2;
                        var21 = var22;
                        var25Lifetime2 = var21;
                        var22 = var25Lifetime2;
                        var25Lifetime2 = var22;
                        var22 = var25Lifetime2;
                        var21 = var22;
                        var22 = var25Lifetime2;
                      } else {
                        var21 = var22;
                      }
                    }
                  } else {
                    var21 = PendingSubmission.field_q;
                  }
                } else {
                  var21 = MessageDialogContent.field_M;
                }
                if (var4_int != 0 &&
                  !EditableTextWidget.field_R) {
                  var22 = null;
                  if (NameSuggestionsPanel.field_P) {
                    var22 = "</col>" + AccountCreationDialog.field_zb + "<col=A00000>";
                    var25Lifetime1 = var22;
                    var22 = var25Lifetime1;
                    var25Lifetime1Lifetime1 = var22;
                    var22 = var25Lifetime1Lifetime1;
                    var21 = var22;
                  }
                  var23 = 0;
                  for (var24 = 0; var7 > var24; var24++) {
                    if (NetworkArchiveRequest.field_G[var24]) {
                      var25_refLifetime1 = "</col>" + ArchiveRequest.field_y[var24] + "<col=A00000>";
                      var22 = var25_refLifetime1;
                      var21 = var22;
                      var22 = var25_refLifetime1;
                      if (var22 == null) {
                        var22 = var25_refLifetime1;
                        var21 = var22;
                        var21 = var22;
                      } else {
                        var23 = 1;
                        var22 = (String) (var22) + ", " + var25_refLifetime1;
                      }
                    }
                  }
                  if (var23 != 0) {
                    var21 = IntroFinalFrameHelpers.field_e + (String) (var22);
                  } else {
                    var21 = SectorCacheStore.formatTemplate(new String[]{(String) (var22)}, ClientException.field_c, 121);
                  }
                }
                if (var21 != null) {
                  var32 = "<col=A00000>" + (String) (var21);
                  var33 = ClockAndTextHelpers.replaceAllOccurrences("<br><col=A00000>", false, "<br>", var32);
                  if (var20 == null) {
                    var20 = var33;
                  } else {
                    var20 = (String) (var20) + "<br>" + var33;
                  }
                }
                if (var20 != null) {
                  CheckboxWidget.field_P = (String) (var20);
                }
              }
              if (!param3) {
                stackIn_337_0 = var17;
                stackIn_338_1 = (EditableTextWidget.field_R) && ((byte)var9 == param1.field_sc[var7]);
                stackIn_337_0.field_zb = stackIn_338_1;
              } else {
                if (var9 == -1) {
                  var17.field_zb = true;
                  var27 = var6Lifetime4;
                  var18Lifetime1 = var27;
                  while (var27 < var30.length + (var6Lifetime4 - 1)) {
                    stackIn_327_0 = var17;
                    stackIn_327_1 = var17.field_zb;
                    stackIn_328_2 = ((StringPadHelpers.field_a[var27 / 8] & 1 << (7 & var27)) == 0);
                    stackIn_327_0.field_zb = stackIn_327_1 & stackIn_328_2;
                    var27++;
                  }
                } else {
                  stackIn_330_0 = var17;
                  stackIn_330_1 = StringPadHelpers.field_a[(var6Lifetime4 + var9) / 8];
                  stackIn_330_2 = 1;
                  stackIn_330_3 = 7 & var9 + var6Lifetime4;
                  stackIn_333_1 = ((stackIn_330_1 & stackIn_330_2 << stackIn_330_3) != 0);
                  stackIn_330_0.field_zb = stackIn_333_1;
                }
              }
              stackIn_342_0 = var17;
              stackIn_343_1 = (var4_int != 0) && (var16Lifetime1 == 0);
              stackIn_342_0.field_S = stackIn_343_1;
            }
            var6Lifetime4 = var6Lifetime4 + (EditableTextWidget.field_Y[var7] & 255);
          }
          if (var5 != 0) {
            if (param3) {
              return;
            }
            ViewportController.sendGameSettings(true, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_352_0 = var4;
          stackIn_352_1 = new StringBuilder().append("hg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_353_2 = "null";
          } else {
            stackIn_353_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_352_0), ((StringBuilder) (Object) stackIn_352_1).append(stackIn_353_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void renderParticleTexture(Sprite param0, byte param1) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        BackgroundSparkle var3 = null;
        IndexedSprite[] var4 = null;
        IndexedSprite var5 = null;
        int var6 = 0;
        var6 = TetraLink.field_J;
        try {
          RasterTargetHelpers.setSpriteRasterTarget(param0, 6);
          if (PendingStatQuery.hasFeatureBit(0, (byte) 105) &&
            ModelMergeHelpers.nextRandomInt(100, 1692) != 0) {
            SoftwareRasterizer.fillRectangle(0, 0, 200, 400, 0);
            HuffmanCodec.popRasterTarget(true);
            return;
          }
          var2_int = -112 % ((param1 - 57) / 45);
          SoftwareRasterizer.fillRectangle(0, 0, 200, 400, 8421504);
          var3 = (BackgroundSparkle) (AnimationSequence.field_d.first(false));
          while (var3 != null) {
            if (var3.field_o == 0) {
              var4 = MenuInputState.field_f;
            } else {
              if (var3.field_o == 1) {
                var4 = Js5Transport.field_p;
              } else {
                var4 = DialWidget.field_cb;
              }
            }
            var5 = var4[var3.field_r / 3];
            var5.field_p[1] = var3.field_s * 65793;
            if (!var3.field_n) {
              var5.drawFlippedHorizontal(-31, 200);
            } else {
              var5.draw(-31, 200);
            }
            var3 = (BackgroundSparkle) (AnimationSequence.field_d.next((byte) -70));
          }
          HuffmanCodec.popRasterTarget(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("hg.C(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_g = new int[11];
        field_b = new int[11];
        field_j = new int[11];
        field_f = new int[11][];
        field_h = new int[11];
        TabbedPanel.setMenuLayout(136, 0, 0, 32, 150, 490, new int[]{0, 1, 5, 23, 6, 4, 3, 13});
        TabbedPanel.setMenuLayout(136, 0, 1, 32, 150, 490, new int[]{14, 15, 16, 17, 8});
        TabbedPanel.setMenuLayout(112, 0, 2, 32, 150, 490, new int[]{2, 18, 14, 15, 5, 16, 17, 9});
        TabbedPanel.setMenuLayout(108, 0, 3, 29, 150, 490, new int[]{2, 14, 15, 5, 16, 17, 10, 11, 12});
        TabbedPanel.setMenuLayout(112, 0, 4, 32, 150, 490, new int[]{2, 14, 15, 5, 16, 17, 18, 12});
        TabbedPanel.setMenuLayout(112, 0, 5, 32, 150, 490, new int[]{2, 14, 15, 5, 16, 17, 12});
        TabbedPanel.setMenuLayout(328, 0, 6, 32, 150, 490, new int[]{22, 8});
        TabbedPanel.setMenuLayout(330, 0, 7, 32, 150, 490, new int[]{19, 8});
        TabbedPanel.setMenuLayout(328, 0, 8, 32, 150, 490, new int[]{22, 8});
        TabbedPanel.setMenuLayout(300, 0, 9, 32, 150, 490, new int[]{7});
        TabbedPanel.setMenuLayout(300, 0, 10, 32, 150, 490, new int[]{});
        field_c = true;
        field_i = "Names cannot contain consecutive spaces";
        field_d = new ClientProtocolStage();
    }
}
