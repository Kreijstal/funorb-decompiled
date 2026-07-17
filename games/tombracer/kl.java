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

    public static void c() {
        field_a = null;
        field_b = null;
        field_j = null;
    }

    final boolean e(int param0) {
        int var2 = 0;
        if (((kl) this).field_h.field_id) {
          int discarded$4 = 9729;
          var2 = this.d();
          ((kl) this).field_h.a(true, (kl) this);
          jaggl.OpenGL.glGenerateMipmapEXT(((kl) this).field_e);
          ((kl) this).field_d = true;
          int discarded$5 = 1;
          this.a();
          this.a((byte) 111, var2);
          return true;
        } else {
          if (param0 != 9729) {
            ((kl) this).field_h = null;
            return false;
          } else {
            return false;
          }
        }
    }

    private final void a() {
        ((kl) this).field_h.a(true, (kl) this);
        if (!((kl) this).field_g) {
            jaggl.OpenGL.glTexParameteri(((kl) this).field_e, 10241, ((kl) this).field_d ? 9984 : 9728);
            jaggl.OpenGL.glTexParameteri(((kl) this).field_e, 10240, 9728);
        } else {
            jaggl.OpenGL.glTexParameteri(((kl) this).field_e, 10241, ((kl) this).field_d ? 9987 : 9729);
            jaggl.OpenGL.glTexParameteri(((kl) this).field_e, 10240, 9729);
        }
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        if (param1 != 4) {
          L0: {
            ((kl) this).field_h = null;
            if (((kl) this).field_d) {
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              stackOut_11_0 = 1;
              stackIn_13_0 = stackOut_11_0;
              break L0;
            }
          }
          L1: {
            stackOut_13_0 = stackIn_13_0;
            stackIn_15_0 = stackOut_13_0;
            stackIn_14_0 = stackOut_13_0;
            if (param0) {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = 0;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              break L1;
            } else {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = 1;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              break L1;
            }
          }
          L2: {
            if (stackIn_16_0 == stackIn_16_1) {
              break L2;
            } else {
              int discarded$4 = 9729;
              var3 = this.d();
              ((kl) this).field_d = true;
              int discarded$5 = 1;
              this.a();
              this.a((byte) 127, var3);
              break L2;
            }
          }
          return;
        } else {
          L3: {
            if (((kl) this).field_d) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L3;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L3;
            }
          }
          L4: {
            stackOut_4_0 = stackIn_4_0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (param0) {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L4;
            } else {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L4;
            }
          }
          L5: {
            if (stackIn_7_0 == stackIn_7_1) {
              break L5;
            } else {
              int discarded$6 = 9729;
              var3 = this.d();
              ((kl) this).field_d = true;
              int discarded$7 = 1;
              this.a();
              this.a((byte) 127, var3);
              break L5;
            }
          }
          return;
        }
    }

    private final int d() {
        int var2 = ((kl) this).field_h.a(((kl) this).field_c, (byte) -65) * ((kl) this).field_f;
        return ((kl) this).field_d ? var2 * 4 / 3 : var2;
    }

    final void b(boolean param0, int param1) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        L0: {
          if (param0 != ((kl) this).field_g) {
            L1: {
              stackOut_2_0 = this;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (!param0) {
                stackOut_4_0 = this;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_3_0 = this;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            ((kl) this).field_g = stackIn_5_1 != 0;
            int discarded$2 = 1;
            this.a();
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != 3) {
          ((kl) this).field_i = 93;
          return;
        } else {
          return;
        }
    }

    final int f(int param0) {
        if (param0 != 0) {
            this.a((byte) -36, 103);
            return ((kl) this).field_i;
        }
        return ((kl) this).field_i;
    }

    private final void a(byte param0, int param1) {
        ((kl) this).field_h.field_jb = ((kl) this).field_h.field_jb - param1;
        int discarded$0 = 9729;
        ((kl) this).field_h.field_jb = ((kl) this).field_h.field_jb + this.d();
        if (param0 < 104) {
            ((kl) this).field_c = 73;
        }
    }

    protected final void finalize() throws Throwable {
        ((kl) this).b(0);
        super.finalize();
    }

    kl(cka param0, int param1, int param2, int param3, boolean param4) {
        ((kl) this).field_g = false;
        try {
            ((kl) this).field_h = param0;
            ((kl) this).field_d = param4 ? true : false;
            ((kl) this).field_c = param2;
            ((kl) this).field_e = param1;
            ((kl) this).field_f = param3;
            jaggl.OpenGL.glGenTextures(1, pu.field_a, 0);
            ((kl) this).field_i = pu.field_a[0];
            this.a((byte) 109, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "kl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void b(int param0) {
        if (!(param0 >= ((kl) this).field_i)) {
            int discarded$0 = 9729;
            ((kl) this).field_h.a((byte) -16, ((kl) this).field_i, this.d());
            ((kl) this).field_i = 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "This password contains your Player Name, and would be easy to guess";
    }
}
