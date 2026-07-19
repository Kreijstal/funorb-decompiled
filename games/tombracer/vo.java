/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vo {
    private boolean field_a;
    private int field_g;
    static boolean field_b;
    int field_e;
    cka field_h;
    private int field_d;
    private boolean field_c;
    static int field_f;

    final static jea e(int param0) {
        if (param0 != 35040) {
            return (jea) null;
        }
        return nsa.field_i.field_tb;
    }

    final void a(int param0, byte[] param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        byte[] stackIn_2_2 = null;
        int stackIn_2_3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        byte[] stackIn_3_2 = null;
        int stackIn_3_3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        byte[] stackIn_4_2 = null;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        byte[] stackOut_1_2 = null;
        int stackOut_1_3 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        byte[] stackOut_3_2 = null;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        byte[] stackOut_2_2 = null;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                this.d(34963);
                if (param2 <= this.field_g) {
                  break L2;
                } else {
                  L3: {
                    stackOut_1_0 = this.field_d;
                    stackOut_1_1 = param2;
                    stackOut_1_2 = (byte[]) (param1);
                    stackOut_1_3 = 0;
                    stackIn_3_0 = stackOut_1_0;
                    stackIn_3_1 = stackOut_1_1;
                    stackIn_3_2 = stackOut_1_2;
                    stackIn_3_3 = stackOut_1_3;
                    stackIn_2_0 = stackOut_1_0;
                    stackIn_2_1 = stackOut_1_1;
                    stackIn_2_2 = stackOut_1_2;
                    stackIn_2_3 = stackOut_1_3;
                    if (this.field_a) {
                      stackOut_3_0 = stackIn_3_0;
                      stackOut_3_1 = stackIn_3_1;
                      stackOut_3_2 = (byte[]) ((Object) stackIn_3_2);
                      stackOut_3_3 = stackIn_3_3;
                      stackOut_3_4 = 35040;
                      stackIn_4_0 = stackOut_3_0;
                      stackIn_4_1 = stackOut_3_1;
                      stackIn_4_2 = stackOut_3_2;
                      stackIn_4_3 = stackOut_3_3;
                      stackIn_4_4 = stackOut_3_4;
                      break L3;
                    } else {
                      stackOut_2_0 = stackIn_2_0;
                      stackOut_2_1 = stackIn_2_1;
                      stackOut_2_2 = (byte[]) ((Object) stackIn_2_2);
                      stackOut_2_3 = stackIn_2_3;
                      stackOut_2_4 = 35044;
                      stackIn_4_0 = stackOut_2_0;
                      stackIn_4_1 = stackOut_2_1;
                      stackIn_4_2 = stackOut_2_2;
                      stackIn_4_3 = stackOut_2_3;
                      stackIn_4_4 = stackOut_2_4;
                      break L3;
                    }
                  }
                  jaggl.OpenGL.glBufferDataARBub(stackIn_4_0, stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4);
                  this.field_h.field_mb = this.field_h.field_mb + (-this.field_g + param2);
                  this.field_g = param2;
                  if (!TombRacer.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              jaggl.OpenGL.glBufferSubDataARBub(this.field_d, 0, param2, param1, 0);
              break L1;
            }
            var4_int = -114 / ((param0 - -27) / 51);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (runtimeException);
            stackOut_8_1 = new StringBuilder().append("vo.L(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        if (!(this.field_c)) {
            this.field_h.d(-31014, this.field_e, this.field_g);
            this.field_c = true;
        }
        super.finalize();
    }

    abstract void d(int param0);

    vo(cka param0, int param1, byte[] param2, int param3, boolean param4) {
        this.field_c = false;
        try {
            this.field_h = param0;
            this.field_a = param4 ? true : false;
            this.field_d = param1;
            this.field_g = param3;
            jaggl.OpenGL.glGenBuffersARB(1, lc.field_N, 0);
            this.field_e = lc.field_N[0];
            this.d(34963);
            jaggl.OpenGL.glBufferDataARBub(param1, this.field_g, param2, 0, this.field_a ? 35040 : 35044);
            this.field_h.field_mb = this.field_h.field_mb + this.field_g;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_b = false;
    }
}
