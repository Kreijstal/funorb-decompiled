/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StatefulWidgetPainter extends BitmapTextWidgetPainter {
    private WidgetStateStyle[] field_w;
    static String field_u;
    static String field_x;
    private WidgetStateStyle field_v;

    final static void finishTaggedPayload(int headerBitPosition, int obfuscationGuard, int headerBitLength, CipherPacketBuffer packet, int payloadBitLength) {
        try {
          int var5_int = 58 / ((obfuscationGuard + 86) / 38);
          if (headerBitLength < payloadBitLength) {
            packet.setWriteBitPosition(headerBitPosition, (byte) 0);
            AiInfluenceMap.writeTieredSignedInt(14, 20, payloadBitLength, 30, 1, 4, packet);
          }
          packet.setReadBitPosition((byte) -83, payloadBitLength + headerBitLength + headerBitPosition);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ao.B(" + headerBitPosition + ',' + obfuscationGuard + ',' + headerBitLength + ',' + (packet != null ? "{...}" : "null") + ',' + payloadBitLength + ')');
        }
    }

    final static String a(String param0, boolean param1, String param2, ResourceArchive param3) {
        RuntimeException var4 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3.ensureIndex((byte) 82)) {
            stackIn_3_0 = (String) (param0);
            return stackIn_3_0;
          }
          if (param1) {
            stackIn_8_0 = param2 + " - " + param3.getOverallProgress(0) + "%";
            return stackIn_8_0;
          }
          stackIn_6_0 = (String) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ao.E(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public final void paintWidget(Widget widget, int originX, int obfuscationGuard, boolean renderFlag, int originY) {
        Widget stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        WidgetStateStyle var7 = null;
        WidgetStateStyle var9 = null;
        InteractiveWidget var10 = null;
        WidgetStateStyle var11 = null;
        WidgetStateStyle var12 = null;
        WidgetStateStyle var13 = null;
        WidgetStateStyle var14 = null;
        try {
          if (widget instanceof InteractiveWidget) {
            stackIn_3_0 = (Widget) (widget);
          } else {
            stackIn_3_0 = null;
          }
          var10 = (InteractiveWidget) (stackIn_3_0);
          CampaignUnitOverride.a(originX + widget.x, widget.width + (widget.x + originX), widget.y + (originY + widget.height), originY + widget.y, (byte) 72);
          if (obfuscationGuard >= -79) {
            return;
          }
          if (var10 != null) {
            renderFlag = renderFlag & var10.enabled;
          }
          var7 = this.field_w[0];
          this.field_v.resetDefaults(false);
          var7.mergeInto(-10265, this.field_v, originX, this, originY, widget);
          if (var10 != null) {
            if (var10.active) {
              var11 = this.field_w[1];
              if (var11 != null) {
                var11.mergeInto(-10265, this.field_v, originX, this, originY, widget);
              }
            }
            if (var10.hovered) {
              var12 = this.field_w[3];
              if (0 != var10.pressedButton &&
                var12 != null) {
                var12.mergeInto(-10265, this.field_v, originX, this, originY, widget);
              } else {
                var9 = this.field_w[2];
                if (var9 != null) {
                  var9.mergeInto(-10265, this.field_v, originX, this, originY, widget);
                }
              }
            }
          }
          if (widget.isFocused(false)) {
            var13 = this.field_w[5];
            if (var13 != null) {
              var13.mergeInto(-10265, this.field_v, originX, this, originY, widget);
            }
          }
          if (!renderFlag) {
            var14 = this.field_w[4];
            if (var14 != null) {
              var14.mergeInto(-10265, this.field_v, originX, this, originY, widget);
            }
          }
          this.field_v.draw(widget, (byte) 113, originY, originX, this);
          QuickChatPhraseRepository.popRasterState(-18862);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_33_0 = var6;
          stackIn_33_1 = new StringBuilder().append("ao.C(");
          if (widget == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(originX).append(',').append(obfuscationGuard).append(',').append(renderFlag).append(',').append(originY).append(')').toString());
        }
    }

    final void setContentSprite(int firstState, RgbSprite sprite) {
        int var4 = 0;
        WidgetStateStyle[] var3 = null;
        WidgetStateStyle var5 = null;
        int var6 = 0;
        WidgetStateStyle[] var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var7 = this.field_w;
          var3 = var7;
          for (var4 = firstState; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_j = sprite;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("ao.D(").append(firstState).append(',');
          if (sprite == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    StatefulWidgetPainter(StatefulWidgetPainter param0, boolean param1) {
        this();
        try {
          param0.copyStatesTo(param1, this, 6);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ao.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(byte obfuscationGuard) {
        field_x = null;
        field_u = null;
        int var1 = 101 / ((obfuscationGuard + 45) / 33);
    }

    public StatefulWidgetPainter() {
        this.field_w = new WidgetStateStyle[6];
        this.field_v = new WidgetStateStyle();
        WidgetStateStyle dupTemp$0 = new WidgetStateStyle();
        this.field_w[0] = dupTemp$0;
        WidgetStateStyle var1 = dupTemp$0;
        var1.resetDefaults(false);
    }

    final void setFrameSprites(int obfuscationGuard, RgbSprite[] frameSprites) {
        WidgetStateStyle[] var3 = null;
        int var4 = 0;
        WidgetStateStyle var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3 = this.field_w;
          var4 = 0;
          if (obfuscationGuard >= -123) {
            field_u = (String) null;
          }
          while (var4 < var3.length) {
            var5 = var3[var4];
            if (var5 != null) {
              var5.field_d = frameSprites;
            }
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("ao.A(").append(obfuscationGuard).append(',');
          if (frameSprites == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final WidgetStateStyle createStateStyle(int state, byte obfuscationGuard) {
        if (obfuscationGuard >= -69) {
          this.createStateStyle(-22, (byte) -18);
        }
        WidgetStateStyle dupTemp$0 = new WidgetStateStyle();
        this.field_w[state] = dupTemp$0;
        return dupTemp$0;
    }

    final void setStateFrameSprites(RgbSprite[] frameSprites, int state, int obfuscationGuard) {
        int var4_int = 0;
        try {
          var4_int = state;
          if (null == this.field_w[var4_int]) {
            this.field_w[var4_int] = new WidgetStateStyle();
          }
          if (obfuscationGuard != -7) {
            RgbSprite[] var5 = (RgbSprite[]) null;
            this.setStateFrameSprites((RgbSprite[]) null, 15, 64);
          }
          this.field_w[state].field_d = frameSprites;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ao.HA(" + (frameSprites != null ? "{...}" : "null") + ',' + state + ',' + obfuscationGuard + ')');
        }
    }

    private final void copyStatesTo(boolean duplicateLayers, StatefulWidgetPainter target, int obfuscationGuard) {
        int var4_int = 0;
        WidgetStateStyle dupTemp$0 = null;
        WidgetStateStyle stackIn_11_0 = null;
        boolean stackIn_11_1 = false;
        WidgetStateStyle stackIn_12_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        WidgetStateStyle var5 = null;
        WidgetStateStyle var6 = null;
        int var7 = 0;
        StatefulWidgetPainter var8 = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 6) {
            var8 = (StatefulWidgetPainter) null;
            this.copyStatesTo(false, (StatefulWidgetPainter) null, 119);
          }
          super.copyStyleTo(target, 24978);
          if (duplicateLayers) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_w[var4_int];
              if (var5 != null) {
                var6 = target.field_w[var4_int];
                stackIn_11_0 = var5;
                stackIn_11_1 = false;
                if (var6 == null) {
                  dupTemp$0 = new WidgetStateStyle();
                  target.field_w[var4_int] = dupTemp$0;
                  stackIn_12_2 = dupTemp$0;
                } else {
                  stackIn_12_2 = var6;
                }
                ((WidgetStateStyle) (Object) stackIn_11_0).copyTo(stackIn_11_1, stackIn_12_2);
              } else {
                target.field_w[var4_int] = null;
              }
            }
            return;
          }
          vm.a(this.field_w, 0, target.field_w, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ao.FA(").append(duplicateLayers).append(',');
          if (target == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_u = "Tonics to strengthen your troops.";
        field_x = "Portals can only be made on open ground";
    }
}
