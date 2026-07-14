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
            return null;
        }
        var4.field_l = param2;
        var4.field_h = new int[param3];
        ke.field_B.a((am) (Object) var4, 103);
        km.a(var4, param0 + -19874, param1);
        return var4;
    }

    final static boolean b(byte param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
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
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                }
              }
            }
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
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
            ei.field_q.a((am) (Object) var3, 87);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 > -68) {
            Object var2 = null;
            cm.a((oc) null, false);
        }
    }

    final static void a(oc param0, boolean param1) {
        int var2 = 0;
        qm var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          if (!param1) {
            break L0;
          } else {
            var5 = null;
            cm.a((oc) null, true);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= dk.field_o) {
            return;
          } else {
            var3 = vj.field_w[var2];
            if (var3 != null) {
              if (-146 >= (var3.field_i ^ -1)) {
                if (var3.field_i <= 150) {
                  if ((ih.a(var3.field_j, (byte) -103, param0) ^ -1) > -4) {
                    vj.field_w[var2] = null;
                    return;
                  } else {
                    var2++;
                    continue L1;
                  }
                } else {
                  var2++;
                  continue L1;
                }
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
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
