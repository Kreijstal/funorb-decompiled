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
        int accumulatedId = 0;
        int maximumGroupId = 0;
        int groupOrdinalOrSlotIndex = 0;
        int groupId = 0;
        int actualFileCount = 0;
        int maximumFileIdOrFileSlotIndex = 0;
        int fileOrdinalOrFileId = 0;
        int reconstructedFileId = 0;
        int unusedClientGuardSnapshot = 0;
        byte[] unusedNullPackedBytesSnapshot = null;
        ByteArrayBuffer indexBuffer = null;
        byte[] newGroupDigest = null;
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
            accumulatedId = 0;
            this.groupIds = new int[this.groupCount];
            maximumGroupId = -1;
            if (7 <= formatVersion) {
              for (groupOrdinalOrSlotIndex = 0; groupOrdinalOrSlotIndex < this.groupCount; groupOrdinalOrSlotIndex++) {
                groupIdAfterWideDelta = accumulatedId + indexBuffer.readUnsignedShortOrInt((byte) -27);
                accumulatedId = groupIdAfterWideDelta;
                this.groupIds[groupOrdinalOrSlotIndex] = groupIdAfterWideDelta;
                if (this.groupIds[groupOrdinalOrSlotIndex] > maximumGroupId) {
                  maximumGroupId = this.groupIds[groupOrdinalOrSlotIndex];
                }
              }
            } else {
              for (groupOrdinalOrSlotIndex = 0; this.groupCount > groupOrdinalOrSlotIndex; groupOrdinalOrSlotIndex++) {
                groupIdAfterShortDelta = accumulatedId + indexBuffer.readUnsignedShortBE(true);
                accumulatedId = groupIdAfterShortDelta;
                this.groupIds[groupOrdinalOrSlotIndex] = groupIdAfterShortDelta;
                if (maximumGroupId < this.groupIds[groupOrdinalOrSlotIndex]) {
                  maximumGroupId = this.groupIds[groupOrdinalOrSlotIndex];
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
              for (groupOrdinalOrSlotIndex = 0; this.groupSlotCount > groupOrdinalOrSlotIndex; groupOrdinalOrSlotIndex++) {
                this.groupNameHashes[groupOrdinalOrSlotIndex] = -1;
              }
              for (groupOrdinalOrSlotIndex = 0; groupOrdinalOrSlotIndex < this.groupCount; groupOrdinalOrSlotIndex++) {
                this.groupNameHashes[this.groupIds[groupOrdinalOrSlotIndex]] = indexBuffer.readIntBE((byte) -76);
              }
              this.groupNameLookup = new IntKeyLookup(this.groupNameHashes);
            }
            for (groupOrdinalOrSlotIndex = 0; groupOrdinalOrSlotIndex < this.groupCount; groupOrdinalOrSlotIndex++) {
              this.groupCrc32[this.groupIds[groupOrdinalOrSlotIndex]] = indexBuffer.readIntBE((byte) -95);
            }
            if (hasGroupDigests != 0) {
              for (groupOrdinalOrSlotIndex = 0; this.groupCount > groupOrdinalOrSlotIndex; groupOrdinalOrSlotIndex++) {
                newGroupDigest = new byte[64];
                indexBuffer.readBytes(29915, 64, newGroupDigest, 0);
                this.groupWhirlpoolDigests[this.groupIds[groupOrdinalOrSlotIndex]] = newGroupDigest;
              }
            }
            groupOrdinalOrSlotIndex = 0;
            if (methodGuard < 109) {
              unusedNullPackedBytesSnapshot = (byte[]) null;
              this.decodeIndex((byte) -96, (byte[]) null);
            }
            while (this.groupCount > groupOrdinalOrSlotIndex) {
              this.groupRevisions[this.groupIds[groupOrdinalOrSlotIndex]] = indexBuffer.readIntBE((byte) -110);
              groupOrdinalOrSlotIndex++;
            }
            if (formatVersion >= 7) {
              for (groupOrdinalOrSlotIndex = 0; groupOrdinalOrSlotIndex < this.groupCount; groupOrdinalOrSlotIndex++) {
                this.fileCounts[this.groupIds[groupOrdinalOrSlotIndex]] = indexBuffer.readUnsignedShortOrInt((byte) -27);
              }
              for (groupOrdinalOrSlotIndex = 0; this.groupCount > groupOrdinalOrSlotIndex; groupOrdinalOrSlotIndex++) {
                groupId = this.groupIds[groupOrdinalOrSlotIndex];
                accumulatedId = 0;
                actualFileCount = this.fileCounts[groupId];
                maximumFileIdOrFileSlotIndex = -1;
                newWideFileIds = new int[actualFileCount];
                this.fileIds[groupId] = newWideFileIds;
                for (fileOrdinalOrFileId = 0; actualFileCount > fileOrdinalOrFileId; fileOrdinalOrFileId++) {
                  fileIdAfterWideDelta = accumulatedId + indexBuffer.readUnsignedShortOrInt((byte) -27);
                  accumulatedId = fileIdAfterWideDelta;
                  wideFileIdsForStore = this.fileIds[groupId];
                  wideFileIdsForStore[fileOrdinalOrFileId] = fileIdAfterWideDelta;
                  reconstructedFileId = fileIdAfterWideDelta;
                  if (~maximumFileIdOrFileSlotIndex > ~reconstructedFileId) {
                    maximumFileIdOrFileSlotIndex = reconstructedFileId;
                  }
                }
                this.fileSlotCounts[groupId] = maximumFileIdOrFileSlotIndex + 1;
                if (actualFileCount == 1 + maximumFileIdOrFileSlotIndex) {
                  this.fileIds[groupId] = null;
                }
              }
            } else {
              for (groupOrdinalOrSlotIndex = 0; this.groupCount > groupOrdinalOrSlotIndex; groupOrdinalOrSlotIndex++) {
                this.fileCounts[this.groupIds[groupOrdinalOrSlotIndex]] = indexBuffer.readUnsignedShortBE(true);
              }
              for (groupOrdinalOrSlotIndex = 0; groupOrdinalOrSlotIndex < this.groupCount; groupOrdinalOrSlotIndex++) {
                groupId = this.groupIds[groupOrdinalOrSlotIndex];
                accumulatedId = 0;
                actualFileCount = this.fileCounts[groupId];
                newShortFileIds = new int[actualFileCount];
                this.fileIds[groupId] = newShortFileIds;
                maximumFileIdOrFileSlotIndex = -1;
                for (fileOrdinalOrFileId = 0; actualFileCount > fileOrdinalOrFileId; fileOrdinalOrFileId++) {
                  fileIdAfterShortDelta = accumulatedId + indexBuffer.readUnsignedShortBE(true);
                  accumulatedId = fileIdAfterShortDelta;
                  shortFileIdsForStore = this.fileIds[groupId];
                  shortFileIdsForStore[fileOrdinalOrFileId] = fileIdAfterShortDelta;
                  reconstructedFileId = fileIdAfterShortDelta;
                  if (~maximumFileIdOrFileSlotIndex <= ~reconstructedFileId) {
                    continue;
                  }
                  maximumFileIdOrFileSlotIndex = reconstructedFileId;
                }
                this.fileSlotCounts[groupId] = maximumFileIdOrFileSlotIndex + 1;
                if (actualFileCount == 1 + maximumFileIdOrFileSlotIndex) {
                  this.fileIds[groupId] = null;
                }
              }
            }
            if (hasNameHashes != 0) {
              this.fileNameHashes = new int[maximumGroupId + 1][];
              this.fileNameLookups = new IntKeyLookup[1 + maximumGroupId];
              for (groupOrdinalOrSlotIndex = 0; groupOrdinalOrSlotIndex < this.groupCount; groupOrdinalOrSlotIndex++) {
                groupId = this.groupIds[groupOrdinalOrSlotIndex];
                actualFileCount = this.fileCounts[groupId];
                newFileNameHashSlots = new int[this.fileSlotCounts[groupId]];
                this.fileNameHashes[groupId] = newFileNameHashSlots;
                for (maximumFileIdOrFileSlotIndex = 0; this.fileSlotCounts[groupId] > maximumFileIdOrFileSlotIndex; maximumFileIdOrFileSlotIndex++) {
                  this.fileNameHashes[groupId][maximumFileIdOrFileSlotIndex] = -1;
                }
                for (maximumFileIdOrFileSlotIndex = 0; maximumFileIdOrFileSlotIndex < actualFileCount; maximumFileIdOrFileSlotIndex++) {
                  if (this.fileIds[groupId] != null) {
                    fileOrdinalOrFileId = this.fileIds[groupId][maximumFileIdOrFileSlotIndex];
                  } else {
                    fileOrdinalOrFileId = maximumFileIdOrFileSlotIndex;
                  }
                  this.fileNameHashes[groupId][fileOrdinalOrFileId] = indexBuffer.readIntBE((byte) -78);
                }
                this.fileNameLookups[groupId] = new IntKeyLookup(this.fileNameHashes[groupId]);
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
        PacketBuffer var7 = null;
        PacketBuffer var8 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = Geoblox.clientControlFlowFlag;
        try {
            var7 = CacheReference.outgoingSessionBuffer;
            var8 = var7;
            var8.writeCipherByte(packetOpcode, (byte) -125);
            var8.position = var8.position + 1;
            var4 = var8.position;
            var8.writeByte((byte) 122, 1);
            var8.writeShortBE(submission.submissionId, 28695);
            var8.writeShortBE(submission.firstShortValue, 28695);
            var8.writeShortBE(submission.secondShortValue, 28695);
            var8.writeIntBE((byte) 95, submission.firstContextValue);
            var8.writeIntBE((byte) 95, submission.secondContextValue);
            var8.writeIntBE((byte) 95, submission.thirdContextValue);
            if (methodGuard > -126) {
                maximumPasswordLength = 61;
            }
            var8.writeIntBE((byte) 95, submission.fourthContextValue);
            var8.writeByte((byte) 126, submission.scores.length);
            for (var5 = 0; var5 < submission.scores.length; var5++) {
                var7.writeIntBE((byte) 95, submission.scores[var5]);
            }
            var8.appendCrc32(78, var4);
            var8.backpatchLengthByte(11700, -var4 + var8.position);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "bm.C(" + (submission != null ? "{...}" : "null") + ',' + packetOpcode + ',' + methodGuard + ')');
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
