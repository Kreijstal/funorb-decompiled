/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o extends pb {
    jh field_w;
    int field_x;
    byte[] field_y;

    final int g(int param0) {
        if (param0 == 0) {
          if (((o) this).field_u) {
            return 0;
          } else {
            return 100;
          }
        } else {
          ((o) this).field_w = null;
          if (((o) this).field_u) {
            return 0;
          } else {
            return 100;
          }
        }
    }

    final static void a(int param0, wc param1, int param2) {
        pk var5 = null;
        int var4 = 0;
        try {
            var5 = fj.field_q;
            pk var3 = var5;
            var5.a(6, (byte) -107);
            var5.field_f = var5.field_f + 1;
            var4 = var5.field_f;
            var5.d((byte) 127, 1);
            if (null != param1.field_f) {
                var5.d((byte) -124, param1.field_f.length);
                var5.a(param1.field_f.length, -97, param1.field_f, 0);
            } else {
                var5.d((byte) 121, 0);
            }
            int discarded$0 = var5.d(110, var4);
            var5.field_f = var5.field_f - param2;
            param1.field_h = var5.a((byte) -54);
            var5.f(param2 ^ 11696, var5.field_f - var4);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "o.E(" + 6 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final byte[] e(int param0) {
        if (param0 != 397) {
            return null;
        }
        if (!(!((o) this).field_u)) {
            throw new RuntimeException();
        }
        return ((o) this).field_y;
    }

    o() {
    }

    static {
    }
}
