/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud {
    static String field_d;
    static String[] field_a;
    static String field_b;
    static boolean[] field_c;

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_a = null;
        field_c = null;
        if (param0 <= 126) {
            field_c = null;
        }
    }

    final static void a(int param0, qb param1, Object param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1.field_q == null) {
          return;
        } else {
          if (param0 < -20) {
            var3_int = 0;
            L0: while (true) {
              L1: {
                if (50 <= var3_int) {
                  break L1;
                } else {
                  if (null == param1.field_q.peekEvent()) {
                    break L1;
                  } else {
                    jb.a((byte) -113, 1L);
                    var3_int++;
                    continue L0;
                  }
                }
              }
              try {
                if (param2 != null) {
                  param1.field_q.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
                } else {
                  return;
                }
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Try changing the '<%0>' setting.";
        field_b = "You have offered a Non-Aggression Pact to <%0>.";
        field_c = new boolean[64];
        field_a = new String[]{"Hammer Blow", "Crushing Assault", "Decisive Strike", "Valiant Defence", "Unchecked Expansion", "Rapid Expansion", "Explosive Growth", "Man of Peace", "Total War", "Coordinated Assault", "Historian", "Lightning War", "Historical Footnote", "Renowned Leader", "Legendary Leader", "Feared Warlord", "Fabled Emperor", "Unassailable Grip", "Vast Empire", "Archaeologist", "Master Tactician", "Thronecrusher", "Man of Science", "New Galactic Order", "Oracle of Time"};
    }
}
