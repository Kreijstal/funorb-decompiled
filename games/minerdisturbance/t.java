/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t extends ni {
    static String field_d;
    private java.nio.ByteBuffer field_e;
    static volatile int field_c;

    final void a(byte param0, byte[] param1) {
        int var3 = 33 % ((param0 - -54) / 63);
        ((t) this).field_e = java.nio.ByteBuffer.allocateDirect(param1.length);
        java.nio.Buffer discarded$0 = ((t) this).field_e.position(0);
        java.nio.ByteBuffer discarded$1 = ((t) this).field_e.put(param1);
    }

    public static void b(int param0) {
        field_d = null;
        if (param0 != 0) {
            t.b(56);
        }
    }

    final static void a(boolean param0, String param1, int param2) {
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          wc.field_b = true;
          if (!param0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        oh.field_F = stackIn_3_0 != 0;
        sj.field_h = new rg(mb.field_b, cn.field_g, param1, gd.field_B, oh.field_F);
        if (param2 != 0) {
          return;
        } else {
          mb.field_b.b(1, (fe) (Object) sj.field_h);
          return;
        }
    }

    final byte[] a(int param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        var3 = new byte[((t) this).field_e.capacity()];
        var2 = var3;
        if (param0 != 3006) {
          ((t) this).field_e = null;
          java.nio.Buffer discarded$8 = ((t) this).field_e.position(0);
          java.nio.ByteBuffer discarded$9 = ((t) this).field_e.get(var3);
          return var3;
        } else {
          java.nio.Buffer discarded$10 = ((t) this).field_e.position(0);
          java.nio.ByteBuffer discarded$11 = ((t) this).field_e.get(var3);
          return var3;
        }
    }

    t() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Confirm Password: ";
        field_c = 0;
    }
}
