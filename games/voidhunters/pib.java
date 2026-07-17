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
        ((pib) this).field_g.a(117, (pib) this);
        if (!((pib) this).field_f) {
            jaggl.OpenGL.glTexParameteri(((pib) this).field_b, 10241, ((pib) this).field_e ? 9984 : 9728);
            jaggl.OpenGL.glTexParameteri(((pib) this).field_b, 10240, 9728);
        } else {
            jaggl.OpenGL.glTexParameteri(((pib) this).field_b, 10241, ((pib) this).field_e ? 9987 : 9729);
            jaggl.OpenGL.glTexParameteri(((pib) this).field_b, 10240, 9729);
        }
    }

    protected final void finalize() throws Throwable {
        ((pib) this).e(0);
        super.finalize();
    }

    private final void a(int param0, int param1) {
        if (param0 != 0) {
          return;
        } else {
          ((pib) this).field_g.field_sb = ((pib) this).field_g.field_sb - param1;
          ((pib) this).field_g.field_sb = ((pib) this).field_g.field_sb + this.a((byte) 108);
          return;
        }
    }

    final static int b(byte param0) {
        return pqa.a(false, nua.field_p);
    }

    final static phb[] a(asb param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          if (pa.a(param2, 2, param0, param1)) {
            return uja.a(false);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("pib.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L0;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L0;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + 0 + 41);
        }
    }

    final void e(int param0) {
        if (!(param0 >= ((pib) this).field_c)) {
            ((pib) this).field_g.a(((pib) this).field_c, 109, this.a((byte) 124));
            ((pib) this).field_c = 0;
        }
    }

    final boolean c(int param0) {
        int var2 = 0;
        if (((pib) this).field_g.field_U) {
          var2 = this.a((byte) 98);
          ((pib) this).field_g.a(69, (pib) this);
          jaggl.OpenGL.glGenerateMipmapEXT(((pib) this).field_b);
          ((pib) this).field_e = true;
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
            ((pib) this).field_a = -41;
            return ((pib) this).field_c;
        }
        return ((pib) this).field_c;
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
            ((pib) this).field_g = null;
            var2 = ((pib) this).field_g.e(((pib) this).field_d, 2) * ((pib) this).field_a;
            if (((pib) this).field_e) {
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
            var2 = ((pib) this).field_g.e(((pib) this).field_d, 2) * ((pib) this).field_a;
            if (((pib) this).field_e) {
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
        if (!(((pib) this).field_f == param1)) {
            ((pib) this).field_f = param1 ? true : false;
            this.d(-22416);
        }
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        L0: {
          if (param1 != ((pib) this).field_e) {
            var3 = this.a((byte) 99);
            ((pib) this).field_e = true;
            this.d(-22416);
            this.a(0, var3);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 62) {
          ((pib) this).field_b = -88;
          return;
        } else {
          return;
        }
    }

    pib(qfa param0, int param1, int param2, int param3, boolean param4) {
        ((pib) this).field_f = false;
        try {
            ((pib) this).field_g = param0;
            ((pib) this).field_d = param2;
            ((pib) this).field_b = param1;
            ((pib) this).field_a = param3;
            ((pib) this).field_e = param4 ? true : false;
            jaggl.OpenGL.glGenTextures(1, ika.field_a, 0);
            ((pib) this).field_c = ika.field_a[0];
            this.a(0, 0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "pib.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
    }
}
