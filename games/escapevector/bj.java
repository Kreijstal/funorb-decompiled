/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class bj extends hm implements ba {
    static boolean[] field_E;
    static java.awt.Image field_z;
    static mf field_B;
    static String field_D;
    cn field_A;
    static int field_y;
    static ie field_C;
    static int[] field_F;

    private final void f(byte param0) {
        int var4 = EscapeVector.field_A;
        wf var2 = new wf(((bj) this).field_A);
        if (param0 != 6) {
            boolean discarded$0 = bj.e((byte) -76);
        }
        hm var3 = (hm) (Object) var2.c(param0 ^ 9);
        while (var3 != null) {
            var3.i(0);
            var3 = (hm) (Object) var2.a(53);
        }
    }

    public static void g(byte param0) {
        field_C = null;
        field_z = null;
        field_D = null;
        field_F = null;
        if (param0 != -68) {
            field_F = null;
        }
        field_B = null;
        field_E = null;
    }

    final boolean h(int param0) {
        if (param0 != 0) {
            return false;
        }
        return ((bj) this).a(true) != null ? true : false;
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = EscapeVector.field_A;
        if (param1 <= 85) {
            Object var8 = null;
            StringBuilder discarded$0 = ((bj) this).a(37, (Hashtable) null, (StringBuilder) null, 58);
        }
        if (param2 == 0) {
            if (!(null == ((bj) this).field_s)) {
                ((bj) this).field_s.a(param3, param0, -42, (hm) this, true);
            }
        }
        wf var5 = new wf(((bj) this).field_A);
        hm var6 = (hm) (Object) var5.b(-31616);
        while (var6 != null) {
            var6.a(param0 - -((bj) this).field_j, (byte) 127, param2, ((bj) this).field_k + param3);
            var6 = (hm) (Object) var5.a((byte) 59);
        }
    }

    bj(int param0, int param1, int param2, int param3, db param4) {
        super(param0, param1, param2, param3, param4, (wn) null);
        ((bj) this).field_A = new cn();
    }

    final static boolean e(byte param0) {
        int var1 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var1 = -82 % ((34 - param0) / 63);
            if (aj.b(-105)) {
              break L1;
            } else {
              if (0 >= s.field_x) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final int e(int param0) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        int var2 = 0;
        wf var3 = new wf(((bj) this).field_A);
        if (param0 != 12050) {
            return 121;
        }
        hm var4 = (hm) (Object) var3.c(15);
        while (var4 != null) {
            var5 = var4.e(12050);
            if (!(var5 <= var2)) {
                var2 = var5;
            }
            var4 = (hm) (Object) var3.a(56);
        }
        return var2;
    }

    final String d(int param0) {
        wf var2 = null;
        hm var3 = null;
        String var4 = null;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = EscapeVector.field_A;
          var2 = new wf(((bj) this).field_A);
          if (param0 == 1) {
            break L0;
          } else {
            var6 = null;
            this.a((StringBuilder) null, -16, (Hashtable) null, 72);
            break L0;
          }
        }
        var3 = (hm) (Object) var2.c(15);
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.d(1);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (hm) (Object) var2.a(param0 + 57);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        wf var8 = null;
        hm var9 = null;
        int var10 = 0;
        var10 = EscapeVector.field_A;
        if (param2 == 3) {
          var8 = new wf(((bj) this).field_A);
          var9 = (hm) (Object) var8.c(param2 ^ 12);
          L0: while (true) {
            L1: {
              if (var9 == null) {
                break L1;
              } else {
                if (!var9.b((byte) 48)) {
                  break L1;
                } else {
                  if (!var9.a(((bj) this).field_j + param0, param1, (byte) 3, param3, ((bj) this).field_k + param4, param5, param6)) {
                    var9 = (hm) (Object) var8.a(108);
                    continue L0;
                  } else {
                    return true;
                  }
                }
              }
            }
            return false;
          }
        } else {
          return false;
        }
    }

    boolean a(hm param0, char param1, int param2, int param3) {
        wf var5 = null;
        int var6 = 0;
        int var7 = 0;
        hm var8 = null;
        boolean stackIn_13_0 = false;
        boolean stackOut_12_0 = false;
        boolean stackOut_11_0 = false;
        var7 = EscapeVector.field_A;
        var5 = new wf(((bj) this).field_A);
        var8 = (hm) (Object) var5.c(15);
        if (param3 > 0) {
          L0: while (true) {
            L1: {
              if (var8 == null) {
                break L1;
              } else {
                if (!var8.b((byte) 48)) {
                  break L1;
                } else {
                  L2: {
                    if (!var8.h(0)) {
                      break L2;
                    } else {
                      if (!var8.a(param0, param1, param2, 37)) {
                        break L2;
                      } else {
                        return true;
                      }
                    }
                  }
                  var8 = (hm) (Object) var5.a(54);
                  continue L0;
                }
              }
            }
            var6 = param2;
            if (80 == var6) {
              L3: {
                if (!ik.field_h[81]) {
                  stackOut_12_0 = ((bj) this).a(param0, true);
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = ((bj) this).a((byte) 22, param0);
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              }
              return stackIn_13_0;
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        if (!param3) {
            return;
        }
        this.f((byte) 6);
    }

    final boolean b(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        wf var8 = null;
        hm var9 = null;
        int var10 = 0;
        L0: {
          var10 = EscapeVector.field_A;
          if (param2 < -103) {
            break L0;
          } else {
            field_B = null;
            break L0;
          }
        }
        var8 = new wf(((bj) this).field_A);
        var9 = (hm) (Object) var8.c(15);
        L1: while (true) {
          L2: {
            if (var9 == null) {
              break L2;
            } else {
              if (!var9.b((byte) 48)) {
                break L2;
              } else {
                L3: {
                  if (!var9.h(0)) {
                    break L3;
                  } else {
                    if (var9.b(param0, param1, (byte) -127, param3, param4, param5, param6)) {
                      return true;
                    } else {
                      break L3;
                    }
                  }
                }
                var9 = (hm) (Object) var8.a(102);
                continue L1;
              }
            }
          }
          return false;
        }
    }

    void a(int param0, int param1, int param2, hm param3) {
        wf var5 = null;
        hm var6 = null;
        int var7 = 0;
        var7 = EscapeVector.field_A;
        super.a(param0, param1, param2, param3);
        var5 = new wf(((bj) this).field_A);
        var6 = (hm) (Object) var5.c(15);
        L0: while (true) {
          L1: {
            if (var6 == null) {
              break L1;
            } else {
              if (!var6.b((byte) 48)) {
                break L1;
              } else {
                var6.a(-14472, ((bj) this).field_j + param1, param2 - -((bj) this).field_k, param3);
                var6 = (hm) (Object) var5.a(57);
                continue L0;
              }
            }
          }
          return;
        }
    }

    final void f(int param0) {
        int var4 = EscapeVector.field_A;
        wf var2 = new wf(((bj) this).field_A);
        hm var3 = (hm) (Object) var2.c(15);
        while (var3 != null) {
            var3.f(111);
            var3 = (hm) (Object) var2.a(25);
        }
        if (param0 < 46) {
            Object var5 = null;
            boolean discarded$0 = ((bj) this).a((hm) null, 'c', -45, -89);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var4 = -53 / ((param0 - 70) / 45);
        int var3 = param2 / 2500;
        var3 = kf.a(106, param1, var3);
        return var3;
    }

    final boolean a(byte param0, hm param1) {
        wf var5 = null;
        hm var6 = null;
        int var7 = EscapeVector.field_A;
        if (((bj) this).field_A.a(param0 ^ -106)) {
            return false;
        }
        wf var3 = new wf(((bj) this).field_A);
        if (param0 != 22) {
            return true;
        }
        hm var4 = (hm) (Object) var3.b(-31616);
        while (var4 != null) {
            if (var4.h(0)) {
                var5 = new wf(((bj) this).field_A);
                hg discarded$0 = var5.a((byte) 55, (hg) (Object) var4);
                var6 = (hm) (Object) var5.a((byte) 47);
                while (var6 != null) {
                    if (!(!var6.a(-4659, param1))) {
                        return true;
                    }
                    var6 = (hm) (Object) var5.a((byte) 80);
                }
            }
            var4 = (hm) (Object) var3.a((byte) 74);
        }
        return false;
    }

    final boolean a(hm param0, boolean param1) {
        wf var5 = null;
        hm var6 = null;
        int var7 = EscapeVector.field_A;
        if (!(!((bj) this).field_A.a(-97))) {
            return false;
        }
        wf var9 = new wf(((bj) this).field_A);
        if (!param1) {
            Object var8 = null;
            boolean discarded$0 = ((bj) this).a(31, -112, (byte) -74, 114, -25, (hm) null, -91);
        }
        hm var4 = (hm) (Object) var9.c(15);
        while (var4 != null) {
            if (!(!var4.h(0))) {
                var5 = new wf(((bj) this).field_A);
                hg discarded$1 = var5.a(-12818, (hg) (Object) var4);
                var6 = (hm) (Object) var5.a(125);
                while (var6 != null) {
                    if (var6.a(-4659, param0)) {
                        return true;
                    }
                    var6 = (hm) (Object) var5.a(80);
                }
            }
            var4 = (hm) (Object) var9.a(98);
        }
        return false;
    }

    final boolean a(int param0, hm param1) {
        int var5 = EscapeVector.field_A;
        wf var3 = new wf(((bj) this).field_A);
        if (param0 != -4659) {
            boolean discarded$0 = bj.e((byte) 13);
        }
        hm var4 = (hm) (Object) var3.c(15);
        while (var4 != null) {
            if (!(!var4.a(-4659, param1))) {
                return true;
            }
            var4 = (hm) (Object) var3.a(param0 + 4779);
        }
        return false;
    }

    hm a(boolean param0) {
        wf var2 = null;
        hm var3 = null;
        int var4 = 0;
        L0: {
          var4 = EscapeVector.field_A;
          var2 = new wf(((bj) this).field_A);
          if (param0) {
            break L0;
          } else {
            field_y = 52;
            break L0;
          }
        }
        var3 = (hm) (Object) var2.c(15);
        L1: while (true) {
          if (var3 != null) {
            if (var3.h(0)) {
              return var3;
            } else {
              var3 = (hm) (Object) var2.a(78);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    private final void a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        int var7 = 0;
        int var8 = EscapeVector.field_A;
        wf var5 = new wf(((bj) this).field_A);
        if (param3 <= 95) {
            field_D = null;
        }
        hm var6 = (hm) (Object) var5.c(15);
        while (var6 != null) {
            StringBuilder discarded$0 = param0.append(10);
            for (var7 = 0; param1 >= var7; var7++) {
                StringBuilder discarded$1 = param0.append(32);
            }
            StringBuilder discarded$2 = var6.a(0, param2, param0, param1 - -1);
            var6 = (hm) (Object) var5.a(31);
        }
    }

    final void b(hm param0, boolean param1) {
        if (param1) {
            Object var4 = null;
            boolean discarded$0 = ((bj) this).a((byte) -114, (hm) null);
        }
        ((bj) this).field_A.a(-12328, (hg) (Object) param0);
    }

    final void a(int param0, int param1, int param2, int param3, hm param4, byte param5) {
        wf var7 = null;
        hm var8_ref_hm = null;
        int var8 = 0;
        int var9 = 0;
        var9 = EscapeVector.field_A;
        var7 = new wf(((bj) this).field_A);
        var8_ref_hm = (hm) (Object) var7.c(15);
        L0: while (true) {
          L1: {
            if (var8_ref_hm == null) {
              break L1;
            } else {
              if (!var8_ref_hm.b((byte) 48)) {
                break L1;
              } else {
                var8_ref_hm.a(param0, ((bj) this).field_k + param1, param2, param3 + ((bj) this).field_j, param4, (byte) -113);
                var8_ref_hm = (hm) (Object) var7.a(29);
                continue L0;
              }
            }
          }
          var8 = -114 % ((-39 - param5) / 45);
          return;
        }
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        if (param0 != 0) {
            ((bj) this).a(-82, (byte) 105, -122, -83);
        }
        if (((bj) this).a(param3, param1, param2, false)) {
            ((bj) this).a(param1, param2, param3, 1);
            this.a(param2, param3, param1, 115);
        }
        return param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "TNT";
        field_F = new int[]{15, 19};
        field_y = 0;
    }
}
