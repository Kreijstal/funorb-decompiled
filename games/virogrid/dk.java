/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class dk {
    static on field_e;
    static e field_j;
    static oj field_v;
    static String field_o;
    static String field_a;
    static lc field_s;
    static java.security.SecureRandom field_m;
    qk field_i;
    static String field_r;
    qk field_c;
    static rm[] field_q;
    static String field_u;
    qk field_p;
    qk field_h;
    jc field_t;
    int field_k;
    long field_f;
    volatile int field_b;
    jc field_n;
    volatile int field_l;
    byte field_g;
    ub field_d;

    final static int b(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            jc var2 = null;
            int stackIn_8_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_23_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_32_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_22_0 = 0;
            int stackOut_31_0 = 0;
            int stackOut_7_0 = 0;
            if (ji.field_e.field_l < 4) {
              try {
                L0: {
                  if (param0 == 108) {
                    L1: {
                      if (ij.field_q != 0) {
                        break L1;
                      } else {
                        vm.field_b = ii.field_a.a(ok.field_G, 27402, co.field_g);
                        ij.field_q = ij.field_q + 1;
                        break L1;
                      }
                    }
                    L2: {
                      if (ij.field_q != 1) {
                        break L2;
                      } else {
                        if (2 != vm.field_b.field_a) {
                          if (vm.field_b.field_a != 1) {
                            break L2;
                          } else {
                            ij.field_q = ij.field_q + 1;
                            break L2;
                          }
                        } else {
                          stackOut_13_0 = bk.a(-1, 1);
                          stackIn_14_0 = stackOut_13_0;
                          return stackIn_14_0;
                        }
                      }
                    }
                    L3: {
                      if (2 != ij.field_q) {
                        break L3;
                      } else {
                        ng.field_N = new el((java.net.Socket) vm.field_b.field_f, ii.field_a);
                        var2 = new jc(13);
                        int discarded$1 = 12;
                        hj.a(fd.field_C, var2, rj.field_l, ed.field_b);
                        var2.a(15, param0 ^ -26);
                        var2.a(dl.field_c, (byte) -42);
                        ng.field_N.a(var2.field_g, param0 ^ 108, 0, 13);
                        ij.field_q = ij.field_q + 1;
                        sg.field_l = hc.a(-9986) + 30000L;
                        break L3;
                      }
                    }
                    L4: {
                      if (ij.field_q != 3) {
                        break L4;
                      } else {
                        if (0 < ng.field_N.f(31479)) {
                          var1_int = ng.field_N.a(param0 + -109);
                          if (0 != var1_int) {
                            stackOut_26_0 = bk.a(var1_int, 1);
                            stackIn_27_0 = stackOut_26_0;
                            return stackIn_27_0;
                          } else {
                            ij.field_q = ij.field_q + 1;
                            break L4;
                          }
                        } else {
                          if (~hc.a(-9986) >= ~sg.field_l) {
                            break L4;
                          } else {
                            stackOut_22_0 = bk.a(-2, 1);
                            stackIn_23_0 = stackOut_22_0;
                            return stackIn_23_0;
                          }
                        }
                      }
                    }
                    if (ij.field_q == 4) {
                      ji.field_e.a(param0 ^ -17, fb.field_i, (Object) (Object) ng.field_N);
                      ng.field_N = null;
                      vm.field_b = null;
                      ij.field_q = 0;
                      stackOut_31_0 = 0;
                      stackIn_32_0 = stackOut_31_0;
                      break L0;
                    } else {
                      return -1;
                    }
                  } else {
                    stackOut_7_0 = -123;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return bk.a(-3, param0 ^ 109);
              }
              return stackIn_32_0;
            } else {
              if (ji.field_e.field_b != -1) {
                if (ji.field_e.field_b == -2) {
                  return 4;
                } else {
                  return 1;
                }
              } else {
                return 3;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final ub a(byte param0, int param1, boolean param2, int param3, int param4) {
        long var6 = (long)param1 + ((long)param4 << 32);
        ub var8 = new ub();
        var8.field_j = var6;
        var8.field_A = param0;
        var8.field_w = param2 ? true : false;
        if (param3 != -1150070304) {
            return null;
        }
        if (param2) {
            if (((dk) this).a((byte) -85) >= 20) {
                throw new RuntimeException();
            }
            ((dk) this).field_i.a((wb) (Object) var8, (byte) 96);
        } else {
            if (((dk) this).e(114) < 20) {
                ((dk) this).field_p.a((wb) (Object) var8, (byte) 112);
                return var8;
            }
            throw new RuntimeException();
        }
        return var8;
    }

    abstract void a(int param0, boolean param1, Object param2);

    final int a(byte param0) {
        int var2 = -80 % ((52 - param0) / 62);
        return ((dk) this).field_i.b(0) + ((dk) this).field_c.b(0);
    }

    abstract void d(byte param0);

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 20) {
          L0: {
            ((dk) this).b(3);
            if (((dk) this).e(108) < 20) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((dk) this).e(108) < 20) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean c(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 113) {
          L0: {
            ((dk) this).field_k = -48;
            if (((dk) this).a((byte) -11) < 20) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((dk) this).a((byte) -11) < 20) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a() {
        field_r = null;
        field_q = null;
        field_m = null;
        field_j = null;
        int var1 = 0;
        field_o = null;
        field_e = null;
        field_s = null;
        field_v = null;
        field_u = null;
        field_a = null;
    }

    abstract boolean d(int param0);

    final int e(int param0) {
        if (param0 <= 79) {
          int discarded$2 = ((dk) this).e(-30);
          return ((dk) this).field_p.b(0) - -((dk) this).field_h.b(0);
        } else {
          return ((dk) this).field_p.b(0) - -((dk) this).field_h.b(0);
        }
    }

    final static void f(int param0) {
        if (param0 == 389) {
          tm.field_l.a((byte) 76);
          if (null == md.field_i) {
            md.field_i = new vc(tm.field_l, vd.field_X);
            tm.field_l.a(param0 + -389, (fi) (Object) md.field_i);
            return;
          } else {
            tm.field_l.a(param0 + -389, (fi) (Object) md.field_i);
            return;
          }
        } else {
          int discarded$5 = dk.b((byte) 100);
          tm.field_l.a((byte) 76);
          if (null != md.field_i) {
            tm.field_l.a(param0 + -389, (fi) (Object) md.field_i);
            return;
          } else {
            md.field_i = new vc(tm.field_l, vd.field_X);
            tm.field_l.a(param0 + -389, (fi) (Object) md.field_i);
            return;
          }
        }
    }

    abstract void b(int param0);

    dk() {
        ((dk) this).field_i = new qk();
        ((dk) this).field_c = new qk();
        ((dk) this).field_p = new qk();
        ((dk) this).field_h = new qk();
        ((dk) this).field_t = new jc(6);
        ((dk) this).field_l = 0;
        ((dk) this).field_b = 0;
        ((dk) this).field_g = (byte) 0;
        ((dk) this).field_n = new jc(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new on();
        field_a = "Month";
        field_o = "You can spectate this game";
        field_r = "Please select an option in the '<%0>' row.";
        field_s = new lc(12, 0, 1, 0);
        field_u = "to keep fullscreen or";
    }
}
