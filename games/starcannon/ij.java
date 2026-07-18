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
        int discarded$0 = 1;
        ea.field_a.a(false, param1, -1, td.a(pe.field_d, la.field_c));
    }

    final void a(int param0, byte[] param1) {
        try {
            ((ij) this).field_g = java.nio.ByteBuffer.allocateDirect(param1.length);
            if (param0 != -5361) {
                field_f = null;
            }
            java.nio.Buffer discarded$0 = ((ij) this).field_g.position(0);
            java.nio.ByteBuffer discarded$1 = ((ij) this).field_g.put(param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ij.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static qb a(String param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!qa.field_a.b(false)) {
              break L0;
            } else {
              if (param0.equals((Object) (Object) qa.field_a.a((byte) 2))) {
                break L0;
              } else {
                qa.field_a = uf.a(param0, 17);
                break L0;
              }
            }
          }
          return qa.field_a;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ij.J(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -51 + ')');
        }
    }

    public static void b() {
        field_f = null;
    }

    final byte[] a(int param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        if (param0 != 4208) {
          return null;
        } else {
          var3 = new byte[((ij) this).field_g.capacity()];
          var2 = var3;
          java.nio.Buffer discarded$4 = ((ij) this).field_g.position(0);
          java.nio.ByteBuffer discarded$5 = ((ij) this).field_g.get(var3);
          return var3;
        }
    }

    ij() {
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            hi.a(0, "", param1);
            int discarded$0 = 0;
            wj.a(param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ij.K(" + 18065 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
