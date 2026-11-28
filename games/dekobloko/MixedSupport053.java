/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport053 extends HashNode {
    static String stringState0220;
    static String stringState0221;
    static String stringState0222;
    static String stringState0223;
    static int integerState0271;
    static SceneWidget sceneWidgetState0047;
    static int integerState0272;
    static NetworkSupport002 networkSupport002State0002;
    static int integerState0273;

    private MixedSupport053() throws Throwable {
        throw new Error();
    }

    final static void performAction0622(int integerArgument1, boolean booleanArgument2, LobbyRoomRow sceneWidgetPart013Argument3, String stringArgument4) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        RuntimeException runtimeExceptionLocal7 = null;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        MixedSupport099 mixedSupport099Local10 = null;
        String stringLocal11 = null;
        MixedSupport099 mixedSupport099Local12 = null;
        String stringLocal13 = null;
        MixedSupport099 mixedSupport099Local14 = null;
        String stringLocal15 = null;
        MixedSupport099 mixedSupport099Local16 = null;
        try {
          MixedSupport117.performAction1526((String) null, (int[]) null, 105, MixedSupport047.sceneWidgetPart008State0003, sceneWidgetPart013Argument3, (String) null, 0L, -1, sceneWidgetPart013Argument3.getRoomId(-88));
          if (sceneWidgetPart013Argument3.booleanState0204 && (2 == sceneWidgetPart013Argument3.integerState0845 ||
            !(PasswordValidator.integerState0776 < 2))) {
            mixedSupport099Local10 = SceneWidget.mixedSupport099State0001;
            stringLocal11 = NodeHashTableIterator.substituteIndexedPlaceholders(86, GameDomainSupport002.stringState0145, new String[]{stringArgument4});
            mixedSupport099Local10.sceneWidgetPart002State0002.performAction0560(stringLocal11, 10, 126);
          }
          SceneWidget.mixedSupport099State0001.performAction1233(-119);
          if (booleanArgument2) {
            if (SceneWidget.mixedSupport099State0001.integerState0581 != MixedSupport119.integerState0772) {
              mixedSupport099Local14 = SceneWidget.mixedSupport099State0001;
              stringLocal15 = NodeHashTableIterator.substituteIndexedPlaceholders(86, MixedSupport113.stringState0492, new String[]{stringArgument4});
              mixedSupport099Local14.sceneWidgetPart002State0002.performAction0560(stringLocal15, 15, integerArgument1 ^ 91);
            } else {
              mixedSupport099Local12 = SceneWidget.mixedSupport099State0001;
              stringLocal13 = NodeHashTableIterator.substituteIndexedPlaceholders(94, MixedSupport035.stringState0166, new String[]{stringArgument4});
              mixedSupport099Local12.sceneWidgetPart002State0002.performAction0560(stringLocal13, 16, integerArgument1 + 87);
            }
          }
          mixedSupport099Local16 = SceneWidget.mixedSupport099State0001;
          integerLocal8 = LoginPanel.integerState0276;
          integerLocal9 = TextLineMetrics.integerState0535;
          mixedSupport099Local16.sceneWidgetPart002State0002.performAction0561(integerLocal9, integerLocal8, 123, integerArgument1, 0);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal17) {
          caughtExceptionLocal6 = caughtParameterLocal17;
          runtimeExceptionLocal7 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal7;
          stackStringBuilderLocal2 = new StringBuilder().append("hd.A(").append(integerArgument1).append(',').append(booleanArgument2).append(',');
          if (sceneWidgetPart013Argument3 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          stackStringBuilderLocal4 = ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',');
          if (stringArgument4 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    public static void resetStaticState(int integerArgument1) {
        if (integerArgument1 == 22771) {
          stringState0221 = null;
          sceneWidgetState0047 = null;
          stringState0222 = null;
          stringState0223 = null;
          stringState0220 = null;
          networkSupport002State0002 = null;
          return;
        }
        integerState0272 = -48;
        stringState0221 = null;
        sceneWidgetState0047 = null;
        stringState0222 = null;
        stringState0223 = null;
        stringState0220 = null;
        networkSupport002State0002 = null;
    }

    static {
        stringState0221 = "Won";
        stringState0220 = "Don't mind";
        stringState0223 = "Similar rating";
        stringState0222 = "Real-life threats";
    }
}
