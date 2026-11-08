/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TutorialStepTable {
    static int[] field_h;
    static volatile boolean field_f;
    static TutorialStep[] field_d;
    static String field_j;
    static int field_e;
    static String field_i;
    static RgbSprite[] field_g;
    static int field_b;
    static int field_c;
    static ResourceArchive field_a;
    static BitmapFont field_k;

    final static void detachInputListeners(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          TextSpriteHelpers.removeKeyListeners((java.awt.Component) ((Object) param0), param1 ^ -21768);
          IterableDualNodeDeque.detachMouseInput(0, (java.awt.Component) ((Object) param0));
          if (param1 != 9174) {
            field_b = -11;
          }
          if (WeightedLruCache.field_j == null) {
            return;
          }
          WeightedLruCache.field_j.detach((java.awt.Component) ((Object) param0), true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("pa.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 >= 13) {
          field_j = null;
          field_k = null;
          field_g = null;
          field_a = null;
          field_i = null;
          field_d = null;
          field_h = null;
          return;
        }
        field_k = (BitmapFont) null;
        field_j = null;
        field_k = null;
        field_g = null;
        field_a = null;
        field_i = null;
        field_d = null;
        field_h = null;
    }

    final static void showQuickChatMenu(int param0, QuickChatMenu param1) {
        if (param1 == null) {
          return;
        }
        IntKeyLookup.field_i = param1;
        RankingAndRasterHelpers.field_c.field_M.clear(6);
        RankingAndRasterHelpers.field_c.addChild(IntKeyLookup.field_i, 127);
        if (param0 != 12105) {
          return;
        }
        try {
          GzipDecoder.field_e = true;
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "pa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void queueHighscoreSubmission(int param0, byte param1, HighscoreSubmission param2) {
        try {
          MidiPcmStream.field_B.addLast(3, param2);
          KeyRoutingHelpers.writeScoreSubmission(param0, param2, (byte) 109);
          if (param1 > -24) {
            QuickChatMenu var4 = (QuickChatMenu) null;
            TutorialStepTable.showQuickChatMenu(45, (QuickChatMenu) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "pa.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void setPromotionArchives(ResourceArchive param0, int param1, ResourceArchive param2) {
        try {
          int var3_int = -47 / ((param1 - 53) / 45);
          BufferedRandomAccessFile.field_d = param2;
          field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "pa.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = true;
        field_e = -1;
        field_c = -1;
        field_j = "Co-op highscores";
        field_i = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
