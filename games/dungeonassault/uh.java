/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends rm implements qn {
    private dp field_W;
    private int field_U;
    static String field_V;

    public static void i(byte param0) {
        if (param0 != -41) {
            field_V = (String) null;
            field_V = null;
            return;
        }
        field_V = null;
    }

    final void a(int param0, int param1, lm param2, boolean param3) {
        RuntimeException runtimeException = null;
        dp var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.field_U = -this.field_q + hj.field_S + -param0;
              if (param3) {
                break L1;
              } else {
                var6 = (dp) null;
                this.a((dp) null, -106);
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

            stackIn_5_1 = new StringBuilder().append("uh.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw vk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ')');
        }
    }

    final void a(dp param0, int param1) {
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
              this.field_W = param0;
              if (param1 == 10508) {
                break L1;
              } else {
                this.field_U = 28;
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

            stackIn_5_1 = new StringBuilder().append("uh.E(");

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
          throw vk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final dp a(int param0) {
        if (param0 >= -74) {
            field_V = (String) null;
            return this.field_W;
        }
        return this.field_W;
    }

    final void n(int param0) {
        super.n(param0);
        if (null != this.field_W) {
            this.field_W.b(2899);
        }
    }

    final String c(byte param0) {
        if (param0 >= 3) {
          if (this.field_u) {
            if (this.field_i == null) {
              return null;
            } else {
              vj.a((byte) 121, eh.field_h, -this.field_U + (this.field_x + hj.field_S));
              return this.field_i;
            }
          } else {
            return null;
          }
        } else {
          this.n(111);
          if (this.field_u) {
            if (this.field_i == null) {
              return null;
            } else {
              vj.a((byte) 121, eh.field_h, -this.field_U + (this.field_x + hj.field_S));
              return this.field_i;
            }
          } else {
            return null;
          }
        }
    }

    uh(String param0, pg param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        field_V = "You have not yet been raided.";
    }
}
