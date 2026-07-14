/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends qf {
    static dk field_h;
    private java.nio.ByteBuffer field_i;
    static int[] field_j;

    final byte[] a(int param0) {
        byte[] var4 = new byte[((ig) this).field_i.capacity()];
        byte[] var2 = var4;
        int var3 = -11 % ((param0 - 25) / 56);
        java.nio.Buffer discarded$0 = ((ig) this).field_i.position(0);
        java.nio.ByteBuffer discarded$1 = ((ig) this).field_i.get(var4);
        return var4;
    }

    final void a(byte param0, byte[] param1) {
        ((ig) this).field_i = java.nio.ByteBuffer.allocateDirect(param1.length);
        int var3 = 43 % ((-43 - param0) / 42);
        java.nio.Buffer discarded$0 = ((ig) this).field_i.position(0);
        java.nio.ByteBuffer discarded$1 = ((ig) this).field_i.put(param1);
    }

    final static boolean a(mi param0, int param1, byte param2) {
        byte[] var3 = null;
        byte[] var4 = null;
        var4 = param0.c(param1, (byte) 72);
        var3 = var4;
        if (var4 == null) {
          return false;
        } else {
          if (param2 < 35) {
            field_h = null;
            lc.a(false, var4);
            return true;
          } else {
            lc.a(false, var4);
            return true;
          }
        }
    }

    final static void a(int param0, int param1, byte param2, int param3) {
        int var5 = 125 % ((param2 - 2) / 37);
        int var4 = 88 * param3 >> 217456656;
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
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param1 == 0) {
          param0 = sc.a(param0, '_', "", -78);
          var3 = pn.a(-1, param0);
          if (0 == param2.indexOf(param0)) {
            if (0 != param2.indexOf(var3)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[]{66, 76, 4, 4, 7, 10, 17, 17, 23, 24, 25, 25, 7, 28, 31, 31, 23, 32, 38, 38, 44, 45, 50, 51, 45, 59};
    }
}
