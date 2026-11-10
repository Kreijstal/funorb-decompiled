/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KeyStateHelpers {
    static String field_c;
    static StationaryRifleman field_d;
    static int field_a;
    static boolean field_e;
    static int field_b;

    public static void releaseStatics(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != 127) {
          field_a = -74;
        }
    }

    final static void resetTrafficBounds(byte param0) {
        if (param0 < 116) {
          field_d = (StationaryRifleman) null;
        }
        DialWidget.field_H = Js5Archive.field_e.navigation.width + 300;
        AreaSelectionScreen.field_t = -300;
    }

    final static void snapshotKeyState(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        int var5 = 0;
        var4 = ZombieDawn.field_J;
        try {
          if (param0 != 27914) {
            KeyStateHelpers.releaseStatics(-110);
          }
          var1 = KeyHandlerHolder.field_c;
          synchronized (var1) {
            AchievementsScreen.field_s = AchievementsScreen.field_s + 1;
            LoginDialogGlobals.field_e = FunOrbApplet.field_y;
            if (LoginPanel.field_F < 0) {
              var5 = 0;
              var2 = var5;
              while (var5 < 112) {
                AchievementSubmission.field_p[var5] = false;
                var5++;
              }
              LoginPanel.field_F = MouseWheelInput.field_d;
            } else {
              while (LoginPanel.field_F != MouseWheelInput.field_d) {
                var2 = PacketRequestHelpers.field_c[MouseWheelInput.field_d];
                MouseWheelInput.field_d = 127 & 1 + MouseWheelInput.field_d;
                if (var2 >= 0) {
                  AchievementSubmission.field_p[var2] = true;
                  continue;
                }
                AchievementSubmission.field_p[~var2] = false;
              }
            }
            FunOrbApplet.field_y = OffsetHelpers.field_c;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var1_ref), "ha.B(" + param0 + ')');
        }
    }

    static {
        field_d = null;
        field_c = "Select Level";
        field_b = 0;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void resetTrafficBoundsIntArgs(int param0) {
        if (param0 < 116) {
          field_d = (StationaryRifleman) null;
        }
        DialWidget.field_H = Js5Archive.field_e.navigation.width + 300;
        AreaSelectionScreen.field_t = -300;
    }
}
