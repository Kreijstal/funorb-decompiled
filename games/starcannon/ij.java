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
        java.nio.Buffer discarded$0 = null;
        java.nio.ByteBuffer discarded$1 = null;
        try {
            this.field_g = java.nio.ByteBuffer.allocateDirect(param1.length);
            if (param0 != -5361) {
                field_f = (ka) null;
            }
            discarded$0 = this.field_g.position(0);
            discarded$1 = this.field_g.put(param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ij.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static qb a(String param0, byte param1) {
        RuntimeException var2 = null;
        qb stackIn_5_0 = null;
        qb stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        qb stackOut_6_0 = null;
        qb stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
              stackOut_6_0 = qa.field_a;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_4_0 = (qb) null;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("ij.J(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
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
        java.nio.Buffer discarded$4 = null;
        java.nio.ByteBuffer discarded$5 = null;
        byte[] var2 = null;
        byte[] var3 = null;
        if (param0 != 4208) {
          return (byte[]) null;
        } else {
          var3 = new byte[this.field_g.capacity()];
          var2 = var3;
          discarded$4 = this.field_g.position(0);
          discarded$5 = this.field_g.get(var3);
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
