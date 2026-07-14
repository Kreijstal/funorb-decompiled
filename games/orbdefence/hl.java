/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hl extends ej {
    private int field_S;
    private int field_T;
    private li field_R;
    static ki field_N;
    private int field_P;
    private pj field_V;
    private jj field_Q;
    private int field_U;
    private int field_O;

    private final void b(int param0, pj param1) {
        if (((hl) this).field_Q == null) {
          if (param0 == -6142) {
            if (param1 == null) {
              ((hl) this).field_Q = new jj();
              ((hl) this).a((pj) (Object) ((hl) this).field_Q, (byte) 74);
              ((hl) this).field_V = null;
              return;
            } else {
              param1.a(6, ((hl) this).field_S + 6, param1.field_r, (byte) -90, param1.field_m);
              ((hl) this).field_Q = new jj(param1);
              ((hl) this).a((pj) (Object) ((hl) this).field_Q, (byte) 74);
              ((hl) this).field_V = null;
              return;
            }
          } else {
            ((hl) this).field_R = null;
            if (param1 == null) {
              ((hl) this).field_Q = new jj();
              ((hl) this).a((pj) (Object) ((hl) this).field_Q, (byte) 74);
              ((hl) this).field_V = null;
              return;
            } else {
              param1.a(6, ((hl) this).field_S + 6, param1.field_r, (byte) -90, param1.field_m);
              ((hl) this).field_Q = new jj(param1);
              ((hl) this).a((pj) (Object) ((hl) this).field_Q, (byte) 74);
              ((hl) this).field_V = null;
              return;
            }
          }
        } else {
          ((hl) this).field_Q.b(57);
          if (param0 != -6142) {
            ((hl) this).field_R = null;
            if (param1 == null) {
              ((hl) this).field_Q = new jj();
              ((hl) this).a((pj) (Object) ((hl) this).field_Q, (byte) 74);
              ((hl) this).field_V = null;
              return;
            } else {
              param1.a(6, ((hl) this).field_S + 6, param1.field_r, (byte) -90, param1.field_m);
              ((hl) this).field_Q = new jj(param1);
              ((hl) this).a((pj) (Object) ((hl) this).field_Q, (byte) 74);
              ((hl) this).field_V = null;
              return;
            }
          } else {
            if (param1 == null) {
              ((hl) this).field_Q = new jj();
              ((hl) this).a((pj) (Object) ((hl) this).field_Q, (byte) 74);
              ((hl) this).field_V = null;
              return;
            } else {
              param1.a(6, ((hl) this).field_S + 6, param1.field_r, (byte) -90, param1.field_m);
              ((hl) this).field_Q = new jj(param1);
              ((hl) this).a((pj) (Object) ((hl) this).field_Q, (byte) 74);
              ((hl) this).field_V = null;
              return;
            }
          }
        }
    }

    void a(boolean param0, pj param1) {
        ((hl) this).field_V = param1;
        if (!param0) {
          if (((hl) this).field_R != pd.field_w) {
            if (ji.field_d == ((hl) this).field_R) {
              return;
            } else {
              ((hl) this).field_U = 0;
              ((hl) this).field_R = ji.field_d;
              return;
            }
          } else {
            ((hl) this).a(((hl) this).field_P, ((hl) this).field_V.field_m + 12, 12 + ((hl) this).field_S + ((hl) this).field_V.field_r, (byte) 114);
            ((hl) this).field_U = 0;
            return;
          }
        } else {
          return;
        }
    }

    public static void p(int param0) {
        if (param0 != 0) {
            return;
        }
        field_N = null;
    }

    boolean a(char param0, int param1, pj param2, int param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (((hl) this).field_Q != null) {
            if (98 != param1) {
              if ((param1 ^ -1) == -100) {
                boolean discarded$12 = ((hl) this).field_Q.a(-81, param2);
                return false;
              } else {
                return false;
              }
            } else {
              boolean discarded$13 = ((hl) this).field_Q.a(-81, param2);
              if ((param1 ^ -1) != -100) {
                return false;
              } else {
                boolean discarded$14 = ((hl) this).field_Q.a(-81, param2);
                return false;
              }
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final void n(int param0) {
        if (param0 != 6630) {
            ((hl) this).field_U = -124;
            if (!(ji.field_d != ((hl) this).field_R)) {
                return;
            }
            ((hl) this).field_U = 0;
            ((hl) this).field_R = qd.field_b;
            this.b(-6142, ((hl) this).field_V);
            ((hl) this).field_V = null;
            ((hl) this).field_Q.field_A = 0;
            return;
        }
        if (!(ji.field_d != ((hl) this).field_R)) {
            return;
        }
        ((hl) this).field_U = 0;
        ((hl) this).field_R = qd.field_b;
        this.b(-6142, ((hl) this).field_V);
        ((hl) this).field_V = null;
        ((hl) this).field_Q.field_A = 0;
    }

    final boolean l(int param0) {
        ((hl) this).m(param0 ^ param0);
        return super.l(194);
    }

    boolean d(boolean param0) {
        int var3 = 0;
        var3 = OrbDefence.field_D ? 1 : 0;
        if (null != ((hl) this).field_R) {
          if (((hl) this).field_R == ji.field_d) {
            ((hl) this).field_U = ((hl) this).field_U + 1;
            if (((hl) this).field_U + 1 == ((hl) this).field_T) {
              ((hl) this).field_R = pd.field_w;
              ((hl) this).a(((hl) this).field_P, 12 - -((hl) this).field_V.field_m, ((hl) this).field_V.field_r + (12 - -((hl) this).field_S), (byte) 114);
              ((hl) this).field_U = 0;
              ((hl) this).field_Q.field_A = 0;
              if (param0) {
                hl.p(-91);
                return super.d(false);
              } else {
                return super.d(false);
              }
            } else {
              ((hl) this).field_Q.field_A = -((((hl) this).field_U << 1292945384) / ((hl) this).field_T) + 256;
              if (param0) {
                hl.p(-91);
                return super.d(false);
              } else {
                return super.d(false);
              }
            }
          } else {
            if (((hl) this).field_R == qd.field_b) {
              ((hl) this).field_U = ((hl) this).field_U + 1;
              if (((hl) this).field_O != ((hl) this).field_U + 1) {
                ((hl) this).field_Q.field_A = (((hl) this).field_U << -1863735768) / ((hl) this).field_O;
                if (param0) {
                  hl.p(-91);
                  return super.d(false);
                } else {
                  return super.d(false);
                }
              } else {
                ((hl) this).field_R = null;
                ((hl) this).field_Q.field_A = 256;
                if (param0) {
                  hl.p(-91);
                  return super.d(false);
                } else {
                  return super.d(false);
                }
              }
            } else {
              if (param0) {
                hl.p(-91);
                return super.d(false);
              } else {
                return super.d(false);
              }
            }
          }
        } else {
          if (param0) {
            hl.p(-91);
            return super.d(false);
          } else {
            return super.d(false);
          }
        }
    }

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        if (param0) {
          if (tl.field_d[param2] > tl.field_d[param3]) {
            return true;
          } else {
            if (tl.field_d[param2] >= tl.field_d[param3]) {
              if (rh.field_c[param3] >= rh.field_c[param2]) {
                if (rh.field_c[param3] <= rh.field_c[param2]) {
                  if (param1 < -91) {
                    var4 = vl.field_g[param3] - -th.field_f[param3] + ld.field_b[param3];
                    var5 = th.field_f[param2] + (vl.field_g[param2] - -ld.field_b[param2]);
                    if (var5 > var4) {
                      return true;
                    } else {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L0: {
                          if (param3 >= param2) {
                            stackOut_42_0 = 0;
                            stackIn_43_0 = stackOut_42_0;
                            break L0;
                          } else {
                            stackOut_41_0 = 1;
                            stackIn_43_0 = stackOut_41_0;
                            break L0;
                          }
                        }
                        return stackIn_43_0 != 0;
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          if (rh.field_c[param3] < rh.field_c[param2]) {
            return true;
          } else {
            if (rh.field_c[param3] <= rh.field_c[param2]) {
              if (tl.field_d[param3] >= tl.field_d[param2]) {
                if (tl.field_d[param2] >= tl.field_d[param3]) {
                  if (param1 < -91) {
                    var4 = vl.field_g[param3] - -th.field_f[param3] + ld.field_b[param3];
                    var5 = th.field_f[param2] + (vl.field_g[param2] - -ld.field_b[param2]);
                    if (var5 > var4) {
                      return true;
                    } else {
                      if (var5 < var4) {
                        return false;
                      } else {
                        if (param3 >= param2) {
                          return false;
                        } else {
                          return true;
                        }
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        fg.a((byte) 51, (java.awt.Component) (Object) param0);
        if (param1 >= 104) {
          cb.a(5000, (java.awt.Component) (Object) param0);
          if (mj.field_i != null) {
            mj.field_i.a(108, (java.awt.Component) (Object) param0);
            return;
          } else {
            return;
          }
        } else {
          field_N = null;
          cb.a(5000, (java.awt.Component) (Object) param0);
          if (mj.field_i == null) {
            return;
          } else {
            mj.field_i.a(108, (java.awt.Component) (Object) param0);
            return;
          }
        }
    }

    final void m(int param0) {
        if (((hl) this).field_R != null) {
          if (qd.field_b == ((hl) this).field_R) {
            ((hl) this).field_R = null;
            ((hl) this).field_Q.field_A = 256;
            super.m(param0);
            return;
          } else {
            ((hl) this).a(12 - (-((hl) this).field_S - ((hl) this).field_V.field_r), (byte) -81, 12 - -((hl) this).field_V.field_m);
            this.b(-6142, ((hl) this).field_V);
            ((hl) this).field_R = null;
            ((hl) this).field_Q.field_A = 256;
            super.m(param0);
            return;
          }
        } else {
          super.m(param0);
          return;
        }
    }

    hl(sk param0, pj param1, int param2, int param3, int param4) {
        super(param0, param1.field_m + 12, param2 + (12 + param1.field_r));
        ((hl) this).field_S = param2;
        ((hl) this).field_P = param4;
        ((hl) this).field_O = param3;
        ((hl) this).field_T = param3;
        this.b(-6142, param1);
    }

    static {
    }
}
