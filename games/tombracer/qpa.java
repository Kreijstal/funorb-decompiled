/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qpa implements bo {
    private int field_a;
    static jea field_b;
    private int field_c;

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            field_b = null;
        }
    }

    public final void a(int param0, kh param1) {
        param1.i(((qpa) this).field_a, param0 + -200);
        if (param0 != 200) {
          ((qpa) this).field_a = -84;
          param1.i(((qpa) this).field_c, 0);
          return;
        } else {
          param1.i(((qpa) this).field_c, 0);
          return;
        }
    }

    final void b(int param0, int param1) {
        ((qpa) this).field_a = param0;
        int var3 = 28 % ((-35 - param1) / 61);
    }

    public final void a(kh param0, byte param1) {
        ((qpa) this).field_a = param0.h(255);
        if (param1 != -19) {
          qpa.a(false);
          ((qpa) this).field_c = param0.h(255);
          return;
        } else {
          ((qpa) this).field_c = param0.h(255);
          return;
        }
    }

    final void a(int param0, int param1) {
        if (param0 != 7) {
            Object var4 = null;
            ((qpa) this).a((kh) null, (byte) -41);
            ((qpa) this).field_c = param1;
            return;
        }
        ((qpa) this).field_c = param1;
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        if (param5 < 123) {
          qpa.a(true);
          if (-1 != (param2 ^ -1)) {
            if (1 != param2) {
              if (-3 != (param2 ^ -1)) {
                if (-4 != (param2 ^ -1)) {
                  if (4 != param2) {
                    if ((param2 ^ -1) != -13) {
                      if (param2 != 5) {
                        if (param2 != 6) {
                          if (param2 != 7) {
                            if (-9 != param2) {
                              if (-10 != param2) {
                                if (-11 != (param2 ^ -1)) {
                                  if (param2 != 11) {
                                    uw.field_g[param2].field_p = pm.field_h[param2];
                                    return;
                                  } else {
                                    uw.field_g[param2] = (wv) (Object) new rd(param2, param6, param4, param0, param3, param1);
                                    uw.field_g[param2].field_p = pm.field_h[param2];
                                    return;
                                  }
                                } else {
                                  uw.field_g[param2] = (wv) (Object) new vv(param2, param6, param4, param0, param3, param1);
                                  uw.field_g[param2].field_p = pm.field_h[param2];
                                  return;
                                }
                              } else {
                                uw.field_g[param2] = (wv) (Object) new oka(param2, param6, param4, param0, param3, param1);
                                uw.field_g[param2].field_p = pm.field_h[param2];
                                return;
                              }
                            } else {
                              uw.field_g[param2] = (wv) (Object) new jn(param2, param6, param4, param0, param3, param1);
                              uw.field_g[param2].field_p = pm.field_h[param2];
                              return;
                            }
                          } else {
                            uw.field_g[param2] = (wv) (Object) new ow(param2, param6, param4, param0, param3, param1);
                            uw.field_g[param2].field_p = pm.field_h[param2];
                            return;
                          }
                        } else {
                          uw.field_g[param2] = (wv) (Object) new vba(param2, param6, param4, param0, param3, param1);
                          uw.field_g[param2].field_p = pm.field_h[param2];
                          return;
                        }
                      } else {
                        uw.field_g[param2] = (wv) (Object) new qp(param2, param6, param4, param0, param3, param1);
                        uw.field_g[param2].field_p = pm.field_h[param2];
                        return;
                      }
                    } else {
                      uw.field_g[param2] = (wv) (Object) new epa(param2, param6, param4, param0, param3, param1);
                      uw.field_g[param2].field_p = pm.field_h[param2];
                      return;
                    }
                  } else {
                    uw.field_g[param2] = (wv) (Object) new epa(param2, param6, param4, param0, param3, param1);
                    uw.field_g[param2].field_p = pm.field_h[param2];
                    return;
                  }
                } else {
                  uw.field_g[param2] = (wv) (Object) new pk(param2, param6, param4, param0, param3, param1);
                  uw.field_g[param2].field_p = pm.field_h[param2];
                  return;
                }
              } else {
                uw.field_g[param2] = (wv) (Object) new jn(param2, param6, param4, param0, param3, param1);
                uw.field_g[param2].field_p = pm.field_h[param2];
                return;
              }
            } else {
              uw.field_g[param2] = (wv) (Object) new se(param2, param6, param4, param0, param3, param1);
              uw.field_g[param2].field_p = pm.field_h[param2];
              return;
            }
          } else {
            uw.field_g[param2] = (wv) (Object) new sv(param2, param6, param4, param0, param3, param1);
            uw.field_g[param2].field_p = pm.field_h[param2];
            return;
          }
        } else {
          L0: {
            if (-1 != (param2 ^ -1)) {
              if (1 != param2) {
                if (-3 != param2) {
                  if (-4 != param2) {
                    if (4 != param2) {
                      if ((param2 ^ -1) != -13) {
                        if (param2 != 5) {
                          if (param2 != 6) {
                            if (param2 != 7) {
                              if (-9 != param2) {
                                if (-10 != param2) {
                                  if (-11 == (param2 ^ -1)) {
                                    uw.field_g[param2] = (wv) (Object) new vv(param2, param6, param4, param0, param3, param1);
                                    break L0;
                                  } else {
                                    if (param2 == 11) {
                                      uw.field_g[param2] = (wv) (Object) new rd(param2, param6, param4, param0, param3, param1);
                                      break L0;
                                    } else {
                                      uw.field_g[param2].field_p = pm.field_h[param2];
                                      return;
                                    }
                                  }
                                } else {
                                  uw.field_g[param2] = (wv) (Object) new oka(param2, param6, param4, param0, param3, param1);
                                  break L0;
                                }
                              } else {
                                uw.field_g[param2] = (wv) (Object) new jn(param2, param6, param4, param0, param3, param1);
                                uw.field_g[param2].field_p = pm.field_h[param2];
                                return;
                              }
                            } else {
                              uw.field_g[param2] = (wv) (Object) new ow(param2, param6, param4, param0, param3, param1);
                              break L0;
                            }
                          } else {
                            uw.field_g[param2] = (wv) (Object) new vba(param2, param6, param4, param0, param3, param1);
                            uw.field_g[param2].field_p = pm.field_h[param2];
                            return;
                          }
                        } else {
                          uw.field_g[param2] = (wv) (Object) new qp(param2, param6, param4, param0, param3, param1);
                          uw.field_g[param2].field_p = pm.field_h[param2];
                          return;
                        }
                      } else {
                        uw.field_g[param2] = (wv) (Object) new epa(param2, param6, param4, param0, param3, param1);
                        uw.field_g[param2].field_p = pm.field_h[param2];
                        return;
                      }
                    } else {
                      uw.field_g[param2] = (wv) (Object) new epa(param2, param6, param4, param0, param3, param1);
                      uw.field_g[param2].field_p = pm.field_h[param2];
                      return;
                    }
                  } else {
                    uw.field_g[param2] = (wv) (Object) new pk(param2, param6, param4, param0, param3, param1);
                    uw.field_g[param2].field_p = pm.field_h[param2];
                    return;
                  }
                } else {
                  uw.field_g[param2] = (wv) (Object) new jn(param2, param6, param4, param0, param3, param1);
                  break L0;
                }
              } else {
                uw.field_g[param2] = (wv) (Object) new se(param2, param6, param4, param0, param3, param1);
                uw.field_g[param2].field_p = pm.field_h[param2];
                return;
              }
            } else {
              uw.field_g[param2] = (wv) (Object) new sv(param2, param6, param4, param0, param3, param1);
              break L0;
            }
          }
          uw.field_g[param2].field_p = pm.field_h[param2];
          return;
        }
    }

    static {
    }
}
