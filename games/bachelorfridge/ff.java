/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff extends gha {
    static ee field_u;
    private int field_x;
    private int field_v;
    private int field_w;
    private kv[] field_t;

    public static void c(int param0) {
        if (param0 != 16777215) {
            field_u = null;
            field_u = null;
            return;
        }
        field_u = null;
    }

    public final void a(int param0, wj param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          if (!param1.field_t) {
            if (param1.e(1023)) {
              L1: {
                var6 = 1;
                if (!(param1 instanceof hf)) {
                  break L1;
                } else {
                  param4 = param4 & ((hf) (Object) param1).field_z;
                  break L1;
                }
              }
              L2: {
                if (param4) {
                  if (var6 != 0) {
                    stackOut_10_0 = ((ff) this).field_v;
                    stackIn_11_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = ((ff) this).field_x;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  }
                } else {
                  stackOut_7_0 = ((ff) this).field_w;
                  stackIn_11_0 = stackOut_7_0;
                  break L2;
                }
              }
              L3: {
                var7 = stackIn_11_0;
                pj.a(param1.field_s + param0, var7, 447, param1.field_v + param3 - -(param1.field_q - ((ff) this).field_t[0].field_o >> 1402526785), param1.field_p, ((ff) this).field_t);
                if (param4) {
                  stackOut_13_0 = 16777215;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_12_0 = 7105644;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                }
              }
              var8 = stackIn_14_0;
              if (param2 != 32679) {
                ff.c(122);
                int discarded$4 = ((ff) this).field_l.a(param1.field_w, param1.field_s + param0, -2 + (param1.field_v + param3), param1.field_p, param1.field_q, var8, -1, 1, 1, ((ff) this).field_l.field_u);
                return;
              } else {
                int discarded$5 = ((ff) this).field_l.a(param1.field_w, param1.field_s + param0, -2 + (param1.field_v + param3), param1.field_p, param1.field_q, var8, -1, 1, 1, ((ff) this).field_l.field_u);
                return;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_18_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_18_0 = stackOut_1_0;
            break L0;
          }
        }
        L4: {
          var6 = stackIn_18_0;
          if (!(param1 instanceof hf)) {
            break L4;
          } else {
            param4 = param4 & ((hf) (Object) param1).field_z;
            break L4;
          }
        }
        L5: {
          if (param4) {
            if (var6 != 0) {
              stackOut_24_0 = ((ff) this).field_v;
              stackIn_25_0 = stackOut_24_0;
              break L5;
            } else {
              stackOut_23_0 = ((ff) this).field_x;
              stackIn_25_0 = stackOut_23_0;
              break L5;
            }
          } else {
            stackOut_21_0 = ((ff) this).field_w;
            stackIn_25_0 = stackOut_21_0;
            break L5;
          }
        }
        L6: {
          var7 = stackIn_25_0;
          pj.a(param1.field_s + param0, var7, 447, param1.field_v + param3 - -(param1.field_q - ((ff) this).field_t[0].field_o >> 1402526785), param1.field_p, ((ff) this).field_t);
          if (param4) {
            stackOut_27_0 = 16777215;
            stackIn_28_0 = stackOut_27_0;
            break L6;
          } else {
            stackOut_26_0 = 7105644;
            stackIn_28_0 = stackOut_26_0;
            break L6;
          }
        }
        var8 = stackIn_28_0;
        if (param2 != 32679) {
          ff.c(122);
          int discarded$6 = ((ff) this).field_l.a(param1.field_w, param1.field_s + param0, -2 + (param1.field_v + param3), param1.field_p, param1.field_q, var8, -1, 1, 1, ((ff) this).field_l.field_u);
          return;
        } else {
          int discarded$7 = ((ff) this).field_l.a(param1.field_w, param1.field_s + param0, -2 + (param1.field_v + param3), param1.field_p, param1.field_q, var8, -1, 1, 1, ((ff) this).field_l.field_u);
          return;
        }
    }

    private ff(int param0, int param1, int param2) {
        ((ff) this).field_w = param2;
        ((ff) this).field_x = param0;
        ((ff) this).field_v = param1;
        ((ff) this).field_l = qia.field_a;
        ((ff) this).field_t = sl.field_k;
    }

    public ff() {
        this(2188450, 2591221, 9543);
    }

    static {
    }
}
