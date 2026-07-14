/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static boolean field_c;
    static String field_d;
    static sb field_b;
    static boolean[] field_a;

    public static void a(boolean param0) {
        if (param0) {
          field_d = null;
          field_b = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var1 = hj.a(24777);
        if (param0 != 0) {
          return;
        } else {
          var2 = nd.a(-21065);
          cf.field_g.a(jl.field_a - td.field_a, -gh.field_H + bb.field_b, var1 + (gh.field_H << -593767295), -21907, var2 + (td.field_a << 902883169));
          ti.l(6);
          return;
        }
    }

    final static boolean a(int param0, gh param1, String param2, int param3, String param4, String param5, boolean param6) {
        if (!(wj.field_a == fh.field_B)) {
            return false;
        }
        sd var8 = new sd(q.field_N, param1);
        q.field_N.b((lk) (Object) var8, false);
        if (param0 != 2) {
            pg.a(103);
            if (wi.e((byte) 104)) {
                var8.j((byte) -52);
                return true;
            }
            je.field_a = param2;
            cg.field_a = param3;
            ci.field_L = null;
            fh.field_B = qg.field_g;
            ej.field_b = param5;
            ij.field_a = param6 ? true : false;
            eb.field_z = param4;
            return true;
        }
        if (wi.e((byte) 104)) {
            var8.j((byte) -52);
        } else {
            je.field_a = param2;
            cg.field_a = param3;
            ci.field_L = null;
            fh.field_B = qg.field_g;
            ej.field_b = param5;
            ij.field_a = param6 ? true : false;
            eb.field_z = param4;
            return true;
        }
        return true;
    }

    final static void a(byte param0, Object param1, si param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Bounce.field_N;
        if (null != param2.field_e) {
          var3_int = 0;
          L0: while (true) {
            L1: {
              if (-51 >= (var3_int ^ -1)) {
                break L1;
              } else {
                if (null == param2.field_e.peekEvent()) {
                  break L1;
                } else {
                  wh.a(1L, 19406);
                  var3_int++;
                  continue L0;
                }
              }
            }
            L2: {
              if (param0 < -85) {
                break L2;
              } else {
                field_b = null;
                break L2;
              }
            }
            try {
              if (param1 == null) {
                break L0;
              } else {
                param2.field_e.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param1, 1001, "dummy"));
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
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
        field_c = true;
        field_d = "You have 1 unread message!";
        field_b = new sb(2);
    }
}
