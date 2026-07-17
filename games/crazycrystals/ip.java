/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ip implements wo {
    static String field_b;
    private int field_c;
    private int field_a;
    private vc field_f;
    private int field_h;
    private int field_e;
    private int field_g;
    private int field_d;

    public static void a(byte param0) {
        field_b = null;
    }

    public final void a(int param0, boolean param1, int param2, qm param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        dq var12 = null;
        qm stackIn_4_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        qm stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof dq)) {
                stackOut_3_0 = null;
                stackIn_4_0 = (qm) (Object) stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = (qm) param3;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var12 = (dq) (Object) stackIn_4_0;
            if (!param1) {
              L2: {
                if (var12 == null) {
                  break L2;
                } else {
                  break L2;
                }
              }
              kh.f(param3.field_r + param2, param0 + param3.field_j, param3.field_g, param3.field_f, ((ip) this).field_g);
              var7 = -(2 * var12.field_E) + param3.field_g;
              var8 = param2 - (-param3.field_r + -var12.field_E);
              var9 = param0 + (param3.field_j - -var12.field_J);
              kh.e(var8, var9, var7 + var8, var9, ((ip) this).field_a);
              var10 = var12.e((byte) -49) + -1;
              L3: while (true) {
                if (var10 < 0) {
                  if (((ip) this).field_f == null) {
                    break L0;
                  } else {
                    ((ip) this).field_f.c(var12.field_o, var8 - -(var7 / 2), ((ip) this).field_f.field_y + var9 + var12.field_J, ((ip) this).field_h, ((ip) this).field_e);
                    return;
                  }
                } else {
                  kh.b(var12.a(var10, 6) * var7 / var12.h(-1) + var8, var9, ((ip) this).field_c, ((ip) this).field_d);
                  var10--;
                  continue L3;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("ip.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
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
          throw dn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param4 + 41);
        }
    }

    final static void a(int param0, boolean param1) {
        hl.field_g = 0;
        mb.field_f = h.field_b;
        ue.field_a = 0;
        wn.field_b = 0;
        bc.field_f = new jh(2);
        bc.field_f.a((byte) 41, param1, og.a(param0, bm.field_h, qh.field_i), -1);
    }

    final static void a(int param0, dl[] param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            qc.a(param0, param6, param3, param1, param5, param2, param4);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "ip.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    ip(vc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((ip) this).field_a = param3;
            ((ip) this).field_g = param4;
            ((ip) this).field_f = param0;
            ((ip) this).field_d = param6;
            ((ip) this).field_h = param1;
            ((ip) this).field_c = param5;
            ((ip) this).field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "ip.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Just play";
    }
}
