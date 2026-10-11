/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sp extends im {
    static uc field_R;
    static uc field_Q;
    private kf field_T;
    private String field_S;
    private boolean field_O;
    private boolean field_P;
    private String field_N;

    final void h(byte param0) {
        this.field_T.field_M = false;
        this.field_O = true;
        if (param0 >= 59) {
          return;
        }
        this.h((byte) -28);
    }

    sp(ln param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_N = param1;
          if (this.field_N != null) {
            var3_int = pe.field_E.a(this.field_N, 260, pe.field_E.field_x);
            this.a(300, (byte) -25, 150 + var3_int);
          }
          this.field_T = new kf(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_T.field_M = true;
          this.field_O = false;
          this.field_P = false;
          this.a(this.field_T, -6938);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "sp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void m(int param0) {
        field_R = null;
        field_Q = null;
        if (param0 == -7361) {
          return;
        }
        field_R = (uc) null;
    }

    final void a(boolean param0, int param1, String param2, float param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_13_1 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 51) {
            this.field_S = (String) null;
          }
          stackIn_5_0 = (this.field_P) ? 0 : 1;
          if (param0) {
            stackIn_8_1 = 0;
          } else {
            stackIn_8_1 = 1;
          }
          if (stackIn_5_0 == stackIn_8_1) {
            this.field_T.field_L = (int)(65536.0f * (param3 / 100.0f));
            this.field_S = param2;
            return;
          }
          stackIn_13_1 = (param0);
          this.field_P = stackIn_13_1;
          if (this.field_P) {
            this.field_T.c(4210752, 8405024, (byte) 125);
            this.field_T.field_M = true;
          } else {
            this.field_T.c(4210752, 2113632, (byte) 125);
            if (this.field_O) {
              this.field_T.field_M = false;
            }
          }
          this.field_T.field_L = (int)(65536.0f * (param3 / 100.0f));
          this.field_S = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("sp.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(int param0, int param1, byte param2) {
        if (param2 <= -16) {
          super.b(param0, param1, (byte) -75);
          pe.field_E.c(this.field_S, param1 + (this.field_p >> 1), param0 + 103, 16777215, -1);
          if (null != this.field_N) {
            ph.b(20 + param1, -7 + (param0 + 120), 260, 8421504);
            pe.field_E.a(this.field_N, 20 + param1, 8 + param0 + 120, 260, 100, 16777215, -1, 1, 0, pe.field_E.field_x);
          }
          return;
        }
    }

    final static String a(String param0, String param1, String param2, byte param3) {
        int var5 = Torquing.field_u;
        int var4 = param0.indexOf(param1);
        if (param3 >= -64) {
          return (String) null;
        }
        while (var4 != -1) {
          param0 = param0.substring(0, var4) + param2 + param0.substring(var4 + param1.length());
          var4 = param0.indexOf(param1, var4 + param2.length());
        }
        return param0;
    }

    static {
    }
}
