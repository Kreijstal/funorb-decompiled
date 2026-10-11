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

    final static void performAction0686(int integerArgument1, boolean booleanArgument2, SceneWidgetPart013 sceneWidgetPart013Argument3, String stringArgument4) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        RuntimeException runtimeExceptionLocal7 = null;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        MixedSupport104 mixedSupport104Local10 = null;
        String stringLocal11 = null;
        MixedSupport104 mixedSupport104Local12 = null;
        String stringLocal13 = null;
        MixedSupport104 mixedSupport104Local14 = null;
        String stringLocal15 = null;
        MixedSupport104 mixedSupport104Local16 = null;
        try {
          MixedSupport122.performAction1732((String) null, (int[]) null, 105, MixedSupport047.sceneWidgetPart008State0003, sceneWidgetPart013Argument3, (String) null, 0L, -1, sceneWidgetPart013Argument3.computeInteger1937(-88));
          if (sceneWidgetPart013Argument3.booleanState0204 && (2 == sceneWidgetPart013Argument3.integerState0845 ||
            !(MixedSupport126.integerState0776 < 2))) {
            mixedSupport104Local10 = SceneWidget.mixedSupport104State0001;
            stringLocal11 = CollectionSupport001.computeString0336(86, GameDomainSupport002.stringState0145, new String[]{stringArgument4});
            mixedSupport104Local10.sceneWidgetPart002State0002.performAction0620(stringLocal11, 10, 126);
          }
          SceneWidget.mixedSupport104State0001.performAction1412(-119);
          if (booleanArgument2) {
            if (SceneWidget.mixedSupport104State0001.integerState0581 != MixedSupport124.integerState0772) {
              mixedSupport104Local14 = SceneWidget.mixedSupport104State0001;
              stringLocal15 = CollectionSupport001.computeString0336(86, MixedSupport118.stringState0492, new String[]{stringArgument4});
              mixedSupport104Local14.sceneWidgetPart002State0002.performAction0620(stringLocal15, 15, integerArgument1 ^ 91);
            } else {
              mixedSupport104Local12 = SceneWidget.mixedSupport104State0001;
              stringLocal13 = CollectionSupport001.computeString0336(94, MixedSupport035.stringState0166, new String[]{stringArgument4});
              mixedSupport104Local12.sceneWidgetPart002State0002.performAction0620(stringLocal13, 16, integerArgument1 + 87);
            }
          }
          mixedSupport104Local16 = SceneWidget.mixedSupport104State0001;
          integerLocal8 = UiComponentPart013.integerState0276;
          integerLocal9 = TextLineMetrics.integerState0535;
          mixedSupport104Local16.sceneWidgetPart002State0002.performAction0621(integerLocal9, integerLocal8, 123, integerArgument1, 0);
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
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    public static void performAction0685(int integerArgument1) {
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
