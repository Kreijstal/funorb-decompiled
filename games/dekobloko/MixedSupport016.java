/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport016 {
    String stringState0075;
    boolean booleanState0013;
    int integerState0101;
    static NodeDeque nodeDequeState0003;
    boolean booleanState0014;
    static int[] integerArrayState0021;
    static RgbSprite rgbSpriteState0010;
    static LobbyRoomRow sceneWidgetPart013State0001;
    String[] stringArrayState0003;
    static String stringState0076;
    static boolean booleanState0015;
    static int integerState0102;
    static String stringState0077;
    static volatile boolean booleanState0016;

    final static RenderingSupport009 computeRenderingSupport0090204(String stringArgument1, ResourceArchive resourceArchiveArgument2, ResourceArchive resourceArchiveArgument3, byte byteArgument4, String stringArgument5) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        RenderingSupport009 stackRenderingSupport009Local4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        StringBuilder stackStringBuilderLocal12 = null;
        String stackStringLocal13 = null;
        RuntimeException caughtExceptionLocal14 = null;
        try {
          if (byteArgument4 <= 86) {
            integerArrayState0021 = (int[]) null;
          }
          integerLocal1 = resourceArchiveArgument3.getGroupIdByName(-1, stringArgument5);
          integerLocal3 = resourceArchiveArgument3.getFileIdByName(integerLocal1, 13030, stringArgument1);
          stackRenderingSupport009Local4 = FullscreenCanvas.computeRenderingSupport0091382(resourceArchiveArgument3, (byte) 41, integerLocal3, integerLocal1, resourceArchiveArgument2);
          return stackRenderingSupport009Local4;
        } catch (java.lang.RuntimeException caughtParameterLocal15) {
          caughtExceptionLocal14 = caughtParameterLocal15;
          runtimeExceptionLocal2 = caughtExceptionLocal14;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("cd.B(");
          if (stringArgument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (resourceArchiveArgument2 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',');
          if (resourceArchiveArgument3 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          stackStringBuilderLocal12 = ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',').append(byteArgument4).append(',');
          if (stringArgument5 == null) {
            stackStringLocal13 = "null";
          } else {
            stackStringLocal13 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal12).append(stackStringLocal13).append(')').toString());
        }
    }

    final static boolean computeBoolean0203(int integerArgument1) {
        if (integerArgument1 != 8192) {
          nodeDequeState0003 = (NodeDeque) null;
          return MixedSupport020.fullscreenCanvasState0001 != null ? true : GameSession.booleanState0141;
        }
        return MixedSupport020.fullscreenCanvasState0001 != null ? true : GameSession.booleanState0141;
    }

    final static void performAction0205(boolean booleanArgument1) {
        MixedSupport007.renderingSupport007State0001 = null;
        SecondaryNodeHashTable.booleanState0121 = false;
        MixedSupport051.renderingSupport007State0005 = null;
        MixedSupport033.renderingSupport007State0004 = null;
        MixedSupport097.renderingSupport007State0007 = null;
        UiComponentPart004.renderingSupport007State0002 = null;
        ComponentContainer.renderingSupport007State0006 = null;
        MixedSupport020.renderingSupport007State0003 = null;
        if (!booleanArgument1) {
          sceneWidgetPart013State0001 = (LobbyRoomRow) null;
        }
    }

    public static void clearStaticReferences(byte byteArgument1) {
        stringState0077 = null;
        nodeDequeState0003 = null;
        sceneWidgetPart013State0001 = null;
        rgbSpriteState0010 = null;
        if (byteArgument1 < 119) {
          return;
        }
        integerArrayState0021 = null;
        stringState0076 = null;
    }

    MixedSupport016(boolean booleanArgument1) {
        this.booleanState0014 = booleanArgument1 ? true : false;
    }

    static {
        nodeDequeState0003 = new NodeDeque();
        integerArrayState0021 = new int[8192];
        booleanState0015 = false;
        stringState0076 = "<%0> wants to draw.";
        booleanState0016 = true;
        stringState0077 = "Full";
    }
}
