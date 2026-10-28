/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm {
    static String field_d;
    static Sprite field_a;
    static PcmSample field_b;
    static String field_e;
    static String field_f;
    static int[] field_c;

    final static Sprite[] a(int param0, int param1, ResourceArchive param2, int param3) {
        String stackIn_10_2 = null;
        try {
          if (param3 != 8192) {
            field_e = (String) null;
          }
          if (ArchivePreloader.loadSpriteSheet(param2, param3 ^ -8272, param0, param1)) {
            Sprite[] stackIn_6_0 = NetworkGameClient.e(15556);
            return stackIn_6_0;
          }
          Object stackIn_4_0 = null;
          return (Sprite[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var4;
          StringBuilder stackIn_9_1 = new StringBuilder().append("gm.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        if (param0 != 8192) {
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
        gm.a(13, 47, (ResourceArchive) null, 3);
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
