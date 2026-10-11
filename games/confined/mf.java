/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mf extends ra implements uj {
    static gd field_f;
    static int[] field_g;
    private ul field_e;

    abstract fi a(byte param0, String param1);

    public final void a(ul param0, byte param1) {
        try {
          if (param1 != 83) {
            field_f = (gd) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mf.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(boolean param0) {
        if (!param0) {
          ul var3 = (ul) null;
          this.a((ul) null, (byte) -119);
          if (null != this.field_e.field_B) {
            return 0 == this.field_e.field_B.length() ? true : false;
          }
          return true;
        }
        if (null == this.field_e.field_B) {
          return true;
        }
        if (0 != this.field_e.field_B.length()) {
          return false;
        }
        return true;
    }

    final static boolean c(int param0) {
        if (param0 < 101) {
          return true;
        }
        return sg.a((byte) -111, ii.b(false));
    }

    mf(ul param0) {
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String b(byte param0) {
        if (param0 < 102) {
          return (String) null;
        }
        return this.a(this.field_e.field_B, true);
    }

    final fi c(boolean param0) {
        if (param0) {
          return this.a((byte) -68, this.field_e.field_B);
        }
        this.field_e = (ul) null;
        return this.a((byte) -68, this.field_e.field_B);
    }

    abstract String a(String param0, boolean param1);

    public final void a(int param0, ul param1) {
        try {
          this.b(-47);
          if (param0 != 32175) {
            ul var4 = (ul) null;
            this.a((ul) null, (byte) 73);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mf.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        if (param0 <= 66) {
          mf.c(95);
          field_f = null;
          field_g = null;
          return;
        }
        field_f = null;
        field_g = null;
    }

    static {
        field_g = new int[8192];
    }
}
