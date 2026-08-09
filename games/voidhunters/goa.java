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
        vob.field_r.a(this.field_J, (this.field_h >> 1630174241) + param2, 103 + param0, 16777215, -1);
        if (null != this.field_K) {
            dma.h(param2 + 20, 113 + param0, 260, 8421504);
            vob.field_r.a(this.field_K, 20 + param2, 120 + param0 - -8, 260, 100, 16777215, -1, 1, 0, vob.field_r.field_k);
        }
    }

    final void g(int param0) {
        String var3;
        if (param0 != 25880) {
          var3 = (String) null;
          this.a(false, (String) null, -1.248936414718628f, (byte) -121);
          this.field_N.field_x = false;
          this.field_L = true;
          return;
        } else {
          this.field_N.field_x = false;
          this.field_L = true;
          return;
        }
    }

    final void a(boolean param0, String param1, float param2, byte param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_M) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {
              if (stackIn_3_0 == (param0 ? 1 : 0)) {
                L3: {
                  stackIn_7_0 = this;

                  if (!param0) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 0;
                    break L3;
                  } else {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 1;
                    break L3;
                  }
                }
                ((goa) (this)).field_M = stackIn_8_1 != 0;
                if (!this.field_M) {
                  this.field_N.b(2113632, -21202, 4210752);
                  if (!this.field_L) {
                    break L2;
                  } else {
                    this.field_N.field_x = false;
                    break L2;
                  }
                } else {
                  this.field_N.b(8405024, -21202, 4210752);
                  this.field_N.field_x = true;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            this.field_J = param1;
            this.field_N.field_v = (int)(param2 / 100.0f * 65536.0f);
            if (param3 == -89) {
              break L0;
            } else {
              this.field_J = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("goa.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
