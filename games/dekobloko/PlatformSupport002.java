/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlatformSupport002 extends java.awt.Canvas {
    private java.awt.Component componentState0001;
    static int integerState0145;
    static int integerState0146;
    static int integerState0147;
    static int integerState0148;
    static RgbSprite rgbSpriteState0013;
    static String[] stringArrayState0007;
    static String stringState0123;
    static String stringState0124;
    static String stringState0125;

    public final void update(java.awt.Graphics graphicsArgument1) {
        try {
          this.componentState0001.update(graphicsArgument1);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020392((Throwable) ((Object) runtimeException), "dk.update(" + (graphicsArgument1 != null ? "{...}" : "null") + ')');
        }
    }

    PlatformSupport002(java.awt.Component componentArgument1) {
        try {
          this.componentState0001 = componentArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020392((Throwable) ((Object) runtimeException), "dk.<init>(" + (componentArgument1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void performAction0402(int integerArgument1) {
        int integerLocal1 = 0;
        MixedSupport033 cachedMixedSupport033Local2 = null;
        RuntimeException caughtExceptionLocal3 = null;
        RuntimeException runtimeExceptionLocal4 = null;
        int integerLocal5 = 0;
        MixedSupport033 mixedSupport033Local6 = null;
        int[] integerArrayLocal7 = null;
        int integerLocal8 = 0;
        int[] integerArrayLocal9 = null;
        CipherPacketBuffer cipherPacketBufferLocal10 = null;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int[] integerArrayLocal13 = null;
        MixedSupport033 mixedSupport033Local14 = null;
        MixedSupport033 mixedSupport033Local15 = null;
        NetworkSupport005 networkSupport005Local16 = null;
        CipherPacketBuffer cipherPacketBufferLocal17 = null;
        integerLocal12 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          cipherPacketBufferLocal17 = UiComponentPart006.cipherPacketBufferState0001;
          integerLocal5 = cipherPacketBufferLocal17.computeInteger2035((byte) -36);
          if (integerLocal5 == 0) {
            integerArrayLocal7 = UiComponentPart002.computeIntegerArray0088(56);
            integerArrayLocal13 = integerArrayLocal7;
            integerArrayLocal9 = integerArrayLocal13;
            cipherPacketBufferLocal10 = cipherPacketBufferLocal17;
            integerLocal11 = ((PacketBuffer) ((Object) cipherPacketBufferLocal10)).computeInteger2035((byte) -116);
            for (integerLocal1 = 0; integerLocal11 > integerLocal1; integerLocal1++) {
              integerArrayLocal13[integerLocal1] = ((PacketBuffer) ((Object) cipherPacketBufferLocal10)).computeInteger2046(7553);
            }
            mixedSupport033Local15 = (MixedSupport033) (PcmPlayerService.nodeDequeState0028.computeHashNode1920((byte) 92));
            if (mixedSupport033Local15 == null) {
              NodeHashTable.performAction1653(95);
              return;
            }
            mixedSupport033Local15.booleanState0041 = true;
            mixedSupport033Local15.integerArrayState0042 = integerArrayLocal7;
            mixedSupport033Local15.performAction0158((byte) 112);
          } else {
            if (integerLocal5 == 1) {
              networkSupport005Local16 = (NetworkSupport005) (RenderingSupport002.nodeDequeState0004.computeHashNode1920((byte) -66));
              if (networkSupport005Local16 == null) {
                NodeHashTable.performAction1653(127);
                return;
              }
              networkSupport005Local16.performAction0158((byte) 106);
            } else {
              if (integerLocal5 == 2) {
                cachedMixedSupport033Local2 = (MixedSupport033) (PcmPlayerService.nodeDequeState0028.computeHashNode1920((byte) -64));
                mixedSupport033Local14 = cachedMixedSupport033Local2;
                mixedSupport033Local6 = cachedMixedSupport033Local2;
                if (mixedSupport033Local14 == null) {
                  NodeHashTable.performAction1653(115);
                  return;
                }
                mixedSupport033Local14.integerArrayState0042 = UiComponentPart002.computeIntegerArray0088(109);
                mixedSupport033Local14.booleanState0041 = true;
                mixedSupport033Local14.performAction0158((byte) 119);
              } else {
                NetworkArchiveRequestManager.performAction1419((Throwable) null, 16408, "A1: " + BufferedSocket.computeString1514((byte) 89));
                NodeHashTable.performAction1653(90);
              }
            }
          }
          integerLocal8 = 17 % ((-81 - integerArgument1) / 35);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal18) {
          caughtExceptionLocal3 = caughtParameterLocal18;
          runtimeExceptionLocal4 = caughtExceptionLocal3;
          throw ClientException.computeDiagnosticSupport0020392((Throwable) ((Object) runtimeExceptionLocal4), "dk.B(" + integerArgument1 + ')');
        }
    }

    public static void performAction0403(int integerArgument1) {
        if (integerArgument1 != 16057) {
          return;
        }
        rgbSpriteState0013 = null;
        stringArrayState0007 = null;
        stringState0124 = null;
        stringState0125 = null;
        stringState0123 = null;
    }

    public final void paint(java.awt.Graphics graphicsArgument1) {
        try {
          this.componentState0001.paint(graphicsArgument1);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020392((Throwable) ((Object) runtimeException), "dk.paint(" + (graphicsArgument1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        stringState0123 = "Some special items will sit in your bucket until you activate them. To activate one, pop a shape next to it.";
        stringState0124 = "Invite only";
        stringArrayState0007 = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        MixedSupport080.performAction1037((byte) 125, 50);
        stringState0125 = "Hide game chat";
    }
}
