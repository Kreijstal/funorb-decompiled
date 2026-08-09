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
        ij var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = EscapeVector.field_A;
        try {
          L0: {
            var4 = (ik) ((Object) vj.field_d.a(false));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param1 == 105) {
                    break L2;
                  } else {
                    field_q = -25L;
                    break L2;
                  }
                }
                var5 = (ij) ((Object) qd.field_n.a(false));
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    aj.a(42, param0, var5);
                    var5 = (ij) ((Object) qd.field_n.b((byte) 70));
                    continue L3;
                  }
                }
              } else {
                ig.a(param1 + -209, param0, var4);
                var4 = (ik) ((Object) vj.field_d.b((byte) 70));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "ck.K(" + param0 + ',' + param1 + ')');
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
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              if (!param3.field_u) {
                if (param3.h(0)) {
                  stackIn_6_0 = 1;
                  break L1;
                } else {
                  stackIn_6_0 = 0;
                  break L1;
                }
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (!(param3 instanceof hc)) {
                break L2;
              } else {
                param4 = param4 & ((hc) ((Object) param3)).field_y;
                break L2;
              }
            }
            L3: {
              if (!param4) {
                stackIn_13_0 = this.field_z;
                break L3;
              } else {
                if (var6_int != 0) {
                  stackIn_13_0 = this.field_w;
                  break L3;
                } else {
                  stackIn_13_0 = this.field_y;
                  break L3;
                }
              }
            }
            L4: {
              var7 = stackIn_13_0;
              if (!param4) {
                stackIn_16_0 = 7105644;
                break L4;
              } else {
                stackIn_16_0 = 16777215;
                break L4;
              }
            }
            L5: {
              var8 = stackIn_16_0;
              if (param2 < -14) {
                break L5;
              } else {
                this.field_w = -93;
                break L5;
              }
            }
            qe.a(-100, param3.field_j + (param1 + (-this.field_s[0].field_z + param3.field_x >> -1157166431)), param3.field_g, this.field_s, var7, param0 + param3.field_k);
            this.field_l.a(param3.field_l, param0 + param3.field_k, param3.field_j + param1 + -2, param3.field_g, param3.field_x, var8, -1, 1, 1, this.field_l.field_r);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var6);

            stackIn_22_1 = new StringBuilder().append("ck.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param4 + ')');
        }
    }

    public ck() {
        this(2188450, 2591221, 9543);
    }

    private ck(int param0, int param1, int param2) {
        this.field_z = param2;
        this.field_w = param1;
        this.field_s = fk.field_f;
        this.field_l = dl.field_b;
        this.field_y = param0;
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
        field_A = new fc();
        field_t = new hf();
        field_u = new String[]{"Anti-gravity", "Breach", "Cataclysm", "Dash", "Deep Vertigo", "Divided", "Explosive Exit", "Gravity Chamber", "Mine Field", "Orb", "Pinball", "Pulse", "Slanted Mines", "Upwards and Onwards", "Asteroids Normal", "Asteroids"};
        field_v = new ag();
    }
}
