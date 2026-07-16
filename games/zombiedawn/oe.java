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
        cl.field_b.a(var1 - -(pg.field_o << -2139913087), el.field_k + -el.field_d, eb.field_c + -pg.field_o, (byte) -128, (el.field_d << -1650012031) + var2);
        ll.a(-67);
    }

    public static void c(int param0) {
        field_f = null;
        field_a = null;
        if (param0 != 15) {
            return;
        }
        field_c = null;
        field_d = null;
    }

    final static void a(int param0, int param1, mg param2) {
        am var3 = dp.field_e;
        if (param1 != -19004) {
            return;
        }
        var3.j(11, param0);
        var3.i(param2.field_h, 70);
        var3.i(param2.field_i, param1 + 19119);
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        ij.field_L = new u[15];
        ij.field_L[0] = new u(fb.field_w, 0, 0);
        var1 = pb.a(so.field_a, 50, 1) - -30;
        var2 = 1;
        var3 = param0;
        L0: while (true) {
          if (15 <= var3) {
            ip.c(param0 ^ -63);
            return;
          } else {
            ij.field_L[var3] = new u(cn.field_a, var2, var1);
            var1 = var1 + (pb.a(so.field_a, 100, param0 ^ 0) + 75);
            if ((var3 ^ -1) == -8) {
              var2 = 2;
              var1 = pb.a(so.field_a, 10, param0 + 0);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, aa param1) {
        int var2 = 0;
        aa var3 = null;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        if (null == param1.field_k) {
          return;
        } else {
          L0: {
            L1: {
              if (-1 != param1.field_i) {
                break L1;
              } else {
                if (-1 == param1.field_b) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if (var2 >= tb.field_E) {
                break L0;
              } else {
                var3 = cc.field_m[var2];
                if ((var3.field_j ^ -1) == -3) {
                  if (var3.field_i == param1.field_i) {
                    if (param1.field_b == var3.field_b) {
                      return;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
          L3: {
            if (null != param1.field_e) {
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (param0 == 0) {
              break L4;
            } else {
              field_c = null;
              break L4;
            }
          }
          jk.a((byte) -126, param1);
          return;
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
                  if (((oe) this).field_e[var3] + ((oe) this).field_e[-1 + var3] >> -747544255 <= param0) {
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
