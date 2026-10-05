/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class NanoFrameTimer extends FrameTimer {
    private long accumulatedTimeNanos;
    static String checkingText;
    private long lastSampleTimeNanos;
    private int intervalSampleCount;
    private long[] intervalSamplesNanos;
    private int nextSampleIndex;
    static int[] decodedSpritePalette;
    private long scheduledTickNanos;

    final static void handleRankingResponse(int methodGuard) {
        int nameIndex = 0;
        String[][] allocatedNamesByView = null;
        int[][] allocatedValuesByView = null;
        int recordIndex = 0;
        int allValueIndexBeforeIncrement = 0;
        int selfValueIndexBeforeIncrement = 0;
        int uniqueValueIndexBeforeIncrement = 0;
        RuntimeException caughtRankingFailure = null;
        RuntimeException rankingFailure = null;
        int responseKind = 0;
        int queryOrSubmissionId = 0;
        HighscoreQuery query = null;
        ScoreSubmission submission = null;
        int nameCount = 0;
        int entryLimit = 0;
        int valuesPerEntry = 0;
        String[][] namesByView = null;
        String[][] alternateNamesByView = null;
        int[][] valuesByView = null;
        int allViewCount = 0;
        int selfViewCount = 0;
        int uniqueViewCount = 0;
        int allValueWriteIndex = 0;
        int selfValueWriteIndex = 0;
        int uniqueValueWriteIndex = 0;
        int recordCount = 0;
        int nameTableIndex = 0;
        String primaryName = null;
        long recordLongValue = 0L;
        int valuesStartPosition = 0;
        int valueIndex = 0;
        int clientControlFlowSnapshot = 0;
        PacketBuffer packet = null;
        long[][] recordLongsByView = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != -24839) {
            NanoFrameTimer.releaseSharedResources(false);
          }
          packet = LogoCompositor.sessionPacketBuffer;
          responseKind = packet.readUnsignedByte((byte) 34);
          if (responseKind == 0) {
            queryOrSubmissionId = packet.readUnsignedShortBE(true);
            query = (HighscoreQuery) ((Object) ResourceArchive.pendingHighscoreQueries.firstForIteration(0));
            while (query != null) {
              if (query.queryId != queryOrSubmissionId) {
                query = (HighscoreQuery) ((Object) ResourceArchive.pendingHighscoreQueries.nextForIteration(1));
                continue;
              }
              break;
            }
            if (query == null) {
              Bzip2DecoderState.closeSessionSocket((byte) -115);
              return;
            }
            nameCount = packet.readUnsignedByte((byte) 34);
            if (nameCount != 0) {
              entryLimit = query.entryLimit;
              valuesPerEntry = query.valuesPerEntry;
              RasterTargetRestoreSupport.highscoreNameTable[0].usedInUniqueView = false;
              RasterTargetRestoreSupport.highscoreNameTable[0].primaryName = SecondaryDeque.receivedSessionName;
              RasterTargetRestoreSupport.highscoreNameTable[0].alternateName = null;
              for (nameIndex = 1; nameCount > nameIndex; nameIndex++) {
                RasterTargetRestoreSupport.highscoreNameTable[nameIndex].primaryName = packet.readNullTerminatedText((byte) 104);
                RasterTargetRestoreSupport.highscoreNameTable[nameIndex].usedInUniqueView = false;
                if (packet.readUnsignedByte((byte) 34) == 1) {
                  RasterTargetRestoreSupport.highscoreNameTable[nameIndex].alternateName = packet.readNullTerminatedText((byte) 122);
                } else {
                  RasterTargetRestoreSupport.highscoreNameTable[nameIndex].alternateName = null;
                }
              }
              allocatedNamesByView = new String[3][entryLimit];
              query.namesByView = allocatedNamesByView;
              namesByView = allocatedNamesByView;
              alternateNamesByView = new String[3][entryLimit];
              recordLongsByView = new long[3][entryLimit];
              allocatedValuesByView = new int[3][entryLimit * valuesPerEntry];
              query.valuesByView = allocatedValuesByView;
              valuesByView = allocatedValuesByView;
              allViewCount = 0;
              selfViewCount = 0;
              uniqueViewCount = 0;
              allValueWriteIndex = 0;
              selfValueWriteIndex = 0;
              uniqueValueWriteIndex = 0;
              recordCount = packet.readUnsignedByte((byte) 34);
              if (0 < recordCount) {
                for (recordIndex = 0; recordIndex < recordCount; recordIndex++) {
                  nameTableIndex = packet.readUnsignedByte((byte) 34);
                  primaryName = RasterTargetRestoreSupport.highscoreNameTable[nameTableIndex].primaryName;
                  recordLongValue = packet.readLongBE(2901);
                  valuesStartPosition = packet.position;
                  if (entryLimit > recordIndex) {
                    namesByView[0][allViewCount] = primaryName;
                    alternateNamesByView[0][allViewCount] = RasterTargetRestoreSupport.highscoreNameTable[nameTableIndex].alternateName;
                    recordLongsByView[0][allViewCount] = recordLongValue;
                    for (valueIndex = 0; valueIndex < valuesPerEntry; valueIndex++) {
                      allValueIndexBeforeIncrement = allValueWriteIndex;
                      allValueWriteIndex++;
                      valuesByView[0][allValueIndexBeforeIncrement] = packet.readIntBE((byte) -76);
                    }
                    allViewCount++;
                  }
                  if (primaryName != null &&
                      WhirlpoolHash.matchesNormalizedSessionName(primaryName, (byte) 12)) {
                    namesByView[1][selfViewCount] = SecondaryDeque.receivedSessionName;
                    alternateNamesByView[1][selfViewCount] = null;
                    recordLongsByView[1][selfViewCount] = recordLongValue;
                    selfViewCount++;
                    packet.position = valuesStartPosition;
                    for (valueIndex = 0; valueIndex < valuesPerEntry; valueIndex++) {
                      selfValueIndexBeforeIncrement = selfValueWriteIndex;
                      selfValueWriteIndex++;
                      valuesByView[1][selfValueIndexBeforeIncrement] = packet.readIntBE((byte) -122);
                    }
                  }
                  if (uniqueViewCount < entryLimit &&
                      !RasterTargetRestoreSupport.highscoreNameTable[nameTableIndex].usedInUniqueView) {
                    RasterTargetRestoreSupport.highscoreNameTable[nameTableIndex].usedInUniqueView = true;
                    namesByView[2][uniqueViewCount] = primaryName;
                    alternateNamesByView[2][uniqueViewCount] = RasterTargetRestoreSupport.highscoreNameTable[nameTableIndex].alternateName;
                    recordLongsByView[2][uniqueViewCount] = recordLongValue;
                    uniqueViewCount++;
                    packet.position = valuesStartPosition;
                    for (valueIndex = 0; valuesPerEntry > valueIndex; valueIndex++) {
                      uniqueValueIndexBeforeIncrement = uniqueValueWriteIndex;
                      uniqueValueWriteIndex++;
                      valuesByView[2][uniqueValueIndexBeforeIncrement] = packet.readIntBE((byte) -101);
                    }
                  }
                }
              }
            }
            query.completed = true;
            query.unlinkNode(false);
            return;
          }
          if (1 == responseKind) {
            queryOrSubmissionId = packet.readUnsignedShortBE(true);
            packet.readLongBE(methodGuard + 27740);
            submission = (ScoreSubmission) ((Object) TriangleMesh.pendingScoreSubmissions.firstForIteration(0));
            while (submission != null) {
              if (queryOrSubmissionId != submission.submissionId) {
                submission = (ScoreSubmission) ((Object) TriangleMesh.pendingScoreSubmissions.nextForIteration(1));
                continue;
              }
              break;
            }
            if (submission != null) {
              submission.unlinkNode(false);
              return;
            }
            Bzip2DecoderState.closeSessionSocket((byte) -117);
            return;
          }
          IterableNodeHashTable.reportClientError((Throwable) null, "HS1: " + TextTemplateDefinition.formatSessionPacketDiagnostic(methodGuard + 24894), (byte) 125);
          Bzip2DecoderState.closeSessionSocket((byte) -117);
          return;
        } catch (java.lang.RuntimeException rankingException) {
          caughtRankingFailure = rankingException;
          rankingFailure = caughtRankingFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) rankingFailure), "cm.F(" + methodGuard + ')');
        }
    }

    public static void releaseSharedResources(boolean clearAgain) {
        decodedSpritePalette = null;
        if (clearAgain) {
            NanoFrameTimer.releaseSharedResources(false);
        }
        checkingText = null;
    }

    final static void flushSessionWrites(int flushGuard, int keepaliveOpcode) {
        try {
            IOException writeFailure = null;
            Throwable caughtWriteFailure = null;
            if (null != SpriteCheckboxRenderer.sessionSocket) {
              if (keepaliveOpcode < 0 ||
                  PacketBuffer.currentProtocolStage == LogoCompositor.connectedSessionStage) {
                if (0 == CacheReference.outgoingSessionBuffer.position &&
                    ~ClientClockSupport.correctedCurrentTimeMillis(-12520) < ~(10000L + CanvasResizeController.lastSessionSocketWriteMillis)) {
                  CacheReference.outgoingSessionBuffer.writeCipherByte(keepaliveOpcode, (byte) -76);
                }
                if (flushGuard > ~CacheReference.outgoingSessionBuffer.position) {
                  try {
                    SpriteCheckboxRenderer.sessionSocket.enqueueWrite(100, 0, CacheReference.outgoingSessionBuffer.position, CacheReference.outgoingSessionBuffer.bytes);
                    CanvasResizeController.lastSessionSocketWriteMillis = ClientClockSupport.correctedCurrentTimeMillis(-12520);
                  } catch (java.io.IOException writeException) {
                    caughtWriteFailure = writeException;
                    writeFailure = (IOException) (Object) caughtWriteFailure;
                    Bzip2DecoderState.closeSessionSocket((byte) -117);
                  }
                  CacheReference.outgoingSessionBuffer.position = 0;
                }
                return;
              }
            }
            CacheReference.outgoingSessionBuffer.position = 0;
        } catch (RuntimeException | Error uncheckedFlushFailure) {
            throw uncheckedFlushFailure;
        } catch (Throwable checkedFlushFailure) {
            throw new RuntimeException(checkedFlushFailure);
        }
    }

    final void resetForResume(int methodGuard) {
        if (~this.accumulatedTimeNanos > ~this.scheduledTickNanos) {
            this.accumulatedTimeNanos = this.accumulatedTimeNanos + (this.scheduledTickNanos - this.accumulatedTimeNanos);
        }
        if (methodGuard < 60) {
            return;
        }
        this.lastSampleTimeNanos = 0L;
    }

    final int advanceTicks(boolean methodGuard, long tickPeriodNanos) {
        int tickCount;
        int clientControlFlowSnapshot;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        if (!methodGuard) {
          NanoFrameTimer.releaseSharedResources(true);
        }
        if (this.scheduledTickNanos > this.accumulatedTimeNanos) {
          this.lastSampleTimeNanos = this.lastSampleTimeNanos + (-this.accumulatedTimeNanos + this.scheduledTickNanos);
          this.accumulatedTimeNanos = this.accumulatedTimeNanos + (-this.accumulatedTimeNanos + this.scheduledTickNanos);
          this.scheduledTickNanos = this.scheduledTickNanos + tickPeriodNanos;
          return 1;
        }
        tickCount = 0;
        do {
          tickCount++;
          this.scheduledTickNanos = this.scheduledTickNanos + tickPeriodNanos;
        } while (tickCount < 10 &&
              ~this.scheduledTickNanos > ~this.accumulatedTimeNanos);
        if (this.accumulatedTimeNanos > this.scheduledTickNanos) {
          this.scheduledTickNanos = this.accumulatedTimeNanos;
        }
        return tickCount;
    }

    private final long sampleAverageIntervalNanos(int initialSumNanos) {
        int sampleOffset = 0;
        int clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        long sampleTimeNanos = System.nanoTime();
        long elapsedNanos = -this.lastSampleTimeNanos + sampleTimeNanos;
        this.lastSampleTimeNanos = sampleTimeNanos;
        if (-5000000000L < elapsedNanos &&
            5000000000L > elapsedNanos) {
            this.intervalSamplesNanos[this.nextSampleIndex] = elapsedNanos;
            if (this.intervalSampleCount < 1) {
                this.intervalSampleCount = this.intervalSampleCount + 1;
            }
            this.nextSampleIndex = (this.nextSampleIndex + 1) % 10;
        }
        long intervalSumNanos = (long)initialSumNanos;
        for (sampleOffset = 1; sampleOffset <= this.intervalSampleCount; sampleOffset++) {
            intervalSumNanos = intervalSumNanos + this.intervalSamplesNanos[(-sampleOffset + (this.nextSampleIndex + 10)) % 10];
        }
        return intervalSumNanos / (long)this.intervalSampleCount;
    }

    final long measureSleepMillis(byte methodGuard) {
        this.accumulatedTimeNanos = this.accumulatedTimeNanos + this.sampleAverageIntervalNanos(0);
        if (methodGuard != -49) {
            this.advanceTicks(false, 97L);
        }
        if (~this.scheduledTickNanos < ~this.accumulatedTimeNanos) {
            return (this.scheduledTickNanos - this.accumulatedTimeNanos) / 1000000L;
        }
        return 0L;
    }

    NanoFrameTimer() {
        this.intervalSampleCount = 1;
        this.intervalSamplesNanos = new long[10];
        this.nextSampleIndex = 0;
        this.lastSampleTimeNanos = 0L;
        this.accumulatedTimeNanos = 0L;
        this.scheduledTickNanos = 0L;
        this.accumulatedTimeNanos = System.nanoTime();
        this.scheduledTickNanos = System.nanoTime();
    }

    static {
        checkingText = "Checking";
    }
}
