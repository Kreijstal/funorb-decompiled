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
        if (param0 >= 72) {
          return el.field_E == dj.field_a ? true : false;
        }
        byte[] var2 = (byte[]) null;
        sa.a(53, (byte[]) null);
        return el.field_E == dj.field_a ? true : false;
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
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (bm) (stackIn_2_0);
          }
          var2 = new bm(param1, ak.field_c, vi.field_c, vc.field_b, ih.field_d, gj.field_w, ih.field_b);
          if (param0 != 2376) {
            field_g = (pb[]) null;
          }
          tb.f((byte) -62);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("sa.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
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
