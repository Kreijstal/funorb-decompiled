/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    static String field_a;
    static long field_b;
    static String field_c;

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 <= -79) {
            break L0;
          } else {
            og.a((byte) -45);
            break L0;
          }
        }
        if (ub.field_e != null) {
          var1 = ub.field_e;
          synchronized (var1) {
            L1: {
              ub.field_e = null;
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -61) {
            return;
        }
        field_c = null;
    }

    final static void a(int param0) {
        if (!mg.b(true)) {
            return;
        }
        cl.a(118, false, 4);
        if (param0 != -5213) {
            field_c = (String) null;
        }
    }

    final static int a(boolean param0) {
        qd[] var1 = null;
        qd[] var2 = null;
        if (!param0) {
          og.b(124);
          var1 = new qd[]{};
          var2 = hl.field_v.a(var1, -21636, fg.field_Ob);
          var1 = var2;
          return var2.length * 36;
        } else {
          var1 = new qd[]{};
          var2 = hl.field_v.a(var1, -21636, fg.field_Ob);
          var1 = var2;
          return var2.length * 36;
        }
    }

    static {
        field_a = "Hide game chat";
        field_c = "Waiting for fonts";
    }
}
