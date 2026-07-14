/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class tu extends eha {
    static String field_e;
    static volatile int field_h;
    private vna field_c;
    static float field_g;
    ff field_f;
    static String field_d;

    private final boolean a(la param0, byte param1, int param2) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 > 47) {
            break L0;
          } else {
            ((tu) this).field_c = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((tu) this).field_f.b(param2, 0)) {
              break L2;
            } else {
              if (!kq.a(-44, param0.q((byte) -82)).field_d) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    void a(int param0, hca param1, int param2, la param3, int param4, int param5) {
        jha var10 = null;
        int var8 = 0;
        if (ab.field_n != null) {
            ab.field_n.field_y.a((byte) -105, 77, -1);
        }
        qw var7 = new qw(param1, param3, param2, param5, param4);
        ((tu) this).field_c.b((byte) -88, (vg) (Object) var7);
        String var9 = null;
        if (1 == param5) {
            var8 = -5;
            var9 = gl.a((byte) 107, rf.field_a, new String[1]);
        } else {
            var8 = -10;
            var9 = gl.a((byte) 104, uta.field_n, new String[1]);
        }
        param1.h(param0 + -15, var8);
        ((tu) this).field_f.field_D.a(param5, param1.A(0), param0 + -19);
        if (((tu) this).field_f.j(-1878)) {
            if (!((tu) this).field_f.d(-67)) {
                if (!(var9 == null)) {
                    var10 = ab.a(-48, var9);
                    iqa.field_c.a(3, param0 + -15, var10);
                }
            }
        }
        if (param0 != 15) {
            Object var11 = null;
            ((tu) this).a(77, (hca) null, 88, (la) null, -63, 81);
        }
    }

    final void a(int param0, int param1, hca param2, fsa param3) {
        int var5 = 0;
        hr var6 = null;
        hr var7 = null;
        if ((param0 ^ -1) == 0) {
          return;
        } else {
          L0: {
            var5 = param0;
            if (var5 == 0) {
              var6 = param2.f((byte) 121).a(param2.d(3), param2.e(9648), (byte) 100, 3145728 + param2.g((byte) 115));
              var6.a(false, 128, 15, 128, 50);
              var6.a(131072, 0, -107, 0);
              break L0;
            } else {
              if (1 != var5) {
                if (2 == var5) {
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var7 = param2.f((byte) -109).a(param2.d(3), param2.e(9648), (byte) 100, param2.g((byte) 115) + 3145728);
                var7.a(false, 128, 16, 128, 50);
                var7.a(131072, 0, -89, 0);
                break L0;
              }
            }
          }
          L1: {
            if (param1 == 15818) {
              break L1;
            } else {
              field_e = null;
              break L1;
            }
          }
          return;
        }
    }

    public static void c(int param0) {
        if (param0 != -1) {
            field_d = null;
        }
        field_e = null;
        field_d = null;
    }

    final void a(int param0, la param1) {
        if (param0 <= 12) {
            Object var4 = null;
            ((tu) this).a((hca) null, (la) null, false);
        }
        if (null != ab.field_n) {
            ab.field_n.field_y.a((byte) -105, 256, -1);
        }
        if (!(null != ((tu) this).field_f)) {
            return;
        }
        ((tu) this).field_f.a(true, param1);
    }

    final void a(fsa param0, int param1) {
        int var3 = param0.w(17825792);
        if (var3 == -1) {
            return;
        }
        hca var4 = param0.f((byte) -65).u(-90);
        if (param1 != 1) {
            return;
        }
        int var5 = var3;
        if (!(var5 != 0)) {
            ((tu) this).field_f.field_D.d(1, 72, var4.A(0));
        }
    }

    void a(int param0, hca param1, la param2) {
        int var4 = 0;
        fsa[] var5 = null;
        fsa[] var6 = null;
        int var7 = 0;
        fsa var8 = null;
        int var9 = 0;
        Object var10 = null;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          if (((tu) this).field_f.k(-25319)) {
            break L0;
          } else {
            if (param2 == null) {
              break L0;
            } else {
              if (param2.field_u != null) {
                L1: {
                  L2: {
                    var4 = param2.u(-2).A(param0 + 2);
                    if (!param2.j(0)) {
                      break L2;
                    } else {
                      if (!((tu) this).field_f.j(param0 + -1876)) {
                        qb.a(var4, 5);
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  li.b(var4, (byte) 116);
                  break L1;
                }
                ff.d(param0 ^ -2, var4);
                var5 = param2.n(16);
                var6 = var5;
                var7 = 0;
                L3: while (true) {
                  if (var7 >= var6.length) {
                    break L0;
                  } else {
                    L4: {
                      var8 = var6[var7];
                      if (-2 != (var8.E((byte) 3) ^ -1)) {
                        break L4;
                      } else {
                        qw.a((byte) -32, var4);
                        break L4;
                      }
                    }
                    if (2 == var8.E((byte) 3)) {
                      mka.a(13, var4);
                      var7++;
                      continue L3;
                    } else {
                      var7++;
                      continue L3;
                    }
                  }
                }
              } else {
                break L0;
              }
            }
          }
        }
        L5: {
          if (param0 == -2) {
            break L5;
          } else {
            var10 = null;
            ((tu) this).a(84, (hca) null, 71, (la) null, -32, -21);
            break L5;
          }
        }
    }

    final qw b(byte param0) {
        int var2 = -114 / ((59 - param0) / 50);
        if (((tu) this).field_c.d((byte) 14)) {
            return null;
        }
        return (qw) (Object) ((tu) this).field_c.c(73);
    }

    void a(hca param0, la param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        jha var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        jha var12 = null;
        int var13 = 0;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          var4 = kq.a(105, param1.q((byte) -82)).field_h;
          var4 = var4 * 2;
          var5 = param1.p((byte) 83);
          if (!param2) {
            break L0;
          } else {
            ((tu) this).field_f = null;
            break L0;
          }
        }
        L1: {
          var6 = 50;
          var7 = 0;
          if (var4 > var5) {
            var7 = (-var5 + var4) * 5 / 50;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          param0.h(0, param0.F(-7991) + (var7 + var6));
          var8 = param0.A(0);
          ((tu) this).field_f.field_F[var8] = (long)var5;
          ((tu) this).field_f.field_g[var8] = param1.q((byte) -82);
          if (((tu) this).field_f.k(-25319)) {
            break L2;
          } else {
            if (((tu) this).field_f.j(-1878)) {
              break L2;
            } else {
              if (((tu) this).field_f.field_x == null) {
                break L2;
              } else {
                if (this.a(param1, (byte) 74, var8)) {
                  break L2;
                } else {
                  var9 = ll.a(param1.q((byte) -82), 0);
                  if ((var9 ^ -1) > -1) {
                    break L2;
                  } else {
                    ((tu) this).field_f.field_x[var8].set(var9);
                    break L2;
                  }
                }
              }
            }
          }
        }
        L3: {
          if (!((tu) this).field_f.j(-1878)) {
            break L3;
          } else {
            if (!((tu) this).field_f.d(-127)) {
              L4: {
                if (0 != var7) {
                  var9_ref = ab.a(-89, gl.a((byte) 112, wpa.field_J, new String[2]));
                  break L4;
                } else {
                  var9_ref = ab.a(-66, gl.a((byte) 92, gla.field_q, new String[1]));
                  break L4;
                }
              }
              L5: {
                iqa.field_c.a(0, var9_ref);
                var10 = param0.F(-7991);
                if ((var10 ^ -1) < -1) {
                  var12 = ab.a(-96, gl.a((byte) 82, bca.field_c, new String[1]));
                  var9_ref = ab.a(-96, gl.a((byte) 82, bca.field_c, new String[1]));
                  iqa.field_c.a(3, 0, var12);
                  break L5;
                } else {
                  break L5;
                }
              }
              ((tu) this).field_f.field_I[var8] = true;
              break L3;
            } else {
              break L3;
            }
          }
        }
        L6: {
          if (((tu) this).field_f.j(-1878)) {
            break L6;
          } else {
            var13 = 0;
            var9 = var13;
            L7: while (true) {
              if (var13 >= 3) {
                break L6;
              } else {
                ((tu) this).field_f.field_D.b(param0.A(0), 65408, gp.field_i[var13] * param0.a(393216, var13));
                var13++;
                continue L7;
              }
            }
          }
        }
    }

    tu(ff param0) {
        ((tu) this).field_f = param0;
        ((tu) this).field_c = new vna();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<%0> has entered a game.";
        field_d = "White light beams";
        field_h = 0;
    }
}
