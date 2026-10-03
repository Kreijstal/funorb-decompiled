/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td extends ButtonWidget {
    private dg field_F;
    static od field_I;
    private int field_G;
    static boolean field_H;
    static int rotatedEntityScreenY;

    final static int a(int param0, byte param1) {
        int var2;
        if (param0 == 0) {
          return 0;
        }
        if (param0 > 0) {
          var2 = 1;
          if (param0 > 65535) {
            param0 = param0 >> 16;
            var2 += 16;
          }
          if (param0 > 255) {
            var2 += 8;
            param0 = param0 >> 8;
          }
          if (param0 > 15) {
            var2 += 4;
            param0 = param0 >> 4;
          }
          if (param0 > 3) {
            var2 += 2;
            param0 = param0 >> 2;
          }
          if (param0 > 1) {
            param0 = param0 >> 1;
            var2++;
          }
          return var2;
        }
        var2 = 2;
        if (param0 < -65536) {
          var2 += 16;
          param0 = param0 >> 16;
        }
        if (param0 < -256) {
          param0 = param0 >> 8;
          var2 += 8;
        }
        if (param1 != 66) {
          field_H = true;
        }
        if (-16 > param0) {
          param0 = param0 >> 4;
          var2 += 4;
        }
        if (param0 < -4) {
          param0 = param0 >> 2;
          var2 += 2;
        }
        if (-2 > param0) {
          var2++;
          param0 = param0 >> 1;
        }
        return var2;
    }

    public static void f(int param0) {
        if (param0 > -114) {
            StringBuilder var2 = (StringBuilder) null;
            td.writeTextAtOffset((CharSequence) null, (StringBuilder) null, -1, -77);
        }
        field_I = null;
    }

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        int var5;
        int var6;
        int var7;
        lh var9;
        int var10;
        int var11;
        int var12;
        Sprite var13;
        Sprite var14;
        Sprite var15;
        var12 = Geoblox.clientControlFlowFlag;
        super.renderWidget(parentX, parentY, (byte) -86, renderPass);
        if (0 != renderPass) {
          return;
        }
        var5 = (this.widgetWidth >> 1) + (this.widgetX + parentX);
        var7 = -74 % ((methodGuard - 1) / 43);
        var6 = parentY - (-this.widgetY - (this.widgetHeight >> 1));
        var9 = this.field_F.a((byte) -105);
        if ((var9 != ImageProducerRasterBuffer.field_g) &&
            (si.field_n != var9)) {
          if (si.field_m == var9) {
            var14 = oa.field_e[2];
            var14.drawAdditive(-(var14.width >> 1) + var5, var6 - (var14.height >> 1), 256);
          } else if (!(var9 != SocketArchiveNetworkClient.field_w)) {
            var15 = oa.field_e[1];
            var15.drawAdditive(-(var15.width >> 1) + var5, var6 - (var15.height >> 1), 256);
          }
        } else {
          var13 = oa.field_e[0];
          var10 = var13.fullWidth << 1;
          var11 = var13.fullHeight << 1;
          if ((null != da.field_b) &&
              (var10 <= da.field_b.width) &&
              (var11 <= da.field_b.height)) {
            Geoblox.setRasterTarget(1, da.field_b);
            SoftwareRasterizer.clearFramebuffer();
          } else {
            da.field_b = new Sprite(var10, var11);
            Geoblox.setRasterTarget(1, da.field_b);
          }
          var13.rotateSmooth(112, 144, var13.fullWidth << 4, var13.fullHeight << 4, -this.field_G << 10, 4096);
          id.a(true);
          da.field_b.drawAdditive(-var13.fullWidth + var5, var6 - var13.fullHeight, 256);
        }
    }

    final static void playPcmSample(int methodGuard, PcmSample sample) {
        try {
            if (methodGuard != -348) {
                PcmSample var3 = (PcmSample) null;
                td.playPcmSample(-67, (PcmSample) null);
            }
            GameplayEntity.registerAudioStream(false, PcmSampleStream.createForPlaybackRate(sample, 100, 96));
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "td.G(" + methodGuard + ',' + (sample != null ? "{...}" : "null") + ')');
        }
    }

    final static StringBuilder writeTextAtOffset(CharSequence sourceText, StringBuilder destination, int writeOffset, int methodGuard) {
        int sourceCharacterIndex = 0;
        int characterWriteOffset = 0;
        int originalLength = 0;
        RuntimeException var4 = null;
        int sourceLength = 0;
        int writeEndOffset = 0;
        int controlFlowGuard = 0;
        PcmSample var9 = null;
        StringBuilder stackIn_9_0 = null;
        StringBuilder stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        controlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard <= 23) {
            var9 = (PcmSample) null;
            td.playPcmSample(-80, (PcmSample) null);
          }
          originalLength = destination.length();
          if ((writeOffset >= 0) &&
              (originalLength >= writeOffset)) {
            sourceLength = sourceText.length();
            if (sourceLength == 0) {
              stackIn_9_0 = (StringBuilder) (destination);
              return stackIn_9_0;
            }
            writeEndOffset = writeOffset + sourceLength;
            if (originalLength < writeEndOffset) {
              destination.setLength(writeEndOffset);
            }
            for (sourceCharacterIndex = 0; sourceCharacterIndex < sourceLength; sourceCharacterIndex++) {
              characterWriteOffset = writeOffset;
              writeOffset++;
              destination.setCharAt(characterWriteOffset, sourceText.charAt(sourceCharacterIndex));
            }
            stackIn_17_0 = (StringBuilder) (destination);
            return stackIn_17_0;
          }
          throw new StringIndexOutOfBoundsException("length=" + originalLength + " startPos=" + writeOffset);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("td.J(");
          if (sourceText == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (destination == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(writeOffset).append(',').append(methodGuard).append(')').toString());
        }
    }

    final void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        try {
            this.field_G = this.field_G + 1;
            super.updatePointerState(hoverGuard, parentY, eventContext, parentX);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "td.H(" + hoverGuard + ',' + parentY + ',' + (eventContext != null ? "{...}" : "null") + ',' + parentX + ')');
        }
    }

    final static void advanceLogoAnimationTick(byte methodGuard) {
        int guardRemainder = -28 % ((methodGuard - 36) / 43);
        if (DequeCursor.logoAnimationTick != -DiskCacheWorker.logoStartDelayTicks + 0 && 250 - DiskCacheWorker.logoStartDelayTicks == DequeCursor.logoAnimationTick) {
        }
        DequeCursor.logoAnimationTick = DequeCursor.logoAnimationTick + 1;
    }

    final boolean requestKeyboardFocus(byte methodGuard, UiWidget focusContext) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (methodGuard > -30) {
            this.renderWidget(89, -88, (byte) -40, -90);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("td.UA(").append(methodGuard).append(',');
          if (focusContext == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (param0 != -93) {
            return;
        }
        md.activeScorePopups.moveAllTo(ue.availableScorePopups, (byte) -70);
    }

    td(dg param0) {
        try {
            this.field_F = param0;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "td.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String getHoverText(byte methodGuard) {
        if (methodGuard != 69) {
            return (String) null;
        }
        if (!(!this.pointerInside)) {
            return this.field_F.c(-21666);
        }
        return null;
    }

    static {
        field_I = new od("");
    }
}
