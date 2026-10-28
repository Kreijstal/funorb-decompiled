/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TransitionPoint {
    static PcmStreamMixer field_b;
    int y;
    int x;

    final static void writeEncryptedAccountPayload(java.math.BigInteger modulus, boolean guard, java.math.BigInteger exponent, byte[] source, PacketBuffer destination, int length, int offset) {
        String stackIn_24_2 = null;
        String stackIn_27_2 = null;
        String stackIn_30_2 = null;
        String stackIn_33_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          int var7_int = LaserGateSpan.a((byte) 57, length);
          if (null == SpriteCheckboxPainter.field_d) {
            SpriteCheckboxPainter.field_d = new java.security.SecureRandom();
          }
          int[] var13 = new int[4];
          int[] var12 = var13;
          int[] var8 = var12;
          if (guard) {
            TransitionPoint.releaseStatics(43);
          }
          for (int var9 = 0; var9 < 4; var9++) {
            var8[var9] = SpriteCheckboxPainter.field_d.nextInt();
          }
          if (null == NameAvailabilityValidator.field_r ||
            !(var7_int <= NameAvailabilityValidator.field_r.payload.length)) {
            NameAvailabilityValidator.field_r = new PacketBuffer(var7_int);
          }
          NameAvailabilityValidator.field_r.position = 0;
          NameAvailabilityValidator.field_r.writeBytes(length, (byte) 21, offset, source);
          NameAvailabilityValidator.field_r.padToPosition(-1, var7_int);
          NameAvailabilityValidator.field_r.xteaEncrypt(1527987844, var13);
          if (null == ValidationIndicator.field_L ||
            !(100 <= ValidationIndicator.field_L.payload.length)) {
            ValidationIndicator.field_L = new PacketBuffer(100);
          }
          ValidationIndicator.field_L.position = 0;
          ValidationIndicator.field_L.writeByte(10, -123);
          int var11 = 0;
          int var9Lifetime1 = var11;
          while (var11 < 4) {
            ValidationIndicator.field_L.writeInt((byte) 127, var13[var11]);
            var11++;
          }
          ValidationIndicator.field_L.writeShort(48, length);
          ValidationIndicator.field_L.rsaEncrypt((byte) -94, modulus, exponent);
          destination.writeBytes(ValidationIndicator.field_L.position, (byte) 21, 0, ValidationIndicator.field_L.payload);
          destination.writeBytes(NameAvailabilityValidator.field_r.position, (byte) 21, 0, NameAvailabilityValidator.field_r.payload);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_23_0 = var7;
          StringBuilder stackIn_23_1 = new StringBuilder().append("gb.B(");
          if (modulus == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          StringBuilder stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(guard).append(',');
          if (exponent == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          StringBuilder stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (source == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          StringBuilder stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (destination == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(length).append(',').append(offset).append(')').toString());
        }
    }

    final TransitionPoint copy(int guard) {
        if (guard == 10) {
          return new TransitionPoint(this.x, this.y);
        }
        this.y = 110;
        return new TransitionPoint(this.x, this.y);
    }

    final static void renderAccountLayer(boolean option, byte guard, java.awt.Canvas canvas) {
        String stackIn_16_2 = null;
        int var4 = EscapeVector.obfuscationControl;
        try {
          if (AccountNoticeKind.frameworkLoadingStage < 10) {
            boolean var3_int = false;
            if (NameSuggestionsPanel.field_H) {
              NameSuggestionsPanel.field_H = false;
              var3_int = true;
            }
            NameSuggestionsPanel.a((byte) 9, (var3_int), TileSpriteCacheEntry.field_f, AnimatedPathMarker.commonUiLoadProgress(-111), le.b(1));
          } else if (!AccountTermsPanel.l(guard - 89)) {
            SoftwareRasterizer.clearFramebuffer();
            ok.a(240, 320, guard ^ 72);
            SecondaryNodeHashTable.presentRaster(canvas, 0, -1, 0);
          } else if (QuickChatPhraseCache.field_e != 0) {
            TextFieldValidator.a(canvas, 0);
          } else {
            MenuInputState.drawAccountOverlay(option, 1983, false);
            SecondaryNodeHashTable.presentRaster(canvas, 0, -1, 0);
          }
          if (guard == 92) {
            return;
          }
          TransitionPoint.releaseStatics(90);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var3;
          StringBuilder stackIn_15_1 = new StringBuilder().append("gb.E(").append(option).append(',').append(guard).append(',');
          if (canvas == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        if (guard != -5) {
          return;
        }
        field_b = null;
    }

    final static int hitLoginOrDiscardPrompt(int x, int y, int guard) {
        if (!(240 > x)) {
          if (x >= 400) {
            if (guard != 8158) {
              field_b = (PcmStreamMixer) null;
            }
            if (x < 280) {
              return -1;
            }
            if (360 <= x) {
              return -1;
            }
            if (y < 332) {
              return -1;
            }
            if (y >= 359) {
              return -1;
            }
            return 1;
          }
          if (y >= 262 &&
            289 > y) {
            return 0;
          }
          if (guard == 8158) {
            if (x >= 280 &&
              360 > x &&
              y >= 332 &&
              y < 359) {
              return 1;
            }
            return -1;
          }
          field_b = (PcmStreamMixer) null;
        } else if (guard != 8158) {
          field_b = (PcmStreamMixer) null;
        }
        if (x < 280) {
          return -1;
        }
        if (360 <= x) {
          return -1;
        }
        if (y < 332) {
          return -1;
        }
        if (y < 359) {
          return 1;
        }
        return -1;
    }

    TransitionPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static {
    }
}
