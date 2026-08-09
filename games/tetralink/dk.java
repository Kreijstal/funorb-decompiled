/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    static String field_a;
    static int field_b;
    private String field_c;
    static jb field_d;

    final void a(byte param0, java.applet.Applet param1) {
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
              ma.a(this.field_c, 31536000L, param1, 118, "jagex-last-login-method");
              if (param0 < -69) {
                break L1;
              } else {
                this.field_c = (String) null;
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

            stackIn_5_1 = new StringBuilder().append("dk.A(").append(param0).append(',');

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
          throw oi.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -5384) {
            dk.a(-20);
            field_d = null;
            field_a = null;
            return;
        }
        field_d = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(int param0, String param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 16412) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = this.field_c.equals(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("dk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    dk(String param0) {
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "dk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Show private chat from my friends and opponents";
    }
}
