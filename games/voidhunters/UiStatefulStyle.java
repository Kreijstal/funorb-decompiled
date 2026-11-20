/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiStatefulStyle extends UiTextStyle {
    private UiVisualStyle accumulatedStyle;
    private UiVisualStyle[] stateStyles;
    static String field_p;

    final UiVisualStyle createStateStyle(int param0, int param1) {
        if (param1 != -1) {
          UiStatefulStyle.clearSharedReferences((byte) -96);
        }
        UiVisualStyle dupTemp$0 = new UiVisualStyle();
        this.stateStyles[param0] = dupTemp$0;
        return dupTemp$0;
    }

    final void setStateBackgroundSprites(int param0, Sprite[] param1, int param2) {
        int var4_int = 0;
        try {
          var4_int = param0;
          if (null == this.stateStyles[var4_int]) {
            this.stateStyles[var4_int] = new UiVisualStyle();
          }
          if (param2 != 15486) {
            this.stateStyles = (UiVisualStyle[]) null;
          }
          this.stateStyles[param0].backgroundSprites = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "uea.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static TextureEllipseShape decodeTextureEllipseShape(PacketBuffer param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        TextureEllipseShape stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 50 / ((param1 + 28) / 55);
          stackIn_1_0 = new TextureEllipseShape(param0.readShort(true), param0.readShort(true), param0.readShort(true), param0.readShort(true), param0.readUnsignedMedium((byte) -81), param0.readUnsignedMedium((byte) -45), param0.readUnsignedByte((byte) -119));
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("uea.Q(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void c(int param0) {
        IsaacPacketBuffer var2 = UiViewport.field_w;
        IsaacPacketBuffer var1 = var2;
        UiViewport.field_w = OpenGlSpriteTexture.field_q;
        OpenGlSpriteTexture.field_q = var2;
        if (null == UiViewport.field_w) {
          UiViewport.field_w = new IsaacPacketBuffer(1048576);
        }
        if (param0 != 9487) {
          field_p = (String) null;
        }
    }

    private final void copyStyleTo(UiStatefulStyle param0, int param1, boolean param2) {
        int var4_int = 0;
        UiVisualStyle dupTemp$0 = null;
        UiVisualStyle stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        UiVisualStyle stackIn_9_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        UiVisualStyle var5 = null;
        UiVisualStyle var6 = null;
        int var7 = 0;
        UiVisualStyle var6Lifetime1;
        UiVisualStyle var6Lifetime2;
        var7 = VoidHunters.field_G;
        try {
          super.copyTo(param1 - 130, param0);
          if (param2) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.stateStyles[var4_int];
              var6 = var5;
              var6Lifetime1 = var5;
              if (var5 != null) {
                var6Lifetime2 = param0.stateStyles[var4_int];
                stackIn_8_0 = var5;
                stackIn_8_1 = 105;
                if (var6Lifetime2 != null) {
                  stackIn_9_2 = var6Lifetime2;
                } else {
                  dupTemp$0 = new UiVisualStyle();
                  param0.stateStyles[var4_int] = dupTemp$0;
                  stackIn_9_2 = dupTemp$0;
                }
                ((UiVisualStyle) (Object) stackIn_8_0).copyTo((byte) stackIn_8_1, stackIn_9_2);
              } else {
                param0.stateStyles[var4_int] = null;
              }
            }
          } else {
            ArrayOperations.copy(this.stateStyles, 0, param0.stateStyles, 0, 6);
          }
          if (param1 != 6) {
            this.accumulatedStyle = (UiVisualStyle) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("uea.B(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_p = null;
        if (param0 != -18) {
          UiStatefulStyle.a((byte) 52, true, false, 58);
        }
    }

    final void setBackgroundSpritesForAllStates(Sprite[] param0, byte param1) {
        int var4 = 0;
        UiVisualStyle[] var3 = null;
        UiVisualStyle var5 = null;
        int var6 = 0;
        UiVisualStyle[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = VoidHunters.field_G;
        try {
          if (param1 != -54) {
            return;
          }
          var7 = this.stateStyles;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.backgroundSprites = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("uea.N(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1, boolean param2, int param3) {
        int var4;
        int var8;
        MenuBackgroundBattle stackIn_10_0 = null;
        boolean stackIn_11_1 = false;
        int var5;
        int var6;
        int var7;
        var8 = VoidHunters.field_G;
        if (param0 != 88) {
          field_p = (String) null;
        }
        var4 = 0;
        if (-1 == param3) {
          ServerInfoFactory.a(-30428, param2);
        } else {
          if (param3 == -2) {
            SoftwareRasterizer2D.clear();
            RoundResult.field_e = true;
          } else {
            if (param1) {
              ServerInfoFactory.a(-30428, false);
            } else {
              if (null == SniperCannonWeaponDefinition.menuBackgroundBattle) {
                SniperCannonWeaponDefinition.menuBackgroundBattle = new MenuBackgroundBattle();
              }
              var4 = 1;
              if (null != SniperCannonWeaponDefinition.menuBackgroundBattle) {
                stackIn_10_0 = SniperCannonWeaponDefinition.menuBackgroundBattle;
                stackIn_11_1 = (WorldSpriteTiler.field_a[param3].hitTestItem(GetTorpedoReload.field_q, GetUseDetailLines.field_o, 6868) != -1) ? false : true;
                ((MenuBackgroundBattle) (Object) stackIn_10_0).render(stackIn_11_1, (byte) 55);
              }
            }
            WorldSpriteTiler.field_a[param3].draw((byte) 65);
          }
        }
        if (var4 == 0) {
          SniperCannonWeaponDefinition.menuBackgroundBattle = null;
        }
        var5 = 1;
        var6 = 13421772;
        if (OpenGlTexture1D.field_i) {
          var7 = 3;
          SetBoostersCooldown.a(GetDebrisGroupColour.field_r, SetTorpedoEnergyUsed.getToolkitFont(var7, 300), PlayerReadyFactory.field_b[var7], -125, var6, GetBombletSprayEnergyUsed.field_p.width, GetUseDetailLines.field_o, var5, GetTorpedoReload.field_q, GetBombletSprayEnergyUsed.field_p.height);
        }
    }

    final void setForegroundSpriteForAllStates(int param0, Sprite param1) {
        int var4 = 0;
        UiVisualStyle[] var3 = null;
        UiVisualStyle var5 = null;
        int var6 = 0;
        Sprite[] var7 = null;
        UiVisualStyle[] var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = VoidHunters.field_G;
        try {
          if (param0 != 32460) {
            var7 = (Sprite[]) null;
            this.setBackgroundSpritesForAllStates((Sprite[]) null, (byte) -127);
          }
          var8 = this.stateStyles;
          var3 = var8;
          for (var4 = 0; var4 < var8.length; var4++) {
            var5 = var8[var4];
            if (var5 != null) {
              var5.foregroundSprite = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("uea.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final void drawComponent(int param0, UiComponent param1, int param2, int param3, boolean param4) {
        UiComponent stackIn_3_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        UiVisualStyle var7 = null;
        int var8 = 0;
        UiVisualStyle var10 = null;
        UiFocusableComponent var11 = null;
        UiVisualStyle var12 = null;
        UiVisualStyle var13 = null;
        UiVisualStyle var14 = null;
        UiVisualStyle var15 = null;
        try {
          if (param1 instanceof UiFocusableComponent) {
            stackIn_3_0 = (UiComponent) (param1);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (UiFocusableComponent) (stackIn_3_0);
          SelectableIconLabelWidget.pushClip(param1.width + param2 + param1.x, param3 + param1.y + param1.height, param2 + param1.x, true, param3 + param1.y);
          if (var11 != null) {
            param4 = param4 & var11.enabled;
          }
          var8 = 14 % ((param0 + 27) / 35);
          var7 = this.stateStyles[0];
          this.accumulatedStyle.reset(120);
          var7.applyLayer(this.accumulatedStyle, param2, param1, param3, -2879, this);
          if (var11 != null) {
            if (var11.active) {
              var12 = this.stateStyles[1];
              if (var12 != null) {
                var12.applyLayer(this.accumulatedStyle, param2, param1, param3, -2879, this);
              }
            }
            if (var11.hovered) {
              var13 = this.stateStyles[3];
              if (var11.pressedButton != 0 &&
                var13 != null) {
                var13.applyLayer(this.accumulatedStyle, param2, param1, param3, -2879, this);
              } else {
                var10 = this.stateStyles[2];
                if (var10 != null) {
                  var10.applyLayer(this.accumulatedStyle, param2, param1, param3, -2879, this);
                }
              }
            }
          }
          if (param1.hasFocus((byte) -120)) {
            var14 = this.stateStyles[5];
            if (var14 != null) {
              var14.applyLayer(this.accumulatedStyle, param2, param1, param3, -2879, this);
            }
          }
          if (!param4) {
            var15 = this.stateStyles[4];
            if (var15 != null) {
              var15.applyLayer(this.accumulatedStyle, param2, param1, param3, -2879, this);
            }
          }
          this.accumulatedStyle.draw(this, false, param2, param1, param3);
          SoftwareRasterStateRestorer.popRasterState((byte) 124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_32_0 = var6;
          stackIn_32_1 = new StringBuilder().append("uea.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public UiStatefulStyle() {
        this.stateStyles = new UiVisualStyle[6];
        this.accumulatedStyle = new UiVisualStyle();
        UiVisualStyle dupTemp$0 = new UiVisualStyle();
        this.stateStyles[0] = dupTemp$0;
        UiVisualStyle var1 = dupTemp$0;
        var1.reset(120);
    }

    UiStatefulStyle(UiStatefulStyle param0, boolean param1) {
        this();
        try {
          param0.copyStyleTo(this, 6, param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "uea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_p = "Buying or selling an account";
    }
}
