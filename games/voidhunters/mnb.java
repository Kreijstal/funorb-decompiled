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
        if (!((mnb) this).field_e) {
          ((mnb) this).field_c.b(-100, ((mnb) this).field_b, ((mnb) this).field_f);
          ((mnb) this).field_e = true;
          super.finalize();
          return;
        } else {
          super.finalize();
          return;
        }
    }

    mnb(qfa param0, int param1, byte[] param2, int param3, boolean param4) {
        ((mnb) this).field_e = false;
        try {
            ((mnb) this).field_b = param3;
            ((mnb) this).field_c = param0;
            ((mnb) this).field_a = param4 ? true : false;
            jaggl.OpenGL.glGenBuffersARB(1, qra.field_p, 0);
            ((mnb) this).field_f = qra.field_p[0];
            ((mnb) this).a(34962);
            jaggl.OpenGL.glBufferDataARBub(param1, ((mnb) this).field_b, param2, 0, !((mnb) this).field_a ? 35044 : 35040);
            ((mnb) this).field_c.field_mc = ((mnb) this).field_c.field_mc + ((mnb) this).field_b;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "mnb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b() {
        field_g = null;
    }

    final static void a(jk param0) {
        jk var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            param0.b(-3846);
            var2 = (jk) (Object) cta.field_q.d(0);
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  if (!var2.a(26344, param0)) {
                    break L2;
                  } else {
                    var2 = (jk) (Object) cta.field_q.a((byte) 114);
                    continue L1;
                  }
                }
              }
              if (var2 != null) {
                al.a((ksa) (Object) param0, (ksa) (Object) var2, 2);
                break L0;
              } else {
                cta.field_q.b(-10258, (ksa) (Object) param0);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2_ref;
            stackOut_9_1 = new StringBuilder().append("mnb.F(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + true + ')');
        }
    }

    static {
    }
}
