/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class RenderingSupport004 extends DualNode {
    int integerState0254;
    static Random randomState0002;
    int integerState0255;
    int integerState0256;
    static int integerState0257;
    static SceneWidget sceneWidgetState0039;
    int integerState0258;
    int integerState0259;
    int integerState0260;
    static String stringState0202;
    static SceneWidget sceneWidgetState0040;

    final static RenderingSupport010 computeRenderingSupport0100641(IndexedSprite[] indexedSpriteArrayArgument1, int integerArgument2, byte[] byteArrayArgument3) {
        int integerLocal1 = 0;
        RenderingSupport010 stackRenderingSupport010Local2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        int[] integerArrayLocal9 = null;
        RuntimeException runtimeExceptionLocal10 = null;
        int[] integerArrayLocal11 = null;
        int[] integerArrayLocal12 = null;
        int[] integerArrayLocal13 = null;
        byte[][] byteArrayArrayLocal14 = null;
        int integerLocal15 = 0;
        int[] integerArrayLocal16 = null;
        int[] integerArrayLocal17 = null;
        int[] integerArrayLocal18 = null;
        int[] integerArrayLocal19 = null;
        int[] integerArrayLocal20 = null;
        byte[][] byteArrayArrayLocal21 = null;
        int[] integerArrayLocal22 = null;
        int[] integerArrayLocal23 = null;
        int[] integerArrayLocal24 = null;
        int[] integerArrayLocal25 = null;
        byte[][] byteArrayArrayLocal26 = null;
        integerLocal15 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (indexedSpriteArrayArgument1.length != 256) {
            throw new IllegalArgumentException();
          }
          if (integerArgument2 <= 48) {
            RenderingSupport004.performAction0643(-68);
          }
          integerArrayLocal22 = new int[256];
          integerArrayLocal17 = integerArrayLocal22;
          integerArrayLocal16 = integerArrayLocal17;
          integerArrayLocal9 = integerArrayLocal16;
          integerArrayLocal23 = new int[256];
          integerArrayLocal18 = integerArrayLocal23;
          integerArrayLocal11 = integerArrayLocal18;
          integerArrayLocal24 = new int[256];
          integerArrayLocal19 = integerArrayLocal24;
          integerArrayLocal12 = integerArrayLocal19;
          integerArrayLocal25 = new int[256];
          integerArrayLocal20 = integerArrayLocal25;
          integerArrayLocal13 = integerArrayLocal20;
          byteArrayArrayLocal26 = new byte[256][];
          byteArrayArrayLocal21 = byteArrayArrayLocal26;
          byteArrayArrayLocal14 = byteArrayArrayLocal21;
          for (integerLocal1 = 0; 256 > integerLocal1; integerLocal1++) {
            integerArrayLocal16[integerLocal1] = indexedSpriteArrayArgument1[integerLocal1].integerState0427;
            integerArrayLocal11[integerLocal1] = indexedSpriteArrayArgument1[integerLocal1].integerState0428;
            integerArrayLocal12[integerLocal1] = indexedSpriteArrayArgument1[integerLocal1].integerState0425;
            integerArrayLocal13[integerLocal1] = indexedSpriteArrayArgument1[integerLocal1].integerState0426;
            byteArrayArrayLocal14[integerLocal1] = indexedSpriteArrayArgument1[integerLocal1].byteArrayState0021;
          }
          stackRenderingSupport010Local2 = new RenderingSupport010(byteArrayArgument3, integerArrayLocal22, integerArrayLocal23, integerArrayLocal24, integerArrayLocal25, byteArrayArrayLocal26);
          return stackRenderingSupport010Local2;
        } catch (java.lang.RuntimeException caughtParameterLocal27) {
          caughtExceptionLocal8 = caughtParameterLocal27;
          runtimeExceptionLocal10 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal10;
          stackStringBuilderLocal4 = new StringBuilder().append("gg.D(");
          if (indexedSpriteArrayArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument2).append(',');
          if (byteArrayArgument3 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    final static int computeInteger0642(int integerArgument1, int integerArgument2) {
        if (integerArgument2 != 27935) {
          return 72;
        }
        return 5 * ((integerArgument1 + 1) * integerArgument1);
    }

    final static void performAction0640(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        IterableNodeCollection.performAction1876(-9074);
        if (integerArgument2 == 20763) {
          SoftwareRaster.performAction0742(integerArgument4, integerArgument1, integerArgument3, integerArgument5);
          return;
        }
        RenderingSupport004.computeInteger0642(119, 2);
        SoftwareRaster.performAction0742(integerArgument4, integerArgument1, integerArgument3, integerArgument5);
    }

    public static void performAction0643(int integerArgument1) {
        stringState0202 = null;
        randomState0002 = null;
        sceneWidgetState0040 = null;
        sceneWidgetState0039 = null;
        if (integerArgument1 != 0) {
          RenderingSupport004.performAction0643(-109);
        }
    }

    RenderingSupport004() {
    }

    static {
        randomState0002 = new Random();
        stringState0202 = "Disruptive behaviour";
    }
}
