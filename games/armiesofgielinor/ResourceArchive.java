/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ResourceArchive {
    private Object[][] unpackedFiles;
    private ArchiveProvider provider;
    private ArchiveIndex index;
    int fileRetentionMode;
    boolean discardPackedGroups;
    static ClientConnectionState connectedState;
    private Object[] packedGroups;
    static String field_d;
    static String field_f;
    static BattleCamera field_a;
    static volatile int livePointerY;

    final synchronized int getOverallProgress(int initialProgressWeight) {
        int totalWeight;
        int totalProgress;
        int groupId;
        int percentage;
        if (!this.ensureIndex((byte) 82)) {
          return 0;
        }
        totalWeight = initialProgressWeight;
        totalProgress = 0;
        for (groupId = 0; groupId < this.packedGroups.length; groupId++) {
          if (this.index.fileCounts[groupId] > 0) {
            totalProgress = totalProgress + this.getGroupProgress(groupId, (byte) 73);
            totalWeight += 100;
          }
        }
        if (totalWeight == 0) {
          return 100;
        }
        percentage = totalProgress * 100 / totalWeight;
        return percentage;
    }

    private final synchronized byte[] getFileWithKeys(int[] xteaKey, int obfuscationGuard, int fileId, int groupId) {
        Object stackIn_2_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object fileBytesOrFailure = null;
        String var7 = null;
        byte[] fileBytes = null;
        try {
          if (!this.isValidFile(groupId, 0, fileId)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          if (obfuscationGuard < 113) {
            var7 = (String) null;
            this.containsGroupName(((byte[]) (this.packedGroups[1]))[1], (String) null);
          }
          fileBytesOrFailure = null;
          if ((null == this.unpackedFiles[groupId] ||
            this.unpackedFiles[groupId][fileId] == null) && !this.unpackGroup(fileId, 0, xteaKey, groupId)) {
            this.loadPackedGroup(true, groupId);
            if (!this.unpackGroup(fileId, 0, xteaKey, groupId)) {
              stackIn_11_0 = null;
              return (byte[]) (stackIn_11_0);
            }
          }
          if (null == this.unpackedFiles[groupId]) {
            throw new RuntimeException("");
          }
          if (null != this.unpackedFiles[groupId][fileId]) {
            fileBytes = ko.getStoredBytes(false, 80, this.unpackedFiles[groupId][fileId]);
            fileBytesOrFailure = fileBytes;
            if (fileBytes == null) {
              throw new RuntimeException("");
            }
          }
          if (fileBytesOrFailure != null) {
            if (this.fileRetentionMode == 1) {
              this.unpackedFiles[groupId][fileId] = null;
              if (this.index.fileCapacities[groupId] == 1) {
                this.unpackedFiles[groupId] = null;
              }
            } else {
              if (this.fileRetentionMode == 2) {
                this.unpackedFiles[groupId] = null;
              }
            }
          }
          stackIn_29_0 = fileBytesOrFailure;
          return (byte[]) (stackIn_29_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          fileBytesOrFailure = decompiledCaughtException;
          stackIn_32_0 = fileBytesOrFailure;
          stackIn_32_1 = new StringBuilder().append("kl.T(");
          if (xteaKey == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) (stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(obfuscationGuard).append(',').append(fileId).append(',').append(groupId).append(')').toString());
        }
    }

    final boolean ensureGroupAvailableByName(int obfuscationGuard, String groupName) {
        int groupId = 0;
        RuntimeException var3 = null;
        CharSequence groupNameCharacters = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndex((byte) 82)) {
            return false;
          }
          if (obfuscationGuard != 28979) {
            field_a = (BattleCamera) (this.packedGroups[6]);
          }
          groupName = groupName.toLowerCase();
          groupNameCharacters = (CharSequence) ((Object) groupName);
          groupId = this.index.groupNameLookup.get(rs.a((byte) -116, groupNameCharacters), 1);
          stackIn_6_0 = this.ensureGroupAvailable(obfuscationGuard - 17085, groupId);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("kl.N(").append(obfuscationGuard).append(',');
          if (groupName == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        connectedState = null;
        if (param0 != -1) {
          return;
        }
        field_a = null;
        field_f = null;
        field_d = null;
    }

    final boolean ensureFileAvailableByName(int obfuscationGuard, String fileName, String groupName) {
        int groupId = 0;
        RuntimeException var4 = null;
        int fileId = 0;
        CharSequence groupNameCharacters = null;
        CharSequence fileNameCharacters = null;
        boolean stackIn_10_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndex((byte) 82)) {
            return false;
          }
          groupName = groupName.toLowerCase();
          fileName = fileName.toLowerCase();
          groupNameCharacters = (CharSequence) ((Object) groupName);
          groupId = this.index.groupNameLookup.get(rs.a((byte) -116, groupNameCharacters), 1);
          if (!this.isValidGroup(groupId, -24876)) {
            return false;
          }
          if (obfuscationGuard > -51) {
            stackIn_10_0 = ((boolean[]) (this.packedGroups[13]))[11];
            return stackIn_10_0;
          }
          fileNameCharacters = (CharSequence) ((Object) fileName);
          fileId = this.index.fileNameLookups[groupId].get(rs.a((byte) -116, fileNameCharacters), 1);
          stackIn_12_0 = this.ensureFileAvailable(groupId, fileId, 0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("kl.W(").append(obfuscationGuard).append(',');
          if (fileName == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (groupName == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final synchronized byte[] getFlatFile(int id, byte obfuscationGuard) {
        if (!this.ensureIndex((byte) 82)) {
          return null;
        }
        if (obfuscationGuard != 81) {
          this.ensureGroupAvailable(21, 79);
        }
        if (this.index.fileCapacities.length == 1) {
          return this.getFile((byte) 99, id, 0);
        }
        if (!this.isValidGroup(id, obfuscationGuard ^ -24955)) {
          return null;
        }
        if (1 == this.index.fileCapacities[id]) {
          return this.getFile((byte) 94, 0, id);
        }
        throw new RuntimeException();
    }

    final int getGroupCapacity(int obfuscationGuard) {
        if (!this.ensureIndex((byte) 82)) {
          return -1;
        }
        if (obfuscationGuard >= -96) {
          ResourceArchive.b(52);
        }
        return this.index.fileCapacities.length;
    }

    final synchronized int[] getFileIds(int obfuscationGuard, int groupId) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard > -24) {
          ((int[]) (this.packedGroups[0]))[43] = ((int[]) (((Object[]) (((Object[]) (this.packedGroups[0]))[13]))[2]))[6];
        }
        if (!this.isValidGroup(groupId, -24876)) {
          return null;
        }
        int[] var3 = this.index.fileIds[groupId];
        if (var3 == null) {
          var6 = new int[this.index.fileCounts[groupId]];
          var3 = var6;
          for (var4 = 0; var4 < var6.length; var4++) {
            var6[var4] = var4;
          }
        }
        return var3;
    }

    private final synchronized boolean isValidFile(int groupId, int obfuscationGuard, int fileId) {
        if (!this.ensureIndex((byte) 82)) {
          return false;
        }
        if (obfuscationGuard != 0) {
          this.fileRetentionMode = -128;
        }
        if (groupId >= 0 &&
          fileId >= 0 &&
          this.index.fileCapacities.length > groupId &&
          this.index.fileCapacities[groupId] > fileId) {
          return true;
        }
        if (wh.field_f) {
          throw new IllegalArgumentException(groupId + " " + fileId);
        }
        return false;
    }

    final static int c(int param0, int param1, int param2) {
        int var3 = -33 % ((param1 - 33) / 62);
        if (2 > param2) {
          if (5 > param0) {
            return 0;
          }
          return 1;
        }
        return 2;
    }

    final int getGroupId(String groupName, int obfuscationGuard) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndex((byte) 82)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          groupName = groupName.toLowerCase();
          if (obfuscationGuard < 89) {
            field_f = (String) (((Object[]) (this.packedGroups[9]))[6]);
          }
          var4 = (CharSequence) ((Object) groupName);
          var3_int = this.index.groupNameLookup.get(rs.a((byte) -116, var4), 1);
          if (this.isValidGroup(var3_int, -24876)) {
            return var3_int;
          }
          stackIn_9_0 = -1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("kl.O(");
          if (groupName == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final synchronized boolean ensureGroupAvailable(int obfuscationGuard, int groupId) {
        if (!this.isValidGroup(groupId, obfuscationGuard - 36770)) {
          return false;
        }
        if (this.packedGroups[groupId] != null) {
          return true;
        }
        if (obfuscationGuard != 11894) {
          field_d = (String) (((Object[]) (((Object[]) (this.packedGroups[8]))[7]))[5]);
        }
        this.loadPackedGroup(true, groupId);
        if (this.packedGroups[groupId] != null) {
          return true;
        }
        return false;
    }

    final synchronized boolean ensureFileAvailable(int groupId, int fileId, int obfuscationGuard) {
        if (!this.isValidFile(groupId, obfuscationGuard, fileId)) {
          return false;
        }
        if (null != this.unpackedFiles[groupId] &&
          this.unpackedFiles[groupId][fileId] != null) {
          return true;
        }
        if (null != this.packedGroups[groupId]) {
          return true;
        }
        this.loadPackedGroup(true, groupId);
        if (null != this.packedGroups[groupId]) {
          return true;
        }
        return false;
    }

    final synchronized boolean ensureAllGroupsAvailable(int obfuscationGuard) {
        int groupOrdinal = 0;
        int allGroupsAvailable;
        int groupId;
        int var5;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (!this.ensureIndex((byte) 82)) {
          return false;
        }
        allGroupsAvailable = 1;
        if (obfuscationGuard != -27927) {
          ResourceArchive.c(((int[]) (this.packedGroups[1]))[2], 24, 50);
        }
        for (groupOrdinal = 0; this.index.groupIds.length > groupOrdinal; groupOrdinal++) {
          groupId = this.index.groupIds[groupOrdinal];
          if (this.packedGroups[groupId] == null) {
            this.loadPackedGroup(true, groupId);
            if (null == this.packedGroups[groupId]) {
              allGroupsAvailable = 0;
            }
          }
        }
        return allGroupsAvailable != 0;
    }

    private final synchronized boolean isValidGroup(int groupId, int obfuscationGuard) {
        if (obfuscationGuard != -24876) {
          return true;
        }
        if (!this.ensureIndex((byte) 82)) {
          return false;
        }
        if (groupId >= 0 &&
          groupId < this.index.fileCapacities.length &&
          this.index.fileCapacities[groupId] != 0) {
          return true;
        }
        if (!wh.field_f) {
          return false;
        }
        throw new IllegalArgumentException(Integer.toString(groupId));
    }

    final synchronized boolean ensureIndex(byte obfuscationGuard) {
        if (obfuscationGuard != 82) {
          this.getOverallProgress(-110);
        }
        if (null != this.index) {
          return true;
        }
        this.index = this.provider.getIndex(obfuscationGuard ^ 20097);
        if (null == this.index) {
          return false;
        }
        this.unpackedFiles = new Object[this.index.groupCapacity][];
        this.packedGroups = new Object[this.index.groupCapacity];
        return true;
    }

    final boolean containsGroupName(byte obfuscationGuard, String groupName) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndex((byte) 82)) {
            return false;
          }
          groupName = groupName.toLowerCase();
          if (obfuscationGuard > -127) {
            return true;
          }
          var4 = (CharSequence) ((Object) groupName);
          var3_int = this.index.groupNameLookup.get(rs.a((byte) -116, var4), 1);
          if (0 <= var3_int) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("kl.C(").append(obfuscationGuard).append(',');
          if (groupName == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int getFileId(byte obfuscationGuard, int groupId, String fileName) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -107 % ((76 - obfuscationGuard) / 40);
          if (!this.isValidGroup(groupId, -24876)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          fileName = fileName.toLowerCase();
          var6 = (CharSequence) ((Object) fileName);
          var5 = this.index.fileNameLookups[groupId].get(rs.a((byte) -116, var6), 1);
          if (this.isValidFile(groupId, 0, var5)) {
            stackIn_8_0 = var5;
            return stackIn_8_0;
          }
          stackIn_6_0 = -1;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("kl.H(").append(obfuscationGuard).append(',').append(groupId).append(',');
          if (fileName == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void c(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_17_0 = false;
        boolean stackIn_24_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          var1_int = AiPlanningStrategy.pointerX;
          var2 = ko.pointerY;
          if (param0 != -20193) {
            field_d = (String) null;
          }
          stackIn_5_0 = (DeployEvent.pointerPressButton != 1) ? 0 : 1;
          var3 = stackIn_5_0;
          stackIn_8_0 = (ProgressMessageDialog.pointerButton != 1) ? 0 : 1;
          var4 = stackIn_8_0;
          TurnEffectEvent.field_z.updateInput(87, var4 != 0, var3 != 0, var1_int, var2, el.field_d);
          while (true) {
            if (!Unit.pollKeyEvent((byte) -61)) {
              return;
            }
            if (13 == rs.keyCode) {
              CipherPacketBuffer.a(true, 0, param0 + 20194, jt.field_a);
            }
            if (12 == rs.keyCode) {
              stackIn_17_0 = !(CoatOfArms.field_e);
              CoatOfArms.field_e = stackIn_17_0;
            }
            if (rs.keyCode != 11) {
              continue;
            }
            if (BufferedSocket.field_j < 2) {
              continue;
            }
            break;
          }
          stackIn_24_0 = !(jv.field_a);
          jv.field_a = stackIn_24_0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "kl.G(" + param0 + ')');
        }
    }

    final synchronized byte[] getFileByName(String fileName, int obfuscationGuard, String groupName) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int groupId = 0;
        int fileId = 0;
        CharSequence groupNameCharacters = null;
        CharSequence fileNameCharacters = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndex((byte) 82)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          groupName = groupName.toLowerCase();
          fileName = fileName.toLowerCase();
          var4_int = 119 % ((obfuscationGuard + 36) / 44);
          groupNameCharacters = (CharSequence) ((Object) groupName);
          groupId = this.index.groupNameLookup.get(rs.a((byte) -116, groupNameCharacters), 1);
          if (!this.isValidGroup(groupId, -24876)) {
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          fileNameCharacters = (CharSequence) ((Object) fileName);
          fileId = this.index.fileNameLookups[groupId].get(rs.a((byte) -116, fileNameCharacters), 1);
          stackIn_7_0 = this.getFile((byte) 119, fileId, groupId);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("kl.DA(");
          if (fileName == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(obfuscationGuard).append(',');
          if (groupName == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final synchronized boolean ensureFlatFileAvailable(int id, byte obfuscationGuard) {
        if (!this.ensureIndex((byte) 82)) {
          return false;
        }
        if (obfuscationGuard != -56) {
          field_d = (String) null;
        }
        if (1 == this.index.fileCapacities.length) {
          return this.ensureFileAvailable(0, id, 0);
        }
        if (!this.isValidGroup(id, obfuscationGuard ^ 24860)) {
          return false;
        }
        if (this.index.fileCapacities[id] == 1) {
          return this.ensureFileAvailable(id, 0, obfuscationGuard + 56);
        }
        throw new RuntimeException();
    }

    final int getFileCapacity(int groupId, int obfuscationGuard) {
        if (obfuscationGuard != -2) {
          return -27;
        }
        if (!this.isValidGroup(groupId, -24876)) {
          return 0;
        }
        return this.index.fileCapacities[groupId];
    }

    final byte[] getFile(byte obfuscationGuard, int fileId, int groupId) {
        if (obfuscationGuard <= 42) {
          return (byte[]) null;
        }
        return this.getFileWithKeys((int[]) null, 116, fileId, groupId);
    }

    private final synchronized boolean unpackGroup(int requestedFileId, int obfuscationGuard, int[] xteaKey, int groupId) {
        Object[] newFileSlots = null;
        int presentFileOrdinal = 0;
        int var20 = 0;
        byte[] newFileBytes = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        boolean stackIn_34_2 = false;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        int fileCount = 0;
        RuntimeException unpackFailure = null;
        int[] groupFileIds = null;
        Object[] fileSlots = null;
        int allFilesPresent = 0;
        byte[] encodedGroup = null;
        int presentFileId = 0;
        RuntimeException decompressionFailure = null;
        int var11 = 0;
        int chunkCount = 0;
        int[] fileSizesOrOffsets = null;
        int selectedFileSize = 0;
        int var15_int = 0;
        byte[][] splitFileArrays = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int candidateFileId = 0;
        int var22 = 0;
        byte[] decompressedBytes = null;
        int[] fileIdTableAlias = null;
        byte[] encryptedCopyAlias = null;
        PacketBuffer decryptionPacket = null;
        byte[] decompressedAlias = null;
        PacketBuffer selectedFileTable = null;
        PacketBuffer allFileTable = null;
        int[] sizeTableAlias = null;
        byte[][] splitArrayAlias = null;
        int[] fileIdTable = null;
        byte[] encryptedGroupCopy = null;
        byte[] groupData = null;
        int[] sizesOrWriteOffsets = null;
        byte[][] splitFiles = null;
        byte[] splitData = null;
        byte[] selectedFileBytes = null;
        int selectedFileWriteOffset;
        var22 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (!this.isValidGroup(groupId, -24876)) {
            return false;
          }
          if (null == this.packedGroups[groupId]) {
            return false;
          }
          fileCount = this.index.fileCounts[groupId];
          fileIdTable = this.index.fileIds[groupId];
          fileIdTableAlias = fileIdTable;
          groupFileIds = fileIdTableAlias;
          if (this.unpackedFiles[groupId] == null) {
            newFileSlots = new Object[this.index.fileCapacities[groupId]];
            this.unpackedFiles[groupId] = newFileSlots;
          }
          fileSlots = this.unpackedFiles[groupId];
          allFilesPresent = 1;
          for (presentFileOrdinal = obfuscationGuard; fileCount > presentFileOrdinal; presentFileOrdinal++) {
            if (groupFileIds == null) {
              presentFileId = presentFileOrdinal;
            } else {
              presentFileId = fileIdTable[presentFileOrdinal];
            }
            if (fileSlots[presentFileId] != null) {
              continue;
            }
            allFilesPresent = 0;
            break;
          }
          if (allFilesPresent != 0) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (xteaKey != null && (xteaKey[0] != 0 ||
            0 != xteaKey[1] ||
            xteaKey[2] != 0 ||
            xteaKey[3] != 0)) {
            encryptedGroupCopy = ko.getStoredBytes(true, 42, this.packedGroups[groupId]);
            encryptedCopyAlias = encryptedGroupCopy;
            encodedGroup = encryptedCopyAlias;
            decryptionPacket = new PacketBuffer(encryptedGroupCopy);
            decryptionPacket.decryptXteaRange(xteaKey, decryptionPacket.payload.length, 5, -12366);
            decompiledFrameRemainder0 = false;
          }
          else {
            encodedGroup = ko.getStoredBytes(false, 87, this.packedGroups[groupId]);
          }
          try {
            groupData = el.decompressContainer(false, encodedGroup);
            decompressedAlias = groupData;
            decompressedBytes = decompressedAlias;
            splitData = decompressedBytes;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            decompressionFailure = decompiledCaughtException;
            stackIn_33_0 = decompressionFailure;
            stackIn_33_1 = new StringBuilder();
            stackIn_34_2 = (xteaKey != null);
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(" ").append(groupId).append(" ").append(encodedGroup.length).append(" ").append(ValidationStatusWidget.a(encodedGroup, encodedGroup.length, 113)).append(" ").append(ValidationStatusWidget.a(encodedGroup, -2 + encodedGroup.length, 115)).append(" ").append(this.index.groupCrcs[groupId]).append(" ").append(this.index.indexCrc).toString());
          }
          if (this.discardPackedGroups) {
            this.packedGroups[groupId] = null;
          }
          if (fileCount > 1) {
            if (this.fileRetentionMode == 2) {
              var11 = groupData.length;
              var11--;
              chunkCount = decompressedBytes[var11] & 255;
              var11 = var11 - chunkCount * fileCount * 4;
              selectedFileTable = new PacketBuffer(splitData);
              selectedFileSize = 0;
              var15_int = 0;
              selectedFileTable.position = var11;
              for (var16 = 0; var16 < chunkCount; var16++) {
                var17 = 0;
                for (var18 = 0; var18 < fileCount; var18++) {
                  var17 = var17 + selectedFileTable.readInt(1);
                  if (groupFileIds != null) {
                    var19 = fileIdTable[var18];
                  } else {
                    var19 = var18;
                  }
                  if (requestedFileId == var19) {
                    selectedFileSize = selectedFileSize + var17;
                    var15_int = var19;
                  }
                }
              }
              if (0 == selectedFileSize) {
                return true;
              }
              selectedFileBytes = new byte[selectedFileSize];
              selectedFileTable.position = var11;
              selectedFileWriteOffset = 0;
              var17 = 0;
              for (var18 = 0; var18 < chunkCount; var18++) {
                var19 = 0;
                for (var20 = 0; fileCount > var20; var20++) {
                  var19 = var19 + selectedFileTable.readInt(obfuscationGuard ^ 1);
                  if (groupFileIds != null) {
                    candidateFileId = fileIdTable[var20];
                  } else {
                    candidateFileId = var20;
                  }
                  if (candidateFileId == requestedFileId) {
                    vm.a(splitData, var17, selectedFileBytes, selectedFileWriteOffset, var19);
                    selectedFileWriteOffset = selectedFileWriteOffset + var19;
                  }
                  var17 = var17 + var19;
                }
              }
              fileSlots[var15_int] = selectedFileBytes;
            } else {
              var11 = groupData.length;
              var11--;
              chunkCount = 255 & decompressedBytes[var11];
              var11 = var11 - 4 * (chunkCount * fileCount);
              allFileTable = new PacketBuffer(splitData);
              sizesOrWriteOffsets = new int[fileCount];
              sizeTableAlias = sizesOrWriteOffsets;
              fileSizesOrOffsets = sizeTableAlias;
              allFileTable.position = var11;
              for (var15_int = 0; chunkCount > var15_int; var15_int++) {
                var16 = 0;
                for (var17 = 0; var17 < fileCount; var17++) {
                  var16 = var16 + allFileTable.readInt(obfuscationGuard + 1);
                  fileSizesOrOffsets[var17] = fileSizesOrOffsets[var17] + var16;
                }
              }
              splitFiles = new byte[fileCount][];
              splitArrayAlias = splitFiles;
              splitFileArrays = splitArrayAlias;
              for (var16 = 0; var16 < fileCount; var16++) {
                newFileBytes = new byte[sizesOrWriteOffsets[var16]];
                splitFileArrays[var16] = newFileBytes;
                sizesOrWriteOffsets[var16] = 0;
              }
              allFileTable.position = var11;
              var16 = 0;
              for (var17 = 0; chunkCount > var17; var17++) {
                var18 = 0;
                for (var19 = 0; var19 < fileCount; var19++) {
                  var18 = var18 + allFileTable.readInt(1);
                  vm.a(splitData, var16, splitFiles[var19], sizesOrWriteOffsets[var19], var18);
                  var16 = var16 + var18;
                  fileSizesOrOffsets[var19] = fileSizesOrOffsets[var19] + var18;
                }
              }
              for (var17 = 0; var17 < fileCount; var17++) {
                if (groupFileIds != null) {
                  var18 = fileIdTable[var17];
                } else {
                  var18 = var17;
                }
                if (0 != this.fileRetentionMode) {
                  fileSlots[var18] = splitFiles[var17];
                } else {
                  fileSlots[var18] = LoginMethod.storeBytes(obfuscationGuard + 0, splitFiles[var17], false);
                }
              }
            }
          } else {
            if (groupFileIds == null) {
              var11 = 0;
            } else {
              var11 = fileIdTable[0];
            }
            if (this.fileRetentionMode != 0) {
              fileSlots[var11] = groupData;
              return true;
            }
            fileSlots[var11] = LoginMethod.storeBytes(0, splitData, false);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          unpackFailure = decompiledCaughtException;
          stackIn_103_0 = unpackFailure;
          stackIn_103_1 = new StringBuilder().append("kl.U(").append(requestedFileId).append(',').append(obfuscationGuard).append(',');
          if (xteaKey == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',').append(groupId).append(')').toString());
        }
    }

    final int getGroupProgressByName(String groupName, byte obfuscationGuard) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 98 % ((obfuscationGuard - 39) / 43);
          if (!this.ensureIndex((byte) 82)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          groupName = groupName.toLowerCase();
          var5 = (CharSequence) ((Object) groupName);
          var4 = this.index.groupNameLookup.get(rs.a((byte) -116, var5), 1);
          stackIn_4_0 = this.getGroupProgress(var4, (byte) 73);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kl.D(");
          if (groupName == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    ResourceArchive(ArchiveProvider provider, boolean discardPackedGroups, int fileRetentionMode) {
        this.index = null;
        try {
          if (fileRetentionMode < 0 ||
            fileRetentionMode > 2) {
            throw new IllegalArgumentException("");
          }
          this.provider = provider;
          this.discardPackedGroups = discardPackedGroups ? true : false;
          this.fileRetentionMode = fileRetentionMode;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "kl.<init>(" + (provider != null ? "{...}" : "null") + ',' + discardPackedGroups + ',' + fileRetentionMode + ')');
        }
    }

    final synchronized int getGroupProgress(int groupId, byte obfuscationGuard) {
        if (!this.isValidGroup(groupId, -24876)) {
          return 0;
        }
        if (this.packedGroups[groupId] != null) {
          return 100;
        }
        if (obfuscationGuard != 73) {
          ResourceArchive.b(-64);
        }
        return this.provider.getGroupProgress(5926, groupId);
    }

    private final synchronized void loadPackedGroup(boolean obfuscationGuard, int groupId) {
        if (!obfuscationGuard) {
          this.packedGroups = (Object[]) (this.packedGroups[2]);
        }
        if (!this.discardPackedGroups) {
          this.packedGroups[groupId] = LoginMethod.storeBytes(0, this.provider.getEncodedGroup(groupId, 4), false);
        } else {
          this.packedGroups[groupId] = this.provider.getEncodedGroup(groupId, 4);
        }
    }

    static {
        connectedState = new ClientConnectionState();
        field_d = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_f = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        livePointerY = -1;
    }
}
