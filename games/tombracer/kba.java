/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kba extends od implements wia {
    int field_o;
    private int field_q;
    private int field_m;
    static os field_u;
    static int field_s;
    private cka field_p;
    static String field_k;
    int field_l;
    private int field_t;
    private int field_r;
    int field_n;

    public static void a(byte param0) {
        if (param0 != -48) {
          kba.f(-96);
          field_u = null;
          field_k = null;
          return;
        }
        field_u = null;
        field_k = null;
    }

    final void g(int param0) {
        if (this.field_m > 0) {
          this.field_p.c(2, this.field_o, this.field_m);
          this.field_m = 0;
        }
        int var2 = 57 % ((11 - param0) / 45);
    }

    final static boolean a(int param0, int param1) {
        if (0 > param1) {
          return (param1 + 1) % 4 == 0 ? true : false;
        }
        if (param1 < 1582) {
          return param1 % 4 == 0 ? true : false;
        }
        if (~(param1 % 4) != param0) {
          return false;
        }
        if (param1 % 100 != 0) {
          return true;
        }
        if (param1 % 400 == 0) {
          return true;
        }
        return false;
    }

    protected final void finalize() throws Throwable {
        this.g(96);
        super.finalize();
    }

    final void a(int param0, int param1, int param2) {
        if (param2 == -23992) {
          jaggl.OpenGL.glFramebufferRenderbufferEXT(param1, param0, 36161, this.field_m);
          this.field_q = param1;
          this.field_r = param0;
          return;
        }
        kba.f(-114);
        jaggl.OpenGL.glFramebufferRenderbufferEXT(param1, param0, 36161, this.field_m);
        this.field_q = param1;
        this.field_r = param0;
    }

    public final void a(int param0) {
        int var2 = -73 % ((14 - param0) / 56);
        jaggl.OpenGL.glFramebufferRenderbufferEXT(this.field_q, this.field_r, 36161, 0);
        this.field_q = -1;
        this.field_r = -1;
    }

    final static int f(int param0) {
        if (param0 != -1) {
          return 119;
        }
        return cm.field_a.length;
    }

    kba(cka param0, int param1, int param2, int param3) {
        this.field_q = -1;
        this.field_r = -1;
        try {
          this.field_l = param3;
          this.field_t = param1;
          this.field_p = param0;
          this.field_n = param2;
          jaggl.OpenGL.glGenRenderbuffersEXT(1, mg.field_h, 0);
          this.field_m = mg.field_h[0];
          jaggl.OpenGL.glBindRenderbufferEXT(36161, this.field_m);
          jaggl.OpenGL.glRenderbufferStorageEXT(36161, this.field_t, this.field_n, this.field_l);
          this.field_o = this.field_n * (this.field_l * this.field_p.a(this.field_t, (byte) -86));
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "kba.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    kba(cka param0, int param1, int param2, int param3, int param4) {
        this.field_q = -1;
        this.field_r = -1;
        try {
          this.field_n = param2;
          this.field_p = param0;
          this.field_t = param1;
          this.field_l = param3;
          jaggl.OpenGL.glGenRenderbuffersEXT(1, mg.field_h, 0);
          this.field_m = mg.field_h[0];
          jaggl.OpenGL.glBindRenderbufferEXT(36161, this.field_m);
          jaggl.OpenGL.glRenderbufferStorageMultisampleEXT(36161, param4, this.field_t, this.field_n, this.field_l);
          this.field_o = this.field_n * this.field_l * this.field_p.a(this.field_t, (byte) -64);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "kba.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_k = "You can join this game";
        field_u = (os) ((Object) new vk());
    }
}
