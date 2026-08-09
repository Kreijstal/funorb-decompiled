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
            field_c = (boolean[]) null;
        }
    }

    final static void a(int param0, qb param1, Object param2) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1.field_q == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 < -20) {
                var3_int = 0;
                L1: while (true) {
                  L2: {
                    if (50 <= var3_int) {
                      break L2;
                    } else {
                      if (null == param1.field_q.peekEvent()) {
                        break L2;
                      } else {
                        jb.a((byte) -113, 1L);
                        var3_int++;
                        continue L1;
                      }
                    }
                  }
                  try {
                    L3: {
                      if (param2 != null) {
                        param1.field_q.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
                        break L3;
                      } else {
                        return;
                      }
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3 = (Exception) (Object) decompiledCaughtException;
                    return;
                  }
                  return;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("ud.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_d = "Try changing the '<%0>' setting.";
        field_b = "You have offered a Non-Aggression Pact to <%0>.";
        field_c = new boolean[64];
        field_a = new String[]{"Hammer Blow", "Crushing Assault", "Decisive Strike", "Valiant Defence", "Unchecked Expansion", "Rapid Expansion", "Explosive Growth", "Man of Peace", "Total War", "Coordinated Assault", "Historian", "Lightning War", "Historical Footnote", "Renowned Leader", "Legendary Leader", "Feared Warlord", "Fabled Emperor", "Unassailable Grip", "Vast Empire", "Archaeologist", "Master Tactician", "Thronecrusher", "Man of Science", "New Galactic Order", "Oracle of Time"};
    }
}
