/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VorbisCodebook {
    private int[] quantizedLookupValues;
    int dimensions;
    private float[][] valueVectors;
    private int entryCount;
    private int[] codewordLengths;
    private int[] huffmanTree;

    final int readScalar() {
        int treeNodeIndex = 0;
        while (this.huffmanTree[treeNodeIndex] >= 0) {
            treeNodeIndex = MusicDecoder.readBit() != 0 ? this.huffmanTree[treeNodeIndex] : treeNodeIndex + 1;
        }
        return ~this.huffmanTree[treeNodeIndex];
    }

    private final void buildHuffmanTree() {
        int[] nextCodewordByLengthAlias;
        int nextFreeTreeIndex;
        int entryIndex;
        int codewordLength;
        int codewordLengthBitMask;
        int currentCodeword;
        int nextCodeword;
        int shorterCodewordLength;
        int[] grownTree;
        int candidateCodeword;
        int carryBitMask;
        int treeCopyIndex;
        int[] intermediateNextCodewordByLengthAlias;
        int[] nextCodewordByLength;
        int[] entryCodewords;
        int treeEntryIndex;
        int treeCodewordLength;
        int treeCodeword;
        int treeNodeIndex;
        int codewordBitIndex;
        int branchBitMask;
        int unusedTreeCopyIndexSnapshot;
        int longerCodewordLength;
        int longerLengthCodewordCandidate;
        entryCodewords = new int[this.entryCount];
        nextCodewordByLength = new int[33];
        intermediateNextCodewordByLengthAlias = nextCodewordByLength;
        nextCodewordByLengthAlias = intermediateNextCodewordByLengthAlias;
        for (entryIndex = 0; entryIndex < this.entryCount; entryIndex++) {
          codewordLength = this.codewordLengths[entryIndex];
          if (codewordLength == 0) {
            continue;
          }
          shorterLengthCarryResolution: {
            codewordLengthBitMask = 1 << 32 - codewordLength;
            currentCodeword = nextCodewordByLength[codewordLength];
            entryCodewords[entryIndex] = currentCodeword;
            if ((currentCodeword & codewordLengthBitMask) == 0) {
              nextCodeword = currentCodeword | codewordLengthBitMask;
              for (shorterCodewordLength = codewordLength - 1; shorterCodewordLength >= 1; shorterCodewordLength--) {
                candidateCodeword = nextCodewordByLength[shorterCodewordLength];
                if (candidateCodeword != currentCodeword) {
                  break shorterLengthCarryResolution;
                }
                carryBitMask = 1 << 32 - shorterCodewordLength;
                if ((candidateCodeword & carryBitMask) != 0) {
                  nextCodewordByLengthAlias[shorterCodewordLength] = nextCodewordByLengthAlias[shorterCodewordLength - 1];
                  break shorterLengthCarryResolution;
                }
                nextCodewordByLengthAlias[shorterCodewordLength] = candidateCodeword | carryBitMask;
              }
              break shorterLengthCarryResolution;
            }
            nextCodeword = nextCodewordByLengthAlias[codewordLength - 1];
          }
          nextCodewordByLength[codewordLength] = nextCodeword;
          for (longerCodewordLength = codewordLength + 1; longerCodewordLength <= 32; longerCodewordLength++) {
            longerLengthCodewordCandidate = nextCodewordByLength[longerCodewordLength];
            if (longerLengthCodewordCandidate != currentCodeword) {
              continue;
            }
            nextCodewordByLength[longerCodewordLength] = nextCodeword;
          }
        }
        this.huffmanTree = new int[8];
        nextFreeTreeIndex = 0;
        treeEntryIndex = 0;
        while (true) {
          if (treeEntryIndex >= this.entryCount) {
            return;
          }
          treeCodewordLength = this.codewordLengths[treeEntryIndex];
          if (treeCodewordLength == 0) {
            treeEntryIndex++;
            continue;
          }
          treeCodeword = entryCodewords[treeEntryIndex];
          treeNodeIndex = 0;
          for (codewordBitIndex = 0; codewordBitIndex < treeCodewordLength; codewordBitIndex++) {
            branchBitMask = -2147483648 >>> codewordBitIndex;
            if ((treeCodeword & branchBitMask) == 0) {
              treeNodeIndex++;
            } else {
              if (this.huffmanTree[treeNodeIndex] == 0) {
                this.huffmanTree[treeNodeIndex] = nextFreeTreeIndex;
              }
              treeNodeIndex = this.huffmanTree[treeNodeIndex];
            }
            if (treeNodeIndex >= this.huffmanTree.length) {
              grownTree = new int[this.huffmanTree.length * 2];
              treeCopyIndex = 0;
              unusedTreeCopyIndexSnapshot = treeCopyIndex;
              while (treeCopyIndex < this.huffmanTree.length) {
                grownTree[treeCopyIndex] = this.huffmanTree[treeCopyIndex];
                treeCopyIndex++;
              }
              this.huffmanTree = grownTree;
            }
            branchBitMask = branchBitMask >>> 1;
          }
          this.huffmanTree[treeNodeIndex] = ~treeEntryIndex;
          if (treeNodeIndex < nextFreeTreeIndex) {
            treeEntryIndex++;
            continue;
          }
          nextFreeTreeIndex = treeNodeIndex + 1;
          treeEntryIndex++;
        }
    }

    private final static int computeLookupValueCount(int entries, int dimensions) {
        int candidateLookupValueCount = 0;
        for (candidateLookupValueCount = (int)Math.pow((double)entries, 1.0 / (double)dimensions) + 1; IterableNodeHashTable.powerInt(dimensions, (byte) 21, candidateLookupValueCount) > entries; candidateLookupValueCount--) {
        }
        return candidateLookupValueCount;
    }

    final float[] readVector() {
        return this.valueVectors[this.readScalar()];
    }

    VorbisCodebook() {
        int entryCursorBeforeIncrement = 0;
        int orderedFlagBeforeStore = 0;
        int sparseFlagBeforeStore = 0;
        int sequenceFlagBeforeStore = 0;
        int orderedLengthsValue;
        int entryCursorOrSparseLengthsValueOrLookupType;
        int codewordLengthOrUnusedUnorderedCursorSnapshot;
        float lookupMinimumValue;
        int orderedRunEntryCount;
        float lookupDeltaValue;
        int orderedRunIndex;
        int sequenceFlagValue;
        int lookupValueCount;
        int quantizedLookupIndex;
        float sequenceLastValue;
        int latticeIndexDivisorOrDenseLookupIndex;
        int dimensionIndex;
        float denseLookupValue;
        int latticeLookupIndex;
        float latticeLookupValue;
        int unorderedEntryIndex;
        int lookupType;
        int lookupValueBitCount;
        int vectorEntryIndex;
        MusicDecoder.readBits(24);
        this.dimensions = MusicDecoder.readBits(16);
        this.entryCount = MusicDecoder.readBits(24);
        this.codewordLengths = new int[this.entryCount];
        orderedFlagBeforeStore = (MusicDecoder.readBit() == 0) ? 0 : 1;
        orderedLengthsValue = orderedFlagBeforeStore;
        if (orderedLengthsValue != 0) {
          entryCursorOrSparseLengthsValueOrLookupType = 0;
          codewordLengthOrUnusedUnorderedCursorSnapshot = MusicDecoder.readBits(5) + 1;
          while (entryCursorOrSparseLengthsValueOrLookupType < this.entryCount) {
            orderedRunEntryCount = MusicDecoder.readBits(SpriteConstructionSupport.unsignedBitLength((byte) 58, this.entryCount - entryCursorOrSparseLengthsValueOrLookupType));
            for (orderedRunIndex = 0; orderedRunIndex < orderedRunEntryCount; orderedRunIndex++) {
              entryCursorBeforeIncrement = entryCursorOrSparseLengthsValueOrLookupType;
              entryCursorOrSparseLengthsValueOrLookupType++;
              this.codewordLengths[entryCursorBeforeIncrement] = codewordLengthOrUnusedUnorderedCursorSnapshot;
            }
            codewordLengthOrUnusedUnorderedCursorSnapshot++;
          }
        } else {
          sparseFlagBeforeStore = (MusicDecoder.readBit() == 0) ? 0 : 1;
          entryCursorOrSparseLengthsValueOrLookupType = sparseFlagBeforeStore;
          unorderedEntryIndex = 0;
          codewordLengthOrUnusedUnorderedCursorSnapshot = unorderedEntryIndex;
          while (unorderedEntryIndex < this.entryCount) {
            if (entryCursorOrSparseLengthsValueOrLookupType != 0 &&
                MusicDecoder.readBit() == 0) {
              this.codewordLengths[unorderedEntryIndex] = 0;
              unorderedEntryIndex++;
              continue;
            }
            this.codewordLengths[unorderedEntryIndex] = MusicDecoder.readBits(5) + 1;
            unorderedEntryIndex++;
          }
        }
        this.buildHuffmanTree();
        lookupType = MusicDecoder.readBits(4);
        if (lookupType > 0) {
          lookupMinimumValue = MusicDecoder.unpackVorbisFloat(MusicDecoder.readBits(32));
          lookupDeltaValue = MusicDecoder.unpackVorbisFloat(MusicDecoder.readBits(32));
          lookupValueBitCount = MusicDecoder.readBits(4) + 1;
          sequenceFlagBeforeStore = (MusicDecoder.readBit() == 0) ? 0 : 1;
          sequenceFlagValue = sequenceFlagBeforeStore;
          if (lookupType != 1) {
            lookupValueCount = this.entryCount * this.dimensions;
          } else {
            lookupValueCount = VorbisCodebook.computeLookupValueCount(this.entryCount, this.dimensions);
          }
          this.quantizedLookupValues = new int[lookupValueCount];
          for (quantizedLookupIndex = 0; quantizedLookupIndex < lookupValueCount; quantizedLookupIndex++) {
            this.quantizedLookupValues[quantizedLookupIndex] = MusicDecoder.readBits(lookupValueBitCount);
          }
          this.valueVectors = new float[this.entryCount][this.dimensions];
          if (lookupType == 1) {
            for (vectorEntryIndex = 0; vectorEntryIndex < this.entryCount; vectorEntryIndex++) {
              sequenceLastValue = 0.0f;
              latticeIndexDivisorOrDenseLookupIndex = 1;
              for (dimensionIndex = 0; dimensionIndex < this.dimensions; dimensionIndex++) {
                latticeLookupIndex = vectorEntryIndex / latticeIndexDivisorOrDenseLookupIndex % lookupValueCount;
                latticeLookupValue = (float)this.quantizedLookupValues[latticeLookupIndex] * lookupDeltaValue + lookupMinimumValue + sequenceLastValue;
                this.valueVectors[vectorEntryIndex][dimensionIndex] = latticeLookupValue;
                if (sequenceFlagValue != 0) {
                  sequenceLastValue = latticeLookupValue;
                }
                latticeIndexDivisorOrDenseLookupIndex = latticeIndexDivisorOrDenseLookupIndex * lookupValueCount;
              }
            }
          } else {
            for (vectorEntryIndex = 0; vectorEntryIndex < this.entryCount; vectorEntryIndex++) {
              sequenceLastValue = 0.0f;
              latticeIndexDivisorOrDenseLookupIndex = vectorEntryIndex * this.dimensions;
              for (dimensionIndex = 0; dimensionIndex < this.dimensions; dimensionIndex++) {
                denseLookupValue = (float)this.quantizedLookupValues[latticeIndexDivisorOrDenseLookupIndex] * lookupDeltaValue + lookupMinimumValue + sequenceLastValue;
                this.valueVectors[vectorEntryIndex][dimensionIndex] = denseLookupValue;
                if (sequenceFlagValue == 0) {
                  latticeIndexDivisorOrDenseLookupIndex++;
                  continue;
                }
                sequenceLastValue = denseLookupValue;
                latticeIndexDivisorOrDenseLookupIndex++;
              }
            }
          }
        }
    }
}
