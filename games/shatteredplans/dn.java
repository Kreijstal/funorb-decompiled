/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn extends hb {
    static String field_k;
    static vd field_h;
    private db field_i;
    static String field_g;
    static int field_l;
    static qr field_f;
    static String field_j;

    final static String a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              var3 = new char[var2_int];
              if (param1) {
                break L1;
              } else {
                field_j = (String) null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackOut_6_0 = new String(var3);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3[-var4 + var2_int + -1] = param0.charAt(var4);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("dn.C(");
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
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(int param0, fk param1, byte param2) {
        sl var5 = null;
        int var4 = 0;
        int discarded$0 = 0;
        try {
            if (param2 != 13) {
                field_f = (qr) null;
            }
            var5 = js.field_f;
            sl var3 = var5;
            var5.h(param0, 255);
            var5.field_j = var5.field_j + 1;
            var4 = var5.field_j;
            var5.c(1, (byte) -60);
            if (param1.field_n != null) {
                var5.c(param1.field_n.length, (byte) -66);
                var5.a(0, param1.field_n.length, param1.field_n, 22186);
            } else {
                var5.c(0, (byte) -76);
            }
            discarded$0 = var5.a(var4, param2 ^ -40);
            var5.field_j = var5.field_j - 4;
            param1.field_j = var5.a(16711680);
            var5.b(var5.field_j - var4, (byte) 119);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "dn.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static gq[] a(int param0) {
        if (param0 != 4) {
          return (gq[]) null;
        } else {
          return new gq[]{on.field_g, nd.field_c, td.field_O, ss.field_c, cl.field_p, kf.field_c, tf.field_j, na.field_I, ld.field_h, lc.field_b, m.field_A, mc.field_r, ks.field_a, ro.field_c};
        }
    }

    public static void d(byte param0) {
        field_f = null;
        field_k = null;
        if (param0 != -107) {
          field_h = (vd) null;
          field_j = null;
          field_g = null;
          field_h = null;
          return;
        } else {
          field_j = null;
          field_g = null;
          field_h = null;
          return;
        }
    }

    final oh a(boolean param0) {
        oh discarded$0 = null;
        if (param0) {
            discarded$0 = this.a((byte) -124);
            return (oh) ((Object) this.field_i.b(32));
        }
        return (oh) ((Object) this.field_i.b(32));
    }

    final oh a(byte param0) {
        if (param0 < 99) {
            field_k = (String) null;
            return (oh) ((Object) this.field_i.c(-127));
        }
        return (oh) ((Object) this.field_i.c(-127));
    }

    final int b(byte param0) {
        if (param0 != -61) {
            return -111;
        }
        return this.field_i.c((byte) -73);
    }

    dn(db param0) {
        try {
            this.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "dn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Email is valid";
        field_j = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
