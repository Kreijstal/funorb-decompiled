/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends qf {
    static dk field_h;
    private java.nio.ByteBuffer field_i;
    static int[] field_j;

    final byte[] a(int param0) {
        byte[] var4 = new byte[this.field_i.capacity()];
        byte[] var2 = var4;
        int var3 = -11 % ((param0 - 25) / 56);
        this.field_i.position(0);
        this.field_i.get(var4);
        return var4;
    }

    final void a(byte param0, byte[] param1) {
        try {
          this.field_i = java.nio.ByteBuffer.allocateDirect(param1.length);
          int var3_int = 43 % ((-43 - param0) / 42);
          this.field_i.position(0);
          this.field_i.put(param1);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ig.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(mi param0, int param1, byte param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = param0.c(param1, (byte) 72);
          var3 = var4;
          if (var4 == null) {
            return false;
          }
          if (param2 < 35) {
            field_h = (dk) null;
          }
          lc.a(false, var4);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("ig.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2, int param3) {
        int var5 = 125 % ((param2 - 2) / 37);
        int var4 = 88 * param3 >> 16;
        int var6 = fn.field_b;
        int var7 = 472 - var4;
        fn.field_b = var7;
        dn.field_c[param0].c(param1, 384);
        fn.field_b = var6;
    }

    public static void c(int param0) {
        if (param0 != -6348) {
          ig.c(78);
          field_j = null;
          field_h = null;
          return;
        }
        field_j = null;
        field_h = null;
    }

    ig() {
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param1 != 0) {
            return false;
          }
          param0 = sc.a(param0, '_', "", -78);
          var3 = pn.a(-1, param0);
          stackIn_8_0 = (param2.indexOf(param0) != -1) || (param2.indexOf(var3) != -1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("ig.H(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_j = new int[]{66, 76, 4, 4, 7, 10, 17, 17, 23, 24, 25, 25, 7, 28, 31, 31, 23, 32, 38, 38, 44, 45, 50, 51, 45, 59};
    }
}
