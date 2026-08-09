/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kl implements wia {
    int field_c;
    private boolean field_g;
    static String field_j;
    static int field_k;
    int field_e;
    private boolean field_d;
    int field_i;
    static il field_b;
    private int field_f;
    cka field_h;
    static fpa field_a;

    public static void c(int param0) {
        field_a = null;
        if (param0 != 1956) {
            field_j = (String) null;
            field_b = null;
            field_j = null;
            return;
        }
        field_b = null;
        field_j = null;
    }

    final boolean e(int param0) {
        int var2;
        if (this.field_h.field_id) {
          var2 = this.d(9729);
          this.field_h.a(true, (kl) (this));
          jaggl.OpenGL.glGenerateMipmapEXT(this.field_e);
          this.field_d = true;
          this.a(true);
          this.a((byte) 111, var2);
          return true;
        } else {
          if (param0 != 9729) {
            this.field_h = (cka) null;
            return false;
          } else {
            return false;
          }
        }
    }

    private final void a(boolean param0) {
        this.field_h.a(param0, (kl) (this));
        if (!this.field_g) {
            jaggl.OpenGL.glTexParameteri(this.field_e, 10241, this.field_d ? 9984 : 9728);
            jaggl.OpenGL.glTexParameteri(this.field_e, 10240, 9728);
        } else {
            jaggl.OpenGL.glTexParameteri(this.field_e, 10241, this.field_d ? 9987 : 9729);
            jaggl.OpenGL.glTexParameteri(this.field_e, 10240, 9729);
        }
    }

    final void a(boolean param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_1 = 0;
        int var3;
        if (param1 != 4) {
          L0: {
            this.field_h = (cka) null;
            if (this.field_d) {
              stackIn_13_0 = 0;
              break L0;
            } else {
              stackIn_13_0 = 1;
              break L0;
            }
          }
          L1: {


            if (param0) {

              stackIn_16_1 = 0;
              break L1;
            } else {

              stackIn_16_1 = 1;
              break L1;
            }
          }
          L2: {
            if (stackIn_13_0 == stackIn_16_1) {
              break L2;
            } else {
              var3 = this.d(9729);
              this.field_d = true;
              this.a(true);
              this.a((byte) 127, var3);
              break L2;
            }
          }
          return;
        } else {
          L3: {
            if (this.field_d) {
              stackIn_4_0 = 0;
              break L3;
            } else {
              stackIn_4_0 = 1;
              break L3;
            }
          }
          L4: {


            if (param0) {

              stackIn_7_1 = 0;
              break L4;
            } else {

              stackIn_7_1 = 1;
              break L4;
            }
          }
          L5: {
            if (stackIn_4_0 == stackIn_7_1) {
              break L5;
            } else {
              var3 = this.d(9729);
              this.field_d = true;
              this.a(true);
              this.a((byte) 127, var3);
              break L5;
            }
          }
          return;
        }
    }

    private final int d(int param0) {
        int var2;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        var2 = this.field_h.a(this.field_c, (byte) -65) * this.field_f;
        if (param0 != 9729) {
          L0: {
            kl.c(61);
            if (!this.field_d) {
              stackIn_8_0 = var2;
              break L0;
            } else {
              stackIn_8_0 = var2 * 4 / 3;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (!this.field_d) {
              stackIn_4_0 = var2;
              break L1;
            } else {
              stackIn_4_0 = var2 * 4 / 3;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final void b(boolean param0, int param1) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        L0: {
          if (param0 != this.field_g) {
            L1: {
              stackIn_4_0 = this;

              if (!param0) {
                stackIn_5_0 = this;
                stackIn_5_1 = 0;
                break L1;
              } else {
                stackIn_5_0 = this;
                stackIn_5_1 = 1;
                break L1;
              }
            }
            ((kl) (this)).field_g = stackIn_5_1 != 0;
            this.a(true);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != 3) {
          this.field_i = 93;
          return;
        } else {
          return;
        }
    }

    final int f(int param0) {
        if (param0 != 0) {
            this.a((byte) -36, 103);
            return this.field_i;
        }
        return this.field_i;
    }

    private final void a(byte param0, int param1) {
        this.field_h.field_jb = this.field_h.field_jb - param1;
        this.field_h.field_jb = this.field_h.field_jb + this.d(9729);
        if (param0 < 104) {
            this.field_c = 73;
        }
    }

    protected final void finalize() throws Throwable {
        this.b(0);
        super.finalize();
    }

    kl(cka param0, int param1, int param2, int param3, boolean param4) {
        this.field_g = false;
        try {
            this.field_h = param0;
            this.field_d = param4 ? true : false;
            this.field_c = param2;
            this.field_e = param1;
            this.field_f = param3;
            jaggl.OpenGL.glGenTextures(1, pu.field_a, 0);
            this.field_i = pu.field_a[0];
            this.a((byte) 109, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(int param0) {
        if (!(param0 >= this.field_i)) {
            this.field_h.a((byte) -16, this.field_i, this.d(9729));
            this.field_i = 0;
        }
    }

    static {
        field_j = "This password contains your Player Name, and would be easy to guess";
    }
}
