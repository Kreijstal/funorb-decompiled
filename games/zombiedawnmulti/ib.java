/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib implements nl {
    static int field_b;
    static int field_a;

    final static boolean b(int param0) {
        if (param0 == 23517) {
          if (ki.field_h != null) {
            if (!vo.field_l.a((byte) -90)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ib.a(54);
          if (ki.field_h != null) {
            if (!vo.field_l.a((byte) -90)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public final void a(boolean param0, int param1, int param2, int param3, cf param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ja var8 = null;
        try {
          L0: {
            var6_int = param4.field_y + param3;
            var7 = param4.field_i + param1;
            ng.a(1, var6_int, param4.field_n, var7, param4.field_w);
            if (param2 == -15112) {
              L1: {
                var8 = rj.field_I[1];
                if (!(param4 instanceof gn)) {
                  break L1;
                } else {
                  if (!((gn) ((Object) param4)).field_G) {
                    break L1;
                  } else {
                    var8.e(var6_int - -1 - -(-var8.field_z + param4.field_n >> -1994921183), (param4.field_w + -var8.field_u >> 472537569) + var7 + 1, 256);
                    break L1;
                  }
                }
              }
              if (param4.c(124)) {
                hl.a(2 + var7, 2 + var6_int, (byte) 111, param4.field_n + -4, param4.field_w + -4);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("ib.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 != param0) {
            return qb.field_a[param0];
        }
        if (!iq.a((byte) 98, param2)) {
            return qb.field_a[param0];
        }
        return 29;
    }

    final static void a(int param0) {
        if (-11 == (a.field_b ^ -1)) {
          ji.b(117);
          a.field_b = 11;
          if (param0 <= -37) {
            eb.field_p = true;
            return;
          } else {
            ib.a(74);
            eb.field_p = true;
            return;
          }
        } else {
          if (!re.b(-113)) {
            ji.b(117);
            a.field_b = 11;
            if (param0 > -37) {
              ib.a(74);
              eb.field_p = true;
              return;
            } else {
              eb.field_p = true;
              return;
            }
          } else {
            if (param0 <= -37) {
              eb.field_p = true;
              return;
            } else {
              ib.a(74);
              eb.field_p = true;
              return;
            }
          }
        }
    }

    final static we a(byte param0, jd param1) {
        RuntimeException var2 = null;
        we stackIn_2_0 = null;
        we stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 112) {
              stackIn_4_0 = tf.a(uj.a(param1, 100, 96), (byte) -98);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (we) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("ib.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
    }
}
