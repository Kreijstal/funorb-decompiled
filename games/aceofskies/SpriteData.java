/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteData {
    int padTop;
    int[] palette;
    int width;
    int padRight;
    int padBottom;
    int height;
    int padLeft;
    byte[] alpha;
    byte[] indices;

    private final static SpriteData[] decodeFrames(byte[] encodedFrames) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_68_1 = 0;
        PacketBuffer var1;
        int var2;
        SpriteData[] var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        int[] var7;
        int var8;
        SpriteData var8_ref_vd;
        SpriteData var9;
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
        var1 = new PacketBuffer(encodedFrames);
        var1.position = encodedFrames.length - 2;
        var2 = var1.readUnsignedShort((byte) 0);
        var3 = new SpriteData[var2];
        for (var4 = 0; var4 < var2; var4++) {
          var3[var4] = new SpriteData();
        }
        var1.position = encodedFrames.length - 7 - var2 * 8;
        var4Lifetime1 = var1.readUnsignedShort((byte) 0);
        var5 = var1.readUnsignedShort((byte) 0);
        var6 = (var1.readUnsignedByte(-52) & 255) + 1;
        for (var7_int = 0; var7_int < var2; var7_int++) {
          var3[var7_int].padLeft = var1.readUnsignedShort((byte) 0);
        }
        for (var7_intLifetime1 = 0; var7_intLifetime1 < var2; var7_intLifetime1++) {
          var3[var7_intLifetime1].padTop = var1.readUnsignedShort((byte) 0);
        }
        for (var7_intLifetime2 = 0; var7_intLifetime2 < var2; var7_intLifetime2++) {
          var3[var7_intLifetime2].width = var1.readUnsignedShort((byte) 0);
        }
        for (var7_intLifetime3 = 0; var7_intLifetime3 < var2; var7_intLifetime3++) {
          var3[var7_intLifetime3].height = var1.readUnsignedShort((byte) 0);
        }
        for (var7_intLifetime4 = 0; var7_intLifetime4 < var2; var7_intLifetime4++) {
          var8_ref_vd = var3[var7_intLifetime4];
          var8_ref_vd.padRight = var4Lifetime1 - var8_ref_vd.width - var8_ref_vd.padLeft;
          var8_ref_vd.padBottom = var5 - var8_ref_vd.height - var8_ref_vd.padTop;
        }
        var1.position = encodedFrames.length - 7 - var2 * 8 - (var6 - 1) * 3;
        var17 = new int[var6];
        var16 = var17;
        var7 = var16;
        for (var8 = 1; var8 < var6; var8++) {
          var7[var8] = var1.readUnsignedMedium((byte) -84);
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
          var9.indices = new byte[var10];
          var11 = var1.readUnsignedByte(29);
          if ((var11 & 2) == 0) {
            if ((var11 & 1) == 0) {
              for (var12 = 0; var12 < var10; var12++) {
                var9.indices[var12] = var1.readByte(0);
              }
            } else {
              for (var12 = 0; var12 < var9.width; var12++) {
                for (var13 = 0; var13 < var9.height; var13++) {
                  var9.indices[var12 + var13 * var9.width] = var1.readByte(0);
                }
              }
            }
          } else {
            var12 = 0;
            var9.alpha = new byte[var10];
            if ((var11 & 1) == 0) {
              for (var13 = 0; var13 < var10; var13++) {
                var9.indices[var13] = var1.readByte(0);
              }
              for (var13 = 0; var13 < var10; var13++) {
                dupTemp$1 = var1.readByte(0);
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
                  var9.indices[var13 + var14 * var9.width] = var1.readByte(0);
                }
              }
              for (var13 = 0; var13 < var9.width; var13++) {
                for (var14 = 0; var14 < var9.height; var14++) {
                  dupTemp$0 = var1.readByte(0);
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

    final static SpriteData[] loadFrames(ResourceArchive archive, String groupName, String fileName) {
        byte[] var3 = archive.a(groupName, (byte) -71, fileName);
        if (var3 == null) {
          return null;
        }
        return SpriteData.decodeFrames(var3);
    }

    final static SpriteData loadFirstFrame(ResourceArchive archive, String groupName, String fileName) {
        byte[] var3 = archive.a(groupName, (byte) -71, fileName);
        if (var3 == null) {
          return null;
        }
        return SpriteData.decodeFrames(var3)[0];
    }
}
