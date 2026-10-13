/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VorbisCodebook {
    int dimensions;
    private int[] multiplicands;
    private int entryCount;
    private int[] codewordLengths;
    private int[] decodeTree;
    private float[][] vectors;

    private final void buildDecodeTree() {
        int[] lengthPrefixes;
        int nextTreeNode;
        int entryIndex;
        int length;
        int codeBit;
        int codeword;
        int nextPrefix;
        int shorterLength;
        int[] grownTree;
        int shorterPrefix;
        int shorterBit;
        int copyIndex;
        int[] prefixAlias;
        int[] prefixByLength;
        int[] codewords;
        int treeEntry;
        int treeCodeLength;
        int treeCodeword;
        int treeNode;
        int codeDepth;
        int treeBit;
        int unusedCopyIndex;
        int longerLength;
        int longerPrefix;
        codewords = new int[this.entryCount];
        prefixByLength = new int[33];
        prefixAlias = prefixByLength;
        lengthPrefixes = prefixAlias;
        for (entryIndex = 0; entryIndex < this.entryCount; entryIndex++) {
          length = this.codewordLengths[entryIndex];
          if (length != 0) {
            {
              codeBit = 1 << 32 - length;
              codeword = prefixByLength[length];
              codewords[entryIndex] = codeword;
              if ((codeword & codeBit) == 0) {
                nextPrefix = codeword | codeBit;
                for (shorterLength = length - 1; shorterLength >= 1; shorterLength--) {
                  shorterPrefix = prefixByLength[shorterLength];
                  if (shorterPrefix != codeword) {
                    break;
                  }
                  shorterBit = 1 << 32 - shorterLength;
                  if ((shorterPrefix & shorterBit) != 0) {
                    lengthPrefixes[shorterLength] = lengthPrefixes[shorterLength - 1];
                    break;
                  }
                  lengthPrefixes[shorterLength] = shorterPrefix | shorterBit;
                }
              } else {
                nextPrefix = lengthPrefixes[length - 1];
              }
            }
            prefixByLength[length] = nextPrefix;
            for (longerLength = length + 1; longerLength <= 32; longerLength++) {
              longerPrefix = prefixByLength[longerLength];
              if (longerPrefix == codeword) {
                prefixByLength[longerLength] = nextPrefix;
              }
            }
          }
        }
        this.decodeTree = new int[8];
        nextTreeNode = 0;
        for (treeEntry = 0; treeEntry < this.entryCount; treeEntry++) {
          treeCodeLength = this.codewordLengths[treeEntry];
          if (treeCodeLength != 0) {
            treeCodeword = codewords[treeEntry];
            treeNode = 0;
            for (codeDepth = 0; codeDepth < treeCodeLength; codeDepth++) {
              treeBit = -2147483648 >>> codeDepth;
              if ((treeCodeword & treeBit) == 0) {
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
                unusedCopyIndex = copyIndex;
                while (copyIndex < this.decodeTree.length) {
                  grownTree[copyIndex] = this.decodeTree[copyIndex];
                  copyIndex++;
                }
                this.decodeTree = grownTree;
              }
              treeBit = treeBit >>> 1;
            }
            this.decodeTree[treeNode] = ~treeEntry;
            if (treeNode >= nextTreeNode) {
              nextTreeNode = treeNode + 1;
            }
          }
        }
    }

    final float[] decodeVector() {
        return this.vectors[this.decodeScalar()];
    }

    final int decodeScalar() {
        int treeNode = 0;
        while (this.decodeTree[treeNode] >= 0) {
          treeNode = VorbisSample.readBit() != 0 ? this.decodeTree[treeNode] : treeNode + 1;
        }
        return ~this.decodeTree[treeNode];
    }

    private final static int lookup1Values(int entries, int dimensions) {
        int values = 0;
        for (values = (int)Math.pow((double)entries, 1.0 / (double)dimensions) + 1; hh.integerPower(dimensions, 29605, values) > entries; values--) {
        }
        return values;
    }

    VorbisCodebook() {
        int orderedEntry = 0;
        int orderedFlag = 0;
        int sparseFlag = 0;
        int sequenceFlag = 0;
        int ordered;
        int entryOrSparse;
        int codeLengthOrUnusedIndex;
        float minimumValue;
        int runCount;
        float deltaValue;
        int runEntry;
        int sequence;
        int lookupValueCount;
        int multiplicandIndex;
        float lastValue;
        int lookupIndexOrDivisor;
        int dimensionIndex;
        float linearValue;
        int permutedIndex;
        float permutedValue;
        int unorderedEntry;
        int lookupType;
        int valueBits;
        int vectorEntry;
        VorbisSample.readBits(24);
        this.dimensions = VorbisSample.readBits(16);
        this.entryCount = VorbisSample.readBits(24);
        this.codewordLengths = new int[this.entryCount];
        orderedFlag = (VorbisSample.readBit() == 0) ? 0 : 1;
        ordered = orderedFlag;
        if (ordered != 0) {
          entryOrSparse = 0;
          codeLengthOrUnusedIndex = VorbisSample.readBits(5) + 1;
          while (entryOrSparse < this.entryCount) {
            runCount = VorbisSample.readBits(ed.unsignedBitLength(9, this.entryCount - entryOrSparse));
            for (runEntry = 0; runEntry < runCount; runEntry++) {
              orderedEntry = entryOrSparse;
              entryOrSparse++;
              this.codewordLengths[orderedEntry] = codeLengthOrUnusedIndex;
            }
            codeLengthOrUnusedIndex++;
          }
        } else {
          sparseFlag = (VorbisSample.readBit() == 0) ? 0 : 1;
          entryOrSparse = sparseFlag;
          unorderedEntry = 0;
          codeLengthOrUnusedIndex = unorderedEntry;
          while (unorderedEntry < this.entryCount) {
            if (entryOrSparse != 0 &&
              VorbisSample.readBit() == 0) {
              this.codewordLengths[unorderedEntry] = 0;
            } else {
              this.codewordLengths[unorderedEntry] = VorbisSample.readBits(5) + 1;
            }
            unorderedEntry++;
          }
        }
        this.buildDecodeTree();
        lookupType = VorbisSample.readBits(4);
        if (lookupType > 0) {
          minimumValue = VorbisSample.unpackFloat(VorbisSample.readBits(32));
          deltaValue = VorbisSample.unpackFloat(VorbisSample.readBits(32));
          valueBits = VorbisSample.readBits(4) + 1;
          sequenceFlag = (VorbisSample.readBit() == 0) ? 0 : 1;
          sequence = sequenceFlag;
          if (lookupType != 1) {
            lookupValueCount = this.entryCount * this.dimensions;
          } else {
            lookupValueCount = VorbisCodebook.lookup1Values(this.entryCount, this.dimensions);
          }
          this.multiplicands = new int[lookupValueCount];
          for (multiplicandIndex = 0; multiplicandIndex < lookupValueCount; multiplicandIndex++) {
            this.multiplicands[multiplicandIndex] = VorbisSample.readBits(valueBits);
          }
          this.vectors = new float[this.entryCount][this.dimensions];
          if (lookupType != 1) {
            for (vectorEntry = 0; vectorEntry < this.entryCount; vectorEntry++) {
              lastValue = 0.0f;
              lookupIndexOrDivisor = vectorEntry * this.dimensions;
              for (dimensionIndex = 0; dimensionIndex < this.dimensions; dimensionIndex++) {
                linearValue = (float)this.multiplicands[lookupIndexOrDivisor] * deltaValue + minimumValue + lastValue;
                this.vectors[vectorEntry][dimensionIndex] = linearValue;
                if (sequence != 0) {
                  lastValue = linearValue;
                }
                lookupIndexOrDivisor++;
              }
            }
          } else {
            for (vectorEntry = 0; vectorEntry < this.entryCount; vectorEntry++) {
              lastValue = 0.0f;
              lookupIndexOrDivisor = 1;
              for (dimensionIndex = 0; dimensionIndex < this.dimensions; dimensionIndex++) {
                permutedIndex = vectorEntry / lookupIndexOrDivisor % lookupValueCount;
                permutedValue = (float)this.multiplicands[permutedIndex] * deltaValue + minimumValue + lastValue;
                this.vectors[vectorEntry][dimensionIndex] = permutedValue;
                if (sequence != 0) {
                  lastValue = permutedValue;
                }
                lookupIndexOrDivisor = lookupIndexOrDivisor * lookupValueCount;
              }
            }
          }
        }
    }
}
