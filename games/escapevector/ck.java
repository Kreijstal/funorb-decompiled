/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends k {
    static fc field_A;
    private int field_w;
    private ed[] field_s;
    private int field_z;
    static hf field_t;
    static mf field_x;
    static ag field_v;
    private int field_y;
    static String[] field_u;
    static String field_r;
    static long field_q;

    final static void a(int param0, byte param1) {
        int var3 = 0;
        ik var4 = null;
        Object var5 = null;
        ij var5_ref = null;
        var5 = null;
        var3 = EscapeVector.field_A;
        var4 = (ik) (Object) vj.field_d.a(false);
        L0: while (true) {
          if (var4 == null) {
            if (param1 == 105) {
              var5_ref = (ij) (Object) qd.field_n.a(false);
              L1: while (true) {
                if (var5_ref == null) {
                  return;
                } else {
                  aj.a(42, param0, var5_ref);
                  var5_ref = (ij) (Object) qd.field_n.b((byte) 70);
                  continue L1;
                }
              }
            } else {
              field_q = -25L;
              var5_ref = (ij) (Object) qd.field_n.a(false);
              L2: while (true) {
                if (var5_ref == null) {
                  return;
                } else {
                  aj.a(42, param0, var5_ref);
                  var5_ref = (ij) (Object) qd.field_n.b((byte) 70);
                  continue L2;
                }
              }
            }
          } else {
            ig.a(param1 + -209, param0, var4);
            var4 = (ik) (Object) vj.field_d.b((byte) 70);
            continue L0;
          }
        }
    }

    public static void a(byte param0) {
        field_r = null;
        field_u = null;
        field_v = null;
        field_x = null;
        field_A = null;
        field_t = null;
        if (param0 != -31) {
            ck.a((byte) 116);
        }
    }

    public final void a(int param0, int param1, int param2, hm param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          if (!param3.field_u) {
            if (param3.h(0)) {
              L1: {
                var6 = 1;
                if (!(param3 instanceof hc)) {
                  break L1;
                } else {
                  param4 = param4 & ((hc) (Object) param3).field_y;
                  break L1;
                }
              }
              L2: {
                if (!param4) {
                  stackOut_10_0 = ((ck) this).field_z;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  if (var6 != 0) {
                    stackOut_9_0 = ((ck) this).field_w;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  } else {
                    stackOut_8_0 = ((ck) this).field_y;
                    stackIn_11_0 = stackOut_8_0;
                    break L2;
                  }
                }
              }
              L3: {
                var7 = stackIn_11_0;
                if (!param4) {
                  stackOut_13_0 = 7105644;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_12_0 = 16777215;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                }
              }
              var8 = stackIn_14_0;
              if (param2 >= -14) {
                ((ck) this).field_w = -93;
                qe.a(-100, param3.field_j + (param1 + (-((ck) this).field_s[0].field_z + param3.field_x >> -1157166431)), param3.field_g, ((ck) this).field_s, var7, param0 + param3.field_k);
                int discarded$4 = ((ck) this).field_l.a(param3.field_l, param0 + param3.field_k, param3.field_j + param1 + -2, param3.field_g, param3.field_x, var8, -1, 1, 1, ((ck) this).field_l.field_r);
                return;
              } else {
                qe.a(-100, param3.field_j + (param1 + (-((ck) this).field_s[0].field_z + param3.field_x >> -1157166431)), param3.field_g, ((ck) this).field_s, var7, param0 + param3.field_k);
                int discarded$5 = ((ck) this).field_l.a(param3.field_l, param0 + param3.field_k, param3.field_j + param1 + -2, param3.field_g, param3.field_x, var8, -1, 1, 1, ((ck) this).field_l.field_r);
                return;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_18_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_18_0 = stackOut_1_0;
            break L0;
          }
        }
        L4: {
          var6 = stackIn_18_0;
          if (!(param3 instanceof hc)) {
            break L4;
          } else {
            param4 = param4 & ((hc) (Object) param3).field_y;
            break L4;
          }
        }
        L5: {
          if (!param4) {
            stackOut_24_0 = ((ck) this).field_z;
            stackIn_25_0 = stackOut_24_0;
            break L5;
          } else {
            if (var6 != 0) {
              stackOut_23_0 = ((ck) this).field_w;
              stackIn_25_0 = stackOut_23_0;
              break L5;
            } else {
              stackOut_22_0 = ((ck) this).field_y;
              stackIn_25_0 = stackOut_22_0;
              break L5;
            }
          }
        }
        L6: {
          var7 = stackIn_25_0;
          if (!param4) {
            stackOut_27_0 = 7105644;
            stackIn_28_0 = stackOut_27_0;
            break L6;
          } else {
            stackOut_26_0 = 16777215;
            stackIn_28_0 = stackOut_26_0;
            break L6;
          }
        }
        var8 = stackIn_28_0;
        if (param2 >= -14) {
          ((ck) this).field_w = -93;
          qe.a(-100, param3.field_j + (param1 + (-((ck) this).field_s[0].field_z + param3.field_x >> -1157166431)), param3.field_g, ((ck) this).field_s, var7, param0 + param3.field_k);
          int discarded$6 = ((ck) this).field_l.a(param3.field_l, param0 + param3.field_k, param3.field_j + param1 + -2, param3.field_g, param3.field_x, var8, -1, 1, 1, ((ck) this).field_l.field_r);
          return;
        } else {
          qe.a(-100, param3.field_j + (param1 + (-((ck) this).field_s[0].field_z + param3.field_x >> -1157166431)), param3.field_g, ((ck) this).field_s, var7, param0 + param3.field_k);
          int discarded$7 = ((ck) this).field_l.a(param3.field_l, param0 + param3.field_k, param3.field_j + param1 + -2, param3.field_g, param3.field_x, var8, -1, 1, 1, ((ck) this).field_l.field_r);
          return;
        }
    }

    public ck() {
        this(2188450, 2591221, 9543);
    }

    private ck(int param0, int param1, int param2) {
        ((ck) this).field_z = param2;
        ((ck) this).field_w = param1;
        ((ck) this).field_s = fk.field_f;
        ((ck) this).field_l = dl.field_b;
        ((ck) this).field_y = param0;
    }

    final static void a(int param0, int param1) {
        if (!(bk.field_r == null)) {
            bk.field_r.b(-1, param1);
        }
        if (param0 < 42) {
            field_q = -72L;
            return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new fc();
        field_t = new hf();
        field_u = new String[]{"Anti-gravity", "Breach", "Cataclysm", "Dash", "Deep Vertigo", "Divided", "Explosive Exit", "Gravity Chamber", "Mine Field", "Orb", "Pinball", "Pulse", "Slanted Mines", "Upwards and Onwards", "Asteroids Normal", "Asteroids"};
        field_v = new ag();
    }
}
