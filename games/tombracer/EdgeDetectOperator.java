/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EdgeDetectOperator extends TextureOperator {
    static int[] field_m;
    private int field_n;

    final static int floorDivide(int param0, int param1, int param2) {
        if (param0 != -1) {
          return 4;
        }
        int var3 = param1 >>> 31;
        return (var3 + param1) / param2 - var3;
    }

    public EdgeDetectOperator() {
        super(1, true);
        this.field_n = 4096;
    }

    final static boolean d(int param0, int param1, int param2) {
        if (param2 != 26205) {
          EdgeDetectOperator.floorDivide(-33, 75, 49);
        }
        return (param1 & 256) != 0 ? true : false;
    }

    public static void releaseStatics(byte param0) {
        field_m = null;
        if (param0 >= -85) {
          field_m = (int[]) null;
        }
    }

    final int[] getMonochromeRow(int param0, int param1) {
        int var7 = 0;
        int stackIn_7_0 = 0;
        int[] var3;
        int[] var5;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int[] var17;
        int[] var24;
        int[] var25;
        var16 = TombRacer.field_G ? 1 : 0;
        var17 = this.monochromeCache.getRow((byte) 80, param1);
        var3 = var17;
        if (this.monochromeCache.rowMissed) {
          var24 = this.getInputMonochromeRow(0, -73, -1 + param1 & hba.textureHeightMask);
          var5 = this.getInputMonochromeRow(0, -112, param1);
          var25 = this.getInputMonochromeRow(0, -47, param1 + 1 & hba.textureHeightMask);
          for (var7 = 0; var7 < ns.textureWidth; var7++) {
            var8 = (-var24[var7] + var25[var7]) * this.field_n;
            var9 = this.field_n * (-var5[una.textureWidthMask & var7 - 1] + var5[1 + var7 & una.textureWidthMask]);
            var10 = var9 >> 12;
            var11 = var8 >> 12;
            var12 = var10 * var10 >> 12;
            var13 = var11 * var11 >> 12;
            var14 = (int)(4096.0 * Math.sqrt((double)((float)(var13 + var12 + 4096) / 4096.0f)));
            if (var14 == 0) {
              var17 = var3;
              stackIn_7_0 = 0;
            } else {
              stackIn_7_0 = 16777216 / var14;
            }
            var17 = var3;
            var15 = stackIn_7_0;
            var17[var7] = 4096 - var15;
          }
        }
        if (param0 != 1) {
          this.getMonochromeRow(-51, 114);
        }
        return var17;
    }

    final void decodeParameter(byte param0, PacketBuffer param1, int param2) {
        if (param0 != 107) {
          return;
        }
        try {
          if (param2 == 0) {
            this.field_n = param1.readUnsignedShort(124);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "go.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_m = new int[]{200, 224, 300, 200, 230, 292};
    }
}
