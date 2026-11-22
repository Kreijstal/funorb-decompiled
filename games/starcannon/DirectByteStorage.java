/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectByteStorage extends ByteStorage {
    static PlatformTaskDispatcher field_f;
    private java.nio.ByteBuffer buffer;

    final static void a(int param0, boolean param1) {
        IntrusiveDeque.field_a = ByteStorage.field_a;
        ag.field_o = 0;
        ck.field_f = 0;
        fk.field_a = param0;
        ea.field_a = new n(2);
        ea.field_a.a(false, param1, -1, td.a(pe.field_d, la.field_c, true));
    }

    final void setBytes(int param0, byte[] param1) {
        try {
          this.buffer = java.nio.ByteBuffer.allocateDirect(param1.length);
          if (param0 != -5361) {
            field_f = (PlatformTaskDispatcher) null;
          }
          this.buffer.position(0);
          this.buffer.put(param1);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ij.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static qb a(String param0, byte param1) {
        RuntimeException var2 = null;
        qb stackIn_5_0 = null;
        qb stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (qa.field_a.b(false) &&
            !param0.equals(qa.field_a.a((byte) 2))) {
            qa.field_a = uf.a(param0, 17);
          }
          if (param1 == -51) {
            stackIn_7_0 = qa.field_a;
            return stackIn_7_0;
          }
          stackIn_5_0 = (qb) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("ij.J(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void clearStaticReferences(int param0) {
        if (param0 != 20756) {
          return;
        }
        field_f = null;
    }

    final byte[] getBytes(int param0) {
        byte[] var3 = null;
        if (param0 == 4208) {
          var3 = new byte[this.buffer.capacity()];
          byte[] var2 = var3;
          this.buffer.position(0);
          this.buffer.get(var3);
          return var3;
        }
        return (byte[]) null;
    }

    DirectByteStorage() {
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          DelegatingCanvas.a(0, "", param1);
          if (param0 != 18065) {
            field_f = (PlatformTaskDispatcher) null;
          }
          wj.a(param1, 0);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ij.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
