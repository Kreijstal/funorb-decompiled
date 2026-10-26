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
        PacketBuffer reader = new PacketBuffer(encodedFrames);
        reader.position = encodedFrames.length - 2;
        int frameCount = reader.readUnsignedShort((byte) 0);
        SpriteData[] frames = new SpriteData[frameCount];
        for (int allocationIndex = 0; allocationIndex < frameCount; allocationIndex++) {
          frames[allocationIndex] = new SpriteData();
        }
        reader.position = encodedFrames.length - 7 - frameCount * 8;
        int fullWidth = reader.readUnsignedShort((byte) 0);
        int fullHeight = reader.readUnsignedShort((byte) 0);
        int paletteSize = (reader.readUnsignedByte(-52) & 255) + 1;
        for (int leftPaddingFrameIndex = 0; leftPaddingFrameIndex < frameCount; leftPaddingFrameIndex++) {
          frames[leftPaddingFrameIndex].padLeft = reader.readUnsignedShort((byte) 0);
        }
        for (int topPaddingFrameIndex = 0; topPaddingFrameIndex < frameCount; topPaddingFrameIndex++) {
          frames[topPaddingFrameIndex].padTop = reader.readUnsignedShort((byte) 0);
        }
        for (int widthFrameIndex = 0; widthFrameIndex < frameCount; widthFrameIndex++) {
          frames[widthFrameIndex].width = reader.readUnsignedShort((byte) 0);
        }
        for (int heightFrameIndex = 0; heightFrameIndex < frameCount; heightFrameIndex++) {
          frames[heightFrameIndex].height = reader.readUnsignedShort((byte) 0);
        }
        for (int paddingFrameIndex = 0; paddingFrameIndex < frameCount; paddingFrameIndex++) {
          SpriteData frameForPadding = frames[paddingFrameIndex];
          frameForPadding.padRight = fullWidth - frameForPadding.width - frameForPadding.padLeft;
          frameForPadding.padBottom = fullHeight - frameForPadding.height - frameForPadding.padTop;
        }
        reader.position = encodedFrames.length - 7 - frameCount * 8 - (paletteSize - 1) * 3;
        int[] palette = new int[paletteSize];
        for (int paletteIndex = 1; paletteIndex < paletteSize; paletteIndex++) {
          palette[paletteIndex] = reader.readUnsignedMedium((byte) -84);
          if (palette[paletteIndex] == 0) {
            palette[paletteIndex] = 1;
          }
        }
        for (int paletteFrameIndex = 0; paletteFrameIndex < frameCount; paletteFrameIndex++) {
          frames[paletteFrameIndex].palette = palette;
        }
        reader.position = 0;
        for (int frameIndex = 0; frameIndex < frameCount; frameIndex++) {
          SpriteData frame = frames[frameIndex];
          int pixelCount = frame.width * frame.height;
          frame.indices = new byte[pixelCount];
          int storageFlags = reader.readUnsignedByte(29);
          if ((storageFlags & 2) != 0) {
            boolean nonOpaqueAlphaMask = false;
            frame.alpha = new byte[pixelCount];
            if ((storageFlags & 1) == 0) {
              for (int alphaFrameIndexPixel = 0; alphaFrameIndexPixel < pixelCount; alphaFrameIndexPixel++) {
                frame.indices[alphaFrameIndexPixel] = reader.readByte(0);
              }
              for (int rowAlphaPixel = 0; rowAlphaPixel < pixelCount; rowAlphaPixel++) {
                byte rowAlphaByte = reader.readByte(0);
                frame.alpha[rowAlphaPixel] = rowAlphaByte;
                int rowAlphaValue = rowAlphaByte;
                boolean previousRowAlphaMask = nonOpaqueAlphaMask;
                boolean rowNonOpaqueBit = !(rowAlphaValue == -1);
                nonOpaqueAlphaMask = previousRowAlphaMask | rowNonOpaqueBit;
              }
            } else {
              for (int alphaFrameIndexX = 0; alphaFrameIndexX < frame.width; alphaFrameIndexX++) {
                for (int alphaFrameIndexY = 0; alphaFrameIndexY < frame.height; alphaFrameIndexY++) {
                  frame.indices[alphaFrameIndexX + alphaFrameIndexY * frame.width] = reader.readByte(0);
                }
              }
              for (int columnAlphaX = 0; columnAlphaX < frame.width; columnAlphaX++) {
                for (int columnAlphaY = 0; columnAlphaY < frame.height; columnAlphaY++) {
                  byte columnAlphaByte = reader.readByte(0);
                  frame.alpha[columnAlphaX + columnAlphaY * frame.width] = columnAlphaByte;
                  int columnAlphaValue = columnAlphaByte;
                  boolean previousColumnAlphaMask = nonOpaqueAlphaMask;
                  boolean columnNonOpaqueBit = !(columnAlphaValue == -1);
                  nonOpaqueAlphaMask = previousColumnAlphaMask | columnNonOpaqueBit;
                }
              }
            }
            if (!nonOpaqueAlphaMask) {
              frame.alpha = null;
            }
          } else if ((storageFlags & 1) == 0) {
            for (int indexOnlyPixel = 0; indexOnlyPixel < pixelCount; indexOnlyPixel++) {
              frame.indices[indexOnlyPixel] = reader.readByte(0);
            }
          } else {
            for (int indexOnlyX = 0; indexOnlyX < frame.width; indexOnlyX++) {
              for (int indexOnlyY = 0; indexOnlyY < frame.height; indexOnlyY++) {
                frame.indices[indexOnlyX + indexOnlyY * frame.width] = reader.readByte(0);
              }
            }
          }
        }
        return frames;
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
