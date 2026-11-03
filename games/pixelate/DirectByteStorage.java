/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectByteStorage extends ByteStorage {
    static boolean[][] field_h;
    static String field_m;
    private java.nio.ByteBuffer buffer;
    static int field_k;
    static String field_i;
    static String field_n;
    static String field_l;

    DirectByteStorage() {
    }

    final static boolean b(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        hf var3 = null;
        boolean stackIn_8_0 = false;
        Throwable decompiledCaughtException = null;
        var1 = mc.field_r;
        synchronized (var1) {
          if (param0 < 105) {
            var3 = (hf) null;
            DirectByteStorage.a(42, (hf) null, -69);
          }
          if (ln.field_p == qn.field_p) {
            return false;
          }
          ke.field_a = ArchiveRequest.field_z[qn.field_p];
          nj.field_f = ResourceArchive.field_d[qn.field_p];
          qn.field_p = 1 + qn.field_p & 127;
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    final byte[] toByteArray(int param0) {
        byte[] var3 = new byte[this.buffer.capacity()];
        byte[] var2 = var3;
        this.buffer.position(0);
        this.buffer.get(var3);
        if (param0 == 32) {
          return var3;
        }
        return (byte[]) null;
    }

    public static void a(byte param0) {
        field_h = (boolean[][]) null;
        if (param0 >= 71) {
          field_l = null;
          field_i = null;
          field_m = null;
          field_n = null;
          return;
        }
        DirectByteStorage.$cfr$intArgs$b$c4997cb15529(-16);
        field_l = null;
        field_i = null;
        field_m = null;
        field_n = null;
    }

    final static void a(int param0, hf param1, int param2) {
        try {
          int var3_int = 113 / ((59 - param0) / 39);
          dh.field_a.addFirst(22125, param1);
          id.a((byte) -109, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "bh.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void setBytes(byte[] param0, boolean param1) {
        try {
          this.buffer = java.nio.ByteBuffer.allocateDirect(param0.length);
          if (!param1) {
            field_m = (String) null;
          }
          this.buffer.position(0);
          this.buffer.put(param0);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "bh.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_m = "to return to the normal view.";
        field_i = "The following settings need to be changed:  ";
        field_l = "Honour";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static boolean $cfr$intArgs$b$c4997cb15529(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        hf var3 = null;
        boolean stackIn_8_0 = false;
        Throwable decompiledCaughtException = null;
        var1 = mc.field_r;
        synchronized (var1) {
          if (param0 < 105) {
            var3 = (hf) null;
            DirectByteStorage.a(42, (hf) null, -69);
          }
          if (ln.field_p == qn.field_p) {
            return false;
          }
          ke.field_a = ArchiveRequest.field_z[qn.field_p];
          nj.field_f = ResourceArchive.field_d[qn.field_p];
          qn.field_p = 1 + qn.field_p & 127;
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }
}
