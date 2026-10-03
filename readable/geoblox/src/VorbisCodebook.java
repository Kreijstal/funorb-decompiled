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
        int var1 = 0;
        while (this.huffmanTree[var1] >= 0) {
            var1 = MusicDecoder.readBit() != 0 ? this.huffmanTree[var1] : var1 + 1;
        }
        return ~this.huffmanTree[var1];
    }

    private final void buildHuffmanTree() {
        int[] var2_ref_int__;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int var9_int;
        int var10;
        int var11;
        int[] var12;
        int[] var14;
        int[] var17;
        var17 = new int[this.entryCount];
        var14 = new int[33];
        var12 = var14;
        var2_ref_int__ = var12;
        for (var3 = 0; var3 < this.entryCount; var3++) {
          var4 = this.codewordLengths[var3];
          if (var4 == 0) {
            continue;
          }
          L7: {
            var5 = 1 << 32 - var4;
            var6 = var14[var4];
            var17[var3] = var6;
            if ((var6 & var5) == 0) {
              var7 = var6 | var5;
              for (var8 = var4 - 1; var8 >= 1; var8--) {
                var9_int = var14[var8];
                if (var9_int != var6) {
                  break L7;
                }
                var10 = 1 << 32 - var8;
                if ((var9_int & var10) != 0) {
                  var2_ref_int__[var8] = var2_ref_int__[var8 - 1];
                  break L7;
                }
                var2_ref_int__[var8] = var9_int | var10;
              }
              break L7;
            }
            var7 = var2_ref_int__[var4 - 1];
          }
          var14[var4] = var7;
          for (var8 = var4 + 1; var8 <= 32; var8++) {
            var9_int = var14[var8];
            if (var9_int != var6) {
              continue;
            }
            var14[var8] = var7;
          }
        }
        this.huffmanTree = new int[8];
        var2 = 0;
        var3 = 0;
        while (true) {
          if (var3 >= this.entryCount) {
            return;
          }
          var4 = this.codewordLengths[var3];
          if (var4 == 0) {
            var3++;
            continue;
          }
          var5 = var17[var3];
          var6 = 0;
          for (var7 = 0; var7 < var4; var7++) {
            var8 = -2147483648 >>> var7;
            if ((var5 & var8) == 0) {
              var6++;
            } else {
              if (this.huffmanTree[var6] == 0) {
                this.huffmanTree[var6] = var2;
              }
              var6 = this.huffmanTree[var6];
            }
            if (var6 >= this.huffmanTree.length) {
              var9 = new int[this.huffmanTree.length * 2];
              var11 = 0;
              var10 = var11;
              while (var11 < this.huffmanTree.length) {
                var9[var11] = this.huffmanTree[var11];
                var11++;
              }
              this.huffmanTree = var9;
            }
            var8 = var8 >>> 1;
          }
          this.huffmanTree[var6] = ~var3;
          if (var6 < var2) {
            var3++;
            continue;
          }
          var2 = var6 + 1;
          var3++;
          continue;
        }
    }

    private final static int computeLookupValueCount(int entries, int dimensions) {
        int var2 = 0;
        for (var2 = (int)Math.pow((double)entries, 1.0 / (double)dimensions) + 1; IterableNodeHashTable.a(dimensions, (byte) 21, var2) > entries; var2--) {
        }
        return var2;
    }

    final float[] readVector() {
        return this.valueVectors[this.readScalar()];
    }

    VorbisCodebook() {
        int incrementValue$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_23_0 = 0;
        int var1;
        int var2;
        int var3_int;
        float var3;
        int var4_int;
        float var4;
        int var5;
        int var6;
        int var7;
        int var8;
        float var9;
        int var10;
        int var11;
        float var12;
        int var12_int;
        float var13;
        int var14;
        MusicDecoder.readBits(24);
        this.dimensions = MusicDecoder.readBits(16);
        this.entryCount = MusicDecoder.readBits(24);
        this.codewordLengths = new int[this.entryCount];
        stackIn_3_0 = (MusicDecoder.readBit() == 0) ? 0 : 1;
        var1 = stackIn_3_0;
        if (var1 != 0) {
          var2 = 0;
          var3_int = MusicDecoder.readBits(5) + 1;
          while (var2 < this.entryCount) {
            var4_int = MusicDecoder.readBits(hj.unsignedBitLength((byte) 58, this.entryCount - var2));
            for (var5 = 0; var5 < var4_int; var5++) {
              incrementValue$0 = var2;
              var2++;
              this.codewordLengths[incrementValue$0] = var3_int;
            }
            var3_int++;
          }
        } else {
          stackIn_13_0 = (MusicDecoder.readBit() == 0) ? 0 : 1;
          var2 = stackIn_13_0;
          var14 = 0;
          var3_int = var14;
          while (var14 < this.entryCount) {
            if ((var2 != 0) &&
                (MusicDecoder.readBit() == 0)) {
              this.codewordLengths[var14] = 0;
              var14++;
              continue;
            }
            this.codewordLengths[var14] = MusicDecoder.readBits(5) + 1;
            var14++;
          }
        }
        this.buildHuffmanTree();
        var2 = MusicDecoder.readBits(4);
        if (var2 > 0) {
          var3 = MusicDecoder.d(MusicDecoder.readBits(32));
          var4 = MusicDecoder.d(MusicDecoder.readBits(32));
          var5 = MusicDecoder.readBits(4) + 1;
          stackIn_23_0 = (MusicDecoder.readBit() == 0) ? 0 : 1;
          var6 = stackIn_23_0;
          if (var2 != 1) {
            var7 = this.entryCount * this.dimensions;
          } else {
            var7 = VorbisCodebook.computeLookupValueCount(this.entryCount, this.dimensions);
          }
          this.quantizedLookupValues = new int[var7];
          for (var8 = 0; var8 < var7; var8++) {
            this.quantizedLookupValues[var8] = MusicDecoder.readBits(var5);
          }
          this.valueVectors = new float[this.entryCount][this.dimensions];
          if (var2 == 1) {
            for (var8 = 0; var8 < this.entryCount; var8++) {
              var9 = 0.0f;
              var10 = 1;
              for (var11 = 0; var11 < this.dimensions; var11++) {
                var12_int = var8 / var10 % var7;
                var13 = (float)this.quantizedLookupValues[var12_int] * var4 + var3 + var9;
                this.valueVectors[var8][var11] = var13;
                if (var6 != 0) {
                  var9 = var13;
                }
                var10 = var10 * var7;
              }
            }
          } else {
            for (var8 = 0; var8 < this.entryCount; var8++) {
              var9 = 0.0f;
              var10 = var8 * this.dimensions;
              for (var11 = 0; var11 < this.dimensions; var11++) {
                var12 = (float)this.quantizedLookupValues[var10] * var4 + var3 + var9;
                this.valueVectors[var8][var11] = var12;
                if (var6 == 0) {
                  var10++;
                  continue;
                }
                var9 = var12;
                var10++;
              }
            }
          }
        }
    }
}
