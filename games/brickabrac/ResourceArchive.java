/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ResourceArchive {
    private Object[][] decodedFiles;
    static NodeDeque field_i;
    static int field_c;
    private ArchiveSource source;
    int decodedFilePolicy;
    private ArchiveIndex index;
    private Object[] packedGroups;
    static cp field_f;
    static String field_e;
    boolean discardPackedGroups;
    static RgbSprite[] field_a;
    static int[] field_d;

    public static void a(boolean param0) {
        field_e = null;
        field_f = null;
        field_a = null;
        if (param0) {
          String var2 = (String) null;
          ResourceArchive.a((byte) -93, (String) null);
        }
        field_i = null;
        field_d = null;
    }

    final synchronized byte[] takeFileByName(int obfuscationGuard, String groupName, String fileName) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndex((byte) -127)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          groupName = groupName.toLowerCase();
          fileName = fileName.toLowerCase();
          var5 = 110 % ((obfuscationGuard - 33) / 51);
          var7 = (CharSequence) ((Object) groupName);
          var4_int = this.index.groupNameIndex.findIndex(ni.hashArchiveName(-128, var7), (byte) -94);
          if (!this.isValidGroup(0, var4_int)) {
            return null;
          }
          var8 = (CharSequence) ((Object) fileName);
          var6 = this.index.fileNameIndexes[var4_int].findIndex(ni.hashArchiveName(-110, var8), (byte) -106);
          stackIn_7_0 = this.takeFile(var6, var4_int, 4);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("mf.J(").append(obfuscationGuard).append(',');
          if (groupName == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (fileName == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final synchronized void loadPackedGroup(int groupId, byte obfuscationGuard) {
        if (obfuscationGuard != -78) {
          return;
        }
        if (!this.discardPackedGroups) {
          this.packedGroups[groupId] = TableDataRequest.storeArchiveBytes(obfuscationGuard - 39, this.source.getPackedGroup(groupId, (byte) -51), false);
        } else {
          this.packedGroups[groupId] = this.source.getPackedGroup(groupId, (byte) -121);
        }
    }

    final synchronized boolean ensureIndex(byte obfuscationGuard) {
        if (obfuscationGuard != -127) {
          return false;
        }
        if (null != this.index) {
          return true;
        }
        this.index = this.source.getIndex((byte) -112);
        if (this.index == null) {
          return false;
        }
        this.decodedFiles = new Object[this.index.groupCapacity][];
        this.packedGroups = new Object[this.index.groupCapacity];
        return true;
    }

    final int getFileCapacity(int obfuscationGuard, int groupId) {
        if (obfuscationGuard > -69) {
          ((byte[]) (this.packedGroups[0]))[0] = (byte) 85;
        }
        if (!this.isValidGroup(0, groupId)) {
          return 0;
        }
        return this.index.fileCapacities[groupId];
    }

    final boolean ensureGroupAvailableByName(String groupName, int obfuscationGuard) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndex((byte) -127)) {
            return false;
          }
          groupName = groupName.toLowerCase();
          if (obfuscationGuard != -28138) {
            field_a = (RgbSprite[]) null;
          }
          var4 = (CharSequence) ((Object) groupName);
          var3_int = this.index.groupNameIndex.findIndex(ni.hashArchiveName(obfuscationGuard + 28015, var4), (byte) -85);
          stackIn_7_0 = this.ensureGroupAvailable(obfuscationGuard + 15055, var3_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("mf.L(");
          if (groupName == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final int getGroupCapacity(int obfuscationGuard) {
        if (!this.ensureIndex((byte) -127)) {
          return -1;
        }
        if (obfuscationGuard >= -86) {
          field_d = (int[]) null;
        }
        return this.index.fileCapacities.length;
    }

    final int getGroupId(String groupName, boolean obfuscationGuard) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndex((byte) -127)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          if (obfuscationGuard) {
            var4 = (String) null;
            this.getGroupId((String) null, true);
          }
          groupName = groupName.toLowerCase();
          var5 = (CharSequence) ((Object) groupName);
          var3_int = this.index.groupNameIndex.findIndex(ni.hashArchiveName(-121, var5), (byte) -86);
          if (this.isValidGroup(0, var3_int)) {
            stackIn_10_0 = var3_int;
            return stackIn_10_0;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("mf.U(");
          if (groupName == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final boolean ensureFileAvailableByName(String fileName, String groupName, int obfuscationGuard) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndex((byte) -127)) {
            return false;
          }
          groupName = groupName.toLowerCase();
          fileName = fileName.toLowerCase();
          var6 = (CharSequence) ((Object) groupName);
          var4_int = this.index.groupNameIndex.findIndex(ni.hashArchiveName(-112, var6), (byte) -91);
          if (!this.isValidGroup(obfuscationGuard, var4_int)) {
            return false;
          }
          var7 = (CharSequence) ((Object) fileName);
          var5 = this.index.fileNameIndexes[var4_int].findIndex(ni.hashArchiveName(-109, var7), (byte) -114);
          stackIn_9_0 = this.ensureFileAvailable(var5, var4_int, (byte) 102);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("mf.T(");
          if (fileName == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (groupName == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final synchronized int getGroupProgress(int groupId, int obfuscationGuard) {
        if (!this.isValidGroup(0, groupId)) {
          return 0;
        }
        if (obfuscationGuard != -27509) {
          field_a = (RgbSprite[]) null;
        }
        if (null != this.packedGroups[groupId]) {
          return 100;
        }
        return this.source.getGroupProgress((byte) -97, groupId);
    }

    final synchronized byte[] takeFlatFile(int id, byte obfuscationGuard) {
        if (!this.ensureIndex((byte) -127)) {
          return null;
        }
        if (1 == this.index.fileCapacities.length) {
          return this.takeFile(id, 0, 4);
        }
        if (!this.isValidGroup(0, id)) {
          return null;
        }
        if (this.index.fileCapacities[id] == 1) {
          return this.takeFile(0, id, 4);
        }
        if (obfuscationGuard < 19) {
          return (byte[]) null;
        }
        throw new RuntimeException();
    }

    final synchronized boolean ensureAllGroupsAvailable(int obfuscationGuard) {
        int var2;
        int var3;
        int var4;
        int var5;
        String var6;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (!this.ensureIndex((byte) -127)) {
          return false;
        }
        var2 = 1;
        var3 = 0;
        if (obfuscationGuard <= 88) {
          var6 = (String) null;
          this.takeFileByName(-39, (String) (this.packedGroups[1]), (String) null);
        }
        while (var3 < this.index.groupIds.length) {
          var4 = this.index.groupIds[var3];
          if (null == this.packedGroups[var4]) {
            this.loadPackedGroup(var4, (byte) -78);
            if (this.packedGroups[var4] == null) {
              var2 = 0;
            }
          }
          var3++;
        }
        return var2 != 0;
    }

    final int getGroupProgressByName(int obfuscationGuard, String groupName) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndex((byte) -127)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          if (obfuscationGuard != 0) {
            stackIn_5_0 = 48;
            return stackIn_5_0;
          }
          groupName = groupName.toLowerCase();
          var4 = (CharSequence) ((Object) groupName);
          var3_int = this.index.groupNameIndex.findIndex(ni.hashArchiveName(-120, var4), (byte) -94);
          stackIn_7_0 = this.getGroupProgress(var3_int, -27509);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("mf.R(").append(obfuscationGuard).append(',');
          if (groupName == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean hasGroupName(int obfuscationGuard, String groupName) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndex((byte) -127)) {
            return false;
          }
          groupName = groupName.toLowerCase();
          var3_int = 12 % ((obfuscationGuard - 59) / 33);
          var5 = (CharSequence) ((Object) groupName);
          var4 = this.index.groupNameIndex.findIndex(ni.hashArchiveName(-128, var5), (byte) -84);
          if (var4 >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("mf.K(").append(obfuscationGuard).append(',');
          if (groupName == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final synchronized byte[] takeFile(int obfuscationGuard, int groupId, int fileId, int[] xteaKey) {
        Object stackIn_2_0 = null;
        byte[] stackIn_12_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!this.isValidFile(true, fileId, groupId)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          var5 = null;
          if ((null == this.decodedFiles[groupId] ||
            null == this.decodedFiles[groupId][fileId]) && !this.unpackGroup(122, xteaKey, groupId, fileId)) {
            this.loadPackedGroup(groupId, (byte) -78);
            if (!this.unpackGroup(106, xteaKey, groupId, fileId)) {
              return null;
            }
          }
          if (obfuscationGuard != 646) {
            stackIn_12_0 = (byte[]) null;
            return stackIn_12_0;
          }
          if (this.decodedFiles[groupId] == null) {
            throw new RuntimeException("");
          }
          if (this.decodedFiles[groupId][fileId] != null) {
            var7 = be.readArchiveBytes(false, this.decodedFiles[groupId][fileId], false);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.decodedFilePolicy != 1) {
              if (this.decodedFilePolicy == 2) {
                this.decodedFiles[groupId] = null;
              }
            } else {
              this.decodedFiles[groupId][fileId] = null;
              if (this.index.fileCapacities[groupId] == 1) {
                this.decodedFiles[groupId] = null;
              }
            }
          }
          stackIn_28_0 = var5;
          return (byte[]) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("mf.F(").append(obfuscationGuard).append(',').append(groupId).append(',').append(fileId).append(',');
          if (xteaKey == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) (stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final byte[] takeFile(int fileId, int groupId, int obfuscationGuard) {
        if (obfuscationGuard != 4) {
          return (byte[]) null;
        }
        return this.takeFile(646, groupId, fileId, (int[]) null);
    }

    final synchronized boolean ensureFileAvailable(int fileId, int groupId, byte obfuscationGuard) {
        if (!this.isValidFile(true, fileId, groupId)) {
          return false;
        }
        if (null != this.decodedFiles[groupId] &&
          this.decodedFiles[groupId][fileId] != null) {
          return true;
        }
        if (null != this.packedGroups[groupId]) {
          return true;
        }
        this.loadPackedGroup(groupId, (byte) -78);
        if (null != this.packedGroups[groupId]) {
          return true;
        }
        if (obfuscationGuard != 102) {
          return ((boolean[]) (this.packedGroups[3]))[5];
        }
        return false;
    }

    final synchronized int getProgress(int obfuscationGuard) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (!this.ensureIndex((byte) -127)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; this.packedGroups.length > var4; var4++) {
          if (this.index.fileCounts[var4] > 0) {
            var2 += 100;
            var3 = var3 + this.getGroupProgress(var4, -27509);
          }
        }
        if (0 == var2) {
          return 100;
        }
        var4Lifetime1 = var3 * 100 / var2;
        if (obfuscationGuard == -4126) {
          return var4Lifetime1;
        }
        return 74;
    }

    private final synchronized boolean isValidFile(boolean validate, int fileId, int groupId) {
        if (!validate) {
          return true;
        }
        if (!this.ensureIndex((byte) -127)) {
          return false;
        }
        if (groupId < 0 ||
          fileId < 0 ||
          groupId >= this.index.fileCapacities.length ||
          fileId >= this.index.fileCapacities[groupId]) {
          if (!BoundedFile.field_n) {
            return false;
          }
          throw new IllegalArgumentException(groupId + " " + fileId);
        }
        return true;
    }

    private final synchronized boolean isValidGroup(int minimumGroupId, int groupId) {
        if (!this.ensureIndex((byte) -127)) {
          return false;
        }
        if (minimumGroupId <= groupId &&
          this.index.fileCapacities.length > groupId &&
          0 != this.index.fileCapacities[groupId]) {
          return true;
        }
        if (BoundedFile.field_n) {
          throw new IllegalArgumentException(Integer.toString(groupId));
        }
        return false;
    }

    final int getFileId(int groupId, int obfuscationGuard, String fileName) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.isValidGroup(0, groupId)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          fileName = fileName.toLowerCase();
          var5 = (CharSequence) ((Object) fileName);
          var4_int = this.index.fileNameIndexes[groupId].findIndex(ni.hashArchiveName(-115, var5), (byte) -109);
          if (!this.isValidFile(true, var4_int, groupId)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          if (obfuscationGuard >= -13) {
            this.ensureAllGroupsAvailable(((int[]) (((Object[]) (((Object[]) (this.packedGroups[7]))[5]))[0]))[0]);
          }
          stackIn_9_0 = var4_int;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("mf.Q(").append(groupId).append(',').append(obfuscationGuard).append(',');
          if (fileName == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static lo a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_7_0 = null;
        lo stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = 0;
          while (true) {
            if (var3 >= var2_int) {
              if (param0 > -58) {
                ResourceArchive.a(false);
              }
              stackIn_12_0 = GameCanvas.field_c;
              return stackIn_12_0;
            }
            var4 = param1.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 <= 57) {
              var3++;
              continue;
            }
            break;
          }
          stackIn_7_0 = null;
          return (lo) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("mf.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final synchronized boolean unpackGroup(int obfuscationGuard, int[] xteaKey, int groupId, int requestedFileId) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        boolean stackIn_35_2 = false;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_107_2 = null;
        RuntimeException decompiledCaughtException = null;
        int fileCount = 0;
        RuntimeException var5 = null;
        int[] fileIds = null;
        Object[] files = null;
        int allFilesReady = 0;
        byte[] packedBytes = null;
        int cachedFileId = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int chunkCount = 0;
        int[] fileSizesAndOffsets = null;
        int requestedLength = 0;
        int selectedFileId = 0;
        byte[][] splitFiles = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] decodedGroupBytes = null;
        int[] fileIdsAlias = null;
        byte[] encryptedGroupCopy = null;
        PacketBuffer decryptPacket = null;
        byte[] decodedBytesAlias = null;
        PacketBuffer requestedChunkTable = null;
        PacketBuffer allFilesChunkTable = null;
        int[] fileSizesAlias = null;
        byte[][] splitFilesAlias = null;
        int[] presentFileIds = null;
        byte[] groupCopyForDecrypt = null;
        byte[] uncompressedBytes = null;
        int[] fileSizes = null;
        byte[][] fileBytes = null;
        byte[] splitData = null;
        byte[] requestedBytes = null;
        int requestedWriteOffset;
        var22 = BrickABrac.field_J ? 1 : 0;
        try {
          if (!this.isValidGroup(0, groupId)) {
            return false;
          }
          if (null == this.packedGroups[groupId]) {
            return false;
          }
          fileCount = this.index.fileCounts[groupId];
          presentFileIds = this.index.fileIds[groupId];
          fileIdsAlias = presentFileIds;
          fileIds = fileIdsAlias;
          if (null == this.decodedFiles[groupId]) {
            array$0 = new Object[this.index.fileCapacities[groupId]];
            this.decodedFiles[groupId] = array$0;
          }
          files = this.decodedFiles[groupId];
          allFilesReady = 1;
          for (var9_int = 0; fileCount > var9_int; var9_int++) {
            if (fileIds != null) {
              cachedFileId = presentFileIds[var9_int];
            } else {
              cachedFileId = var9_int;
            }
            if (files[cachedFileId] != null) {
              continue;
            }
            allFilesReady = 0;
            break;
          }
          if (allFilesReady != 0) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (xteaKey != null && (0 != xteaKey[0] ||
            xteaKey[1] != 0 ||
            0 != xteaKey[2] ||
            xteaKey[3] != 0)) {
            groupCopyForDecrypt = be.readArchiveBytes(false, this.packedGroups[groupId], true);
            encryptedGroupCopy = groupCopyForDecrypt;
            packedBytes = encryptedGroupCopy;
            decryptPacket = new PacketBuffer(groupCopyForDecrypt);
            decryptPacket.decryptBlocks(xteaKey, 5, decryptPacket.data.length, (byte) 85);
            decompiledFrameRemainder0 = false;
          }
          else {
            packedBytes = be.readArchiveBytes(false, this.packedGroups[groupId], false);
          }
          try {
            uncompressedBytes = AchievementIcon.decompressArchiveContainer(true, packedBytes);
            decodedBytesAlias = uncompressedBytes;
            decodedGroupBytes = decodedBytesAlias;
            splitData = decodedGroupBytes;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_34_0 = var11_ref_RuntimeException;
            stackIn_34_1 = new StringBuilder();
            stackIn_35_2 = (xteaKey != null);
            throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(" ").append(groupId).append(" ").append(packedBytes.length).append(" ").append(NanoGameClock.a(packedBytes.length, packedBytes, (byte) -86)).append(" ").append(NanoGameClock.a(packedBytes.length - 2, packedBytes, (byte) -86)).append(" ").append(this.index.groupCrcs[groupId]).append(" ").append(this.index.indexCrc).toString());
          }
          if (this.discardPackedGroups) {
            this.packedGroups[groupId] = null;
          }
          if (fileCount > 1) {
            if (2 == this.decodedFilePolicy) {
              var11 = uncompressedBytes.length;
              var11--;
              chunkCount = decodedGroupBytes[var11] & 255;
              var11 = var11 - chunkCount * (fileCount * 4);
              requestedChunkTable = new PacketBuffer(splitData);
              requestedLength = 0;
              selectedFileId = 0;
              requestedChunkTable.position = var11;
              for (var16 = 0; var16 < chunkCount; var16++) {
                var17 = 0;
                for (var18 = 0; fileCount > var18; var18++) {
                  var17 = var17 + requestedChunkTable.readInt(255);
                  if (fileIds == null) {
                    var19 = var18;
                  } else {
                    var19 = presentFileIds[var18];
                  }
                  if (requestedFileId == var19) {
                    selectedFileId = var19;
                    requestedLength = requestedLength + var17;
                  }
                }
              }
              if (requestedLength == 0) {
                return true;
              }
              requestedBytes = new byte[requestedLength];
              requestedChunkTable.position = var11;
              requestedWriteOffset = 0;
              var17 = 0;
              for (var18 = 0; chunkCount > var18; var18++) {
                var19 = 0;
                for (var20 = 0; fileCount > var20; var20++) {
                  var19 = var19 + requestedChunkTable.readInt(255);
                  if (fileIds == null) {
                    var21 = var20;
                  } else {
                    var21 = presentFileIds[var20];
                  }
                  if (requestedFileId == var21) {
                    pm.a(splitData, var17, requestedBytes, requestedWriteOffset, var19);
                    requestedWriteOffset = requestedWriteOffset + var19;
                  }
                  var17 = var17 + var19;
                }
              }
              files[selectedFileId] = requestedBytes;
            } else {
              var11 = uncompressedBytes.length;
              var11--;
              chunkCount = 255 & decodedGroupBytes[var11];
              var11 = var11 - fileCount * chunkCount * 4;
              allFilesChunkTable = new PacketBuffer(splitData);
              allFilesChunkTable.position = var11;
              fileSizes = new int[fileCount];
              fileSizesAlias = fileSizes;
              fileSizesAndOffsets = fileSizesAlias;
              for (selectedFileId = 0; selectedFileId < chunkCount; selectedFileId++) {
                var16 = 0;
                for (var17 = 0; var17 < fileCount; var17++) {
                  var16 = var16 + allFilesChunkTable.readInt(255);
                  fileSizesAndOffsets[var17] = fileSizesAndOffsets[var17] + var16;
                }
              }
              fileBytes = new byte[fileCount][];
              splitFilesAlias = fileBytes;
              splitFiles = splitFilesAlias;
              for (var16 = 0; var16 < fileCount; var16++) {
                array$1 = new byte[fileSizes[var16]];
                splitFiles[var16] = array$1;
                fileSizes[var16] = 0;
              }
              allFilesChunkTable.position = var11;
              var16 = 0;
              for (var17 = 0; chunkCount > var17; var17++) {
                var18 = 0;
                for (var19 = 0; fileCount > var19; var19++) {
                  var18 = var18 + allFilesChunkTable.readInt(255);
                  pm.a(splitData, var16, fileBytes[var19], fileSizes[var19], var18);
                  var16 = var16 + var18;
                  fileSizesAndOffsets[var19] = fileSizesAndOffsets[var19] + var18;
                }
              }
              for (var17 = 0; var17 < fileCount; var17++) {
                if (fileIds == null) {
                  var18 = var17;
                } else {
                  var18 = presentFileIds[var17];
                }
                if (this.decodedFilePolicy != 0) {
                  files[var18] = fileBytes[var17];
                } else {
                  files[var18] = TableDataRequest.storeArchiveBytes(-128, fileBytes[var17], false);
                }
              }
            }
          } else {
            if (fileIds == null) {
              var11 = 0;
            } else {
              var11 = presentFileIds[0];
            }
            if (0 == this.decodedFilePolicy) {
              files[var11] = TableDataRequest.storeArchiveBytes(-123, splitData, false);
            } else {
              files[var11] = uncompressedBytes;
            }
          }
          if (obfuscationGuard >= 95) {
            return true;
          }
          field_i = (NodeDeque) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_106_0 = var5;
          stackIn_106_1 = new StringBuilder().append("mf.V(").append(obfuscationGuard).append(',');
          if (xteaKey == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(groupId).append(',').append(requestedFileId).append(')').toString());
        }
    }

    final synchronized boolean ensureGroupAvailable(int obfuscationGuard, int groupId) {
        boolean discarded$0 = false;
        if (!this.isValidGroup(0, groupId)) {
          return false;
        }
        if (obfuscationGuard != -13083) {
          discarded$0 = this.unpackGroup(-71, (int[]) null, ((int[]) (((Object[]) (((Object[]) (this.packedGroups[6]))[0]))[3]))[7], -35);
        }
        if (null != this.packedGroups[groupId]) {
          return true;
        }
        this.loadPackedGroup(groupId, (byte) -78);
        if (this.packedGroups[groupId] == null) {
          return false;
        }
        return true;
    }

    final boolean hasFileName(String fileName, String groupName, byte obfuscationGuard) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndex((byte) -127)) {
            return false;
          }
          groupName = groupName.toLowerCase();
          fileName = fileName.toLowerCase();
          var6 = (CharSequence) ((Object) groupName);
          var4_int = this.index.groupNameIndex.findIndex(ni.hashArchiveName(obfuscationGuard ^ 4, var6), (byte) -114);
          if (var4_int < 0) {
            return false;
          }
          var7 = (CharSequence) ((Object) fileName);
          var5 = this.index.fileNameIndexes[var4_int].findIndex(ni.hashArchiveName(-120, var7), (byte) -105);
          if (0 > var5) {
            return false;
          }
          if (obfuscationGuard == -121) {
            return true;
          }
          this.getProgress(-9);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("mf.A(");
          if (fileName == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (groupName == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    ResourceArchive(ArchiveSource source, boolean discardPackedGroups, int decodedFilePolicy) {
        this.index = null;
        try {
          if (decodedFilePolicy < 0 ||
            decodedFilePolicy > 2) {
            throw new IllegalArgumentException("");
          }
          this.source = source;
          this.discardPackedGroups = discardPackedGroups ? true : false;
          this.decodedFilePolicy = decodedFilePolicy;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "mf.<init>(" + (source != null ? "{...}" : "null") + ',' + discardPackedGroups + ',' + decodedFilePolicy + ')');
        }
    }

    static {
        field_i = new NodeDeque();
        field_e = "Type your email address again to make sure it's correct";
    }
}
