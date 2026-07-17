/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cs implements mw {
    private int field_b;
    private int field_a;
    private int field_e;
    private int field_g;
    private int field_h;
    private int field_f;
    private fr field_c;
    private ft[] field_d;

    final static int g(int param0) {
        wt.field_i.c((byte) 66);
        if (jk.field_b.c((byte) 119)) {
            return 0;
        }
        return ji.a(true);
    }

    final void a(int param0, int param1) {
        if (param1 == 17012) {
          if (((cs) this).field_d[param0] != null) {
            ((cs) this).field_d[param0].a(109);
            ((cs) this).field_g = ((cs) this).field_g & ~(1 << param0);
            ((cs) this).field_d[param0] = null;
            return;
          } else {
            ((cs) this).field_g = ((cs) this).field_g & ~(1 << param0);
            ((cs) this).field_d[param0] = null;
            return;
          }
        } else {
          return;
        }
    }

    public final void a(int param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36008, 0);
        ((cs) this).field_h = ((cs) this).field_h & -2;
        if (param0 != -20745) {
          ((cs) this).c(-86);
          ((cs) this).field_f = this.f(24909);
          return;
        } else {
          ((cs) this).field_f = this.f(24909);
          return;
        }
    }

    final void a(kf param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((cs) this).field_f == -1) {
              throw new RuntimeException();
            } else {
              if (param2 == -14269) {
                L1: {
                  var4_int = 1 << param1;
                  if (0 != (((cs) this).field_g & ~var4_int)) {
                    L2: {
                      if (param0.field_A != ((cs) this).field_e) {
                        break L2;
                      } else {
                        if (param0.field_x != ((cs) this).field_b) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                    throw new RuntimeException();
                  } else {
                    ((cs) this).field_e = param0.field_A;
                    ((cs) this).field_b = param0.field_x;
                    break L1;
                  }
                }
                param0.a(false, wv.field_a[param1], ((cs) this).field_f);
                ((cs) this).field_d[param1] = (ft) (Object) param0;
                ((cs) this).field_g = ((cs) this).field_g | var4_int;
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("cs.H(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final boolean h(int param0) {
        int var2 = 0;
        if (param0 == -276) {
          var2 = jaggl.OpenGL.glCheckFramebufferStatusEXT(((cs) this).field_f);
          if (-36054 != var2) {
            return false;
          } else {
            return true;
          }
        } else {
          ((cs) this).a(99);
          var2 = jaggl.OpenGL.glCheckFramebufferStatusEXT(((cs) this).field_f);
          if (-36054 != var2) {
            return false;
          } else {
            return true;
          }
        }
    }

    private final int f(int param0) {
        if ((4 & ((cs) this).field_h) != 0) {
            return 36160;
        }
        if (!(0 == (2 & ((cs) this).field_h))) {
            return 36009;
        }
        if (!((((cs) this).field_h & 1) == 0)) {
            return 36008;
        }
        return -1;
    }

    protected final void finalize() throws Throwable {
        ((cs) this).field_c.b((byte) -92, ((cs) this).field_a);
        super.finalize();
    }

    public final void a(boolean param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36009, 0);
        ((cs) this).field_h = ((cs) this).field_h & -3;
        ((cs) this).field_f = this.f(24909);
        if (param0) {
            ((cs) this).field_d = null;
        }
    }

    private final void a(int param0, int param1, int param2, us param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((cs) this).field_f == -1) {
              throw new RuntimeException();
            } else {
              L1: {
                var5_int = 1 << param2;
                if (param0 == (((cs) this).field_g & var5_int)) {
                  ((cs) this).field_e = param3.field_l;
                  ((cs) this).field_b = param3.field_o;
                  break L1;
                } else {
                  L2: {
                    if (param3.field_l != ((cs) this).field_e) {
                      break L2;
                    } else {
                      if (param3.field_o != ((cs) this).field_b) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              }
              param3.a(-90, wv.field_a[param2], param1, ((cs) this).field_f);
              ((cs) this).field_d[param2] = (ft) (Object) param3;
              ((cs) this).field_g = ((cs) this).field_g | var5_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("cs.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    final void a(us param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(param1 + 4609, 0, param2, param0);
              if (param1 == -4610) {
                break L1;
              } else {
                ((cs) this).field_h = 35;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("cs.M(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public final void c(int param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36008, ((cs) this).field_a);
        ((cs) this).field_h = ((cs) this).field_h | 1;
        ((cs) this).field_f = this.f(24909);
        if (param0 != 195) {
            ((cs) this).field_d = null;
        }
    }

    public final void e(int param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36160, 0);
        if (param0 >= -32) {
          return;
        } else {
          ((cs) this).field_h = ((cs) this).field_h & -5;
          ((cs) this).field_f = this.f(24909);
          return;
        }
    }

    cs(fr param0) {
        ((cs) this).field_h = 0;
        ((cs) this).field_f = -1;
        ((cs) this).field_d = new ft[9];
        try {
            if (!param0.field_xc) {
                throw new IllegalStateException("");
            }
            ((cs) this).field_c = param0;
            jaggl.OpenGL.glGenFramebuffersEXT(1, ci.field_e, 0);
            ((cs) this).field_a = ci.field_e[0];
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "cs.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void b(int param0) {
        if (param0 != 30352) {
          return;
        } else {
          jaggl.OpenGL.glBindFramebufferEXT(36160, ((cs) this).field_a);
          ((cs) this).field_h = ((cs) this).field_h | 4;
          ((cs) this).field_f = this.f(24909);
          return;
        }
    }

    public final void d(int param0) {
        if (param0 <= 103) {
          return;
        } else {
          jaggl.OpenGL.glBindFramebufferEXT(36009, ((cs) this).field_a);
          ((cs) this).field_h = ((cs) this).field_h | 2;
          ((cs) this).field_f = this.f(24909);
          return;
        }
    }

    static {
    }
}
