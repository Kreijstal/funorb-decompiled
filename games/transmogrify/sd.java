/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends bi {
    static String field_V;
    private String field_U;
    static String field_Q;
    private String field_P;
    private boolean field_T;
    private boolean field_S;
    private qe field_R;

    final void a(int param0, byte param1, int param2) {
        super.a(param0, (byte) -127, param2);
        rh.field_q.c(this.field_P, (this.field_l >> 1) + param2, 103 + param0, 16777215, -1);
        if (param1 > -79) {
          this.field_T = false;
          if (null == this.field_U) {
            return;
          }
          sb.d(param2 + 20, -7 + (param0 + 120), 260, 8421504);
          rh.field_q.a(this.field_U, param2 + 20, 120 + param0 + 8, 260, 100, 16777215, -1, 1, 0, rh.field_q.field_y);
          return;
        }
        if (null != this.field_U) {
          sb.d(param2 + 20, -7 + (param0 + 120), 260, 8421504);
          rh.field_q.a(this.field_U, param2 + 20, 120 + param0 + 8, 260, 100, 16777215, -1, 1, 0, rh.field_q.field_y);
          return;
        }
    }

    final void r(int param0) {
        int var2 = -126 / ((param0 - 54) / 62);
        this.field_R.field_w = false;
        this.field_T = true;
    }

    sd(da param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_U = param1;
          if (this.field_U != null) {
            var3_int = rh.field_q.a(this.field_U, 260, rh.field_q.field_y);
            this.a(300, var3_int + 150, false);
          }
          this.field_R = new qe(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_R.field_w = true;
          this.field_T = false;
          this.field_S = false;
          this.a((qg) (this.field_R), (byte) -120);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "sd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void q(int param0) {
        if (param0 != 274) {
          field_V = (String) null;
        }
    }

    final void a(boolean param0, String param1, byte param2, float param3) {
        RuntimeException runtimeException = null;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (param0) ? 0 : 1;
          if (this.field_S) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = 1;
          }
          if (stackIn_3_0 != stackIn_6_1) {
            stackIn_10_1 = (param0);
            this.field_S = stackIn_10_1;
            if (this.field_S) {
              this.field_R.a(true, 4210752, 8405024);
              this.field_R.field_w = true;
            } else {
              this.field_R.a(true, 4210752, 2113632);
              if (this.field_T) {
                this.field_R.field_w = false;
              }
            }
          }
          if (param2 != -27) {
            sd.e((byte) 2);
          }
          this.field_R.field_J = (int)(65536.0f * (param3 / 100.0f));
          this.field_P = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_20_0 = runtimeException;
          stackIn_20_1 = new StringBuilder().append("sd.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(ci param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        e var5 = null;
        int[] var6 = null;
        int var7 = 0;
        ci var8 = null;
        hj var9 = null;
        int var10 = 0;
        hj var11 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          var9 = new hj(param0.a("", (byte) 124, "logo.fo3d"));
          var11 = var9;
          var3 = var11.d((byte) 121);
          var11.h((byte) 106);
          if (!param1) {
            var8 = (ci) null;
            sd.a((ci) null, true);
          }
          rg.field_L = u.a(var11, (byte) 26);
          ae.field_a = new int[var3][];
          rf.field_eb = new e[var3];
          for (var4 = 0; var3 > var4; var4++) {
            rf.field_eb[var4] = nb.a(param1, var9);
          }
          var11.n(0);
          var10 = 0;
          var4Lifetime1 = var10;
          while (var10 < var3) {
            var5 = rf.field_eb[var10];
            var5.a(1, -22861, 6, 6, 6);
            var5.a(22856);
            var6 = new int[]{var5.field_t + var5.field_P >> 1, var5.field_u + var5.field_O >> 1, var5.field_k + var5.field_i >> 1};
            ae.field_a[var10] = var6;
            var5.a(-var6[2], -var6[0], -var6[1], (byte) -127);
            var10++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("sd.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_V = null;
        field_Q = null;
        int var1 = 81 / ((47 - param0) / 43);
    }

    static {
        field_Q = "You are not currently logged in to the<nbsp>game.";
        field_V = "Type your email address again to make sure it's correct";
    }
}
