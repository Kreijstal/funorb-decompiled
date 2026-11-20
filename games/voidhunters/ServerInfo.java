/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ServerInfo implements DiffableState {
    static int[] field_d;
    lc field_e;
    boolean copyToClipboardHidden;
    int[] componentoptionStates;
    private int[] voteoptionStates;
    static int field_f;

    final void resetOptionStates(byte param0) {
        int[] discarded$0 = null;
        if (param0 != -65) {
          discarded$0 = this.createDefaultVoteOptionStates(-107);
        }
        this.voteoptionStates = this.createDefaultVoteOptionStates(param0 ^ -64);
        this.componentoptionStates = this.createDefaultComponentOptionStates(0);
        this.copyToClipboardHidden = true;
    }

    final boolean isVoteOptionLimitedTime(int param0, byte param1) {
        int var3 = this.voteoptionStates[param0];
        if (param1 != -43) {
          return true;
        }
        return this.isLimitedTimeOptionState(var3, false);
    }

    final boolean isComingSoonOptionState(int param0, int param1) {
        int var3;
        boolean stackIn_5_0 = false;
        var3 = -81 / ((param1 - 16) / 49);
        stackIn_5_0 = (param0 == 2) || (param0 == 7);
        return stackIn_5_0;
    }

    private final boolean isLimitedTimeOptionState(int param0, boolean param1) {
        PcmSample var4;
        boolean stackIn_7_0 = false;
        if (param1) {
          var4 = (PcmSample) null;
          ServerInfo.playPannedSample(-94, -103, 25, (PcmSample) null);
        }
        stackIn_7_0 = (param0 == 3) || (param0 == 8);
        return stackIn_7_0;
    }

    public final void copyTo(byte param0, SerializableGameState param1) {
        ServerInfo var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (ServerInfo) (param1);
          var3.voteoptionStates = SetTeamSelectionSpeedup.a(var3.voteoptionStates, (byte) -108, this.voteoptionStates);
          var3.componentoptionStates = SetTeamSelectionSpeedup.a(var3.componentoptionStates, (byte) -38, this.componentoptionStates);
          var3.copyToClipboardHidden = this.copyToClipboardHidden;
          if (param0 < 54) {
            this.isVoteOptionLimitedTime(-67, (byte) -39);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("coa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void reportDifferences(SerializableGameState other, int obfuscationGuard) {
        int var4 = 0;
        ServerInfo var5 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var5 = (ServerInfo) (other);
          if (obfuscationGuard >= -19) {
            return;
          }
          var4 = 0;
          if (GetCountermeasuresCooldown.a(this.voteoptionStates, var5.voteoptionStates, false)) {
            var4 = 1;
            System.out.println("int[] voteoption_states has changed. ");
          }
          if (GetCountermeasuresCooldown.a(this.componentoptionStates, var5.componentoptionStates, false)) {
            var4 = 1;
            System.out.println("int[] componentoption_states has changed. ");
          }
          stackIn_10_0 = (var5.copyToClipboardHidden) ? 0 : 1;
          if (this.copyToClipboardHidden) {
            stackIn_13_1 = 0;
          } else {
            stackIn_13_1 = 1;
          }
          if (stackIn_10_0 != stackIn_13_1) {
            var4 = 1;
            System.out.println("boolean copy_to_clipboard_hidden has changed. before=" + var5.copyToClipboardHidden + ", now=" + this.copyToClipboardHidden);
          }
          if (var4 != 0) {
            System.out.println("This instance of ServerInfo has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("coa.F(");
          if (other == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final boolean isVoteOptionAllowedInCurrentMode(int param0, boolean param1) {
        int var3;
        if (param1) {
          return false;
        }
        if (pr.field_c == null) {
          return false;
        }
        var3 = pr.field_c.field_g;
        if (var3 != 1) {
          if (pla.a(param0, -4)) {
            return false;
          }
          return true;
        }
        if (OpenGlGpuBuffer.a(param0, true) &&
          !pla.a(param0, -4)) {
          return false;
        }
        return true;
    }

    private final void ensureOptionStateArrays(int param0) {
        int[] var3 = null;
        int[] var4 = null;
        int[] var2 = null;
        int[] var2Lifetime1;
        if (null == this.voteoptionStates) {
          this.voteoptionStates = this.createDefaultVoteOptionStates(119);
          return;
        }
        if (this.voteoptionStates.length != 31) {
          var3 = this.createDefaultVoteOptionStates(param0 - 13424);
          var2 = var3;
          this.copyOptionStates(this.voteoptionStates, (byte) 117, var3);
          this.voteoptionStates = var3;
        }
        if (this.componentoptionStates == null) {
          this.componentoptionStates = this.createDefaultComponentOptionStates(param0 - 13546);
          return;
        }
        if (param0 != 13546) {
          this.isVoteOptionLimitedTime(-88, (byte) 56);
        }
        if (56 != this.componentoptionStates.length) {
          var4 = this.createDefaultComponentOptionStates(0);
          var2Lifetime1 = var4;
          this.copyOptionStates(this.componentoptionStates, (byte) 108, var4);
          this.componentoptionStates = var4;
        }
    }

    final boolean isOptionStateAvailable(int param0, boolean param1, boolean param2) {
        int[] discarded$1 = null;
        boolean stackIn_12_0 = false;
        if (param2) {
          discarded$1 = this.createDefaultComponentOptionStates(66);
        }
        boolean decompiledFrameRemainder0 = true;
        if (param0 != 0 &&
          1 != param0 &&
          param0 != 3 && (!param1 ||
          param0 != 5 &&
          param0 != 6 &&
          param0 != 8)) {
          stackIn_12_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_12_0 = true;
        }
        return stackIn_12_0;
    }

    public final String toString() {
        return "Voteoption states=" + SetFightersPerPlayerMaximum.a(this.voteoptionStates, false) + "\nComponentoption states=" + SetFightersPerPlayerMaximum.a(this.componentoptionStates, false) + "\ncopy_to_clipboard_hidden=" + this.copyToClipboardHidden + "\nServerside: " + this.field_e;
    }

    final boolean isComponentOptionComingSoon(int param0, int param1) {
        if (param0 != -22549) {
          this.field_e = (lc) null;
        }
        int var3 = this.componentoptionStates[param1];
        return this.isComingSoonOptionState(var3, param0 + 22645);
    }

    public static void clearSharedReferences(boolean param0) {
        field_d = null;
        if (!param0) {
          field_f = -124;
        }
    }

    private final void copyOptionStates(int[] param0, byte param1, int[] param2) {
        int var5 = 0;
        boolean discarded$1 = false;
        int var4_int = 0;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = VoidHunters.field_G;
        try {
          var4_int = Math.min(param2.length, param0.length);
          for (var5 = 0; var4_int > var5; var5++) {
            param2[var5] = param0[var5];
          }
          if (param1 < 103) {
            discarded$1 = this.isMembersOptionState(36, 79);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("coa.N(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean isVoteOptionNew(int param0, byte param1) {
        int var3 = this.voteoptionStates[param0];
        int var4 = 22 % ((-29 - param1) / 48);
        return this.isNewOptionState(true, var3);
    }

    final boolean isVoteOptionComingSoon(int param0, int param1) {
        if (param1 != 4) {
          SerializableGameState var4 = (SerializableGameState) null;
          this.copyTo((byte) 119, (SerializableGameState) null);
        }
        int var3 = this.voteoptionStates[param0];
        return this.isComingSoonOptionState(var3, -52);
    }

    private final boolean isMembersOptionState(int param0, int param1) {
        int[] discarded$1 = null;
        boolean stackIn_9_0 = false;
        if (param1 != -8) {
          discarded$1 = this.createDefaultVoteOptionStates(-5);
        }
        stackIn_9_0 = (5 == param0) || (6 == param0) || (param0 == 7) || (param0 == 8);
        return stackIn_9_0;
    }

    final boolean isComponentOptionAvailable(boolean param0, int param1, byte param2) {
        if (param2 != -84) {
          return true;
        }
        int var4 = this.componentoptionStates[param1];
        return this.isOptionStateAvailable(var4, param0, false);
    }

    final static ana playPannedSample(int param0, int param1, int param2, PcmSample param3) {
        RuntimeException var4 = null;
        ana stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 100) {
            field_d = (int[]) null;
          }
          stackIn_3_0 = ka.a(param1 - 193, PcmSampleStream.createPanned(param3, 100, param0, param2));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("coa.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final int[] createDefaultVoteOptionStates(int param0) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        int[] var5 = new int[31];
        int[] var2 = var5;
        int var3Lifetime1;
        for (var3 = 0; var3 < 31; var3++) {
          var5[var3] = 5;
        }
        int var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < 14) {
          var2[var6] = 4;
          var6++;
        }
        var2[4] = 5;
        var2[9] = 5;
        var2[3] = 5;
        var2[11] = 5;
        var2[12] = 5;
        var2[30] = 4;
        if (param0 <= 117) {
          this.componentoptionStates = (int[]) null;
        }
        var2[29] = 4;
        var2[1] = 5;
        return var2;
    }

    private final void ensureOptionStateArrays(boolean param0) {
        if (!param0) {
          field_d = (int[]) null;
        }
        this.ensureOptionStateArrays(13546);
    }

    public final void readState(IsaacPacketBuffer param0, boolean param1) {
        try {
          this.voteoptionStates = SetVariableActionFactory.a((byte) 37, this.voteoptionStates, param0, 8);
          this.componentoptionStates = SetVariableActionFactory.a((byte) 37, this.componentoptionStates, param0, 8);
          this.copyToClipboardHidden = kv.readBoolean(param1, param0);
          this.ensureOptionStateArrays(true);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "coa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean isVoteOptionMembersOnly(byte param0, int param1) {
        if (param0 > -116) {
          this.isComponentOptionVisible(-38, (byte) 32);
        }
        int var3 = this.voteoptionStates[param1];
        return this.isMembersOptionState(var3, -8);
    }

    final boolean isVoteOptionAvailable(int param0, int param1, boolean param2) {
        int var4 = this.voteoptionStates[param0];
        if (param1 != 11) {
          this.componentoptionStates = (int[]) null;
        }
        if (!this.isVoteOptionAllowedInCurrentMode(param0, false)) {
          return false;
        }
        return this.isOptionStateAvailable(var4, param2, false);
    }

    public final void writeState(IsaacPacketBuffer param0, int param1) {
        int stackIn_2_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          stackIn_2_0 = 8;
          if (null == this.voteoptionStates) {
            stackIn_3_1 = 0;
          } else {
            stackIn_3_1 = this.voteoptionStates.length;
          }
          pgb.a(stackIn_2_0, stackIn_3_1, 44, param0, this.voteoptionStates);
          stackIn_5_0 = 8;
          if (this.componentoptionStates != null) {
            stackIn_6_1 = this.componentoptionStates.length;
          } else {
            stackIn_6_1 = 0;
          }
          pgb.a(stackIn_5_0, stackIn_6_1, 60, param0, this.componentoptionStates);
          vq.writeBoolean(param0, -110, this.copyToClipboardHidden);
          if (param1 >= -109) {
            this.field_e = (lc) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("coa.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean isComponentOptionMembersOnly(int param0, byte param1) {
        if (param1 != 24) {
          this.resetOptionStates((byte) 119);
        }
        int var3 = this.componentoptionStates[param0];
        return this.isMembersOptionState(var3, param1 ^ -32);
    }

    private final int[] createDefaultComponentOptionStates(int param0) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        int[] var5 = new int[56];
        int[] var2 = var5;
        int var3Lifetime1;
        for (var3 = param0; var3 < var5.length; var3++) {
          var5[var3] = 0;
        }
        int var6 = 8;
        var3Lifetime1 = var6;
        while (var6 < 12) {
          var2[var6] = 5;
          var6++;
        }
        return var2;
    }

    final static boolean isLeapYear(byte param0, int param1) {
        if (param0 != -117) {
          return true;
        }
        if (0 > param1) {
          return (1 + param1) % 4 == 0 ? true : false;
        }
        if (param1 < 1582) {
          return param1 % 4 == 0 ? true : false;
        }
        if (param1 % 4 != 0) {
          return false;
        }
        if (param1 % 100 != 0) {
          return true;
        }
        if (0 == param1 % 400) {
          return true;
        }
        return false;
    }

    final static SoftwareMonochromeBitmapFont createFontFromDecodedSprites(byte[] param0, int param1) {
        SoftwareMonochromeBitmapFont var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        SoftwareMonochromeBitmapFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          var2 = new SoftwareMonochromeBitmapFont(param0, iib.field_e, SettingsChange.field_f, SetMissionTerrainDebrisProbability.field_o, hla.field_a, sh.field_a);
          if (param1 != 11) {
            var3 = (byte[]) null;
            ServerInfo.createFontFromDecodedSprites((byte[]) null, -100);
          }
          MatchResults.a(69);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("coa.T(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean isNewOptionState(boolean param0, int param1) {
        boolean stackIn_7_0 = false;
        if (!param0) {
          return true;
        }
        stackIn_7_0 = (param1 == 1) || (6 == param1);
        return stackIn_7_0;
    }

    final boolean isComponentOptionVisible(int param0, byte param1) {
        if (param1 != 34) {
          field_d = (int[]) null;
        }
        int var3 = this.componentoptionStates[param0];
        return var3 != 4 ? true : false;
    }

    public final boolean differsFrom(byte param0, SerializableGameState param1) {
        ServerInfo var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var4 = 55 / ((param0 - 22) / 59);
          var3 = (ServerInfo) (param1);
          if (!SetBlueprintSaveTime.a(var3.voteoptionStates, this.voteoptionStates, (byte) 28) &&
            !SetBlueprintSaveTime.a(var3.componentoptionStates, this.componentoptionStates, (byte) 28)) {
            stackIn_5_0 = (this.copyToClipboardHidden) ? 0 : 1;
            if (stackIn_5_0 != (var3.copyToClipboardHidden ? 1 : 0)) {
              stackIn_8_0 = false;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_8_0 = true;
          }
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("coa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_d = new int[256];
        for (var1 = 0; 256 > var1; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if ((1 & var0) != 1) {
              var0 = var0 >>> 1;
            } else {
              var0 = var0 >>> 1 ^ -306674912;
            }
          }
          field_d[var1] = var0;
        }
        field_f = 64;
    }
}
