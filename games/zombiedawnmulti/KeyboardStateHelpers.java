/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KeyboardStateHelpers {
    static String field_e;
    static int field_c;
    static String field_b;
    static UiComponent field_d;
    static String[] field_a;

    final static void pollKeyboardState(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var1 = ClickMarkerParticle.field_c;
          synchronized (var1) {
            ReflectionCheckRequest.field_j = FriendListHelpers.field_j;
            BirthDateInputWidget.field_cb = BirthDateInputWidget.field_cb + 1;
            if (0 > TextPopupHelpers.field_f) {
              for (var2 = 0; var2 < 112; var2++) {
                PulseEffect.field_m[var2] = false;
              }
              TextPopupHelpers.field_f = NavigationGrid.field_j;
            } else {
              while (NavigationGrid.field_j != TextPopupHelpers.field_f) {
                var2 = SecondaryNodeDequeIterator.field_f[NavigationGrid.field_j];
                NavigationGrid.field_j = NavigationGrid.field_j + 1 & 127;
                if (var2 < 0) {
                  PulseEffect.field_m[~var2] = false;
                  continue;
                }
                PulseEffect.field_m[var2] = true;
              }
            }
            FriendListHelpers.field_j = NodeHashTable.field_c;
          }
          var1_int = -88 % ((param0 + 17) / 55);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1_ref), "ik.B(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        field_b = null;
        field_e = null;
        if (param0 <= 37) {
          return;
        }
        field_d = null;
    }

    static {
        field_b = "This research item is only available to FunOrb members. See the 'Account' section of the website for details.";
        field_e = "<%0> cannot join; the game is full.";
    }
}
