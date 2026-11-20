/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LeaderboardPlayer {
    String alternateName;
    static String field_c;
    boolean includedInUniqueView;
    String displayName;
    static boolean field_f;
    static Sprite[] field_h;
    static String field_a;
    static String field_d;

    final static boolean containsForwardOrReversed(String param0, String param1, int param2) {
        String var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1 = QuadraticPathSlicer.replaceCharacter((byte) 60, (char)param2, param1, "");
          var3 = FixedAngleMath.reverseString(param0, (byte) -92);
          stackIn_5_0 = (-1 != param1.indexOf(param0)) || (param1.indexOf(var3) != -1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("jc.A(");
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
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final static Sprite[] loadSprites(int param0, int param1, ResourceArchive param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            LeaderboardPlayer.clearSharedReferences((byte) 44);
          }
          if (TexturedPolygonRenderer.decodeArchivedSpriteSheet(param3, param1, (byte) -27, param2)) {
            return GrowableObjectList.buildDecodedSprites(61);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("jc.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_c = null;
        field_h = null;
        field_d = null;
        field_a = null;
        if (param0 != 5) {
          ResourceArchive var2 = (ResourceArchive) null;
          LeaderboardPlayer.loadSprites(95, -8, (ResourceArchive) null, 100);
        }
    }

    static {
        field_c = "You have 1 unread message!";
        field_a = "Select Vehicle to Start";
        field_d = "All";
    }
}
