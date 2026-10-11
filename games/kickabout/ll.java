/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll extends pf {
    static ko field_k;
    static String field_h;
    private java.nio.ByteBuffer field_f;
    static String field_l;
    static ut field_g;
    static cn field_o;
    static int[] field_j;
    static int field_i;
    static ut field_m;
    static ut field_n;

    final static void c(byte param0) {
        ma.k((byte) -118);
        int var1 = 115 % ((param0 + 48) / 42);
        ae.m(-19417);
    }

    public static void b(byte param0) {
        field_m = null;
        field_l = null;
        field_h = null;
        field_n = null;
        field_j = null;
        field_o = null;
        field_k = null;
        if (param0 <= -47) {
          field_g = null;
          return;
        }
        ll.b((byte) 81);
        field_g = null;
    }

    final void a(byte[] param0, int param1) {
        try {
          this.field_f = java.nio.ByteBuffer.allocateDirect(param0.length);
          this.field_f.position(0);
          this.field_f.put(param0);
          if (param1 != 21820) {
            ll.b((byte) -82);
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ll.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final byte[] a(int param0) {
        byte[] var4 = null;
        byte[] var2 = null;
        byte[] var4Lifetime1;
        byte[] var2Lifetime1;
        if (param0 == 2) {
          var4 = new byte[this.field_f.capacity()];
          var2 = var4;
          this.field_f.position(0);
          this.field_f.get(var4);
          return var4;
        }
        ea var3 = (ea) null;
        ll.a((int[][][]) null, -84, 70, (ea) null, 83);
        var4Lifetime1 = new byte[this.field_f.capacity()];
        var2Lifetime1 = var4Lifetime1;
        this.field_f.position(0);
        this.field_f.get(var4Lifetime1);
        return var4Lifetime1;
    }

    ll() {
    }

    final static int a(int[][][] param0, int param1, int param2, ea param3, int param4) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 2) {
            stackIn_3_0 = param0[param4][param3.field_i][param3.field_k] + (-param0[param4][param3.field_i][param3.field_e] + (-param0[param4][param3.field_d][param3.field_k] + param0[param4][param3.field_d][param3.field_e]));
            return stackIn_3_0;
          }
          if (param1 <= 81) {
            field_m = (ut) null;
          }
          if (param2 == 1) {
            stackIn_8_0 = param0[param3.field_c][param4][param3.field_k] + (-param0[param3.field_c][param4][param3.field_e] - param0[param3.field_l][param4][param3.field_k]) + param0[param3.field_l][param4][param3.field_e];
            return stackIn_8_0;
          }
          if (param2 != 0) {
            stackIn_13_0 = 0;
            return stackIn_13_0;
          }
          stackIn_11_0 = param0[param3.field_c][param3.field_i][param4] + (-param0[param3.field_l][param3.field_i][param4] + param0[param3.field_l][param3.field_d][param4]) - param0[param3.field_c][param3.field_d][param4];
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ll.H(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_h = "Please try changing the following settings:  ";
        field_k = new ko(1);
        field_l = "Up to 16 players compete in <col=ffff00>1 vs 1 games</col> to be the ultimate winner in a <col=ffff00>knockout competition.</col>";
        field_j = new int[4];
        field_i = -1;
    }
}
