/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends ek {
    private int field_q;
    private int field_s;
    private int field_p;
    private kc[] field_r;

    public ki() {
        this(2188450, 2591221, 9543);
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        if (param1 >= -86) {
          ki.a(118, (byte) 95, 42, -10);
          wg.field_a = param0;
          af.field_jb = param3;
          ca.field_b = param2;
          return;
        } else {
          wg.field_a = param0;
          af.field_jb = param3;
          ca.field_b = param2;
          return;
        }
    }

    public final void a(int param0, lk param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        lk var9 = null;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        L0: {
          if (!((lk) param1).field_j) {
            if (param1.d(121)) {
              L1: {
                var6 = 1;
                if (!(param1 instanceof hl)) {
                  break L1;
                } else {
                  param4 = param4 & ((hl) param1).field_B;
                  break L1;
                }
              }
              L2: {
                if (!param4) {
                  stackOut_10_0 = ((ki) this).field_s;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  if (var6 == 0) {
                    stackOut_9_0 = ((ki) this).field_p;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  } else {
                    stackOut_8_0 = ((ki) this).field_q;
                    stackIn_11_0 = stackOut_8_0;
                    break L2;
                  }
                }
              }
              var7 = stackIn_11_0;
              if (param2 == 11447) {
                L3: {
                  ge.a(((lk) param1).field_h, ((ki) this).field_r, var7, ((lk) param1).field_o + param0, (-((ki) this).field_r[0].field_k + ((lk) param1).field_q >> 728070049) + param3 + ((lk) param1).field_i, (byte) -10);
                  if (param4) {
                    stackOut_18_0 = 16777215;
                    stackIn_19_0 = stackOut_18_0;
                    break L3;
                  } else {
                    stackOut_17_0 = 7105644;
                    stackIn_19_0 = stackOut_17_0;
                    break L3;
                  }
                }
                var8 = stackIn_19_0;
                int discarded$4 = ((ki) this).field_c.a(((lk) param1).field_r, ((lk) param1).field_o + param0, -2 + (param3 - -((lk) param1).field_i), ((lk) param1).field_h, ((lk) param1).field_q, var8, -1, 1, 1, ((ki) this).field_c.field_s);
                return;
              } else {
                L4: {
                  var9 = (lk) null;
                  ((ki) this).a(103, (lk) null, -110, -12, false);
                  ge.a(((lk) param1).field_h, ((ki) this).field_r, var7, ((lk) param1).field_o + param0, (-((ki) this).field_r[0].field_k + ((lk) param1).field_q >> 728070049) + param3 + ((lk) param1).field_i, (byte) -10);
                  if (param4) {
                    stackOut_14_0 = 16777215;
                    stackIn_15_0 = stackOut_14_0;
                    break L4;
                  } else {
                    stackOut_13_0 = 7105644;
                    stackIn_15_0 = stackOut_13_0;
                    break L4;
                  }
                }
                var8 = stackIn_15_0;
                int discarded$5 = ((ki) this).field_c.a(((lk) param1).field_r, ((lk) param1).field_o + param0, -2 + (param3 - -((lk) param1).field_i), ((lk) param1).field_h, ((lk) param1).field_q, var8, -1, 1, 1, ((ki) this).field_c.field_s);
                return;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_21_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_21_0 = stackOut_1_0;
            break L0;
          }
        }
        L5: {
          var6 = stackIn_21_0;
          if (!(param1 instanceof hl)) {
            break L5;
          } else {
            param4 = param4 & ((hl) param1).field_B;
            break L5;
          }
        }
        L6: {
          if (!param4) {
            stackOut_27_0 = ((ki) this).field_s;
            stackIn_28_0 = stackOut_27_0;
            break L6;
          } else {
            if (var6 == 0) {
              stackOut_26_0 = ((ki) this).field_p;
              stackIn_28_0 = stackOut_26_0;
              break L6;
            } else {
              stackOut_25_0 = ((ki) this).field_q;
              stackIn_28_0 = stackOut_25_0;
              break L6;
            }
          }
        }
        var7 = stackIn_28_0;
        if (param2 != 11447) {
          L7: {
            var9 = (lk) null;
            ((ki) this).a(103, (lk) null, -110, -12, false);
            ge.a(((lk) param1).field_h, ((ki) this).field_r, var7, ((lk) param1).field_o + param0, (-((ki) this).field_r[0].field_k + ((lk) param1).field_q >> 728070049) + param3 + ((lk) param1).field_i, (byte) -10);
            if (param4) {
              stackOut_35_0 = 16777215;
              stackIn_36_0 = stackOut_35_0;
              break L7;
            } else {
              stackOut_34_0 = 7105644;
              stackIn_36_0 = stackOut_34_0;
              break L7;
            }
          }
          var8 = stackIn_36_0;
          int discarded$6 = ((ki) this).field_c.a(((lk) param1).field_r, ((lk) param1).field_o + param0, -2 + (param3 - -((lk) param1).field_i), ((lk) param1).field_h, ((lk) param1).field_q, var8, -1, 1, 1, ((ki) this).field_c.field_s);
          return;
        } else {
          L8: {
            ge.a(((lk) param1).field_h, ((ki) this).field_r, var7, ((lk) param1).field_o + param0, (-((ki) this).field_r[0].field_k + ((lk) param1).field_q >> 728070049) + param3 + ((lk) param1).field_i, (byte) -10);
            if (param4) {
              stackOut_31_0 = 16777215;
              stackIn_32_0 = stackOut_31_0;
              break L8;
            } else {
              stackOut_30_0 = 7105644;
              stackIn_32_0 = stackOut_30_0;
              break L8;
            }
          }
          var8 = stackIn_32_0;
          int discarded$7 = ((ki) this).field_c.a(((lk) param1).field_r, ((lk) param1).field_o + param0, -2 + (param3 - -((lk) param1).field_i), ((lk) param1).field_h, ((lk) param1).field_q, var8, -1, 1, 1, ((ki) this).field_c.field_s);
          return;
        }
    }

    private ki(int param0, int param1, int param2) {
        ((ki) this).field_s = param2;
        ((ki) this).field_p = param0;
        ((ki) this).field_c = vd.field_p;
        ((ki) this).field_q = param1;
        ((ki) this).field_r = eg.field_c;
    }

    static {
    }
}
