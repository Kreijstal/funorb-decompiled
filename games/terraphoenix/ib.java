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
        field_ab = null;
        if (!param0) {
          field_X = null;
          field_bb = null;
          field_Y = null;
          return;
        }
        ib.p(-64);
        field_X = null;
        field_bb = null;
        field_Y = null;
    }

    final String f(int param0) {
        if (!this.field_s) {
          return null;
        }
        if (this.field_x == null) {
          return null;
        }
        if (param0 > 70) {
          sh.a((byte) -122, jb.field_b, -this.field_Z + this.field_p + ef.field_j);
          return this.field_x;
        }
        return (String) null;
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
        try {
          if (param3 < 25) {
            this.f(-56);
          }
          super.a(param0, param1, param2, 77);
          this.field_Z = -param2 - this.field_w + ef.field_j;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ib.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void i(int param0) {
        super.i(127);
        if (null != this.field_db) {
          this.field_db.c((byte) 56);
          if (param0 <= 121) {
            ib.p(109);
            return;
          }
          return;
        }
        if (param0 > 121) {
          return;
        }
        ib.p(109);
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            field_cb = 75;
          }
          var2 = new pd(false);
          var2.field_d = param1;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("ib.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_ab = "Unfortunately you are not eligible to create an account.";
        field_X = "Hostile sighted";
        field_bb = "Return to game";
    }
}
