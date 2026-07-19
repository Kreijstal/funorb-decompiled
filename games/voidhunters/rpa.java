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
        if (0 == (this.field_d ^ -1)) {
          throw new RuntimeException();
        } else {
          jaggl.OpenGL.glReadBuffer(vbb.field_o[param1]);
          if (param0 <= 118) {
            this.field_g = 14;
            return;
          } else {
            return;
          }
        }
    }

    public final void d(int param0) {
        if (param0 <= 7) {
          this.field_i = -33;
          jaggl.OpenGL.glBindFramebufferEXT(36008, 0);
          this.field_a = this.field_a & -2;
          this.field_d = this.e(2);
          return;
        } else {
          jaggl.OpenGL.glBindFramebufferEXT(36008, 0);
          this.field_a = this.field_a & -2;
          this.field_d = this.e(2);
          return;
        }
    }

    public final void b(int param0) {
        if (param0 != -5574) {
          return;
        } else {
          jaggl.OpenGL.glBindFramebufferEXT(36160, this.field_e);
          this.field_a = this.field_a | 4;
          this.field_d = this.e(2);
          return;
        }
    }

    final static sg a(int param0, int param1, boolean param2) {
        ml var4 = null;
        int var5 = 0;
        int var6 = 0;
        sg var7 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var6 = VoidHunters.field_G;
        if (param0 == 0) {
          L0: {
            if (param2) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          return gqb.a(stackIn_5_0 != 0);
        } else {
          L1: {
            var7 = new sg();
            var4 = new ml(param0);
            var5 = param0;
            if (-4 == (var5 ^ -1)) {
              waa.a(var4, 18632);
              break L1;
            } else {
              if (var5 != 7) {
                if (-9 == (var5 ^ -1)) {
                  mc.a(var4, 27);
                  break L1;
                } else {
                  if (-10 != (var5 ^ -1)) {
                    if (10 == var5) {
                      hr.a(var4, 116);
                      var7.field_k = var4;
                      if (!param2) {
                        field_c = (uja) null;
                        var7.e((byte) 119);
                        var7.field_k.a((byte) -128, (anb) (var7));
                        return var7;
                      } else {
                        var7.e((byte) 119);
                        var7.field_k.a((byte) -128, (anb) (var7));
                        return var7;
                      }
                    } else {
                      if (var5 == 11) {
                        bab.a(param2, var4);
                        var7.field_k = var4;
                        if (!param2) {
                          field_c = (uja) null;
                          var7.e((byte) 119);
                          var7.field_k.a((byte) -128, (anb) (var7));
                          return var7;
                        } else {
                          var7.e((byte) 119);
                          var7.field_k.a((byte) -128, (anb) (var7));
                          return var7;
                        }
                      } else {
                        if ((var5 ^ -1) == -5) {
                          lhb.a((byte) 127, var4);
                          var7.field_k = var4;
                          if (!param2) {
                            field_c = (uja) null;
                            var7.e((byte) 119);
                            var7.field_k.a((byte) -128, (anb) (var7));
                            return var7;
                          } else {
                            var7.e((byte) 119);
                            var7.field_k.a((byte) -128, (anb) (var7));
                            return var7;
                          }
                        } else {
                          if (-6 == (var5 ^ -1)) {
                            lc.a(38, var4);
                            var7.field_k = var4;
                            if (param2) {
                              var7.e((byte) 119);
                              var7.field_k.a((byte) -128, (anb) (var7));
                              return var7;
                            } else {
                              field_c = (uja) null;
                              var7.e((byte) 119);
                              var7.field_k.a((byte) -128, (anb) (var7));
                              return var7;
                            }
                          } else {
                            if ((var5 ^ -1) != -7) {
                              if (-2 == (var5 ^ -1)) {
                                if (-1 == (param1 ^ -1)) {
                                  qu.a(var4, -14);
                                  var7.field_k = var4;
                                  if (param2) {
                                    var7.e((byte) 119);
                                    var7.field_k.a((byte) -128, (anb) (var7));
                                    return var7;
                                  } else {
                                    field_c = (uja) null;
                                    var7.e((byte) 119);
                                    var7.field_k.a((byte) -128, (anb) (var7));
                                    return var7;
                                  }
                                } else {
                                  if (1 == param1) {
                                    vab.a((byte) -94, var4);
                                    var7.field_k = var4;
                                    if (param2) {
                                      var7.e((byte) 119);
                                      var7.field_k.a((byte) -128, (anb) (var7));
                                      return var7;
                                    } else {
                                      field_c = (uja) null;
                                      var7.e((byte) 119);
                                      var7.field_k.a((byte) -128, (anb) (var7));
                                      return var7;
                                    }
                                  } else {
                                    var7.field_k = var4;
                                    if (param2) {
                                      var7.e((byte) 119);
                                      var7.field_k.a((byte) -128, (anb) (var7));
                                      return var7;
                                    } else {
                                      field_c = (uja) null;
                                      var7.e((byte) 119);
                                      var7.field_k.a((byte) -128, (anb) (var7));
                                      return var7;
                                    }
                                  }
                                }
                              } else {
                                if ((var5 ^ -1) != -3) {
                                  var7.field_k = var4;
                                  if (!param2) {
                                    field_c = (uja) null;
                                    var7.e((byte) 119);
                                    var7.field_k.a((byte) -128, (anb) (var7));
                                    return var7;
                                  } else {
                                    var7.e((byte) 119);
                                    var7.field_k.a((byte) -128, (anb) (var7));
                                    return var7;
                                  }
                                } else {
                                  if (param1 == 0) {
                                    mb.a(-1688588312, var4);
                                    var7.field_k = var4;
                                    if (!param2) {
                                      field_c = (uja) null;
                                      var7.e((byte) 119);
                                      var7.field_k.a((byte) -128, (anb) (var7));
                                      return var7;
                                    } else {
                                      var7.e((byte) 119);
                                      var7.field_k.a((byte) -128, (anb) (var7));
                                      return var7;
                                    }
                                  } else {
                                    if ((param1 ^ -1) != -2) {
                                      L2: {
                                        if (param1 != 2) {
                                          break L2;
                                        } else {
                                          wnb.a(var4, (byte) -10);
                                          break L2;
                                        }
                                      }
                                      var7.field_k = var4;
                                      if (!param2) {
                                        field_c = (uja) null;
                                        var7.e((byte) 119);
                                        var7.field_k.a((byte) -128, (anb) (var7));
                                        return var7;
                                      } else {
                                        var7.e((byte) 119);
                                        var7.field_k.a((byte) -128, (anb) (var7));
                                        return var7;
                                      }
                                    } else {
                                      eqb.a(var4, 14670);
                                      var7.field_k = var4;
                                      if (!param2) {
                                        field_c = (uja) null;
                                        var7.e((byte) 119);
                                        var7.field_k.a((byte) -128, (anb) (var7));
                                        return var7;
                                      } else {
                                        var7.e((byte) 119);
                                        var7.field_k.a((byte) -128, (anb) (var7));
                                        return var7;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              ir.a(var4, (byte) 127);
                              var7.field_k = var4;
                              if (param2) {
                                var7.e((byte) 119);
                                var7.field_k.a((byte) -128, (anb) (var7));
                                return var7;
                              } else {
                                field_c = (uja) null;
                                var7.e((byte) 119);
                                var7.field_k.a((byte) -128, (anb) (var7));
                                return var7;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    tkb.a(var4, -77);
                    break L1;
                  }
                }
              } else {
                leb.a((byte) -107, var4);
                break L1;
              }
            }
          }
          var7.field_k = var4;
          if (param2) {
            var7.e((byte) 119);
            var7.field_k.a((byte) -128, (anb) (var7));
            return var7;
          } else {
            field_c = (uja) null;
            var7.e((byte) 119);
            var7.field_k.a((byte) -128, (anb) (var7));
            return var7;
          }
        }
    }

    final void a(int param0, int param1) {
        if ((this.field_d ^ -1) == param0) {
            throw new RuntimeException();
        }
        jaggl.OpenGL.glDrawBuffer(vbb.field_o[param1]);
    }

    final boolean g(int param0) {
        int var2 = 0;
        int var3 = 0;
        var2 = jaggl.OpenGL.glCheckFramebufferStatusEXT(this.field_d);
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
          jaggl.OpenGL.glBindFramebufferEXT(36009, this.field_e);
          this.field_a = this.field_a | 2;
          this.field_d = this.e(param0 + -31634);
          return;
        }
    }

    public final void b(byte param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36160, 0);
        if (param0 > -42) {
          this.field_e = 16;
          this.field_a = this.field_a & -5;
          this.field_d = this.e(2);
          return;
        } else {
          this.field_a = this.field_a & -5;
          this.field_d = this.e(2);
          return;
        }
    }

    private final void a(aia param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (runtimeException);
            stackOut_12_1 = new StringBuilder().append("rpa.N(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        this.field_f.a((byte) 107, this.field_e);
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
        int decompiledRegionSelector0 = 0;
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
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("rpa.K(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        if (this.field_h[param0] != null) {
          this.field_h[param0].a(31294);
          var3 = 115 / ((53 - param1) / 55);
          this.field_g = this.field_g & (1 << param0 ^ -1);
          this.field_h[param0] = null;
          return;
        } else {
          var3 = 115 / ((53 - param1) / 55);
          this.field_g = this.field_g & (1 << param0 ^ -1);
          this.field_h[param0] = null;
          return;
        }
    }

    public final void a(byte param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36009, 0);
        this.field_a = this.field_a & -3;
        this.field_d = this.e(2);
        if (param0 <= 52) {
            this.field_d = 85;
        }
    }

    public static void f(int param0) {
        field_c = null;
        if (param0 != 1) {
            field_c = (uja) null;
        }
    }

    public final void a(int param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36008, this.field_e);
        int var2 = 32 / ((param0 - 3) / 57);
        this.field_a = this.field_a | 1;
        this.field_d = this.e(2);
    }

    private final int e(int param0) {
        if (!((4 & this.field_a) == 0)) {
            return 36160;
        }
        if ((param0 & this.field_a) != 0) {
            return 36009;
        }
        if (!((1 & this.field_a) == 0)) {
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
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("rpa.L(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    rpa(qfa param0) {
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
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rpa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new uja();
        field_b = 0;
    }
}
