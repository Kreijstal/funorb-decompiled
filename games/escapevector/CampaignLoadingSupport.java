/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CampaignLoadingSupport {
    static HighscorePlayerRecord[] field_a;
    static int field_f;
    static String field_d;
    static int[] field_c;
    static BufferedRandomAccessFile[] field_e;
    static String field_b;
    static String[] field_g;

    public static void releaseStatics(int guard) {
        field_e = null;
        field_c = null;
        field_a = null;
        field_b = null;
        field_d = null;
        field_g = null;
        if (guard != 13) {
          CampaignLoadingSupport.releaseStatics(76);
        }
    }

    final static byte[][][] loadCampaigns(ResourceArchive primaryArchive, byte[][][] retained, ResourceArchive secondaryArchive, int guard) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (guard != 0) {
            CampaignLoadingSupport.releaseStatics(-94);
          }
          byte[][][] stackIn_3_0 = ChatMessageDecoder.loadCampaignsByArchiveKind(secondaryArchive, primaryArchive, (int[]) null, retained, 1, guard + 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4;
          StringBuilder stackIn_6_1 = new StringBuilder().append("bg.B(");
          if (primaryArchive == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (retained == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (secondaryArchive == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(')').toString());
        }
    }

    static {
        field_a = new HighscorePlayerRecord[255];
        for (int var0 = 0; var0 < field_a.length; var0++) {
          field_a[var0] = new HighscorePlayerRecord();
        }
        field_d = "Achieved";
        field_f = -1;
        field_b = "This password contains your email address, and would be easy to guess";
        field_g = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_c = new int[]{0, 12, 13};
    }
}
