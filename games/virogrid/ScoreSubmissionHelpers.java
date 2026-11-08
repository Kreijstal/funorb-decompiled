/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScoreSubmissionHelpers {
    static byte[] field_e;
    static String field_c;
    static String field_d;
    static DraggableWidget field_b;
    static int[] gridSizes;

    public static void releaseStatics(boolean param0) {
        field_d = null;
        field_e = null;
        field_c = null;
        if (param0) {
          return;
        }
        gridSizes = null;
        field_b = null;
    }

    final static int nextPowerOfTwo(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1;
        param1 = param1 | param1 >>> 2;
        param1 = param1 | param1 >>> 4;
        param1 = param1 | param1 >>> 8;
        if (param0 == 8742) {
          param1 = param1 | param1 >>> 16;
          return param1 + 1;
        }
        field_d = (String) null;
        param1 = param1 | param1 >>> 16;
        return param1 + 1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void writeScoreSubmission(int param0, int param1, PendingHighscoreRequest param2) {
        CipherPacketBuffer var7 = null;
        CipherPacketBuffer var8 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = Virogrid.field_F ? 1 : 0;
        try {
          var7 = IterableNodeHashTable.field_g;
          var8 = var7;
          var8.writeCipheredOpcode(param0, param1 + 7);
          var8.position = var8.position + 1;
          var4 = var8.position;
          var8.writeByte(param1, -113);
          var8.writeShort((byte) -111, param2.field_j);
          var8.writeShort((byte) 122, param2.field_g);
          var8.writeShort((byte) -119, param2.field_l);
          var8.writeInt(param2.field_t, (byte) -42);
          var8.writeInt(param2.field_m, (byte) -42);
          var8.writeInt(param2.field_r, (byte) -42);
          var8.writeInt(param2.field_k, (byte) -42);
          var8.writeByte(param2.field_o.length, -67);
          for (var5 = 0; param2.field_o.length > var5; var5++) {
            var7.writeInt(param2.field_o[var5], (byte) -42);
          }
          var8.writeCrc32((byte) -111, var4);
          var8.backpatchByteLength(var8.position - var4, -1);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ra.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void updateNameEntryDialog(byte param0, boolean param1) {
        if (param0 != 3) {
          return;
        }
        if (LobbyGame.field_Xb != null) {
          LobbyGame.field_Xb.drawRoot(param1, 24960);
        }
    }

    static {
        field_c = "<%0>'s game";
        field_d = "Join <%0>'s game";
        field_e = new byte[]{(byte)7, (byte)3};
        gridSizes = new int[]{7, 9, 11};
    }
}
