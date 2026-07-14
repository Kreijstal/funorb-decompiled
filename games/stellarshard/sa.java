/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends i {
    static int field_h;
    static pb[] field_g;
    static int field_i;
    private java.nio.ByteBuffer field_f;

    final byte[] a(int param0) {
        byte[] var4 = new byte[((sa) this).field_f.capacity()];
        byte[] var2 = var4;
        java.nio.Buffer discarded$0 = ((sa) this).field_f.position(0);
        int var3 = 12 / ((param0 - 74) / 44);
        java.nio.ByteBuffer discarded$1 = ((sa) this).field_f.get(var4);
        return var4;
    }

    final static boolean a(byte param0) {
        Object var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 72) {
          L0: {
            var2 = null;
            bm discarded$6 = sa.a(53, (byte[]) null);
            if (el.field_E != dj.field_a) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (el.field_E != dj.field_a) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void c(int param0) {
        if (param0 != -17002) {
            boolean discarded$0 = sa.a((byte) -29);
            field_g = null;
            return;
        }
        field_g = null;
    }

    final void a(byte[] param0, byte param1) {
        ((sa) this).field_f = java.nio.ByteBuffer.allocateDirect(param0.length);
        java.nio.Buffer discarded$0 = ((sa) this).field_f.position(0);
        java.nio.ByteBuffer discarded$1 = ((sa) this).field_f.put(param0);
        int var3 = -42 % ((param1 - 19) / 40);
    }

    final static bm a(int param0, byte[] param1) {
        bm var2 = null;
        if (param1 != null) {
          var2 = new bm(param1, ak.field_c, vi.field_c, vc.field_b, ih.field_d, gj.field_w, ih.field_b);
          if (param0 != 2376) {
            field_g = null;
            tb.f((byte) -62);
            return var2;
          } else {
            tb.f((byte) -62);
            return var2;
          }
        } else {
          return null;
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    sa() {
    }

    static {
    }
}
