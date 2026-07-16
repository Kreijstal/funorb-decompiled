/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class gj extends qa implements wg {
    static dd[] field_E;
    vc field_C;
    static rk field_A;
    static String field_D;
    static String[] field_B;

    gj(int param0, int param1, int param2, int param3, ch param4) {
        super(param0, param1, param2, param3, param4, (kd) null);
        ((gj) this).field_C = new vc();
    }

    final boolean a(qa param0, int param1) {
        int var5 = fleas.field_A ? 1 : 0;
        we var3 = new we(((gj) this).field_C);
        qa var4 = (qa) (Object) var3.b(87);
        while (var4 != null) {
            if (!(!var4.a(param0, -118))) {
                return true;
            }
            var4 = (qa) (Object) var3.c(-6144);
        }
        if (param1 >= -26) {
            this.d((byte) -117);
        }
        return false;
    }

    final StringBuilder a(StringBuilder param0, Hashtable param1, int param2, int param3) {
        if (!(!((gj) this).a(param1, -62, param0, param2))) {
            ((gj) this).a(param2, -37, param0, param1);
            this.b(param0, param1, 0, param2);
        }
        if (param3 >= -47) {
            return null;
        }
        return param0;
    }

    final void f(int param0) {
        int var4 = fleas.field_A ? 1 : 0;
        we var2 = new we(((gj) this).field_C);
        if (param0 != -1) {
            return;
        }
        qa var3 = (qa) (Object) var2.b(-74);
        while (var3 != null) {
            var3.f(-1);
            var3 = (qa) (Object) var2.c(-6144);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.d((byte) 84);
    }

    private final void d(byte param0) {
        int var4 = fleas.field_A ? 1 : 0;
        if (param0 != 84) {
            field_B = null;
        }
        we var2 = new we(((gj) this).field_C);
        qa var3 = (qa) (Object) var2.b(73);
        while (var3 != null) {
            var3.b(false);
            var3 = (qa) (Object) var2.c(-6144);
        }
    }

    final void a(byte param0, qa param1, int param2, int param3, int param4, int param5) {
        we var7 = null;
        qa var8 = null;
        int var9 = 0;
        var9 = fleas.field_A ? 1 : 0;
        var7 = new we(((gj) this).field_C);
        var8 = (qa) (Object) var7.b(-128);
        L0: while (true) {
          L1: {
            if (var8 == null) {
              break L1;
            } else {
              if (!var8.b((byte) -54)) {
                break L1;
              } else {
                var8.a((byte) 5, param1, param2 + ((gj) this).field_y, param3, param4, ((gj) this).field_z + param5);
                var8 = (qa) (Object) var7.c(-6144);
                continue L0;
              }
            }
          }
          L2: {
            if (param0 == 5) {
              break L2;
            } else {
              field_B = null;
              break L2;
            }
          }
          return;
        }
    }

    final static String a(int param0, CharSequence[] param1) {
        if (param0 != 0) {
            return null;
        }
        return aj.a(param1, 0, (byte) -108, param1.length);
    }

    final boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        we var8 = null;
        qa var9 = null;
        int var10 = 0;
        var10 = fleas.field_A ? 1 : 0;
        if (param1) {
          var8 = new we(((gj) this).field_C);
          var9 = (qa) (Object) var8.b(-75);
          L0: while (true) {
            L1: {
              if (var9 == null) {
                break L1;
              } else {
                if (!var9.b((byte) -54)) {
                  break L1;
                } else {
                  if (!var9.a(param0 + ((gj) this).field_z, true, param2, param3, param4, param5, param6 + ((gj) this).field_y)) {
                    var9 = (qa) (Object) var8.c(-6144);
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

    final boolean a(int param0, qa param1) {
        we var5 = null;
        qa var6 = null;
        int var7 = fleas.field_A ? 1 : 0;
        if (!(!((gj) this).field_C.a(-1092895903))) {
            return false;
        }
        if (param0 != 32) {
            field_A = null;
        }
        we var8 = new we(((gj) this).field_C);
        qa var4 = (qa) (Object) var8.b(106);
        while (var4 != null) {
            if (!(!var4.e(param0 + -31))) {
                var5 = new we(((gj) this).field_C);
                lh discarded$0 = var5.a((byte) -99, (lh) (Object) var4);
                var6 = (qa) (Object) var5.c(-6144);
                while (var6 != null) {
                    if (!(!var6.a(param1, -108))) {
                        return true;
                    }
                    var6 = (qa) (Object) var5.c(param0 ^ -6112);
                }
            }
            var4 = (qa) (Object) var8.c(param0 ^ -6112);
        }
        return false;
    }

    final boolean a(int param0, qa param1, int param2, int param3, int param4, int param5, int param6) {
        we var8 = null;
        qa var9 = null;
        int var10 = 0;
        var10 = fleas.field_A ? 1 : 0;
        var8 = new we(((gj) this).field_C);
        var9 = (qa) (Object) var8.b(-62);
        L0: while (true) {
          L1: {
            if (var9 == null) {
              break L1;
            } else {
              if (!var9.b((byte) -54)) {
                break L1;
              } else {
                L2: {
                  if (!var9.e(1)) {
                    break L2;
                  } else {
                    if (!var9.a(param0, param1, param2, -31628, param4, param5, param6)) {
                      break L2;
                    } else {
                      return true;
                    }
                  }
                }
                var9 = (qa) (Object) var8.c(-6144);
                continue L0;
              }
            }
          }
          if (param3 == -31628) {
            return false;
          } else {
            field_A = null;
            return false;
          }
        }
    }

    public static void a(byte param0) {
        field_A = null;
        field_B = null;
        if (param0 >= -93) {
            return;
        }
        field_D = null;
        field_E = null;
    }

    final void a(qa param0, byte param1) {
        ((gj) this).field_C.a(false, (lh) (Object) param0);
        if (param1 >= -27) {
            String discarded$0 = ((gj) this).g(121);
        }
    }

    void b(int param0, int param1, boolean param2, int param3) {
        int var7 = fleas.field_A ? 1 : 0;
        if (0 == param3) {
            if (!(null == ((gj) this).field_p)) {
                ((gj) this).field_p.a(-127, param1, true, (qa) this, param0);
            }
        }
        we var5 = new we(((gj) this).field_C);
        if (!param2) {
            return;
        }
        qa var6 = (qa) (Object) var5.a((byte) 106);
        while (var6 != null) {
            var6.b(param0 - -((gj) this).field_z, param1 + ((gj) this).field_y, true, param3);
            var6 = (qa) (Object) var5.a(true);
        }
    }

    boolean a(int param0, int param1, qa param2, char param3) {
        we var5 = null;
        int var6 = 0;
        int var7 = 0;
        qa var8 = null;
        boolean stackIn_13_0 = false;
        boolean stackOut_12_0 = false;
        boolean stackOut_11_0 = false;
        var7 = fleas.field_A ? 1 : 0;
        var5 = new we(((gj) this).field_C);
        var8 = (qa) (Object) var5.b(102);
        L0: while (true) {
          L1: {
            if (var8 == null) {
              break L1;
            } else {
              if (!var8.b((byte) -54)) {
                break L1;
              } else {
                L2: {
                  if (!var8.e(1)) {
                    break L2;
                  } else {
                    if (!var8.a(-2, param1, param2, param3)) {
                      break L2;
                    } else {
                      return true;
                    }
                  }
                }
                var8 = (qa) (Object) var5.c(param0 + -6142);
                continue L0;
              }
            }
          }
          if (param0 == -2) {
            var6 = param1;
            if (80 != var6) {
              return false;
            } else {
              L3: {
                if (!ei.field_H[81]) {
                  stackOut_12_0 = ((gj) this).a(32, param2);
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = ((gj) this).b(param2, param0 ^ 28533);
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              }
              return stackIn_13_0;
            }
          } else {
            return false;
          }
        }
    }

    qa i(int param0) {
        we var2 = null;
        qa var3 = null;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        var2 = new we(((gj) this).field_C);
        if (param0 == -257) {
          var3 = (qa) (Object) var2.b(-119);
          L0: while (true) {
            if (var3 != null) {
              if (var3.e(1)) {
                return var3;
              } else {
                var3 = (qa) (Object) var2.c(param0 + -5887);
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

    final boolean b(qa param0, int param1) {
        we var5 = null;
        qa var6 = null;
        int var7 = fleas.field_A ? 1 : 0;
        if (!(!((gj) this).field_C.a(param1 ^ 1092889578))) {
            return false;
        }
        we var8 = new we(((gj) this).field_C);
        if (param1 != -28533) {
            this.d((byte) -72);
        }
        qa var4 = (qa) (Object) var8.a((byte) 106);
        while (var4 != null) {
            if (!(!var4.e(1))) {
                var5 = new we(((gj) this).field_C);
                lh discarded$0 = var5.b((byte) -119, (lh) (Object) var4);
                var6 = (qa) (Object) var5.a(true);
                while (var6 != null) {
                    if (!(!var6.a(param0, -59))) {
                        return true;
                    }
                    var6 = (qa) (Object) var5.a(true);
                }
            }
            var4 = (qa) (Object) var8.a(true);
        }
        return false;
    }

    private final void b(StringBuilder param0, Hashtable param1, int param2, int param3) {
        int var7 = 0;
        int var8 = fleas.field_A ? 1 : 0;
        if (param2 != 0) {
            ((gj) this).b(26, -83, true, -8);
        }
        we var5 = new we(((gj) this).field_C);
        qa var6 = (qa) (Object) var5.b(param2 + -78);
        while (var6 != null) {
            StringBuilder discarded$0 = param0.append(10);
            for (var7 = 0; var7 <= param3; var7++) {
                StringBuilder discarded$1 = param0.append(32);
            }
            StringBuilder discarded$2 = var6.a(param0, param1, param3 - -1, param2 ^ -82);
            var6 = (qa) (Object) var5.c(-6144);
        }
    }

    final String g(int param0) {
        String var4 = null;
        int var5 = fleas.field_A ? 1 : 0;
        we var2 = new we(((gj) this).field_C);
        qa var3 = (qa) (Object) var2.b(param0 ^ -127);
        while (var3 != null) {
            var4 = var3.g(4);
            if (!(var4 == null)) {
                return var4;
            }
            var3 = (qa) (Object) var2.c(-6144);
        }
        if (param0 == 4) {
            return null;
        }
        String discarded$0 = ((gj) this).g(49);
        return null;
    }

    final boolean e(int param0) {
        if (param0 != 1) {
            field_D = null;
        }
        return ((gj) this).i(param0 ^ -258) != null ? true : false;
    }

    final int c(byte param0) {
        int var5 = 0;
        int var6 = fleas.field_A ? 1 : 0;
        int var2 = 0;
        we var3 = new we(((gj) this).field_C);
        qa var4 = (qa) (Object) var3.b(107);
        while (var4 != null) {
            var5 = var4.c((byte) 8);
            if (var5 > var2) {
                var2 = var5;
            }
            var4 = (qa) (Object) var3.c(-6144);
        }
        if (param0 != 8) {
            String discarded$0 = ((gj) this).g(-53);
        }
        return var2;
    }

    void a(int param0, int param1, qa param2, byte param3) {
        we var5 = null;
        qa var6 = null;
        int var7 = 0;
        L0: {
          var7 = fleas.field_A ? 1 : 0;
          super.a(param0, param1, param2, (byte) -88);
          var5 = new we(((gj) this).field_C);
          if (param3 <= -85) {
            break L0;
          } else {
            field_D = null;
            break L0;
          }
        }
        var6 = (qa) (Object) var5.b(-67);
        L1: while (true) {
          L2: {
            if (var6 == null) {
              break L2;
            } else {
              if (!var6.b((byte) -54)) {
                break L2;
              } else {
                var6.a(((gj) this).field_z + param0, param1 + ((gj) this).field_y, param2, (byte) -123);
                var6 = (qa) (Object) var5.c(-6144);
                continue L1;
              }
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "There are several different tiles in Flea Circus, each with a different effect. The effect is normally triggered when a flea touches the tile. Some tiles only work if a flea approaches from the side or top.";
        field_B = new String[]{"By rating", "By win percentage"};
    }
}
