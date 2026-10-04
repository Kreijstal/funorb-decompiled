/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ByteStorage {
    static ValidationState field_d;
    static long updatePeriodNanoseconds;
    static String loadingExtraDataText;
    static int retainedTextRecordCount;
    static String accountCreationPassword;

    final static void a(java.applet.Applet param0, int param1) {
        try {
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            try {
              try {
                var4 = param0.getCodeBase();
                if (param1 != 20000000) {
                  ByteStorage.a(-109);
                }
                var3 = SessionGameApplet.a(var4, param1 - 19999938, param0).getFile();
                AppletJavaScriptBridge.callWithArguments(param1 - 20014882, new Object[]{"home", var3 + "home.ws"}, param0, "updatelinks");
                AppletJavaScriptBridge.callWithArguments(-14882, new Object[]{"gamelist", var3 + "togamelist.ws"}, param0, "updatelinks");
                AppletJavaScriptBridge.callWithArguments(-14882, new Object[]{"serverlist", var3 + "toserverlist.ws"}, param0, "updatelinks");
                AppletJavaScriptBridge.callWithArguments(param1 - 20014882, new Object[]{"options", var3 + "options.ws"}, param0, "updatelinks");
                AppletJavaScriptBridge.callWithArguments(-14882, new Object[]{"terms", var3 + "terms.ws"}, param0, "updatelinks");
                AppletJavaScriptBridge.callWithArguments(-14882, new Object[]{"privacy", var3 + "privacy.ws"}, param0, "updatelinks");
                return;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = decompiledCaughtException;
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_8_0 = var2_ref;
              stackIn_8_1 = new StringBuilder().append("oj.F(");
              if (param0 == null) {
                stackIn_9_2 = "null";
              } else {
                stackIn_9_2 = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_d = null;
        accountCreationPassword = null;
        if (param0 > -50) {
            return;
        }
        loadingExtraDataText = null;
    }

    final static void a(int param0, byte param1) {
        DequeCursor.a(-1);
        if (param1 >= -89) {
            ByteStorage.a(70);
        }
    }

    abstract byte[] copyToByteArray(byte copyGuard);

    abstract void initializeStorage(byte[] sourceBytes, boolean populateBuffer);

    static {
        field_d = new ValidationState();
        loadingExtraDataText = "Loading extra data";
        updatePeriodNanoseconds = 20000000L;
    }
}
