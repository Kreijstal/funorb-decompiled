/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CipherPacketBuffer extends PacketBuffer {
    static UiComponent field_r;
    static String field_t;
    static PcmPlayerService field_u;
    static String field_w;
    static int[] field_s;
    private IsaacRandom field_p;
    static String field_q;
    static int[] field_v;
    private int field_o;

    final void installCipher(byte param0, int[] param1) {
        try {
          int var3_int = -83 / ((26 - param0) / 43);
          this.field_p = new IsaacRandom(param1);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ga.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void endBitAccess(int param0) {
        if (param0 != -3093) {
          field_u = (PcmPlayerService) null;
        }
        this.position = (7 + this.field_o) / 8;
    }

    final static void readRankingsResponse(byte param0) {
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
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 < 31) {
            CipherPacketBuffer.releaseStatics(81);
          }
          var13 = StatusAndMeshHelpers.field_e;
          var15 = var13;
          var2 = var15.readUnsignedByte(31365);
          var3 = (RankingsRequest) (GameApplet.field_i.last(116));
          while (var3 != null) {
            if (var2 != var3.field_i) {
              var3 = (RankingsRequest) (GameApplet.field_i.previous(6));
              continue;
            }
            break;
          }
          if (var3 == null) {
            ClientShellHelpers.closeGameSocket((byte) -123);
            return;
          }
          var4 = var15.readUnsignedByte(31365);
          if (var4 != 0) {
            CacheEntry.field_v[0] = ProgressDialog.field_lb;
            var5 = var3.field_p;
            for (var6_int = 1; var4 > var6_int; var6_int++) {
              CacheEntry.field_v[var6_int] = var13.readString((byte) -116);
            }
            StatusAndMeshHelpers.ensureRankingArrays(var4, (byte) 111, var5);
            for (var6_intLifetime1 = 0; var6_intLifetime1 < var4; var6_intLifetime1++) {
              ContextMenu.decodePackedRankedEntry(4050, var15);
              if (var6_intLifetime1 != 0) {
                PacketBuffer.addRankingRow(1000, QuickChatCommandType.field_c, MenuFrameHelpers.field_e, ArchiveRequest.field_q, var6_intLifetime1, PowerGaugeHelpers.field_a);
              } else {
                var3.field_m = MenuFrameHelpers.field_e;
                var3.field_g = PowerGaugeHelpers.field_a;
                var3.field_o = QuickChatCommandType.field_c;
                var3.field_l = ArchiveRequest.field_q;
                PacketBuffer.addRankingRow(1000, QuickChatCommandType.field_c, MenuFrameHelpers.field_e, ArchiveRequest.field_q, var6_intLifetime1, PowerGaugeHelpers.field_a);
              }
            }
            TriangleMesh.sortRankingRows(var5, -109);
            dupTemp$0 = new String[2][var5];
            var3.field_t = dupTemp$0;
            var6 = dupTemp$0;
            dupTemp$1 = new int[2][4 * var5];
            var3.field_k = dupTemp$1;
            var7 = dupTemp$1;
            var8 = ClickMarker.field_n;
            var9 = 0;
            var10 = 0;
            while (var9 < var8) {
              var11 = GrowableIntList.field_c[var9];
              var6[0][var10] = CacheEntry.field_v[var11];
              var7[0][var10 * 4] = PasswordCheckHelpers.field_c[var11];
              var7[0][1 + 4 * var10] = DialogLayer.field_J[var11];
              var7[0][2 + var10 * 4] = FriendListHelpers.field_p[var11];
              var7[0][3 + 4 * var10] = ContentTransitionDialog.field_ob[var11];
              if (SocialRequestHelpers.isCurrentUser(1, CacheEntry.field_v[var11]) &&
                DialogLayer.field_J[var11] + FriendListHelpers.field_p[var11] + ContentTransitionDialog.field_ob[var11] == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var9++;
              var10++;
            }
            var9Lifetime1 = 0;
            var14 = 0;
            var10Lifetime1 = var14;
            while (var9Lifetime1 < var8) {
              var11Lifetime1 = GrowableIntList.field_c[var9Lifetime1 + var5];
              var6[1][var14] = CacheEntry.field_v[var11Lifetime1];
              var7[1][var14 * 4] = PasswordCheckHelpers.field_c[var11Lifetime1];
              var7[1][4 * var14 + 1] = DialogLayer.field_J[var11Lifetime1];
              var7[1][2 + 4 * var14] = FriendListHelpers.field_p[var11Lifetime1];
              var7[1][3 + var14 * 4] = ContentTransitionDialog.field_ob[var11Lifetime1];
              if (SocialRequestHelpers.isCurrentUser(1, CacheEntry.field_v[var11Lifetime1]) &&
                0 == DialogLayer.field_J[var11Lifetime1] + FriendListHelpers.field_p[var11Lifetime1] + ContentTransitionDialog.field_ob[var11Lifetime1]) {
                var6[1][var14] = null;
                var14--;
              }
              var9Lifetime1++;
              var14++;
            }
          }
          var3.field_j = true;
          var3.unlink(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "ga.G(" + param0 + ')');
        }
    }

    final void writeCipheredOpcode(byte param0, int param1) {
        if (param0 != -35) {
          return;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 + this.field_p.nextInt(-48));
    }

    final void readCipheredBytes(int param0, int param1, int param2, byte[] param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          for (var5_int = param1; param0 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param3[var5_int + param2] = (byte)(this.payload[fieldTemp$0] - this.field_p.nextInt(-90));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ga.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static FlaggedTextValue startEmailValidation(String param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_5_0 = null;
        boolean stackIn_6_1 = false;
        FlaggedTextValue stackIn_9_0 = null;
        FlaggedTextValue stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (AudioPumpThread.field_g.hasChanged(-99) &&
            !param0.equals(AudioPumpThread.field_g.getText(31027))) {
            stackIn_5_0 = (String) (param0);
            stackIn_6_1 = !(param1);
            AudioPumpThread.field_g = AudioPumpThread.createFlaggedTextValue(stackIn_5_0, stackIn_6_1);
          }
          if (!param1) {
            stackIn_11_0 = AudioPumpThread.field_g;
            return stackIn_11_0;
          }
          stackIn_9_0 = (FlaggedTextValue) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ga.K(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final int readBits(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 != 14862) {
          return -77;
        }
        int var3 = this.field_o >> 3;
        int var4 = 8 - (7 & this.field_o);
        int var5 = 0;
        this.field_o = this.field_o + param0;
        while (var4 < param0) {
          incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((MusicVoice.field_n[var4] & this.payload[incrementValue$0]) << param0 - var4);
          param0 = param0 - var4;
          var4 = 8;
        }
        if (param0 != var4) {
          var5 = var5 + (this.payload[var3] >> var4 - param0 & MusicVoice.field_n[param0]);
        } else {
          var5 = var5 + (MusicVoice.field_n[var4] & this.payload[var3]);
        }
        return var5;
    }

    final static int getChatFilterMode(int param0, boolean param1) {
        int var2 = 0;
        if (param0 == 0) {
          var2 = DiskArchiveRequest.field_C;
        }
        if (param0 == 1) {
          var2 = GameHud.field_g;
        }
        if (!param1) {
          field_r = (UiComponent) null;
        }
        if (param0 == 2) {
          var2 = MusicPatchPcmStream.field_q;
        }
        return var2;
    }

    final int readCipheredOpcode(int param0) {
        int var2 = 114 % ((param0 + 34) / 50);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0] - this.field_p.nextInt(-25) & 255;
    }

    final void startBitAccess(int param0) {
        this.field_o = this.position * 8;
        if (param0 != -1136) {
          field_u = (PcmPlayerService) null;
        }
    }

    public static void releaseStatics(int param0) {
        field_t = null;
        field_u = null;
        field_s = null;
        field_q = null;
        field_r = null;
        field_w = null;
        field_v = null;
        if (param0 > -34) {
          CipherPacketBuffer.getChatFilterMode(-13, true);
        }
    }

    CipherPacketBuffer(byte[] param0) {
        super(param0);
    }

    CipherPacketBuffer(int param0) {
        super(param0);
    }

    static {
        field_t = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_q = "You have entered another game.";
        field_w = "Error connecting to server. Please try using a different server.";
        field_s = new int[]{42, 43, 38};
        field_v = new int[]{98, 214, 334, 455, 577};
    }
}
