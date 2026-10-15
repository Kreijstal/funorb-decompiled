/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eo extends tl {
    static String field_h;
    static hk field_k;
    static tj field_f;
    static java.awt.Font field_g;
    static volatile int field_i;
    static String field_e;
    private java.nio.ByteBuffer field_j;
    static String field_l;

    final static boolean a(boolean param0, pi param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            eo.c(-28);
          }
          stackIn_5_0 = (1 == param1.c(1, (byte) 127));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("eo.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param3 == param0 &&
          md.field_r != param2) {
          oi.field_d = true;
          md.field_r = param2;
          eh.a(true, param1);
        }
        if (param3 == 1 &&
          md.field_v != param2) {
          md.field_v = param2;
          oi.field_d = true;
          eh.a(true, param1);
        }
        if (2 != param3) {
          return;
        }
        if (param2 == to.field_a) {
          return;
        }
        oi.field_d = true;
        to.field_a = param2;
        eh.a(true, param1);
    }

    final void a(int param0, byte[] param1) {
        try {
          this.field_j = java.nio.ByteBuffer.allocateDirect(param1.length);
          if (param0 < 63) {
            field_g = (java.awt.Font) null;
          }
          this.field_j.position(0);
          this.field_j.put(param1);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "eo.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final byte[] b(int param0) {
        byte[] var3 = new byte[this.field_j.capacity()];
        byte[] var2 = var3;
        this.field_j.position(0);
        if (param0 == 16616) {
          this.field_j.get(var3);
          return var3;
        }
        return (byte[]) null;
    }

    final static boolean a(int[] param0, int param1, byte param2) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == -75) {
            stackIn_6_0 = ((param0[param1 >> 5] & 1 << (param1 & 31)) != 0);
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("eo.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_l = null;
        if (param0 != 7301) {
          return;
        }
        field_g = null;
        field_f = null;
        field_k = null;
        field_h = null;
        field_e = null;
    }

    eo() {
    }

    static {
        field_h = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_l = "Show lobby chat from my friends";
        field_i = -1;
    }
}
