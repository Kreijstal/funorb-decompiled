/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
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

    final static String a(int param0, String param1, int param2) {
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
          var6 = (CharSequence) ((Object) param1);
          if (!ProgressBarWidget.a(param2 ^ -25906, var6)) {
            stackIn_2_0 = ModelInstance.invalidName;
            return stackIn_2_0;
          }
          if (BallEvent.a((byte) 3, param1)) {
            stackIn_6_0 = QuickChatHelpDialog.cannotAddYourself;
            return stackIn_6_0;
          }
          if (th.field_a != 2) {
            stackIn_10_0 = rl.unableToAddIgnore;
            return stackIn_10_0;
          }
          if (MenuSelection.a(param1, 24552)) {
            stackIn_13_0 = AccountWelcomePanel.substituteTemplateArguments(new String[]{param1}, -1, mg.ignorelistdupe);
            return stackIn_13_0;
          }
          if (TextHotspotRegion.field_t >= 100) {
            stackIn_17_0 = DebugTuningSlider.ignorelistfull;
            return stackIn_17_0;
          }
          if (DialogLayer.a(param1, -1)) {
            stackIn_21_0 = AccountWelcomePanel.substituteTemplateArguments(new String[]{param1}, -1, gf.removefriendfirst);
            return stackIn_21_0;
          }
          var5 = JaggrabDownloader.field_j;
          var5.writeCipheredOpcode(false, param0);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(param2, false);
          var5.a(param2 - 9948, param1);
          var5.writeByteLengthPrefix(var5.position - var4, true);
          stackIn_23_0 = null;
          return (String) (stackIn_23_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("jd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        rule04 = null;
        gameoptPlayerneeds1ratedgame = null;
        quickchatHelpTitle = null;
        field_c = null;
        field_h = null;
        cueCantGoThere = null;
        if (param0 < 47) {
          String var2 = (String) null;
          jd.a((byte) 35, (String) null, (String) null);
        }
    }

    final static String a(int param0) {
        if (nn.field_d) {
          if (param0 != 9383) {
            field_h = (int[]) null;
            return null;
          }
          return null;
        }
        if (wp.field_c > PauseMenuScreen.field_J) {
          if (param0 != 9383) {
            field_h = (int[]) null;
            return null;
          }
          return null;
        }
        if (wp.field_c + ji.field_d > PauseMenuScreen.field_J) {
          return MessageScreen.field_I;
        }
        if (param0 != 9383) {
          field_h = (int[]) null;
          return null;
        }
        return null;
    }

    final static boolean a(byte param0, String param1, String param2) {
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (qa.a(1, param2)) {
            return false;
          }
          if (IterableNodeHashTable.a(param2, -106)) {
            return false;
          }
          if (SpaceTableScene.hasInvalidPasswordLength(param2, 28350)) {
            return false;
          }
          if (param0 >= -24) {
            var4 = (String) null;
            jd.a((byte) 61, (String) null, (String) null);
          }
          if (0 == param1.length()) {
            return true;
          }
          if (TutorialController.containsForwardOrReversed(param2, param1, 17924)) {
            return false;
          }
          if (BirthDateInputWidget.containsForwardOrReversed(param1, (byte) -111, param2)) {
            return false;
          }
          if (!StateIconLabel.a(23138, param1, param2)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("jd.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final static MeshBuilder[] a(int param0, MeshBuilder param1) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        MeshBuilder[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          d.computeMeshBounds(param1, -23109);
          var2 = new int[]{3, 1, 1};
          if (param0 <= 65) {
            field_b = 76;
          }
          ie.a(-2656, var2, param1);
          stackIn_3_0 = LocalGameSetupScreen.a(param1, var2, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("jd.B(").append(param0).append(',');
          if (param1 == null) {
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
            return 2048 - bo.arcTangent(-65536, (param0 << 16) / param2);
          }
          return bo.arcTangent(-65536, (param2 << 16) / param0);
        }
        if (param0 < param2) {
          return 2048 - bo.arcTangent(-65536, (param0 << 16) / param2);
        }
        return bo.arcTangent(-65536, (param2 << 16) / param0);
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
