/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextLine extends IntrusiveNode {
    static String field_l;
    String text;
    static volatile long field_e;
    static GzipDecoder field_g;
    static String field_j;
    static int field_f;
    static String field_m;
    static String field_k;
    static int field_h;

    final static boolean isAvailabilityCheckPending(boolean param0) {
        if (!param0) {
          return !DualLinkDequeIterator.field_e.isComplete((byte) -80) ? true : false;
        }
        field_j = (String) null;
        return !DualLinkDequeIterator.field_e.isComplete((byte) -80) ? true : false;
    }

    final static boolean containsNameOrReverse(byte param0, String param1, String param2) {
        String var3 = null;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1 = ArchiveManager.replaceCharacter('_', "", (byte) -124, param1);
          var3 = QuickChatKeysHelpPanel.reverseString(-1, param1);
          var4 = 117 / ((-74 - param0) / 46);
          stackIn_5_0 = (-1 != param2.indexOf(param1)) || (param2.indexOf(var3) != -1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("lj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        field_j = null;
        field_m = null;
        if (param0 < -23) {
          field_l = null;
          field_k = null;
          return;
        }
        field_g = (GzipDecoder) null;
        field_l = null;
        field_k = null;
    }

    final static int scaleLobbyPreviewCoordinate(int param0, boolean param1) {
        if (param1) {
          TextLine.releaseStatics(-13);
          return 23 * param0 >> 8;
        }
        return 23 * param0 >> 8;
    }

    TextLine(String param0) {
        try {
          this.text = param0;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "lj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "Loading fonts";
        field_m = "Auctions";
        field_e = 0L;
        field_f = 0;
        field_j = "Buying or selling an account";
        field_g = new GzipDecoder();
        field_k = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_h = -1;
    }
}
