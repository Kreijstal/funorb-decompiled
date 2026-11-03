/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Bzip2Decoder {
    private static Bzip2DecoderState field_a;

    private final static int readBits(int bitCount, Bzip2DecoderState state) {
        int var2;
        while (state.field_F < bitCount) {
          state.field_h = state.field_h << 8 | state.field_B[state.field_u] & 255;
          state.field_F = state.field_F + 8;
          state.field_u = state.field_u + 1;
          state.field_s = state.field_s + 1;
          if (state.field_s != 0) {
            continue;
          }
        }
        var2 = state.field_h >> state.field_F - bitCount & (1 << bitCount) - 1;
        state.field_F = state.field_F - bitCount;
        return var2;
    }

    final static int a(byte[] param0, int param1, byte[] param2, int param3, int param4) {
        int stackIn_2_0 = 0;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        var5 = field_a;
        synchronized (var5) {
          field_a.field_B = param2;
          field_a.field_u = param4;
          field_a.field_g = param0;
          field_a.field_a = 0;
          field_a.field_t = param1;
          field_a.field_F = 0;
          field_a.field_h = 0;
          field_a.field_s = 0;
          field_a.field_q = 0;
          Bzip2Decoder.decodeBlocks(field_a);
          param1 = param1 - field_a.field_t;
          field_a.field_B = null;
          field_a.field_g = null;
          stackIn_2_0 = param1;
        }
        return stackIn_2_0;
    }

    private final static byte readByte(Bzip2DecoderState state) {
        return (byte)Bzip2Decoder.readBits(8, state);
    }

    private final static byte readBit(Bzip2DecoderState state) {
        return (byte)Bzip2Decoder.readBits(1, state);
    }

    private final static void buildSymbolMap(Bzip2DecoderState state) {
        int var1 = 0;
        state.field_j = 0;
        for (var1 = 0; var1 < 256; var1++) {
          if (state.usedBytes[var1]) {
            state.alphabetBytes[state.field_j] = (byte)var1;
            state.field_j = state.field_j + 1;
          }
        }
    }

    private final static void emitBlock(Bzip2DecoderState param0) {
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int[] var6;
        int var7;
        byte[] var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int[] var14;
        int[] var15;
        int[] var15Lifetime1;
        var2 = param0.field_C;
        var3 = param0.field_l;
        var4 = param0.field_p;
        var5 = param0.field_H;
        var15 = BallSkin.field_c;
        var14 = var15;
        var6 = var14;
        var7 = param0.field_y;
        var8 = param0.field_g;
        var9 = param0.field_a;
        var10 = param0.field_t;
        var11 = var10;
        var12 = param0.field_e + 1;
        scanLoop1: while (true) {
          if (var3 > 0) {
            while (true) {
              if (var10 == 0) {
                break scanLoop1;
              }
              if (var3 != 1) {
                var8[var9] = (byte)var2;
                var3--;
                var9++;
                var10--;
                continue;
              }
              break;
            }
            if (var10 == 0) {
              var3 = 1;
              break scanLoop1;
            }
            var8[var9] = (byte)var2;
            var9++;
            var10--;
          }
          while (var4 != var12) {
            var15Lifetime1 = var14;
            var2 = (byte)var5;
            var7 = var15Lifetime1[var7];
            var1 = (byte)var7;
            var7 = var7 >> 8;
            var4++;
            if (var1 == var5) {
              if (var4 != var12) {
                var3 = 2;
                var7 = var15Lifetime1[var7];
                var1 = (byte)var7;
                var7 = var7 >> 8;
                var4++;
                if (var4 == var12) {
                  continue scanLoop1;
                }
                if (var1 != var5) {
                  var5 = var1;
                  continue scanLoop1;
                }
                var3 = 3;
                var7 = var15Lifetime1[var7];
                var1 = (byte)var7;
                var7 = var7 >> 8;
                var4++;
                if (var4 == var12) {
                  continue scanLoop1;
                }
                if (var1 != var5) {
                  var5 = var1;
                  continue scanLoop1;
                }
                var7 = var15Lifetime1[var7];
                var1 = (byte)var7;
                var7 = var7 >> 8;
                var4++;
                var3 = (var1 & 255) + 4;
                var7 = var15Lifetime1[var7];
                var5 = (byte)var7;
                var7 = var7 >> 8;
                var4++;
                continue scanLoop1;
              }
              if (var10 == 0) {
                var3 = 1;
                break scanLoop1;
              }
            } else {
              var5 = var1;
              if (var10 == 0) {
                var3 = 1;
                break scanLoop1;
              }
            }
            var8[var9] = (byte)var2;
            var9++;
            var10--;
          }
          var3 = 0;
          break;
        }
        var13 = param0.field_q;
        param0.field_q = param0.field_q + (var11 - var10);
        if (param0.field_q >= var13) {
        }
        param0.field_C = (byte) var2;
        param0.field_l = var3;
        param0.field_p = var4;
        param0.field_H = var5;
        BallSkin.field_c = var6;
        param0.field_y = var7;
        param0.field_g = var8;
        param0.field_a = var9;
        param0.field_t = var10;
        return;
    }

    public static void a() {
        field_a = null;
    }

    private final static void buildHuffmanTables(int[] limits, int[] base, int[] permutation, byte[] lengths, int minimumLength, int maximumLength, int alphabetSize) {
        int var9 = 0;
        int dupTemp$0 = 0;
        int var7;
        int var8;
        int var10;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        int var8Lifetime6;
        var7 = 0;
        for (var8 = minimumLength; var8 <= maximumLength; var8++) {
          for (var9 = 0; var9 < alphabetSize; var9++) {
            if (lengths[var9] == var8) {
              permutation[var7] = var9;
              var7++;
            }
          }
        }
        for (var8Lifetime1 = 0; var8Lifetime1 < 23; var8Lifetime1++) {
          base[var8Lifetime1] = 0;
        }
        for (var8Lifetime2 = 0; var8Lifetime2 < alphabetSize; var8Lifetime2++) {
          dupTemp$0 = lengths[var8Lifetime2] + 1;
          base[dupTemp$0] = base[dupTemp$0] + 1;
        }
        for (var8Lifetime3 = 1; var8Lifetime3 < 23; var8Lifetime3++) {
          base[var8Lifetime3] = base[var8Lifetime3] + base[var8Lifetime3 - 1];
        }
        for (var8Lifetime4 = 0; var8Lifetime4 < 23; var8Lifetime4++) {
          limits[var8Lifetime4] = 0;
        }
        var10 = 0;
        for (var8Lifetime5 = minimumLength; var8Lifetime5 <= maximumLength; var8Lifetime5++) {
          var10 = var10 + (base[var8Lifetime5 + 1] - base[var8Lifetime5]);
          limits[var8Lifetime5] = var10 - 1;
          var10 = var10 << 1;
        }
        for (var8Lifetime6 = minimumLength + 1; var8Lifetime6 <= maximumLength; var8Lifetime6++) {
          base[var8Lifetime6] = (limits[var8Lifetime6 - 1] + 1 << 1) - base[var8Lifetime6];
        }
    }

    private final static void decodeBlocks(Bzip2DecoderState param0) {
        int dupTemp$1 = 0;
        int dupTemp$0 = 0;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        Object var23;
        Object var24;
        Object var25;
        int var26;
        byte[] var27_ref_byte__;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        byte[] var36;
        byte[] var37;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        var9 = 0;
        var10 = 0;
        var11 = 0;
        var12 = 0;
        var13 = 0;
        var14 = 0;
        var15 = 0;
        var16 = 0;
        var17 = 0;
        var18 = 0;
        var19 = 0;
        var20 = 0;
        var21 = 0;
        var22 = 0;
        var23 = null;
        var24 = null;
        var25 = null;
        param0.field_z = 1;
        if (BallSkin.field_c == null) {
          BallSkin.field_c = new int[param0.field_z * 100000];
        }
        var26 = 1;
        while (true) {
          if (var26 == 0) {
            return;
          }
          var1 = Bzip2Decoder.readByte(param0);
          if (var1 == 23) {
            return;
          }
          var1 = Bzip2Decoder.readByte(param0);
          var1 = Bzip2Decoder.readByte(param0);
          var1 = Bzip2Decoder.readByte(param0);
          var1 = Bzip2Decoder.readByte(param0);
          var1 = Bzip2Decoder.readByte(param0);
          var1 = Bzip2Decoder.readByte(param0);
          var1 = Bzip2Decoder.readByte(param0);
          var1 = Bzip2Decoder.readByte(param0);
          var1 = Bzip2Decoder.readByte(param0);
          var1 = Bzip2Decoder.readBit(param0);
          if (var1 == 0) {
          }
          param0.field_E = 0;
          var1 = Bzip2Decoder.readByte(param0);
          param0.field_E = param0.field_E << 8 | var1 & 255;
          var1 = Bzip2Decoder.readByte(param0);
          param0.field_E = param0.field_E << 8 | var1 & 255;
          var1 = Bzip2Decoder.readByte(param0);
          param0.field_E = param0.field_E << 8 | var1 & 255;
          for (var4 = 0; var4 < 16; var4++) {
            var1 = Bzip2Decoder.readBit(param0);
            if (var1 != 1) {
              param0.usedByteGroups[var4] = false;
            } else {
              param0.usedByteGroups[var4] = true;
            }
          }
          for (var4 = 0; var4 < 256; var4++) {
            param0.usedBytes[var4] = false;
          }
          for (var4 = 0; var4 < 16; var4++) {
            if (param0.usedByteGroups[var4]) {
              for (var5 = 0; var5 < 16; var5++) {
                var1 = Bzip2Decoder.readBit(param0);
                if (var1 == 1) {
                  param0.usedBytes[var4 * 16 + var5] = true;
                }
              }
            }
          }
          Bzip2Decoder.buildSymbolMap(param0);
          var7 = param0.field_j + 2;
          var8 = Bzip2Decoder.readBits(3, param0);
          var9 = Bzip2Decoder.readBits(15, param0);
          var4 = 0;
          while (var4 < var9) {
            var5 = 0;
            while (true) {
              var1 = Bzip2Decoder.readBit(param0);
              if (var1 != 0) {
                var5++;
                continue;
              }
              break;
            }
            param0.field_r[var4] = (byte)var5;
            var4++;
          }
          var37 = new byte[6];
          var36 = var37;
          var27_ref_byte__ = var36;
          var29 = 0;
          while (var29 < var8) {
            var27_ref_byte__[var29] = (byte)var29;
            var29 = (byte)(var29 + 1);
          }
          for (var4 = 0; var4 < var9; var4++) {
            var29 = param0.field_r[var4];
            var28 = var37[var29];
            while (var29 > 0) {
              var27_ref_byte__[var29] = var27_ref_byte__[var29 - 1];
              var29 = (byte)(var29 - 1);
            }
            var27_ref_byte__[0] = (byte)var28;
            param0.field_A[var4] = (byte)var28;
          }
          var6 = 0;
          while (var6 < var8) {
            var17 = Bzip2Decoder.readBits(5, param0);
            var4 = 0;
            while (true) {
              if (var4 >= var7) {
                var6++;
                break;
              }
              while (true) {
                var1 = Bzip2Decoder.readBit(param0);
                if (var1 == 0) {
                  param0.huffmanCodeLengths[var6][var4] = (byte)var17;
                  var4++;
                  break;
                }
                var1 = Bzip2Decoder.readBit(param0);
                if (var1 != 0) {
                  var17--;
                  continue;
                }
                var17++;
              }
            }
          }
          for (var6 = 0; var6 < var8; var6++) {
            var2 = 32;
            var3 = 0;
            for (var4 = 0; var4 < var7; var4++) {
              if (param0.huffmanCodeLengths[var6][var4] > var3) {
                var3 = param0.huffmanCodeLengths[var6][var4];
              }
              if (param0.huffmanCodeLengths[var6][var4] < var2) {
                var2 = param0.huffmanCodeLengths[var6][var4];
              }
            }
            Bzip2Decoder.buildHuffmanTables(param0.field_b[var6], param0.field_d[var6], param0.field_n[var6], param0.huffmanCodeLengths[var6], var2, var3, var7);
            param0.minimumCodeLengths[var6] = var2;
          }
          var10 = param0.field_j + 1;
          var11 = -1;
          var12 = 0;
          for (var4 = 0; var4 <= 255; var4++) {
            param0.byteFrequencies[var4] = 0;
          }
          var29 = 4095;
          for (var27 = 15; var27 >= 0; var27--) {
            for (var28 = 15; var28 >= 0; var28--) {
              param0.moveToFrontBytes[var29] = (byte)(var27 * 16 + var28);
              var29--;
            }
            param0.moveToFrontBlockStarts[var27] = var29 + 1;
          }
          var14 = 0;
          if (var12 == 0) {
            var11++;
            var12 = 50;
            var21 = param0.field_A[var11];
            var22 = param0.minimumCodeLengths[var21];
            var23 = param0.field_b[var21];
            var25 = param0.field_n[var21];
            var24 = param0.field_d[var21];
          }
          var12--;
          var18 = var22;
          var19 = Bzip2Decoder.readBits(var18, param0);
          while (var19 > ((int[]) (var23))[var18]) {
            var18++;
            var20 = Bzip2Decoder.readBit(param0);
            var19 = var19 << 1 | var20;
          }
          var13 = ((int[]) (var25))[var19 - ((int[]) (var24))[var18]];
          while (true) {
            if (var13 == var10) {
              param0.field_l = 0;
              param0.field_C = (byte) 0;
              param0.byteBucketPositions[0] = 0;
              for (var4 = 1; var4 <= 256; var4++) {
                param0.byteBucketPositions[var4] = param0.byteFrequencies[var4 - 1];
              }
              for (var4 = 1; var4 <= 256; var4++) {
                param0.byteBucketPositions[var4] = param0.byteBucketPositions[var4] + param0.byteBucketPositions[var4 - 1];
              }
              for (var4 = 0; var4 < var14; var4++) {
                var1 = (byte)(BallSkin.field_c[var4] & 255);
                dupTemp$1 = param0.byteBucketPositions[var1 & 255];
                BallSkin.field_c[dupTemp$1] = BallSkin.field_c[dupTemp$1] | var4 << 8;
                param0.byteBucketPositions[var1 & 255] = param0.byteBucketPositions[var1 & 255] + 1;
              }
              param0.field_y = BallSkin.field_c[param0.field_E] >> 8;
              param0.field_p = 0;
              param0.field_y = BallSkin.field_c[param0.field_y];
              param0.field_H = (byte)(param0.field_y & 255);
              param0.field_y = param0.field_y >> 8;
              param0.field_p = param0.field_p + 1;
              param0.field_e = var14;
              Bzip2Decoder.emitBlock(param0);
              if (param0.field_p == param0.field_e + 1 &&
                param0.field_l == 0) {
                var26 = 1;
                break;
              }
              var26 = 0;
              break;
            }
            if (var13 != 0 &&
              var13 != 1) {
              var33 = var13 - 1;
              if (var33 < 16) {
                var30 = param0.moveToFrontBlockStarts[0];
                var1 = param0.moveToFrontBytes[var30 + var33];
                while (var33 > 3) {
                  var34 = var30 + var33;
                  param0.moveToFrontBytes[var34] = param0.moveToFrontBytes[var34 - 1];
                  param0.moveToFrontBytes[var34 - 1] = param0.moveToFrontBytes[var34 - 2];
                  param0.moveToFrontBytes[var34 - 2] = param0.moveToFrontBytes[var34 - 3];
                  param0.moveToFrontBytes[var34 - 3] = param0.moveToFrontBytes[var34 - 4];
                  var33 -= 4;
                }
                while (var33 > 0) {
                  param0.moveToFrontBytes[var30 + var33] = param0.moveToFrontBytes[var30 + var33 - 1];
                  var33--;
                }
                param0.moveToFrontBytes[var30] = (byte)var1;
              } else {
                var31 = var33 / 16;
                var32 = var33 % 16;
                var35 = param0.moveToFrontBlockStarts[var31] + var32;
                var30 = var35;
                var1 = param0.moveToFrontBytes[var35];
                while (var35 > param0.moveToFrontBlockStarts[var31]) {
                  param0.moveToFrontBytes[var35] = param0.moveToFrontBytes[var35 - 1];
                  var35--;
                }
                param0.moveToFrontBlockStarts[var31] = param0.moveToFrontBlockStarts[var31] + 1;
                while (var31 > 0) {
                  param0.moveToFrontBlockStarts[var31] = param0.moveToFrontBlockStarts[var31] - 1;
                  param0.moveToFrontBytes[param0.moveToFrontBlockStarts[var31]] = param0.moveToFrontBytes[param0.moveToFrontBlockStarts[var31 - 1] + 16 - 1];
                  var31--;
                }
                param0.moveToFrontBlockStarts[0] = param0.moveToFrontBlockStarts[0] - 1;
                param0.moveToFrontBytes[param0.moveToFrontBlockStarts[0]] = (byte)var1;
                if (param0.moveToFrontBlockStarts[0] == 0) {
                  var29 = 4095;
                  for (var27 = 15; var27 >= 0; var27--) {
                    for (var28 = 15; var28 >= 0; var28--) {
                      param0.moveToFrontBytes[var29] = param0.moveToFrontBytes[param0.moveToFrontBlockStarts[var27] + var28];
                      var29--;
                    }
                    param0.moveToFrontBlockStarts[var27] = var29 + 1;
                  }
                }
              }
              dupTemp$0 = param0.alphabetBytes[var1 & 255] & 255;
              param0.byteFrequencies[dupTemp$0] = param0.byteFrequencies[dupTemp$0] + 1;
              BallSkin.field_c[var14] = param0.alphabetBytes[var1 & 255] & 255;
              var14++;
              if (var12 == 0) {
                var11++;
                var12 = 50;
                var21 = param0.field_A[var11];
                var22 = param0.minimumCodeLengths[var21];
                var23 = param0.field_b[var21];
                var25 = param0.field_n[var21];
                var24 = param0.field_d[var21];
              }
              var12--;
              var18 = var22;
              var19 = Bzip2Decoder.readBits(var18, param0);
              while (var19 > ((int[]) (var23))[var18]) {
                var18++;
                var20 = Bzip2Decoder.readBit(param0);
                var19 = var19 << 1 | var20;
              }
              var13 = ((int[]) (var25))[var19 - ((int[]) (var24))[var18]];
              continue;
            }
            var15 = -1;
            var16 = 1;
            do {
              if (var13 != 0) {
                if (var13 == 1) {
                  var15 = var15 + 2 * var16;
                }
              } else {
                var15 = var15 + 1 * var16;
              }
              var16 = var16 * 2;
              if (var12 == 0) {
                var11++;
                var12 = 50;
                var21 = param0.field_A[var11];
                var22 = param0.minimumCodeLengths[var21];
                var23 = param0.field_b[var21];
                var25 = param0.field_n[var21];
                var24 = param0.field_d[var21];
              }
              var12--;
              var18 = var22;
              var19 = Bzip2Decoder.readBits(var18, param0);
              while (var19 > ((int[]) (var23))[var18]) {
                var18++;
                var20 = Bzip2Decoder.readBit(param0);
                var19 = var19 << 1 | var20;
              }
              var13 = ((int[]) (var25))[var19 - ((int[]) (var24))[var18]];
            } while (var13 == 0 ||
              var13 == 1);
            var15++;
            var1 = param0.alphabetBytes[param0.moveToFrontBytes[param0.moveToFrontBlockStarts[0]] & 255];
            param0.byteFrequencies[var1 & 255] = param0.byteFrequencies[var1 & 255] + var15;
            while (var15 > 0) {
              BallSkin.field_c[var14] = var1 & 255;
              var14++;
              var15--;
            }
          }
        }
    }

    static {
        field_a = new Bzip2DecoderState();
    }
}
