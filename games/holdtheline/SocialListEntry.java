/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SocialListEntry extends InheritedWidgetStyle {
    String worldName;
    static boolean field_nb;
    static String field_jb;
    static String field_kb;
    int insertionOrder;
    static int[][] field_lb;
    String displayName;
    static String field_ib;

    final static void a(int param0, ResourceArchive param1, int param2, PcmStreamMixer param3) {
        try {
          TextLineLayout.field_l = param0 * NodeHashTableIterator.a(855) / 1000;
          LoginMethodPreference.preloadLogoAudio(param1, 0);
          Particle.loadLogoModels(param1, -64);
          DelayedServerPacket.loadLogoFinalFrame(-18916, param1);
          dm.a(255);
          DraggableWidget.j(param2 ^ 0);
          StrongCacheEntry.field_q = param2 - TextLineLayout.field_l;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "fi.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearSharedReferences(boolean param0) {
        field_jb = null;
        field_kb = null;
        field_ib = null;
        field_lb = (int[][]) null;
        if (!param0) {
          field_nb = false;
        }
    }

    final static MonochromeBitmapFont loadMonochromeFont(int param0, ResourceArchive param1, ResourceArchive param2, int param3, int param4) {
        RuntimeException var5 = null;
        ResourceArchive var6 = null;
        Object stackIn_2_0 = null;
        MonochromeBitmapFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!qg.decodeArchivedSpriteSheet(param4, param3, (byte) -27, param2)) {
            stackIn_2_0 = null;
            return (MonochromeBitmapFont) (stackIn_2_0);
          }
          if (param0 != -17072) {
            var6 = (ResourceArchive) null;
            SocialListEntry.loadMonochromeFont(25, (ResourceArchive) null, (ResourceArchive) null, 26, 41);
          }
          stackIn_6_0 = GameAppletShell.buildDecodedMonochromeFont(param0 - 7255, param1.getFile(param4, true, param3));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("fi.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    SocialListEntry() {
        super(0L, (InheritedWidgetStyle) null);
    }

    static {
        field_jb = "members-only content";
        field_ib = "Confirm Password: ";
    }
}
