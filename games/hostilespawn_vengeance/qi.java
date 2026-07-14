/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends vd implements qk {
    private dg field_F;
    private String field_I;
    static bd field_H;
    private int[] field_M;
    static int field_N;
    private int field_E;
    static String field_G;
    private ph[] field_K;
    private vm field_L;
    static int field_J;

    final static pg[] a(int param0, byte param1, int param2, gb param3) {
        if (rl.a(2884, param3, param0, param2)) {
          if (param1 <= 112) {
            jj discarded$2 = qi.a(true, true);
            return he.c(-123);
          } else {
            return he.c(-123);
          }
        } else {
          return null;
        }
    }

    private final void b(int param0, int param1) {
        ph[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        ph[] var7 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        if (((qi) this).field_E >= param1) {
          return;
        } else {
          var7 = new ph[param1];
          var3 = var7;
          var4 = new int[param1];
          var5 = param0;
          L0: while (true) {
            if (((qi) this).field_E <= var5) {
              ((qi) this).field_K = var3;
              ((qi) this).field_E = param1;
              ((qi) this).field_M = var4;
              return;
            } else {
              var7[var5] = ((qi) this).field_K[var5];
              var4[var5] = ((qi) this).field_M[var5];
              var5++;
              continue L0;
            }
          }
        }
    }

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = HostileSpawn.field_I ? 1 : 0;
        var6 = 87 % ((param4 - -63) / 52);
        var7 = 0;
        L0: while (true) {
          if (((qi) this).field_E > var7) {
            if (((qi) this).field_K[var7] == param3) {
              var8 = ((qi) this).field_M[var7];
              if (var8 != -1) {
                g.a((byte) -125, ((qi) this).field_M[var7]);
                return;
              } else {
                ((qi) this).field_F.g((byte) 103);
                return;
              }
            } else {
              var7++;
              var7++;
              continue L0;
            }
          } else {
            return;
          }
        }
    }

    final ph a(mh param0, String param1, int param2) {
        ph var4 = new ph(param1, param0);
        var4.field_h = (nn) (Object) new ke();
        int var5 = -2 + ((qi) this).field_x;
        ((qi) this).a(((qi) this).field_s, 0, 0, 0, ((qi) this).field_x - -34);
        var4.a(((qi) this).field_s + -14, var5, param2 + -30, 7, param2);
        ((qi) this).a(51448, (ag) (Object) var4);
        return var4;
    }

    final static void b(int param0, byte param1) {
        L0: {
          ga.field_b = param0;
          if (uh.field_l != null) {
            uh.field_l.b((byte) -93, param0);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 >= -80) {
          L1: {
            field_J = -51;
            if (null != ha.field_w) {
              ha.field_w.a(param0, true);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (null != ha.field_w) {
              ha.field_w.a(param0, true);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        Object var6 = null;
        if (param2 < 42) {
          var6 = null;
          pg[] discarded$3 = qi.a(79, (byte) 30, -49, (gb) null);
          super.a(param0, param1, (byte) 80, param3);
          int discarded$4 = ((qi) this).field_L.a(((qi) this).field_I, param1 - (-((qi) this).field_v - 14), ((qi) this).field_m + param0 - -10, ((qi) this).field_s + -28, ((qi) this).field_x, 16777215, -1, 0, 0, ((qi) this).field_L.field_y);
          return;
        } else {
          super.a(param0, param1, (byte) 80, param3);
          int discarded$5 = ((qi) this).field_L.a(((qi) this).field_I, param1 - (-((qi) this).field_v - 14), ((qi) this).field_m + param0 - -10, ((qi) this).field_s + -28, ((qi) this).field_x, 16777215, -1, 0, 0, ((qi) this).field_L.field_y);
          return;
        }
    }

    final static jj a(boolean param0, boolean param1) {
        jj var2 = null;
        jj stackIn_2_0 = null;
        jj stackIn_3_0 = null;
        jj stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        jj stackIn_6_0 = null;
        jj stackIn_7_0 = null;
        jj stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        jj stackOut_5_0 = null;
        jj stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        jj stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        jj stackOut_1_0 = null;
        jj stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        jj stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param1) {
          L0: {
            field_G = null;
            var2 = new jj(true);
            stackOut_5_0 = (jj) var2;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              stackOut_7_0 = (jj) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (jj) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          stackIn_8_0.field_c = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            var2 = new jj(true);
            stackOut_1_0 = (jj) var2;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = (jj) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (jj) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_c = stackIn_4_1 != 0;
          return var2;
        }
    }

    final void a(int param0, int param1, String param2) {
        int var4 = 0;
        var4 = ((qi) this).field_E;
        this.b(0, 1 + var4);
        ((qi) this).field_K[var4] = ((qi) this).a((mh) this, param2, 30);
        ((qi) this).field_M[var4] = param1;
        if (param0 != 22770) {
          qi.j(17);
          return;
        } else {
          return;
        }
    }

    public static void j(int param0) {
        field_G = null;
        field_H = null;
        if (param0 <= 48) {
            qi.j(-55);
        }
    }

    qi(dg param0, vm param1, String param2) {
        super(0, 0, 288, 0, (nn) null);
        ((qi) this).field_E = 0;
        ((qi) this).field_F = param0;
        ((qi) this).field_I = param2;
        ((qi) this).field_L = param1;
        int var4 = null == ((qi) this).field_I ? 0 : ((qi) this).field_L.b(((qi) this).field_I, 260, ((qi) this).field_L.field_y);
        ((qi) this).a(288, 0, 0, 0, 22 + var4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = 0;
        field_J = 0;
    }
}
