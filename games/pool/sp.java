/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sp extends gr {
    byte field_L;
    ge field_K;
    int field_J;

    final static boolean h(int param0) {
        if (param0 != 0) {
            return true;
        }
        return pa.field_I == ra.field_e ? true : false;
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = Pool.field_O;
        bb.a(gr.field_z, jh.field_c, 0, q.field_a, param1, (byte) -63, param0);
        for (var2 = 0; var2 < jh.field_c; var2++) {
            ep.field_H[var2 + param1] = var2;
        }
        bb.a(rn.field_d, jh.field_c - -param1, param1, jl.field_c, param1 + param1, (byte) -74, false);
        if (!(jh.field_c <= param1)) {
            jh.field_c = param1;
        }
    }

    final byte[] b(boolean param0) {
        if (!param0) {
          L0: {
            if (((sp) this).field_F) {
              break L0;
            } else {
              if (((sp) this).field_K.field_v < ((sp) this).field_K.field_t.length + -((sp) this).field_L) {
                break L0;
              } else {
                return ((sp) this).field_K.field_t;
              }
            }
          }
          throw new RuntimeException();
        } else {
          return null;
        }
    }

    sp() {
    }

    final int e(int param0) {
        if (null == ((sp) this).field_K) {
            return 0;
        }
        if (param0 <= 6) {
            return 22;
        }
        return 100 * ((sp) this).field_K.field_v / (((sp) this).field_K.field_t.length - ((sp) this).field_L);
    }

    static {
    }
}
