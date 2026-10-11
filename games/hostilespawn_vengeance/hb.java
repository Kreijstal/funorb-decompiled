/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends lj {
    static ll field_v;
    private Object field_w;

    final boolean e(int param0) {
        if (param0 != 10999) {
          return false;
        }
        return false;
    }

    public static void a(boolean param0) {
        field_v = null;
        if (param0) {
          field_v = (ll) null;
        }
    }

    final Object c(byte param0) {
        if (param0 != 103) {
          return (Object) null;
        }
        return this.field_w;
    }

    final static boolean a(int param0, int[] param1, boolean param2) {
        RuntimeException var3 = null;
        int[] var4 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            var4 = (int[]) null;
            hb.a(-21, (int[]) null, true);
          }
          stackIn_5_0 = ((param1[param0 >> 5] & 1 << (31 & param0)) != 0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("hb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, byte[] param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          var4_int = -1;
          for (var5 = param0; var5 < param3; var5++) {
            var4_int = var4_int >>> 8 ^ of.field_g[(param2[var5] ^ var4_int) & 255];
          }
          if (param1 >= -106) {
            field_v = (ll) null;
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("hb.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    hb(Object param0, int param1) {
        super(param1);
        try {
          this.field_w = param0;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "hb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_v = new ll();
    }
}
