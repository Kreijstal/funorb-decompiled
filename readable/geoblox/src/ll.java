/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static Sprite[] frameNineSliceSprites;
    static String createMoreSuggestionsText;
    static ResourceArchive gameGraphicsArchive;
    static MusicScore titleMusicTrack;
    static boolean field_e;
    static String createEmailTooltipText;
    static boolean[] themesLoaded;
    static String backText;

    final static long a(byte param0) {
        if (param0 != 12) {
            ResourceArchive var2 = (ResourceArchive) null;
            ll.a(55, (byte) -55, -85, (ResourceArchive) null);
        }
        return -AudioService.field_e + oa.a(-12520);
    }

    final static Sprite[] a(int param0, byte param1, int param2, ResourceArchive param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Sprite[] stackIn_5_0 = null;
        Sprite[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!mf.decodeSpritesFromArchive(param2, param0, 117, param3)) {
            stackIn_2_0 = null;
            return (Sprite[]) (stackIn_2_0);
          }
          if (param1 == -81) {
            stackIn_7_0 = TriangleMesh.buildRgbSpritesFromDecodedSheet(255);
            return stackIn_7_0;
          }
          stackIn_5_0 = (Sprite[]) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ll.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        createEmailTooltipText = null;
        gameGraphicsArchive = null;
        backText = null;
        createMoreSuggestionsText = null;
        titleMusicTrack = null;
        frameNineSliceSprites = null;
        if (param0 != 7) {
            return;
        }
        themesLoaded = null;
    }

    static {
        createMoreSuggestionsText = "More suggestions";
        themesLoaded = new boolean[7];
        createEmailTooltipText = "Your email address is used to identify this account";
        backText = "Back";
    }
}
