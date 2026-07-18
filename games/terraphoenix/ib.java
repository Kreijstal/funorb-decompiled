/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib extends ej implements v {
    static String field_ab;
    static ci field_Y;
    private rc field_db;
    private int field_Z;
    static String field_X;
    static int field_cb;
    static String field_bb;

    public static void b() {
        field_ab = null;
        field_X = null;
        field_bb = null;
        field_Y = null;
    }

    final String f(int param0) {
        if (((ib) this).field_s) {
          if (((ib) this).field_x != null) {
            if (param0 <= 70) {
              return null;
            } else {
              sh.a((byte) -122, jb.field_b, -((ib) this).field_Z + ((ib) this).field_p + ef.field_j);
              return ((ib) this).field_x;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(rc param0, int param1) {
        try {
            if (param1 != 5859) {
                field_cb = -97;
            }
            ((ib) this).field_db = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ib.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ib(String param0, sc param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(gl param0, int param1, int param2, int param3) {
        try {
            if (param3 < 25) {
                String discarded$0 = ((ib) this).f(-56);
            }
            super.a(param0, param1, param2, 77);
            ((ib) this).field_Z = -param2 + -((ib) this).field_w + ef.field_j;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ib.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void i(int param0) {
        super.i(127);
        if (null == ((ib) this).field_db) {
          if (param0 <= 121) {
            boolean discarded$4 = ib.p(109);
            return;
          } else {
            return;
          }
        } else {
          ((ib) this).field_db.c((byte) 56);
          if (param0 > 121) {
            return;
          } else {
            boolean discarded$5 = ib.p(109);
            return;
          }
        }
    }

    public final rc a(int param0) {
        if (param0 != 29730) {
            return null;
        }
        return ((ib) this).field_db;
    }

    final static boolean p(int param0) {
        if (param0 <= 70) {
            int discarded$0 = 0;
            ib.b();
            return dg.field_d;
        }
        return dg.field_d;
    }

    final static pd a(boolean param0, String[] param1) {
        pd var2 = null;
        RuntimeException var2_ref = null;
        pd stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        pd stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2 = new pd(false);
            var2.field_d = param1;
            stackOut_0_0 = (pd) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("ib.FA(").append(true).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ab = "Unfortunately you are not eligible to create an account.";
        field_X = "Hostile sighted";
        field_bb = "Return to game";
    }
}
