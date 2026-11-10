/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QueuedByteRecord extends IntrusiveNode {
    static int field_j;
    int field_i;
    int field_h;

    final static void serviceAudio(int param0) {
        TrackedSoundStream var1 = null;
        int var2 = ZombieDawn.field_J;
        TrackedSoundStream var1Lifetime1;
        try {
          ExceptionWrapper.field_d.serviceOutput();
          LoginDialog.field_fb.serviceOutput();
          if (param0 > -30) {
            field_j = 75;
          }
          TutorialTipHelpers.field_b = TutorialTipHelpers.field_b - 1;
          if (TutorialTipHelpers.field_b == 0) {
            TutorialTipHelpers.field_b = 200;
            var1 = (TrackedSoundStream) (MatchingTextValidator.field_i.last((byte) 26));
            while (var1 != null) {
              if (!var1.field_k.isLinked((byte) 73)) {
                var1.unlink(-27598);
              }
              var1 = (TrackedSoundStream) (MatchingTextValidator.field_i.previous(false));
            }
            if (BufferedFile.field_n != null) {
              var1Lifetime1 = (TrackedSoundStream) (BufferedFile.field_n.last((byte) 26));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_k.isLinked((byte) 73)) {
                  var1Lifetime1.unlink(-27598);
                }
                var1Lifetime1 = (TrackedSoundStream) (BufferedFile.field_n.previous(false));
              }
            }
          }
          if (PowerupBar.field_o != null &&
            !PowerupBar.field_o.isReady((byte) -34)) {
            Alien.field_kb = null;
            return;
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "mg.A(" + param0 + ')');
        }
    }

    final static void initializeDialogLayer(boolean param0) {
        ProxySocketConnector.field_j = BlastParticle.getSharedUiTheme(0);
        CivilianHuman.field_xb = new DialogLayer();
        if (param0) {
          return;
        }
        BitmapTextLayout.openScreenSizeDialog((byte) 122);
    }

    private QueuedByteRecord() throws Throwable {
        throw new Error();
    }

    static {
        field_j = 64;
    }
}
