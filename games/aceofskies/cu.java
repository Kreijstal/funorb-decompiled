/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cu extends wt implements ws {
    private wl field_t;
    int field_u;
    int field_v;
    private int field_n;
    int field_o;
    private int field_q;
    static boolean field_r;
    private int field_p;
    private int field_s;

    final void d(byte param0) {
        if (param0 != -108) {
          return;
        } else {
          L0: {
            if (0 < ((cu) this).field_p) {
              ((cu) this).field_t.a((byte) -126, ((cu) this).field_o, ((cu) this).field_p);
              ((cu) this).field_p = 0;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final static boolean a(byte param0, int param1, int param2) {
        int discarded$0 = -3;
        return (wc.a((byte) -101, param1, param2) | dk.a(param1, param2, (byte) -84) | qh.a(param1, param2)) & tt.a(param1, true, param2);
    }

    public final void a(byte param0) {
        jaggl.OpenGL.glFramebufferRenderbufferEXT(((cu) this).field_n, ((cu) this).field_q, 36161, 0);
        ((cu) this).field_q = -1;
        ((cu) this).field_n = -1;
        if (param0 != 11) {
            ((cu) this).field_n = -123;
        }
    }

    protected final void finalize() throws Throwable {
        ((cu) this).d((byte) -108);
        super.finalize();
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != -12658) {
          ((cu) this).field_q = -125;
          jaggl.OpenGL.glFramebufferRenderbufferEXT(param0, param2, 36161, ((cu) this).field_p);
          ((cu) this).field_n = param0;
          ((cu) this).field_q = param2;
          return;
        } else {
          jaggl.OpenGL.glFramebufferRenderbufferEXT(param0, param2, 36161, ((cu) this).field_p);
          ((cu) this).field_n = param0;
          ((cu) this).field_q = param2;
          return;
        }
    }

    final static void c(byte param0) {
        if (param0 <= 76) {
          field_r = true;
          qk.field_e = new wd();
          ak.field_d.d((ea) (Object) qk.field_e, -30244);
          return;
        } else {
          qk.field_e = new wd();
          ak.field_d.d((ea) (Object) qk.field_e, -30244);
          return;
        }
    }

    cu(wl param0, int param1, int param2, int param3) {
        ((cu) this).field_n = -1;
        ((cu) this).field_q = -1;
        try {
            ((cu) this).field_v = param3;
            ((cu) this).field_u = param2;
            ((cu) this).field_t = param0;
            ((cu) this).field_s = param1;
            jaggl.OpenGL.glGenRenderbuffersEXT(1, at.field_a, 0);
            ((cu) this).field_p = at.field_a[0];
            jaggl.OpenGL.glBindRenderbufferEXT(36161, ((cu) this).field_p);
            jaggl.OpenGL.glRenderbufferStorageEXT(36161, ((cu) this).field_s, ((cu) this).field_u, ((cu) this).field_v);
            ((cu) this).field_o = ((cu) this).field_v * ((cu) this).field_u * ((cu) this).field_t.e(-32334, ((cu) this).field_s);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "cu.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = false;
    }
}
