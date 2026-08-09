/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends i {
    static int field_h;
    static pb[] field_g;
    static int field_i;
    private java.nio.ByteBuffer field_f;

    final byte[] a(int param0) {
        byte[] var4 = new byte[this.field_f.capacity()];
        byte[] var2 = var4;
        this.field_f.position(0);
        int var3 = 12 / ((param0 - 74) / 44);
        this.field_f.get(var4);
        return var4;
    }

    final static boolean a(byte param0) {
        byte[] var2;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 < 72) {
          L0: {
            var2 = (byte[]) null;
            sa.a(53, (byte[]) null);
            if (el.field_E != dj.field_a) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (el.field_E != dj.field_a) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void c(int param0) {
        if (param0 != -17002) {
            sa.a((byte) -29);
            field_g = null;
            return;
        }
        field_g = null;
    }

    final void a(byte[] param0, byte param1) {
        try {
            this.field_f = java.nio.ByteBuffer.allocateDirect(param0.length);
            this.field_f.position(0);
            this.field_f.put(param0);
            int var3_int = -42 % ((param1 - 19) / 40);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "sa.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static bm a(int param0, byte[] param1) {
        bm var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        bm stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var2 = new bm(param1, ak.field_c, vi.field_c, vc.field_b, ih.field_d, gj.field_w, ih.field_b);
                if (param0 == 2376) {
                  break L1;
                } else {
                  field_g = (pb[]) null;
                  break L1;
                }
              }
              tb.f((byte) -62);
              stackIn_6_0 = (bm) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("sa.I(").append(param0).append(',');

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
          throw ma.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bm) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
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
