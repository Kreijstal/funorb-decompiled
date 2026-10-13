/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmPlayerService implements Runnable {
    static boolean clientShutdownStarted;
    volatile boolean stopRequested;
    volatile boolean running;
    PlatformTaskService platformTasks;
    static int decodedPrivateMessageIdHigh16;
    volatile PcmPlayer[] players;
    static String ratingLabel;

    public static void releaseLabels(int obfuscationGuard) {
        ratingLabel = null;
        int guardRemainder = -117 % ((obfuscationGuard - 45) / 36);
    }

    public final void run() {
        int playerIndex = 0;
        PcmPlayer player = null;
        int unusedObfuscationControl = 0;
        int loopExitKind = 0;
        Throwable caughtFailure = null;
        Exception reportedFailure = null;
        Throwable escapingFailure = null;
        Object eventSource = null;
        String reportMessage = null;
        unusedObfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
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
              SpriteButtonPainter.a(10L, 0);
              eventSource = (Object) null;
              MapTile.a(this.platformTasks, (Object) null, true);
            }
            loopExitKind = 0;
          } catch (java.lang.Exception workerFailure) {
            caughtFailure = workerFailure;
            reportedFailure = (Exception) (Object) caughtFailure;
            reportMessage = (String) null;
            af.a((Throwable) ((Object) reportedFailure), 98, (String) null);
            loopExitKind = 1;
          }
          if (loopExitKind == 0) {
          } else {
          }
        } catch (java.lang.Throwable fatalFailure) {
          caughtFailure = fatalFailure;
          escapingFailure = caughtFailure;
          this.running = false;
          throw PcmPlayerService.<RuntimeException>throwUnchecked(escapingFailure);
        }
        this.running = false;
    }

    PcmPlayerService() {
        this.players = new PcmPlayer[2];
        this.stopRequested = false;
        this.running = false;
    }

    static {
        clientShutdownStarted = false;
        ratingLabel = "Rating";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException throwUnchecked(Throwable failure) throws T {
        throw (T) failure;
    }
}
