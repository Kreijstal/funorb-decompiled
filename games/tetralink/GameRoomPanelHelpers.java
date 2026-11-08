/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class GameRoomPanelHelpers {
    static float field_c;
    static String field_f;
    static int field_a;
    static int field_b;
    static String field_e;
    static int field_g;
    static int field_d;

    public static void releaseStatics(int param0) {
        if (param0 > -56) {
          GameRoomPanelHelpers.releaseStatics(-37);
        }
        field_e = null;
        field_f = null;
    }

    final static void blendHalfRgbSpan(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = TetraLink.field_J;
        try {
          if (param2 != 0) {
            GameRoomPanelHelpers.placePopupVertically(121, -17, 103, -39);
          }
          while (true) {
            param3--;
            if (0 > param3) {
              return;
            }
            var9 = param0;
            var5 = var9;
            var6 = param4;
            var7 = param1;
            var9[var6] = var7 + (StatusRequestHelpers.bitAnd(var9[var6], 16711422) >> 1);
            param4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("mh.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void updateGameRoomPanel(boolean param0, boolean param1, int param2, boolean param3, int param4) {
        UiComponent stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        int stackIn_36_0 = 0;
        UiComponent stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        boolean stackIn_159_2 = false;
        UiComponent stackIn_163_0 = null;
        int stackIn_163_1 = 0;
        boolean stackIn_164_2 = false;
        UiComponent stackIn_168_0 = null;
        int stackIn_168_1 = 0;
        boolean stackIn_169_2 = false;
        RuntimeException decompiledCaughtException = null;
        UiComponent var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        UiComponent var6 = null;
        UiComponent var7 = null;
        UiComponent var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
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
        LobbyPlayerEntry var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var22 = null;
        String var24 = null;
        int var11_intLifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13_intLifetime1;
        int var14_intLifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17_intLifetime1;
        int var18_intLifetime1;
        int var11_intLifetime2;
        int var16Lifetime1Lifetime1;
        var18 = null;
        var19 = TetraLink.field_J;
        try {
          ResizableDialog.layoutSlidingLobbyPanels(MiscTextGlobals.field_f, (byte) 37);
          if (null != AccountWelcomePanel.field_N) {
            boolean decompiledFrameRemainder0 = true;
            SparkParticle.field_n.field_S = true;
            ReflectionCheck.field_n.field_R = 0;
            var5 = ReflectionCheck.field_n;
            var5.field_Hb = 0;
            var6 = LoadingResourceHelpers.field_c;
            LoadingResourceHelpers.field_c.field_R = 0;
            var6.field_Hb = 0;
            ServerConnectionHelpers.field_a.field_R = 0;
            var7 = ServerConnectionHelpers.field_a;
            var7.field_Hb = 0;
            if (MenuThemeHelpers.isCurrentGameOwner(63)) {
              CommonUiHelpers.field_d.field_jb = TextureEntry.field_d.toUpperCase();
              var9 = (2 + HotspotTextWidget.field_V.field_Hb) / 2;
              ReflectionCheck.field_n.setBounds((byte) -94, var9 - 2, -40 + HotspotTextWidget.field_V.field_R, 40, 0);
              if (AccountWelcomePanel.field_N.field_jc < AccountWelcomePanel.field_N.field_rc) {
                ReflectionCheck.field_n.field_jb = TransitionPhase.field_c.toUpperCase();
                ReflectionCheck.field_n.field_S = true;
              } else {
                ReflectionCheck.field_n.field_jb = MatchingTextValidator.field_s.toUpperCase();
                ReflectionCheck.field_n.field_S = false;
              }
              ReflectionCheck.field_n.field_Eb = FlaggedTextValue.field_l.field_Eb;
              if (TextureCache.field_g > 0) {
                if (TextureCache.field_g != 1) {
                  var10_ref_String = SectorCacheStore.formatTemplate(new String[]{Integer.toString(TextureCache.field_g)}, field_e, 121);
                } else {
                  var10_ref_String = SocketConnector.field_d;
                }
                if ((16 & MatchingTextValidator.field_u) == 0 &&
                  !StripedProgressBar.field_S) {
                  ReflectionCheck.field_n.field_Eb = FlaggedTextValue.field_l.field_kb;
                }
                ReflectionCheck.field_n.field_jb = ReflectionCheck.field_n.field_jb + "<br>" + var10_ref_String;
              }
              LoadingResourceHelpers.field_c.setBounds((byte) -122, -var9 + HotspotTextWidget.field_V.field_Hb, HotspotTextWidget.field_V.field_R - 40, 40, var9);
              LoadingResourceHelpers.field_c.field_jb = ProgressMessageDialog.field_pb.toUpperCase();
              var8 = LoadingResourceHelpers.field_c;
              stackIn_19_0 = LoadingResourceHelpers.field_c;
              stackIn_20_1 = (param0) && (UrlFetchTask.field_f == 0L);
              stackIn_19_0.field_S = stackIn_20_1;
              var10 = 2;
              if (null != ThreeSliceButtonPainter.field_s) {
                if (null == ArrayWidgetContainer.field_K) {
                  ArrayWidgetContainer.field_K = new byte[GameOptionControls.field_k];
                  NetworkArchiveRequest.field_G = new boolean[GameOptionControls.field_k];
                }
                for (var11_int = 0; var11_int < GameOptionControls.field_k; var11_int++) {
                  NetworkArchiveRequest.field_G[var11_int] = false;
                }
                var10 = 0;
                scanLoop1: while (true) {
                  if (var10 < 2) {
                    var11_intLifetime2 = 0;
                    var12 = 0;
                    while (true) {
                      if (ThreeSliceButtonPainter.field_s.length <= var12) {
                        if (var11_intLifetime2 != 0) {
                          break scanLoop1;
                        }
                        var10++;
                        continue scanLoop1;
                      }
                      var22 = ThreeSliceButtonPainter.field_s[var12];
                      var20 = var22;
                      var13 = var20;
                      var14_int = 0;
                      scanLoop2: while (true) {
                        if (var14_int >= var22.length) {
                          var11_intLifetime2 = 1;
                          var14_int = -1;
                          for (var15 = 0; var22.length > var15; var15 += 2) {
                            var16 = var22[var15];
                            if (var14_int < var16) {
                              var14_int = var16;
                            }
                          }
                          NetworkArchiveRequest.field_G[var14_int] = true;
                        } else {
                          var15 = var22[var14_int];
                          var16 = var13[var14_int + 1];
                          if (var15 != -1) {
                            if (var16 != (AccountWelcomePanel.field_N.field_sc[var15] & 255)) {
                              break scanLoop2;
                            }
                          } else {
                            if (var10 == 0) {
                              stackIn_36_0 = AccountWelcomePanel.field_N.field_rc;
                            } else {
                              stackIn_36_0 = AccountWelcomePanel.field_N.field_jc;
                            }
                            var17_int = stackIn_36_0;
                            if (var16 != var17_int) {
                              break scanLoop2;
                            }
                          }
                          var14_int += 2;
                          continue;
                        }
                        break;
                      }
                      var12++;
                    }
                  }
                  break;
                }
                if (!(2 > SettingsCookieHelpers.field_c) &&
                  ErrorPrintHelpers.field_a[12]) {
                  var10 = 2;
                }
              }
              if (2 <= var10) {
                if ((MessageDialogContent.field_S != null ||
                  ClientProtocolStage.field_g != null ||
                  PendingMove.field_e != null ||
                  null != LobbyResourceHelpers.field_f)) {
                  var11_intLifetime1 = 0;
                  var12Lifetime1 = 0;
                  var13_int = 0;
                  var14_intLifetime1 = 0;
                  var15Lifetime1 = 0;
                  for (var16Lifetime1 = 0; GameOptionControls.field_k > var16Lifetime1; var16Lifetime1++) {
                    var17_intLifetime1 = AccountWelcomePanel.field_N.field_sc[var16Lifetime1] & 255;
                    if (null != MessageDialogContent.field_S &&
                      null != MessageDialogContent.field_S[var16Lifetime1] &&
                      MessageDialogContent.field_S[var16Lifetime1][var17_intLifetime1]) {
                      var11_intLifetime1 = 1;
                    }
                    if (ClientProtocolStage.field_g != null &&
                      null != ClientProtocolStage.field_g[var16Lifetime1]) {
                      var18_int = ClientProtocolStage.field_g[var16Lifetime1][var17_intLifetime1];
                      if (var18_int != 0 &&
                        !HighscoreQuery.field_r) {
                        var11_intLifetime1 = 1;
                      }
                      if (var18_int > var13_int) {
                        var13_int = var18_int;
                      }
                    }
                    regionExit3: {
                      if (null != PendingMove.field_e) {
                        if (PendingMove.field_e[var16Lifetime1] == null) {
                          if (((null != LobbyResourceHelpers.field_f)) &&
                            ((null != LobbyResourceHelpers.field_f[var16Lifetime1]))) {
                            var15Lifetime1 = var15Lifetime1 | LobbyResourceHelpers.field_f[var16Lifetime1][var17_intLifetime1];
                          }
                          break regionExit3;
                        }
                        var18_intLifetime1 = PendingMove.field_e[var16Lifetime1][var17_intLifetime1];
                        if (var18_intLifetime1 != 0 &&
                          !HighscoreQuery.field_r) {
                          var11_intLifetime1 = 1;
                        }
                        if (var18_intLifetime1 > var14_intLifetime1) {
                          var14_intLifetime1 = var18_intLifetime1;
                        }
                      }
                      if (null != LobbyResourceHelpers.field_f &&
                        null != LobbyResourceHelpers.field_f[var16Lifetime1]) {
                        var15Lifetime1 = var15Lifetime1 | LobbyResourceHelpers.field_f[var16Lifetime1][var17_intLifetime1];
                      }
                    }
                  }
                  var16Lifetime1Lifetime1 = 0;
                  var17 = QueuedListRequest.field_x.field_Pb.field_fb;
                  var18_ref = (LobbyPlayerEntry) (var17.first(false));
                  while (var18_ref != null) {
                    if (var18_ref.isUnindexed((byte) -1)) {
                      var18_ref = (LobbyPlayerEntry) (var17.next((byte) -70));
                      continue;
                    }
                    if (var11_intLifetime1 != 0 &&
                      !var18_ref.field_Tb) {
                      var16Lifetime1Lifetime1 = 1;
                    } else {
                      if (var18_ref.field_Pb < var13_int) {
                        var16Lifetime1Lifetime1 = 1;
                      } else {
                        if (var14_intLifetime1 <= var18_ref.field_Qb) {
                          if ((~var18_ref.field_Ub & var15Lifetime1) > 0) {
                            var16Lifetime1Lifetime1 = 1;
                          } else {
                            if (var12Lifetime1 == 0) {
                              var18_ref = (LobbyPlayerEntry) (var17.next((byte) -70));
                              continue;
                            }
                            var16Lifetime1Lifetime1 = 1;
                          }
                        } else {
                          var16Lifetime1Lifetime1 = 1;
                        }
                      }
                    }
                    break;
                  }
                  if (2 <= SettingsCookieHelpers.field_c &&
                    ErrorPrintHelpers.field_a[12]) {
                    var16Lifetime1Lifetime1 = 0;
                  }
                  if ((var16Lifetime1Lifetime1 != 0)) {
                    LoadingResourceHelpers.field_c.field_S = false;
                    if (!(!LoadingResourceHelpers.field_c.field_rb)) {
                      if (CachedTextLayout.field_e.field_g.field_Lb != 0) {
                        CheckboxWidget.field_P = SectorCacheStore.formatTemplate(new String[]{KeyHandlerHelpers.field_e}, ClientException.field_b, 119);
                      } else {
                        CheckboxWidget.field_P = JoinStatusTextHelpers.field_b;
                      }
                    }
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                LoadingResourceHelpers.field_c.field_S = false;
                if (LoadingResourceHelpers.field_c.field_rb) {
                  var11 = null;
                  var12Lifetime2 = 0;
                  for (var13_intLifetime1 = 0; GameOptionControls.field_k > var13_intLifetime1; var13_intLifetime1++) {
                    if (NetworkArchiveRequest.field_G[var13_intLifetime1]) {
                      var24 = "<col=A00000>" + ArchiveRequest.field_y[var13_intLifetime1] + "</col>";
                      if (var11 != null) {
                        var12Lifetime2 = 1;
                        var11 = (String) (var11) + ", " + var24;
                      } else {
                        var11 = var24;
                      }
                    }
                  }
                  if (0 == var10) {
                    var13_ref = ChatLayoutHelpers.field_b;
                    if (var12Lifetime2 != 0) {
                      var14 = LoginCredentials.field_d + (String) (var11);
                    } else {
                      var14 = SectorCacheStore.formatTemplate(new String[]{(String) (var11)}, ConditionalTextValue.field_f, 119);
                    }
                  } else {
                    var13_ref = DualLinkNode.field_q;
                    if (var12Lifetime2 != 0) {
                      var14 = HighscoreSubmission.field_p + (String) (var11);
                    } else {
                      var14 = SectorCacheStore.formatTemplate(new String[]{(String) (var11)}, IntrusiveNode.field_d, 127);
                    }
                  }
                  CheckboxWidget.field_P = "<col=A00000>" + var13_ref + "<br>" + var14;
                }
              }
            } else {
              var9_ref_String = AccountWelcomePanel.field_N.field_ec;
              CommonUiHelpers.field_d.field_jb = SectorCacheStore.formatTemplate(new String[]{var9_ref_String}, GameKeyHandler.field_e, 127).toUpperCase();
              ServerConnectionHelpers.field_a.setBounds((byte) -110, HotspotTextWidget.field_V.field_Hb, HotspotTextWidget.field_V.field_R - 40, 40, 0);
              ServerConnectionHelpers.field_a.field_jb = SectorCacheStore.formatTemplate(new String[]{var9_ref_String}, ReportAbuseDialog.field_Xb, 123);
              var8 = ServerConnectionHelpers.field_a;
            }
            if (UrlFetchTask.field_f != 0L) {
              var9 = (int)(-ClockAndTextHelpers.monotonicMillis(0) + UrlFetchTask.field_f);
              var9 = (999 + var9) / 1000;
              if (1 > var9) {
                var9 = 1;
              }
              var8.field_jb = SectorCacheStore.formatTemplate(new String[]{Integer.toString(var9)}, AccountCreationResultHelpers.field_a, 121);
            }
            IndexedSpriteHelpers.field_d.field_jb = SectorCacheStore.formatTemplate(new String[]{Integer.toString(AccountWelcomePanel.field_N.field_jc), Integer.toString(AccountWelcomePanel.field_N.field_rc)}, StatusRequestHelpers.field_c, 126);
          }
          stackIn_158_0 = LoginPanel.field_P;
          stackIn_158_1 = 0;
          stackIn_159_2 = (param3) && (!param1) && (!StripedProgressBar.field_S);
          ((UiComponent) (Object) stackIn_158_0).updateInput(stackIn_158_1, stackIn_159_2);
          var5_int = -59 % ((13 - param4) / 49);
          stackIn_163_0 = HotspotTextWidget.field_V;
          stackIn_163_1 = 0;
          stackIn_164_2 = (param3) && (!param1) && (!StripedProgressBar.field_S);
          ((UiComponent) (Object) stackIn_163_0).updateInput(stackIn_163_1, stackIn_164_2);
          stackIn_168_0 = ChatMessage.field_b;
          stackIn_168_1 = 0;
          stackIn_169_2 = (param3) && (!param1) && (StripedProgressBar.field_S);
          ((UiComponent) (Object) stackIn_168_0).updateInput(stackIn_168_1, stackIn_169_2);
          CachedTextLayout.field_e.field_g.processTabPresses(true);
          if (AccountWelcomePanel.field_N != null) {
            if (SparkParticle.field_n.field_F != 0) {
              MidiPcmStream.sendWithdrawJoinRequest(AccountWelcomePanel.field_N.getGameId(-56), -125, param2);
            }
            if (ReflectionCheck.field_n.field_F != 0) {
              StripedProgressBar.field_S = true;
            }
            if (0 != LoadingResourceHelpers.field_c.field_F) {
              LoginProgressHelpers.field_b = true;
            }
            if (0 != GraphicsSettings.field_b.field_F) {
              StripedProgressBar.field_S = false;
            }
            GameOptionControls.updateGameOptionControls(param2, AccountWelcomePanel.field_N, 30544, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var5_ref), "mh.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void writeMachineId(int param0, PacketBuffer param1) {
        try {
          int var4 = 0;
          RuntimeException runtimeException = null;
          byte[] var2 = null;
          int var3 = 0;
          Exception var3_ref_Exception = null;
          int var5 = 0;
          byte[] var6 = null;
          byte[] var7 = null;
          byte[] var8 = null;
          byte[] var9 = null;
          byte[] var10 = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          var5 = TetraLink.field_J;
          try {
            var9 = new byte[24];
            var7 = var9;
            var6 = var7;
            var10 = var6;
            var8 = var10;
            var2 = var8;
            if (SectorCacheStore.field_f != null) {
              try {
                SectorCacheStore.field_f.seek(0L, 0);
                SectorCacheStore.field_f.readFully(var9, (byte) 66);
                for (var3 = 0; var3 < 24; var3++) {
                  if (var10[var3] == 0) {
                    continue;
                  }
                  break;
                }
                if (var3 >= 24) {
                  throw new IOException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
              }
            }
            var3 = -39 % ((42 - param0) / 51);
            param1.writeBytes(0, 128, var10, 24);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = runtimeException;
            stackIn_17_1 = new StringBuilder().append("mh.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int placePopupVertically(int param0, int param1, int param2, int param3) {
        if (param1 + param0 + param2 <= SoftwareRasterizer.field_e) {
          return param0 + param1;
        }
        if (param3 != -8748) {
          field_b = 48;
        }
        if (-param2 + param1 >= 0) {
          return param1 - param2;
        }
        return SoftwareRasterizer.field_e - param2;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_e = "(<%0> players want to join)";
        field_b = 0;
        field_a = 9;
        field_g = -1;
        field_f = "Cancel draw";
    }
}
