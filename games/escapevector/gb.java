/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static PcmStreamMixer field_b;
    int field_c;
    int field_a;

    final static void a(java.math.BigInteger param0, boolean param1, java.math.BigInteger param2, byte[] param3, PacketBuffer param4, int param5, int param6) {
        String stackIn_24_2 = null;
        String stackIn_27_2 = null;
        String stackIn_30_2 = null;
        String stackIn_33_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          int var7_int = LaserGateSpan.a((byte) 57, param5);
          if (null == SpriteCheckboxPainter.field_d) {
            SpriteCheckboxPainter.field_d = new java.security.SecureRandom();
          }
          int[] var13 = new int[4];
          int[] var12 = var13;
          int[] var8 = var12;
          if (param1) {
            gb.releaseStatics(43);
          }
          for (int var9 = 0; var9 < 4; var9++) {
            var8[var9] = SpriteCheckboxPainter.field_d.nextInt();
          }
          if (null == NameAvailabilityValidator.field_r ||
            !(var7_int <= NameAvailabilityValidator.field_r.payload.length)) {
            NameAvailabilityValidator.field_r = new PacketBuffer(var7_int);
          }
          NameAvailabilityValidator.field_r.position = 0;
          NameAvailabilityValidator.field_r.writeBytes(param5, (byte) 21, param6, param3);
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
          ValidationIndicator.field_L.writeShort(48, param5);
          ValidationIndicator.field_L.rsaEncrypt((byte) -94, param0, param2);
          param4.writeBytes(ValidationIndicator.field_L.position, (byte) 21, 0, ValidationIndicator.field_L.payload);
          param4.writeBytes(NameAvailabilityValidator.field_r.position, (byte) 21, 0, NameAvailabilityValidator.field_r.payload);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_23_0 = var7;
          StringBuilder stackIn_23_1 = new StringBuilder().append("gb.B(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          StringBuilder stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          StringBuilder stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          StringBuilder stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param4 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final gb a(int param0) {
        if (param0 == 10) {
          return new gb(this.field_a, this.field_c);
        }
        this.field_c = 110;
        return new gb(this.field_a, this.field_c);
    }

    final static void a(boolean param0, byte param1, java.awt.Canvas param2) {
        String stackIn_16_2 = null;
        int var4 = EscapeVector.obfuscationControl;
        try {
          if (fc.field_a < 10) {
            boolean var3_int = false;
            if (NameSuggestionsPanel.field_H) {
              NameSuggestionsPanel.field_H = false;
              var3_int = true;
            }
            NameSuggestionsPanel.a((byte) 9, (var3_int), TileSpriteCacheEntry.field_f, qe.a(-111), le.b(1));
          } else if (!AccountTermsPanel.l(param1 - 89)) {
            SoftwareRasterizer.clearFramebuffer();
            ok.a(240, 320, param1 ^ 72);
            SecondaryNodeHashTable.presentRaster(param2, 0, -1, 0);
          } else if (QuickChatPhraseCache.field_e != 0) {
            TextFieldValidator.a(param2, 0);
          } else {
            wc.a(param0, 1983, false);
            SecondaryNodeHashTable.presentRaster(param2, 0, -1, 0);
          }
          if (param1 == 92) {
            return;
          }
          gb.releaseStatics(90);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var3;
          StringBuilder stackIn_15_1 = new StringBuilder().append("gb.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
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

    final static int a(int param0, int param1, int param2) {
        if (!(240 > param0)) {
          if (param0 >= 400) {
            if (param2 != 8158) {
              field_b = (PcmStreamMixer) null;
            }
            if (param0 < 280) {
              return -1;
            }
            if (360 <= param0) {
              return -1;
            }
            if (param1 < 332) {
              return -1;
            }
            if (param1 >= 359) {
              return -1;
            }
            return 1;
          }
          if (param1 >= 262 &&
            289 > param1) {
            return 0;
          }
          if (param2 == 8158) {
            if (param0 >= 280 &&
              360 > param0 &&
              param1 >= 332 &&
              param1 < 359) {
              return 1;
            }
            return -1;
          }
          field_b = (PcmStreamMixer) null;
        } else if (param2 != 8158) {
          field_b = (PcmStreamMixer) null;
        }
        if (param0 < 280) {
          return -1;
        }
        if (360 <= param0) {
          return -1;
        }
        if (param1 < 332) {
          return -1;
        }
        if (param1 < 359) {
          return 1;
        }
        return -1;
    }

    gb(int param0, int param1) {
        this.field_a = param0;
        this.field_c = param1;
    }

    static {
    }
}
