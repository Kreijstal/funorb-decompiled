/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bd extends pj {
    boolean field_Q;
    static int field_M;
    private int field_J;
    static int field_L;
    private k field_R;
    static boolean field_N;
    static bb field_T;
    static java.awt.Font field_S;
    static char[] field_K;
    static nh field_P;
    static boolean[] field_O;

    private final int i(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 != 0) {
          L0: {
            boolean discarded$1 = ((bd) this).k(-92);
            if (!((bd) this).field_Q) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              if (this != (Object) (Object) ((bd) this).field_R.k(127)) {
                stackOut_10_0 = 0;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_9_0 = 256;
                stackIn_12_0 = stackOut_9_0;
                break L0;
              }
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (!((bd) this).field_Q) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L1;
            } else {
              if (this != (Object) (Object) ((bd) this).field_R.k(127)) {
                stackOut_4_0 = 0;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 256;
                stackIn_6_0 = stackOut_3_0;
                break L1;
              }
            }
          }
          return stackIn_6_0;
        }
    }

    bd(k param0, int param1, int param2) {
        super(-param1 + di.field_a >> 1, qe.field_l + -param2 >> 1, param1, param2, (cg) null);
        try {
            ((bd) this).field_Q = false;
            ((bd) this).field_R = param0;
            ((bd) this).field_J = 0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "bd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    boolean j(int param0) {
        ((bd) this).field_J = this.i(param0);
        if (((bd) this).field_J == 0) {
          if (((bd) this).field_Q) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final vg g(int param0) {
        vg var2 = null;
        if (param0 == -22426) {
          var2 = super.g(param0);
          if (var2 != null) {
            return var2;
          } else {
            return (vg) this;
          }
        } else {
          ((bd) this).field_J = 100;
          var2 = super.g(param0);
          if (var2 != null) {
            return var2;
          } else {
            return (vg) this;
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (((bd) this).field_J != 0) {
          if (((bd) this).field_J < 256) {
            if (uk.field_f != null) {
              if (((bd) this).field_w <= uk.field_f.field_y) {
                if (uk.field_f.field_w >= ((bd) this).field_k) {
                  aj.a(uk.field_f, (byte) 79);
                  wj.c();
                  ((bd) this).c(0, param2 ^ -68, 0);
                  super.a(-param0 + -((bd) this).field_o, param1, param2, -((bd) this).field_m + -param3);
                  cl.d((byte) -106);
                  uk.field_f.e(param0 + ((bd) this).field_o, param3 - -((bd) this).field_m, ((bd) this).field_J);
                  return;
                } else {
                  uk.field_f = new nh(((bd) this).field_w, ((bd) this).field_k);
                  aj.a(uk.field_f, (byte) 79);
                  wj.c();
                  ((bd) this).c(0, param2 ^ -68, 0);
                  super.a(-param0 + -((bd) this).field_o, param1, param2, -((bd) this).field_m + -param3);
                  cl.d((byte) -106);
                  uk.field_f.e(param0 + ((bd) this).field_o, param3 - -((bd) this).field_m, ((bd) this).field_J);
                  return;
                }
              } else {
                uk.field_f = new nh(((bd) this).field_w, ((bd) this).field_k);
                aj.a(uk.field_f, (byte) 79);
                wj.c();
                ((bd) this).c(0, param2 ^ -68, 0);
                super.a(-param0 + -((bd) this).field_o, param1, param2, -((bd) this).field_m + -param3);
                cl.d((byte) -106);
                uk.field_f.e(param0 + ((bd) this).field_o, param3 - -((bd) this).field_m, ((bd) this).field_J);
                return;
              }
            } else {
              uk.field_f = new nh(((bd) this).field_w, ((bd) this).field_k);
              aj.a(uk.field_f, (byte) 79);
              wj.c();
              ((bd) this).c(0, param2 ^ -68, 0);
              super.a(-param0 + -((bd) this).field_o, param1, param2, -((bd) this).field_m + -param3);
              cl.d((byte) -106);
              uk.field_f.e(param0 + ((bd) this).field_o, param3 - -((bd) this).field_m, ((bd) this).field_J);
              return;
            }
          } else {
            if (0 != param1) {
              return;
            } else {
              ((bd) this).c(((bd) this).field_m + param3, 119, param0 + ((bd) this).field_o);
              super.a(param0, param1, (byte) -21, param3);
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a() {
        field_T = null;
        field_S = null;
        field_P = null;
        field_K = null;
        field_O = null;
        int var1 = -114;
    }

    final void b(int param0, int param1, int param2) {
        if (param1 != 1688990433) {
          field_K = null;
          ((bd) this).a(qe.field_l + -param2 >> 1, param2, -param0 + di.field_a >> 1, 16535, param0);
          return;
        } else {
          ((bd) this).a(qe.field_l + -param2 >> 1, param2, -param0 + di.field_a >> 1, 16535, param0);
          return;
        }
    }

    boolean k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var2 = this.i(0);
          var3 = -((bd) this).field_J + var2;
          if (0 < var3) {
            ((bd) this).field_J = ((bd) this).field_J + (-1 + (var3 - -8)) / 8;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 2968) {
          L1: {
            if (0 > var3) {
              ((bd) this).field_J = ((bd) this).field_J + (var3 + -15) / 16;
              break L1;
            } else {
              break L1;
            }
          }
          if (((bd) this).field_J == 0) {
            if (var2 != 0) {
              return false;
            } else {
              L2: {
                if (((bd) this).field_Q) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                } else {
                  stackOut_12_0 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  break L2;
                }
              }
              return stackIn_14_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    abstract void c(int param0, int param1, int param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        field_T = new bb();
    }
}
