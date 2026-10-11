/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends nf {
    private boolean field_S;
    private boolean field_R;
    private String field_P;
    private jh field_Q;
    private String field_T;
    static int[] field_O;

    final void c(boolean param0) {
        this.field_S = param0 ? true : false;
        this.field_Q.field_G = false;
    }

    final void a(boolean param0, String param1, int param2, float param3) {
        RuntimeException runtimeException = null;
        String var6 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (param0) ? 0 : 1;
          if (stackIn_3_0 == (this.field_R ? 1 : 0)) {
            stackIn_8_1 = (param0);
            this.field_R = stackIn_8_1;
            if (this.field_R) {
              this.field_Q.a((byte) -115, 8405024, 4210752);
              this.field_Q.field_G = true;
            } else {
              this.field_Q.a((byte) -115, 2113632, 4210752);
              if (this.field_S) {
                this.field_Q.field_G = false;
              }
            }
          }
          if (param2 != 4210752) {
            var6 = (String) null;
            this.a(true, (String) null, 19, -0.34645962715148926f);
          }
          this.field_Q.field_D = (int)(param3 / 100.0f * 65536.0f);
          this.field_T = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_18_0 = runtimeException;
          stackIn_18_1 = new StringBuilder().append("ul.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2) {
        super.a(param0, param1, param2);
        pj.field_c.a(this.field_T, param1 + (this.field_l >> 1), param2 + 103, 16777215, -1);
        if (null != this.field_P) {
          ge.a(20 + param1, 113 + param2, 260, 8421504);
          pj.field_c.a(this.field_P, param1 + 20, 120 + (param2 + 8), 260, 100, 16777215, -1, 1, 0, pj.field_c.field_C);
          if (param0) {
            this.field_R = true;
            return;
          }
          return;
        }
        if (!param0) {
          return;
        }
        this.field_R = true;
    }

    public static void q(int param0) {
        if (param0 >= -34) {
          return;
        }
        field_O = null;
    }

    ul(kj param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_P = param1;
          if (this.field_P != null) {
            var3_int = pj.field_c.a(this.field_P, 260, pj.field_c.field_C);
            this.a(150 + var3_int, (byte) 110, 300);
          }
          this.field_Q = new jh(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_R = false;
          this.field_S = false;
          this.field_Q.field_G = true;
          this.b((byte) -28, this.field_Q);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ul.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_O = new int[20];
    }
}
