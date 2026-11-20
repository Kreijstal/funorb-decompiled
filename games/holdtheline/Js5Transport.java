/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class Js5Transport {
    SecondaryNodeDeque field_d;
    static Sprite field_o;
    static String field_a;
    SecondaryNodeDeque field_i;
    static ResourceArchive field_n;
    SecondaryNodeDeque field_g;
    SecondaryNodeDeque field_e;
    PacketBuffer field_b;
    int field_h;
    long field_j;
    byte field_l;
    PacketBuffer field_k;
    volatile int field_c;
    volatile int field_f;
    NetworkArchiveRequest field_m;

    final static void readLeaderboardReply(byte param0) {
        int var9_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var20 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        LeaderboardRequest var5 = null;
        long var5_long = 0L;
        int var6 = 0;
        int var7 = 0;
        ScoreSubmission var7_ref_fb = null;
        int var8 = 0;
        String[][] var9 = null;
        String[][] var10 = null;
        long[][] var11 = null;
        int[][] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var21 = 0;
        String var22 = null;
        long var23 = 0L;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        IsaacPacketBuffer var28 = null;
        int var4Lifetime1;
        int var26Lifetime1;
        int var26Lifetime2;
        var27 = HoldTheLine.field_D;
        try {
          var3 = -93 % ((param0 - 21) / 43);
          var28 = RoadStripRenderer.field_e;
          var2 = var28.readUnsignedByte((byte) -22);
          if (var2 == 0) {
            var4 = var28.readUnsignedShort(106);
            var5 = (LeaderboardRequest) (MenuList.field_e.first((byte) 115));
            while (var5 != null) {
              if (var5.leaderboardId != var4) {
                var5 = (LeaderboardRequest) (MenuList.field_e.next((byte) -25));
                continue;
              }
              break;
            }
            if (var5 == null) {
              ServerConnectionState.closeServerConnection(-28036);
              return;
            }
            var6 = var28.readUnsignedByte((byte) -98);
            if (0 != var6) {
              var7 = var5.rowLimit;
              TextFieldValidator.field_h[0].displayName = QuickChatPhraseCache.field_e;
              TextFieldValidator.field_h[0].alternateName = null;
              var8 = var5.valuesPerRow;
              TextFieldValidator.field_h[0].includedInUniqueView = false;
              for (var9_int = 1; var6 > var9_int; var9_int++) {
                TextFieldValidator.field_h[var9_int].displayName = var28.readCp1252String(-1231);
                TextFieldValidator.field_h[var9_int].includedInUniqueView = false;
                if (var28.readUnsignedByte((byte) -41) != 1) {
                  TextFieldValidator.field_h[var9_int].alternateName = null;
                } else {
                  TextFieldValidator.field_h[var9_int].alternateName = var28.readCp1252String(-1231);
                }
              }
              dupTemp$0 = new String[3][var7];
              var5.playerNames = dupTemp$0;
              var9 = dupTemp$0;
              var10 = new String[3][var7];
              dupTemp$1 = new long[3][var7];
              var5.entryIds = dupTemp$1;
              var11 = dupTemp$1;
              dupTemp$2 = new int[3][var7 * var8];
              var5.rowValues = dupTemp$2;
              var12 = dupTemp$2;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = 0;
              var19 = var28.readUnsignedByte((byte) -59);
              if (var19 > 0) {
                for (var20 = 0; var20 < var19; var20++) {
                  var21 = var28.readUnsignedByte((byte) -22);
                  var22 = TextFieldValidator.field_h[var21].displayName;
                  var23 = var28.readLong(true);
                  var25 = var28.position;
                  if (var20 < var7) {
                    var9[0][var13] = var22;
                    var10[0][var13] = TextFieldValidator.field_h[var21].alternateName;
                    var11[0][var13] = var23;
                    for (var26 = 0; var26 < var8; var26++) {
                      incrementValue$3 = var16;
                      var16++;
                      var12[0][incrementValue$3] = var28.readInt(-107);
                    }
                    var13++;
                  }
                  if (var22 != null &&
                    LoadProgressDialog.isLocalPlayerName(var22, false)) {
                    var9[1][var14] = QuickChatPhraseCache.field_e;
                    var10[1][var14] = null;
                    var11[1][var14] = var23;
                    var28.position = var25;
                    var14++;
                    for (var26Lifetime1 = 0; var8 > var26Lifetime1; var26Lifetime1++) {
                      incrementValue$4 = var17;
                      var17++;
                      var12[1][incrementValue$4] = var28.readInt(98);
                    }
                  }
                  if (var7 > var15 &&
                    !TextFieldValidator.field_h[var21].includedInUniqueView) {
                    TextFieldValidator.field_h[var21].includedInUniqueView = true;
                    var9[2][var15] = var22;
                    var10[2][var15] = TextFieldValidator.field_h[var21].alternateName;
                    var11[2][var15] = var23;
                    var28.position = var25;
                    var15++;
                    for (var26Lifetime2 = 0; var26Lifetime2 < var8; var26Lifetime2++) {
                      incrementValue$5 = var18;
                      var18++;
                      var12[2][incrementValue$5] = var28.readInt(111);
                    }
                  }
                }
              }
            }
            var5.completed = true;
            var5.unlink(0);
            return;
          }
          if (var2 == 1) {
            var4Lifetime1 = var28.readUnsignedShort(78);
            var5_long = var28.readLong(true);
            var7_ref_fb = (ScoreSubmission) (AccountTermsPanel.field_O.first((byte) 110));
            while (var7_ref_fb != null) {
              if (var7_ref_fb.requestId != var4Lifetime1) {
                var7_ref_fb = (ScoreSubmission) (AccountTermsPanel.field_O.next((byte) -64));
                continue;
              }
              break;
            }
            if (var7_ref_fb == null) {
              ServerConnectionState.closeServerConnection(-28036);
              return;
            }
            var7_ref_fb.entryId = var5_long;
            var7_ref_fb.unlink(0);
            return;
          }
          MusicPatchPcmStream.reportClientError((Throwable) null, (byte) -120, "HS1: " + AgeValidator.describeServerPacket(false));
          ServerConnectionState.closeServerConnection(-28036);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var1), "wj.N(" + param0 + ')');
        }
    }

    abstract void attachConnection(Object param0, boolean param1, int param2);

    final boolean isPriorityQueueFull(int param0) {
        if (param0 < 73) {
          this.isPriorityQueueFull(3);
        }
        return this.getPriorityRequestCount(39) >= 20 ? true : false;
    }

    final int getPrefetchRequestCount(boolean param0) {
        if (param0) {
          this.field_h = 95;
        }
        return this.field_g.size(107) + this.field_e.size(-6);
    }

    final int getPriorityRequestCount(int param0) {
        if (param0 < 16) {
          field_n = (ResourceArchive) null;
        }
        return this.field_d.size(64) + this.field_i.size(29);
    }

    abstract void handleCorruptResponse(boolean param0);

    final NetworkArchiveRequest request(int param0, boolean param1, byte param2, byte param3, int param4) {
        long var6 = ((long)param4 << 32) + (long)param0;
        NetworkArchiveRequest var8 = new NetworkArchiveRequest();
        var8.secondaryKey = var6;
        var8.field_t = param1 ? true : false;
        var8.field_B = param2;
        if (param3 != -60) {
          return (NetworkArchiveRequest) null;
        }
        if (param1) {
          if (!(this.getPriorityRequestCount(78) < 20)) {
            throw new RuntimeException();
          }
          this.field_d.addLast(param3 ^ 83, var8);
        } else {
          if (this.getPrefetchRequestCount(false) >= 20) {
            throw new RuntimeException();
          }
          this.field_g.addLast(122, var8);
        }
        return var8;
    }

    final static void configureBenefitsLayout(int param0, int param1, int param2, int param3, int param4, int param5, int param6, Sprite param7, int param8) {
        try {
          EmailDomainValidator.field_b = param3;
          IsaacRandom.field_a = param7;
          JagexLogoRenderer.field_d = param2;
          EmailLoginCredentials.field_e = param5;
          if (param1 != 19189) {
            Js5Transport.clearSharedReferences(37);
          }
          ValidationHelpWidget.field_W = param6;
          RasterDesaturation.field_a = param8;
          AccountTermsPanel.field_G = param0;
          AchievementUnlockRequest.field_m = param4;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "wj.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    abstract void close(int param0);

    final boolean isPrefetchQueueFull(int param0) {
        if (param0 != 20) {
          return false;
        }
        return this.getPrefetchRequestCount(false) >= 20 ? true : false;
    }

    abstract boolean processRequests(byte param0);

    public static void clearSharedReferences(int param0) {
        field_o = null;
        field_n = null;
        if (param0 != 16831) {
          return;
        }
        field_a = null;
    }

    Js5Transport() {
        this.field_d = new SecondaryNodeDeque();
        this.field_i = new SecondaryNodeDeque();
        this.field_g = new SecondaryNodeDeque();
        this.field_e = new SecondaryNodeDeque();
        this.field_b = new PacketBuffer(6);
        this.field_l = (byte) 0;
        this.field_c = 0;
        this.field_f = 0;
        this.field_k = new PacketBuffer(10);
    }

    static {
        field_o = new Sprite(270, 70);
    }
}
