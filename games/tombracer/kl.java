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
        int var2 = 0;
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
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        L0: {
          L1: {
            this.field_h.a(param0, (kl) (this));
            if (this.field_g) {
              break L1;
            } else {
              L2: {
                stackOut_1_0 = this.field_e;
                stackOut_1_1 = 10241;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_2_0 = stackOut_1_0;
                stackIn_2_1 = stackOut_1_1;
                if (!this.field_d) {
                  stackOut_3_0 = stackIn_3_0;
                  stackOut_3_1 = stackIn_3_1;
                  stackOut_3_2 = 9728;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  stackIn_4_2 = stackOut_3_2;
                  break L2;
                } else {
                  stackOut_2_0 = stackIn_2_0;
                  stackOut_2_1 = stackIn_2_1;
                  stackOut_2_2 = 9984;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_4_1 = stackOut_2_1;
                  stackIn_4_2 = stackOut_2_2;
                  break L2;
                }
              }
              jaggl.OpenGL.glTexParameteri(stackIn_4_0, stackIn_4_1, stackIn_4_2);
              jaggl.OpenGL.glTexParameteri(this.field_e, 10240, 9728);
              if (!TombRacer.field_G) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L3: {
            stackOut_5_0 = this.field_e;
            stackOut_5_1 = 10241;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (!this.field_d) {
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = 9729;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = 9987;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          jaggl.OpenGL.glTexParameteri(stackIn_8_0, stackIn_8_1, stackIn_8_2);
          jaggl.OpenGL.glTexParameteri(this.field_e, 10240, 9729);
          break L0;
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
            this.field_h = (cka) null;
            if (this.field_d) {
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
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = this.field_h.a(this.field_c, (byte) -65) * this.field_f;
        if (param0 != 9729) {
          L0: {
            kl.c(61);
            if (!this.field_d) {
              stackOut_7_0 = var2;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = var2 * 4 / 3;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (!this.field_d) {
              stackOut_3_0 = var2;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = var2 * 4 / 3;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
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
          if (param0 != this.field_g) {
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
