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
        ul var3;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0) {
          if (null != this.field_e.field_B) {
            if (0 == this.field_e.field_B.length()) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          var3 = (ul) null;
          this.a((ul) null, (byte) -119);
          if (null == this.field_e.field_B) {
            return true;
          } else {
            L0: {
              if (0 != this.field_e.field_B.length()) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
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
        if (!param0) {
          this.field_e = (ul) null;
          return this.a((byte) -68, this.field_e.field_B);
        } else {
          return this.a((byte) -68, this.field_e.field_B);
        }
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
