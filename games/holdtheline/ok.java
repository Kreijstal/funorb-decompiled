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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -6126) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          var2 = kk.a(true, ko.a(param0, -13820));
          if (var2 == null) {
            var2 = "";
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("ok.E(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(hb param0, int param1) {
        hb[] var4 = null;
        int var5 = 0;
        int fieldTemp$0 = 0;
        int var3_int = 0;
        int var6 = HoldTheLine.field_D;
        int var3_intLifetime1;
        try {
          if (this.field_c < this.field_d + 1) {
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
          var3_intLifetime1 = -24 % ((param1 + 5) / 37);
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
        if (param0 != 55) {
          ok.a((byte) 60);
        }
        if (ad.field_c == -1) {
          if (!hi.b(1, (byte) 40)) {
            return false;
          }
          ad.field_c = rd.field_e.f((byte) -72);
          rd.field_e.field_l = 0;
        }
        if (ad.field_c == -2) {
          if (!hi.b(2, (byte) 40)) {
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
