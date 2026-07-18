/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends bc {
    private int field_x;
    static String field_A;
    static int[] field_u;
    static String field_w;
    static int[] field_s;
    private int field_B;
    static lj field_y;
    private ka[] field_t;
    static boolean field_z;
    private int field_v;

    public static void c(byte param0) {
        field_w = null;
        field_A = null;
        field_y = null;
        int var1 = 74 / (param0 / 57);
        field_s = null;
        field_u = null;
    }

    public cl() {
        this(2188450, 2591221, 9543);
    }

    final static void b(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        e var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              bh.field_o.h();
              re.field_B.h();
              qb.field_b = qb.field_b - 1;
              var1_int = 0;
              if (qb.field_b != 0) {
                break L1;
              } else {
                qb.field_b = 200;
                var2 = (e) (Object) tj.field_e.c((byte) 112);
                L2: while (true) {
                  if (var2 == null) {
                    if (TorChallenge.field_I == null) {
                      break L1;
                    } else {
                      var2 = (e) (Object) TorChallenge.field_I.c((byte) -118);
                      L3: while (true) {
                        if (var2 == null) {
                          break L1;
                        } else {
                          L4: {
                            if (!var2.field_k.b(11163)) {
                              var2.a(true);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var2 = (e) (Object) TorChallenge.field_I.c(-270);
                          continue L3;
                        }
                      }
                    }
                  } else {
                    L5: {
                      if (var2.field_k.b(11163)) {
                        break L5;
                      } else {
                        var2.a(true);
                        break L5;
                      }
                    }
                    var2 = (e) (Object) tj.field_e.c(-270);
                    continue L2;
                  }
                }
              }
            }
            L6: {
              if (la.field_a == null) {
                break L6;
              } else {
                if (la.field_a.d(0)) {
                  break L6;
                } else {
                  tg.field_t = null;
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "cl.M(" + -117 + ')');
        }
    }

    public final void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (!param0.field_w) {
                if (param0.c(param3 ^ 1)) {
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
              if (param0 instanceof ng) {
                param4 = param4 & ((ng) (Object) param0).field_F;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!param4) {
                stackOut_13_0 = ((cl) this).field_B;
                stackIn_14_0 = stackOut_13_0;
                break L3;
              } else {
                if (var6_int == 0) {
                  stackOut_12_0 = ((cl) this).field_v;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = ((cl) this).field_x;
                  stackIn_14_0 = stackOut_11_0;
                  break L3;
                }
              }
            }
            L4: {
              var7 = stackIn_14_0;
              uk.a(var7, param3 ^ 96, param0.field_m + param2, (param0.field_l + -((cl) this).field_t[0].field_v >> 1) + param0.field_i + param1, param0.field_p, ((cl) this).field_t);
              if (param3 == 97) {
                break L4;
              } else {
                cl.c((byte) 98);
                break L4;
              }
            }
            L5: {
              if (!param4) {
                stackOut_18_0 = 7105644;
                stackIn_19_0 = stackOut_18_0;
                break L5;
              } else {
                stackOut_17_0 = 16777215;
                stackIn_19_0 = stackOut_17_0;
                break L5;
              }
            }
            var8 = stackIn_19_0;
            int discarded$1 = ((cl) this).field_g.a(param0.field_v, param2 - -param0.field_m, param1 + (param0.field_i - 2), param0.field_p, param0.field_l, var8, -1, 1, 1, ((cl) this).field_g.field_x);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("cl.A(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private cl(int param0, int param1, int param2) {
        ((cl) this).field_t = ae.field_v;
        ((cl) this).field_x = param1;
        ((cl) this).field_B = param2;
        ((cl) this).field_v = param0;
        ((cl) this).field_g = dl.field_H;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new int[]{20, 40, 40, 20, 40};
        field_w = "End Game";
        field_s = new int[]{10, 10, 10};
        field_A = "You have 1 unread message!";
    }
}
