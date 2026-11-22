/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    static String field_b;
    static ak field_a;

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Main.field_T;
        try {
          var1 = sj.field_d;
          synchronized (var1) {
            ab.field_t = DelegatingCanvas.field_b;
            mh.field_b = mh.field_b + 1;
            if (AccountCreationResultPanel.field_rb < 0) {
              for (var2 = 0; 112 > var2; var2++) {
                GzipInflater.field_c[var2] = false;
              }
              AccountCreationResultPanel.field_rb = KeyboardInputHandler.field_b;
            } else {
              while (AccountCreationResultPanel.field_rb != KeyboardInputHandler.field_b) {
                var2 = oc.field_h[KeyboardInputHandler.field_b];
                KeyboardInputHandler.field_b = 127 & KeyboardInputHandler.field_b + 1;
                if (0 <= var2) {
                  GzipInflater.field_c[var2] = true;
                  continue;
                }
                GzipInflater.field_c[~var2] = false;
              }
            }
            DelegatingCanvas.field_b = sa.field_b;
          }
          if (param0 < -123) {
            return;
          }
          field_a = (ak) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var1_ref), "i.A(" + param0 + ')');
        }
    }

    public static void clearStaticReferences(int param0) {
        field_a = null;
        field_b = null;
        if (param0 >= 40) {
          return;
        }
        field_a = (ak) null;
    }

    static {
        field_b = "This password is part of your Player Name, and would be easy to guess";
    }
}
