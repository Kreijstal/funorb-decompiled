/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    private String field_a;
    static String field_b;
    static volatile boolean field_f;
    static String field_e;
    static byte[][] field_c;
    static String field_d;

    final static er a(byte param0) {
        int var5_int = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        int var1 = 110 / ((param0 - 43) / 32);
        int var2 = mh.field_c[0] * vi.field_w[0];
        byte[] var3 = se.field_y[0];
        int[] var4 = new int[var2];
        for (var5_int = 0; var5_int < var2; var5_int++) {
            var4[var5_int] = in.field_c[b.a(255, (int) var3[var5_int])];
        }
        er var5 = new er(ql.field_M, vj.field_c, ca.field_a[0], pc.field_a[0], mh.field_c[0], vi.field_w[0], var4);
        la.a((byte) 17);
        return var5;
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_e = null;
        int var1 = 61 / ((param0 - 81) / 32);
        field_c = (byte[][]) null;
    }

    final void a(java.applet.Applet param0, byte param1) {
        try {
            int var3_int = 121 / ((-13 - param1) / 47);
            gl.a(-11, 31536000L, param0, this.field_a, "jagex-last-login-method");
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "ej.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    ej(String param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "ej.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
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
              if (param0 == 31588) {
                break L1;
              } else {
                var4 = (String) null;
                this.a(-78, (String) null);
                break L1;
              }
            }
            stackIn_3_0 = this.field_a.equals(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ej.A(").append(param0).append(',');

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
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static String a(byte param0, int param1, int param2) {
        if (param0 <= 101) {
            field_b = (String) null;
        }
        return Vertigo2.a(new String[]{Integer.toString(param1), Integer.toString(param2)}, lp.field_z, -116);
    }

    static {
        field_b = "No highscores";
        field_f = false;
        field_e = "Rating";
        field_d = "Rated game";
    }
}
