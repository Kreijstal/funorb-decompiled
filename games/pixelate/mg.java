/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mg extends hn implements hi {
    static int field_i;
    static ak field_h;
    static String field_g;
    static String field_k;
    static boolean field_l;
    private c field_j;

    public static void d(int param0) {
        field_g = null;
        field_h = null;
        field_k = null;
        int var1 = 57 / ((-8 - param0) / 42);
    }

    abstract String a(int param0, String param1);

    final String c(int param0) {
        if (param0 != -1) {
          this.a(10);
          return this.a(-128, this.field_j.field_q);
        } else {
          return this.a(-128, this.field_j.field_q);
        }
    }

    public final boolean a(int param0) {
        int stackIn_5_0 = 0;
        if (param0 == -22265) {
          if (null != this.field_j.field_q) {
            if (this.field_j.field_q.length() == 0) {
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

    abstract dj a(String param0, boolean param1);

    public final void a(int param0, c param1) {
        try {
            this.b(2048);
            int var3_int = -22 % ((-30 - param0) / 60);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "mg.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(c param0, int param1) {
        try {
            if (param1 != 4) {
                field_i = -81;
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "mg.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final dj a(boolean param0) {
        String var3;
        if (!param0) {
          var3 = (String) null;
          this.a(17, (String) null);
          return this.a(this.field_j.field_q, param0);
        } else {
          return this.a(this.field_j.field_q, param0);
        }
    }

    mg(c param0) {
        try {
            this.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "mg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Shortcut Reference";
        field_k = "Options Menu";
    }
}
