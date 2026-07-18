/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    static int[] field_c;
    static volatile int field_b;
    static int[] field_a;

    final static de a(int param0, int param1, int param2, int param3) {
        de var4 = new de();
        var4.field_l = param2;
        var4.field_h = new int[1];
        ke.field_B.a((am) (Object) var4, 103);
        km.a(var4, -19746, 5);
        return var4;
    }

    final static boolean b(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            if (pb.field_Kb < 20) {
              break L1;
            } else {
              if (!bc.d(-74)) {
                break L1;
              } else {
                L2: {
                  if (ca.field_a <= 0) {
                    break L2;
                  } else {
                    if (wa.b(0)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    final static void a(int param0, int param1, int param2) {
        ne var3 = new ne(param0, param2, 0, 0, 0, 0);
        if (!ta.p(3)) {
            if (gn.field_k[param0] <= param2) {
                gn.field_k[param0] = 1 + param2;
            }
            om.a(var3, 5, -119);
        } else {
            ei.field_q.a((am) (Object) var3, 87);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
    }

    final static void a(oc param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        qm var3 = null;
        int var4 = 0;
        Object var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                var5 = null;
                cm.a((oc) null, true);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (var2_int >= dk.field_o) {
                break L0;
              } else {
                L3: {
                  var3 = vj.field_w[var2_int];
                  if (var3 == null) {
                    break L3;
                  } else {
                    if (var3.field_i < 145) {
                      break L3;
                    } else {
                      if (var3.field_i > 150) {
                        break L3;
                      } else {
                        if (ih.a(var3.field_j, (byte) -103, param0) >= 3) {
                          break L3;
                        } else {
                          vj.field_w[var2_int] = null;
                          return;
                        }
                      }
                    }
                  }
                }
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("cm.E(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_a = new int[128];
    }
}
