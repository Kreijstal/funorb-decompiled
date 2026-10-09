/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VorbisResidue {
    private int begin;
    private int classbookIndex;
    private int[] passBookIndices;
    private int partitionSize;
    private int classificationCount;
    private int residueType;
    private int end;

    final void decodeResidue(float[] samples, int sampleCount, boolean silent) {
        int passIndex = 0;
        int contiguousVectorComponentIndex = 0;
        int stridedVectorIndex = 0;
        int stridedVectorComponentIndex = 0;
        int clearSampleIndexOrClasswordDimensions;
        int residueSampleSpan;
        int partitionCount;
        int[] classificationsAlias;
        int partitionIndex;
        int classwordRemainderOrGroupPartitionIndex;
        int classwordDimensionIndexOrClassification;
        int passBookId;
        int partitionSampleOffset;
        VorbisCodebook residueCodebook;
        int partitionSampleCursorOrStridedVectorCount;
        int[] intermediateClassificationsAlias;
        int[] allocatedClassifications;
        float[] stridedVector;
        float[] contiguousVector;
        int clearSampleIndexOrClasswordDimensionsPhase2;
        int classwordRemainderOrGroupPartitionIndexNestedPhase2;
        int classwordDimensionIndexOrClassificationNestedPhase2;
        int[] classificationGroupAlias;
        for (clearSampleIndexOrClasswordDimensions = 0; clearSampleIndexOrClasswordDimensions < sampleCount; clearSampleIndexOrClasswordDimensions++) {
          samples[clearSampleIndexOrClasswordDimensions] = 0.0f;
        }
        if (silent) {
          return;
        }
        clearSampleIndexOrClasswordDimensionsPhase2 = MusicDecoder.codebooks[this.classbookIndex].dimensions;
        residueSampleSpan = this.end - this.begin;
        partitionCount = residueSampleSpan / this.partitionSize;
        allocatedClassifications = new int[partitionCount];
        intermediateClassificationsAlias = allocatedClassifications;
        classificationsAlias = intermediateClassificationsAlias;
        for (passIndex = 0; passIndex < 8; passIndex++) {
          partitionIndex = 0;
          while (partitionIndex < partitionCount) {
            if (passIndex == 0) {
              classwordRemainderOrGroupPartitionIndex = MusicDecoder.codebooks[this.classbookIndex].readScalar();
              for (classwordDimensionIndexOrClassification = clearSampleIndexOrClasswordDimensionsPhase2 - 1; classwordDimensionIndexOrClassification >= 0; classwordDimensionIndexOrClassification--) {
                if (partitionIndex + classwordDimensionIndexOrClassification < partitionCount) {
                  classificationsAlias[partitionIndex + classwordDimensionIndexOrClassification] = classwordRemainderOrGroupPartitionIndex % this.classificationCount;
                }
                classwordRemainderOrGroupPartitionIndex = classwordRemainderOrGroupPartitionIndex / this.classificationCount;
              }
            }
            classificationGroupAlias = intermediateClassificationsAlias;
            classwordRemainderOrGroupPartitionIndexNestedPhase2 = 0;
            while (classwordRemainderOrGroupPartitionIndexNestedPhase2 < clearSampleIndexOrClasswordDimensionsPhase2) {
              classwordDimensionIndexOrClassificationNestedPhase2 = classificationGroupAlias[partitionIndex];
              passBookId = this.passBookIndices[classwordDimensionIndexOrClassificationNestedPhase2 * 8 + passIndex];
              if (passBookId >= 0) {
                partitionSampleOffset = this.begin + partitionIndex * this.partitionSize;
                residueCodebook = MusicDecoder.codebooks[passBookId];
                if (this.residueType != 0) {
                  partitionSampleCursorOrStridedVectorCount = 0;
                  while (partitionSampleCursorOrStridedVectorCount < this.partitionSize) {
                    contiguousVector = residueCodebook.readVector();
                    for (contiguousVectorComponentIndex = 0; contiguousVectorComponentIndex < residueCodebook.dimensions; contiguousVectorComponentIndex++) {
                      samples[partitionSampleOffset + partitionSampleCursorOrStridedVectorCount] = samples[partitionSampleOffset + partitionSampleCursorOrStridedVectorCount] + contiguousVector[contiguousVectorComponentIndex];
                      partitionSampleCursorOrStridedVectorCount++;
                    }
                  }
                } else {
                  partitionSampleCursorOrStridedVectorCount = this.partitionSize / residueCodebook.dimensions;
                  for (stridedVectorIndex = 0; stridedVectorIndex < partitionSampleCursorOrStridedVectorCount; stridedVectorIndex++) {
                    stridedVector = residueCodebook.readVector();
                    for (stridedVectorComponentIndex = 0; stridedVectorComponentIndex < residueCodebook.dimensions; stridedVectorComponentIndex++) {
                      samples[partitionSampleOffset + stridedVectorIndex + stridedVectorComponentIndex * partitionSampleCursorOrStridedVectorCount] = samples[partitionSampleOffset + stridedVectorIndex + stridedVectorComponentIndex * partitionSampleCursorOrStridedVectorCount] + stridedVector[stridedVectorComponentIndex];
                    }
                  }
                }
              }
              partitionIndex++;
              if (partitionIndex >= partitionCount) {
                break;
              }
              classwordRemainderOrGroupPartitionIndexNestedPhase2++;
            }
          }
        }
        return;
    }

    VorbisResidue() {
        int highCascadeBits = 0;
        int lowCascadeBits = 0;
        int highCascadePresentValue = 0;
        int classificationIndexOrUnusedPassCursorSnapshot = 0;
        int unusedInitialPassBookTableIndexSnapshot;
        this.residueType = MusicDecoder.readBits(16);
        this.begin = MusicDecoder.readBits(24);
        this.end = MusicDecoder.readBits(24);
        this.partitionSize = MusicDecoder.readBits(24) + 1;
        this.classificationCount = MusicDecoder.readBits(6) + 1;
        this.classbookIndex = MusicDecoder.readBits(8);
        int[] cascadeMasks = new int[this.classificationCount];
        for (classificationIndexOrUnusedPassCursorSnapshot = 0; classificationIndexOrUnusedPassCursorSnapshot < this.classificationCount; classificationIndexOrUnusedPassCursorSnapshot++) {
            highCascadeBits = 0;
            lowCascadeBits = MusicDecoder.readBits(3);
            highCascadePresentValue = MusicDecoder.readBit() != 0 ? 1 : 0;
            if (highCascadePresentValue != 0) {
                highCascadeBits = MusicDecoder.readBits(5);
            }
            cascadeMasks[classificationIndexOrUnusedPassCursorSnapshot] = highCascadeBits << 3 | lowCascadeBits;
        }
        this.passBookIndices = new int[this.classificationCount * 8];
        int passBookTableIndex = 0;
        unusedInitialPassBookTableIndexSnapshot = passBookTableIndex;
        while (passBookTableIndex < this.classificationCount * 8) {
            this.passBookIndices[passBookTableIndex] = (cascadeMasks[passBookTableIndex >> 3] & 1 << (passBookTableIndex & 7)) != 0 ? MusicDecoder.readBits(8) : -1;
            passBookTableIndex++;
        }
    }
}
