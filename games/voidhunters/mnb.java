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
        if (this.field_e) {
          super.finalize();
          return;
        }
        this.field_c.b(-100, this.field_b, this.field_f);
        this.field_e = true;
        super.finalize();
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = VoidHunters.field_G;
        try {
          if (!param1) {
            field_d = false;
          }
          param0.b(-3846);
          var2 = (jk) (cta.field_q.d(0));
          while (var2 != null) {
            if (var2.a(26344, param0)) {
              var2 = (jk) (cta.field_q.a((byte) 114));
              continue;
            }
            break;
          }
          if (var2 != null) {
            al.a(param0, var2, 2);
            return;
          }
          cta.field_q.b(-10258, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("mnb.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
