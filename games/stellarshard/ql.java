/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends tb {
    private String field_R;
    private boolean field_Q;
    private String field_P;
    private boolean field_S;
    private nc field_T;

    final void k(int param0) {
        this.field_S = true;
        if (param0 != 29960) {
          return;
        }
        this.field_T.field_B = false;
    }

    final void a(boolean param0, float param1, boolean param2, String param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            this.field_S = true;
          }
          if (this.field_Q == param0) {
            this.field_P = param3;
            this.field_T.field_K = (int)(param1 / 100.0f * 65536.0f);
            return;
          }
          stackIn_7_1 = (param0);
          this.field_Q = stackIn_7_1;
          if (!this.field_Q) {
            this.field_T.c(65280, 4210752, 2113632);
            if (this.field_S) {
              this.field_T.field_B = false;
            }
          } else {
            this.field_T.c(65280, 4210752, 8405024);
            this.field_T.field_B = true;
          }
          this.field_P = param3;
          this.field_T.field_K = (int)(param1 / 100.0f * 65536.0f);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ql.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        s.field_c.c(this.field_P, param2 + (this.field_p >> 1), param1 + 103, 16777215, -1);
        if (this.field_R != null) {
          ti.g(20 + param2, -7 + param1 + 120, 260, 8421504);
          s.field_c.a(this.field_R, 20 + param2, 120 + (param1 + 8), 260, 100, 16777215, -1, 1, 0, s.field_c.field_N);
        }
    }

    ql(ei param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_R = param1;
          if (this.field_R != null) {
            var3_int = s.field_c.b(this.field_R, 260, s.field_c.field_N);
            this.a(300, (byte) -107, var3_int + 150);
          }
          this.field_T = new nc(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_Q = false;
          this.field_S = false;
          this.field_T.field_B = true;
          this.b(4, this.field_T);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ql.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
