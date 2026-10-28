/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveSpriteLoader {
    static String field_d;
    static Sprite field_a;
    static PcmSample field_b;
    static String field_e;
    static String field_f;
    static int[] field_c;

    final static Sprite[] loadSprites(int groupId, int fileId, ResourceArchive archive, int guard) {
        String stackIn_10_2 = null;
        try {
          if (guard != 8192) {
            field_e = (String) null;
          }
          if (ArchivePreloader.loadSpriteSheet(archive, guard ^ -8272, groupId, fileId)) {
            Sprite[] stackIn_6_0 = NetworkGameClient.buildDecodedSprites(15556);
            return stackIn_6_0;
          }
          Object stackIn_4_0 = null;
          return (Sprite[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var4;
          StringBuilder stackIn_9_1 = new StringBuilder().append("gm.C(").append(groupId).append(',').append(fileId).append(',');
          if (archive == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(')').toString());
        }
    }

    final static boolean isAlternateLoginFlow(int guard) {
        if (guard != 8192) {
          field_d = (String) null;
          return DialWidget.field_H;
        }
        return DialWidget.field_H;
    }

    public static void releaseStatics(int guard) {
        field_b = null;
        field_d = null;
        field_f = null;
        if (guard == 8192) {
          field_e = null;
          field_c = null;
          field_a = null;
          return;
        }
        ResourceArchive var2 = (ResourceArchive) null;
        ArchiveSpriteLoader.loadSprites(13, 47, (ResourceArchive) null, 3);
        field_e = null;
        field_c = null;
        field_a = null;
    }

    static {
        field_f = "Unable to connect to the data server. Please check any firewall you are using.";
        field_d = "Loading sound effects";
        field_c = new int[8192];
    }
}
