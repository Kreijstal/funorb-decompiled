/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends qm {
    private int field_q;
    private int field_p;
    private ll[] field_r;
    static char[] field_o;
    private int field_n;

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        if (param1 == -7592) {
          L0: {
            if (!((ea) param3).field_g) {
              if (param3.e(28660)) {
                L1: {
                  var6 = 1;
                  if (param3 instanceof mi) {
                    param0 = param0 & ((mi) param3).field_u;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (!param0) {
                    stackOut_41_0 = ((qb) this).field_n;
                    stackIn_42_0 = stackOut_41_0;
                    break L2;
                  } else {
                    if (var6 != 0) {
                      stackOut_40_0 = ((qb) this).field_p;
                      stackIn_42_0 = stackOut_40_0;
                      break L2;
                    } else {
                      stackOut_39_0 = ((qb) this).field_q;
                      stackIn_42_0 = stackOut_39_0;
                      break L2;
                    }
                  }
                }
                L3: {
                  var7 = stackIn_42_0;
                  kg.a(107, param2 + ((ea) param3).field_p, var7, (-((qb) this).field_r[0].field_q + ((ea) param3).field_n >> 2046785601) + ((ea) param3).field_h + param4, ((ea) param3).field_q, ((qb) this).field_r);
                  if (param0) {
                    stackOut_44_0 = 16777215;
                    stackIn_45_0 = stackOut_44_0;
                    break L3;
                  } else {
                    stackOut_43_0 = 7105644;
                    stackIn_45_0 = stackOut_43_0;
                    break L3;
                  }
                }
                var8 = stackIn_45_0;
                int discarded$4 = ((qb) this).field_i.a(((ea) param3).field_f, param2 + ((ea) param3).field_p, -2 + (((ea) param3).field_h + param4), ((ea) param3).field_q, ((ea) param3).field_n, var8, -1, 1, 1, ((qb) this).field_i.field_I);
                return;
              } else {
                stackOut_33_0 = 0;
                stackIn_47_0 = stackOut_33_0;
                break L0;
              }
            } else {
              stackOut_31_0 = 1;
              stackIn_47_0 = stackOut_31_0;
              break L0;
            }
          }
          L4: {
            var6 = stackIn_47_0;
            if (param3 instanceof mi) {
              param0 = param0 & ((mi) param3).field_u;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (!param0) {
              stackOut_54_0 = ((qb) this).field_n;
              stackIn_55_0 = stackOut_54_0;
              break L5;
            } else {
              if (var6 != 0) {
                stackOut_53_0 = ((qb) this).field_p;
                stackIn_55_0 = stackOut_53_0;
                break L5;
              } else {
                stackOut_52_0 = ((qb) this).field_q;
                stackIn_55_0 = stackOut_52_0;
                break L5;
              }
            }
          }
          L6: {
            var7 = stackIn_55_0;
            kg.a(107, param2 + ((ea) param3).field_p, var7, (-((qb) this).field_r[0].field_q + ((ea) param3).field_n >> 2046785601) + ((ea) param3).field_h + param4, ((ea) param3).field_q, ((qb) this).field_r);
            if (param0) {
              stackOut_57_0 = 16777215;
              stackIn_58_0 = stackOut_57_0;
              break L6;
            } else {
              stackOut_56_0 = 7105644;
              stackIn_58_0 = stackOut_56_0;
              break L6;
            }
          }
          var8 = stackIn_58_0;
          int discarded$5 = ((qb) this).field_i.a(((ea) param3).field_f, param2 + ((ea) param3).field_p, -2 + (((ea) param3).field_h + param4), ((ea) param3).field_q, ((ea) param3).field_n, var8, -1, 1, 1, ((qb) this).field_i.field_I);
          return;
        } else {
          field_o = (char[]) null;
          if (((ea) param3).field_g) {
            L7: {
              var6 = 1;
              if (param3 instanceof mi) {
                param0 = param0 & ((mi) param3).field_u;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (!param0) {
                stackOut_24_0 = ((qb) this).field_n;
                stackIn_25_0 = stackOut_24_0;
                break L8;
              } else {
                if (var6 != 0) {
                  stackOut_23_0 = ((qb) this).field_p;
                  stackIn_25_0 = stackOut_23_0;
                  break L8;
                } else {
                  stackOut_22_0 = ((qb) this).field_q;
                  stackIn_25_0 = stackOut_22_0;
                  break L8;
                }
              }
            }
            L9: {
              var7 = stackIn_25_0;
              kg.a(107, param2 + ((ea) param3).field_p, var7, (-((qb) this).field_r[0].field_q + ((ea) param3).field_n >> 2046785601) + ((ea) param3).field_h + param4, ((ea) param3).field_q, ((qb) this).field_r);
              if (param0) {
                stackOut_27_0 = 16777215;
                stackIn_28_0 = stackOut_27_0;
                break L9;
              } else {
                stackOut_26_0 = 7105644;
                stackIn_28_0 = stackOut_26_0;
                break L9;
              }
            }
            var8 = stackIn_28_0;
            int discarded$6 = ((qb) this).field_i.a(((ea) param3).field_f, param2 + ((ea) param3).field_p, -2 + (((ea) param3).field_h + param4), ((ea) param3).field_q, ((ea) param3).field_n, var8, -1, 1, 1, ((qb) this).field_i.field_I);
            return;
          } else {
            L10: {
              if (!param3.e(28660)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L10;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L10;
              }
            }
            L11: {
              var6 = stackIn_5_0;
              if (param3 instanceof mi) {
                param0 = param0 & ((mi) param3).field_u;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (!param0) {
                stackOut_12_0 = ((qb) this).field_n;
                stackIn_13_0 = stackOut_12_0;
                break L12;
              } else {
                if (var6 != 0) {
                  stackOut_11_0 = ((qb) this).field_p;
                  stackIn_13_0 = stackOut_11_0;
                  break L12;
                } else {
                  stackOut_10_0 = ((qb) this).field_q;
                  stackIn_13_0 = stackOut_10_0;
                  break L12;
                }
              }
            }
            L13: {
              var7 = stackIn_13_0;
              kg.a(107, param2 + ((ea) param3).field_p, var7, (-((qb) this).field_r[0].field_q + ((ea) param3).field_n >> 2046785601) + ((ea) param3).field_h + param4, ((ea) param3).field_q, ((qb) this).field_r);
              if (param0) {
                stackOut_15_0 = 16777215;
                stackIn_16_0 = stackOut_15_0;
                break L13;
              } else {
                stackOut_14_0 = 7105644;
                stackIn_16_0 = stackOut_14_0;
                break L13;
              }
            }
            var8 = stackIn_16_0;
            int discarded$7 = ((qb) this).field_i.a(((ea) param3).field_f, param2 + ((ea) param3).field_p, -2 + (((ea) param3).field_h + param4), ((ea) param3).field_q, ((ea) param3).field_n, var8, -1, 1, 1, ((qb) this).field_i.field_I);
            return;
          }
        }
    }

    public qb() {
        this(2188450, 2591221, 9543);
    }

    private qb(int param0, int param1, int param2) {
        ((qb) this).field_q = param0;
        ((qb) this).field_n = param2;
        ((qb) this).field_r = u.field_i;
        ((qb) this).field_p = param1;
        ((qb) this).field_i = b.field_c;
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_o = (char[]) null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new char[128];
    }
}
