/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModeProgressSupport {
    static PcmSample field_a;
    static String[] field_b;
    static int field_d;
    static int[] field_c;
    static int[] field_f;
    static String field_g;
    static ResourceArchive field_e;

    public static void releaseStatics(boolean guard) {
        if (guard) {
          field_f = null;
          field_g = null;
          field_e = null;
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        }
        CharSequence var2 = (CharSequence) null;
        ModeProgressSupport.canonicalizeBase37Name(-125, (CharSequence) null);
        field_f = null;
        field_g = null;
        field_e = null;
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static String canonicalizeBase37Name(int guard, CharSequence text) {
        String stackIn_10_2 = null;
        try {
          if (guard != 0) {
            field_a = (PcmSample) null;
          }
          String var2 = ProxySocketConnector.decodeBase37Name(RasterBuffer.a((byte) 122, text), (byte) 29);
          if (var2 == null) {
            var2 = "";
          }
          String stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var2_ref;
          StringBuilder stackIn_9_1 = new StringBuilder().append("pc.A(").append(guard).append(',');
          if (text == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static int levelNameCount(int guard, int gameMode) {
        if (gameMode < 0) {
          return 0;
        }
        if (ByteStorage.levelNamesByMode.length <= gameMode) {
          return 0;
        }
        if (guard == 2513) {
          int var2 = ByteStorage.levelNamesByMode[gameMode].length;
          return var2;
        }
        field_c = (int[]) null;
        int var2Lifetime1 = ByteStorage.levelNamesByMode[gameMode].length;
        return var2Lifetime1;
    }

    static {
        field_b = new String[]{"Superbly done so far, commander. Your mission remit has again been extended and now takes you to the ice moon. The aliens are busy perfecting cold fusion drive technology for their armada.", "Search for and destroy the drive components."};
        field_f = new int[]{0, 0, 0, 1};
        field_g = "Create a free Account";
    }
}
