/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static int field_a;
    static int field_b;

    final static void a(vh param0, int param1, Object param2) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = Torquing.field_u;
        try {
          L0: {
            if (param0.field_p == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = param1;
              L1: while (true) {
                L2: {
                  if ((var3_int ^ -1) <= -51) {
                    break L2;
                  } else {
                    if (null == param0.field_p.peekEvent()) {
                      break L2;
                    } else {
                      ub.a(param1 + 1976, 1L);
                      var3_int++;
                      continue L1;
                    }
                  }
                }
                try {
                  L3: {
                    L4: {
                      if (param2 != null) {
                        param0.field_p.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    break L3;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("oe.A(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, byte param1) {
        eg.field_u = 1000000000L / (long)param0;
        if (param1 != 44) {
            field_a = -12;
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (param2) {
            return;
        }
        ik var4 = new ik(qo.field_t, bl.field_d);
        ik var3 = var4;
        if (param0) {
            var4.field_l = -var4.field_s[0] + param1 << -1774928158;
            var3.field_p = -2;
        }
        qc.field_Y.a((byte) 54, var3);
    }

    static {
        field_b = 9;
    }
}
