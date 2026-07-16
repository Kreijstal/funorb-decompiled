/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static re field_c;
    static String field_d;
    static byte[][] field_b;
    static int field_a;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 <= 37) {
            field_a = 13;
        }
    }

    final static void a(Object param0, byte param1, uf param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = TrackController.field_F ? 1 : 0;
        if (null != param2.field_i) {
          var3_int = 0;
          L0: while (true) {
            L1: {
              if (-51 >= (var3_int ^ -1)) {
                break L1;
              } else {
                if (param2.field_i.peekEvent() == null) {
                  break L1;
                } else {
                  wl.a(1L, false);
                  var3_int++;
                  continue L0;
                }
              }
            }
            try {
              L2: {
                if (param1 == -127) {
                  if (param0 == null) {
                    break L2;
                  } else {
                    param2.field_i.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param0, 1001, "dummy"));
                    return;
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L3;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Please wait...";
        field_b = new byte[1000][];
        field_a = 4;
        field_c = null;
    }
}
