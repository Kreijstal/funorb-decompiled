/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mk extends rb implements fb {
    private fn field_g;
    static String field_f;
    static String field_d;
    static int field_e;
    static String field_i;
    static boolean field_h;

    public final boolean b(int param0) {
        int stackIn_5_0 = 0;
        if (param0 >= 12) {
          if (null != this.field_g.field_v) {
            if (this.field_g.field_v.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_5_0 = 1;
            return stackIn_5_0 != 0;
          }
        } else {
          return true;
        }
    }

    abstract gu a(int param0, String param1);

    public final void b(fn param0, int param1) {
        try {
            this.a(126);
            int var3_int = 59 % ((-80 - param1) / 33);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "mk.FA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    mk(fn param0) {
        try {
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "mk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract String a(byte param0, String param1);

    final String b(byte param0) {
        if (param0 != -71) {
          field_h = false;
          return this.a((byte) 115, this.field_g.field_v);
        } else {
          return this.a((byte) 115, this.field_g.field_v);
        }
    }

    final gu c(int param0) {
        int var2 = 85 / ((56 - param0) / 32);
        return this.a(-3137, this.field_g.field_v);
    }

    public final void a(fn param0, int param1) {
        try {
            if (param1 != 80) {
                field_i = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "mk.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void f(int param0) {
        field_d = null;
        if (param0 != -1) {
            field_i = (String) null;
            field_f = null;
            field_i = null;
            return;
        }
        field_f = null;
        field_i = null;
    }

    static {
        field_f = null;
        field_d = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_e = -1;
        field_i = "STRENGTH";
        field_h = true;
    }
}
