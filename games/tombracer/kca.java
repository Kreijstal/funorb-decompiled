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
        if (param0 != 1890) {
          field_h = -23;
          return this.a(-1, this.field_i.field_o);
        } else {
          return this.a(-1, this.field_i.field_o);
        }
    }

    public final boolean a(boolean param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0) {
          if (null != this.field_i.field_o) {
            if (this.field_i.field_o.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          field_g = 101;
          if (null == this.field_i.field_o) {
            return true;
          } else {
            L0: {
              if (this.field_i.field_o.length() != 0) {
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
        if (param0 != -1891) {
          this.d(102);
          return this.a((byte) 14, this.field_i.field_o);
        } else {
          return this.a((byte) 14, this.field_i.field_o);
        }
    }

    static {
        field_g = -1;
        field_f = 0;
    }
}
