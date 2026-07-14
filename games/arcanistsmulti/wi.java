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
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param2 != 0) {
          return true;
        } else {
          L0: {
            if ((param1[param0 >> 445210789] & 1 << (param0 & 31)) == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
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
        ((wi) this).field_k = java.nio.ByteBuffer.allocateDirect(param1.length);
        int var3 = -111 / ((param0 - 25) / 44);
        java.nio.Buffer discarded$0 = ((wi) this).field_k.position(0);
        java.nio.ByteBuffer discarded$1 = ((wi) this).field_k.put(param1);
    }

    final byte[] b(byte param0) {
        byte[] var2 = null;
        Object var3 = null;
        byte[] var4 = null;
        var4 = new byte[((wi) this).field_k.capacity()];
        var2 = var4;
        if (param0 >= 0) {
          var3 = null;
          boolean discarded$10 = wi.a(20, (int[]) null, -59);
          java.nio.Buffer discarded$11 = ((wi) this).field_k.position(0);
          java.nio.ByteBuffer discarded$12 = ((wi) this).field_k.get(var4);
          return var4;
        } else {
          java.nio.Buffer discarded$13 = ((wi) this).field_k.position(0);
          java.nio.ByteBuffer discarded$14 = ((wi) this).field_k.get(var4);
          return var4;
        }
    }

    wi() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
        field_i = "Just one target left; you're almost there!";
        field_g = "Asking for or providing contact information";
        field_j = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
