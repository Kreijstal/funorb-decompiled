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
            ((goa) this).field_K = param1;
            if (((goa) this).field_K != null) {
                var3_int = vob.field_r.b(((goa) this).field_K, 260, vob.field_r.field_k);
                ((goa) this).c(300, -1860440319, 150 + var3_int);
            }
            ((goa) this).field_N = new ttb(13, 50, 274, 30, 15, 2113632, 4210752);
            ((goa) this).field_N.field_x = true;
            ((goa) this).field_L = false;
            ((goa) this).field_M = false;
            ((goa) this).b(-18756, (shb) (Object) ((goa) this).field_N);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "goa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        vob.field_r.a(((goa) this).field_J, (((goa) this).field_h >> 1) + param2, 103 + param0, 16777215, -1);
        if (null != ((goa) this).field_K) {
            dma.h(param2 + 20, 113 + param0, 260, 8421504);
            int discarded$0 = vob.field_r.a(((goa) this).field_K, 20 + param2, 120 + param0 - -8, 260, 100, 16777215, -1, 1, 0, vob.field_r.field_k);
        }
    }

    final void g(int param0) {
        Object var3 = null;
        if (param0 != 25880) {
          var3 = null;
          ((goa) this).a(false, (String) null, -1.248936414718628f, (byte) -121);
          ((goa) this).field_N.field_x = false;
          ((goa) this).field_L = true;
          return;
        } else {
          ((goa) this).field_N.field_x = false;
          ((goa) this).field_L = true;
          return;
        }
    }

    final void a(boolean param0, String param1, float param2, byte param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (((goa) this).field_M) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              if (stackIn_3_0 == (param0 ? 1 : 0)) {
                L3: {
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (!param0) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L3;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L3;
                  }
                }
                ((goa) this).field_M = stackIn_8_1 != 0;
                if (!((goa) this).field_M) {
                  ((goa) this).field_N.b(2113632, -21202, 4210752);
                  if (!((goa) this).field_L) {
                    break L2;
                  } else {
                    ((goa) this).field_N.field_x = false;
                    break L2;
                  }
                } else {
                  ((goa) this).field_N.b(8405024, -21202, 4210752);
                  ((goa) this).field_N.field_x = true;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            ((goa) this).field_J = param1;
            ((goa) this).field_N.field_v = (int)(param2 / 100.0f * 65536.0f);
            if (param3 == -89) {
              break L0;
            } else {
              ((goa) this).field_J = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("goa.D(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
