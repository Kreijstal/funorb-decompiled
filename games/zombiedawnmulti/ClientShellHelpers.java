/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientShellHelpers {
    static int[] field_a;
    static String field_c;
    static String field_d;
    static volatile int field_b;

    final static PortalEntryEvent obtainPortalEntryEvent(int param0, byte param1, int param2, int param3) {
        PortalEntryEvent var4 = null;
        PortalEntryEvent var4Lifetime1;
        if (param1 < -35) {
          var4 = (PortalEntryEvent) (StateIconLabel.field_Kb.removeLast(72));
          if (var4 == null) {
            var4 = new PortalEntryEvent();
          }
          var4.setEventData(false, param2, param0, param3);
          return var4;
        }
        java.applet.Applet var5 = (java.applet.Applet) null;
        ClientShellHelpers.updatePageLinks(88, (java.applet.Applet) null);
        var4Lifetime1 = (PortalEntryEvent) (StateIconLabel.field_Kb.removeLast(72));
        if (var4Lifetime1 == null) {
          var4Lifetime1 = new PortalEntryEvent();
        }
        var4Lifetime1.setEventData(false, param2, param0, param3);
        return var4Lifetime1;
    }

    final static void closeGameSocket(byte param0) {
        if (param0 <= -110) {
          if (null != SpriteHotspot.field_h) {
            SpriteHotspot.field_h.close(-71);
            SpriteHotspot.field_h = null;
          }
          return;
        }
        field_b = 43;
        if (null != SpriteHotspot.field_h) {
          SpriteHotspot.field_h.close(-71);
          SpriteHotspot.field_h = null;
        }
    }

    final static int pollAccountDialogResult(int param0, int param1, boolean param2, int param3) {
        if (param1 != -5) {
          field_a = (int[]) null;
          return MiasmaParticle.pollLoginDialogResult(false);
        }
        return MiasmaParticle.pollLoginDialogResult(false);
    }

    final static void updatePageLinks(int param0, java.applet.Applet param1) {
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
              var3 = DebouncedValidationProvider.applySessionOverridesToUrl(param1, true, var4).getFile();
              JavaScriptBridge.callFunctionWithArgs(param1, "updatelinks", (byte) 23, new Object[]{"home", var3 + "home.ws"});
              JavaScriptBridge.callFunctionWithArgs(param1, "updatelinks", (byte) 23, new Object[]{"gamelist", var3 + "togamelist.ws"});
              if (param0 != 14158) {
                field_a = (int[]) null;
              }
              JavaScriptBridge.callFunctionWithArgs(param1, "updatelinks", (byte) 23, new Object[]{"serverlist", var3 + "toserverlist.ws"});
              JavaScriptBridge.callFunctionWithArgs(param1, "updatelinks", (byte) 23, new Object[]{"options", var3 + "options.ws"});
              JavaScriptBridge.callFunctionWithArgs(param1, "updatelinks", (byte) 23, new Object[]{"terms", var3 + "terms.ws"});
              JavaScriptBridge.callFunctionWithArgs(param1, "updatelinks", (byte) 23, new Object[]{"privacy", var3 + "privacy.ws"});
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
            stackIn_8_1 = new StringBuilder().append("ak.F(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 == -5937) {
          field_c = null;
          field_a = null;
          field_d = null;
          return;
        }
        field_a = (int[]) null;
        field_c = null;
        field_a = null;
        field_d = null;
    }

    final static void drawPanelFrame(int param0, int param1, int param2, int param3, int param4) {
        InfectionEvent.field_j.drawTiledHorizontally(param3, param4, param0);
        SimHuman.field_fb.drawTiledVertically(param3, param4, param1);
        IntroScreen.field_p.drawTiledHorizontally(param3, -5 + param1 + param4, param0);
        GradientOutlineTextPainter.field_s.drawTiledVertically(param0 + param3 - 5, param4, param1);
        PlayerProfile.field_r[0].drawOpaque(param3, param4);
        PlayerProfile.field_r[1].drawOpaque(param0 + param3 - 5, param4);
        PlayerProfile.field_r[2].drawOpaque(param3, param2 + param4 + param1);
        PlayerProfile.field_r[3].drawOpaque(param3 + param0 - 5, -5 + param4 + param1);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = new int[12];
        field_c = "Join";
        field_b = 0;
        field_d = "Offering rematch";
    }
}
