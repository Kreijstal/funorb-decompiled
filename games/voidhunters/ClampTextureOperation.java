/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClampTextureOperation extends TextureOperation {
    private int upperBound;
    private int lowerBound;

    final int[] getMonochromeRow(int param0, boolean param1) {
        int var5 = 0;
        int[] var3;
        int[] var4;
        int var6;
        int var7;
        var7 = VoidHunters.field_G;
        var3 = this.field_f.getRow((byte) -117, param0);
        if (this.field_f.field_e) {
          var4 = this.getInputMonochromeRow(0, param0, 255);
          for (var5 = 0; var5 < hob.textureWidth; var5++) {
            var6 = var4[var5];
            if (this.lowerBound > var6) {
              var3[var5] = this.lowerBound;
            } else {
              if (var6 > this.upperBound) {
                var3[var5] = this.upperBound;
              } else {
                var3[var5] = var6;
              }
            }
          }
        }
        if (param1) {
          return var3;
        }
        return (int[]) null;
    }

    public ClampTextureOperation() {
        super(1, false);
        this.upperBound = 4096;
        this.lowerBound = 0;
    }

    final int[][] getColorRow(int param0, int param1) {
        int var11 = 0;
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var12;
        int var13;
        int var14;
        int var15;
        PacketBuffer var16;
        int[][] var17;
        int[][] var19;
        int[] var23;
        int[] var24;
        int[] var25;
        int[][] var27;
        int[] var31;
        int[] var32;
        int[] var33;
        int[][] var38;
        int[] var39;
        int[] var40;
        int[] var41;
        var15 = VoidHunters.field_G;
        if (param0 != 255) {
          var16 = (PacketBuffer) null;
          this.decodeParameter(-114, -34, (PacketBuffer) null);
        }
        var27 = this.field_d.getRow(param1, (byte) -117);
        var19 = var27;
        var17 = var19;
        var3 = var17;
        if (this.field_d.field_g) {
          var38 = this.getInputColorRow((byte) 94, 0, param1);
          var39 = var38[0];
          var40 = var38[1];
          var41 = var38[2];
          var31 = var27[0];
          var23 = var31;
          var8 = var23;
          var32 = var27[1];
          var24 = var32;
          var9 = var24;
          var33 = var27[2];
          var25 = var33;
          var10 = var25;
          for (var11 = 0; hob.textureWidth > var11; var11++) {
            var12 = var39[var11];
            var13 = var40[var11];
            var14 = var41[var11];
            if (this.lowerBound <= var12) {
              if (var12 > this.upperBound) {
                var8[var11] = this.upperBound;
              } else {
                var31[var11] = var12;
              }
            } else {
              var8[var11] = this.lowerBound;
            }
            if (var13 >= this.lowerBound) {
              if (var13 <= this.upperBound) {
                var32[var11] = var13;
              } else {
                var9[var11] = this.upperBound;
              }
            } else {
              var9[var11] = this.lowerBound;
            }
            if (this.lowerBound <= var14) {
              if (var14 <= this.upperBound) {
                var33[var11] = var14;
              } else {
                var10[var11] = this.upperBound;
              }
            } else {
              var10[var11] = this.lowerBound;
            }
          }
        }
        return var3;
    }

    final void decodeParameter(int param0, int param1, PacketBuffer param2) {
        int var4_int = 0;
        int var5 = 0;
        boolean stackIn_14_1 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          if (param1 >= -60) {
            this.lowerBound = -128;
          }
          var4_int = param0;
          if (var4_int != 0) {
            if (var4_int != 1) {
              if (2 == var4_int) {
                stackIn_14_1 = (param2.readUnsignedByte((byte) -101) == 1);
                this.field_g = stackIn_14_1;
              }
            } else {
              this.upperBound = param2.readUnsignedShort(1869);
            }
          } else {
            this.lowerBound = param2.readUnsignedShort(1869);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("sma.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
    }
}
