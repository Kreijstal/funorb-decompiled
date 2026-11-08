/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PendingRequestAcknowledgement extends IntrusiveNode {
    static int field_j;
    int field_f;
    static java.awt.Frame field_k;
    int field_i;
    static String field_h;
    static String field_e;
    static String[] field_g;

    final static void closeQuickChat(int param0) {
        DebugConsole.field_s = false;
        if (ClassNameSupport.field_g != null) {
          ClassNameSupport.field_g.resetSelection(5075);
        }
        int var1 = -60 % ((-56 - param0) / 56);
        if (0 != NodeHashTableIterator.field_b) {
          TrinketCatalog.a(29);
        }
        NumericDateInputWidget.field_I = 0;
    }

    private PendingRequestAcknowledgement() throws Throwable {
        throw new Error();
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        field_k = null;
        field_h = null;
        field_e = null;
        int var1 = 81 % ((param0 + 6) / 41);
    }

    final static Sprite[] loadSpriteSheet(int param0, byte param1, int param2, ResourceArchive param3) {
        RuntimeException var4 = null;
        Sprite[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Sprite[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -67) {
            stackIn_2_0 = (Sprite[]) null;
            return stackIn_2_0;
          }
          if (RankingRowFactory.decodeSpriteSheetFromArchive(param2, param3, param0, 122)) {
            stackIn_7_0 = ModalPanel.takeDecodedSprites((byte) 78);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (Sprite[]) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("fa.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_j = 0;
        field_h = "Confirm Password: ";
        field_e = "Open in popup window";
    }
}
