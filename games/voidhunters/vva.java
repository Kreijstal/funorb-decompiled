/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vva extends bob {
    static llb field_r;
    private int field_s;
    private int field_p;
    static byte[] field_u;
    private int field_t;
    private phb[] field_q;

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              var7 = 112 / ((param0 - -27) / 35);
              if (!param1.field_e) {
                if (param1.e((byte) -120)) {
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
              if (param1 instanceof htb) {
                param4 = param4 & ((htb) (Object) param1).field_x;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!param4) {
                stackOut_13_0 = ((vva) this).field_p;
                stackIn_14_0 = stackOut_13_0;
                break L3;
              } else {
                if (var6_int != 0) {
                  stackOut_12_0 = ((vva) this).field_t;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = ((vva) this).field_s;
                  stackIn_14_0 = stackOut_11_0;
                  break L3;
                }
              }
            }
            L4: {
              var8 = stackIn_14_0;
              qt.a(((vva) this).field_q, var8, param1.field_r + (param3 - -(-((vva) this).field_q[0].field_n + param1.field_f >> 1)), param1.field_h, param2 - -param1.field_g, true);
              if (!param4) {
                stackOut_16_0 = 7105644;
                stackIn_17_0 = stackOut_16_0;
                break L4;
              } else {
                stackOut_15_0 = 16777215;
                stackIn_17_0 = stackOut_15_0;
                break L4;
              }
            }
            var9 = stackIn_17_0;
            int discarded$1 = ((vva) this).field_d.a(param1.field_j, param2 - -param1.field_g, param1.field_r + param3 - 2, param1.field_h, param1.field_f, var9, -1, 1, 1, ((vva) this).field_d.field_k);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var6;
            stackOut_19_1 = new StringBuilder().append("vva.A(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public vva() {
        this(2188450, 2591221, 9543);
    }

    public static void a() {
        field_r = null;
        field_u = null;
    }

    private vva(int param0, int param1, int param2) {
        ((vva) this).field_s = param0;
        ((vva) this).field_q = eia.field_o;
        ((vva) this).field_p = param2;
        ((vva) this).field_d = vob.field_r;
        ((vva) this).field_t = param1;
    }

    static {
    }
}
