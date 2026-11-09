/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntroFinalFrameResources {
    static String field_a;
    static int field_d;
    static int field_b;
    static String toServerListText;

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          return;
        }
        toServerListText = null;
        field_a = null;
    }

    final static void attachKeyboardInput(int guard, java.awt.Component component) {
        try {
          component.setFocusTraversalKeysEnabled(false);
          if (guard != 0) {
            java.awt.Component var3 = (java.awt.Component) null;
            IntroFinalFrameResources.attachKeyboardInput(-23, (java.awt.Component) null);
          }
          component.addKeyListener(EmailCredentials.field_e);
          component.addFocusListener(EmailCredentials.field_e);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "lq.C(" + guard + ',' + (component != null ? "{...}" : "null") + ')');
        }
    }

    final static void loadIntroFinalFrame(ResourceArchive archive, int guard) {
        Sprite var6 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var6 = new Sprite(archive.fetchNamedFile("", "final_frame.jpg", -1), (java.awt.Component) ((Object) NineSlicePanel.field_f));
          var3 = var6.field_x;
          var4 = var6.field_u;
          GameApplet.pushRasterState(103);
          if (guard >= -62) {
            ResourceArchive var5 = (ResourceArchive) null;
            IntroFinalFrameResources.archiveLoadingMessage(-58, (String) null, (String) null, (ResourceArchive) null);
          }
          LoginIdentifierSupport.field_a = new Sprite(var3, var4 * 3 / 4);
          LoginIdentifierSupport.field_a.bindRaster();
          var6.c(0, 0);
          MusicPatchEnvelope.field_a = new Sprite(var3, var4 - LoginIdentifierSupport.field_a.field_u);
          MusicPatchEnvelope.field_a.bindRaster();
          var6.c(0, -LoginIdentifierSupport.field_a.field_u);
          MusicPatchEnvelope.field_a.field_A = LoginIdentifierSupport.field_a.field_u;
          ClientException.popRasterState((byte) 71);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "lq.A(" + (archive != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final static String archiveLoadingMessage(int guard, String loadingText, String waitingText, ResourceArchive archive) {
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard < 100) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (!archive.loadIndex((byte) 127)) {
            stackIn_6_0 = (String) (waitingText);
            return stackIn_6_0;
          }
          stackIn_8_0 = loadingText + " - " + archive.loadPercent(0) + "%";
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("lq.D(").append(guard).append(',');
          if (loadingText == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (waitingText == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (archive == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_b = -1;
        field_a = "If you do nothing the game will revert to normal view in <%0> seconds.";
        toServerListText = "To server list";
    }
}
