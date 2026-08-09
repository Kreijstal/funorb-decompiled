/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    static int[] field_c;
    static volatile int field_b;
    static int[] field_a;

    final static de a(int param0, int param1, int param2, int param3) {
        de var4 = new de();
        if (param0 != 128) {
            return (de) null;
        }
        var4.field_l = param2;
        var4.field_h = new int[param3];
        ke.field_B.a(var4, 103);
        km.a(var4, param0 + -19874, param1);
        return var4;
    }

    final static boolean b(byte param0) {
        int stackIn_9_0 = 0;
        if (param0 == -97) {
          L0: {
            L1: {
              if (-21 < (pb.field_Kb ^ -1)) {
                break L1;
              } else {
                if (!bc.d(-74)) {
                  break L1;
                } else {
                  L2: {
                    if ((ca.field_a ^ -1) >= -1) {
                      break L2;
                    } else {
                      if (wa.b(0)) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackIn_9_0 = 0;
                  break L0;
                }
              }
            }
            stackIn_9_0 = 1;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, int param2) {
        ne var3 = new ne(param0, param2, param1, 0, 0, 0);
        if (!ta.p(3)) {
            if (gn.field_k[param0] <= param2) {
                gn.field_k[param0] = 1 + param2;
            }
            om.a(var3, 5, -119);
        } else {
            ei.field_q.a(var3, 87);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 > -68) {
            oc var2 = (oc) null;
            cm.a((oc) null, false);
        }
    }

    final static void a(oc param0, boolean param1) {
        int var2_int = 0;
        qm var3 = null;
        int var4 = 0;
        oc var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                var5 = (oc) null;
                cm.a((oc) null, true);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (var2_int >= dk.field_o) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L3: {
                  var3 = vj.field_w[var2_int];
                  if (var3 == null) {
                    break L3;
                  } else {
                    if (-146 < (var3.field_i ^ -1)) {
                      break L3;
                    } else {
                      if (var3.field_i > 150) {
                        break L3;
                      } else {
                        if ((ih.a(var3.field_j, (byte) -103, param0) ^ -1) <= -4) {
                          break L3;
                        } else {
                          vj.field_w[var2_int] = null;
                          decompiledRegionSelector0 = 1;
                          break L0;
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
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("cm.E(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_b = -1;
        field_a = new int[128];
    }
}
