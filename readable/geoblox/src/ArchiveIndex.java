/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveIndex {
    static String createAgreeTermsText;
    private int groupCount;
    int indexRevision;
    int indexCrc32;
    int[] groupCrc32;
    int groupSlotCount;
    int[] fileSlotCounts;
    private byte[] indexWhirlpoolDigest;
    static int maximumPasswordLength;
    byte[][] groupWhirlpoolDigests;
    private int[][] fileNameHashes;
    int[] groupIds;
    int[][] fileIds;
    IntKeyLookup[] fileNameLookups;
    int[] groupRevisions;
    private int[] groupNameHashes;
    IntKeyLookup groupNameLookup;
    static int receivedRecordMetadataByte;
    static int archiveServerNumber;
    static TriangleMesh[] logoMeshes;
    int[] fileCounts;

    final static int[] buildLogoRotationTransform(int xAngle8192, byte methodGuard, int yAngle8192) {
        int sinXQ16 = DelegatingCanvas.sineQ16((byte) 69, xAngle8192);
        int cosXQ16 = IntrusiveNodeHashTable.cosineQ16(xAngle8192, 2048);
        int sinYQ16 = DelegatingCanvas.sineQ16((byte) 101, yAngle8192);
        int cosYQ16 = IntrusiveNodeHashTable.cosineQ16(yAngle8192, 2048);
        int sinXsinYQ16 = (int)((long)sinXQ16 * (long)sinYQ16 >> 16);
        int sinXcosYQ16 = (int)((long)cosYQ16 * (long)sinXQ16 >> 16);
        int cosXsinYQ16 = (int)((long)cosXQ16 * (long)sinYQ16 >> 16);
        int cosXcosYQ16 = (int)((long)cosYQ16 * (long)cosXQ16 >> 16);
        if (methodGuard > -65) {
            return (int[]) null;
        }
        return new int[]{0, 0, 0, cosYQ16, 0, sinYQ16, sinXsinYQ16, cosXQ16, -sinXcosYQ16, -cosXsinYQ16, sinXQ16, cosXcosYQ16};
    }

    private final void decodeIndex(byte methodGuard, byte[] packedIndexBytes) {
        int groupIdAfterWideDelta = 0;
        int groupIdAfterShortDelta = 0;
        int[] newWideFileIds = null;
        int fileIdAfterWideDelta = 0;
        int[] wideFileIdsForStore = null;
        int[] newShortFileIds = null;
        int fileIdAfterShortDelta = 0;
        int[] shortFileIdsForStore = null;
        int[] newFileNameHashSlots = null;
        int hasNameHashesSnapshot = 0;
        int hasGroupDigestsSnapshot = 0;
        RuntimeException indexFailureBeforeContext = null;
        StringBuilder indexMessagePrefix = null;
        String packedBytesDescription = null;
        RuntimeException caughtIndexFailure = null;
        RuntimeException indexFailureForContext = null;
        int formatVersion = 0;
        int formatFlags = 0;
        int hasNameHashes = 0;
        int hasGroupDigests = 0;
        int accumulatedGroupId = 0;
        int maximumGroupId = 0;
        int groupIdOrdinal = 0;
        int fileIdGroupId = 0;
        int fileIdCount = 0;
        int maximumFileId = 0;
        int fileIdOrdinal = 0;
        int reconstructedFileId = 0;
        int unusedClientGuardSnapshot = 0;
        byte[] unusedNullPackedBytesSnapshot = null;
        ByteArrayBuffer indexBuffer = null;
        byte[] newGroupDigest = null;
        int accumulatedFileId;
        int groupNameHashSlotIndex;
        int groupCrcOrdinal;
        int groupDigestOrdinal;
        int groupRevisionOrdinal;
        int fileMetadataGroupOrdinal;
        int fileNameGroupOrdinal;
        int fileNameHashSlotIndex;
        int namedFileId;
        int fileNameGroupId;
        int namedFileCount;
        int groupNameHashOrdinal;
        int namedFileOrdinal;
        unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
        try {
          indexBuffer = new ByteArrayBuffer(CanvasResizeController.decompressArchive(packedIndexBytes, -1));
          formatVersion = indexBuffer.readUnsignedByte((byte) 34);
          if (5 <= formatVersion &&
              formatVersion <= 7) {
            if (formatVersion < 6) {
              this.indexRevision = 0;
            } else {
              this.indexRevision = indexBuffer.readIntBE((byte) -121);
            }
            formatFlags = indexBuffer.readUnsignedByte((byte) 34);
            hasNameHashesSnapshot = (0 == (1 & formatFlags)) ? 0 : 1;
            hasNameHashes = hasNameHashesSnapshot;
            hasGroupDigestsSnapshot = ((2 & formatFlags) == 0) ? 0 : 1;
            hasGroupDigests = hasGroupDigestsSnapshot;
            if (formatVersion >= 7) {
              this.groupCount = indexBuffer.readUnsignedShortOrInt((byte) -27);
            } else {
              this.groupCount = indexBuffer.readUnsignedShortBE(true);
            }
            accumulatedGroupId = 0;
            this.groupIds = new int[this.groupCount];
            maximumGroupId = -1;
            if (7 <= formatVersion) {
              for (groupIdOrdinal = 0; groupIdOrdinal < this.groupCount; groupIdOrdinal++) {
                groupIdAfterWideDelta = accumulatedGroupId + indexBuffer.readUnsignedShortOrInt((byte) -27);
                accumulatedGroupId = groupIdAfterWideDelta;
                this.groupIds[groupIdOrdinal] = groupIdAfterWideDelta;
                if (this.groupIds[groupIdOrdinal] > maximumGroupId) {
                  maximumGroupId = this.groupIds[groupIdOrdinal];
                }
              }
            } else {
              for (groupIdOrdinal = 0; this.groupCount > groupIdOrdinal; groupIdOrdinal++) {
                groupIdAfterShortDelta = accumulatedGroupId + indexBuffer.readUnsignedShortBE(true);
                accumulatedGroupId = groupIdAfterShortDelta;
                this.groupIds[groupIdOrdinal] = groupIdAfterShortDelta;
                if (maximumGroupId < this.groupIds[groupIdOrdinal]) {
                  maximumGroupId = this.groupIds[groupIdOrdinal];
                }
              }
            }
            this.groupSlotCount = 1 + maximumGroupId;
            if (hasGroupDigests != 0) {
              this.groupWhirlpoolDigests = new byte[this.groupSlotCount][];
            }
            this.groupCrc32 = new int[this.groupSlotCount];
            this.fileCounts = new int[this.groupSlotCount];
            this.groupRevisions = new int[this.groupSlotCount];
            this.fileSlotCounts = new int[this.groupSlotCount];
            this.fileIds = new int[this.groupSlotCount][];
            if (hasNameHashes != 0) {
              this.groupNameHashes = new int[this.groupSlotCount];
              for (groupNameHashSlotIndex = 0; this.groupSlotCount > groupNameHashSlotIndex; groupNameHashSlotIndex++) {
                this.groupNameHashes[groupNameHashSlotIndex] = -1;
              }
              for (groupNameHashOrdinal = 0; groupNameHashOrdinal < this.groupCount; groupNameHashOrdinal++) {
                this.groupNameHashes[this.groupIds[groupNameHashOrdinal]] = indexBuffer.readIntBE((byte) -76);
              }
              this.groupNameLookup = new IntKeyLookup(this.groupNameHashes);
            }
            for (groupCrcOrdinal = 0; groupCrcOrdinal < this.groupCount; groupCrcOrdinal++) {
              this.groupCrc32[this.groupIds[groupCrcOrdinal]] = indexBuffer.readIntBE((byte) -95);
            }
            if (hasGroupDigests != 0) {
              for (groupDigestOrdinal = 0; this.groupCount > groupDigestOrdinal; groupDigestOrdinal++) {
                newGroupDigest = new byte[64];
                indexBuffer.readBytes(29915, 64, newGroupDigest, 0);
                this.groupWhirlpoolDigests[this.groupIds[groupDigestOrdinal]] = newGroupDigest;
              }
            }
            groupRevisionOrdinal = 0;
            if (methodGuard < 109) {
              unusedNullPackedBytesSnapshot = (byte[]) null;
              this.decodeIndex((byte) -96, (byte[]) null);
            }
            while (this.groupCount > groupRevisionOrdinal) {
              this.groupRevisions[this.groupIds[groupRevisionOrdinal]] = indexBuffer.readIntBE((byte) -110);
              groupRevisionOrdinal++;
            }
            if (formatVersion >= 7) {
              for (fileMetadataGroupOrdinal = 0; fileMetadataGroupOrdinal < this.groupCount; fileMetadataGroupOrdinal++) {
                this.fileCounts[this.groupIds[fileMetadataGroupOrdinal]] = indexBuffer.readUnsignedShortOrInt((byte) -27);
              }
              for (fileMetadataGroupOrdinal = 0; this.groupCount > fileMetadataGroupOrdinal; fileMetadataGroupOrdinal++) {
                fileIdGroupId = this.groupIds[fileMetadataGroupOrdinal];
                accumulatedFileId = 0;
                fileIdCount = this.fileCounts[fileIdGroupId];
                maximumFileId = -1;
                newWideFileIds = new int[fileIdCount];
                this.fileIds[fileIdGroupId] = newWideFileIds;
                for (fileIdOrdinal = 0; fileIdCount > fileIdOrdinal; fileIdOrdinal++) {
                  fileIdAfterWideDelta = accumulatedFileId + indexBuffer.readUnsignedShortOrInt((byte) -27);
                  accumulatedFileId = fileIdAfterWideDelta;
                  wideFileIdsForStore = this.fileIds[fileIdGroupId];
                  wideFileIdsForStore[fileIdOrdinal] = fileIdAfterWideDelta;
                  reconstructedFileId = fileIdAfterWideDelta;
                  if (maximumFileId < reconstructedFileId) {
                    maximumFileId = reconstructedFileId;
                  }
                }
                this.fileSlotCounts[fileIdGroupId] = maximumFileId + 1;
                if (fileIdCount == 1 + maximumFileId) {
                  this.fileIds[fileIdGroupId] = null;
                }
              }
            } else {
              for (fileMetadataGroupOrdinal = 0; this.groupCount > fileMetadataGroupOrdinal; fileMetadataGroupOrdinal++) {
                this.fileCounts[this.groupIds[fileMetadataGroupOrdinal]] = indexBuffer.readUnsignedShortBE(true);
              }
              for (fileMetadataGroupOrdinal = 0; fileMetadataGroupOrdinal < this.groupCount; fileMetadataGroupOrdinal++) {
                fileIdGroupId = this.groupIds[fileMetadataGroupOrdinal];
                accumulatedFileId = 0;
                fileIdCount = this.fileCounts[fileIdGroupId];
                newShortFileIds = new int[fileIdCount];
                this.fileIds[fileIdGroupId] = newShortFileIds;
                maximumFileId = -1;
                for (fileIdOrdinal = 0; fileIdCount > fileIdOrdinal; fileIdOrdinal++) {
                  fileIdAfterShortDelta = accumulatedFileId + indexBuffer.readUnsignedShortBE(true);
                  accumulatedFileId = fileIdAfterShortDelta;
                  shortFileIdsForStore = this.fileIds[fileIdGroupId];
                  shortFileIdsForStore[fileIdOrdinal] = fileIdAfterShortDelta;
                  reconstructedFileId = fileIdAfterShortDelta;
                  if (maximumFileId >= reconstructedFileId) {
                    continue;
                  }
                  maximumFileId = reconstructedFileId;
                }
                this.fileSlotCounts[fileIdGroupId] = maximumFileId + 1;
                if (fileIdCount == 1 + maximumFileId) {
                  this.fileIds[fileIdGroupId] = null;
                }
              }
            }
            if (hasNameHashes != 0) {
              this.fileNameHashes = new int[maximumGroupId + 1][];
              this.fileNameLookups = new IntKeyLookup[1 + maximumGroupId];
              for (fileNameGroupOrdinal = 0; fileNameGroupOrdinal < this.groupCount; fileNameGroupOrdinal++) {
                fileNameGroupId = this.groupIds[fileNameGroupOrdinal];
                namedFileCount = this.fileCounts[fileNameGroupId];
                newFileNameHashSlots = new int[this.fileSlotCounts[fileNameGroupId]];
                this.fileNameHashes[fileNameGroupId] = newFileNameHashSlots;
                for (fileNameHashSlotIndex = 0; this.fileSlotCounts[fileNameGroupId] > fileNameHashSlotIndex; fileNameHashSlotIndex++) {
                  this.fileNameHashes[fileNameGroupId][fileNameHashSlotIndex] = -1;
                }
                for (namedFileOrdinal = 0; namedFileOrdinal < namedFileCount; namedFileOrdinal++) {
                  if (this.fileIds[fileNameGroupId] != null) {
                    namedFileId = this.fileIds[fileNameGroupId][namedFileOrdinal];
                  } else {
                    namedFileId = namedFileOrdinal;
                  }
                  this.fileNameHashes[fileNameGroupId][namedFileId] = indexBuffer.readIntBE((byte) -78);
                }
                this.fileNameLookups[fileNameGroupId] = new IntKeyLookup(this.fileNameHashes[fileNameGroupId]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException indexFailure) {
          caughtIndexFailure = indexFailure;
          indexFailureForContext = caughtIndexFailure;
          indexFailureBeforeContext = indexFailureForContext;
          indexMessagePrefix = new StringBuilder().append("bm.A(").append(methodGuard).append(',');
          if (packedIndexBytes == null) {
            packedBytesDescription = "null";
          } else {
            packedBytesDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) indexFailureBeforeContext), ((StringBuilder) (Object) indexMessagePrefix).append(packedBytesDescription).append(')').toString());
        }
    }

    final static void writeScoreSubmission(ScoreSubmission submission, int packetOpcode, int methodGuard) {
        PacketBuffer outgoingBufferForScores = null;
        PacketBuffer outgoingBufferForHeader = null;
        int payloadStart = 0;
        int scoreIndex = 0;
        int clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
            outgoingBufferForScores = CacheReference.outgoingSessionBuffer;
            outgoingBufferForHeader = outgoingBufferForScores;
            outgoingBufferForHeader.writeCipherByte(packetOpcode, (byte) -125);
            outgoingBufferForHeader.position = outgoingBufferForHeader.position + 1;
            payloadStart = outgoingBufferForHeader.position;
            outgoingBufferForHeader.writeByte((byte) 122, 1);
            outgoingBufferForHeader.writeShortBE(submission.submissionId, 28695);
            outgoingBufferForHeader.writeShortBE(submission.firstShortValue, 28695);
            outgoingBufferForHeader.writeShortBE(submission.secondShortValue, 28695);
            outgoingBufferForHeader.writeIntBE((byte) 95, submission.firstContextValue);
            outgoingBufferForHeader.writeIntBE((byte) 95, submission.secondContextValue);
            outgoingBufferForHeader.writeIntBE((byte) 95, submission.thirdContextValue);
            if (methodGuard > -126) {
                maximumPasswordLength = 61;
            }
            outgoingBufferForHeader.writeIntBE((byte) 95, submission.fourthContextValue);
            outgoingBufferForHeader.writeByte((byte) 126, submission.scores.length);
            for (scoreIndex = 0; scoreIndex < submission.scores.length; scoreIndex++) {
                outgoingBufferForScores.writeIntBE((byte) 95, submission.scores[scoreIndex]);
            }
            outgoingBufferForHeader.appendCrc32(78, payloadStart);
            outgoingBufferForHeader.backpatchLengthByte(11700, -payloadStart + outgoingBufferForHeader.position);
        } catch (RuntimeException submissionWriteFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) submissionWriteFailure), "bm.C(" + (submission != null ? "{...}" : "null") + ',' + packetOpcode + ',' + methodGuard + ')');
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        logoMeshes = null;
        createAgreeTermsText = null;
        int guardRemainder = -24 % ((methodGuard + 88) / 36);
    }

    ArchiveIndex(byte[] packedIndexBytes, int expectedCrc32, byte[] expectedWhirlpoolDigest) {
        int digestByteIndex = 0;
        try {
            this.indexCrc32 = NameCharacterSupport.computePrefixCrc32(packedIndexBytes, 107, packedIndexBytes.length);
            if (expectedCrc32 != this.indexCrc32) {
                throw new RuntimeException();
            }
            if (expectedWhirlpoolDigest != null) {
                if (expectedWhirlpoolDigest.length != 64) {
                    throw new RuntimeException();
                }
                this.indexWhirlpoolDigest = SpriteState.computeWhirlpoolDigest(packedIndexBytes.length, 0, packedIndexBytes, 8);
                for (digestByteIndex = 0; 64 > digestByteIndex; digestByteIndex++) {
                    if (this.indexWhirlpoolDigest[digestByteIndex] != expectedWhirlpoolDigest[digestByteIndex]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.decodeIndex((byte) 119, packedIndexBytes);
        } catch (RuntimeException constructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) constructionFailure), "bm.<init>(" + (packedIndexBytes != null ? "{...}" : "null") + ',' + expectedCrc32 + ',' + (expectedWhirlpoolDigest != null ? "{...}" : "null") + ')');
        }
    }

    static {
        createAgreeTermsText = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        maximumPasswordLength = 20;
    }
}
