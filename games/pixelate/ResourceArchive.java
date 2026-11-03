/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ResourceArchive {
    private ArchiveIndex index;
    private Object[] packedGroups;
    static AccountRegistrationPanel field_b;
    static char[] field_d;
    static SceneWidget[] field_f;
    static String field_j;
    boolean discardPackedGroups;
    private ArchiveProvider field_a;
    int field_e;
    private Object[][] unpackedFiles;
    static SceneWidget[] field_h;

    final int getGroupId(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndex(-3)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.index.groupNameLookup.a(WeightedLruCache.a(var4, (byte) 103), (byte) -67);
          if (param0 < 114) {
            stackIn_5_0 = 73;
            return stackIn_5_0;
          }
          if (this.isGroupValid(var3_int, -1)) {
            stackIn_10_0 = var3_int;
            return stackIn_10_0;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("fm.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int getGroupProgressByName(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 100) {
            this.index = (ArchiveIndex) (this.packedGroups[7]);
          }
          if (!this.ensureIndex(-3)) {
            stackIn_5_0 = 0;
            return stackIn_5_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.index.groupNameLookup.a(WeightedLruCache.a(var4, (byte) 104), (byte) -67);
          stackIn_7_0 = this.getGroupProgress(var3_int, (byte) -78);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("fm.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final synchronized boolean isGroupValid(int param0, int param1) {
        if (!this.ensureIndex(param1 - 2)) {
          return false;
        }
        if (~param0 > param1 ||
          param0 >= this.index.field_i.length ||
          this.index.field_i[param0] == 0) {
          if (IntrusiveDequeCursor.field_d) {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
          return false;
        }
        return true;
    }

    final int getFileCount(int param0, byte param1) {
        byte[] discarded$0 = null;
        if (param1 < 22) {
          discarded$0 = this.getFileWithKey(((int[]) (this.packedGroups[1]))[10], (int[]) null, 79, ((int[]) (this.packedGroups[0]))[1]);
        }
        if (!this.isGroupValid(param0, -1)) {
          return 0;
        }
        return this.index.field_i[param0];
    }

    final boolean hasGroupName(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndex(-3)) {
            return false;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.index.groupNameLookup.a(WeightedLruCache.a(var4, (byte) -111), (byte) -67);
          if (param0 <= 124) {
            return false;
          }
          if (var3_int >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("fm.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(PlatformTaskDispatcher param0, Object param1, byte param2) {
        int var3_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        CharSequence var5 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0.field_w == null) {
            return;
          }
          for (var3_int = 0; 50 > var3_int; var3_int++) {
            if (null != param0.field_w.peekEvent()) {
              SecondaryNodeHashTable.a(1L, (byte) 23);
              continue;
            }
            break;
          }
          try {
            if (null != param1) {
              param0.field_w.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
            }
            if (param2 != -52) {
              var5 = (CharSequence) null;
              ResourceArchive.ensureGroupAvailableByName((byte) 28, (CharSequence) null);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("fm.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean ensureFileAvailableByName(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndex(-3)) {
            return false;
          }
          if (param0 != 0) {
            field_b = (AccountRegistrationPanel) null;
          }
          param1 = param1.toLowerCase();
          param2 = param2.toLowerCase();
          var6 = (CharSequence) ((Object) param1);
          var4_int = this.index.groupNameLookup.a(WeightedLruCache.a(var6, (byte) -125), (byte) -67);
          if (!this.isGroupValid(var4_int, -1)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param2);
          var5 = this.index.fileNameLookups[var4_int].a(WeightedLruCache.a(var7, (byte) 77), (byte) -67);
          stackIn_10_0 = this.isFileAvailable(var4_int, var5, -2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("fm.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final byte[] getFile(int param0, int param1, boolean param2) {
        if (!param2) {
          ResourceArchive.a((PlatformTaskDispatcher) null, this.packedGroups[0], ((byte[]) (((Object[]) (this.packedGroups[0]))[1]))[2]);
        }
        return this.getFileWithKey(-1, (int[]) null, param1, param0);
    }

    final synchronized boolean ensureIndex(int param0) {
        if (null == this.index) {
          this.index = this.field_a.getIndex((byte) 36);
          if (this.index == null) {
            return false;
          }
          this.packedGroups = new Object[this.index.groupCapacity];
          this.unpackedFiles = new Object[this.index.groupCapacity][];
        }
        if (param0 != -3) {
          this.isFileAvailable(-35, ((int[]) (this.packedGroups[0]))[8], 66);
          return true;
        }
        return true;
    }

    final synchronized boolean ensureAllGroupsAvailable(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        String var6;
        var5 = Pixelate.field_H ? 1 : 0;
        if (param0 != 92) {
          var6 = (String) null;
          this.getGroupId(-33, (String) null);
        }
        if (!this.ensureIndex(-3)) {
          return false;
        }
        var2 = 1;
        for (var3 = 0; var3 < this.index.groupIds.length; var3++) {
          var4 = this.index.groupIds[var3];
          if (null == this.packedGroups[var4]) {
            this.loadGroup(var4, false);
            if (this.packedGroups[var4] == null) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    private final synchronized boolean unpackGroup(int param0, int param1, int[] param2, int param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        int[] stackIn_24_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        boolean stackIn_35_2 = false;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
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
        int var12Lifetime1;
        int var15Lifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19Lifetime1;
        int var14Lifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime4;
        int var18Lifetime3;
        int var19Lifetime2;
        var22 = Pixelate.field_H ? 1 : 0;
        try {
          if (!this.isGroupValid(param1, ~param3)) {
            return false;
          }
          if (null == this.packedGroups[param1]) {
            return false;
          }
          var5_int = this.index.fileCounts[param1];
          var34 = this.index.fileIds[param1];
          var24 = var34;
          var6 = var24;
          if (null == this.unpackedFiles[param1]) {
            array$0 = new Object[this.index.field_i[param1]];
            this.unpackedFiles[param1] = array$0;
          }
          var7 = this.unpackedFiles[param1];
          var8 = 1;
          for (var9_int = 0; var5_int > var9_int; var9_int++) {
            if (var6 == null) {
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
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          if (param2 != null) {
            if (0 == param2[0]) {
              stackIn_24_0 = (int[]) (param2);
              decompiledFrameRemainder0 = (stackIn_24_0[1] != 0 ||
                param2[2] != 0 ||
                param2[3] != 0);
            }
            if (decompiledFrameRemainder0) {
              var35 = UiTheme.a(false, true, this.packedGroups[param1]);
              var25 = var35;
              var9 = var25;
              var26 = new PacketBuffer(var35);
              var26.xteaDecryptRange(param2, 19324, 5, var26.payload.length);
              decompiledFrameRemainder1 = false;
            }
          }
          if (decompiledFrameRemainder1) {
            var9 = UiTheme.a(false, false, this.packedGroups[param1]);
          }
          try {
            var36 = la.a(var9, param3);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_34_0 = var11_ref_RuntimeException;
            stackIn_34_1 = new StringBuilder();
            stackIn_35_2 = (param2 != null);
            throw aa.addExceptionContext((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(" ").append(param1).append(" ").append(var9.length).append(" ").append(Matrix3.a(var9, 126, var9.length)).append(" ").append(Matrix3.a(var9, 125, var9.length - 2)).append(" ").append(this.index.field_k[param1]).append(" ").append(this.index.field_o).toString());
          }
          if (this.discardPackedGroups) {
            this.packedGroups[param1] = null;
          }
          if (1 < var5_int) {
            if (this.field_e == 2) {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - var5_int * var12 * 4;
              var32 = new PacketBuffer(var43);
              var14 = 0;
              var15 = 0;
              var32.position = var11;
              for (var16 = 0; var12 > var16; var16++) {
                var17 = 0;
                for (var18 = 0; var18 < var5_int; var18++) {
                  var17 = var17 + var32.readInt(0);
                  if (var6 == null) {
                    var19 = var18;
                  } else {
                    var19 = var34[var18];
                  }
                  if (param0 == var19) {
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
              var17Lifetime4 = 0;
              for (var18Lifetime3 = 0; var18Lifetime3 < var12; var18Lifetime3++) {
                var19Lifetime2 = 0;
                for (var20 = 0; var20 < var5_int; var20++) {
                  var19Lifetime2 = var19Lifetime2 + var32.readInt(0);
                  if (var6 == null) {
                    var21 = var20;
                  } else {
                    var21 = var34[var20];
                  }
                  if (var21 == param0) {
                    ArraySupport.a(var43, var17Lifetime4, var44, var14Lifetime1, var19Lifetime2);
                    var14Lifetime1 = var14Lifetime1 + var19Lifetime2;
                  }
                  var17Lifetime4 = var17Lifetime4 + var19Lifetime2;
                }
              }
              var7[var15] = var44;
              return true;
            }
            var11 = var36.length;
            var11--;
            var12Lifetime1 = var23[var11] & 255;
            var11 = var11 - var12Lifetime1 * var5_int * 4;
            var29 = new PacketBuffer(var43);
            var38 = new int[var5_int];
            var30 = var38;
            var14_ref_int__ = var30;
            var29.position = var11;
            for (var15Lifetime1 = 0; var15Lifetime1 < var12Lifetime1; var15Lifetime1++) {
              var16Lifetime1 = 0;
              for (var17Lifetime1 = 0; var17Lifetime1 < var5_int; var17Lifetime1++) {
                var16Lifetime1 = var16Lifetime1 + var29.readInt(param3 + 0);
                var14_ref_int__[var17Lifetime1] = var14_ref_int__[var17Lifetime1] + var16Lifetime1;
              }
            }
            var39 = new byte[var5_int][];
            var31 = var39;
            var15_ref_byte____ = var31;
            for (var16Lifetime2 = 0; var16Lifetime2 < var5_int; var16Lifetime2++) {
              array$1 = new byte[var38[var16Lifetime2]];
              var15_ref_byte____[var16Lifetime2] = array$1;
              var38[var16Lifetime2] = 0;
            }
            var29.position = var11;
            var16Lifetime3 = 0;
            for (var17Lifetime2 = 0; var12Lifetime1 > var17Lifetime2; var17Lifetime2++) {
              var18Lifetime1 = 0;
              for (var19Lifetime1 = 0; var5_int > var19Lifetime1; var19Lifetime1++) {
                var18Lifetime1 = var18Lifetime1 + var29.readInt(0);
                ArraySupport.a(var43, var16Lifetime3, var39[var19Lifetime1], var38[var19Lifetime1], var18Lifetime1);
                var16Lifetime3 = var16Lifetime3 + var18Lifetime1;
                var14_ref_int__[var19Lifetime1] = var14_ref_int__[var19Lifetime1] + var18Lifetime1;
              }
            }
            for (var17Lifetime3 = 0; var5_int > var17Lifetime3; var17Lifetime3++) {
              if (var6 == null) {
                var18Lifetime2 = var17Lifetime3;
              } else {
                var18Lifetime2 = var34[var17Lifetime3];
              }
              if (this.field_e != 0) {
                var7[var18Lifetime2] = var39[var17Lifetime3];
              } else {
                var7[var18Lifetime2] = aj.a(false, var39[var17Lifetime3], -123);
              }
            }
          } else {
            if (var6 == null) {
              var11 = 0;
            } else {
              var11 = var34[0];
            }
            if (this.field_e == 0) {
              var7[var11] = aj.a(false, var43, 124);
            } else {
              var7[var11] = var36;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_104_0 = var5;
          stackIn_104_1 = new StringBuilder().append("fm.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(param3).append(')').toString());
        }
    }

    private final synchronized byte[] getFileWithKey(int param0, int[] param1, int param2, int param3) {
        Object stackIn_26_0 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (param0 != -1) {
            this.ensureAllGroupsAvailable((byte) 110);
          }
          if (!this.isValidFileSlot(param2, 0, param3)) {
            return null;
          }
          var5 = null;
          if ((null == this.unpackedFiles[param3] ||
            this.unpackedFiles[param3][param2] == null) && !this.unpackGroup(param2, param3, param1, 0)) {
            this.loadGroup(param3, false);
            if (!this.unpackGroup(param2, param3, param1, 0)) {
              return null;
            }
          }
          if (null == this.unpackedFiles[param3]) {
            throw new RuntimeException("");
          }
          if (this.unpackedFiles[param3][param2] != null) {
            var7 = UiTheme.a(false, false, this.unpackedFiles[param3][param2]);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.field_e == 1) {
              this.unpackedFiles[param3][param2] = null;
              if (this.index.field_i[param3] == 1) {
                this.unpackedFiles[param3] = null;
              }
            } else {
              if (this.field_e == 2) {
                this.unpackedFiles[param3] = null;
              }
            }
          }
          stackIn_26_0 = var5;
          return (byte[]) (stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("fm.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) (stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean ensureGroupAvailableByName(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 63) {
            var3 = (Object) null;
            ResourceArchive.a((PlatformTaskDispatcher) null, (Object) null, (byte) 25);
          }
          stackIn_3_0 = DialWidgetPainter.a(param1, (byte) -70, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("fm.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final synchronized int getGroupProgress(int param0, byte param1) {
        if (!this.isGroupValid(param0, -1)) {
          return 0;
        }
        if (param1 != -78) {
          ResourceArchive.releaseStatics(-74);
        }
        if (null != this.packedGroups[param0]) {
          return 100;
        }
        return this.field_a.getGroupProgress(param0, param1 ^ -8270);
    }

    final synchronized byte[] getFirstFile(int param0, int param1) {
        if (!this.ensureIndex(-3)) {
          return null;
        }
        if (this.index.field_i.length == 1) {
          return this.getFile(0, param0, true);
        }
        if (!this.isGroupValid(param0, -1)) {
          return null;
        }
        if (this.index.field_i[param0] == 1) {
          return this.getFile(param0, 0, true);
        }
        int var3 = 10 / ((param1 + 24) / 54);
        throw new RuntimeException();
    }

    final synchronized boolean isFileAvailable(int param0, int param1, int param2) {
        if (!this.isValidFileSlot(param1, param2 ^ param2, param0)) {
          return false;
        }
        if (this.unpackedFiles[param0] != null &&
          this.unpackedFiles[param0][param1] != null) {
          return true;
        }
        if (null != this.packedGroups[param0]) {
          return true;
        }
        this.loadGroup(param0, false);
        if (this.packedGroups[param0] != null) {
          return true;
        }
        return false;
    }

    final boolean ensureGroupAvailableByName(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndex(param1 - 2)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.index.groupNameLookup.a(WeightedLruCache.a(var4, (byte) -97), (byte) -67);
          if (param1 == -1) {
            stackIn_7_0 = this.ensureGroupLoaded(var3_int, false);
            return stackIn_7_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("fm.R(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    ResourceArchive(ArchiveProvider param0, boolean param1, int param2) {
        this.index = null;
        try {
          if (param2 < 0 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_a = param0;
          this.discardPackedGroups = param1 ? true : false;
          this.field_e = param2;
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "fm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int getGroupCount(byte param0) {
        int var2 = 75 / ((19 - param0) / 58);
        if (!this.ensureIndex(-3)) {
          return -1;
        }
        return this.index.field_i.length;
    }

    private final synchronized boolean isValidFileSlot(int param0, int param1, int param2) {
        if (!this.ensureIndex(-3)) {
          return false;
        }
        if (param2 >= param1 &&
          param0 >= 0 &&
          this.index.field_i.length > param2 &&
          this.index.field_i[param2] > param0) {
          return true;
        }
        if (IntrusiveDequeCursor.field_d) {
          throw new IllegalArgumentException(param2 + " " + param0);
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        int var1 = -71 % ((44 - param0) / 47);
        field_d = null;
        field_b = null;
        field_h = null;
        field_f = null;
        field_j = null;
    }

    private final synchronized void loadGroup(int param0, boolean param1) {
        if (param1) {
          this.ensureAllGroupsAvailable(((byte[]) (this.packedGroups[4]))[1]);
        }
        if (!this.discardPackedGroups) {
          this.packedGroups[param0] = aj.a(false, this.field_a.getEncodedGroup(param0, 103), -116);
        } else {
          this.packedGroups[param0] = this.field_a.getEncodedGroup(param0, -94);
        }
    }

    final int getFileId(byte param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.isGroupValid(param2, -1)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          if (param0 > -94) {
            stackIn_6_0 = -122;
            return stackIn_6_0;
          }
          param1 = param1.toLowerCase();
          var5 = (CharSequence) ((Object) param1);
          var4_int = this.index.fileNameLookups[param2].a(WeightedLruCache.a(var5, (byte) 110), (byte) -67);
          if (this.isValidFileSlot(var4_int, 0, param2)) {
            return var4_int;
          }
          stackIn_10_0 = -1;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("fm.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized boolean ensureGroupLoaded(int param0, boolean param1) {
        if (!this.isGroupValid(param0, -1)) {
          return false;
        }
        if (null != this.packedGroups[param0]) {
          return true;
        }
        this.loadGroup(param0, param1);
        if (this.packedGroups[param0] == null) {
          return false;
        }
        return true;
    }

    final synchronized int getOverallProgress(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = Pixelate.field_H ? 1 : 0;
        if (!this.ensureIndex(-3)) {
          return 0;
        }
        var2 = param0;
        var3 = 0;
        for (var4 = 0; var4 < this.packedGroups.length; var4++) {
          if (this.index.fileCounts[var4] > 0) {
            var3 = var3 + this.getGroupProgress(var4, (byte) -78);
            var2 += 100;
          }
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = var3 * 100 / var2;
        return var4Lifetime1;
    }

    final synchronized byte[] getNamedFile(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndex(param0 - 27)) {
            return null;
          }
          if (param0 != 24) {
            field_j = (String) null;
          }
          param2 = param2.toLowerCase();
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.index.groupNameLookup.a(WeightedLruCache.a(var6, (byte) 67), (byte) -67);
          if (!this.isGroupValid(var4_int, -1)) {
            return null;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.index.fileNameLookups[var4_int].a(WeightedLruCache.a(var7, (byte) 61), (byte) -67);
          stackIn_9_0 = this.getFile(var4_int, var5, true);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("fm.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_d = new char[128];
        field_j = "Withdraw invitation to <%0> to join this game";
    }
}
