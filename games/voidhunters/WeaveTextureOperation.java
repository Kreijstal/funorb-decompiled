/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WeaveTextureOperation extends TextureOperation {
    private int stripWidth;
    static int[] field_i;

    final int[] getMonochromeRow(int param0, boolean param1) {
        int var5 = 0;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_37_0 = 0;
        int[] var3;
        int var4;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int[] var10;
        int[] var11;
        int[] var9Lifetime1;
        int[] var11Lifetime1;
        var8 = VoidHunters.field_G;
        if (!param1) {
          return (int[]) null;
        }
        var11 = this.field_f.getRow((byte) 124, param0);
        var10 = var11;
        var9 = var10;
        var3 = var9;
        if (!this.field_f.field_e) {
          return var9;
        }
        var4 = SetSalvoUsesAllEnergy.textureYCoordinates[param0];
        for (var5 = 0; TextHotspotRegion.textureWidth > var5; var5++) {
          var6 = BoxBlurTextureOperation.textureXCoordinates[var5];
          if (var6 > this.stripWidth &&
            4096 - this.stripWidth > var6 &&
            2048 - this.stripWidth < var4 &&
            this.stripWidth + 2048 > var4) {
            var7 = 2048 - var6;
            if (var7 >= 0) {
              var9 = var3;
              var11 = var10;
              stackIn_13_0 = var7;
            } else {
              stackIn_13_0 = -var7;
            }
            var9 = var3;
            var11 = var10;
            var7 = stackIn_13_0;
            var7 = var7 << 12;
            var7 = var7 / (2048 - this.stripWidth);
            var9[var5] = 4096 - var7;
          } else if (2048 - this.stripWidth < var6 &&
            var6 < 2048 + this.stripWidth) {
            var7 = var4 - 2048;
            if (var7 >= 0) {
              stackIn_21_0 = var7;
            } else {
              stackIn_21_0 = -var7;
            }
            var7 = stackIn_21_0;
            var7 = var7 - this.stripWidth;
            var7 = var7 << 12;
            var9[var5] = var7 / (2048 - this.stripWidth);
          } else if (var4 >= this.stripWidth &&
            -this.stripWidth + 4096 >= var4) {
            if (this.stripWidth <= var6 &&
              -this.stripWidth + 4096 >= var6) {
              var11[var5] = 0;
            } else {
              var7 = -var4 + 2048;
              if (0 > var7) {
                stackIn_37_0 = -var7;
              } else {
                stackIn_37_0 = var7;
              }
              var7 = stackIn_37_0;
              var7 = var7 << 12;
              var7 = var7 / (-this.stripWidth + 2048);
              var9[var5] = -var7 + 4096;
            }
          } else {
            var7 = var6 - 2048;
            if (var7 >= 0) {
              stackIn_29_0 = var7;
            } else {
              stackIn_29_0 = -var7;
            }
            var7 = stackIn_29_0;
            var7 = var7 - this.stripWidth;
            var7 = var7 << 12;
            var9[var5] = var7 / (-this.stripWidth + 2048);
          }
        }
        var9Lifetime1 = var3;
        var11Lifetime1 = var10;
        return var9Lifetime1;
    }

    public WeaveTextureOperation() {
        super(0, true);
        this.stripWidth = 585;
    }

    final void decodeParameter(int param0, int param1, PacketBuffer param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0;
          if (var4_int == 0) {
            this.stripWidth = param2.readUnsignedShort(1869);
          }
          if (param1 <= -60) {
            return;
          }
          WeaveTextureOperation.clearSharedReferences(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("gw.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(boolean param0) {
        if (param0) {
          field_i = (int[]) null;
          field_i = null;
          return;
        }
        field_i = null;
    }

    static {
        field_i = new int[8192];
    }
}
