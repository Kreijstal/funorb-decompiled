/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayingSound extends IntrusiveNode {
    PcmSampleStream field_g;
    IntrusiveNode field_h;
    static int[] field_j;
    static int field_k;
    int field_i;

    final static void initializeAudioOutput(java.awt.Component param0, MidiPcmStream param1, PlatformTaskDispatcher param2, boolean param3, byte param4, int param5) {
        if (param4 >= -4) {
          return;
        }
        try {
          AudioSetupHelpers.initializeAudioOutputs(param2, param1, 1024, 106, param3, param0, param5, param5);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "pe.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void drawDitheredVerticalLine(int param0, int param1, int param2, byte param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = Virogrid.field_F ? 1 : 0;
        int var9Lifetime1;
        try {
          var5_int = Rasterizer.field_e * param0 + param2;
          var6 = param4 * Rasterizer.field_e + var5_int;
          var7 = (param1 & 16711422) >> 1;
          var8 = 0;
          for (var9 = var5_int; var6 > var9; var9 = var9 + Rasterizer.field_e) {
            Rasterizer.field_d[var9] = 0 == var8 % 2 ? var7 : param1;
            var8++;
          }
          var9Lifetime1 = -57 / ((-54 - param3) / 53);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "pe.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_j = null;
        int var1 = -99 / ((-23 - param0) / 53);
    }

    final static String formatArchiveGroupProgress(String param0, String param1, Js5Archive param2, int param3, int param4) {
        RuntimeException var5 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2.ensureIndexLoaded(param4)) {
            stackIn_3_0 = (String) (param0);
            return stackIn_3_0;
          }
          stackIn_5_0 = param1 + " - " + param2.getGroupProgress((byte) 113, param3) + "%";
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("pe.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void handleRankingsResponse(int param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        RankingsRequest var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        CipherPacketBuffer var13 = null;
        int var14 = 0;
        CipherPacketBuffer var15 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = Virogrid.field_F ? 1 : 0;
        try {
          var13 = ProgressMessageDialog.field_qb;
          var15 = var13;
          var2 = var15.readUnsignedByte(11132);
          var3 = (RankingsRequest) (DiskArchiveRequest.field_D.first((byte) -67));
          while (var3 != null) {
            if (var2 != var3.field_i) {
              var3 = (RankingsRequest) (DiskArchiveRequest.field_D.next(16213));
              continue;
            }
            break;
          }
          if (var3 == null) {
            MenuInputState.closeGameConnection(false);
            return;
          }
          var4 = var15.readUnsignedByte(param0 + 11133);
          if (param0 != ~var4) {
            MusicPatch.field_h[0] = DebouncedValidator.field_d;
            var5 = var3.field_g;
            for (var6_int = 1; var6_int < var4; var6_int++) {
              MusicPatch.field_h[var6_int] = var13.readString(-121);
            }
            RankingArraySupport.ensureRankingArrays((byte) 125, var5, var4);
            for (var6_intLifetime1 = 0; var4 > var6_intLifetime1; var6_intLifetime1++) {
              CheckboxPainter.readPackedPlayerStats(true, var15);
              if (var6_intLifetime1 == 0) {
                var3.field_m = DigestHelpers.field_b;
                var3.field_u = AudioPumpThread.field_j;
                var3.field_h = EmailValidator.field_s;
                var3.field_q = ValidationMessageWidget.field_X;
                WidgetContainer.addRankingRow(ValidationMessageWidget.field_X, AudioPumpThread.field_j, ~param0, EmailValidator.field_s, var6_intLifetime1, DigestHelpers.field_b);
              } else {
                WidgetContainer.addRankingRow(ValidationMessageWidget.field_X, AudioPumpThread.field_j, ~param0, EmailValidator.field_s, var6_intLifetime1, DigestHelpers.field_b);
              }
            }
            DiskCacheWorker.sortTableRowIndices(var5, (byte) 46);
            dupTemp$0 = new String[2][var5];
            var3.field_j = dupTemp$0;
            var6 = dupTemp$0;
            dupTemp$1 = new int[2][4 * var5];
            var3.field_t = dupTemp$1;
            var7 = dupTemp$1;
            var8 = PendingRequest.field_m;
            var9 = 0;
            var10 = 0;
            while (var8 > var9) {
              var11 = LobbyPlayerEntry.field_Tb[var9];
              var6[0][var10] = MusicPatch.field_h[var11];
              var7[0][var10 * 4] = ByteStorage.field_c[var11];
              var7[0][4 * var10 + 1] = LoadingProgressDialog.field_jb[var11];
              var7[0][2 + 4 * var10] = TextButton.field_A[var11];
              var7[0][3 + 4 * var10] = DualLinkHashTable.field_j[var11];
              if (PacketBuffer.isLocalPlayerName(MusicPatch.field_h[var11], true) &&
                0 == LoadingProgressDialog.field_jb[var11] - (-TextButton.field_A[var11] - DualLinkHashTable.field_j[var11])) {
                var6[0][var10] = null;
                var10--;
              }
              var10++;
              var9++;
            }
            var9Lifetime1 = 0;
            var14 = 0;
            var10Lifetime1 = var14;
            while (var8 > var9Lifetime1) {
              var11Lifetime1 = LobbyPlayerEntry.field_Tb[var9Lifetime1 + var5];
              var6[1][var14] = MusicPatch.field_h[var11Lifetime1];
              var7[1][4 * var14] = ByteStorage.field_c[var11Lifetime1];
              var7[1][1 + 4 * var14] = LoadingProgressDialog.field_jb[var11Lifetime1];
              var7[1][4 * var14 + 2] = TextButton.field_A[var11Lifetime1];
              var7[1][var14 * 4 + 3] = DualLinkHashTable.field_j[var11Lifetime1];
              if (PacketBuffer.isLocalPlayerName(MusicPatch.field_h[var11Lifetime1], true) &&
                LoadingProgressDialog.field_jb[var11Lifetime1] - (-TextButton.field_A[var11Lifetime1] - DualLinkHashTable.field_j[var11Lifetime1]) == 0) {
                var6[1][var14] = null;
                var14--;
              }
              var9Lifetime1++;
              var14++;
            }
          }
          var3.field_s = true;
          var3.unlink(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "pe.F(" + param0 + ')');
        }
    }

    final static void releaseDecodeArrays(byte param0) {
        Bzip2State.field_k = null;
        GameEntryHelpers.field_c = null;
        MarkerSlider.field_F = null;
        CheckboxPainter.field_j = (byte[][]) null;
        if (param0 != -28) {
          field_k = 63;
        }
        ContentTransitionDialog.field_bb = null;
        BufferedSocket.field_w = null;
    }

    PlayingSound(PcmSampleStream param0, IntrusiveNode param1) {
        try {
          this.field_g = param0;
          this.field_i = param0.getTargetVolume();
          this.field_h = param1;
          this.field_g.setVolumeQ6(this.field_i * DelegatingCanvas.field_c + 128 >> 8);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = 0;
    }
}
