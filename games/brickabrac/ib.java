/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ib extends oc implements sd {
    static int[] field_D;
    static jp field_E;
    static String field_F;
    static String field_C;
    vl field_G;

    final boolean a(oc param0, byte param1) {
        kh var5 = null;
        oc var6 = null;
        int var7 = BrickABrac.field_J ? 1 : 0;
        if (((ib) this).field_G.a(false)) {
            return false;
        }
        kh var3 = new kh(((ib) this).field_G);
        if (param1 > -115) {
            return false;
        }
        oc var4 = (oc) (Object) var3.a(240);
        while (var4 != null) {
            if (var4.f(-128)) {
                var5 = new kh(((ib) this).field_G);
                nm discarded$0 = var5.a(122, (nm) (Object) var4);
                var6 = (oc) (Object) var5.b(7);
                while (var6 != null) {
                    if (var6.a(true, param0)) {
                        return true;
                    }
                    var6 = (oc) (Object) var5.b(7);
                }
            }
            var4 = (oc) (Object) var3.b(7);
        }
        return false;
    }

    final boolean b(oc param0, byte param1) {
        kh var6 = null;
        oc var7 = null;
        int var8 = BrickABrac.field_J ? 1 : 0;
        int var3 = -60 % ((param1 - 51) / 34);
        if (((ib) this).field_G.a(false)) {
            return false;
        }
        kh var4 = new kh(((ib) this).field_G);
        oc var5 = (oc) (Object) var4.a(true);
        while (var5 != null) {
            if (!(!var5.f(-57))) {
                var6 = new kh(((ib) this).field_G);
                nm discarded$0 = var6.b(16802, (nm) (Object) var5);
                var7 = (oc) (Object) var6.d(-24706);
                while (var7 != null) {
                    if (!(!var7.a(true, param0))) {
                        return true;
                    }
                    var7 = (oc) (Object) var6.d(-24706);
                }
            }
            var5 = (oc) (Object) var4.d(-24706);
        }
        return false;
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var7 = BrickABrac.field_J ? 1 : 0;
        if (param2 == 0) {
            if (((ib) this).field_l != null) {
                ((ib) this).field_l.a(true, param3 + -20607, param1, (oc) this, param0);
            }
        }
        kh var5 = new kh(((ib) this).field_G);
        if (param3 != -11) {
            ((ib) this).field_G = null;
        }
        oc var6 = (oc) (Object) var5.a(true);
        while (var6 != null) {
            var6.a(((ib) this).field_w + param0, ((ib) this).field_o + param1, param2, (byte) -11);
            var6 = (oc) (Object) var5.d(param3 + -24695);
        }
    }

    final void a(oc param0, boolean param1) {
        ((ib) this).field_G.a((nm) (Object) param0, (byte) 3);
        if (!param1) {
            field_F = null;
        }
    }

    private final void g(int param0) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        kh var2 = new kh(((ib) this).field_G);
        int var3 = -77 % ((param0 - 69) / 46);
        oc var4 = (oc) (Object) var2.a(240);
        while (var4 != null) {
            var4.e(1);
            var4 = (oc) (Object) var2.b(7);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, oc param5, int param6) {
        int var10 = BrickABrac.field_J ? 1 : 0;
        kh var8 = new kh(((ib) this).field_G);
        oc var9 = (oc) (Object) var8.a(240);
        while (var9 != null) {
            // ifeq L91
            if (var9.f(-65)) {
                if (var9.a(param0, param1, param2, -126, param4, param5, param6)) {
                    return true;
                }
            }
            var9 = (oc) (Object) var8.b(7);
        }
        if (param3 >= -125) {
            ((ib) this).field_G = null;
            return false;
        }
        return false;
    }

    public static void f(byte param0) {
        field_E = null;
        field_F = null;
        int var1 = -92 / ((param0 - -2) / 38);
        field_D = null;
        field_C = null;
    }

    final boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var10 = BrickABrac.field_J ? 1 : 0;
        kh var8 = new kh(((ib) this).field_G);
        if (param6 != 0) {
            return true;
        }
        oc var9 = (oc) (Object) var8.a(240);
        while (var9 != null) {
            // ifeq L100
            if (var9.a(param0, param1, param2 + ((ib) this).field_o, ((ib) this).field_w + param3, param4, param5, 0)) {
                return true;
            }
            var9 = (oc) (Object) var8.b(7);
        }
        return false;
    }

    final void a(int param0, int param1, int param2, oc param3, int param4, int param5) {
        int var9 = BrickABrac.field_J ? 1 : 0;
        kh var7 = new kh(((ib) this).field_G);
        oc var8 = (oc) (Object) var7.a(240);
        if (param4 != 19223) {
            Object var10 = null;
            StringBuilder discarded$0 = ((ib) this).a(-102, (Hashtable) null, 23, (StringBuilder) null);
        }
        while (var8 != null) {
            // ifeq L116
            var8.a(param0, param1, param2 + ((ib) this).field_w, param3, 19223, param5 + ((ib) this).field_o);
            var8 = (oc) (Object) var7.b(7);
        }
    }

    final static boolean a(int[] param0, int param1) {
        int var2 = 0;
        int var3 = BrickABrac.field_J ? 1 : 0;
        for (var2 = 0; var2 < 8; var2++) {
            if (param0[var2] != 0) {
                return true;
            }
        }
        if (param1 != -1) {
            ib.a(89, false, 71, 122, false, 9, -88);
        }
        return false;
    }

    private final void a(StringBuilder param0, int param1, byte param2, Hashtable param3) {
        int var7 = 0;
        int var8 = BrickABrac.field_J ? 1 : 0;
        kh var5 = new kh(((ib) this).field_G);
        oc var6 = (oc) (Object) var5.a(240);
        while (var6 != null) {
            StringBuilder discarded$0 = param0.append(10);
            for (var7 = 0; param1 >= var7; var7++) {
                StringBuilder discarded$1 = param0.append(32);
            }
            StringBuilder discarded$2 = var6.a(param1 + 1, param3, 24, param0);
            var6 = (oc) (Object) var5.b(7);
        }
        if (param2 <= 52) {
            Object var9 = null;
            boolean discarded$3 = ((ib) this).a((oc) null, (byte) -19);
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        jp var9 = null;
        L0: {
          var7 = 0;
          param3 = (1414 + param3) % 1414;
          var8 = 0;
          if (284 >= param3) {
            var8 = 5;
            var7 = 11 - -param3;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          // wide iinc 3 -284
          if (-1 <= (param3 ^ -1)) {
            break L1;
          } else {
            if ((param3 ^ -1) < -6) {
              break L1;
            } else {
              var9_int = 2048 * param3 / 5;
              var7 = 295 - -(3 * sa.a(var9_int, -4097) >> 1756993296);
              var8 = -(3 * BrickABrac.c(2048, var9_int) >> 1229388688) + 8;
              break L1;
            }
          }
        }
        if (!param1) {
          L2: {
            param3 -= 5;
            if ((param3 ^ -1) >= -1) {
              break L2;
            } else {
              if ((param3 ^ -1) >= -414) {
                var7 = 298;
                var8 = param3 + 8;
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            // wide iinc 3 -413
            if ((param3 ^ -1) >= -1) {
              break L3;
            } else {
              if ((param3 ^ -1) < -6) {
                break L3;
              } else {
                var9_int = param3 * 2048 / 5;
                var7 = 295 - -(3 * BrickABrac.c(2048, var9_int) >> -733614416);
                var8 = (sa.a(var9_int, -4097) * 3 >> -414234160) + 421;
                break L3;
              }
            }
          }
          L4: {
            param3 -= 5;
            if (0 >= param3) {
              break L4;
            } else {
              if (param3 < -285) {
                break L4;
              } else {
                var7 = 295 + -param3;
                var8 = 424;
                break L4;
              }
            }
          }
          L5: {
            // wide iinc 3 -284
            if (0 >= param3) {
              break L5;
            } else {
              if (-6 < param3) {
                break L5;
              } else {
                var9_int = param3 * 2048 / 5;
                var7 = -(3 * sa.a(var9_int, -4097) >> 809700368) + 11;
                var8 = 421 + (BrickABrac.c(2048, var9_int) * 3 >> 1505538672);
                break L5;
              }
            }
          }
          L6: {
            param3 -= 5;
            if (param3 >= -1) {
              break L6;
            } else {
              if (-414 >= param3) {
                var7 = 8;
                var8 = 421 - param3;
                break L6;
              } else {
                break L6;
              }
            }
          }
          L7: {
            // wide iinc 3 -413
            if (-1 > (param3 ^ -1)) {
              var9_int = 2048 * param3 / 5;
              var7 = 11 - (3 * BrickABrac.c(2048, var9_int) >> -1294203408);
              var8 = 8 + -(sa.a(var9_int, -4097) * 3 >> -1874338384);
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            var9 = tf.field_g[param0];
            param6 = param6 + (-(var9.field_x / 2) + var7);
            param5 = param5 + (-(var9.field_z / 2) + var8);
            if (param4) {
              nb.a(-111, param5, param6, lk.field_n[param0]);
              rn.field_a[param0].f(param6, param5, 256);
              break L8;
            } else {
              break L8;
            }
          }
          var9.c(param6, param5);
          return;
        } else {
          return;
        }
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        if (!(!((ib) this).a(param3, param2 + 1595637968, param0, param1))) {
            ((ib) this).a(param1, param0, 0, param3);
            this.a(param3, param0, (byte) 104, param1);
        }
        if (param2 != 24) {
            ((ib) this).field_G = null;
        }
        return param3;
    }

    final boolean f(int param0) {
        if (param0 > -49) {
            this.g(4);
        }
        return ((ib) this).g((byte) -3) != null ? true : false;
    }

    ib(int param0, int param1, int param2, int param3, ub param4) {
        super(param0, param1, param2, param3, param4, (uh) null);
        ((ib) this).field_G = new vl();
    }

    oc g(byte param0) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        kh var2 = new kh(((ib) this).field_G);
        oc var3 = (oc) (Object) var2.a(240);
        while (var3 != null) {
            if (!(!var3.f(-83))) {
                return var3;
            }
            var3 = (oc) (Object) var2.b(7);
        }
        if (param0 == -3) {
            return null;
        }
        Object var5 = null;
        ((ib) this).a((oc) null, (byte) -16, -70, 95);
        return null;
    }

    String d(int param0) {
        kh var2 = null;
        oc var3 = null;
        String var4 = null;
        int var5 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        var2 = new kh(((ib) this).field_G);
        if (param0 >= 6) {
          var3 = (oc) (Object) var2.a(240);
          L0: while (true) {
            if (var3 != null) {
              var4 = var3.d(37);
              if (var4 != null) {
                return var4;
              } else {
                var3 = (oc) (Object) var2.b(7);
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    boolean a(int param0, byte param1, oc param2, char param3) {
        int var7 = BrickABrac.field_J ? 1 : 0;
        kh var10 = new kh(((ib) this).field_G);
        oc var9 = (oc) (Object) var10.a(param1 + 130);
        while (var9 != null) {
            // ifeq L93
            if (var9.f(-118)) {
                if (!(!var9.a(param0, (byte) 110, param2, param3))) {
                    return true;
                }
            }
            var9 = (oc) (Object) var10.b(param1 ^ 105);
        }
        if (param1 != 110) {
            Object var8 = null;
            StringBuilder discarded$0 = ((ib) this).a(87, (Hashtable) null, -4, (StringBuilder) null);
        }
        int var6 = param0;
        if (var6 != 80) {
            return false;
        }
        return !pe.field_l[81] ? ((ib) this).a(param2, (byte) -128) : ((ib) this).b(param2, (byte) -118);
    }

    final void b(boolean param0) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (param0) {
            ib.f((byte) 29);
        }
        kh var2 = new kh(((ib) this).field_G);
        oc var3 = (oc) (Object) var2.a(240);
        while (var3 != null) {
            var3.b(false);
            var3 = (oc) (Object) var2.b(7);
        }
    }

    void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.g(116);
    }

    final int e(byte param0) {
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        int var3 = -70 % ((-17 - param0) / 43);
        int var2 = 0;
        kh var4 = new kh(((ib) this).field_G);
        oc var5 = (oc) (Object) var4.a(240);
        while (var5 != null) {
            var6 = var5.e((byte) -86);
            if (var6 > var2) {
                var2 = var6;
            }
            var5 = (oc) (Object) var4.b(7);
        }
        return var2;
    }

    final boolean a(boolean param0, oc param1) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        kh var3 = new kh(((ib) this).field_G);
        if (!param0) {
            return true;
        }
        oc var4 = (oc) (Object) var3.a(240);
        while (var4 != null) {
            if (var4.a(param0, param1)) {
                return true;
            }
            var4 = (oc) (Object) var3.b(7);
        }
        return false;
    }

    void a(oc param0, byte param1, int param2, int param3) {
        int var7 = BrickABrac.field_J ? 1 : 0;
        super.a(param0, param1, param2, param3);
        kh var5 = new kh(((ib) this).field_G);
        oc var6 = (oc) (Object) var5.a(240);
        while (var6 != null) {
            // ifeq L91
            var6.a(param0, (byte) 0, ((ib) this).field_o + param2, ((ib) this).field_w + param3);
            var6 = (oc) (Object) var5.b(7);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "You have 1 unread message!";
        field_F = "Loading graphics";
    }
}
