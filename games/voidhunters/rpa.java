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
          if (this.field_d == -1) {
            throw new RuntimeException();
          }
          jaggl.OpenGL.glReadBuffer(vbb.field_o[param1]);
          if (param0 > 118) {
            return;
          }
          this.field_g = 14;
          return;
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
        sg stackIn_9_0 = null;
        sg stackIn_64_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        ml var4 = null;
        int var5 = 0;
        int var6 = 0;
        sg var7 = null;
        var6 = VoidHunters.field_G;
        try {
          if (param0 == 0) {
            stackIn_9_0 = gqb.a(!param2);
            return stackIn_9_0;
          }
          var7 = new sg();
          var4 = new ml(param0);
          var5 = param0;
          if (var5 == 3) {
            waa.a(var4, 18632);
          } else {
            if (var5 != 7) {
              if (var5 == 8) {
                mc.a(var4, 27);
              } else {
                if (var5 != 9) {
                  if (10 == var5) {
                    hr.a(var4, 116);
                  } else {
                    if (var5 == 11) {
                      bab.a(param2, var4);
                    } else {
                      if (var5 == 4) {
                        lhb.a((byte) 127, var4);
                      } else {
                        if (var5 == 5) {
                          lc.a(38, var4);
                        } else {
                          if (var5 != 6) {
                            if (var5 == 1) {
                              if (param1 == 0) {
                                qu.a(var4, -14);
                              } else {
                                if (1 == param1) {
                                  vab.a((byte) -94, var4);
                                }
                              }
                            } else {
                              if (var5 == 2) {
                                if (param1 == 0) {
                                  mb.a(-1688588312, var4);
                                } else {
                                  if (param1 != 1) {
                                    if (param1 == 2) {
                                      wnb.a(var4, (byte) -10);
                                    }
                                  } else {
                                    eqb.a(var4, 14670);
                                  }
                                }
                              }
                            }
                          } else {
                            ir.a(var4, (byte) 127);
                          }
                        }
                      }
                    }
                  }
                } else {
                  tkb.a(var4, -77);
                }
              }
            } else {
              leb.a((byte) -107, var4);
            }
          }
          var7.field_k = var4;
          if (!param2) {
            field_c = (uja) null;
          }
          var7.e((byte) 119);
          var7.field_k.a((byte) -128, (anb) (var7));
          stackIn_64_0 = var7;
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var3), "rpa.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (~this.field_d == param0) {
            throw new RuntimeException();
          }
          jaggl.OpenGL.glDrawBuffer(vbb.field_o[param1]);
          return;
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
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = jaggl.OpenGL.glCheckFramebufferStatusEXT(this.field_d);
          var3 = 10 % ((28 - param0) / 58);
          if (var2_int == 36053) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2), "rpa.H(" + param0 + ')');
        }
    }

    public final void c(int param0) {
        if (param0 != 31636) {
          return;
        }
        try {
          jaggl.OpenGL.glBindFramebufferEXT(36009, this.field_e);
          this.field_a = this.field_a | 2;
          this.field_d = this.e(param0 - 31634);
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
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (this.field_d == -1) {
            throw new RuntimeException();
          }
          if (param3 <= 23) {
            this.c(-123);
          }
          var5_int = 1 << param2;
          if ((~var5_int & this.field_g) != 0) {
            if (param0.field_h != this.field_j ||
              param0.field_j != this.field_i) {
              throw new RuntimeException();
            }
          } else {
            this.field_i = param0.field_j;
            this.field_j = param0.field_h;
          }
          param0.a(this.field_d, vbb.field_o[param2], param1, false);
          this.field_h[param2] = (mda) ((Object) param0);
          this.field_g = this.field_g | var5_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("rpa.N(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
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
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        try {
          if (-1 == this.field_d) {
            throw new RuntimeException();
          }
          if (param2 != -20) {
            return;
          }
          var4_int = 1 << param0;
          if ((~var4_int & this.field_g) != 0) {
            if (param1.field_w != this.field_j ||
              this.field_i != param1.field_u) {
              throw new RuntimeException();
            }
          } else {
            this.field_i = param1.field_u;
            this.field_j = param1.field_w;
          }
          param1.a(1, vbb.field_o[param0], this.field_d);
          this.field_h[param0] = (mda) ((Object) param1);
          this.field_g = this.field_g | var4_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("rpa.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, byte param1) {
        try {
          if (this.field_h[param0] != null) {
            this.field_h[param0].a(31294);
          }
          int var3_int = 115 / ((53 - param1) / 55);
          this.field_g = this.field_g & ~(1 << param0);
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if ((4 & this.field_a) != 0) {
            stackIn_4_0 = 36160;
            return stackIn_4_0;
          }
          if ((param0 & this.field_a) != 0) {
            stackIn_7_0 = 36009;
            return stackIn_7_0;
          }
          if ((1 & this.field_a) != 0) {
            stackIn_12_0 = 36008;
            return stackIn_12_0;
          }
          stackIn_14_0 = -1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2), "rpa.G(" + param0 + ')');
        }
    }

    final void a(int param0, byte param1, aia param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param2, 0, param0, 77);
          if (param1 > -124) {
            this.field_e = -30;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("rpa.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    rpa(qfa param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_a = 0;
        this.field_d = -1;
        this.field_h = new mda[9];
        try {
          if (!param0.field_U) {
            throw new IllegalStateException("");
          }
          this.field_f = param0;
          jaggl.OpenGL.glGenFramebuffersEXT(1, qea.field_r, 0);
          this.field_e = qea.field_r[0];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("rpa.<init>(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_c = new uja();
        field_b = 0;
    }
}
