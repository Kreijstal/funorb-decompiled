/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ProgressRecord extends IntrusiveNode {
    static String field_k;
    int levelIndex;
    int field_g;
    int field_n;
    int field_o;
    int campaignId;
    static Sprite field_j;
    int field_h;
    static String field_l;

    final static Sprite[] loadSprites(int groupId, ResourceArchive archive, int fileId, byte guard) {
        String stackIn_8_2 = null;
        try {
          int var4_int = -48 % ((guard + 38) / 33);
          if (ArchivePreloader.loadSpriteSheet(archive, 120, groupId, fileId)) {
            Sprite[] stackIn_4_0 = LoginStage.buildRgbSpritesFromSheet(121);
            return stackIn_4_0;
          }
          Object stackIn_2_0 = null;
          return (Sprite[]) (stackIn_2_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var4;
          StringBuilder stackIn_7_1 = new StringBuilder().append("cc.B(").append(groupId).append(',');
          if (archive == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(fileId).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        field_k = null;
        if (guard <= 26) {
          field_k = (String) null;
          field_l = null;
          field_j = null;
          return;
        }
        field_l = null;
        field_j = null;
    }

    ProgressRecord(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_n = param2;
        this.field_g = param5;
        this.levelIndex = param1;
        this.field_h = param3;
        this.campaignId = param0;
        this.field_o = param4;
    }

    static {
        field_l = "The Achievements system is currently unavailable.";
    }
}
