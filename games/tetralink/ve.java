/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static int field_b;
    static int[] field_a;
    static boolean[] field_d;
    static String field_c;
    private oh[] field_e;
    static String field_f;

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        qj.a(param3, (byte) -36, this.field_e, param1, param4, param0);
        int var6 = 11 % ((-72 - param2) / 50);
    }

    final static ah b(int param0, int param1) {
        int var2 = 33 / ((param0 - 4) / 40);
        return ai.a(false, param1, false, 1, (byte) 38, true);
    }

    final static void a(byte param0) {
        ec.field_i = 0;
        ph.field_z = -1;
        sc.field_c = null;
        fl.field_s = false;
        fi.field_Db = -1;
        if (param0 != -83) {
            field_b = 56;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 < 115) {
          field_f = (String) null;
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0, String param1, String param2) {
        try {
            if (null != fl.field_u) {
                fl.field_u.r(-127);
            }
            ao.field_c = new tl(param2, param1, false, true, true);
            if (param0 != -1) {
                field_a = (int[]) null;
            }
            mm.field_u.e(ao.field_c, param0 + -27666);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ve.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        jj.field_a = param0;
        if (param1 <= 18) {
          L0: {
            field_f = (String) null;
            if (ic.field_b != null) {
              ic.field_b.a((byte) 98, param0);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (bn.field_c != null) {
              bn.field_c.b(param0, 1);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (ic.field_b != null) {
              ic.field_b.a((byte) 98, param0);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (bn.field_c != null) {
              bn.field_c.b(param0, 1);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    ve(oh[] param0) {
        try {
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ve.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Show chat (1 unread message)";
        field_f = "The following settings need to be changed:  ";
    }
}
