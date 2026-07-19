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
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Pool.field_O;
        try {
          L0: {
            bb.a(gr.field_z, jh.field_c, 0, q.field_a, param1, (byte) -63, param0);
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= jh.field_c) {
                L2: {
                  bb.a(rn.field_d, jh.field_c - -param1, param1, jl.field_c, param1 + param1, (byte) -74, false);
                  if (jh.field_c > param1) {
                    jh.field_c = param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                break L0;
              } else {
                ep.field_H[var2_int + param1] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "sp.F(" + param0 + ',' + param1 + ')');
        }
    }

    final byte[] b(boolean param0) {
        if (!param0) {
          L0: {
            if (this.field_F) {
              break L0;
            } else {
              if (this.field_K.field_v < this.field_K.field_t.length + -this.field_L) {
                break L0;
              } else {
                return this.field_K.field_t;
              }
            }
          }
          throw new RuntimeException();
        } else {
          return (byte[]) null;
        }
    }

    sp() {
    }

    final int e(int param0) {
        if (null == this.field_K) {
            return 0;
        }
        if (param0 <= 6) {
            return 22;
        }
        return 100 * this.field_K.field_v / (this.field_K.field_t.length - this.field_L);
    }

    static {
    }
}
