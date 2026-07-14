/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua implements bo {
    static cn field_a;

    public final void a(kh param0, byte param1) {
        if (param1 != -19) {
            Object var4 = null;
            ((ua) this).a(113, (v) null, (qh) null);
        }
    }

    final static void a(int param0, da param1, String param2, int param3, int param4, int param5, int param6) {
        param1.a(12199, param5, param2, fm.a(false, param4), fm.a(false, param6), param3);
        if (param0 != 4) {
            field_a = null;
        }
    }

    final void a(int param0, v param1, qh param2) {
        param2.m((byte) -116);
        if (param0 != 2) {
            Object var5 = null;
            String discarded$0 = ua.a(-112, (String) null, -64);
        }
    }

    public static void a(int param0) {
        if (param0 >= -101) {
            return;
        }
        field_a = null;
    }

    public final void a(int param0, kh param1) {
        if (param0 != 200) {
            field_a = null;
        }
    }

    final static byte[] a(Object param0, int param1, int param2, boolean param3) {
        byte[] var4 = null;
        qu var5 = null;
        if (param0 != null) {
          if (!(param0 instanceof byte[])) {
            if (param0 instanceof qu) {
              var5 = (qu) param0;
              return var5.a((byte) -104, param1, param2);
            } else {
              if (param3) {
                ua.a(-63);
                throw new IllegalArgumentException();
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            var4 = (byte[]) param0;
            return b.a(param1, 0, param2, var4);
          }
        } else {
          return null;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = -61 / ((-53 - param1) / 48);
        if (0 > param0) {
            return -param0;
        }
        return param0;
    }

    final static String a(int param0, String param1, int param2) {
        if (param2 < -9) {
          if (-2 == param0) {
            return gl.a((byte) 103, tu.field_e, new String[1]);
          } else {
            if (param0 == 2) {
              return gl.a((byte) 96, cf.field_f, new String[1]);
            } else {
              if (param0 == 3) {
                return gl.a((byte) 102, np.field_V, new String[1]);
              } else {
                if (param0 == 4) {
                  return gl.a((byte) 117, rh.field_o, new String[1]);
                } else {
                  if (5 == param0) {
                    return gl.a((byte) 85, gia.field_o, new String[1]);
                  } else {
                    if (-7 != (param0 ^ -1)) {
                      if ((param0 ^ -1) != -8) {
                        if (8 != param0) {
                          if (11 != param0) {
                            if (12 == param0) {
                              return gl.a((byte) 82, ria.field_p, new String[1]);
                            } else {
                              if ((param0 ^ -1) != -14) {
                                return null;
                              } else {
                                return gl.a((byte) 96, lfa.field_n, new String[1]);
                              }
                            }
                          } else {
                            return gl.a((byte) 112, ioa.field_m, new String[1]);
                          }
                        } else {
                          return gl.a((byte) 125, wda.field_m, new String[1]);
                        }
                      } else {
                        return gl.a((byte) 110, wha.field_H, new String[1]);
                      }
                    } else {
                      return gl.a((byte) 93, kna.field_C, new String[1]);
                    }
                  }
                }
              }
            }
          }
        } else {
          field_a = null;
          if (-2 == (param0 ^ -1)) {
            return gl.a((byte) 103, tu.field_e, new String[1]);
          } else {
            if (param0 == 2) {
              return gl.a((byte) 96, cf.field_f, new String[1]);
            } else {
              if (param0 == 3) {
                return gl.a((byte) 102, np.field_V, new String[1]);
              } else {
                if (param0 == 4) {
                  return gl.a((byte) 117, rh.field_o, new String[1]);
                } else {
                  if (5 == param0) {
                    return gl.a((byte) 85, gia.field_o, new String[1]);
                  } else {
                    if (-7 != (param0 ^ -1)) {
                      if ((param0 ^ -1) != -8) {
                        if (8 != param0) {
                          if (11 != param0) {
                            if (12 == param0) {
                              return gl.a((byte) 82, ria.field_p, new String[1]);
                            } else {
                              if (param0 != -14) {
                                return null;
                              } else {
                                return gl.a((byte) 96, lfa.field_n, new String[1]);
                              }
                            }
                          } else {
                            return gl.a((byte) 112, ioa.field_m, new String[1]);
                          }
                        } else {
                          return gl.a((byte) 125, wda.field_m, new String[1]);
                        }
                      } else {
                        return gl.a((byte) 110, wha.field_H, new String[1]);
                      }
                    } else {
                      return gl.a((byte) 93, kna.field_C, new String[1]);
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void b(int param0, int param1) {
        vg var2 = null;
        int var3 = 0;
        cga var4 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        var4 = (cga) (Object) aba.field_a.f(-80);
        L0: while (true) {
          if (var4 == null) {
            if (param1 != 2) {
              return;
            } else {
              var2 = tca.field_N.f(-80);
              L1: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  rh.b(param0, param1 ^ -117);
                  var2 = tca.field_N.e(param1 + 105);
                  continue L1;
                }
              }
            }
          } else {
            wj.a(var4, param0, -121);
            var4 = (cga) (Object) aba.field_a.e(114);
            continue L0;
          }
        }
    }

    static {
    }
}
