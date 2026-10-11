/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class goa extends iw {
    private String field_K;
    private String field_J;
    private boolean field_M;
    private boolean field_L;
    private ttb field_N;

    goa(ida param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_K = param1;
          if (this.field_K != null) {
            var3_int = vob.field_r.b(this.field_K, 260, vob.field_r.field_k);
            this.c(300, -1860440319, 150 + var3_int);
          }
          this.field_N = new ttb(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_N.field_x = true;
          this.field_L = false;
          this.field_M = false;
          this.b(-18756, this.field_N);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "goa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        vob.field_r.a(this.field_J, (this.field_h >> 1) + param2, 103 + param0, 16777215, -1);
        if (null != this.field_K) {
          dma.h(param2 + 20, 113 + param0, 260, 8421504);
          vob.field_r.a(this.field_K, 20 + param2, 120 + param0 + 8, 260, 100, 16777215, -1, 1, 0, vob.field_r.field_k);
        }
    }

    final void g(int param0) {
        if (param0 == 25880) {
          this.field_N.field_x = false;
          this.field_L = true;
          return;
        }
        String var3 = (String) null;
        this.a(false, (String) null, -1.248936414718628f, (byte) -121);
        this.field_N.field_x = false;
        this.field_L = true;
    }

    final void a(boolean param0, String param1, float param2, byte param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (this.field_M) ? 0 : 1;
          if (stackIn_3_0 == (param0 ? 1 : 0)) {
            stackIn_8_1 = (param0);
            this.field_M = stackIn_8_1;
            if (!this.field_M) {
              this.field_N.b(2113632, -21202, 4210752);
              if (this.field_L) {
                this.field_N.field_x = false;
              }
            } else {
              this.field_N.b(8405024, -21202, 4210752);
              this.field_N.field_x = true;
            }
          }
          this.field_J = param1;
          this.field_N.field_v = (int)(param2 / 100.0f * 65536.0f);
          if (param3 == -89) {
            return;
          }
          this.field_J = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("goa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
