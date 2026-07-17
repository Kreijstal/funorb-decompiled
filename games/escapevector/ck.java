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
        RuntimeException var2 = null;
        int var3 = 0;
        ik var4 = null;
        ij var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = EscapeVector.field_A;
        try {
          L0: {
            var4 = (ik) (Object) vj.field_d.a(false);
            L1: while (true) {
              if (var4 == null) {
                var5 = (ij) (Object) qd.field_n.a(false);
                L2: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    aj.a(42, param0, var5);
                    var5 = (ij) (Object) qd.field_n.b((byte) 70);
                    continue L2;
                  }
                }
              } else {
                ig.a(-104, param0, var4);
                var4 = (ik) (Object) vj.field_d.b((byte) 70);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "ck.K(" + param0 + 44 + 105 + 41);
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
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (!param3.field_u) {
                if (param3.h(0)) {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 1;
                stackIn_6_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (!(param3 instanceof hc)) {
                break L2;
              } else {
                param4 = param4 & ((hc) (Object) param3).field_y;
                break L2;
              }
            }
            L3: {
              if (!param4) {
                stackOut_12_0 = ((ck) this).field_z;
                stackIn_13_0 = stackOut_12_0;
                break L3;
              } else {
                if (var6_int != 0) {
                  stackOut_11_0 = ((ck) this).field_w;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = ((ck) this).field_y;
                  stackIn_13_0 = stackOut_10_0;
                  break L3;
                }
              }
            }
            L4: {
              var7 = stackIn_13_0;
              if (!param4) {
                stackOut_15_0 = 7105644;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              } else {
                stackOut_14_0 = 16777215;
                stackIn_16_0 = stackOut_14_0;
                break L4;
              }
            }
            L5: {
              var8 = stackIn_16_0;
              if (param2 < -14) {
                break L5;
              } else {
                ((ck) this).field_w = -93;
                break L5;
              }
            }
            qe.a(-100, param3.field_j + (param1 + (-((ck) this).field_s[0].field_z + param3.field_x >> 1)), param3.field_g, ((ck) this).field_s, var7, param0 + param3.field_k);
            int discarded$1 = ((ck) this).field_l.a(param3.field_l, param0 + param3.field_k, param3.field_j + param1 + -2, param3.field_g, param3.field_x, var8, -1, 1, 1, ((ck) this).field_l.field_r);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("ck.M(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param4 + 41);
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
