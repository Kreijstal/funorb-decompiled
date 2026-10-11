/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends en {
    static int field_T;
    private String field_Q;
    static int[] field_S;
    private String field_Y;
    static int field_U;
    static int field_V;
    private boolean field_R;
    private boolean field_W;
    private co field_X;

    kl(ol param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_Q = param1;
          if (this.field_Q != null) {
            var3_int = mo.field_m.b(this.field_Q, 260, mo.field_m.field_o);
            this.a(var3_int + 150, (byte) 119, 300);
          }
          this.field_X = new co(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_X.field_H = true;
          this.field_W = false;
          this.field_R = false;
          this.b(this.field_X, -121);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "kl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void h(byte param0) {
        field_S = null;
        if (param0 != -1) {
          field_T = 91;
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          d.a(param1, (byte) 125, "");
          if (param0 != -1) {
            kl.h((byte) -111);
          }
          qe.a(0, param1);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "kl.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        super.b(param0 + 0, param1, param2);
        mo.field_m.c(this.field_Y, (this.field_g >> 1) + param1, param2 + 103, 16777215, -1);
        if (param0 == 30) {
          if (null != this.field_Q) {
            kh.f(param1 + 20, -7 + (120 + param2), 260, 8421504);
            mo.field_m.a(this.field_Q, param1 + 20, 120 + (param2 + 8), 260, 100, 16777215, -1, 1, 0, mo.field_m.field_o);
          }
          return;
        }
        this.field_Y = (String) null;
        if (null != this.field_Q) {
          kh.f(param1 + 20, -7 + (120 + param2), 260, 8421504);
          mo.field_m.a(this.field_Q, param1 + 20, 120 + (param2 + 8), 260, 100, 16777215, -1, 1, 0, mo.field_m.field_o);
        }
    }

    final void a(int param0, boolean param1, float param2, String param3) {
        RuntimeException runtimeException = null;
        int stackIn_3_0 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (this.field_R) ? 0 : 1;
          if (stackIn_3_0 == (param1 ? 1 : 0)) {
            stackIn_8_1 = (param1);
            this.field_R = stackIn_8_1;
            if (this.field_R) {
              this.field_X.b((byte) -126, 4210752, 8405024);
              this.field_X.field_H = true;
            } else {
              this.field_X.b((byte) 107, 4210752, 2113632);
              if (this.field_W) {
                this.field_X.field_H = false;
              }
            }
          }
          this.field_Y = param3;
          if (param0 != 8405024) {
            kl.h((byte) 14);
          }
          this.field_X.field_A = (int)(param2 / 100.0f * 65536.0f);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_18_0 = runtimeException;
          stackIn_18_1 = new StringBuilder().append("kl.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void i(byte param0) {
        this.field_W = true;
        int var2 = -2 / ((param0 + 40) / 36);
        this.field_X.field_H = false;
    }

    static {
        field_S = new int[]{0, 0, -1, 1};
    }
}
