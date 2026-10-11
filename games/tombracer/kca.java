/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kca extends kma implements cd {
    static int field_h;
    static int field_g;
    private tra field_i;
    static int field_f;

    abstract it a(byte param0, String param1);

    abstract String a(int param0, String param1);

    final String e(int param0) {
        if (param0 == 1890) {
          return this.a(-1, this.field_i.field_o);
        }
        field_h = -23;
        return this.a(-1, this.field_i.field_o);
    }

    public final boolean a(boolean param0) {
        if (!param0) {
          field_g = 101;
          if (null != this.field_i.field_o) {
            return this.field_i.field_o.length() == 0 ? true : false;
          }
          return true;
        }
        if (null == this.field_i.field_o) {
          return true;
        }
        if (this.field_i.field_o.length() != 0) {
          return false;
        }
        return true;
    }

    public final void a(int param0, tra param1) {
        try {
          if (param0 != -6038) {
            tra var4 = (tra) null;
            this.a(46, (tra) null);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "kca.KA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(tra param0, int param1) {
        if (param1 != -10) {
          return;
        }
        try {
          this.c(-99);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "kca.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    kca(tra param0) {
        try {
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "kca.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final it d(int param0) {
        if (param0 == -1891) {
          return this.a((byte) 14, this.field_i.field_o);
        }
        this.d(102);
        return this.a((byte) 14, this.field_i.field_o);
    }

    static {
        field_g = -1;
        field_f = 0;
    }
}
