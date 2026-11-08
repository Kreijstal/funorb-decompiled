/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Atan2Support {
    static boolean field_a;
    static int[] field_h;
    static int field_b;
    static String gameoptPlayerneeds1ratedgame;
    static String quickchatHelpTitle;
    static String cueCantGoThere;
    static String rule04;
    static int field_d;
    static BufferedSocket field_c;
    int field_g;

    final static String addIgnore(int opcode, String name, int operation) {
        RuntimeException var3 = null;
        int var4 = 0;
        CipherPacketBuffer var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (CharSequence) ((Object) name);
          if (!ProgressBarWidget.isAllowedDisplayName(operation ^ -25906, var6)) {
            stackIn_2_0 = ModelInstance.invalidName;
            return stackIn_2_0;
          }
          if (BallEvent.isLocalPlayerName((byte) 3, name)) {
            stackIn_6_0 = QuickChatHelpDialog.cannotAddYourself;
            return stackIn_6_0;
          }
          if (ChatInputSupport.field_a != 2) {
            stackIn_10_0 = MonotonicClock.unableToAddIgnore;
            return stackIn_10_0;
          }
          if (MenuSelection.isIgnoredName(name, 24552)) {
            stackIn_13_0 = AccountWelcomePanel.substituteTemplateArguments(new String[]{name}, -1, LobbyPlayerLookupSupport.ignorelistdupe);
            return stackIn_13_0;
          }
          if (TextHotspotRegion.field_t >= 100) {
            stackIn_17_0 = DebugTuningSlider.ignorelistfull;
            return stackIn_17_0;
          }
          if (DialogLayer.isFriendName(name, -1)) {
            stackIn_21_0 = AccountWelcomePanel.substituteTemplateArguments(new String[]{name}, -1, UsernameSuggestionSupport.removefriendfirst);
            return stackIn_21_0;
          }
          var5 = JaggrabDownloader.field_j;
          var5.writeCipheredOpcode(false, opcode);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(operation, false);
          var5.writeNullTerminatedString(operation - 9948, name);
          var5.writeByteLengthPrefix(var5.position - var4, true);
          stackIn_23_0 = null;
          return (String) (stackIn_23_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("jd.C(").append(opcode).append(',');
          if (name == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(operation).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        rule04 = null;
        gameoptPlayerneeds1ratedgame = null;
        quickchatHelpTitle = null;
        field_c = null;
        field_h = null;
        cueCantGoThere = null;
        if (param0 < 47) {
          String var2 = (String) null;
          Atan2Support.isStrongPassword((byte) 35, (String) null, (String) null);
        }
    }

    final static String getVisibleTooltipText(int obfuscationGuard) {
        if (BrowserCookieWriter.field_d) {
          if (obfuscationGuard != 9383) {
            field_h = (int[]) null;
            return null;
          }
          return null;
        }
        if (CompressedContainerSupport.field_c > PauseMenuScreen.field_J) {
          if (obfuscationGuard != 9383) {
            field_h = (int[]) null;
            return null;
          }
          return null;
        }
        if (CompressedContainerSupport.field_c + ParticleTrail.field_d > PauseMenuScreen.field_J) {
          return MessageScreen.field_I;
        }
        if (obfuscationGuard != 9383) {
          field_h = (int[]) null;
          return null;
        }
        return null;
    }

    final static boolean isStrongPassword(byte obfuscationGuard, String username, String password) {
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (HotspotRectangle.containsNonAlphanumeric(1, password)) {
            return false;
          }
          if (IterableNodeHashTable.hasUniformCharacters(password, -106)) {
            return false;
          }
          if (SpaceTableScene.hasInvalidPasswordLength(password, 28350)) {
            return false;
          }
          if (obfuscationGuard >= -24) {
            var4 = (String) null;
            Atan2Support.isStrongPassword((byte) 61, (String) null, (String) null);
          }
          if (0 == username.length()) {
            return true;
          }
          if (TutorialController.containsForwardOrReversed(password, username, 17924)) {
            return false;
          }
          if (BirthDateInputWidget.containsForwardOrReversed(username, (byte) -111, password)) {
            return false;
          }
          if (!StateIconLabel.a(23138, username, password)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("jd.F(").append(obfuscationGuard).append(',');
          if (username == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (password == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final static MeshBuilder[] splitMeshForSpatialCells(int obfuscationGuard, MeshBuilder mesh) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        MeshBuilder[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          MeshBoundsSupport.computeMeshBounds(mesh, -23109);
          var2 = new int[]{3, 1, 1};
          if (obfuscationGuard <= 65) {
            field_b = 76;
          }
          BrowserCookieSupport.computeMeshSubdivisionCounts(-2656, var2, mesh);
          stackIn_3_0 = LocalGameSetupScreen.splitMeshIntoGrid(mesh, var2, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("jd.B(").append(obfuscationGuard).append(',');
          if (mesh == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int atan2Angle(int param0, int param1, int param2) {
        if (param1 != 1164778608) {
          field_h = (int[]) null;
          if (param0 < param2) {
            return 2048 - FixedAngleSupport.arcTangent(-65536, (param0 << 16) / param2);
          }
          return FixedAngleSupport.arcTangent(-65536, (param2 << 16) / param0);
        }
        if (param0 < param2) {
          return 2048 - FixedAngleSupport.arcTangent(-65536, (param0 << 16) / param2);
        }
        return FixedAngleSupport.arcTangent(-65536, (param2 << 16) / param0);
    }

    static {
        field_h = new int[]{1000, 1100};
        gameoptPlayerneeds1ratedgame = "<%0> must play 1 more rated game before playing with the current options.";
        quickchatHelpTitle = "Shortcut Reference";
        cueCantGoThere = "Cue can't go there!";
        field_b = -1;
        rule04 = "Scamming";
    }
}
