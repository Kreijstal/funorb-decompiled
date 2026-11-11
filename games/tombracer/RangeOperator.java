/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RangeOperator extends TextureOperator {
    static String field_n;
    private int field_m;
    static int field_p;
    private int field_q;
    private int field_o;

    public RangeOperator() {
        super(1, false);
        this.field_q = 2048;
        this.field_m = 1024;
        this.field_o = 3072;
    }

    public static void releaseStatics(int param0) {
        field_n = null;
        if (param0 != -19514) {
          RangeOperator.releaseStatics(80);
        }
    }

    final static void setRendererMode(boolean param0, RendererMode param1) {
        try {
          BitPacketBuffer.setGraphicsSettings(param0, param1, GameFontMetrics.field_f);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ksa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int[] getMonochromeRow(int param0, int param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param0 != 1) {
          this.getColourRow(79, -115);
        }
        int[] var7 = this.monochromeCache.getRow((byte) 64, param1);
        int[] var3 = var7;
        if (this.monochromeCache.rowMissed) {
          var4 = this.getInputMonochromeRow(0, -10, param1);
          for (var5 = 0; var5 < LegacyOpenGlTurbulentTextureEffect.textureWidth; var5++) {
            var7[var5] = (this.field_q * var4[var5] >> 12) + this.field_m;
          }
        }
        return var3;
    }

    final void decodeParameter(byte param0, PacketBuffer param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = param2;
          if (0 == var4_int) {
            this.field_m = param1.readUnsignedShort(param0 ^ 18);
          } else {
            if (var4_int != 1) {
              if (var4_int == 2) {
                stackIn_11_1 = (param1.readUnsignedByte(255) == 1);
                this.monochrome = stackIn_11_1;
              }
            } else {
              this.field_o = param1.readUnsignedShort(param0 ^ 20);
            }
          }
          if (param0 != 107) {
            field_n = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ksa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final void onDecoded(byte param0) {
        if (param0 != 116) {
          this.field_m = 0;
        }
        this.field_q = -this.field_m + this.field_o;
    }

    final int[][] getColourRow(int param0, int param1) {
        int[][] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = TombRacer.field_G ? 1 : 0;
        int[][] var21 = this.colourCache.getRow(param0, (byte) -46);
        int[][] var16 = var21;
        int[][] var14 = var16;
        int[][] var3 = var14;
        if (this.colourCache.field_f) {
          var29 = this.getInputColourRow(param0, 0, -1);
          var30 = var29[0];
          var31 = var29[1];
          var32 = var29[2];
          var8 = var21[0];
          var9 = var21[1];
          var10 = var21[2];
          for (var11 = 0; LegacyOpenGlTurbulentTextureEffect.textureWidth > var11; var11++) {
            var8[var11] = this.field_m + (var30[var11] * this.field_q >> 12);
            var9[var11] = (this.field_q * var31[var11] >> 12) + this.field_m;
            var10[var11] = (this.field_q * var32[var11] >> 12) + this.field_m;
          }
        }
        if (param1 != -1) {
          RendererMode var13 = (RendererMode) null;
          RangeOperator.setRendererMode(true, (RendererMode) null);
        }
        return var3;
    }

    static {
        field_n = "Software";
        field_p = 0;
    }
}
