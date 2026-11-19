/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextLayoutLine {
    int[] characterPositions;
    int top;
    static String field_d;
    int bottom;
    static int field_c;

    final static void readHighscoreResponse(byte param0) {
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
        long var4 = 0L;
        HighscoreRequest var4_ref_nj = null;
        int var5 = 0;
        ScoreSubmission var6 = null;
        int var6_int = 0;
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
        IsaacPacketBuffer var27 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = wizardrun.field_H;
        try {
          if (param0 < 48) {
            field_d = (String) null;
          }
          var27 = AccountCreationForm.field_N;
          var2 = var27.readUnsignedByte(255);
          if (0 == var2) {
            var3 = var27.readUnsignedShort(-14477);
            var4_ref_nj = (HighscoreRequest) (Js5Index.field_l.first((byte) 116));
            while (var4_ref_nj != null) {
              if (var4_ref_nj.field_l != var3) {
                var4_ref_nj = (HighscoreRequest) (Js5Index.field_l.next(8192));
                continue;
              }
              break;
            }
            if (var4_ref_nj == null) {
              HuffmanDecoder.closeAccountConnection(-101);
              return;
            }
            var5 = var27.readUnsignedByte(255);
            if (var5 != 0) {
              var6_int = var4_ref_nj.field_j;
              HighscorePlayerState.players[0].displayName = MonotonicClockHelpers.field_a;
              var7 = var4_ref_nj.field_o;
              HighscorePlayerState.players[0].included = false;
              HighscorePlayerState.players[0].alternateName = null;
              for (var8_int = 1; var5 > var8_int; var8_int++) {
                HighscorePlayerState.players[var8_int].displayName = var27.readCp1252String(0);
                HighscorePlayerState.players[var8_int].included = false;
                if (var27.readUnsignedByte(255) != 1) {
                  HighscorePlayerState.players[var8_int].alternateName = null;
                } else {
                  HighscorePlayerState.players[var8_int].alternateName = var27.readCp1252String(0);
                }
              }
              dupTemp$0 = new String[3][var6_int];
              var4_ref_nj.field_n = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6_int];
              dupTemp$1 = new long[3][var6_int];
              var4_ref_nj.field_q = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var6_int * var7];
              var4_ref_nj.field_i = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var27.readUnsignedByte(255);
              if (var18 > 0) {
                for (var19 = 0; var18 > var19; var19++) {
                  var20 = var27.readUnsignedByte(255);
                  var21 = HighscorePlayerState.players[var20].displayName;
                  var22 = var27.readLong((byte) 0);
                  var24 = var27.position;
                  if (var19 < var6_int) {
                    var8[0][var12] = var21;
                    var9[0][var12] = HighscorePlayerState.players[var20].alternateName;
                    var10[0][var12] = var22;
                    var12++;
                    for (var25 = 0; var7 > var25; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var27.readInt(255);
                    }
                  }
                  if (var21 != null &&
                    NineSliceFrame.isCurrentPlayerName(var21, 107)) {
                    var8[1][var13] = MonotonicClockHelpers.field_a;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var13++;
                    var27.position = var24;
                    for (var25Lifetime1 = 0; var7 > var25Lifetime1; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var27.readInt(255);
                    }
                  }
                  if (var6_int > var14 &&
                    !HighscorePlayerState.players[var20].included) {
                    HighscorePlayerState.players[var20].included = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = HighscorePlayerState.players[var20].alternateName;
                    var10[2][var14] = var22;
                    var27.position = var24;
                    var14++;
                    for (var25Lifetime2 = 0; var7 > var25Lifetime2; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var27.readInt(255);
                    }
                  }
                }
              }
            }
            var4_ref_nj.field_m = true;
            var4_ref_nj.unlink(false);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var27.readUnsignedShort(-14477);
            var4 = var27.readLong((byte) 0);
            var6 = (ScoreSubmission) (CachedArchiveProvider.field_t.first((byte) 109));
            while (var6 != null) {
              if (var3Lifetime1 != var6.field_i) {
                var6 = (ScoreSubmission) (CachedArchiveProvider.field_t.next(8192));
                continue;
              }
              break;
            }
            if (var6 == null) {
              HuffmanDecoder.closeAccountConnection(-102);
              return;
            }
            var6.field_n = var4;
            var6.unlink(false);
            return;
          }
          ResizableDialog.reportClientError((Throwable) null, "HS1: " + LevelDecodingHelpers.describeAccountPacket(6), -562);
          HuffmanDecoder.closeAccountConnection(-48);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var1), "fg.E(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        if (param0 != 0) {
          TextLayoutLine.readHighscoreResponse((byte) -91);
        }
    }

    final int width(int param0) {
        int stackIn_6_0 = 0;
        if (param0 != 0) {
          this.characterPositions = (int[]) null;
        }
        if (this.characterPositions != null &&
          this.characterPositions.length != 0) {
          stackIn_6_0 = this.characterPositions[-1 + this.characterPositions.length];
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    final static boolean isAllowedNameCharacter(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = wizardrun.field_H;
        try {
          if (Character.isISOControl(param0)) {
            return false;
          }
          if (ResourceArchive.isAsciiAlphanumeric(param0, true)) {
            return true;
          }
          var6 = IntHashTable.field_c;
          var2 = var6;
          var3 = param1;
          while (var6.length > var3) {
            var4 = var6[var3];
            if (~var4 != ~param0) {
              var3++;
              continue;
            }
            return true;
          }
          var2Lifetime1 = IntrusiveDequeCursor.field_e;
          for (var3Lifetime1 = 0; var3Lifetime1 < var2Lifetime1.length; var3Lifetime1++) {
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (param0 == var4Lifetime1) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var2_ref), "fg.D(" + param0 + ',' + param1 + ')');
        }
    }

    TextLayoutLine(int param0, int param1, int param2) {
        this.characterPositions = new int[param2 + 1];
        this.top = param0;
        this.bottom = param1;
    }

    final int getCharacterIndexAtX(int param0, int param1) {
        int var3 = 0;
        int var4;
        var4 = wizardrun.field_H;
        if (null == this.characterPositions) {
          return 0;
        }
        if (0 == this.characterPositions.length) {
          return 0;
        }
        if (param0 != -1) {
          TextLayoutLine.readHighscoreResponse((byte) -28);
        }
        for (var3 = 1; var3 < this.characterPositions.length; var3++) {
          if (param1 < (this.characterPositions[var3 - 1] + this.characterPositions[var3] >> 1)) {
            return var3 - 1;
          }
        }
        return -1 + this.characterPositions.length;
    }

    static {
        field_d = "Error connecting to server. Please try using a different server.";
    }
}
