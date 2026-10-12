/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VorbisResidue {
    private int end;
    private int residueType;
    private int begin;
    private int classbookId;
    private int partitionSize;
    private int[] cascadeBooks;
    private int classificationCount;

    final void decode(float[] output, int sampleCount, boolean skipDecoding) {
        int pass = 0;
        int sequentialDimensionIndex = 0;
        int strideIndex = 0;
        int stridedDimensionIndex = 0;
        int clearIndex;
        int residueLength;
        int partitionCount;
        int[] classifications;
        int partitionIndex;
        int classWord;
        int classDimensionIndex;
        int bookId;
        int partitionOffset;
        VorbisCodebook book;
        int strideOrWriteIndex;
        int[] classificationAlias;
        int[] classificationBuffer;
        float[] stridedVector;
        float[] sequentialVector;
        int classbookDimensions;
        int classGroupIndex;
        int classification;
        int[] classificationGroup;
        for (clearIndex = 0; clearIndex < sampleCount; clearIndex++) {
          output[clearIndex] = 0.0f;
        }
        if (skipDecoding) {
          return;
        }
        classbookDimensions = VorbisSample.codebooks[this.classbookId].dimensions;
        residueLength = this.end - this.begin;
        partitionCount = residueLength / this.partitionSize;
        classificationBuffer = new int[partitionCount];
        classificationAlias = classificationBuffer;
        classifications = classificationAlias;
        for (pass = 0; pass < 8; pass++) {
          partitionIndex = 0;
          while (partitionIndex < partitionCount) {
            if (pass == 0) {
              classWord = VorbisSample.codebooks[this.classbookId].decodeScalar();
              for (classDimensionIndex = classbookDimensions - 1; classDimensionIndex >= 0; classDimensionIndex--) {
                if (partitionIndex + classDimensionIndex < partitionCount) {
                  classifications[partitionIndex + classDimensionIndex] = classWord % this.classificationCount;
                }
                classWord = classWord / this.classificationCount;
              }
            }
            classificationGroup = classificationAlias;
            classGroupIndex = 0;
            while (classGroupIndex < classbookDimensions) {
              classification = classificationGroup[partitionIndex];
              bookId = this.cascadeBooks[classification * 8 + pass];
              if (bookId >= 0) {
                partitionOffset = this.begin + partitionIndex * this.partitionSize;
                book = VorbisSample.codebooks[bookId];
                if (this.residueType != 0) {
                  strideOrWriteIndex = 0;
                  while (strideOrWriteIndex < this.partitionSize) {
                    sequentialVector = book.decodeVector();
                    for (sequentialDimensionIndex = 0; sequentialDimensionIndex < book.dimensions; sequentialDimensionIndex++) {
                      output[partitionOffset + strideOrWriteIndex] = output[partitionOffset + strideOrWriteIndex] + sequentialVector[sequentialDimensionIndex];
                      strideOrWriteIndex++;
                    }
                  }
                } else {
                  strideOrWriteIndex = this.partitionSize / book.dimensions;
                  for (strideIndex = 0; strideIndex < strideOrWriteIndex; strideIndex++) {
                    stridedVector = book.decodeVector();
                    for (stridedDimensionIndex = 0; stridedDimensionIndex < book.dimensions; stridedDimensionIndex++) {
                      output[partitionOffset + strideIndex + stridedDimensionIndex * strideOrWriteIndex] = output[partitionOffset + strideIndex + stridedDimensionIndex * strideOrWriteIndex] + stridedVector[stridedDimensionIndex];
                    }
                  }
                }
              }
              partitionIndex++;
              if (partitionIndex >= partitionCount) {
                break;
              }
              classGroupIndex++;
            }
          }
        }
        return;
    }

    VorbisResidue() {
        int highCascadeBits = 0;
        int lowCascadeBits = 0;
        int hasHighCascade = 0;
        int classificationIndex = 0;
        int initialCascadeIndex;
        this.residueType = VorbisSample.readBits(16);
        this.begin = VorbisSample.readBits(24);
        this.end = VorbisSample.readBits(24);
        this.partitionSize = VorbisSample.readBits(24) + 1;
        this.classificationCount = VorbisSample.readBits(6) + 1;
        this.classbookId = VorbisSample.readBits(8);
        int[] cascades = new int[this.classificationCount];
        for (classificationIndex = 0; classificationIndex < this.classificationCount; classificationIndex++) {
          highCascadeBits = 0;
          lowCascadeBits = VorbisSample.readBits(3);
          hasHighCascade = VorbisSample.readBit() != 0 ? 1 : 0;
          if (hasHighCascade != 0) {
            highCascadeBits = VorbisSample.readBits(5);
          }
          cascades[classificationIndex] = highCascadeBits << 3 | lowCascadeBits;
        }
        this.cascadeBooks = new int[this.classificationCount * 8];
        int cascadeIndex = 0;
        initialCascadeIndex = cascadeIndex;
        while (cascadeIndex < this.classificationCount * 8) {
          this.cascadeBooks[cascadeIndex] = (cascades[cascadeIndex >> 3] & 1 << (cascadeIndex & 7)) != 0 ? VorbisSample.readBits(8) : -1;
          cascadeIndex++;
        }
    }
}
