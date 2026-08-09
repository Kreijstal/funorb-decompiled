/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rd extends fd implements fg {
    private al field_D;

    rd(int param0, int param1, int param2, int param3, ol param4) {
        super(param0, param1, param2, param3, param4);
    }

    public final le a(int param0) {
        if (param0 != -1) {
            return (le) null;
        }
        return (le) ((Object) this.field_D);
    }

    abstract int g(int param0);

    abstract int g(boolean param0);

    abstract boolean h(int param0);

    void a(int param0, al param1) {
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
              this.field_D = param1;
              this.field_D.field_h = (rd) (this);
              if (param0 == 2) {
                break L1;
              } else {
                this.a(-16);
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

            stackIn_5_1 = new StringBuilder().append("rd.N(").append(param0).append(',');

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
          throw kg.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    abstract int f(int param0);

    static {
    }
}
