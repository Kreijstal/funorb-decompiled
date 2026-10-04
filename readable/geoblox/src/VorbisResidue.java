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
        int var8 = 0;
        int var17 = 0;
        int var16 = 0;
        int var18 = 0;
        int var4;
        int var5;
        int var6;
        int[] var7;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        VorbisCodebook var14;
        int var15;
        int[] var19;
        int[] var22;
        float[] var27;
        float[] var28;
        for (var4 = 0; var4 < sampleCount; var4++) {
          samples[var4] = 0.0f;
        }
        if (silent) {
          return;
        }
        var4 = MusicDecoder.codebooks[this.classbookIndex].dimensions;
        var5 = this.end - this.begin;
        var6 = var5 / this.partitionSize;
        var22 = new int[var6];
        var19 = var22;
        var7 = var19;
        for (var8 = 0; var8 < 8; var8++) {
          var9 = 0;
          L2: while (var9 < var6) {
            if (var8 == 0) {
              var10 = MusicDecoder.codebooks[this.classbookIndex].readScalar();
              for (var11 = var4 - 1; var11 >= 0; var11--) {
                if (var9 + var11 < var6) {
                  var7[var9 + var11] = var10 % this.classificationCount;
                }
                var10 = var10 / this.classificationCount;
              }
            }
            var22 = var19;
            var10 = 0;
            while (var10 < var4) {
              var11 = var22[var9];
              var12 = this.passBookIndices[var11 * 8 + var8];
              if (var12 >= 0) {
                var13 = this.begin + var9 * this.partitionSize;
                var14 = MusicDecoder.codebooks[var12];
                if (this.residueType != 0) {
                  var15 = 0;
                  while (var15 < this.partitionSize) {
                    var28 = var14.readVector();
                    for (var17 = 0; var17 < var14.dimensions; var17++) {
                      samples[var13 + var15] = samples[var13 + var15] + var28[var17];
                      var15++;
                    }
                  }
                } else {
                  var15 = this.partitionSize / var14.dimensions;
                  for (var16 = 0; var16 < var15; var16++) {
                    var27 = var14.readVector();
                    for (var18 = 0; var18 < var14.dimensions; var18++) {
                      samples[var13 + var16 + var18 * var15] = samples[var13 + var16 + var18 * var15] + var27[var18];
                    }
                  }
                }
              }
              var9++;
              if (var9 >= var6) {
                continue L2;
              }
              var10++;
            }
          }
        }
        return;
    }

    VorbisResidue() {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var2 = 0;
        this.residueType = MusicDecoder.readBits(16);
        this.begin = MusicDecoder.readBits(24);
        this.end = MusicDecoder.readBits(24);
        this.partitionSize = MusicDecoder.readBits(24) + 1;
        this.classificationCount = MusicDecoder.readBits(6) + 1;
        this.classbookIndex = MusicDecoder.readBits(8);
        int[] var1 = new int[this.classificationCount];
        for (var2 = 0; var2 < this.classificationCount; var2++) {
            var3 = 0;
            var4 = MusicDecoder.readBits(3);
            var5 = MusicDecoder.readBit() != 0 ? 1 : 0;
            if (var5 != 0) {
                var3 = MusicDecoder.readBits(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.passBookIndices = new int[this.classificationCount * 8];
        int var6 = 0;
        var2 = var6;
        while (var6 < this.classificationCount * 8) {
            this.passBookIndices[var6] = (var1[var6 >> 3] & 1 << (var6 & 7)) != 0 ? MusicDecoder.readBits(8) : -1;
            var6++;
        }
    }
}
