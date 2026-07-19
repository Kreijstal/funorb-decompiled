/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj extends ke {
    static int field_j;
    private java.nio.ByteBuffer field_h;
    static fa field_i;
    static String field_k;
    static he field_l;

    final void a(byte[] param0, boolean param1) {
        java.nio.Buffer discarded$0 = null;
        java.nio.ByteBuffer discarded$1 = null;
        try {
            this.field_h = java.nio.ByteBuffer.allocateDirect(param0.length);
            if (param1) {
                field_i = (fa) null;
            }
            discarded$0 = this.field_h.position(0);
            discarded$1 = this.field_h.put(param0);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "nj.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final byte[] c(boolean param0) {
        java.nio.Buffer discarded$8 = null;
        java.nio.ByteBuffer discarded$9 = null;
        java.nio.Buffer discarded$10 = null;
        java.nio.ByteBuffer discarded$11 = null;
        byte[] var2 = null;
        byte[] var3 = null;
        byte[] var4 = null;
        var4 = new byte[this.field_h.capacity()];
        var2 = var4;
        if (param0) {
          var3 = (byte[]) null;
          this.a((byte[]) null, true);
          discarded$8 = this.field_h.position(0);
          discarded$9 = this.field_h.get(var4);
          return var4;
        } else {
          discarded$10 = this.field_h.position(0);
          discarded$11 = this.field_h.get(var4);
          return var4;
        }
    }

    public static void a(int param0) {
        field_k = null;
        if (param0 != 0) {
            field_k = (String) null;
            field_l = null;
            field_i = null;
            return;
        }
        field_l = null;
        field_i = null;
    }

    nj() {
    }

    static {
        field_k = "members-only content";
    }
}
