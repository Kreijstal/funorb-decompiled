/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelegatingCanvas extends java.awt.Canvas {
    static int field_d;
    static Atan2Support[][] field_a;
    static String openinpopupwindow;
    private java.awt.Component field_c;

    final static AlphaFont loadAlphaFont(ResourceArchive spriteArchive, int fileId, int groupId, ResourceArchive metricsArchive, int obfuscationGuard) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        AlphaFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 24888) {
            openinpopupwindow = (String) null;
          }
          if (TextLineLayout.loadSpriteSheet(groupId, spriteArchive, fileId, (byte) 121)) {
            stackIn_6_0 = ProjectedLineSupport.createAlphaFont(metricsArchive.getFileBytesUnkeyed(obfuscationGuard - 24766, fileId, groupId), true);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (AlphaFont) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("cn.D(");
          if (spriteArchive == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(fileId).append(',').append(groupId).append(',');
          if (metricsArchive == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void initializeLobbyChatPanels(int obfuscationGuard) {
        BirthDateValidator.field_m = new UiComponent(0L, (UiComponent) null);
        if (AccountStateQuery.field_p) {
          BirthDateValidator.field_m.addChild(21, SceneNodeEntry.field_m);
        }
        BirthDateValidator.field_m.addChild(39, QuickChatMenuSupport.field_e);
        ByteRecordSubmission.field_l = new ReflectionRequestSupport(BirthDateValidator.muChatLobby, BirthDateValidator.field_m);
        BufferedFile.field_a = new UiComponent(0L, (UiComponent) null);
        BufferedFile.field_a.addChild(-117, ByteRecordSubmission.field_l.field_i);
        BufferedFile.field_a.addChild(-120, ProgressBarWidget.field_K);
        LobbyPanelLayoutSupport.layoutLobbyPanels(48);
        int var1 = 106 / ((-83 - obfuscationGuard) / 35);
    }

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_c.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "cn.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean getAccountCreationRequestFlag(byte obfuscationGuard) {
        if (obfuscationGuard < 33) {
          ResourceArchive var2 = (ResourceArchive) null;
          DelegatingCanvas.loadAlphaFont((ResourceArchive) null, 9, -34, (ResourceArchive) null, -113);
        }
        return IterableDualLinkDeque.field_c;
    }

    public static void releaseStatics(byte param0) {
        field_a = (Atan2Support[][]) null;
        if (param0 != 38) {
          openinpopupwindow = (String) null;
        }
        openinpopupwindow = null;
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_c.update(param0);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "cn.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static String normalizeUsername(int param0, CharSequence param1) {
        int var5 = 0;
        int var2_int = 0;
        int var3 = 0;
        char[] var4 = null;
        int var6 = 0;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var2_int = 115 / ((param0 - 73) / 39);
          var3 = param1.length();
          if (var3 > 20) {
            var3 = 20;
          }
          var4 = new char[var3];
          for (var5 = 0; var5 < var3; var5++) {
            var6 = param1.charAt(var5);
            if (65 <= var6 &&
              var6 <= 90) {
              var4[var5] = (char)(var6 + 32);
            } else if ((var6 < 97 ||
              var6 > 122) &&
              (48 > var6 ||
              var6 > 57)) {
              var4[var5] = (char)95;
            } else {
              var4[var5] = (char)var6;
            }
          }
          stackIn_17_0 = new String(var4);
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("cn.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    DelegatingCanvas(java.awt.Component param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "cn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        openinpopupwindow = "Open in popup window";
    }
}
