/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    static byte[][][] field_a;
    static sg[] field_d;
    static int field_b;
    static int[] field_c;

    final static void a(boolean param0, java.applet.Applet param1) {
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
              if (param0) {
                return;
              }
              var4 = param1.getCodeBase();
              var3 = gf.a(3, var4, param1).getFile();
              JavaScriptBridge.callWithArguments(param1, 22347, "updatelinks", new Object[]{"home", var3 + "home.ws"});
              JavaScriptBridge.callWithArguments(param1, 22347, "updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"});
              JavaScriptBridge.callWithArguments(param1, 22347, "updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"});
              JavaScriptBridge.callWithArguments(param1, 22347, "updatelinks", new Object[]{"options", var3 + "options.ws"});
              JavaScriptBridge.callWithArguments(param1, 22347, "updatelinks", new Object[]{"terms", var3 + "terms.ws"});
              JavaScriptBridge.callWithArguments(param1, 22347, "updatelinks", new Object[]{"privacy", var3 + "privacy.ws"});
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
            stackIn_8_1 = new StringBuilder().append("vg.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void resetStaticState(int param0) {
        field_a = (byte[][][]) null;
        if (param0 != 0) {
          field_b = -79;
          field_c = null;
          field_d = null;
          return;
        }
        field_c = null;
        field_d = null;
    }

    final static void a(int param0) {
        ug.field_A.closeAllDialogs(0);
        if (param0 <= 100) {
          field_b = 110;
          if (StandardContentDialog.field_fb == null) {
            StandardContentDialog.field_fb = new ProgressDialog(ug.field_A, jj.field_d);
            ug.field_A.showDialog(-14579, StandardContentDialog.field_fb);
            return;
          }
          ug.field_A.showDialog(-14579, StandardContentDialog.field_fb);
          return;
        }
        if (StandardContentDialog.field_fb != null) {
          ug.field_A.showDialog(-14579, StandardContentDialog.field_fb);
          return;
        }
        StandardContentDialog.field_fb = new ProgressDialog(ug.field_A, jj.field_d);
        ug.field_A.showDialog(-14579, StandardContentDialog.field_fb);
    }

    static int bitwiseAnd(int param0, int param1) {
        return param0 & param1;
    }

    static {
        field_d = new sg[15];
        field_c = new int[8192];
        field_b = 0;
    }
}
