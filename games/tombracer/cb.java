/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb implements ks {
    private int field_a;
    private int field_b;
    private int field_e;
    private int field_c;
    private int field_g;
    static nh[] field_i;
    private cka field_f;
    private int field_d;
    private wia[] field_h;

    private final void a(int param0, rt param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (-1 != ((cb) this).field_a) {
              L1: {
                var5_int = param0 << param3;
                if (-1 == (((cb) this).field_e & var5_int)) {
                  ((cb) this).field_g = param1.field_o;
                  ((cb) this).field_c = param1.field_l;
                  break L1;
                } else {
                  L2: {
                    if (((cb) this).field_c != param1.field_l) {
                      break L2;
                    } else {
                      if (((cb) this).field_g == param1.field_o) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              }
              param1.a(((cb) this).field_a, param2, 0, vta.field_d[param3]);
              ((cb) this).field_h[param3] = (wia) (Object) param1;
              ((cb) this).field_e = ((cb) this).field_e | var5_int;
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("cb.B(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final boolean c(int param0) {
        int var2 = 0;
        int var3 = 0;
        var2 = jaggl.OpenGL.glCheckFramebufferStatusEXT(((cb) this).field_a);
        var3 = 59 % ((param0 - 53) / 33);
        if (36053 == var2) {
          return true;
        } else {
          return false;
        }
    }

    public final void c(byte param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36009, ((cb) this).field_b);
        ((cb) this).field_d = ((cb) this).field_d | 2;
        ((cb) this).field_a = this.e(0);
        if (param0 < 29) {
            ((cb) this).a((byte) -62);
        }
    }

    public final void d(byte param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36008, 0);
        if (param0 < 10) {
          return;
        } else {
          ((cb) this).field_d = ((cb) this).field_d & -2;
          ((cb) this).field_a = this.e(0);
          return;
        }
    }

    public final void a(byte param0) {
        if (param0 >= -115) {
          return;
        } else {
          jaggl.OpenGL.glBindFramebufferEXT(36008, ((cb) this).field_b);
          ((cb) this).field_d = ((cb) this).field_d | 1;
          ((cb) this).field_a = this.e(0);
          return;
        }
    }

    final void b(int param0, int param1) {
        if (param0 == ((cb) this).field_a) {
            throw new RuntimeException();
        }
        jaggl.OpenGL.glReadBuffer(vta.field_d[param1]);
    }

    public final void b(byte param0) {
        if (param0 != -36) {
          ((cb) this).c((byte) 91);
          jaggl.OpenGL.glBindFramebufferEXT(36160, 0);
          ((cb) this).field_d = ((cb) this).field_d & -5;
          ((cb) this).field_a = this.e(0);
          return;
        } else {
          jaggl.OpenGL.glBindFramebufferEXT(36160, 0);
          ((cb) this).field_d = ((cb) this).field_d & -5;
          ((cb) this).field_a = this.e(0);
          return;
        }
    }

    final void a(int param0, int param1) {
        int var3 = -110 % ((-35 - param0) / 34);
        if (!(null == ((cb) this).field_h[param1])) {
            ((cb) this).field_h[param1].a(109);
        }
        ((cb) this).field_e = ((cb) this).field_e & ~(1 << param1);
        ((cb) this).field_h[param1] = null;
    }

    final void a(int param0, kba param1, boolean param2) {
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
            if (-1 == ((cb) this).field_a) {
              throw new RuntimeException();
            } else {
              L1: {
                var4_int = 1 << param0;
                if (-1 == (var4_int & ((cb) this).field_e)) {
                  ((cb) this).field_c = param1.field_n;
                  ((cb) this).field_g = param1.field_l;
                  break L1;
                } else {
                  L2: {
                    if (param1.field_n != ((cb) this).field_c) {
                      break L2;
                    } else {
                      if (((cb) this).field_g == param1.field_l) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              }
              L3: {
                param1.a(vta.field_d[param0], ((cb) this).field_a, -23992);
                if (param2) {
                  break L3;
                } else {
                  ((cb) this).a(-122, 86);
                  break L3;
                }
              }
              ((cb) this).field_h[param0] = (wia) (Object) param1;
              ((cb) this).field_e = ((cb) this).field_e | var4_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("cb.O(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 41);
        }
    }

    final void a(boolean param0, rt param1, int param2) {
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
              this.a(1, param1, 0, param2);
              if (param0) {
                break L1;
              } else {
                cb.d(-3);
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
            stackOut_3_1 = new StringBuilder().append("cb.N(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 41);
        }
    }

    final void a(int param0, byte param1) {
        if (param1 != -91) {
            ((cb) this).a(-7, -21);
            if (!(0 != ((cb) this).field_a)) {
                throw new RuntimeException();
            }
            jaggl.OpenGL.glDrawBuffer(vta.field_d[param0]);
            return;
        }
        if (!(0 != ((cb) this).field_a)) {
            throw new RuntimeException();
        }
        jaggl.OpenGL.glDrawBuffer(vta.field_d[param0]);
    }

    private final int e(int param0) {
        if ((((cb) this).field_d & 4) != 0) {
          return 36160;
        } else {
          if (param0 == (((cb) this).field_d & 2)) {
            if ((((cb) this).field_d & 1) != 0) {
              return 36008;
            } else {
              return -1;
            }
          } else {
            return 36009;
          }
        }
    }

    public final void b(int param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36160, ((cb) this).field_b);
        ((cb) this).field_d = ((cb) this).field_d | 4;
        ((cb) this).field_a = this.e(param0 ^ param0);
    }

    public final void a(int param0) {
        if (param0 != 4245) {
          int discarded$2 = this.e(-53);
          jaggl.OpenGL.glBindFramebufferEXT(36009, 0);
          ((cb) this).field_d = ((cb) this).field_d & -3;
          ((cb) this).field_a = this.e(0);
          return;
        } else {
          jaggl.OpenGL.glBindFramebufferEXT(36009, 0);
          ((cb) this).field_d = ((cb) this).field_d & -3;
          ((cb) this).field_a = this.e(0);
          return;
        }
    }

    protected final void finalize() throws Throwable {
        ((cb) this).field_f.e(2, ((cb) this).field_b);
        super.finalize();
    }

    public static void d(int param0) {
        if (param0 != 36053) {
            field_i = null;
            field_i = null;
            return;
        }
        field_i = null;
    }

    cb(cka param0) {
        ((cb) this).field_a = -1;
        ((cb) this).field_h = new wia[9];
        ((cb) this).field_d = 0;
        try {
            if (!param0.field_id) {
                throw new IllegalStateException("");
            }
            ((cb) this).field_f = param0;
            jaggl.OpenGL.glGenFramebuffersEXT(1, tg.field_b, 0);
            ((cb) this).field_b = tg.field_b[0];
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "cb.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
