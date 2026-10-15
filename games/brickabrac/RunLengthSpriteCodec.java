/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RunLengthSpriteCodec {
    final static void drawEncodedSprite(RgbSprite encodedSprite, int x, int y) {
        int clippedTopRows = 0;
        x = x + encodedSprite.offsetX;
        y = y + encodedSprite.offsetY;
        int destinationOffset = x + y * Rasterizer2D.width;
        int commandIndex = encodedSprite.height;
        int height = encodedSprite.height;
        int width = encodedSprite.width;
        int initialCommand = 0;
        int leftLimit = -width;
        int rightLimit = 0;
        if (y < Rasterizer2D.clipTop) {
          clippedTopRows = Rasterizer2D.clipTop - y;
          y = Rasterizer2D.clipTop;
          if (clippedTopRows < height) {
            commandIndex = encodedSprite.pixels[clippedTopRows];
          }
          height = height - clippedTopRows;
          destinationOffset = destinationOffset + clippedTopRows * Rasterizer2D.width;
        }
        if (y + height > Rasterizer2D.clipBottom) {
          height = height - (y + height - Rasterizer2D.clipBottom);
        }
        if (x < Rasterizer2D.clipLeft) {
          leftLimit = leftLimit + (Rasterizer2D.clipLeft - x);
        }
        if (x + width > Rasterizer2D.clipRight) {
          rightLimit = rightLimit - (x + width - Rasterizer2D.clipRight);
        }
        if (width > 0) {
          if (height <= 0) {
            return;
          }
          RunLengthSpriteCodec.blitEncodedRows(Rasterizer2D.pixels, encodedSprite.pixels, commandIndex, destinationOffset, initialCommand, leftLimit, rightLimit, width, height);
          return;
        }
    }

    private final static void markTransparentRuns(RgbSprite sprite) {
        int row = 0;
        int column = 0;
        int previousTransparentCount = 0;
        int pixelIndex;
        int transparentCount;
        int color;
        pixelIndex = sprite.width * sprite.height - 1;
        for (row = sprite.height - 1; row >= 0; row--) {
          transparentCount = 0;
          for (column = sprite.width - 1; column >= 0; column--) {
            color = sprite.pixels[pixelIndex];
            if (color != 0) {
              transparentCount = 0;
            } else {
              previousTransparentCount = transparentCount;
              transparentCount++;
              sprite.pixels[pixelIndex] = -previousTransparentCount;
            }
            pixelIndex--;
          }
        }
    }

    final static void encodeSprite(RgbSprite sprite) {
        int countRow = 0;
        int countReadIndex = 0;
        int buildReadIndex = 0;
        int commandCount;
        int countPixelIndex;
        int[] encodedWords;
        int countColumn;
        int countCommand;
        int buildColumn;
        int buildCommand;
        int[] allocatedWordsAlias;
        int[] allocatedWords;
        int buildPixelIndex;
        int writeIndex;
        int buildRow;
        RunLengthSpriteCodec.markTransparentRuns(sprite);
        commandCount = 0;
        countPixelIndex = 0;
        for (countRow = 0; countRow < sprite.height; countRow++) {
          countColumn = 0;
          while (countColumn < sprite.width) {
            countReadIndex = countPixelIndex;
            countPixelIndex++;
            countCommand = sprite.pixels[countReadIndex];
            if (countCommand < 0) {
              countPixelIndex = countPixelIndex - countCommand;
              countColumn = countColumn - countCommand;
            }
            commandCount++;
            countColumn++;
          }
        }
        allocatedWords = new int[sprite.height + commandCount];
        allocatedWordsAlias = allocatedWords;
        encodedWords = allocatedWordsAlias;
        buildPixelIndex = 0;
        writeIndex = sprite.height;
        for (buildRow = 0; buildRow < sprite.height; buildRow++) {
          allocatedWords[buildRow] = writeIndex;
          buildColumn = 0;
          while (buildColumn < sprite.width) {
            buildReadIndex = buildPixelIndex;
            buildPixelIndex++;
            buildCommand = sprite.pixels[buildReadIndex];
            if (buildCommand < 0) {
              buildPixelIndex = buildPixelIndex - buildCommand;
              buildColumn = buildColumn - buildCommand;
            }
            encodedWords[writeIndex++] = buildCommand;
            buildColumn++;
          }
        }
        sprite.pixels = encodedWords;
    }

    private final static void blitEncodedRows(int[] target, int[] commands, int commandIndex, int destinationOffset, int command, int leftLimit, int rightLimit, int rowWidth, int rowCount) {
        int rowCountdown = 0;
        int relativeX;
        destinationOffset = destinationOffset + rowWidth;
        relativeX = 0;
        for (rowCountdown = -rowCount; rowCountdown < 0; rowCountdown++) {
          relativeX = relativeX - rowWidth;
          while (relativeX < leftLimit) {
            command = commands[commandIndex++];
            if (command <= 0) {
              relativeX = relativeX - command;
            }
            relativeX++;
          }
          while (relativeX < rightLimit) {
            command = commands[commandIndex++];
            if (command > 0) {
              target[destinationOffset + relativeX] = command;
            } else {
              relativeX = relativeX - command;
            }
            relativeX++;
          }
          destinationOffset = destinationOffset + Rasterizer2D.width;
        }
    }
}
