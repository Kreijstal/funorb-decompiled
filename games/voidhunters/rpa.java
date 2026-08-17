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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (0 == (this.field_d ^ -1)) {
              throw new RuntimeException();
            } else {
              jaggl.OpenGL.glReadBuffer(vbb.field_o[param1]);
              if (param0 > 118) {
                break L0;
              } else {
                this.field_g = 14;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var3), "rpa.M(" + param0 + ',' + param1 + ')');
        }
    }

    public final void d(int param0) {
        try {
            if (param0 <= 7) {
                this.field_i = -33;
            }
            jaggl.OpenGL.glBindFramebufferEXT(36008, 0);
            this.field_a = this.field_a & -2;
            this.field_d = this.e(2);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rpa.E(" + param0 + ')');
        }
    }

    public final void b(int param0) {
        if (param0 != -5574) {
            return;
        }
        try {
            jaggl.OpenGL.glBindFramebufferEXT(36160, this.field_e);
            this.field_a = this.field_a | 4;
            this.field_d = this.e(2);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rpa.F(" + param0 + ')');
        }
    }

    final static sg a(int param0, int param1, boolean param2) {
        int stackIn_8_0 = 0;
        sg stackIn_9_0 = null;
        sg stackIn_64_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        ml var4 = null;
        int var5 = 0;
        int var6 = 0;
        sg var7 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                if (param2) {
                  stackIn_8_0 = 0;
                  break L1;
                } else {
                  stackIn_8_0 = 1;
                  break L1;
                }
              }
              stackIn_9_0 = gqb.a(stackIn_8_0 != 0);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                var7 = new sg();
                var4 = new ml(param0);
                var5 = param0;
                if (-4 == (var5 ^ -1)) {
                  waa.a(var4, 18632);
                  break L2;
                } else {
                  if (var5 != 7) {
                    if (-9 == (var5 ^ -1)) {
                      mc.a(var4, 27);
                      break L2;
                    } else {
                      if (-10 != (var5 ^ -1)) {
                        if (10 == var5) {
                          hr.a(var4, 116);
                          break L2;
                        } else {
                          if (var5 == 11) {
                            bab.a(param2, var4);
                            break L2;
                          } else {
                            if ((var5 ^ -1) == -5) {
                              lhb.a((byte) 127, var4);
                              break L2;
                            } else {
                              if (-6 == (var5 ^ -1)) {
                                lc.a(38, var4);
                                break L2;
                              } else {
                                if ((var5 ^ -1) != -7) {
                                  if (-2 == (var5 ^ -1)) {
                                    if (-1 == (param1 ^ -1)) {
                                      qu.a(var4, -14);
                                      break L2;
                                    } else {
                                      if (1 != param1) {
                                        break L2;
                                      } else {
                                        vab.a((byte) -94, var4);
                                        break L2;
                                      }
                                    }
                                  } else {
                                    if ((var5 ^ -1) != -3) {
                                      break L2;
                                    } else {
                                      if (param1 == 0) {
                                        mb.a(-1688588312, var4);
                                        break L2;
                                      } else {
                                        if ((param1 ^ -1) != -2) {
                                          if (param1 != 2) {
                                            break L2;
                                          } else {
                                            wnb.a(var4, (byte) -10);
                                            break L2;
                                          }
                                        } else {
                                          eqb.a(var4, 14670);
                                          break L2;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  ir.a(var4, (byte) 127);
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        tkb.a(var4, -77);
                        break L2;
                      }
                    }
                  } else {
                    leb.a((byte) -107, var4);
                    break L2;
                  }
                }
              }
              L3: {
                var7.field_k = var4;
                if (param2) {
                  break L3;
                } else {
                  field_c = (uja) null;
                  break L3;
                }
              }
              var7.e((byte) 119);
              var7.field_k.a((byte) -128, (anb) (var7));
              stackIn_64_0 = (sg) (var7);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var3), "rpa.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_64_0;
        }
    }

    final void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if ((this.field_d ^ -1) != param0) {
              jaggl.OpenGL.glDrawBuffer(vbb.field_o[param1]);
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var3), "rpa.O(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean g(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = jaggl.OpenGL.glCheckFramebufferStatusEXT(this.field_d);
            var3 = 10 % ((28 - param0) / 58);
            if (var2_int != 36053) {
              stackIn_4_0 = 0;
              break L0;
            } else {
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2), "rpa.H(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    public final void c(int param0) {
        if (param0 != 31636) {
            return;
        }
        try {
            jaggl.OpenGL.glBindFramebufferEXT(36009, this.field_e);
            this.field_a = this.field_a | 2;
            this.field_d = this.e(param0 + -31634);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rpa.B(" + param0 + ')');
        }
    }

    public final void b(byte param0) {
        try {
            jaggl.OpenGL.glBindFramebufferEXT(36160, 0);
            if (param0 > -42) {
                this.field_e = 16;
            }
            this.field_a = this.field_a & -5;
            this.field_d = this.e(2);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rpa.A(" + param0 + ')');
        }
    }

    private final void a(aia param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if ((this.field_d ^ -1) != 0) {
              L1: {
                if (param3 > 23) {
                  break L1;
                } else {
                  this.c(-123);
                  break L1;
                }
              }
              L2: {
                var5_int = 1 << param2;
                if (((var5_int ^ -1) & this.field_g) == 0) {
                  this.field_i = param0.field_j;
                  this.field_j = param0.field_h;
                  break L2;
                } else {
                  L3: {
                    if (param0.field_h != this.field_j) {
                      break L3;
                    } else {
                      if (param0.field_j != this.field_i) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              }
              param0.a(this.field_d, vbb.field_o[param2], param1, false);
              this.field_h[param2] = (mda) ((Object) param0);
              this.field_g = this.field_g | var5_int;
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("rpa.N(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        try {
            this.field_f.a((byte) 107, this.field_e);
            super.finalize();
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rpa.finalize()");
        }
    }

    final void a(int param0, nv param1, byte param2) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        try {
          L0: {
            if (-1 == this.field_d) {
              throw new RuntimeException();
            } else {
              if (param2 == -20) {
                L1: {
                  var4_int = 1 << param0;
                  if (-1 != ((var4_int ^ -1) & this.field_g ^ -1)) {
                    L2: {
                      if (param1.field_w != this.field_j) {
                        break L2;
                      } else {
                        if (this.field_i != param1.field_u) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                    throw new RuntimeException();
                  } else {
                    this.field_i = param1.field_u;
                    this.field_j = param1.field_w;
                    break L1;
                  }
                }
                param1.a(1, vbb.field_o[param0], this.field_d);
                this.field_h[param0] = (mda) ((Object) param1);
                this.field_g = this.field_g | var4_int;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("rpa.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, byte param1) {
        try {
            if (this.field_h[param0] != null) {
                this.field_h[param0].a(31294);
            }
            int var3_int = 115 / ((53 - param1) / 55);
            this.field_g = this.field_g & (1 << param0 ^ -1);
            this.field_h[param0] = null;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rpa.I(" + param0 + ',' + param1 + ')');
        }
    }

    public final void a(byte param0) {
        try {
            jaggl.OpenGL.glBindFramebufferEXT(36009, 0);
            this.field_a = this.field_a & -3;
            this.field_d = this.e(2);
            if (param0 <= 52) {
                this.field_d = 85;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rpa.D(" + param0 + ')');
        }
    }

    public static void f(int param0) {
        try {
            field_c = null;
            if (param0 != 1) {
                field_c = (uja) null;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rpa.P(" + param0 + ')');
        }
    }

    public final void a(int param0) {
        try {
            jaggl.OpenGL.glBindFramebufferEXT(36008, this.field_e);
            int var2_int = 32 / ((param0 - 3) / 57);
            this.field_a = this.field_a | 1;
            this.field_d = this.e(2);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rpa.C(" + param0 + ')');
        }
    }

    private final int e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if ((4 & this.field_a) != 0) {
              stackIn_4_0 = 36160;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param0 & this.field_a) == 0) {
                if ((1 & this.field_a) != 0) {
                  stackIn_12_0 = 36008;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_14_0 = -1;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_7_0 = 36009;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2), "rpa.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    final void a(int param0, byte param1, aia param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(param2, 0, param0, 77);
              if (param1 <= -124) {
                break L1;
              } else {
                this.field_e = -30;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("rpa.L(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    rpa(qfa param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_a = 0;
        this.field_d = -1;
        this.field_h = new mda[9];
        try {
          L0: {
            if (param0.field_U) {
              this.field_f = param0;
              jaggl.OpenGL.glGenFramebuffersEXT(1, qea.field_r, 0);
              this.field_e = qea.field_r[0];
              break L0;
            } else {
              throw new IllegalStateException("");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("rpa.<init>(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    static {
        field_c = new uja();
        field_b = 0;
    }
}
