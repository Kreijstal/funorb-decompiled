/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class md {
    static int field_b;
    static int field_f;
    static Random field_d;
    ne field_c;
    static String field_a;
    private ne field_e;

    static int b(int param0, int param1) {
        return param0 ^ param1;
    }

    final ne b(byte param0) {
        ne var2 = null;
        var2 = ((md) this).field_c.field_e;
        if (param0 == -124) {
          if (var2 == ((md) this).field_c) {
            return null;
          } else {
            var2.a(false);
            return var2;
          }
        } else {
          ne discarded$7 = ((md) this).a(80);
          if (var2 == ((md) this).field_c) {
            return null;
          } else {
            var2.a(false);
            return var2;
          }
        }
    }

    final void b(int param0) {
        ne var2 = null;
        int var3 = 0;
        Object var4 = null;
        var3 = DungeonAssault.field_K;
        L0: while (true) {
          var2 = ((md) this).field_c.field_e;
          if (var2 != ((md) this).field_c) {
            var2.a(false);
            continue L0;
          } else {
            if (param0 != -4) {
              var4 = null;
              ((md) this).b((ne) null, false);
              ((md) this).field_e = null;
              return;
            } else {
              ((md) this).field_e = null;
              return;
            }
          }
        }
    }

    final ne g(int param0) {
        ne var2 = null;
        Object var3 = null;
        var2 = ((md) this).field_e;
        if (((md) this).field_c == var2) {
          ((md) this).field_e = null;
          return null;
        } else {
          ((md) this).field_e = var2.field_a;
          if (param0 != 20) {
            var3 = null;
            ((md) this).a((ne) null, false);
            return var2;
          } else {
            return var2;
          }
        }
    }

    final static void a(int param0, int param1) {
        mo.field_e = param1;
        if (nk.field_Jb.field_b >= 0) {
          if (!nl.a(nk.field_Jb.field_b, (byte) -124)) {
            nk.field_Jb.field_b = 1;
            if (param0 == 20631) {
              return;
            } else {
              field_b = 78;
              return;
            }
          } else {
            if (param0 == 20631) {
              return;
            } else {
              field_b = 78;
              return;
            }
          }
        } else {
          if (param0 == 20631) {
            return;
          } else {
            field_b = 78;
            return;
          }
        }
    }

    final boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -55) {
          L0: {
            ((md) this).field_c = null;
            if (((md) this).field_c.field_e != ((md) this).field_c) {
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
            if (((md) this).field_c.field_e != ((md) this).field_c) {
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

    final static void a(float param0, float param1, float param2, float param3, float param4, int param5, float param6) {
        L0: {
          if (null == bf.field_h) {
            bf.field_h = new ge((qb) (Object) wa.field_j);
            hm.field_n.a((qb) (Object) bf.field_h);
            break L0;
          } else {
            break L0;
          }
        }
        bf.field_h.f(param4);
        bf.field_h.e(param1);
        bf.field_h.d(param6);
        bf.field_h.a(param3);
        bf.field_h.b(param0);
        bf.field_h.c(param2);
        if (param5 == 0) {
          return;
        } else {
          field_b = 91;
          return;
        }
    }

    final static boolean f(int param0) {
        if (param0 != 20) {
            return false;
        }
        return null == cm.field_R ? rj.field_o : true;
    }

    public static void h(int param0) {
        field_a = null;
        field_d = null;
        if (param0 == -4) {
            return;
        }
        md.h(69);
    }

    final void a(ne param0, boolean param1) {
        L0: {
          if (param0.field_a != null) {
            param0.a(param1);
            break L0;
          } else {
            break L0;
          }
        }
        param0.field_a = ((md) this).field_c.field_a;
        param0.field_e = ((md) this).field_c;
        param0.field_a.field_e = param0;
        param0.field_e.field_a = param0;
        if (!param1) {
          return;
        } else {
          field_d = null;
          return;
        }
    }

    final ne a(int param0) {
        ne var2 = null;
        if (param0 != 4) {
            Object var3 = null;
            md.a(-3, (cn) null);
            var2 = ((md) this).field_e;
            if (!(var2 != ((md) this).field_c)) {
                ((md) this).field_e = null;
                return null;
            }
            ((md) this).field_e = var2.field_e;
            return var2;
        }
        var2 = ((md) this).field_e;
        if (!(var2 != ((md) this).field_c)) {
            ((md) this).field_e = null;
            return null;
        }
        ((md) this).field_e = var2.field_e;
        return var2;
    }

    final ne e(int param0) {
        ne var2 = null;
        if (param0 == -24172) {
          var2 = ((md) this).field_c.field_e;
          if (var2 == ((md) this).field_c) {
            ((md) this).field_e = null;
            return null;
          } else {
            ((md) this).field_e = var2.field_e;
            return var2;
          }
        } else {
          field_d = null;
          var2 = ((md) this).field_c.field_e;
          if (var2 == ((md) this).field_c) {
            ((md) this).field_e = null;
            return null;
          } else {
            ((md) this).field_e = var2.field_e;
            return var2;
          }
        }
    }

    final ne c(int param0) {
        ne var2 = null;
        var2 = ((md) this).field_c.field_a;
        if (param0 == 0) {
          if (((md) this).field_c == var2) {
            return null;
          } else {
            var2.a(false);
            return var2;
          }
        } else {
          ((md) this).field_c = null;
          if (((md) this).field_c == var2) {
            return null;
          } else {
            var2.a(false);
            return var2;
          }
        }
    }

    final static void a(int param0, cn param1) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = DungeonAssault.field_K;
        if (-1 != (3 & (param1.field_A | (param1.field_w | (param1.field_v | param1.field_y))) ^ -1)) {
          var2 = (3 & param1.field_w) + param1.field_y;
          var2 = -(3 & var2) + 4 + var2;
          var3 = (param1.field_A & 3) + param1.field_v;
          var3 = var3 - ((3 & var3) + -4);
          var4 = new int[var3 * var2];
          var5 = 0;
          var6 = (3 & param1.field_w) - -(var2 * (param1.field_A & 3));
          var7 = 0;
          if (param0 > 42) {
            L0: while (true) {
              if (param1.field_v <= var7) {
                param1.field_y = var2;
                param1.field_w = param1.field_w & -4;
                param1.field_v = var3;
                param1.field_A = param1.field_A & -4;
                param1.field_B = var4;
                return;
              } else {
                var8 = 0;
                L1: while (true) {
                  if (param1.field_y <= var8) {
                    var6 = var6 + (var2 + -param1.field_y);
                    var7++;
                    continue L0;
                  } else {
                    var6++;
                    var5++;
                    var4[var6] = param1.field_B[var5];
                    var8++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            field_f = -7;
            L2: while (true) {
              if (param1.field_v <= var7) {
                param1.field_y = var2;
                param1.field_w = param1.field_w & -4;
                param1.field_v = var3;
                param1.field_A = param1.field_A & -4;
                param1.field_B = var4;
                return;
              } else {
                var8 = 0;
                L3: while (true) {
                  if (param1.field_y <= var8) {
                    var6 = var6 + (var2 + -param1.field_y);
                    var7++;
                    continue L2;
                  } else {
                    var6++;
                    var5++;
                    var4[var6] = param1.field_B[var5];
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void b(ne param0, boolean param1) {
        L0: {
          if (null != param0.field_a) {
            param0.a(false);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1) {
          field_a = null;
          param0.field_a = ((md) this).field_c;
          param0.field_e = ((md) this).field_c.field_e;
          param0.field_a.field_e = param0;
          param0.field_e.field_a = param0;
          return;
        } else {
          param0.field_a = ((md) this).field_c;
          param0.field_e = ((md) this).field_c.field_e;
          param0.field_a.field_e = param0;
          param0.field_e.field_a = param0;
          return;
        }
    }

    final ne d(int param0) {
        ne var2 = null;
        if (param0 != -14205) {
            field_a = null;
            var2 = ((md) this).field_c.field_a;
            if (!(var2 != ((md) this).field_c)) {
                ((md) this).field_e = null;
                return null;
            }
            ((md) this).field_e = var2.field_a;
            return var2;
        }
        var2 = ((md) this).field_c.field_a;
        if (!(var2 != ((md) this).field_c)) {
            ((md) this).field_e = null;
            return null;
        }
        ((md) this).field_e = var2.field_a;
        return var2;
    }

    public md() {
        ((md) this).field_c = new ne();
        ((md) this).field_c.field_e = ((md) this).field_c;
        ((md) this).field_c.field_a = ((md) this).field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 20;
        field_a = "FULL ACCESS";
        field_d = new Random(6L);
    }
}
