/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Bzip2Decoder {
    private static Bzip2State state;

    private final static int readBits(int count, Bzip2State state) {
        while (state.bitCount < count) {
          state.bitBuffer = state.bitBuffer << 8 | state.input[state.inputPosition] & 255;
          state.bitCount = state.bitCount + 8;
          state.inputPosition = state.inputPosition + 1;
          state.totalInputBytes = state.totalInputBytes + 1;
          if (state.totalInputBytes != 0) {
            continue;
          }
        }
        int var2 = state.bitBuffer >> state.bitCount - count & (1 << count) - 1;
        state.bitCount = state.bitCount - count;
        return var2;
    }

    private final static byte readByte(Bzip2State state) {
        return (byte)Bzip2Decoder.readBits(8, state);
    }

    final static int decompress(byte[] output, int outputLength, byte[] input, int unusedCompressedLength, int inputOffset) {
        int stackIn_2_0 = 0;
        Throwable decompiledCaughtException = null;
        Object var5 = state;
        synchronized (var5) {
          state.input = input;
          state.inputPosition = inputOffset;
          state.output = output;
          state.outputPosition = 0;
          state.outputRemaining = outputLength;
          state.bitCount = 0;
          state.bitBuffer = 0;
          state.totalInputBytes = 0;
          state.totalOutputBytes = 0;
          Bzip2Decoder.decodeBlocks(state);
          outputLength = outputLength - state.outputRemaining;
          state.input = null;
          state.output = null;
          stackIn_2_0 = outputLength;
        }
        return stackIn_2_0;
    }

    private final static void buildHuffmanTables(int[] limits, int[] bases, int[] permutation, byte[] lengths, int minimumLength, int maximumLength, int symbolCount) {
        int var7 = 0;
        for (int var8 = minimumLength; var8 <= maximumLength; var8++) {
          for (int var9 = 0; var9 < symbolCount; var9++) {
            if (lengths[var9] == var8) {
              permutation[var7] = var9;
              var7++;
            }
          }
        }
        for (int var8Lifetime1 = 0; var8Lifetime1 < 23; var8Lifetime1++) {
          bases[var8Lifetime1] = 0;
        }
        for (int var8Lifetime2 = 0; var8Lifetime2 < symbolCount; var8Lifetime2++) {
          int dupTemp$0 = lengths[var8Lifetime2] + 1;
          bases[dupTemp$0] = bases[dupTemp$0] + 1;
        }
        for (int var8Lifetime3 = 1; var8Lifetime3 < 23; var8Lifetime3++) {
          bases[var8Lifetime3] = bases[var8Lifetime3] + bases[var8Lifetime3 - 1];
        }
        for (int var8Lifetime4 = 0; var8Lifetime4 < 23; var8Lifetime4++) {
          limits[var8Lifetime4] = 0;
        }
        int var10 = 0;
        for (int var8Lifetime5 = minimumLength; var8Lifetime5 <= maximumLength; var8Lifetime5++) {
          var10 = var10 + (bases[var8Lifetime5 + 1] - bases[var8Lifetime5]);
          limits[var8Lifetime5] = var10 - 1;
          var10 = var10 << 1;
        }
        for (int var8Lifetime6 = minimumLength + 1; var8Lifetime6 <= maximumLength; var8Lifetime6++) {
          bases[var8Lifetime6] = (limits[var8Lifetime6 - 1] + 1 << 1) - bases[var8Lifetime6];
        }
    }

    public static void releaseStatics() {
        state = null;
    }

    private final static byte readBit(Bzip2State state) {
        return (byte)Bzip2Decoder.readBits(1, state);
    }

    private final static void buildSymbolMap(Bzip2State state) {
        state.usedSymbolCount = 0;
        for (int var1 = 0; var1 < 256; var1++) {
          if (state.symbolsInUse[var1]) {
            state.symbolMap[state.usedSymbolCount] = (byte)var1;
            state.usedSymbolCount = state.usedSymbolCount + 1;
          }
        }
    }

    private final static void writeDecodedRuns(Bzip2State state) {
        int var2 = state.outputByte;
        int var3 = state.repeatRemaining;
        int var4 = state.blockBytesUsed;
        int var5 = state.nextByte;
        int[] var15 = SavedDataWrite.bzip2Transform;
        int[] var14 = var15;
        int[] var6 = var14;
        int var7 = state.transformPosition;
        byte[] var8 = state.output;
        int var9 = state.outputPosition;
        int var10 = state.outputRemaining;
        int var11 = var10;
        int var12 = state.blockLength + 1;
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
            int[] var15Lifetime1 = var14;
            var2 = (byte)var5;
            var7 = var15Lifetime1[var7];
            int var1 = (byte)var7;
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
        int var13 = state.totalOutputBytes;
        state.totalOutputBytes = state.totalOutputBytes + (var11 - var10);
        if (state.totalOutputBytes >= var13) {
        }
        state.outputByte = (byte) var2;
        state.repeatRemaining = var3;
        state.blockBytesUsed = var4;
        state.nextByte = var5;
        SavedDataWrite.bzip2Transform = var6;
        state.transformPosition = var7;
        state.output = var8;
        state.outputPosition = var9;
        state.outputRemaining = var10;
        return;
    }

    private final static void decodeBlocks(Bzip2State state) {
        int var27;
        int var28;
        int var30;
        int var4 = 0;
        int var5 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        Object var24 = null;
        Object var25 = null;
        state.blockSize100k = 1;
        if (SavedDataWrite.bzip2Transform == null) {
          SavedDataWrite.bzip2Transform = new int[state.blockSize100k * 100000];
        }
        boolean var26 = true;
        while (true) {
          if (!var26) {
            return;
          }
          int var1 = Bzip2Decoder.readByte(state);
          if (var1 == 23) {
            return;
          }
          var1 = Bzip2Decoder.readByte(state);
          var1 = Bzip2Decoder.readByte(state);
          var1 = Bzip2Decoder.readByte(state);
          var1 = Bzip2Decoder.readByte(state);
          var1 = Bzip2Decoder.readByte(state);
          var1 = Bzip2Decoder.readByte(state);
          var1 = Bzip2Decoder.readByte(state);
          var1 = Bzip2Decoder.readByte(state);
          var1 = Bzip2Decoder.readByte(state);
          var1 = Bzip2Decoder.readBit(state);
          if (var1 == 0) {
          }
          state.originalPointer = 0;
          var1 = Bzip2Decoder.readByte(state);
          state.originalPointer = state.originalPointer << 8 | var1 & 255;
          var1 = Bzip2Decoder.readByte(state);
          state.originalPointer = state.originalPointer << 8 | var1 & 255;
          var1 = Bzip2Decoder.readByte(state);
          state.originalPointer = state.originalPointer << 8 | var1 & 255;
          for (var4 = 0; var4 < 16; var4++) {
            var1 = Bzip2Decoder.readBit(state);
            if (var1 != 1) {
              state.symbolGroupsInUse[var4] = false;
            } else {
              state.symbolGroupsInUse[var4] = true;
            }
          }
          for (var4 = 0; var4 < 256; var4++) {
            state.symbolsInUse[var4] = false;
          }
          for (var4 = 0; var4 < 16; var4++) {
            if (state.symbolGroupsInUse[var4]) {
              for (var5 = 0; var5 < 16; var5++) {
                var1 = Bzip2Decoder.readBit(state);
                if (var1 == 1) {
                  state.symbolsInUse[var4 * 16 + var5] = true;
                }
              }
            }
          }
          Bzip2Decoder.buildSymbolMap(state);
          int var7 = state.usedSymbolCount + 2;
          int var8 = Bzip2Decoder.readBits(3, state);
          int var9 = Bzip2Decoder.readBits(15, state);
          var4 = 0;
          while (var4 < var9) {
            var5 = 0;
            while (true) {
              var1 = Bzip2Decoder.readBit(state);
              if (var1 != 0) {
                var5++;
                continue;
              }
              break;
            }
            state.selectorMtf[var4] = (byte)var5;
            var4++;
          }
          byte[] var37 = new byte[6];
          byte[] var36 = var37;
          byte[] var27_ref_byte__ = var36;
          int var29 = 0;
          while (var29 < var8) {
            var27_ref_byte__[var29] = (byte)var29;
            var29 = (byte)(var29 + 1);
          }
          for (var4 = 0; var4 < var9; var4++) {
            var29 = state.selectorMtf[var4];
            var28 = var37[var29];
            while (var29 > 0) {
              var27_ref_byte__[var29] = var27_ref_byte__[var29 - 1];
              var29 = (byte)(var29 - 1);
            }
            var27_ref_byte__[0] = (byte)var28;
            state.selectors[var4] = (byte)var28;
          }
          int var6 = 0;
          while (var6 < var8) {
            int var17 = Bzip2Decoder.readBits(5, state);
            var4 = 0;
            while (true) {
              if (var4 >= var7) {
                var6++;
                break;
              }
              while (true) {
                var1 = Bzip2Decoder.readBit(state);
                if (var1 == 0) {
                  state.codeLengths[var6][var4] = (byte)var17;
                  var4++;
                  break;
                }
                var1 = Bzip2Decoder.readBit(state);
                if (var1 != 0) {
                  var17--;
                  continue;
                }
                var17++;
              }
            }
          }
          for (var6 = 0; var6 < var8; var6++) {
            int var2 = 32;
            int var3 = 0;
            for (var4 = 0; var4 < var7; var4++) {
              if (state.codeLengths[var6][var4] > var3) {
                var3 = state.codeLengths[var6][var4];
              }
              if (state.codeLengths[var6][var4] < var2) {
                var2 = state.codeLengths[var6][var4];
              }
            }
            Bzip2Decoder.buildHuffmanTables(state.huffmanLimits[var6], state.huffmanBases[var6], state.huffmanPermutations[var6], state.codeLengths[var6], var2, var3, var7);
            state.minimumCodeLengths[var6] = var2;
          }
          int var10 = state.usedSymbolCount + 1;
          int var11 = -1;
          int var12 = 0;
          for (var4 = 0; var4 <= 255; var4++) {
            state.symbolFrequencies[var4] = 0;
          }
          var29 = 4095;
          for (var27 = 15; var27 >= 0; var27--) {
            for (var28 = 15; var28 >= 0; var28--) {
              state.mtfSymbols[var29] = (byte)(var27 * 16 + var28);
              var29--;
            }
            state.mtfBaseIndices[var27] = var29 + 1;
          }
          int var14 = 0;
          if (var12 == 0) {
            var11++;
            var12 = 50;
            var21 = state.selectors[var11];
            var22 = state.minimumCodeLengths[var21];
            var23 = state.huffmanLimits[var21];
            var25 = state.huffmanPermutations[var21];
            var24 = state.huffmanBases[var21];
          }
          var12--;
          int var18 = var22;
          int var19 = Bzip2Decoder.readBits(var18, state);
          while (var19 > ((int[]) (var23))[var18]) {
            var18++;
            var20 = Bzip2Decoder.readBit(state);
            var19 = var19 << 1 | var20;
          }
          int var13 = ((int[]) (var25))[var19 - ((int[]) (var24))[var18]];
          while (true) {
            if (var13 == var10) {
              state.repeatRemaining = 0;
              state.outputByte = (byte) 0;
              state.cumulativeFrequencies[0] = 0;
              for (var4 = 1; var4 <= 256; var4++) {
                state.cumulativeFrequencies[var4] = state.symbolFrequencies[var4 - 1];
              }
              for (var4 = 1; var4 <= 256; var4++) {
                state.cumulativeFrequencies[var4] = state.cumulativeFrequencies[var4] + state.cumulativeFrequencies[var4 - 1];
              }
              for (var4 = 0; var4 < var14; var4++) {
                var1 = (byte)(SavedDataWrite.bzip2Transform[var4] & 255);
                int dupTemp$1 = state.cumulativeFrequencies[var1 & 255];
                SavedDataWrite.bzip2Transform[dupTemp$1] = SavedDataWrite.bzip2Transform[dupTemp$1] | var4 << 8;
                state.cumulativeFrequencies[var1 & 255] = state.cumulativeFrequencies[var1 & 255] + 1;
              }
              state.transformPosition = SavedDataWrite.bzip2Transform[state.originalPointer] >> 8;
              state.blockBytesUsed = 0;
              state.transformPosition = SavedDataWrite.bzip2Transform[state.transformPosition];
              state.nextByte = (byte)(state.transformPosition & 255);
              state.transformPosition = state.transformPosition >> 8;
              state.blockBytesUsed = state.blockBytesUsed + 1;
              state.blockLength = var14;
              Bzip2Decoder.writeDecodedRuns(state);
              if (state.blockBytesUsed == state.blockLength + 1 &&
                state.repeatRemaining == 0) {
                var26 = true;
                break;
              }
              var26 = false;
              break;
            }
            if (var13 != 0 &&
              var13 != 1) {
              int var33 = var13 - 1;
              if (var33 < 16) {
                var30 = state.mtfBaseIndices[0];
                var1 = state.mtfSymbols[var30 + var33];
                while (var33 > 3) {
                  int var34 = var30 + var33;
                  state.mtfSymbols[var34] = state.mtfSymbols[var34 - 1];
                  state.mtfSymbols[var34 - 1] = state.mtfSymbols[var34 - 2];
                  state.mtfSymbols[var34 - 2] = state.mtfSymbols[var34 - 3];
                  state.mtfSymbols[var34 - 3] = state.mtfSymbols[var34 - 4];
                  var33 -= 4;
                }
                while (var33 > 0) {
                  state.mtfSymbols[var30 + var33] = state.mtfSymbols[var30 + var33 - 1];
                  var33--;
                }
                state.mtfSymbols[var30] = (byte)var1;
              } else {
                int var31 = var33 / 16;
                int var32 = var33 % 16;
                int var35 = state.mtfBaseIndices[var31] + var32;
                var30 = var35;
                var1 = state.mtfSymbols[var35];
                while (var35 > state.mtfBaseIndices[var31]) {
                  state.mtfSymbols[var35] = state.mtfSymbols[var35 - 1];
                  var35--;
                }
                state.mtfBaseIndices[var31] = state.mtfBaseIndices[var31] + 1;
                while (var31 > 0) {
                  state.mtfBaseIndices[var31] = state.mtfBaseIndices[var31] - 1;
                  state.mtfSymbols[state.mtfBaseIndices[var31]] = state.mtfSymbols[state.mtfBaseIndices[var31 - 1] + 16 - 1];
                  var31--;
                }
                state.mtfBaseIndices[0] = state.mtfBaseIndices[0] - 1;
                state.mtfSymbols[state.mtfBaseIndices[0]] = (byte)var1;
                if (state.mtfBaseIndices[0] == 0) {
                  var29 = 4095;
                  for (var27 = 15; var27 >= 0; var27--) {
                    for (var28 = 15; var28 >= 0; var28--) {
                      state.mtfSymbols[var29] = state.mtfSymbols[state.mtfBaseIndices[var27] + var28];
                      var29--;
                    }
                    state.mtfBaseIndices[var27] = var29 + 1;
                  }
                }
              }
              int dupTemp$0 = state.symbolMap[var1 & 255] & 255;
              state.symbolFrequencies[dupTemp$0] = state.symbolFrequencies[dupTemp$0] + 1;
              SavedDataWrite.bzip2Transform[var14] = state.symbolMap[var1 & 255] & 255;
              var14++;
              if (var12 == 0) {
                var11++;
                var12 = 50;
                var21 = state.selectors[var11];
                var22 = state.minimumCodeLengths[var21];
                var23 = state.huffmanLimits[var21];
                var25 = state.huffmanPermutations[var21];
                var24 = state.huffmanBases[var21];
              }
              var12--;
              var18 = var22;
              var19 = Bzip2Decoder.readBits(var18, state);
              while (var19 > ((int[]) (var23))[var18]) {
                var18++;
                var20 = Bzip2Decoder.readBit(state);
                var19 = var19 << 1 | var20;
              }
              var13 = ((int[]) (var25))[var19 - ((int[]) (var24))[var18]];
              continue;
            }
            int var15 = -1;
            int var16 = 1;
            do {
              if (var13 == 0) {
                var15 = var15 + 1 * var16;
              } else if (var13 == 1) {
                var15 = var15 + 2 * var16;
              }
              var16 = var16 * 2;
              if (var12 == 0) {
                var11++;
                var12 = 50;
                var21 = state.selectors[var11];
                var22 = state.minimumCodeLengths[var21];
                var23 = state.huffmanLimits[var21];
                var25 = state.huffmanPermutations[var21];
                var24 = state.huffmanBases[var21];
              }
              var12--;
              var18 = var22;
              var19 = Bzip2Decoder.readBits(var18, state);
              while (var19 > ((int[]) (var23))[var18]) {
                var18++;
                var20 = Bzip2Decoder.readBit(state);
                var19 = var19 << 1 | var20;
              }
              var13 = ((int[]) (var25))[var19 - ((int[]) (var24))[var18]];
            } while (var13 == 0 ||
              var13 == 1);
            var15++;
            var1 = state.symbolMap[state.mtfSymbols[state.mtfBaseIndices[0]] & 255];
            state.symbolFrequencies[var1 & 255] = state.symbolFrequencies[var1 & 255] + var15;
            while (var15 > 0) {
              SavedDataWrite.bzip2Transform[var14] = var1 & 255;
              var14++;
              var15--;
            }
          }
        }
    }

    static {
        state = new Bzip2State();
    }
}
