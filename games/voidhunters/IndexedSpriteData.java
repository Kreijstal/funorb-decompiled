/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IndexedSpriteData {
    byte[] alpha;
    int bottomPadding;
    int[] palette;
    int width;
    byte[] pixels;
    int rightPadding;
    int height;
    int topPadding;
    int leftPadding;

    final static IndexedSpriteData loadFirst(ResourceArchive param0, int param1, int param2) {
        byte[] var3 = param0.fetchFile(param1, param2, (byte) 13);
        if (var3 == null) {
          return null;
        }
        return IndexedSpriteData.decode(var3)[0];
    }

    final static IndexedSpriteData loadFirst(ResourceArchive param0, String param1, String param2) {
        byte[] var3 = param0.fetchNamedFile(param2, true, param1);
        if (var3 == null) {
          return null;
        }
        return IndexedSpriteData.decode(var3)[0];
    }

    final void normalize() {
        int var4 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var8 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var1;
        int var2;
        byte[] var3;
        byte[] var4_ref_byte__;
        int var5;
        int var6;
        int var7;
        var1 = this.getPaddedWidth();
        var2 = this.getPaddedHeight();
        if (this.width == var1 &&
          this.height == var2) {
          return;
        }
        var3 = new byte[var1 * var2];
        if (this.alpha == null) {
          for (var4 = 0; var4 < this.height; var4++) {
            var5 = var4 * this.width;
            var6 = (var4 + this.topPadding) * var1 + this.leftPadding;
            for (var7 = 0; var7 < this.width; var7++) {
              incrementValue$0 = var6;
              var6++;
              incrementValue$1 = var5;
              var5++;
              var3[incrementValue$0] = this.pixels[incrementValue$1];
            }
          }
        } else {
          var4_ref_byte__ = new byte[var1 * var2];
          for (var5 = 0; var5 < this.height; var5++) {
            var6 = var5 * this.width;
            var7 = (var5 + this.topPadding) * var1 + this.leftPadding;
            for (var8 = 0; var8 < this.width; var8++) {
              var3[var7] = this.pixels[var6];
              incrementValue$2 = var7;
              var7++;
              incrementValue$3 = var6;
              var6++;
              var4_ref_byte__[incrementValue$2] = this.alpha[incrementValue$3];
            }
          }
          this.alpha = var4_ref_byte__;
        }
        this.bottomPadding = 0;
        this.topPadding = 0;
        this.rightPadding = 0;
        this.leftPadding = 0;
        this.width = var1;
        this.height = var2;
        this.pixels = var3;
    }

    final int[] toArgbPixels() {
        int incrementValue$3 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int var1;
        int[] var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        var1 = this.getPaddedWidth();
        var2 = new int[var1 * this.getPaddedHeight()];
        if (this.alpha != null) {
          for (var3 = 0; var3 < this.height; var3++) {
            var4 = var3 * this.width;
            var5 = this.leftPadding + (var3 + this.topPadding) * var1;
            for (var6 = 0; var6 < this.width; var6++) {
              incrementValue$3 = var5;
              var5++;
              var2[incrementValue$3] = this.alpha[var4] << 24 | this.palette[this.pixels[var4] & 255];
              var4++;
            }
          }
        } else {
          for (var3 = 0; var3 < this.height; var3++) {
            var4 = var3 * this.width;
            var5 = this.leftPadding + (var3 + this.topPadding) * var1;
            for (var6 = 0; var6 < this.width; var6++) {
              incrementValue$0 = var4;
              var4++;
              var7 = this.palette[this.pixels[incrementValue$0] & 255];
              if (var7 == 0) {
                var2[var5++] = 0;
              } else {
                incrementValue$2 = var5;
                var5++;
                var2[incrementValue$2] = -16777216 | var7;
              }
            }
          }
        }
        return var2;
    }

    private final static IndexedSpriteData[] decode(byte[] param0) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_68_1 = 0;
        PacketBuffer var1;
        int var2;
        IndexedSpriteData[] var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        int[] var7;
        int var8;
        IndexedSpriteData var8_ref_ima;
        IndexedSpriteData var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int[] var16;
        int[] var17;
        int var4Lifetime1;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        int var7_intLifetime4;
        int var8Lifetime1;
        int var8Lifetime2;
        var1 = new PacketBuffer(param0);
        var1.position = param0.length - 2;
        var2 = var1.readUnsignedShort(1869);
        var3 = new IndexedSpriteData[var2];
        for (var4 = 0; var4 < var2; var4++) {
          var3[var4] = new IndexedSpriteData();
        }
        var1.position = param0.length - 7 - var2 * 8;
        var4Lifetime1 = var1.readUnsignedShort(1869);
        var5 = var1.readUnsignedShort(1869);
        var6 = (var1.readUnsignedByte((byte) -125) & 255) + 1;
        for (var7_int = 0; var7_int < var2; var7_int++) {
          var3[var7_int].leftPadding = var1.readUnsignedShort(1869);
        }
        for (var7_intLifetime1 = 0; var7_intLifetime1 < var2; var7_intLifetime1++) {
          var3[var7_intLifetime1].topPadding = var1.readUnsignedShort(1869);
        }
        for (var7_intLifetime2 = 0; var7_intLifetime2 < var2; var7_intLifetime2++) {
          var3[var7_intLifetime2].width = var1.readUnsignedShort(1869);
        }
        for (var7_intLifetime3 = 0; var7_intLifetime3 < var2; var7_intLifetime3++) {
          var3[var7_intLifetime3].height = var1.readUnsignedShort(1869);
        }
        for (var7_intLifetime4 = 0; var7_intLifetime4 < var2; var7_intLifetime4++) {
          var8_ref_ima = var3[var7_intLifetime4];
          var8_ref_ima.rightPadding = var4Lifetime1 - var8_ref_ima.width - var8_ref_ima.leftPadding;
          var8_ref_ima.bottomPadding = var5 - var8_ref_ima.height - var8_ref_ima.topPadding;
        }
        var1.position = param0.length - 7 - var2 * 8 - (var6 - 1) * 3;
        var17 = new int[var6];
        var16 = var17;
        var7 = var16;
        for (var8 = 1; var8 < var6; var8++) {
          var7[var8] = var1.readUnsignedMedium((byte) -117);
          if (var17[var8] == 0) {
            var17[var8] = 1;
          }
        }
        for (var8Lifetime1 = 0; var8Lifetime1 < var2; var8Lifetime1++) {
          var3[var8Lifetime1].palette = var7;
        }
        var1.position = 0;
        for (var8Lifetime2 = 0; var8Lifetime2 < var2; var8Lifetime2++) {
          var9 = var3[var8Lifetime2];
          var10 = var9.width * var9.height;
          var9.pixels = new byte[var10];
          var11 = var1.readUnsignedByte((byte) -109);
          if ((var11 & 2) == 0) {
            if ((var11 & 1) == 0) {
              for (var12 = 0; var12 < var10; var12++) {
                var9.pixels[var12] = var1.readByte((byte) -114);
              }
            } else {
              for (var12 = 0; var12 < var9.width; var12++) {
                for (var13 = 0; var13 < var9.height; var13++) {
                  var9.pixels[var12 + var13 * var9.width] = var1.readByte((byte) -114);
                }
              }
            }
          } else {
            var12 = 0;
            var9.alpha = new byte[var10];
            if ((var11 & 1) == 0) {
              for (var13 = 0; var13 < var10; var13++) {
                var9.pixels[var13] = var1.readByte((byte) -114);
              }
              for (var13 = 0; var13 < var10; var13++) {
                dupTemp$1 = var1.readByte((byte) -114);
                var9.alpha[var13] = dupTemp$1;
                var14 = dupTemp$1;
                stackIn_53_0 = var12;
                if (var14 == -1) {
                  stackIn_54_1 = 0;
                } else {
                  stackIn_54_1 = 1;
                }
                var12 = stackIn_53_0 | stackIn_54_1;
              }
            } else {
              for (var13 = 0; var13 < var9.width; var13++) {
                for (var14 = 0; var14 < var9.height; var14++) {
                  var9.pixels[var13 + var14 * var9.width] = var1.readByte((byte) -114);
                }
              }
              for (var13 = 0; var13 < var9.width; var13++) {
                for (var14 = 0; var14 < var9.height; var14++) {
                  dupTemp$0 = var1.readByte((byte) -114);
                  var9.alpha[var13 + var14 * var9.width] = dupTemp$0;
                  var15 = dupTemp$0;
                  stackIn_67_0 = var12;
                  if (var15 == -1) {
                    stackIn_68_1 = 0;
                  } else {
                    stackIn_68_1 = 1;
                  }
                  var12 = stackIn_67_0 | stackIn_68_1;
                }
              }
            }
            if (var12 == 0) {
              var9.alpha = null;
            }
          }
        }
        return var3;
    }

    final static IndexedSpriteData loadFirst(ResourceArchive param0, int param1) {
        byte[] var2 = param0.fetchSingleFile((byte) 9, param1);
        if (var2 == null) {
          return null;
        }
        return IndexedSpriteData.decode(var2)[0];
    }

    private final int getPaddedHeight() {
        return this.height + this.topPadding + this.bottomPadding;
    }

    final static IndexedSpriteData[] loadAll(ResourceArchive param0, String param1, String param2) {
        byte[] var3 = param0.fetchNamedFile(param2, true, param1);
        if (var3 == null) {
          return null;
        }
        return IndexedSpriteData.decode(var3);
    }

    private final int getPaddedWidth() {
        return this.width + this.leftPadding + this.rightPadding;
    }
}
