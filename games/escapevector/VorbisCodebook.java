/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VorbisCodebook {
    private int[] codewordLengths;
    private float[][] valueVectors;
    int dimensions;
    private int entries;
    private int[] quantizedValues;
    private int[] huffmanTree;

    final float[] decodeVector() {
        return this.valueVectors[this.decodeScalar()];
    }

    private final static int lookup1ValueCount(int entries, int dimensions) {
        int var2 = 0;
        for (var2 = (int)Math.pow((double)entries, 1.0 / (double)dimensions) + 1; AchievementTracker.integerPower(dimensions, var2, -1) > entries; var2--) {
        }
        return var2;
    }

    final int decodeScalar() {
        int var1 = 0;
        while (this.huffmanTree[var1] >= 0) {
          var1 = VorbisSample.readBit() != 0 ? this.huffmanTree[var1] : var1 + 1;
        }
        return ~this.huffmanTree[var1];
    }

    VorbisCodebook() {
        int var2;
        int var3_int;
        int var7;
        float var9;
        int var10;
        int var11;
        int var8Lifetime1;
        VorbisSample.readBits(24);
        this.dimensions = VorbisSample.readBits(16);
        this.entries = VorbisSample.readBits(24);
        this.codewordLengths = new int[this.entries];
        boolean stackIn_3_0 = !(VorbisSample.readBit() == 0);
        boolean var1 = stackIn_3_0;
        if (var1) {
          var2 = 0;
          var3_int = VorbisSample.readBits(5) + 1;
          while (var2 < this.entries) {
            int var4_int = VorbisSample.readBits(nm.a(this.entries - var2, (byte) 78));
            for (int var5 = 0; var5 < var4_int; var5++) {
              int incrementValue$0 = var2;
              var2++;
              this.codewordLengths[incrementValue$0] = var3_int;
            }
            var3_int++;
          }
        } else {
          int stackIn_13_0 = (VorbisSample.readBit() == 0) ? 0 : 1;
          var2 = stackIn_13_0;
          int var14 = 0;
          var3_int = var14;
          while (var14 < this.entries) {
            if (var2 != 0 &&
              VorbisSample.readBit() == 0) {
              this.codewordLengths[var14] = 0;
            } else {
              this.codewordLengths[var14] = VorbisSample.readBits(5) + 1;
            }
            var14++;
          }
        }
        this.buildHuffmanTree();
        int var2Lifetime1 = VorbisSample.readBits(4);
        if (var2Lifetime1 > 0) {
          float var3 = VorbisSample.unpackFloat(VorbisSample.readBits(32));
          float var4 = VorbisSample.unpackFloat(VorbisSample.readBits(32));
          int var5Lifetime1 = VorbisSample.readBits(4) + 1;
          boolean stackIn_25_0 = !(VorbisSample.readBit() == 0);
          boolean var6 = stackIn_25_0;
          if (var2Lifetime1 != 1) {
            var7 = this.entries * this.dimensions;
          } else {
            var7 = VorbisCodebook.lookup1ValueCount(this.entries, this.dimensions);
          }
          this.quantizedValues = new int[var7];
          for (int var8 = 0; var8 < var7; var8++) {
            this.quantizedValues[var8] = VorbisSample.readBits(var5Lifetime1);
          }
          this.valueVectors = new float[this.entries][this.dimensions];
          if (var2Lifetime1 != 1) {
            for (var8Lifetime1 = 0; var8Lifetime1 < this.entries; var8Lifetime1++) {
              var9 = 0.0f;
              var10 = var8Lifetime1 * this.dimensions;
              for (var11 = 0; var11 < this.dimensions; var11++) {
                float var12 = (float)this.quantizedValues[var10] * var4 + var3 + var9;
                this.valueVectors[var8Lifetime1][var11] = var12;
                if (var6) {
                  var9 = var12;
                }
                var10++;
              }
            }
          } else {
            for (var8Lifetime1 = 0; var8Lifetime1 < this.entries; var8Lifetime1++) {
              var9 = 0.0f;
              var10 = 1;
              for (var11 = 0; var11 < this.dimensions; var11++) {
                int var12_int = var8Lifetime1 / var10 % var7;
                float var13 = (float)this.quantizedValues[var12_int] * var4 + var3 + var9;
                this.valueVectors[var8Lifetime1][var11] = var13;
                if (var6) {
                  var9 = var13;
                }
                var10 = var10 * var7;
              }
            }
          }
        }
    }

    private final void buildHuffmanTree() {
        int var6;
        int var7;
        int[] var17 = new int[this.entries];
        int[] var14 = new int[33];
        int[] var12 = var14;
        int[] var2_ref_int__ = var12;
        for (int var3 = 0; var3 < this.entries; var3++) {
          int var4 = this.codewordLengths[var3];
          if (var4 != 0) {
            {
              int var5 = 1 << 32 - var4;
              var6 = var14[var4];
              var17[var3] = var6;
              if ((var6 & var5) == 0) {
                var7 = var6 | var5;
                for (int var8 = var4 - 1; var8 >= 1; var8--) {
                  int var9_int = var14[var8];
                  if (var9_int != var6) {
                    break;
                  }
                  int var10 = 1 << 32 - var8;
                  if ((var9_int & var10) != 0) {
                    var2_ref_int__[var8] = var2_ref_int__[var8 - 1];
                    break;
                  }
                  var2_ref_int__[var8] = var9_int | var10;
                }
              } else {
                var7 = var2_ref_int__[var4 - 1];
              }
            }
            var14[var4] = var7;
            for (int var8Lifetime2 = var4 + 1; var8Lifetime2 <= 32; var8Lifetime2++) {
              int var9_intLifetime1 = var14[var8Lifetime2];
              if (var9_intLifetime1 == var6) {
                var14[var8Lifetime2] = var7;
              }
            }
          }
        }
        this.huffmanTree = new int[8];
        int var2 = 0;
        for (int var3Lifetime1 = 0; var3Lifetime1 < this.entries; var3Lifetime1++) {
          int var4Lifetime1 = this.codewordLengths[var3Lifetime1];
          if (var4Lifetime1 != 0) {
            int var5Lifetime1 = var17[var3Lifetime1];
            int var6Lifetime1 = 0;
            for (int var7Lifetime1 = 0; var7Lifetime1 < var4Lifetime1; var7Lifetime1++) {
              int var8Lifetime1 = -2147483648 >>> var7Lifetime1;
              if ((var5Lifetime1 & var8Lifetime1) == 0) {
                var6Lifetime1++;
              } else {
                if (this.huffmanTree[var6Lifetime1] == 0) {
                  this.huffmanTree[var6Lifetime1] = var2;
                }
                var6Lifetime1 = this.huffmanTree[var6Lifetime1];
              }
              if (var6Lifetime1 >= this.huffmanTree.length) {
                int[] var9 = new int[this.huffmanTree.length * 2];
                int var11 = 0;
                int var10Lifetime1 = var11;
                while (var11 < this.huffmanTree.length) {
                  var9[var11] = this.huffmanTree[var11];
                  var11++;
                }
                this.huffmanTree = var9;
              }
              var8Lifetime1 = var8Lifetime1 >>> 1;
            }
            this.huffmanTree[var6Lifetime1] = ~var3Lifetime1;
            if (var6Lifetime1 >= var2) {
              var2 = var6Lifetime1 + 1;
            }
          }
        }
    }
}
