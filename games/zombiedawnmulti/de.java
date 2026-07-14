/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de {
    static ul field_e;
    static ip field_h;
    static int[] field_c;
    static qh field_b;
    static cj field_f;
    static String field_a;
    static String field_d;
    static volatile int field_g;

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        if (param0 != 19091) {
          de.a(-77);
          field_e = null;
          field_h = null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_e = null;
          field_h = null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    final static void a(go param0, byte param1, Object param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null == param0.field_j) {
          return;
        } else {
          L0: {
            if (param1 == 99) {
              break L0;
            } else {
              de.a(-110);
              break L0;
            }
          }
          var3_int = 0;
          L1: while (true) {
            L2: {
              if (50 <= var3_int) {
                break L2;
              } else {
                if (param0.field_j.peekEvent() == null) {
                  break L2;
                } else {
                  vd.a(false, 1L);
                  var3_int++;
                  continue L1;
                }
              }
            }
            try {
              if (param2 != null) {
                param0.field_j.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
        field_h = new ip();
        field_a = "Play the game without logging in just yet";
        field_d = "This entry doesn't match";
        field_g = 0;
    }
}
