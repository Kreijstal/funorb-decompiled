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
        if (0 == (((rpa) this).field_d ^ -1)) {
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
            if (-4 == var5) {
              waa.a(var4, 18632);
              break L1;
            } else {
              if (var5 != 7) {
                if (-9 == var5) {
                  mc.a(var4, 27);
                  break L1;
                } else {
                  if (-10 != (var5 ^ -1)) {
                    if (10 == var5) {
                      hr.a(var4, 116);
                      var7.field_k = var4;
                      if (!param2) {
                        field_c = null;
                        var7.e((byte) 119);
                        var7.field_k.a((byte) -128, (anb) (Object) var7);
                        return var7;
                      } else {
                        var7.e((byte) 119);
                        var7.field_k.a((byte) -128, (anb) (Object) var7);
                        return var7;
                      }
                    } else {
                      if (var5 == 11) {
                        bab.a(param2, var4);
                        var7.field_k = var4;
                        if (!param2) {
                          field_c = null;
                          var7.e((byte) 119);
                          var7.field_k.a((byte) -128, (anb) (Object) var7);
                          return var7;
                        } else {
                          var7.e((byte) 119);
                          var7.field_k.a((byte) -128, (anb) (Object) var7);
                          return var7;
                        }
                      } else {
                        if (var5 == -5) {
                          lhb.a((byte) 127, var4);
                          var7.field_k = var4;
                          if (!param2) {
                            field_c = null;
                            var7.e((byte) 119);
                            var7.field_k.a((byte) -128, (anb) (Object) var7);
                            return var7;
                          } else {
                            var7.e((byte) 119);
                            var7.field_k.a((byte) -128, (anb) (Object) var7);
                            return var7;
                          }
                        } else {
                          if (-6 == var5) {
                            lc.a(38, var4);
                            var7.field_k = var4;
                            if (param2) {
                              var7.e((byte) 119);
                              var7.field_k.a((byte) -128, (anb) (Object) var7);
                              return var7;
                            } else {
                              field_c = null;
                              var7.e((byte) 119);
                              var7.field_k.a((byte) -128, (anb) (Object) var7);
                              return var7;
                            }
                          } else {
                            if (var5 != -7) {
                              if (-2 == var5) {
                                if (-1 == (param1 ^ -1)) {
                                  qu.a(var4, -14);
                                  var7.field_k = var4;
                                  if (param2) {
                                    var7.e((byte) 119);
                                    var7.field_k.a((byte) -128, (anb) (Object) var7);
                                    return var7;
                                  } else {
                                    field_c = null;
                                    var7.e((byte) 119);
                                    var7.field_k.a((byte) -128, (anb) (Object) var7);
                                    return var7;
                                  }
                                } else {
                                  if (1 == param1) {
                                    vab.a((byte) -94, var4);
                                    var7.field_k = var4;
                                    if (param2) {
                                      var7.e((byte) 119);
                                      var7.field_k.a((byte) -128, (anb) (Object) var7);
                                      return var7;
                                    } else {
                                      field_c = null;
                                      var7.e((byte) 119);
                                      var7.field_k.a((byte) -128, (anb) (Object) var7);
                                      return var7;
                                    }
                                  } else {
                                    var7.field_k = var4;
                                    if (param2) {
                                      var7.e((byte) 119);
                                      var7.field_k.a((byte) -128, (anb) (Object) var7);
                                      return var7;
                                    } else {
                                      field_c = null;
                                      var7.e((byte) 119);
                                      var7.field_k.a((byte) -128, (anb) (Object) var7);
                                      return var7;
                                    }
                                  }
                                }
                              } else {
                                if ((var5 ^ -1) != -3) {
                                  var7.field_k = var4;
                                  if (!param2) {
                                    field_c = null;
                                    var7.e((byte) 119);
                                    var7.field_k.a((byte) -128, (anb) (Object) var7);
                                    return var7;
                                  } else {
                                    var7.e((byte) 119);
                                    var7.field_k.a((byte) -128, (anb) (Object) var7);
                                    return var7;
                                  }
                                } else {
                                  if (param1 == 0) {
                                    mb.a(-1688588312, var4);
                                    var7.field_k = var4;
                                    if (!param2) {
                                      field_c = null;
                                      var7.e((byte) 119);
                                      var7.field_k.a((byte) -128, (anb) (Object) var7);
                                      return var7;
                                    } else {
                                      var7.e((byte) 119);
                                      var7.field_k.a((byte) -128, (anb) (Object) var7);
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
                                        field_c = null;
                                        var7.e((byte) 119);
                                        var7.field_k.a((byte) -128, (anb) (Object) var7);
                                        return var7;
                                      } else {
                                        var7.e((byte) 119);
                                        var7.field_k.a((byte) -128, (anb) (Object) var7);
                                        return var7;
                                      }
                                    } else {
                                      eqb.a(var4, 14670);
                                      var7.field_k = var4;
                                      if (!param2) {
                                        field_c = null;
                                        var7.e((byte) 119);
                                        var7.field_k.a((byte) -128, (anb) (Object) var7);
                                        return var7;
                                      } else {
                                        var7.e((byte) 119);
                                        var7.field_k.a((byte) -128, (anb) (Object) var7);
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
                                var7.field_k.a((byte) -128, (anb) (Object) var7);
                                return var7;
                              } else {
                                field_c = null;
                                var7.e((byte) 119);
                                var7.field_k.a((byte) -128, (anb) (Object) var7);
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
            var7.field_k.a((byte) -128, (anb) (Object) var7);
            return var7;
          } else {
            field_c = null;
            var7.e((byte) 119);
            var7.field_k.a((byte) -128, (anb) (Object) var7);
            return var7;
          }
        }
    }

    final void a(int param0, int param1) {
        if ((((rpa) this).field_d ^ -1) == param0) {
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

    private final void a(aia param0, int param1, int param2, int param3) {
        int var5 = 0;
        if ((((rpa) this).field_d ^ -1) != 0) {
          L0: {
            if (param3 > 23) {
              break L0;
            } else {
              ((rpa) this).c(-123);
              break L0;
            }
          }
          var5 = 1 << param2;
          if (((var5 ^ -1) & ((rpa) this).field_g) != 0) {
            if (param0.field_h == ((rpa) this).field_j) {
              if (param0.field_j != ((rpa) this).field_i) {
                throw new RuntimeException();
              } else {
                param0.a(((rpa) this).field_d, vbb.field_o[param2], param1, false);
                ((rpa) this).field_h[param2] = (mda) (Object) param0;
                ((rpa) this).field_g = ((rpa) this).field_g | var5;
                return;
              }
            } else {
              throw new RuntimeException();
            }
          } else {
            ((rpa) this).field_i = param0.field_j;
            ((rpa) this).field_j = param0.field_h;
            param0.a(((rpa) this).field_d, vbb.field_o[param2], param1, false);
            ((rpa) this).field_h[param2] = (mda) (Object) param0;
            ((rpa) this).field_g = ((rpa) this).field_g | var5;
            return;
          }
        } else {
          throw new RuntimeException();
        }
    }

    protected final void finalize() throws Throwable {
        ((rpa) this).field_f.a((byte) 107, ((rpa) this).field_e);
        super.finalize();
    }

    final void a(int param0, nv param1, byte param2) {
        int var4 = 0;
        if (-1 == ((rpa) this).field_d) {
          throw new RuntimeException();
        } else {
          if (param2 == -20) {
            var4 = 1 << param0;
            if (-1 != (var4 & ((rpa) this).field_g)) {
              if (param1.field_w == ((rpa) this).field_j) {
                if (((rpa) this).field_i != param1.field_u) {
                  throw new RuntimeException();
                } else {
                  param1.a(1, vbb.field_o[param0], ((rpa) this).field_d);
                  ((rpa) this).field_h[param0] = (mda) (Object) param1;
                  ((rpa) this).field_g = ((rpa) this).field_g | var4;
                  return;
                }
              } else {
                throw new RuntimeException();
              }
            } else {
              ((rpa) this).field_i = param1.field_u;
              ((rpa) this).field_j = param1.field_w;
              param1.a(1, vbb.field_o[param0], ((rpa) this).field_d);
              ((rpa) this).field_h[param0] = (mda) (Object) param1;
              ((rpa) this).field_g = ((rpa) this).field_g | var4;
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        if (((rpa) this).field_h[param0] != null) {
          ((rpa) this).field_h[param0].a(31294);
          var3 = 115 / ((53 - param1) / 55);
          ((rpa) this).field_g = ((rpa) this).field_g & (1 << param0 ^ -1);
          ((rpa) this).field_h[param0] = null;
          return;
        } else {
          var3 = 115 / ((53 - param1) / 55);
          ((rpa) this).field_g = ((rpa) this).field_g & (1 << param0 ^ -1);
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

    public static void f(int param0) {
        field_c = null;
        if (param0 != 1) {
            field_c = null;
        }
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
        this.a(param2, 0, param0, 77);
        if (param1 > -124) {
            ((rpa) this).field_e = -30;
        }
    }

    rpa(qfa param0) {
        ((rpa) this).field_a = 0;
        ((rpa) this).field_d = -1;
        ((rpa) this).field_h = new mda[9];
        if (!param0.field_U) {
            throw new IllegalStateException("");
        }
        ((rpa) this).field_f = param0;
        jaggl.OpenGL.glGenFramebuffersEXT(1, qea.field_r, 0);
        ((rpa) this).field_e = qea.field_r[0];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new uja();
        field_b = 0;
    }
}
