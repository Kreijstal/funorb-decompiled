/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param1 == 0) {
            break L0;
          } else {
            bf.a((byte) -65, -113);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param6 < param0) {
              break L2;
            } else {
              if (param6 >= param0 - -param4) {
                break L2;
              } else {
                if (param2 < param3) {
                  break L2;
                } else {
                  if (param3 + param5 <= param2) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawn.field_J;
        try {
          L0: {
            wk.a(0, qn.field_e, param1, param0 + 35, true, fe.field_O, ub.field_d);
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= qn.field_e) {
                L2: {
                  wk.a(param1, qn.field_e - -param1, param1 + param1, param0 + 35, false, sg.field_pb, me.field_Db);
                  if (param0 == -35) {
                    break L2;
                  } else {
                    boolean discarded$2 = bf.a(112, 74, 60, -121, 40, -69, -113);
                    break L2;
                  }
                }
                L3: {
                  if (qn.field_e <= param1) {
                    break L3;
                  } else {
                    qn.field_e = param1;
                    break L3;
                  }
                }
                break L0;
              } else {
                qd.field_c[param1 + var2_int] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2, "bf.A(" + param0 + 44 + param1 + 41);
        }
    }

    static {
    }
}
