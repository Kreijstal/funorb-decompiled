/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends bg {
    static int field_h;
    static String field_i;
    static String field_g;
    static na field_f;
    private java.nio.ByteBuffer field_k;
    static String field_j;

    final static boolean a(int param0, int[] param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 0) {
              L1: {
                if ((param1[param0 >> 445210789] & 1 << (param0 & 31)) == 0) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("wi.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 <= 86) {
            return;
        }
        field_g = null;
        field_j = null;
        field_f = null;
    }

    final void a(int param0, byte[] param1) {
        try {
            this.field_k = java.nio.ByteBuffer.allocateDirect(param1.length);
            int var3_int = -111 / ((param0 - 25) / 44);
            this.field_k.position(0);
            this.field_k.put(param1);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "wi.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final byte[] b(byte param0) {
        byte[] var2;
        int[] var3;
        byte[] var4;
        var4 = new byte[this.field_k.capacity()];
        var2 = var4;
        if (param0 >= 0) {
          var3 = (int[]) null;
          wi.a(20, (int[]) null, -59);
          this.field_k.position(0);
          this.field_k.get(var4);
          return var4;
        } else {
          this.field_k.position(0);
          this.field_k.get(var4);
          return var4;
        }
    }

    wi() {
    }

    static {
        field_h = 0;
        field_i = "Just one target left; you're almost there!";
        field_g = "Asking for or providing contact information";
        field_j = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
