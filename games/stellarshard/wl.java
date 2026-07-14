/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wl extends tb {
    private oa field_Q;
    private int field_bb;
    static boolean field_ab;
    static volatile int field_R;
    private rd field_X;
    private int field_U;
    private int field_V;
    private int field_Z;
    private rj field_Y;
    static String field_W;
    private int field_S;
    static String field_T;
    static int[] field_P;

    boolean a(int param0, int param1, char param2, rj param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (((wl) this).field_Q != null) {
            if (param1 != 98) {
              if (-100 != param1) {
                return false;
              } else {
                boolean discarded$12 = ((wl) this).field_Q.a(param0 ^ -2147453991, param3);
                return false;
              }
            } else {
              boolean discarded$13 = ((wl) this).field_Q.a(-2147483648, param3);
              if (-100 != param1) {
                return false;
              } else {
                boolean discarded$14 = ((wl) this).field_Q.a(param0 ^ -2147453991, param3);
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

    final void i(int param0) {
        if (!(((wl) this).field_X == null)) {
            if (!(((wl) this).field_X == cj.field_b)) {
                ((wl) this).a(12 + ((wl) this).field_Y.field_p, (byte) -68, 12 + (((wl) this).field_Z - -((wl) this).field_Y.field_t));
                this.c(9, ((wl) this).field_Y);
            }
            ((wl) this).field_X = null;
            ((wl) this).field_Q.field_A = 256;
        }
        super.i(param0);
    }

    final static void l(int param0) {
        o.field_g = null;
        pd.field_g = null;
        qh.field_g = false;
        if (param0 != -12128) {
          field_ab = false;
          bb.field_k = null;
          fb.field_e = null;
          return;
        } else {
          bb.field_k = null;
          fb.field_e = null;
          return;
        }
    }

    final void j(int param0) {
        if (((wl) this).field_X == hj.field_d) {
          return;
        } else {
          ((wl) this).field_U = 0;
          ((wl) this).field_X = cj.field_b;
          if (param0 != -21) {
            return;
          } else {
            this.c(-94, ((wl) this).field_Y);
            ((wl) this).field_Q.field_A = 0;
            ((wl) this).field_Y = null;
            return;
          }
        }
    }

    final static void a(int param0, int param1, String param2) {
        int var3 = 0;
        Object var4 = null;
        ie.field_r = false;
        ck.field_db = false;
        if (param1 == -8440) {
          L0: {
            if (ei.field_G == null) {
              break L0;
            } else {
              if (!ei.field_G.field_G) {
                break L0;
              } else {
                L1: {
                  var3 = 1;
                  if (8 == param0) {
                    L2: {
                      if (!gk.field_a) {
                        param2 = dd.field_f;
                        break L2;
                      } else {
                        param2 = ce.field_g;
                        break L2;
                      }
                    }
                    param0 = 2;
                    af.field_r.b(va.field_a, 15);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L3: {
                  if (-11 != (param0 ^ -1)) {
                    break L3;
                  } else {
                    var3 = 0;
                    pi.a(false);
                    break L3;
                  }
                }
                L4: {
                  if (var3 != 0) {
                    L5: {
                      if (!ie.field_r) {
                        break L5;
                      } else {
                        param2 = h.a(oa.field_F, 0, new String[1]);
                        break L5;
                      }
                    }
                    L6: {
                      if (!ak.field_a) {
                        break L6;
                      } else {
                        param2 = sj.field_E;
                        break L6;
                      }
                    }
                    ei.field_G.a(param2, param0, param1 + 8517);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if ((param0 ^ -1) == -257) {
                  break L0;
                } else {
                  if (param0 == 10) {
                    break L0;
                  } else {
                    if (!gk.field_a) {
                      af.field_r.e((byte) 41);
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          var4 = null;
          wl.a(-111, -58, (String) null);
          if (ei.field_G != null) {
            if (ei.field_G.field_G) {
              L7: {
                var3 = 1;
                if (8 == param0) {
                  L8: {
                    if (!gk.field_a) {
                      param2 = dd.field_f;
                      break L8;
                    } else {
                      param2 = ce.field_g;
                      break L8;
                    }
                  }
                  param0 = 2;
                  af.field_r.b(va.field_a, 15);
                  break L7;
                } else {
                  break L7;
                }
              }
              L9: {
                if (-11 != (param0 ^ -1)) {
                  break L9;
                } else {
                  var3 = 0;
                  pi.a(false);
                  break L9;
                }
              }
              L10: {
                if (var3 != 0) {
                  L11: {
                    if (!ie.field_r) {
                      break L11;
                    } else {
                      param2 = h.a(oa.field_F, 0, new String[1]);
                      break L11;
                    }
                  }
                  L12: {
                    if (!ak.field_a) {
                      break L12;
                    } else {
                      param2 = sj.field_E;
                      break L12;
                    }
                  }
                  ei.field_G.a(param2, param0, param1 + 8517);
                  break L10;
                } else {
                  break L10;
                }
              }
              L13: {
                if ((param0 ^ -1) == -257) {
                  break L13;
                } else {
                  if (param0 == 10) {
                    break L13;
                  } else {
                    if (!gk.field_a) {
                      af.field_r.e((byte) 41);
                      break L13;
                    } else {
                      return;
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    boolean d(boolean param0) {
        int var3 = 0;
        var3 = stellarshard.field_B;
        if (!param0) {
          ((wl) this).i(-92);
          if (((wl) this).field_X != null) {
            if (hj.field_d == ((wl) this).field_X) {
              ((wl) this).field_U = ((wl) this).field_U + 1;
              if (((wl) this).field_V == ((wl) this).field_U + 1) {
                ((wl) this).field_X = fj.field_i;
                ((wl) this).a(((wl) this).field_S, 12 - -((wl) this).field_Y.field_p, (byte) -97, ((wl) this).field_Z + 12 + ((wl) this).field_Y.field_t);
                ((wl) this).field_Q.field_A = 0;
                ((wl) this).field_U = 0;
                return super.d(true);
              } else {
                ((wl) this).field_Q.field_A = -((((wl) this).field_U << -1645066808) / ((wl) this).field_V) + 256;
                return super.d(true);
              }
            } else {
              if (cj.field_b == ((wl) this).field_X) {
                ((wl) this).field_U = ((wl) this).field_U + 1;
                if (((wl) this).field_bb == ((wl) this).field_U + 1) {
                  ((wl) this).field_Q.field_A = 256;
                  ((wl) this).field_X = null;
                  return super.d(true);
                } else {
                  ((wl) this).field_Q.field_A = (((wl) this).field_U << 1225620520) / ((wl) this).field_bb;
                  return super.d(true);
                }
              } else {
                return super.d(true);
              }
            }
          } else {
            return super.d(true);
          }
        } else {
          if (((wl) this).field_X != null) {
            if (hj.field_d == ((wl) this).field_X) {
              ((wl) this).field_U = ((wl) this).field_U + 1;
              if (((wl) this).field_V == ((wl) this).field_U + 1) {
                ((wl) this).field_X = fj.field_i;
                ((wl) this).a(((wl) this).field_S, 12 - -((wl) this).field_Y.field_p, (byte) -97, ((wl) this).field_Z + 12 + ((wl) this).field_Y.field_t);
                ((wl) this).field_Q.field_A = 0;
                ((wl) this).field_U = 0;
                return super.d(true);
              } else {
                ((wl) this).field_Q.field_A = -((((wl) this).field_U << -1645066808) / ((wl) this).field_V) + 256;
                return super.d(true);
              }
            } else {
              if (cj.field_b == ((wl) this).field_X) {
                ((wl) this).field_U = ((wl) this).field_U + 1;
                if (((wl) this).field_bb == ((wl) this).field_U + 1) {
                  ((wl) this).field_Q.field_A = 256;
                  ((wl) this).field_X = null;
                  return super.d(true);
                } else {
                  ((wl) this).field_Q.field_A = (((wl) this).field_U << 1225620520) / ((wl) this).field_bb;
                  return super.d(true);
                }
              } else {
                return super.d(true);
              }
            }
          } else {
            return super.d(true);
          }
        }
    }

    public static void k(int param0) {
        int var1 = -94 / ((-26 - param0) / 49);
        field_W = null;
        field_T = null;
        field_P = null;
    }

    void b(rj param0, int param1) {
        Object var4 = null;
        ((wl) this).field_Y = param0;
        if (fj.field_i == ((wl) this).field_X) {
          ((wl) this).a(((wl) this).field_S, ((wl) this).field_Y.field_p + 12, (byte) -97, ((wl) this).field_Z + (12 - -((wl) this).field_Y.field_t));
          ((wl) this).field_U = 0;
          if (param1 != 23143) {
            var4 = null;
            ((wl) this).b((rj) null, 17);
            return;
          } else {
            return;
          }
        } else {
          if (hj.field_d != ((wl) this).field_X) {
            ((wl) this).field_U = 0;
            ((wl) this).field_X = hj.field_d;
            if (param1 == 23143) {
              return;
            } else {
              var4 = null;
              ((wl) this).b((rj) null, 17);
              return;
            }
          } else {
            if (param1 == 23143) {
              return;
            } else {
              var4 = null;
              ((wl) this).b((rj) null, 17);
              return;
            }
          }
        }
    }

    wl(ei param0, rj param1, int param2, int param3, int param4) {
        super(param0, param1.field_p + 12, 12 + param2 + param1.field_t);
        ((wl) this).field_S = param4;
        ((wl) this).field_bb = param3;
        ((wl) this).field_V = param3;
        ((wl) this).field_Z = param2;
        this.c(16, param1);
    }

    final boolean h(int param0) {
        ((wl) this).i(3642);
        if (param0 < 98) {
            ((wl) this).field_Q = null;
            return super.h(106);
        }
        return super.h(106);
    }

    private final void c(int param0, rj param1) {
        int var3 = 0;
        var3 = -55 % ((param0 - -47) / 47);
        if (((wl) this).field_Q == null) {
          if (param1 == null) {
            ((wl) this).field_Q = new oa();
            ((wl) this).b(4, (rj) (Object) ((wl) this).field_Q);
            ((wl) this).field_Y = null;
            return;
          } else {
            param1.b(param1.field_p, 6, 6 + ((wl) this).field_Z, param1.field_t, 23987);
            ((wl) this).field_Q = new oa(param1);
            ((wl) this).b(4, (rj) (Object) ((wl) this).field_Q);
            ((wl) this).field_Y = null;
            return;
          }
        } else {
          ((wl) this).field_Q.c(20);
          if (param1 == null) {
            ((wl) this).field_Q = new oa();
            ((wl) this).b(4, (rj) (Object) ((wl) this).field_Q);
            ((wl) this).field_Y = null;
            return;
          } else {
            param1.b(param1.field_p, 6, 6 + ((wl) this).field_Z, param1.field_t, 23987);
            ((wl) this).field_Q = new oa(param1);
            ((wl) this).b(4, (rj) (Object) ((wl) this).field_Q);
            ((wl) this).field_Y = null;
            return;
          }
        }
    }

    final static pf a(int param0, int param1) {
        if (param0 != 1) {
            return null;
        }
        return na.a(1, 255, param1, false, false, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = 0;
        field_ab = false;
        field_W = "Please wait...";
        field_T = "Log in / Create account";
        field_P = new int[8192];
    }
}
