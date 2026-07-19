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

    public static void b(boolean param0) {
        boolean discarded$2 = false;
        field_ab = null;
        if (param0) {
          discarded$2 = ib.p(-64);
          field_X = null;
          field_bb = null;
          field_Y = null;
          return;
        } else {
          field_X = null;
          field_bb = null;
          field_Y = null;
          return;
        }
    }

    final String f(int param0) {
        if (this.field_s) {
          if (this.field_x != null) {
            if (param0 <= 70) {
              return (String) null;
            } else {
              sh.a((byte) -122, jb.field_b, -this.field_Z + this.field_p + ef.field_j);
              return this.field_x;
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
            this.field_db = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "ib.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ib(String param0, sc param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(gl param0, int param1, int param2, int param3) {
        String discarded$0 = null;
        try {
            if (param3 < 25) {
                discarded$0 = this.f(-56);
            }
            super.a(param0, param1, param2, 77);
            this.field_Z = -param2 + -this.field_w + ef.field_j;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "ib.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void i(int param0) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        super.i(127);
        if (null == this.field_db) {
          if (param0 <= 121) {
            discarded$4 = ib.p(109);
            return;
          } else {
            return;
          }
        } else {
          this.field_db.c((byte) 56);
          if (param0 > 121) {
            return;
          } else {
            discarded$5 = ib.p(109);
            return;
          }
        }
    }

    public final rc a(int param0) {
        if (param0 != 29730) {
            return (rc) null;
        }
        return this.field_db;
    }

    final static boolean p(int param0) {
        if (param0 <= 70) {
            ib.b(false);
            return dg.field_d;
        }
        return dg.field_d;
    }

    final static pd a(boolean param0, String[] param1) {
        pd var2 = null;
        RuntimeException var2_ref = null;
        pd stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        pd stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_cb = 75;
                break L1;
              }
            }
            var2 = new pd(false);
            var2.field_d = param1;
            stackOut_2_0 = (pd) (var2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("ib.FA(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_ab = "Unfortunately you are not eligible to create an account.";
        field_X = "Hostile sighted";
        field_bb = "Return to game";
    }
}
