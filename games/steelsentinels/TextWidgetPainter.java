/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextWidgetPainter implements WidgetPainter, WidgetTextLayout {
    int field_a;
    static boolean field_l;
    int field_h;
    int field_d;
    BitmapFont field_f;
    int field_m;
    private int field_g;
    private boolean field_i;
    int field_b;
    int field_k;
    int field_n;
    int field_j;
    int field_e;
    int field_c;

    public void drawWidget(int param0, UiComponent param1, byte param2, boolean param3, int param4) {
        if (param2 != -30) {
          return;
        }
        if (this.field_f == null) {
          return;
        }
        try {
          this.drawText(param4, param0, param1, 118);
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "cn.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int contentHeight(int param0, UiComponent param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -3) {
            this.field_f = (BitmapFont) null;
          }
          stackIn_3_0 = -this.field_h + param1.field_E - this.field_d;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cn.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void updateGameRoomPanel(int param0, boolean param1, boolean param2, boolean param3, int param4) {
        SceneWidget stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_67_0 = 0;
        boolean stackIn_76_0 = false;
        int stackIn_83_0 = 0;
        boolean stackIn_125_0 = false;
        int stackIn_141_0 = 0;
        SceneWidget stackIn_164_0 = null;
        int stackIn_164_1 = 0;
        boolean stackIn_165_2 = false;
        SceneWidget stackIn_169_0 = null;
        int stackIn_169_1 = 0;
        boolean stackIn_170_2 = false;
        SceneWidget stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        boolean stackIn_177_2 = false;
        Object stackIn_178_0 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_75_0;
        boolean stackOut_124_0;
        RuntimeException var5 = null;
        SceneWidget var6 = null;
        SceneWidget var7 = null;
        SceneWidget var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        Object var11_ref = null;
        int var12 = 0;
        int[] var13_ref_int__ = null;
        int var13 = 0;
        String var13_ref_String = null;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        NodeDeque var17 = null;
        Object var18 = null;
        int var18_int = 0;
        LobbyPlayer var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        SceneWidget var22 = null;
        int[] var23 = null;
        String var24 = null;
        int[] var25 = null;
        SceneWidget var26 = null;
        int stackIn_53_0Lifetime1;
        int stackIn_53_1Lifetime1;
        int stackIn_61_0Lifetime1;
        int var13Lifetime1;
        int var18_intLifetime1;
        var18 = null;
        var19 = SteelSentinels.obfuscationControl;
        try {
          boolean decompiledFrameCompleted0 = true;
          GzipDecoder.layoutSlidingSidePanels(48, PasswordRuleHelpers.field_f);
          if (null != LoginEncryptionHelpers.field_b) {
            boolean decompiledFrameRemainder2 = true;
            QuickChatCategory.field_E.field_T = true;
            var22 = PendingAckRequest.field_C;
            var26 = var22;
            PendingAckRequest.field_C.field_Lb = 0;
            var26.field_zb = 0;
            BoundedUrlRequest.field_q.field_Lb = 0;
            var6 = BoundedUrlRequest.field_q;
            var6.field_zb = 0;
            var7 = PendingDataRequest.field_w;
            PendingDataRequest.field_w.field_Lb = 0;
            var7.field_zb = 0;
            if (!TextAndMenuHelpers.isGameOwner(-28548)) {
              var9_ref_String = LoginEncryptionHelpers.field_b.field_Xb;
              EmailAvailabilityValidator.field_q.field_S = SocketConnector.formatTemplate(AccountChoicePanel.field_ab, -40, new String[]{var9_ref_String}).toUpperCase();
              PendingDataRequest.field_w.setBounds(0, NanoTickClock.field_y.field_Lb - 40, 40, 0, NanoTickClock.field_y.field_zb);
              PendingDataRequest.field_w.field_S = SocketConnector.formatTemplate(MeshMaterial.field_f, -108, new String[]{var9_ref_String});
              var8 = PendingDataRequest.field_w;
              decompiledFrameRemainder2 = (var19 != 0);
            }
            if (decompiledFrameRemainder2) {
              EmailAvailabilityValidator.field_q.field_S = MouseWheelInput.field_f.toUpperCase();
              var9 = (2 + NanoTickClock.field_y.field_zb) / 2;
              PendingAckRequest.field_C.setBounds(0, NanoTickClock.field_y.field_Lb - 40, 40, 0, -2 + var9);
              if (LoginEncryptionHelpers.field_b.field_wc < LoginEncryptionHelpers.field_b.field_Ub) {
                PendingAckRequest.field_C.field_S = RasterBuffer.field_j.toUpperCase();
                PendingAckRequest.field_C.field_T = true;
                if (var19 != 0) {
                  PendingAckRequest.field_C.field_S = TriangleMesh.field_U.toUpperCase();
                  PendingAckRequest.field_C.field_T = false;
                }
              } else {
                PendingAckRequest.field_C.field_S = TriangleMesh.field_U.toUpperCase();
                PendingAckRequest.field_C.field_T = false;
              }
              PendingAckRequest.field_C.field_I = MenuInputState.field_j.field_I;
              if (IconLookupHelpers.field_a > 0) {
                if (1 != IconLookupHelpers.field_a) {
                  var10_ref_String = SocketConnector.formatTemplate(MusicCrossfadeStream.field_B, param0 - 83, new String[]{Integer.toString(IconLookupHelpers.field_a)});
                  if (var19 != 0) {
                    var10_ref_String = EmailSyntaxValidator.field_o;
                  }
                } else {
                  var10_ref_String = EmailSyntaxValidator.field_o;
                }
                PendingAckRequest.field_C.field_S = PendingAckRequest.field_C.field_S + "<br>" + var10_ref_String;
                if ((16 & Js5NetworkRequest.field_H) == 0 &&
                  !GzipDecoder.field_c) {
                  PendingAckRequest.field_C.field_I = MenuInputState.field_j.field_Ab;
                }
              }
              BoundedUrlRequest.field_q.setBounds(0, -40 + NanoTickClock.field_y.field_Lb, 40, var9, -var9 + NanoTickClock.field_y.field_zb);
              BoundedUrlRequest.field_q.field_S = IntKeyLookup.field_b.toUpperCase();
              stackIn_19_0 = BoundedUrlRequest.field_q;
              stackIn_20_1 = (param3) && (ModalStack.field_R == 0L);
              stackIn_19_0.field_T = stackIn_20_1;
              var8 = BoundedUrlRequest.field_q;
              var10 = 2;
              if (null != HuffmanDecoder.field_b) {
                if (null == UiContainer.field_O) {
                  UiContainer.field_O = new byte[UrlAndReplyHelpers.field_a];
                  HuffmanDecoder.field_h = new boolean[UrlAndReplyHelpers.field_a];
                }
                var11 = 0;
                do {
                  if (!(UrlAndReplyHelpers.field_a > var11)) {
                    var10 = 0;
                    break;
                  }
                  HuffmanDecoder.field_h[var11] = false;
                  var11++;
                } while (var19 == 0);
                scanLoop1: while (true) {
                  if (var10 < 2) {
                    var11 = 0;
                    stackIn_67_0 = 0;
                    if (var19 != 0) {
                      break scanLoop1;
                    }
                    var12 = stackIn_67_0;
                    while (true) {
                      stackIn_34_0 = ~var12;
                      stackIn_34_1 = ~HuffmanDecoder.field_b.length;
                      if (stackIn_34_0 > stackIn_34_1) {
                        var25 = HuffmanDecoder.field_b[var12];
                        var23 = var25;
                        var20 = var23;
                        var13_ref_int__ = var20;
                        stackIn_61_0 = 0;
                        var14 = stackIn_61_0;
                        scanLoop2: while (true) {
                          if (var14 < var25.length) {
                            var15 = var25[var14];
                            var16 = var20[var14 + 1];
                            stackIn_53_0 = var15;
                            stackIn_53_1 = -1;
                            if (stackIn_53_0 == stackIn_53_1) {
                              if (0 != var10) {
                                stackIn_43_0 = LoginEncryptionHelpers.field_b.field_wc;
                              } else {
                                stackIn_43_0 = LoginEncryptionHelpers.field_b.field_Ub;
                              }
                              var17_int = stackIn_43_0;
                              if (var16 != var17_int) {
                                break scanLoop2;
                              }
                            } else {
                              if (~var16 != ~(255 & LoginEncryptionHelpers.field_b.field_Sb[var15]) &&
                                var19 == 0) {
                                break scanLoop2;
                              }
                            }
                            var14 += 2;
                            continue;
                          }
                          var11 = 1;
                          var14 = -1;
                          var15 = 0;
                          while (true) {
                            stackIn_53_0Lifetime1 = ~var15;
                            stackIn_53_1Lifetime1 = ~var25.length;
                            if (stackIn_53_0Lifetime1 <= stackIn_53_1Lifetime1) {
                              break;
                            }
                            var16 = var25[var15];
                            stackIn_34_0 = ~var16;
                            stackIn_34_1 = ~var14;
                            if (stackIn_34_0 < stackIn_34_1) {
                              var14 = var16;
                            }
                            var15 += 2;
                          }
                          HuffmanDecoder.field_h[var14] = true;
                          break;
                        }
                        var12++;
                        continue;
                      }
                      break;
                    }
                    stackIn_61_0Lifetime1 = var11;
                    if (stackIn_61_0Lifetime1 == 0 ||
                      var19 != 0) {
                      var10++;
                      continue;
                    }
                  }
                  stackIn_67_0 = ~NodeDeque.field_d;
                  break;
                }
                if (stackIn_67_0 <= -3 &&
                  SoundAndUrlHelpers.field_e[12]) {
                  var10 = 2;
                }
              }
              if (var10 < 2) {
                BoundedUrlRequest.field_q.field_T = false;
                decompiledFrameRemainder2 = !(!BoundedUrlRequest.field_q.field_K);
                if (decompiledFrameRemainder2) {
                  var11_ref = null;
                  var12 = 0;
                  var13 = 0;
                  while (true) {
                    if (var13 < UrlAndReplyHelpers.field_a) {
                      stackOut_75_0 = HuffmanDecoder.field_h[var13];
                      stackIn_83_0 = stackOut_75_0 ? 1 : 0;
                      stackIn_76_0 = stackOut_75_0;
                      if (var19 == 0) {
                        if (stackIn_76_0) {
                          var24 = "<col=A00000>" + TickClock.field_a[var13] + "</col>";
                          if (var11_ref != null) {
                            var11_ref = (String) (var11_ref) + ", " + var24;
                            var12 = 1;
                          } else {
                            var11_ref = var24;
                          }
                        }
                        var13++;
                        continue;
                      }
                    } else {
                      stackIn_83_0 = -1;
                    }
                    break;
                  }
                  if (stackIn_83_0 == ~var10) {
                    var13_ref_String = EditableTextWidget.field_gb;
                    boolean decompiledSharedTail1 = (var12 == 0);
                    if (!decompiledSharedTail1) {
                      var14_ref_String = NameAvailabilityValidator.field_v + (String) (var11_ref);
                      decompiledSharedTail1 = (var19 != 0);
                    }
                    if (decompiledSharedTail1) {
                      var14_ref_String = SocketConnector.formatTemplate(TextLayoutLine.field_b, -61, new String[]{(String) (var11_ref)});
                    }
                  } else {
                    var13_ref_String = ChatPanelHelpers.field_a;
                    boolean decompiledSharedTail0 = (var12 == 0);
                    if (!decompiledSharedTail0) {
                      var14_ref_String = PlayingSound.field_r + (String) (var11_ref);
                      decompiledSharedTail0 = (var19 != 0);
                    }
                    if (decompiledSharedTail0) {
                      var14_ref_String = SocketConnector.formatTemplate(FrameStyleHelpers.field_f, -113, new String[]{(String) (var11_ref)});
                    }
                  }
                  UiTheme.field_i = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                }
              }
              if ((decompiledFrameRemainder2) && (!(var10 < 2) || var19 != 0) && (null != LoadoutHelpers.field_d ||
                IconLookupHelpers.field_b != null ||
                null != QuickChatHelpDialog.field_cc ||
                null != SoundAndUrlHelpers.field_b)) {
                var11 = 0;
                var12 = 0;
                var13Lifetime1 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                while (UrlAndReplyHelpers.field_a > var16) {
                  var17_int = 255 & LoginEncryptionHelpers.field_b.field_Sb[var16];
                  stackIn_178_0 = null;
                  if (var19 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_178_0 != LoadoutHelpers.field_d &&
                    null != LoadoutHelpers.field_d[var16] &&
                    LoadoutHelpers.field_d[var16][var17_int]) {
                    var11 = 1;
                  }
                  if (IconLookupHelpers.field_b != null &&
                    null != IconLookupHelpers.field_b[var16]) {
                    var18_int = IconLookupHelpers.field_b[var16][var17_int];
                    if (var18_int != 0 &&
                      !ProxyAuthenticationException.field_a) {
                      var11 = 1;
                    }
                    if (var13Lifetime1 < var18_int) {
                      var13Lifetime1 = var18_int;
                    }
                  }
                  if (null != QuickChatHelpDialog.field_cc &&
                    null != QuickChatHelpDialog.field_cc[var16]) {
                    var18_intLifetime1 = QuickChatHelpDialog.field_cc[var16][var17_int];
                    if (0 != var18_intLifetime1 &&
                      !ProxyAuthenticationException.field_a) {
                      var11 = 1;
                    }
                    if (var14 < var18_intLifetime1) {
                      var14 = var18_intLifetime1;
                    }
                  }
                  if (SoundAndUrlHelpers.field_b != null &&
                    SoundAndUrlHelpers.field_b[var16] != null) {
                    var15 = var15 | SoundAndUrlHelpers.field_b[var16][var17_int];
                  }
                  var16++;
                }
                if (decompiledFrameCompleted0) {
                  var16 = 0;
                  var17 = NanoTickClock.field_t.field_Ub.field_M;
                  var18_ref = (LobbyPlayer) (var17.first(13058));
                  while (true) {
                    boolean decompiledFrameRemainder0 = true;
                    boolean decompiledFrameRemainder1 = true;
                    if (var18_ref != null) {
                      stackOut_124_0 = var18_ref.isUnlisted((byte) -36);
                      stackIn_141_0 = stackOut_124_0 ? 1 : 0;
                      stackIn_125_0 = stackOut_124_0;
                      decompiledFrameRemainder0 = (var19 == 0);
                      if (decompiledFrameRemainder0) {
                        if (!stackIn_125_0) {
                          if (var11 != 0 &&
                            !var18_ref.field_nc) {
                            var16 = 1;
                            decompiledFrameRemainder1 = false;
                          }
                          else {
                            if (var13Lifetime1 > var18_ref.field_ac) {
                              var16 = 1;
                              decompiledFrameRemainder1 = false;
                            }
                            else {
                              if (var18_ref.field_dc < var14) {
                                var16 = 1;
                                decompiledFrameRemainder1 = false;
                              }
                              else {
                                if ((var15 & ~var18_ref.field_qc) > 0) {
                                  var16 = 1;
                                  decompiledFrameRemainder1 = false;
                                }
                                else {
                                  if (var12 != 0) {
                                    var16 = 1;
                                    decompiledFrameRemainder1 = false;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (decompiledFrameRemainder1) {
                          var18_ref = (LobbyPlayer) (var17.next((byte) -12));
                          continue;
                        }
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      stackIn_141_0 = 2;
                    }
                    if (stackIn_141_0 <= NodeDeque.field_d &&
                      SoundAndUrlHelpers.field_e[12]) {
                      var16 = 0;
                    }
                    if (var16 == 0) {
                      break;
                    }
                    BoundedUrlRequest.field_q.field_T = false;
                    if (!BoundedUrlRequest.field_q.field_K) {
                      break;
                    }
                    if (RegistrationRequestDialog.field_Tb.field_d.field_bc == 0) {
                      UiTheme.field_i = TutorialStep.field_f;
                      if (var19 == 0) {
                        break;
                      }
                    }
                    UiTheme.field_i = SocketConnector.formatTemplate(HighscoreTable.field_r, -74, new String[]{StripedProgressBar.field_P});
                    break;
                  }
                }
              }
            }
            if (decompiledFrameCompleted0) {
              if (ModalStack.field_R != 0L) {
                var9 = (int)(-ClockAndCookieHelpers.monotonicMillis(param0 - 86) + ModalStack.field_R);
                var9 = (var9 + 999) / 1000;
                if (var9 < 1) {
                  var9 = 1;
                }
                var8.field_S = SocketConnector.formatTemplate(ArrayWidgetContainer.field_P, -68, new String[]{Integer.toString(var9)});
              }
              ReflectionCheckHelpers.field_e.field_S = SocketConnector.formatTemplate(ClientErrorSupport.field_h, -32, new String[]{Integer.toString(LoginEncryptionHelpers.field_b.field_wc), Integer.toString(LoginEncryptionHelpers.field_b.field_Ub)});
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_164_0 = SocialListPanel.field_ec;
            stackIn_164_1 = -99;
            stackIn_165_2 = (param1) && (!param2) && (!GzipDecoder.field_c);
            ((SceneWidget) (Object) stackIn_164_0).updateInputFullScreen((byte) stackIn_164_1, stackIn_165_2);
            stackIn_169_0 = NanoTickClock.field_y;
            stackIn_169_1 = -88;
            stackIn_170_2 = (param1) && (!param2) && (!GzipDecoder.field_c);
            ((SceneWidget) (Object) stackIn_169_0).updateInputFullScreen((byte) stackIn_169_1, stackIn_170_2);
            if (param0 != 0) {
              TextWidgetPainter.updateGameRoomPanel(126, false, true, true, 60);
            }
            stackIn_176_0 = UsernameCredentials.field_r;
            stackIn_176_1 = -5;
            stackIn_177_2 = (param1) && (!param2) && (GzipDecoder.field_c);
            ((SceneWidget) (Object) stackIn_176_0).updateInputFullScreen((byte) stackIn_176_1, stackIn_177_2);
            RegistrationRequestDialog.field_Tb.field_d.processTabPresses(param0 + 10000);
            stackIn_178_0 = null;
          }
          if (stackIn_178_0 != LoginEncryptionHelpers.field_b) {
            if (QuickChatCategory.field_E.field_Eb != 0) {
              ChatMessage.sendShortSetting((byte) -119, param4, LoginEncryptionHelpers.field_b.getGameId(param0 ^ -33));
            }
            if (PendingAckRequest.field_C.field_Eb != 0) {
              GzipDecoder.field_c = true;
            }
            if (BoundedUrlRequest.field_q.field_Eb != 0) {
              ParticleEffect.field_J = true;
            }
            if (Js5ArchiveManager.field_i.field_Eb != 0) {
              GzipDecoder.field_c = false;
            }
            DiskCacheWorker.updateGameOptionsPanel(LoginEncryptionHelpers.field_b, (byte) -115, param4, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var5), "cn.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int textYForOffset(int param0, int param1, int param2, UiComponent param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            this.layoutSingleLine((UiComponent) null, (byte) 118);
          }
          stackIn_3_0 = param3.field_F + this.field_h + param1 - (-param3.field_z - param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("cn.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    String getDisplayText(int param0, UiComponent param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            this.preferredHeight((byte) 115, (UiComponent) null);
          }
          stackIn_3_0 = param1.field_y;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cn.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean handleFrontEndKey(int param0, int param1, int param2, boolean param3) {
        if (param3) {
          return true;
        }
        if (RankingAndRasterHelpers.field_e != null &&
          NameAvailabilityValidator.field_q == 13) {
          RankingAndRasterHelpers.field_e = null;
          return true;
        }
        if (!MusicTrackHelpers.field_g) {
          if (GzipDecoder.field_e ||
            NameAvailabilityValidator.field_q == 9 ||
            10 == NameAvailabilityValidator.field_q ||
            NameAvailabilityValidator.field_q == 11) {
            return QuickChatInputHelpers.handleQuickChatKey(123, param0, param1);
          }
          if (NameAvailabilityValidator.field_q == 80 &&
            ArchiveProvider.isAccountUnrestricted(38)) {
            MusicTrackHelpers.field_g = true;
            return true;
          }
          return false;
        }
        if (!ArchiveProvider.isAccountUnrestricted(38)) {
          return false;
        }
        int var4 = RasterBuffer.handleChatInputKey((byte) -125, param2, param0) ? 1 : 0;
        if (NameAvailabilityValidator.field_q == 80 ||
          84 == NameAvailabilityValidator.field_q) {
          var4 = 1;
          MusicTrackHelpers.field_g = false;
        }
        if (NameAvailabilityValidator.field_q == 13) {
          AlternateUsernameCredentials.clearChatText(88);
          MusicTrackHelpers.field_g = false;
          var4 = 1;
        }
        return var4 != 0;
    }

    public final int characterIndexAtPosition(int param0, int param1, UiComponent param2, byte param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.ensureTextLayout(-1, param2);
          if (param3 != 115) {
            this.field_h = -14;
          }
          stackIn_3_0 = param2.field_s.characterIndexAt(0, -this.textOriginX(param0, 3, param2) + param1, param5 - this.textOriginY((byte) -123, param2, param4));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("cn.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final int textOriginY(byte param0, UiComponent param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -113) {
            this.textOriginY((byte) 8, (UiComponent) null, 100);
          }
          stackIn_3_0 = this.textYForOffset(0, param2, 0, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("cn.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public final int lineHeight(int param0) {
        int var2 = 26 / ((70 - param0) / 37);
        return this.field_f.field_G + this.field_f.field_F;
    }

    private final void layoutSingleLine(UiComponent param0, byte param1) {
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var6Lifetime1;
        var7 = SteelSentinels.obfuscationControl;
        try {
          if (null == param0.field_s) {
            param0.field_s = (TextLayout) ((Object) new CachedTextLayout());
          }
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          var3_int = this.contentWidth(5546, param0);
          var4 = this.contentHeight(-3, param0);
          var6 = this.field_j;
          if ((var6 != 0) &&
            (decompiledFrameRemainder2 = (var6 != 2 ||
            var7 != 0)) &&
            (decompiledFrameRemainder3 = (var6 != 3)) &&
            (decompiledFrameRemainder3 = (var6 == 1))) {
            decompiledFrameRemainder3 = (var7 != 0);
          }
          if ((decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            var5 = this.field_f.field_G;
            decompiledFrameRemainder4 = (var7 != 0);
          }
          if ((decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            var5 = var4 - this.field_f.field_F;
            decompiledFrameRemainder4 = (var7 != 0);
          }
          if (decompiledFrameRemainder4) {
            var5 = this.field_f.field_G + (-this.field_f.field_F + (-this.field_f.field_G + var4) >> 1);
          }
          if (param1 <= 60) {
            this.textOriginX(-108, 13, (UiComponent) null);
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var6Lifetime1 = this.field_a;
          if ((0 != var6Lifetime1 &&
            var6Lifetime1 != 3) &&
            (decompiledFrameRemainder0 = (var6Lifetime1 != 1))) {
            if (var6Lifetime1 != 2) {
              return;
            }
            decompiledFrameRemainder1 = (var7 != 0);
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            if (!(param0.field_s instanceof CachedTextLayout)) {
              return;
            }
            ((CachedTextLayout) (param0.field_s)).layoutLeftAlignedLine(0, this.getDisplayText(-1, param0), 97, var5, this.field_f);
            if (var7 == 0) {
              return;
            }
          }
          if (decompiledFrameRemainder1) {
            if (!(param0.field_s instanceof CachedTextLayout)) {
              return;
            }
            ((CachedTextLayout) (param0.field_s)).layoutCenteredLine(var3_int >> 1, this.getDisplayText(-1, param0), var5, -1385548511, this.field_f);
            if (var7 == 0) {
              return;
            }
          }
          if (!(param0.field_s instanceof CachedTextLayout)) {
            return;
          }
          ((CachedTextLayout) (param0.field_s)).layoutRightAlignedLine(this.getDisplayText(-1, param0), true, var3_int, var5, this.field_f);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("cn.T(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(')').toString());
        }
    }

    TextWidgetPainter(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final int textXForOffset(byte param0, UiComponent param1, int param2, int param3) {
        int discarded$1 = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 114) {
            discarded$1 = this.textYForOffset(37, 62, 35, (UiComponent) null);
          }
          stackIn_3_0 = param2 + this.field_b + (param1.field_o + param3 + param1.field_u);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("cn.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static String normalizeName(byte param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = LoginActionHelpers.decodeBase37DisplayName(SentinelDesigner.encodeBase37Name(-87, param1), (byte) -114);
          if (param0 < 89) {
            field_l = false;
          }
          if (var2 == null) {
            var2 = "";
          }
          stackIn_5_0 = var2;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("cn.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void paintTextRun(int param0, int param1, int param2, int param3, int param4, int param5, UiComponent param6, int param7) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = SteelSentinels.obfuscationControl;
        try {
          ArchiveRequest.pushClip(param0 + param6.field_o, param2 + param6.field_z, 47, param6.field_x + (param6.field_o + param0), param6.field_E + param6.field_z + param2);
          var9_int = this.contentWidth(5546, param6);
          var10 = this.contentHeight(-3, param6);
          boolean decompiledSharedTail0 = (this.field_i);
          if (!decompiledSharedTail0) {
            boolean decompiledFrameRemainder2 = true;
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameRemainder0 = true;
            var12 = this.field_j;
            if ((var12 != 0) &&
              (decompiledFrameRemainder0 = (var12 != 2)) &&
              (decompiledFrameRemainder1 = (3 != var12 ||
              var13 != 0)) &&
              (decompiledFrameRemainder1 = (var12 == 1))) {
              decompiledFrameRemainder1 = (var13 != 0);
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              var11 = this.field_f.field_G;
              decompiledFrameRemainder2 = (var13 != 0);
            }
            if ((decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1)) {
              var11 = var10 - this.field_f.field_F;
              decompiledFrameRemainder2 = (var13 != 0);
            }
            if (decompiledFrameRemainder2) {
              var11 = (-this.field_f.field_F - this.field_f.field_G + var10 >> 1) + this.field_f.field_G;
            }
            regionExit1: {
              regionExit2: {
                regionExit3: {
                  var12 = this.field_a;
                  if (0 != var12 ||
                    var13 != 0) {
                    switch (var12) {
                      case 1:
                        break regionExit3;
                      default:
                        break regionExit1;
                      case 2:
                        if (var13 == 0) {
                          break regionExit2;
                        }
                        break;
                      case 3:
                        break;
                    }
                  }
                  this.field_f.drawLeft(this.getDisplayText(param1 + 11866, param6), this.textXForOffset((byte) 114, param6, param5, param0), var11 + this.textYForOffset(param3, param2, 0, param6), param7, param4);
                  if (var13 == 0) {
                    break regionExit1;
                  }
                }
                this.field_f.drawCentered(this.getDisplayText(-1, param6), (var9_int >> 1) + this.textXForOffset((byte) 114, param6, param5, param0), this.textYForOffset(param3, param2, 0, param6) + var11, param7, param4);
                if (var13 == 0) {
                  break regionExit1;
                }
              }
              this.field_f.drawRight(this.getDisplayText(param1 ^ 11866, param6), this.textXForOffset((byte) 114, param6, param5, param0) + var9_int, this.textYForOffset(param3, param2, 0, param6) + var11, param7, param4);
            }
            decompiledSharedTail0 = (var13 != 0);
          }
          if (decompiledSharedTail0) {
            this.field_f.drawParagraph(this.getDisplayText(-1, param6), this.textXForOffset((byte) 114, param6, param5, param0), this.textYForOffset(param3, param2, 0, param6), var9_int, var10, param7, param4, this.field_a, this.field_j, this.field_m);
          }
          if (param1 != -11867) {
            return;
          }
          MatchingTextValidator.popRasterStateWithIntGuard(117);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_34_0 = var9;
          stackIn_34_1 = new StringBuilder().append("cn.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param7).append(')').toString());
        }
    }

    public final TextLayout ensureTextLayout(int param0, UiComponent param1) {
        RuntimeException var3 = null;
        TextLayout stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            this.field_k = -75;
          }
          if (null == param1.field_s) {
            param1.field_s = (TextLayout) ((Object) new CachedTextLayout());
          }
          if (this.field_i) {
            ((CachedTextLayout) (param1.field_s)).layoutParagraph(this.contentWidth(param0 + 5547, param1), this.field_a, this.field_m, this.getDisplayText(-1, param1), this.field_j, this.field_f, this.contentHeight(param0 - 2, param1), param0 + 2);
            if (SteelSentinels.obfuscationControl != 0) {
              this.layoutSingleLine(param1, (byte) 125);
            }
          } else {
            this.layoutSingleLine(param1, (byte) 125);
          }
          stackIn_9_0 = param1.field_s;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("cn.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final int textOriginX(int param0, int param1, UiComponent param2) {
        int discarded$1 = 0;
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 3) {
            discarded$1 = this.contentHeight(-89, (UiComponent) null);
          }
          stackIn_3_0 = this.textXForOffset((byte) 114, param2, 0, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("cn.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void drawSelection(int param0, int param1, boolean param2, int param3, UiComponent param4, int param5) {
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        TextLayoutLine var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        TextLayout var17 = null;
        TextLayout var18 = null;
        var16 = SteelSentinels.obfuscationControl;
        try {
          if (~param3 == ~param5) {
            return;
          }
          if (param2) {
            this.drawSelection(107, -2, false, -112, (UiComponent) null, 115);
          }
          if (param4.isFocused(0)) {
            var17 = this.ensureTextLayout(-1, param4);
            var18 = var17;
            if (param5 > param3) {
              var8 = param3;
              var9 = param5;
            }
            if (param5 <= param3 ||
              var16 != 0) {
              var8 = param5;
              var9 = param3;
            }
            var10 = var18.lineForCharacter(-1, var8);
            var11 = var18.lineForCharacter(-1, var9);
            ArchiveRequest.pushClip(param4.field_o + param1, param4.field_z + param0, -78, param4.field_o + param1 + param4.field_x, param4.field_z + param0 + param4.field_E);
            var12 = var10;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var11 < var12))) {
              var13 = var17.field_h[var12];
              stackIn_23_0 = var10;
              if (var16 == 0) {
                if (stackIn_23_0 != var12) {
                  stackIn_16_0 = var13.field_f[0];
                } else {
                  stackIn_16_0 = var18.characterX(1, var8);
                }
                var14 = stackIn_16_0;
                if (var12 != var11) {
                  if (var13 == null) {
                    stackIn_21_0 = 0;
                  } else {
                    stackIn_21_0 = var13.field_f[var13.field_f.length - 1];
                  }
                } else {
                  stackIn_21_0 = var18.characterX(1, var9);
                }
                var15 = stackIn_21_0;
                LoadoutHelpers.field_j.fillRectangleAlpha(-var14 + var15, 5939, this.textXForOffset((byte) 114, param4, var14, param1), var13.field_a, this.field_c >>> 24, this.field_c, param0 + param4.field_z - (-this.field_h - param4.field_F - var13.field_h));
                var12++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_23_0 = 113;
            }
            MatchingTextValidator.popRasterStateWithIntGuard(stackIn_23_0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_27_0 = var7;
          stackIn_27_1 = new StringBuilder().append("cn.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param5).append(')').toString());
        }
    }

    final void copyStyleTo(TextWidgetPainter param0, int param1) {
        try {
          param0.field_g = this.field_g;
          if (param1 != -3) {
            this.field_j = 10;
          }
          param0.field_k = this.field_k;
          param0.field_i = this.field_i;
          param0.field_e = this.field_e;
          param0.field_a = this.field_a;
          param0.field_d = this.field_d;
          param0.field_j = this.field_j;
          param0.field_c = this.field_c;
          param0.field_h = this.field_h;
          param0.field_b = this.field_b;
          param0.field_m = this.field_m;
          param0.field_f = this.field_f;
          param0.field_n = this.field_n;
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "cn.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void drawText(int param0, int param1, UiComponent param2, int param3) {
        try {
          if (param3 < 73) {
            this.copyStyleTo((TextWidgetPainter) null, -48);
          }
          this.paintTextRun(param1, -11867, param0, 0, this.field_g, 0, param2, this.field_k);
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "cn.P(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final int preferredHeight(byte param0, UiComponent param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -120 / ((param0 + 67) / 59);
          this.ensureTextLayout(-1, param1);
          stackIn_1_0 = param1.field_s.height((byte) 24) + this.field_h + this.field_d;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("cn.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public final int preferredWidth(byte param0, UiComponent param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.ensureTextLayout(-1, param1);
          if (param0 <= 40) {
            TextWidgetPainter.updateGameRoomPanel(-9, true, false, false, 56);
          }
          stackIn_3_0 = param1.field_s.maximumLineWidth((byte) -100) + this.field_b + this.field_n;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cn.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int contentWidth(int param0, UiComponent param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5546) {
            this.field_m = 61;
          }
          stackIn_3_0 = -this.field_n + (-this.field_b + param1.field_x);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cn.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void drawCaret(UiComponent param0, int param1, int param2, int param3, byte param4) {
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_7_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        TextLayoutLine var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        TextLayout var13 = null;
        TextLayout var14 = null;
        try {
          if (param4 <= 70) {
            TextWidgetPainter.handleFrontEndKey(-106, 84, -5, false);
          }
          if (param0.isFocused(0)) {
            var13 = this.ensureTextLayout(-1, param0);
            var14 = var13;
            var7 = var14.lineForCharacter(-1, param1);
            var8 = var13.field_h[var7];
            var9 = var14.characterX(1, param1);
            var10 = this.textXForOffset((byte) 114, param0, var9, param3);
            var11 = this.textOriginY((byte) -120, param0, param2) + Math.max(0, var8.field_h);
            stackIn_6_0 = this.textOriginY((byte) -116, param0, param2);
            stackIn_6_1 = this.contentHeight(-3, param0);
            stackIn_6_2 = var8.field_a;
            if (var14.field_h.length > (1 + var7)) {
              stackIn_7_3 = var13.field_h[var7 + 1].field_h;
            } else {
              stackIn_7_3 = var8.field_a;
            }
            var12 = stackIn_6_0 + Math.min(stackIn_6_1, Math.min(stackIn_6_2, stackIn_7_3));
            ArchiveRequest.pushClip(param0.field_o + param3, param2 + param0.field_z, 113, param0.field_x + (param0.field_o + param3), param0.field_E + (param0.field_z + param2));
            LoadoutHelpers.field_j.drawLine(var11, var12, this.field_e, (byte) -121, var10, var10);
            MatchingTextValidator.popRasterStateWithIntGuard(120);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("cn.S(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    protected TextWidgetPainter() {
    }

    TextWidgetPainter(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_h = param3;
          this.field_a = param7;
          this.field_g = param6;
          this.field_d = param4;
          this.field_f = param0;
          this.field_n = param2;
          this.field_c = param11;
          this.field_e = param10;
          this.field_m = param9;
          this.field_i = param12 ? true : false;
          this.field_k = param5;
          this.field_b = param1;
          this.field_j = param8;
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "cn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_l = true;
    }
}
