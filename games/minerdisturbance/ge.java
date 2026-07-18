/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge {
    static r field_a;
    static String field_h;
    static bj field_e;
    static int[] field_g;
    static boolean field_c;
    static String field_b;
    static int field_f;
    static String field_d;

    final static void a(int param0, byte param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (!param2) {
                var5 = 0;
                var3_int = var5;
                L2: while (true) {
                  if (var5 >= 25) {
                    break L1;
                  } else {
                    L3: {
                      if (sd.field_c[var5] != param0) {
                        break L3;
                      } else {
                        if (null == gl.field_u[var5]) {
                          break L3;
                        } else {
                          kf.a(gl.field_u[var5], (byte) -111);
                          gl.field_u[var5] = null;
                          return;
                        }
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var3_int = 0;
                L4: while (true) {
                  if (var3_int >= 25) {
                    break L1;
                  } else {
                    L5: {
                      if (rb.field_l[var3_int] != param0) {
                        break L5;
                      } else {
                        if (null != dn.field_t[var3_int]) {
                          kf.a(dn.field_t[var3_int], (byte) -114);
                          dn.field_t[var3_int] = null;
                          return;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var3_int++;
                    continue L4;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var3, "ge.C(" + param0 + ',' + 85 + ',' + param2 + ')');
        }
    }

    public static void a() {
        field_g = null;
        field_d = null;
        field_a = null;
        field_e = null;
        field_b = null;
        field_h = null;
    }

    final static ih a(byte[] param0) {
        ih var2 = null;
        RuntimeException var2_ref = null;
        ih stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ih stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 != null) {
              var2 = new ih(param0, bg.field_d, oc.field_e, qk.field_b, ng.field_e, af.field_p, db.field_b);
              ec.a((byte) -111);
              stackOut_3_0 = (ih) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("ge.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -569 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "<%0> <times> 500 = <%1>";
        field_a = new r();
        field_b = "???";
        field_f = 48;
        field_g = new int[256];
    }
}
