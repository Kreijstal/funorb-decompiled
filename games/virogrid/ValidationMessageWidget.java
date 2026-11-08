/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationMessageWidget extends HotspotTextWidget {
    static BufferedSocket field_N;
    static int field_X;
    private String field_W;
    private TextValidator field_R;
    static Js5Archive field_T;
    private Sprite field_S;
    static String field_Y;
    static volatile int field_Q;
    static SpriteWidget field_Z;
    static int[] field_O;
    private int field_U;
    static int field_P;

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          field_N = null;
          field_T = null;
          field_Z = null;
          field_O = null;
          field_Y = null;
          return;
        }
        field_N = (BufferedSocket) null;
        field_N = null;
        field_T = null;
        field_Z = null;
        field_O = null;
        field_Y = null;
    }

    ValidationMessageWidget(TextValidator param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, IntKeyLookup.getDefaultTextPainter((byte) -108));
        try {
          this.field_R = param0;
          this.field_W = param1;
          this.setBounds(param5, true, param3, param2, param4);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ng.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void drawLayer(byte param0, int param1, int param2, int param3) {
        String var5;
        AudioSetupHelpers var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        Sprite var16;
        String var17;
        Object var18;
        Sprite var19;
        Sprite var20;
        Sprite var21;
        Object var22;
        Sprite var23;
        Sprite var24;
        Sprite var25;
        Sprite var26;
        Object var27;
        Sprite var28;
        Sprite var29;
        Sprite var30;
        WidgetTextLayout var31;
        WidgetTextLayout var32;
        WidgetTextLayout var33;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        AudioSetupHelpers var6Lifetime1;
        AudioSetupHelpers var6Lifetime2;
        var18 = null;
        var22 = null;
        var27 = null;
        var13 = Virogrid.field_F ? 1 : 0;
        var6 = this.field_R.getValidationState(-22243);
        if (var6 == ImageProducerRasterBuffer.field_r) {
          var17 = MusicCrossfadeStream.field_s;
          if (!var17.equals(this.field_n)) {
            this.field_n = var17;
            this.rebuildHotspots(-115);
          }
          super.drawLayer(param0, param1, param2, param3);
          var6 = this.field_R.getValidationState(param0 - 22280);
          var31 = (WidgetTextLayout) ((Object) this.listener);
          var9 = this.field_l + param1;
          var10 = var31.getTextX(-587719039, (UiWidget) (this), param2) + (var31.getTextLayout((UiWidget) (this), (byte) -123).height((byte) 20) >> 1);
          if (ImageProducerRasterBuffer.field_r != var6 &&
            ProxyAuthenticationRequiredException.field_d != var6) {
            if (var6 == GuestPlayHelpers.field_c) {
              var20 = ReflectionCheck.field_p[2];
              var20.drawAdditive(var9, var10 - (var20.field_p >> 1), 256);
              return;
            }
            if (CachedTextLayout.field_i != var6) {
              return;
            }
            var19 = ReflectionCheck.field_p[1];
            var19.drawAdditive(var9, var10 - (var19.field_p >> 1), 256);
            return;
          }
          var21 = ReflectionCheck.field_p[0];
          var11 = var21.field_u << 1;
          var12 = var21.field_z << 1;
          if (this.field_S == null) {
            this.field_S = new Sprite(var11, var12);
            ChatPanelSetupHelpers.setRenderTargetSprite(this.field_S, 16865);
          } else {
            if (this.field_S.field_w < var11) {
              this.field_S = new Sprite(var11, var12);
              ChatPanelSetupHelpers.setRenderTargetSprite(this.field_S, 16865);
            } else {
              if (var12 > this.field_S.field_p) {
                this.field_S = new Sprite(var11, var12);
                ChatPanelSetupHelpers.setRenderTargetSprite(this.field_S, 16865);
              } else {
                ChatPanelSetupHelpers.setRenderTargetSprite(this.field_S, 16865);
                Rasterizer.clear();
              }
            }
          }
          var21.drawRotatedAboutPivot(112, 144, var21.field_u << 4, var21.field_z << 4, -this.field_U << 10, 4096);
          ContextMenuHelpers.popRasterTarget(true);
          this.field_S.drawAdditive(var9 - (var21.field_u >> 1), -var21.field_z + var10, 256);
          return;
        }
        if (ProxyAuthenticationRequiredException.field_d != var6) {
          var5 = this.field_R.getValidationMessage(28433);
          if (var5 == null) {
            var5 = this.field_W;
          }
        } else {
          var5 = MusicCrossfadeStream.field_s;
        }
        if (!var5.equals(this.field_n)) {
          this.field_n = var5;
          this.rebuildHotspots(-115);
          super.drawLayer(param0, param1, param2, param3);
          var6Lifetime1 = this.field_R.getValidationState(param0 - 22280);
          var33 = (WidgetTextLayout) ((Object) this.listener);
          var9Lifetime1 = this.field_l + param1;
          var10Lifetime1 = var33.getTextX(-587719039, (UiWidget) (this), param2) + (var33.getTextLayout((UiWidget) (this), (byte) -123).height((byte) 20) >> 1);
          if (ImageProducerRasterBuffer.field_r != var6Lifetime1 &&
            ProxyAuthenticationRequiredException.field_d != var6Lifetime1) {
            if (var6Lifetime1 == GuestPlayHelpers.field_c) {
              var29 = ReflectionCheck.field_p[2];
              var29.drawAdditive(var9Lifetime1, var10Lifetime1 - (var29.field_p >> 1), 256);
              return;
            }
            if (CachedTextLayout.field_i != var6Lifetime1) {
              return;
            }
            var28 = ReflectionCheck.field_p[1];
            var28.drawAdditive(var9Lifetime1, var10Lifetime1 - (var28.field_p >> 1), 256);
            return;
          }
          var30 = ReflectionCheck.field_p[0];
          var11Lifetime1 = var30.field_u << 1;
          var12Lifetime1 = var30.field_z << 1;
          if (this.field_S == null) {
            this.field_S = new Sprite(var11Lifetime1, var12Lifetime1);
            ChatPanelSetupHelpers.setRenderTargetSprite(this.field_S, 16865);
          } else {
            if (this.field_S.field_w < var11Lifetime1) {
              this.field_S = new Sprite(var11Lifetime1, var12Lifetime1);
              ChatPanelSetupHelpers.setRenderTargetSprite(this.field_S, 16865);
            } else {
              if (var12Lifetime1 <= this.field_S.field_p) {
                ChatPanelSetupHelpers.setRenderTargetSprite(this.field_S, 16865);
                Rasterizer.clear();
              } else {
                this.field_S = new Sprite(var11Lifetime1, var12Lifetime1);
                ChatPanelSetupHelpers.setRenderTargetSprite(this.field_S, 16865);
              }
            }
          }
          var30.drawRotatedAboutPivot(112, 144, var30.field_u << 4, var30.field_z << 4, -this.field_U << 10, 4096);
          ContextMenuHelpers.popRasterTarget(true);
          this.field_S.drawAdditive(var9Lifetime1 - (var30.field_u >> 1), -var30.field_z + var10Lifetime1, 256);
          return;
        }
        super.drawLayer(param0, param1, param2, param3);
        var6Lifetime2 = this.field_R.getValidationState(param0 - 22280);
        var32 = (WidgetTextLayout) ((Object) this.listener);
        var9Lifetime2 = this.field_l + param1;
        var10Lifetime2 = var32.getTextX(-587719039, (UiWidget) (this), param2) + (var32.getTextLayout((UiWidget) (this), (byte) -123).height((byte) 20) >> 1);
        if (ImageProducerRasterBuffer.field_r == var6Lifetime2) {
          var23 = ReflectionCheck.field_p[0];
          var11Lifetime2 = var23.field_u << 1;
          var12Lifetime2 = var23.field_z << 1;
          if (this.field_S == null) {
            this.field_S = new Sprite(var11Lifetime2, var12Lifetime2);
            ChatPanelSetupHelpers.setRenderTargetSprite(this.field_S, 16865);
          } else {
            if (this.field_S.field_w < var11Lifetime2) {
              this.field_S = new Sprite(var11Lifetime2, var12Lifetime2);
              ChatPanelSetupHelpers.setRenderTargetSprite(this.field_S, 16865);
            } else {
              if (var12Lifetime2 > this.field_S.field_p) {
                this.field_S = new Sprite(var11Lifetime2, var12Lifetime2);
                ChatPanelSetupHelpers.setRenderTargetSprite(this.field_S, 16865);
              } else {
                ChatPanelSetupHelpers.setRenderTargetSprite(this.field_S, 16865);
                Rasterizer.clear();
              }
            }
          }
          var23.drawRotatedAboutPivot(112, 144, var23.field_u << 4, var23.field_z << 4, -this.field_U << 10, 4096);
          ContextMenuHelpers.popRasterTarget(true);
          this.field_S.drawAdditive(var9Lifetime2 - (var23.field_u >> 1), -var23.field_z + var10Lifetime2, 256);
          return;
        }
        if (ProxyAuthenticationRequiredException.field_d != var6Lifetime2) {
          if (var6Lifetime2 == GuestPlayHelpers.field_c) {
            var26 = ReflectionCheck.field_p[2];
            var26.drawAdditive(var9Lifetime2, var10Lifetime2 - (var26.field_p >> 1), 256);
            return;
          }
          if (CachedTextLayout.field_i != var6Lifetime2) {
            return;
          }
          var25 = ReflectionCheck.field_p[1];
          var25.drawAdditive(var9Lifetime2, var10Lifetime2 - (var25.field_p >> 1), 256);
          return;
        }
        var24 = ReflectionCheck.field_p[0];
        var16 = var24;
        var11Lifetime3 = var24.field_u << 1;
        var12Lifetime3 = var24.field_z << 1;
        if (this.field_S == null) {
          this.field_S = new Sprite(var11Lifetime3, var12Lifetime3);
          ChatPanelSetupHelpers.setRenderTargetSprite(this.field_S, 16865);
        } else {
          if (this.field_S.field_w < var11Lifetime3) {
            this.field_S = new Sprite(var11Lifetime3, var12Lifetime3);
            ChatPanelSetupHelpers.setRenderTargetSprite(this.field_S, 16865);
          } else {
            if (var12Lifetime3 <= this.field_S.field_p) {
              ChatPanelSetupHelpers.setRenderTargetSprite(this.field_S, 16865);
              Rasterizer.clear();
            } else {
              this.field_S = new Sprite(var11Lifetime3, var12Lifetime3);
              ChatPanelSetupHelpers.setRenderTargetSprite(this.field_S, 16865);
            }
          }
        }
        var24.drawRotatedAboutPivot(112, 144, var24.field_u << 4, var24.field_z << 4, -this.field_U << 10, 4096);
        ContextMenuHelpers.popRasterTarget(true);
        this.field_S.drawAdditive(var9Lifetime2 - (var24.field_u >> 1), -var24.field_z + var10Lifetime2, 256);
    }

    final boolean focusNext(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -8515) {
            var4 = (UiWidget) null;
            this.updatePointer(-119, 56, (UiWidget) null, -7);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ng.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void updatePointer(int param0, int param1, UiWidget param2, int param3) {
        try {
          this.field_U = this.field_U + 1;
          super.updatePointer(param0, 114, param2, param3);
          if (param1 < 113) {
            this.drawLayer((byte) -92, -86, 85, 41);
          }
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ng.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final String getTooltip(int param0) {
        if (param0 >= 35) {
          return null;
        }
        this.drawLayer((byte) 91, -66, 2, -100);
        return null;
    }

    static {
        field_Y = "Friends";
        field_Q = 0;
        field_O = new int[4];
    }
}
