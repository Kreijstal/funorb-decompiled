/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VorbisCodebook {
    private int[] multiplicands;
    private int[] codeLengths;
    private int[] decodeTree;
    private float[][] vectors;
    int dimensions;
    private int entryCount;

    private final void buildDecodeTree() {
        int[] nextCodesAlias;
        int nextTreeNode;
        int entryIndex;
        int codeLength;
        int codeBit;
        int codeWord;
        int nextCodeWord;
        int shorterLength;
        int[] grownTree;
        int shorterCode;
        int shorterBit;
        int copyIndex;
        int[] codeTableAlias;
        int[] nextCodes;
        int[] codeWords;
        int treeEntryIndex;
        int treeCodeLength;
        int treeCodeWord;
        int treeNode;
        int codeBitIndex;
        int treeBitMask;
        int initialCopyIndex;
        int longerLength;
        int longerCode;
        codeWords = new int[this.entryCount];
        nextCodes = new int[33];
        codeTableAlias = nextCodes;
        nextCodesAlias = codeTableAlias;
        for (entryIndex = 0; entryIndex < this.entryCount; entryIndex++) {
          codeLength = this.codeLengths[entryIndex];
          if (codeLength != 0) {
            {
              codeBit = 1 << 32 - codeLength;
              codeWord = nextCodes[codeLength];
              codeWords[entryIndex] = codeWord;
              if ((codeWord & codeBit) == 0) {
                nextCodeWord = codeWord | codeBit;
                for (shorterLength = codeLength - 1; shorterLength >= 1; shorterLength--) {
                  shorterCode = nextCodes[shorterLength];
                  if (shorterCode != codeWord) {
                    break;
                  }
                  shorterBit = 1 << 32 - shorterLength;
                  if ((shorterCode & shorterBit) != 0) {
                    nextCodesAlias[shorterLength] = nextCodesAlias[shorterLength - 1];
                    break;
                  }
                  nextCodesAlias[shorterLength] = shorterCode | shorterBit;
                }
              } else {
                nextCodeWord = nextCodesAlias[codeLength - 1];
              }
            }
            nextCodes[codeLength] = nextCodeWord;
            for (longerLength = codeLength + 1; longerLength <= 32; longerLength++) {
              longerCode = nextCodes[longerLength];
              if (longerCode == codeWord) {
                nextCodes[longerLength] = nextCodeWord;
              }
            }
          }
        }
        this.decodeTree = new int[8];
        nextTreeNode = 0;
        for (treeEntryIndex = 0; treeEntryIndex < this.entryCount; treeEntryIndex++) {
          treeCodeLength = this.codeLengths[treeEntryIndex];
          if (treeCodeLength != 0) {
            treeCodeWord = codeWords[treeEntryIndex];
            treeNode = 0;
            for (codeBitIndex = 0; codeBitIndex < treeCodeLength; codeBitIndex++) {
              treeBitMask = -2147483648 >>> codeBitIndex;
              if ((treeCodeWord & treeBitMask) == 0) {
                treeNode++;
              } else {
                if (this.decodeTree[treeNode] == 0) {
                  this.decodeTree[treeNode] = nextTreeNode;
                }
                treeNode = this.decodeTree[treeNode];
              }
              if (treeNode >= this.decodeTree.length) {
                grownTree = new int[this.decodeTree.length * 2];
                copyIndex = 0;
                initialCopyIndex = copyIndex;
                while (copyIndex < this.decodeTree.length) {
                  grownTree[copyIndex] = this.decodeTree[copyIndex];
                  copyIndex++;
                }
                this.decodeTree = grownTree;
              }
              treeBitMask = treeBitMask >>> 1;
            }
            this.decodeTree[treeNode] = ~treeEntryIndex;
            if (treeNode >= nextTreeNode) {
              nextTreeNode = treeNode + 1;
            }
          }
        }
    }

    private final static int lookupValueCount(int entryCount, int dimensions) {
        int valueCount = 0;
        for (valueCount = (int)Math.pow((double)entryCount, 1.0 / (double)dimensions) + 1; lq.integerPower(valueCount, dimensions, (byte) 21) > entryCount; valueCount--) {
        }
        return valueCount;
    }

    final int decodeScalar() {
        int treeNode = 0;
        while (this.decodeTree[treeNode] >= 0) {
          treeNode = VorbisSample.readBit() != 0 ? this.decodeTree[treeNode] : treeNode + 1;
        }
        return ~this.decodeTree[treeNode];
    }

    final float[] decodeVector() {
        return this.vectors[this.decodeScalar()];
    }

    VorbisCodebook() {
        int lengthEntryIndex = 0;
        int orderedFlag = 0;
        int sparseFlag = 0;
        int sequenceFlag = 0;
        int ordered;
        int lengthCursorOrSparseFlag;
        int currentCodeLength;
        float minimumValue;
        int lengthRunCount;
        float deltaValue;
        int runEntryIndex;
        int sequenceP;
        int lookupCount;
        int multiplicandIndex;
        float lastValue;
        int lookupCursorOrDivisor;
        int dimensionIndex;
        float lookup2Value;
        int lookup1Index;
        float lookup1Value;
        int sparseEntryIndex;
        int lookupType;
        int valueBits;
        int vectorEntryIndex;
        VorbisSample.readBits(24);
        this.dimensions = VorbisSample.readBits(16);
        this.entryCount = VorbisSample.readBits(24);
        this.codeLengths = new int[this.entryCount];
        orderedFlag = (VorbisSample.readBit() == 0) ? 0 : 1;
        ordered = orderedFlag;
        if (ordered != 0) {
          lengthCursorOrSparseFlag = 0;
          currentCodeLength = VorbisSample.readBits(5) + 1;
          while (lengthCursorOrSparseFlag < this.entryCount) {
            lengthRunCount = VorbisSample.readBits(wl.bitLength(this.entryCount - lengthCursorOrSparseFlag, -13337));
            for (runEntryIndex = 0; runEntryIndex < lengthRunCount; runEntryIndex++) {
              lengthEntryIndex = lengthCursorOrSparseFlag;
              lengthCursorOrSparseFlag++;
              this.codeLengths[lengthEntryIndex] = currentCodeLength;
            }
            currentCodeLength++;
          }
        } else {
          sparseFlag = (VorbisSample.readBit() == 0) ? 0 : 1;
          lengthCursorOrSparseFlag = sparseFlag;
          sparseEntryIndex = 0;
          currentCodeLength = sparseEntryIndex;
          while (sparseEntryIndex < this.entryCount) {
            if (lengthCursorOrSparseFlag != 0 &&
              VorbisSample.readBit() == 0) {
              this.codeLengths[sparseEntryIndex] = 0;
            } else {
              this.codeLengths[sparseEntryIndex] = VorbisSample.readBits(5) + 1;
            }
            sparseEntryIndex++;
          }
        }
        this.buildDecodeTree();
        lookupType = VorbisSample.readBits(4);
        if (lookupType > 0) {
          minimumValue = VorbisSample.unpackFloat(VorbisSample.readBits(32));
          deltaValue = VorbisSample.unpackFloat(VorbisSample.readBits(32));
          valueBits = VorbisSample.readBits(4) + 1;
          sequenceFlag = (VorbisSample.readBit() == 0) ? 0 : 1;
          sequenceP = sequenceFlag;
          if (lookupType != 1) {
            lookupCount = this.entryCount * this.dimensions;
          } else {
            lookupCount = VorbisCodebook.lookupValueCount(this.entryCount, this.dimensions);
          }
          this.multiplicands = new int[lookupCount];
          for (multiplicandIndex = 0; multiplicandIndex < lookupCount; multiplicandIndex++) {
            this.multiplicands[multiplicandIndex] = VorbisSample.readBits(valueBits);
          }
          this.vectors = new float[this.entryCount][this.dimensions];
          if (lookupType != 1) {
            for (vectorEntryIndex = 0; vectorEntryIndex < this.entryCount; vectorEntryIndex++) {
              lastValue = 0.0f;
              lookupCursorOrDivisor = vectorEntryIndex * this.dimensions;
              for (dimensionIndex = 0; dimensionIndex < this.dimensions; dimensionIndex++) {
                lookup2Value = (float)this.multiplicands[lookupCursorOrDivisor] * deltaValue + minimumValue + lastValue;
                this.vectors[vectorEntryIndex][dimensionIndex] = lookup2Value;
                if (sequenceP != 0) {
                  lastValue = lookup2Value;
                }
                lookupCursorOrDivisor++;
              }
            }
          } else {
            for (vectorEntryIndex = 0; vectorEntryIndex < this.entryCount; vectorEntryIndex++) {
              lastValue = 0.0f;
              lookupCursorOrDivisor = 1;
              for (dimensionIndex = 0; dimensionIndex < this.dimensions; dimensionIndex++) {
                lookup1Index = vectorEntryIndex / lookupCursorOrDivisor % lookupCount;
                lookup1Value = (float)this.multiplicands[lookup1Index] * deltaValue + minimumValue + lastValue;
                this.vectors[vectorEntryIndex][dimensionIndex] = lookup1Value;
                if (sequenceP != 0) {
                  lastValue = lookup1Value;
                }
                lookupCursorOrDivisor = lookupCursorOrDivisor * lookupCount;
              }
            }
          }
        }
    }
}
