/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class toa {
    int field_a;
    int field_b;
    int[] field_c;

    final static boolean a(int param0, int param1, int param2) {
        boolean stackIn_6_0 = false;
        if (param0 != -8636) {
          return false;
        }
        stackIn_6_0 = (0 != (2048 & param1)) && (0 != (55 & param2));
        return stackIn_6_0;
    }

    final int a(int param0) {
        byte[] var3;
        int stackIn_7_0 = 0;
        if (param0 != 0) {
          var3 = (byte[]) null;
          toa.a(104, -1.1755644083023071f, 21, 1.4921725988388062f, -0.9892958402633667f, (byte) 76, (vjb) null, -0.3563171923160553f, -2, 1.3547749519348145f, 48, -53, (byte[]) null);
        }
        if (this.field_c != null &&
          this.field_c.length != 0) {
          stackIn_7_0 = this.field_c[this.field_c.length - 1];
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
    }

    final static void a(int param0, float param1, int param2, float param3, float param4, byte param5, vjb param6, float param7, int param8, float param9, int param10, int param11, byte[] param12) {
        int var13_int = 0;
        int var14 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var13 = null;
        var14 = VoidHunters.field_G;
        try {
          if (param5 >= -38) {
            toa.a(80, -3, -102);
          }
          for (var13_int = 0; param2 > var13_int; var13_int++) {
            nq.a(param7, param10, param1, param0, param11, var13_int, param9, param6, param2, param3, param8, param12, (byte) 126, param4);
            param8 = param8 + param0 * param11;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_9_0 = var13;
          stackIn_9_1 = new StringBuilder().append("toa.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    toa(int param0, int param1, int param2) {
        this.field_a = param1;
        this.field_b = param0;
        this.field_c = new int[1 + param2];
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        int var3;
        int var5;
        var5 = VoidHunters.field_G;
        var3 = -63 / ((-8 - param0) / 54);
        if (this.field_c != null &&
          this.field_c.length != 0) {
          for (var4 = 1; var4 < this.field_c.length; var4++) {
            if (param1 < (this.field_c[var4 - 1] + this.field_c[var4] >> 1)) {
              return var4 - 1;
            }
          }
          return this.field_c.length - 1;
        }
        return 0;
    }

    static {
    }
}
