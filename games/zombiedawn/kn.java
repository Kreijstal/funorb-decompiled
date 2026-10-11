/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends hp implements hh {
    static String field_J;
    static String field_I;
    private ri field_K;
    static vo field_L;
    private an[] field_G;
    private String[] field_H;
    static int field_F;

    public static void b(boolean param0) {
        field_I = null;
        if (param0) {
          return;
        }
        field_J = null;
        field_L = null;
    }

    kn(ri param0) {
        super(0, 0, 0, 0, (io) null);
        try {
          this.field_K = param0;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "kn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String[] param0, byte param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        dp var4 = null;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        try {
          this.field_x.b(97);
          if (param0 != null &&
            param0.length != 0) {
            var3_int = param0.length;
            this.field_H = new String[var3_int];
            if (param1 <= 18) {
              return;
            }
            for (var4_int = 0; var4_int < var3_int; var4_int++) {
              this.field_H[var4_int] = nh.a((CharSequence) ((Object) param0[var4_int]), 126).replace(' ', ' ');
            }
            var4 = new dp(ia.field_e, 0, 1);
            this.field_G = new an[var3_int + 1];
            for (var5 = 0; var3_int > var5; var5++) {
              this.field_G[var5] = new an(this.field_H[var5], (sk) (this));
              this.field_G[var5].field_h = (io) ((Object) var4);
              this.field_G[var5].field_s = sj.field_b;
              this.field_G[var5].a(-94, 16 * var5 + 20, 0, 80, 15);
              this.a(this.field_G[var5], 10);
            }
            this.field_G[var3_int] = new an(mm.field_j, (sk) (this));
            this.field_G[var3_int].field_h = (io) ((Object) var4);
            this.field_G[var3_int].a(52, 20 + (1 + var3_int) * 16, 0, 100, 15);
            this.a(this.field_G[var3_int], 10);
            return;
          }
          this.field_H = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("kn.E(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, 0);
        if (param3 != param1) {
          return;
        }
        rb var5 = ia.field_e;
        if (null != this.field_H) {
          var5.a(ic.field_Q, param2 + this.field_k, param0 + this.field_j, this.field_i, 20, 16777215, -1, 0, 0, var5.field_I + var5.field_x);
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(-126, param1, param2, param3)) {
            return true;
          }
          if (98 == param1) {
            stackIn_6_0 = this.b((byte) 119, param2);
            return stackIn_6_0;
          }
          var5_int = -57 / ((param0 + 83) / 32);
          if (param1 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(1, param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("kn.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        String[] var8 = null;
        var7 = ZombieDawn.field_J;
        try {
          for (var6_int = 0; this.field_H.length > var6_int; var6_int++) {
            if (this.field_G[var6_int] == param2) {
              this.field_K.a((byte) 103, this.field_H[var6_int]);
            }
          }
          if (param1 != -6) {
            var8 = (String[]) null;
            this.a((String[]) null, (byte) -97);
          }
          if (this.field_G[this.field_H.length] == param2) {
            this.field_K.a(param1 + 127);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("kn.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_I = "Humans captured: ";
        field_J = "You have <%0> unread messages!";
        field_L = new vo();
        field_F = 0;
    }
}
