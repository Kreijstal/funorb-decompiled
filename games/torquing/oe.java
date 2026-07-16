/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static int field_a;
    static int field_b;

    final static void a(vh param0, int param1, Object param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Torquing.field_u;
        if (param0.field_p == null) {
          return;
        } else {
          var3_int = param1;
          L0: while (true) {
            L1: {
              if ((var3_int ^ -1) <= -51) {
                break L1;
              } else {
                if (null == param0.field_p.peekEvent()) {
                  break L1;
                } else {
                  ub.a(param1 + 1976, 1L);
                  var3_int++;
                  continue L0;
                }
              }
            }
            try {
              L2: {
                L3: {
                  if (param2 != null) {
                    param0.field_p.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L2;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
            return;
          }
        }
    }

    final static void a(int param0, byte param1) {
        eg.field_u = 1000000000L / (long)param0;
        if (param1 != 44) {
            field_a = -12;
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (param2) {
            return;
        }
        ik var4 = new ik(qo.field_t, bl.field_d);
        ik var3 = var4;
        if (param0) {
            var4.field_l = -var4.field_s[0] + param1 << -1774928158;
            var3.field_p = -2;
        }
        qc.field_Y.a((byte) 54, (q) (Object) var3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 9;
    }
}
