/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HighscorePacketHandlers {
    static String field_c;
    static PlatformTaskDispatcher field_e;
    static boolean field_a;
    static int field_b;
    static int field_g;
    static String field_d;
    static int field_f;

    final static void readListAcknowledgement(int param0) {
        ListRequest var1 = (ListRequest) (LoginDialog.field_nb.first(1504642273));
        if (var1 == null) {
          GameSocketHelpers.closeGameSocket(true);
          return;
        }
        CipherPacketBuffer var2 = MusicCrossfadeStream.field_o;
        var2.readInt(0);
        var2.readInt(0);
        var2.readInt(0);
        var2.readInt(0);
        var1.unlink(2779);
        if (param0 != -14439) {
          HighscorePacketHandlers.readHighscorePacket(false);
        }
    }

    final static void readHighscorePacket(boolean param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var19 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        RankingTableRequest var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        HighscoreSubmission var6_ref_rh = null;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        CipherPacketBuffer var28 = null;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = Pixelate.field_H ? 1 : 0;
        try {
          var28 = MusicCrossfadeStream.field_o;
          var2 = var28.readUnsignedByte(255);
          if (var2 == 0) {
            var3 = var28.readUnsignedShort((byte) 86);
            var4 = (RankingTableRequest) (DialWidgetPainter.field_c.first(1504642273));
            while (var4 != null) {
              if (var4.field_o != var3) {
                var4 = (RankingTableRequest) (DialWidgetPainter.field_c.next(1504642273));
                continue;
              }
              break;
            }
            if (var4 == null) {
              GameSocketHelpers.closeGameSocket(true);
              return;
            }
            var5 = var28.readUnsignedByte(255);
            if (0 != var5) {
              var6 = var4.field_m;
              HighscoreSubmission.field_u[0].field_e = ModalStack.field_J;
              HighscoreSubmission.field_u[0].field_f = null;
              var7 = var4.field_s;
              HighscoreSubmission.field_u[0].field_c = false;
              for (var8_int = 1; var5 > var8_int; var8_int++) {
                HighscoreSubmission.field_u[var8_int].field_e = var28.readString(5);
                HighscoreSubmission.field_u[var8_int].field_c = false;
                if (1 == var28.readUnsignedByte(255)) {
                  HighscoreSubmission.field_u[var8_int].field_f = var28.readString(5);
                } else {
                  HighscoreSubmission.field_u[var8_int].field_f = null;
                }
              }
              dupTemp$0 = new String[3][var6];
              var4.field_r = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6];
              dupTemp$1 = new long[3][var6];
              var4.field_k = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var6 * var7];
              var4.field_l = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var28.readUnsignedByte(255);
              if (var18 > 0) {
                for (var19 = 0; var19 < var18; var19++) {
                  var20 = var28.readUnsignedByte(255);
                  var21 = HighscoreSubmission.field_u[var20].field_e;
                  var22 = var28.readLong(false);
                  var24 = var28.position;
                  if (var6 > var19) {
                    var8[0][var12] = var21;
                    var9[0][var12] = HighscoreSubmission.field_u[var20].field_f;
                    var10[0][var12] = var22;
                    var12++;
                    for (var25 = 0; var7 > var25; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var28.readInt(0);
                    }
                  }
                  if (var21 != null &&
                    QueuedLobbyRequest.isLocalPlayerName(var21, -1)) {
                    var8[1][var13] = ModalStack.field_J;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var28.position = var24;
                    var13++;
                    for (var25Lifetime1 = 0; var7 > var25Lifetime1; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var28.readInt(0);
                    }
                  }
                  if (var6 > var14 &&
                    !HighscoreSubmission.field_u[var20].field_c) {
                    HighscoreSubmission.field_u[var20].field_c = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = HighscoreSubmission.field_u[var20].field_f;
                    var10[2][var14] = var22;
                    var28.position = var24;
                    var14++;
                    for (var25Lifetime2 = 0; var7 > var25Lifetime2; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var28.readInt(0);
                    }
                  }
                }
              }
            }
            var4.field_n = true;
            var4.unlink(2779);
          } else if (var2 == 1) {
            var3 = var28.readUnsignedShort((byte) -125);
            var4_long = var28.readLong(false);
            var6_ref_rh = (HighscoreSubmission) (MenuScreen.field_b.first(1504642273));
            while (var6_ref_rh != null) {
              if (var3 != var6_ref_rh.field_o) {
                var6_ref_rh = (HighscoreSubmission) (MenuScreen.field_b.next(1504642273));
                continue;
              }
              break;
            }
            if (var6_ref_rh == null) {
              GameSocketHelpers.closeGameSocket(!param0);
              return;
            }
            var6_ref_rh.field_q = var4_long;
            var6_ref_rh.unlink(2779);
          } else {
            CheckboxPainter.reportClientError(1, "HS1: " + Cloud.describePacketHistory(-63), (Throwable) null);
            GameSocketHelpers.closeGameSocket(!param0);
          }
          if (param0) {
            HighscorePacketHandlers.releaseStatics(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var1), "ef.C(" + param0 + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_d = null;
        if (!param0) {
          return;
        }
        field_e = null;
        field_c = null;
    }

    static {
        field_b = 0;
        field_c = "GFX: Low Detail";
        field_d = "Chat is currently disabled.";
        field_f = 1;
    }
}
