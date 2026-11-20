/*
 * Decompiled by CFR-JS 0.4.0.
 */
class SpriteTextureOperation extends TextureOperation {
    static TextureCombineSource field_l;
    static String field_o;
    int sourceHeight;
    int[] sourcePixels;
    static int[] field_n;
    private int spriteId;
    int sourceWidth;
    static String field_i;

    final static void e(int param0) {
        if (SetTorpedoProjectiles.field_o == null) {
          return;
        }
        if (param0 <= -42) {
          if (psb.field_b != null) {
            spb.a((byte) -95);
            GetBombletSprayEnergyUsed.field_p.height = MovingObjectFactory.field_a.height;
            GetBombletSprayEnergyUsed.field_p.width = MovingObjectFactory.field_a.width;
          }
          return;
        }
    }

    final void decodeParameter(int param0, int param1, PacketBuffer param2) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 >= -60) {
            this.spriteId = 105;
          }
          if (0 == param0) {
            this.spriteId = param2.readUnsignedShort(1869);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("pja.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final int getSpriteId(int param0) {
        if (param0 != -1) {
          field_o = (String) null;
          return this.spriteId;
        }
        return this.spriteId;
    }

    final void clearCache(int param0) {
        super.clearCache(-75);
        if (param0 >= -23) {
          this.getSpriteId(52);
          this.sourcePixels = null;
          return;
        }
        this.sourcePixels = null;
    }

    public SpriteTextureOperation() {
        super(0, false);
        this.spriteId = -1;
    }

    final static int computeSoundGain(byte param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var3 = (int)(-TextureTransformMode.field_a.worldCenterX + (float)param1);
        int var4 = (int)((float)param2 - TextureTransformMode.field_a.worldCenterY);
        if (param0 > 83) {
          var5 = (int)(640.0 / (double)TextureTransformMode.field_a.scale);
          var6 = ComponentAttachmentPlan.a(var5, (byte) 119, var4, var3);
          var7 = 33554432 / var6;
          if (var7 > 128) {
            var7 = 128;
          }
          return var7;
        }
        return 77;
    }

    public static void clearSharedReferences(int param0) {
        field_o = null;
        if (param0 != -1) {
          return;
        }
        field_n = null;
        field_l = null;
        field_i = null;
    }

    final boolean loadSpritePixels(int param0) {
        if (null != this.sourcePixels) {
          return true;
        }
        if (this.spriteId < param0) {
          return false;
        }
        IndexedSpriteData var2 = GetFighterRepairTime.field_o < 0 ? IndexedSpriteData.loadFirst(GetAngularVelocitySustainMax.field_o, this.spriteId) : IndexedSpriteData.loadFirst(GetAngularVelocitySustainMax.field_o, GetFighterRepairTime.field_o, this.spriteId);
        var2.normalize();
        this.sourcePixels = var2.toArgbPixels();
        this.sourceHeight = var2.height;
        this.sourceWidth = var2.width;
        return true;
    }

    int[][] getColorRow(int param0, int param1) {
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        int[][] var3;
        int[] var4;
        int[] var5;
        int[] var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[][] var12;
        int[][] var13;
        int[][] var14;
        int stackIn_9_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_1 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int[][] var3Lifetime1;
        int[] var4Lifetime1;
        int[] var5Lifetime1;
        int[] var6Lifetime1;
        int[][] var12Lifetime1;
        int[][] var13Lifetime1;
        int[][] var14Lifetime1;
        var11 = VoidHunters.field_G;
        if (param0 != 255) {
          this.getSpriteId(53);
          var14 = this.field_d.getRow(param1, (byte) -110);
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (!this.field_d.field_g) {
            return var3;
          }
          if (!this.loadSpritePixels(0)) {
            return var3;
          }
          var4 = var14[0];
          var5 = var14[1];
          var6 = var14[2];
          stackIn_9_0 = this.sourceWidth;
          if (GetTorpedoReload.field_o != this.sourceHeight) {
            stackIn_10_1 = param1 * this.sourceHeight / GetTorpedoReload.field_o;
          } else {
            stackIn_10_1 = param1;
          }
          var7 = stackIn_9_0 * stackIn_10_1;
          if (this.sourceWidth != TextHotspotRegion.textureWidth) {
            for (var8 = 0; TextHotspotRegion.textureWidth > var8; var8++) {
              var9 = this.sourceWidth * var8 / TextHotspotRegion.textureWidth;
              var10 = this.sourcePixels[var9 + var7];
              var6[var8] = dla.andBits(var10, 255) << 4;
              var5[var8] = dla.andBits(4080, var10 >> 4);
              var4[var8] = dla.andBits(var10 >> 12, 4080);
            }
          } else {
            for (var8 = 0; TextHotspotRegion.textureWidth > var8; var8++) {
              incrementValue$2 = var7;
              var7++;
              var9 = this.sourcePixels[incrementValue$2];
              var6[var8] = dla.andBits(255, var9) << 4;
              var5[var8] = dla.andBits(4080, var9 >> 4);
              var4[var8] = dla.andBits(4080, var9 >> 12);
            }
          }
          return var3;
        }
        var14Lifetime1 = this.field_d.getRow(param1, (byte) -110);
        var13Lifetime1 = var14Lifetime1;
        var12Lifetime1 = var13Lifetime1;
        var3Lifetime1 = var12Lifetime1;
        if (!this.field_d.field_g) {
          return var3Lifetime1;
        }
        if (!this.loadSpritePixels(0)) {
          return var3Lifetime1;
        }
        var4Lifetime1 = var14Lifetime1[0];
        var5Lifetime1 = var14Lifetime1[1];
        var6Lifetime1 = var14Lifetime1[2];
        stackIn_26_0 = this.sourceWidth;
        if (GetTorpedoReload.field_o != this.sourceHeight) {
          stackIn_27_1 = param1 * this.sourceHeight / GetTorpedoReload.field_o;
        } else {
          stackIn_27_1 = param1;
        }
        var7Lifetime1 = stackIn_26_0 * stackIn_27_1;
        if (this.sourceWidth != TextHotspotRegion.textureWidth) {
          for (var8Lifetime1 = 0; TextHotspotRegion.textureWidth > var8Lifetime1; var8Lifetime1++) {
            var9Lifetime1 = this.sourceWidth * var8Lifetime1 / TextHotspotRegion.textureWidth;
            var10Lifetime1 = this.sourcePixels[var9Lifetime1 + var7Lifetime1];
            var6Lifetime1[var8Lifetime1] = dla.andBits(var10Lifetime1, 255) << 4;
            var5Lifetime1[var8Lifetime1] = dla.andBits(4080, var10Lifetime1 >> 4);
            var4Lifetime1[var8Lifetime1] = dla.andBits(var10Lifetime1 >> 12, 4080);
          }
        } else {
          for (var8Lifetime1 = 0; TextHotspotRegion.textureWidth > var8Lifetime1; var8Lifetime1++) {
            incrementValue$1 = var7Lifetime1;
            var7Lifetime1++;
            var9Lifetime1 = this.sourcePixels[incrementValue$1];
            var6Lifetime1[var8Lifetime1] = dla.andBits(255, var9Lifetime1) << 4;
            var5Lifetime1[var8Lifetime1] = dla.andBits(4080, var9Lifetime1 >> 4);
            var4Lifetime1[var8Lifetime1] = dla.andBits(4080, var9Lifetime1 >> 12);
          }
        }
        return var3Lifetime1;
    }

    static {
        field_n = new int[8192];
        field_l = new TextureCombineSource();
        field_i = "Left click to fire/recall the grapple";
    }
}
