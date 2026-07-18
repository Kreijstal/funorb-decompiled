/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rpa implements jaa {
    private int field_e;
    private int field_a;
    private qfa field_f;
    private int field_i;
    private int field_j;
    static uja field_c;
    private int field_d;
    private int field_g;
    static volatile int field_b;
    private mda[] field_h;

    final void b(int param0, int param1) {
        if (((rpa) this).field_d == -1) {
          throw new RuntimeException();
        } else {
          jaggl.OpenGL.glReadBuffer(vbb.field_o[param1]);
          if (param0 <= 118) {
            ((rpa) this).field_g = 14;
            return;
          } else {
            return;
          }
        }
    }

    public final void d(int param0) {
        if (param0 <= 7) {
          ((rpa) this).field_i = -33;
          jaggl.OpenGL.glBindFramebufferEXT(36008, 0);
          ((rpa) this).field_a = ((rpa) this).field_a & -2;
          ((rpa) this).field_d = this.e(2);
          return;
        } else {
          jaggl.OpenGL.glBindFramebufferEXT(36008, 0);
          ((rpa) this).field_a = ((rpa) this).field_a & -2;
          ((rpa) this).field_d = this.e(2);
          return;
        }
    }

    public final void b(int param0) {
        if (param0 != -5574) {
          return;
        } else {
          jaggl.OpenGL.glBindFramebufferEXT(36160, ((rpa) this).field_e);
          ((rpa) this).field_a = ((rpa) this).field_a | 4;
          ((rpa) this).field_d = this.e(2);
          return;
        }
    }

    final static sg a(int param0, int param1, boolean param2) {
        sg var3 = null;
        ml var4 = null;
        int var5 = 0;
        int var6 = 0;
        sg var7 = null;
        var6 = VoidHunters.field_G;
        if (param0 == 0) {
          int discarded$8 = 1;
          return gqb.a();
        } else {
          var7 = new sg();
          var3 = var7;
          var4 = new ml(param0);
          var5 = param0;
          if (var5 == 3) {
            int discarded$9 = 18632;
            waa.a(var4);
            var7.field_k = var4;
            var7.e((byte) 119);
            var7.field_k.a((byte) -128, (anb) (Object) var7);
            return var7;
          } else {
            if (var5 != 7) {
              if (var5 == 8) {
                int discarded$10 = 27;
                mc.a(var4);
                var7.field_k = var4;
                var7.e((byte) 119);
                var7.field_k.a((byte) -128, (anb) (Object) var7);
                return var7;
              } else {
                if (var5 != 9) {
                  if (10 == var5) {
                    int discarded$11 = 116;
                    hr.a(var4);
                    var7.field_k = var4;
                    var7.e((byte) 119);
                    var7.field_k.a((byte) -128, (anb) (Object) var7);
                    return var7;
                  } else {
                    if (var5 == 11) {
                      bab.a(true, var4);
                      var7.field_k = var4;
                      var7.e((byte) 119);
                      var7.field_k.a((byte) -128, (anb) (Object) var7);
                      return var7;
                    } else {
                      if (var5 == 4) {
                        lhb.a((byte) 127, var4);
                        var7.field_k = var4;
                        var7.e((byte) 119);
                        var7.field_k.a((byte) -128, (anb) (Object) var7);
                        return var7;
                      } else {
                        if (var5 == 5) {
                          lc.a(38, var4);
                          var7.field_k = var4;
                          var7.e((byte) 119);
                          var7.field_k.a((byte) -128, (anb) (Object) var7);
                          return var7;
                        } else {
                          if (var5 != 6) {
                            if (var5 == 1) {
                              if (param1 == 0) {
                                qu.a(var4, -14);
                                var7.field_k = var4;
                                var7.e((byte) 119);
                                var7.field_k.a((byte) -128, (anb) (Object) var7);
                                return var7;
                              } else {
                                if (1 != param1) {
                                  var7.field_k = var4;
                                  var7.e((byte) 119);
                                  var7.field_k.a((byte) -128, (anb) (Object) var7);
                                  return var7;
                                } else {
                                  vab.a((byte) -94, var4);
                                  var7.field_k = var4;
                                  var7.e((byte) 119);
                                  var7.field_k.a((byte) -128, (anb) (Object) var7);
                                  return var7;
                                }
                              }
                            } else {
                              if (var5 != 2) {
                                var7.field_k = var4;
                                var7.e((byte) 119);
                                var7.field_k.a((byte) -128, (anb) (Object) var7);
                                return var7;
                              } else {
                                if (param1 == 0) {
                                  mb.a(-1688588312, var4);
                                  var7.field_k = var4;
                                  var7.e((byte) 119);
                                  var7.field_k.a((byte) -128, (anb) (Object) var7);
                                  return var7;
                                } else {
                                  if (param1 != 1) {
                                    if (param1 != 2) {
                                      var7.field_k = var4;
                                      var7.e((byte) 119);
                                      var7.field_k.a((byte) -128, (anb) (Object) var7);
                                      return var7;
                                    } else {
                                      int discarded$12 = -10;
                                      wnb.a(var4);
                                      var7.field_k = var4;
                                      var7.e((byte) 119);
                                      var7.field_k.a((byte) -128, (anb) (Object) var7);
                                      return var7;
                                    }
                                  } else {
                                    int discarded$13 = 14670;
                                    eqb.a(var4);
                                    var7.field_k = var4;
                                    var7.e((byte) 119);
                                    var7.field_k.a((byte) -128, (anb) (Object) var7);
                                    return var7;
                                  }
                                }
                              }
                            }
                          } else {
                            int discarded$14 = 127;
                            ir.a(var4);
                            var7.field_k = var4;
                            var7.e((byte) 119);
                            var7.field_k.a((byte) -128, (anb) (Object) var7);
                            return var7;
                          }
                        }
                      }
                    }
                  }
                } else {
                  int discarded$15 = -77;
                  tkb.a(var4);
                  var7.field_k = var4;
                  var7.e((byte) 119);
                  var7.field_k.a((byte) -128, (anb) (Object) var7);
                  return var7;
                }
              }
            } else {
              leb.a((byte) -107, var4);
              var7.field_k = var4;
              var7.e((byte) 119);
              var7.field_k.a((byte) -128, (anb) (Object) var7);
              return var7;
            }
          }
        }
    }

    final void a(int param0, int param1) {
        if (~((rpa) this).field_d == param0) {
            throw new RuntimeException();
        }
        jaggl.OpenGL.glDrawBuffer(vbb.field_o[param1]);
    }

    final boolean g(int param0) {
        int var2 = 0;
        int var3 = 0;
        var2 = jaggl.OpenGL.glCheckFramebufferStatusEXT(((rpa) this).field_d);
        var3 = 10 % ((28 - param0) / 58);
        if (var2 == 36053) {
          return true;
        } else {
          return false;
        }
    }

    public final void c(int param0) {
        if (param0 != 31636) {
          return;
        } else {
          jaggl.OpenGL.glBindFramebufferEXT(36009, ((rpa) this).field_e);
          ((rpa) this).field_a = ((rpa) this).field_a | 2;
          ((rpa) this).field_d = this.e(param0 + -31634);
          return;
        }
    }

    public final void b(byte param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36160, 0);
        if (param0 > -42) {
          ((rpa) this).field_e = 16;
          ((rpa) this).field_a = ((rpa) this).field_a & -5;
          ((rpa) this).field_d = this.e(2);
          return;
        } else {
          ((rpa) this).field_a = ((rpa) this).field_a & -5;
          ((rpa) this).field_d = this.e(2);
          return;
        }
    }

    private final void a(aia param0, int param1, int param2) {
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
            if (((rpa) this).field_d != -1) {
              L1: {
                var5_int = 1 << param2;
                if ((~var5_int & ((rpa) this).field_g) == 0) {
                  ((rpa) this).field_i = param0.field_j;
                  ((rpa) this).field_j = param0.field_h;
                  break L1;
                } else {
                  L2: {
                    if (param0.field_h != ((rpa) this).field_j) {
                      break L2;
                    } else {
                      if (param0.field_j != ((rpa) this).field_i) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              }
              param0.a(((rpa) this).field_d, vbb.field_o[param2], 0, false);
              ((rpa) this).field_h[param2] = (mda) (Object) param0;
              ((rpa) this).field_g = ((rpa) this).field_g | var5_int;
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
            stackOut_10_1 = new StringBuilder().append("rpa.N(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + 0 + ',' + param2 + ',' + 77 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        ((rpa) this).field_f.a((byte) 107, ((rpa) this).field_e);
        super.finalize();
    }

    final void a(int param0, nv param1, byte param2) {
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
            if (-1 == ((rpa) this).field_d) {
              throw new RuntimeException();
            } else {
              if (param2 == -20) {
                L1: {
                  var4_int = 1 << param0;
                  if (-1 != (var4_int & ((rpa) this).field_g)) {
                    L2: {
                      if (param1.field_w != ((rpa) this).field_j) {
                        break L2;
                      } else {
                        if (((rpa) this).field_i != param1.field_u) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                    throw new RuntimeException();
                  } else {
                    ((rpa) this).field_i = param1.field_u;
                    ((rpa) this).field_j = param1.field_w;
                    break L1;
                  }
                }
                param1.a(1, vbb.field_o[param0], ((rpa) this).field_d);
                ((rpa) this).field_h[param0] = (mda) (Object) param1;
                ((rpa) this).field_g = ((rpa) this).field_g | var4_int;
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
            stackOut_13_1 = new StringBuilder().append("rpa.K(").append(param0).append(',');
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
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        if (((rpa) this).field_h[param0] != null) {
          ((rpa) this).field_h[param0].a(31294);
          var3 = 115 / ((53 - param1) / 55);
          ((rpa) this).field_g = ((rpa) this).field_g & ~(1 << param0);
          ((rpa) this).field_h[param0] = null;
          return;
        } else {
          var3 = 115 / ((53 - param1) / 55);
          ((rpa) this).field_g = ((rpa) this).field_g & ~(1 << param0);
          ((rpa) this).field_h[param0] = null;
          return;
        }
    }

    public final void a(byte param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36009, 0);
        ((rpa) this).field_a = ((rpa) this).field_a & -3;
        ((rpa) this).field_d = this.e(2);
        if (param0 <= 52) {
            ((rpa) this).field_d = 85;
        }
    }

    public static void f() {
        field_c = null;
    }

    public final void a(int param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36008, ((rpa) this).field_e);
        int var2 = 32 / ((param0 - 3) / 57);
        ((rpa) this).field_a = ((rpa) this).field_a | 1;
        ((rpa) this).field_d = this.e(2);
    }

    private final int e(int param0) {
        if (!((4 & ((rpa) this).field_a) == 0)) {
            return 36160;
        }
        if ((param0 & ((rpa) this).field_a) != 0) {
            return 36009;
        }
        if (!((1 & ((rpa) this).field_a) == 0)) {
            return 36008;
        }
        return -1;
    }

    final void a(int param0, byte param1, aia param2) {
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
              int discarded$2 = 77;
              this.a(param2, 0, param0);
              if (param1 <= -124) {
                break L1;
              } else {
                ((rpa) this).field_e = -30;
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
            stackOut_3_1 = new StringBuilder().append("rpa.L(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    rpa(qfa param0) {
        ((rpa) this).field_a = 0;
        ((rpa) this).field_d = -1;
        ((rpa) this).field_h = new mda[9];
        try {
            if (!param0.field_U) {
                throw new IllegalStateException("");
            }
            ((rpa) this).field_f = param0;
            jaggl.OpenGL.glGenFramebuffersEXT(1, qea.field_r, 0);
            ((rpa) this).field_e = qea.field_r[0];
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "rpa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new uja();
        field_b = 0;
    }
}
