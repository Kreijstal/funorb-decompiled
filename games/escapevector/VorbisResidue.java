/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VorbisResidue {
    private int end;
    private int type;
    private int begin;
    private int[] passBooks;
    private int classifications;
    private int partitionSize;
    private int classbook;

    final void decode(float[] spectrum, int length, boolean skip) {
        int var15;
        for (int var4 = 0; var4 < length; var4++) {
          spectrum[var4] = 0.0f;
        }
        if (skip) {
          return;
        }
        int var4Lifetime1 = VorbisSample.codebooks[this.classbook].dimensions;
        int var5 = this.end - this.begin;
        int var6 = var5 / this.partitionSize;
        int[] var22 = new int[var6];
        int[] var19 = var22;
        int[] var7 = var19;
        for (int var8 = 0; var8 < 8; var8++) {
          int var9 = 0;
          while (var9 < var6) {
            if (var8 == 0) {
              int var10 = VorbisSample.codebooks[this.classbook].decodeScalar();
              for (int var11 = var4Lifetime1 - 1; var11 >= 0; var11--) {
                if (var9 + var11 < var6) {
                  var7[var9 + var11] = var10 % this.classifications;
                }
                var10 = var10 / this.classifications;
              }
            }
            int[] var22Lifetime1 = var19;
            int var10Lifetime1 = 0;
            while (var10Lifetime1 < var4Lifetime1) {
              int var11Lifetime1 = var22Lifetime1[var9];
              int var12 = this.passBooks[var11Lifetime1 * 8 + var8];
              if (var12 >= 0) {
                int var13 = this.begin + var9 * this.partitionSize;
                VorbisCodebook var14 = VorbisSample.codebooks[var12];
                if (this.type != 0) {
                  var15 = 0;
                  while (var15 < this.partitionSize) {
                    float[] var28 = var14.decodeVector();
                    for (int var17 = 0; var17 < var14.dimensions; var17++) {
                      spectrum[var13 + var15] = spectrum[var13 + var15] + var28[var17];
                      var15++;
                    }
                  }
                } else {
                  var15 = this.partitionSize / var14.dimensions;
                  for (int var16 = 0; var16 < var15; var16++) {
                    float[] var27 = var14.decodeVector();
                    for (int var18 = 0; var18 < var14.dimensions; var18++) {
                      spectrum[var13 + var16 + var18 * var15] = spectrum[var13 + var16 + var18 * var15] + var27[var18];
                    }
                  }
                }
              }
              var9++;
              if (var9 >= var6) {
                break;
              }
              var10Lifetime1++;
            }
          }
        }
        return;
    }

    VorbisResidue() {
        this.type = VorbisSample.readBits(16);
        this.begin = VorbisSample.readBits(24);
        this.end = VorbisSample.readBits(24);
        this.partitionSize = VorbisSample.readBits(24) + 1;
        this.classifications = VorbisSample.readBits(6) + 1;
        this.classbook = VorbisSample.readBits(8);
        int[] var1 = new int[this.classifications];
        for (int var2 = 0; var2 < this.classifications; var2++) {
          int var3 = 0;
          int var4 = VorbisSample.readBits(3);
          boolean var5 = (VorbisSample.readBit() != 0);
          if (var5) {
            var3 = VorbisSample.readBits(5);
          }
          var1[var2] = var3 << 3 | var4;
        }
        this.passBooks = new int[this.classifications * 8];
        int var6 = 0;
        int var2Lifetime1 = var6;
        while (var6 < this.classifications * 8) {
          this.passBooks[var6] = (var1[var6 >> 3] & 1 << (var6 & 7)) != 0 ? VorbisSample.readBits(8) : -1;
          var6++;
        }
    }
}
