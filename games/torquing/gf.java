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
        RuntimeException runtimeException = null;
        tk var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -122) {
                break L1;
              } else {
                var4 = (tk) null;
                this.a((tk) null, (byte) 107);
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

            stackIn_5_1 = new StringBuilder().append("gf.I(");

            if (param0 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
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
        RuntimeException runtimeException = null;
        tk var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(true);
              if (param0 >= 3) {
                break L1;
              } else {
                var4 = (tk) null;
                this.a((tk) null, (byte) 9);
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

            stackIn_5_1 = new StringBuilder().append("gf.A(").append(param0).append(',');

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
          throw rb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0) {
          if (null != this.field_i.field_m) {
            if (0 == this.field_i.field_m.length()) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          field_f = -87L;
          if (null == this.field_i.field_m) {
            return true;
          } else {
            L0: {
              if (0 != this.field_i.field_m.length()) {
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

    static {
        field_j = new qd();
    }
}
