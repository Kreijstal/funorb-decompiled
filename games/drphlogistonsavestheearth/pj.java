/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class pj extends vg implements ba {
    static String[] field_A;
    static boolean field_H;
    vd field_I;
    static he[] field_z;
    static aj field_G;
    static int field_E;
    static boolean field_C;
    static he[][] field_B;
    static qb field_D;
    static boolean field_F;

    public static void f(int param0) {
        field_A = null;
        field_B = null;
        field_G = null;
        field_D = null;
        int var1 = -31 % ((48 - param0) / 51);
        field_z = null;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        if (param3 != -10612) {
            Object var6 = null;
            boolean discarded$0 = ((pj) this).a(0, 46, (byte) 23, 114, (vg) null, 80, 117);
        }
        if (((pj) this).a(param1, param2, param0, 43)) {
            ((pj) this).a(param2, (byte) 89, param0, param1);
            this.a(param1, false, param2, param0);
        }
        return param2;
    }

    vg g(int param0) {
        rh var2 = null;
        vg var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var2 = new rh(((pj) this).field_I);
          var3 = (vg) (Object) var2.c(-1);
          if (param0 == -22426) {
            break L0;
          } else {
            var5 = null;
            ((pj) this).a((vg) null, 42, -25, (byte) 121);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (!var3.a(true)) {
              var3 = (vg) (Object) var2.a((byte) -85);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    void a(vg param0, int param1, int param2, byte param3) {
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        super.a(param0, param1, param2, (byte) -128);
        if (param3 >= -127) {
            return;
        }
        rh var5 = new rh(((pj) this).field_I);
        vg var6 = (vg) (Object) var5.c(-1);
        while (var6 != null) {
            // ifeq L98
            var6.a(param0, ((pj) this).field_o + param1, param2 - -((pj) this).field_m, (byte) -128);
            var6 = (vg) (Object) var5.a((byte) -119);
        }
    }

    pj(int param0, int param1, int param2, int param3, cg param4) {
        super(param0, param1, param2, param3, param4, (fd) null);
        ((pj) this).field_I = new vd();
    }

    final static double a(double param0, int param1) {
        if (param1 != 32768) {
            return 0.02654725030847743;
        }
        return oj.field_b[(int)(32768.0 * param0 / 3.141592653589793) & 65535];
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param2 != -21) {
            String discarded$0 = ((pj) this).e(6);
        }
        if (param1 == 0) {
            if (((pj) this).field_l != null) {
                ((pj) this).field_l.a(true, 116, (vg) this, param3, param0);
            }
        }
        rh var5 = new rh(((pj) this).field_I);
        vg var6 = (vg) (Object) var5.a(-80);
        while (var6 != null) {
            var6.a(((pj) this).field_o + param0, param1, (byte) -21, param3 - -((pj) this).field_m);
            var6 = (vg) (Object) var5.b((byte) 87);
        }
    }

    final String e(int param0) {
        rh var2 = null;
        vg var3 = null;
        String var4 = null;
        int var5 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 < -39) {
          var2 = new rh(((pj) this).field_I);
          var3 = (vg) (Object) var2.c(-1);
          L0: while (true) {
            if (var3 != null) {
              var4 = var3.e(-80);
              if (var4 == null) {
                var3 = (vg) (Object) var2.a((byte) -121);
                continue L0;
              } else {
                return var4;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, vg param3, int param4, boolean param5) {
        int var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        rh var7 = new rh(((pj) this).field_I);
        if (param5) {
            return;
        }
        vg var8 = (vg) (Object) var7.c(-1);
        while (var8 != null) {
            // ifeq L91
            var8.a(param0 - -((pj) this).field_o, ((pj) this).field_m + param1, param2, param3, param4, param5);
            var8 = (vg) (Object) var7.a((byte) -98);
        }
    }

    final boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        int var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param3 <= 113) {
            field_D = null;
        }
        rh var8 = new rh(((pj) this).field_I);
        vg var9 = (vg) (Object) var8.c(-1);
        while (var9 != null) {
            // ifeq L111
            if (!(!var9.a(param0, param1, param2, (byte) 117, param4, ((pj) this).field_o + param5, ((pj) this).field_m + param6))) {
                return true;
            }
            var9 = (vg) (Object) var8.a((byte) -100);
        }
        return false;
    }

    final static int a(String param0, int param1, a param2, a param3, int param4, int param5, boolean param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref = null;
        int var10 = 0;
        String var11_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        od stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        od stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        od stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        String stackIn_11_2 = null;
        od stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        od stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        od stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_14_2 = null;
        od stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        od stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        String stackOut_10_2 = null;
        od stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        String stackOut_9_2 = null;
        od stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        od stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_13_2 = null;
        od stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        L0: {
          var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var14 = param3.c(-97);
          if (param4 == 0) {
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var8 = param2.c(120);
          var11_ref = var8;
          if (uj.field_j != null) {
            break L1;
          } else {
            if (ek.a(true, false)) {
              break L1;
            } else {
              return -1;
            }
          }
        }
        L2: {
          if (hh.field_b == tl.field_O) {
            L3: {
              oe.field_a = null;
              nj.field_p.field_j = 0;
              if (param0 != null) {
                L4: {
                  var9 = 0;
                  am.field_n.field_j = 0;
                  if (!param6) {
                    break L4;
                  } else {
                    var9 = var9 | 1;
                    break L4;
                  }
                }
                L5: {
                  am.field_n.a(cm.field_M.nextInt(), (byte) -30);
                  am.field_n.a(cm.field_M.nextInt(), (byte) 119);
                  am.field_n.a(-23805, var14);
                  am.field_n.a(param4 ^ -23805, var8);
                  var15 = (CharSequence) (Object) param0;
                  am.field_n.a(param4 ^ -23805, fg.a(var15, 90));
                  am.field_n.c(param5, param4 + -17402);
                  am.field_n.c(param1, (byte) -88);
                  am.field_n.c(var9, (byte) -98);
                  nj.field_p.c(18, (byte) -101);
                  nj.field_p.field_j = nj.field_p.field_j + 2;
                  var10 = nj.field_p.field_j;
                  var11_ref = ob.a((byte) 97, nb.a(param4 + 67));
                  if (var11_ref != null) {
                    break L5;
                  } else {
                    var11_ref = "";
                    break L5;
                  }
                }
                nj.field_p.a(var11_ref, -1);
                i.a((od) (Object) nj.field_p, am.field_n, a.field_b, d.field_a, 0);
                nj.field_p.a(-2, -var10 + nj.field_p.field_j);
                break L3;
              } else {
                L6: {
                  am.field_n.field_j = 0;
                  am.field_n.a(cm.field_M.nextInt(), (byte) -77);
                  am.field_n.a(cm.field_M.nextInt(), (byte) 126);
                  stackOut_8_0 = am.field_n;
                  stackOut_8_1 = -23805;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  if (!param3.a((byte) -128)) {
                    stackOut_10_0 = (od) (Object) stackIn_10_0;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = "";
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    break L6;
                  } else {
                    stackOut_9_0 = (od) (Object) stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = (String) var14;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_11_2 = stackOut_9_2;
                    break L6;
                  }
                }
                L7: {
                  ((od) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2);
                  stackOut_11_0 = am.field_n;
                  stackOut_11_1 = param4 + -23805;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  if (!param2.a((byte) -108)) {
                    stackOut_13_0 = (od) (Object) stackIn_13_0;
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = "";
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    break L7;
                  } else {
                    stackOut_12_0 = (od) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = (String) var8;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    break L7;
                  }
                }
                ((od) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2);
                nj.field_p.c(16, (byte) -102);
                nj.field_p.field_j = nj.field_p.field_j + 1;
                var9 = nj.field_p.field_j;
                i.a((od) (Object) nj.field_p, am.field_n, a.field_b, d.field_a, 0);
                nj.field_p.b(nj.field_p.field_j - var9, (byte) 87);
                break L3;
              }
            }
            qj.a(-1, param4 + 14656);
            tl.field_O = eg.field_h;
            break L2;
          } else {
            break L2;
          }
        }
        L8: {
          if (tl.field_O != eg.field_h) {
            break L8;
          } else {
            if (jd.a(1, param4 ^ 5929)) {
              L9: {
                var9 = dh.field_N.l(31760);
                dh.field_N.field_j = 0;
                if (100 > var9) {
                  break L9;
                } else {
                  if (var9 > 105) {
                    break L9;
                  } else {
                    td.field_m = new String[-100 + var9];
                    tl.field_O = kc.field_n;
                    break L8;
                  }
                }
              }
              if (248 != var9) {
                if (var9 == 99) {
                  boolean discarded$1 = jd.a(ab.a(39), 5929);
                  oe.field_a = new Boolean(eb.a((od) (Object) dh.field_N, param4 + 126));
                  dh.field_N.field_j = 0;
                  break L8;
                } else {
                  tl.field_O = dl.field_L;
                  t.field_b = var9;
                  gf.field_C = -1;
                  break L8;
                }
              } else {
                dd.a((byte) 64, nb.a(param4 + -77));
                cc.field_p = dd.field_n;
                eg.a((byte) 126);
                dk.field_b = false;
                return var9;
              }
            } else {
              break L8;
            }
          }
        }
        L10: {
          if (tl.field_O != kc.field_n) {
            break L10;
          } else {
            var9 = 2;
            if (!jd.a(var9, 5929)) {
              break L10;
            } else {
              var10 = dh.field_N.j(-788751192);
              dh.field_N.field_j = 0;
              if (!jd.a(var10, 5929)) {
                break L10;
              } else {
                var11 = td.field_m.length;
                var12 = 0;
                L11: while (true) {
                  if (var11 <= var12) {
                    eg.a((byte) 126);
                    dk.field_b = false;
                    return 100 + var11;
                  } else {
                    td.field_m[var12] = dh.field_N.e(-75);
                    var12++;
                    continue L11;
                  }
                }
              }
            }
          }
        }
        L12: {
          if (dl.field_L == tl.field_O) {
            if (li.d(-29427)) {
              L13: {
                if (-256 != (t.field_b ^ -1)) {
                  cc.field_p = dh.field_N.b((byte) -63);
                  break L13;
                } else {
                  var9_ref = dh.field_N.i(715718304);
                  if (var9_ref != null) {
                    aj.a(nb.a(-113), param4 + 77, var9_ref);
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              eg.a((byte) 126);
              dk.field_b = false;
              return t.field_b;
            } else {
              break L12;
            }
          } else {
            break L12;
          }
        }
        L14: {
          if (uj.field_j == null) {
            if (dk.field_b) {
              L15: {
                if (30000L >= of.a((byte) 122)) {
                  cc.field_p = lf.field_f;
                  break L15;
                } else {
                  cc.field_p = dg.field_a;
                  break L15;
                }
              }
              dk.field_b = false;
              return 249;
            } else {
              var9 = ei.field_o;
              ei.field_o = ia.field_c;
              dk.field_b = true;
              ia.field_c = var9;
              break L14;
            }
          } else {
            break L14;
          }
        }
        return -1;
    }

    final boolean a(int param0, int param1, byte param2, int param3, vg param4, int param5, int param6) {
        int var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param2 <= 43) {
            ((pj) this).a(-95, -52, 83, 47, -104);
        }
        rh var8 = new rh(((pj) this).field_I);
        vg var9 = (vg) (Object) var8.c(-1);
        while (var9 != null) {
            // ifeq L114
            if (var9.a(true)) {
                if (var9.a(param0, param1, (byte) 95, param3, param4, param5, param6)) {
                    return true;
                }
            }
            var9 = (vg) (Object) var8.a((byte) -77);
        }
        return false;
    }

    final int d(int param0) {
        int var5 = 0;
        int var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != 3) {
            field_B = null;
        }
        int var2 = 0;
        rh var3 = new rh(((pj) this).field_I);
        vg var4 = (vg) (Object) var3.c(param0 + -4);
        while (var4 != null) {
            var5 = var4.d(param0 ^ 0);
            if (!(var2 >= var5)) {
                var2 = var5;
            }
            var4 = (vg) (Object) var3.a((byte) -91);
        }
        return var2;
    }

    final void b(vg param0, byte param1) {
        ((pj) this).field_I.a((gi) (Object) param0, 255);
        if (param1 < 30) {
            field_E = -118;
        }
    }

    boolean a(int param0, char param1, vg param2, int param3) {
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        rh var8 = new rh(((pj) this).field_I);
        vg var9 = (vg) (Object) var8.c(-1);
        if (param3 <= 63) {
            field_z = null;
        }
        while (var9 != null) {
            // ifeq L104
            if (var9.a(true)) {
                if (!(!var9.a(param0, param1, param2, 72))) {
                    return true;
                }
            }
            var9 = (vg) (Object) var8.a((byte) -113);
        }
        int var6 = param0;
        if (var6 == 80) {
            return ck.field_f[81] ? ((pj) this).a(param2, 65535) : ((pj) this).a(param2, (byte) 79);
        }
        return false;
    }

    private final void h(int param0) {
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != 1) {
            return;
        }
        rh var2 = new rh(((pj) this).field_I);
        vg var3 = (vg) (Object) var2.c(-1);
        while (var3 != null) {
            var3.e((byte) 106);
            var3 = (vg) (Object) var2.a((byte) -104);
        }
    }

    final boolean a(vg param0, byte param1) {
        rh var5 = null;
        vg var6 = null;
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!(!((pj) this).field_I.a(30430))) {
            return false;
        }
        if (param1 <= 29) {
            return true;
        }
        rh var3 = new rh(((pj) this).field_I);
        vg var4 = (vg) (Object) var3.c(-1);
        while (var4 != null) {
            if (var4.a(true)) {
                var5 = new rh(((pj) this).field_I);
                gi discarded$0 = var5.a((gi) (Object) var4, (byte) -98);
                var6 = (vg) (Object) var5.a((byte) -107);
                while (var6 != null) {
                    if (var6.a(false, param0)) {
                        return true;
                    }
                    var6 = (vg) (Object) var5.a((byte) -119);
                }
            }
            var4 = (vg) (Object) var3.a((byte) -105);
        }
        return false;
    }

    final void c(byte param0) {
        int var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        rh var2 = new rh(((pj) this).field_I);
        int var3 = -40 % ((param0 - -10) / 51);
        vg var4 = (vg) (Object) var2.c(-1);
        while (var4 != null) {
            var4.c((byte) 49);
            var4 = (vg) (Object) var2.a((byte) -87);
        }
    }

    final boolean a(boolean param0, vg param1) {
        int var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0) {
            field_z = null;
        }
        rh var3 = new rh(((pj) this).field_I);
        vg var4 = (vg) (Object) var3.c(-1);
        while (var4 != null) {
            if (!(!var4.a(false, param1))) {
                return true;
            }
            var4 = (vg) (Object) var3.a((byte) -74);
        }
        return false;
    }

    final boolean a(boolean param0) {
        if (!param0) {
            Object var3 = null;
            boolean discarded$0 = ((pj) this).a(-123, 'ﾼ', (vg) null, 80);
        }
        return ((pj) this).g(-22426) != null ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.h(param3 + -16534);
    }

    private final void a(Hashtable param0, boolean param1, StringBuilder param2, int param3) {
        int var7 = 0;
        int var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        rh var5 = new rh(((pj) this).field_I);
        vg var6 = (vg) (Object) var5.c(-1);
        if (param1) {
            field_D = null;
        }
        while (var6 != null) {
            StringBuilder discarded$0 = param2.append(10);
            for (var7 = 0; var7 <= param3; var7++) {
                StringBuilder discarded$1 = param2.append(32);
            }
            StringBuilder discarded$2 = var6.a(param3 + 1, param0, param2, -10612);
            var6 = (vg) (Object) var5.a((byte) -72);
        }
    }

    final boolean a(vg param0, int param1) {
        rh var5 = null;
        vg var6 = null;
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (((pj) this).field_I.a(param1 + -35105)) {
            return false;
        }
        rh var8 = new rh(((pj) this).field_I);
        vg var4 = (vg) (Object) var8.a(-105);
        while (var4 != null) {
            if (var4.a(true)) {
                var5 = new rh(((pj) this).field_I);
                gi discarded$0 = var5.a((gi) (Object) var4, -2);
                var6 = (vg) (Object) var5.b((byte) 87);
                while (var6 != null) {
                    if (!(!var6.a(false, param0))) {
                        return true;
                    }
                    var6 = (vg) (Object) var5.b((byte) 87);
                }
            }
            var4 = (vg) (Object) var8.b((byte) 87);
        }
        if (param1 != 65535) {
            ((pj) this).a(6, -36, -109, -26, 125);
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new String[16];
        field_H = true;
        field_B = new he[3][];
        field_G = new aj();
        field_D = new qb();
    }
}
