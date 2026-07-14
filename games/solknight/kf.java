/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kf extends ki {
    private int field_I;
    static String field_D;
    static rb[] field_G;
    private i field_E;
    static String field_F;
    boolean field_J;
    static String field_H;

    kf(i param0, int param1, int param2) {
        super(-param1 + og.field_f >> 1600490529, -param2 + wc.field_e >> -753274303, param1, param2, (j) null);
        ((kf) this).field_J = false;
        ((kf) this).field_I = 0;
        ((kf) this).field_E = param0;
    }

    boolean e(byte param0) {
        if (param0 == 124) {
          ((kf) this).field_I = this.a((byte) 11);
          if (-1 == (((kf) this).field_I ^ -1)) {
            if (((kf) this).field_J) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_H = null;
          ((kf) this).field_I = this.a((byte) 11);
          if (-1 == (((kf) this).field_I ^ -1)) {
            if (((kf) this).field_J) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        fl.b((byte) 91);
        if (param0 != 97) {
          field_G = null;
          mi.d(param1, param2, param3, param4);
          return;
        } else {
          mi.d(param1, param2, param3, param4);
          return;
        }
    }

    final void b(int param0, int param1, int param2) {
        ((kf) this).b(param2, param0, og.field_f - param0 >> -2038584927, 0, -param2 + wc.field_e >> -984831359);
        if (param1 != -2038584927) {
            Object var5 = null;
            kf.a(-72, (String[]) null);
        }
    }

    abstract void a(int param0, byte param1, int param2);

    boolean h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        if (param0 == 1784) {
          L0: {
            var2 = this.a((byte) -104);
            var3 = -((kf) this).field_I + var2;
            if (var3 > 0) {
              ((kf) this).field_I = ((kf) this).field_I + (8 + var3 - 1) / 8;
              break L0;
            } else {
              break L0;
            }
          }
          if (0 > var3) {
            L1: {
              L2: {
                ((kf) this).field_I = ((kf) this).field_I + (-16 + var3 + 1) / 16;
                if (((kf) this).field_I != 0) {
                  break L2;
                } else {
                  if (var2 != 0) {
                    break L2;
                  } else {
                    if (((kf) this).field_J) {
                      break L2;
                    } else {
                      stackOut_36_0 = 1;
                      stackIn_38_0 = stackOut_36_0;
                      break L1;
                    }
                  }
                }
              }
              stackOut_37_0 = 0;
              stackIn_38_0 = stackOut_37_0;
              break L1;
            }
            return stackIn_38_0 != 0;
          } else {
            L3: {
              L4: {
                if (((kf) this).field_I != 0) {
                  break L4;
                } else {
                  if (var2 != 0) {
                    break L4;
                  } else {
                    if (((kf) this).field_J) {
                      break L4;
                    } else {
                      stackOut_30_0 = 1;
                      stackIn_32_0 = stackOut_30_0;
                      break L3;
                    }
                  }
                }
              }
              stackOut_31_0 = 0;
              stackIn_32_0 = stackOut_31_0;
              break L3;
            }
            return stackIn_32_0 != 0;
          }
        } else {
          L5: {
            kf.a((byte) -47, 114, 13, 107, 118);
            var2 = this.a((byte) -104);
            var3 = -((kf) this).field_I + var2;
            if (var3 > 0) {
              ((kf) this).field_I = ((kf) this).field_I + (8 + var3 - 1) / 8;
              break L5;
            } else {
              break L5;
            }
          }
          if (0 > var3) {
            ((kf) this).field_I = ((kf) this).field_I + (-16 + var3 + 1) / 16;
            if (((kf) this).field_I == 0) {
              if (var2 != 0) {
                return false;
              } else {
                L6: {
                  if (((kf) this).field_J) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L6;
                  } else {
                    stackOut_18_0 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    break L6;
                  }
                }
                return stackIn_20_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            if (((kf) this).field_I == 0) {
              if (var2 != 0) {
                return false;
              } else {
                L7: {
                  if (((kf) this).field_J) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L7;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L7;
                  }
                }
                return stackIn_11_0 != 0;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static void a(int param0, String[] param1) {
        if (param0 == 1) {
          L0: {
            if (k.field_d != null) {
              k.field_d.field_G.a(20870, param1);
              break L0;
            } else {
              break L0;
            }
          }
          if (null != sj.field_d) {
            sj.field_d.field_F.a(20870, param1);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final int a(byte param0) {
        int var2 = 98 / ((-50 - param0) / 54);
        return !((kf) this).field_J ? 0 : (Object) (Object) ((kf) this).field_E.d((byte) 109) == this ? 256 : 0;
    }

    final rc d(byte param0) {
        rc var2 = super.d(param0);
        if (var2 != null) {
            return var2;
        }
        return (rc) this;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (-1 != (((kf) this).field_I ^ -1)) {
          if (256 <= ((kf) this).field_I) {
            if (param1 != 0) {
              return;
            } else {
              ((kf) this).a(((kf) this).field_m + param2, (byte) 55, ((kf) this).field_j + param0);
              super.a(param0, param1, param2, param3 ^ 0);
              return;
            }
          } else {
            if (jj.field_x != null) {
              if (jj.field_x.field_p >= ((kf) this).field_t) {
                if (jj.field_x.field_t >= ((kf) this).field_x) {
                  cl.a(-100, jj.field_x);
                  mi.a();
                  ((kf) this).a(param3, (byte) 94, 0);
                  super.a(-((kf) this).field_j + -param0, param1, -((kf) this).field_m + -param2, 0);
                  mf.e(4096);
                  jj.field_x.c(((kf) this).field_m + param2, ((kf) this).field_j + param0, ((kf) this).field_I);
                  return;
                } else {
                  jj.field_x = new o(((kf) this).field_t, ((kf) this).field_x);
                  cl.a(-100, jj.field_x);
                  mi.a();
                  ((kf) this).a(param3, (byte) 94, 0);
                  super.a(-((kf) this).field_j + -param0, param1, -((kf) this).field_m + -param2, 0);
                  mf.e(4096);
                  jj.field_x.c(((kf) this).field_m + param2, ((kf) this).field_j + param0, ((kf) this).field_I);
                  return;
                }
              } else {
                jj.field_x = new o(((kf) this).field_t, ((kf) this).field_x);
                cl.a(-100, jj.field_x);
                mi.a();
                ((kf) this).a(param3, (byte) 94, 0);
                super.a(-((kf) this).field_j + -param0, param1, -((kf) this).field_m + -param2, 0);
                mf.e(4096);
                jj.field_x.c(((kf) this).field_m + param2, ((kf) this).field_j + param0, ((kf) this).field_I);
                return;
              }
            } else {
              jj.field_x = new o(((kf) this).field_t, ((kf) this).field_x);
              cl.a(-100, jj.field_x);
              mi.a();
              ((kf) this).a(param3, (byte) 94, 0);
              super.a(-((kf) this).field_j + -param0, param1, -((kf) this).field_m + -param2, 0);
              mf.e(4096);
              jj.field_x.c(((kf) this).field_m + param2, ((kf) this).field_j + param0, ((kf) this).field_I);
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void i(int param0) {
        field_G = null;
        field_F = null;
        if (param0 < 16) {
          field_D = null;
          field_H = null;
          field_D = null;
          return;
        } else {
          field_H = null;
          field_D = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Username: ";
        field_F = "Return to game";
    }
}
