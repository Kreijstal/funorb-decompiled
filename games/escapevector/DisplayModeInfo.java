/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayModeInfo {
    static String[] field_e;
    int bitDepth;
    int refreshRate;
    static LoginCredentialType field_a;
    int width;
    int height;
    static String field_b;

    public static void releaseStatics(int guard) {
        field_b = null;
        field_a = null;
        if (guard <= 113) {
          field_b = (String) null;
        }
        field_e = null;
    }

    final static void a(byte param0) {
        int var3 = 0;
        int var26 = EscapeVector.obfuscationControl;
        try {
          CipherPacketBuffer var28 = QuickChatDynamicCommand.incomingPackets;
          int var2 = var28.readUnsignedByte(0);
          if (var2 == 0) {
            var3 = var28.readUnsignedShort(1952);
            HighscoreQuery var4 = (HighscoreQuery) (AchievementRecord.field_n.first(false));
            while (var4 != null) {
              if (~var4.boardId != ~var3) {
                var4 = (HighscoreQuery) (AchievementRecord.field_n.next((byte) 70));
                continue;
              }
              break;
            }
            if (var4 == null) {
              ConnectionSupport.closeTransport(16);
              return;
            }
            int var5 = var28.readUnsignedByte(0);
            if (var5 != 0) {
              int var6 = var4.field_h;
              int var7 = var4.field_j;
              CampaignLoadingSupport.field_a[0].playerName = ThreeSliceButtonPainter.field_r;
              CampaignLoadingSupport.field_a[0].selectedForBest = false;
              CampaignLoadingSupport.field_a[0].label = null;
              for (int var8_int = 1; var5 > var8_int; var8_int++) {
                CampaignLoadingSupport.field_a[var8_int].playerName = var28.readString(false);
                CampaignLoadingSupport.field_a[var8_int].selectedForBest = false;
                if (var28.readUnsignedByte(0) != 1) {
                  CampaignLoadingSupport.field_a[var8_int].label = null;
                } else {
                  CampaignLoadingSupport.field_a[var8_int].label = var28.readString(false);
                }
              }
              String[][] dupTemp$0 = new String[3][var6];
              var4.stringColumns = dupTemp$0;
              String[][] var8 = dupTemp$0;
              String[][] var9 = new String[3][var6];
              long[][] dupTemp$1 = new long[3][var6];
              var4.longColumns = dupTemp$1;
              long[][] var10 = dupTemp$1;
              int[][] dupTemp$2 = new int[3][var7 * var6];
              var4.intColumns = dupTemp$2;
              int[][] var11 = dupTemp$2;
              int var12 = 0;
              int var13 = 0;
              int var14 = 0;
              int var15 = 0;
              int var16 = 0;
              int var17 = 0;
              int var18 = var28.readUnsignedByte(0);
              if (var18 > 0) {
                for (int var19 = 0; var18 > var19; var19++) {
                  int var20 = var28.readUnsignedByte(0);
                  String var21 = CampaignLoadingSupport.field_a[var20].playerName;
                  long var22 = var28.readLong(-800509813);
                  int var24 = var28.position;
                  if (var6 > var19) {
                    var8[0][var12] = var21;
                    var9[0][var12] = CampaignLoadingSupport.field_a[var20].label;
                    var10[0][var12] = var22;
                    for (int var25 = 0; var7 > var25; var25++) {
                      int incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var28.readInt(-5053);
                    }
                    var12++;
                  }
                  if (var21 != null &&
                    SeekerMine.a(var21, (byte) 112)) {
                    var8[1][var13] = ThreeSliceButtonPainter.field_r;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var28.position = var24;
                    var13++;
                    for (int var25Lifetime1 = 0; var25Lifetime1 < var7; var25Lifetime1++) {
                      int incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var28.readInt(-5053);
                    }
                  }
                  if (var14 < var6 &&
                    !CampaignLoadingSupport.field_a[var20].selectedForBest) {
                    CampaignLoadingSupport.field_a[var20].selectedForBest = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = CampaignLoadingSupport.field_a[var20].label;
                    var10[2][var14] = var22;
                    var28.position = var24;
                    var14++;
                    for (int var25Lifetime2 = 0; var25Lifetime2 < var7; var25Lifetime2++) {
                      int incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var28.readInt(-5053);
                    }
                  }
                }
              }
            }
            var4.complete = true;
            var4.unlink((byte) -90);
          } else if (var2 == 1) {
            var3 = var28.readUnsignedShort(1952);
            long var4_long = var28.readLong(-800509813);
            ScoreSubmission var6_ref_ik = (ScoreSubmission) (LoginCredentials.field_d.first(false));
            while (var6_ref_ik != null) {
              if (var6_ref_ik.requestId != var3) {
                var6_ref_ik = (ScoreSubmission) (LoginCredentials.field_d.next((byte) 70));
                continue;
              }
              break;
            }
            if (var6_ref_ik == null) {
              ConnectionSupport.closeTransport(16);
              return;
            }
            var6_ref_ik.field_l = var4_long;
            var6_ref_ik.unlink((byte) -85);
          } else {
            GameModeSelectScreen.reportClientError(false, "HS1: " + LoginStage.formatPacketDiagnostic((byte) 115), (Throwable) null);
            ConnectionSupport.closeTransport(16);
          }
          int var3Lifetime1 = -111 / ((-41 - param0) / 43);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var1), "ja.C(" + param0 + ')');
        }
    }

    final static EmailAvailabilityRequest a(String param0, boolean param1) {
        String stackIn_12_2 = null;
        try {
          if (HighscorePlayerRecord.field_g.isComplete(0) &&
            !param0.equals(HighscorePlayerRecord.field_g.email(-100))) {
            HighscorePlayerRecord.field_g = RasterBuffer.a((byte) 83, param0);
          }
          if (param1) {
            EmailAvailabilityRequest stackIn_8_0 = HighscorePlayerRecord.field_g;
            return stackIn_8_0;
          }
          EmailAvailabilityRequest stackIn_6_0 = (EmailAvailabilityRequest) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var2;
          StringBuilder stackIn_11_1 = new StringBuilder().append("ja.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static long bitwiseOr(long left, long right) {
        return left ^ right;
    }

    static {
        field_e = new String[]{"original", "classic", "retribution", "simulator"};
        field_b = "Previous";
        field_a = new LoginCredentialType(2);
    }
}
