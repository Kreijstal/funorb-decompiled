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
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        try {
          L0: {
            L1: {
              var7 = 112 / ((param0 - -27) / 35);
              if (!param1.field_e) {
                if (param1.e((byte) -120)) {
                  stackIn_6_0 = 1;
                  break L1;
                } else {
                  stackIn_6_0 = 0;
                  break L1;
                }
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (param1 instanceof htb) {
                param4 = param4 & ((htb) ((Object) param1)).field_x;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!param4) {
                stackIn_14_0 = this.field_p;
                break L3;
              } else {
                if (var6_int != 0) {
                  stackIn_14_0 = this.field_t;
                  break L3;
                } else {
                  stackIn_14_0 = this.field_s;
                  break L3;
                }
              }
            }
            L4: {
              var8 = stackIn_14_0;
              qt.a(this.field_q, var8, param1.field_r + (param3 - -(-this.field_q[0].field_n + param1.field_f >> -656633055)), param1.field_h, param2 - -param1.field_g, true);
              if (!param4) {
                stackIn_17_0 = 7105644;
                break L4;
              } else {
                stackIn_17_0 = 16777215;
                break L4;
              }
            }
            var9 = stackIn_17_0;
            this.field_d.a(param1.field_j, param2 - -param1.field_g, param1.field_r + param3 - 2, param1.field_h, param1.field_f, var9, -1, 1, 1, this.field_d.field_k);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var6);

            stackIn_21_1 = new StringBuilder().append("vva.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public vva() {
        this(2188450, 2591221, 9543);
    }

    public static void a(byte param0) {
        if (param0 != 121) {
            return;
        }
        field_r = null;
        field_u = null;
    }

    private vva(int param0, int param1, int param2) {
        this.field_s = param0;
        this.field_q = eia.field_o;
        this.field_p = param2;
        this.field_d = vob.field_r;
        this.field_t = param1;
    }

    static {
    }
}
