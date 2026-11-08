/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Bzip2Decompressor {
    private static Bzip2State state;

    private final static void buildHuffmanTables(int[] limits, int[] bases, int[] symbols, byte[] codeLengths, int minLength, int maxLength, int symbolCount) {
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
        for (var8 = minLength; var8 <= maxLength; var8++) {
          for (var9 = 0; var9 < symbolCount; var9++) {
            if (codeLengths[var9] == var8) {
              symbols[var7] = var9;
              var7++;
            }
          }
        }
        for (var8Lifetime1 = 0; var8Lifetime1 < 23; var8Lifetime1++) {
          bases[var8Lifetime1] = 0;
        }
        for (var8Lifetime2 = 0; var8Lifetime2 < symbolCount; var8Lifetime2++) {
          dupTemp$0 = codeLengths[var8Lifetime2] + 1;
          bases[dupTemp$0] = bases[dupTemp$0] + 1;
        }
        for (var8Lifetime3 = 1; var8Lifetime3 < 23; var8Lifetime3++) {
          bases[var8Lifetime3] = bases[var8Lifetime3] + bases[var8Lifetime3 - 1];
        }
        for (var8Lifetime4 = 0; var8Lifetime4 < 23; var8Lifetime4++) {
          limits[var8Lifetime4] = 0;
        }
        var10 = 0;
        for (var8Lifetime5 = minLength; var8Lifetime5 <= maxLength; var8Lifetime5++) {
          var10 = var10 + (bases[var8Lifetime5 + 1] - bases[var8Lifetime5]);
          limits[var8Lifetime5] = var10 - 1;
          var10 = var10 << 1;
        }
        for (var8Lifetime6 = minLength + 1; var8Lifetime6 <= maxLength; var8Lifetime6++) {
          bases[var8Lifetime6] = (limits[var8Lifetime6 - 1] + 1 << 1) - bases[var8Lifetime6];
        }
    }

    private final static void writeRunLengthBlock(Bzip2State state) {
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
        var2 = state.field_d;
        var3 = state.field_g;
        var4 = state.field_o;
        var5 = state.field_B;
        var15 = RasterBuffer.field_a;
        var14 = var15;
        var6 = var14;
        var7 = state.field_s;
        var8 = state.output;
        var9 = state.outputPosition;
        var10 = state.outputRemaining;
        var11 = var10;
        var12 = state.field_e + 1;
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
        var13 = state.totalOutput;
        state.totalOutput = state.totalOutput + (var11 - var10);
        if (state.totalOutput >= var13) {
        }
        state.field_d = (byte) var2;
        state.field_g = var3;
        state.field_o = var4;
        state.field_B = var5;
        RasterBuffer.field_a = var6;
        state.field_s = var7;
        state.output = var8;
        state.outputPosition = var9;
        state.outputRemaining = var10;
        return;
    }

    private final static byte readByte(Bzip2State state) {
        return (byte)Bzip2Decompressor.readBits(8, state);
    }

    private final static int readBits(int count, Bzip2State state) {
        int var2;
        while (state.bufferedBits < count) {
          state.bitBuffer = state.bitBuffer << 8 | state.input[state.inputPosition] & 255;
          state.bufferedBits = state.bufferedBits + 8;
          state.inputPosition = state.inputPosition + 1;
          state.totalInput = state.totalInput + 1;
          if (state.totalInput != 0) {
            continue;
          }
        }
        var2 = state.bitBuffer >> state.bufferedBits - count & (1 << count) - 1;
        state.bufferedBits = state.bufferedBits - count;
        return var2;
    }

    private final static void decodeBlocks(Bzip2State state) {
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
        state.field_c = 1;
        if (RasterBuffer.field_a == null) {
          RasterBuffer.field_a = new int[state.field_c * 100000];
        }
        var26 = 1;
        while (true) {
          if (var26 == 0) {
            return;
          }
          var1 = Bzip2Decompressor.readByte(state);
          if (var1 == 23) {
            return;
          }
          var1 = Bzip2Decompressor.readByte(state);
          var1 = Bzip2Decompressor.readByte(state);
          var1 = Bzip2Decompressor.readByte(state);
          var1 = Bzip2Decompressor.readByte(state);
          var1 = Bzip2Decompressor.readByte(state);
          var1 = Bzip2Decompressor.readByte(state);
          var1 = Bzip2Decompressor.readByte(state);
          var1 = Bzip2Decompressor.readByte(state);
          var1 = Bzip2Decompressor.readByte(state);
          var1 = Bzip2Decompressor.readBit(state);
          if (var1 == 0) {
          }
          state.field_x = 0;
          var1 = Bzip2Decompressor.readByte(state);
          state.field_x = state.field_x << 8 | var1 & 255;
          var1 = Bzip2Decompressor.readByte(state);
          state.field_x = state.field_x << 8 | var1 & 255;
          var1 = Bzip2Decompressor.readByte(state);
          state.field_x = state.field_x << 8 | var1 & 255;
          for (var4 = 0; var4 < 16; var4++) {
            var1 = Bzip2Decompressor.readBit(state);
            if (var1 != 1) {
              state.inUse16[var4] = false;
            } else {
              state.inUse16[var4] = true;
            }
          }
          for (var4 = 0; var4 < 256; var4++) {
            state.inUse[var4] = false;
          }
          for (var4 = 0; var4 < 16; var4++) {
            if (state.inUse16[var4]) {
              for (var5 = 0; var5 < 16; var5++) {
                var1 = Bzip2Decompressor.readBit(state);
                if (var1 == 1) {
                  state.inUse[var4 * 16 + var5] = true;
                }
              }
            }
          }
          Bzip2Decompressor.buildUsedByteMap(state);
          var7 = state.usedByteCount + 2;
          var8 = Bzip2Decompressor.readBits(3, state);
          var9 = Bzip2Decompressor.readBits(15, state);
          var4 = 0;
          while (var4 < var9) {
            var5 = 0;
            while (true) {
              var1 = Bzip2Decompressor.readBit(state);
              if (var1 != 0) {
                var5++;
                continue;
              }
              break;
            }
            state.field_b[var4] = (byte)var5;
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
            var29 = state.field_b[var4];
            var28 = var37[var29];
            while (var29 > 0) {
              var27_ref_byte__[var29] = var27_ref_byte__[var29 - 1];
              var29 = (byte)(var29 - 1);
            }
            var27_ref_byte__[0] = (byte)var28;
            state.selectors[var4] = (byte)var28;
          }
          var6 = 0;
          while (var6 < var8) {
            var17 = Bzip2Decompressor.readBits(5, state);
            var4 = 0;
            while (true) {
              if (var4 >= var7) {
                var6++;
                break;
              }
              while (true) {
                var1 = Bzip2Decompressor.readBit(state);
                if (var1 == 0) {
                  state.codeLengths[var6][var4] = (byte)var17;
                  var4++;
                  break;
                }
                var1 = Bzip2Decompressor.readBit(state);
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
              if (state.codeLengths[var6][var4] > var3) {
                var3 = state.codeLengths[var6][var4];
              }
              if (state.codeLengths[var6][var4] < var2) {
                var2 = state.codeLengths[var6][var4];
              }
            }
            Bzip2Decompressor.buildHuffmanTables(state.huffmanLimits[var6], state.huffmanBases[var6], state.huffmanSymbols[var6], state.codeLengths[var6], var2, var3, var7);
            state.minCodeLengths[var6] = var2;
          }
          var10 = state.usedByteCount + 1;
          var11 = -1;
          var12 = 0;
          for (var4 = 0; var4 <= 255; var4++) {
            state.field_A[var4] = 0;
          }
          var29 = 4095;
          for (var27 = 15; var27 >= 0; var27--) {
            for (var28 = 15; var28 >= 0; var28--) {
              state.field_z[var29] = (byte)(var27 * 16 + var28);
              var29--;
            }
            state.field_t[var27] = var29 + 1;
          }
          var14 = 0;
          if (var12 == 0) {
            var11++;
            var12 = 50;
            var21 = state.selectors[var11];
            var22 = state.minCodeLengths[var21];
            var23 = state.huffmanLimits[var21];
            var25 = state.huffmanSymbols[var21];
            var24 = state.huffmanBases[var21];
          }
          var12--;
          var18 = var22;
          var19 = Bzip2Decompressor.readBits(var18, state);
          while (var19 > ((int[]) (var23))[var18]) {
            var18++;
            var20 = Bzip2Decompressor.readBit(state);
            var19 = var19 << 1 | var20;
          }
          var13 = ((int[]) (var25))[var19 - ((int[]) (var24))[var18]];
          while (true) {
            if (var13 == var10) {
              state.field_g = 0;
              state.field_d = (byte) 0;
              state.field_q[0] = 0;
              for (var4 = 1; var4 <= 256; var4++) {
                state.field_q[var4] = state.field_A[var4 - 1];
              }
              for (var4 = 1; var4 <= 256; var4++) {
                state.field_q[var4] = state.field_q[var4] + state.field_q[var4 - 1];
              }
              for (var4 = 0; var4 < var14; var4++) {
                var1 = (byte)(RasterBuffer.field_a[var4] & 255);
                dupTemp$1 = state.field_q[var1 & 255];
                RasterBuffer.field_a[dupTemp$1] = RasterBuffer.field_a[dupTemp$1] | var4 << 8;
                state.field_q[var1 & 255] = state.field_q[var1 & 255] + 1;
              }
              state.field_s = RasterBuffer.field_a[state.field_x] >> 8;
              state.field_o = 0;
              state.field_s = RasterBuffer.field_a[state.field_s];
              state.field_B = (byte)(state.field_s & 255);
              state.field_s = state.field_s >> 8;
              state.field_o = state.field_o + 1;
              state.field_e = var14;
              Bzip2Decompressor.writeRunLengthBlock(state);
              if (state.field_o == state.field_e + 1 &&
                state.field_g == 0) {
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
                var30 = state.field_t[0];
                var1 = state.field_z[var30 + var33];
                while (var33 > 3) {
                  var34 = var30 + var33;
                  state.field_z[var34] = state.field_z[var34 - 1];
                  state.field_z[var34 - 1] = state.field_z[var34 - 2];
                  state.field_z[var34 - 2] = state.field_z[var34 - 3];
                  state.field_z[var34 - 3] = state.field_z[var34 - 4];
                  var33 -= 4;
                }
                while (var33 > 0) {
                  state.field_z[var30 + var33] = state.field_z[var30 + var33 - 1];
                  var33--;
                }
                state.field_z[var30] = (byte)var1;
              } else {
                var31 = var33 / 16;
                var32 = var33 % 16;
                var35 = state.field_t[var31] + var32;
                var30 = var35;
                var1 = state.field_z[var35];
                while (var35 > state.field_t[var31]) {
                  state.field_z[var35] = state.field_z[var35 - 1];
                  var35--;
                }
                state.field_t[var31] = state.field_t[var31] + 1;
                while (var31 > 0) {
                  state.field_t[var31] = state.field_t[var31] - 1;
                  state.field_z[state.field_t[var31]] = state.field_z[state.field_t[var31 - 1] + 16 - 1];
                  var31--;
                }
                state.field_t[0] = state.field_t[0] - 1;
                state.field_z[state.field_t[0]] = (byte)var1;
                if (state.field_t[0] == 0) {
                  var29 = 4095;
                  for (var27 = 15; var27 >= 0; var27--) {
                    for (var28 = 15; var28 >= 0; var28--) {
                      state.field_z[var29] = state.field_z[state.field_t[var27] + var28];
                      var29--;
                    }
                    state.field_t[var27] = var29 + 1;
                  }
                }
              }
              dupTemp$0 = state.symbolsToBytes[var1 & 255] & 255;
              state.field_A[dupTemp$0] = state.field_A[dupTemp$0] + 1;
              RasterBuffer.field_a[var14] = state.symbolsToBytes[var1 & 255] & 255;
              var14++;
              if (var12 == 0) {
                var11++;
                var12 = 50;
                var21 = state.selectors[var11];
                var22 = state.minCodeLengths[var21];
                var23 = state.huffmanLimits[var21];
                var25 = state.huffmanSymbols[var21];
                var24 = state.huffmanBases[var21];
              }
              var12--;
              var18 = var22;
              var19 = Bzip2Decompressor.readBits(var18, state);
              while (var19 > ((int[]) (var23))[var18]) {
                var18++;
                var20 = Bzip2Decompressor.readBit(state);
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
                var21 = state.selectors[var11];
                var22 = state.minCodeLengths[var21];
                var23 = state.huffmanLimits[var21];
                var25 = state.huffmanSymbols[var21];
                var24 = state.huffmanBases[var21];
              }
              var12--;
              var18 = var22;
              var19 = Bzip2Decompressor.readBits(var18, state);
              while (var19 > ((int[]) (var23))[var18]) {
                var18++;
                var20 = Bzip2Decompressor.readBit(state);
                var19 = var19 << 1 | var20;
              }
              var13 = ((int[]) (var25))[var19 - ((int[]) (var24))[var18]];
            } while (var13 == 0 ||
              var13 == 1);
            var15++;
            var1 = state.symbolsToBytes[state.field_z[state.field_t[0]] & 255];
            state.field_A[var1 & 255] = state.field_A[var1 & 255] + var15;
            while (var15 > 0) {
              RasterBuffer.field_a[var14] = var1 & 255;
              var14++;
              var15--;
            }
          }
        }
    }

    public static void releaseStatics() {
        state = null;
    }

    private final static byte readBit(Bzip2State state) {
        return (byte)Bzip2Decompressor.readBits(1, state);
    }

    final static int decompress(byte[] destination, int outputLimit, byte[] source, int compressedLength, int sourceOffset) {
        int stackIn_2_0 = 0;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        var5 = state;
        synchronized (var5) {
          state.input = source;
          state.inputPosition = sourceOffset;
          state.output = destination;
          state.outputPosition = 0;
          state.outputRemaining = outputLimit;
          state.bufferedBits = 0;
          state.bitBuffer = 0;
          state.totalInput = 0;
          state.totalOutput = 0;
          Bzip2Decompressor.decodeBlocks(state);
          outputLimit = outputLimit - state.outputRemaining;
          state.input = null;
          state.output = null;
          stackIn_2_0 = outputLimit;
        }
        return stackIn_2_0;
    }

    private final static void buildUsedByteMap(Bzip2State state) {
        int var1 = 0;
        state.usedByteCount = 0;
        for (var1 = 0; var1 < 256; var1++) {
          if (state.inUse[var1]) {
            state.symbolsToBytes[state.usedByteCount] = (byte)var1;
            state.usedByteCount = state.usedByteCount + 1;
          }
        }
    }

    static {
        state = new Bzip2State();
    }
}
