/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rt implements ws {
    private int field_i;
    private boolean field_c;
    wl field_j;
    private boolean field_a;
    int field_b;
    int field_d;
    static String field_e;
    static tp field_h;
    int field_f;
    static String field_g;

    public static void c(byte param0) {
        field_e = null;
        field_h = null;
        field_g = null;
    }

    private final void a(int param0, byte param1) {
        ((rt) this).field_j.field_lb = ((rt) this).field_j.field_lb - param0;
        ((rt) this).field_j.field_lb = ((rt) this).field_j.field_lb + this.c(4);
    }

    final int a(int param0) {
        if (param0 < 58) {
            return -2;
        }
        return ((rt) this).field_d;
    }

    protected final void finalize() throws Throwable {
        ((rt) this).b((byte) -2);
        super.finalize();
    }

    final boolean a(boolean param0) {
        int var2 = 0;
        if (((rt) this).field_j.field_A) {
          var2 = this.c(4);
          ((rt) this).field_j.a((rt) this, 1);
          jaggl.OpenGL.glGenerateMipmapEXT(((rt) this).field_f);
          ((rt) this).field_c = true;
          this.b(9987);
          this.a(var2, (byte) 1);
          return true;
        } else {
          if (param0) {
            return true;
          } else {
            return false;
          }
        }
    }

    final void b(byte param0) {
        if (!(0 >= ((rt) this).field_d)) {
            ((rt) this).field_j.b(((rt) this).field_d, this.c(4), 121);
            ((rt) this).field_d = 0;
        }
        int var2 = 81 / ((58 - param0) / 49);
    }

    private final int c(int param0) {
        int var2 = ((rt) this).field_j.e(-32334, ((rt) this).field_b) * ((rt) this).field_i;
        return ((rt) this).field_c ? var2 * 4 / 3 : var2;
    }

    final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        L0: {
          if (param0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = stackIn_3_0;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (((rt) this).field_c) {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          if (stackIn_6_0 != stackIn_6_1) {
            var3 = this.c(4);
            ((rt) this).field_c = true;
            this.b(9987);
            this.a(var3, (byte) 1);
            break L2;
          } else {
            break L2;
          }
        }
        if (param1) {
          field_h = null;
          return;
        } else {
          return;
        }
    }

    final static void b(int param0, byte param1) {
        rh var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            gn.field_a = param0;
            var2 = (rh) (Object) di.field_M.d(268435455);
            L1: while (true) {
              if (var2 == null) {
                L2: {
                  var3 = -52 % ((-46 - param1) / 52);
                  if (null == ao.field_c) {
                    break L2;
                  } else {
                    var2 = (rh) (Object) ao.field_c.d(268435455);
                    L3: while (true) {
                      if (var2 == null) {
                        break L2;
                      } else {
                        L4: {
                          if (var2.field_i.b((byte) 82)) {
                            var2.field_g.f(128 + var2.field_h * gn.field_a >> 8);
                            break L4;
                          } else {
                            var2.c(-125);
                            break L4;
                          }
                        }
                        var2 = (rh) (Object) ao.field_c.b((byte) 103);
                        continue L3;
                      }
                    }
                  }
                }
                break L0;
              } else {
                L5: {
                  if (!var2.field_i.b((byte) 99)) {
                    var2.c(-128);
                    break L5;
                  } else {
                    var2.field_g.f(gn.field_a * var2.field_h - -128 >> 8);
                    break L5;
                  }
                }
                var2 = (rh) (Object) di.field_M.b((byte) 103);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2_ref, "rt.N(" + param0 + 44 + param1 + 41);
        }
    }

    final void a(boolean param0, int param1) {
        int stackIn_3_0 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        L0: {
          if (((rt) this).field_a) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        if (stackIn_3_0 != (param0 ? 1 : 0)) {
          if (param1 != -128) {
            ((rt) this).field_b = -89;
            return;
          } else {
            return;
          }
        } else {
          L1: {
            stackOut_4_0 = this;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (!param0) {
              stackOut_6_0 = this;
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L1;
            } else {
              stackOut_5_0 = this;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L1;
            }
          }
          ((rt) this).field_a = stackIn_7_1 != 0;
          this.b(9987);
          if (param1 == -128) {
            return;
          } else {
            ((rt) this).field_b = -89;
            return;
          }
        }
    }

    private final void b(int param0) {
        ((rt) this).field_j.a((rt) this, 1);
        if (!((rt) this).field_a) {
            jaggl.OpenGL.glTexParameteri(((rt) this).field_f, 10241, ((rt) this).field_c ? 9984 : 9728);
            jaggl.OpenGL.glTexParameteri(((rt) this).field_f, 10240, 9728);
        } else {
            jaggl.OpenGL.glTexParameteri(((rt) this).field_f, 10241, ((rt) this).field_c ? 9987 : 9729);
            jaggl.OpenGL.glTexParameteri(((rt) this).field_f, 10240, 9729);
        }
    }

    rt(wl param0, int param1, int param2, int param3, boolean param4) {
        ((rt) this).field_a = false;
        try {
            ((rt) this).field_f = param1;
            ((rt) this).field_b = param2;
            ((rt) this).field_i = param3;
            ((rt) this).field_j = param0;
            ((rt) this).field_c = param4 ? true : false;
            jaggl.OpenGL.glGenTextures(1, hd.field_c, 0);
            ((rt) this).field_d = hd.field_c[0];
            this.a(0, (byte) 1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "rt.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
