/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ResourceArchive {
    static String accountCreationEmail;
    private Object[][] decodedFiles;
    static IntrusiveDeque unacknowledgedAchievementSubmissions;
    private ArchiveIndex index;
    private boolean discardPackedGroups;
    private Object[] packedGroups;
    static IntrusiveDeque pendingHighscoreQueries;
    private ArchiveSource archiveSource;
    private int fileRetentionPolicy;
    static String createUsernameUnavailableText;

    final int getGroupSlotCount(boolean returnGuardConstant) {
        if (!this.ensureIndexLoaded(0)) {
            return -1;
        }
        if (returnGuardConstant) {
            return 84;
        }
        return this.index.fileSlotCounts.length;
    }

    final static void updateAttachedEntities(byte methodGuard) {
        int lowRadiusFeedbackMode = 0;
        RuntimeException caughtAttachedUpdateFailure = null;
        float maximumEntityRadiusSquared = 0.0f;
        RuntimeException attachedUpdateFailureForContext = null;
        GameplayEntity attachedEntity = null;
        int clientControlFlowGuard = 0;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard <= 93) {
            ResourceArchive.updateAttachedEntities((byte) 28);
          }
          maximumEntityRadiusSquared = 0.0f;
          attachedEntity = (GameplayEntity) ((Object) BoardEntityState.attachedEntities.firstForIteration(0));
          while (attachedEntity != null) {
            attachedEntity.matchCooldownTicks = attachedEntity.matchCooldownTicks - 1;
            if (attachedEntity.matchCooldownTicks == 0) {
              EntityMotionSupport.boardContactStateDirty = true;
            }
            if (null == attachedEntity.entityQueue) {
              attachedEntity.advanceEntityAnimation(true);
              if (3 == attachedEntity.entitySpriteKindId &&
                  attachedEntity.touchesAvatar &&
                  0 >= attachedEntity.matchCooldownTicks) {
                SessionSocketSupport.avatarShockPending = true;
              }
              if (maximumEntityRadiusSquared < (attachedEntity.positionX - 320.0f) * (-320.0f + attachedEntity.positionX) + (attachedEntity.positionY - 240.0f) * (attachedEntity.positionY - 240.0f)) {
                maximumEntityRadiusSquared = (-240.0f + attachedEntity.positionY) * (-240.0f + attachedEntity.positionY) + (-320.0f + attachedEntity.positionX) * (-320.0f + attachedEntity.positionX);
              }
            }
            attachedEntity = (GameplayEntity) ((Object) BoardEntityState.attachedEntities.nextForIteration(1));
          }
          CrcAcknowledgedPacket.requestAvatarTintForRadius(maximumEntityRadiusSquared, (byte) 14);
          if (10000.0f > maximumEntityRadiusSquared) {
            lowRadiusFeedbackMode = 0;
            AvatarFeedbackSupport.requestAvatarFeedback(lowRadiusFeedbackMode, false);
          } else {
            if (!(25600.0f > maximumEntityRadiusSquared)) {
              AvatarFeedbackSupport.requestAvatarFeedback(2, false);
            } else {
              AvatarFeedbackSupport.requestAvatarFeedback(1, false);
            }
          }
          return;
        } catch (java.lang.RuntimeException attachedUpdateFailure) {
          caughtAttachedUpdateFailure = attachedUpdateFailure;
          attachedUpdateFailureForContext = caughtAttachedUpdateFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) attachedUpdateFailureForContext), "rh.I(" + methodGuard + ')');
        }
    }

    final int getFileSlotCount(int methodGuard, int groupId) {
        if (!this.isValidGroupId(groupId, 3)) {
            return 0;
        }
        if (methodGuard != -9467) {
            ResourceArchive.releaseStaticReferences(91);
        }
        return this.index.fileSlotCounts[groupId];
    }

    private final synchronized void loadPackedGroup(int groupId, int methodGuard) {
        boolean unusedWrongGuardGroupValidation = false;
        if (!this.discardPackedGroups) {
            this.packedGroups[groupId] = IntrusiveNode.wrapByteStorage(-105, this.archiveSource.getPackedGroup(4, groupId), false);
        } else {
            this.packedGroups[groupId] = this.archiveSource.getPackedGroup(4, groupId);
        }
        if (methodGuard >= -103) {
            unusedWrongGuardGroupValidation = this.isValidGroupId(((int[]) (this.packedGroups[5]))[9], 37);
        }
    }

    final byte[] getFile(int groupId, int methodGuard, int fileId) {
        if (methodGuard != -28153) {
            this.isNamedFileAvailable((byte) -106, (String) null, (String) (this.packedGroups[14]));
        }
        return this.getFile(groupId, true, (int[]) null, fileId);
    }

    final boolean hasGroupName(byte methodGuard, String groupName) {
        int groupId = 0;
        RuntimeException lookupFailureForContext = null;
        CharSequence groupNameCharacters = null;
        RuntimeException lookupFailureBeforeDescription = null;
        StringBuilder lookupMessagePrefix = null;
        String groupNameDescription = null;
        RuntimeException caughtLookupFailure = null;
        try {
          if (methodGuard >= -87) {
            return true;
          }
          if (!this.ensureIndexLoaded(0)) {
            return false;
          }
          groupName = groupName.toLowerCase();
          groupNameCharacters = (CharSequence) ((Object) groupName);
          groupId = this.index.groupNameLookup.findIndex(true, EntityMotionSupport.hashEncodedText(94, groupNameCharacters));
          if (groupId >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException lookupFailure) {
          caughtLookupFailure = lookupFailure;
          lookupFailureForContext = caughtLookupFailure;
          lookupFailureBeforeDescription = lookupFailureForContext;
          lookupMessagePrefix = new StringBuilder().append("rh.O(").append(methodGuard).append(',');
          if (groupName == null) {
            groupNameDescription = "null";
          } else {
            groupNameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) lookupFailureBeforeDescription), ((StringBuilder) (Object) lookupMessagePrefix).append(groupNameDescription).append(')').toString());
        }
    }

    final synchronized boolean loadAllGroups(boolean initialSuccess) {
        int groupListIndex = 0;
        int allGroupsLoaded;
        int groupId;
        int unusedClientGuardSnapshot;
        unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
        if (!this.ensureIndexLoaded(0)) {
          return false;
        }
        allGroupsLoaded = initialSuccess ? 1 : 0;
        for (groupListIndex = 0; this.index.groupIds.length > groupListIndex; groupListIndex++) {
          groupId = this.index.groupIds[groupListIndex];
          if (this.packedGroups[groupId] != null) {
            continue;
          }
          this.loadPackedGroup(groupId, -119);
          if (null != this.packedGroups[groupId]) {
            continue;
          }
          allGroupsLoaded = 0;
        }
        return allGroupsLoaded != 0;
    }

    private final synchronized boolean isValidFileId(int fileId, int methodGuard, int groupId) {
        if (methodGuard != -1) {
            return ((boolean[]) (this.packedGroups[3]))[0];
        }
        if (!this.ensureIndexLoaded(0)) {
            return false;
        }
        if (0 > groupId || fileId < 0 || this.index.fileSlotCounts.length <= groupId || this.index.fileSlotCounts[groupId] <= fileId) {
            if (!HotspotTextWidget.throwOnInvalidArchiveIds) {
                return false;
            }
            throw new IllegalArgumentException(groupId + " " + fileId);
        }
        return true;
    }

    final int findFileId(String fileName, int methodGuard, int groupId) {
        int fileId = 0;
        RuntimeException lookupFailureForContext = null;
        CharSequence fileNameCharacters = null;
        int invalidGroupFileIdBeforeReturn = 0;
        int invalidFileIdBeforeReturn = 0;
        int fileIdBeforeReturn = 0;
        RuntimeException lookupFailureBeforeDescription = null;
        StringBuilder lookupMessagePrefix = null;
        String fileNameDescription = null;
        RuntimeException caughtLookupFailure = null;
        try {
          if (!this.isValidGroupId(groupId, 3)) {
            invalidGroupFileIdBeforeReturn = -1;
            return invalidGroupFileIdBeforeReturn;
          }
          if (methodGuard > -55) {
            pendingHighscoreQueries = (IntrusiveDeque) null;
          }
          fileName = fileName.toLowerCase();
          fileNameCharacters = (CharSequence) ((Object) fileName);
          fileId = this.index.fileNameLookups[groupId].findIndex(true, EntityMotionSupport.hashEncodedText(99, fileNameCharacters));
          if (this.isValidFileId(fileId, -1, groupId)) {
            fileIdBeforeReturn = fileId;
            return fileIdBeforeReturn;
          }
          invalidFileIdBeforeReturn = -1;
          return invalidFileIdBeforeReturn;
        } catch (java.lang.RuntimeException lookupFailure) {
          caughtLookupFailure = lookupFailure;
          lookupFailureForContext = caughtLookupFailure;
          lookupFailureBeforeDescription = lookupFailureForContext;
          lookupMessagePrefix = new StringBuilder().append("rh.W(");
          if (fileName == null) {
            fileNameDescription = "null";
          } else {
            fileNameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) lookupFailureBeforeDescription), ((StringBuilder) (Object) lookupMessagePrefix).append(fileNameDescription).append(',').append(methodGuard).append(',').append(groupId).append(')').toString());
        }
    }

    final synchronized boolean ensureIndexLoaded(int methodGuard) {
        if (methodGuard != 0) {
            this.getFileSlotCount(70, -80);
        }
        if (this.index != null) {
            return true;
        }
        this.index = this.archiveSource.getIndex((byte) 113);
        if (this.index == null) {
            return false;
        }
        this.packedGroups = new Object[this.index.groupSlotCount];
        this.decodedFiles = new Object[this.index.groupSlotCount][];
        return true;
    }

    final int getGroupProgressByName(int methodGuard, String groupName) {
        int groupId = 0;
        RuntimeException progressFailureForContext = null;
        CharSequence groupNameCharacters = null;
        int unavailableIndexProgressBeforeReturn = 0;
        int groupProgressBeforeReturn = 0;
        RuntimeException progressFailureBeforeDescription = null;
        StringBuilder progressMessagePrefix = null;
        String groupNameDescription = null;
        RuntimeException caughtProgressFailure = null;
        try {
          if (!this.ensureIndexLoaded(methodGuard)) {
            unavailableIndexProgressBeforeReturn = 0;
            return unavailableIndexProgressBeforeReturn;
          }
          groupName = groupName.toLowerCase();
          groupNameCharacters = (CharSequence) ((Object) groupName);
          groupId = this.index.groupNameLookup.findIndex(true, EntityMotionSupport.hashEncodedText(84, groupNameCharacters));
          groupProgressBeforeReturn = this.getGroupProgress((byte) 85, groupId);
          return groupProgressBeforeReturn;
        } catch (java.lang.RuntimeException progressFailure) {
          caughtProgressFailure = progressFailure;
          progressFailureForContext = caughtProgressFailure;
          progressFailureBeforeDescription = progressFailureForContext;
          progressMessagePrefix = new StringBuilder().append("rh.G(").append(methodGuard).append(',');
          if (groupName == null) {
            groupNameDescription = "null";
          } else {
            groupNameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) progressFailureBeforeDescription), ((StringBuilder) (Object) progressMessagePrefix).append(groupNameDescription).append(')').toString());
        }
    }

    private final synchronized boolean isValidGroupId(int groupId, int methodGuard) {
        if (!this.ensureIndexLoaded(0)) {
            return false;
        }
        if (methodGuard != 3) {
            createUsernameUnavailableText = (String) null;
        }
        if (groupId >= 0 && groupId < this.index.fileSlotCounts.length && this.index.fileSlotCounts[groupId] != 0) {
            return true;
        }
        if (HotspotTextWidget.throwOnInvalidArchiveIds) {
            throw new IllegalArgumentException(Integer.toString(groupId));
        }
        return false;
    }

    public static void releaseStaticReferences(int methodGuard) {
        unacknowledgedAchievementSubmissions = null;
        pendingHighscoreQueries = null;
        createUsernameUnavailableText = null;
        if (methodGuard != 30261) {
            unacknowledgedAchievementSubmissions = (IntrusiveDeque) null;
        }
        accountCreationEmail = null;
    }

    final synchronized byte[] getSingleFile(int methodGuard, int id) {
        if (!this.ensureIndexLoaded(0)) {
            return null;
        }
        if (this.index.fileSlotCounts.length == 1) {
            return this.getFile(0, methodGuard - 56472, id);
        }
        if (methodGuard != 28319) {
            return (byte[]) null;
        }
        if (!this.isValidGroupId(id, 3)) {
            return null;
        }
        if (this.index.fileSlotCounts[id] == 1) {
            return this.getFile(id, methodGuard ^ -872, 0);
        }
        throw new RuntimeException();
    }

    final synchronized boolean loadGroupIfNeeded(byte methodGuard, int groupId) {
        if (!this.isValidGroupId(groupId, 3)) {
            return false;
        }
        if (this.packedGroups[groupId] != null) {
            return true;
        }
        if (methodGuard != 102) {
            this.getGroupProgress((byte) -65, 111);
        }
        this.loadPackedGroup(groupId, -108);
        if (this.packedGroups[groupId] == null) {
            return false;
        }
        return true;
    }

    private final synchronized boolean unpackGroup(int requestedFileId, int methodGuard, int[] decryptionKey, int groupId) {
        Object[] newGroupFileSlots = null;
        int cachedFileOrdinal = 0;
        int copyFileOrdinal = 0;
        byte[] newFileBytes = null;
        RuntimeException decompressionFailureBeforeContext = null;
        StringBuilder decompressionMessagePrefix = null;
        boolean keySuppliedForDiagnostic = false;
        RuntimeException unpackFailureBeforeContext = null;
        StringBuilder unpackMessagePrefix = null;
        String decryptionKeyDescription = null;
        RuntimeException caughtUnpackFailure = null;
        int actualFileCount = 0;
        RuntimeException unpackFailureForContext = null;
        int[] fileIds = null;
        Object[] groupFileSlots = null;
        int allFilesPresent = 0;
        byte[] packedBytes = null;
        int cachedFileId = 0;
        RuntimeException decompressionFailureForContext = null;
        int chunkTableOffsetOrSingleFileId = 0;
        int chunkCount = 0;
        int requestedLengthThenWritePosition = 0;
        int[] fileLengthsThenWritePositions = null;
        int requestedStorageFileIdOrChunkIndex = 0;
        byte[][] splitFileBytes = null;
        int chunkIndexOrChunkLengthOrFileIndexOrDataOffset = 0;
        int chunkLengthOrDataOffsetOrFileIndexOrChunkIndex = 0;
        int fileIndexOrChunkIndexOrChunkLengthOrFileId = 0;
        int fileIdOrChunkLengthOrFileIndex = 0;
        int copiedFileId = 0;
        byte[] unpackedBytesForChunkCount = null;
        int[] fileIdsForEntryScan = null;
        byte[] packedBytesForDecryption = null;
        ByteArrayBuffer encryptedGroupBuffer = null;
        byte[] unpackedBytesAfterDecompression = null;
        ByteArrayBuffer allFilesChunkTableBuffer = null;
        int[] fileLengthsAlias = null;
        byte[][] splitFileBytesAlias = null;
        ByteArrayBuffer requestedFileChunkTableBuffer = null;
        int[] mappedFileIds = null;
        byte[] copiedPackedBytes = null;
        byte[] unpackedBytes = null;
        int[] allocatedFileLengthsThenWritePositions = null;
        byte[][] allocatedSplitFileBytes = null;
        byte[] unpackedBytesForChunkCopies = null;
        byte[] requestedFileBytes = null;
        try {
          if (!this.isValidGroupId(groupId, 3)) {
            return false;
          }
          if (this.packedGroups[groupId] == null) {
            return false;
          }
          actualFileCount = this.index.fileCounts[groupId];
          mappedFileIds = this.index.fileIds[groupId];
          fileIdsForEntryScan = mappedFileIds;
          fileIds = fileIdsForEntryScan;
          if (null == this.decodedFiles[groupId]) {
            newGroupFileSlots = new Object[this.index.fileSlotCounts[groupId]];
            this.decodedFiles[groupId] = newGroupFileSlots;
          }
          groupFileSlots = this.decodedFiles[groupId];
          allFilesPresent = 1;
          for (cachedFileOrdinal = 0; cachedFileOrdinal < actualFileCount; cachedFileOrdinal++) {
            if (fileIds == null) {
              cachedFileId = cachedFileOrdinal;
            } else {
              cachedFileId = mappedFileIds[cachedFileOrdinal];
            }
            if (null != groupFileSlots[cachedFileId]) {
              continue;
            }
            allFilesPresent = 0;
            break;
          }
          if (allFilesPresent != 0) {
            return true;
          }
          packedGroupDecryptionSelection: {
            if (decryptionKey != null) {
              if (decryptionKey[0] != 0 ||
                  decryptionKey[1] != 0 ||
                  decryptionKey[2] != 0 ||
                  0 != decryptionKey[3]) {
                copiedPackedBytes = UsernameAvailabilityValidator.extractByteStorageBytes(true, methodGuard ^ -114, this.packedGroups[groupId]);
                packedBytesForDecryption = copiedPackedBytes;
                packedBytes = packedBytesForDecryption;
                encryptedGroupBuffer = new ByteArrayBuffer(copiedPackedBytes);
                encryptedGroupBuffer.decryptXteaRange((byte) -125, decryptionKey, 5, encryptedGroupBuffer.bytes.length);
                break packedGroupDecryptionSelection;
              }
            }
            packedBytes = UsernameAvailabilityValidator.extractByteStorageBytes(false, methodGuard - 90, this.packedGroups[groupId]);
          }
          if (methodGuard != 4) {
            return false;
          }
          try {
            unpackedBytes = CanvasResizeController.decompressArchive(packedBytes, -1);
            unpackedBytesAfterDecompression = unpackedBytes;
            unpackedBytesForChunkCount = unpackedBytesAfterDecompression;
            unpackedBytesForChunkCopies = unpackedBytesForChunkCount;
          } catch (java.lang.RuntimeException decompressionFailure) {
            caughtUnpackFailure = decompressionFailure;
            decompressionFailureForContext = caughtUnpackFailure;
            decompressionFailureBeforeContext = decompressionFailureForContext;
            decompressionMessagePrefix = new StringBuilder();
            keySuppliedForDiagnostic = !(decryptionKey == null);
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) decompressionFailureBeforeContext), ((StringBuilder) (Object) decompressionMessagePrefix).append(keySuppliedForDiagnostic).append(" ").append(groupId).append(" ").append(packedBytes.length).append(" ").append(NameCharacterSupport.computePrefixCrc32(packedBytes, methodGuard + 95, packedBytes.length)).append(" ").append(NameCharacterSupport.computePrefixCrc32(packedBytes, methodGuard ^ 73, packedBytes.length - 2)).append(" ").append(this.index.groupCrc32[groupId]).append(" ").append(this.index.indexCrc32).toString());
          }
          if (this.discardPackedGroups) {
            this.packedGroups[groupId] = null;
          }
          if (actualFileCount > 1) {
            if (this.fileRetentionPolicy == 2) {
              chunkTableOffsetOrSingleFileId = unpackedBytes.length;
              chunkTableOffsetOrSingleFileId--;
              chunkCount = 255 & unpackedBytesForChunkCount[chunkTableOffsetOrSingleFileId];
              chunkTableOffsetOrSingleFileId = chunkTableOffsetOrSingleFileId - actualFileCount * (chunkCount * 4);
              requestedFileChunkTableBuffer = new ByteArrayBuffer(unpackedBytesForChunkCopies);
              requestedLengthThenWritePosition = 0;
              requestedStorageFileIdOrChunkIndex = 0;
              requestedFileChunkTableBuffer.position = chunkTableOffsetOrSingleFileId;
              for (chunkIndexOrChunkLengthOrFileIndexOrDataOffset = 0; chunkIndexOrChunkLengthOrFileIndexOrDataOffset < chunkCount; chunkIndexOrChunkLengthOrFileIndexOrDataOffset++) {
                chunkLengthOrDataOffsetOrFileIndexOrChunkIndex = 0;
                for (fileIndexOrChunkIndexOrChunkLengthOrFileId = 0; fileIndexOrChunkIndexOrChunkLengthOrFileId < actualFileCount; fileIndexOrChunkIndexOrChunkLengthOrFileId++) {
                  chunkLengthOrDataOffsetOrFileIndexOrChunkIndex = chunkLengthOrDataOffsetOrFileIndexOrChunkIndex + requestedFileChunkTableBuffer.readIntBE((byte) -126);
                  if (fileIds == null) {
                    fileIdOrChunkLengthOrFileIndex = fileIndexOrChunkIndexOrChunkLengthOrFileId;
                  } else {
                    fileIdOrChunkLengthOrFileIndex = mappedFileIds[fileIndexOrChunkIndexOrChunkLengthOrFileId];
                  }
                  if (requestedFileId == fileIdOrChunkLengthOrFileIndex) {
                    requestedLengthThenWritePosition = requestedLengthThenWritePosition + chunkLengthOrDataOffsetOrFileIndexOrChunkIndex;
                    requestedStorageFileIdOrChunkIndex = fileIdOrChunkLengthOrFileIndex;
                  }
                }
              }
              if (requestedLengthThenWritePosition == 0) {
                return true;
              }
              requestedFileBytes = new byte[requestedLengthThenWritePosition];
              requestedFileChunkTableBuffer.position = chunkTableOffsetOrSingleFileId;
              requestedLengthThenWritePosition = 0;
              chunkLengthOrDataOffsetOrFileIndexOrChunkIndex = 0;
              for (fileIndexOrChunkIndexOrChunkLengthOrFileId = 0; fileIndexOrChunkIndexOrChunkLengthOrFileId < chunkCount; fileIndexOrChunkIndexOrChunkLengthOrFileId++) {
                fileIdOrChunkLengthOrFileIndex = 0;
                for (copyFileOrdinal = 0; copyFileOrdinal < actualFileCount; copyFileOrdinal++) {
                  fileIdOrChunkLengthOrFileIndex = fileIdOrChunkLengthOrFileIndex + requestedFileChunkTableBuffer.readIntBE((byte) -82);
                  if (fileIds == null) {
                    copiedFileId = copyFileOrdinal;
                  } else {
                    copiedFileId = mappedFileIds[copyFileOrdinal];
                  }
                  if (copiedFileId == requestedFileId) {
                    ArrayOperations.copyBytes(unpackedBytesForChunkCopies, chunkLengthOrDataOffsetOrFileIndexOrChunkIndex, requestedFileBytes, requestedLengthThenWritePosition, fileIdOrChunkLengthOrFileIndex);
                    requestedLengthThenWritePosition = requestedLengthThenWritePosition + fileIdOrChunkLengthOrFileIndex;
                  }
                  chunkLengthOrDataOffsetOrFileIndexOrChunkIndex = chunkLengthOrDataOffsetOrFileIndexOrChunkIndex + fileIdOrChunkLengthOrFileIndex;
                }
              }
              groupFileSlots[requestedStorageFileIdOrChunkIndex] = requestedFileBytes;
              return true;
            }
            chunkTableOffsetOrSingleFileId = unpackedBytes.length;
            chunkTableOffsetOrSingleFileId--;
            chunkCount = 255 & unpackedBytesForChunkCount[chunkTableOffsetOrSingleFileId];
            chunkTableOffsetOrSingleFileId = chunkTableOffsetOrSingleFileId - 4 * chunkCount * actualFileCount;
            allFilesChunkTableBuffer = new ByteArrayBuffer(unpackedBytesForChunkCopies);
            allocatedFileLengthsThenWritePositions = new int[actualFileCount];
            fileLengthsAlias = allocatedFileLengthsThenWritePositions;
            fileLengthsThenWritePositions = fileLengthsAlias;
            allFilesChunkTableBuffer.position = chunkTableOffsetOrSingleFileId;
            for (requestedStorageFileIdOrChunkIndex = 0; requestedStorageFileIdOrChunkIndex < chunkCount; requestedStorageFileIdOrChunkIndex++) {
              chunkIndexOrChunkLengthOrFileIndexOrDataOffset = 0;
              for (chunkLengthOrDataOffsetOrFileIndexOrChunkIndex = 0; chunkLengthOrDataOffsetOrFileIndexOrChunkIndex < actualFileCount; chunkLengthOrDataOffsetOrFileIndexOrChunkIndex++) {
                chunkIndexOrChunkLengthOrFileIndexOrDataOffset = chunkIndexOrChunkLengthOrFileIndexOrDataOffset + allFilesChunkTableBuffer.readIntBE((byte) -27);
                fileLengthsThenWritePositions[chunkLengthOrDataOffsetOrFileIndexOrChunkIndex] = fileLengthsThenWritePositions[chunkLengthOrDataOffsetOrFileIndexOrChunkIndex] + chunkIndexOrChunkLengthOrFileIndexOrDataOffset;
              }
            }
            allocatedSplitFileBytes = new byte[actualFileCount][];
            splitFileBytesAlias = allocatedSplitFileBytes;
            splitFileBytes = splitFileBytesAlias;
            for (chunkIndexOrChunkLengthOrFileIndexOrDataOffset = 0; actualFileCount > chunkIndexOrChunkLengthOrFileIndexOrDataOffset; chunkIndexOrChunkLengthOrFileIndexOrDataOffset++) {
              newFileBytes = new byte[allocatedFileLengthsThenWritePositions[chunkIndexOrChunkLengthOrFileIndexOrDataOffset]];
              splitFileBytes[chunkIndexOrChunkLengthOrFileIndexOrDataOffset] = newFileBytes;
              allocatedFileLengthsThenWritePositions[chunkIndexOrChunkLengthOrFileIndexOrDataOffset] = 0;
            }
            allFilesChunkTableBuffer.position = chunkTableOffsetOrSingleFileId;
            chunkIndexOrChunkLengthOrFileIndexOrDataOffset = 0;
            for (chunkLengthOrDataOffsetOrFileIndexOrChunkIndex = 0; chunkCount > chunkLengthOrDataOffsetOrFileIndexOrChunkIndex; chunkLengthOrDataOffsetOrFileIndexOrChunkIndex++) {
              fileIndexOrChunkIndexOrChunkLengthOrFileId = 0;
              for (fileIdOrChunkLengthOrFileIndex = 0; actualFileCount > fileIdOrChunkLengthOrFileIndex; fileIdOrChunkLengthOrFileIndex++) {
                fileIndexOrChunkIndexOrChunkLengthOrFileId = fileIndexOrChunkIndexOrChunkLengthOrFileId + allFilesChunkTableBuffer.readIntBE((byte) -106);
                ArrayOperations.copyBytes(unpackedBytes, chunkIndexOrChunkLengthOrFileIndexOrDataOffset, allocatedSplitFileBytes[fileIdOrChunkLengthOrFileIndex], allocatedFileLengthsThenWritePositions[fileIdOrChunkLengthOrFileIndex], fileIndexOrChunkIndexOrChunkLengthOrFileId);
                chunkIndexOrChunkLengthOrFileIndexOrDataOffset = chunkIndexOrChunkLengthOrFileIndexOrDataOffset + fileIndexOrChunkIndexOrChunkLengthOrFileId;
                fileLengthsThenWritePositions[fileIdOrChunkLengthOrFileIndex] = fileLengthsThenWritePositions[fileIdOrChunkLengthOrFileIndex] + fileIndexOrChunkIndexOrChunkLengthOrFileId;
              }
            }
            for (chunkLengthOrDataOffsetOrFileIndexOrChunkIndex = 0; actualFileCount > chunkLengthOrDataOffsetOrFileIndexOrChunkIndex; chunkLengthOrDataOffsetOrFileIndexOrChunkIndex++) {
              if (fileIds == null) {
                fileIndexOrChunkIndexOrChunkLengthOrFileId = chunkLengthOrDataOffsetOrFileIndexOrChunkIndex;
              } else {
                fileIndexOrChunkIndexOrChunkLengthOrFileId = mappedFileIds[chunkLengthOrDataOffsetOrFileIndexOrChunkIndex];
              }
              if (this.fileRetentionPolicy != 0) {
                groupFileSlots[fileIndexOrChunkIndexOrChunkLengthOrFileId] = allocatedSplitFileBytes[chunkLengthOrDataOffsetOrFileIndexOrChunkIndex];
              } else {
                groupFileSlots[fileIndexOrChunkIndexOrChunkLengthOrFileId] = IntrusiveNode.wrapByteStorage(methodGuard - 126, allocatedSplitFileBytes[chunkLengthOrDataOffsetOrFileIndexOrChunkIndex], false);
              }
            }
          } else {
            if (fileIds != null) {
              chunkTableOffsetOrSingleFileId = mappedFileIds[0];
            } else {
              chunkTableOffsetOrSingleFileId = 0;
            }
            if (this.fileRetentionPolicy != 0) {
              groupFileSlots[chunkTableOffsetOrSingleFileId] = unpackedBytes;
            } else {
              groupFileSlots[chunkTableOffsetOrSingleFileId] = IntrusiveNode.wrapByteStorage(-113, unpackedBytes, false);
            }
          }
          return true;
        } catch (java.lang.RuntimeException unpackFailure) {
          caughtUnpackFailure = unpackFailure;
          unpackFailureForContext = caughtUnpackFailure;
          unpackFailureBeforeContext = unpackFailureForContext;
          unpackMessagePrefix = new StringBuilder().append("rh.J(").append(requestedFileId).append(',').append(methodGuard).append(',');
          if (decryptionKey == null) {
            decryptionKeyDescription = "null";
          } else {
            decryptionKeyDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) unpackFailureBeforeContext), ((StringBuilder) (Object) unpackMessagePrefix).append(decryptionKeyDescription).append(',').append(groupId).append(')').toString());
        }
    }

    final synchronized boolean isFileAvailable(byte methodGuard, int groupId, int fileId) {
        if (!this.isValidFileId(fileId, -1, groupId)) {
            return false;
        }
        if (methodGuard != 37) {
            return true;
        }
        if (null != this.decodedFiles[groupId] &&
            this.decodedFiles[groupId][fileId] != null) {
            return true;
        }
        if (this.packedGroups[groupId] != null) {
            return true;
        }
        this.loadPackedGroup(groupId, -118);
        if (this.packedGroups[groupId] != null) {
            return true;
        }
        return false;
    }

    private final synchronized byte[] getFile(int groupId, boolean ordinaryAccess, int[] decryptionKey, int fileId) {
        Object invalidFileBeforeReturn = null;
        Object unavailableFileBeforeReturn = null;
        Object fileBytesBeforeReturn = null;
        Object fileFailureBeforeContext = null;
        StringBuilder fileMessagePrefix = null;
        String decryptionKeyDescription = null;
        RuntimeException caughtFileFailure = null;
        Object fileBytesOrFailureForContext = null;
        byte[] fileBytes = null;
        try {
          if (!ordinaryAccess) {
            accountCreationEmail = (String) (this.packedGroups[0]);
          }
          if (!this.isValidFileId(fileId, -1, groupId)) {
            invalidFileBeforeReturn = null;
            return (byte[]) (invalidFileBeforeReturn);
          }
          fileBytesOrFailureForContext = null;
          if (this.decodedFiles[groupId] == null ||
              null == this.decodedFiles[groupId][fileId]) {
            if (!this.unpackGroup(fileId, 4, decryptionKey, groupId)) {
              this.loadPackedGroup(groupId, -118);
              if (!this.unpackGroup(fileId, 4, decryptionKey, groupId)) {
                unavailableFileBeforeReturn = null;
                return (byte[]) (unavailableFileBeforeReturn);
              }
            }
          }
          if (this.decodedFiles[groupId] == null) {
            throw new RuntimeException("");
          }
          if (null != this.decodedFiles[groupId][fileId]) {
            fileBytes = UsernameAvailabilityValidator.extractByteStorageBytes(false, -116, this.decodedFiles[groupId][fileId]);
            fileBytesOrFailureForContext = fileBytes;
            if (fileBytes == null) {
              throw new RuntimeException("");
            }
          }
          if (fileBytesOrFailureForContext != null) {
            if (this.fileRetentionPolicy == 1) {
              this.decodedFiles[groupId][fileId] = null;
              if (this.index.fileSlotCounts[groupId] == 1) {
                this.decodedFiles[groupId] = null;
              }
            } else {
              if (this.fileRetentionPolicy == 2) {
                this.decodedFiles[groupId] = null;
              }
            }
          }
          fileBytesBeforeReturn = fileBytesOrFailureForContext;
          return (byte[]) (fileBytesBeforeReturn);
        } catch (java.lang.RuntimeException fileFailure) {
          caughtFileFailure = fileFailure;
          fileBytesOrFailureForContext = caughtFileFailure;
          fileFailureBeforeContext = fileBytesOrFailureForContext;
          fileMessagePrefix = new StringBuilder().append("rh.B(").append(groupId).append(',').append(ordinaryAccess).append(',');
          if (decryptionKey == null) {
            decryptionKeyDescription = "null";
          } else {
            decryptionKeyDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) (fileFailureBeforeContext), ((StringBuilder) (Object) fileMessagePrefix).append(decryptionKeyDescription).append(',').append(fileId).append(')').toString());
        }
    }

    final int findGroupId(byte methodGuard, String groupName) {
        int groupId = 0;
        RuntimeException lookupFailureForContext = null;
        CharSequence groupNameCharacters = null;
        int unavailableIndexGroupIdBeforeReturn = 0;
        int invalidGroupIdBeforeReturn = 0;
        int groupIdBeforeReturn = 0;
        RuntimeException lookupFailureBeforeDescription = null;
        StringBuilder lookupMessagePrefix = null;
        String groupNameDescription = null;
        RuntimeException caughtLookupFailure = null;
        try {
          if (!this.ensureIndexLoaded(0)) {
            unavailableIndexGroupIdBeforeReturn = -1;
            return unavailableIndexGroupIdBeforeReturn;
          }
          groupName = groupName.toLowerCase();
          groupNameCharacters = (CharSequence) ((Object) groupName);
          groupId = this.index.groupNameLookup.findIndex(true, EntityMotionSupport.hashEncodedText(124, groupNameCharacters));
          if (!this.isValidGroupId(groupId, 3)) {
            invalidGroupIdBeforeReturn = -1;
            return invalidGroupIdBeforeReturn;
          }
          if (methodGuard <= 125) {
            this.discardPackedGroups = false;
          }
          groupIdBeforeReturn = groupId;
          return groupIdBeforeReturn;
        } catch (java.lang.RuntimeException lookupFailure) {
          caughtLookupFailure = lookupFailure;
          lookupFailureForContext = caughtLookupFailure;
          lookupFailureBeforeDescription = lookupFailureForContext;
          lookupMessagePrefix = new StringBuilder().append("rh.P(").append(methodGuard).append(',');
          if (groupName == null) {
            groupNameDescription = "null";
          } else {
            groupNameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) lookupFailureBeforeDescription), ((StringBuilder) (Object) lookupMessagePrefix).append(groupNameDescription).append(')').toString());
        }
    }

    final boolean loadGroupByName(String groupName, byte methodGuard) {
        int groupId = 0;
        RuntimeException groupFailureForContext = null;
        CharSequence groupNameCharacters = null;
        boolean groupLoadedBeforeReturn = false;
        RuntimeException groupFailureBeforeContext = null;
        StringBuilder groupMessagePrefix = null;
        String groupNameDescription = null;
        RuntimeException caughtGroupFailure = null;
        try {
          if (!this.ensureIndexLoaded(0)) {
            return false;
          }
          groupName = groupName.toLowerCase();
          if (methodGuard > -123) {
            createUsernameUnavailableText = (String) null;
          }
          groupNameCharacters = (CharSequence) ((Object) groupName);
          groupId = this.index.groupNameLookup.findIndex(true, EntityMotionSupport.hashEncodedText(69, groupNameCharacters));
          groupLoadedBeforeReturn = this.loadGroupIfNeeded((byte) 102, groupId);
          return groupLoadedBeforeReturn;
        } catch (java.lang.RuntimeException groupFailure) {
          caughtGroupFailure = groupFailure;
          groupFailureForContext = caughtGroupFailure;
          groupFailureBeforeContext = groupFailureForContext;
          groupMessagePrefix = new StringBuilder().append("rh.F(");
          if (groupName == null) {
            groupNameDescription = "null";
          } else {
            groupNameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) groupFailureBeforeContext), ((StringBuilder) (Object) groupMessagePrefix).append(groupNameDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final synchronized int getLoadProgress(byte methodGuard) {
        int possibleProgress;
        int loadedProgress;
        int groupIndexThenPercentage;
        int unusedClientGuardSnapshot;
        unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
        if (!this.ensureIndexLoaded(0)) {
          return 0;
        }
        if (methodGuard < 99) {
          return 9;
        }
        possibleProgress = 0;
        loadedProgress = 0;
        for (groupIndexThenPercentage = 0; this.packedGroups.length > groupIndexThenPercentage; groupIndexThenPercentage++) {
          if (this.index.fileCounts[groupIndexThenPercentage] <= 0) {
            continue;
          }
          loadedProgress = loadedProgress + this.getGroupProgress((byte) 59, groupIndexThenPercentage);
          possibleProgress += 100;
        }
        if (possibleProgress == 0) {
          return 100;
        }
        groupIndexThenPercentage = loadedProgress * 100 / possibleProgress;
        return groupIndexThenPercentage;
    }

    final boolean isNamedFileAvailable(byte methodGuard, String fileName, String groupName) {
        int groupId = 0;
        RuntimeException availabilityFailureForContext = null;
        int fileId = 0;
        CharSequence groupNameCharacters = null;
        CharSequence fileNameCharacters = null;
        boolean wrongGuardAvailabilityBeforeReturn = false;
        boolean fileAvailabilityBeforeReturn = false;
        RuntimeException availabilityFailureBeforeContext = null;
        StringBuilder availabilityMessagePrefix = null;
        String fileNameDescription = null;
        StringBuilder availabilityMessageBeforeGroup = null;
        String groupNameDescription = null;
        RuntimeException caughtAvailabilityFailure = null;
        try {
          if (!this.ensureIndexLoaded(0)) {
            return false;
          }
          groupName = groupName.toLowerCase();
          fileName = fileName.toLowerCase();
          groupNameCharacters = (CharSequence) ((Object) groupName);
          groupId = this.index.groupNameLookup.findIndex(true, EntityMotionSupport.hashEncodedText(80, groupNameCharacters));
          if (!this.isValidGroupId(groupId, 3)) {
            return false;
          }
          fileNameCharacters = (CharSequence) ((Object) fileName);
          fileId = this.index.fileNameLookups[groupId].findIndex(true, EntityMotionSupport.hashEncodedText(93, fileNameCharacters));
          if (methodGuard == 113) {
            fileAvailabilityBeforeReturn = this.isFileAvailable((byte) 37, groupId, fileId);
            return fileAvailabilityBeforeReturn;
          }
          wrongGuardAvailabilityBeforeReturn = ((boolean[]) (((Object[]) (this.packedGroups[8]))[2]))[9];
          return wrongGuardAvailabilityBeforeReturn;
        } catch (java.lang.RuntimeException availabilityFailure) {
          caughtAvailabilityFailure = availabilityFailure;
          availabilityFailureForContext = caughtAvailabilityFailure;
          availabilityFailureBeforeContext = availabilityFailureForContext;
          availabilityMessagePrefix = new StringBuilder().append("rh.H(").append(methodGuard).append(',');
          if (fileName == null) {
            fileNameDescription = "null";
          } else {
            fileNameDescription = "{...}";
          }
          availabilityMessageBeforeGroup = ((StringBuilder) (Object) availabilityMessagePrefix).append(fileNameDescription).append(',');
          if (groupName == null) {
            groupNameDescription = "null";
          } else {
            groupNameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) availabilityFailureBeforeContext), ((StringBuilder) (Object) availabilityMessageBeforeGroup).append(groupNameDescription).append(')').toString());
        }
    }

    ResourceArchive(ArchiveSource archiveSource, boolean discardPackedGroups, int fileRetentionPolicy) {
        this.index = null;
        try {
            if (0 > fileRetentionPolicy || 2 < fileRetentionPolicy) {
                throw new IllegalArgumentException("");
            }
            this.fileRetentionPolicy = fileRetentionPolicy;
            this.archiveSource = archiveSource;
            this.discardPackedGroups = discardPackedGroups ? true : false;
        } catch (RuntimeException constructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) constructionFailure), "rh.<init>(" + (archiveSource != null ? "{...}" : "null") + ',' + discardPackedGroups + ',' + fileRetentionPolicy + ')');
        }
    }

    final synchronized byte[] getNamedFile(int methodGuard, String fileName, String groupName) {
        int groupId = 0;
        RuntimeException fileFailureForContext = null;
        int fileId = 0;
        CharSequence groupNameCharacters = null;
        CharSequence fileNameCharacters = null;
        Object unavailableIndexFileBeforeReturn = null;
        byte[] fileBytesBeforeReturn = null;
        RuntimeException fileFailureBeforeContext = null;
        StringBuilder fileMessagePrefix = null;
        String fileNameDescription = null;
        StringBuilder fileMessageBeforeGroup = null;
        String groupNameDescription = null;
        RuntimeException caughtFileFailure = null;
        try {
          if (!this.ensureIndexLoaded(methodGuard)) {
            unavailableIndexFileBeforeReturn = null;
            return (byte[]) (unavailableIndexFileBeforeReturn);
          }
          groupName = groupName.toLowerCase();
          fileName = fileName.toLowerCase();
          groupNameCharacters = (CharSequence) ((Object) groupName);
          groupId = this.index.groupNameLookup.findIndex(true, EntityMotionSupport.hashEncodedText(54, groupNameCharacters));
          if (!this.isValidGroupId(groupId, 3)) {
            return null;
          }
          fileNameCharacters = (CharSequence) ((Object) fileName);
          fileId = this.index.fileNameLookups[groupId].findIndex(true, EntityMotionSupport.hashEncodedText(43, fileNameCharacters));
          fileBytesBeforeReturn = this.getFile(groupId, -28153, fileId);
          return fileBytesBeforeReturn;
        } catch (java.lang.RuntimeException fileFailure) {
          caughtFileFailure = fileFailure;
          fileFailureForContext = caughtFileFailure;
          fileFailureBeforeContext = fileFailureForContext;
          fileMessagePrefix = new StringBuilder().append("rh.Q(").append(methodGuard).append(',');
          if (fileName == null) {
            fileNameDescription = "null";
          } else {
            fileNameDescription = "{...}";
          }
          fileMessageBeforeGroup = ((StringBuilder) (Object) fileMessagePrefix).append(fileNameDescription).append(',');
          if (groupName == null) {
            groupNameDescription = "null";
          } else {
            groupNameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) fileFailureBeforeContext), ((StringBuilder) (Object) fileMessageBeforeGroup).append(groupNameDescription).append(')').toString());
        }
    }

    final synchronized int getGroupProgress(byte methodGuard, int groupId) {
        boolean unusedWrongGuardGroupValidation = false;
        if (!this.isValidGroupId(groupId, 3)) {
            return 0;
        }
        if (null != this.packedGroups[groupId]) {
            return 100;
        }
        if (methodGuard <= 31) {
            unusedWrongGuardGroupValidation = this.isValidGroupId(-88, ((int[]) (((Object[]) (this.packedGroups[0]))[2]))[7]);
        }
        return this.archiveSource.getGroupProgress(126, groupId);
    }

    final static long encodeBase37Name(CharSequence nameCharacters, int methodGuard) {
        int characterIndex = 0;
        long encodedNameBeforeReturn = 0L;
        RuntimeException encodingFailureBeforeDescription = null;
        StringBuilder encodingMessagePrefix = null;
        String nameDescription = null;
        RuntimeException caughtEncodingFailure = null;
        long encodedName = 0L;
        RuntimeException encodingFailureForContext = null;
        int nameLength = 0;
        int characterCode = 0;
        int unusedClientControlSnapshot = 0;
        CharSequence unusedNullNameSnapshot = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          encodedName = 0L;
          if (methodGuard != -48) {
            unusedNullNameSnapshot = (CharSequence) null;
            ResourceArchive.encodeBase37Name((CharSequence) null, -67);
          }
          nameLength = nameCharacters.length();
          for (characterIndex = 0; characterIndex < nameLength; characterIndex++) {
            encodedName = encodedName * 37L;
            characterCode = nameCharacters.charAt(characterIndex);
            if (characterCode >= 65 &&
                characterCode <= 90) {
              encodedName = encodedName + (long)(-65 + (1 + characterCode));
            } else if (characterCode >= 97 &&
                characterCode <= 122) {
              encodedName = encodedName + (long)(-96 + characterCode);
            } else {
              if (48 <= characterCode &&
                  57 >= characterCode) {
                encodedName = encodedName + (long)(-48 + characterCode + 27);
              }
            }
            if (177917621779460413L > encodedName) {
              continue;
            }
            break;
          }
          while (encodedName % 37L == 0L) {
            if (encodedName != 0L) {
              encodedName = encodedName / 37L;
              continue;
            }
            break;
          }
          encodedNameBeforeReturn = encodedName;
          return encodedNameBeforeReturn;
        } catch (java.lang.RuntimeException encodingFailure) {
          caughtEncodingFailure = encodingFailure;
          encodingFailureForContext = caughtEncodingFailure;
          encodingFailureBeforeDescription = encodingFailureForContext;
          encodingMessagePrefix = new StringBuilder().append("rh.N(");
          if (nameCharacters == null) {
            nameDescription = "null";
          } else {
            nameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) encodingFailureBeforeDescription), ((StringBuilder) (Object) encodingMessagePrefix).append(nameDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    static {
        unacknowledgedAchievementSubmissions = new IntrusiveDeque();
        pendingHighscoreQueries = new IntrusiveDeque();
        createUsernameUnavailableText = "That name is not available";
    }
}
