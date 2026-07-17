/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static String field_f;
    private int field_c;
    int field_d;
    hb[] field_a;
    static int field_e;
    String field_b;

    public static void a(boolean param0) {
        field_f = null;
    }

    final static String a(CharSequence param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var2 = kk.a(true, ko.a(param0, -13820));
              if (var2 != null) {
                break L1;
              } else {
                var2 = "";
                break L1;
              }
            }
            stackOut_4_0 = (String) var2;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2_ref;
            stackOut_6_1 = new StringBuilder().append("ok.E(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + -6126 + 41);
        }
        return stackIn_5_0;
    }

    final void a(hb param0, int param1) {
        int var3_int = 0;
        hb[] var4 = null;
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        try {
            if (!(((ok) this).field_c >= ((ok) this).field_d - -1)) {
                var3_int = 1 + ((ok) this).field_c;
                var4 = new hb[var3_int];
                for (var5 = 0; var5 < ((ok) this).field_d; var5++) {
                    var4[var5] = ((ok) this).field_a[var5];
                }
                ((ok) this).field_c = var3_int;
                ((ok) this).field_a = var4;
            }
            int fieldTemp$0 = ((ok) this).field_d;
            ((ok) this).field_d = ((ok) this).field_d + 1;
            ((ok) this).field_a[fieldTemp$0] = param0;
            var3_int = -24 % ((param1 - -5) / 37);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "ok.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    ok() {
        ((ok) this).field_a = null;
        ((ok) this).field_d = 0;
        ((ok) this).field_b = null;
        ((ok) this).field_c = 0;
    }

    final static void a(int param0) {
        tn.field_h[kf.field_F] = tc.field_b;
        ce.field_q[kf.field_F] = tc.field_d;
        dm.field_b[kf.field_F] = tc.field_e;
        m.field_c[kf.field_F] = tc.field_a;
        mk.field_n[kf.field_F] = tc.field_i;
        gd.field_c[kf.field_F] = tc.field_j;
        bd.field_V[kf.field_F] = tc.field_c;
        kf.field_F = kf.field_F + 1;
    }

    final static boolean a(byte param0) {
        if (param0 != 55) {
            boolean discarded$0 = ok.a((byte) 60);
        }
        if (ad.field_c == -1) {
            if (!(hi.b(1, (byte) 40))) {
                return false;
            }
            ad.field_c = rd.field_e.f((byte) -72);
            rd.field_e.field_l = 0;
        }
        if (!(ad.field_c != -2)) {
            if (!(hi.b(2, (byte) 40))) {
                return false;
            }
            ad.field_c = rd.field_e.k(62);
            rd.field_e.field_l = 0;
        }
        return hi.b(ad.field_c, (byte) 40);
    }

    static {
    }
}
