/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class b extends kj {
    private si field_L;
    static int[] field_N;
    static int field_J;
    static int field_M;
    boolean field_K;
    static String field_R;
    private int field_P;

    final void a(int param0, int param1, boolean param2, int param3) {
        if (((b) this).field_P != -1) {
          if (-257 > ((b) this).field_P) {
            L0: {
              if (!param2) {
                break L0;
              } else {
                ((b) this).b(-50, 9, 119);
                break L0;
              }
            }
            if (null != nb.field_a) {
              if (((b) this).field_p <= nb.field_a.field_u) {
                if (nb.field_a.field_x < ((b) this).field_l) {
                  nb.field_a = new ka(((b) this).field_p, ((b) this).field_l);
                  ad.a(-15, nb.field_a);
                  qg.b();
                  ((b) this).c(103, 0, 0);
                  super.a(-param0 + -((b) this).field_i, -((b) this).field_m + -param1, param2, param3);
                  int discarded$4 = -9;
                  ie.b();
                  nb.field_a.d(param1 - -((b) this).field_m, ((b) this).field_i + param0, ((b) this).field_P);
                  return;
                } else {
                  ad.a(-15, nb.field_a);
                  qg.b();
                  ((b) this).c(103, 0, 0);
                  super.a(-param0 + -((b) this).field_i, -((b) this).field_m + -param1, param2, param3);
                  int discarded$5 = -9;
                  ie.b();
                  nb.field_a.d(param1 - -((b) this).field_m, ((b) this).field_i + param0, ((b) this).field_P);
                  return;
                }
              } else {
                nb.field_a = new ka(((b) this).field_p, ((b) this).field_l);
                ad.a(-15, nb.field_a);
                qg.b();
                ((b) this).c(103, 0, 0);
                super.a(-param0 + -((b) this).field_i, -((b) this).field_m + -param1, param2, param3);
                int discarded$6 = -9;
                ie.b();
                nb.field_a.d(param1 - -((b) this).field_m, ((b) this).field_i + param0, ((b) this).field_P);
                return;
              }
            } else {
              nb.field_a = new ka(((b) this).field_p, ((b) this).field_l);
              ad.a(-15, nb.field_a);
              qg.b();
              ((b) this).c(103, 0, 0);
              super.a(-param0 + -((b) this).field_i, -((b) this).field_m + -param1, param2, param3);
              int discarded$7 = -9;
              ie.b();
              nb.field_a.d(param1 - -((b) this).field_m, ((b) this).field_i + param0, ((b) this).field_P);
              return;
            }
          } else {
            if (param3 != 0) {
              return;
            } else {
              ((b) this).c(103, ((b) this).field_i + param0, param1 + ((b) this).field_m);
              super.a(param0, param1, false, param3);
              return;
            }
          }
        } else {
          return;
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param0 != 0) {
          return;
        } else {
          ((b) this).a((byte) 113, -param2 + TorChallenge.field_G >> 1, param1, param2, -param1 + md.field_h >> 1);
          return;
        }
    }

    private final int i() {
        return !((b) this).field_K ? 0 : this == (Object) (Object) ((b) this).field_L.f((byte) 123) ? 256 : 0;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = gl.field_l[param5][param2][1][0];
        int var8 = gl.field_l[param5][param2][1][1];
        qg.a(ae.field_y);
        qg.a(var7, param6, var8, param4);
        we.field_e[param1][param2].a(var7, param6);
        qg.b(ae.field_y);
    }

    abstract void c(int param0, int param1, int param2);

    public static void a() {
        field_N = null;
        field_R = null;
    }

    final ee d(byte param0) {
        ee var2 = super.d(param0);
        if (var2 != null) {
            return var2;
        }
        return (ee) this;
    }

    boolean h(int param0) {
        if (param0 >= 83) {
          int discarded$6 = 0;
          ((b) this).field_P = this.i();
          if (((b) this).field_P == 0) {
            if (((b) this).field_K) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$7 = ((b) this).j(-66);
          int discarded$8 = 0;
          ((b) this).field_P = this.i();
          if (((b) this).field_P == 0) {
            if (((b) this).field_K) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    boolean j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int discarded$1 = 0;
        var2 = this.i();
        var3 = var2 - ((b) this).field_P;
        if (var3 <= 0) {
          if (var3 >= 0) {
            if (param0 != 1) {
              return false;
            } else {
              L0: {
                L1: {
                  if (0 != ((b) this).field_P) {
                    break L1;
                  } else {
                    if (var2 != 0) {
                      break L1;
                    } else {
                      if (((b) this).field_K) {
                        break L1;
                      } else {
                        stackOut_36_0 = 1;
                        stackIn_38_0 = stackOut_36_0;
                        break L0;
                      }
                    }
                  }
                }
                stackOut_37_0 = 0;
                stackIn_38_0 = stackOut_37_0;
                break L0;
              }
              return stackIn_38_0 != 0;
            }
          } else {
            ((b) this).field_P = ((b) this).field_P + (-16 + var3 - -1) / 16;
            if (param0 != 1) {
              return false;
            } else {
              L2: {
                L3: {
                  if (0 != ((b) this).field_P) {
                    break L3;
                  } else {
                    if (var2 != 0) {
                      break L3;
                    } else {
                      if (((b) this).field_K) {
                        break L3;
                      } else {
                        stackOut_27_0 = 1;
                        stackIn_29_0 = stackOut_27_0;
                        break L2;
                      }
                    }
                  }
                }
                stackOut_28_0 = 0;
                stackIn_29_0 = stackOut_28_0;
                break L2;
              }
              return stackIn_29_0 != 0;
            }
          }
        } else {
          ((b) this).field_P = ((b) this).field_P + (-1 + (var3 - -8)) / 8;
          if (var3 < 0) {
            ((b) this).field_P = ((b) this).field_P + (-16 + var3 - -1) / 16;
            if (param0 != 1) {
              return false;
            } else {
              L4: {
                L5: {
                  if (0 != ((b) this).field_P) {
                    break L5;
                  } else {
                    if (var2 != 0) {
                      break L5;
                    } else {
                      if (((b) this).field_K) {
                        break L5;
                      } else {
                        stackOut_17_0 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L4;
              }
              return stackIn_19_0 != 0;
            }
          } else {
            if (param0 == 1) {
              if (0 == ((b) this).field_P) {
                if (var2 != 0) {
                  return false;
                } else {
                  L6: {
                    if (((b) this).field_K) {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      break L6;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      break L6;
                    }
                  }
                  return stackIn_10_0 != 0;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        }
    }

    b(si param0, int param1, int param2) {
        super(TorChallenge.field_G - param1 >> 1, md.field_h - param2 >> 1, param1, param2, (j) null);
        try {
            ((b) this).field_P = 0;
            ((b) this).field_L = param0;
            ((b) this).field_K = false;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "b.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new int[]{0, 0, 0, 0, 0, 1};
        field_M = 0;
        field_R = "Back";
    }
}
