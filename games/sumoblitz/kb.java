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
        if (!this.field_b) {
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
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.a(0, param3);
          if (!param2) {
            stackIn_2_0 = (wb[]) null;
            return stackIn_2_0;
          }
          var5 = param1.a(var4_int, param0, (byte) 126);
          stackIn_4_0 = tt.a((byte) -100, var5, param1, var4_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("kb.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
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
