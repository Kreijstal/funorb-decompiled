/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm extends cr {
    static String field_Ib;
    private cr field_Hb;
    private cr field_Jb;
    static String field_Kb;

    sm(long param0, sm param1, String param2) {
        this(param0, param1.field_Hb, param1.field_Jb, param2);
    }

    final int c(int param0, int param1) {
        if (param1 != 0) {
          sm.k(61);
          return param0 + this.field_Hb.j(-21391) + this.field_Jb.j(-21391);
        } else {
          return param0 + this.field_Hb.j(-21391) + this.field_Jb.j(-21391);
        }
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        this.field_Hb.a(79, this.field_Hb.j(-21391), this.field_db, 0, 0);
        if (param0 > -63) {
          field_Kb = (String) null;
          var3 = this.field_Hb.field_Fb + param1;
          this.field_Jb.a(80, this.field_Fb + -var3, this.field_db, 0, var3);
          return;
        } else {
          var3 = this.field_Hb.field_Fb + param1;
          this.field_Jb.a(80, this.field_Fb + -var3, this.field_db, 0, var3);
          return;
        }
    }

    private sm(long param0, cr param1, cr param2, String param3) {
        super(param0, (cr) null);
        try {
            this.field_Hb = new cr(0L, param1);
            this.field_Jb = new cr(0L, param2);
            this.field_Jb.field_S = param3;
            this.b(this.field_Hb, 126);
            this.b(this.field_Jb, 121);
            this.i(-2147483648);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "sm.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param3 > -6) {
            return;
        }
        this.a(119, param0, param2, param1, param5);
        this.a((byte) -101, param4);
    }

    sm(long param0, er param1, er param2, int param3, cr param4, String param5) {
        this(param0, (cr) null, param4, param5);
        try {
            this.field_Hb.field_Db = param2;
            this.field_Hb.field_ab = param3;
            this.field_Hb.field_mb = param1;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "sm.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void k(int param0) {
        String var1 = null;
        if (!tk.field_e) {
          throw new IllegalStateException();
        } else {
          L0: {
            if (df.field_l != null) {
              df.field_l.h((byte) 93);
              break L0;
            } else {
              break L0;
            }
          }
          var1 = mb.a(0);
          eb.field_d = new ob(var1, (String) null, true, false, false);
          ch.field_e.b(n.field_b, 0);
          if (param0 != -14284) {
            sm.k(8);
            n.field_b.a(false, eb.field_d);
            n.field_b.f((byte) -23);
            return;
          } else {
            n.field_b.a(false, eb.field_d);
            n.field_b.f((byte) -23);
            return;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != 76) {
            return;
        }
        field_Ib = null;
        field_Kb = null;
    }

    static {
    }
}
