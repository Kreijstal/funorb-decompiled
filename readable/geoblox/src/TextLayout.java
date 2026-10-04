/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class TextLayout {
    static int categoryMatchCandidateCount;
    static int fullscreenPointerOriginX;
    TextLayoutLine[] lines;

    final int getCaretX(int caretIndex, int methodGuard) {
        int lineIndex = 0;
        TextLayoutLine line = null;
        int clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        TextLayoutLine[] lines = this.lines;
        TextLayoutLine[] linesAlias = lines;
        for (lineIndex = 0; lines.length > lineIndex; lineIndex++) {
            line = lines[lineIndex];
            if (~line.caretX.length < ~caretIndex) {
                return line.caretX[caretIndex];
            }
            caretIndex = caretIndex - (line.caretX.length - 1);
        }
        if (methodGuard <= 109) {
            return 67;
        }
        return 0;
    }

    final int getMaximumLineEndX(int methodGuard) {
        int maximumEndX;
        TextLayoutLine[] lines;
        int lineIndex;
        TextLayoutLine line;
        int clientControlFlowSnapshot;
        int lineEndX;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        maximumEndX = -1;
        if (methodGuard < 60) {
          return 19;
        }
        if (null != this.lines) {
          lines = this.lines;
          lineIndex = 0;
          while (!(lines.length <= lineIndex)) {
            line = lines[lineIndex];
            if (line == null) {
              lineIndex++;
              continue;
            }
            lineEndX = line.getLineEndX(0);
            if (lineEndX <= maximumEndX) {
              lineIndex++;
              continue;
            }
            maximumEndX = lineEndX;
            lineIndex++;
            continue;
          }
        }
        return maximumEndX;
    }

    final int calculateSpaceJustification256(int methodGuard, int textWidth, int targetWidth, String text) {
        int characterIndex = 0;
        int spaceCount = 0;
        RuntimeException justificationFailure = null;
        int insideMarkup = 0;
        int textLength = 0;
        int guardQuotient = 0;
        int characterCode = 0;
        int clientControlFlowSnapshot = 0;
        int remainingWidth256 = 0;
        int spaceCountDivisor = 0;
        int spacingBeforeReturn = 0;
        int zeroSpacingBeforeReturn = 0;
        RuntimeException justificationFailureForContext = null;
        StringBuilder justificationContextBuilder = null;
        String textDescription = null;
        RuntimeException caughtJustificationFailure = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          spaceCount = 0;
          insideMarkup = 0;
          textLength = text.length();
          guardQuotient = 20 / ((-30 - methodGuard) / 56);
          for (characterIndex = 0; characterIndex < textLength; characterIndex++) {
            characterCode = text.charAt(characterIndex);
            if (characterCode != 60) {
              if (characterCode != 62) {
                if ((insideMarkup == 0) &&
                    (32 == characterCode)) {
                  spaceCount++;
                }
              } else {
                insideMarkup = 0;
              }
            } else {
              insideMarkup = 1;
            }
          }
          if (spaceCount <= 0) {
            zeroSpacingBeforeReturn = 0;
            return zeroSpacingBeforeReturn;
          }
          remainingWidth256 = targetWidth - textWidth << 8;
          spaceCountDivisor = spaceCount;
          spacingBeforeReturn = remainingWidth256 / spaceCountDivisor;
          return spacingBeforeReturn;
        } catch (java.lang.RuntimeException justificationException) {
          caughtJustificationFailure = justificationException;
          justificationFailure = caughtJustificationFailure;
          justificationFailureForContext = justificationFailure;
          justificationContextBuilder = new StringBuilder().append("dk.J(").append(methodGuard).append(',').append(textWidth).append(',').append(targetWidth).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) justificationFailureForContext), ((StringBuilder) (Object) justificationContextBuilder).append(textDescription).append(')').toString());
        }
    }

    final static void closeArchiveAndCacheServices(byte methodGuard) {
        try {
            int cacheFileIndex = 0;
            IOException dataFileCloseFailure = null;
            int clientControlFlowSnapshot = 0;
            Throwable caughtCloseFailure = null;
            RuntimeException archiveCloseFailure = null;
            IOException indexFileCloseFailure = null;
            clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
            try {
              if (null != AsyncResourceDownloader.archiveNetworkClient) {
                AsyncResourceDownloader.archiveNetworkClient.closeSocket(-70);
              }
              if (methodGuard >= -65) {
                categoryMatchCandidateCount = 18;
              }
              if (UsernameQuerySupport.archiveDiskWorker != null) {
                UsernameQuerySupport.archiveDiskWorker.shutdown((byte) 51);
              }
              if (null != CacheFileState.cacheDataFile) {
                try {
                  CacheFileState.cacheDataFile.close(27034);
                } catch (java.io.IOException caughtDataFileCloseFailure) {
                  caughtCloseFailure = caughtDataFileCloseFailure;
                  dataFileCloseFailure = (IOException) (Object) caughtCloseFailure;
                }
              }
              if (null != TrackedPcmStream.field_h) {
                for (cacheFileIndex = 0; TrackedPcmStream.field_h.length > cacheFileIndex; cacheFileIndex++) {
                  if (null == TrackedPcmStream.field_h[cacheFileIndex]) {
                    continue;
                  }
                  try {
                    TrackedPcmStream.field_h[cacheFileIndex].close(27034);
                  } catch (java.io.IOException caughtIndexFileCloseFailure) {
                    caughtCloseFailure = caughtIndexFileCloseFailure;
                    indexFileCloseFailure = (IOException) (Object) caughtCloseFailure;
                  }
                }
                return;
              }
              return;
            } catch (java.lang.RuntimeException caughtArchiveCloseFailure) {
              caughtCloseFailure = caughtArchiveCloseFailure;
              archiveCloseFailure = (RuntimeException) (Object) caughtCloseFailure;
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) archiveCloseFailure), "dk.O(" + methodGuard + ')');
            }
        } catch (RuntimeException | Error uncheckedCloseFailure) {
            throw uncheckedCloseFailure;
        } catch (Throwable checkedCloseFailure) {
            throw new RuntimeException(checkedCloseFailure);
        }
    }

    final int getLayoutHeight(int methodGuard) {
        int heightBeforeReturn = 0;
        if (methodGuard != -3111) {
          categoryMatchCandidateCount = 49;
        }
        if ((null != this.lines) &&
            (this.lines.length > 0)) {
          heightBeforeReturn = this.lines[this.lines.length - 1].bottomY - this.lines[0].topY;
        } else {
          heightBeforeReturn = 0;
        }
        return heightBeforeReturn;
    }

    final int getCaretLineIndex(byte methodGuard, int caretIndex) {
        int lineIndex = 0;
        TextLayoutLine line = null;
        int clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        if (methodGuard != 24) {
            return -10;
        }
        for (lineIndex = 0; this.lines.length > lineIndex; lineIndex++) {
            line = this.lines[lineIndex];
            if (!(line.caretX.length <= caretIndex)) {
                return lineIndex;
            }
            caretIndex = caretIndex - (line.caretX.length - 1);
        }
        return this.lines.length;
    }

    final int hitTestCaretIndex(int x, int methodGuard, int y) {
        int lineIndex = 0;
        int precedingCharacterCount;
        int guardResidue;
        TextLayoutLine line;
        int lineCaretIndex;
        int clientControlFlowSnapshot;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        if ((null != this.lines) &&
            (this.lines.length != 0) &&
            (this.lines[0].topY <= y)) {
          if (this.lines[-1 + this.lines.length].bottomY < y) {
            return -1;
          }
          if (this.lines.length == 1) {
            return this.lines[0].findNearestCaretIndex(71, x);
          }
          precedingCharacterCount = 0;
          guardResidue = -2 % ((15 - methodGuard) / 32);
          for (lineIndex = 0; lineIndex < this.lines.length; lineIndex++) {
            line = this.lines[lineIndex];
            if ((y >= line.topY) &&
                (line.bottomY >= y)) {
              lineCaretIndex = line.findNearestCaretIndex(-79, x);
              if (-1 != lineCaretIndex) {
                return precedingCharacterCount + lineCaretIndex;
              }
              return -1;
            }
            precedingCharacterCount = precedingCharacterCount + (line.caretX.length - 1);
          }
          return -1;
        }
        return -1;
    }

    static {
        categoryMatchCandidateCount = 0;
    }
}
