/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationHelpWidget extends TextHotspotWidget {
    private Validator field_U;
    static int field_S;
    private int field_N;
    static ResourceArchive field_Q;
    static int[] field_R;
    private Sprite field_T;
    static int[] field_V;
    private String field_P;
    static int field_W;

    final boolean requestFocus(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -25823) {
            return false;
          }
          field_V = (int[]) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bd.NB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = HoldTheLine.field_D;
        int var2Lifetime1;
        oc.field_c = null;
        EmailValidationResult.field_g = 0;
        PasswordFieldRenderer.field_y = null;
        if (param1 != 8077) {
          field_Q = (ResourceArchive) null;
          var2 = CachedTextLayout.field_e;
          CachedTextLayout.field_e = EmailLoginCredentials.field_g;
          EmailLoginCredentials.field_g = var2;
          if (param0 != 51) {
            if (param0 == 50) {
              OutlinedRoadStripRenderer.field_n.field_f = 5;
              OutlinedRoadStripRenderer.field_n.field_c = OutlinedRoadStripRenderer.field_n.field_c + 1;
              if (OutlinedRoadStripRenderer.field_n.field_c < 2) {
                if (OutlinedRoadStripRenderer.field_n.field_c >= 2 &&
                  param0 == 50) {
                  return 5;
                }
                if (4 > OutlinedRoadStripRenderer.field_n.field_c) {
                  return -1;
                }
                return 1;
              }
              if (51 == param0) {
                return 2;
              }
              if (OutlinedRoadStripRenderer.field_n.field_c >= 2 &&
                param0 == 50) {
                return 5;
              }
              if (4 > OutlinedRoadStripRenderer.field_n.field_c) {
                return -1;
              }
              return 1;
            }
            OutlinedRoadStripRenderer.field_n.field_f = 1;
            OutlinedRoadStripRenderer.field_n.field_c = OutlinedRoadStripRenderer.field_n.field_c + 1;
            if (OutlinedRoadStripRenderer.field_n.field_c < 2) {
              if (OutlinedRoadStripRenderer.field_n.field_c >= 2 &&
                param0 == 50) {
                return 5;
              }
              if (4 > OutlinedRoadStripRenderer.field_n.field_c) {
                return -1;
              }
              return 1;
            }
            if (51 == param0) {
              return 2;
            }
            if (OutlinedRoadStripRenderer.field_n.field_c >= 2 &&
              param0 == 50) {
              return 5;
            }
            if (4 > OutlinedRoadStripRenderer.field_n.field_c) {
              return -1;
            }
            return 1;
          }
          OutlinedRoadStripRenderer.field_n.field_f = 2;
          OutlinedRoadStripRenderer.field_n.field_c = OutlinedRoadStripRenderer.field_n.field_c + 1;
          if (OutlinedRoadStripRenderer.field_n.field_c < 2) {
            if (OutlinedRoadStripRenderer.field_n.field_c >= 2 &&
              param0 == 50) {
              return 5;
            }
            if (4 > OutlinedRoadStripRenderer.field_n.field_c) {
              return -1;
            }
            return 1;
          }
          if (51 == param0) {
            return 2;
          }
          if (OutlinedRoadStripRenderer.field_n.field_c >= 2 &&
            param0 == 50) {
            return 5;
          }
          if (4 <= OutlinedRoadStripRenderer.field_n.field_c) {
            return 1;
          }
          return -1;
        }
        var2Lifetime1 = CachedTextLayout.field_e;
        CachedTextLayout.field_e = EmailLoginCredentials.field_g;
        EmailLoginCredentials.field_g = var2Lifetime1;
        if (param0 != 51) {
          if (param0 == 50) {
            OutlinedRoadStripRenderer.field_n.field_f = 5;
            OutlinedRoadStripRenderer.field_n.field_c = OutlinedRoadStripRenderer.field_n.field_c + 1;
            if (OutlinedRoadStripRenderer.field_n.field_c >= 2 &&
              51 == param0) {
              return 2;
            }
            if (OutlinedRoadStripRenderer.field_n.field_c >= 2) {
              if (param0 != 50) {
                if (4 <= OutlinedRoadStripRenderer.field_n.field_c) {
                  return 1;
                }
                return -1;
              }
              return 5;
            }
            if (4 <= OutlinedRoadStripRenderer.field_n.field_c) {
              return 1;
            }
            return -1;
          }
          OutlinedRoadStripRenderer.field_n.field_f = 1;
          OutlinedRoadStripRenderer.field_n.field_c = OutlinedRoadStripRenderer.field_n.field_c + 1;
          if (OutlinedRoadStripRenderer.field_n.field_c >= 2 &&
            51 == param0) {
            return 2;
          }
          if (OutlinedRoadStripRenderer.field_n.field_c >= 2) {
            if (param0 != 50) {
              if (4 <= OutlinedRoadStripRenderer.field_n.field_c) {
                return 1;
              }
              return -1;
            }
            return 5;
          }
          if (4 <= OutlinedRoadStripRenderer.field_n.field_c) {
            return 1;
          }
          return -1;
        }
        OutlinedRoadStripRenderer.field_n.field_f = 2;
        OutlinedRoadStripRenderer.field_n.field_c = OutlinedRoadStripRenderer.field_n.field_c + 1;
        if (OutlinedRoadStripRenderer.field_n.field_c >= 2 &&
          51 == param0) {
          return 2;
        }
        if (OutlinedRoadStripRenderer.field_n.field_c >= 2) {
          if (param0 != 50) {
            if (4 <= OutlinedRoadStripRenderer.field_n.field_c) {
              return 1;
            }
            return -1;
          }
          return 5;
        }
        if (4 <= OutlinedRoadStripRenderer.field_n.field_c) {
          return 1;
        }
        return -1;
    }

    public static void clearSharedReferences(boolean param0) {
        if (param0) {
          field_V = null;
          field_Q = null;
          field_R = null;
          return;
        }
        ValidationHelpWidget.a(77, -61);
        field_V = null;
        field_Q = null;
        field_R = null;
    }

    final String getTooltip(int param0) {
        if (param0 == 0) {
          return null;
        }
        field_S = -9;
        return null;
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        String var5;
        ValidationState var6;
        int var13;
        TextWidgetRenderer var8;
        int var9;
        int var10;
        int var11;
        int var12;
        Sprite var15;
        Sprite var16;
        Sprite var17;
        Sprite var18;
        int var11Lifetime1;
        int var12Lifetime1;
        ValidationState var6Lifetime1;
        regionExit1: {
          regionExit2: {
            var13 = HoldTheLine.field_D;
            var6 = this.field_U.getValidationState(-7447);
            if (hh.field_d != var6 &&
              um.field_a != var6) {
              var5 = this.field_U.getValidationMessage((byte) -59);
              if (var5 == null) {
                var5 = this.field_P;
                break regionExit2;
              }
              if (!(var5.equals(this.text))) {
                this.text = var5;
                this.rebuildHotspots(0);
              }
              break regionExit1;
            }
            var5 = DialWidget.field_N;
          }
          if (!var5.equals(this.text)) {
            this.text = var5;
            this.rebuildHotspots(0);
          }
        }
        super.drawLayer(param0, param1, param2, param3);
        var6Lifetime1 = this.field_U.getValidationState(-7447);
        var8 = (TextWidgetRenderer) ((Object) this.renderer);
        var9 = this.x + param2;
        var10 = var8.getTextOriginY(-1337403295, (UiWidget) (this), param1) + (var8.getTextLayout((byte) 20, (UiWidget) (this)).getHeight(-93) >> 1);
        if (hh.field_d == var6Lifetime1) {
          var18 = FullscreenFocusCanvas.field_i[0];
          var11 = var18.canvasWidth << 1;
          var12 = var18.canvasHeight << 1;
          if (null == this.field_T) {
            this.field_T = new Sprite(var11, var12);
            ProxySocketConnector.pushSpriteRaster(this.field_T, -1);
          } else {
            if (var11 > this.field_T.width) {
              this.field_T = new Sprite(var11, var12);
              ProxySocketConnector.pushSpriteRaster(this.field_T, -1);
            } else {
              if (this.field_T.height < var12) {
                this.field_T = new Sprite(var11, var12);
                ProxySocketConnector.pushSpriteRaster(this.field_T, -1);
              } else {
                ProxySocketConnector.pushSpriteRaster(this.field_T, -1);
                SoftwareRasterizer.clear();
              }
            }
          }
          var18.drawRotatedBilinear(112, 144, var18.canvasWidth << 4, var18.canvasHeight << 4, -this.field_N << 10, 4096);
          dm.popRasterState((byte) -10);
          this.field_T.drawAdditive(-(var18.canvasWidth >> 1) + var9, -var18.canvasHeight + var10, 256);
          return;
        }
        if (var6Lifetime1 != um.field_a) {
          if (LinearPointPath.field_k == var6Lifetime1) {
            var15 = FullscreenFocusCanvas.field_i[2];
            var15.drawAdditive(var9, var10 - (var15.height >> 1), 256);
            return;
          }
          if (PointPath.field_d == var6Lifetime1) {
            var16 = FullscreenFocusCanvas.field_i[1];
            var16.drawAdditive(var9, var10 - (var16.height >> 1), 256);
          }
          return;
        }
        var17 = FullscreenFocusCanvas.field_i[0];
        var11Lifetime1 = var17.canvasWidth << 1;
        var12Lifetime1 = var17.canvasHeight << 1;
        if (null == this.field_T) {
          this.field_T = new Sprite(var11Lifetime1, var12Lifetime1);
          ProxySocketConnector.pushSpriteRaster(this.field_T, -1);
        } else {
          if (var11Lifetime1 > this.field_T.width) {
            this.field_T = new Sprite(var11Lifetime1, var12Lifetime1);
            ProxySocketConnector.pushSpriteRaster(this.field_T, -1);
          } else {
            if (this.field_T.height < var12Lifetime1) {
              this.field_T = new Sprite(var11Lifetime1, var12Lifetime1);
              ProxySocketConnector.pushSpriteRaster(this.field_T, -1);
            } else {
              ProxySocketConnector.pushSpriteRaster(this.field_T, -1);
              SoftwareRasterizer.clear();
            }
          }
        }
        var17.drawRotatedBilinear(112, 144, var17.canvasWidth << 4, var17.canvasHeight << 4, -this.field_N << 10, 4096);
        dm.popRasterState((byte) -10);
        this.field_T.drawAdditive(-(var17.canvasWidth >> 1) + var9, -var17.canvasHeight + var10, 256);
        return;
    }

    ValidationHelpWidget(Validator param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, TextHotspotWidget.getDefaultStyle(105));
        try {
          this.field_P = param1;
          this.field_U = param0;
          this.setBounds(param2, (byte) 122, param3, param5, param4);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "bd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static EntitySound a(byte param0, MovingEntity param1, PcmSample param2, int param3) {
        EntitySound var4 = null;
        RuntimeException var4_ref = null;
        EntitySound stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = SpriteButtonRenderer.createEntitySound(param3, 2931, param1, param2);
          if (param0 <= 2) {
            field_W = 35;
          }
          FadingDialog.field_J.addLast((byte) -73, var4);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("bd.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final static SoundPlayback a(int param0, int param1, int param2, PcmSample param3) {
        RuntimeException var4 = null;
        SoundPlayback stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 17405) {
            ValidationHelpWidget.a(34, 10);
          }
          stackIn_3_0 = CachedTextLayout.playSoundStream(PcmSampleStream.createAtRate(param3, 100, param1, param2), (byte) -68);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("bd.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void updateHover(int param0, UiWidget param1, int param2, byte param3) {
        try {
          this.field_N = this.field_N + 1;
          super.updateHover(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "bd.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_R = new int[4];
        field_S = -20;
        field_V = new int[4];
    }
}
