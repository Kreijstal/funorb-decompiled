/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class IndexedSpriteState {
    int field_a;
    int field_h;
    int field_c;
    static LoginMethodPreference field_e;
    int field_d;
    int field_b;
    int field_j;
    static volatile boolean field_i;
    static String field_g;
    static String field_f;

    final static void a(int param0) {
        if (param0 < 21) {
          return;
        }
        LoginCredentials.a((byte) -99);
        jc.a((byte) 100, 4);
    }

    abstract void draw(int param0, int param1);

    final static LoginMethodPreference a(java.applet.Applet param0, byte param1) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        LoginMethodPreference[] var3 = null;
        LoginMethodPreference var5 = null;
        int var6 = 0;
        LoginMethodPreference stackIn_4_0 = null;
        LoginMethodPreference stackIn_12_0 = null;
        LoginMethodPreference stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = wizardrun.field_H;
        try {
          var2 = DiskCacheStore.a("jagex-last-login-method", param0, 0);
          if (var2 == null) {
            stackIn_4_0 = ra.field_j;
            return stackIn_4_0;
          }
          if (param1 != 48) {
            field_i = true;
          }
          var3 = ValidatedTextField.l((byte) 100);
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5.matchesLoginMethod(var2, 126)) {
              stackIn_12_0 = var5;
              return stackIn_12_0;
            }
          }
          stackIn_15_0 = ra.field_j;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_18_0 = var2_ref;
          stackIn_18_1 = new StringBuilder().append("jf.B(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract void drawAlpha(int param0, int param1, int param2);

    final static void a(byte param0, java.applet.Applet param1) {
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
              var4 = param1.getCodeBase();
              if (param0 <= 5) {
                field_g = (String) null;
              }
              var3 = jl.a(-101, var4, param1).getFile();
              BrowserScriptBridge.call(new Object[]{"home", var3 + "home.ws"}, "updatelinks", 30383, param1);
              BrowserScriptBridge.call(new Object[]{"gamelist", var3 + "togamelist.ws"}, "updatelinks", 30383, param1);
              BrowserScriptBridge.call(new Object[]{"serverlist", var3 + "toserverlist.ws"}, "updatelinks", 30383, param1);
              BrowserScriptBridge.call(new Object[]{"options", var3 + "options.ws"}, "updatelinks", 30383, param1);
              BrowserScriptBridge.call(new Object[]{"terms", var3 + "terms.ws"}, "updatelinks", 30383, param1);
              BrowserScriptBridge.call(new Object[]{"privacy", var3 + "privacy.ws"}, "updatelinks", 30383, param1);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("jf.F(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          IndexedSpriteState.a(-100);
        }
        field_f = null;
        field_e = null;
        field_g = null;
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        if (param0) {
          return;
        }
        try {
          ResourceArchive.attachKeyboardListeners(0, (java.awt.Component) ((Object) param1));
          IterableNodeHashTable.attachMouseListeners((java.awt.Component) ((Object) param1), 98);
          if (MessagePanel.field_K != null) {
            MessagePanel.field_K.b((java.awt.Component) ((Object) param1), -1);
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "jf.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = false;
        field_e = new LoginMethodPreference("usename");
        field_g = "Waiting for instruments";
    }
}
