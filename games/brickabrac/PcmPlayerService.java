/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmPlayerService implements Runnable {
    volatile boolean running;
    volatile boolean stopRequested;
    PlatformServices platformServices;
    volatile PcmPlayer[] players;
    static int field_e;
    private static String failureContext;

    public final void run() {
        int playerIndex = 0;
        PcmPlayer player = null;
        int unusedGameFlag = 0;
        Object unusedEventSource = null;
        int exitRoute = 0;
        int completionRoute = 0;
        Throwable caughtFailure = null;
        Exception workerFailure = null;
        RuntimeException runtimeFailure = null;
        Throwable fatalFailure = null;
        String unusedReportMessage = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          this.running = true;
          try {
            try {
              while (!this.stopRequested) {
                for (playerIndex = 0; playerIndex < 2; playerIndex++) {
                  player = this.players[playerIndex];
                  if (player != null) {
                    player.pump();
                  }
                }
                wj.sleepMillis(-128, 10L);
                unusedEventSource = (Object) null;
                IntNode.pumpPlatformEvents(-4317, this.platformServices, (Object) null);
              }
              exitRoute = 0;
            } catch (java.lang.Exception caughtWorkerFailure) {
              caughtFailure = caughtWorkerFailure;
              workerFailure = (Exception) (Object) caughtFailure;
              unusedReportMessage = (String) null;
              AlignedIconLabel.a((String) null, (Throwable) ((Object) workerFailure), 96);
              exitRoute = 1;
            }
            if (exitRoute == 0) {
              completionRoute = 0;
            } else {
              completionRoute = 1;
            }
          } catch (java.lang.Throwable caughtFatalFailure) {
            caughtFailure = caughtFatalFailure;
            fatalFailure = caughtFailure;
            this.running = false;
            throw PcmPlayerService.<RuntimeException>$cfr$sneakyThrow(fatalFailure);
          }
          if (completionRoute == 0) {
            this.running = false;
          } else {
            this.running = false;
          }
          return;
        } catch (java.lang.RuntimeException caughtRuntimeFailure) {
          caughtFailure = caughtRuntimeFailure;
          runtimeFailure = (RuntimeException) (Object) caughtFailure;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeFailure), failureContext);
        }
    }

    PcmPlayerService() {
        this.players = new PcmPlayer[2];
        this.stopRequested = false;
        this.running = false;
    }

    static {
        failureContext = "aq.run()";
        field_e = 98;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
