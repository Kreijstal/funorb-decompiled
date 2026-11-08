/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskArchiveRequest extends ArchiveRequest {
    static int field_I;
    int field_L;
    static int field_F;
    SectorCacheStore field_K;
    static int field_H;
    static String field_J;
    byte[] field_G;

    final static TextWidgetPainter getDefaultTextPainter(int param0) {
        if (param0 != -1) {
          DiskArchiveRequest.releaseStatics(43);
          if (null == AudioPumpThread.field_d) {
            AudioPumpThread.field_d = new TextWidgetPainter(LruTextureCache.field_d, 20, 0, 0, 0, 11579568, -1, 0, 0, LruTextureCache.field_d.field_N, -1, 2147483647, true);
            return AudioPumpThread.field_d;
          }
          return AudioPumpThread.field_d;
        }
        if (null != AudioPumpThread.field_d) {
          return AudioPumpThread.field_d;
        }
        AudioPumpThread.field_d = new TextWidgetPainter(LruTextureCache.field_d, 20, 0, 0, 0, 11579568, -1, 0, 0, LruTextureCache.field_d.field_N, -1, 2147483647, true);
        return AudioPumpThread.field_d;
    }

    public static void releaseStatics(int param0) {
        if (param0 != -1) {
          return;
        }
        field_J = null;
    }

    final static void writeEntryRequestPacket(int param0, int param1, QueuedListRequest param2) {
        BitPacketBuffer var3 = null;
        try {
          var3 = QuickChatHelpDialog.field_Lb;
          var3.writeCipheredByte(param1, (byte) -92);
          int var4 = 76 % ((12 - param0) / 62);
          var3.writeByte(param2.field_n, false);
          var3.writeByte(param2.field_q, false);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "fd.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static IndexedSprite[] loadIndexedSprites(boolean param0, int param1, int param2, Archive param3) {
        RuntimeException var4 = null;
        IndexedSprite[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!AccountTermsPanel.decodeSpriteSheetFromArchive(param1, param3, param2, -93)) {
            return null;
          }
          if (param0) {
            field_J = (String) null;
          }
          stackIn_6_0 = IndexedSpriteHelpers.buildIndexedSprites((byte) 123);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("fd.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static boolean isAsciiDigit(char param0, byte param1) {
        if (param1 <= 72) {
          return true;
        }
        if (param0 < 48) {
          return false;
        }
        if (param0 > 57) {
          return false;
        }
        return true;
    }

    final static boolean isValidIndex(int param0, byte param1) {
        if (param1 != 99) {
          field_F = 86;
          if (!AccountWelcomePanel.isNonNegative(param0, (byte) 114)) {
            return false;
          }
          if (param0 != -2) {
            return true;
          }
          return false;
        }
        if (!AccountWelcomePanel.isNonNegative(param0, (byte) 114)) {
          return false;
        }
        if (param0 != -2) {
          return true;
        }
        return false;
    }

    final int getProgress(boolean param0) {
        if (param0) {
          this.field_G = (byte[]) null;
          if (!this.field_v) {
            return 100;
          }
          return 0;
        }
        if (!this.field_v) {
          return 100;
        }
        return 0;
    }

    DiskArchiveRequest() {
    }

    final byte[] getBytes(boolean param0) {
        if (!param0) {
          DiskArchiveRequest.getDefaultTextPainter(-4);
          if (!this.field_v) {
            return this.field_G;
          }
          throw new RuntimeException();
        }
        if (!this.field_v) {
          return this.field_G;
        }
        throw new RuntimeException();
    }

    static {
        field_I = 0;
    }
}
