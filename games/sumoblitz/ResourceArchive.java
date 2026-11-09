/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ResourceArchive {
    private ArchiveIndex index;
    private boolean discardPackedGroups;
    static volatile boolean field_i;
    private int fileRetentionPolicy;
    static String field_j;
    private ArchiveProvider provider;
    static Random field_b;
    private Object[][] files;
    private Object[] packedGroups;
    static int selectedSpeedLevel;

    final synchronized byte[] fetchNamedFile(String fileName, String groupName, int guard) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.loadIndex((byte) 127)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          groupName = groupName.toLowerCase();
          fileName = fileName.toLowerCase();
          var6 = (CharSequence) ((Object) groupName);
          var4_int = this.index.groupNameIndex.findIndex(IntroMeshMaterial.hashCp1252(var6, guard - 44), (byte) -113);
          if (!this.isValidGroup(var4_int, true)) {
            return null;
          }
          if (guard != -1) {
            stackIn_8_0 = (byte[]) null;
            return stackIn_8_0;
          }
          var7 = (CharSequence) ((Object) fileName);
          var5 = this.index.fileNameIndices[var4_int].findIndex(IntroMeshMaterial.hashCp1252(var7, -84), (byte) 90);
          stackIn_10_0 = this.fetchFile((byte) 118, var5, var4_int);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ki.P(");
          if (fileName == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (groupName == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(guard).append(')').toString());
        }
    }

    final static AccountServiceResult pollAccountCreationResult(byte guard) {
        if (guard <= 80) {
          ResourceArchive.b(62);
        }
        if (ProxySocketConnector.accountCreationState == AccountRequestDefaults.IDLE) {
          throw new IllegalStateException();
        }
        if (DropTargetWidget.COMPLETE == ProxySocketConnector.accountCreationState) {
          ProxySocketConnector.accountCreationState = AccountRequestDefaults.IDLE;
          return ServerIntArrayRequest.field_l;
        }
        return null;
    }

    final byte[] fetchFile(byte guard, int fileId, int groupId) {
        if (guard <= 84) {
          this.fetchFlatFile(-101, 72);
        }
        return this.fetchFile(groupId, 104, (int[]) null, fileId);
    }

    final int groupId(int guard, String groupName) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.loadIndex((byte) 127)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          if (guard != 0) {
            ResourceArchive.pollAccountCreationResult(((byte[]) (this.packedGroups[9]))[0]);
          }
          groupName = groupName.toLowerCase();
          var4 = (CharSequence) ((Object) groupName);
          var3_int = this.index.groupNameIndex.findIndex(IntroMeshMaterial.hashCp1252(var4, guard ^ -66), (byte) 109);
          if (this.isValidGroup(var3_int, true)) {
            stackIn_9_0 = var3_int;
            return stackIn_9_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ki.T(").append(guard).append(',');
          if (groupName == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final synchronized boolean loadIndex(byte guard) {
        if (guard != 127) {
          return true;
        }
        if (this.index == null) {
          this.index = this.provider.fetchIndex((byte) -111);
          if (null == this.index) {
            return false;
          }
          this.files = new Object[this.index.groupCapacity][];
          this.packedGroups = new Object[this.index.groupCapacity];
        }
        return true;
    }

    final int fileId(int groupId, String fileName, byte guard) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard < 125) {
            var5 = (String) null;
            this.fileId(-98, (String) null, (byte) -65);
          }
          if (!this.isValidGroup(groupId, true)) {
            stackIn_4_0 = -1;
            return stackIn_4_0;
          }
          fileName = fileName.toLowerCase();
          var6 = (CharSequence) ((Object) fileName);
          var4_int = this.index.fileNameIndices[groupId].findIndex(IntroMeshMaterial.hashCp1252(var6, -115), (byte) 105);
          if (this.isValidFileSlot(groupId, var4_int, (byte) -79)) {
            stackIn_9_0 = var4_int;
            return stackIn_9_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ki.J(").append(groupId).append(',');
          if (fileName == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(')').toString());
        }
    }

    final boolean hasGroupName(byte guard, String groupName) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.loadIndex((byte) 127)) {
            return false;
          }
          groupName = groupName.toLowerCase();
          var3_int = -43 / ((-28 - guard) / 53);
          var5 = (CharSequence) ((Object) groupName);
          var4 = this.index.groupNameIndex.findIndex(IntroMeshMaterial.hashCp1252(var5, -108), (byte) -72);
          if (var4 >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ki.I(").append(guard).append(',');
          if (groupName == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final synchronized boolean tryLoadGroup(byte guard, int groupId) {
        if (!this.isValidGroup(groupId, true)) {
          return false;
        }
        if (null != this.packedGroups[groupId]) {
          return true;
        }
        this.loadGroup(groupId, 89);
        if (guard != -110) {
          this.fetchNamedFile((String) null, (String) (this.packedGroups[6]), -2);
        }
        if (this.packedGroups[groupId] == null) {
          return false;
        }
        return true;
    }

    final synchronized byte[] fetchFlatFile(int guard, int id) {
        if (guard != -14296) {
          this.packedGroups = (Object[]) null;
        }
        if (!this.loadIndex((byte) 127)) {
          return null;
        }
        if (this.index.fileCapacities.length == 1) {
          return this.fetchFile((byte) 108, id, 0);
        }
        if (!this.isValidGroup(id, true)) {
          return null;
        }
        if (1 == this.index.fileCapacities[id]) {
          return this.fetchFile((byte) 111, 0, id);
        }
        throw new RuntimeException();
    }

    final synchronized int groupLoadPercent(int groupId, byte guard) {
        if (!this.isValidGroup(groupId, true)) {
          return 0;
        }
        if (null != this.packedGroups[groupId]) {
          return 100;
        }
        int var3 = 81 % ((guard + 11) / 36);
        return this.provider.groupLoadPercent(groupId, 0);
    }

    final byte[] fetchFlatNamedFile(byte guard, String name) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard <= 108) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          var3_int = this.groupId(0, "");
          if (-1 != var3_int) {
            stackIn_6_0 = this.fetchNamedFile(name, "", -1);
            return stackIn_6_0;
          }
          stackIn_8_0 = this.fetchNamedFile("", name, -1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ki.H(").append(guard).append(',');
          if (name == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        if (param0 != 6) {
          ResourceArchive.pollAccountCreationResult((byte) 84);
        }
        if (null == km.field_o) {
          km.field_o = Js5Client.requestServerData((byte) -82, 6);
        }
        if (km.field_o.complete) {
          Drone.field_g = km.field_o.payload;
          km.field_o = null;
          if (Drone.field_g == null) {
            return true;
          }
          LegacyOpenGlRenderbuffer.a((byte) 111);
          return true;
        }
        return false;
    }

    final boolean tryLoadNamedGroup(String groupName, int guard) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.loadIndex((byte) 127)) {
            return false;
          }
          groupName = groupName.toLowerCase();
          if (guard != 100) {
            return true;
          }
          var4 = (CharSequence) ((Object) groupName);
          var3_int = this.index.groupNameIndex.findIndex(IntroMeshMaterial.hashCp1252(var4, -116), (byte) 124);
          stackIn_7_0 = this.tryLoadGroup((byte) -110, var3_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ki.L(");
          if (groupName == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(guard).append(')').toString());
        }
    }

    final synchronized boolean tryLoadFile(int groupId, boolean guard, int fileId) {
        if (!this.isValidFileSlot(groupId, fileId, (byte) -79)) {
          return false;
        }
        if (this.files[groupId] != null &&
          null != this.files[groupId][fileId]) {
          return true;
        }
        if (null != this.packedGroups[groupId]) {
          return true;
        }
        if (guard) {
          String var5 = (String) null;
          this.hasGroupName((byte) 11, (String) null);
        }
        this.loadGroup(groupId, 84);
        if (null != this.packedGroups[groupId]) {
          return true;
        }
        return false;
    }

    final int fileCapacity(byte guard, int groupId) {
        if (!this.isValidGroup(groupId, true)) {
          return 0;
        }
        if (guard != -65) {
          this.tryLoadGroup((byte) 97, -83);
        }
        return this.index.fileCapacities[groupId];
    }

    final int groupCapacity(boolean guard) {
        if (!this.loadIndex((byte) 127)) {
          return -1;
        }
        if (!guard) {
          this.namedGroupLoadPercent((String) (this.packedGroups[2]), ((byte[]) (this.packedGroups[4]))[1]);
        }
        return this.index.fileCapacities.length;
    }

    private final synchronized void loadGroup(int groupId, int guard) {
        if (guard <= 19) {
          this.packedGroups = (Object[]) null;
        }
        if (this.discardPackedGroups) {
          this.packedGroups[groupId] = this.provider.fetchGroup(groupId, false);
        } else {
          this.packedGroups[groupId] = DroneDebris.storeByteArray((byte) -121, this.provider.fetchGroup(groupId, false), false);
        }
    }

    private final synchronized boolean unpackGroup(int guard, int[] xteaKey, int requestedFileId, int groupId) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        boolean stackIn_37_2 = false;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_108_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        byte[] var9 = null;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        PacketBuffer var26 = null;
        byte[] var27 = null;
        PacketBuffer var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        PacketBuffer var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int var14Lifetime1;
        var22 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!this.isValidGroup(groupId, true)) {
            return false;
          }
          if (this.packedGroups[groupId] == null) {
            return false;
          }
          var5_int = this.index.fileCounts[groupId];
          var34 = this.index.fileIds[groupId];
          var24 = var34;
          var6 = var24;
          if (null == this.files[groupId]) {
            array$0 = new Object[this.index.fileCapacities[groupId]];
            this.files[groupId] = array$0;
          }
          var7 = this.files[groupId];
          var8 = 1;
          for (var9_int = 0; var9_int < var5_int; var9_int++) {
            if (null == var6) {
              var10 = var9_int;
            } else {
              var10 = var34[var9_int];
            }
            if (null != var7[var10]) {
              continue;
            }
            var8 = 0;
            break;
          }
          if (var8 != 0) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != xteaKey && (xteaKey[0] != 0 ||
            0 != xteaKey[1] ||
            xteaKey[2] != 0 ||
            0 != xteaKey[3])) {
            var35 = NoiseSliceGenerator.extractByteArray(true, this.packedGroups[groupId], 0);
            var25 = var35;
            var9 = var25;
            var26 = new PacketBuffer(var35);
            var26.decryptXteaRange(var26.payload.length, (byte) 127, 5, xteaKey);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = NoiseSliceGenerator.extractByteArray(false, this.packedGroups[groupId], 0);
          }
          try {
            var36 = GridWidgetContainer.decompressContainer(-1, var9);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_36_0 = var11_ref_RuntimeException;
            stackIn_36_1 = new StringBuilder();
            stackIn_37_2 = (xteaKey != null);
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(" ").append(groupId).append(" ").append(var9.length).append(" ").append(CachedArchiveProvider.crc32(var9.length, var9, (byte) 56)).append(" ").append(CachedArchiveProvider.crc32(var9.length - 2, var9, (byte) -103)).append(" ").append(this.index.groupCrcs[groupId]).append(" ").append(this.index.crc).toString());
          }
          if (guard > -76) {
            this.files = (Object[][]) (this.packedGroups[33]);
          }
          if (this.discardPackedGroups) {
            this.packedGroups[groupId] = null;
          }
          if (var5_int > 1) {
            if (2 == this.fileRetentionPolicy) {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - 4 * (var12 * var5_int);
              var32 = new PacketBuffer(var43);
              var14 = 0;
              var32.position = var11;
              var15 = 0;
              for (var16 = 0; var12 > var16; var16++) {
                var17 = 0;
                for (var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var32.readInt(true);
                  if (var6 == null) {
                    var19 = var18;
                  } else {
                    var19 = var34[var18];
                  }
                  if (requestedFileId == var19) {
                    var14 = var14 + var17;
                    var15 = var19;
                  }
                }
              }
              if (var14 == 0) {
                return true;
              }
              var44 = new byte[var14];
              var14Lifetime1 = 0;
              var32.position = var11;
              var17 = 0;
              for (var18 = 0; var18 < var12; var18++) {
                var19 = 0;
                for (var20 = 0; var20 < var5_int; var20++) {
                  var19 = var19 + var32.readInt(true);
                  if (var6 != null) {
                    var21 = var34[var20];
                  } else {
                    var21 = var20;
                  }
                  if (requestedFileId == var21) {
                    ArrayUtils.copy(var43, var17, var44, var14Lifetime1, var19);
                    var14Lifetime1 = var14Lifetime1 + var19;
                  }
                  var17 = var17 + var19;
                }
              }
              var7[var15] = var44;
            } else {
              var11 = var36.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - 4 * (var12 * var5_int);
              var29 = new PacketBuffer(var43);
              var38 = new int[var5_int];
              var30 = var38;
              var14_ref_int__ = var30;
              var29.position = var11;
              for (var15 = 0; var15 < var12; var15++) {
                var16 = 0;
                for (var17 = 0; var17 < var5_int; var17++) {
                  var16 = var16 + var29.readInt(true);
                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                }
              }
              var39 = new byte[var5_int][];
              var31 = var39;
              var15_ref_byte____ = var31;
              for (var16 = 0; var5_int > var16; var16++) {
                array$1 = new byte[var38[var16]];
                var15_ref_byte____[var16] = array$1;
                var38[var16] = 0;
              }
              var29.position = var11;
              var16 = 0;
              for (var17 = 0; var17 < var12; var17++) {
                var18 = 0;
                for (var19 = 0; var19 < var5_int; var19++) {
                  var18 = var18 + var29.readInt(true);
                  ArrayUtils.copy(var43, var16, var39[var19], var38[var19], var18);
                  var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                  var16 = var16 + var18;
                }
              }
              for (var17 = 0; var17 < var5_int; var17++) {
                if (var6 == null) {
                  var18 = var17;
                } else {
                  var18 = var34[var17];
                }
                if (this.fileRetentionPolicy == 0) {
                  var7[var18] = DroneDebris.storeByteArray((byte) -119, var39[var17], false);
                } else {
                  var7[var18] = var39[var17];
                }
              }
            }
          } else {
            if (var6 != null) {
              var11 = var34[0];
            } else {
              var11 = 0;
            }
            if (0 != this.fileRetentionPolicy) {
              var7[var11] = var36;
              return true;
            }
            var7[var11] = DroneDebris.storeByteArray((byte) -119, var43, false);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_107_0 = var5;
          stackIn_107_1 = new StringBuilder().append("ki.EA(").append(guard).append(',');
          if (xteaKey == null) {
            stackIn_108_2 = "null";
          } else {
            stackIn_108_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_107_0), ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',').append(requestedFileId).append(',').append(groupId).append(')').toString());
        }
    }

    private final synchronized boolean isValidFileSlot(int groupId, int fileId, byte guard) {
        if (guard != -79) {
          field_i = true;
        }
        if (!this.loadIndex((byte) 127)) {
          return false;
        }
        if (groupId < 0 ||
          fileId < 0 ||
          groupId >= this.index.fileCapacities.length ||
          fileId >= this.index.fileCapacities[groupId]) {
          if (!GzipDecompressor.field_a) {
            return false;
          }
          throw new IllegalArgumentException(groupId + " " + fileId);
        }
        return true;
    }

    final int namedGroupLoadPercent(String groupName, byte guard) {
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
          if (!this.loadIndex((byte) 127)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          groupName = groupName.toLowerCase();
          if (guard != 33) {
            stackIn_5_0 = 123;
            return stackIn_5_0;
          }
          var4 = (CharSequence) ((Object) groupName);
          var3_int = this.index.groupNameIndex.findIndex(IntroMeshMaterial.hashCp1252(var4, guard ^ -101), (byte) 103);
          stackIn_7_0 = this.groupLoadPercent(var3_int, (byte) 79);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ki.BA(");
          if (groupName == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(guard).append(')').toString());
        }
    }

    private final synchronized byte[] fetchFile(int groupId, int guard, int[] xteaKey, int fileId) {
        Object stackIn_2_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        byte[] var8 = null;
        try {
          var5_int = 83 / ((guard - 45) / 38);
          if (!this.isValidFileSlot(groupId, fileId, (byte) -79)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          var6 = null;
          if ((null == this.files[groupId] ||
            this.files[groupId][fileId] == null) && !this.unpackGroup(-126, xteaKey, fileId, groupId)) {
            this.loadGroup(groupId, 124);
            if (!this.unpackGroup(-93, xteaKey, fileId, groupId)) {
              return null;
            }
          }
          if (this.files[groupId] == null) {
            throw new RuntimeException("");
          }
          if (null != this.files[groupId][fileId]) {
            var8 = NoiseSliceGenerator.extractByteArray(false, this.files[groupId][fileId], 0);
            var6 = var8;
            if (var8 == null) {
              throw new RuntimeException("");
            }
          }
          if (var6 != null) {
            if (this.fileRetentionPolicy == 1) {
              this.files[groupId][fileId] = null;
              if (this.index.fileCapacities[groupId] == 1) {
                this.files[groupId] = null;
              }
            } else {
              if (this.fileRetentionPolicy == 2) {
                this.files[groupId] = null;
              }
            }
          }
          stackIn_27_0 = var6;
          return (byte[]) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("ki.B(").append(groupId).append(',').append(guard).append(',');
          if (xteaKey == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(fileId).append(')').toString());
        }
    }

    final synchronized int[] fileIds(int groupId, int guard) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        if (!this.isValidGroup(groupId, true)) {
          return null;
        }
        int[] var3 = this.index.fileIds[groupId];
        if (guard != -25915) {
          ResourceArchive.pollAccountCreationResult((byte) 102);
        }
        if (var3 == null) {
          var6 = new int[this.index.fileCounts[groupId]];
          var3 = var6;
          for (var4 = 0; var4 < var6.length; var4++) {
            var6[var4] = var4;
          }
        }
        return var3;
    }

    final synchronized boolean tryLoadAllGroups(boolean initiallyComplete) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (!this.loadIndex((byte) 127)) {
          return false;
        }
        var2 = initiallyComplete ? 1 : 0;
        for (var3 = 0; var3 < this.index.groupIds.length; var3++) {
          var4 = this.index.groupIds[var3];
          if (null == this.packedGroups[var4]) {
            this.loadGroup(var4, 99);
            if (null == this.packedGroups[var4]) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    final synchronized int loadPercent(int initialWeight) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (!this.loadIndex((byte) 127)) {
          return 0;
        }
        var2 = initialWeight;
        var3 = 0;
        for (var4 = 0; var4 < this.packedGroups.length; var4++) {
          if (this.index.fileCounts[var4] > 0) {
            var2 += 100;
            var3 = var3 + this.groupLoadPercent(var4, (byte) 50);
          }
        }
        if (0 == var2) {
          return 100;
        }
        var4Lifetime1 = var3 * 100 / var2;
        return var4Lifetime1;
    }

    final boolean hasFileName(String fileName, String groupName, int guard) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.loadIndex((byte) 127)) {
            return false;
          }
          groupName = groupName.toLowerCase();
          fileName = fileName.toLowerCase();
          var6 = (CharSequence) ((Object) groupName);
          var4_int = this.index.groupNameIndex.findIndex(IntroMeshMaterial.hashCp1252(var6, -124), (byte) 100);
          if (var4_int < 0) {
            return false;
          }
          var7 = (CharSequence) ((Object) fileName);
          var5 = this.index.fileNameIndices[var4_int].findIndex(IntroMeshMaterial.hashCp1252(var7, -115), (byte) -83);
          if (guard >= ~var5) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ki.C(");
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
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(guard).append(')').toString());
        }
    }

    public static void clearStaticState(byte guard) {
        if (guard != 35) {
          ResourceArchive.b(91);
        }
        field_b = null;
        field_j = null;
    }

    ResourceArchive(ArchiveProvider archiveProvider, boolean discardGroups, int retentionPolicy) {
        this.index = null;
        try {
          if (retentionPolicy < 0 ||
            retentionPolicy > 2) {
            throw new IllegalArgumentException("");
          }
          this.fileRetentionPolicy = retentionPolicy;
          this.provider = archiveProvider;
          this.discardPackedGroups = discardGroups ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ki.<init>(" + (archiveProvider != null ? "{...}" : "null") + ',' + discardGroups + ',' + retentionPolicy + ')');
        }
    }

    private final synchronized boolean isValidGroup(int groupId, boolean guard) {
        if (!this.loadIndex((byte) 127)) {
          return false;
        }
        if (!guard) {
          field_j = (String) (this.packedGroups[5]);
        }
        if (groupId >= 0 &&
          this.index.fileCapacities.length > groupId &&
          this.index.fileCapacities[groupId] != 0) {
          return true;
        }
        if (!GzipDecompressor.field_a) {
          return false;
        }
        throw new IllegalArgumentException(Integer.toString(groupId));
    }

    final boolean tryLoadNamedFile(String groupName, int guard, String fileName) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.loadIndex((byte) 127)) {
            return false;
          }
          groupName = groupName.toLowerCase();
          fileName = fileName.toLowerCase();
          var6 = (CharSequence) ((Object) groupName);
          var4_int = this.index.groupNameIndex.findIndex(IntroMeshMaterial.hashCp1252(var6, -103), (byte) -78);
          if (!this.isValidGroup(var4_int, true)) {
            return false;
          }
          if (guard != -1158) {
            return false;
          }
          var7 = (CharSequence) ((Object) fileName);
          var5 = this.index.fileNameIndices[var4_int].findIndex(IntroMeshMaterial.hashCp1252(var7, -41), (byte) -25);
          stackIn_11_0 = this.tryLoadFile(var4_int, false, var5);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("ki.R(");
          if (groupName == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(guard).append(',');
          if (fileName == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_i = false;
        field_j = "Fullscreen";
        field_b = new Random();
        selectedSpeedLevel = 1;
    }
}
