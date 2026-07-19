/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mnb {
    private int field_b;
    static boolean field_d;
    private boolean field_a;
    static String field_g;
    private boolean field_e;
    int field_f;
    qfa field_c;

    abstract void a(int param0);

    protected final void finalize() throws Throwable {
        if (!this.field_e) {
          this.field_c.b(-100, this.field_b, this.field_f);
          this.field_e = true;
          super.finalize();
          return;
        } else {
          super.finalize();
          return;
        }
    }

    mnb(qfa param0, int param1, byte[] param2, int param3, boolean param4) {
        this.field_e = false;
        try {
            this.field_b = param3;
            this.field_c = param0;
            this.field_a = param4 ? true : false;
            jaggl.OpenGL.glGenBuffersARB(1, qra.field_p, 0);
            this.field_f = qra.field_p[0];
            this.a(34962);
            jaggl.OpenGL.glBufferDataARBub(param1, this.field_b, param2, 0, !this.field_a ? 35044 : 35040);
            this.field_c.field_mc = this.field_c.field_mc + this.field_b;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mnb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 <= 109) {
            field_g = (String) null;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final static void a(jk param0, boolean param1) {
        jk var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_d = false;
                break L1;
              }
            }
            param0.b(-3846);
            var2 = (jk) ((Object) cta.field_q.d(0));
            L2: while (true) {
              L3: {
                if (var2 == null) {
                  break L3;
                } else {
                  if (!var2.a(26344, param0)) {
                    break L3;
                  } else {
                    var2 = (jk) ((Object) cta.field_q.a((byte) 114));
                    continue L2;
                  }
                }
              }
              if (var2 != null) {
                al.a(param0, var2, 2);
                break L0;
              } else {
                cta.field_q.b(-10258, param0);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2_ref);
            stackOut_11_1 = new StringBuilder().append("mnb.F(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    static {
    }
}
