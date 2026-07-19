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
        if (param0) {
            field_f = (String) null;
        }
    }

    final static String a(CharSequence param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param1 == -6126) {
              L1: {
                var2 = kk.a(true, ko.a(param0, -13820));
                if (var2 != null) {
                  break L1;
                } else {
                  var2 = "";
                  break L1;
                }
              }
              stackOut_5_0 = (String) (var2);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (String) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("ok.E(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    final void a(hb param0, int param1) {
        hb[] var4 = null;
        int var5 = 0;
        int fieldTemp$0 = 0;
        int var3_int = 0;
        int var6 = HoldTheLine.field_D;
        try {
            if (!(this.field_c >= this.field_d - -1)) {
                var3_int = 1 + this.field_c;
                var4 = new hb[var3_int];
                for (var5 = 0; var5 < this.field_d; var5++) {
                    var4[var5] = this.field_a[var5];
                }
                this.field_c = var3_int;
                this.field_a = var4;
            }
            fieldTemp$0 = this.field_d;
            this.field_d = this.field_d + 1;
            this.field_a[fieldTemp$0] = param0;
            var3_int = -24 % ((param1 - -5) / 37);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ok.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ok() {
        this.field_a = null;
        this.field_d = 0;
        this.field_b = null;
        this.field_c = 0;
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
        if (param0 != 32381) {
            field_e = 50;
        }
    }

    final static boolean a(byte param0) {
        boolean discarded$0 = false;
        if (param0 != 55) {
            discarded$0 = ok.a((byte) 60);
        }
        if ((ad.field_c ^ -1) == 0) {
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
