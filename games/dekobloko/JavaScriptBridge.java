/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JavaScriptBridge {
    final static void evaluate(byte byteArgument1, java.applet.Applet appletArgument2, String stringArgument3) throws Throwable {
        netscape.javascript.JSObject.getWindow(appletArgument2).eval(stringArgument3);
        if (byteArgument1 != -51) {
          return;
        }
    }

    final static Object callWithArguments(String stringArgument1, int integerArgument2, java.applet.Applet appletArgument3, Object[] objectArrayArgument4) throws Throwable {
        if (integerArgument2 != -14541) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(appletArgument3).call(stringArgument1, objectArrayArgument4);
    }

    final static Object callWithoutArguments(boolean booleanArgument1, String stringArgument2, java.applet.Applet appletArgument3) throws Throwable {
        if (!booleanArgument1) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(appletArgument3).call(stringArgument2, (Object[]) null);
    }
}
