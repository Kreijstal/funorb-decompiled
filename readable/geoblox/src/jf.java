/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf implements dh {
    private int field_i;
    static int field_g;
    private int field_d;
    static int[] field_b;
    private int field_e;
    static int avatarTintFadeTicks;
    static Sprite rotatedThemeForegroundRaster;
    private int field_h;
    private BitmapFont field_f;
    private int field_k;
    private int field_l;
    static int pendingActionPanelWidth;

    final static void a(byte param0) {
        gf.field_d = new qh();
        if (param0 >= 19) {
            hk.field_C.b(gf.field_d, -54);
            return;
        }
        rotatedThemeForegroundRaster = (Sprite) null;
        hk.field_C.b(gf.field_d, -54);
    }

    public final void a(int param0, int param1, int param2, boolean param3, el param4) {
        int var10 = 0;
        el stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        ol var12 = null;
        var11 = Geoblox.field_C;
        try {
          if (param4 instanceof ol) {
            stackIn_4_0 = (el) (param4);
          } else {
            stackIn_4_0 = null;
          }
          var12 = (ol) ((Object) stackIn_4_0);
          if (param1 >= -5) {
            return;
          }
          if (var12 == null) {
          }
          SoftwareRasterizer.fillRectangle(param4.field_v + param0, param4.field_m + param2, param4.field_r, param4.field_h, this.field_h);
          var7 = -(2 * var12.field_H) + param4.field_r;
          var8 = param0 - (-param4.field_v - var12.field_H);
          var9 = var12.field_G + param2 + param4.field_m;
          SoftwareRasterizer.drawLine(var8, var9, var7 + var8, var9, this.field_d);
          for (var10 = var12.a((byte) 86) - 1; var10 >= 0; var10--) {
            SoftwareRasterizer.fillCircle(var7 * var12.c(-113, var10) / var12.g(-128) + var8, var9, this.field_i, this.field_e);
          }
          if (null == this.field_f) {
            return;
          }
          this.field_f.drawCenteredText(var12.field_s, var8 + var7 / 2, this.field_f.lineAdvance + var9 + var12.field_G, this.field_k, this.field_l);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = (RuntimeException) (var6);
          stackIn_15_1 = new StringBuilder().append("jf.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static java.awt.Container a(boolean param0) {
        if (sg.field_a != null) {
            return (java.awt.Container) ((Object) sg.field_a);
        }
        if (!param0) {
            pendingActionPanelWidth = 78;
            return (java.awt.Container) ((Object) k.c(122));
        }
        return (java.awt.Container) ((Object) k.c(122));
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[] param9) {
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var16 = Geoblox.field_C;
        try {
          while (true) {
            param7--;
            if (param7 < 0) {
              if (param2 == 33423689) {
                return;
              }
              pendingActionPanelWidth = -7;
              return;
            }
            var17 = param9;
            var10 = var17;
            var11 = param0;
            var12 = param3;
            var13 = param5;
            var14 = param8;
            var15 = var17[var11] >> 1 & 8355711;
            var10[var11] = cd.andInt(255, var14 >> 17) + ((cd.andInt(33423689, var13) >> 9) + (cd.andInt(33423360, var12) >> 1)) + var15;
            param0++;
            param8 = param8 + param4;
            param3 = param3 + param1;
            param5 = param5 + param6;
            continue;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = (RuntimeException) (var10_ref);
          stackIn_8_1 = new StringBuilder().append("jf.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        rotatedThemeForegroundRaster = null;
        int var1 = 14 % ((param0 - 27) / 47);
        field_b = null;
    }

    final static void a(Sprite[] param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        CharSequence var12 = null;
        var11 = Geoblox.field_C;
        try {
          if (param0 != null) {
            if (param3 > 0) {
              var6_int = param0[0].fullWidth;
              var7 = param0[2].fullWidth;
              var8 = param0[1].fullWidth;
              param0[0].drawGrayTinted(param2, param4, param1);
              param0[2].drawGrayTinted(-var7 + (param2 + param3), param4, param1);
              SoftwareRasterizer.saveClip(da.field_d);
              SoftwareRasterizer.intersectClip(var6_int + param2, param4, -var7 + param3 + param2, param4 + param0[1].fullHeight);
              var9 = param2 + var6_int;
              var10 = -var7 + (param2 + param3);
              for (param2 = var9; param2 < var10; param2 = param2 + var8) {
                param0[1].drawGrayTinted(param2, param4, param1);
              }
              SoftwareRasterizer.restoreClip(da.field_d);
              if (param5 == -17154) {
                return;
              }
              var12 = (CharSequence) null;
              jf.encodeTextBytes((CharSequence) null, (byte) 66);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = (RuntimeException) (var6);
          stackIn_13_1 = new StringBuilder().append("jf.G(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static byte[] encodeTextBytes(CharSequence text, byte methodGuard) {
        int characterIndex = 0;
        byte[] encodedBytesBeforeReturn = null;
        RuntimeException encodingFailureBeforeDescription = null;
        StringBuilder encodingMessagePrefix = null;
        String textDescription = null;
        RuntimeException caughtEncodingFailure = null;
        int textLength = 0;
        RuntimeException encodingFailureForContext = null;
        byte[] encodedBytes = null;
        int characterCode = 0;
        int unusedClientGuardSnapshot = 0;
        int[] unusedNullIntArraySnapshot = null;
        unusedClientGuardSnapshot = Geoblox.field_C;
        try {
          if (methodGuard < 117) {
            unusedNullIntArraySnapshot = (int[]) null;
            jf.a(25, 87, -85, 85, 111, -85, 50, 110, -77, (int[]) null);
          }
          textLength = text.length();
          encodedBytes = new byte[textLength];
          for (characterIndex = 0; textLength > characterIndex; characterIndex++) {
            L2: {
              L3: {
                characterCode = text.charAt(characterIndex);
                if (characterCode > 0) {
                  if (characterCode < 128) {
                    break L3;
                  }
                }
                if (characterCode >= 160) {
                  if (255 >= characterCode) {
                    break L3;
                  }
                }
                if (8364 == characterCode) {
                  encodedBytes[characterIndex] = (byte)-128;
                  break L2;
                }
                if (characterCode == 8218) {
                  encodedBytes[characterIndex] = (byte)-126;
                  break L2;
                }
                if (402 == characterCode) {
                  encodedBytes[characterIndex] = (byte)-125;
                  break L2;
                }
                if (8222 == characterCode) {
                  encodedBytes[characterIndex] = (byte)-124;
                  break L2;
                }
                if (characterCode == 8230) {
                  encodedBytes[characterIndex] = (byte)-123;
                  break L2;
                }
                if (characterCode == 8224) {
                  encodedBytes[characterIndex] = (byte)-122;
                  break L2;
                }
                if (characterCode == 8225) {
                  encodedBytes[characterIndex] = (byte)-121;
                  break L2;
                }
                if (characterCode == 710) {
                  encodedBytes[characterIndex] = (byte)-120;
                  break L2;
                }
                if (characterCode == 8240) {
                  encodedBytes[characterIndex] = (byte)-119;
                  break L2;
                }
                if (352 == characterCode) {
                  encodedBytes[characterIndex] = (byte)-118;
                  break L2;
                }
                if (8249 == characterCode) {
                  encodedBytes[characterIndex] = (byte)-117;
                  break L2;
                }
                if (338 == characterCode) {
                  encodedBytes[characterIndex] = (byte)-116;
                  break L2;
                }
                if (characterCode == 381) {
                  encodedBytes[characterIndex] = (byte)-114;
                  break L2;
                }
                if (8216 == characterCode) {
                  encodedBytes[characterIndex] = (byte)-111;
                  break L2;
                }
                if (8217 == characterCode) {
                  encodedBytes[characterIndex] = (byte)-110;
                  break L2;
                }
                if (characterCode == 8220) {
                  encodedBytes[characterIndex] = (byte)-109;
                  break L2;
                }
                if (characterCode == 8221) {
                  encodedBytes[characterIndex] = (byte)-108;
                  break L2;
                }
                if (characterCode == 8226) {
                  encodedBytes[characterIndex] = (byte)-107;
                  break L2;
                }
                if (8211 == characterCode) {
                  encodedBytes[characterIndex] = (byte)-106;
                  break L2;
                }
                if (characterCode == 8212) {
                  encodedBytes[characterIndex] = (byte)-105;
                  break L2;
                }
                if (characterCode == 732) {
                  encodedBytes[characterIndex] = (byte)-104;
                  break L2;
                }
                if (characterCode == 8482) {
                  encodedBytes[characterIndex] = (byte)-103;
                  break L2;
                }
                if (characterCode == 353) {
                  encodedBytes[characterIndex] = (byte)-102;
                  break L2;
                }
                if (characterCode == 8250) {
                  encodedBytes[characterIndex] = (byte)-101;
                  break L2;
                }
                if (characterCode == 339) {
                  encodedBytes[characterIndex] = (byte)-100;
                  break L2;
                }
                if (characterCode == 382) {
                  encodedBytes[characterIndex] = (byte)-98;
                  break L2;
                }
                if (characterCode != 376) {
                  encodedBytes[characterIndex] = (byte)63;
                  break L2;
                }
                encodedBytes[characterIndex] = (byte)-97;
                break L2;
              }
              encodedBytes[characterIndex] = (byte)characterCode;
            }
          }
          encodedBytesBeforeReturn = (byte[]) (encodedBytes);
          return encodedBytesBeforeReturn;
        } catch (java.lang.RuntimeException encodingFailure) {
          caughtEncodingFailure = encodingFailure;
          encodingFailureForContext = caughtEncodingFailure;
          encodingFailureBeforeDescription = (RuntimeException) (encodingFailureForContext);
          encodingMessagePrefix = new StringBuilder().append("jf.C(");
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) encodingFailureBeforeDescription), ((StringBuilder) (Object) encodingMessagePrefix).append(textDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    jf(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_d = param3;
            this.field_h = param4;
            this.field_e = param6;
            this.field_f = param0;
            this.field_i = param5;
            this.field_k = param1;
            this.field_l = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "jf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        avatarTintFadeTicks = 0;
        field_g = 3;
    }
}
