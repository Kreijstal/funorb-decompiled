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
        int lengthBitMaskOrCodeword;
        int currentCodewordOrTreeIndex;
        int nextCodewordOrBitIndex;
        int shorterOrLongerLengthOrBranchBitMask;
        int[] grownTree;
        int candidateCodeword;
        int carryBitMaskOrUnusedCopyCursorSnapshot;
        int treeCopyIndex;
        int[] intermediateNextCodewordByLengthAlias;
        int[] nextCodewordByLength;
        int[] entryCodewords;
        int entryIndexPhase2;
        int codewordLengthPhase2;
        int lengthBitMaskOrCodewordPhase2;
        int currentCodewordOrTreeIndexPhase2;
        int nextCodewordOrBitIndexPhase2;
        int shorterOrLongerLengthOrBranchBitMaskPhase2;
        int carryBitMaskOrUnusedCopyCursorSnapshotPhase2;
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
            lengthBitMaskOrCodeword = 1 << 32 - codewordLength;
            currentCodewordOrTreeIndex = nextCodewordByLength[codewordLength];
            entryCodewords[entryIndex] = currentCodewordOrTreeIndex;
            if ((currentCodewordOrTreeIndex & lengthBitMaskOrCodeword) == 0) {
              nextCodewordOrBitIndex = currentCodewordOrTreeIndex | lengthBitMaskOrCodeword;
              for (shorterOrLongerLengthOrBranchBitMask = codewordLength - 1; shorterOrLongerLengthOrBranchBitMask >= 1; shorterOrLongerLengthOrBranchBitMask--) {
                candidateCodeword = nextCodewordByLength[shorterOrLongerLengthOrBranchBitMask];
                if (candidateCodeword != currentCodewordOrTreeIndex) {
                  break shorterLengthCarryResolution;
                }
                carryBitMaskOrUnusedCopyCursorSnapshot = 1 << 32 - shorterOrLongerLengthOrBranchBitMask;
                if ((candidateCodeword & carryBitMaskOrUnusedCopyCursorSnapshot) != 0) {
                  nextCodewordByLengthAlias[shorterOrLongerLengthOrBranchBitMask] = nextCodewordByLengthAlias[shorterOrLongerLengthOrBranchBitMask - 1];
                  break shorterLengthCarryResolution;
                }
                nextCodewordByLengthAlias[shorterOrLongerLengthOrBranchBitMask] = candidateCodeword | carryBitMaskOrUnusedCopyCursorSnapshot;
              }
              break shorterLengthCarryResolution;
            }
            nextCodewordOrBitIndex = nextCodewordByLengthAlias[codewordLength - 1];
          }
          nextCodewordByLength[codewordLength] = nextCodewordOrBitIndex;
          for (shorterOrLongerLengthOrBranchBitMask = codewordLength + 1; shorterOrLongerLengthOrBranchBitMask <= 32; shorterOrLongerLengthOrBranchBitMask++) {
            candidateCodeword = nextCodewordByLength[shorterOrLongerLengthOrBranchBitMask];
            if (candidateCodeword != currentCodewordOrTreeIndex) {
              continue;
            }
            nextCodewordByLength[shorterOrLongerLengthOrBranchBitMask] = nextCodewordOrBitIndex;
          }
        }
        this.huffmanTree = new int[8];
        nextFreeTreeIndex = 0;
        entryIndexPhase2 = 0;
        while (true) {
          if (entryIndexPhase2 >= this.entryCount) {
            return;
          }
          codewordLengthPhase2 = this.codewordLengths[entryIndexPhase2];
          if (codewordLengthPhase2 == 0) {
            entryIndexPhase2++;
            continue;
          }
          lengthBitMaskOrCodewordPhase2 = entryCodewords[entryIndexPhase2];
          currentCodewordOrTreeIndexPhase2 = 0;
          for (nextCodewordOrBitIndexPhase2 = 0; nextCodewordOrBitIndexPhase2 < codewordLengthPhase2; nextCodewordOrBitIndexPhase2++) {
            shorterOrLongerLengthOrBranchBitMaskPhase2 = -2147483648 >>> nextCodewordOrBitIndexPhase2;
            if ((lengthBitMaskOrCodewordPhase2 & shorterOrLongerLengthOrBranchBitMaskPhase2) == 0) {
              currentCodewordOrTreeIndexPhase2++;
            } else {
              if (this.huffmanTree[currentCodewordOrTreeIndexPhase2] == 0) {
                this.huffmanTree[currentCodewordOrTreeIndexPhase2] = nextFreeTreeIndex;
              }
              currentCodewordOrTreeIndexPhase2 = this.huffmanTree[currentCodewordOrTreeIndexPhase2];
            }
            if (currentCodewordOrTreeIndexPhase2 >= this.huffmanTree.length) {
              grownTree = new int[this.huffmanTree.length * 2];
              treeCopyIndex = 0;
              carryBitMaskOrUnusedCopyCursorSnapshotPhase2 = treeCopyIndex;
              while (treeCopyIndex < this.huffmanTree.length) {
                grownTree[treeCopyIndex] = this.huffmanTree[treeCopyIndex];
                treeCopyIndex++;
              }
              this.huffmanTree = grownTree;
            }
            shorterOrLongerLengthOrBranchBitMaskPhase2 = shorterOrLongerLengthOrBranchBitMaskPhase2 >>> 1;
          }
          this.huffmanTree[currentCodewordOrTreeIndexPhase2] = ~entryIndexPhase2;
          if (currentCodewordOrTreeIndexPhase2 < nextFreeTreeIndex) {
            entryIndexPhase2++;
            continue;
          }
          nextFreeTreeIndex = currentCodewordOrTreeIndexPhase2 + 1;
          entryIndexPhase2++;
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
        int runEntryIndexOrLookupValueBits;
        int sequenceFlagValue;
        int lookupValueCount;
        int lookupValueIndexOrEntryIndex;
        float sequenceLastValue;
        int latticeIndexDivisorOrDenseLookupIndex;
        int dimensionIndex;
        float denseLookupValue;
        int latticeLookupIndex;
        float latticeLookupValue;
        int unorderedEntryIndex;
        int entryCursorOrSparseLengthsValueOrLookupTypePhase2;
        int runEntryIndexOrLookupValueBitsPhase2;
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
            for (runEntryIndexOrLookupValueBits = 0; runEntryIndexOrLookupValueBits < orderedRunEntryCount; runEntryIndexOrLookupValueBits++) {
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
        entryCursorOrSparseLengthsValueOrLookupTypePhase2 = MusicDecoder.readBits(4);
        if (entryCursorOrSparseLengthsValueOrLookupTypePhase2 > 0) {
          lookupMinimumValue = MusicDecoder.unpackVorbisFloat(MusicDecoder.readBits(32));
          lookupDeltaValue = MusicDecoder.unpackVorbisFloat(MusicDecoder.readBits(32));
          runEntryIndexOrLookupValueBitsPhase2 = MusicDecoder.readBits(4) + 1;
          sequenceFlagBeforeStore = (MusicDecoder.readBit() == 0) ? 0 : 1;
          sequenceFlagValue = sequenceFlagBeforeStore;
          if (entryCursorOrSparseLengthsValueOrLookupTypePhase2 != 1) {
            lookupValueCount = this.entryCount * this.dimensions;
          } else {
            lookupValueCount = VorbisCodebook.computeLookupValueCount(this.entryCount, this.dimensions);
          }
          this.quantizedLookupValues = new int[lookupValueCount];
          for (lookupValueIndexOrEntryIndex = 0; lookupValueIndexOrEntryIndex < lookupValueCount; lookupValueIndexOrEntryIndex++) {
            this.quantizedLookupValues[lookupValueIndexOrEntryIndex] = MusicDecoder.readBits(runEntryIndexOrLookupValueBitsPhase2);
          }
          this.valueVectors = new float[this.entryCount][this.dimensions];
          if (entryCursorOrSparseLengthsValueOrLookupTypePhase2 == 1) {
            for (lookupValueIndexOrEntryIndex = 0; lookupValueIndexOrEntryIndex < this.entryCount; lookupValueIndexOrEntryIndex++) {
              sequenceLastValue = 0.0f;
              latticeIndexDivisorOrDenseLookupIndex = 1;
              for (dimensionIndex = 0; dimensionIndex < this.dimensions; dimensionIndex++) {
                latticeLookupIndex = lookupValueIndexOrEntryIndex / latticeIndexDivisorOrDenseLookupIndex % lookupValueCount;
                latticeLookupValue = (float)this.quantizedLookupValues[latticeLookupIndex] * lookupDeltaValue + lookupMinimumValue + sequenceLastValue;
                this.valueVectors[lookupValueIndexOrEntryIndex][dimensionIndex] = latticeLookupValue;
                if (sequenceFlagValue != 0) {
                  sequenceLastValue = latticeLookupValue;
                }
                latticeIndexDivisorOrDenseLookupIndex = latticeIndexDivisorOrDenseLookupIndex * lookupValueCount;
              }
            }
          } else {
            for (lookupValueIndexOrEntryIndex = 0; lookupValueIndexOrEntryIndex < this.entryCount; lookupValueIndexOrEntryIndex++) {
              sequenceLastValue = 0.0f;
              latticeIndexDivisorOrDenseLookupIndex = lookupValueIndexOrEntryIndex * this.dimensions;
              for (dimensionIndex = 0; dimensionIndex < this.dimensions; dimensionIndex++) {
                denseLookupValue = (float)this.quantizedLookupValues[latticeIndexDivisorOrDenseLookupIndex] * lookupDeltaValue + lookupMinimumValue + sequenceLastValue;
                this.valueVectors[lookupValueIndexOrEntryIndex][dimensionIndex] = denseLookupValue;
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
