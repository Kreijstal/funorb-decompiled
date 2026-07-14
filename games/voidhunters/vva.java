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
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          var7 = 112 / ((param0 - -27) / 35);
          if (!param1.field_e) {
            if (param1.e((byte) -120)) {
              L1: {
                var6 = 1;
                if (param1 instanceof htb) {
                  param4 = param4 & ((htb) (Object) param1).field_x;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (!param4) {
                  stackOut_11_0 = ((vva) this).field_p;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  if (var6 != 0) {
                    stackOut_10_0 = ((vva) this).field_t;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = ((vva) this).field_s;
                    stackIn_12_0 = stackOut_9_0;
                    break L2;
                  }
                }
              }
              L3: {
                var8 = stackIn_12_0;
                qt.a(((vva) this).field_q, var8, param1.field_r + (param3 - -(-((vva) this).field_q[0].field_n + param1.field_f >> -656633055)), param1.field_h, param2 - -param1.field_g, true);
                if (!param4) {
                  stackOut_14_0 = 7105644;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  stackOut_13_0 = 16777215;
                  stackIn_15_0 = stackOut_13_0;
                  break L3;
                }
              }
              var9 = stackIn_15_0;
              int discarded$2 = ((vva) this).field_d.a(param1.field_j, param2 - -param1.field_g, param1.field_r + param3 - 2, param1.field_h, param1.field_f, var9, -1, 1, 1, ((vva) this).field_d.field_k);
              return;
            } else {
              stackOut_3_0 = 0;
              stackIn_17_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_17_0 = stackOut_1_0;
            break L0;
          }
        }
        L4: {
          var6 = stackIn_17_0;
          if (param1 instanceof htb) {
            param4 = param4 & ((htb) (Object) param1).field_x;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (!param4) {
            stackOut_24_0 = ((vva) this).field_p;
            stackIn_25_0 = stackOut_24_0;
            break L5;
          } else {
            if (var6 != 0) {
              stackOut_23_0 = ((vva) this).field_t;
              stackIn_25_0 = stackOut_23_0;
              break L5;
            } else {
              stackOut_22_0 = ((vva) this).field_s;
              stackIn_25_0 = stackOut_22_0;
              break L5;
            }
          }
        }
        L6: {
          var8 = stackIn_25_0;
          qt.a(((vva) this).field_q, var8, param1.field_r + (param3 - -(-((vva) this).field_q[0].field_n + param1.field_f >> -656633055)), param1.field_h, param2 - -param1.field_g, true);
          if (!param4) {
            stackOut_27_0 = 7105644;
            stackIn_28_0 = stackOut_27_0;
            break L6;
          } else {
            stackOut_26_0 = 16777215;
            stackIn_28_0 = stackOut_26_0;
            break L6;
          }
        }
        var9 = stackIn_28_0;
        int discarded$3 = ((vva) this).field_d.a(param1.field_j, param2 - -param1.field_g, param1.field_r + param3 - 2, param1.field_h, param1.field_f, var9, -1, 1, 1, ((vva) this).field_d.field_k);
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
        ((vva) this).field_s = param0;
        ((vva) this).field_q = eia.field_o;
        ((vva) this).field_p = param2;
        ((vva) this).field_d = vob.field_r;
        ((vva) this).field_t = param1;
    }

    static {
    }
}
