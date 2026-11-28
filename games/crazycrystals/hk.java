/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class hk extends pb {
    static jp field_d;
    static PcmSample field_e;

    hk() {
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        LevelProgressUpdate var4 = null;
        pp var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = CrazyCrystals.field_B;
        try {
          var4 = (LevelProgressUpdate) (TextLayout.field_b.beginForward(32073));
          while (var4 != null) {
            pm.a(param1, var4, (byte) 71);
            var4 = (LevelProgressUpdate) (TextLayout.field_b.nextForward(false));
          }
          if (param0 != 5) {
            hk.clearDeclaredStaticReferences(72);
          }
          var5 = (pp) (NameSuggestionsPanel.field_A.beginForward(param0 ^ 32076));
          while (var5 != null) {
            ArchiveSourceManager.a(param1, var5, (byte) 113);
            var5 = (pp) (NameSuggestionsPanel.field_A.nextForward(false));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.wrapClientException((Throwable) ((Object) var2), "hk.J(" + param0 + ',' + param1 + ')');
        }
    }

    final int a(byte param0, boolean param1) {
        if (param0 >= -53) {
          field_e = (PcmSample) null;
          return 30;
        }
        return 30;
    }

    final void a(boolean param0, ta param1, boolean param2) {
        try {
          if (param0) {
            this.a(-126, -48);
          }
          param1.field_g = param1.field_g + 1;
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "hk.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void clearDeclaredStaticReferences(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != 6388) {
          field_e = (PcmSample) null;
        }
    }

    final int a(int param0, int param1) {
        if (param0 == 1843275042) {
          return vm.field_j[param1].size();
        }
        ta var4 = (ta) null;
        this.a(true, (ta) null, false);
        return vm.field_j[param1].size();
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          RuntimeException stackIn_6_0 = null;
          StringBuilder stackIn_6_1 = null;
          String stackIn_7_2 = null;
          Throwable decompiledCaughtException = null;
          int var2_int = 0;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          java.net.URL var3 = null;
          String var4 = null;
          try {
            try {
              var2_int = -109 / ((59 - param0) / 33);
              var3 = param1.getCodeBase();
              var4 = gh.a(param1, var3, (byte) 67).getFile();
              JavaScriptBridge.callWithArguments(-3729, "updatelinks", param1, new Object[]{"home", var4 + "home.ws"});
              JavaScriptBridge.callWithArguments(-3729, "updatelinks", param1, new Object[]{"gamelist", var4 + "togamelist.ws"});
              JavaScriptBridge.callWithArguments(-3729, "updatelinks", param1, new Object[]{"serverlist", var4 + "toserverlist.ws"});
              JavaScriptBridge.callWithArguments(-3729, "updatelinks", param1, new Object[]{"options", var4 + "options.ws"});
              JavaScriptBridge.callWithArguments(-3729, "updatelinks", param1, new Object[]{"terms", var4 + "terms.ws"});
              JavaScriptBridge.callWithArguments(-3729, "updatelinks", param1, new Object[]{"privacy", var4 + "privacy.ws"});
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_6_0 = var2_ref;
            stackIn_6_1 = new StringBuilder().append("hk.E(").append(param0).append(',');
            if (param1 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            throw dn.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_d = new jp();
    }
}
