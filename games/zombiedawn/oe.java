/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oe {
    int field_g;
    int[] field_e;
    static String field_d;
    static String field_f;
    static af field_a;
    int field_b;
    static fn field_c;

    final int a(int param0) {
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = -58 / ((10 - param0) / 54);
            if (((oe) this).field_e == null) {
              break L1;
            } else {
              if (((oe) this).field_e.length != 0) {
                stackOut_4_0 = ((oe) this).field_e[((oe) this).field_e.length + -1];
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0;
    }

    final static void a(byte param0) {
        int var1 = ma.d((byte) 78);
        int var3 = 109 % ((param0 - 9) / 62);
        int var2 = bj.a(true);
        cl.field_b.a(var1 - -(pg.field_o << 1), el.field_k + -el.field_d, eb.field_c + -pg.field_o, (byte) -128, (el.field_d << 1) + var2);
        ll.a(-67);
    }

    public static void c(int param0) {
        field_f = null;
        field_a = null;
        field_c = null;
        field_d = null;
    }

    final static void a(int param0, int param1, mg param2) {
        am var3 = dp.field_e;
        if (param1 != -19004) {
            return;
        }
        try {
            var3.j(11, param0);
            var3.i(param2.field_h, 70);
            var3.i(param2.field_i, param1 + 19119);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "oe.D(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        try {
            ij.field_L = new u[15];
            ij.field_L[0] = new u(fb.field_w, 0, 0);
            var1_int = pb.a(so.field_a, 50, 1) - -30;
            var2 = 1;
            for (var3 = param0; 15 > var3; var3++) {
                ij.field_L[var3] = new u(cn.field_a, var2, var1_int);
                var1_int = var1_int + (pb.a(so.field_a, 100, param0) + 75);
                if (!(var3 != 7)) {
                    var2 = 2;
                    var1_int = pb.a(so.field_a, 10, param0);
                }
            }
            ip.c(param0 ^ -63);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "oe.C(" + param0 + 41);
        }
    }

    final static void a(int param0, aa param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        aa var3 = null;
        int var4 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            if (null == param1.field_k) {
              return;
            } else {
              L1: {
                L2: {
                  if (-1 != param1.field_i) {
                    break L2;
                  } else {
                    if (-1 == param1.field_b) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (var2_int >= tb.field_E) {
                    break L1;
                  } else {
                    L4: {
                      var3 = cc.field_m[var2_int];
                      if (var3.field_j != 2) {
                        break L4;
                      } else {
                        if (var3.field_i != param1.field_i) {
                          break L4;
                        } else {
                          if (param1.field_b == var3.field_b) {
                            return;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (null != param1.field_e) {
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (param0 == 0) {
                  break L6;
                } else {
                  field_c = null;
                  break L6;
                }
              }
              jk.a((byte) -126, param1);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("oe.B(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ZombieDawn.field_J;
          if (param1 == 0) {
            break L0;
          } else {
            oe.a((byte) -32);
            break L0;
          }
        }
        L1: {
          if (((oe) this).field_e == null) {
            break L1;
          } else {
            if (((oe) this).field_e.length == 0) {
              break L1;
            } else {
              var3 = 1;
              L2: while (true) {
                if (((oe) this).field_e.length <= var3) {
                  return ((oe) this).field_e.length - 1;
                } else {
                  if (((oe) this).field_e[var3] + ((oe) this).field_e[-1 + var3] >> 1 <= param0) {
                    var3++;
                    continue L2;
                  } else {
                    return -1 + var3;
                  }
                }
              }
            }
          }
        }
        return 0;
    }

    oe(int param0, int param1, int param2) {
        ((oe) this).field_b = param0;
        ((oe) this).field_e = new int[param2 - -1];
        ((oe) this).field_g = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_f = "Next";
        field_a = new af();
    }
}
