/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Js5Archive {
    boolean field_b;
    private ArchiveIndex field_c;
    private ArchiveProvider field_i;
    static String[] field_j;
    private Object[][] field_f;
    static String field_m;
    static int field_n;
    int field_k;
    static boolean field_e;
    static int field_d;
    static String field_g;
    static String field_h;
    static IndexedSprite field_l;
    private Object[] field_a;

    final boolean ensureFileAvailableByName(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndexLoaded(param2 ^ param2)) {
            return false;
          }
          param0 = param0.toLowerCase();
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_c.field_h.lookup(true, TextDecodeHelpers.hashString(6, var6));
          if (!this.isValidGroup((byte) 94, var4_int)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_c.field_u[var4_int].lookup(true, TextDecodeHelpers.hashString(6, var7));
          stackIn_8_0 = this.isFileAvailable(var4_int, (byte) 125, var5);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("eh.P(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final int getFileCount(byte param0, int param1) {
        if (param0 <= 33) {
          this.ensureGroupAvailableByName(((byte[]) (this.field_a[2]))[1], (String) (this.field_a[12]));
        }
        if (!this.isValidGroup((byte) 101, param1)) {
          return 0;
        }
        return this.field_c.field_i[param1];
    }

    final synchronized boolean ensureIndexLoaded(int param0) {
        if (this.field_c == null) {
          this.field_c = this.field_i.getIndex((byte) 64);
          if (null == this.field_c) {
            return false;
          }
          this.field_f = new Object[this.field_c.field_v][];
          this.field_a = new Object[this.field_c.field_v];
        }
        if (param0 != 0) {
          this.ensureGroupLoaded((byte) 63, -6);
          return true;
        }
        return true;
    }

    final boolean ensureGroupAvailableByName(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -102) {
            field_j = (String[]) (this.field_a[0]);
          }
          if (!this.ensureIndexLoaded(0)) {
            return false;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_c.field_h.lookup(true, TextDecodeHelpers.hashString(6, var4));
          stackIn_6_0 = this.ensureGroupLoaded((byte) -127, var3_int);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("eh.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void openExternalUrl(String param0, java.applet.Applet param1, byte param2, boolean param3) {
        try {
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          try {
            if (param2 != -25) {
              return;
            }
            if (PlatformTaskDispatcher.field_x.startsWith("win") &&
              StatusAndUrlHelpers.openUrlWithShell(10448, param0)) {
              return;
            }
            try {
              param1.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              IconLabelWidget.reportClientError("MGR1: " + param0, (Throwable) null, 1);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var4_ref;
            stackIn_13_1 = new StringBuilder().append("eh.CA(");
            if (param0 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
            if (param1 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int getGroupCount(int param0) {
        if (param0 <= 11) {
          Js5Archive.openExternalUrl((String) (((Object[]) (this.field_a[7]))[1]), (java.applet.Applet) (this.field_a[35]), (byte) -84, false);
        }
        if (!this.ensureIndexLoaded(0)) {
          return -1;
        }
        return this.field_c.field_i.length;
    }

    private final synchronized boolean isValidGroup(byte param0, int param1) {
        if (!this.ensureIndexLoaded(0)) {
          return false;
        }
        if (param0 <= 92) {
          String var4 = (String) null;
          this.ensureGroupAvailableByName((byte) -128, (String) null);
        }
        if (param1 >= 0 &&
          this.field_c.field_i.length > param1 &&
          this.field_c.field_i[param1] != 0) {
          return true;
        }
        if (!LoginCredentials.field_a) {
          return false;
        }
        throw new IllegalArgumentException(Integer.toString(param1));
    }

    final static String getActiveLoginIdentifier(int param0) {
        int var1 = -42 % ((param0 + 47) / 43);
        if (MusicVoiceMixer.field_l == ScrollPaneWithFooter.field_Kb) {
          return LoginDialog.field_sb;
        }
        if (!ValidationIndicator.field_I.isComplete(-73)) {
          return ValidationIndicator.field_I.getText(32);
        }
        if (ScrollPaneWithFooter.field_Kb == MouseWheelInput.field_c) {
          return ValidationIndicator.field_I.getText(32);
        }
        return MouseTrailPoint.field_g;
    }

    private final synchronized boolean unpackGroup(int param0, int param1, int param2, int[] param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        boolean stackIn_35_2 = false;
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
        int var10Lifetime1;
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
        var22 = Virogrid.field_F ? 1 : 0;
        try {
          if (!this.isValidGroup((byte) 112, param1)) {
            return false;
          }
          if (this.field_a[param1] == null) {
            return false;
          }
          var5_int = this.field_c.field_n[param1];
          var34 = this.field_c.field_r[param1];
          var24 = var34;
          var6 = var24;
          if (null == this.field_f[param1]) {
            array$0 = new Object[this.field_c.field_i[param1]];
            this.field_f[param1] = array$0;
          }
          var7 = this.field_f[param1];
          var8 = 1;
          for (var9_int = 0; var5_int > var9_int; var9_int++) {
            if (var6 != null) {
              var10 = var34[var9_int];
            } else {
              var10 = var9_int;
            }
            if (null != var7[var10]) {
              continue;
            }
            var8 = 0;
            break;
          }
          var10Lifetime1 = -7 / ((17 - param2) / 44);
          if (var8 != 0) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param3 != null && (param3[0] != 0 ||
            0 != param3[1] ||
            0 != param3[2] ||
            param3[3] != 0)) {
            var35 = ArchiveBytesHelpers.unwrapArchiveBytes(this.field_a[param1], true, (byte) -128);
            var25 = var35;
            var9 = var25;
            var26 = new PacketBuffer(var35);
            var26.decryptXteaRange(var26.payload.length, param3, 9843, 5);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = ArchiveBytesHelpers.unwrapArchiveBytes(this.field_a[param1], false, (byte) -125);
          }
          try {
            var36 = PopupInputHelpers.decompressContainer(var9, 117);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_34_0 = var11_ref_RuntimeException;
            stackIn_34_1 = new StringBuilder();
            stackIn_35_2 = (param3 != null);
            throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(" ").append(param1).append(" ").append(var9.length).append(" ").append(HelpPopup.computeCrc32(false, var9.length, var9)).append(" ").append(HelpPopup.computeCrc32(false, -2 + var9.length, var9)).append(" ").append(this.field_c.field_m[param1]).append(" ").append(this.field_c.field_q).toString());
          }
          if (this.field_b) {
            this.field_a[param1] = null;
          }
          if (var5_int > 1) {
            if (this.field_k == 2) {
              var11 = var36.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - 4 * (var5_int * var12);
              var32 = new PacketBuffer(var43);
              var14 = 0;
              var32.position = var11;
              var15 = 0;
              for (var16 = 0; var16 < var12; var16++) {
                var17 = 0;
                for (var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var32.readInt((byte) 123);
                  if (var6 != null) {
                    var19 = var34[var18];
                  } else {
                    var19 = var18;
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
                for (var20 = 0; var5_int > var20; var20++) {
                  var19Lifetime2 = var19Lifetime2 + var32.readInt((byte) 96);
                  if (var6 != null) {
                    var21 = var34[var20];
                  } else {
                    var21 = var20;
                  }
                  if (param0 == var21) {
                    ArraySupport.copy(var43, var17Lifetime4, var44, var14Lifetime1, var19Lifetime2);
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
            var12Lifetime1 = 255 & var23[var11];
            var11 = var11 - var12Lifetime1 * var5_int * 4;
            var29 = new PacketBuffer(var43);
            var38 = new int[var5_int];
            var30 = var38;
            var14_ref_int__ = var30;
            var29.position = var11;
            for (var15Lifetime1 = 0; var12Lifetime1 > var15Lifetime1; var15Lifetime1++) {
              var16Lifetime1 = 0;
              for (var17Lifetime1 = 0; var17Lifetime1 < var5_int; var17Lifetime1++) {
                var16Lifetime1 = var16Lifetime1 + var29.readInt((byte) 126);
                var14_ref_int__[var17Lifetime1] = var14_ref_int__[var17Lifetime1] + var16Lifetime1;
              }
            }
            var39 = new byte[var5_int][];
            var31 = var39;
            var15_ref_byte____ = var31;
            for (var16Lifetime2 = 0; var5_int > var16Lifetime2; var16Lifetime2++) {
              array$1 = new byte[var38[var16Lifetime2]];
              var15_ref_byte____[var16Lifetime2] = array$1;
              var38[var16Lifetime2] = 0;
            }
            var29.position = var11;
            var16Lifetime3 = 0;
            for (var17Lifetime2 = 0; var17Lifetime2 < var12Lifetime1; var17Lifetime2++) {
              var18Lifetime1 = 0;
              for (var19Lifetime1 = 0; var5_int > var19Lifetime1; var19Lifetime1++) {
                var18Lifetime1 = var18Lifetime1 + var29.readInt((byte) 122);
                ArraySupport.copy(var43, var16Lifetime3, var39[var19Lifetime1], var38[var19Lifetime1], var18Lifetime1);
                var14_ref_int__[var19Lifetime1] = var14_ref_int__[var19Lifetime1] + var18Lifetime1;
                var16Lifetime3 = var16Lifetime3 + var18Lifetime1;
              }
            }
            for (var17Lifetime3 = 0; var5_int > var17Lifetime3; var17Lifetime3++) {
              if (var6 != null) {
                var18Lifetime2 = var34[var17Lifetime3];
              } else {
                var18Lifetime2 = var17Lifetime3;
              }
              if (this.field_k == 0) {
                var7[var18Lifetime2] = QuickChatPhraseDefinition.wrapBytes(-3, var39[var17Lifetime3], false);
              } else {
                var7[var18Lifetime2] = var39[var17Lifetime3];
              }
            }
          } else {
            if (var6 == null) {
              var11 = 0;
            } else {
              var11 = var34[0];
            }
            if (this.field_k == 0) {
              var7[var11] = QuickChatPhraseDefinition.wrapBytes(-3, var43, false);
            } else {
              var7[var11] = var36;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_103_0 = var5;
          stackIn_103_1 = new StringBuilder().append("eh.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(')').toString());
        }
    }

    final synchronized int[] getFileIds(byte param0, int param1) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = Virogrid.field_F ? 1 : 0;
        if (!this.isValidGroup((byte) 103, param1)) {
          return null;
        }
        if (param0 < 124) {
          ((long[]) (((Object[]) (this.field_a[5]))[2]))[5] = ((long[]) (this.field_a[3]))[14];
        }
        int[] var3 = this.field_c.field_r[param1];
        if (var3 == null) {
          var6 = new int[this.field_c.field_n[param1]];
          var3 = var6;
          for (var4 = 0; var4 < var6.length; var4++) {
            var6[var4] = var4;
          }
        }
        return var3;
    }

    final int findGroupId(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndexLoaded(0)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          if (param0 != -1) {
            stackIn_6_0 = 53;
            return stackIn_6_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_c.field_h.lookup(true, TextDecodeHelpers.hashString(param0 + 7, var4));
          if (this.isValidGroup((byte) 103, var3_int)) {
            stackIn_11_0 = var3_int;
            return stackIn_11_0;
          }
          stackIn_9_0 = -1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("eh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int getFileId(int param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.isValidGroup((byte) 95, param1)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param2 = param2.toLowerCase();
          if (param0 >= -46) {
            var5 = (String) null;
            this.ensureGroupAvailableByName((byte) 121, (String) null);
          }
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_c.field_u[param1].lookup(true, TextDecodeHelpers.hashString(6, var6));
          if (this.isValidFile(var4_int, param1, 0)) {
            stackIn_10_0 = var4_int;
            return stackIn_10_0;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("eh.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final synchronized boolean ensureGroupLoaded(byte param0, int param1) {
        if (!this.isValidGroup((byte) 110, param1)) {
          return false;
        }
        if (this.field_a[param1] != null) {
          return true;
        }
        int var3 = -43 / ((-32 - param0) / 52);
        this.loadPackedGroup(-8003, param1);
        if (null == this.field_a[param1]) {
          return false;
        }
        return true;
    }

    final synchronized boolean isFlatFileAvailable(boolean param0, int param1) {
        if (!this.ensureIndexLoaded(0)) {
          return false;
        }
        if (1 == this.field_c.field_i.length) {
          return this.isFileAvailable(0, (byte) -10, param1);
        }
        if (!this.isValidGroup((byte) 105, param1)) {
          return false;
        }
        if (this.field_c.field_i[param1] == 1) {
          return this.isFileAvailable(param1, (byte) 127, 0);
        }
        if (!param0) {
          this.isFlatFileAvailable(true, -82);
        }
        throw new RuntimeException();
    }

    private final synchronized void loadPackedGroup(int param0, int param1) {
        if (param0 != -8003) {
          this.getGroupCount(-98);
        }
        if (this.field_b) {
          this.field_a[param1] = this.field_i.getPackedGroup(param1, 122);
        } else {
          this.field_a[param1] = QuickChatPhraseDefinition.wrapBytes(param0 + 8000, this.field_i.getPackedGroup(param1, 120), false);
        }
    }

    final synchronized byte[] getFileByName(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndexLoaded(0)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          param0 = param0.toLowerCase();
          param2 = param2.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_c.field_h.lookup(true, TextDecodeHelpers.hashString(6, var6));
          if (!this.isValidGroup((byte) 97, var4_int)) {
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          if (param1 != 100) {
            this.getFlatFile(-105, 124);
          }
          var7 = (CharSequence) ((Object) param2);
          var5 = this.field_c.field_u[var4_int].lookup(true, TextDecodeHelpers.hashString(6, var7));
          stackIn_9_0 = this.getFile(var4_int, var5, 0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("eh.S(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final synchronized byte[] getFlatFile(int param0, int param1) {
        if (!this.ensureIndexLoaded(0)) {
          return null;
        }
        if (this.field_c.field_i.length == 1) {
          return this.getFile(0, param0, 0);
        }
        if (!this.isValidGroup((byte) 124, param0)) {
          return null;
        }
        if (1 == this.field_c.field_i[param0]) {
          return this.getFile(param0, 0, param1 ^ 27034);
        }
        if (param1 != 27034) {
          return (byte[]) null;
        }
        throw new RuntimeException();
    }

    final synchronized int getOverallProgress(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = Virogrid.field_F ? 1 : 0;
        if (param0 != -2677) {
          return -66;
        }
        if (!this.ensureIndexLoaded(0)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; this.field_a.length > var4; var4++) {
          if (this.field_c.field_n[var4] > 0) {
            var2 += 100;
            var3 = var3 + this.getGroupProgress((byte) 106, var4);
          }
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = 100 * var3 / var2;
        return var4Lifetime1;
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -104) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          Js5Archive.openExternalUrl((String) null, (java.applet.Applet) null, (byte) -81, true);
        }
        field_j = null;
        field_g = null;
        field_m = null;
        field_h = null;
        field_l = null;
    }

    final synchronized boolean areAllGroupsAvailable(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = Virogrid.field_F ? 1 : 0;
        if (!this.ensureIndexLoaded(param0 ^ param0)) {
          return false;
        }
        var2 = 1;
        for (var3 = 0; this.field_c.field_c.length > var3; var3++) {
          var4 = this.field_c.field_c[var3];
          if (this.field_a[var4] == null) {
            this.loadPackedGroup(-8003, var4);
            if (null == this.field_a[var4]) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    final synchronized int getGroupProgress(byte param0, int param1) {
        if (!this.isValidGroup((byte) 119, param1)) {
          return 0;
        }
        if (param0 <= 73) {
          return -79;
        }
        if (this.field_a[param1] != null) {
          return 100;
        }
        return this.field_i.getGroupProgress(-7, param1);
    }

    final static DisplayModeInfo[] listDisplayModes(int param0, PlatformTaskDispatcher param1) {
        int var5 = 0;
        DisplayModeInfo[] stackIn_3_0 = null;
        DisplayModeInfo[] stackIn_12_0 = null;
        DisplayModeInfo[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        DisplayModeInfo[] var4 = null;
        DisplayModeInfo var6 = null;
        int var7 = 0;
        PlatformTask var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          if (!param1.isFullscreenAvailable(-121)) {
            stackIn_3_0 = new DisplayModeInfo[]{};
            return stackIn_3_0;
          }
          if (param0 <= 30) {
            field_l = (IndexedSprite) null;
          }
          var8 = param1.requestDisplayModes((byte) -125);
          while (var8.field_a == 0) {
            IsaacRandom.sleepMillis(-27, 10L);
          }
          if (var8.field_a == 2) {
            stackIn_12_0 = new DisplayModeInfo[]{};
            return stackIn_12_0;
          }
          var10 = (int[]) (var8.field_f);
          var9 = var10;
          var3 = var9;
          var4 = new DisplayModeInfo[var10.length >> 2];
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new DisplayModeInfo();
            var4[var5] = var6;
            var6.field_c = var3[var5 << 2];
            var6.field_k = var3[1 + (var5 << 2)];
            var6.field_g = var3[(var5 << 2) + 2];
            var6.field_d = var3[(var5 << 2) + 3];
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("eh.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final boolean hasGroupName(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndexLoaded(0)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_c.field_h.lookup(param1, TextDecodeHelpers.hashString(6, var4));
          if (0 <= var3_int) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("eh.D(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final int getGroupProgressByName(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.ensureIndexLoaded(0)) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          param0 = param0.toLowerCase();
          if (param1 < 71) {
            this.getGroupCount(-48);
          }
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_c.field_h.lookup(true, TextDecodeHelpers.hashString(6, var4));
          stackIn_7_0 = this.getGroupProgress((byte) 85, var3_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("eh.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final synchronized boolean isValidFile(int param0, int param1, int param2) {
        if (!this.ensureIndexLoaded(param2 ^ 0)) {
          return false;
        }
        if (param2 <= param1 &&
          param0 >= 0 &&
          this.field_c.field_i.length > param1 &&
          param0 < this.field_c.field_i[param1]) {
          return true;
        }
        if (!LoginCredentials.field_a) {
          return false;
        }
        throw new IllegalArgumentException(param1 + " " + param0);
    }

    final byte[] getFile(int param0, int param1, int param2) {
        if (param2 != 0) {
          return (byte[]) (this.field_a[14]);
        }
        return this.getFileWithKeys(125, param0, (int[]) null, param1);
    }

    private final synchronized byte[] getFileWithKeys(int param0, int param1, int[] param2, int param3) {
        Object stackIn_2_0 = null;
        byte[] stackIn_16_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!this.isValidFile(param3, param1, 0)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          var5 = null;
          if ((this.field_f[param1] == null ||
            null == this.field_f[param1][param3]) && !this.unpackGroup(param3, param1, 63, param2)) {
            this.loadPackedGroup(-8003, param1);
            if (!this.unpackGroup(param3, param1, 108, param2)) {
              return null;
            }
          }
          if (null == this.field_f[param1]) {
            throw new RuntimeException("");
          }
          if (param0 <= 107) {
            stackIn_16_0 = (byte[]) null;
            return stackIn_16_0;
          }
          if (this.field_f[param1][param3] != null) {
            var7 = ArchiveBytesHelpers.unwrapArchiveBytes(this.field_f[param1][param3], false, (byte) -126);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (1 != this.field_k) {
              if (2 == this.field_k) {
                this.field_f[param1] = null;
              }
            } else {
              this.field_f[param1][param3] = null;
              if (this.field_c.field_i[param1] == 1) {
                this.field_f[param1] = null;
              }
            }
          }
          stackIn_31_0 = var5;
          return (byte[]) (stackIn_31_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_34_0 = var5;
          stackIn_34_1 = new StringBuilder().append("eh.W(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) (stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized boolean isFileAvailable(int param0, byte param1, int param2) {
        if (!this.isValidFile(param2, param0, 0)) {
          return false;
        }
        if (this.field_f[param0] != null &&
          this.field_f[param0][param2] != null) {
          return true;
        }
        if (this.field_a[param0] != null) {
          return true;
        }
        this.loadPackedGroup(-8003, param0);
        int var4 = 119 / ((74 - param1) / 50);
        if (null != this.field_a[param0]) {
          return true;
        }
        return false;
    }

    Js5Archive(ArchiveProvider param0, boolean param1, int param2) {
        this.field_c = null;
        try {
          if (param2 < 0 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_b = param1 ? true : false;
          this.field_k = param2;
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "eh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = "On";
        field_n = 0;
        field_m = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_h = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
