/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static String field_d;
    static int field_c;
    static eq field_a;
    static UiComponent field_b;
    static boolean field_f;
    static String[][] field_e;

    final static void setSoundEffectVolume(int param0, int param1) {
        we var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        we var2Lifetime1;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          db.field_c = param1;
          var2 = (we) (GameKeyHandler.field_e.last(72));
          while (var2 != null) {
            if (!var2.field_h.isLinked(param0 ^ 3277)) {
              var2.unlink(true);
            } else {
              var2.field_f.setInternalVolume(128 + var2.field_m * db.field_c >> 8);
            }
            var2 = (we) (GameKeyHandler.field_e.previous(6));
          }
          if (param0 != 3273) {
            tj.setSoundEffectVolume(30, 48);
          }
          if (null == wc.field_K) {
            return;
          }
          var2Lifetime1 = (we) (wc.field_K.last(119));
          while (var2Lifetime1 != null) {
            if (var2Lifetime1.field_h.isLinked(param0 ^ 3277)) {
              var2Lifetime1.field_f.setInternalVolume(128 + db.field_c * var2Lifetime1.field_m >> 8);
            } else {
              var2Lifetime1.unlink(true);
            }
            var2Lifetime1 = (we) (wc.field_K.previous(6));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2_ref), "tj.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_d = null;
        field_a = null;
        field_e = (String[][]) null;
        field_b = null;
        if (param0) {
          tj.releaseStatics(true);
        }
    }

    static {
        field_d = "Solicitation";
        field_c = -1;
        field_e = new String[][]{new String[]{"Mall", "Power Plant", "Precinct", "White House", "Random"}, new String[]{}};
    }
}
