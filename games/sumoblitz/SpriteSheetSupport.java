/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteSheetSupport {
    static String startGameText;

    final static boolean decodeSpriteSheet(ResourceArchive archive, int groupId, int fileId, int guard) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = archive.fetchFile((byte) 126, groupId, fileId);
          var4 = var5;
          if (guard != -23046) {
            startGameText = (String) null;
          }
          if (var5 == null) {
            return false;
          }
          ServerIntArrayRequest.decodeSpriteSheet(guard ^ -23291, var5);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("k.B(");
          if (archive == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(groupId).append(',').append(fileId).append(',').append(guard).append(')').toString());
        }
    }

    final static void a(pd param0, int param1, byte param2) {
        IsaacPacketBuffer var3 = null;
        try {
          if (param2 < 93) {
            startGameText = (String) null;
          }
          var3 = InwardSparkParticle.field_v;
          var3.writeCipherByte(param1, 8);
          var3.writeByte((byte) 111, param0.field_k);
          var3.writeShort(-10, param0.field_o);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "k.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 28322) {
          startGameText = (String) null;
          startGameText = null;
          return;
        }
        startGameText = null;
    }

    static {
        startGameText = "start game";
    }
}
