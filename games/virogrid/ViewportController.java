/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ViewportController {
    static char[] field_f;
    private int field_t;
    private int field_e;
    private int field_k;
    private int field_g;
    private int field_o;
    private int field_d;
    private int field_l;
    static boolean field_i;
    private int field_a;
    private int field_j;
    private float field_c;
    private int field_p;
    static boolean field_m;
    static String field_b;
    private boolean field_s;
    private FrameResizer field_n;
    private int field_h;
    private int field_u;
    private int field_v;
    private int field_r;
    private int field_q;

    final void updateViewport(int param0) {
        if (null != FullscreenState.field_b) {
          return;
        }
        if (NameCharacterHelpers.field_d <= 0) {
          this.field_s = false;
        }
        if (!this.field_s) {
          if (FallingParticle.field_i < this.field_l) {
            UiWidget.field_s = (this.field_l - FallingParticle.field_i) / 2;
          } else {
            if (this.field_l > 0) {
              UiWidget.field_s = 0;
            }
          }
          if (FallingParticle.field_i != this.field_h ||
            this.field_r != SpriteWidget.field_B) {
            this.field_n.resize(this.field_r, this.field_h, (byte) 125);
          }
          return;
        }
        int fieldTemp$0 = this.field_k - 1;
        this.field_k = this.field_k - 1;
        if (fieldTemp$0 > 0) {
          return;
        }
        this.field_k = this.field_t;
        if (this.field_q <= DualLinkDeque.field_b) {
          this.applyDesiredSize((byte) 22);
          if (param0 != -7927) {
            ViewportController.releaseStatics((byte) 33);
          }
          return;
        }
        this.field_s = false;
    }

    final void setDesiredSize(int param0, int param1, byte param2) {
        this.field_l = param0;
        if (param2 > -104) {
          return;
        }
        this.field_j = param1;
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 112) {
          field_b = (String) null;
        }
        field_b = null;
        field_f = null;
    }

    final boolean isResizeAllowed(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -1558) {
          ViewportController.releaseStatics((byte) -22);
        }
        stackIn_6_0 = (DualLinkDeque.field_b >= this.field_q) && (NameCharacterHelpers.field_d > 0);
        return stackIn_6_0;
    }

    final FullscreenFocusCanvas enterFullscreen(int param0) {
        this.field_g = FallingParticle.field_i;
        this.field_v = SpriteWidget.field_B;
        this.field_n.resize(this.field_p, this.field_e, (byte) 106);
        SpriteWidget.field_Db = false;
        if (param0 != 11) {
          ViewportController.updateGameScreen(true);
        }
        FullscreenFocusCanvas var2 = TriangleMesh.openFullscreenCanvas(this.field_e, 0, this.field_p, 0, 5416, MusicPlaybackHelpers.field_c);
        if (var2 == null) {
          this.restoreWindowedSize((byte) -122);
        }
        return var2;
    }

    final static void updateGameScreen(boolean param0) {
        int stackIn_44_0 = 0;
        GameSession stackIn_62_0 = null;
        GameSession stackIn_66_0 = null;
        boolean stackIn_67_1 = false;
        double stackIn_69_2 = 0.0;
        boolean stackIn_70_3;
        int var1;
        double var2_double;
        GameSession var2;
        int var3;
        double var4;
        double var6;
        int var8;
        double var4Lifetime1;
        double var6Lifetime1;
        var8 = Virogrid.field_F ? 1 : 0;
        if (TextButton.field_x == 0 &&
          !MarkerSlider.beginReconnectGracePeriod(true) &&
          !DigestHelpers.isFullscreenPromptOpen(true) &&
          !MusicCrossfadeStream.isLoginRequestFlagged((byte) 47)) {
          if (param0) {
            field_f = (char[]) null;
          }
          if (MenuScreen.field_g != 0 &&
            GameClock.field_c == 10) {
            BufferedSocket.enterMainMenu(12229, true);
          }
          if (MenuScreen.field_g != 0) {
            PacketRequestHelpers.field_e = GameApplet.hitTestFooterButtons(-123, HuffmanCodec.field_b, PasswordFieldPainter.field_y);
            if (0 == PacketRequestHelpers.field_e &&
              MidiNote.field_C != 0) {
              if (ByteArrayPool.field_c < 2) {
                ByteArrayPool.field_c = LoginMethod.field_l;
              } else {
                ByteArrayPool.field_c = 0;
              }
              PendingRequest.createGameOptions(NanoTickClock.isNonNegative(108, MidiPcmStream.field_y), (byte) 87);
            } else {
              if (2 == MidiNote.field_C &&
                5 == PacketRequestHelpers.field_e) {
                BufferedSocket.resetCameraTargets(true, (byte) -106);
              }
            }
          }
          PacketRequestHelpers.field_e = GameApplet.hitTestFooterButtons(-109, StatefulWidgetPainter.field_u, IconTextComponent.field_Jb);
          if (NodeHashTableIterator.field_e != 0 &&
            2 == MidiNote.field_C) {
            if (PacketRequestHelpers.field_e == 1) {
              DirectByteStorage.updateCameraOrbit(0.0f, param0, 0.029999999329447746f);
            } else {
              if (PacketRequestHelpers.field_e != 2) {
                if (PacketRequestHelpers.field_e != 3) {
                  if (PacketRequestHelpers.field_e == 4) {
                    DirectByteStorage.updateCameraOrbit(-8.0f, false, 0.0f);
                  }
                } else {
                  DirectByteStorage.updateCameraOrbit(8.0f, false, 0.0f);
                }
              } else {
                DirectByteStorage.updateCameraOrbit(0.0f, false, -0.029999999329447746f);
              }
            }
          }
          if (GameClock.field_c == MidiPcmStream.field_y) {
            if (LobbySortHelpers.field_g == TextDecodeHelpers.field_g) {
              if (10 != MidiPcmStream.field_y) {
                stackIn_44_0 = (-1 != PacketRequestHelpers.field_e) ? 1 : 0;
              } else {
                stackIn_44_0 = 1;
              }
            } else {
              stackIn_44_0 = 1;
            }
          } else {
            stackIn_44_0 = 1;
          }
          var1 = stackIn_44_0;
          if (!WidgetNode.field_p.field_g) {
            PendingSubmission.field_k = (double)(IconTextComponent.field_Jb - QueuedListRequest.field_g + 200);
            DialogMessagePane.field_M = (double)StatefulWidgetPainter.field_u;
          } else {
            var2_double = (double)(StatefulWidgetPainter.field_u - (Rasterizer.field_e >> 1)) / 512.0;
            var4 = (double)(-QueuedListRequest.field_g + IconTextComponent.field_Jb) / 512.0;
            var6 = -HotspotTextWidget.field_K[2] / (HotspotTextWidget.field_K[11] + (HotspotTextWidget.field_K[5] * var2_double + var4 * HotspotTextWidget.field_K[8]));
            DialogMessagePane.field_M = 4.0 * ((var2_double * HotspotTextWidget.field_K[3] + var4 * HotspotTextWidget.field_K[6] + HotspotTextWidget.field_K[9]) * var6 + HotspotTextWidget.field_K[0]);
            PendingSubmission.field_k = (double)(-(Rasterizer.field_f >> 1) + 440) + (HotspotTextWidget.field_K[1] + (HotspotTextWidget.field_K[10] + (var2_double * HotspotTextWidget.field_K[4] + HotspotTextWidget.field_K[7] * var4)) * var6) * 4.0;
            if (0.0 > HotspotTextWidget.field_K[11]) {
              DialogMessagePane.field_M = 320.0 - DialogMessagePane.field_M;
            } else {
              DialogMessagePane.field_M = 320.0 + DialogMessagePane.field_M;
            }
            if (ClientEnvironmentHelpers.field_c.field_J > IconTextComponent.field_Jb) {
              if ((NodeHashTableIterator.field_e == 2 ||
                ResizableDialog.field_Y[81]) &&
                (DialogMessagePane.field_F != -1 &&
                StatefulWidgetPainter.field_u != -1)) {
                DirectByteStorage.updateCameraOrbit(0.0f, false, 0.004999999888241291f * (float)(-DialogMessagePane.field_F + StatefulWidgetPainter.field_u));
              }
              if (BoundedUrlRequest.field_b != 0) {
                DirectByteStorage.updateCameraOrbit((float)(24 * BoundedUrlRequest.field_b), false, 0.0f);
              }
            }
          }
          if (DropTargetWidget.field_I == null) {
            stackIn_62_0 = MusicPlaybackHelpers.field_b;
          } else {
            stackIn_62_0 = DropTargetWidget.field_I;
          }
          var2 = stackIn_62_0;
          if (var2 != null) {
            stackIn_66_0 = var2;
            stackIn_67_1 = (-1 != MidiPcmStream.field_y) ? false : true;
            stackIn_69_2 = PendingSubmission.field_k;
            stackIn_70_3 = (!(HotspotTextWidget.field_K[11] < 0.0)) ? false : true;
            ((GameSession) (Object) stackIn_66_0).handlePointerInput(stackIn_67_1, stackIn_69_2, stackIn_70_3, NodeHashTableIterator.field_e, DialogMessagePane.field_M, MenuScreen.field_g, var1 != 0, (byte) -64);
          }
          if (BirthDateEntryPanel.isMenuScreenId(MidiPcmStream.field_y, 1)) {
            DateOfBirthValidator.field_j[MidiPcmStream.field_y].handlePointer(var1 != 0, PendingSubmission.field_k, DialogMessagePane.field_M, MenuScreen.field_g, -3666, MenuScreen.field_g);
          }
          if (ValidationIndicator.field_J &&
            WidgetNode.field_p.field_h &&
            DialogMessagePane.field_F != -1 &&
            StatefulWidgetPainter.field_u != -1 &&
            IconTextComponent.field_Jb != -1) {
            var3 = Math.abs(StatefulWidgetPainter.field_u - DialogMessagePane.field_F) + Math.abs(-TextHotspot.field_h + IconTextComponent.field_Jb);
            var4Lifetime1 = DialogMessagePane.field_M;
            var6Lifetime1 = PendingSubmission.field_k;
            if (110.0 < var4Lifetime1 &&
              var4Lifetime1 < 530.0 &&
              var6Lifetime1 > 0.0 &&
              var6Lifetime1 < 400.0) {
              ImageProducerRasterBuffer.field_n.addFirst(new MouseTrailPoint((int)(16.0 * var4Lifetime1), (int)(var6Lifetime1 * 16.0), Math.min(WidgetNode.field_p.field_c, WidgetNode.field_p.field_i * var3 + WidgetNode.field_p.field_a)), (byte) -38);
            }
          }
          if (Bzip2State.hasFeatureBit((byte) 13, 0) &&
            AchievementNotice.field_h > 0 &&
            MenuScreen.field_g == 1 &&
            StatefulWidgetPainter.field_u > ModelMesh.field_k &&
            StatefulWidgetPainter.field_u < ModelMesh.field_I &&
            ModelMesh.field_B < IconTextComponent.field_Jb &&
            IconTextComponent.field_Jb < ModelMesh.field_p &&
            (SocketConnector.field_c & 512) == 0) {
            EmailDomainValidationHelpers.sendActionRequest(-64);
          }
          TextHotspot.field_h = IconTextComponent.field_Jb;
          DialogMessagePane.field_F = StatefulWidgetPainter.field_u;
          return;
        }
    }

    final static void drawFlatTriangle(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, byte param8) {
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var18Lifetime2;
        var20 = Virogrid.field_F ? 1 : 0;
        try {
          if (param4 >= 0 &&
            param0 < TriangleRasterizer.field_n) {
            if (param1 < 0 &&
              0 > param5 &&
              param7 < 0) {
              return;
            }
            if (param1 >= TriangleRasterizer.field_o &&
              param5 >= TriangleRasterizer.field_o &&
              param7 >= TriangleRasterizer.field_o) {
              return;
            }
            var10 = 31 / ((0 - param8) / 32);
            var15 = -param0 + param4;
            if (param2 == param0) {
              if (param4 != param0) {
                var16 = param4 - param2;
                if (param1 >= param5) {
                  var9_int = param5 << 16;
                  var11 = param1 << 16;
                  var13 = (param7 - param1 << 16) / var15;
                  var12 = (-param5 + param7 << 16) / var16;
                } else {
                  var13 = (-param5 + param7 << 16) / var16;
                  var9_int = param1 << 16;
                  var11 = param5 << 16;
                  var12 = (param7 - param1 << 16) / var15;
                }
              } else {
                var13 = 0;
                var9_int = param1 << 16;
                var12 = 0;
                var11 = param5 << 16;
              }
              if (param0 < 0) {
                param0 = Math.min(-param0, param2 - param0);
                var9_int = var9_int + param0 * var12;
                var11 = var11 + param0 * var13;
                param0 = 0;
              }
              var14 = 0;
            } else {
              var11 = param1 << 16;
              var9_int = param1 << 16;
              var16 = -param0 + param2;
              var13 = (param7 - param1 << 16) / var15;
              var12 = (param5 - param1 << 16) / var16;
              if (var13 <= var12) {
                var17 = var12;
                var12 = var13;
                var13 = var17;
                var14 = 1;
              } else {
                var14 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param0 < 0) {
                if (param2 < 0) {
                  param0 = param2 - param0;
                  var9_int = var9_int + param0 * var12;
                  var11 = var11 + var13 * param0;
                  param0 = param2;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param0 = -param0;
                  var11 = var11 + param0 * var13;
                  var9_int = var9_int + param0 * var12;
                  param0 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var17Lifetime2 = TriangleRasterizer.field_m[param0];
                while (param0 < param2) {
                  var18 = var9_int >> 16;
                  if (TriangleRasterizer.field_o > var18) {
                    var19 = -(var9_int >> 16) + (var11 >> 16);
                    if (var19 != 0) {
                      if (TriangleRasterizer.field_o <= var18 + var19) {
                        var19 = TriangleRasterizer.field_o + (-var18 - 1);
                      }
                      if (var18 >= 0) {
                        LobbyLayout.blendHalfSpan(var19, param3, var18 + var17Lifetime2, true, param6);
                      } else {
                        LobbyLayout.blendHalfSpan(var18 + var19, param3, var17Lifetime2, true, param6);
                      }
                    } else {
                      if (var18 >= 0 &&
                        TriangleRasterizer.field_o > var18) {
                        LobbyLayout.blendHalfSpan(var19, param3, var17Lifetime2 + var18, true, param6);
                      }
                    }
                  }
                  param0++;
                  if (param0 >= TriangleRasterizer.field_n) {
                    return;
                  }
                  var9_int = var9_int + var12;
                  var17Lifetime2 = var17Lifetime2 + Rasterizer.field_e;
                  var11 = var11 + var13;
                }
              }
              var17Lifetime3 = -param2 + param4;
              if (var17Lifetime3 != 0) {
                var18Lifetime2 = param7 << 16;
                if (var14 != 0) {
                  var11 = param5 << 16;
                } else {
                  var9_int = param5 << 16;
                }
                var13 = (-var11 + var18Lifetime2) / var17Lifetime3;
                var12 = (var18Lifetime2 - var9_int) / var17Lifetime3;
              } else {
                var12 = 0;
                var13 = 0;
              }
            }
            if (param0 < 0) {
              param0 = -param0;
              var11 = var11 + var13 * param0;
              var9_int = var9_int + param0 * var12;
              param0 = 0;
            }
            var16Lifetime1 = TriangleRasterizer.field_m[param0];
            while (param0 < param4) {
              var17Lifetime1 = var9_int >> 16;
              if (var17Lifetime1 < TriangleRasterizer.field_o) {
                var18Lifetime1 = (var11 >> 16) - (var9_int >> 16);
                if (var18Lifetime1 != 0) {
                  if (var18Lifetime1 + var17Lifetime1 >= TriangleRasterizer.field_o) {
                    var18Lifetime1 = TriangleRasterizer.field_o + (-var17Lifetime1 - 1);
                  }
                  if (var17Lifetime1 >= 0) {
                    LobbyLayout.blendHalfSpan(var18Lifetime1, param3, var16Lifetime1 + var17Lifetime1, true, param6);
                  } else {
                    LobbyLayout.blendHalfSpan(var17Lifetime1 + var18Lifetime1, param3, var16Lifetime1, true, param6);
                  }
                } else {
                  if (var17Lifetime1 >= 0 &&
                    var17Lifetime1 < TriangleRasterizer.field_o) {
                    LobbyLayout.blendHalfSpan(var18Lifetime1, param3, var16Lifetime1 + var17Lifetime1, true, param6);
                  }
                }
              }
              param0++;
              if (param0 >= TriangleRasterizer.field_n) {
                return;
              }
              var9_int = var9_int + var12;
              var16Lifetime1 = var16Lifetime1 + Rasterizer.field_e;
              var11 = var11 + var13;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_76_0 = var9;
          stackIn_76_1 = new StringBuilder().append("li.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    private final void applyDesiredSize(byte param0) {
        int var2;
        int var3;
        int var5;
        int var4;
        var5 = Virogrid.field_F ? 1 : 0;
        var2 = this.field_l;
        var3 = this.field_j;
        if (!this.isResizeAllowed(-1558)) {
          this.field_s = false;
          return;
        }
        if (this.field_a >= var3) {
          if (var3 < this.field_o) {
            var3 = this.field_o;
          }
        } else {
          var3 = this.field_a;
        }
        if (var2 > this.field_u) {
          var2 = this.field_u;
        } else {
          if (var2 < this.field_d) {
            var2 = this.field_d;
          }
        }
        if (0.0f < this.field_c) {
          var4 = (int)(0.5f + this.field_c * (float)var3);
          if (var4 > var2) {
            var3 = (int)((float)var2 / this.field_c);
          } else {
            if (var2 > var4) {
              var2 = var4;
            }
          }
        }
        if (var2 != FallingParticle.field_i ||
          var3 != SpriteWidget.field_B) {
          this.field_n.resize(var3, var2, (byte) 40);
        }
        if (param0 != 22) {
          this.field_e = 41;
        }
        if (this.field_l > 0) {
          UiWidget.field_s = (this.field_l - FallingParticle.field_i) / 2;
        }
    }

    final void restoreWindowedSize(byte param0) {
        this.field_n.resize(this.field_v, this.field_g, (byte) 47);
        if (param0 != -122) {
          int[] var3 = (int[]) null;
          ViewportController.drawFlatTriangle(16, 40, -84, (int[]) null, -112, -39, -22, 49, (byte) -74);
        }
    }

    private ViewportController() throws Throwable {
        throw new Error();
    }

    static {
        field_f = new char[]{(char)91, (char)93, (char)35};
        field_m = false;
        field_b = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
