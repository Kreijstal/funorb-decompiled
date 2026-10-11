/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends gb {
    static int[] field_m;
    private java.nio.ByteBuffer field_n;
    static int field_l;
    static String field_h;
    static String field_k;
    static String field_g;
    static int field_j;
    static String field_i;

    final byte[] a(int param0) {
        byte[] var3 = new byte[this.field_n.capacity()];
        byte[] var2 = var3;
        this.field_n.position(0);
        this.field_n.get(var3);
        if (param0 == -21109) {
          return var3;
        }
        return (byte[]) null;
    }

    final void a(byte param0, byte[] param1) {
        this.field_n = java.nio.ByteBuffer.allocateDirect(param1.length);
        this.field_n.position(0);
        if (param0 > -30) {
          return;
        }
        try {
          this.field_n.put(param1);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ge.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.net.URL a(int param0, java.net.URL param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_2_0 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var4Lifetime1;
        Object var4Lifetime2;
        try {
          var3 = null;
          if (param0 != 0) {
            stackIn_2_0 = (java.net.URL) null;
            return stackIn_2_0;
          }
          if (dn.field_Ub != null &&
            !dn.field_Ub.equals(param2.getParameter("settings"))) {
            var3 = dn.field_Ub;
            var4 = var3;
            var4Lifetime2 = var3;
          }
          var4Lifetime1 = null;
          if (null != ja.field_h &&
            !ja.field_h.equals(param2.getParameter("session"))) {
            var4Lifetime1 = ja.field_h;
          }
          stackIn_10_0 = fc.a(-19571, param1, (String) (var3), (String) (var4Lifetime1), -1);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ge.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ci.a((Throwable) (stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 <= 3) {
          return;
        }
        field_i = null;
        field_h = null;
        field_m = null;
        field_g = null;
        field_k = null;
    }

    final static int a(int param0, byte param1) {
        if (param1 == -32) {
          param0--;
          param0 = param0 | param0 >>> 1;
          param0 = param0 | param0 >>> 2;
          param0 = param0 | param0 >>> 4;
          param0 = param0 | param0 >>> 8;
          param0 = param0 | param0 >>> 16;
          return param0 + 1;
        }
        return -20;
    }

    ge() {
    }

    static {
        field_l = 0;
        field_k = "Add name";
        field_h = "Suggest muting this player";
        field_g = "Fullscreen";
        field_m = jg.a(true);
        field_i = "Detail: High";
        field_j = 0;
    }
}
