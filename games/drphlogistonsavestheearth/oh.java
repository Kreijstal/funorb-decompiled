/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static int field_e;
    static sa field_c;
    static pi field_b;
    static boolean field_a;
    static int field_d;

    final static void a(byte param0) {
        sf.a(4, 11649);
        if (param0 != 75) {
            field_c = null;
        }
    }

    final static boolean a(int param0) {
        if (param0 != 0) {
            Object var2 = null;
            oh.a((bl) null, -112, (Object) null);
        }
        return gf.field_G;
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 != 26500) {
            oh.a(true);
        }
        gl.field_c = param2;
        oc.field_B = param1;
    }

    final static void a(bl param0, int param1, Object param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param1 == 1) {
            break L0;
          } else {
            field_a = false;
            break L0;
          }
        }
        if (param0.field_x == null) {
          return;
        } else {
          var3_int = 0;
          L1: while (true) {
            L2: {
              if ((var3_int ^ -1) <= -51) {
                break L2;
              } else {
                if (param0.field_x.peekEvent() == null) {
                  break L2;
                } else {
                  kk.a(1L, true);
                  var3_int++;
                  continue L1;
                }
              }
            }
            try {
              L3: {
                if (param2 == null) {
                  break L3;
                } else {
                  param0.field_x.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
                  break L3;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var3 = (Exception) (Object) decompiledCaughtException;
          }
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -1;
        field_c = new sa(0, 2, 2, 1);
    }
}
