/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends rm implements qn {
    private dp field_W;
    private int field_U;
    static String field_V;

    public static void i(byte param0) {
        if (param0 != -41) {
            field_V = (String) null;
            field_V = null;
            return;
        }
        field_V = null;
    }

    final void a(int param0, int param1, lm param2, boolean param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_U = -this.field_q + hj.field_S + -param0;
            if (!param3) {
                dp var6 = (dp) null;
                this.a((dp) null, -106);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "uh.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(dp param0, int param1) {
        try {
            this.field_W = param0;
            if (param1 != 10508) {
                this.field_U = 28;
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "uh.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final dp a(int param0) {
        if (param0 >= -74) {
            field_V = (String) null;
            return this.field_W;
        }
        return this.field_W;
    }

    final void n(int param0) {
        super.n(param0);
        if (null != this.field_W) {
            this.field_W.b(2899);
        }
    }

    final String c(byte param0) {
        if (param0 >= 3) {
          if (this.field_u) {
            if (this.field_i == null) {
              return null;
            } else {
              vj.a((byte) 121, eh.field_h, -this.field_U + (this.field_x + hj.field_S));
              return this.field_i;
            }
          } else {
            return null;
          }
        } else {
          this.n(111);
          if (this.field_u) {
            if (this.field_i == null) {
              return null;
            } else {
              vj.a((byte) 121, eh.field_h, -this.field_U + (this.field_x + hj.field_S));
              return this.field_i;
            }
          } else {
            return null;
          }
        }
    }

    uh(String param0, pg param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        field_V = "You have not yet been raided.";
    }
}
