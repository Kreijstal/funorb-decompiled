/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mf extends ra implements uj {
    static gd field_f;
    static int[] field_g;
    private ul field_e;

    abstract fi a(byte param0, String param1);

    public final void a(ul param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 83) {
                break L1;
              } else {
                field_f = (gd) null;
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

            stackIn_5_1 = new StringBuilder().append("mf.E(");

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
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
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
        RuntimeException runtimeException = null;
        ul var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.b(-47);
              if (param0 == 32175) {
                break L1;
              } else {
                var4 = (ul) null;
                this.a((ul) null, (byte) 73);
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

            stackIn_5_1 = new StringBuilder().append("mf.GA(").append(param0).append(',');

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
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
