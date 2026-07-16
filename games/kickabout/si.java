/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends gn {
    int[] field_h;
    static kj field_j;
    byte[][][] field_l;
    int field_p;
    wu[] field_e;
    int field_n;
    int[] field_m;
    wu[] field_f;
    static String field_i;
    static String[] field_q;
    int[] field_o;
    static int field_k;
    static int field_g;

    public static void a(int param0) {
        if (param0 != 0) {
            si.a(45);
            field_i = null;
            field_q = null;
            field_j = null;
            return;
        }
        field_i = null;
        field_q = null;
        field_j = null;
    }

    final static void a(byte param0, bu param1, Object param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        if (param1.field_a != null) {
          var3_int = 0;
          L0: while (true) {
            L1: {
              if (50 <= var3_int) {
                break L1;
              } else {
                if (param1.field_a.peekEvent() == null) {
                  break L1;
                } else {
                  aj.a(1L, 1);
                  var3_int++;
                  continue L0;
                }
              }
            }
            L2: {
              if (param0 == 41) {
                break L2;
              } else {
                si.a(-5);
                break L2;
              }
            }
            try {
              L3: {
                if (param2 != null) {
                  param1.field_a.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
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
          return;
        }
    }

    si() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Email (Login):";
        field_j = new kj(0);
        field_g = 0;
    }
}
