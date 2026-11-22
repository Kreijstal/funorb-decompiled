/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectByteStorage extends ByteStorage {
    private java.nio.ByteBuffer buffer;
    static Level field_d;
    static int[] field_e;

    final byte[] getBytes(int param0) {
        byte[] var3 = new byte[this.buffer.capacity()];
        byte[] var2 = var3;
        this.buffer.position(0);
        if (param0 == -21056) {
          this.buffer.get(var3);
          return var3;
        }
        field_e = (int[]) null;
        this.buffer.get(var3);
        return var3;
    }

    public static void c(int param0) {
        int var1 = 69 / ((param0 + 2) / 42);
        field_e = null;
        field_d = null;
    }

    final static void a(int param0, int param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        qp var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Torquing.field_u;
        try {
          var4 = (qp) (tl.field_p.beginBackward(param1 + 0));
          while (var4 != null) {
            l.a(param0, var4, param1 + 1);
            var4 = (qp) (tl.field_p.nextBackward(param1 - 24059));
          }
          var2 = to.field_q.beginBackward(param1);
          while (var2 != null) {
            hj.a(false, param0);
            var2 = to.field_q.nextBackward(-24059);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rb.wrapThrowable((Throwable) ((Object) var2_ref), "jm.B(" + param0 + ',' + param1 + ')');
        }
    }

    final void setBytes(byte param0, byte[] param1) {
        try {
          this.buffer = java.nio.ByteBuffer.allocateDirect(param1.length);
          if (param0 > -11) {
            DirectByteStorage.c(28);
          }
          this.buffer.position(0);
          this.buffer.put(param1);
        } catch (RuntimeException runtimeException) {
          throw rb.wrapThrowable((Throwable) ((Object) runtimeException), "jm.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, String param1) {
        if (param0 == 3) {
          System.out.println("Error: " + sp.a(param1, "%0a", "\n", (byte) -82));
          return;
        }
        DirectByteStorage.c(61);
        System.out.println("Error: " + sp.a(param1, "%0a", "\n", (byte) -82));
    }

    DirectByteStorage() {
    }

    final static void a(boolean param0, int param1) {
        dc.field_a.a(0, 0, (byte) 113);
        if (param1 <= -85) {
          return;
        }
        DirectByteStorage.a(63, 58);
    }

    static {
        field_e = new int[3];
    }
}
