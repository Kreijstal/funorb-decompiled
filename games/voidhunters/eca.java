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
        RuntimeException runtimeException = null;
        uf var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -12409) {
                break L1;
              } else {
                var4 = (uf) null;
                this.a((uf) null, (byte) 43);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("eca.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
