/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kb {
    fr field_g;
    static se field_d;
    private boolean field_b;
    static volatile int field_i;
    static int field_a;
    private boolean field_e;
    private int field_h;
    static is field_c;
    int field_f;

    public static void a(boolean param0) {
        field_d = null;
        field_c = null;
        if (!param0) {
            field_a = 19;
        }
    }

    protected final void finalize() throws Throwable {
        if (!(this.field_b)) {
            this.field_g.a(this.field_f, true, this.field_h);
            this.field_b = true;
        }
        super.finalize();
    }

    abstract void b(int param0);

    final static wb[] a(String param0, ki param1, boolean param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        wb[] stackIn_2_0 = null;
        wb[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param1.a(0, param3);
            if (param2) {
              var5 = param1.a(var4_int, param0, (byte) 126);
              stackIn_4_0 = tt.a((byte) -100, var5, param1, var4_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (wb[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("kb.G(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    kb(fr param0, int param1, byte[] param2, int param3, boolean param4) {
        this.field_b = false;
        try {
            this.field_g = param0;
            this.field_e = param4 ? true : false;
            this.field_h = param3;
            jaggl.OpenGL.glGenBuffersARB(1, nq.field_j, 0);
            this.field_f = nq.field_j[0];
            this.b(1735490466);
            jaggl.OpenGL.glBufferDataARBub(param1, this.field_h, param2, 0, this.field_e ? 35040 : 35044);
            this.field_g.field_Xb = this.field_g.field_Xb + this.field_h;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "kb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_d = null;
        field_i = 0;
    }
}
