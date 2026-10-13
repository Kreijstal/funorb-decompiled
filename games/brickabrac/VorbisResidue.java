/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VorbisResidue {
    private int partitionSize;
    private int[] cascadeBooks;
    private int end;
    private int classificationCount;
    private int type;
    private int begin;
    private int classbook;

    final void decode(float[] spectrum, int sampleCount, boolean skip) {
        int pass = 0;
        int sequentialDimension = 0;
        int stridedVector = 0;
        int stridedDimension = 0;
        int clearSample;
        int range;
        int partitionCount;
        int[] classifications;
        int partition;
        int classword;
        int phraseDimension;
        int bookIndex;
        int partitionOffset;
        VorbisCodebook book;
        int offsetOrStride;
        int[] classificationAlias;
        int[] classificationStorage;
        float[] stridedValues;
        float[] sequentialValues;
        int phraseDimensions;
        int phraseIndex;
        int classification;
        int[] phraseClasses;
        for (clearSample = 0; clearSample < sampleCount; clearSample++) {
          spectrum[clearSample] = 0.0f;
        }
        if (skip) {
          return;
        }
        phraseDimensions = VorbisSample.codebooks[this.classbook].dimensions;
        range = this.end - this.begin;
        partitionCount = range / this.partitionSize;
        classificationStorage = new int[partitionCount];
        classificationAlias = classificationStorage;
        classifications = classificationAlias;
        for (pass = 0; pass < 8; pass++) {
          partition = 0;
          while (partition < partitionCount) {
            if (pass == 0) {
              classword = VorbisSample.codebooks[this.classbook].decodeScalar();
              for (phraseDimension = phraseDimensions - 1; phraseDimension >= 0; phraseDimension--) {
                if (partition + phraseDimension < partitionCount) {
                  classifications[partition + phraseDimension] = classword % this.classificationCount;
                }
                classword = classword / this.classificationCount;
              }
            }
            phraseClasses = classificationAlias;
            phraseIndex = 0;
            while (phraseIndex < phraseDimensions) {
              classification = phraseClasses[partition];
              bookIndex = this.cascadeBooks[classification * 8 + pass];
              if (bookIndex >= 0) {
                partitionOffset = this.begin + partition * this.partitionSize;
                book = VorbisSample.codebooks[bookIndex];
                if (this.type != 0) {
                  offsetOrStride = 0;
                  while (offsetOrStride < this.partitionSize) {
                    sequentialValues = book.decodeVector();
                    for (sequentialDimension = 0; sequentialDimension < book.dimensions; sequentialDimension++) {
                      spectrum[partitionOffset + offsetOrStride] = spectrum[partitionOffset + offsetOrStride] + sequentialValues[sequentialDimension];
                      offsetOrStride++;
                    }
                  }
                } else {
                  offsetOrStride = this.partitionSize / book.dimensions;
                  for (stridedVector = 0; stridedVector < offsetOrStride; stridedVector++) {
                    stridedValues = book.decodeVector();
                    for (stridedDimension = 0; stridedDimension < book.dimensions; stridedDimension++) {
                      spectrum[partitionOffset + stridedVector + stridedDimension * offsetOrStride] = spectrum[partitionOffset + stridedVector + stridedDimension * offsetOrStride] + stridedValues[stridedDimension];
                    }
                  }
                }
              }
              partition++;
              if (partition >= partitionCount) {
                break;
              }
              phraseIndex++;
            }
          }
        }
        return;
    }

    VorbisResidue() {
        int highCascade = 0;
        int lowCascade = 0;
        int hasHighCascade = 0;
        int classification = 0;
        int unusedBookIndex;
        this.type = VorbisSample.readBits(16);
        this.begin = VorbisSample.readBits(24);
        this.end = VorbisSample.readBits(24);
        this.partitionSize = VorbisSample.readBits(24) + 1;
        this.classificationCount = VorbisSample.readBits(6) + 1;
        this.classbook = VorbisSample.readBits(8);
        int[] cascades = new int[this.classificationCount];
        for (classification = 0; classification < this.classificationCount; classification++) {
          highCascade = 0;
          lowCascade = VorbisSample.readBits(3);
          hasHighCascade = VorbisSample.readBit() != 0 ? 1 : 0;
          if (hasHighCascade != 0) {
            highCascade = VorbisSample.readBits(5);
          }
          cascades[classification] = highCascade << 3 | lowCascade;
        }
        this.cascadeBooks = new int[this.classificationCount * 8];
        int bookIndex = 0;
        unusedBookIndex = bookIndex;
        while (bookIndex < this.classificationCount * 8) {
          this.cascadeBooks[bookIndex] = (cascades[bookIndex >> 3] & 1 << (bookIndex & 7)) != 0 ? VorbisSample.readBits(8) : -1;
          bookIndex++;
        }
    }
}
