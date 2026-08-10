/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eca extends sc implements en {
    static int field_e;
    static String field_d;
    private uf field_c;

    final String d(int param0) {
        String var3;
        if (param0 != 16384) {
          var3 = (String) null;
          this.a((String) null, -101);
          return this.b(this.field_c.field_j, -1);
        } else {
          return this.b(this.field_c.field_j, -1);
        }
    }

    final qrb b(int param0) {
        if (param0 != -1) {
          field_d = (String) null;
          return this.a(this.field_c.field_j, 16384);
        } else {
          return this.a(this.field_c.field_j, 16384);
        }
    }

    public final void a(uf param0, byte param1) {
        if (param1 != 100) {
            return;
        }
        try {
            this.a(20);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "eca.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean b(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 <= -100) {
          if (this.field_c.field_j != null) {
            if (this.field_c.field_j.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          this.field_c = (uf) null;
          if (this.field_c.field_j == null) {
            return true;
          } else {
            L0: {
              if (this.field_c.field_j.length() != 0) {
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

    public static void e(int param0) {
        if (param0 != -27183) {
            field_d = (String) null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    public final void a(int param0, uf param1) {
        try {
            if (param0 != -12409) {
                uf var4 = (uf) null;
                this.a((uf) null, (byte) 43);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "eca.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    eca(uf param0) {
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "eca.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract qrb a(String param0, int param1);

    abstract String b(String param0, int param1);

    static {
        field_d = "Halve custom variables";
        field_e = 16384;
    }
}
