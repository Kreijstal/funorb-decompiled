/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Trinket {
    int field_e;
    int field_h;
    int field_k;
    static String[] field_j;
    static String field_i;
    static ArgbSprite field_f;
    static int field_c;
    static int[] field_g;
    static ArgbSprite field_d;
    static UiLayoutNode field_a;
    static ResourceArchive field_b;

    final boolean isShinPads(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -21636) {
            this.speedBonus(41);
          }
          stackIn_7_0 = (56 == this.field_h);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.W(" + param0 + ')');
        }
    }

    final boolean isTramline(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 96 / ((param0 - 67) / 34);
          stackIn_4_0 = (this.field_h == 68);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.DA(" + param0 + ')');
        }
    }

    final ArgbSprite getIconSprite(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ArgbSprite stackIn_2_0 = null;
        ArgbSprite stackIn_7_0 = null;
        ArgbSprite stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_2_0 = (ArgbSprite) null;
            return stackIn_2_0;
          }
          if (0 == this.field_h) {
            stackIn_7_0 = GradientRasterSupport.field_c[this.field_k];
            return stackIn_7_0;
          }
          var2_int = MusicPatch.field_g[this.field_h];
          stackIn_9_0 = ScrollContainer.field_Fb[this.field_k][var2_int];
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.O(" + param0 + ')');
        }
    }

    final boolean isMoonball(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 70) {
            field_i = (String) null;
          }
          stackIn_7_0 = (this.field_h == 70);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.U(" + param0 + ')');
        }
    }

    final boolean hasTackleProtection(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 103) {
            this.isShinPads(24);
          }
          stackIn_10_0 = (this.field_h == 55) || (56 == this.field_h);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.P(" + param0 + ')');
        }
    }

    final int speedBonus(int param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = 100 % ((42 - param0) / 49);
          stackIn_1_0 = GameKeyHandler.field_b[this.field_h];
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.T(" + param0 + ')');
        }
    }

    final String getName(byte param0) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -1) {
            stackIn_4_0 = ValidationState.field_b[this.field_h];
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.N(" + param0 + ')');
        }
    }

    final boolean isEmpty(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 256) {
            Trinket.releaseStatics(88);
          }
          stackIn_7_0 = (0 == this.field_h);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.B(" + param0 + ')');
        }
    }

    final int tackleStunBonus(byte param0) {
        RuntimeException var2 = null;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -117) {
            this.isMoonball(108);
          }
          if (57 == this.field_h) {
            stackIn_10_0 = 30;
            return stackIn_10_0;
          }
          if (this.field_h != 58) {
            stackIn_12_0 = 0;
            return stackIn_12_0;
          }
          stackIn_8_0 = 60;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.S(" + param0 + ')');
        }
    }

    final boolean isAtomBall(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 63) {
            field_j = (String[]) null;
          }
          stackIn_7_0 = (this.field_h == 67);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.L(" + param0 + ')');
        }
    }

    Trinket(int param0, int param1, int param2) {
        try {
          this.field_k = param0;
          this.field_h = param1;
          this.field_e = param2;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "fn.<init>(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean isPumpkins(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 107 % ((-4 - param0) / 38);
          stackIn_4_0 = (72 == this.field_h);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.G(" + param0 + ')');
        }
    }

    final static void drawFootballerShadow(RenderedFootballer param0, int param1) {
        int stackIn_49_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var6_ref_byte__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Kickabout.field_G;
        try {
          if (!ClientInteractionSupport.field_a) {
            return;
          }
          var2_int = SocialListLayoutSupport.worldToScreenX(0, param0.getRenderedX(1606384336));
          var3 = IntKeyLookup.projectPitchY((byte) -64, param0.field_bb >> 16);
          if (param1 != 100) {
            return;
          }
          if (var3 - 48 <= 480 &&
            48 + var3 >= 0 &&
            640 >= -48 + var2_int &&
            48 + var2_int >= 0) {
            if (SocketArchiveNetworkClient.field_v != 0 &&
              FormationAgent.field_l >= 2) {
              var4 = param0.field_U;
              var5 = param0.field_ob;
              if ((var5 == 3 ||
                var5 == 5) && (255 & param0.field_R) == 0) {
                if (var5 == 3) {
                  var6_ref_byte__ = PitchPurchaseSupport.field_b[var4][param0.field_R >> 8];
                }
                if (var5 != 3 ||
                  var9 != 0) {
                  var6_ref_byte__ = BuyPitchDialog.field_K[var4][param0.field_mb.field_b / 3][param0.field_R >> 8];
                }
                boolean decompiledSharedTail0 = (InstrumentNoteMask.field_i != 256);
                if (!decompiledSharedTail0) {
                  SoftwareDrawingSupport.drawPackedShadowMask(var6_ref_byte__, -48 + var2_int, var3 - 48, 96, 96);
                  decompiledSharedTail0 = (var9 != 0);
                }
                if (decompiledSharedTail0) {
                  var7 = 96 * InstrumentNoteMask.field_i >> 8;
                  var8 = 48 * InstrumentNoteMask.field_i >> 8;
                  SoftwareDrawingSupport.drawScaledPackedShadowMask(var6_ref_byte__, var2_int - var8, var3 - var8, 96, 96, var7, var7);
                }
                if (var9 == 0) {
                  return;
                }
              }
              if (256 != InstrumentNoteMask.field_i) {
                stackIn_49_0 = 550400 / InstrumentNoteMask.field_i;
              } else {
                stackIn_49_0 = 2150;
              }
              var6 = stackIn_49_0;
              CanvasResizePolicy.a(param0.field_U, param0.field_mb, param0.field_R, false, var6);
              SpritePixelSupport.drawSpriteShadowMask(BuyPitchDialog.field_F, var2_int - 48, var3 - 48);
              return;
            }
            SpritePixelSupport.drawRadialShadow(var2_int << 4, var3 << 4, 28 * InstrumentNoteMask.field_i >> 4, 11, ClientUiOverlay.field_e);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_54_0 = var2;
          stackIn_54_1 = new StringBuilder().append("fn.E(");
          if (param0 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void buildBlurredModelSprite(byte param0) {
        RuntimeException runtimeException = null;
        Sprite var1 = null;
        Sprite var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          var1 = new Sprite(540, 140);
          PacketBuffer.a(param0 + 26, var1);
          TriangleRasterizer.useRasterClip();
          SoftwareRasterizer.clearFramebuffer();
          PlayerStats.field_p = 0;
          AuctionItem.a((byte) -112);
          var2 = var1.copy();
          var3 = 0;
          while (var3 < 15) {
            var2.drawSilhouette(-2, -2, 16777215);
            SoftwareRasterizer.blurRectangle(4, 4, 0, 0, 540, 140);
            var3++;
            if (var4 != 0) {
              return;
            }
          }
          if (param0 != -128) {
            field_b = (ResourceArchive) null;
          }
          ConsoleCommand.field_v.setRasterTarget();
          var1.drawHalfSize(0, 0);
          TeamManagementScreen.e(127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "fn.F(" + param0 + ')');
        }
    }

    final boolean isTorquing(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.getName((byte) -101);
          }
          stackIn_7_0 = (this.field_h == 69);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.V(" + param0 + ')');
        }
    }

    final boolean isSafeTacklerOrShinPads(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return true;
          }
          stackIn_10_0 = (this.field_h == 54) || (56 == this.field_h);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.J(" + param0 + ')');
        }
    }

    final static void initializeAfterimagePool(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Kickabout.field_G;
        try {
          SplashScreen.field_n = new EntityAfterimage[param0];
          var1_int = 0;
          while (SplashScreen.field_n.length > var1_int) {
            SplashScreen.field_n[var1_int] = new EntityAfterimage();
            var1_int++;
            if (var2 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "fn.R(" + param0 + ')');
        }
    }

    final static void setSoundEffectVolume(int param0, byte param1) {
        boolean stackIn_19_0 = false;
        RuntimeException decompiledCaughtException = null;
        SoundStreamHandle var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_19_0Lifetime1;
        var4 = Kickabout.field_G;
        try {
          IconButtonPainter.field_a = param0;
          var3 = -110 / ((67 - param1) / 54);
          var2 = (SoundStreamHandle) (LoginCredentials.field_a.first(24009));
          scanLoop1: while (true) {
            boolean decompiledFrameCompleted0 = true;
            if (var2 != null) {
              stackIn_19_0 = var2.owner.isLinked((byte) -113);
              if (var4 != 0) {
                while (true) {
                  if (stackIn_19_0) {
                    var2.stream.setInternalVolume(var2.baseVolume * IconButtonPainter.field_a + 128 >> 8);
                  }
                  var2.c((byte) -109);
                  var2 = (SoundStreamHandle) (IndexedSpriteState.field_c.next(33));
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                if (!stackIn_19_0) {
                  var2.c((byte) -109);
                }
                if (stackIn_19_0 ||
                  var4 != 0) {
                  var2.stream.setInternalVolume(128 + IconButtonPainter.field_a * var2.baseVolume >> 8);
                }
                var2 = (SoundStreamHandle) (LoginCredentials.field_a.next(33));
                if (var4 == 0) {
                  continue;
                }
              }
            }
            if ((decompiledFrameCompleted0) &&
              (IndexedSpriteState.field_c != null)) {
              var2 = (SoundStreamHandle) (IndexedSpriteState.field_c.first(24009));
              while (var2 != null) {
                if (var4 != 0) {
                  break scanLoop1;
                }
                stackIn_19_0Lifetime1 = var2.owner.isLinked((byte) -113);
                if (stackIn_19_0Lifetime1) {
                  var2.stream.setInternalVolume(var2.baseVolume * IconButtonPainter.field_a + 128 >> 8);
                } else {
                  var2.c((byte) -109);
                }
                var2 = (SoundStreamHandle) (IndexedSpriteState.field_c.next(33));
              }
            }
            RankingsRequest.field_n[1] = param0;
            RankingsRequest.field_n[2] = param0;
            break;
          }
          if (null != LoadingProgressSupport.field_d) {
            LoadingProgressSupport.field_d.a(1, param0, (byte) -85);
            LoadingProgressSupport.field_d.a(2, param0, (byte) -85);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2_ref), "fn.Q(" + param0 + ',' + param1 + ')');
        }
    }

    final static void showLoginWithExtraText(byte param0, String param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          QuickChatMenuFactory.setLoginExtraText(true, param1);
          MouseInputHandler.a(ImageProducerRasterBuffer.field_g, 4, false);
          if (param0 < 14) {
            field_c = -13;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("fn.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final boolean isMushroom(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2688) {
            this.isAsteroid(false);
          }
          stackIn_7_0 = (this.field_h == 64);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.GA(" + param0 + ')');
        }
    }

    final static String updateChatComposeDisplay(int param0) {
        String stackIn_63_0 = null;
        Object stackIn_99_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var8Lifetime1;
        var10 = Kickabout.field_G;
        try {
          var1 = null;
          var2 = null;
          if (NodeHashTableIterator.field_b == 0 &&
            null != ArchiveSource.field_b) {
            var2 = MatchTextInputOverlay.field_g;
          }
          if (~NodeHashTableIterator.field_b == param0 &&
            !LoggedPlayer.b(param0 - 3194)) {
            boolean decompiledSharedTail1 = !(IntKeyLookup.a(PlayerStatSortCriterion.field_o, -39));
            if (!decompiledSharedTail1) {
              var2 = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, ChatComposeSupport.field_c, new String[]{TrinketTile.field_Kb});
              decompiledSharedTail1 = (var10 != 0);
            }
            if (decompiledSharedTail1) {
              var2 = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, BrowserUiSupport.field_a, new String[]{TrinketTile.field_Kb});
            }
            if (DebugConsole.field_s) {
              TextButton.a((String) null, (String) null, 0, 2, (String) (var2), -115);
              ClientInteractionSupport.dismissQuickChat((byte) 110);
            }
          }
          if (null == var2 &&
            !NineSlicePanelPainter.field_a &&
            ContentTransitionDialog.field_Y == null) {
            var2 = ThumbnailStateFactory.field_a;
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != var2) {
            MarkerSliderWidget.a(0, SoundStreamHandle.field_e, (String) (var2), (String) null, (byte) 34);
            decompiledFrameRemainder0 = (var10 != 0);
          }
          if (decompiledFrameRemainder0) {
            var3 = ArchiveSource.field_e;
            var3 = TextInputWidget.prefixAccountIcon(false, var3);
            var4 = "";
            var5 = "|";
            var6 = NodeHashTableIterator.field_b;
            var7 = 0;
            if (var6 == 2) {
              var4 = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, MySquadScreen.field_F, new String[]{TrinketTile.field_Kb});
              var8 = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, UiLayoutNode.field_ib, new String[]{var3});
              var7 = -485 + WeightedCacheEntry.field_s.field_q + (RotaryDialPainter.field_b.field_q + (FootballerAgent.field_i.stringWidth(var8) - FootballerAgent.field_i.stringWidth(var4)));
              if (0 > var7) {
                var7 = 0;
              }
            }
            if (var6 != 2 ||
              var10 != 0) {
              if (var6 == 0) {
                if (null == PlayerContextMenu.field_i &&
                  SharedScrollbarState.field_d) {
                  var4 = "[" + ButtonMenuScreen.field_z + "] ";
                }
                if (PlayerContextMenu.field_i != null) {
                  if (!GameOverView.field_R ||
                    SingleChildContainer.field_x == null) {
                    var4 = "[" + LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, AccountNameAvailabilityValidator.field_m, new String[]{PlayerContextMenu.field_i.field_ec}) + "] ";
                    if (var10 != 0) {
                      var4 = "[" + SingleChildContainer.field_x + "] ";
                    }
                  } else {
                    var4 = "[" + SingleChildContainer.field_x + "] ";
                  }
                  var6 = 1;
                }
              }
              if (!PitchDecorationSupport.hasSavedInputLayout(118)) {
                stackIn_63_0 = "<img=3>: ";
              } else {
                stackIn_63_0 = ": ";
              }
              var8Lifetime1 = stackIn_63_0;
              var4 = var4 + var3 + var8Lifetime1;
              boolean decompiledSharedTail0 = !(PacketBuffer.field_l);
              if (!decompiledSharedTail0) {
                var4 = "<col=999999>" + var4 + SellPlayerDialog.field_H + "</col>";
                var5 = "";
                decompiledSharedTail0 = (var10 != 0);
              }
              if ((decompiledSharedTail0) &&
                (WriteIntegersCommand.field_C)) {
                var4 = "<col=999999>" + var4 + MidiPcmStream.field_t + "</col>";
                var5 = "";
              }
              var9 = FootballerAgent.field_i.stringWidth(var4);
              if (!PitchDecorationSupport.hasSavedInputLayout(119)) {
                if (RotaryDialPainter.field_b.field_gb &&
                  BytePlusOneCommand.field_A - RotaryDialPainter.field_b.field_F < var9) {
                  if (!PacketBuffer.field_l) {
                    var1 = MidiPcmStream.field_t;
                  } else {
                    var1 = "Broken!";
                  }
                }
                if (RotaryDialPainter.field_b.field_sb != 0 &&
                  RotaryDialPainter.field_b.field_bb < var9 &&
                  !PacketBuffer.field_l) {
                  ChatComposeMode.setComposeMode(0);
                }
              }
            }
            MarkerSliderWidget.a(var7, ByteArrayPoolState.field_c[var6], var4 + BitmapFont.escapeMarkup(AuctionLogEntry.field_m.toString()), var5, (byte) 34);
            if (!TextFieldNode.field_Wb) {
              WeightedCacheEntry.field_s.field_gb = false;
            }
            if (WeightedCacheEntry.field_s.field_gb) {
              var1 = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, FormationView.field_s, new String[]{var3, TrinketTile.field_Kb});
            }
          }
          stackIn_99_0 = var1;
          return (String) (stackIn_99_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) (var1), "fn.EA(" + param0 + ')');
        }
    }

    final boolean isMoonwalk(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 65) {
            Trinket.drawFootballerShadow((RenderedFootballer) null, -74);
          }
          stackIn_7_0 = (this.field_h == 65);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.HA(" + param0 + ')');
        }
    }

    final boolean isActiveHorrorCostume(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -9814) {
            field_g = (int[]) null;
          }
          stackIn_10_0 = (this.field_h == 73) && (ConsolePanel.isHalloweenPeriod((byte) 65));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.K(" + param0 + ')');
        }
    }

    public final String toString() {
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          stackIn_1_0 = DiagnosticsOverlaySupport.field_a[this.field_k] + " [" + ValidationState.field_b[this.field_h] + "]";
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "fn.toString()");
        }
    }

    final boolean isWhereAmI(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_7_0 = (this.field_h == 63);
            return stackIn_7_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.C(" + param0 + ')');
        }
    }

    final int powerBonus(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 62) {
            this.field_k = 120;
          }
          stackIn_4_0 = AuctionTableWidget.field_Ib[this.field_h];
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.M(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_d = null;
          field_a = null;
          field_g = null;
          if (param0 != 140) {
            Trinket.showLoginWithExtraText((byte) -7, (String) null);
          }
          field_j = null;
          field_f = null;
          field_b = null;
          field_i = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "fn.FA(" + param0 + ')');
        }
    }

    final boolean isAsteroid(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            Trinket.drawFootballerShadow((RenderedFootballer) null, 63);
          }
          stackIn_7_0 = (this.field_h == 71);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.BA(" + param0 + ')');
        }
    }

    final boolean isTankClone(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 59) {
            stackIn_7_0 = (59 == this.field_h);
            return stackIn_7_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.AA(" + param0 + ')');
        }
    }

    final boolean isHotshotClone(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 119 % ((45 - param0) / 54);
          stackIn_4_0 = (60 == this.field_h);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.CA(" + param0 + ')');
        }
    }

    final boolean isSlalom(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.getIconSprite(true);
          }
          stackIn_7_0 = (this.field_h == 62);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.H(" + param0 + ')');
        }
    }

    final int tackleBonus(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 124) {
            field_j = (String[]) null;
          }
          stackIn_4_0 = TeamSelectionView.field_r[this.field_h];
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.IA(" + param0 + ')');
        }
    }

    final boolean isAirplane(byte param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 58) {
            this.field_e = 34;
          }
          stackIn_7_0 = (66 == this.field_h);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.A(" + param0 + ')');
        }
    }

    final boolean isRangerClone(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -32076) {
            stackIn_7_0 = (this.field_h == 61);
            return stackIn_7_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "fn.D(" + param0 + ')');
        }
    }

    static {
        field_i = "Remove <%0> from friend list";
        field_j = new String[]{"Right-click", "Mouse wheel", "Direction keys"};
        field_c = 0;
        field_g = new int[4];
        field_g[3] = 2500;
        field_g[1] = 500;
        field_g[0] = 100;
        field_g[2] = 1000;
    }
}
