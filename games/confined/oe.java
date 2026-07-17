/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oe extends ga {
    private sh field_L;
    static String field_O;
    static ej field_U;
    private int field_V;
    static int field_W;
    static String field_T;
    boolean field_H;
    static String field_X;
    static String field_S;
    static e field_R;
    static boolean field_P;
    static ve field_Q;

    abstract void b(int param0, byte param1, int param2);

    boolean j(int param0) {
        ((oe) this).field_V = this.b(false);
        if (param0 <= -35) {
          if (((oe) this).field_V == 0) {
            if (((oe) this).field_H) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((oe) this).field_V = -126;
          if (((oe) this).field_V == 0) {
            if (((oe) this).field_H) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void k(int param0) {
        field_X = null;
        field_Q = null;
        field_S = null;
        if (param0 != -1) {
          oe.k(76);
          field_U = null;
          field_O = null;
          field_T = null;
          field_R = null;
          return;
        } else {
          field_U = null;
          field_O = null;
          field_T = null;
          field_R = null;
          return;
        }
    }

    private final int b(boolean param0) {
        return !((oe) this).field_H ? 0 : (Object) (Object) ((oe) this).field_L.h(0) == this ? 256 : 0;
    }

    final void a(int param0, int param1, int param2) {
        if (param0 > -30) {
          field_P = false;
          ((oe) this).a(-127, param2, qk.field_c + -param1 >> 1, param1, tg.field_L - param2 >> 1);
          return;
        } else {
          ((oe) this).a(-127, param2, qk.field_c + -param1 >> 1, param1, tg.field_L - param2 >> 1);
          return;
        }
    }

    oe(sh param0, int param1, int param2) {
        super(tg.field_L + -param1 >> 1, qk.field_c - param2 >> 1, param1, param2, (fe) null);
        try {
            ((oe) this).field_V = 0;
            ((oe) this).field_H = false;
            ((oe) this).field_L = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "oe.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    boolean l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        if (param0 == -6) {
          var2 = this.b(false);
          var3 = var2 + -((oe) this).field_V;
          if (var3 > 0) {
            L0: {
              ((oe) this).field_V = ((oe) this).field_V + (8 + (var3 + -1)) / 8;
              if (0 > var3) {
                ((oe) this).field_V = ((oe) this).field_V + (var3 + -15) / 16;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              L2: {
                if (((oe) this).field_V != 0) {
                  break L2;
                } else {
                  if (0 != var2) {
                    break L2;
                  } else {
                    if (((oe) this).field_H) {
                      break L2;
                    } else {
                      stackOut_39_0 = 1;
                      stackIn_41_0 = stackOut_39_0;
                      break L1;
                    }
                  }
                }
              }
              stackOut_40_0 = 0;
              stackIn_41_0 = stackOut_40_0;
              break L1;
            }
            return stackIn_41_0 != 0;
          } else {
            L3: {
              if (0 > var3) {
                ((oe) this).field_V = ((oe) this).field_V + (var3 + -15) / 16;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              L5: {
                if (((oe) this).field_V != 0) {
                  break L5;
                } else {
                  if (0 != var2) {
                    break L5;
                  } else {
                    if (((oe) this).field_H) {
                      break L5;
                    } else {
                      stackOut_30_0 = 1;
                      stackIn_32_0 = stackOut_30_0;
                      break L4;
                    }
                  }
                }
              }
              stackOut_31_0 = 0;
              stackIn_32_0 = stackOut_31_0;
              break L4;
            }
            return stackIn_32_0 != 0;
          }
        } else {
          field_Q = null;
          var2 = this.b(false);
          var3 = var2 + -((oe) this).field_V;
          if (var3 <= 0) {
            L6: {
              if (0 > var3) {
                ((oe) this).field_V = ((oe) this).field_V + (var3 + -15) / 16;
                break L6;
              } else {
                break L6;
              }
            }
            if (((oe) this).field_V == 0) {
              if (0 != var2) {
                return false;
              } else {
                L7: {
                  if (((oe) this).field_H) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L7;
                  } else {
                    stackOut_18_0 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    break L7;
                  }
                }
                return stackIn_20_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            L8: {
              ((oe) this).field_V = ((oe) this).field_V + (8 + (var3 + -1)) / 8;
              if (0 > var3) {
                ((oe) this).field_V = ((oe) this).field_V + (var3 + -15) / 16;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              L10: {
                if (((oe) this).field_V != 0) {
                  break L10;
                } else {
                  if (0 != var2) {
                    break L10;
                  } else {
                    if (((oe) this).field_H) {
                      break L10;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      break L9;
                    }
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L9;
            }
            return stackIn_10_0 != 0;
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (((oe) this).field_V != 0) {
          if (256 > ((oe) this).field_V) {
            if (param2 >= 36) {
              if (ga.field_K != null) {
                if (((oe) this).field_F <= ga.field_K.field_u) {
                  if (ga.field_K.field_w < ((oe) this).field_z) {
                    ga.field_K = new nf(((oe) this).field_F, ((oe) this).field_z);
                    vm.a(ga.field_K, -8409);
                    fn.d();
                    ((oe) this).b(0, (byte) -90, 0);
                    super.a(-((oe) this).field_m + -param0, param1, (byte) 120, -param3 - ((oe) this).field_q);
                    ib.b(false);
                    ga.field_K.a(param3 - -((oe) this).field_q, ((oe) this).field_m + param0, ((oe) this).field_V);
                    return;
                  } else {
                    vm.a(ga.field_K, -8409);
                    fn.d();
                    ((oe) this).b(0, (byte) -90, 0);
                    super.a(-((oe) this).field_m + -param0, param1, (byte) 120, -param3 - ((oe) this).field_q);
                    ib.b(false);
                    ga.field_K.a(param3 - -((oe) this).field_q, ((oe) this).field_m + param0, ((oe) this).field_V);
                    return;
                  }
                } else {
                  ga.field_K = new nf(((oe) this).field_F, ((oe) this).field_z);
                  vm.a(ga.field_K, -8409);
                  fn.d();
                  ((oe) this).b(0, (byte) -90, 0);
                  super.a(-((oe) this).field_m + -param0, param1, (byte) 120, -param3 - ((oe) this).field_q);
                  ib.b(false);
                  ga.field_K.a(param3 - -((oe) this).field_q, ((oe) this).field_m + param0, ((oe) this).field_V);
                  return;
                }
              } else {
                ga.field_K = new nf(((oe) this).field_F, ((oe) this).field_z);
                vm.a(ga.field_K, -8409);
                fn.d();
                ((oe) this).b(0, (byte) -90, 0);
                super.a(-((oe) this).field_m + -param0, param1, (byte) 120, -param3 - ((oe) this).field_q);
                ib.b(false);
                ga.field_K.a(param3 - -((oe) this).field_q, ((oe) this).field_m + param0, ((oe) this).field_V);
                return;
              }
            } else {
              field_O = null;
              if (ga.field_K != null) {
                if (((oe) this).field_F <= ga.field_K.field_u) {
                  if (ga.field_K.field_w < ((oe) this).field_z) {
                    ga.field_K = new nf(((oe) this).field_F, ((oe) this).field_z);
                    vm.a(ga.field_K, -8409);
                    fn.d();
                    ((oe) this).b(0, (byte) -90, 0);
                    super.a(-((oe) this).field_m + -param0, param1, (byte) 120, -param3 - ((oe) this).field_q);
                    ib.b(false);
                    ga.field_K.a(param3 - -((oe) this).field_q, ((oe) this).field_m + param0, ((oe) this).field_V);
                    return;
                  } else {
                    vm.a(ga.field_K, -8409);
                    fn.d();
                    ((oe) this).b(0, (byte) -90, 0);
                    super.a(-((oe) this).field_m + -param0, param1, (byte) 120, -param3 - ((oe) this).field_q);
                    ib.b(false);
                    ga.field_K.a(param3 - -((oe) this).field_q, ((oe) this).field_m + param0, ((oe) this).field_V);
                    return;
                  }
                } else {
                  ga.field_K = new nf(((oe) this).field_F, ((oe) this).field_z);
                  vm.a(ga.field_K, -8409);
                  fn.d();
                  ((oe) this).b(0, (byte) -90, 0);
                  super.a(-((oe) this).field_m + -param0, param1, (byte) 120, -param3 - ((oe) this).field_q);
                  ib.b(false);
                  ga.field_K.a(param3 - -((oe) this).field_q, ((oe) this).field_m + param0, ((oe) this).field_V);
                  return;
                }
              } else {
                ga.field_K = new nf(((oe) this).field_F, ((oe) this).field_z);
                vm.a(ga.field_K, -8409);
                fn.d();
                ((oe) this).b(0, (byte) -90, 0);
                super.a(-((oe) this).field_m + -param0, param1, (byte) 120, -param3 - ((oe) this).field_q);
                ib.b(false);
                ga.field_K.a(param3 - -((oe) this).field_q, ((oe) this).field_m + param0, ((oe) this).field_V);
                return;
              }
            }
          } else {
            if (0 != param1) {
              return;
            } else {
              ((oe) this).b(((oe) this).field_q + param3, (byte) -126, ((oe) this).field_m + param0);
              super.a(param0, param1, (byte) 102, param3);
              return;
            }
          }
        } else {
          return;
        }
    }

    final fj f(int param0) {
        if (param0 != -1) {
            return null;
        }
        fj var2 = super.f(param0);
        if (var2 != null) {
            return var2;
        }
        return (fj) this;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_T = "Passwords can only contain letters and numbers";
        field_W = 0;
        field_U = new ej();
        field_S = "Owing to your splendid heroism,#the human race is set to become#the most powerful force in the galaxy.";
        field_P = false;
        field_X = "Next power-up attractor: Level <%0>";
        field_R = new e(15, 0, 1, 0);
    }
}
