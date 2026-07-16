/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class og extends qm implements he {
    static sj field_x;
    static String field_u;
    wb field_v;
    static Random field_w;
    static String field_y;

    final boolean a(byte param0, qm param1) {
        tm var5 = null;
        qm var6 = null;
        int var7 = CrazyCrystals.field_B;
        if (((og) this).field_v.b(-16497)) {
            return false;
        }
        tm var3 = new tm(((og) this).field_v);
        if (param0 >= -50) {
            return true;
        }
        qm var4 = (qm) (Object) var3.d(100);
        while (var4 != null) {
            if (!(!var4.e(-126))) {
                var5 = new tm(((og) this).field_v);
                jb discarded$0 = var5.a((jb) (Object) var4, 200);
                var6 = (qm) (Object) var5.c(-43);
                while (var6 != null) {
                    if (!(!var6.a(true, param1))) {
                        return true;
                    }
                    var6 = (qm) (Object) var5.c(-90);
                }
            }
            var4 = (qm) (Object) var3.c(124);
        }
        return false;
    }

    qm b(boolean param0) {
        tm var2 = null;
        qm var3 = null;
        int var4 = 0;
        L0: {
          var4 = CrazyCrystals.field_B;
          if (!param0) {
            break L0;
          } else {
            field_u = null;
            break L0;
          }
        }
        var2 = new tm(((og) this).field_v);
        var3 = (qm) (Object) var2.a((byte) 83);
        L1: while (true) {
          if (var3 != null) {
            if (var3.e(-114)) {
              return var3;
            } else {
              var3 = (qm) (Object) var2.b(108);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final boolean a(qm param0, int param1) {
        tm var5 = null;
        qm var6 = null;
        int var7 = CrazyCrystals.field_B;
        if (((og) this).field_v.b(-16497)) {
            return false;
        }
        tm var9 = new tm(((og) this).field_v);
        qm var4 = (qm) (Object) var9.a((byte) 120);
        if (param1 != -25911) {
            Object var8 = null;
            boolean discarded$0 = ((og) this).a(60, 5, (qm) null, 34, 14, 16, -17);
        }
        while (var4 != null) {
            if (var4.e(param1 + 25789)) {
                var5 = new tm(((og) this).field_v);
                jb discarded$1 = var5.a((byte) 58, (jb) (Object) var4);
                var6 = (qm) (Object) var5.b(param1 ^ -25952);
                while (var6 != null) {
                    if (!(!var6.a(true, param0))) {
                        return true;
                    }
                    var6 = (qm) (Object) var5.b(118);
                }
            }
            var4 = (qm) (Object) var9.b(param1 ^ 25974);
        }
        return false;
    }

    boolean a(int param0, int param1, qm param2, char param3) {
        int var6 = 0;
        int var7 = 0;
        qm var8 = null;
        tm var9 = null;
        boolean stackIn_14_0 = false;
        boolean stackOut_13_0 = false;
        boolean stackOut_12_0 = false;
        L0: {
          var7 = CrazyCrystals.field_B;
          if (param1 == 19279) {
            break L0;
          } else {
            field_y = null;
            break L0;
          }
        }
        var9 = new tm(((og) this).field_v);
        var8 = (qm) (Object) var9.a((byte) 32);
        L1: while (true) {
          L2: {
            if (var8 == null) {
              break L2;
            } else {
              if (!var8.b(-72)) {
                break L2;
              } else {
                L3: {
                  if (!var8.e(-123)) {
                    break L3;
                  } else {
                    if (var8.a(param0, param1 + 0, param2, param3)) {
                      return true;
                    } else {
                      break L3;
                    }
                  }
                }
                var8 = (qm) (Object) var9.b(106);
                continue L1;
              }
            }
          }
          var6 = param0;
          if (80 != var6) {
            return false;
          } else {
            L4: {
              if (cp.field_k[81]) {
                stackOut_13_0 = ((og) this).a((byte) -57, param2);
                stackIn_14_0 = stackOut_13_0;
                break L4;
              } else {
                stackOut_12_0 = ((og) this).a(param2, -25911);
                stackIn_14_0 = stackOut_12_0;
                break L4;
              }
            }
            return stackIn_14_0;
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (!(fl.field_a != null)) {
            return -1;
        }
        if (pa.field_F <= param2) {
            if (pa.field_F + fl.field_a.field_l > param2) {
                if (kb.field_a <= param1) {
                    if (!(fl.field_a.field_u + kb.field_a <= param1)) {
                        return 0;
                    }
                }
            }
        }
        if (param0 != 0) {
            og.h(124);
        }
        if (md.field_q <= param2) {
            if (md.field_q + fl.field_a.field_l > param2) {
                if (param1 >= gf.field_a) {
                    if (!(gf.field_a + fl.field_a.field_u <= param1)) {
                        return 1;
                    }
                }
            }
        }
        return -1;
    }

    final void b(byte param0) {
        int var4 = CrazyCrystals.field_B;
        tm var2 = new tm(((og) this).field_v);
        qm var3 = (qm) (Object) var2.a((byte) 88);
        while (var3 != null) {
            var3.b((byte) -93);
            var3 = (qm) (Object) var2.b(-34);
        }
        if (param0 >= -84) {
            field_y = null;
        }
    }

    final String a(byte param0) {
        tm var2 = null;
        qm var3 = null;
        String var4 = null;
        int var5 = 0;
        var5 = CrazyCrystals.field_B;
        var2 = new tm(((og) this).field_v);
        var3 = (qm) (Object) var2.a((byte) 112);
        if (param0 < -23) {
          L0: while (true) {
            if (var3 != null) {
              var4 = var3.a((byte) -110);
              if (var4 != null) {
                return var4;
              } else {
                var3 = (qm) (Object) var2.b(-2);
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

    private final void d(byte param0) {
        int var4 = CrazyCrystals.field_B;
        if (param0 <= 31) {
            field_w = null;
        }
        tm var2 = new tm(((og) this).field_v);
        qm var3 = (qm) (Object) var2.a((byte) 63);
        while (var3 != null) {
            var3.f(-102);
            var3 = (qm) (Object) var2.b(-81);
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = CrazyCrystals.field_B;
        if (0 == param3) {
            if (!(null == ((og) this).field_i)) {
                ((og) this).field_i.a(param0, false, param2, (qm) this, true);
            }
        }
        tm var5 = new tm(((og) this).field_v);
        if (param1 > -12) {
            return;
        }
        qm var6 = (qm) (Object) var5.d(9);
        while (var6 != null) {
            var6.a(param0 + ((og) this).field_j, (byte) -69, param2 - -((og) this).field_r, param3);
            var6 = (qm) (Object) var5.c(-31);
        }
    }

    final boolean e(int param0) {
        if (param0 >= -107) {
            ((og) this).a(-54, -99, 76, -102, (byte) -121);
        }
        return ((og) this).b(false) != null ? true : false;
    }

    final void b(qm param0, int param1) {
        int var3 = -34 % ((-70 - param1) / 41);
        ((og) this).field_v.b(0, (jb) (Object) param0);
    }

    void a(qm param0, int param1, int param2, int param3) {
        tm var5 = null;
        qm var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = CrazyCrystals.field_B;
        super.a(param0, 11, param2, param3);
        var5 = new tm(((og) this).field_v);
        var7 = -15 % ((param1 - -50) / 59);
        var6 = (qm) (Object) var5.a((byte) 32);
        L0: while (true) {
          L1: {
            if (var6 == null) {
              break L1;
            } else {
              if (!var6.b(120)) {
                break L1;
              } else {
                var6.a(param0, -124, ((og) this).field_j + param2, param3 + ((og) this).field_r);
                var6 = (qm) (Object) var5.b(-118);
                continue L0;
              }
            }
          }
          return;
        }
    }

    private final void a(int param0, Hashtable param1, byte param2, StringBuilder param3) {
        int var7 = 0;
        int var8 = CrazyCrystals.field_B;
        tm var5 = new tm(((og) this).field_v);
        qm var6 = (qm) (Object) var5.a(param2);
        while (var6 != null) {
            StringBuilder discarded$0 = param3.append(10);
            for (var7 = 0; param0 >= var7; var7++) {
                StringBuilder discarded$1 = param3.append(32);
            }
            StringBuilder discarded$2 = var6.a(1 + param0, param2 ^ -34, param1, param3);
            var6 = (qm) (Object) var5.b(103);
        }
    }

    final boolean a(boolean param0, qm param1) {
        int var5 = CrazyCrystals.field_B;
        tm var3 = new tm(((og) this).field_v);
        qm var4 = (qm) (Object) var3.a((byte) 34);
        if (!param0) {
            field_x = null;
        }
        while (var4 != null) {
            if (var4.a(true, param1)) {
                return true;
            }
            var4 = (qm) (Object) var3.b(-13);
        }
        return false;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        super.a(param0, param1, param2, param3, param4);
        this.d((byte) 56);
    }

    og(int param0, int param1, int param2, int param3, wo param4) {
        super(param0, param1, param2, param3, param4, (bi) null);
        ((og) this).field_v = new wb();
    }

    final void a(int param0, int param1, int param2, int param3, qm param4, int param5) {
        tm var7 = null;
        qm var8 = null;
        int var9 = 0;
        var9 = CrazyCrystals.field_B;
        var7 = new tm(((og) this).field_v);
        var8 = (qm) (Object) var7.a((byte) 89);
        if (param5 == 0) {
          L0: while (true) {
            L1: {
              if (var8 == null) {
                break L1;
              } else {
                if (!var8.b(-94)) {
                  break L1;
                } else {
                  var8.a(param0, param1 - -((og) this).field_j, ((og) this).field_r + param2, param3, param4, 0);
                  var8 = (qm) (Object) var7.b(param5 ^ 3);
                  continue L0;
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(int param0, int param1, qm param2, boolean param3, int param4, int param5, int param6) {
        tm var8 = null;
        qm var9 = null;
        int var10 = 0;
        L0: {
          var10 = CrazyCrystals.field_B;
          if (!param3) {
            break L0;
          } else {
            field_y = null;
            break L0;
          }
        }
        var8 = new tm(((og) this).field_v);
        var9 = (qm) (Object) var8.a((byte) 72);
        L1: while (true) {
          L2: {
            if (var9 == null) {
              break L2;
            } else {
              if (!var9.b(110)) {
                break L2;
              } else {
                if (var9.a(((og) this).field_r + param0, param1, param2, param3, param4 + ((og) this).field_j, param5, param6)) {
                  return true;
                } else {
                  var9 = (qm) (Object) var8.b(-22);
                  continue L1;
                }
              }
            }
          }
          return false;
        }
    }

    final boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        tm var8 = null;
        qm var9 = null;
        int var10 = 0;
        var10 = CrazyCrystals.field_B;
        var8 = new tm(((og) this).field_v);
        if (param0 == 1) {
          var9 = (qm) (Object) var8.a((byte) 112);
          L0: while (true) {
            L1: {
              if (var9 == null) {
                break L1;
              } else {
                if (!var9.b(param0 + -62)) {
                  break L1;
                } else {
                  L2: {
                    if (!var9.e(param0 ^ -128)) {
                      break L2;
                    } else {
                      if (!var9.a(1, param1, param2, param3, param4, param5, param6)) {
                        break L2;
                      } else {
                        return true;
                      }
                    }
                  }
                  var9 = (qm) (Object) var8.b(-103);
                  continue L0;
                }
              }
            }
            return false;
          }
        } else {
          return false;
        }
    }

    final StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        if (!(!((og) this).a(0, param0, param3, param2))) {
            ((og) this).a(param0, (byte) 126, param3, param2);
            this.a(param0, param2, (byte) 81, param3);
        }
        if (param1 >= -85) {
            field_y = null;
        }
        return param3;
    }

    public static void h(int param0) {
        field_u = null;
        field_w = null;
        field_y = null;
        field_x = null;
        if (param0 != 697) {
            field_y = null;
        }
    }

    final int c(byte param0) {
        int var5 = 0;
        int var6 = CrazyCrystals.field_B;
        int var2 = 0;
        tm var3 = new tm(((og) this).field_v);
        if (param0 <= 30) {
            ((og) this).field_v = null;
        }
        qm var4 = (qm) (Object) var3.a((byte) 80);
        while (var4 != null) {
            var5 = var4.c((byte) 76);
            if (var5 > var2) {
                var2 = var5;
            }
            var4 = (qm) (Object) var3.b(-46);
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new sj(1, 2, 2, 0);
        field_u = "All Balls";
        field_w = new Random();
        field_y = "All Bombs";
    }
}
