/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class g extends lk implements u {
    static String field_B;
    static kc[] field_C;
    static int[][] field_y;
    bk field_z;
    static int field_A;

    void a(int param0, int param1, int param2, int param3) {
        int var7 = Main.field_T;
        if ((param3 ^ -1) == param2) {
            if (null != ((g) this).field_v) {
                ((g) this).field_v.a(param0, (lk) this, 11447, param1, true);
            }
        }
        qd var5 = new qd(((g) this).field_z);
        lk var6 = (lk) (Object) var5.c((byte) -13);
        while (var6 != null) {
            var6.a(param0 - -((g) this).field_o, ((g) this).field_i + param1, -1, param3);
            var6 = (lk) (Object) var5.a((byte) 101);
        }
    }

    final static void k(int param0) {
        if (!(eh.d(19314))) {
            return;
        }
        sc.a(param0, (byte) 122, false);
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4) {
        super.a(param0, param1, param2, param3, param4);
        this.h(1);
    }

    lk i(int param0) {
        qd var2 = null;
        lk var3 = null;
        int var4 = 0;
        L0: {
          var4 = Main.field_T;
          var2 = new qd(((g) this).field_z);
          if (param0 == -1) {
            break L0;
          } else {
            ((g) this).field_z = null;
            break L0;
          }
        }
        var3 = (lk) (Object) var2.b((byte) -33);
        L1: while (true) {
          if (var3 != null) {
            if (var3.d(param0 ^ -122)) {
              return var3;
            } else {
              var3 = (lk) (Object) var2.a(28869);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void b(lk param0, byte param1) {
        ((g) this).field_z.a((qb) (Object) param0, param1 ^ 27284);
        if (param1 != 118) {
            field_y = null;
        }
    }

    final boolean d(int param0) {
        if (param0 < 44) {
            field_C = null;
        }
        return null != ((g) this).i(-1) ? true : false;
    }

    void a(int param0, int param1, lk param2, int param3) {
        qd var5 = null;
        lk var6 = null;
        int var7 = 0;
        L0: {
          var7 = Main.field_T;
          super.a(param0, param1, param2, param3 ^ 0);
          var5 = new qd(((g) this).field_z);
          if (param3 == 3) {
            break L0;
          } else {
            int discarded$2 = ((g) this).f(-85);
            break L0;
          }
        }
        var6 = (lk) (Object) var5.b((byte) -33);
        L1: while (true) {
          L2: {
            if (var6 == null) {
              break L2;
            } else {
              if (!var6.b(55)) {
                break L2;
              } else {
                var6.a(((g) this).field_i + param0, param1 + ((g) this).field_o, param2, param3 + 0);
                var6 = (lk) (Object) var5.a(28869);
                continue L1;
              }
            }
          }
          return;
        }
    }

    final boolean a(int param0, lk param1) {
        int var5 = Main.field_T;
        qd var3 = new qd(((g) this).field_z);
        if (param0 <= 71) {
            ((g) this).field_z = null;
        }
        lk var4 = (lk) (Object) var3.b((byte) -33);
        while (var4 != null) {
            if (!(!var4.a(90, param1))) {
                return true;
            }
            var4 = (lk) (Object) var3.a(28869);
        }
        return false;
    }

    public static void b(boolean param0) {
        field_C = null;
        field_y = null;
        field_B = null;
        if (!param0) {
            g.b(true);
        }
    }

    private final void h(int param0) {
        int var4 = Main.field_T;
        qd var2 = new qd(((g) this).field_z);
        if (param0 != 1) {
            ((g) this).a(43, -101, -28, -27, false);
        }
        lk var3 = (lk) (Object) var2.b((byte) -33);
        while (var3 != null) {
            var3.g(param0 ^ 26946);
            var3 = (lk) (Object) var2.a(param0 ^ 28868);
        }
    }

    private final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        int var7 = 0;
        int var8 = Main.field_T;
        qd var5 = new qd(((g) this).field_z);
        if (param1 >= -46) {
            int discarded$0 = ((g) this).f(-89);
        }
        lk var6 = (lk) (Object) var5.b((byte) -33);
        while (var6 != null) {
            StringBuilder discarded$1 = param2.append(10);
            for (var7 = 0; param3 >= var7; var7++) {
                StringBuilder discarded$2 = param2.append(32);
            }
            StringBuilder discarded$3 = var6.a(param0, false, 1 + param3, param2);
            var6 = (lk) (Object) var5.a(28869);
        }
    }

    final void a(boolean param0, lk param1, int param2, int param3, int param4, int param5) {
        qd var7 = null;
        lk var8 = null;
        int var9 = 0;
        L0: {
          var9 = Main.field_T;
          var7 = new qd(((g) this).field_z);
          if (!param0) {
            break L0;
          } else {
            ((g) this).field_z = null;
            break L0;
          }
        }
        var8 = (lk) (Object) var7.b((byte) -33);
        L1: while (true) {
          L2: {
            if (var8 == null) {
              break L2;
            } else {
              if (!var8.b(-100)) {
                break L2;
              } else {
                var8.a(param0, param1, param2, ((g) this).field_o + param3, ((g) this).field_i + param4, param5);
                var8 = (lk) (Object) var7.a(28869);
                continue L1;
              }
            }
          }
          return;
        }
    }

    final boolean a(lk param0, byte param1) {
        qd var5 = null;
        lk var6 = null;
        int var7 = Main.field_T;
        if (!(!((g) this).field_z.a(2220))) {
            return false;
        }
        if (param1 != -28) {
            field_y = null;
        }
        qd var8 = new qd(((g) this).field_z);
        lk var4 = (lk) (Object) var8.b((byte) -33);
        while (var4 != null) {
            if (!(!var4.d(param1 + 142))) {
                var5 = new qd(((g) this).field_z);
                qb discarded$0 = var5.a(25755, (qb) (Object) var4);
                var6 = (lk) (Object) var5.a(28869);
                while (var6 != null) {
                    if (!(!var6.a(89, param0))) {
                        return true;
                    }
                    var6 = (lk) (Object) var5.a(28869);
                }
            }
            var4 = (lk) (Object) var8.a(28869);
        }
        return false;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, lk param6) {
        qd var8 = null;
        lk var9 = null;
        int var10 = 0;
        L0: {
          var10 = Main.field_T;
          if (param5 == -1) {
            break L0;
          } else {
            field_A = 26;
            break L0;
          }
        }
        var8 = new qd(((g) this).field_z);
        var9 = (lk) (Object) var8.b((byte) -33);
        L1: while (true) {
          L2: {
            if (var9 == null) {
              break L2;
            } else {
              if (!var9.b(103)) {
                break L2;
              } else {
                L3: {
                  if (!var9.d(param5 + 70)) {
                    break L3;
                  } else {
                    if (!var9.a(param0, param1, param2, param3, param4, param5 ^ 0, param6)) {
                      break L3;
                    } else {
                      return true;
                    }
                  }
                }
                var9 = (lk) (Object) var8.a(param5 ^ -28870);
                continue L1;
              }
            }
          }
          return false;
        }
    }

    final boolean b(int param0, lk param1) {
        qd var5_ref_qd = null;
        lk var6 = null;
        int var7 = Main.field_T;
        if (((g) this).field_z.a(2220)) {
            return false;
        }
        qd var3 = new qd(((g) this).field_z);
        lk var4 = (lk) (Object) var3.c((byte) -13);
        while (var4 != null) {
            if (var4.d(72)) {
                var5_ref_qd = new qd(((g) this).field_z);
                qb discarded$0 = var5_ref_qd.a((byte) -8, (qb) (Object) var4);
                var6 = (lk) (Object) var5_ref_qd.a((byte) 79);
                while (var6 != null) {
                    if (var6.a(97, param1)) {
                        return true;
                    }
                    var6 = (lk) (Object) var5_ref_qd.a((byte) 99);
                }
            }
            var4 = (lk) (Object) var3.a((byte) 80);
        }
        int var5 = 15 % ((param0 - 29) / 60);
        return false;
    }

    boolean a(char param0, byte param1, int param2, lk param3) {
        qd var5 = null;
        int var6 = 0;
        int var7 = 0;
        lk var8 = null;
        boolean stackIn_14_0 = false;
        boolean stackOut_13_0 = false;
        boolean stackOut_12_0 = false;
        var7 = Main.field_T;
        if (param1 <= -99) {
          var5 = new qd(((g) this).field_z);
          var8 = (lk) (Object) var5.b((byte) -33);
          L0: while (true) {
            L1: {
              if (var8 == null) {
                break L1;
              } else {
                if (!var8.b(111)) {
                  break L1;
                } else {
                  L2: {
                    if (!var8.d(109)) {
                      break L2;
                    } else {
                      if (!var8.a(param0, (byte) -123, param2, param3)) {
                        break L2;
                      } else {
                        return true;
                      }
                    }
                  }
                  var8 = (lk) (Object) var5.a(28869);
                  continue L0;
                }
              }
            }
            var6 = param2;
            if ((var6 ^ -1) == -81) {
              L3: {
                if (!ge.field_c[81]) {
                  stackOut_13_0 = ((g) this).a(param3, (byte) -28);
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_12_0 = ((g) this).b(-85, param3);
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                }
              }
              return stackIn_14_0;
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final String b(byte param0) {
        qd var2 = null;
        lk var3 = null;
        String var4 = null;
        int var5 = 0;
        var5 = Main.field_T;
        var2 = new qd(((g) this).field_z);
        var3 = (lk) (Object) var2.b((byte) -33);
        if (param0 == -79) {
          L0: while (true) {
            if (var3 != null) {
              var4 = var3.b((byte) -79);
              if (var4 != null) {
                return var4;
              } else {
                var3 = (lk) (Object) var2.a(28869);
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

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param2 == -1) {
          L0: {
            L1: {
              param0 = wk.a('_', 58, param0, "");
              var3 = gi.a(100, param0);
              if ((param1.indexOf(param0) ^ -1) != 0) {
                break L1;
              } else {
                if (param1.indexOf(var3) == -1) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, lk param4, int param5, int param6) {
        lk var9 = null;
        int var10 = 0;
        Object var11 = null;
        qd var12 = null;
        L0: {
          var10 = Main.field_T;
          if (param3 <= -14) {
            break L0;
          } else {
            var11 = null;
            boolean discarded$2 = ((g) this).a(95, -63, -9, 109, -30, 36, (lk) null);
            break L0;
          }
        }
        var12 = new qd(((g) this).field_z);
        var9 = (lk) (Object) var12.b((byte) -33);
        L1: while (true) {
          L2: {
            if (var9 == null) {
              break L2;
            } else {
              if (!var9.b(24)) {
                break L2;
              } else {
                if (!var9.a(((g) this).field_o + param0, ((g) this).field_i + param1, param2, -24, param4, param5, param6)) {
                  var9 = (lk) (Object) var12.a(28869);
                  continue L1;
                } else {
                  return true;
                }
              }
            }
          }
          return false;
        }
    }

    g(int param0, int param1, int param2, int param3, ci param4) {
        super(param0, param1, param2, param3, param4, (pl) null);
        ((g) this).field_z = new bk();
    }

    final StringBuilder a(Hashtable param0, boolean param1, int param2, StringBuilder param3) {
        if (((g) this).a(param3, param2, param1, param0)) {
            ((g) this).a(param0, (byte) -16, param3, param2);
            this.a(param0, -93, param3, param2);
        }
        return param3;
    }

    final static boolean j(int param0) {
        Object var2 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 7) {
            break L0;
          } else {
            var2 = null;
            boolean discarded$2 = g.a((String) null, (String) null, 67);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == cb.field_j) {
              break L2;
            } else {
              if (ra.field_b != ad.field_q) {
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

    final int f(int param0) {
        int var5 = 0;
        int var6 = Main.field_T;
        if (param0 != -1) {
            return -49;
        }
        int var2 = 0;
        qd var3 = new qd(((g) this).field_z);
        lk var4 = (lk) (Object) var3.b((byte) -33);
        while (var4 != null) {
            var5 = var4.f(param0 ^ 0);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (lk) (Object) var3.a(28869);
        }
        return var2;
    }

    final void c(byte param0) {
        int var4 = Main.field_T;
        qd var2 = new qd(((g) this).field_z);
        lk var3 = (lk) (Object) var2.b((byte) -33);
        if (param0 < 27) {
            g.a(-76);
        }
        while (var3 != null) {
            var3.c((byte) 105);
            var3 = (lk) (Object) var2.a(28869);
        }
    }

    final static void a(int param0) {
        int var1 = -50 % ((param0 - 41) / 51);
        if (mf.field_i < 70) {
            wf.a(mf.field_i - -10, -78);
        } else {
            wf.a(80, -114);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Names cannot contain consecutive spaces";
        field_y = new int[][]{new int[7], new int[8]};
    }
}
