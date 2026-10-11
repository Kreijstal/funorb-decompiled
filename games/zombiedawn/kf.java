/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends pn implements hh {
    static String field_X;
    static String field_V;
    private an field_U;
    private an field_W;
    static String field_Y;
    static String field_T;

    private final void n(int param0) {
        if (!this.field_H) {
          return;
        }
        this.field_H = false;
        if (param0 != 10) {
          an var3 = (an) null;
          this.a(34, -113, (an) null, 107, 77);
        }
    }

    private final an a(int param0, String param1, sk param2) {
        an var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        an stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new an(param1, param2);
          var4.field_h = (io) ((Object) new vm());
          if (param0 != -1763) {
            this.n(-112);
          }
          var5 = this.field_n - 6;
          this.field_n = this.field_n + 38;
          var4.a(-127, var5, 15, -16 + (this.field_i - 14), 30);
          this.a(var4, 10);
          this.a(true);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("kf.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    kf(dn param0) {
        super(param0, 200, 130);
        ga var2 = null;
        try {
          var2 = new ga(mf.field_a, (sk) null);
          var2.field_n = 80;
          var2.field_i = this.field_i;
          var2.field_k = 0;
          var2.field_j = 50;
          var2.field_h = (io) ((Object) new vf(ii.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.a(var2, 10);
          if (po.w(13296)) {
            this.field_U = this.a(-1763, wd.field_w, (sk) (this));
          }
          this.field_W = this.a(-1763, re.field_c, (sk) (this));
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "kf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -6) {
            return;
          }
          if (param2 == this.field_U) {
            td.a(param1 + 133);
            this.n(param1 ^ -16);
            return;
          }
          if (this.field_W != param2) {
            return;
          }
          this.n(param1 + 16);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("kf.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 98) {
            if (null == this.field_U) {
              this.field_W.a((byte) 110, (ga) (this));
              return true;
            }
            this.field_U.a((byte) 100, (ga) (this));
            return true;
          }
          var5_int = 122 / ((param0 + 83) / 32);
          if (param1 != 99) {
            stackIn_11_0 = super.a(75, param1, param2, param3);
            return stackIn_11_0;
          }
          this.field_W.a((byte) 107, (ga) (this));
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("kf.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void m(int param0) {
        field_T = null;
        field_V = null;
        field_Y = null;
        if (param0 != 4347) {
          kf.m(-22);
          field_X = null;
          return;
        }
        field_X = null;
    }

    static {
        field_X = "Name is available";
        field_Y = "Locked";
        field_V = "Updates will sent to the email address you've given";
    }
}
