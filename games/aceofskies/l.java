/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    private boolean field_d;
    static vd field_a;
    private vu field_e;
    static int field_f;
    static int field_c;
    private d field_b;
    private sn[] field_g;

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            l.a(false);
        }
    }

    private final boolean b(java.awt.Canvas param0, int param1) {
        vu var3 = null;
        jc var4 = null;
        int stackIn_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          if (param1 >= 89) {
            break L0;
          } else {
            var4 = (jc) null;
            vj discarded$2 = l.a((byte) -63, 59, (byte[]) null, (jc) null);
            break L0;
          }
        }
        L1: {
          L2: {
            var3 = ((l) this).field_e;
            if (var3 == null) {
              break L2;
            } else {
              if (!((l) this).field_d) {
                break L2;
              } else {
                if (param0 == ((vu) var3).field_b) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          this.a(param0, 91);
          break L1;
        }
        L3: {
          if (null == ((l) this).field_e) {
            break L3;
          } else {
            ((l) this).field_e.field_c.b((int)(-((l) this).field_e.field_a + kh.a(-104)));
            break L3;
          }
        }
        L4: {
          L5: {
            if (((l) this).field_e == null) {
              break L5;
            } else {
              L6: {
                if (var3 == null) {
                  break L6;
                } else {
                  if (((l) this).field_e.field_c == ((vu) var3).field_c) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              stackOut_13_0 = 1;
              stackIn_15_0 = stackOut_13_0;
              break L4;
            }
          }
          stackOut_14_0 = 0;
          stackIn_15_0 = stackOut_14_0;
          break L4;
        }
        return stackIn_15_0 != 0;
    }

    final static vj a(byte param0, int param1, byte[] param2, jc param3) {
        byte[] var8 = null;
        if (param2 == null) {
            return null;
        }
        if (param2.length == 0) {
            return null;
        }
        if (param0 != 29) {
            field_f = -49;
        }
        long var4 = jaggl.OpenGL.glCreateShaderObjectARB(param1);
        jaggl.OpenGL.glShaderSourceRawARB(var4, param2);
        jaggl.OpenGL.glCompileShaderARB(var4);
        jaggl.OpenGL.glGetObjectParameterivARB(var4, 35713, dg.field_Q, 0);
        if (dg.field_Q[0] == -1) {
            if (!(-1 != dg.field_Q[0])) {
                System.out.println("Shader compile failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var4, 35716, dg.field_Q, 1);
            if (dg.field_Q[1] > 1) {
                var8 = new byte[dg.field_Q[1]];
                jaggl.OpenGL.glGetInfoLogARB(var4, dg.field_Q[1], dg.field_Q, 0, var8, 0);
                System.out.println(new String(var8));
            }
            if (dg.field_Q[0] == 0) {
                jaggl.OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new vj(param3, var4, param1);
    }

    l(int param0, int param1, d param2) {
        this(da.a(param0, 1), cm.a(param1, (byte) 118), param2, pt.field_b, an.a(false));
    }

    private final void a(java.awt.Canvas param0, int param1) {
        mj var3 = null;
        sn[] var4 = null;
        int var5 = 0;
        sn var6 = null;
        int var7 = 0;
        vu var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        ha var11 = null;
        L0: {
          var10 = AceOfSkies.field_G ? 1 : 0;
          var3 = null;
          var4 = ((l) this).field_g;
          if (param1 > 55) {
            break L0;
          } else {
            ((l) this).field_e = (vu) null;
            break L0;
          }
        }
        var5 = 0;
        L1: while (true) {
          if (var5 >= var4.length) {
            return;
          } else {
            var6 = var4[var5];
            if (((sn) var6).field_b) {
              L2: {
                var7 = ((sn) var6).field_d;
                if (var7 != 0) {
                  if (5 == var7) {
                    if (!oi.field_d.b((byte) -90)) {
                      return;
                    } else {
                      var7 = bc.a("hw3d", (byte) -95);
                      if (-1 != var7) {
                        if (-101 >= var7) {
                          var8_int = bc.a("jaclib", (byte) 49);
                          if (var8_int != -1) {
                            if (-101 <= var8_int) {
                              var9 = bc.a("jaggl", (byte) -75);
                              if ((var9 ^ -1) != 0) {
                                if ((var9 ^ -1) <= -101) {
                                  break L2;
                                } else {
                                  return;
                                }
                              } else {
                                var6.field_b = false;
                                var5++;
                                continue L1;
                              }
                            } else {
                              return;
                            }
                          } else {
                            var6.field_b = false;
                            var5++;
                            continue L1;
                          }
                        } else {
                          return;
                        }
                      } else {
                        var6.field_b = false;
                        var5++;
                        continue L1;
                      }
                    }
                  } else {
                    if ((var7 ^ -1) != -2) {
                      if ((var7 ^ -1) == -4) {
                        if (oi.field_d.b((byte) 116)) {
                          var7 = bc.a("jaclib", (byte) 12);
                          if (0 != (var7 ^ -1)) {
                            if (var7 <= -101) {
                              var8_int = bc.a("jagdx", (byte) 47);
                              if (0 != var8_int) {
                                if (var8_int >= 100) {
                                  var9 = bc.a("hw3d", (byte) 1);
                                  if ((var9 ^ -1) != 0) {
                                    if (var9 >= 100) {
                                      break L2;
                                    } else {
                                      return;
                                    }
                                  } else {
                                    var6.field_b = false;
                                    var5++;
                                    continue L1;
                                  }
                                } else {
                                  return;
                                }
                              } else {
                                var6.field_b = false;
                                var5++;
                                continue L1;
                              }
                            } else {
                              return;
                            }
                          } else {
                            var6.field_b = false;
                            var5++;
                            continue L1;
                          }
                        } else {
                          return;
                        }
                      } else {
                        if (var7 == 2) {
                          if (!oi.field_d.b((byte) -39)) {
                            return;
                          } else {
                            var7 = bc.a("jaclib", (byte) 74);
                            if (0 != (var7 ^ -1)) {
                              if (100 <= var7) {
                                var8_int = bc.a("sw3d", (byte) 41);
                                if (var8_int != -1) {
                                  if (var8_int >= 100) {
                                    break L2;
                                  } else {
                                    return;
                                  }
                                } else {
                                  var6.field_b = false;
                                  var5++;
                                  continue L1;
                                }
                              } else {
                                return;
                              }
                            } else {
                              var6.field_b = false;
                              var5++;
                              continue L1;
                            }
                          }
                        } else {
                          throw new IllegalStateException("UT" + ((sn) var6).field_d);
                        }
                      }
                    } else {
                      if (oi.field_d.b((byte) -44)) {
                        var7 = bc.a("jaclib", (byte) -120);
                        if (var7 != -1) {
                          if (var7 > -101) {
                            return;
                          } else {
                            var8_int = bc.a("jaggl", (byte) -80);
                            if (0 != var8_int) {
                              if (var8_int < 100) {
                                return;
                              } else {
                                break L2;
                              }
                            } else {
                              var6.field_b = false;
                              var5++;
                              continue L1;
                            }
                          }
                        } else {
                          var6.field_b = false;
                          var5++;
                          continue L1;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (null != ((l) this).field_e) {
                  L4: {
                    if (!((l) this).field_e.field_d.a((byte) -73, var6)) {
                      break L4;
                    } else {
                      if (((l) this).field_e.field_c == null) {
                        break L4;
                      } else {
                        if (param0 != ((l) this).field_e.field_b) {
                          break L4;
                        } else {
                          if (var6.a(((l) this).field_e, 0)) {
                            ((l) this).field_d = true;
                            return;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  if (((sn) var6).field_d != ((l) this).field_e.field_d.field_d) {
                    break L3;
                  } else {
                    if (null == ((l) this).field_e.field_c) {
                      break L3;
                    } else {
                      var3 = ((l) this).field_e.a((byte) 38);
                      ((l) this).field_e.field_c.a(-9);
                      ((l) this).field_e = null;
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              var11 = hr.a(iq.field_h, ((l) this).field_b, -106, ((sn) var6).field_a, param0, ((sn) var6).field_d);
              if (var11 != null) {
                var8 = new vu(var11, var6, param0);
                if (var6.a(var8, 0)) {
                  L5: {
                    if (null == ((l) this).field_e) {
                      break L5;
                    } else {
                      L6: {
                        if (((vu) var8).field_c != ((l) this).field_e.field_c) {
                          break L6;
                        } else {
                          if (((vu) var8).field_b == ((l) this).field_e.field_b) {
                            ((l) this).field_d = true;
                            ((l) this).field_e = (vu) var8;
                            return;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var3 = ((l) this).field_e.a((byte) 38);
                      ((l) this).field_e.field_c.a(-9);
                      break L5;
                    }
                  }
                  L7: {
                    if (((vu) var8).field_c.b()) {
                      ((vu) var8).field_c.a(((vu) var8).field_c.c(100663296));
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (var3 == null) {
                      var8.field_a = kh.a(-75);
                      break L8;
                    } else {
                      var3.a(true, var8);
                      break L8;
                    }
                  }
                  ((l) this).field_d = true;
                  ((l) this).field_e = (vu) var8;
                  return;
                } else {
                  var6.field_b = false;
                  var5++;
                  continue L1;
                }
              } else {
                var6.field_b = false;
                var5++;
                continue L1;
              }
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    private final void a(byte param0, sn[] param1) {
        if (((l) this).field_g != param1) {
            if (!(-1 != (param1.length ^ -1))) {
                throw new IllegalArgumentException();
            }
            ((l) this).field_g = (sn[]) param1;
            ((l) this).field_d = false;
        }
        if (param0 != 116) {
            ((l) this).field_d = false;
        }
    }

    final boolean a(int param0) {
        int var2 = 10 / ((param0 - 68) / 53);
        return this.b(fa.a(-8213), 118);
    }

    final ha a(byte param0) {
        if (param0 <= 59) {
            return (ha) null;
        }
        if (null == ((l) this).field_e) {
            return null;
        }
        return ((l) this).field_e.field_c;
    }

    private l(gk param0, gk param1, d param2, rk param3, sn[] param4) {
        ((l) this).field_d = false;
        oi.field_d = param0;
        ((l) this).field_b = param2;
        iq.field_h = param1;
        ef.a((byte) 100, param3, param0);
        this.a((byte) 116, param4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 256;
    }
}
