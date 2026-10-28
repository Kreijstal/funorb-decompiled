/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Js5NetworkRequest extends ArchiveRequest {
    static Sprite field_H;
    byte paddingBytes;
    int blockOffset;
    static int field_D;
    PacketBuffer responseBuffer;
    static boolean field_E;
    static String field_C;
    static int field_z;
    static String[] field_I;
    static Sprite field_G;
    static String field_B;
    static int field_x;

    final static boolean a(byte param0, int param1) {
        if (param1 == 13) {
          return true;
        }
        if (param0 == 15) {
          return HighscorePlayerRecord.field_d.isInitialActivation((byte) -18);
        }
        Js5NetworkRequest.releaseStatics((byte) 54);
        return HighscorePlayerRecord.field_d.isInitialActivation((byte) -18);
    }

    final static byte[] decompressGroup(byte guard, byte[] bytes) {
        String stackIn_27_2 = null;
        try {
          PacketBuffer var10 = new PacketBuffer(bytes);
          int var3 = var10.readUnsignedByte(0);
          if (guard != -26) {
            CharSequence[] var9 = (CharSequence[]) null;
            Js5NetworkRequest.joinText((byte) 49, (CharSequence[]) null);
          }
          int var4 = var10.readInt(-5053);
          if (0 <= var4 && (TetherHumStream.field_q == 0 ||
            !(TetherHumStream.field_q < var4))) {
            if (var3 == 0) {
              byte[] var13 = new byte[var4];
              byte[] var11 = var13;
              byte[] var5_ref_byte__ = var11;
              var10.readBytes(var13, (byte) -96, 0, var4);
              byte[] stackIn_9_0 = var5_ref_byte__;
              return stackIn_9_0;
            }
            int var5 = var10.readInt(-5053);
            if (0 <= var5 && (TetherHumStream.field_q == 0 ||
              !(TetherHumStream.field_q < var5))) {
              byte[] var14 = new byte[var5];
              byte[] var12 = var14;
              byte[] var6 = var12;
              if (1 != var3) {
                Object var7 = SpriteStrip.field_g;
                synchronized (var7) {
                  SpriteStrip.field_g.decompress(122, var14, var10);
                }
              } else {
                Bzip2Decoder.a(var14, var5, bytes, var4, 9);
              }
              byte[] stackIn_23_0 = var6;
              return stackIn_23_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_26_0 = var2;
          StringBuilder stackIn_26_1 = new StringBuilder().append("s.G(").append(guard).append(',');
          if (bytes == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte guard) {
        if (guard != 34) {
          return;
        }
        field_B = null;
        field_I = null;
        field_H = null;
        field_G = null;
        field_C = null;
    }

    Js5NetworkRequest() {
    }

    final byte[] getBytes(boolean guard) {
        if (this.pending) {
          throw new RuntimeException();
        }
        if (this.responseBuffer.position < this.responseBuffer.payload.length - this.paddingBytes) {
          throw new RuntimeException();
        }
        if (guard) {
          return this.responseBuffer.payload;
        }
        this.responseBuffer = (PacketBuffer) null;
        return this.responseBuffer.payload;
    }

    final int progress(int guard) {
        if (guard != 100) {
          this.blockOffset = -96;
          if (null == this.responseBuffer) {
            return 0;
          }
          return this.responseBuffer.position * 100 / (-this.paddingBytes + this.responseBuffer.payload.length);
        }
        if (null == this.responseBuffer) {
          return 0;
        }
        return this.responseBuffer.position * 100 / (-this.paddingBytes + this.responseBuffer.payload.length);
    }

    final static String joinText(byte guard, CharSequence[] parts) {
        String stackIn_7_2 = null;
        try {
          if (guard >= -4) {
            CharSequence[] var3 = (CharSequence[]) null;
            Js5NetworkRequest.joinText((byte) -12, (CharSequence[]) null);
          }
          String stackIn_3_0 = GameProgressSupport.joinRange(0, parts.length, parts, 4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("s.B(").append(guard).append(',');
          if (parts == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_C = "Mouse over an icon for details";
        field_D = 0;
        field_B = "Names can only contain letters, numbers, spaces and underscores";
    }
}
