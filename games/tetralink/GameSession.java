/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GameSession {
    private int field_r;
    private int field_k;
    GameBoard field_a;
    private boolean field_n;
    boolean field_c;
    int field_p;
    BoardAnimator field_g;
    int field_i;
    private int field_f;
    static String field_o;
    static UiComponent field_q;
    int field_d;
    private int field_j;
    static String field_h;
    static String field_e;
    int field_m;
    private int field_l;
    boolean field_b;

    private final void drawPieceLayer(boolean param0, int param1, Sprite param2) {
        int stackIn_11_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        Sprite stackIn_72_0 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11_int = 0;
        Sprite var11 = null;
        int var12 = 0;
        int var13 = 0;
        Object var9Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var10Lifetime1;
        int var11_intLifetime1;
        var12 = TetraLink.field_J;
        try {
          RasterTargetHelpers.setSpriteRasterTarget(param2, 6);
          SoftwareRasterizer.fillRectangle(100, 0, 10, 400, 0);
          SoftwareRasterizer.fillRectangle(530, 0, 10, 400, 0);
          SoftwareRasterizer.fillRectangle(110, 0, 420, 400, 191);
          if (param1 != 651) {
            return;
          }
          if (PendingStatQuery.hasFeatureBit(0, (byte) 109)) {
            for (var4_int = 0; var4_int < 7; var4_int++) {
              var6 = 1 << var4_int;
              var13 = 0;
              var5 = var13;
              while (var13 < 6) {
                if (param0) {
                  stackIn_39_0 = 140 + var4_int * 60;
                } else {
                  stackIn_39_0 = 500 - 60 * var4_int;
                }
                var7 = stackIn_39_0;
                var8 = -(var13 * 60) + 370;
                var9 = null;
                if (0 != (var6 & this.field_g.field_e[var13])) {
                  var9 = RasterStackHelpers.field_e;
                } else {
                  if (0 != (this.field_g.field_k[var13] & var6)) {
                    var9 = DialWidget.field_X;
                  }
                }
                if (var9 != null) {
                  var10 = 256;
                  if (this.field_g.field_f != null &&
                    0 != (this.field_g.field_f[var13] & var6)) {
                    var11_int = this.field_j % 20;
                    if (10 >= var11_int) {
                      stackIn_51_0 = var11_int - 5;
                    } else {
                      stackIn_51_0 = -var11_int + 15;
                    }
                    var11_intLifetime1 = stackIn_51_0;
                    var10 = 128 + var11_intLifetime1 * 20;
                  }
                  if (var10 == 256) {
                    ((Sprite) (var9)).drawTransparent(-28 + var7, -28 + var8);
                  } else {
                    ((Sprite) (var9)).drawWithOpacity(var7 - 28, -28 + var8, var10);
                  }
                }
                var13++;
              }
            }
          } else {
            for (var4_int = 0; var4_int < 7; var4_int++) {
              var6 = 1 << var4_int;
              for (var5 = 0; var5 < 6; var5++) {
                var8 = -(60 * var5) + 370;
                if (param0) {
                  stackIn_11_0 = 140 + 60 * var4_int;
                } else {
                  stackIn_11_0 = 500 - var4_int * 60;
                }
                var7 = stackIn_11_0;
                var9_int = 0;
                if ((this.field_g.field_e[var5] & var6) != 0) {
                  var9_int -= 128;
                } else {
                  if ((var6 & this.field_g.field_k[var5]) != 0) {
                    var9_int += 128;
                  }
                }
                if (null != this.field_g.field_f &&
                  (this.field_g.field_f[var5] & var6) != 0) {
                  var10 = this.field_j % 20;
                  if (10 >= var10) {
                    stackIn_22_0 = -5 + var10;
                  } else {
                    stackIn_22_0 = 5 - var10;
                  }
                  var10 = stackIn_22_0;
                  var9_int = var9_int + 10 * var10;
                }
                if (var9_int >= -191) {
                  if (var9_int >= 0) {
                    if (var9_int > 255) {
                      stackIn_30_0 = 16777215;
                    } else {
                      stackIn_30_0 = (var9_int * 40 >> 8) + 191 | var9_int * 65792;
                    }
                  } else {
                    stackIn_30_0 = -(65535 * var9_int) + 191;
                  }
                } else {
                  stackIn_30_0 = 12517376;
                }
                var10 = stackIn_30_0;
                SoftwareRasterizer.fillCircle(var7, var8, 28, var10);
              }
            }
          }
          var9Lifetime1 = (PieceDropAnimation) (this.field_g.field_g.first(false));
          while (var9Lifetime1 != null) {
            var8Lifetime1 = -(60 * ((PieceDropAnimation) (var9Lifetime1)).field_n) + 370;
            if (!param0) {
              stackIn_62_0 = -(60 * ((PieceDropAnimation) (var9Lifetime1)).field_u) + 500;
            } else {
              stackIn_62_0 = 140 + ((PieceDropAnimation) (var9Lifetime1)).field_u * 60;
            }
            var7Lifetime1 = stackIn_62_0;
            stackIn_65_0 = (!((PieceDropAnimation) (var9Lifetime1)).field_x) ? 16777215 : 12517376;
            var10Lifetime1 = stackIn_65_0;
            if (((PieceDropAnimation) (var9Lifetime1)).field_q == 0) {
              SoftwareRasterizer.drawLine(var7Lifetime1, 0, var7Lifetime1, ((PieceDropAnimation) (var9Lifetime1)).field_y, var10Lifetime1);
            } else {
              if (((PieceDropAnimation) (var9Lifetime1)).field_q != 1) {
                SoftwareRasterizer.fillRectangle(-(((PieceDropAnimation) (var9Lifetime1)).field_s >> 1) + var7Lifetime1, 0, ((PieceDropAnimation) (var9Lifetime1)).field_s, ((PieceDropAnimation) (var9Lifetime1)).field_y, var10Lifetime1);
                SoftwareRasterizer.fillCircle(var7Lifetime1, ((PieceDropAnimation) (var9Lifetime1)).field_y, ((PieceDropAnimation) (var9Lifetime1)).field_s >> 1, var10Lifetime1);
                if (!PendingStatQuery.hasFeatureBit(0, (byte) 119)) {
                  SoftwareRasterizer.fillCircle(var7Lifetime1, var8Lifetime1, 28, var10Lifetime1);
                } else {
                  if (!((PieceDropAnimation) (var9Lifetime1)).field_x) {
                    stackIn_72_0 = DialWidget.field_X;
                  } else {
                    stackIn_72_0 = RasterStackHelpers.field_e;
                  }
                  var11 = stackIn_72_0;
                  var11.drawTransparent(-28 + var7Lifetime1, -28 + var8Lifetime1);
                }
              } else {
                SoftwareRasterizer.fillRectangle(var7Lifetime1 - (((PieceDropAnimation) (var9Lifetime1)).field_s >> 1), 0, ((PieceDropAnimation) (var9Lifetime1)).field_s, var8Lifetime1, var10Lifetime1);
                SoftwareRasterizer.fillCircle(var7Lifetime1, var8Lifetime1, ((PieceDropAnimation) (var9Lifetime1)).field_s, var10Lifetime1);
              }
            }
            var9Lifetime1 = (PieceDropAnimation) (this.field_g.field_g.next((byte) -70));
          }
          HuffmanCodec.popRasterTarget(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_80_0 = var4;
          stackIn_80_1 = new StringBuilder().append("ei.S(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    final void drawGameOverlay(int param0, boolean param1) {
        int stackIn_73_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_82_0 = 0;
        int var3;
        String var3_ref_String;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        String var12;
        int[] var15;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var6Lifetime3;
        int var9Lifetime1Lifetime1;
        var10 = TetraLink.field_J;
        if (0 != this.field_a.field_b) {
          if (this.field_a.field_b != 1) {
            var15 = new int[4];
            SoftwareRasterizer.saveClip(var15);
            SoftwareRasterizer.setClip(0, 0, 28, 57);
            IndexedSpriteHelpers.field_f.drawTransparent(0, 0);
            SoftwareRasterizer.setClip(28, 0, 57, 57);
            AccountCreationForm.field_M.drawTransparent(0, 0);
            SoftwareRasterizer.restoreClip(var15);
          } else {
            AccountCreationForm.field_M.drawTransparent(0, 0);
          }
        } else {
          IndexedSpriteHelpers.field_f.drawTransparent(0, 0);
        }
        if (!this.field_a.field_l) {
          var12 = Integer.toString((49 + this.field_d) / 50);
          SocialTabsPanel.field_b.drawCentered(var12, 30, SocialTabsPanel.field_b.field_N + 54 >> 1, 16777215, -1);
        } else {
          if (-1 != this.field_a.field_b) {
            GzipDecompressor.field_g.drawCentered(NetworkGameClient.field_A, 30, 57 + GzipDecompressor.field_g.field_N >> 1, 16777215, -1);
          } else {
            GzipDecompressor.field_g.drawCentered(MarkerSliderPainter.field_i, 30, 57 + GzipDecompressor.field_g.field_N >> 1, 16777215, -1);
          }
        }
        var3 = 0;
        if (param0 != -9104) {
          field_h = (String) null;
        }
        while (var3 < 4) {
          boolean decompiledFrameRemainder0 = true;
          var4 = 4210752;
          if ((var3 == this.field_f ||
            this.field_r == var3) &&
            (decompiledFrameRemainder0 = (BackgroundSparkle.field_t == -1))) {
            if (this.field_l == var3) {
              var4 = 128;
            }
            if (LruTextureCache.field_e % 40 < 20 &&
              this.field_a.field_l) {
              var4 = 8421504 | 8355711 & var4 >> 1;
            }
          }
          if ((decompiledFrameRemainder0) && (null != UiWidget.field_p[var3] ||
            null != UiWidget.field_n[var3])) {
            var5 = 128;
            if (UiWidget.field_p[var3] == null) {
              var5 = UiWidget.field_z[var3] / 2;
            }
            if (null == UiWidget.field_n[var3]) {
              var5 = (-UiWidget.field_z[var3] + 256) / 2;
            }
            for (var6 = 20 * var3; -2 + 20 * (1 + var3) > var6; var6++) {
              SoftwareRasterizer.drawHorizontalLineAlpha(640 - ((int)FontAndBrightnessHelpers.field_c - var6 / 2), var6, -(var6 / 2) + (int)FontAndBrightnessHelpers.field_c, var4, var5);
              SoftwareRasterizer.drawHorizontalLineAlpha(-(int)FontAndBrightnessHelpers.field_c + 638 + var6 / 2, var6, 2, 16777215, var5);
            }
            for (var6Lifetime3 = (1 + var3) * 20 - 2; 20 + var3 * 20 > var6Lifetime3; var6Lifetime3++) {
              SoftwareRasterizer.drawHorizontalLineAlpha(var6Lifetime3 / 2 + (-(int)FontAndBrightnessHelpers.field_c + 638), var6Lifetime3, 2 + (int)FontAndBrightnessHelpers.field_c - var6Lifetime3 / 2, 16777215, var5);
            }
            if (0 == UiWidget.field_z[var3]) {
              GzipDecompressor.field_g.drawLeft(UiWidget.field_p[var3], -(int)FontAndBrightnessHelpers.field_c + 651 + var3 * 10, -2 + (20 * var3 + 20) - 3, 16777215, -1);
            } else {
              GzipDecompressor.field_g.drawLeftAlpha(UiWidget.field_p[var3], -(int)FontAndBrightnessHelpers.field_c + 651 + var3 * 10, -3 + var3 * 20 + 18, 16777215, -1, 256 - UiWidget.field_z[var3]);
              GzipDecompressor.field_g.drawLeftAlpha(UiWidget.field_n[var3], -(int)FontAndBrightnessHelpers.field_c + (651 + var3 * 10), 17 + var3 * 20 - 2, 16777215, -1, UiWidget.field_z[var3]);
            }
          }
          var3++;
        }
        if (this.field_a.field_l &&
          BackgroundSparkle.field_t == -1 &&
          DraggableWidget.field_O == -1) {
          if (this.field_a.field_b != -1) {
            if (this.field_b &&
              this.field_i == this.field_a.field_b) {
              var3_ref_String = IntrusiveNode.field_g;
            } else {
              var3_ref_String = SectorCacheStore.formatTemplate(new String[]{this.field_a.field_o[this.field_a.field_b]}, TextLayoutLine.field_b, param0 + 9223);
            }
          } else {
            var3_ref_String = IntKeyLookup.field_e;
          }
          var4Lifetime1 = SocialTabsPanel.field_b.textWidth(var3_ref_String) / 2;
          var4Lifetime1 += 20;
          var5Lifetime1 = SpriteState.field_G;
          var6Lifetime1 = RegistrationResponseHelpers.field_a;
          var7 = (int)(24.0 * (Math.cos((double)((float)LruTextureCache.field_e / 20.0f)) + 1.0));
          for (var8 = 0; 9 > var8; var8++) {
            var9 = (-var8 + 9) * var7 >>> 3;
            SoftwareRasterizer.fillRectangleAlpha(-var9 + (var5Lifetime1 - var4Lifetime1), -var9 + (var6Lifetime1 - 36), var4Lifetime1 + var9 << 1, 36 + var9 << 1, 64, 16);
            SoftwareRasterizer.drawRoundedRectangle(-var4Lifetime1 + (var5Lifetime1 - var9), var6Lifetime1 - 36 - var9, var9 + var4Lifetime1 << 1, var9 + 36 << 1, 3, 8421631);
          }
          SocialTabsPanel.field_b.drawCentered(var3_ref_String, var5Lifetime1, SocialTabsPanel.field_b.field_N / 2 + var6Lifetime1 - 2, 16777215, -1);
        }
        if (this.field_b) {
          var3Lifetime1 = GzipDecompressor.field_g.textWidth(CanvasAndErrorHelpers.field_i) + 6 + 2;
          ClientException.field_g = ClientException.field_g + (-ClientException.field_g + (float)var3Lifetime1) * 0.10000000149011612f;
          if (this.field_l == -2 &&
            param1) {
            stackIn_73_0 = 1;
          } else {
            if (DateOfBirthPanel.field_R > 0) {
              stackIn_73_0 = (20 > LruTextureCache.field_e % 40) ? 1 : 0;
            } else {
              stackIn_73_0 = 0;
            }
          }
          var4Lifetime2 = stackIn_73_0;
          stackIn_76_0 = (var4Lifetime2 != 0) ? 128 : 4210752;
          var5Lifetime2 = stackIn_76_0;
          stackIn_79_0 = (DateOfBirthPanel.field_R > 0) ? 16776960 : 16777215;
          var6Lifetime2 = stackIn_79_0;
          stackIn_82_0 = (DateOfBirthPanel.field_R > 0) ? 256 : 128;
          var7Lifetime1 = stackIn_82_0;
          var8Lifetime1 = 2 + IsaacCipher.field_a.field_z - 20;
          for (var9Lifetime1 = 0; 18 > var9Lifetime1; var9Lifetime1++) {
            SoftwareRasterizer.drawHorizontalLineAlpha(0, var8Lifetime1 + var9Lifetime1, (int)ClientException.field_g + var9Lifetime1 / 2, var5Lifetime2, 128);
            SoftwareRasterizer.drawHorizontalLineAlpha((int)ClientException.field_g + var9Lifetime1 / 2, var8Lifetime1 + var9Lifetime1, 2, 16777215, 128);
          }
          for (var9Lifetime1Lifetime1 = 0; var9Lifetime1Lifetime1 < 2; var9Lifetime1Lifetime1++) {
            SoftwareRasterizer.drawHorizontalLineAlpha(0, -var9Lifetime1Lifetime1 + (-1 + var8Lifetime1), -(var9Lifetime1Lifetime1 / 2) + ((int)ClientException.field_g + 1), 16777215, 128);
          }
          GzipDecompressor.field_g.drawRightAlpha(CanvasAndErrorHelpers.field_i, -2 + ((int)ClientException.field_g - 1), IsaacCipher.field_a.field_z - 2, var6Lifetime2, -1, var7Lifetime1);
        }
    }

    public static void releaseStatics(boolean param0) {
        field_e = null;
        field_o = null;
        field_q = null;
        if (param0) {
          field_o = (String) null;
        }
        field_h = null;
    }

    final void renderBoardTexture(boolean param0, Sprite param1, boolean param2) {
        try {
          this.drawBoardTexture(param0, param1, (byte) -104);
          if (param2) {
            this.restartGame(69);
          }
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ei.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void renderBoardLayers(int param0, Sprite param1, Sprite param2, boolean param3) {
        try {
          this.drawPieceLayer(param3, 651, param2);
          if (param0 != 2509) {
            this.field_m = -104;
          }
          this.drawHighlightLayer(param3, param1, (byte) 57);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ei.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void handlePointerInput(double param0, boolean param1, double param2, boolean param3, byte param4, boolean param5, int param6, int param7) {
        boolean stackIn_27_0 = false;
        int stackIn_51_0 = 0;
        int stackIn_55_0 = 0;
        int var11;
        int var12;
        int var13;
        java.applet.Applet var14;
        int var11Lifetime1;
        int var12Lifetime1;
        var13 = TetraLink.field_J;
        if (!param5 &&
          IsaacCipher.field_a.field_z >= ClientProtocolStage.field_a) {
          if (NameAvailabilityValidator.field_t == 0) {
            if (param3) {
              this.field_l = ClientProtocolStage.field_a / 18;
              if (638 - ((int)FontAndBrightnessHelpers.field_c - ClientProtocolStage.field_a / 2) > ContextMenu.field_Nb) {
                this.field_l = -1;
              }
            }
            if (this.field_b &&
              ClientProtocolStage.field_a != -1) {
              var11 = -IsaacCipher.field_a.field_z + (ClientProtocolStage.field_a + 16);
              if (var11 > 0 &&
                var11 <= 16 &&
                (float)ContextMenu.field_Nb < ClientException.field_g) {
                this.field_l = -2;
              }
            }
          } else {
            if (param3) {
              this.field_l = WhirlpoolHasher.field_o / 18;
              if (PasswordFieldPainter.field_B < WhirlpoolHasher.field_o / 2 + 638 - (int)FontAndBrightnessHelpers.field_c) {
                this.field_l = -1;
              }
            } else {
              this.field_l = -1;
            }
            if (this.field_b) {
              var11 = -IsaacCipher.field_a.field_z + WhirlpoolHasher.field_o + 16;
              if (0 < var11 &&
                var11 <= 16 &&
                (float)PasswordFieldPainter.field_B < ClientException.field_g) {
                this.field_l = -2;
              }
            }
            if (this.field_l != -1) {
              if (this.field_f != this.field_l) {
                if (this.field_r != this.field_l) {
                  if (-2 == this.field_l) {
                    stackIn_27_0 = !(AnimationSequence.field_e);
                    AnimationSequence.field_e = stackIn_27_0;
                    if (stackIn_27_0) {
                      DateOfBirthPanel.field_R = 0;
                    }
                  }
                } else {
                  if (!this.field_b) {
                    SocialListPacketHandler.handleMenuAction(true, 9, false);
                  } else {
                    SocialListPacketHandler.handleMenuAction(true, 12, false);
                  }
                }
              } else {
                if (!this.field_a.field_l) {
                  this.sendDrawOffer(0);
                } else {
                  this.restartGame(-1);
                }
              }
            }
          }
          if (param4 != -115) {
            var14 = (java.applet.Applet) null;
            GameSession.setTuhstatbutCookie((java.applet.Applet) null, 103);
          }
          if (-1 == this.field_l &&
            param3 &&
            !this.field_a.field_l &&
            param2 >= 110.0 &&
            param2 < 530.0 &&
            0.0 <= param0 &&
            param0 < 400.0) {
            if (param1) {
              stackIn_51_0 = (-110 + (int)param2) / 60;
            } else {
              stackIn_51_0 = (-(int)param2 + 530) / 60;
            }
            var11Lifetime1 = stackIn_51_0;
            if (param7 != 1) {
              stackIn_55_0 = (this.field_g.field_l == var11Lifetime1) ? 0 : 1;
              var12 = stackIn_55_0;
              this.field_g.setHoverColumn(var11Lifetime1, (byte) -96);
              if (var12 != 0 &&
                this.field_g.field_l != -1) {
                DateOfBirthPanel.playSample(CachedArchiveSource.field_A, 573509761);
                return;
              }
              return;
            }
            var12Lifetime1 = this.field_a.findDropRow(var11Lifetime1, (byte) 101);
            if (!this.field_a.isValidMove(var12Lifetime1, var11Lifetime1, -123)) {
              DateOfBirthPanel.playSample(StartupFlagsHelpers.field_c, param4 + 573509876);
              return;
            }
            if (!this.field_b) {
              this.applyMove(var11Lifetime1, param4 ^ 15667, var12Lifetime1);
              this.field_n = false;
              return;
            }
            if (this.field_i != this.field_a.field_b) {
              return;
            }
            this.sendMoveRequest(var11Lifetime1, var12Lifetime1, true);
            this.field_n = false;
            return;
          }
          this.field_g.field_l = -1;
          return;
        }
        this.field_g.field_l = -1;
        this.field_l = -1;
    }

    final static void appendChatHistory(int param0, ChatMessage param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = TetraLink.field_J;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            LoginProgressHelpers.field_c[var2_int] = 0;
          }
          if (param0 != -2792) {
            return;
          }
          for (var2_intLifetime1 = 0; StatusRequestHelpers.field_d > var2_intLifetime1; var2_intLifetime1++) {
            if (NameSuggestionsPanel.field_L[var2_intLifetime1].field_i == param1.field_i) {
              dupTemp$3 = NameSuggestionsPanel.field_L[var2_intLifetime1].getFilterPriority((byte) -63);
              LoginProgressHelpers.field_c[dupTemp$3] = LoginProgressHelpers.field_c[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param1.getFilterPriority((byte) -63);
          LoginProgressHelpers.field_c[dupTemp$0] = LoginProgressHelpers.field_c[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; StatusRequestHelpers.field_d > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (NameSuggestionsPanel.field_L[var3].field_i == param1.field_i) {
              var4 = NameSuggestionsPanel.field_L[var3].getFilterPriority((byte) -63);
              if (HuffmanCodec.field_a < LoginProgressHelpers.field_c[var4]) {
                LoginProgressHelpers.field_c[var4] = LoginProgressHelpers.field_c[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              NameSuggestionsPanel.field_L[incrementValue$2] = NameSuggestionsPanel.field_L[var3];
            }
          }
          StatusRequestHelpers.field_d = var2_intLifetime2;
          fieldTemp$1 = StatusRequestHelpers.field_d;
          StatusRequestHelpers.field_d = StatusRequestHelpers.field_d + 1;
          NameSuggestionsPanel.field_L[fieldTemp$1] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("ei.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final void updateStatusTexts(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int dupTemp$4 = 0;
        int fieldTemp$3 = 0;
        String stackIn_6_0 = null;
        String[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        String[] stackIn_50_2 = null;
        String stackIn_51_3;
        String[] stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        String stackIn_79_2 = null;
        String[] stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        String stackIn_90_2 = null;
        String[] stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        String stackIn_94_2 = null;
        String[] stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        String stackIn_98_2 = null;
        String var2_ref_String;
        int var2;
        String var3_ref_String;
        int var3;
        int var4;
        int var2Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        var4 = TetraLink.field_J;
        if (this.field_a.field_l) {
          if (0 <= this.field_a.field_b) {
            if (this.field_b &&
              this.field_i == this.field_a.field_b) {
              GameOptionControls.field_e = IntrusiveNode.field_g;
            } else {
              GameOptionControls.field_e = SectorCacheStore.formatTemplate(new String[]{this.field_a.field_o[this.field_a.field_b]}, TextLayoutLine.field_b, 120);
            }
          } else {
            GameOptionControls.field_e = IntKeyLookup.field_e;
          }
        } else {
          if (this.field_a.field_b < 0) {
            GameOptionControls.field_e = "";
          } else {
            var2_ref_String = Integer.toString((-1 + (50 + this.field_d)) / 50);
            if (!this.field_b) {
              GameOptionControls.field_e = SectorCacheStore.formatTemplate(new String[]{this.field_a.field_o[this.field_a.field_b], var2_ref_String}, NanoTickClock.field_o, 119);
            } else {
              if (this.field_a.field_b == 0) {
                stackIn_6_0 = PacketBuffer.field_s;
              } else {
                stackIn_6_0 = NotificationToast.field_t;
              }
              var3_ref_String = stackIn_6_0;
              if (this.field_i != this.field_a.field_b) {
                GameOptionControls.field_e = SectorCacheStore.formatTemplate(new String[]{var3_ref_String, var2_ref_String, this.field_a.field_o[this.field_a.field_b]}, FadingModalPanel.field_M, 123);
              } else {
                GameOptionControls.field_e = SectorCacheStore.formatTemplate(new String[]{var3_ref_String, var2_ref_String}, NineSliceFrameHelpers.field_e, param0 ^ -102);
              }
            }
          }
        }
        if (GameOptionControls.field_e == null) {
          if (null == NameEntryPopup.field_Kb) {
          }
          FaceNormal.field_b = 0;
        } else {
          if (!GameOptionControls.field_e.equals(NameEntryPopup.field_Kb)) {
            fieldTemp$0 = FaceNormal.field_b + 8;
            FaceNormal.field_b = FaceNormal.field_b + 8;
            if (fieldTemp$0 >= 256) {
              NameEntryPopup.field_Kb = GameOptionControls.field_e;
              FaceNormal.field_b = 0;
            }
          } else {
            FaceNormal.field_b = 0;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        GzipDecompressor.field_g.textWidth(GameOptionControls.field_e);
        if (this.field_n && (!this.field_b ||
          this.field_i == this.field_a.field_b)) {
          fieldTemp$1 = this.field_k + 1;
          this.field_k = this.field_k + 1;
          if (!(fieldTemp$1 <= 28)) {
            this.field_k = 28;
          }
          decompiledFrameRemainder0 = false;
        }
        else {
          fieldTemp$2 = this.field_k - 1;
          this.field_k = this.field_k - 1;
          if (fieldTemp$2 < 0) {
            this.field_k = 0;
          }
        }
        if (this.field_b) {
          for (var2 = 0; var2 < 2; var2++) {
            if (~this.field_i == ~var2) {
              if ((1 << var2 & this.field_a.field_j) == 0) {
                if (!this.field_a.field_l &&
                  (1 << var2 & this.field_a.field_h) != 0) {
                  UiWidget.field_n[var2] = TextLayoutLine.field_g;
                } else {
                  if ((1 << var2 & this.field_a.field_n) != 0) {
                    stackIn_78_0 = UiWidget.field_n;
                    stackIn_78_1 = var2;
                    if (this.field_c) {
                      stackIn_79_2 = IndexedSpriteState.field_i;
                    } else {
                      stackIn_79_2 = Renderable.field_c;
                    }
                    stackIn_78_0[stackIn_78_1] = stackIn_79_2;
                  } else {
                    UiWidget.field_n[var2] = null;
                  }
                }
              } else {
                if (0 == (this.field_a.field_n & 1 << var2)) {
                  UiWidget.field_n[var2] = SpriteCheckboxPainter.field_b;
                } else {
                  UiWidget.field_n[var2] = StrongCacheEntry.field_H;
                }
              }
            } else {
              var3_ref_String = this.field_a.field_o[var2];
              if (0 != (this.field_a.field_j & 1 << var2)) {
                if ((this.field_m & 1 << var2) == 0) {
                  if ((this.field_a.field_n & 1 << var2) == 0) {
                    UiWidget.field_n[var2] = SectorCacheStore.formatTemplate(new String[]{var3_ref_String}, ArrayWidgetContainer.field_M, 120);
                  } else {
                    UiWidget.field_n[var2] = SectorCacheStore.formatTemplate(new String[]{var3_ref_String}, WidgetStyleLayer.field_d, 123);
                  }
                } else {
                  UiWidget.field_n[var2] = SectorCacheStore.formatTemplate(new String[]{var3_ref_String}, NameSeparatorHelpers.field_f, param0 + 153);
                }
              } else {
                if ((this.field_m & 1 << var2) != 0) {
                  UiWidget.field_n[var2] = SectorCacheStore.formatTemplate(new String[]{var3_ref_String}, InputDetachHelpers.field_d, 119);
                } else {
                  if (!this.field_a.field_l &&
                    (this.field_a.field_h & 1 << var2) != 0) {
                    UiWidget.field_n[var2] = SectorCacheStore.formatTemplate(new String[]{var3_ref_String}, BitPacketBuffer.field_v, 125);
                  } else {
                    if ((this.field_a.field_n & 1 << var2) != 0) {
                      stackIn_50_0 = UiWidget.field_n;
                      stackIn_50_1 = var2;
                      stackIn_50_2 = new String[]{var3_ref_String};
                      if (this.field_c) {
                        stackIn_51_3 = DisplayNameForm.field_P;
                      } else {
                        stackIn_51_3 = PatchNoteUsage.field_o;
                      }
                      stackIn_50_0[stackIn_50_1] = SectorCacheStore.formatTemplate(stackIn_50_2, stackIn_51_3, 122);
                    } else {
                      UiWidget.field_n[var2] = null;
                    }
                  }
                }
              }
            }
          }
          if (this.field_i == -2) {
            this.field_r = 3;
            UiWidget.field_n[3] = DraggableWidget.field_P;
            UiWidget.field_n[2] = null;
            this.field_f = -1;
          } else if (!this.field_a.field_l) {
            this.field_f = 2;
            this.field_r = -1;
            if ((1 << this.field_i & this.field_a.field_h) == 0) {
              if (this.field_a.field_h == 0) {
                UiWidget.field_n[2] = null;
                this.field_f = -1;
              } else {
                UiWidget.field_n[2] = StripedProgressBar.field_O;
              }
            } else {
              UiWidget.field_n[2] = GameRoomPanelHelpers.field_f;
            }
            UiWidget.field_p[3] = null;
          } else {
            this.field_f = 2;
            UiWidget.field_n[3] = DraggableWidget.field_P;
            this.field_r = 3;
            if (this.field_m != 0) {
              this.field_f = -1;
              UiWidget.field_n[2] = null;
            } else if ((1 << this.field_i & this.field_a.field_n) != 0) {
              stackIn_97_0 = UiWidget.field_n;
              stackIn_97_1 = 2;
              if (!this.field_c) {
                stackIn_98_2 = PendingReplyNode.field_s;
              } else {
                stackIn_98_2 = WidgetTheme.field_a;
              }
              stackIn_97_0[stackIn_97_1] = stackIn_98_2;
            } else if (0 != this.field_a.field_n) {
              stackIn_93_0 = UiWidget.field_n;
              stackIn_93_1 = 2;
              if (this.field_c) {
                stackIn_94_2 = FaceNormal.field_c;
              } else {
                stackIn_94_2 = DelayedIncomingPacket.field_q;
              }
              stackIn_93_0[stackIn_93_1] = stackIn_94_2;
            } else {
              stackIn_89_0 = UiWidget.field_n;
              stackIn_89_1 = 2;
              if (this.field_c) {
                stackIn_90_2 = EmailSyntaxValidator.field_r;
              } else {
                stackIn_90_2 = PieceDropAnimation.field_w;
              }
              stackIn_89_0[stackIn_89_1] = stackIn_90_2;
            }
          }
        } else {
          UiWidget.field_n[2] = null;
          UiWidget.field_n[3] = null;
          if (!this.field_a.field_l) {
            UiWidget.field_n[0] = null;
            UiWidget.field_n[1] = null;
          } else {
            UiWidget.field_n[1] = DraggableWidget.field_P;
            this.field_f = 0;
            this.field_r = 1;
            UiWidget.field_n[0] = ScreenDrawHelpers.field_a;
          }
        }
        var2Lifetime1 = 0;
        for (var3 = 0; var3 < 4; var3++) {
          if (null != UiWidget.field_n[var3]) {
            if (var3 != var2Lifetime1) {
              UiWidget.field_n[var2Lifetime1] = UiWidget.field_n[var3];
              if (var3 == this.field_f) {
                this.field_f = var2Lifetime1;
              }
              if (var3 == this.field_r) {
                this.field_r = var2Lifetime1;
              }
            }
            var2Lifetime1++;
          }
        }
        for (var3Lifetime1 = var2Lifetime1; var3Lifetime1 < 4; var3Lifetime1++) {
          UiWidget.field_n[var3Lifetime1] = null;
        }
        if (param0 != -27) {
          this.field_i = 126;
        }
        for (var3Lifetime2 = 0; var3Lifetime2 < 4; var3Lifetime2++) {
          regionExit1: {
            regionExit2: {
              if (UiWidget.field_n[var3Lifetime2] == null) {
                if (null == UiWidget.field_p[var3Lifetime2]) {
                  break regionExit2;
                }
              } else {
                if (UiWidget.field_n[var3Lifetime2].equals(UiWidget.field_p[var3Lifetime2])) {
                  break regionExit2;
                }
              }
              dupTemp$4 = UiWidget.field_z[var3Lifetime2] + 8;
              UiWidget.field_z[var3Lifetime2] = dupTemp$4;
              if (!(dupTemp$4 < 256)) {
                UiWidget.field_p[var3Lifetime2] = UiWidget.field_n[var3Lifetime2];
                UiWidget.field_z[var3Lifetime2] = 0;
              }
              break regionExit1;
            }
            UiWidget.field_z[var3Lifetime2] = 0;
          }
        }
        UiWidget.field_y = 0;
        for (var3Lifetime3 = 0; var3Lifetime3 < 4; var3Lifetime3++) {
          if (UiWidget.field_n[var3Lifetime3] != null) {
            UiWidget.field_v[var3Lifetime3] = GzipDecompressor.field_g.textWidth(UiWidget.field_n[var3Lifetime3]);
            if (10 * var3Lifetime3 + (UiWidget.field_v[var3Lifetime3] + 17) > UiWidget.field_y) {
              UiWidget.field_y = 17 + UiWidget.field_v[var3Lifetime3] + var3Lifetime3 * 10;
            }
          }
        }
        FontAndBrightnessHelpers.field_c = FontAndBrightnessHelpers.field_c + 0.10000000149011612f * (-FontAndBrightnessHelpers.field_c + (float)UiWidget.field_y);
        if (this.field_a.field_l) {
          fieldTemp$3 = this.field_p + 1;
          this.field_p = this.field_p + 1;
          if (fieldTemp$3 > 150) {
          }
        }
        CanvasAndErrorHelpers.field_i = StringPadHelpers.field_b;
        if (!AnimationSequence.field_e) {
          if (1 < DateOfBirthPanel.field_R) {
            CanvasAndErrorHelpers.field_i = SectorCacheStore.formatTemplate(new String[]{Integer.toString(DateOfBirthPanel.field_R)}, AgeValidator.field_q, param0 + 149);
          } else {
            if (DateOfBirthPanel.field_R == 1) {
              CanvasAndErrorHelpers.field_i = NineSliceFrame.field_c;
            } else {
              CanvasAndErrorHelpers.field_i = ChatMessage.field_d;
            }
          }
        }
    }

    final static String formatGmtDate(byte param0, long param1) {
        InsetTextPainter.field_t.setTime(new Date(param1));
        int var3 = InsetTextPainter.field_t.get(7);
        int var4 = InsetTextPainter.field_t.get(5);
        int var5 = InsetTextPainter.field_t.get(2);
        int var6 = InsetTextPainter.field_t.get(1);
        int var7 = InsetTextPainter.field_t.get(11);
        int var8 = InsetTextPainter.field_t.get(12);
        if (param0 != 2) {
          return (String) null;
        }
        int var9 = InsetTextPainter.field_t.get(13);
        return LoginCredentials.field_f[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + PasswordValidator.field_v[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final void exitToScreen(boolean param0, int param1, boolean param2, int param3) {
        if (param0 &&
          MenuScreen.field_g == 0) {
          WidgetTheme.field_s = NodeHashTable.field_h;
          WidgetStyleLayer.field_j = LoadingResourceHelpers.field_d;
        }
        if (param1 > -82) {
          field_q = (UiComponent) null;
        }
        RandomAccessCacheFile.resetCameraToTarget(-96, false);
        if (!WidgetTheme.field_i.field_n &&
          AccountWelcomePanel.isNonNegative(param3, (byte) 114)) {
          DelegatingCanvas.createGameOptions(true, -7869);
        }
        int var5 = param3;
        int var6 = param2 ? 1 : 0;
        ScreenSwitchHelpers.switchScreen(var5, -99, var6 != 0, 0);
    }

    final static void sendStatQueryRequest(byte param0, int param1) {
        BitPacketBuffer var2 = QuickChatHelpDialog.field_Lb;
        if (param0 <= 39) {
          field_h = (String) null;
        }
        var2.writeCipheredByte(param1, (byte) -92);
        var2.writeByte(1, false);
        var2.writeByte(2, false);
    }

    final void resign(boolean param0) {
        int var3;
        var3 = TetraLink.field_J;
        if (param0) {
          this.exitToMainMenu(false, false);
        }
        if (!this.field_b) {
          if (this.field_a.field_b == 0) {
            this.field_a.endGame(1, 4);
          } else {
            if (this.field_a.field_b == 1) {
              this.field_a.endGame(0, 4);
            }
          }
        } else {
          QuickChatHelpDialog.field_Lb.writeCipheredByte(60, (byte) -92);
        }
    }

    private final void drawBoardTexture(boolean param0, Sprite param1, byte param2) {
        int stackIn_16_0 = 0;
        Sprite stackIn_26_0 = null;
        Sprite stackIn_35_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_102_0 = 0;
        Sprite stackIn_109_0 = null;
        int stackIn_114_0 = 0;
        Sprite stackIn_117_0 = null;
        int stackIn_120_0 = 0;
        int stackIn_120_1 = 0;
        int stackIn_121_2 = 0;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        String stackIn_129_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        Object var10 = null;
        int var11 = 0;
        int var12 = 0;
        Sprite var12_ref_oh = null;
        Sprite var13 = null;
        int var14 = 0;
        int var15 = 0;
        Object var10Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        var14 = TetraLink.field_J;
        try {
          RasterTargetHelpers.setSpriteRasterTarget(param1, 6);
          SoftwareRasterizer.fillRectangle(100, 0, 10, 400, 0);
          SoftwareRasterizer.fillRectangle(530, 0, 10, 400, 0);
          SoftwareRasterizer.fillRectangle(110, 0, 420, 400, 394880);
          var4_int = 31 & LruTextureCache.field_e >> 1;
          if (var4_int >= 16) {
            var4_int = 32 - var4_int;
          }
          var4_int = (var4_int >> 1) + 16;
          if (this.field_a.field_b == 0) {
            var4_int = -var4_int;
          }
          if (param2 >= -74) {
            this.restartGame(82);
          }
          if (!PendingStatQuery.hasFeatureBit(0, (byte) 119)) {
            for (var5 = 0; 7 > var5; var5++) {
              var7 = 1 << var5;
              var15 = 0;
              var6 = var15;
              while (var15 < 6) {
                if (param0) {
                  stackIn_60_0 = 140 + 60 * var5;
                } else {
                  stackIn_60_0 = 500 - 60 * var5;
                }
                var8 = stackIn_60_0;
                var9 = 370 - 60 * var15;
                var10_int = 0;
                if ((this.field_g.field_e[var15] & var7) != 0) {
                  var10_int -= 128;
                } else {
                  if (0 != (this.field_g.field_k[var15] & var7)) {
                    var10_int += 128;
                  } else {
                    if (this.field_b &&
                      null != this.field_g.field_d &&
                      this.field_g.field_d.field_f == var5) {
                      var10_int = var10_int + var4_int * 4;
                    } else {
                      if (!this.field_a.field_l && (!this.field_b ||
                        this.field_a.field_b == this.field_i) && this.field_g.field_l == var5) {
                        if (this.field_g.field_m == var15) {
                          var10_int = var10_int + 3 * var4_int;
                        } else {
                          if (this.field_g.field_m < var15) {
                            var10_int = var10_int + (var4_int * 3 >> 1);
                          }
                        }
                      }
                    }
                  }
                }
                if (this.field_g.field_f != null &&
                  (var7 & this.field_g.field_f[var15]) != 0) {
                  var11 = this.field_j % 20;
                  if (var11 <= 10) {
                    stackIn_84_0 = var11 - 5;
                  } else {
                    stackIn_84_0 = -var11 + 5;
                  }
                  var11 = stackIn_84_0;
                  var10_int = var10_int + 10 * var11;
                }
                if (var10_int >= -191) {
                  if (var10_int >= 0) {
                    if (var10_int > 255) {
                      stackIn_92_0 = 16777215;
                    } else {
                      stackIn_92_0 = var10_int * 65792 | (var10_int * 40 >> 8) + 191;
                    }
                  } else {
                    stackIn_92_0 = -(var10_int * 65535) + 191;
                  }
                } else {
                  stackIn_92_0 = 12517376;
                }
                var11 = stackIn_92_0;
                SoftwareRasterizer.fillCircle(var8, var9, 28, 263172);
                SoftwareRasterizer.fillCircle(var8, var9, 25, var11);
                var15++;
              }
            }
          } else {
            for (var5 = 0; 7 > var5; var5++) {
              var7 = 1 << var5;
              for (var6 = 0; var6 < 6; var6++) {
                var9 = -(var6 * 60) + 370;
                if (!param0) {
                  stackIn_16_0 = 500 - 60 * var5;
                } else {
                  stackIn_16_0 = var5 * 60 + 140;
                }
                var8 = stackIn_16_0;
                var10 = null;
                var11 = 256;
                if ((this.field_g.field_e[var6] & var7) == 0) {
                  if ((this.field_g.field_k[var6] & var7) == 0) {
                    if (this.field_b &&
                      null != this.field_g.field_d &&
                      this.field_g.field_d.field_f == var5) {
                      if (this.field_a.field_b == 0) {
                        stackIn_26_0 = RasterStackHelpers.field_e;
                      } else {
                        stackIn_26_0 = DialWidget.field_X;
                      }
                      var10 = stackIn_26_0;
                      var11 = 4 * Math.abs(var4_int);
                    } else {
                      if (!this.field_a.field_l && (!this.field_b ||
                        this.field_a.field_b == this.field_i) && var5 == this.field_g.field_l) {
                        if (this.field_a.field_b == 0) {
                          stackIn_35_0 = RasterStackHelpers.field_e;
                        } else {
                          stackIn_35_0 = DialWidget.field_X;
                        }
                        var10 = stackIn_35_0;
                        if (this.field_g.field_m == var6) {
                          var11 = Math.abs(var4_int) * 4;
                        } else {
                          if (var6 > this.field_g.field_m) {
                            var11 = 3 * Math.abs(var4_int) >> 1;
                          }
                        }
                      }
                    }
                  } else {
                    var10 = DialWidget.field_X;
                  }
                } else {
                  var10 = RasterStackHelpers.field_e;
                }
                if (null != this.field_g.field_f &&
                  (this.field_g.field_f[var6] & var7) != 0) {
                  var12 = this.field_j % 20;
                  if (10 < var12) {
                    stackIn_45_0 = 20 - var12;
                  } else {
                    stackIn_45_0 = var12;
                  }
                  var12Lifetime2 = stackIn_45_0;
                  var11 = var12Lifetime2 * var11 / 10;
                }
                if (var10 != null) {
                  if (256 != var11) {
                    ((Sprite) (var10)).drawWithOpacity(-28 + var8, var9 - 28, var11);
                  } else {
                    ((Sprite) (var10)).drawTransparent(-28 + var8, -28 + var9);
                  }
                } else {
                  SoftwareRasterizer.fillCircle(var8, var9, 28, 263172);
                  SoftwareRasterizer.fillCircle(var8, var9, 25, 191);
                }
              }
            }
          }
          var10Lifetime1 = (PieceDropAnimation) (this.field_g.field_g.first(false));
          while (var10Lifetime1 != null) {
            if (!param0) {
              stackIn_99_0 = -(60 * ((PieceDropAnimation) (var10Lifetime1)).field_u) + 500;
            } else {
              stackIn_99_0 = 140 + 60 * ((PieceDropAnimation) (var10Lifetime1)).field_u;
            }
            var8Lifetime1 = stackIn_99_0;
            var9Lifetime1 = 370 - ((PieceDropAnimation) (var10Lifetime1)).field_n * 60;
            stackIn_102_0 = (!((PieceDropAnimation) (var10Lifetime1)).field_x) ? 16777215 : 12517376;
            var11Lifetime1 = stackIn_102_0;
            if (((PieceDropAnimation) (var10Lifetime1)).field_q == 0) {
              SoftwareRasterizer.drawLine(var8Lifetime1, 0, var8Lifetime1, ((PieceDropAnimation) (var10Lifetime1)).field_y, var11Lifetime1);
            } else {
              if (1 == ((PieceDropAnimation) (var10Lifetime1)).field_q) {
                UiComponent.replaceColorInRect(-8759, 0, 191, var9Lifetime1, ((PieceDropAnimation) (var10Lifetime1)).field_s, var8Lifetime1 - (((PieceDropAnimation) (var10Lifetime1)).field_s >> 1), var11Lifetime1);
                if (!PendingStatQuery.hasFeatureBit(0, (byte) 116)) {
                  stackIn_120_0 = var8Lifetime1;
                  stackIn_120_1 = var9Lifetime1;
                  if (25 >= ((PieceDropAnimation) (var10Lifetime1)).field_s) {
                    stackIn_121_2 = ((PieceDropAnimation) (var10Lifetime1)).field_s;
                  } else {
                    stackIn_121_2 = 25;
                  }
                  SoftwareRasterizer.fillCircle(stackIn_120_0, stackIn_120_1, stackIn_121_2, var11Lifetime1);
                } else {
                  if (((PieceDropAnimation) (var10Lifetime1)).field_s <= 25) {
                    stackIn_114_0 = ((PieceDropAnimation) (var10Lifetime1)).field_s;
                  } else {
                    stackIn_114_0 = 25;
                  }
                  var12Lifetime1 = stackIn_114_0;
                  var12Lifetime1 = 56 * var12Lifetime1 / 25;
                  if (!((PieceDropAnimation) (var10Lifetime1)).field_x) {
                    stackIn_117_0 = DialWidget.field_X;
                  } else {
                    stackIn_117_0 = RasterStackHelpers.field_e;
                  }
                  var13 = stackIn_117_0;
                  var13.drawScaled(var8Lifetime1 - (var12Lifetime1 >> 1), var9Lifetime1 - (var12Lifetime1 >> 1), var12Lifetime1, var12Lifetime1);
                }
              } else {
                UiComponent.replaceColorInRect(-8759, 0, 191, ((PieceDropAnimation) (var10Lifetime1)).field_y, ((PieceDropAnimation) (var10Lifetime1)).field_s, -(((PieceDropAnimation) (var10Lifetime1)).field_s >> 1) + var8Lifetime1, var11Lifetime1);
                if (PendingStatQuery.hasFeatureBit(0, (byte) 111)) {
                  if (!((PieceDropAnimation) (var10Lifetime1)).field_x) {
                    stackIn_109_0 = DialWidget.field_X;
                  } else {
                    stackIn_109_0 = RasterStackHelpers.field_e;
                  }
                  var12_ref_oh = stackIn_109_0;
                  var12_ref_oh.drawTransparent(var8Lifetime1 - 28, -28 + var9Lifetime1);
                } else {
                  SoftwareRasterizer.fillCircle(var8Lifetime1, ((PieceDropAnimation) (var10Lifetime1)).field_y, ((PieceDropAnimation) (var10Lifetime1)).field_s >> 1, var11Lifetime1);
                  SoftwareRasterizer.fillCircle(var8Lifetime1, var9Lifetime1, 25, var11Lifetime1);
                }
              }
            }
            var10Lifetime1 = (PieceDropAnimation) (this.field_g.field_g.next((byte) -70));
          }
          this.drawTurnStatusText((byte) -100);
          HuffmanCodec.popRasterTarget(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_128_0 = var4;
          stackIn_128_1 = new StringBuilder().append("ei.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_129_2 = "null";
          } else {
            stackIn_129_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_128_0), ((StringBuilder) (Object) stackIn_128_1).append(stackIn_129_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void resetChatMode(int param0) {
        MenuScreen.field_e = true;
        SecondaryNodeDequeIterator.field_d = 0;
        if (param0 != -4210768) {
          GameSession.resetChatMode(43);
        }
    }

    final void restartGame(int param0) {
        if (!this.field_b) {
          this.field_a.resetBoard(-124);
          this.field_g = new BoardAnimator(this.field_a, this.field_i);
          this.field_g.resetToBoard(106);
          this.field_d = BufferedSocket.field_c[this.field_a.field_d];
          DateOfBirthPanel.playSample(PlayingSound.field_r, param0 + 573509762);
          RandomAccessCacheFile.resetCameraToTarget(-64, true);
          this.field_r = -1;
          this.field_f = -1;
        } else {
          QuickChatHelpDialog.field_Lb.writeCipheredByte(61, (byte) -92);
        }
        if (param0 != -1) {
          this.field_j = 122;
        }
    }

    final static void setTuhstatbutCookie(java.applet.Applet param0, int param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
          LoadingStageHook.field_e = true;
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          if (param1 != 60) {
            java.applet.Applet var6 = (java.applet.Applet) null;
            GameSession.setTuhstatbutCookie((java.applet.Applet) null, -118);
          }
          var4 = -1L;
          AnimationPlayer.setCookie(var3, var4, param0, 111, var2);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ei.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void tick(boolean param0, byte param1) {
        PcmSample stackIn_43_0 = null;
        int var4;
        var4 = TetraLink.field_J;
        this.field_j = this.field_j + 1;
        if (param0 &&
          !PacketFlushHelpers.hasBlockingPopup(3058) &&
          MenuLabelGlobals.field_d.field_c) {
          if (ErrorPrintHelpers.field_a[96]) {
            SocketConnector.orbitCamera(0.0f, 0.029999999329447746f, -2452);
          }
          if (ErrorPrintHelpers.field_a[97]) {
            SocketConnector.orbitCamera(0.0f, -0.029999999329447746f, -2452);
          }
          if (ErrorPrintHelpers.field_a[98]) {
            SocketConnector.orbitCamera(-8.0f, 0.0f, -2452);
          }
          if (ErrorPrintHelpers.field_a[99]) {
            SocketConnector.orbitCamera(8.0f, 0.0f, -2452);
          }
        }
        if (this.field_b) {
          if (this.field_d > 1) {
            this.field_d = this.field_d - 1;
          }
        } else {
          if (!this.field_a.field_l) {
            this.field_d = this.field_d - 1;
            if (this.field_d == 0) {
              this.resign(false);
            }
          }
        }
        this.field_g.advanceDropAnimations(88);
        if (!this.field_a.field_l && (this.field_a.field_b == this.field_i ||
          !this.field_b) && (this.field_d < 750 &&
          this.field_d % 50 == 0)) {
          DateOfBirthPanel.playSample(SectorCacheStore.field_a, 573509761);
        }
        if (this.field_g.field_f != null && (0 == this.field_g.field_h &&
          this.field_j % 20 == 9 ||
          1 == this.field_g.field_h &&
          this.field_j % 20 == 19)) {
          if (this.field_b &&
            this.field_i != this.field_g.field_h) {
            stackIn_43_0 = MouseWheelInput.field_c;
          } else {
            stackIn_43_0 = LoadingProgressDialog.field_ib;
          }
          DateOfBirthPanel.playSample(stackIn_43_0, 573509761);
        }
        if (param1 <= 48) {
          return;
        }
        if (this.field_a.field_l &&
          param0 &&
          MenuLabelGlobals.field_d.field_c &&
          MenuScreen.field_g != 2 &&
          LruTextureCache.field_e > Archive.field_a + 20) {
          while ((double)NodeHashTable.field_h > 4.71238898038469) {
            NodeHashTable.field_h = (float)((double)NodeHashTable.field_h - 6.283185307179586);
          }
          while ((double)NodeHashTable.field_h < -1.5707963267948966) {
            NodeHashTable.field_h = (float)((double)NodeHashTable.field_h + 6.283185307179586);
          }
          MenuScreen.field_g = 0;
          NodeHashTable.field_h = NodeHashTable.field_h + 0.004999999888241291f;
          LobbyResourceHelpers.field_g[0] = (double)LoadingResourceHelpers.field_d * Math.sin((double)NodeHashTable.field_h);
          LobbyResourceHelpers.field_g[2] = (double)LoadingResourceHelpers.field_d * Math.cos((double)NodeHashTable.field_h);
          CameraAndChatHelpers.updateCameraMatrix(-103);
        }
        this.updateStatusTexts(-27);
    }

    private final void sendMoveRequest(int param0, int param1, boolean param2) {
        QuickChatHelpDialog.field_Lb.writeCipheredByte(58, (byte) -92);
        QuickChatHelpDialog.field_Lb.writeByte(this.field_a.field_k, !param2 ? true : false);
        if (!param2) {
          this.handleEscapeKey(-49);
        }
        QuickChatHelpDialog.field_Lb.writeByte(param1 << 3 | param0, !param2 ? true : false);
        if (null != this.field_g.field_d) {
        }
        this.field_g.field_d = new PendingMove(param1, param0, this.field_a.field_k);
    }

    private final void drawTurnStatusText(byte param0) {
        BinaryBitmapFont stackIn_16_0;
        String stackIn_16_1;
        int stackIn_16_2;
        int stackIn_16_3;
        int stackIn_17_4;
        int var3;
        String var4;
        var3 = TetraLink.field_J;
        if (param0 != -100) {
          return;
        }
        if (!this.field_a.field_l) {
          if (this.field_a.field_b >= 0) {
            var4 = SectorCacheStore.formatTemplate(new String[]{Integer.toString((49 + this.field_d) / 50)}, ArchiveFactoryHelpers.field_f, param0 + 220);
            if (this.field_b &&
              this.field_i == this.field_a.field_b) {
              stackIn_16_0 = SocialTabsPanel.field_b;
              stackIn_16_1 = ClientProtocolStage.field_f;
              stackIn_16_2 = 124;
              stackIn_16_3 = 30;
              if (LruTextureCache.field_e % 20 < 10) {
                stackIn_17_4 = 16777215;
              } else {
                stackIn_17_4 = 8421599;
              }
              ((BinaryBitmapFont) (Object) stackIn_16_0).drawLeft(stackIn_16_1, stackIn_16_2, stackIn_16_3, stackIn_17_4, -1);
              SocialTabsPanel.field_b.drawRight(var4, 516, 30, 16777215, -1);
            } else {
              SocialTabsPanel.field_b.drawRight(SectorCacheStore.formatTemplate(new String[]{this.field_a.field_o[this.field_a.field_b]}, NanoTickClock.field_l, 119), 516, 30, 16777215, -1);
              SocialTabsPanel.field_b.drawLeft(var4, 124, 30, 16777215, -1);
            }
          }
        } else {
          if (this.field_a.field_b >= 0) {
            if (this.field_b &&
              this.field_a.field_b == this.field_i) {
              SocialTabsPanel.field_b.drawCentered(IntrusiveNode.field_g, 320, 30, 16777215, -1);
            } else {
              SocialTabsPanel.field_b.drawCentered(SectorCacheStore.formatTemplate(new String[]{this.field_a.field_o[this.field_a.field_b]}, TextLayoutLine.field_b, 119), 320, 30, 16777215, -1);
            }
          } else {
            SocialTabsPanel.field_b.drawCentered(IntKeyLookup.field_e, 320, 30, 16777215, -1);
          }
        }
    }

    private final void drawHighlightLayer(boolean param0, Sprite param1, byte param2) {
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = TetraLink.field_J;
        try {
          RasterTargetHelpers.setSpriteRasterTarget(param1, 6);
          SoftwareRasterizer.fillRectangle(110, 0, 420, 400, 127);
          SoftwareRasterizer.fillRectangle(100, 0, 10, 400, 0);
          SoftwareRasterizer.fillRectangle(530, 0, 10, 400, 0);
          var4_int = (63 & LruTextureCache.field_e) >> 1;
          if (16 <= var4_int) {
            var4_int = -var4_int + 32;
          }
          if (this.field_a.field_b == 0) {
            stackIn_6_0 = 525052 * var4_int + 128;
          } else {
            stackIn_6_0 = 128 + 526341 * var4_int;
          }
          var5 = stackIn_6_0;
          if (0 == this.field_a.field_b) {
            stackIn_9_0 = 5255152 - (-(328447 * (var4_int >> 1)) - 128);
          } else {
            stackIn_9_0 = 128 - (-4210768 - 263173 * (var4_int >> 1));
          }
          var6 = stackIn_9_0;
          for (var7 = 0; 7 > var7; var7++) {
            for (var8 = 0; var8 < 6; var8++) {
              var10 = -(var8 * 60) + 370;
              if (!param0) {
                stackIn_16_0 = 500 - var7 * 60;
              } else {
                stackIn_16_0 = var7 * 60 + 140;
              }
              boolean decompiledFrameRemainder0 = true;
              var9 = stackIn_16_0;
              SoftwareRasterizer.fillCircle(var9, var10, 28, 263172);
              if (this.field_b &&
                this.field_g.field_d != null &&
                this.field_g.field_d.field_f == var7) {
                if (this.field_a.field_b == 0) {
                  stackIn_22_0 = 128 + (8 + (var4_int >> 1)) * 525052;
                } else {
                  stackIn_22_0 = 4210728 + 526341 * (var4_int >> 1) + 128;
                }
                var11 = stackIn_22_0;
                if (((this.field_g.field_k[var8] | this.field_g.field_e[var8]) & 1 << var7) == 0) {
                  SoftwareRasterizer.fillCircle(var9, var10, 25, var11);
                } else {
                  SoftwareRasterizer.fillCircle(var9, var10, 25, 0);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (!this.field_a.field_l && (!this.field_b ||
                  this.field_a.field_b == this.field_i) && this.field_g.field_l == var7) {
                  if (this.field_g.field_m == var8) {
                    SoftwareRasterizer.fillCircle(var9, var10, 25, var5);
                  } else {
                    if (this.field_g.field_m < var8) {
                      SoftwareRasterizer.fillCircle(var9, var10, 25, var6);
                    } else {
                      SoftwareRasterizer.fillCircle(var9, var10, 25, 0);
                    }
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  SoftwareRasterizer.fillCircle(var9, var10, 25, 0);
                }
              }
            }
          }
          if (param2 <= 8) {
            this.sendDrawOffer(118);
          }
          this.drawTurnStatusText((byte) -100);
          HuffmanCodec.popRasterTarget(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_44_0 = var4;
          stackIn_44_1 = new StringBuilder().append("ei.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param2).append(')').toString());
        }
    }

    final void handleEscapeKey(int param0) {
        int var2;
        int var3;
        var3 = TetraLink.field_J;
        if (13 != WidgetStyleLayer.field_e) {
          if (param0 <= 59) {
            this.sendDrawOffer(51);
          }
        } else {
          var2 = 2;
          if (this.field_b) {
            if (this.field_i < 0) {
              var2 = 5;
            } else {
              var2 = (!this.field_a.field_l) ? 3 : 4;
            }
          }
          DateOfBirthPanel.playSample(IndexedSpriteHelpers.field_c, 573509761);
          this.exitToScreen(true, -128, false, var2);
        }
    }

    final static void returnToLoginStage(byte param0) {
        if (!PacketBuffer.field_r) {
          throw new IllegalStateException();
        }
        ClockAndTextHelpers.field_c = true;
        if (param0 > -118) {
          GameSession.formatGmtDate((byte) -125, -44L);
        }
        ValidationMessageWidget.showLoginDialog((byte) 126, true);
        DisplayNameForm.field_R = 0;
    }

    private final void applyMove(int param0, int param1, int param2) {
        if (param1 != -15682) {
          return;
        }
        this.field_a.placePiece(param2, param0, this.field_a.field_b, -28067);
        this.field_g.queueNewPieceAnimations((byte) 56);
        if (this.field_a.checkGameEnd(2)) {
          if (this.field_i != -2) {
            this.exitToScreen(false, -110, false, -1);
          }
          this.field_p = 0;
        } else {
          this.field_a.advanceTurn(true);
          this.field_d = BufferedSocket.field_c[this.field_a.field_d];
        }
    }

    final void sendDrawOffer(int param0) {
        if (!this.field_b) {
          throw new IllegalStateException();
        }
        if (param0 != 0) {
          this.field_m = 46;
        }
        QuickChatHelpDialog.field_Lb.writeCipheredByte(59, (byte) -92);
    }

    final void exitToMainMenu(boolean param0, boolean param1) {
        if (!this.field_b) {
          this.exitToScreen(false, -120, param1, 0);
        }
        if (!param0) {
          this.field_m = 18;
        }
    }

    GameSession(boolean param0, int param1, String[] param2, int param3, boolean param4) {
        try {
          this.field_i = param3;
          this.field_b = param0 ? true : false;
          this.field_c = param4 ? true : false;
          this.field_a = new GameBoard(param1, param2, -1);
          if (!this.field_b) {
            this.field_a.setTurnState(0, 18936, 0);
            this.field_d = BufferedSocket.field_c[this.field_a.field_d];
          }
          this.field_g = new BoardAnimator(this.field_a, this.field_i);
          this.field_j = 0;
          this.field_f = -1;
          this.field_n = true;
          this.field_k = 0;
          this.field_r = -1;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ei.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_o = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_e = "Create a free account to";
        field_h = "This password is part of your Player Name, and would be easy to guess";
    }
}
