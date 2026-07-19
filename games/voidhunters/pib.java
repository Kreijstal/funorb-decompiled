/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pib implements mda {
    int field_c;
    private int field_a;
    int field_d;
    qfa field_g;
    int field_b;
    private boolean field_f;
    private boolean field_e;

    private final void d(int param0) {
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
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        L0: {
          this.field_g.a(117, (pib) (this));
          if (this.field_f) {
            L1: {
              stackOut_5_0 = this.field_b;
              stackOut_5_1 = 10241;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              if (!this.field_e) {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = stackIn_7_1;
                stackOut_7_2 = 9729;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                stackIn_8_2 = stackOut_7_2;
                break L1;
              } else {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = 9987;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                break L1;
              }
            }
            jaggl.OpenGL.glTexParameteri(stackIn_8_0, stackIn_8_1, stackIn_8_2);
            jaggl.OpenGL.glTexParameteri(this.field_b, 10240, 9729);
            break L0;
          } else {
            L2: {
              stackOut_1_0 = this.field_b;
              stackOut_1_1 = 10241;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (!this.field_e) {
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
            jaggl.OpenGL.glTexParameteri(this.field_b, 10240, 9728);
            break L0;
          }
        }
        if (param0 != -22416) {
          this.field_d = -87;
          return;
        } else {
          return;
        }
    }

    protected final void finalize() throws Throwable {
        this.e(0);
        super.finalize();
    }

    private final void a(int param0, int param1) {
        if (param0 != 0) {
          return;
        } else {
          this.field_g.field_sb = this.field_g.field_sb - param1;
          this.field_g.field_sb = this.field_g.field_sb + this.a((byte) 108);
          return;
        }
    }

    final static int b(byte param0) {
        if (param0 != 118) {
            return 29;
        }
        return pqa.a(false, nua.field_p);
    }

    final static phb[] a(asb param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        phb[] stackIn_2_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        phb[] stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param3 == 0) {
              if (pa.a(param2, 2, param0, param1)) {
                return uja.a(false);
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = (phb[]) null;
              stackIn_2_0 = stackOut_1_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("pib.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_2_0;
    }

    final void e(int param0) {
        if (!(param0 >= this.field_c)) {
            this.field_g.a(this.field_c, 109, this.a((byte) 124));
            this.field_c = 0;
        }
    }

    final boolean c(int param0) {
        int var2 = 0;
        if (this.field_g.field_U) {
          var2 = this.a((byte) 98);
          this.field_g.a(69, (pib) (this));
          jaggl.OpenGL.glGenerateMipmapEXT(this.field_b);
          this.field_e = true;
          this.d(-22416);
          this.a(param0 ^ 9729, var2);
          return true;
        } else {
          if (param0 != 9729) {
            return true;
          } else {
            return false;
          }
        }
    }

    final int b(int param0) {
        if (param0 != 23307) {
            this.field_a = -41;
            return this.field_c;
        }
        return this.field_c;
    }

    private final int a(byte param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 93) {
          L0: {
            this.field_g = (qfa) null;
            var2 = this.field_g.e(this.field_d, 2) * this.field_a;
            if (this.field_e) {
              stackOut_7_0 = var2 * 4 / 3;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = var2;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            var2 = this.field_g.e(this.field_d, 2) * this.field_a;
            if (this.field_e) {
              stackOut_3_0 = var2 * 4 / 3;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = var2;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 31 / ((param0 - -20) / 52);
        if (!(this.field_f == param1)) {
            this.field_f = param1 ? true : false;
            this.d(-22416);
        }
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        L0: {
          if (param1 != this.field_e) {
            var3 = this.a((byte) 99);
            this.field_e = true;
            this.d(-22416);
            this.a(0, var3);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 62) {
          this.field_b = -88;
          return;
        } else {
          return;
        }
    }

    pib(qfa param0, int param1, int param2, int param3, boolean param4) {
        this.field_f = false;
        try {
            this.field_g = param0;
            this.field_d = param2;
            this.field_b = param1;
            this.field_a = param3;
            this.field_e = param4 ? true : false;
            jaggl.OpenGL.glGenTextures(1, ika.field_a, 0);
            this.field_c = ika.field_a[0];
            this.a(0, 0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "pib.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
