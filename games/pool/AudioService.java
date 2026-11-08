/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AudioService implements Runnable {
    volatile AudioOutput[] outputs;
    PlatformTaskDispatcher tasks;
    volatile boolean running;
    static String muOptionsDontmind;
    static int field_f;
    static AsyncRequest field_c;
    static Sprite field_a;
    static String loadingSoundeffects;
    volatile boolean stopRequested;

    final static void collapseComponentHeights(UiComponent component, byte obfuscationGuard) {
        UiComponent var3 = null;
        UiComponent var2 = null;
        UiComponent var2Lifetime1;
        try {
          if (obfuscationGuard != 109) {
            field_f = 43;
          }
          var3 = (UiComponent) (component.children.last((byte) -74));
          var2 = var3;
          while (var3 != null) {
            var3.height = 0;
            var3.remainingHeight = 0;
            var3.localY = 0;
            var3.remainingY = 0;
            var3 = (UiComponent) (component.children.previous((byte) -5));
            var2Lifetime1 = var3;
          }
          component.height = 0;
          component.localY = 0;
          component.remainingY = 0;
          component.remainingHeight = 0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "mq.A(" + (component != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final static void drawTransientInterface(int obfuscationGuard, boolean active) {
        if (null != CacheEntry.field_B) {
          MeshColorSupport.a(CacheEntry.field_B, 1259627265);
        }
        if (PlasmaBallSkin.field_m != null) {
          PlasmaBallSkin.field_m.draw(active, 12887);
        }
        LoginPayload.drawNamePopup(-113, active);
        if (obfuscationGuard != 0) {
          field_f = 63;
        }
        if (AccountMenuText.field_b != null) {
          AccountMenuText.field_b.drawRoot((byte) -79, active);
        }
        PacketDiagnosticsSupport.a(48, active);
    }

    public final void run() {
        int var1_int = 0;
        AudioOutput var2 = null;
        int var4 = Pool.field_O;
        this.running = true;
        try {
          while (!this.stopRequested) {
            for (var1_int = 0; var1_int < 2; var1_int++) {
              var2 = this.outputs[var1_int];
              if (var2 != null) {
                var2.serviceOutput();
              }
            }
            SoundCache.sleepMillis(-105, 10L);
            AwtEventQueueSupport.pumpAwtEventQueue((Object) null, this.tasks, 120);
          }
        } catch (Exception exception) {
          String var5 = (String) null;
          GrowableIntList.reportClientError((Throwable) ((Object) exception), (String) null, -8555);
        } finally {
          this.running = false;
        }
    }

    AudioService() {
        this.outputs = new AudioOutput[2];
        this.stopRequested = false;
        this.running = false;
    }

    public static void releaseStatics(boolean param0) {
        loadingSoundeffects = null;
        if (param0) {
          return;
        }
        muOptionsDontmind = null;
        field_a = null;
        field_c = null;
    }

    static {
        muOptionsDontmind = "Don't mind";
        loadingSoundeffects = "Loading sound effects";
    }
}
