/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends kk {
    static ka field_f;
    private java.nio.ByteBuffer field_g;

    final static void a(int param0, boolean param1) {
        rk.field_a = kk.field_a;
        ag.field_o = 0;
        ck.field_f = 0;
        fk.field_a = param0;
        ea.field_a = new n(2);
        ea.field_a.a(false, param1, -1, td.a(pe.field_d, la.field_c, true));
    }

    final void a(int param0, byte[] param1) {
        try {
            this.field_g = java.nio.ByteBuffer.allocateDirect(param1.length);
            if (param0 != -5361) {
                field_f = (ka) null;
            }
            this.field_g.position(0);
            this.field_g.put(param1);
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!qa.field_a.b(false)) {
                break L1;
              } else {
                if (param0.equals(qa.field_a.a((byte) 2))) {
                  break L1;
                } else {
                  qa.field_a = uf.a(param0, 17);
                  break L1;
                }
              }
            }
            if (param1 == -51) {
              stackIn_7_0 = qa.field_a;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = (qb) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("ij.J(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    public static void b(int param0) {
        if (param0 != 20756) {
            return;
        }
        field_f = null;
    }

    final byte[] a(int param0) {
        byte[] var2;
        byte[] var3;
        if (param0 != 4208) {
          return (byte[]) null;
        } else {
          var3 = new byte[this.field_g.capacity()];
          var2 = var3;
          this.field_g.position(0);
          this.field_g.get(var3);
          return var3;
        }
    }

    ij() {
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            hi.a(0, "", param1);
            if (param0 != 18065) {
                field_f = (ka) null;
            }
            wj.a(param1, 0);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ij.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
