/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gf extends eq implements wm {
    private tk field_i;
    static qd field_j;
    static int field_h;
    static int field_k;
    static int field_g;
    static long field_f;

    public final void a(tk param0, byte param1) {
        try {
          if (param1 > -122) {
            tk var4 = (tk) null;
            this.a((tk) null, (byte) 107);
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "gf.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String b(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        return this.a((byte) -121, this.field_i.field_m);
    }

    final cd c(int param0) {
        if (param0 != 0) {
          return (cd) null;
        }
        return this.a(111, this.field_i.field_m);
    }

    gf(tk param0) {
        try {
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "gf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, tk param1) {
        try {
          this.a(true);
          if (param0 < 3) {
            tk var4 = (tk) null;
            this.a((tk) null, (byte) 9);
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "gf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract String a(byte param0, String param1);

    public static void d(int param0) {
        field_j = null;
        if (param0 != 0) {
          field_j = (qd) null;
        }
    }

    abstract cd a(int param0, String param1);

    public final boolean b(boolean param0) {
        if (!param0) {
          field_f = -87L;
          if (null != this.field_i.field_m) {
            return 0 == this.field_i.field_m.length() ? true : false;
          }
          return true;
        }
        if (null == this.field_i.field_m) {
          return true;
        }
        if (0 != this.field_i.field_m.length()) {
          return false;
        }
        return true;
    }

    static {
        field_j = new qd();
    }
}
