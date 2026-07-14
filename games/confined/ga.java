/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ga extends fj implements hi {
    static ej field_J;
    mn field_N;
    static nf field_K;
    static int[] field_I;
    static long field_M;

    final boolean a(int param0, int param1, byte param2, fj param3, int param4, int param5, int param6) {
        int var10 = Confined.field_J ? 1 : 0;
        vb var8 = new vb(((ga) this).field_N);
        fj var9 = (fj) (Object) var8.a((byte) 120);
        while (var9 != null) {
            // ifeq L94
            if (var9.e((byte) -125)) {
                if (var9.a(param0, param1, (byte) 36, param3, param4, param5, param6)) {
                    return true;
                }
            }
            var9 = (fj) (Object) var8.b(param2 ^ 95);
        }
        if (param2 != 36) {
            ((ga) this).a(19, 111, 44, -13, 51);
        }
        return false;
    }

    final boolean a(int param0, int param1, byte param2, int param3, fj param4, int param5, int param6) {
        int var10 = Confined.field_J ? 1 : 0;
        vb var8 = new vb(((ga) this).field_N);
        if (param2 != 91) {
            return false;
        }
        fj var9 = (fj) (Object) var8.a((byte) 120);
        while (var9 != null) {
            // ifeq L106
            if (!(!var9.a(((ga) this).field_q + param0, param1, (byte) 91, param3 - -((ga) this).field_m, param4, param5, param6))) {
                return true;
            }
            var9 = (fj) (Object) var8.b(param2 + -39);
        }
        return false;
    }

    ga(int param0, int param1, int param2, int param3, fe param4) {
        super(param0, param1, param2, param3, param4, (uk) null);
        ((ga) this).field_N = new mn();
    }

    final boolean c(fj param0, int param1) {
        vb var5 = null;
        fj var6 = null;
        int var7 = Confined.field_J ? 1 : 0;
        if (param1 != 32) {
            field_J = null;
        }
        if (((ga) this).field_N.f(-1)) {
            return false;
        }
        vb var3 = new vb(((ga) this).field_N);
        fj var4 = (fj) (Object) var3.c(7);
        while (var4 != null) {
            if (!(!var4.e((byte) -123))) {
                var5 = new vb(((ga) this).field_N);
                rk discarded$0 = var5.a((rk) (Object) var4, 0);
                var6 = (fj) (Object) var5.a(0);
                while (var6 != null) {
                    if (!(!var6.a(param0, 418))) {
                        return true;
                    }
                    var6 = (fj) (Object) var5.a(0);
                }
            }
            var4 = (fj) (Object) var3.a(0);
        }
        return false;
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = Confined.field_J ? 1 : 0;
        if (param2 < 36) {
            ga.h(0);
        }
        if (0 == param1) {
            if (null != ((ga) this).field_n) {
                ((ga) this).field_n.a((byte) -125, param3, true, (fj) this, param0);
            }
        }
        vb var5 = new vb(((ga) this).field_N);
        fj var6 = (fj) (Object) var5.c(7);
        while (var6 != null) {
            var6.a(((ga) this).field_m + param0, param1, (byte) 84, param3 - -((ga) this).field_q);
            var6 = (fj) (Object) var5.a(0);
        }
    }

    final void b(int param0) {
        int var4 = Confined.field_J ? 1 : 0;
        vb var2 = new vb(((ga) this).field_N);
        fj var3 = (fj) (Object) var2.a((byte) 120);
        while (var3 != null) {
            var3.b(param0 + 0);
            var3 = (fj) (Object) var2.b(-67);
        }
        if (param0 != 84) {
            ((ga) this).field_N = null;
        }
    }

    final boolean a(fj param0, int param1) {
        int var5 = Confined.field_J ? 1 : 0;
        vb var3 = new vb(((ga) this).field_N);
        if (param1 != 418) {
            ((ga) this).field_N = null;
        }
        fj var4 = (fj) (Object) var3.a((byte) 120);
        while (var4 != null) {
            if (!(!var4.a(param0, 418))) {
                return true;
            }
            var4 = (fj) (Object) var3.b(-126);
        }
        return false;
    }

    final boolean e(byte param0) {
        int var2 = -49 % ((-74 - param0) / 49);
        return null != ((ga) this).f(-1) ? true : false;
    }

    public static void h(int param0) {
        if (param0 != 52) {
            field_K = null;
        }
        field_J = null;
        field_I = null;
        field_K = null;
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, boolean param3) {
        if (param3) {
            field_J = null;
        }
        if (((ga) this).a((byte) -13, param1, param2, param0)) {
            ((ga) this).a(param0, param2, (byte) -63, param1);
            this.a(param0, true, param2, param1);
        }
        return param0;
    }

    fj f(int param0) {
        vb var2 = null;
        fj var3 = null;
        int var4 = 0;
        var4 = Confined.field_J ? 1 : 0;
        if (param0 == -1) {
          var2 = new vb(((ga) this).field_N);
          var3 = (fj) (Object) var2.a((byte) 120);
          L0: while (true) {
            if (var3 != null) {
              if (var3.e((byte) 87)) {
                return var3;
              } else {
                var3 = (fj) (Object) var2.b(-51);
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

    final void a(int param0, int param1, int param2, fj param3, int param4, int param5) {
        int var9 = Confined.field_J ? 1 : 0;
        vb var7 = new vb(((ga) this).field_N);
        fj var8 = (fj) (Object) var7.a((byte) 120);
        while (var8 != null) {
            // ifeq L87
            var8.a(-81, param1 - -((ga) this).field_m, param2, param3, param4, param5 - -((ga) this).field_q);
            var8 = (fj) (Object) var7.b(-108);
        }
        if (param0 > -18) {
            ((ga) this).b(-69);
        }
    }

    final void b(fj param0, int param1) {
        ((ga) this).field_N.a((rk) (Object) param0, (byte) -66);
        if (param1 != 10) {
            field_I = null;
        }
    }

    void a(fj param0, int param1, int param2, int param3) {
        int var7 = Confined.field_J ? 1 : 0;
        super.a(param0, param1, param2, param3);
        vb var5 = new vb(((ga) this).field_N);
        fj var6 = (fj) (Object) var5.a((byte) 120);
        while (var6 != null) {
            // ifeq L91
            var6.a(param0, param1 + 0, ((ga) this).field_q + param2, ((ga) this).field_m + param3);
            var6 = (fj) (Object) var5.b(-88);
        }
    }

    final static boolean g(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == 15214) {
            break L0;
          } else {
            field_K = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (we.field_c < 20) {
              break L2;
            } else {
              if (!dc.f(-14)) {
                break L2;
              } else {
                L3: {
                  if ((oi.field_q ^ -1) >= -1) {
                    break L3;
                  } else {
                    if (ja.c((byte) -77)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final boolean a(int param0, fj param1) {
        vb var5 = null;
        fj var6 = null;
        int var7 = Confined.field_J ? 1 : 0;
        if (((ga) this).field_N.f(-1)) {
            return false;
        }
        vb var8 = new vb(((ga) this).field_N);
        if (param0 != 17731) {
            return false;
        }
        fj var4 = (fj) (Object) var8.a((byte) 120);
        while (var4 != null) {
            if (!(!var4.e((byte) -24))) {
                var5 = new vb(((ga) this).field_N);
                rk discarded$0 = var5.b((rk) (Object) var4, param0 ^ 17733);
                var6 = (fj) (Object) var5.b(-121);
                while (var6 != null) {
                    if (!(!var6.a(param1, param0 + -17313))) {
                        return true;
                    }
                    var6 = (fj) (Object) var5.b(-46);
                }
            }
            var4 = (fj) (Object) var8.b(-123);
        }
        return false;
    }

    final String f(byte param0) {
        vb var2 = null;
        fj var3 = null;
        String var4 = null;
        int var5 = 0;
        L0: {
          var5 = Confined.field_J ? 1 : 0;
          var2 = new vb(((ga) this).field_N);
          var3 = (fj) (Object) var2.a((byte) 120);
          if (param0 <= -82) {
            break L0;
          } else {
            ((ga) this).field_N = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.f((byte) -83);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (fj) (Object) var2.b(66);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-110, param1, param2, param3, param4);
        this.i(12007);
        if (param0 > -109) {
            field_M = 115L;
        }
    }

    boolean a(fj param0, byte param1, int param2, char param3) {
        int var8 = Confined.field_J ? 1 : 0;
        int var5 = 1 % ((47 - param1) / 43);
        vb var6 = new vb(((ga) this).field_N);
        fj var9 = (fj) (Object) var6.a((byte) 120);
        while (var9 != null) {
            // ifeq L100
            if (var9.e((byte) -125)) {
                if (!(!var9.a(param0, (byte) -49, param2, param3))) {
                    return true;
                }
            }
            var9 = (fj) (Object) var6.b(-75);
        }
        int var7 = param2;
        if (var7 != 80) {
            return false;
        }
        return mc.field_e[81] ? ((ga) this).c(param0, 32) : ((ga) this).a(17731, param0);
    }

    final int c(int param0) {
        int var5 = 0;
        int var6 = Confined.field_J ? 1 : 0;
        int var2 = 0;
        if (param0 <= 65) {
            return 67;
        }
        vb var3 = new vb(((ga) this).field_N);
        fj var4 = (fj) (Object) var3.a((byte) 120);
        while (var4 != null) {
            var5 = var4.c(72);
            if (!(var2 >= var5)) {
                var2 = var5;
            }
            var4 = (fj) (Object) var3.b(-33);
        }
        return var2;
    }

    final static int a(byte param0, char param1, CharSequence param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Confined.field_J ? 1 : 0;
          var3 = 0;
          var4 = param2.length();
          var5 = 0;
          if (param0 == -89) {
            break L0;
          } else {
            field_M = -116L;
            break L0;
          }
        }
        L1: while (true) {
          if (var5 >= var4) {
            return var3;
          } else {
            if (param1 == param2.charAt(var5)) {
              var3++;
              var5++;
              continue L1;
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    private final void i(int param0) {
        int var4 = Confined.field_J ? 1 : 0;
        vb var2 = new vb(((ga) this).field_N);
        fj var3 = (fj) (Object) var2.a((byte) 120);
        while (var3 != null) {
            var3.d(60);
            var3 = (fj) (Object) var2.b(param0 ^ 11913);
        }
        if (param0 != 12007) {
            field_K = null;
        }
    }

    private final void a(StringBuilder param0, boolean param1, Hashtable param2, int param3) {
        int var7 = 0;
        int var8 = Confined.field_J ? 1 : 0;
        vb var5 = new vb(((ga) this).field_N);
        if (!param1) {
            field_M = -106L;
        }
        fj var6 = (fj) (Object) var5.a((byte) 120);
        while (var6 != null) {
            StringBuilder discarded$0 = param0.append(10);
            for (var7 = 0; param3 >= var7; var7++) {
                StringBuilder discarded$1 = param0.append(32);
            }
            StringBuilder discarded$2 = var6.a(param0, param3 - -1, param2, !param1 ? true : false);
            var6 = (fj) (Object) var5.b(-38);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new ej();
        field_I = new int[]{10, 16, 20, 25, 32, 40, 52};
    }
}
