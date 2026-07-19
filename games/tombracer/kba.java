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
        int discarded$0 = 0;
        if (param0 != -48) {
            discarded$0 = kba.f(-96);
            field_u = null;
            field_k = null;
            return;
        }
        field_u = null;
        field_k = null;
    }

    final void g(int param0) {
        if (!((this.field_m ^ -1) >= -1)) {
            this.field_p.c(2, this.field_o, this.field_m);
            this.field_m = 0;
        }
        int var2 = 57 % ((11 - param0) / 45);
    }

    final static boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (0 <= param1) {
          if ((param1 ^ -1) > -1583) {
            L0: {
              if (param1 % 4 != 0) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L0;
              }
            }
            return stackIn_10_0 != 0;
          } else {
            if ((param1 % 4 ^ -1) == param0) {
              if (param1 % 100 == 0) {
                if (param1 % 400 != 0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          L1: {
            if (-1 != ((param1 + 1) % 4 ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    protected final void finalize() throws Throwable {
        this.g(96);
        super.finalize();
    }

    final void a(int param0, int param1, int param2) {
        int discarded$2 = 0;
        if (param2 != -23992) {
          discarded$2 = kba.f(-114);
          jaggl.OpenGL.glFramebufferRenderbufferEXT(param1, param0, 36161, this.field_m);
          this.field_q = param1;
          this.field_r = param0;
          return;
        } else {
          jaggl.OpenGL.glFramebufferRenderbufferEXT(param1, param0, 36161, this.field_m);
          this.field_q = param1;
          this.field_r = param0;
          return;
        }
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
