/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuButton {
    static String field_c;
    private boolean field_g;
    static UiLayoutNode field_e;
    private int field_f;
    private boolean field_r;
    static int field_l;
    int height;
    int kind;
    private int field_k;
    private int field_a;
    private FootballerPreview field_b;
    int width;
    private Sprite[] field_n;
    static int[] field_q;
    String field_p;
    static String field_o;
    static int field_j;
    static String field_i;

    final void activate(int param0, boolean param1) {
        boolean stackIn_67_0 = false;
        int stackIn_76_0 = 0;
        boolean stackIn_81_0 = false;
        int var4;
        var4 = Kickabout.field_G;
        if (param0 != -1) {
          return;
        }
        AchievementSubmission.a((byte) -127);
        if (37 == this.kind) {
          ((ButtonMenuScreen) (AuctionLogEntry.field_h)).showTutorialTip((byte) 52);
        } else {
          if (this.kind == 0) {
            if (GameLoopApplet.field_E.d((byte) 91)) {
              if (GameLoopApplet.field_E.field_J[0]) {
                PitchSurfaceLoader.enqueueTutorialChoice((byte) -124);
              } else {
                AuctionsScreen.startComputerMatch(10, true);
              }
            } else {
              SocketArchiveNetworkClient.a((byte) 126, 5);
            }
          } else {
            if (this.kind != 1) {
              if (this.kind == 2) {
                if (null != um.field_e) {
                  DelayedServerPacket.a(-1, param1, param0 - 1);
                } else {
                  if (SortCriterion.field_l != null) {
                    DelayedServerPacket.a(-2, param1, param0 ^ 1);
                  }
                }
              } else {
                if (6 == this.kind) {
                  DelayedServerPacket.a(0, param1, -2);
                } else {
                  if (this.kind == 27) {
                    DelayedServerPacket.a(17, param1, -2);
                  } else {
                    if (20 == this.kind) {
                      DelayedServerPacket.a(11, param1, -2);
                      TickClock.field_j = true;
                    } else {
                      if (18 != this.kind) {
                        if (this.kind != 23) {
                          if (45 != this.kind) {
                            if (this.kind != 48) {
                              if (this.kind == 46) {
                                DelayedServerPacket.a(24, param1, -2);
                              } else {
                                if (this.kind == 28) {
                                  DelayedServerPacket.a(14, param1, -2);
                                } else {
                                  if (this.kind == 25) {
                                    DelayedServerPacket.a(15, param1, -2);
                                  } else {
                                    if (this.kind == 26) {
                                      DelayedServerPacket.a(16, param1, -2);
                                    } else {
                                      if (this.kind != 42) {
                                        if (43 == this.kind) {
                                          vj.a(-25, param1);
                                        } else {
                                          if (this.kind == 21) {
                                            ((PagedHelpScreen) (AuctionLogEntry.field_h)).showPreviousPage((byte) -95);
                                          } else {
                                            if (this.kind != 22) {
                                              if (this.kind != 4) {
                                                if (33 == this.kind) {
                                                  DelayedServerPacket.a(19, param1, -2);
                                                } else {
                                                  if (this.kind == 34) {
                                                    DelayedServerPacket.a(20, param1, param0 ^ 1);
                                                  } else {
                                                    if (this.kind == 35) {
                                                      DelayedServerPacket.a(22, param1, -2);
                                                    } else {
                                                      if (this.kind == 36) {
                                                        DelayedServerPacket.a(21, param1, param0 - 1);
                                                      } else {
                                                        if (this.kind != 24) {
                                                          if (this.kind == 7) {
                                                            vj.a(param0 ^ -106, param1);
                                                          } else {
                                                            if (this.kind == 3) {
                                                              DelayedServerPacket.a(7, param1, param0 ^ 1);
                                                            } else {
                                                              if (this.kind != 5) {
                                                                if (this.kind != 8) {
                                                                  if (this.kind == 9) {
                                                                    um.field_e.offerDraw(-94);
                                                                    DelayedServerPacket.a(-1, param1, param0 - 1);
                                                                  } else {
                                                                    if (10 != this.kind) {
                                                                      if (this.kind != 11) {
                                                                        if (this.kind == 12) {
                                                                          QuickChatCategoryCache.a(param0 + 1);
                                                                        } else {
                                                                          if (this.kind == 55) {
                                                                            NanoTickClock.c((byte) -59);
                                                                          } else {
                                                                            if (this.kind == 13) {
                                                                              AccountRequestDialog.field_ib = 0;
                                                                            } else {
                                                                              if (this.kind != 14) {
                                                                                if (this.kind != 19) {
                                                                                  if (this.kind != 32) {
                                                                                    if (49 == this.kind) {
                                                                                      if (!EmailSyntaxValidator.c((byte) -42)) {
                                                                                        ColorQuantizationBox.showMessageDialog(39, (byte) 99);
                                                                                      } else {
                                                                                        stackIn_81_0 = !(ByteStorage.field_c);
                                                                                        ByteStorage.field_c = stackIn_81_0;
                                                                                      }
                                                                                    } else {
                                                                                      if (30 == this.kind) {
                                                                                        stackIn_76_0 = (SocketArchiveNetworkClient.field_v != 1) ? 1 : 0;
                                                                                        SocketArchiveNetworkClient.field_v = stackIn_76_0;
                                                                                      } else {
                                                                                        if (this.kind == 15) {
                                                                                          AppScreen.openQuitPage(20338, AppletContextSupport.getActiveApplet(101));
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    stackIn_67_0 = !(RotaryDialPainter.field_n);
                                                                                    RotaryDialPainter.field_n = stackIn_67_0;
                                                                                  }
                                                                                } else {
                                                                                  ql.a((byte) 101, true, NineSlicePanelPainter.field_f);
                                                                                  SpriteButtonPainter.field_v = 2147483647;
                                                                                }
                                                                              } else {
                                                                                AccountRequestDialog.field_ib = 1;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    } else {
                                                                      um.field_e.resign(-76);
                                                                      DelayedServerPacket.a(-1, param1, -2);
                                                                    }
                                                                  }
                                                                } else {
                                                                  um.field_e.leaveMatch(param1, 18);
                                                                  FriendsListPanel.field_Db = true;
                                                                }
                                                              } else {
                                                                if (SplashScreen.field_m == null) {
                                                                  ConsoleEvaluationException.a(param1, 0);
                                                                } else {
                                                                  UiWidget.h(0);
                                                                }
                                                                SpriteButtonPainter.field_v = 2147483647;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          DelayedServerPacket.a(12, param1, param0 - 1);
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                DelayedServerPacket.a(8, param1, -2);
                                              }
                                            } else {
                                              ((PagedHelpScreen) (AuctionLogEntry.field_h)).showNextPage(21);
                                            }
                                          }
                                        }
                                      } else {
                                        vj.a(-48, param1);
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              DelayedServerPacket.a(25, param1, param0 - 1);
                            }
                          } else {
                            DelayedServerPacket.a(23, param1, param0 ^ 1);
                          }
                        } else {
                          DelayedServerPacket.a(13, param1, -2);
                        }
                      } else {
                        DelayedServerPacket.a(9, param1, -2);
                      }
                    }
                  }
                }
              }
            } else {
              if (!PlayArea.a(100)) {
                if (!GameLoopApplet.field_E.field_J[0]) {
                  SocketArchiveNetworkClient.a((byte) 126, 26);
                } else {
                  if (!GameLoopApplet.field_E.d((byte) 64)) {
                    SocketArchiveNetworkClient.a((byte) 126, 5);
                  } else {
                    MouseWheelInput.a(-1822);
                  }
                }
              } else {
                ButtonMenuScreen.a(16144);
                SpriteButtonPainter.field_v = -3;
              }
            }
          }
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 != -27) {
          return;
        }
        int var3 = DateInputWidget.k(256);
        int var4 = var3 >> 3;
        int var5 = 17 != this.kind ? IntrusiveNode.b((byte) -99) : LoadingProgressSupport.a((byte) 97);
        var5 = var5 + (param0 ? -var4 : var4);
        if (var5 < 0) {
          var5 = 0;
        }
        if (var5 > var3) {
          var5 = var3;
        }
        if (this.kind == 17) {
          ConsoleValue.a(var5, (byte) 20);
        }
        if (this.kind == 16) {
          pe.a(var5, (byte) -121);
        }
    }

    final void a(boolean param0, boolean param1, boolean param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        this.field_g = param0 ? true : false;
        if (param3 != 16) {
          MenuButton.releaseStatics((byte) 108);
        }
        if (param1 &&
          !this.field_r) {
          this.activate(-1, true);
        }
        if (null != this.field_b) {
          this.field_b.updatePose(17 == this.kind ? LoadingProgressSupport.a((byte) 97) : IntrusiveNode.b((byte) -124), 1);
        }
        if (this.field_r &&
          param2 &&
          param4 != this.field_f) {
          param4 = param4 + (AlternateKeyedLoginCredentials.field_m - TutorialChoiceDialog.field_J);
          var6 = DateInputWidget.k(param3 + 240);
          var7 = param4 * var6 / AlternateKeyedLoginCredentials.field_m;
          if (var7 < 0) {
            var7 = 0;
          }
          if (var7 > var6) {
            var7 = var6;
          }
          if (this.kind == 17) {
            ConsoleValue.a(var7, (byte) 46);
          }
          if (16 == this.kind) {
            pe.a(var7, (byte) -121);
          }
        }
        this.field_f = !param2 ? -1 : param4;
    }

    final static void a(int param0, int param1, boolean param2, int param3, PlayerStats param4, boolean param5, int param6) {
        et.field_b = true;
        if (LoginMethod.a(false)) {
          return;
        }
        ok.field_c = param5;
        CachedListingRow.field_j = param2 ? true : false;
        VerticalScrollbar.field_Ib = param3;
        if (param1 != 0) {
          return;
        }
        try {
          AccountTermsPanel.field_G = param4;
          AuctionItem.field_e = 3;
          MessageDialog.field_x = param0;
          LinkTextPainter.field_c = param6;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "io.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        field_o = null;
        if (param0 != -6) {
          field_o = (String) null;
        }
        field_q = null;
        field_i = null;
        field_e = null;
    }

    final static void a(int param0) {
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        Sprite[] var3 = null;
        Sprite[] var4 = null;
        int var6 = 0;
        Sprite[] var7 = null;
        Sprite[] var8 = null;
        Sprite var9 = null;
        Sprite var10 = null;
        var6 = Kickabout.field_G;
        try {
          if (ug.field_c == null) {
            if (!QuickChatKeysHelpPanel.field_Cb.a(false, "stadium_icon")) {
              return;
            }
            var7 = ModalStack.a(QuickChatKeysHelpPanel.field_Cb, 53, "stadium_icon", "park");
            var8 = ModalStack.a(QuickChatKeysHelpPanel.field_Cb, param0 ^ 20, "stadium_icon", "beach");
            var3 = ModalStack.a(QuickChatKeysHelpPanel.field_Cb, -121, "stadium_icon", "street");
            var4 = new Sprite[12];
            for (var5 = 0; var5 < 4; var5++) {
              var4[var5] = var7[var5];
              var4[4 + var5] = var8[var5];
              var4[var5 + 8] = var3[var5];
            }
            IntrusiveNodeHashTable.a(true, var4);
          }
          if (null == DirectByteStorage.field_g) {
            if (!QuickChatKeysHelpPanel.field_Cb.a(false, "instructions")) {
              return;
            }
            var9 = QuickChatPhraseDefinition.a("instructions", QuickChatKeysHelpPanel.field_Cb, (byte) 119, "arrowkey");
            var10 = QuickChatPhraseDefinition.a("instructions", QuickChatKeysHelpPanel.field_Cb, (byte) 43, "key");
            AccountRegistrationPanel.field_C = AuctionsScreen.a(3, var9);
            DebugConsole.field_y = new Sprite[][]{et.a(0, oo.field_a, var10, var10.field_o), et.a(0, tn.field_c, var10, 62)};
            lt.field_d = new Sprite[]{et.a(0, RasterGammaSupport.field_d[0], var10, 50)[1], et.a(param0 - 2, RasterGammaSupport.field_d[1], var10, 50)[1]};
            DirectByteStorage.field_g = QuickChatPhraseDefinition.a("instructions", QuickChatKeysHelpPanel.field_Cb, (byte) 78, "mouse");
            RegistrationRequestDialog.field_qb = QuickChatPhraseDefinition.a("instructions", QuickChatKeysHelpPanel.field_Cb, (byte) 108, "mouse_left");
            PlayerInputEvent.field_q = QuickChatPhraseDefinition.a("instructions", QuickChatKeysHelpPanel.field_Cb, (byte) 103, "mouse_right");
            WorldDrawEntry.field_f = QuickChatPhraseDefinition.a("instructions", QuickChatKeysHelpPanel.field_Cb, (byte) 106, "mouse_roller");
          }
          if (param0 != 2) {
            field_l = 67;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "io.A(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int var9 = 0;
        int stackIn_18_0 = 0;
        String[] stackIn_25_1 = null;
        int stackIn_26_2 = 0;
        String[] stackIn_40_1 = null;
        int stackIn_41_2 = 0;
        int stackIn_46_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var10;
        int var11;
        var11 = Kickabout.field_G;
        if (this.kind == 1 &&
          !GameLoopApplet.field_E.field_J[0]) {
          this.field_g = false;
        }
        if (param1 - (this.width >> 1) < ArrayWidgetContainer.field_x &&
          ArrayWidgetContainer.field_x < param1 + (this.width >> 1) &&
          param0 - (this.height >> 1) < TutorialCaptionSupport.field_j &&
          TutorialCaptionSupport.field_j < param0 + (this.height >> 1)) {
          if (49 == this.kind) {
            IndexedSpriteState.$cfr$intArgs$a$b6210757cdab(-67, PlayerPortraitCacheEntry.field_l);
          }
          if (32 == this.kind) {
            IndexedSpriteState.$cfr$intArgs$a$b6210757cdab(-67, MarkerSliderWidget.field_G);
          }
          if (37 == this.kind) {
            IndexedSpriteState.$cfr$intArgs$a$b6210757cdab(-67, InstrumentEnvelope.field_i);
          }
        }
        stackIn_18_0 = (this.field_g) ? 1 : 0;
        var4 = stackIn_18_0;
        if (this.field_g &&
          1 == AccountNameCheckState.field_c) {
          var4 = 2;
        }
        this.field_n[var4].c(param1 - (this.width >> 1), -(this.height >> 1) + param0);
        if (this.kind != 32) {
          if (this.kind == 49 &&
            EmailSyntaxValidator.c((byte) -42)) {
            stackIn_40_1 = AccountTermsPanel.field_K;
            if (ByteStorage.field_c) {
              stackIn_41_2 = 1;
            } else {
              stackIn_41_2 = 0;
            }
            this.field_p = ((String) (Object) stackIn_40_1[stackIn_41_2]).toLowerCase();
          } else {
            if (this.kind == 30) {
              this.field_p = TextWidgetPainter.field_d[SocketArchiveNetworkClient.field_v].toLowerCase();
            } else {
              if (this.kind == 9) {
                this.field_p = NumericDateInputWidget.field_N.toLowerCase();
                if (um.field_e != null &&
                  um.field_e.localSeat >= 0 &&
                  um.field_e.matchState.participantStatus[um.field_e.localSeat].offerDraw) {
                  this.field_p = DiagnosticsOverlaySupport.field_b.toLowerCase();
                }
              }
            }
          }
        } else {
          stackIn_25_1 = TextHotspotWidget.field_K;
          if (!RotaryDialPainter.field_n) {
            stackIn_26_2 = 0;
          } else {
            stackIn_26_2 = 1;
          }
          this.field_p = ((String) (Object) stackIn_25_1[stackIn_26_2]).toLowerCase();
        }
        if (this.field_r) {
          var5 = this.field_k >> 1;
          param1 = param1 + (-20 + (-AlternateKeyedLoginCredentials.field_m + TutorialChoiceDialog.field_J) - var5);
          var6 = param1 - (-var5 - 20);
          SoftwareRasterizer.e(var6, param0 - 2, AlternateKeyedLoginCredentials.field_m, 4, 65793);
          if (this.kind != 17) {
            stackIn_46_0 = IntrusiveNode.b((byte) -61);
          } else {
            stackIn_46_0 = LoadingProgressSupport.a((byte) 97);
          }
          var7 = stackIn_46_0;
          var8 = var7 * AlternateKeyedLoginCredentials.field_m / DateInputWidget.k(256);
          for (var9 = 0; var9 < var8 - 1; var9++) {
            var10 = (-var9 + var8 - 1 << 8) / var8 >> 1;
            if (this.kind == 17) {
              var10 = var10 << 8 | var10 | 16711680;
            }
            if (16 == this.kind) {
              var10 = var10 << 8 | 255 | var10 << 16;
            }
            SoftwareRasterizer.drawVerticalLine(1 + (var9 + var6), 1 + param0 - 2, 2, var10);
          }
          this.field_b.draw(24, param0 + 10, var6 + var8);
        }
        param0 += 4;
        if (var4 == 2) {
          param0++;
        }
        if (param2 != 13800) {
          return;
        }
        DirectByteStorage.field_o.d(this.field_p, param1, 2 + param0, 16777215, -1);
        if (this.kind == 1 && (!GameLoopApplet.field_E.field_J[0] ||
          PlayArea.a(100))) {
          param0 -= 4;
          SoftwareRasterizer.fillRectangleAlpha(-(this.width >> 1) + param1, -(this.height >> 1) + param0, this.width, this.height, 0, 128);
        }
    }

    MenuButton(int param0, int param1, int param2) {
        int var8 = 0;
        int stackIn_34_0 = 0;
        String stackIn_37_1 = null;
        int var4;
        int var5;
        ArgbSprite var6;
        int[] var7;
        int[] var10;
        int[] var11;
        this.field_b = null;
        this.field_a = param0;
        this.kind = param2;
        this.field_p = MatchingTextValidator.field_o[this.kind];
        if (this.kind != 47) {
          if (50 != this.kind) {
            if (this.kind != 44) {
              if (this.kind != 11) {
                if (this.kind != 12) {
                  if (this.kind != 55) {
                    if (this.kind != 56) {
                      if (this.kind != 51) {
                        if (54 != this.kind) {
                          if (53 != this.kind) {
                            if (this.kind != 52) {
                              if (7 != this.kind) {
                                if (42 != this.kind) {
                                  if (this.kind != 43) {
                                    if (19 != this.kind) {
                                      stackIn_34_0 = (this.field_a != -3) ? 0 : 1;
                                    } else {
                                      stackIn_34_0 = 1;
                                    }
                                  } else {
                                    stackIn_34_0 = 1;
                                  }
                                } else {
                                  stackIn_34_0 = 1;
                                }
                              } else {
                                stackIn_34_0 = 1;
                              }
                            } else {
                              stackIn_34_0 = 1;
                            }
                          } else {
                            stackIn_34_0 = 1;
                          }
                        } else {
                          stackIn_34_0 = 1;
                        }
                      } else {
                        stackIn_34_0 = 1;
                      }
                    } else {
                      stackIn_34_0 = 1;
                    }
                  } else {
                    stackIn_34_0 = 1;
                  }
                } else {
                  stackIn_34_0 = 1;
                }
              } else {
                stackIn_34_0 = 1;
              }
            } else {
              stackIn_34_0 = 1;
            }
          } else {
            stackIn_34_0 = 1;
          }
        } else {
          stackIn_34_0 = 1;
        }
        var4 = stackIn_34_0;
        if (this.field_a != -2) {
          stackIn_37_1 = this.field_p.toLowerCase();
        } else {
          stackIn_37_1 = this.field_p.toUpperCase();
        }
        this.field_p = stackIn_37_1;
        this.field_k = DirectByteStorage.field_o.a(this.field_p);
        var5 = this.field_a;
        if (this.field_a == -4) {
          var5 = 40 + this.field_k;
        }
        if (this.field_a == -3) {
          var5 = DirectByteStorage.field_m.field_o;
        }
        this.field_n = new Sprite[3];
        if (21 != this.kind) {
          if (22 != this.kind) {
            if (49 == this.kind &&
              !EmailSyntaxValidator.c((byte) -42)) {
              param1 = 11184810;
              this.field_n[0] = AccountRegistrationPanel.a(var4 != 0, (byte) -52, 0, var5, param1);
              this.field_n[1] = this.field_n[0];
              this.field_n[2] = AccountRegistrationPanel.a(var4 != 0, (byte) -52, 2, var5, param1);
            } else {
              if (this.field_a == -5) {
                this.field_n[0] = (Sprite) ((Object) ArchiveIndex.field_m);
                var6 = ArchiveIndex.field_m.copyArgb();
                this.field_n[2] = (Sprite) ((Object) ArchiveIndex.field_m);
                PacketBuffer.a(-104, var6);
                AuctionListing.a(-3 + SoftwareRasterizer.field_g, -22914, 3, SoftwareRasterizer.field_f - 3, 3);
                PacketBuffer.a(103, var6);
                var6.drawAdditive(0, 0, 60);
                TeamManagementScreen.e(119);
                var11 = new int[64];
                var10 = var11;
                var7 = var10;
                for (var8 = 0; var11.length > var8; var8++) {
                  var7[var8] = 131586 * var8;
                }
                SpritePixelSupport.a(4, 6, -4 + SoftwareRasterizer.field_g, 6, 8, -40 + var11.length, var11);
                TeamManagementScreen.e(127);
                TeamManagementScreen.e(125);
                this.field_n[1] = (Sprite) ((Object) var6);
              } else {
                this.field_n[0] = AccountRegistrationPanel.a(var4 != 0, (byte) -52, 0, var5, param1);
                this.field_n[1] = AccountRegistrationPanel.a(var4 != 0, (byte) -52, 1, var5, param1);
                this.field_n[2] = AccountRegistrationPanel.a(var4 != 0, (byte) -52, 2, var5, param1);
              }
            }
          } else {
            this.field_n = (Sprite[]) ((Object) SoftwareDrawingSupport.field_c[0]);
            this.field_p = null;
          }
        } else {
          this.field_n = (Sprite[]) ((Object) SoftwareDrawingSupport.field_r[0]);
          this.field_p = null;
        }
        this.height = this.field_n[0].field_v;
        this.width = this.field_n[0].field_o;
        if (this.kind == 17) {
          this.field_b = new FootballerPreview(0);
          this.field_r = true;
        }
        if (this.kind == 16) {
          this.field_b = new FootballerPreview(1);
          this.field_r = true;
        }
    }

    static {
        field_c = "Log in / Create account";
        field_q = new int[5];
        field_q[4] = 204800;
        field_q[3] = 245760;
        field_q[2] = 204800;
        field_q[1] = 221184;
        field_q[0] = 204800;
        field_o = "Player does not have any trinket slots.";
        field_i = "Fullscreen";
    }
}
