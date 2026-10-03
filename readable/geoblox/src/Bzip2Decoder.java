/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Bzip2Decoder {
    private static Bzip2DecoderState decoderState;

    private final static byte readByte(Bzip2DecoderState state) {
        return (byte)Bzip2Decoder.readBits(8, state);
    }

    private final static void decodeBlocks(Bzip2DecoderState state) {
        int transformBucketPosition = 0;
        int frequencyByteValue = 0;
        int byteOrBitValue;
        int minimumCodeLength;
        int maximumCodeLength;
        int index;
        int byteInGroupOrSelectorRank;
        int huffmanTableIndex;
        int huffmanAlphabetSize;
        int huffmanTableCount;
        int selectorCount;
        int endOfBlockSymbol;
        int selectorIndex;
        int symbolsRemainingInGroup;
        int symbol;
        int blockLength;
        int runLength;
        int runWeight;
        int codeLength;
        int currentCodeLength;
        int codeBits;
        int nextCodeBit;
        int selectedTableIndex;
        int selectedMinimumCodeLength;
        Object selectedLimits;
        Object selectedBases;
        Object selectedSymbols;
        int continueDecodingBlocks;
        byte[] selectorOrderAlias;
        int mtfBlockIndex;
        int selectorTableOrMtfByteIndex;
        int selectorRankOrMtfWritePosition;
        int mtfPosition;
        int mtfBlockIndexForMove;
        int mtfOffsetInBlock;
        int mtfRank;
        int mtfShiftPosition;
        int mtfCursor;
        byte[] selectorOrder;
        byte[] allocatedSelectorOrder;
        index = 0;
        byteInGroupOrSelectorRank = 0;
        huffmanTableIndex = 0;
        huffmanAlphabetSize = 0;
        huffmanTableCount = 0;
        selectorCount = 0;
        endOfBlockSymbol = 0;
        selectorIndex = 0;
        symbolsRemainingInGroup = 0;
        symbol = 0;
        blockLength = 0;
        runLength = 0;
        runWeight = 0;
        codeLength = 0;
        currentCodeLength = 0;
        codeBits = 0;
        nextCodeBit = 0;
        selectedTableIndex = 0;
        selectedMinimumCodeLength = 0;
        selectedLimits = null;
        selectedBases = null;
        selectedSymbols = null;
        state.blockSize100k = 1;
        if (kb.bzip2TransformTable == null) {
          kb.bzip2TransformTable = new int[state.blockSize100k * 100000];
        }
        continueDecodingBlocks = 1;
        L1: while (true) {
          if (continueDecodingBlocks == 0) {
            return;
          }
          {
            byteOrBitValue = Bzip2Decoder.readByte(state);
            if (byteOrBitValue == 23) {
              return;
            }
            byteOrBitValue = Bzip2Decoder.readByte(state);
            byteOrBitValue = Bzip2Decoder.readByte(state);
            byteOrBitValue = Bzip2Decoder.readByte(state);
            byteOrBitValue = Bzip2Decoder.readByte(state);
            byteOrBitValue = Bzip2Decoder.readByte(state);
            byteOrBitValue = Bzip2Decoder.readByte(state);
            byteOrBitValue = Bzip2Decoder.readByte(state);
            byteOrBitValue = Bzip2Decoder.readByte(state);
            byteOrBitValue = Bzip2Decoder.readByte(state);
            byteOrBitValue = Bzip2Decoder.readBit(state);
            if (byteOrBitValue == 0) {
            }
            state.originalPointer = 0;
            byteOrBitValue = Bzip2Decoder.readByte(state);
            state.originalPointer = state.originalPointer << 8 | byteOrBitValue & 255;
            byteOrBitValue = Bzip2Decoder.readByte(state);
            state.originalPointer = state.originalPointer << 8 | byteOrBitValue & 255;
            byteOrBitValue = Bzip2Decoder.readByte(state);
            state.originalPointer = state.originalPointer << 8 | byteOrBitValue & 255;
            L3: for (index = 0; index < 16; index++) {
              byteOrBitValue = Bzip2Decoder.readBit(state);
              if (byteOrBitValue != 1) {
                state.usedByteGroups[index] = false;
                continue L3;
              }
              state.usedByteGroups[index] = true;
            }
            for (index = 0; index < 256; index++) {
              state.usedBytes[index] = false;
            }
            L5: for (index = 0; index < 16; index++) {
              if (!state.usedByteGroups[index]) {
                continue L5;
              }
              L42: for (byteInGroupOrSelectorRank = 0; byteInGroupOrSelectorRank < 16; byteInGroupOrSelectorRank++) {
                byteOrBitValue = Bzip2Decoder.readBit(state);
                if (byteOrBitValue != 1) {
                  continue L42;
                }
                state.usedBytes[index * 16 + byteInGroupOrSelectorRank] = true;
              }
            }
            Bzip2Decoder.buildByteAlphabet(state);
            huffmanAlphabetSize = state.alphabetSize + 2;
            huffmanTableCount = Bzip2Decoder.readBits(3, state);
            selectorCount = Bzip2Decoder.readBits(15, state);
            index = 0;
            L6: while (true) {
              if (index < selectorCount) {
                byteInGroupOrSelectorRank = 0;
                L41: while (true) {
                  byteOrBitValue = Bzip2Decoder.readBit(state);
                  if (byteOrBitValue != 0) {
                    byteInGroupOrSelectorRank++;
                    continue L41;
                  }
                  state.selectorMoveToFrontValues[index] = (byte)byteInGroupOrSelectorRank;
                  index++;
                  continue L6;
                }
              }
              {
                allocatedSelectorOrder = new byte[6];
                selectorOrder = allocatedSelectorOrder;
                selectorOrderAlias = selectorOrder;
                selectorRankOrMtfWritePosition = 0;
                L7: while (selectorRankOrMtfWritePosition < huffmanTableCount) {
                  selectorOrderAlias[selectorRankOrMtfWritePosition] = (byte)selectorRankOrMtfWritePosition;
                  selectorRankOrMtfWritePosition = (byte)(selectorRankOrMtfWritePosition + 1);
                }
                for (index = 0; index < selectorCount; index++) {
                  selectorRankOrMtfWritePosition = state.selectorMoveToFrontValues[index];
                  selectorTableOrMtfByteIndex = allocatedSelectorOrder[selectorRankOrMtfWritePosition];
                  L40: while (selectorRankOrMtfWritePosition > 0) {
                    selectorOrderAlias[selectorRankOrMtfWritePosition] = selectorOrderAlias[selectorRankOrMtfWritePosition - 1];
                    selectorRankOrMtfWritePosition = (byte)(selectorRankOrMtfWritePosition - 1);
                  }
                  selectorOrderAlias[0] = (byte)selectorTableOrMtfByteIndex;
                  state.huffmanSelectors[index] = (byte)selectorTableOrMtfByteIndex;
                }
                huffmanTableIndex = 0;
                L9: while (true) {
                  if (huffmanTableIndex < huffmanTableCount) {
                    codeLength = Bzip2Decoder.readBits(5, state);
                    index = 0;
                    L38: while (true) {
                      if (index >= huffmanAlphabetSize) {
                        huffmanTableIndex++;
                        continue L9;
                      }
                      L39: while (true) {
                        byteOrBitValue = Bzip2Decoder.readBit(state);
                        if (byteOrBitValue == 0) {
                          state.huffmanCodeLengths[huffmanTableIndex][index] = (byte)codeLength;
                          index++;
                          continue L38;
                        }
                        byteOrBitValue = Bzip2Decoder.readBit(state);
                        if (byteOrBitValue != 0) {
                          codeLength--;
                          continue L39;
                        }
                        codeLength++;
                        continue L39;
                      }
                    }
                  }
                  {
                    for (huffmanTableIndex = 0; huffmanTableIndex < huffmanTableCount; huffmanTableIndex++) {
                      minimumCodeLength = 32;
                      maximumCodeLength = 0;
                      L36: for (index = 0; index < huffmanAlphabetSize; index++) {
                        if (state.huffmanCodeLengths[huffmanTableIndex][index] > maximumCodeLength) {
                          maximumCodeLength = state.huffmanCodeLengths[huffmanTableIndex][index];
                        }
                        if (state.huffmanCodeLengths[huffmanTableIndex][index] >= minimumCodeLength) {
                          continue L36;
                        }
                        minimumCodeLength = state.huffmanCodeLengths[huffmanTableIndex][index];
                      }
                      Bzip2Decoder.buildHuffmanTables(state.huffmanLimits[huffmanTableIndex], state.huffmanBases[huffmanTableIndex], state.huffmanSymbols[huffmanTableIndex], state.huffmanCodeLengths[huffmanTableIndex], minimumCodeLength, maximumCodeLength, huffmanAlphabetSize);
                      state.minimumCodeLengths[huffmanTableIndex] = minimumCodeLength;
                    }
                    endOfBlockSymbol = state.alphabetSize + 1;
                    selectorIndex = -1;
                    symbolsRemainingInGroup = 0;
                    for (index = 0; index <= 255; index++) {
                      state.byteFrequencies[index] = 0;
                    }
                    selectorRankOrMtfWritePosition = 4095;
                    for (mtfBlockIndex = 15; mtfBlockIndex >= 0; mtfBlockIndex--) {
                      for (selectorTableOrMtfByteIndex = 15; selectorTableOrMtfByteIndex >= 0; selectorTableOrMtfByteIndex--) {
                        state.moveToFrontBytes[selectorRankOrMtfWritePosition] = (byte)(mtfBlockIndex * 16 + selectorTableOrMtfByteIndex);
                        selectorRankOrMtfWritePosition--;
                      }
                      state.moveToFrontBlockStarts[mtfBlockIndex] = selectorRankOrMtfWritePosition + 1;
                    }
                    blockLength = 0;
                    if (symbolsRemainingInGroup == 0) {
                      selectorIndex++;
                      symbolsRemainingInGroup = 50;
                      selectedTableIndex = state.huffmanSelectors[selectorIndex];
                      selectedMinimumCodeLength = state.minimumCodeLengths[selectedTableIndex];
                      selectedLimits = state.huffmanLimits[selectedTableIndex];
                      selectedSymbols = state.huffmanSymbols[selectedTableIndex];
                      selectedBases = state.huffmanBases[selectedTableIndex];
                    }
                    symbolsRemainingInGroup--;
                    currentCodeLength = selectedMinimumCodeLength;
                    codeBits = Bzip2Decoder.readBits(currentCodeLength, state);
                    L14: while (codeBits > ((int[]) (selectedLimits))[currentCodeLength]) {
                      currentCodeLength++;
                      nextCodeBit = Bzip2Decoder.readBit(state);
                      codeBits = codeBits << 1 | nextCodeBit;
                    }
                    symbol = ((int[]) (selectedSymbols))[codeBits - ((int[]) (selectedBases))[currentCodeLength]];
                    L15: while (true) {
                      if (symbol == endOfBlockSymbol) {
                        state.pendingRunLength = 0;
                        state.pendingRunByte = (byte) 0;
                        state.byteBucketPositions[0] = 0;
                        for (index = 1; index <= 256; index++) {
                          state.byteBucketPositions[index] = state.byteFrequencies[index - 1];
                        }
                        for (index = 1; index <= 256; index++) {
                          state.byteBucketPositions[index] = state.byteBucketPositions[index] + state.byteBucketPositions[index - 1];
                        }
                        for (index = 0; index < blockLength; index++) {
                          byteOrBitValue = (byte)(kb.bzip2TransformTable[index] & 255);
                          transformBucketPosition = state.byteBucketPositions[byteOrBitValue & 255];
                          kb.bzip2TransformTable[transformBucketPosition] = kb.bzip2TransformTable[transformBucketPosition] | index << 8;
                          state.byteBucketPositions[byteOrBitValue & 255] = state.byteBucketPositions[byteOrBitValue & 255] + 1;
                        }
                        state.transformPositionOrEntry = kb.bzip2TransformTable[state.originalPointer] >> 8;
                        state.blockBytesConsumed = 0;
                        state.transformPositionOrEntry = kb.bzip2TransformTable[state.transformPositionOrEntry];
                        state.currentByte = (byte)(state.transformPositionOrEntry & 255);
                        state.transformPositionOrEntry = state.transformPositionOrEntry >> 8;
                        state.blockBytesConsumed = state.blockBytesConsumed + 1;
                        state.blockLength = blockLength;
                        Bzip2Decoder.emitBlockRuns(state);
                        if (state.blockBytesConsumed == state.blockLength + 1) {
                          if (state.pendingRunLength == 0) {
                            continueDecodingBlocks = 1;
                            continue L1;
                          }
                        }
                        continueDecodingBlocks = 0;
                        continue L1;
                      }
                      if (symbol != 0) {
                        if (symbol != 1) {
                          L17: {
                            mtfRank = symbol - 1;
                            if (mtfRank < 16) {
                              mtfPosition = state.moveToFrontBlockStarts[0];
                              byteOrBitValue = state.moveToFrontBytes[mtfPosition + mtfRank];
                              L22: while (mtfRank > 3) {
                                mtfShiftPosition = mtfPosition + mtfRank;
                                state.moveToFrontBytes[mtfShiftPosition] = state.moveToFrontBytes[mtfShiftPosition - 1];
                                state.moveToFrontBytes[mtfShiftPosition - 1] = state.moveToFrontBytes[mtfShiftPosition - 2];
                                state.moveToFrontBytes[mtfShiftPosition - 2] = state.moveToFrontBytes[mtfShiftPosition - 3];
                                state.moveToFrontBytes[mtfShiftPosition - 3] = state.moveToFrontBytes[mtfShiftPosition - 4];
                                mtfRank -= 4;
                              }
                              L23: while (mtfRank > 0) {
                                state.moveToFrontBytes[mtfPosition + mtfRank] = state.moveToFrontBytes[mtfPosition + mtfRank - 1];
                                mtfRank--;
                              }
                              state.moveToFrontBytes[mtfPosition] = (byte)byteOrBitValue;
                              break L17;
                            }
                            {
                              mtfBlockIndexForMove = mtfRank / 16;
                              mtfOffsetInBlock = mtfRank % 16;
                              mtfCursor = state.moveToFrontBlockStarts[mtfBlockIndexForMove] + mtfOffsetInBlock;
                              mtfPosition = mtfCursor;
                              byteOrBitValue = state.moveToFrontBytes[mtfCursor];
                              L18: while (mtfCursor > state.moveToFrontBlockStarts[mtfBlockIndexForMove]) {
                                state.moveToFrontBytes[mtfCursor] = state.moveToFrontBytes[mtfCursor - 1];
                                mtfCursor--;
                              }
                              state.moveToFrontBlockStarts[mtfBlockIndexForMove] = state.moveToFrontBlockStarts[mtfBlockIndexForMove] + 1;
                              L19: while (mtfBlockIndexForMove > 0) {
                                state.moveToFrontBlockStarts[mtfBlockIndexForMove] = state.moveToFrontBlockStarts[mtfBlockIndexForMove] - 1;
                                state.moveToFrontBytes[state.moveToFrontBlockStarts[mtfBlockIndexForMove]] = state.moveToFrontBytes[state.moveToFrontBlockStarts[mtfBlockIndexForMove - 1] + 16 - 1];
                                mtfBlockIndexForMove--;
                              }
                              state.moveToFrontBlockStarts[0] = state.moveToFrontBlockStarts[0] - 1;
                              state.moveToFrontBytes[state.moveToFrontBlockStarts[0]] = (byte)byteOrBitValue;
                              if (state.moveToFrontBlockStarts[0] != 0) {
                                break L17;
                              }
                              selectorRankOrMtfWritePosition = 4095;
                              for (mtfBlockIndex = 15; mtfBlockIndex >= 0; mtfBlockIndex--) {
                                for (selectorTableOrMtfByteIndex = 15; selectorTableOrMtfByteIndex >= 0; selectorTableOrMtfByteIndex--) {
                                  state.moveToFrontBytes[selectorRankOrMtfWritePosition] = state.moveToFrontBytes[state.moveToFrontBlockStarts[mtfBlockIndex] + selectorTableOrMtfByteIndex];
                                  selectorRankOrMtfWritePosition--;
                                }
                                state.moveToFrontBlockStarts[mtfBlockIndex] = selectorRankOrMtfWritePosition + 1;
                              }
                              break L17;
                            }
                          }
                          frequencyByteValue = state.alphabetBytes[byteOrBitValue & 255] & 255;
                          state.byteFrequencies[frequencyByteValue] = state.byteFrequencies[frequencyByteValue] + 1;
                          kb.bzip2TransformTable[blockLength] = state.alphabetBytes[byteOrBitValue & 255] & 255;
                          blockLength++;
                          if (symbolsRemainingInGroup == 0) {
                            selectorIndex++;
                            symbolsRemainingInGroup = 50;
                            selectedTableIndex = state.huffmanSelectors[selectorIndex];
                            selectedMinimumCodeLength = state.minimumCodeLengths[selectedTableIndex];
                            selectedLimits = state.huffmanLimits[selectedTableIndex];
                            selectedSymbols = state.huffmanSymbols[selectedTableIndex];
                            selectedBases = state.huffmanBases[selectedTableIndex];
                          }
                          symbolsRemainingInGroup--;
                          currentCodeLength = selectedMinimumCodeLength;
                          codeBits = Bzip2Decoder.readBits(currentCodeLength, state);
                          L25: while (codeBits > ((int[]) (selectedLimits))[currentCodeLength]) {
                            currentCodeLength++;
                            nextCodeBit = Bzip2Decoder.readBit(state);
                            codeBits = codeBits << 1 | nextCodeBit;
                          }
                          symbol = ((int[]) (selectedSymbols))[codeBits - ((int[]) (selectedBases))[currentCodeLength]];
                          continue L15;
                        }
                      }
                      runLength = -1;
                      runWeight = 1;
                      L26: while (true) {
                        if (symbol != 0) {
                          if (symbol == 1) {
                            runLength = runLength + 2 * runWeight;
                          }
                        } else {
                          runLength = runLength + 1 * runWeight;
                        }
                        runWeight = runWeight * 2;
                        if (symbolsRemainingInGroup == 0) {
                          selectorIndex++;
                          symbolsRemainingInGroup = 50;
                          selectedTableIndex = state.huffmanSelectors[selectorIndex];
                          selectedMinimumCodeLength = state.minimumCodeLengths[selectedTableIndex];
                          selectedLimits = state.huffmanLimits[selectedTableIndex];
                          selectedSymbols = state.huffmanSymbols[selectedTableIndex];
                          selectedBases = state.huffmanBases[selectedTableIndex];
                        }
                        symbolsRemainingInGroup--;
                        currentCodeLength = selectedMinimumCodeLength;
                        codeBits = Bzip2Decoder.readBits(currentCodeLength, state);
                        L29: while (codeBits > ((int[]) (selectedLimits))[currentCodeLength]) {
                          currentCodeLength++;
                          nextCodeBit = Bzip2Decoder.readBit(state);
                          codeBits = codeBits << 1 | nextCodeBit;
                        }
                        symbol = ((int[]) (selectedSymbols))[codeBits - ((int[]) (selectedBases))[currentCodeLength]];
                        if (symbol == 0) {
                          continue L26;
                        }
                        if (symbol == 1) {
                          continue L26;
                        }
                        runLength++;
                        byteOrBitValue = state.alphabetBytes[state.moveToFrontBytes[state.moveToFrontBlockStarts[0]] & 255];
                        state.byteFrequencies[byteOrBitValue & 255] = state.byteFrequencies[byteOrBitValue & 255] + runLength;
                        L30: while (runLength > 0) {
                          kb.bzip2TransformTable[blockLength] = byteOrBitValue & 255;
                          blockLength++;
                          runLength--;
                        }
                        continue L15;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final static void buildHuffmanTables(int[] limits, int[] bases, int[] symbols, byte[] codeLengths, int minimumLength, int maximumLength, int alphabetSize) {
        int symbolIndex = 0;
        int lengthBucketIndex = 0;
        int symbolWritePosition;
        int tableIndexOrCodeLength;
        int nextCode;
        symbolWritePosition = 0;
        for (tableIndexOrCodeLength = minimumLength; tableIndexOrCodeLength <= maximumLength; tableIndexOrCodeLength++) {
          L7: for (symbolIndex = 0; symbolIndex < alphabetSize; symbolIndex++) {
            if (codeLengths[symbolIndex] != tableIndexOrCodeLength) {
              continue L7;
            }
            symbols[symbolWritePosition] = symbolIndex;
            symbolWritePosition++;
          }
        }
        for (tableIndexOrCodeLength = 0; tableIndexOrCodeLength < 23; tableIndexOrCodeLength++) {
          bases[tableIndexOrCodeLength] = 0;
        }
        for (tableIndexOrCodeLength = 0; tableIndexOrCodeLength < alphabetSize; tableIndexOrCodeLength++) {
          lengthBucketIndex = codeLengths[tableIndexOrCodeLength] + 1;
          bases[lengthBucketIndex] = bases[lengthBucketIndex] + 1;
        }
        for (tableIndexOrCodeLength = 1; tableIndexOrCodeLength < 23; tableIndexOrCodeLength++) {
          bases[tableIndexOrCodeLength] = bases[tableIndexOrCodeLength] + bases[tableIndexOrCodeLength - 1];
        }
        for (tableIndexOrCodeLength = 0; tableIndexOrCodeLength < 23; tableIndexOrCodeLength++) {
          limits[tableIndexOrCodeLength] = 0;
        }
        nextCode = 0;
        for (tableIndexOrCodeLength = minimumLength; tableIndexOrCodeLength <= maximumLength; tableIndexOrCodeLength++) {
          nextCode = nextCode + (bases[tableIndexOrCodeLength + 1] - bases[tableIndexOrCodeLength]);
          limits[tableIndexOrCodeLength] = nextCode - 1;
          nextCode = nextCode << 1;
        }
        for (tableIndexOrCodeLength = minimumLength + 1; tableIndexOrCodeLength <= maximumLength; tableIndexOrCodeLength++) {
          bases[tableIndexOrCodeLength] = (limits[tableIndexOrCodeLength - 1] + 1 << 1) - bases[tableIndexOrCodeLength];
        }
    }

    private final static int readBits(int bitCount, Bzip2DecoderState state) {
        int bitsBeforeReturn;
        L0: while (state.bufferedBitCount < bitCount) {
          state.bitBuffer = state.bitBuffer << 8 | state.inputBytes[state.inputPosition] & 255;
          state.bufferedBitCount = state.bufferedBitCount + 8;
          state.inputPosition = state.inputPosition + 1;
          state.inputBytesRead = state.inputBytesRead + 1;
          if (state.inputBytesRead != 0) {
            continue L0;
          }
        }
        bitsBeforeReturn = state.bitBuffer >> state.bufferedBitCount - bitCount & (1 << bitCount) - 1;
        state.bufferedBitCount = state.bufferedBitCount - bitCount;
        return bitsBeforeReturn;
    }

    private final static byte readBit(Bzip2DecoderState state) {
        return (byte)Bzip2Decoder.readBits(1, state);
    }

    public static void releaseSharedState() {
        decoderState = null;
    }

    private final static void buildByteAlphabet(Bzip2DecoderState state) {
        int byteValue = 0;
        state.alphabetSize = 0;
        L0: for (byteValue = 0; byteValue < 256; byteValue++) {
          if (!state.usedBytes[byteValue]) {
            continue L0;
          }
          state.alphabetBytes[state.alphabetSize] = (byte)byteValue;
          state.alphabetSize = state.alphabetSize + 1;
        }
    }

    final static int decompressInto(byte[] destination, int outputLimitOrBytesWritten, byte[] inputBytes, int ignoredPackedLength, int inputOffset) {
        int bytesWrittenBeforeReturn = 0;
        Throwable unusedThrowableSnapshot = null;
        Object decoderStateMonitor = null;
        decoderStateMonitor = decoderState;
        synchronized (decoderStateMonitor) {
          decoderState.inputBytes = inputBytes;
          decoderState.inputPosition = inputOffset;
          decoderState.outputBytes = destination;
          decoderState.outputPosition = 0;
          decoderState.remainingOutputBytes = outputLimitOrBytesWritten;
          decoderState.bufferedBitCount = 0;
          decoderState.bitBuffer = 0;
          decoderState.inputBytesRead = 0;
          decoderState.outputBytesWritten = 0;
          Bzip2Decoder.decodeBlocks(decoderState);
          outputLimitOrBytesWritten = outputLimitOrBytesWritten - decoderState.remainingOutputBytes;
          decoderState.inputBytes = null;
          decoderState.outputBytes = null;
          bytesWrittenBeforeReturn = outputLimitOrBytesWritten;
        }
        return bytesWrittenBeforeReturn;
    }

    private final static void emitBlockRuns(Bzip2DecoderState state) {
        int nextByteOrRunCount;
        int runByte;
        int remainingRunLength;
        int blockBytesConsumed;
        int currentByte;
        int[] transformTable;
        int transformPositionOrEntry;
        byte[] outputBytes;
        int outputPosition;
        int remainingOutputBytes;
        int initialOutputAllowance;
        int blockEndPosition;
        int previousOutputBytesWritten;
        int[] transformTableAlias;
        int[] sharedTransformTableSnapshot;
        runByte = state.pendingRunByte;
        remainingRunLength = state.pendingRunLength;
        blockBytesConsumed = state.blockBytesConsumed;
        currentByte = state.currentByte;
        sharedTransformTableSnapshot = kb.bzip2TransformTable;
        transformTableAlias = sharedTransformTableSnapshot;
        transformTable = transformTableAlias;
        transformPositionOrEntry = state.transformPositionOrEntry;
        outputBytes = state.outputBytes;
        outputPosition = state.outputPosition;
        remainingOutputBytes = state.remainingOutputBytes;
        initialOutputAllowance = remainingOutputBytes;
        blockEndPosition = state.blockLength + 1;
        L0: while (true) {
          L1: {
            L2: {
              if (remainingRunLength > 0) {
                L3: while (true) {
                  if (remainingOutputBytes == 0) {
                    break L1;
                  }
                  if (remainingRunLength != 1) {
                    outputBytes[outputPosition] = (byte)runByte;
                    remainingRunLength--;
                    outputPosition++;
                    remainingOutputBytes--;
                    continue L3;
                  }
                  if (remainingOutputBytes == 0) {
                    remainingRunLength = 1;
                    break L1;
                  }
                  outputBytes[outputPosition] = (byte)runByte;
                  outputPosition++;
                  remainingOutputBytes--;
                  break L2;
                }
              }
            }
            L5: while (blockBytesConsumed != blockEndPosition) {
              sharedTransformTableSnapshot = transformTableAlias;
              runByte = (byte)currentByte;
              transformPositionOrEntry = sharedTransformTableSnapshot[transformPositionOrEntry];
              nextByteOrRunCount = (byte)transformPositionOrEntry;
              transformPositionOrEntry = transformPositionOrEntry >> 8;
              blockBytesConsumed++;
              if (nextByteOrRunCount == currentByte) {
                if (blockBytesConsumed != blockEndPosition) {
                  remainingRunLength = 2;
                  transformPositionOrEntry = sharedTransformTableSnapshot[transformPositionOrEntry];
                  nextByteOrRunCount = (byte)transformPositionOrEntry;
                  transformPositionOrEntry = transformPositionOrEntry >> 8;
                  blockBytesConsumed++;
                  if (blockBytesConsumed == blockEndPosition) {
                    continue L0;
                  }
                  if (nextByteOrRunCount != currentByte) {
                    currentByte = nextByteOrRunCount;
                    continue L0;
                  }
                  remainingRunLength = 3;
                  transformPositionOrEntry = sharedTransformTableSnapshot[transformPositionOrEntry];
                  nextByteOrRunCount = (byte)transformPositionOrEntry;
                  transformPositionOrEntry = transformPositionOrEntry >> 8;
                  blockBytesConsumed++;
                  if (blockBytesConsumed == blockEndPosition) {
                    continue L0;
                  }
                  if (nextByteOrRunCount != currentByte) {
                    currentByte = nextByteOrRunCount;
                    continue L0;
                  }
                  transformPositionOrEntry = sharedTransformTableSnapshot[transformPositionOrEntry];
                  nextByteOrRunCount = (byte)transformPositionOrEntry;
                  transformPositionOrEntry = transformPositionOrEntry >> 8;
                  blockBytesConsumed++;
                  remainingRunLength = (nextByteOrRunCount & 255) + 4;
                  transformPositionOrEntry = sharedTransformTableSnapshot[transformPositionOrEntry];
                  currentByte = (byte)transformPositionOrEntry;
                  transformPositionOrEntry = transformPositionOrEntry >> 8;
                  blockBytesConsumed++;
                  continue L0;
                }
                if (remainingOutputBytes == 0) {
                  remainingRunLength = 1;
                  break L1;
                }
              } else {
                currentByte = nextByteOrRunCount;
                if (remainingOutputBytes == 0) {
                  remainingRunLength = 1;
                  break L1;
                }
              }
              outputBytes[outputPosition] = (byte)runByte;
              outputPosition++;
              remainingOutputBytes--;
            }
            remainingRunLength = 0;
            break L1;
          }
          previousOutputBytesWritten = state.outputBytesWritten;
          state.outputBytesWritten = state.outputBytesWritten + (initialOutputAllowance - remainingOutputBytes);
          if (state.outputBytesWritten >= previousOutputBytesWritten) {
          }
          state.pendingRunByte = (byte) runByte;
          state.pendingRunLength = remainingRunLength;
          state.blockBytesConsumed = blockBytesConsumed;
          state.currentByte = currentByte;
          kb.bzip2TransformTable = transformTable;
          state.transformPositionOrEntry = transformPositionOrEntry;
          state.outputBytes = outputBytes;
          state.outputPosition = outputPosition;
          state.remainingOutputBytes = remainingOutputBytes;
          return;
        }
    }

    static {
        decoderState = new Bzip2DecoderState();
    }
}
