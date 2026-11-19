/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveContainerHelpers {
    static int field_c;
    static int field_f;
    static boolean field_b;
    static String loadingMessage;
    static int field_d;
    static int field_e;

    public static void releaseStatics(int param0) {
        if (param0 != 256) {
          byte[] var2 = (byte[]) null;
          ArchiveContainerHelpers.decompressArchiveContainer((byte[]) null, -61);
          loadingMessage = null;
          return;
        }
        loadingMessage = null;
    }

    final static boolean requestSessionReconnect(int param0) {
        int var1 = 118 / ((param0 + 4) / 48);
        BoundedRandomAccessFile.field_b = true;
        Base37Codec.field_c = MonotonicClockHelpers.monotonicMillis((byte) 91) + 15000L;
        return ArchiveRequest.field_t == 11 ? true : false;
    }

    final static void drawLogoAnimation(int param0, int param1, byte param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        var9 = wizardrun.field_H;
        if (DualLinkNodeHashTable.field_f < 0) {
          return;
        }
        var3 = -135 + param0;
        var4 = param1 - 35;
        var5 = 256;
        if (DualLinkNodeHashTable.field_f < 75) {
          var5 = (DualLinkNodeHashTable.field_f << 8) / 75;
        }
        if (DualLinkNodeHashTable.field_f > 200) {
          var5 = (-DualLinkNodeHashTable.field_f + 250 << 8) / 50;
        }
        UrlPacketDownloader.pushSpriteRaster(CharSequenceJoiner.field_a, false);
        TriangleRasterState.useRasterClip();
        var6 = 14 % ((param2 + 9) / 50);
        SoftwareRasterizer.clear();
        ContentTransitionDialog.drawLogoMeshes(-120);
        if (var5 < 256) {
          SoftwareRasterizer.fillRectangleBlended(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, 256 - var5);
          UsernameLoginCredentials.popRasterState(4);
          if (DualLinkNodeHashTable.field_f < 150) {
            CharSequenceJoiner.field_a.drawHalfSize(var3, var4);
          } else {
            TextLayout.field_a.drawAlpha(var3 + 15, var4 + 10, var5);
          }
        } else {
          UsernameLoginCredentials.popRasterState(4);
          if (DualLinkNodeHashTable.field_f < 150) {
            CharSequenceJoiner.field_a.drawHalfSize(var3, var4);
            var7 = DualLinkNodeHashTable.field_f - 125;
            if (var7 <= 0) {
              var7 = DualLinkNodeHashTable.field_f - 140;
              if (0 < var7) {
                var8 = 256;
                if (var7 < 20) {
                  var8 = 256 * var7 / 20;
                }
                StyleNode.field_q.drawAlpha(var3 + 15, 10 + var4, var5 * var8 >> 8);
              }
            } else {
              if (50 <= var7) {
                var7 = DualLinkNodeHashTable.field_f - 140;
                if (0 < var7) {
                  var8 = 256;
                  if (var7 < 20) {
                    var8 = 256 * var7 / 20;
                  }
                  StyleNode.field_q.drawAlpha(var3 + 15, 10 + var4, var5 * var8 >> 8);
                }
              } else {
                if (var7 < 20) {
                  var8 = var7 * 256 / 20;
                  StrongCacheEntry.field_t.drawAdditive(var3, var4, var8);
                  var7 = DualLinkNodeHashTable.field_f - 140;
                  if (0 < var7) {
                    var8 = 256;
                    if (var7 < 20) {
                      var8 = 256 * var7 / 20;
                    }
                    StyleNode.field_q.drawAlpha(var3 + 15, 10 + var4, var5 * var8 >> 8);
                  }
                } else {
                  if (var7 < 30) {
                    StrongCacheEntry.field_t.drawAdditive(var3, var4, 256);
                    var7 = DualLinkNodeHashTable.field_f - 140;
                    if (0 < var7) {
                      var8 = 256;
                      if (var7 < 20) {
                        var8 = 256 * var7 / 20;
                      }
                      StyleNode.field_q.drawAlpha(var3 + 15, 10 + var4, var5 * var8 >> 8);
                    }
                  } else {
                    var8 = (50 - var7) * 256 / 20;
                    StrongCacheEntry.field_t.drawAdditive(var3, var4, var8);
                    var7 = DualLinkNodeHashTable.field_f - 140;
                    if (0 < var7) {
                      var8 = 256;
                      if (var7 < 20) {
                        var8 = 256 * var7 / 20;
                      }
                      StyleNode.field_q.drawAlpha(var3 + 15, 10 + var4, var5 * var8 >> 8);
                    }
                  }
                }
              }
            }
            return;
          }
          TextLayout.field_a.drawAlpha(var3 + 15, var4 + 10, var5);
        }
        var7Lifetime1 = DualLinkNodeHashTable.field_f - 125;
        if (var7Lifetime1 > 0 &&
          50 > var7Lifetime1) {
          if (var7Lifetime1 < 20) {
            var8Lifetime1 = var7Lifetime1 * 256 / 20;
            StrongCacheEntry.field_t.drawAdditive(var3, var4, var8Lifetime1);
          } else {
            if (var7Lifetime1 < 30) {
              StrongCacheEntry.field_t.drawAdditive(var3, var4, 256);
            } else {
              var8Lifetime1 = (50 - var7Lifetime1) * 256 / 20;
              StrongCacheEntry.field_t.drawAdditive(var3, var4, var8Lifetime1);
            }
          }
        }
        var7Lifetime2 = DualLinkNodeHashTable.field_f - 140;
        if (0 < var7Lifetime2) {
          var8Lifetime2 = 256;
          if (var7Lifetime2 < 20) {
            var8Lifetime2 = 256 * var7Lifetime2 / 20;
          }
          StyleNode.field_q.drawAlpha(var3 + 15, 10 + var4, var5 * var8Lifetime2 >> 8);
        }
        return;
    }

    final static String getAccountEmail(int param0) {
        if (NetworkArchiveRequest.field_y == TextButton.field_E) {
          return UiSpriteThemeHelpers.field_a;
        }
        if (param0 != -21) {
          ArchiveContainerHelpers.releaseStatics(-90);
          if (!UiSpriteThemeHelpers.field_c.isComplete(true)) {
            return UiSpriteThemeHelpers.field_c.getEmail((byte) 8);
          }
          if (TextButton.field_E != ChatMessage.field_j) {
            return ResizableDialog.field_S;
          }
          return UiSpriteThemeHelpers.field_c.getEmail((byte) 8);
        }
        if (!UiSpriteThemeHelpers.field_c.isComplete(true)) {
          return UiSpriteThemeHelpers.field_c.getEmail((byte) 8);
        }
        if (TextButton.field_E != ChatMessage.field_j) {
          return ResizableDialog.field_S;
        }
        return UiSpriteThemeHelpers.field_c.getEmail((byte) 8);
    }

    final static byte[] decompressArchiveContainer(byte[] param0, int param1) {
        byte[] stackIn_2_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        PacketBuffer var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          var9 = new PacketBuffer(param0);
          if (param1 != 31027) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          var3 = var9.readUnsignedByte(255);
          var4 = var9.readInt(param1 - 30772);
          if (var4 >= 0 && (SavedDataRequest.field_k == 0 ||
            !(SavedDataRequest.field_k < var4))) {
            if (0 == var3) {
              var12 = new byte[var4];
              var10 = var12;
              var5_ref_byte__ = var10;
              var9.readBytes(true, var4, var12, 0);
              stackIn_10_0 = var5_ref_byte__;
              return stackIn_10_0;
            }
            var5 = var9.readInt(param1 ^ 31180);
            if (var5 >= 0 && (SavedDataRequest.field_k == 0 ||
              !(SavedDataRequest.field_k < var5))) {
              var13 = new byte[var5];
              var11 = var13;
              var6 = var11;
              if (1 == var3) {
                Bzip2Decoder.decompress(var13, var5, param0, var4, 9);
              } else {
                var7 = AccountConsentPanel.field_I;
                synchronized (var7) {
                  AccountConsentPanel.field_I.decompress(var13, var9, param1 - 24115);
                }
              }
              stackIn_24_0 = var6;
              return stackIn_24_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("dg.E(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_e = 0;
        field_b = true;
    }
}
