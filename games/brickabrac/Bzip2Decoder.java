/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Bzip2Decoder {
    private static Bzip2State sharedState;

    private final static byte readByte(Bzip2State state) {
        return (byte)Bzip2Decoder.readBits(8, state);
    }

    public static void releaseSharedState() {
        sharedState = null;
    }

    private final static byte readBit(Bzip2State state) {
        return (byte)Bzip2Decoder.readBits(1, state);
    }

    private final static void buildSymbolMap(Bzip2State state) {
        int byteValue = 0;
        state.inUseCount = 0;
        for (byteValue = 0; byteValue < 256; byteValue++) {
          if (state.inUse[byteValue]) {
            state.sequenceToByte[state.inUseCount] = (byte)byteValue;
            state.inUseCount = state.inUseCount + 1;
          }
        }
    }

    final static int decompress(byte[] output, int outputQuota, byte[] input, int unusedCompressedLength, int inputOffset) {
        int writtenBytes = 0;
        Throwable decompiledCaughtException = null;
        Object stateMonitor = null;
        stateMonitor = sharedState;
        synchronized (stateMonitor) {
          sharedState.input = input;
          sharedState.inputIndex = inputOffset;
          sharedState.output = output;
          sharedState.outputIndex = 0;
          sharedState.outputRemaining = outputQuota;
          sharedState.bitsAvailable = 0;
          sharedState.bitBuffer = 0;
          sharedState.totalInputBytes = 0;
          sharedState.totalOutputBytes = 0;
          Bzip2Decoder.decodeBlocks(sharedState);
          outputQuota = outputQuota - sharedState.outputRemaining;
          sharedState.input = null;
          sharedState.output = null;
          writtenBytes = outputQuota;
        }
        return writtenBytes;
    }

    private final static int readBits(int bitCount, Bzip2State state) {
        int value;
        while (state.bitsAvailable < bitCount) {
          state.bitBuffer = state.bitBuffer << 8 | state.input[state.inputIndex] & 255;
          state.bitsAvailable = state.bitsAvailable + 8;
          state.inputIndex = state.inputIndex + 1;
          state.totalInputBytes = state.totalInputBytes + 1;
          if (state.totalInputBytes != 0) {
            continue;
          }
        }
        value = state.bitBuffer >> state.bitsAvailable - bitCount & (1 << bitCount) - 1;
        state.bitsAvailable = state.bitsAvailable - bitCount;
        return value;
    }

    private final static void emitBlock(Bzip2State state) {
        int nextByte;
        int pendingRunByte;
        int pendingRunLength;
        int blockUsed;
        int currentByte;
        int[] traversalTable;
        int traversalIndex;
        byte[] output;
        int outputIndex;
        int outputRemaining;
        int initialOutputRemaining;
        int blockEnd;
        int previousTotalOutput;
        int[] tableReference;
        int[] sharedTable;
        int[] activeTable;
        pendingRunByte = state.pendingRunByte;
        pendingRunLength = state.pendingRunLength;
        blockUsed = state.blockUsed;
        currentByte = state.currentByte;
        sharedTable = HighscoresScreen.bzip2TraversalTable;
        tableReference = sharedTable;
        traversalTable = tableReference;
        traversalIndex = state.traversalIndex;
        output = state.output;
        outputIndex = state.outputIndex;
        outputRemaining = state.outputRemaining;
        initialOutputRemaining = outputRemaining;
        blockEnd = state.blockLength + 1;
        scanLoop1: while (true) {
          if (pendingRunLength > 0) {
            while (true) {
              if (outputRemaining == 0) {
                break scanLoop1;
              }
              if (pendingRunLength != 1) {
                output[outputIndex] = (byte)pendingRunByte;
                pendingRunLength--;
                outputIndex++;
                outputRemaining--;
                continue;
              }
              break;
            }
            if (outputRemaining == 0) {
              pendingRunLength = 1;
              break scanLoop1;
            }
            output[outputIndex] = (byte)pendingRunByte;
            outputIndex++;
            outputRemaining--;
          }
          while (blockUsed != blockEnd) {
            activeTable = tableReference;
            pendingRunByte = (byte)currentByte;
            traversalIndex = activeTable[traversalIndex];
            nextByte = (byte)traversalIndex;
            traversalIndex = traversalIndex >> 8;
            blockUsed++;
            if (nextByte == currentByte) {
              if (blockUsed != blockEnd) {
                pendingRunLength = 2;
                traversalIndex = activeTable[traversalIndex];
                nextByte = (byte)traversalIndex;
                traversalIndex = traversalIndex >> 8;
                blockUsed++;
                if (blockUsed == blockEnd) {
                  continue scanLoop1;
                }
                if (nextByte != currentByte) {
                  currentByte = nextByte;
                  continue scanLoop1;
                }
                pendingRunLength = 3;
                traversalIndex = activeTable[traversalIndex];
                nextByte = (byte)traversalIndex;
                traversalIndex = traversalIndex >> 8;
                blockUsed++;
                if (blockUsed == blockEnd) {
                  continue scanLoop1;
                }
                if (nextByte != currentByte) {
                  currentByte = nextByte;
                  continue scanLoop1;
                }
                traversalIndex = activeTable[traversalIndex];
                nextByte = (byte)traversalIndex;
                traversalIndex = traversalIndex >> 8;
                blockUsed++;
                pendingRunLength = (nextByte & 255) + 4;
                traversalIndex = activeTable[traversalIndex];
                currentByte = (byte)traversalIndex;
                traversalIndex = traversalIndex >> 8;
                blockUsed++;
                continue scanLoop1;
              }
              if (outputRemaining == 0) {
                pendingRunLength = 1;
                break scanLoop1;
              }
            } else {
              currentByte = nextByte;
              if (outputRemaining == 0) {
                pendingRunLength = 1;
                break scanLoop1;
              }
            }
            output[outputIndex] = (byte)pendingRunByte;
            outputIndex++;
            outputRemaining--;
          }
          pendingRunLength = 0;
          break;
        }
        previousTotalOutput = state.totalOutputBytes;
        state.totalOutputBytes = state.totalOutputBytes + (initialOutputRemaining - outputRemaining);
        if (state.totalOutputBytes >= previousTotalOutput) {
        }
        state.pendingRunByte = (byte) pendingRunByte;
        state.pendingRunLength = pendingRunLength;
        state.blockUsed = blockUsed;
        state.currentByte = currentByte;
        HighscoresScreen.bzip2TraversalTable = traversalTable;
        state.traversalIndex = traversalIndex;
        state.output = output;
        state.outputIndex = outputIndex;
        state.outputRemaining = outputRemaining;
        return;
    }

    private final static void decodeBlocks(Bzip2State state) {
        int cumulativePosition = 0;
        int frequencyByte = 0;
        int decodedByteOrBit;
        int minimumLength;
        int maximumLength;
        int symbolOrSelectorIndex;
        int groupBitOrUnaryCount;
        int huffmanGroupIndex;
        int alphabetSize;
        int huffmanGroupCount;
        int selectorCount;
        int endOfBlockSymbol;
        int selectorIndex;
        int selectorSymbolsRemaining;
        int decodedSymbol;
        int blockLength;
        int runLength;
        int runWeight;
        int currentCodeLength;
        int decodeLength;
        int decodeBits;
        int nextDecodeBit;
        int selectedGroup;
        int selectedMinimumLength;
        Object selectedLimits;
        Object selectedBase;
        Object selectedPermutation;
        int continueBlocks;
        byte[] selectorMtfList;
        int mtfBlockIndex;
        int mtfByteOrSlot;
        int mtfIndexOrPosition;
        int mtfBaseOrPosition;
        int mtfBlock;
        int mtfSlot;
        int mtfRank;
        int shiftPosition;
        int mtfPosition;
        byte[] selectorListReference;
        byte[] selectorList;
        symbolOrSelectorIndex = 0;
        groupBitOrUnaryCount = 0;
        huffmanGroupIndex = 0;
        alphabetSize = 0;
        huffmanGroupCount = 0;
        selectorCount = 0;
        endOfBlockSymbol = 0;
        selectorIndex = 0;
        selectorSymbolsRemaining = 0;
        decodedSymbol = 0;
        blockLength = 0;
        runLength = 0;
        runWeight = 0;
        currentCodeLength = 0;
        decodeLength = 0;
        decodeBits = 0;
        nextDecodeBit = 0;
        selectedGroup = 0;
        selectedMinimumLength = 0;
        selectedLimits = null;
        selectedBase = null;
        selectedPermutation = null;
        state.blockSize100k = 1;
        if (HighscoresScreen.bzip2TraversalTable == null) {
          HighscoresScreen.bzip2TraversalTable = new int[state.blockSize100k * 100000];
        }
        continueBlocks = 1;
        while (true) {
          if (continueBlocks == 0) {
            return;
          }
          decodedByteOrBit = Bzip2Decoder.readByte(state);
          if (decodedByteOrBit == 23) {
            return;
          }
          decodedByteOrBit = Bzip2Decoder.readByte(state);
          decodedByteOrBit = Bzip2Decoder.readByte(state);
          decodedByteOrBit = Bzip2Decoder.readByte(state);
          decodedByteOrBit = Bzip2Decoder.readByte(state);
          decodedByteOrBit = Bzip2Decoder.readByte(state);
          decodedByteOrBit = Bzip2Decoder.readByte(state);
          decodedByteOrBit = Bzip2Decoder.readByte(state);
          decodedByteOrBit = Bzip2Decoder.readByte(state);
          decodedByteOrBit = Bzip2Decoder.readByte(state);
          decodedByteOrBit = Bzip2Decoder.readBit(state);
          if (decodedByteOrBit == 0) {
          }
          state.originalPointer = 0;
          decodedByteOrBit = Bzip2Decoder.readByte(state);
          state.originalPointer = state.originalPointer << 8 | decodedByteOrBit & 255;
          decodedByteOrBit = Bzip2Decoder.readByte(state);
          state.originalPointer = state.originalPointer << 8 | decodedByteOrBit & 255;
          decodedByteOrBit = Bzip2Decoder.readByte(state);
          state.originalPointer = state.originalPointer << 8 | decodedByteOrBit & 255;
          for (symbolOrSelectorIndex = 0; symbolOrSelectorIndex < 16; symbolOrSelectorIndex++) {
            decodedByteOrBit = Bzip2Decoder.readBit(state);
            if (decodedByteOrBit != 1) {
              state.inUseGroups[symbolOrSelectorIndex] = false;
            } else {
              state.inUseGroups[symbolOrSelectorIndex] = true;
            }
          }
          for (symbolOrSelectorIndex = 0; symbolOrSelectorIndex < 256; symbolOrSelectorIndex++) {
            state.inUse[symbolOrSelectorIndex] = false;
          }
          for (symbolOrSelectorIndex = 0; symbolOrSelectorIndex < 16; symbolOrSelectorIndex++) {
            if (state.inUseGroups[symbolOrSelectorIndex]) {
              for (groupBitOrUnaryCount = 0; groupBitOrUnaryCount < 16; groupBitOrUnaryCount++) {
                decodedByteOrBit = Bzip2Decoder.readBit(state);
                if (decodedByteOrBit == 1) {
                  state.inUse[symbolOrSelectorIndex * 16 + groupBitOrUnaryCount] = true;
                }
              }
            }
          }
          Bzip2Decoder.buildSymbolMap(state);
          alphabetSize = state.inUseCount + 2;
          huffmanGroupCount = Bzip2Decoder.readBits(3, state);
          selectorCount = Bzip2Decoder.readBits(15, state);
          symbolOrSelectorIndex = 0;
          while (symbolOrSelectorIndex < selectorCount) {
            groupBitOrUnaryCount = 0;
            while (true) {
              decodedByteOrBit = Bzip2Decoder.readBit(state);
              if (decodedByteOrBit != 0) {
                groupBitOrUnaryCount++;
                continue;
              }
              break;
            }
            state.selectorMtf[symbolOrSelectorIndex] = (byte)groupBitOrUnaryCount;
            symbolOrSelectorIndex++;
          }
          selectorList = new byte[6];
          selectorListReference = selectorList;
          selectorMtfList = selectorListReference;
          mtfIndexOrPosition = 0;
          while (mtfIndexOrPosition < huffmanGroupCount) {
            selectorMtfList[mtfIndexOrPosition] = (byte)mtfIndexOrPosition;
            mtfIndexOrPosition = (byte)(mtfIndexOrPosition + 1);
          }
          for (symbolOrSelectorIndex = 0; symbolOrSelectorIndex < selectorCount; symbolOrSelectorIndex++) {
            mtfIndexOrPosition = state.selectorMtf[symbolOrSelectorIndex];
            mtfByteOrSlot = selectorList[mtfIndexOrPosition];
            while (mtfIndexOrPosition > 0) {
              selectorMtfList[mtfIndexOrPosition] = selectorMtfList[mtfIndexOrPosition - 1];
              mtfIndexOrPosition = (byte)(mtfIndexOrPosition - 1);
            }
            selectorMtfList[0] = (byte)mtfByteOrSlot;
            state.selectors[symbolOrSelectorIndex] = (byte)mtfByteOrSlot;
          }
          huffmanGroupIndex = 0;
          while (huffmanGroupIndex < huffmanGroupCount) {
            currentCodeLength = Bzip2Decoder.readBits(5, state);
            symbolOrSelectorIndex = 0;
            while (true) {
              if (symbolOrSelectorIndex >= alphabetSize) {
                huffmanGroupIndex++;
                break;
              }
              while (true) {
                decodedByteOrBit = Bzip2Decoder.readBit(state);
                if (decodedByteOrBit == 0) {
                  state.codeLengths[huffmanGroupIndex][symbolOrSelectorIndex] = (byte)currentCodeLength;
                  symbolOrSelectorIndex++;
                  break;
                }
                decodedByteOrBit = Bzip2Decoder.readBit(state);
                if (decodedByteOrBit != 0) {
                  currentCodeLength--;
                  continue;
                }
                currentCodeLength++;
              }
            }
          }
          for (huffmanGroupIndex = 0; huffmanGroupIndex < huffmanGroupCount; huffmanGroupIndex++) {
            minimumLength = 32;
            maximumLength = 0;
            for (symbolOrSelectorIndex = 0; symbolOrSelectorIndex < alphabetSize; symbolOrSelectorIndex++) {
              if (state.codeLengths[huffmanGroupIndex][symbolOrSelectorIndex] > maximumLength) {
                maximumLength = state.codeLengths[huffmanGroupIndex][symbolOrSelectorIndex];
              }
              if (state.codeLengths[huffmanGroupIndex][symbolOrSelectorIndex] < minimumLength) {
                minimumLength = state.codeLengths[huffmanGroupIndex][symbolOrSelectorIndex];
              }
            }
            Bzip2Decoder.buildHuffmanTables(state.huffmanLimits[huffmanGroupIndex], state.huffmanBase[huffmanGroupIndex], state.huffmanPermutation[huffmanGroupIndex], state.codeLengths[huffmanGroupIndex], minimumLength, maximumLength, alphabetSize);
            state.minimumCodeLengths[huffmanGroupIndex] = minimumLength;
          }
          endOfBlockSymbol = state.inUseCount + 1;
          selectorIndex = -1;
          selectorSymbolsRemaining = 0;
          for (symbolOrSelectorIndex = 0; symbolOrSelectorIndex <= 255; symbolOrSelectorIndex++) {
            state.byteFrequencies[symbolOrSelectorIndex] = 0;
          }
          mtfIndexOrPosition = 4095;
          for (mtfBlockIndex = 15; mtfBlockIndex >= 0; mtfBlockIndex--) {
            for (mtfByteOrSlot = 15; mtfByteOrSlot >= 0; mtfByteOrSlot--) {
              state.mtfSymbols[mtfIndexOrPosition] = (byte)(mtfBlockIndex * 16 + mtfByteOrSlot);
              mtfIndexOrPosition--;
            }
            state.mtfBases[mtfBlockIndex] = mtfIndexOrPosition + 1;
          }
          blockLength = 0;
          if (selectorSymbolsRemaining == 0) {
            selectorIndex++;
            selectorSymbolsRemaining = 50;
            selectedGroup = state.selectors[selectorIndex];
            selectedMinimumLength = state.minimumCodeLengths[selectedGroup];
            selectedLimits = state.huffmanLimits[selectedGroup];
            selectedPermutation = state.huffmanPermutation[selectedGroup];
            selectedBase = state.huffmanBase[selectedGroup];
          }
          selectorSymbolsRemaining--;
          decodeLength = selectedMinimumLength;
          decodeBits = Bzip2Decoder.readBits(decodeLength, state);
          while (decodeBits > ((int[]) (selectedLimits))[decodeLength]) {
            decodeLength++;
            nextDecodeBit = Bzip2Decoder.readBit(state);
            decodeBits = decodeBits << 1 | nextDecodeBit;
          }
          decodedSymbol = ((int[]) (selectedPermutation))[decodeBits - ((int[]) (selectedBase))[decodeLength]];
          while (true) {
            if (decodedSymbol == endOfBlockSymbol) {
              state.pendingRunLength = 0;
              state.pendingRunByte = (byte) 0;
              state.cumulativeFrequencies[0] = 0;
              for (symbolOrSelectorIndex = 1; symbolOrSelectorIndex <= 256; symbolOrSelectorIndex++) {
                state.cumulativeFrequencies[symbolOrSelectorIndex] = state.byteFrequencies[symbolOrSelectorIndex - 1];
              }
              for (symbolOrSelectorIndex = 1; symbolOrSelectorIndex <= 256; symbolOrSelectorIndex++) {
                state.cumulativeFrequencies[symbolOrSelectorIndex] = state.cumulativeFrequencies[symbolOrSelectorIndex] + state.cumulativeFrequencies[symbolOrSelectorIndex - 1];
              }
              for (symbolOrSelectorIndex = 0; symbolOrSelectorIndex < blockLength; symbolOrSelectorIndex++) {
                decodedByteOrBit = (byte)(HighscoresScreen.bzip2TraversalTable[symbolOrSelectorIndex] & 255);
                cumulativePosition = state.cumulativeFrequencies[decodedByteOrBit & 255];
                HighscoresScreen.bzip2TraversalTable[cumulativePosition] = HighscoresScreen.bzip2TraversalTable[cumulativePosition] | symbolOrSelectorIndex << 8;
                state.cumulativeFrequencies[decodedByteOrBit & 255] = state.cumulativeFrequencies[decodedByteOrBit & 255] + 1;
              }
              state.traversalIndex = HighscoresScreen.bzip2TraversalTable[state.originalPointer] >> 8;
              state.blockUsed = 0;
              state.traversalIndex = HighscoresScreen.bzip2TraversalTable[state.traversalIndex];
              state.currentByte = (byte)(state.traversalIndex & 255);
              state.traversalIndex = state.traversalIndex >> 8;
              state.blockUsed = state.blockUsed + 1;
              state.blockLength = blockLength;
              Bzip2Decoder.emitBlock(state);
              if (state.blockUsed == state.blockLength + 1 &&
                state.pendingRunLength == 0) {
                continueBlocks = 1;
                break;
              }
              continueBlocks = 0;
              break;
            }
            if (decodedSymbol != 0 &&
              decodedSymbol != 1) {
              mtfRank = decodedSymbol - 1;
              if (mtfRank < 16) {
                mtfBaseOrPosition = state.mtfBases[0];
                decodedByteOrBit = state.mtfSymbols[mtfBaseOrPosition + mtfRank];
                while (mtfRank > 3) {
                  shiftPosition = mtfBaseOrPosition + mtfRank;
                  state.mtfSymbols[shiftPosition] = state.mtfSymbols[shiftPosition - 1];
                  state.mtfSymbols[shiftPosition - 1] = state.mtfSymbols[shiftPosition - 2];
                  state.mtfSymbols[shiftPosition - 2] = state.mtfSymbols[shiftPosition - 3];
                  state.mtfSymbols[shiftPosition - 3] = state.mtfSymbols[shiftPosition - 4];
                  mtfRank -= 4;
                }
                while (mtfRank > 0) {
                  state.mtfSymbols[mtfBaseOrPosition + mtfRank] = state.mtfSymbols[mtfBaseOrPosition + mtfRank - 1];
                  mtfRank--;
                }
                state.mtfSymbols[mtfBaseOrPosition] = (byte)decodedByteOrBit;
              } else {
                mtfBlock = mtfRank / 16;
                mtfSlot = mtfRank % 16;
                mtfPosition = state.mtfBases[mtfBlock] + mtfSlot;
                mtfBaseOrPosition = mtfPosition;
                decodedByteOrBit = state.mtfSymbols[mtfPosition];
                while (mtfPosition > state.mtfBases[mtfBlock]) {
                  state.mtfSymbols[mtfPosition] = state.mtfSymbols[mtfPosition - 1];
                  mtfPosition--;
                }
                state.mtfBases[mtfBlock] = state.mtfBases[mtfBlock] + 1;
                while (mtfBlock > 0) {
                  state.mtfBases[mtfBlock] = state.mtfBases[mtfBlock] - 1;
                  state.mtfSymbols[state.mtfBases[mtfBlock]] = state.mtfSymbols[state.mtfBases[mtfBlock - 1] + 16 - 1];
                  mtfBlock--;
                }
                state.mtfBases[0] = state.mtfBases[0] - 1;
                state.mtfSymbols[state.mtfBases[0]] = (byte)decodedByteOrBit;
                if (state.mtfBases[0] == 0) {
                  mtfIndexOrPosition = 4095;
                  for (mtfBlockIndex = 15; mtfBlockIndex >= 0; mtfBlockIndex--) {
                    for (mtfByteOrSlot = 15; mtfByteOrSlot >= 0; mtfByteOrSlot--) {
                      state.mtfSymbols[mtfIndexOrPosition] = state.mtfSymbols[state.mtfBases[mtfBlockIndex] + mtfByteOrSlot];
                      mtfIndexOrPosition--;
                    }
                    state.mtfBases[mtfBlockIndex] = mtfIndexOrPosition + 1;
                  }
                }
              }
              frequencyByte = state.sequenceToByte[decodedByteOrBit & 255] & 255;
              state.byteFrequencies[frequencyByte] = state.byteFrequencies[frequencyByte] + 1;
              HighscoresScreen.bzip2TraversalTable[blockLength] = state.sequenceToByte[decodedByteOrBit & 255] & 255;
              blockLength++;
              if (selectorSymbolsRemaining == 0) {
                selectorIndex++;
                selectorSymbolsRemaining = 50;
                selectedGroup = state.selectors[selectorIndex];
                selectedMinimumLength = state.minimumCodeLengths[selectedGroup];
                selectedLimits = state.huffmanLimits[selectedGroup];
                selectedPermutation = state.huffmanPermutation[selectedGroup];
                selectedBase = state.huffmanBase[selectedGroup];
              }
              selectorSymbolsRemaining--;
              decodeLength = selectedMinimumLength;
              decodeBits = Bzip2Decoder.readBits(decodeLength, state);
              while (decodeBits > ((int[]) (selectedLimits))[decodeLength]) {
                decodeLength++;
                nextDecodeBit = Bzip2Decoder.readBit(state);
                decodeBits = decodeBits << 1 | nextDecodeBit;
              }
              decodedSymbol = ((int[]) (selectedPermutation))[decodeBits - ((int[]) (selectedBase))[decodeLength]];
              continue;
            }
            runLength = -1;
            runWeight = 1;
            do {
              if (decodedSymbol != 0) {
                if (decodedSymbol == 1) {
                  runLength = runLength + 2 * runWeight;
                }
              } else {
                runLength = runLength + 1 * runWeight;
              }
              runWeight = runWeight * 2;
              if (selectorSymbolsRemaining == 0) {
                selectorIndex++;
                selectorSymbolsRemaining = 50;
                selectedGroup = state.selectors[selectorIndex];
                selectedMinimumLength = state.minimumCodeLengths[selectedGroup];
                selectedLimits = state.huffmanLimits[selectedGroup];
                selectedPermutation = state.huffmanPermutation[selectedGroup];
                selectedBase = state.huffmanBase[selectedGroup];
              }
              selectorSymbolsRemaining--;
              decodeLength = selectedMinimumLength;
              decodeBits = Bzip2Decoder.readBits(decodeLength, state);
              while (decodeBits > ((int[]) (selectedLimits))[decodeLength]) {
                decodeLength++;
                nextDecodeBit = Bzip2Decoder.readBit(state);
                decodeBits = decodeBits << 1 | nextDecodeBit;
              }
              decodedSymbol = ((int[]) (selectedPermutation))[decodeBits - ((int[]) (selectedBase))[decodeLength]];
            } while (decodedSymbol == 0 ||
              decodedSymbol == 1);
            runLength++;
            decodedByteOrBit = state.sequenceToByte[state.mtfSymbols[state.mtfBases[0]] & 255];
            state.byteFrequencies[decodedByteOrBit & 255] = state.byteFrequencies[decodedByteOrBit & 255] + runLength;
            while (runLength > 0) {
              HighscoresScreen.bzip2TraversalTable[blockLength] = decodedByteOrBit & 255;
              blockLength++;
              runLength--;
            }
          }
        }
    }

    private final static void buildHuffmanTables(int[] limits, int[] base, int[] permutation, byte[] lengths, int minimumLength, int maximumLength, int alphabetSize) {
        int symbolIndex = 0;
        int lengthCountIndex = 0;
        int permutationIndex;
        int codeLength;
        int canonicalCode;
        int baseClearIndex;
        int lengthSymbolIndex;
        int cumulativeLengthIndex;
        int limitClearIndex;
        int limitCodeLength;
        int baseCodeLength;
        permutationIndex = 0;
        for (codeLength = minimumLength; codeLength <= maximumLength; codeLength++) {
          for (symbolIndex = 0; symbolIndex < alphabetSize; symbolIndex++) {
            if (lengths[symbolIndex] == codeLength) {
              permutation[permutationIndex] = symbolIndex;
              permutationIndex++;
            }
          }
        }
        for (baseClearIndex = 0; baseClearIndex < 23; baseClearIndex++) {
          base[baseClearIndex] = 0;
        }
        for (lengthSymbolIndex = 0; lengthSymbolIndex < alphabetSize; lengthSymbolIndex++) {
          lengthCountIndex = lengths[lengthSymbolIndex] + 1;
          base[lengthCountIndex] = base[lengthCountIndex] + 1;
        }
        for (cumulativeLengthIndex = 1; cumulativeLengthIndex < 23; cumulativeLengthIndex++) {
          base[cumulativeLengthIndex] = base[cumulativeLengthIndex] + base[cumulativeLengthIndex - 1];
        }
        for (limitClearIndex = 0; limitClearIndex < 23; limitClearIndex++) {
          limits[limitClearIndex] = 0;
        }
        canonicalCode = 0;
        for (limitCodeLength = minimumLength; limitCodeLength <= maximumLength; limitCodeLength++) {
          canonicalCode = canonicalCode + (base[limitCodeLength + 1] - base[limitCodeLength]);
          limits[limitCodeLength] = canonicalCode - 1;
          canonicalCode = canonicalCode << 1;
        }
        for (baseCodeLength = minimumLength + 1; baseCodeLength <= maximumLength; baseCodeLength++) {
          base[baseCodeLength] = (limits[baseCodeLength - 1] + 1 << 1) - base[baseCodeLength];
        }
    }

    static {
        sharedState = new Bzip2State();
    }
}
