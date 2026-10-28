/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntegerParseSupport {
    static String field_f;
    static String field_a;
    static ResourceArchive gameTextArchive;
    static int field_d;
    static boolean[] field_b;
    static boolean field_c;

    public static void releaseStatics(boolean guard) {
        field_f = null;
        if (guard) {
          CipherPacketBuffer var2 = (CipherPacketBuffer) null;
          IntegerParseSupport.decodePackedMesh(10, (CipherPacketBuffer) null);
        }
        gameTextArchive = null;
        field_a = null;
        field_b = null;
    }

    final static void ensureRatingScratch(int playerCount, int guard, int rowCount) {
        if (guard != 55) {
          IntegerParseSupport.ensureRatingScratch(50, 41, 94);
        }
        if (null == ChatHistorySupport.field_e ||
          !(playerCount <= ChatHistorySupport.field_e.length)) {
          ChatHistorySupport.field_e = new int[playerCount * 2];
        }
        if (null == DualLinkNode.field_k ||
          !(playerCount <= DualLinkNode.field_k.length)) {
          DualLinkNode.field_k = new int[playerCount * 2];
        }
        if (ModeProgressSupport.field_c == null ||
          !(ModeProgressSupport.field_c.length >= playerCount)) {
          ModeProgressSupport.field_c = new int[2 * playerCount];
        }
        if (RasterSnapshot.field_k == null ||
          !(RasterSnapshot.field_k.length >= playerCount)) {
          RasterSnapshot.field_k = new int[2 * playerCount];
        }
        if (AccountNoticeDialog.field_fb == null ||
          !(AccountNoticeDialog.field_fb.length >= playerCount)) {
          AccountNoticeDialog.field_fb = new int[2 * playerCount];
        }
        if (null == Bzip2State.field_v ||
          !(playerCount <= Bzip2State.field_v.length)) {
          Bzip2State.field_v = new int[2 * playerCount];
        }
        if (LegacyStyleNode.field_q == null ||
          !(rowCount + playerCount <= LegacyStyleNode.field_q.length)) {
          LegacyStyleNode.field_q = new int[2 * (playerCount + rowCount)];
        }
        if (null == AccountPanelInputSupport.field_a ||
          !(playerCount <= AccountPanelInputSupport.field_a.length)) {
          AccountPanelInputSupport.field_a = new boolean[2 * playerCount];
        }
        AlternateUsernameCredentials.field_r = -2147483648;
        AccountTermsPanel.field_J = 0;
        ArchiveRequest.field_t = -2147483648;
        TextLayout.field_d = 2147483647;
        TextLayoutLine.field_e = 2147483647;
    }

    final static int parseInt(boolean allowPlus, int radix, CharSequence text, int guard) {
        String stackIn_47_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          if (radix >= 2 &&
            36 >= radix) {
            boolean var4_int = false;
            if (guard != 97) {
              int stackIn_7_0 = 11;
              return stackIn_7_0;
            }
            boolean var5 = false;
            int var6 = 0;
            int var7 = text.length();
            for (int var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              int var9 = text.charAt(var8);
              if (var8 == 0 &&
                var9 == 45) {
                var4_int = true;
                decompiledFrameRemainder0 = false;
              }
              if (decompiledFrameRemainder0 && (var8 != 0 || (var9 != 43 ||
                !allowPlus))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (65 <= var9 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (97 <= var9 &&
                  122 >= var9) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (radix <= var9) {
                  throw new NumberFormatException();
                }
                if (var4_int) {
                  var9 = -var9;
                }
                int var10 = var6 * radix + var9;
                if (var6 != var10 / radix) {
                  throw new NumberFormatException();
                }
                var6 = var10;
                var5 = true;
              }
            }
            if (!var5) {
              throw new NumberFormatException();
            }
            int stackIn_43_0 = var6;
            return stackIn_43_0;
          }
          throw new IllegalArgumentException("" + radix);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_46_0 = var4;
          StringBuilder stackIn_46_1 = new StringBuilder().append("wk.B(").append(allowPlus).append(',').append(radix).append(',');
          if (text == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(guard).append(')').toString());
        }
    }

    final static TriangleMesh decodePackedMesh(int guard, CipherPacketBuffer input) {
        String stackIn_28_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          int var2_int = input.readBits(8, 8);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          int var3 = 51 % ((-82 - guard) / 38);
          boolean var4 = (SessionMenuSupport.readBitFlag(input, (byte) -104));
          boolean var5 = (SessionMenuSupport.readBitFlag(input, (byte) -114));
          TriangleMesh var6 = new TriangleMesh();
          var6.vertexCount = (short)input.readBits(16, 8);
          var6.vertexX = BufferedRandomAccessFile.readPackedShortArray(input, 16, var6.vertexX, -1);
          var6.vertexY = BufferedRandomAccessFile.readPackedShortArray(input, 16, var6.vertexY, -1);
          var6.vertexZ = BufferedRandomAccessFile.readPackedShortArray(input, 16, var6.vertexZ, -1);
          var6.faceCount = (short)input.readBits(16, 8);
          var6.faceVertexA = BufferedRandomAccessFile.readPackedShortArray(input, 16, var6.faceVertexA, -1);
          var6.faceVertexB = BufferedRandomAccessFile.readPackedShortArray(input, 16, var6.faceVertexB, -1);
          var6.faceVertexC = BufferedRandomAccessFile.readPackedShortArray(input, 16, var6.faceVertexC, -1);
          if (var4) {
            var6.normalCount = (short)input.readBits(16, 8);
            var6.field_N = BufferedRandomAccessFile.readPackedShortArray(input, 16, var6.field_N, -1);
            var6.field_q = BufferedRandomAccessFile.readPackedShortArray(input, 16, var6.field_q, -1);
            var6.field_w = BufferedRandomAccessFile.readPackedShortArray(input, 16, var6.field_w, -1);
            var6.faceNormalA = BufferedRandomAccessFile.readPackedShortArray(input, 16, var6.faceNormalA, -1);
            var6.faceNormalB = BufferedRandomAccessFile.readPackedShortArray(input, 16, var6.faceNormalB, -1);
            var6.faceNormalC = BufferedRandomAccessFile.readPackedShortArray(input, 16, var6.faceNormalC, -1);
          }
          if (var5) {
            input.readBits(16, 8);
            var6.field_v = BufferedRandomAccessFile.readPackedShortArray(input, 16, var6.field_v, -1);
            var6.field_c = BufferedRandomAccessFile.readPackedShortArray(input, 16, var6.field_c, -1);
            var6.field_Q = BufferedRandomAccessFile.readPackedShortArray(input, 16, var6.field_Q, -1);
            var6.field_G = BufferedRandomAccessFile.readPackedShortArray(input, 16, var6.field_G, -1);
            var6.field_F = BufferedRandomAccessFile.readPackedShortArray(input, 16, var6.field_F, -1);
          }
          if (SessionMenuSupport.readBitFlag(input, (byte) -104)) {
            var6.field_m = BufferedRandomAccessFile.readPackedShortArray(input, 16, var6.field_m, -1);
          }
          if (SessionMenuSupport.readBitFlag(input, (byte) -102)) {
            var6.facePriorities = StripedProgressBar.readPackedByteArray(16, 118, input, var6.facePriorities);
            int var7 = 0;
            for (int var8 = 0; var8 < var6.facePriorities.length; var8++) {
              if ((255 & var6.facePriorities[var8]) > var7) {
                var7 = var6.facePriorities[var8] & 255;
              }
            }
            if (0 == var7) {
              var6.facePriorities = null;
            } else {
              var6.facePriorityCount = (byte)(1 + var7);
            }
          }
          TriangleMesh stackIn_24_0 = var6;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_27_0 = var2;
          StringBuilder stackIn_27_1 = new StringBuilder().append("wk.A(").append(guard).append(',');
          if (input == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final static String groupLoadingMessage(String beforeIndex, boolean guard, String label, String groupName, ResourceArchive archive) {
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        String stackIn_19_2 = null;
        try {
          if (!archive.ensureIndex(0)) {
            String stackIn_2_0 = (String) (beforeIndex);
            return stackIn_2_0;
          }
          if (guard) {
            field_a = (String) null;
          }
          String stackIn_6_0 = label + " - " + archive.namedGroupProgress(groupName, 0) + "%";
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5;
          StringBuilder stackIn_9_1 = new StringBuilder().append("wk.D(");
          if (beforeIndex == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(',');
          if (label == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (groupName == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          StringBuilder stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (archive == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_f = "No highscores";
        field_a = "Error connecting to server. Please try using a different server.";
        field_b = new boolean[]{true, true, true, true, true};
    }
}
