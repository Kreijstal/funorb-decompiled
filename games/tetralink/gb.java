/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gb extends mc {
    static String field_q;
    gb field_o;
    long field_n;
    static int[] field_r;
    static String field_p;
    gb field_s;

    final long c(int param0) {
        int var2 = 17 / ((param0 + 27) / 46);
        return this.field_n;
    }

    final void a(long param0, int param1) {
        if (null != this.field_s) {
          throw new RuntimeException();
        }
        if (param1 != 17260) {
          gb.a((byte) -92, true);
        }
        this.field_n = param0;
    }

    final boolean a(int param0) {
        if (null == this.field_s) {
          return false;
        }
        if (param0 != 2) {
          field_r = (int[]) null;
          return true;
        }
        return true;
    }

    final static kh a(boolean param0, int[] param1, kh param2) {
        kh var3 = null;
        RuntimeException var3_ref = null;
        kh stackIn_2_0 = null;
        kh stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_2_0 = (kh) null;
            return stackIn_2_0;
          }
          var3 = new kh(0, 0, 0);
          var3.field_k = param2.field_k;
          var3.field_d = param2.field_d;
          var3.field_f = param2.field_f;
          var3.field_b = param2.field_b;
          var3.field_j = param2.field_j;
          var3.field_h = param2.field_h;
          var3.field_p = param1;
          var3.field_o = param2.field_o;
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("gb.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1) {
        int var2;
        int var3;
        kh var4;
        var3 = TetraLink.field_J;
        if (0 >= mb.field_C) {
          var2 = (!ug.o(-115)) ? 1 : 0;
        } else {
          if (hn.field_M != null) {
            hd.field_u = hn.field_M.b(false);
            pf.a(123, 2);
          } else {
            hd.field_u = bm.a(480, 0, 0, 640, 0, nd.field_Pb);
          }
          if (hd.field_u == null) {
            var2 = 3;
          } else {
            da.a((byte) -76, hd.field_u);
            var2 = 2;
          }
        }
        if (null == hn.field_M &&
          rm.field_f) {
          om.a(param1, 10, var2);
        }
        if (param0 > -68) {
          var4 = (kh) null;
          gb.a(false, (int[]) null, (kh) null);
        }
    }

    final void e(int param0) {
        if (null == this.field_s) {
          return;
        }
        this.field_s.field_o = this.field_o;
        this.field_o.field_s = this.field_s;
        this.field_s = null;
        if (param0 != 0) {
          return;
        }
        this.field_o = null;
    }

    final static dk a(byte param0, java.applet.Applet param1) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        dk[] var3_ref_dk__ = null;
        int var3 = 0;
        dk var5 = null;
        int var6 = 0;
        dk stackIn_4_0 = null;
        dk stackIn_10_0 = null;
        dk stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TetraLink.field_J;
        try {
          var2 = TetraLink.a("jagex-last-login-method", -28536, param1);
          if (var2 == null) {
            stackIn_4_0 = vc.field_b;
            return stackIn_4_0;
          }
          var3_ref_dk__ = lf.a(7);
          for (var4 = 0; var4 < var3_ref_dk__.length; var4++) {
            var5 = var3_ref_dk__[var4];
            if (var5.a(16412, var2)) {
              stackIn_10_0 = var5;
              return stackIn_10_0;
            }
          }
          var3 = -31 / ((param0 - 21) / 47);
          stackIn_13_0 = vc.field_b;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_16_0 = var2_ref;
          stackIn_16_1 = new StringBuilder().append("gb.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_q = null;
        field_p = null;
        if (param0 < 88) {
          field_r = (int[]) null;
        }
        field_r = null;
    }

    protected gb() {
    }

    static {
        field_q = "You do not have a suitable number of players for the current options.";
        field_p = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
