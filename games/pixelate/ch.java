/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ch extends ng implements j {
    static String field_H;
    static String field_G;
    bb field_F;

    private final void a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        int var7 = 0;
        int var8 = Pixelate.field_H ? 1 : 0;
        nm var10 = new nm(((ch) this).field_F);
        if (param2 != 32) {
            Object var9 = null;
            this.a(-23, (Hashtable) null, -77, (StringBuilder) null);
        }
        ng var6 = (ng) (Object) var10.d(param2 + -32);
        while (var6 != null) {
            StringBuilder discarded$0 = param3.append(10);
            for (var7 = 0; var7 <= param0; var7++) {
                StringBuilder discarded$1 = param3.append(32);
            }
            StringBuilder discarded$2 = var6.a(param3, false, param0 - -1, param1);
            var6 = (ng) (Object) var10.a((byte) -104);
        }
    }

    boolean a(int param0, int param1, ng param2, char param3) {
        int var6 = 0;
        int var7 = 0;
        ng var8 = null;
        nm var9 = null;
        boolean stackIn_12_0 = false;
        boolean stackOut_11_0 = false;
        boolean stackOut_10_0 = false;
        var7 = Pixelate.field_H ? 1 : 0;
        var9 = new nm(((ch) this).field_F);
        var8 = (ng) (Object) var9.d(0);
        L0: while (true) {
          L1: {
            if (var8 == null) {
              break L1;
            } else {
              if (!var8.b(0)) {
                break L1;
              } else {
                L2: {
                  if (!var8.b(true)) {
                    break L2;
                  } else {
                    if (!var8.a(param0, param1 + 0, param2, param3)) {
                      break L2;
                    } else {
                      return true;
                    }
                  }
                }
                var8 = (ng) (Object) var9.a((byte) -104);
                continue L0;
              }
            }
          }
          var6 = param0;
          if (80 == var6) {
            L3: {
              if (!bc.field_m[81]) {
                stackOut_11_0 = ((ch) this).b(10, param2);
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_10_0 = ((ch) this).a(0, param2);
                stackIn_12_0 = stackOut_10_0;
                break L3;
              }
            }
            return stackIn_12_0;
          } else {
            if (param1 == 3) {
              return false;
            } else {
              field_H = null;
              return false;
            }
          }
        }
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ng param6) {
        ng var9 = null;
        int var10 = 0;
        Object var11 = null;
        nm var12 = null;
        L0: {
          var10 = Pixelate.field_H ? 1 : 0;
          if (param1 > 61) {
            break L0;
          } else {
            var11 = null;
            this.a(95, (Hashtable) null, -28, (StringBuilder) null);
            break L0;
          }
        }
        var12 = new nm(((ch) this).field_F);
        var9 = (ng) (Object) var12.d(0);
        L1: while (true) {
          L2: {
            if (var9 == null) {
              break L2;
            } else {
              if (!var9.b(0)) {
                break L2;
              } else {
                L3: {
                  if (!var9.b(true)) {
                    break L3;
                  } else {
                    if (var9.a(param0, (byte) 112, param2, param3, param4, param5, param6)) {
                      return true;
                    } else {
                      break L3;
                    }
                  }
                }
                var9 = (ng) (Object) var12.a((byte) -104);
                continue L1;
              }
            }
          }
          return false;
        }
    }

    final boolean a(int param0, ng param1) {
        nm var5 = null;
        ng var6 = null;
        int var7 = Pixelate.field_H ? 1 : 0;
        if (!(!((ch) this).field_F.a(param0))) {
            return false;
        }
        nm var3 = new nm(((ch) this).field_F);
        ng var4 = (ng) (Object) var3.b(param0 ^ -1);
        while (var4 != null) {
            if (!(!var4.b(true))) {
                var5 = new nm(((ch) this).field_F);
                fa discarded$0 = var5.a((byte) -99, (fa) (Object) var4);
                var6 = (ng) (Object) var5.e(-59);
                while (var6 != null) {
                    if (var6.a(param1, 27)) {
                        return true;
                    }
                    var6 = (ng) (Object) var5.e(-94);
                }
            }
            var4 = (ng) (Object) var3.e(-79);
        }
        return false;
    }

    void a(int param0, int param1, int param2, ng param3) {
        nm var5 = null;
        ng var6 = null;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        super.a(param0, param1, param2, param3);
        var5 = new nm(((ch) this).field_F);
        var6 = (ng) (Object) var5.d(0);
        L0: while (true) {
          L1: {
            if (var6 == null) {
              break L1;
            } else {
              if (!var6.b(param0 + -40)) {
                break L1;
              } else {
                var6.a(40, param1 - -((ch) this).field_p, param2 + ((ch) this).field_z, param3);
                var6 = (ng) (Object) var5.a((byte) -104);
                continue L0;
              }
            }
          }
          return;
        }
    }

    final boolean b(int param0, ng param1) {
        nm var5 = null;
        ng var6 = null;
        int var7 = Pixelate.field_H ? 1 : 0;
        if (((ch) this).field_F.a(param0 ^ 10)) {
            return false;
        }
        nm var8 = new nm(((ch) this).field_F);
        ng var4 = (ng) (Object) var8.d(0);
        while (var4 != null) {
            if (!(!var4.b(true))) {
                var5 = new nm(((ch) this).field_F);
                fa discarded$0 = var5.b((byte) -87, (fa) (Object) var4);
                var6 = (ng) (Object) var5.a((byte) -104);
                while (var6 != null) {
                    if (var6.a(param1, 27)) {
                        return true;
                    }
                    var6 = (ng) (Object) var5.a((byte) -104);
                }
            }
            var4 = (ng) (Object) var8.a((byte) -104);
        }
        if (param0 != 10) {
            ng discarded$1 = ((ch) this).k(-117);
            return false;
        }
        return false;
    }

    final void h(int param0) {
        int var4 = Pixelate.field_H ? 1 : 0;
        if (param0 != 2) {
            Object var5 = null;
            boolean discarded$0 = ((ch) this).a(-101, 97, (ng) null, '');
        }
        nm var2 = new nm(((ch) this).field_F);
        ng var3 = (ng) (Object) var2.d(0);
        while (var3 != null) {
            var3.h(2);
            var3 = (ng) (Object) var2.a((byte) -104);
        }
    }

    void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 <= 19) {
            ((ch) this).field_F = null;
        }
        super.a(param0, (byte) 126, param2, param3, param4);
        this.j(-8133);
    }

    final boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        ng var9 = null;
        int var10 = 0;
        Object var11 = null;
        nm var12 = null;
        L0: {
          var10 = Pixelate.field_H ? 1 : 0;
          var12 = new nm(((ch) this).field_F);
          if (param0 == -58) {
            break L0;
          } else {
            var11 = null;
            this.a(-76, (Hashtable) null, 78, (StringBuilder) null);
            break L0;
          }
        }
        var9 = (ng) (Object) var12.d(0);
        L1: while (true) {
          L2: {
            if (var9 == null) {
              break L2;
            } else {
              if (!var9.b(0)) {
                break L2;
              } else {
                if (var9.a((byte) -58, param1, param2, ((ch) this).field_p + param3, param4, ((ch) this).field_z + param5, param6)) {
                  return true;
                } else {
                  var9 = (ng) (Object) var12.a((byte) -104);
                  continue L1;
                }
              }
            }
          }
          return false;
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
            Object var3 = null;
            this.a(82, (Hashtable) null, -45, (StringBuilder) null);
        }
        return null != ((ch) this).k(-105) ? true : false;
    }

    ch(int param0, int param1, int param2, int param3, eb param4) {
        super(param0, param1, param2, param3, param4, (fn) null);
        ((ch) this).field_F = new bb();
    }

    final void b(ng param0, int param1) {
        ((ch) this).field_F.a(22125, (fa) (Object) param0);
        if (param1 != 80) {
            field_H = null;
        }
    }

    public static void d(byte param0) {
        field_H = null;
        field_G = null;
        int var1 = -42 / ((3 - param0) / 46);
    }

    final boolean a(ng param0, int param1) {
        int var5 = Pixelate.field_H ? 1 : 0;
        nm var3 = new nm(((ch) this).field_F);
        ng var4 = (ng) (Object) var3.d(0);
        if (param1 != 27) {
            boolean discarded$0 = ((ch) this).b(false);
        }
        while (var4 != null) {
            if (!(!var4.a(param0, 27))) {
                return true;
            }
            var4 = (ng) (Object) var3.a((byte) -104);
        }
        return false;
    }

    final void a(int param0, int param1, ng param2, int param3, int param4, int param5) {
        nm var7 = null;
        ng var8 = null;
        int var9 = 0;
        var9 = Pixelate.field_H ? 1 : 0;
        var7 = new nm(((ch) this).field_F);
        var8 = (ng) (Object) var7.d(param3);
        L0: while (true) {
          L1: {
            if (var8 == null) {
              break L1;
            } else {
              if (!var8.b(0)) {
                break L1;
              } else {
                var8.a(param0, param1 - -((ch) this).field_z, param2, 0, param4 - -((ch) this).field_p, param5);
                var8 = (ng) (Object) var7.a((byte) -104);
                continue L0;
              }
            }
          }
          return;
        }
    }

    final StringBuilder a(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
        if (param1) {
            field_G = null;
        }
        if (((ch) this).a(-60, param2, param0, param3)) {
            ((ch) this).a(param2, (byte) -2, param3, param0);
            this.a(param2, param3, 32, param0);
        }
        return param0;
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var8 = Pixelate.field_H ? 1 : 0;
        if (param1 == 0) {
            if (!(null == ((ch) this).field_y)) {
                ((ch) this).field_y.a((ng) this, (byte) -124, param0, param2, true);
            }
        }
        nm var5 = new nm(((ch) this).field_F);
        int var7 = 101 % ((param3 - 70) / 49);
        ng var6 = (ng) (Object) var5.b(-1);
        while (var6 != null) {
            var6.a(((ch) this).field_p + param0, param1, ((ch) this).field_z + param2, (byte) -68);
            var6 = (ng) (Object) var5.e(-91);
        }
    }

    String b(byte param0) {
        nm var2 = null;
        ng var3 = null;
        String var4 = null;
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        var2 = new nm(((ch) this).field_F);
        if (param0 > 16) {
          var3 = (ng) (Object) var2.d(0);
          L0: while (true) {
            if (var3 != null) {
              var4 = var3.b((byte) 36);
              if (var4 == null) {
                var3 = (ng) (Object) var2.a((byte) -104);
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

    ng k(int param0) {
        int var4 = Pixelate.field_H ? 1 : 0;
        nm var2 = new nm(((ch) this).field_F);
        ng var3_ref_ng = (ng) (Object) var2.d(0);
        while (var3_ref_ng != null) {
            if (var3_ref_ng.b(true)) {
                return var3_ref_ng;
            }
            var3_ref_ng = (ng) (Object) var2.a((byte) -104);
        }
        int var3 = 125 % ((-51 - param0) / 39);
        return null;
    }

    final int e(int param0) {
        int var5 = 0;
        int var6 = Pixelate.field_H ? 1 : 0;
        int var2 = 0;
        if (param0 < 31) {
            field_H = null;
        }
        nm var3 = new nm(((ch) this).field_F);
        ng var4 = (ng) (Object) var3.d(0);
        while (var4 != null) {
            var5 = var4.e(58);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (ng) (Object) var3.a((byte) -104);
        }
        return var2;
    }

    private final void j(int param0) {
        int var4 = Pixelate.field_H ? 1 : 0;
        nm var2 = new nm(((ch) this).field_F);
        ng var3 = (ng) (Object) var2.d(param0 ^ param0);
        while (var3 != null) {
            var3.c((byte) 51);
            var3 = (ng) (Object) var2.a((byte) -104);
        }
    }

    final static void a(boolean param0, String param1, int param2, int param3, tf[] param4, int param5, int param6, int param7, tf[] param8, boolean param9, jl param10, int param11, byte param12, int param13, int param14) {
        qm.a(param13, nl.field_c, param2, param11, new sb(param4), ao.field_d, v.field_d, mh.field_a, new sb(param8), param6, param11, param10, param7, param6, param10, param14, mj.field_k, 108, hd.field_n, param5);
        int var15 = 75 % ((param12 - -21) / 34);
        uh.a(param0, param9, param1, 0, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Tips";
        field_G = "Exploiting a bug";
    }
}
