/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm extends dp {
    private java.nio.ByteBuffer field_c;
    static hc field_d;
    static int[] field_e;

    final byte[] a(int param0) {
        java.nio.ByteBuffer discarded$12 = null;
        java.nio.ByteBuffer discarded$13 = null;
        byte[] var2 = null;
        byte[] var3 = null;
        var3 = new byte[this.field_c.capacity()];
        var2 = var3;
        java.nio.Buffer discarded$11 = this.field_c.position(0);
        if (param0 != -21056) {
          field_e = (int[]) null;
          discarded$12 = this.field_c.get(var3);
          return var3;
        } else {
          discarded$13 = this.field_c.get(var3);
          return var3;
        }
    }

    public static void c(int param0) {
        int var1 = 69 / ((param0 - -2) / 42);
        field_e = null;
        field_d = null;
    }

    final static void a(int param0, int param1) {
        q var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        qp var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Torquing.field_u;
        try {
          L0: {
            var4 = (qp) ((Object) tl.field_p.b(param1 + 0));
            L1: while (true) {
              if (var4 == null) {
                var2 = to.field_q.b(param1);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    hj.a(false, param0);
                    var2 = to.field_q.f(-24059);
                    continue L2;
                  }
                }
              } else {
                l.a(param0, var4, param1 + 1);
                var4 = (qp) ((Object) tl.field_p.f(param1 + -24059));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2_ref), "jm.B(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, byte[] param1) {
        java.nio.Buffer discarded$0 = null;
        java.nio.ByteBuffer discarded$1 = null;
        try {
            this.field_c = java.nio.ByteBuffer.allocateDirect(param1.length);
            if (param0 > -11) {
                jm.c(28);
            }
            discarded$0 = this.field_c.position(0);
            discarded$1 = this.field_c.put(param1);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "jm.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, String param1) {
        if (param0 != 3) {
          jm.c(61);
          System.out.println("Error: " + sp.a(param1, "%0a", "\n", (byte) -82));
          return;
        } else {
          System.out.println("Error: " + sp.a(param1, "%0a", "\n", (byte) -82));
          return;
        }
    }

    jm() {
    }

    final static void a(boolean param0, int param1) {
        dc.field_a.a(0, 0, (byte) 113);
        if (param1 <= -85) {
            return;
        }
        jm.a(63, 58);
    }

    static {
        field_e = new int[3];
    }
}
