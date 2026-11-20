/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HerringboneTextureOperation extends TextureOperation {
    private int gapThreshold;
    static int field_m;
    static String field_i;
    private int verticalFrequency;
    private int horizontalFrequency;

    final void decodeParameter(int param0, int param1, PacketBuffer param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        PacketBuffer var6 = null;
        var5 = VoidHunters.field_G;
        try {
          var4_int = param0;
          if (var4_int == 0) {
            this.horizontalFrequency = param2.readUnsignedByte((byte) -108);
          } else {
            if (1 != var4_int) {
              if (2 == var4_int) {
                this.gapThreshold = param2.readUnsignedShort(1869);
              }
            } else {
              this.verticalFrequency = param2.readUnsignedByte((byte) -93);
            }
          }
          if (param1 >= -60) {
            var6 = (PacketBuffer) null;
            this.decodeParameter(-122, -52, (PacketBuffer) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("vn.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(boolean param0) {
        if (!param0) {
          return;
        }
        field_i = null;
    }

    final int[] getMonochromeRow(int param0, boolean param1) {
        int var4 = 0;
        int[] var3;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        int[] var13;
        var11 = VoidHunters.field_G;
        var13 = this.field_f.getRow((byte) 120, param0);
        var12 = var13;
        var3 = var12;
        if (this.field_f.field_e) {
          for (var4 = 0; var4 < hob.textureWidth; var4++) {
            boolean decompiledFrameRemainder0 = true;
            var5 = BoxBlurTextureOperation.textureXCoordinates[var4];
            var6 = SetSalvoUsesAllEnergy.textureYCoordinates[param0];
            var7 = var5 * this.horizontalFrequency >> 12;
            var8 = this.verticalFrequency * var6 >> 12;
            var9 = this.horizontalFrequency * (var5 % (4096 / this.horizontalFrequency));
            var10 = var6 % (4096 / this.verticalFrequency) * this.verticalFrequency;
            if (var10 < this.gapThreshold) {
              for (var7 = var7 - var8; var7 < 0; var7 += 4) {
              }
              while (3 < var7) {
                var7 -= 4;
              }
              var13 = var12;
              if (var7 != 1) {
                var13[var4] = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                var13 = var12;
                if (this.gapThreshold > var9) {
                  var13[var4] = 0;
                  decompiledFrameRemainder0 = false;
                }
              }
            }
            if (decompiledFrameRemainder0) {
              if (this.gapThreshold > var9) {
                for (var7 = var7 - var8; var7 < 0; var7 += 4) {
                }
                while (var7 > 3) {
                  var7 -= 4;
                }
                if (0 < var7) {
                  var13[var4] = 0;
                  decompiledFrameRemainder0 = false;
                }
              }
              if (decompiledFrameRemainder0) {
                var13[var4] = 4096;
              }
            }
          }
        }
        if (param1) {
          return var3;
        }
        return (int[]) null;
    }

    public HerringboneTextureOperation() {
        super(0, true);
        this.gapThreshold = 204;
        this.verticalFrequency = 1;
        this.horizontalFrequency = 1;
    }

    static {
        field_m = 32;
        field_i = "Standard thruster";
    }
}
