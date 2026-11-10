/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PortalEntryEvent extends GameEvent {
    static String field_l;
    static String field_o;
    private int field_p;
    static String field_n;
    private int field_q;
    static String field_k;
    static String field_j;
    static int field_i;
    static GameWorld field_m;

    final void removeFromQueue(byte param0) {
        super.removeFromQueue((byte) -54);
        StateIconLabel.field_Kb.addFirst((IntrusiveNode) (this), false);
        if (param0 > -47) {
          field_l = (String) null;
        }
    }

    final static void updateDialogLayer(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 != 2) {
            field_l = (String) null;
          }
          if (!PortalEntryEvent.hasOpenDialog(120)) {
            if (FullscreenSupport.field_f != null &&
              FullscreenSupport.field_f.field_e) {
              FullscreenSupport.exitActiveFullscreen(param0 ^ -79);
              SoundCache.field_k.showDialog(3016, new FullscreenErrorDialog(SoundCache.field_k, LobbyStateHelpers.field_b));
            }
            return;
          }
          SoundCache.field_k.processPointerFrame(UpgradeAccessHelpers.field_g, (byte) -27, ScoreUpdateEvent.field_j, true);
          SoundCache.field_k.advanceDialogs((byte) -109);
          while (MusicPatchPcmStream.pollKeyEvent(-1)) {
            SoundCache.field_k.dispatchKeyInput(param0 - 2, ArchiveAvailabilityHelpers.field_d, InfectionEvent.field_p);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "op.G(" + param0 + ')');
        }
    }

    final static String chooseDiscardPrompt(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        if (param2 == 4) {
          if (param1) {
            var4 += 4;
          }
          if (param0) {
            var4 += 2;
          }
          if (param3) {
            var4++;
          }
          return ByteStorage.field_f[var4];
        }
        return (String) null;
    }

    final void drawDebugOverlay(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
          GameScreen var6 = (GameScreen) null;
          this.apply(-70, (GameScreen) null);
        }
    }

    final void setEventData(boolean param0, int param1, int param2, int param3) {
        if (!param0) {
          super.setTick(0, param1);
          this.field_p = param2;
          this.field_q = param3;
          return;
        }
        field_n = (String) null;
        super.setTick(0, param1);
        this.field_p = param2;
        this.field_q = param3;
    }

    private final static boolean hasOpenDialog(int param0) {
        int var1 = -19 / ((70 - param0) / 45);
        if (SoundCache.field_k == null) {
          return false;
        }
        if (SoundCache.field_k.getActiveDialog((byte) -122) != null) {
          return true;
        }
        return false;
    }

    final void apply(int param0, GameScreen param1) {
        try {
          param1.onUnitEnteredPortal(this.field_p, (byte) 127, this.field_q);
          if (param0 != 0) {
            this.field_p = -21;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "op.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_o = null;
        field_l = null;
        field_m = null;
        field_j = null;
        field_n = null;
        if (param0 == -9) {
          field_k = null;
          return;
        }
        PortalEntryEvent.hasOpenDialog(-97);
        field_k = null;
    }

    PortalEntryEvent() {
    }

    static {
        field_o = "Disruptive behaviour";
        field_k = "Options";
        field_j = "Melt a zombie into a puddle of goo that will slow down humans. Makes humans a lot easier to catch.";
        field_l = "Please wait...";
        field_n = "<%0> is not a member, and cannot play with the current options.";
        field_i = -1;
    }
}
