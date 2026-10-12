/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ResourceArchive {
    private Object[][] unpackedFiles;
    private ArchiveProvider provider;
    private ArchiveIndex index;
    int fileRetentionMode;
    boolean discardPackedGroups;
    static sa field_k;
    private Object[] packedGroups;
    static String field_d;
    static String field_f;
    static BattleCamera field_a;
    static volatile int field_i;

    final synchronized int a(int param0) {
        int var2;
        int var3;
        int var4;
        int var4Lifetime1;
        if (!this.ensureIndex((byte) 82)) {
          return 0;
        }
        var2 = param0;
        var3 = 0;
        for (var4 = 0; var4 < this.packedGroups.length; var4++) {
          if (this.index.fileCounts[var4] > 0) {
            var3 = var3 + this.getGroupProgress(var4, (byte) 73);
            var2 += 100;
          }
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = var3 * 100 / var2;
        return var4Lifetime1;
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object stackIn_2_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        String var7 = null;
        byte[] var8 = null;
        try {
          if (!this.isValidFile(param3, 0, param2)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          if (param1 < 113) {
            var7 = (String) null;
            this.a(((byte[]) (this.packedGroups[1]))[1], (String) null);
          }
          var5 = null;
          if ((null == this.unpackedFiles[param3] ||
            this.unpackedFiles[param3][param2] == null) && !this.a(param2, 0, param0, param3)) {
            this.loadPackedGroup(true, param3);
            if (!this.a(param2, 0, param0, param3)) {
              stackIn_11_0 = null;
              return (byte[]) (stackIn_11_0);
            }
          }
          if (null == this.unpackedFiles[param3]) {
            throw new RuntimeException("");
          }
          if (null != this.unpackedFiles[param3][param2]) {
            var8 = ko.a(false, 80, this.unpackedFiles[param3][param2]);
            var5 = var8;
            if (var8 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.fileRetentionMode == 1) {
              this.unpackedFiles[param3][param2] = null;
              if (this.index.fileCapacities[param3] == 1) {
                this.unpackedFiles[param3] = null;
              }
            } else {
              if (this.fileRetentionMode == 2) {
                this.unpackedFiles[param3] = null;
              }
            }
          }
          stackIn_29_0 = var5;
          return (byte[]) (stackIn_29_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("kl.T(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) (stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndex((byte) 82)) {
            return false;
          }
          if (param0 != 28979) {
            field_a = (BattleCamera) (this.packedGroups[6]);
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.index.groupNameLookup.get(rs.a((byte) -116, var4), 1);
          stackIn_6_0 = this.a(param0 - 17085, var3_int);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("kl.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 != -1) {
          return;
        }
        field_a = null;
        field_f = null;
        field_d = null;
    }

    final boolean a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
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
          param2 = param2.toLowerCase();
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.index.groupNameLookup.get(rs.a((byte) -116, var6), 1);
          if (!this.isValidGroup(var4_int, -24876)) {
            return false;
          }
          if (param0 > -51) {
            stackIn_10_0 = ((boolean[]) (this.packedGroups[13]))[11];
            return stackIn_10_0;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.index.fileNameLookups[var4_int].get(rs.a((byte) -116, var7), 1);
          stackIn_12_0 = this.a(var4_int, var5, 0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("kl.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final synchronized byte[] c(int param0, byte param1) {
        if (!this.ensureIndex((byte) 82)) {
          return null;
        }
        if (param1 != 81) {
          this.a(21, 79);
        }
        if (this.index.fileCapacities.length == 1) {
          return this.getFile((byte) 99, param0, 0);
        }
        if (!this.isValidGroup(param0, param1 ^ -24955)) {
          return null;
        }
        if (1 == this.index.fileCapacities[param0]) {
          return this.getFile((byte) 94, 0, param0);
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
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final synchronized boolean a(int param0, int param1) {
        if (!this.isValidGroup(param1, param0 - 36770)) {
          return false;
        }
        if (this.packedGroups[param1] != null) {
          return true;
        }
        if (param0 != 11894) {
          field_d = (String) (((Object[]) (((Object[]) (this.packedGroups[8]))[7]))[5]);
        }
        this.loadPackedGroup(true, param1);
        if (this.packedGroups[param1] != null) {
          return true;
        }
        return false;
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.isValidFile(param0, param2, param1)) {
          return false;
        }
        if (null != this.unpackedFiles[param0] &&
          this.unpackedFiles[param0][param1] != null) {
          return true;
        }
        if (null != this.packedGroups[param0]) {
          return true;
        }
        this.loadPackedGroup(true, param0);
        if (null != this.packedGroups[param0]) {
          return true;
        }
        return false;
    }

    final synchronized boolean d(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (!this.ensureIndex((byte) 82)) {
          return false;
        }
        var2 = 1;
        if (param0 != -27927) {
          ResourceArchive.c(((int[]) (this.packedGroups[1]))[2], 24, 50);
        }
        for (var3 = 0; this.index.groupIds.length > var3; var3++) {
          var4 = this.index.groupIds[var3];
          if (this.packedGroups[var4] == null) {
            this.loadPackedGroup(true, var4);
            if (null == this.packedGroups[var4]) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
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
          this.a(-110);
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

    final boolean a(byte param0, String param1) {
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
          param1 = param1.toLowerCase();
          if (param0 > -127) {
            return true;
          }
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.index.groupNameLookup.get(rs.a((byte) -116, var4), 1);
          if (0 <= var3_int) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("kl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
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
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
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
          var1_int = AiPlanningStrategy.field_d;
          var2 = ko.field_b;
          if (param0 != -20193) {
            field_d = (String) null;
          }
          stackIn_5_0 = (DeployEvent.field_A != 1) ? 0 : 1;
          var3 = stackIn_5_0;
          stackIn_8_0 = (ro.field_ub != 1) ? 0 : 1;
          var4 = stackIn_8_0;
          TurnEffectEvent.field_z.a(87, var4 != 0, var3 != 0, var1_int, var2, el.field_d);
          while (true) {
            if (!Unit.i((byte) -61)) {
              return;
            }
            if (13 == rs.field_q) {
              CipherPacketBuffer.a(true, 0, param0 + 20194, jt.field_a);
            }
            if (12 == rs.field_q) {
              stackIn_17_0 = !(CoatOfArms.field_e);
              CoatOfArms.field_e = stackIn_17_0;
            }
            if (rs.field_q != 11) {
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
          throw ig.addExceptionContext((Throwable) ((Object) var1), "kl.G(" + param0 + ')');
        }
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
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
          param2 = param2.toLowerCase();
          param0 = param0.toLowerCase();
          var4_int = 119 % ((param1 + 36) / 44);
          var7 = (CharSequence) ((Object) param2);
          var5 = this.index.groupNameLookup.get(rs.a((byte) -116, var7), 1);
          if (!this.isValidGroup(var5, -24876)) {
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          var8 = (CharSequence) ((Object) param0);
          var6 = this.index.fileNameLookups[var5].get(rs.a((byte) -116, var8), 1);
          stackIn_7_0 = this.getFile((byte) 119, var6, var5);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("kl.DA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final synchronized boolean a(int param0, byte param1) {
        if (!this.ensureIndex((byte) 82)) {
          return false;
        }
        if (param1 != -56) {
          field_d = (String) null;
        }
        if (1 == this.index.fileCapacities.length) {
          return this.a(0, param0, 0);
        }
        if (!this.isValidGroup(param0, param1 ^ 24860)) {
          return false;
        }
        if (this.index.fileCapacities[param0] == 1) {
          return this.a(param0, 0, param1 + 56);
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
        return this.a((int[]) null, 116, fileId, groupId);
    }

    private final synchronized boolean a(int param0, int param1, int[] param2, int param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        boolean stackIn_34_2 = false;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
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
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
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
        PacketBuffer var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int var14_intLifetime1;
        var22 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (!this.isValidGroup(param3, -24876)) {
            return false;
          }
          if (null == this.packedGroups[param3]) {
            return false;
          }
          var5_int = this.index.fileCounts[param3];
          var34 = this.index.fileIds[param3];
          var24 = var34;
          var6 = var24;
          if (this.unpackedFiles[param3] == null) {
            array$0 = new Object[this.index.fileCapacities[param3]];
            this.unpackedFiles[param3] = array$0;
          }
          var7 = this.unpackedFiles[param3];
          var8 = 1;
          for (var9_int = param1; var5_int > var9_int; var9_int++) {
            if (var6 == null) {
              var10 = var9_int;
            } else {
              var10 = var34[var9_int];
            }
            if (var7[var10] != null) {
              continue;
            }
            var8 = 0;
            break;
          }
          if (var8 != 0) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param2 != null && (param2[0] != 0 ||
            0 != param2[1] ||
            param2[2] != 0 ||
            param2[3] != 0)) {
            var35 = ko.a(true, 42, this.packedGroups[param3]);
            var25 = var35;
            var9 = var25;
            var26 = new PacketBuffer(var35);
            var26.a(param2, var26.payload.length, 5, -12366);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = ko.a(false, 87, this.packedGroups[param3]);
          }
          try {
            var36 = el.decompressContainer(false, var9);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_33_0 = var11_ref_RuntimeException;
            stackIn_33_1 = new StringBuilder();
            stackIn_34_2 = (param2 != null);
            throw ig.addExceptionContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(" ").append(param3).append(" ").append(var9.length).append(" ").append(pk.a(var9, var9.length, 113)).append(" ").append(pk.a(var9, -2 + var9.length, 115)).append(" ").append(this.index.groupCrcs[param3]).append(" ").append(this.index.indexCrc).toString());
          }
          if (this.discardPackedGroups) {
            this.packedGroups[param3] = null;
          }
          if (var5_int > 1) {
            if (this.fileRetentionMode == 2) {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - var12 * var5_int * 4;
              var29 = new PacketBuffer(var43);
              var14_int = 0;
              var15_int = 0;
              var29.position = var11;
              for (var16 = 0; var16 < var12; var16++) {
                var17 = 0;
                for (var18 = 0; var18 < var5_int; var18++) {
                  var17 = var17 + var29.readInt(1);
                  if (var6 != null) {
                    var19 = var34[var18];
                  } else {
                    var19 = var18;
                  }
                  if (param0 == var19) {
                    var14_int = var14_int + var17;
                    var15_int = var19;
                  }
                }
              }
              if (0 == var14_int) {
                return true;
              }
              var44 = new byte[var14_int];
              var29.position = var11;
              var14_intLifetime1 = 0;
              var17 = 0;
              for (var18 = 0; var18 < var12; var18++) {
                var19 = 0;
                for (var20 = 0; var5_int > var20; var20++) {
                  var19 = var19 + var29.readInt(param1 ^ 1);
                  if (var6 != null) {
                    var21 = var34[var20];
                  } else {
                    var21 = var20;
                  }
                  if (var21 == param0) {
                    vm.a(var43, var17, var44, var14_intLifetime1, var19);
                    var14_intLifetime1 = var14_intLifetime1 + var19;
                  }
                  var17 = var17 + var19;
                }
              }
              var7[var15_int] = var44;
            } else {
              var11 = var36.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - 4 * (var12 * var5_int);
              var31 = new PacketBuffer(var43);
              var39 = new int[var5_int];
              var32 = var39;
              var14 = var32;
              var31.position = var11;
              for (var15_int = 0; var12 > var15_int; var15_int++) {
                var16 = 0;
                for (var17 = 0; var17 < var5_int; var17++) {
                  var16 = var16 + var31.readInt(param1 + 1);
                  var14[var17] = var14[var17] + var16;
                }
              }
              var40 = new byte[var5_int][];
              var33 = var40;
              var15 = var33;
              for (var16 = 0; var16 < var5_int; var16++) {
                array$1 = new byte[var39[var16]];
                var15[var16] = array$1;
                var39[var16] = 0;
              }
              var31.position = var11;
              var16 = 0;
              for (var17 = 0; var12 > var17; var17++) {
                var18 = 0;
                for (var19 = 0; var19 < var5_int; var19++) {
                  var18 = var18 + var31.readInt(1);
                  vm.a(var43, var16, var40[var19], var39[var19], var18);
                  var16 = var16 + var18;
                  var14[var19] = var14[var19] + var18;
                }
              }
              for (var17 = 0; var17 < var5_int; var17++) {
                if (var6 != null) {
                  var18 = var34[var17];
                } else {
                  var18 = var17;
                }
                if (0 != this.fileRetentionMode) {
                  var7[var18] = var40[var17];
                } else {
                  var7[var18] = pf.a(param1 + 0, var40[var17], false);
                }
              }
            }
          } else {
            if (var6 == null) {
              var11 = 0;
            } else {
              var11 = var34[0];
            }
            if (this.fileRetentionMode != 0) {
              var7[var11] = var36;
              return true;
            }
            var7[var11] = pf.a(0, var43, false);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_103_0 = var5;
          stackIn_103_1 = new StringBuilder().append("kl.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(String param0, byte param1) {
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
          var3_int = 98 % ((param1 - 39) / 43);
          if (!this.ensureIndex((byte) 82)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          param0 = param0.toLowerCase();
          var5 = (CharSequence) ((Object) param0);
          var4 = this.index.groupNameLookup.get(rs.a((byte) -116, var5), 1);
          stackIn_4_0 = this.getGroupProgress(var4, (byte) 73);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kl.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
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
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "kl.<init>(" + (provider != null ? "{...}" : "null") + ',' + discardPackedGroups + ',' + fileRetentionMode + ')');
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
          this.packedGroups[groupId] = pf.a(0, this.provider.getEncodedGroup(groupId, 4), false);
        } else {
          this.packedGroups[groupId] = this.provider.getEncodedGroup(groupId, 4);
        }
    }

    static {
        field_k = new sa();
        field_d = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_f = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_i = -1;
    }
}
