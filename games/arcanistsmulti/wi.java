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
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 0) {
            stackIn_6_0 = ((param1[param0 >> 5] & 1 << (param0 & 31)) != 0);
            return stackIn_6_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("wi.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
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
        byte[] var4 = new byte[this.field_k.capacity()];
        byte[] var2 = var4;
        if (param0 < 0) {
          this.field_k.position(0);
          this.field_k.get(var4);
          return var4;
        }
        int[] var3 = (int[]) null;
        wi.a(20, (int[]) null, -59);
        this.field_k.position(0);
        this.field_k.get(var4);
        return var4;
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
